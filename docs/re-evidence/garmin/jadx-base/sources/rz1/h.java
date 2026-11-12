package rz1;

import b71.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import j53.l;
import oz1.s;
import oz1.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrz1/h;", "", "Lyz1/d;", "status", "", FirebaseAnalytics.Param.SCORE, "Loz1/u;", "trainingReadinessStatus", "Loz1/s;", "feedback", "", "validSleep", "Li53/c;", "Loz1/a;", "factors", "hasTodayData", "last4WeeksDataAvailable", "last3DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Float;Loz1/u;Loz1/s;Ljava/lang/Boolean;Li53/c;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f155230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f155231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f155232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f155233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f155234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<oz1.a> f155235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f155236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f155237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f155238i;

    public h(yz1.d dVar, Float f14, u uVar, s sVar, Boolean bool, i53.c cVar, Boolean bool2, Boolean bool3, Boolean bool4, int i14, j jVar) {
        this(dVar, f14, uVar, sVar, bool, (i14 & 32) != 0 ? l.b() : cVar, (i14 & 64) != 0 ? null : bool2, (i14 & 128) != 0 ? null : bool3, (i14 & 256) != 0 ? null : bool4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f155230a, hVar.f155230a) && p005kotlin.jvm.internal.s.g(this.f155231b, hVar.f155231b) && this.f155232c == hVar.f155232c && this.f155233d == hVar.f155233d && p005kotlin.jvm.internal.s.g(this.f155234e, hVar.f155234e) && p005kotlin.jvm.internal.s.g(this.f155235f, hVar.f155235f) && p005kotlin.jvm.internal.s.g(this.f155236g, hVar.f155236g) && p005kotlin.jvm.internal.s.g(this.f155237h, hVar.f155237h) && p005kotlin.jvm.internal.s.g(this.f155238i, hVar.f155238i);
    }

    public final int hashCode() {
        int iHashCode = this.f155230a.hashCode() * 31;
        Float f14 = this.f155231b;
        int iHashCode2 = (iHashCode + (f14 == null ? 0 : f14.hashCode())) * 31;
        u uVar = this.f155232c;
        int iHashCode3 = (iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        s sVar = this.f155233d;
        int iHashCode4 = (iHashCode3 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Boolean bool = this.f155234e;
        int iA = l2.a(this.f155235f, (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        Boolean bool2 = this.f155236g;
        int iHashCode5 = (iA + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f155237h;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f155238i;
        return iHashCode6 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingReadinessCardData(status=");
        sb3.append(this.f155230a);
        sb3.append(", score=");
        sb3.append(this.f155231b);
        sb3.append(", trainingReadinessStatus=");
        sb3.append(this.f155232c);
        sb3.append(", feedback=");
        sb3.append(this.f155233d);
        sb3.append(", validSleep=");
        sb3.append(this.f155234e);
        sb3.append(", factors=");
        sb3.append(this.f155235f);
        sb3.append(", hasTodayData=");
        i.o(this.f155236g, this.f155237h, ", last4WeeksDataAvailable=", ", last3DaysDataAvailable=", sb3);
        return p6.b.f(sb3, this.f155238i, ")");
    }

    public h(yz1.d dVar, Float f14, u uVar, s sVar, Boolean bool, i53.c<oz1.a> cVar, Boolean bool2, Boolean bool3, Boolean bool4) {
        dVar.getClass();
        cVar.getClass();
        this.f155230a = dVar;
        this.f155231b = f14;
        this.f155232c = uVar;
        this.f155233d = sVar;
        this.f155234e = bool;
        this.f155235f = cVar;
        this.f155236g = bool2;
        this.f155237h = bool3;
        this.f155238i = bool4;
    }
}
