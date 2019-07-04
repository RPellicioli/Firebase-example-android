package com.example.picloud;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mKey;

    private String mName;

    private String mImageUrl;

    private String mLocation;

    private Boolean mStatus;

    public Upload(){

    }

    public Upload(String name, String imageUrl, String location){
        if(name.trim().equals("")){
            name = "Sem título";
        }

        mName = name;
        mImageUrl = imageUrl;
        mLocation = location;
        mStatus = true;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String mKey) {
        this.mKey = mKey;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public Boolean getStatus() {
        return mStatus;
    }

    public void setStatus(Boolean mStatus) {
        this.mStatus = mStatus;
    }
}
