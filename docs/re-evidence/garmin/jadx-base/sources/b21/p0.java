package b21;

import android.graphics.Bitmap;
import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import i3.fe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p0 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NutritionActivity.g f15125c;

    public /* synthetic */ p0(lc.m0 m0Var, NutritionActivity.g gVar, int i14) {
        this.f15123a = i14;
        this.f15124b = m0Var;
        this.f15125c = gVar;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f15123a;
        final int i15 = 0;
        final int i16 = 1;
        final NutritionActivity.g gVar = this.f15125c;
        final lc.m0 m0Var = this.f15124b;
        final int i17 = 3;
        switch (i14) {
            case 0:
                final lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                int iB = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                final int i18 = 7;
                d1.a(vVar, m0Var, z3.f.c(-982287435, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar2;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i19 = i18;
                        int i24 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i25 = 6;
                        lc.v vVar3 = vVar;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i26 = 0;
                        switch (i19) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar2 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                Object objQ = mVar2.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar2);
                                    mVar2.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar2).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar2.C(-1094460174);
                                    mVar2.f();
                                    gVar4.invoke();
                                } else {
                                    mVar2.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar2, R.string.generic_error_message);
                                    boolean zR = mVar2.r(rVar);
                                    Object objQ2 = mVar2.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar2.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar2.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar5);
                                    mVar2.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar2).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar2.r(dVar) | mVar2.r(rVar) | mVar2.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar2.r(m0Var9) | mVar2.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar2.B(feVar)) || (iIntValue & 48) == 32) | mVar2.B(strQ);
                                    Object objQ3 = mVar2.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar2.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar2, (iIntValue << 3) & 896);
                                    mVar2.f();
                                }
                                p3.x1 x1Var3 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar3 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar4 = vVar;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar4, dVarB);
                                boolean zR4 = mVar3.r(aVar7);
                                Object objQ4 = mVar3.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar3.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar3.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar3.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar3);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar3, 0), aVar8);
                                mVar3.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar4, "foodUpdatedResult", null, mVar3);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar3.B(p1VarN) | mVar3.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar3.r(m0Var10) | mVar3.r(vVar4);
                                Object objQ5 = mVar3.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar4, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar3.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar4, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar3.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar3);
                                boolean zR6 = mVar3.r(aVar7) | mVar3.r(dVar2) | mVar3.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar3.B(gVar5);
                                Object objQ6 = mVar3.q();
                                if (zB2) {
                                    lc.m0 m0Var11 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var11;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar3.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var12 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var12;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar3.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar3.r(m0Var3);
                                Object objQ7 = mVar3.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar3.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar3.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar3.r(m0Var3) | mVar3.r(aVar2);
                                Object objQ8 = mVar3.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar3.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar3.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar3.r(m0Var3) | mVar3.B(gVar5);
                                Object objQ9 = mVar3.q();
                                if (zR9) {
                                    final int i27 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i27) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar3.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i28 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i28) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar3.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar3.B(gVar5);
                                Object objQ10 = mVar3.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar3.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar3.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar3, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar4 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar3, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar4.r(w0Var);
                                Object objQ11 = mVar4.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar4.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar4.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar4.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar4);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar12);
                                mVar4.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar4.r(dVar3) | mVar4.r(m0Var8) | mVar4.B(gVar3);
                                Object objQ12 = mVar4.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar4.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar4.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar4, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar5 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar3, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar5.r(cVar3) | mVar5.B(c2080b);
                                Object objQ13 = mVar5.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar5.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar5.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar5.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar5);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar13);
                                mVar5.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar5.r(cVar3) | mVar5.r(dVar4);
                                lc.m0 m0Var13 = m0Var;
                                boolean zR14 = zR13 | mVar5.r(m0Var13);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar5.B(gVar6);
                                Object objQ14 = mVar5.q();
                                if (zB4) {
                                    a51.l lVar4 = new a51.l(cVar3, dVar4, m0Var13, gVar6, 9);
                                    mVar5.K(lVar4);
                                    objQ14 = lVar4;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar5 = new a51.l(cVar3, dVar4, m0Var13, gVar6, 9);
                                        mVar5.K(lVar5);
                                        objQ14 = lVar5;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar5.r(m0Var13);
                                Object objQ15 = mVar5.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var13, 5);
                                    mVar5.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var13, 5);
                                        mVar5.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar5.B(gVar6);
                                Object objQ16 = mVar5.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar5.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar5.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar5, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar6 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar5 = vVar;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar5, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar6.r(bVar2) | mVar6.B(aVar14);
                                Object objQ17 = mVar6.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar6.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar6.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar6.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar6);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar6, 0), aVar15);
                                mVar6.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar5, "recipeUpdatedResult", null, mVar6);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar6.B(p1VarN2) | mVar6.r(tVar3);
                                lc.m0 m0Var14 = m0Var;
                                boolean zR17 = zB6 | mVar6.r(m0Var14) | mVar6.r(vVar5);
                                Object objQ18 = mVar6.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var14, vVar5, p1VarN2, null);
                                    m0Var4 = m0Var14;
                                    mVar6.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var14, vVar5, p1VarN2, null);
                                        m0Var4 = m0Var14;
                                        mVar6.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var14;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar6);
                                boolean zR18 = mVar6.r(bVar2) | mVar6.r(dVar5) | mVar6.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar6.B(gVar7);
                                Object objQ19 = mVar6.q();
                                if (zB7) {
                                    lc.m0 m0Var15 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var15;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar6.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var16 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var16;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar6.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar6.r(m0Var5) | mVar6.B(gVar7);
                                Object objQ20 = mVar6.q();
                                if (zR19) {
                                    final int i29 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i29) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar6.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i210 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i210) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar6.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar6.r(m0Var5);
                                Object objQ21 = mVar6.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar6.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar6.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar6.r(m0Var5) | mVar6.r(bVar);
                                Object objQ22 = mVar6.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar6.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar6.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar6.B(gVar7);
                                Object objQ23 = mVar6.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar6.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar6.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar6, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar7 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar6 = vVar;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar6, dVarB3);
                                boolean zR22 = mVar7.r(gVar8);
                                Object objQ24 = mVar7.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar7.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar7.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar7.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar7);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar7, 0), aVar18);
                                mVar7.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar6, "foodUpdatedResult", null, mVar7);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar7.B(p1VarN3) | mVar7.r(nVar);
                                lc.m0 m0Var17 = m0Var;
                                boolean zR23 = zB9 | mVar7.r(m0Var17) | mVar7.r(vVar6);
                                Object objQ25 = mVar7.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var17, vVar6, p1VarN3, null);
                                    m0Var6 = m0Var17;
                                    vVar2 = vVar6;
                                    mVar7.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var17, vVar6, p1VarN3, null);
                                        m0Var6 = m0Var17;
                                        vVar2 = vVar6;
                                        mVar7.K(objQ25);
                                    } else {
                                        vVar2 = vVar6;
                                        m0Var6 = m0Var17;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar7);
                                p3.p1 p1VarN4 = n23.j.n(vVar2, "standaloneConsumableFoodUpdatedResult", null, mVar7);
                                b11.v vVar7 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar7.B(p1VarN4) | mVar7.r(nVar) | mVar7.r(vVar2);
                                Object objQ26 = mVar7.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar2, p1VarN4, nVar, null);
                                    mVar7.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar2, p1VarN4, nVar, null);
                                        mVar7.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar7, mVar7);
                                boolean zR24 = mVar7.r(gVar8) | mVar7.r(dVar6) | mVar7.r(m0Var6);
                                lc.m0 m0Var18 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar7.B(gVar9);
                                Object objQ27 = mVar7.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var18;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar7.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var18;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar7.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var18;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar7.r(m0Var7);
                                Object objQ28 = mVar7.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar7.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar7.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar7.r(gVar2) | mVar7.r(m0Var7);
                                Object objQ29 = mVar7.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar7.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar7.K(objQ29);
                                    }
                                }
                                e23.l lVar6 = (e23.l) objQ29;
                                boolean zR27 = mVar7.r(m0Var7) | mVar7.r(gVar2);
                                Object objQ30 = mVar7.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i25, m0Var7, gVar2);
                                    mVar7.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i25, m0Var7, gVar2);
                                        mVar7.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar7.r(m0Var7) | mVar7.B(gVar9);
                                Object objQ31 = mVar7.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i26) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar7.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i26) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar7.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar7.B(gVar9);
                                Object objQ32 = mVar7.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar7.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar7.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar6, aVar19, aVar20, (e23.a) objQ32, mVar7, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar8 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar3, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar8.B(c1412b);
                                Object objQ33 = mVar8.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar8.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar8.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar8.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar8);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar8, 0), aVar21);
                                mVar8.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar3, "addedFoodResult", null, mVar8);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar8.B(p1VarN5) | mVar8.r(gVar10) | mVar8.r(vVar3);
                                Object objQ34 = mVar8.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar3, p1VarN5, gVar10, null);
                                    mVar8.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar3, p1VarN5, gVar10, null);
                                        mVar8.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar8);
                                p3.p1 p1VarN6 = n23.j.n(vVar3, "standaloneConsumableFoodUpdatedResult", null, mVar8);
                                b11.v vVar8 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar8.B(p1VarN6) | mVar8.r(gVar10) | mVar8.r(vVar3);
                                Object objQ35 = mVar8.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar3, p1VarN6, gVar10, null);
                                    mVar8.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar3, p1VarN6, gVar10, null);
                                        mVar8.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar8, mVar8);
                                boolean zB16 = mVar8.B(c1412b) | mVar8.r(m0Var8) | mVar8.B(gVar3);
                                Object objQ36 = mVar8.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar8.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar8.K(objQ36);
                                    }
                                }
                                e23.l lVar7 = (e23.l) objQ36;
                                boolean zR29 = mVar8.r(jVar2) | mVar8.r(m0Var8);
                                Object objQ37 = mVar8.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i26) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar9 = (b11.v) obj9;
                                                    vVar9.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar9, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar8.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i26) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar9 = (b11.v) obj9;
                                                        vVar9.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar9, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar8.K(objQ37);
                                    }
                                }
                                e23.l lVar8 = (e23.l) objQ37;
                                boolean zR30 = mVar8.r(jVar2) | mVar8.r(m0Var8);
                                Object objQ38 = mVar8.q();
                                if (zR30) {
                                    final int i30 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i30) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar9 = (b11.v) obj9;
                                                    vVar9.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar9, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar8.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i34 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i34) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar9 = (b11.v) obj9;
                                                        vVar9.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar9, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar8.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar7, lVar8, (e23.l) objQ38, mVar8, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar9 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar3, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar9.r(hVar2);
                                Object objQ39 = mVar9.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar9.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar9.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar9.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar9);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar22);
                                mVar9.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar9.r(hVar2) | mVar9.r(dVar7);
                                lc.m0 m0Var19 = m0Var;
                                boolean zR33 = zR32 | mVar9.r(m0Var19);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar9.B(gVar11);
                                Object objQ40 = mVar9.q();
                                if (zB17) {
                                    a51.l lVar9 = new a51.l(hVar2, dVar7, m0Var19, gVar11, 11);
                                    mVar9.K(lVar9);
                                    objQ40 = lVar9;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar10 = new a51.l(hVar2, dVar7, m0Var19, gVar11, 11);
                                        mVar9.K(lVar10);
                                        objQ40 = lVar10;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar9.r(m0Var19);
                                Object objQ41 = mVar9.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var19, i24);
                                    mVar9.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var19, i24);
                                        mVar9.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar9.B(gVar11);
                                Object objQ42 = mVar9.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar9.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar9.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar9, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar3, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar10.B(c1411b);
                                Object objQ43 = mVar10.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar10.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar10.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar10.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar10);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar24);
                                mVar10.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar10.B(c1411b) | mVar10.r(m0Var8) | mVar10.B(gVar3);
                                Object objQ44 = mVar10.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar10.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar10.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar10, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar), mVar, ((iB >> 3) & 14) | 384);
                break;
            case 1:
                final lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iB2 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                final int i19 = 2;
                d1.a(vVar2, m0Var, z3.f.c(1936773304, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar3;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i110 = i19;
                        int i24 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i25 = 6;
                        lc.v vVar4 = vVar2;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i26 = 0;
                        switch (i110) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar3 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var3 = p3.n.f135158a;
                                Object objQ = mVar3.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar3);
                                    mVar3.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar4, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar3).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar3.C(-1094460174);
                                    mVar3.f();
                                    gVar4.invoke();
                                } else {
                                    mVar3.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar3, R.string.generic_error_message);
                                    boolean zR = mVar3.r(rVar);
                                    Object objQ2 = mVar3.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar3.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar3.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar3);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar3, 0), aVar5);
                                    mVar3.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar3).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar3.r(dVar) | mVar3.r(rVar) | mVar3.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar3.r(m0Var9) | mVar3.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar3.B(feVar)) || (iIntValue & 48) == 32) | mVar3.B(strQ);
                                    Object objQ3 = mVar3.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar3.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar3, (iIntValue << 3) & 896);
                                    mVar3.f();
                                }
                                p3.x1 x1Var4 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar4 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar5 = vVar2;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar5, dVarB);
                                boolean zR4 = mVar4.r(aVar7);
                                Object objQ4 = mVar4.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar4.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar4.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar4.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar4);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar8);
                                mVar4.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar5, "foodUpdatedResult", null, mVar4);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar4.B(p1VarN) | mVar4.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar4.r(m0Var10) | mVar4.r(vVar5);
                                Object objQ5 = mVar4.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar5, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar4.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar5, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar4.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar4);
                                boolean zR6 = mVar4.r(aVar7) | mVar4.r(dVar2) | mVar4.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar4.B(gVar5);
                                Object objQ6 = mVar4.q();
                                if (zB2) {
                                    lc.m0 m0Var12 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var12;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar4.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var13 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var13;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar4.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar4.r(m0Var3);
                                Object objQ7 = mVar4.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar4.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar4.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar4.r(m0Var3) | mVar4.r(aVar2);
                                Object objQ8 = mVar4.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar4.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar4.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar4.r(m0Var3) | mVar4.B(gVar5);
                                Object objQ9 = mVar4.q();
                                if (zR9) {
                                    final int i28 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i28) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar4.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i29 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i29) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar4.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar4.B(gVar5);
                                Object objQ10 = mVar4.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar4.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar4.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar4, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar5 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar4, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar5.r(w0Var);
                                Object objQ11 = mVar5.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar5.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar5.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar5.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar5);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar12);
                                mVar5.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar5.r(dVar3) | mVar5.r(m0Var8) | mVar5.B(gVar3);
                                Object objQ12 = mVar5.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar5.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar5.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar5, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar6 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar4, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar6.r(cVar3) | mVar6.B(c2080b);
                                Object objQ13 = mVar6.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar6.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar6.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar6.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar6);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar6, 0), aVar13);
                                mVar6.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar6.r(cVar3) | mVar6.r(dVar4);
                                lc.m0 m0Var14 = m0Var;
                                boolean zR14 = zR13 | mVar6.r(m0Var14);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar6.B(gVar6);
                                Object objQ14 = mVar6.q();
                                if (zB4) {
                                    a51.l lVar5 = new a51.l(cVar3, dVar4, m0Var14, gVar6, 9);
                                    mVar6.K(lVar5);
                                    objQ14 = lVar5;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar6 = new a51.l(cVar3, dVar4, m0Var14, gVar6, 9);
                                        mVar6.K(lVar6);
                                        objQ14 = lVar6;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar6.r(m0Var14);
                                Object objQ15 = mVar6.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var14, 5);
                                    mVar6.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var14, 5);
                                        mVar6.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar6.B(gVar6);
                                Object objQ16 = mVar6.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar6.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar6.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar6, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar7 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar6 = vVar2;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar6, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar7.r(bVar2) | mVar7.B(aVar14);
                                Object objQ17 = mVar7.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar7.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar7.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar7.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar7);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar7, 0), aVar15);
                                mVar7.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar6, "recipeUpdatedResult", null, mVar7);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar7.B(p1VarN2) | mVar7.r(tVar3);
                                lc.m0 m0Var15 = m0Var;
                                boolean zR17 = zB6 | mVar7.r(m0Var15) | mVar7.r(vVar6);
                                Object objQ18 = mVar7.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var15, vVar6, p1VarN2, null);
                                    m0Var4 = m0Var15;
                                    mVar7.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var15, vVar6, p1VarN2, null);
                                        m0Var4 = m0Var15;
                                        mVar7.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var15;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar7);
                                boolean zR18 = mVar7.r(bVar2) | mVar7.r(dVar5) | mVar7.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar7.B(gVar7);
                                Object objQ19 = mVar7.q();
                                if (zB7) {
                                    lc.m0 m0Var16 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var16;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar7.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var17 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var17;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar7.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar7.r(m0Var5) | mVar7.B(gVar7);
                                Object objQ20 = mVar7.q();
                                if (zR19) {
                                    final int i210 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i210) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar7.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i211 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i211) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar7.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar7.r(m0Var5);
                                Object objQ21 = mVar7.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar7.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar7.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar7.r(m0Var5) | mVar7.r(bVar);
                                Object objQ22 = mVar7.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar7.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar7.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar7.B(gVar7);
                                Object objQ23 = mVar7.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar7.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar7.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar7, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar8 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar7 = vVar2;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar7, dVarB3);
                                boolean zR22 = mVar8.r(gVar8);
                                Object objQ24 = mVar8.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar8.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar8.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar8.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar8);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar8, 0), aVar18);
                                mVar8.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar7, "foodUpdatedResult", null, mVar8);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar8.B(p1VarN3) | mVar8.r(nVar);
                                lc.m0 m0Var18 = m0Var;
                                boolean zR23 = zB9 | mVar8.r(m0Var18) | mVar8.r(vVar7);
                                Object objQ25 = mVar8.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var18, vVar7, p1VarN3, null);
                                    m0Var6 = m0Var18;
                                    vVar3 = vVar7;
                                    mVar8.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var18, vVar7, p1VarN3, null);
                                        m0Var6 = m0Var18;
                                        vVar3 = vVar7;
                                        mVar8.K(objQ25);
                                    } else {
                                        vVar3 = vVar7;
                                        m0Var6 = m0Var18;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar8);
                                p3.p1 p1VarN4 = n23.j.n(vVar3, "standaloneConsumableFoodUpdatedResult", null, mVar8);
                                b11.v vVar8 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar8.B(p1VarN4) | mVar8.r(nVar) | mVar8.r(vVar3);
                                Object objQ26 = mVar8.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar3, p1VarN4, nVar, null);
                                    mVar8.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar3, p1VarN4, nVar, null);
                                        mVar8.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar8, mVar8);
                                boolean zR24 = mVar8.r(gVar8) | mVar8.r(dVar6) | mVar8.r(m0Var6);
                                lc.m0 m0Var19 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar8.B(gVar9);
                                Object objQ27 = mVar8.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var19;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar8.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var19;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar8.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var19;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar8.r(m0Var7);
                                Object objQ28 = mVar8.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar8.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar8.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar8.r(gVar2) | mVar8.r(m0Var7);
                                Object objQ29 = mVar8.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar8.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar8.K(objQ29);
                                    }
                                }
                                e23.l lVar7 = (e23.l) objQ29;
                                boolean zR27 = mVar8.r(m0Var7) | mVar8.r(gVar2);
                                Object objQ30 = mVar8.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i25, m0Var7, gVar2);
                                    mVar8.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i25, m0Var7, gVar2);
                                        mVar8.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar8.r(m0Var7) | mVar8.B(gVar9);
                                Object objQ31 = mVar8.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i26) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar8.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i26) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar8.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar8.B(gVar9);
                                Object objQ32 = mVar8.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar8.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar8.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar7, aVar19, aVar20, (e23.a) objQ32, mVar8, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar9 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar4, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar9.B(c1412b);
                                Object objQ33 = mVar9.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar9.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar9.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar9.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar9);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar21);
                                mVar9.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar4, "addedFoodResult", null, mVar9);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar9.B(p1VarN5) | mVar9.r(gVar10) | mVar9.r(vVar4);
                                Object objQ34 = mVar9.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar4, p1VarN5, gVar10, null);
                                    mVar9.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar4, p1VarN5, gVar10, null);
                                        mVar9.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar9);
                                p3.p1 p1VarN6 = n23.j.n(vVar4, "standaloneConsumableFoodUpdatedResult", null, mVar9);
                                b11.v vVar9 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar9.B(p1VarN6) | mVar9.r(gVar10) | mVar9.r(vVar4);
                                Object objQ35 = mVar9.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar4, p1VarN6, gVar10, null);
                                    mVar9.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar4, p1VarN6, gVar10, null);
                                        mVar9.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar9, mVar9);
                                boolean zB16 = mVar9.B(c1412b) | mVar9.r(m0Var8) | mVar9.B(gVar3);
                                Object objQ36 = mVar9.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar9.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar9.K(objQ36);
                                    }
                                }
                                e23.l lVar8 = (e23.l) objQ36;
                                boolean zR29 = mVar9.r(jVar2) | mVar9.r(m0Var8);
                                Object objQ37 = mVar9.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i26) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar10 = (b11.v) obj9;
                                                    vVar10.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar10, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar9.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i26) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar10 = (b11.v) obj9;
                                                        vVar10.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar10, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar9.K(objQ37);
                                    }
                                }
                                e23.l lVar9 = (e23.l) objQ37;
                                boolean zR30 = mVar9.r(jVar2) | mVar9.r(m0Var8);
                                Object objQ38 = mVar9.q();
                                if (zR30) {
                                    final int i34 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i34) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar10 = (b11.v) obj9;
                                                    vVar10.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar10, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar9.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i35 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i35) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar10 = (b11.v) obj9;
                                                        vVar10.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar10, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar9.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar8, lVar9, (e23.l) objQ38, mVar9, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar4, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar10.r(hVar2);
                                Object objQ39 = mVar10.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar10.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar10.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar10.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar10);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar22);
                                mVar10.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar10.r(hVar2) | mVar10.r(dVar7);
                                lc.m0 m0Var110 = m0Var;
                                boolean zR33 = zR32 | mVar10.r(m0Var110);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar10.B(gVar11);
                                Object objQ40 = mVar10.q();
                                if (zB17) {
                                    a51.l lVar10 = new a51.l(hVar2, dVar7, m0Var110, gVar11, 11);
                                    mVar10.K(lVar10);
                                    objQ40 = lVar10;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar11 = new a51.l(hVar2, dVar7, m0Var110, gVar11, 11);
                                        mVar10.K(lVar11);
                                        objQ40 = lVar11;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar10.r(m0Var110);
                                Object objQ41 = mVar10.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var110, i24);
                                    mVar10.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var110, i24);
                                        mVar10.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar10.B(gVar11);
                                Object objQ42 = mVar10.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar10.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar10.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar10, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar11 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar4, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar11.B(c1411b);
                                Object objQ43 = mVar11.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar11.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar11.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar24);
                                mVar11.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar11.B(c1411b) | mVar11.r(m0Var8) | mVar11.B(gVar3);
                                Object objQ44 = mVar11.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar11.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar11.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar11, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar2), mVar2, ((iB2 >> 3) & 14) | 384);
                break;
            case 2:
                final lc.v vVar3 = (lc.v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                int iB3 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar3);
                p3.x1 x1Var3 = p3.n.f135158a;
                d1.a(vVar3, m0Var, z3.f.c(1478137785, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar4;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i110 = i15;
                        int i24 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i25 = 6;
                        lc.v vVar5 = vVar3;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i26 = 0;
                        switch (i110) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar4 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var4 = p3.n.f135158a;
                                Object objQ = mVar4.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar4);
                                    mVar4.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar5, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar4).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar4.C(-1094460174);
                                    mVar4.f();
                                    gVar4.invoke();
                                } else {
                                    mVar4.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar4, R.string.generic_error_message);
                                    boolean zR = mVar4.r(rVar);
                                    Object objQ2 = mVar4.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar4.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar4.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar4);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar5);
                                    mVar4.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar4).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar4.r(dVar) | mVar4.r(rVar) | mVar4.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar4.r(m0Var9) | mVar4.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar4.B(feVar)) || (iIntValue & 48) == 32) | mVar4.B(strQ);
                                    Object objQ3 = mVar4.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar4.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar4, (iIntValue << 3) & 896);
                                    mVar4.f();
                                }
                                p3.x1 x1Var5 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar5 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar6 = vVar3;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar6, dVarB);
                                boolean zR4 = mVar5.r(aVar7);
                                Object objQ4 = mVar5.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar5.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar5.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar5.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar5);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar8);
                                mVar5.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar6, "foodUpdatedResult", null, mVar5);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar5.B(p1VarN) | mVar5.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar5.r(m0Var10) | mVar5.r(vVar6);
                                Object objQ5 = mVar5.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar6, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar5.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar6, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar5.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar5);
                                boolean zR6 = mVar5.r(aVar7) | mVar5.r(dVar2) | mVar5.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar5.B(gVar5);
                                Object objQ6 = mVar5.q();
                                if (zB2) {
                                    lc.m0 m0Var13 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var13;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar5.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var14 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var14;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar5.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar5.r(m0Var3);
                                Object objQ7 = mVar5.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar5.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar5.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar5.r(m0Var3) | mVar5.r(aVar2);
                                Object objQ8 = mVar5.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar5.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar5.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar5.r(m0Var3) | mVar5.B(gVar5);
                                Object objQ9 = mVar5.q();
                                if (zR9) {
                                    final int i29 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i29) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar5.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i210 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i210) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar5.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar5.B(gVar5);
                                Object objQ10 = mVar5.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar5.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar5.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar5, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar6 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar5, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar6.r(w0Var);
                                Object objQ11 = mVar6.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar6.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar6.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar6.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar6);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar6, 0), aVar12);
                                mVar6.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar6.r(dVar3) | mVar6.r(m0Var8) | mVar6.B(gVar3);
                                Object objQ12 = mVar6.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar6.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar6.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar6, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar7 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar5, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar7.r(cVar3) | mVar7.B(c2080b);
                                Object objQ13 = mVar7.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar7.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar7.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar7.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar7);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar7, 0), aVar13);
                                mVar7.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar7.r(cVar3) | mVar7.r(dVar4);
                                lc.m0 m0Var15 = m0Var;
                                boolean zR14 = zR13 | mVar7.r(m0Var15);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar7.B(gVar6);
                                Object objQ14 = mVar7.q();
                                if (zB4) {
                                    a51.l lVar6 = new a51.l(cVar3, dVar4, m0Var15, gVar6, 9);
                                    mVar7.K(lVar6);
                                    objQ14 = lVar6;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar7 = new a51.l(cVar3, dVar4, m0Var15, gVar6, 9);
                                        mVar7.K(lVar7);
                                        objQ14 = lVar7;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar7.r(m0Var15);
                                Object objQ15 = mVar7.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var15, 5);
                                    mVar7.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var15, 5);
                                        mVar7.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar7.B(gVar6);
                                Object objQ16 = mVar7.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar7.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar7.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar7, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar8 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar7 = vVar3;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar7, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar8.r(bVar2) | mVar8.B(aVar14);
                                Object objQ17 = mVar8.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar8.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar8.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar8.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar8);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar8, 0), aVar15);
                                mVar8.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar7, "recipeUpdatedResult", null, mVar8);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar8.B(p1VarN2) | mVar8.r(tVar3);
                                lc.m0 m0Var16 = m0Var;
                                boolean zR17 = zB6 | mVar8.r(m0Var16) | mVar8.r(vVar7);
                                Object objQ18 = mVar8.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var16, vVar7, p1VarN2, null);
                                    m0Var4 = m0Var16;
                                    mVar8.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var16, vVar7, p1VarN2, null);
                                        m0Var4 = m0Var16;
                                        mVar8.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var16;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar8);
                                boolean zR18 = mVar8.r(bVar2) | mVar8.r(dVar5) | mVar8.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar8.B(gVar7);
                                Object objQ19 = mVar8.q();
                                if (zB7) {
                                    lc.m0 m0Var17 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var17;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar8.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var18 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var18;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar8.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar8.r(m0Var5) | mVar8.B(gVar7);
                                Object objQ20 = mVar8.q();
                                if (zR19) {
                                    final int i211 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i211) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar8.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i212 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i212) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar8.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar8.r(m0Var5);
                                Object objQ21 = mVar8.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar8.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar8.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar8.r(m0Var5) | mVar8.r(bVar);
                                Object objQ22 = mVar8.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar8.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar8.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar8.B(gVar7);
                                Object objQ23 = mVar8.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar8.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar8.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar8, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar9 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar8 = vVar3;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar8, dVarB3);
                                boolean zR22 = mVar9.r(gVar8);
                                Object objQ24 = mVar9.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar9.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar9.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar9.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar9);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar18);
                                mVar9.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar8, "foodUpdatedResult", null, mVar9);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar9.B(p1VarN3) | mVar9.r(nVar);
                                lc.m0 m0Var19 = m0Var;
                                boolean zR23 = zB9 | mVar9.r(m0Var19) | mVar9.r(vVar8);
                                Object objQ25 = mVar9.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var19, vVar8, p1VarN3, null);
                                    m0Var6 = m0Var19;
                                    vVar4 = vVar8;
                                    mVar9.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var19, vVar8, p1VarN3, null);
                                        m0Var6 = m0Var19;
                                        vVar4 = vVar8;
                                        mVar9.K(objQ25);
                                    } else {
                                        vVar4 = vVar8;
                                        m0Var6 = m0Var19;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar9);
                                p3.p1 p1VarN4 = n23.j.n(vVar4, "standaloneConsumableFoodUpdatedResult", null, mVar9);
                                b11.v vVar9 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar9.B(p1VarN4) | mVar9.r(nVar) | mVar9.r(vVar4);
                                Object objQ26 = mVar9.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar4, p1VarN4, nVar, null);
                                    mVar9.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar4, p1VarN4, nVar, null);
                                        mVar9.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar9, mVar9);
                                boolean zR24 = mVar9.r(gVar8) | mVar9.r(dVar6) | mVar9.r(m0Var6);
                                lc.m0 m0Var110 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar9.B(gVar9);
                                Object objQ27 = mVar9.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var110;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar9.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var110;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar9.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var110;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar9.r(m0Var7);
                                Object objQ28 = mVar9.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar9.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar9.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar9.r(gVar2) | mVar9.r(m0Var7);
                                Object objQ29 = mVar9.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar9.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar9.K(objQ29);
                                    }
                                }
                                e23.l lVar8 = (e23.l) objQ29;
                                boolean zR27 = mVar9.r(m0Var7) | mVar9.r(gVar2);
                                Object objQ30 = mVar9.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i25, m0Var7, gVar2);
                                    mVar9.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i25, m0Var7, gVar2);
                                        mVar9.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar9.r(m0Var7) | mVar9.B(gVar9);
                                Object objQ31 = mVar9.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i26) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar9.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i26) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar9.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar9.B(gVar9);
                                Object objQ32 = mVar9.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar9.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar9.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar8, aVar19, aVar20, (e23.a) objQ32, mVar9, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar5, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar10.B(c1412b);
                                Object objQ33 = mVar10.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar10.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar10.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar10.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar10);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar21);
                                mVar10.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar5, "addedFoodResult", null, mVar10);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar10.B(p1VarN5) | mVar10.r(gVar10) | mVar10.r(vVar5);
                                Object objQ34 = mVar10.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar5, p1VarN5, gVar10, null);
                                    mVar10.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar5, p1VarN5, gVar10, null);
                                        mVar10.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar10);
                                p3.p1 p1VarN6 = n23.j.n(vVar5, "standaloneConsumableFoodUpdatedResult", null, mVar10);
                                b11.v vVar10 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar10.B(p1VarN6) | mVar10.r(gVar10) | mVar10.r(vVar5);
                                Object objQ35 = mVar10.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar5, p1VarN6, gVar10, null);
                                    mVar10.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar5, p1VarN6, gVar10, null);
                                        mVar10.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar10, mVar10);
                                boolean zB16 = mVar10.B(c1412b) | mVar10.r(m0Var8) | mVar10.B(gVar3);
                                Object objQ36 = mVar10.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar10.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar10.K(objQ36);
                                    }
                                }
                                e23.l lVar9 = (e23.l) objQ36;
                                boolean zR29 = mVar10.r(jVar2) | mVar10.r(m0Var8);
                                Object objQ37 = mVar10.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i26) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar11 = (b11.v) obj9;
                                                    vVar11.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar11, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar10.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i26) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar11 = (b11.v) obj9;
                                                        vVar11.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar11, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar10.K(objQ37);
                                    }
                                }
                                e23.l lVar10 = (e23.l) objQ37;
                                boolean zR30 = mVar10.r(jVar2) | mVar10.r(m0Var8);
                                Object objQ38 = mVar10.q();
                                if (zR30) {
                                    final int i35 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i35) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar11 = (b11.v) obj9;
                                                    vVar11.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar11, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar10.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i36 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i36) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar11 = (b11.v) obj9;
                                                        vVar11.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar11, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar10.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar9, lVar10, (e23.l) objQ38, mVar10, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar11 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar5, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar11.r(hVar2);
                                Object objQ39 = mVar11.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar11.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar11.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar22);
                                mVar11.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar11.r(hVar2) | mVar11.r(dVar7);
                                lc.m0 m0Var111 = m0Var;
                                boolean zR33 = zR32 | mVar11.r(m0Var111);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar11.B(gVar11);
                                Object objQ40 = mVar11.q();
                                if (zB17) {
                                    a51.l lVar11 = new a51.l(hVar2, dVar7, m0Var111, gVar11, 11);
                                    mVar11.K(lVar11);
                                    objQ40 = lVar11;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar12 = new a51.l(hVar2, dVar7, m0Var111, gVar11, 11);
                                        mVar11.K(lVar12);
                                        objQ40 = lVar12;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar11.r(m0Var111);
                                Object objQ41 = mVar11.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var111, i24);
                                    mVar11.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var111, i24);
                                        mVar11.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar11.B(gVar11);
                                Object objQ42 = mVar11.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar11.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar11.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar11, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar12 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar5, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar12.B(c1411b);
                                Object objQ43 = mVar12.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar12.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar12.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar24);
                                mVar12.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar12.B(c1411b) | mVar12.r(m0Var8) | mVar12.B(gVar3);
                                Object objQ44 = mVar12.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar12.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar12.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar12, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar3), mVar3, ((iB3 >> 3) & 14) | 384);
                break;
            case 3:
                final lc.v vVar4 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                int iB4 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar4);
                p3.x1 x1Var4 = p3.n.f135158a;
                final int i24 = 8;
                d1.a(vVar4, m0Var, z3.f.c(1019502266, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar5;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i110 = i24;
                        int i25 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i26 = 6;
                        lc.v vVar6 = vVar4;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i27 = 0;
                        switch (i110) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar5 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var5 = p3.n.f135158a;
                                Object objQ = mVar5.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar5);
                                    mVar5.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar6, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar5).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar5.C(-1094460174);
                                    mVar5.f();
                                    gVar4.invoke();
                                } else {
                                    mVar5.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar5, R.string.generic_error_message);
                                    boolean zR = mVar5.r(rVar);
                                    Object objQ2 = mVar5.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar5.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar5.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar5);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar5);
                                    mVar5.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar5).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar5.r(dVar) | mVar5.r(rVar) | mVar5.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar5.r(m0Var9) | mVar5.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar5.B(feVar)) || (iIntValue & 48) == 32) | mVar5.B(strQ);
                                    Object objQ3 = mVar5.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar5.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar5, (iIntValue << 3) & 896);
                                    mVar5.f();
                                }
                                p3.x1 x1Var6 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar6 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar7 = vVar4;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar7, dVarB);
                                boolean zR4 = mVar6.r(aVar7);
                                Object objQ4 = mVar6.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar6.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar6.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar6.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar6);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar6, 0), aVar8);
                                mVar6.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar7, "foodUpdatedResult", null, mVar6);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar6.B(p1VarN) | mVar6.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar6.r(m0Var10) | mVar6.r(vVar7);
                                Object objQ5 = mVar6.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar7, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar6.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar7, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar6.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar6);
                                boolean zR6 = mVar6.r(aVar7) | mVar6.r(dVar2) | mVar6.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar6.B(gVar5);
                                Object objQ6 = mVar6.q();
                                if (zB2) {
                                    lc.m0 m0Var14 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var14;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar6.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var15 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var15;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar6.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar6.r(m0Var3);
                                Object objQ7 = mVar6.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar6.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar6.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar6.r(m0Var3) | mVar6.r(aVar2);
                                Object objQ8 = mVar6.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar6.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar6.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar6.r(m0Var3) | mVar6.B(gVar5);
                                Object objQ9 = mVar6.q();
                                if (zR9) {
                                    final int i210 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i210) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar6.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i211 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i211) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar6.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar6.B(gVar5);
                                Object objQ10 = mVar6.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar6.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar6.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar6, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar7 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar6, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar7.r(w0Var);
                                Object objQ11 = mVar7.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar7.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar7.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar7.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar7);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar7, 0), aVar12);
                                mVar7.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar7.r(dVar3) | mVar7.r(m0Var8) | mVar7.B(gVar3);
                                Object objQ12 = mVar7.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar7.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar7.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar7, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar8 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar6, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar8.r(cVar3) | mVar8.B(c2080b);
                                Object objQ13 = mVar8.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar8.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar8.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar8.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar8);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar8, 0), aVar13);
                                mVar8.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar8.r(cVar3) | mVar8.r(dVar4);
                                lc.m0 m0Var16 = m0Var;
                                boolean zR14 = zR13 | mVar8.r(m0Var16);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar8.B(gVar6);
                                Object objQ14 = mVar8.q();
                                if (zB4) {
                                    a51.l lVar7 = new a51.l(cVar3, dVar4, m0Var16, gVar6, 9);
                                    mVar8.K(lVar7);
                                    objQ14 = lVar7;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar8 = new a51.l(cVar3, dVar4, m0Var16, gVar6, 9);
                                        mVar8.K(lVar8);
                                        objQ14 = lVar8;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar8.r(m0Var16);
                                Object objQ15 = mVar8.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var16, 5);
                                    mVar8.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var16, 5);
                                        mVar8.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar8.B(gVar6);
                                Object objQ16 = mVar8.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar8.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar8.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar8, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar9 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar8 = vVar4;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar8, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar9.r(bVar2) | mVar9.B(aVar14);
                                Object objQ17 = mVar9.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar9.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar9.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar9.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar9);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar15);
                                mVar9.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar8, "recipeUpdatedResult", null, mVar9);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar9.B(p1VarN2) | mVar9.r(tVar3);
                                lc.m0 m0Var17 = m0Var;
                                boolean zR17 = zB6 | mVar9.r(m0Var17) | mVar9.r(vVar8);
                                Object objQ18 = mVar9.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var17, vVar8, p1VarN2, null);
                                    m0Var4 = m0Var17;
                                    mVar9.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var17, vVar8, p1VarN2, null);
                                        m0Var4 = m0Var17;
                                        mVar9.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var17;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar9);
                                boolean zR18 = mVar9.r(bVar2) | mVar9.r(dVar5) | mVar9.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar9.B(gVar7);
                                Object objQ19 = mVar9.q();
                                if (zB7) {
                                    lc.m0 m0Var18 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var18;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar9.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var19 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var19;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar9.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar9.r(m0Var5) | mVar9.B(gVar7);
                                Object objQ20 = mVar9.q();
                                if (zR19) {
                                    final int i212 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i212) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar9.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i213 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i213) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar9.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar9.r(m0Var5);
                                Object objQ21 = mVar9.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar9.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar9.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar9.r(m0Var5) | mVar9.r(bVar);
                                Object objQ22 = mVar9.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar9.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar9.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar9.B(gVar7);
                                Object objQ23 = mVar9.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar9.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar9.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar9, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar9 = vVar4;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar9, dVarB3);
                                boolean zR22 = mVar10.r(gVar8);
                                Object objQ24 = mVar10.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar10.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar10.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar10.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar10);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar18);
                                mVar10.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar9, "foodUpdatedResult", null, mVar10);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar10.B(p1VarN3) | mVar10.r(nVar);
                                lc.m0 m0Var110 = m0Var;
                                boolean zR23 = zB9 | mVar10.r(m0Var110) | mVar10.r(vVar9);
                                Object objQ25 = mVar10.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var110, vVar9, p1VarN3, null);
                                    m0Var6 = m0Var110;
                                    vVar5 = vVar9;
                                    mVar10.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var110, vVar9, p1VarN3, null);
                                        m0Var6 = m0Var110;
                                        vVar5 = vVar9;
                                        mVar10.K(objQ25);
                                    } else {
                                        vVar5 = vVar9;
                                        m0Var6 = m0Var110;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar10);
                                p3.p1 p1VarN4 = n23.j.n(vVar5, "standaloneConsumableFoodUpdatedResult", null, mVar10);
                                b11.v vVar10 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar10.B(p1VarN4) | mVar10.r(nVar) | mVar10.r(vVar5);
                                Object objQ26 = mVar10.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar5, p1VarN4, nVar, null);
                                    mVar10.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar5, p1VarN4, nVar, null);
                                        mVar10.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar10, mVar10);
                                boolean zR24 = mVar10.r(gVar8) | mVar10.r(dVar6) | mVar10.r(m0Var6);
                                lc.m0 m0Var111 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar10.B(gVar9);
                                Object objQ27 = mVar10.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var111;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar10.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var111;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar10.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var111;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar10.r(m0Var7);
                                Object objQ28 = mVar10.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar10.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar10.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar10.r(gVar2) | mVar10.r(m0Var7);
                                Object objQ29 = mVar10.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar10.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar10.K(objQ29);
                                    }
                                }
                                e23.l lVar9 = (e23.l) objQ29;
                                boolean zR27 = mVar10.r(m0Var7) | mVar10.r(gVar2);
                                Object objQ30 = mVar10.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i26, m0Var7, gVar2);
                                    mVar10.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i26, m0Var7, gVar2);
                                        mVar10.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar10.r(m0Var7) | mVar10.B(gVar9);
                                Object objQ31 = mVar10.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i27) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar10.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i27) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar10.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar10.B(gVar9);
                                Object objQ32 = mVar10.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar10.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar10.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar9, aVar19, aVar20, (e23.a) objQ32, mVar10, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar11 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar6, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar11.B(c1412b);
                                Object objQ33 = mVar11.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar11.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar11.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar21);
                                mVar11.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar6, "addedFoodResult", null, mVar11);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar11.B(p1VarN5) | mVar11.r(gVar10) | mVar11.r(vVar6);
                                Object objQ34 = mVar11.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar6, p1VarN5, gVar10, null);
                                    mVar11.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar6, p1VarN5, gVar10, null);
                                        mVar11.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar11);
                                p3.p1 p1VarN6 = n23.j.n(vVar6, "standaloneConsumableFoodUpdatedResult", null, mVar11);
                                b11.v vVar11 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar11.B(p1VarN6) | mVar11.r(gVar10) | mVar11.r(vVar6);
                                Object objQ35 = mVar11.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar6, p1VarN6, gVar10, null);
                                    mVar11.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar6, p1VarN6, gVar10, null);
                                        mVar11.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar11, mVar11);
                                boolean zB16 = mVar11.B(c1412b) | mVar11.r(m0Var8) | mVar11.B(gVar3);
                                Object objQ36 = mVar11.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar11.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar11.K(objQ36);
                                    }
                                }
                                e23.l lVar10 = (e23.l) objQ36;
                                boolean zR29 = mVar11.r(jVar2) | mVar11.r(m0Var8);
                                Object objQ37 = mVar11.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i27) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar12 = (b11.v) obj9;
                                                    vVar12.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar12, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i27) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar12 = (b11.v) obj9;
                                                        vVar12.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar12, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ37);
                                    }
                                }
                                e23.l lVar11 = (e23.l) objQ37;
                                boolean zR30 = mVar11.r(jVar2) | mVar11.r(m0Var8);
                                Object objQ38 = mVar11.q();
                                if (zR30) {
                                    final int i36 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i36) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar12 = (b11.v) obj9;
                                                    vVar12.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar12, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i37 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i37) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar12 = (b11.v) obj9;
                                                        vVar12.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar12, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar10, lVar11, (e23.l) objQ38, mVar11, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar12 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar6, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar12.r(hVar2);
                                Object objQ39 = mVar12.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar12.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar12.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar22);
                                mVar12.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar12.r(hVar2) | mVar12.r(dVar7);
                                lc.m0 m0Var112 = m0Var;
                                boolean zR33 = zR32 | mVar12.r(m0Var112);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar12.B(gVar11);
                                Object objQ40 = mVar12.q();
                                if (zB17) {
                                    a51.l lVar12 = new a51.l(hVar2, dVar7, m0Var112, gVar11, 11);
                                    mVar12.K(lVar12);
                                    objQ40 = lVar12;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar13 = new a51.l(hVar2, dVar7, m0Var112, gVar11, 11);
                                        mVar12.K(lVar13);
                                        objQ40 = lVar13;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar12.r(m0Var112);
                                Object objQ41 = mVar12.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var112, i25);
                                    mVar12.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var112, i25);
                                        mVar12.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar12.B(gVar11);
                                Object objQ42 = mVar12.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar12.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar12.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar12, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar13 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var14 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar6, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar13.B(c1411b);
                                Object objQ43 = mVar13.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar13.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar13.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar13.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar13);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar13, 0), aVar24);
                                mVar13.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar13.B(c1411b) | mVar13.r(m0Var8) | mVar13.B(gVar3);
                                Object objQ44 = mVar13.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar13.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar13.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar13, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar4), mVar4, ((iB4 >> 3) & 14) | 384);
                break;
            case 4:
                final lc.v vVar5 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                int iB5 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar5);
                p3.x1 x1Var5 = p3.n.f135158a;
                final int i25 = 6;
                d1.a(vVar5, m0Var, z3.f.c(560866747, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar6;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i110 = i25;
                        int i26 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i27 = 6;
                        lc.v vVar7 = vVar5;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i28 = 0;
                        switch (i110) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar6 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var6 = p3.n.f135158a;
                                Object objQ = mVar6.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar6);
                                    mVar6.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar7, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar6).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar6.C(-1094460174);
                                    mVar6.f();
                                    gVar4.invoke();
                                } else {
                                    mVar6.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar6, R.string.generic_error_message);
                                    boolean zR = mVar6.r(rVar);
                                    Object objQ2 = mVar6.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar6.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar6.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar6);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar6, 0), aVar5);
                                    mVar6.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar6).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar6.r(dVar) | mVar6.r(rVar) | mVar6.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar6.r(m0Var9) | mVar6.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar6.B(feVar)) || (iIntValue & 48) == 32) | mVar6.B(strQ);
                                    Object objQ3 = mVar6.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar6.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar6, (iIntValue << 3) & 896);
                                    mVar6.f();
                                }
                                p3.x1 x1Var7 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar7 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar8 = vVar5;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar8, dVarB);
                                boolean zR4 = mVar7.r(aVar7);
                                Object objQ4 = mVar7.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar7.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar7.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar7.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar7);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar7, 0), aVar8);
                                mVar7.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar8, "foodUpdatedResult", null, mVar7);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar7.B(p1VarN) | mVar7.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar7.r(m0Var10) | mVar7.r(vVar8);
                                Object objQ5 = mVar7.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar8, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar7.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar8, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar7.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar7);
                                boolean zR6 = mVar7.r(aVar7) | mVar7.r(dVar2) | mVar7.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar7.B(gVar5);
                                Object objQ6 = mVar7.q();
                                if (zB2) {
                                    lc.m0 m0Var15 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var15;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar7.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var16 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var16;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar7.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar7.r(m0Var3);
                                Object objQ7 = mVar7.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar7.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar7.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar7.r(m0Var3) | mVar7.r(aVar2);
                                Object objQ8 = mVar7.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar7.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar7.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar7.r(m0Var3) | mVar7.B(gVar5);
                                Object objQ9 = mVar7.q();
                                if (zR9) {
                                    final int i211 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i211) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar7.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i212 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i212) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar7.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar7.B(gVar5);
                                Object objQ10 = mVar7.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar7.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar7.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar7, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar8 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar7, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar8.r(w0Var);
                                Object objQ11 = mVar8.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar8.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar8.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar8.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar8);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar8, 0), aVar12);
                                mVar8.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar8.r(dVar3) | mVar8.r(m0Var8) | mVar8.B(gVar3);
                                Object objQ12 = mVar8.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar8.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar8.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar8, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar9 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar7, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar9.r(cVar3) | mVar9.B(c2080b);
                                Object objQ13 = mVar9.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar9.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar9.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar9.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar9);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar13);
                                mVar9.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar9.r(cVar3) | mVar9.r(dVar4);
                                lc.m0 m0Var17 = m0Var;
                                boolean zR14 = zR13 | mVar9.r(m0Var17);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar9.B(gVar6);
                                Object objQ14 = mVar9.q();
                                if (zB4) {
                                    a51.l lVar8 = new a51.l(cVar3, dVar4, m0Var17, gVar6, 9);
                                    mVar9.K(lVar8);
                                    objQ14 = lVar8;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar9 = new a51.l(cVar3, dVar4, m0Var17, gVar6, 9);
                                        mVar9.K(lVar9);
                                        objQ14 = lVar9;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar9.r(m0Var17);
                                Object objQ15 = mVar9.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var17, 5);
                                    mVar9.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var17, 5);
                                        mVar9.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar9.B(gVar6);
                                Object objQ16 = mVar9.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar9.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar9.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar9, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar9 = vVar5;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar9, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar10.r(bVar2) | mVar10.B(aVar14);
                                Object objQ17 = mVar10.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar10.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar10.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar10.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar10);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar15);
                                mVar10.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar9, "recipeUpdatedResult", null, mVar10);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar10.B(p1VarN2) | mVar10.r(tVar3);
                                lc.m0 m0Var18 = m0Var;
                                boolean zR17 = zB6 | mVar10.r(m0Var18) | mVar10.r(vVar9);
                                Object objQ18 = mVar10.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var18, vVar9, p1VarN2, null);
                                    m0Var4 = m0Var18;
                                    mVar10.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var18, vVar9, p1VarN2, null);
                                        m0Var4 = m0Var18;
                                        mVar10.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var18;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar10);
                                boolean zR18 = mVar10.r(bVar2) | mVar10.r(dVar5) | mVar10.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar10.B(gVar7);
                                Object objQ19 = mVar10.q();
                                if (zB7) {
                                    lc.m0 m0Var19 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var19;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar10.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var110 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var110;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar10.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar10.r(m0Var5) | mVar10.B(gVar7);
                                Object objQ20 = mVar10.q();
                                if (zR19) {
                                    final int i213 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i213) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar10.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i214 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i214) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar10.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar10.r(m0Var5);
                                Object objQ21 = mVar10.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar10.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar10.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar10.r(m0Var5) | mVar10.r(bVar);
                                Object objQ22 = mVar10.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar10.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar10.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar10.B(gVar7);
                                Object objQ23 = mVar10.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar10.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar10.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar10, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar11 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar10 = vVar5;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar10, dVarB3);
                                boolean zR22 = mVar11.r(gVar8);
                                Object objQ24 = mVar11.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar11.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar11.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar18);
                                mVar11.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar10, "foodUpdatedResult", null, mVar11);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar11.B(p1VarN3) | mVar11.r(nVar);
                                lc.m0 m0Var111 = m0Var;
                                boolean zR23 = zB9 | mVar11.r(m0Var111) | mVar11.r(vVar10);
                                Object objQ25 = mVar11.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var111, vVar10, p1VarN3, null);
                                    m0Var6 = m0Var111;
                                    vVar6 = vVar10;
                                    mVar11.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var111, vVar10, p1VarN3, null);
                                        m0Var6 = m0Var111;
                                        vVar6 = vVar10;
                                        mVar11.K(objQ25);
                                    } else {
                                        vVar6 = vVar10;
                                        m0Var6 = m0Var111;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar11);
                                p3.p1 p1VarN4 = n23.j.n(vVar6, "standaloneConsumableFoodUpdatedResult", null, mVar11);
                                b11.v vVar11 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar11.B(p1VarN4) | mVar11.r(nVar) | mVar11.r(vVar6);
                                Object objQ26 = mVar11.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar6, p1VarN4, nVar, null);
                                    mVar11.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar6, p1VarN4, nVar, null);
                                        mVar11.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar11, mVar11);
                                boolean zR24 = mVar11.r(gVar8) | mVar11.r(dVar6) | mVar11.r(m0Var6);
                                lc.m0 m0Var112 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar11.B(gVar9);
                                Object objQ27 = mVar11.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var112;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar11.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var112;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar11.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var112;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar11.r(m0Var7);
                                Object objQ28 = mVar11.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar11.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar11.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar11.r(gVar2) | mVar11.r(m0Var7);
                                Object objQ29 = mVar11.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar11.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar11.K(objQ29);
                                    }
                                }
                                e23.l lVar10 = (e23.l) objQ29;
                                boolean zR27 = mVar11.r(m0Var7) | mVar11.r(gVar2);
                                Object objQ30 = mVar11.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i27, m0Var7, gVar2);
                                    mVar11.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i27, m0Var7, gVar2);
                                        mVar11.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar11.r(m0Var7) | mVar11.B(gVar9);
                                Object objQ31 = mVar11.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i28) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i28) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar11.B(gVar9);
                                Object objQ32 = mVar11.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar11.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar11.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar10, aVar19, aVar20, (e23.a) objQ32, mVar11, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar12 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar7, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar12.B(c1412b);
                                Object objQ33 = mVar12.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar12.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar12.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar21);
                                mVar12.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar7, "addedFoodResult", null, mVar12);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar12.B(p1VarN5) | mVar12.r(gVar10) | mVar12.r(vVar7);
                                Object objQ34 = mVar12.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar7, p1VarN5, gVar10, null);
                                    mVar12.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar7, p1VarN5, gVar10, null);
                                        mVar12.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar12);
                                p3.p1 p1VarN6 = n23.j.n(vVar7, "standaloneConsumableFoodUpdatedResult", null, mVar12);
                                b11.v vVar12 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar12.B(p1VarN6) | mVar12.r(gVar10) | mVar12.r(vVar7);
                                Object objQ35 = mVar12.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar7, p1VarN6, gVar10, null);
                                    mVar12.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar7, p1VarN6, gVar10, null);
                                        mVar12.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar12, mVar12);
                                boolean zB16 = mVar12.B(c1412b) | mVar12.r(m0Var8) | mVar12.B(gVar3);
                                Object objQ36 = mVar12.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar12.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar12.K(objQ36);
                                    }
                                }
                                e23.l lVar11 = (e23.l) objQ36;
                                boolean zR29 = mVar12.r(jVar2) | mVar12.r(m0Var8);
                                Object objQ37 = mVar12.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i28) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar13 = (b11.v) obj9;
                                                    vVar13.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar13, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i28) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar13 = (b11.v) obj9;
                                                        vVar13.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar13, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ37);
                                    }
                                }
                                e23.l lVar12 = (e23.l) objQ37;
                                boolean zR30 = mVar12.r(jVar2) | mVar12.r(m0Var8);
                                Object objQ38 = mVar12.q();
                                if (zR30) {
                                    final int i37 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i37) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar13 = (b11.v) obj9;
                                                    vVar13.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar13, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i38 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i38) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar13 = (b11.v) obj9;
                                                        vVar13.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar13, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar11, lVar12, (e23.l) objQ38, mVar12, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar13 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var14 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar7, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar13.r(hVar2);
                                Object objQ39 = mVar13.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar13.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar13.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar13.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar13);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar13, 0), aVar22);
                                mVar13.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar13.r(hVar2) | mVar13.r(dVar7);
                                lc.m0 m0Var113 = m0Var;
                                boolean zR33 = zR32 | mVar13.r(m0Var113);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar13.B(gVar11);
                                Object objQ40 = mVar13.q();
                                if (zB17) {
                                    a51.l lVar13 = new a51.l(hVar2, dVar7, m0Var113, gVar11, 11);
                                    mVar13.K(lVar13);
                                    objQ40 = lVar13;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar14 = new a51.l(hVar2, dVar7, m0Var113, gVar11, 11);
                                        mVar13.K(lVar14);
                                        objQ40 = lVar14;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar13.r(m0Var113);
                                Object objQ41 = mVar13.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var113, i26);
                                    mVar13.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var113, i26);
                                        mVar13.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar13.B(gVar11);
                                Object objQ42 = mVar13.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar13.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar13.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar13, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar14 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var15 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar7, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar14.B(c1411b);
                                Object objQ43 = mVar14.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar14.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar14.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar14.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar14);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar14, 0), aVar24);
                                mVar14.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar14.B(c1411b) | mVar14.r(m0Var8) | mVar14.B(gVar3);
                                Object objQ44 = mVar14.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar14.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar14.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar14, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar5), mVar5, ((iB5 >> 3) & 14) | 384);
                break;
            case 5:
                final lc.v vVar6 = (lc.v) obj2;
                p3.m mVar6 = (p3.m) obj3;
                int iB6 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar6);
                p3.x1 x1Var6 = p3.n.f135158a;
                final int i26 = 5;
                d1.a(vVar6, m0Var, z3.f.c(102231228, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar7;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i110 = i26;
                        int i27 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i28 = 6;
                        lc.v vVar8 = vVar6;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i29 = 0;
                        switch (i110) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar7 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var7 = p3.n.f135158a;
                                Object objQ = mVar7.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar7);
                                    mVar7.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar8, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar7).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar7.C(-1094460174);
                                    mVar7.f();
                                    gVar4.invoke();
                                } else {
                                    mVar7.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar7, R.string.generic_error_message);
                                    boolean zR = mVar7.r(rVar);
                                    Object objQ2 = mVar7.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar7.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar7.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar7);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar7, 0), aVar5);
                                    mVar7.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar7).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar7.r(dVar) | mVar7.r(rVar) | mVar7.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar7.r(m0Var9) | mVar7.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar7.B(feVar)) || (iIntValue & 48) == 32) | mVar7.B(strQ);
                                    Object objQ3 = mVar7.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar7.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar7, (iIntValue << 3) & 896);
                                    mVar7.f();
                                }
                                p3.x1 x1Var8 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar8 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar9 = vVar6;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar9, dVarB);
                                boolean zR4 = mVar8.r(aVar7);
                                Object objQ4 = mVar8.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar8.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar8.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar8.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar8);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar8, 0), aVar8);
                                mVar8.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar9, "foodUpdatedResult", null, mVar8);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar8.B(p1VarN) | mVar8.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar8.r(m0Var10) | mVar8.r(vVar9);
                                Object objQ5 = mVar8.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar9, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar8.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar9, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar8.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar8);
                                boolean zR6 = mVar8.r(aVar7) | mVar8.r(dVar2) | mVar8.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar8.B(gVar5);
                                Object objQ6 = mVar8.q();
                                if (zB2) {
                                    lc.m0 m0Var16 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var16;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar8.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var17 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var17;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar8.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar8.r(m0Var3);
                                Object objQ7 = mVar8.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar8.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar8.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar8.r(m0Var3) | mVar8.r(aVar2);
                                Object objQ8 = mVar8.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar8.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar8.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar8.r(m0Var3) | mVar8.B(gVar5);
                                Object objQ9 = mVar8.q();
                                if (zR9) {
                                    final int i212 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i212) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar8.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i213 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i213) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar8.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar8.B(gVar5);
                                Object objQ10 = mVar8.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar8.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar8.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar8, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar9 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar8, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar9.r(w0Var);
                                Object objQ11 = mVar9.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar9.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar9.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar9.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar9);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar12);
                                mVar9.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar9.r(dVar3) | mVar9.r(m0Var8) | mVar9.B(gVar3);
                                Object objQ12 = mVar9.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar9.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar9.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar9, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar8, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar10.r(cVar3) | mVar10.B(c2080b);
                                Object objQ13 = mVar10.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar10.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar10.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar10.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar10);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar13);
                                mVar10.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar10.r(cVar3) | mVar10.r(dVar4);
                                lc.m0 m0Var18 = m0Var;
                                boolean zR14 = zR13 | mVar10.r(m0Var18);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar10.B(gVar6);
                                Object objQ14 = mVar10.q();
                                if (zB4) {
                                    a51.l lVar9 = new a51.l(cVar3, dVar4, m0Var18, gVar6, 9);
                                    mVar10.K(lVar9);
                                    objQ14 = lVar9;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar10 = new a51.l(cVar3, dVar4, m0Var18, gVar6, 9);
                                        mVar10.K(lVar10);
                                        objQ14 = lVar10;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar10.r(m0Var18);
                                Object objQ15 = mVar10.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var18, 5);
                                    mVar10.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var18, 5);
                                        mVar10.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar10.B(gVar6);
                                Object objQ16 = mVar10.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar10.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar10.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar10, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar11 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar10 = vVar6;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar10, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar11.r(bVar2) | mVar11.B(aVar14);
                                Object objQ17 = mVar11.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar11.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar11.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar15);
                                mVar11.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar10, "recipeUpdatedResult", null, mVar11);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar11.B(p1VarN2) | mVar11.r(tVar3);
                                lc.m0 m0Var19 = m0Var;
                                boolean zR17 = zB6 | mVar11.r(m0Var19) | mVar11.r(vVar10);
                                Object objQ18 = mVar11.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var19, vVar10, p1VarN2, null);
                                    m0Var4 = m0Var19;
                                    mVar11.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var19, vVar10, p1VarN2, null);
                                        m0Var4 = m0Var19;
                                        mVar11.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var19;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar11);
                                boolean zR18 = mVar11.r(bVar2) | mVar11.r(dVar5) | mVar11.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar11.B(gVar7);
                                Object objQ19 = mVar11.q();
                                if (zB7) {
                                    lc.m0 m0Var110 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var110;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar11.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var111 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var111;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar11.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar11.r(m0Var5) | mVar11.B(gVar7);
                                Object objQ20 = mVar11.q();
                                if (zR19) {
                                    final int i214 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i214) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i215 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i215) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar11.r(m0Var5);
                                Object objQ21 = mVar11.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar11.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar11.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar11.r(m0Var5) | mVar11.r(bVar);
                                Object objQ22 = mVar11.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar11.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar11.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar11.B(gVar7);
                                Object objQ23 = mVar11.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar11.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar11.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar11, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar12 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar11 = vVar6;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar11, dVarB3);
                                boolean zR22 = mVar12.r(gVar8);
                                Object objQ24 = mVar12.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar12.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar12.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar18);
                                mVar12.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar11, "foodUpdatedResult", null, mVar12);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar12.B(p1VarN3) | mVar12.r(nVar);
                                lc.m0 m0Var112 = m0Var;
                                boolean zR23 = zB9 | mVar12.r(m0Var112) | mVar12.r(vVar11);
                                Object objQ25 = mVar12.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var112, vVar11, p1VarN3, null);
                                    m0Var6 = m0Var112;
                                    vVar7 = vVar11;
                                    mVar12.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var112, vVar11, p1VarN3, null);
                                        m0Var6 = m0Var112;
                                        vVar7 = vVar11;
                                        mVar12.K(objQ25);
                                    } else {
                                        vVar7 = vVar11;
                                        m0Var6 = m0Var112;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar12);
                                p3.p1 p1VarN4 = n23.j.n(vVar7, "standaloneConsumableFoodUpdatedResult", null, mVar12);
                                b11.v vVar12 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar12.B(p1VarN4) | mVar12.r(nVar) | mVar12.r(vVar7);
                                Object objQ26 = mVar12.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar7, p1VarN4, nVar, null);
                                    mVar12.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar7, p1VarN4, nVar, null);
                                        mVar12.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar12, mVar12);
                                boolean zR24 = mVar12.r(gVar8) | mVar12.r(dVar6) | mVar12.r(m0Var6);
                                lc.m0 m0Var113 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar12.B(gVar9);
                                Object objQ27 = mVar12.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var113;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar12.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var113;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar12.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var113;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar12.r(m0Var7);
                                Object objQ28 = mVar12.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar12.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar12.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar12.r(gVar2) | mVar12.r(m0Var7);
                                Object objQ29 = mVar12.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar12.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar12.K(objQ29);
                                    }
                                }
                                e23.l lVar11 = (e23.l) objQ29;
                                boolean zR27 = mVar12.r(m0Var7) | mVar12.r(gVar2);
                                Object objQ30 = mVar12.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i28, m0Var7, gVar2);
                                    mVar12.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i28, m0Var7, gVar2);
                                        mVar12.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar12.r(m0Var7) | mVar12.B(gVar9);
                                Object objQ31 = mVar12.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i29) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i29) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar12.B(gVar9);
                                Object objQ32 = mVar12.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar12.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar12.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar11, aVar19, aVar20, (e23.a) objQ32, mVar12, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar13 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var14 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar8, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar13.B(c1412b);
                                Object objQ33 = mVar13.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar13.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar13.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar13.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar13);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar13, 0), aVar21);
                                mVar13.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar8, "addedFoodResult", null, mVar13);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar13.B(p1VarN5) | mVar13.r(gVar10) | mVar13.r(vVar8);
                                Object objQ34 = mVar13.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar8, p1VarN5, gVar10, null);
                                    mVar13.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar8, p1VarN5, gVar10, null);
                                        mVar13.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar13);
                                p3.p1 p1VarN6 = n23.j.n(vVar8, "standaloneConsumableFoodUpdatedResult", null, mVar13);
                                b11.v vVar13 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar13.B(p1VarN6) | mVar13.r(gVar10) | mVar13.r(vVar8);
                                Object objQ35 = mVar13.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar8, p1VarN6, gVar10, null);
                                    mVar13.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar8, p1VarN6, gVar10, null);
                                        mVar13.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar13, mVar13);
                                boolean zB16 = mVar13.B(c1412b) | mVar13.r(m0Var8) | mVar13.B(gVar3);
                                Object objQ36 = mVar13.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar13.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar13.K(objQ36);
                                    }
                                }
                                e23.l lVar12 = (e23.l) objQ36;
                                boolean zR29 = mVar13.r(jVar2) | mVar13.r(m0Var8);
                                Object objQ37 = mVar13.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i29) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar14 = (b11.v) obj9;
                                                    vVar14.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar14, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar13.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i29) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar14 = (b11.v) obj9;
                                                        vVar14.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar14, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar13.K(objQ37);
                                    }
                                }
                                e23.l lVar13 = (e23.l) objQ37;
                                boolean zR30 = mVar13.r(jVar2) | mVar13.r(m0Var8);
                                Object objQ38 = mVar13.q();
                                if (zR30) {
                                    final int i38 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i38) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar14 = (b11.v) obj9;
                                                    vVar14.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar14, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar13.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i39 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i39) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar14 = (b11.v) obj9;
                                                        vVar14.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar14, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar13.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar12, lVar13, (e23.l) objQ38, mVar13, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar14 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var15 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar8, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar14.r(hVar2);
                                Object objQ39 = mVar14.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar14.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar14.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar14.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar14);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar14, 0), aVar22);
                                mVar14.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar14.r(hVar2) | mVar14.r(dVar7);
                                lc.m0 m0Var114 = m0Var;
                                boolean zR33 = zR32 | mVar14.r(m0Var114);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar14.B(gVar11);
                                Object objQ40 = mVar14.q();
                                if (zB17) {
                                    a51.l lVar14 = new a51.l(hVar2, dVar7, m0Var114, gVar11, 11);
                                    mVar14.K(lVar14);
                                    objQ40 = lVar14;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar15 = new a51.l(hVar2, dVar7, m0Var114, gVar11, 11);
                                        mVar14.K(lVar15);
                                        objQ40 = lVar15;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar14.r(m0Var114);
                                Object objQ41 = mVar14.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var114, i27);
                                    mVar14.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var114, i27);
                                        mVar14.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar14.B(gVar11);
                                Object objQ42 = mVar14.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar14.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar14.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar14, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar15 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var16 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar8, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar15.B(c1411b);
                                Object objQ43 = mVar15.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar15.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar15.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar15.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar15);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar15, 0), aVar24);
                                mVar15.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar15.B(c1411b) | mVar15.r(m0Var8) | mVar15.B(gVar3);
                                Object objQ44 = mVar15.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar15.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar15.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar15, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar6), mVar6, ((iB6 >> 3) & 14) | 384);
                break;
            case 6:
                final lc.v vVar7 = (lc.v) obj2;
                p3.m mVar7 = (p3.m) obj3;
                int iB7 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar7);
                p3.x1 x1Var7 = p3.n.f135158a;
                final int i27 = 4;
                d1.a(vVar7, m0Var, z3.f.c(-1178679699, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar8;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i110 = i27;
                        int i28 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i29 = 6;
                        lc.v vVar9 = vVar7;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i210 = 0;
                        switch (i110) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar8 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var8 = p3.n.f135158a;
                                Object objQ = mVar8.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar8);
                                    mVar8.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar9, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar8).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar8.C(-1094460174);
                                    mVar8.f();
                                    gVar4.invoke();
                                } else {
                                    mVar8.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar8, R.string.generic_error_message);
                                    boolean zR = mVar8.r(rVar);
                                    Object objQ2 = mVar8.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar8.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar8.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar8);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar8, 0), aVar5);
                                    mVar8.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar8).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar8.r(dVar) | mVar8.r(rVar) | mVar8.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar8.r(m0Var9) | mVar8.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar8.B(feVar)) || (iIntValue & 48) == 32) | mVar8.B(strQ);
                                    Object objQ3 = mVar8.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar8.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar8, (iIntValue << 3) & 896);
                                    mVar8.f();
                                }
                                p3.x1 x1Var9 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar9 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar10 = vVar7;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar10, dVarB);
                                boolean zR4 = mVar9.r(aVar7);
                                Object objQ4 = mVar9.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar9.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar9.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar9.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar9);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar8);
                                mVar9.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar10, "foodUpdatedResult", null, mVar9);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar9.B(p1VarN) | mVar9.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar9.r(m0Var10) | mVar9.r(vVar10);
                                Object objQ5 = mVar9.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar10, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar9.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar10, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar9.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar9);
                                boolean zR6 = mVar9.r(aVar7) | mVar9.r(dVar2) | mVar9.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar9.B(gVar5);
                                Object objQ6 = mVar9.q();
                                if (zB2) {
                                    lc.m0 m0Var17 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var17;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar9.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var18 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var18;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar9.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar9.r(m0Var3);
                                Object objQ7 = mVar9.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar9.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar9.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar9.r(m0Var3) | mVar9.r(aVar2);
                                Object objQ8 = mVar9.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar9.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar9.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar9.r(m0Var3) | mVar9.B(gVar5);
                                Object objQ9 = mVar9.q();
                                if (zR9) {
                                    final int i213 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i213) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar9.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i214 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i214) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar9.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar9.B(gVar5);
                                Object objQ10 = mVar9.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar9.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar9.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar9, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar9, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar10.r(w0Var);
                                Object objQ11 = mVar10.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar10.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar10.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar10.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar10);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar12);
                                mVar10.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar10.r(dVar3) | mVar10.r(m0Var8) | mVar10.B(gVar3);
                                Object objQ12 = mVar10.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar10.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar10.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar10, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar11 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar9, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar11.r(cVar3) | mVar11.B(c2080b);
                                Object objQ13 = mVar11.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar11.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar11.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar13);
                                mVar11.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar11.r(cVar3) | mVar11.r(dVar4);
                                lc.m0 m0Var19 = m0Var;
                                boolean zR14 = zR13 | mVar11.r(m0Var19);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar11.B(gVar6);
                                Object objQ14 = mVar11.q();
                                if (zB4) {
                                    a51.l lVar10 = new a51.l(cVar3, dVar4, m0Var19, gVar6, 9);
                                    mVar11.K(lVar10);
                                    objQ14 = lVar10;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar11 = new a51.l(cVar3, dVar4, m0Var19, gVar6, 9);
                                        mVar11.K(lVar11);
                                        objQ14 = lVar11;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar11.r(m0Var19);
                                Object objQ15 = mVar11.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var19, 5);
                                    mVar11.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var19, 5);
                                        mVar11.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar11.B(gVar6);
                                Object objQ16 = mVar11.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar11.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar11.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar11, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar12 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar11 = vVar7;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar11, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar12.r(bVar2) | mVar12.B(aVar14);
                                Object objQ17 = mVar12.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar12.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar12.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar15);
                                mVar12.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar11, "recipeUpdatedResult", null, mVar12);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar12.B(p1VarN2) | mVar12.r(tVar3);
                                lc.m0 m0Var110 = m0Var;
                                boolean zR17 = zB6 | mVar12.r(m0Var110) | mVar12.r(vVar11);
                                Object objQ18 = mVar12.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var110, vVar11, p1VarN2, null);
                                    m0Var4 = m0Var110;
                                    mVar12.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var110, vVar11, p1VarN2, null);
                                        m0Var4 = m0Var110;
                                        mVar12.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var110;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar12);
                                boolean zR18 = mVar12.r(bVar2) | mVar12.r(dVar5) | mVar12.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar12.B(gVar7);
                                Object objQ19 = mVar12.q();
                                if (zB7) {
                                    lc.m0 m0Var111 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var111;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar12.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var112 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var112;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar12.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar12.r(m0Var5) | mVar12.B(gVar7);
                                Object objQ20 = mVar12.q();
                                if (zR19) {
                                    final int i215 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i215) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i216 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i216) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar12.r(m0Var5);
                                Object objQ21 = mVar12.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar12.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar12.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar12.r(m0Var5) | mVar12.r(bVar);
                                Object objQ22 = mVar12.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar12.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar12.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar12.B(gVar7);
                                Object objQ23 = mVar12.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar12.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar12.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar12, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar13 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var14 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar12 = vVar7;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar12, dVarB3);
                                boolean zR22 = mVar13.r(gVar8);
                                Object objQ24 = mVar13.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar13.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar13.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar13.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar13);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar13, 0), aVar18);
                                mVar13.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar12, "foodUpdatedResult", null, mVar13);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar13.B(p1VarN3) | mVar13.r(nVar);
                                lc.m0 m0Var113 = m0Var;
                                boolean zR23 = zB9 | mVar13.r(m0Var113) | mVar13.r(vVar12);
                                Object objQ25 = mVar13.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var113, vVar12, p1VarN3, null);
                                    m0Var6 = m0Var113;
                                    vVar8 = vVar12;
                                    mVar13.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var113, vVar12, p1VarN3, null);
                                        m0Var6 = m0Var113;
                                        vVar8 = vVar12;
                                        mVar13.K(objQ25);
                                    } else {
                                        vVar8 = vVar12;
                                        m0Var6 = m0Var113;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar13);
                                p3.p1 p1VarN4 = n23.j.n(vVar8, "standaloneConsumableFoodUpdatedResult", null, mVar13);
                                b11.v vVar13 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar13.B(p1VarN4) | mVar13.r(nVar) | mVar13.r(vVar8);
                                Object objQ26 = mVar13.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar8, p1VarN4, nVar, null);
                                    mVar13.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar8, p1VarN4, nVar, null);
                                        mVar13.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar13, mVar13);
                                boolean zR24 = mVar13.r(gVar8) | mVar13.r(dVar6) | mVar13.r(m0Var6);
                                lc.m0 m0Var114 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar13.B(gVar9);
                                Object objQ27 = mVar13.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var114;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar13.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var114;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar13.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var114;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar13.r(m0Var7);
                                Object objQ28 = mVar13.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar13.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar13.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar13.r(gVar2) | mVar13.r(m0Var7);
                                Object objQ29 = mVar13.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar13.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar13.K(objQ29);
                                    }
                                }
                                e23.l lVar12 = (e23.l) objQ29;
                                boolean zR27 = mVar13.r(m0Var7) | mVar13.r(gVar2);
                                Object objQ30 = mVar13.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i29, m0Var7, gVar2);
                                    mVar13.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i29, m0Var7, gVar2);
                                        mVar13.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar13.r(m0Var7) | mVar13.B(gVar9);
                                Object objQ31 = mVar13.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i210) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar13.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i210) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar13.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar13.B(gVar9);
                                Object objQ32 = mVar13.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar13.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar13.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar12, aVar19, aVar20, (e23.a) objQ32, mVar13, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar14 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var15 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar9, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar14.B(c1412b);
                                Object objQ33 = mVar14.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar14.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar14.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar14.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar14);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar14, 0), aVar21);
                                mVar14.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar9, "addedFoodResult", null, mVar14);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar14.B(p1VarN5) | mVar14.r(gVar10) | mVar14.r(vVar9);
                                Object objQ34 = mVar14.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar9, p1VarN5, gVar10, null);
                                    mVar14.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar9, p1VarN5, gVar10, null);
                                        mVar14.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar14);
                                p3.p1 p1VarN6 = n23.j.n(vVar9, "standaloneConsumableFoodUpdatedResult", null, mVar14);
                                b11.v vVar14 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar14.B(p1VarN6) | mVar14.r(gVar10) | mVar14.r(vVar9);
                                Object objQ35 = mVar14.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar9, p1VarN6, gVar10, null);
                                    mVar14.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar9, p1VarN6, gVar10, null);
                                        mVar14.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar14, mVar14);
                                boolean zB16 = mVar14.B(c1412b) | mVar14.r(m0Var8) | mVar14.B(gVar3);
                                Object objQ36 = mVar14.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar14.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar14.K(objQ36);
                                    }
                                }
                                e23.l lVar13 = (e23.l) objQ36;
                                boolean zR29 = mVar14.r(jVar2) | mVar14.r(m0Var8);
                                Object objQ37 = mVar14.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i210) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar15 = (b11.v) obj9;
                                                    vVar15.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar15, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar14.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i210) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar15 = (b11.v) obj9;
                                                        vVar15.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar15, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar14.K(objQ37);
                                    }
                                }
                                e23.l lVar14 = (e23.l) objQ37;
                                boolean zR30 = mVar14.r(jVar2) | mVar14.r(m0Var8);
                                Object objQ38 = mVar14.q();
                                if (zR30) {
                                    final int i39 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i39) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar15 = (b11.v) obj9;
                                                    vVar15.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar15, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar14.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i310 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i310) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar15 = (b11.v) obj9;
                                                        vVar15.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar15, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar14.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar13, lVar14, (e23.l) objQ38, mVar14, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar15 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var16 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar9, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar15.r(hVar2);
                                Object objQ39 = mVar15.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar15.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar15.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar15.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar15);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar15, 0), aVar22);
                                mVar15.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar15.r(hVar2) | mVar15.r(dVar7);
                                lc.m0 m0Var115 = m0Var;
                                boolean zR33 = zR32 | mVar15.r(m0Var115);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar15.B(gVar11);
                                Object objQ40 = mVar15.q();
                                if (zB17) {
                                    a51.l lVar15 = new a51.l(hVar2, dVar7, m0Var115, gVar11, 11);
                                    mVar15.K(lVar15);
                                    objQ40 = lVar15;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar16 = new a51.l(hVar2, dVar7, m0Var115, gVar11, 11);
                                        mVar15.K(lVar16);
                                        objQ40 = lVar16;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar15.r(m0Var115);
                                Object objQ41 = mVar15.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var115, i28);
                                    mVar15.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var115, i28);
                                        mVar15.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar15.B(gVar11);
                                Object objQ42 = mVar15.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar15.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar15.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar15, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar16 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var17 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar9, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar16.B(c1411b);
                                Object objQ43 = mVar16.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar16.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar16.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar16.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar16);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar16, 0), aVar24);
                                mVar16.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar16.B(c1411b) | mVar16.r(m0Var8) | mVar16.B(gVar3);
                                Object objQ44 = mVar16.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar16.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar16.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar16, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar7), mVar7, ((iB7 >> 3) & 14) | 384);
                break;
            case 7:
                final lc.v vVar8 = (lc.v) obj2;
                p3.m mVar8 = (p3.m) obj3;
                int iB8 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar8);
                p3.x1 x1Var8 = p3.n.f135158a;
                d1.a(vVar8, m0Var, z3.f.c(-1637315218, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar9;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i110 = i17;
                        int i28 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i29 = 6;
                        lc.v vVar10 = vVar8;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i210 = 0;
                        switch (i110) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar9 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var9 = p3.n.f135158a;
                                Object objQ = mVar9.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar9);
                                    mVar9.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar10, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar9).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar9.C(-1094460174);
                                    mVar9.f();
                                    gVar4.invoke();
                                } else {
                                    mVar9.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar9, R.string.generic_error_message);
                                    boolean zR = mVar9.r(rVar);
                                    Object objQ2 = mVar9.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar9.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar9.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar9);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar5);
                                    mVar9.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar9).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar9.r(dVar) | mVar9.r(rVar) | mVar9.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar9.r(m0Var9) | mVar9.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar9.B(feVar)) || (iIntValue & 48) == 32) | mVar9.B(strQ);
                                    Object objQ3 = mVar9.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar9.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar9, (iIntValue << 3) & 896);
                                    mVar9.f();
                                }
                                p3.x1 x1Var10 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar11 = vVar8;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar11, dVarB);
                                boolean zR4 = mVar10.r(aVar7);
                                Object objQ4 = mVar10.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar10.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar10.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar10.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar10);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar8);
                                mVar10.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar11, "foodUpdatedResult", null, mVar10);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar10.B(p1VarN) | mVar10.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar10.r(m0Var10) | mVar10.r(vVar11);
                                Object objQ5 = mVar10.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar11, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar10.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar11, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar10.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar10);
                                boolean zR6 = mVar10.r(aVar7) | mVar10.r(dVar2) | mVar10.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar10.B(gVar5);
                                Object objQ6 = mVar10.q();
                                if (zB2) {
                                    lc.m0 m0Var18 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var18;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar10.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var19 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var19;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar10.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar10.r(m0Var3);
                                Object objQ7 = mVar10.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar10.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar10.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar10.r(m0Var3) | mVar10.r(aVar2);
                                Object objQ8 = mVar10.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar10.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar10.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar10.r(m0Var3) | mVar10.B(gVar5);
                                Object objQ9 = mVar10.q();
                                if (zR9) {
                                    final int i214 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i214) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar10.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i215 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i215) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar10.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar10.B(gVar5);
                                Object objQ10 = mVar10.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar10.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar10.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar10, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar11 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar10, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar11.r(w0Var);
                                Object objQ11 = mVar11.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar11.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar11.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar12);
                                mVar11.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar11.r(dVar3) | mVar11.r(m0Var8) | mVar11.B(gVar3);
                                Object objQ12 = mVar11.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar11.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar11.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar11, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar12 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar10, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar12.r(cVar3) | mVar12.B(c2080b);
                                Object objQ13 = mVar12.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar12.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar12.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar13);
                                mVar12.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar12.r(cVar3) | mVar12.r(dVar4);
                                lc.m0 m0Var110 = m0Var;
                                boolean zR14 = zR13 | mVar12.r(m0Var110);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar12.B(gVar6);
                                Object objQ14 = mVar12.q();
                                if (zB4) {
                                    a51.l lVar11 = new a51.l(cVar3, dVar4, m0Var110, gVar6, 9);
                                    mVar12.K(lVar11);
                                    objQ14 = lVar11;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar12 = new a51.l(cVar3, dVar4, m0Var110, gVar6, 9);
                                        mVar12.K(lVar12);
                                        objQ14 = lVar12;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar12.r(m0Var110);
                                Object objQ15 = mVar12.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var110, 5);
                                    mVar12.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var110, 5);
                                        mVar12.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar12.B(gVar6);
                                Object objQ16 = mVar12.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar12.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar12.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar12, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar13 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var14 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar12 = vVar8;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar12, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar13.r(bVar2) | mVar13.B(aVar14);
                                Object objQ17 = mVar13.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar13.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar13.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar13.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar13);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar13, 0), aVar15);
                                mVar13.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar12, "recipeUpdatedResult", null, mVar13);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar13.B(p1VarN2) | mVar13.r(tVar3);
                                lc.m0 m0Var111 = m0Var;
                                boolean zR17 = zB6 | mVar13.r(m0Var111) | mVar13.r(vVar12);
                                Object objQ18 = mVar13.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var111, vVar12, p1VarN2, null);
                                    m0Var4 = m0Var111;
                                    mVar13.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var111, vVar12, p1VarN2, null);
                                        m0Var4 = m0Var111;
                                        mVar13.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var111;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar13);
                                boolean zR18 = mVar13.r(bVar2) | mVar13.r(dVar5) | mVar13.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar13.B(gVar7);
                                Object objQ19 = mVar13.q();
                                if (zB7) {
                                    lc.m0 m0Var112 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var112;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar13.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var113 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var113;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar13.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar13.r(m0Var5) | mVar13.B(gVar7);
                                Object objQ20 = mVar13.q();
                                if (zR19) {
                                    final int i216 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i216) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar13.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i217 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i217) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar13.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar13.r(m0Var5);
                                Object objQ21 = mVar13.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar13.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar13.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar13.r(m0Var5) | mVar13.r(bVar);
                                Object objQ22 = mVar13.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar13.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar13.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar13.B(gVar7);
                                Object objQ23 = mVar13.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar13.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar13.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar13, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar14 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var15 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar13 = vVar8;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar13, dVarB3);
                                boolean zR22 = mVar14.r(gVar8);
                                Object objQ24 = mVar14.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar14.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar14.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar14.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar14);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar14, 0), aVar18);
                                mVar14.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar13, "foodUpdatedResult", null, mVar14);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar14.B(p1VarN3) | mVar14.r(nVar);
                                lc.m0 m0Var114 = m0Var;
                                boolean zR23 = zB9 | mVar14.r(m0Var114) | mVar14.r(vVar13);
                                Object objQ25 = mVar14.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var114, vVar13, p1VarN3, null);
                                    m0Var6 = m0Var114;
                                    vVar9 = vVar13;
                                    mVar14.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var114, vVar13, p1VarN3, null);
                                        m0Var6 = m0Var114;
                                        vVar9 = vVar13;
                                        mVar14.K(objQ25);
                                    } else {
                                        vVar9 = vVar13;
                                        m0Var6 = m0Var114;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar14);
                                p3.p1 p1VarN4 = n23.j.n(vVar9, "standaloneConsumableFoodUpdatedResult", null, mVar14);
                                b11.v vVar14 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar14.B(p1VarN4) | mVar14.r(nVar) | mVar14.r(vVar9);
                                Object objQ26 = mVar14.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar9, p1VarN4, nVar, null);
                                    mVar14.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar9, p1VarN4, nVar, null);
                                        mVar14.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar14, mVar14);
                                boolean zR24 = mVar14.r(gVar8) | mVar14.r(dVar6) | mVar14.r(m0Var6);
                                lc.m0 m0Var115 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar14.B(gVar9);
                                Object objQ27 = mVar14.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var115;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar14.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var115;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar14.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var115;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar14.r(m0Var7);
                                Object objQ28 = mVar14.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar14.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar14.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar14.r(gVar2) | mVar14.r(m0Var7);
                                Object objQ29 = mVar14.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar14.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar14.K(objQ29);
                                    }
                                }
                                e23.l lVar13 = (e23.l) objQ29;
                                boolean zR27 = mVar14.r(m0Var7) | mVar14.r(gVar2);
                                Object objQ30 = mVar14.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i29, m0Var7, gVar2);
                                    mVar14.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i29, m0Var7, gVar2);
                                        mVar14.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar14.r(m0Var7) | mVar14.B(gVar9);
                                Object objQ31 = mVar14.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i210) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar14.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i210) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar14.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar14.B(gVar9);
                                Object objQ32 = mVar14.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar14.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar14.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar13, aVar19, aVar20, (e23.a) objQ32, mVar14, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar15 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var16 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar10, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar15.B(c1412b);
                                Object objQ33 = mVar15.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar15.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar15.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar15.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar15);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar15, 0), aVar21);
                                mVar15.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar10, "addedFoodResult", null, mVar15);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar15.B(p1VarN5) | mVar15.r(gVar10) | mVar15.r(vVar10);
                                Object objQ34 = mVar15.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar10, p1VarN5, gVar10, null);
                                    mVar15.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar10, p1VarN5, gVar10, null);
                                        mVar15.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar15);
                                p3.p1 p1VarN6 = n23.j.n(vVar10, "standaloneConsumableFoodUpdatedResult", null, mVar15);
                                b11.v vVar15 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar15.B(p1VarN6) | mVar15.r(gVar10) | mVar15.r(vVar10);
                                Object objQ35 = mVar15.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar10, p1VarN6, gVar10, null);
                                    mVar15.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar10, p1VarN6, gVar10, null);
                                        mVar15.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar15, mVar15);
                                boolean zB16 = mVar15.B(c1412b) | mVar15.r(m0Var8) | mVar15.B(gVar3);
                                Object objQ36 = mVar15.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar15.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar15.K(objQ36);
                                    }
                                }
                                e23.l lVar14 = (e23.l) objQ36;
                                boolean zR29 = mVar15.r(jVar2) | mVar15.r(m0Var8);
                                Object objQ37 = mVar15.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i210) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar16 = (b11.v) obj9;
                                                    vVar16.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar16, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar15.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i210) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar16 = (b11.v) obj9;
                                                        vVar16.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar16, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar15.K(objQ37);
                                    }
                                }
                                e23.l lVar15 = (e23.l) objQ37;
                                boolean zR30 = mVar15.r(jVar2) | mVar15.r(m0Var8);
                                Object objQ38 = mVar15.q();
                                if (zR30) {
                                    final int i310 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i310) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar16 = (b11.v) obj9;
                                                    vVar16.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar16, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar15.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i311 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i311) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar16 = (b11.v) obj9;
                                                        vVar16.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar16, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar15.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar14, lVar15, (e23.l) objQ38, mVar15, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar16 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var17 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar10, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar16.r(hVar2);
                                Object objQ39 = mVar16.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar16.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar16.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar16.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar16);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar16, 0), aVar22);
                                mVar16.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar16.r(hVar2) | mVar16.r(dVar7);
                                lc.m0 m0Var116 = m0Var;
                                boolean zR33 = zR32 | mVar16.r(m0Var116);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar16.B(gVar11);
                                Object objQ40 = mVar16.q();
                                if (zB17) {
                                    a51.l lVar16 = new a51.l(hVar2, dVar7, m0Var116, gVar11, 11);
                                    mVar16.K(lVar16);
                                    objQ40 = lVar16;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar17 = new a51.l(hVar2, dVar7, m0Var116, gVar11, 11);
                                        mVar16.K(lVar17);
                                        objQ40 = lVar17;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar16.r(m0Var116);
                                Object objQ41 = mVar16.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var116, i28);
                                    mVar16.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var116, i28);
                                        mVar16.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar16.B(gVar11);
                                Object objQ42 = mVar16.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar16.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar16.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar16, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar17 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var18 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar10, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar17.B(c1411b);
                                Object objQ43 = mVar17.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar17.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar17.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar17.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar17);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar17, 0), aVar24);
                                mVar17.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar17.B(c1411b) | mVar17.r(m0Var8) | mVar17.B(gVar3);
                                Object objQ44 = mVar17.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar17.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar17.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar17, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar8), mVar8, ((iB8 >> 3) & 14) | 384);
                break;
            case 8:
                final lc.v vVar9 = (lc.v) obj2;
                p3.m mVar9 = (p3.m) obj3;
                int iB9 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar9);
                p3.x1 x1Var9 = p3.n.f135158a;
                d1.a(vVar9, m0Var, z3.f.c(-1043547715, new e23.r() { // from class: b21.r0
                    /* JADX WARN: Code duplicated, block: B:100:0x0406  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
                    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
                    /* JADX WARN: Code duplicated, block: B:117:0x04a2  */
                    /* JADX WARN: Code duplicated, block: B:122:0x04c5  */
                    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
                    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:132:0x050b  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0528  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0598  */
                    /* JADX WARN: Code duplicated, block: B:154:0x0604  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0641  */
                    /* JADX WARN: Code duplicated, block: B:166:0x0670  */
                    /* JADX WARN: Code duplicated, block: B:171:0x068c  */
                    /* JADX WARN: Code duplicated, block: B:176:0x06af  */
                    /* JADX WARN: Code duplicated, block: B:181:0x06ce  */
                    /* JADX WARN: Code duplicated, block: B:189:0x0742  */
                    /* JADX WARN: Code duplicated, block: B:196:0x07a1  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:201:0x07c3  */
                    /* JADX WARN: Code duplicated, block: B:206:0x07e1  */
                    /* JADX WARN: Code duplicated, block: B:214:0x0845  */
                    /* JADX WARN: Code duplicated, block: B:221:0x089b  */
                    /* JADX WARN: Code duplicated, block: B:229:0x08f5  */
                    /* JADX WARN: Code duplicated, block: B:238:0x095f  */
                    /* JADX WARN: Code duplicated, block: B:243:0x099c  */
                    /* JADX WARN: Code duplicated, block: B:250:0x09c6  */
                    /* JADX WARN: Code duplicated, block: B:255:0x09ea  */
                    /* JADX WARN: Code duplicated, block: B:260:0x0a0e  */
                    /* JADX WARN: Code duplicated, block: B:265:0x0a2c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0298  */
                    /* JADX WARN: Code duplicated, block: B:68:0x02cc  */
                    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
                    /* JADX WARN: Code duplicated, block: B:83:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        i53.f fVarJ;
                        i53.f fVar;
                        g21.h hVar;
                        l11.a aVar;
                        lc.m0 m0Var2;
                        Object lVar;
                        l4.a aVar2;
                        final lc.m0 m0Var3;
                        l11.t tVar;
                        lc.m0 m0Var4;
                        Object lVar2;
                        l4.b bVar;
                        final lc.m0 m0Var5;
                        lc.m0 m0Var6;
                        lc.v vVar10;
                        Object lVar3;
                        l4.g gVar2;
                        final lc.m0 m0Var7;
                        int i110 = i16;
                        int i28 = 7;
                        NutritionActivity.g gVar3 = gVar;
                        final lc.m0 m0Var8 = m0Var;
                        int i29 = 6;
                        lc.v vVar11 = vVar9;
                        p3.m.a aVar3 = p3.m.f135153a;
                        final int i210 = 0;
                        switch (i110) {
                            case 0:
                                i21.d dVar = (i21.d) obj5;
                                fe feVar = (fe) obj6;
                                p3.m mVar10 = (p3.m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar.getClass();
                                feVar.getClass();
                                p3.x1 x1Var10 = p3.n.f135158a;
                                Object objQ = mVar10.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = p3.l0.j(t13.h.f161748a, mVar10);
                                    mVar10.K(objQ);
                                }
                                o53.b0 b0Var = (o53.b0) objQ;
                                l4.r rVar = (l4.r) lc.w.a(vVar11, p005kotlin.jvm.internal.s0.f105811a.b(l4.r.class));
                                u82.a aVar4 = dVar.f87289w;
                                rVar.getClass();
                                g21.i iVar = (g21.i) ((u82.f) aVar4.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c), null, 2, null), mVar10).getF182175a()).a();
                                if (iVar == null || (hVar = iVar.f75433a) == null) {
                                    fVarJ = null;
                                } else {
                                    i53.c<g21.p> cVar = hVar.f75430g;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<g21.p> it = cVar.iterator();
                                    while (it.hasNext()) {
                                        i53.c<b11.i> cVar2 = it.next().f75476d;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (b11.i iVar2 : cVar2) {
                                            if (p13.h0.R(rVar.f14959d, iVar2.getF14315a())) {
                                                arrayList2.add(iVar2);
                                            }
                                        }
                                        p13.d0.v(arrayList, arrayList2);
                                    }
                                    fVarJ = i53.a.j(arrayList);
                                }
                                NutritionActivity.g gVar4 = gVar;
                                if (fVarJ == null || fVarJ.isEmpty()) {
                                    mVar10.C(-1094460174);
                                    mVar10.f();
                                    gVar4.invoke();
                                } else {
                                    mVar10.C(-1096289887);
                                    String strQ = gl1.y.Q(mVar10, R.string.generic_error_message);
                                    boolean zR = mVar10.r(rVar);
                                    Object objQ2 = mVar10.q();
                                    if (zR || objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a03.e(rVar, 21);
                                        mVar10.K(objQ2);
                                    }
                                    e23.a aVar5 = (e23.a) objQ2;
                                    mVar10.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar10);
                                    if (viewModelStoreOwnerA == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(s11.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar10, 0), aVar5);
                                    mVar10.R();
                                    s11.a aVar6 = (s11.a) s9.c.c(((s11.c) u1VarResolveViewModel).f155878a, mVar10).getF182175a();
                                    i01.a.Companion companion = i01.a.INSTANCE;
                                    String str = rVar.f14957b;
                                    companion.getClass();
                                    i01.a aVarA = i01.a.Companion.a(str);
                                    boolean zR2 = mVar10.r(dVar) | mVar10.r(rVar) | mVar10.B(fVarJ);
                                    lc.m0 m0Var9 = m0Var;
                                    boolean zR3 = zR2 | mVar10.r(m0Var9) | mVar10.r(b0Var) | ((((iIntValue & 112) ^ 48) > 32 && mVar10.B(feVar)) || (iIntValue & 48) == 32) | mVar10.B(strQ);
                                    Object objQ3 = mVar10.q();
                                    if (zR3 || objQ3 == p3.m.a.f135155b) {
                                        fVar = fVarJ;
                                        l0 l0Var = new l0(dVar, rVar, fVar, m0Var9, b0Var, feVar, strQ, 0);
                                        mVar10.K(l0Var);
                                        objQ3 = l0Var;
                                    } else {
                                        fVar = fVarJ;
                                    }
                                    r11.f.a(null, aVar6, feVar, aVarA, fVar, (e23.p) objQ3, gVar4, mVar10, (iIntValue << 3) & 896);
                                    mVar10.f();
                                }
                                p3.x1 x1Var11 = p3.n.f135158a;
                                return Unit.INSTANCE;
                            case 1:
                                i21.d dVar2 = (i21.d) obj5;
                                fe feVar2 = (fe) obj6;
                                p3.m mVar11 = (p3.m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                feVar2.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB = t0Var.b(l4.a.class);
                                lc.v vVar12 = vVar9;
                                l4.a aVar7 = (l4.a) lc.w.a(vVar12, dVarB);
                                boolean zR4 = mVar11.r(aVar7);
                                Object objQ4 = mVar11.q();
                                if (zR4) {
                                    objQ4 = new a03.e(aVar7, 28);
                                    mVar11.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new a03.e(aVar7, 28);
                                        mVar11.K(objQ4);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ4;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar8);
                                mVar11.R();
                                l11.a aVar9 = (l11.a) u1VarResolveViewModel2;
                                p3.p1 p1VarN = n23.j.n(vVar12, "foodUpdatedResult", null, mVar11);
                                Boolean bool = (Boolean) p1VarN.getF182175a();
                                boolean zB = mVar11.B(p1VarN) | mVar11.r(aVar9);
                                lc.m0 m0Var10 = m0Var;
                                boolean zR5 = zB | mVar11.r(m0Var10) | mVar11.r(vVar12);
                                Object objQ5 = mVar11.q();
                                if (zR5) {
                                    aVar = aVar9;
                                    objQ5 = new t1(aVar, m0Var10, vVar12, p1VarN, null);
                                    m0Var2 = m0Var10;
                                    mVar11.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        aVar = aVar9;
                                        objQ5 = new t1(aVar, m0Var10, vVar12, p1VarN, null);
                                        m0Var2 = m0Var10;
                                        mVar11.K(objQ5);
                                    } else {
                                        aVar = aVar9;
                                        m0Var2 = m0Var10;
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, bool, mVar11);
                                boolean zR6 = mVar11.r(aVar7) | mVar11.r(dVar2) | mVar11.r(m0Var2);
                                final NutritionActivity.g gVar5 = gVar;
                                boolean zB2 = zR6 | mVar11.B(gVar5);
                                Object objQ6 = mVar11.q();
                                if (zB2) {
                                    lc.m0 m0Var19 = m0Var2;
                                    aVar2 = aVar7;
                                    m0Var3 = m0Var19;
                                    lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                    mVar11.K(lVar);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        lc.m0 m0Var110 = m0Var2;
                                        aVar2 = aVar7;
                                        m0Var3 = m0Var110;
                                        lVar = new a51.l(aVar2, dVar2, m0Var3, gVar5, 12);
                                        mVar11.K(lVar);
                                    } else {
                                        lVar = objQ6;
                                        m0Var3 = m0Var2;
                                        aVar2 = aVar7;
                                    }
                                }
                                e23.p pVar = (e23.p) lVar;
                                boolean zR7 = mVar11.r(m0Var3);
                                Object objQ7 = mVar11.q();
                                if (zR7) {
                                    objQ7 = new j0(m0Var3, 8);
                                    mVar11.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j0(m0Var3, 8);
                                        mVar11.K(objQ7);
                                    }
                                }
                                e23.p pVar2 = (e23.p) objQ7;
                                boolean zR8 = mVar11.r(m0Var3) | mVar11.r(aVar2);
                                Object objQ8 = mVar11.q();
                                if (zR8) {
                                    objQ8 = new ao1.i(15, m0Var3, aVar2);
                                    mVar11.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new ao1.i(15, m0Var3, aVar2);
                                        mVar11.K(objQ8);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ8;
                                boolean zR9 = mVar11.r(m0Var3) | mVar11.B(gVar5);
                                Object objQ9 = mVar11.q();
                                if (zR9) {
                                    final int i215 = 2;
                                    objQ9 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i215) {
                                                case 0:
                                                    lc.v vVarF = m0Var3.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var3.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var3.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar5.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ9);
                                } else {
                                    aVar3.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i216 = 2;
                                        objQ9 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i216) {
                                                    case 0:
                                                        lc.v vVarF = m0Var3.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var3.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var3.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar5.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ9);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ9;
                                boolean zB3 = mVar11.B(gVar5);
                                Object objQ10 = mVar11.q();
                                if (zB3) {
                                    objQ10 = new k0(gVar5, 7);
                                    mVar11.K(objQ10);
                                } else {
                                    aVar3.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new k0(gVar5, 7);
                                        mVar11.K(objQ10);
                                    }
                                }
                                k11.m.a(aVar, null, null, feVar2, pVar, null, pVar2, aVar10, aVar11, (e23.a) objQ10, mVar11, (iIntValue2 << 6) & 7168, 38);
                                return Unit.INSTANCE;
                            case 2:
                                i21.d dVar3 = (i21.d) obj5;
                                fe feVar3 = (fe) obj6;
                                p3.m mVar12 = (p3.m) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                dVar3.getClass();
                                feVar3.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.w0 w0Var = (l4.w0) lc.w.a(vVar11, t0Var2.b(l4.w0.class));
                                boolean zR10 = mVar12.r(w0Var);
                                Object objQ11 = mVar12.q();
                                if (zR10) {
                                    objQ11 = new a03.e(w0Var, 26);
                                    mVar12.K(objQ11);
                                } else {
                                    aVar3.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new a03.e(w0Var, 26);
                                        mVar12.K(objQ11);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ11;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA3 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(f11.j.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar12);
                                mVar12.R();
                                f11.j jVar = (f11.j) u1VarResolveViewModel3;
                                boolean zR11 = mVar12.r(dVar3) | mVar12.r(m0Var8) | mVar12.B(gVar3);
                                Object objQ12 = mVar12.q();
                                if (zR11) {
                                    objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                    mVar12.K(objQ12);
                                } else {
                                    aVar3.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new a3.e(dVar3, 15, m0Var8, gVar3);
                                        mVar12.K(objQ12);
                                    }
                                }
                                e11.k0.a(jVar, null, feVar3, (e23.p) objQ12, mVar12, (iIntValue3 << 3) & 896);
                                return Unit.INSTANCE;
                            case 3:
                                i21.d dVar4 = (i21.d) obj5;
                                fe feVar4 = (fe) obj6;
                                p3.m mVar13 = (p3.m) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                dVar4.getClass();
                                feVar4.getClass();
                                p3.x1 x1Var14 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.c cVar3 = (l4.c) lc.w.a(vVar11, t0Var3.b(l4.c.class));
                                l11.t.b.C2080b c2080b = new l11.t.b.C2080b(cVar3.f14861e, cVar3.f14862f, cVar3.f14863g);
                                boolean zR12 = mVar13.r(cVar3) | mVar13.B(c2080b);
                                Object objQ13 = mVar13.q();
                                if (zR12) {
                                    objQ13 = new ao1.i(10, cVar3, c2080b);
                                    mVar13.K(objQ13);
                                } else {
                                    aVar3.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        objQ13 = new ao1.i(10, cVar3, c2080b);
                                        mVar13.K(objQ13);
                                    }
                                }
                                e23.a aVar13 = (e23.a) objQ13;
                                mVar13.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar13);
                                if (viewModelStoreOwnerA4 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var3.b(l11.t.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar13, 0), aVar13);
                                mVar13.R();
                                l11.t tVar2 = (l11.t) u1VarResolveViewModel4;
                                boolean zR13 = mVar13.r(cVar3) | mVar13.r(dVar4);
                                lc.m0 m0Var111 = m0Var;
                                boolean zR14 = zR13 | mVar13.r(m0Var111);
                                NutritionActivity.g gVar6 = gVar;
                                boolean zB4 = zR14 | mVar13.B(gVar6);
                                Object objQ14 = mVar13.q();
                                if (zB4) {
                                    a51.l lVar12 = new a51.l(cVar3, dVar4, m0Var111, gVar6, 9);
                                    mVar13.K(lVar12);
                                    objQ14 = lVar12;
                                } else {
                                    aVar3.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        a51.l lVar13 = new a51.l(cVar3, dVar4, m0Var111, gVar6, 9);
                                        mVar13.K(lVar13);
                                        objQ14 = lVar13;
                                    }
                                }
                                e23.p pVar3 = (e23.p) objQ14;
                                boolean zR15 = mVar13.r(m0Var111);
                                Object objQ15 = mVar13.q();
                                if (zR15) {
                                    objQ15 = new j0(m0Var111, 5);
                                    mVar13.K(objQ15);
                                } else {
                                    aVar3.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        objQ15 = new j0(m0Var111, 5);
                                        mVar13.K(objQ15);
                                    }
                                }
                                e23.p pVar4 = (e23.p) objQ15;
                                boolean zB5 = mVar13.B(gVar6);
                                Object objQ16 = mVar13.q();
                                if (zB5) {
                                    objQ16 = new k0(gVar6, 4);
                                    mVar13.K(objQ16);
                                } else {
                                    aVar3.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new k0(gVar6, 4);
                                        mVar13.K(objQ16);
                                    }
                                }
                                k11.a0.c(tVar2, null, feVar4, pVar3, null, pVar4, null, null, (e23.a) objQ16, mVar13, (iIntValue4 << 3) & 896, 210);
                                return Unit.INSTANCE;
                            case 4:
                                i21.d dVar5 = (i21.d) obj5;
                                fe feVar5 = (fe) obj6;
                                p3.m mVar14 = (p3.m) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                dVar5.getClass();
                                feVar5.getClass();
                                p3.x1 x1Var15 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB2 = t0Var4.b(l4.b.class);
                                lc.v vVar13 = vVar9;
                                l4.b bVar2 = (l4.b) lc.w.a(vVar13, dVarB2);
                                l11.t.b.a aVar14 = new l11.t.b.a(bVar2.f14848d, bVar2.f14849e, bVar2.f14850f);
                                boolean zR16 = mVar14.r(bVar2) | mVar14.B(aVar14);
                                Object objQ17 = mVar14.q();
                                if (zR16) {
                                    objQ17 = new ao1.i(11, bVar2, aVar14);
                                    mVar14.K(objQ17);
                                } else {
                                    aVar3.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new ao1.i(11, bVar2, aVar14);
                                        mVar14.K(objQ17);
                                    }
                                }
                                e23.a aVar15 = (e23.a) objQ17;
                                mVar14.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar14);
                                if (viewModelStoreOwnerA5 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(t0Var4.b(l11.t.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar14, 0), aVar15);
                                mVar14.R();
                                l11.t tVar3 = (l11.t) u1VarResolveViewModel5;
                                p3.p1 p1VarN2 = n23.j.n(vVar13, "recipeUpdatedResult", null, mVar14);
                                Boolean bool2 = (Boolean) p1VarN2.getF182175a();
                                boolean zB6 = mVar14.B(p1VarN2) | mVar14.r(tVar3);
                                lc.m0 m0Var112 = m0Var;
                                boolean zR17 = zB6 | mVar14.r(m0Var112) | mVar14.r(vVar13);
                                Object objQ18 = mVar14.q();
                                if (zR17) {
                                    tVar = tVar3;
                                    objQ18 = new s1(tVar, m0Var112, vVar13, p1VarN2, null);
                                    m0Var4 = m0Var112;
                                    mVar14.K(objQ18);
                                } else {
                                    aVar3.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        tVar = tVar3;
                                        objQ18 = new s1(tVar, m0Var112, vVar13, p1VarN2, null);
                                        m0Var4 = m0Var112;
                                        mVar14.K(objQ18);
                                    } else {
                                        tVar = tVar3;
                                        m0Var4 = m0Var112;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, bool2, mVar14);
                                boolean zR18 = mVar14.r(bVar2) | mVar14.r(dVar5) | mVar14.r(m0Var4);
                                final NutritionActivity.g gVar7 = gVar;
                                boolean zB7 = zR18 | mVar14.B(gVar7);
                                Object objQ19 = mVar14.q();
                                if (zB7) {
                                    lc.m0 m0Var113 = m0Var4;
                                    bVar = bVar2;
                                    m0Var5 = m0Var113;
                                    lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                    mVar14.K(lVar2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        lc.m0 m0Var114 = m0Var4;
                                        bVar = bVar2;
                                        m0Var5 = m0Var114;
                                        lVar2 = new a51.l(bVar, dVar5, m0Var5, gVar7, 10);
                                        mVar14.K(lVar2);
                                    } else {
                                        lVar2 = objQ19;
                                        m0Var5 = m0Var4;
                                        bVar = bVar2;
                                    }
                                }
                                e23.p pVar5 = (e23.p) lVar2;
                                boolean zR19 = mVar14.r(m0Var5) | mVar14.B(gVar7);
                                Object objQ20 = mVar14.q();
                                if (zR19) {
                                    final int i217 = 1;
                                    objQ20 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i217) {
                                                case 0:
                                                    lc.v vVarF = m0Var5.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var5.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var5.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar7.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar14.K(objQ20);
                                } else {
                                    aVar3.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        final int i218 = 1;
                                        objQ20 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i218) {
                                                    case 0:
                                                        lc.v vVarF = m0Var5.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var5.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var5.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar7.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar14.K(objQ20);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ20;
                                boolean zR20 = mVar14.r(m0Var5);
                                Object objQ21 = mVar14.q();
                                if (zR20) {
                                    objQ21 = new j0(m0Var5, 6);
                                    mVar14.K(objQ21);
                                } else {
                                    aVar3.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new j0(m0Var5, 6);
                                        mVar14.K(objQ21);
                                    }
                                }
                                e23.p pVar6 = (e23.p) objQ21;
                                boolean zR21 = mVar14.r(m0Var5) | mVar14.r(bVar);
                                Object objQ22 = mVar14.q();
                                if (zR21) {
                                    objQ22 = new ao1.i(12, m0Var5, bVar);
                                    mVar14.K(objQ22);
                                } else {
                                    aVar3.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new ao1.i(12, m0Var5, bVar);
                                        mVar14.K(objQ22);
                                    }
                                }
                                e23.a aVar17 = (e23.a) objQ22;
                                boolean zB8 = mVar14.B(gVar7);
                                Object objQ23 = mVar14.q();
                                if (zB8) {
                                    objQ23 = new k0(gVar7, 5);
                                    mVar14.K(objQ23);
                                } else {
                                    aVar3.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new k0(gVar7, 5);
                                        mVar14.K(objQ23);
                                    }
                                }
                                k11.a0.c(tVar, null, feVar5, pVar5, aVar16, pVar6, null, aVar17, (e23.a) objQ23, mVar14, (iIntValue5 << 3) & 896, 66);
                                return Unit.INSTANCE;
                            case 5:
                                i21.d dVar6 = (i21.d) obj5;
                                fe feVar6 = (fe) obj6;
                                p3.m mVar15 = (p3.m) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                dVar6.getClass();
                                feVar6.getClass();
                                p3.x1 x1Var16 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                k23.d dVarB3 = t0Var5.b(l4.g.class);
                                lc.v vVar14 = vVar9;
                                l4.g gVar8 = (l4.g) lc.w.a(vVar14, dVarB3);
                                boolean zR22 = mVar15.r(gVar8);
                                Object objQ24 = mVar15.q();
                                if (zR22) {
                                    objQ24 = new a03.e(gVar8, 22);
                                    mVar15.K(objQ24);
                                } else {
                                    aVar3.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new a03.e(gVar8, 22);
                                        mVar15.K(objQ24);
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ24;
                                mVar15.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA6 = v9.a.a(mVar15);
                                if (viewModelStoreOwnerA6 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel6 = GetViewModelKt.resolveViewModel(t0Var5.b(l11.n.class), viewModelStoreOwnerA6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA6), null, KoinApplicationKt.currentKoinScope(mVar15, 0), aVar18);
                                mVar15.R();
                                l11.n nVar = (l11.n) u1VarResolveViewModel6;
                                p3.p1 p1VarN3 = n23.j.n(vVar14, "foodUpdatedResult", null, mVar15);
                                Boolean bool3 = (Boolean) p1VarN3.getF182175a();
                                boolean zB9 = mVar15.B(p1VarN3) | mVar15.r(nVar);
                                lc.m0 m0Var115 = m0Var;
                                boolean zR23 = zB9 | mVar15.r(m0Var115) | mVar15.r(vVar14);
                                Object objQ25 = mVar15.q();
                                if (zR23) {
                                    objQ25 = new m1(nVar, m0Var115, vVar14, p1VarN3, null);
                                    m0Var6 = m0Var115;
                                    vVar10 = vVar14;
                                    mVar15.K(objQ25);
                                } else {
                                    aVar3.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        objQ25 = new m1(nVar, m0Var115, vVar14, p1VarN3, null);
                                        m0Var6 = m0Var115;
                                        vVar10 = vVar14;
                                        mVar15.K(objQ25);
                                    } else {
                                        vVar10 = vVar14;
                                        m0Var6 = m0Var115;
                                    }
                                }
                                p3.l0.e((e23.p) objQ25, bool3, mVar15);
                                p3.p1 p1VarN4 = n23.j.n(vVar10, "standaloneConsumableFoodUpdatedResult", null, mVar15);
                                b11.v vVar15 = (b11.v) p1VarN4.getF182175a();
                                boolean zB10 = mVar15.B(p1VarN4) | mVar15.r(nVar) | mVar15.r(vVar10);
                                Object objQ26 = mVar15.q();
                                if (zB10) {
                                    objQ26 = new n1(vVar10, p1VarN4, nVar, null);
                                    mVar15.K(objQ26);
                                } else {
                                    aVar3.getClass();
                                    if (objQ26 == p3.m.a.f135155b) {
                                        objQ26 = new n1(vVar10, p1VarN4, nVar, null);
                                        mVar15.K(objQ26);
                                    }
                                }
                                p3.l0.e((e23.p) objQ26, vVar15, mVar15);
                                boolean zR24 = mVar15.r(gVar8) | mVar15.r(dVar6) | mVar15.r(m0Var6);
                                lc.m0 m0Var116 = m0Var6;
                                final NutritionActivity.g gVar9 = gVar;
                                boolean zB11 = zR24 | mVar15.B(gVar9);
                                Object objQ27 = mVar15.q();
                                if (zB11) {
                                    gVar2 = gVar8;
                                    m0Var7 = m0Var116;
                                    lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                    mVar15.K(lVar3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ27 == p3.m.a.f135155b) {
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var116;
                                        lVar3 = new a51.l(gVar2, dVar6, m0Var7, gVar9, 8);
                                        mVar15.K(lVar3);
                                    } else {
                                        lVar3 = objQ27;
                                        gVar2 = gVar8;
                                        m0Var7 = m0Var116;
                                    }
                                }
                                e23.p pVar7 = (e23.p) lVar3;
                                boolean zR25 = mVar15.r(m0Var7);
                                Object objQ28 = mVar15.q();
                                if (zR25) {
                                    objQ28 = new j0(m0Var7, 1);
                                    mVar15.K(objQ28);
                                } else {
                                    aVar3.getClass();
                                    if (objQ28 == p3.m.a.f135155b) {
                                        objQ28 = new j0(m0Var7, 1);
                                        mVar15.K(objQ28);
                                    }
                                }
                                e23.p pVar8 = (e23.p) objQ28;
                                boolean zR26 = mVar15.r(gVar2) | mVar15.r(m0Var7);
                                Object objQ29 = mVar15.q();
                                if (zR26) {
                                    objQ29 = new a42.i(19, gVar2, m0Var7);
                                    mVar15.K(objQ29);
                                } else {
                                    aVar3.getClass();
                                    if (objQ29 == p3.m.a.f135155b) {
                                        objQ29 = new a42.i(19, gVar2, m0Var7);
                                        mVar15.K(objQ29);
                                    }
                                }
                                e23.l lVar14 = (e23.l) objQ29;
                                boolean zR27 = mVar15.r(m0Var7) | mVar15.r(gVar2);
                                Object objQ30 = mVar15.q();
                                if (zR27) {
                                    objQ30 = new ao1.i(i29, m0Var7, gVar2);
                                    mVar15.K(objQ30);
                                } else {
                                    aVar3.getClass();
                                    if (objQ30 == p3.m.a.f135155b) {
                                        objQ30 = new ao1.i(i29, m0Var7, gVar2);
                                        mVar15.K(objQ30);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ30;
                                boolean zR28 = mVar15.r(m0Var7) | mVar15.B(gVar9);
                                Object objQ31 = mVar15.q();
                                if (zR28) {
                                    objQ31 = new e23.a() { // from class: b21.n0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            androidx.lifecycle.j1 j1VarA;
                                            androidx.lifecycle.j1 j1VarA2;
                                            androidx.lifecycle.j1 j1VarA3;
                                            switch (i210) {
                                                case 0:
                                                    lc.v vVarF = m0Var7.f();
                                                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                        j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                case 1:
                                                    lc.v vVarF2 = m0Var7.f();
                                                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                        j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                                default:
                                                    lc.v vVarF3 = m0Var7.f();
                                                    if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                        j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                    }
                                                    gVar9.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar15.K(objQ31);
                                } else {
                                    aVar3.getClass();
                                    if (objQ31 == p3.m.a.f135155b) {
                                        objQ31 = new e23.a() { // from class: b21.n0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                androidx.lifecycle.j1 j1VarA;
                                                androidx.lifecycle.j1 j1VarA2;
                                                androidx.lifecycle.j1 j1VarA3;
                                                switch (i210) {
                                                    case 0:
                                                        lc.v vVarF = m0Var7.f();
                                                        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                                                            j1VarA.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    case 1:
                                                        lc.v vVarF2 = m0Var7.f();
                                                        if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                                                            j1VarA2.f(Boolean.TRUE, "recipeUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                    default:
                                                        lc.v vVarF3 = m0Var7.f();
                                                        if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                                                            j1VarA3.f(Boolean.TRUE, "foodUpdatedResult");
                                                        }
                                                        gVar9.invoke();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar15.K(objQ31);
                                    }
                                }
                                e23.a aVar20 = (e23.a) objQ31;
                                boolean zB12 = mVar15.B(gVar9);
                                Object objQ32 = mVar15.q();
                                if (zB12) {
                                    objQ32 = new k0(gVar9, 1);
                                    mVar15.K(objQ32);
                                } else {
                                    aVar3.getClass();
                                    if (objQ32 == p3.m.a.f135155b) {
                                        objQ32 = new k0(gVar9, 1);
                                        mVar15.K(objQ32);
                                    }
                                }
                                k11.y.b(nVar, null, feVar6, pVar7, pVar8, lVar14, aVar19, aVar20, (e23.a) objQ32, mVar15, (iIntValue6 << 3) & 896);
                                return Unit.INSTANCE;
                            case 6:
                                fe feVar7 = (fe) obj6;
                                p3.m mVar16 = (p3.m) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar7.getClass();
                                p3.x1 x1Var17 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.j jVar2 = (l4.j) lc.w.a(vVar11, t0Var6.b(l4.j.class));
                                Long l14 = jVar2.f14905b;
                                Object c1412b = l14 != null ? new f11.g.b.C1412b(l14.longValue()) : f11.g.b.a.f67941a;
                                boolean zB13 = mVar16.B(c1412b);
                                Object objQ33 = mVar16.q();
                                if (zB13) {
                                    objQ33 = new a03.e(c1412b, 24);
                                    mVar16.K(objQ33);
                                } else {
                                    aVar3.getClass();
                                    if (objQ33 == p3.m.a.f135155b) {
                                        objQ33 = new a03.e(c1412b, 24);
                                        mVar16.K(objQ33);
                                    }
                                }
                                e23.a aVar21 = (e23.a) objQ33;
                                mVar16.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA7 = v9.a.a(mVar16);
                                if (viewModelStoreOwnerA7 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel7 = GetViewModelKt.resolveViewModel(t0Var6.b(f11.g.class), viewModelStoreOwnerA7.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA7), null, KoinApplicationKt.currentKoinScope(mVar16, 0), aVar21);
                                mVar16.R();
                                f11.g gVar10 = (f11.g) u1VarResolveViewModel7;
                                p3.p1 p1VarN5 = n23.j.n(vVar11, "addedFoodResult", null, mVar16);
                                List list = (List) p1VarN5.getF182175a();
                                boolean zB14 = mVar16.B(p1VarN5) | mVar16.r(gVar10) | mVar16.r(vVar11);
                                Object objQ34 = mVar16.q();
                                if (zB14) {
                                    objQ34 = new k1(vVar11, p1VarN5, gVar10, null);
                                    mVar16.K(objQ34);
                                } else {
                                    aVar3.getClass();
                                    if (objQ34 == p3.m.a.f135155b) {
                                        objQ34 = new k1(vVar11, p1VarN5, gVar10, null);
                                        mVar16.K(objQ34);
                                    }
                                }
                                p3.l0.e((e23.p) objQ34, list, mVar16);
                                p3.p1 p1VarN6 = n23.j.n(vVar11, "standaloneConsumableFoodUpdatedResult", null, mVar16);
                                b11.v vVar16 = (b11.v) p1VarN6.getF182175a();
                                boolean zB15 = mVar16.B(p1VarN6) | mVar16.r(gVar10) | mVar16.r(vVar11);
                                Object objQ35 = mVar16.q();
                                if (zB15) {
                                    objQ35 = new l1(vVar11, p1VarN6, gVar10, null);
                                    mVar16.K(objQ35);
                                } else {
                                    aVar3.getClass();
                                    if (objQ35 == p3.m.a.f135155b) {
                                        objQ35 = new l1(vVar11, p1VarN6, gVar10, null);
                                        mVar16.K(objQ35);
                                    }
                                }
                                p3.l0.e((e23.p) objQ35, vVar16, mVar16);
                                boolean zB16 = mVar16.B(c1412b) | mVar16.r(m0Var8) | mVar16.B(gVar3);
                                Object objQ36 = mVar16.q();
                                if (zB16) {
                                    objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                    mVar16.K(objQ36);
                                } else {
                                    aVar3.getClass();
                                    if (objQ36 == p3.m.a.f135155b) {
                                        objQ36 = new a4.a(c1412b, 11, m0Var8, gVar3);
                                        mVar16.K(objQ36);
                                    }
                                }
                                e23.l lVar15 = (e23.l) objQ36;
                                boolean zR29 = mVar16.r(jVar2) | mVar16.r(m0Var8);
                                Object objQ37 = mVar16.q();
                                if (zR29) {
                                    objQ37 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i210) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar17 = (b11.v) obj9;
                                                    vVar17.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar17, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar16.K(objQ37);
                                } else {
                                    aVar3.getClass();
                                    if (objQ37 == p3.m.a.f135155b) {
                                        objQ37 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i210) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar17 = (b11.v) obj9;
                                                        vVar17.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar17, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar16.K(objQ37);
                                    }
                                }
                                e23.l lVar16 = (e23.l) objQ37;
                                boolean zR30 = mVar16.r(jVar2) | mVar16.r(m0Var8);
                                Object objQ38 = mVar16.q();
                                if (zR30) {
                                    final int i311 = 1;
                                    objQ38 = new e23.l() { // from class: b21.y0
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            switch (i311) {
                                                case 0:
                                                    ((b63.u) obj9).getClass();
                                                    m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                    b63.u.Companion companion2 = b63.u.INSTANCE;
                                                    l4.j jVar3 = jVar2;
                                                    lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                                default:
                                                    b11.v vVar17 = (b11.v) obj9;
                                                    vVar17.getClass();
                                                    b63.u.Companion companion3 = b63.u.INSTANCE;
                                                    l4.j jVar4 = jVar2;
                                                    lc.y.l(m0Var8, v21.a.a(vVar17, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar16.K(objQ38);
                                } else {
                                    aVar3.getClass();
                                    if (objQ38 == p3.m.a.f135155b) {
                                        final int i312 = 1;
                                        objQ38 = new e23.l() { // from class: b21.y0
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                switch (i312) {
                                                    case 0:
                                                        ((b63.u) obj9).getClass();
                                                        m21.b.a aVar22 = m21.b.a.INSTANCE;
                                                        b63.u.Companion companion2 = b63.u.INSTANCE;
                                                        l4.j jVar3 = jVar2;
                                                        lc.y.l(m0Var8, new l4.m((m21.b) aVar22, b63.u.Companion.a(companion2, jVar3.f14906c), jVar3.f14907d.f14339b, false, 8, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                    default:
                                                        b11.v vVar17 = (b11.v) obj9;
                                                        vVar17.getClass();
                                                        b63.u.Companion companion3 = b63.u.INSTANCE;
                                                        l4.j jVar4 = jVar2;
                                                        lc.y.l(m0Var8, v21.a.a(vVar17, i01.i.REGULAR_LOG, j11.c.CUSTOM_MEAL, b63.u.Companion.a(companion3, jVar4.f14906c), jVar4.f14907d));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar16.K(objQ38);
                                    }
                                }
                                e11.e0.a(gVar10, null, feVar7, lVar15, lVar16, (e23.l) objQ38, mVar16, (iIntValue7 << 3) & 896);
                                return Unit.INSTANCE;
                            case 7:
                                i21.d dVar7 = (i21.d) obj5;
                                fe feVar8 = (fe) obj6;
                                p3.m mVar17 = (p3.m) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                dVar7.getClass();
                                feVar8.getClass();
                                p3.x1 x1Var18 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.h hVar2 = (l4.h) lc.w.a(vVar11, t0Var7.b(l4.h.class));
                                boolean zR31 = mVar17.r(hVar2);
                                Object objQ39 = mVar17.q();
                                if (zR31) {
                                    objQ39 = new a03.e(hVar2, 25);
                                    mVar17.K(objQ39);
                                } else {
                                    aVar3.getClass();
                                    if (objQ39 == p3.m.a.f135155b) {
                                        objQ39 = new a03.e(hVar2, 25);
                                        mVar17.K(objQ39);
                                    }
                                }
                                e23.a aVar22 = (e23.a) objQ39;
                                mVar17.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA8 = v9.a.a(mVar17);
                                if (viewModelStoreOwnerA8 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel8 = GetViewModelKt.resolveViewModel(t0Var7.b(l11.a.class), viewModelStoreOwnerA8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA8), null, KoinApplicationKt.currentKoinScope(mVar17, 0), aVar22);
                                mVar17.R();
                                l11.a aVar23 = (l11.a) u1VarResolveViewModel8;
                                boolean zR32 = mVar17.r(hVar2) | mVar17.r(dVar7);
                                lc.m0 m0Var117 = m0Var;
                                boolean zR33 = zR32 | mVar17.r(m0Var117);
                                NutritionActivity.g gVar11 = gVar;
                                boolean zB17 = zR33 | mVar17.B(gVar11);
                                Object objQ40 = mVar17.q();
                                if (zB17) {
                                    a51.l lVar17 = new a51.l(hVar2, dVar7, m0Var117, gVar11, 11);
                                    mVar17.K(lVar17);
                                    objQ40 = lVar17;
                                } else {
                                    aVar3.getClass();
                                    if (objQ40 == p3.m.a.f135155b) {
                                        a51.l lVar18 = new a51.l(hVar2, dVar7, m0Var117, gVar11, 11);
                                        mVar17.K(lVar18);
                                        objQ40 = lVar18;
                                    }
                                }
                                e23.p pVar9 = (e23.p) objQ40;
                                boolean zR34 = mVar17.r(m0Var117);
                                Object objQ41 = mVar17.q();
                                if (zR34) {
                                    objQ41 = new j0(m0Var117, i28);
                                    mVar17.K(objQ41);
                                } else {
                                    aVar3.getClass();
                                    if (objQ41 == p3.m.a.f135155b) {
                                        objQ41 = new j0(m0Var117, i28);
                                        mVar17.K(objQ41);
                                    }
                                }
                                e23.p pVar10 = (e23.p) objQ41;
                                boolean zB18 = mVar17.B(gVar11);
                                Object objQ42 = mVar17.q();
                                if (zB18) {
                                    objQ42 = new k0(gVar11, 6);
                                    mVar17.K(objQ42);
                                } else {
                                    aVar3.getClass();
                                    if (objQ42 == p3.m.a.f135155b) {
                                        objQ42 = new k0(gVar11, 6);
                                        mVar17.K(objQ42);
                                    }
                                }
                                k11.m.a(aVar23, null, null, feVar8, pVar9, null, pVar10, null, null, (e23.a) objQ42, mVar17, (iIntValue8 << 6) & 7168, 422);
                                return Unit.INSTANCE;
                            default:
                                fe feVar9 = (fe) obj6;
                                p3.m mVar18 = (p3.m) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((i21.d) obj5).getClass();
                                feVar9.getClass();
                                p3.x1 x1Var19 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                String str2 = ((l4.i) lc.w.a(vVar11, t0Var8.b(l4.i.class))).f14902b;
                                Object c1411b = str2 != null ? new f11.a.b.C1411b(str2) : f11.a.b.C1410a.f67891a;
                                boolean zB19 = mVar18.B(c1411b);
                                Object objQ43 = mVar18.q();
                                if (zB19) {
                                    objQ43 = new a03.e(c1411b, 27);
                                    mVar18.K(objQ43);
                                } else {
                                    aVar3.getClass();
                                    if (objQ43 == p3.m.a.f135155b) {
                                        objQ43 = new a03.e(c1411b, 27);
                                        mVar18.K(objQ43);
                                    }
                                }
                                e23.a aVar24 = (e23.a) objQ43;
                                mVar18.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA9 = v9.a.a(mVar18);
                                if (viewModelStoreOwnerA9 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel9 = GetViewModelKt.resolveViewModel(t0Var8.b(f11.a.class), viewModelStoreOwnerA9.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA9), null, KoinApplicationKt.currentKoinScope(mVar18, 0), aVar24);
                                mVar18.R();
                                f11.a aVar25 = (f11.a) u1VarResolveViewModel9;
                                boolean zB20 = mVar18.B(c1411b) | mVar18.r(m0Var8) | mVar18.B(gVar3);
                                Object objQ44 = mVar18.q();
                                if (zB20) {
                                    objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                    mVar18.K(objQ44);
                                } else {
                                    aVar3.getClass();
                                    if (objQ44 == p3.m.a.f135155b) {
                                        objQ44 = new a4.a(c1411b, 12, m0Var8, gVar3);
                                        mVar18.K(objQ44);
                                    }
                                }
                                e11.j.a(aVar25, null, null, feVar9, (e23.l) objQ44, mVar18, (iIntValue9 << 6) & 7168);
                                return Unit.INSTANCE;
                        }
                    }
                }, mVar9), mVar9, ((iB9 >> 3) & 14) | 384);
                break;
            case 9:
                final lc.v vVar10 = (lc.v) obj2;
                p3.m mVar10 = (p3.m) obj3;
                int iB10 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar10);
                p3.x1 x1Var10 = p3.n.f135158a;
                e5.a(vVar10, m0Var, z3.f.c(1118952500, new e23.u() { // from class: b21.p4
                    /* JADX WARN: Code duplicated, block: B:102:0x0398  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03ca  */
                    /* JADX WARN: Code duplicated, block: B:112:0x03e6  */
                    /* JADX WARN: Code duplicated, block: B:117:0x040b  */
                    /* JADX WARN: Code duplicated, block: B:122:0x0431  */
                    /* JADX WARN: Code duplicated, block: B:127:0x044e  */
                    /* JADX WARN: Code duplicated, block: B:132:0x046a  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0486  */
                    /* JADX WARN: Code duplicated, block: B:142:0x04a4  */
                    /* JADX WARN: Code duplicated, block: B:147:0x04c2  */
                    /* JADX WARN: Code duplicated, block: B:15:0x00b4  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:25:0x011d  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0139  */
                    /* JADX WARN: Code duplicated, block: B:35:0x0154  */
                    /* JADX WARN: Code duplicated, block: B:40:0x016f  */
                    /* JADX WARN: Code duplicated, block: B:45:0x018b  */
                    /* JADX WARN: Code duplicated, block: B:50:0x01a6  */
                    /* JADX WARN: Code duplicated, block: B:55:0x01c2  */
                    /* JADX WARN: Code duplicated, block: B:63:0x022e  */
                    /* JADX WARN: Code duplicated, block: B:70:0x0292  */
                    /* JADX WARN: Code duplicated, block: B:75:0x02b2  */
                    /* JADX WARN: Code duplicated, block: B:82:0x02ec  */
                    /* JADX WARN: Code duplicated, block: B:87:0x0334  */
                    /* JADX WARN: Code duplicated, block: B:8:0x005c  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj5, Object obj6, Object obj7, Object obj8, p3.m mVar11, Integer num) {
                        final lc.m0 m0Var2;
                        fe feVar;
                        int i28 = i15;
                        p3.m.a aVar = p3.m.f135153a;
                        lc.v vVar11 = vVar10;
                        final int i29 = 2;
                        final int i30 = 1;
                        final int i34 = 0;
                        switch (i28) {
                            case 0:
                                m21.v vVar12 = (m21.v) u1Var;
                                fe feVar2 = (fe) obj8;
                                int iIntValue = num.intValue();
                                ((List) obj5).getClass();
                                ((List) obj6).getClass();
                                ((List) obj7).getClass();
                                feVar2.getClass();
                                p3.x1 x1Var11 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.o oVar = (l4.o) lc.w.a(vVar11, t0Var.b(l4.o.class));
                                boolean zR = mVar11.r(oVar);
                                Object objQ = mVar11.q();
                                if (zR) {
                                    objQ = new s4(oVar, 2);
                                    mVar11.K(objQ);
                                } else {
                                    aVar.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new s4(oVar, 2);
                                        mVar11.K(objQ);
                                    }
                                }
                                e23.a aVar2 = (e23.a) objQ;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(x11.e.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar2);
                                mVar11.R();
                                final x11.e eVar = (x11.e) u1VarResolveViewModel;
                                p3.p1 p1VarC = s9.c.c(eVar.f188403g, mVar11);
                                List list = (List) s9.c.c(vVar11.a().d(null, "addedFoodResult"), mVar11).getF182175a();
                                boolean zR2 = mVar11.r(vVar11);
                                Object objQ2 = mVar11.q();
                                if (zR2) {
                                    objQ2 = new f5(vVar11, null);
                                    mVar11.K(objQ2);
                                } else {
                                    aVar.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new f5(vVar11, null);
                                        mVar11.K(objQ2);
                                    }
                                }
                                p3.l0.e((e23.p) objQ2, list, mVar11);
                                Unit unit = Unit.INSTANCE;
                                boolean zR3 = mVar11.r(vVar12);
                                Object objQ3 = mVar11.q();
                                if (zR3) {
                                    objQ3 = new g5(vVar12, null);
                                    mVar11.K(objQ3);
                                } else {
                                    aVar.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new g5(vVar12, null);
                                        mVar11.K(objQ3);
                                    }
                                }
                                p3.l0.e((e23.p) objQ3, unit, mVar11);
                                b11.e eVar2 = ((x11.b) p1VarC.getF182175a()).f188389i;
                                boolean zB = mVar11.B(p1VarC) | mVar11.r(eVar);
                                lc.m0 m0Var3 = m0Var;
                                boolean zR4 = zB | mVar11.r(m0Var3) | mVar11.r(oVar);
                                Object objQ4 = mVar11.q();
                                if (zR4) {
                                    objQ4 = new h5(p1VarC, eVar, m0Var3, oVar, null);
                                    m0Var2 = m0Var3;
                                    mVar11.K(objQ4);
                                } else {
                                    aVar.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new h5(p1VarC, eVar, m0Var3, oVar, null);
                                        m0Var2 = m0Var3;
                                        mVar11.K(objQ4);
                                    } else {
                                        m0Var2 = m0Var3;
                                    }
                                }
                                p3.l0.e((e23.p) objQ4, eVar2, mVar11);
                                List<b11.v> list2 = ((x11.b) p1VarC.getF182175a()).f188390j;
                                boolean zB2 = mVar11.B(p1VarC) | mVar11.r(vVar12) | mVar11.r(eVar) | mVar11.r(m0Var2) | mVar11.r(oVar);
                                Object objQ5 = mVar11.q();
                                if (zB2) {
                                    objQ5 = new i5(p1VarC, vVar12, eVar, m0Var2, oVar, null);
                                    mVar11.K(objQ5);
                                } else {
                                    aVar.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new i5(p1VarC, vVar12, eVar, m0Var2, oVar, null);
                                        mVar11.K(objQ5);
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, list2, mVar11);
                                String strQ = gl1.y.Q(mVar11, R.string.generic_error_message);
                                Boolean boolValueOf = Boolean.valueOf(((x11.b) p1VarC.getF182175a()).f188384d);
                                boolean zB3 = mVar11.B(p1VarC) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar11.B(feVar2)) || (iIntValue & 24576) == 16384) | mVar11.B(strQ) | mVar11.r(eVar);
                                Object objQ6 = mVar11.q();
                                if (zB3) {
                                    objQ6 = new j5(feVar2, strQ, eVar, p1VarC, null);
                                    feVar = feVar2;
                                    mVar11.K(objQ6);
                                } else {
                                    aVar.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new j5(feVar2, strQ, eVar, p1VarC, null);
                                        feVar = feVar2;
                                        mVar11.K(objQ6);
                                    } else {
                                        feVar = feVar2;
                                    }
                                }
                                p3.l0.e((e23.p) objQ6, boolValueOf, mVar11);
                                x11.b bVar = (x11.b) p1VarC.getF182175a();
                                boolean zR5 = mVar11.r(eVar);
                                Object objQ7 = mVar11.q();
                                if (zR5) {
                                    final int i35 = 3;
                                    objQ7 = new e23.a() { // from class: b21.r4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            x11.b bVar2;
                                            switch (i35) {
                                                case 0:
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = eVar.f188402f;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                    break;
                                                case 2:
                                                    eVar.x4();
                                                    break;
                                                default:
                                                    r53.p2 p2Var3 = eVar.f188402f;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                        bVar2 = (x11.b) value3;
                                                    } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ7);
                                } else {
                                    aVar.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        final int i36 = 3;
                                        objQ7 = new e23.a() { // from class: b21.r4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                x11.b bVar2;
                                                switch (i36) {
                                                    case 0:
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = eVar.f188402f;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                        break;
                                                    case 2:
                                                        eVar.x4();
                                                        break;
                                                    default:
                                                        r53.p2 p2Var3 = eVar.f188402f;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                            bVar2 = (x11.b) value3;
                                                        } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ7);
                                    }
                                }
                                e23.a aVar3 = (e23.a) objQ7;
                                boolean zR6 = mVar11.r(eVar);
                                Object objQ8 = mVar11.q();
                                if (zR6) {
                                    objQ8 = new e23.l() { // from class: b21.q4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            switch (i29) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    x11.e eVar3 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                    break;
                                                case 1:
                                                    Bitmap bitmap = (Bitmap) obj9;
                                                    bitmap.getClass();
                                                    x11.e eVar4 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                    break;
                                                default:
                                                    x11.a aVar4 = (x11.a) obj9;
                                                    aVar4.getClass();
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    if (aVar4 != ((x11.b) p2Var.getValue()).f188382b) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar4, false, false, false, false, false, false, null, null, 1021)));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ8);
                                } else {
                                    aVar.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new e23.l() { // from class: b21.q4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                switch (i29) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        x11.e eVar3 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                        break;
                                                    case 1:
                                                        Bitmap bitmap = (Bitmap) obj9;
                                                        bitmap.getClass();
                                                        x11.e eVar4 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                        break;
                                                    default:
                                                        x11.a aVar4 = (x11.a) obj9;
                                                        aVar4.getClass();
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        if (aVar4 != ((x11.b) p2Var.getValue()).f188382b) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar4, false, false, false, false, false, false, null, null, 1021)));
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ8);
                                    }
                                }
                                e23.l lVar = (e23.l) objQ8;
                                boolean zR7 = mVar11.r(eVar) | mVar11.r(m0Var2) | mVar11.r(oVar);
                                Object objQ9 = mVar11.q();
                                if (zR7) {
                                    final int i37 = 0;
                                    objQ9 = new e23.a() { // from class: b21.d5
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i37) {
                                                case 0:
                                                    eVar.x4();
                                                    l4.o oVar2 = oVar;
                                                    oVar2.getClass();
                                                    lc.y.l(m0Var2, new l4.w0(b63.u.Companion.a(b63.u.INSTANCE, oVar2.f14937c), (String) null, oVar2.f14940f));
                                                    break;
                                                default:
                                                    eVar.x4();
                                                    l4.o oVar3 = oVar;
                                                    oVar3.getClass();
                                                    lc.y.l(m0Var2, new l4.j((Long) null, b63.u.Companion.a(b63.u.INSTANCE, oVar3.f14937c), oVar3.f14940f, 1, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ9);
                                } else {
                                    aVar.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i38 = 0;
                                        objQ9 = new e23.a() { // from class: b21.d5
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i38) {
                                                    case 0:
                                                        eVar.x4();
                                                        l4.o oVar2 = oVar;
                                                        oVar2.getClass();
                                                        lc.y.l(m0Var2, new l4.w0(b63.u.Companion.a(b63.u.INSTANCE, oVar2.f14937c), (String) null, oVar2.f14940f));
                                                        break;
                                                    default:
                                                        eVar.x4();
                                                        l4.o oVar3 = oVar;
                                                        oVar3.getClass();
                                                        lc.y.l(m0Var2, new l4.j((Long) null, b63.u.Companion.a(b63.u.INSTANCE, oVar3.f14937c), oVar3.f14940f, 1, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ9);
                                    }
                                }
                                e23.a aVar4 = (e23.a) objQ9;
                                boolean zR8 = mVar11.r(eVar) | mVar11.r(m0Var2) | mVar11.r(oVar);
                                Object objQ10 = mVar11.q();
                                if (zR8) {
                                    final int i39 = 1;
                                    objQ10 = new e23.a() { // from class: b21.d5
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i39) {
                                                case 0:
                                                    eVar.x4();
                                                    l4.o oVar2 = oVar;
                                                    oVar2.getClass();
                                                    lc.y.l(m0Var2, new l4.w0(b63.u.Companion.a(b63.u.INSTANCE, oVar2.f14937c), (String) null, oVar2.f14940f));
                                                    break;
                                                default:
                                                    eVar.x4();
                                                    l4.o oVar3 = oVar;
                                                    oVar3.getClass();
                                                    lc.y.l(m0Var2, new l4.j((Long) null, b63.u.Companion.a(b63.u.INSTANCE, oVar3.f14937c), oVar3.f14940f, 1, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ10);
                                } else {
                                    aVar.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        final int i310 = 1;
                                        objQ10 = new e23.a() { // from class: b21.d5
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i310) {
                                                    case 0:
                                                        eVar.x4();
                                                        l4.o oVar2 = oVar;
                                                        oVar2.getClass();
                                                        lc.y.l(m0Var2, new l4.w0(b63.u.Companion.a(b63.u.INSTANCE, oVar2.f14937c), (String) null, oVar2.f14940f));
                                                        break;
                                                    default:
                                                        eVar.x4();
                                                        l4.o oVar3 = oVar;
                                                        oVar3.getClass();
                                                        lc.y.l(m0Var2, new l4.j((Long) null, b63.u.Companion.a(b63.u.INSTANCE, oVar3.f14937c), oVar3.f14940f, 1, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ10);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ10;
                                boolean zR9 = mVar11.r(eVar);
                                Object objQ11 = mVar11.q();
                                if (zR9) {
                                    final int i44 = 0;
                                    objQ11 = new e23.l() { // from class: b21.q4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            switch (i44) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    x11.e eVar3 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                    break;
                                                case 1:
                                                    Bitmap bitmap = (Bitmap) obj9;
                                                    bitmap.getClass();
                                                    x11.e eVar4 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                    break;
                                                default:
                                                    x11.a aVar6 = (x11.a) obj9;
                                                    aVar6.getClass();
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ11);
                                } else {
                                    aVar.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        final int i45 = 0;
                                        objQ11 = new e23.l() { // from class: b21.q4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                switch (i45) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        x11.e eVar3 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                        break;
                                                    case 1:
                                                        Bitmap bitmap = (Bitmap) obj9;
                                                        bitmap.getClass();
                                                        x11.e eVar4 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                        break;
                                                    default:
                                                        x11.a aVar6 = (x11.a) obj9;
                                                        aVar6.getClass();
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ11);
                                    }
                                }
                                e23.l lVar2 = (e23.l) objQ11;
                                boolean zR10 = mVar11.r(eVar);
                                Object objQ12 = mVar11.q();
                                if (zR10) {
                                    final int i46 = 1;
                                    objQ12 = new e23.l() { // from class: b21.q4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            switch (i46) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    x11.e eVar3 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                    break;
                                                case 1:
                                                    Bitmap bitmap = (Bitmap) obj9;
                                                    bitmap.getClass();
                                                    x11.e eVar4 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                    break;
                                                default:
                                                    x11.a aVar6 = (x11.a) obj9;
                                                    aVar6.getClass();
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ12);
                                } else {
                                    aVar.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        final int i47 = 1;
                                        objQ12 = new e23.l() { // from class: b21.q4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                switch (i47) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        x11.e eVar3 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                        break;
                                                    case 1:
                                                        Bitmap bitmap = (Bitmap) obj9;
                                                        bitmap.getClass();
                                                        x11.e eVar4 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                        break;
                                                    default:
                                                        x11.a aVar6 = (x11.a) obj9;
                                                        aVar6.getClass();
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ12);
                                    }
                                }
                                e23.l lVar3 = (e23.l) objQ12;
                                boolean zR11 = mVar11.r(eVar);
                                Object objQ13 = mVar11.q();
                                if (zR11) {
                                    final int i48 = 0;
                                    objQ13 = new e23.a() { // from class: b21.r4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            x11.b bVar2;
                                            switch (i48) {
                                                case 0:
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = eVar.f188402f;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                    break;
                                                case 2:
                                                    eVar.x4();
                                                    break;
                                                default:
                                                    r53.p2 p2Var3 = eVar.f188402f;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                        bVar2 = (x11.b) value3;
                                                    } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ13);
                                } else {
                                    aVar.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        final int i49 = 0;
                                        objQ13 = new e23.a() { // from class: b21.r4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                x11.b bVar2;
                                                switch (i49) {
                                                    case 0:
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = eVar.f188402f;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                        break;
                                                    case 2:
                                                        eVar.x4();
                                                        break;
                                                    default:
                                                        r53.p2 p2Var3 = eVar.f188402f;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                            bVar2 = (x11.b) value3;
                                                        } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ13);
                                    }
                                }
                                e23.a aVar6 = (e23.a) objQ13;
                                boolean zR12 = mVar11.r(eVar);
                                fe feVar3 = feVar;
                                Object objQ14 = mVar11.q();
                                if (zR12) {
                                    final int i54 = 1;
                                    objQ14 = new e23.a() { // from class: b21.r4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            x11.b bVar2;
                                            switch (i54) {
                                                case 0:
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = eVar.f188402f;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                    break;
                                                case 2:
                                                    eVar.x4();
                                                    break;
                                                default:
                                                    r53.p2 p2Var3 = eVar.f188402f;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                        bVar2 = (x11.b) value3;
                                                    } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ14);
                                } else {
                                    aVar.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        final int i55 = 1;
                                        objQ14 = new e23.a() { // from class: b21.r4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                x11.b bVar2;
                                                switch (i55) {
                                                    case 0:
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = eVar.f188402f;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                        break;
                                                    case 2:
                                                        eVar.x4();
                                                        break;
                                                    default:
                                                        r53.p2 p2Var3 = eVar.f188402f;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                            bVar2 = (x11.b) value3;
                                                        } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ14);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ14;
                                boolean zR13 = mVar11.r(eVar);
                                Object objQ15 = mVar11.q();
                                if (zR13) {
                                    final int i56 = 2;
                                    objQ15 = new e23.a() { // from class: b21.r4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            x11.b bVar2;
                                            switch (i56) {
                                                case 0:
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = eVar.f188402f;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                    break;
                                                case 2:
                                                    eVar.x4();
                                                    break;
                                                default:
                                                    r53.p2 p2Var3 = eVar.f188402f;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                        bVar2 = (x11.b) value3;
                                                    } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ15);
                                } else {
                                    aVar.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        final int i57 = 2;
                                        objQ15 = new e23.a() { // from class: b21.r4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                x11.b bVar2;
                                                switch (i57) {
                                                    case 0:
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = eVar.f188402f;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                        break;
                                                    case 2:
                                                        eVar.x4();
                                                        break;
                                                    default:
                                                        r53.p2 p2Var3 = eVar.f188402f;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                            bVar2 = (x11.b) value3;
                                                        } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ15);
                                    }
                                }
                                w11.d.g(feVar3, bVar, aVar3, lVar, aVar4, aVar5, lVar2, lVar3, aVar6, aVar7, gVar, (e23.a) objQ15, mVar11, (iIntValue >> 12) & 14);
                                return unit;
                            default:
                                m21.v vVar13 = (m21.v) u1Var;
                                fe feVar4 = (fe) obj8;
                                int iIntValue2 = num.intValue();
                                ((List) obj5).getClass();
                                ((List) obj6).getClass();
                                ((List) obj7).getClass();
                                feVar4.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.z0 z0Var = (l4.z0) lc.w.a(vVar11, t0Var2.b(l4.z0.class));
                                boolean zR14 = mVar11.r(z0Var);
                                Object objQ16 = mVar11.q();
                                if (zR14) {
                                    objQ16 = new s4(z0Var, 0);
                                    mVar11.K(objQ16);
                                } else {
                                    aVar.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new s4(z0Var, 0);
                                        mVar11.K(objQ16);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ16;
                                mVar11.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar11);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(y21.c.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar11, 0), aVar8);
                                mVar11.R();
                                final y21.c cVar = (y21.c) u1VarResolveViewModel2;
                                p3.p1 p1VarC2 = s9.c.c(cVar.f194239f, mVar11);
                                Unit unit2 = Unit.INSTANCE;
                                boolean zR15 = mVar11.r(z0Var) | mVar11.r(vVar13);
                                Object objQ17 = mVar11.q();
                                if (zR15) {
                                    objQ17 = new k5(z0Var, vVar13, null);
                                    mVar11.K(objQ17);
                                } else {
                                    aVar.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new k5(z0Var, vVar13, null);
                                        mVar11.K(objQ17);
                                    }
                                }
                                p3.l0.e((e23.p) objQ17, unit2, mVar11);
                                List<b11.a.C0202a> list3 = ((y21.a) p1VarC2.getF182175a()).f194229f;
                                boolean zB4 = mVar11.B(p1VarC2) | mVar11.r(cVar) | mVar11.r(z0Var) | mVar11.r(vVar13);
                                lc.m0 m0Var4 = m0Var;
                                boolean zR16 = zB4 | mVar11.r(m0Var4);
                                Object objQ18 = mVar11.q();
                                if (zR16) {
                                    Object l5Var = new l5(p1VarC2, cVar, z0Var, vVar13, m0Var4, null);
                                    mVar11.K(l5Var);
                                    objQ18 = l5Var;
                                } else {
                                    aVar.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        Object l5Var2 = new l5(p1VarC2, cVar, z0Var, vVar13, m0Var4, null);
                                        mVar11.K(l5Var2);
                                        objQ18 = l5Var2;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, list3, mVar11);
                                y21.a aVar9 = (y21.a) p1VarC2.getF182175a();
                                boolean zR17 = mVar11.r(cVar);
                                Object objQ19 = mVar11.q();
                                if (zR17) {
                                    objQ19 = new e23.l() { // from class: b21.t4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            switch (i34) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                    break;
                                                case 1:
                                                    boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                    break;
                                                default:
                                                    String str2 = (String) obj9;
                                                    str2.getClass();
                                                    String string = d53.w.i0(str2).toString();
                                                    if (string.length() != 0) {
                                                        y21.c cVar2 = cVar;
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                        ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ19);
                                } else {
                                    aVar.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new e23.l() { // from class: b21.t4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                switch (i34) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                        break;
                                                    case 1:
                                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                        break;
                                                    default:
                                                        String str2 = (String) obj9;
                                                        str2.getClass();
                                                        String string = d53.w.i0(str2).toString();
                                                        if (string.length() != 0) {
                                                            y21.c cVar2 = cVar;
                                                            r53.p2 p2Var3 = cVar2.f194238e;
                                                            do {
                                                                value3 = p2Var3.getValue();
                                                            } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                            ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ19);
                                    }
                                }
                                e23.l lVar4 = (e23.l) objQ19;
                                boolean zR18 = mVar11.r(cVar);
                                Object objQ20 = mVar11.q();
                                if (zR18) {
                                    objQ20 = new e23.l() { // from class: b21.t4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            switch (i30) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                    break;
                                                case 1:
                                                    boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                    break;
                                                default:
                                                    String str2 = (String) obj9;
                                                    str2.getClass();
                                                    String string = d53.w.i0(str2).toString();
                                                    if (string.length() != 0) {
                                                        y21.c cVar2 = cVar;
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                        ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ20);
                                } else {
                                    aVar.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new e23.l() { // from class: b21.t4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                switch (i30) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                        break;
                                                    case 1:
                                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                        break;
                                                    default:
                                                        String str2 = (String) obj9;
                                                        str2.getClass();
                                                        String string = d53.w.i0(str2).toString();
                                                        if (string.length() != 0) {
                                                            y21.c cVar2 = cVar;
                                                            r53.p2 p2Var3 = cVar2.f194238e;
                                                            do {
                                                                value3 = p2Var3.getValue();
                                                            } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                            ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ20);
                                    }
                                }
                                e23.l lVar5 = (e23.l) objQ20;
                                boolean zR19 = mVar11.r(cVar);
                                Object objQ21 = mVar11.q();
                                if (zR19) {
                                    objQ21 = new e23.l() { // from class: b21.t4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            switch (i29) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                    break;
                                                case 1:
                                                    boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                    break;
                                                default:
                                                    String str2 = (String) obj9;
                                                    str2.getClass();
                                                    String string = d53.w.i0(str2).toString();
                                                    if (string.length() != 0) {
                                                        y21.c cVar2 = cVar;
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                        ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ21);
                                } else {
                                    aVar.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new e23.l() { // from class: b21.t4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                switch (i29) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                        break;
                                                    case 1:
                                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                        break;
                                                    default:
                                                        String str2 = (String) obj9;
                                                        str2.getClass();
                                                        String string = d53.w.i0(str2).toString();
                                                        if (string.length() != 0) {
                                                            y21.c cVar2 = cVar;
                                                            r53.p2 p2Var3 = cVar2.f194238e;
                                                            do {
                                                                value3 = p2Var3.getValue();
                                                            } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                            ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ21);
                                    }
                                }
                                e23.l lVar6 = (e23.l) objQ21;
                                boolean zR20 = mVar11.r(cVar);
                                Object objQ22 = mVar11.q();
                                if (zR20) {
                                    objQ22 = new e23.a() { // from class: b21.u4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            Object value4;
                                            switch (i34) {
                                                case 0:
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                    break;
                                                case 2:
                                                    y21.c cVar2 = cVar;
                                                    cVar2.f194235b.C(false);
                                                    r53.p2 p2Var3 = cVar2.f194238e;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                    } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                    break;
                                                default:
                                                    y21.c cVar3 = cVar;
                                                    cVar3.f194235b.C(true);
                                                    r53.p2 p2Var4 = cVar3.f194238e;
                                                    do {
                                                        value4 = p2Var4.getValue();
                                                    } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ22);
                                } else {
                                    aVar.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new e23.a() { // from class: b21.u4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                switch (i34) {
                                                    case 0:
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                        break;
                                                    case 2:
                                                        y21.c cVar2 = cVar;
                                                        cVar2.f194235b.C(false);
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                        break;
                                                    default:
                                                        y21.c cVar3 = cVar;
                                                        cVar3.f194235b.C(true);
                                                        r53.p2 p2Var4 = cVar3.f194238e;
                                                        do {
                                                            value4 = p2Var4.getValue();
                                                        } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ22);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ22;
                                boolean zR21 = mVar11.r(cVar);
                                Object objQ23 = mVar11.q();
                                if (zR21) {
                                    objQ23 = new e23.a() { // from class: b21.u4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            Object value4;
                                            switch (i30) {
                                                case 0:
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                    break;
                                                case 2:
                                                    y21.c cVar2 = cVar;
                                                    cVar2.f194235b.C(false);
                                                    r53.p2 p2Var3 = cVar2.f194238e;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                    } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                    break;
                                                default:
                                                    y21.c cVar3 = cVar;
                                                    cVar3.f194235b.C(true);
                                                    r53.p2 p2Var4 = cVar3.f194238e;
                                                    do {
                                                        value4 = p2Var4.getValue();
                                                    } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ23);
                                } else {
                                    aVar.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new e23.a() { // from class: b21.u4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                switch (i30) {
                                                    case 0:
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                        break;
                                                    case 2:
                                                        y21.c cVar2 = cVar;
                                                        cVar2.f194235b.C(false);
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                        break;
                                                    default:
                                                        y21.c cVar3 = cVar;
                                                        cVar3.f194235b.C(true);
                                                        r53.p2 p2Var4 = cVar3.f194238e;
                                                        do {
                                                            value4 = p2Var4.getValue();
                                                        } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ23);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ23;
                                boolean zR22 = mVar11.r(cVar);
                                Object objQ24 = mVar11.q();
                                if (zR22) {
                                    objQ24 = new e23.a() { // from class: b21.u4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            Object value4;
                                            switch (i29) {
                                                case 0:
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                    break;
                                                case 2:
                                                    y21.c cVar2 = cVar;
                                                    cVar2.f194235b.C(false);
                                                    r53.p2 p2Var3 = cVar2.f194238e;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                    } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                    break;
                                                default:
                                                    y21.c cVar3 = cVar;
                                                    cVar3.f194235b.C(true);
                                                    r53.p2 p2Var4 = cVar3.f194238e;
                                                    do {
                                                        value4 = p2Var4.getValue();
                                                    } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ24);
                                } else {
                                    aVar.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new e23.a() { // from class: b21.u4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                switch (i29) {
                                                    case 0:
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                        break;
                                                    case 2:
                                                        y21.c cVar2 = cVar;
                                                        cVar2.f194235b.C(false);
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                        break;
                                                    default:
                                                        y21.c cVar3 = cVar;
                                                        cVar3.f194235b.C(true);
                                                        r53.p2 p2Var4 = cVar3.f194238e;
                                                        do {
                                                            value4 = p2Var4.getValue();
                                                        } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ24);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ24;
                                boolean zR23 = mVar11.r(cVar);
                                Object objQ25 = mVar11.q();
                                if (zR23) {
                                    final int i58 = 3;
                                    objQ25 = new e23.a() { // from class: b21.u4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            Object value4;
                                            switch (i58) {
                                                case 0:
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                    break;
                                                case 2:
                                                    y21.c cVar2 = cVar;
                                                    cVar2.f194235b.C(false);
                                                    r53.p2 p2Var3 = cVar2.f194238e;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                    } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                    break;
                                                default:
                                                    y21.c cVar3 = cVar;
                                                    cVar3.f194235b.C(true);
                                                    r53.p2 p2Var4 = cVar3.f194238e;
                                                    do {
                                                        value4 = p2Var4.getValue();
                                                    } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar11.K(objQ25);
                                } else {
                                    aVar.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        final int i59 = 3;
                                        objQ25 = new e23.a() { // from class: b21.u4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                switch (i59) {
                                                    case 0:
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                        break;
                                                    case 2:
                                                        y21.c cVar2 = cVar;
                                                        cVar2.f194235b.C(false);
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                        break;
                                                    default:
                                                        y21.c cVar3 = cVar;
                                                        cVar3.f194235b.C(true);
                                                        r53.p2 p2Var4 = cVar3.f194238e;
                                                        do {
                                                            value4 = p2Var4.getValue();
                                                        } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar11.K(objQ25);
                                    }
                                }
                                w21.m.f(aVar9, feVar4, lVar4, lVar5, lVar6, aVar10, aVar11, aVar12, (e23.a) objQ25, gVar, mVar11, (iIntValue2 >> 9) & 112);
                                return unit2;
                        }
                    }
                }, mVar10), mVar10, ((iB10 >> 3) & 14) | 384);
                break;
            case 10:
                final lc.v vVar11 = (lc.v) obj2;
                p3.m mVar11 = (p3.m) obj3;
                int iB11 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar11);
                p3.x1 x1Var11 = p3.n.f135158a;
                e5.a(vVar11, m0Var, z3.f.c(-1638744547, new e23.u() { // from class: b21.p4
                    /* JADX WARN: Code duplicated, block: B:102:0x0398  */
                    /* JADX WARN: Code duplicated, block: B:107:0x03ca  */
                    /* JADX WARN: Code duplicated, block: B:112:0x03e6  */
                    /* JADX WARN: Code duplicated, block: B:117:0x040b  */
                    /* JADX WARN: Code duplicated, block: B:122:0x0431  */
                    /* JADX WARN: Code duplicated, block: B:127:0x044e  */
                    /* JADX WARN: Code duplicated, block: B:132:0x046a  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0486  */
                    /* JADX WARN: Code duplicated, block: B:142:0x04a4  */
                    /* JADX WARN: Code duplicated, block: B:147:0x04c2  */
                    /* JADX WARN: Code duplicated, block: B:15:0x00b4  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:25:0x011d  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0139  */
                    /* JADX WARN: Code duplicated, block: B:35:0x0154  */
                    /* JADX WARN: Code duplicated, block: B:40:0x016f  */
                    /* JADX WARN: Code duplicated, block: B:45:0x018b  */
                    /* JADX WARN: Code duplicated, block: B:50:0x01a6  */
                    /* JADX WARN: Code duplicated, block: B:55:0x01c2  */
                    /* JADX WARN: Code duplicated, block: B:63:0x022e  */
                    /* JADX WARN: Code duplicated, block: B:70:0x0292  */
                    /* JADX WARN: Code duplicated, block: B:75:0x02b2  */
                    /* JADX WARN: Code duplicated, block: B:82:0x02ec  */
                    /* JADX WARN: Code duplicated, block: B:87:0x0334  */
                    /* JADX WARN: Code duplicated, block: B:8:0x005c  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj5, Object obj6, Object obj7, Object obj8, p3.m mVar12, Integer num) {
                        final lc.m0 m0Var2;
                        fe feVar;
                        int i28 = i16;
                        p3.m.a aVar = p3.m.f135153a;
                        lc.v vVar12 = vVar11;
                        final int i29 = 2;
                        final int i30 = 1;
                        final int i34 = 0;
                        switch (i28) {
                            case 0:
                                m21.v vVar13 = (m21.v) u1Var;
                                fe feVar2 = (fe) obj8;
                                int iIntValue = num.intValue();
                                ((List) obj5).getClass();
                                ((List) obj6).getClass();
                                ((List) obj7).getClass();
                                feVar2.getClass();
                                p3.x1 x1Var12 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                final l4.o oVar = (l4.o) lc.w.a(vVar12, t0Var.b(l4.o.class));
                                boolean zR = mVar12.r(oVar);
                                Object objQ = mVar12.q();
                                if (zR) {
                                    objQ = new s4(oVar, 2);
                                    mVar12.K(objQ);
                                } else {
                                    aVar.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new s4(oVar, 2);
                                        mVar12.K(objQ);
                                    }
                                }
                                e23.a aVar2 = (e23.a) objQ;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(x11.e.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar2);
                                mVar12.R();
                                final x11.e eVar = (x11.e) u1VarResolveViewModel;
                                p3.p1 p1VarC = s9.c.c(eVar.f188403g, mVar12);
                                List list = (List) s9.c.c(vVar12.a().d(null, "addedFoodResult"), mVar12).getF182175a();
                                boolean zR2 = mVar12.r(vVar12);
                                Object objQ2 = mVar12.q();
                                if (zR2) {
                                    objQ2 = new f5(vVar12, null);
                                    mVar12.K(objQ2);
                                } else {
                                    aVar.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new f5(vVar12, null);
                                        mVar12.K(objQ2);
                                    }
                                }
                                p3.l0.e((e23.p) objQ2, list, mVar12);
                                Unit unit = Unit.INSTANCE;
                                boolean zR3 = mVar12.r(vVar13);
                                Object objQ3 = mVar12.q();
                                if (zR3) {
                                    objQ3 = new g5(vVar13, null);
                                    mVar12.K(objQ3);
                                } else {
                                    aVar.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new g5(vVar13, null);
                                        mVar12.K(objQ3);
                                    }
                                }
                                p3.l0.e((e23.p) objQ3, unit, mVar12);
                                b11.e eVar2 = ((x11.b) p1VarC.getF182175a()).f188389i;
                                boolean zB = mVar12.B(p1VarC) | mVar12.r(eVar);
                                lc.m0 m0Var3 = m0Var;
                                boolean zR4 = zB | mVar12.r(m0Var3) | mVar12.r(oVar);
                                Object objQ4 = mVar12.q();
                                if (zR4) {
                                    objQ4 = new h5(p1VarC, eVar, m0Var3, oVar, null);
                                    m0Var2 = m0Var3;
                                    mVar12.K(objQ4);
                                } else {
                                    aVar.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new h5(p1VarC, eVar, m0Var3, oVar, null);
                                        m0Var2 = m0Var3;
                                        mVar12.K(objQ4);
                                    } else {
                                        m0Var2 = m0Var3;
                                    }
                                }
                                p3.l0.e((e23.p) objQ4, eVar2, mVar12);
                                List<b11.v> list2 = ((x11.b) p1VarC.getF182175a()).f188390j;
                                boolean zB2 = mVar12.B(p1VarC) | mVar12.r(vVar13) | mVar12.r(eVar) | mVar12.r(m0Var2) | mVar12.r(oVar);
                                Object objQ5 = mVar12.q();
                                if (zB2) {
                                    objQ5 = new i5(p1VarC, vVar13, eVar, m0Var2, oVar, null);
                                    mVar12.K(objQ5);
                                } else {
                                    aVar.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new i5(p1VarC, vVar13, eVar, m0Var2, oVar, null);
                                        mVar12.K(objQ5);
                                    }
                                }
                                p3.l0.e((e23.p) objQ5, list2, mVar12);
                                String strQ = gl1.y.Q(mVar12, R.string.generic_error_message);
                                Boolean boolValueOf = Boolean.valueOf(((x11.b) p1VarC.getF182175a()).f188384d);
                                boolean zB3 = mVar12.B(p1VarC) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar12.B(feVar2)) || (iIntValue & 24576) == 16384) | mVar12.B(strQ) | mVar12.r(eVar);
                                Object objQ6 = mVar12.q();
                                if (zB3) {
                                    objQ6 = new j5(feVar2, strQ, eVar, p1VarC, null);
                                    feVar = feVar2;
                                    mVar12.K(objQ6);
                                } else {
                                    aVar.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new j5(feVar2, strQ, eVar, p1VarC, null);
                                        feVar = feVar2;
                                        mVar12.K(objQ6);
                                    } else {
                                        feVar = feVar2;
                                    }
                                }
                                p3.l0.e((e23.p) objQ6, boolValueOf, mVar12);
                                x11.b bVar = (x11.b) p1VarC.getF182175a();
                                boolean zR5 = mVar12.r(eVar);
                                Object objQ7 = mVar12.q();
                                if (zR5) {
                                    final int i36 = 3;
                                    objQ7 = new e23.a() { // from class: b21.r4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            x11.b bVar2;
                                            switch (i36) {
                                                case 0:
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = eVar.f188402f;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                    break;
                                                case 2:
                                                    eVar.x4();
                                                    break;
                                                default:
                                                    r53.p2 p2Var3 = eVar.f188402f;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                        bVar2 = (x11.b) value3;
                                                    } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ7);
                                } else {
                                    aVar.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        final int i37 = 3;
                                        objQ7 = new e23.a() { // from class: b21.r4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                x11.b bVar2;
                                                switch (i37) {
                                                    case 0:
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = eVar.f188402f;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                        break;
                                                    case 2:
                                                        eVar.x4();
                                                        break;
                                                    default:
                                                        r53.p2 p2Var3 = eVar.f188402f;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                            bVar2 = (x11.b) value3;
                                                        } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ7);
                                    }
                                }
                                e23.a aVar3 = (e23.a) objQ7;
                                boolean zR6 = mVar12.r(eVar);
                                Object objQ8 = mVar12.q();
                                if (zR6) {
                                    objQ8 = new e23.l() { // from class: b21.q4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            switch (i29) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    x11.e eVar3 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                    break;
                                                case 1:
                                                    Bitmap bitmap = (Bitmap) obj9;
                                                    bitmap.getClass();
                                                    x11.e eVar4 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                    break;
                                                default:
                                                    x11.a aVar6 = (x11.a) obj9;
                                                    aVar6.getClass();
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ8);
                                } else {
                                    aVar.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new e23.l() { // from class: b21.q4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                switch (i29) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        x11.e eVar3 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                        break;
                                                    case 1:
                                                        Bitmap bitmap = (Bitmap) obj9;
                                                        bitmap.getClass();
                                                        x11.e eVar4 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                        break;
                                                    default:
                                                        x11.a aVar6 = (x11.a) obj9;
                                                        aVar6.getClass();
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ8);
                                    }
                                }
                                e23.l lVar = (e23.l) objQ8;
                                boolean zR7 = mVar12.r(eVar) | mVar12.r(m0Var2) | mVar12.r(oVar);
                                Object objQ9 = mVar12.q();
                                if (zR7) {
                                    final int i38 = 0;
                                    objQ9 = new e23.a() { // from class: b21.d5
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i38) {
                                                case 0:
                                                    eVar.x4();
                                                    l4.o oVar2 = oVar;
                                                    oVar2.getClass();
                                                    lc.y.l(m0Var2, new l4.w0(b63.u.Companion.a(b63.u.INSTANCE, oVar2.f14937c), (String) null, oVar2.f14940f));
                                                    break;
                                                default:
                                                    eVar.x4();
                                                    l4.o oVar3 = oVar;
                                                    oVar3.getClass();
                                                    lc.y.l(m0Var2, new l4.j((Long) null, b63.u.Companion.a(b63.u.INSTANCE, oVar3.f14937c), oVar3.f14940f, 1, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ9);
                                } else {
                                    aVar.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i39 = 0;
                                        objQ9 = new e23.a() { // from class: b21.d5
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i39) {
                                                    case 0:
                                                        eVar.x4();
                                                        l4.o oVar2 = oVar;
                                                        oVar2.getClass();
                                                        lc.y.l(m0Var2, new l4.w0(b63.u.Companion.a(b63.u.INSTANCE, oVar2.f14937c), (String) null, oVar2.f14940f));
                                                        break;
                                                    default:
                                                        eVar.x4();
                                                        l4.o oVar3 = oVar;
                                                        oVar3.getClass();
                                                        lc.y.l(m0Var2, new l4.j((Long) null, b63.u.Companion.a(b63.u.INSTANCE, oVar3.f14937c), oVar3.f14940f, 1, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ9);
                                    }
                                }
                                e23.a aVar4 = (e23.a) objQ9;
                                boolean zR8 = mVar12.r(eVar) | mVar12.r(m0Var2) | mVar12.r(oVar);
                                Object objQ10 = mVar12.q();
                                if (zR8) {
                                    final int i310 = 1;
                                    objQ10 = new e23.a() { // from class: b21.d5
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i310) {
                                                case 0:
                                                    eVar.x4();
                                                    l4.o oVar2 = oVar;
                                                    oVar2.getClass();
                                                    lc.y.l(m0Var2, new l4.w0(b63.u.Companion.a(b63.u.INSTANCE, oVar2.f14937c), (String) null, oVar2.f14940f));
                                                    break;
                                                default:
                                                    eVar.x4();
                                                    l4.o oVar3 = oVar;
                                                    oVar3.getClass();
                                                    lc.y.l(m0Var2, new l4.j((Long) null, b63.u.Companion.a(b63.u.INSTANCE, oVar3.f14937c), oVar3.f14940f, 1, (p005kotlin.jvm.internal.j) null));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ10);
                                } else {
                                    aVar.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        final int i311 = 1;
                                        objQ10 = new e23.a() { // from class: b21.d5
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i311) {
                                                    case 0:
                                                        eVar.x4();
                                                        l4.o oVar2 = oVar;
                                                        oVar2.getClass();
                                                        lc.y.l(m0Var2, new l4.w0(b63.u.Companion.a(b63.u.INSTANCE, oVar2.f14937c), (String) null, oVar2.f14940f));
                                                        break;
                                                    default:
                                                        eVar.x4();
                                                        l4.o oVar3 = oVar;
                                                        oVar3.getClass();
                                                        lc.y.l(m0Var2, new l4.j((Long) null, b63.u.Companion.a(b63.u.INSTANCE, oVar3.f14937c), oVar3.f14940f, 1, (p005kotlin.jvm.internal.j) null));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ10);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ10;
                                boolean zR9 = mVar12.r(eVar);
                                Object objQ11 = mVar12.q();
                                if (zR9) {
                                    final int i45 = 0;
                                    objQ11 = new e23.l() { // from class: b21.q4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            switch (i45) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    x11.e eVar3 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                    break;
                                                case 1:
                                                    Bitmap bitmap = (Bitmap) obj9;
                                                    bitmap.getClass();
                                                    x11.e eVar4 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                    break;
                                                default:
                                                    x11.a aVar6 = (x11.a) obj9;
                                                    aVar6.getClass();
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ11);
                                } else {
                                    aVar.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        final int i46 = 0;
                                        objQ11 = new e23.l() { // from class: b21.q4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                switch (i46) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        x11.e eVar3 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                        break;
                                                    case 1:
                                                        Bitmap bitmap = (Bitmap) obj9;
                                                        bitmap.getClass();
                                                        x11.e eVar4 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                        break;
                                                    default:
                                                        x11.a aVar6 = (x11.a) obj9;
                                                        aVar6.getClass();
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ11);
                                    }
                                }
                                e23.l lVar2 = (e23.l) objQ11;
                                boolean zR10 = mVar12.r(eVar);
                                Object objQ12 = mVar12.q();
                                if (zR10) {
                                    final int i47 = 1;
                                    objQ12 = new e23.l() { // from class: b21.q4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            switch (i47) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    x11.e eVar3 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                    break;
                                                case 1:
                                                    Bitmap bitmap = (Bitmap) obj9;
                                                    bitmap.getClass();
                                                    x11.e eVar4 = eVar;
                                                    ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                    break;
                                                default:
                                                    x11.a aVar6 = (x11.a) obj9;
                                                    aVar6.getClass();
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ12);
                                } else {
                                    aVar.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        final int i48 = 1;
                                        objQ12 = new e23.l() { // from class: b21.q4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                switch (i48) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        x11.e eVar3 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new x11.c(eVar3, str, null), 3);
                                                        break;
                                                    case 1:
                                                        Bitmap bitmap = (Bitmap) obj9;
                                                        bitmap.getClass();
                                                        x11.e eVar4 = eVar;
                                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new x11.d(eVar4, bitmap, null), 3);
                                                        break;
                                                    default:
                                                        x11.a aVar6 = (x11.a) obj9;
                                                        aVar6.getClass();
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        if (aVar6 != ((x11.b) p2Var.getValue()).f188382b) {
                                                            do {
                                                                value = p2Var.getValue();
                                                            } while (!p2Var.b(value, x11.b.a((x11.b) value, aVar6, false, false, false, false, false, false, null, null, 1021)));
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ12);
                                    }
                                }
                                e23.l lVar3 = (e23.l) objQ12;
                                boolean zR11 = mVar12.r(eVar);
                                Object objQ13 = mVar12.q();
                                if (zR11) {
                                    final int i49 = 0;
                                    objQ13 = new e23.a() { // from class: b21.r4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            x11.b bVar2;
                                            switch (i49) {
                                                case 0:
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = eVar.f188402f;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                    break;
                                                case 2:
                                                    eVar.x4();
                                                    break;
                                                default:
                                                    r53.p2 p2Var3 = eVar.f188402f;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                        bVar2 = (x11.b) value3;
                                                    } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ13);
                                } else {
                                    aVar.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        final int i410 = 0;
                                        objQ13 = new e23.a() { // from class: b21.r4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                x11.b bVar2;
                                                switch (i410) {
                                                    case 0:
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = eVar.f188402f;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                        break;
                                                    case 2:
                                                        eVar.x4();
                                                        break;
                                                    default:
                                                        r53.p2 p2Var3 = eVar.f188402f;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                            bVar2 = (x11.b) value3;
                                                        } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ13);
                                    }
                                }
                                e23.a aVar6 = (e23.a) objQ13;
                                boolean zR12 = mVar12.r(eVar);
                                fe feVar3 = feVar;
                                Object objQ14 = mVar12.q();
                                if (zR12) {
                                    final int i55 = 1;
                                    objQ14 = new e23.a() { // from class: b21.r4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            x11.b bVar2;
                                            switch (i55) {
                                                case 0:
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = eVar.f188402f;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                    break;
                                                case 2:
                                                    eVar.x4();
                                                    break;
                                                default:
                                                    r53.p2 p2Var3 = eVar.f188402f;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                        bVar2 = (x11.b) value3;
                                                    } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ14);
                                } else {
                                    aVar.getClass();
                                    if (objQ14 == p3.m.a.f135155b) {
                                        final int i56 = 1;
                                        objQ14 = new e23.a() { // from class: b21.r4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                x11.b bVar2;
                                                switch (i56) {
                                                    case 0:
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = eVar.f188402f;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                        break;
                                                    case 2:
                                                        eVar.x4();
                                                        break;
                                                    default:
                                                        r53.p2 p2Var3 = eVar.f188402f;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                            bVar2 = (x11.b) value3;
                                                        } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ14);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ14;
                                boolean zR13 = mVar12.r(eVar);
                                Object objQ15 = mVar12.q();
                                if (zR13) {
                                    final int i57 = 2;
                                    objQ15 = new e23.a() { // from class: b21.r4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            x11.b bVar2;
                                            switch (i57) {
                                                case 0:
                                                    r53.p2 p2Var = eVar.f188402f;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = eVar.f188402f;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                    break;
                                                case 2:
                                                    eVar.x4();
                                                    break;
                                                default:
                                                    r53.p2 p2Var3 = eVar.f188402f;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                        bVar2 = (x11.b) value3;
                                                    } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ15);
                                } else {
                                    aVar.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        final int i58 = 2;
                                        objQ15 = new e23.a() { // from class: b21.r4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                x11.b bVar2;
                                                switch (i58) {
                                                    case 0:
                                                        r53.p2 p2Var = eVar.f188402f;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, x11.b.a((x11.b) value, null, false, true, false, false, true, false, null, null, 947)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = eVar.f188402f;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, x11.b.a((x11.b) value2, null, true, false, false, false, false, false, null, null, 1019)));
                                                        break;
                                                    case 2:
                                                        eVar.x4();
                                                        break;
                                                    default:
                                                        r53.p2 p2Var3 = eVar.f188402f;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                            bVar2 = (x11.b) value3;
                                                        } while (!p2Var3.b(value3, x11.b.a(bVar2, null, false, false, false, false, false, !bVar2.f188388h, null, null, 895)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ15);
                                    }
                                }
                                w11.d.g(feVar3, bVar, aVar3, lVar, aVar4, aVar5, lVar2, lVar3, aVar6, aVar7, gVar, (e23.a) objQ15, mVar12, (iIntValue >> 12) & 14);
                                return unit;
                            default:
                                m21.v vVar14 = (m21.v) u1Var;
                                fe feVar4 = (fe) obj8;
                                int iIntValue2 = num.intValue();
                                ((List) obj5).getClass();
                                ((List) obj6).getClass();
                                ((List) obj7).getClass();
                                feVar4.getClass();
                                p3.x1 x1Var13 = p3.n.f135158a;
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l4.z0 z0Var = (l4.z0) lc.w.a(vVar12, t0Var2.b(l4.z0.class));
                                boolean zR14 = mVar12.r(z0Var);
                                Object objQ16 = mVar12.q();
                                if (zR14) {
                                    objQ16 = new s4(z0Var, 0);
                                    mVar12.K(objQ16);
                                } else {
                                    aVar.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        objQ16 = new s4(z0Var, 0);
                                        mVar12.K(objQ16);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ16;
                                mVar12.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar12);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(y21.c.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar8);
                                mVar12.R();
                                final y21.c cVar = (y21.c) u1VarResolveViewModel2;
                                p3.p1 p1VarC2 = s9.c.c(cVar.f194239f, mVar12);
                                Unit unit2 = Unit.INSTANCE;
                                boolean zR15 = mVar12.r(z0Var) | mVar12.r(vVar14);
                                Object objQ17 = mVar12.q();
                                if (zR15) {
                                    objQ17 = new k5(z0Var, vVar14, null);
                                    mVar12.K(objQ17);
                                } else {
                                    aVar.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        objQ17 = new k5(z0Var, vVar14, null);
                                        mVar12.K(objQ17);
                                    }
                                }
                                p3.l0.e((e23.p) objQ17, unit2, mVar12);
                                List<b11.a.C0202a> list3 = ((y21.a) p1VarC2.getF182175a()).f194229f;
                                boolean zB4 = mVar12.B(p1VarC2) | mVar12.r(cVar) | mVar12.r(z0Var) | mVar12.r(vVar14);
                                lc.m0 m0Var4 = m0Var;
                                boolean zR16 = zB4 | mVar12.r(m0Var4);
                                Object objQ18 = mVar12.q();
                                if (zR16) {
                                    Object l5Var2 = new l5(p1VarC2, cVar, z0Var, vVar14, m0Var4, null);
                                    mVar12.K(l5Var2);
                                    objQ18 = l5Var2;
                                } else {
                                    aVar.getClass();
                                    if (objQ18 == p3.m.a.f135155b) {
                                        Object l5Var3 = new l5(p1VarC2, cVar, z0Var, vVar14, m0Var4, null);
                                        mVar12.K(l5Var3);
                                        objQ18 = l5Var3;
                                    }
                                }
                                p3.l0.e((e23.p) objQ18, list3, mVar12);
                                y21.a aVar9 = (y21.a) p1VarC2.getF182175a();
                                boolean zR17 = mVar12.r(cVar);
                                Object objQ19 = mVar12.q();
                                if (zR17) {
                                    objQ19 = new e23.l() { // from class: b21.t4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            switch (i34) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                    break;
                                                case 1:
                                                    boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                    break;
                                                default:
                                                    String str2 = (String) obj9;
                                                    str2.getClass();
                                                    String string = d53.w.i0(str2).toString();
                                                    if (string.length() != 0) {
                                                        y21.c cVar2 = cVar;
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                        ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ19);
                                } else {
                                    aVar.getClass();
                                    if (objQ19 == p3.m.a.f135155b) {
                                        objQ19 = new e23.l() { // from class: b21.t4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                switch (i34) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                        break;
                                                    case 1:
                                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                        break;
                                                    default:
                                                        String str2 = (String) obj9;
                                                        str2.getClass();
                                                        String string = d53.w.i0(str2).toString();
                                                        if (string.length() != 0) {
                                                            y21.c cVar2 = cVar;
                                                            r53.p2 p2Var3 = cVar2.f194238e;
                                                            do {
                                                                value3 = p2Var3.getValue();
                                                            } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                            ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ19);
                                    }
                                }
                                e23.l lVar4 = (e23.l) objQ19;
                                boolean zR18 = mVar12.r(cVar);
                                Object objQ20 = mVar12.q();
                                if (zR18) {
                                    objQ20 = new e23.l() { // from class: b21.t4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            switch (i30) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                    break;
                                                case 1:
                                                    boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                    break;
                                                default:
                                                    String str2 = (String) obj9;
                                                    str2.getClass();
                                                    String string = d53.w.i0(str2).toString();
                                                    if (string.length() != 0) {
                                                        y21.c cVar2 = cVar;
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                        ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ20);
                                } else {
                                    aVar.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        objQ20 = new e23.l() { // from class: b21.t4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                switch (i30) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                        break;
                                                    case 1:
                                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                        break;
                                                    default:
                                                        String str2 = (String) obj9;
                                                        str2.getClass();
                                                        String string = d53.w.i0(str2).toString();
                                                        if (string.length() != 0) {
                                                            y21.c cVar2 = cVar;
                                                            r53.p2 p2Var3 = cVar2.f194238e;
                                                            do {
                                                                value3 = p2Var3.getValue();
                                                            } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                            ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ20);
                                    }
                                }
                                e23.l lVar5 = (e23.l) objQ20;
                                boolean zR19 = mVar12.r(cVar);
                                Object objQ21 = mVar12.q();
                                if (zR19) {
                                    objQ21 = new e23.l() { // from class: b21.t4
                                        @Override // e23.l
                                        public final Object invoke(Object obj9) {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            switch (i29) {
                                                case 0:
                                                    String str = (String) obj9;
                                                    str.getClass();
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                    break;
                                                case 1:
                                                    boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                    break;
                                                default:
                                                    String str2 = (String) obj9;
                                                    str2.getClass();
                                                    String string = d53.w.i0(str2).toString();
                                                    if (string.length() != 0) {
                                                        y21.c cVar2 = cVar;
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                        ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ21);
                                } else {
                                    aVar.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new e23.l() { // from class: b21.t4
                                            @Override // e23.l
                                            public final Object invoke(Object obj9) {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                switch (i29) {
                                                    case 0:
                                                        String str = (String) obj9;
                                                        str.getClass();
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, str, false, false, false, null, false, 125)));
                                                        break;
                                                    case 1:
                                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, zBooleanValue, null, false, false, false, null, false, 126)));
                                                        break;
                                                    default:
                                                        String str2 = (String) obj9;
                                                        str2.getClass();
                                                        String string = d53.w.i0(str2).toString();
                                                        if (string.length() != 0) {
                                                            y21.c cVar2 = cVar;
                                                            r53.p2 p2Var3 = cVar2.f194238e;
                                                            do {
                                                                value3 = p2Var3.getValue();
                                                            } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, string, true, false, false, null, false, 64)));
                                                            ge1.b.T(androidx.lifecycle.v1.a(cVar2), null, null, new y21.b(cVar2, string, null), 3);
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ21);
                                    }
                                }
                                e23.l lVar6 = (e23.l) objQ21;
                                boolean zR20 = mVar12.r(cVar);
                                Object objQ22 = mVar12.q();
                                if (zR20) {
                                    objQ22 = new e23.a() { // from class: b21.u4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            Object value4;
                                            switch (i34) {
                                                case 0:
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                    break;
                                                case 2:
                                                    y21.c cVar2 = cVar;
                                                    cVar2.f194235b.C(false);
                                                    r53.p2 p2Var3 = cVar2.f194238e;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                    } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                    break;
                                                default:
                                                    y21.c cVar3 = cVar;
                                                    cVar3.f194235b.C(true);
                                                    r53.p2 p2Var4 = cVar3.f194238e;
                                                    do {
                                                        value4 = p2Var4.getValue();
                                                    } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ22);
                                } else {
                                    aVar.getClass();
                                    if (objQ22 == p3.m.a.f135155b) {
                                        objQ22 = new e23.a() { // from class: b21.u4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                switch (i34) {
                                                    case 0:
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                        break;
                                                    case 2:
                                                        y21.c cVar2 = cVar;
                                                        cVar2.f194235b.C(false);
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                        break;
                                                    default:
                                                        y21.c cVar3 = cVar;
                                                        cVar3.f194235b.C(true);
                                                        r53.p2 p2Var4 = cVar3.f194238e;
                                                        do {
                                                            value4 = p2Var4.getValue();
                                                        } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ22);
                                    }
                                }
                                e23.a aVar10 = (e23.a) objQ22;
                                boolean zR21 = mVar12.r(cVar);
                                Object objQ23 = mVar12.q();
                                if (zR21) {
                                    objQ23 = new e23.a() { // from class: b21.u4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            Object value4;
                                            switch (i30) {
                                                case 0:
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                    break;
                                                case 2:
                                                    y21.c cVar2 = cVar;
                                                    cVar2.f194235b.C(false);
                                                    r53.p2 p2Var3 = cVar2.f194238e;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                    } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                    break;
                                                default:
                                                    y21.c cVar3 = cVar;
                                                    cVar3.f194235b.C(true);
                                                    r53.p2 p2Var4 = cVar3.f194238e;
                                                    do {
                                                        value4 = p2Var4.getValue();
                                                    } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ23);
                                } else {
                                    aVar.getClass();
                                    if (objQ23 == p3.m.a.f135155b) {
                                        objQ23 = new e23.a() { // from class: b21.u4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                switch (i30) {
                                                    case 0:
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                        break;
                                                    case 2:
                                                        y21.c cVar2 = cVar;
                                                        cVar2.f194235b.C(false);
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                        break;
                                                    default:
                                                        y21.c cVar3 = cVar;
                                                        cVar3.f194235b.C(true);
                                                        r53.p2 p2Var4 = cVar3.f194238e;
                                                        do {
                                                            value4 = p2Var4.getValue();
                                                        } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ23);
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ23;
                                boolean zR22 = mVar12.r(cVar);
                                Object objQ24 = mVar12.q();
                                if (zR22) {
                                    objQ24 = new e23.a() { // from class: b21.u4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            Object value4;
                                            switch (i29) {
                                                case 0:
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                    break;
                                                case 2:
                                                    y21.c cVar2 = cVar;
                                                    cVar2.f194235b.C(false);
                                                    r53.p2 p2Var3 = cVar2.f194238e;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                    } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                    break;
                                                default:
                                                    y21.c cVar3 = cVar;
                                                    cVar3.f194235b.C(true);
                                                    r53.p2 p2Var4 = cVar3.f194238e;
                                                    do {
                                                        value4 = p2Var4.getValue();
                                                    } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ24);
                                } else {
                                    aVar.getClass();
                                    if (objQ24 == p3.m.a.f135155b) {
                                        objQ24 = new e23.a() { // from class: b21.u4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                switch (i29) {
                                                    case 0:
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                        break;
                                                    case 2:
                                                        y21.c cVar2 = cVar;
                                                        cVar2.f194235b.C(false);
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                        break;
                                                    default:
                                                        y21.c cVar3 = cVar;
                                                        cVar3.f194235b.C(true);
                                                        r53.p2 p2Var4 = cVar3.f194238e;
                                                        do {
                                                            value4 = p2Var4.getValue();
                                                        } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ24);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ24;
                                boolean zR23 = mVar12.r(cVar);
                                Object objQ25 = mVar12.q();
                                if (zR23) {
                                    final int i59 = 3;
                                    objQ25 = new e23.a() { // from class: b21.u4
                                        @Override // e23.a
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            Object value3;
                                            Object value4;
                                            switch (i59) {
                                                case 0:
                                                    r53.p2 p2Var = cVar.f194238e;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                    break;
                                                case 1:
                                                    r53.p2 p2Var2 = cVar.f194238e;
                                                    do {
                                                        value2 = p2Var2.getValue();
                                                    } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                    break;
                                                case 2:
                                                    y21.c cVar2 = cVar;
                                                    cVar2.f194235b.C(false);
                                                    r53.p2 p2Var3 = cVar2.f194238e;
                                                    do {
                                                        value3 = p2Var3.getValue();
                                                    } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                    break;
                                                default:
                                                    y21.c cVar3 = cVar;
                                                    cVar3.f194235b.C(true);
                                                    r53.p2 p2Var4 = cVar3.f194238e;
                                                    do {
                                                        value4 = p2Var4.getValue();
                                                    } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar12.K(objQ25);
                                } else {
                                    aVar.getClass();
                                    if (objQ25 == p3.m.a.f135155b) {
                                        final int i510 = 3;
                                        objQ25 = new e23.a() { // from class: b21.u4
                                            @Override // e23.a
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                switch (i510) {
                                                    case 0:
                                                        r53.p2 p2Var = cVar.f194238e;
                                                        do {
                                                            value = p2Var.getValue();
                                                        } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, true, null, false, 98)));
                                                        break;
                                                    case 1:
                                                        r53.p2 p2Var2 = cVar.f194238e;
                                                        do {
                                                            value2 = p2Var2.getValue();
                                                        } while (!p2Var2.b(value2, y21.a.a((y21.a) value2, false, "", false, false, false, null, false, 64)));
                                                        break;
                                                    case 2:
                                                        y21.c cVar2 = cVar;
                                                        cVar2.f194235b.C(false);
                                                        r53.p2 p2Var3 = cVar2.f194238e;
                                                        do {
                                                            value3 = p2Var3.getValue();
                                                        } while (!p2Var3.b(value3, y21.a.a((y21.a) value3, false, null, false, false, false, null, false, 63)));
                                                        break;
                                                    default:
                                                        y21.c cVar3 = cVar;
                                                        cVar3.f194235b.C(true);
                                                        r53.p2 p2Var4 = cVar3.f194238e;
                                                        do {
                                                            value4 = p2Var4.getValue();
                                                        } while (!p2Var4.b(value4, y21.a.a((y21.a) value4, false, null, false, false, false, null, true, 63)));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar12.K(objQ25);
                                    }
                                }
                                w21.m.f(aVar9, feVar4, lVar4, lVar5, lVar6, aVar10, aVar11, aVar12, (e23.a) objQ25, gVar, mVar12, (iIntValue2 >> 9) & 112);
                                return unit2;
                        }
                    }
                }, mVar11), mVar11, ((iB11 >> 3) & 14) | 384);
                break;
            default:
                r1.l lVar = (r1.l) obj;
                lc.v vVar12 = (lc.v) obj2;
                p3.m mVar12 = (p3.m) obj3;
                int iB12 = androidx.room.a0.b((Integer) obj4, lVar, vVar12);
                p3.x1 x1Var12 = p3.n.f135158a;
                lc.m0 m0Var2 = this.f15124b;
                d1.a(vVar12, m0Var2, z3.f.c(1258077345, new a42.d0((Object) vVar12, (Object) m0Var2, (Object) lVar, (Object) this.f15125c, 2), mVar12), mVar12, ((iB12 >> 3) & 14) | 384);
                break;
        }
        return Unit.INSTANCE;
    }
}
