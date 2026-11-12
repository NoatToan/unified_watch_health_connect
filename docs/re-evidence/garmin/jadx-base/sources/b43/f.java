package b43;

import p43.m1;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public class f implements q43.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.a f15724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.a f15725c;

    public f(boolean z14, t23.a aVar, t23.a aVar2) {
        this.f15723a = z14;
        this.f15724b = aVar;
        this.f15725c = aVar2;
    }

    @Override // q43.d.a
    public final boolean a(m1 m1Var, m1 m1Var2) {
        p005kotlin.reflect.jvm.internal.impl.resolve.a aVar = p005kotlin.reflect.jvm.internal.impl.resolve.a.f105943a;
        m1Var.getClass();
        m1Var2.getClass();
        if (m1Var.equals(m1Var2)) {
            return true;
        }
        t23.h hVarT = m1Var.t();
        t23.h hVarT2 = m1Var2.t();
        if (!(hVarT instanceof d1) || !(hVarT2 instanceof d1)) {
            return false;
        }
        return p005kotlin.reflect.jvm.internal.impl.resolve.a.f105943a.b((d1) hVarT, (d1) hVarT2, this.f15723a, new g(this.f15724b, this.f15725c));
    }
}
