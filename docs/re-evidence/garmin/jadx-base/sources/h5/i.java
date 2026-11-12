package h5;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final <T> T a(h hVar, p3.t<T> tVar) {
        if (!hVar.getNode().getIsAttached()) {
            e5.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) k.g(hVar).D.a(tVar);
    }
}
