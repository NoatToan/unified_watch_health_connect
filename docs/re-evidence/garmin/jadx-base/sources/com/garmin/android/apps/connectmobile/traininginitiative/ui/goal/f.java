package com.garmin.android.apps.connectmobile.traininginitiative.ui.goal;

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
import b.s;
import b.u;
import fg0.j;
import fp0.l;
import fz1.k;
import fz1.q;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.o0;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46045f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46046a = new w1(s0.f105811a.b(k.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f46047b = q2.a(new p(null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f46048c = q2.a(new ArrayList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f46049d = q2.a(new ArrayList());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f46050e = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/goal/f$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            f fVar = f.this;
            fVar.f46050e.f(false);
            if (fVar.v6().f74013l) {
                fVar.v6().F4(m52.c.RUNNING, ng0.a.LEG_SCREEN_VIEW);
            } else {
                fVar.requireActivity().onBackPressed();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46052a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f46052a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46052a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46053a = aVar;
            this.f46054b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46053a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46054b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46055a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46055a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        w6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(1056246137, true, new l(this, 1)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        w6();
        super.onViewCreated(view2, bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46050e, viewLifecycleOwner);
    }

    public final void u6(boolean z14, boolean z15, int i14, int i15, m mVar, int i16) {
        o0 o0VarE = mVar.E(-1099634496);
        int i17 = i16 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(1203769418, new q(this, z14, z15, i14, i15), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(this, z14, z15, i14, i15, i16);
        }
    }

    public final k v6() {
        return (k) this.f46046a.getValue();
    }

    public final void w6() {
        p2 p2Var;
        Object value;
        j eventCustomization;
        p2 p2Var2;
        Object value2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        p2 p2Var3;
        Object value3;
        fg0.d completionTarget;
        j eventCustomization2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH2;
        do {
            p2Var = this.f46048c;
            value = p2Var.getValue();
            eventCustomization = v6().x4().getEventCustomization();
        } while (!p2Var.b(value, (eventCustomization == null || (listH2 = eventCustomization.h()) == null) ? new ArrayList() : new ArrayList(listH2)));
        do {
            p2Var2 = this.f46049d;
            value2 = p2Var2.getValue();
            listH = v6().x4().h();
        } while (!p2Var2.b(value2, listH != null ? new ArrayList(listH) : new ArrayList()));
        do {
            p2Var3 = this.f46047b;
            value3 = p2Var3.getValue();
            completionTarget = v6().x4().getCompletionTarget();
            eventCustomization2 = v6().x4().getEventCustomization();
        } while (!p2Var3.b(value3, new p(completionTarget, eventCustomization2 != null ? eventCustomization2.getCustomGoal() : null)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
