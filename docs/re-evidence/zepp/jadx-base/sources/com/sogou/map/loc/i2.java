package com.sogou.map.loc;

import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.cybergarage.soap.SOAP;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class i2 implements Runnable {
    private final g2 a;
    private final b2 b;
    private volatile HttpPost c;
    private /* synthetic */ d2 d;

    private i2(d2 d2Var, g2 g2Var, b2 b2Var) {
        this.d = d2Var;
        this.c = null;
        this.a = g2Var;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        UrlEncodedFormEntity urlEncodedFormEntity;
        JSONObject jSONObject;
        try {
            r0.b("NetTask.run()");
            if (this.a.b) {
                r0.b("aborted: B");
                return;
            }
            try {
                this.b.f(this.d.c.n());
                this.b.j(this.d.c.o());
                this.d.c.l();
                TelephonyManager telephonyManagerK = this.d.c.k();
                String strH = j0.h(telephonyManagerK, this.d.a.d());
                this.b.a = j0.z(strH);
                r0.b("deviceId:" + strH);
                this.b.b = j0.z(j0.t(telephonyManagerK, this.d.a.d()));
                this.b.c = j0.z(Build.MODEL);
                this.b.d = this.d.g;
                this.b.e(telephonyManagerK.getNetworkOperator());
                this.b.f = (byte) telephonyManagerK.getNetworkType();
                this.b.g = j0.z(telephonyManagerK.getSimOperator());
                this.b.h = telephonyManagerK.isNetworkRoaming() ? (byte) 1 : (byte) 0;
                if (!j0.o(this.d.j)) {
                    this.b.p = j0.z(this.d.j);
                }
                if (!j0.o(this.d.h)) {
                    this.b.q = j0.z(this.d.h);
                }
                if (!j0.o(this.d.i)) {
                    this.b.r = j0.z(this.d.i);
                }
                WifiManager wifiManager = this.d.b.b;
                this.b.b(q0.a(telephonyManagerK));
                this.b.d(q0.d(wifiManager, j0.b()));
                this.b.n = this.d.d.s();
                this.b.o = this.d.d.u();
                this.b.s = this.d.k;
                this.b.t = this.d.l;
            } catch (Throwable unused) {
            }
            r0.b("prepareBasis() is done!");
            if (this.a.b) {
                r0.b("aborted: C");
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(a2.i));
            if (j0.o(null)) {
                str = "";
            } else {
                str = "?" + ((String) null);
            }
            sb.append(str);
            String string = sb.toString();
            LinkedList linkedList = new LinkedList();
            String strA = new c2(this.b).a();
            if (strA == null) {
                r0.b("build data error");
                g2.c(this.a, this.b, new SGLocation(2, "ERROR_BUILD_DATA"));
                return;
            }
            try {
                linkedList.add(new BasicNameValuePair("ver", "1.3"));
                linkedList.add(new BasicNameValuePair("data", strA));
                linkedList.add(new BasicNameValuePair("state", d2.s));
                r0.b("url=" + string);
                r0.b("data=" + strA + "&ver=1.3&state=" + d2.s);
            } catch (Exception e) {
                r0.b("error: " + e.getMessage());
            }
            try {
                urlEncodedFormEntity = new UrlEncodedFormEntity(linkedList, "GBK");
                try {
                    urlEncodedFormEntity.setContentType("application/x-www-form-urlencoded");
                } catch (UnsupportedEncodingException unused2) {
                }
            } catch (UnsupportedEncodingException unused3) {
                urlEncodedFormEntity = null;
            }
            if (this.a.b) {
                r0.b("aborted: D");
                return;
            }
            try {
                r0.b("Starting HttpUtils.httpPost()");
                o0 o0VarB = v1.b(string, urlEncodedFormEntity);
                r0.b("Finished HttpUtils.httpPost()");
                try {
                    int iA = o0VarB.a();
                    if (iA != 200) {
                        r0.b("statusCode: " + iA);
                        SGLocation sGLocation = new SGLocation(2, "ERROR_SERVER_CODE:" + iA);
                        r0.b("task.submitResult()");
                        g2.c(this.a, this.b, sGLocation);
                        return;
                    }
                    String strB = o0VarB.b();
                    r0.b("rtn: " + strB);
                    try {
                        jSONObject = new JSONObject(strB);
                    } catch (Exception unused4) {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        SGLocation sGLocation2 = new SGLocation(2, "ERROR_SERVER_RETURN");
                        r0.b("task.submitResult()");
                        g2.c(this.a, this.b, sGLocation2);
                        return;
                    }
                    int iOptInt = jSONObject.optInt("e", 0);
                    r0.b("e: " + iOptInt);
                    if (iOptInt != 0) {
                        if (iOptInt == 2) {
                            SGLocation sGLocation3 = new SGLocation(1, "ERROR_SERVER_DENY");
                            r0.b("task.submitResult()");
                            g2.c(this.a, this.b, sGLocation3);
                            return;
                        } else {
                            SGLocation sGLocation4 = new SGLocation(2, "ERROR_SERVER_FAIL:" + iOptInt);
                            r0.b("task.submitResult()");
                            g2.c(this.a, this.b, sGLocation4);
                            return;
                        }
                    }
                    SGLocation sGLocation5 = new SGLocation((byte) 5);
                    sGLocation5.u = jSONObject;
                    sGLocation5.h(jSONObject.optDouble("x", 0.0d), jSONObject.optDouble("y", 0.0d), this.d.k);
                    sGLocation5.l = (float) jSONObject.optDouble("r", 0.0d);
                    sGLocation5.p = jSONObject.optString("r1", "");
                    sGLocation5.q = jSONObject.optString("r2", "");
                    sGLocation5.r = jSONObject.optString("r3", "");
                    sGLocation5.s = jSONObject.optString("a", "");
                    int iOptInt2 = jSONObject.optInt("l", 1);
                    if (iOptInt2 != 2 && iOptInt2 != 3) {
                        iOptInt2 = 1;
                    }
                    sGLocation5.o = (byte) iOptInt2;
                    String strOptString = jSONObject.optString(SOAP.XMLNS, "");
                    if (!strOptString.trim().equals("")) {
                        d2.s = strOptString;
                    }
                    double dOptDouble = jSONObject.optDouble("alt", -10000.0d);
                    if (dOptDouble != 10000.0d && dOptDouble != -10000.0d) {
                        sGLocation5.k = j0.a(dOptDouble);
                        sGLocation5.w = true;
                    } else if (this.d.o == null) {
                        sGLocation5.k = -10000.0d;
                        sGLocation5.w = false;
                    } else {
                        sGLocation5.k = j0.a(this.d.p);
                        sGLocation5.w = true;
                    }
                    r0.b("mNetAltitude: " + sGLocation5.k);
                    sGLocation5.t = this.d.b.u();
                    r0.b("task.submitResult()");
                    g2.c(this.a, this.b, sGLocation5);
                } catch (Exception e2) {
                    r0.b(e2.getMessage());
                    r0.b(e2.getLocalizedMessage());
                    e2.printStackTrace();
                    SGLocation sGLocation6 = new SGLocation(2, "ERROR_NET_CONNECT");
                    r0.b("task.submitResult()");
                    g2.c(this.a, this.b, sGLocation6);
                }
            } catch (Throwable th) {
                r0.b("task.submitResult()");
                g2.c(this.a, this.b, null);
                throw th;
            }
        } catch (Throwable unused5) {
        }
    }

    public /* synthetic */ i2(d2 d2Var, g2 g2Var, b2 b2Var, byte b) {
        this(d2Var, g2Var, b2Var);
    }
}
