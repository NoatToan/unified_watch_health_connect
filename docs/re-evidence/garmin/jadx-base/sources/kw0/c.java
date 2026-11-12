package kw0;

import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkw0/c;", "", "", "daysWhenLoggedYes", "daysWhenLoggedNo", "avgWhenLoggedYes", "avgWhenLoggedNo", "highestLoggingRate", "lowestLoggingRate", "impactResId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f106907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f106908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f106909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f106910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f106911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f106912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f106913g;

    public /* synthetic */ c(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : num2, (i15 & 4) != 0 ? null : num3, (i15 & 8) != 0 ? null : num4, (i15 & 16) != 0 ? null : num5, (i15 & 32) != 0 ? null : num6, (i15 & 64) != 0 ? -1 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f106907a, cVar.f106907a) && s.g(this.f106908b, cVar.f106908b) && s.g(this.f106909c, cVar.f106909c) && s.g(this.f106910d, cVar.f106910d) && s.g(this.f106911e, cVar.f106911e) && s.g(this.f106912f, cVar.f106912f) && this.f106913g == cVar.f106913g;
    }

    public final int hashCode() {
        Integer num = this.f106907a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f106908b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f106909c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f106910d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f106911e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f106912f;
        return Integer.hashCode(this.f106913g) + ((iHashCode5 + (num6 != null ? num6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f106907a, "BehaviourDailyLogStatsData(daysWhenLoggedYes=", ", daysWhenLoggedNo=", ", avgWhenLoggedYes=", this.f106908b);
        x.m(sbL, this.f106909c, ", avgWhenLoggedNo=", this.f106910d, ", highestLoggingRate=");
        x.m(sbL, this.f106911e, ", lowestLoggingRate=", this.f106912f, ", impactResId=");
        return am.j.q(sbL, this.f106913g, ")");
    }

    public c(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i14) {
        this.f106907a = num;
        this.f106908b = num2;
        this.f106909c = num3;
        this.f106910d = num4;
        this.f106911e = num5;
        this.f106912f = num6;
        this.f106913g = i14;
    }

    public c() {
        this(null, null, null, null, null, null, 0, 127, null);
    }
}
