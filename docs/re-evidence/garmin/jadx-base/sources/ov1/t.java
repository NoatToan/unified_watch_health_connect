package ov1;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import cw1.x0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p1;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lov1/t;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lmv1/b;", "preferenceState", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f134225b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f134226a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134227a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f134227a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f134227a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f134228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f134229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f134228a = aVar;
            this.f134229b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f134228a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f134229b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f134230a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f134230a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f134230a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public t() {
        super(R.layout.fbt_activity_view);
        this.f134226a = new w1(s0.f105811a.b(pv1.b.class), new b(this), new d(this), new c(null, this));
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
        tu1.a.p(view2, R.id.composable_container, new z3.e(210455953, true, new s(this)));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(p3.m mVar, int i14) {
        double D;
        m52.i iVarK;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list2;
        fg0.k kVar;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        o0 o0VarE = mVar.E(-1366230829);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        boolean zN = false;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(((pv1.b) this.f134226a.getValue()).S0, o0VarE);
            mv1.b bVar = (mv1.b) p1VarC.getF182175a();
            if (bVar == null || (kVar = bVar.f121179h) == null || (listH = kVar.h()) == null) {
                D = 0.0d;
            } else {
                og0.a.f131967a.getClass();
                D = og0.a.D(listH);
            }
            mv1.b bVar2 = (mv1.b) p1VarC.getF182175a();
            if (bVar2 != null && (list2 = bVar2.f121180i) != null) {
                zN = tu1.a.n(list2, D);
            }
            if (zN) {
                iVarK = m52.i.HALF_IRON;
            } else {
                mv1.b bVar3 = (mv1.b) p1VarC.getF182175a();
                iVarK = (bVar3 == null || (list = bVar3.f121180i) == null) ? null : tu1.a.k(list, D);
            }
            mv1.b bVar4 = (mv1.b) p1VarC.getF182175a();
            hv1.i iVar = bVar4 != null ? bVar4.f121177f : null;
            if (iVarK == null) {
                iVarK = m52.i.CUSTOM;
            }
            m52.i iVar2 = iVarK;
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new nw0.f(this, 23);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new nw0.f(this, 23);
                    o0VarE.K(objQ);
                }
            }
            x0.a(null, iVar, iVar2, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s(this, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov1/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
