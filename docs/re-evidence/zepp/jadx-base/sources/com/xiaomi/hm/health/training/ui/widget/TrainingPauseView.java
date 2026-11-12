package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.TrainingRest;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingPauseView extends View {
    private int a;
    private Paint b;
    private Paint c;
    private Paint d;
    private Paint e;
    private int f;
    private int g;
    private int h;
    private float i;
    private Bitmap j;
    private int k;
    private int l;
    private Rect m;
    private Rect n;
    private long o;
    private long p;
    private long q;
    private boolean r;
    private Object s;
    private boolean t;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainingRest trainingRest = new TrainingRest(-1L);
            while (TrainingPauseView.this.p != TrainingPauseView.this.q) {
                try {
                    Thread.sleep(TrainingPauseView.this.o);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (TrainingPauseView.this.r) {
                    break;
                }
                if (TrainingPauseView.this.t) {
                    synchronized (TrainingPauseView.this.s) {
                        try {
                            TrainingPauseView.this.s.wait();
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                TrainingPauseView.this.p += TrainingPauseView.this.o;
                trainingRest.setCurrentRemainRestTime(TrainingPauseView.this.q - TrainingPauseView.this.p);
                EventBus.getDefault().post(trainingRest);
                TrainingPauseView.this.postInvalidate();
            }
            trainingRest.setCurrentRemainRestTime(-1L);
            EventBus.getDefault().post(trainingRest);
        }
    }

    public TrainingPauseView(Context context) {
        this(context, null);
    }

    private void h(Context context) {
        Bitmap bitmapDrawableToBitmap = drawableToBitmap(TintUtils.tintDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.icon_training_pause, null), ContextCompat.getColor(context, R.color.ring_progress)));
        this.j = bitmapDrawableToBitmap;
        this.k = bitmapDrawableToBitmap.getWidth();
        this.l = this.j.getHeight();
        this.m = new Rect(0, 0, this.k, this.l);
    }

    private void i(Context context) {
        this.i = ViewUtils.dp2px(context, this.h);
        this.b = new Paint();
        this.d = new Paint();
        this.c = new Paint();
        this.e = new Paint();
        this.b.setAntiAlias(true);
        this.d.setAntiAlias(true);
        this.c.setAntiAlias(true);
        this.e.setAntiAlias(true);
        Paint paint = this.b;
        int i = R.color.ring_progress_pause_bg;
        paint.setColor(ContextCompat.getColor(context, i));
        this.d.setColor(ContextCompat.getColor(context, R.color.ring_progress_pause_view_bg));
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeWidth(this.i);
        this.d.setStyle(Paint.Style.FILL);
        this.c.setStyle(Paint.Style.STROKE);
        if (this.a == 0) {
            this.c.setColor(ContextCompat.getColor(context, i));
        } else {
            this.c.setColor(ContextCompat.getColor(context, R.color.ring_progress));
        }
        this.c.setStrokeWidth(this.i);
    }

    public Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        float f = this.f / 2;
        int i = this.g;
        canvas.drawCircle(f, i / 2, i / 2, this.d);
        float f2 = this.f / 2;
        int i2 = this.g;
        canvas.drawCircle(f2, i2 / 2, (i2 / 2) - this.h, this.d);
        canvas.drawBitmap(this.j, this.m, this.n, this.e);
        RectF rectF = new RectF();
        float f3 = this.i;
        rectF.left = f3 / 2.0f;
        rectF.top = f3 / 2.0f;
        rectF.right = this.f - (f3 / 2.0f);
        rectF.bottom = this.g - (f3 / 2.0f);
        canvas.drawArc(rectF, -90.0f, 360.0f, false, this.b);
        if (this.a == 0) {
            canvas.drawArc(rectF, -90.0f, 360.0f, false, this.c);
        } else {
            canvas.drawArc(rectF, -90.0f, (this.p / this.q) * 360.0f, false, this.c);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f = View.MeasureSpec.getSize(i);
        this.g = View.MeasureSpec.getSize(i2);
        int i3 = this.f;
        int i4 = this.k;
        int i5 = this.g;
        int i6 = this.l;
        this.n = new Rect((i3 / 2) - (i4 / 2), (i5 / 2) - (i6 / 2), (i3 / 2) + (i4 / 2), (i5 / 2) + (i6 / 2));
    }

    public void pause() {
        this.t = true;
    }

    public void resume() {
        synchronized (this.s) {
            this.t = false;
            this.s.notify();
        }
    }

    public void setInterrupted(boolean z) {
        this.r = z;
    }

    public void setPauseTotalTime(long j) {
        this.q = j;
    }

    public void setPauseType(int i) {
        this.a = i;
    }

    public void startRestCountdown() {
        new Thread(new a()).start();
    }

    public TrainingPauseView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrainingPauseView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 4;
        this.o = 1000L;
        this.s = new Object();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.tpr);
        this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.tpr_pause_type, 0);
        typedArrayObtainStyledAttributes.recycle();
        i(context);
        h(context);
    }
}
