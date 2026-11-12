package com.garmin.android.apps.connectmobile.userprofile.presentation.privacy;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import b.s;
import c22.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.n;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.x;
import r53.j;
import r53.p2;
import tn2.t;
import u12.o;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f47119i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f47121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.e f47122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f47123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f47124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f47125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f47126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f47127h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/presentation/privacy/a$b", "Lb/s;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.s
        public final void b() {
            nj1.a categoryDetails;
            int i14 = a.f47119i;
            a aVar = a.this;
            nj1.b bVar = (nj1.b) aVar.u6().f47154h.d();
            String categoryAccessRule = (bVar == null || (categoryDetails = bVar.getCategoryDetails()) == null) ? null : categoryDetails.getCategoryAccessRule();
            PrivacyType.Companion companion = PrivacyType.INSTANCE;
            PrivacyType privacyType = PrivacyType.CUSTOM;
            companion.getClass();
            PrivacyType privacyTypeA = PrivacyType.Companion.a(categoryAccessRule, privacyType);
            if (privacyTypeA != privacyType) {
                com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVarU6 = aVar.u6();
                bVarU6.getClass();
                nj1.b bVarD = bVarU6.f47148b.d();
                if (bVarD != null) {
                    bVarD.getCategoryDetails().f(privacyTypeA.getCategoryAccessRule());
                    Iterator<T> it = bVarD.d().iterator();
                    while (it.hasNext()) {
                        ((nj1.d) it.next()).getSubcategoryDetails().d(privacyTypeA.getCategoryAccessRule());
                    }
                }
            }
            aVar.u6().y4(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacyFragment$onViewCreated$4", f = "ActivitiesPrivacyFragment.kt", l = {127}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47129a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacyFragment$onViewCreated$4$1", f = "ActivitiesPrivacyFragment.kt", l = {128}, m = "invokeSuspend", v = 2)
        public static final class C0911a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47131a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f47132b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0912a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a f47133a;

                public C0912a(a aVar) {
                    this.f47133a = aVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.a aVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.a) obj;
                    boolean z14 = aVar.f47160b;
                    a aVar2 = this.f47133a;
                    if (z14) {
                        androidx.appcompat.app.e eVar = aVar2.f47122c;
                        if (eVar == null) {
                            p005kotlin.jvm.internal.s.m("pendingUpdatePastActivitiesRequestDialog");
                            throw null;
                        }
                        if (!eVar.isShowing()) {
                            androidx.appcompat.app.e eVar2 = aVar2.f47122c;
                            if (eVar2 == null) {
                                p005kotlin.jvm.internal.s.m("pendingUpdatePastActivitiesRequestDialog");
                                throw null;
                            }
                            eVar2.show();
                        }
                    } else {
                        androidx.appcompat.app.e eVar3 = aVar2.f47122c;
                        if (eVar3 == null) {
                            p005kotlin.jvm.internal.s.m("pendingUpdatePastActivitiesRequestDialog");
                            throw null;
                        }
                        if (eVar3.isShowing()) {
                            androidx.appcompat.app.e eVar4 = aVar2.f47122c;
                            if (eVar4 == null) {
                                p005kotlin.jvm.internal.s.m("pendingUpdatePastActivitiesRequestDialog");
                                throw null;
                            }
                            eVar4.dismiss();
                        }
                    }
                    if (aVar.f47162d) {
                        g22.e.l(aVar2);
                    } else {
                        g22.e.f(aVar2);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0911a(a aVar, t13.d<? super C0911a> dVar) {
                super(2, dVar);
                this.f47132b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0911a(this.f47132b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0911a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f47131a;
                if (i14 == 0) {
                    r.b(obj);
                    int i15 = a.f47119i;
                    a aVar2 = this.f47132b;
                    p2 p2Var = aVar2.u6().f47157k;
                    C0912a c0912a = new C0912a(aVar2);
                    this.f47131a = 1;
                    if (p2Var.collect(c0912a, this) == aVar) {
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

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47129a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                n0 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                C0911a c0911a = new C0911a(aVar2, null);
                this.f47129a = 1;
                if (h1.b(viewLifecycleOwner, bVar, c0911a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacyFragment$onViewCreated$5", f = "ActivitiesPrivacyFragment.kt", l = {147}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47134a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacyFragment$onViewCreated$5$1", f = "ActivitiesPrivacyFragment.kt", l = {148}, m = "invokeSuspend", v = 2)
        public static final class C0913a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47136a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f47137b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f47138c;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0914a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a f47139a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b0 f47140b;

                public C0914a(a aVar, b0 b0Var) {
                    this.f47139a = aVar;
                    this.f47140b = b0Var;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b abstractC0915b = (com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b) obj;
                    boolean z14 = abstractC0915b instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b.a;
                    a aVar = this.f47139a;
                    if (z14) {
                        g22.e.a(aVar, ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b.a) abstractC0915b).f47163a);
                    } else if (p005kotlin.jvm.internal.s.g(abstractC0915b, com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b.c.f47165a)) {
                        v parentFragmentManager = aVar.getParentFragmentManager();
                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(parentFragmentManager, parentFragmentManager);
                        aVarB.m(R.id.content_frame_layout, v12.v.class, aVar.requireArguments());
                        aVarB.d(null);
                        aVarB.e();
                    } else {
                        if (!(abstractC0915b instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b.C0916b)) {
                            u0.r();
                            return null;
                        }
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.k(a2Var, "ActivitiesPrivacyFragment", "NavigateToEditProfile not handled");
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0913a(a aVar, t13.d<? super C0913a> dVar) {
                super(2, dVar);
                this.f47138c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C0913a c0913a = new C0913a(this.f47138c, dVar);
                c0913a.f47137b = obj;
                return c0913a;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0913a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a$d$a for r6v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r6.f47137b
                    o53.b0 r0 = (o53.b0) r0
                    u13.a r1 = u13.a.COROUTINE_SUSPENDED
                    int r2 = r6.f47136a
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L18
                    if (r2 == r4) goto L14
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r7)
                    return r3
                L14:
                    o13.r.b(r7)
                    goto L37
                L18:
                    o13.r.b(r7)
                    int r7 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a r7 = r6.f47138c
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b r2 = r7.u6()
                    r53.a2 r2 = r2.f47153g
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a$d$a$a r5 = new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a$d$a$a
                    r5.<init>(r7, r0)
                    r6.f47137b = r3
                    r6.f47136a = r4
                    r53.d2<T> r7 = r2.f150526a
                    java.lang.Object r7 = r7.collect(r5, r6)
                    if (r7 != r1) goto L37
                    return r1
                L37:
                    o2.c.f()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.d.C0913a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47134a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                n0 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                C0913a c0913a = new C0913a(aVar2, null);
                this.f47134a = 1;
                if (h1.b(viewLifecycleOwner, bVar, c0913a, this) == aVar) {
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
    public static final class e implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f47141a;

        public e(Fragment fragment) {
            this.f47141a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f47141a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f47142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f47143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f47144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f47145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f47146e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f47142a = fragment;
            this.f47143b = qualifier;
            this.f47144c = aVar;
            this.f47145d = aVar2;
            this.f47146e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f47144c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f47142a;
            e23.a aVar = this.f47145d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.class), f189591b, null, defaultViewModelCreationExtras, this.f47143b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f47146e, 4, null);
        }
    }

    static {
        new C0910a(null);
    }

    public a() {
        super(R.layout.gcm_fragment_activities_privacy);
        this.f47120a = o13.m.a(n.NONE, new f(this, null, new e(this), null, null));
        this.f47121b = new o();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        final int i14 = 0;
        final int i15 = 1;
        this.f47122c = v12.b.c(contextRequireContext, new e23.a(this) { // from class: u12.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a f167770b;

            {
                this.f167770b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i14;
                com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a aVar = this.f167770b;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                        com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVarU6 = aVar.u6();
                        bVarU6.getClass();
                        ge1.b.T(v1.a(bVarU6), null, null, new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.d(bVarU6, null), 3);
                        break;
                    default:
                        int i18 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                        com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVarU7 = aVar.u6();
                        bVarU7.getClass();
                        ge1.b.T(v1.a(bVarU7), null, null, new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.d(bVarU7, null), 3);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new e23.a(this) { // from class: u12.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a f167770b;

            {
                this.f167770b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a aVar = this.f167770b;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                        com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVarU6 = aVar.u6();
                        bVarU6.getClass();
                        ge1.b.T(v1.a(bVarU6), null, null, new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.d(bVarU6, null), 3);
                        break;
                    default:
                        int i18 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                        com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVarU7 = aVar.u6();
                        bVarU7.getClass();
                        ge1.b.T(v1.a(bVarU7), null, null, new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.d(bVarU7, null), 3);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().b(new b(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Object obj;
        List<? extends PrivacyType> listK;
        nj1.a categoryDetails;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        a7.e eVarRequireActivity = requireActivity();
        String categoryAccessRule = null;
        d3 d3Var = eVarRequireActivity instanceof d3 ? (d3) eVarRequireActivity : null;
        if (d3Var != null) {
            d3Var.updateActionBarTitle(getString(R.string.concept_activities));
        }
        View viewFindViewById = view2.findViewById(R.id.editLevels);
        viewFindViewById.getClass();
        this.f47124e = viewFindViewById;
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: u12.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a f167768b;

            {
                this.f167768b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a aVar = this.f167768b;
                switch (i15) {
                    case 0:
                        int i16 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                        v parentFragmentManager = aVar.getParentFragmentManager();
                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(parentFragmentManager, parentFragmentManager);
                        aVarB.m(R.id.content_frame_layout, h.class, aVar.requireArguments());
                        aVarB.d(null);
                        aVarB.e();
                        break;
                    default:
                        int i17 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                        com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVarU6 = aVar.u6();
                        bVarU6.getClass();
                        ge1.b.T(v1.a(bVarU6), null, null, new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.c(bVarU6, null), 3);
                        break;
                }
            }
        });
        boolean zC = ((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("past_activity_privacy_update_enabled");
        View viewFindViewById2 = view2.findViewById(R.id.privacyLevelDescription);
        viewFindViewById2.getClass();
        this.f47123d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.pastActivitiesHeader);
        viewFindViewById3.getClass();
        this.f47125f = viewFindViewById3;
        viewFindViewById3.setVisibility(zC ? 0 : 8);
        View viewFindViewById4 = view2.findViewById(R.id.updatePastActivitiesInfo);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f47127h = textView;
        textView.setVisibility(zC ? 0 : 8);
        View viewFindViewById5 = view2.findViewById(R.id.updatePastActivities);
        viewFindViewById5.getClass();
        this.f47126g = viewFindViewById5;
        viewFindViewById5.setVisibility(zC ? 0 : 8);
        View view3 = this.f47126g;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("updatePastActivitiesButton");
            throw null;
        }
        final int i15 = 1;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: u12.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a f167768b;

            {
                this.f167768b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a aVar = this.f167768b;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                        v parentFragmentManager = aVar.getParentFragmentManager();
                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(parentFragmentManager, parentFragmentManager);
                        aVarB.m(R.id.content_frame_layout, h.class, aVar.requireArguments());
                        aVarB.d(null);
                        aVarB.e();
                        break;
                    default:
                        int i18 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                        com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVarU6 = aVar.u6();
                        bVarU6.getClass();
                        ge1.b.T(v1.a(bVarU6), null, null, new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.c(bVarU6, null), 3);
                        break;
                }
            }
        });
        Bundle bundleRequireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = bundleRequireArguments != null ? (Parcelable) bundleRequireArguments.getParcelable("GCM_extra_screen_access_role", hl.a.class) : null;
        } else {
            Parcelable parcelable = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("GCM_extra_screen_access_role") : null;
            if (!(parcelable instanceof hl.a)) {
                parcelable = null;
            }
            obj = (hl.a) parcelable;
        }
        Object obj2 = (hl.a) obj;
        if (obj2 == null) {
            obj2 = hl.a.c.f84256b;
        }
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.privacyOptionsRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        o oVar = this.f47121b;
        recyclerView.setAdapter(oVar);
        obj2.getClass();
        boolean z14 = obj2 instanceof hl.a.b;
        if (z14) {
            PrivacyType.INSTANCE.getClass();
            listK = x.k(PrivacyType.ONLY_ME, PrivacyType.CUSTOM);
        } else if (!obj2.equals(hl.a.c.f84256b)) {
            u0.r();
            return;
        } else {
            PrivacyType.INSTANCE.getClass();
            listK = x.k(PrivacyType.ONLY_ME, PrivacyType.MY_CONNECTIONS, PrivacyType.MY_GROUPS_AND_CONNECTIONS, PrivacyType.EVERYONE, PrivacyType.CUSTOM);
        }
        oVar.r(listK);
        oVar.f167809e = new t(this, 20);
        if (obj2.equals(hl.a.c.f84256b)) {
            TextView textView2 = this.f47123d;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("editPrivacyDescription");
                throw null;
            }
            textView2.setText(getString(R.string.privacy_activities_description));
            TextView textView3 = this.f47127h;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("updatePastActivitiesFooter");
                throw null;
            }
            textView3.setText(getString(R.string.privacy_summary_update_past_activities));
        } else {
            if (!z14) {
                u0.r();
                return;
            }
            TextView textView4 = this.f47123d;
            if (textView4 == null) {
                p005kotlin.jvm.internal.s.m("editPrivacyDescription");
                throw null;
            }
            textView4.setText("_Select a privacy level for all new activities. You can change the privacy on any individual activity later on by editing the activity. Your shared activity may include heart rate and activity location.");
            TextView textView5 = this.f47127h;
            if (textView5 == null) {
                p005kotlin.jvm.internal.s.m("updatePastActivitiesFooter");
                throw null;
            }
            textView5.setText("_Choose the privacy level of past activities.");
        }
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new c(null), 3);
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner2), null, null, new d(null), 3);
        PrivacyType.Companion companion = PrivacyType.INSTANCE;
        nj1.b bVar = (nj1.b) u6().f47154h.d();
        if (bVar != null && (categoryDetails = bVar.getCategoryDetails()) != null) {
            categoryAccessRule = categoryDetails.getCategoryAccessRule();
        }
        v6(PrivacyType.Companion.b(companion, categoryAccessRule));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b u6() {
        return (com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) this.f47120a.getValue();
    }

    public final void v6(PrivacyType privacyType) {
        PrivacyType privacyType2 = this.f47121b.f167808d;
        PrivacyType privacyType3 = PrivacyType.CUSTOM;
        if (privacyType2 != privacyType3 || privacyType == privacyType3) {
            w6(privacyType);
            return;
        }
        String string = getString(R.string.privacy_remove_custom_levels_question);
        string.getClass();
        String string2 = getString(R.string.privacy_msg_remove_custom_levels, getString(privacyType.getF28797a()));
        string2.getClass();
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireContext()).create();
        eVarCreate.getClass();
        eVarCreate.setCancelable(false);
        eVarCreate.setCanceledOnTouchOutside(false);
        eVarCreate.setTitle(string);
        eVarCreate.h(string2);
        eVarCreate.g(-1, getString(R.string.lbl_common_continue), new pk1.t(14, this, privacyType));
        eVarCreate.g(-2, getString(R.string.lbl_cancel), new ty1.o(10));
        eVarCreate.show();
    }

    public final void w6(PrivacyType privacyType) {
        o oVar = this.f47121b;
        oVar.f167808d = privacyType;
        oVar.notifyDataSetChanged();
        View view2 = this.f47124e;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("editPrivacyLevels");
            throw null;
        }
        view2.setVisibility(privacyType == PrivacyType.CUSTOM ? 0 : 8);
        com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVarU6 = u6();
        bVarU6.getClass();
        privacyType.getClass();
        nj1.b bVarD = bVarU6.f47148b.d();
        if (bVarD != null) {
            bVarD.getCategoryDetails().f(privacyType.getCategoryAccessRule());
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0910a {
        public /* synthetic */ C0910a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0910a() {
        }
    }
}
