package ov1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lov1/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f134184c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f134185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f134186b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ov1/l$b", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = l.f134184c;
            l lVar = l.this;
            lVar.u6().i5("FBTEditStrengthWorkoutTypeFragment", new n82.i(lVar, 28));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f134188a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f134188a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f134189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f134190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f134189a = aVar;
            this.f134190b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f134189a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f134190b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134191a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f134191a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f134191a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public l() {
        super(R.layout.fbt_activity_view);
        this.f134185a = new w1(s0.f105811a.b(pv1.b.class), new c(this), new e(this), new d(null, this));
        this.f134186b = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        List<tw1.h> list;
        mv1.d dVar;
        List<tw1.h> list2;
        tw1.h hVar;
        List<tw1.h> list3;
        List<tw1.h> list4;
        tw1.h hVar2;
        List<tw1.h> list5;
        List<tw1.h> list6;
        tw1.h hVar3;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        requireActivity().setTitle(R.string.strength_workouts);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f134186b, viewLifecycleOwner);
        androidx.fragment.app.m activity = getActivity();
        String str = null;
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.updateActionBarNavigation(2);
        }
        vt1.h.a aVar = vt1.h.f180113e;
        pv1.b bVarU6 = u6();
        p2 p2Var = bVarU6.V0;
        p2 p2Var2 = bVarU6.R0;
        p2 p2Var3 = bVarU6.N0;
        mv1.a aVar2 = (mv1.a) p2Var3.getValue();
        if (aVar2 == null || (list5 = aVar2.f121170h) == null || !(!list5.isEmpty())) {
            mv1.b bVar = (mv1.b) p2Var2.getValue();
            if (bVar == null || (list3 = bVar.f121178g) == null || !(!list3.isEmpty())) {
                mv1.d dVar2 = (mv1.d) p2Var.getValue();
                if (dVar2 != null && (list = dVar2.f121183b) != null && (!list.isEmpty()) && (dVar = (mv1.d) p2Var.getValue()) != null && (list2 = dVar.f121183b) != null && (hVar = (tw1.h) h0.d0(list2)) != null) {
                    str = hVar.f166715a;
                }
            } else {
                mv1.b bVar2 = (mv1.b) p2Var2.getValue();
                if (bVar2 != null && (list4 = bVar2.f121178g) != null && (hVar2 = (tw1.h) h0.d0(list4)) != null) {
                    str = hVar2.f166715a;
                }
            }
        } else {
            mv1.a aVar3 = (mv1.a) p2Var3.getValue();
            if (aVar3 != null && (list6 = aVar3.f121170h) != null && (hVar3 = (tw1.h) h0.d0(list6)) != null) {
                str = hVar3.f166715a;
            }
        }
        aVar.getClass();
        vt1.h hVarA = vt1.h.a.a(str);
        vt1.o oVar = u6().Y;
        if (oVar == null) {
            oVar = vt1.o.f180175f;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        tu1.a.p(view2, R.id.composable_container, new z3.e(-577223681, true, new mw1.b(this, 21, hVarA, oVar.e(contextRequireContext))));
    }

    public final pv1.b u6() {
        return (pv1.b) this.f134185a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
