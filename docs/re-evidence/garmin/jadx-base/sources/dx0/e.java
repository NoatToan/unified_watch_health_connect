package dx0;

import p005kotlin.Metadata;
import ww0.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldx0/e;", "", "Ldx0/a;", "chartType", "", "displaySetup", "displayNoData", "alwaysShowData", "periodPredictionsEnabled", "fertileWindowEnabled", "Lww0/i;", "userHormonalContraception", "<init>", "(Ldx0/a;ZZZZZLww0/i;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f61467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f61468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f61473g;

    public e(a aVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, i iVar) {
        aVar.getClass();
        iVar.getClass();
        this.f61467a = aVar;
        this.f61468b = z14;
        this.f61469c = z15;
        this.f61470d = z16;
        this.f61471e = z17;
        this.f61472f = z18;
        this.f61473g = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f61467a == eVar.f61467a && this.f61468b == eVar.f61468b && this.f61469c == eVar.f61469c && this.f61470d == eVar.f61470d && this.f61471e == eVar.f61471e && this.f61472f == eVar.f61472f && this.f61473g == eVar.f61473g;
    }

    public final int hashCode() {
        return this.f61473g.hashCode() + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(this.f61467a.hashCode() * 31, 31, this.f61468b), 31, this.f61469c), 31, this.f61470d), 31, this.f61471e), 31, this.f61472f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MenstrualCyclePieChartSettings(chartType=");
        sb3.append(this.f61467a);
        sb3.append(", displaySetup=");
        sb3.append(this.f61468b);
        sb3.append(", displayNoData=");
        kg.f.q(", alwaysShowData=", ", periodPredictionsEnabled=", sb3, this.f61469c, this.f61470d);
        kg.f.q(", fertileWindowEnabled=", ", userHormonalContraception=", sb3, this.f61471e, this.f61472f);
        sb3.append(this.f61473g);
        sb3.append(")");
        return sb3.toString();
    }
}
