package com.huami.moving.ui.sport.detail.segment;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hmchartui.utils.Constant;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.R;
import com.huami.moving.model.StrengthTrainingAction;
import com.huami.moving.ui.sport.detail.segment.dialog.HMWeightUtils;
import com.huami.moving.ui.utils.ConvertSportTypeKt;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.utils.StrenthTrainingUtils;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.c;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportSegmentViewManager;", "", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportSegmentViewManager {
    private static final int a = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 5;
    private static final int f = 9;
    private static final int g = 10;
    private static final int h = 12;
    private static final int i = 13;
    private static final int j = 14;
    private static final int k = 18;
    private static final int l = 19;
    private static final int m = 20;
    private static final int n = 21;
    private static final int o = 22;
    private static final int p = 23;
    private static final int q = 24;
    private static final int r = 25;
    private static final int s = 26;
    private static final int t = 27;
    private static final int u = 28;
    private static final int v = 90;
    private static final int w = 91;
    private static final int x = 94;
    private static final int y = 95;
    private static final int z = 96;
    private static final int A = 98;
    private static final int B = 99;
    private static final int C = 100;
    private static final int D = 101;
    private static final int E = 102;
    private static final int F = 103;
    private static final int G = 104;
    private static final int H = 105;
    private static final int I = 106;
    private static final int J = 107;
    private static final int K = 108;
    private static final int L = 109;

    @NotNull
    private static final Lazy<String> M = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\bW\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JO\u0010'\u001a\n &*\u0004\u0018\u00010%0%2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002J\u0016\u0010*\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002J?\u0010,\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020 2\u0006\u0010+\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J-\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u00100J\u0018\u00103\u001a\u0004\u0018\u0001022\u0006\u0010#\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002R\u001d\u00108\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u001c\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u001c\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R\u001c\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bD\u0010<R\u001c\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u001c\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<R\u001c\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010<R\u001c\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010<R\u001c\u0010M\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<R\u001c\u0010O\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bP\u0010<R\u001c\u0010Q\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bQ\u0010:\u001a\u0004\bR\u0010<R\u001c\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<R\u001c\u0010U\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bU\u0010:\u001a\u0004\bV\u0010<R\u001c\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bW\u0010:\u001a\u0004\bX\u0010<R\u001c\u0010Y\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010<R\u001c\u0010[\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b[\u0010:\u001a\u0004\b\\\u0010<R\u001c\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<R\u001c\u0010_\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b_\u0010:\u001a\u0004\b`\u0010<R\u001c\u0010a\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010:\u001a\u0004\bb\u0010<R\u001c\u0010c\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bc\u0010:\u001a\u0004\bd\u0010<R\u001c\u0010e\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\be\u0010:\u001a\u0004\bf\u0010<R\u001c\u0010g\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bg\u0010:\u001a\u0004\bh\u0010<R\u001c\u0010i\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bi\u0010:\u001a\u0004\bj\u0010<R\u001c\u0010k\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bk\u0010:\u001a\u0004\bl\u0010<R\u001c\u0010m\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bm\u0010:\u001a\u0004\bn\u0010<R\u001c\u0010o\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bo\u0010:\u001a\u0004\bp\u0010<R\u001c\u0010q\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bq\u0010:\u001a\u0004\br\u0010<R\u001c\u0010s\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bs\u0010:\u001a\u0004\bt\u0010<R\u001c\u0010u\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bu\u0010:\u001a\u0004\bv\u0010<R\u001c\u0010w\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bw\u0010:\u001a\u0004\bx\u0010<R\u001c\u0010y\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\by\u0010:\u001a\u0004\bz\u0010<R\u001c\u0010{\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b{\u0010:\u001a\u0004\b|\u0010<R\u001c\u0010}\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b}\u0010:\u001a\u0004\b~\u0010<R\u001d\u0010\u007f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\r\n\u0004\b\u007f\u0010:\u001a\u0005\b\u0080\u0001\u0010<R\u001f\u0010\u0081\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010:\u001a\u0005\b\u0082\u0001\u0010<R\u001f\u0010\u0083\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010:\u001a\u0005\b\u0084\u0001\u0010<R\u001f\u0010\u0085\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010:\u001a\u0005\b\u0086\u0001\u0010<¨\u0006\u0089\u0001"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportSegmentViewManager$Companion;", "", "", "segmentType", "", DTransferConstants.SEARCH_KEY, "l", "r", "o", "v", "f", "u", "m", "b", "g", hl.k, "h", "i", "deviceSource", "t", "c", GoogleApiAvailabilityLight.b, b.r, SOAP.XMLNS, "e", z.j, GoogleApiAvailabilityLight.a, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "data", "key", "", "isKM", "isYard", "sportType", "sportSource", "", "kotlin.jvm.PlatformType", "getSegmentInfoValue", "(Landroid/content/Context;Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;IZZILjava/lang/Integer;)Ljava/lang/String;", "getSegmentInfoSubValue", "getSegmentEditValue", "unit", "getSegmentInfoTitle", "(Landroid/content/Context;IZILjava/lang/Integer;I)Ljava/lang/String;", "sportTypeParams", "initSegmentTitleList", "(IILjava/lang/Integer;)Ljava/util/List;", "sportMode", "", "getSupportSegmentType", "defaultValue$delegate", "Lkotlin/Lazy;", "a", "()Ljava/lang/String;", "defaultValue", "KEY_INDEX", LogUtil.I, "getKEY_INDEX", "()I", "KEY_COST_TIME", "getKEY_COST_TIME", "KEY_DISTANCE", "getKEY_DISTANCE", "KEY_GEOHASH", "getKEY_GEOHASH", "KEY_OFFSET_TIME", "getKEY_OFFSET_TIME", "KEY_AVG_PACE", "getKEY_AVG_PACE", "KEY_MAX_SPEED", "getKEY_MAX_SPEED", "KEY_STROKE_SPEED", "getKEY_STROKE_SPEED", "KEY_STROKES", "getKEY_STROKES", "KEY_SWOLF", "getKEY_SWOLF", "KEY_TYPE", "getKEY_TYPE", "KEY_ROPE_SKIPPING", "getKEY_ROPE_SKIPPING", "KEY_CHILD_TYPE", "getKEY_CHILD_TYPE", "KEY_WEIGHT", "getKEY_WEIGHT", "KEY_COUNT", "getKEY_COUNT", "KEY_UNIT", "getKEY_UNIT", "KEY_FLOOR", "getKEY_FLOOR", "KEY_FLOOR_PER_MIN", "getKEY_FLOOR_PER_MIN", "KEY_SWIM_STYLE", "getKEY_SWIM_STYLE", "KEY_ACTION_TYPE", "getKEY_ACTION_TYPE", "KEY_COUNT_SWINGS", "getKEY_COUNT_SWINGS", "KEY_SWIMMING_AVG_PACE", "getKEY_SWIMMING_AVG_PACE", "KEY_MILEAGE", "getKEY_MILEAGE", "KEY_TIME_DIFFERENCE", "getKEY_TIME_DIFFERENCE", "KEY_AVG_SPEED", "getKEY_AVG_SPEED", "KEY_SWIMMING_DISTANCE", "getKEY_SWIMMING_DISTANCE", "KEY_SKIING_DOWNHILL_MILEAGE", "getKEY_SKIING_DOWNHILL_MILEAGE", "KEY_GROUP", "getKEY_GROUP", "KEY_ROPE_SKIPPING_COUNT_NUM", "getKEY_ROPE_SKIPPING_COUNT_NUM", "KEY_ROPE_SKIPPING_FREP", "getKEY_ROPE_SKIPPING_FREP", "KEY_GROUP_SWIPING_NUM", "getKEY_GROUP_SWIPING_NUM", "KEY_GROUP_COST_TIME", "getKEY_GROUP_COST_TIME", "KEY_GROUP_SWIPING_FRE", "getKEY_GROUP_SWIPING_FRE", "KEY_GROUP_AVG_HEART_RATE", "getKEY_GROUP_AVG_HEART_RATE", "KEY_GROUP_CAST", "getKEY_GROUP_CAST", Constant.KEY_TIME, "getKEY_TIME", "KEY_INTERVAL_MILEAGE", "getKEY_INTERVAL_MILEAGE", "KEY_INTERVAL_TIME", "getKEY_INTERVAL_TIME", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "defaultValue", "getDefaultValue()Ljava/lang/String;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a() {
            return (String) SportSegmentViewManager.M.getValue();
        }

        private final List<Integer> b(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_AVG_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> c(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_AVG_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> d(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_FLOOR()));
                arrayList.add(Integer.valueOf(getKEY_FLOOR_PER_MIN()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_CAST()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> e(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_AVG_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> f(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_AVG_PACE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> g(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_AVG_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> h(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_CAST()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> i(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_CAST()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> j(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_COUNT_SWINGS()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> k(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_CAST()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> l(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_GROUP()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_CAST()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_COST_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> m(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_AVG_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> n(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_SWIMMING_AVG_PACE()));
                arrayList.add(Integer.valueOf(getKEY_SWIMMING_DISTANCE()));
                arrayList.add(Integer.valueOf(getKEY_STROKES()));
                arrayList.add(Integer.valueOf(getKEY_SWOLF()));
                arrayList.add(Integer.valueOf(getKEY_STROKE_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
                arrayList.add(Integer.valueOf(getKEY_SWIM_STYLE()));
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0041  */
        /* JADX WARN: Code duplicated, block: B:15:0x004e  */
        private final List<Integer> o(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_AVG_PACE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            } else if (segmentType == 2) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_INTERVAL_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_AVG_PACE()));
                arrayList.add(Integer.valueOf(getKEY_INTERVAL_TIME()));
            } else if (segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_AVG_PACE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> p(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_SWIMMING_AVG_PACE()));
                arrayList.add(Integer.valueOf(getKEY_SWIMMING_DISTANCE()));
                arrayList.add(Integer.valueOf(getKEY_STROKES()));
                arrayList.add(Integer.valueOf(getKEY_SWOLF()));
                arrayList.add(Integer.valueOf(getKEY_STROKE_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
                arrayList.add(Integer.valueOf(getKEY_SWIM_STYLE()));
            }
            return arrayList;
        }

        private final List<Integer> q(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 4 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_GROUP()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_ROPE_SKIPPING_COUNT_NUM()));
                arrayList.add(Integer.valueOf(getKEY_ROPE_SKIPPING_FREP()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_CAST()));
                arrayList.add(Integer.valueOf(getKEY_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> r(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_GROUP()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_GROUP_SWIPING_NUM()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_SWIPING_FRE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_CAST()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_COST_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> s(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_MAX_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_SKIING_DOWNHILL_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> t(int segmentType, int deviceSource) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                if (SportDeviceUtils.isSupportStrengthTrainingCategory(deviceSource)) {
                    arrayList.add(Integer.valueOf(getKEY_COUNT()));
                    arrayList.add(Integer.valueOf(getKEY_WEIGHT()));
                }
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
            }
            return arrayList;
        }

        private final List<Integer> u(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5 || segmentType == 6) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                if (segmentType == 6) {
                    arrayList.add(Integer.valueOf(getKEY_ACTION_TYPE()));
                }
                arrayList.add(Integer.valueOf(getKEY_AVG_PACE()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        private final List<Integer> v(int segmentType) {
            ArrayList arrayList = new ArrayList();
            if (segmentType == 0 || segmentType == 1 || segmentType == 5) {
                arrayList.add(Integer.valueOf(getKEY_INDEX()));
                arrayList.add(Integer.valueOf(getKEY_AVG_SPEED()));
                arrayList.add(Integer.valueOf(getKEY_GROUP_AVG_HEART_RATE()));
                arrayList.add(Integer.valueOf(getKEY_MILEAGE()));
                arrayList.add(Integer.valueOf(getKEY_OFFSET_TIME()));
            }
            return arrayList;
        }

        public final int getKEY_ACTION_TYPE() {
            return SportSegmentViewManager.t;
        }

        public final int getKEY_AVG_PACE() {
            return SportSegmentViewManager.f;
        }

        public final int getKEY_AVG_SPEED() {
            return SportSegmentViewManager.y;
        }

        public final int getKEY_CHILD_TYPE() {
            return SportSegmentViewManager.m;
        }

        public final int getKEY_COST_TIME() {
            return SportSegmentViewManager.b;
        }

        public final int getKEY_COUNT() {
            return SportSegmentViewManager.o;
        }

        public final int getKEY_COUNT_SWINGS() {
            return SportSegmentViewManager.u;
        }

        public final int getKEY_DISTANCE() {
            return SportSegmentViewManager.c;
        }

        public final int getKEY_FLOOR() {
            return SportSegmentViewManager.q;
        }

        public final int getKEY_FLOOR_PER_MIN() {
            return SportSegmentViewManager.r;
        }

        public final int getKEY_GEOHASH() {
            return SportSegmentViewManager.d;
        }

        public final int getKEY_GROUP() {
            return SportSegmentViewManager.B;
        }

        public final int getKEY_GROUP_AVG_HEART_RATE() {
            return SportSegmentViewManager.H;
        }

        public final int getKEY_GROUP_CAST() {
            return SportSegmentViewManager.I;
        }

        public final int getKEY_GROUP_COST_TIME() {
            return SportSegmentViewManager.F;
        }

        public final int getKEY_GROUP_SWIPING_FRE() {
            return SportSegmentViewManager.G;
        }

        public final int getKEY_GROUP_SWIPING_NUM() {
            return SportSegmentViewManager.E;
        }

        public final int getKEY_INDEX() {
            return SportSegmentViewManager.a;
        }

        public final int getKEY_INTERVAL_MILEAGE() {
            return SportSegmentViewManager.K;
        }

        public final int getKEY_INTERVAL_TIME() {
            return SportSegmentViewManager.L;
        }

        public final int getKEY_MAX_SPEED() {
            return SportSegmentViewManager.g;
        }

        public final int getKEY_MILEAGE() {
            return SportSegmentViewManager.w;
        }

        public final int getKEY_OFFSET_TIME() {
            return SportSegmentViewManager.e;
        }

        public final int getKEY_ROPE_SKIPPING() {
            return SportSegmentViewManager.l;
        }

        public final int getKEY_ROPE_SKIPPING_COUNT_NUM() {
            return SportSegmentViewManager.C;
        }

        public final int getKEY_ROPE_SKIPPING_FREP() {
            return SportSegmentViewManager.D;
        }

        public final int getKEY_SKIING_DOWNHILL_MILEAGE() {
            return SportSegmentViewManager.A;
        }

        public final int getKEY_STROKES() {
            return SportSegmentViewManager.i;
        }

        public final int getKEY_STROKE_SPEED() {
            return SportSegmentViewManager.h;
        }

        public final int getKEY_SWIMMING_AVG_PACE() {
            return SportSegmentViewManager.v;
        }

        public final int getKEY_SWIMMING_DISTANCE() {
            return SportSegmentViewManager.z;
        }

        public final int getKEY_SWIM_STYLE() {
            return SportSegmentViewManager.s;
        }

        public final int getKEY_SWOLF() {
            return SportSegmentViewManager.j;
        }

        public final int getKEY_TIME() {
            return SportSegmentViewManager.J;
        }

        public final int getKEY_TIME_DIFFERENCE() {
            return SportSegmentViewManager.x;
        }

        public final int getKEY_TYPE() {
            return SportSegmentViewManager.k;
        }

        public final int getKEY_UNIT() {
            return SportSegmentViewManager.p;
        }

        public final int getKEY_WEIGHT() {
            return SportSegmentViewManager.n;
        }

        public final boolean getSegmentEditValue(int key, int sportType) {
            return key == getKEY_COUNT() || key == getKEY_WEIGHT();
        }

        @NotNull
        public final String getSegmentInfoSubValue(@NotNull Context context, @NotNull SportSegmentData data, int key) {
            return (key == getKEY_INDEX() && data.getType() == 2 && data.getChildType() == 1) ? context.getString(R.string.segemnt_interval_type_rest) : "";
        }

        @NotNull
        public final String getSegmentInfoTitle(@NotNull Context context, int key, boolean isYard, int unit, @Nullable Integer sportSource, int sportType) {
            if (key == getKEY_INDEX()) {
                if (ConvertSportTypeKt.convertSportType(sportType) == 52) {
                    if (SportDeviceUtils.isSupportSTUpgradeCategory(sportSource == null ? -1 : sportSource.intValue())) {
                        return context.getString(R.string.segment_title_exercise_name);
                    }
                }
                return context.getString(R.string.segment_number);
            }
            if (key == getKEY_GROUP()) {
                return context.getString(R.string.segment_number);
            }
            if (key == getKEY_AVG_PACE()) {
                return context.getString(R.string.segment_pace);
            }
            if (key == getKEY_SWIMMING_AVG_PACE()) {
                return isYard ? context.getString(R.string.segment_swimming_yard_pace_new) : context.getString(R.string.segment_swimming_pace_new);
            }
            if (key == getKEY_AVG_SPEED()) {
                return context.getString(R.string.segment_speed);
            }
            if (key == getKEY_GROUP_AVG_HEART_RATE()) {
                return context.getString(R.string.segment_heartrate);
            }
            if (key == getKEY_GROUP_CAST()) {
                return context.getString(R.string.segment_cast);
            }
            if (((key == getKEY_MILEAGE() || key == getKEY_DISTANCE()) || key == getKEY_INTERVAL_MILEAGE()) || key == getKEY_SWIMMING_DISTANCE()) {
                return context.getString(R.string.segment_distance);
            }
            if ((((key == getKEY_COST_TIME() || key == getKEY_GROUP_COST_TIME()) || key == getKEY_TIME()) || key == getKEY_OFFSET_TIME()) || key == getKEY_INTERVAL_TIME()) {
                return context.getString(R.string.segment_use_time);
            }
            if (key == getKEY_ROPE_SKIPPING_COUNT_NUM()) {
                return context.getString(R.string.rope_count);
            }
            if (key == getKEY_ROPE_SKIPPING_FREP()) {
                return context.getString(R.string.rope_frequency_title);
            }
            if (key == getKEY_GROUP_SWIPING_NUM()) {
                return context.getString(R.string.segment_swiping_num);
            }
            if (key == getKEY_GROUP_SWIPING_FRE()) {
                return context.getString(R.string.segment_swiping_fre);
            }
            if (key == getKEY_STROKES()) {
                return context.getString(R.string.segment_thrash);
            }
            if (key == getKEY_SWOLF()) {
                return context.getString(R.string.over_view_swolf);
            }
            if (key == getKEY_STROKE_SPEED()) {
                return context.getString(R.string.over_view_avg_stroke);
            }
            if (key == getKEY_MAX_SPEED()) {
                return context.getString(R.string.segment_max_speed);
            }
            if (key == getKEY_SKIING_DOWNHILL_MILEAGE()) {
                return context.getString(R.string.segment_downhill_distance);
            }
            if (key == getKEY_TIME_DIFFERENCE()) {
                return context.getString(R.string.segment_time_difference);
            }
            if (key == getKEY_WEIGHT()) {
                return context.getString(R.string.modify_weight_segment);
            }
            if (key == getKEY_COUNT()) {
                return context.getString(R.string.modify_count);
            }
            if (key == getKEY_FLOOR()) {
                return context.getString(R.string.upstairs_floor);
            }
            if (key == getKEY_FLOOR_PER_MIN()) {
                return context.getString(R.string.upstairs_frequency);
            }
            if (key == getKEY_SWIM_STYLE()) {
                return context.getString(R.string.sport_swim_style);
            }
            if (key == getKEY_ACTION_TYPE()) {
                return context.getString(R.string.segment_action_type);
            }
            return key == getKEY_COUNT_SWINGS() ? context.getString(R.string.segment_title_count_swings) : "";
        }

        public final String getSegmentInfoValue(@NotNull Context context, @NotNull SportSegmentData data, int key, boolean isKM, boolean isYard, int sportType, @Nullable Integer sportSource) {
            boolean z = true;
            if (key == getKEY_INDEX()) {
                if (ConvertSportTypeKt.convertSportType(sportType) != 52) {
                    return String.valueOf(data.getIndex());
                }
                if (!SportDeviceUtils.isSupportSTUpgradeCategory(sportSource == null ? -1 : sportSource.intValue())) {
                    return String.valueOf(data.getIndex());
                }
                List<StrengthTrainingAction> listFindStrenthTrainingByType = StrenthTrainingUtils.INSTANCE.findStrenthTrainingByType(context, Integer.valueOf(data.getStrengthTrainType()));
                if (listFindStrenthTrainingByType != null && !listFindStrenthTrainingByType.isEmpty()) {
                    z = false;
                }
                return z ? "--" : listFindStrenthTrainingByType.get(0).getActionName();
            }
            if (key == getKEY_COST_TIME() || key == getKEY_INTERVAL_TIME()) {
                return DataFormatter.getConsumeTime(data.getCostTime());
            }
            if (((key == getKEY_DISTANCE() || key == getKEY_SKIING_DOWNHILL_MILEAGE()) || key == getKEY_MILEAGE()) || key == getKEY_INTERVAL_MILEAGE()) {
                return DataFormatter.parseRawKilometerToFormatKilometer(RunDataConversion.convertMeterToKmOrMile(data.getDistance(), isKM));
            }
            if (key == getKEY_OFFSET_TIME()) {
                return DataFormatter.getConsumeTime(data.getCostTime());
            }
            if (key == getKEY_AVG_PACE()) {
                return DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(data.getAvgPace(), isKM));
            }
            if (key == getKEY_SWIMMING_AVG_PACE()) {
                return data.getAvgPace() > 0.0f ? DataFormatter.getFormatPaceAndUnit(data.getAvgPace(), sportType, isKM)[0] : a();
            }
            if (key == getKEY_STROKE_SPEED()) {
                return data.getStrokeSpeed() > 0 ? String.valueOf(data.getStrokeSpeed()) : a();
            }
            if (key == getKEY_STROKES()) {
                return data.getStrokes() > 0 ? String.valueOf(data.getStrokes()) : a();
            }
            if (key == getKEY_SWOLF()) {
                return data.getSwolf() > 0 ? String.valueOf(data.getSwolf()) : a();
            }
            if (key == getKEY_TIME_DIFFERENCE()) {
                int timeDifference = data.getTimeDifference();
                if (timeDifference == 0) {
                    return "";
                }
                if (timeDifference > 0) {
                    return "+" + DataFormatter.getConsumeTime(timeDifference);
                }
                return Constants.ACCEPT_TIME_SEPARATOR_SERVER + DataFormatter.getConsumeTime(-timeDifference);
            }
            if (key == getKEY_SWIMMING_DISTANCE()) {
                return DataFormatter.parseDis2MeterOrYardOrKmOrMile(data.getDistance(), isKM);
            }
            if (key == getKEY_AVG_SPEED()) {
                return RunDataConversion.paceConvertToSpeed(data.getAvgPace(), isKM);
            }
            if (key == getKEY_MAX_SPEED()) {
                return RunDataConversion.paceConvertToSpeed(data.getMaxPace(), isKM);
            }
            if (key == getKEY_TIME()) {
                return DataFormatter.getFormatDurationTime(data.getCostTime());
            }
            if (key == getKEY_GROUP()) {
                return String.valueOf(data.getIndex());
            }
            if (key == getKEY_ROPE_SKIPPING_COUNT_NUM()) {
                return String.valueOf(data.getRopeSkippingCount());
            }
            if (key == getKEY_ROPE_SKIPPING_FREP()) {
                return String.valueOf(Math.round(data.getRopeSkippingCount() / (data.getCostTime() / 60.0f)));
            }
            if (key == getKEY_GROUP_SWIPING_NUM()) {
                return data.getStrokes() > 0 ? String.valueOf(data.getStrokes()) : a();
            }
            if (key == getKEY_GROUP_COST_TIME()) {
                return DataFormatter.getConsumeTime(data.getCostTime());
            }
            if (key == getKEY_GROUP_SWIPING_FRE()) {
                return String.valueOf(data.getAvgStepFreq());
            }
            if (key == getKEY_GROUP_AVG_HEART_RATE()) {
                Integer numValueOf = Integer.valueOf(data.getAvgHR());
                if (!HeartRateConstant.isHRValueValid(numValueOf.intValue())) {
                    numValueOf = null;
                }
                String strValueOf = numValueOf == null ? null : String.valueOf(numValueOf.intValue());
                return strValueOf == null ? a() : strValueOf;
            }
            if (key == getKEY_GROUP_CAST()) {
                return String.valueOf(data.getCal());
            }
            if (key == getKEY_WEIGHT()) {
                return HMWeightUtils.INSTANCE.getWeightAndUnit(context, data.getWeight(), data.getUnit(), data.getStrengthTrainType());
            }
            if (key == getKEY_COUNT() || key == getKEY_COUNT_SWINGS()) {
                return String.valueOf(data.getCount());
            }
            if (key == getKEY_FLOOR()) {
                return String.valueOf(data.getFloor());
            }
            if (key == getKEY_FLOOR_PER_MIN()) {
                return String.valueOf(c.roundToInt(data.getFloorPerMin()));
            }
            if (key == getKEY_SWIM_STYLE()) {
                return HMWeightUtils.INSTANCE.getSwimStyleString(context, data.getSwimStyle());
            }
            return key == getKEY_ACTION_TYPE() ? HMWeightUtils.INSTANCE.getTrainTypeString(context, data.getTrainGroupType()) : "";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Nullable
        public final int[] getSupportSegmentType(int sportType, int sportMode) {
            if (SportTypeIdentifier.isSubSport(sportType)) {
                sportType -= 1000;
            }
            if (sportType != 62 && sportType != 63) {
                switch (sportType) {
                    case 6:
                    case 7:
                    case 9:
                        break;
                    case 8:
                        return sportMode == 0 ? new int[]{1, 3, 2, 0, -1} : new int[]{4, 0, -1};
                    default:
                        switch (sportType) {
                            case 11:
                            case 46:
                            case 105:
                                break;
                            case 13:
                            case 22:
                            case 40:
                            case 94:
                                break;
                            case 15:
                                return new int[]{3, 2, 0, -1};
                            case 18:
                            case 82:
                            case 90:
                                return new int[]{100, 101, 102};
                            default:
                                switch (sportType) {
                                    case 42:
                                    case 43:
                                        break;
                                    case 44:
                                        break;
                                    default:
                                        switch (sportType) {
                                            case 65:
                                            case 66:
                                            case 67:
                                            case 68:
                                            case 69:
                                                break;
                                            default:
                                                return null;
                                        }
                                        break;
                                }
                                break;
                        }
                        return new int[]{5, 3, 0, -1};
                }
            }
            return new int[]{1, 3, 2, 0, -1};
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0053  */
        /* JADX WARN: Code duplicated, block: B:25:0x005d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:30:0x0076  */
        /* JADX WARN: Code duplicated, block: B:33:0x0085  */
        /* JADX WARN: Code duplicated, block: B:34:0x008a  */
        @NotNull
        public final List<Integer> initSegmentTitleList(int sportTypeParams, int segmentType, @Nullable Integer deviceSource) {
            int iIntValue = deviceSource == null ? 0 : deviceSource.intValue();
            int iConvertSportType = ConvertSportTypeKt.convertSportType(sportTypeParams);
            if (iConvertSportType != 1) {
                switch (iConvertSportType) {
                    case 6:
                        return v(segmentType);
                    case 7:
                        return f(segmentType);
                    case 8:
                        return u(segmentType);
                    case 9:
                        return b(segmentType);
                    case 10:
                        return k(segmentType);
                    case 11:
                        return s(segmentType);
                    case 12:
                        return h(segmentType);
                    case 13:
                        return c(segmentType);
                    case 14:
                        return n(segmentType);
                    case 15:
                        return p(segmentType);
                    case 16:
                        return i(segmentType);
                    default:
                        switch (iConvertSportType) {
                            case 21:
                                return q(segmentType);
                            case 22:
                                return g(segmentType);
                            case 23:
                                return r(segmentType);
                            case 24:
                                return l(segmentType);
                            case 25:
                                return u(segmentType);
                            case 26:
                                return f(segmentType);
                            default:
                                switch (iConvertSportType) {
                                    case 40:
                                        return m(segmentType);
                                    case 41:
                                    case 45:
                                    case 53:
                                    case 55:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 64:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                        return i(segmentType);
                                    case 42:
                                    case 43:
                                        return s(segmentType);
                                    case 44:
                                    case 47:
                                    case 48:
                                    case 62:
                                    case 63:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                        return g(segmentType);
                                    case 46:
                                        return e(segmentType);
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 54:
                                    case 56:
                                    case 57:
                                    case 58:
                                        return h(segmentType);
                                    case 52:
                                        return t(segmentType, iIntValue);
                                    default:
                                        switch (iConvertSportType) {
                                            case 84:
                                                return j(segmentType);
                                            default:
                                                switch (iConvertSportType) {
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 109:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                        break;
                                                    case 94:
                                                    case 106:
                                                    case 107:
                                                        return g(segmentType);
                                                    case 105:
                                                        return s(segmentType);
                                                    case 108:
                                                        return d(segmentType);
                                                    case 110:
                                                        return f(segmentType);
                                                    default:
                                                        switch (iConvertSportType) {
                                                            case 122:
                                                            case 129:
                                                            case 130:
                                                                break;
                                                            case 123:
                                                            case 124:
                                                            case 132:
                                                                return g(segmentType);
                                                            case 125:
                                                            case 126:
                                                            case 127:
                                                            case 128:
                                                                return e(segmentType);
                                                            case 131:
                                                                return f(segmentType);
                                                            default:
                                                                switch (iConvertSportType) {
                                                                    case 136:
                                                                    case 137:
                                                                    case 138:
                                                                    case 139:
                                                                    case 140:
                                                                    case 141:
                                                                    case 142:
                                                                        return g(segmentType);
                                                                    case 143:
                                                                    case 144:
                                                                    case 145:
                                                                    case 146:
                                                                    case 147:
                                                                    case 148:
                                                                    case 149:
                                                                    case 150:
                                                                    case 151:
                                                                    case 152:
                                                                    case 153:
                                                                    case 154:
                                                                    case 155:
                                                                    case 156:
                                                                    case 157:
                                                                    case 158:
                                                                    case 159:
                                                                    case 160:
                                                                    case 161:
                                                                    case 162:
                                                                    case 163:
                                                                    case 164:
                                                                    case 165:
                                                                    case 166:
                                                                    case 167:
                                                                    case 168:
                                                                    case 169:
                                                                    case 170:
                                                                    case 171:
                                                                    case 172:
                                                                    case DataTypeSource.SPORT_TYPE_CHESS /* 173 */:
                                                                    case DataTypeSource.SPORT_TYPE_CHECKERS /* 174 */:
                                                                    case 175:
                                                                    case DataTypeSource.SPORT_TYPE_BRIDGE /* 176 */:
                                                                    case 177:
                                                                        break;
                                                                    default:
                                                                        switch (iConvertSportType) {
                                                                            case DataTypeSource.SPORT_TYPE_MODERN_DANCE /* 185 */:
                                                                            case DataTypeSource.SPORT_TYPE_DISCO /* 186 */:
                                                                            case DataTypeSource.SPORT_TYPE_TAP_DANCE /* 187 */:
                                                                            case 188:
                                                                            case 189:
                                                                            case DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER /* 191 */:
                                                                                break;
                                                                            case 190:
                                                                                return g(segmentType);
                                                                            case 192:
                                                                                break;
                                                                            default:
                                                                                return new ArrayList();
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            case 85:
                                            case 86:
                                            case 87:
                                            case 88:
                                            case 89:
                                                return i(segmentType);
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            return o(segmentType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "--";
        }
    }
}
