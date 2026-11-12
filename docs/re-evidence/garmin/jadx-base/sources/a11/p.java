package a11;

import am.x0;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import b21.d1;
import b21.l4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.google.maps.android.compose.clustering.ClusteringKt;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lc.m0;
import lc.u0;
import org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p3.c2;
import p3.l1;
import p3.n1;
import p3.p1;
import p3.x3;
import ta0.g1;
import yg2.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f365h;

    public /* synthetic */ p(e23.l lVar, p1 p1Var, n1 n1Var, p1 p1Var2, n1 n1Var2, p1 p1Var3, n1 n1Var3) {
        this.f358a = 8;
        this.f359b = lVar;
        this.f362e = p1Var;
        this.f363f = n1Var;
        this.f360c = p1Var2;
        this.f364g = n1Var2;
        this.f361d = p1Var3;
        this.f365h = n1Var3;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        double doubleValue;
        Object rVar;
        qk0.w wVarA;
        int intValue;
        int i14 = this.f358a;
        int i15 = 0;
        Object obj = this.f365h;
        Object obj2 = this.f364g;
        Object obj3 = this.f363f;
        Object obj4 = this.f362e;
        Object obj5 = this.f361d;
        Object obj6 = this.f360c;
        Object obj7 = this.f359b;
        switch (i14) {
            case 0:
                i iVar = (i) obj7;
                j0 j0Var = (j0) obj6;
                e23.p pVar = (e23.p) obj5;
                p1 p1Var = (p1) obj4;
                n1 n1Var = (n1) obj3;
                n1 n1Var2 = (n1) obj2;
                l1 l1Var = (l1) obj;
                int i16 = q.a.f366a[((r) p1Var.getF182175a()).ordinal()];
                if (i16 == 1) {
                    doubleValue = l1Var.getDoubleValue();
                } else {
                    if (i16 != 2) {
                        u0.r();
                        return null;
                    }
                    doubleValue = q.d(n1Var.getIntValue(), n1Var2.getIntValue(), iVar, j0Var.f326b);
                }
                pVar.invoke((r) p1Var.getF182175a(), Double.valueOf(doubleValue));
                return Unit.INSTANCE;
            case 1:
                i21.d dVar = (i21.d) obj6;
                q11.a aVar = (q11.a) obj5;
                l4.v0 v0Var = (l4.v0) obj4;
                String str = v0Var.f14978c;
                m0 m0Var = (m0) obj3;
                NutritionActivity.g gVar = (NutritionActivity.g) obj2;
                x3 x3Var = (x3) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = ((i53.c) obj7).iterator();
                while (it.hasNext()) {
                    p13.d0.v(arrayList, ((g21.p) it.next()).f75476d);
                }
                dVar.getClass();
                Set set = (Set) dVar.f87287t.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj8 : arrayList) {
                    if (p13.h0.R(set, ((b11.i) obj8).getF14315a())) {
                        arrayList2.add(obj8);
                    }
                }
                int[] iArr = d1.a.f14602a;
                int iOrdinal = aVar.ordinal();
                i01.a aVar2 = aVar.f142074c;
                int i17 = iArr[iOrdinal];
                if (i17 == 1 || i17 == 2) {
                    if (v0Var.f14980e) {
                        b63.o oVarB = b63.o.Companion.b(b63.o.INSTANCE, str);
                        if (aVar2 == null) {
                            aVar2 = i01.a.COPY;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            String f14315a = ((b11.i) it3.next()).getF14315a();
                            if (f14315a != null) {
                                arrayList3.add(f14315a);
                            }
                        }
                        rVar = new l4.y(aVar2, oVarB, arrayList3, v0Var.f14979d);
                    } else {
                        b63.o oVarB2 = b63.o.Companion.b(b63.o.INSTANCE, str);
                        if (aVar2 == null) {
                            aVar2 = i01.a.COPY;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            String f14315a2 = ((b11.i) it4.next()).getF14315a();
                            if (f14315a2 != null) {
                                arrayList4.add(f14315a2);
                            }
                        }
                        rVar = new l4.r(aVar2, oVarB2, arrayList4);
                    }
                    lc.y.l(m0Var, rVar);
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    boolean z14 = ((x01.j) x3Var.getF182175a()).f188286e.f188256e;
                    b63.o oVarB3 = b63.o.Companion.b(b63.o.INSTANCE, str);
                    oVarB3.getClass();
                    ge1.b.T(v1.a(dVar), null, null, new i21.e(dVar, oVarB3, arrayList2, z14, null), 3);
                    gVar.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                return ClusteringKt.Clustering$lambda$38$lambda$37((ClusterManager) obj7, (ClusterRenderer) obj6, (e23.l) obj5, (e23.l) obj4, (e23.l) obj3, (e23.l) obj2, (e23.l) obj);
            case 3:
                x3 x3Var2 = (x3) obj7;
                nj2.a aVar3 = (nj2.a) obj6;
                lc.y yVar = (lc.y) obj5;
                String str2 = (String) obj3;
                p1 p1Var2 = (p1) obj4;
                p1 p1Var3 = (p1) obj2;
                f4.u uVar = (f4.u) obj;
                Objects.toString(x3Var2.getF182175a());
                if (x3Var2.getF182175a() == null) {
                    c2 c2Var = aVar3.f126252d;
                    Boolean bool = Boolean.TRUE;
                    c2Var.setValue(bool);
                    p1Var2.setValue(bool);
                    lc.y.k(str2, yVar);
                } else {
                    aVar3.f126258j.m(null);
                    p1Var3.setValue(Boolean.TRUE);
                    fj2.g gVar2 = new fj2.g("phoneNumber", "INVALID");
                    aVar3.K4(gVar2, new li0.x(9));
                    nj2.a.b bVarD = gVar2.d();
                    if (bVarD != null) {
                        aVar3.K4(gVar2, new lj2.g(uVar, bVarD, 1));
                    }
                    c2 c2Var2 = aVar3.f126252d;
                    Boolean bool2 = Boolean.FALSE;
                    c2Var2.setValue(bool2);
                    p1Var2.setValue(bool2);
                }
                return Unit.INSTANCE;
            case 4:
                i53.f fVar = (i53.f) obj7;
                qs.g gVar3 = (qs.g) obj6;
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b bVar = (com.garmin.android.apps.connectmobile.activities.manual.eventType.b) obj5;
                Context context = (Context) obj3;
                p1 p1Var4 = (p1) obj4;
                p1 p1Var5 = (p1) obj2;
                p1 p1Var6 = (p1) obj;
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar4 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                if (p13.h0.R(fVar, (qs.g) p1Var4.getF182175a()) && !fVar.contains(gVar3) && bVar.f29202c != null && !bVar.v6().f133054d.isEmpty()) {
                    ls0.h hVar = new ls0.h(gVar3, 14, bVar, p1Var4);
                    androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(context);
                    aVar5.setTitle(context.getString(R.string.change_event_type_question));
                    aVar5.setMessage(context.getString(R.string.change_event_type_message));
                    aVar5.setCancelable(false);
                    aVar5.setPositiveButton(context.getString(R.string.lbl_common_continue), new hg1.g(27, hVar, gVar3));
                    aVar5.setNegativeButton(context.getString(R.string.lbl_cancel), new mt0.y(10));
                    aVar5.create().show();
                } else if (!fVar.contains(gVar3) || ((qs.g) p1Var4.getF182175a()) == gVar3) {
                    p1Var4.setValue(gVar3);
                    bVar.v6().f133057g = gVar3;
                } else {
                    p1Var5.setValue(null);
                    p1Var4.setValue(gVar3);
                    bVar.v6().f133057g = gVar3;
                }
                p1Var6.setValue(fVar.contains(gVar3) ? gVar3 : null);
                return Unit.INSTANCE;
            case 5:
                return ViewModelLazyKt.viewModelForClass$lambda$2((e23.a) obj7, (e23.a) obj6, (Fragment) obj5, (k23.d) obj4, (String) obj3, (Qualifier) obj2, (e23.a) obj);
            case 6:
                i53.d dVar2 = (i53.d) obj7;
                x3 x3Var3 = (x3) obj6;
                Context context2 = (Context) obj5;
                x3 x3Var4 = (x3) obj3;
                p1 p1Var7 = (p1) obj4;
                p1 p1Var8 = (p1) obj2;
                p1 p1Var9 = (p1) obj;
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = dVar2.entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry = (Map.Entry) it5.next();
                    x0 x0Var = (x0) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list == null || !list.isEmpty()) {
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            if (!((i53.e) p1Var8.getF182175a()).contains((x0) it6.next())) {
                                x0Var = null;
                            }
                        }
                    }
                    if (x0Var != null) {
                        arrayList5.add(x0Var);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it7 = dVar2.entrySet().iterator();
                while (it7.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it7.next();
                    x0 x0Var2 = (x0) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            if (!((i53.e) p1Var9.getF182175a()).contains((x0) it8.next())) {
                                x0Var2 = null;
                            }
                        }
                    }
                    if (x0Var2 != null) {
                        arrayList6.add(x0Var2);
                    }
                }
                Iterable<qk0.w> iterable = (Iterable) x3Var3.getF182175a();
                ArrayList arrayList7 = new ArrayList();
                for (qk0.w wVar : iterable) {
                    boolean z15 = wVar.f145166c;
                    x0 x0Var3 = wVar.f145164a;
                    if (z15) {
                        if (!arrayList6.contains(x0Var3)) {
                            wVar = null;
                        }
                        if (wVar != null) {
                            wVarA = qk0.w.a(wVar, arrayList5.contains(x0Var3));
                        } else {
                            wVarA = null;
                        }
                    } else {
                        if (!((i53.e) p1Var9.getF182175a()).contains(x0Var3)) {
                            wVar = null;
                        }
                        if (wVar != null) {
                            wVarA = qk0.w.a(wVar, ((i53.e) p1Var8.getF182175a()).contains(x0Var3));
                        } else {
                            wVarA = null;
                        }
                    }
                    if (wVarA != null) {
                        arrayList7.add(wVarA);
                    }
                }
                return qk0.r.f(context2, i53.a.e(arrayList7), ((Boolean) x3Var4.getF182175a()).booleanValue(), (String) p1Var7.getF182175a());
            case 7:
                nv.e eVar = (nv.e) obj7;
                e23.a aVar6 = (e23.a) obj6;
                o53.b0 b0Var = (o53.b0) obj3;
                Context context3 = (Context) obj2;
                p1 p1Var10 = (p1) obj4;
                mc mcVar = (mc) obj;
                e23.p pVar2 = (e23.p) obj5;
                if (eVar == nv.e.f127937o) {
                    aVar6.invoke();
                } else if (eVar.f127943d != null) {
                    p1Var10.setValue(eVar);
                    ge1.b.T(b0Var, null, null, new g1.c(mcVar, null), 3);
                } else {
                    g1.b(pVar2, context3, eVar);
                }
                return Unit.INSTANCE;
            case 8:
                e23.l lVar = (e23.l) obj7;
                n1 n1Var3 = (n1) obj2;
                p1 p1Var11 = (p1) obj5;
                n1 n1Var4 = (n1) obj;
                b63.o oVar = (b63.o) ((i53.c) ((p1) obj4).getF182175a()).get(((n1) obj3).getIntValue());
                if (((Boolean) ((p1) obj6).getF182175a()).booleanValue()) {
                    intValue = n1Var3.getIntValue();
                } else {
                    int intValue2 = n1Var3.getIntValue();
                    boolean z16 = ((w51.d1) p1Var11.getF182175a()) == w51.d1.AM;
                    if (!z16 || intValue2 != 12) {
                        i15 = z16 ? intValue2 : (z16 || intValue2 != 12) ? intValue2 + 12 : 12;
                    }
                    intValue = i15;
                }
                lVar.invoke(new b63.u(oVar.f16206a.getYear(), b63.b.b(oVar.c()), oVar.f16206a.getDayOfMonth(), intValue, n1Var4.getIntValue(), 0, 0));
                return Unit.INSTANCE;
            case 9:
                Context context4 = (Context) obj6;
                e23.l lVar2 = (e23.l) obj5;
                p1 p1Var12 = (p1) obj4;
                p1 p1Var13 = (p1) obj3;
                p1 p1Var14 = (p1) obj2;
                p1 p1Var15 = (p1) obj;
                String str3 = ((dy1.p) obj7).f61603i;
                if (str3 == null) {
                    str3 = "";
                }
                p1Var12.setValue(str3);
                String string = context4.getString(R.string.plan_name);
                string.getClass();
                p1Var13.setValue(string);
                p1Var14.setValue(lVar2);
                p1Var15.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                o13.p pVar3 = (o13.p) obj7;
                ((p1) obj4).setValue((String) pVar3.f128595b);
                String string2 = ((Context) obj6).getString(R.string.workout_name);
                string2.getClass();
                ((p1) obj3).setValue(string2);
                ((p1) obj2).setValue(new w02.b(23, (e23.p) obj5, pVar3));
                ((p1) obj).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 11:
                yg2.o oVar2 = (yg2.o) obj7;
                yg2.h0 h0Var = (yg2.h0) obj6;
                yg2.u0 u0Var = (yg2.u0) obj5;
                yg2.a aVar7 = (yg2.a) obj3;
                o53.b0 b0Var2 = (o53.b0) obj2;
                p1 p1Var16 = (p1) obj4;
                e2.i0 i0Var = (e2.i0) obj;
                int iG0 = p13.h0.g0(h0Var != null ? fg2.h0.f(h0Var, oVar2) : null, oVar2.b());
                u0Var.D4(aVar7.getStartStepIndex());
                q0.c(p1Var16, false);
                ge1.b.T(b0Var2, null, null, new q0.j(iG0, i0Var, null), 3);
                return Unit.INSTANCE;
            default:
                return GetViewModelKt.lazyResolveViewModel$lambda$1((k23.d) obj7, (e23.a) obj6, (String) obj5, (e23.a) obj4, (Qualifier) obj3, (Scope) obj2, (e23.a) obj);
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i14) {
        this.f358a = i14;
        this.f359b = obj;
        this.f360c = obj2;
        this.f361d = obj3;
        this.f362e = obj4;
        this.f363f = obj5;
        this.f364g = obj6;
        this.f365h = obj7;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, p1 p1Var, p1 p1Var2, Object obj5, int i14) {
        this.f358a = i14;
        this.f359b = obj;
        this.f360c = obj2;
        this.f361d = obj3;
        this.f363f = obj4;
        this.f362e = p1Var;
        this.f364g = p1Var2;
        this.f365h = obj5;
    }

    public /* synthetic */ p(nv.e eVar, e23.a aVar, o53.b0 b0Var, Context context, p1 p1Var, mc mcVar, e23.p pVar) {
        this.f358a = 7;
        this.f359b = eVar;
        this.f360c = aVar;
        this.f363f = b0Var;
        this.f364g = context;
        this.f362e = p1Var;
        this.f365h = mcVar;
        this.f361d = pVar;
    }

    public /* synthetic */ p(o13.p pVar, Context context, p1 p1Var, p1 p1Var2, e23.p pVar2, p1 p1Var3, p1 p1Var4) {
        this.f358a = 10;
        this.f359b = pVar;
        this.f360c = context;
        this.f362e = p1Var;
        this.f363f = p1Var2;
        this.f361d = pVar2;
        this.f364g = p1Var3;
        this.f365h = p1Var4;
    }

    public /* synthetic */ p(yg2.o oVar, yg2.h0 h0Var, yg2.u0 u0Var, yg2.a aVar, o53.b0 b0Var, p1 p1Var, e2.i0 i0Var) {
        this.f358a = 11;
        this.f359b = oVar;
        this.f360c = h0Var;
        this.f361d = u0Var;
        this.f363f = aVar;
        this.f364g = b0Var;
        this.f362e = p1Var;
        this.f365h = i0Var;
    }
}
