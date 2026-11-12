package com.xiaomi.fitness.chart.render;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.chart.entrys.model.SleepLandChart;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.aji;
import defpackage.ez5;
import defpackage.gv5;
import defpackage.npm;
import defpackage.o8p;
import defpackage.onq;
import defpackage.qim;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bv\u0010wJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J]\u0010!\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010$\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J3\u0010*\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\n\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b*\u0010+J)\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b.\u0010/J7\u00103\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001bH\u0002¢\u0006\u0004\b7\u00108JA\u0010=\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u00101\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u001bH\u0002¢\u0006\u0004\b=\u0010>J7\u0010B\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u001b¢\u0006\u0004\bE\u0010FJ\u0015\u0010I\u001a\u00020\u00022\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u001d\u0010K\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bK\u0010\u000eJ/\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010,2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010L\u001a\u00020\u001f¢\u0006\u0004\bM\u0010NJ%\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010,2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bM\u0010OJ\u001d\u0010P\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bP\u0010\u000eJ\u0015\u0010R\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u001d¢\u0006\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010XR\u0016\u0010Z\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010XR\u0016\u0010[\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010XR\u0016\u0010\\\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010XR\u0016\u0010]\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010XR\u0016\u0010^\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010XR\u0016\u0010_\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010XR\u0016\u0010`\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0016\u0010g\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0016\u0010h\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010eR\u0016\u0010i\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010eR\u0016\u0010j\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010cR\u0018\u0010k\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR(\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010e¨\u0006x"}, d2 = {"Lcom/xiaomi/fitness/chart/render/SleepChartRender;", "", "", "initLinePaint", "()V", "initTextPaint", "initBarChartPaint", "initLineRenderPaint", "initHighLightPaint", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "drawVerticalLines", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V", "drawHorizontalDashLines", "Landroid/graphics/Path;", "path", "pathBottom", "createLineRecent", "(Landroid/graphics/Path;Landroid/graphics/Path;)V", "", "Lcom/xiaomi/fitness/chart/entrys/model/SleepLandChart;", "sleepLandTopChartData", "sleepLandBottomChartData", "Lnpm;", "sleepTime", "", "itemRealHeight", "", "lastColor", "", "sideRect", "drawRecentPath", "(Ljava/util/List;Ljava/util/List;Landroid/graphics/Canvas;Lnpm;FILandroidx/recyclerview/widget/RecyclerView;Z)V", "sleepLandChartData", "bottom", "createLinePath", "(Landroid/graphics/Path;Ljava/util/List;ZFZ)V", "Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;", "longestSleepEntry", "latestSleepEntry", "drawXAxisLabel", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;Landroid/graphics/Canvas;Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;)V", "", "", "getXAxisLabel", "(Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;)Ljava/util/List;", "sleepItemTime", StatConstants.PARAM_START, StatConstants.PARAM_END, "drawSleepChartItem", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lnpm;FF)V", "sleepHeightIndex", "parentBottom", "getSleepRectBottom", "(IF)F", "Landroid/graphics/Paint;", "paint", TSMAuthContants.PARAM_KEY_RIGHT, "top", "drawRectF", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V", "valueStr", "childCenter", "selectItemTop", "drawHighLightRect", "(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroidx/recyclerview/widget/RecyclerView;)V", "value", "setItemHeightOffset", "(F)V", "Lonq;", "highLightValueFormatter", "setHighLightValueFormatter", "(Lonq;)V", "drawLines", "drawLabel", "drawSleepChart", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Z)Ljava/util/List;", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)Ljava/util/List;", "drawHighLight", MediaStoreUtil.MediaInfo.SIZE, "updateStageSize", "(I)V", "Lqim;", "mChartAttrs", "Lqim;", "mBarChartPaint", "Landroid/graphics/Paint;", "mTextPaint", "mLineRenderPaint", "mHighLightValueBigPaint", "mHighLightDescPaint", "mHighLightDescValuePaint", "mLinePaint", "mHighLightLinePaint", "mHighLightValueFormatter", "Lonq;", "mSleepStageSize", "I", "sleepPathTopPointX", "F", "sleepPathTopPointY", "sleepPathBottomPointX", "sleepPathBottomPointY", "sleepItemHeightOffset", "lastSleepType", "lastSleepItem", "Lnpm;", "sleepItemStatus", "Ljava/util/List;", "getSleepItemStatus", "()Ljava/util/List;", "setSleepItemStatus", "(Ljava/util/List;)V", "sleepStatusShowAll", "Z", "sleepHeight", "<init>", "(Lqim;Lonq;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class SleepChartRender {

    @Nullable
    private npm lastSleepItem;
    private int lastSleepType;
    private Paint mBarChartPaint;

    @NotNull
    private final qim mChartAttrs;
    private Paint mHighLightDescPaint;
    private Paint mHighLightDescValuePaint;
    private Paint mHighLightLinePaint;
    private Paint mHighLightValueBigPaint;

    @NotNull
    private onq mHighLightValueFormatter;
    private Paint mLinePaint;
    private Paint mLineRenderPaint;
    private int mSleepStageSize;
    private Paint mTextPaint;
    private float sleepHeight;
    private float sleepItemHeightOffset;

    @NotNull
    private List<Boolean> sleepItemStatus;
    private float sleepPathBottomPointX;
    private float sleepPathBottomPointY;
    private float sleepPathTopPointX;
    private float sleepPathTopPointY;
    private boolean sleepStatusShowAll;

    public SleepChartRender(@NotNull qim mChartAttrs, @NotNull onq highLightValueFormatter) {
        Intrinsics.checkNotNullParameter(mChartAttrs, "mChartAttrs");
        Intrinsics.checkNotNullParameter(highLightValueFormatter, "highLightValueFormatter");
        this.mChartAttrs = mChartAttrs;
        this.mSleepStageSize = 4;
        this.lastSleepType = -1;
        Boolean bool = Boolean.TRUE;
        this.sleepItemStatus = CollectionsKt__CollectionsKt.mutableListOf(bool, bool, bool, bool, bool);
        this.sleepStatusShowAll = true;
        initBarChartPaint();
        initTextPaint();
        initLinePaint();
        initHighLightPaint();
        initLineRenderPaint();
        this.mHighLightValueFormatter = highLightValueFormatter;
    }

    private final void createLinePath(Path path, List<SleepLandChart> sleepLandChartData, boolean bottom, float itemRealHeight, boolean sideRect) {
        float f;
        float f2 = 6.0f;
        if (bottom) {
            f = 0.0f;
        } else {
            f = 6.0f;
            f2 = 0.0f;
        }
        int size = sleepLandChartData.size();
        for (int i = 0; i < size; i++) {
            SleepLandChart sleepLandChart = sleepLandChartData.get(i);
            if (i == 0) {
                if (sideRect) {
                    float width = sleepLandChart.getWidth() < 30.0f ? sleepLandChart.getWidth() : 30.0f;
                    if (bottom) {
                        path.moveTo(sleepLandChart.getEndPointX(), sleepLandChart.getEndPointY() - width);
                        path.arcTo(new RectF(sleepLandChart.getEndPointX() - width, sleepLandChart.getEndPointY() - width, sleepLandChart.getEndPointX(), sleepLandChart.getEndPointY()), 0.0f, 90.0f);
                    } else {
                        path.moveTo(sleepLandChart.getEndPointX(), sleepLandChart.getEndPointY() + width);
                        path.arcTo(new RectF(sleepLandChart.getEndPointX() - width, sleepLandChart.getEndPointY(), sleepLandChart.getEndPointX(), sleepLandChart.getEndPointY() + width), 0.0f, -90.0f);
                    }
                } else {
                    float f3 = this.sleepPathTopPointX;
                    if (f3 == 0.0f) {
                        path.moveTo(sleepLandChart.getEndPointX(), sleepLandChart.getEndPointY());
                    } else if (!bottom) {
                        path.moveTo(f3, this.sleepPathTopPointY);
                    } else if (sleepLandChart.getWidth() > 10.0f) {
                        path.moveTo(this.sleepPathBottomPointX + 1.0f, this.sleepPathBottomPointY);
                    } else {
                        path.moveTo(this.sleepPathBottomPointX, this.sleepPathBottomPointY);
                    }
                }
            }
            if (sleepLandChart.getArcAngleEnable()) {
                if (sleepLandChart.getStartPointY() < sleepLandChart.getEndPointY()) {
                    float lastWidth = sleepLandChart.getLastWidth() < 30.0f ? sleepLandChart.getLastWidth() : 30.0f;
                    if (sleepLandChart.getWidth() < 10.0f || sleepLandChart.getLastWidth() < 10.0f) {
                        f2 = 0.0f;
                    }
                    path.arcTo(new RectF(sleepLandChart.getStartPointX() + f2, sleepLandChart.getStartPointY(), sleepLandChart.getStartPointX() + lastWidth + f2, sleepLandChart.getStartPointY() + lastWidth), -90.0f, -90.0f);
                    float width2 = sleepLandChart.getWidth() < 30.0f ? sleepLandChart.getWidth() : 30.0f;
                    path.lineTo(sleepLandChart.getEndPointX() + f2, sleepLandChart.getEndPointY() - width2);
                    path.arcTo(new RectF((sleepLandChart.getEndPointX() - width2) + f2, sleepLandChart.getEndPointY() - width2, sleepLandChart.getEndPointX() + f2, sleepLandChart.getEndPointY()), 0.0f, 90.0f);
                    if (!bottom) {
                        path.lineTo(sleepLandChart.getEndPointX() - (width2 / 2), sleepLandChart.getEndPointY());
                    }
                } else {
                    float lastWidth2 = sleepLandChart.getLastWidth() < 30.0f ? sleepLandChart.getLastWidth() : 30.0f;
                    if (sleepLandChart.getWidth() < 10.0f || sleepLandChart.getLastWidth() < 10.0f) {
                        f = 0.0f;
                    }
                    path.arcTo(new RectF(sleepLandChart.getStartPointX() + f, sleepLandChart.getStartPointY() - lastWidth2, sleepLandChart.getStartPointX() + lastWidth2 + f, sleepLandChart.getStartPointY()), 90.0f, 90.0f);
                    float width3 = sleepLandChart.getWidth() < 30.0f ? sleepLandChart.getWidth() : 30.0f;
                    path.lineTo(sleepLandChart.getEndPointX() + f, sleepLandChart.getEndPointY() + width3);
                    path.arcTo(new RectF((sleepLandChart.getEndPointX() - width3) + f, sleepLandChart.getEndPointY(), sleepLandChart.getEndPointX() + f, sleepLandChart.getEndPointY() + width3), 0.0f, -90.0f);
                    if (bottom) {
                        path.lineTo(sleepLandChart.getEndPointX() - (width3 / 2), sleepLandChart.getEndPointY());
                    }
                }
            } else if (sleepLandChartData.size() == 1) {
                float width4 = sleepLandChart.getWidth() < 30.0f ? sleepLandChart.getWidth() : 30.0f;
                if (bottom) {
                    path.arcTo(new RectF(sleepLandChart.getStartPointX(), sleepLandChart.getStartPointY() - width4, sleepLandChart.getStartPointX() + width4, sleepLandChart.getStartPointY()), 90.0f, 90.0f);
                } else {
                    path.arcTo(new RectF(sleepLandChart.getStartPointX(), sleepLandChart.getStartPointY(), sleepLandChart.getStartPointX() + width4, sleepLandChart.getStartPointY() + width4), -90.0f, -90.0f);
                }
            }
        }
    }

    public static /* synthetic */ void createLinePath$default(SleepChartRender sleepChartRender, Path path, List list, boolean z, float f, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        sleepChartRender.createLinePath(path, list, z, f, z2);
    }

    private final void createLineRecent(Path path, Path pathBottom) {
        ArrayList arrayList = new ArrayList();
        PathMeasure pathMeasure = new PathMeasure(pathBottom, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        float[] fArr2 = new float[2];
        pathMeasure2.getPosTan(pathMeasure2.getLength(), fArr2, null);
        this.sleepPathTopPointX = fArr2[0];
        this.sleepPathTopPointY = fArr2[1];
        int i = (int) length;
        int i2 = (int) 1.0f;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i2 + ".");
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, i, i2);
        if (progressionLastElement >= 0) {
            int i3 = 0;
            while (true) {
                pathMeasure.getPosTan(i3, fArr, null);
                arrayList.add(new PointF(fArr[0], fArr[1]));
                if (i3 == progressionLastElement) {
                    break;
                } else {
                    i3 += i2;
                }
            }
        }
        for (int size = arrayList.size() - 1; size > 0; size--) {
            path.lineTo(((PointF) arrayList.get(size)).x, ((PointF) arrayList.get(size)).y);
        }
        this.sleepPathBottomPointX = ((PointF) CollectionsKt___CollectionsKt.last((List) arrayList)).x;
        this.sleepPathBottomPointY = ((PointF) CollectionsKt___CollectionsKt.last((List) arrayList)).y;
        path.close();
    }

    private final void drawHighLightRect(Canvas canvas, String valueStr, float childCenter, float selectItemTop, RecyclerView parent) {
        String str;
        float height = (parent.getHeight() - parent.getPaddingBottom()) - this.mChartAttrs.f625a;
        float width = parent.getWidth() - parent.getPaddingRight();
        float paddingLeft = parent.getPaddingLeft();
        float fAbs = Math.abs(childCenter - paddingLeft);
        float fAbs2 = Math.abs(width - childCenter);
        int iDip2px = DisplayUtil.dip2px(16.0f);
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) valueStr, new String[]{gv5.CONNECT_VALUE_STR}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty() || listSplit$default.size() < 2) {
            return;
        }
        String str2 = (String) listSplit$default.get(0);
        String str3 = (String) listSplit$default.get(1);
        List<String> listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{gv5.CONNECT_STR}, false, 0, 6, (Object) null);
        boolean z = true;
        float fMeasureText = 0.0f;
        for (String str4 : listSplit$default2) {
            if (!Intrinsics.areEqual(str4, "")) {
                if (z) {
                    Paint paint = this.mHighLightDescValuePaint;
                    if (paint == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescValuePaint");
                        paint = null;
                    }
                    fMeasureText += paint.measureText(str4);
                    z = false;
                } else {
                    Paint paint2 = this.mHighLightValueBigPaint;
                    if (paint2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHighLightValueBigPaint");
                        paint2 = null;
                    }
                    fMeasureText += paint2.measureText(str4);
                    z = true;
                }
            }
        }
        Paint paint3 = this.mHighLightDescPaint;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescPaint");
            paint3 = null;
        }
        float f = iDip2px;
        float fMax = Math.max(fMeasureText, paint3.measureText(str3)) + f + f;
        float f2 = fMax / 2.0f;
        int iDip2px2 = DisplayUtil.dip2px(60.0f);
        float paddingTop = parent.getPaddingTop() - ez5.a(30);
        float f3 = paddingTop - iDip2px2;
        RectF rectF = new RectF();
        Paint paint4 = this.mBarChartPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
            paint4 = null;
        }
        paint4.setColor(x44.a(aji.x));
        float f4 = this.mChartAttrs.e;
        if (fAbs <= f2) {
            rectF.set(paddingLeft, f3, fMax + paddingLeft, paddingTop);
        } else if (fAbs2 <= f2) {
            rectF.set(width - fMax, f3, width, paddingTop);
        } else {
            rectF.set(childCenter - f2, f3, childCenter + f2, paddingTop);
        }
        Paint paint5 = this.mBarChartPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
            paint5 = null;
        }
        canvas.drawRoundRect(rectF, f4, f4, paint5);
        Paint paint6 = this.mHighLightValueBigPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightValueBigPaint");
            paint6 = null;
        }
        Paint.Align align = Paint.Align.LEFT;
        paint6.setTextAlign(align);
        Paint paint7 = this.mHighLightDescPaint;
        if (paint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescPaint");
            paint7 = null;
        }
        paint7.setTextAlign(align);
        float f5 = 8;
        float fDip2px = (rectF.bottom - DisplayUtil.dip2px(8.0f)) - f5;
        Paint paint8 = this.mHighLightDescPaint;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescPaint");
            paint8 = null;
        }
        float fI = (fDip2px - o8p.i(paint8)) - f5;
        Iterator it = listSplit$default2.iterator();
        float fMeasureText2 = 0.0f;
        loop1: while (true) {
            boolean z2 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop1;
                }
                str = (String) it.next();
                if (!Intrinsics.areEqual(str, "")) {
                    if (z2) {
                        float f6 = rectF.left + f + fMeasureText2;
                        Paint paint9 = this.mHighLightDescValuePaint;
                        if (paint9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescValuePaint");
                            paint9 = null;
                        }
                        canvas.drawText(str, f6, fI, paint9);
                        Paint paint10 = this.mHighLightDescValuePaint;
                        if (paint10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescValuePaint");
                            paint10 = null;
                        }
                        fMeasureText2 += paint10.measureText(str);
                        z2 = false;
                    }
                }
            }
            float f7 = rectF.left + f + fMeasureText2;
            Paint paint11 = this.mHighLightValueBigPaint;
            if (paint11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHighLightValueBigPaint");
                paint11 = null;
            }
            canvas.drawText(str, f7, fI, paint11);
            Paint paint12 = this.mHighLightValueBigPaint;
            if (paint12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHighLightValueBigPaint");
                paint12 = null;
            }
            fMeasureText2 += paint12.measureText(str);
        }
        float f8 = rectF.left + f;
        Paint paint13 = this.mHighLightDescPaint;
        if (paint13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescPaint");
            paint13 = null;
        }
        canvas.drawText(str3, f8, fDip2px, paint13);
        float[] fArr = {childCenter, height, childCenter, paddingTop};
        Paint paint14 = this.mHighLightLinePaint;
        if (paint14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightLinePaint");
            paint14 = null;
        }
        canvas.drawLines(fArr, paint14);
    }

    private final void drawHorizontalDashLines(Canvas canvas, RecyclerView parent) {
        int i = 0;
        float height = (parent.getHeight() - parent.getPaddingBottom()) - this.mChartAttrs.f625a;
        int paddingTop = parent.getPaddingTop();
        int paddingLeft = parent.getPaddingLeft();
        int right = parent.getRight() - parent.getPaddingRight();
        float f = (height - paddingTop) / this.mSleepStageSize;
        Paint paint = this.mLinePaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
            paint = null;
        }
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        paint.setPathEffect(new DashPathEffect(new float[]{displayUtil.dip2pxF(4.0f), displayUtil.dip2pxF(1.5f)}, 0.0f));
        int i2 = this.mSleepStageSize;
        if (i2 < 0) {
            return;
        }
        while (true) {
            float f2 = height - (i * f);
            Path path = new Path();
            path.moveTo(paddingLeft, f2);
            path.lineTo(right, f2);
            Paint paint2 = this.mLinePaint;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
                paint2 = null;
            }
            canvas.drawPath(path, paint2);
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawRecentPath(List<SleepLandChart> sleepLandTopChartData, List<SleepLandChart> sleepLandBottomChartData, Canvas canvas, npm sleepTime, float itemRealHeight, int lastColor, RecyclerView parent, boolean sideRect) {
        int color;
        Paint paint;
        Path path = new Path();
        Path path2 = new Path();
        if ((!sleepLandTopChartData.isEmpty()) && (!sleepLandBottomChartData.isEmpty())) {
            createLinePath(path, sleepLandTopChartData, false, itemRealHeight, sideRect);
            createLinePath(path2, sleepLandBottomChartData, true, itemRealHeight, sideRect);
            SleepLandChart sleepLandChart = (SleepLandChart) CollectionsKt___CollectionsKt.last((List) sleepLandBottomChartData);
            SleepLandChart sleepLandChart2 = (SleepLandChart) CollectionsKt___CollectionsKt.last((List) sleepLandTopChartData);
            createLineRecent(path, path2);
            path.close();
            int iA = this.sleepStatusShowAll ? sleepTime.a(this.mChartAttrs) : AppUtil.getApp().getColor(aji.U);
            float endPointY = sleepLandChart.getEndPointY() < sleepLandChart.getStartPointY() ? sleepLandChart2.getEndPointY() : sleepLandChart2.getStartPointY();
            float startPointY = sleepLandChart.getEndPointY() < sleepLandChart.getStartPointY() ? sleepLandChart.getStartPointY() : sleepLandChart.getEndPointY();
            float fAbs = Math.abs(startPointY - endPointY);
            float f = itemRealHeight / fAbs;
            float[] fArr = {0.0f, f, ((sleepLandChart.getEndPointY() < sleepLandChart.getStartPointY() ? Math.abs(sleepLandChart2.getStartPointY() - sleepLandChart.getEndPointY()) : Math.abs(sleepLandChart.getStartPointY() - sleepLandChart2.getEndPointY())) / fAbs) + f, 1.0f};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, startPointY, 0.0f, endPointY, new int[]{lastColor, lastColor, iA, iA}, fArr, tileMode);
            if (sleepLandChart.getEndPointY() > sleepLandChart.getStartPointY()) {
                linearGradient = new LinearGradient(0.0f, endPointY, 0.0f, startPointY, new int[]{lastColor, lastColor, iA, iA}, fArr, tileMode);
            }
            Paint paint2 = this.mLineRenderPaint;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLineRenderPaint");
                paint2 = null;
            }
            paint2.setShader(linearGradient);
            if (AppUtil.isRTLDirection()) {
                Matrix matrix = new Matrix();
                matrix.setScale(-1.0f, 1.0f, parent.getWidth() / 2, parent.getHeight() / 2);
                path.transform(matrix);
            }
            Paint paint3 = this.mLineRenderPaint;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLineRenderPaint");
                paint3 = null;
            }
            canvas.drawPath(path, paint3);
            int size = this.sleepItemStatus.size();
            int i = this.lastSleepType;
            if (i >= 0 && i < size && this.sleepItemStatus.get(i).booleanValue() && !this.sleepStatusShowAll) {
                Paint paint4 = this.mBarChartPaint;
                if (paint4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
                    paint4 = null;
                }
                npm npmVar = this.lastSleepItem;
                if (npmVar != null) {
                    color = npmVar.a(this.mChartAttrs);
                } else {
                    Paint paint5 = this.mBarChartPaint;
                    if (paint5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
                        paint5 = null;
                    }
                    color = paint5.getColor();
                }
                paint4.setColor(color);
                float startPointX = sleepLandTopChartData.get(0).getStartPointX();
                float endPointX = sleepLandTopChartData.get(0).getEndPointX();
                float f2 = Math.abs(startPointX - endPointX) > 10.0f ? 6.0f : 0.0f;
                float startPointY2 = sleepLandTopChartData.get(0).getStartPointY();
                float startPointY3 = sleepLandBottomChartData.get(0).getStartPointY();
                float width = AppUtil.isRTLDirection() ? (parent.getWidth() - startPointX) - f2 : startPointX + f2;
                float width2 = AppUtil.isRTLDirection() ? parent.getWidth() - endPointX : endPointX;
                Paint paint6 = this.mBarChartPaint;
                if (paint6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
                    paint = null;
                } else {
                    paint = paint6;
                }
                drawRectF(canvas, paint, width, startPointY3 - f2, width2, startPointY2 + f2);
            }
            sleepLandTopChartData.clear();
            sleepLandBottomChartData.clear();
        }
    }

    private final void drawRectF(Canvas canvas, Paint paint, float start, float bottom, float right, float top) {
        RectF rectF = new RectF(start, top, right, bottom);
        Intrinsics.checkNotNull(paint);
        canvas.drawRoundRect(rectF, 20.0f, 20.0f, paint);
    }

    public static /* synthetic */ List drawSleepChart$default(SleepChartRender sleepChartRender, Canvas canvas, RecyclerView recyclerView, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return sleepChartRender.drawSleepChart(canvas, recyclerView, z);
    }

    private final void drawSleepChartItem(Canvas canvas, RecyclerView parent, npm sleepItemTime, float start, float end) {
        Paint paint;
        float height = parent.getHeight() - parent.getPaddingBottom();
        qim qimVar = this.mChartAttrs;
        float f = height - qimVar.f625a;
        float f2 = qimVar.P0;
        int iA = sleepItemTime.a(qimVar);
        Paint paint2 = this.mBarChartPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
            paint2 = null;
        }
        int color = paint2.getColor();
        Paint paint4 = this.mBarChartPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
            paint4 = null;
        }
        paint4.setColor(iA);
        float sleepRectBottom = getSleepRectBottom(sleepItemTime.d, f);
        if (sleepItemTime.c != -1) {
            float f3 = sleepRectBottom - f2;
            Paint paint5 = this.mBarChartPaint;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
                paint = null;
            } else {
                paint = paint5;
            }
            drawRectF(canvas, paint, start, sleepRectBottom, end, f3);
        }
        Paint paint6 = this.mBarChartPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
        } else {
            paint3 = paint6;
        }
        paint3.setColor(color);
    }

    private final void drawVerticalLines(Canvas canvas, RecyclerView parent) {
        int paddingTop = parent.getPaddingTop();
        float height = (parent.getHeight() - parent.getPaddingBottom()) - this.mChartAttrs.f625a;
        int paddingLeft = parent.getPaddingLeft();
        int right = parent.getRight() - parent.getPaddingRight();
        Paint paint = this.mLinePaint;
        Paint paint2 = null;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
            paint = null;
        }
        paint.setPathEffect(null);
        Path path = new Path();
        float f = paddingLeft;
        path.moveTo(f, height);
        float f2 = paddingTop;
        path.lineTo(f, f2);
        Paint paint3 = this.mLinePaint;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
            paint3 = null;
        }
        canvas.drawPath(path, paint3);
        Path path2 = new Path();
        float f3 = right;
        path2.moveTo(f3, height);
        path2.lineTo(f3, f2);
        Paint paint4 = this.mLinePaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
        } else {
            paint2 = paint4;
        }
        canvas.drawPath(path2, paint2);
    }

    private final void drawXAxisLabel(RecyclerView parent, SleepItemEntry longestSleepEntry, Canvas canvas, SleepItemEntry latestSleepEntry) {
        float width = parent.getWidth() - parent.getPaddingEnd();
        float paddingStart = parent.getPaddingStart();
        float height = ((parent.getHeight() - parent.getPaddingBottom()) - this.mChartAttrs.f625a) + 64;
        Paint paint = null;
        if (AppUtil.isRTLDirection()) {
            if ((latestSleepEntry != null ? latestSleepEntry.f11764a : null) != null) {
                String dateStr = TimeDateUtil.getDateStr(latestSleepEntry.f11764a.g, TimeUtils.FORMAT_H_M);
                Paint paint2 = this.mTextPaint;
                if (paint2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
                    paint2 = null;
                }
                canvas.drawText(dateStr, paddingStart, height, paint2);
            }
            if ((longestSleepEntry != null ? longestSleepEntry.f11764a : null) != null) {
                String dateStr2 = TimeDateUtil.getDateStr(longestSleepEntry.f11764a.f, TimeUtils.FORMAT_H_M);
                Paint paint3 = this.mTextPaint;
                if (paint3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
                    paint3 = null;
                }
                float fMeasureText = width - paint3.measureText(dateStr2);
                Paint paint4 = this.mTextPaint;
                if (paint4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
                } else {
                    paint = paint4;
                }
                canvas.drawText(dateStr2, fMeasureText, height, paint);
                return;
            }
            return;
        }
        if ((longestSleepEntry != null ? longestSleepEntry.f11764a : null) != null) {
            String dateStr3 = TimeDateUtil.getDateStr(longestSleepEntry.f11764a.f, TimeUtils.FORMAT_H_M);
            Paint paint5 = this.mTextPaint;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
                paint5 = null;
            }
            canvas.drawText(dateStr3, paddingStart, height, paint5);
        }
        if ((latestSleepEntry != null ? latestSleepEntry.f11764a : null) != null) {
            String dateStr4 = TimeDateUtil.getDateStr(latestSleepEntry.f11764a.g, TimeUtils.FORMAT_H_M);
            Paint paint6 = this.mTextPaint;
            if (paint6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
                paint6 = null;
            }
            float fMeasureText2 = width - paint6.measureText(dateStr4);
            Paint paint7 = this.mTextPaint;
            if (paint7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
            } else {
                paint = paint7;
            }
            canvas.drawText(dateStr4, fMeasureText2, height, paint);
        }
    }

    private final float getSleepRectBottom(int sleepHeightIndex, float parentBottom) {
        return sleepHeightIndex == -1 ? parentBottom : parentBottom - (((this.mSleepStageSize - sleepHeightIndex) - 1) * this.sleepHeight);
    }

    private final List<String> getXAxisLabel(SleepItemEntry longestSleepEntry, SleepItemEntry latestSleepEntry) {
        String dateStr;
        String dateStr2 = "";
        if (AppUtil.isRTLDirection()) {
            String dateStr3 = (latestSleepEntry != null ? latestSleepEntry.f11764a : null) != null ? TimeDateUtil.getDateStr(latestSleepEntry.f11764a.g, TimeUtils.FORMAT_H_M) : "";
            dateStr2 = (longestSleepEntry != null ? longestSleepEntry.f11764a : null) != null ? TimeDateUtil.getDateStr(longestSleepEntry.f11764a.f, TimeUtils.FORMAT_H_M) : "";
            dateStr = dateStr3;
        } else {
            dateStr = (longestSleepEntry != null ? longestSleepEntry.f11764a : null) != null ? TimeDateUtil.getDateStr(longestSleepEntry.f11764a.f, TimeUtils.FORMAT_H_M) : "";
            if ((latestSleepEntry != null ? latestSleepEntry.f11764a : null) != null) {
                dateStr2 = TimeDateUtil.getDateStr(latestSleepEntry.f11764a.g, TimeUtils.FORMAT_H_M);
            }
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{dateStr, dateStr2});
    }

    private final void initBarChartPaint() {
        Paint paint = new Paint();
        this.mBarChartPaint = paint;
        paint.reset();
        Paint paint2 = this.mBarChartPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
            paint2 = null;
        }
        paint2.setAntiAlias(true);
        Paint paint4 = this.mBarChartPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
            paint4 = null;
        }
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = this.mBarChartPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
        } else {
            paint3 = paint5;
        }
        paint3.setColor(this.mChartAttrs.K0);
    }

    private final void initHighLightPaint() {
        Paint paint = new Paint();
        this.mHighLightValueBigPaint = paint;
        paint.reset();
        Paint paint2 = this.mHighLightValueBigPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightValueBigPaint");
            paint2 = null;
        }
        paint2.setAntiAlias(true);
        Paint paint4 = this.mHighLightValueBigPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightValueBigPaint");
            paint4 = null;
        }
        paint4.setColor(x44.a(aji.e0));
        Paint paint5 = this.mHighLightValueBigPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightValueBigPaint");
            paint5 = null;
        }
        paint5.setTextSize(DisplayUtil.sp2px(24.0f));
        Paint paint6 = this.mHighLightValueBigPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightValueBigPaint");
            paint6 = null;
        }
        paint6.setTypeface(Typeface.create("mipro-regular", 1));
        Paint paint7 = new Paint();
        this.mHighLightDescValuePaint = paint7;
        paint7.reset();
        Paint paint8 = this.mHighLightDescValuePaint;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescValuePaint");
            paint8 = null;
        }
        paint8.setAntiAlias(true);
        Paint paint9 = this.mHighLightDescValuePaint;
        if (paint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescValuePaint");
            paint9 = null;
        }
        paint9.setColor(x44.a(aji.e0));
        Paint paint10 = this.mHighLightDescValuePaint;
        if (paint10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescValuePaint");
            paint10 = null;
        }
        paint10.setTextSize(DisplayUtil.sp2px(12.0f));
        Paint paint11 = this.mHighLightDescValuePaint;
        if (paint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescValuePaint");
            paint11 = null;
        }
        paint11.setTypeface(Typeface.create("mipro-regular", 1));
        Paint paint12 = new Paint();
        this.mHighLightDescPaint = paint12;
        paint12.reset();
        Paint paint13 = this.mHighLightDescPaint;
        if (paint13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescPaint");
            paint13 = null;
        }
        paint13.setAntiAlias(true);
        Paint paint14 = this.mHighLightDescPaint;
        if (paint14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescPaint");
            paint14 = null;
        }
        paint14.setColor(x44.a(aji.i0));
        Paint paint15 = this.mHighLightDescPaint;
        if (paint15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescPaint");
            paint15 = null;
        }
        paint15.setTextSize(DisplayUtil.dip2px(12.0f));
        Paint paint16 = this.mHighLightDescPaint;
        if (paint16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightDescPaint");
            paint16 = null;
        }
        paint16.setTypeface(Typeface.create("mipro-regular", 0));
        Paint paint17 = new Paint();
        this.mHighLightLinePaint = paint17;
        paint17.reset();
        Paint paint18 = this.mHighLightLinePaint;
        if (paint18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightLinePaint");
            paint18 = null;
        }
        paint18.setAntiAlias(true);
        Paint paint19 = this.mHighLightLinePaint;
        if (paint19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightLinePaint");
            paint19 = null;
        }
        paint19.setStyle(Paint.Style.STROKE);
        Paint paint20 = this.mHighLightLinePaint;
        if (paint20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightLinePaint");
            paint20 = null;
        }
        paint20.setStrokeWidth(3.0f);
        Paint paint21 = this.mHighLightLinePaint;
        if (paint21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHighLightLinePaint");
        } else {
            paint3 = paint21;
        }
        qim qimVar = this.mChartAttrs;
        Intrinsics.checkNotNull(qimVar);
        paint3.setColor(qimVar.J);
    }

    private final void initLinePaint() {
        Paint paint = new Paint();
        this.mLinePaint = paint;
        paint.reset();
        Paint paint2 = this.mLinePaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
            paint2 = null;
        }
        paint2.setAntiAlias(true);
        Paint paint4 = this.mLinePaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
            paint4 = null;
        }
        paint4.setStyle(Paint.Style.STROKE);
        Paint paint5 = this.mLinePaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
            paint5 = null;
        }
        paint5.setStrokeWidth(1.0f);
        Paint paint6 = this.mLinePaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
        } else {
            paint3 = paint6;
        }
        qim qimVar = this.mChartAttrs;
        Intrinsics.checkNotNull(qimVar);
        paint3.setColor(qimVar.J);
    }

    private final void initLineRenderPaint() {
        Paint paint = new Paint();
        this.mLineRenderPaint = paint;
        paint.reset();
        Paint paint2 = this.mLineRenderPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLineRenderPaint");
            paint2 = null;
        }
        paint2.setAntiAlias(true);
        Paint paint4 = this.mLineRenderPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLineRenderPaint");
            paint4 = null;
        }
        paint4.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint5 = this.mLineRenderPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLineRenderPaint");
        } else {
            paint3 = paint5;
        }
        paint3.setStrokeWidth(1.0f);
    }

    private final void initTextPaint() {
        Paint paint = new Paint();
        this.mTextPaint = paint;
        paint.reset();
        Paint paint2 = this.mTextPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
            paint2 = null;
        }
        paint2.setAntiAlias(true);
        Paint paint4 = this.mTextPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
            paint4 = null;
        }
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = this.mTextPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
            paint5 = null;
        }
        paint5.setTextSize(this.mChartAttrs.l0);
        Paint paint6 = this.mTextPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
        } else {
            paint3 = paint6;
        }
        paint3.setColor(this.mChartAttrs.k0);
    }

    public final void drawHighLight(@NotNull Canvas canvas, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.mChartAttrs.C) {
            float height = (parent.getHeight() - parent.getPaddingBottom()) - this.mChartAttrs.f625a;
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                Object tag = childAt.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.SleepItemEntry");
                SleepItemEntry sleepItemEntry = (SleepItemEntry) tag;
                npm npmVar = sleepItemEntry.f11764a;
                float width = childAt.getWidth();
                float sleepRectBottom = getSleepRectBottom(npmVar.d, height) - this.mChartAttrs.P0;
                float left = (width / 2) + childAt.getLeft();
                String barLabel = this.mHighLightValueFormatter.getBarLabel(sleepItemEntry);
                if (sleepItemEntry.isSelected() && !TextUtils.isEmpty(barLabel)) {
                    Intrinsics.checkNotNull(barLabel);
                    drawHighLightRect(canvas, barLabel, left, sleepRectBottom, parent);
                }
            }
        }
    }

    public final void drawLines(@NotNull Canvas canvas, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        drawVerticalLines(canvas, parent);
        drawHorizontalDashLines(canvas, parent);
    }

    @Nullable
    public final List<Object> drawSleepChart(@NotNull Canvas canvas, @NotNull RecyclerView parent, boolean drawLabel) {
        Paint paint;
        boolean z;
        int i;
        npm npmVar;
        float width;
        RecyclerView parent2 = parent;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent2, "parent");
        float width2 = parent.getWidth() - parent.getPaddingEnd();
        float paddingStart = parent.getPaddingStart();
        float width3 = (parent.getWidth() - parent.getPaddingStart()) - parent.getPaddingEnd();
        float top = parent.getTop() + parent.getPaddingTop();
        parent.getHeight();
        parent.getPaddingBottom();
        float f = this.mChartAttrs.f625a;
        int childCount = parent.getChildCount();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float height = (((parent.getHeight() - parent.getPaddingBottom()) - this.mChartAttrs.f625a) - parent.getPaddingTop()) / this.mSleepStageSize;
        this.sleepHeight = height;
        float f2 = height / 4;
        int i2 = 2;
        float f3 = height - (2 * f2);
        Iterator<Boolean> it = this.sleepItemStatus.iterator();
        while (it.hasNext()) {
            if (!it.next().booleanValue()) {
                this.sleepStatusShowAll = false;
                break;
            }
            this.sleepStatusShowAll = true;
        }
        int i3 = 0;
        int iA = 0;
        npm npmVar2 = null;
        SleepItemEntry sleepItemEntry = null;
        SleepItemEntry sleepItemEntry2 = null;
        float width4 = 0.0f;
        while (i3 < childCount) {
            View childAt = parent2.getChildAt(i3);
            Object tag = childAt.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.SleepItemEntry");
            SleepItemEntry sleepItemEntry3 = (SleepItemEntry) tag;
            npm npmVar3 = sleepItemEntry3.f11764a;
            if (i3 == 0) {
                sleepItemEntry = sleepItemEntry3;
            }
            if (i3 == childCount - 1) {
                sleepItemEntry2 = sleepItemEntry3;
            }
            float f4 = width2 - width4;
            float width5 = f4 - childAt.getWidth();
            width4 += childAt.getWidth();
            float height2 = (parent.getHeight() - parent.getPaddingBottom()) - this.mChartAttrs.f625a;
            float sleepRectBottom = getSleepRectBottom(npmVar3.d, height2);
            if (npmVar2 != null && npmVar2.d == i2 && npmVar3.d == -1) {
                z = false;
                sleepRectBottom = getSleepRectBottom(0, height2);
            } else {
                z = false;
            }
            float f5 = (sleepRectBottom - this.sleepHeight) + f2;
            float f6 = sleepRectBottom - f2;
            float f7 = f4 - width5;
            if (i3 != 0) {
                float startPointX = ((SleepLandChart) CollectionsKt___CollectionsKt.last((List) arrayList)).getStartPointX();
                float startPointY = ((SleepLandChart) CollectionsKt___CollectionsKt.last((List) arrayList)).getStartPointY();
                width = ((SleepLandChart) CollectionsKt___CollectionsKt.last((List) arrayList)).getWidth();
                arrayList.add(new SleepLandChart(startPointX, startPointY, f4, f5, f7, width, true));
                arrayList2.add(new SleepLandChart(((SleepLandChart) CollectionsKt___CollectionsKt.last((List) arrayList2)).getStartPointX(), ((SleepLandChart) CollectionsKt___CollectionsKt.last((List) arrayList2)).getStartPointY(), f4, f6, f7, width, true));
                boolean z2 = i3 == 1 ? true : z;
                Intrinsics.checkNotNull(npmVar3);
                npmVar = npmVar3;
                i = 2;
                drawRecentPath(arrayList, arrayList2, canvas, npmVar3, f3, iA, parent, z2);
            } else {
                i = 2;
                npmVar = npmVar3;
                width = 0.0f;
            }
            iA = this.sleepStatusShowAll ? npmVar.a(this.mChartAttrs) : AppUtil.getApp().getColor(aji.U);
            this.lastSleepType = npmVar.c;
            this.lastSleepItem = npmVar;
            float f8 = width;
            arrayList.add(new SleepLandChart(width5, f5, f4, f5, f7, f8, false));
            arrayList2.add(new SleepLandChart(width5, f6, f4, f6, f7, f8, false));
            i3++;
            arrayList2 = arrayList2;
            arrayList = arrayList;
            npmVar2 = npmVar;
            i2 = i;
            width2 = width2;
            childCount = childCount;
            parent2 = parent;
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = arrayList;
        if (npmVar2 != null) {
            drawRecentPath(arrayList4, arrayList3, canvas, npmVar2, f3, iA, parent, false);
        }
        this.sleepPathTopPointX = 0.0f;
        this.sleepPathTopPointY = 0.0f;
        this.sleepPathBottomPointX = 0.0f;
        this.sleepPathBottomPointY = 0.0f;
        if (width4 < width3) {
            Paint paint2 = this.mBarChartPaint;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
                paint2 = null;
            }
            int color = paint2.getColor();
            float f9 = paddingStart + (width3 - width4);
            float sleepRectBottom2 = getSleepRectBottom(-1, top);
            Paint paint3 = this.mBarChartPaint;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
                paint3 = null;
            }
            paint3.setColor(this.mChartAttrs.N0);
            Paint paint4 = this.mBarChartPaint;
            if (paint4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
                paint = null;
            } else {
                paint = paint4;
            }
            drawRectF(canvas, paint, paddingStart, sleepRectBottom2, f9, sleepRectBottom2);
            Paint paint5 = this.mBarChartPaint;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBarChartPaint");
                paint5 = null;
            }
            paint5.setColor(color);
        }
        if (!drawLabel) {
            return getXAxisLabel(sleepItemEntry2, sleepItemEntry);
        }
        drawXAxisLabel(parent, sleepItemEntry2, canvas, sleepItemEntry);
        return null;
    }

    @NotNull
    public final List<Boolean> getSleepItemStatus() {
        return this.sleepItemStatus;
    }

    public final void setHighLightValueFormatter(@NotNull onq highLightValueFormatter) {
        Intrinsics.checkNotNullParameter(highLightValueFormatter, "highLightValueFormatter");
        this.mHighLightValueFormatter = highLightValueFormatter;
    }

    public final void setItemHeightOffset(float value) {
        this.sleepItemHeightOffset = value;
    }

    public final void setSleepItemStatus(@NotNull List<Boolean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sleepItemStatus = list;
    }

    public final void updateStageSize(int size) {
        this.mSleepStageSize = size;
    }

    @Nullable
    public final List<Object> drawSleepChart(@NotNull Canvas canvas, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return drawSleepChart(canvas, parent, true);
    }
}
