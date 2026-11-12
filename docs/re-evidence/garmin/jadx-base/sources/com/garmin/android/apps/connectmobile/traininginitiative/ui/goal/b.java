package com.garmin.android.apps.connectmobile.traininginitiative.ui.goal;

import am.e1;
import am.l1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.s;
import b.u;
import b21.v4;
import b82.t0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import e23.l;
import et1.a2;
import ew1.r1;
import fg0.j;
import fo.x;
import fz1.k;
import g02.b2;
import gg0.h;
import gg0.i;
import gl1.y;
import h4.g;
import h4.r;
import i3.e5;
import i3.mh;
import java.util.Arrays;
import l72.f0;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.x0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import x5.l0;
import x5.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "showDistanceError", "", "inputDistanceValue", "showGoalTimeError", "showTimePicker", "showPacePicker", "showSpeedPicker", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45995d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45996a = new w1(s0.f105811a.b(k.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45997b = mg0.b.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f45998c = new c();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0890b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45999a;

        static {
            int[] iArr = new int[t0.a.values().length];
            try {
                iArr[t0.a.ON_FOCUS_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.a.ON_FOCUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45999a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/goal/b$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            f(false);
            a aVar = b.f45995d;
            b bVar = b.this;
            if (bVar.F6().f74013l && !bVar.F6().f74014m) {
                bVar.F6().z4().m("EventGoalTypeFragment");
                return;
            }
            if (!bVar.F6().f74014m || bVar.getParentFragmentManager().G("EventGoalTypeFragment") != null) {
                bVar.requireActivity().getOnBackPressedDispatcher().d();
                return;
            }
            gz1.a aVar2 = (gz1.a) bVar.F6().F.f150540a.getValue();
            if (aVar2 != null) {
                bVar.F6().G4(bVar.getActivity(), aVar2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46001a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f46001a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46001a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46002a = aVar;
            this.f46003b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46002a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46003b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46004a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f46004a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46004a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static boolean G6(double d14, boolean z14) {
        if (!z14 || d14 > 1609.0d) {
            return !z14 && d14 <= 1000.0d;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"DefaultLocale"})
    public final void A6(gz1.a aVar, p1<String> p1Var, p1<Boolean> p1Var2, m mVar, int i14) {
        int i15;
        p1<String> p1Var3;
        o0 o0Var;
        o0 o0VarE = mVar.E(2129840470);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            p1Var3 = p1Var;
            i15 |= o0VarE.B(p1Var3) ? 32 : 16;
        } else {
            p1Var3 = p1Var;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(p1Var2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var4 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                String str = aVar.f80412e;
                if (str == null) {
                    str = "";
                }
                objQ2 = p0.n(str);
                o0VarE.K(objQ2);
            }
            p1 p1Var5 = (p1) objQ2;
            Double d14 = aVar.f80417j;
            if ((d14 != null ? d14.doubleValue() : 0.0d) <= 0.0d) {
                p1Var2.setValue(Boolean.FALSE);
            } else {
                p1Var2.setValue(Boolean.TRUE);
            }
            t0 t0Var = t0.f16792a;
            String strQ = y.Q(o0VarE, R.string.goal_distance);
            String str2 = aVar.f80412e;
            String str3 = str2 != null ? str2 : "";
            boolean zBooleanValue = ((Boolean) p1Var4.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new x(18);
                o0VarE.K(objQ3);
            }
            l<? super l0, l0> lVar = (l) objQ3;
            boolean zR = o0VarE.r(this) | o0VarE.r(aVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new ci0.b(this, 25, aVar, p1Var5);
                o0VarE.K(objQ4);
            }
            l<? super String, Unit> lVar2 = (l) objQ4;
            boolean zR2 = ((i15 & 112) == 32) | o0VarE.r(this) | o0VarE.r(aVar) | o0VarE.r(context) | ((i15 & 896) == 256);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                b82.l0 l0Var = new b82.l0((Object) this, (Object) aVar, (p1) p1Var3, (Object) context, (Object) p1Var2, (Object) p1Var5, (Object) p1Var4, 4);
                o0VarE.K(l0Var);
                objQ5 = l0Var;
            }
            v.f188954b.getClass();
            o0Var = o0VarE;
            t0Var.j(null, strQ, str3, null, zBooleanValue, lVar, lVar2, (l) objQ5, v.f188957e, 0, null, o0Var, 100862976, 0, 1537);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fz1.f(this, aVar, p1Var, p1Var2, i14, 1);
        }
    }

    public final String C6(Context context) {
        Integer numValueOf = Integer.valueOf(this.f45997b ? 1609 : 1000);
        bg0.a.f17827a.getClass();
        i iVarD = bg0.a.C0255a.d();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string = context.getString(R.string.goal_distance_max_error, numValueOf, iVarD.a(contextRequireContext));
        string.getClass();
        return string;
    }

    public final String E6(Context context) {
        gg0.f eventType;
        fg0.d completionTarget = F6().x4().getCompletionTarget();
        if (completionTarget == null) {
            completionTarget = new fg0.d(null, null, null, 7, null);
        }
        if (F6().E4()) {
            return "";
        }
        if (completionTarget.m() && F6().C4()) {
            String string = context.getString(R.string.goal_footer_time_speed);
            string.getClass();
            return string;
        }
        if (completionTarget.o() && F6().C4()) {
            String string2 = context.getString(R.string.goal_footer_distance_speed);
            string2.getClass();
            return string2;
        }
        if (completionTarget.o() && (eventType = F6().x4().getEventType()) != null && eventType.f()) {
            String string3 = context.getString(R.string.goal_footer_distance_pace);
            string3.getClass();
            return string3;
        }
        String string4 = context.getString(R.string.goal_footer_time_pace);
        string4.getClass();
        return string4;
    }

    public final k F6() {
        return (k) this.f45996a.getValue();
    }

    public final gz1.a H6(Context context, gz1.a aVar) {
        F6();
        String strI4 = k.I4(context, 0.0d, 0.0d);
        l3.f23124b.getClass();
        return gz1.a.a(aVar, null, null, null, l3.a.e1(0L), null, strI4, null, Double.valueOf(0.0d), 0L, null, null, 0.0d, 0L, 5975);
    }

    public final gz1.a I6(Context context, gz1.a aVar) {
        F6();
        return gz1.a.a(aVar, null, null, null, null, J6(0.0d, 0.0d), k.I4(context, 0.0d, 0.0d), null, null, 0L, Double.valueOf(0.0d), null, 0.0d, 0L, 5583);
    }

    @SuppressLint({"DefaultLocale"})
    public final String J6(double d14, double d15) {
        bg0.a.f17827a.getClass();
        i iVarD = bg0.a.C0255a.d();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String strC = iVarD.c(contextRequireContext);
        x0 x0Var = x0.f105818a;
        lz1.f.f115404a.getClass();
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(lz1.f.a.o(d14, 2))}, 1));
        if (d15 > 0.0d) {
            return e5.g(str, StringUtils.SPACE, strC);
        }
        String string = getString(R.string.enter_goal_distance);
        string.getClass();
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(-506206791, true, new fz1.d(this, 0)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Double dB;
        fg0.d customGoal;
        gz1.a aVarA;
        fg0.d customGoal2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.setTitle(F6().f74012k ? R.string.set_goals_title : R.string.event_goal);
        u onBackPressedDispatcher = mVarRequireActivity.getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f45998c, viewLifecycleOwner);
        k kVarF6 = F6();
        Context contextC = ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).c();
        gz1.a aVar = new gz1.a(null, null, null, null, null, null, null, null, 0L, null, null, 0.0d, 0L, 8191, null);
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        fg0.d completionTarget = kVarF6.x4().getCompletionTarget();
        if (completionTarget != null) {
            gz1.a aVarA2 = gz1.a.a(aVar, Boolean.valueOf(completionTarget.getUnitType() == h.TIME), null, null, null, null, null, null, null, 0L, null, null, 0.0d, 0L, 8190);
            if (completionTarget.o()) {
                Double dG = completionTarget.g();
                double dDoubleValue = dG != null ? dG.doubleValue() : 0.0d;
                l3.f23124b.getClass();
                gz1.a aVarA3 = gz1.a.a(aVarA2, null, l3.a.e1((long) dDoubleValue), null, null, null, null, null, Double.valueOf(dDoubleValue), 0L, null, null, 0.0d, 0L, 8061);
                j eventCustomization = kVarF6.f74021v;
                if (eventCustomization == null) {
                    eventCustomization = kVarF6.x4().getEventCustomization();
                }
                if (eventCustomization == null || (customGoal2 = eventCustomization.getCustomGoal()) == null) {
                    aVar = aVarA3;
                } else {
                    Double value = customGoal2.getValue();
                    i unit = customGoal2.getUnit();
                    String str = value + StringUtils.SPACE + (unit != null ? unit.c(contextC) : null);
                    Double dB2 = customGoal2.b();
                    double dDoubleValue2 = dB2 != null ? dB2.doubleValue() : 0.0d;
                    double d14 = dDoubleValue2 / dDoubleValue;
                    gz1.a aVarA4 = gz1.a.a(aVarA3, null, null, null, null, str, null, null, Double.valueOf(dDoubleValue), 0L, Double.valueOf(dDoubleValue2), null, d14, 0L, 5487);
                    if (kVarF6.C4() && dDoubleValue > 0.0d) {
                        aVarA4 = gz1.a.a(aVarA4, null, null, null, null, null, l3.a.N0(contextC, d14, zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, l3.f23130h, true, contextC.getString(R.string.enter_goal_speed)), null, null, 0L, null, null, 0.0d, 0L, 8159);
                    } else if (!kVarF6.C4()) {
                        og0.a.f131967a.getClass();
                        aVarA4 = gz1.a.a(aVarA4, null, null, null, null, null, null, og0.a.c(contextC, dDoubleValue, dDoubleValue2), null, (long) og0.a.d(dDoubleValue, dDoubleValue2), null, null, 0.0d, 0L, 7871);
                    }
                    aVar = aVarA4;
                }
            } else {
                Double dB3 = completionTarget.b();
                double dDoubleValue3 = dB3 != null ? dB3.doubleValue() : 0.0d;
                gz1.a aVarA5 = gz1.a.a(aVarA2, null, null, null, null, null, null, null, null, 0L, Double.valueOf(dDoubleValue3), Integer.valueOf((int) (((double) 600) * ((dDoubleValue3 / ((double) 1000)) / (zY ? 1.0d : 1.609344d)))), 0.0d, 0L, 6655);
                j eventCustomization2 = kVarF6.f74021v;
                if (eventCustomization2 == null) {
                    eventCustomization2 = kVarF6.x4().getEventCustomization();
                }
                if (eventCustomization2 != null && (customGoal = eventCustomization2.getCustomGoal()) != null) {
                    l3.a aVar2 = l3.f23124b;
                    Double value2 = customGoal.getValue();
                    Long lValueOf = value2 != null ? Long.valueOf((long) value2.doubleValue()) : null;
                    aVar2.getClass();
                    String strG1 = l3.a.g1(lValueOf);
                    Double value3 = customGoal.getValue();
                    double dDoubleValue4 = value3 != null ? value3.doubleValue() : 0.0d;
                    gz1.a aVarA6 = gz1.a.a(aVarA5, null, null, null, strG1, null, null, null, null, 0L, null, null, 0.0d, 0L, 8183);
                    if (kVarF6.C4()) {
                        aVarA = gz1.a.a(aVarA6, null, null, null, null, null, k.I4(contextC, dDoubleValue4, dDoubleValue3), null, Double.valueOf(dDoubleValue4), 0L, null, null, dDoubleValue4 > 0.0d ? dDoubleValue3 / dDoubleValue4 : 0.0d, 0L, 5983);
                    } else {
                        og0.a aVar3 = og0.a.f131967a;
                        Double value4 = customGoal.getValue();
                        double dDoubleValue5 = value4 != null ? value4.doubleValue() : 0.0d;
                        aVar3.getClass();
                        String strB = og0.a.b(dDoubleValue5, dDoubleValue3);
                        bg0.a.f17827a.getClass();
                        aVarA = gz1.a.a(aVarA6, null, null, null, null, null, null, e5.g(strB, StringUtils.SPACE, bg0.a.C0255a.b(contextC)), Double.valueOf(dDoubleValue4), (long) og0.a.d(dDoubleValue4, dDoubleValue3), null, null, 0.0d, 0L, 7743);
                    }
                    aVarA5 = aVarA;
                }
                aVar = aVarA5;
                fg0.d completionTarget2 = kVarF6.x4().getCompletionTarget();
                if (completionTarget2 != null && (dB = completionTarget2.b()) != null) {
                    double dDoubleValue6 = dB.doubleValue();
                    lz1.a.f115397a.getClass();
                    String strA = lz1.a.C2198a.a(dDoubleValue6);
                    og0.a.f131967a.getClass();
                    aVar = gz1.a.a(aVar, null, strA, og0.a.q(contextC), null, null, null, null, null, 0L, null, null, 0.0d, 0L, 8185);
                }
            }
        }
        kVarF6.E.k(null, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(gz1.a aVar, p1<String> p1Var, p1<Boolean> p1Var2, m mVar, int i14) {
        int i15;
        long jDoubleValue;
        Double d14 = aVar.f80415h;
        o0 o0VarE = mVar.E(-1167227311);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(p1Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(p1Var2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) objQ2;
            if ((d14 != null ? d14.doubleValue() : 0.0d) <= 0.0d) {
                p1Var2.setValue(Boolean.FALSE);
                String string = getString(R.string.goal_time_min_error, "0:00");
                string.getClass();
                p1Var.setValue(string);
                p1Var3.setValue(Boolean.TRUE);
            } else {
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(E6(context));
                p1Var3.setValue(Boolean.FALSE);
            }
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.lbl_goal_time);
            String strQ2 = aVar.f80411d;
            if (strQ2 == null) {
                o0VarE.C(-812769541);
                p1Var.setValue(E6(context));
                p1Var3.setValue(Boolean.FALSE);
                strQ2 = y.Q(o0VarE, R.string.enter_goal_time);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-718955777);
                o0VarE.g0(false);
            }
            z3.e eVarC = z3.f.c(1352606468, new l1(p1Var3, 8, (byte) 0), o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new a2(p1Var4, 24);
                o0VarE.K(objQ3);
            }
            p2Var.h(strQ, strQ2, null, null, null, false, false, null, eVarC, null, (e23.a) objQ3, o0VarE, 100663296, 6, 764);
            o0VarE = o0VarE;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(-811484498);
                String strH = com.nimbusds.jose.shaded.gson.internal.a.h(y.Q(o0VarE, R.string.lbl_goal_time), " (", y.Q(o0VarE, R.string.hour_minute_second_format), ")");
                i53.c cVarH = e0.h(0, 48);
                i53.c cVarH2 = e0.h(0, 59);
                i53.c cVarH3 = e0.h(0, 59);
                if (d14 != null) {
                    jDoubleValue = (long) d14.doubleValue();
                } else {
                    Double d15 = aVar.f80417j;
                    jDoubleValue = (int) (((double) 600) * (((d15 != null ? d15.doubleValue() : 0.0d) / ((double) 1000)) / (this.f45997b ? 1.0d : 1.609344d)));
                }
                Long lValueOf = Long.valueOf(jDoubleValue);
                boolean zR = o0VarE.r(aVar) | o0VarE.r(this) | ((i15 & 896) == 256);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    ev2.f fVar = new ev2.f(aVar, this, p1Var2, p1Var4, 6);
                    o0VarE.K(fVar);
                    objQ4 = fVar;
                }
                f10.m.f(strH, cVarH, cVarH2, cVarH3, lValueOf, false, (l) objQ4, o0VarE, 0, 32);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-809482735);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fz1.f(this, aVar, p1Var, p1Var2, i14, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v7, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r23v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void v6(gz1.a aVar, m mVar, int i14) {
        ?? r14;
        c2.j.l lVar;
        g.a aVar2;
        h5.g.a.C1623g c1623g;
        b0 b0Var;
        ?? r15;
        h5.g.a.b bVar;
        h5.e0.a aVar3;
        h5.g.a.e eVar;
        r.a aVar4;
        float f14;
        o0 o0Var;
        String str;
        float f15;
        ?? r16;
        ?? r17;
        ?? r18;
        int i15;
        int i16;
        boolean zG;
        boolean zG2;
        gz1.a aVar5 = aVar;
        o0 o0VarE = mVar.E(-767583499);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.r(aVar5) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            p3.x1 x1Var = n.f135158a;
            if (F6().D4()) {
                c2.j.f22691a.getClass();
                lVar = c2.j.f22694d;
            } else {
                c2.j.f22691a.getClass();
                lVar = c2.j.f22696f;
            }
            if (F6().D4()) {
                h4.d.f81522a.getClass();
                aVar2 = h4.d.a.f81536n;
            } else {
                h4.d.f81522a.getClass();
                aVar2 = h4.d.a.f81537o;
            }
            r.a aVar6 = r.S;
            r rVarF = x2.f(aVar6, 1.0f);
            z zVarA = c2.y.a(lVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar7 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            int i18 = F6().E4() ? R.string.what_is_goal_for_event : R.string.tell_more_about_goal;
            if (F6().D4()) {
                o0VarE.C(148725739);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC2 = c2.l.C(aVar6, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7);
                boolean z14 = !F6().f74014m;
                fy1.d dVar = F6().f74018q;
                b0Var = b0Var2;
                c1623g = c1623g2;
                aVar4 = aVar6;
                bVar = bVar2;
                aVar3 = aVar7;
                eVar = eVar2;
                f14 = 1.0f;
                r15 = 0;
                b2.a(rVarC2, z14, dVar != null ? dVar.f73891b : 0, F6().f74019r, y.Q(o0VarE, i18), null, null, null, null, o0VarE, 0, 480);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                c1623g = c1623g2;
                b0Var = b0Var2;
                r15 = 0;
                bVar = bVar2;
                aVar3 = aVar7;
                eVar = eVar2;
                aVar4 = aVar6;
                f14 = 1.0f;
                o0VarE.C(149203108);
                String strQ = y.Q(o0VarE, i18);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                d6.h.f57752b.getClass();
                int i19 = d6.h.f57755e;
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f16 = eVar3.f97920e;
                float f17 = eVar3.f97920e;
                org.apache.commons.lang3.e.j(bVar3);
                mh.c(strQ, c2.l.B(aVar4, f17, f16, f17, eVar3.f97922g), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                o0 o0Var2 = o0VarE;
                o0Var2.g0(false);
                o0Var = o0Var2;
            }
            r rVarF2 = x2.f(aVar4, f14);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81535m, o0Var, 54);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            r rVarC3 = h4.k.c(rVarF2, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar, s2VarA, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0Var);
            u2 u2Var = u2.f22900a;
            aVar5 = aVar;
            if (aVar == null || (str = aVar5.f80409b) == null) {
                str = "";
            }
            String str2 = str;
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0VarB2 = d92.c.b(j92.f.f97929f, o0Var);
            d6.h.f57752b.getClass();
            int i24 = d6.h.f57755e;
            if (F6().D4()) {
                f15 = (float) r15;
                g6.f.a aVar8 = g6.f.f75994b;
            } else {
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97921f;
            }
            float f18 = f15;
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar4 = j92.b.f97899b;
            float f19 = eVar4.f97920e;
            float f22 = eVar4.f97920e;
            r.a aVar9 = aVar4;
            o0 o0Var3 = o0Var;
            mh.c(str2, c2.l.C(aVar9, f19, f18, 0.0f, 0.0f, 12), 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, x0VarB2, o0Var3, 0, 0, 130044);
            ?? r19 = o0Var3;
            if (aVar5 != null) {
                zG2 = p005kotlin.jvm.internal.s.g(aVar5.f80408a, Boolean.FALSE);
            } else {
                r16 = r15;
            }
            if (r16 != 0) {
                r16 = zG2;
                r19.C(-279402109);
                String strValueOf = String.valueOf(aVar5.f80410c);
                fVar2.getClass();
                s5.x0 x0VarB3 = d92.c.b(j92.f.f97932i, r19);
                bVar4.getClass();
                mh.c(strValueOf, c2.l.C(aVar9, eVar4.f97917b, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, x0VarB3, r19, 0, 0, 130044);
                ?? r110 = r19;
                r110.g0(r15);
                r17 = r110;
            } else {
                r16 = zG2;
                r19.C(-279092109);
                r19.g0(r15);
                r17 = r19;
            }
            r17.g0(true);
            if (aVar5 != null) {
                zG = p005kotlin.jvm.internal.s.g(aVar5.f80408a, Boolean.TRUE);
            } else {
                r18 = r15;
            }
            if (r18 != 0) {
                r18 = zG;
                i15 = -1519161074;
                i16 = R.string.event_time;
            } else {
                r18 = zG;
                i15 = -1519159758;
                i16 = R.string.event_distance;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(r17, i15, i16, r17, r15);
            fVar2.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97932i, r17);
            bVar4.getClass();
            float f24 = eVar4.f97917b;
            bVar4.getClass();
            bVar4.getClass();
            float f25 = eVar4.f97921f;
            bVar4.getClass();
            ?? r24 = r17;
            mh.c(strJ, b0Var.b(c2.l.B(aVar9, f22, f24, f25, f22), h4.d.a.f81536n), 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, x0VarF, r24, 0, 0, 130044);
            ?? r111 = r24;
            r111.g0(true);
            r14 = r111;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r1(this, aVar5, i14, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"DefaultLocale"})
    public final void w6(k kVar, m mVar, int i14) {
        o0 o0Var;
        b bVar;
        gz1.a aVar;
        p1<Boolean> p1Var;
        boolean z14;
        int i15;
        int i16;
        kVar.getClass();
        o0 o0VarE = mVar.E(1922774018);
        int i17 = (o0VarE.r(kVar) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            p3.x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            gz1.a aVar2 = (gz1.a) p0.c(kVar.F, o0VarE, 0).getF182175a();
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(E6(context));
                o0VarE.K(objQ);
            }
            p1<String> p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            p1<Boolean> p1Var3 = (p1) objQ2;
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            h4.d.f81522a.getClass();
            g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            v6(aVar2, o0VarE, i17 & 112);
            if (aVar2 != null ? p005kotlin.jvm.internal.s.g(aVar2.f80408a, Boolean.TRUE) : false) {
                o0VarE.C(-1369124890);
                p1Var = p1Var3;
                A6(aVar2, p1Var2, p1Var, o0VarE, ((i17 << 6) & 7168) | 432);
                aVar = aVar2;
            } else {
                aVar = aVar2;
                p1Var = p1Var3;
                o0VarE.C(-1369122813);
                u6(aVar == null ? new gz1.a(null, null, null, null, null, null, null, null, 0L, null, null, 0.0d, 0L, 8191, null) : aVar, p1Var2, p1Var, o0VarE, ((i17 << 6) & 7168) | 432);
            }
            o0VarE.g0(false);
            if (F6().E4()) {
                z14 = false;
                o0VarE.C(507094198);
            } else {
                o0VarE.C(-1369117986);
                y6(aVar == null ? new gz1.a(null, null, null, null, null, null, null, null, 0L, null, null, 0.0d, 0L, 8191, null) : aVar, p1Var2, p1Var, o0VarE, ((i17 << 6) & 7168) | 432);
                z14 = false;
            }
            o0VarE.g0(z14);
            String f182175a = p1Var2.getF182175a();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar3.getClass();
            float f15 = eVar.f97920e;
            bVar3.getClass();
            r rVarB = b0Var.b(c2.l.C(aVar3, f15, f14, eVar.f97921f, 0.0f, 8), h4.d.a.f81536n);
            boolean z15 = z14;
            boolean z16 = true;
            p1<Boolean> p1Var4 = p1Var;
            mh.c(f182175a, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            c2.l.f(b0Var.a(aVar3, 1.0f, true), o0Var);
            if (F6().f74009h || F6().D4()) {
                i15 = -1369098003;
                i16 = R.string.lbl_next;
            } else {
                i15 = -1369099313;
                i16 = R.string.lbl_finish;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, i15, i16, o0Var, z15);
            if (F6().D4()) {
                o0Var.C(507762930);
                bVar = this;
                z16 = true;
                b82.c.b(null, null, z3.f.c(1181519780, new d50.i(p1Var4, strJ, aVar, bVar, 26), o0Var), null, 0L, o0Var, 384, 27);
                o0Var.g0(z15);
            } else {
                bVar = this;
                gz1.a aVar6 = aVar;
                o0Var.C(508242531);
                f0 f0Var = f0.f110999a;
                r rVarF2 = x2.f(aVar3, 1.0f);
                bVar3.getClass();
                r rVarP = c2.l.p(c2.l.A(rVarF2, eVar.f97920e, 0.0f, 2));
                boolean zBooleanValue = p1Var4.getF182175a().booleanValue();
                boolean zR = o0Var.r(aVar6) | o0Var.r(bVar);
                Object objQ3 = o0Var.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new fz1.e(aVar6, bVar, 1);
                    o0Var.K(objQ3);
                }
                f0Var.d(0, 1, (e23.a) objQ3, rVarP, strJ, o0Var, null, zBooleanValue);
                o0Var.g0(z15);
            }
            o0Var.g0(z16);
        } else {
            o0Var = o0VarE;
            bVar = this;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r1(bVar, kVar, i14, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r0v24, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r12v3, types: [l72.p2] */
    /* JADX WARN: Type inference failed for: r16v3, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.fragment.app.Fragment, com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r9v11, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v7, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    public final void y6(gz1.a aVar, p1<String> p1Var, p1<Boolean> p1Var2, m mVar, int i14) {
        int i15;
        ?? r14;
        p pVar;
        Boolean boolValueOf;
        Object v4Var;
        p1 p1Var3;
        int i16;
        int i17;
        int i18;
        gz1.a aVar2;
        ?? r15;
        ?? r16;
        int i19;
        int i24;
        p1 p1Var4;
        double d14;
        ?? r17;
        Object fVar;
        ?? r18 = this;
        String str = aVar.f80414g;
        ?? E = mVar.E(1094128170);
        if ((i14 & 6) == 0) {
            i15 = (E.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= E.B(p1Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= E.B(p1Var2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= E.r(r18) ? 2048 : 1024;
        }
        int i25 = i15;
        if (E.n(i25 & 1, (i25 & 1171) != 1170)) {
            p3.x1 x1Var = n.f135158a;
            Context context = (Context) E.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = E.q();
            m.f135153a.getClass();
            Object obj = m.a.f135155b;
            if (objQ == obj) {
                objQ = p0.n(Boolean.FALSE);
                E.K(objQ);
            }
            p1 p1Var5 = (p1) objQ;
            Object objQ2 = E.q();
            if (objQ2 == obj) {
                objQ2 = p0.n(Boolean.FALSE);
                E.K(objQ2);
            }
            p1 p1Var6 = (p1) objQ2;
            if (r18.F6().C4()) {
                E.C(665897541);
                pVar = new p(y.Q(E, R.string.lbl_course_goal_speed), y.Q(E, R.string.enter_goal_speed));
                E.g0(false);
            } else {
                E.C(666017511);
                p pVar2 = new p(y.Q(E, R.string.lbl_course_goal_pace), y.Q(E, R.string.enter_goal_pace));
                E.g0(false);
                pVar = pVar2;
            }
            String str2 = (String) pVar.f128594a;
            String str3 = (String) pVar.f128595b;
            if (str == null) {
                E.C(666163148);
                E.g0(false);
                boolValueOf = null;
            } else {
                E.C(-809794859);
                boolean z14 = d53.w.z(str, y.Q(E, R.string.no_value), false);
                E.g0(false);
                boolValueOf = Boolean.valueOf(z14);
            }
            boolean zG = p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE);
            boolean z15 = r18.f45997b;
            if (zG) {
                p pVar3 = z15 ? new p(149L, 779L) : new p(240L, 1200L);
                long jLongValue = ((Number) pVar3.f128594a).longValue();
                long jLongValue2 = ((Number) pVar3.f128595b).longValue();
                og0.a.f131967a.getClass();
                p pVarZ = og0.a.z(jLongValue);
                x0 x0Var = x0.f105818a;
                String str4 = String.format("%2d:%02d", Arrays.copyOf(new Object[]{pVarZ.f128594a, pVarZ.f128595b}, 2));
                p pVarZ2 = og0.a.z(jLongValue2);
                p pVar4 = new p(str4, String.format("%2d:%02d", Arrays.copyOf(new Object[]{pVarZ2.f128594a, pVarZ2.f128595b}, 2)));
                bg0.a.C0255a c0255a = bg0.a.f17827a;
                Context contextRequireContext = r18.requireContext();
                contextRequireContext.getClass();
                c0255a.getClass();
                String string = r18.getString(R.string.goal_pace_error, pVar4.f128594a, pVar4.f128595b, bg0.a.C0255a.b(contextRequireContext));
                string.getClass();
                p1Var.setValue(string);
            } else {
                str = str;
            }
            ?? r19 = l72.p2.f111205a;
            String str5 = r18.F6().C4() ? aVar.f80413f : str;
            if (str5 != null) {
                str3 = str5;
            }
            int i26 = i25 & 896;
            boolean zR = E.r(r18) | E.r(aVar) | (i26 == 256);
            Object objQ3 = E.q();
            if (zR || objQ3 == obj) {
                p1Var3 = p1Var5;
                i16 = 256;
                v4Var = new v4((Object) r18, aVar, p1Var2, p1Var6, p1Var3, 7);
                p1Var6 = p1Var6;
                E.K(v4Var);
            } else {
                v4Var = objQ3;
                i16 = 256;
                p1Var3 = p1Var5;
            }
            e23.a aVar3 = (e23.a) v4Var;
            Object obj2 = obj;
            int i27 = R.string.lbl_course_goal_speed;
            int i28 = i16;
            boolean z16 = false;
            r19.h(str2, str3, null, null, null, false, false, null, null, null, aVar3, E, 0, 0, 1020);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                E.C(667096590);
                fg0.d completionTarget = r18.F6().x4().getCompletionTarget();
                boolean z17 = (completionTarget == null || completionTarget.o()) ? false : true;
                Object objQ4 = E.q();
                if (objQ4 == obj2) {
                    objQ4 = new a2(p1Var3, 23);
                    E.K(objQ4);
                }
                e23.a aVar4 = (e23.a) objQ4;
                boolean zR2 = E.r(r18) | E.r(context);
                i18 = i26;
                boolean z18 = zR2 | (i18 == i28);
                Object objQ5 = E.q();
                if (z18 || objQ5 == obj2) {
                    i17 = i28;
                    fVar = new ev2.f(r18, context, p1Var2, p1Var3, 5);
                    E.K(fVar);
                } else {
                    i17 = i28;
                    fVar = objQ5;
                }
                z6(aVar, z17, aVar4, (l) fVar, E, (i25 & 14) | 384 | ((i25 << 3) & 57344));
                aVar2 = aVar;
                r15 = this;
                ?? r24 = E;
                r24.g0(z16);
                r16 = r24;
            } else {
                obj2 = obj2;
                i27 = R.string.lbl_course_goal_speed;
                i17 = i28;
                ?? r25 = E;
                i18 = i26;
                z16 = false;
                aVar2 = aVar;
                r25.C(667628984);
                r25.g0(false);
                r16 = r25;
                r15 = r18;
            }
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                r16.C(667680196);
                String strQ = y.Q(r16, i27);
                if (z15) {
                    i19 = -809742426;
                    i24 = R.string.kph;
                } else {
                    i19 = -809741338;
                    i24 = R.string.mph;
                }
                String strH = com.nimbusds.jose.shaded.gson.internal.a.h(strQ, " (", com.airbnb.lottie.animation.keyframe.a.j(r16, i19, i24, r16, z16), ")");
                double d15 = aVar2.f80419l;
                boolean zR3 = (i18 == i17 ? true : z16) | r16.r(aVar2);
                Object objQ6 = r16.q();
                if (zR3 || objQ6 == obj2) {
                    p1Var4 = p1Var6;
                    objQ6 = new fk0.a(p1Var2, 5, aVar2, p1Var4);
                    r16.K(objQ6);
                } else {
                    p1Var4 = p1Var6;
                }
                e23.a aVar5 = (e23.a) objQ6;
                boolean zR4 = r16.r(r15) | r16.r(r2) | r16.r(aVar2) | (i18 == i17);
                Object objQ7 = r16.q();
                if (zR4 || objQ7 == obj2) {
                    d14 = d15;
                    ?? r26 = r16;
                    e1 e1Var = new e1(r15, context, aVar2, p1Var4, p1Var2, 17);
                    r26.K(e1Var);
                    objQ7 = e1Var;
                    r17 = r26;
                } else {
                    r17 = r16;
                    d14 = d15;
                }
                ?? r110 = r17;
                f10.m.d(strH, null, null, d14, aVar5, (l) objQ7, r110, 0);
                ?? r27 = r110;
                r27.g0(false);
                r14 = r27;
            } else {
                ?? r28 = r16;
                r28.C(668345208);
                r28.g0(z16);
                r14 = r28;
            }
        } else {
            E.e();
            r14 = E;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fz1.f(this, aVar, p1Var, p1Var2, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z6(gz1.a aVar, boolean z14, e23.a<Unit> aVar2, l<? super Boolean, Unit> lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(406537782);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(this) ? 16384 : 8192;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            p3.x1 x1Var = n.f135158a;
            q0 q0Var = new q0();
            p005kotlin.jvm.internal.n0 n0Var = new p005kotlin.jvm.internal.n0();
            Double d14 = aVar.f80415h;
            long j8 = aVar.f80416i;
            n0Var.f105805a = d14 != null ? d14.doubleValue() : j8;
            boolean z15 = this.f45997b;
            long j14 = z15 ? 149L : 240L;
            long j15 = z15 ? 779L : 1200L;
            og0.a.f131967a.getClass();
            p pVarZ = og0.a.z(j14);
            p pVarZ2 = og0.a.z(j15);
            o0Var = o0VarE;
            f10.m.b(com.nimbusds.jose.shaded.gson.internal.a.h(y.Q(o0VarE, R.string.lbl_course_goal_pace), " (", y.Q(o0VarE, R.string.common_abbrev_mm_ss_string), ")"), e0.h(((Number) pVarZ.f128594a).intValue(), ((Number) pVarZ2.f128594a).intValue()), e0.h(((Number) pVarZ.f128595b).intValue(), ((Number) pVarZ2.f128595b).intValue()), Long.valueOf(j8), null, null, aVar2, new ds.e(z14, aVar, this, q0Var, n0Var, lVar, 1), o0Var, (i16 << 12) & 3670016, 48);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(this, aVar, z14, aVar2, lVar, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
