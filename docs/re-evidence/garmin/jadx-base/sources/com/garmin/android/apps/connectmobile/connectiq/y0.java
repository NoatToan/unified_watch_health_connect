package com.garmin.android.apps.connectmobile.connectiq;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y0 implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f32110b;

    public /* synthetic */ y0(long j8, int i14) {
        this.f32109a = i14;
        this.f32110b = j8;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i14 = this.f32109a;
        long j8 = this.f32110b;
        switch (i14) {
            case 0:
                return ((z0.c) obj).f32121a == j8;
            case 1:
                int i15 = po.h.E1;
                return ((Double) obj).doubleValue() >= ((double) j8);
            case 2:
                int i16 = po.h.E1;
                return ((Double) obj).doubleValue() >= ((double) j8);
            case 3:
                int i17 = po.h.E1;
                return ((Double) obj).doubleValue() >= ((double) j8);
            default:
                int i18 = po.h.E1;
                return ((Double) obj).doubleValue() >= ((double) j8);
        }
    }
}
