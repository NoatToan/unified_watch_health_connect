package kw;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkw/p;", "", "Lkw/o;", "dailyBloodPressureDTO", "Lkw/m;", "uiData", "<init>", "(Lkw/o;Lkw/m;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f106894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f106895b;

    public p(o oVar, m mVar) {
        oVar.getClass();
        mVar.getClass();
        this.f106894a = oVar;
        this.f106895b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f106894a.equals(pVar.f106894a) && this.f106895b.equals(pVar.f106895b);
    }

    public final int hashCode() {
        return this.f106895b.hashCode() + (this.f106894a.hashCode() * 31);
    }

    public final String toString() {
        return "DailyBloodPressureDetails(dailyBloodPressureDTO=" + this.f106894a + ", uiData=" + this.f106895b + ")";
    }
}
