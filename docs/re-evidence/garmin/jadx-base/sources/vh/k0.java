package vh;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/k0;", "", "T", "Lvh/a;", "wrappedAdapter", "<init>", "(Lvh/a;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class k0<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f178342a;

    public k0(a<T> aVar) {
        aVar.getClass();
        this.f178342a = aVar;
        if (aVar instanceof k0) {
            vb.h.z("The adapter is already nullable");
            throw null;
        }
    }

    @Override // vh.a
    public final void a(zh.g gVar, z zVar, T t7) {
        gVar.getClass();
        zVar.getClass();
        if (t7 == null) {
            gVar.l4();
        } else {
            this.f178342a.a(gVar, zVar, t7);
        }
    }

    @Override // vh.a
    public final T b(zh.f fVar, z zVar) {
        fVar.getClass();
        zVar.getClass();
        if (fVar.peek() != zh.f.a.NULL) {
            return this.f178342a.b(fVar, zVar);
        }
        fVar.skipValue();
        return null;
    }
}
