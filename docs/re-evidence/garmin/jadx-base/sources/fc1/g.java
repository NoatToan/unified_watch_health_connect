package fc1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfc1/g;", "Lfc1/h;", "Lyz1/d;", "status", "", "latestSpoValue", "", "since", "Li53/d;", "", "spoAvgValues", "acclimationValues", "", "last7DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/String;Li53/d;Li53/d;Z)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f70408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f70409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.d<Float, Float> f70411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.d<Float, Float> f70412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f70413f;

    public /* synthetic */ g(yz1.d dVar, Integer num, String str, i53.d dVar2, i53.d dVar3, boolean z14, int i14, j jVar) {
        this(dVar, num, str, (i14 & 8) != 0 ? i53.a.c() : dVar2, (i14 & 16) != 0 ? i53.a.c() : dVar3, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f70408a, gVar.f70408a) && s.g(this.f70409b, gVar.f70409b) && s.g(this.f70410c, gVar.f70410c) && s.g(this.f70411d, gVar.f70411d) && s.g(this.f70412e, gVar.f70412e) && this.f70413f == gVar.f70413f;
    }

    public final int hashCode() {
        int iHashCode = this.f70408a.hashCode() * 31;
        Integer num = this.f70409b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f70410c;
        return Boolean.hashCode(this.f70413f) + l2.b(this.f70412e, l2.b(this.f70411d, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "PulseOxAcclimationCardData(status=" + this.f70408a + ", latestSpoValue=" + this.f70409b + ", since=" + this.f70410c + ", spoAvgValues=" + this.f70411d + ", acclimationValues=" + this.f70412e + ", last7DaysDataAvailable=" + this.f70413f + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz1.d dVar, Integer num, String str, i53.d<Float, Float> dVar2, i53.d<Float, Float> dVar3, boolean z14) {
        super(null);
        dVar.getClass();
        dVar2.getClass();
        dVar3.getClass();
        this.f70408a = dVar;
        this.f70409b = num;
        this.f70410c = str;
        this.f70411d = dVar2;
        this.f70412e = dVar3;
        this.f70413f = z14;
    }
}
