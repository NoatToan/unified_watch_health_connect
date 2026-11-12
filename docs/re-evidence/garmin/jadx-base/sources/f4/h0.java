package f4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf4/h0;", "Lf4/g0;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3.b f68747a = new z3.b(0);

    public final boolean A(int i14) {
        int i15 = this.f68747a.get();
        int i16 = d.f68726b;
        return (i14 & i15) != 0;
    }

    public final void C(int i14) {
        z3.b bVar;
        int i15;
        do {
            bVar = this.f68747a;
            i15 = bVar.get();
            int i16 = d.f68726b;
            if ((i15 & i14) != 0) {
                return;
            }
        } while (!bVar.compareAndSet(i15, i15 | i14));
    }
}
