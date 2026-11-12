package ve1;

import af1.e;
import m92.h0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lve1/a;", "", "Lm92/h0$e$a;", "chartPoint", "Laf1/e;", "classification", "<init>", "(Lm92/h0$e$a;Laf1/e;)V", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.e.a f177668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f177669b;

    public a(h0.e.a aVar, e eVar) {
        this.f177668a = aVar;
        this.f177669b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f177668a, aVar.f177668a) && this.f177669b == aVar.f177669b;
    }

    public final int hashCode() {
        h0.e.a aVar = this.f177668a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        e eVar = this.f177669b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "RunningEconomyChartPoint(chartPoint=" + this.f177668a + ", classification=" + this.f177669b + ")";
    }
}
