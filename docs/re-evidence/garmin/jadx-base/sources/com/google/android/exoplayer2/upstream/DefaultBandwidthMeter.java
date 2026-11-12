package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.common.MlKitException;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.of(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.of(1700000L, 820000L, 450000L, 180000L, 130000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.of(2300000L, 1300000L, 1000000L, 820000L, 570000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.of(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.of(7500000L, 5200000L, 3700000L, (long) Long.valueOf(ComponentTracker.DEFAULT_TIMEOUT), 1100000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.of(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);

    private DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i14, Clock clock, boolean z14) {
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i14);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z14;
        if (context == null) {
            this.networkType = 0;
            this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(0);
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: com.google.android.exoplayer2.upstream.c
            @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i15) throws Throwable {
                this.f53130a.onNetworkTypeChanged(i15);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] getInitialBitrateCountryGroupAssignment(String str) {
        str.getClass();
        byte b14 = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b14 = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b14 = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b14 = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b14 = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b14 = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b14 = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b14 = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b14 = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b14 = 8;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    b14 = 9;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b14 = 10;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b14 = Ascii.VT;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b14 = Ascii.FF;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b14 = Ascii.CR;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b14 = Ascii.SO;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b14 = Ascii.SI;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b14 = Ascii.DLE;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b14 = 17;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b14 = Ascii.DC2;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b14 = 19;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b14 = Ascii.DC4;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b14 = Ascii.NAK;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b14 = Ascii.SYN;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b14 = Ascii.ETB;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b14 = Ascii.CAN;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b14 = Ascii.EM;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b14 = Ascii.SUB;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b14 = Ascii.ESC;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b14 = Ascii.FS;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b14 = Ascii.GS;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b14 = Ascii.RS;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b14 = Ascii.US;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b14 = 32;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b14 = 33;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b14 = 34;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b14 = 35;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b14 = 36;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b14 = 37;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b14 = 38;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b14 = 39;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b14 = 40;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b14 = 41;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b14 = 42;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b14 = 43;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b14 = 44;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b14 = 45;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b14 = 46;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b14 = 47;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b14 = 48;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b14 = 49;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b14 = 50;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b14 = 51;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b14 = 52;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b14 = 53;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b14 = 54;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b14 = 55;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b14 = 56;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b14 = 57;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b14 = 58;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b14 = 59;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b14 = 60;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b14 = 61;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b14 = 62;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b14 = 63;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b14 = SignedBytes.MAX_POWER_OF_TWO;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b14 = 65;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b14 = 66;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b14 = 67;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    b14 = 68;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b14 = 69;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b14 = 70;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b14 = 71;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b14 = 72;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b14 = 73;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b14 = 74;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b14 = 75;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b14 = 76;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b14 = 77;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b14 = 78;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b14 = 79;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b14 = 80;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b14 = 81;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b14 = 82;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b14 = 83;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b14 = 84;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b14 = 85;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b14 = 86;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b14 = 87;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b14 = 88;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b14 = 89;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b14 = 90;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    b14 = 91;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b14 = 92;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b14 = 93;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b14 = 94;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b14 = 95;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b14 = 96;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b14 = 97;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b14 = 98;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b14 = 99;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b14 = 100;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b14 = 101;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b14 = 102;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b14 = 103;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b14 = 104;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b14 = 105;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b14 = 106;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b14 = 107;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b14 = 108;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b14 = 109;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b14 = 110;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b14 = 111;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b14 = 112;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b14 = 113;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    b14 = 114;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b14 = 115;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b14 = 116;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b14 = 117;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b14 = 118;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b14 = 119;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b14 = 120;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b14 = 121;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b14 = 122;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b14 = 123;
                }
                break;
            case 2438:
                if (str.equals(LocaleUnitResolver.ImperialCountryCode.LIBERIA)) {
                    b14 = 124;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b14 = 125;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b14 = 126;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b14 = Ascii.DEL;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b14 = UnsignedBytes.MAX_POWER_OF_TWO;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b14 = 129;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b14 = 130;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b14 = 131;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b14 = 132;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b14 = 133;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b14 = 134;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b14 = 135;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b14 = 136;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b14 = 137;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b14 = 138;
                }
                break;
            case 2464:
                if (str.equals(LocaleUnitResolver.ImperialCountryCode.MYANMAR)) {
                    b14 = 139;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b14 = 140;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b14 = 141;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b14 = 142;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b14 = 143;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b14 = 144;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b14 = 145;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b14 = 146;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b14 = 147;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b14 = 148;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b14 = 149;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b14 = 150;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b14 = 151;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b14 = 152;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b14 = 153;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b14 = 154;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b14 = 155;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b14 = 156;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b14 = 157;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b14 = 158;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b14 = 159;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b14 = 160;
                }
                break;
            case DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS /* 2500 */:
                if (str.equals("NR")) {
                    b14 = 161;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b14 = 162;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b14 = 163;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b14 = 164;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b14 = 165;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b14 = 166;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b14 = 167;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b14 = 168;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b14 = 169;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b14 = 170;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b14 = 171;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b14 = 172;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b14 = 173;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b14 = 174;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b14 = 175;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b14 = 176;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b14 = 177;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b14 = 178;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b14 = 179;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b14 = 180;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b14 = 181;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b14 = 182;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b14 = 183;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b14 = 184;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b14 = 185;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b14 = 186;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b14 = 187;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b14 = 188;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b14 = 189;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b14 = 190;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b14 = 191;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b14 = 192;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b14 = 193;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b14 = 194;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b14 = 195;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b14 = 196;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b14 = 197;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b14 = 198;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b14 = 199;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b14 = 200;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b14 = 201;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b14 = 202;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b14 = 203;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b14 = 204;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b14 = 205;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b14 = 206;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b14 = 207;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b14 = 208;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b14 = 209;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b14 = 210;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b14 = 211;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b14 = 212;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b14 = 213;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b14 = 214;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b14 = 215;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b14 = 216;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b14 = 217;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b14 = 218;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b14 = 219;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b14 = 220;
                }
                break;
            case 2718:
                if (str.equals(LocaleUnitResolver.ImperialCountryCode.US)) {
                    b14 = 221;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b14 = 222;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b14 = 223;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b14 = 224;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b14 = 225;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b14 = 226;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b14 = 227;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b14 = 228;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b14 = 229;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b14 = 230;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b14 = 231;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    b14 = 232;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b14 = 233;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b14 = 234;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b14 = 235;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b14 = 236;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b14 = 237;
                }
                break;
        }
        switch (b14) {
            case 0:
            case 26:
            case 80:
            case 121:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 3, 2};
            case 2:
            case 93:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 187:
            case 196:
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 3:
                return new int[]{2, 3, 1, 2, 2, 2};
            case 4:
            case 25:
            case 51:
            case 57:
            case 74:
            case 145:
            case 224:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 5:
            case 16:
            case 117:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 4, 2, 2};
            case 7:
            case 44:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 8:
            case 63:
            case 100:
            case 162:
            case 190:
            case 199:
            case 216:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 4, 1, 1, 2, 2};
            case 10:
                return new int[]{2, 2, 2, 3, 2, 2};
            case 11:
            case 40:
            case 103:
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
            case 193:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 1, 0, 1, 2, 2};
            case 13:
            case 87:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 14:
            case 79:
            case 122:
            case 142:
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
            case 192:
            case 195:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 154:
                return new int[]{3, 2, 4, 4, 2, 2};
            case 17:
            case 70:
            case 77:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
            case 151:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 0, 3, 3, 2, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 53:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 2, 4, 4, 2};
            case 23:
            case 59:
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
            case 210:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 27:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 28:
                return new int[]{1, 3, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 30:
            case 198:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 31:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 32:
                return new int[]{3, 1, 3, 2, 2, 2};
            case 33:
            case 89:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 34:
                return new int[]{0, 1, 1, 3, 2, 2};
            case 35:
                return new int[]{2, 4, 2, 2, 2, 2};
            case 36:
                return new int[]{0, 2, 1, 2, 4, 1};
            case 37:
                return new int[]{4, 2, 3, 1, 2, 2};
            case 38:
                return new int[]{4, 2, 3, 2, 2, 2};
            case 39:
            case 150:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 41:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 43:
            case 171:
            case 221:
                return new int[]{1, 1, 2, 2, 3, 2};
            case 45:
                return new int[]{2, 0, 2, 2, 3, 1};
            case 46:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 47:
                return new int[]{2, 2, 4, 4, 2, 2};
            case 48:
            case 168:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 49:
                return new int[]{2, 3, 1, 0, 2, 2};
            case 50:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 52:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 54:
                return new int[]{0, 0, 2, 2, 1, 2};
            case 55:
                return new int[]{4, 1, 4, 4, 2, 2};
            case 56:
                return new int[]{0, 0, 1, 0, 0, 2};
            case 58:
            case 106:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 60:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 61:
            case 126:
            case 128:
            case 146:
                return new int[]{0, 0, 0, 0, 2, 2};
            case 62:
                return new int[]{3, 4, 2, 3, 2, 2};
            case 64:
            case 96:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 65:
                return new int[]{4, 4, 3, 1, 2, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 1, 3, 3, 2, 2};
            case 68:
            case 114:
            case 130:
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
            case 200:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{3, 2, 4, 2, 2, 2};
            case 71:
                return new int[]{1, 1, 2, 1, 1, 1};
            case 72:
                return new int[]{2, 3, 1, 1, 2, 2};
            case 73:
                return new int[]{0, 0, 1, 1, 2, 3};
            case 75:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 76:
            case 83:
            case 143:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 78:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 81:
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 82:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 84:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 85:
            case 92:
            case 132:
            case 137:
            case 181:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 86:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 88:
            case 218:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 2, 3, 2, 0};
            case 91:
            case 170:
            case 197:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 94:
                return new int[]{0, 0, 0, 1, 3, 2};
            case 95:
                return new int[]{3, 2, 3, 3, 3, 2};
            case 97:
                return new int[]{1, 1, 2, 3, 4, 2};
            case 98:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 99:
                return new int[]{1, 1, 3, 2, 4, 3};
            case 101:
            case 220:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 102:
                return new int[]{3, 0, 1, 1, 3, 0};
            case 104:
                return new int[]{0, 1, 0, 1, 1, 2};
            case 105:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 107:
            case 133:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 108:
                return new int[]{0, 1, 0, 1, 1, 1};
            case 109:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 110:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 111:
                return new int[]{1, 1, 4, 2, 2, 2};
            case 112:
            case 113:
            case 129:
            case 185:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 115:
                return new int[]{0, 0, 1, 3, 4, 4};
            case 116:
                return new int[]{1, 1, 0, 0, 0, 2};
            case 118:
                return new int[]{1, 1, 2, 2, 2, 2};
            case 119:
            case 222:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 120:
                return new int[]{3, 2, 1, 4, 2, 2};
            case 123:
                return new int[]{3, 1, 3, 4, 4, 2};
            case 124:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 125:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 127:
                return new int[]{1, 0, 2, 2, 2, 2};
            case 131:
                return new int[]{0, 2, 2, 0, 2, 2};
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                return new int[]{1, 2, 1, 0, 2, 2};
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                return new int[]{3, 4, 2, 2, 2, 2};
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                return new int[]{3, 2, 2, 4, 2, 2};
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 139:
                return new int[]{2, 4, 3, 3, 2, 2};
            case 140:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                return new int[]{4, 1, 3, 4, 2, 2};
            case 147:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 148:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 149:
                return new int[]{4, 2, 1, 0, 2, 2};
            case 153:
                return new int[]{4, 3, 2, 2, 2, 2};
            case 156:
                return new int[]{3, 4, 1, 1, 2, 2};
            case 157:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 158:
                return new int[]{0, 0, 3, 2, 0, 4};
            case 159:
                return new int[]{0, 0, 2, 0, 0, 2};
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 161:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 163:
                return new int[]{1, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 165:
                return new int[]{1, 3, 3, 3, 2, 2};
            case 166:
                return new int[]{2, 3, 4, 4, 4, 2};
            case 167:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 2, 3, 3, 3, 2};
            case 173:
                return new int[]{2, 3, 2, 2, 3, 3};
            case 174:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{0, 1, 0, 0, 2, 2};
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 177:
                return new int[]{2, 2, 3, 2, 2, 2};
            case 178:
                return new int[]{2, 4, 2, 4, 4, 2};
            case 179:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 182:
                return new int[]{0, 0, 0, 1, 2, 2};
            case 183:
                return new int[]{3, 4, 3, 0, 2, 2};
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
            case 212:
            case 226:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 186:
                return new int[]{4, 3, 0, 2, 2, 2};
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return new int[]{1, 1, 2, 3, 1, 4};
            case 194:
                return new int[]{4, 3, 4, 1, 2, 2};
            case 201:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 202:
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                return new int[]{2, 2, 1, 0, 2, 2};
            case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                return new int[]{4, 3, 2, 4, 2, 2};
            case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 208:
                return new int[]{0, 3, 2, 3, 3, 0};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 213:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 214:
                return new int[]{1, 1, 0, 1, 2, 2};
            case 215:
                return new int[]{1, 4, 1, 1, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 219:
                return new int[]{0, 3, 1, 1, 2, 2};
            case 223:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 227:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 228:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 229:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 232:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 234:
                return new int[]{4, 1, 1, 1, 2, 2};
            case 235:
                return new int[]{3, 3, 1, 1, 1, 2};
            case 236:
                return new int[]{3, 3, 4, 2, 2, 2};
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i14) {
        Long l14 = this.initialBitrateEstimates.get(Integer.valueOf(i14));
        if (l14 == null) {
            l14 = this.initialBitrateEstimates.get(0);
        }
        if (l14 == null) {
            l14 = 1000000L;
        }
        return l14.longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        try {
            if (singletonInstance == null) {
                singletonInstance = new Builder(context).build();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return singletonInstance;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z14) {
        return z14 && !dataSpec.isFlagSet(8);
    }

    private void maybeNotifyBandwidthSample(int i14, long j8, long j14) {
        if (i14 == 0 && j8 == 0 && j14 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j14;
        this.eventDispatcher.bandwidthSample(i14, j8, j14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i14) throws Throwable {
        Throwable th3;
        try {
            try {
                int i15 = this.networkType;
                if (i15 != 0) {
                    try {
                        if (!this.resetOnNetworkTypeChange) {
                            return;
                        }
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                }
                if (this.networkTypeOverrideSet) {
                    i14 = this.networkTypeOverride;
                }
                if (i15 == i14) {
                    return;
                }
                this.networkType = i14;
                if (i14 == 1 || i14 == 0 || i14 == 8) {
                    return;
                }
                this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i14);
                long jElapsedRealtime = this.clock.elapsedRealtime();
                maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (jElapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = jElapsedRealtime;
                this.sampleBytesTransferred = 0L;
                this.totalBytesTransferred = 0L;
                this.totalElapsedTimeMs = 0L;
                this.slidingPercentile.reset();
                return;
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
            }
        } catch (Throwable th6) {
            th = th6;
            th3 = th;
        }
        throw th3;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z14, int i14) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z14)) {
            this.sampleBytesTransferred += (long) i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z14) throws Throwable {
        Throwable th3;
        DefaultBandwidthMeter defaultBandwidthMeter;
        try {
            try {
                if (isTransferAtFullNetworkSpeed(dataSpec, z14)) {
                    Assertions.checkState(this.streamCount > 0);
                    long jElapsedRealtime = this.clock.elapsedRealtime();
                    int i14 = (int) (jElapsedRealtime - this.sampleStartTimeMs);
                    this.totalElapsedTimeMs += (long) i14;
                    long j8 = this.totalBytesTransferred;
                    long j14 = this.sampleBytesTransferred;
                    this.totalBytesTransferred = j8 + j14;
                    if (i14 > 0) {
                        this.slidingPercentile.addSample((int) Math.sqrt(j14), (j14 * 8000.0f) / i14);
                        if (this.totalElapsedTimeMs < 2000) {
                            try {
                                if (this.totalBytesTransferred >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                    this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                            }
                        } else {
                            this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                        }
                        defaultBandwidthMeter = this;
                        defaultBandwidthMeter.maybeNotifyBandwidthSample(i14, this.sampleBytesTransferred, this.bitrateEstimate);
                        defaultBandwidthMeter.sampleStartTimeMs = jElapsedRealtime;
                        defaultBandwidthMeter.sampleBytesTransferred = 0L;
                    } else {
                        defaultBandwidthMeter = this;
                    }
                    defaultBandwidthMeter.streamCount--;
                    return;
                }
                return;
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        throw th3;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z14) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z14) {
        try {
            if (isTransferAtFullNetworkSpeed(dataSpec, z14)) {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i14) {
        this.networkTypeOverride = i14;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i14);
    }

    public static final class Builder {
        private Clock clock;
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = DefaultBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            map.put(2, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            map.put(3, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            map.put(4, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            map.put(5, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            map.put(10, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            map.put(9, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            map.put(7, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            return map;
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setInitialBitrateEstimate(long j8) {
            Iterator<Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j8);
            }
            return this;
        }

        public Builder setResetOnNetworkTypeChange(boolean z14) {
            this.resetOnNetworkTypeChange = z14;
            return this;
        }

        public Builder setSlidingWindowMaxWeight(int i14) {
            this.slidingWindowMaxWeight = i14;
            return this;
        }

        public Builder setInitialBitrateEstimate(int i14, long j8) {
            this.initialBitrateEstimates.put(Integer.valueOf(i14), Long.valueOf(j8));
            return this;
        }

        public Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Ascii.toUpperCase(str));
            return this;
        }
    }

    @Deprecated
    public DefaultBandwidthMeter() {
        this(null, ImmutableMap.of(), 2000, Clock.DEFAULT, false);
    }
}
