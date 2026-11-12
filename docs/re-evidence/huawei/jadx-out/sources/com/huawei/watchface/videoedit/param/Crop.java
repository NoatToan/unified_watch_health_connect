package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes45.dex */
public class Crop {

    @SerializedName("lower_left_x")
    @Expose
    private int lowerLeftX;

    @SerializedName("lower_left_y")
    @Expose
    private int lowerLeftY;

    @SerializedName("lower_right_x")
    @Expose
    private int lowerRightX;

    @SerializedName("lower_right_y")
    @Expose
    private int lowerRightY;

    @SerializedName("upper_left_x")
    @Expose
    private int upperLeftX;

    @SerializedName("upper_left_y")
    @Expose
    private int upperLeftY;

    @SerializedName("upper_right_x")
    @Expose
    private int upperRightX;

    @SerializedName("upper_right_y")
    @Expose
    private int upperRightY;

    public int getLowerLeftX() {
        return this.lowerLeftX;
    }

    public int getLowerLeftY() {
        return this.lowerLeftY;
    }

    public int getLowerRightX() {
        return this.lowerRightX;
    }

    public int getLowerRightY() {
        return this.lowerRightY;
    }

    public int getUpperLeftX() {
        return this.upperLeftX;
    }

    public int getUpperLeftY() {
        return this.upperLeftY;
    }

    public int getUpperRightX() {
        return this.upperRightX;
    }

    public int getUpperRightY() {
        return this.upperRightY;
    }

    public void setLowerLeftX(int i) {
        this.lowerLeftX = i;
    }

    public void setLowerLeftY(int i) {
        this.lowerLeftY = i;
    }

    public void setLowerRightX(int i) {
        this.lowerRightX = i;
    }

    public void setLowerRightY(int i) {
        this.lowerRightY = i;
    }

    public void setUpperLeftX(int i) {
        this.upperLeftX = i;
    }

    public void setUpperLeftY(int i) {
        this.upperLeftY = i;
    }

    public void setUpperRightX(int i) {
        this.upperRightX = i;
    }

    public void setUpperRightY(int i) {
        this.upperRightY = i;
    }

    public Crop withLowerLeftX(int i) {
        this.lowerLeftX = i;
        return this;
    }

    public Crop withLowerLeftY(int i) {
        this.lowerLeftY = i;
        return this;
    }

    public Crop withLowerRightX(int i) {
        this.lowerRightX = i;
        return this;
    }

    public Crop withLowerRightY(int i) {
        this.lowerRightY = i;
        return this;
    }

    public Crop withUpperLeftX(int i) {
        this.upperLeftX = i;
        return this;
    }

    public Crop withUpperLeftY(int i) {
        this.upperLeftY = i;
        return this;
    }

    public Crop withUpperRightX(int i) {
        this.upperRightX = i;
        return this;
    }

    public Crop withUpperRightY(int i) {
        this.upperRightY = i;
        return this;
    }
}
