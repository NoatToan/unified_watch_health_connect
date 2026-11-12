package com.garmin.android.apps.connectmobile.activity.details.presentation.jumps;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import java.util.List;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.j;
import r53.p2;
import v13.e;
import v13.i;
import vb.h;
import vc0.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/jumps/ActivityDetailsJumpMetricFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityDetailsJumpMetricFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30072b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30073a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.jumps.ActivityDetailsJumpMetricFragment$onViewCreated$1", f = "ActivityDetailsJumpMetricFragment.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30074a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f30076c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.jumps.ActivityDetailsJumpMetricFragment$onViewCreated$1$1", f = "ActivityDetailsJumpMetricFragment.kt", l = {37}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f30077a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsJumpMetricFragment f30078b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f30079c;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activity.details.presentation.jumps.ActivityDetailsJumpMetricFragment$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0468a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f30080a;

                public C0468a(View view2) {
                    this.f30080a = view2;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    ((ComposeView) this.f30080a.findViewById(R.id.composable_container)).setContent(new z3.e(-33595226, true, new a31.b((List) obj, 20)));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityDetailsJumpMetricFragment activityDetailsJumpMetricFragment, View view2, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f30078b = activityDetailsJumpMetricFragment;
                this.f30079c = view2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f30078b, this.f30079c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o13.l] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f30077a;
                if (i14 == 0) {
                    r.b(obj);
                    p2 p2Var = ((vr.c) this.f30078b.f30073a.getValue()).f179468c;
                    C0468a c0468a = new C0468a(this.f30079c);
                    this.f30077a = 1;
                    if (p2Var.collect(c0468a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f30076c = view2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ActivityDetailsJumpMetricFragment.this.new b(this.f30076c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30074a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                View view2 = this.f30076c;
                ActivityDetailsJumpMetricFragment activityDetailsJumpMetricFragment = ActivityDetailsJumpMetricFragment.this;
                a aVar2 = new a(activityDetailsJumpMetricFragment, view2, null);
                this.f30074a = 1;
                if (h1.b(activityDetailsJumpMetricFragment, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30081a;

        public c(Fragment fragment) {
            this.f30081a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f30081a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<vr.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30086e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30082a = fragment;
            this.f30083b = qualifier;
            this.f30084c = aVar;
            this.f30085d = aVar2;
            this.f30086e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, vr.c] */
        @Override // e23.a
        public final vr.c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f30084c.invoke()).getF189591b();
            Fragment fragment = this.f30082a;
            e23.a aVar = this.f30085d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(vr.c.class), f189591b, null, defaultViewModelCreationExtras, this.f30083b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30086e, 4, null);
        }
    }

    static {
        new a(null);
    }

    public ActivityDetailsJumpMetricFragment() {
        super(R.layout.composable_container);
        v vVar = new v(this, 12);
        this.f30073a = m.a(n.NONE, new d(this, null, new c(this), null, vVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onCreate(bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(new vr.a(this), getViewLifecycleOwner());
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new b(view2, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/jumps/ActivityDetailsJumpMetricFragment$a;", "", "<init>", "()V", "", "EXTRA_JUMP_METRICS", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
