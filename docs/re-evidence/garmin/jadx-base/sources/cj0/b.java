package cj0;

import java.util.Iterator;
import java.util.List;
import m92.h0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcj0/b;", "", "", "Lm92/h0$e$a;", "points", "<init>", "(Ljava/util/List;)V", "a", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f27735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f27736b;

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    public b(List<h0.e.a> list) {
        double d14;
        double d15;
        Object next;
        Object next2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float f14 = ((h0.e.a) next).f117347b;
                    do {
                        Object next3 = it.next();
                        float f15 = ((h0.e.a) next3).f117347b;
                        if (Float.compare(f14, f15) > 0) {
                            next = next3;
                            f14 = f15;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            h0.e.a aVar = (h0.e.a) next;
            if (aVar != null) {
                d14 = ((double) aVar.f117347b) * 0.9d;
            } else {
                d14 = 175.0d;
            }
        } else {
            d14 = 175.0d;
        }
        double dFloor = Math.floor(d14);
        this.f27735a = dFloor < 0.0d ? 0.0d : dFloor;
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    float f16 = ((h0.e.a) next2).f117347b;
                    do {
                        Object next4 = it3.next();
                        float f17 = ((h0.e.a) next4).f117347b;
                        if (Float.compare(f16, f17) < 0) {
                            next2 = next4;
                            f16 = f17;
                        }
                    } while (it3.hasNext());
                }
            }
            h0.e.a aVar2 = (h0.e.a) next2;
            if (aVar2 != null) {
                d15 = ((double) aVar2.f117347b) * 1.1d;
            } else {
                d15 = 325.0d;
            }
        } else {
            d15 = 325.0d;
        }
        double dCeil = Math.ceil(d15);
        this.f27736b = dCeil >= 0.0d ? dCeil : 0.0d;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcj0/b$a;", "", "<init>", "()V", "", "DEFAULT_Y_MAX", "D", "DEFAULT_Y_MIN", "MULTIPLE", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
