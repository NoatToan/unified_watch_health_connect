package jk1;

import com.google.firebase.messaging.Constants;
import hk1.l;
import hk1.r;
import hk1.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljk1/e;", "", "", "isLoading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lhk1/l;", "errorType", "Lhk1/r;", "thirdPartyBasicData", "Lhk1/y;", "thirdPartySupportState", "Li53/d;", "Lhk1/d;", "capabilitiesData", "Lhk1/c;", "consentData", "redirectToPartnerApp", "", "redirectUri", "<init>", "(ZZLhk1/l;Lhk1/r;Lhk1/y;Li53/d;Lhk1/c;ZLjava/lang/String;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f99389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f99390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f99391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.d<hk1.d, Boolean> f99392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hk1.c f99393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f99394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f99395i;

    public /* synthetic */ e(boolean z14, boolean z15, l lVar, r rVar, y yVar, i53.d dVar, hk1.c cVar, boolean z16, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : lVar, (i14 & 8) != 0 ? null : rVar, (i14 & 16) != 0 ? null : yVar, (i14 & 32) != 0 ? i53.a.c() : dVar, (i14 & 64) != 0 ? null : cVar, (i14 & 128) != 0 ? false : z16, (i14 & 256) != 0 ? "" : str);
    }

    public static e a(e eVar, boolean z14, y.a aVar, i53.g gVar, String str, int i14) {
        if ((i14 & 1) != 0) {
            z14 = eVar.f99387a;
        }
        boolean z15 = z14;
        boolean z16 = (i14 & 2) != 0 ? eVar.f99388b : true;
        l lVar = eVar.f99389c;
        r rVar = eVar.f99390d;
        y yVar = aVar;
        if ((i14 & 16) != 0) {
            yVar = eVar.f99391e;
        }
        y yVar2 = yVar;
        i53.d<hk1.d, Boolean> dVar = gVar;
        if ((i14 & 32) != 0) {
            dVar = eVar.f99392f;
        }
        i53.d<hk1.d, Boolean> dVar2 = dVar;
        hk1.c cVar = eVar.f99393g;
        boolean z17 = (i14 & 128) != 0 ? eVar.f99394h : true;
        if ((i14 & 256) != 0) {
            str = eVar.f99395i;
        }
        String str2 = str;
        eVar.getClass();
        dVar2.getClass();
        str2.getClass();
        return new e(z15, z16, lVar, rVar, yVar2, dVar2, cVar, z17, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f99387a == eVar.f99387a && this.f99388b == eVar.f99388b && this.f99389c == eVar.f99389c && s.g(this.f99390d, eVar.f99390d) && s.g(this.f99391e, eVar.f99391e) && s.g(this.f99392f, eVar.f99392f) && s.g(this.f99393g, eVar.f99393g) && this.f99394h == eVar.f99394h && s.g(this.f99395i, eVar.f99395i);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f99387a) * 31, 31, this.f99388b);
        l lVar = this.f99389c;
        int iHashCode = (iG + (lVar == null ? 0 : lVar.hashCode())) * 31;
        r rVar = this.f99390d;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        y yVar = this.f99391e;
        int iB = l2.b(this.f99392f, (iHashCode2 + (yVar == null ? 0 : yVar.hashCode())) * 31, 31);
        hk1.c cVar = this.f99393g;
        return this.f99395i.hashCode() + q6.f.g((iB + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f99394h);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ThirdPartyConnectUIState(isLoading=", ", error=", ", errorType=", this.f99387a, this.f99388b);
        sbM.append(this.f99389c);
        sbM.append(", thirdPartyBasicData=");
        sbM.append(this.f99390d);
        sbM.append(", thirdPartySupportState=");
        sbM.append(this.f99391e);
        sbM.append(", capabilitiesData=");
        sbM.append(this.f99392f);
        sbM.append(", consentData=");
        sbM.append(this.f99393g);
        sbM.append(", redirectToPartnerApp=");
        sbM.append(this.f99394h);
        sbM.append(", redirectUri=");
        return am.j.o(this.f99395i, ")", sbM);
    }

    public e(boolean z14, boolean z15, l lVar, r rVar, y yVar, i53.d<hk1.d, Boolean> dVar, hk1.c cVar, boolean z16, String str) {
        dVar.getClass();
        str.getClass();
        this.f99387a = z14;
        this.f99388b = z15;
        this.f99389c = lVar;
        this.f99390d = rVar;
        this.f99391e = yVar;
        this.f99392f = dVar;
        this.f99393g = cVar;
        this.f99394h = z16;
        this.f99395i = str;
    }

    public e() {
        this(false, false, null, null, null, null, null, false, null, 511, null);
    }
}
