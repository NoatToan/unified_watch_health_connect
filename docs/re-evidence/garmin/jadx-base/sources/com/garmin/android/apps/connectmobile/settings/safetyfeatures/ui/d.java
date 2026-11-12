package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui;

import a11.u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.StyledInlineButtonFieldViewDark;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import ei0.q0;
import fw.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l20.r;
import lc.u0;
import o13.t;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import pj1.d0;
import tn.k;
import uf2.p0;
import uj1.o;
import uj1.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {
    public static final a X = new a(null);
    public final w1 A;
    public final w1 B;
    public final t C;
    public final c D;
    public final q E;
    public final q F;
    public final w61.g<g3<yj1.i>> I;
    public final f.c<Intent> P;
    public final f.c<Intent> T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f43742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f43743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f43744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f43746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public StyledInlineButtonFieldViewDark f43752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public StyledInlineButtonFieldViewDark f43756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f43757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f43758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public yj1.h f43759r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f43760t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f43761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f43762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f43763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f43764y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f43765z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43766a;

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
            f43766a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/d$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() throws Throwable {
            m activity;
            d dVar = d.this;
            if (!dVar.f43765z) {
                dVar.Y6();
                return;
            }
            int iM = dVar.getParentFragmentManager().M() - 1;
            if (iM == 0 && p005kotlin.jvm.internal.s.g(dVar.getParentFragmentManager().L(iM).getName(), "MyInformationFragment") && (activity = dVar.getActivity()) != null) {
                activity.finish();
            }
            dVar.getParentFragmentManager().Z();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0814d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43768a;

        public C0814d(l lVar) {
            lVar.getClass();
            this.f43768a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f43768a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43768a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f43769a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43769a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43771b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43770a = aVar;
            this.f43771b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43770a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43771b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f43772a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43772a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43773a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f43773a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43773a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43774a = aVar;
            this.f43775b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43774a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43775b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43776a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f43776a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43776a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [uj1.q] */
    /* JADX WARN: Type inference failed for: r0v8, types: [uj1.q] */
    public d() {
        super(R.layout.fragment_my_information);
        this.f43760t = true;
        this.f43764y = true;
        t0 t0Var = s0.f105811a;
        this.A = new w1(t0Var.b(pj1.s.class), new e(this), new g(this), new f(null, this));
        this.B = new w1(t0Var.b(pj1.m.class), new h(this), new j(this), new i(null, this));
        final int i14 = 0;
        this.C = o13.m.b(new o(this, 0));
        this.D = new c();
        this.E = new z0(this) { // from class: uj1.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171558b;

            {
                this.f171558b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                Context context;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171558b;
                g3 g3Var = (g3) obj;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        g3Var.getClass();
                        T t7 = g3Var.f35301b;
                        int i16 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.b.f43766a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            g22.e.f(dVar);
                            yj1.h hVar = (yj1.h) t7;
                            if (hVar != null) {
                                dVar.f43759r = hVar;
                                dVar.U6();
                            }
                        } else if (i16 == 2) {
                            g22.e.l(dVar);
                        } else if (i16 != 3) {
                            u0.r();
                        } else {
                            g22.e.f(dVar);
                            g22.e.c(dVar);
                            yj1.h hVar2 = (yj1.h) t7;
                            if (hVar2 != null) {
                                dVar.f43759r = hVar2;
                                dVar.U6();
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        g3Var.getClass();
                        int i17 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.b.f43766a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            g22.e.f(dVar);
                            break;
                        } else if (i17 == 2) {
                            g22.e.l(dVar);
                            break;
                        } else if (i17 != 3) {
                            u0.r();
                            break;
                        } else {
                            g22.e.f(dVar);
                            Fragment parentFragment = dVar.getParentFragment();
                            if (parentFragment != null && (context = parentFragment.getContext()) != null) {
                                q0.b(context);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.F = new z0(this) { // from class: uj1.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171558b;

            {
                this.f171558b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                Context context;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171558b;
                g3 g3Var = (g3) obj;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        g3Var.getClass();
                        T t7 = g3Var.f35301b;
                        int i17 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.b.f43766a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            g22.e.f(dVar);
                            yj1.h hVar = (yj1.h) t7;
                            if (hVar != null) {
                                dVar.f43759r = hVar;
                                dVar.U6();
                            }
                        } else if (i17 == 2) {
                            g22.e.l(dVar);
                        } else if (i17 != 3) {
                            u0.r();
                        } else {
                            g22.e.f(dVar);
                            g22.e.c(dVar);
                            yj1.h hVar2 = (yj1.h) t7;
                            if (hVar2 != null) {
                                dVar.f43759r = hVar2;
                                dVar.U6();
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        g3Var.getClass();
                        int i18 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.b.f43766a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            g22.e.f(dVar);
                            break;
                        } else if (i18 == 2) {
                            g22.e.l(dVar);
                            break;
                        } else if (i18 != 3) {
                            u0.r();
                            break;
                        } else {
                            g22.e.f(dVar);
                            Fragment parentFragment = dVar.getParentFragment();
                            if (parentFragment != null && (context = parentFragment.getContext()) != null) {
                                q0.b(context);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.I = new w61.g<>(new uj1.p(this, 13));
        final int i16 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: uj1.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171566b;

            {
                this.f171566b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                boolean zK;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171566b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        aVar.getClass();
                        dVar.v6();
                        boolean z14 = dVar.f43764y;
                        int i18 = pj1.m.f137942f;
                        if (z14) {
                            j22.b bVar = j22.b.f96736a;
                            j22.a[] aVarArr = {j22.a.f96719h};
                            bVar.getClass();
                            zK = j22.b.k(aVarArr);
                        } else {
                            j22.b bVar2 = j22.b.f96736a;
                            j22.a[] aVarArr2 = {j22.a.f96718g};
                            bVar2.getClass();
                            zK = j22.b.k(aVarArr2);
                        }
                        if (zK) {
                            a2 a2Var = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "MyInformationFragment", "[applicationDetails] location permission granted");
                            dVar.v6().y4(dVar.f43764y);
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        aVar.getClass();
                        a2 a2Var2 = a2.SAFETY_FEATURES;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "MyInformationFragment", "[locationSettings] returned from location settings");
                        if (!((mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null)).a("MyInformationFragment")) {
                            i2.a.b(a2Var2, "MyInformationFragment", "[locationSettings] location is disabled");
                        } else {
                            i2.a.b(a2Var2, "MyInformationFragment", "[locationSettings] location is enabled");
                            dVar.v6().y4(dVar.f43764y);
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.P = cVarRegisterForActivityResult;
        final int i17 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: uj1.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171566b;

            {
                this.f171566b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                boolean zK;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171566b;
                f.a aVar = (f.a) obj;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        aVar.getClass();
                        dVar.v6();
                        boolean z14 = dVar.f43764y;
                        int i19 = pj1.m.f137942f;
                        if (z14) {
                            j22.b bVar = j22.b.f96736a;
                            j22.a[] aVarArr = {j22.a.f96719h};
                            bVar.getClass();
                            zK = j22.b.k(aVarArr);
                        } else {
                            j22.b bVar2 = j22.b.f96736a;
                            j22.a[] aVarArr2 = {j22.a.f96718g};
                            bVar2.getClass();
                            zK = j22.b.k(aVarArr2);
                        }
                        if (zK) {
                            a2 a2Var = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "MyInformationFragment", "[applicationDetails] location permission granted");
                            dVar.v6().y4(dVar.f43764y);
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        aVar.getClass();
                        a2 a2Var2 = a2.SAFETY_FEATURES;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "MyInformationFragment", "[locationSettings] returned from location settings");
                        if (!((mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null)).a("MyInformationFragment")) {
                            i2.a.b(a2Var2, "MyInformationFragment", "[locationSettings] location is disabled");
                        } else {
                            i2.a.b(a2Var2, "MyInformationFragment", "[locationSettings] location is enabled");
                            dVar.v6().y4(dVar.f43764y);
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.T = cVarRegisterForActivityResult2;
    }

    public final void A6(boolean z14) {
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43755n;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
            throw null;
        }
        styledInlineTextFieldViewDark.setHasError(z14);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43755n;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
            throw null;
        }
        styledInlineTextFieldViewDark2.setShowsErrorIcon(g22.n.d(this.f43763x));
        u6();
    }

    public final void C6() {
        Map<Object, String> map = (Map) w6().f137910l.d();
        yj1.h hVar = this.f43759r;
        Object objC0 = null;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Object, String> entry : map.entrySet()) {
                if (p005kotlin.jvm.internal.s.g(entry.getValue(), qVar != null ? qVar.getCountryOfCitizenship() : null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            if (setKeySet != null) {
                objC0 = h0.c0(setKeySet);
            }
        }
        Object obj = objC0;
        if (map != null) {
            new r22.y1().a(getContext(), getString(R.string.lte_country_of_citizenship), map, obj, new uj1.s(this, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void E6() {
        Object objC0;
        Map<Object, String> map = (Map) w6().f137908j.d();
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Object, String> entry : map.entrySet()) {
                if (p005kotlin.jvm.internal.s.g(entry.getValue(), qVar != null ? qVar.getCountry() : null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            if (setKeySet != null) {
                objC0 = h0.c0(setKeySet);
            } else {
                objC0 = null;
            }
        } else {
            objC0 = null;
        }
        boolean z14 = true;
        if (map == null || new r22.y1().a(getContext(), getString(R.string.lbl_country_region), map, objC0, new uj1.s(this, 1)) == null) {
            a2 a2Var = a2.SAFETY_FEATURES;
            g3 g3Var = (g3) w6().f137906h.d();
            List list = g3Var != null ? (List) g3Var.f35301b : null;
            if (list != null && !list.isEmpty()) {
                z14 = false;
            }
            String strH = com.airbnb.lottie.animation.keyframe.a.h("MyInfo countries map is null, is supported countries null :: ", z14);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "MyInformationFragment", strH);
            w6().B4();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void F6() {
        c22.f fVar = c22.f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.f.d(fVar, contextRequireContext, getString(R.string.weather_location_permission_needed), getString(R.string.allow_access_to_phone_settings), new o13.p(getString(R.string.lbl_settings), new uj1.t(this, 1)), new o13.p(getString(R.string.lbl_cancel), new uj1.a(7)), null, false, 96).show();
    }

    public final void G6() {
        c22.f fVar = c22.f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.f.d(fVar, contextRequireContext, getString(R.string.location_not_available_alert_title), getString(R.string.location_problem_enter_address_manually_alert_message), new o13.p(getString(R.string.lbl_ok), new uj1.a(5)), null, null, false, 112).show();
    }

    public final void H6(String str, boolean z14, boolean z15) {
        c22.f fVar = c22.f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.f.d(fVar, contextRequireContext, getString(R.string.lte_exit_my_information), str, new o13.p(getString(R.string.lbl_exit), new u(this, z14, z15, 7)), new o13.p(getString(R.string.lbl_cancel), new uj1.a(4)), null, false, 96).show();
    }

    public final void I6(String str, String str2) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
        if (str != null) {
            aVar.setTitle(str);
        }
        if (str2 != null) {
            aVar.setMessage(str2);
        }
        aVar.setCancelable(false);
        aVar.setPositiveButton(R.string.lbl_ok, new ty1.o(12));
        aVar.setNegativeButton(R.string.lbl_cancel, new sa2.b(this, 8));
        aVar.create().show();
    }

    public final void J6() {
        String string;
        String addressLine1;
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        Boolean bool = hVar.f197547a;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
            string = k.g(getString(R.string.lte_address_line_1), Marker.ANY_MARKER);
        } else {
            string = getString(R.string.lte_address_line_1);
            string.getClass();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43747f;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("addressLineOne");
            throw null;
        }
        styledInlineTextFieldViewDark.setTitle(string);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43747f;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("addressLineOne");
            throw null;
        }
        c22.b bVar = c22.b.f23007a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        styledInlineTextFieldViewDark2.setContentDescription(c22.b.g(contextRequireContext, string));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43747f;
        if (styledInlineTextFieldViewDark3 == null) {
            p005kotlin.jvm.internal.s.m("addressLineOne");
            throw null;
        }
        if (qVar == null || (addressLine1 = qVar.getAddressLine1()) == null) {
            addressLine1 = "";
        }
        styledInlineTextFieldViewDark3.i(new h32.h.c(addressLine1, "", null, null, new p0(6), null, null, null, 1, false, null, new uj1.p(this, 1), 1772, null));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = this.f43747f;
        if (styledInlineTextFieldViewDark4 == null) {
            p005kotlin.jvm.internal.s.m("addressLineOne");
            throw null;
        }
        styledInlineTextFieldViewDark4.setShowsErrorIcon(false);
        yj1.h hVar2 = this.f43759r;
        if (hVar2 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar2.f197549c && p005kotlin.jvm.internal.s.g(hVar2.f197547a, bool2)) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = this.f43747f;
            if (styledInlineTextFieldViewDark5 == null) {
                p005kotlin.jvm.internal.s.m("addressLineOne");
                throw null;
            }
            String addressLine2 = qVar != null ? qVar.getAddressLine1() : null;
            styledInlineTextFieldViewDark5.setHasError(addressLine2 == null || addressLine2.length() == 0);
            u6();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = this.f43747f;
        if (styledInlineTextFieldViewDark6 != null) {
            styledInlineTextFieldViewDark6.invalidate();
        } else {
            p005kotlin.jvm.internal.s.m("addressLineOne");
            throw null;
        }
    }

    public final void K6() {
        String addressLine2;
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43748g;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("addressLineTwo");
            throw null;
        }
        styledInlineTextFieldViewDark.setTitle(getString(R.string.lte_address_line_2));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43748g;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("addressLineTwo");
            throw null;
        }
        if (qVar == null || (addressLine2 = qVar.getAddressLine2()) == null) {
            addressLine2 = "";
        }
        styledInlineTextFieldViewDark2.i(new h32.h.c(addressLine2, "", null, null, new p0(7), null, null, null, 1, false, null, new uj1.p(this, 3), 1772, null));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43748g;
        if (styledInlineTextFieldViewDark3 != null) {
            styledInlineTextFieldViewDark3.invalidate();
        } else {
            p005kotlin.jvm.internal.s.m("addressLineTwo");
            throw null;
        }
    }

    public final void M6() {
        String city;
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        String string = getString(R.string.lte_city);
        w6();
        String strG = k.g(string, d0.l(this.f43764y) ? Marker.ANY_MARKER : "");
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43749h;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("city");
            throw null;
        }
        styledInlineTextFieldViewDark.setTitle(strG);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43749h;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("city");
            throw null;
        }
        c22.b bVar = c22.b.f23007a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        styledInlineTextFieldViewDark2.setContentDescription(c22.b.g(contextRequireContext, strG));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43749h;
        if (styledInlineTextFieldViewDark3 == null) {
            p005kotlin.jvm.internal.s.m("city");
            throw null;
        }
        styledInlineTextFieldViewDark3.i(new h32.h.c((qVar == null || (city = qVar.getCity()) == null) ? "" : city, "", null, null, new p0(5), null, null, null, 1, false, null, new uj1.p(this, 0), 1772, null));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = this.f43749h;
        if (styledInlineTextFieldViewDark4 == null) {
            p005kotlin.jvm.internal.s.m("city");
            throw null;
        }
        boolean z14 = false;
        styledInlineTextFieldViewDark4.setShowsErrorIcon(false);
        yj1.h hVar2 = this.f43759r;
        if (hVar2 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar2.f197549c) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = this.f43749h;
            if (styledInlineTextFieldViewDark5 == null) {
                p005kotlin.jvm.internal.s.m("city");
                throw null;
            }
            String city2 = qVar != null ? qVar.getCity() : null;
            if (city2 == null || city2.length() == 0) {
                w6();
                if (d0.l(this.f43764y)) {
                    z14 = true;
                }
            }
            styledInlineTextFieldViewDark5.setHasError(z14);
            u6();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = this.f43749h;
        if (styledInlineTextFieldViewDark6 != null) {
            styledInlineTextFieldViewDark6.invalidate();
        } else {
            p005kotlin.jvm.internal.s.m("city");
            throw null;
        }
    }

    public final void S6() {
        String string;
        String country;
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        String strJ4 = (qVar == null || (country = qVar.getCountry()) == null) ? null : w6().J4(country);
        Map map = (Map) w6().f137908j.d();
        if (map != null) {
            String str = (String) map.get(strJ4 != null ? strJ4 : null);
            if (str != null) {
                strJ4 = str;
            }
        }
        StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark = this.f43752k;
        if (styledInlineButtonFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("country");
            throw null;
        }
        yj1.h hVar2 = this.f43759r;
        if (hVar2 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        Boolean bool = hVar2.f197547a;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
            string = k.g(getString(R.string.lbl_country_region), Marker.ANY_MARKER);
        } else {
            string = getString(R.string.lbl_country_region);
            string.getClass();
        }
        styledInlineButtonFieldViewDark.setTitle(string);
        c22.b bVar = c22.b.f23007a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        styledInlineButtonFieldViewDark.setContentDescription(c22.b.g(contextRequireContext, string));
        styledInlineButtonFieldViewDark.i(new h32.h.c(strJ4 == null ? "" : strJ4, null, null, null, null, null, new o(this, 1), null, 0, false, null, null, 4030, null));
        styledInlineButtonFieldViewDark.setShowsErrorIcon(false);
        yj1.h hVar3 = this.f43759r;
        if (hVar3 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar3.f197549c && p005kotlin.jvm.internal.s.g(hVar3.f197547a, bool2)) {
            styledInlineButtonFieldViewDark.setHasError(strJ4 == null || strJ4.length() == 0);
            u6();
        }
        styledInlineButtonFieldViewDark.invalidate();
    }

    public final void T6() {
        String string;
        String countryOfCitizenship;
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        String strJ4 = (qVar == null || (countryOfCitizenship = qVar.getCountryOfCitizenship()) == null) ? null : w6().J4(countryOfCitizenship);
        Map map = (Map) w6().f137910l.d();
        if (map != null) {
            String str = (String) map.get(strJ4 != null ? strJ4 : null);
            if (str != null) {
                strJ4 = str;
            }
        }
        StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark = this.f43756o;
        if (styledInlineButtonFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("countryOfCitizenship");
            throw null;
        }
        yj1.h hVar2 = this.f43759r;
        if (hVar2 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        Boolean bool = hVar2.f197547a;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
            string = k.g(getString(R.string.lte_country_of_citizenship), Marker.ANY_MARKER);
        } else {
            string = getString(R.string.lte_country_of_citizenship);
            string.getClass();
        }
        styledInlineButtonFieldViewDark.setTitle(string);
        c22.b bVar = c22.b.f23007a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        styledInlineButtonFieldViewDark.setContentDescription(c22.b.g(contextRequireContext, string));
        styledInlineButtonFieldViewDark.i(new h32.h.c(strJ4 == null ? "" : strJ4, null, null, null, null, null, new o(this, 2), null, 0, false, null, null, 4030, null));
        styledInlineButtonFieldViewDark.setShowsErrorIcon(false);
        yj1.h hVar3 = this.f43759r;
        if (hVar3 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar3.f197549c && p005kotlin.jvm.internal.s.g(hVar3.f197547a, bool2)) {
            styledInlineButtonFieldViewDark.setHasError(strJ4 == null || strJ4.length() == 0);
            u6();
        }
        styledInlineButtonFieldViewDark.invalidate();
    }

    public final void U6() {
        String fullName;
        String string;
        String string2;
        tj1.e eVar;
        r userContactsDTO;
        List<l20.c> listS;
        boolean z14;
        List<l20.c> listS2;
        List<l20.c> listJ;
        List<l20.c> listJ2;
        l20.c cVar;
        yj1.h hVar = this.f43759r;
        l20.q selfUserContactDTO = null;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        String strG = k.g(getString(R.string.lbl_name), Marker.ANY_MARKER);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43745d;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("nameTextView");
            throw null;
        }
        styledInlineTextFieldViewDark.setTitle(strG);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43745d;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("nameTextView");
            throw null;
        }
        c22.b bVar = c22.b.f23007a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        styledInlineTextFieldViewDark2.setContentDescription(c22.b.g(contextRequireContext, strG));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43745d;
        if (styledInlineTextFieldViewDark3 == null) {
            p005kotlin.jvm.internal.s.m("nameTextView");
            throw null;
        }
        if (qVar == null || (fullName = qVar.getFullName()) == null) {
            fullName = "";
        }
        styledInlineTextFieldViewDark3.i(new h32.h.c(fullName, "", null, null, null, null, null, null, 1, false, null, new uj1.p(this, 2), 1788, null));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = this.f43745d;
        if (styledInlineTextFieldViewDark4 == null) {
            p005kotlin.jvm.internal.s.m("nameTextView");
            throw null;
        }
        boolean z15 = false;
        styledInlineTextFieldViewDark4.setShowsErrorIcon(false);
        yj1.h hVar2 = this.f43759r;
        if (hVar2 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar2.f197549c) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = this.f43745d;
            if (styledInlineTextFieldViewDark5 == null) {
                p005kotlin.jvm.internal.s.m("nameTextView");
                throw null;
            }
            String fullName2 = qVar != null ? qVar.getFullName() : null;
            styledInlineTextFieldViewDark5.setHasError(fullName2 == null || fullName2.length() == 0);
            u6();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = this.f43745d;
        if (styledInlineTextFieldViewDark6 == null) {
            p005kotlin.jvm.internal.s.m("nameTextView");
            throw null;
        }
        styledInlineTextFieldViewDark6.invalidate();
        J6();
        K6();
        M6();
        V6();
        X6();
        S6();
        yj1.h hVar3 = this.f43759r;
        if (hVar3 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar2 = hVar3.f197548b;
        if (qVar2 != null) {
            this.f43761v = (qVar2.j() == null || ((listJ = qVar2.j()) != null && listJ.size() == 0) || (listJ2 = qVar2.j()) == null || (cVar = listJ2.get(0)) == null) ? null : cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
        }
        yj1.h hVar4 = this.f43759r;
        if (hVar4 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        Boolean bool = hVar4.f197547a;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
            string = k.g(getString(R.string.settings_email_notifications_tab_title), Marker.ANY_MARKER);
        } else {
            string = getString(R.string.settings_email_notifications_tab_title);
            string.getClass();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark7 = this.f43753l;
        if (styledInlineTextFieldViewDark7 == null) {
            p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
            throw null;
        }
        styledInlineTextFieldViewDark7.setTitle(string);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark8 = this.f43753l;
        if (styledInlineTextFieldViewDark8 == null) {
            p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        styledInlineTextFieldViewDark8.setContentDescription(c22.b.g(contextRequireContext2, string));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark9 = this.f43753l;
        if (styledInlineTextFieldViewDark9 == null) {
            p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
            throw null;
        }
        String str = this.f43761v;
        styledInlineTextFieldViewDark9.i(new h32.h.c(str == null ? "" : str, "", null, null, null, new uj1.p(this, 9), null, null, 32, false, null, new uj1.p(this, 10), 1756, null));
        yj1.h hVar5 = this.f43759r;
        if (hVar5 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar5.f197549c && p005kotlin.jvm.internal.s.g(hVar5.f197547a, bool2)) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark10 = this.f43753l;
            if (styledInlineTextFieldViewDark10 == null) {
                p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
                throw null;
            }
            styledInlineTextFieldViewDark10.setHasError(!nb2.a.a(this.f43761v));
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark11 = this.f43753l;
            if (styledInlineTextFieldViewDark11 == null) {
                p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
                throw null;
            }
            styledInlineTextFieldViewDark11.setShowsErrorIcon(g22.n.d(this.f43761v));
            u6();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark12 = this.f43753l;
        if (styledInlineTextFieldViewDark12 == null) {
            p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
            throw null;
        }
        styledInlineTextFieldViewDark12.invalidate();
        yj1.h hVar6 = this.f43759r;
        if (hVar6 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar3 = hVar6.f197548b;
        if (qVar3 != null) {
            if (qVar3.s() == null || ((listS2 = qVar3.s()) != null && listS2.size() == 0)) {
                this.f43762w = null;
            }
            List<l20.c> listS3 = qVar3.s();
            if (listS3 != null) {
                z14 = false;
                for (l20.c cVar2 : listS3) {
                    if (p005kotlin.jvm.internal.s.g(cVar2.getIsPrimary(), Boolean.TRUE)) {
                        this.f43762w = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        z14 = true;
                    }
                }
            } else {
                z14 = false;
            }
            if (!z14) {
                this.f43762w = null;
            }
        }
        yj1.h hVar7 = this.f43759r;
        if (hVar7 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        Boolean bool3 = hVar7.f197547a;
        Boolean bool4 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool3, bool4)) {
            string2 = k.g(getString(R.string.lte_primary_phone_number), Marker.ANY_MARKER);
        } else {
            string2 = getString(R.string.lte_primary_phone_number);
            string2.getClass();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark13 = this.f43754m;
        if (styledInlineTextFieldViewDark13 == null) {
            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
            throw null;
        }
        styledInlineTextFieldViewDark13.setTitle(string2);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark14 = this.f43754m;
        if (styledInlineTextFieldViewDark14 == null) {
            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
            throw null;
        }
        c22.b bVar2 = c22.b.f23007a;
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        bVar2.getClass();
        styledInlineTextFieldViewDark14.setContentDescription(c22.b.g(contextRequireContext3, string2));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark15 = this.f43754m;
        if (styledInlineTextFieldViewDark15 == null) {
            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
            throw null;
        }
        String str2 = this.f43762w;
        styledInlineTextFieldViewDark15.i(new h32.h.c(str2 == null ? "" : str2, "", null, null, new p0(11), new uj1.p(this, 11), null, null, 3, false, null, new uj1.p(this, 12), 1740, null));
        yj1.h hVar8 = this.f43759r;
        if (hVar8 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar8.f197549c && p005kotlin.jvm.internal.s.g(hVar8.f197547a, bool4)) {
            w6();
            if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
                yj1.h hVar9 = this.f43759r;
                if (hVar9 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                z6(p005kotlin.jvm.internal.s.g(hVar9.f197550d, Boolean.FALSE));
            } else {
                com.garmin.android.apps.connectmobile.contacts.i.a aVar = com.garmin.android.apps.connectmobile.contacts.i.f32732a;
                String str3 = this.f43762w;
                aVar.getClass();
                z6(!com.garmin.android.apps.connectmobile.contacts.i.a.a(str3));
            }
        }
        u6();
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark16 = this.f43754m;
        if (styledInlineTextFieldViewDark16 == null) {
            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
            throw null;
        }
        styledInlineTextFieldViewDark16.invalidate();
        yj1.h hVar10 = this.f43759r;
        if (hVar10 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar4 = hVar10.f197548b;
        if (qVar4 != null) {
            if (qVar4.s() == null || ((listS = qVar4.s()) != null && listS.size() == 0)) {
                this.f43763x = null;
            }
            List<l20.c> listS4 = qVar4.s();
            if (listS4 != null) {
                for (l20.c cVar3 : listS4) {
                    if (!p005kotlin.jvm.internal.s.g(cVar3.getIsPrimary(), Boolean.TRUE)) {
                        this.f43763x = cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        z15 = true;
                    }
                }
            }
            if (!z15) {
                this.f43763x = null;
            }
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark17 = this.f43755n;
        if (styledInlineTextFieldViewDark17 == null) {
            p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
            throw null;
        }
        styledInlineTextFieldViewDark17.setTitle(getString(R.string.lte_secondary_phone_number));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark18 = this.f43755n;
        if (styledInlineTextFieldViewDark18 == null) {
            p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
            throw null;
        }
        String str4 = this.f43763x;
        styledInlineTextFieldViewDark18.i(new h32.h.c(str4 == null ? "" : str4, "", null, null, new p0(9), new uj1.p(this, 6), null, null, 3, false, null, new uj1.p(this, 7), 1740, null));
        yj1.h hVar11 = this.f43759r;
        if (hVar11 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar11.f197549c && g22.n.d(this.f43763x)) {
            w6();
            if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
                yj1.h hVar12 = this.f43759r;
                if (hVar12 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                A6(p005kotlin.jvm.internal.s.g(hVar12.f197551e, Boolean.FALSE));
            } else {
                com.garmin.android.apps.connectmobile.contacts.i.a aVar2 = com.garmin.android.apps.connectmobile.contacts.i.f32732a;
                String str5 = this.f43763x;
                aVar2.getClass();
                A6(!com.garmin.android.apps.connectmobile.contacts.i.a.a(str5));
            }
        }
        u6();
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark19 = this.f43755n;
        if (styledInlineTextFieldViewDark19 == null) {
            p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
            throw null;
        }
        styledInlineTextFieldViewDark19.invalidate();
        T6();
        u6();
        if (this.f43765z) {
            yj1.h hVar13 = this.f43759r;
            if (hVar13 == null) {
                p005kotlin.jvm.internal.s.m("informationUIModel");
                throw null;
            }
            if (hVar13.f197549c) {
                return;
            }
            pj1.s sVarW6 = w6();
            if (p005kotlin.jvm.internal.s.g(sVarW6.f137981q, hl.a.c.f84256b)) {
                sVarW6.f137903e.n(true);
                g3<tj1.e> g3VarD = sVarW6.C4().d();
                if (g3VarD != null && (eVar = g3VarD.f35301b) != null && (userContactsDTO = eVar.getUserContactsDTO()) != null) {
                    selfUserContactDTO = userContactsDTO.getSelfUserContactDTO();
                }
                sVarW6.V4(selfUserContactDTO);
            }
        }
    }

    public final void V6() {
        String str;
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        String string = getString(R.string.cm_state_province);
        w6();
        String strG = k.g(string, d0.l(this.f43764y) ? Marker.ANY_MARKER : "");
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43750i;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
            throw null;
        }
        styledInlineTextFieldViewDark.setTitle(strG);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43750i;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
            throw null;
        }
        c22.b bVar = c22.b.f23007a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        styledInlineTextFieldViewDark2.setContentDescription(c22.b.g(contextRequireContext, strG));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43750i;
        if (styledInlineTextFieldViewDark3 == null) {
            p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
            throw null;
        }
        styledInlineTextFieldViewDark3.i(new h32.h.c((qVar == null || (str = qVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String()) == null) ? "" : str, "", null, null, new p0(10), null, null, null, 1, false, null, new uj1.p(this, 8), 1772, null));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = this.f43750i;
        if (styledInlineTextFieldViewDark4 == null) {
            p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
            throw null;
        }
        boolean z14 = false;
        styledInlineTextFieldViewDark4.setShowsErrorIcon(false);
        yj1.h hVar2 = this.f43759r;
        if (hVar2 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar2.f197549c) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = this.f43750i;
            if (styledInlineTextFieldViewDark5 == null) {
                p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
                throw null;
            }
            String str2 = qVar != null ? qVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String() : null;
            if (str2 == null || str2.length() == 0) {
                w6();
                if (d0.l(this.f43764y)) {
                    z14 = true;
                }
            }
            styledInlineTextFieldViewDark5.setHasError(z14);
            u6();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = this.f43750i;
        if (styledInlineTextFieldViewDark6 != null) {
            styledInlineTextFieldViewDark6.invalidate();
        } else {
            p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
            throw null;
        }
    }

    public final void X6() {
        String string;
        String zipCode;
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar.f197548b;
        Boolean bool = hVar.f197547a;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
            string = k.g(getString(R.string.lte_zip_code), Marker.ANY_MARKER);
        } else {
            string = getString(R.string.lte_zip_code);
            string.getClass();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43751j;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("zipCode");
            throw null;
        }
        styledInlineTextFieldViewDark.setTitle(string);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43751j;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("zipCode");
            throw null;
        }
        c22.b bVar = c22.b.f23007a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        styledInlineTextFieldViewDark2.setContentDescription(c22.b.g(contextRequireContext, string));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43751j;
        if (styledInlineTextFieldViewDark3 == null) {
            p005kotlin.jvm.internal.s.m("zipCode");
            throw null;
        }
        if (qVar == null || (zipCode = qVar.getZipCode()) == null) {
            zipCode = "";
        }
        styledInlineTextFieldViewDark3.i(new h32.h.c(zipCode, "", null, null, new p0(8), null, null, null, 2, false, null, new uj1.p(this, 4), 1772, null));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = this.f43751j;
        if (styledInlineTextFieldViewDark4 == null) {
            p005kotlin.jvm.internal.s.m("zipCode");
            throw null;
        }
        styledInlineTextFieldViewDark4.setShowsErrorIcon(false);
        yj1.h hVar2 = this.f43759r;
        if (hVar2 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (hVar2.f197549c && p005kotlin.jvm.internal.s.g(hVar2.f197547a, bool2)) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = this.f43751j;
            if (styledInlineTextFieldViewDark5 == null) {
                p005kotlin.jvm.internal.s.m("zipCode");
                throw null;
            }
            String zipCode2 = qVar != null ? qVar.getZipCode() : null;
            styledInlineTextFieldViewDark5.setHasError(zipCode2 == null || zipCode2.length() == 0);
            u6();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = this.f43751j;
        if (styledInlineTextFieldViewDark6 != null) {
            styledInlineTextFieldViewDark6.invalidate();
        } else {
            p005kotlin.jvm.internal.s.m("zipCode");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r1.getHasError() == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y6() throws Throwable {
        Throwable th3;
        ?? r14;
        ?? L5;
        Object objC;
        List<l20.c> listJ;
        ArrayList arrayList;
        yj1.h hVar = this.f43759r;
        Throwable th4 = null;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        if (!p005kotlin.jvm.internal.s.g(hVar.f197547a, Boolean.TRUE)) {
            w6();
            yj1.h hVar2 = this.f43759r;
            if (hVar2 == null) {
                p005kotlin.jvm.internal.s.m("informationUIModel");
                throw null;
            }
            if (pj1.s.P4(hVar2.f197548b, false)) {
                y6();
                return;
            }
            String string = getString(R.string.lte_exit_info_generic_safety_features);
            string.getClass();
            H6(string, false, false);
            return;
        }
        w6();
        if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43754m;
            if (styledInlineTextFieldViewDark == null) {
                p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                throw null;
            }
            if (!styledInlineTextFieldViewDark.getHasError()) {
                if (g22.n.d(this.f43763x)) {
                    StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43755n;
                    if (styledInlineTextFieldViewDark2 == null) {
                        p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                        throw null;
                    }
                }
            }
            I6(getString(R.string.les_invalid_phone_number_dialog_title), getString(R.string.contacts_validation_invalid_contact_msg_3));
            return;
        }
        yj1.h hVar3 = this.f43759r;
        if (hVar3 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        l20.q qVar = hVar3.f197548b;
        if (qVar != null) {
            String str = this.f43761v;
            if (str != null) {
                w6();
                if (qVar.j() == null || ((listJ = qVar.j()) != null && listJ.size() == 0)) {
                    th3 = null;
                    objC = !TextUtils.isEmpty(str) ? p13.w.c(new l20.c(null, str, null, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.k.OTHER.f109012a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048549, null)) : th3;
                } else {
                    List<l20.c> listJ2 = qVar.j();
                    if (listJ2 != null) {
                        ArrayList arrayList2 = new ArrayList(y.r(listJ2, 10));
                        int i14 = 0;
                        ArrayList arrayList3 = arrayList2;
                        for (Object obj : listJ2) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                Throwable th5 = th4;
                                x.q();
                                throw th5;
                            }
                            l20.c cVarB = (l20.c) obj;
                            if (i14 == 0) {
                                arrayList = arrayList3;
                                cVarB = l20.c.b(cVarB, null, str, null, null, null, null, null, null, null, null, 0, 1048573);
                            } else {
                                arrayList = arrayList3;
                            }
                            arrayList.add(cVarB);
                            arrayList3 = arrayList;
                            i14 = i15;
                            th4 = th4;
                        }
                        th3 = th4;
                        objC = arrayList3;
                    } else {
                        th3 = null;
                    }
                }
                r14 = objC;
            } else {
                th3 = null;
                r14 = 0;
            }
            String str2 = this.f43762w;
            ?? K5 = str2 != null ? w6().k5(str2) : th3;
            String str3 = this.f43763x;
            if (str3 != null) {
                w6();
                L5 = pj1.s.l5(str3, K5);
            } else {
                L5 = th3;
            }
            yj1.h hVar4 = this.f43759r;
            if (hVar4 == null) {
                p005kotlin.jvm.internal.s.m("informationUIModel");
                throw th3;
            }
            this.f43759r = yj1.h.a(hVar4, l20.q.b(qVar, null, null, null, null, null, r14, null, null, null, null, L5, null, null, 16514943));
        } else {
            th3 = null;
        }
        w6();
        yj1.h hVar5 = this.f43759r;
        if (hVar5 == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw th3;
        }
        if (pj1.s.P4(hVar5.f197548b, true)) {
            y6();
            return;
        }
        if (qVar != null) {
            if (d0.g(qVar, false)) {
                String string2 = getString(R.string.lte_exit_info_assistance_plus_contacts_notify);
                string2.getClass();
                H6(string2, true, true);
            } else {
                String string3 = getString(R.string.lte_exit_info_assistance_plus_and_safety);
                string3.getClass();
                H6(string3, true, false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            v6().y4(this.f43764y);
        } else {
            F6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        LinearLayout linearLayout;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f43765z = w6().f137983t;
        this.f43764y = w6().N4() && w6().f137986x;
        if (!this.f43765z) {
            String string = requireContext().getString(R.string.safety_features_my_information);
            string.getClass();
            g22.e.g(this, string);
        }
        View viewFindViewById = view2.findViewById(R.id.title_layout);
        viewFindViewById.getClass();
        this.f43742a = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.my_info_title);
        viewFindViewById2.getClass();
        this.f43743b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.my_info_description);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f43744c = textView;
        textView.setText(this.f43764y ? getString(R.string.safety_features_wizard_my_info_aplus_assistance_description) : getString(R.string.msg_safety_feature_info_sharing));
        View viewFindViewById4 = view2.findViewById(R.id.name);
        viewFindViewById4.getClass();
        this.f43745d = (StyledInlineTextFieldViewDark) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.address_line_one);
        viewFindViewById5.getClass();
        this.f43747f = (StyledInlineTextFieldViewDark) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.address_line_two);
        viewFindViewById6.getClass();
        this.f43748g = (StyledInlineTextFieldViewDark) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.city);
        viewFindViewById7.getClass();
        this.f43749h = (StyledInlineTextFieldViewDark) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.state);
        viewFindViewById8.getClass();
        this.f43750i = (StyledInlineTextFieldViewDark) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.zip_code);
        viewFindViewById9.getClass();
        this.f43751j = (StyledInlineTextFieldViewDark) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.country);
        viewFindViewById10.getClass();
        StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark = (StyledInlineButtonFieldViewDark) viewFindViewById10;
        this.f43752k = styledInlineButtonFieldViewDark;
        final int i14 = 0;
        styledInlineButtonFieldViewDark.setOnClickListener(new View.OnClickListener(this) { // from class: uj1.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171560b;

            {
                this.f171560b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) throws Throwable {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171560b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.E6();
                        break;
                    case 1:
                        if (dVar.f43764y) {
                            j22.b bVar = j22.b.f96736a;
                            j22.a aVar2 = j22.a.f96719h;
                            bVar.getClass();
                            if (!j22.b.k(aVar2)) {
                                j22.b.z(dVar, 2, aVar2, j22.a.f96718g);
                            }
                        }
                        j22.b bVar2 = j22.b.f96736a;
                        j22.a aVar3 = j22.a.f96718g;
                        bVar2.getClass();
                        if (!j22.b.k(aVar3)) {
                            j22.b.z(dVar, 1, aVar3);
                        } else {
                            dVar.v6().y4(dVar.f43764y);
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.C6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.Y6();
                        break;
                }
            }
        });
        if (this.f43764y) {
            View viewFindViewById11 = view2.findViewById(R.id.use_my_location_assistance_plus);
            viewFindViewById11.getClass();
            linearLayout = (LinearLayout) viewFindViewById11;
        } else {
            View viewFindViewById12 = view2.findViewById(R.id.use_my_location_regular_assistance);
            viewFindViewById12.getClass();
            linearLayout = (LinearLayout) viewFindViewById12;
        }
        this.f43746e = linearLayout;
        final int i15 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: uj1.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171560b;

            {
                this.f171560b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) throws Throwable {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171560b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.E6();
                        break;
                    case 1:
                        if (dVar.f43764y) {
                            j22.b bVar = j22.b.f96736a;
                            j22.a aVar2 = j22.a.f96719h;
                            bVar.getClass();
                            if (!j22.b.k(aVar2)) {
                                j22.b.z(dVar, 2, aVar2, j22.a.f96718g);
                            }
                        }
                        j22.b bVar2 = j22.b.f96736a;
                        j22.a aVar3 = j22.a.f96718g;
                        bVar2.getClass();
                        if (!j22.b.k(aVar3)) {
                            j22.b.z(dVar, 1, aVar3);
                        } else {
                            dVar.v6().y4(dVar.f43764y);
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.C6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.Y6();
                        break;
                }
            }
        });
        View viewFindViewById13 = view2.findViewById(R.id.email);
        viewFindViewById13.getClass();
        this.f43753l = (StyledInlineTextFieldViewDark) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.primary_phone_number);
        viewFindViewById14.getClass();
        this.f43754m = (StyledInlineTextFieldViewDark) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.secondary_phone_number);
        viewFindViewById15.getClass();
        this.f43755n = (StyledInlineTextFieldViewDark) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.country_of_citizenship);
        viewFindViewById16.getClass();
        StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark2 = (StyledInlineButtonFieldViewDark) viewFindViewById16;
        this.f43756o = styledInlineButtonFieldViewDark2;
        final int i16 = 2;
        styledInlineButtonFieldViewDark2.setOnClickListener(new View.OnClickListener(this) { // from class: uj1.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171560b;

            {
                this.f171560b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) throws Throwable {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171560b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.E6();
                        break;
                    case 1:
                        if (dVar.f43764y) {
                            j22.b bVar = j22.b.f96736a;
                            j22.a aVar2 = j22.a.f96719h;
                            bVar.getClass();
                            if (!j22.b.k(aVar2)) {
                                j22.b.z(dVar, 2, aVar2, j22.a.f96718g);
                            }
                        }
                        j22.b bVar2 = j22.b.f96736a;
                        j22.a aVar3 = j22.a.f96718g;
                        bVar2.getClass();
                        if (!j22.b.k(aVar3)) {
                            j22.b.z(dVar, 1, aVar3);
                        } else {
                            dVar.v6().y4(dVar.f43764y);
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.C6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.Y6();
                        break;
                }
            }
        });
        View viewFindViewById17 = view2.findViewById(R.id.button_layout);
        viewFindViewById17.getClass();
        this.f43757p = (LinearLayout) viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.button_next);
        viewFindViewById18.getClass();
        Button button = (Button) viewFindViewById18;
        this.f43758q = button;
        final int i17 = 3;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: uj1.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171560b;

            {
                this.f171560b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) throws Throwable {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171560b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.E6();
                        break;
                    case 1:
                        if (dVar.f43764y) {
                            j22.b bVar = j22.b.f96736a;
                            j22.a aVar2 = j22.a.f96719h;
                            bVar.getClass();
                            if (!j22.b.k(aVar2)) {
                                j22.b.z(dVar, 2, aVar2, j22.a.f96718g);
                            }
                        }
                        j22.b bVar2 = j22.b.f96736a;
                        j22.a aVar3 = j22.a.f96718g;
                        bVar2.getClass();
                        if (!j22.b.k(aVar3)) {
                            j22.b.z(dVar, 1, aVar3);
                        } else {
                            dVar.v6().y4(dVar.f43764y);
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.C6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                        dVar.Y6();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = this.f43742a;
        if (linearLayout2 == null) {
            p005kotlin.jvm.internal.s.m("titleLayout");
            throw null;
        }
        linearLayout2.setVisibility(0);
        TextView textView2 = this.f43743b;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("title");
            throw null;
        }
        v22.e.v(textView2, this.f43765z);
        LinearLayout linearLayout3 = this.f43746e;
        if (linearLayout3 == null) {
            p005kotlin.jvm.internal.s.m("useMyLocationView");
            throw null;
        }
        linearLayout3.setVisibility(0);
        boolean z14 = this.f43764y;
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43747f;
        if (z14) {
            if (styledInlineTextFieldViewDark == null) {
                p005kotlin.jvm.internal.s.m("addressLineOne");
                throw null;
            }
            styledInlineTextFieldViewDark.setVisibility(0);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43748g;
            if (styledInlineTextFieldViewDark2 == null) {
                p005kotlin.jvm.internal.s.m("addressLineTwo");
                throw null;
            }
            styledInlineTextFieldViewDark2.setVisibility(0);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43751j;
            if (styledInlineTextFieldViewDark3 == null) {
                p005kotlin.jvm.internal.s.m("zipCode");
                throw null;
            }
            styledInlineTextFieldViewDark3.setVisibility(0);
            StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark3 = this.f43752k;
            if (styledInlineButtonFieldViewDark3 == null) {
                p005kotlin.jvm.internal.s.m("country");
                throw null;
            }
            styledInlineButtonFieldViewDark3.setVisibility(0);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = this.f43753l;
            if (styledInlineTextFieldViewDark4 == null) {
                p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
                throw null;
            }
            styledInlineTextFieldViewDark4.setVisibility(0);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = this.f43754m;
            if (styledInlineTextFieldViewDark5 == null) {
                p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                throw null;
            }
            styledInlineTextFieldViewDark5.setVisibility(0);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = this.f43755n;
            if (styledInlineTextFieldViewDark6 == null) {
                p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                throw null;
            }
            styledInlineTextFieldViewDark6.setVisibility(0);
            StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark4 = this.f43756o;
            if (styledInlineButtonFieldViewDark4 == null) {
                p005kotlin.jvm.internal.s.m("countryOfCitizenship");
                throw null;
            }
            styledInlineButtonFieldViewDark4.setVisibility(0);
        } else {
            if (styledInlineTextFieldViewDark == null) {
                p005kotlin.jvm.internal.s.m("addressLineOne");
                throw null;
            }
            styledInlineTextFieldViewDark.setVisibility(8);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark7 = this.f43748g;
            if (styledInlineTextFieldViewDark7 == null) {
                p005kotlin.jvm.internal.s.m("addressLineTwo");
                throw null;
            }
            styledInlineTextFieldViewDark7.setVisibility(8);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark8 = this.f43751j;
            if (styledInlineTextFieldViewDark8 == null) {
                p005kotlin.jvm.internal.s.m("zipCode");
                throw null;
            }
            styledInlineTextFieldViewDark8.setVisibility(8);
            StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark5 = this.f43752k;
            if (styledInlineButtonFieldViewDark5 == null) {
                p005kotlin.jvm.internal.s.m("country");
                throw null;
            }
            styledInlineButtonFieldViewDark5.setVisibility(8);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark9 = this.f43753l;
            if (styledInlineTextFieldViewDark9 == null) {
                p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
                throw null;
            }
            styledInlineTextFieldViewDark9.setVisibility(8);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark10 = this.f43754m;
            if (styledInlineTextFieldViewDark10 == null) {
                p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                throw null;
            }
            styledInlineTextFieldViewDark10.setVisibility(8);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark11 = this.f43755n;
            if (styledInlineTextFieldViewDark11 == null) {
                p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                throw null;
            }
            styledInlineTextFieldViewDark11.setVisibility(8);
            StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark6 = this.f43756o;
            if (styledInlineButtonFieldViewDark6 == null) {
                p005kotlin.jvm.internal.s.m("countryOfCitizenship");
                throw null;
            }
            styledInlineButtonFieldViewDark6.setVisibility(8);
        }
        LinearLayout linearLayout4 = this.f43757p;
        if (linearLayout4 == null) {
            p005kotlin.jvm.internal.s.m("buttonLayout");
            throw null;
        }
        v22.e.v(linearLayout4, this.f43765z);
        u6();
        if (s3.b()) {
            LinearLayout linearLayout5 = this.f43742a;
            if (linearLayout5 == null) {
                p005kotlin.jvm.internal.s.m("titleLayout");
                throw null;
            }
            linearLayout5.setVisibility(0);
            TextView textView3 = this.f43743b;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("title");
                throw null;
            }
            textView3.setVisibility(8);
            TextView textView4 = this.f43744c;
            if (textView4 == null) {
                p005kotlin.jvm.internal.s.m("titleDescription");
                throw null;
            }
            textView4.setText(getString(R.string.msg_child_safety_feature_information));
            TextView textView5 = this.f43744c;
            if (textView5 == null) {
                p005kotlin.jvm.internal.s.m("titleDescription");
                throw null;
            }
            textView5.setTextAppearance(R.style.Text_Caption_Secondary);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark12 = this.f43745d;
            if (styledInlineTextFieldViewDark12 == null) {
                p005kotlin.jvm.internal.s.m("nameTextView");
                throw null;
            }
            styledInlineTextFieldViewDark12.setIsEnabled(false);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark13 = this.f43749h;
            if (styledInlineTextFieldViewDark13 == null) {
                p005kotlin.jvm.internal.s.m("city");
                throw null;
            }
            styledInlineTextFieldViewDark13.setIsEnabled(false);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark14 = this.f43750i;
            if (styledInlineTextFieldViewDark14 == null) {
                p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
                throw null;
            }
            styledInlineTextFieldViewDark14.setIsEnabled(false);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark15 = this.f43747f;
            if (styledInlineTextFieldViewDark15 == null) {
                p005kotlin.jvm.internal.s.m("addressLineOne");
                throw null;
            }
            styledInlineTextFieldViewDark15.setIsEnabled(false);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark16 = this.f43748g;
            if (styledInlineTextFieldViewDark16 == null) {
                p005kotlin.jvm.internal.s.m("addressLineTwo");
                throw null;
            }
            styledInlineTextFieldViewDark16.setIsEnabled(false);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark17 = this.f43751j;
            if (styledInlineTextFieldViewDark17 == null) {
                p005kotlin.jvm.internal.s.m("zipCode");
                throw null;
            }
            styledInlineTextFieldViewDark17.setIsEnabled(false);
            StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark7 = this.f43752k;
            if (styledInlineButtonFieldViewDark7 == null) {
                p005kotlin.jvm.internal.s.m("country");
                throw null;
            }
            styledInlineButtonFieldViewDark7.setIsEnabled(false);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark18 = this.f43754m;
            if (styledInlineTextFieldViewDark18 == null) {
                p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                throw null;
            }
            styledInlineTextFieldViewDark18.setIsEnabled(false);
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark19 = this.f43755n;
            if (styledInlineTextFieldViewDark19 == null) {
                p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                throw null;
            }
            styledInlineTextFieldViewDark19.setIsEnabled(false);
            StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark8 = this.f43756o;
            if (styledInlineButtonFieldViewDark8 == null) {
                p005kotlin.jvm.internal.s.m("countryOfCitizenship");
                throw null;
            }
            styledInlineButtonFieldViewDark8.setIsEnabled(false);
            LinearLayout linearLayout6 = this.f43746e;
            if (linearLayout6 == null) {
                p005kotlin.jvm.internal.s.m("useMyLocationView");
                throw null;
            }
            linearLayout6.setVisibility(8);
            LinearLayout linearLayout7 = this.f43757p;
            if (linearLayout7 == null) {
                p005kotlin.jvm.internal.s.m("buttonLayout");
                throw null;
            }
            linearLayout7.setVisibility(8);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.D, viewLifecycleOwner);
        w6().I0.f(getViewLifecycleOwner(), this.E);
        w6().f137971b1.f(getViewLifecycleOwner(), this.I);
        w6().f137906h.f(getViewLifecycleOwner(), this.F);
        w6().f137908j.f(getViewLifecycleOwner(), new C0814d(new uj1.p(this, 15)));
        w6().f137910l.f(getViewLifecycleOwner(), new C0814d(new uj1.p(this, 16)));
        if (this.f43764y) {
            w6().o5();
        }
        w6().B4();
        v6().f137944b.f(getViewLifecycleOwner(), new C0814d(new uj1.p(this, 14)));
        v6().f137946d.f(getViewLifecycleOwner(), new C0814d(new uj1.p(this, 5)));
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    public final void u6() {
        LinearLayout linearLayout = this.f43757p;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("buttonLayout");
            throw null;
        }
        int visibility = linearLayout.getVisibility();
        Button button = this.f43758q;
        boolean z14 = false;
        if (visibility != 0) {
            if (button != null) {
                button.setEnabled(false);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
        if (button == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43745d;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("nameTextView");
            throw null;
        }
        if (!styledInlineTextFieldViewDark.getHasError()) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43749h;
            if (styledInlineTextFieldViewDark2 == null) {
                p005kotlin.jvm.internal.s.m("city");
                throw null;
            }
            if (!styledInlineTextFieldViewDark2.getHasError()) {
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43750i;
                if (styledInlineTextFieldViewDark3 == null) {
                    p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
                    throw null;
                }
                if (!styledInlineTextFieldViewDark3.getHasError()) {
                    if (this.f43764y) {
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = this.f43747f;
                        if (styledInlineTextFieldViewDark4 == null) {
                            p005kotlin.jvm.internal.s.m("addressLineOne");
                            throw null;
                        }
                        if (!styledInlineTextFieldViewDark4.getHasError()) {
                            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = this.f43751j;
                            if (styledInlineTextFieldViewDark5 == null) {
                                p005kotlin.jvm.internal.s.m("zipCode");
                                throw null;
                            }
                            if (!styledInlineTextFieldViewDark5.getHasError()) {
                                StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark = this.f43752k;
                                if (styledInlineButtonFieldViewDark == null) {
                                    p005kotlin.jvm.internal.s.m("country");
                                    throw null;
                                }
                                if (!styledInlineButtonFieldViewDark.getHasError()) {
                                    StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = this.f43753l;
                                    if (styledInlineTextFieldViewDark6 == null) {
                                        p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
                                        throw null;
                                    }
                                    if (!styledInlineTextFieldViewDark6.getHasError()) {
                                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark7 = this.f43754m;
                                        if (styledInlineTextFieldViewDark7 == null) {
                                            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                                            throw null;
                                        }
                                        if (!styledInlineTextFieldViewDark7.getHasError()) {
                                            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark8 = this.f43755n;
                                            if (styledInlineTextFieldViewDark8 == null) {
                                                p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                                                throw null;
                                            }
                                            if (!styledInlineTextFieldViewDark8.getHasError()) {
                                                StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark2 = this.f43756o;
                                                if (styledInlineButtonFieldViewDark2 == null) {
                                                    p005kotlin.jvm.internal.s.m("countryOfCitizenship");
                                                    throw null;
                                                }
                                                if (!styledInlineButtonFieldViewDark2.getHasError()) {
                                                    z14 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        z14 = true;
                    }
                }
            }
        }
        button.setEnabled(z14);
    }

    public final pj1.m v6() {
        return (pj1.m) this.B.getValue();
    }

    public final pj1.s w6() {
        return (pj1.s) this.A.getValue();
    }

    public final void y6() {
        tj1.e eVar;
        r userContactsDTO;
        List<l20.a> listF;
        pj1.s sVarW6 = w6();
        yj1.h hVar = this.f43759r;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("informationUIModel");
            throw null;
        }
        sVarW6.V4(hVar.f197548b);
        if (!this.f43765z) {
            this.D.f(false);
            ((b.u) this.C.getValue()).d();
            return;
        }
        w6();
        if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
            g3<tj1.e> g3VarD = w6().C4().d();
            if (((g3VarD == null || (eVar = g3VarD.f35301b) == null || (userContactsDTO = eVar.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) ? j0.f134944a : ge1.b.t(listF)).isEmpty()) {
                w6().J0.m("AddContactNewUserFragment");
                return;
            }
        }
        w6().J0.m("SafetyFeaturesReviewEmergencyContactsFragment");
    }

    public final void z6(boolean z14) {
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43754m;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
            throw null;
        }
        styledInlineTextFieldViewDark.setHasError(z14);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43754m;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
            throw null;
        }
        styledInlineTextFieldViewDark2.setShowsErrorIcon(g22.n.d(this.f43762w));
        u6();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_COURSE_LOCATION", "I", "REQUEST_CODE_FINE_LOCATION", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
