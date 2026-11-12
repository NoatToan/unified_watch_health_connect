package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import c80.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d0;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import fw.p;
import java.util.ArrayList;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import o53.c2;
import o53.f0;
import o53.s0;
import o53.t1;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import r22.i0;
import tr2.y;
import u53.o;
import zd0.j1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/a;", "Lcom/garmin/android/apps/connectmobile/d0;", "Lvu/a;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends d0 implements vu.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0476a f30373x = new C0476a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public uu.a f30375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public vu.e f30377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f30378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f30379r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f.c<Intent> f30381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final iz1.g f30382w;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f30374m = m.a(n.NONE, new i(this, null, new h(this), null, null));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j1 f30380t = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30383a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30383a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.AvailableBadgesFragment$badgeDetailLauncher$1$1", f = "AvailableBadgesFragment.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30384a;

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
            ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.m> arrayList;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30384a;
            a aVar2 = a.this;
            if (i14 == 0) {
                r.b(obj);
                j1 j1Var = aVar2.f30380t;
                q qVar = q.SOCIAL;
                this.f30384a = 1;
                obj = j1Var.l(qVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue != aVar2.f30379r) {
                aVar2.f30379r = zBooleanValue;
                uu.a aVar3 = aVar2.f30375n;
                if (aVar3 != null) {
                    uu.a.b bVar = aVar3.f172631d;
                    bVar.f172647d = zBooleanValue;
                    uu.a aVar4 = bVar.f172646c;
                    if (aVar4 != null && (arrayList = aVar4.f172630c) != null) {
                        int i15 = 0;
                        for (com.garmin.android.apps.connectmobile.badges.service.model.m mVar : arrayList) {
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                x.q();
                                throw null;
                            }
                            if (mVar.o0()) {
                                bVar.f().r(bVar, i16);
                            }
                            i15 = i16;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
        public d(Object obj) {
            super(1, obj, a.class, "startBadgeDetails", "startBadgeDetails(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = (a) this.receiver;
            f.c<Intent> cVar = aVar.f30381v;
            BadgeDetailsActivity.a aVar2 = BadgeDetailsActivity.f30322l;
            Context contextRequireContext = aVar.requireContext();
            aVar2.getClass();
            cVar.a(BadgeDetailsActivity.a.a(iIntValue, contextRequireContext), null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/badges/redesign/a$e", "Lr22/i0;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends i0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f30386f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RecyclerView.p pVar, int i14, a aVar) {
            super(pVar, i14);
            this.f30386f = aVar;
        }

        @Override // r22.i0
        public final void a(int i14) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.BADGES, "AvailableBadgesFragment", "onLoadComplete: total number = " + i14);
            this.f30386f.T6(false);
        }

        @Override // r22.i0
        public final void b(int i14, int i15) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.BADGES, "AvailableBadgesFragment", "onLoadMore: start = " + i14 + ", limit = " + i15);
            a.d7(this.f30386f, i14, i15);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.AvailableBadgesFragment$onRefreshed$1", f = "AvailableBadgesFragment.kt", l = {161, 163}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30387a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.redesign.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.AvailableBadgesFragment$onRefreshed$1$1", f = "AvailableBadgesFragment.kt", l = {165}, m = "invokeSuspend", v = 2)
        public static final class C0477a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f30389a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public uu.a f30390b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f30391c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f30392d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f30393e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0477a(a aVar, t13.d<? super C0477a> dVar) {
                super(2, dVar);
                this.f30393e = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0477a(this.f30393e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0477a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                uu.a aVar;
                a aVar2;
                a aVar3;
                u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f30392d;
                if (i14 == 0) {
                    r.b(obj);
                    a aVar5 = this.f30393e;
                    aVar = aVar5.f30375n;
                    if (aVar != null) {
                        j1 j1Var = aVar5.f30380t;
                        q qVar = q.SOCIAL;
                        this.f30389a = aVar5;
                        this.f30390b = aVar;
                        this.f30391c = aVar5;
                        this.f30392d = 1;
                        Object objL = j1Var.l(qVar, this);
                        if (objL == aVar4) {
                            return aVar4;
                        }
                        aVar2 = aVar5;
                        obj = objL;
                        aVar3 = aVar2;
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = this.f30391c;
                aVar = this.f30390b;
                aVar3 = this.f30389a;
                r.b(obj);
                aVar2.f30379r = ((Boolean) obj).booleanValue();
                aVar.f172631d.f172647d = aVar3.f30379r;
                aVar.clear();
                i0 i0Var = aVar3.f33123k;
                a.d7(aVar3, i0Var.f149677b, i0Var.f149678c);
                return Unit.INSTANCE;
            }
        }

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (ge1.b.e0(r7, r1, r6) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30387a;
            a aVar2 = a.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            j1 j1Var = aVar2.f30380t;
            q qVar = q.SOCIAL;
            this.f30387a = 1;
            obj = j1Var.j(qVar, this);
            if (obj != aVar) {
            }
            return aVar;
            aVar2.f30378q = !(((c80.p) obj) instanceof c80.p.c);
            x53.c cVar = s0.f129406a;
            t1 t1Var = o.f168762a;
            C0477a c0477a = new C0477a(aVar2, null);
            this.f30387a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/badges/redesign/a$g", "Landroidx/core/view/s;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements s {
        public g() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.badges_menu, menu);
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            MenuItem menuItemFindItem = menu.findItem(R.id.filter);
            Context contextRequireContext = a.this.requireContext();
            contextRequireContext.getClass();
            oc.b.G(menuItemFindItem, contextRequireContext, R.color.gcm_icon_primary);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            vu.e eVar;
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.filter) {
                return false;
            }
            a aVar = a.this;
            if (aVar.getActivity() == null || (eVar = aVar.f30377p) == null) {
                return true;
            }
            eVar.N1();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30395a;

        public h(Fragment fragment) {
            this.f30395a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f30395a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<uu.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30400e;

        public i(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30396a = fragment;
            this.f30397b = qualifier;
            this.f30398c = aVar;
            this.f30399d = aVar2;
            this.f30400e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, uu.q] */
        @Override // e23.a
        public final uu.q invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30398c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30396a;
            e23.a aVar = this.f30399d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(uu.q.class), f189591b, null, defaultViewModelCreationExtras, this.f30397b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30400e, 4, null);
        }
    }

    public a() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new y(this, 4));
        cVarRegisterForActivityResult.getClass();
        this.f30381v = cVarRegisterForActivityResult;
        this.f30382w = new iz1.g(this, 23);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, o13.l] */
    public static final void d7(a aVar, int i14, int i15) {
        com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr;
        com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr;
        c2 c2Var = ((uu.q) aVar.f30374m.getValue()).f172747l;
        if (c2Var == null || !c2Var.isActive()) {
            vu.e eVar = aVar.f30377p;
            vu.b bVarO = eVar != null ? eVar.getF30341i() : null;
            if (bVarO != null) {
                com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr2 = bVarO.f180213b;
                dVarArr = bVarO.f180212a;
                bVarArr = bVarArr2;
            } else {
                bVarArr = null;
                dVarArr = null;
            }
            uu.q qVar = (uu.q) aVar.f30374m.getValue();
            boolean z14 = aVar.f30378q;
            qVar.getClass();
            y0 y0Var = new y0();
            w9.a aVarA = v1.a(qVar);
            x53.c cVar = s0.f129406a;
            qVar.f172747l = ge1.b.T(aVarA, x53.b.f189152a, null, new uu.s(y0Var, qVar, bVarArr, dVarArr, i14, i15, z14, null), 2);
            y0Var.f(aVar.getViewLifecycleOwner(), aVar.f30382w);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        androidx.lifecycle.i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new f(null), 2);
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final d0.a I6() {
        uu.a aVar = new uu.a(new d(this));
        this.f30375n = aVar;
        return aVar;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final i0 J6(RecyclerView.p pVar, int i14) {
        pVar.getClass();
        return new e(pVar, i14, this);
    }

    @Override // vu.a
    public final void L4() {
        this.f30376o = false;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final CharSequence M6() {
        vu.e eVar = this.f30377p;
        vu.b bVarO = eVar != null ? eVar.getF30341i() : null;
        if (bVarO == null || bVarO.b()) {
            String string = getString(R.string.social_msg_no_available_badges);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.common_no_results_lbl);
        string2.getClass();
        String string3 = getString(R.string.common_adjust_filters_msg);
        string3.getClass();
        String string4 = getString(R.string.string_empty_line_string_pattern, string2, string3);
        string4.getClass();
        SpannableString spannableString = new SpannableString(string4);
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.andfont_body_1)), w.H(string4, string2, 0, false, 6), string2.length(), 33);
        return spannableString;
    }

    @Override // com.garmin.android.apps.connectmobile.d0, com.garmin.android.apps.connectmobile.m0, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void M7() {
        if (this.f30376o) {
            this.f33123k.f149679d = false;
        } else {
            super.M7();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        M7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f30377p = (vu.e) context;
    }

    @Override // com.garmin.android.apps.connectmobile.d0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new g(), androidx.lifecycle.b0.b.RESUMED);
        F6(false);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.redesign.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0476a {
        public /* synthetic */ C0476a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0476a() {
        }
    }
}
