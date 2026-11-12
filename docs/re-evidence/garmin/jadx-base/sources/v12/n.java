package v12;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/n;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f174757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u12.f f174758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f174759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f174760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f174761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f174762f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v12/n$a", "Landroidx/core/view/s;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements androidx.core.view.s {
        public a() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.profile_past_activities_privacy, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            n nVar = n.this;
            if (itemId != R.id.menu_item_update) {
                if (itemId != 16908332) {
                    return false;
                }
                p pVarU6 = nVar.u6();
                pVarU6.getClass();
                ge1.b.T(v1.a(pVarU6), null, null, new q(pVarU6, null), 3);
                return true;
            }
            if (((p.a) nVar.u6().f174793d.getValue()).f174795b) {
                p pVarU7 = nVar.u6();
                pVarU7.getClass();
                ge1.b.T(v1.a(pVarU7), null, null, new u(pVarU7, null), 3);
                return true;
            }
            Context contextRequireContext = nVar.requireContext();
            contextRequireContext.getClass();
            v12.b.b(contextRequireContext).show();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.UpdateCustomPastActivitiesPrivacyFragment$onViewCreated$4", f = "UpdateCustomPastActivitiesPrivacyFragment.kt", l = {113}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174764a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.UpdateCustomPastActivitiesPrivacyFragment$onViewCreated$4$1", f = "UpdateCustomPastActivitiesPrivacyFragment.kt", l = {114}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f174766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f174767b;

            /* JADX INFO: renamed from: v12.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3253a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ n f174768a;

                public C3253a(n nVar) {
                    this.f174768a = nVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    String string;
                    p.a aVar = (p.a) obj;
                    n nVar = this.f174768a;
                    o13.t tVar = nVar.f174759c;
                    o13.t tVar2 = nVar.f174762f;
                    hl.a aVar2 = (hl.a) tVar.getValue();
                    u12.f fVar = nVar.f174758b;
                    if (p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b)) {
                        string = nVar.getString(R.string.privacy_past_activities_description);
                    } else {
                        if (!(aVar2 instanceof hl.a.b)) {
                            u0.r();
                            return null;
                        }
                        string = "_Select the activity types that you would like to update.";
                    }
                    string.getClass();
                    fVar.getClass();
                    fVar.f167777b = string;
                    fVar.notifyItemInserted(0);
                    List<ip.a> list = aVar.f174794a;
                    list.getClass();
                    ArrayList arrayList = fVar.f167778c;
                    arrayList.clear();
                    arrayList.addAll(list);
                    fVar.notifyDataSetChanged();
                    nVar.requireActivity().invalidateOptionsMenu();
                    boolean z14 = aVar.f174796c;
                    if (z14) {
                        if (!((androidx.appcompat.app.e) tVar2.getValue()).isShowing()) {
                            ((androidx.appcompat.app.e) tVar2.getValue()).show();
                        }
                    } else {
                        if (z14) {
                            u0.r();
                            return null;
                        }
                        if (((androidx.appcompat.app.e) tVar2.getValue()).isShowing()) {
                            ((androidx.appcompat.app.e) tVar2.getValue()).dismiss();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f174767b = nVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f174767b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f174766a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    n nVar = this.f174767b;
                    p2 p2Var = nVar.u6().f174793d;
                    C3253a c3253a = new C3253a(nVar);
                    this.f174766a = 1;
                    if (p2Var.collect(c3253a, this) == aVar) {
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

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174764a;
            if (i14 == 0) {
                o13.r.b(obj);
                n nVar = n.this;
                n0 viewLifecycleOwner = nVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(nVar, null);
                this.f174764a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.UpdateCustomPastActivitiesPrivacyFragment$onViewCreated$5", f = "UpdateCustomPastActivitiesPrivacyFragment.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174769a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.UpdateCustomPastActivitiesPrivacyFragment$onViewCreated$5$1", f = "UpdateCustomPastActivitiesPrivacyFragment.kt", l = {140}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f174771a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f174772b;

            /* JADX INFO: renamed from: v12.n$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3254a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ n f174773a;

                public C3254a(n nVar) {
                    this.f174773a = nVar;
                }

                /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, o13.l] */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    p.b bVar = (p.b) obj;
                    boolean zG = p005kotlin.jvm.internal.s.g(bVar, p.b.c.f174799a);
                    n nVar = this.f174773a;
                    if (zG) {
                        String string = nVar.getString(R.string.privacy_change_custom_activity_types_confirmation);
                        string.getClass();
                        ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) nVar.f174760d.getValue()).y4(string);
                    } else if (bVar instanceof p.b.a) {
                        g22.e.a(nVar, ((p.b.a) bVar).f174797a);
                    } else if (p005kotlin.jvm.internal.s.g(bVar, p.b.d.f174800a)) {
                        Context contextRequireContext = nVar.requireContext();
                        contextRequireContext.getClass();
                        v12.b.c(contextRequireContext, new v10.a(1), new v10.a(2)).show();
                    } else {
                        if (!p005kotlin.jvm.internal.s.g(bVar, p.b.C3255b.f174798a)) {
                            u0.r();
                            return null;
                        }
                        nVar.getParentFragmentManager().Z();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f174772b = nVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f174772b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to v12.n$c$a for r4v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r4.f174771a
                    r2 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r2) goto L10
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r5)
                Le:
                    r5 = 0
                    return r5
                L10:
                    o13.r.b(r5)
                    goto L33
                L14:
                    o13.r.b(r5)
                    v12.n r5 = r4.f174772b
                    v12.p r1 = r5.u6()
                    r53.e2 r1 = r1.f174792c
                    r53.a2 r1 = r53.s.c(r1)
                    v12.n$c$a$a r3 = new v12.n$c$a$a
                    r3.<init>(r5)
                    r4.f174771a = r2
                    r53.d2<T> r5 = r1.f150526a
                    java.lang.Object r5 = r5.collect(r3, r4)
                    if (r5 != r0) goto L33
                    return r0
                L33:
                    o2.c.f()
                    goto Le
                */
                throw new UnsupportedOperationException("Method not decompiled: v12.n.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174769a;
            if (i14 == 0) {
                o13.r.b(obj);
                n nVar = n.this;
                n0 viewLifecycleOwner = nVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(nVar, null);
                this.f174769a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v12/n$d", "Lb/s;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            p pVarU6 = n.this.u6();
            pVarU6.getClass();
            ge1.b.T(v1.a(pVarU6), null, null, new q(pVarU6, null), 3);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f174775a;

        public e(Fragment fragment) {
            this.f174775a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f174775a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f174776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f174777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f174778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f174779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f174780e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f174776a = fragment;
            this.f174777b = qualifier;
            this.f174778c = aVar;
            this.f174779d = aVar2;
            this.f174780e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f174778c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f174776a;
            e23.a aVar = this.f174779d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.class), f189591b, null, defaultViewModelCreationExtras, this.f174777b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f174780e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f174781a;

        public g(Fragment fragment) {
            this.f174781a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f174781a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f174782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f174783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f174784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f174785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f174786e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f174782a = fragment;
            this.f174783b = qualifier;
            this.f174784c = aVar;
            this.f174785d = aVar2;
            this.f174786e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, v12.p] */
        @Override // e23.a
        public final p invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f174784c.invoke()).getF189591b();
            Fragment fragment = this.f174782a;
            e23.a aVar = this.f174785d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(p.class), f189591b, null, defaultViewModelCreationExtras, this.f174783b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f174786e, 4, null);
        }
    }

    public n() {
        super(R.layout.gcm3_recycler_view_layout);
        this.f174758b = new u12.f();
        final int i14 = 0;
        this.f174759c = o13.m.b(new e23.a(this) { // from class: v12.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f174754b;

            {
                this.f174754b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        Bundle bundleRequireArguments = this.f174754b.requireArguments();
                        Parcelable parcelable = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("GCM_extra_screen_access_role") : null;
                            parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                        } else if (bundleRequireArguments != null) {
                            parcelable = (Parcelable) bundleRequireArguments.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                        }
                        hl.a aVar = (hl.a) parcelable;
                        return aVar == null ? hl.a.c.f84256b : aVar;
                    case 1:
                        hl.a aVar2 = (hl.a) this.f174754b.f174759c.getValue();
                        hl.a.b bVar = aVar2 instanceof hl.a.b ? (hl.a.b) aVar2 : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                    case 2:
                        n nVar = this.f174754b;
                        return ParametersHolderKt.parametersOf(((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) nVar.f174760d.getValue()).f47156j, (hl.a) nVar.f174759c.getValue());
                    default:
                        final n nVar2 = this.f174754b;
                        final int i15 = 0;
                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(nVar2.requireContext()).setTitle(R.string.privacy_past_activities_dialog_title).setMessage(R.string.privacy_past_activities_dialog_message).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: v12.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i16) {
                                switch (i15) {
                                    case 0:
                                        p pVarU6 = nVar2.u6();
                                        List<ip.a> list = ((p.a) pVarU6.f174791b.getValue()).f174794a;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : list) {
                                            if (((ip.a) obj).f94640b != null) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ge1.b.T(v1.a(pVarU6), null, null, new s(pVarU6, arrayList, null), 3);
                                        }
                                        break;
                                    default:
                                        p pVarU7 = nVar2.u6();
                                        pVarU7.getClass();
                                        ge1.b.T(v1.a(pVarU7), null, null, new r(pVarU7, null), 3);
                                        break;
                                }
                            }
                        });
                        final int i16 = 1;
                        androidx.appcompat.app.e eVarCreate = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: v12.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                switch (i16) {
                                    case 0:
                                        p pVarU6 = nVar2.u6();
                                        List<ip.a> list = ((p.a) pVarU6.f174791b.getValue()).f174794a;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : list) {
                                            if (((ip.a) obj).f94640b != null) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ge1.b.T(v1.a(pVarU6), null, null, new s(pVarU6, arrayList, null), 3);
                                        }
                                        break;
                                    default:
                                        p pVarU7 = nVar2.u6();
                                        pVarU7.getClass();
                                        ge1.b.T(v1.a(pVarU7), null, null, new r(pVarU7, null), 3);
                                        break;
                                }
                            }
                        }).create();
                        eVarCreate.getClass();
                        return eVarCreate;
                }
            }
        });
        final int i15 = 1;
        o13.m.b(new e23.a(this) { // from class: v12.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f174754b;

            {
                this.f174754b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        Bundle bundleRequireArguments = this.f174754b.requireArguments();
                        Parcelable parcelable = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("GCM_extra_screen_access_role") : null;
                            parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                        } else if (bundleRequireArguments != null) {
                            parcelable = (Parcelable) bundleRequireArguments.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                        }
                        hl.a aVar = (hl.a) parcelable;
                        return aVar == null ? hl.a.c.f84256b : aVar;
                    case 1:
                        hl.a aVar2 = (hl.a) this.f174754b.f174759c.getValue();
                        hl.a.b bVar = aVar2 instanceof hl.a.b ? (hl.a.b) aVar2 : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                    case 2:
                        n nVar = this.f174754b;
                        return ParametersHolderKt.parametersOf(((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) nVar.f174760d.getValue()).f47156j, (hl.a) nVar.f174759c.getValue());
                    default:
                        final n nVar2 = this.f174754b;
                        final int i16 = 0;
                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(nVar2.requireContext()).setTitle(R.string.privacy_past_activities_dialog_title).setMessage(R.string.privacy_past_activities_dialog_message).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: v12.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                switch (i16) {
                                    case 0:
                                        p pVarU6 = nVar2.u6();
                                        List<ip.a> list = ((p.a) pVarU6.f174791b.getValue()).f174794a;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : list) {
                                            if (((ip.a) obj).f94640b != null) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ge1.b.T(v1.a(pVarU6), null, null, new s(pVarU6, arrayList, null), 3);
                                        }
                                        break;
                                    default:
                                        p pVarU7 = nVar2.u6();
                                        pVarU7.getClass();
                                        ge1.b.T(v1.a(pVarU7), null, null, new r(pVarU7, null), 3);
                                        break;
                                }
                            }
                        });
                        final int i17 = 1;
                        androidx.appcompat.app.e eVarCreate = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: v12.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i18) {
                                switch (i17) {
                                    case 0:
                                        p pVarU6 = nVar2.u6();
                                        List<ip.a> list = ((p.a) pVarU6.f174791b.getValue()).f174794a;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : list) {
                                            if (((ip.a) obj).f94640b != null) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ge1.b.T(v1.a(pVarU6), null, null, new s(pVarU6, arrayList, null), 3);
                                        }
                                        break;
                                    default:
                                        p pVarU7 = nVar2.u6();
                                        pVarU7.getClass();
                                        ge1.b.T(v1.a(pVarU7), null, null, new r(pVarU7, null), 3);
                                        break;
                                }
                            }
                        }).create();
                        eVarCreate.getClass();
                        return eVarCreate;
                }
            }
        });
        e eVar = new e(this);
        o13.n nVar = o13.n.NONE;
        this.f174760d = o13.m.a(nVar, new f(this, null, eVar, null, null));
        final int i16 = 2;
        this.f174761e = o13.m.a(nVar, new h(this, null, new g(this), null, new e23.a(this) { // from class: v12.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f174754b;

            {
                this.f174754b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        Bundle bundleRequireArguments = this.f174754b.requireArguments();
                        Parcelable parcelable = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("GCM_extra_screen_access_role") : null;
                            parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                        } else if (bundleRequireArguments != null) {
                            parcelable = (Parcelable) bundleRequireArguments.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                        }
                        hl.a aVar = (hl.a) parcelable;
                        return aVar == null ? hl.a.c.f84256b : aVar;
                    case 1:
                        hl.a aVar2 = (hl.a) this.f174754b.f174759c.getValue();
                        hl.a.b bVar = aVar2 instanceof hl.a.b ? (hl.a.b) aVar2 : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                    case 2:
                        n nVar2 = this.f174754b;
                        return ParametersHolderKt.parametersOf(((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) nVar2.f174760d.getValue()).f47156j, (hl.a) nVar2.f174759c.getValue());
                    default:
                        final n nVar3 = this.f174754b;
                        final int i17 = 0;
                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(nVar3.requireContext()).setTitle(R.string.privacy_past_activities_dialog_title).setMessage(R.string.privacy_past_activities_dialog_message).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: v12.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i18) {
                                switch (i17) {
                                    case 0:
                                        p pVarU6 = nVar3.u6();
                                        List<ip.a> list = ((p.a) pVarU6.f174791b.getValue()).f174794a;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : list) {
                                            if (((ip.a) obj).f94640b != null) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ge1.b.T(v1.a(pVarU6), null, null, new s(pVarU6, arrayList, null), 3);
                                        }
                                        break;
                                    default:
                                        p pVarU7 = nVar3.u6();
                                        pVarU7.getClass();
                                        ge1.b.T(v1.a(pVarU7), null, null, new r(pVarU7, null), 3);
                                        break;
                                }
                            }
                        });
                        final int i18 = 1;
                        androidx.appcompat.app.e eVarCreate = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: v12.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                switch (i18) {
                                    case 0:
                                        p pVarU6 = nVar3.u6();
                                        List<ip.a> list = ((p.a) pVarU6.f174791b.getValue()).f174794a;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : list) {
                                            if (((ip.a) obj).f94640b != null) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ge1.b.T(v1.a(pVarU6), null, null, new s(pVarU6, arrayList, null), 3);
                                        }
                                        break;
                                    default:
                                        p pVarU7 = nVar3.u6();
                                        pVarU7.getClass();
                                        ge1.b.T(v1.a(pVarU7), null, null, new r(pVarU7, null), 3);
                                        break;
                                }
                            }
                        }).create();
                        eVarCreate.getClass();
                        return eVarCreate;
                }
            }
        }));
        final int i17 = 3;
        this.f174762f = o13.m.b(new e23.a(this) { // from class: v12.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f174754b;

            {
                this.f174754b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        Bundle bundleRequireArguments = this.f174754b.requireArguments();
                        Parcelable parcelable = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("GCM_extra_screen_access_role") : null;
                            parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                        } else if (bundleRequireArguments != null) {
                            parcelable = (Parcelable) bundleRequireArguments.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                        }
                        hl.a aVar = (hl.a) parcelable;
                        return aVar == null ? hl.a.c.f84256b : aVar;
                    case 1:
                        hl.a aVar2 = (hl.a) this.f174754b.f174759c.getValue();
                        hl.a.b bVar = aVar2 instanceof hl.a.b ? (hl.a.b) aVar2 : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                    case 2:
                        n nVar2 = this.f174754b;
                        return ParametersHolderKt.parametersOf(((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) nVar2.f174760d.getValue()).f47156j, (hl.a) nVar2.f174759c.getValue());
                    default:
                        final n nVar3 = this.f174754b;
                        final int i18 = 0;
                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(nVar3.requireContext()).setTitle(R.string.privacy_past_activities_dialog_title).setMessage(R.string.privacy_past_activities_dialog_message).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: v12.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                switch (i18) {
                                    case 0:
                                        p pVarU6 = nVar3.u6();
                                        List<ip.a> list = ((p.a) pVarU6.f174791b.getValue()).f174794a;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : list) {
                                            if (((ip.a) obj).f94640b != null) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ge1.b.T(v1.a(pVarU6), null, null, new s(pVarU6, arrayList, null), 3);
                                        }
                                        break;
                                    default:
                                        p pVarU7 = nVar3.u6();
                                        pVarU7.getClass();
                                        ge1.b.T(v1.a(pVarU7), null, null, new r(pVarU7, null), 3);
                                        break;
                                }
                            }
                        });
                        final int i19 = 1;
                        androidx.appcompat.app.e eVarCreate = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: v12.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i110) {
                                switch (i19) {
                                    case 0:
                                        p pVarU6 = nVar3.u6();
                                        List<ip.a> list = ((p.a) pVarU6.f174791b.getValue()).f174794a;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : list) {
                                            if (((ip.a) obj).f94640b != null) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ge1.b.T(v1.a(pVarU6), null, null, new s(pVarU6, arrayList, null), 3);
                                        }
                                        break;
                                    default:
                                        p pVarU7 = nVar3.u6();
                                        pVarU7.getClass();
                                        ge1.b.T(v1.a(pVarU7), null, null, new r(pVarU7, null), 3);
                                        break;
                                }
                            }
                        }).create();
                        eVarCreate.getClass();
                        return eVarCreate;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new a(), androidx.lifecycle.b0.b.RESUMED);
        String string = getString(R.string.lbl_custom);
        string.getClass();
        g22.e.g(this, string);
        RecyclerView recyclerView = (RecyclerView) view2;
        this.f174757a = recyclerView;
        u12.f fVar = this.f174758b;
        recyclerView.setAdapter(fVar);
        RecyclerView recyclerView2 = this.f174757a;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        getParentFragmentManager().n0("userprofile.privacy.past.privacy", getViewLifecycleOwner(), new tr2.b(this, 20));
        uo1.a aVar = new uo1.a(this, 8);
        fVar.getClass();
        fVar.f167776a = aVar;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new b(null), 3);
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner2), null, null, new c(null), 3);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        onBackPressedDispatcher.b(new d(), viewLifecycleOwner3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final p u6() {
        return (p) this.f174761e.getValue();
    }
}
