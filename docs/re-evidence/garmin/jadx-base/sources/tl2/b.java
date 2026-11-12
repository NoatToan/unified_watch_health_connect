package tl2;

import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f165282b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f165281a = i14;
        this.f165282b = cVar;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        int i14 = this.f165281a;
        int i15 = 1;
        c cVar = this.f165282b;
        int i16 = 2;
        switch (i14) {
            case 0:
                c.b bVar = (c.b) obj;
                int i17 = c.f165283l;
                if (bVar == c.b.SUCCESS) {
                    cVar.d(new b(cVar, i15));
                    return;
                }
                cVar.f165293j.compareAndSet(1, 2);
                f fVar = cVar.f165286c;
                bVar.getClass();
                fVar.b(bVar);
                h hVar = cVar.f165294k;
                if (hVar != null) {
                    hVar.run();
                    return;
                } else {
                    s.m("transferCompletion");
                    throw null;
                }
            case 1:
                int i18 = c.f165283l;
                if (!((Boolean) obj).booleanValue()) {
                    cVar.g(new b(cVar, i16), 2);
                    return;
                } else {
                    cVar.i();
                    cVar.f165286c.a(cVar);
                    return;
                }
            default:
                c.b bVar2 = (c.b) obj;
                cVar.f165293j.compareAndSet(1, 2);
                f fVar2 = cVar.f165286c;
                bVar2.getClass();
                fVar2.b(bVar2);
                h hVar2 = cVar.f165294k;
                if (hVar2 != null) {
                    hVar2.run();
                    return;
                } else {
                    s.m("transferCompletion");
                    throw null;
                }
        }
    }
}
