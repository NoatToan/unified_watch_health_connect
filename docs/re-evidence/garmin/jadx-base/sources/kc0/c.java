package kc0;

import o13.e;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import sc2.j;
import ve2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkc0/c;", "Lgn2/c$c;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements gn2.c.InterfaceC1576c {
    @Override // xc2.a
    public final zi2.a a() {
        return f.c(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h());
    }

    @Override // gn2.c.InterfaceC1576c
    @e
    public final dd2.c b() {
        j jVarD = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).d();
        String str = jVarD.f158514a;
        String str2 = jVarD.f158515b;
        dd2.b bVarB = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).b();
        return new dd2.c(str, str2, bVarB.f59210a, bVarB.f59211b);
    }

    @Override // xc2.b
    public final Object e(t13.d<? super String> dVar) {
        return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).g();
    }
}
