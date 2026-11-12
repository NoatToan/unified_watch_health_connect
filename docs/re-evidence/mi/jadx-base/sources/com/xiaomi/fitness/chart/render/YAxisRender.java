package com.xiaomi.fitness.chart.render;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.chart.entrys.model.SportRecordYModel;
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.a52;
import defpackage.eu3;
import defpackage.fpc;
import defpackage.o8p;
import defpackage.qzi;
import defpackage.rtr;
import defpackage.sf2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u000f\u0012\u0006\u0010E\u001a\u00028\u0001¢\u0006\u0004\bV\u0010JJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001c\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u001eJ/\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010\u0011J%\u0010&\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u0011J%\u0010'\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b'\u0010\u0011J?\u0010.\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020)0,¢\u0006\u0004\b.\u0010/J1\u00102\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103J-\u00105\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00101\u001a\u000204¢\u0006\u0004\b5\u00106J-\u00108\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0013¢\u0006\u0004\b8\u00109J'\u0010;\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b;\u0010<J9\u0010=\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u00132\b\b\u0002\u00101\u001a\u000200H\u0007¢\u0006\u0004\b=\u0010>J9\u0010?\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u00132\b\b\u0002\u00101\u001a\u000200H\u0007¢\u0006\u0004\b?\u0010>J/\u0010@\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b@\u00103J1\u0010A\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u00101\u001a\u000200H\u0007¢\u0006\u0004\bA\u00103J%\u0010B\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\bD\u0010\u0011R\"\u0010E\u001a\u00028\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010R\u001a\u00020K8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bR\u0010M\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR\u0016\u0010U\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010M¨\u0006W"}, d2 = {"Lcom/xiaomi/fitness/chart/render/YAxisRender;", "Lsf2;", "T", "La52;", "V", "", "", "initTextPaint", "()V", "initPaint", "initDashPaint", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "yAxis", "drawHorizontalLineWithCustom", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lsf2;)V", "Lrtr;", "", "standardLineValue", "standardYPosition", "rightRectF", "drawStandardLineLabel", "(Landroid/graphics/Canvas;Lrtr;FFF)V", "left", TSMAuthContants.PARAM_KEY_RIGHT, "yPosition", "drawLine", "(Landroid/graphics/Canvas;FFF)V", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lrtr;FF)V", "drawStandTargetLine", "", "originPadding", "yAxisWidth", "computeYAxisWidth", "(IF)I", "drawHorizontalLine", "drawPhysicalStatusHorizontalLine", "drawYAxisLabel", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "Lcom/xiaomi/fitness/chart/entrys/model/SportRecordYModel;", "yValueMap", "", "keyList", "drawSportDetailYLabel", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/List;)V", "", "drawText", "drawLeftYAxisLabel", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lsf2;Z)V", "", "drawYAxisLabelText", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lsf2;Ljava/lang/String;)V", "textYPercent", "drawYAxisLabelVitality", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lsf2;F)V", "yAxisPercent", "drawHorizontalVitality", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/Float;)V", "drawRYAxisLabelVitality", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lsf2;FZ)V", "drawLYAxisLabelVitality", "drawsStressRightYAxisLabel", "drawRightYAxisLabel", "drawStandardLines", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lrtr;)V", "drawEcgHorizontalLine", "mBarChartAttrs", "La52;", "getMBarChartAttrs", "()La52;", "setMBarChartAttrs", "(La52;)V", "Landroid/graphics/Paint;", "mLinePaint", "Landroid/graphics/Paint;", "getMLinePaint", "()Landroid/graphics/Paint;", "setMLinePaint", "(Landroid/graphics/Paint;)V", "mTextPaint", "getMTextPaint", "setMTextPaint", "mDashPaint", "<init>", "chart_release"}, k = 1, mv = {2, 0, 0})
public class YAxisRender<T extends sf2, V extends a52> {

    @NotNull
    private V mBarChartAttrs;
    private Paint mDashPaint;
    protected Paint mLinePaint;
    protected Paint mTextPaint;

    public YAxisRender(@NotNull V mBarChartAttrs) {
        Intrinsics.checkNotNullParameter(mBarChartAttrs, "mBarChartAttrs");
        this.mBarChartAttrs = mBarChartAttrs;
        initPaint();
        initTextPaint();
        initDashPaint();
    }

    private final int computeYAxisWidth(int originPadding, float yAxisWidth) {
        StringBuilder sb = new StringBuilder();
        sb.append("originPadding:");
        sb.append(originPadding);
        sb.append(" yAxisWidth:");
        sb.append(yAxisWidth);
        float f = originPadding;
        if (f <= yAxisWidth) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("control originPadding:");
            sb2.append(originPadding);
            sb2.append(" yAxisWidth:");
            sb2.append(yAxisWidth);
        } else if (f - yAxisWidth > ExtUtilsKt.getDp(Float.valueOf(8.0f))) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("if control originPadding:");
            sb3.append(originPadding);
            sb3.append(" yAxisWidth:");
            sb3.append(yAxisWidth);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("else control originPadding:");
            sb4.append(originPadding);
            sb4.append(" yAxisWidth:");
            sb4.append(yAxisWidth);
            yAxisWidth = f;
        }
        return (int) yAxisWidth;
    }

    private final void drawHorizontalLineWithCustom(Canvas canvas, RecyclerView parent, T yAxis) {
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        Intrinsics.checkNotNull(yAxis);
        HashMap<Float, Float> mapB = yAxis.b(parent);
        Intrinsics.checkNotNull(mapB);
        for (Map.Entry<Float, Float> entry : mapB.entrySet()) {
            Path path = new Path();
            Float key = entry.getKey();
            Intrinsics.checkNotNull(key);
            path.moveTo(paddingLeft, key.floatValue());
            path.lineTo(width, key.floatValue());
            V v = this.mBarChartAttrs;
            Intrinsics.checkNotNull(v);
            if (v.l) {
                Paint mLinePaint = getMLinePaint();
                DisplayUtil displayUtil = DisplayUtil.INSTANCE;
                mLinePaint.setPathEffect(new DashPathEffect(new float[]{displayUtil.dip2pxF(4.0f), displayUtil.dip2pxF(1.5f)}, 0.0f));
            }
            canvas.drawPath(path, getMLinePaint());
        }
        V v2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        if (v2.m) {
            float height = parent.getHeight();
            V v3 = this.mBarChartAttrs;
            Intrinsics.checkNotNull(v3);
            float paddingBottom = (height - v3.f625a) - parent.getPaddingBottom();
            Path path2 = new Path();
            path2.moveTo(paddingLeft, paddingBottom);
            path2.lineTo(width, paddingBottom);
            V v4 = this.mBarChartAttrs;
            Intrinsics.checkNotNull(v4);
            if (v4.l) {
                Paint mLinePaint2 = getMLinePaint();
                DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
                mLinePaint2.setPathEffect(new DashPathEffect(new float[]{displayUtil2.dip2pxF(4.0f), displayUtil2.dip2pxF(1.5f)}, 0.0f));
            }
            canvas.drawPath(path2, getMLinePaint());
        }
    }

    public static /* synthetic */ void drawLYAxisLabelVitality$default(YAxisRender yAxisRender, Canvas canvas, RecyclerView recyclerView, sf2 sf2Var, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLYAxisLabelVitality");
        }
        if ((i & 16) != 0) {
            z = true;
        }
        yAxisRender.drawLYAxisLabelVitality(canvas, recyclerView, sf2Var, f, z);
    }

    public static /* synthetic */ void drawLeftYAxisLabel$default(YAxisRender yAxisRender, Canvas canvas, RecyclerView recyclerView, sf2 sf2Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLeftYAxisLabel");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        yAxisRender.drawLeftYAxisLabel(canvas, recyclerView, sf2Var, z);
    }

    private final void drawLine(Canvas canvas, float left, float right, float yPosition) {
        Path path = new Path();
        path.moveTo(left, yPosition);
        path.lineTo(right, yPosition);
        canvas.drawPath(path, getMLinePaint());
    }

    public static /* synthetic */ void drawRYAxisLabelVitality$default(YAxisRender yAxisRender, Canvas canvas, RecyclerView recyclerView, sf2 sf2Var, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRYAxisLabelVitality");
        }
        if ((i & 16) != 0) {
            z = true;
        }
        yAxisRender.drawRYAxisLabelVitality(canvas, recyclerView, sf2Var, f, z);
    }

    public static /* synthetic */ void drawRightYAxisLabel$default(YAxisRender yAxisRender, Canvas canvas, RecyclerView recyclerView, sf2 sf2Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRightYAxisLabel");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        yAxisRender.drawRightYAxisLabel(canvas, recyclerView, sf2Var, z);
    }

    private final void drawStandTargetLine(Canvas canvas, float left, float right, float yPosition) {
        Path path = new Path();
        path.moveTo(left, yPosition);
        path.lineTo(right, yPosition);
        int color = getMLinePaint().getColor();
        Paint mLinePaint = getMLinePaint();
        V v = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        mLinePaint.setColor(v.w0);
        V v2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        if (v2.l) {
            Paint mLinePaint2 = getMLinePaint();
            DisplayUtil displayUtil = DisplayUtil.INSTANCE;
            mLinePaint2.setPathEffect(new DashPathEffect(new float[]{displayUtil.dip2pxF(4.0f), displayUtil.dip2pxF(1.5f)}, 0.0f));
        }
        canvas.drawPath(path, getMLinePaint());
        getMLinePaint().setColor(color);
    }

    private final void drawStandardLineLabel(Canvas canvas, rtr yAxis, float standardLineValue, float standardYPosition, float rightRectF) {
        float fI = o8p.i(getMTextPaint());
        String formattedValue = yAxis.getValueFormatter().getFormattedValue(standardLineValue, yAxis);
        float fMeasureText = getMTextPaint().measureText(formattedValue);
        RectF rectF = new RectF();
        float dp = standardYPosition - ExtUtilsKt.getDp(Float.valueOf(10.0f));
        rectF.set(rightRectF - fMeasureText, dp - fI, rightRectF, dp);
        Paint.FontMetrics fontMetrics = getMTextPaint().getFontMetrics();
        canvas.drawText(formattedValue, rectF.left, rectF.bottom - ((fontMetrics.top + fontMetrics.bottom) / 2), getMTextPaint());
    }

    public static /* synthetic */ void drawsStressRightYAxisLabel$default(YAxisRender yAxisRender, Canvas canvas, RecyclerView recyclerView, sf2 sf2Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawsStressRightYAxisLabel");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        yAxisRender.drawsStressRightYAxisLabel(canvas, recyclerView, sf2Var, z);
    }

    private final void initDashPaint() {
        this.mDashPaint = new Paint();
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{5.0f, 5.0f, 5.0f, 5.0f}, 1.0f);
        Paint paint = this.mDashPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDashPaint");
            paint = null;
        }
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setPathEffect(dashPathEffect);
        paint.setColor(this.mBarChartAttrs.T);
    }

    private final void initPaint() {
        setMLinePaint(new Paint());
        Paint mLinePaint = getMLinePaint();
        mLinePaint.reset();
        mLinePaint.setAntiAlias(true);
        mLinePaint.setStyle(Paint.Style.STROKE);
        mLinePaint.setStrokeWidth(0.75f);
        mLinePaint.setColor(this.mBarChartAttrs.J);
    }

    private final void initTextPaint() {
        setMTextPaint(new Paint());
        Paint mTextPaint = getMTextPaint();
        mTextPaint.reset();
        mTextPaint.setAntiAlias(true);
        mTextPaint.setStyle(Paint.Style.FILL);
        mTextPaint.setColor(this.mBarChartAttrs.H);
        mTextPaint.setTextSize(this.mBarChartAttrs.G);
    }

    public final void drawEcgHorizontalLine(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        getMLinePaint().setColor(yAxis.getGridColor());
        int paddingTop = parent.getPaddingTop();
        float height = parent.getHeight() - parent.getPaddingBottom();
        V v = this.mBarChartAttrs;
        float f = paddingTop;
        float f2 = ((height - v.f625a) - v.f626b) - f;
        int labelCount = yAxis.getLabelCount();
        float f3 = f2 / labelCount;
        float f4 = f3 / 5.0f;
        float f5 = f + this.mBarChartAttrs.f626b;
        if (labelCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (i > 0) {
                f5 += f3;
            }
            Path path = new Path();
            float f6 = paddingLeft;
            path.moveTo(f6, f5);
            float f7 = width;
            path.lineTo(f7, f5);
            if ((i == labelCount && this.mBarChartAttrs.m) || this.mBarChartAttrs.n) {
                if (i < labelCount) {
                    float f8 = f5;
                    for (int i2 = 0; i2 < 4; i2++) {
                        f8 += f4;
                        Path path2 = new Path();
                        path2.moveTo(f6, f8);
                        path2.lineTo(f7, f8);
                        Paint paint = this.mDashPaint;
                        if (paint == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDashPaint");
                            paint = null;
                        }
                        canvas.drawPath(path2, paint);
                    }
                }
                canvas.drawPath(path, getMLinePaint());
            }
            if (i == labelCount) {
                return;
            } else {
                i++;
            }
        }
    }

    public void drawHorizontalLine(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        V v = this.mBarChartAttrs;
        if (!v.m) {
            Intrinsics.checkNotNull(v);
            if (!v.n) {
                return;
            }
        }
        if (this.mBarChartAttrs.x0) {
            drawHorizontalLineWithCustom(canvas, parent, yAxis);
            return;
        }
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int paddingTop = parent.getPaddingTop();
        float height = parent.getHeight() - parent.getPaddingBottom();
        V v2 = this.mBarChartAttrs;
        float f = paddingTop;
        float f2 = ((height - v2.f625a) - v2.f626b) - f;
        int labelCount = yAxis.getLabelCount();
        float f3 = f2 / labelCount;
        float f4 = f + this.mBarChartAttrs.f626b;
        if (labelCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (i > 0) {
                f4 += f3;
            }
            Path path = new Path();
            boolean z = i == labelCount ? this.mBarChartAttrs.m : this.mBarChartAttrs.n;
            path.moveTo(paddingLeft, f4);
            path.lineTo(width, f4);
            if (z) {
                if (this.mBarChartAttrs.l) {
                    Paint mLinePaint = getMLinePaint();
                    DisplayUtil displayUtil = DisplayUtil.INSTANCE;
                    mLinePaint.setPathEffect(new DashPathEffect(new float[]{displayUtil.dip2pxF(4.0f), displayUtil.dip2pxF(1.5f)}, 0.0f));
                }
                canvas.drawPath(path, getMLinePaint());
            }
            if (i == labelCount) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void drawHorizontalVitality(@NotNull Canvas canvas, @NotNull RecyclerView parent, @Nullable Float yAxisPercent) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (yAxisPercent == null) {
            return;
        }
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int paddingTop = parent.getPaddingTop();
        float height = parent.getHeight() - parent.getPaddingBottom();
        V v = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        float f = height - v.f625a;
        V v2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        float f2 = paddingTop;
        float f3 = (f - v2.f626b) - f2;
        V v3 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v3);
        float f4 = f2 + v3.f626b + f3;
        float fFloatValue = f3 * yAxisPercent.floatValue();
        Path path = new Path();
        float f5 = paddingLeft;
        path.moveTo(f5, f4);
        float f6 = width;
        path.lineTo(f6, f4);
        float f7 = f4 - fFloatValue;
        path.moveTo(f5, f7);
        path.lineTo(f6, f7);
        canvas.drawPath(path, getMLinePaint());
    }

    @JvmOverloads
    public final void drawLYAxisLabelVitality(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, float f) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        drawLYAxisLabelVitality$default(this, canvas, parent, yAxis, f, false, 16, null);
    }

    @JvmOverloads
    public final void drawLeftYAxisLabel(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        drawLeftYAxisLabel$default(this, canvas, parent, yAxis, false, 8, null);
    }

    public final void drawPhysicalStatusHorizontalLine(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(yAxis.mAxisMaximum), Float.valueOf(15.0f), Float.valueOf(0.0f), Float.valueOf(-10.0f), Float.valueOf(-30.0f), Float.valueOf(yAxis.mAxisMinimum)});
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int paddingTop = parent.getPaddingTop();
        float height = parent.getHeight() - parent.getPaddingBottom();
        V v = this.mBarChartAttrs;
        float f = paddingTop;
        float f2 = ((height - v.f625a) - v.f626b) - f;
        float f3 = yAxis.mAxisMaximum - yAxis.mAxisMinimum;
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            float f4 = this.mBarChartAttrs.f626b + f + (f2 - (f3 > 0.0f ? ((fFloatValue - yAxis.mAxisMinimum) * f2) / f3 : f2 / 5));
            Path path = new Path();
            boolean z = fFloatValue == yAxis.mAxisMinimum ? this.mBarChartAttrs.m : this.mBarChartAttrs.n;
            path.moveTo(paddingLeft, f4);
            path.lineTo(width, f4);
            if (z) {
                if (this.mBarChartAttrs.l) {
                    Paint mLinePaint = getMLinePaint();
                    DisplayUtil displayUtil = DisplayUtil.INSTANCE;
                    mLinePaint.setPathEffect(new DashPathEffect(new float[]{displayUtil.dip2pxF(4.0f), displayUtil.dip2pxF(1.5f)}, 0.0f));
                }
                canvas.drawPath(path, getMLinePaint());
            }
        }
    }

    @JvmOverloads
    public final void drawRYAxisLabelVitality(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, float f) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        drawRYAxisLabelVitality$default(this, canvas, parent, yAxis, f, false, 16, null);
    }

    @JvmOverloads
    public final void drawRightYAxisLabel(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        drawRightYAxisLabel$default(this, canvas, parent, yAxis, false, 8, null);
    }

    public final void drawSportDetailYLabel(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull Map<SportRecordKey, SportRecordYModel> yValueMap, @NotNull List<? extends SportRecordKey> keyList) {
        SportRecordKey next;
        SportRecordYModel sportRecordYModel;
        YAxisRender<T, V> yAxisRender = this;
        Map<SportRecordKey, SportRecordYModel> yValueMap2 = yValueMap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yValueMap2, "yValueMap");
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        if (keyList.size() > 2) {
            return;
        }
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        V v = yAxisRender.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        float f = paddingTop + v.f626b;
        float f2 = height;
        V v2 = yAxisRender.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        float f3 = 3;
        float f4 = ((f2 - v2.f625a) - f) / f3;
        Iterator<? extends SportRecordKey> it = keyList.iterator();
        boolean z = true;
        while (it.hasNext() && (sportRecordYModel = yValueMap2.get((next = it.next()))) != null) {
            int i = 0;
            while (i < 4) {
                float maxValue = sportRecordYModel.getMaxValue() - sportRecordYModel.getMinValue();
                SportRecordChatUtil sportRecordChatUtil = SportRecordChatUtil.INSTANCE;
                float f5 = (maxValue / f3) * (sportRecordChatUtil.chartSportRevertChartKey(next) ? 3 - i : i);
                String strValueOf = String.valueOf((int) (sportRecordYModel.getMinValue() + f5));
                if (sportRecordChatUtil.chartSportPaceKey(next)) {
                    strValueOf = TimeDateUtil.getSportPaceStrWithSecDef((int) (f5 + sportRecordYModel.getMinValue()));
                }
                V v3 = yAxisRender.mBarChartAttrs;
                Intrinsics.checkNotNull(v3);
                canvas.drawText(strValueOf, z ? width + DisplayUtil.dip2px(6.0f) : (paddingLeft - getMTextPaint().measureText(strValueOf)) - DisplayUtil.dip2px(6.0f), ((f2 - (i * f4)) - v3.f625a) + DisplayUtil.dip2px(5.0f), getMTextPaint());
                i++;
                yAxisRender = this;
            }
            String sportRecordTitle = sportRecordYModel.getSportRecordTitle();
            float fMeasureText = getMTextPaint().measureText(sportRecordTitle);
            float f6 = paddingLeft;
            float fMeasureText2 = (f6 - getMTextPaint().measureText(sportRecordTitle)) - DisplayUtil.dip2px(6.0f);
            if (DisplayUtil.dip2px(6.0f) + fMeasureText > f6) {
                fMeasureText2 = DisplayUtil.dip2px(6.0f);
            }
            if (z) {
                fMeasureText2 = width + DisplayUtil.dip2px(6.0f);
                if (DisplayUtil.dip2px(6.0f) + fMeasureText > parent.getPaddingRight()) {
                    fMeasureText2 = ((parent.getPaddingRight() + width) - DisplayUtil.dip2px(6.0f)) - fMeasureText;
                }
            }
            canvas.drawText(sportRecordTitle, fMeasureText2, f - DisplayUtil.dip2px(8.0f), getMTextPaint());
            yAxisRender = this;
            yValueMap2 = yValueMap;
            z = false;
        }
    }

    public final void drawStandardLines(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull rtr yAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        V v = this.mBarChartAttrs;
        float f = v.r0;
        float f2 = v.s0;
        float f3 = v.t0;
        if (f != -1.0f) {
            float fK = eu3.k(f, parent, yAxis, v);
            drawStandTargetLine(canvas, paddingLeft, width, fK);
            if (this.mBarChartAttrs.u0) {
                drawStandardLineLabel(canvas, parent, yAxis, f, fK);
            }
        }
        if (f2 != -1.0f && f2 <= yAxis.mAxisMaximum) {
            float fK2 = eu3.k(f2, parent, yAxis, this.mBarChartAttrs);
            drawStandTargetLine(canvas, paddingLeft, width, fK2);
            if (this.mBarChartAttrs.u0) {
                drawStandardLineLabel(canvas, parent, yAxis, f2, fK2);
            }
        }
        if (f3 != -1.0f && f3 <= yAxis.mAxisMaximum) {
            float fK3 = eu3.k(f3, parent, yAxis, this.mBarChartAttrs);
            drawStandTargetLine(canvas, paddingLeft, width, fK3);
            if (this.mBarChartAttrs.u0) {
                drawStandardLineLabel(canvas, parent, yAxis, f3, fK3);
            }
        }
    }

    public final void drawYAxisLabel(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        if (AppUtil.isRTLDirection()) {
            if (this.mBarChartAttrs.o) {
                drawRightYAxisLabel$default(this, canvas, parent, yAxis, false, 8, null);
            }
            if (this.mBarChartAttrs.p) {
                drawLeftYAxisLabel$default(this, canvas, parent, yAxis, false, 8, null);
                return;
            }
            return;
        }
        if (this.mBarChartAttrs.o) {
            drawLeftYAxisLabel$default(this, canvas, parent, yAxis, false, 8, null);
        }
        if (this.mBarChartAttrs.p) {
            drawRightYAxisLabel$default(this, canvas, parent, yAxis, false, 8, null);
        }
    }

    public final void drawYAxisLabelText(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, @NotNull String drawText) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(drawText, "drawText");
        int paddingTop = parent.getPaddingTop();
        parent.getHeight();
        parent.getPaddingBottom();
        float paddingLeft = parent.getPaddingLeft();
        float fMeasureText = (paddingLeft - getMTextPaint().measureText(drawText)) - yAxis.f33581b;
        if (AppUtil.isRTLDirection()) {
            fMeasureText = (parent.getWidth() - parent.getPaddingRight()) + yAxis.f33581b;
        }
        V v = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        if (v.p && AppUtil.isRTLDirection()) {
            fMeasureText = (paddingLeft - getMTextPaint().measureText(drawText)) - yAxis.f33581b;
        } else {
            V v2 = this.mBarChartAttrs;
            Intrinsics.checkNotNull(v2);
            if (v2.p) {
                fMeasureText = (parent.getWidth() - parent.getPaddingRight()) + yAxis.f33581b;
            }
        }
        canvas.drawText(drawText, fMeasureText, ((paddingTop + yAxis.c) - (getMTextPaint().getFontMetrics().bottom - getMTextPaint().getFontMetrics().top)) - 10.0f, getMTextPaint());
    }

    public final void drawYAxisLabelVitality(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, float textYPercent) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        if (AppUtil.isRTLDirection()) {
            V v = this.mBarChartAttrs;
            Intrinsics.checkNotNull(v);
            if (v.o) {
                drawRYAxisLabelVitality$default(this, canvas, parent, yAxis, textYPercent, false, 16, null);
            }
            V v2 = this.mBarChartAttrs;
            Intrinsics.checkNotNull(v2);
            if (v2.p) {
                drawLYAxisLabelVitality$default(this, canvas, parent, yAxis, textYPercent, false, 16, null);
                return;
            }
            return;
        }
        V v3 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v3);
        if (v3.o) {
            drawLYAxisLabelVitality$default(this, canvas, parent, yAxis, textYPercent, false, 16, null);
        }
        V v4 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v4);
        if (v4.p) {
            drawRYAxisLabelVitality$default(this, canvas, parent, yAxis, textYPercent, false, 16, null);
        }
    }

    public final void drawsStressRightYAxisLabel(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, boolean drawText) {
        String string;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        int width = parent.getWidth();
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        V v = this.mBarChartAttrs;
        float f = paddingTop + v.f626b;
        float labelCount = ((height - v.f625a) - f) / yAxis.getLabelCount();
        V v2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        HashMap<Float, Float> mapB = v2.x0 ? yAxis.b(parent) : yAxis.a(f, labelCount, yAxis.getLabelCount());
        float paddingRight = (width - parent.getPaddingRight()) + yAxis.f33581b;
        Intrinsics.checkNotNull(mapB);
        int i = 0;
        for (Map.Entry<Float, Float> entry : mapB.entrySet()) {
            Float key = entry.getKey();
            entry.getValue();
            i++;
            float fFloatValue = key.floatValue() + yAxis.c;
            if (i <= mapB.size() && drawText) {
                if (i == 1) {
                    string = ApplicationExtKt.getApplication().getString(qzi.d);
                } else if (i == 2) {
                    string = ApplicationExtKt.getApplication().getString(qzi.c);
                } else if (i != 3) {
                    string = i != 4 ? "" : ApplicationExtKt.getApplication().getString(qzi.f32028a);
                } else {
                    string = ApplicationExtKt.getApplication().getString(qzi.f32029b);
                }
                Intrinsics.checkNotNull(string);
                canvas.drawText("", paddingRight, fFloatValue + ExtUtilsKt.getDp(Float.valueOf(25.0f)), getMTextPaint());
            }
        }
    }

    @NotNull
    public final V getMBarChartAttrs() {
        return this.mBarChartAttrs;
    }

    @NotNull
    public final Paint getMLinePaint() {
        Paint paint = this.mLinePaint;
        if (paint != null) {
            return paint;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
        return null;
    }

    @NotNull
    public final Paint getMTextPaint() {
        Paint paint = this.mTextPaint;
        if (paint != null) {
            return paint;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
        return null;
    }

    public final void setMBarChartAttrs(@NotNull V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.mBarChartAttrs = v;
    }

    public final void setMLinePaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.mLinePaint = paint;
    }

    public final void setMTextPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.mTextPaint = paint;
    }

    @JvmOverloads
    public final void drawLYAxisLabelVitality(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, float textYPercent, boolean drawText) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        int paddingLeft = parent.getPaddingLeft();
        V v = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        float f = paddingTop + v.f626b;
        V v2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        float f2 = (height - v2.f625a) - f;
        HashMap<Float, Float> mapA = yAxis.a(f, f2 / yAxis.getLabelCount(), yAxis.getLabelCount());
        Intrinsics.checkNotNull(mapA);
        int i = 0;
        for (Map.Entry<Float, Float> entry : mapA.entrySet()) {
            Float key = entry.getKey();
            Float value = entry.getValue();
            i++;
            fpc valueFormatter = yAxis.getValueFormatter();
            Intrinsics.checkNotNull(value);
            String formattedValue = valueFormatter.getFormattedValue(value.floatValue(), yAxis);
            float fFloatValue = key.floatValue() + yAxis.c;
            float fMeasureText = (paddingLeft - getMTextPaint().measureText(formattedValue)) - yAxis.f33581b;
            if (i <= mapA.size() && drawText) {
                if (i == 1) {
                    fFloatValue += (1 - textYPercent) * f2;
                    formattedValue = "100";
                }
                canvas.drawText(formattedValue, fMeasureText, fFloatValue, getMTextPaint());
            }
        }
    }

    @JvmOverloads
    public final void drawLeftYAxisLabel(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, boolean drawText) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        int paddingLeft = parent.getPaddingLeft();
        V v = this.mBarChartAttrs;
        float f = paddingTop + v.f626b;
        HashMap<Float, Float> mapB = this.mBarChartAttrs.x0 ? yAxis.b(parent) : yAxis.a(f, ((height - v.f625a) - f) / yAxis.getLabelCount(), yAxis.getLabelCount());
        Intrinsics.checkNotNull(mapB);
        int i = 0;
        for (Map.Entry<Float, Float> entry : mapB.entrySet()) {
            Float key = entry.getKey();
            Float value = entry.getValue();
            i++;
            if (yAxis instanceof rtr) {
                rtr rtrVar = (rtr) yAxis;
                if (rtrVar.g == -1 || mapB.size() - i != rtrVar.g) {
                }
            }
            fpc valueFormatter = yAxis.getValueFormatter();
            Intrinsics.checkNotNull(value);
            String formattedValue = valueFormatter.getFormattedValue(value.floatValue(), yAxis);
            float fFloatValue = key.floatValue() + yAxis.c;
            float fMeasureText = (paddingLeft - getMTextPaint().measureText(formattedValue)) - yAxis.f33581b;
            if (i <= mapB.size() && drawText) {
                canvas.drawText(formattedValue, fMeasureText, fFloatValue, getMTextPaint());
            }
        }
    }

    @JvmOverloads
    public final void drawRYAxisLabelVitality(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, float textYPercent, boolean drawText) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        int width = parent.getWidth();
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        V v = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        float f = paddingTop + v.f626b;
        V v2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        float f2 = (height - v2.f625a) - f;
        HashMap<Float, Float> mapA = yAxis.a(f, f2 / yAxis.getLabelCount(), yAxis.getLabelCount());
        float paddingRight = (width - parent.getPaddingRight()) + yAxis.f33581b;
        Intrinsics.checkNotNull(mapA);
        int i = 0;
        for (Map.Entry<Float, Float> entry : mapA.entrySet()) {
            Float key = entry.getKey();
            Float value = entry.getValue();
            i++;
            fpc valueFormatter = yAxis.getValueFormatter();
            Intrinsics.checkNotNull(value);
            String formattedValue = valueFormatter.getFormattedValue(value.floatValue(), yAxis);
            float fFloatValue = key.floatValue() + yAxis.c;
            if (i <= mapA.size() && drawText) {
                if (i == 1) {
                    fFloatValue += (1 - textYPercent) * f2;
                    formattedValue = "100";
                }
                canvas.drawText(formattedValue, paddingRight, fFloatValue, getMTextPaint());
            }
        }
    }

    @JvmOverloads
    public final void drawRightYAxisLabel(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull T yAxis, boolean drawText) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        int width = parent.getWidth();
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        V v = this.mBarChartAttrs;
        float f = paddingTop + v.f626b;
        float labelCount = ((height - v.f625a) - f) / yAxis.getLabelCount();
        V v2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        HashMap<Float, Float> mapB = v2.x0 ? yAxis.b(parent) : yAxis.a(f, labelCount, yAxis.getLabelCount());
        float paddingRight = (width - parent.getPaddingRight()) + yAxis.f33581b;
        float f2 = width - paddingRight;
        Intrinsics.checkNotNull(mapB);
        int i = 0;
        for (Map.Entry<Float, Float> entry : mapB.entrySet()) {
            Float key = entry.getKey();
            Float value = entry.getValue();
            i++;
            if (yAxis instanceof rtr) {
                rtr rtrVar = (rtr) yAxis;
                if (rtrVar.g == -1 || mapB.size() - i != rtrVar.g) {
                }
            }
            fpc valueFormatter = yAxis.getValueFormatter();
            Intrinsics.checkNotNull(value);
            String formattedValue = valueFormatter.getFormattedValue(value.floatValue(), yAxis);
            Logger.d("YAxisRender", "cyzdebug - drawRightYAxisLabel,yAxisScaleValue:" + value + ",labelStr:" + formattedValue);
            float f3 = this.mBarChartAttrs.G;
            getMTextPaint().setTextSize(f3);
            while (getMTextPaint().measureText(formattedValue) > f2 && f3 > 5.0f) {
                f3 -= 1.0f;
                getMTextPaint().setTextSize(f3);
            }
            float fFloatValue = key.floatValue() + yAxis.c;
            if (i <= mapB.size() && drawText) {
                canvas.drawText(formattedValue, paddingRight, fFloatValue, getMTextPaint());
            }
        }
    }

    private final void drawStandardLineLabel(Canvas canvas, RecyclerView parent, rtr yAxis, float standardLineValue, float standardYPosition) {
        String formattedValue = yAxis.getValueFormatter().getFormattedValue(standardLineValue, yAxis);
        Paint.FontMetrics fontMetrics = getMTextPaint().getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = (standardYPosition - ((f - f2) / 2)) - f2;
        float width = (parent.getWidth() - parent.getPaddingRight()) + yAxis.f33581b;
        float width2 = parent.getWidth() - width;
        int color = getMTextPaint().getColor();
        float f4 = this.mBarChartAttrs.G;
        getMTextPaint().setTextSize(f4);
        while (getMTextPaint().measureText(formattedValue) > width2 && f4 > 5.0f) {
            f4 -= 1.0f;
            getMTextPaint().setTextSize(f4);
        }
        Paint mTextPaint = getMTextPaint();
        V v = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        mTextPaint.setColor(v.v0);
        canvas.drawText(formattedValue, width, f3, getMTextPaint());
        getMTextPaint().setColor(color);
    }
}
