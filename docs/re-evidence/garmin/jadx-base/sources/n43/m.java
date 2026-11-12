package n43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends b43.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<Object> f123651a;

    public m(List<Object> list) {
        this.f123651a = list;
    }

    @Override // b43.m
    public final void a(t23.b bVar) {
        bVar.getClass();
        p005kotlin.reflect.jvm.internal.impl.resolve.b.t(bVar, null);
        this.f123651a.add(bVar);
    }

    @Override // b43.l
    public final void d(t23.b bVar, t23.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        if (bVar2 instanceof w23.x) {
            ((w23.x) bVar2).J0(t23.s.f162063a, bVar);
        }
    }
}
