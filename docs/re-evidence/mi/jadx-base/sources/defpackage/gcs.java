package defpackage;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@c4t(a = "update_item", b = true)
public class gcs extends scs {
    public String n = "";
    public Context o;

    public gcs() {
    }

    public static String l(JSONObject jSONObject, String str) throws JSONException {
        return (jSONObject == null || !jSONObject.has(str) || HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(jSONObject.getString(str))) ? "" : jSONObject.optString(str).trim();
    }

    public final String k() {
        return this.n;
    }

    public final void m(String str) {
        this.n = str;
    }

    public final void n() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", this.f33516a);
            jSONObject2.put("code", this.c);
            jSONObject2.put("url", this.f33517b);
            jSONObject2.put("fileName", this.d);
            jSONObject2.put("lLocalLength", this.f);
            jSONObject2.put("lRemoteLength", this.g);
            jSONObject2.put("mState", this.l);
            jSONObject2.put("version", this.e);
            jSONObject2.put("localPath", this.h);
            String str = this.n;
            if (str != null) {
                jSONObject2.put("vMapFileNames", str);
            }
            jSONObject2.put("isSheng", this.i);
            jSONObject2.put("mCompleteCode", this.j);
            jSONObject2.put("mCityCode", this.f33518k);
            jSONObject2.put("pinyin", this.m);
            jSONObject.put("file", jSONObject2);
            File file = new File(this.d + ".dt");
            file.delete();
            OutputStreamWriter outputStreamWriter = null;
            try {
                try {
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(file, true), "utf-8");
                    try {
                        outputStreamWriter2.write(jSONObject.toString());
                        try {
                            outputStreamWriter2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        outputStreamWriter = outputStreamWriter2;
                        m2t.r(e, "UpdateItem", "saveJSONObjectToFile");
                        e.printStackTrace();
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        outputStreamWriter = outputStreamWriter2;
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            m2t.r(th3, "UpdateItem", "saveJSONObjectToFile parseJson");
            th3.printStackTrace();
        }
    }

    public final void o(String str) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                if ("".equals(str) || (jSONObject = new JSONObject(str).getJSONObject("file")) == null) {
                    return;
                }
                this.f33516a = jSONObject.optString("title");
                this.c = jSONObject.optString("code");
                this.f33517b = jSONObject.optString("url");
                this.d = jSONObject.optString("fileName");
                this.f = jSONObject.optLong("lLocalLength");
                this.g = jSONObject.optLong("lRemoteLength");
                this.l = jSONObject.optInt("mState");
                this.e = jSONObject.optString("version");
                this.h = jSONObject.optString("localPath");
                this.n = jSONObject.optString("vMapFileNames");
                this.i = jSONObject.optInt("isSheng");
                this.j = jSONObject.optInt("mCompleteCode");
                this.f33518k = jSONObject.optString("mCityCode");
                String strL = l(jSONObject, "pinyin");
                this.m = strL;
                if ("".equals(strL)) {
                    String str2 = this.f33517b;
                    String strSubstring = str2.substring(str2.lastIndexOf("/") + 1);
                    this.m = strSubstring.substring(0, strSubstring.lastIndexOf("."));
                }
            } catch (Throwable th) {
                m2t.r(th, "UpdateItem", "readFileToJSONObject");
                th.printStackTrace();
            }
        }
    }

    public final void p() {
        this.d = zns.h0(this.o) + this.m + ".zip.tmp";
    }

    public gcs(OfflineMapCity offlineMapCity, Context context) {
        this.o = context;
        this.f33516a = offlineMapCity.getCity();
        this.c = offlineMapCity.getAdcode();
        this.f33517b = offlineMapCity.getUrl();
        this.g = offlineMapCity.getSize();
        this.e = offlineMapCity.getVersion();
        this.f33518k = offlineMapCity.getCode();
        this.i = 0;
        this.l = offlineMapCity.getState();
        this.j = offlineMapCity.getcompleteCode();
        this.m = offlineMapCity.getPinyin();
        p();
    }

    public gcs(OfflineMapProvince offlineMapProvince, Context context) {
        this.o = context;
        this.f33516a = offlineMapProvince.getProvinceName();
        this.c = offlineMapProvince.getProvinceCode();
        this.f33517b = offlineMapProvince.getUrl();
        this.g = offlineMapProvince.getSize();
        this.e = offlineMapProvince.getVersion();
        this.i = 1;
        this.l = offlineMapProvince.getState();
        this.j = offlineMapProvince.getcompleteCode();
        this.m = offlineMapProvince.getPinyin();
        p();
    }
}
