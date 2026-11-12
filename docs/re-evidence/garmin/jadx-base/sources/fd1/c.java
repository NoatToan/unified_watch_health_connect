package fd1;

import m92.h0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfd1/c;", "", "Lad1/b;", "racePredictorDistance", "Li53/c;", "Lm92/h0$e$a;", "lineData", "<init>", "(Lad1/b;Li53/c;)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad1.b f70481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<h0.e.a> f70482b;

    public c(ad1.b bVar, i53.c<h0.e.a> cVar) {
        bVar.getClass();
        cVar.getClass();
        this.f70481a = bVar;
        this.f70482b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f70481a == cVar.f70481a && this.f70482b.equals(cVar.f70482b);
    }

    public final int hashCode() {
        return this.f70482b.hashCode() + (this.f70481a.hashCode() * 31);
    }

    public final String toString() {
        return "RacePredictorChartLine(racePredictorDistance=" + this.f70481a + ", lineData=" + this.f70482b + ")";
    }
}
