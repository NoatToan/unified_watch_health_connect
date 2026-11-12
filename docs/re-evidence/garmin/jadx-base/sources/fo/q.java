package fo;

import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfo/q;", "", "Lam/g;", "mode", "", "searchQuery", "", "isRefreshing", "isLoading", "", "activitiesCount", "exactCount", "Ljo/f;", "selectedSortData", "Li53/c;", "sortDataList", "Lfo/d0;", "toastData", "Lfo/a0;", "deleteActivityData", "Ljo/c;", "selectedFilters", "wheelchairMode", "recentSearches", "<init>", "(Lam/g;Ljava/lang/String;ZZIZLjo/f;Li53/c;Lfo/d0;Lfo/a0;Li53/c;ZLi53/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.g f72402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f72405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f72406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f72407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo.f f72408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<jo.f> f72409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f72410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f72411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<jo.c> f72412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f72413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i53.c<String> f72414m;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(am.g gVar, String str, boolean z14, boolean z15, int i14, boolean z16, jo.f fVar, i53.c cVar, d0 d0Var, a0 a0Var, i53.c cVar2, boolean z17, i53.c cVar3, int i15, p005kotlin.jvm.internal.j jVar) {
        i53.c cVarE;
        gVar = (i15 & 1) != 0 ? am.g.f3942f : gVar;
        String str2 = (i15 & 2) != 0 ? "" : str;
        boolean z18 = (i15 & 4) != 0 ? false : z14;
        boolean z19 = (i15 & 8) != 0 ? false : z15;
        int i16 = (i15 & 16) != 0 ? 0 : i14;
        boolean z24 = (i15 & 32) != 0 ? false : z16;
        jo.f fVar2 = (i15 & 64) != 0 ? new jo.f(null, null, 3, null) : fVar;
        if ((i15 & 128) != 0) {
            jo.f.f99756c.getClass();
            cVarE = i53.a.e(jo.f.a.a());
        } else {
            cVarE = cVar;
        }
        this(gVar, str2, z18, z19, i16, z24, fVar2, cVarE, (i15 & 256) != 0 ? null : d0Var, (i15 & 512) != 0 ? null : a0Var, (i15 & 1024) == 0 ? cVar2 : null, (i15 & 2048) == 0 ? z17 : false, (i15 & 4096) != 0 ? j53.l.b() : cVar3);
    }

    public static q a(q qVar, String str, boolean z14, boolean z15, int i14, boolean z16, jo.f fVar, i53.c cVar, d0 d0Var, a0 a0Var, i53.c cVar2, i53.f fVar2, int i15) {
        am.g gVar = qVar.f72402a;
        String str2 = (i15 & 2) != 0 ? qVar.f72403b : str;
        boolean z17 = (i15 & 4) != 0 ? qVar.f72404c : z14;
        boolean z18 = (i15 & 8) != 0 ? qVar.f72405d : z15;
        int i16 = (i15 & 16) != 0 ? qVar.f72406e : i14;
        boolean z19 = (i15 & 32) != 0 ? qVar.f72407f : z16;
        jo.f fVar3 = (i15 & 64) != 0 ? qVar.f72408g : fVar;
        i53.c cVar3 = (i15 & 128) != 0 ? qVar.f72409h : cVar;
        d0 d0Var2 = (i15 & 256) != 0 ? qVar.f72410i : d0Var;
        a0 a0Var2 = (i15 & 512) != 0 ? qVar.f72411j : a0Var;
        i53.c cVar4 = (i15 & 1024) != 0 ? qVar.f72412k : cVar2;
        boolean z24 = qVar.f72413l;
        i53.c<String> cVar5 = (i15 & 4096) != 0 ? qVar.f72414m : fVar2;
        qVar.getClass();
        gVar.getClass();
        str2.getClass();
        fVar3.getClass();
        cVar3.getClass();
        cVar5.getClass();
        return new q(gVar, str2, z17, z18, i16, z19, fVar3, cVar3, d0Var2, a0Var2, cVar4, z24, cVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f72402a == qVar.f72402a && p005kotlin.jvm.internal.s.g(this.f72403b, qVar.f72403b) && this.f72404c == qVar.f72404c && this.f72405d == qVar.f72405d && this.f72406e == qVar.f72406e && this.f72407f == qVar.f72407f && p005kotlin.jvm.internal.s.g(this.f72408g, qVar.f72408g) && p005kotlin.jvm.internal.s.g(this.f72409h, qVar.f72409h) && p005kotlin.jvm.internal.s.g(this.f72410i, qVar.f72410i) && p005kotlin.jvm.internal.s.g(this.f72411j, qVar.f72411j) && p005kotlin.jvm.internal.s.g(this.f72412k, qVar.f72412k) && this.f72413l == qVar.f72413l && p005kotlin.jvm.internal.s.g(this.f72414m, qVar.f72414m);
    }

    public final int hashCode() {
        int iA = l2.a(this.f72409h, (this.f72408g.hashCode() + q6.f.g(q2.d(this.f72406e, q6.f.g(q6.f.g(wr.g.j(this.f72402a.hashCode() * 31, 31, this.f72403b), 31, this.f72404c), 31, this.f72405d), 31), 31, this.f72407f)) * 31, 31);
        d0 d0Var = this.f72410i;
        int iHashCode = (iA + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        a0 a0Var = this.f72411j;
        int iHashCode2 = (iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        i53.c<jo.c> cVar = this.f72412k;
        return this.f72414m.hashCode() + q6.f.g((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f72413l);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivitiesListUiState(mode=");
        sb3.append(this.f72402a);
        sb3.append(", searchQuery=");
        sb3.append(this.f72403b);
        sb3.append(", isRefreshing=");
        kg.f.q(", isLoading=", ", activitiesCount=", sb3, this.f72404c, this.f72405d);
        fb1.c.x(sb3, this.f72406e, ", exactCount=", this.f72407f, ", selectedSortData=");
        sb3.append(this.f72408g);
        sb3.append(", sortDataList=");
        sb3.append(this.f72409h);
        sb3.append(", toastData=");
        sb3.append(this.f72410i);
        sb3.append(", deleteActivityData=");
        sb3.append(this.f72411j);
        sb3.append(", selectedFilters=");
        sb3.append(this.f72412k);
        sb3.append(", wheelchairMode=");
        sb3.append(this.f72413l);
        sb3.append(", recentSearches=");
        return l2.e(sb3, this.f72414m, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(am.g gVar, String str, boolean z14, boolean z15, int i14, boolean z16, jo.f fVar, i53.c<jo.f> cVar, d0 d0Var, a0 a0Var, i53.c<? extends jo.c> cVar2, boolean z17, i53.c<String> cVar3) {
        gVar.getClass();
        str.getClass();
        fVar.getClass();
        cVar.getClass();
        cVar3.getClass();
        this.f72402a = gVar;
        this.f72403b = str;
        this.f72404c = z14;
        this.f72405d = z15;
        this.f72406e = i14;
        this.f72407f = z16;
        this.f72408g = fVar;
        this.f72409h = cVar;
        this.f72410i = d0Var;
        this.f72411j = a0Var;
        this.f72412k = cVar2;
        this.f72413l = z17;
        this.f72414m = cVar3;
    }

    public q() {
        this(null, null, false, false, 0, false, null, null, null, null, null, false, null, 8191, null);
    }
}
