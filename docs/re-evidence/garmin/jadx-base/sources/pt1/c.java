package pt1;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpt1/c;", "", "", "isLoading", "showWelcomeTips", "areFiltersApplied", "Lpt1/d;", "mapAreaUiState", "Lpt1/a;", "bottomSheetState", "Lpt1/j;", "searchState", "isChildAccount", "canSeeReviews", "wasReviewsCountFetched", "<init>", "(ZZZLpt1/d;Lpt1/a;Lpt1/j;ZZZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f140819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f140820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f140821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f140822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f140823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f140824i;

    static {
        Parcelable.Creator<le2.a> creator = le2.a.CREATOR;
    }

    public /* synthetic */ c(boolean z14, boolean z15, boolean z16, d dVar, a aVar, j jVar, boolean z17, boolean z18, boolean z19, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? new d(null, null, null, 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 0.0f, 16383, null) : dVar, (i14 & 16) != 0 ? new a(null, 0, null, null, null, 31, null) : aVar, (i14 & 32) != 0 ? new j(null, null, null, null, 15, null) : jVar, (i14 & 64) != 0 ? false : z17, (i14 & 128) != 0 ? true : z18, (i14 & 256) != 0 ? false : z19);
    }

    public static c a(c cVar, boolean z14, boolean z15, boolean z16, d dVar, a aVar, j jVar, boolean z17, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            z14 = cVar.f140816a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            z15 = cVar.f140817b;
        }
        boolean z24 = z15;
        if ((i14 & 4) != 0) {
            z16 = cVar.f140818c;
        }
        boolean z25 = z16;
        if ((i14 & 8) != 0) {
            dVar = cVar.f140819d;
        }
        d dVar2 = dVar;
        if ((i14 & 16) != 0) {
            aVar = cVar.f140820e;
        }
        a aVar2 = aVar;
        j jVar2 = (i14 & 32) != 0 ? cVar.f140821f : jVar;
        boolean z26 = (i14 & 64) != 0 ? cVar.f140822g : z17;
        boolean z27 = (i14 & 128) != 0 ? cVar.f140823h : z18;
        boolean z28 = (i14 & 256) != 0 ? cVar.f140824i : true;
        cVar.getClass();
        dVar2.getClass();
        aVar2.getClass();
        jVar2.getClass();
        return new c(z19, z24, z25, dVar2, aVar2, jVar2, z26, z27, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f140816a == cVar.f140816a && this.f140817b == cVar.f140817b && this.f140818c == cVar.f140818c && p005kotlin.jvm.internal.s.g(this.f140819d, cVar.f140819d) && p005kotlin.jvm.internal.s.g(this.f140820e, cVar.f140820e) && p005kotlin.jvm.internal.s.g(this.f140821f, cVar.f140821f) && this.f140822g == cVar.f140822g && this.f140823h == cVar.f140823h && this.f140824i == cVar.f140824i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140824i) + q6.f.g(q6.f.g((this.f140821f.hashCode() + ((this.f140820e.hashCode() + ((this.f140819d.hashCode() + q6.f.g(q6.f.g(Boolean.hashCode(this.f140816a) * 31, 31, this.f140817b), 31, this.f140818c)) * 31)) * 31)) * 31, 31, this.f140822g), 31, this.f140823h);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("MainScreenState(isLoading=", ", showWelcomeTips=", ", areFiltersApplied=", this.f140816a, this.f140817b);
        sbM.append(this.f140818c);
        sbM.append(", mapAreaUiState=");
        sbM.append(this.f140819d);
        sbM.append(", bottomSheetState=");
        sbM.append(this.f140820e);
        sbM.append(", searchState=");
        sbM.append(this.f140821f);
        sbM.append(", isChildAccount=");
        kg.f.q(", canSeeReviews=", ", wasReviewsCountFetched=", sbM, this.f140822g, this.f140823h);
        return hb.a.k(sbM, this.f140824i, ")");
    }

    public c(boolean z14, boolean z15, boolean z16, d dVar, a aVar, j jVar, boolean z17, boolean z18, boolean z19) {
        dVar.getClass();
        aVar.getClass();
        jVar.getClass();
        this.f140816a = z14;
        this.f140817b = z15;
        this.f140818c = z16;
        this.f140819d = dVar;
        this.f140820e = aVar;
        this.f140821f = jVar;
        this.f140822g = z17;
        this.f140823h = z18;
        this.f140824i = z19;
    }

    public c() {
        this(false, false, false, null, null, null, false, false, false, 511, null);
    }
}
