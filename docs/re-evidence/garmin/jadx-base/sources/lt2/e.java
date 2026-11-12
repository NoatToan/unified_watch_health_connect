package lt2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Llt2/e;", "", "", "value", "benchmarkPercentage", "benchmarkWeight", "<init>", "(DDD)V", "a", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f114882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f114883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f114884c;

    static {
        new a(null);
    }

    public /* synthetic */ e(double d14, double d15, double d16, int i14, j jVar) {
        this((i14 & 1) != 0 ? Double.NaN : d14, (i14 & 2) != 0 ? Double.NaN : d15, (i14 & 4) != 0 ? Double.NaN : d16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Double.compare(this.f114882a, eVar.f114882a) == 0 && Double.compare(this.f114883b, eVar.f114883b) == 0 && Double.compare(this.f114884c, eVar.f114884c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f114884c) + org.apache.commons.lang3.e.b(Double.hashCode(this.f114882a) * 31, 31, this.f114883b);
    }

    public final String toString() {
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("CommonWeight(value=", this.f114882a, ", benchmarkPercentage=");
        sbA.append(this.f114883b);
        return am.j.r(sbA, ", benchmarkWeight=", this.f114884c, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Llt2/e$a;", "", "<init>", "()V", "", "BENCHMARK_PERCENTAGE_NO_VALUE", "D", "BENCHMARK_WEIGHT_NO_VALUE", "WEIGHT_NO_VALUE", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(double d14, double d15, double d16) {
        this.f114882a = d14;
        this.f114883b = d15;
        this.f114884c = d16;
    }

    public e() {
        this(0.0d, 0.0d, 0.0d, 7, null);
    }
}
