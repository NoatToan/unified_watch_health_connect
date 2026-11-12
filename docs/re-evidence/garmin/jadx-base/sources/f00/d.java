package f00;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf00/d;", "Lf00/c;", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class d extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        lineDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
    }

    @Override // f00.c, com.github.mikephil.charting.renderer.LineChartRenderer
    public final void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        List<GradientColor> gradientColors;
        super.drawDataSet(canvas, iLineDataSet);
        Shader shader = this.mRenderPaint.getShader();
        if (iLineDataSet != null && (gradientColors = iLineDataSet.getGradientColors()) != null) {
            ArrayList arrayList = new ArrayList(y.r(gradientColors, 10));
            Iterator<T> it = gradientColors.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((GradientColor) it.next()).getEndColor()));
            }
            int[] iArrA1 = h0.a1(arrayList);
            RectF contentRect = this.mViewPortHandler.getContentRect();
            this.mRenderPaint.setShader(new LinearGradient(0.0f, contentRect.bottom, 0.0f, contentRect.top, iArrA1, (float[]) null, Shader.TileMode.CLAMP));
        }
        if (iLineDataSet != null && iLineDataSet.getEntryCount() == 1) {
            Entry entryForIndex = iLineDataSet.getEntryForIndex(0);
            entryForIndex.getClass();
            e(entryForIndex, iLineDataSet);
        }
        this.mRenderPaint.setShader(shader);
    }

    public void e(Entry entry, ILineDataSet iLineDataSet) {
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        transformer.getClass();
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float lineWidth = iLineDataSet.getLineWidth() / 2;
        float[] fArr = {entry.getX(), entry.getY()};
        transformer.pointValuesToPixel(fArr);
        Canvas canvas = this.mBitmapCanvas;
        float f14 = fArr[0];
        float f15 = 1;
        float f16 = fArr[1];
        canvas.drawRect(f14 - f15, f16 - lineWidth, f14 + f15, f16 + lineWidth, this.mRenderPaint);
    }
}
