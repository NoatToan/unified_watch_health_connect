package es0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.y;
import w5.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Les0/a;", "Lh00/b;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lcom/github/mikephil/charting/utils/Transformer;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h00.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f65175o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<p<Integer, Integer>> f65176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f65177n;

    static {
        new C1384a(null);
        f65175o = (int) Utils.convertDpToPixel(4.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(LineChart lineChart, Transformer transformer) {
        lineChart.getClass();
        transformer.getClass();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        viewPortHandler.getClass();
        XAxis xAxis = lineChart.getXAxis();
        xAxis.getClass();
        super(viewPortHandler, xAxis, transformer);
        this.f65176m = j0.f134944a;
        Paint paint = new Paint();
        this.f65177n = paint;
        paint.setColor(a7.b.getColor(lineChart.getContext(), R.color.gcm_jet_lag_travel_legend));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        Canvas canvas2;
        Object next;
        int i14 = this.mAxis.mEntryCount * 120;
        int i15 = i14 + 2;
        float[] fArr = new float[i15];
        int i16 = i14 + 1;
        int iN = r.n(0, i16, 2);
        float f15 = 2.0f;
        if (iN >= 0) {
            int i17 = 0;
            while (true) {
                fArr[i17] = i17 / 2.0f;
                if (i17 == iN) {
                    break;
                } else {
                    i17 += 2;
                }
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        List<p<Integer, Integer>> list = this.f65176m;
        ArrayList<p> arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int iIntValue = ((Number) pVar.f128594a).intValue() * 2;
            int iIntValue2 = ((Number) pVar.f128595b).intValue() * 2;
            if (iIntValue >= i15 || iIntValue < 0 || iIntValue2 >= i15 || iIntValue2 < 0) {
                return;
            } else {
                arrayList.add(new p(Float.valueOf(fArr[iIntValue]), Float.valueOf(fArr[iIntValue2])));
            }
        }
        int iN2 = r.n(0, i16, 120);
        if (iN2 >= 0) {
            int i18 = 0;
            while (true) {
                float f16 = fArr[i18];
                if (this.mViewPortHandler.isInBoundsX(f16)) {
                    String str = i18 % 480 == 0 ? "●" : "•";
                    canvas2 = canvas;
                    Utils.drawXAxisValue(canvas2, str, f16, (f14 + 24.0f) - f65175o, this.f80599c, mPPointF, 0.0f);
                } else {
                    canvas2 = canvas;
                }
                if (i18 == iN2) {
                    break;
                }
                i18 += 120;
                f15 = f15;
            }
        } else {
            canvas2 = canvas;
            f15 = 2.0f;
        }
        for (p pVar2 : arrayList) {
            float f17 = (f14 + 24.0f) - 2;
            RectF rectF = new RectF(((Number) pVar2.f128594a).floatValue(), f17, ((Number) pVar2.f128595b).floatValue(), 20.0f + f17);
            if (canvas2 != null) {
                canvas2.drawRoundRect(rectF, 8.0f, 8.0f, this.f65177n);
            }
        }
        List<xz.h> list2 = this.f80600d;
        if (list2 != null) {
            for (xz.h hVar : list2) {
                int i19 = hVar.f192754a * 2;
                if (i19 >= i15) {
                    return;
                }
                float f18 = fArr[i19];
                if (this.mViewPortHandler.isInBoundsX(f18)) {
                    Drawable drawable = hVar.f192755b;
                    if (drawable != null) {
                        Utils.drawImage(canvas2, drawable, (int) f18, (int) (f14 + 24.0f + 6), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    }
                    String str2 = hVar.f192756c;
                    if (str2 != null) {
                        float fOffsetRight = 0.0f;
                        if (str2 != null) {
                            Rect rect = new Rect();
                            Paint paint = this.f80598b;
                            if (paint != null) {
                                paint.getTextBounds(str2, 0, str2.length(), rect);
                            }
                            int i24 = rect.right;
                            if ((i24 / 2) + f18 > this.mViewPortHandler.offsetRight() + this.mViewPortHandler.contentRight()) {
                                fOffsetRight = (i24 / f15) - this.mViewPortHandler.offsetRight();
                            }
                        }
                        float f19 = f18 - fOffsetRight;
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            p pVar3 = (p) next;
                            float fFloatValue = ((Number) pVar3.f128594a).floatValue();
                            float fFloatValue2 = ((Number) pVar3.f128595b).floatValue();
                            if (fFloatValue <= f19 && f19 <= fFloatValue2) {
                                break;
                            }
                        }
                        if (((p) next) == null) {
                            Utils.drawXAxisValue(canvas, str2, f19, pz.d.f141918a + f14 + 24.0f, this.f80598b, mPPointF, this.mXAxis.getLabelRotationAngle());
                        }
                    }
                }
                canvas2 = canvas;
            }
        }
    }

    /* JADX INFO: renamed from: es0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Les0/a$a;", "", "<init>", "()V", "", "SMALL_MARK", "Ljava/lang/String;", "LARGE_MARK", "", "AXIS_TOP_PADDING", "F", "", "MINUTES_IN_AN_HOUR", "I", "LARGE_DOT_OFFSET", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1384a {
        public /* synthetic */ C1384a(j jVar) {
            this();
        }

        private C1384a() {
        }
    }
}
