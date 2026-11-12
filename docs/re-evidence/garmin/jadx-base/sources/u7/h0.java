package u7;

import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu7/h0;", "T", "", "<init>", "()V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f169149a;

    public h0() {
        v1 v1Var = v1.f169336b;
        v1Var.getClass();
        this.f169149a = q2.a(v1Var);
    }

    public final r1<T> a() {
        return (r1) this.f169149a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(r1 r1Var) {
        p2 p2Var;
        Object value;
        r1 r1Var2;
        r1Var.getClass();
        do {
            p2Var = this.f169149a;
            value = p2Var.getValue();
            r1Var2 = (r1) value;
            if (r1Var2 instanceof g1 ? true : p005kotlin.jvm.internal.s.g(r1Var2, v1.f169336b)) {
                r1Var2 = r1Var;
            } else if (r1Var2 instanceof e) {
                if (r1Var.f169305a > r1Var2.f169305a) {
                    r1Var2 = r1Var;
                }
            } else if (!(r1Var2 instanceof r0)) {
                lc.u0.r();
                return;
            }
        } while (!p2Var.b(value, r1Var2));
    }
}
