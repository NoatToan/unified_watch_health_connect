package mo;

import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmo/i;", "", "", "isVisible", "includeDog", "Li53/c;", "Lpe0/b;", "dogs", "Li53/e;", "", "selectedDogIds", "isChildAccount", "isLoading", "<init>", "(ZZLi53/c;Li53/e;ZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f119862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f119863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<pe0.b> f119864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.e<Long> f119865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f119866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f119867f;

    public i(boolean z14, boolean z15, i53.c cVar, i53.e eVar, boolean z16, boolean z17, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? l.b() : cVar, (i14 & 8) != 0 ? i53.a.d() : eVar, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f119862a == iVar.f119862a && this.f119863b == iVar.f119863b && s.g(this.f119864c, iVar.f119864c) && s.g(this.f119865d, iVar.f119865d) && this.f119866e == iVar.f119866e && this.f119867f == iVar.f119867f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119867f) + q6.f.g((this.f119865d.hashCode() + l2.a(this.f119864c, q6.f.g(Boolean.hashCode(this.f119862a) * 31, 31, this.f119863b), 31)) * 31, 31, this.f119866e);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ActivityEditDogsUiState(isVisible=", ", includeDog=", ", dogs=", this.f119862a, this.f119863b);
        sbM.append(this.f119864c);
        sbM.append(", selectedDogIds=");
        sbM.append(this.f119865d);
        sbM.append(", isChildAccount=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isLoading=", ")", sbM, this.f119866e, this.f119867f);
    }

    public i(boolean z14, boolean z15, i53.c<pe0.b> cVar, i53.e<Long> eVar, boolean z16, boolean z17) {
        cVar.getClass();
        eVar.getClass();
        this.f119862a = z14;
        this.f119863b = z15;
        this.f119864c = cVar;
        this.f119865d = eVar;
        this.f119866e = z16;
        this.f119867f = z17;
    }

    public i() {
        this(false, false, null, null, false, false, 63, null);
    }
}
