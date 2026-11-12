package jl1;

import j53.l;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u000b\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u000b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljl1/d;", "", "", "loading", "favoriteActivitiesSelectionLimitReached", "Ljl1/c;", "saveResult", "Li53/c;", "Lzf2/d;", "originalFavoriteActivities", "favoriteActivities", "Li53/d;", "Lil1/a;", "", "allActivitiesByCategory", "nonFavoriteActivitiesByCategory", "<init>", "(ZZLjl1/c;Li53/c;Li53/c;Li53/d;Li53/d;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f99480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<zf2.d> f99481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<zf2.d> f99482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.d<il1.a, List<zf2.d>> f99483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.d<il1.a, List<zf2.d>> f99484g;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(boolean z14, boolean z15, c cVar, i53.c cVar2, i53.c cVar3, i53.d dVar, i53.d dVar2, int i14, j jVar) {
        i53.d dVar3;
        i53.d dVar4;
        z14 = (i14 & 1) != 0 ? false : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        cVar = (i14 & 4) != 0 ? c.C1911c.f99476a : cVar;
        cVar2 = (i14 & 8) != 0 ? l.b() : cVar2;
        cVar3 = (i14 & 16) != 0 ? cVar2 : cVar3;
        dVar = (i14 & 32) != 0 ? i53.a.c() : dVar;
        if ((i14 & 64) != 0) {
            dVar4 = dVar;
            dVar3 = dVar4;
        } else {
            dVar3 = dVar2;
            dVar4 = dVar;
        }
        this(z14, z15, cVar, cVar2, cVar3, dVar4, dVar3);
    }

    public static d a(d dVar, boolean z14, boolean z15, c cVar, i53.c cVar2, i53.c cVar3, i53.d dVar2, i53.d dVar3, int i14) {
        if ((i14 & 1) != 0) {
            z14 = dVar.f99478a;
        }
        boolean z16 = z14;
        if ((i14 & 2) != 0) {
            z15 = dVar.f99479b;
        }
        boolean z17 = z15;
        if ((i14 & 4) != 0) {
            cVar = dVar.f99480c;
        }
        c cVar4 = cVar;
        if ((i14 & 8) != 0) {
            cVar2 = dVar.f99481d;
        }
        i53.c cVar5 = cVar2;
        if ((i14 & 16) != 0) {
            cVar3 = dVar.f99482e;
        }
        i53.c cVar6 = cVar3;
        if ((i14 & 32) != 0) {
            dVar2 = dVar.f99483f;
        }
        i53.d dVar4 = dVar2;
        if ((i14 & 64) != 0) {
            dVar3 = dVar.f99484g;
        }
        i53.d dVar5 = dVar3;
        dVar.getClass();
        cVar4.getClass();
        cVar5.getClass();
        cVar6.getClass();
        dVar4.getClass();
        dVar5.getClass();
        return new d(z16, z17, cVar4, cVar5, cVar6, dVar4, dVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f99478a == dVar.f99478a && this.f99479b == dVar.f99479b && s.g(this.f99480c, dVar.f99480c) && s.g(this.f99481d, dVar.f99481d) && s.g(this.f99482e, dVar.f99482e) && s.g(this.f99483f, dVar.f99483f) && s.g(this.f99484g, dVar.f99484g);
    }

    public final int hashCode() {
        return this.f99484g.hashCode() + l2.b(this.f99483f, l2.a(this.f99482e, l2.a(this.f99481d, (this.f99480c.hashCode() + q6.f.g(Boolean.hashCode(this.f99478a) * 31, 31, this.f99479b)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SelectActivitiesUiState(loading=", ", favoriteActivitiesSelectionLimitReached=", ", saveResult=", this.f99478a, this.f99479b);
        sbM.append(this.f99480c);
        sbM.append(", originalFavoriteActivities=");
        sbM.append(this.f99481d);
        sbM.append(", favoriteActivities=");
        sbM.append(this.f99482e);
        sbM.append(", allActivitiesByCategory=");
        sbM.append(this.f99483f);
        sbM.append(", nonFavoriteActivitiesByCategory=");
        sbM.append(this.f99484g);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z14, boolean z15, c cVar, i53.c<? extends zf2.d> cVar2, i53.c<? extends zf2.d> cVar3, i53.d<il1.a, ? extends List<? extends zf2.d>> dVar, i53.d<il1.a, ? extends List<? extends zf2.d>> dVar2) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        dVar.getClass();
        dVar2.getClass();
        this.f99478a = z14;
        this.f99479b = z15;
        this.f99480c = cVar;
        this.f99481d = cVar2;
        this.f99482e = cVar3;
        this.f99483f = dVar;
        this.f99484g = dVar2;
    }

    public d() {
        this(false, false, null, null, null, null, null, 127, null);
    }
}
