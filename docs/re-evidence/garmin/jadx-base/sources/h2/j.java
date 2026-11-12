package h2;

import g2.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh2/j$a;", "Lh2/j;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80923a = new a();

        private a() {
        }

        @Override // h2.j
        public final int a(s0 s0Var, int i14) {
            return i14;
        }
    }

    int a(s0 s0Var, int i14);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh2/j$b;", "Lh2/j;", "Lg6/f;", "pageSize", "<init>", "(FLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f80924a;

        private b(float f14) {
            this.f80924a = f14;
        }

        @Override // h2.j
        public final int a(s0 s0Var, int i14) {
            return s0Var.f75213b.f0(this.f80924a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return g6.f.c(this.f80924a, ((b) obj).f80924a);
        }

        public final int hashCode() {
            g6.f.a aVar = g6.f.f75994b;
            return Float.hashCode(this.f80924a);
        }

        public /* synthetic */ b(float f14, p005kotlin.jvm.internal.j jVar) {
            this(f14);
        }
    }
}
