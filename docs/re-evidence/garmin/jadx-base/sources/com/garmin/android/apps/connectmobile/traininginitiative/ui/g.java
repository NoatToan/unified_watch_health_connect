package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import h5.e0;
import i3.mh;
import kotlin.t1;
import l72.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.o0;
import p3.p0;
import p3.p2;
import s5.x0;
import ty1.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45967d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ry1.a f45968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f45969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f45970c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/g$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            g gVar = g.this;
            gVar.f45970c.f(false);
            gVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45972a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f45972a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45972a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45974b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45973a = aVar;
            this.f45974b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45973a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45974b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45975a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f45975a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45975a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public g() {
        super(R.layout.ti_add_a_course_genesis_fragment);
        this.f45969b = new w1(s0.f105811a.b(AddTIEventViewModel.class), new c(this), new e(this), new d(null, this));
        this.f45970c = new b();
    }

    public static float v6(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        float f75992b = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f75992b > 1.0f && f75992b <= 1.5f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            return j92.b.f97901d.f97906e;
        }
        if (f75992b > 1.5f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            return j92.b.f97901d.f97907f;
        }
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        return j92.b.f97901d.f97906e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f45968a = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddACourseGenesisFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f45968a;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f45970c, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.add_a_course);
        viewFindViewById.getClass();
        ((ComposeView) viewFindViewById).setContent(new z3.e(208813979, true, new d0(this, 0, (byte) 0)));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x02f8  */
    public final void u6(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1030959287);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(this) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarD, eVar.f97920e, f14);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(gVar, aVar2, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            c2.j.k kVar = c2.j.f22694d;
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            h4.g.a aVar4 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(aVar, aVar4);
            bVar.getClass();
            float f15 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarQ = x2.q(c2.l.C(rVarB, 0.0f, f15, 0.0f, eVar.f97920e, 5), v6(o0VarE));
            u4.d.b bVar3 = u4.d.f168373k;
            g02.i.a(rVarQ, n5.e.b(R.drawable.courses, o0VarE, 6), am.j.d(o0VarE), d92.b.a(o0VarE).e().e(), v6(o0VarE), 0.0f, null, o0VarE, 0, 224);
            String string = getString(R.string.add_course_header_title);
            string.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97932i;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            bVar.getClass();
            h4.r rVarF = x2.f(c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 1.0f);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            mh.c(string, rVarF, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            String string2 = getString(R.string.event_add_course_description);
            string2.getClass();
            fVar2.getClass();
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            bVar.getClass();
            mh.c(string2, x2.f(c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 1.0f), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            final int i17 = 1;
            o0VarE.g0(true);
            final int i18 = 0;
            h4.r rVarA = b0Var.a(b0Var.b(aVar, aVar4), 1.0f, false);
            c2.z zVarA3 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA3, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            f0 f0Var = f0.f110999a;
            String string3 = getString(R.string.add_a_course);
            string3.getClass();
            bVar.getClass();
            h4.r rVarF2 = x2.f(c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 1.0f);
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zR) {
                objQ = new e23.a(this) { // from class: ty1.e0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.g f167096b;

                    {
                        this.f167096b = this;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i18;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.g gVar2 = this.f167096b;
                        switch (i19) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.g.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d;
                                AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) gVar2.f45969b.getValue();
                                androidx.fragment.app.m mVarRequireActivity = gVar2.requireActivity();
                                mVarRequireActivity.getClass();
                                addTIEventViewModel.u6(mVarRequireActivity);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.g.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d;
                                ((AddTIEventViewModel) gVar2.f45969b.getValue()).v6();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a(this) { // from class: ty1.e0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.g f167096b;

                        {
                            this.f167096b = this;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i18;
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.g gVar2 = this.f167096b;
                            switch (i19) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.g.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d;
                                    AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) gVar2.f45969b.getValue();
                                    androidx.fragment.app.m mVarRequireActivity = gVar2.requireActivity();
                                    mVarRequireActivity.getClass();
                                    addTIEventViewModel.u6(mVarRequireActivity);
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.g.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d;
                                    ((AddTIEventViewModel) gVar2.f45969b.getValue()).v6();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            f0Var.d(3072, 1, (e23.a) objQ, rVarF2, string3, o0VarE, null, true);
            o0VarE = o0VarE;
            String string4 = getString(R.string.not_now_lbl);
            string4.getClass();
            bVar.getClass();
            h4.r rVarF3 = x2.f(c2.l.C(aVar, 0.0f, eVar.f97916a, 0.0f, 0.0f, 13), 1.0f);
            boolean zR2 = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new e23.a(this) { // from class: ty1.e0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.g f167096b;

                    {
                        this.f167096b = this;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i17;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.g gVar2 = this.f167096b;
                        switch (i19) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.g.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d;
                                AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) gVar2.f45969b.getValue();
                                androidx.fragment.app.m mVarRequireActivity = gVar2.requireActivity();
                                mVarRequireActivity.getClass();
                                addTIEventViewModel.u6(mVarRequireActivity);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.g.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d;
                                ((AddTIEventViewModel) gVar2.f45969b.getValue()).v6();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.a(this) { // from class: ty1.e0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.g f167096b;

                        {
                            this.f167096b = this;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i17;
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.g gVar2 = this.f167096b;
                            switch (i19) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.g.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d;
                                    AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) gVar2.f45969b.getValue();
                                    androidx.fragment.app.m mVarRequireActivity = gVar2.requireActivity();
                                    mVarRequireActivity.getClass();
                                    addTIEventViewModel.u6(mVarRequireActivity);
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.g.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d;
                                    ((AddTIEventViewModel) gVar2.f45969b.getValue()).v6();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                }
            }
            f0Var.k(string4, rVarF3, true, (e23.a) objQ2, o0VarE, 384, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d0(this, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
