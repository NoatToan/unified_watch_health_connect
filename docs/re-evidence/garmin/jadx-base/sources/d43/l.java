package d43;

import p005kotlin.Unit;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends g<Unit> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57486b = new a(null);

    public static final class b extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f57487c;

        public b(String str) {
            str.getClass();
            this.f57487c = str;
        }

        @Override // d43.g
        public final n0 a(t23.c0 c0Var) {
            return r43.l.c(r43.k.f150381v, this.f57487c);
        }

        @Override // d43.g
        public final String toString() {
            return this.f57487c;
        }
    }

    public l() {
        super(Unit.INSTANCE);
    }

    @Override // d43.g
    public final Unit b() {
        throw new UnsupportedOperationException();
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
