package l3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class i2 implements e23.q<s1.t1.b<a1>, p3.m, Integer, s1.f0<Float>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1.f0<Float> f109274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.f0<Float> f109275b;

    public i2(s1.f0<Float> f0Var, s1.f0<Float> f0Var2) {
        this.f109274a = f0Var;
        this.f109275b = f0Var2;
    }

    @Override // e23.q
    public final s1.f0<Float> invoke(s1.t1.b<a1> bVar, p3.m mVar, Integer num) {
        s1.t1.b<a1> bVar2 = bVar;
        p3.m mVar2 = mVar;
        num.intValue();
        mVar2.C(-984009111);
        p3.x1 x1Var = p3.n.f135158a;
        a1 a1Var = a1.Focused;
        a1 a1Var2 = a1.UnfocusedEmpty;
        boolean zA = bVar2.a(a1Var, a1Var2);
        s1.f0<Float> f0Var = this.f109274a;
        if (!zA && (bVar2.a(a1Var2, a1Var) || bVar2.a(a1.UnfocusedNotEmpty, a1Var2))) {
            f0Var = this.f109275b;
        }
        mVar2.f();
        return f0Var;
    }
}
