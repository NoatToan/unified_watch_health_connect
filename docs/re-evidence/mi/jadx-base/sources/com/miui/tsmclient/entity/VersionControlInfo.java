package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;

/* JADX INFO: loaded from: classes6.dex */
public class VersionControlInfo implements Parcelable {
    public static final Parcelable.Creator<VersionControlInfo> CREATOR = new Parcelable.Creator<VersionControlInfo>() { // from class: com.miui.tsmclient.entity.VersionControlInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VersionControlInfo createFromParcel(Parcel parcel) {
            return new VersionControlInfo();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VersionControlInfo[] newArray(int i) {
            return new VersionControlInfo[i];
        }
    };
    public static final String FIRST_CONFIRM = "FIRST_CONFIRM";
    public static final String UPDATE_CONFIRM = "UPDATE_CONFIRM";

    @SerializedName("captchaVerifyType")
    public int mCaptchaVerifyType;

    @SerializedName("confirmPhase")
    public String mConfirmPhase;

    @SerializedName(MiuiCursorConstants.CONTENT)
    public String mContent;

    @SerializedName("needConfirm")
    public boolean mNeedConfirm;

    @SerializedName("needPhone")
    public boolean mNeedPhone;

    @SerializedName("richText")
    public String mRichText;

    @SerializedName(TSMAuthContants.PARAM_SERVICE_NAME)
    public String mServiceName;

    @SerializedName("title")
    public String mTitle;

    @SerializedName("id")
    public long mVersionControlId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isConfirmProtocolFirst() {
        return !TextUtils.isEmpty(this.mConfirmPhase) && TextUtils.equals(this.mConfirmPhase, FIRST_CONFIRM);
    }

    public boolean isConfirmProtocolToUpdate() {
        return !TextUtils.isEmpty(this.mConfirmPhase) && TextUtils.equals(this.mConfirmPhase, UPDATE_CONFIRM);
    }

    public void readFromParcel(Parcel parcel) {
        this.mNeedConfirm = parcel.readByte() != 0;
        this.mVersionControlId = parcel.readLong();
        this.mServiceName = parcel.readString();
        this.mTitle = parcel.readString();
        this.mContent = parcel.readString();
        this.mNeedPhone = parcel.readByte() != 0;
        this.mCaptchaVerifyType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mNeedConfirm ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.mVersionControlId);
        parcel.writeString(this.mServiceName);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mContent);
        parcel.writeByte(this.mNeedPhone ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mCaptchaVerifyType);
    }
}
