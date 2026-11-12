package ov1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p0;
import p3.p1;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lov1/p;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "Lmv1/f;", "selectedDays", "", "enableNext", "", "footerMsgText", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f134204c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f134205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f134206b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134207a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f134207a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f134207a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f134208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f134209b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f134208a = aVar;
            this.f134209b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f134208a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f134209b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134210a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f134210a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f134210a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public p() {
        super(R.layout.fbt_activity_view);
        this.f134205a = new w1(s0.f105811a.b(pv1.b.class), new b(this), new d(this), new c(null, this));
        this.f134206b = o13.m.b(new n(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.set_schedule));
        }
        androidx.fragment.app.m activity2 = getActivity();
        z1 z1Var = activity2 instanceof z1 ? (z1) activity2 : null;
        if (z1Var != null) {
            z1Var.updateActionBarNavigation(2);
        }
        tu1.a.p(view2, R.id.composable_container, new z3.e(-1101439279, true, new m92.f(this, 29)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        i53.c cVarE;
        ArrayList arrayList;
        List<String> list;
        List<String> list2;
        o13.p pVar;
        List<tw1.h> list3;
        String string;
        i53.c cVarE2;
        i53.c cVarE3;
        i53.c cVarE4;
        String strG;
        String str;
        List<String> list4;
        List<String> list5;
        List<String> list6;
        o0 o0VarE = mVar.E(-1057603799);
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            String str2 = "";
            if (v6().p5()) {
                o0VarE.C(805423792);
                pv1.b bVarV6 = v6();
                String strQ = gl1.y.Q(o0VarE, R.string.long_workout_day);
                String strQ2 = gl1.y.Q(o0VarE, R.string.swim_day);
                strQ.getClass();
                strQ2.getClass();
                p2 p2Var = bVarV6.R0;
                mv1.b bVar = (mv1.b) p2Var.getValue();
                if (bVar == null || (list6 = bVar.f121173b) == null) {
                    cVarE2 = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(p13.y.r(list6, 10));
                    Iterator<T> it = list6.iterator();
                    while (it.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList2);
                    }
                    cVarE2 = i53.a.e(arrayList2);
                }
                mv1.b bVar2 = (mv1.b) p2Var.getValue();
                if (bVar2 == null || (list5 = bVar2.f121174c) == null) {
                    cVarE3 = null;
                } else {
                    ArrayList arrayList3 = new ArrayList(p13.y.r(list5, 10));
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it3.next(), arrayList3);
                    }
                    cVarE3 = i53.a.e(arrayList3);
                }
                mv1.b bVar3 = (mv1.b) p2Var.getValue();
                if (bVar3 == null || (list4 = bVar3.f121172a) == null) {
                    cVarE4 = null;
                } else {
                    ArrayList arrayList4 = new ArrayList(p13.y.r(list4, 10));
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it4.next(), arrayList4);
                    }
                    cVarE4 = i53.a.e(arrayList4);
                }
                w13.c<wt1.q> cVar = wt1.q.f187129o;
                ArrayList arrayList5 = new ArrayList(p13.y.r(cVar, 10));
                for (wt1.q qVar : cVar) {
                    boolean zContains = cVarE4 != null ? cVarE4.contains(qVar) : false;
                    i53.c cVar2 = cVarE4;
                    if (cVarE2 != null && cVarE2.contains(qVar) && cVarE3 != null && cVarE3.contains(qVar)) {
                        strG = e5.g(strQ, ", ", strQ2);
                        str = str2;
                    } else if (cVarE2 != null && cVarE2.contains(qVar)) {
                        str = str2;
                        strG = strQ;
                    } else if (cVarE3 == null || !cVarE3.contains(qVar)) {
                        strG = str2;
                        str = strG;
                    } else {
                        str = str2;
                        strG = strQ2;
                    }
                    arrayList5.add(new mv1.f(qVar, strG, zContains, true));
                    cVarE4 = cVar2;
                    str2 = str;
                }
                arrayList = new ArrayList(arrayList5);
                o0VarE.g0(false);
            } else {
                o0VarE.C(805632794);
                o0VarE.g0(false);
                String string2 = v6().l5() ? getString(R.string.itp_setup_option_long_day) : getString(R.string.atp_lbl_long_run_day);
                string2.getClass();
                mv1.a aVar2 = (mv1.a) v6().N0.getValue();
                if (aVar2 == null || (list2 = aVar2.f121166d) == null) {
                    cVarE = null;
                } else {
                    ArrayList arrayList6 = new ArrayList(p13.y.r(list2, 10));
                    Iterator<T> it5 = list2.iterator();
                    while (it5.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it5.next(), arrayList6);
                    }
                    cVarE = i53.a.e(arrayList6);
                }
                w13.c<wt1.q> cVar3 = wt1.q.f187129o;
                ArrayList arrayList7 = new ArrayList(p13.y.r(cVar3, 10));
                for (wt1.q qVar2 : cVar3) {
                    arrayList7.add(new mv1.f(qVar2, (aVar2 == null || (list = aVar2.f121167e) == null || !list.contains(qVar2.f187130a)) ? "" : string2, cVarE != null ? cVarE.contains(qVar2) : false, true));
                }
                arrayList = new ArrayList(arrayList7);
            }
            pv1.b bVarV7 = v6();
            b2 b2Var = bVarV7.O0;
            if (bVarV7.p5()) {
                pVar = new o13.p(6, 7);
            } else if (bVarV7.m5()) {
                mv1.a aVar3 = (mv1.a) b2Var.f150540a.getValue();
                boolean z14 = (aVar3 == null || (list3 = aVar3.f121170h) == null || !(list3.isEmpty() ^ true)) ? false : true;
                mv1.a aVar4 = (mv1.a) b2Var.f150540a.getValue();
                pVar = new o13.p(Integer.valueOf(tu1.a.j(bVarV7.c5(), bVarV7.Y, z14, aVar4 != null && aVar4.f121165c)), 7);
            } else {
                pVar = new o13.p(5, 7);
            }
            int iIntValue = ((Number) pVar.f128594a).intValue();
            int iIntValue2 = ((Number) pVar.f128595b).intValue();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(arrayList);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            o13.p<String, Boolean> pVarW6 = w6(contextRequireContext, (List) p1Var.getF182175a(), iIntValue, iIntValue2);
            String str3 = pVarW6.f128594a;
            Boolean bool = pVarW6.f128595b;
            bool.getClass();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(bool);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(str3);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            ArrayList arrayListR = tu1.a.r(arrayList);
            String strQ3 = gl1.y.Q(o0VarE, R.string.which_days_available_to_train);
            if (v6().p5()) {
                string = getString(R.string.select_training_days_range2, "6-7");
            } else if (v6().Y == vt1.o.f180179j) {
                string = getString(R.string.select_num_days_consecutive_note, "5-7");
            } else {
                string = (!v6().m5() || iIntValue > 4) ? getString(R.string.select_training_days_range, "5-7") : ((l22.a) this.f134206b.getValue()).a(R.string.select_available_days_two_consecutive_rest_days, String.valueOf(iIntValue));
            }
            String str4 = string;
            str4.getClass();
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            String str5 = (String) p1Var3.getF182175a();
            boolean zR = o0VarE.r(this) | o0VarE.k(iIntValue) | o0VarE.k(iIntValue2);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                c2.r rVar = new c2.r(this, iIntValue, iIntValue2, p1Var, p1Var3, p1Var2);
                o0VarE.K(rVar);
                objQ4 = rVar;
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR2 = o0VarE.r(this);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new oe.j(20, p1Var, this);
                o0VarE.K(objQ5);
            }
            e23.a aVar5 = (e23.a) objQ5;
            boolean z15 = (i16 & 14) == 4;
            Object objQ6 = o0VarE.q();
            if (z15 || objQ6 == c2565a) {
                objQ6 = new o(aVar, 0);
                o0VarE.K(objQ6);
            }
            o0Var = o0VarE;
            i15 = 4;
            uu1.f.a(arrayListR, iIntValue, iIntValue2, strQ3, str4, false, zBooleanValue, str5, false, 0, 0, lVar, aVar5, (e23.a) objQ6, o0Var, 100859904, 1536);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            i15 = 4;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oo0.f(this, aVar, i14, i15);
        }
    }

    public final pv1.b v6() {
        return (pv1.b) this.f134205a.getValue();
    }

    public final o13.p<String, Boolean> w6(Context context, List<mv1.f> list, int i14, int i15) {
        String string;
        list.getClass();
        int i16 = (!v6().m5() || i14 > 4) ? 1 : 2;
        boolean zD = tu1.a.d(i14, i15, list);
        mv1.f.f121191e.getClass();
        boolean zA = mv1.f.a.a(i16, list);
        if (!zD) {
            String string2 = context.getString(R.string.select_minimum_training_days, String.valueOf(i14));
            string2.getClass();
            return new o13.p<>(string2, Boolean.FALSE);
        }
        if (!zA) {
            return new o13.p<>("", Boolean.TRUE);
        }
        if (!v6().m5() || i14 > 4) {
            string = getString(R.string.cannot_have_consecutive_rest_days);
            string.getClass();
        } else {
            string = ((l22.a) this.f134206b.getValue()).a(R.string.cannot_have_x_consecutive_rest_days, "2");
        }
        return new o13.p<>(string, Boolean.FALSE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov1/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
