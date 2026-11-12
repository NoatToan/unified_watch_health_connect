package g01;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface n {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg01/n$a;", "Lg01/n;", "Lb11/a;", "consumable", "<init>", "(Lb11/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b11.a f74224a;

        public a(b11.a aVar) {
            aVar.getClass();
            this.f74224a = aVar;
        }

        @Override // g01.n
        public final String a() {
            b11.a aVar = this.f74224a;
            if (aVar instanceof b11.a.C0202a) {
                return ((b11.a.C0202a) aVar).f14222e.f14253a;
            }
            if (aVar instanceof b11.a.b) {
                return String.valueOf(((b11.a.b) aVar).f14228d);
            }
            if (aVar instanceof b11.a.c) {
                return ((b11.a.c) aVar).f14238e.f14253a;
            }
            u0.r();
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f74224a.equals(((a) obj).f74224a);
        }

        public final int hashCode() {
            return this.f74224a.hashCode();
        }

        public final String toString() {
            return "FoodItem(consumable=" + this.f74224a + ")";
        }
    }

    String a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/n$b;", "Lg01/n;", "", "titleResId", "Lb11/l;", "selectedMealWindow", "<init>", "(ILb11/l;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b11.l f74226b;

        public /* synthetic */ b(int i14, b11.l lVar, int i15, p005kotlin.jvm.internal.j jVar) {
            this(i14, (i15 & 2) != 0 ? null : lVar);
        }

        @Override // g01.n
        public final String a() {
            b11.l lVar = this.f74226b;
            return org.apache.commons.lang3.e.d(this.f74225a, "_", lVar != null ? lVar.f14332b : null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f74225a == bVar.f74225a && p005kotlin.jvm.internal.s.g(this.f74226b, bVar.f74226b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f74225a) * 31;
            b11.l lVar = this.f74226b;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public final String toString() {
            return "HeaderItem(titleResId=" + this.f74225a + ", selectedMealWindow=" + this.f74226b + ")";
        }

        public b(int i14, b11.l lVar) {
            this.f74225a = i14;
            this.f74226b = lVar;
        }
    }
}
