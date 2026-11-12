package em1;

import c22.l3;
import j23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lem1/a;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f64616a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f64617b = new l(1, 3);

    private a() {
    }

    public static boolean a(Double d14) {
        if (d14 == null) {
            return false;
        }
        double dDoubleValue = d14.doubleValue();
        return -20.0d <= dDoubleValue && dDoubleValue <= 20.0d;
    }

    public static boolean b(Double d14) {
        l3.f23124b.getClass();
        double d15 = 32;
        double d16 = l3.a.d(-20.0d) - d15;
        double d17 = l3.a.d(20.0d) - d15;
        if (d14 == null) {
            return false;
        }
        double dDoubleValue = d14.doubleValue();
        return d16 <= dDoubleValue && dDoubleValue <= d17;
    }
}
