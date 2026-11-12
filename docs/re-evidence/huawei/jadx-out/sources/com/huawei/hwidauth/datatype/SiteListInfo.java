package com.huawei.hwidauth.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nox;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public class SiteListInfo implements Parcelable {
    public static final Parcelable.Creator<SiteListInfo> CREATOR = new Parcelable.Creator<SiteListInfo>() { // from class: com.huawei.hwidauth.datatype.SiteListInfo.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SiteListInfo createFromParcel(Parcel parcel) {
            SiteListInfo siteListInfo = new SiteListInfo();
            siteListInfo.f17581a = parcel.readInt();
            siteListInfo.f17582b = parcel.readString();
            siteListInfo.f17583c = parcel.readString();
            siteListInfo.d = parcel.readString();
            return siteListInfo;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SiteListInfo[] newArray(int i) {
            return new SiteListInfo[i];
        }
    };
    public static final String TAG = "SiteListInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17581a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17582b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17583c = "";
    private String d = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17581a);
        parcel.writeString(this.d);
        parcel.writeString(this.f17582b);
        parcel.writeString(this.f17583c);
    }

    public static void a(XmlPullParser xmlPullParser, SiteListInfo siteListInfo, String str) {
        if (xmlPullParser == null || siteListInfo == null || str == null) {
            nox.a(TAG, "param is null.", true);
        } else if ("site".equals(str)) {
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                a(xmlPullParser, siteListInfo, i);
            }
        }
    }

    private static void a(XmlPullParser xmlPullParser, SiteListInfo siteListInfo, int i) {
        String attributeName = xmlPullParser.getAttributeName(i);
        String attributeValue = xmlPullParser.getAttributeValue(i);
        if (attributeName.equals("id")) {
            siteListInfo.a(siteListInfo.a(attributeValue));
            return;
        }
        if (attributeName.equals("domain")) {
            try {
                JSONObject jSONObject = new JSONObject(attributeValue);
                siteListInfo.f17582b = a(jSONObject, "cas").trim();
                siteListInfo.d = a(jSONObject, "honor-cas").trim();
                siteListInfo.f17583c = a(jSONObject, "as").trim();
            } catch (JSONException e) {
                nox.a(TAG, "parseJSONArrayInfos JSONException: " + e.getClass().getSimpleName(), true);
            } catch (Exception e2) {
                nox.a(TAG, "parseJSONArrayInfos Exception: " + e2.getClass().getSimpleName(), true);
            }
        }
    }

    private void a(int i) {
        this.f17581a = i;
    }

    public int a() {
        return this.f17581a;
    }

    public String b() {
        return this.f17582b;
    }

    private int a(String str) {
        try {
            return b(str);
        } catch (Exception e) {
            nox.a(TAG, "e = " + e.getClass().getSimpleName(), true);
            return 0;
        }
    }

    private int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            nox.a(TAG, "parsError " + e.getClass().getSimpleName(), true);
            return -1;
        }
    }

    private static String a(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return "";
        }
        return jSONObject.getString(str);
    }
}
