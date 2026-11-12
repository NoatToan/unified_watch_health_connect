package vp0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.detail.HydrationView;
import com.garmin.android.apps.connectmobile.hydration.presentation.settings.HydrationSettingsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.m0;
import fw.p;
import java.util.HashMap;
import o13.m;
import o13.n;
import o13.u;
import o62.g0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import q92.x;
import ro0.l;
import xk1.v;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lvp0/e;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lvp0/k$b;", "<init>", "()V", "b", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends m0 implements k.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f179337o = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f179338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DateTime f179339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f179340j = m.a(n.NONE, new f(this, null, new C3348e(this), null, null));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f179341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f179342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vp0.d f179343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vp0.d f179344n;

    public interface b {
        void H5();

        void X7();
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vp0/e$c", "Landroidx/core/view/s;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            MenuItem menuItemAdd = menu.add(0, 149, 0, R.string.lbl_settings);
            e eVar = e.this;
            eVar.f179342l = menuItemAdd;
            if (menuItemAdd != null) {
                menuItemAdd.setShowAsActionFlags(0);
            }
            MenuItem menuItem = eVar.f179342l;
            if (menuItem != null) {
                DateTime dateTime = eVar.f179339i;
                menuItem.setVisible((dateTime != null ? g22.k.k(dateTime) : false) && d1.i(x.DI_CONNECT_UPLOAD));
            }
            MenuItem menuItemAdd2 = menu.add(0, 148, 0, R.string.lbl_help);
            MenuItem menuItem2 = eVar.f179342l;
            menuItemAdd2.setShowAsActionFlags(menuItem2 != null && menuItem2.isVisible() ? 0 : 2);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            e eVar = e.this;
            if (itemId == 148) {
                return HelpActivity.a.e(HelpActivity.f36653a, eVar.requireContext(), l.HYDRATION, null, null, 12);
            }
            if (itemId != 149) {
                return false;
            }
            HydrationSettingsActivity.a aVar = HydrationSettingsActivity.f36708c;
            androidx.fragment.app.m mVarRequireActivity = eVar.requireActivity();
            mVarRequireActivity.getClass();
            aVar.getClass();
            Intent intent = new Intent(mVarRequireActivity, (Class<?>) HydrationSettingsActivity.class);
            intent.putExtra("NAVIGATE_TO_GOAL", false);
            eVar.startActivityForResult(intent, 100);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f179346a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f179346a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f179346a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f179346a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: vp0.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3348e implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f179347a;

        public C3348e(Fragment fragment) {
            this.f179347a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f179347a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<vp0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f179348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f179349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f179350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f179351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f179352e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f179348a = fragment;
            this.f179349b = qualifier;
            this.f179350c = aVar;
            this.f179351d = aVar2;
            this.f179352e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, vp0.a] */
        @Override // e23.a
        public final vp0.a invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f179350c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f179348a;
            e23.a aVar = this.f179351d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(vp0.a.class), f189591b, null, defaultViewModelCreationExtras, this.f179349b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f179352e, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [vp0.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [vp0.d] */
    public e() {
        final int i14 = 0;
        this.f179343m = new z0(this) { // from class: vp0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179336b;

            {
                this.f179336b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                e eVar = this.f179336b;
                fw.m<jp0.b> mVar = (fw.m) obj;
                switch (i15) {
                    case 0:
                        e.a aVar = e.f179337o;
                        mVar.getClass();
                        eVar.I6(mVar, true);
                        break;
                    default:
                        e.a aVar2 = e.f179337o;
                        mVar.getClass();
                        eVar.I6(mVar, false);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f179344n = new z0(this) { // from class: vp0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179336b;

            {
                this.f179336b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                e eVar = this.f179336b;
                fw.m<jp0.b> mVar = (fw.m) obj;
                switch (i16) {
                    case 0:
                        e.a aVar = e.f179337o;
                        mVar.getClass();
                        eVar.I6(mVar, true);
                        break;
                    default:
                        e.a aVar2 = e.f179337o;
                        mVar.getClass();
                        eVar.I6(mVar, false);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        vp0.a aVar = (vp0.a) this.f179340j.getValue();
        DateTime dateTime = this.f179339i;
        HashMap map = aVar.f179322b;
        androidx.lifecycle.s0 y0Var = new y0();
        if (dateTime != null) {
            if (((androidx.lifecycle.s0) map.get(dateTime)) != null) {
                y0Var = androidx.lifecycle.m.a(null, new vp0.b(aVar, dateTime, null), 3);
                map.put(dateTime, y0Var);
            } else {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "HydrationDetailViewModel", "Refreshing data for something that doesn't exist - getHydrationDataAsync()");
                HashMap map2 = aVar.f179322b;
                new y0();
                y0Var = (androidx.lifecycle.s0) map2.get(dateTime);
                if (y0Var == null) {
                    androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new vp0.b(aVar, dateTime, null), 3);
                    map2.put(dateTime, jVarA);
                    y0Var = jVarA;
                }
            }
        }
        y0Var.f(this, this.f179344n);
    }

    public final void I6(fw.m<jp0.b> mVar, boolean z14) {
        DateTime dateTimeAtCurrentTime;
        if (mVar != null) {
            p pVar = mVar.f73769b;
            if (pVar == p.LOADING && !z6()) {
                G6();
            }
            if (pVar == p.ERROR) {
                w6();
                g22.e.a(this, hb2.i.a(requireContext()) ? mVar.f73771d : new fw.h());
                k kVar = this.f179341k;
                if (kVar == null) {
                    p005kotlin.jvm.internal.s.m("hydrationView");
                    throw null;
                }
                kVar.f179381o = true;
            }
            if (pVar == p.SUCCESS) {
                w6();
                jp0.b bVar = mVar.f73770c;
                if (bVar != null) {
                    q22.b bVarJ = jp0.c.j(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).d0());
                    Double goalInML = bVar.getGoalInML();
                    double dDoubleValue = goalInML != null ? goalInML.doubleValue() : jp0.c.e(jp0.c.f(bVarJ), null, 2);
                    Double valueInML = bVar.getValueInML();
                    double dDoubleValue2 = valueInML != null ? valueInML.doubleValue() : 0.0d;
                    k kVar2 = this.f179341k;
                    if (z14) {
                        if (kVar2 == null) {
                            p005kotlin.jvm.internal.s.m("hydrationView");
                            throw null;
                        }
                        Double dValueOf = Double.valueOf(dDoubleValue);
                        kVar2.f179368b = dValueOf;
                        kVar2.f179373g.setHydrationGoal(dValueOf);
                    } else {
                        if (kVar2 == null) {
                            p005kotlin.jvm.internal.s.m("hydrationView");
                            throw null;
                        }
                        Double dValueOf2 = Double.valueOf(dDoubleValue);
                        kVar2.f179368b = dValueOf2;
                        HydrationView hydrationView = kVar2.f179373g;
                        hydrationView.setHydrationGoal(dValueOf2);
                        hydrationView.invalidate();
                        hydrationView.b(hydrationView.f36669g, 0.0d);
                    }
                    k kVar3 = this.f179341k;
                    if (kVar3 == null) {
                        p005kotlin.jvm.internal.s.m("hydrationView");
                        throw null;
                    }
                    if (bVarJ != null && bVarJ != kVar3.f179370d) {
                        kVar3.f179370d = bVarJ;
                        kVar3.f179373g.setUnitOfMeasure(bVarJ);
                        kVar3.d();
                        kVar3.c();
                    }
                    k kVar4 = this.f179341k;
                    if (kVar4 == null) {
                        p005kotlin.jvm.internal.s.m("hydrationView");
                        throw null;
                    }
                    Double dValueOf3 = Double.valueOf(dDoubleValue2);
                    kVar4.f179369c = dValueOf3;
                    kVar4.f179373g.setInitialHydrationValue(dValueOf3);
                    kVar4.d();
                    LocalDate localDateD = bVar.d();
                    if (localDateD != null && (dateTimeAtCurrentTime = localDateD.toDateTimeAtCurrentTime()) != null && g22.k.k(dateTimeAtCurrentTime)) {
                        k kVar5 = this.f179341k;
                        if (kVar5 == null) {
                            p005kotlin.jvm.internal.s.m("hydrationView");
                            throw null;
                        }
                        kVar5.a(bVar.h());
                    }
                    k kVar6 = this.f179341k;
                    if (kVar6 == null) {
                        p005kotlin.jvm.internal.s.m("hydrationView");
                        throw null;
                    }
                    op0.c cVarG = bVar.g();
                    kVar6.f179371e = new u<>(jp0.c.b(1, cVarG), jp0.c.b(2, cVarG), jp0.c.b(3, cVarG));
                    kVar6.b(kVar6.f179377k);
                    kVar6.b(kVar6.f179378l);
                    kVar6.b(kVar6.f179379m);
                }
                k kVar7 = this.f179341k;
                if (kVar7 != null) {
                    kVar7.f179381o = true;
                } else {
                    p005kotlin.jvm.internal.s.m("hydrationView");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
    @Override // vp0.k.b
    public final void o0(double d14, e23.a<Unit> aVar) {
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "HydrationDetailsFragment", "Updating hydration entry with " + d14);
        vp0.a aVar3 = (vp0.a) this.f179340j.getValue();
        g0 g0Var = new g0(this, d14, aVar, 3);
        aVar3.getClass();
        if (d1.f()) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            d1.o(contextRequireContext, new v(12));
        } else if (d1.h(x.DI_CONNECT_UPLOAD, true)) {
            g0Var.invoke();
        } else {
            aVar3.f179325e = g0Var;
            DataStorageConsentActivity.a.e(DataStorageConsentActivity.f32194t, this, false, 101, null, 12);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        g0 g0Var;
        if (i15 == -1) {
            if (i14 == 100) {
                b bVar = this.f179338h;
                if (bVar != null) {
                    bVar.X7();
                }
            } else if (i14 == 101 && (g0Var = ((vp0.a) this.f179340j.getValue()).f179325e) != null) {
                g0Var.invoke();
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f179338h = (b) context;
        } catch (ClassCastException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "HydrationDetailsFragment", "must implement HydrationDetailListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f179339i = new DateTime(arguments.getLong("extra.date.time"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.fragment_hydration_details);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        v22.e.g(R.color.gcm_background_hero, view2);
        View viewFindViewById = view2.findViewById(R.id.hydration_details_container);
        viewFindViewById.getClass();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        this.f179341k = new k(viewFindViewById, viewLifecycleOwner, this);
        vp0.a aVar = (vp0.a) this.f179340j.getValue();
        DateTime dateTime = this.f179339i;
        HashMap map = aVar.f179322b;
        androidx.lifecycle.s0 y0Var = new y0();
        if (dateTime != null && (y0Var = (androidx.lifecycle.s0) map.get(dateTime)) == null) {
            y0Var = androidx.lifecycle.m.a(null, new vp0.b(aVar, dateTime, null), 3);
            map.put(dateTime, y0Var);
        }
        y0Var.f(getViewLifecycleOwner(), this.f179343m);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lvp0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MENU_ITEM_HELP", "I", "MENU_ITEM_SETTINGS", "CHANGE_SETTINGS_REQUEST_CODE", "CONSENT_REQUEST_CODE", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
