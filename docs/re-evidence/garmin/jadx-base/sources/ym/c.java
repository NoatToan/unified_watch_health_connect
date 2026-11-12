package ym;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.j;
import java.util.List;
import p005kotlin.Metadata;
import ps.w0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lym/c;", "Lh00/j;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lps/w0;", "jumpData", "Lfz/c;", "xAxisType", "", "isUsingMetric", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;Landroid/content/Context;Ljava/util/List;Lfz/c;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<w0> f197879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fz.c f197880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f197881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f197882k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, Context context, List<w0> list, fz.c cVar, boolean z14) {
        super(viewPortHandler, xAxis, transformer, cVar, z14, null, 32, null);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        context.getClass();
        cVar.getClass();
        this.f197879h = list;
        this.f197880i = cVar;
        this.f197881j = a7.b.getDrawable(context, 2131232693);
        this.f197882k = new float[]{0.0f, 0.0f};
    }

    @Override // h00.j
    public final void a(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16, boolean z14) {
        float f17;
        if (!z14) {
            drawLabel(canvas, str, f14, f15, mPPointF, f16);
            return;
        }
        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, str);
        float fOffsetRight = this.mViewPortHandler.offsetRight() * 2;
        j.a aVar = j.f80622d;
        if (fCalcTextWidth <= fOffsetRight || fCalcTextWidth + f14 <= this.mViewPortHandler.getChartWidth()) {
            f17 = f14;
        } else {
            aVar.getClass();
            f17 = f14 - j.f80625g;
        }
        Utils.drawXAxisValue(canvas, "●", f14, this.mViewPortHandler.contentBottom() - (Utils.calcTextHeight(this.mAxisLabelPaint, "●") * 1.5f), this.mAxisLabelPaint, mPPointF, 0.0f);
        aVar.getClass();
        Utils.drawXAxisValue(canvas, str, f17, f15 + j.f80624f, this.mAxisLabelPaint, mPPointF, f16);
    }

    @Override // h00.j, com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        j.f80622d.getClass();
        Utils.drawXAxisValue(canvas, str, f14, f15 + j.f80624f, this.mAxisLabelPaint, mPPointF, f16);
        Utils.drawXAxisValue(canvas, "●", f14, this.mViewPortHandler.contentBottom() - (Utils.calcTextHeight(this.mAxisLabelPaint, "●") * 1.5f), this.mAxisLabelPaint, mPPointF, 0.0f);
    }

    @Override // h00.j, com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        Drawable drawable;
        super.drawLabels(canvas, f14, mPPointF);
        List<w0> list = this.f197879h;
        if (list == null || list.isEmpty() || (drawable = this.f197881j) == null) {
            return;
        }
        for (w0 w0Var : list) {
            int i14 = this.f197880i == fz.c.TIME ? w0Var.f140252h : w0Var.f140253i;
            float[] fArr = this.f197882k;
            fArr[0] = i14;
            this.mTrans.pointValuesToPixel(fArr);
            Utils.drawImage(canvas, this.f197881j, (int) fArr[0], (int) this.mViewPortHandler.contentBottom(), drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
        }
    }

    public /* synthetic */ c(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, Context context, List list, fz.c cVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(viewPortHandler, xAxis, transformer, context, list, cVar, (i14 & 64) != 0 ? true : z14);
    }
}
