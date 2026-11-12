package tl2;

import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f165278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cs2.a f165279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.b f165280d;

    public /* synthetic */ a(c cVar, cs2.a aVar, c.b bVar, int i14) {
        this.f165277a = i14;
        this.f165278b = cVar;
        this.f165279c = aVar;
        this.f165280d = bVar;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        int i14 = this.f165277a;
        c.b bVar = this.f165280d;
        cs2.a aVar = this.f165279c;
        c cVar = this.f165278b;
        switch (i14) {
            case 0:
                int i15 = c.f165283l;
                if (!((Boolean) obj).booleanValue()) {
                    cVar.f165290g.error("Failed doEndTransfer");
                    if (aVar != null) {
                        aVar.accept(Boolean.FALSE);
                    }
                }
                cVar.g(new a(cVar, aVar, bVar, 1), 2);
                return;
            default:
                c.b bVar2 = (c.b) obj;
                int i16 = c.f165283l;
                c.b bVar3 = c.b.SUCCESS;
                f fVar = cVar.f165286c;
                if (bVar2 != bVar3) {
                    bVar2.getClass();
                    fVar.b(bVar2);
                    if (aVar != null) {
                        aVar.accept(Boolean.FALSE);
                    }
                } else {
                    fVar.b(bVar);
                    if (aVar != null) {
                        aVar.accept(Boolean.TRUE);
                    }
                }
                h hVar = cVar.f165294k;
                if (hVar != null) {
                    hVar.run();
                    return;
                } else {
                    s.m("transferCompletion");
                    throw null;
                }
        }
    }
}
