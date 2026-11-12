package com.xiaomi.smarthome.core.entity.account;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class WXAccount implements Parcelable {
    public static final Parcelable.Creator<WXAccount> CREATOR = new Parcelable.Creator<WXAccount>() { // from class: com.xiaomi.smarthome.core.entity.account.WXAccount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WXAccount createFromParcel(Parcel parcel) {
            return new WXAccount(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WXAccount[] newArray(int i) {
            return new WXAccount[i];
        }
    };
    private String extId;
    private String homeId;
    private String serviceToken;

    public WXAccount() {
    }

    public static WXAccount buildFromPref(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        WXAccount wXAccount = new WXAccount();
        try {
            JSONObject jSONObject = new JSONObject(str);
            wXAccount.homeId = jSONObject.optString("homeId");
            wXAccount.extId = jSONObject.optString("extId");
            wXAccount.serviceToken = jSONObject.optString("serviceToken");
            return wXAccount;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized String getExtId() {
        return this.extId;
    }

    public synchronized String getHomeId() {
        return this.homeId;
    }

    public synchronized String getServiceToken() {
        return this.serviceToken;
    }

    public synchronized void set(String str, String str2, String str3) {
        this.homeId = str;
        this.extId = str2;
        this.serviceToken = str3;
    }

    public synchronized String toPrefJsonStr() {
        String string;
        string = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("homeId", this.homeId);
            jSONObject.put("extId", this.extId);
            jSONObject.put("serviceToken", this.serviceToken);
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.homeId);
        parcel.writeString(this.extId);
        parcel.writeString(this.serviceToken);
    }

    public WXAccount(Parcel parcel) {
        this.homeId = parcel.readString();
        this.extId = parcel.readString();
        this.serviceToken = parcel.readString();
    }
}
