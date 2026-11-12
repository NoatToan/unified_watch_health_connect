package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.push.Cif;
import com.xiaomi.push.g;
import com.xiaomi.push.ig;
import com.xiaomi.push.m;
import com.xiaomi.push.service.n0;
import com.xiaomi.push.service.o0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class cdt {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile cdt n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5232a;
    public long h;
    public final boolean i;
    public final boolean j;
    public final Context l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f5233b = new AtomicInteger(0);
    public String c = null;
    public volatile boolean d = false;
    public String e = null;
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicInteger g = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5234k = -1;
    public long m = -1;

    public static class a {
        public static String a() {
            return "support_wifi_digest";
        }

        public static String b(String str) {
            return String.format("HB_%s", str);
        }

        public static String c() {
            return "record_support_wifi_digest_reported_time";
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

    public cdt(Context context) {
        this.l = context;
        this.j = y0t.j(context);
        this.i = vas.d(context).m(ig.IntelligentHeartbeatSwitchBoolean.a(), true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f5232a = sharedPreferences;
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

    public static cdt c(Context context) {
        if (n == null) {
            synchronized (cdt.class) {
                try {
                    if (n == null) {
                        n = new cdt(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return n;
    }

    public final boolean A() {
        if (this.h == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.h;
        return j > jCurrentTimeMillis || jCurrentTimeMillis - j >= 259200000;
    }

    public final void B() {
        int i;
        String[] strArrSplit;
        String[] strArrSplit2;
        if (s()) {
            String string = this.f5232a.getString(a.h(), null);
            char c = 0;
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split("###")) != null) {
                int i2 = 0;
                while (i2 < strArrSplit.length) {
                    if (!TextUtils.isEmpty(strArrSplit[i2]) && (strArrSplit2 = strArrSplit[i2].split(":::")) != null && strArrSplit2.length >= 4) {
                        String str = strArrSplit2[c];
                        String str2 = strArrSplit2[1];
                        String str3 = strArrSplit2[2];
                        String str4 = strArrSplit2[3];
                        HashMap map = new HashMap();
                        map.put("event", "change");
                        map.put("model", Build.MODEL);
                        map.put("net_type", str2);
                        map.put("net_name", str);
                        map.put("interval", str3);
                        map.put("timestamp", str4);
                        h("category_hb_change", null, map);
                        x9s.o("[HB] report hb changed events.");
                    }
                    i2++;
                    c = 0;
                }
                this.f5232a.edit().remove(a.h()).apply();
            }
            if (this.f5232a.getBoolean(a.a(), false)) {
                long j = this.f5232a.getLong(a.c(), 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j > 1296000000) {
                    HashMap map2 = new HashMap();
                    map2.put("event", "support");
                    map2.put("model", Build.MODEL);
                    map2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                    h("category_hb_change", null, map2);
                    x9s.o("[HB] report support wifi digest events.");
                    this.f5232a.edit().putLong(a.c(), jCurrentTimeMillis).apply();
                }
            }
            if (y()) {
                int i3 = this.f5232a.getInt(a.f(), 0);
                int i4 = this.f5232a.getInt(a.g(), 0);
                if (i3 > 0 || i4 > 0) {
                    long j2 = this.f5232a.getLong(a.e(), -1L);
                    String strValueOf = String.valueOf(235000);
                    String strValueOf2 = String.valueOf(j2);
                    String strValueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("interval", strValueOf);
                        jSONObject.put("c_short", String.valueOf(i3));
                        jSONObject.put("c_long", String.valueOf(i4));
                        jSONObject.put("count", String.valueOf(i3 + i4));
                        jSONObject.put(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, strValueOf2);
                        jSONObject.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, strValueOf3);
                        String string2 = jSONObject.toString();
                        HashMap map3 = new HashMap();
                        map3.put("event", "long_and_short_hb_count");
                        h("category_hb_count", string2, map3);
                        x9s.o("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f5232a.edit().putInt(a.f(), 0).putInt(a.g(), 0).putLong(a.e(), System.currentTimeMillis()).apply();
            }
            if (A()) {
                String strValueOf4 = String.valueOf(this.h);
                String strValueOf5 = String.valueOf(System.currentTimeMillis());
                int i5 = this.f5232a.getInt(a.i(), 0);
                if (i5 > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("net_type", "M");
                        jSONObject2.put("ptc", i5);
                        jSONObject2.put(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, strValueOf4);
                        jSONObject2.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, strValueOf5);
                        String string3 = jSONObject2.toString();
                        HashMap map4 = new HashMap();
                        map4.put("event", "ptc_event");
                        h("category_lc_ptc", string3, map4);
                        x9s.o("[HB] report ping timeout count events of mobile network.");
                        this.f5232a.edit().putInt(a.i(), 0).apply();
                    } catch (Throwable unused2) {
                        i = 0;
                        this.f5232a.edit().putInt(a.i(), 0).apply();
                    }
                }
                i = 0;
                int i6 = this.f5232a.getInt(a.j(), i);
                if (i6 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("net_type", "W");
                        jSONObject3.put("ptc", i6);
                        jSONObject3.put(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, strValueOf4);
                        jSONObject3.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, strValueOf5);
                        String string4 = jSONObject3.toString();
                        HashMap map5 = new HashMap();
                        map5.put("event", "ptc_event");
                        h("category_lc_ptc", string4, map5);
                        x9s.o("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f5232a.edit().putInt(a.j(), 0).apply();
                }
                this.h = System.currentTimeMillis();
                this.f5232a.edit().putLong(a.k(), this.h).apply();
            }
        }
    }

    public final int a() {
        if (TextUtils.isEmpty(this.c)) {
            return -1;
        }
        try {
            return this.f5232a.getInt(a.b(this.c), -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public long b() {
        int iA;
        long jF = qws.f();
        if (this.j && !o() && ((vas.d(this.l).m(ig.IntelligentHeartbeatSwitchBoolean.a(), true) || p() >= System.currentTimeMillis()) && (iA = a()) != -1)) {
            jF = iA;
        }
        if (!TextUtils.isEmpty(this.c) && !"WIFI-ID-UNKNOWN".equals(this.c) && this.f5234k == 1) {
            i(jF < 300000);
        }
        this.m = jF;
        x9s.o("[HB] ping interval:" + jF);
        return jF;
    }

    public void d() {
    }

    public void e(int i) {
        this.f5232a.edit().putLong(a.l(), System.currentTimeMillis() + ((long) (i * 1000))).apply();
    }

    public synchronized void f(xbs xbsVar) {
        try {
            if (w()) {
                String str = null;
                if (xbsVar == null) {
                    n(null);
                    this.f5234k = -1;
                } else if (xbsVar.a() == 0) {
                    String strH = xbsVar.h();
                    if (!TextUtils.isEmpty(strH) && !DeviceTypes.UNKNOWN.equalsIgnoreCase(strH)) {
                        str = "M-" + strH;
                    }
                    n(str);
                    this.f5234k = 0;
                } else if (xbsVar.a() == 1 || xbsVar.a() == 6) {
                    n("WIFI-ID-UNKNOWN");
                    this.f5234k = 1;
                } else {
                    n(null);
                    this.f5234k = -1;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                x();
            }
            if (w() && !TextUtils.isEmpty(str)) {
                n("W-" + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    public final void h(String str, String str2, Map<String, String> map) {
        String str3;
        Cif cif = new Cif();
        cif.d(str);
        cif.c("hb_name");
        cif.a("hb_channel");
        cif.a(1L);
        cif.b(str2);
        cif.a(false);
        cif.b(System.currentTimeMillis());
        cif.g(this.l.getPackageName());
        cif.e("com.xiaomi.xmsf");
        if (map == null) {
            map = new HashMap<>();
        }
        n0 n0VarB = o0.b(this.l);
        if (n0VarB == null || TextUtils.isEmpty(n0VarB.f14246a)) {
            str3 = null;
        } else {
            String[] strArrSplit = n0VarB.f14246a.split(gv5.CONNECT_VALUE_STR);
            if (strArrSplit.length > 0) {
                str3 = strArrSplit[0];
            } else {
                str3 = null;
            }
        }
        map.put("uuid", str3);
        map.put("model", Build.MODEL);
        Context context = this.l;
        map.put("avc", String.valueOf(g.b(context, context.getPackageName())));
        map.put("pvc", String.valueOf(50708));
        map.put("cvc", String.valueOf(48));
        cif.a(map);
        czs czsVarA = czs.a(this.l);
        if (czsVarA != null) {
            czsVarA.e(cif, this.l.getPackageName());
        }
    }

    public final void i(boolean z) {
        if (s()) {
            int iIncrementAndGet = (z ? this.f : this.g).incrementAndGet();
            Object[] objArr = new Object[2];
            objArr[0] = z ? "short" : "long";
            objArr[1] = Integer.valueOf(iIncrementAndGet);
            x9s.y(String.format("[HB] %s ping interval count: %s", objArr));
            if (iIncrementAndGet >= 5) {
                String strF = z ? a.f() : a.g();
                int i = this.f5232a.getInt(strF, 0) + iIncrementAndGet;
                this.f5232a.edit().putInt(strF, i).apply();
                Object[] objArr2 = new Object[2];
                objArr2[0] = z ? "short" : "long";
                objArr2[1] = Integer.valueOf(i);
                x9s.o(String.format("[HB] accumulate %s hb count(%s) and write to file. ", objArr2));
                if (z) {
                    this.f.set(0);
                } else {
                    this.g.set(0);
                }
            }
        }
    }

    public final boolean j() {
        return this.f5233b.get() >= Math.max(vas.d(this.l).a(ig.IntelligentHeartbeatNATCountInt.a(), 5), 3);
    }

    public final boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    public long l() {
        return this.m;
    }

    public void m() {
        if (w()) {
            z();
            if (this.d && !TextUtils.isEmpty(this.c) && this.c.equals(this.e)) {
                this.f5233b.getAndIncrement();
                x9s.o("[HB] ping timeout count:" + this.f5233b);
                if (j()) {
                    x9s.o("[HB] change hb interval for net:" + this.c);
                    r(this.c);
                    this.d = false;
                    this.f5233b.getAndSet(0);
                    v(this.c);
                }
            }
        }
    }

    public final void n(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = this.c;
            if (str2 == null || !str2.startsWith("W-")) {
                this.c = null;
            }
        } else {
            this.c = str;
        }
        int i = this.f5232a.getInt(a.b(this.c), -1);
        long j = this.f5232a.getLong(a.d(this.c), -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != -1) {
            if (j == -1) {
                this.f5232a.edit().putLong(a.d(this.c), jCurrentTimeMillis + t()).apply();
            } else if (jCurrentTimeMillis > j) {
                this.f5232a.edit().remove(a.b(this.c)).remove(a.d(this.c)).apply();
            }
        }
        this.f5233b.getAndSet(0);
        if (TextUtils.isEmpty(this.c) || a() != -1) {
            this.d = false;
        } else {
            this.d = true;
        }
        x9s.o(String.format("[HB] network changed, netid:%s, %s", this.c, Boolean.valueOf(this.d)));
    }

    public final boolean o() {
        return (TextUtils.isEmpty(this.c) || !this.c.startsWith("M-") || vas.d(this.l).m(ig.IntelligentHeartbeatUseInMobileNetworkBoolean.a(), false)) ? false : true;
    }

    public final long p() {
        return this.f5232a.getLong(a.l(), -1L);
    }

    public void q() {
        if (w()) {
            this.e = this.c;
        }
    }

    public final void r(String str) {
        if (k(str)) {
            this.f5232a.edit().putInt(a.b(str), 235000).apply();
            this.f5232a.edit().putLong(a.d(this.c), System.currentTimeMillis() + t()).apply();
        }
    }

    public final boolean s() {
        return w() && vas.d(this.l).m(ig.IntelligentHeartbeatDataCollectSwitchBoolean.a(), true) && m.China.name().equals(yes.a(this.l).b());
    }

    public final long t() {
        return vas.d(this.l).c(ig.ShortHeartbeatEffectivePeriodMsLong.a(), 777600000L);
    }

    public void u() {
        if (w()) {
            B();
            if (this.d) {
                this.f5233b.getAndSet(0);
            }
        }
    }

    public final void v(String str) {
        String str2;
        String string;
        if (s() && !TextUtils.isEmpty(str)) {
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
            String string2 = this.f5232a.getString(a.h(), null);
            if (TextUtils.isEmpty(string2)) {
                string = sb.toString();
            } else {
                string = string2 + "###" + sb.toString();
            }
            this.f5232a.edit().putString(a.h(), string).apply();
        }
    }

    public final boolean w() {
        boolean z = p() >= System.currentTimeMillis();
        if (this.j) {
            return this.i || z;
        }
        return false;
    }

    public final void x() {
        if (this.f5232a.getBoolean(a.a(), false)) {
            return;
        }
        this.f5232a.edit().putBoolean(a.a(), true).apply();
    }

    public final boolean y() {
        long j = this.f5232a.getLong(a.e(), -1L);
        if (j == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j > jCurrentTimeMillis || jCurrentTimeMillis - j >= 259200000;
    }

    public final void z() {
        String strI;
        int i = this.f5234k;
        if (i != 0) {
            strI = i != 1 ? null : a.j();
        } else {
            strI = a.i();
        }
        if (TextUtils.isEmpty(strI)) {
            return;
        }
        if (this.f5232a.getLong(a.k(), -1L) == -1) {
            this.h = System.currentTimeMillis();
            this.f5232a.edit().putLong(a.k(), this.h).apply();
        }
        this.f5232a.edit().putInt(strI, this.f5232a.getInt(strI, 0) + 1).apply();
    }
}
