package com.huami.chart.chart;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.animation.ChartAnimator;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.ChartDataManager;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.helper.HMChartHelperKt;
import com.huami.chart.util.ChartUtil;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0002\u00ad\u0001B\u001b\u0012\u0006\u0010C\u001a\u00020?\u0012\b\u0010ª\u0001\u001a\u00030©\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0016\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\u0016\u0010\u001a\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002JB\u0010-\u001a\u00020,2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010.\u001a\u00020\u0012H\u0002J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0002J\u0010\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0002J\u0010\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0012H\u0002J\u0010\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0012H\u0002J\u0010\u00107\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001c\u00108\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010;\u001a\u00020\u00022\u0006\u0010:\u001a\u000209H\u0007J\u0012\u0010>\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010<H\u0014R\u0019\u0010C\u001a\u00020?8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\bA\u0010BR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010P\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Y\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010K\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR\"\u0010\\\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010Q\u001a\u0004\bZ\u0010S\"\u0004\b[\u0010UR\"\u0010_\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010K\u001a\u0004\b]\u0010M\"\u0004\b^\u0010OR\"\u0010e\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR:\u0010m\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020g0f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010QR\u0016\u0010o\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010QR\u0016\u0010p\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010KR\u0016\u0010q\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010QR\u0016\u0010r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010QR\u001e\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010tR\u001e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010tR\u001c\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00120s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010tR\u0016\u0010z\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010yR\u0016\u0010{\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010yR\u0016\u0010~\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u0018\u0010\u0082\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010KR\u0018\u0010\u0084\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010KR(\u0010\u008a\u0001\u001a\u00020g8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b/\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u008b\u0001RD\u0010\u0095\u0001\u001a-\u0012\u0019\u0012\u0017\u0018\u00010\u008e\u0001¢\u0006\u000f\b\u008f\u0001\u0012\n\b\u0090\u0001\u0012\u0005\b\b(\u0091\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u008d\u0001j\u0005\u0018\u0001`\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R#\u0010\u009b\u0001\u001a\u00030\u0096\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R#\u0010 \u0001\u001a\u00030\u009c\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0098\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R#\u0010¥\u0001\u001a\u00030¡\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u0098\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R#\u0010¨\u0001\u001a\u00030¡\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0098\u0001\u001a\u0006\b§\u0001\u0010¤\u0001¨\u0006®\u0001"}, d2 = {"Lcom/huami/chart/chart/HMDynamicLineChart;", "Landroid/view/View;", "", "e", "Lcom/huami/chart/data/ChartDataList;", "chartDataList", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "xAxisDatas", "r", "o", "", "value", SOAP.XMLNS, "t", "newXAxisDatas", "setXAxisDatas", "", "", com.google.android.exoplayer2.text.ttml.b.r, DTransferConstants.SEARCH_KEY, "c", GoogleApiAvailabilityLight.a, "getDrawAreaStart", "getDrawAreaEnd", "indexList", "a", "Lcom/huami/chart/data/ChartData;", "chartData", "Lkotlin/Pair;", "f", "dataIndex", "m", "l", GoogleApiAvailabilityLight.b, "prevPosX", "prevPosY", "curPosX", "curPosY", "", "animatorDuration", "", "isGap", "data", "Lcom/huami/chart/chart/PathProperty;", "b", "getDataCount", "x", z.j, "y", hl.k, "index", "g", "positionIndex", "i", "h", Configs.Params.RESET, "Lcom/huami/chart/chart/DynamicChartData;", "dynamicChartData", "addData", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Lcom/huami/chart/chart/HMChart;", "Lcom/huami/chart/chart/HMChart;", "getHmChart", "()Lcom/huami/chart/chart/HMChart;", "hmChart", "Landroid/graphics/PathEffect;", "Landroid/graphics/PathEffect;", "getGapDashPathEffect", "()Landroid/graphics/PathEffect;", "setGapDashPathEffect", "(Landroid/graphics/PathEffect;)V", "gapDashPathEffect", LogUtil.I, "getDisconnectLineGap", "()I", "setDisconnectLineGap", "(I)V", "disconnectLineGap", "F", "getLineWidth", "()F", "setLineWidth", "(F)V", "lineWidth", "getLineColor", "setLineColor", "lineColor", "getPointRadius", "setPointRadius", "pointRadius", "getPointColor", "setPointColor", "pointColor", "Z", "getAutoScale", "()Z", "setAutoScale", "(Z)V", "autoScale", "Lkotlin/Function3;", "", "Lkotlin/jvm/functions/Function3;", "getBuildYAxisData", "()Lkotlin/jvm/functions/Function3;", "setBuildYAxisData", "(Lkotlin/jvm/functions/Function3;)V", "buildYAxisData", "lastPosX", "lastPosY", "lastIndex", "initMaxValue", "initMinValue", "", "Ljava/util/List;", "pathList", "animatorList", "baseIndexArray", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "addPath", "fragmentPath", "Landroid/graphics/PathMeasure;", "Landroid/graphics/PathMeasure;", "addPathPathMeasure", "u", "fragmentMeasure", "v", "start", "w", "end", "[F", "getMEndPointPos", "()[F", "setMEndPointPos", "([F)V", "mEndPointPos", "Lcom/huami/chart/chart/PathProperty;", "currentPathProperty", "Lkotlin/Function1;", "Landroid/animation/Animator;", "Lkotlin/ParameterName;", "name", "animator", "Lcom/huami/chart/chart/AnimatorEndListener;", "z", "Lkotlin/jvm/functions/Function1;", "animatorEndListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Lazy;", "getAnimatorUpdateListener", "()Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "animatorUpdateListener", "Landroid/animation/ValueAnimator;", "B", "getValueAnimator", "()Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/graphics/Paint;", "C", "getLinePaint", "()Landroid/graphics/Paint;", "linePaint", LogUtil.D, "getPointPaint", "pointPaint", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Lcom/huami/chart/chart/HMChart;Landroid/content/Context;)V", "Companion", "chart_release"}, k = 1, mv = {1, 5, 1})
public class HMDynamicLineChart extends View {

    @NotNull
    private static final String E = "HMDynamicLineChart";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy animatorUpdateListener;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy valueAnimator;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy linePaint;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy pointPaint;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMChart hmChart;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private PathEffect gapDashPathEffect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int disconnectLineGap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float lineWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int lineColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float pointRadius;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int pointColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean autoScale;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private Function3<? super Float, ? super Float, ? super Integer, float[]> buildYAxisData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float lastPosX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float lastPosY;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int lastIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float initMaxValue;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float initMinValue;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final List<PathProperty> pathList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final List<DynamicChartData> animatorList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> baseIndexArray;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private Path addPath;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private Path fragmentPath;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private PathMeasure addPathPathMeasure;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private PathMeasure fragmentMeasure;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int start;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int end;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private float[] mEndPointPos;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private PathProperty currentPathProperty;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Animator, Unit> animatorEndListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "animatorList size :" + HMDynamicLineChart.this.animatorList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ValueAnimator.AnimatorUpdateListener> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ float a;
            public final /* synthetic */ float b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(float f, float f2) {
                super(0);
                this.a = f;
                this.b = f2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "offset: " + this.a + " , end:" + this.b;
            }
        }

        public b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(HMDynamicLineChart hMDynamicLineChart, ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float length = hMDynamicLineChart.fragmentMeasure.getLength() * fFloatValue;
            HMLog.debug(HMDynamicLineChart.E, new a(fFloatValue, length));
            hMDynamicLineChart.addPath.reset();
            hMDynamicLineChart.fragmentMeasure.getSegment(0.0f, length, hMDynamicLineChart.addPath, true);
            hMDynamicLineChart.addPathPathMeasure.setPath(hMDynamicLineChart.addPath, false);
            hMDynamicLineChart.fragmentMeasure.getPosTan(hMDynamicLineChart.addPathPathMeasure.getLength(), hMDynamicLineChart.getMEndPointPos(), null);
            hMDynamicLineChart.postInvalidate();
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ValueAnimator.AnimatorUpdateListener invoke() {
            final HMDynamicLineChart hMDynamicLineChart = HMDynamicLineChart.this;
            return new ValueAnimator.AnimatorUpdateListener() { // from class: com.huami.chart.chart.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HMDynamicLineChart.b.c(hMDynamicLineChart, valueAnimator);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function3<Float, Float, Integer, float[]> {
        public static final c a = new c();

        public c() {
            super(3, HMChartHelperKt.class, "buildYAxis", "buildYAxis(FFI)[F", 1);
        }

        @NotNull
        public final float[] a(float f, float f2, int i) {
            return HMChartHelperKt.buildYAxis(f, f2, i);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ float[] invoke(Float f, Float f2, Integer num) {
            return a(f.floatValue(), f2.floatValue(), num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Paint> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint();
            HMDynamicLineChart hMDynamicLineChart = HMDynamicLineChart.this;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(hMDynamicLineChart.getLineWidth());
            paint.setColor(hMDynamicLineChart.getLineColor());
            return paint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Paint> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint();
            HMDynamicLineChart hMDynamicLineChart = HMDynamicLineChart.this;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(hMDynamicLineChart.getLineWidth());
            paint.setColor(hMDynamicLineChart.getPointColor());
            return paint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Configs.Params.RESET;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Animator, Unit> {
        public final /* synthetic */ ChartDataList b;
        public final /* synthetic */ SparseArray<XAxisData> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ChartDataList chartDataList, SparseArray<XAxisData> sparseArray) {
            super(1);
            this.b = chartDataList;
            this.c = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            invoke2(animator);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Animator animator) {
            HMDynamicLineChart.this.q(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/ValueAnimator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<ValueAnimator> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "animator", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Animator, Unit> {
            public final /* synthetic */ HMDynamicLineChart a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMDynamicLineChart hMDynamicLineChart) {
                super(1);
                this.a = hMDynamicLineChart;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
                invoke2(animator);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Animator animator) {
                ChartData data;
                this.a.pathList.add(this.a.currentPathProperty);
                PathProperty pathProperty = this.a.currentPathProperty;
                if (pathProperty != null && (data = pathProperty.getData()) != null) {
                    this.a.baseIndexArray.add(Integer.valueOf(data.getIndex()));
                }
                DynamicChartData dynamicChartData = (DynamicChartData) CollectionsKt.getOrNull(this.a.animatorList, 0);
                if (dynamicChartData == null) {
                    Function1 function1 = this.a.animatorEndListener;
                    if (function1 == null) {
                        return;
                    }
                    function1.invoke(animator);
                    return;
                }
                ChartData data2 = dynamicChartData.getData();
                long duration = dynamicChartData.getDuration();
                Pair pairF = this.a.f(data2);
                float fFloatValue = ((Number) pairF.component1()).floatValue();
                float fFloatValue2 = ((Number) pairF.component2()).floatValue();
                HMDynamicLineChart hMDynamicLineChart = this.a;
                PathProperty pathPropertyB = hMDynamicLineChart.b(hMDynamicLineChart.lastPosX, this.a.lastPosY, fFloatValue, fFloatValue2, duration, data2.getIndex() - this.a.lastIndex > this.a.getDisconnectLineGap(), data2);
                this.a.lastIndex = data2.getIndex();
                this.a.lastPosX = fFloatValue;
                this.a.lastPosY = fFloatValue2;
                this.a.animatorList.remove(dynamicChartData);
                this.a.currentPathProperty = pathPropertyB;
                this.a.fragmentMeasure.setPath(pathPropertyB.getPath(), false);
                this.a.getValueAnimator().setDuration(pathPropertyB.getAnimatorDuration());
                this.a.getValueAnimator().start();
            }
        }

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ValueAnimator invoke() {
            return new ChartAnimator(HMDynamicLineChart.this.getAnimatorUpdateListener(), new a(HMDynamicLineChart.this)).animate();
        }
    }

    public HMDynamicLineChart(@NotNull HMChart hMChart, @NotNull Context context) {
        super(context, null, 0);
        this.hmChart = hMChart;
        this.disconnectLineGap = Integer.MAX_VALUE;
        this.lineWidth = 5.0f;
        this.lineColor = -16777216;
        this.pointRadius = -1.0f;
        this.pointColor = -16777216;
        this.autoScale = true;
        this.buildYAxisData = c.a;
        this.lastIndex = -1;
        this.pathList = new ArrayList();
        this.animatorList = new ArrayList();
        this.baseIndexArray = new ArrayList();
        this.addPath = new Path();
        this.fragmentPath = new Path();
        this.addPathPathMeasure = new PathMeasure();
        this.fragmentMeasure = new PathMeasure();
        this.mEndPointPos = new float[2];
        this.animatorUpdateListener = LazyKt__LazyJVMKt.lazy(new b());
        this.valueAnimator = LazyKt__LazyJVMKt.lazy(new h());
        this.linePaint = LazyKt__LazyJVMKt.lazy(new d());
        this.pointPaint = LazyKt__LazyJVMKt.lazy(new e());
        o();
        e();
    }

    private final void a(List<Integer> indexList) {
        if (indexList.isEmpty()) {
            return;
        }
        if (indexList.size() == 1) {
            Pair<Float, Float> pairM = m(indexList.get(0).intValue());
            float fFloatValue = pairM.component1().floatValue();
            float fFloatValue2 = pairM.component2().floatValue();
            float[] fArr = this.mEndPointPos;
            fArr[0] = fFloatValue;
            fArr[1] = fFloatValue2;
            this.lastPosX = fArr[0];
            this.lastPosY = fArr[1];
            this.lastIndex = indexList.get(0).intValue();
            return;
        }
        int iIntValue = indexList.get(0).intValue();
        float fL = l(iIntValue);
        float fN = n(iIntValue);
        IntRange intRangeUntil = kotlin.ranges.e.until(1, indexList.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = indexList.get(((IntIterator) it2).nextInt()).intValue();
            float fL2 = l(iIntValue2);
            float fN2 = n(iIntValue2);
            this.pathList.add(b(fL, fN, fL2, fN2, 0L, iIntValue2 - iIntValue > getDisconnectLineGap(), null));
            this.lastIndex = iIntValue2;
            arrayList.add(Unit.INSTANCE);
            iIntValue = iIntValue2;
            fL = fL2;
            fN = fN2;
        }
        this.lastPosX = fL;
        this.lastPosY = fN;
        float[] fArr2 = this.mEndPointPos;
        fArr2[0] = fL;
        fArr2[1] = fN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathProperty b(float prevPosX, float prevPosY, float curPosX, float curPosY, long animatorDuration, boolean isGap, ChartData data) {
        float f2 = prevPosX + ((curPosX - prevPosX) / 2.0f);
        this.fragmentPath.reset();
        this.fragmentPath.moveTo(prevPosX, prevPosY);
        this.fragmentPath.cubicTo(f2, prevPosY, f2, curPosY, curPosX, curPosY);
        return new PathProperty(new Path(this.fragmentPath), animatorDuration, isGap ? this.gapDashPathEffect : null, data);
    }

    private final void c() {
        d();
        this.animatorList.clear();
        this.baseIndexArray.clear();
        float[] fArr = this.mEndPointPos;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
    }

    private final void d() {
        this.currentPathProperty = null;
        this.pathList.clear();
        this.fragmentPath.reset();
        this.addPath.reset();
        this.animatorEndListener = null;
    }

    private final void e() {
        ChartDataList chartDataList = this.hmChart.getChartDataManager().getChartDataList();
        this.initMaxValue = chartDataList.getMaxValue();
        this.initMinValue = chartDataList.getMinValue();
        this.baseIndexArray.addAll(p(chartDataList));
        a(this.baseIndexArray);
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Float, Float> f(ChartData chartData) {
        s(chartData.getSumValue());
        return m(chartData.getIndex());
    }

    private final float g(int index) {
        return this.hmChart.getHmDataCacheCenter().getPositionByPosIndex(index) * this.hmChart.getInteractiveManager().getScaleFactorX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener getAnimatorUpdateListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.animatorUpdateListener.getValue();
    }

    private final int getDataCount() {
        return this.hmChart.getChartDataManager().getChartDataList().getCount();
    }

    private final float getDrawAreaEnd() {
        return ChartUtil.isRtl(this.hmChart) ? this.hmChart.getDrawAreaManager().getLeft() : this.hmChart.getDrawAreaManager().getRight();
    }

    private final float getDrawAreaStart() {
        return ChartUtil.isRtl(this.hmChart) ? this.hmChart.getDrawAreaManager().getRight() : this.hmChart.getDrawAreaManager().getLeft();
    }

    private final Paint getLinePaint() {
        return (Paint) this.linePaint.getValue();
    }

    private final Paint getPointPaint() {
        return (Paint) this.pointPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator getValueAnimator() {
        return (ValueAnimator) this.valueAnimator.getValue();
    }

    private final float h(float value) {
        return (this.hmChart.getDrawAreaManager().getHeight() - ((this.hmChart.getHmDataCacheCenter().getPositionByValue(value) * this.hmChart.getInteractiveManager().getScaleFactorY()) * this.hmChart.getInteractiveManager().getCurrentScale())) + ((this.hmChart.getInteractiveManager().getCurrentScale() - 1) * this.hmChart.getDrawAreaManager().getMarginBottom());
    }

    private final float i(int positionIndex) {
        ChartData dataByPositionIndex = this.hmChart.getChartDataManager().getDataByPositionIndex(positionIndex);
        if (dataByPositionIndex == null) {
            return 0.0f;
        }
        return h(dataByPositionIndex.getSumValue());
    }

    private final float j(float x) {
        return x - this.hmChart.getInteractiveManager().getxOffset();
    }

    private final float k(float y) {
        return y;
    }

    private final float l(int dataIndex) {
        return j(g(dataIndex));
    }

    private final Pair<Float, Float> m(int dataIndex) {
        return new Pair<>(Float.valueOf(l(dataIndex)), Float.valueOf(n(dataIndex)));
    }

    private final float n(int dataIndex) {
        return k(i(dataIndex));
    }

    private final void o() {
        int start = this.hmChart.getHmDataCacheCenter().getIndexByPosition((this.hmChart.getInteractiveManager().getxOffset() + getDrawAreaStart()) / this.hmChart.getInteractiveManager().getScaleFactorX(), 0.0f).getPosiIndex().getStart();
        this.start = start;
        int i = start - 1;
        this.start = i;
        if (i < 0) {
            i = 0;
        }
        this.start = i;
        int start2 = this.hmChart.getHmDataCacheCenter().getIndexByPosition((this.hmChart.getInteractiveManager().getxOffset() + getDrawAreaEnd()) / this.hmChart.getInteractiveManager().getScaleFactorX(), 0.0f).getPosiIndex().getStart();
        this.end = start2;
        int i2 = start2 + 1;
        this.end = i2;
        this.end = Math.max(i2, this.hmChart.getChartDataManager().getChartDataList().getEnd());
    }

    private final List<Integer> p(ChartDataList chartDataList) {
        ArrayList arrayList = new ArrayList();
        IntRange intRangeUntil = kotlin.ranges.e.until(0, chartDataList.getCount());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            ChartData dataByDataIndex = getHmChart().getChartDataManager().getChartDataList().getDataByDataIndex(((IntIterator) it2).nextInt());
            arrayList2.add(dataByDataIndex == null ? null : Boolean.valueOf(arrayList.add(Integer.valueOf(dataByDataIndex.getIndex()))));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(ChartDataList chartDataList, SparseArray<XAxisData> xAxisDatas) {
        if (this.animatorList.size() != 0 || getValueAnimator().isRunning()) {
            return;
        }
        c();
        r(chartDataList, xAxisDatas);
    }

    private final void r(ChartDataList chartDataList, SparseArray<XAxisData> xAxisDatas) {
        this.hmChart.getChartDataManager().setChartDataList(chartDataList);
        this.initMaxValue = chartDataList.getMaxValue();
        this.initMinValue = chartDataList.getMinValue();
        this.hmChart.getInteractiveManager().setCurrentScale(1.0f);
        setXAxisDatas(xAxisDatas);
        t();
        this.baseIndexArray.addAll(p(chartDataList));
        this.hmChart.getHmDataCacheCenter().calculate();
        a(this.baseIndexArray);
        this.hmChart.postInvalidate();
        postInvalidate();
    }

    private final void s(float value) {
        if (this.autoScale) {
            ChartDataManager chartDataManager = this.hmChart.getChartDataManager();
            float roundUpTen = HMChartHelperKt.getRoundUpTen(value);
            float roundDownTen = HMChartHelperKt.getRoundDownTen(value);
            if (roundUpTen > chartDataManager.getChartDataList().getMaxValue()) {
                chartDataManager.getChartDataList().setMaxValue(roundUpTen);
                this.hmChart.getHmDataCacheCenter().calculate();
            } else {
                if (roundDownTen >= chartDataManager.getChartDataList().getMinValue()) {
                    return;
                }
                chartDataManager.getChartDataList().setMinValue(roundDownTen);
                this.hmChart.getHmDataCacheCenter().calculate();
            }
            d();
            a(this.baseIndexArray);
            t();
            this.hmChart.postInvalidate();
            postInvalidate();
        }
    }

    private final void setXAxisDatas(SparseArray<XAxisData> newXAxisDatas) {
        SparseArray<XAxisData> sparseArray = this.hmChart.getRenderConfigManager().getRenderConfig().getAxisStyle().getxAxisDatas();
        int size = newXAxisDatas.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(newXAxisDatas.keyAt(i), newXAxisDatas.valueAt(i));
        }
    }

    private final void t() {
        ChartDataManager chartDataManager = this.hmChart.getChartDataManager();
        float maxValue = chartDataManager.getChartDataList().getMaxValue();
        float[] fArrInvoke = this.buildYAxisData.invoke(Float.valueOf(chartDataManager.getChartDataList().getMinValue()), Float.valueOf(maxValue), 2);
        SparseArray<YAxisData> sparseArray = getHmChart().getRenderConfigManager().getRenderConfig().getAxisStyle().getyAxisDatas();
        ArrayList arrayList = new ArrayList(fArrInvoke.length);
        int length = fArrInvoke.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f2 = fArrInvoke[i];
            sparseArray.put(i2, new YAxisData(f2, String.valueOf((int) f2)));
            arrayList.add(Unit.INSTANCE);
            i++;
            i2++;
        }
    }

    @MainThread
    public final void addData(@NotNull DynamicChartData dynamicChartData) {
        ChartData data = dynamicChartData.getData();
        long duration = dynamicChartData.getDuration();
        this.hmChart.getChartDataManager().getChartDataList().addData(data);
        if (getDataCount() == 0) {
            return;
        }
        if (getDataCount() == 1) {
            Pair<Float, Float> pairF = f(data);
            float fFloatValue = pairF.component1().floatValue();
            float fFloatValue2 = pairF.component2().floatValue();
            int index = data.getIndex();
            float[] fArr = this.mEndPointPos;
            fArr[0] = fFloatValue;
            fArr[1] = fFloatValue2;
            this.lastPosX = fFloatValue;
            this.lastPosY = fFloatValue2;
            this.lastIndex = index;
            this.baseIndexArray.add(Integer.valueOf(index));
            postInvalidate();
            return;
        }
        if (getValueAnimator().isRunning()) {
            this.animatorList.add(dynamicChartData);
            HMLog.debug(E, new a());
            return;
        }
        Pair<Float, Float> pairF2 = f(data);
        float fFloatValue3 = pairF2.component1().floatValue();
        float fFloatValue4 = pairF2.component2().floatValue();
        PathProperty pathPropertyB = b(this.lastPosX, this.lastPosY, fFloatValue3, fFloatValue4, duration, data.getIndex() - this.lastIndex > this.disconnectLineGap, data);
        this.lastIndex = data.getIndex();
        this.lastPosX = fFloatValue3;
        this.lastPosY = fFloatValue4;
        this.currentPathProperty = pathPropertyB;
        this.fragmentMeasure.setPath(pathPropertyB.getPath(), false);
        getValueAnimator().setDuration(duration);
        getValueAnimator().start();
    }

    public final boolean getAutoScale() {
        return this.autoScale;
    }

    @NotNull
    public final Function3<Float, Float, Integer, float[]> getBuildYAxisData() {
        return this.buildYAxisData;
    }

    public final int getDisconnectLineGap() {
        return this.disconnectLineGap;
    }

    @Nullable
    public final PathEffect getGapDashPathEffect() {
        return this.gapDashPathEffect;
    }

    @NotNull
    public final HMChart getHmChart() {
        return this.hmChart;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    @NotNull
    public final float[] getMEndPointPos() {
        return this.mEndPointPos;
    }

    public final int getPointColor() {
        return this.pointColor;
    }

    public final float getPointRadius() {
        return this.pointRadius;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null || getDataCount() <= 0) {
            return;
        }
        List<PathProperty> list = this.pathList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (PathProperty pathProperty : list) {
            if (pathProperty != null) {
                getLinePaint().setPathEffect(pathProperty.getEffect());
                canvas.drawPath(pathProperty.getPath(), getLinePaint());
            }
            arrayList.add(Unit.INSTANCE);
        }
        Paint linePaint = getLinePaint();
        PathProperty pathProperty2 = this.currentPathProperty;
        linePaint.setPathEffect(pathProperty2 == null ? null : pathProperty2.getEffect());
        canvas.drawPath(this.addPath, getLinePaint());
        float f2 = this.pointRadius;
        if (f2 > 0.0f) {
            float[] fArr = this.mEndPointPos;
            canvas.drawCircle(fArr[0], fArr[1], f2, getPointPaint());
        }
    }

    public final void reset(@NotNull ChartDataList chartDataList, @NotNull SparseArray<XAxisData> xAxisDatas) {
        HMLog.debug(E, f.a);
        if (getValueAnimator().isRunning()) {
            this.animatorEndListener = new g(chartDataList, xAxisDatas);
        } else {
            q(chartDataList, xAxisDatas);
        }
    }

    public final void setAutoScale(boolean z) {
        this.autoScale = z;
    }

    public final void setBuildYAxisData(@NotNull Function3<? super Float, ? super Float, ? super Integer, float[]> function3) {
        this.buildYAxisData = function3;
    }

    public final void setDisconnectLineGap(int i) {
        this.disconnectLineGap = i;
    }

    public final void setGapDashPathEffect(@Nullable PathEffect pathEffect) {
        this.gapDashPathEffect = pathEffect;
    }

    public final void setLineColor(int i) {
        this.lineColor = i;
    }

    public final void setLineWidth(float f2) {
        this.lineWidth = f2;
    }

    public final void setMEndPointPos(@NotNull float[] fArr) {
        this.mEndPointPos = fArr;
    }

    public final void setPointColor(int i) {
        this.pointColor = i;
    }

    public final void setPointRadius(float f2) {
        this.pointRadius = f2;
    }
}
