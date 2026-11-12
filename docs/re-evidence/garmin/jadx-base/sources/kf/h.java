package kf;

import com.google.firebase.analytics.FirebaseAnalytics;
import f5.k;
import h4.r;
import h5.t;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import o4.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkf/h;", "Lh5/x0;", "Lkf/i;", "Lt4/d;", "painter", "Lh4/d;", "alignment", "Lf5/k;", "contentScale", "", "alpha", "Lo4/e0;", "colorFilter", "", "clipToBounds", "", "contentDescription", "<init>", "(Lt4/d;Lh4/d;Lf5/k;FLo4/e0;ZLjava/lang/String;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h extends x0<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4.d f104582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4.d f104583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f104584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f104585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f104586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f104587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f104588g;

    public h(t4.d dVar, h4.d dVar2, k kVar, float f14, e0 e0Var, boolean z14, String str) {
        this.f104582a = dVar;
        this.f104583b = dVar2;
        this.f104584c = kVar;
        this.f104585d = f14;
        this.f104586e = e0Var;
        this.f104587f = z14;
        this.f104588g = str;
    }

    @Override // h5.x0
    public final r.c create() {
        return new i(this.f104582a, this.f104583b, this.f104584c, this.f104585d, this.f104586e, this.f104587f, this.f104588g);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f104582a, hVar.f104582a) && s.g(this.f104583b, hVar.f104583b) && s.g(this.f104584c, hVar.f104584c) && Float.compare(this.f104585d, hVar.f104585d) == 0 && s.g(this.f104586e, hVar.f104586e) && this.f104587f == hVar.f104587f && s.g(this.f104588g, hVar.f104588g);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iD = q6.f.d(this.f104585d, (this.f104584c.hashCode() + ((this.f104583b.hashCode() + (this.f104582a.hashCode() * 31)) * 31)) * 31, 31);
        e0 e0Var = this.f104586e;
        int iG = q6.f.g((iD + (e0Var == null ? 0 : e0Var.hashCode())) * 31, 31, this.f104587f);
        String str = this.f104588g;
        return iG + (str != null ? str.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = FirebaseAnalytics.Param.CONTENT;
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f104582a, "painter");
        v3Var.c(this.f104583b, "alignment");
        v3Var.c(this.f104584c, "contentScale");
        v3Var.c(Float.valueOf(this.f104585d), "alpha");
        v3Var.c(this.f104586e, "colorFilter");
        v3Var.c(Boolean.valueOf(this.f104587f), "clipToBounds");
        v3Var.c(this.f104588g, "contentDescription");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SubcomposeContentPainterElement(painter=");
        sb3.append(this.f104582a);
        sb3.append(", alignment=");
        sb3.append(this.f104583b);
        sb3.append(", contentScale=");
        sb3.append(this.f104584c);
        sb3.append(", alpha=");
        sb3.append(this.f104585d);
        sb3.append(", colorFilter=");
        sb3.append(this.f104586e);
        sb3.append(", clipToBounds=");
        sb3.append(this.f104587f);
        sb3.append(", contentDescription=");
        return am.j.o(this.f104588g, ")", sb3);
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        i iVar = (i) cVar;
        long f162260d = iVar.f104589h.getF162260d();
        t4.d dVar = this.f104582a;
        boolean zC = n4.g.c(f162260d, dVar.getF162260d());
        iVar.f104589h = dVar;
        iVar.f104554a = this.f104583b;
        iVar.f104555b = this.f104584c;
        iVar.f104556c = this.f104585d;
        iVar.f104557d = this.f104586e;
        iVar.f104558e = this.f104587f;
        String str = iVar.f104559f;
        String str2 = this.f104588g;
        if (!s.g(str, str2)) {
            iVar.f104559f = str2;
            h5.k.g(iVar).U();
        }
        if (!zC) {
            h5.k.g(iVar).T();
        }
        t.a(iVar);
    }
}
