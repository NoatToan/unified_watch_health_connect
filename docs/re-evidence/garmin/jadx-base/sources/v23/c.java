package v23;

import n43.h0;
import t23.e;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f175351a = new a();

        private a() {
        }

        @Override // v23.c
        public final boolean a(e eVar, h0 h0Var) {
            eVar.getClass();
            return true;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f175352a = new b();

        private b() {
        }

        @Override // v23.c
        public final boolean a(e eVar, h0 h0Var) {
            eVar.getClass();
            return !h0Var.getAnnotations().I3(d.f175353a);
        }
    }

    boolean a(e eVar, h0 h0Var);
}
