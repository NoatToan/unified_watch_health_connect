package com.garmin.android.apps.connectmobile.traininginitiative.ui;

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
import b21.n9;
import b82.t0;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.google.android.exoplayer2.audio.WavUtil;
import ds.e0;
import i3.e5;
import i3.mh;
import java.util.Arrays;
import java.util.List;
import l72.p2;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x3;
import s5.i0;
import s5.r0;
import ty1.k0;
import ty1.l0;
import w5.c0;
import w5.f0;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0015²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u0014\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00050\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "distanceAllowed", "Lny1/e;", "eventType", "kotlin.jvm.PlatformType", "isValidDistance", "", "timeInSeconds", "Lbg0/a$c;", "distanceVal", "enableNextBtn", "showTimePicker", "shouldShowCourseReset", "", "value", "unit", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46110c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46111a = new w1(s0.f105811a.b(AddTIEventViewModel.class), new e(this), new g(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f46112b = new d();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.TIAddEventDistanceTimeFragment$EventDistanceAndTimeInputScreen$1$1", f = "TIAddEventDistanceTimeFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AddTIEventViewModel f46113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<bg0.a.c> f46114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f46115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(AddTIEventViewModel addTIEventViewModel, x3<? extends bg0.a.c> x3Var, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f46113a = addTIEventViewModel;
            this.f46114b = x3Var;
            this.f46115c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f46113a, this.f46114b, this.f46115c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003b  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            bg0.a.c cVarD = this.f46113a.n5().d();
            boolean z14 = false;
            if (cVarD != null) {
                Number number = cVarD.f17834a;
                a aVar2 = k.f46110c;
                x3<bg0.a.c> x3Var = this.f46114b;
                bg0.a.c f182175a = x3Var.getF182175a();
                if (p005kotlin.jvm.internal.s.g(number, f182175a != null ? f182175a.f17834a : null)) {
                    bg0.a.b bVar = cVarD.f17835b;
                    bg0.a.c f182175a2 = x3Var.getF182175a();
                    if (bVar != (f182175a2 != null ? f182175a2.f17835b : null)) {
                        z14 = true;
                    }
                } else {
                    z14 = true;
                }
            }
            a aVar3 = k.f46110c;
            this.f46115c.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46116a;

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
            f46116a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/k$d", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = k.f46110c;
            k kVar = k.this;
            AddTIEventViewModel addTIEventViewModelC6 = kVar.C6();
            addTIEventViewModelC6.s5().o(addTIEventViewModelC6.q5());
            f(false);
            kVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46118a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46118a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46118a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46119a = aVar;
            this.f46120b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46119a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46120b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46121a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46121a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46121a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    public final void A6(Integer num, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        o0 o0VarE = mVar.E(496477715);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(num) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (num != null) {
                int iIntValue = num.intValue();
                l3.f23124b.getClass();
                strJ = l3.a.V(iIntValue, true);
            } else {
                strJ = null;
            }
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 373720764, R.string.enter_event_time, o0VarE, false);
            } else {
                o0VarE.C(373717819);
                o0VarE.g0(false);
            }
            String str = strJ;
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.activity_stats_details_total_time_label);
            z3.e eVarC = z3.f.c(2114920518, new fx0.f(num, 3), o0VarE);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new sq1.e(lVar, 27);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sq1.e(lVar, 27);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            p2Var.h(strQ, str, null, null, null, false, false, null, eVarC, null, (e23.a) objQ, o0Var, 100663296, 0, 764);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(this, num, lVar, i14, 1);
        }
    }

    public final AddTIEventViewModel C6() {
        return (AddTIEventViewModel) this.f46111a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    public final void E6(Integer num, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1151454728);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(num) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            i53.c cVarH = e0.h(0, 47);
            i53.c cVarH2 = e0.h(0, 59);
            i53.c cVarH3 = e0.h(0, 59);
            Long lValueOf = Long.valueOf(num != null ? num.intValue() : 3600L);
            boolean zR = o0VarE.r(this) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new sy.i(this, lVar, 28);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sy.i(this, lVar, 28);
                    o0VarE.K(objQ);
                }
            }
            f10.m.f(null, cVarH, cVarH2, cVarH3, lValueOf, true, (e23.l) objQ, o0VarE, 196608, 1);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(this, num, lVar, i14, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(-1530011120, true, new k0(this, 0)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46112b, viewLifecycleOwner);
        AddTIEventViewModel addTIEventViewModelC6 = C6();
        addTIEventViewModelC6.s5().n(addTIEventViewModelC6.q5(), new AddTIEventViewModel.f(new mz1.d(addTIEventViewModelC6, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(String str, i53.c cVar, e23.l lVar, String str2, e23.l lVar2, boolean z14, p3.m mVar, int i14) {
        int i15;
        String str3;
        e23.l lVar3;
        String strG;
        String str4;
        o0 o0VarE = mVar.E(-1910171141);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            str3 = str2;
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i14 & 24576) == 0) {
            lVar3 = lVar2;
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        } else {
            lVar3 = lVar2;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        int i16 = i15 | 1572864;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                strG = str;
            } else {
                bg0.a.f17827a.getClass();
                String strA = bg0.a.C0255a.c(str3).a(context);
                Double dF = d53.s.f(str);
                if (dF != null) {
                    double dDoubleValue = dF.doubleValue();
                    x0 x0Var = x0.f105818a;
                    str4 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
                } else {
                    str4 = null;
                }
                if (g22.n.d(str4)) {
                    strG = e5.g(str4, StringUtils.SPACE, strA);
                } else {
                    strG = str;
                }
            }
            p2 p2Var = p2.f111205a;
            e23.p pVarO = gg.b.o(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(-1761058510, new cw1.v(str3, cVar, lVar3, 3, (byte) 0), o0VarE), o0VarE);
            z3.e eVarC = z3.f.c(-1650600387, new li0.y(lVar, strG, p1Var, z14), o0VarE);
            ty1.a.f167061a.getClass();
            p2Var.b(null, eVarC, pVarO, ty1.a.f167062b, o0VarE, 3120, 1);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(this, str, cVar, lVar, str2, lVar2, z14, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v6(bg0.a.c cVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        String string;
        o0 o0VarE = mVar.E(117650762);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strValueOf = "";
            if (cVar != null) {
                Number number = cVar.f17834a;
                if (p005kotlin.jvm.internal.s.c(number != null ? Double.valueOf(number.doubleValue() % 1.0d) : null, 0.0d)) {
                    strValueOf = String.valueOf(number != null ? Integer.valueOf(number.intValue()) : null);
                } else if (number != null && (string = number.toString()) != null) {
                    strValueOf = string;
                }
            }
            bg0.a.b bVar = bg0.a.b.MILE;
            b82.j.a aVar = new b82.j.a(bVar.toString(), null, null, bVar.a(context), false, null, bVar.b(context), 54, null);
            bg0.a.b bVar2 = bg0.a.b.KILOMETER;
            b82.j.a aVar2 = new b82.j.a(bVar2.toString(), null, null, bVar2.a(context), false, null, bVar2.b(context), 54, null);
            bg0.a.b bVar3 = bg0.a.b.METER;
            b82.j.a aVar3 = new b82.j.a(bVar3.toString(), null, null, bVar3.a(context), false, null, bVar3.b(context), 54, null);
            bg0.a.b bVar4 = bg0.a.b.YARD;
            List listK = p13.x.k(aVar, aVar2, aVar3, new b82.j.a(bVar4.toString(), null, null, bVar4.a(context), false, null, bVar4.b(context), 54, null));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(strValueOf);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(String.valueOf(cVar != null ? cVar.f17835b : null));
                o0VarE.K(objQ2);
            }
            final p1 p1Var2 = (p1) objQ2;
            i53.c cVarE = i53.a.e(listK);
            String str = (String) p1Var2.getF182175a();
            boolean zR = o0VarE.r(this);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new e23.l(this) { // from class: ty1.m0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.k f167180b;

                    {
                        this.f167180b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i18 = i16;
                        p3.p1 p1Var3 = p1Var;
                        p3.p1 p1Var4 = p1Var2;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.k kVar = this.f167180b;
                        String str2 = (String) obj;
                        switch (i18) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                                str2.getClass();
                                if (!g22.n.d(str2) || d53.s.f(str2) == null) {
                                    kVar.C6().C6(null);
                                } else {
                                    AddTIEventViewModel addTIEventViewModelC6 = kVar.C6();
                                    Double dF = d53.s.f(str2);
                                    bg0.a.C0255a c0255a = bg0.a.f17827a;
                                    String str3 = (String) p1Var4.getF182175a();
                                    c0255a.getClass();
                                    addTIEventViewModelC6.C6(new bg0.a.c(dF, bg0.a.C0255a.c(str3)));
                                }
                                p1Var3.setValue(str2);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                                str2.getClass();
                                p1Var4.setValue(str2);
                                if (!g22.n.d(str2) || d53.s.f((String) p1Var3.getF182175a()) == null) {
                                    kVar.C6().C6(null);
                                } else {
                                    AddTIEventViewModel addTIEventViewModelC7 = kVar.C6();
                                    Double dValueOf = Double.valueOf(Double.parseDouble((String) p1Var3.getF182175a()));
                                    bg0.a.C0255a c0255a2 = bg0.a.f17827a;
                                    String str4 = (String) p1Var4.getF182175a();
                                    c0255a2.getClass();
                                    addTIEventViewModelC7.C6(new bg0.a.c(dValueOf, bg0.a.C0255a.c(str4)));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR2 = o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new e23.l(this) { // from class: ty1.m0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.k f167180b;

                    {
                        this.f167180b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i18 = i17;
                        p3.p1 p1Var3 = p1Var;
                        p3.p1 p1Var4 = p1Var2;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.k kVar = this.f167180b;
                        String str2 = (String) obj;
                        switch (i18) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                                str2.getClass();
                                if (!g22.n.d(str2) || d53.s.f(str2) == null) {
                                    kVar.C6().C6(null);
                                } else {
                                    AddTIEventViewModel addTIEventViewModelC6 = kVar.C6();
                                    Double dF = d53.s.f(str2);
                                    bg0.a.C0255a c0255a = bg0.a.f17827a;
                                    String str3 = (String) p1Var4.getF182175a();
                                    c0255a.getClass();
                                    addTIEventViewModelC6.C6(new bg0.a.c(dF, bg0.a.C0255a.c(str3)));
                                }
                                p1Var3.setValue(str2);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                                str2.getClass();
                                p1Var4.setValue(str2);
                                if (!g22.n.d(str2) || d53.s.f((String) p1Var3.getF182175a()) == null) {
                                    kVar.C6().C6(null);
                                } else {
                                    AddTIEventViewModel addTIEventViewModelC7 = kVar.C6();
                                    Double dValueOf = Double.valueOf(Double.parseDouble((String) p1Var3.getF182175a()));
                                    bg0.a.C0255a c0255a2 = bg0.a.f17827a;
                                    String str4 = (String) p1Var4.getF182175a();
                                    c0255a2.getClass();
                                    addTIEventViewModelC7.C6(new bg0.a.c(dValueOf, bg0.a.C0255a.c(str4)));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            }
            u6(strValueOf, cVarE, lVar, str, (e23.l) objQ4, z14, o0VarE, ((i15 << 15) & 29360128) | ((i15 << 12) & 458752));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(this, cVar, z14, i14, 26);
        }
    }

    public final void w6(boolean z14, Integer num, ny1.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String string;
        o0 o0VarE = mVar.E(-965400234);
        if ((i14 & 384) == 0) {
            i15 = (o0VarE.k(eVar.ordinal()) ? 256 : 128) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1153) != 1152)) {
            p3.x1 x1Var = p3.n.f135158a;
            bg0.a.f17827a.getClass();
            bg0.a.b bVarA = bg0.a.C0255a.a();
            if (eVar == ny1.e.DISTANCE) {
                o0VarE.C(-1137106379);
                Integer numV = og0.a.v(bVarA);
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                string = gl1.y.P(R.string.event_distance_range, new Object[]{0, numV, bVarA.a(contextRequireContext)}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-36675890);
                o0VarE.g0(false);
                string = getString(R.string.event_time_range, 0, 48);
                string.getClass();
            }
            String str = string;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar.getClass();
            o0Var = o0VarE;
            mh.c(str, c2.l.z(aVar, f14, eVar2.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(this, z14, num, eVar, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    public final void y6(ny1.e eVar, p3.m mVar, int i14) {
        o0 o0Var;
        String strP;
        o0 o0VarE = mVar.E(-1577464789);
        int i15 = (o0VarE.k(eVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            ny1.e eVar2 = ny1.e.DISTANCE;
            if (eVar == eVar2) {
                o0VarE.C(1278763235);
                String strD = C6().x5().d();
                strP = gl1.y.P(R.string.time_based_event, new Object[]{strD != null ? strD : ""}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1278884383);
                String strD2 = C6().x5().d();
                strP = gl1.y.P(R.string.distance_based_event, new Object[]{strD2 != null ? strD2 : ""}, o0VarE);
                o0VarE.g0(false);
            }
            s5.c.b bVarH = l2.h(o0VarE, 179807843, 0, 1, null);
            boolean zR = o0VarE.r(this) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new hl1.k(4, eVar, this);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new hl1.k(4, eVar, this);
                    o0VarE.K(objQ);
                }
            }
            gl.c.f77766a.getClass();
            int iG = bVarH.g(new s5.m.a(strP, new r0(new i0(gl.c.a(o0VarE).c(), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null), (s5.n) objQ));
            try {
                bVarH.b(strP);
                Unit unit = Unit.INSTANCE;
                bVarH.f(iG);
                if (eVar == eVar2) {
                    o0VarE.C(-429654206);
                    d92.b.f58623a.getClass();
                    int iJ = bVarH.j(new i0(d92.b.a(o0VarE).k().d(), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                    try {
                        bVarH.b(gl1.y.Q(o0VarE, R.string.event_time_based_examples));
                        bVarH.f(iJ);
                        o0VarE.g0(false);
                    } catch (Throwable th3) {
                        bVarH.f(iJ);
                        throw th3;
                    }
                } else {
                    o0VarE.C(-429421644);
                    o0VarE.g0(false);
                }
                s5.c cVarK = bVarH.k();
                o0VarE.g0(false);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0Var = j92.f.f97931h;
                h4.r.a aVar = h4.r.S;
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f14 = eVar3.f97920e;
                bVar.getClass();
                o0Var = o0VarE;
                mh.d(cVarK, c2.l.C(aVar, f14, eVar3.f97917b, 0.0f, 0.0f, 12), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0Var, o0Var, 0, 0, 262140);
            } catch (Throwable th4) {
                bVarH.f(iG);
                throw th4;
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l(this, eVar, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:103:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0411  */
    /* JADX WARN: Code duplicated, block: B:111:0x0427  */
    /* JADX WARN: Code duplicated, block: B:113:0x0439  */
    /* JADX WARN: Code duplicated, block: B:116:0x0455  */
    /* JADX WARN: Code duplicated, block: B:118:0x0465  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:64:0x01df  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x020a  */
    /* JADX WARN: Code duplicated, block: B:76:0x021a  */
    /* JADX WARN: Code duplicated, block: B:77:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x0305  */
    /* JADX WARN: Code duplicated, block: B:89:0x030d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0313  */
    /* JADX WARN: Code duplicated, block: B:94:0x0319  */
    /* JADX WARN: Code duplicated, block: B:95:0x032d  */
    /* JADX WARN: Code duplicated, block: B:99:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void z6(AddTIEventViewModel addTIEventViewModel, p3.m mVar, int i14) {
        k kVar;
        boolean z14;
        Boolean bool;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        ny1.e eVar;
        ny1.e eVar2;
        int i15;
        j92.b bVar;
        float f14;
        Boolean bool2;
        Object objQ;
        boolean z15;
        o0 o0Var;
        boolean z16;
        int i16;
        l72.f0 f0Var;
        boolean zR;
        Object objQ2;
        boolean z17;
        Object objQ3;
        boolean zR2;
        Object objQ4;
        Integer num;
        int iIntValue;
        AddTIEventViewModel addTIEventViewModel2 = addTIEventViewModel;
        addTIEventViewModel2.getClass();
        o0 o0VarE = mVar.E(1317985631);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.r(addTIEventViewModel2) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) addTIEventViewModel2.F1.getValue();
            Boolean bool3 = Boolean.TRUE;
            p1 p1VarF = o53.f0.F((androidx.lifecycle.s0) addTIEventViewModel2.D1.getValue(), ((Boolean) o53.f0.F(s0Var, bool3, o0VarE, 48).getF182175a()).booleanValue() ? ny1.e.DISTANCE : ny1.e.TIME, o0VarE, 0);
            p1 p1VarF2 = o53.f0.F(addTIEventViewModel2.s5(), Boolean.valueOf(addTIEventViewModel2.k6()), o0VarE, 0);
            p1 p1VarG = o53.f0.G(addTIEventViewModel2.t5(), o0VarE);
            androidx.lifecycle.s0<bg0.a.c> s0VarQ5 = addTIEventViewModel2.q5();
            bg0.a.c cVarD = addTIEventViewModel2.n5().d();
            if (cVarD == null) {
                bg0.a.f17827a.getClass();
                cVarD = new bg0.a.c(null, bg0.a.C0255a.a());
            }
            p1 p1VarF3 = o53.f0.F(s0VarQ5, cVarD, o0VarE, 64);
            Object objQ5 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p1 p1Var2 = (p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ7);
            }
            p1 p1Var3 = (p1) objQ7;
            if (p005kotlin.jvm.internal.s.g((Boolean) p1VarF2.getF182175a(), Boolean.FALSE) && ((ny1.e) p1VarF.getF182175a()) == ny1.e.DISTANCE) {
                z14 = true;
            } else {
                Integer num2 = (Integer) p1VarG.getF182175a();
                if ((num2 != null ? num2.intValue() : -1) <= 0 || ((ny1.e) p1VarF.getF182175a()) != ny1.e.TIME) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
            p1Var.setValue(Boolean.valueOf(z14));
            bg0.a.c cVar2 = (bg0.a.c) p1VarF3.getF182175a();
            boolean zR3 = o0VarE.r(addTIEventViewModel2) | o0VarE.B(p1VarF3);
            Object objQ8 = o0VarE.q();
            if (zR3 || objQ8 == c2565a) {
                objQ8 = new b(addTIEventViewModel2, p1VarF3, p1Var3, null);
                o0VarE.K(objQ8);
            }
            p3.l0.e((e23.p) objQ8, cVar2, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                bool = bool3;
            } else {
                bool = bool3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = c2.b0.f22601a;
                h4.r rVarF = x2.f(aVar, 1.0f);
                zVarA = c2.y.a(kVar2, h4.d.a.f81537o, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                eVar = (ny1.e) p1VarF.getF182175a();
                eVar2 = ny1.e.DISTANCE;
                if (eVar == eVar2) {
                    i15 = R.string.event_total_distance;
                } else {
                    i15 = R.string.event_total_time;
                }
                String strQ = gl1.y.Q(o0VarE, i15);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                d6.h.f57752b.getClass();
                int i18 = d6.h.f57755e;
                bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar4 = j92.b.f97899b;
                float f15 = eVar4.f97921f;
                f14 = eVar4.f97920e;
                bVar.getClass();
                bVar.getClass();
                float f16 = eVar4.f97921f;
                bVar.getClass();
                bool2 = bool;
                mh.c(strQ, c2.l.B(aVar, f14, f15, f16, eVar4.f97922g), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                o0VarE.g0(true);
                if (((ny1.e) p1VarF.getF182175a()) == eVar2) {
                    o0VarE.C(2023669636);
                    v6((bg0.a.c) p1VarF3.getF182175a(), p005kotlin.jvm.internal.s.g((Boolean) p1VarF2.getF182175a(), bool2), o0VarE, ((i17 << 3) & 896) | 8);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2023761985);
                    Integer num3 = (Integer) p1VarG.getF182175a();
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = new sk0.n(p1Var2, 13);
                        o0VarE.K(objQ);
                    }
                    A6(num3, (e23.l) objQ, o0VarE, ((i17 << 3) & 896) | 48);
                    o0VarE.g0(false);
                }
                if (((Boolean) p1VarF2.getF182175a()).booleanValue()) {
                    z15 = true;
                } else {
                    num = (Integer) p1VarG.getF182175a();
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    z15 = true;
                    if (iIntValue < 1) {
                        o0VarE.C(2024157049);
                        o0VarE.g0(false);
                        z16 = true;
                        o0Var = o0VarE;
                        i16 = 2;
                    }
                    y6((ny1.e) p1VarF.getF182175a(), o0Var, i17 & 112);
                    c2.l.f(b0Var.a(aVar, 1.0f, z16), o0Var);
                    f0Var = l72.f0.f110999a;
                    h4.r rVarF2 = x2.f(aVar, 1.0f);
                    bVar.getClass();
                    h4.r rVarP = c2.l.p(c2.l.A(rVarF2, f14, 0.0f, i16));
                    String strQ2 = gl1.y.Q(o0Var, R.string.lbl_next);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    zR = o0Var.r(addTIEventViewModel);
                    objQ2 = o0Var.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new mz1.e(addTIEventViewModel, 6);
                        o0Var.K(objQ2);
                    }
                    addTIEventViewModel2 = addTIEventViewModel;
                    f0Var.d(0, 1, (e23.a) objQ2, rVarP, strQ2, o0Var, null, zBooleanValue);
                    o0VarE = o0Var;
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        h4.r rVarP2 = c2.l.p(c2.l.A(e0.g(o0VarE, 2025031962, aVar, 1.0f, bVar), f14, 0.0f, 2));
                        String strQ3 = gl1.y.Q(o0VarE, R.string.reset_to_course_distance);
                        zR2 = o0VarE.r(addTIEventViewModel2);
                        objQ4 = o0VarE.q();
                        if (zR2 || objQ4 == c2565a) {
                            objQ4 = new tb0.d(15, addTIEventViewModel2, p1Var3);
                            o0VarE.K(objQ4);
                        }
                        f0Var.k(strQ3, rVarP2, false, (e23.a) objQ4, o0VarE, 0, 4);
                        z17 = false;
                        o0VarE.g0(false);
                    } else {
                        z17 = false;
                        o0VarE.C(2025536921);
                        o0VarE.g0(false);
                    }
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        o0VarE.C(2025575640);
                        Integer num4 = (Integer) p1VarG.getF182175a();
                        objQ3 = o0VarE.q();
                        if (objQ3 == c2565a) {
                            objQ3 = new sk0.n(p1Var2, 14);
                            o0VarE.K(objQ3);
                        }
                        kVar = this;
                        kVar.E6(num4, (e23.l) objQ3, o0VarE, ((i17 << 3) & 896) | 48);
                        o0VarE.g0(z17);
                    } else {
                        kVar = this;
                        o0VarE.C(2025730361);
                        o0VarE.g0(z17);
                    }
                    o0VarE.g0(true);
                }
                o0VarE.C(2024055183);
                z16 = z15;
                i16 = 2;
                w6(p005kotlin.jvm.internal.s.g((Boolean) p1VarF2.getF182175a(), bool2), (Integer) p1VarG.getF182175a(), (ny1.e) p1VarF.getF182175a(), o0VarE, (i17 << 6) & 7168);
                o0Var = o0VarE;
                o0Var.g0(false);
                y6((ny1.e) p1VarF.getF182175a(), o0Var, i17 & 112);
                c2.l.f(b0Var.a(aVar, 1.0f, z16), o0Var);
                f0Var = l72.f0.f110999a;
                h4.r rVarF3 = x2.f(aVar, 1.0f);
                bVar.getClass();
                h4.r rVarP3 = c2.l.p(c2.l.A(rVarF3, f14, 0.0f, i16));
                String strQ4 = gl1.y.Q(o0Var, R.string.lbl_next);
                boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                zR = o0Var.r(addTIEventViewModel);
                objQ2 = o0Var.q();
                if (zR) {
                    objQ2 = new mz1.e(addTIEventViewModel, 6);
                    o0Var.K(objQ2);
                } else {
                    objQ2 = new mz1.e(addTIEventViewModel, 6);
                    o0Var.K(objQ2);
                }
                addTIEventViewModel2 = addTIEventViewModel;
                f0Var.d(0, 1, (e23.a) objQ2, rVarP3, strQ4, o0Var, null, zBooleanValue2);
                o0VarE = o0Var;
                if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                    h4.r rVarP4 = c2.l.p(c2.l.A(e0.g(o0VarE, 2025031962, aVar, 1.0f, bVar), f14, 0.0f, 2));
                    String strQ5 = gl1.y.Q(o0VarE, R.string.reset_to_course_distance);
                    zR2 = o0VarE.r(addTIEventViewModel2);
                    objQ4 = o0VarE.q();
                    if (zR2) {
                        objQ4 = new tb0.d(15, addTIEventViewModel2, p1Var3);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new tb0.d(15, addTIEventViewModel2, p1Var3);
                        o0VarE.K(objQ4);
                    }
                    f0Var.k(strQ5, rVarP4, false, (e23.a) objQ4, o0VarE, 0, 4);
                    z17 = false;
                    o0VarE.g0(false);
                } else {
                    z17 = false;
                    o0VarE.C(2025536921);
                    o0VarE.g0(false);
                }
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(2025575640);
                    Integer num5 = (Integer) p1VarG.getF182175a();
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new sk0.n(p1Var2, 14);
                        o0VarE.K(objQ3);
                    }
                    kVar = this;
                    kVar.E6(num5, (e23.l) objQ3, o0VarE, ((i17 << 3) & 896) | 48);
                    o0VarE.g0(z17);
                } else {
                    kVar = this;
                    o0VarE.C(2025730361);
                    o0VarE.g0(z17);
                }
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = c2.b0.f22601a;
            h4.r rVarF4 = x2.f(aVar, 1.0f);
            zVarA = c2.y.a(kVar2, h4.d.a.f81537o, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarF4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            eVar = (ny1.e) p1VarF.getF182175a();
            eVar2 = ny1.e.DISTANCE;
            if (eVar == eVar2) {
                i15 = R.string.event_total_distance;
            } else {
                i15 = R.string.event_total_time;
            }
            String strQ6 = gl1.y.Q(o0VarE, i15);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
            d6.h.f57752b.getClass();
            int i19 = d6.h.f57755e;
            bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar5 = j92.b.f97899b;
            float f17 = eVar5.f97921f;
            f14 = eVar5.f97920e;
            bVar.getClass();
            bVar.getClass();
            float f18 = eVar5.f97921f;
            bVar.getClass();
            bool2 = bool;
            mh.c(strQ6, c2.l.B(aVar, f14, f17, f18, eVar5.f97922g), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
            o0VarE.g0(true);
            if (((ny1.e) p1VarF.getF182175a()) == eVar2) {
                o0VarE.C(2023669636);
                v6((bg0.a.c) p1VarF3.getF182175a(), p005kotlin.jvm.internal.s.g((Boolean) p1VarF2.getF182175a(), bool2), o0VarE, ((i17 << 3) & 896) | 8);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2023761985);
                Integer num6 = (Integer) p1VarG.getF182175a();
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new sk0.n(p1Var2, 13);
                    o0VarE.K(objQ);
                }
                A6(num6, (e23.l) objQ, o0VarE, ((i17 << 3) & 896) | 48);
                o0VarE.g0(false);
            }
            if (((Boolean) p1VarF2.getF182175a()).booleanValue()) {
                num = (Integer) p1VarG.getF182175a();
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                z15 = true;
                if (iIntValue < 1) {
                    o0VarE.C(2024157049);
                    o0VarE.g0(false);
                    z16 = true;
                    o0Var = o0VarE;
                    i16 = 2;
                }
                y6((ny1.e) p1VarF.getF182175a(), o0Var, i17 & 112);
                c2.l.f(b0Var.a(aVar, 1.0f, z16), o0Var);
                f0Var = l72.f0.f110999a;
                h4.r rVarF5 = x2.f(aVar, 1.0f);
                bVar.getClass();
                h4.r rVarP5 = c2.l.p(c2.l.A(rVarF5, f14, 0.0f, i16));
                String strQ7 = gl1.y.Q(o0Var, R.string.lbl_next);
                boolean zBooleanValue3 = ((Boolean) p1Var.getF182175a()).booleanValue();
                zR = o0Var.r(addTIEventViewModel);
                objQ2 = o0Var.q();
                if (zR) {
                    objQ2 = new mz1.e(addTIEventViewModel, 6);
                    o0Var.K(objQ2);
                } else {
                    objQ2 = new mz1.e(addTIEventViewModel, 6);
                    o0Var.K(objQ2);
                }
                addTIEventViewModel2 = addTIEventViewModel;
                f0Var.d(0, 1, (e23.a) objQ2, rVarP5, strQ7, o0Var, null, zBooleanValue3);
                o0VarE = o0Var;
                if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                    h4.r rVarP6 = c2.l.p(c2.l.A(e0.g(o0VarE, 2025031962, aVar, 1.0f, bVar), f14, 0.0f, 2));
                    String strQ8 = gl1.y.Q(o0VarE, R.string.reset_to_course_distance);
                    zR2 = o0VarE.r(addTIEventViewModel2);
                    objQ4 = o0VarE.q();
                    if (zR2) {
                        objQ4 = new tb0.d(15, addTIEventViewModel2, p1Var3);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new tb0.d(15, addTIEventViewModel2, p1Var3);
                        o0VarE.K(objQ4);
                    }
                    f0Var.k(strQ8, rVarP6, false, (e23.a) objQ4, o0VarE, 0, 4);
                    z17 = false;
                    o0VarE.g0(false);
                } else {
                    z17 = false;
                    o0VarE.C(2025536921);
                    o0VarE.g0(false);
                }
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(2025575640);
                    Integer num7 = (Integer) p1VarG.getF182175a();
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new sk0.n(p1Var2, 14);
                        o0VarE.K(objQ3);
                    }
                    kVar = this;
                    kVar.E6(num7, (e23.l) objQ3, o0VarE, ((i17 << 3) & 896) | 48);
                    o0VarE.g0(z17);
                } else {
                    kVar = this;
                    o0VarE.C(2025730361);
                    o0VarE.g0(z17);
                }
                o0VarE.g0(true);
            } else {
                z15 = true;
            }
            o0VarE.C(2024055183);
            z16 = z15;
            i16 = 2;
            w6(p005kotlin.jvm.internal.s.g((Boolean) p1VarF2.getF182175a(), bool2), (Integer) p1VarG.getF182175a(), (ny1.e) p1VarF.getF182175a(), o0VarE, (i17 << 6) & 7168);
            o0Var = o0VarE;
            o0Var.g0(false);
            y6((ny1.e) p1VarF.getF182175a(), o0Var, i17 & 112);
            c2.l.f(b0Var.a(aVar, 1.0f, z16), o0Var);
            f0Var = l72.f0.f110999a;
            h4.r rVarF6 = x2.f(aVar, 1.0f);
            bVar.getClass();
            h4.r rVarP7 = c2.l.p(c2.l.A(rVarF6, f14, 0.0f, i16));
            String strQ9 = gl1.y.Q(o0Var, R.string.lbl_next);
            boolean zBooleanValue4 = ((Boolean) p1Var.getF182175a()).booleanValue();
            zR = o0Var.r(addTIEventViewModel);
            objQ2 = o0Var.q();
            if (zR) {
                objQ2 = new mz1.e(addTIEventViewModel, 6);
                o0Var.K(objQ2);
            } else {
                objQ2 = new mz1.e(addTIEventViewModel, 6);
                o0Var.K(objQ2);
            }
            addTIEventViewModel2 = addTIEventViewModel;
            f0Var.d(0, 1, (e23.a) objQ2, rVarP7, strQ9, o0Var, null, zBooleanValue4);
            o0VarE = o0Var;
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                h4.r rVarP8 = c2.l.p(c2.l.A(e0.g(o0VarE, 2025031962, aVar, 1.0f, bVar), f14, 0.0f, 2));
                String strQ10 = gl1.y.Q(o0VarE, R.string.reset_to_course_distance);
                zR2 = o0VarE.r(addTIEventViewModel2);
                objQ4 = o0VarE.q();
                if (zR2) {
                    objQ4 = new tb0.d(15, addTIEventViewModel2, p1Var3);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new tb0.d(15, addTIEventViewModel2, p1Var3);
                    o0VarE.K(objQ4);
                }
                f0Var.k(strQ10, rVarP8, false, (e23.a) objQ4, o0VarE, 0, 4);
                z17 = false;
                o0VarE.g0(false);
            } else {
                z17 = false;
                o0VarE.C(2025536921);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(2025575640);
                Integer num8 = (Integer) p1VarG.getF182175a();
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new sk0.n(p1Var2, 14);
                    o0VarE.K(objQ3);
                }
                kVar = this;
                kVar.E6(num8, (e23.l) objQ3, o0VarE, ((i17 << 3) & 896) | 48);
                o0VarE.g0(z17);
            } else {
                kVar = this;
                o0VarE.C(2025730361);
                o0VarE.g0(z17);
            }
            o0VarE.g0(true);
        } else {
            kVar = this;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l(kVar, addTIEventViewModel2, i14, 18);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
