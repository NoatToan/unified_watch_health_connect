package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes45.dex */
public class Canvases {

    @SerializedName("album_image")
    @Expose
    private String albumImage;

    @SerializedName("blur")
    @Expose
    private int blur;

    @SerializedName("color")
    @Expose
    private String color;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("image_id")
    @Expose
    private String imageId;

    @SerializedName("image_name")
    @Expose
    private String imageName;

    @SerializedName("platform")
    @Expose
    private String platform;

    @SerializedName("type")
    @Expose
    private String type;

    public String getAlbumImage() {
        return this.albumImage;
    }

    public int getBlur() {
        return this.blur;
    }

    public String getColor() {
        return this.color;
    }

    public String getId() {
        return this.id;
    }

    public String getImage() {
        return this.image;
    }

    public String getImageId() {
        return this.imageId;
    }

    public String getImageName() {
        return this.imageName;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getType() {
        return this.type;
    }

    public void setAlbumImage(String str) {
        this.albumImage = str;
    }

    public void setBlur(int i) {
        this.blur = i;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setImageId(String str) {
        this.imageId = str;
    }

    public void setImageName(String str) {
        this.imageName = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Canvases withAlbumImage(String str) {
        this.albumImage = str;
        return this;
    }

    public Canvases withBlur(int i) {
        this.blur = i;
        return this;
    }

    public Canvases withColor(String str) {
        this.color = str;
        return this;
    }

    public Canvases withId(String str) {
        this.id = str;
        return this;
    }

    public Canvases withImage(String str) {
        this.image = str;
        return this;
    }

    public Canvases withImageId(String str) {
        this.imageId = str;
        return this;
    }

    public Canvases withImageName(String str) {
        this.imageName = str;
        return this;
    }

    public Canvases withPlatform(String str) {
        this.platform = str;
        return this;
    }

    public Canvases withType(String str) {
        this.type = str;
        return this;
    }
}
