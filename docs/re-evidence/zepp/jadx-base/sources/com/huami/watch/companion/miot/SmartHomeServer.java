package com.huami.watch.companion.miot;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SmartHomeServer implements Transporter.DataListener {
    private static final boolean g = true;
    private static final String h = "SmartHomeServer";
    private static final String i = "com.huami.watch.action.SMARTHOME_INFO";
    private static final String j = "huami.intent.action.SMARTHOME_WATCH_INFO";
    private static final String k = "data";
    private static final int l = 101;
    private static final int m = 102;
    private static final int n = 103;
    private static final int o = 104;
    private static final String p = "uid";
    private static final String q = "did";
    private static final String r = "macAddress";
    private static final String s = "token";
    private static final String t = "expire";
    private static final String u = "sessionId";
    private static SmartHomeServer v = null;
    private static final String w = "miot_infos";
    private Context a;
    private Transporter b;
    private HandlerThread c;
    private b d;
    private String e;
    private ConcurrentHashMap<String, a> f = new ConcurrentHashMap<>();

    public static class a {
        private static final int h = 7200;
        private static final String i = "|";
        private static final String j = "\\|";
        private String a;
        private String b;
        private String c;
        private int d;
        private String e;
        private long f;
        private String g;

        private a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j(String str, String str2, String str3) {
            String str4;
            String str5;
            String str6 = this.a;
            return str6 != null && str6.equals(str) && (str4 = this.b) != null && str4.equals(str2) && (str5 = this.c) != null && str5.equals(str3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a k(String str) {
            String[] strArrSplit;
            if (str == null || (strArrSplit = str.split(j)) == null || strArrSplit.length <= 3) {
                return null;
            }
            a aVar = new a(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            aVar.d = Integer.parseInt(strArrSplit[3]);
            if (strArrSplit.length > 5) {
                aVar.e = strArrSplit[4];
                aVar.f = Long.parseLong(strArrSplit[5]);
                aVar.g = strArrSplit[6];
            }
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String l() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String m() {
            if (this.e == null) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f;
            if (jCurrentTimeMillis >= 0 || Math.abs(jCurrentTimeMillis / 1000) >= TimeUtils.TIME_2_HOURS) {
                return null;
            }
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String n() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o() {
            return this.d == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(boolean z) {
            this.d = z ? 1 : 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(String str, String str2, String str3) {
            if (str != null) {
                this.e = str;
                this.g = str3;
                try {
                    int i2 = Integer.parseInt(str2);
                    if (i2 <= 0 || i2 >= h) {
                        return;
                    }
                    this.f = System.currentTimeMillis() + ((long) (i2 * 1000));
                } catch (NumberFormatException unused) {
                    this.f = System.currentTimeMillis();
                }
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.a);
            stringBuffer.append("|");
            stringBuffer.append(this.b);
            stringBuffer.append("|");
            stringBuffer.append(this.c);
            stringBuffer.append("|");
            stringBuffer.append(this.d);
            if (this.e != null) {
                stringBuffer.append("|");
                stringBuffer.append(this.e);
                stringBuffer.append("|");
                stringBuffer.append(this.f);
                stringBuffer.append("|");
                stringBuffer.append(this.g);
            }
            return stringBuffer.toString();
        }
    }

    public class b extends Handler {
        private b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 101:
                    DataBundle dataBundle = (DataBundle) message.obj;
                    if (dataBundle != null) {
                        String string = dataBundle.getString("mac");
                        String string2 = dataBundle.getString("uid");
                        String string3 = dataBundle.getString(SmartHomeServer.q);
                        Log.d(SmartHomeServer.h, "SmartHomeServer receive watchinfo: mac:" + string + " did:" + string3 + " uid:" + string2, new Object[0]);
                        if (string != null) {
                            a aVar = (a) SmartHomeServer.this.f.get(string);
                            if (aVar == null || !aVar.j(string, string2, string3)) {
                                Log.d(SmartHomeServer.h, "device info not found or need update.", new Object[0]);
                                aVar = new a(string, string2, string3);
                                SmartHomeServer.this.p(aVar);
                            } else {
                                Log.d(SmartHomeServer.h, "  device info already exists.", new Object[0]);
                            }
                            SmartHomeServer.this.e = string;
                            if (aVar.o()) {
                                Log.d(SmartHomeServer.h, "  device info already registered.", new Object[0]);
                            } else {
                                Log.d(SmartHomeServer.h, "device info not registered.", new Object[0]);
                                aVar.p(SmartHomeServer.this.j(string, string2, string3));
                                SmartHomeServer.this.p(aVar);
                            }
                            if (aVar.m() != null) {
                                Log.d(SmartHomeServer.h, "  device voice token does not expire.", new Object[0]);
                            } else {
                                Log.d(SmartHomeServer.h, "device voice token has expired or empty, request.", new Object[0]);
                                SmartHomeServer.this.o(string, true);
                            }
                        } else {
                            Log.e(SmartHomeServer.h, "  mac can not be null.", new Object[0]);
                        }
                    }
                    break;
                case 102:
                    SmartHomeServer.this.i();
                    break;
                case 103:
                    SmartHomeServer.this.p((a) SmartHomeServer.this.f.get((String) message.obj));
                    break;
                case 104:
                    SmartHomeServer.this.o((String) message.obj, true);
                    break;
            }
        }
    }

    private SmartHomeServer(Context context) {
        this.a = context;
        h();
        HandlerThread handlerThread = new HandlerThread("SmartHomeServer-Work");
        this.c = handlerThread;
        handlerThread.start();
        b bVar = new b(this.c.getLooper());
        this.d = bVar;
        bVar.sendEmptyMessage(102);
    }

    public static SmartHomeServer get() {
        return v;
    }

    private void h() {
        Transporter transporter = Transporter.get(this.a, "com.huami.smarthome");
        this.b = transporter;
        transporter.connectTransportService();
        this.b.addDataListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Log.d(h, "loadSavedInfos.", new Object[0]);
        for (Map.Entry<String, ?> entry : this.a.getSharedPreferences(w, 0).getAll().entrySet()) {
            if (entry.getValue() != null) {
                a aVarK = a.k((String) entry.getValue());
                Log.d(h, "  load info: " + aVarK, new Object[0]);
                if (aVarK != null) {
                    this.f.put(aVarK.a, aVarK);
                    if (this.e == null) {
                        this.e = aVarK.a;
                    }
                    if (aVarK.m() == null) {
                        this.d.obtainMessage(104, aVarK.a).sendToTarget();
                    }
                }
            }
        }
    }

    public static void init(Context context) {
        if (v == null) {
            v = new SmartHomeServer(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(String str, String str2, String str3) {
        Log.d(h, "miotPostBind. mac: " + str + " uid:" + str2 + " did:" + str3, new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("uid", str2);
            jSONObject.putOpt(q, str3);
            jSONObject.putOpt("macAddress", str);
        } catch (JSONException unused) {
        }
        try {
            Response responseDoRequest = CloudClient.doRequest(this.a, CloudClient.newPost(Cloud.urlMiotPostBind(), jSONObject.toString(), "application/json; charset=utf-8"));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                Log.d(h, "  MIOT Bind Successed! " + responseDoRequest.code(), new Object[0]);
                return true;
            }
            Log.e(h, "  MIOT Bind Failed! " + responseDoRequest.code() + " msg: " + strResponseBodyString, new Object[0]);
            return false;
        } catch (IOException e) {
            Log.e(h, "  MIOT Bind Failed!", e, new Object[0]);
        }
    }

    private boolean k(String str, String str2, String str3) {
        Log.d(h, "miotPostUnBind. mac: " + str + " uid:" + str2 + " did:" + str3, new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("uid", str2);
            jSONObject.putOpt(q, str3);
            jSONObject.putOpt("macAddress", str);
        } catch (JSONException unused) {
        }
        try {
            Response responseDoRequest = CloudClient.doRequest(this.a, CloudClient.newPost(Cloud.urlMiotPostUnBind(), jSONObject.toString(), "application/json; charset=utf-8"));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                Log.d(h, "  MIOT UnBind Successed! " + responseDoRequest.code(), new Object[0]);
                return true;
            }
            Log.e(h, "  MIOT UnBind Failed! " + responseDoRequest.code() + " msg: " + strResponseBodyString, new Object[0]);
            return false;
        } catch (IOException e) {
            Log.e(h, "  MIOT UnBind Failed!", e, new Object[0]);
        }
    }

    private void l(String str, DataBundle dataBundle) {
        if (i.equals(str)) {
            this.d.obtainMessage(101, dataBundle).sendToTarget();
        }
    }

    private void m() {
        n();
        b bVar = this.d;
        if (bVar != null) {
            bVar.removeMessages(0);
        }
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.getLooper().quitSafely();
            this.c = null;
        }
    }

    private void n() {
        this.b.disconnectTransportService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String o(String str, boolean z) {
        String str2 = h;
        Log.d(str2, "requestMiotToken mac: " + str + " forced " + z, new Object[0]);
        a aVar = this.f.get(str);
        if (aVar == null) {
            Log.e(str2, "  MIOT Token Request Failed! Device is not registered.", new Object[0]);
            return null;
        }
        if (!z && aVar.m() != null) {
            return aVar.m();
        }
        HashMap map = new HashMap();
        map.put("macAddress", str);
        try {
            Response responseDoRequest = CloudClient.doRequest(this.a, CloudClient.newGet(Cloud.urlMiotGetToken(), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (!responseDoRequest.isSuccessful()) {
                Log.e(str2, "  MIOT Token Request Failed! " + responseDoRequest.code() + " msg: " + strResponseBodyString, new Object[0]);
                return null;
            }
            Log.d(str2, "  MIOT Token Request Successed! " + strResponseBodyString, new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(strResponseBodyString);
                String strOptString = jSONObject.optString("token");
                String strOptString2 = jSONObject.optString(t);
                String strOptString3 = jSONObject.optString("sessionId");
                Log.d(str2, "  Decode miotToken: " + strOptString + " expire: " + strOptString2 + " miotSessionId: " + strOptString3, new Object[0]);
                aVar.q(strOptString, strOptString2, strOptString3);
                this.d.obtainMessage(103, str).sendToTarget();
                return strOptString;
            } catch (JSONException e) {
                Log.e(h, "  MIOT Token Decode Failed!", e, new Object[0]);
                return null;
            }
        } catch (IOException e2) {
            Log.e(h, "  MIOT Token Request Failed!", e2, new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(a aVar) {
        if (aVar != null) {
            Log.d(h, "saveMiotInfo " + aVar, new Object[0]);
            this.f.put(aVar.a, aVar);
            this.a.getSharedPreferences(w, 0).edit().putString(aVar.a, aVar.toString()).commit();
        }
    }

    public static void release() {
        SmartHomeServer smartHomeServer = v;
        if (smartHomeServer != null) {
            smartHomeServer.m();
        }
    }

    public String getMiotSessionId() {
        return getMiotSessionId(this.e);
    }

    public String getMiotToken() {
        return getMiotToken(this.e);
    }

    public String getMiotUid() {
        return getMiotUid(this.e);
    }

    @Override // com.huami.watch.transport.Transporter.DataListener
    public void onDataReceived(TransportDataItem transportDataItem) {
        try {
            l(transportDataItem.getAction(), transportDataItem.getData());
        } catch (Exception unused) {
        }
    }

    public String getMiotSessionId(String str) {
        a aVar;
        if (str == null || (aVar = this.f.get(str)) == null) {
            return null;
        }
        return aVar.l();
    }

    public String getMiotToken(String str) {
        a aVar;
        if (str == null || (aVar = this.f.get(str)) == null) {
            return null;
        }
        String strM = aVar.m();
        if (strM != null) {
            return strM;
        }
        this.d.obtainMessage(104, str).sendToTarget();
        return null;
    }

    public String getMiotUid(String str) {
        a aVar;
        if (str == null || (aVar = this.f.get(str)) == null) {
            return null;
        }
        return aVar.n();
    }
}
