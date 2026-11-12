package x23;

import t23.l1;
import t23.m1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f188541c = new a();

    private a() {
        super("package", false);
    }

    @Override // t23.m1
    public final Integer a(m1 m1Var) {
        m1Var.getClass();
        if (this == m1Var) {
            return 0;
        }
        l1.f162029a.getClass();
        return (m1Var == l1.e.f162035c || m1Var == l1.f.f162036c) ? 1 : -1;
    }

    @Override // t23.m1
    public final String b() {
        return "public/*package*/";
    }

    @Override // t23.m1
    public final m1 c() {
        return l1.g.f162037c;
    }
}
