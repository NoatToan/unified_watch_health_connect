package bt0;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbt0/h;", "Lwz/a;", "", "Lbt0/k;", "reports", "<init>", "(Ljava/util/List;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends wz.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f21070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f21071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Integer> f21072e;

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    public h(List<k> list) {
        double d14;
        Object next;
        double d15 = 0.0d;
        Object next2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    double d16 = ((k) next).f21085b;
                    do {
                        Object next3 = it.next();
                        double d17 = ((k) next3).f21085b;
                        if (Double.compare(d16, d17) > 0) {
                            next = next3;
                            d16 = d17;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            k kVar = (k) next;
            if (kVar != null) {
                d14 = kVar.f21085b;
            } else {
                d14 = 0.0d;
            }
        } else {
            d14 = 0.0d;
        }
        this.f21070c = d14;
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    double d18 = ((k) next2).f21085b;
                    do {
                        Object next4 = it3.next();
                        double d19 = ((k) next4).f21085b;
                        if (Double.compare(d18, d19) < 0) {
                            next2 = next4;
                            d18 = d19;
                        }
                    } while (it3.hasNext());
                }
            }
            k kVar2 = (k) next2;
            if (kVar2 != null) {
                d15 = kVar2.f21085b;
            }
        }
        this.f21071d = d15;
        this.f21072e = x.k(1, 10);
    }

    @Override // wz.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getF21071d() {
        return this.f21071d;
    }

    @Override // wz.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getF21070c() {
        return this.f21070c;
    }

    @Override // wz.a
    public final List<Integer> d() {
        return this.f21072e;
    }

    @Override // wz.a
    public final int f(int i14, double d14, double d15) {
        double d16 = (d15 - d14) / ((double) i14);
        double dPow = Math.pow(10.0d, Math.floor(Math.log10(d16 >= 1.0d ? d16 : 1.0d)));
        return ((int) ((d16 / dPow) + 0.5d)) * ((int) dPow);
    }
}
