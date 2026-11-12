package p33;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class l0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135472a;

    public l0(String str) {
        this.f135472a = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o1.a.C2568a c2568a = (o1.a.C2568a) obj;
        j jVar = g1.f135439a;
        c2568a.getClass();
        j jVar2 = g1.f135440b;
        String str = this.f135472a;
        c2568a.a(str, jVar2);
        c2568a.a(str, jVar2);
        c2568a.c(str, g1.f135439a);
        return Unit.INSTANCE;
    }
}
