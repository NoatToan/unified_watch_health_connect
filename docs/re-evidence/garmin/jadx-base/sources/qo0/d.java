package qo0;

import b63.o;
import b63.z;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqo0/d;", "", "", "isLoading", "showTooltipPortrait", "showTooltipLandscape", "isScreenInPortrait", "Lb63/o;", "selectedDate", "Lo82/g;", "selectedIntervalType", "Lgs1/d$b;", "abnormalHRToBeDeleted", "isAutorotateEnabled", "<init>", "(ZZZZLb63/o;Lo82/g;Lgs1/d$b;Z)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f145950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f145951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f145952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gs1.d.b f145953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f145954h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(boolean z14, boolean z15, boolean z16, boolean z17, o oVar, g gVar, gs1.d.b bVar, boolean z18, int i14, j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        z16 = (i14 & 4) != 0 ? false : z16;
        z17 = (i14 & 8) != 0 ? true : z17;
        if ((i14 & 16) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(z14, z15, z16, z17, oVar, (i14 & 32) != 0 ? g.f130850c : gVar, (i14 & 64) != 0 ? null : bVar, (i14 & 128) != 0 ? false : z18);
    }

    public static d a(d dVar, boolean z14, boolean z15, boolean z16, boolean z17, o oVar, g gVar, gs1.d.b bVar, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            z14 = dVar.f145947a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            z15 = dVar.f145948b;
        }
        boolean z24 = z15;
        if ((i14 & 4) != 0) {
            z16 = dVar.f145949c;
        }
        boolean z25 = z16;
        if ((i14 & 8) != 0) {
            z17 = dVar.f145950d;
        }
        boolean z26 = z17;
        if ((i14 & 16) != 0) {
            oVar = dVar.f145951e;
        }
        o oVar2 = oVar;
        if ((i14 & 32) != 0) {
            gVar = dVar.f145952f;
        }
        g gVar2 = gVar;
        gs1.d.b bVar2 = (i14 & 64) != 0 ? dVar.f145953g : bVar;
        boolean z27 = (i14 & 128) != 0 ? dVar.f145954h : z18;
        dVar.getClass();
        oVar2.getClass();
        gVar2.getClass();
        return new d(z19, z24, z25, z26, oVar2, gVar2, bVar2, z27);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f145947a == dVar.f145947a && this.f145948b == dVar.f145948b && this.f145949c == dVar.f145949c && this.f145950d == dVar.f145950d && s.g(this.f145951e, dVar.f145951e) && this.f145952f == dVar.f145952f && s.g(this.f145953g, dVar.f145953g) && this.f145954h == dVar.f145954h;
    }

    public final int hashCode() {
        int i14 = f.i(this.f145952f, n23.j.a(this.f145951e.f16206a, f.g(f.g(f.g(Boolean.hashCode(this.f145947a) * 31, 31, this.f145948b), 31, this.f145949c), 31, this.f145950d), 31), 31);
        gs1.d.b bVar = this.f145953g;
        return Boolean.hashCode(this.f145954h) + ((i14 + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("UiState(isLoading=", ", showTooltipPortrait=", ", showTooltipLandscape=", this.f145947a, this.f145948b);
        kg.f.q(", isScreenInPortrait=", ", selectedDate=", sbM, this.f145949c, this.f145950d);
        sbM.append(this.f145951e);
        sbM.append(", selectedIntervalType=");
        sbM.append(this.f145952f);
        sbM.append(", abnormalHRToBeDeleted=");
        sbM.append(this.f145953g);
        sbM.append(", isAutorotateEnabled=");
        sbM.append(this.f145954h);
        sbM.append(")");
        return sbM.toString();
    }

    public d(boolean z14, boolean z15, boolean z16, boolean z17, o oVar, g gVar, gs1.d.b bVar, boolean z18) {
        oVar.getClass();
        gVar.getClass();
        this.f145947a = z14;
        this.f145948b = z15;
        this.f145949c = z16;
        this.f145950d = z17;
        this.f145951e = oVar;
        this.f145952f = gVar;
        this.f145953g = bVar;
        this.f145954h = z18;
    }

    public d() {
        this(false, false, false, false, null, null, null, false, 255, null);
    }
}
