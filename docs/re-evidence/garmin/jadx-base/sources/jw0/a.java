package jw0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljw0/a;", "Lf00/c;", "", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f00.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f101323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint.Cap f101324i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        lineDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
    }

    @Override // f00.c
    /* JADX INFO: renamed from: a */
    public final Float getF67654e() {
        return null;
    }

    @Override // f00.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getF101323h() {
        return this.f101323h;
    }

    @Override // f00.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Paint.Cap getF101324i() {
        return this.f101324i;
    }

    @Override // f00.c
    public final void d() {
        this.f101323h = Float.valueOf(0.0f);
    }

    @Override // f00.c, com.github.mikephil.charting.renderer.LineChartRenderer
    public final void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        List<GradientColor> gradientColors;
        Paint.Cap cap = this.f101324i;
        if (cap != null) {
            this.mRenderPaint.setStrokeCap(cap);
        }
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
        super.drawDataSet(canvas, iLineDataSet);
        this.mRenderPaint.setShader(shader);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry, java.lang.Object] */
    @Override // f00.c
    public final void generateFilledPath(ILineDataSet iLineDataSet, int i14, int i15, Path path) {
        Entry entry;
        path.getClass();
        IFillFormatter fillFormatter = iLineDataSet.getFillFormatter();
        fillFormatter.getClass();
        List<Entry> listA = ((yz.a) fillFormatter).a();
        float phaseY = this.mAnimator.getPhaseY();
        path.reset();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i14);
        if (listA != null && (entry = listA.get(0)) != null) {
            path.moveTo(entryForIndex.getX(), entry.getY());
        }
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        int i16 = i14 + 1;
        if (i16 <= i15) {
            int i17 = i16;
            while (true) {
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i17);
                entryForIndex2.getClass();
                path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                if (i17 == i15) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i16 <= i15) {
            while (true) {
                if (listA != null) {
                    Entry entry2 = listA.get(i15);
                    if (entry2 != null) {
                        path.lineTo(entry2.getX(), entry2.getY() * phaseY);
                    }
                }
                if (i15 == i16) {
                    break;
                } else {
                    i15--;
                }
            }
        }
        path.close();
    }
}
