package ti0;

import b71.i;
import i53.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lti0/a;", "", "Lyz1/d;", "status", "", "formattedValue", "Li53/c;", "", "slices", "indicatorValue", "", "zoneName", "trendingTypeKey", "<init>", "(Lyz1/d;Ljava/lang/String;Li53/c;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f164567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f164568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<Float> f164569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f164570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f164571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f164572f;

    public a(d dVar, String str, c<Float> cVar, Float f14, Integer num, Integer num2) {
        dVar.getClass();
        this.f164567a = dVar;
        this.f164568b = str;
        this.f164569c = cVar;
        this.f164570d = f14;
        this.f164571e = num;
        this.f164572f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f164567a.equals(aVar.f164567a) && s.g(this.f164568b, aVar.f164568b) && s.g(this.f164569c, aVar.f164569c) && s.g(this.f164570d, aVar.f164570d) && s.g(this.f164571e, aVar.f164571e) && s.g(this.f164572f, aVar.f164572f);
    }

    public final int hashCode() {
        int iHashCode = this.f164567a.hashCode() * 31;
        String str = this.f164568b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        c<Float> cVar = this.f164569c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Float f14 = this.f164570d;
        int iHashCode4 = (iHashCode3 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Integer num = this.f164571e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f164572f;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FtpCardData(status=");
        sb3.append(this.f164567a);
        sb3.append(", formattedValue=");
        sb3.append(this.f164568b);
        sb3.append(", slices=");
        sb3.append(this.f164569c);
        sb3.append(", indicatorValue=");
        sb3.append(this.f164570d);
        sb3.append(", zoneName=");
        return i.h(sb3, this.f164571e, ", trendingTypeKey=", this.f164572f, ")");
    }
}
