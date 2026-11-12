package pt1;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpt1/a0;", "", "", "isRefreshing", "operationInProgress", "isError", "Li53/c;", "Lpt1/x;", "reviewList", "Lus1/o;", "sortOrder", "", "shareLink", "Lpt1/n;", "bottomSheetContentType", "", "highlightedId", "Lpt1/e;", "photoUploadProgress", "showPhotoUploadCanceledDialog", "showPhotoUploadFailedDialog", "<init>", "(ZZZLi53/c;Lus1/o;Ljava/lang/String;Lpt1/n;Ljava/lang/Long;Lpt1/e;ZZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<x> f140806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final us1.o f140807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f140808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f140809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f140810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f140811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f140812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f140813k;

    public /* synthetic */ a0(boolean z14, boolean z15, boolean z16, i53.c cVar, us1.o oVar, String str, n nVar, Long l14, e eVar, boolean z17, boolean z18, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, z16, cVar, oVar, (i14 & 32) != 0 ? null : str, nVar, (i14 & 128) != 0 ? null : l14, (i14 & 256) != 0 ? null : eVar, (i14 & 512) != 0 ? false : z17, (i14 & 1024) != 0 ? false : z18);
    }

    public static a0 a(a0 a0Var, boolean z14, boolean z15, boolean z16, i53.c cVar, us1.o oVar, String str, n nVar, Long l14, e eVar, boolean z17, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            z14 = a0Var.f140803a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            z15 = a0Var.f140804b;
        }
        boolean z24 = z15;
        if ((i14 & 4) != 0) {
            z16 = a0Var.f140805c;
        }
        boolean z25 = z16;
        i53.c cVar2 = (i14 & 8) != 0 ? a0Var.f140806d : cVar;
        us1.o oVar2 = (i14 & 16) != 0 ? a0Var.f140807e : oVar;
        String str2 = (i14 & 32) != 0 ? a0Var.f140808f : str;
        n nVar2 = (i14 & 64) != 0 ? a0Var.f140809g : nVar;
        Long l15 = (i14 & 128) != 0 ? a0Var.f140810h : l14;
        e eVar2 = (i14 & 256) != 0 ? a0Var.f140811i : eVar;
        boolean z26 = (i14 & 512) != 0 ? a0Var.f140812j : z17;
        boolean z27 = (i14 & 1024) != 0 ? a0Var.f140813k : z18;
        a0Var.getClass();
        cVar2.getClass();
        oVar2.getClass();
        nVar2.getClass();
        return new a0(z19, z24, z25, cVar2, oVar2, str2, nVar2, l15, eVar2, z26, z27);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f140803a == a0Var.f140803a && this.f140804b == a0Var.f140804b && this.f140805c == a0Var.f140805c && p005kotlin.jvm.internal.s.g(this.f140806d, a0Var.f140806d) && this.f140807e == a0Var.f140807e && p005kotlin.jvm.internal.s.g(this.f140808f, a0Var.f140808f) && p005kotlin.jvm.internal.s.g(this.f140809g, a0Var.f140809g) && p005kotlin.jvm.internal.s.g(this.f140810h, a0Var.f140810h) && p005kotlin.jvm.internal.s.g(this.f140811i, a0Var.f140811i) && this.f140812j == a0Var.f140812j && this.f140813k == a0Var.f140813k;
    }

    public final int hashCode() {
        int iHashCode = (this.f140807e.hashCode() + l2.a(this.f140806d, q6.f.g(q6.f.g(Boolean.hashCode(this.f140803a) * 31, 31, this.f140804b), 31, this.f140805c), 31)) * 31;
        String str = this.f140808f;
        int iHashCode2 = (this.f140809g.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Long l14 = this.f140810h;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        e eVar = this.f140811i;
        return Boolean.hashCode(this.f140813k) + q6.f.g((iHashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.f140812j);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("UserReviewsScreenState(isRefreshing=", ", operationInProgress=", ", isError=", this.f140803a, this.f140804b);
        sbM.append(this.f140805c);
        sbM.append(", reviewList=");
        sbM.append(this.f140806d);
        sbM.append(", sortOrder=");
        sbM.append(this.f140807e);
        sbM.append(", shareLink=");
        sbM.append(this.f140808f);
        sbM.append(", bottomSheetContentType=");
        sbM.append(this.f140809g);
        sbM.append(", highlightedId=");
        sbM.append(this.f140810h);
        sbM.append(", photoUploadProgress=");
        sbM.append(this.f140811i);
        sbM.append(", showPhotoUploadCanceledDialog=");
        sbM.append(this.f140812j);
        sbM.append(", showPhotoUploadFailedDialog=");
        return hb.a.k(sbM, this.f140813k, ")");
    }

    public a0(boolean z14, boolean z15, boolean z16, i53.c<x> cVar, us1.o oVar, String str, n nVar, Long l14, e eVar, boolean z17, boolean z18) {
        cVar.getClass();
        oVar.getClass();
        nVar.getClass();
        this.f140803a = z14;
        this.f140804b = z15;
        this.f140805c = z16;
        this.f140806d = cVar;
        this.f140807e = oVar;
        this.f140808f = str;
        this.f140809g = nVar;
        this.f140810h = l14;
        this.f140811i = eVar;
        this.f140812j = z17;
        this.f140813k = z18;
    }
}
