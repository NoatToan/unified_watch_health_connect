package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.training.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingActionBarProgressView extends View {
    private Paint a;
    private Paint b;
    private Paint c;
    private int d;
    public Object dataLock;
    private int e;
    private long f;
    private double g;
    private long h;
    private long i;
    private long j;
    private float k;
    private double[] l;
    private float m;
    private Object n;
    private ExecutorService o;
    private a p;

    public class a implements Runnable {
        private boolean a;
        private boolean b;

        public a() {
        }

        public void a(boolean z) {
            this.b = z;
        }

        public void b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (TrainingActionBarProgressView.this.j < TrainingActionBarProgressView.this.i && !Thread.interrupted()) {
                try {
                    Thread.sleep(TrainingActionBarProgressView.this.h);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.a) {
                    synchronized (TrainingActionBarProgressView.this.n) {
                        try {
                            TrainingActionBarProgressView.this.n.wait();
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                synchronized (TrainingActionBarProgressView.this.dataLock) {
                    if (!this.b) {
                        TrainingActionBarProgressView.this.j += TrainingActionBarProgressView.this.h;
                        TrainingActionBarProgressView.this.g += TrainingActionBarProgressView.this.h;
                        TrainingActionBarProgressView.this.postInvalidate();
                    }
                }
            }
            if (!this.b) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
            System.out.println("Bar progress 进程结束！");
        }
    }

    public TrainingActionBarProgressView(Context context) {
        this(context, null);
    }

    private void h(Context context) {
        this.m = ViewUtils.dp2px(context, 2.0f);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.c.setAntiAlias(true);
        this.c.setStyle(Paint.Style.FILL);
        this.a.setColor(ContextCompat.getColor(context, R.color.bar_progress_divide));
        this.b.setColor(ContextCompat.getColor(context, R.color.bar_progress_bg));
        this.c.setColor(ContextCompat.getColor(context, R.color.bar_progress));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        canvas.drawColor(0);
        canvas.drawRect(0.0f, 0.0f, this.d, this.e, this.b);
        float f = (float) ((this.g / this.f) * ((double) this.d));
        this.k = f;
        canvas.drawRect(0.0f, 0.0f, f, this.e, this.c);
        if (this.l == null) {
            return;
        }
        while (true) {
            double[] dArr = this.l;
            if (i >= dArr.length) {
                return;
            }
            float f2 = (float) (((double) this.d) * dArr[i]);
            canvas.drawRect(f2, 0.0f, f2 + this.m, this.e, this.a);
            i++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.d = View.MeasureSpec.getSize(i);
        this.e = View.MeasureSpec.getSize(i2);
    }

    public void pause() {
        synchronized (this.n) {
            this.p.b(true);
        }
    }

    public void resetPeriodTime() {
        invalidate();
        this.p = new a();
        this.o = Executors.newSingleThreadExecutor();
        this.i = 0L;
        this.j = 0L;
    }

    public void resume() {
        synchronized (this.n) {
            this.n.notify();
            this.p.b(false);
        }
    }

    public void setCurrentTrainingTime(double d) {
        this.g = d;
    }

    public void setPeriodTotalTime(long j) {
        this.i = j;
    }

    public void setSplitLines(double[] dArr) {
        this.l = dArr;
    }

    public void setTrainingTotalTime(long j) {
        this.f = j;
    }

    public void setUnitUpdateTime(long j) {
        this.h = j;
    }

    public void startPeriodRefresh() {
        this.o.execute(this.p);
    }

    public void stop() {
        this.p.a(true);
        this.o.shutdownNow();
    }

    public TrainingActionBarProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrainingActionBarProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new Object();
        this.dataLock = new Object();
        this.o = Executors.newSingleThreadExecutor();
        this.p = new a();
        h(context);
    }
}
