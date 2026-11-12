package com.huawei.hwidauth.datatype;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.nnn;
import defpackage.nox;
import defpackage.nph;
import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new Parcelable.Creator<DeviceInfo>() { // from class: com.huawei.hwidauth.datatype.DeviceInfo.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceInfo createFromParcel(Parcel parcel) {
            return new DeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    };
    public static final String IMEI_TYPE = "0";
    public static final String SN_TYPE = "8";
    public static final String TAG_DEVICE_ID = "deviceID";
    public static final String TAG_DEVICE_INFO = "deviceInfo";
    public static final String TAG_DEVICE_TYPE = "deviceType";
    public static final String UDID_TYPE = "9";
    public static final String UUID_TYPE = "6";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17577c;
    private String d;
    private String e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceInfo(Parcel parcel) {
        this.f17575a = parcel.readString();
        this.f17577c = parcel.readString();
        this.e = parcel.readString();
        this.f17576b = parcel.readString();
        this.d = parcel.readString();
    }

    public DeviceInfo() {
    }

    public static void a(XmlSerializer xmlSerializer, DeviceInfo deviceInfo) throws IllegalStateException, IOException, IllegalArgumentException {
        if (xmlSerializer == null || deviceInfo == null) {
            return;
        }
        nnn.e(xmlSerializer, TAG_DEVICE_ID, deviceInfo.a());
        nnn.e(xmlSerializer, "uuid", deviceInfo.e());
        nnn.e(xmlSerializer, "deviceType", deviceInfo.c());
        nnn.e(xmlSerializer, "terminalType", deviceInfo.b());
        if (TextUtils.isEmpty(deviceInfo.d())) {
            return;
        }
        nnn.e(xmlSerializer, "deviceAliasName", deviceInfo.d());
    }

    private static DeviceInfo a(Context context, String str, String str2, String str3, String str4) throws IllegalArgumentException {
        String str5;
        if (a(str, str2, str3, str4)) {
            throw new IllegalArgumentException("all device id are empty， at least pass one param");
        }
        if (!TextUtils.isEmpty(str)) {
            nox.b("DeviceInfo", "sn is not empty, use sn, device2 is udid", true);
            str5 = "8";
        } else if (!TextUtils.isEmpty(str2)) {
            nox.b("DeviceInfo", "imei is not empty, use imei", true);
            str5 = "0";
            str = str2;
        } else if (!TextUtils.isEmpty(str3)) {
            nox.b("DeviceInfo", "udid is not empty, use udid", true);
            str5 = "9";
            str = str3;
        } else {
            nox.b("DeviceInfo", "imei is empty， use uuid", true);
            str = TextUtils.isEmpty(str4) ? nph.d() : str4;
            str5 = "6";
        }
        String strA = nph.a(context);
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.e(strA);
        deviceInfo.c(str5);
        deviceInfo.a(str);
        deviceInfo.b(nph.e());
        deviceInfo.d(nph.d(context));
        return deviceInfo;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    public static DeviceInfo a(Context context, String str) throws IllegalArgumentException {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            nox.a("DeviceInfo", "jsonStr is null.", true);
            return null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("deviceInfo");
            String strOptString = "";
            String strOptString2 = "";
            String strOptString3 = strOptString2;
            String strOptString4 = strOptString3;
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String strOptString5 = jSONObject.optString("deviceType");
                    int iHashCode = strOptString5.hashCode();
                    if (iHashCode != 48) {
                        if (iHashCode != 54) {
                            if (iHashCode != 56) {
                                if (iHashCode == 57 && strOptString5.equals("9")) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strOptString5.equals("8")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (strOptString5.equals("6")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (strOptString5.equals("0")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        strOptString2 = jSONObject.optString(TAG_DEVICE_ID);
                    } else if (b2 == 1) {
                        strOptString4 = jSONObject.optString(TAG_DEVICE_ID);
                    } else if (b2 == 2) {
                        strOptString = jSONObject.optString(TAG_DEVICE_ID);
                    } else if (b2 == 3) {
                        strOptString3 = jSONObject.optString(TAG_DEVICE_ID);
                    }
                } else {
                    nox.a("DeviceInfo", "jsonObject is null.", true);
                }
            }
            return a(context, strOptString, strOptString2, strOptString3, strOptString4);
        } catch (JSONException unused) {
            nox.a("DeviceInfo", "func json2device, json parse exception.", true);
            throw new IllegalArgumentException("device is not json");
        } catch (Exception unused2) {
            nox.a("DeviceInfo", "func json2device, parse exception.", true);
            throw new IllegalArgumentException("device is not json");
        }
    }

    private static boolean a(String str, String str2, String str3, String str4) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
            return false;
        }
        nox.a("DeviceInfo", "all device id are empty, at least pass one param", true);
        return true;
    }

    private void a(String str) {
        this.f17577c = str;
    }

    public String a() {
        return this.f17577c;
    }

    public String b() {
        if (!TextUtils.isEmpty(this.d)) {
            return this.d.toUpperCase(Locale.ENGLISH);
        }
        return this.d;
    }

    private void b(String str) {
        this.d = str;
    }

    public String c() {
        return this.f17576b;
    }

    private void c(String str) {
        this.f17576b = str;
    }

    public String d() {
        if (TextUtils.isEmpty(this.e)) {
            return b();
        }
        return this.e;
    }

    private void d(String str) {
        this.e = str;
    }

    public String e() {
        return this.f17575a;
    }

    private void e(String str) {
        this.f17575a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17575a);
        parcel.writeString(this.f17577c);
        parcel.writeString(this.e);
        parcel.writeString(this.f17576b);
        parcel.writeString(this.d);
    }

    public String toString() {
        return "{'mUUid':" + this.f17575a + "{'mDeviceAliasName':" + this.e + ",'mDeviceID':" + this.f17577c + ",'mTerminalType':" + this.d + ",'mDeviceType':" + this.f17576b + ",'mLoginTime':}";
    }
}
