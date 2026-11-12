package tb0;

import android.graphics.Bitmap;
import ds.e0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ltb0/p;", "", "", "isIntroFrame", "isFirstAnimation", "isLastAnimation", "", "staticImage", "", "jsonAnimation", "Li53/d;", "Landroid/graphics/Bitmap;", "serverImages", "animationsCount", "currentGroupAnimationsIndex", "groupStartFrame", "groupEndFrame", "Lba0/a;", "Lhv/j;", "groupMarkerData", "revisitTutorialsAvailable", "<init>", "(ZZZILjava/lang/String;Li53/d;IIIILi53/d;Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f163671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f163672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.d<String, Bitmap> f163673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f163674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f163675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f163676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.d<ba0.a, hv.j> f163678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f163679l;

    public /* synthetic */ p(boolean z14, boolean z15, boolean z16, int i14, String str, i53.d dVar, int i15, int i16, int i17, int i18, i53.d dVar2, boolean z17, int i19, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, z16, i14, str, dVar, i15, i16, i17, i18, (i19 & 1024) != 0 ? null : dVar2, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f163668a == pVar.f163668a && this.f163669b == pVar.f163669b && this.f163670c == pVar.f163670c && this.f163671d == pVar.f163671d && p005kotlin.jvm.internal.s.g(this.f163672e, pVar.f163672e) && p005kotlin.jvm.internal.s.g(this.f163673f, pVar.f163673f) && this.f163674g == pVar.f163674g && this.f163675h == pVar.f163675h && this.f163676i == pVar.f163676i && this.f163677j == pVar.f163677j && p005kotlin.jvm.internal.s.g(this.f163678k, pVar.f163678k) && this.f163679l == pVar.f163679l;
    }

    public final int hashCode() {
        int iJ = wr.g.j(q2.d(this.f163671d, q6.f.g(q6.f.g(Boolean.hashCode(this.f163668a) * 31, 31, this.f163669b), 31, this.f163670c), 31), 31, this.f163672e);
        i53.d<String, Bitmap> dVar = this.f163673f;
        int iD = q2.d(this.f163677j, q2.d(this.f163676i, q2.d(this.f163675h, q2.d(this.f163674g, (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31), 31);
        i53.d<ba0.a, hv.j> dVar2 = this.f163678k;
        return Boolean.hashCode(this.f163679l) + ((iD + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("GestureAnimationState(isIntroFrame=", ", isFirstAnimation=", ", isLastAnimation=", this.f163668a, this.f163669b);
        sbM.append(this.f163670c);
        sbM.append(", staticImage=");
        sbM.append(this.f163671d);
        sbM.append(", jsonAnimation=");
        sbM.append(this.f163672e);
        sbM.append(", serverImages=");
        sbM.append(this.f163673f);
        sbM.append(", animationsCount=");
        e0.m(this.f163674g, this.f163675h, ", currentGroupAnimationsIndex=", ", groupStartFrame=", sbM);
        e0.m(this.f163676i, this.f163677j, ", groupEndFrame=", ", groupMarkerData=", sbM);
        sbM.append(this.f163678k);
        sbM.append(", revisitTutorialsAvailable=");
        sbM.append(this.f163679l);
        sbM.append(")");
        return sbM.toString();
    }

    public p(boolean z14, boolean z15, boolean z16, int i14, String str, i53.d<String, Bitmap> dVar, int i15, int i16, int i17, int i18, i53.d<ba0.a, hv.j> dVar2, boolean z17) {
        str.getClass();
        this.f163668a = z14;
        this.f163669b = z15;
        this.f163670c = z16;
        this.f163671d = i14;
        this.f163672e = str;
        this.f163673f = dVar;
        this.f163674g = i15;
        this.f163675h = i16;
        this.f163676i = i17;
        this.f163677j = i18;
        this.f163678k = dVar2;
        this.f163679l = z17;
    }
}
