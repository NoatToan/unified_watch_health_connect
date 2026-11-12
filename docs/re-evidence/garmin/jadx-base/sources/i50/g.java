package i50;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Li50/g;", "", "", "isLoading", "isRefreshing", "isGenesis", "", "powerGuideHeaderMessage", "addCourseToEventLabelVisible", "sportHeaderTitle", "sportHeaderDescription", "showCreateCourseRow", "Li50/i;", "selectedTab", "Li50/j;", "createdByYou", "favorites", "Li50/e;", "genesis", "skipButtonText", "showNextButton", "<init>", "(ZZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLi50/i;Li50/j;Li50/j;Li50/e;Ljava/lang/String;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f91747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f91751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f91752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f91753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f91754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f91755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f91756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f91757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f91758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f91759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f91760n;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91761a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.CREATED_BY_YOU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91761a = iArr;
        }
    }

    public g(boolean z14, boolean z15, boolean z16, String str, boolean z17, String str2, String str3, boolean z18, i iVar, j jVar, j jVar2, e eVar, String str4, boolean z19) {
        iVar.getClass();
        jVar.getClass();
        jVar2.getClass();
        this.f91747a = z14;
        this.f91748b = z15;
        this.f91749c = z16;
        this.f91750d = str;
        this.f91751e = z17;
        this.f91752f = str2;
        this.f91753g = str3;
        this.f91754h = z18;
        this.f91755i = iVar;
        this.f91756j = jVar;
        this.f91757k = jVar2;
        this.f91758l = eVar;
        this.f91759m = str4;
        this.f91760n = z19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f91747a == gVar.f91747a && this.f91748b == gVar.f91748b && this.f91749c == gVar.f91749c && s.g(this.f91750d, gVar.f91750d) && this.f91751e == gVar.f91751e && s.g(this.f91752f, gVar.f91752f) && s.g(this.f91753g, gVar.f91753g) && this.f91754h == gVar.f91754h && this.f91755i == gVar.f91755i && this.f91756j.equals(gVar.f91756j) && this.f91757k.equals(gVar.f91757k) && s.g(this.f91758l, gVar.f91758l) && s.g(this.f91759m, gVar.f91759m) && this.f91760n == gVar.f91760n;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Boolean.hashCode(this.f91747a) * 31, 31, this.f91748b), 31, this.f91749c);
        String str = this.f91750d;
        int iG2 = q6.f.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f91751e);
        String str2 = this.f91752f;
        int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f91753g;
        int iHashCode2 = (this.f91757k.hashCode() + ((this.f91756j.hashCode() + ((this.f91755i.hashCode() + q6.f.g((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f91754h)) * 31)) * 31)) * 31;
        e eVar = this.f91758l;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str4 = this.f91759m;
        return Boolean.hashCode(this.f91760n) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("CoursesScreenUiState(isLoading=", ", isRefreshing=", ", isGenesis=", this.f91747a, this.f91748b);
        fb1.c.w(", powerGuideHeaderMessage=", this.f91750d, ", addCourseToEventLabelVisible=", sbM, this.f91749c);
        fb1.c.w(", sportHeaderTitle=", this.f91752f, ", sportHeaderDescription=", sbM, this.f91751e);
        v.h.C(this.f91753g, ", showCreateCourseRow=", ", selectedTab=", sbM, this.f91754h);
        sbM.append(this.f91755i);
        sbM.append(", createdByYou=");
        sbM.append(this.f91756j);
        sbM.append(", favorites=");
        sbM.append(this.f91757k);
        sbM.append(", genesis=");
        sbM.append(this.f91758l);
        sbM.append(", skipButtonText=");
        return am.j.n(this.f91759m, ", showNextButton=", ")", sbM, this.f91760n);
    }
}
