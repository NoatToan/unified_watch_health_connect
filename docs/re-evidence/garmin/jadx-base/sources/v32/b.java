package v32;

import i53.c;
import java.util.Iterator;
import java.util.List;
import m92.h0;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv32/b;", "Lwz/a;", "Li53/c;", "Lm92/h0$e$a;", "points", "<init>", "(Li53/c;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends wz.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f175419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f175420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Integer> f175421e;

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    public b(c<h0.e.a> cVar) {
        double d14;
        double d15;
        h0.e.a next;
        h0.e.a next2 = null;
        if (cVar != null) {
            Iterator<h0.e.a> it = cVar.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float f14 = next.f117347b;
                    do {
                        h0.e.a next3 = it.next();
                        float f15 = next3.f117347b;
                        if (Float.compare(f14, f15) > 0) {
                            next = next3;
                            f14 = f15;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            h0.e.a aVar = next;
            if (aVar != null) {
                d14 = aVar.f117347b;
            } else {
                d14 = 0.0d;
            }
        } else {
            d14 = 0.0d;
        }
        double dFloor = Math.floor(d14);
        this.f175419c = dFloor < 0.0d ? 0.0d : dFloor;
        if (cVar != null) {
            Iterator<h0.e.a> it3 = cVar.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    float f16 = next2.f117347b;
                    do {
                        h0.e.a next4 = it3.next();
                        float f17 = next4.f117347b;
                        if (Float.compare(f16, f17) < 0) {
                            next2 = next4;
                            f16 = f17;
                        }
                    } while (it3.hasNext());
                }
            }
            h0.e.a aVar2 = next2;
            if (aVar2 != null) {
                d15 = aVar2.f117347b;
            } else {
                d15 = 0.0d;
            }
        } else {
            d15 = 0.0d;
        }
        double dCeil = Math.ceil(d15);
        this.f175420d = dCeil >= 0.0d ? dCeil : 0.0d;
        this.f175421e = x.k(1, 2, 3, 5, 10, 20, 30, 40, 50);
    }

    @Override // wz.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getF175420d() {
        return this.f175420d;
    }

    @Override // wz.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getF175419c() {
        return this.f175419c;
    }

    @Override // wz.a
    public final List<Integer> d() {
        return this.f175421e;
    }
}
