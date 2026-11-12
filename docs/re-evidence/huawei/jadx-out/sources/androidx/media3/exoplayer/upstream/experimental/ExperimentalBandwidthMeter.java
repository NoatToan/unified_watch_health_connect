package androidx.media3.exoplayer.upstream.experimental;

import android.content.Context;
import android.os.Handler;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.huawei.health.h5pro.utils.RequestCode;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.hihealth.dictionary.model.HealthDataStatPolicy;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.openalliance.ad.constant.TradeMode;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.share.HiHealthError;
import com.huawei.operation.share.ShareConfig;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.up.model.UserInfomation;
import com.huawei.wearengine.sensor.Sensor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okio.Utf8;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes21.dex */
public final class ExperimentalBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA;
    public static final float DEFAULT_TIME_TO_FIRST_BYTE_PERCENTILE = 0.5f;
    public static final int DEFAULT_TIME_TO_FIRST_BYTE_SAMPLES = 20;
    private final BandwidthEstimator bandwidthEstimator;
    private long initialBitrateEstimate;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private final TimeToFirstByteEstimator timeToFirstByteEstimator;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    static {
        Long lValueOf = Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.of((long) lValueOf, 1300000L, 1000000L, 860000L, 610000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.of(2700000L, (long) lValueOf, 1600000L, 1300000L, 1000000L);
    }

    public static final class Builder {
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private TimeToFirstByteEstimator timeToFirstByteEstimator = new PercentileTimeToFirstByteEstimator(20, 0.5f);
        private BandwidthEstimator bandwidthEstimator = new SplitParallelSampleBandwidthEstimator.Builder().build();
        private boolean resetOnNetworkTypeChange = true;

        public Builder(Context context) {
            this.context = context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
        }

        public Builder setInitialBitrateEstimate(long j) {
            Iterator<Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j);
            }
            return this;
        }

        public Builder setInitialBitrateEstimate(int i, long j) {
            this.initialBitrateEstimates.put(Integer.valueOf(i), Long.valueOf(j));
            return this;
        }

        public Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Ascii.toUpperCase(str));
            return this;
        }

        public Builder setTimeToFirstByteEstimator(TimeToFirstByteEstimator timeToFirstByteEstimator) {
            this.timeToFirstByteEstimator = timeToFirstByteEstimator;
            return this;
        }

        public Builder setBandwidthEstimator(BandwidthEstimator bandwidthEstimator) {
            this.bandwidthEstimator = bandwidthEstimator;
            return this;
        }

        public Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        public ExperimentalBandwidthMeter build() {
            return new ExperimentalBandwidthMeter(this.context, this.initialBitrateEstimates, this.timeToFirstByteEstimator, this.bandwidthEstimator, this.resetOnNetworkTypeChange);
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = ExperimentalBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            map.put(2, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]));
            map.put(3, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            map.put(4, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            map.put(5, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            map.put(10, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            map.put(9, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            map.put(7, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]));
            return map;
        }
    }

    private ExperimentalBandwidthMeter(Context context, Map<Integer, Long> map, TimeToFirstByteEstimator timeToFirstByteEstimator, BandwidthEstimator bandwidthEstimator, boolean z) {
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.timeToFirstByteEstimator = timeToFirstByteEstimator;
        this.bandwidthEstimator = bandwidthEstimator;
        this.resetOnNetworkTypeChange = z;
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.initialBitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i) {
                this.f$0.onNetworkTypeChanged(i);
            }
        });
    }

    public void setNetworkTypeOverride(int i) {
        synchronized (this) {
            this.networkTypeOverride = i;
            this.networkTypeOverrideSet = true;
            onNetworkTypeChanged(i);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public long getBitrateEstimate() {
        long bandwidthEstimate;
        synchronized (this) {
            bandwidthEstimate = this.bandwidthEstimator.getBandwidthEstimate();
            if (bandwidthEstimate == Long.MIN_VALUE) {
                bandwidthEstimate = this.initialBitrateEstimate;
            }
        }
        return bandwidthEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public long getTimeToFirstByteEstimateUs() {
        long timeToFirstByteEstimateUs;
        synchronized (this) {
            timeToFirstByteEstimateUs = this.timeToFirstByteEstimator.getTimeToFirstByteEstimateUs();
        }
        return timeToFirstByteEstimateUs;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        synchronized (this) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(eventListener);
            this.bandwidthEstimator.addEventListener(handler, eventListener);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        synchronized (this) {
            this.bandwidthEstimator.removeEventListener(eventListener);
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                this.timeToFirstByteEstimator.onTransferInitializing(dataSpec);
                this.bandwidthEstimator.onTransferInitializing(dataSource);
            }
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                this.timeToFirstByteEstimator.onTransferStart(dataSpec);
                this.bandwidthEstimator.onTransferStart(dataSource);
            }
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                this.bandwidthEstimator.onBytesTransferred(dataSource, i);
            }
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
        synchronized (this) {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                this.bandwidthEstimator.onTransferEnd(dataSource);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNetworkTypeChanged(int i) {
        synchronized (this) {
            int i2 = this.networkType;
            if (i2 == 0 || this.resetOnNetworkTypeChange) {
                if (this.networkTypeOverrideSet) {
                    i = this.networkTypeOverride;
                }
                if (i2 == i) {
                    return;
                }
                this.networkType = i;
                if (i != 1 && i != 0 && i != 8) {
                    long initialBitrateEstimateForNetworkType = getInitialBitrateEstimateForNetworkType(i);
                    this.initialBitrateEstimate = initialBitrateEstimateForNetworkType;
                    this.bandwidthEstimator.onNetworkTypeChange(initialBitrateEstimateForNetworkType);
                    this.timeToFirstByteEstimator.reset();
                }
            }
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        Long l = this.initialBitrateEstimates.get(Integer.valueOf(i));
        if (l == null) {
            l = this.initialBitrateEstimates.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:979:0x0d33  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 13, list:
      (r0v0 int) from 0x000a: IF  (r0v0 int) != (2091 int)  -> B:4:0x000c A[HIDDEN]
      (r0v0 int) from 0x000e: IF  (r0v0 int) != (2092 int)  -> B:6:0x0010 A[HIDDEN]
      (r0v0 int) from 0x0012: IF  (r0v0 int) != (2102 int)  -> B:8:0x0014 A[HIDDEN]
      (r0v0 int) from 0x0016: IF  (r0v0 int) != (2103 int)  -> B:10:0x0018 A[HIDDEN]
      (r0v0 int) from 0x001a: IF  (r0v0 int) != (2111 int)  -> B:12:0x001c A[HIDDEN]
      (r0v0 int) from 0x001e: IF  (r0v0 int) != (2112 int)  -> B:14:0x0020 A[HIDDEN]
      (r0v0 int) from 0x0022: IF  (r0v0 int) != (2135 int)  -> B:16:0x0024 A[HIDDEN]
      (r0v0 int) from 0x0026: IF  (r0v0 int) != (2136 int)  -> B:18:0x0028 A[HIDDEN]
      (r0v0 int) from 0x002b: SWITCH (r0v0 int)
     case 2088: goto B:929:0x0c97
     case 2094: goto B:925:0x0c8a
     case 2105: goto B:921:0x0c7c
     case 2114: goto B:917:0x0c6e
     case 2115: goto B:913:0x0c60
     case 2116: goto B:909:0x0c52
     case 2117: goto B:905:0x0c44
     case 2118: goto B:901:0x0c36
     case 2119: goto B:897:0x0c28
     case 2120: goto B:893:0x0c1a
     case 2133: goto B:889:0x0c0c
     case 2142: goto B:885:0x0bfe
     case 2145: goto B:881:0x0bf0
     case 2152: goto B:877:0x0be2
     case 2153: goto B:873:0x0bd4
     case 2154: goto B:869:0x0bc6
     case 2155: goto B:865:0x0bb8
     case 2156: goto B:861:0x0baa
     case 2159: goto B:857:0x0b9c
     case 2162: goto B:853:0x0b8e
     case 2163: goto B:849:0x0b80
     case 2164: goto B:845:0x0b72
     case 2165: goto B:841:0x0b64
     case 2166: goto B:837:0x0b56
     case 2167: goto B:833:0x0b48
     case 2177: goto B:829:0x0b3a
     case 2182: goto B:825:0x0b2c
     case 2183: goto B:821:0x0b1e
     case 2185: goto B:817:0x0b10
     case 2187: goto B:813:0x0b02
     case 2198: goto B:809:0x0af4
     case 2206: goto B:805:0x0ae6
     case 2208: goto B:801:0x0ad8
     case 2210: goto B:797:0x0aca
     case 2221: goto B:793:0x0abc
     case 2222: goto B:789:0x0aae
     case 2223: goto B:785:0x0aa0
     case 2243: goto B:781:0x0a92
     case 2244: goto B:777:0x0a84
     case 2245: goto B:773:0x0a76
     case 2247: goto B:769:0x0a68
     case 2249: goto B:765:0x0a5a
     case 2252: goto B:761:0x0a4c
     case 2266: goto B:757:0x0a3e
     case 2267: goto B:753:0x0a30
     case 2269: goto B:749:0x0a22
     case 2270: goto B:745:0x0a14
     case 2271: goto B:741:0x0a06
     case 2272: goto B:737:0x09f8
     case 2273: goto B:733:0x09ea
     case 2274: goto B:729:0x09dc
     case 2277: goto B:725:0x09ce
     case 2278: goto B:721:0x09c0
     case 2279: goto B:717:0x09b2
     case 2281: goto B:713:0x09a4
     case 2282: goto B:709:0x0996
     case 2283: goto B:705:0x0988
     case 2285: goto B:701:0x097a
     case 2286: goto B:697:0x096c
     case 2288: goto B:693:0x095e
     case 2290: goto B:689:0x0950
     case 2307: goto B:685:0x0942
     case 2314: goto B:681:0x0934
     case 2316: goto B:677:0x0926
     case 2317: goto B:673:0x0918
     case 2331: goto B:669:0x090a
     case 2332: goto B:665:0x08fc
     case 2339: goto B:661:0x08ee
     case 2340: goto B:657:0x08e0
     case 2341: goto B:653:0x08d2
     case 2342: goto B:649:0x08c4
     case 2344: goto B:645:0x08b6
     case 2345: goto B:641:0x08a8
     case 2346: goto B:637:0x089a
     case 2347: goto B:633:0x088c
     case 2363: goto B:629:0x087e
     case 2371: goto B:625:0x0870
     case 2373: goto B:621:0x0862
     case 2374: goto B:617:0x0854
     case 2394: goto B:613:0x0846
     case 2396: goto B:609:0x0838
     case 2397: goto B:605:0x082a
     case 2398: goto B:601:0x081c
     case 2402: goto B:597:0x080e
     case 2403: goto B:593:0x0800
     case 2407: goto B:589:0x07f2
     case 2412: goto B:585:0x07e4
     case 2414: goto B:581:0x07d6
     case 2415: goto B:577:0x07c8
     case 2421: goto B:573:0x07ba
     case 2422: goto B:569:0x07ac
     case 2423: goto B:565:0x079e
     case 2429: goto B:561:0x0790
     case 2431: goto B:557:0x0782
     case 2438: goto B:553:0x0774
     case 2439: goto B:549:0x0766
     case 2440: goto B:545:0x0758
     case 2441: goto B:541:0x074a
     case 2442: goto B:537:0x073c
     case 2445: goto B:533:0x072e
     case 2452: goto B:529:0x0720
     case 2454: goto B:525:0x0712
     case 2455: goto B:521:0x0704
     case 2456: goto B:517:0x06f6
     case 2457: goto B:513:0x06e8
     case 2458: goto B:509:0x06da
     case 2459: goto B:505:0x06cc
     case 2462: goto B:501:0x06be
     case 2463: goto B:497:0x06b0
     case 2464: goto B:493:0x06a2
     case 2465: goto B:489:0x0694
     case 2466: goto B:485:0x0686
     case 2467: goto B:481:0x0678
     case 2468: goto B:477:0x066a
     case 2469: goto B:473:0x065c
     case 2470: goto B:469:0x064e
     case 2471: goto B:465:0x0640
     case 2472: goto B:461:0x0632
     case 2473: goto B:457:0x0624
     case 2474: goto B:453:0x0616
     case 2475: goto B:449:0x0608
     case 2476: goto B:445:0x05fa
     case 2477: goto B:441:0x05ec
     case 2483: goto B:437:0x05de
     case 2485: goto B:433:0x05d0
     case 2487: goto B:429:0x05c2
     case 2488: goto B:425:0x05b4
     case 2489: goto B:421:0x05a6
     case 2491: goto B:417:0x0598
     case 2494: goto B:413:0x058a
     case 2497: goto B:409:0x057c
     case 2498: goto B:405:0x056e
     case 2500: goto B:401:0x0560
     case 2503: goto B:397:0x0552
     case 2508: goto B:393:0x0544
     case 2526: goto B:389:0x0536
     case 2545: goto B:385:0x0528
     case 2549: goto B:381:0x051a
     case 2550: goto B:377:0x050c
     case 2551: goto B:373:0x04fe
     case 2552: goto B:369:0x04f0
     case 2555: goto B:365:0x04e2
     case 2556: goto B:361:0x04d4
     case 2557: goto B:357:0x04c6
     case 2562: goto B:353:0x04b8
     case 2563: goto B:349:0x04aa
     case 2564: goto B:345:0x049c
     case 2567: goto B:341:0x048e
     case 2569: goto B:337:0x0480
     case 2576: goto B:333:0x0472
     case 2611: goto B:329:0x0464
     case 2621: goto B:325:0x0456
     case 2625: goto B:321:0x0448
     case 2627: goto B:317:0x043a
     case 2629: goto B:313:0x042c
     case 2638: goto B:309:0x041e
     case 2639: goto B:305:0x0410
     case 2640: goto B:301:0x0402
     case 2641: goto B:297:0x03f4
     case 2642: goto B:293:0x03e6
     case 2644: goto B:289:0x03d8
     case 2645: goto B:285:0x03ca
     case 2646: goto B:281:0x03bc
     case 2647: goto B:277:0x03ae
     case 2648: goto B:273:0x03a0
     case 2649: goto B:269:0x0392
     case 2650: goto B:265:0x0384
     case 2651: goto B:261:0x0376
     case 2652: goto B:257:0x0368
     case 2655: goto B:253:0x035a
     case 2656: goto B:249:0x034c
     case 2657: goto B:245:0x033e
     case 2659: goto B:241:0x0330
     case 2661: goto B:237:0x0322
     case 2662: goto B:233:0x0314
     case 2663: goto B:229:0x0306
     case 2671: goto B:225:0x02f8
     case 2672: goto B:221:0x02ea
     case 2675: goto B:217:0x02dc
     case 2676: goto B:213:0x02ce
     case 2678: goto B:209:0x02c0
     case 2680: goto B:205:0x02b2
     case 2681: goto B:201:0x02a4
     case 2682: goto B:197:0x0296
     case 2683: goto B:193:0x0288
     case 2686: goto B:189:0x027a
     case 2688: goto B:185:0x026c
     case 2690: goto B:181:0x025e
     case 2691: goto B:177:0x0250
     case 2694: goto B:173:0x0242
     case 2700: goto B:169:0x0234
     case 2706: goto B:165:0x0226
     case 2718: goto B:161:0x0218
     case 2724: goto B:157:0x020a
     case 2725: goto B:153:0x01fc
     case 2731: goto B:149:0x01ee
     case 2733: goto B:145:0x01e0
     case 2735: goto B:141:0x01d2
     case 2737: goto B:137:0x01c4
     case 2739: goto B:133:0x01b6
     case 2744: goto B:129:0x01a8
     case 2751: goto B:125:0x019a
     case 2767: goto B:121:0x018c
     case 2780: goto B:117:0x017e
     case 2803: goto B:113:0x0170
     case 2828: goto B:109:0x0162
     case 2843: goto B:105:0x0154
     case 2855: goto B:101:0x0146
     case 2867: goto B:97:0x0138
     case 2877: goto B:93:0x012a
     default: goto B:20:0x002e A[RegionRef:SW:19]
      (r0v0 int) from 0x002e: SWITCH (r0v0 int)
     case 2096: goto B:89:0x011c
     case 2097: goto B:85:0x010e
     case 2098: goto B:81:0x0100
     case 2099: goto B:77:0x00f2
     case 2100: goto B:73:0x00e4
     default: goto B:21:0x0031 A[RegionRef:SW:20]
      (r0v0 int) from 0x0031: SWITCH (r0v0 int)
     case 2122: goto B:69:0x00d6
     case 2123: goto B:65:0x00c8
     case 2124: goto B:61:0x00ba
     case 2125: goto B:57:0x00ac
     default: goto B:22:0x0034 A[RegionRef:SW:21]
      (r0v0 int) from 0x0034: SWITCH (r0v0 int)
     case 2127: goto B:53:0x009e
     case 2128: goto B:49:0x0090
     case 2129: goto B:45:0x0082
     case 2130: goto B:41:0x0074
     default: goto B:23:0x0037 A[RegionRef:SW:22]
      (r0v0 int) from 0x0037: SWITCH (r0v0 int)
     case 2147: goto B:37:0x0066
     case 2148: goto B:33:0x0058
     case 2149: goto B:29:0x004a
     case 2150: goto B:25:0x003c
     default: goto B:979:0x0d33 A[RegionRef:SW:23]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] getInitialBitrateCountryGroupAssignment(String str) {
        byte b2;
        str.hashCode();
        if (iHashCode != 2091) {
            if (iHashCode != 2092) {
                if (iHashCode != 2102) {
                    if (iHashCode != 2103) {
                        if (iHashCode != 2111) {
                            if (iHashCode != 2112) {
                                if (iHashCode != 2135) {
                                    if (iHashCode != 2136) {
                                        switch (str) {
                                            case "AD":
                                                b2 = 0;
                                                break;
                                            case "AE":
                                                b2 = 1;
                                                break;
                                            case "AF":
                                                b2 = 2;
                                                break;
                                            case "AG":
                                                b2 = 3;
                                                break;
                                            default:
                                                switch (str) {
                                                    case 2088:
                                                        if (!str.equals("AI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 4;
                                                        }
                                                        break;
                                                    case 2094:
                                                        if (!str.equals("AO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 7;
                                                        }
                                                        break;
                                                    case 2105:
                                                        if (!str.equals("AZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 15;
                                                        }
                                                        break;
                                                    case 2114:
                                                        if (!str.equals("BD")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 18;
                                                        }
                                                        break;
                                                    case 2115:
                                                        if (!str.equals("BE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 19;
                                                        }
                                                        break;
                                                    case 2116:
                                                        if (!str.equals("BF")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = Ascii.DC4;
                                                        }
                                                        break;
                                                    case 2117:
                                                        if (!str.equals("BG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = Ascii.NAK;
                                                        }
                                                        break;
                                                    case 2118:
                                                        if (!str.equals("BH")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = Ascii.SYN;
                                                        }
                                                        break;
                                                    case 2119:
                                                        if (!str.equals("BI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = Ascii.ETB;
                                                        }
                                                        break;
                                                    case 2120:
                                                        if (!str.equals("BJ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = Ascii.CAN;
                                                        }
                                                        break;
                                                    case 2133:
                                                        if (!str.equals("BW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = PublicSuffixDatabase.i;
                                                        }
                                                        break;
                                                    case 2142:
                                                        if (!str.equals("CA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 36;
                                                        }
                                                        break;
                                                    case 2145:
                                                        if (!str.equals("CD")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 37;
                                                        }
                                                        break;
                                                    case 2152:
                                                        if (!str.equals("CK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 42;
                                                        }
                                                        break;
                                                    case 2153:
                                                        if (!str.equals("CL")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 43;
                                                        }
                                                        break;
                                                    case 2154:
                                                        if (!str.equals("CM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 44;
                                                        }
                                                        break;
                                                    case 2155:
                                                        if (!str.equals("CN")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 45;
                                                        }
                                                        break;
                                                    case 2156:
                                                        if (!str.equals("CO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 46;
                                                        }
                                                        break;
                                                    case 2159:
                                                        if (!str.equals("CR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 47;
                                                        }
                                                        break;
                                                    case 2162:
                                                        if (!str.equals("CU")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 48;
                                                        }
                                                        break;
                                                    case 2163:
                                                        if (!str.equals("CV")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 49;
                                                        }
                                                        break;
                                                    case 2164:
                                                        if (!str.equals("CW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 50;
                                                        }
                                                        break;
                                                    case 2165:
                                                        if (!str.equals("CX")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 51;
                                                        }
                                                        break;
                                                    case 2166:
                                                        if (!str.equals("CY")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 52;
                                                        }
                                                        break;
                                                    case 2167:
                                                        if (!str.equals("CZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 53;
                                                        }
                                                        break;
                                                    case 2177:
                                                        if (!str.equals("DE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 54;
                                                        }
                                                        break;
                                                    case 2182:
                                                        if (!str.equals("DJ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 55;
                                                        }
                                                        break;
                                                    case 2183:
                                                        if (!str.equals("DK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 56;
                                                        }
                                                        break;
                                                    case 2185:
                                                        if (!str.equals("DM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 57;
                                                        }
                                                        break;
                                                    case 2187:
                                                        if (!str.equals("DO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 58;
                                                        }
                                                        break;
                                                    case 2198:
                                                        if (!str.equals("DZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 59;
                                                        }
                                                        break;
                                                    case 2206:
                                                        if (!str.equals(JceNames.EC)) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 60;
                                                        }
                                                        break;
                                                    case 2208:
                                                        if (!str.equals("EE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 61;
                                                        }
                                                        break;
                                                    case 2210:
                                                        if (!str.equals("EG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 62;
                                                        }
                                                        break;
                                                    case 2221:
                                                        if (!str.equals("ER")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = Utf8.REPLACEMENT_BYTE;
                                                        }
                                                        break;
                                                    case 2222:
                                                        if (!str.equals("ES")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 64;
                                                        }
                                                        break;
                                                    case 2223:
                                                        if (!str.equals("ET")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 65;
                                                        }
                                                        break;
                                                    case 2243:
                                                        if (!str.equals("FI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 66;
                                                        }
                                                        break;
                                                    case 2244:
                                                        if (!str.equals("FJ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 67;
                                                        }
                                                        break;
                                                    case 2245:
                                                        if (!str.equals("FK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 68;
                                                        }
                                                        break;
                                                    case 2247:
                                                        if (!str.equals("FM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 69;
                                                        }
                                                        break;
                                                    case 2249:
                                                        if (!str.equals("FO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 70;
                                                        }
                                                        break;
                                                    case 2252:
                                                        if (!str.equals("FR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 71;
                                                        }
                                                        break;
                                                    case 2266:
                                                        if (!str.equals("GA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 72;
                                                        }
                                                        break;
                                                    case 2267:
                                                        if (!str.equals("GB")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 73;
                                                        }
                                                        break;
                                                    case 2269:
                                                        if (!str.equals("GD")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 74;
                                                        }
                                                        break;
                                                    case 2270:
                                                        if (!str.equals("GE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 75;
                                                        }
                                                        break;
                                                    case 2271:
                                                        if (!str.equals("GF")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 76;
                                                        }
                                                        break;
                                                    case 2272:
                                                        if (!str.equals("GG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 77;
                                                        }
                                                        break;
                                                    case 2273:
                                                        if (!str.equals("GH")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 78;
                                                        }
                                                        break;
                                                    case 2274:
                                                        if (!str.equals("GI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 79;
                                                        }
                                                        break;
                                                    case 2277:
                                                        if (!str.equals("GL")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 80;
                                                        }
                                                        break;
                                                    case 2278:
                                                        if (!str.equals("GM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 81;
                                                        }
                                                        break;
                                                    case 2279:
                                                        if (!str.equals("GN")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 82;
                                                        }
                                                        break;
                                                    case 2281:
                                                        if (!str.equals("GP")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 83;
                                                        }
                                                        break;
                                                    case 2282:
                                                        if (!str.equals("GQ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 84;
                                                        }
                                                        break;
                                                    case 2283:
                                                        if (!str.equals("GR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 85;
                                                        }
                                                        break;
                                                    case 2285:
                                                        if (!str.equals("GT")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 86;
                                                        }
                                                        break;
                                                    case 2286:
                                                        if (!str.equals("GU")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 87;
                                                        }
                                                        break;
                                                    case 2288:
                                                        if (!str.equals("GW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 88;
                                                        }
                                                        break;
                                                    case 2290:
                                                        if (!str.equals("GY")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 89;
                                                        }
                                                        break;
                                                    case 2307:
                                                        if (!str.equals("HK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 90;
                                                        }
                                                        break;
                                                    case 2314:
                                                        if (!str.equals(Sensor.NAME_HR)) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 91;
                                                        }
                                                        break;
                                                    case 2316:
                                                        if (!str.equals("HT")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 92;
                                                        }
                                                        break;
                                                    case 2317:
                                                        if (!str.equals("HU")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 93;
                                                        }
                                                        break;
                                                    case 2331:
                                                        if (!str.equals(OpAnalyticsConstants.OPERATION_ID)) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 94;
                                                        }
                                                        break;
                                                    case 2332:
                                                        if (!str.equals("IE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 95;
                                                        }
                                                        break;
                                                    case 2339:
                                                        if (!str.equals("IL")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 96;
                                                        }
                                                        break;
                                                    case 2340:
                                                        if (!str.equals("IM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 97;
                                                        }
                                                        break;
                                                    case 2341:
                                                        if (!str.equals(FaqConstants.OPEN_TYPE_IN)) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 98;
                                                        }
                                                        break;
                                                    case 2342:
                                                        if (!str.equals("IO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 99;
                                                        }
                                                        break;
                                                    case 2344:
                                                        if (!str.equals("IQ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 100;
                                                        }
                                                        break;
                                                    case 2345:
                                                        if (!str.equals("IR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 101;
                                                        }
                                                        break;
                                                    case 2346:
                                                        if (!str.equals("IS")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 102;
                                                        }
                                                        break;
                                                    case 2347:
                                                        if (!str.equals("IT")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 103;
                                                        }
                                                        break;
                                                    case 2363:
                                                        if (!str.equals("JE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 104;
                                                        }
                                                        break;
                                                    case 2371:
                                                        if (!str.equals("JM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 105;
                                                        }
                                                        break;
                                                    case 2373:
                                                        if (!str.equals("JO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 106;
                                                        }
                                                        break;
                                                    case 2374:
                                                        if (!str.equals("JP")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 107;
                                                        }
                                                        break;
                                                    case 2394:
                                                        if (!str.equals("KE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 108;
                                                        }
                                                        break;
                                                    case 2396:
                                                        if (!str.equals("KG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 109;
                                                        }
                                                        break;
                                                    case 2397:
                                                        if (!str.equals("KH")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 110;
                                                        }
                                                        break;
                                                    case 2398:
                                                        if (!str.equals("KI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 111;
                                                        }
                                                        break;
                                                    case 2402:
                                                        if (!str.equals("KM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 112;
                                                        }
                                                        break;
                                                    case 2403:
                                                        if (!str.equals("KN")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 113;
                                                        }
                                                        break;
                                                    case 2407:
                                                        if (!str.equals(LoginInit.KOREA)) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 114;
                                                        }
                                                        break;
                                                    case 2412:
                                                        if (!str.equals("KW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 115;
                                                        }
                                                        break;
                                                    case 2414:
                                                        if (!str.equals("KY")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 116;
                                                        }
                                                        break;
                                                    case 2415:
                                                        if (!str.equals("KZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 117;
                                                        }
                                                        break;
                                                    case 2421:
                                                        if (!str.equals("LA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 118;
                                                        }
                                                        break;
                                                    case 2422:
                                                        if (!str.equals("LB")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 119;
                                                        }
                                                        break;
                                                    case 2423:
                                                        if (!str.equals("LC")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 120;
                                                        }
                                                        break;
                                                    case 2429:
                                                        if (!str.equals("LI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 121;
                                                        }
                                                        break;
                                                    case 2431:
                                                        if (!str.equals("LK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 122;
                                                        }
                                                        break;
                                                    case 2438:
                                                        if (!str.equals("LR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 123;
                                                        }
                                                        break;
                                                    case 2439:
                                                        if (!str.equals("LS")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 124;
                                                        }
                                                        break;
                                                    case 2440:
                                                        if (!str.equals("LT")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 125;
                                                        }
                                                        break;
                                                    case 2441:
                                                        if (!str.equals("LU")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 126;
                                                        }
                                                        break;
                                                    case 2442:
                                                        if (!str.equals("LV")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = Ascii.DEL;
                                                        }
                                                        break;
                                                    case 2445:
                                                        if (!str.equals("LY")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 128;
                                                        }
                                                        break;
                                                    case 2452:
                                                        if (!str.equals("MA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 129;
                                                        }
                                                        break;
                                                    case 2454:
                                                        if (!str.equals("MC")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 130;
                                                        }
                                                        break;
                                                    case 2455:
                                                        if (!str.equals("MD")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 131;
                                                        }
                                                        break;
                                                    case 2456:
                                                        if (!str.equals("ME")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 132;
                                                        }
                                                        break;
                                                    case 2457:
                                                        if (!str.equals("MF")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 133;
                                                        }
                                                        break;
                                                    case 2458:
                                                        if (!str.equals("MG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 134;
                                                        }
                                                        break;
                                                    case 2459:
                                                        if (!str.equals("MH")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 135;
                                                        }
                                                        break;
                                                    case 2462:
                                                        if (!str.equals("MK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 136;
                                                        }
                                                        break;
                                                    case 2463:
                                                        if (!str.equals("ML")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 137;
                                                        }
                                                        break;
                                                    case 2464:
                                                        if (!str.equals("MM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 138;
                                                        }
                                                        break;
                                                    case 2465:
                                                        if (!str.equals("MN")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 139;
                                                        }
                                                        break;
                                                    case 2466:
                                                        if (!str.equals("MO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 140;
                                                        }
                                                        break;
                                                    case 2467:
                                                        if (!str.equals("MP")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 141;
                                                        }
                                                        break;
                                                    case 2468:
                                                        if (!str.equals("MQ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 142;
                                                        }
                                                        break;
                                                    case 2469:
                                                        if (!str.equals("MR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 143;
                                                        }
                                                        break;
                                                    case 2470:
                                                        if (!str.equals("MS")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 144;
                                                        }
                                                        break;
                                                    case 2471:
                                                        if (!str.equals("MT")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 145;
                                                        }
                                                        break;
                                                    case 2472:
                                                        if (!str.equals("MU")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 146;
                                                        }
                                                        break;
                                                    case 2473:
                                                        if (!str.equals("MV")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 147;
                                                        }
                                                        break;
                                                    case 2474:
                                                        if (!str.equals("MW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 148;
                                                        }
                                                        break;
                                                    case 2475:
                                                        if (!str.equals("MX")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 149;
                                                        }
                                                        break;
                                                    case 2476:
                                                        if (!str.equals("MY")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 150;
                                                        }
                                                        break;
                                                    case 2477:
                                                        if (!str.equals("MZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 151;
                                                        }
                                                        break;
                                                    case 2483:
                                                        if (!str.equals("NA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 152;
                                                        }
                                                        break;
                                                    case 2485:
                                                        if (!str.equals("NC")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 153;
                                                        }
                                                        break;
                                                    case 2487:
                                                        if (!str.equals("NE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 154;
                                                        }
                                                        break;
                                                    case 2488:
                                                        if (!str.equals("NF")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 155;
                                                        }
                                                        break;
                                                    case 2489:
                                                        if (!str.equals("NG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 156;
                                                        }
                                                        break;
                                                    case 2491:
                                                        if (!str.equals("NI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 157;
                                                        }
                                                        break;
                                                    case 2494:
                                                        if (!str.equals("NL")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 158;
                                                        }
                                                        break;
                                                    case 2497:
                                                        if (!str.equals("NO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 159;
                                                        }
                                                        break;
                                                    case 2498:
                                                        if (!str.equals("NP")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 160;
                                                        }
                                                        break;
                                                    case DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS /* 2500 */:
                                                        if (!str.equals("NR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 161;
                                                        }
                                                        break;
                                                    case 2503:
                                                        if (!str.equals("NU")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 162;
                                                        }
                                                        break;
                                                    case 2508:
                                                        if (!str.equals("NZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 163;
                                                        }
                                                        break;
                                                    case 2526:
                                                        if (!str.equals("OM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 164;
                                                        }
                                                        break;
                                                    case 2545:
                                                        if (!str.equals(TradeMode.PA)) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 165;
                                                        }
                                                        break;
                                                    case 2549:
                                                        if (!str.equals("PE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 166;
                                                        }
                                                        break;
                                                    case 2550:
                                                        if (!str.equals("PF")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 167;
                                                        }
                                                        break;
                                                    case 2551:
                                                        if (!str.equals("PG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 168;
                                                        }
                                                        break;
                                                    case 2552:
                                                        if (!str.equals("PH")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 169;
                                                        }
                                                        break;
                                                    case 2555:
                                                        if (!str.equals("PK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 170;
                                                        }
                                                        break;
                                                    case 2556:
                                                        if (!str.equals("PL")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 171;
                                                        }
                                                        break;
                                                    case 2557:
                                                        if (!str.equals("PM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 172;
                                                        }
                                                        break;
                                                    case 2562:
                                                        if (!str.equals("PR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 173;
                                                        }
                                                        break;
                                                    case 2563:
                                                        if (!str.equals("PS")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 174;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str.equals("PT")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 175;
                                                        }
                                                        break;
                                                    case 2567:
                                                        if (!str.equals("PW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 176;
                                                        }
                                                        break;
                                                    case 2569:
                                                        if (!str.equals("PY")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 177;
                                                        }
                                                        break;
                                                    case 2576:
                                                        if (!str.equals("QA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 178;
                                                        }
                                                        break;
                                                    case 2611:
                                                        if (!str.equals("RE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 179;
                                                        }
                                                        break;
                                                    case 2621:
                                                        if (!str.equals("RO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 180;
                                                        }
                                                        break;
                                                    case 2625:
                                                        if (!str.equals("RS")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 181;
                                                        }
                                                        break;
                                                    case 2627:
                                                        if (!str.equals("RU")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 182;
                                                        }
                                                        break;
                                                    case 2629:
                                                        if (!str.equals("RW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 183;
                                                        }
                                                        break;
                                                    case 2638:
                                                        if (!str.equals("SA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 184;
                                                        }
                                                        break;
                                                    case 2639:
                                                        if (!str.equals("SB")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 185;
                                                        }
                                                        break;
                                                    case 2640:
                                                        if (!str.equals("SC")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 186;
                                                        }
                                                        break;
                                                    case 2641:
                                                        if (!str.equals(HealthDataStatPolicy.SD)) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 187;
                                                        }
                                                        break;
                                                    case 2642:
                                                        if (!str.equals("SE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 188;
                                                        }
                                                        break;
                                                    case 2644:
                                                        if (!str.equals("SG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 189;
                                                        }
                                                        break;
                                                    case 2645:
                                                        if (!str.equals("SH")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 190;
                                                        }
                                                        break;
                                                    case 2646:
                                                        if (!str.equals("SI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 191;
                                                        }
                                                        break;
                                                    case 2647:
                                                        if (!str.equals("SJ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 192;
                                                        }
                                                        break;
                                                    case 2648:
                                                        if (!str.equals("SK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 193;
                                                        }
                                                        break;
                                                    case 2649:
                                                        if (!str.equals("SL")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 194;
                                                        }
                                                        break;
                                                    case 2650:
                                                        if (!str.equals("SM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 195;
                                                        }
                                                        break;
                                                    case 2651:
                                                        if (!str.equals("SN")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 196;
                                                        }
                                                        break;
                                                    case 2652:
                                                        if (!str.equals("SO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 197;
                                                        }
                                                        break;
                                                    case 2655:
                                                        if (!str.equals("SR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 198;
                                                        }
                                                        break;
                                                    case 2656:
                                                        if (!str.equals("SS")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 199;
                                                        }
                                                        break;
                                                    case 2657:
                                                        if (!str.equals("ST")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 200;
                                                        }
                                                        break;
                                                    case 2659:
                                                        if (!str.equals("SV")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 201;
                                                        }
                                                        break;
                                                    case 2661:
                                                        if (!str.equals("SX")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 202;
                                                        }
                                                        break;
                                                    case 2662:
                                                        if (!str.equals("SY")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 203;
                                                        }
                                                        break;
                                                    case 2663:
                                                        if (!str.equals("SZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 204;
                                                        }
                                                        break;
                                                    case 2671:
                                                        if (!str.equals("TC")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 205;
                                                        }
                                                        break;
                                                    case 2672:
                                                        if (!str.equals("TD")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 206;
                                                        }
                                                        break;
                                                    case 2675:
                                                        if (!str.equals("TG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 207;
                                                        }
                                                        break;
                                                    case 2676:
                                                        if (!str.equals("TH")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 208;
                                                        }
                                                        break;
                                                    case 2678:
                                                        if (!str.equals("TJ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 209;
                                                        }
                                                        break;
                                                    case 2680:
                                                        if (!str.equals("TL")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 210;
                                                        }
                                                        break;
                                                    case 2681:
                                                        if (!str.equals("TM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 211;
                                                        }
                                                        break;
                                                    case 2682:
                                                        if (!str.equals("TN")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 212;
                                                        }
                                                        break;
                                                    case 2683:
                                                        if (!str.equals("TO")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 213;
                                                        }
                                                        break;
                                                    case 2686:
                                                        if (!str.equals("TR")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 214;
                                                        }
                                                        break;
                                                    case 2688:
                                                        if (!str.equals("TT")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 215;
                                                        }
                                                        break;
                                                    case 2690:
                                                        if (!str.equals("TV")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 216;
                                                        }
                                                        break;
                                                    case 2691:
                                                        if (!str.equals("TW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 217;
                                                        }
                                                        break;
                                                    case 2694:
                                                        if (!str.equals("TZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 218;
                                                        }
                                                        break;
                                                    case 2700:
                                                        if (!str.equals("UA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 219;
                                                        }
                                                        break;
                                                    case 2706:
                                                        if (!str.equals("UG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 220;
                                                        }
                                                        break;
                                                    case 2718:
                                                        if (!str.equals("US")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 221;
                                                        }
                                                        break;
                                                    case 2724:
                                                        if (!str.equals("UY")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 222;
                                                        }
                                                        break;
                                                    case 2725:
                                                        if (!str.equals("UZ")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 223;
                                                        }
                                                        break;
                                                    case 2731:
                                                        if (!str.equals("VA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 224;
                                                        }
                                                        break;
                                                    case 2733:
                                                        if (!str.equals("VC")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 225;
                                                        }
                                                        break;
                                                    case 2735:
                                                        if (!str.equals("VE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 226;
                                                        }
                                                        break;
                                                    case 2737:
                                                        if (!str.equals("VG")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 227;
                                                        }
                                                        break;
                                                    case 2739:
                                                        if (!str.equals("VI")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 228;
                                                        }
                                                        break;
                                                    case 2744:
                                                        if (!str.equals("VN")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 229;
                                                        }
                                                        break;
                                                    case 2751:
                                                        if (!str.equals("VU")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 230;
                                                        }
                                                        break;
                                                    case 2767:
                                                        if (!str.equals("WF")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 231;
                                                        }
                                                        break;
                                                    case 2780:
                                                        if (!str.equals("WS")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 232;
                                                        }
                                                        break;
                                                    case 2803:
                                                        if (!str.equals("XK")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 233;
                                                        }
                                                        break;
                                                    case 2828:
                                                        if (!str.equals("YE")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 234;
                                                        }
                                                        break;
                                                    case 2843:
                                                        if (!str.equals("YT")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 235;
                                                        }
                                                        break;
                                                    case 2855:
                                                        if (!str.equals("ZA")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 236;
                                                        }
                                                        break;
                                                    case 2867:
                                                        if (!str.equals("ZM")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 237;
                                                        }
                                                        break;
                                                    case 2877:
                                                        if (!str.equals("ZW")) {
                                                            b2 = -1;
                                                        } else {
                                                            b2 = 238;
                                                        }
                                                        break;
                                                    default:
                                                        switch (str) {
                                                            case 2096:
                                                                if (!str.equals("AQ")) {
                                                                    b2 = -1;
                                                                } else {
                                                                    b2 = 8;
                                                                }
                                                                break;
                                                            case 2097:
                                                                if (!str.equals("AR")) {
                                                                    b2 = -1;
                                                                } else {
                                                                    b2 = 9;
                                                                }
                                                                break;
                                                            case 2098:
                                                                if (!str.equals("AS")) {
                                                                    b2 = -1;
                                                                } else {
                                                                    b2 = 10;
                                                                }
                                                                break;
                                                            case ShareConfig.MSG_SHARE_FAIL_TOAST /* 2099 */:
                                                                if (!str.equals("AT")) {
                                                                    b2 = -1;
                                                                } else {
                                                                    b2 = 11;
                                                                }
                                                                break;
                                                            case 2100:
                                                                if (!str.equals("AU")) {
                                                                    b2 = -1;
                                                                } else {
                                                                    b2 = 12;
                                                                }
                                                                break;
                                                            default:
                                                                switch (str) {
                                                                    case 2122:
                                                                        if (!str.equals("BL")) {
                                                                            b2 = -1;
                                                                        } else {
                                                                            b2 = Ascii.EM;
                                                                        }
                                                                        break;
                                                                    case 2123:
                                                                        if (!str.equals("BM")) {
                                                                            b2 = -1;
                                                                        } else {
                                                                            b2 = Ascii.SUB;
                                                                        }
                                                                        break;
                                                                    case 2124:
                                                                        if (!str.equals("BN")) {
                                                                            b2 = -1;
                                                                        } else {
                                                                            b2 = Ascii.ESC;
                                                                        }
                                                                        break;
                                                                    case 2125:
                                                                        if (!str.equals("BO")) {
                                                                            b2 = -1;
                                                                        } else {
                                                                            b2 = Ascii.FS;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (str) {
                                                                            case 2127:
                                                                                if (!str.equals("BQ")) {
                                                                                    b2 = -1;
                                                                                } else {
                                                                                    b2 = Ascii.GS;
                                                                                }
                                                                                break;
                                                                            case 2128:
                                                                                if (!str.equals("BR")) {
                                                                                    b2 = -1;
                                                                                } else {
                                                                                    b2 = Ascii.RS;
                                                                                }
                                                                                break;
                                                                            case 2129:
                                                                                if (!str.equals("BS")) {
                                                                                    b2 = -1;
                                                                                } else {
                                                                                    b2 = Ascii.US;
                                                                                }
                                                                                break;
                                                                            case 2130:
                                                                                if (!str.equals("BT")) {
                                                                                    b2 = -1;
                                                                                } else {
                                                                                    b2 = 32;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (str) {
                                                                                    case 2147:
                                                                                        if (!str.equals("CF")) {
                                                                                            b2 = -1;
                                                                                        } else {
                                                                                            b2 = 38;
                                                                                        }
                                                                                        break;
                                                                                    case 2148:
                                                                                        if (!str.equals("CG")) {
                                                                                            b2 = -1;
                                                                                        } else {
                                                                                            b2 = 39;
                                                                                        }
                                                                                        break;
                                                                                    case 2149:
                                                                                        if (!str.equals("CH")) {
                                                                                            b2 = -1;
                                                                                        } else {
                                                                                            b2 = 40;
                                                                                        }
                                                                                        break;
                                                                                    case 2150:
                                                                                        if (!str.equals("CI")) {
                                                                                            b2 = -1;
                                                                                        } else {
                                                                                            b2 = 41;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        b2 = -1;
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                        }
                                    } else if (str.equals("BZ")) {
                                        b2 = 35;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (str.equals("BY")) {
                                    b2 = 34;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str.equals("BB")) {
                                b2 = 17;
                            } else {
                                b2 = -1;
                            }
                        } else if (str.equals("BA")) {
                            b2 = 16;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("AX")) {
                        b2 = 14;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("AW")) {
                    b2 = 13;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("AM")) {
                b2 = 6;
            } else {
                b2 = -1;
            }
        } else if (str.equals("AL")) {
            b2 = 5;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 4:
            case 17:
            case 29:
            case 50:
            case 57:
            case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case 41:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_UNLOCK_CODE /* 165 */:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 8:
            case 63:
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY /* 162 */:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 2, 2, 1, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case 61:
            case 93:
            case 102:
            case 127:
            case 145:
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 3, 1, 1, 3, 0};
            case 13:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case 51:
            case 121:
            case 144:
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
            case 195:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 55:
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 106:
            case a.M /* 214 */:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 84:
            case GolfCourseInfo.DATA_LENGTH /* 92 */:
            case 154:
            case 226:
            case FitnessSleepType.HW_FITNESS_WAKE /* 234 */:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case 141:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 32:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 33:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 34:
                return new int[]{1, 2, 3, 3, 2, 2};
            case 35:
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 36:
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case 37:
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 38:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 39:
            case 62:
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 40:
                return new int[]{0, 1, 0, 0, 0, 2};
            case 43:
            case a.z /* 208 */:
                return new int[]{0, 1, 2, 2, 2, 2};
            case 44:
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 45:
                return new int[]{2, 0, 1, 1, 3, 1};
            case 46:
                return new int[]{2, 3, 3, 2, 2, 2};
            case 47:
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 48:
            case 111:
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY /* 161 */:
            case a.C /* 210 */:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 49:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 52:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 53:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 54:
                return new int[]{0, 1, 4, 2, 2, 1};
            case 56:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 59:
            case a.A /* 209 */:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 60:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
                return new int[]{0, 0, 0, 0, 1, 0};
            case 65:
                return new int[]{4, 3, 4, 4, 4, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 68:
            case 155:
            case PsExtractor.AUDIO_STREAM /* 192 */:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{4, 2, 4, 0, 2, 2};
            case 70:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 71:
                return new int[]{1, 1, 1, 1, 0, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return new int[]{3, 4, 0, 0, 2, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return new int[]{1, 1, 3, 2, 2, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_POOL /* 74 */:
                return new int[]{2, 2, 0, 0, 2, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_TABLE_TENNIS /* 75 */:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 76:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 77:
                return new int[]{0, 2, 1, 1, 2, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_VOLLEYBALL /* 78 */:
                return new int[]{3, 3, 3, 2, 2, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_WALKING /* 79 */:
            case 97:
            case 104:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 80:
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING /* 81 */:
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                return new int[]{3, 4, 4, 2, 2, 2};
            case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                return new int[]{2, 1, 1, 3, 2, 2};
            case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                return new int[]{1, 0, 0, 0, 1, 2};
            case RequestCode.SCANNER_PERMISSION_REQUEST_CODE /* 86 */:
                return new int[]{2, 1, 2, 1, 2, 2};
            case 87:
                return new int[]{2, 2, 4, 3, 3, 2};
            case 88:
                return new int[]{4, 4, 1, 2, 2, 2};
            case 89:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 0, 1, 1, 0};
            case 91:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 94:
                return new int[]{3, 1, 3, 3, 2, 4};
            case 95:
                return new int[]{1, 1, 1, 1, 1, 2};
            case 96:
                return new int[]{1, 2, 2, 3, 4, 2};
            case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                return new int[]{1, 1, 3, 2, 2, 3};
            case 99:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 100:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 101:
                return new int[]{4, 2, 3, 3, 4, 3};
            case 103:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 105:
                return new int[]{2, 4, 3, 1, 2, 2};
            case 107:
                return new int[]{0, 3, 2, 3, 4, 2};
            case 108:
                return new int[]{3, 2, 1, 1, 1, 2};
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 110:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 112:
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 114:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 3, 2};
            case AgrConstant.HEALTH_AGREEMENT_CODE /* 118 */:
                return new int[]{1, 2, 1, 3, 2, 2};
            case Constants.MAX_PRO_BOTTOM_MARGIN_PAD /* 119 */:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 120:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 122:
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case 124:
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 125:
                return new int[]{0, 1, 0, 1, 0, 2};
            case 126:
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case UserInfomation.WEIGHT_DEFAULT_ENGLISH /* 132 */:
                return new int[]{2, 0, 0, 1, 3, 2};
            case OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL /* 133 */:
                return new int[]{1, 2, 2, 3, 2, 2};
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
            case a.D /* 211 */:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case HiHealthError.ERR_WRONG_DEVICE /* 151 */:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_STEP_COUNT /* 163 */:
                return new int[]{0, 0, 1, 2, 4, 2};
            case MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA /* 164 */:
                return new int[]{2, 3, 1, 2, 4, 2};
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE /* 166 */:
                return new int[]{1, 2, 4, 4, 3, 2};
            case MachineControlPointResponse.OP_CODE_EXTENSION_SET_TARGETED_EXPENDED_ENERGY /* 167 */:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case a.w /* 207 */:
                return new int[]{3, 4, 1, 0, 2, 2};
            case a.K /* 212 */:
                return new int[]{3, 1, 1, 1, 2, 2};
            case a.L /* 213 */:
                return new int[]{3, 2, 4, 3, 2, 2};
            case a.N /* 215 */:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case HeartRateThresholdConfig.HEART_RATE_LIMIT /* 220 */:
                return new int[]{3, 3, 2, 3, 4, 2};
            case FitnessSportType.HW_FITNESS_SPORT_ALL /* 221 */:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case FitnessSleepType.HW_FITNESS_DREAM /* 236 */:
                return new int[]{2, 4, 2, 1, 1, 2};
            case FitnessSleepType.HW_FITNESS_NOON /* 237 */:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }
}
