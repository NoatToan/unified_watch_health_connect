package gm1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import j20.x;
import java.util.LinkedHashMap;
import mz.f;
import o13.e;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@e
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgm1/a;", "Lmz/f;", "Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/chartingv2/components/XAxis;", "xAxis", "Lcom/github/mikephil/chartingv2/utils/Transformer;", "transformer", "", "dotPattern", "labelPattern", "<init>", "(Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;Lcom/github/mikephil/chartingv2/components/XAxis;Lcom/github/mikephil/chartingv2/utils/Transformer;II)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f78010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f78011s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15) {
        super(viewPortHandler, xAxis, transformer, i14, i15);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        this.f78010r = new LinkedHashMap();
    }

    public static float a(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, float f14, float f15) {
        if (dateTime == null || dateTime2 == null || dateTime3 == null) {
            return Float.MIN_VALUE;
        }
        if ((!dateTime2.isBefore(dateTime3) && !dateTime2.isEqual(dateTime3)) || f14 > f15) {
            return Float.MIN_VALUE;
        }
        return (float) Math.rint(x.a(f15, f14, (dateTime.getMillis() - dateTime2.getMillis()) / (dateTime3.getMillis() - dateTime2.getMillis()), f14));
    }

    public final void b(Context context, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, LayerDrawable layerDrawable) {
        context.getClass();
        if (dateTime == null || dateTime2 == null || dateTime3 == null) {
            return;
        }
        float axisMinimum = this.mXAxis.getAxisMinimum();
        float axisMaximum = this.mXAxis.getAxisMaximum();
        float fA = a(dateTime, dateTime2, dateTime3, axisMinimum, axisMaximum);
        if (axisMinimum > fA || fA > axisMaximum) {
            return;
        }
        float axisMinimum2 = this.mXAxis.getAxisMinimum();
        if (fA > this.mXAxis.getAxisMaximum() || axisMinimum2 > fA) {
            return;
        }
        LimitLine limitLine = new LimitLine(fA);
        limitLine.setLabel("");
        limitLine.setTextColor(a7.b.getColor(context, R.color.gcm_text_primary));
        limitLine.setTextSize(10.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        limitLine.setYOffset(-15.0f);
        limitLine.setLineWidth(0.0f);
        limitLine.setLineColor(0);
        this.mXAxis.addLimitLine(limitLine);
        this.f78010r.put(limitLine, layerDrawable);
    }

    @Override // mz.f, com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, PointF pointF) {
        this.f121635j = true;
        super.drawLabels(canvas, f14, pointF);
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public final void renderAxisLabels(Canvas canvas) {
        super.renderAxisLabels(canvas);
        this.f78011s = true;
        renderLimitLines(canvas);
        this.f78011s = false;
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public final void renderLimitLineLabel(Canvas canvas, LimitLine limitLine, float[] fArr, float f14) {
        canvas.getClass();
        limitLine.getClass();
        fArr.getClass();
        this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
        this.mLimitLinePaint.setPathEffect(null);
        this.mLimitLinePaint.setColor(limitLine.getTextColor());
        this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
        this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
        this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
        Drawable drawable = (Drawable) this.f78010r.get(limitLine);
        if (drawable != null) {
            float minimumWidth = drawable.getMinimumWidth();
            float minimumHeight = drawable.getMinimumHeight();
            float xOffset = limitLine.getXOffset() + limitLine.getLineWidth();
            float f15 = 2;
            float f16 = minimumWidth / f15;
            float f17 = minimumHeight / f15;
            drawable.setBounds((int) ((fArr[0] + xOffset) - f16), (int) ((this.mViewPortHandler.contentBottom() - f14) - f17), (int) (fArr[0] + xOffset + f16), (int) ((this.mViewPortHandler.contentBottom() - f14) + f17));
            drawable.draw(canvas);
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public void renderLimitLineLine(Canvas canvas, LimitLine limitLine, float[] fArr) {
        if (this.f78011s) {
            return;
        }
        super.renderLimitLineLine(canvas, limitLine, fArr);
    }
}
