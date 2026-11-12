package com.garmin.android.apps.connectmobile.hydration.presentation.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import fw.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import o13.m;
import o13.n;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.x;
import ro0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0652a f36709l = new C0652a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xp0.e f36712c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36714e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f36716g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xp0.b f36718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xp0.b f36719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36720k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public op0.c f36710a = new op0.c(null, null, null, null, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public op0.c f36711b = new op0.c(null, null, null, null, 15, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UserSettingsDTO.c f36713d = UserSettingsDTO.c.NOT_SPECIFIED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f36715f = m.b(new xp0.a(0, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f36717h = m.a(n.NONE, new g(this, null, new f(this), null, null));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36721a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36721a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/hydration/presentation/settings/a$c", "Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/b$b;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.apps.connectmobile.hydration.presentation.settings.b.InterfaceC0653b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f36723b;

        public c(int i14, a aVar) {
            this.f36722a = i14;
            this.f36723b = aVar;
        }

        @Override // com.garmin.android.apps.connectmobile.hydration.presentation.settings.b.InterfaceC0653b
        public final void a(double d14, q22.b bVar) {
            double dI = jp0.c.i(bVar);
            if (d14 < dI) {
                d14 = dI;
            }
            op0.a aVar = new op0.a(this.f36722a, null, jp0.c.f(bVar).f77282a, Double.valueOf(d14), 2, null);
            a aVar2 = this.f36723b;
            aVar2.f36710a.o(aVar);
            xp0.e eVar = aVar2.f36712c;
            if (eVar != null) {
                eVar.a(aVar);
            } else {
                s.m("settingsViewHolder");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/hydration/presentation/settings/a$d", "Lb/s;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a.this.v6();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/hydration/presentation/settings/a$e", "Landroidx/core/view/s;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements androidx.core.view.s {
        public e() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menu.add(0, 32, 0, R.string.lbl_help).setShowAsActionFlags(1);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() == 32) {
                return HelpActivity.a.e(HelpActivity.f36653a, a.this.requireContext(), l.HYDRATION, null, null, 12);
            }
            return false;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36726a;

        public f(Fragment fragment) {
            this.f36726a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f36726a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<pp0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f36728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f36729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f36730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f36731e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f36727a = fragment;
            this.f36728b = qualifier;
            this.f36729c = aVar;
            this.f36730d = aVar2;
            this.f36731e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, pp0.c] */
        @Override // e23.a
        public final pp0.c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f36729c.invoke()).getF189591b();
            Fragment fragment = this.f36727a;
            e23.a aVar = this.f36730d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(pp0.c.class), f189591b, null, defaultViewModelCreationExtras, this.f36728b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f36731e, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [xp0.b] */
    /* JADX WARN: Type inference failed for: r0v7, types: [xp0.b] */
    public a() {
        final int i14 = 0;
        this.f36718i = new z0() { // from class: xp0.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a aVar = this;
                g3 g3Var = (g3) obj;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                        g3Var.getClass();
                        int i16 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.b.f36721a[g3Var.f35300a.ordinal()];
                        if (i16 != 1) {
                            if (i16 == 2) {
                                g22.e.f(aVar);
                                g22.e.c(aVar);
                                return;
                            } else if (i16 == 3) {
                                g22.e.l(aVar);
                                return;
                            } else {
                                u0.r();
                                return;
                            }
                        }
                        op0.c cVar = (op0.c) g3Var.f35301b;
                        if (cVar == null) {
                            cVar = new op0.c(null, null, null, null, 15, null);
                        }
                        aVar.f36710a = cVar;
                        List<op0.a> listH = cVar.h();
                        aVar.f36711b = op0.c.b(cVar, listH != null ? new ArrayList(listH) : null);
                        if (aVar.f36720k) {
                            Context contextRequireContext = aVar.requireContext();
                            contextRequireContext.getClass();
                            aVar.y6(contextRequireContext);
                            return;
                        }
                        g22.e.f(aVar);
                        e eVar = aVar.f36712c;
                        if (eVar == null) {
                            s.m("settingsViewHolder");
                            throw null;
                        }
                        View view2 = eVar.f191838a;
                        op0.c cVar2 = aVar.f36710a;
                        cVar2.getClass();
                        gg1.n nVarI = cVar2.i();
                        UserSettingsDTO.c cVarA = ((mp0.a) KoinJavaComponent.get$default(mp0.a.class, null, null, 6, null)).a();
                        Double baseGoalInML = cVar2.getBaseGoalInML();
                        double dDoubleValue = baseGoalInML != null ? baseGoalInML.doubleValue() : jp0.c.d(nVarI, cVarA);
                        Context context = view2.getContext();
                        context.getClass();
                        String strM = jp0.c.m(new wp0.a(new l22.a(context)), jp0.c.j(nVarI));
                        Context context2 = view2.getContext();
                        context2.getClass();
                        String strL = jp0.c.l(context2, jp0.c.j(nVarI));
                        op0.a aVarB = jp0.c.b(1, cVar2);
                        op0.a aVarB2 = jp0.c.b(2, cVar2);
                        op0.a aVarB3 = jp0.c.b(3, cVar2);
                        eVar.f191840c.setButtonBottomLeftLabel(view2.getContext().getString(jp0.c.j(nVarI).f142315d));
                        eVar.c(Double.valueOf(dDoubleValue), nVarI);
                        eVar.f191842e.setText(view2.getContext().getString(R.string.msg_hydration_goal_ranges, strM, strL));
                        eVar.a(aVarB);
                        eVar.a(aVarB2);
                        eVar.a(aVarB3);
                        view2.setVisibility(0);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a2 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                        g3Var.getClass();
                        int i17 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.b.f36721a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            g22.e.f(aVar);
                            aVar.w6(true);
                            return;
                        } else if (i17 == 2) {
                            g22.e.f(aVar);
                            g22.e.c(aVar);
                            aVar.w6(false);
                            return;
                        } else if (i17 == 3) {
                            g22.e.l(aVar);
                            return;
                        } else {
                            u0.r();
                            return;
                        }
                }
            }
        };
        final int i15 = 1;
        this.f36719j = new z0() { // from class: xp0.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a aVar = this;
                g3 g3Var = (g3) obj;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                        g3Var.getClass();
                        int i17 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.b.f36721a[g3Var.f35300a.ordinal()];
                        if (i17 != 1) {
                            if (i17 == 2) {
                                g22.e.f(aVar);
                                g22.e.c(aVar);
                                return;
                            } else if (i17 == 3) {
                                g22.e.l(aVar);
                                return;
                            } else {
                                u0.r();
                                return;
                            }
                        }
                        op0.c cVar = (op0.c) g3Var.f35301b;
                        if (cVar == null) {
                            cVar = new op0.c(null, null, null, null, 15, null);
                        }
                        aVar.f36710a = cVar;
                        List<op0.a> listH = cVar.h();
                        aVar.f36711b = op0.c.b(cVar, listH != null ? new ArrayList(listH) : null);
                        if (aVar.f36720k) {
                            Context contextRequireContext = aVar.requireContext();
                            contextRequireContext.getClass();
                            aVar.y6(contextRequireContext);
                            return;
                        }
                        g22.e.f(aVar);
                        e eVar = aVar.f36712c;
                        if (eVar == null) {
                            s.m("settingsViewHolder");
                            throw null;
                        }
                        View view2 = eVar.f191838a;
                        op0.c cVar2 = aVar.f36710a;
                        cVar2.getClass();
                        gg1.n nVarI = cVar2.i();
                        UserSettingsDTO.c cVarA = ((mp0.a) KoinJavaComponent.get$default(mp0.a.class, null, null, 6, null)).a();
                        Double baseGoalInML = cVar2.getBaseGoalInML();
                        double dDoubleValue = baseGoalInML != null ? baseGoalInML.doubleValue() : jp0.c.d(nVarI, cVarA);
                        Context context = view2.getContext();
                        context.getClass();
                        String strM = jp0.c.m(new wp0.a(new l22.a(context)), jp0.c.j(nVarI));
                        Context context2 = view2.getContext();
                        context2.getClass();
                        String strL = jp0.c.l(context2, jp0.c.j(nVarI));
                        op0.a aVarB = jp0.c.b(1, cVar2);
                        op0.a aVarB2 = jp0.c.b(2, cVar2);
                        op0.a aVarB3 = jp0.c.b(3, cVar2);
                        eVar.f191840c.setButtonBottomLeftLabel(view2.getContext().getString(jp0.c.j(nVarI).f142315d));
                        eVar.c(Double.valueOf(dDoubleValue), nVarI);
                        eVar.f191842e.setText(view2.getContext().getString(R.string.msg_hydration_goal_ranges, strM, strL));
                        eVar.a(aVarB);
                        eVar.a(aVarB2);
                        eVar.a(aVarB3);
                        view2.setVisibility(0);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a2 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                        g3Var.getClass();
                        int i18 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.b.f36721a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            g22.e.f(aVar);
                            aVar.w6(true);
                            return;
                        } else if (i18 == 2) {
                            g22.e.f(aVar);
                            g22.e.c(aVar);
                            aVar.w6(false);
                            return;
                        } else if (i18 == 3) {
                            g22.e.l(aVar);
                            return;
                        } else {
                            u0.r();
                            return;
                        }
                }
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 100 && i15 == -1 && intent != null) {
            double doubleExtra = intent.getDoubleExtra("GCM_extra_current_daily_goal", Double.NaN);
            if (!Double.isNaN(doubleExtra)) {
                gg1.n nVarI = this.f36710a.i();
                this.f36710a.m(Double.valueOf(doubleExtra));
                xp0.e eVar = this.f36712c;
                if (eVar == null) {
                    s.m("settingsViewHolder");
                    throw null;
                }
                eVar.c(Double.valueOf(doubleExtra), nVarI);
                this.f36714e = true;
            }
            if (intent.hasExtra("autoGoal")) {
                this.f36710a.q(Boolean.valueOf(intent.getBooleanExtra("autoGoal", false)));
                this.f36714e = true;
            }
        }
        if (i14 == 100 && this.f36720k) {
            v6();
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f36716g = new d();
        u uVar = (u) this.f36715f.getValue();
        d dVar = this.f36716g;
        if (dVar != null) {
            uVar.b(dVar, this);
        } else {
            s.m("onBackPressedCallback");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_hydration_settings_activity, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        g22.e.f(this);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        g22.e.k(this, new e(), b0.b.RESUMED);
        this.f36713d = ((mp0.a) KoinJavaComponent.get$default(mp0.a.class, null, null, 6, null)).a();
        Bundle arguments = getArguments();
        this.f36720k = arguments != null ? arguments.getBoolean("NAVIGATE_TO_GOAL", false) : false;
        View viewFindViewById = view2.findViewById(R.id.hydration_settings_root);
        viewFindViewById.getClass();
        xp0.e eVar = new xp0.e(viewFindViewById);
        this.f36712c = eVar;
        eVar.f191840c.setOnClickListener(new xp0.d(new xp0.c(this, view2, 0), 1));
        xp0.e eVar2 = this.f36712c;
        if (eVar2 == null) {
            s.m("settingsViewHolder");
            throw null;
        }
        eVar2.f191841d.setOnClickListener(new xp0.d(new xp0.c(this, view2, 1), 0));
        xp0.e eVar3 = this.f36712c;
        if (eVar3 == null) {
            s.m("settingsViewHolder");
            throw null;
        }
        eVar3.b(1, new xp0.a(1, this));
        xp0.e eVar4 = this.f36712c;
        if (eVar4 == null) {
            s.m("settingsViewHolder");
            throw null;
        }
        eVar4.b(2, new xp0.a(2, this));
        xp0.e eVar5 = this.f36712c;
        if (eVar5 == null) {
            s.m("settingsViewHolder");
            throw null;
        }
        eVar5.b(3, new xp0.a(3, this));
        pp0.c cVar = (pp0.c) this.f36717h.getValue();
        cVar.getClass();
        xy2.b.K(cVar, new pp0.a(cVar, null)).f(getViewLifecycleOwner(), this.f36718i);
    }

    public final void u6(int i14) {
        c cVar = new c(i14, this);
        gg1.n nVarA1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).a1();
        op0.a aVarB = jp0.c.b(i14, this.f36710a);
        gg1.n nVarG = aVarB.g();
        if (nVarG != null) {
            nVarA1 = nVarG;
        }
        q22.b bVarH = jp0.c.h(nVarA1);
        Double volume = aVarB.getVolume();
        double dDoubleValue = volume != null ? volume.doubleValue() : jp0.c.c(i14, nVarA1);
        q22.b bVar = q22.b.CUP;
        q22.b bVar2 = q22.b.FLUID_OUNCE;
        q22.b bVar3 = q22.b.MILLILITER;
        ArrayList arrayListM = x.m(bVar, bVar2, bVar3);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string = getString(R.string.lbl_container_numeric, String.valueOf(i14));
        string.getClass();
        double dI = jp0.c.i(bVarH);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Double dValueOf = Double.valueOf(3785.411784d);
        linkedHashMap.put(bVar, dValueOf);
        linkedHashMap.put(bVar2, dValueOf);
        linkedHashMap.put(bVar3, Double.valueOf(3785.0d));
        linkedHashMap.put(q22.b.LITRE, Double.valueOf(4000.0d));
        com.garmin.android.apps.connectmobile.hydration.presentation.settings.b bVar4 = new com.garmin.android.apps.connectmobile.hydration.presentation.settings.b(contextRequireContext, string, dDoubleValue, dI, linkedHashMap, arrayListM, bVarH, cVar);
        Window window = bVar4.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        bVar4.show();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, o13.l] */
    public final void v6() {
        op0.c cVar = new op0.c(null, null, null, null, 15, null);
        String hydrationMeasurementUnit = this.f36710a.getHydrationMeasurementUnit();
        if (hydrationMeasurementUnit != null && !hydrationMeasurementUnit.equals(this.f36711b.getHydrationMeasurementUnit())) {
            cVar.s(hydrationMeasurementUnit);
        }
        if (!s.g(this.f36710a.h(), this.f36711b.h())) {
            cVar.r(this.f36710a.h());
        }
        if (cVar.k()) {
            w6(this.f36714e);
            return;
        }
        pp0.c cVar2 = (pp0.c) this.f36717h.getValue();
        cVar2.getClass();
        xy2.b.K(cVar2, new pp0.b(cVar2, cVar, null)).f(getViewLifecycleOwner(), this.f36719j);
    }

    public final void w6(boolean z14) {
        int i14 = z14 ? -1 : 0;
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setResult(i14);
        }
        d dVar = this.f36716g;
        if (dVar == null) {
            s.m("onBackPressedCallback");
            throw null;
        }
        dVar.f(false);
        ((u) this.f36715f.getValue()).d();
    }

    public final void y6(Context context) {
        gg1.n nVarI = this.f36710a.i();
        Double baseGoalInML = this.f36710a.getBaseGoalInML();
        double dDoubleValue = baseGoalInML != null ? baseGoalInML.doubleValue() : jp0.c.d(nVarI, this.f36713d);
        Boolean hydrationAutoGoalEnabled = this.f36710a.getHydrationAutoGoalEnabled();
        HydrationGoalSettingsActivity.a aVar = HydrationGoalSettingsActivity.f36691k;
        q22.b bVarH = jp0.c.h(nVarI);
        aVar.getClass();
        bVarH.getClass();
        startActivityForResult(HydrationGoalSettingsActivity.a.a(context, dDoubleValue, hydrationAutoGoalEnabled, bVarH, false), 100);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.hydration.presentation.settings.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/a$a;", "", "<init>", "()V", "", "DAILY_GOAL_REQUEST_CODE", "I", "MENU_ITEM_HELP", "", "MAX_VOLUME_CONTAINER_CUP", "D", "MAX_VOLUME_CONTAINER_OUNCE", "MAX_VOLUME_CONTAINER_MILLILITER", "MAX_VOLUME_CONTAINER_LITRE", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0652a {
        public /* synthetic */ C0652a(j jVar) {
            this();
        }

        private C0652a() {
        }
    }
}
