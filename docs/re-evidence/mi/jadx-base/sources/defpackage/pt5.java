package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.HashMap;
import java.util.Map;
import miuix.animation.internal.FolmeCore;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class pt5 implements gy1, fxp {
    public static final ImmutableListMultimap<String, Integer> p = k();
    public static final ImmutableList<Long> q = ImmutableList.of(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ImmutableList<Long> f30736r = ImmutableList.of(248000L, 160000L, 142000L, 127000L, 113000L);
    public static final ImmutableList<Long> s = ImmutableList.of(2200000L, 1300000L, 950000L, 760000L, 520000L);
    public static final ImmutableList<Long> t = ImmutableList.of(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
    public static final ImmutableList<Long> u = ImmutableList.of(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);
    public static final ImmutableList<Long> v = ImmutableList.of(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    public static pt5 w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap<Integer, Long> f30737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy1.a.C0948a f30738b;
    public final g2n c;
    public final f14 d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f30739k;
    public long l;
    public long m;
    public boolean n;
    public int o;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f30740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<Integer, Long> f30741b;
        public int c;
        public f14 d;
        public boolean e;

        public b(Context context) {
            this.f30740a = context == null ? null : context.getApplicationContext();
            this.f30741b = c(wlq.M(context));
            this.c = 2000;
            this.d = f14.f17281a;
            this.e = true;
        }

        public static ImmutableList<Integer> b(String str) {
            ImmutableList<Integer> immutableList = pt5.p.get(str);
            return immutableList.isEmpty() ? ImmutableList.of(2, 2, 2, 2, 2, 2) : immutableList;
        }

        public static Map<Integer, Long> c(String str) {
            ImmutableList<Integer> immutableListB = b(str);
            HashMap map = new HashMap(8);
            map.put(0, Long.valueOf(FolmeCore.NANOS_TO_MS));
            ImmutableList<Long> immutableList = pt5.q;
            map.put(2, immutableList.get(immutableListB.get(0).intValue()));
            map.put(3, pt5.f30736r.get(immutableListB.get(1).intValue()));
            map.put(4, pt5.s.get(immutableListB.get(2).intValue()));
            map.put(5, pt5.t.get(immutableListB.get(3).intValue()));
            map.put(10, pt5.u.get(immutableListB.get(4).intValue()));
            map.put(9, pt5.v.get(immutableListB.get(5).intValue()));
            map.put(7, immutableList.get(immutableListB.get(0).intValue()));
            return map;
        }

        public pt5 a() {
            return new pt5(this.f30740a, this.f30741b, this.c, this.d, this.e);
        }
    }

    public static ImmutableListMultimap<String, Integer> k() {
        return ImmutableListMultimap.builder().m("AD", 1, 2, 0, 0, 2, 2).m("AE", 1, 4, 4, 4, 2, 2).m("AF", 4, 4, 3, 4, 2, 2).m("AG", 4, 2, 1, 4, 2, 2).m("AI", 1, 2, 2, 2, 2, 2).m("AL", 1, 1, 1, 1, 2, 2).m("AM", 2, 2, 1, 3, 2, 2).m("AO", 3, 4, 3, 1, 2, 2).m("AR", 2, 4, 2, 1, 2, 2).m("AS", 2, 2, 3, 3, 2, 2).m("AT", 0, 1, 0, 0, 0, 2).m("AU", 0, 2, 0, 1, 1, 2).m("AW", 1, 2, 0, 4, 2, 2).m("AX", 0, 2, 2, 2, 2, 2).m("AZ", 3, 3, 3, 4, 4, 2).m("BA", 1, 1, 0, 1, 2, 2).m("BB", 0, 2, 0, 0, 2, 2).m("BD", 2, 0, 3, 3, 2, 2).m("BE", 0, 0, 2, 3, 2, 2).m("BF", 4, 4, 4, 2, 2, 2).m("BG", 0, 1, 0, 0, 2, 2).m("BH", 1, 0, 2, 4, 2, 2).m("BI", 4, 4, 4, 4, 2, 2).m("BJ", 4, 4, 4, 4, 2, 2).m("BL", 1, 2, 2, 2, 2, 2).m("BM", 0, 2, 0, 0, 2, 2).m("BN", 3, 2, 1, 0, 2, 2).m("BO", 1, 2, 4, 2, 2, 2).m("BQ", 1, 2, 1, 2, 2, 2).m(Country.BR, 2, 4, 3, 2, 2, 2).m("BS", 2, 2, 1, 3, 2, 2).m("BT", 3, 0, 3, 2, 2, 2).m("BW", 3, 4, 1, 1, 2, 2).m("BY", 1, 1, 1, 2, 2, 2).m("BZ", 2, 2, 2, 2, 2, 2).m("CA", 0, 3, 1, 2, 4, 2).m("CD", 4, 2, 2, 1, 2, 2).m("CF", 4, 2, 3, 2, 2, 2).m("CG", 3, 4, 2, 2, 2, 2).m("CH", 0, 0, 0, 0, 1, 2).m("CI", 3, 3, 3, 3, 2, 2).m("CK", 2, 2, 3, 0, 2, 2).m("CL", 1, 1, 2, 2, 2, 2).m("CM", 3, 4, 3, 2, 2, 2).m(ServerConstants.NEW_CN_COUNTRY_CODE, 2, 2, 2, 1, 3, 2).m("CO", 2, 3, 4, 2, 2, 2).m("CR", 2, 3, 4, 4, 2, 2).m("CU", 4, 4, 2, 2, 2, 2).m("CV", 2, 3, 1, 0, 2, 2).m("CW", 1, 2, 0, 0, 2, 2).m("CY", 1, 1, 0, 0, 2, 2).m("CZ", 0, 1, 0, 0, 1, 2).m(ServerConstants.NEW_DE_COUNTRY_CODE, 0, 0, 1, 1, 0, 2).m("DJ", 4, 0, 4, 4, 2, 2).m("DK", 0, 0, 1, 0, 0, 2).m("DM", 1, 2, 2, 2, 2, 2).m("DO", 3, 4, 4, 4, 2, 2).m("DZ", 3, 3, 4, 4, 2, 4).m("EC", 2, 4, 3, 1, 2, 2).m("EE", 0, 1, 0, 0, 2, 2).m("EG", 3, 4, 3, 3, 2, 2).m("EH", 2, 2, 2, 2, 2, 2).m("ER", 4, 2, 2, 2, 2, 2).m(ServerConstants.ES_COUNTRY_CODE, 0, 1, 1, 1, 2, 2).m("ET", 4, 4, 4, 1, 2, 2).m("FI", 0, 0, 0, 0, 0, 2).m("FJ", 3, 0, 2, 3, 2, 2).m("FK", 4, 2, 2, 2, 2, 2).m("FM", 3, 2, 4, 4, 2, 2).m("FO", 1, 2, 0, 1, 2, 2).m(ServerConstants.FR_COUNTRY_CODE, 1, 1, 2, 0, 1, 2).m("GA", 3, 4, 1, 1, 2, 2).m(ServerConstants.GB_COUNTRY_CODE, 0, 0, 1, 1, 1, 2).m("GD", 1, 2, 2, 2, 2, 2).m("GE", 1, 1, 1, 2, 2, 2).m("GF", 2, 2, 2, 3, 2, 2).m("GG", 1, 2, 0, 0, 2, 2).m("GH", 3, 1, 3, 2, 2, 2).m("GI", 0, 2, 0, 0, 2, 2).m("GL", 1, 2, 0, 0, 2, 2).m("GM", 4, 3, 2, 4, 2, 2).m("GN", 4, 3, 4, 2, 2, 2).m("GP", 2, 1, 2, 3, 2, 2).m("GQ", 4, 2, 2, 4, 2, 2).m("GR", 1, 2, 0, 0, 2, 2).m("GT", 3, 2, 3, 1, 2, 2).m("GU", 1, 2, 3, 4, 2, 2).m("GW", 4, 4, 4, 4, 2, 2).m("GY", 3, 3, 3, 4, 2, 2).m(ServerConstants.NEW_HK_COUNTRY_CODE, 0, 1, 2, 3, 2, 0).m("HN", 3, 1, 3, 3, 2, 2).m("HR", 1, 1, 0, 0, 3, 2).m("HT", 4, 4, 4, 4, 2, 2).m("HU", 0, 0, 0, 0, 0, 2).m(ServerConstants.ID_COUNTRY_CODE, 3, 2, 3, 3, 2, 2).m("IE", 0, 0, 1, 1, 3, 2).m("IL", 1, 0, 2, 3, 4, 2).m("IM", 0, 2, 0, 1, 2, 2).m("IN", 2, 1, 3, 3, 2, 2).m("IO", 4, 2, 2, 4, 2, 2).m("IQ", 3, 3, 4, 4, 2, 2).m("IR", 3, 2, 3, 2, 2, 2).m("IS", 0, 2, 0, 0, 2, 2).m(ServerConstants.IT_COUNTRY_CODE, 0, 4, 0, 1, 2, 2).m("JE", 2, 2, 1, 2, 2, 2).m("JM", 3, 3, 4, 4, 2, 2).m("JO", 2, 2, 1, 1, 2, 2).m("JP", 0, 0, 0, 0, 2, 1).m("KE", 3, 4, 2, 2, 2, 2).m("KG", 2, 0, 1, 1, 2, 2).m("KH", 1, 0, 4, 3, 2, 2).m("KI", 4, 2, 4, 3, 2, 2).m("KM", 4, 3, 2, 3, 2, 2).m("KN", 1, 2, 2, 2, 2, 2).m("KP", 4, 2, 2, 2, 2, 2).m(ServerConstants.NEW_KR_COUNTRY_CODE, 0, 0, 1, 3, 1, 2).m("KW", 1, 3, 1, 1, 1, 2).m("KY", 1, 2, 0, 2, 2, 2).m("KZ", 2, 2, 2, 3, 2, 2).m("LA", 1, 2, 1, 1, 2, 2).m("LB", 3, 2, 0, 0, 2, 2).m("LC", 1, 2, 0, 0, 2, 2).m("LI", 0, 2, 2, 2, 2, 2).m("LK", 2, 0, 2, 3, 2, 2).m("LR", 3, 4, 4, 3, 2, 2).m("LS", 3, 3, 2, 3, 2, 2).m("LT", 0, 0, 0, 0, 2, 2).m("LU", 1, 0, 1, 1, 2, 2).m("LV", 0, 0, 0, 0, 2, 2).m("LY", 4, 2, 4, 3, 2, 2).m("MA", 3, 2, 2, 1, 2, 2).m("MC", 0, 2, 0, 0, 2, 2).m("MD", 1, 2, 0, 0, 2, 2).m("ME", 1, 2, 0, 1, 2, 2).m("MF", 2, 2, 1, 1, 2, 2).m("MG", 3, 4, 2, 2, 2, 2).m("MH", 4, 2, 2, 4, 2, 2).m("MK", 1, 1, 0, 0, 2, 2).m("ML", 4, 4, 2, 2, 2, 2).m("MM", 2, 3, 3, 3, 2, 2).m("MN", 2, 4, 2, 2, 2, 2).m("MO", 0, 2, 4, 4, 2, 2).m("MP", 0, 2, 2, 2, 2, 2).m("MQ", 2, 2, 2, 3, 2, 2).m("MR", 3, 0, 4, 3, 2, 2).m("MS", 1, 2, 2, 2, 2, 2).m("MT", 0, 2, 0, 0, 2, 2).m("MU", 2, 1, 1, 2, 2, 2).m("MV", 4, 3, 2, 4, 2, 2).m("MW", 4, 2, 1, 0, 2, 2).m("MX", 2, 4, 4, 4, 4, 2).m("MY", 1, 0, 3, 2, 2, 2).m("MZ", 3, 3, 2, 1, 2, 2).m(NetworkStateUtil.NO_NETWORK, 4, 3, 3, 2, 2, 2).m("NC", 3, 0, 4, 4, 2, 2).m("NE", 4, 4, 4, 4, 2, 2).m("NF", 2, 2, 2, 2, 2, 2).m("NG", 3, 3, 2, 3, 2, 2).m("NI", 2, 1, 4, 4, 2, 2).m("NL", 0, 2, 3, 2, 0, 2).m("NO", 0, 1, 2, 0, 0, 2).m("NP", 2, 0, 4, 2, 2, 2).m("NR", 3, 2, 3, 1, 2, 2).m("NU", 4, 2, 2, 2, 2, 2).m("NZ", 0, 2, 1, 2, 4, 2).m("OM", 2, 2, 1, 3, 3, 2).m("PA", 1, 3, 3, 3, 2, 2).m("PE", 2, 3, 4, 4, 2, 2).m("PF", 2, 2, 2, 1, 2, 2).m("PG", 4, 4, 3, 2, 2, 2).m("PH", 2, 1, 3, 3, 3, 2).m("PK", 3, 2, 3, 3, 2, 2).m("PL", 1, 0, 1, 2, 3, 2).m("PM", 0, 2, 2, 2, 2, 2).m("PR", 2, 1, 2, 2, 4, 3).m("PS", 3, 3, 2, 2, 2, 2).m("PT", 0, 1, 1, 0, 2, 2).m("PW", 1, 2, 4, 1, 2, 2).m("PY", 2, 0, 3, 2, 2, 2).m("QA", 2, 3, 1, 2, 3, 2).m("RE", 1, 0, 2, 2, 2, 2).m("RO", 0, 1, 0, 1, 0, 2).m("RS", 1, 2, 0, 0, 2, 2).m(ServerConstants.NEW_RU_COUNTRY_CODE, 0, 1, 0, 1, 4, 2).m("RW", 3, 3, 3, 1, 2, 2).m("SA", 2, 2, 2, 1, 1, 2).m("SB", 4, 2, 3, 2, 2, 2).m(BouncyCastleProvider.PROVIDER_NAME, 4, 2, 1, 3, 2, 2).m("SD", 4, 4, 4, 4, 2, 2).m("SE", 0, 0, 0, 0, 0, 2).m(ServerConstants.NEW_SG_COUNTRY_CODE, 1, 0, 1, 2, 3, 2).m("SH", 4, 2, 2, 2, 2, 2).m("SI", 0, 0, 0, 0, 2, 2).m("SJ", 2, 2, 2, 2, 2, 2).m("SK", 0, 1, 0, 0, 2, 2).m("SL", 4, 3, 4, 0, 2, 2).m("SM", 0, 2, 2, 2, 2, 2).m("SN", 4, 4, 4, 4, 2, 2).m("SO", 3, 3, 3, 4, 2, 2).m("SR", 3, 2, 2, 2, 2, 2).m("SS", 4, 4, 3, 3, 2, 2).m("ST", 2, 2, 1, 2, 2, 2).m("SV", 2, 1, 4, 3, 2, 2).m("SX", 2, 2, 1, 0, 2, 2).m("SY", 4, 3, 3, 2, 2, 2).m("SZ", 3, 3, 2, 4, 2, 2).m("TC", 2, 2, 2, 0, 2, 2).m("TD", 4, 3, 4, 4, 2, 2).m("TG", 3, 2, 2, 4, 2, 2).m("TH", 0, 3, 2, 3, 2, 2).m("TJ", 4, 4, 4, 4, 2, 2).m("TL", 4, 0, 4, 4, 2, 2).m("TM", 4, 2, 4, 3, 2, 2).m("TN", 2, 1, 1, 2, 2, 2).m("TO", 3, 3, 4, 3, 2, 2).m("TR", 1, 2, 1, 1, 2, 2).m("TT", 1, 4, 0, 1, 2, 2).m("TV", 3, 2, 2, 4, 2, 2).m(ServerConstants.NEW_TW_COUNTRY_CODE, 0, 0, 0, 0, 1, 0).m("TZ", 3, 3, 3, 2, 2, 2).m("UA", 0, 3, 1, 1, 2, 2).m("UG", 3, 2, 3, 3, 2, 2).m(ServerConstants.NEW_US_TRUE_COUNTRY_CODE, 1, 1, 2, 2, 4, 2).m("UY", 2, 2, 1, 1, 2, 2).m("UZ", 2, 1, 3, 4, 2, 2).m("VC", 1, 2, 2, 2, 2, 2).m("VE", 4, 4, 4, 4, 2, 2).m("VG", 2, 2, 1, 1, 2, 2).m("VI", 1, 2, 1, 2, 2, 2).m("VN", 0, 1, 3, 4, 2, 2).m("VU", 4, 0, 3, 1, 2, 2).m("WF", 4, 2, 2, 4, 2, 2).m("WS", 3, 1, 3, 1, 2, 2).m("XK", 0, 1, 1, 0, 2, 2).m("YE", 4, 4, 4, 3, 2, 2).m("YT", 4, 2, 2, 3, 2, 2).m("ZA", 3, 3, 2, 1, 2, 2).m("ZM", 3, 2, 3, 3, 2, 2).m("ZW", 3, 2, 4, 3, 2, 2).h();
    }

    public static synchronized pt5 m(Context context) {
        try {
            if (w == null) {
                w = new b(context).a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return w;
    }

    public static boolean n(com.google.android.exoplayer2.upstream.b bVar, boolean z) {
        return z && !bVar.d(8);
    }

    @Override // defpackage.fxp
    public synchronized void a(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z) {
        try {
            if (n(bVar, z)) {
                rk1.g(this.f > 0);
                long jElapsedRealtime = this.d.elapsedRealtime();
                int i = (int) (jElapsedRealtime - this.g);
                this.j += (long) i;
                long j = this.f30739k;
                long j2 = this.h;
                this.f30739k = j + j2;
                if (i > 0) {
                    this.c.c((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                    if (this.j >= VibrateModeProgressBar.sLongToLong || this.f30739k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        this.l = (long) this.c.f(0.5f);
                    }
                    o(i, this.h, this.l);
                    this.g = jElapsedRealtime;
                    this.h = 0L;
                }
                this.f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gy1
    public synchronized long b() {
        return this.l;
    }

    @Override // defpackage.fxp
    public synchronized void c(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z, int i) {
        if (n(bVar, z)) {
            this.h += (long) i;
        }
    }

    @Override // defpackage.fxp
    public synchronized void d(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z) {
        try {
            if (n(bVar, z)) {
                if (this.f == 0) {
                    this.g = this.d.elapsedRealtime();
                }
                this.f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gy1
    public void e(gy1.a aVar) {
        this.f30738b.e(aVar);
    }

    @Override // defpackage.gy1
    public fxp g() {
        return this;
    }

    @Override // defpackage.gy1
    public void h(Handler handler, gy1.a aVar) {
        rk1.e(handler);
        rk1.e(aVar);
        this.f30738b.b(handler, aVar);
    }

    @Override // defpackage.fxp
    public void i(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z) {
    }

    public final long l(int i) {
        Long lValueOf = this.f30737a.get(Integer.valueOf(i));
        if (lValueOf == null) {
            lValueOf = this.f30737a.get(0);
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(FolmeCore.NANOS_TO_MS);
        }
        return lValueOf.longValue();
    }

    public final void o(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        this.f30738b.c(i, j, j2);
    }

    public final synchronized void p(int i) {
        int i2 = this.i;
        if (i2 == 0 || this.e) {
            if (this.n) {
                i = this.o;
            }
            if (i2 == i) {
                return;
            }
            this.i = i;
            if (i != 1 && i != 0 && i != 8) {
                this.l = l(i);
                long jElapsedRealtime = this.d.elapsedRealtime();
                o(this.f > 0 ? (int) (jElapsedRealtime - this.g) : 0, this.h, this.l);
                this.g = jElapsedRealtime;
                this.h = 0L;
                this.f30739k = 0L;
                this.j = 0L;
                this.c.i();
            }
        }
    }

    @Deprecated
    public pt5() {
        this(null, ImmutableMap.of(), 2000, f14.f17281a, false);
    }

    public pt5(Context context, Map<Integer, Long> map, int i, f14 f14Var, boolean z) {
        this.f30737a = ImmutableMap.copyOf((Map) map);
        this.f30738b = new gy1.a.C0948a();
        this.c = new g2n(i);
        this.d = f14Var;
        this.e = z;
        if (context != null) {
            rkg rkgVarD = rkg.d(context);
            int iF = rkgVarD.f();
            this.i = iF;
            this.l = l(iF);
            rkgVarD.i(new rkg.b() { // from class: ot5
                @Override // rkg.b
                public final void a(int i2) {
                    this.f29663a.p(i2);
                }
            });
            return;
        }
        this.i = 0;
        this.l = l(0);
    }
}
