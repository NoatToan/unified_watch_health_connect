package a43;

import org.slf4j.Marker;
import p43.g2;
import p43.n0;
import p43.t1;

/* JADX INFO: loaded from: classes3.dex */
public class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1175a;

    public s(w wVar) {
        this.f1175a = wVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        t1 t1Var = (t1) obj;
        int i14 = w.f1179g;
        t1Var.getClass();
        if (t1Var.b()) {
            return Marker.ANY_MARKER;
        }
        n0 type = t1Var.getType();
        type.getClass();
        String strW = this.f1175a.W(type);
        if (t1Var.a() == g2.INVARIANT) {
            return strW;
        }
        return t1Var.a() + ' ' + strW;
    }
}
