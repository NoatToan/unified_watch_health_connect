package t2;

import b5.p0;
import g6.f;
import h5.r;
import p005kotlin.Unit;
import p006l2.n3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f161752a;

    static {
        float f14 = 40;
        f.a aVar = f.f75994b;
        float f15 = 10;
        f161752a = new r(f15, f14, f15, f14, true, null);
    }

    public static final h4.r a(h4.r rVar, boolean z14, boolean z15, e23.a<Unit> aVar) {
        if (!z14 || !d.f161762a) {
            return rVar;
        }
        if (z15) {
            rVar = rVar.then(new p0(n3.f108685a, false, f161752a));
        }
        return rVar.then(new a(aVar));
    }
}
