package p33;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135445b;

    public h0(String str, String str2) {
        this.f135444a = str;
        this.f135445b = str2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o1.a.C2568a c2568a = (o1.a.C2568a) obj;
        j jVar = g1.f135439a;
        c2568a.getClass();
        j jVar2 = g1.f135440b;
        String str = this.f135444a;
        c2568a.a(str, jVar2);
        j jVar3 = g1.f135441c;
        j jVar4 = g1.f135439a;
        c2568a.a(this.f135445b, jVar2, jVar2, jVar3, jVar4);
        c2568a.c(str, jVar4);
        return Unit.INSTANCE;
    }
}
