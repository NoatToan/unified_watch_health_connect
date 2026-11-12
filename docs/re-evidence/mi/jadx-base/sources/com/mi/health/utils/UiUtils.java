package com.mi.health.utils;

import android.R;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.google.gson.annotations.SerializedName;
import com.mi.health.router.business.IntentHelper;
import com.mi.health.sleep.widget.WidgetSleepChartAdapter;
import com.mi.health.sleep.widget.WidgetSleepChartRecyclerView;
import com.mi.health.sleep.widget.chart.SleepChartStage;
import com.mi.health.sleep.widget.chart.SleepChartView;
import com.miui.tsmclient.service.DKFRequestService;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.ai.domain.mobileapp.adapter.ContextAdapter;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValue;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.chart.render.SleepChartRender;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.cu3;
import defpackage.ezi;
import defpackage.gpc;
import defpackage.gv5;
import defpackage.hwq;
import defpackage.lyi;
import defpackage.npm;
import defpackage.onq;
import defpackage.pqi;
import defpackage.qim;
import defpackage.ryp;
import defpackage.u02;
import defpackage.w02;
import defpackage.y02;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006^_`abcB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\bJ<\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0016J\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0005J\u0094\u0001\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0002\u0010&\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\u00162\b\b\u0002\u0010(\u001a\u00020\u00162\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020%2\b\b\u0002\u0010+\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020\b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u00101J\u0018\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\u0016J\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002070$2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\bJ\u000e\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016J\u001e\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u00162\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160@H\u0002J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00160@2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0$H\u0002JP\u0010D\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002090$2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010H\u001a\u00020\u00162\b\b\u0002\u0010I\u001a\u00020\u00162\b\b\u0002\u0010J\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010KJ:\u0010L\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002090$2\u0006\u0010F\u001a\u00020G2\b\b\u0002\u0010M\u001a\u00020\u00162\b\b\u0002\u0010N\u001a\u00020\u0016J \u0010R\u001a\u00020S2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010$2\b\b\u0002\u0010U\u001a\u00020\bJ\u0016\u0010V\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0086@¢\u0006\u0002\u0010WJ9\u0010X\u001a\u00020Y2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010F\u001a\u00020G2\u0006\u0010Z\u001a\u00020\u00052\b\b\u0002\u0010[\u001a\u00020\u00052\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010]R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010O\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bP\u0010Q¨\u0006d"}, d2 = {"Lcom/mi/health/utils/UiUtils;", "", "<init>", "()V", "TAG", "", "BLUR_SUPPORT_KEY", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getBLUR_SUPPORT_KEY", "()Landroidx/datastore/preferences/core/Preferences$Key;", "cachedBlurSupport", "getCachedBlurSupport", "()Ljava/lang/Boolean;", "setCachedBlurSupport", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "shouldShowOs3Ui", "textNumberSizeChangeWithSpacing", "Landroid/text/SpannableString;", "valueText", "originTextSize", "", "numberSize", "otherSize", "numberReplaceStr", "spacingPx", "saveBitmapToFile", "Ljava/io/File;", "bitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "fileName", "createBarChartBitmap", "dataValues", "", "", "bitmapWidth", "bitmapHeight", "emptyBarColor", "dataBarColor", "radiusX", "radiusY", "chartBarWidthPercent", "useAbsoluteLeftRight", "ceilToNearest", "drawZeroAsCircle", "saveLocalLocation", "(Landroid/content/Context;Ljava/util/List;IIIIFFFZIZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTimeSegmentIndex", "timestamp", "", "totalSegments", "createDaySleepChartEntry", "Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;", "report", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "hrAndSpo2Data", "getSleepType", "sleepState", "getHeightIndexInList", "type", "list", "Ljava/util/LinkedList;", "getTypeList", "sleepStateItems", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "createSleepLineChartBitmap", "reports", "remoteViews", "Landroid/widget/RemoteViews;", "outWidthDp", "outHeightDp", "tickSeconds", "(Landroid/content/Context;Ljava/util/List;Landroid/widget/RemoteViews;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSleepChartBitmap", "chartWidth", "chartHeight", "TYPE_XAXIS_FIRST", "getTYPE_XAXIS_FIRST", "()I", "calculateLongSleepDuration", "Lcom/mi/health/utils/UiUtils$SleepDurationResult;", "sleepReports", "countNoItemsData", "ifSupportBlur", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateWidgetDefaultBackgroundIntent", "", "intentTarget", "parentTab", "appWidgetId", "(Landroid/content/Context;Landroid/widget/RemoteViews;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "CustomWidthSpan", "RoundedBarChartRenderer", "SleepItem", "SleepChartItemDecoration", "DaySleepHighLightFormatter", "SleepDurationResult", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 Color.kt\nandroidx/core/graphics/ColorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 8 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 9 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,1165:1\n1317#2,2:1166\n1317#2,2:1170\n1317#2,2:1176\n1863#3,2:1168\n1863#3,2:1172\n1863#3,2:1174\n774#3:1186\n865#3,2:1187\n774#3:1189\n865#3,2:1190\n1368#3:1192\n1454#3,5:1193\n1734#3,3:1198\n774#3:1201\n865#3,2:1202\n2341#3,14:1204\n1971#3,14:1218\n90#4,6:1178\n470#5:1184\n1#6:1185\n53#7:1232\n55#7:1236\n50#8:1233\n55#8:1235\n107#9:1234\n*S KotlinDebug\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils\n*L\n120#1:1166,2\n152#1:1170,2\n211#1:1176,2\n134#1:1168,2\n173#1:1172,2\n184#1:1174,2\n974#1:1186\n974#1:1187,2\n979#1:1189\n979#1:1190,2\n984#1:1192\n984#1:1193,5\n1001#1:1198,3\n1010#1:1201\n1010#1:1202,2\n1026#1:1204,14\n1027#1:1218,14\n410#1:1178,6\n295#1:1184\n1077#1:1232\n1077#1:1236\n1077#1:1233\n1077#1:1235\n1077#1:1234\n*E\n"})
public final class UiUtils {

    @NotNull
    public static final String TAG = "UiUtils";

    @Nullable
    private static Boolean cachedBlurSupport;

    @NotNull
    public static final UiUtils INSTANCE = new UiUtils();

    @NotNull
    private static final Preferences.Key<Boolean> BLUR_SUPPORT_KEY = PreferencesKeys.booleanKey("blur_support");
    private static final int TYPE_XAXIS_FIRST = 1;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016JP\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mi/health/utils/UiUtils$CustomWidthSpan;", "Landroid/text/style/ReplacementSpan;", "widthPx", "", "<init>", "(I)V", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", StatConstants.PARAM_START, StatConstants.PARAM_END, "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", "top", "y", "bottom", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils$CustomWidthSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1165:1\n1#2:1166\n*E\n"})
    public static final class CustomWidthSpan extends ReplacementSpan {
        private final int widthPx;

        public CustomWidthSpan(int i) {
            this.widthPx = i;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Paint paint2 = new Paint();
            paint2.setColor(286261248);
            canvas.drawRect(x, top, x + this.widthPx, bottom, paint2);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
            Intrinsics.checkNotNullParameter(paint, "paint");
            Intrinsics.checkNotNullParameter(text, "text");
            return this.widthPx;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/mi/health/utils/UiUtils$DaySleepHighLightFormatter;", "Lgv5;", "", "type", "", "getItemTpeStr", "(I)Ljava/lang/String;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "digits", "<init>", "(I)V", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DaySleepHighLightFormatter extends gv5 {
        public DaySleepHighLightFormatter(int i) {
            super(i);
        }

        private final String getItemTpeStr(int type) {
            if (type == 0) {
                String string = AppUtil.getApp().getString(ezi.l);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (type == 1) {
                String string2 = AppUtil.getApp().getString(ezi.i);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (type == 2) {
                String string3 = AppUtil.getApp().getString(ezi.f17225k);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            if (type != 3) {
                String string4 = AppUtil.getApp().getString(ezi.g);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            }
            String string5 = AppUtil.getApp().getString(ezi.h);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }

        @Override // defpackage.gv5, defpackage.onq
        @NotNull
        public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
            StringBuilder sb;
            Intrinsics.checkNotNullParameter(barEntry, "barEntry");
            npm npmVar = ((SleepItemEntry) barEntry).f11764a;
            String str = "";
            if (npmVar == null) {
                return "";
            }
            long j = 60;
            int iMax = Math.max(1, (int) ((npmVar.g / j) - (npmVar.f / j)));
            Application app = AppUtil.getApp();
            int i = iMax / 60;
            if (i > 0) {
                str = i + gv5.CONNECT_STR + ResourceExtKt.getQuantityString(AppUtil.getApp(), lyi.d, i, Integer.valueOf(i));
            }
            int i2 = iMax % 60;
            String str2 = i2 + gv5.CONNECT_STR + ResourceExtKt.getQuantityString(AppUtil.getApp(), lyi.e, i2, Integer.valueOf(i2));
            String itemTpeStr = getItemTpeStr(npmVar.c);
            String dateStr = TimeDateUtil.getDateStr(npmVar.f, TimeUtils.FORMAT_H_M);
            String dateStr2 = TimeDateUtil.getDateStr(npmVar.g, TimeUtils.FORMAT_H_M);
            String str3 = itemTpeStr + gv5.CONNECT_STR + str + gv5.CONNECT_STR + str2;
            if (npmVar.j != 0 && npmVar.i != 0) {
                String string = app.getString(ezi.f);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str4 = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(npmVar.j), Integer.valueOf(npmVar.i)}, 2));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                int i3 = lyi.common_unit_heart_rate;
                int i4 = npmVar.i;
                str3 = str3 + "，" + (string + gv5.CONNECT_STR + str4 + gv5.CONNECT_STR + ResourceExtKt.getQuantityString(app, i3, i4, Integer.valueOf(i4)));
            }
            if (npmVar.f28235k != 0 && npmVar.l != 0) {
                String string2 = app.getString(ezi.e);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                str3 = str3 + "，" + (app.getString(ezi.j) + gv5.CONNECT_STR + npmVar.l + gv5.CONNECT_STR + string2 + "&-" + npmVar.f28235k + gv5.CONNECT_STR + string2);
            }
            if (AppUtil.isRTLDirection()) {
                sb = new StringBuilder();
                sb.append(dateStr2);
                sb.append("-");
                sb.append(dateStr);
            } else {
                sb = new StringBuilder();
                sb.append(dateStr);
                sb.append("-");
                sb.append(dateStr2);
            }
            return str3 + gv5.CONNECT_VALUE_STR + sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b3\u00104J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00102¨\u00065"}, d2 = {"Lcom/mi/health/utils/UiUtils$SleepChartItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/widget/RemoteViews;", "remoteViews", "", "leftString", "rightString", "", "updateSleepWakeupTime", "(Landroid/widget/RemoteViews;Ljava/lang/String;Ljava/lang/String;)V", "", MediaStoreUtil.MediaInfo.SIZE, "updateStageSize", "(I)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "Lonq;", "highLightValueFormatter", "setHighLightValueFormatter", "(Lonq;)V", "", "", "list", "setSleepItemStatus", "(Ljava/util/List;)V", "", "value", "setItemHeightOffset", "(F)V", "Lqim;", "barChartAttrs", "Lqim;", "Landroid/widget/RemoteViews;", "getRemoteViews", "()Landroid/widget/RemoteViews;", "sleepLabelsExist", "Z", "getSleepLabelsExist", "()Z", "setSleepLabelsExist", "(Z)V", "Lcom/xiaomi/fitness/chart/render/SleepChartRender;", "sleepChartRender", "Lcom/xiaomi/fitness/chart/render/SleepChartRender;", "Lonq;", "<init>", "(Lqim;Landroid/widget/RemoteViews;)V", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils$SleepChartItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1165:1\n808#2,11:1166\n*S KotlinDebug\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils$SleepChartItemDecoration\n*L\n853#1:1166,11\n*E\n"})
    public static final class SleepChartItemDecoration extends RecyclerView.n {

        @NotNull
        private final qim barChartAttrs;

        @NotNull
        private onq highLightValueFormatter;

        @NotNull
        private final RemoteViews remoteViews;

        @NotNull
        private final SleepChartRender sleepChartRender;
        private boolean sleepLabelsExist;

        public SleepChartItemDecoration(@NotNull qim barChartAttrs, @NotNull RemoteViews remoteViews) {
            Intrinsics.checkNotNullParameter(barChartAttrs, "barChartAttrs");
            Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
            this.barChartAttrs = barChartAttrs;
            this.remoteViews = remoteViews;
            this.sleepChartRender = new SleepChartRender(barChartAttrs, new gv5(0));
            this.highLightValueFormatter = new gv5(0);
        }

        private final void updateSleepWakeupTime(RemoteViews remoteViews, String leftString, String rightString) {
            remoteViews.setTextViewText(pqi.z, leftString);
            remoteViews.setTextViewText(pqi.y, rightString);
        }

        @NotNull
        public final RemoteViews getRemoteViews() {
            return this.remoteViews;
        }

        public final boolean getSleepLabelsExist() {
            return this.sleepLabelsExist;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.onDrawOver(canvas, parent, state);
            this.sleepLabelsExist = false;
            List<Object> listDrawSleepChart = this.sleepChartRender.drawSleepChart(canvas, parent, false);
            if (!(listDrawSleepChart instanceof List)) {
                listDrawSleepChart = null;
            }
            if (listDrawSleepChart != null) {
                listEmptyList = new ArrayList();
                for (Object obj : listDrawSleepChart) {
                    if (obj instanceof String) {
                        listEmptyList.add(obj);
                    }
                }
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            if (listEmptyList.size() != 2 || ((CharSequence) listEmptyList.get(0)).length() <= 0 || ((CharSequence) listEmptyList.get(1)).length() <= 0) {
                return;
            }
            this.sleepLabelsExist = true;
            updateSleepWakeupTime(this.remoteViews, (String) listEmptyList.get(0), (String) listEmptyList.get(1));
        }

        public final void setHighLightValueFormatter(@NotNull onq highLightValueFormatter) {
            Intrinsics.checkNotNullParameter(highLightValueFormatter, "highLightValueFormatter");
            this.highLightValueFormatter = highLightValueFormatter;
            this.sleepChartRender.setHighLightValueFormatter(highLightValueFormatter);
        }

        public final void setItemHeightOffset(float value) {
            this.sleepChartRender.setItemHeightOffset(value);
        }

        public final void setSleepItemStatus(@NotNull List<Boolean> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.sleepChartRender.setSleepItemStatus(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
        }

        public final void setSleepLabelsExist(boolean z) {
            this.sleepLabelsExist = z;
        }

        public final void updateStageSize(int size) {
            this.sleepChartRender.updateStageSize(size);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/mi/health/utils/UiUtils$SleepDurationResult;", "", "startTime", "", "endTime", FitnessReportKey.totalDuration, "<init>", "(JJJ)V", "getStartTime", "()J", "getEndTime", "getTotalDuration", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepDurationResult {
        private final long endTime;
        private final long startTime;
        private final long totalDuration;

        public SleepDurationResult(long j, long j2, long j3) {
            this.startTime = j;
            this.endTime = j2;
            this.totalDuration = j3;
        }

        public static /* synthetic */ SleepDurationResult copy$default(SleepDurationResult sleepDurationResult, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sleepDurationResult.startTime;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = sleepDurationResult.endTime;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = sleepDurationResult.totalDuration;
            }
            return sleepDurationResult.copy(j4, j5, j3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTotalDuration() {
            return this.totalDuration;
        }

        @NotNull
        public final SleepDurationResult copy(long startTime, long endTime, long totalDuration) {
            return new SleepDurationResult(startTime, endTime, totalDuration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepDurationResult)) {
                return false;
            }
            SleepDurationResult sleepDurationResult = (SleepDurationResult) other;
            return this.startTime == sleepDurationResult.startTime && this.endTime == sleepDurationResult.endTime && this.totalDuration == sleepDurationResult.totalDuration;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final long getTotalDuration() {
            return this.totalDuration;
        }

        public int hashCode() {
            return (((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Long.hashCode(this.totalDuration);
        }

        @NotNull
        public String toString() {
            return "SleepDurationResult(startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalDuration=" + this.totalDuration + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001!B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/mi/health/utils/UiUtils$SleepItem;", "", "Ljava/io/Serializable;", "startTime", "", "endTime", "sleepState", "", "segEnd", "", "<init>", "(JJILjava/lang/Boolean;)V", "getStartTime", "()J", "getEndTime", "getSleepState", "()I", "getSegEnd", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "compareTo", "other", "toString", "", "component1", "component2", "component3", "component4", "copy", "(JJILjava/lang/Boolean;)Lcom/mi/health/utils/UiUtils$SleepItem;", "equals", "", "hashCode", "SleepState", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepItem implements Comparable<SleepItem>, Serializable {

        @SerializedName(StatConstants.PARAM_END)
        private final long endTime;

        @SerializedName("seg_end")
        @Nullable
        private final Boolean segEnd;

        @SerializedName("state")
        private final int sleepState;

        @SerializedName(StatConstants.PARAM_START)
        private final long startTime;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/mi/health/utils/UiUtils$SleepItem$SleepState;", "", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.TYPE})
        @Retention(RetentionPolicy.RUNTIME)
        public @interface SleepState {
            public static final int AWAKE = 5;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = Companion.$$INSTANCE;
            public static final int DEEP_SLEEP = 2;
            public static final int LIGHT_SLEEP = 3;
            public static final int NONE = 0;
            public static final int OTHER = 6;
            public static final int RAPID_EYE_MOVEMENT = 4;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mi/health/utils/UiUtils$SleepItem$SleepState$Companion;", "", "<init>", "()V", "NONE", "", "DEEP_SLEEP", "LIGHT_SLEEP", "RAPID_EYE_MOVEMENT", "AWAKE", DKFRequestService.a.d, "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                public static final int AWAKE = 5;
                public static final int DEEP_SLEEP = 2;
                public static final int LIGHT_SLEEP = 3;
                public static final int NONE = 0;
                public static final int OTHER = 6;
                public static final int RAPID_EYE_MOVEMENT = 4;

                private Companion() {
                }
            }
        }

        public SleepItem(long j, long j2, @SleepState int i, @Nullable Boolean bool) {
            this.startTime = j;
            this.endTime = j2;
            this.sleepState = i;
            this.segEnd = bool;
        }

        public static /* synthetic */ SleepItem copy$default(SleepItem sleepItem, long j, long j2, int i, Boolean bool, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = sleepItem.startTime;
            }
            long j3 = j;
            if ((i2 & 2) != 0) {
                j2 = sleepItem.endTime;
            }
            long j4 = j2;
            if ((i2 & 4) != 0) {
                i = sleepItem.sleepState;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                bool = sleepItem.segEnd;
            }
            return sleepItem.copy(j3, j4, i3, bool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getSleepState() {
            return this.sleepState;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getSegEnd() {
            return this.segEnd;
        }

        @NotNull
        public final SleepItem copy(long startTime, long endTime, @SleepState int sleepState, @Nullable Boolean segEnd) {
            return new SleepItem(startTime, endTime, sleepState, segEnd);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepItem)) {
                return false;
            }
            SleepItem sleepItem = (SleepItem) other;
            return this.startTime == sleepItem.startTime && this.endTime == sleepItem.endTime && this.sleepState == sleepItem.sleepState && Intrinsics.areEqual(this.segEnd, sleepItem.segEnd);
        }

        public final long getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final Boolean getSegEnd() {
            return this.segEnd;
        }

        public final int getSleepState() {
            return this.sleepState;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            int iHashCode = ((((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.sleepState)) * 31;
            Boolean bool = this.segEnd;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @NotNull
        public String toString() {
            return "SleepItem(startTime=" + this.startTime + ", endTime=" + this.endTime + ", sleepState=" + this.sleepState + ", segEnd=" + this.segEnd + ")";
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull SleepItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (int) (this.startTime - other.startTime);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$createBarChartBitmap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.utils.UiUtils", f = "UiUtils.kt", i = {0}, l = {306}, m = "createBarChartBitmap", n = {"bitmapResult"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiUtils.this.createBarChartBitmap(null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, false, 0, false, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$createBarChartBitmap$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.utils.UiUtils$createBarChartBitmap$2", f = "UiUtils.kt", i = {0}, l = {406}, m = "invokeSuspend", n = {"bmp"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils$createBarChartBitmap$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,1165:1\n1567#2:1166\n1598#2,4:1167\n1#3:1171\n90#4,6:1172\n*S KotlinDebug\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils$createBarChartBitmap$2\n*L\n356#1:1166\n356#1:1167,4\n397#1:1172,6\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $bitmapHeight;
        final /* synthetic */ Ref.ObjectRef<Bitmap> $bitmapResult;
        final /* synthetic */ int $bitmapWidth;
        final /* synthetic */ int $ceilToNearest;
        final /* synthetic */ float $chartBarWidthPercent;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $dataBarColor;
        final /* synthetic */ List<Float> $dataValues;
        final /* synthetic */ boolean $drawZeroAsCircle;
        final /* synthetic */ int $emptyBarColor;
        final /* synthetic */ float $radiusX;
        final /* synthetic */ float $radiusY;
        final /* synthetic */ String $saveLocalLocation;
        final /* synthetic */ boolean $useAbsoluteLeftRight;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$createBarChartBitmap$2$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.utils.UiUtils$createBarChartBitmap$2$3", f = "UiUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
            final /* synthetic */ Ref.ObjectRef<Bitmap> $bmp;
            final /* synthetic */ Context $context;
            final /* synthetic */ String $saveLocalLocation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Ref.ObjectRef<Bitmap> objectRef, Context context, String str, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$bmp = objectRef;
                this.$context = context;
                this.$saveLocalLocation = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$bmp, this.$context, this.$saveLocalLocation, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UiUtils.INSTANCE.saveBitmapToFile(this.$bmp.element, this.$context, this.$saveLocalLocation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, int i, boolean z, float f, List<Float> list, int i2, int i3, boolean z2, float f2, float f3, String str, Ref.ObjectRef<Bitmap> objectRef, int i4, int i5, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$bitmapWidth = i;
            this.$useAbsoluteLeftRight = z;
            this.$chartBarWidthPercent = f;
            this.$dataValues = list;
            this.$bitmapHeight = i2;
            this.$ceilToNearest = i3;
            this.$drawZeroAsCircle = z2;
            this.$radiusX = f2;
            this.$radiusY = f3;
            this.$saveLocalLocation = str;
            this.$bitmapResult = objectRef;
            this.$dataBarColor = i4;
            this.$emptyBarColor = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, this.$bitmapWidth, this.$useAbsoluteLeftRight, this.$chartBarWidthPercent, this.$dataValues, this.$bitmapHeight, this.$ceilToNearest, this.$drawZeroAsCircle, this.$radiusX, this.$radiusY, this.$saveLocalLocation, this.$bitmapResult, this.$dataBarColor, this.$emptyBarColor, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v5, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r5v18, types: [T, android.graphics.Bitmap] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float fFloatValue;
            w02 w02Var;
            Ref.ObjectRef objectRef;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BarChart barChart = new BarChart(this.$context);
                int i2 = this.$bitmapWidth;
                if (this.$useAbsoluteLeftRight) {
                    float f = 1;
                    float f2 = this.$chartBarWidthPercent;
                    int size = (int) ((i2 * (f - f2)) / ((f2 + this.$dataValues.size()) - f));
                    i2 += size;
                    barChart.setLayoutParams(new ViewGroup.LayoutParams(size + i2, this.$bitmapHeight));
                } else {
                    barChart.setLayoutParams(new ViewGroup.LayoutParams(i2, this.$bitmapHeight));
                }
                int i3 = i2;
                barChart.setDrawGridBackground(false);
                barChart.setDrawBarShadow(false);
                barChart.setDrawBorders(false);
                barChart.getLegend().setEnabled(false);
                barChart.getDescription().setEnabled(false);
                float f3 = 0.0f;
                barChart.setMinOffset(0.0f);
                barChart.setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
                barChart.setViewPortOffsets(0.0f, 0.0f, 0.0f, 0.0f);
                barChart.getXAxis().setEnabled(false);
                barChart.getAxisRight().setEnabled(false);
                barChart.getAxisLeft().setEnabled(false);
                Float fM1324maxOrNull = CollectionsKt___CollectionsKt.m1324maxOrNull((Iterable<Float>) this.$dataValues);
                if (fM1324maxOrNull == null || fM1324maxOrNull.floatValue() <= 0.0f) {
                    fFloatValue = 100.0f;
                } else if (this.$ceilToNearest > 0) {
                    int iFloatValue = (int) (fM1324maxOrNull.floatValue() / this.$ceilToNearest);
                    float fFloatValue2 = fM1324maxOrNull.floatValue();
                    int i4 = this.$ceilToNearest;
                    fFloatValue = (iFloatValue + (fFloatValue2 % ((float) i4) > 0.0f ? 1 : 0)) * i4;
                } else {
                    fFloatValue = fM1324maxOrNull.floatValue();
                }
                YAxis axisLeft = barChart.getAxisLeft();
                axisLeft.setAxisMinimum(0.0f);
                axisLeft.setAxisMaximum(fFloatValue);
                axisLeft.w(0.0f);
                axisLeft.v(0.0f);
                List<Float> list = this.$dataValues;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                int i5 = 0;
                for (Object obj2 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(new BarEntry(i5, ((Number) obj2).floatValue()));
                    i5 = i6;
                }
                y02 y02Var = new y02(arrayList, "");
                int i7 = this.$dataBarColor;
                List<Float> list2 = this.$dataValues;
                int i8 = this.$emptyBarColor;
                y02Var.V0(i7);
                y02Var.a1(0.0f);
                int size2 = list2.size();
                ArrayList arrayList2 = new ArrayList(size2);
                int i9 = 0;
                while (i9 < size2) {
                    arrayList2.add(Boxing.boxInt(list2.get(i9).floatValue() <= f3 ? i8 : i7));
                    i9++;
                    f3 = 0.0f;
                }
                y02Var.W0(arrayList2);
                if (this.$drawZeroAsCircle) {
                    w02Var = new w02(y02Var);
                } else {
                    int size3 = this.$dataValues.size();
                    ArrayList arrayList3 = new ArrayList(size3);
                    for (int i10 = 0; i10 < size3; i10++) {
                        arrayList3.add(new BarEntry(i10, fFloatValue));
                    }
                    y02 y02Var2 = new y02(arrayList3, "");
                    y02Var2.V0(this.$emptyBarColor);
                    y02Var2.a1(0.0f);
                    w02Var = new w02(y02Var2, y02Var);
                }
                w02Var.B(this.$chartBarWidthPercent);
                barChart.setData(w02Var);
                cu3 animator = barChart.getAnimator();
                Intrinsics.checkNotNullExpressionValue(animator, "getAnimator(...)");
                hwq viewPortHandler = barChart.getViewPortHandler();
                Intrinsics.checkNotNullExpressionValue(viewPortHandler, "getViewPortHandler(...)");
                barChart.setRenderer(new RoundedBarChartRenderer(barChart, animator, viewPortHandler, this.$radiusX, this.$radiusY, this.$drawZeroAsCircle));
                barChart.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.$bitmapHeight, 1073741824));
                barChart.layout(0, 0, i3, this.$bitmapHeight);
                objectRef = new Ref.ObjectRef();
                objectRef.element = Bitmap.createBitmap(i3, this.$bitmapHeight, Bitmap.Config.ARGB_8888);
                barChart.draw(new Canvas((Bitmap) objectRef.element));
                if (this.$useAbsoluteLeftRight) {
                    int size4 = (int) (((1 - this.$chartBarWidthPercent) / 2) * (i3 / this.$dataValues.size()));
                    objectRef.element = Bitmap.createBitmap((Bitmap) objectRef.element, size4, 0, i3 - (2 * size4), this.$bitmapHeight);
                }
                String str = this.$saveLocalLocation;
                if (str != null && str.length() != 0) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(objectRef, this.$context, this.$saveLocalLocation, null);
                    this.L$0 = objectRef;
                    this.label = 1;
                    if (BuildersKt.withContext(io2, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.$bitmapResult.element = objectRef.element;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$createSleepLineChartBitmap$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.utils.UiUtils$createSleepLineChartBitmap$2", f = "UiUtils.kt", i = {}, l = {717}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils$createSleepLineChartBitmap$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1165:1\n1053#2:1166\n1863#2:1167\n1863#2,2:1168\n1864#2:1170\n1053#2:1171\n1#3:1172\n*S KotlinDebug\n*F\n+ 1 UiUtils.kt\ncom/mi/health/utils/UiUtils$createSleepLineChartBitmap$2\n*L\n687#1:1166\n687#1:1167\n688#1:1168,2\n687#1:1170\n704#1:1171\n*E\n"})
    public static final class C14962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $outHeightDp;
        final /* synthetic */ int $outWidthDp;
        final /* synthetic */ RemoteViews $remoteViews;
        final /* synthetic */ List<SleepSegmentReport> $reports;
        final /* synthetic */ int $tickSeconds;
        int label;

        /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$createSleepLineChartBitmap$2$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.utils.UiUtils$createSleepLineChartBitmap$2$4", f = "UiUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
            final /* synthetic */ SleepChartView $chart;
            final /* synthetic */ int $outHeightDp;
            final /* synthetic */ int $outWidthDp;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(int i, int i2, SleepChartView sleepChartView, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$outWidthDp = i;
                this.$outHeightDp = i2;
                this.$chart = sleepChartView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$outWidthDp, this.$outHeightDp, this.$chart, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int dp = ExtUtilsKt.getDp(Boxing.boxInt(this.$outWidthDp));
                int dp2 = ExtUtilsKt.getDp(Boxing.boxInt(this.$outHeightDp));
                this.$chart.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(dp2, 1073741824));
                this.$chart.layout(0, 0, dp, dp2);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
                this.$chart.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14962(List<SleepSegmentReport> list, Context context, RemoteViews remoteViews, int i, int i2, int i3, Continuation<? super C14962> continuation) {
            super(2, continuation);
            this.$reports = list;
            this.$context = context;
            this.$remoteViews = remoteViews;
            this.$tickSeconds = i;
            this.$outWidthDp = i2;
            this.$outHeightDp = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14962(this.$reports, this.$context, this.$remoteViews, this.$tickSeconds, this.$outWidthDp, this.$outHeightDp, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Long lBoxLong;
            Long lBoxLong2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(this.$reports, new Comparator() { // from class: com.mi.health.utils.UiUtils$createSleepLineChartBitmap$2$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepSegmentReport) t).getBedTime()), Long.valueOf(((SleepSegmentReport) t2).getBedTime()));
                    }
                });
                int i2 = this.$tickSeconds;
                Iterator it = listSortedWith.iterator();
                while (it.hasNext()) {
                    List<SleepStateItem> sleepItems = ((SleepSegmentReport) it.next()).getSleepItems();
                    if (sleepItems != null) {
                        for (SleepStateItem sleepStateItem : sleepItems) {
                            SleepChartStage sleepChartStageFromState = SleepChartStage.INSTANCE.fromState(sleepStateItem.getSleepState());
                            if (sleepChartStageFromState != SleepChartStage.NOT_SLEEP) {
                                int iCeil = (int) Math.ceil(RangesKt___RangesKt.coerceAtLeast(sleepStateItem.getEndTime() - sleepStateItem.getStartTime(), 1L) / i2);
                                for (int i3 = 0; i3 < iCeil; i3++) {
                                    arrayList.add(TuplesKt.to(Boxing.boxLong(sleepStateItem.getStartTime() + ((long) (i3 * i2))), sleepChartStageFromState));
                                }
                            }
                        }
                    }
                }
                AttributeSet attributeSet = null;
                Object[] objArr = 0;
                if (arrayList.isEmpty()) {
                    return null;
                }
                SleepChartView sleepChartView = new SleepChartView(this.$context, attributeSet, 2, objArr == true ? 1 : 0);
                sleepChartView.setLayoutParams(new ViewGroup.LayoutParams(ExtUtilsKt.getDp(Boxing.boxInt(this.$outWidthDp)), ExtUtilsKt.getDp(Boxing.boxInt(this.$outHeightDp))));
                sleepChartView.setPadding(0, 0, 0, 0);
                sleepChartView.setSleepPoints(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.mi.health.utils.UiUtils$createSleepLineChartBitmap$2$invokeSuspend$lambda$5$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues((Long) ((Pair) t).getFirst(), (Long) ((Pair) t2).getFirst());
                    }
                }));
                RemoteViews remoteViews = this.$remoteViews;
                if (remoteViews != null) {
                    List<SleepSegmentReport> list = this.$reports;
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        lBoxLong = Boxing.boxLong(((SleepSegmentReport) it2.next()).getBedTime());
                        while (it2.hasNext()) {
                            Long lBoxLong3 = Boxing.boxLong(((SleepSegmentReport) it2.next()).getBedTime());
                            if (lBoxLong.compareTo(lBoxLong3) > 0) {
                                lBoxLong = lBoxLong3;
                            }
                        }
                    } else {
                        lBoxLong = null;
                    }
                    long jLongValue = lBoxLong != null ? lBoxLong.longValue() : 0L;
                    Iterator<T> it3 = list.iterator();
                    if (it3.hasNext()) {
                        lBoxLong2 = Boxing.boxLong(((SleepSegmentReport) it3.next()).getWakeupTime());
                        while (it3.hasNext()) {
                            Long lBoxLong4 = Boxing.boxLong(((SleepSegmentReport) it3.next()).getWakeupTime());
                            if (lBoxLong2.compareTo(lBoxLong4) < 0) {
                                lBoxLong2 = lBoxLong4;
                            }
                        }
                    } else {
                        lBoxLong2 = null;
                    }
                    long jLongValue2 = lBoxLong2 != null ? lBoxLong2.longValue() : 0L;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TimeUtils.FORMAT_H_M, Locale.getDefault());
                    long j = 1000;
                    remoteViews.setTextViewText(pqi.z, simpleDateFormat.format(Boxing.boxLong(jLongValue * j)));
                    remoteViews.setTextViewText(pqi.y, simpleDateFormat.format(Boxing.boxLong(jLongValue2 * j)));
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$outWidthDp, this.$outHeightDp, sleepChartView, null);
                this.label = 1;
                obj = BuildersKt.withContext(main, anonymousClass4, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C14962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$ifSupportBlur$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.utils.UiUtils", f = "UiUtils.kt", i = {0, 1}, l = {1078, 1110}, m = "ifSupportBlur", n = {"context", "blurSupport"}, s = {"L$0", "I$0"})
    public static final class C14971 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14971(Continuation<? super C14971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiUtils.this.ifSupportBlur(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$ifSupportBlur$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "settings", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.utils.UiUtils$ifSupportBlur$3", f = "UiUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(UiUtils.INSTANCE.getBLUR_SUPPORT_KEY(), Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    private UiUtils() {
    }

    public static /* synthetic */ SleepDurationResult calculateLongSleepDuration$default(UiUtils uiUtils, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return uiUtils.calculateLongSleepDuration(list, z);
    }

    public static /* synthetic */ Bitmap createSleepChartBitmap$default(UiUtils uiUtils, Context context, List list, RemoteViews remoteViews, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i = ExtUtilsKt.getDp(378);
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = ExtUtilsKt.getDp(142);
        }
        return uiUtils.createSleepChartBitmap(context, list, remoteViews, i4, i2);
    }

    private final int getHeightIndexInList(int type, LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer num = list.get(i);
            if (num != null && num.intValue() == type) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ int getTimeSegmentIndex$default(UiUtils uiUtils, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 24;
        }
        return uiUtils.getTimeSegmentIndex(j, i);
    }

    private final LinkedList<Integer> getTypeList(List<SleepStateItem> sleepStateItems) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<SleepStateItem> it = sleepStateItems.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(getSleepType(it.next().getSleepState())));
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(linkedHashSet);
        CollectionsKt__MutableCollectionsJVMKt.sort(linkedList);
        return linkedList;
    }

    public static /* synthetic */ File saveBitmapToFile$default(UiUtils uiUtils, Bitmap bitmap, Context context, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "chart_bitmap.png";
        }
        return uiUtils.saveBitmapToFile(bitmap, context, str);
    }

    public static /* synthetic */ SpannableString textNumberSizeChangeWithSpacing$default(UiUtils uiUtils, String str, int i, int i2, int i3, String str2, int i4, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i5 & 32) != 0) {
            i4 = 4;
        }
        return uiUtils.textNumberSizeChangeWithSpacing(str, i, i2, i3, str3, i4);
    }

    public static /* synthetic */ void updateWidgetDefaultBackgroundIntent$default(UiUtils uiUtils, Context context, RemoteViews remoteViews, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = IntentHelper.ACTION_APP_HOME;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            num = 0;
        }
        uiUtils.updateWidgetDefaultBackgroundIntent(context, remoteViews, str, str3, num);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b9  */
    @NotNull
    public final SleepDurationResult calculateLongSleepDuration(@Nullable List<SleepSegmentReport> sleepReports, boolean countNoItemsData) {
        boolean z;
        long bedTime;
        long wakeupTime;
        long j;
        Object next;
        long j2;
        long j3;
        Long lValueOf;
        int sleepDuration;
        List<SleepSegmentReport> list = sleepReports;
        if (list == null || list.isEmpty()) {
            return new SleepDurationResult(0L, 0L, 0L);
        }
        ArrayList<SleepSegmentReport> arrayList = new ArrayList();
        for (Object obj : sleepReports) {
            if (((SleepSegmentReport) obj).getSleepDuration() >= 180) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new SleepDurationResult(0L, 0L, 0L);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            String sid = ((SleepSegmentReport) next2).getSid();
            DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(sid != null ? sid : "");
            boolean z2 = false;
            if (deviceInfoInAll != null && deviceInfoInAll.isPhone()) {
                z2 = true;
            }
            if (!z2) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List<SleepStateItem> sleepItems = ((SleepSegmentReport) it2.next()).getSleepItems();
            if (sleepItems == null) {
                sleepItems = CollectionsKt__CollectionsKt.emptyList();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, sleepItems);
        }
        if (countNoItemsData) {
            long sleepDuration2 = 0;
            bedTime = 0;
            wakeupTime = 0;
            for (SleepSegmentReport sleepSegmentReport : arrayList) {
                List<SleepStateItem> sleepItems2 = sleepSegmentReport.getSleepItems();
                if (sleepItems2 == null || sleepItems2.isEmpty()) {
                    sleepDuration = sleepSegmentReport.getSleepDuration();
                    sleepDuration2 += (long) (sleepDuration * 60);
                    z = true;
                } else {
                    WearableDeviceManager deviceManagerExtKt2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                    String sid2 = sleepSegmentReport.getSid();
                    if (sid2 == null) {
                        sid2 = "";
                    }
                    DeviceInfo<? extends Device> deviceInfoInAll2 = deviceManagerExtKt2.getDeviceInfoInAll(sid2);
                    if (deviceInfoInAll2 == null || deviceInfoInAll2.isPhone() != z) {
                        List<SleepStateItem> sleepItems3 = sleepSegmentReport.getSleepItems();
                        Intrinsics.checkNotNull(sleepItems3, "null cannot be cast to non-null type kotlin.collections.Iterable<com.xiaomi.fit.data.common.data.daily.SleepStateItem>");
                        List<SleepStateItem> list2 = sleepItems3;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((SleepStateItem) it3.next()).getSleepState() == 6) {
                                    }
                                }
                                z = true;
                            }
                        }
                        sleepDuration = sleepSegmentReport.getSleepDuration();
                        sleepDuration2 += (long) (sleepDuration * 60);
                        z = true;
                    } else {
                        sleepDuration2 += (long) (sleepSegmentReport.getSleepDuration() * 60);
                        bedTime = sleepSegmentReport.getBedTime();
                        wakeupTime = sleepSegmentReport.getWakeupTime();
                    }
                }
            }
            j = sleepDuration2;
        } else {
            bedTime = 0;
            wakeupTime = 0;
            j = 0;
        }
        ArrayList<SleepStateItem> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            SleepStateItem sleepStateItem = (SleepStateItem) obj2;
            if (sleepStateItem.getSleepState() == 2 || sleepStateItem.getSleepState() == 3 || sleepStateItem.getSleepState() == 4) {
                arrayList4.add(obj2);
            }
        }
        Object next3 = null;
        Long l = null;
        if (arrayList4.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                lValueOf = Long.valueOf(((SleepSegmentReport) it4.next()).getBedTime());
                while (it4.hasNext()) {
                    Long lValueOf2 = Long.valueOf(((SleepSegmentReport) it4.next()).getBedTime());
                    if (lValueOf.compareTo(lValueOf2) > 0) {
                        lValueOf = lValueOf2;
                    }
                }
            } else {
                lValueOf = null;
            }
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            Iterator it5 = arrayList.iterator();
            if (it5.hasNext()) {
                Long lValueOf3 = Long.valueOf(((SleepSegmentReport) it5.next()).getWakeupTime());
                loop6: while (true) {
                    l = lValueOf3;
                    do {
                        if (!it5.hasNext()) {
                            break loop6;
                        }
                        lValueOf3 = Long.valueOf(((SleepSegmentReport) it5.next()).getWakeupTime());
                    } while (l.compareTo(lValueOf3) >= 0);
                }
            }
            return new SleepDurationResult(jLongValue, l != null ? l.longValue() : 0L, j);
        }
        long endTime = 0;
        for (SleepStateItem sleepStateItem2 : arrayList4) {
            endTime += sleepStateItem2.getEndTime() - sleepStateItem2.getStartTime();
        }
        long j4 = j + endTime;
        Iterator it6 = arrayList4.iterator();
        if (it6.hasNext()) {
            next = it6.next();
            if (it6.hasNext()) {
                long startTime = ((SleepStateItem) next).getStartTime();
                do {
                    Object next4 = it6.next();
                    long startTime2 = ((SleepStateItem) next4).getStartTime();
                    if (startTime > startTime2) {
                        next = next4;
                        startTime = startTime2;
                    }
                } while (it6.hasNext());
            }
        } else {
            next = null;
        }
        SleepStateItem sleepStateItem3 = (SleepStateItem) next;
        long startTime3 = sleepStateItem3 != null ? sleepStateItem3.getStartTime() : 0L;
        Iterator it7 = arrayList4.iterator();
        if (it7.hasNext()) {
            next3 = it7.next();
            if (it7.hasNext()) {
                long endTime2 = ((SleepStateItem) next3).getEndTime();
                do {
                    Object next5 = it7.next();
                    long endTime3 = ((SleepStateItem) next5).getEndTime();
                    if (endTime2 < endTime3) {
                        next3 = next5;
                        endTime2 = endTime3;
                    }
                } while (it7.hasNext());
            }
        }
        SleepStateItem sleepStateItem4 = (SleepStateItem) next3;
        long endTime4 = sleepStateItem4 != null ? sleepStateItem4.getEndTime() : 0L;
        if (bedTime <= 0) {
            j2 = startTime3;
        } else if (startTime3 <= 0) {
            j2 = 0;
        } else if (startTime3 < bedTime) {
            j2 = startTime3;
        } else {
            j2 = bedTime;
        }
        if (wakeupTime <= 0) {
            j3 = endTime4;
        } else if (endTime4 <= 0) {
            j3 = 0;
        } else if (endTime4 > wakeupTime) {
            j3 = endTime4;
        } else {
            j3 = wakeupTime;
        }
        return new SleepDurationResult(j2, j3, j4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object createBarChartBitmap(@NotNull Context context, @NotNull List<Float> list, int i, int i2, int i3, int i4, float f, float f2, float f3, boolean z, int i5, boolean z2, @Nullable String str, @NotNull Continuation<? super Bitmap> continuation) {
        AnonymousClass1 anonymousClass1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i6 = anonymousClass1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i6 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = anonymousClass1.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, i, z, f3, list, i2, i5, z2, f, f2, str, objectRef2, i4, i3, null);
            anonymousClass1.L$0 = objectRef2;
            anonymousClass1.label = 1;
            if (BuildersKt.withContext(main, anonymousClass2, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Bitmap bitmap = (Bitmap) objectRef.element;
        return bitmap == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : bitmap;
    }

    @NotNull
    public final List<SleepItemEntry> createDaySleepChartEntry(@NotNull SleepSegmentReport report, boolean hrAndSpo2Data) {
        Iterator<TimedValue<Integer>> it;
        Iterator<TimedValue<Integer>> it2;
        UiUtils uiUtils = this;
        Intrinsics.checkNotNullParameter(report, "report");
        LinkedList linkedList = new LinkedList();
        List<SleepStateItem> sleepItems = report.getSleepItems();
        List<SleepStateItem> list = sleepItems;
        if (list == null || list.isEmpty()) {
            return linkedList;
        }
        SleepStateItem sleepStateItem = sleepItems.get(0);
        LinkedList<Integer> typeList = uiUtils.getTypeList(sleepItems);
        long startTime = sleepStateItem.getStartTime();
        int size = sleepItems.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i < size) {
            SleepStateItem sleepStateItem2 = sleepItems.get(i);
            SleepItemEntry sleepItemEntry = new SleepItemEntry();
            npm npmVar = new npm();
            int sleepType = uiUtils.getSleepType(sleepStateItem2.getSleepState());
            npmVar.c = sleepType;
            npmVar.f28234b = npm.c(sleepType);
            npmVar.d = uiUtils.getHeightIndexInList(npmVar.c, typeList);
            sleepItemEntry.type = i == 0 ? TYPE_XAXIS_FIRST : 0;
            List<SleepStateItem> list2 = sleepItems;
            npmVar.f = sleepStateItem2.getStartTime();
            npmVar.g = sleepStateItem2.getEndTime();
            if (hrAndSpo2Data) {
                List<TimedValue<Integer>> hrDetailRecords = report.getHrDetailRecords();
                if (hrDetailRecords != null) {
                    Iterator<TimedValue<Integer>> it3 = hrDetailRecords.iterator();
                    while (it3.hasNext()) {
                        TimedValue<Integer> next = it3.next();
                        long time = next.getTime();
                        long startTime2 = sleepStateItem2.getStartTime();
                        if (time > sleepStateItem2.getEndTime() || startTime2 > time) {
                            it2 = it3;
                        } else {
                            it2 = it3;
                            if (next.getValue().intValue() > npmVar.i) {
                                npmVar.i = next.getValue().intValue();
                            }
                            int iIntValue = next.getValue().intValue();
                            int i6 = npmVar.j;
                            if ((iIntValue < i6 || i6 == 0) && next.getValue().intValue() > 0) {
                                npmVar.j = next.getValue().intValue();
                            }
                        }
                        it3 = it2;
                    }
                    int i7 = npmVar.i;
                    if (i7 != 0) {
                        i2 = i7;
                    } else {
                        npmVar.i = i2;
                    }
                    int i8 = npmVar.j;
                    if (i8 != 0) {
                        i3 = i8;
                    } else {
                        npmVar.j = i3;
                    }
                }
                List<TimedValue<Integer>> spo2DetailRecords = report.getSpo2DetailRecords();
                if (spo2DetailRecords != null) {
                    Iterator<TimedValue<Integer>> it4 = spo2DetailRecords.iterator();
                    while (it4.hasNext()) {
                        TimedValue<Integer> next2 = it4.next();
                        long time2 = next2.getTime();
                        long startTime3 = sleepStateItem2.getStartTime();
                        if (time2 > sleepStateItem2.getEndTime() || startTime3 > time2) {
                            it = it4;
                        } else {
                            it = it4;
                            if (next2.getValue().intValue() > npmVar.f28235k) {
                                npmVar.f28235k = next2.getValue().intValue();
                            }
                            int iIntValue2 = next2.getValue().intValue();
                            int i9 = npmVar.l;
                            if ((iIntValue2 < i9 || i9 == 0) && next2.getValue().intValue() > 0) {
                                npmVar.l = next2.getValue().intValue();
                            }
                        }
                        it4 = it;
                    }
                    int i10 = npmVar.f28235k;
                    if (i10 != 0) {
                        i4 = i10;
                    } else {
                        npmVar.f28235k = i4;
                    }
                    int i11 = npmVar.l;
                    if (i11 != 0) {
                        i5 = i11;
                    } else {
                        npmVar.l = i5;
                    }
                }
            }
            sleepItemEntry.localDate = TimeDateUtil.timestampToLocalDate(npmVar.g);
            sleepItemEntry.timestamp = npmVar.g;
            sleepItemEntry.f11764a = npmVar;
            sleepItemEntry.setY(npmVar.c + 1);
            sleepItemEntry.setX(npmVar.f - startTime);
            LinkedList linkedList2 = linkedList;
            int i12 = (int) (npmVar.g - npmVar.f);
            npmVar.e = i12;
            if (i12 == 0) {
                npmVar.e = 1;
            }
            linkedList2.add(0, sleepItemEntry);
            i++;
            sleepItems = list2;
            linkedList = linkedList2;
            uiUtils = this;
        }
        return linkedList;
    }

    @Nullable
    public final Bitmap createSleepChartBitmap(@NotNull Context context, @NotNull List<SleepSegmentReport> reports, @NotNull RemoteViews remoteViews, int chartWidth, int chartHeight) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reports, "reports");
        Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
        WidgetSleepChartRecyclerView widgetSleepChartRecyclerView = new WidgetSleepChartRecyclerView(context, null);
        widgetSleepChartRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(chartWidth, chartHeight));
        widgetSleepChartRecyclerView.setPaddingRelative(0, 0, 0, 0);
        Logger.i(TAG, "createSleepChartBitmap: recyclerView = " + widgetSleepChartRecyclerView);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new SleepItemEntry());
        qim qimVar = (qim) widgetSleepChartRecyclerView.mAttrs;
        if (qimVar != null) {
            qimVar.f625a = 0.0f;
        }
        if (qimVar != null) {
            qimVar.f626b = 0.0f;
        }
        widgetSleepChartRecyclerView.setLayoutManager(new SpeedRatioLayoutManager(context, qimVar));
        WidgetSleepChartAdapter widgetSleepChartAdapter = new WidgetSleepChartAdapter(context, arrayList, widgetSleepChartRecyclerView);
        widgetSleepChartRecyclerView.setAdapter(widgetSleepChartAdapter);
        arrayList.clear();
        int stageCount = 0;
        for (SleepSegmentReport sleepSegmentReport : reports) {
            if (sleepSegmentReport.getStageCount() > 0) {
                if (sleepSegmentReport.getStageCount() > stageCount) {
                    stageCount = sleepSegmentReport.getStageCount();
                }
                arrayList.addAll(createDaySleepChartEntry(sleepSegmentReport, true));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        SleepChartItemDecoration sleepChartItemDecoration = qimVar != null ? new SleepChartItemDecoration(qimVar, remoteViews) : null;
        if (sleepChartItemDecoration != null) {
            sleepChartItemDecoration.updateStageSize(stageCount);
            sleepChartItemDecoration.setHighLightValueFormatter(new DaySleepHighLightFormatter(0));
            widgetSleepChartRecyclerView.addItemDecoration(sleepChartItemDecoration);
        }
        Logger.i(TAG, "createSleepChartBitmap: recyclerView = " + widgetSleepChartRecyclerView);
        widgetSleepChartAdapter.setEntries(arrayList);
        widgetSleepChartRecyclerView.measure(View.MeasureSpec.makeMeasureSpec(chartWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(chartHeight, Integer.MIN_VALUE));
        widgetSleepChartRecyclerView.layout(0, 0, chartWidth, chartHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        widgetSleepChartRecyclerView.draw(new Canvas(bitmapCreateBitmap));
        if (sleepChartItemDecoration == null || !sleepChartItemDecoration.getSleepLabelsExist()) {
            return null;
        }
        return bitmapCreateBitmap;
    }

    @Nullable
    public final Object createSleepLineChartBitmap(@NotNull Context context, @NotNull List<SleepSegmentReport> list, @Nullable RemoteViews remoteViews, int i, int i2, int i3, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new C14962(list, context, remoteViews, i3, i, i2, null), continuation);
    }

    @NotNull
    public final Preferences.Key<Boolean> getBLUR_SUPPORT_KEY() {
        return BLUR_SUPPORT_KEY;
    }

    @Nullable
    public final Boolean getCachedBlurSupport() {
        return cachedBlurSupport;
    }

    public final int getSleepType(int sleepState) {
        if (sleepState == 2) {
            return 3;
        }
        if (sleepState == 3) {
            return 2;
        }
        if (sleepState == 4) {
            return 1;
        }
        if (sleepState != 5) {
            return sleepState != 6 ? -1 : 4;
        }
        return 0;
    }

    public final int getTYPE_XAXIS_FIRST() {
        return TYPE_XAXIS_FIRST;
    }

    public final int getTimeSegmentIndex(long timestamp, int totalSegments) {
        if (totalSegments <= 0) {
            throw new IllegalArgumentException("Total segments must be greater than 0".toString());
        }
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), ZoneId.systemDefault()).toLocalTime().toSecondOfDay() / (RepositoryManager.GAP_A_DAY / totalSegments);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object ifSupportBlur(@NotNull Context context, @NotNull Continuation<? super Boolean> continuation) {
        C14971 c14971;
        int i;
        if (continuation instanceof C14971) {
            c14971 = (C14971) continuation;
            int i2 = c14971.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c14971.label = i2 - Integer.MIN_VALUE;
            } else {
                c14971 = new C14971(continuation);
            }
        } else {
            c14971 = new C14971(continuation);
        }
        Object objFirst = c14971.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c14971.label;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    context = (Context) c14971.L$0;
                    ResultKt.throwOnFailure(objFirst);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = c14971.I$0;
                    ResultKt.throwOnFailure(objFirst);
                }
                cachedBlurSupport = Boxing.boxBoolean(i != 0);
                Logger.i("widgetUiMiBlurSupportStateTimeEnd2", System.currentTimeMillis() + " + " + cachedBlurSupport);
                return Boxing.boxBoolean(Intrinsics.areEqual(cachedBlurSupport, Boxing.boxBoolean(true)));
            }
            ResultKt.throwOnFailure(objFirst);
            Logger.i("widgetUiMiBlurSupportStateTimeStart", Boxing.boxLong(System.currentTimeMillis()));
            Boolean bool = cachedBlurSupport;
            if (bool != null) {
                return Boxing.boxBoolean(bool.booleanValue());
            }
            if (!RomUtils.INSTANCE.isAtLeastHyperOS2(context)) {
                cachedBlurSupport = Boxing.boxBoolean(false);
                Logger.i("widgetUiMiBlurSupportState", "Not Xiaomi HyperOS>=2 => blur unsupported.");
                return Boxing.boxBoolean(false);
            }
            final Flow<Preferences> data = UiUtilsKt.getWidgetDataStore(context).getData();
            Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.mi.health.utils.UiUtils$ifSupportBlur$$inlined$map$1

                /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$ifSupportBlur$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UiUtils.kt\ncom/mi/health/utils/UiUtils\n*L\n1#1,222:1\n54#2:223\n1077#3:224\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.mi.health.utils.UiUtils$ifSupportBlur$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.mi.health.utils.UiUtils$ifSupportBlur$$inlined$map$1$2", f = "UiUtils.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Boolean boolBoxBoolean = Boxing.boxBoolean(Intrinsics.areEqual(((Preferences) obj).get(UiUtils.INSTANCE.getBLUR_SUPPORT_KEY()), Boxing.boxBoolean(true)));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation2) {
                    Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation2);
                    return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            c14971.L$0 = context;
            c14971.label = 1;
            objFirst = FlowKt.first(flow, c14971);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) objFirst).booleanValue()) {
                cachedBlurSupport = Boxing.boxBoolean(true);
                Logger.i("widgetUiMiBlurSupportStateTimeEnd1", System.currentTimeMillis() + " + " + cachedBlurSupport);
                return Boxing.boxBoolean(true);
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(ContextAdapter.MIUI_HOME_PACKAGE, 128).applicationInfo;
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            Boolean boolBoxBoolean = bundle != null ? Boxing.boxBoolean(bundle.getBoolean("widget.upgrade.supportHomeBlur")) : null;
            ApplicationInfo applicationInfo2 = context.getPackageManager().getPackageInfo("com.miui.personalassistant", 128).applicationInfo;
            Bundle bundle2 = applicationInfo2 != null ? applicationInfo2.metaData : null;
            int i4 = (Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(true)) && Intrinsics.areEqual(bundle2 != null ? Boxing.boxBoolean(bundle2.getBoolean("widget.upgrade.supportPABlur")) : null, Boxing.boxBoolean(true))) ? 1 : 0;
            if (i4 != 0) {
                DataStore<Preferences> widgetDataStore = UiUtilsKt.getWidgetDataStore(context);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
                c14971.L$0 = null;
                c14971.I$0 = i4;
                c14971.label = 2;
                if (PreferencesKt.edit(widgetDataStore, anonymousClass3, c14971) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i4;
                cachedBlurSupport = Boxing.boxBoolean(i != 0);
            }
            Logger.i("widgetUiMiBlurSupportStateTimeEnd2", System.currentTimeMillis() + " + " + cachedBlurSupport);
            return Boxing.boxBoolean(Intrinsics.areEqual(cachedBlurSupport, Boxing.boxBoolean(true)));
        } catch (PackageManager.NameNotFoundException e) {
            Logger.i("widgetUiMiBlurSupportState", String.valueOf(e));
        }
    }

    @Nullable
    public final File saveBitmapToFile(@NotNull Bitmap bitmap, @NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            Boolean boolValueOf = externalFilesDir != null ? Boolean.valueOf(externalFilesDir.exists()) : null;
            Intrinsics.checkNotNull(boolValueOf);
            if (!boolValueOf.booleanValue()) {
                externalFilesDir.mkdirs();
            }
            File file = new File(externalFilesDir, fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void setCachedBlurSupport(@Nullable Boolean bool) {
        cachedBlurSupport = bool;
    }

    public final boolean shouldShowOs3Ui() {
        return RomUtils.isAtLeastHyperOS3$default(RomUtils.INSTANCE, null, 1, null);
    }

    @NotNull
    public final SpannableString textNumberSizeChangeWithSpacing(@NotNull String valueText, int originTextSize, int numberSize, int otherSize, @Nullable String numberReplaceStr, int spacingPx) {
        int i;
        Intrinsics.checkNotNullParameter(valueText, "valueText");
        float f = originTextSize;
        float f2 = numberSize / f;
        float f3 = otherSize / f;
        StringBuilder sb = new StringBuilder(new Regex(" +").replace(valueText, ""));
        Regex regex = new Regex("\\d+");
        Sequence<MatchResult> sequenceFindAll$default = Regex.findAll$default(regex, sb, 0, 2, null);
        ArrayList arrayList = new ArrayList();
        for (MatchResult matchResult : sequenceFindAll$default) {
            int first = matchResult.getRange().getFirst();
            arrayList.add(new Pair(Integer.valueOf(first), Integer.valueOf(first + (numberReplaceStr != null ? numberReplaceStr.length() : (matchResult.getRange().getLast() + 1) - first))));
        }
        for (Pair pair : CollectionsKt___CollectionsKt.reversed(arrayList)) {
            int iIntValue = ((Number) pair.component1()).intValue();
            int iIntValue2 = ((Number) pair.component2()).intValue();
            if (iIntValue > 0) {
                sb.insert(iIntValue, " ");
                i = 1;
            } else {
                i = 0;
            }
            if (iIntValue2 < sb.length()) {
                sb.insert(iIntValue2 + i, " ");
            }
        }
        Sequence<MatchResult> sequenceFindAll$default2 = Regex.findAll$default(regex, sb, 0, 2, null);
        ArrayList<Pair> arrayList2 = new ArrayList();
        int length = 0;
        for (MatchResult matchResult2 : sequenceFindAll$default2) {
            int first2 = matchResult2.getRange().getFirst();
            int last = matchResult2.getRange().getLast() + 1;
            int i2 = first2 + length;
            int i3 = last + length;
            if (numberReplaceStr != null) {
                sb.replace(i2, i3, numberReplaceStr);
                length += numberReplaceStr.length() - (last - first2);
            }
            arrayList2.add(new Pair(Integer.valueOf(i2), Integer.valueOf(i2 + (numberReplaceStr != null ? numberReplaceStr.length() : i3 - i2))));
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        for (Pair pair2 : arrayList2) {
            spannableString.setSpan(new RelativeSizeSpan(f2), ((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue(), 33);
        }
        int i4 = 0;
        for (Pair pair3 : arrayList2) {
            int iIntValue3 = ((Number) pair3.component1()).intValue();
            int iIntValue4 = ((Number) pair3.component2()).intValue();
            if (i4 < iIntValue3) {
                spannableString.setSpan(new RelativeSizeSpan(f3), i4, iIntValue3, 33);
            }
            i4 = iIntValue4;
        }
        if (i4 < spannableString.length()) {
            spannableString.setSpan(new RelativeSizeSpan(f3), i4, spannableString.length(), 33);
        }
        for (MatchResult matchResult3 : Regex.findAll$default(new Regex(" +"), sb, 0, 2, null)) {
            spannableString.setSpan(new AbsoluteSizeSpan(spacingPx, true), matchResult3.getRange().getFirst(), matchResult3.getRange().getLast() + 1, 33);
        }
        return spannableString;
    }

    public final void updateWidgetDefaultBackgroundIntent(@NotNull Context context, @NotNull RemoteViews remoteViews, @NotNull String intentTarget, @NotNull String parentTab, @Nullable Integer appWidgetId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
        Intrinsics.checkNotNullParameter(intentTarget, "intentTarget");
        Intrinsics.checkNotNullParameter(parentTab, "parentTab");
        int iIntValue = (int) (((long) (appWidgetId != null ? appWidgetId.intValue() : 0)) + SystemClock.uptimeMillis());
        IntentHelper intentHelper = IntentHelper.INSTANCE;
        intentHelper.getRouterIntentByAction(parentTab).putExtra("_widget_req1", iIntValue);
        Intent routerIntentByAction = intentHelper.getRouterIntentByAction(intentTarget);
        routerIntentByAction.addFlags(335544320);
        routerIntentByAction.putExtra("key_tab", MainTab.INSTANCE.getINDEX_HEALTH());
        PendingIntent activities = PendingIntent.getActivities(context, iIntValue, new Intent[]{routerIntentByAction}, 201326592);
        Logger.i("updateWidgetDefaultBackgroundIntent", "Updating widget background intent: " + intentTarget + ", requestCode: " + iIntValue);
        remoteViews.setOnClickPendingIntent(R.id.background, activities);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/mi/health/utils/UiUtils$RoundedBarChartRenderer;", "Lu02;", "Landroid/graphics/Canvas;", PluginDeviceInfo.FICONON, "Lgpc;", "dataSet", "", "index", "", "drawDataSet", "(Landroid/graphics/Canvas;Lgpc;I)V", "", "rx", "F", "ry", "", "drawZeroCircle", "Z", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lcu3;", "animator", "Lhwq;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/charts/BarChart;Lcu3;Lhwq;FFZ)V", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class RoundedBarChartRenderer extends u02 {
        private final boolean drawZeroCircle;
        private final float rx;
        private final float ry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoundedBarChartRenderer(@NotNull BarChart chart, @NotNull cu3 animator, @NotNull hwq viewPortHandler, float f, float f2, boolean z) {
            super(chart, animator, viewPortHandler);
            Intrinsics.checkNotNullParameter(chart, "chart");
            Intrinsics.checkNotNullParameter(animator, "animator");
            Intrinsics.checkNotNullParameter(viewPortHandler, "viewPortHandler");
            this.rx = f;
            this.ry = f2;
            this.drawZeroCircle = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.u02
        public void drawDataSet(@NotNull Canvas c, @NotNull gpc dataSet, int index) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(dataSet, "dataSet");
            ryp transformer = this.mChart.getTransformer(dataSet.m0());
            w02 barData = this.mChart.getBarData();
            this.mBarRect.setEmpty();
            int iO0 = dataSet.O0();
            for (int i = 0; i < iO0; i++) {
                T tI = dataSet.i(i);
                Intrinsics.checkNotNull(tI, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarEntry");
                BarEntry barEntry = (BarEntry) tI;
                this.mBarRect.left = barEntry.getX() - (barData.y() / 2.0f);
                this.mBarRect.right = barEntry.getX() + (barData.y() / 2.0f);
                this.mBarRect.top = barEntry.getY();
                RectF rectF = this.mBarRect;
                rectF.bottom = 0.0f;
                transformer.p(rectF);
                this.mRenderPaint.setColor(dataSet.E0(i));
                this.mRenderPaint.setStyle(Paint.Style.FILL);
                RectF rectF2 = this.mBarRect;
                float f = (rectF2.right - rectF2.left) / 2.0f;
                if (barEntry.getY() > 0.0f || !this.drawZeroCircle) {
                    c.drawRoundRect(this.mBarRect, this.rx, this.ry, this.mRenderPaint);
                } else {
                    RectF rectF3 = this.mBarRect;
                    c.drawCircle((rectF3.left + rectF3.right) / 2.0f, rectF3.bottom - f, f, this.mRenderPaint);
                }
            }
        }

        public /* synthetic */ RoundedBarChartRenderer(BarChart barChart, cu3 cu3Var, hwq hwqVar, float f, float f2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(barChart, cu3Var, hwqVar, (i & 8) != 0 ? 20.0f : f, (i & 16) != 0 ? 20.0f : f2, (i & 32) != 0 ? true : z);
        }
    }
}
