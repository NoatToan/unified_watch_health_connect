package com.sogou.map.loc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.tencent.connect.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class s extends h0 {
    private boolean b;
    private boolean c;
    private String d;
    private String e;
    private String f;

    public s(l0 l0Var) {
        super(l0Var);
        this.b = false;
        this.c = false;
        this.d = "2.0";
        try {
            Context contextD = l0Var.d();
            PackageInfo packageInfo = contextD.getPackageManager().getPackageInfo(contextD.getPackageName(), 0);
            this.e = packageInfo.versionName;
            this.f = packageInfo.packageName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private String f(File file) {
        JSONObject jSONObject;
        List<String> listJ = v1.j(file);
        if (listJ == null || listJ.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : listJ) {
            try {
                try {
                    String strI = v1.i(str);
                    jSONObject = strI != null ? new JSONObject(strI) : new JSONObject(str);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
            } catch (Exception unused2) {
                jSONObject = new JSONObject(str);
            }
            jSONArray.put(jSONObject);
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        j0.j(jSONObject2, "data", jSONArray);
        j0.j(jSONObject2, "deviceId", j0.g(d()));
        j0.j(jSONObject2, "manufacturer", Build.MANUFACTURER);
        j0.j(jSONObject2, Constants.PARAM_PLATFORM, Build.MODEL);
        j0.j(jSONObject2, com.xiaomi.market.sdk.Constants.JSON_VERSION, "android-" + Build.VERSION.SDK_INT);
        j0.j(jSONObject2, "version", this.d);
        j0.j(jSONObject2, "versionName", this.e);
        j0.j(jSONObject2, "packageName", this.f);
        JSONObject jSONObject3 = new JSONObject();
        j0.j(jSONObject3, "map_locationData", jSONObject2);
        return jSONObject3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        List<File> listK = v1.k(new File(a2.a));
        if (listK == null || listK.size() <= 0) {
            return;
        }
        int i = 0;
        for (File file : listK) {
            if (i >= 4) {
                return;
            }
            String strF = f(file);
            if (strF != null) {
                try {
                    boolean zK = k(strF);
                    if (zK) {
                        v1.g(file);
                    }
                    i++;
                    r0.a(3, "collecter", zK + ", " + i);
                } catch (Exception unused) {
                }
            }
        }
    }

    private boolean k(String str) {
        boolean z;
        if (str == null) {
            return false;
        }
        r0.a(4, "SendData", "send data:" + str.length());
        try {
            String strA = x1.a(l(), str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("info", strA));
            arrayList.add(new BasicNameValuePair("pd", "1"));
            arrayList.add(new BasicNameValuePair("pv", "2"));
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(arrayList, "GBK");
            try {
                urlEncodedFormEntity.setContentType("application/x-www-form-urlencoded");
                v1.b("http://pb.sogou.com/pv.gif?uigs_productid=go2map_location_collector", urlEncodedFormEntity);
                z = true;
            } catch (Exception e) {
                r0.a(4, "SendData", "httpPost data exception:" + e);
                z = false;
            }
            r0.a(3, "SendData", "####################################");
            r0.a(3, "SendData", "doSendData,ordata:" + str.length());
            r0.a(3, "SendData", "####################################");
            r0.a(3, "SendData", "doSendData,encrypteddata:" + strA.length());
            r0.a(3, "SendData", "####################################");
            r0.a(4, "SendData", "send data backStr:" + z);
            return z;
        } catch (Throwable th) {
            r0.a(4, "SendData", "send data exception:" + th);
            return false;
        }
    }

    private String l() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.class.getResourceAsStream("sogouaes")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                str = String.valueOf(str) + line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public final void i(boolean z) {
        this.b = z;
        if (!z || this.c) {
            return;
        }
        this.c = true;
        a(new t(this));
    }
}
