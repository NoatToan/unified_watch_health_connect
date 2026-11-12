package a61;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La61/m;", "Le32/i;", "Lo71/e;", "La61/p;", "Lcom/garmin/android/apps/connectmobile/performance/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends e32.i<o71.e, p, com.garmin.android.apps.connectmobile.performance.a> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f1627q = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w1 f1628p = new w1(s0.f105811a.b(o71.i.class), new b(this), new d(this), new c(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f1629a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f1629a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f1629a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f1629a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f1630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f1630a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f1630a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f1631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f1632b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f1631a = aVar;
            this.f1632b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f1631a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f1632b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f1633a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f1633a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f1633a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // e32.a
    public final e32.p K6(View view2, e32.l lVar) {
        o71.i iVar = (o71.i) this.f1628p.getValue();
        j23.i iVarA = j23.s.a(V6(), T6());
        o71.g.k kVar = o71.g.f130199e;
        int i14 = this.f62794m;
        kVar.getClass();
        o71.g gVarA = o71.g.k.a(i14);
        if (gVarA != null) {
            return new p(this, view2, iVar, iVarA, gVarA);
        }
        vb.h.s("Required value was null.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e32.a
    public final boolean S6() {
        w6();
        ((p) J6()).f1651i.j(null);
        return true;
    }

    @Override // e32.i
    public final int U6() {
        return -1;
    }

    @Override // e32.i
    public final f32.m X6() {
        w1 w1Var = this.f1628p;
        w9.a aVarA = v1.a((o71.i) w1Var.getValue());
        o71.g.k kVar = o71.g.f130199e;
        int i14 = this.f62794m;
        kVar.getClass();
        o71.g gVarA = o71.g.k.a(i14);
        if (gVarA != null) {
            return new f32.m(new f32.j(aVarA, new x((o71.i) w1Var.getValue(), gVarA.f130209b), null, 4, null));
        }
        kg.f.n(am.j.h(this.f62794m, "Unexpected pager adapter interval: "));
        return null;
    }

    @Override // e32.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((o71.i) this.f1628p.getValue()).f130240b.f(this, new a(new a03.f(this, 3)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm_strength_training_performance_summary_container_fragment);
    }
}
