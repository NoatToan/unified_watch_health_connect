package p33;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class a1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135412a;

    public a1(String str) {
        this.f135412a = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o1.a.C2568a c2568a = (o1.a.C2568a) obj;
        j jVar = g1.f135439a;
        c2568a.getClass();
        j jVar2 = g1.f135440b;
        c2568a.c(this.f135412a, jVar2, jVar2);
        c2568a.f135495e = b43.z.MustUse;
        return Unit.INSTANCE;
    }
}
