package a43;

import java.util.ArrayList;
import p13.x0;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1104a = new a();

        private a() {
        }

        @Override // a43.b
        public final String a(t23.h hVar, n nVar) {
            nVar.getClass();
            if (hVar instanceof d1) {
                x33.f name = ((d1) hVar).getName();
                name.getClass();
                return nVar.p(name, false);
            }
            x33.d dVarF = b43.i.f(hVar);
            dVarF.getClass();
            return nVar.o(dVarF);
        }
    }

    /* JADX INFO: renamed from: a43.b$b, reason: collision with other inner class name */
    public static final class C0011b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0011b f1105a = new C0011b();

        private C0011b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [t23.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [t23.l] */
        /* JADX WARN: Type inference failed for: r2v2, types: [t23.l] */
        @Override // a43.b
        public final String a(t23.h hVar, n nVar) {
            nVar.getClass();
            if (hVar instanceof d1) {
                x33.f name = ((d1) hVar).getName();
                name.getClass();
                return nVar.p(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(hVar.getName());
                hVar = hVar.d();
            } while (hVar instanceof t23.e);
            return xy2.b.H(new x0(arrayList));
        }
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f1106a = new c();

        private c() {
        }

        public static String b(t23.h hVar) {
            String strH;
            x33.f name = hVar.getName();
            name.getClass();
            String strF = xy2.b.F(name);
            if (!(hVar instanceof d1)) {
                t23.l lVarD = hVar.d();
                lVarD.getClass();
                if (lVarD instanceof t23.e) {
                    strH = b((t23.h) lVarD);
                } else if (lVarD instanceof t23.h0) {
                    x33.d dVar = ((t23.h0) lVarD).c().f188596a;
                    dVar.getClass();
                    strH = xy2.b.H(x33.d.f(dVar));
                } else {
                    strH = null;
                }
                if (strH != null && !strH.equals("")) {
                    return strH + '.' + strF;
                }
            }
            return strF;
        }

        @Override // a43.b
        public final String a(t23.h hVar, n nVar) {
            nVar.getClass();
            return b(hVar);
        }
    }

    String a(t23.h hVar, n nVar);
}
