package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ActionPrompt implements Parcelable, JSONSerializable, ObjectParser<ActionPrompt> {
    public static final Parcelable.Creator<ActionPrompt> CREATOR = new Parcelable.Creator<ActionPrompt>() { // from class: com.miui.tsmclient.entity.ActionPrompt.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActionPrompt createFromParcel(Parcel parcel) {
            return new ActionPrompt(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActionPrompt[] newArray(int i) {
            return new ActionPrompt[i];
        }
    };
    private static final String KEY_CLOSE_PROMPT = "closePrompt";
    private static final String KEY_OPEN_PROMPT = "openPrompt";
    private static final String KEY_PROMPT = "prompt";

    @SerializedName(KEY_CLOSE_PROMPT)
    private Description mClosePrompt;

    @SerializedName(KEY_OPEN_PROMPT)
    private Description mOpenPrompt;

    @SerializedName("prompt")
    private Description mPrompt;

    public ActionPrompt(Parcel parcel) {
        this.mClosePrompt = (Description) parcel.readParcelable(Description.class.getClassLoader());
        this.mOpenPrompt = (Description) parcel.readParcelable(Description.class.getClassLoader());
        this.mPrompt = (Description) parcel.readParcelable(Description.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClosePrompt() {
        Description description = this.mClosePrompt;
        return description == null ? "" : description.getSpecificResourceByLanguage();
    }

    public String getOpenPrompt() {
        Description description = this.mOpenPrompt;
        return description == null ? "" : description.getSpecificResourceByLanguage();
    }

    public String getPrompt() {
        Description description = this.mPrompt;
        return description == null ? "" : description.getSpecificResourceByLanguage();
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            Description description = this.mClosePrompt;
            if (description != null) {
                jSONObject.put(KEY_CLOSE_PROMPT, description.serialize());
            }
            Description description2 = this.mOpenPrompt;
            if (description2 != null) {
                jSONObject.put(KEY_OPEN_PROMPT, description2.serialize());
            }
            Description description3 = this.mPrompt;
            if (description3 != null) {
                jSONObject.put("prompt", description3.serialize());
            }
        } catch (JSONException e) {
            LogUtils.e("serialize ActionPrompt", e);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mClosePrompt, i);
        parcel.writeParcelable(this.mOpenPrompt, i);
        parcel.writeParcelable(this.mPrompt, i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public ActionPrompt parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mClosePrompt = new Description().parse(jSONObject.optJSONObject(KEY_CLOSE_PROMPT));
            this.mOpenPrompt = new Description().parse(jSONObject.optJSONObject(KEY_OPEN_PROMPT));
            this.mPrompt = new Description().parse(jSONObject.optJSONObject("prompt"));
        }
        return this;
    }

    public ActionPrompt() {
    }
}
