package f43;

import java.util.Collection;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
public class c implements z43.b.InterfaceC3774b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68879a;

    public c(boolean z14) {
        this.f68879a = z14;
    }

    @Override // z43.b.InterfaceC3774b
    public final Iterable a(Object obj) {
        Collection<? extends t23.b> collectionO;
        t23.b bVarA = (t23.b) obj;
        int i14 = e.f68881a;
        if (this.f68879a) {
            bVarA = bVarA != null ? bVarA.a() : null;
        }
        return (bVarA == null || (collectionO = bVarA.o()) == null) ? j0.f134944a : collectionO;
    }
}
