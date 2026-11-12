package km1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkm1/w;", "", "<init>", "()V", "a", "b", "Lkm1/w$a;", "Lkm1/w$b;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class w {
    public /* synthetic */ w(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract d getF105618c();

    /* JADX INFO: renamed from: b */
    public abstract e getF105617b();

    /* JADX INFO: renamed from: c */
    public abstract c0 getF105616a();

    private w() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkm1/w$a;", "Lkm1/w;", "Lkm1/c0;", "sleepNeedFactor", "Lkm1/e;", "factorMeta", "Lkm1/d;", "factorLabel", "<init>", "(Lkm1/c0;Lkm1/e;Lkm1/d;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f105613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f105614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f105615c;

        public /* synthetic */ a(c0 c0Var, e eVar, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(c0Var, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? null : dVar);
        }

        @Override // km1.w
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF105618c() {
            return this.f105615c;
        }

        @Override // km1.w
        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getF105617b() {
            return this.f105614b;
        }

        @Override // km1.w
        /* JADX INFO: renamed from: c, reason: from getter */
        public final c0 getF105616a() {
            return this.f105613a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f105613a == aVar.f105613a && this.f105614b == aVar.f105614b && this.f105615c == aVar.f105615c;
        }

        public final int hashCode() {
            int iHashCode = this.f105613a.hashCode() * 31;
            e eVar = this.f105614b;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            d dVar = this.f105615c;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            return "Generic(sleepNeedFactor=" + this.f105613a + ", factorMeta=" + this.f105614b + ", factorLabel=" + this.f105615c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, e eVar, d dVar) {
            super(null);
            c0Var.getClass();
            this.f105613a = c0Var;
            this.f105614b = eVar;
            this.f105615c = dVar;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lkm1/w$b;", "Lkm1/w;", "Lkm1/c0;", "sleepNeedFactor", "Lkm1/e;", "factorMeta", "Lkm1/d;", "factorLabel", "<init>", "(Lkm1/c0;Lkm1/e;Lkm1/d;)V", "", "napCount", "totalNapTimeSeconds", "(Lkm1/c0;Lkm1/e;ILjava/lang/Integer;Lkm1/d;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f105616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f105617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f105618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f105619d;

        public /* synthetic */ b(c0 c0Var, e eVar, int i14, Integer num, d dVar, int i15, p005kotlin.jvm.internal.j jVar) {
            this(c0Var, (i15 & 2) != 0 ? null : eVar, (i15 & 4) != 0 ? 0 : i14, num, (i15 & 16) != 0 ? null : dVar);
        }

        @Override // km1.w
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF105618c() {
            return this.f105618c;
        }

        @Override // km1.w
        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getF105617b() {
            return this.f105617b;
        }

        @Override // km1.w
        /* JADX INFO: renamed from: c, reason: from getter */
        public final c0 getF105616a() {
            return this.f105616a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f105616a == bVar.f105616a && this.f105617b == bVar.f105617b && this.f105618c == bVar.f105618c;
        }

        public final int hashCode() {
            int iHashCode = this.f105616a.hashCode() * 31;
            e eVar = this.f105617b;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            d dVar = this.f105618c;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            return "Nap(sleepNeedFactor=" + this.f105616a + ", factorMeta=" + this.f105617b + ", factorLabel=" + this.f105618c + ")";
        }

        public /* synthetic */ b(c0 c0Var, e eVar, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(c0Var, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? null : dVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, e eVar, d dVar) {
            super(null);
            c0Var.getClass();
            this.f105616a = c0Var;
            this.f105617b = eVar;
            this.f105618c = dVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, e eVar, int i14, Integer num, d dVar) {
            this(c0Var, eVar, dVar);
            c0Var.getClass();
            this.f105619d = num;
        }
    }
}
