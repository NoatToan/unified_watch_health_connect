package cs0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import yr0.l;
import yr0.t;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcs0/c;", "", "Lyz1/d;", "status", "", "tripId", "", "isAcclimated", "Li53/c;", "Lyr0/l;", "suggestions", "Lyr0/t;", "tripGaugeState", "", "severity", "isPastState", "timeDifferenceInMinutes", "<init>", "(Lyz1/d;Ljava/lang/Long;ZLi53/c;Lyr0/t;Ljava/lang/Integer;ZLjava/lang/Integer;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f55448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f55449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<l> f55451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f55452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f55453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f55455h;

    static {
        l.Companion bVar = l.INSTANCE;
    }

    public c(d dVar, Long l14, boolean z14, i53.c<l> cVar, t tVar, Integer num, boolean z15, Integer num2) {
        dVar.getClass();
        this.f55448a = dVar;
        this.f55449b = l14;
        this.f55450c = z14;
        this.f55451d = cVar;
        this.f55452e = tVar;
        this.f55453f = num;
        this.f55454g = z15;
        this.f55455h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f55448a.equals(cVar.f55448a) && s.g(this.f55449b, cVar.f55449b) && this.f55450c == cVar.f55450c && s.g(this.f55451d, cVar.f55451d) && this.f55452e == cVar.f55452e && s.g(this.f55453f, cVar.f55453f) && this.f55454g == cVar.f55454g && s.g(this.f55455h, cVar.f55455h);
    }

    public final int hashCode() {
        int iHashCode = this.f55448a.hashCode() * 31;
        Long l14 = this.f55449b;
        int iG = f.g((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.f55450c);
        i53.c<l> cVar = this.f55451d;
        int iHashCode2 = (iG + (cVar == null ? 0 : cVar.hashCode())) * 31;
        t tVar = this.f55452e;
        int iHashCode3 = (iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Integer num = this.f55453f;
        int iG2 = f.g((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f55454g);
        Integer num2 = this.f55455h;
        return iG2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "JetLagCardData(status=" + this.f55448a + ", tripId=" + this.f55449b + ", isAcclimated=" + this.f55450c + ", suggestions=" + this.f55451d + ", tripGaugeState=" + this.f55452e + ", severity=" + this.f55453f + ", isPastState=" + this.f55454g + ", timeDifferenceInMinutes=" + this.f55455h + ")";
    }
}
