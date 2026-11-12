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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/e1;", "Lew1/u;", "<init>", "()V", "a", "", "Lmv1/f;", "selectedDays", "", "enableNext", "", "footerMsgText", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66409d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f66411c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66412a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180176g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180178i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt1.o.f180180k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66412a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66413a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f66413a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66413a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66414a = aVar;
            this.f66415b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66414a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66415b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66416a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66416a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66416a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public e1() {
        super(R.layout.fbt_activity_view);
        this.f66410b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new c(this), new e(this), new d(null, this));
        this.f66411c = o13.m.b(new d1(this, 0));
    }

    public final o13.p<String, Boolean> A6(l22.a aVar, List<mv1.f> list, int i14, int i15) {
        String string;
        aVar.getClass();
        list.getClass();
        if (tu1.a.d(i14, i15, list)) {
            return new o13.p<>("", Boolean.TRUE);
        }
        if (y6().e7()) {
            string = aVar.getString(R.string.must_have_long_workout_days);
        } else if (y6().W6()) {
            c22.x0.f23314a.getClass();
            string = dh.b.A(aVar.f109162a, c22.g2.b(c22.x0.Vb));
        } else if (y6().V6()) {
            string = aVar.getString(y6().O6() ? R.string.must_have_one_or_two_long_ride_days : R.string.must_have_one_or_two_long_run_days);
        } else {
            string = aVar.getString(y6().O6() ? R.string.must_have_one_long_ride_day : R.string.must_have_one_long_run_day);
        }
        return new o13.p<>(string, Boolean.FALSE);
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.set_schedule));
        }
        tu1.a.p(view2, R.id.composable_container, new z3.e(289442127, true, new dh1.a(this, 16)));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02ef  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w6(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        List<String> listI;
        i53.c cVarE;
        o13.p pVar;
        boolean z15;
        p3.p1 p1Var;
        i53.c cVar;
        ArrayList arrayList;
        boolean z16;
        boolean z17;
        boolean z18;
        p3.o0 o0VarE = mVar.E(948761552);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            aw1.h hVarY6 = y6();
            Context contextB = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
            jv1.s sVarI6 = hVarY6.i6();
            ArrayList arrayListE = sVarI6 != null ? sVarI6.e() : null;
            jv1.s sVarI7 = hVarY6.i6();
            List<String> list = sVarI7 != null ? sVarI7.f101136o : null;
            jv1.s sVarI8 = hVarY6.i6();
            if (sVarI8 != null) {
                listI = sVarI8.i(hVarY6.M6() || hVarY6.Y6());
            } else {
                listI = null;
            }
            if (listI != null) {
                ArrayList arrayList2 = new ArrayList(p13.y.r(listI, 10));
                Iterator<T> it = listI.iterator();
                while (it.hasNext()) {
                    wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList2);
                }
                cVarE = i53.a.e(arrayList2);
            } else {
                cVarE = null;
            }
            w13.c cVar2 = wt1.q.f187129o;
            ArrayList arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
            Iterator<T> it3 = cVar2.iterator();
            while (true) {
                String string = "";
                if (!it3.hasNext()) {
                    break;
                }
                wt1.q qVar = (wt1.q) it3.next();
                boolean z19 = cVarE != null && cVarE.contains(qVar);
                if (list == null || list.isEmpty()) {
                    cVar = cVarE;
                    arrayList = arrayListE;
                    z16 = false;
                } else {
                    Iterator<T> it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            cVar = cVarE;
                            arrayList = arrayListE;
                            if (d53.w.z((String) it4.next(), qVar.toString(), true)) {
                                z16 = true;
                            } else {
                                arrayListE = arrayList;
                                cVarE = cVar;
                            }
                        } else {
                            cVar = cVarE;
                            arrayList = arrayListE;
                            z16 = false;
                        }
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    z17 = z16;
                    z18 = false;
                } else {
                    Iterator it5 = arrayList.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            z17 = z16;
                            Iterator it6 = it5;
                            if (d53.w.z((String) it5.next(), qVar.toString(), true)) {
                                z18 = true;
                            } else {
                                it5 = it6;
                                z16 = z17;
                            }
                        } else {
                            z17 = z16;
                            z18 = false;
                        }
                    }
                }
                boolean z24 = (hVarY6.f13385r1 && hVarY6.P1 == null) || !z18;
                if (z17) {
                    string = contextB.getString(R.string.swim_day);
                } else if (z18) {
                    string = contextB.getString(R.string.lbl_rest_day);
                }
                string.getClass();
                arrayList3.add(new mv1.f(qVar, string, z19, z24));
                arrayListE = arrayList;
                cVarE = cVar;
            }
            ArrayList arrayListR = tu1.a.r(new ArrayList(arrayList3));
            vt1.o oVarS5 = y6().S5();
            o13.t tVar = this.f66411c;
            l22.a aVar2 = (l22.a) tVar.getValue();
            int i16 = oVarS5 == null ? -1 : b.f66412a[oVarS5.ordinal()];
            if (i16 == 1) {
                pVar = y6().Y6() ? new o13.p(aVar2.getString(R.string.long_ride_day_preference_question), aVar2.getString(R.string.select_one_long_ride_day)) : new o13.p(aVar2.getString(R.string.long_ride_day_preference_question), aVar2.getString(R.string.select_long_ride_days));
            } else if (i16 == 2) {
                pVar = new o13.p(aVar2.getString(R.string.long_runs_long_rides_preference), aVar2.getString(R.string.select_long_workout_days));
            } else if (i16 != 3) {
                pVar = y6().M6() ? new o13.p(aVar2.getString(R.string.long_run_day_preference_question), aVar2.getString(R.string.select_one_long_run_day)) : new o13.p(aVar2.getString(R.string.long_run_day_preference_question), aVar2.getString(R.string.select_long_run_days));
            } else {
                c22.x0.f23314a.getClass();
                c22.g2 g2VarB = c22.g2.b(c22.x0.Rb);
                aVar2.getClass();
                Context context = aVar2.f109162a;
                pVar = new o13.p(dh.b.A(context, g2VarB), dh.b.A(context, c22.g2.b(c22.x0.Wb)));
            }
            String str = (String) pVar.f128594a;
            String str2 = (String) pVar.f128595b;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(arrayListR);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var3 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n("");
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var4 = (p3.p1) objQ3;
            o13.p<String, Boolean> pVarA6 = A6((l22.a) tVar.getValue(), (List) p1Var2.getF182175a(), z6().f128594a.intValue(), z6().f128595b.intValue());
            String str3 = pVarA6.f128594a;
            Boolean bool = pVarA6.f128595b;
            bool.getClass();
            p1Var4.setValue(str3);
            p1Var3.setValue(bool);
            int iIntValue = z6().f128594a.intValue();
            int iIntValue2 = z6().f128595b.intValue();
            jv1.s sVarI9 = y6().i6();
            if ((sVarI9 != null ? sVarI9.f101130i : null) == null) {
                jv1.s sVarI10 = y6().i6();
                if ((sVarI10 != null ? sVarI10.f101131j : null) != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                z15 = true;
            }
            boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
            String str4 = (String) p1Var4.getF182175a();
            int iC5 = y6().C5("FBTLongDaysSelectionFragCompose");
            int iY5 = y6().Y5();
            boolean zR = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                p1Var = p1Var2;
                ev2.f fVar = new ev2.f(this, p1Var, p1Var4, p1Var3, 2);
                o0VarE.K(fVar);
                objQ4 = fVar;
            } else {
                p1Var = p1Var2;
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR2 = o0VarE.r(this);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new dl0.g(27, this, p1Var);
                o0VarE.K(objQ5);
            }
            e23.a aVar3 = (e23.a) objQ5;
            boolean zR3 = o0VarE.r(this) | ((i15 & 112) == 32);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                objQ6 = new dl0.g(28, this, aVar);
                o0VarE.K(objQ6);
            }
            o0Var = o0VarE;
            uu1.f.a(arrayListR, iIntValue, iIntValue2, str, str2, z15, zBooleanValue, str4, z14, iC5, iY5, lVar, aVar3, (e23.a) objQ6, o0Var, (i15 << 24) & 234881024, 0);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new am.i1(this, z14, aVar, i14, 13);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTLongDaysSelectionFragCompose";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66410b.getValue();
    }

    public final o13.p<Integer, Integer> z6() {
        int i14 = 1;
        jv1.s sVarI6 = y6().i6();
        if ((sVarI6 != null ? sVarI6.f101130i : null) == null) {
            jv1.s sVarI7 = y6().i6();
            if ((sVarI7 != null ? sVarI7.f101131j : null) == null) {
                i14 = 2;
            }
        }
        return new o13.p<>(1, Integer.valueOf(i14));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/e1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
