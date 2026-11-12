package g00;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.utils.MPPointF;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg00/b;", "Lg00/c;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f74091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f74092b;

    public b() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f74091a = paint;
        this.f74092b = new Paint(1);
    }

    @Override // g00.c
    public final void a(Integer num, Canvas canvas, float f14, float f15, MPPointF mPPointF, float f16, float f17, PieChart pieChart, float f18, Integer num2) {
        canvas.getClass();
        pieChart.getClass();
        float f19 = f16 - f17;
        float f22 = (f19 / 2.0f) + f17;
        double dIntValue = (((num.intValue() / 100.0f) * f15) + f14) * 0.017453292f;
        float fCos = (((float) Math.cos(dIntValue)) * f22) + mPPointF.f52828x;
        float fSin = (f22 * ((float) Math.sin(dIntValue))) + mPPointF.f52829y;
        Paint paint = this.f74092b;
        if (num2 != null) {
            paint.setColor(num2.intValue());
        }
        if (f18 > 0.0f) {
            pieChart.setLayerType(2, null);
            canvas.drawCircle(fCos, fSin, f18 + f19, this.f74091a);
        }
        canvas.drawCircle(fCos, fSin, f19, paint);
    }
}
