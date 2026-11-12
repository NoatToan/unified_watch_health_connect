package p33;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f135417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f135418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f135419c;

    public c(f fVar, List list, int i14) {
        this.f135417a = fVar;
        this.f135418b = list;
        this.f135419c = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        f.a aVar = (f.a) this.f135418b.get(this.f135419c);
        f fVar = this.f135417a;
        fVar.getClass();
        h33.c cVarF = ((aVar.f135432c == null) || (fVar.f() == h33.c.TYPE_PARAMETER_BOUNDS)) ? fVar.f() : h33.c.TYPE_USE;
        h33.y yVar = aVar.f135431b;
        if (yVar != null) {
            return yVar.f81514a.get(cVarF);
        }
        return null;
    }
}
