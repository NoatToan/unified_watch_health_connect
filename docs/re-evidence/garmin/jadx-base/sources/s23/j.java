package s23;

/* JADX INFO: loaded from: classes3.dex */
public class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f156267a;

    public j(k kVar) {
        this.f156267a = kVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k kVar = this.f156267a;
        i iVar = kVar.f156269f;
        if (iVar == null) {
            vb.h.q("JvmBuiltins instance has not been initialized properly");
            return null;
        }
        k.b bVar = (k.b) iVar.invoke();
        kVar.f156269f = null;
        return bVar;
    }
}
