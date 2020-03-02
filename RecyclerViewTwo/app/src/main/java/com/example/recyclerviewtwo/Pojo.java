package com.example.recyclerviewtwo;

public class Pojo {
    private int mImageResource;
    private  String mDish,mtype,mRating,mPrice,mOffers;

    public Pojo(int mImageResource, String mDish, String mtype, String mRating, String mPrice, String mOffers) {
        this.mImageResource = mImageResource;
        this.mDish = mDish;
        this.mtype = mtype;
        this.mRating = mRating;
        this.mPrice = mPrice;
        this.mOffers = mOffers;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmDish() {
        return mDish;
    }

    public String getMtype() {
        return mtype;
    }

    public String getmRating() {
        return mRating;
    }

    public String getmPrice() {
        return mPrice;
    }

    public String getmOffers() {
        return mOffers;
    }
}
