package p33;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class o0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135487b;

    public o0(String str, String str2) {
        this.f135486a = str;
        this.f135487b = str2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o1.a.C2568a c2568a = (o1.a.C2568a) obj;
        j jVar = g1.f135439a;
        c2568a.getClass();
        c2568a.a(this.f135486a, g1.f135439a);
        c2568a.c(this.f135487b, g1.f135440b, g1.f135441c);
        c2568a.f135495e = b43.z.MustUse;
        return Unit.INSTANCE;
    }
}
