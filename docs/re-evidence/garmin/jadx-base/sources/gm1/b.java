package gm1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.LayerDrawable;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import hz.f;
import o13.e;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import ql1.d;

/* JADX INFO: loaded from: classes10.dex */
@e
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lgm1/b;", "Lgm1/a;", "Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/chartingv2/components/XAxis;", "xAxis", "Lcom/github/mikephil/chartingv2/utils/Transformer;", "transformer", "", "dotPattern", "labelPattern", "<init>", "(Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;Lcom/github/mikephil/chartingv2/components/XAxis;Lcom/github/mikephil/chartingv2/utils/Transformer;II)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends gm1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f78012t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgm1/b$a;", "Lcom/github/mikephil/chartingv2/components/LimitLine;", "", "startLimit", "endLimit", "<init>", "(FF)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends LimitLine {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f78013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f78014b;

        public a(float f14, float f15) {
            super(f15);
            this.f78013a = f14;
            this.f78014b = f15;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15) {
        super(viewPortHandler, xAxis, transformer, i14, i15);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
    }

    public final void c(Context context, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4) {
        if (dateTime == null || dateTime2 == null) {
            return;
        }
        if (!dateTime.isAfter(dateTime3)) {
            dateTime = dateTime3;
        }
        if (!dateTime2.isBefore(dateTime4)) {
            dateTime2 = dateTime4;
        }
        float axisMinimum = this.mXAxis.getAxisMinimum();
        float axisMaximum = this.mXAxis.getAxisMaximum();
        a aVar = new a(gm1.a.a(dateTime, dateTime3, dateTime4, axisMinimum, axisMaximum), gm1.a.a(dateTime2, dateTime3, dateTime4, axisMinimum, axisMaximum));
        aVar.setTextColor(0);
        aVar.setTextSize(0.0f);
        aVar.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        aVar.setYOffset(-15.0f);
        aVar.setLineWidth(0.0f);
        aVar.setLineColor(a7.b.getColor(context, R.color.gcm_chart_sleep_shade));
        this.mXAxis.addLimitLine(aVar);
    }

    public final void d(Context context, DateTime dateTime, DateTime dateTime2, f fVar) {
        if (dateTime == null || dateTime2 == null) {
            return;
        }
        this.mXAxis.setDrawLimitLinesBehindData(true);
        c(context, fVar.f86396f, fVar.f86397g, dateTime, dateTime2);
        c(context, fVar.f86398h, fVar.f86399i, dateTime, dateTime2);
    }

    public final void e(Context context, DateTime dateTime, DateTime dateTime2, f fVar) {
        LayerDrawable layerDrawableA = d.a(R.drawable.sleep, context);
        LayerDrawable layerDrawableA2 = d.a(R.drawable.alarms, context);
        if (dateTime == null || dateTime2 == null || layerDrawableA == null || layerDrawableA2 == null) {
            return;
        }
        b(context, fVar.f86396f, dateTime, dateTime2, layerDrawableA);
        b(context, fVar.f86397g, dateTime, dateTime2, layerDrawableA2);
        b(context, fVar.f86398h, dateTime, dateTime2, layerDrawableA);
        b(context, fVar.f86399i, dateTime, dateTime2, layerDrawableA2);
    }

    @Override // gm1.a, com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public final void renderLimitLineLine(Canvas canvas, LimitLine limitLine, float[] fArr) {
        float fContentTop;
        if (!(limitLine instanceof a) || this.f78011s) {
            super.renderLimitLineLine(canvas, limitLine, fArr);
            return;
        }
        a aVar = (a) limitLine;
        float[] fArr2 = {aVar.f78013a, 0.0f};
        float[] fArr3 = {aVar.f78014b, 0.0f};
        float f14 = this.f78012t;
        if (f14 > 0.0f) {
            float[] fArr4 = {0.0f, f14};
            this.mTrans.pointValuesToPixel(fArr4);
            fContentTop = fArr4[1];
        } else {
            fContentTop = this.mViewPortHandler.contentTop();
        }
        float f15 = fContentTop;
        this.mTrans.pointValuesToPixel(fArr2);
        this.mTrans.pointValuesToPixel(fArr3);
        Paint paint = new Paint(this.mLimitLinePaint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(aVar.getLineColor());
        if (canvas != null) {
            canvas.drawRect(fArr2[0], f15, fArr3[0], this.mViewPortHandler.contentBottom(), paint);
        }
    }
}
