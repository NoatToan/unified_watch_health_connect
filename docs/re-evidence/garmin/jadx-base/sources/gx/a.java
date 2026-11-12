package gx;

import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgx/a;", "", "Lyz1/d;", "status", "", "mostRecentValue", "chargedValue", "drainedValue", "", "last7DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f80001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f80002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f80003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f80004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f80005e;

    public a(yz1.d dVar, Integer num, Integer num2, Integer num3, boolean z14) {
        dVar.getClass();
        this.f80001a = dVar;
        this.f80002b = num;
        this.f80003c = num2;
        this.f80004d = num3;
        this.f80005e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f80001a.equals(aVar.f80001a) && s.g(this.f80002b, aVar.f80002b) && s.g(this.f80003c, aVar.f80003c) && s.g(this.f80004d, aVar.f80004d) && this.f80005e == aVar.f80005e;
    }

    public final int hashCode() {
        int iHashCode = this.f80001a.hashCode() * 31;
        Integer num = this.f80002b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f80003c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f80004d;
        return Boolean.hashCode(this.f80005e) + ((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BodyBatteryCardData(status=");
        sb3.append(this.f80001a);
        sb3.append(", mostRecentValue=");
        sb3.append(this.f80002b);
        sb3.append(", chargedValue=");
        x.m(sb3, this.f80003c, ", drainedValue=", this.f80004d, ", last7DaysDataAvailable=");
        return hb.a.k(sb3, this.f80005e, ")");
    }
}
