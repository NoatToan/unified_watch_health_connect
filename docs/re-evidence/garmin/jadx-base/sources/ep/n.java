package ep;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lep/n;", "", "", "userWeight", "", "isWattsPerKg", "Lep/c;", "selectedPowerCurveChip", "Lep/e;", "dataConfig", "<init>", "(DZLep/c;Lep/e;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f64838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f64840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f64841d;

    public n(double d14, boolean z14, c cVar, e eVar) {
        cVar.getClass();
        eVar.getClass();
        this.f64838a = d14;
        this.f64839b = z14;
        this.f64840c = cVar;
        this.f64841d = eVar;
    }

    public static n a(n nVar, boolean z14, c cVar, e eVar, int i14) {
        double d14 = nVar.f64838a;
        if ((i14 & 2) != 0) {
            z14 = nVar.f64839b;
        }
        boolean z15 = z14;
        if ((i14 & 4) != 0) {
            cVar = nVar.f64840c;
        }
        c cVar2 = cVar;
        if ((i14 & 8) != 0) {
            eVar = nVar.f64841d;
        }
        e eVar2 = eVar;
        nVar.getClass();
        cVar2.getClass();
        eVar2.getClass();
        return new n(d14, z15, cVar2, eVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Double.compare(this.f64838a, nVar.f64838a) == 0 && this.f64839b == nVar.f64839b && this.f64840c == nVar.f64840c && s.g(this.f64841d, nVar.f64841d);
    }

    public final int hashCode() {
        return this.f64841d.hashCode() + ((this.f64840c.hashCode() + q6.f.g(Double.hashCode(this.f64838a) * 31, 31, this.f64839b)) * 31);
    }

    public final String toString() {
        return "PowerCurveUiState(userWeight=" + this.f64838a + ", isWattsPerKg=" + this.f64839b + ", selectedPowerCurveChip=" + this.f64840c + ", dataConfig=" + this.f64841d + ")";
    }

    public /* synthetic */ n(double d14, boolean z14, c cVar, e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(d14, z14, (i14 & 4) != 0 ? c.ALL : cVar, eVar);
    }
}
