package rt1;

import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrt1/j;", "", "Lww1/h;", "raceDTO", "Lfg0/k;", "eventDTO", "<init>", "(Lww1/h;Lfg0/k;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ww1.h f154541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg0.k f154542b;

    static {
        Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
        Parcelable.Creator<ww1.h> creator2 = ww1.h.CREATOR;
    }

    public /* synthetic */ j(ww1.h hVar, fg0.k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : hVar, (i14 & 2) != 0 ? null : kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f154541a, jVar.f154541a) && s.g(this.f154542b, jVar.f154542b);
    }

    public final int hashCode() {
        ww1.h hVar = this.f154541a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        fg0.k kVar = this.f154542b;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlanLinkedData(raceDTO=" + this.f154541a + ", eventDTO=" + this.f154542b + ")";
    }

    public j(ww1.h hVar, fg0.k kVar) {
        this.f154541a = hVar;
        this.f154542b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
