package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/u2;", "Lew1/u;", "<init>", "()V", "a", "", "Lmv1/f;", "selectedDays", "", "enableNext", "", "footerMsgText", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u2 extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f66789c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66790b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66791a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f66791a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66791a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66792a = aVar;
            this.f66793b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66792a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66793b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66794a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66794a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public u2() {
        super(R.layout.fbt_activity_view);
        this.f66790b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new b(this), new d(this), new c(null, this));
    }

    public static o13.p z6() {
        return new o13.p(1, 2);
    }

    public final o13.p<String, Boolean> A6(Context context, List<mv1.f> list, int i14, int i15) {
        list.getClass();
        return !tu1.a.d(i14, i15, list) ? new o13.p<>(context.getString(R.string.must_have_swim_days), Boolean.FALSE) : new o13.p<>("", Boolean.TRUE);
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.set_schedule));
        }
        tu1.a.p(view2, R.id.composable_container, new z3.e(1232379087, true, new dh1.a(this, 20)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    public final void w6(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        jv1.v vVar;
        ?? B;
        i53.c cVar;
        List<String> list;
        boolean z15;
        boolean z16;
        boolean z17;
        List<String> list2;
        ?? B2;
        p3.o0 o0VarE = mVar.E(-2052685116);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            aw1.h hVarY6 = y6();
            jv1.s sVarI6 = hVarY6.i6();
            i53.c cVarE = null;
            if (sVarI6 != null) {
                ArrayList arrayListE = sVarI6.e();
                List<String> list3 = sVarI6.f101135n;
                List<String> list4 = sVarI6.f101136o;
                if (list4 != null) {
                    B2 = new ArrayList();
                    for (Object obj : list4) {
                        if (!sVarI6.e().contains((String) obj)) {
                            B2.add(obj);
                        }
                    }
                } else {
                    B2 = sVarI6.b(sVarI6.e());
                }
                vVar = new jv1.v(arrayListE, list3, B2);
            } else {
                vVar = null;
            }
            androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
            if (vVar != null) {
                y0Var.m(vVar);
            }
            Context contextB = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
            jv1.s sVarI7 = hVarY6.i6();
            List<String> listE = sVarI7 != null ? sVarI7.e() : p13.j0.f134944a;
            jv1.s sVarI8 = hVarY6.i6();
            List<String> list5 = sVarI8 != null ? sVarI8.f101135n : null;
            jv1.s sVarI9 = hVarY6.i6();
            if (sVarI9 == null || (list2 = sVarI9.f101136o) == null) {
                jv1.s sVarI10 = hVarY6.i6();
                B = sVarI10 != null ? sVarI10.b(listE) : 0;
            } else {
                B = new ArrayList();
                for (Object obj2 : list2) {
                    if (!listE.contains((String) obj2)) {
                        B.add(obj2);
                    }
                }
            }
            if (B != 0) {
                ArrayList arrayList = new ArrayList(p13.y.r(B, 10));
                Iterator it = B.iterator();
                while (it.hasNext()) {
                    wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList);
                }
                cVarE = i53.a.e(arrayList);
            }
            w13.c cVar2 = wt1.q.f187129o;
            ArrayList arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
            Iterator it3 = cVar2.iterator();
            while (true) {
                String string = "";
                if (!it3.hasNext()) {
                    break;
                }
                wt1.q qVar = (wt1.q) it3.next();
                boolean z18 = cVarE != null && cVarE.contains(qVar);
                if (list5 == null || list5.isEmpty()) {
                    cVar = cVarE;
                    list = listE;
                    z15 = false;
                } else {
                    Iterator it4 = list5.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            cVar = cVarE;
                            list = listE;
                            if (d53.w.z((String) it4.next(), qVar.toString(), true)) {
                                z15 = true;
                            } else {
                                listE = list;
                                cVarE = cVar;
                            }
                        } else {
                            cVar = cVarE;
                            list = listE;
                            z15 = false;
                        }
                    }
                }
                if (list == null || !list.isEmpty()) {
                    Iterator it5 = list.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            z16 = z15;
                            Iterator it6 = it5;
                            if (d53.w.z((String) it5.next(), qVar.toString(), true)) {
                                z17 = true;
                            } else {
                                it5 = it6;
                                z15 = z16;
                            }
                        } else {
                            z16 = z15;
                            z17 = false;
                        }
                    }
                } else {
                    z16 = z15;
                    z17 = false;
                }
                boolean z19 = (hVarY6.f13385r1 && hVarY6.P1 == null) || !z17;
                if (z16) {
                    string = contextB.getString(R.string.long_workout_day);
                } else if (z17) {
                    string = contextB.getString(R.string.lbl_rest_day);
                }
                string.getClass();
                arrayList2.add(new mv1.f(qVar, string, z18, z19));
                listE = list;
                cVarE = cVar;
            }
            ArrayList arrayListR = tu1.a.r(new ArrayList(arrayList2));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(arrayListR);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n("");
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) objQ3;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            o13.p<String, Boolean> pVarA6 = A6(contextRequireContext, (List) p1Var.getF182175a(), ((Number) z6().f128594a).intValue(), ((Number) z6().f128595b).intValue());
            String str = pVarA6.f128594a;
            Boolean bool = pVarA6.f128595b;
            bool.getClass();
            p1Var3.setValue(str);
            p1Var2.setValue(bool);
            int iIntValue = ((Number) z6().f128594a).intValue();
            int iIntValue2 = ((Number) z6().f128595b).intValue();
            String strQ = gl1.y.Q(o0VarE, R.string.swim_workouts_preference);
            String strQ2 = gl1.y.Q(o0VarE, R.string.select_swim_days);
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            String str2 = (String) p1Var3.getF182175a();
            int iC5 = y6().C5("FBTSwimDaysSelectionFragCompose");
            int iY5 = y6().Y5();
            boolean zR = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                ev2.f fVar = new ev2.f(this, p1Var, p1Var3, p1Var2, 3);
                o0VarE.K(fVar);
                objQ4 = fVar;
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR2 = o0VarE.r(this);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new t2(this, p1Var, 0);
                o0VarE.K(objQ5);
            }
            e23.a aVar2 = (e23.a) objQ5;
            boolean zR3 = o0VarE.r(this) | ((i15 & 112) == 32);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                objQ6 = new c2(5, this, aVar);
                o0VarE.K(objQ6);
            }
            o0Var = o0VarE;
            uu1.f.a(arrayListR, iIntValue, iIntValue2, strQ, strQ2, false, zBooleanValue, str2, z14, iC5, iY5, lVar, aVar2, (e23.a) objQ6, o0Var, ((i15 << 24) & 234881024) | 196608, 0);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new am.i1(this, z14, aVar, i14, 14);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTSwimDaysSelectionFragCompose";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66790b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/u2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
