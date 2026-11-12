package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Description implements Parcelable, JSONSerializable, ObjectParser<Description> {
    public static final Parcelable.Creator<Description> CREATOR = new Parcelable.Creator<Description>() { // from class: com.miui.tsmclient.entity.Description.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Description createFromParcel(Parcel parcel) {
            return new Description(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Description[] newArray(int i) {
            return new Description[i];
        }
    };
    private static final String KEY_CHS = "chs";
    private static final String KEY_CHT = "cht";
    private static final String KEY_EN = "en";

    @SerializedName(KEY_CHS)
    private String mChs;

    @SerializedName(KEY_CHT)
    private String mCht;

    @SerializedName("en")
    private String mEn;

    public Description(Parcel parcel) {
        this.mChs = parcel.readString();
        this.mCht = parcel.readString();
        this.mEn = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSpecificResourceByLanguage() {
        Locale locale = Locale.getDefault();
        if (Locale.SIMPLIFIED_CHINESE.equals(locale)) {
            return this.mChs;
        }
        return Locale.TRADITIONAL_CHINESE.equals(locale) ? this.mCht : this.mEn;
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_CHS, this.mChs);
            jSONObject.put(KEY_CHT, this.mCht);
            jSONObject.put("en", this.mEn);
        } catch (JSONException e) {
            LogUtils.e("serialize Description", e);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mChs);
        parcel.writeString(this.mCht);
        parcel.writeString(this.mEn);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public Description parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mChs = jSONObject.optString(KEY_CHS);
            this.mCht = jSONObject.optString(KEY_CHT);
            this.mEn = jSONObject.optString("en");
        }
        return this;
    }

    public Description() {
    }
}
