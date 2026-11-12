package n43;

import p13.c1;

/* JADX INFO: loaded from: classes3.dex */
public class e0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.b f123625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f123626b;

    public e0(z.b bVar, z zVar) {
        this.f123625a = bVar;
        this.f123626b = zVar;
    }

    @Override // e23.a
    public final Object invoke() {
        return c1.h(this.f123625a.f123702b.keySet(), this.f123626b.p());
    }
}
