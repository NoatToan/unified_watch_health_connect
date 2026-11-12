package p43;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<m1, t1> f135893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f135894d;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(Map<m1, ? extends t1> map, boolean z14) {
        this.f135893c = map;
        this.f135894d = z14;
    }

    @Override // p43.w1
    public final boolean a() {
        return this.f135894d;
    }

    @Override // p43.w1
    public final boolean e() {
        return this.f135893c.isEmpty();
    }

    @Override // p43.o1
    public final t1 g(m1 m1Var) {
        m1Var.getClass();
        return this.f135893c.get(m1Var);
    }
}
