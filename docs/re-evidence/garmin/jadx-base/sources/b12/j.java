package b12;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q;
import c2.x2;
import c22.o1;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import f12.u;
import f5.z0;
import h4.r;
import h5.e0;
import jf.t;
import l6.m.b;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class j extends w implements p<m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f14414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p007l6.m f14415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f14416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f14417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f14418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f14419f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p1 p1Var, p007l6.m mVar, e23.a aVar, b bVar, float f14, Long l14) {
        super(2);
        this.f14414a = p1Var;
        this.f14415b = mVar;
        this.f14416c = aVar;
        this.f14417d = bVar;
        this.f14418e = f14;
        this.f14419f = l14;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0200  */
    /* JADX WARN: Code duplicated, block: B:76:0x0204  */
    @Override // e23.p
    public final Unit invoke(m mVar, Integer num) {
        h5.g.a.f fVar;
        Object obj;
        int color;
        wf.f.a aVar;
        Long l14;
        k2.h hVar;
        m mVar2;
        u uVar;
        int i14;
        float f14;
        String str;
        String strValueOf;
        m mVar3 = mVar;
        if ((num.intValue() & 3) == 2 && mVar3.b()) {
            mVar3.e();
        } else {
            x1 x1Var = n.f135158a;
            this.f14414a.setValue(Unit.INSTANCE);
            p007l6.m mVar4 = this.f14415b;
            mVar4.getClass();
            mVar4.c();
            mVar3.C(-540104541);
            l6.m.b bVar = mVar4.f110483b;
            if (bVar == null) {
                bVar = mVar4.new b();
                mVar4.f110483b = bVar;
            }
            p007l6.m mVar5 = p007l6.m.this;
            p007l6.e eVarB = mVar5.b();
            p007l6.e eVarB2 = mVar5.b();
            r.a aVar2 = r.S;
            Object objQ = mVar3.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = d.f14399a;
                mVar3.K(objQ);
            }
            r rVarA = p007l6.m.a(aVar2, eVarB, (l) objQ);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD = q.d(gVar, false);
            int iHashCode = Long.hashCode(mVar3.getU());
            i2 i2VarX = mVar3.x();
            r rVarC = h4.k.c(rVarA, mVar3);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar3);
            } else {
                mVar3.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, mVar3);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar3);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar3, iHashCode, bVar2);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, mVar3);
            c2.u uVar2 = c2.u.f22885a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) mVar3.A(y3Var);
            b bVar3 = this.f14417d;
            if ((bVar3 != null ? bVar3.f14387a : null) != null) {
                mVar3.C(1575679719);
                mVar3.f();
                obj = bVar3.f14387a;
            } else {
                if ((bVar3 != null ? bVar3.f14388b : null) != null) {
                    mVar3.C(1575683057);
                    mVar3.f();
                    obj = bVar3.f14388b;
                } else {
                    if ((bVar3 != null ? bVar3.f14390d : null) != null) {
                        mVar3.C(1575686668);
                        o1.a aVar4 = o1.f23177a;
                        Context context2 = (Context) mVar3.A(y3Var);
                        Character ch3 = bVar3.f14390d;
                        aVar4.getClass();
                        context2.getClass();
                        String strA = o1.a.a(context2, ch3);
                        if (ch3 != null) {
                            fVar = fVar2;
                            if (Character.isLetter(ch3.charValue())) {
                                int[] iArr = o1.f23178b;
                                color = a7.b.getColor(context2, iArr[Character.toUpperCase(ch3.charValue()) % iArr.length]);
                            }
                            c22.p1 p1Var = new c22.p1(context2, strA, color);
                            mVar3.f();
                            obj = p1Var;
                        } else {
                            fVar = fVar2;
                        }
                        color = a7.b.getColor(context2, R.color.gcm_text_secondary);
                        c22.p1 p1Var2 = new c22.p1(context2, strA, color);
                        mVar3.f();
                        obj = p1Var2;
                    } else {
                        fVar = fVar2;
                        if ((bVar3 != null ? bVar3.f14391e : null) != null) {
                            mVar3.C(1575691683);
                            mVar3.f();
                            obj = bVar3.f14391e;
                        } else {
                            mVar3.C(1601837413);
                            mVar3.f();
                            obj = null;
                        }
                    }
                }
                aVar = new wf.f.a(context);
                aVar.f184930c = obj;
                l14 = this.f14419f;
                if (l14 != null && (strValueOf = String.valueOf(l14.longValue())) != null) {
                    aVar.f184933f = strValueOf;
                    aVar.f184935h = strValueOf;
                }
                wf.f fVarA = aVar.a();
                if (bVar3 == null && (str = bVar3.f14387a) != null) {
                    if (d53.w.z(str, "/composed/", false)) {
                        k2.h hVar2 = k2.i.f102406a;
                        int i15 = k2.c.f102402a;
                        k2.f fVar3 = new k2.f(0);
                        hVar = new k2.h(fVar3, fVar3, fVar3, fVar3);
                    }
                    float f15 = this.f14418e;
                    mVar2 = mVar3;
                    h5.g.a.f fVar4 = fVar;
                    t.a(fVarA, null, l4.k.b(x2.q(aVar2, f15), hVar), null, null, z3.f.c(-1898937161, new e(f15), mVar3), mVar2, 48, 2040);
                    mVar2.y();
                    if (bVar3 != null) {
                        uVar = bVar3.f14389c;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null || (i14 = uVar.f68114a) <= 0) {
                        mVar2.C(-537365692);
                        mVar2.f();
                    } else {
                        mVar2.C(-538072027);
                        j23.i iVar = k.f14420a;
                        g6.f fVarA2 = g6.f.a(f15);
                        iVar.getClass();
                        if (j23.g.a.a(iVar, fVarA2)) {
                            f14 = 0.22818792f;
                        } else {
                            j23.i iVar2 = k.f14421b;
                            g6.f fVarA3 = g6.f.a(f15);
                            iVar2.getClass();
                            f14 = j23.g.a.a(iVar2, fVarA3) ? 0.25f : 0.31666666f;
                        }
                        float f16 = f14 * f15;
                        float f17 = 1;
                        if (f16 < f17) {
                            f16 = f17;
                        }
                        long jA = n5.a.a(mVar2, f12.t.a(uVar));
                        boolean zB = mVar2.B(eVarB) | mVar2.i(f15);
                        Object objQ2 = mVar2.q();
                        if (zB || objQ2 == c2565a) {
                            objQ2 = new f(eVarB, f15);
                            mVar2.K(objQ2);
                        }
                        r rVarA2 = p007l6.m.a(aVar2, eVarB2, (l) objQ2);
                        z0 z0VarD2 = q.d(gVar, false);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        r rVarC2 = h4.k.c(rVarA2, mVar2);
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar3);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, z0VarD2, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        b4.c(fVar4, rVarC2, mVar2);
                        a.a(f16, jA, Integer.valueOf(i14), 0.0f, mVar2, 0);
                        mVar2 = mVar2;
                        mVar2.y();
                        mVar2.f();
                    }
                    mVar2.f();
                }
                float f18 = this.f14418e;
                mVar2 = mVar3;
                h5.g.a.f fVar5 = fVar;
                t.a(fVarA, null, l4.k.b(x2.q(aVar2, f18), hVar), null, null, z3.f.c(-1898937161, new e(f18), mVar3), mVar2, 48, 2040);
                mVar2.y();
                if (bVar3 != null) {
                    uVar = bVar3.f14389c;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    mVar2.C(-537365692);
                    mVar2.f();
                } else {
                    mVar2.C(-537365692);
                    mVar2.f();
                }
                mVar2.f();
            }
            fVar = fVar2;
            aVar = new wf.f.a(context);
            aVar.f184930c = obj;
            l14 = this.f14419f;
            if (l14 != null) {
                aVar.f184933f = strValueOf;
                aVar.f184935h = strValueOf;
            }
            wf.f fVarA4 = aVar.a();
            hVar = bVar3 == null ? k2.i.f102406a : k2.i.f102406a;
            float f19 = this.f14418e;
            mVar2 = mVar3;
            h5.g.a.f fVar6 = fVar;
            t.a(fVarA4, null, l4.k.b(x2.q(aVar2, f19), hVar), null, null, z3.f.c(-1898937161, new e(f19), mVar3), mVar2, 48, 2040);
            mVar2.y();
            if (bVar3 != null) {
                uVar = bVar3.f14389c;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                mVar2.C(-537365692);
                mVar2.f();
            } else {
                mVar2.C(-537365692);
                mVar2.f();
            }
            mVar2.f();
        }
        return Unit.INSTANCE;
    }
}
