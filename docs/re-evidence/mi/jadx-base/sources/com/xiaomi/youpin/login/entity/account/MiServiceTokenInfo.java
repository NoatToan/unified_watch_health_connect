package com.xiaomi.youpin.login.entity.account;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MiServiceTokenInfo implements Parcelable {
    public static final Parcelable.Creator<MiServiceTokenInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14488b;
    public String c;
    public String d;
    public long e;
    public String f;

    public class a implements Parcelable.Creator<MiServiceTokenInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MiServiceTokenInfo createFromParcel(Parcel parcel) {
            return new MiServiceTokenInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MiServiceTokenInfo[] newArray(int i) {
            return new MiServiceTokenInfo[i];
        }
    }

    public MiServiceTokenInfo() {
    }

    public static MiServiceTokenInfo a(String str) {
        MiServiceTokenInfo miServiceTokenInfo = new MiServiceTokenInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            miServiceTokenInfo.f14487a = jSONObject.optString("sid");
            miServiceTokenInfo.f14488b = jSONObject.optString("cUserId");
            miServiceTokenInfo.c = jSONObject.optString("serviceToken");
            miServiceTokenInfo.d = jSONObject.optString("ssecurity");
            miServiceTokenInfo.e = jSONObject.optLong("timeDiff");
            miServiceTokenInfo.f = jSONObject.optString("domain");
            return miServiceTokenInfo;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sid", this.f14487a);
            jSONObject.put("cUserId", this.f14488b);
            jSONObject.put("serviceToken", this.c);
            jSONObject.put("ssecurity", this.d);
            jSONObject.put("timeDiff", this.e);
            jSONObject.put("domain", this.f);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MiServiceTokenInfo{sid='" + this.f14487a + "', cUserId='" + this.f14488b + "', serviceToken='" + this.c + "', ssecurity='" + this.d + "', timeDiff=" + this.e + ", domain='" + this.f + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14487a);
        parcel.writeString(this.f14488b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
    }

    public MiServiceTokenInfo(String str, String str2, String str3, String str4, String str5, long j) {
        this.f14487a = str;
        this.f14488b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
    }

    public MiServiceTokenInfo(Parcel parcel) {
        this.f14487a = parcel.readString();
        this.f14488b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        this.f = parcel.readString();
    }
}
