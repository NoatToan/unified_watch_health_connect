package bk0;

import c80.q;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbk0/f;", "", "Lc80/q;", "feature", "", "title", "version", "subtitle", "Lo4/v0;", "listRowImage", "Li53/c;", "Lbk0/g;", "pages", "<init>", "(Lc80/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo4/v0;Li53/c;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f18478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f18482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<g> f18483f;

    public f(q qVar, String str, String str2, String str3, v0 v0Var, i53.c<g> cVar) {
        qVar.getClass();
        str.getClass();
        str3.getClass();
        cVar.getClass();
        this.f18478a = qVar;
        this.f18479b = str;
        this.f18480c = str2;
        this.f18481d = str3;
        this.f18482e = v0Var;
        this.f18483f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f18478a == fVar.f18478a && this.f18479b.equals(fVar.f18479b) && s.g(this.f18480c, fVar.f18480c) && this.f18481d.equals(fVar.f18481d) && s.g(this.f18482e, fVar.f18482e) && this.f18483f.equals(fVar.f18483f);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f18478a.hashCode() * 31, 31, this.f18479b);
        String str = this.f18480c;
        int iJ2 = wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f18481d);
        v0 v0Var = this.f18482e;
        return this.f18483f.hashCode() + ((iJ2 + (v0Var != null ? v0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GCPlusFeatureEducationData(feature=");
        sb3.append(this.f18478a);
        sb3.append(", title=");
        sb3.append(this.f18479b);
        sb3.append(", version=");
        sn.a.t(sb3, this.f18480c, ", subtitle=", this.f18481d, ", listRowImage=");
        sb3.append(this.f18482e);
        sb3.append(", pages=");
        sb3.append(this.f18483f);
        sb3.append(")");
        return sb3.toString();
    }
}
