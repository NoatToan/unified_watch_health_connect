package com.huawei.hwcommonmodel.datatypes;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lst;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class DataPromptData implements Parcelable {
    public static final Parcelable.Creator<DataPromptData> CREATOR = new Parcelable.Creator<DataPromptData>() { // from class: com.huawei.hwcommonmodel.datatypes.DataPromptData.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataPromptData createFromParcel(Parcel parcel) {
            return new DataPromptData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataPromptData[] newArray(int i) {
            return new DataPromptData[i];
        }
    };
    private int mDotMatrixColor;
    private byte[] mDotMatrixDataInfos;
    private int mDotMatrixHeight;
    private int mDotMatrixWidth;
    private int mMotorEnable;
    private int mPromptType;
    private String mTextContent;
    private int mTextFormat;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DataPromptData() {
    }

    protected DataPromptData(Parcel parcel) {
        this.mPromptType = parcel.readInt();
        this.mMotorEnable = parcel.readInt();
        this.mDotMatrixHeight = parcel.readInt();
        this.mDotMatrixWidth = parcel.readInt();
        this.mDotMatrixColor = parcel.readInt();
        this.mDotMatrixDataInfos = parcel.createByteArray();
        this.mTextFormat = parcel.readInt();
        this.mTextContent = parcel.readString();
    }

    public int getPromptType() {
        return ((Integer) lst.d(Integer.valueOf(this.mPromptType))).intValue();
    }

    public void setPromptType(int i) {
        this.mPromptType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getMotorEnable() {
        return ((Integer) lst.d(Integer.valueOf(this.mMotorEnable))).intValue();
    }

    public void setMotorEnable(int i) {
        this.mMotorEnable = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDotMatrixHeight() {
        return ((Integer) lst.d(Integer.valueOf(this.mDotMatrixHeight))).intValue();
    }

    public void setDotMatrixHeight(int i) {
        this.mDotMatrixHeight = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDotMatrixWidth() {
        return ((Integer) lst.d(Integer.valueOf(this.mDotMatrixWidth))).intValue();
    }

    public void setDotMatrixWidth(int i) {
        this.mDotMatrixWidth = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public byte[] getDotMatrixData() {
        byte[] bArr = this.mDotMatrixDataInfos;
        if (bArr != null) {
            return (byte[]) lst.d(Arrays.copyOf(bArr, bArr.length));
        }
        return null;
    }

    public void setDotMatrixData(byte[] bArr) {
        if (bArr != null) {
            this.mDotMatrixDataInfos = (byte[]) lst.d(Arrays.copyOf(bArr, bArr.length));
        }
    }

    public String getTextContent() {
        return (String) lst.d(this.mTextContent);
    }

    public int getTextFormat() {
        return ((Integer) lst.d(Integer.valueOf(this.mTextFormat))).intValue();
    }

    public void setTextContent(String str) {
        this.mTextContent = (String) lst.d(str);
    }

    public void setTextFormat(int i) {
        this.mTextFormat = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDotMatrixColor() {
        return ((Integer) lst.d(Integer.valueOf(this.mDotMatrixColor))).intValue();
    }

    public void setDotMatrixColor(int i) {
        this.mDotMatrixColor = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mPromptType);
        parcel.writeInt(this.mMotorEnable);
        parcel.writeInt(this.mDotMatrixHeight);
        parcel.writeInt(this.mDotMatrixWidth);
        parcel.writeInt(this.mDotMatrixColor);
        parcel.writeByteArray(this.mDotMatrixDataInfos);
        parcel.writeInt(this.mTextFormat);
        parcel.writeString(this.mTextContent);
    }
}
