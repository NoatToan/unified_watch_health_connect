package fu1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfu1/t;", "", "Lfu1/a;", "nextWorkout", "", "workoutsThisWeek", "<init>", "(Lfu1/a;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f73554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73555b;

    public /* synthetic */ t(a aVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : aVar, (i15 & 2) != 0 ? 0 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f73554a, tVar.f73554a) && this.f73555b == tVar.f73555b;
    }

    public final int hashCode() {
        a aVar = this.f73554a;
        return Integer.hashCode(this.f73555b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    public final String toString() {
        return "ScheduleViewModel(nextWorkout=" + this.f73554a + ", workoutsThisWeek=" + this.f73555b + ")";
    }

    public t(a aVar, int i14) {
        this.f73554a = aVar;
        this.f73555b = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
