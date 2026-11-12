package ne1;

import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import j92.e;
import j92.f;
import l72.n2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f125553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f125554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f125555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f125556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f125557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f125558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f125559h;

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i14) {
        this.f125552a = 1;
        this.f125553b = str;
        this.f125554c = str2;
        this.f125555d = str3;
        this.f125556e = str4;
        this.f125557f = str5;
        this.f125558g = str6;
        this.f125559h = str7;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0158  */
    /* JADX WARN: Code duplicated, block: B:42:0x01af  */
    /* JADX WARN: Code duplicated, block: B:44:0x0218  */
    /* JADX WARN: Code duplicated, block: B:63:0x0282  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Throwable th3;
        g.a.f fVar;
        b0 b0Var;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        x0 x0Var;
        x0 x0Var2;
        String str;
        int i14 = this.f125552a;
        m.a aVar = m.f135153a;
        String str2 = this.f125553b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarD = x2.d(aVar2, 1.0f);
                    boolean zB = mVar.B(str2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new n2(str2, 26);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new n2(str2, 26);
                            mVar.K(objQ);
                        }
                    }
                    r rVarC2 = v.c((l) objQ, rVarD, false);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    d.f81522a.getClass();
                    h4.g.a aVar3 = d.a.f81536n;
                    z zVarA2 = y.a(kVar, aVar3, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC3 = k.c(rVarC2, mVar);
                    g.V.getClass();
                    e0.a aVar4 = g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    g.a.e eVar = g.a.f81810g;
                    b4.c(eVar, zVarA2, mVar);
                    g.a.C1623g c1623g = g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    g.a.f fVar2 = g.a.f81807d;
                    b4.c(fVar2, rVarC3, mVar);
                    r rVarA = b0.f22601a.a(x2.f(aVar2, 1.0f), 1.0f, true);
                    z zVarA3 = y.a(kVar, aVar3, mVar, 0);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    r rVarC4 = k.c(rVarA, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA3, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        h.z(iHashCode3, mVar, iHashCode3, bVar);
                    }
                    b4.c(fVar2, rVarC4, mVar);
                    String str3 = this.f125554c;
                    String str4 = this.f125555d;
                    if (str3 == null) {
                        str3 = str4;
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97929f, mVar), mVar, 0, 0, 131070);
                    String str5 = this.f125556e;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    d92.b.f58625c.getClass();
                    e eVar2 = j92.b.f97899b;
                    r rVarC5 = c2.l.C(aVar2, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    x0 x0Var3 = f.f97930g;
                    mh.c(str5, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var3, mVar), mVar, 0, 0, 131068);
                    x0 x0Var4 = f.f97933j;
                    mh.c(this.f125557f, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var4, mVar), mVar, 0, 0, 131070);
                    String str6 = this.f125558g;
                    if (str6 == null) {
                        str6 = str4;
                    }
                    mh.c(str6, c2.l.C(aVar2, 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var3, mVar), mVar, 0, 0, 131068);
                    mh.c(this.f125559h, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var4, mVar), mVar, 0, 0, 131070);
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                t42.s.b(this.f125553b, this.f125554c, this.f125555d, this.f125556e, this.f125557f, this.f125558g, this.f125559h, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar5 = r.S;
                    r rVarD2 = x2.d(aVar5, 1.0f);
                    boolean zB2 = mVar2.B(str2);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new u91.c(str2, 10);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new u91.c(str2, 10);
                            mVar2.K(objQ2);
                        }
                    }
                    r rVarC6 = v.c((l) objQ2, rVarD2, false);
                    j.f22691a.getClass();
                    j.k kVar2 = j.f22694d;
                    d.f81522a.getClass();
                    h4.g.a aVar6 = d.a.f81536n;
                    z zVarA4 = y.a(kVar2, aVar6, mVar2, 0);
                    int iHashCode4 = Long.hashCode(mVar2.getU());
                    i2 i2VarX4 = mVar2.x();
                    r rVarC7 = k.c(rVarC6, mVar2);
                    g.V.getClass();
                    e0.a aVar7 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    g.a.e eVar3 = g.a.f81810g;
                    b4.c(eVar3, zVarA4, mVar2);
                    g.a.C1623g c1623g2 = g.a.f81809f;
                    b4.c(c1623g2, i2VarX4, mVar2);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar2.getT()) {
                        th3 = null;
                    } else {
                        th3 = null;
                        if (!s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                        }
                        fVar = g.a.f81807d;
                        b4.c(fVar, rVarC7, mVar2);
                        b0Var = b0.f22601a;
                        r rVarD3 = x2.d(x2.f(aVar5, 1.0f), 1.0f);
                        zVarA = y.a(kVar2, aVar6, mVar2, 0);
                        iHashCode = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC = k.c(rVarD3, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw th3;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar7);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar3, zVarA, mVar2);
                        b4.c(c1623g2, i2VarX, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar2);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var = f.f97930g;
                        mh.c(this.f125554c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131070);
                        x0Var2 = f.f97933j;
                        mh.c(this.f125555d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131070);
                        str = this.f125556e;
                        if (str != null) {
                            mVar2.C(-2049306240);
                            d92.b.f58625c.getClass();
                            mh.c(str, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131068);
                            mh.c(gl1.y.Q(mVar2, R.string.lbl_delta_elevation), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131070);
                            mVar2.f();
                        } else {
                            mVar2.C(-2048824779);
                            mVar2.f();
                        }
                        d92.b.f58625c.getClass();
                        mh.c(this.f125557f, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131068);
                        mh.c(this.f125558g, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131070);
                        c2.l.f(b0Var.a(aVar5, 1.0f, true), mVar2);
                        mh.c(this.f125559h, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131070);
                        mVar2.y();
                        mVar2.y();
                    }
                    h.z(iHashCode4, mVar2, iHashCode4, bVar2);
                    fVar = g.a.f81807d;
                    b4.c(fVar, rVarC7, mVar2);
                    b0Var = b0.f22601a;
                    r rVarD4 = x2.d(x2.f(aVar5, 1.0f), 1.0f);
                    zVarA = y.a(kVar2, aVar6, mVar2, 0);
                    iHashCode = Long.hashCode(mVar2.getU());
                    i2VarX = mVar2.x();
                    rVarC = k.c(rVarD4, mVar2);
                    if (mVar2.F() != null) {
                        p0.l();
                        throw th3;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar3, zVarA, mVar2);
                    b4.c(c1623g2, i2VarX, mVar2);
                    if (mVar2.getT()) {
                        h.z(iHashCode, mVar2, iHashCode, bVar2);
                    } else {
                        h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, mVar2);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0Var = f.f97930g;
                    mh.c(this.f125554c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131070);
                    x0Var2 = f.f97933j;
                    mh.c(this.f125555d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131070);
                    str = this.f125556e;
                    if (str != null) {
                        mVar2.C(-2049306240);
                        d92.b.f58625c.getClass();
                        mh.c(str, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131068);
                        mh.c(gl1.y.Q(mVar2, R.string.lbl_delta_elevation), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131070);
                        mVar2.f();
                    } else {
                        mVar2.C(-2048824779);
                        mVar2.f();
                    }
                    d92.b.f58625c.getClass();
                    mh.c(this.f125557f, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131068);
                    mh.c(this.f125558g, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131070);
                    c2.l.f(b0Var.a(aVar5, 1.0f, true), mVar2);
                    mh.c(this.f125559h, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131070);
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i14, byte b14) {
        this.f125552a = i14;
        this.f125553b = str;
        this.f125554c = str2;
        this.f125555d = str3;
        this.f125556e = str4;
        this.f125557f = str5;
        this.f125558g = str6;
        this.f125559h = str7;
    }
}
