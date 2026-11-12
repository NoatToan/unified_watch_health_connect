package com.garmin.android.apps.connectmobile.settings.lte;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionManagerActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.z1;
import e23.l;
import fw.p;
import lc.u0;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import w61.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0804a f43463f = new C0804a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintLayout f43464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f43465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f43466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f43467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f43468e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43469a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43469a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43470a;

        public c(l lVar) {
            lVar.getClass();
            this.f43470a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43470a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43470a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43471a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43471a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43471a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43472a = aVar;
            this.f43473b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43472a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43473b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43474a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f43474a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43474a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.lte_subscription_manager_fragment);
        this.f43467d = new w1(s0.f105811a.b(qi1.f.class), new d(this), new f(this), new e(null, this));
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 22));
        cVarRegisterForActivityResult.getClass();
        this.f43468e = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.constraint);
        viewFindViewById.getClass();
        this.f43464a = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.plan_lbl);
        viewFindViewById2.getClass();
        this.f43465b = (GCMComplexOneLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.safety_features_btn);
        viewFindViewById3.getClass();
        this.f43466c = (GCMComplexTwoLineButton) viewFindViewById3;
        ConstraintLayout constraintLayout = this.f43464a;
        if (constraintLayout == null) {
            s.m("constraint");
            throw null;
        }
        constraintLayout.setVisibility(8);
        w1 w1Var = this.f43467d;
        final int i14 = 0;
        ((qi1.f) w1Var.getValue()).f144863e.f(getViewLifecycleOwner(), new c(new l(this) { // from class: qi1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.lte.a f144853b;

            {
                this.f144853b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.lte.a aVar = this.f144853b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.lte.a.C0804a c0804a = com.garmin.android.apps.connectmobile.settings.lte.a.f43463f;
                        int i16 = com.garmin.android.apps.connectmobile.settings.lte.a.b.f43469a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            androidx.fragment.app.m activity = aVar.getActivity();
                            z1 z1Var = activity instanceof z1 ? (z1) activity : null;
                            if (z1Var != null) {
                                z1Var.initActionBar(aVar.getString(R.string.device_settings_lte), 2);
                            }
                            t tVar = (t) g3Var.f35301b;
                            g22.e.f(aVar);
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            LTESubscriptionManagerActivity lTESubscriptionManagerActivity = activity2 instanceof LTESubscriptionManagerActivity ? (LTESubscriptionManagerActivity) activity2 : null;
                            boolean z14 = lTESubscriptionManagerActivity != null ? lTESubscriptionManagerActivity.f43461d : false;
                            boolean z15 = lTESubscriptionManagerActivity != null ? lTESubscriptionManagerActivity.f43459b : false;
                            if (z14 || z15) {
                                if (tVar != null && lTESubscriptionManagerActivity != null) {
                                    lTESubscriptionManagerActivity.f43460c = tVar.f144934c;
                                }
                                if (lTESubscriptionManagerActivity != null) {
                                    lTESubscriptionManagerActivity.onBackPressed();
                                }
                            } else {
                                ConstraintLayout constraintLayout2 = aVar.f43464a;
                                if (constraintLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("constraint");
                                    throw null;
                                }
                                constraintLayout2.setVisibility(0);
                                String string = aVar.getString(R.string.device_settings_lte);
                                string.getClass();
                                g22.e.g(aVar, string);
                                GCMComplexOneLineButton gCMComplexOneLineButton = aVar.f43465b;
                                if (gCMComplexOneLineButton == null) {
                                    p005kotlin.jvm.internal.s.m("planLabel");
                                    throw null;
                                }
                                gCMComplexOneLineButton.setButtonLeftLabel(tVar != null ? tVar.f144932a : null);
                                String str = tVar != null ? tVar.f144933b : null;
                                GCMComplexTwoLineButton gCMComplexTwoLineButton = aVar.f43466c;
                                if (gCMComplexTwoLineButton == null) {
                                    p005kotlin.jvm.internal.s.m("safetyFeaturesBtn");
                                    throw null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                gCMComplexTwoLineButton.setButtonBottomLeftLabel(str);
                            }
                        } else if (i16 == 2) {
                            g22.e.l(aVar);
                        } else {
                            if (i16 != 3) {
                                u0.r();
                                return null;
                            }
                            String string2 = aVar.getString(R.string.device_settings_lte);
                            string2.getClass();
                            g22.e.g(aVar, string2);
                            g22.e.f(aVar);
                            g22.e.c(aVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.settings.lte.a.C0804a c0804a2 = com.garmin.android.apps.connectmobile.settings.lte.a.f43463f;
                        ((Unit) obj).getClass();
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        LTESubscriptionManagerActivity lTESubscriptionManagerActivity2 = activity3 instanceof LTESubscriptionManagerActivity ? (LTESubscriptionManagerActivity) activity3 : null;
                        if (lTESubscriptionManagerActivity2 != null ? lTESubscriptionManagerActivity2.f43459b : false) {
                            aVar.requireActivity().onBackPressed();
                        } else {
                            f.c<Intent> cVar = aVar.f43468e;
                            SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                            Context contextRequireContext = aVar.requireContext();
                            contextRequireContext.getClass();
                            hl.a.c cVar2 = hl.a.c.f84256b;
                            aVar2.getClass();
                            cVar.a(SafetyFeatureSetupWizardActivity.a.a(contextRequireContext, cVar2), null);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        ((qi1.f) w1Var.getValue()).f144865g.f(getViewLifecycleOwner(), new g(new l(this) { // from class: qi1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.lte.a f144853b;

            {
                this.f144853b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.lte.a aVar = this.f144853b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.lte.a.C0804a c0804a = com.garmin.android.apps.connectmobile.settings.lte.a.f43463f;
                        int i17 = com.garmin.android.apps.connectmobile.settings.lte.a.b.f43469a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            androidx.fragment.app.m activity = aVar.getActivity();
                            z1 z1Var = activity instanceof z1 ? (z1) activity : null;
                            if (z1Var != null) {
                                z1Var.initActionBar(aVar.getString(R.string.device_settings_lte), 2);
                            }
                            t tVar = (t) g3Var.f35301b;
                            g22.e.f(aVar);
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            LTESubscriptionManagerActivity lTESubscriptionManagerActivity = activity2 instanceof LTESubscriptionManagerActivity ? (LTESubscriptionManagerActivity) activity2 : null;
                            boolean z14 = lTESubscriptionManagerActivity != null ? lTESubscriptionManagerActivity.f43461d : false;
                            boolean z15 = lTESubscriptionManagerActivity != null ? lTESubscriptionManagerActivity.f43459b : false;
                            if (z14 || z15) {
                                if (tVar != null && lTESubscriptionManagerActivity != null) {
                                    lTESubscriptionManagerActivity.f43460c = tVar.f144934c;
                                }
                                if (lTESubscriptionManagerActivity != null) {
                                    lTESubscriptionManagerActivity.onBackPressed();
                                }
                            } else {
                                ConstraintLayout constraintLayout2 = aVar.f43464a;
                                if (constraintLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("constraint");
                                    throw null;
                                }
                                constraintLayout2.setVisibility(0);
                                String string = aVar.getString(R.string.device_settings_lte);
                                string.getClass();
                                g22.e.g(aVar, string);
                                GCMComplexOneLineButton gCMComplexOneLineButton = aVar.f43465b;
                                if (gCMComplexOneLineButton == null) {
                                    p005kotlin.jvm.internal.s.m("planLabel");
                                    throw null;
                                }
                                gCMComplexOneLineButton.setButtonLeftLabel(tVar != null ? tVar.f144932a : null);
                                String str = tVar != null ? tVar.f144933b : null;
                                GCMComplexTwoLineButton gCMComplexTwoLineButton = aVar.f43466c;
                                if (gCMComplexTwoLineButton == null) {
                                    p005kotlin.jvm.internal.s.m("safetyFeaturesBtn");
                                    throw null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                gCMComplexTwoLineButton.setButtonBottomLeftLabel(str);
                            }
                        } else if (i17 == 2) {
                            g22.e.l(aVar);
                        } else {
                            if (i17 != 3) {
                                u0.r();
                                return null;
                            }
                            String string2 = aVar.getString(R.string.device_settings_lte);
                            string2.getClass();
                            g22.e.g(aVar, string2);
                            g22.e.f(aVar);
                            g22.e.c(aVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.settings.lte.a.C0804a c0804a2 = com.garmin.android.apps.connectmobile.settings.lte.a.f43463f;
                        ((Unit) obj).getClass();
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        LTESubscriptionManagerActivity lTESubscriptionManagerActivity2 = activity3 instanceof LTESubscriptionManagerActivity ? (LTESubscriptionManagerActivity) activity3 : null;
                        if (lTESubscriptionManagerActivity2 != null ? lTESubscriptionManagerActivity2.f43459b : false) {
                            aVar.requireActivity().onBackPressed();
                        } else {
                            f.c<Intent> cVar = aVar.f43468e;
                            SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                            Context contextRequireContext = aVar.requireContext();
                            contextRequireContext.getClass();
                            hl.a.c cVar2 = hl.a.c.f84256b;
                            aVar2.getClass();
                            cVar.a(SafetyFeatureSetupWizardActivity.a.a(contextRequireContext, cVar2), null);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f43466c;
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setOnClickListener(new oq.a(this, 10));
        } else {
            s.m("safetyFeaturesBtn");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.lte.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0804a {
        public /* synthetic */ C0804a(j jVar) {
            this();
        }

        private C0804a() {
        }
    }
}
