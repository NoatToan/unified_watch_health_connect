package yz1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lyz1/a0;", "", "<init>", "()V", "a", "Lyz1/a0$a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a0 {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyz1/a0$a;", "Lyz1/a0;", "Lyz1/d;", "status", "", "todayValue", "todayGoal", "Li53/c;", "Lc02/c;", "goalsReachedLast7Days", "today", "<init>", "(Lyz1/d;Ljava/lang/Double;Ljava/lang/Double;Li53/c;Lc02/c;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f200238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f200239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f200240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<c02.c> f200241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c02.c f200242e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d dVar, Double d14, Double d15, i53.c<? extends c02.c> cVar, c02.c cVar2) {
            super(null);
            dVar.getClass();
            this.f200238a = dVar;
            this.f200239b = d14;
            this.f200240c = d15;
            this.f200241d = cVar;
            this.f200242e = cVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f200238a, aVar.f200238a) && p005kotlin.jvm.internal.s.g(this.f200239b, aVar.f200239b) && p005kotlin.jvm.internal.s.g(this.f200240c, aVar.f200240c) && p005kotlin.jvm.internal.s.g(this.f200241d, aVar.f200241d) && this.f200242e == aVar.f200242e;
        }

        public final int hashCode() {
            int iHashCode = this.f200238a.hashCode() * 31;
            Double d14 = this.f200239b;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f200240c;
            int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
            i53.c<c02.c> cVar = this.f200241d;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            c02.c cVar2 = this.f200242e;
            return iHashCode4 + (cVar2 != null ? cVar2.hashCode() : 0);
        }

        public final String toString() {
            return "WeekGoals(status=" + this.f200238a + ", todayValue=" + this.f200239b + ", todayGoal=" + this.f200240c + ", goalsReachedLast7Days=" + this.f200241d + ", today=" + this.f200242e + ")";
        }
    }

    public /* synthetic */ a0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private a0() {
    }
}
