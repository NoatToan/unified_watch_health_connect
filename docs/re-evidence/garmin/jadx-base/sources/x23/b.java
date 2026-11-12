package x23;

import t23.l1;
import t23.m1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f188542c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // t23.m1
    public final Integer a(m1 m1Var) {
        m1Var.getClass();
        if (equals(m1Var)) {
            return 0;
        }
        if (m1Var == l1.b.f162032c) {
            return null;
        }
        l1.f162029a.getClass();
        return (m1Var == l1.e.f162035c || m1Var == l1.f.f162036c) ? 1 : -1;
    }

    @Override // t23.m1
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // t23.m1
    public final m1 c() {
        return l1.g.f162037c;
    }
}
