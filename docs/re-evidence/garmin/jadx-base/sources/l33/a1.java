package l33;

import java.util.Collection;
import java.util.Set;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends z43.b.a<t23.e, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t23.e f109702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set<Object> f109703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<i43.l, Collection<Object>> f109704c;

    /* JADX WARN: Multi-variable type inference failed */
    public a1(t23.e eVar, Set<Object> set, e23.l<? super i43.l, ? extends Collection<Object>> lVar) {
        this.f109702a = eVar;
        this.f109703b = set;
        this.f109704c = lVar;
    }

    @Override // z43.b.c
    public final /* bridge */ /* synthetic */ Object a() {
        return Unit.INSTANCE;
    }

    @Override // z43.b.a, z43.b.c
    public final boolean b(Object obj) {
        t23.e eVar = (t23.e) obj;
        eVar.getClass();
        if (eVar == this.f109702a) {
            return true;
        }
        i43.l lVarP = eVar.P();
        lVarP.getClass();
        if (!(lVarP instanceof c1)) {
            return true;
        }
        this.f109703b.addAll(this.f109704c.invoke(lVarP));
        return false;
    }
}
