package kw;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkw/i;", "", "Lkw/h;", "rangeData", "Lkw/m;", "uiData", "<init>", "(Lkw/h;Lkw/m;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f106859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f106860b;

    public i(h hVar, m mVar) {
        mVar.getClass();
        this.f106859a = hVar;
        this.f106860b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f106859a, iVar.f106859a) && this.f106860b.equals(iVar.f106860b);
    }

    public final int hashCode() {
        h hVar = this.f106859a;
        return this.f106860b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31);
    }

    public final String toString() {
        return "BloodPressureRangeData(rangeData=" + this.f106859a + ", uiData=" + this.f106860b + ")";
    }
}
