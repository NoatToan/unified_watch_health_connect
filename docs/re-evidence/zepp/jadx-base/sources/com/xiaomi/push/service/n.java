package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.push.by;
import com.xiaomi.push.db;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class n {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile n m;
    private final SharedPreferences a;
    private long h;
    private final boolean j;
    private final Context l;
    private final AtomicInteger b = new AtomicInteger(0);
    private String c = null;
    private volatile boolean d = false;
    private String e = null;
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicInteger g = new AtomicInteger(0);
    private int k = -1;
    private final boolean i = false;

    public static class a {
        public static String a() {
            return "support_wifi_digest";
        }

        public static String b(String str) {
            return String.format("HB_%s", str);
        }

        public static String c() {
            return "record_support_wifi_digest_reported";
        }

        public static String d(String str) {
            return String.format("HB_dead_time_%s", str);
        }

        public static String e() {
            return "record_hb_count_start";
        }

        public static String f() {
            return "record_short_hb_count";
        }

        public static String g() {
            return "record_long_hb_count";
        }

        public static String h() {
            return "record_hb_change";
        }

        public static String i() {
            return "record_mobile_ptc";
        }

        public static String j() {
            return "record_wifi_ptc";
        }

        public static String k() {
            return "record_ptc_start";
        }

        public static String l() {
            return "keep_short_hb_effective_time";
        }
    }

    private n(Context context) {
        this.l = context;
        this.j = com.xiaomi.channel.commonutils.android.f.m3427a(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.a = sharedPreferences;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(a.e(), -1L) == -1) {
            sharedPreferences.edit().putLong(a.e(), jCurrentTimeMillis).apply();
        }
        long j = sharedPreferences.getLong(a.k(), -1L);
        this.h = j;
        if (j == -1) {
            this.h = jCurrentTimeMillis;
            sharedPreferences.edit().putLong(a.k(), jCurrentTimeMillis).apply();
        }
    }

    public static n a(Context context) {
        if (m == null) {
            synchronized (n.class) {
                if (m == null) {
                    m = new n(context);
                }
            }
        }
        return m;
    }

    private int e() {
        if (TextUtils.isEmpty(this.c)) {
            return -1;
        }
        try {
            return this.a.getInt(a.b(this.c), -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private void f(String str, String str2, Map<String, String> map) {
    }

    private void g(boolean z) {
        if (o()) {
            int iIncrementAndGet = (z ? this.f : this.g).incrementAndGet();
            Object[] objArr = new Object[2];
            String str = SportAnalytics.ParamValue.PicType.SHORT;
            objArr[0] = z ? SportAnalytics.ParamValue.PicType.SHORT : SportAnalytics.ParamValue.PicType.LONG;
            objArr[1] = Integer.valueOf(iIncrementAndGet);
            com.xiaomi.channel.commonutils.logger.b.b(String.format("[HB] %s ping interval count: %s", objArr));
            if (iIncrementAndGet >= 5) {
                String strF = z ? a.f() : a.g();
                int i = this.a.getInt(strF, 0) + iIncrementAndGet;
                this.a.edit().putInt(strF, i).apply();
                Object[] objArr2 = new Object[2];
                if (!z) {
                    str = SportAnalytics.ParamValue.PicType.LONG;
                }
                objArr2[0] = str;
                objArr2[1] = Integer.valueOf(i);
                com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("[HB] accumulate %s hb count(%s) and write to file. ", objArr2));
                (z ? this.f : this.g).set(0);
            }
        }
    }

    private boolean h() {
        return this.b.get() >= Math.max(5, 3);
    }

    private boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    private long j() {
        return this.a.getLong(a.l(), -1L);
    }

    private void k(String str) {
        SharedPreferences.Editor editorRemove;
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = this.c;
            if (str2 == null || !str2.startsWith("W-")) {
                str = null;
                this.c = str;
            }
        } else {
            this.c = str;
        }
        int i = this.a.getInt(a.b(this.c), -1);
        long j = this.a.getLong(a.d(this.c), -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != -1) {
            if (j == -1) {
                editorRemove = this.a.edit().putLong(a.d(this.c), jCurrentTimeMillis + m());
            } else if (jCurrentTimeMillis > j) {
                editorRemove = this.a.edit().remove(a.b(this.c)).remove(a.d(this.c));
            }
            editorRemove.apply();
        }
        this.b.getAndSet(0);
        if (TextUtils.isEmpty(this.c) || e() != -1) {
            this.d = false;
        } else {
            this.d = true;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("[HB] network changed, netid:%s, %s", this.c, Boolean.valueOf(this.d)));
    }

    private boolean l() {
        return !TextUtils.isEmpty(this.c) && this.c.startsWith("M-");
    }

    private long m() {
        return 777600000L;
    }

    private void n(String str) {
        if (i(str)) {
            this.a.edit().putInt(a.b(str), 235000).apply();
            this.a.edit().putLong(a.d(this.c), System.currentTimeMillis() + m()).apply();
        }
    }

    private boolean o() {
        return false;
    }

    private void p(String str) {
        String str2;
        String string;
        if (o() && !TextUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = "W";
            } else if (!str.startsWith("M-")) {
                return;
            } else {
                str2 = "M";
            }
            String strValueOf = String.valueOf(235000);
            String strValueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":::");
            sb.append(str2);
            sb.append(":::");
            sb.append(strValueOf);
            sb.append(":::");
            sb.append(strValueOf2);
            String string2 = this.a.getString(a.h(), null);
            if (TextUtils.isEmpty(string2)) {
                string = sb.toString();
            } else {
                string = string2 + "###" + sb.toString();
            }
            this.a.edit().putString(a.h(), string).apply();
        }
    }

    private boolean q() {
        return this.j && (this.i || ((j() > System.currentTimeMillis() ? 1 : (j() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    private void r() {
        if (this.a.getBoolean(a.a(), false)) {
            return;
        }
        this.a.edit().putBoolean(a.a(), true).apply();
    }

    private boolean s() {
        long j = this.a.getLong(a.e(), -1L);
        if (j == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j > jCurrentTimeMillis || jCurrentTimeMillis - j >= 259200000;
    }

    private void t() {
        String strI;
        int i = this.k;
        if (i != 0) {
            strI = i != 1 ? null : a.j();
        } else {
            strI = a.i();
        }
        if (TextUtils.isEmpty(strI)) {
            return;
        }
        if (this.a.getLong(a.k(), -1L) == -1) {
            this.h = System.currentTimeMillis();
            this.a.edit().putLong(a.k(), this.h).apply();
        }
        this.a.edit().putInt(strI, this.a.getInt(strI, 0) + 1).apply();
    }

    private boolean u() {
        if (this.h == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.h;
        return j > jCurrentTimeMillis || jCurrentTimeMillis - j >= 259200000;
    }

    private void v() {
        int i;
        String[] strArrSplit;
        String[] strArrSplit2;
        if (o()) {
            String string = this.a.getString(a.h(), null);
            char c = 1;
            char c2 = 0;
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split("###")) != null) {
                int i2 = 0;
                while (i2 < strArrSplit.length) {
                    if (!TextUtils.isEmpty(strArrSplit[i2]) && (strArrSplit2 = strArrSplit[i2].split(":::")) != null && strArrSplit2.length >= 4) {
                        String str = strArrSplit2[c2];
                        String str2 = strArrSplit2[c];
                        String str3 = strArrSplit2[2];
                        String str4 = strArrSplit2[3];
                        HashMap map = new HashMap();
                        map.put("event", "change");
                        map.put("model", Build.MODEL);
                        map.put("net_type", str2);
                        map.put("net_name", str);
                        map.put("interval", str3);
                        map.put("timestamp", str4);
                        f("category_hb_change", null, map);
                        com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] report hb changed events.");
                    }
                    i2++;
                    c = 1;
                    c2 = 0;
                }
                this.a.edit().remove(a.h()).apply();
            }
            if (this.a.getBoolean(a.a(), false) && !this.a.getBoolean(a.c(), false)) {
                HashMap map2 = new HashMap();
                map2.put("event", "support");
                map2.put("model", Build.MODEL);
                map2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                f("category_hb_change", null, map2);
                com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] report support wifi digest events.");
                this.a.edit().putBoolean(a.c(), true).apply();
            }
            if (s()) {
                int i3 = this.a.getInt(a.f(), 0);
                int i4 = this.a.getInt(a.g(), 0);
                if (i3 > 0 || i4 > 0) {
                    long j = this.a.getLong(a.e(), -1L);
                    String strValueOf = String.valueOf(235000);
                    String strValueOf2 = String.valueOf(j);
                    String strValueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("interval", strValueOf);
                        jSONObject.put("c_short", String.valueOf(i3));
                        jSONObject.put("c_long", String.valueOf(i4));
                        jSONObject.put("count", String.valueOf(i3 + i4));
                        jSONObject.put("start_time", strValueOf2);
                        jSONObject.put("end_time", strValueOf3);
                        String string2 = jSONObject.toString();
                        HashMap map3 = new HashMap();
                        map3.put("event", "long_and_short_hb_count");
                        f("category_hb_count", string2, map3);
                        com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.a.edit().putInt(a.f(), 0).putInt(a.g(), 0).putLong(a.e(), System.currentTimeMillis()).apply();
            }
            if (u()) {
                String strValueOf4 = String.valueOf(this.h);
                String strValueOf5 = String.valueOf(System.currentTimeMillis());
                int i5 = this.a.getInt(a.i(), 0);
                if (i5 > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("net_type", "M");
                        jSONObject2.put("ptc", i5);
                        jSONObject2.put("start_time", strValueOf4);
                        jSONObject2.put("end_time", strValueOf5);
                        String string3 = jSONObject2.toString();
                        HashMap map4 = new HashMap();
                        map4.put("event", "ptc_event");
                        f("category_lc_ptc", string3, map4);
                        com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] report ping timeout count events of mobile network.");
                        this.a.edit().putInt(a.i(), 0).apply();
                    } catch (Throwable unused2) {
                        i = 0;
                        this.a.edit().putInt(a.i(), 0).apply();
                    }
                }
                i = 0;
                int i6 = this.a.getInt(a.j(), i);
                if (i6 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("net_type", "W");
                        jSONObject3.put("ptc", i6);
                        jSONObject3.put("start_time", strValueOf4);
                        jSONObject3.put("end_time", strValueOf5);
                        String string4 = jSONObject3.toString();
                        HashMap map5 = new HashMap();
                        map5.put("event", "ptc_event");
                        f("category_lc_ptc", string4, map5);
                        com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.a.edit().putInt(a.j(), 0).apply();
                }
                this.h = System.currentTimeMillis();
                this.a.edit().putLong(a.k(), this.h).apply();
            }
        }
    }

    public long a() {
        int iE;
        long jB = by.b();
        if (this.j && !l() && ((at.a(this.l).a(db.IntelligentHeartbeatSwitchBoolean.a(), true) || j() >= System.currentTimeMillis()) && (iE = e()) != -1)) {
            jB = iE;
        }
        if (!TextUtils.isEmpty(this.c) && !"WIFI-ID-UNKNOWN".equals(this.c) && this.k == 1) {
            g(jB < 300000);
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] ping interval:" + jB);
        return jB;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3833a() {
    }

    public void a(int i) {
        this.a.edit().putLong(a.l(), System.currentTimeMillis() + ((long) (i * 1000))).apply();
    }

    public synchronized void a(NetworkInfo networkInfo) {
        if (q()) {
            String str = null;
            if (networkInfo == null) {
                k(null);
            } else if (networkInfo.getType() == 0) {
                String subtypeName = networkInfo.getSubtypeName();
                if (!TextUtils.isEmpty(subtypeName) && !"UNKNOWN".equalsIgnoreCase(subtypeName)) {
                    str = "M-" + subtypeName;
                }
                k(str);
                this.k = 0;
            } else if (networkInfo.getType() == 1 || networkInfo.getType() == 6) {
                k("WIFI-ID-UNKNOWN");
                this.k = 1;
            } else {
                k(null);
            }
            this.k = -1;
        }
    }

    public synchronized void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            r();
        }
        if (q() && !TextUtils.isEmpty(str)) {
            k("W-" + str);
        }
    }

    public void b() {
        if (q()) {
            t();
            if (this.d && !TextUtils.isEmpty(this.c) && this.c.equals(this.e)) {
                this.b.getAndIncrement();
                com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] ping timeout count:" + this.b);
                if (h()) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] change hb interval for net:" + this.c);
                    n(this.c);
                    this.d = false;
                    this.b.getAndSet(0);
                    p(this.c);
                }
            }
        }
    }

    public void c() {
        if (q()) {
            this.e = this.c;
        }
    }

    public void d() {
        if (q()) {
            v();
            if (this.d) {
                this.b.getAndSet(0);
            }
        }
    }
}
