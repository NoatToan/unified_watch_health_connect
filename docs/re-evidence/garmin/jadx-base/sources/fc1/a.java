package fc1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfc1/a;", "Lfc1/h;", "Lyz1/d;", "status", "", "latestSpoValue", "", "since", "Li53/d;", "", "spoHourlyValues", "", "last7DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/String;Li53/d;Z)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f70393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f70394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.d<Float, Float> f70396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f70397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz1.d dVar, Integer num, String str, i53.d<Float, Float> dVar2, boolean z14) {
        super(null);
        dVar.getClass();
        dVar2.getClass();
        this.f70393a = dVar;
        this.f70394b = num;
        this.f70395c = str;
        this.f70396d = dVar2;
        this.f70397e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f70393a, aVar.f70393a) && s.g(this.f70394b, aVar.f70394b) && s.g(this.f70395c, aVar.f70395c) && s.g(this.f70396d, aVar.f70396d) && this.f70397e == aVar.f70397e;
    }

    public final int hashCode() {
        int iHashCode = this.f70393a.hashCode() * 31;
        Integer num = this.f70394b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f70395c;
        return Boolean.hashCode(this.f70397e) + l2.b(this.f70396d, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AllDayPulseOxCardData(status=");
        sb3.append(this.f70393a);
        sb3.append(", latestSpoValue=");
        sb3.append(this.f70394b);
        sb3.append(", since=");
        sb3.append(this.f70395c);
        sb3.append(", spoHourlyValues=");
        sb3.append(this.f70396d);
        sb3.append(", last7DaysDataAvailable=");
        return hb.a.k(sb3, this.f70397e, ")");
    }

    public /* synthetic */ a(yz1.d dVar, Integer num, String str, i53.d dVar2, boolean z14, int i14, j jVar) {
        this(dVar, num, str, (i14 & 8) != 0 ? i53.a.c() : dVar2, z14);
    }
}
