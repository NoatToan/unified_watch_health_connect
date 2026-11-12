package ov1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c22.g2;
import c22.x0;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lov1/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "Lmv1/f;", "selectedDays", "", "enableNext", "", "footerMsgText", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f134159c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f134160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f134161b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f134162a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f134162a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f134163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f134164b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f134163a = aVar;
            this.f134164b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f134163a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f134164b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f134165a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f134165a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public f() {
        super(R.layout.fbt_activity_view);
        this.f134160a = new w1(s0.f105811a.b(pv1.b.class), new b(this), new d(this), new c(null, this));
        this.f134161b = o13.m.b(new e(this, 0));
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
        tu1.a.p(view2, R.id.composable_container, new z3.e(-1875873903, true, new m92.f(this, 27)));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x018e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(ArrayList arrayList, e23.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        int i16;
        String strW;
        int i17;
        int i18;
        String strW2;
        boolean zR;
        Object objQ;
        boolean zR2;
        Object objQ2;
        boolean z14;
        Object objQ3;
        o0 o0VarE = mVar.E(1545735004);
        int i19 = i14 | (o0VarE.r(arrayList) ? 4 : 2) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i19 & 1, (i19 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ4 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = p0.n(arrayList);
                o0VarE.K(objQ4);
            }
            p1 p1Var = (p1) objQ4;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            o13.p<String, Boolean> pVarW6 = w6(contextRequireContext, (List) p1Var.getF182175a(), 1, 2);
            String str = pVarW6.f128594a;
            Boolean bool = pVarW6.f128595b;
            bool.getClass();
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(bool);
                o0VarE.K(objQ5);
            }
            p1 p1Var2 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(str);
                o0VarE.K(objQ6);
            }
            p1 p1Var3 = (p1) objQ6;
            ArrayList arrayListR = tu1.a.r(arrayList);
            if (v6().p5()) {
                i15 = -1178928635;
                i16 = R.string.long_runs_long_rides_preference;
            } else if (v6().l5()) {
                i15 = -1178925273;
                i16 = R.string.long_ride_day_preference_question;
            } else {
                if (v6().n5()) {
                    o0VarE.C(-1178921945);
                    x0.f23314a.getClass();
                    strW = gl1.d.W(x0.Rb);
                    o0VarE.g0(false);
                } else {
                    i15 = -1178919546;
                    i16 = R.string.long_run_day_preference_question;
                }
                String str2 = strW;
                if (v6().p5()) {
                    i17 = 1184117582;
                    i18 = R.string.select_long_workout_days;
                } else if (v6().l5()) {
                    i17 = 1184120715;
                    i18 = R.string.select_long_ride_days;
                } else {
                    if (v6().n5()) {
                        o0VarE.C(1184123659);
                        x0.f23314a.getClass();
                        strW2 = gl1.d.W(x0.Wb);
                        o0VarE.g0(false);
                    } else {
                        i17 = 1184125674;
                        i18 = R.string.select_long_run_days;
                    }
                    String str3 = strW2;
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    String str4 = (String) p1Var3.getF182175a();
                    zR = o0VarE.r(this);
                    objQ = o0VarE.q();
                    if (zR || objQ == c2565a) {
                        e0 e0Var = new e0(this, p1Var, p1Var3, p1Var2, 10);
                        o0VarE.K(e0Var);
                        objQ = e0Var;
                    }
                    e23.l lVar = (e23.l) objQ;
                    zR2 = o0VarE.r(this);
                    objQ2 = o0VarE.q();
                    if (zR2 || objQ2 == c2565a) {
                        objQ2 = new oe.j(15, p1Var, this);
                        o0VarE.K(objQ2);
                    }
                    e23.a aVar2 = (e23.a) objQ2;
                    z14 = (i19 & 7168) == 2048;
                    objQ3 = o0VarE.q();
                    if (z14 || objQ3 == c2565a) {
                        objQ3 = new nw0.x(aVar, 29);
                        o0VarE.K(objQ3);
                    }
                    o0Var = o0VarE;
                    uu1.f.a(arrayListR, 1, 2, str2, str3, false, zBooleanValue, str4, false, 0, 0, lVar, aVar2, (e23.a) objQ3, o0Var, 100860336, 1536);
                }
                strW2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, false);
                String str5 = strW2;
                boolean zBooleanValue2 = ((Boolean) p1Var2.getF182175a()).booleanValue();
                String str6 = (String) p1Var3.getF182175a();
                zR = o0VarE.r(this);
                objQ = o0VarE.q();
                if (zR) {
                    e0 e0Var2 = new e0(this, p1Var, p1Var3, p1Var2, 10);
                    o0VarE.K(e0Var2);
                    objQ = e0Var2;
                } else {
                    e0 e0Var3 = new e0(this, p1Var, p1Var3, p1Var2, 10);
                    o0VarE.K(e0Var3);
                    objQ = e0Var3;
                }
                e23.l lVar2 = (e23.l) objQ;
                zR2 = o0VarE.r(this);
                objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new oe.j(15, p1Var, this);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new oe.j(15, p1Var, this);
                    o0VarE.K(objQ2);
                }
                e23.a aVar3 = (e23.a) objQ2;
                if ((i19 & 7168) == 2048) {
                }
                objQ3 = o0VarE.q();
                if (z14) {
                    objQ3 = new nw0.x(aVar, 29);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new nw0.x(aVar, 29);
                    o0VarE.K(objQ3);
                }
                o0Var = o0VarE;
                uu1.f.a(arrayListR, 1, 2, str2, str5, false, zBooleanValue2, str6, false, 0, 0, lVar2, aVar3, (e23.a) objQ3, o0Var, 100860336, 1536);
            }
            strW = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            String str7 = strW;
            if (v6().p5()) {
                i17 = 1184117582;
                i18 = R.string.select_long_workout_days;
            } else if (v6().l5()) {
                i17 = 1184120715;
                i18 = R.string.select_long_ride_days;
            } else {
                if (v6().n5()) {
                    o0VarE.C(1184123659);
                    x0.f23314a.getClass();
                    strW2 = gl1.d.W(x0.Wb);
                    o0VarE.g0(false);
                } else {
                    i17 = 1184125674;
                    i18 = R.string.select_long_run_days;
                }
                String str8 = strW2;
                boolean zBooleanValue3 = ((Boolean) p1Var2.getF182175a()).booleanValue();
                String str9 = (String) p1Var3.getF182175a();
                zR = o0VarE.r(this);
                objQ = o0VarE.q();
                if (zR) {
                    e0 e0Var4 = new e0(this, p1Var, p1Var3, p1Var2, 10);
                    o0VarE.K(e0Var4);
                    objQ = e0Var4;
                } else {
                    e0 e0Var5 = new e0(this, p1Var, p1Var3, p1Var2, 10);
                    o0VarE.K(e0Var5);
                    objQ = e0Var5;
                }
                e23.l lVar3 = (e23.l) objQ;
                zR2 = o0VarE.r(this);
                objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new oe.j(15, p1Var, this);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new oe.j(15, p1Var, this);
                    o0VarE.K(objQ2);
                }
                e23.a aVar4 = (e23.a) objQ2;
                if ((i19 & 7168) == 2048) {
                }
                objQ3 = o0VarE.q();
                if (z14) {
                    objQ3 = new nw0.x(aVar, 29);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new nw0.x(aVar, 29);
                    o0VarE.K(objQ3);
                }
                o0Var = o0VarE;
                uu1.f.a(arrayListR, 1, 2, str7, str8, false, zBooleanValue3, str9, false, 0, 0, lVar3, aVar4, (e23.a) objQ3, o0Var, 100860336, 1536);
            }
            strW2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, false);
            String str10 = strW2;
            boolean zBooleanValue4 = ((Boolean) p1Var2.getF182175a()).booleanValue();
            String str11 = (String) p1Var3.getF182175a();
            zR = o0VarE.r(this);
            objQ = o0VarE.q();
            if (zR) {
                e0 e0Var6 = new e0(this, p1Var, p1Var3, p1Var2, 10);
                o0VarE.K(e0Var6);
                objQ = e0Var6;
            } else {
                e0 e0Var7 = new e0(this, p1Var, p1Var3, p1Var2, 10);
                o0VarE.K(e0Var7);
                objQ = e0Var7;
            }
            e23.l lVar4 = (e23.l) objQ;
            zR2 = o0VarE.r(this);
            objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new oe.j(15, p1Var, this);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new oe.j(15, p1Var, this);
                o0VarE.K(objQ2);
            }
            e23.a aVar5 = (e23.a) objQ2;
            if ((i19 & 7168) == 2048) {
            }
            objQ3 = o0VarE.q();
            if (z14) {
                objQ3 = new nw0.x(aVar, 29);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new nw0.x(aVar, 29);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            uu1.f.a(arrayListR, 1, 2, str7, str10, false, zBooleanValue4, str11, false, 0, 0, lVar4, aVar5, (e23.a) objQ3, o0Var, 100860336, 1536);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(this, arrayList, aVar, i14, 20);
        }
    }

    public final pv1.b v6() {
        return (pv1.b) this.f134160a.getValue();
    }

    public final o13.p<String, Boolean> w6(Context context, List<mv1.f> list, int i14, int i15) {
        String string;
        list.getClass();
        if (tu1.a.d(1, 2, list)) {
            return new o13.p<>("", Boolean.TRUE);
        }
        if (v6().p5()) {
            string = context.getString(R.string.must_have_long_workout_days);
        } else if (v6().l5()) {
            string = context.getString(R.string.must_have_one_or_two_long_ride_days);
        } else if (v6().n5()) {
            l22.a aVar = (l22.a) this.f134161b.getValue();
            x0.f23314a.getClass();
            g2 g2VarB = g2.b(x0.Vb);
            aVar.getClass();
            string = dh.b.A(aVar.f109162a, g2VarB);
        } else {
            string = context.getString(R.string.must_have_one_or_two_long_run_days);
        }
        string.getClass();
        return new o13.p<>(string, Boolean.FALSE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
