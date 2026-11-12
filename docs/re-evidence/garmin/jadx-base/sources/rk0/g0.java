package rk0;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lrk0/g0;", "", "Lrk0/f0;", ModelSourceWrapper.TYPE, "Ljk0/x;", "fullDTO", "Lrk0/u0;", "loadingState", "savingState", "Lrk0/o0;", "editResult", "Lrk0/l;", "removedFromCollection", "", "retiredFromCollections", "showLoadErrorDialog", "<init>", "(Lrk0/f0;Ljk0/x;Lrk0/u0;Lrk0/u0;Lrk0/o0;Lrk0/l;ZZ)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f153128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk0.x f153129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f153130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f153131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f153132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f153133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f153134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f153135h;

    public /* synthetic */ g0(f0 f0Var, jk0.x xVar, u0 u0Var, u0 u0Var2, o0 o0Var, l lVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(f0Var, xVar, u0Var, u0Var2, o0Var, (i14 & 32) != 0 ? null : lVar, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? false : z15);
    }

    public static g0 a(g0 g0Var, f0 f0Var, jk0.x xVar, u0 u0Var, u0 u0Var2, o0 o0Var, l lVar, boolean z14, boolean z15, int i14) {
        if ((i14 & 1) != 0) {
            f0Var = g0Var.f153128a;
        }
        f0 f0Var2 = f0Var;
        if ((i14 & 2) != 0) {
            xVar = g0Var.f153129b;
        }
        jk0.x xVar2 = xVar;
        if ((i14 & 4) != 0) {
            u0Var = g0Var.f153130c;
        }
        u0 u0Var3 = u0Var;
        if ((i14 & 8) != 0) {
            u0Var2 = g0Var.f153131d;
        }
        u0 u0Var4 = u0Var2;
        if ((i14 & 16) != 0) {
            o0Var = g0Var.f153132e;
        }
        o0 o0Var2 = o0Var;
        if ((i14 & 32) != 0) {
            lVar = g0Var.f153133f;
        }
        l lVar2 = lVar;
        boolean z16 = (i14 & 64) != 0 ? g0Var.f153134g : z14;
        boolean z17 = (i14 & 128) != 0 ? g0Var.f153135h : z15;
        g0Var.getClass();
        f0Var2.getClass();
        o0Var2.getClass();
        return new g0(f0Var2, xVar2, u0Var3, u0Var4, o0Var2, lVar2, z16, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.f153128a, g0Var.f153128a) && p005kotlin.jvm.internal.s.g(this.f153129b, g0Var.f153129b) && this.f153130c == g0Var.f153130c && this.f153131d == g0Var.f153131d && p005kotlin.jvm.internal.s.g(this.f153132e, g0Var.f153132e) && p005kotlin.jvm.internal.s.g(this.f153133f, g0Var.f153133f) && this.f153134g == g0Var.f153134g && this.f153135h == g0Var.f153135h;
    }

    public final int hashCode() {
        int iHashCode = this.f153128a.hashCode() * 31;
        jk0.x xVar = this.f153129b;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        u0 u0Var = this.f153130c;
        int iHashCode3 = (iHashCode2 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        u0 u0Var2 = this.f153131d;
        int iHashCode4 = (this.f153132e.hashCode() + ((iHashCode3 + (u0Var2 == null ? 0 : u0Var2.hashCode())) * 31)) * 31;
        l lVar = this.f153133f;
        return Boolean.hashCode(this.f153135h) + q6.f.g((iHashCode4 + (lVar != null ? lVar.hashCode() : 0)) * 31, 31, this.f153134g);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearDetailsUIState(model=");
        sb3.append(this.f153128a);
        sb3.append(", fullDTO=");
        sb3.append(this.f153129b);
        sb3.append(", loadingState=");
        sb3.append(this.f153130c);
        sb3.append(", savingState=");
        sb3.append(this.f153131d);
        sb3.append(", editResult=");
        sb3.append(this.f153132e);
        sb3.append(", removedFromCollection=");
        sb3.append(this.f153133f);
        sb3.append(", retiredFromCollections=");
        return com.airbnb.lottie.animation.keyframe.a.f(", showLoadErrorDialog=", ")", sb3, this.f153134g, this.f153135h);
    }

    public g0(f0 f0Var, jk0.x xVar, u0 u0Var, u0 u0Var2, o0 o0Var, l lVar, boolean z14, boolean z15) {
        f0Var.getClass();
        o0Var.getClass();
        this.f153128a = f0Var;
        this.f153129b = xVar;
        this.f153130c = u0Var;
        this.f153131d = u0Var2;
        this.f153132e = o0Var;
        this.f153133f = lVar;
        this.f153134g = z14;
        this.f153135h = z15;
    }
}
