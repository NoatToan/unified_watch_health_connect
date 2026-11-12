package f2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: f2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf2/b$b;", "Lf2/b;", "", "count", "<init>", "(I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1415b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68174a;

        public C1415b(int i14) {
            this.f68174a = i14;
            if (i14 > 0) {
                return;
            }
            b2.e.a("Provided count should be larger than zero");
        }

        @Override // f2.b
        public final ArrayList a(g6.c cVar, int i14, int i15) {
            return j.b(i14, this.f68174a, i15);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C1415b) {
                return this.f68174a == ((C1415b) obj).f68174a;
            }
            return false;
        }

        public final int hashCode() {
            return -this.f68174a;
        }
    }

    ArrayList a(g6.c cVar, int i14, int i15);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf2/b$a;", "Lf2/b;", "Lg6/f;", "minSize", "<init>", "(FLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f68173a;

        private a(float f14) {
            this.f68173a = f14;
            if (g6.f.b(f14, (float) 0) > 0) {
                return;
            }
            b2.e.a("Provided min size should be larger than zero.");
        }

        @Override // f2.b
        public final ArrayList a(g6.c cVar, int i14, int i15) {
            return j.b(i14, Math.max((i14 + i15) / (cVar.f0(this.f68173a) + i15), 1), i15);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return g6.f.c(this.f68173a, ((a) obj).f68173a);
            }
            return false;
        }

        public final int hashCode() {
            g6.f.a aVar = g6.f.f75994b;
            return Float.hashCode(this.f68173a);
        }

        public /* synthetic */ a(float f14, p005kotlin.jvm.internal.j jVar) {
            this(f14);
        }
    }
}
