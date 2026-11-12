package uk0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import gg1.o0;
import p005kotlin.Metadata;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luk0/d;", "Luk0/e;", "", TtmlNode.ATTR_ID, "Lc80/u;", "gearType", "nickname", "brand", ModelSourceWrapper.TYPE, "<init>", "(Ljava/lang/String;Lc80/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c80.u f171808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f171810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f171811e;

    public d(String str, c80.u uVar, String str2, String str3, String str4) {
        str.getClass();
        uVar.getClass();
        str3.getClass();
        this.f171807a = str;
        this.f171808b = uVar;
        this.f171809c = str2;
        this.f171810d = str3;
        this.f171811e = str4;
    }

    @Override // uk0.e
    public final String a(p3.m mVar) {
        mVar.C(-1172173171);
        x1 x1Var = p3.n.f135158a;
        r.f171870a.getClass();
        String strB = r.b(this.f171809c, this.f171810d, this.f171811e, mVar);
        mVar.f();
        return strB;
    }

    @Override // uk0.e
    public final String b(p3.m mVar) {
        mVar.C(-26528899);
        x1 x1Var = p3.n.f135158a;
        r.f171870a.getClass();
        String strC = r.c(this.f171809c, this.f171810d, this.f171811e, mVar);
        mVar.f();
        return strC;
    }

    @Override // uk0.e
    public final Double c(b63.o oVar) {
        oVar.getClass();
        return null;
    }

    @Override // uk0.e
    public final String d(p3.m mVar) {
        mVar.C(-1810650622);
        x1 x1Var = p3.n.f135158a;
        String strL = xy2.b.l(this.f171808b, mVar);
        mVar.f();
        return strL;
    }

    @Override // uk0.e
    /* JADX INFO: renamed from: e */
    public final boolean getF171825n() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f171807a.equals(dVar.f171807a) && this.f171808b == dVar.f171808b && p005kotlin.jvm.internal.s.g(this.f171809c, dVar.f171809c) && this.f171810d.equals(dVar.f171810d) && p005kotlin.jvm.internal.s.g(this.f171811e, dVar.f171811e);
    }

    @Override // uk0.e
    public final String f(o0 o0Var, p3.m mVar, int i14) {
        o0Var.getClass();
        mVar.C(1579753212);
        x1 x1Var = p3.n.f135158a;
        mVar.f();
        return null;
    }

    @Override // uk0.e
    public final i53.c g(p3.m mVar) {
        mVar.C(-991017733);
        x1 x1Var = p3.n.f135158a;
        j53.j jVarB = j53.l.b();
        mVar.f();
        return jVarB;
    }

    @Override // uk0.e
    public final u4.d getIcon() {
        return this.f171808b.f25613a;
    }

    @Override // uk0.e
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF171807a() {
        return this.f171807a;
    }

    public final int hashCode() {
        int iHashCode = (this.f171808b.hashCode() + (this.f171807a.hashCode() * 31)) * 31;
        String str = this.f171809c;
        int iJ = wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f171810d);
        String str2 = this.f171811e;
        return iJ + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConnectionGearData(id=");
        sb3.append(this.f171807a);
        sb3.append(", gearType=");
        sb3.append(this.f171808b);
        sb3.append(", nickname=");
        sn.a.t(sb3, this.f171809c, ", brand=", this.f171810d, ", model=");
        return am.j.o(this.f171811e, ")", sb3);
    }
}
