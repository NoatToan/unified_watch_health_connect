package b70;

import android.os.Parcelable;
import j61.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb70/h;", "", "Lj61/i;", "cyclingAbilityDTO", "Lj61/d;", "courseDemandsDTO", "Lk61/b;", "cyclingAbilitySummary", "<init>", "(Lj61/i;Lj61/d;Lk61/b;)V", "gcm-cycling-ability_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j61.d f16305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k61.b f16306c;

    static {
        Parcelable.Creator<j61.d> creator = j61.d.CREATOR;
        i.Companion companion = i.INSTANCE;
    }

    public h(i iVar, j61.d dVar, k61.b bVar) {
        this.f16304a = iVar;
        this.f16305b = dVar;
        this.f16306c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f16304a, hVar.f16304a) && s.g(this.f16305b, hVar.f16305b) && s.g(this.f16306c, hVar.f16306c);
    }

    public final int hashCode() {
        i iVar = this.f16304a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        j61.d dVar = this.f16305b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        k61.b bVar = this.f16306c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "LatestCyclingAbilityData(cyclingAbilityDTO=" + this.f16304a + ", courseDemandsDTO=" + this.f16305b + ", cyclingAbilitySummary=" + this.f16306c + ")";
    }
}
