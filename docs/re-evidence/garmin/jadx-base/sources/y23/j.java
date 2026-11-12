package y23;

import t23.z0;
import z23.x;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n33.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f194357a = new j();

    public static final class a implements n33.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f194358b;

        public a(x xVar) {
            xVar.getClass();
            this.f194358b = xVar;
        }

        @Override // t23.y0
        public final z0.a a() {
            z0.a aVar = z0.f162077a;
            aVar.getClass();
            return aVar;
        }

        @Override // n33.a
        public final x c() {
            return this.f194358b;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder();
            androidx.core.view.j.o(a.class, sb3, ": ");
            sb3.append(this.f194358b);
            return sb3.toString();
        }
    }

    private j() {
    }

    @Override // n33.b
    public final a a(o33.k kVar) {
        kVar.getClass();
        return new a((x) kVar);
    }
}
