package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.q.a;
import java.io.Serializable;
import mt0.c1;
import mt0.d1;
import mt0.f1;
import mt0.g1;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.i3;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006 \u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00048\nX\u008a\u0084\u0002²\u0006 \u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "Lot0/g;", "kotlin.jvm.PlatformType", "availableFilters", "selectedFilter", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f37765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f37766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f37767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f37768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SwipeRefreshLayout f37769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f37770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f37771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f37772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.c<Intent> f37773k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AvailableBadgeChallengesFragment$gcPlusHomeActivityLauncher$1$1", f = "AvailableBadgeChallengesFragment.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37774a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.challenges.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AvailableBadgeChallengesFragment$gcPlusHomeActivityLauncher$1$1$hasGCPlusSocialFeature$1", f = "AvailableBadgeChallengesFragment.kt", l = {107}, m = "invokeSuspend", v = 2)
        public static final class C0673a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f37776a;

            public C0673a(t13.d<? super C0673a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0673a(dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
                return new C0673a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f37776a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                c80.q qVar = c80.q.SOCIAL;
                this.f37776a = 1;
                Object objL = j1Var.l(qVar, this);
                return objL == aVar ? aVar : objL;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return q.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f37774a;
            q qVar = q.this;
            if (i14 == 0) {
                o13.r.b(obj);
                if (qVar.f37768f != null) {
                    x53.c cVar = o53.s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    C0673a c0673a = new C0673a(null);
                    this.f37774a = 1;
                    obj = ge1.b.e0(bVar, c0673a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            l0 l0Var = qVar.f37768f;
            if (l0Var != null) {
                l0Var.x(zBooleanValue);
                return Unit.INSTANCE;
            }
            p005kotlin.jvm.internal.s.m("challengesAdapter");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/q$b", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l0$c;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l0.c {
        public b() {
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.l0.c
        public final void a(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
            boolean zZ0 = pVar.Z0();
            q qVar = q.this;
            if (zZ0) {
                w5.r.e(qVar, new d1(qVar, pVar, 2), new mh1.i(qVar, 11));
            } else {
                q.u6(qVar, pVar);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.l0.c
        public final void p(String str) {
            str.getClass();
            q qVar = q.this;
            f.c<Intent> cVar = qVar.f37772j;
            BadgeChallengeDetailsActivity.a aVar = BadgeChallengeDetailsActivity.f37204e;
            Context contextRequireContext = qVar.requireContext();
            contextRequireContext.getClass();
            aVar.getClass();
            cVar.a(BadgeChallengeDetailsActivity.a.a(contextRequireContext, str), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AvailableBadgeChallengesFragment$onViewCreated$1$1", f = "AvailableBadgeChallengesFragment.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37778a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AvailableBadgeChallengesFragment$onViewCreated$1$1$hasGCPlusSocialFeature$1", f = "AvailableBadgeChallengesFragment.kt", l = {129}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f37780a;

            public a(t13.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
                return new a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f37780a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                c80.q qVar = c80.q.SOCIAL;
                this.f37780a = 1;
                Object objL = j1Var.l(qVar, this);
                return objL == aVar ? aVar : objL;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return q.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f37778a;
            q qVar = q.this;
            if (i14 == 0) {
                o13.r.b(obj);
                ((s51.a) qVar.w6().f140745d.getValue()).f157373d.invoke();
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(null);
                this.f37778a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            l0 l0Var = qVar.f37768f;
            if (l0Var != null) {
                l0Var.x(zBooleanValue);
                return Unit.INSTANCE;
            }
            p005kotlin.jvm.internal.s.m("challengesAdapter");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37781a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f37781a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37781a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37781a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37782a;

        public e(Fragment fragment) {
            this.f37782a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37782a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<i3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37787e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37783a = fragment;
            this.f37784b = qualifier;
            this.f37785c = aVar;
            this.f37786d = aVar2;
            this.f37787e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, z10.i3] */
        @Override // e23.a
        public final i3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37785c.invoke();
            y1 f185700a = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37783a;
            e23.a aVar = this.f37786d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(i3.class), f185700a, null, defaultViewModelCreationExtras, this.f37784b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37787e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37788a;

        public g(Fragment fragment) {
            this.f37788a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f37788a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<pt0.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37793e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37789a = fragment;
            this.f37790b = qualifier;
            this.f37791c = aVar;
            this.f37792d = aVar2;
            this.f37793e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, pt0.o] */
        @Override // e23.a
        public final pt0.o invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f185700a = ((ViewModelStoreOwner) this.f37791c.invoke()).getF189591b();
            Fragment fragment = this.f37789a;
            e23.a aVar = this.f37792d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.o.class), f185700a, null, defaultViewModelCreationExtras, this.f37790b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37793e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37794a;

        public i(Fragment fragment) {
            this.f37794a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f37794a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<pt0.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37799e;

        public j(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37795a = fragment;
            this.f37796b = qualifier;
            this.f37797c = aVar;
            this.f37798d = aVar2;
            this.f37799e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, pt0.p] */
        @Override // e23.a
        public final pt0.p invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f185700a = ((ViewModelStoreOwner) this.f37797c.invoke()).getF189591b();
            Fragment fragment = this.f37795a;
            e23.a aVar = this.f37798d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.p.class), f185700a, null, defaultViewModelCreationExtras, this.f37796b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37799e, 4, null);
        }
    }

    public q() {
        g gVar = new g(this);
        o13.n nVar = o13.n.NONE;
        this.f37763a = o13.m.a(nVar, new h(this, null, gVar, null, null));
        this.f37764b = o13.m.a(nVar, new j(this, null, new i(this), null, null));
        this.f37765c = o13.m.a(nVar, new f(this, null, new e(this), null, null));
        this.f37771i = new b();
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: mt0.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.q f120585b;

            {
                this.f120585b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Serializable serializableExtra;
                f.a aVar = (f.a) obj;
                switch (i14) {
                    case 0:
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        int i15 = aVar.f67585a;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar = this.f120585b;
                        DateTime dateTime = null;
                        if (i15 == -1) {
                            if (intent != null && intent.getBooleanExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", false)) {
                                ge1.b.T(g22.f.b(qVar), null, null, new h1(qVar, null), 3);
                            }
                            if (intent != null && intent.getBooleanExtra("KEY_SHOULD_CHECK_PREMIUM_SUBSCRIPTION_NOTICE", false)) {
                                if (intent != null) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        serializableExtra = intent.getSerializableExtra("extra_challenge_end_date", DateTime.class);
                                    } else {
                                        Serializable serializableExtra2 = intent.getSerializableExtra("extra_challenge_end_date");
                                        serializableExtra = (DateTime) (serializableExtra2 instanceof DateTime ? serializableExtra2 : null);
                                    }
                                    dateTime = (DateTime) serializableExtra;
                                }
                                w5.r.w(qVar, true, dateTime, new w72.f(25));
                            }
                            ((s51.a) qVar.w6().f140745d.getValue()).f157373d.invoke();
                            if (intent != null) {
                                qVar.v6().f140764k.putExtras(intent);
                            }
                            qVar.requireActivity().setResult(-1, qVar.v6().f140764k);
                        } else if (i15 == 701) {
                            new androidx.appcompat.app.e.a(qVar.requireContext()).setMessage(R.string.social_challenge_not_available).setPositiveButton(R.string.lbl_close, (DialogInterface.OnClickListener) null).setCancelable(true).create().show();
                        }
                        break;
                    default:
                        aVar.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar2 = this.f120585b;
                        ge1.b.T(g22.f.b(qVar2), null, null, qVar2.new a(null), 3);
                        if (aVar.f67585a == -1) {
                            ge1.b.T(g22.f.b(qVar2), null, null, new h1(qVar2, null), 3);
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f37772j = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: mt0.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.q f120585b;

            {
                this.f120585b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Serializable serializableExtra;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        int i16 = aVar.f67585a;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar = this.f120585b;
                        DateTime dateTime = null;
                        if (i16 == -1) {
                            if (intent != null && intent.getBooleanExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", false)) {
                                ge1.b.T(g22.f.b(qVar), null, null, new h1(qVar, null), 3);
                            }
                            if (intent != null && intent.getBooleanExtra("KEY_SHOULD_CHECK_PREMIUM_SUBSCRIPTION_NOTICE", false)) {
                                if (intent != null) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        serializableExtra = intent.getSerializableExtra("extra_challenge_end_date", DateTime.class);
                                    } else {
                                        Serializable serializableExtra2 = intent.getSerializableExtra("extra_challenge_end_date");
                                        serializableExtra = (DateTime) (serializableExtra2 instanceof DateTime ? serializableExtra2 : null);
                                    }
                                    dateTime = (DateTime) serializableExtra;
                                }
                                w5.r.w(qVar, true, dateTime, new w72.f(25));
                            }
                            ((s51.a) qVar.w6().f140745d.getValue()).f157373d.invoke();
                            if (intent != null) {
                                qVar.v6().f140764k.putExtras(intent);
                            }
                            qVar.requireActivity().setResult(-1, qVar.v6().f140764k);
                        } else if (i16 == 701) {
                            new androidx.appcompat.app.e.a(qVar.requireContext()).setMessage(R.string.social_challenge_not_available).setPositiveButton(R.string.lbl_close, (DialogInterface.OnClickListener) null).setCancelable(true).create().show();
                        }
                        break;
                    default:
                        aVar.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar2 = this.f120585b;
                        ge1.b.T(g22.f.b(qVar2), null, null, qVar2.new a(null), 3);
                        if (aVar.f67585a == -1) {
                            ge1.b.T(g22.f.b(qVar2), null, null, new h1(qVar2, null), 3);
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f37773k = cVarRegisterForActivityResult2;
    }

    public static final void u6(q qVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        qVar.getClass();
        if (!p005kotlin.jvm.internal.s.g(pVar.getIsAutoChallengeLink(), Boolean.TRUE)) {
            qVar.y6(pVar);
            return;
        }
        qVar.v6().f140754a.getClass();
        androidx.lifecycle.j jVarN = o53.f0.N(new pt0.w(null));
        androidx.lifecycle.n0 viewLifecycleOwner = qVar.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarN, viewLifecycleOwner, new d(new c1(qVar, pVar)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.paged_challenge_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.compose_view);
        viewFindViewById.getClass();
        this.f37766d = (ComposeView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.recycler_view);
        viewFindViewById2.getClass();
        this.f37767e = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.swipe_refresh_layout);
        viewFindViewById3.getClass();
        this.f37769g = (SwipeRefreshLayout) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.empty_text);
        viewFindViewById4.getClass();
        this.f37770h = (TextView) viewFindViewById4;
        SwipeRefreshLayout swipeRefreshLayout = this.f37769g;
        if (swipeRefreshLayout == null) {
            p005kotlin.jvm.internal.s.m("swipeRefreshView");
            throw null;
        }
        swipeRefreshLayout.setOnRefreshListener(new mn2.e(this, 29));
        v6().f140759f.f(getViewLifecycleOwner(), new d(new f1(this, 0)));
        v6().f140763j.f(getViewLifecycleOwner(), new d(new f1(this, 1)));
        ComposeView composeView = this.f37766d;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("composeView");
            throw null;
        }
        composeView.setContent(new z3.e(503391630, true, new g1(this, 0)));
        ge1.b.T(g22.f.b(this), null, null, new r(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final pt0.p v6() {
        return (pt0.p) this.f37764b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final pt0.o w6() {
        return (pt0.o) this.f37763a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
    public final void y6(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        if (pVar.getUuid() == null || pVar.getBadgeId() == null) {
            return;
        }
        i3 i3Var = (i3) this.f37765c.getValue();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        d1 d1Var = new d1(this, pVar, 1);
        i3Var.getClass();
        i3Var.x4(contextRequireContext, false, d1Var);
    }
}
