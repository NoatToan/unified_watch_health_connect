package ls0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lls0/o;", "", "Lyr0/i;", "flight", "previousFlight", "", "Lyr0/o;", "trips", "<init>", "(Lyr0/i;Lyr0/i;Ljava/util/List;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr0.i f114739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yr0.i f114740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<yr0.o> f114741c;

    public o(yr0.i iVar, yr0.i iVar2, List<yr0.o> list) {
        iVar.getClass();
        list.getClass();
        this.f114739a = iVar;
        this.f114740b = iVar2;
        this.f114741c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f114739a.equals(oVar.f114739a) && p005kotlin.jvm.internal.s.g(this.f114740b, oVar.f114740b) && this.f114741c.equals(oVar.f114741c);
    }

    public final int hashCode() {
        int iHashCode = this.f114739a.hashCode() * 31;
        yr0.i iVar = this.f114740b;
        return this.f114741c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TripFlightValidationData(flight=");
        sb3.append(this.f114739a);
        sb3.append(", previousFlight=");
        sb3.append(this.f114740b);
        sb3.append(", trips=");
        return u62.z.c(sb3, this.f114741c, ")");
    }
}
