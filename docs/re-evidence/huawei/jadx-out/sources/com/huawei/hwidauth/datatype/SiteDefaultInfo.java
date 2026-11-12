package com.huawei.hwidauth.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nox;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public class SiteDefaultInfo implements Parcelable {
    public static final Parcelable.Creator<SiteDefaultInfo> CREATOR = new Parcelable.Creator<SiteDefaultInfo>() { // from class: com.huawei.hwidauth.datatype.SiteDefaultInfo.4
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SiteDefaultInfo createFromParcel(Parcel parcel) {
            SiteDefaultInfo siteDefaultInfo = new SiteDefaultInfo();
            siteDefaultInfo.f17578a = parcel.readString();
            siteDefaultInfo.f17579b = parcel.readString();
            siteDefaultInfo.f17580c = parcel.readString();
            siteDefaultInfo.d = parcel.readString();
            return siteDefaultInfo;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SiteDefaultInfo[] newArray(int i) {
            return new SiteDefaultInfo[i];
        }
    };
    public static final String TAG = "SiteDefaultInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17578a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17579b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17580c = "";
    private String d = "";
    private String e = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static void a(XmlPullParser xmlPullParser, SiteDefaultInfo siteDefaultInfo) {
        try {
            if ("domain".equals(xmlPullParser.getAttributeName(0))) {
                JSONObject jSONObject = new JSONObject(xmlPullParser.getAttributeValue(0));
                siteDefaultInfo.a(a(jSONObject, "logout").trim());
                siteDefaultInfo.b(a(jSONObject, "qrauth").trim());
                siteDefaultInfo.c(a(jSONObject, "cas").trim());
                siteDefaultInfo.e(a(jSONObject, "honor-cas").trim());
                siteDefaultInfo.d(a(jSONObject, "as").trim());
            }
        } catch (JSONException e) {
            nox.b(TAG, "parseJSONArrayInfos JSONException: " + e.getClass().getSimpleName(), true);
        } catch (Exception e2) {
            nox.b(TAG, "parseJSONArrayInfos Exception: " + e2.getClass().getSimpleName(), true);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17578a);
        parcel.writeString(this.f17579b);
        parcel.writeString(this.f17580c);
        parcel.writeString(this.d);
    }

    public String a() {
        return this.f17578a;
    }

    private void a(String str) {
        this.f17578a = str;
    }

    public String b() {
        return this.f17579b;
    }

    private void b(String str) {
        this.f17579b = str;
    }

    public String c() {
        return this.f17580c;
    }

    private void c(String str) {
        this.f17580c = str;
    }

    private void d(String str) {
        this.e = str;
    }

    private void e(String str) {
        this.d = str;
    }

    private static String a(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return "";
        }
        return jSONObject.getString(str);
    }
}
