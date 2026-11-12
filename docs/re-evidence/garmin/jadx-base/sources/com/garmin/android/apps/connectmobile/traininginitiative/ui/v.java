package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import g02.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p1;
import p3.p2;
import r1.c0;
import ty1.f1;
import ty1.h0;
import ty1.k1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/v;", "Lty1/h0;", "<init>", "()V", "a", "Lm52/i;", "triathlonType", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46300e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46302c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f46303d = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/v$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            v vVar = v.this;
            vVar.f46303d.f(false);
            if (!vVar.F6().D2) {
                vVar.requireActivity().onBackPressed();
                return;
            }
            androidx.fragment.app.m activity = vVar.getActivity();
            if (activity != null) {
                activity.setResult(0);
                activity.finish();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46305a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f46305a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46305a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46307b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46306a = aVar;
            this.f46307b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46306a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46307b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46308a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46308a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public final void A6(boolean z14, p3.m mVar, int i14) {
        boolean z15;
        o0 o0VarE = mVar.E(1425055211);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            ty1.b.f167071a.getClass();
            z15 = z14;
            c0.e(z15, null, null, null, null, ty1.b.f167072b, o0VarE, (i15 & 14) | 196608, 30);
        } else {
            z15 = z14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1(this, z15, i14);
        }
    }

    public final void C6(int i14, String str, boolean z14, boolean z15, e23.a<Unit> aVar, p3.m mVar, int i15, int i16) {
        boolean z16;
        int i17;
        boolean z17;
        o0 o0VarE = mVar.E(-1522480314);
        int i18 = i15 | (o0VarE.k(i14) ? 4 : 2);
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.B(str) ? 32 : 16;
        }
        int i19 = i18 | (o0VarE.h(z14) ? 256 : 128);
        int i24 = i16 & 8;
        if (i24 != 0) {
            i17 = i19 | 3072;
            z16 = z15;
        } else {
            z16 = z15;
            i17 = i19 | (o0VarE.h(z16) ? 2048 : 1024);
        }
        int i25 = i17 | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(this) ? 131072 : 65536);
        if (o0VarE.n(i25 & 1, (74899 & i25) != 74898)) {
            boolean z18 = i24 != 0 ? false : z16;
            p3.x1 x1Var = p3.n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(-1322888452, new n1(i14, z14, str, z18, aVar, this), o0VarE), o0VarE, 196608, 31);
            z17 = z18;
        } else {
            o0VarE.e();
            z17 = z16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gt1.b(this, i14, str, z14, z17, aVar, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:92:0x019f  */
    public final void E6(List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list, m52.i iVar, boolean z14, int i14, int i15, p3.m mVar, int i16) {
        String strK;
        String strK2;
        String strK3;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        o0 o0VarE = mVar.E(2019224693);
        int i17 = i16 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.k(iVar == null ? -1 : iVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.k(i15) ? 16384 : 8192) | (o0VarE.r(this) ? 131072 : 65536);
        int i18 = 1;
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            String strK4 = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it.next();
                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.f) next4).getName() != m52.i.SPRINT);
                com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = (com.garmin.android.apps.connectmobile.workouts.data.model.f) next4;
                if (fVar != null) {
                    og0.a aVar = og0.a.f131967a;
                    Double dF = fVar.getTotalTarget().getValue();
                    gg0.i iVarB = fVar.getTotalTarget().getUnit();
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    strK = og0.a.k(aVar, dF, iVarB, contextRequireContext);
                } else {
                    strK = null;
                }
            } else {
                strK = null;
            }
            if (list != null) {
                Iterator<T> it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.f) next3).getName() != m52.i.STANDARD);
                com.garmin.android.apps.connectmobile.workouts.data.model.f fVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.f) next3;
                if (fVar2 != null) {
                    og0.a aVar2 = og0.a.f131967a;
                    Double dF2 = fVar2.getTotalTarget().getValue();
                    gg0.i iVarB2 = fVar2.getTotalTarget().getUnit();
                    Context contextRequireContext2 = requireContext();
                    contextRequireContext2.getClass();
                    strK2 = og0.a.k(aVar2, dF2, iVarB2, contextRequireContext2);
                } else {
                    strK2 = null;
                }
            } else {
                strK2 = null;
            }
            if (list != null) {
                Iterator<T> it4 = list.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.f) next2).getName() != m52.i.HALF_IRON);
                com.garmin.android.apps.connectmobile.workouts.data.model.f fVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.f) next2;
                if (fVar3 != null) {
                    og0.a aVar3 = og0.a.f131967a;
                    Double dF3 = fVar3.getTotalTarget().getValue();
                    gg0.i iVarB3 = fVar3.getTotalTarget().getUnit();
                    Context contextRequireContext3 = requireContext();
                    contextRequireContext3.getClass();
                    strK3 = og0.a.k(aVar3, dF3, iVarB3, contextRequireContext3);
                } else {
                    strK3 = null;
                }
            } else {
                strK3 = null;
            }
            if (list != null) {
                Iterator<T> it5 = list.iterator();
                do {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.f) next).getName() != m52.i.FULL_IRON);
                com.garmin.android.apps.connectmobile.workouts.data.model.f fVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.f) next;
                if (fVar4 != null) {
                    og0.a aVar4 = og0.a.f131967a;
                    Double dF4 = fVar4.getTotalTarget().getValue();
                    gg0.i iVarB4 = fVar4.getTotalTarget().getUnit();
                    Context contextRequireContext4 = requireContext();
                    contextRequireContext4.getClass();
                    strK4 = og0.a.k(aVar4, dF4, iVarB4, contextRequireContext4);
                }
            }
            String str = strK4;
            Object[] objArr = new Object[0];
            boolean z15 = (i17 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new f1(iVar, i18);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f1(iVar, i18);
                    o0VarE.K(objQ);
                }
            }
            z02.b.a(false, null, null, null, false, z3.f.c(778737151, new da0.n(z14, i14, i15, this, strK, (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0), strK2, strK3, str), o0VarE), o0VarE, 196608, 31);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(this, list, iVar, z14, i14, i15, i16, 17);
        }
    }

    public final AddTIEventViewModel F6() {
        return (AddTIEventViewModel) this.f46302c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46301b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddTriathlonEventTypeFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList parcelableArrayList;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("TRIATHLON_TYPE_DISTANCE", com.garmin.android.apps.connectmobile.workouts.data.model.f.class) : arguments.getParcelableArrayList("TRIATHLON_TYPE_DISTANCE");
        } else {
            parcelableArrayList = null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(-555035876, true, new t21.l(24, this, parcelableArrayList)));
        return composeView;
    }

    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        int i14 = F6().D2 ? R.string.set_goals_title : R.string.add_event;
        ry1.a aVar = this.f46301b;
        if (aVar != null) {
            String string = getString(i14);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46303d, viewLifecycleOwner);
    }

    @Override // ty1.h0
    public final boolean y6() {
        if (F6().D2) {
            return true;
        }
        return super.y6();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/v$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "TRIATHLON_TYPE_DISTANCE", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
