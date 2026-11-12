package com.garmin.android.apps.connectmobile.ecg.presentation.stats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.UploadConsentActivity;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import fw.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import pf0.i;
import pf0.y;
import pf0.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/EcgCompleteSetupFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgCompleteSetupFragment extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34851d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f34852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ComposeView f34853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f34854c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34855a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34855a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34856a;

        public c(l lVar) {
            lVar.getClass();
            this.f34856a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f34856a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34856a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f34857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f34857a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34857a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f34859b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f34858a = aVar;
            this.f34859b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34858a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34859b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f34860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f34860a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f34860a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public EcgCompleteSetupFragment() {
        super(R.layout.ecg_complete_setup);
        this.f34852a = new w1(s0.f105811a.b(y.class), new d(this), new f(this), new e(null, this));
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 16));
        cVarRegisterForActivityResult.getClass();
        this.f34854c = cVarRegisterForActivityResult;
    }

    public static void z6(EcgCompleteSetupFragment ecgCompleteSetupFragment, int i14, e23.a aVar) {
        ComposeView composeView = ecgCompleteSetupFragment.f34853b;
        if (composeView == null) {
            s.m("noDataStateView");
            throw null;
        }
        composeView.setContent(new z3.e(939386740, true, new i(R.string.lbl_no_ecg_recordings_available, i14, R.string.lbl_complete_setup, 0, aVar)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        v6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.ecg_list_empty);
        viewFindViewById.getClass();
        this.f34853b = (ComposeView) viewFindViewById;
    }

    public final void u6() {
        a2 a2Var = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] check MFA");
        ((y) this.f34852a.getValue()).y4().f(getViewLifecycleOwner(), new c(new pf0.h(this, 2)));
    }

    public final void v6() {
        y yVar = (y) this.f34852a.getValue();
        y0 y0Var = new y0();
        w9.a aVarA = v1.a(yVar);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new z(y0Var, yVar, null), 2);
        y0Var.f(getViewLifecycleOwner(), new c(new pf0.h(this, 1)));
    }

    public final void w6() {
        ((y) this.f34852a.getValue()).z4().f(getViewLifecycleOwner(), new c(new pf0.h(this, 0)));
    }

    public final void y6() {
        this.f34854c.a(new Intent(requireContext(), (Class<?>) UploadConsentActivity.class), null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/EcgCompleteSetupFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
