package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class LogCaptureConfig implements Parcelable {
    public static final Parcelable.Creator<LogCaptureConfig> CREATOR = new Parcelable.Creator<LogCaptureConfig>() { // from class: com.miui.tsmclient.entity.LogCaptureConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LogCaptureConfig createFromParcel(Parcel parcel) {
            return new LogCaptureConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LogCaptureConfig[] newArray(int i) {
            return new LogCaptureConfig[i];
        }
    };

    @SerializedName("status")
    private String mStatus;

    @SerializedName("tag")
    private String mTag;

    public LogCaptureConfig(Parcel parcel) {
        this.mStatus = parcel.readString();
        this.mTag = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isStatusMatcher(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.mStatus)) {
            return false;
        }
        return Pattern.compile(this.mStatus).matcher(charSequence).matches();
    }

    public void setStatus(String str) {
        this.mStatus = str;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mStatus);
        parcel.writeString(this.mTag);
    }
}
