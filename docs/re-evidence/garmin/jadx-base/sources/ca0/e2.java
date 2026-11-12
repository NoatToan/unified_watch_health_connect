package ca0;

import androidx.lifecycle.ViewModelStoreOwner;
import b21.d7;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e2 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f26203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f26204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f26205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26206e;

    public /* synthetic */ e2(u1 u1Var, e23.a aVar, lc.m0 m0Var, e23.l lVar) {
        this.f26202a = 4;
        this.f26203b = u1Var;
        this.f26205d = aVar;
        this.f26206e = m0Var;
        this.f26204c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:30:0x011b  */
    /* JADX WARN: Code duplicated, block: B:37:0x016c  */
    /* JADX WARN: Code duplicated, block: B:42:0x018a  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x0215  */
    /* JADX WARN: Code duplicated, block: B:67:0x0275  */
    /* JADX WARN: Code duplicated, block: B:72:0x0297  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x032c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0064  */
    /* JADX WARN: Code duplicated, block: B:91:0x034a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f26202a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f26205d;
        lc.m0 m0Var = this.f26206e;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                qb0.b bVarA = f2.a(vVar, aVar2, m0Var, mVar);
                boolean zR = mVar.r(m0Var);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new d7(m0Var, 18);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d7(m0Var, 18);
                        mVar.K(objQ);
                    }
                }
                e23.l lVar = (e23.l) objQ;
                boolean zR2 = mVar.r(m0Var);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new u0(m0Var, 15);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new u0(m0Var, 15);
                        mVar.K(objQ2);
                    }
                }
                qb0.k.a(0, this.f26203b, (e23.a) objQ2, lVar, this.f26204c, mVar, bVarA);
                return Unit.INSTANCE;
            case 1:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                l90.b bVar = f2.a(vVar2, aVar2, m0Var, mVar2).f143958a.f143495c;
                d90.f fVar = bVar.f111531p.f58441g;
                u1 u1Var = this.f26203b;
                boolean zB = mVar2.B(u1Var);
                Object objQ3 = mVar2.q();
                if (zB) {
                    objQ3 = new c2(u1Var, 3);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new c2(u1Var, 3);
                        mVar2.K(objQ3);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ3, mVar2, false);
                qb0.n.a(bVar.f111521f, bVar.f111526k, fVar, u1Var, this.f26204c, mVar2, 0);
                return Unit.INSTANCE;
            case 2:
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar3.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                l90.b bVar2 = f2.a(vVar3, aVar2, m0Var, mVar3).f143958a.f143495c;
                z90.b bVarValueOf = z90.b.valueOf(((k2.f) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(k2.f.class))).f26320a);
                u1 u1Var2 = this.f26203b;
                boolean zB2 = mVar3.B(u1Var2);
                Object objQ4 = mVar3.q();
                if (zB2) {
                    objQ4 = new c2(u1Var2, 1);
                    mVar3.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new c2(u1Var2, 1);
                        mVar3.K(objQ4);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ4, mVar3, false);
                String str = bVar2.f111521f;
                o90.a aVar3 = bVar2.f111526k;
                boolean zR3 = mVar3.r(m0Var);
                Object objQ5 = mVar3.q();
                if (zR3) {
                    objQ5 = new u0(m0Var, 13);
                    mVar3.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new u0(m0Var, 13);
                        mVar3.K(objQ5);
                    }
                }
                qb0.g.a(str, aVar3, bVarValueOf, (e23.a) objQ5, u1Var2, this.f26204c, mVar3, 0);
                return Unit.INSTANCE;
            case 3:
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar4.getClass();
                p3.x1 x1Var4 = p3.n.f135158a;
                qb0.b bVarA2 = f2.a(vVar4, aVar2, m0Var, mVar4);
                u1 u1Var3 = this.f26203b;
                boolean zB3 = mVar4.B(u1Var3);
                Object objQ6 = mVar4.q();
                if (zB3) {
                    objQ6 = new c2(u1Var3, 2);
                    mVar4.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new c2(u1Var3, 2);
                        mVar4.K(objQ6);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ6, mVar4, false);
                boolean zR4 = mVar4.r(m0Var);
                Object objQ7 = mVar4.q();
                if (zR4) {
                    objQ7 = new u0(m0Var, 14);
                    mVar4.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new u0(m0Var, 14);
                        mVar4.K(objQ7);
                    }
                }
                e23.a aVar4 = (e23.a) objQ7;
                boolean zR5 = mVar4.r(m0Var);
                Object objQ8 = mVar4.q();
                if (zR5) {
                    objQ8 = new d7(m0Var, 17);
                    mVar4.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new d7(m0Var, 17);
                        mVar4.K(objQ8);
                    }
                }
                qb0.t.a(0, u1Var3, aVar4, (e23.l) objQ8, this.f26204c, mVar4, bVarA2);
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var5 = p3.n.f135158a;
                u1 u1Var4 = this.f26203b;
                boolean zB4 = mVar5.B(u1Var4);
                Object objQ9 = mVar5.q();
                if (zB4) {
                    objQ9 = new c2(u1Var4, 4);
                    mVar5.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new c2(u1Var4, 4);
                        mVar5.K(objQ9);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ9, mVar5, false);
                boolean zB5 = mVar5.B(aVar2);
                Object objQ10 = mVar5.q();
                if (zB5) {
                    objQ10 = new v0(aVar2, 6);
                    mVar5.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new v0(aVar2, 6);
                        mVar5.K(objQ10);
                    }
                }
                e23.a aVar5 = (e23.a) objQ10;
                mVar5.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar5);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(qb0.v.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar5);
                mVar5.R();
                qb0.v vVar5 = (qb0.v) u1VarResolveViewModel;
                boolean zR6 = mVar5.r(m0Var);
                Object objQ11 = mVar5.q();
                if (zR6) {
                    objQ11 = new u0(m0Var, 11);
                    mVar5.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new u0(m0Var, 11);
                        mVar5.K(objQ11);
                    }
                }
                e23.a aVar6 = (e23.a) objQ11;
                boolean zR7 = mVar5.r(m0Var);
                Object objQ12 = mVar5.q();
                if (zR7) {
                    objQ12 = new d7(m0Var, 16);
                    mVar5.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new d7(m0Var, 16);
                        mVar5.K(objQ12);
                    }
                }
                qb0.t.c(vVar5, aVar6, u1Var4, (e23.l) objQ12, this.f26204c, mVar5, 0);
                return Unit.INSTANCE;
            case 5:
                lc.v vVar6 = (lc.v) obj2;
                p3.m mVar6 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar6);
                p3.x1 x1Var6 = p3.n.f135158a;
                l90.b bVar3 = f2.a(vVar6, aVar2, m0Var, mVar6).f143958a.f143495c;
                d90.f fVar2 = bVar3.f111531p.f58441g;
                u1 u1Var5 = this.f26203b;
                boolean zB6 = mVar6.B(u1Var5);
                Object objQ13 = mVar6.q();
                if (zB6) {
                    objQ13 = new c2(u1Var5, 0);
                    mVar6.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new c2(u1Var5, 0);
                        mVar6.K(objQ13);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ13, mVar6, false);
                qb0.u.a(bVar3.f111521f, bVar3.f111526k, fVar2, u1Var5, this.f26204c, mVar6, 0);
                return Unit.INSTANCE;
            default:
                lc.v vVar7 = (lc.v) obj2;
                p3.m mVar7 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar7);
                p3.x1 x1Var7 = p3.n.f135158a;
                qb0.b bVarA3 = f2.a(vVar7, aVar2, m0Var, mVar7);
                l90.b bVar4 = bVarA3.f143958a.f143495c;
                int i15 = ((sb0.b) p3.p0.c(bVarA3.f143967j, mVar7, 0).getF182175a()).f158394e;
                bd0.b0 b0VarValueOf = bd0.b0.valueOf(((k2.b) lc.w.a(vVar7, p005kotlin.jvm.internal.s0.f105811a.b(k2.b.class))).f26315a);
                String str2 = bVar4.f111521f;
                o90.a aVar7 = bVar4.f111526k;
                boolean zR8 = mVar7.r(m0Var);
                Object objQ14 = mVar7.q();
                if (zR8) {
                    objQ14 = new u0(m0Var, 12);
                    mVar7.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new u0(m0Var, 12);
                        mVar7.K(objQ14);
                    }
                }
                qb0.p.a(str2, aVar7, b0VarValueOf, (e23.a) objQ14, i15 > 1 ? this.f26203b : null, this.f26204c, mVar7, 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e2(u1 u1Var, e23.l lVar, e23.a aVar, lc.m0 m0Var, int i14) {
        this.f26202a = i14;
        this.f26203b = u1Var;
        this.f26204c = lVar;
        this.f26205d = aVar;
        this.f26206e = m0Var;
    }

    public /* synthetic */ e2(u1 u1Var, lc.m0 m0Var, e23.l lVar, e23.a aVar, int i14) {
        this.f26202a = i14;
        this.f26203b = u1Var;
        this.f26206e = m0Var;
        this.f26204c = lVar;
        this.f26205d = aVar;
    }

    public /* synthetic */ e2(lc.m0 m0Var, u1 u1Var, e23.l lVar, e23.a aVar) {
        this.f26202a = 6;
        this.f26206e = m0Var;
        this.f26203b = u1Var;
        this.f26204c = lVar;
        this.f26205d = aVar;
    }
}
