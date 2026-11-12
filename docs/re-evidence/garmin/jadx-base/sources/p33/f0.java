package p33;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class f0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135434b;

    public f0(String str, String str2) {
        this.f135433a = str;
        this.f135434b = str2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o1.a.C2568a c2568a = (o1.a.C2568a) obj;
        j jVar = g1.f135439a;
        c2568a.getClass();
        j jVar2 = g1.f135440b;
        String str = this.f135433a;
        c2568a.a(str, jVar2);
        j jVar3 = g1.f135439a;
        c2568a.a(this.f135434b, jVar2, jVar2, jVar3, jVar3);
        c2568a.c(str, jVar3);
        return Unit.INSTANCE;
    }
}
