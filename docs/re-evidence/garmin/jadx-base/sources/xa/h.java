package xa;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.common.MlKitException;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import fa.o;
import fa.t;
import fa.z;
import ha.n;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c, n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ImmutableList<Long> f189681n = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ImmutableList<Long> f189682o = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ImmutableList<Long> f189683p = ImmutableList.of(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ImmutableList<Long> f189684q = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ImmutableList<Long> f189685r = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ImmutableList<Long> f189686s = ImmutableList.of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static h f189687t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap<Integer, Long> f189688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.a.C3528a f189689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.c f189690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f189691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f189692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f189693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f189694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f189695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f189696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f189697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f189698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f189699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f189700m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f189701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f189702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f189703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t f189704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f189705e;

        /* JADX WARN: Code duplicated, block: B:13:0x002a  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public b(Context context) {
            String upperCase;
            int[] iArr;
            TelephonyManager telephonyManager;
            this.f189701a = context == null ? null : context.getApplicationContext();
            int i14 = z.f70071a;
            if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                upperCase = Ascii.toUpperCase(Locale.getDefault().getCountry());
            } else {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(networkCountryIso)) {
                    upperCase = Ascii.toUpperCase(Locale.getDefault().getCountry());
                } else {
                    upperCase = Ascii.toUpperCase(networkCountryIso);
                }
            }
            ImmutableList<Long> immutableList = h.f189681n;
            upperCase.getClass();
            byte b14 = -1;
            switch (upperCase.hashCode()) {
                case 2083:
                    if (upperCase.equals("AD")) {
                        b14 = 0;
                    }
                    break;
                case 2084:
                    if (upperCase.equals("AE")) {
                        b14 = 1;
                    }
                    break;
                case 2085:
                    if (upperCase.equals("AF")) {
                        b14 = 2;
                    }
                    break;
                case 2086:
                    if (upperCase.equals("AG")) {
                        b14 = 3;
                    }
                    break;
                case 2088:
                    if (upperCase.equals("AI")) {
                        b14 = 4;
                    }
                    break;
                case 2091:
                    if (upperCase.equals("AL")) {
                        b14 = 5;
                    }
                    break;
                case 2092:
                    if (upperCase.equals("AM")) {
                        b14 = 6;
                    }
                    break;
                case 2094:
                    if (upperCase.equals("AO")) {
                        b14 = 7;
                    }
                    break;
                case 2096:
                    if (upperCase.equals("AQ")) {
                        b14 = 8;
                    }
                    break;
                case 2097:
                    if (upperCase.equals("AR")) {
                        b14 = 9;
                    }
                    break;
                case 2098:
                    if (upperCase.equals("AS")) {
                        b14 = 10;
                    }
                    break;
                case 2099:
                    if (upperCase.equals("AT")) {
                        b14 = Ascii.VT;
                    }
                    break;
                case 2100:
                    if (upperCase.equals("AU")) {
                        b14 = Ascii.FF;
                    }
                    break;
                case 2102:
                    if (upperCase.equals("AW")) {
                        b14 = Ascii.CR;
                    }
                    break;
                case 2103:
                    if (upperCase.equals("AX")) {
                        b14 = Ascii.SO;
                    }
                    break;
                case 2105:
                    if (upperCase.equals("AZ")) {
                        b14 = Ascii.SI;
                    }
                    break;
                case 2111:
                    if (upperCase.equals("BA")) {
                        b14 = Ascii.DLE;
                    }
                    break;
                case 2112:
                    if (upperCase.equals("BB")) {
                        b14 = 17;
                    }
                    break;
                case 2114:
                    if (upperCase.equals("BD")) {
                        b14 = Ascii.DC2;
                    }
                    break;
                case 2115:
                    if (upperCase.equals("BE")) {
                        b14 = 19;
                    }
                    break;
                case 2116:
                    if (upperCase.equals("BF")) {
                        b14 = Ascii.DC4;
                    }
                    break;
                case 2117:
                    if (upperCase.equals("BG")) {
                        b14 = Ascii.NAK;
                    }
                    break;
                case 2118:
                    if (upperCase.equals("BH")) {
                        b14 = Ascii.SYN;
                    }
                    break;
                case 2119:
                    if (upperCase.equals("BI")) {
                        b14 = Ascii.ETB;
                    }
                    break;
                case 2120:
                    if (upperCase.equals("BJ")) {
                        b14 = Ascii.CAN;
                    }
                    break;
                case 2122:
                    if (upperCase.equals("BL")) {
                        b14 = Ascii.EM;
                    }
                    break;
                case 2123:
                    if (upperCase.equals("BM")) {
                        b14 = Ascii.SUB;
                    }
                    break;
                case 2124:
                    if (upperCase.equals("BN")) {
                        b14 = Ascii.ESC;
                    }
                    break;
                case 2125:
                    if (upperCase.equals("BO")) {
                        b14 = Ascii.FS;
                    }
                    break;
                case 2127:
                    if (upperCase.equals("BQ")) {
                        b14 = Ascii.GS;
                    }
                    break;
                case 2128:
                    if (upperCase.equals("BR")) {
                        b14 = Ascii.RS;
                    }
                    break;
                case 2129:
                    if (upperCase.equals("BS")) {
                        b14 = Ascii.US;
                    }
                    break;
                case 2130:
                    if (upperCase.equals("BT")) {
                        b14 = 32;
                    }
                    break;
                case 2133:
                    if (upperCase.equals("BW")) {
                        b14 = 33;
                    }
                    break;
                case 2135:
                    if (upperCase.equals("BY")) {
                        b14 = 34;
                    }
                    break;
                case 2136:
                    if (upperCase.equals("BZ")) {
                        b14 = 35;
                    }
                    break;
                case 2142:
                    if (upperCase.equals("CA")) {
                        b14 = 36;
                    }
                    break;
                case 2145:
                    if (upperCase.equals("CD")) {
                        b14 = 37;
                    }
                    break;
                case 2147:
                    if (upperCase.equals("CF")) {
                        b14 = 38;
                    }
                    break;
                case 2148:
                    if (upperCase.equals("CG")) {
                        b14 = 39;
                    }
                    break;
                case 2149:
                    if (upperCase.equals("CH")) {
                        b14 = 40;
                    }
                    break;
                case 2150:
                    if (upperCase.equals("CI")) {
                        b14 = 41;
                    }
                    break;
                case 2152:
                    if (upperCase.equals("CK")) {
                        b14 = 42;
                    }
                    break;
                case 2153:
                    if (upperCase.equals("CL")) {
                        b14 = 43;
                    }
                    break;
                case 2154:
                    if (upperCase.equals("CM")) {
                        b14 = 44;
                    }
                    break;
                case 2155:
                    if (upperCase.equals("CN")) {
                        b14 = 45;
                    }
                    break;
                case 2156:
                    if (upperCase.equals("CO")) {
                        b14 = 46;
                    }
                    break;
                case 2159:
                    if (upperCase.equals("CR")) {
                        b14 = 47;
                    }
                    break;
                case 2162:
                    if (upperCase.equals("CU")) {
                        b14 = 48;
                    }
                    break;
                case 2163:
                    if (upperCase.equals("CV")) {
                        b14 = 49;
                    }
                    break;
                case 2164:
                    if (upperCase.equals("CW")) {
                        b14 = 50;
                    }
                    break;
                case 2165:
                    if (upperCase.equals("CX")) {
                        b14 = 51;
                    }
                    break;
                case 2166:
                    if (upperCase.equals("CY")) {
                        b14 = 52;
                    }
                    break;
                case 2167:
                    if (upperCase.equals("CZ")) {
                        b14 = 53;
                    }
                    break;
                case 2177:
                    if (upperCase.equals("DE")) {
                        b14 = 54;
                    }
                    break;
                case 2182:
                    if (upperCase.equals("DJ")) {
                        b14 = 55;
                    }
                    break;
                case 2183:
                    if (upperCase.equals("DK")) {
                        b14 = 56;
                    }
                    break;
                case 2185:
                    if (upperCase.equals("DM")) {
                        b14 = 57;
                    }
                    break;
                case 2187:
                    if (upperCase.equals("DO")) {
                        b14 = 58;
                    }
                    break;
                case 2198:
                    if (upperCase.equals("DZ")) {
                        b14 = 59;
                    }
                    break;
                case 2206:
                    if (upperCase.equals("EC")) {
                        b14 = 60;
                    }
                    break;
                case 2208:
                    if (upperCase.equals("EE")) {
                        b14 = 61;
                    }
                    break;
                case 2210:
                    if (upperCase.equals("EG")) {
                        b14 = 62;
                    }
                    break;
                case 2221:
                    if (upperCase.equals("ER")) {
                        b14 = 63;
                    }
                    break;
                case 2222:
                    if (upperCase.equals("ES")) {
                        b14 = SignedBytes.MAX_POWER_OF_TWO;
                    }
                    break;
                case 2223:
                    if (upperCase.equals("ET")) {
                        b14 = 65;
                    }
                    break;
                case 2243:
                    if (upperCase.equals("FI")) {
                        b14 = 66;
                    }
                    break;
                case 2244:
                    if (upperCase.equals("FJ")) {
                        b14 = 67;
                    }
                    break;
                case 2245:
                    if (upperCase.equals("FK")) {
                        b14 = 68;
                    }
                    break;
                case 2247:
                    if (upperCase.equals("FM")) {
                        b14 = 69;
                    }
                    break;
                case 2249:
                    if (upperCase.equals("FO")) {
                        b14 = 70;
                    }
                    break;
                case 2252:
                    if (upperCase.equals("FR")) {
                        b14 = 71;
                    }
                    break;
                case 2266:
                    if (upperCase.equals("GA")) {
                        b14 = 72;
                    }
                    break;
                case 2267:
                    if (upperCase.equals("GB")) {
                        b14 = 73;
                    }
                    break;
                case 2269:
                    if (upperCase.equals("GD")) {
                        b14 = 74;
                    }
                    break;
                case 2270:
                    if (upperCase.equals("GE")) {
                        b14 = 75;
                    }
                    break;
                case 2271:
                    if (upperCase.equals("GF")) {
                        b14 = 76;
                    }
                    break;
                case 2272:
                    if (upperCase.equals("GG")) {
                        b14 = 77;
                    }
                    break;
                case 2273:
                    if (upperCase.equals("GH")) {
                        b14 = 78;
                    }
                    break;
                case 2274:
                    if (upperCase.equals("GI")) {
                        b14 = 79;
                    }
                    break;
                case 2277:
                    if (upperCase.equals("GL")) {
                        b14 = 80;
                    }
                    break;
                case 2278:
                    if (upperCase.equals("GM")) {
                        b14 = 81;
                    }
                    break;
                case 2279:
                    if (upperCase.equals("GN")) {
                        b14 = 82;
                    }
                    break;
                case 2281:
                    if (upperCase.equals("GP")) {
                        b14 = 83;
                    }
                    break;
                case 2282:
                    if (upperCase.equals("GQ")) {
                        b14 = 84;
                    }
                    break;
                case 2283:
                    if (upperCase.equals("GR")) {
                        b14 = 85;
                    }
                    break;
                case 2285:
                    if (upperCase.equals("GT")) {
                        b14 = 86;
                    }
                    break;
                case 2286:
                    if (upperCase.equals("GU")) {
                        b14 = 87;
                    }
                    break;
                case 2288:
                    if (upperCase.equals("GW")) {
                        b14 = 88;
                    }
                    break;
                case 2290:
                    if (upperCase.equals("GY")) {
                        b14 = 89;
                    }
                    break;
                case 2307:
                    if (upperCase.equals("HK")) {
                        b14 = 90;
                    }
                    break;
                case 2314:
                    if (upperCase.equals("HR")) {
                        b14 = 91;
                    }
                    break;
                case 2316:
                    if (upperCase.equals("HT")) {
                        b14 = 92;
                    }
                    break;
                case 2317:
                    if (upperCase.equals("HU")) {
                        b14 = 93;
                    }
                    break;
                case 2331:
                    if (upperCase.equals("ID")) {
                        b14 = 94;
                    }
                    break;
                case 2332:
                    if (upperCase.equals("IE")) {
                        b14 = 95;
                    }
                    break;
                case 2339:
                    if (upperCase.equals("IL")) {
                        b14 = 96;
                    }
                    break;
                case 2340:
                    if (upperCase.equals("IM")) {
                        b14 = 97;
                    }
                    break;
                case 2341:
                    if (upperCase.equals("IN")) {
                        b14 = 98;
                    }
                    break;
                case 2342:
                    if (upperCase.equals("IO")) {
                        b14 = 99;
                    }
                    break;
                case 2344:
                    if (upperCase.equals("IQ")) {
                        b14 = 100;
                    }
                    break;
                case 2345:
                    if (upperCase.equals("IR")) {
                        b14 = 101;
                    }
                    break;
                case 2346:
                    if (upperCase.equals("IS")) {
                        b14 = 102;
                    }
                    break;
                case 2347:
                    if (upperCase.equals("IT")) {
                        b14 = 103;
                    }
                    break;
                case 2363:
                    if (upperCase.equals("JE")) {
                        b14 = 104;
                    }
                    break;
                case 2371:
                    if (upperCase.equals("JM")) {
                        b14 = 105;
                    }
                    break;
                case 2373:
                    if (upperCase.equals("JO")) {
                        b14 = 106;
                    }
                    break;
                case 2374:
                    if (upperCase.equals("JP")) {
                        b14 = 107;
                    }
                    break;
                case 2394:
                    if (upperCase.equals("KE")) {
                        b14 = 108;
                    }
                    break;
                case 2396:
                    if (upperCase.equals("KG")) {
                        b14 = 109;
                    }
                    break;
                case 2397:
                    if (upperCase.equals("KH")) {
                        b14 = 110;
                    }
                    break;
                case 2398:
                    if (upperCase.equals("KI")) {
                        b14 = 111;
                    }
                    break;
                case 2402:
                    if (upperCase.equals("KM")) {
                        b14 = 112;
                    }
                    break;
                case 2403:
                    if (upperCase.equals("KN")) {
                        b14 = 113;
                    }
                    break;
                case 2407:
                    if (upperCase.equals("KR")) {
                        b14 = 114;
                    }
                    break;
                case 2412:
                    if (upperCase.equals("KW")) {
                        b14 = 115;
                    }
                    break;
                case 2414:
                    if (upperCase.equals("KY")) {
                        b14 = 116;
                    }
                    break;
                case 2415:
                    if (upperCase.equals("KZ")) {
                        b14 = 117;
                    }
                    break;
                case 2421:
                    if (upperCase.equals("LA")) {
                        b14 = 118;
                    }
                    break;
                case 2422:
                    if (upperCase.equals("LB")) {
                        b14 = 119;
                    }
                    break;
                case 2423:
                    if (upperCase.equals("LC")) {
                        b14 = 120;
                    }
                    break;
                case 2429:
                    if (upperCase.equals("LI")) {
                        b14 = 121;
                    }
                    break;
                case 2431:
                    if (upperCase.equals("LK")) {
                        b14 = 122;
                    }
                    break;
                case 2438:
                    if (upperCase.equals(LocaleUnitResolver.ImperialCountryCode.LIBERIA)) {
                        b14 = 123;
                    }
                    break;
                case 2439:
                    if (upperCase.equals("LS")) {
                        b14 = 124;
                    }
                    break;
                case 2440:
                    if (upperCase.equals("LT")) {
                        b14 = 125;
                    }
                    break;
                case 2441:
                    if (upperCase.equals("LU")) {
                        b14 = 126;
                    }
                    break;
                case 2442:
                    if (upperCase.equals("LV")) {
                        b14 = Ascii.DEL;
                    }
                    break;
                case 2445:
                    if (upperCase.equals("LY")) {
                        b14 = UnsignedBytes.MAX_POWER_OF_TWO;
                    }
                    break;
                case 2452:
                    if (upperCase.equals("MA")) {
                        b14 = 129;
                    }
                    break;
                case 2454:
                    if (upperCase.equals("MC")) {
                        b14 = 130;
                    }
                    break;
                case 2455:
                    if (upperCase.equals("MD")) {
                        b14 = 131;
                    }
                    break;
                case 2456:
                    if (upperCase.equals("ME")) {
                        b14 = 132;
                    }
                    break;
                case 2457:
                    if (upperCase.equals("MF")) {
                        b14 = 133;
                    }
                    break;
                case 2458:
                    if (upperCase.equals("MG")) {
                        b14 = 134;
                    }
                    break;
                case 2459:
                    if (upperCase.equals("MH")) {
                        b14 = 135;
                    }
                    break;
                case 2462:
                    if (upperCase.equals("MK")) {
                        b14 = 136;
                    }
                    break;
                case 2463:
                    if (upperCase.equals("ML")) {
                        b14 = 137;
                    }
                    break;
                case 2464:
                    if (upperCase.equals(LocaleUnitResolver.ImperialCountryCode.MYANMAR)) {
                        b14 = 138;
                    }
                    break;
                case 2465:
                    if (upperCase.equals("MN")) {
                        b14 = 139;
                    }
                    break;
                case 2466:
                    if (upperCase.equals("MO")) {
                        b14 = 140;
                    }
                    break;
                case 2467:
                    if (upperCase.equals("MP")) {
                        b14 = 141;
                    }
                    break;
                case 2468:
                    if (upperCase.equals("MQ")) {
                        b14 = 142;
                    }
                    break;
                case 2469:
                    if (upperCase.equals("MR")) {
                        b14 = 143;
                    }
                    break;
                case 2470:
                    if (upperCase.equals("MS")) {
                        b14 = 144;
                    }
                    break;
                case 2471:
                    if (upperCase.equals("MT")) {
                        b14 = 145;
                    }
                    break;
                case 2472:
                    if (upperCase.equals("MU")) {
                        b14 = 146;
                    }
                    break;
                case 2473:
                    if (upperCase.equals("MV")) {
                        b14 = 147;
                    }
                    break;
                case 2474:
                    if (upperCase.equals("MW")) {
                        b14 = 148;
                    }
                    break;
                case 2475:
                    if (upperCase.equals("MX")) {
                        b14 = 149;
                    }
                    break;
                case 2476:
                    if (upperCase.equals("MY")) {
                        b14 = 150;
                    }
                    break;
                case 2477:
                    if (upperCase.equals("MZ")) {
                        b14 = 151;
                    }
                    break;
                case 2483:
                    if (upperCase.equals("NA")) {
                        b14 = 152;
                    }
                    break;
                case 2485:
                    if (upperCase.equals("NC")) {
                        b14 = 153;
                    }
                    break;
                case 2487:
                    if (upperCase.equals("NE")) {
                        b14 = 154;
                    }
                    break;
                case 2488:
                    if (upperCase.equals("NF")) {
                        b14 = 155;
                    }
                    break;
                case 2489:
                    if (upperCase.equals("NG")) {
                        b14 = 156;
                    }
                    break;
                case 2491:
                    if (upperCase.equals("NI")) {
                        b14 = 157;
                    }
                    break;
                case 2494:
                    if (upperCase.equals("NL")) {
                        b14 = 158;
                    }
                    break;
                case 2497:
                    if (upperCase.equals("NO")) {
                        b14 = 159;
                    }
                    break;
                case 2498:
                    if (upperCase.equals("NP")) {
                        b14 = 160;
                    }
                    break;
                case DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS /* 2500 */:
                    if (upperCase.equals("NR")) {
                        b14 = 161;
                    }
                    break;
                case 2503:
                    if (upperCase.equals("NU")) {
                        b14 = 162;
                    }
                    break;
                case 2508:
                    if (upperCase.equals("NZ")) {
                        b14 = 163;
                    }
                    break;
                case 2526:
                    if (upperCase.equals("OM")) {
                        b14 = 164;
                    }
                    break;
                case 2545:
                    if (upperCase.equals("PA")) {
                        b14 = 165;
                    }
                    break;
                case 2549:
                    if (upperCase.equals("PE")) {
                        b14 = 166;
                    }
                    break;
                case 2550:
                    if (upperCase.equals("PF")) {
                        b14 = 167;
                    }
                    break;
                case 2551:
                    if (upperCase.equals("PG")) {
                        b14 = 168;
                    }
                    break;
                case 2552:
                    if (upperCase.equals("PH")) {
                        b14 = 169;
                    }
                    break;
                case 2555:
                    if (upperCase.equals("PK")) {
                        b14 = 170;
                    }
                    break;
                case 2556:
                    if (upperCase.equals("PL")) {
                        b14 = 171;
                    }
                    break;
                case 2557:
                    if (upperCase.equals("PM")) {
                        b14 = 172;
                    }
                    break;
                case 2562:
                    if (upperCase.equals("PR")) {
                        b14 = 173;
                    }
                    break;
                case 2563:
                    if (upperCase.equals("PS")) {
                        b14 = 174;
                    }
                    break;
                case 2564:
                    if (upperCase.equals("PT")) {
                        b14 = 175;
                    }
                    break;
                case 2567:
                    if (upperCase.equals("PW")) {
                        b14 = 176;
                    }
                    break;
                case 2569:
                    if (upperCase.equals("PY")) {
                        b14 = 177;
                    }
                    break;
                case 2576:
                    if (upperCase.equals("QA")) {
                        b14 = 178;
                    }
                    break;
                case 2611:
                    if (upperCase.equals("RE")) {
                        b14 = 179;
                    }
                    break;
                case 2621:
                    if (upperCase.equals("RO")) {
                        b14 = 180;
                    }
                    break;
                case 2625:
                    if (upperCase.equals("RS")) {
                        b14 = 181;
                    }
                    break;
                case 2627:
                    if (upperCase.equals("RU")) {
                        b14 = 182;
                    }
                    break;
                case 2629:
                    if (upperCase.equals("RW")) {
                        b14 = 183;
                    }
                    break;
                case 2638:
                    if (upperCase.equals("SA")) {
                        b14 = 184;
                    }
                    break;
                case 2639:
                    if (upperCase.equals("SB")) {
                        b14 = 185;
                    }
                    break;
                case 2640:
                    if (upperCase.equals("SC")) {
                        b14 = 186;
                    }
                    break;
                case 2641:
                    if (upperCase.equals("SD")) {
                        b14 = 187;
                    }
                    break;
                case 2642:
                    if (upperCase.equals("SE")) {
                        b14 = 188;
                    }
                    break;
                case 2644:
                    if (upperCase.equals("SG")) {
                        b14 = 189;
                    }
                    break;
                case 2645:
                    if (upperCase.equals("SH")) {
                        b14 = 190;
                    }
                    break;
                case 2646:
                    if (upperCase.equals("SI")) {
                        b14 = 191;
                    }
                    break;
                case 2647:
                    if (upperCase.equals("SJ")) {
                        b14 = 192;
                    }
                    break;
                case 2648:
                    if (upperCase.equals("SK")) {
                        b14 = 193;
                    }
                    break;
                case 2649:
                    if (upperCase.equals("SL")) {
                        b14 = 194;
                    }
                    break;
                case 2650:
                    if (upperCase.equals("SM")) {
                        b14 = 195;
                    }
                    break;
                case 2651:
                    if (upperCase.equals("SN")) {
                        b14 = 196;
                    }
                    break;
                case 2652:
                    if (upperCase.equals("SO")) {
                        b14 = 197;
                    }
                    break;
                case 2655:
                    if (upperCase.equals("SR")) {
                        b14 = 198;
                    }
                    break;
                case 2656:
                    if (upperCase.equals("SS")) {
                        b14 = 199;
                    }
                    break;
                case 2657:
                    if (upperCase.equals("ST")) {
                        b14 = 200;
                    }
                    break;
                case 2659:
                    if (upperCase.equals("SV")) {
                        b14 = 201;
                    }
                    break;
                case 2661:
                    if (upperCase.equals("SX")) {
                        b14 = 202;
                    }
                    break;
                case 2662:
                    if (upperCase.equals("SY")) {
                        b14 = 203;
                    }
                    break;
                case 2663:
                    if (upperCase.equals("SZ")) {
                        b14 = 204;
                    }
                    break;
                case 2671:
                    if (upperCase.equals("TC")) {
                        b14 = 205;
                    }
                    break;
                case 2672:
                    if (upperCase.equals("TD")) {
                        b14 = 206;
                    }
                    break;
                case 2675:
                    if (upperCase.equals("TG")) {
                        b14 = 207;
                    }
                    break;
                case 2676:
                    if (upperCase.equals("TH")) {
                        b14 = 208;
                    }
                    break;
                case 2678:
                    if (upperCase.equals("TJ")) {
                        b14 = 209;
                    }
                    break;
                case 2680:
                    if (upperCase.equals("TL")) {
                        b14 = 210;
                    }
                    break;
                case 2681:
                    if (upperCase.equals("TM")) {
                        b14 = 211;
                    }
                    break;
                case 2682:
                    if (upperCase.equals("TN")) {
                        b14 = 212;
                    }
                    break;
                case 2683:
                    if (upperCase.equals("TO")) {
                        b14 = 213;
                    }
                    break;
                case 2686:
                    if (upperCase.equals("TR")) {
                        b14 = 214;
                    }
                    break;
                case 2688:
                    if (upperCase.equals("TT")) {
                        b14 = 215;
                    }
                    break;
                case 2690:
                    if (upperCase.equals("TV")) {
                        b14 = 216;
                    }
                    break;
                case 2691:
                    if (upperCase.equals("TW")) {
                        b14 = 217;
                    }
                    break;
                case 2694:
                    if (upperCase.equals("TZ")) {
                        b14 = 218;
                    }
                    break;
                case 2700:
                    if (upperCase.equals("UA")) {
                        b14 = 219;
                    }
                    break;
                case 2706:
                    if (upperCase.equals("UG")) {
                        b14 = 220;
                    }
                    break;
                case 2718:
                    if (upperCase.equals(LocaleUnitResolver.ImperialCountryCode.US)) {
                        b14 = 221;
                    }
                    break;
                case 2724:
                    if (upperCase.equals("UY")) {
                        b14 = 222;
                    }
                    break;
                case 2725:
                    if (upperCase.equals("UZ")) {
                        b14 = 223;
                    }
                    break;
                case 2731:
                    if (upperCase.equals("VA")) {
                        b14 = 224;
                    }
                    break;
                case 2733:
                    if (upperCase.equals("VC")) {
                        b14 = 225;
                    }
                    break;
                case 2735:
                    if (upperCase.equals("VE")) {
                        b14 = 226;
                    }
                    break;
                case 2737:
                    if (upperCase.equals("VG")) {
                        b14 = 227;
                    }
                    break;
                case 2739:
                    if (upperCase.equals("VI")) {
                        b14 = 228;
                    }
                    break;
                case 2744:
                    if (upperCase.equals("VN")) {
                        b14 = 229;
                    }
                    break;
                case 2751:
                    if (upperCase.equals("VU")) {
                        b14 = 230;
                    }
                    break;
                case 2767:
                    if (upperCase.equals("WF")) {
                        b14 = 231;
                    }
                    break;
                case 2780:
                    if (upperCase.equals("WS")) {
                        b14 = 232;
                    }
                    break;
                case 2803:
                    if (upperCase.equals("XK")) {
                        b14 = 233;
                    }
                    break;
                case 2828:
                    if (upperCase.equals("YE")) {
                        b14 = 234;
                    }
                    break;
                case 2843:
                    if (upperCase.equals("YT")) {
                        b14 = 235;
                    }
                    break;
                case 2855:
                    if (upperCase.equals("ZA")) {
                        b14 = 236;
                    }
                    break;
                case 2867:
                    if (upperCase.equals("ZM")) {
                        b14 = 237;
                    }
                    break;
                case 2877:
                    if (upperCase.equals("ZW")) {
                        b14 = 238;
                    }
                    break;
            }
            switch (b14) {
                case 0:
                case 4:
                case 17:
                case 29:
                case 50:
                case 57:
                case 113:
                case 116:
                case 202:
                case 225:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case 41:
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case 8:
                case 63:
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case 9:
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case 10:
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case 61:
                case 93:
                case 102:
                case 127:
                case 145:
                case TsExtractor.TS_PACKET_SIZE /* 188 */:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case 12:
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case 13:
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case 51:
                case 121:
                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case 55:
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case 106:
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case 20:
                case 187:
                case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case 175:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 84:
                case 92:
                case 154:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 25:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case 26:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case 28:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case 30:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case 31:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case 32:
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case 33:
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case 34:
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case 35:
                case 42:
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case 36:
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case 37:
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case 38:
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case 39:
                case 62:
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case 40:
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case 43:
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case 44:
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case 45:
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case 46:
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case 47:
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case 48:
                case 111:
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case 49:
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case 52:
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case 53:
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case 54:
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case 56:
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case 58:
                case 123:
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case 59:
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case 60:
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case 64:
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 65:
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 66:
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 67:
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 68:
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                case 192:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 69:
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 70:
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 71:
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 72:
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case 73:
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 74:
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 75:
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case 76:
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 77:
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 78:
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 79:
                case 97:
                case 104:
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 80:
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 81:
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 82:
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 83:
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 85:
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 86:
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 87:
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 88:
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case 89:
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 90:
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case 91:
                case 115:
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case 94:
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case 95:
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case 96:
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 98:
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case 99:
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case 100:
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 101:
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case 103:
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 105:
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 107:
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 108:
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 109:
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 110:
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 112:
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 114:
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 117:
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 118:
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 119:
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 120:
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 122:
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case 124:
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case 125:
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case 126:
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                case 211:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case SyslogConstants.LOG_LOCAL3 /* 152 */:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case SyslogConstants.LOG_LOCAL4 /* 160 */:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case SyslogConstants.LOG_LOCAL7 /* 184 */:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case 185:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 215:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case 217:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList2 = h.f189681n;
            map.put(2, immutableList2.get(iArr[0]));
            map.put(3, h.f189682o.get(iArr[1]));
            map.put(4, h.f189683p.get(iArr[2]));
            map.put(5, h.f189684q.get(iArr[3]));
            map.put(10, h.f189685r.get(iArr[4]));
            map.put(9, h.f189686s.get(iArr[5]));
            map.put(7, immutableList2.get(iArr[0]));
            this.f189702b = map;
            this.f189703c = 2000;
            this.f189704d = fa.c.f70004a;
            this.f189705e = true;
        }
    }

    private h(Context context, Map<Integer, Long> map, int i14, fa.c cVar, boolean z14) {
        this.f189688a = ImmutableMap.copyOf((Map) map);
        this.f189689b = new c.a.C3528a();
        this.f189692e = new i(i14);
        this.f189690c = cVar;
        this.f189691d = z14;
        if (context == null) {
            this.f189700m = 0;
            this.f189698k = f(0);
            return;
        }
        o oVarB = o.b(context);
        int iC = oVarB.c();
        this.f189700m = iC;
        this.f189698k = f(iC);
        g gVar = new g(this);
        CopyOnWriteArrayList<WeakReference<o.b>> copyOnWriteArrayList = oVarB.f70042b;
        for (WeakReference<o.b> weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference<>(gVar));
        oVarB.f70041a.post(new df.d(8, oVarB, gVar));
    }

    public static synchronized h g(Context context) {
        try {
            if (f189687t == null) {
                b bVar = new b(context);
                f189687t = new h(bVar.f189701a, bVar.f189702b, bVar.f189703c, bVar.f189704d, bVar.f189705e);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f189687t;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0012 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0014 A[Catch: all -> 0x000d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:15:0x0014), top: B:20:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0012, please report this as an issue */
    @Override // ha.n
    public final synchronized void a(ha.g gVar, boolean z14, int i14) {
        boolean z15;
        if (!z14) {
            z15 = false;
            if (z15) {
                this.f189695h += (long) i14;
                return;
            }
            return;
        }
        if ((gVar.f82563i & 8) == 8) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            return;
        }
        this.f189695h += (long) i14;
        return;
        throw th;
    }

    @Override // xa.c
    public final void b(c.a aVar) {
        CopyOnWriteArrayList<c.a.C3528a.C3529a> copyOnWriteArrayList = this.f189689b.f189667a;
        for (c.a.C3528a.C3529a c3529a : copyOnWriteArrayList) {
            if (c3529a.f189669b == aVar) {
                c3529a.f189670c = true;
                copyOnWriteArrayList.remove(c3529a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0014  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:18:0x001d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:16:0x0019, B:19:0x001e, B:21:0x003b, B:28:0x0066, B:27:0x005d), top: B:42:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:16:0x0019, B:19:0x001e, B:21:0x003b, B:28:0x0066, B:27:0x005d), top: B:42:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0017, please report this as an issue */
    @Override // ha.n
    public final synchronized void c(ha.g gVar, boolean z14) throws Throwable {
        Throwable th3;
        boolean z15;
        long jElapsedRealtime;
        int i14;
        long j8;
        h hVar;
        try {
            if (!z14) {
                z15 = false;
                if (z15) {
                    fa.a.d(this.f189693f > 0);
                    jElapsedRealtime = this.f189690c.elapsedRealtime();
                    i14 = (int) (jElapsedRealtime - this.f189694g);
                    this.f189696i += (long) i14;
                    long j14 = this.f189697j;
                    j8 = this.f189695h;
                    this.f189697j = j14 + j8;
                    if (i14 > 0) {
                        this.f189692e.a((int) Math.sqrt(j8), (j8 * 8000.0f) / i14);
                        if (this.f189696i < 2000) {
                            this.f189698k = (long) this.f189692e.b();
                        } else {
                            this.f189698k = (long) this.f189692e.b();
                        }
                        hVar = this;
                        hVar.h(i14, this.f189695h, this.f189698k);
                        hVar.f189694g = jElapsedRealtime;
                        hVar.f189695h = 0L;
                    } else {
                        hVar = this;
                    }
                    hVar.f189693f--;
                    return;
                }
                return;
            }
            try {
                if ((gVar.f82563i & 8) == 8) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15) {
                    return;
                }
                try {
                    fa.a.d(this.f189693f > 0);
                    jElapsedRealtime = this.f189690c.elapsedRealtime();
                    i14 = (int) (jElapsedRealtime - this.f189694g);
                    this.f189696i += (long) i14;
                    long j15 = this.f189697j;
                    j8 = this.f189695h;
                    this.f189697j = j15 + j8;
                    if (i14 > 0) {
                        this.f189692e.a((int) Math.sqrt(j8), (j8 * 8000.0f) / i14);
                        if (this.f189696i < 2000 || this.f189697j >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                            this.f189698k = (long) this.f189692e.b();
                        }
                        hVar = this;
                        hVar.h(i14, this.f189695h, this.f189698k);
                        hVar.f189694g = jElapsedRealtime;
                        hVar.f189695h = 0L;
                    } else {
                        hVar = this;
                    }
                    hVar.f189693f--;
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th5) {
                th3 = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        throw th3;
    }

    @Override // xa.c
    public final void d(Handler handler, c.a aVar) {
        aVar.getClass();
        c.a.C3528a c3528a = this.f189689b;
        c3528a.getClass();
        CopyOnWriteArrayList<c.a.C3528a.C3529a> copyOnWriteArrayList = c3528a.f189667a;
        for (c.a.C3528a.C3529a c3529a : copyOnWriteArrayList) {
            if (c3529a.f189669b == aVar) {
                c3529a.f189670c = true;
                copyOnWriteArrayList.remove(c3529a);
            }
        }
        copyOnWriteArrayList.add(new c.a.C3528a.C3529a(handler, aVar));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    /* JADX WARN: Code duplicated, block: B:14:0x0013 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x0015 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0004, B:16:0x0015, B:18:0x0019, B:19:0x0021), top: B:24:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0019 A[Catch: all -> 0x000e, TryCatch #0 {, blocks: (B:5:0x0004, B:16:0x0015, B:18:0x0019, B:19:0x0021), top: B:24:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0013, please report this as an issue */
    @Override // ha.n
    public final synchronized void e(ha.g gVar, boolean z14) {
        boolean z15;
        if (!z14) {
            z15 = false;
            if (z15) {
                if (this.f189693f == 0) {
                    this.f189694g = this.f189690c.elapsedRealtime();
                }
                this.f189693f++;
                return;
            }
            return;
        }
        if ((gVar.f82563i & 8) == 8) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            return;
        }
        if (this.f189693f == 0) {
            this.f189694g = this.f189690c.elapsedRealtime();
        }
        this.f189693f++;
        return;
        throw th;
    }

    public final long f(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        ImmutableMap<Integer, Long> immutableMap = this.f189688a;
        Long l14 = immutableMap.get(numValueOf);
        if (l14 == null) {
            l14 = immutableMap.get(0);
        }
        if (l14 == null) {
            l14 = 1000000L;
        }
        return l14.longValue();
    }

    @Override // xa.c
    public final synchronized long getBitrateEstimate() {
        return this.f189698k;
    }

    @Override // xa.c
    public final h getTransferListener() {
        return this;
    }

    public final void h(int i14, long j8, long j14) {
        int i15;
        long j15;
        long j16;
        if (i14 == 0 && j8 == 0 && j14 == this.f189699l) {
            return;
        }
        this.f189699l = j14;
        for (c.a.C3528a.C3529a c3529a : this.f189689b.f189667a) {
            if (c3529a.f189670c) {
                i15 = i14;
                j15 = j8;
                j16 = j14;
            } else {
                i15 = i14;
                j15 = j8;
                j16 = j14;
                c3529a.f189668a.post(new com.google.android.exoplayer2.audio.a(c3529a, i15, j15, j16, 2));
            }
            i14 = i15;
            j8 = j15;
            j14 = j16;
        }
    }
}
