package com.yalantis.ucrop.model;

/* JADX INFO: loaded from: classes3.dex */
public class ExifInfo {
    private int mExifDegrees;
    private int mExifOrientation;
    private int mExifTranslation;

    public ExifInfo(int i14, int i15, int i16) {
        this.mExifOrientation = i14;
        this.mExifDegrees = i15;
        this.mExifTranslation = i16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ExifInfo exifInfo = (ExifInfo) obj;
            if (this.mExifOrientation == exifInfo.mExifOrientation && this.mExifDegrees == exifInfo.mExifDegrees && this.mExifTranslation == exifInfo.mExifTranslation) {
                return true;
            }
        }
        return false;
    }

    public int getExifDegrees() {
        return this.mExifDegrees;
    }

    public int getExifOrientation() {
        return this.mExifOrientation;
    }

    public int getExifTranslation() {
        return this.mExifTranslation;
    }

    public int hashCode() {
        return (((this.mExifOrientation * 31) + this.mExifDegrees) * 31) + this.mExifTranslation;
    }

    public void setExifDegrees(int i14) {
        this.mExifDegrees = i14;
    }

    public void setExifOrientation(int i14) {
        this.mExifOrientation = i14;
    }

    public void setExifTranslation(int i14) {
        this.mExifTranslation = i14;
    }
}
