package com.xiaomi.hm.health.device.sport;

import android.text.TextUtils;
import com.loopj.android.http.Base64;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.ArrayList;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class OriginSportData {
    private static final String g = "start";
    private static final String h = "stop";
    private static final String i = "value";
    private static final String j = "tz";
    private static final String k = "did";
    private static final String l = "src";
    private static final int m = ProfileUtils.getTimezoneKey(TimeZone.getDefault());
    private int a;
    private int b;
    private long c;
    private byte[] d;
    private String e;
    private int f;

    public static boolean is8Bytes(String str) {
        byte[] bArrJsonToSportDataByBytes = jsonToSportDataByBytes(str);
        return bArrJsonToSportDataByBytes != null && bArrJsonToSportDataByBytes.length == 11520;
    }

    public static OriginSportData jsonToSportData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                OriginSportData originSportData = new OriginSportData();
                originSportData.setData(Base64.decode(jSONArray.getJSONObject(i2).optString("value"), 2));
                originSportData.setStart(jSONArray.getJSONObject(i2).optInt("start"));
                originSportData.setStop(jSONArray.getJSONObject(i2).optInt("stop"));
                originSportData.setTimezone(jSONArray.getJSONObject(i2).optLong(j));
                originSportData.setDeviceId(jSONArray.getJSONObject(i2).optString(k));
                originSportData.setSource(jSONArray.getJSONObject(i2).optInt(l));
                arrayList.add(originSportData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (OriginSportData) arrayList.get(0);
    }

    public static byte[] jsonToSportDataByBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                OriginSportData originSportData = new OriginSportData();
                originSportData.setData(Base64.decode(jSONArray.getJSONObject(i2).optString("value"), 2));
                originSportData.setStart(jSONArray.getJSONObject(i2).optInt("start"));
                originSportData.setStop(jSONArray.getJSONObject(i2).optInt("stop"));
                originSportData.setTimezone(jSONArray.getJSONObject(i2).optLong(j));
                originSportData.setDeviceId(jSONArray.getJSONObject(i2).optString(k));
                originSportData.setSource(jSONArray.getJSONObject(i2).optInt(l));
                arrayList.add(originSportData);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return ((OriginSportData) arrayList.get(0)).getData();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String netSportDataStringToJson(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start", 0);
            jSONObject.put("stop", 1439);
            jSONObject.put("value", str);
            jSONObject.put(j, m);
            jSONObject.put(k, "");
            jSONObject.put(l, -1);
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String sportDataBytesToJson(byte[] bArr, String str, int i2) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start", 0);
            jSONObject.put("stop", 1439);
            jSONObject.put("value", Base64.encodeToString(bArr, 2));
            jSONObject.put(j, m);
            jSONObject.put(k, str);
            jSONObject.put(l, i2);
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public byte[] getData() {
        return this.d;
    }

    public String getDeviceId() {
        return this.e;
    }

    public int getSource() {
        return this.f;
    }

    public int getStart() {
        return this.a;
    }

    public int getStop() {
        return this.b;
    }

    public long getTimezone() {
        return this.c;
    }

    public void setData(byte[] bArr) {
        this.d = bArr;
    }

    public void setDeviceId(String str) {
        this.e = str;
    }

    public void setSource(int i2) {
        this.f = i2;
    }

    public void setStart(int i2) {
        this.a = i2;
    }

    public void setStop(int i2) {
        this.b = i2;
    }

    public void setTimezone(long j2) {
        this.c = j2;
    }
}
