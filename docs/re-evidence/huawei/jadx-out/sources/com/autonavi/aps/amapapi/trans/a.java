package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.im;
import com.amap.api.col.p0003sl.kt;
import com.amap.api.col.p0003sl.la;
import com.amap.api.col.p0003sl.ma;
import com.amap.api.col.p0003sl.mb;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.j;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3979a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f3980b = 2;
    private static a e;
    private Context j;
    private String k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f3981c = 0;
    private boolean d = false;
    private ArrayList<String> f = new ArrayList<>();
    private com.autonavi.aps.amapapi.d g = new com.autonavi.aps.amapapi.d();
    private com.autonavi.aps.amapapi.d h = new com.autonavi.aps.amapapi.d();
    private long i = 120000;
    private boolean l = false;

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (e == null) {
                e = new a(context);
            }
            aVar = e;
        }
        return aVar;
    }

    private a(Context context) {
        this.j = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.autonavi.aps.amapapi.d b(int i) {
        if (i == f3980b) {
            return this.h;
        }
        return this.g;
    }

    private static String c(int i) {
        if (i == f3980b) {
            return "last_ip_6";
        }
        return "last_ip_4";
    }

    public final String a(d dVar, int i) {
        try {
            if (com.autonavi.aps.amapapi.utils.b.q() && dVar != null) {
                String url = dVar.getURL();
                String host = new URL(url).getHost();
                if (!"http://abroad.apilocate.amap.com/mobile/binary".equals(url) && !"abroad.apilocate.amap.com".equals(host)) {
                    String str = "apilocate.amap.com".equalsIgnoreCase(host) ? "httpdns.apilocate.amap.com" : host;
                    if (!im.g(str)) {
                        return null;
                    }
                    String strE = e(i);
                    if (!TextUtils.isEmpty(strE)) {
                        dVar.c(url.replace(host, strE));
                        dVar.getRequestHead().put("host", str);
                        dVar.d(str);
                        dVar.setIPV6Request(i == f3980b);
                        return strE;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void a(int i) {
        if (!b(i).e()) {
            this.f.add(b(i).b());
            d(i);
            b(true, i);
            return;
        }
        d(i);
    }

    public final void a(boolean z, int i) {
        b(i).b(z);
        if (z) {
            String strC = b(i).c();
            String strB = b(i).b();
            if (TextUtils.isEmpty(strB) || strB.equals(strC)) {
                return;
            }
            SharedPreferences.Editor editorA = j.a(this.j, "cbG9jaXA");
            j.a(editorA, c(i), strB);
            j.a(editorA);
        }
    }

    private void d(int i) {
        if (b(i).d()) {
            SharedPreferences.Editor editorA = j.a(this.j, "cbG9jaXA");
            j.a(editorA, c(i));
            j.a(editorA);
            b(i).a(false);
        }
    }

    private String e(int i) {
        String str;
        int i2 = 0;
        b(false, i);
        String[] strArrA = b(i).a();
        if (strArrA != null && strArrA.length > 0) {
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
        g(i);
        return b(i).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        if (b(i).a() == null || b(i).a().length <= 0) {
            return;
        }
        String str = b(i).a()[0];
        if (str.equals(this.k) || this.f.contains(str)) {
            return;
        }
        this.k = str;
        SharedPreferences.Editor editorA = j.a(this.j, "cbG9jaXA");
        j.a(editorA, c(i), str);
        j.a(editorA);
    }

    private void g(int i) {
        String strA = j.a(this.j, "cbG9jaXA", c(i), (String) null);
        if (TextUtils.isEmpty(strA) || this.f.contains(strA)) {
            return;
        }
        b(i).a(strA);
        b(i).b(strA);
        b(i).a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String[] strArr, String[] strArr2) {
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

    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000f, B:12:0x0017, B:21:0x002f, B:23:0x0049, B:24:0x007e), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0024 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002d A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[Catch: all -> 0x008c, LOOP:0: B:22:0x0047->B:23:0x0049, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000f, B:12:0x0017, B:21:0x002f, B:23:0x0049, B:24:0x007e), top: B:30:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0049, please report this as an issue */
    private void b(boolean z, final int i) {
        StackTraceElement[] stackTrace;
        StringBuffer stringBuffer;
        int i2;
        long jCurrentTimeMillis;
        synchronized (this) {
            if (!z) {
                if (!com.autonavi.aps.amapapi.utils.b.p() && this.l) {
                    return;
                }
                if (this.f3981c != 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - this.f3981c;
                    if (jCurrentTimeMillis < this.i) {
                        return;
                    }
                    if (jCurrentTimeMillis < 60000) {
                        return;
                    }
                }
                this.f3981c = System.currentTimeMillis();
                this.l = true;
                stackTrace = Thread.currentThread().getStackTrace();
                stringBuffer = new StringBuffer();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.getClassName() + Constants.LEFT_BRACKET_ONLY + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber() + "),");
                }
                ma.a().a(new mb() { // from class: com.autonavi.aps.amapapi.trans.a.1
                    @Override // com.amap.api.col.p0003sl.mb
                    public final void runTask() {
                        int i3;
                        StringBuilder sb = new StringBuilder("http://");
                        sb.append(com.autonavi.aps.amapapi.utils.b.r());
                        sb.append("?host=dualstack-a.apilocate.amap.com&query=");
                        sb.append(i == a.f3980b ? 6 : 4);
                        String string = sb.toString();
                        b bVar = new b();
                        bVar.a(string);
                        bVar.b(string);
                        bVar.setDegradeAbility(la.a.SINGLE);
                        bVar.setHttpProtocol(la.c.HTTP);
                        try {
                            kt.a();
                            JSONObject jSONObject = new JSONObject(new String(kt.a(bVar).f3037a));
                            String[] strArrB = a.b(jSONObject.optJSONArray("ips"), a.f3979a);
                            if (strArrB != null && strArrB.length > 0 && !a.b(strArrB, a.this.b(a.f3979a).a())) {
                                a.this.b(a.f3979a).a(strArrB);
                                a.this.f(a.f3979a);
                            }
                            String[] strArrB2 = a.b(jSONObject.optJSONArray("ipsv6"), a.f3980b);
                            if (strArrB2 != null && strArrB2.length > 0 && !a.b(strArrB2, a.this.b(a.f3980b).a())) {
                                a.this.b(a.f3980b).a(strArrB2);
                                a.this.f(a.f3980b);
                            }
                            if ((jSONObject.has("ips") || jSONObject.has("ipsv6")) && jSONObject.has("ttl") && (i3 = jSONObject.getInt("ttl")) > 30) {
                                a.this.i = i3 * 1000;
                            }
                        } catch (Throwable th) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put(MedalConstants.EVENT_KEY, "dnsError");
                                jSONObject2.put("reason", th.getMessage());
                            } catch (Throwable unused) {
                            }
                            i.a(a.this.j, "O018", jSONObject2);
                        }
                    }
                });
                return;
            }
            if (this.f3981c != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.f3981c;
                if (jCurrentTimeMillis < this.i) {
                    return;
                }
                if (jCurrentTimeMillis < 60000) {
                    return;
                }
            }
            this.f3981c = System.currentTimeMillis();
            this.l = true;
            stackTrace = Thread.currentThread().getStackTrace();
            stringBuffer = new StringBuffer();
            while (i2 < r1) {
                stringBuffer.append(stackTraceElement.getClassName() + Constants.LEFT_BRACKET_ONLY + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber() + "),");
            }
            ma.a().a(new mb() { // from class: com.autonavi.aps.amapapi.trans.a.1
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    int i3;
                    StringBuilder sb = new StringBuilder("http://");
                    sb.append(com.autonavi.aps.amapapi.utils.b.r());
                    sb.append("?host=dualstack-a.apilocate.amap.com&query=");
                    sb.append(i == a.f3980b ? 6 : 4);
                    String string = sb.toString();
                    b bVar = new b();
                    bVar.a(string);
                    bVar.b(string);
                    bVar.setDegradeAbility(la.a.SINGLE);
                    bVar.setHttpProtocol(la.c.HTTP);
                    try {
                        kt.a();
                        JSONObject jSONObject = new JSONObject(new String(kt.a(bVar).f3037a));
                        String[] strArrB = a.b(jSONObject.optJSONArray("ips"), a.f3979a);
                        if (strArrB != null && strArrB.length > 0 && !a.b(strArrB, a.this.b(a.f3979a).a())) {
                            a.this.b(a.f3979a).a(strArrB);
                            a.this.f(a.f3979a);
                        }
                        String[] strArrB2 = a.b(jSONObject.optJSONArray("ipsv6"), a.f3980b);
                        if (strArrB2 != null && strArrB2.length > 0 && !a.b(strArrB2, a.this.b(a.f3980b).a())) {
                            a.this.b(a.f3980b).a(strArrB2);
                            a.this.f(a.f3980b);
                        }
                        if ((jSONObject.has("ips") || jSONObject.has("ipsv6")) && jSONObject.has("ttl") && (i3 = jSONObject.getInt("ttl")) > 30) {
                            a.this.i = i3 * 1000;
                        }
                    } catch (Throwable th) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(MedalConstants.EVENT_KEY, "dnsError");
                            jSONObject2.put("reason", th.getMessage());
                        } catch (Throwable unused) {
                        }
                        i.a(a.this.j, "O018", jSONObject2);
                    }
                }
            });
            return;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] b(JSONArray jSONArray, int i) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new String[0];
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            if (!TextUtils.isEmpty(string)) {
                if (i == f3980b) {
                    string = "[" + string + "]";
                }
                strArr[i2] = string;
            }
        }
        return strArr;
    }
}
