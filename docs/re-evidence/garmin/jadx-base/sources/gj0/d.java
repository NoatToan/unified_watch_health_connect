package gj0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgj0/d;", "", "Li53/d;", "Lyi0/c;", "Lgj0/f;", "ftpSportReportStates", "<init>", "(Li53/d;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.d<yi0.c, f> f77496a;

    public /* synthetic */ d(i53.d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? i53.a.c() : dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && s.g(this.f77496a, ((d) obj).f77496a);
    }

    public final int hashCode() {
        return this.f77496a.hashCode();
    }

    public final String toString() {
        return "FtpReportState(ftpSportReportStates=" + this.f77496a + ")";
    }

    public d(i53.d<yi0.c, f> dVar) {
        dVar.getClass();
        this.f77496a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
