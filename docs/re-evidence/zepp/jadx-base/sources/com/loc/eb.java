package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huami.passport.Configs;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class eb {
    public static int a = 1;
    public static int b = 2;
    private static eb e;
    private Context j;
    private String k;
    private long c = 0;
    private boolean d = false;
    private ArrayList<String> f = new ArrayList<>();
    private dp g = new dp();
    private dp h = new dp();
    private long i = 120000;
    private boolean l = false;

    private eb(Context context) {
        this.j = context;
    }

    public static synchronized eb a(Context context) {
        if (e == null) {
            e = new eb(context);
        }
        return e;
    }

    public static /* synthetic */ boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0 || strArr.length != strArr2.length) {
            return false;
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (!strArr[i].equals(strArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String[] a(JSONArray jSONArray, int i) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new String[0];
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            if (!TextUtils.isEmpty(string)) {
                if (i == b) {
                    string = "[" + string + "]";
                }
                strArr[i2] = string;
            }
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dp b(int i) {
        return i == b ? this.h : this.g;
    }

    public static /* synthetic */ void b(eb ebVar, int i) {
        if (ebVar.b(i).a() == null || ebVar.b(i).a().length <= 0) {
            return;
        }
        String str = ebVar.b(i).a()[0];
        if (str.equals(ebVar.k) || ebVar.f.contains(str)) {
            return;
        }
        ebVar.k = str;
        SharedPreferences.Editor editorA = en.a(ebVar.j, "cbG9jaXA");
        en.a(editorA, c(i), str);
        en.a(editorA);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000f, B:12:0x0017, B:21:0x0031, B:23:0x004b, B:24:0x0080), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0025 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x008e, LOOP:0: B:22:0x0049->B:23:0x004b, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000f, B:12:0x0017, B:21:0x0031, B:23:0x004b, B:24:0x0080), top: B:30:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0025, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x002f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x004b, please report this as an issue */
    private synchronized void b(boolean z, final int i) {
        StackTraceElement[] stackTrace;
        StringBuffer stringBuffer;
        int i2;
        long jCurrentTimeMillis;
        long j;
        if (z) {
            if (this.c != 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                j = this.c;
                if (jCurrentTimeMillis - j < this.i) {
                    return;
                }
                if (jCurrentTimeMillis - j < 60000) {
                    return;
                }
            }
            this.c = System.currentTimeMillis();
            this.l = true;
            stackTrace = Thread.currentThread().getStackTrace();
            stringBuffer = new StringBuffer();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.getClassName() + "(" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber() + "),");
            }
            ab.d().submit(new Runnable() { // from class: com.loc.eb.1
                @Override // java.lang.Runnable
                public final void run() {
                    int i3;
                    StringBuilder sb = new StringBuilder("http://");
                    sb.append(eh.y());
                    sb.append("?host=dualstack.apilocate.amap.com&query=");
                    sb.append(i == eb.b ? 6 : 4);
                    String string = sb.toString();
                    ec ecVar = new ec();
                    ecVar.f = string;
                    ecVar.b(string);
                    try {
                        aq.a();
                        JSONObject jSONObject = new JSONObject(new String(aq.b(ecVar)));
                        String[] strArrA = eb.a(jSONObject.optJSONArray(Configs.Params.IPS), eb.a);
                        if (strArrA.length > 0 && !eb.a(strArrA, eb.this.b(eb.a).a())) {
                            eb.this.b(eb.a).a(strArrA);
                            eb.b(eb.this, eb.a);
                        }
                        String[] strArrA2 = eb.a(jSONObject.optJSONArray("ipsv6"), eb.b);
                        if (strArrA2.length > 0 && !eb.a(strArrA2, eb.this.b(eb.b).a())) {
                            eb.this.b(eb.b).a(strArrA2);
                            eb.b(eb.this, eb.b);
                        }
                        if ((jSONObject.has(Configs.Params.IPS) || jSONObject.has("ipsv6")) && jSONObject.has("ttl") && (i3 = jSONObject.getInt("ttl")) > 30) {
                            eb.this.i = i3 * 1000;
                        }
                    } catch (Throwable th) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("key", "dnsError");
                            jSONObject2.put("reason", th.getMessage());
                        } catch (Throwable unused) {
                        }
                        em.a(eb.this.j, "O018", jSONObject2);
                    }
                }
            });
            return;
        }
        if (!eh.v() && this.l) {
            return;
        }
        if (this.c != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            j = this.c;
            if (jCurrentTimeMillis - j < this.i) {
                return;
            }
            if (jCurrentTimeMillis - j < 60000) {
                return;
            }
        }
        this.c = System.currentTimeMillis();
        this.l = true;
        stackTrace = Thread.currentThread().getStackTrace();
        stringBuffer = new StringBuffer();
        while (i2 < r1) {
            stringBuffer.append(stackTraceElement.getClassName() + "(" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber() + "),");
        }
        ab.d().submit(new Runnable() { // from class: com.loc.eb.1
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                StringBuilder sb = new StringBuilder("http://");
                sb.append(eh.y());
                sb.append("?host=dualstack.apilocate.amap.com&query=");
                sb.append(i == eb.b ? 6 : 4);
                String string = sb.toString();
                ec ecVar = new ec();
                ecVar.f = string;
                ecVar.b(string);
                try {
                    aq.a();
                    JSONObject jSONObject = new JSONObject(new String(aq.b(ecVar)));
                    String[] strArrA = eb.a(jSONObject.optJSONArray(Configs.Params.IPS), eb.a);
                    if (strArrA.length > 0 && !eb.a(strArrA, eb.this.b(eb.a).a())) {
                        eb.this.b(eb.a).a(strArrA);
                        eb.b(eb.this, eb.a);
                    }
                    String[] strArrA2 = eb.a(jSONObject.optJSONArray("ipsv6"), eb.b);
                    if (strArrA2.length > 0 && !eb.a(strArrA2, eb.this.b(eb.b).a())) {
                        eb.this.b(eb.b).a(strArrA2);
                        eb.b(eb.this, eb.b);
                    }
                    if ((jSONObject.has(Configs.Params.IPS) || jSONObject.has("ipsv6")) && jSONObject.has("ttl") && (i3 = jSONObject.getInt("ttl")) > 30) {
                        eb.this.i = i3 * 1000;
                    }
                } catch (Throwable th) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("key", "dnsError");
                        jSONObject2.put("reason", th.getMessage());
                    } catch (Throwable unused) {
                    }
                    em.a(eb.this.j, "O018", jSONObject2);
                }
            }
        });
        return;
        throw th;
    }

    private static String c(int i) {
        return i == b ? "last_ip_6" : "last_ip_4";
    }

    private void d(int i) {
        if (b(i).d()) {
            SharedPreferences.Editor editorA = en.a(this.j, "cbG9jaXA");
            try {
                editorA.remove(c(i));
            } catch (Throwable th) {
                ei.a(th, "SpUtil", "setPrefsLong");
            }
            en.a(editorA);
            b(i).a(false);
        }
    }

    private String e(int i) {
        String str;
        int i2 = 0;
        b(false, i);
        String[] strArrA = b(i).a();
        if (strArrA == null || strArrA.length <= 0) {
            String strA = en.a(this.j, "cbG9jaXA", c(i), (String) null);
            if (!TextUtils.isEmpty(strA) && !this.f.contains(strA)) {
                b(i).a(strA);
                b(i).b(strA);
                b(i).a(true);
            }
            return b(i).b();
        }
        int length = strArrA.length;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            str = strArrA[i2];
            if (!this.f.contains(str)) {
                break;
            }
            i2++;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b(i).a(str);
        return str;
    }

    public final String a(ee eeVar, int i) {
        try {
            if (eh.w() && eeVar != null) {
                String strC = eeVar.c();
                String host = new URL(strC).getHost();
                if (!"http://abroad.apilocate.amap.com/mobile/binary".equals(strC) && !"abroad.apilocate.amap.com".equals(host)) {
                    String str = "apilocate.amap.com".equalsIgnoreCase(host) ? "httpdns.apilocate.amap.com" : host;
                    String strE = e(i);
                    if (!TextUtils.isEmpty(strE)) {
                        if (i == b) {
                            eeVar.h = strC.replace(host, strE);
                        } else {
                            eeVar.g = strC.replace(host, strE);
                        }
                        eeVar.b().put("host", str);
                        eeVar.c(str);
                        return strE;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void a(int i) {
        if (b(i).e()) {
            d(i);
            return;
        }
        this.f.add(b(i).b());
        d(i);
        b(true, i);
    }

    public final void a(boolean z, int i) {
        b(i).b(z);
        if (z) {
            String strC = b(i).c();
            String strB = b(i).b();
            if (TextUtils.isEmpty(strB) || strB.equals(strC)) {
                return;
            }
            SharedPreferences.Editor editorA = en.a(this.j, "cbG9jaXA");
            en.a(editorA, c(i), strB);
            en.a(editorA);
        }
    }
}
