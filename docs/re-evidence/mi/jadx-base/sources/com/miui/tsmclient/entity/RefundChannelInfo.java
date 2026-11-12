package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RefundChannelInfo implements Parcelable {
    private static final String CHANNEL_NAME_ALIPAY = "ALIPAY";
    public static final Parcelable.Creator<RefundChannelInfo> CREATOR = new Parcelable.Creator<RefundChannelInfo>() { // from class: com.miui.tsmclient.entity.RefundChannelInfo.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RefundChannelInfo createFromParcel(Parcel parcel) {
            return new RefundChannelInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RefundChannelInfo[] newArray(int i) {
            return new RefundChannelInfo[i];
        }
    };

    @SerializedName("desc")
    private String mDesc;

    @SerializedName("icon")
    private String mIcon;

    @SerializedName("mode")
    private String mMode;

    @SerializedName("name")
    private String mName;

    @SerializedName("packageAndroid")
    private String mPackageAndroid;

    @SerializedName("packageIOS")
    private String mPackageIOS;

    public enum ReturnFeeMode {
        NONE("NONE", 2),
        AUTH("AUTH", 1),
        ACCOUNT("ACCOUNT", 0);

        private String mMode;
        private int mPriority;

        ReturnFeeMode(String str, int i) {
            this.mMode = str;
            this.mPriority = i;
        }

        public static ReturnFeeMode get(String str) {
            for (ReturnFeeMode returnFeeMode : values()) {
                if (returnFeeMode.mMode.equals(str)) {
                    return returnFeeMode;
                }
            }
            return ACCOUNT;
        }

        public int getPriority() {
            return this.mPriority;
        }
    }

    public RefundChannelInfo(Parcel parcel) {
        this.mMode = parcel.readString();
        this.mName = parcel.readString();
        this.mIcon = parcel.readString();
        this.mDesc = parcel.readString();
        this.mPackageAndroid = parcel.readString();
        this.mPackageIOS = parcel.readString();
    }

    public static List<RefundChannelInfo> fromJson(String str) {
        return (List) new Gson().fromJson(str, new TypeToken<List<RefundChannelInfo>>() { // from class: com.miui.tsmclient.entity.RefundChannelInfo.1
        }.getType());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChannelName() {
        return this.mName;
    }

    public String getDesc() {
        return this.mDesc;
    }

    public String getIcon() {
        return this.mIcon;
    }

    public ReturnFeeMode getMode() {
        return ReturnFeeMode.get(this.mMode);
    }

    public String getPackageAndroid() {
        return this.mPackageAndroid;
    }

    public boolean isAccountMode() {
        return getMode() == ReturnFeeMode.ACCOUNT;
    }

    public boolean isAlipay() {
        return TextUtils.equals(getChannelName(), "ALIPAY");
    }

    public boolean isAuthMode() {
        return getMode() == ReturnFeeMode.AUTH;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMode);
        parcel.writeString(this.mName);
        parcel.writeString(this.mIcon);
        parcel.writeString(this.mDesc);
        parcel.writeString(this.mPackageAndroid);
        parcel.writeString(this.mPackageIOS);
    }
}
