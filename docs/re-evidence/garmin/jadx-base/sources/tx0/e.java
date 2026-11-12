package tx0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltx0/e;", "", "", "isLoading", "isSaving", "Lww0/b;", "log", "currentLog", "Ltx0/a;", "initialSelection", "currentSelection", "canSave", "Ltx0/d;", "sectionVisibility", "Ltx0/b;", "errorDialog", "<init>", "(ZZLww0/b;Lww0/b;Ltx0/a;Ltx0/a;ZLtx0/d;Ltx0/b;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ww0.b f166835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ww0.b f166836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f166837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f166838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f166840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f166841i;

    public /* synthetic */ e(boolean z14, boolean z15, ww0.b bVar, ww0.b bVar2, a aVar, a aVar2, boolean z16, d dVar, b bVar3, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : bVar, (i14 & 8) != 0 ? null : bVar2, (i14 & 16) != 0 ? null : aVar, (i14 & 32) != 0 ? null : aVar2, (i14 & 64) == 0 ? z16 : false, (i14 & 128) != 0 ? new d(false, false, false, false, false, false, false, 127, null) : dVar, (i14 & 256) != 0 ? null : bVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f166833a == eVar.f166833a && this.f166834b == eVar.f166834b && s.g(this.f166835c, eVar.f166835c) && s.g(this.f166836d, eVar.f166836d) && s.g(this.f166837e, eVar.f166837e) && s.g(this.f166838f, eVar.f166838f) && this.f166839g == eVar.f166839g && s.g(this.f166840h, eVar.f166840h) && s.g(this.f166841i, eVar.f166841i);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f166833a) * 31, 31, this.f166834b);
        ww0.b bVar = this.f166835c;
        int iHashCode = (iG + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ww0.b bVar2 = this.f166836d;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        a aVar = this.f166837e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f166838f;
        int iHashCode4 = (this.f166840h.hashCode() + q6.f.g((iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f166839g)) * 31;
        b bVar3 = this.f166841i;
        return iHashCode4 + (bVar3 != null ? Boolean.hashCode(bVar3.f166822a) : 0);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("MenstrualCycleSymptomsUiState(isLoading=", ", isSaving=", ", log=", this.f166833a, this.f166834b);
        sbM.append(this.f166835c);
        sbM.append(", currentLog=");
        sbM.append(this.f166836d);
        sbM.append(", initialSelection=");
        sbM.append(this.f166837e);
        sbM.append(", currentSelection=");
        sbM.append(this.f166838f);
        sbM.append(", canSave=");
        sbM.append(this.f166839g);
        sbM.append(", sectionVisibility=");
        sbM.append(this.f166840h);
        sbM.append(", errorDialog=");
        sbM.append(this.f166841i);
        sbM.append(")");
        return sbM.toString();
    }

    public e(boolean z14, boolean z15, ww0.b bVar, ww0.b bVar2, a aVar, a aVar2, boolean z16, d dVar, b bVar3) {
        dVar.getClass();
        this.f166833a = z14;
        this.f166834b = z15;
        this.f166835c = bVar;
        this.f166836d = bVar2;
        this.f166837e = aVar;
        this.f166838f = aVar2;
        this.f166839g = z16;
        this.f166840h = dVar;
        this.f166841i = bVar3;
    }

    public e() {
        this(false, false, null, null, null, null, false, null, null, 511, null);
    }
}
