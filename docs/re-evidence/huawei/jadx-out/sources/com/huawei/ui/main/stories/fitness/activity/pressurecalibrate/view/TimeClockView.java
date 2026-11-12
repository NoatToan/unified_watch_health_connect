package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.CountDownTimer;
import android.os.Message;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qrs;
import defpackage.uey;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class TimeClockView extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26985a;
    private int aa;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26987c;
    private Canvas d;
    private int e;
    private Paint f;
    private Context g;
    private CountDownTimer h;
    private final int[] i;
    private final int[] j;
    private Paint k;
    private RectF l;
    private SurfaceHolder m;
    private c n;
    private Paint o;
    private int p;
    private Paint q;
    private Paint r;
    private RectF s;
    private int t;
    private float u;
    private int v;
    private Paint w;
    private int x;
    private HealthTextView y;

    public TimeClockView(Context context) {
        this(context, null);
    }

    public TimeClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeClockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = 0.0f;
        this.f26986b = 6.0f;
        this.p = 0;
        int color = ContextCompat.getColor(BaseApplication.getContext(), R.color.color_CCFB6522);
        this.f26985a = color;
        this.j = new int[]{ContextCompat.getColor(BaseApplication.getContext(), R.color.color_00FC844E), ContextCompat.getColor(BaseApplication.getContext(), R.color.color_99FC844E), ContextCompat.getColor(BaseApplication.getContext(), R.color.color_99FB6522)};
        this.i = new int[]{ContextCompat.getColor(BaseApplication.getContext(), R.color.color_00FC844E), ContextCompat.getColor(BaseApplication.getContext(), R.color.color_FFFC844E), color};
        this.g = context;
        setZOrderOnTop(true);
        d();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m.setFormat(-2);
        setZOrderOnTop(true);
        c();
    }

    private void c() {
        this.f26987c = qrs.d(BaseApplication.getContext(), 120.0f);
        this.e = qrs.d(BaseApplication.getContext(), 120.0f);
        this.t = qrs.d(BaseApplication.getContext(), 118.0f);
        this.aa = qrs.d(BaseApplication.getContext(), 9.0f);
        this.v = qrs.d(BaseApplication.getContext(), 1.5f);
        int i = this.t;
        float f = -i;
        float f2 = i;
        this.s = new RectF(f, f, f2, f2);
        int i2 = this.t - this.aa;
        float f3 = -i2;
        float f4 = i2;
        this.l = new RectF(f3, f3, f4, f4);
    }

    private void d() {
        LogUtil.a("TimeClockView", "initView");
        this.r = new Paint();
        this.f = new Paint();
        this.k = new Paint();
        this.q = new Paint();
        this.w = new Paint();
        this.o = new Paint();
        SurfaceHolder holder = getHolder();
        this.m = holder;
        holder.setFormat(-2);
        this.m.addCallback(this);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setKeepScreenOn(true);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(a(i), a(i2));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    private int a(int i) {
        int iD = qrs.d(BaseApplication.getContext(), 500.0f);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return mode == Integer.MIN_VALUE ? Math.min(iD, size) : iD;
    }

    private void a(Canvas canvas) {
        this.f.setColor(this.g.getResources().getColor(R.color.color_FFCCCCCC));
        this.f.setAntiAlias(true);
        this.f.setStrokeWidth(qrs.d(BaseApplication.getContext(), 1.0f));
        canvas.translate(this.f26987c, this.e);
        for (int i = 0; i < 180; i++) {
            canvas.drawLine(0.0f, this.t - qrs.d(BaseApplication.getContext(), 8.0f), 0.0f, this.t, this.f);
            canvas.rotate(2.0f, 0.0f, 0.0f);
        }
    }

    private void d(Canvas canvas) {
        this.r.setColor(this.f26985a);
        this.r.setStyle(Paint.Style.FILL);
        this.r.setAntiAlias(true);
        this.r.setStrokeWidth(qrs.d(BaseApplication.getContext(), 2.0f));
        canvas.drawCircle(0.0f, 0.0f, qrs.d(BaseApplication.getContext(), 4.0f), this.r);
    }

    private void b(Canvas canvas) {
        e(canvas);
        h(canvas);
    }

    private void c(Canvas canvas) {
        this.q.setColor(-1);
        this.q.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0.0f, 0.0f, qrs.d(BaseApplication.getContext(), 2.0f), this.q);
    }

    private void h(Canvas canvas) {
        this.w.reset();
        this.w.setStrokeWidth(qrs.d(BaseApplication.getContext(), 1.5f));
        this.w.setAntiAlias(true);
        this.w.setColor(this.f26985a);
        this.w.setStyle(Paint.Style.FILL);
        this.w.setShadowLayer(10.0f, -5.0f, 0.0f, Color.parseColor("#80FB6522"));
        canvas.rotate(this.u, 0.0f, 0.0f);
        canvas.drawLine(0.0f, qrs.d(BaseApplication.getContext(), 9.0f), 0.0f, -this.t, this.w);
    }

    private void e(Canvas canvas) {
        this.o.reset();
        this.o.setAntiAlias(true);
        this.o.setStrokeWidth(this.v);
        this.o.setStyle(Paint.Style.STROKE);
        this.k.reset();
        this.k.setAntiAlias(true);
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(this.aa * 2);
        canvas.save();
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, this.j, (float[]) null);
        SweepGradient sweepGradient2 = new SweepGradient(0.0f, 0.0f, this.i, (float[]) null);
        this.k.setShader(sweepGradient);
        this.o.setShader(sweepGradient2);
        canvas.rotate(-90.0f, 0.0f, 0.0f);
        canvas.drawArc(this.l, 0.0f, this.u, false, this.k);
        canvas.rotate(0.0f, 0.0f, 0.0f);
        canvas.drawArc(this.s, 0.0f, this.u, false, this.o);
        canvas.restore();
    }

    public void a(int i, int i2, HealthTextView healthTextView) {
        this.y = healthTextView;
        healthTextView.setTextSize(18.0f);
        if (i2 != 0 && i <= i2) {
            float f = i2;
            this.f26986b = 360.0f / f;
            if (i == i2) {
                this.p = i;
                this.u = (i * 360) / f;
                this.x = 0;
            } else {
                int i3 = i2 - i;
                this.p = i3;
                this.u = (i3 * 360) / f;
                this.x = 2;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.n = new c(this);
        i();
        a();
        LogUtil.a("TimeClockView", "surfaceCreated");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        LogUtil.a("TimeClockView", "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        LogUtil.a("TimeClockView", "surfaceDestroyed");
    }

    private void i() {
        Canvas canvasLockCanvas = this.m.lockCanvas();
        this.d = canvasLockCanvas;
        canvasLockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        a(this.d);
        this.d.save();
        b(this.d);
        this.d.save();
        d(this.d);
        c(this.d);
        b();
        postInvalidate();
        this.m.unlockCanvasAndPost(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Canvas canvasLockCanvas = this.m.lockCanvas();
        this.d = canvasLockCanvas;
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            a(this.d);
            this.d.save();
            b(this.d);
            this.d.save();
            d(this.d);
            c(this.d);
            postInvalidate();
            this.m.unlockCanvasAndPost(this.d);
        }
        b();
        LogUtil.a("TimeClockView", "second= ", Integer.valueOf(this.p));
        if (this.u == 0.0f) {
            uey.a().e(4, this.x);
        }
        this.p--;
        this.u -= this.f26986b;
    }

    private void b() {
        if (this.y == null || this.p < 0) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, 0, 0, this.p);
        this.y.setText(new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS, Locale.getDefault()).format(calendar.getTime()));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.TimeClockView$2] */
    private void a() {
        LogUtil.a("TimeClockView", "threadStart");
        if (this.h == null) {
            LogUtil.a("TimeClockView", "CountDownTimer second = ", Integer.valueOf(this.p));
            this.h = new CountDownTimer(120000L, 990) { // from class: com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.TimeClockView.2
                @Override // android.os.CountDownTimer
                public void onFinish() {
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j) {
                    LogUtil.a("TimeClockView", "countDownTimer is run");
                    Message.obtain(TimeClockView.this.n, 0).sendToTarget();
                }
            }.start();
        }
    }

    public void e() {
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c cVar = this.n;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            this.n = null;
            LogUtil.a("TimeClockView", "TimeClockView threadStop");
        }
    }

    static class c extends BaseHandler<TimeClockView> {
        c(TimeClockView timeClockView) {
            super(timeClockView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TimeClockView timeClockView, Message message) {
            if (message.what == 0) {
                if (timeClockView.p > 60 || timeClockView.p < 0) {
                    return;
                }
                timeClockView.h();
                return;
            }
            LogUtil.a("TimeClockView", "no case match!");
        }
    }
}
