package com.xiaomi.smarthome.core.entity.account;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.account.OAuthAccountManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class OAuthAccount implements Parcelable {
    public static final Parcelable.Creator<OAuthAccount> CREATOR = new Parcelable.Creator<OAuthAccount>() { // from class: com.xiaomi.smarthome.core.entity.account.OAuthAccount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OAuthAccount createFromParcel(Parcel parcel) {
            return new OAuthAccount(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OAuthAccount[] newArray(int i) {
            return new OAuthAccount[i];
        }
    };
    private String accessToken;
    private String userId;

    public OAuthAccount() {
    }

    public static OAuthAccount buildFromPref(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        OAuthAccount oAuthAccount = new OAuthAccount();
        try {
            JSONObject jSONObject = new JSONObject(str);
            oAuthAccount.userId = jSONObject.optString("userId");
            oAuthAccount.accessToken = jSONObject.optString(OAuthAccountManager.MiOAuthConstant.TOKEN);
            return oAuthAccount;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized String getAccessToken() {
        return this.accessToken;
    }

    public synchronized String getUserId() {
        return this.userId;
    }

    public synchronized void setAccountInfo(String str, String str2) {
        this.userId = str;
        this.accessToken = str2;
    }

    public synchronized String toPrefJsonStr() {
        String string;
        string = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", this.userId);
            jSONObject.put(OAuthAccountManager.MiOAuthConstant.TOKEN, this.accessToken);
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.accessToken);
    }

    public OAuthAccount(Parcel parcel) {
        this.userId = parcel.readString();
        this.accessToken = parcel.readString();
    }
}
