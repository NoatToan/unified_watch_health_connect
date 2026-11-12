package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f²\u0006\u001a\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/r;", "Lew1/u;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lmv1/f;", "uiModel", "", "showProgressOverlay", "selectedDays", "enableNext", "", "footerMsgText", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66699d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f66701c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66702a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66702a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66703a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f66703a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66703a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66704a = aVar;
            this.f66705b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66704a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66705b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66706a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66706a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66706a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public r() {
        super(R.layout.fbt_activity_view);
        this.f66700b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new c(this), new e(this), new d(null, this));
        this.f66701c = o13.m.b(new q(this, 0));
    }

    public final o13.p<Integer, Integer> A6() {
        vt1.h hVar;
        if (z6().e7()) {
            return new o13.p<>(6, 7);
        }
        if (z6().M6() || z6().Y6()) {
            return new o13.p<>(Integer.valueOf(z6().Q5() > 0 ? z6().Q5() : 5), 7);
        }
        if (!z6().T6()) {
            return new o13.p<>(5, 7);
        }
        jv1.s sVarI6 = z6().i6();
        if (sVarI6 == null || (hVar = sVarI6.F) == null) {
            hVar = vt1.h.NONE;
        }
        return new o13.p<>(Integer.valueOf(tu1.a.j(z6().E5(), z6().a6(), hVar != vt1.h.NONE, z6().Z6())), 7);
    }

    public final o13.p<String, Boolean> C6(Context context, List<mv1.f> list, int i14, int i15) {
        list.getClass();
        String string = "";
        if (z6().M6() || z6().Y6()) {
            if (tu1.a.d(i14, i15, list)) {
                return new o13.p<>("", Boolean.TRUE);
            }
            String string2 = context.getString(R.string.select_minimum_training_days, String.valueOf(z6().Q5()));
            string2.getClass();
            return new o13.p<>(string2, Boolean.FALSE);
        }
        int i16 = (!z6().T6() || i14 > 4) ? 1 : 2;
        boolean zD = tu1.a.d(i14, i15, list);
        mv1.f.f121191e.getClass();
        boolean zA = mv1.f.a.a(i16, list);
        if (!zD) {
            string = context.getString(R.string.select_minimum_training_days, String.valueOf(i14));
        } else if (zA) {
            if (!z6().T6() || i14 > 4) {
                string = getString(R.string.cannot_have_consecutive_rest_days);
                string.getClass();
            } else {
                string = ((l22.a) this.f66701c.getValue()).a(R.string.cannot_have_x_consecutive_rest_days, "2");
            }
        }
        string.getClass();
        return new o13.p<>(string, Boolean.valueOf(string.length() == 0));
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.f(this);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.set_schedule));
        }
        tu1.a.p(view2, R.id.composable_container, new z3.e(-2095076817, true, new dh1.a(this, 15)));
        aw1.h hVarZ6 = z6();
        ge1.b.T(androidx.lifecycle.v1.a(hVarZ6), null, null, new aw1.z(hVarZ6, ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b(), null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w6(List<mv1.f> list, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.p1 p1Var;
        String string;
        Object fVar;
        p3.p1 p1Var2;
        p3.o0 o0VarE = mVar.E(1954394163);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(this) ? 2048 : 1024;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(list);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var3 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var4 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n("");
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var5 = (p3.p1) objQ3;
            o13.p<Integer, Integer> pVarA6 = A6();
            int iIntValue = pVarA6.f128594a.intValue();
            int iIntValue2 = pVarA6.f128595b.intValue();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            o13.p<String, Boolean> pVarC6 = C6(contextRequireContext, (List) p1Var3.getF182175a(), iIntValue, iIntValue2);
            String str = pVarC6.f128594a;
            Boolean bool = pVarC6.f128595b;
            bool.getClass();
            p1Var5.setValue(str);
            p1Var4.setValue(bool);
            context.getClass();
            String string2 = z6().X6() ? context.getString(R.string.days_available_to_workout) : context.getString(R.string.which_days_available_to_train);
            string2.getClass();
            if (z6().e7()) {
                p1Var = p1Var3;
                string = context.getString(R.string.select_training_days_range2, "6-7");
            } else {
                p1Var = p1Var3;
                if (z6().M6() || z6().Y6()) {
                    string = context.getString(R.string.select_training_days_description, String.valueOf(z6().Q5()));
                } else if (z6().X6()) {
                    string = context.getString(R.string.select_num_days_consecutive_note, "5-7");
                } else {
                    string = (!z6().T6() || iIntValue > 4) ? getString(R.string.select_training_days_range, "5-7") : ((l22.a) this.f66701c.getValue()).a(R.string.select_available_days_two_consecutive_rest_days, String.valueOf(iIntValue));
                }
            }
            String str2 = string;
            str2.getClass();
            boolean zBooleanValue = ((Boolean) p1Var4.getF182175a()).booleanValue();
            String str3 = (String) p1Var5.getF182175a();
            int iC5 = z6().C5("FBTAvailableTrainingDaysFragCompose");
            int iY5 = z6().Y5();
            boolean zR = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                p1Var2 = p1Var;
                fVar = new ev2.f(this, p1Var2, p1Var5, p1Var4, 1);
                o0VarE.K(fVar);
            } else {
                fVar = objQ4;
                p1Var2 = p1Var;
            }
            e23.l lVar = (e23.l) fVar;
            boolean zR2 = o0VarE.r(this);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new dl0.g(21, this, p1Var2);
                o0VarE.K(objQ5);
            }
            e23.a aVar2 = (e23.a) objQ5;
            boolean zR3 = o0VarE.r(this) | ((i16 & 896) == 256);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                objQ6 = new dl0.g(22, this, aVar);
                o0VarE.K(objQ6);
            }
            o0Var = o0VarE;
            uu1.f.a(list, iIntValue, iIntValue2, string2, str2, false, zBooleanValue, str3, z14, iC5, iY5, lVar, aVar2, (e23.a) objQ6, o0Var, (i16 & 14) | (234881024 & (i16 << 21)), 32);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(this, list, z14, aVar, i14, 1);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTAvailableTrainingDaysFragCompose";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y6(e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1481519729);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarG = o53.f0.G((androidx.lifecycle.s0) z6().T0.getValue(), o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            g3 g3Var = (g3) p1VarG.getF182175a();
            if (g3Var == null) {
                o0VarE.C(-870082550);
                o0VarE.g0(false);
                aVar2 = aVar;
            } else {
                o0VarE.C(-870082549);
                int i16 = b.f66702a[g3Var.f35300a.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        o0VarE.C(1072813430);
                        o0VarE.g0(false);
                        p1Var.setValue(Boolean.TRUE);
                    } else {
                        if (i16 != 3) {
                            throw kg.f.h(o0VarE, 1072802344, false);
                        }
                        o0VarE.C(1072815319);
                        o0VarE.g0(false);
                        p1Var.setValue(Boolean.FALSE);
                    }
                    aVar2 = aVar;
                } else {
                    o0VarE.C(-1102818985);
                    p1Var.setValue(Boolean.FALSE);
                    List<mv1.f> list = (List) g3Var.f35301b;
                    if (list == null) {
                        list = p13.j0.f134944a;
                    }
                    w6(list, z6().R5(), aVar, o0VarE, (i15 << 6) & 8064);
                    aVar2 = aVar;
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            ew1.b.f66326a.getClass();
            g02.s0.a(null, zBooleanValue, ew1.b.f66327b, o0VarE, 384, 1);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(this, aVar2, i14, 28);
        }
    }

    public final aw1.h z6() {
        return (aw1.h) this.f66700b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
