package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.device.authorization.RegionUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.SlidingPercentile;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import defpackage.zm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;
    private static final int t = 4;
    private static final int u = 5;

    @Nullable
    private static DefaultBandwidthMeter v = null;
    private static final int w = 2000;
    private static final int x = 524288;
    private final ImmutableMap<Integer, Long> a;
    private final BandwidthMeter.EventListener.EventDispatcher b;
    private final SlidingPercentile c;
    private final Clock d;
    private final boolean e;
    private int f;
    private long g;
    private long h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private int o;
    public static final ImmutableListMultimap<String, Integer> DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS = b();
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.of(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.of(248000L, 160000L, 142000L, 127000L, 113000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.of(2200000L, 1300000L, 950000L, 760000L, 520000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.of(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.of(10000000L, (long) Long.valueOf(GlobalDefine.INTERNAL_ALARM_FOR_WEAR_SERVICE), 5000000L, 2700000L, 1600000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.of(2600000L, 2200000L, 2000000L, 1500000L, 470000L);

    private static ImmutableListMultimap<String, Integer> b() {
        return ImmutableListMultimap.builder().putAll("AD", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).putAll("AE", (Object[]) new Integer[]{1, 4, 4, 4, 2, 2}).putAll("AF", (Object[]) new Integer[]{4, 4, 3, 4, 2, 2}).putAll("AG", (Object[]) new Integer[]{4, 2, 1, 4, 2, 2}).putAll("AI", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).putAll("AL", (Object[]) new Integer[]{1, 1, 1, 1, 2, 2}).putAll("AM", (Object[]) new Integer[]{2, 2, 1, 3, 2, 2}).putAll("AO", (Object[]) new Integer[]{3, 4, 3, 1, 2, 2}).putAll("AR", (Object[]) new Integer[]{2, 4, 2, 1, 2, 2}).putAll("AS", (Object[]) new Integer[]{2, 2, 3, 3, 2, 2}).putAll("AT", (Object[]) new Integer[]{0, 1, 0, 0, 0, 2}).putAll("AU", (Object[]) new Integer[]{0, 2, 0, 1, 1, 2}).putAll("AW", (Object[]) new Integer[]{1, 2, 0, 4, 2, 2}).putAll("AX", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).putAll("AZ", (Object[]) new Integer[]{3, 3, 3, 4, 4, 2}).putAll("BA", (Object[]) new Integer[]{1, 1, 0, 1, 2, 2}).putAll("BB", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).putAll("BD", (Object[]) new Integer[]{2, 0, 3, 3, 2, 2}).putAll("BE", (Object[]) new Integer[]{0, 0, 2, 3, 2, 2}).putAll("BF", (Object[]) new Integer[]{4, 4, 4, 2, 2, 2}).putAll("BG", (Object[]) new Integer[]{0, 1, 0, 0, 2, 2}).putAll("BH", (Object[]) new Integer[]{1, 0, 2, 4, 2, 2}).putAll("BI", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("BJ", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("BL", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).putAll("BM", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).putAll("BN", (Object[]) new Integer[]{3, 2, 1, 0, 2, 2}).putAll("BO", (Object[]) new Integer[]{1, 2, 4, 2, 2, 2}).putAll("BQ", (Object[]) new Integer[]{1, 2, 1, 2, 2, 2}).putAll(Country.BR, (Object[]) new Integer[]{2, 4, 3, 2, 2, 2}).putAll("BS", (Object[]) new Integer[]{2, 2, 1, 3, 2, 2}).putAll("BT", (Object[]) new Integer[]{3, 0, 3, 2, 2, 2}).putAll("BW", (Object[]) new Integer[]{3, 4, 1, 1, 2, 2}).putAll("BY", (Object[]) new Integer[]{1, 1, 1, 2, 2, 2}).putAll("BZ", (Object[]) new Integer[]{2, 2, 2, 2, 2, 2}).putAll("CA", (Object[]) new Integer[]{0, 3, 1, 2, 4, 2}).putAll("CD", (Object[]) new Integer[]{4, 2, 2, 1, 2, 2}).putAll(StatEvent.CF, (Object[]) new Integer[]{4, 2, 3, 2, 2, 2}).putAll("CG", (Object[]) new Integer[]{3, 4, 2, 2, 2, 2}).putAll("CH", (Object[]) new Integer[]{0, 0, 0, 0, 1, 2}).putAll("CI", (Object[]) new Integer[]{3, 3, 3, 3, 2, 2}).putAll("CK", (Object[]) new Integer[]{2, 2, 3, 0, 2, 2}).putAll("CL", (Object[]) new Integer[]{1, 1, 2, 2, 2, 2}).putAll("CM", (Object[]) new Integer[]{3, 4, 3, 2, 2, 2}).putAll("CN", (Object[]) new Integer[]{2, 2, 2, 1, 3, 2}).putAll("CO", (Object[]) new Integer[]{2, 3, 4, 2, 2, 2}).putAll("CR", (Object[]) new Integer[]{2, 3, 4, 4, 2, 2}).putAll("CU", (Object[]) new Integer[]{4, 4, 2, 2, 2, 2}).putAll("CV", (Object[]) new Integer[]{2, 3, 1, 0, 2, 2}).putAll("CW", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).putAll("CY", (Object[]) new Integer[]{1, 1, 0, 0, 2, 2}).putAll("CZ", (Object[]) new Integer[]{0, 1, 0, 0, 1, 2}).putAll("DE", (Object[]) new Integer[]{0, 0, 1, 1, 0, 2}).putAll("DJ", (Object[]) new Integer[]{4, 0, 4, 4, 2, 2}).putAll("DK", (Object[]) new Integer[]{0, 0, 1, 0, 0, 2}).putAll("DM", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).putAll("DO", (Object[]) new Integer[]{3, 4, 4, 4, 2, 2}).putAll("DZ", (Object[]) new Integer[]{3, 3, 4, 4, 2, 4}).putAll("EC", (Object[]) new Integer[]{2, 4, 3, 1, 2, 2}).putAll("EE", (Object[]) new Integer[]{0, 1, 0, 0, 2, 2}).putAll("EG", (Object[]) new Integer[]{3, 4, 3, 3, 2, 2}).putAll("EH", (Object[]) new Integer[]{2, 2, 2, 2, 2, 2}).putAll("ER", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).putAll("ES", (Object[]) new Integer[]{0, 1, 1, 1, 2, 2}).putAll("ET", (Object[]) new Integer[]{4, 4, 4, 1, 2, 2}).putAll("FI", (Object[]) new Integer[]{0, 0, 0, 0, 0, 2}).putAll("FJ", (Object[]) new Integer[]{3, 0, 2, 3, 2, 2}).putAll("FK", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).putAll("FM", (Object[]) new Integer[]{3, 2, 4, 4, 2, 2}).putAll("FO", (Object[]) new Integer[]{1, 2, 0, 1, 2, 2}).putAll("FR", (Object[]) new Integer[]{1, 1, 2, 0, 1, 2}).putAll("GA", (Object[]) new Integer[]{3, 4, 1, 1, 2, 2}).putAll(SelectAreaManager.GB, (Object[]) new Integer[]{0, 0, 1, 1, 1, 2}).putAll("GD", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).putAll("GE", (Object[]) new Integer[]{1, 1, 1, 2, 2, 2}).putAll("GF", (Object[]) new Integer[]{2, 2, 2, 3, 2, 2}).putAll("GG", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).putAll("GH", (Object[]) new Integer[]{3, 1, 3, 2, 2, 2}).putAll("GI", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).putAll("GL", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).putAll("GM", (Object[]) new Integer[]{4, 3, 2, 4, 2, 2}).putAll("GN", (Object[]) new Integer[]{4, 3, 4, 2, 2, 2}).putAll("GP", (Object[]) new Integer[]{2, 1, 2, 3, 2, 2}).putAll("GQ", (Object[]) new Integer[]{4, 2, 2, 4, 2, 2}).putAll("GR", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).putAll("GT", (Object[]) new Integer[]{3, 2, 3, 1, 2, 2}).putAll("GU", (Object[]) new Integer[]{1, 2, 3, 4, 2, 2}).putAll("GW", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("GY", (Object[]) new Integer[]{3, 3, 3, 4, 2, 2}).putAll("HK", (Object[]) new Integer[]{0, 1, 2, 3, 2, 0}).putAll("HN", (Object[]) new Integer[]{3, 1, 3, 3, 2, 2}).putAll("HR", (Object[]) new Integer[]{1, 1, 0, 0, 3, 2}).putAll("HT", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("HU", (Object[]) new Integer[]{0, 0, 0, 0, 0, 2}).putAll("ID", (Object[]) new Integer[]{3, 2, 3, 3, 2, 2}).putAll("IE", (Object[]) new Integer[]{0, 0, 1, 1, 3, 2}).putAll("IL", (Object[]) new Integer[]{1, 0, 2, 3, 4, 2}).putAll("IM", (Object[]) new Integer[]{0, 2, 0, 1, 2, 2}).putAll("IN", (Object[]) new Integer[]{2, 1, 3, 3, 2, 2}).putAll("IO", (Object[]) new Integer[]{4, 2, 2, 4, 2, 2}).putAll("IQ", (Object[]) new Integer[]{3, 3, 4, 4, 2, 2}).putAll("IR", (Object[]) new Integer[]{3, 2, 3, 2, 2, 2}).putAll("IS", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).putAll("IT", (Object[]) new Integer[]{0, 4, 0, 1, 2, 2}).putAll("JE", (Object[]) new Integer[]{2, 2, 1, 2, 2, 2}).putAll("JM", (Object[]) new Integer[]{3, 3, 4, 4, 2, 2}).putAll("JO", (Object[]) new Integer[]{2, 2, 1, 1, 2, 2}).putAll("JP", (Object[]) new Integer[]{0, 0, 0, 0, 2, 1}).putAll("KE", (Object[]) new Integer[]{3, 4, 2, 2, 2, 2}).putAll(ExpandedProductParsedResult.KILOGRAM, (Object[]) new Integer[]{2, 0, 1, 1, 2, 2}).putAll("KH", (Object[]) new Integer[]{1, 0, 4, 3, 2, 2}).putAll("KI", (Object[]) new Integer[]{4, 2, 4, 3, 2, 2}).putAll("KM", (Object[]) new Integer[]{4, 3, 2, 3, 2, 2}).putAll("KN", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).putAll("KP", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).putAll("KR", (Object[]) new Integer[]{0, 0, 1, 3, 1, 2}).putAll("KW", (Object[]) new Integer[]{1, 3, 1, 1, 1, 2}).putAll("KY", (Object[]) new Integer[]{1, 2, 0, 2, 2, 2}).putAll("KZ", (Object[]) new Integer[]{2, 2, 2, 3, 2, 2}).putAll("LA", (Object[]) new Integer[]{1, 2, 1, 1, 2, 2}).putAll(ExpandedProductParsedResult.POUND, (Object[]) new Integer[]{3, 2, 0, 0, 2, 2}).putAll("LC", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).putAll("LI", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).putAll("LK", (Object[]) new Integer[]{2, 0, 2, 3, 2, 2}).putAll("LR", (Object[]) new Integer[]{3, 4, 4, 3, 2, 2}).putAll("LS", (Object[]) new Integer[]{3, 3, 2, 3, 2, 2}).putAll("LT", (Object[]) new Integer[]{0, 0, 0, 0, 2, 2}).putAll("LU", (Object[]) new Integer[]{1, 0, 1, 1, 2, 2}).putAll("LV", (Object[]) new Integer[]{0, 0, 0, 0, 2, 2}).putAll("LY", (Object[]) new Integer[]{4, 2, 4, 3, 2, 2}).putAll("MA", (Object[]) new Integer[]{3, 2, 2, 1, 2, 2}).putAll("MC", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).putAll("MD", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).putAll("ME", (Object[]) new Integer[]{1, 2, 0, 1, 2, 2}).putAll("MF", (Object[]) new Integer[]{2, 2, 1, 1, 2, 2}).putAll("MG", (Object[]) new Integer[]{3, 4, 2, 2, 2, 2}).putAll("MH", (Object[]) new Integer[]{4, 2, 2, 4, 2, 2}).putAll("MK", (Object[]) new Integer[]{1, 1, 0, 0, 2, 2}).putAll("ML", (Object[]) new Integer[]{4, 4, 2, 2, 2, 2}).putAll("MM", (Object[]) new Integer[]{2, 3, 3, 3, 2, 2}).putAll("MN", (Object[]) new Integer[]{2, 4, 2, 2, 2, 2}).putAll("MO", (Object[]) new Integer[]{0, 2, 4, 4, 2, 2}).putAll("MP", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).putAll("MQ", (Object[]) new Integer[]{2, 2, 2, 3, 2, 2}).putAll("MR", (Object[]) new Integer[]{3, 0, 4, 3, 2, 2}).putAll("MS", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).putAll("MT", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).putAll("MU", (Object[]) new Integer[]{2, 1, 1, 2, 2, 2}).putAll("MV", (Object[]) new Integer[]{4, 3, 2, 4, 2, 2}).putAll("MW", (Object[]) new Integer[]{4, 2, 1, 0, 2, 2}).putAll(HTTP.MX, (Object[]) new Integer[]{2, 4, 4, 4, 4, 2}).putAll("MY", (Object[]) new Integer[]{1, 0, 3, 2, 2, 2}).putAll("MZ", (Object[]) new Integer[]{3, 3, 2, 1, 2, 2}).putAll(RegionUtil.REGION_STRING_NA, (Object[]) new Integer[]{4, 3, 3, 2, 2, 2}).putAll("NC", (Object[]) new Integer[]{3, 0, 4, 4, 2, 2}).putAll("NE", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("NF", (Object[]) new Integer[]{2, 2, 2, 2, 2, 2}).putAll("NG", (Object[]) new Integer[]{3, 3, 2, 3, 2, 2}).putAll("NI", (Object[]) new Integer[]{2, 1, 4, 4, 2, 2}).putAll("NL", (Object[]) new Integer[]{0, 2, 3, 2, 0, 2}).putAll("NO", (Object[]) new Integer[]{0, 1, 2, 0, 0, 2}).putAll("NP", (Object[]) new Integer[]{2, 0, 4, 2, 2, 2}).putAll("NR", (Object[]) new Integer[]{3, 2, 3, 1, 2, 2}).putAll("NU", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).putAll(ToolKey.ALARM, (Object[]) new Integer[]{0, 2, 1, 2, 4, 2}).putAll("OM", (Object[]) new Integer[]{2, 2, 1, 3, 3, 2}).putAll("PA", (Object[]) new Integer[]{1, 3, 3, 3, 2, 2}).putAll("PE", (Object[]) new Integer[]{2, 3, 4, 4, 2, 2}).putAll("PF", (Object[]) new Integer[]{2, 2, 2, 1, 2, 2}).putAll("PG", (Object[]) new Integer[]{4, 4, 3, 2, 2, 2}).putAll("PH", (Object[]) new Integer[]{2, 1, 3, 3, 3, 2}).putAll("PK", (Object[]) new Integer[]{3, 2, 3, 3, 2, 2}).putAll("PL", (Object[]) new Integer[]{1, 0, 1, 2, 3, 2}).putAll("PM", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).putAll("PR", (Object[]) new Integer[]{2, 1, 2, 2, 4, 3}).putAll("PS", (Object[]) new Integer[]{3, 3, 2, 2, 2, 2}).putAll("PT", (Object[]) new Integer[]{0, 1, 1, 0, 2, 2}).putAll("PW", (Object[]) new Integer[]{1, 2, 4, 1, 2, 2}).putAll("PY", (Object[]) new Integer[]{2, 0, 3, 2, 2, 2}).putAll("QA", (Object[]) new Integer[]{2, 3, 1, 2, 3, 2}).putAll("RE", (Object[]) new Integer[]{1, 0, 2, 2, 2, 2}).putAll("RO", (Object[]) new Integer[]{0, 1, 0, 1, 0, 2}).putAll("RS", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).putAll("RU", (Object[]) new Integer[]{0, 1, 0, 1, 4, 2}).putAll("RW", (Object[]) new Integer[]{3, 3, 3, 1, 2, 2}).putAll("SA", (Object[]) new Integer[]{2, 2, 2, 1, 1, 2}).putAll("SB", (Object[]) new Integer[]{4, 2, 3, 2, 2, 2}).putAll("SC", (Object[]) new Integer[]{4, 2, 1, 3, 2, 2}).putAll("SD", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("SE", (Object[]) new Integer[]{0, 0, 0, 0, 0, 2}).putAll("SG", (Object[]) new Integer[]{1, 0, 1, 2, 3, 2}).putAll("SH", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).putAll("SI", (Object[]) new Integer[]{0, 0, 0, 0, 2, 2}).putAll("SJ", (Object[]) new Integer[]{2, 2, 2, 2, 2, 2}).putAll("SK", (Object[]) new Integer[]{0, 1, 0, 0, 2, 2}).putAll("SL", (Object[]) new Integer[]{4, 3, 4, 0, 2, 2}).putAll("SM", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).putAll("SN", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("SO", (Object[]) new Integer[]{3, 3, 3, 4, 2, 2}).putAll("SR", (Object[]) new Integer[]{3, 2, 2, 2, 2, 2}).putAll("SS", (Object[]) new Integer[]{4, 4, 3, 3, 2, 2}).putAll(HTTP.ST, (Object[]) new Integer[]{2, 2, 1, 2, 2, 2}).putAll("SV", (Object[]) new Integer[]{2, 1, 4, 3, 2, 2}).putAll("SX", (Object[]) new Integer[]{2, 2, 1, 0, 2, 2}).putAll("SY", (Object[]) new Integer[]{4, 3, 3, 2, 2, 2}).putAll("SZ", (Object[]) new Integer[]{3, 3, 2, 4, 2, 2}).putAll("TC", (Object[]) new Integer[]{2, 2, 2, 0, 2, 2}).putAll("TD", (Object[]) new Integer[]{4, 3, 4, 4, 2, 2}).putAll("TG", (Object[]) new Integer[]{3, 2, 2, 4, 2, 2}).putAll("TH", (Object[]) new Integer[]{0, 3, 2, 3, 2, 2}).putAll("TJ", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("TL", (Object[]) new Integer[]{4, 0, 4, 4, 2, 2}).putAll("TM", (Object[]) new Integer[]{4, 2, 4, 3, 2, 2}).putAll("TN", (Object[]) new Integer[]{2, 1, 1, 2, 2, 2}).putAll("TO", (Object[]) new Integer[]{3, 3, 4, 3, 2, 2}).putAll("TR", (Object[]) new Integer[]{1, 2, 1, 1, 2, 2}).putAll("TT", (Object[]) new Integer[]{1, 4, 0, 1, 2, 2}).putAll(XiaomiOAuthConstants.EXTRA_DISPLAY_TV, (Object[]) new Integer[]{3, 2, 2, 4, 2, 2}).putAll("TW", (Object[]) new Integer[]{0, 0, 0, 0, 1, 0}).putAll("TZ", (Object[]) new Integer[]{3, 3, 3, 2, 2, 2}).putAll("UA", (Object[]) new Integer[]{0, 3, 1, 1, 2, 2}).putAll("UG", (Object[]) new Integer[]{3, 2, 3, 3, 2, 2}).putAll("US", (Object[]) new Integer[]{1, 1, 2, 2, 4, 2}).putAll("UY", (Object[]) new Integer[]{2, 2, 1, 1, 2, 2}).putAll("UZ", (Object[]) new Integer[]{2, 1, 3, 4, 2, 2}).putAll("VC", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).putAll("VE", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).putAll("VG", (Object[]) new Integer[]{2, 2, 1, 1, 2, 2}).putAll("VI", (Object[]) new Integer[]{1, 2, 1, 2, 2, 2}).putAll("VN", (Object[]) new Integer[]{0, 1, 3, 4, 2, 2}).putAll("VU", (Object[]) new Integer[]{4, 0, 3, 1, 2, 2}).putAll("WF", (Object[]) new Integer[]{4, 2, 2, 4, 2, 2}).putAll("WS", (Object[]) new Integer[]{3, 1, 3, 1, 2, 2}).putAll("XK", (Object[]) new Integer[]{0, 1, 1, 0, 2, 2}).putAll("YE", (Object[]) new Integer[]{4, 4, 4, 3, 2, 2}).putAll("YT", (Object[]) new Integer[]{4, 2, 2, 3, 2, 2}).putAll("ZA", (Object[]) new Integer[]{3, 3, 2, 1, 2, 2}).putAll("ZM", (Object[]) new Integer[]{3, 2, 3, 3, 2, 2}).putAll("ZW", (Object[]) new Integer[]{3, 2, 4, 3, 2, 2}).build();
    }

    private long c(int networkType) {
        Long l = this.a.get(Integer.valueOf(networkType));
        if (l == null) {
            l = this.a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean d(DataSpec dataSpec, boolean isNetwork) {
        return isNetwork && !dataSpec.isFlagSet(8);
    }

    private void e(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
        if (elapsedMs == 0 && bytesTransferred == 0 && bitrateEstimate == this.m) {
            return;
        }
        this.m = bitrateEstimate;
        this.b.bandwidthSample(elapsedMs, bytesTransferred, bitrateEstimate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f(int networkType) {
        int i = this.i;
        if (i == 0 || this.e) {
            if (this.n) {
                networkType = this.o;
            }
            if (i == networkType) {
                return;
            }
            this.i = networkType;
            if (networkType != 1 && networkType != 0 && networkType != 8) {
                this.l = c(networkType);
                long jElapsedRealtime = this.d.elapsedRealtime();
                e(this.f > 0 ? (int) (jElapsedRealtime - this.g) : 0, this.h, this.l);
                this.g = jElapsedRealtime;
                this.h = 0L;
                this.k = 0L;
                this.j = 0L;
                this.c.reset();
            }
        }
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        if (v == null) {
            v = new Builder(context).build();
        }
        return v;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void addEventListener(Handler eventHandler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(eventHandler);
        Assertions.checkNotNull(eventListener);
        this.b.addListener(eventHandler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.l;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return zm.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(DataSource source, DataSpec dataSpec, boolean isNetwork, int bytesTransferred) {
        if (d(dataSpec, isNetwork)) {
            this.h += (long) bytesTransferred;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(DataSource source, DataSpec dataSpec, boolean isNetwork) {
        if (d(dataSpec, isNetwork)) {
            Assertions.checkState(this.f > 0);
            long jElapsedRealtime = this.d.elapsedRealtime();
            int i = (int) (jElapsedRealtime - this.g);
            this.j += (long) i;
            long j = this.k;
            long j2 = this.h;
            this.k = j + j2;
            if (i > 0) {
                this.c.addSample((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                if (this.j >= 2000 || this.k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.l = (long) this.c.getPercentile(0.5f);
                }
                e(i, this.h, this.l);
                this.g = jElapsedRealtime;
                this.h = 0L;
            }
            this.f--;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public void onTransferInitializing(DataSource source, DataSpec dataSpec, boolean isNetwork) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(DataSource source, DataSpec dataSpec, boolean isNetwork) {
        if (d(dataSpec, isNetwork)) {
            if (this.f == 0) {
                this.g = this.d.elapsedRealtime();
            }
            this.f++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.b.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int networkType) {
        this.o = networkType;
        this.n = true;
        f(networkType);
    }

    public static final class Builder {

        @Nullable
        private final Context a;
        private Map<Integer, Long> b;
        private int c;
        private Clock d;
        private boolean e;

        public Builder(Context context) {
            this.a = context == null ? null : context.getApplicationContext();
            this.b = b(Util.getCountryCode(context));
            this.c = 2000;
            this.d = Clock.DEFAULT;
            this.e = true;
        }

        private static ImmutableList<Integer> a(String countryCode) {
            ImmutableList<Integer> immutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS.get(countryCode);
            return immutableList.isEmpty() ? ImmutableList.of(2, 2, 2, 2, 2, 2) : immutableList;
        }

        private static Map<Integer, Long> b(String countryCode) {
            ImmutableList<Integer> immutableListA = a(countryCode);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            map.put(2, immutableList.get(immutableListA.get(0).intValue()));
            map.put(3, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(immutableListA.get(1).intValue()));
            map.put(4, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(immutableListA.get(2).intValue()));
            map.put(5, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(immutableListA.get(3).intValue()));
            map.put(10, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(immutableListA.get(4).intValue()));
            map.put(9, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(immutableListA.get(5).intValue()));
            map.put(7, immutableList.get(immutableListA.get(0).intValue()));
            return map;
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.a, this.b, this.c, this.d, this.e);
        }

        public Builder setClock(Clock clock) {
            this.d = clock;
            return this;
        }

        public Builder setInitialBitrateEstimate(long initialBitrateEstimate) {
            Iterator<Integer> it2 = this.b.keySet().iterator();
            while (it2.hasNext()) {
                setInitialBitrateEstimate(it2.next().intValue(), initialBitrateEstimate);
            }
            return this;
        }

        public Builder setResetOnNetworkTypeChange(boolean resetOnNetworkTypeChange) {
            this.e = resetOnNetworkTypeChange;
            return this;
        }

        public Builder setSlidingWindowMaxWeight(int slidingWindowMaxWeight) {
            this.c = slidingWindowMaxWeight;
            return this;
        }

        public Builder setInitialBitrateEstimate(int networkType, long initialBitrateEstimate) {
            this.b.put(Integer.valueOf(networkType), Long.valueOf(initialBitrateEstimate));
            return this;
        }

        public Builder setInitialBitrateEstimate(String countryCode) {
            this.b = b(Ascii.toUpperCase(countryCode));
            return this;
        }
    }

    @Deprecated
    public DefaultBandwidthMeter() {
        this(null, ImmutableMap.of(), 2000, Clock.DEFAULT, false);
    }

    private DefaultBandwidthMeter(@Nullable Context context, Map<Integer, Long> initialBitrateEstimates, int maxWeight, Clock clock, boolean resetOnNetworkTypeChange) {
        this.a = ImmutableMap.copyOf((Map) initialBitrateEstimates);
        this.b = new BandwidthMeter.EventListener.EventDispatcher();
        this.c = new SlidingPercentile(maxWeight);
        this.d = clock;
        this.e = resetOnNetworkTypeChange;
        if (context != null) {
            NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
            int networkType = networkTypeObserver.getNetworkType();
            this.i = networkType;
            this.l = c(networkType);
            networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: g51
                @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
                public final void onNetworkTypeChanged(int i) {
                    this.a.f(i);
                }
            });
            return;
        }
        this.i = 0;
        this.l = c(0);
    }
}
