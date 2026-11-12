package com.xiaomi.youpin.login.entity.account;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LoginMiAccount implements Parcelable {
    public static final Parcelable.Creator<LoginMiAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14486b;
    public boolean c;
    public final HashMap<String, MiServiceTokenInfo> d = new HashMap<>();
    public final HashMap<String, Long> e = new HashMap<>();

    public class a implements Parcelable.Creator<LoginMiAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginMiAccount createFromParcel(Parcel parcel) {
            return new LoginMiAccount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginMiAccount[] newArray(int i) {
            return new LoginMiAccount[i];
        }
    }

    public LoginMiAccount() {
    }

    public static LoginMiAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LoginMiAccount loginMiAccount = new LoginMiAccount();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("serviceTokens");
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            ArrayList arrayList = new ArrayList();
            while (itKeys.hasNext()) {
                arrayList.add(MiServiceTokenInfo.a(jSONObjectOptJSONObject.optString(itKeys.next())));
            }
            loginMiAccount.h(jSONObject.optString("userId"), jSONObject.optString("passToken"), jSONObject.optBoolean("isSystemAccount"), arrayList);
            return loginMiAccount;
        } catch (Exception unused) {
            return null;
        }
    }

    public synchronized List<MiServiceTokenInfo> c() {
        return new ArrayList(this.d.values());
    }

    public synchronized String d() {
        return this.f14486b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized MiServiceTokenInfo e(String str) {
        return this.d.get(str);
    }

    public synchronized long f(String str) {
        Long l;
        l = this.e.get(str);
        return l == null ? 0L : l.longValue();
    }

    public synchronized boolean g() {
        return this.c;
    }

    public synchronized String getUserId() {
        return this.f14485a;
    }

    public synchronized void h(String str, String str2, boolean z, Collection<MiServiceTokenInfo> collection) {
        this.f14485a = str;
        this.f14486b = str2;
        this.c = z;
        this.d.clear();
        if (collection != null) {
            for (MiServiceTokenInfo miServiceTokenInfo : collection) {
                this.d.put(miServiceTokenInfo.f14487a, miServiceTokenInfo);
            }
        }
    }

    public synchronized void i(MiServiceTokenInfo miServiceTokenInfo) {
        this.d.put(miServiceTokenInfo.f14487a, miServiceTokenInfo);
        this.e.put(miServiceTokenInfo.f14487a, Long.valueOf(System.currentTimeMillis()));
    }

    public synchronized String j() {
        String string;
        string = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", this.f14485a);
            jSONObject.put("passToken", this.f14486b);
            jSONObject.put("isSystemAccount", this.c);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, MiServiceTokenInfo> entry : this.d.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue().c());
            }
            jSONObject.put("serviceTokens", jSONObject2);
            string = jSONObject.toString();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            throw th;
        }
        return string;
    }

    public String toString() {
        return "LoginMiAccount{userId='" + this.f14485a + "', passToken='" + this.f14486b + "', isSystemAccount=" + this.c + ", mServiceTokenList=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14485a);
        parcel.writeString(this.f14486b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(c());
    }

    public LoginMiAccount(Parcel parcel) {
        h(parcel.readString(), parcel.readString(), parcel.readByte() != 0, parcel.createTypedArrayList(MiServiceTokenInfo.CREATOR));
    }
}
