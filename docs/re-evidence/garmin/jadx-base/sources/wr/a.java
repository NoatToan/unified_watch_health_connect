package wr;

import am.x0;
import am.z0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import java.util.List;
import nr.t;
import o13.n;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import ps.r;
import qr.o6;
import qs.x;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwr/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fragment f186638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f186639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f186640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f186641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f186642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f186643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f186644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f186645h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f186637j = {s0.f105811a.f(new b0(a.class, "defaultViewEnabled", "getDefaultViewEnabled()Z", 0))};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C3472a f186636i = new C3472a(null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186646a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.D2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f186646a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.laps.ActivityDetailsComparisonFragment$onViewCreated$1", f = "ActivityDetailsComparisonFragment.kt", l = {60}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186647a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<x0> f186649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f186650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Bundle f186651e;

        /* JADX INFO: renamed from: wr.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.laps.ActivityDetailsComparisonFragment$onViewCreated$1$1", f = "ActivityDetailsComparisonFragment.kt", l = {61}, m = "invokeSuspend", v = 2)
        public static final class C3473a extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186652a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f186653b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List<x0> f186654c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ View f186655d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Bundle f186656e;

            /* JADX INFO: renamed from: wr.a$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3474a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List<x0> f186657a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f186658b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ View f186659c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Bundle f186660d;

                /* JADX WARN: Multi-variable type inference failed */
                public C3474a(List<? extends x0> list, a aVar, View view2, Bundle bundle) {
                    this.f186657a = list;
                    this.f186658b = aVar;
                    this.f186659c = view2;
                    this.f186660d = bundle;
                }

                /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, o13.l] */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    Fragment fragment;
                    Resources resources;
                    Configuration configuration;
                    Fragment bVar;
                    r rVar = ((t.e) obj).f127331a;
                    if (rVar != null) {
                        boolean zD = fr.a.d(rVar.t(), x.PACE_PRO_SPLIT);
                        boolean zContains = this.f186657a.contains(rVar.h());
                        String str = rVar.h().f4358a;
                        z0 z0Var = z0.f4390a;
                        x0 x0Var = x0.f4312o;
                        boolean zB = z0.b(x0Var, str);
                        boolean zD2 = fr.a.d(rVar.t(), x.POWER_GUIDE_SPLIT);
                        if ((zD && zContains) || (zB && zD2)) {
                            a aVar = this.f186658b;
                            if (aVar.f186638a == null) {
                                if (b.f186646a[rVar.h().ordinal()] == 1) {
                                    k.a aVar2 = k.f186755l;
                                    Long activityId = rVar.getActivityId();
                                    bVar = k.a.b(aVar2, activityId != null ? activityId.longValue() : -1L, uq.k.READ_ONLY, false);
                                } else {
                                    bVar = new wr.b();
                                }
                                aVar.f186638a = bVar;
                            }
                            if (aVar.f186639b == null) {
                                k.a aVar3 = k.f186755l;
                                Long activityId2 = rVar.getActivityId();
                                aVar.f186639b = k.a.b(aVar3, activityId2 != null ? activityId2.longValue() : -1L, uq.k.COMPARISON, true);
                            }
                            boolean z14 = ((qr.t) aVar.f186641d.getValue()).E1 == 0;
                            aVar.f186645h.setValue(aVar, a.f186637j[0], Boolean.valueOf(z14));
                            View viewFindViewById = this.f186659c.findViewById(R.id.toggle_button);
                            viewFindViewById.getClass();
                            TextView textView = (TextView) viewFindViewById;
                            aVar.f186640c = textView;
                            Context context = aVar.getContext();
                            textView.setVisibility((context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || 1 != configuration.orientation) ? 8 : 0);
                            TextView textView2 = aVar.f186640c;
                            if (textView2 == null) {
                                s.m("toggleButton");
                                throw null;
                            }
                            v22.e.n(textView2, new vu1.b(aVar, 19));
                            if (this.f186660d == null) {
                                if (z14) {
                                    fragment = aVar.f186638a;
                                    if (fragment == null) {
                                        s.m("defaultFragment");
                                        throw null;
                                    }
                                } else {
                                    fragment = aVar.f186639b;
                                    if (fragment == null) {
                                        s.m("comparisonFragment");
                                        throw null;
                                    }
                                }
                                v childFragmentManager = aVar.getChildFragmentManager();
                                childFragmentManager.getClass();
                                androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(childFragmentManager);
                                aVar4.l(R.id.child_container, fragment, null);
                                aVar4.i();
                                aVar4.e();
                            }
                            aVar.f186643f = R.string.pacepro_splits_comparison_lap_view;
                            aVar.f186644g = z0.b(x0Var, rVar.h().f4358a) ? R.string.power_guide_splits_comparison_splits_view : R.string.pacepro_splits_comparison_splits_view;
                            int i14 = aVar.u6() ? aVar.f186644g : aVar.f186643f;
                            TextView textView3 = aVar.f186640c;
                            if (textView3 == null) {
                                s.m("toggleButton");
                                throw null;
                            }
                            textView3.setText(i14);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3473a(a aVar, List<? extends x0> list, View view2, Bundle bundle, t13.d<? super C3473a> dVar) {
                super(2, dVar);
                this.f186653b = aVar;
                this.f186654c = list;
                this.f186655d = view2;
                this.f186656e = bundle;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3473a(this.f186653b, this.f186654c, this.f186655d, this.f186656e, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3473a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f186652a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    C3472a c3472a = a.f186636i;
                    a aVar2 = this.f186653b;
                    p2 p2Var = ((qr.t) aVar2.f186641d.getValue()).S1;
                    C3474a c3474a = new C3474a(this.f186654c, aVar2, this.f186655d, this.f186656e);
                    this.f186652a = 1;
                    if (p2Var.collect(c3474a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends x0> list, View view2, Bundle bundle, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f186649c = list;
            this.f186650d = view2;
            this.f186651e = bundle;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f186649c, this.f186650d, this.f186651e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186647a;
            if (i14 == 0) {
                o13.r.b(obj);
                n0 viewLifecycleOwner = a.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                C3473a c3473a = new C3473a(a.this, this.f186649c, this.f186650d, this.f186651e, null);
                this.f186647a = 1;
                if (h1.b(viewLifecycleOwner, bVar, c3473a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186661a;

        public d(Fragment fragment) {
            this.f186661a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f186661a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<qr.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f186663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f186664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f186665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f186666e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f186662a = fragment;
            this.f186663b = qualifier;
            this.f186664c = aVar;
            this.f186665d = aVar2;
            this.f186666e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final qr.t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f186664c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f186662a;
            e23.a aVar = this.f186665d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(qr.t.class), f189591b, null, defaultViewModelCreationExtras, this.f186663b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f186666e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186667a;

        public f(Fragment fragment) {
            this.f186667a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f186667a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<o6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f186669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f186670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f186671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f186672e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f186668a = fragment;
            this.f186669b = qualifier;
            this.f186670c = aVar;
            this.f186671d = aVar2;
            this.f186672e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.o6] */
        @Override // e23.a
        public final o6 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f186670c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f186668a;
            e23.a aVar = this.f186671d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(o6.class), f189591b, null, defaultViewModelCreationExtras, this.f186669b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f186672e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"wr/a$h", "Lg23/c;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends g23.c<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f186673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, a aVar) {
            super(obj);
            this.f186673a = aVar;
        }

        @Override // g23.c
        public final void afterChange(k23.l<?> lVar, Boolean bool, Boolean bool2) {
            lVar.getClass();
            boolean zBooleanValue = bool2.booleanValue();
            bool.getClass();
            a aVar = this.f186673a;
            TextView textView = aVar.f186640c;
            if (textView != null) {
                textView.setText(zBooleanValue ? aVar.f186644g : aVar.f186643f);
            }
        }
    }

    public a() {
        d dVar = new d(this);
        n nVar = n.NONE;
        this.f186641d = o13.m.a(nVar, new e(this, null, dVar, null, null));
        this.f186642e = o13.m.a(nVar, new g(this, null, new f(this), null, null));
        this.f186643f = R.string.no_value;
        this.f186644g = R.string.no_value;
        g23.a aVar = g23.a.f75578a;
        this.f186645h = new h(Boolean.TRUE, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.activity_stats_comparison_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        List listK = p13.x.k(x0.f4308n, x0.D2, x0.J0, x0.K0);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new c(listK, view2, bundle, null), 3);
    }

    public final boolean u6() {
        return this.f186645h.getValue(this, f186637j[0]).booleanValue();
    }

    /* JADX INFO: renamed from: wr.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr/a$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3472a {
        public /* synthetic */ C3472a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3472a() {
        }
    }
}
