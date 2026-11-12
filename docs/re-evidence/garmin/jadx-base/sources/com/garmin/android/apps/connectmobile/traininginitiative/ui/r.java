package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
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
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import h5.e0;
import i3.mh;
import java.util.List;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import ty1.x0;
import u1.a2;
import u1.d2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/r;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lgg0/f;", "selectedEventType", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46219c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46220a = new w1(s0.f105811a.b(AddTIEventViewModel.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f46221b = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/r$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            r rVar = r.this;
            rVar.f46221b.f(false);
            rVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f46223a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46223a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46224a = aVar;
            this.f46225b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46224a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46225b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46226a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46226a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46226a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(-2000701856, true, new x0(this, 0)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ht.a.f85464a.getClass();
        Integer numValueOf = null;
        ht.a.a(null, "EnterCreateEventFlow");
        zf0.a aVarD = ((AddTIEventViewModel) this.f46220a.getValue()).o5().d();
        int iIntValue = R.string.add_event;
        if (aVarD != null) {
            numValueOf = Integer.valueOf(aVarD == zf0.a.CREATE_EVENT ? R.string.add_event : R.string.atp_lbl_find_race_event);
        }
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        }
        mVarRequireActivity.setTitle(mVarRequireActivity.getString(iIntValue));
        b.u onBackPressedDispatcher = mVarRequireActivity.getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46221b, viewLifecycleOwner);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(AddTIEventViewModel addTIEventViewModel, p3.m mVar, int i14) {
        String strP;
        o0 o0VarE = mVar.E(-1397021072);
        int i15 = 2;
        int i16 = (o0VarE.r(addTIEventViewModel) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            p1 p1VarG = f0.G(addTIEventViewModel.D5(), o0VarE);
            if (addTIEventViewModel.o5().d() == zf0.a.FIND_EVENT_W_TYPE_SELECTION) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -421372944, R.string.event_type_search, o0VarE, false);
            } else {
                o0VarE.C(-421299660);
                String strD = addTIEventViewModel.x5().d();
                if (strD == null) {
                    strD = "";
                }
                strP = gl1.y.P(R.string.select_event_activity_type, new Object[]{strD}, o0VarE);
                o0VarE.g0(false);
            }
            gg0.f.f77128d.getClass();
            List listK = p13.x.k(gg0.f.f77130f, gg0.f.f77131g, gg0.f.f77132h, gg0.f.f77133i, gg0.f.f77134j, gg0.f.f77135k, gg0.f.f77136l, gg0.f.f77137m, gg0.f.f77138n, gg0.f.f77139o, gg0.f.f77140p, gg0.f.f77142r, gg0.f.f77143t, gg0.f.f77144v);
            gg0.f fVar = (gg0.f) p1VarG.getF182175a();
            boolean zR = o0VarE.r(addTIEventViewModel);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new mz1.d(addTIEventViewModel, i15);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new mz1.d(addTIEventViewModel, i15);
                    o0VarE.K(objQ);
                }
            }
            v6(strP, listK, fVar, (e23.l) objQ, o0VarE, (i16 << 9) & 57344);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l(this, addTIEventViewModel, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    public final void v6(String str, List list, gg0.f fVar, e23.l lVar, p3.m mVar, int i14) {
        List<gg0.f> list2;
        o0 o0Var;
        str.getClass();
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-811819663);
        int i15 = (i14 & 6) == 0 ? (o0VarE.B(str) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            list2 = list;
            i15 |= o0VarE.r(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(fVar == null ? -1 : fVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            d2 d2VarA = a2.a(o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar, 1.0f), d2VarA, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            h4.r rVarF = x2.f(aVar, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            float f16 = eVar.f97921f;
            bVar2.getClass();
            int i17 = 16;
            mh.c(str, c2.l.B(rVarF, f15, f14, f16, eVar.f97922g), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 130044);
            o0Var = o0VarE;
            o0Var.C(47795780);
            for (gg0.f fVar2 : list2) {
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = gl1.y.Q(o0Var, fVar2.f77148b);
                z3.e eVarC = z3.f.c(1684221232, new t21.l(22, fVar, fVar2), o0Var);
                boolean zK = ((i15 & 7168) == 2048) | o0Var.k(fVar2.ordinal());
                Object objQ = o0Var.q();
                if (zK) {
                    objQ = new tb0.d(i17, lVar, fVar2);
                    o0Var.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new tb0.d(i17, lVar, fVar2);
                        o0Var.K(objQ);
                    }
                }
                o0 o0Var2 = o0Var;
                p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ, o0Var2, 24576, 238);
                o0Var = o0Var2;
            }
            o0Var.g0(false);
            o0Var.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(this, str, list2, fVar, lVar, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
