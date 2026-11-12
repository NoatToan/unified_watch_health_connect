package a6;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.room.a0;
import c2.t;
import c2.x2;
import c2.y;
import c2.z;
import ca0.l2;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.developer.HelpRegistryActivity;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import com.google.android.gms.maps.model.LatLng;
import f5.z0;
import h5.e0;
import i3.fb;
import i3.i7;
import i3.mh;
import java.util.List;
import lc.u0;
import lc.v;
import o4.m1;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import r1.q2;
import s5.x0;
import u1.u;
import u1.w;
import w5.b0;
import w5.c0;
import w5.f0;
import w5.w0;
import z2.d0;
import z2.o1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1484b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f1483a = i14;
        this.f1484b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x045c  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:230:0x0758  */
    /* JADX WARN: Code duplicated, block: B:237:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:26:0x0137  */
    /* JADX WARN: Code duplicated, block: B:41:0x0198  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x0222  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15;
        int i16;
        o13.p pVar;
        int i17;
        int i18;
        int i19 = this.f1483a;
        int i24 = 18;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        Object obj5 = this.f1484b;
        switch (i19) {
            case 0:
                d dVar = (d) obj5;
                w0 w0VarA = dVar.f1489e.a((w5.q) obj, (f0) obj2, ((b0) obj3).f182072a, ((c0) obj4).f182079a);
                if (w0VarA instanceof w0.b) {
                    Object obj6 = ((w0.b) w0VarA).f182175a;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                s sVar = new s(w0VarA, dVar.f1494j);
                dVar.f1494j = sVar;
                Object obj7 = sVar.f1523c;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                wn1.m.b bVar = (wn1.m.b) obj5;
                ((Integer) obj2).getClass();
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                    x1 x1Var = p3.n.f135158a;
                    String strValueOf = String.valueOf(bVar.f186261a);
                    h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarZ = c2.l.z(rVarE, eVar.f97920e, eVar.f97917b);
                    d92.b.f58624b.getClass();
                    mh.c(strValueOf, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0.a(j92.f.f97934k, 0L, o53.f0.B(13), null, null, 0L, null, null, 0, o53.f0.B(18), null, null, 16646141), mVar), mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                final c70.i iVar = (c70.i) obj5;
                final o82.g gVar = (o82.g) obj;
                final o82.a aVar2 = (o82.a) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar, aVar2);
                if ((iD & 6) == 0) {
                    i14 = (mVar2.k(gVar.ordinal()) ? 4 : 2) | iD;
                } else {
                    i14 = iD;
                }
                if ((iD & 48) == 0) {
                    i14 |= mVar2.B(aVar2) ? 32 : 16;
                }
                if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i25 = c70.g.a.f25229a[gVar.ordinal()];
                    if (i25 == 1) {
                        mVar2.C(-1479617974);
                        u82.e.b(aVar2, iVar.f25236e, null, false, z3.f.c(1972962710, new ao1.f(2, iVar, aVar2), mVar2), mVar2, ((i14 >> 3) & 14) | 24576, 12);
                        mVar2.f();
                    } else if (i25 == 2) {
                        mVar2.C(-1479170334);
                        final int i26 = 2;
                        u82.e.b(aVar2, iVar.f25237f, null, false, z3.f.c(-959599219, new e23.r() { // from class: c70.e
                            /* JADX WARN: Code duplicated, block: B:23:0x005c  */
                            /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
                            /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
                            @Override // e23.r
                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                int i27 = i26;
                                m.a aVar3 = m.f135153a;
                                o82.a aVar4 = aVar2;
                                i iVar2 = iVar;
                                o82.g gVar2 = gVar;
                                u82.f fVar = (u82.f) obj9;
                                m mVar3 = (m) obj10;
                                int iC = vb.h.c((Integer) obj11, (t) obj8, fVar);
                                switch (i27) {
                                    case 0:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var3 = n.f135158a;
                                            boolean zR = mVar3.r(iVar2) | mVar3.B(aVar4);
                                            Object objQ = mVar3.q();
                                            if (zR) {
                                                objQ = new f(iVar2, aVar4, 3);
                                                mVar3.K(objQ);
                                            } else {
                                                aVar3.getClass();
                                                if (objQ == m.a.f135155b) {
                                                    objQ = new f(iVar2, aVar4, 3);
                                                    mVar3.K(objQ);
                                                }
                                            }
                                            f70.h.b(gVar2, fVar, (e23.a) objQ, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var4 = n.f135158a;
                                            boolean zR2 = mVar3.r(iVar2) | mVar3.B(aVar4);
                                            Object objQ2 = mVar3.q();
                                            if (zR2) {
                                                objQ2 = new f(iVar2, aVar4, 0);
                                                mVar3.K(objQ2);
                                            } else {
                                                aVar3.getClass();
                                                if (objQ2 == m.a.f135155b) {
                                                    objQ2 = new f(iVar2, aVar4, 0);
                                                    mVar3.K(objQ2);
                                                }
                                            }
                                            f70.g.b(gVar2, fVar, (e23.a) objQ2, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    default:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var5 = n.f135158a;
                                            boolean zR3 = mVar3.r(iVar2) | mVar3.B(aVar4);
                                            Object objQ3 = mVar3.q();
                                            if (zR3) {
                                                objQ3 = new f(iVar2, aVar4, 2);
                                                mVar3.K(objQ3);
                                            } else {
                                                aVar3.getClass();
                                                if (objQ3 == m.a.f135155b) {
                                                    objQ3 = new f(iVar2, aVar4, 2);
                                                    mVar3.K(objQ3);
                                                }
                                            }
                                            f70.f.b(gVar2, fVar, (e23.a) objQ3, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, ((i14 >> 3) & 14) | 24576, 12);
                        mVar2.f();
                    } else if (i25 == 3) {
                        mVar2.C(-1478712929);
                        u82.a aVar3 = iVar.f25238g;
                        final int i27 = z14 ? 1 : 0;
                        u82.e.b(aVar2, aVar3, null, false, z3.f.c(1492618830, new e23.r() { // from class: c70.e
                            /* JADX WARN: Code duplicated, block: B:23:0x005c  */
                            /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
                            /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
                            @Override // e23.r
                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                int i28 = i27;
                                m.a aVar4 = m.f135153a;
                                o82.a aVar5 = aVar2;
                                i iVar2 = iVar;
                                o82.g gVar2 = gVar;
                                u82.f fVar = (u82.f) obj9;
                                m mVar3 = (m) obj10;
                                int iC = vb.h.c((Integer) obj11, (t) obj8, fVar);
                                switch (i28) {
                                    case 0:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var3 = n.f135158a;
                                            boolean zR = mVar3.r(iVar2) | mVar3.B(aVar5);
                                            Object objQ = mVar3.q();
                                            if (zR) {
                                                objQ = new f(iVar2, aVar5, 3);
                                                mVar3.K(objQ);
                                            } else {
                                                aVar4.getClass();
                                                if (objQ == m.a.f135155b) {
                                                    objQ = new f(iVar2, aVar5, 3);
                                                    mVar3.K(objQ);
                                                }
                                            }
                                            f70.h.b(gVar2, fVar, (e23.a) objQ, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var4 = n.f135158a;
                                            boolean zR2 = mVar3.r(iVar2) | mVar3.B(aVar5);
                                            Object objQ2 = mVar3.q();
                                            if (zR2) {
                                                objQ2 = new f(iVar2, aVar5, 0);
                                                mVar3.K(objQ2);
                                            } else {
                                                aVar4.getClass();
                                                if (objQ2 == m.a.f135155b) {
                                                    objQ2 = new f(iVar2, aVar5, 0);
                                                    mVar3.K(objQ2);
                                                }
                                            }
                                            f70.g.b(gVar2, fVar, (e23.a) objQ2, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    default:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var5 = n.f135158a;
                                            boolean zR3 = mVar3.r(iVar2) | mVar3.B(aVar5);
                                            Object objQ3 = mVar3.q();
                                            if (zR3) {
                                                objQ3 = new f(iVar2, aVar5, 2);
                                                mVar3.K(objQ3);
                                            } else {
                                                aVar4.getClass();
                                                if (objQ3 == m.a.f135155b) {
                                                    objQ3 = new f(iVar2, aVar5, 2);
                                                    mVar3.K(objQ3);
                                                }
                                            }
                                            f70.f.b(gVar2, fVar, (e23.a) objQ3, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, ((i14 >> 3) & 14) | 24576, 12);
                        mVar2.f();
                    } else if (i25 != 4) {
                        mVar2.C(90875602);
                        mVar2.f();
                    } else {
                        mVar2.C(-1478249572);
                        final int i28 = 1;
                        u82.e.b(aVar2, iVar.f25239h, null, false, z3.f.c(-350130417, new e23.r() { // from class: c70.e
                            /* JADX WARN: Code duplicated, block: B:23:0x005c  */
                            /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
                            /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
                            @Override // e23.r
                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                int i29 = i28;
                                m.a aVar4 = m.f135153a;
                                o82.a aVar5 = aVar2;
                                i iVar2 = iVar;
                                o82.g gVar2 = gVar;
                                u82.f fVar = (u82.f) obj9;
                                m mVar3 = (m) obj10;
                                int iC = vb.h.c((Integer) obj11, (t) obj8, fVar);
                                switch (i29) {
                                    case 0:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var3 = n.f135158a;
                                            boolean zR = mVar3.r(iVar2) | mVar3.B(aVar5);
                                            Object objQ = mVar3.q();
                                            if (zR) {
                                                objQ = new f(iVar2, aVar5, 3);
                                                mVar3.K(objQ);
                                            } else {
                                                aVar4.getClass();
                                                if (objQ == m.a.f135155b) {
                                                    objQ = new f(iVar2, aVar5, 3);
                                                    mVar3.K(objQ);
                                                }
                                            }
                                            f70.h.b(gVar2, fVar, (e23.a) objQ, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var4 = n.f135158a;
                                            boolean zR2 = mVar3.r(iVar2) | mVar3.B(aVar5);
                                            Object objQ2 = mVar3.q();
                                            if (zR2) {
                                                objQ2 = new f(iVar2, aVar5, 0);
                                                mVar3.K(objQ2);
                                            } else {
                                                aVar4.getClass();
                                                if (objQ2 == m.a.f135155b) {
                                                    objQ2 = new f(iVar2, aVar5, 0);
                                                    mVar3.K(objQ2);
                                                }
                                            }
                                            f70.g.b(gVar2, fVar, (e23.a) objQ2, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    default:
                                        if ((iC & 48) == 0) {
                                            iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                                        }
                                        if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                                            x1 x1Var5 = n.f135158a;
                                            boolean zR3 = mVar3.r(iVar2) | mVar3.B(aVar5);
                                            Object objQ3 = mVar3.q();
                                            if (zR3) {
                                                objQ3 = new f(iVar2, aVar5, 2);
                                                mVar3.K(objQ3);
                                            } else {
                                                aVar4.getClass();
                                                if (objQ3 == m.a.f135155b) {
                                                    objQ3 = new f(iVar2, aVar5, 2);
                                                    mVar3.K(objQ3);
                                                }
                                            }
                                            f70.f.b(gVar2, fVar, (e23.a) objQ3, mVar3, iC & 112);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, ((i14 >> 3) & 14) | 24576, 12);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                h4.r rVar = (h4.r) obj;
                e23.a aVar4 = (e23.a) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                rVar.getClass();
                aVar4.getClass();
                mVar3.C(-1049071501);
                x1 x1Var3 = p3.n.f135158a;
                h4.r rVarB = w.b(rVar, (a2.j) obj5, fb.a(0.0f, 6, 0L, true), false, null, null, aVar4, 28);
                mVar3.f();
                return rVarB;
            case 4:
                h4.r rVar2 = (h4.r) obj;
                u uVar = (u) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                rVar2.getClass();
                uVar.getClass();
                mVar4.C(-1163021070);
                x1 x1Var4 = p3.n.f135158a;
                h4.r rVarC = u1.q.c(uVar.f167683a, rVar2, uVar.f167684b, (k2.h) obj5);
                mVar4.f();
                return rVarC;
            case 5:
                x80.e eVar2 = (x80.e) obj5;
                p3.m mVar5 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (v) obj2);
                x1 x1Var5 = p3.n.f135158a;
                da0.p.d(null, true, null, null, null, null, null, mVar5, 48, 253);
                Unit unit = Unit.INSTANCE;
                boolean zR = mVar5.r(eVar2);
                Object objQ = mVar5.q();
                if (zR) {
                    objQ = new ca0.x1.c(eVar2, null);
                    mVar5.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ca0.x1.c(eVar2, null);
                        mVar5.K(objQ);
                    }
                }
                l0.e((e23.p) objQ, unit, mVar5);
                return unit;
            case 6:
                u1 u1Var = (u1) obj5;
                p3.m mVar6 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (v) obj2);
                x1 x1Var6 = p3.n.f135158a;
                boolean zB = mVar6.B(u1Var);
                Object objQ2 = mVar6.q();
                if (zB) {
                    objQ2 = new l2(u1Var, 1);
                    mVar6.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new l2(u1Var, 1);
                        mVar6.K(objQ2);
                    }
                }
                wa0.b.a((e23.a) objQ2, mVar6, 0);
                return Unit.INSTANCE;
            case 7:
                HelpRegistryActivity helpRegistryActivity = (HelpRegistryActivity) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                p3.m mVar7 = (p3.m) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                int i29 = HelpRegistryActivity.f33616a;
                ((e2.d) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= mVar7.k(iIntValue2) ? 32 : 16;
                }
                if (mVar7.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    x1 x1Var7 = p3.n.f135158a;
                    helpRegistryActivity.da(ro0.l.values()[iIntValue2], mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                u4.d dVar2 = (u4.d) obj2;
                p3.m mVar8 = (p3.m) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                dVar2.getClass();
                x1 x1Var8 = p3.n.f135158a;
                h4.r.a aVar5 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarQ = x2.q(aVar5, j92.b.f97901d.f97905d);
                long jF = u0.f(mVar8);
                d91.f fVar = ((d91.s) obj5).f58586h;
                if ((fVar != null ? fVar.f58532b : null) != null) {
                    i15 = -1481898543;
                    i16 = R.string.change_this_insight_rating;
                } else {
                    i15 = -1481765894;
                    i16 = R.string.rate_this_insight;
                }
                i7.b(dVar2, sn.a.h(mVar8, i15, i16, mVar8), rVarQ, jF, mVar8, (iIntValue4 >> 3) & 14, 0);
                return Unit.INSTANCE;
            case 9:
                CustomerManagementLibMainActivity customerManagementLibMainActivity = (CustomerManagementLibMainActivity) obj5;
                ((Integer) obj4).getClass();
                CustomerManagementLibMainActivity.a aVar6 = CustomerManagementLibMainActivity.f50711h;
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var9 = p3.n.f135158a;
                customerManagementLibMainActivity.setResult(-1);
                customerManagementLibMainActivity.finish();
                return Unit.INSTANCE;
            case 10:
                GroupCreationActivity groupCreationActivity = (GroupCreationActivity) obj5;
                String str = (String) obj;
                String str2 = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                int i30 = GroupCreationActivity.f36131b;
                str.getClass();
                str2.getClass();
                if (zBooleanValue && zBooleanValue2) {
                    pVar = new o13.p(Integer.valueOf(R.string.msg_group_creation_error_general_title), Integer.valueOf(R.string.msg_group_creation_error_general_description));
                } else if (zBooleanValue) {
                    pVar = new o13.p(Integer.valueOf(R.string.msg_group_creation_error_photo_title), Integer.valueOf(R.string.msg_group_creation_error_photo_description));
                } else {
                    pVar = zBooleanValue2 ? new o13.p(Integer.valueOf(R.string.msg_group_creation_error_invite_title), Integer.valueOf(R.string.msg_group_creation_error_invite_description)) : new o13.p(null, null);
                }
                groupCreationActivity.startActivity(GroupDetailActivity.a.a(GroupDetailActivity.f36137j, groupCreationActivity, str, str2, null, (Integer) pVar.f128594a, (Integer) pVar.f128595b, 8));
                groupCreationActivity.setResult(-1);
                groupCreationActivity.finish();
                return Unit.INSTANCE;
            case 11:
                List list = (List) obj5;
                int iIntValue5 = ((Integer) obj2).intValue();
                p3.m mVar9 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                x1 x1Var10 = p3.n.f135158a;
                h4.r.a aVar7 = h4.r.S;
                h4.r rVarF = x2.f(aVar7, 1.0f);
                float f14 = 16;
                g6.f.a aVar8 = g6.f.f75994b;
                h4.r rVarY = c2.l.y(u1.n.e(c2.l.A(rVarF, f14, 0.0f, 2), vb.h.e(d92.b.f58623a, mVar9), k2.i.a(8)), f14);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81527e, false);
                int iHashCode = Long.hashCode(mVar9.getU());
                i2 i2VarX = mVar9.x();
                h4.r rVarC2 = h4.k.c(rVarY, mVar9);
                h5.g.V.getClass();
                e0.a aVar9 = h5.g.a.f81805b;
                if (mVar9.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar9.z();
                if (mVar9.getT()) {
                    mVar9.M(aVar9);
                } else {
                    mVar9.c();
                }
                h5.g.a.e eVar3 = h5.g.a.f81810g;
                b4.c(eVar3, z0VarD, mVar9);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarX, mVar9);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar9, iHashCode, bVar2);
                }
                h5.g.a.f fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC2, mVar9);
                c2.u uVar2 = c2.u.f22885a;
                c2.j.f22691a.getClass();
                z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar9, 0);
                int iHashCode2 = Long.hashCode(mVar9.getU());
                i2 i2VarX2 = mVar9.x();
                h4.r rVarC3 = h4.k.c(aVar7, mVar9);
                if (mVar9.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar9.z();
                if (mVar9.getT()) {
                    mVar9.M(aVar9);
                } else {
                    mVar9.c();
                }
                b4.c(eVar3, zVarA, mVar9);
                b4.c(c1623g, i2VarX2, mVar9);
                if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar9, iHashCode2, bVar2);
                }
                b4.c(fVar2, rVarC3, mVar9);
                c2.b0 b0Var = c2.b0.f22601a;
                String str3 = (String) list.get(iIntValue5);
                d92.b.f58624b.getClass();
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), mVar9, 0, 0, 131070);
                c2.l.f(x2.h(aVar7, 4), mVar9);
                mh.c("fadeIn + fadeOut with SizeTransformSpec — cross-fades between sub-states", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar9), mVar9, 6, 0, 131070);
                mVar9.y();
                mVar9.y();
                return Unit.INSTANCE;
            case 12:
                nw0.r rVar3 = (nw0.r) obj5;
                long jLongValue = ((Long) obj).longValue();
                e23.a aVar10 = (e23.a) obj2;
                p3.m mVar10 = (p3.m) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                aVar10.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i17 = iIntValue6 | (mVar10.l(jLongValue) ? 4 : 2);
                } else {
                    i17 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i17 |= mVar10.r(aVar10) ? 32 : 16;
                }
                if (mVar10.n(i17 & 1, (i17 & 147) != 146)) {
                    x1 x1Var11 = p3.n.f135158a;
                    boolean z15 = ((i17 & 14) == 4 ? (char) 1 : (char) 0) | (((i17 & 112) == 32 ? (char) 1 : (char) 0) | (mVar10.r(rVar3) ? 1 : 0) ? 1 : 0);
                    Object objQ3 = mVar10.q();
                    if (z15 == 0) {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            d62.s sVar2 = new d62.s(aVar10, rVar3, jLongValue, 4);
                            mVar10.K(sVar2);
                            objQ3 = sVar2;
                        }
                    } else {
                        d62.s sVar3 = new d62.s(aVar10, rVar3, jLongValue, 4);
                        mVar10.K(sVar3);
                        objQ3 = sVar3;
                    }
                    nw0.q.b(aVar10, (e23.a) objQ3, mVar10, (i17 >> 3) & 14);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 13:
                q82.c cVar = (q82.c) obj5;
                o82.g gVar2 = (o82.g) obj;
                o82.a aVar11 = (o82.a) obj2;
                p3.m mVar11 = (p3.m) obj3;
                int iD2 = vb.h.d((Integer) obj4, gVar2, aVar11);
                if ((iD2 & 6) == 0) {
                    i18 = (mVar11.k(gVar2.ordinal()) ? 4 : 2) | iD2;
                } else {
                    i18 = iD2;
                }
                if ((iD2 & 48) == 0) {
                    i18 |= mVar11.B(aVar11) ? 32 : 16;
                }
                if (mVar11.n(1 & i18, (i18 & 147) != 146)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    h4.r rVarD = x2.d(aVar12, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar11.getU());
                    i2 i2VarX3 = mVar11.x();
                    h4.r rVarC4 = h4.k.c(rVarD, mVar11);
                    h5.g.V.getClass();
                    e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar13);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar11);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar11, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar11);
                    g6.f.a aVar14 = g6.f.f75994b;
                    h4.r rVarY2 = c2.l.y(c2.u.f22885a.c(aVar12, h4.d.a.f81528f), 8);
                    d6.h.f57752b.getClass();
                    mh.c(a0.j("Test page for ", gVar2.name(), ":\n", cVar.a(new n82.d(aVar11, gVar2))), rVarY2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, null, mVar11, 0, 0, 261116);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 14:
                n82.f fVar3 = (n82.f) obj5;
                u82.f fVar4 = (u82.f) obj2;
                p3.m mVar12 = (p3.m) obj3;
                int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar4);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar12.B(fVar4) : mVar12.r(fVar4) ? 32 : 16;
                }
                if (mVar12.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var13 = p3.n.f135158a;
                    ir0.e eVar4 = (ir0.e) fVar4.a();
                    boolean zB2 = mVar12.B(fVar3);
                    Object objQ4 = mVar12.q();
                    if (zB2) {
                        objQ4 = new d52.k(fVar3, 12);
                        mVar12.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new d52.k(fVar3, 12);
                            mVar12.K(objQ4);
                        }
                    }
                    rr0.q.d(eVar4, (e23.l) objQ4, mVar12, ir0.e.f94792c);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 15:
                ke2.b bVar4 = (ke2.b) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                LatLng latLng = (LatLng) obj3;
                LatLng latLng2 = (LatLng) obj4;
                ot1.e eVar5 = ot1.e.f133785a;
                bVar4.getClass();
                latLng.getClass();
                latLng2.getClass();
                int i34 = qt1.a.I;
                ((qt1.a) obj5).A4(bVar4, fFloatValue, latLng, latLng2, false, new qr.n(20));
                return Unit.INSTANCE;
            case 16:
                nk0.l lVar = (nk0.l) obj5;
                p3.m mVar13 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (v) obj2);
                x1 x1Var14 = p3.n.f135158a;
                mVar13.L(414512006);
                Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar13, 0);
                p1 p1VarQ = p0.q(null, mVar13);
                mVar13.L(855641119);
                boolean zB3 = mVar13.B(null) | mVar13.B(scopeCurrentKoinScope);
                Object objQ5 = mVar13.q();
                if (zB3) {
                    objQ5 = scopeCurrentKoinScope.get((k23.d<?>) s0.f105811a.b(mn0.p.class), (Qualifier) null, new qn0.s(p1VarQ));
                    mVar13.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = scopeCurrentKoinScope.get((k23.d<?>) s0.f105811a.b(mn0.p.class), (Qualifier) null, new qn0.s(p1VarQ));
                        mVar13.K(objQ5);
                    }
                }
                mVar13.R();
                mVar13.R();
                ((mn0.p) objQ5).b(lVar, mVar13, 0);
                return Unit.INSTANCE;
            case 17:
                p1 p1Var = (p1) obj5;
                int iIntValue7 = ((Integer) obj2).intValue();
                p3.m mVar14 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((h2.c0) obj).getClass();
                x1 x1Var15 = p3.n.f135158a;
                if (iIntValue7 == 0) {
                    mVar14.C(-708981312);
                    dy1.d dVar3 = (dy1.d) p1Var.getF182175a();
                    dy1.b bVar5 = dVar3 != null ? dVar3.f61542c : null;
                    boolean zB4 = mVar14.B(p1Var);
                    Object objQ6 = mVar14.q();
                    if (zB4) {
                        objQ6 = new pp.b(p1Var, i24);
                        mVar14.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new pp.b(p1Var, i24);
                            mVar14.K(objQ6);
                        }
                    }
                    rx1.b.a(null, bVar5, (e23.l) objQ6, mVar14, 0);
                    mVar14.f();
                } else if (iIntValue7 != 1) {
                    mVar14.C(-708233561);
                    mVar14.f();
                } else {
                    mVar14.C(-708598338);
                    dy1.d dVar4 = (dy1.d) p1Var.getF182175a();
                    dy1.b bVar6 = dVar4 != null ? dVar4.f61543d : null;
                    boolean zB5 = mVar14.B(p1Var);
                    Object objQ7 = mVar14.q();
                    if (zB5) {
                        objQ7 = new pp.b(p1Var, 17);
                        mVar14.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new pp.b(p1Var, 17);
                            mVar14.K(objQ7);
                        }
                    }
                    rx1.b.a(null, bVar6, (e23.l) objQ7, mVar14, 0);
                    mVar14.f();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar15 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (v) obj2);
                x1 x1Var16 = p3.n.f135158a;
                aa1.j jVar = (aa1.j) s9.c.c(((ba1.d) obj5).f16998z, mVar15).getF182175a();
                b.u uVar3 = (b.u) mVar15.A(g02.d.f74342a);
                boolean zR2 = mVar15.r(uVar3);
                Object objQ8 = mVar15.q();
                if (zR2) {
                    objQ8 = new w91.l(uVar3);
                    mVar15.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new w91.l(uVar3);
                        mVar15.K(objQ8);
                    }
                }
                x91.v.a(jVar, (e23.a) ((k23.g) objQ8), mVar15, 0);
                return Unit.INSTANCE;
            case 19:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                wd.b.a aVar15 = wd.b.f184321b;
                sQLiteQuery.getClass();
                ((vd.f) obj5).a(new wd.g(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 20:
                p3.m mVar16 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                NutritionActivity.a aVar16 = NutritionActivity.f39581f;
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var17 = p3.n.f135158a;
                b.u onBackPressedDispatcher = ((NutritionActivity) obj5).getOnBackPressedDispatcher();
                boolean zR3 = mVar16.r(onBackPressedDispatcher);
                Object objQ9 = mVar16.q();
                if (zR3) {
                    objQ9 = new NutritionActivity.h(onBackPressedDispatcher);
                    mVar16.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new NutritionActivity.h(onBackPressedDispatcher);
                        mVar16.K(objQ9);
                    }
                }
                h21.k.b((e23.a) ((k23.g) objQ9), mVar16, 0);
                return Unit.INSTANCE;
            default:
                o1 o1Var = (o1) obj5;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                f5.c0 c0Var = (f5.c0) obj2;
                n4.c cVar2 = (n4.c) obj3;
                d0 d0Var = (d0) obj4;
                long jA = c0Var.a();
                n4.d dVar5 = new n4.d(0.0f, 0.0f, (int) (jA >> 32), (int) (jA & 4294967295L));
                boolean zA = z2.p1.a(cVar2.f123544a, dVar5);
                long jC = cVar2.f123544a;
                if (!zA) {
                    jC = v2.i.c(jC, dVar5);
                }
                long jA2 = o1Var.a(c0Var, jC);
                if ((jA2 & 9223372034707292159L) != 9205357640488583168L) {
                    o1Var.n(zBooleanValue3);
                    o1Var.f201730u = null;
                    n4.c.f123541b.getClass();
                    o1Var.q(jA2, n4.c.f123543d, false, d0Var);
                    m4.b0.a(o1Var.f201718i);
                    o1Var.f201734y = false;
                    o1Var.r();
                    o1Var.f201731v = true;
                }
                return Unit.INSTANCE;
        }
    }
}
