package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.AGPDetailList;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseLineChartData;
import com.xiaomi.fitness.chart.entrys.FingerBSList;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public class c5c extends z4c<RecyclerBarEntry, vfe> {
    public Boolean n;
    public int[] o;
    public float[] p;
    public Paint q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint f4936r;
    public Paint s;
    public Paint t;
    public Float u;
    public Float v;

    public c5c(vfe vfeVar, onq onqVar) {
        super(vfeVar, onqVar);
        this.n = Boolean.FALSE;
        Float fValueOf = Float.valueOf(1.0f);
        this.u = fValueOf;
        this.v = fValueOf;
        u();
    }

    public void m(List<Integer> list, List<Float> list2, rtr rtrVar) {
        int size = list2.size() + 1;
        float[] fArr = new float[size];
        float axisMaximum = rtrVar.getAxisMaximum();
        float f = axisMaximum - 0.0f;
        Collections.reverse(list2);
        for (int i = 0; i < list2.size(); i++) {
            if (i > 0) {
                int i2 = i - 1;
                fArr[i] = ((list2.get(i2).floatValue() - list2.get(i).floatValue()) / f) + fArr[i2];
            } else {
                fArr[i] = (axisMaximum - list2.get(i).floatValue()) / f;
            }
        }
        fArr[list2.size()] = 1.0f;
        int i3 = size * 2;
        this.o = new int[i3];
        this.p = new float[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            this.o[i4] = list.get(i5).intValue();
            int i6 = i4 + 1;
            this.o[i6] = list.get(i5).intValue();
            if (i5 == 0) {
                this.p[i4] = 0.0f;
            } else {
                this.p[i4] = fArr[i5 - 1];
            }
            this.p[i6] = fArr[i5];
            i4 += 2;
        }
    }

    public <T extends RecyclerBarEntry> void n(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        int i;
        float f;
        List<AGPDetailList> list;
        float f2;
        int childCount = recyclerView.getChildCount();
        this.s.setStrokeWidth(DisplayUtil.dip2px(1.0f));
        this.s.setStrokeCap(Paint.Cap.ROUND);
        this.s.setStrokeJoin(Paint.Join.ROUND);
        float paddingTop = recyclerView.getPaddingTop();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - ((vfe) this.c).f625a;
        float bottom = recyclerView.getBottom() - recyclerView.getPaddingBottom();
        float top = recyclerView.getTop() + recyclerView.getPaddingTop();
        this.u = Float.valueOf(((vfe) this.c).f626b + height);
        this.v = Float.valueOf((height - paddingTop) / rtrVar.getAxisMaximum());
        if (childCount <= 0) {
            return;
        }
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = recyclerView.getChildAt(i2);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry instanceof BloodGlucoseEntry) {
                List<AGPDetailList> drawAGPList = ((BloodGlucoseEntry) recyclerBarEntry).getDrawAGPList();
                float width = childAt.getWidth();
                float right = childAt.getRight();
                childAt.getLeft();
                if (drawAGPList.size() > 0) {
                    int i3 = 0;
                    while (i3 < drawAGPList.size()) {
                        AGPDetailList aGPDetailList = drawAGPList.get(i3);
                        int size = aGPDetailList.getListValueTop().size();
                        List<Float> listValueTop = aGPDetailList.getListValueTop();
                        List<Float> listValueBottom = aGPDetailList.getListValueBottom();
                        if (size <= 1) {
                            i = i2;
                            f = right;
                            list = drawAGPList;
                            f2 = top;
                        } else {
                            float f3 = width / (size - 1);
                            boolean z = false;
                            Logger.i("thisValueAGPDetail   " + aGPDetailList.getTypeValue() + "  " + size + "  " + childCount, new Object[0]);
                            int i4 = 1;
                            while (i4 < size) {
                                Path path = new Path();
                                int i5 = i4 - 1;
                                int i6 = size;
                                List<AGPDetailList> list2 = drawAGPList;
                                float fK = eu3.k(listValueBottom.get(i5).floatValue(), recyclerView, rtrVar, this.c);
                                int i7 = i2;
                                float fK2 = eu3.k(listValueTop.get(i5).floatValue(), recyclerView, rtrVar, this.c);
                                float f4 = right - (i5 * f3);
                                path.moveTo(f4, fK2);
                                if (aGPDetailList.getTypeValue() != 3) {
                                    path.lineTo(f4, fK);
                                }
                                float fK3 = eu3.k(listValueBottom.get(i4).floatValue(), recyclerView, rtrVar, this.c);
                                float fK4 = eu3.k(listValueTop.get(i4).floatValue(), recyclerView, rtrVar, this.c);
                                if (aGPDetailList.getTypeValue() != 3) {
                                    path.lineTo(right - (i4 * f3), fK3);
                                }
                                path.lineTo(right - (i4 * f3), fK4);
                                path.close();
                                List<Float> list3 = listValueBottom;
                                List<Float> list4 = listValueTop;
                                float f5 = right;
                                float f6 = top;
                                this.q.setShader(new LinearGradient(0.0f, bottom, 0.0f, top, new int[]{s(aGPDetailList.getTypeValue()), s(aGPDetailList.getTypeValue())}, (float[]) null, Shader.TileMode.CLAMP));
                                if (aGPDetailList.getTypeValue() == 3) {
                                    this.s.setColor(s(aGPDetailList.getTypeValue()));
                                    canvas.drawPath(path, this.s);
                                } else {
                                    new xfe(this.q, path).draw(canvas);
                                }
                                i4++;
                                z = false;
                                drawAGPList = list2;
                                size = i6;
                                i2 = i7;
                                top = f6;
                                right = f5;
                                listValueBottom = list3;
                                listValueTop = list4;
                            }
                            i = i2;
                            f = right;
                            list = drawAGPList;
                            f2 = top;
                        }
                        i3++;
                        childCount = childCount;
                        width = width;
                        drawAGPList = list;
                        i2 = i;
                        top = f2;
                        right = f;
                    }
                }
            }
            i2++;
            childCount = childCount;
            top = top;
        }
    }

    public <T extends RecyclerBarEntry> void o(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        Path path;
        int i;
        int i2;
        boolean z;
        int childCount = recyclerView.getChildCount();
        this.s.setStrokeWidth(DisplayUtil.dip2px(1.0f));
        Path path2 = new Path();
        float paddingTop = recyclerView.getPaddingTop();
        float height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        E e = this.c;
        float f = height - ((vfe) e).f625a;
        this.u = Float.valueOf(((vfe) e).f626b + f);
        this.v = Float.valueOf((f - paddingTop) / rtrVar.getAxisMaximum());
        if (childCount <= 0) {
            return;
        }
        BloodGlucoseLineChartData bloodGlucoseLineChartData = null;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < childCount) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry instanceof BloodGlucoseEntry) {
                BloodGlucoseEntry bloodGlucoseEntry = (BloodGlucoseEntry) recyclerBarEntry;
                bloodGlucoseEntry.getItem().clear();
                List<BloodGlucoseLineChartData> values = bloodGlucoseEntry.getValues();
                float width = childAt.getWidth();
                float size = width / values.size();
                boolean z3 = z2;
                float right = childAt.getRight();
                float left = childAt.getLeft();
                float f2 = width / 288.0f;
                if (values.size() > 0) {
                    float fK = eu3.k(values.get(0).getValue(), recyclerView, rtrVar, this.c);
                    if (i3 > 0 && bloodGlucoseLineChartData != null) {
                        fK = eu3.k(bloodGlucoseLineChartData.getValue(), recyclerView, rtrVar, this.c);
                    }
                    path2.moveTo(right, fK);
                    int i4 = 0;
                    while (i4 < values.size()) {
                        if (values.get(i4).getValue() < 0.0f || values.get(i4).getValue() > 25.0f) {
                            z = true;
                            z3 = false;
                        } else {
                            z = false;
                        }
                        int i5 = i3;
                        float fK2 = eu3.k(values.get(i4).getValue(), recyclerView, rtrVar, this.c);
                        if (z) {
                            path2.moveTo(right - (i4 * size), fK2);
                        } else if (z3) {
                            path2.lineTo(right - (i4 * size), fK2);
                        } else {
                            float f3 = right - (i4 * size);
                            path2.moveTo(f3, fK2);
                            if (i4 > 0) {
                                path2.lineTo(f3 + (0.3f * f2), fK2);
                            } else {
                                path2.lineTo(f3 - (0.3f * f2), fK2);
                            }
                            z3 = true;
                        }
                        if (bloodGlucoseEntry.getHighLightType() == 1) {
                            this.s.setAlpha(255);
                            float f4 = i4;
                            bloodGlucoseEntry.getItem().add(new Pair<>(Float.valueOf(right - ((f4 + 0.5f) * size)), Float.valueOf(right - ((f4 - 0.5f) * size))));
                        } else {
                            this.s.setAlpha(50);
                        }
                        i4++;
                        i3 = i5;
                        path2 = path2;
                    }
                    path = path2;
                    i = i3;
                    bloodGlucoseLineChartData = values.get(values.size() - 1);
                } else {
                    path = path2;
                    i = i3;
                }
                z2 = z3;
                List<FingerBSList> fingerBSList = bloodGlucoseEntry.getFingerBSList();
                int i6 = 0;
                while (i6 < fingerBSList.size()) {
                    boolean z4 = z2;
                    float time = fingerBSList.get(i6).getTime();
                    BloodGlucoseLineChartData bloodGlucoseLineChartData2 = bloodGlucoseLineChartData;
                    if (values.size() > 1) {
                        i2 = i6;
                        float f5 = (((time - recyclerBarEntry.timestamp) / 86400.0f) * width) + left;
                        float fK3 = eu3.k(fingerBSList.get(i2).getValue(), recyclerView, rtrVar, this.c);
                        this.f4936r.setColor(t(fingerBSList.get(i2).getLevelType()));
                        this.f4936r.setStrokeWidth(DisplayUtil.dip2px(4.0f));
                        if (bloodGlucoseEntry.getHighLightType() == 2) {
                            this.f4936r.setAlpha(255);
                            float f6 = size * 0.5f;
                            bloodGlucoseEntry.getItem().add(new Pair<>(Float.valueOf(f5 - f6), Float.valueOf(f5 + f6)));
                        } else {
                            this.f4936r.setAlpha(25);
                        }
                        canvas.drawCircle(f5, fK3, ((vfe) this.c).K0, this.f4936r);
                    } else {
                        size = size;
                        i2 = i6;
                    }
                    i6 = i2 + 1;
                    recyclerView = recyclerView;
                    rtrVar = rtrVar;
                    z2 = z4;
                    bloodGlucoseLineChartData = bloodGlucoseLineChartData2;
                    size = size;
                }
            } else {
                path = path2;
                i = i3;
                paddingTop = paddingTop;
            }
            i3 = i + 1;
            paddingTop = paddingTop;
            childCount = childCount;
            f = f;
            path2 = path;
        }
        this.s.setShader(new LinearGradient(0.0f, paddingTop, 0.0f, f, this.o, this.p, Shader.TileMode.CLAMP));
        canvas.drawPath(path2, this.s);
    }

    public void p(Canvas canvas, RecyclerView recyclerView, float f, float f2, float f3) {
        float paddingLeft = recyclerView.getPaddingLeft();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingTop = recyclerView.getPaddingTop();
        float height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        E e = this.c;
        float f4 = height - ((vfe) e).f625a;
        float f5 = f4 - paddingTop;
        float f6 = (f4 - ((f2 * f5) / f)) + ((vfe) e).f626b;
        float f7 = (f4 - ((f5 * f3) / f)) + ((vfe) e).f626b;
        float[] fArr = {paddingLeft, f6, width, f6};
        float[] fArr2 = {paddingLeft, f7, width, f7};
        this.t.setColor(x44.a(iji.n));
        Paint paint = this.t;
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        paint.setPathEffect(new DashPathEffect(new float[]{displayUtil.dip2pxF(4.0f), displayUtil.dip2pxF(1.5f)}, 0.0f));
        canvas.drawLines(fArr, this.t);
        canvas.drawLines(fArr2, this.t);
    }

    public void q(Canvas canvas, RecyclerView recyclerView, float f, float f2, float f3) {
        float paddingTop = recyclerView.getPaddingTop();
        float height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        E e = this.c;
        float f4 = height - ((vfe) e).f625a;
        float f5 = f4 - paddingTop;
        float f6 = ((vfe) e).f626b;
        float f7 = ((vfe) e).f626b;
        float f8 = (f4 - ((f2 * f5) / f)) + ((vfe) e).f626b;
        float f9 = (f4 - ((f5 * f3) / f)) + ((vfe) e).f626b;
        float f10 = ((vfe) e).f626b;
        float f11 = ((vfe) e).f626b;
        r(canvas, recyclerView, f8, f9);
    }

    public void r(Canvas canvas, RecyclerView recyclerView, float f, float f2) {
        float paddingLeft = recyclerView.getPaddingLeft();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        PointF pointF = new PointF(paddingLeft, f);
        PointF pointF2 = new PointF(width, f);
        E e = this.c;
        this.q.setShader(new LinearGradient(0.0f, f, 0.0f, f2, new int[]{((vfe) e).m0, ((vfe) e).m0}, (float[]) null, Shader.TileMode.CLAMP));
        new xfe(this.q, eu3.a(pointF, pointF2, f2)).draw(canvas);
    }

    public final int s(int i) {
        if (i != 1) {
            return i != 2 ? x44.a(iji.o) : x44.a(iji.q);
        }
        return x44.a(iji.p);
    }

    public final int t(int i) {
        if (i == 1 || i == 0) {
            return x44.a(iji.M2);
        }
        return (i == 2 || i == 3) ? x44.a(iji.O2) : x44.a(iji.P2);
    }

    public void u() {
        Paint paint = new Paint();
        this.q = paint;
        paint.reset();
        this.q.setAntiAlias(true);
        this.q.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f4936r = paint2;
        paint2.reset();
        this.f4936r.setAntiAlias(true);
        Paint paint3 = this.f4936r;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        this.f4936r.setColor(((vfe) this.c).O0);
        Paint paint4 = new Paint();
        this.s = paint4;
        paint4.reset();
        this.s.setAntiAlias(true);
        this.s.setStyle(style);
        Paint paint5 = this.s;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint5.setStrokeCap(cap);
        this.s.setStrokeWidth(((vfe) this.c).N0);
        this.s.setColor(((vfe) this.c).O0);
        Paint paint6 = new Paint();
        this.t = paint6;
        paint6.reset();
        this.t.setAntiAlias(true);
        this.t.setStyle(style);
        this.t.setStrokeCap(cap);
        this.t.setStrokeWidth(((vfe) this.c).N0);
        this.t.setColor(((vfe) this.c).O0);
    }

    public void v(onq onqVar) {
        this.g = onqVar;
    }
}
