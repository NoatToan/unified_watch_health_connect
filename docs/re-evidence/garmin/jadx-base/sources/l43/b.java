package l43;

/* JADX INFO: loaded from: classes3.dex */
public class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f109986a;

    public b(c cVar) {
        this.f109986a = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.c cVar = (x33.c) obj;
        cVar.getClass();
        c cVar2 = this.f109986a;
        p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVarD = cVar2.d(cVar);
        if (aVarD == null) {
            return null;
        }
        n nVar = cVar2.f109991d;
        if (nVar != null) {
            aVarD.E0(nVar);
            return aVarD;
        }
        p005kotlin.jvm.internal.s.m("components");
        throw null;
    }
}
