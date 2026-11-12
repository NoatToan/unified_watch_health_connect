package com.xiaomi.fitness.sport.view.widget;

import android.os.CountDownTimer;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircularProgressLayout f13014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public CountDownTimer f13015b;
    public boolean c;
    public boolean d;
    public CircularProgressLayout.b e;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.widget.a$a, reason: collision with other inner class name */
    public class CountDownTimerC0773a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13016a;

        public CountDownTimerC0773a(long j, long j2) {
            super(j, j2);
            this.f13016a = j;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            a.this.f13014a.getProgressDrawable().o(0.0f, 1.0f);
            a aVar = a.this;
            CircularProgressLayout.b bVar = aVar.e;
            if (bVar != null) {
                bVar.a(aVar.f13014a);
            }
            a.this.d = false;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            a.this.f13014a.getProgressDrawable().o(0.0f, 1.0f - (j / this.f13016a));
            a.this.f13014a.invalidate();
        }
    }

    public a(CircularProgressLayout circularProgressLayout) {
        this.f13014a = circularProgressLayout;
    }

    public CircularProgressLayout.b a() {
        return this.e;
    }

    public boolean b() {
        return this.d;
    }

    public void c() {
        d(false);
        f();
        this.f13014a.getProgressDrawable().o(0.0f, 0.0f);
    }

    public void d(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (!z) {
                this.f13014a.getProgressDrawable().stop();
                return;
            }
            if (this.d) {
                f();
            }
            this.f13014a.getProgressDrawable().start();
        }
    }

    public void e(long j, long j2) {
        c();
        this.d = true;
        CountDownTimerC0773a countDownTimerC0773a = new CountDownTimerC0773a(j, j2);
        this.f13015b = countDownTimerC0773a;
        countDownTimerC0773a.start();
    }

    public void f() {
        if (this.d) {
            this.f13015b.cancel();
            this.d = false;
            this.f13014a.getProgressDrawable().o(0.0f, 0.0f);
        }
    }

    public void setOnTimerFinishedListener(CircularProgressLayout.b bVar) {
        this.e = bVar;
    }
}
