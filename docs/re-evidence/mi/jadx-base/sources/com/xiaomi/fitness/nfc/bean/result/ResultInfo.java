package com.xiaomi.fitness.nfc.bean.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ResultInfo implements Parcelable {
    public static final Parcelable.Creator<ResultInfo> CREATOR = new Parcelable.Creator<ResultInfo>() { // from class: com.xiaomi.fitness.nfc.bean.result.ResultInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultInfo createFromParcel(Parcel parcel) {
            return new ResultInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultInfo[] newArray(int i) {
            return new ResultInfo[i];
        }
    };
    private int mBtnResLayoutId;
    private int mContentColorRes;
    private String mContentDetail;
    private int mContentStrRes;
    private int mOpBtnTextStrRes;
    private String mOpStateClazz;
    private int mOpTextStrRes;
    private int mResultIconRes;
    private String mTitle;

    public static class Builder {
        int mBtnResLayoutId;
        int mContentColorRes;
        String mContentDetail;
        int mContentStrRes;
        int mOpBtnTextStrRes;
        String mOpStateClazz;
        int mOpTextStrRes = -1;
        int mResultIconRes;
        String mTitle;

        public Builder(String str) {
            this.mOpStateClazz = str;
        }

        public ResultInfo build() {
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.mResultIconRes = this.mResultIconRes;
            resultInfo.mContentStrRes = this.mContentStrRes;
            resultInfo.mContentColorRes = this.mContentColorRes;
            resultInfo.mContentDetail = this.mContentDetail;
            resultInfo.mOpTextStrRes = this.mOpTextStrRes;
            resultInfo.mOpBtnTextStrRes = this.mOpBtnTextStrRes;
            resultInfo.mOpStateClazz = this.mOpStateClazz;
            resultInfo.mTitle = this.mTitle;
            resultInfo.mBtnResLayoutId = this.mBtnResLayoutId;
            return resultInfo;
        }

        public Builder setBtnResLayoutId(int i) {
            this.mBtnResLayoutId = i;
            return this;
        }

        public Builder setContentColorRes(int i) {
            this.mContentColorRes = i;
            return this;
        }

        public Builder setContentDetail(String str) {
            this.mContentDetail = str;
            return this;
        }

        public Builder setContentStrRes(int i) {
            this.mContentStrRes = i;
            return this;
        }

        public Builder setOpBtnTextStrRes(int i) {
            this.mOpBtnTextStrRes = i;
            return this;
        }

        public Builder setOpTextStrRes(int i) {
            this.mOpTextStrRes = i;
            return this;
        }

        public Builder setResultIconRes(int i) {
            this.mResultIconRes = i;
            return this;
        }

        public Builder setTitle(String str) {
            this.mTitle = str;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBtnResLayoutId() {
        return this.mBtnResLayoutId;
    }

    public int getContentColorRes() {
        return this.mContentColorRes;
    }

    public String getContentDetail() {
        return this.mContentDetail;
    }

    public int getContentStrRes() {
        return this.mContentStrRes;
    }

    public int getOpBtnTextStrRes() {
        return this.mOpBtnTextStrRes;
    }

    public String getOpStateClazz() {
        return this.mOpStateClazz;
    }

    public int getOpTextStrRes() {
        return this.mOpTextStrRes;
    }

    public int getResultIconRes() {
        return this.mResultIconRes;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isOpTextExist() {
        return this.mOpTextStrRes != -1;
    }

    public String toString() {
        return "ResultInfo{mResultIconRes=" + this.mResultIconRes + ", mContentStrRes=" + this.mContentStrRes + ", mContentColorRes=" + this.mContentColorRes + ", mContentDetail='" + this.mContentDetail + "', mOpTextStrRes=" + this.mOpTextStrRes + ", mOpBtnTextStrRes=" + this.mOpBtnTextStrRes + ", mOpStateClazz='" + this.mOpStateClazz + "', mTitle='" + this.mTitle + "', mBtnResLayoutId=" + this.mBtnResLayoutId + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mResultIconRes);
        parcel.writeInt(this.mContentStrRes);
        parcel.writeInt(this.mContentColorRes);
        parcel.writeString(this.mContentDetail);
        parcel.writeInt(this.mOpTextStrRes);
        parcel.writeInt(this.mOpBtnTextStrRes);
        parcel.writeString(this.mOpStateClazz);
        parcel.writeString(this.mTitle);
        parcel.writeInt(this.mBtnResLayoutId);
    }

    private ResultInfo() {
    }

    private ResultInfo(Parcel parcel) {
        this.mResultIconRes = parcel.readInt();
        this.mContentStrRes = parcel.readInt();
        this.mContentColorRes = parcel.readInt();
        this.mContentDetail = parcel.readString();
        this.mOpTextStrRes = parcel.readInt();
        this.mOpBtnTextStrRes = parcel.readInt();
        this.mOpStateClazz = parcel.readString();
        this.mTitle = parcel.readString();
        this.mBtnResLayoutId = parcel.readInt();
    }
}
