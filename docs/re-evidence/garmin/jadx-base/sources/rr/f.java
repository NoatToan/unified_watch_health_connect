package rr;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.p0;
import qr.t;
import r53.s;
import u1.d2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lrr/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lnr/t$a;", "uiState", "Lrr/k;", "selectedChartTab", "", "supportsDistance", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f154161a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.charts.ActivityDetailsChartsFragment$onViewCreated$1$1$1", f = "ActivityDetailsChartsFragment.kt", l = {66}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f154162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2 f154163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f154164c;

        /* JADX INFO: renamed from: rr.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2920a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f154165a;

            public C2920a(f fVar) {
                this.f154165a = fVar;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o13.l] */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((t) this.f154165a.f154161a.getValue()).f146557s2.k(null, bool);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f154166a;

            /* JADX INFO: renamed from: rr.f$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C2921a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f154167a;

                /* JADX INFO: renamed from: rr.f$a$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.charts.ActivityDetailsChartsFragment$onViewCreated$1$1$1$invokeSuspend$$inlined$map$1$2", f = "ActivityDetailsChartsFragment.kt", l = {50}, m = "emit", v = 2)
                public static final class C2922a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f154168a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f154169b;

                    public C2922a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f154168a = obj;
                        this.f154169b |= Integer.MIN_VALUE;
                        return C2921a.this.emit(null, this);
                    }
                }

                public C2921a(r53.j jVar) {
                    this.f154167a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2922a c2922a;
                    if (dVar instanceof C2922a) {
                        c2922a = (C2922a) dVar;
                        int i14 = c2922a.f154169b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2922a.f154169b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2922a = new C2922a(dVar);
                        }
                    } else {
                        c2922a = new C2922a(dVar);
                    }
                    Object obj2 = c2922a.f154168a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2922a.f154169b;
                    if (i15 == 0) {
                        r.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                        c2922a.f154169b = 1;
                        if (this.f154167a.emit(boolValueOf, c2922a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar) {
                this.f154166a = iVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
                Object objCollect = this.f154166a.collect(new C2921a(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d2 d2Var, f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f154163b = d2Var;
            this.f154164c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f154163b, this.f154164c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f154162a;
            if (i14 == 0) {
                r.b(obj);
                r53.i iVarS = s.s(new b(p0.s(new ok0.f(this.f154163b, 1))));
                C2920a c2920a = new C2920a(this.f154164c);
                this.f154162a = 1;
                if (iVarS.collect(c2920a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f154171a;

        public b(Fragment fragment) {
            this.f154171a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f154171a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f154172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f154173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f154174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f154175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f154176e;

        public c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f154172a = fragment;
            this.f154173b = qualifier;
            this.f154174c = aVar;
            this.f154175d = aVar2;
            this.f154176e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f154174c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f154172a;
            e23.a aVar = this.f154175d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), f189591b, null, defaultViewModelCreationExtras, this.f154173b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f154176e, 4, null);
        }
    }

    public f() {
        super(R.layout.composable_container);
        this.f154161a = o13.m.a(n.NONE, new c(this, null, new b(this), null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new z3.e(-1701572127, true, new r12.a(this, 16)));
    }
}
