package s23;

import java.util.List;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f156281a;

    public n(u uVar) {
        this.f156281a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        o13.p pVar = (o13.p) obj;
        k23.l<Object>[] lVarArr = u.f156289i;
        pVar.getClass();
        String str = (String) pVar.f128594a;
        String str2 = (String) pVar.f128595b;
        u23.k kVarA = u23.g.a(this.f156281a.f156290a.e(), e0.g("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), tn.k.g(str2, "()"), "HIDDEN", false);
        u23.h.a aVar = u23.h.f168226x0;
        List listC = p13.w.c(kVarA);
        aVar.getClass();
        return u23.h.a.a(listC);
    }
}
