package com.garmin.android.apps.connectmobile.training.fbtap.workouts;

import am.a2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/workouts/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0878a f45566c = new C0878a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f45567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f45568b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f45569a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45569a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45570a = aVar;
            this.f45571b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45570a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45571b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45572a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f45572a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45572a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.fbt_activity_view);
        this.f45567a = j0.f134944a;
        this.f45568b = new w1(s0.f105811a.b(gw1.b.class), new b(this), new d(this), new c(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Object objD = a2.d(l2.a.b().c(this), "EXTRA_ITEMS");
        if (objD == null) {
            objD = j0.f134944a;
        }
        this.f45567a = objD;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        Context context = composeView.getContext();
        context.getClass();
        composeView.setContent(new e(-717284482, true, new g80.e(8, this, new pi0.e(context))));
    }

    public final gw1.b u6() {
        return (gw1.b) this.f45568b.getValue();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.fbtap.workouts.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/workouts/a$a;", "", "<init>", "()V", "", "EXTRA_ITEMS", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0878a {
        public /* synthetic */ C0878a(j jVar) {
            this();
        }

        private C0878a() {
        }
    }
}
