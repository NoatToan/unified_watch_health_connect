package com.xiaomi.fitness.sport_eco.view.widget;

import android.os.CountDownTimer;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircularProgressLayout f13115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public CountDownTimer f13116b;
    public boolean c;
    public boolean d;
    public CircularProgressLayout.b e;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.widget.a$a, reason: collision with other inner class name */
    public class CountDownTimerC0788a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13117a;

        public CountDownTimerC0788a(long j, long j2) {
            super(j, j2);
            this.f13117a = j;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            a.this.f13115a.getProgressDrawable().o(0.0f, 1.0f);
            a aVar = a.this;
            CircularProgressLayout.b bVar = aVar.e;
            if (bVar != null) {
                bVar.a(aVar.f13115a);
            }
            a.this.d = false;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            a.this.f13115a.getProgressDrawable().o(0.0f, 1.0f - (j / this.f13117a));
            a.this.f13115a.invalidate();
        }
    }

    public a(CircularProgressLayout circularProgressLayout) {
        this.f13115a = circularProgressLayout;
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
        this.f13115a.getProgressDrawable().o(0.0f, 0.0f);
    }

    public void d(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (!z) {
                this.f13115a.getProgressDrawable().stop();
                return;
            }
            if (this.d) {
                f();
            }
            this.f13115a.getProgressDrawable().start();
        }
    }

    public void e(long j, long j2) {
        c();
        this.d = true;
        CountDownTimerC0788a countDownTimerC0788a = new CountDownTimerC0788a(j, j2);
        this.f13116b = countDownTimerC0788a;
        countDownTimerC0788a.start();
    }

    public void f() {
        if (this.d) {
            this.f13116b.cancel();
            this.d = false;
            this.f13115a.getProgressDrawable().o(0.0f, 0.0f);
        }
    }

    public void setOnTimerFinishedListener(CircularProgressLayout.b bVar) {
        this.e = bVar;
    }
}
