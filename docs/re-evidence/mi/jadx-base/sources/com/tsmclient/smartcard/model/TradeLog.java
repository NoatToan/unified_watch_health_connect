package com.tsmclient.smartcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.tsmclient.smartcard.CardConstants;

/* JADX INFO: loaded from: classes6.dex */
public class TradeLog implements Parcelable, Comparable<TradeLog> {
    public static final Parcelable.Creator<TradeLog> CREATOR = new Parcelable.Creator<TradeLog>() { // from class: com.tsmclient.smartcard.model.TradeLog.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TradeLog createFromParcel(Parcel parcel) {
            TradeLog tradeLog = new TradeLog();
            tradeLog.setTradeDate(parcel.readString());
            tradeLog.setTradeTime(parcel.readString());
            tradeLog.setAuAmount(parcel.readFloat());
            tradeLog.setCountryCode(parcel.readString());
            tradeLog.setCurCode(parcel.readInt());
            tradeLog.setBusinessName(parcel.readString());
            tradeLog.setTradeType(parcel.readInt());
            tradeLog.setAtc(parcel.readString());
            tradeLog.setTradeID(parcel.readInt());
            tradeLog.setTerminalNo(parcel.readString());
            tradeLog.setTrafficType(parcel.readString());
            tradeLog.setStartToEndStation(parcel.readString());
            tradeLog.setConsumptionType(parcel.readString());
            return tradeLog;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TradeLog[] newArray(int i) {
            return new TradeLog[i];
        }
    };

    @SerializedName(CardConstants.ATC)
    private String mAtc;

    @SerializedName("auAmount")
    private float mAuAmount;

    @SerializedName("businessName")
    private String mBusinessName;
    private String mConsumptionType;

    @SerializedName("countryCode")
    private String mCountryCode;

    @SerializedName("curCode")
    private int mCurCode;
    private String mStartToEndStation;

    @SerializedName("terminalNo")
    private String mTerminalNo;

    @SerializedName("tradeDate")
    private String mTradeDate;

    @SerializedName("tradeID")
    private int mTradeID;

    @SerializedName("tradeTime")
    private String mTradeTime;

    @SerializedName("tradeType")
    private int mTradeType;
    private String mTrafficType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAtc() {
        return this.mAtc;
    }

    public float getAuAmount() {
        return this.mAuAmount;
    }

    public String getBusinessName() {
        return this.mBusinessName;
    }

    public String getConsumptionType() {
        return this.mConsumptionType;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public int getCurCode() {
        return this.mCurCode;
    }

    public String getStartToEndStation() {
        return this.mStartToEndStation;
    }

    public String getTerminalNo() {
        return this.mTerminalNo;
    }

    public String getTradeDate() {
        return this.mTradeDate;
    }

    public int getTradeID() {
        return this.mTradeID;
    }

    public String getTradeTime() {
        return this.mTradeTime;
    }

    public int getTradeType() {
        return this.mTradeType;
    }

    public String getTrafficType() {
        return this.mTrafficType;
    }

    public void setAtc(String str) {
        this.mAtc = str;
    }

    public void setAuAmount(float f) {
        this.mAuAmount = f;
    }

    public void setBusinessName(String str) {
        this.mBusinessName = str;
    }

    public void setConsumptionType(String str) {
        this.mConsumptionType = str;
    }

    public void setCountryCode(String str) {
        this.mCountryCode = str;
    }

    public void setCurCode(int i) {
        this.mCurCode = i;
    }

    public void setStartToEndStation(String str) {
        this.mStartToEndStation = str;
    }

    public void setTerminalNo(String str) {
        this.mTerminalNo = str;
    }

    public void setTradeDate(String str) {
        this.mTradeDate = str;
    }

    public void setTradeID(int i) {
        this.mTradeID = i;
    }

    public void setTradeTime(String str) {
        this.mTradeTime = str;
    }

    public void setTradeType(int i) {
        this.mTradeType = i;
    }

    public void setTrafficType(String str) {
        this.mTrafficType = str;
    }

    public String toString() {
        return "\nTrade Date :" + getTradeDate() + "\nTrade Time :" + getTradeTime() + "\nAuAmount :" + getAuAmount() + "\nCountry Code :" + getCountryCode() + "\nCurrency code :" + getCurCode() + "\nBusiness Name :" + getBusinessName() + "\nTrade type :" + getTradeType() + "\nAtc :" + getAtc() + "\nTrade ID :" + getTradeID() + "\nStartToEndStation :" + getStartToEndStation() + "\nTerminal No :" + getTerminalNo();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTradeDate);
        parcel.writeString(this.mTradeTime);
        parcel.writeFloat(this.mAuAmount);
        parcel.writeString(this.mCountryCode);
        parcel.writeInt(this.mCurCode);
        parcel.writeString(this.mBusinessName);
        parcel.writeInt(this.mTradeType);
        parcel.writeString(this.mAtc);
        parcel.writeInt(this.mTradeID);
        parcel.writeString(this.mTerminalNo);
        parcel.writeString(this.mTrafficType);
        parcel.writeString(this.mStartToEndStation);
        parcel.writeString(this.mConsumptionType);
    }

    @Override // java.lang.Comparable
    public int compareTo(TradeLog tradeLog) {
        long j = Long.parseLong(getTradeDate() + getTradeTime()) - Long.parseLong(tradeLog.getTradeDate() + tradeLog.getTradeTime());
        if (j > 0) {
            return -1;
        }
        return j < 0 ? 1 : 0;
    }
}
