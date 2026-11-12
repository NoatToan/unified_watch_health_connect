package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class UIConfig implements Parcelable, JSONSerializable, ObjectParser<UIConfig> {
    public static final Parcelable.Creator<UIConfig> CREATOR = new Parcelable.Creator<UIConfig>() { // from class: com.miui.tsmclient.entity.UIConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UIConfig createFromParcel(Parcel parcel) {
            return new UIConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UIConfig[] newArray(int i) {
            return new UIConfig[i];
        }
    };
    public static final String KEY_CURRENT_TIME = "currentTime";
    private static final String KEY_SHOW_VALIDITY_PERIOD = "showValidityPeriod";
    public static final String KEY_TAG = "tag";
    public static final String KEY_TIME_DELIMITER = "timeDelimiter";

    @SerializedName(KEY_SHOW_VALIDITY_PERIOD)
    private boolean isShowValidityPeriod;

    @SerializedName(KEY_CURRENT_TIME)
    private String mCurrentTime;

    @SerializedName("tag")
    private String[] mTag;

    @SerializedName(KEY_TIME_DELIMITER)
    private int mTimeDelimiter;

    public UIConfig() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCurrentTime() {
        return this.mCurrentTime;
    }

    public String[] getTag() {
        return this.mTag;
    }

    public int getTimeDelimiter() {
        return this.mTimeDelimiter;
    }

    public boolean isShowValidityPeriod() {
        return this.isShowValidityPeriod;
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_CURRENT_TIME, this.mCurrentTime);
            jSONObject.put(KEY_TIME_DELIMITER, this.mTimeDelimiter);
            jSONObject.put(KEY_SHOW_VALIDITY_PERIOD, this.isShowValidityPeriod);
            if (this.mTag != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.mTag) {
                    jSONArray.put(str);
                }
                jSONObject.put("tag", jSONArray);
            }
        } catch (JSONException e) {
            LogUtils.e("serialize ui config", e);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCurrentTime);
        parcel.writeInt(this.mTimeDelimiter);
        parcel.writeByte(this.isShowValidityPeriod ? (byte) 1 : (byte) 0);
    }

    public UIConfig(Parcel parcel) {
        this.mCurrentTime = parcel.readString();
        this.mTimeDelimiter = parcel.readInt();
        this.isShowValidityPeriod = parcel.readByte() != 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public UIConfig parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mCurrentTime = jSONObject.optString(KEY_CURRENT_TIME);
            this.mTimeDelimiter = jSONObject.optInt(KEY_TIME_DELIMITER);
            this.isShowValidityPeriod = jSONObject.optBoolean(KEY_SHOW_VALIDITY_PERIOD);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tag");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.mTag = new String[length];
                for (int i = 0; i < length; i++) {
                    this.mTag[i] = jSONArrayOptJSONArray.optString(i);
                }
            }
        }
        return this;
    }
}
