package com.huami.mifit.sportlib.tts;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
abstract class b<Voice> {
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 7;
    private static final int i = 8;
    private static final int j = 9;
    private static final int k = 10;
    private static final int l = 11;
    private static final int m = 12;
    public final a<Voice> a = d();

    public b(Context context) {
    }

    public abstract void a();

    public abstract void b();

    public abstract boolean c();

    public abstract a<Voice> d();

    public abstract void e(int i2, Voice voice);

    public void f(DistanceVoiceInfo distanceVoiceInfo) {
        e(11, this.a.j(distanceVoiceInfo));
    }

    public void g() {
        e(6, this.a.a());
    }

    public void h() {
        e(7, this.a.c());
    }

    public void i(int i2) {
        e(5, this.a.h(i2));
    }

    public void j(int i2) {
        e(4, this.a.e(i2));
    }

    public void k(int i2) {
        e(8, this.a.b(i2));
    }

    public void l(int i2) {
        e(9, this.a.f(i2));
    }

    public void m(SpeedVoiceInfo speedVoiceInfo) {
        e(12, this.a.i(speedVoiceInfo));
    }

    public void n() {
        e(1, this.a.d());
    }

    public void o() {
        e(10, this.a.g());
    }
}
