package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.huawei.openalliance.ad.constant.GlobalUtilKeys;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@kf(a = "update_item", b = true)
public class bm extends bp {
    private String n = "";
    private Context o;

    public bm() {
    }

    public bm(OfflineMapCity offlineMapCity, Context context) {
        this.o = context;
        this.f2279a = offlineMapCity.getCity();
        this.f2281c = offlineMapCity.getAdcode();
        this.f2280b = offlineMapCity.getUrl();
        this.g = offlineMapCity.getSize();
        this.e = offlineMapCity.getVersion();
        this.k = offlineMapCity.getCode();
        this.i = 0;
        this.l = offlineMapCity.getState();
        this.j = offlineMapCity.getcompleteCode();
        this.m = offlineMapCity.getPinyin();
        i();
    }

    public bm(OfflineMapProvince offlineMapProvince, Context context) {
        this.o = context;
        this.f2279a = offlineMapProvince.getProvinceName();
        this.f2281c = offlineMapProvince.getProvinceCode();
        this.f2280b = offlineMapProvince.getUrl();
        this.g = offlineMapProvince.getSize();
        this.e = offlineMapProvince.getVersion();
        this.i = 1;
        this.l = offlineMapProvince.getState();
        this.j = offlineMapProvince.getcompleteCode();
        this.m = offlineMapProvince.getPinyin();
        i();
    }

    private void i() {
        this.d = eb.c(this.o) + this.m + ".zip.tmp";
    }

    public final String a() {
        return this.n;
    }

    public final void a(String str) {
        this.n = str;
    }

    public final void b(String str) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                if (!"".equals(str) && (jSONObject = new JSONObject(str).getJSONObject("file")) != null) {
                    this.f2279a = jSONObject.optString("title");
                    this.f2281c = jSONObject.optString("code");
                    this.f2280b = jSONObject.optString("url");
                    this.d = jSONObject.optString(ContentResource.FILE_NAME);
                    this.f = jSONObject.optLong("lLocalLength");
                    this.g = jSONObject.optLong("lRemoteLength");
                    this.l = jSONObject.optInt("mState");
                    this.e = jSONObject.optString("version");
                    this.h = jSONObject.optString(GlobalUtilKeys.LOCAL_PATH);
                    this.n = jSONObject.optString("vMapFileNames");
                    this.i = jSONObject.optInt("isSheng");
                    this.j = jSONObject.optInt("mCompleteCode");
                    this.k = jSONObject.optString("mCityCode");
                    this.m = a(jSONObject, "pinyin");
                    if ("".equals(this.m)) {
                        String strSubstring = this.f2280b.substring(this.f2280b.lastIndexOf("/") + 1);
                        this.m = strSubstring.substring(0, strSubstring.lastIndexOf("."));
                    }
                }
            } catch (Throwable th) {
                jv.c(th, "UpdateItem", "readFileToJSONObject");
                th.printStackTrace();
            }
        }
    }

    public final void b() {
        OutputStreamWriter outputStreamWriter;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", this.f2279a);
            jSONObject2.put("code", this.f2281c);
            jSONObject2.put("url", this.f2280b);
            jSONObject2.put(ContentResource.FILE_NAME, this.d);
            jSONObject2.put("lLocalLength", this.f);
            jSONObject2.put("lRemoteLength", this.g);
            jSONObject2.put("mState", this.l);
            jSONObject2.put("version", this.e);
            jSONObject2.put(GlobalUtilKeys.LOCAL_PATH, this.h);
            String str = this.n;
            if (str != null) {
                jSONObject2.put("vMapFileNames", str);
            }
            jSONObject2.put("isSheng", this.i);
            jSONObject2.put("mCompleteCode", this.j);
            jSONObject2.put("mCityCode", this.k);
            jSONObject2.put("pinyin", this.m);
            jSONObject.put("file", jSONObject2);
            File file = new File(this.d + ".dt");
            file.delete();
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                try {
                    try {
                        outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, true), "utf-8");
                        try {
                            outputStreamWriter.write(jSONObject.toString());
                            outputStreamWriter.close();
                        } catch (IOException e) {
                            e = e;
                            outputStreamWriter2 = outputStreamWriter;
                            jv.c(e, "UpdateItem", "saveJSONObjectToFile");
                            e.printStackTrace();
                            if (outputStreamWriter2 != null) {
                                outputStreamWriter2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (outputStreamWriter != null) {
                                try {
                                    outputStreamWriter.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = outputStreamWriter2;
            }
        } catch (Throwable th3) {
            jv.c(th3, "UpdateItem", "saveJSONObjectToFile parseJson");
            th3.printStackTrace();
        }
    }

    private static String a(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str) || "[]".equals(jSONObject.getString(str))) {
            return "";
        }
        return jSONObject.optString(str).trim();
    }
}
