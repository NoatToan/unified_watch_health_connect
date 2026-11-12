package kk1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkk1/j;", "", "", "isLoading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "authProhibited", "Li53/d;", "Lhk1/d;", "capabilitiesData", "Lhk1/c;", "consentData", "appDisconnected", "<init>", "(ZZZLi53/d;Lhk1/c;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.d<hk1.d, Boolean> f105168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hk1.c f105169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f105170f;

    public /* synthetic */ j(boolean z14, boolean z15, boolean z16, i53.d dVar, hk1.c cVar, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? i53.a.c() : dVar, (i14 & 16) != 0 ? null : cVar, (i14 & 32) != 0 ? false : z17);
    }

    public static j a(j jVar, boolean z14, boolean z15, i53.g gVar, boolean z16, int i14) {
        if ((i14 & 2) != 0) {
            z15 = jVar.f105166b;
        }
        boolean z17 = z15;
        boolean z18 = jVar.f105167c;
        i53.d<hk1.d, Boolean> dVar = gVar;
        if ((i14 & 8) != 0) {
            dVar = jVar.f105168d;
        }
        i53.d<hk1.d, Boolean> dVar2 = dVar;
        hk1.c cVar = jVar.f105169e;
        if ((i14 & 32) != 0) {
            z16 = jVar.f105170f;
        }
        jVar.getClass();
        dVar2.getClass();
        return new j(z14, z17, z18, dVar2, cVar, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f105165a == jVar.f105165a && this.f105166b == jVar.f105166b && this.f105167c == jVar.f105167c && s.g(this.f105168d, jVar.f105168d) && s.g(this.f105169e, jVar.f105169e) && this.f105170f == jVar.f105170f;
    }

    public final int hashCode() {
        int iB = l2.b(this.f105168d, q6.f.g(q6.f.g(Boolean.hashCode(this.f105165a) * 31, 31, this.f105166b), 31, this.f105167c), 31);
        hk1.c cVar = this.f105169e;
        return Boolean.hashCode(this.f105170f) + ((iB + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ThirdPartyDetailsUIState(isLoading=", ", error=", ", authProhibited=", this.f105165a, this.f105166b);
        sbM.append(this.f105167c);
        sbM.append(", capabilitiesData=");
        sbM.append(this.f105168d);
        sbM.append(", consentData=");
        sbM.append(this.f105169e);
        sbM.append(", appDisconnected=");
        sbM.append(this.f105170f);
        sbM.append(")");
        return sbM.toString();
    }

    public j(boolean z14, boolean z15, boolean z16, i53.d<hk1.d, Boolean> dVar, hk1.c cVar, boolean z17) {
        dVar.getClass();
        this.f105165a = z14;
        this.f105166b = z15;
        this.f105167c = z16;
        this.f105168d = dVar;
        this.f105169e = cVar;
        this.f105170f = z17;
    }

    public j() {
        this(false, false, false, null, null, false, 63, null);
    }
}
