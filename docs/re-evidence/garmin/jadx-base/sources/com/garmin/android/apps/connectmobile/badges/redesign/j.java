package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
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
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d0;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import fw.p;
import o13.m;
import o13.n;
import o53.c2;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r22.i0;
import uu.q;
import uu.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/j;", "Lcom/garmin/android/apps/connectmobile/d0;", "Lvu/a;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends d0 implements vu.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f30502r = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f30503m = m.a(n.NONE, new h(this, null, new g(this), null, null));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GridLayoutManager f30504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f30505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f30506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public vu.e f30507q;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30508a;

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
            f30508a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/badges/redesign/j$c", "Lr22/i0;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends i0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j f30509f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.p pVar, int i14, j jVar) {
            super(pVar, i14);
            this.f30509f = jVar;
        }

        @Override // r22.i0
        public final void a(int i14) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.BADGES, "EarnedBadgesFragment", "onLoadComplete: total number = " + i14);
            this.f30509f.T6(false);
        }

        @Override // r22.i0
        public final void b(int i14, int i15) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.BADGES, "EarnedBadgesFragment", "onLoadMore: start = " + i14 + ", limit = " + i15);
            a aVar2 = j.f30502r;
            this.f30509f.d7(i14, i15);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/badges/redesign/j$d", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends GridLayoutManager.c {
        public d() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i14) {
            j jVar = j.this;
            i iVar = jVar.f30505o;
            iVar.getClass();
            int itemViewType = iVar.f15668a.getItemViewType(i14);
            i iVar2 = jVar.f30505o;
            iVar2.getClass();
            z12.k kVar = iVar2.f33125b;
            return itemViewType == kVar.f().f15668a.i(kVar, 0) ? 3 : 1;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/badges/redesign/j$e", "Landroidx/core/view/s;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements s {
        public e() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.badges_menu, menu);
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            MenuItem menuItemFindItem = menu.findItem(R.id.filter);
            Context contextRequireContext = j.this.requireContext();
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
            j jVar = j.this;
            if (jVar.getActivity() == null || (eVar = jVar.f30507q) == null) {
                return true;
            }
            eVar.N1();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30512a;

        public f(e23.l lVar) {
            lVar.getClass();
            this.f30512a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30512a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30512a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30513a;

        public g(Fragment fragment) {
            this.f30513a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f30513a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30518e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30514a = fragment;
            this.f30515b = qualifier;
            this.f30516c = aVar;
            this.f30517d = aVar2;
            this.f30518e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, uu.q] */
        @Override // e23.a
        public final q invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30516c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30514a;
            e23.a aVar = this.f30517d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(q.class), f189591b, null, defaultViewModelCreationExtras, this.f30515b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30518e, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        V6();
        i0 i0Var = this.f33123k;
        d7(i0Var.f149677b, i0Var.f149678c);
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final d0.a I6() {
        i iVar = new i();
        this.f30505o = iVar;
        return iVar;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final i0 J6(RecyclerView.p pVar, int i14) {
        pVar.getClass();
        return new c(pVar, i14, this);
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final RecyclerView.p K6() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.f30504n = gridLayoutManager;
        return gridLayoutManager;
    }

    @Override // vu.a
    public final void L4() {
        this.f30506p = false;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final CharSequence M6() {
        vu.e eVar = this.f30507q;
        vu.b bVarO = eVar != null ? eVar.getF30341i() : null;
        if (bVarO == null || bVarO.b()) {
            String string = getString(R.string.social_msg_no_earned_badges);
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
        if (this.f30506p) {
            this.f33123k.f149679d = false;
        } else {
            super.M7();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final int S6() {
        return 18;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final void U6() {
        super.U6();
        GridLayoutManager gridLayoutManager = this.f30504n;
        gridLayoutManager.getClass();
        gridLayoutManager.f10247g = new d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final void d7(int i14, int i15) {
        vu.b bVarO;
        vu.b bVarO2;
        ?? r14 = this.f30503m;
        c2 c2Var = ((q) r14.getValue()).f172746k;
        if (c2Var == null || !c2Var.isActive()) {
            q qVar = (q) r14.getValue();
            vu.e eVar = this.f30507q;
            com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr = (eVar == null || (bVarO2 = eVar.getF30341i()) == null) ? null : bVarO2.f180213b;
            vu.e eVar2 = this.f30507q;
            com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr = (eVar2 == null || (bVarO = eVar2.getF30341i()) == null) ? null : bVarO.f180212a;
            qVar.getClass();
            y0 y0Var = new y0();
            w9.a aVarA = v1.a(qVar);
            x53.c cVar = o53.s0.f129406a;
            qVar.f172746k = ge1.b.T(aVarA, x53.b.f189152a, null, new x(y0Var, qVar, bVarArr, dVarArr, i14, i15, null), 2);
            y0Var.f(this, new f(new uo1.a(this, 5)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f30507q = (vu.e) context;
    }

    @Override // com.garmin.android.apps.connectmobile.d0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new e(), b0.b.RESUMED);
        F6(false);
        M7();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "BADGE_SPAN_COUNT", "I", "BADGE_PAGE_SIZE", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
