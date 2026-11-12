package p33;

import p43.f2;

/* JADX INFO: loaded from: classes3.dex */
public class m1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f135479a = new m1();

    @Override // e23.l
    public final Object invoke(Object obj) {
        t23.h hVarT = ((f2) obj).F0().t();
        if (hVarT == null) {
            return Boolean.FALSE;
        }
        x33.f name = hVarT.getName();
        s23.c.f156232a.getClass();
        x33.c cVar = s23.c.f156238g;
        return Boolean.valueOf(p005kotlin.jvm.internal.s.g(name, cVar.f188596a.g()) && p005kotlin.jvm.internal.s.g(f43.e.c(hVarT), cVar));
    }
}
