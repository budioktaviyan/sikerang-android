package com.baculsoft.mdk.mobile.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Budi Oktaviyan Suryanto (budioktaviyans@gmail.com)
 */
public class ClientResponse implements Parcelable {
    public static final Parcelable.Creator<ClientResponse> CREATOR = new Parcelable.Creator<ClientResponse>() {
        public ClientResponse createFromParcel(Parcel in) {
            return new ClientResponse(in);
        }

        public ClientResponse[] newArray(int size) {
            return new ClientResponse[size];
        }
    };

    public static final int STATUS_OK = 1;
    public static final int STATUS_FAIL = 0;

    private int statusCode;

    public ClientResponse() {
        super();
    }

    public ClientResponse(Parcel in) {
        statusCode = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(statusCode);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int pStatusCode) {
        statusCode = pStatusCode;
    }
}