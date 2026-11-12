package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lf62/i;", "", "", "value", "Lm52/j;", "unit", "<init>", "(Ljava/lang/Double;Lm52/j;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f69252c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f69253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m52.j f69254b;

    public i(Double d14, m52.j jVar) {
        this.f69253a = d14;
        this.f69254b = jVar;
    }

    public final boolean a() {
        Double d14 = this.f69253a;
        if (d14 == null) {
            return true;
        }
        double dDoubleValue = d14.doubleValue();
        return 14.0d <= dDoubleValue && dDoubleValue <= 150.0d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        Double d14 = this.f69253a;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        i iVar = (i) obj;
        Double d15 = iVar.f69253a;
        double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
        f69252c.getClass();
        return Math.abs(dDoubleValue - dDoubleValue2) < 1.0E-4d && this.f69254b == iVar.f69254b;
    }

    public final int hashCode() {
        Double d14 = this.f69253a;
        int iHashCode = (d14 != null ? d14.hashCode() : 0) * 31;
        m52.j jVar = this.f69254b;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "PoolSize(value=" + this.f69253a + ", unit=" + this.f69254b + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lf62/i$a;", "", "<init>", "()V", "", "POOL_SIZE_MINIMUM", "D", "POOL_SIZE_MAXIMUM", "EQUALITY_THRESHOLD", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
