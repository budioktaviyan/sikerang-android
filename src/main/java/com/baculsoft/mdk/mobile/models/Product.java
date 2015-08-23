package com.baculsoft.mdk.mobile.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Budi Oktaviyan Suryanto (budioktaviyans@gmail.com)
 */
public class Product implements Parcelable {
    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() {
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    private String latitude;
    private String longitude;
    private String screenName;
    private String productName;
    private boolean likes;

    public Product() {
        super();
    }

    public Product(Parcel in) {
        latitude = in.readString();
        longitude = in.readString();
        screenName = in.readString();
        productName = in.readString();
        likes = in.readByte() != 0;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(latitude);
        dest.writeString(longitude);
        dest.writeString(screenName);
        dest.writeString(productName);
        dest.writeByte((byte) (likes ? 1 : 0));
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String pLatitude) {
        latitude = pLatitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String pLongitude) {
        longitude = pLongitude;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String pScreenName) {
        screenName = pScreenName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String pProductName) {
        productName = pProductName;
    }

    public boolean isLikes() {
        return likes;
    }

    public void setLikes(boolean pLikes) {
        likes = pLikes;
    }
}