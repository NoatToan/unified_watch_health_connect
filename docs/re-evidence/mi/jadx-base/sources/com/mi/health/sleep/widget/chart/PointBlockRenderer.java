package com.mi.health.sleep.widget.chart;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.age;
import defpackage.cu3;
import defpackage.hwq;
import defpackage.ktc;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006'"}, d2 = {"Lcom/mi/health/sleep/widget/chart/PointBlockRenderer;", "Lage;", "", "x", "", "pxX", "(F)D", "h", "pxY", "Landroid/graphics/Canvas;", PluginDeviceInfo.FICONON, "", "drawData", "(Landroid/graphics/Canvas;)V", "", "Lcom/mi/health/sleep/widget/chart/SleepChartStage;", "", "stage2H", "Ljava/util/Map;", "stageCount", "I", "Landroid/graphics/Paint;", "rectPaint", "Landroid/graphics/Paint;", "bandPaint", "Landroid/graphics/Path;", "bandPath", "Landroid/graphics/Path;", "rPx", "F", "gap", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lcu3;", "animator", "Lhwq;", "vp", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lcu3;Lhwq;Ljava/util/Map;I)V", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSegmentRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentRenderer.kt\ncom/mi/health/sleep/widget/chart/PointBlockRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public final class PointBlockRenderer extends age {

    @NotNull
    private final Paint bandPaint;

    @NotNull
    private final Path bandPath;
    private final float gap;
    private final float rPx;

    @NotNull
    private final Paint rectPaint;

    @NotNull
    private final Map<SleepChartStage, Integer> stage2H;
    private final int stageCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointBlockRenderer(@NotNull LineChart chart, @NotNull cu3 animator, @NotNull hwq vp, @NotNull Map<SleepChartStage, Integer> stage2H, int i) {
        super(chart, animator, vp);
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(vp, "vp");
        Intrinsics.checkNotNullParameter(stage2H, "stage2H");
        this.stage2H = stage2H;
        this.stageCount = i;
        this.rectPaint = new Paint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.bandPaint = paint;
        this.bandPath = new Path();
        this.rPx = ExtUtilsKt.getDpFloat(Float.valueOf(4.0f));
        this.gap = ExtUtilsKt.getDpFloat(Float.valueOf(6.0f));
    }

    private final double pxX(float x) {
        return this.mChart.getTransformer(YAxis.AxisDependency.LEFT).e(x, 0.0f).c;
    }

    private final double pxY(float h) {
        return this.mChart.getTransformer(YAxis.AxisDependency.LEFT).e(0.0f, h).d;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.age, defpackage.dn5
    public void drawData(@NotNull Canvas c) {
        int i;
        Intrinsics.checkNotNullParameter(c, "c");
        ktc ktcVar = (ktc) this.mChart.getLineData().i(0);
        if (ktcVar == null || ktcVar.O0() == 0) {
            return;
        }
        float fG = this.mViewPortHandler.g() / this.stageCount;
        this.bandPath.reset();
        int i2 = 0;
        while (i2 < ktcVar.O0()) {
            ?? I = ktcVar.i(i2);
            SleepChartStage sleepChartStage = SleepChartStage.values()[RangesKt___RangesKt.coerceAtLeast((int) I.getY(), 0)];
            Integer num = this.stage2H.get(sleepChartStage);
            if (num == null) {
                i2++;
            } else {
                while (true) {
                    i = i2 + 1;
                    if (i >= ktcVar.O0() || ktcVar.i(i).getY() != I.getY()) {
                        break;
                    } else {
                        i2 = i;
                    }
                }
                float fPxX = (float) pxX(I.getX());
                float fPxX2 = (float) pxX(ktcVar.i(i2).getX() + 1.0f);
                float fPxY = (float) (pxY(num.intValue()) - ((double) fG));
                float fPxY2 = (float) pxY(num.intValue());
                Paint paint = this.rectPaint;
                Integer num2 = SleepDataUtilsKt.getSleepChartStageColor().get(sleepChartStage);
                paint.setColor(num2 != null ? num2.intValue() : 0);
                float f = this.rPx;
                c.drawRoundRect(fPxX, fPxY, fPxX2, fPxY2, f, f, this.rectPaint);
                float f2 = fPxY - this.gap;
                if (this.bandPath.isEmpty()) {
                    this.bandPath.moveTo(fPxX, f2);
                } else {
                    this.bandPath.lineTo(fPxX, f2);
                }
                this.bandPath.lineTo(fPxX2, f2);
                i2 = i;
            }
        }
        float fPxX3 = (float) pxX(0.0f);
        this.bandPath.lineTo((float) pxX(ktcVar.i(ktcVar.O0() - 1).getX() + 1.0f), this.mViewPortHandler.f());
        this.bandPath.lineTo(fPxX3, this.mViewPortHandler.f());
        this.bandPath.close();
        this.bandPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.mViewPortHandler.g(), new int[]{1714664959, 3388927}, (float[]) null, Shader.TileMode.CLAMP));
        c.drawPath(this.bandPath, this.bandPaint);
    }
}
