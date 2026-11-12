package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CustomInfo implements Parcelable, JSONSerializable, ObjectParser<CustomInfo> {
    public static final Parcelable.Creator<CustomInfo> CREATOR = new Parcelable.Creator<CustomInfo>() { // from class: com.miui.tsmclient.entity.CustomInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomInfo createFromParcel(Parcel parcel) {
            return new CustomInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomInfo[] newArray(int i) {
            return new CustomInfo[i];
        }
    };
    private static final String KEY_CONFIG_ID = "configId";
    private static final String KEY_CUSTOM_ISSUE_FEE = "customIssueFee";
    private static final int KEY_CUSTOM_ISSUE_FEE_DEFAULT = 0;
    private static final String KEY_EXTRA = "extra";
    private static final String KEY_MAX_FEE = "maxFee";
    private static final String KEY_MIN_FEE = "minFee";
    private long mCustomConfigId;
    private int mCustomIssueFee;
    private String mExtra;
    private int mMaxFee;
    private int mMinFee;

    private void readFromParcel(Parcel parcel) {
        this.mMinFee = parcel.readInt();
        this.mMaxFee = parcel.readInt();
        this.mCustomIssueFee = parcel.readInt();
        this.mExtra = parcel.readString();
        this.mCustomConfigId = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCustomConfigId() {
        return this.mCustomConfigId;
    }

    public int getCustomIssueFee() {
        return this.mCustomIssueFee;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public int getMaxFee() {
        return this.mMaxFee;
    }

    public int getMinFee() {
        return this.mMinFee;
    }

    public void restoreCustomIssueFee() {
        this.mCustomIssueFee = 0;
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_MIN_FEE, this.mMinFee);
            jSONObject.put(KEY_MAX_FEE, this.mMaxFee);
            jSONObject.put("customIssueFee", this.mCustomIssueFee);
            if (!TextUtils.isEmpty(this.mExtra)) {
                jSONObject.put("extra", this.mExtra);
            }
            jSONObject.put("configId", this.mCustomConfigId);
        } catch (JSONException e) {
            LogUtils.e("serialize customInfo info failed.", e);
        }
        return jSONObject;
    }

    public void setCustomConfigId(long j) {
        this.mCustomConfigId = j;
    }

    public void setMaxFee(int i) {
        this.mMaxFee = i;
    }

    public void setMinFee(int i) {
        this.mMinFee = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMinFee);
        parcel.writeInt(this.mMaxFee);
        parcel.writeInt(this.mCustomIssueFee);
        parcel.writeString(this.mExtra);
        parcel.writeLong(this.mCustomConfigId);
    }

    public CustomInfo() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public CustomInfo parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mMinFee = jSONObject.optInt(KEY_MIN_FEE);
            this.mMaxFee = jSONObject.optInt(KEY_MAX_FEE);
            this.mCustomIssueFee = jSONObject.optInt("customIssueFee");
            if (jSONObject.has("extra")) {
                this.mExtra = jSONObject.optString("extra");
            }
            if (jSONObject.has("configId")) {
                this.mCustomConfigId = jSONObject.optLong("configId");
            }
        }
        return this;
    }

    private CustomInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
