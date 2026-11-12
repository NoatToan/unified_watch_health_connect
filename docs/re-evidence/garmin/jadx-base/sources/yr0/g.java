package yr0;

import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyr0/g;", "", "Lyr0/f;", "dailyStatus", "Lgs1/t;", "timeline", "Lyr0/t;", "tripGaugeState", "<init>", "(Lyr0/f;Lgs1/t;Lyr0/t;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f198958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gs1.t f198959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f198960c;

    public /* synthetic */ g(f fVar, gs1.t tVar, t tVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fVar, (i14 & 2) != 0 ? null : tVar, (i14 & 4) != 0 ? null : tVar2);
    }

    public final boolean a() {
        f fVar = this.f198958a;
        LocalDate localDateI = fVar.i();
        List<j> listJ = fVar.j();
        boolean z14 = false;
        if (listJ != null && !listJ.isEmpty() && localDateI != null) {
            for (j jVar : fVar.j()) {
                LocalDate localDateJ = jVar.j("yyyy-MM-dd'T'HH:mm:ss");
                LocalDate localDateB = jVar.b("yyyy-MM-dd'T'HH:mm:ss");
                if (localDateJ != null && localDateB != null && (localDateI.isAfter(localDateJ) || g22.k.g(localDateI, localDateJ))) {
                    if (localDateI.isBefore(localDateB) || g22.k.g(localDateI, localDateB)) {
                        z14 = true;
                    }
                }
            }
        }
        return z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f198958a, gVar.f198958a) && p005kotlin.jvm.internal.s.g(this.f198959b, gVar.f198959b) && this.f198960c == gVar.f198960c;
    }

    public final int hashCode() {
        int iHashCode = this.f198958a.hashCode() * 31;
        gs1.t tVar = this.f198959b;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.f198960c;
        return iHashCode2 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    public final String toString() {
        return "JetLagDetails(dailyStatus=" + this.f198958a + ", timeline=" + this.f198959b + ", tripGaugeState=" + this.f198960c + ")";
    }

    public g(f fVar, gs1.t tVar, t tVar2) {
        fVar.getClass();
        this.f198958a = fVar;
        this.f198959b = tVar;
        this.f198960c = tVar2;
    }
}
