package com.xiaomi.hm.health.healthdata.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.stress.domain.model.Stress;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.ext.ViewExKt;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0097\u00012\u00020\u0001:\u0006\u0097\u0001\u0098\u0001\u0099\u0001B.\b\u0007\u0012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u0001\u0012\t\b\u0002\u0010\u0094\u0001\u001a\u00020\r¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0014J(\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0014J1\u0010'\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010&\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0017R\u0016\u0010/\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0016\u00101\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0016\u00103\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010.R\u0016\u00104\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u00106\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010.R\u0016\u0010<\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010.R\u0016\u0010>\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010.R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010.R\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010.R\u0016\u0010D\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010.R\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010.R\u0016\u0010I\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010.R\u0016\u0010Q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010.R\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020J0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bU\u0010.R\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\r0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010SR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\r0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010SR\u0016\u0010[\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bZ\u0010.R\u0016\u0010]\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010.R\u0016\u0010_\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u00105R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010bR\u0016\u0010g\u001a\u00020`8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010bR\u0016\u0010i\u001a\u00020`8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010bR\u0016\u0010j\u001a\u00020`8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010bR\u0016\u0010n\u001a\u00020k8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010SR\u0018\u0010s\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010rR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010xR\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0084\u0001\u00105R\u0018\u0010\u0087\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010tR\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010.R\u0018\u0010\u008d\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010HR\u0018\u0010\u008f\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010t¨\u0006\u009a\u0001"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/StressAllDayLineChart;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "f", "g", GoogleApiAvailabilityLight.a, "e", "", "curTime", "", "a", "", "index", "b", "moveX", "i", "selectTime", "h", "(J)Ljava/lang/Integer;", Constant.PAI_KEY_DAILY_PAI, "c", "", "getRadianValues", "Lcom/xiaomi/hm/health/healthdata/ui/view/StressAllDayLineChart$OnSelectChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectListener", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "w", "oldw", "oldh", "onSizeChanged", "", "Lcom/huami/stress/domain/model/Stress;", "data", "frequency", "updateData", "(Ljava/util/List;Ljava/lang/Integer;I)V", "onDraw", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", LogUtil.I, "axisTimeTextSize", "axisTimeTextColor", "axisTimeMarginEnd", "axisValueTextSize", "axisValueTextColor", "chartMarginStart", "F", "lineWidth", "comfortableLineColor", "normalLineColor", z.j, "mediumLineColor", hl.k, "highLineColor", "l", "chartHeight", "m", "axisLineWidth", GoogleApiAvailabilityLight.b, "axisLineColor", "o", "interactiveLineColor", b.r, "interactiveLineWidth", DTransferConstants.SEARCH_KEY, "Z", "showSelect", "", "r", "Ljava/lang/String;", "noDataText", SOAP.XMLNS, "noDataTextSize", "t", "noDataTextColor", "u", "Ljava/util/List;", "xAxisTextLabels", "v", "xAxisGapInMillis", "yAxisValues", "x", "tagValue", "y", "maxValue", "z", "itemNum", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "mItemWidth", "Landroid/graphics/Paint;", "B", "Landroid/graphics/Paint;", "mTextPaint", "C", "mLinePaint", LogUtil.D, "mAxisPaint", "E", "interactivePaint", "noDataPaint", "Landroid/graphics/RectF;", "G", "Landroid/graphics/RectF;", "mChartViewRectF", "H", "mData", "", "[I", "lineColor", "J", "rectColor", "Landroid/graphics/Point;", "K", "Landroid/graphics/Point;", "point", "L", "nextPoint", "M", "selectPoint", "N", "[F", "mPos", "O", "Ljava/lang/Integer;", "selectIndex", "P", "invalidX", "Q", "dayStartTime", "R", "Lcom/xiaomi/hm/health/healthdata/ui/view/StressAllDayLineChart$OnSelectChangeListener;", ExifInterface.LATITUDE_SOUTH, "mFrequency", ExifInterface.GPS_DIRECTION_TRUE, "showInteractiveLine", "U", "touchDownTime", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "ItemData", "OnSelectChangeListener", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressAllDayLineChart extends View {
    public static final int DEFAULT_CHART_HEIGHT = 400;
    public static final int DEFAULT_LINE_COLOR = -16777216;
    public static final int DEFAULT_LINE_WIDTH = 1;
    public static final int DEFAULT_TEXT_COLOR = -7829368;
    public static final float DEFAULT_TEXT_SIZE = 12.0f;
    public static final int DEFAULT_VALUE = 0;
    public static final int MILLI_SECONDS_IN_MINUTE = 60000;
    public static final int TIME_INTERRUPT = 300;
    public static final int TOUCH_OFFSET_TIME = 600000;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float mItemWidth;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Paint mTextPaint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private Paint mLinePaint;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Paint mAxisPaint;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Paint interactivePaint;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Paint noDataPaint;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final RectF mChartViewRectF;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private List<Stress> mData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    private int[] lineColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    private int[] rectColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    private Point point;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    private Point nextPoint;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    private Point selectPoint;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    private float[] mPos;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    private Integer selectIndex;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final float invalidX;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private long dayStartTime;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    private OnSelectChangeListener listener;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private int mFrequency;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private boolean showInteractiveLine;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private long touchDownTime;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int axisTimeTextSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int axisTimeTextColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int axisTimeMarginEnd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int axisValueTextSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int axisValueTextColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int chartMarginStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float lineWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int comfortableLineColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int normalLineColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mediumLineColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int highLineColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int chartHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int axisLineWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int axisLineColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int interactiveLineColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int interactiveLineWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean showSelect;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private String noDataText;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int noDataTextSize;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int noDataTextColor;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final List<String> xAxisTextLabels;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int xAxisGapInMillis;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> yAxisValues;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> tagValue;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int maxValue;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int itemNum;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String V = StressAllDayLineChart.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R!\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0016\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/StressAllDayLineChart$Companion;", "", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "", "DEFAULT_CHART_HEIGHT", LogUtil.I, "DEFAULT_LINE_COLOR", "DEFAULT_LINE_WIDTH", "DEFAULT_TEXT_COLOR", "", "DEFAULT_TEXT_SIZE", "F", "DEFAULT_VALUE", "MILLI_SECONDS_IN_MINUTE", "TIME_INTERRUPT", "TOUCH_OFFSET_TIME", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return StressAllDayLineChart.V;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/StressAllDayLineChart$ItemData;", "", "", "component1", "", "component2", "value", "timeStr", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getValue", "()I", "b", "Ljava/lang/String;", "getTimeStr", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ItemData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String timeStr;

        public ItemData(int i, @NotNull String str) {
            this.value = i;
            this.timeStr = str;
        }

        public static /* synthetic */ ItemData copy$default(ItemData itemData, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = itemData.value;
            }
            if ((i2 & 2) != 0) {
                str = itemData.timeStr;
            }
            return itemData.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTimeStr() {
            return this.timeStr;
        }

        @NotNull
        public final ItemData copy(int value, @NotNull String timeStr) {
            return new ItemData(value, timeStr);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemData)) {
                return false;
            }
            ItemData itemData = (ItemData) other;
            return this.value == itemData.value && Intrinsics.areEqual(this.timeStr, itemData.timeStr);
        }

        @NotNull
        public final String getTimeStr() {
            return this.timeStr;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.value * 31) + this.timeStr.hashCode();
        }

        @NotNull
        public String toString() {
            return "ItemData(value=" + this.value + ", timeStr=" + this.timeStr + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/StressAllDayLineChart$OnSelectChangeListener;", "", "", "xPos", "", "selected", "Lcom/xiaomi/hm/health/healthdata/ui/view/StressAllDayLineChart$ItemData;", "item", "", "select", "(Ljava/lang/Float;ZLcom/xiaomi/hm/health/healthdata/ui/view/StressAllDayLineChart$ItemData;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnSelectChangeListener {
        void select(@Nullable Float xPos, boolean selected, @Nullable ItemData item);
    }

    @JvmOverloads
    public StressAllDayLineChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public StressAllDayLineChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StressAllDayLineChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final float a(long curTime) {
        return this.mChartViewRectF.left + (this.mItemWidth * (((curTime - this.dayStartTime) / ((long) 1000)) / ((long) 60)));
    }

    private final float b(int index) {
        return (int) (this.chartHeight * (1 - (Math.min(this.mData.get(index).getValue(), this.maxValue) / this.maxValue)));
    }

    private final float c(View view, float f) {
        return TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics());
    }

    private final void d(Canvas canvas) {
        this.mTextPaint.setTextSize(this.axisValueTextSize);
        float fMeasureText = this.mTextPaint.measureText((String) CollectionsKt.first((List) this.xAxisTextLabels));
        RectF rectF = this.mChartViewRectF;
        float f = 2;
        float f2 = fMeasureText / f;
        float f3 = rectF.left - f2;
        float f4 = rectF.right + f2;
        int size = this.chartHeight / (this.yAxisValues.size() - 1);
        boolean zIsEmpty = this.mData.isEmpty();
        if (!zIsEmpty) {
            this.mAxisPaint.setPathEffect(new DashPathEffect(new float[]{4.0f, 4.0f}, 0.0f));
        }
        int i = 0;
        int size2 = this.yAxisValues.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            float f5 = this.mChartViewRectF.top + (size * i);
            this.mTextPaint.setColor(this.axisLineColor);
            if (!zIsEmpty || i == this.yAxisValues.size() - 1) {
                canvas.drawLine(f4, f5, f3, f5, this.mAxisPaint);
            }
            if (!zIsEmpty) {
                this.mTextPaint.setColor(this.axisValueTextColor);
                canvas.drawText(String.valueOf(this.yAxisValues.get(i).intValue()), this.axisTimeMarginEnd + f4, (f5 - (this.mTextPaint.getFontMetrics().top / f)) - (this.mTextPaint.getFontMetrics().bottom / f), this.mTextPaint);
            }
            if (i2 > size2) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final void e(Canvas canvas) {
        this.mTextPaint.setTextSize(this.axisTimeTextSize);
        this.mTextPaint.setColor(this.axisTimeTextColor);
        float fMeasureText = this.mTextPaint.measureText("23:59");
        int size = this.xAxisTextLabels.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            canvas.drawText(this.xAxisTextLabels.get(i), a(this.dayStartTime + ((long) (this.xAxisGapInMillis * i))) - (fMeasureText / 2), this.mChartViewRectF.bottom + c(this, 15.0f), this.mTextPaint);
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final void f(Canvas canvas) {
        if (!this.mData.isEmpty()) {
            return;
        }
        float fMeasureText = this.noDataPaint.measureText(this.noDataText);
        RectF rectF = this.mChartViewRectF;
        float f = rectF.left;
        float fWidth = rectF.width() - fMeasureText;
        float f2 = 2;
        float f3 = f + (fWidth / f2);
        RectF rectF2 = this.mChartViewRectF;
        float fHeight = rectF2.top + (rectF2.height() / f2);
        float f4 = this.noDataPaint.getFontMetrics().top;
        float f5 = this.noDataPaint.getFontMetrics().bottom;
        canvas.drawText(this.noDataText, f3, fHeight, this.noDataPaint);
    }

    private final void g(Canvas canvas) {
        int size;
        Integer num;
        canvas.translate(0.0f, this.mChartViewRectF.top);
        float fHeight = this.mChartViewRectF.height();
        if (this.mData.isEmpty() || (size = this.mData.size() - 1) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int value = this.mData.get(i).getValue();
            if (value <= this.tagValue.get(1).intValue() && this.tagValue.get(0).intValue() <= value) {
                this.mLinePaint.setColor(this.lineColor[0]);
            } else {
                if (value <= this.tagValue.get(2).intValue() && this.tagValue.get(1).intValue() <= value) {
                    this.mLinePaint.setColor(this.lineColor[1]);
                } else {
                    if (value <= this.tagValue.get(3).intValue() && this.tagValue.get(2).intValue() <= value) {
                        this.mLinePaint.setColor(this.lineColor[2]);
                    } else {
                        this.mLinePaint.setColor(this.lineColor[3]);
                    }
                }
            }
            float fA = a(this.mData.get(i).getTime());
            float fB = b(i);
            Integer num2 = this.selectIndex;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                if (iIntValue >= this.mData.size()) {
                    this.selectIndex = Integer.valueOf(this.mData.size() - 1);
                }
                if (iIntValue < 0) {
                    this.selectIndex = 0;
                }
                if (this.showSelect && (num = this.selectIndex) != null && i == num.intValue() && this.showInteractiveLine) {
                    this.interactivePaint.setStrokeWidth(Math.min(this.lineWidth / 2, this.interactiveLineWidth));
                    canvas.drawLine(fA, this.mChartViewRectF.top, fA, fHeight, this.interactivePaint);
                }
            }
            if (this.mData.get(i).getValue() != 0) {
                float f = this.lineWidth;
                float f2 = 2;
                RectF rectF = new RectF(fA - (f / f2), fB, fA + (f / f2), fHeight);
                Path path = new Path();
                path.addRoundRect(rectF, getRadianValues(), Path.Direction.CW);
                canvas.drawPath(path, this.mLinePaint);
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final float[] getRadianValues() {
        return new float[]{90.0f, 90.0f, 90.0f, 90.0f, 90.0f, 90.0f, 90.0f, 90.0f};
    }

    private final Integer h(long selectTime) {
        Integer numValueOf = null;
        if (this.mData.isEmpty()) {
            return null;
        }
        long j = 600000;
        if (selectTime >= ((Stress) CollectionsKt.first((List) this.mData)).getTime() - j && selectTime <= ((Stress) CollectionsKt.last((List) this.mData)).getTime() + j) {
            long jAbs = Math.abs(this.mData.get(0).getTime() - selectTime);
            int size = this.mData.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    long jAbs2 = Math.abs(this.mData.get(i).getTime() - selectTime);
                    if ((0 <= jAbs2 && jAbs2 <= jAbs) && jAbs2 < 600000) {
                        numValueOf = Integer.valueOf(i);
                        jAbs = jAbs2;
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return numValueOf;
    }

    private final void i(float moveX) {
        if (this.mData.isEmpty()) {
            return;
        }
        Integer numH = h((long) ((((moveX - this.mChartViewRectF.left) / this.mItemWidth) * 60 * 1000) + (this.mData.get(0).getTime() - ((this.mData.get(0).getTime() + ((long) TimeZone.getDefault().getRawOffset())) % ((long) 86400000)))));
        this.selectIndex = numH;
        boolean z = numH != null;
        if (numH == null) {
            if (moveX == this.invalidX) {
                Stress stress = (Stress) CollectionsKt.lastOrNull((List) this.mData);
                if (stress != null) {
                    long j = (this.mFrequency * 60000) / 2;
                    long time = stress.getTime() - j;
                    long time2 = stress.getTime() + j;
                    HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
                    String str = healthDataTimeUtils.formatTimeYMDHHmm(time) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + healthDataTimeUtils.formatTimeHHmm(time2);
                    OnSelectChangeListener onSelectChangeListener = this.listener;
                    if (onSelectChangeListener != null) {
                        onSelectChangeListener.select(Float.valueOf(moveX), z, new ItemData(stress.getValue(), str));
                    }
                }
            } else {
                OnSelectChangeListener onSelectChangeListener2 = this.listener;
                if (onSelectChangeListener2 != null) {
                    onSelectChangeListener2.select(Float.valueOf(moveX), z, null);
                }
            }
        } else {
            Stress stress2 = (Stress) CollectionsKt.getOrNull(this.mData, numH.intValue());
            if (stress2 != null) {
                long j2 = (this.mFrequency * 60000) / 2;
                long time3 = stress2.getTime() - j2;
                long time4 = stress2.getTime() + j2;
                HealthDataTimeUtils healthDataTimeUtils2 = HealthDataTimeUtils.INSTANCE;
                String str2 = healthDataTimeUtils2.formatTimeYMDHHmm(time3) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + healthDataTimeUtils2.formatTimeHHmm(time4);
                OnSelectChangeListener onSelectChangeListener3 = this.listener;
                if (onSelectChangeListener3 != null) {
                    onSelectChangeListener3.select(Float.valueOf(moveX), z, new ItemData(stress2.getValue(), str2));
                }
            }
        }
        invalidate();
    }

    public static /* synthetic */ void updateData$default(StressAllDayLineChart stressAllDayLineChart, List list, Integer num, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            i = 5;
        }
        stressAllDayLineChart.updateData(list, num, i);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        e(canvas);
        d(canvas);
        if (this.mData.isEmpty()) {
            f(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.mTextPaint.setTextSize(this.axisTimeTextSize);
        float f = this.mTextPaint.getFontMetrics().bottom - this.mTextPaint.getFontMetrics().top;
        this.mTextPaint.setTextSize(this.axisValueTextSize);
        setMeasuredDimension(widthMeasureSpec, View.resolveSize((int) (((double) (getPaddingTop() + ((this.mTextPaint.getFontMetrics().bottom - this.mTextPaint.getFontMetrics().top) / 2) + getPaddingBottom())) + (((double) f) * 1.5d) + ((double) this.chartHeight)), heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.mTextPaint.setTextSize(this.axisValueTextSize);
        float fMeasureText = this.mTextPaint.measureText("100");
        float fMeasureText2 = this.mTextPaint.measureText((String) CollectionsKt.first((List) this.xAxisTextLabels));
        float f = (this.mTextPaint.getFontMetrics().bottom - this.mTextPaint.getFontMetrics().top) / 2;
        this.mChartViewRectF.set(getPaddingStart() + this.chartMarginStart + fMeasureText2, getPaddingTop() + f, ((w - getPaddingEnd()) - fMeasureText) - fMeasureText2, getPaddingTop() + f + this.chartHeight);
        float fWidth = this.mChartViewRectF.width() / this.itemNum;
        this.mItemWidth = fWidth;
        this.lineWidth = fWidth * this.mFrequency;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        ViewParent parent;
        Integer numValueOf = event == null ? null : Integer.valueOf(event.getAction());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.touchDownTime = System.currentTimeMillis();
            this.showInteractiveLine = true;
            i(event.getX());
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            if (System.currentTimeMillis() - this.touchDownTime >= 300 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.showInteractiveLine = true;
            i(event.getX());
        } else {
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                this.touchDownTime = 0L;
                this.showInteractiveLine = false;
                i(this.invalidX);
            }
        }
        return true;
    }

    public final void setOnSelectListener(@NotNull OnSelectChangeListener listener) {
        this.listener = listener;
    }

    public final void updateData(@NotNull List<Stress> data, @Nullable Integer index, int frequency) {
        this.mData = data;
        this.selectIndex = index;
        this.mFrequency = frequency;
        this.mPos = null;
        HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
        Stress stress = (Stress) CollectionsKt.firstOrNull((List) data);
        Long lValueOf = stress != null ? Long.valueOf(stress.getTime()) : null;
        this.dayStartTime = healthDataTimeUtils.getDayStartTime(lValueOf == null ? Calendar.getInstance().getTimeInMillis() : lValueOf.longValue());
        invalidate();
    }

    @JvmOverloads
    public StressAllDayLineChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.noDataText = "";
        this.xAxisTextLabels = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"00:00", "06:00", "12:00", "18:00", "23:59"});
        this.xAxisGapInMillis = 21600000;
        this.yAxisValues = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{100, 75, 50, 25, 0});
        this.tagValue = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 39, 59, 79});
        this.maxValue = 100;
        this.itemNum = 1440;
        Paint paint = new Paint();
        this.mTextPaint = paint;
        this.mLinePaint = new Paint();
        Paint paint2 = new Paint();
        this.mAxisPaint = paint2;
        Paint paint3 = new Paint();
        this.interactivePaint = paint3;
        Paint paint4 = new Paint();
        this.noDataPaint = paint4;
        this.mChartViewRectF = new RectF();
        this.mData = CollectionsKt__CollectionsKt.emptyList();
        this.invalidX = -1.0f;
        this.mFrequency = 5;
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.StressAllDayLineChart);
        this.axisTimeTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) ViewExKt.spToPx(this, 12.0f));
        this.axisTimeTextColor = typedArrayObtainStyledAttributes.getColor(3, -7829368);
        this.axisTimeMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.axisValueTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) ViewExKt.spToPx(this, 12.0f));
        this.axisValueTextColor = typedArrayObtainStyledAttributes.getColor(3, -7829368);
        this.chartMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.comfortableLineColor = typedArrayObtainStyledAttributes.getColor(9, -16777216);
        this.normalLineColor = typedArrayObtainStyledAttributes.getColor(18, -16777216);
        this.mediumLineColor = typedArrayObtainStyledAttributes.getColor(14, -16777216);
        this.highLineColor = typedArrayObtainStyledAttributes.getColor(10, -16777216);
        this.chartHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 400);
        this.axisLineWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.axisLineColor = typedArrayObtainStyledAttributes.getColor(5, -7829368);
        this.interactiveLineColor = typedArrayObtainStyledAttributes.getColor(11, -16777216);
        this.interactiveLineWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 1);
        this.showSelect = typedArrayObtainStyledAttributes.getBoolean(19, true);
        String string = typedArrayObtainStyledAttributes.getString(15);
        this.noDataText = string != null ? string : "";
        this.noDataTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, (int) ViewExKt.spToPx(this, 12.0f));
        this.noDataTextColor = typedArrayObtainStyledAttributes.getColor(16, -7829368);
        typedArrayObtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        this.mLinePaint.setAntiAlias(true);
        this.mLinePaint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(this.axisLineColor);
        paint2.setStrokeWidth(this.axisLineWidth);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(this.interactiveLineColor);
        paint4.setAntiAlias(true);
        paint4.setColor(this.noDataTextColor);
        paint4.setTextSize(this.noDataTextSize);
        this.point = new Point();
        this.nextPoint = new Point();
        this.selectPoint = new Point();
        this.lineColor = new int[]{this.comfortableLineColor, this.normalLineColor, this.mediumLineColor, this.highLineColor};
        this.rectColor = new int[]{ContextCompat.getColor(context, com.huami.watch.hmwatchmanager.R.color.stress_rect_bg_gray_f3), ContextCompat.getColor(context, com.huami.watch.hmwatchmanager.R.color.stress_rect_bg_gray_f4), ContextCompat.getColor(context, com.huami.watch.hmwatchmanager.R.color.stress_rect_bg_gray_f8), ContextCompat.getColor(context, com.huami.watch.hmwatchmanager.R.color.white100)};
    }
}
