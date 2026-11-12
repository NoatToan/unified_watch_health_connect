package pu1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpu1/d;", "", "", "min", "max", "<init>", "(Ljava/lang/String;IDD)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    METRIC_CYCLING_DISTANCE_RANGE(50.0d, 70.0d),
    CENTURY_DISTANCE_RANGE(70.0d, 125.0d),
    GRAN_FONDO_DISTANCE_RANGE(50.0d, 125.0d),
    RACE_DISTANCE_RANGE(10.0d, 55.0d),
    TIME_TRIAL_RANGE(10.0d, 110.0d),
    CYCLING_TIME_RANGE_1(30.0d, 120.0d);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f141324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f141325b;

    d(double d14, double d15) {
        this.f141324a = d14;
        this.f141325b = d15;
    }

    public final boolean a(double d14) {
        return d14 <= this.f141325b && this.f141324a <= d14;
    }
}
