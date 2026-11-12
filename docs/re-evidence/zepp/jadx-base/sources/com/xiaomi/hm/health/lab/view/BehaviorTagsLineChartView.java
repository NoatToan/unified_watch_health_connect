package com.xiaomi.hm.health.lab.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.lab.utils.LabTools;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTagsLineChartView extends View {
    private static final int C = 10000;
    private static final int D = 10;
    private static final int E = 13;
    public boolean A;
    public int B;
    private i a;
    private int b;
    private int c;
    private float d;
    private float e;
    private float f;
    private float g;
    private c h;
    private e i;
    private f j;
    private g k;
    private a l;
    private b m;
    private GestureDetector n;
    private VelocityTracker o;
    private Scroller p;
    private List<float[]> q;
    private ArrayList<float[]> r;
    private boolean[] s;
    private Typeface t;
    private int u;
    private int v;
    private boolean w;
    private int x;
    private int y;
    public SparseArray<List<h>> z;

    public class a {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public TextPaint f;

        public a(float f) {
            this.d = LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 10.0f);
            this.e = LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 0.3f);
            TextPaint textPaint = new TextPaint();
            this.f = textPaint;
            textPaint.setTextSize(LabTools.sp2px(BehaviorTagsLineChartView.this.getContext(), f));
            this.f.setTypeface(BehaviorTagsLineChartView.this.t);
            this.f.setAntiAlias(true);
            this.f.setColor(Color.parseColor("#4EFFFFFF"));
            this.f.setStrokeWidth(this.e);
            this.f.setStyle(Paint.Style.FILL);
            if (LabTools.isRTL()) {
                this.f.setTextAlign(Paint.Align.LEFT);
            } else {
                this.f.setTextAlign(Paint.Align.RIGHT);
            }
        }
    }

    public class b {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public TextPaint f;
        public Paint g;
        public float h;

        public b(float f) {
            this.d = LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 10.0f);
            this.e = LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 0.3f);
            TextPaint textPaint = new TextPaint();
            this.f = textPaint;
            textPaint.setTypeface(BehaviorTagsLineChartView.this.t);
            this.f.setTextSize(LabTools.sp2px(BehaviorTagsLineChartView.this.getContext(), f));
            this.f.setAntiAlias(true);
            this.f.setColor(Color.parseColor("#4EFFFFFF"));
            this.f.setStrokeWidth(this.e);
            this.f.setStyle(Paint.Style.FILL);
            if (LabTools.isRTL()) {
                this.f.setTextAlign(Paint.Align.LEFT);
            } else {
                this.f.setTextAlign(Paint.Align.RIGHT);
            }
            Paint paint = new Paint();
            this.g = paint;
            paint.setAntiAlias(true);
            this.g.setColor(Color.parseColor("#4EFFFFFF"));
            this.g.setStrokeWidth(this.e);
            this.g.setStyle(Paint.Style.STROKE);
            float fDp2px = LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 5.0f);
            this.g.setPathEffect(new DashPathEffect(new float[]{fDp2px, fDp2px, fDp2px, fDp2px}, 1.0f));
        }
    }

    public static class c {
        public float a;
        public float b;
        public float c;
        public float d;
    }

    public class d extends GestureDetector.SimpleOnGestureListener {
        private d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            BehaviorTagsLineChartView behaviorTagsLineChartView = BehaviorTagsLineChartView.this;
            behaviorTagsLineChartView.B = (-behaviorTagsLineChartView.u) * BehaviorTagsLineChartView.this.j.g;
            BehaviorTagsLineChartView behaviorTagsLineChartView2 = BehaviorTagsLineChartView.this;
            if (behaviorTagsLineChartView2.B + f <= 0.0f) {
                behaviorTagsLineChartView2.p.forceFinished(true);
                BehaviorTagsLineChartView.this.p.fling(BehaviorTagsLineChartView.this.p.getCurrX(), 0, (int) (-f), 0, BehaviorTagsLineChartView.this.B, 0, 0, 0);
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (BehaviorTagsLineChartView.this.v <= 0) {
                int i = BehaviorTagsLineChartView.this.v;
                BehaviorTagsLineChartView behaviorTagsLineChartView = BehaviorTagsLineChartView.this;
                if (i >= behaviorTagsLineChartView.B) {
                    behaviorTagsLineChartView.l();
                    BehaviorTagsLineChartView.this.smoothScrollBy((int) f, 0);
                    return super.onScroll(motionEvent, motionEvent2, f, 0.0f);
                }
            }
            return super.onScroll(motionEvent, motionEvent2, 0.0f, 0.0f);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            BehaviorTagsLineChartView.this.p.forceFinished(true);
            super.onShowPress(motionEvent);
        }
    }

    public static class e {
        public int a;
        public float b;
        public float c;
        public float d;
        public int e = 4;
        public int f = 10;
        public float g = 14.0f;
        public float h = 13.3f;
    }

    public class f {
        public float a;
        public float b;
        public float c;
        public float d;
        public Paint[] e;
        public Path[] f;
        public int g;

        public f(int[] iArr) {
            this.e = new Paint[iArr.length];
            this.f = new Path[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f[i] = new Path();
                this.e[i] = new Paint();
                this.e[i].setStrokeWidth(LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 1.3f));
                this.e[i].setAntiAlias(true);
                this.e[i].setStyle(Paint.Style.STROKE);
                this.e[i].setColor(iArr[i]);
            }
        }
    }

    public class g {
        public Paint a;
        public Paint[] b;
        public float c;
        public TextPaint d;
        public float e;
        public float f;

        public g(int[] iArr) {
            this.e = LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 6.7f);
            this.f = LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 9.7f);
            this.b = new Paint[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.b[i] = new Paint();
                this.b[i].setAntiAlias(true);
                this.b[i].setStyle(Paint.Style.FILL);
                this.b[i].setColor(iArr[i]);
            }
            this.c = this.e + LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 4.7f);
            TextPaint textPaint = new TextPaint();
            this.d = textPaint;
            textPaint.setTypeface(BehaviorTagsLineChartView.this.t);
            this.d.setTextSize(LabTools.sp2px(BehaviorTagsLineChartView.this.getContext(), 14.7f));
            this.d.setAntiAlias(true);
            this.d.setStrokeWidth(LabTools.dp2px(BehaviorTagsLineChartView.this.getContext(), 0.3f));
            this.d.setColor(Color.parseColor("#4EFFFFFF"));
            this.d.setStyle(Paint.Style.FILL);
            this.d.setTextAlign(Paint.Align.CENTER);
            Paint paint = new Paint();
            this.a = paint;
            paint.setAntiAlias(true);
            this.a.setStyle(Paint.Style.FILL);
            this.a.setColor(Color.parseColor("#FF1E2128"));
        }
    }

    public static class h {
        public PointF a;
        public int b;

        public h(PointF pointF, int i) {
            this.a = pointF;
            this.b = i;
        }
    }

    public class i extends Thread {
        private final Lock a;
        private final Condition b;
        private final Stack<float[]> c;
        private long d;
        public volatile int e;
        private boolean f;
        public volatile int g;

        private i() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.a = reentrantLock;
            this.b = reentrantLock.newCondition();
            this.c = new Stack<>();
            this.d = 0L;
            this.e = 35;
            this.f = true;
            this.g = 70;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(List<float[]> list) {
            if (BehaviorTagsLineChartView.this.getVisibility() == 0) {
                try {
                    this.a.lock();
                    this.c.addAll(list);
                    for (int i = 0; i < list.size(); i++) {
                        for (float f : list.get(i)) {
                            if (BehaviorTagsLineChartView.this.i.c == 0.0f) {
                                BehaviorTagsLineChartView.this.i.c = f;
                                BehaviorTagsLineChartView.this.i.b = f;
                                BehaviorTagsLineChartView.this.i.d = f;
                            } else {
                                if (((f - BehaviorTagsLineChartView.this.i.d) * 0.1f) + f > BehaviorTagsLineChartView.this.i.b) {
                                    BehaviorTagsLineChartView.this.i.b = ((f - BehaviorTagsLineChartView.this.i.d) * 0.1f) + f;
                                }
                                if (f - ((BehaviorTagsLineChartView.this.i.b - f) * 0.1f) < BehaviorTagsLineChartView.this.i.d) {
                                    BehaviorTagsLineChartView.this.i.d = f - ((BehaviorTagsLineChartView.this.i.b - f) * 0.1f);
                                }
                            }
                        }
                    }
                    this.b.signal();
                } finally {
                    this.a.unlock();
                }
            }
        }

        private void d() {
            BehaviorTagsLineChartView behaviorTagsLineChartView;
            try {
                if (this.c.size() > 0) {
                    float[] fArrRemove = this.c.remove(0);
                    BehaviorTagsLineChartView.this.x++;
                    BehaviorTagsLineChartView.this.q.add(fArrRemove);
                    if (BehaviorTagsLineChartView.this.q.size() > 10000) {
                        BehaviorTagsLineChartView.this.q.remove(0);
                    }
                    BehaviorTagsLineChartView behaviorTagsLineChartView2 = BehaviorTagsLineChartView.this;
                    if (behaviorTagsLineChartView2.A) {
                        return;
                    }
                    try {
                        if (behaviorTagsLineChartView2.v == 0) {
                            try {
                                BehaviorTagsLineChartView.this.m();
                                behaviorTagsLineChartView = BehaviorTagsLineChartView.this;
                            } catch (Exception e) {
                                e.printStackTrace();
                                behaviorTagsLineChartView = BehaviorTagsLineChartView.this;
                            }
                            behaviorTagsLineChartView.postInvalidate();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        BehaviorTagsLineChartView.this.postInvalidate();
                        throw th;
                    }
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // java.lang.Thread
        public void interrupt() {
            d();
            super.interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis;
            while (this.f) {
                try {
                    try {
                        int size = this.c.size();
                        if (size <= 0) {
                            try {
                                this.a.lock();
                                this.b.await();
                                this.a.unlock();
                            } catch (Throwable th) {
                                this.a.unlock();
                                throw th;
                            }
                        } else if (size >= this.g || System.currentTimeMillis() - this.d >= this.e) {
                            try {
                                try {
                                    d();
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                } catch (Throwable th2) {
                                    this.d = System.currentTimeMillis();
                                    throw th2;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            this.d = jCurrentTimeMillis;
                        } else {
                            Thread.sleep(this.e);
                        }
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        if (this.a.tryLock()) {
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    if (!this.a.tryLock()) {
                        this.a.unlock();
                    }
                    throw th3;
                }
            }
            if (this.a.tryLock()) {
                return;
            }
            this.a.unlock();
        }
    }

    public BehaviorTagsLineChartView(Context context) {
        this(context, null);
    }

    private int getMaxHeight() {
        return 600;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            try {
                int currX = this.p.getCurrX() / this.j.g;
                this.v = currX;
                int i2 = 0;
                if (currX > 0 || this.p.getCurrX() < this.B) {
                    if (this.v > 0) {
                        this.v = 0;
                    } else {
                        int currX2 = this.p.getCurrX();
                        int i3 = this.B;
                        if (currX2 < i3) {
                            this.v = i3;
                        }
                    }
                    smoothScrollBy(0, 0);
                    this.p.abortAnimation();
                } else {
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        int i4 = this.i.f;
                        if (i2 >= i4 + 1) {
                            break;
                        }
                        int i5 = this.u;
                        int i6 = (((this.v + i5) - i4) + i2) - 1;
                        if (i6 < i5 && i6 >= 0 && i6 < 10000) {
                            arrayList.add(this.r.get(i6));
                        }
                        i2++;
                    }
                    if (arrayList.size() == this.i.f + 1) {
                        p(arrayList);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            new CopyOnWriteArrayList();
            if (this.q.size() >= this.i.f + 1) {
                List<float[]> list = this.q;
                copyOnWriteArrayList = new CopyOnWriteArrayList(list.subList((list.size() - this.i.f) - 1, this.q.size()));
            } else {
                copyOnWriteArrayList = new CopyOnWriteArrayList(this.q);
            }
            p(copyOnWriteArrayList);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void n(Canvas canvas, int i2) {
        float f2;
        try {
            float[] fArr = new float[(this.i.f + 1) * 4];
            for (int i3 = 0; i3 < this.i.f + 1; i3++) {
                if (LabTools.isRTL()) {
                    f fVar = this.j;
                    f2 = fVar.a - (fVar.g * i3);
                } else {
                    f fVar2 = this.j;
                    f2 = fVar2.a + (fVar2.g * i3);
                }
                int i4 = i3 * 4;
                fArr[i4] = f2;
                float f3 = this.l.b;
                fArr[i4 + 1] = f3 - 10.0f;
                fArr[i4 + 2] = f2;
                fArr[i4 + 3] = f3;
                int i5 = this.i.f;
                String strValueOf = i2 < i5 + 1 ? String.valueOf(i3) : String.valueOf((i2 - (i5 + 1)) + i3);
                float fMeasureText = this.l.f.measureText(strValueOf);
                if (i3 < i2) {
                    int i6 = this.j.g;
                    int i7 = (int) ((fMeasureText / i6) * 1.5f);
                    if (i7 < 1 || i3 % (i7 + 1) != 1) {
                        if (1.3f * fMeasureText < i6) {
                            if (LabTools.isRTL()) {
                                float f4 = f2 - (fMeasureText / 2.0f);
                                a aVar = this.l;
                                canvas.drawText(strValueOf, f4, aVar.c, aVar.f);
                            } else {
                                float f5 = f2 + (fMeasureText / 2.0f);
                                a aVar2 = this.l;
                                canvas.drawText(strValueOf, f5, aVar2.c, aVar2.f);
                            }
                        }
                    } else if (LabTools.isRTL()) {
                        float f6 = f2 - (fMeasureText / 2.0f);
                        a aVar3 = this.l;
                        canvas.drawText(strValueOf, f6, aVar3.c, aVar3.f);
                    } else {
                        float f7 = f2 + (fMeasureText / 2.0f);
                        a aVar4 = this.l;
                        canvas.drawText(strValueOf, f7, aVar4.c, aVar4.f);
                    }
                }
            }
            canvas.drawLines(fArr, this.l.f);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void o(Canvas canvas) {
        try {
            e eVar = this.i;
            float f2 = (eVar.b - eVar.d) / eVar.e;
            int i2 = 0;
            while (true) {
                e eVar2 = this.i;
                if (i2 >= eVar2.e + 1) {
                    break;
                }
                float f3 = i2;
                float f4 = this.j.b + (this.m.h * f3);
                String strValueOf = String.valueOf((int) (eVar2.b - (f3 * f2)));
                if (LabTools.isRTL()) {
                    b bVar = this.m;
                    canvas.drawText(strValueOf, bVar.b + bVar.d, f4 + (bVar.f.measureText("0") / 2.0f), this.m.f);
                } else {
                    b bVar2 = this.m;
                    canvas.drawText(strValueOf, bVar2.b - bVar2.d, f4 + (bVar2.f.measureText("0") / 2.0f), this.m.f);
                }
                i2++;
            }
            Path path = new Path();
            f fVar = this.j;
            path.moveTo(fVar.a, (fVar.d + fVar.b) / 2.0f);
            if (LabTools.isRTL()) {
                float f5 = this.l.a;
                int i3 = this.i.f;
                f fVar2 = this.j;
                path.lineTo(f5 - (i3 * fVar2.g), (fVar2.d + fVar2.b) / 2.0f);
            } else {
                float f6 = this.l.a;
                int i4 = this.i.f;
                f fVar3 = this.j;
                path.lineTo(f6 + (i4 * fVar3.g), (fVar3.d + fVar3.b) / 2.0f);
            }
            canvas.drawPath(path, this.m.g);
            this.m.f.setStyle(Paint.Style.FILL);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void p(List<float[]> list) {
        this.z.clear();
        for (int i2 = 0; i2 < this.i.a; i2++) {
            this.j.f[i2] = q(list, i2, this.s);
        }
    }

    private Path q(List<float[]> list, int i2, boolean[] zArr) {
        float f2;
        float f3;
        PointF[] pointFArr = new PointF[list.size()];
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (LabTools.isRTL()) {
                f fVar = this.j;
                f2 = fVar.a - (fVar.g * i3);
            } else {
                f fVar2 = this.j;
                f2 = fVar2.a + (fVar2.g * i3);
            }
            f fVar3 = this.j;
            float f4 = fVar3.d;
            float f5 = fVar3.b;
            float f6 = f4 - f5;
            e eVar = this.i;
            if (eVar.b == 0.0f && eVar.d == 0.0f) {
                f3 = f6 / 2.0f;
            } else {
                float f7 = list.get(i3)[i2];
                e eVar2 = this.i;
                float f8 = eVar2.b;
                float f9 = eVar2.d;
                f5 = (f6 / 2.0f) - (((f7 - ((f8 + f9) / 2.0f)) * f6) / (f8 - f9));
                f3 = this.j.b;
            }
            PointF pointF = new PointF(f2, f3 + f5);
            pointFArr[i3] = pointF;
            arrayList.add(new h(pointF, (int) list.get(i3)[i2]));
        }
        if (zArr[i2]) {
            this.z.put(i2, arrayList);
        }
        return getBezierPath(pointFArr);
    }

    public void addData(List<float[]> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.a.c(list);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.p.computeScrollOffset()) {
            l();
        }
        super.computeScroll();
    }

    public Path getBezierPath(PointF[] pointFArr) {
        float f2;
        float f3;
        float f4;
        Path path = new Path();
        int length = pointFArr.length;
        int i2 = length - 1;
        path.reset();
        if (length >= 2) {
            PointF pointF = pointFArr[0];
            path.moveTo(pointF.x, pointF.y);
            int iMin = Math.min(length, i2);
            int i3 = 1;
            while (i3 < iMin) {
                PointF pointF2 = pointFArr[i3 == 1 ? 0 : i3 - 2];
                PointF pointF3 = pointFArr[i3 - 1];
                PointF pointF4 = pointFArr[i3];
                int i4 = i3 + 1;
                PointF pointF5 = pointFArr[i4];
                float fAbs = Math.abs(pointF3.x - pointF4.x);
                float fAbs2 = Math.abs(pointF4.x - pointF5.x);
                float f5 = 0.0f;
                if (fAbs == 0.0f || fAbs2 == 0.0f || (fAbs / fAbs2 <= 1.3f && fAbs2 / fAbs <= 1.3f)) {
                    f5 = (pointF4.x - pointF2.x) * 0.2f;
                    f2 = (pointF4.y - pointF2.y) * 0.2f;
                    f3 = (pointF5.x - pointF3.x) * 0.2f;
                    f4 = (pointF5.y - pointF3.y) * 0.2f;
                } else {
                    f4 = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                float f6 = pointF3.x + f5;
                float f7 = f2 + pointF3.y;
                float f8 = pointF4.x;
                float f9 = pointF4.y;
                path.cubicTo(f6, f7, f8 - f3, f9 - f4, f8, f9);
                i3 = i4;
            }
            if (length > i2) {
                PointF pointF6 = pointFArr[length >= 3 ? length - 3 : length - 2];
                PointF pointF7 = pointFArr[length - 2];
                PointF pointF8 = pointFArr[i2];
                float f10 = pointF8.x;
                float f11 = (f10 - pointF6.x) * 0.2f;
                float f12 = pointF8.y;
                float f13 = (f12 - pointF6.y) * 0.2f;
                float f14 = pointF7.x;
                float f15 = pointF7.y;
                path.cubicTo(f14 + f11, f15 + f13, f10 - ((f10 - f14) * 0.2f), f12 - ((f12 - f15) * 0.2f), f10, f12);
            }
        }
        return path;
    }

    public void initValues(int[] iArr, int i2) {
        this.s = new boolean[iArr.length];
        int i3 = 0;
        while (true) {
            boolean[] zArr = this.s;
            if (i3 >= zArr.length) {
                break;
            }
            zArr[i3] = i3 == 0;
            i3++;
        }
        c cVar = new c();
        this.h = cVar;
        cVar.d = this.b - this.e;
        cVar.b = this.d;
        if (LabTools.isRTL()) {
            c cVar2 = this.h;
            cVar2.a = this.c - this.g;
            cVar2.c = this.f;
        } else {
            c cVar3 = this.h;
            cVar3.a = this.f;
            cVar3.c = this.c - this.g;
        }
        e eVar = new e();
        this.i = eVar;
        eVar.a = iArr.length;
        eVar.e = i2;
        a aVar = new a(eVar.g);
        this.l = aVar;
        c cVar4 = this.h;
        aVar.a = cVar4.a;
        float f2 = cVar4.d;
        aVar.c = f2;
        e eVar2 = this.i;
        aVar.b = ((f2 - eVar2.g) - aVar.e) - aVar.d;
        b bVar = new b(eVar2.h);
        this.m = bVar;
        float fMeasureText = bVar.f.measureText("0000");
        if (LabTools.isRTL()) {
            b bVar2 = this.m;
            bVar2.b = ((this.h.a - fMeasureText) - bVar2.d) - bVar2.e;
        } else {
            b bVar3 = this.m;
            bVar3.b = this.h.a + fMeasureText + bVar3.d + bVar3.e;
        }
        b bVar4 = this.m;
        float f3 = this.h.b;
        bVar4.a = f3;
        a aVar2 = this.l;
        float f4 = aVar2.b;
        bVar4.c = f4;
        bVar4.h = (f4 - f3) / this.i.e;
        aVar2.a = bVar4.b;
        f fVar = new f(iArr);
        this.j = fVar;
        fVar.a = this.m.b;
        c cVar5 = this.h;
        fVar.b = cVar5.b;
        fVar.d = this.l.b;
        fVar.c = cVar5.c;
        if (LabTools.isRTL()) {
            f fVar2 = this.j;
            fVar2.g = (int) (((fVar2.a - fVar2.c) - (fMeasureText / 2.0f)) / this.i.f);
        } else {
            f fVar3 = this.j;
            fVar3.g = (int) (((fVar3.c - fVar3.a) - (fMeasureText / 2.0f)) / this.i.f);
        }
        this.k = new g(iArr);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
        stopGSensorDealTask();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        List<h> list;
        if (this.j != null) {
            if (LabTools.isRTL()) {
                a aVar = this.l;
                float f2 = aVar.a;
                float f3 = aVar.b;
                canvas.drawLine(f2, f3, f2 - (this.i.f * this.j.g), f3, aVar.f);
            } else {
                a aVar2 = this.l;
                float f4 = aVar2.a;
                float f5 = aVar2.b;
                canvas.drawLine(f4, f5, f4 + (this.i.f * this.j.g), f5, aVar2.f);
            }
            if (this.A || this.v != 0) {
                int i2 = this.y + this.v;
                int i3 = this.i.f;
                if (i2 <= i3) {
                    i2 = i3;
                }
                n(canvas, i2);
            } else {
                n(canvas, this.x);
            }
            o(canvas);
            for (int i4 = 0; i4 < this.i.a; i4++) {
                f fVar = this.j;
                canvas.drawPath(fVar.f[i4], fVar.e[i4]);
                if (this.w && this.s[i4] && (list = this.z.get(i4)) != null) {
                    for (h hVar : list) {
                        PointF pointF = hVar.a;
                        float f6 = pointF.x;
                        float f7 = pointF.y;
                        g gVar = this.k;
                        canvas.drawCircle(f6, f7, gVar.f / 2.0f, gVar.a);
                        PointF pointF2 = hVar.a;
                        float f8 = pointF2.x;
                        float f9 = pointF2.y;
                        g gVar2 = this.k;
                        canvas.drawCircle(f8, f9, gVar2.e / 2.0f, gVar2.b[i4]);
                        String strValueOf = String.valueOf(hVar.b);
                        PointF pointF3 = hVar.a;
                        float f10 = pointF3.x;
                        float f11 = pointF3.y;
                        g gVar3 = this.k;
                        canvas.drawText(strValueOf, f10, f11 - gVar3.c, gVar3.d);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMaxHeight(), 1073741824));
        } else {
            super.onMeasure(i2, i3);
        }
        this.b = getMeasuredHeight();
        this.c = getMeasuredWidth();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.o == null) {
            this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(motionEvent);
        if (action == 0) {
            try {
                this.A = true;
                if (this.v == 0) {
                    this.r.clear();
                    this.r.addAll(this.q);
                    this.u = this.q.size();
                    this.y = this.x;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (action == 1) {
            this.o.computeCurrentVelocity(1000);
            this.A = false;
        }
        this.n.onTouchEvent(motionEvent);
        return true;
    }

    public void reSize(boolean z, int i2, int i3) {
        this.w = z;
        this.A = false;
        this.b = i3;
        this.c = i2;
        c cVar = new c();
        this.h = cVar;
        cVar.d = this.b - this.e;
        cVar.b = this.d;
        if (LabTools.isRTL()) {
            c cVar2 = this.h;
            cVar2.a = this.c - this.g;
            cVar2.c = this.f;
        } else {
            c cVar3 = this.h;
            cVar3.a = this.f;
            cVar3.c = this.c - this.g;
        }
        a aVar = this.l;
        c cVar4 = this.h;
        aVar.a = cVar4.a;
        float f2 = cVar4.d;
        aVar.c = f2;
        aVar.b = ((f2 - this.i.g) - aVar.e) - aVar.d;
        float fMeasureText = this.m.f.measureText("0000");
        this.m.d = LabTools.dp2px(getContext(), z ? 13.0f : 10.0f);
        if (LabTools.isRTL()) {
            b bVar = this.m;
            bVar.b = ((this.h.a - fMeasureText) - bVar.d) - bVar.e;
        } else {
            b bVar2 = this.m;
            bVar2.b = this.h.a + fMeasureText + bVar2.d + bVar2.e;
        }
        b bVar3 = this.m;
        c cVar5 = this.h;
        float f3 = cVar5.b;
        bVar3.a = f3;
        a aVar2 = this.l;
        float f4 = aVar2.b;
        bVar3.c = f4;
        float f5 = bVar3.b;
        aVar2.a = f5;
        bVar3.h = (f4 - f3) / this.i.e;
        f fVar = this.j;
        fVar.a = f5;
        fVar.b = f3;
        fVar.d = f4;
        fVar.c = cVar5.c;
        if (LabTools.isRTL()) {
            f fVar2 = this.j;
            fVar2.g = (int) (((fVar2.a - fVar2.c) - (fMeasureText / 2.0f)) / this.i.f);
        } else {
            f fVar3 = this.j;
            fVar3.g = (int) (((fVar3.c - fVar3.a) - (fMeasureText / 2.0f)) / this.i.f);
        }
        m();
    }

    public void setLineColor(int[] iArr, int i2) {
        initValues(iArr, i2);
    }

    public void setShowValueIndex(int i2) {
        int i3 = 0;
        while (true) {
            boolean[] zArr = this.s;
            if (i3 >= zArr.length) {
                l();
                invalidate();
                return;
            } else {
                zArr[i3] = i3 == i2;
                i3++;
            }
        }
    }

    public void smoothScrollBy(int i2, int i3) {
        Scroller scroller = this.p;
        scroller.startScroll(scroller.getFinalX(), this.p.getFinalY(), i2, i3);
    }

    public i startGSensorDealTask() {
        if (this.a == null) {
            this.a = new i();
        }
        if (!this.a.isAlive()) {
            this.a.setName("sensorDealTask");
            this.a.start();
        }
        return this.a;
    }

    public synchronized void stopGSensorDealTask() {
        i iVar = this.a;
        if (iVar != null) {
            iVar.f = false;
            this.a.interrupt();
        }
    }

    public synchronized void updateSensorTaskParams(int i2, int i3) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.e = i2;
            this.a.g = i3;
        }
    }

    public BehaviorTagsLineChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = null;
        this.q = new CopyOnWriteArrayList();
        this.r = new ArrayList<>();
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.x = 0;
        this.y = 0;
        this.z = new SparseArray<>();
        this.A = false;
        this.d = getPaddingTop();
        this.e = getPaddingBottom();
        this.f = getPaddingStart();
        this.g = getPaddingEnd();
        GestureDetector gestureDetector = new GestureDetector(context, new d());
        this.n = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.p = new Scroller(context);
        this.t = TypefaceManager.get().getTypeface(context, Font.DIN_MED);
        startGSensorDealTask();
    }
}
