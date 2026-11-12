package com.xiaomi.hm.health.training.ui.widget.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.TrainingProgressEnd;
import com.xiaomi.hm.health.training.media.TrainingSoundPool;
import com.xiaomi.hm.health.training.media.TrainingStartCountDownFinish;
import com.xiaomi.hm.health.training.media.factory.IMediaPlayerFactory;
import com.xiaomi.hm.health.training.media.factory.mediaImpl.DecadePlayerFactory;
import com.xiaomi.hm.health.training.media.factory.mediaImpl.UnitPlayerFactory;
import de.greenrobot.event.EventBus;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Emitter;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingActionRingProgressView extends View {
    private static final String x = "TrainingActionRingProgressView";
    public String TRAINING_PLAYING_GO;
    private AtomicLong a;
    public RectF arcRect;
    private AtomicLong b;
    public float baseLineX;
    public float baseLineY;
    private AtomicLong c;
    public Paint circlePaint;
    public Paint countPaint;
    private AtomicInteger d;
    public Object dataLock;
    private int e;
    private int f;
    private Object g;
    public int h;
    private ExecutorService i;
    private ExecutorService j;
    private d k;
    private e l;
    private TrainingSoundPool m;
    private AtomicInteger n;
    private AtomicBoolean o;
    private AtomicInteger p;
    private AtomicInteger q;
    private Context r;
    public Paint ringBgPaint;
    public Paint ringProgressPaint;
    public int ringProgressWidth;
    public float ringProgressWidthPx;
    private MediaPlayer s;
    public boolean showContent;
    private MediaPlayer t;
    private IMediaPlayerFactory u;
    private IMediaPlayerFactory v;
    public int w;

    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (TrainingActionRingProgressView.this.t != null) {
                TrainingActionRingProgressView.this.t.start();
            }
        }
    }

    public class b extends Subscriber<Boolean> {
        public final /* synthetic */ int f;

        public b(int i) {
            this.f = i;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            HMLog.d("TrainingActionRing", "broadcastCount[" + this.f + "] playSuccess:" + bool, new Object[0]);
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
        }
    }

    public class c implements Action1<Emitter<Boolean>> {

        public class a implements MediaPlayer.OnCompletionListener {
            public final /* synthetic */ Emitter a;

            public a(Emitter emitter) {
                this.a = emitter;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                this.a.onNext(Boolean.TRUE);
                this.a.onCompleted();
            }
        }

        public class b implements MediaPlayer.OnCompletionListener {
            public final /* synthetic */ Emitter a;

            public b(Emitter emitter) {
                this.a = emitter;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                if (TrainingActionRingProgressView.this.t != null) {
                    TrainingActionRingProgressView.this.t.start();
                } else {
                    this.a.onNext(Boolean.TRUE);
                    this.a.onCompleted();
                }
            }
        }

        public c() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Emitter<Boolean> emitter) {
            if (TrainingActionRingProgressView.this.t != null) {
                TrainingActionRingProgressView.this.t.setOnCompletionListener(new a(emitter));
            }
            if (TrainingActionRingProgressView.this.s != null) {
                TrainingActionRingProgressView.this.s.setOnCompletionListener(new b(emitter));
                TrainingActionRingProgressView.this.s.start();
            } else if (TrainingActionRingProgressView.this.t != null) {
                TrainingActionRingProgressView.this.t.start();
            } else {
                emitter.onNext(Boolean.FALSE);
                emitter.onCompleted();
            }
        }
    }

    public class d implements Runnable {
        private boolean a;
        private boolean b;

        public d() {
        }

        public void a(boolean z) {
            this.b = z;
        }

        public void b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (TrainingActionRingProgressView.this.n.get() >= 0 && !Thread.interrupted()) {
                TrainingActionRingProgressView.this.m.play(TrainingActionRingProgressView.this.n.get());
                if (TrainingActionRingProgressView.this.n.get() != 0) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    TrainingActionRingProgressView.this.postInvalidate();
                    if (this.a) {
                        synchronized (TrainingActionRingProgressView.this.g) {
                            try {
                                TrainingActionRingProgressView.this.g.wait();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    synchronized (TrainingActionRingProgressView.this.dataLock) {
                        if (!this.b) {
                            TrainingActionRingProgressView.this.n.decrementAndGet();
                            TrainingActionRingProgressView.this.postInvalidate();
                        }
                    }
                    break;
                }
                break;
            }
            if (!this.b) {
                EventBus.getDefault().post(new TrainingStartCountDownFinish());
                TrainingActionRingProgressView.this.i.execute(TrainingActionRingProgressView.this.l);
            }
            TrainingActionRingProgressView.this.o.set(false);
            System.out.println("Countdown 线程结束！");
        }
    }

    public class e implements Runnable {
        private boolean a;
        private boolean b;

        public e() {
        }

        private void a(int i) {
            if (i < 0 || i >= 1000) {
                return;
            }
            int i2 = i / 100;
            if (TrainingActionRingProgressView.this.s != null) {
                TrainingActionRingProgressView.this.s.stop();
                TrainingActionRingProgressView.this.s.release();
                TrainingActionRingProgressView.this.s = null;
            }
            int i3 = i % 100;
            int i4 = i3 / 10;
            if (i4 != 0) {
                TrainingActionRingProgressView trainingActionRingProgressView = TrainingActionRingProgressView.this;
                trainingActionRingProgressView.s = trainingActionRingProgressView.u.create(TrainingActionRingProgressView.this.r, i4);
            }
            if (TrainingActionRingProgressView.this.t != null) {
                TrainingActionRingProgressView.this.t.stop();
                TrainingActionRingProgressView.this.t.release();
                TrainingActionRingProgressView.this.t = null;
            }
            int i5 = i3 % 10;
            if (i5 != 0) {
                TrainingActionRingProgressView trainingActionRingProgressView2 = TrainingActionRingProgressView.this;
                trainingActionRingProgressView2.t = trainingActionRingProgressView2.v.create(TrainingActionRingProgressView.this.r, i5);
            }
            if (((TrainingActionRingProgressView.this.b.get() > TrainingActionRingProgressView.this.c.get() ? 1 : (TrainingActionRingProgressView.this.b.get() == TrainingActionRingProgressView.this.c.get() ? 0 : -1)) >= 0) && (TrainingActionRingProgressView.this.d.get() == TrainingActionRingProgressView.this.p.get())) {
                TrainingActionRingProgressView.this.w(i);
            } else {
                TrainingActionRingProgressView.this.x();
            }
        }

        public void b(boolean z) {
            this.b = z;
        }

        public void c(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TrainingActionRingProgressView.this.q.get() == 1) {
                TrainingActionRingProgressView.this.d.set((int) (TrainingActionRingProgressView.this.c.get() / 1000));
            }
            while (TrainingActionRingProgressView.this.b.get() < TrainingActionRingProgressView.this.c.get() && !Thread.interrupted() && (TrainingActionRingProgressView.this.q.get() == 1 || TrainingActionRingProgressView.this.d.get() < TrainingActionRingProgressView.this.p.get())) {
                try {
                    try {
                        Thread.sleep(TrainingActionRingProgressView.this.a.get());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    TrainingActionRingProgressView.this.postInvalidate();
                    if (this.a) {
                        synchronized (TrainingActionRingProgressView.this.g) {
                            try {
                                TrainingActionRingProgressView.this.g.wait();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    synchronized (TrainingActionRingProgressView.this.dataLock) {
                        if (!this.b) {
                            TrainingActionRingProgressView.this.b.set(TrainingActionRingProgressView.this.b.get() + TrainingActionRingProgressView.this.a.get());
                            if (TrainingActionRingProgressView.this.q.get() == 1) {
                                TrainingActionRingProgressView.this.d.decrementAndGet();
                                if (TrainingActionRingProgressView.this.d.get() <= 5) {
                                    if (TrainingActionRingProgressView.this.d.get() > 0) {
                                        TrainingActionRingProgressView.this.m.play(TrainingActionRingProgressView.this.d.get());
                                    }
                                } else if (TrainingActionRingProgressView.this.d.get() == 6) {
                                    TrainingActionRingProgressView.this.m.play(103);
                                } else {
                                    TrainingActionRingProgressView.this.m.play(102);
                                }
                            } else {
                                TrainingActionRingProgressView.this.d.incrementAndGet();
                                a(TrainingActionRingProgressView.this.d.get());
                            }
                            TrainingActionRingProgressView.this.postInvalidate();
                        }
                    }
                    break;
                } catch (Throwable th) {
                    TrainingActionRingProgressView.this.postInvalidate();
                    throw th;
                }
            }
            if (!this.b) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
                EventBus.getDefault().post(new TrainingProgressEnd());
            }
            TrainingActionRingProgressView.this.d.set(0);
            System.out.println("Ring progress 线程结束！");
        }
    }

    public TrainingActionRingProgressView(Context context) {
        this(context, null);
    }

    private void v() {
        this.j.execute(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(int i) {
        Observable.create(new c(), Emitter.BackpressureMode.LATEST).toBlocking().subscribe((Subscriber) new b(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        MediaPlayer mediaPlayer = this.s;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(new a());
            this.s.start();
        } else {
            MediaPlayer mediaPlayer2 = this.t;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        }
    }

    private void y(Context context) {
        this.ringProgressWidthPx = ViewUtils.dp2px(context, this.ringProgressWidth);
        this.ringBgPaint = new Paint();
        this.circlePaint = new Paint();
        this.ringProgressPaint = new Paint();
        this.countPaint = new Paint();
        this.ringBgPaint.setAntiAlias(true);
        this.circlePaint.setAntiAlias(true);
        this.ringProgressPaint.setAntiAlias(true);
        this.countPaint.setAntiAlias(true);
        this.ringBgPaint.setColor(ContextCompat.getColor(context, R.color.ring_progress_bg));
        this.circlePaint.setColor(ContextCompat.getColor(context, R.color.ring_progress_view_bg));
        this.ringBgPaint.setStyle(Paint.Style.STROKE);
        this.ringBgPaint.setStrokeWidth(this.ringProgressWidthPx);
        this.circlePaint.setStyle(Paint.Style.FILL);
        this.ringProgressPaint.setStyle(Paint.Style.STROKE);
        this.ringProgressPaint.setColor(ContextCompat.getColor(context, R.color.ring_progress));
        this.ringProgressPaint.setStrokeWidth(this.ringProgressWidthPx);
        this.countPaint.setTypeface(TypefaceManager.get().getTypeface(context, Font.KM));
        this.countPaint.setTextSize(ViewUtils.sp2px(context, 30.0f));
        this.countPaint.setColor(ContextCompat.getColor(context, R.color.white));
        this.countPaint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetricsInt fontMetricsInt = this.countPaint.getFontMetricsInt();
        this.e = fontMetricsInt.top;
        this.f = fontMetricsInt.bottom;
        float fDp2px = ViewUtils.dp2px(context, 21.0f);
        float fDp2px2 = ViewUtils.dp2px(context, 27.0f) / 2.0f;
        int i = this.f;
        this.baseLineY = fDp2px + ((fDp2px2 + ((i - this.e) / 2)) - i);
        this.arcRect = new RectF();
        this.TRAINING_PLAYING_GO = context.getString(R.string.training_playing_go);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        float f = this.w / 2;
        int i = this.h;
        canvas.drawCircle(f, i / 2, (i / 2) - this.ringProgressWidthPx, this.circlePaint);
        canvas.drawArc(this.arcRect, -90.0f, 360.0f, false, this.ringBgPaint);
        if (this.showContent) {
            if (this.o.get()) {
                canvas.drawText(this.n.get() == 0 ? this.TRAINING_PLAYING_GO : String.valueOf(this.n.get()), this.baseLineX, this.baseLineY, this.countPaint);
                return;
            }
            if (this.q.get() == 1) {
                canvas.drawArc(this.arcRect, -90.0f, ((this.b.get() / this.c.get()) * 360.0f) - 360.0f, false, this.ringProgressPaint);
            } else {
                canvas.drawArc(this.arcRect, -90.0f, (this.b.get() / this.c.get()) * 360.0f, false, this.ringProgressPaint);
            }
            canvas.drawText(this.d.get() == 0 ? "" : String.valueOf(this.d.get()), this.baseLineX, this.baseLineY, this.countPaint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.w = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.h = size;
        int i3 = this.w;
        this.baseLineX = i3 / 2;
        RectF rectF = this.arcRect;
        float f = this.ringProgressWidthPx;
        rectF.left = f / 2.0f;
        rectF.top = f / 2.0f;
        rectF.right = i3 - (f / 2.0f);
        rectF.bottom = size - (f / 2.0f);
    }

    public void pause() {
        synchronized (this.g) {
            this.k.b(true);
            this.l.c(true);
        }
    }

    public void resetProgress() {
        this.k = new d();
        this.l = new e();
        ExecutorService executorService = this.i;
        if (executorService != null) {
            executorService.shutdownNow();
            this.i = null;
        }
        ExecutorService executorService2 = this.j;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.j = null;
        }
        this.i = Executors.newSingleThreadExecutor();
        this.j = Executors.newSingleThreadExecutor();
        this.b.set(0L);
        this.a.set(0L);
        this.n.set(3);
        this.o.set(true);
        invalidate();
    }

    public void resume() {
        synchronized (this.g) {
            this.k.b(false);
            this.l.c(false);
            this.g.notify();
        }
    }

    public void setCountType(int i) {
        this.q.set(i);
    }

    public void setMaxCount(int i) {
        this.p.set(i);
    }

    public void setShowContent(boolean z) {
        this.showContent = z;
        postInvalidate();
    }

    public void setTrainingSoundPool(TrainingSoundPool trainingSoundPool) {
        this.m = trainingSoundPool;
    }

    public void setTrainingTotaltime(long j) {
        System.out.println("trainingTotaltime-----------" + j);
        this.c.set(j);
    }

    public void setUnitUpdateTime(long j) {
        System.out.println("unitUpdateTime-----------" + j);
        this.a.set(j);
    }

    public void startPeriodicRefresh() {
        v();
    }

    public void stop() {
        this.k.a(true);
        this.l.b(true);
        this.i.shutdownNow();
        this.j.shutdownNow();
    }

    public TrainingActionRingProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrainingActionRingProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new AtomicLong();
        this.b = new AtomicLong();
        this.c = new AtomicLong();
        this.ringProgressWidth = 4;
        this.d = new AtomicInteger();
        this.g = new Object();
        this.dataLock = new Object();
        this.i = Executors.newSingleThreadExecutor();
        this.j = Executors.newSingleThreadExecutor();
        this.k = new d();
        this.l = new e();
        this.n = new AtomicInteger(3);
        this.o = new AtomicBoolean(true);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(-1);
        this.showContent = false;
        this.r = context;
        y(context);
        this.u = new DecadePlayerFactory();
        this.v = new UnitPlayerFactory();
    }
}
