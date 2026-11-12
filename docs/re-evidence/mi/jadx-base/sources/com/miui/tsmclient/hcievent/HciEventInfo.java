package com.miui.tsmclient.hcievent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.util.StringUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class HciEventInfo implements Parcelable {
    public static final Parcelable.Creator<HciEventInfo> CREATOR = new Parcelable.Creator<HciEventInfo>() { // from class: com.miui.tsmclient.hcievent.HciEventInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HciEventInfo createFromParcel(Parcel parcel) {
            return new HciEventInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HciEventInfo[] newArray(int i) {
            return new HciEventInfo[i];
        }
    };
    public static final int DCEP_STATUS_END = 1;
    public static final int DCEP_STATUS_START = 0;
    public static final String KEY_SUB_DESC = "sub_desc";
    public static final int TICKET_STATION_STATUS_IN = 0;
    public static final int TICKET_STATION_STATUS_OUT = 1;
    public static final int TICKET_STATION_STATUS_REFUSED = 2;
    public static final int TICKET_STATION_STATUS_UNKNOWN = -1;
    public String mAid;
    public int mBalance;
    private String mData;
    private String mDescription;
    private transient Bundle mExtra;
    public HciEventType mHciEventType;
    private String mHeadAid;
    private boolean mIsTradeSuccess;
    public int mStatus;
    private String mTerminalNo;
    public int mTradeAmount;
    public long mTradeTime;

    public enum HciEventType {
        Bank,
        Ticket,
        TransCard,
        CpuCardActivated,
        QRPay,
        NonTransaction,
        DCEP;

        public static HciEventType getHciEventType(String str) {
            for (HciEventType hciEventType : values()) {
                if (hciEventType.name().equals(str)) {
                    return hciEventType;
                }
            }
            return NonTransaction;
        }
    }

    public HciEventInfo(Parcel parcel) {
        this.mIsTradeSuccess = true;
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getData() {
        return this.mData;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public Bundle getExtra() {
        Bundle bundle = this.mExtra;
        return bundle == null ? new Bundle() : bundle;
    }

    public String getFormatTradeAmount() {
        return StringUtils.formatAmount(this.mTradeAmount);
    }

    public String getHeadAid() {
        return TextUtils.isEmpty(this.mHeadAid) ? this.mAid : this.mHeadAid;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getTerminalNo() {
        return this.mTerminalNo;
    }

    public boolean isTradeAmountValid() {
        int i = this.mTradeAmount;
        return i >= -10000 && i <= 100000;
    }

    public boolean isTradeSuccess() {
        return this.mIsTradeSuccess;
    }

    public void readFromParcel(Parcel parcel) {
        this.mAid = parcel.readString();
        this.mTradeTime = parcel.readLong();
        this.mTradeAmount = parcel.readInt();
        this.mBalance = parcel.readInt();
        this.mHciEventType = (HciEventType) parcel.readValue(HciEventType.class.getClassLoader());
        this.mStatus = parcel.readInt();
        this.mIsTradeSuccess = parcel.readInt() == 1;
        this.mTerminalNo = parcel.readString();
        this.mHeadAid = parcel.readString();
        this.mData = parcel.readString();
        this.mExtra = parcel.readBundle(getClass().getClassLoader());
        this.mDescription = parcel.readString();
    }

    public void setData(String str) {
        this.mData = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setExtra(Bundle bundle) {
        this.mExtra = bundle;
    }

    public void setHeadAid(String str) {
        this.mHeadAid = str;
    }

    public void setTerminalNo(String str) {
        this.mTerminalNo = str;
    }

    public void setTradeState(boolean z) {
        this.mIsTradeSuccess = z;
    }

    public String toString() {
        return "HciEventInfo{mAid='" + this.mAid + "', mTradeTime=" + this.mTradeTime + ", mTradeAmount=" + this.mTradeAmount + ", mBalance=" + this.mBalance + ", mHciEventType=" + this.mHciEventType + ", mStatus=" + this.mStatus + ", mTerminalNo='" + this.mTerminalNo + "', mIsTradeSuccess=" + this.mIsTradeSuccess + ", mDescription='" + this.mDescription + "', mHeadAid='" + this.mHeadAid + "', mData='" + this.mData + "', mExtra=" + this.mExtra + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAid);
        parcel.writeLong(this.mTradeTime);
        parcel.writeInt(this.mTradeAmount);
        parcel.writeInt(this.mBalance);
        parcel.writeValue(this.mHciEventType);
        parcel.writeInt(this.mStatus);
        parcel.writeInt(this.mIsTradeSuccess ? 1 : 0);
        parcel.writeString(this.mTerminalNo);
        parcel.writeString(this.mHeadAid);
        parcel.writeString(this.mData);
        parcel.writeBundle(this.mExtra);
        parcel.writeString(this.mDescription);
    }

    public HciEventInfo(String str, long j, int i) {
        this.mIsTradeSuccess = true;
        this.mAid = str;
        this.mTradeTime = j;
        this.mStatus = i;
        this.mHciEventType = HciEventType.Ticket;
    }

    public HciEventInfo(String str, long j, int i, int i2, boolean z) {
        this.mIsTradeSuccess = true;
        this.mAid = str;
        this.mTradeTime = j;
        this.mTradeAmount = i;
        this.mBalance = i2;
        this.mHciEventType = z ? HciEventType.Bank : HciEventType.TransCard;
    }

    public HciEventInfo(String str, long j, int i, boolean z) {
        this(str, j, i, 0, z);
    }

    public HciEventInfo(String str, long j, boolean z) {
        this(str, j, 0, z);
    }

    public HciEventInfo(String str, HciEventType hciEventType) {
        this.mIsTradeSuccess = true;
        this.mAid = str;
        this.mHciEventType = hciEventType;
    }
}
