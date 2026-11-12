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
import java.util.ArrayList;
import java.util.List;
import mt0.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lov1/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "Lmv1/f;", "selectedDays", "", "enableNext", "", "footerMsgText", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f134143b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f134144a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134145a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f134145a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f134145a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: ov1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C2544c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f134146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f134147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2544c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f134146a = aVar;
            this.f134147b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f134146a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f134147b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134148a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f134148a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f134148a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        super(R.layout.fbt_activity_view);
        this.f134144a = new w1(s0.f105811a.b(pv1.b.class), new b(this), new d(this), new C2544c(null, this));
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
        tu1.a.p(view2, R.id.composable_container, new z3.e(-1531411919, true, new m92.f(this, 25)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(ArrayList arrayList, e23.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-288380411);
        int i15 = i14 | (o0VarE.r(arrayList) ? 4 : 2) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
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
            o13.p<String, Boolean> pVarV6 = v6(contextRequireContext, (List) p1Var.getF182175a(), 5, 7);
            String str = pVarV6.f128594a;
            Boolean bool = pVarV6.f128595b;
            bool.getClass();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(bool);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(str);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            ArrayList arrayListR = tu1.a.r(new ArrayList(arrayList));
            String strQ = gl1.y.Q(o0VarE, R.string.days_available_to_workout);
            String strP = gl1.y.P(R.string.select_num_days_consecutive_note, new Object[]{"5-7"}, o0VarE);
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            String str2 = (String) p1Var3.getF182175a();
            boolean zR = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                e0 e0Var = new e0(this, p1Var, p1Var3, p1Var2, 9);
                o0VarE.K(e0Var);
                objQ4 = e0Var;
            }
            e23.l lVar = (e23.l) objQ4;
            int i16 = i15 & 7168;
            boolean zR2 = o0VarE.r(this) | (i16 == 2048);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new nw0.p(aVar, p1Var, this);
                o0VarE.K(objQ5);
            }
            e23.a aVar2 = (e23.a) objQ5;
            boolean z14 = i16 == 2048;
            Object objQ6 = o0VarE.q();
            if (z14 || objQ6 == c2565a) {
                objQ6 = new nw0.x(aVar, 28);
                o0VarE.K(objQ6);
            }
            o0Var = o0VarE;
            uu1.f.a(arrayListR, 5, 7, strQ, strP, false, zBooleanValue, str2, false, 0, 0, lVar, aVar2, (e23.a) objQ6, o0Var, 100860336, 1536);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(this, arrayList, aVar, i14, 19);
        }
    }

    public final o13.p<String, Boolean> v6(Context context, List<mv1.f> list, int i14, int i15) {
        list.getClass();
        boolean zD = tu1.a.d(5, 7, list);
        mv1.f.f121191e.getClass();
        boolean zA = mv1.f.a.a(1, list);
        if (!zD) {
            String string = context.getString(R.string.select_minimum_training_days, String.valueOf(5));
            string.getClass();
            return new o13.p<>(string, Boolean.FALSE);
        }
        if (!zA) {
            return new o13.p<>("", Boolean.TRUE);
        }
        String string2 = getString(R.string.cannot_have_consecutive_rest_days);
        string2.getClass();
        return new o13.p<>(string2, Boolean.FALSE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
