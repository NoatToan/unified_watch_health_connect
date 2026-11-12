package n43;

import p13.c1;

/* JADX INFO: loaded from: classes3.dex */
public class d0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.b f123622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f123623b;

    public d0(z.b bVar, z zVar) {
        this.f123622a = bVar;
        this.f123623b = zVar;
    }

    @Override // e23.a
    public final Object invoke() {
        return c1.h(this.f123622a.f123701a.keySet(), this.f123623b.o());
    }
}
