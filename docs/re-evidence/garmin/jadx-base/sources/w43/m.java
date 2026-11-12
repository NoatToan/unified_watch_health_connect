package w43;

import java.util.List;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f182016a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f182017b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // w43.f
    public final boolean a(j33.e eVar) {
        List<j1> listF = eVar.f();
        listF.getClass();
        if (listF.isEmpty()) {
            return true;
        }
        for (j1 j1Var : listF) {
            j1Var.getClass();
            if (f43.e.a(j1Var) || j1Var.R() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // w43.f
    public final /* bridge */ String b(j33.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // w43.f
    public final String getDescription() {
        return f182017b;
    }
}
