package com.huawei.watchface.mvp.model.datatype.querysubinfodetail;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes20.dex */
public class QuerySubInfoDetailResp implements Parcelable {
    public static final Parcelable.Creator<QuerySubInfoDetailResp> CREATOR = new Parcelable.Creator<QuerySubInfoDetailResp>() { // from class: com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuerySubInfoDetailResp createFromParcel(Parcel parcel) {
            return new QuerySubInfoDetailResp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuerySubInfoDetailResp[] newArray(int i) {
            return new QuerySubInfoDetailResp[i];
        }
    };
    private int expiredReminder;
    private String hadRenewVip;
    private String isRecycling;
    private String isYoung;
    private String memberStatus;
    private RenewInfo renewInfo;
    private String resultcode;
    private String resultinfo;
    private SubInfo subInfo;

    public QuerySubInfoDetailResp(Parcel parcel) {
        this.isRecycling = parcel.readString();
        this.hadRenewVip = parcel.readString();
        this.expiredReminder = parcel.readInt();
        this.subInfo = (SubInfo) new Gson().fromJson(parcel.readString(), SubInfo.class);
        this.resultinfo = parcel.readString();
        this.isYoung = parcel.readString();
        this.memberStatus = parcel.readString();
        this.resultcode = parcel.readString();
        this.renewInfo = (RenewInfo) new Gson().fromJson(parcel.readString(), RenewInfo.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getExpiredReminder() {
        return this.expiredReminder;
    }

    public String getHadRenewVip() {
        return this.hadRenewVip;
    }

    public String getIsRecycling() {
        return this.isRecycling;
    }

    public String getIsYoung() {
        return this.isYoung;
    }

    public String getMemberStatus() {
        return this.memberStatus;
    }

    public RenewInfo getRenewInfo() {
        return this.renewInfo;
    }

    public String getResultcode() {
        return this.resultcode;
    }

    public String getResultinfo() {
        return this.resultinfo;
    }

    public SubInfo getSubInfo() {
        return this.subInfo;
    }

    public void setExpiredReminder(int i) {
        this.expiredReminder = i;
    }

    public void setHadRenewVip(String str) {
        this.hadRenewVip = str;
    }

    public void setIsRecycling(String str) {
        this.isRecycling = str;
    }

    public void setIsYoung(String str) {
        this.isYoung = str;
    }

    public void setMemberStatus(String str) {
        this.memberStatus = str;
    }

    public void setRenewInfo(RenewInfo renewInfo) {
        this.renewInfo = renewInfo;
    }

    public void setResultcode(String str) {
        this.resultcode = str;
    }

    public void setResultinfo(String str) {
        this.resultinfo = str;
    }

    public void setSubInfo(SubInfo subInfo) {
        this.subInfo = subInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.isRecycling);
        parcel.writeString(this.hadRenewVip);
        parcel.writeInt(this.expiredReminder);
        parcel.writeParcelable(this.subInfo, i);
        parcel.writeString(this.resultinfo);
        parcel.writeString(this.isYoung);
        parcel.writeString(this.memberStatus);
        parcel.writeString(this.resultcode);
        parcel.writeParcelable(this.renewInfo, i);
    }
}
