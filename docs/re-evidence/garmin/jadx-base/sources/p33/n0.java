package p33;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class n0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135483b;

    public n0(String str, String str2) {
        this.f135482a = str;
        this.f135483b = str2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o1.a.C2568a c2568a = (o1.a.C2568a) obj;
        j jVar = g1.f135439a;
        c2568a.getClass();
        j jVar2 = g1.f135441c;
        c2568a.a(this.f135482a, jVar2);
        c2568a.c(this.f135483b, g1.f135440b, jVar2);
        c2568a.f135495e = b43.z.MustUse;
        return Unit.INSTANCE;
    }
}
