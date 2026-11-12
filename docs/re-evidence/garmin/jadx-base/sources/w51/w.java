package w51;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw51/w;", "", "", "isLoading", "showProgressOverlay", "isLoadingError", "Lw51/f;", "showError", "", "Lb63/o;", "", "Lz51/h;", "groupedActivities", "isRefreshing", "<init>", "(ZZZLw51/f;Ljava/util/Map;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f182445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f182446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f182447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f182448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<b63.o, List<z51.h>> f182449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f182450f;

    public /* synthetic */ w(boolean z14, boolean z15, boolean z16, f fVar, Map map, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? null : fVar, (i14 & 16) != 0 ? null : map, (i14 & 32) != 0 ? false : z17);
    }

    public static w a(w wVar, boolean z14, boolean z15, f fVar, Map map, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            z14 = wVar.f182445a;
        }
        boolean z17 = z14;
        if ((i14 & 2) != 0) {
            z15 = wVar.f182446b;
        }
        boolean z18 = z15;
        boolean z19 = (i14 & 4) != 0 ? wVar.f182447c : true;
        if ((i14 & 8) != 0) {
            fVar = wVar.f182448d;
        }
        f fVar2 = fVar;
        if ((i14 & 16) != 0) {
            map = wVar.f182449e;
        }
        Map map2 = map;
        if ((i14 & 32) != 0) {
            z16 = wVar.f182450f;
        }
        wVar.getClass();
        return new w(z17, z18, z19, fVar2, map2, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f182445a == wVar.f182445a && this.f182446b == wVar.f182446b && this.f182447c == wVar.f182447c && p005kotlin.jvm.internal.s.g(this.f182448d, wVar.f182448d) && p005kotlin.jvm.internal.s.g(this.f182449e, wVar.f182449e) && this.f182450f == wVar.f182450f;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Boolean.hashCode(this.f182445a) * 31, 31, this.f182446b), 31, this.f182447c);
        f fVar = this.f182448d;
        int iHashCode = (iG + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Map<b63.o, List<z51.h>> map = this.f182449e;
        return Boolean.hashCode(this.f182450f) + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PendingActivitiesUiState(isLoading=", ", showProgressOverlay=", ", isLoadingError=", this.f182445a, this.f182446b);
        sbM.append(this.f182447c);
        sbM.append(", showError=");
        sbM.append(this.f182448d);
        sbM.append(", groupedActivities=");
        sbM.append(this.f182449e);
        sbM.append(", isRefreshing=");
        sbM.append(this.f182450f);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(boolean z14, boolean z15, boolean z16, f fVar, Map<b63.o, ? extends List<z51.h>> map, boolean z17) {
        this.f182445a = z14;
        this.f182446b = z15;
        this.f182447c = z16;
        this.f182448d = fVar;
        this.f182449e = map;
        this.f182450f = z17;
    }

    public w() {
        this(false, false, false, null, null, false, 63, null);
    }
}
