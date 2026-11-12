package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class KeyItem implements Parcelable, JSONSerializable, ObjectParser<KeyItem> {
    public static final Parcelable.Creator<KeyItem> CREATOR = new Parcelable.Creator<KeyItem>() { // from class: com.miui.tsmclient.entity.KeyItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KeyItem createFromParcel(Parcel parcel) {
            return new KeyItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KeyItem[] newArray(int i) {
            return new KeyItem[i];
        }
    };
    private static final String KEY_CREATE_TIME = "createTime";
    private static final String KEY_DESC = "key_Desc";
    private static final String KEY_ICON_URL = "keyIconUrl";
    private static final String KEY_NO = "keyNo";
    private static final String KEY_TITLE = "keyTitle";

    @SerializedName(KEY_CREATE_TIME)
    private String mCreateTime;

    @SerializedName("keyDesc")
    private String mKeyDesc;

    @SerializedName(KEY_ICON_URL)
    private String mKeyIconUrl;

    @SerializedName(KEY_NO)
    private String mKeyNo;

    @SerializedName(KEY_TITLE)
    private String mKeyTitle;

    public KeyItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCreateTime() {
        return this.mCreateTime;
    }

    public String getKeyDesc() {
        return this.mKeyDesc;
    }

    public String getKeyIconUrl() {
        return this.mKeyIconUrl;
    }

    public String getKeyNo() {
        return this.mKeyNo;
    }

    public String getKeyTitle() {
        return this.mKeyTitle;
    }

    public void readFromParcel(Parcel parcel) {
        this.mKeyNo = parcel.readString();
        this.mKeyTitle = parcel.readString();
        this.mKeyDesc = parcel.readString();
        this.mCreateTime = parcel.readString();
        this.mKeyIconUrl = parcel.readString();
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_NO, this.mKeyNo);
            jSONObject.put(KEY_TITLE, KEY_TITLE);
            jSONObject.put(KEY_DESC, KEY_DESC);
            jSONObject.put(KEY_CREATE_TIME, this.mCreateTime);
            jSONObject.put(KEY_ICON_URL, this.mKeyIconUrl);
        } catch (JSONException e) {
            LogUtils.e("serialize keyItem", e);
        }
        return jSONObject;
    }

    public void setCreateTime(String str) {
        this.mCreateTime = str;
    }

    public void setKeyDesc(String str) {
        this.mKeyDesc = str;
    }

    public void setKeyIconUrl(String str) {
        this.mKeyIconUrl = str;
    }

    public void setKeyNo(String str) {
        this.mKeyNo = str;
    }

    public void setKeyTitle(String str) {
        this.mKeyTitle = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mKeyNo);
        parcel.writeString(this.mKeyTitle);
        parcel.writeString(this.mKeyDesc);
        parcel.writeString(this.mCreateTime);
        parcel.writeString(this.mKeyIconUrl);
    }

    public KeyItem(Parcel parcel) {
        readFromParcel(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public KeyItem parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mKeyNo = jSONObject.optString(KEY_NO);
            this.mKeyDesc = jSONObject.optString(KEY_DESC);
            this.mKeyTitle = jSONObject.optString(KEY_TITLE);
            this.mCreateTime = jSONObject.optString(KEY_CREATE_TIME);
            this.mKeyIconUrl = jSONObject.optString(KEY_ICON_URL);
        }
        return this;
    }
}
