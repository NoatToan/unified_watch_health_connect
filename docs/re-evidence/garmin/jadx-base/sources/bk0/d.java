package bk0;

import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbk0/d;", "", "Lo4/v0;", "image", "", "title", "subtitle", "Li53/c;", "Lbk0/f;", "features", "Ldk0/f;", "disclaimer", "<init>", "(Lo4/v0;Ljava/lang/String;Ljava/lang/String;Li53/c;Ldk0/f;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f18473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<f> f18476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dk0.f f18477e;

    public d(v0 v0Var, String str, String str2, i53.c<f> cVar, dk0.f fVar) {
        str.getClass();
        str2.getClass();
        cVar.getClass();
        fVar.getClass();
        this.f18473a = v0Var;
        this.f18474b = str;
        this.f18475c = str2;
        this.f18476d = cVar;
        this.f18477e = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f18473a, dVar.f18473a) && this.f18474b.equals(dVar.f18474b) && this.f18475c.equals(dVar.f18475c) && this.f18476d.equals(dVar.f18476d) && this.f18477e.equals(dVar.f18477e);
    }

    public final int hashCode() {
        v0 v0Var = this.f18473a;
        return this.f18477e.hashCode() + l2.a(this.f18476d, wr.g.j(wr.g.j((v0Var == null ? 0 : v0Var.hashCode()) * 31, 31, this.f18474b), 31, this.f18475c), 31);
    }

    public final String toString() {
        return "GCPlusEducationData(image=" + this.f18473a + ", title=" + this.f18474b + ", subtitle=" + this.f18475c + ", features=" + this.f18476d + ", disclaimer=" + this.f18477e + ")";
    }
}
