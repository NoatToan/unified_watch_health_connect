package nt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnt2/c;", "", "Lnt2/a;", "cadence", "<init>", "(Lnt2/a;)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f127834a;

    public c(a aVar) {
        aVar.getClass();
        this.f127834a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f127834a == ((c) obj).f127834a;
    }

    public final int hashCode() {
        return this.f127834a.hashCode();
    }

    public final String toString() {
        return "UnitMetadata(cadence=" + this.f127834a + ")";
    }
}
