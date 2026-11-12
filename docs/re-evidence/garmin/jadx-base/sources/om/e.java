package om;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import c22.o;
import c22.u;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.HashMap;
import java.util.List;
import mz.f;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class e extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f132890t = (int) Utils.convertDpToPixel(35.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f132891u = (int) Utils.convertDpToPixel(25.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap<Double, Double> f132892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f132893s;

    public e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15, boolean z14, int i16, int i17, int i18) {
        super(viewPortHandler, xAxis, transformer, i14, i15, z14, i16, f132890t, f132891u, -1.0f);
        Paint paint = new Paint();
        this.f132893s = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, float f14, float f15, double d14) {
        int i14;
        if (d14 >= 348.75d || d14 < 11.25d) {
            i14 = 2131233720;
        } else {
            if ((d14 >= 11.25d) && (d14 < 33.75d)) {
                i14 = 2131233719;
            } else {
                if ((d14 >= 33.75d) && (d14 < 56.25d)) {
                    i14 = 2131233718;
                } else {
                    if ((d14 >= 56.25d) && (d14 < 78.75d)) {
                        i14 = 2131233716;
                    } else {
                        if ((d14 >= 78.75d) && (d14 < 101.25d)) {
                            i14 = 2131233715;
                        } else {
                            if ((d14 >= 101.25d) && (d14 < 123.75d)) {
                                i14 = 2131233714;
                            } else {
                                if ((d14 >= 123.75d) && (d14 < 146.25d)) {
                                    i14 = 2131233713;
                                } else {
                                    if ((d14 >= 146.25d) && (d14 < 168.75d)) {
                                        i14 = 2131233712;
                                    } else {
                                        if ((d14 >= 168.75d) && (d14 < 191.25d)) {
                                            i14 = 2131233726;
                                        } else {
                                            if ((d14 >= 191.25d) && (d14 < 213.75d)) {
                                                i14 = 2131233725;
                                            } else {
                                                if ((d14 >= 213.75d) && (d14 < 236.25d)) {
                                                    i14 = 2131233724;
                                                } else {
                                                    if ((d14 >= 236.25d) && (d14 < 258.75d)) {
                                                        i14 = 2131233717;
                                                    } else {
                                                        if ((d14 >= 258.75d) && (d14 < 281.25d)) {
                                                            i14 = 2131233711;
                                                        } else {
                                                            if ((d14 >= 281.25d) && (d14 < 303.75d)) {
                                                                i14 = 2131233723;
                                                            } else {
                                                                if ((d14 >= 303.75d) && (d14 < 326.25d)) {
                                                                    i14 = 2131233722;
                                                                } else {
                                                                    i14 = ((d14 > 326.25d ? 1 : (d14 == 326.25d ? 0 : -1)) >= 0) & (d14 < 348.75d) ? 2131233721 : -1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Bitmap bitmapDecodeResource = i14 != -1 ? BitmapFactory.decodeResource(((o) KoinJavaComponent.get(o.class)).h(), i14) : null;
        if (bitmapDecodeResource != null) {
            canvas.drawBitmap(bitmapDecodeResource, f14, f15, this.f132893s);
        }
    }

    @Override // mz.f, com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, PointF pointF) {
        Canvas canvas2;
        float f15;
        Integer numB;
        HashMap<Double, Double> map = this.f132892r;
        if (map != null) {
            float fConvertDpToPixel = Utils.convertDpToPixel(15.0f);
            List<String> values = this.mXAxis.getValues();
            float f16 = this.mViewPortHandler.getContentRect().left;
            while (f16 < this.mViewPortHandler.getContentRect().right) {
                String str = values.get((int) this.mTrans.getValuesByTouchPoint(f16, f14).f52835x);
                if (str == null || (numB = u.b(str)) == null) {
                    canvas2 = canvas;
                    f15 = f14;
                } else {
                    double dDoubleValue = numB.doubleValue();
                    Double d14 = map.get(Double.valueOf(dDoubleValue));
                    if (d14 != null) {
                        double dDoubleValue2 = d14.doubleValue();
                        canvas2 = canvas;
                        f15 = f14;
                        a(canvas2, f16, f15, dDoubleValue2);
                    } else {
                        canvas2 = canvas;
                        f15 = f14;
                        Double dC = u.c(map, dDoubleValue);
                        if (dC != null) {
                            a(canvas2, f16, f15, dC.doubleValue());
                        }
                    }
                }
                f16 += fConvertDpToPixel;
                canvas = canvas2;
                f14 = f15;
            }
        }
        super.drawLabels(canvas, f14, pointF);
    }

    public e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15) {
        this(viewPortHandler, xAxis, transformer, i14, i15, false, -1, -1, -1);
    }

    public e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15, boolean z14) {
        this(viewPortHandler, xAxis, transformer, i14, i15, z14, -1, -1, -1);
    }

    public e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15, boolean z14, HashMap<Double, Double> map) {
        this(viewPortHandler, xAxis, transformer, i14, i15, z14, -1, -1, -1);
        this.f132892r = map;
    }

    public e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15, int i16) {
        this(viewPortHandler, xAxis, transformer, i14, i15, false, i16, -1, -1);
    }

    public e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        this(viewPortHandler, xAxis, transformer, -1, -1, false, -1, -1, -1);
    }
}
