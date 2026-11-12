package hl1;

import java.util.List;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lhl1/b;", "", "", "loading", "Li53/d;", "Lil1/a;", "", "Lzf2/d;", "allActivities", "Li53/c;", "supportedWorkouts", "selectedActivity", "showLocationPermission", "hasGCPlusSubscription", "<init>", "(ZLi53/d;Li53/c;Lzf2/d;ZZ)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.d<il1.a, List<zf2.d>> f84358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<zf2.d> f84359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zf2.d f84360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f84361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f84362f;

    public b(boolean z14, i53.d dVar, i53.c cVar, zf2.d dVar2, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? i53.a.c() : dVar, (i14 & 4) != 0 ? j53.l.b() : cVar, (i14 & 8) != 0 ? null : dVar2, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16);
    }

    public static b a(b bVar, boolean z14, i53.d dVar, i53.c cVar, zf2.d dVar2, boolean z15, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            z14 = bVar.f84357a;
        }
        boolean z17 = z14;
        if ((i14 & 2) != 0) {
            dVar = bVar.f84358b;
        }
        i53.d dVar3 = dVar;
        if ((i14 & 4) != 0) {
            cVar = bVar.f84359c;
        }
        i53.c cVar2 = cVar;
        if ((i14 & 8) != 0) {
            dVar2 = bVar.f84360d;
        }
        zf2.d dVar4 = dVar2;
        if ((i14 & 16) != 0) {
            z15 = bVar.f84361e;
        }
        boolean z18 = z15;
        if ((i14 & 32) != 0) {
            z16 = bVar.f84362f;
        }
        bVar.getClass();
        dVar3.getClass();
        cVar2.getClass();
        return new b(z17, dVar3, cVar2, dVar4, z18, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f84357a == bVar.f84357a && p005kotlin.jvm.internal.s.g(this.f84358b, bVar.f84358b) && p005kotlin.jvm.internal.s.g(this.f84359c, bVar.f84359c) && this.f84360d == bVar.f84360d && this.f84361e == bVar.f84361e && this.f84362f == bVar.f84362f;
    }

    public final int hashCode() {
        int iA = l2.a(this.f84359c, l2.b(this.f84358b, Boolean.hashCode(this.f84357a) * 31, 31), 31);
        zf2.d dVar = this.f84360d;
        return Boolean.hashCode(this.f84362f) + q6.f.g((iA + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f84361e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AllActivitiesUiState(loading=");
        sb3.append(this.f84357a);
        sb3.append(", allActivities=");
        sb3.append(this.f84358b);
        sb3.append(", supportedWorkouts=");
        sb3.append(this.f84359c);
        sb3.append(", selectedActivity=");
        sb3.append(this.f84360d);
        sb3.append(", showLocationPermission=");
        return com.airbnb.lottie.animation.keyframe.a.f(", hasGCPlusSubscription=", ")", sb3, this.f84361e, this.f84362f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(boolean z14, i53.d<il1.a, ? extends List<? extends zf2.d>> dVar, i53.c<? extends zf2.d> cVar, zf2.d dVar2, boolean z15, boolean z16) {
        dVar.getClass();
        cVar.getClass();
        this.f84357a = z14;
        this.f84358b = dVar;
        this.f84359c = cVar;
        this.f84360d = dVar2;
        this.f84361e = z15;
        this.f84362f = z16;
    }

    public b() {
        this(false, null, null, null, false, false, 63, null);
    }
}
