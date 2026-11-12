package hl1;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lhl1/f;", "", "", "loading", "isBandDevice", "Lsd2/f;", "deviceRecord", "Li53/c;", "Lzf2/d;", "favoriteActivities", "recentActivities", "supportedWorkouts", "selectedActivity", "showLocationPermission", "hasGCPlusSubscription", "<init>", "(ZZLsd2/f;Li53/c;Li53/c;Li53/c;Lzf2/d;ZZ)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f84386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<zf2.d> f84387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<zf2.d> f84388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<zf2.d> f84389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zf2.d f84390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f84391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f84392i;

    public f(boolean z14, boolean z15, sd2.f fVar, i53.c cVar, i53.c cVar2, i53.c cVar3, zf2.d dVar, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : fVar, (i14 & 8) != 0 ? j53.l.b() : cVar, (i14 & 16) != 0 ? j53.l.b() : cVar2, (i14 & 32) != 0 ? j53.l.b() : cVar3, (i14 & 64) != 0 ? null : dVar, (i14 & 128) != 0 ? false : z16, (i14 & 256) != 0 ? false : z17);
    }

    public static f a(f fVar, boolean z14, boolean z15, sd2.f fVar2, i53.c cVar, i53.c cVar2, i53.c cVar3, zf2.d dVar, boolean z16, boolean z17, int i14) {
        if ((i14 & 1) != 0) {
            z14 = fVar.f84384a;
        }
        boolean z18 = z14;
        if ((i14 & 2) != 0) {
            z15 = fVar.f84385b;
        }
        boolean z19 = z15;
        if ((i14 & 4) != 0) {
            fVar2 = fVar.f84386c;
        }
        sd2.f fVar3 = fVar2;
        if ((i14 & 8) != 0) {
            cVar = fVar.f84387d;
        }
        i53.c cVar4 = cVar;
        if ((i14 & 16) != 0) {
            cVar2 = fVar.f84388e;
        }
        i53.c cVar5 = cVar2;
        i53.c cVar6 = (i14 & 32) != 0 ? fVar.f84389f : cVar3;
        zf2.d dVar2 = (i14 & 64) != 0 ? fVar.f84390g : dVar;
        boolean z24 = (i14 & 128) != 0 ? fVar.f84391h : z16;
        boolean z25 = (i14 & 256) != 0 ? fVar.f84392i : z17;
        fVar.getClass();
        cVar4.getClass();
        cVar5.getClass();
        cVar6.getClass();
        return new f(z18, z19, fVar3, cVar4, cVar5, cVar6, dVar2, z24, z25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f84384a == fVar.f84384a && this.f84385b == fVar.f84385b && p005kotlin.jvm.internal.s.g(this.f84386c, fVar.f84386c) && p005kotlin.jvm.internal.s.g(this.f84387d, fVar.f84387d) && p005kotlin.jvm.internal.s.g(this.f84388e, fVar.f84388e) && p005kotlin.jvm.internal.s.g(this.f84389f, fVar.f84389f) && this.f84390g == fVar.f84390g && this.f84391h == fVar.f84391h && this.f84392i == fVar.f84392i;
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f84384a) * 31, 31, this.f84385b);
        sd2.f fVar = this.f84386c;
        int iA = l2.a(this.f84389f, l2.a(this.f84388e, l2.a(this.f84387d, (iG + (fVar == null ? 0 : fVar.hashCode())) * 31, 31), 31), 31);
        zf2.d dVar = this.f84390g;
        return Boolean.hashCode(this.f84392i) + q6.f.g((iA + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f84391h);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SelectActivitiesUiState(loading=", ", isBandDevice=", ", deviceRecord=", this.f84384a, this.f84385b);
        sbM.append(this.f84386c);
        sbM.append(", favoriteActivities=");
        sbM.append(this.f84387d);
        sbM.append(", recentActivities=");
        q6.f.w(sbM, this.f84388e, ", supportedWorkouts=", this.f84389f, ", selectedActivity=");
        sbM.append(this.f84390g);
        sbM.append(", showLocationPermission=");
        sbM.append(this.f84391h);
        sbM.append(", hasGCPlusSubscription=");
        return hb.a.k(sbM, this.f84392i, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(boolean z14, boolean z15, sd2.f fVar, i53.c<? extends zf2.d> cVar, i53.c<? extends zf2.d> cVar2, i53.c<? extends zf2.d> cVar3, zf2.d dVar, boolean z16, boolean z17) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f84384a = z14;
        this.f84385b = z15;
        this.f84386c = fVar;
        this.f84387d = cVar;
        this.f84388e = cVar2;
        this.f84389f = cVar3;
        this.f84390g = dVar;
        this.f84391h = z16;
        this.f84392i = z17;
    }

    public f() {
        this(false, false, null, null, null, null, null, false, false, 511, null);
    }
}
