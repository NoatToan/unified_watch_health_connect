package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.q1;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.Iterator;
import java.util.List;
import mt0.l1;
import mt0.m1;
import mt0.n1;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.i3;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/s;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends Fragment {
    public static final a F = new a(null);
    public static final d53.k I = new d53.k("<a>(.*)</a>");
    public final f.c<Intent> E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37842a = o13.m.a(o13.n.NONE, new g(this, null, new f(this), null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f37843b = new w1(p005kotlin.jvm.internal.s0.f105811a.b(i3.class), new h(this), new mh1.q(11), new i(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bv.d f37844c = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f37845d = o13.m.b(new m1(this, 3));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f37846e = o13.m.b(new m1(this, 10));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f37847f = o13.m.b(new m1(this, 11));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f37848g = o13.m.b(new m1(this, 12));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f37849h = o13.m.b(new m1(this, 13));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f37850i = o13.m.b(new m1(this, 14));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o13.t f37851j = o13.m.b(new m1(this, 15));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f37852k = o13.m.b(new m1(this, 16));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o13.t f37853l = o13.m.b(new m1(this, 17));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o13.t f37854m = o13.m.b(new m1(this, 18));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o13.t f37855n = o13.m.b(new m1(this, 19));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o13.t f37856o = o13.m.b(new m1(this, 20));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o13.t f37857p = o13.m.b(new m1(this, 21));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o13.t f37858q = o13.m.b(new m1(this, 22));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o13.t f37859r = o13.m.b(new m1(this, 23));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o13.t f37860t = o13.m.b(new m1(this, 24));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o13.t f37861v = o13.m.b(new m1(this, 0));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o13.t f37862w = o13.m.b(new m1(this, 1));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o13.t f37863x = o13.m.b(new m1(this, 2));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o13.t f37864y = o13.m.b(new m1(this, 4));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o13.t f37865z = o13.m.b(new m1(this, 5));
    public final o13.t A = o13.m.b(new m1(this, 6));
    public final o13.t B = o13.m.b(new m1(this, 7));
    public final o13.t C = o13.m.b(new m1(this, 8));
    public final o13.t D = o13.m.b(new m1(this, 9));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37867b;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37866a = iArr;
            int[] iArr2 = new int[ot0.e.values().length];
            try {
                iArr2[ot0.e.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ot0.e.AUTO_CHALLENGE_DEPENDENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ot0.e.MULTIPLIER_POINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f37867b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsFragment$gcPlusHomeActivityLauncher$1$1", f = "BadgeChallengeDetailsFragment.kt", l = {124}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37868a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsFragment$gcPlusHomeActivityLauncher$1$1$hasGCPlusSocialFeature$1", f = "BadgeChallengeDetailsFragment.kt", l = {124}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f37870a;

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
                int i14 = this.f37870a;
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
                this.f37870a = 1;
                Object objL = j1Var.l(qVar, this);
                return objL == aVar ? aVar : objL;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f37868a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(null);
                this.f37868a = 1;
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
            s.y6(s.this, ((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/s$d", "Landroidx/core/view/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements androidx.core.view.s {
        public d() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.badge_challenges_menu, menu);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            a aVar = s.F;
            g3 g3Var = (g3) s.this.E6().f140757d.d();
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = g3Var != null ? (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b : null;
            boolean z14 = false;
            boolean zC1 = pVar != null ? pVar.c1() : false;
            boolean userJoined = pVar != null ? pVar.getUserJoined() : false;
            menu.findItem(R.id.menu_item_leave_challenge).setVisible(zC1 && (pVar == null || !pVar.L0()));
            menu.findItem(R.id.menu_item_end_adventure).setVisible(zC1 && pVar != null && pVar.L0());
            menu.findItem(R.id.menu_item_challenge_rules).setVisible(userJoined && (pVar == null || !pVar.L0()));
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_expedition_rules);
            if (userJoined && pVar != null && pVar.L0()) {
                z14 = true;
            }
            menuItemFindItem.setVisible(z14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
            menuItem.getClass();
            a aVar = s.F;
            s sVar = s.this;
            g3 g3Var = (g3) sVar.E6().f140757d.d();
            if (g3Var == null || (pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b) == null) {
                return false;
            }
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_item_expedition_rules || itemId == R.id.menu_item_challenge_rules) {
                ChallengeRulesActivity.a aVar2 = ChallengeRulesActivity.f37225j;
                Context contextRequireContext = sVar.requireContext();
                aVar2.getClass();
                if (contextRequireContext != null) {
                    Intent intent = new Intent(contextRequireContext, (Class<?>) ChallengeRulesActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("ad_hoc_challenge_start_date", pVar.getStartDate());
                    bundle.putSerializable("ad_hoc_challenge_end_date", pVar.getEndDate());
                    Integer challengeCategoryId = pVar.getChallengeCategoryId();
                    bundle.putInt("ad_hoc_challenge_activity_type_id", challengeCategoryId != null ? challengeCategoryId.intValue() : 0);
                    bundle.putParcelable("badge_challenge", pVar);
                    intent.putExtras(bundle);
                    contextRequireContext.startActivity(intent);
                }
            } else if (itemId == R.id.menu_item_end_adventure || itemId == R.id.menu_item_leave_challenge) {
                String string = pVar.L0() ? sVar.getString(R.string.social_end_expedition_title) : sVar.getString(R.string.social_badge_challenge_leave_title);
                string.getClass();
                String string2 = pVar.L0() ? sVar.getString(R.string.social_end_expedition_msg) : sVar.getString(R.string.social_challenge_leave_confirm_msg);
                string2.getClass();
                int i14 = pVar.L0() ? R.string.common_end : R.string.lbl_leave;
                q1.b bVar = q1.f41066b;
                hc0.c cVar = new hc0.c(28, sVar, pVar);
                bVar.getClass();
                q1 q1VarC = q1.b.c(string, string2, i14, R.string.lbl_cancel, cVar);
                q1VarC.setCancelable(false);
                androidx.fragment.app.v childFragmentManager = sVar.getChildFragmentManager();
                childFragmentManager.getClass();
                q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                return true;
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37872a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f37872a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37872a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37872a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37873a;

        public f(Fragment fragment) {
            this.f37873a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37873a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<pt0.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37878e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37874a = fragment;
            this.f37875b = qualifier;
            this.f37876c = aVar;
            this.f37877d = aVar2;
            this.f37878e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, pt0.p] */
        @Override // e23.a
        public final pt0.p invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37876c.invoke();
            y1 f185700a = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37874a;
            e23.a aVar = this.f37877d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.p.class), f185700a, null, defaultViewModelCreationExtras, this.f37875b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37878e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37879a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f37879a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37879a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37880a = aVar;
            this.f37881b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37880a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37881b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public s() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 8));
        cVarRegisterForActivityResult.getClass();
        this.E = cVarRegisterForActivityResult;
    }

    public static final TextView u6(s sVar) {
        Object value = sVar.D.getValue();
        value.getClass();
        return (TextView) value;
    }

    public static final LinearProgressIndicator v6(s sVar) {
        Object value = sVar.f37859r.getValue();
        value.getClass();
        return (LinearProgressIndicator) value;
    }

    public static final void w6(s sVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        sVar.getClass();
        if (!p005kotlin.jvm.internal.s.g(pVar.getIsAutoChallengeLink(), Boolean.TRUE)) {
            sVar.F6(pVar);
            return;
        }
        sVar.E6().f140754a.getClass();
        androidx.lifecycle.j jVarN = o53.f0.N(new pt0.w(null));
        androidx.lifecycle.n0 viewLifecycleOwner = sVar.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarN, viewLifecycleOwner, new e(new n1(sVar, pVar)));
    }

    public static final void y6(s sVar, boolean z14) {
        sVar.getClass();
        ge1.b.T(g22.f.b(sVar), null, null, new u(sVar, z14, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z6(s sVar, List list) {
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
        g3 g3Var = (g3) sVar.E6().f140757d.d();
        if (g3Var == null || (pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b) == null) {
            return;
        }
        if (list.isEmpty()) {
            sVar.A6().setVisibility(8);
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(sVar.getContext());
        Context contextRequireContext = sVar.requireContext();
        contextRequireContext.getClass();
        int iC = (int) c22.b.c(contextRequireContext, sVar.getResources().getDimensionPixelSize(R.dimen.icon_xsmall), 1.5f);
        String strM = pVar.M();
        if (strM != null) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.badge_challenge_overview, sVar.A6(), false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.feature_title);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.feature_icon);
            textView.getClass();
            v22.d.c(textView, strM);
            Drawable drawable = a7.b.getDrawable(sVar.requireContext(), R.drawable.star_filled);
            if (drawable != null) {
                Context contextRequireContext2 = sVar.requireContext();
                contextRequireContext2.getClass();
                og2.k.F(R.color.gds_data_viz_yellow_primary, contextRequireContext2, drawable);
            }
            imageView.setImageDrawable(drawable);
            imageView.getLayoutParams().width = iC;
            imageView.getLayoutParams().height = iC;
            sVar.A6().addView(viewInflate);
        }
        if (pVar.Z0()) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.badge_challenge_overview, sVar.A6(), false);
            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.feature_title);
            ImageView imageView2 = (ImageView) viewInflate2.findViewById(R.id.feature_icon);
            textView2.setText(sVar.getString(R.string.badges_lbl_gc_plus_challenge));
            imageView2.setImageDrawable(a7.b.getDrawable(sVar.requireContext(), R.drawable.check));
            imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(sVar.requireContext(), R.color.gcm_icon_secondary)));
            imageView2.getLayoutParams().width = iC;
            imageView2.getLayoutParams().height = iC;
            sVar.A6().addView(viewInflate2);
        }
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.badge_challenge_overview, sVar.A6(), false);
        TextView textView3 = (TextView) viewInflate3.findViewById(R.id.feature_title);
        ImageView imageView3 = (ImageView) viewInflate3.findViewById(R.id.feature_icon);
        com.garmin.android.apps.connectmobile.leaderboard.model.o.a aVar = com.garmin.android.apps.connectmobile.leaderboard.model.o.f38245b;
        com.garmin.android.apps.connectmobile.leaderboard.model.o oVarC = pVar.C();
        aVar.getClass();
        textView3.setText(sVar.getString(com.garmin.android.apps.connectmobile.leaderboard.model.o.a.b(oVarC)));
        imageView3.setImageDrawable(a7.b.getDrawable(sVar.requireContext(), R.drawable.check));
        imageView3.setImageTintList(ColorStateList.valueOf(a7.b.getColor(sVar.requireContext(), R.color.gcm_icon_secondary)));
        imageView3.getLayoutParams().width = iC;
        imageView3.getLayoutParams().height = iC;
        sVar.A6().addView(viewInflate3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ot0.d dVar = (ot0.d) it.next();
            View viewInflate4 = layoutInflaterFrom.inflate(R.layout.badge_challenge_overview, sVar.A6(), false);
            TextView textView4 = (TextView) viewInflate4.findViewById(R.id.feature_title);
            ImageView imageView4 = (ImageView) viewInflate4.findViewById(R.id.feature_icon);
            ot0.e eVar = dVar.f133726a;
            CharSequence charSequence = dVar.f133727b;
            int i14 = b.f37867b[eVar.ordinal()];
            if (i14 == 1) {
                textView4.getClass();
                v22.d.c(textView4, charSequence.toString());
                imageView4.setImageDrawable(a7.b.getDrawable(sVar.requireContext(), R.drawable.check));
                imageView4.setImageTintList(ColorStateList.valueOf(a7.b.getColor(sVar.requireContext(), R.color.gcm_icon_secondary)));
            } else if (i14 == 2) {
                textView4.setText(charSequence);
                textView4.setMovementMethod(LinkMovementMethod.getInstance());
                imageView4.setImageDrawable(a7.b.getDrawable(sVar.requireContext(), R.drawable.check));
                imageView4.setImageTintList(ColorStateList.valueOf(a7.b.getColor(sVar.requireContext(), R.color.gcm_icon_secondary)));
            } else if (i14 != 3) {
                lc.u0.r();
                return;
            } else {
                textView4.getClass();
                v22.d.c(textView4, charSequence.toString());
                imageView4.setImageDrawable(a7.b.getDrawable(sVar.requireContext(), 2131232836));
            }
            imageView4.getLayoutParams().width = iC;
            imageView4.getLayoutParams().height = iC;
            sVar.A6().addView(viewInflate4);
        }
    }

    public final ViewGroup A6() {
        Object value = this.f37853l.getValue();
        value.getClass();
        return (ViewGroup) value;
    }

    public final View C6() {
        return (View) this.f37845d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final pt0.p E6() {
        return (pt0.p) this.f37842a.getValue();
    }

    public final void F6(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        if (pVar.getUuid() == null || pVar.getBadgeId() == null) {
            return;
        }
        i3 i3Var = (i3) this.f37843b.getValue();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        i3Var.x4(contextRequireContext, false, new l1(this, pVar, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.badge_challenge_details_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new d(), androidx.lifecycle.b0.b.RESUMED);
        Object value = this.f37846e.getValue();
        value.getClass();
        ((ViewGroup) value).setVisibility(8);
        requireActivity().invalidateOptionsMenu();
        final int i14 = 0;
        E6().f140757d.f(getViewLifecycleOwner(), new e(new e23.l(this) { // from class: mt0.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120780b;

            {
                this.f120780b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String string2;
                String badgePromotionCode;
                String partnerRewardUrl;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120780b;
                String string3 = null;
                string3 = null;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            g22.e.l(sVar);
                        } else if (i16 == 2) {
                            g22.e.f(sVar);
                            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b;
                            if (pVar != null) {
                                ge1.b.T(g22.f.b(sVar), null, null, new r1(sVar, pVar, null), 3);
                            }
                        } else {
                            if (i16 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(sVar);
                            g22.e.c(sVar);
                            sVar.requireActivity().finish();
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.CHALLENGES, "BadgeChallengeDetailsFragment", "getBadgeChallengeDetails(" + g3Var + ") failed");
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) ((com.garmin.android.apps.connectmobile.y) obj).a();
                        if (g3Var2 != null) {
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[g3Var2.f35300a.ordinal()];
                            if (i17 == 1) {
                                g22.e.l(sVar);
                            } else if (i17 == 2) {
                                g22.e.f(sVar);
                            } else {
                                if (i17 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                g22.e.c(sVar);
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "BadgeChallengeDetailsFragment", "performJoinOperation failed");
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.g3 g3Var3 = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        fw.p pVar2 = g3Var3.f35300a;
                        T t7 = g3Var3.f35301b;
                        int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[pVar2.ordinal()];
                        if (i18 != 1) {
                            if (i18 == 2) {
                                g22.e.f(sVar);
                                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = (com.garmin.android.apps.connectmobile.leaderboard.model.p) t7;
                                if (pVar3 != null && (partnerRewardUrl = pVar3.getPartnerRewardUrl()) != null) {
                                    string3 = d53.w.i0(partnerRewardUrl).toString();
                                }
                                if (string3 != null && (!d53.w.J(string3))) {
                                    if (pVar3 == null || (badgePromotionCode = pVar3.getBadgePromotionCode()) == null || (string2 = d53.w.i0(badgePromotionCode).toString()) == null) {
                                        string2 = "";
                                    }
                                    String strConcat = string3.concat(string2);
                                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                    String strM = am.j.m("GET REWARD open URL[", strConcat, "]");
                                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "BadgeChallengeDetailsFragment", strM);
                                    try {
                                        sVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strConcat)));
                                    } catch (ActivityNotFoundException e4) {
                                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                        com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.CHALLENGES, "BadgeChallengeDetailsFragment", "GET REWARD open URL[" + strConcat + "] ERROR -> " + e4);
                                    }
                                }
                            } else {
                                if (i18 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                g22.e.c(sVar);
                                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                String strF = org.apache.commons.lang3.e.f("badgeChallengeRedeem(", ") failed", t7);
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "BadgeChallengeDetailsFragment", strF);
                            }
                            break;
                        } else {
                            g22.e.l(sVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[((com.garmin.android.apps.connectmobile.g3) obj).f35300a.ordinal()];
                        if (i19 == 1) {
                            g22.e.l(sVar);
                        } else if (i19 == 2) {
                            g22.e.f(sVar);
                            sVar.requireActivity().setResult(-1, sVar.E6().f140764k);
                            sVar.requireActivity().finish();
                        } else {
                            if (i19 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(sVar);
                            g22.e.c(sVar);
                            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                            com.garmin.android.apps.connectmobile.g3 g3Var4 = (com.garmin.android.apps.connectmobile.g3) sVar.E6().f140757d.d();
                            String str = "performLeaveOperation(" + (g3Var4 != null ? (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var4.f35301b : null) + ") failed";
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "BadgeChallengeDetailsFragment", str);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        E6().f140759f.f(getViewLifecycleOwner(), new e(new e23.l(this) { // from class: mt0.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120780b;

            {
                this.f120780b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String string2;
                String badgePromotionCode;
                String partnerRewardUrl;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120780b;
                String string3 = null;
                string3 = null;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            g22.e.l(sVar);
                        } else if (i17 == 2) {
                            g22.e.f(sVar);
                            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b;
                            if (pVar != null) {
                                ge1.b.T(g22.f.b(sVar), null, null, new r1(sVar, pVar, null), 3);
                            }
                        } else {
                            if (i17 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(sVar);
                            g22.e.c(sVar);
                            sVar.requireActivity().finish();
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.CHALLENGES, "BadgeChallengeDetailsFragment", "getBadgeChallengeDetails(" + g3Var + ") failed");
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) ((com.garmin.android.apps.connectmobile.y) obj).a();
                        if (g3Var2 != null) {
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[g3Var2.f35300a.ordinal()];
                            if (i18 == 1) {
                                g22.e.l(sVar);
                            } else if (i18 == 2) {
                                g22.e.f(sVar);
                            } else {
                                if (i18 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                g22.e.c(sVar);
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "BadgeChallengeDetailsFragment", "performJoinOperation failed");
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.g3 g3Var3 = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        fw.p pVar2 = g3Var3.f35300a;
                        T t7 = g3Var3.f35301b;
                        int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[pVar2.ordinal()];
                        if (i19 != 1) {
                            if (i19 == 2) {
                                g22.e.f(sVar);
                                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = (com.garmin.android.apps.connectmobile.leaderboard.model.p) t7;
                                if (pVar3 != null && (partnerRewardUrl = pVar3.getPartnerRewardUrl()) != null) {
                                    string3 = d53.w.i0(partnerRewardUrl).toString();
                                }
                                if (string3 != null && (!d53.w.J(string3))) {
                                    if (pVar3 == null || (badgePromotionCode = pVar3.getBadgePromotionCode()) == null || (string2 = d53.w.i0(badgePromotionCode).toString()) == null) {
                                        string2 = "";
                                    }
                                    String strConcat = string3.concat(string2);
                                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                    String strM = am.j.m("GET REWARD open URL[", strConcat, "]");
                                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "BadgeChallengeDetailsFragment", strM);
                                    try {
                                        sVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strConcat)));
                                    } catch (ActivityNotFoundException e4) {
                                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                        com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.CHALLENGES, "BadgeChallengeDetailsFragment", "GET REWARD open URL[" + strConcat + "] ERROR -> " + e4);
                                    }
                                }
                            } else {
                                if (i19 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                g22.e.c(sVar);
                                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                String strF = org.apache.commons.lang3.e.f("badgeChallengeRedeem(", ") failed", t7);
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "BadgeChallengeDetailsFragment", strF);
                            }
                            break;
                        } else {
                            g22.e.l(sVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[((com.garmin.android.apps.connectmobile.g3) obj).f35300a.ordinal()];
                        if (i110 == 1) {
                            g22.e.l(sVar);
                        } else if (i110 == 2) {
                            g22.e.f(sVar);
                            sVar.requireActivity().setResult(-1, sVar.E6().f140764k);
                            sVar.requireActivity().finish();
                        } else {
                            if (i110 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(sVar);
                            g22.e.c(sVar);
                            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                            com.garmin.android.apps.connectmobile.g3 g3Var4 = (com.garmin.android.apps.connectmobile.g3) sVar.E6().f140757d.d();
                            String str = "performLeaveOperation(" + (g3Var4 != null ? (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var4.f35301b : null) + ") failed";
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "BadgeChallengeDetailsFragment", str);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 2;
        E6().f140761h.f(getViewLifecycleOwner(), new e(new e23.l(this) { // from class: mt0.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120780b;

            {
                this.f120780b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String string2;
                String badgePromotionCode;
                String partnerRewardUrl;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120780b;
                String string3 = null;
                string3 = null;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            g22.e.l(sVar);
                        } else if (i18 == 2) {
                            g22.e.f(sVar);
                            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b;
                            if (pVar != null) {
                                ge1.b.T(g22.f.b(sVar), null, null, new r1(sVar, pVar, null), 3);
                            }
                        } else {
                            if (i18 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(sVar);
                            g22.e.c(sVar);
                            sVar.requireActivity().finish();
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.CHALLENGES, "BadgeChallengeDetailsFragment", "getBadgeChallengeDetails(" + g3Var + ") failed");
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) ((com.garmin.android.apps.connectmobile.y) obj).a();
                        if (g3Var2 != null) {
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[g3Var2.f35300a.ordinal()];
                            if (i19 == 1) {
                                g22.e.l(sVar);
                            } else if (i19 == 2) {
                                g22.e.f(sVar);
                            } else {
                                if (i19 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                g22.e.c(sVar);
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "BadgeChallengeDetailsFragment", "performJoinOperation failed");
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.g3 g3Var3 = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        fw.p pVar2 = g3Var3.f35300a;
                        T t7 = g3Var3.f35301b;
                        int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[pVar2.ordinal()];
                        if (i110 != 1) {
                            if (i110 == 2) {
                                g22.e.f(sVar);
                                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = (com.garmin.android.apps.connectmobile.leaderboard.model.p) t7;
                                if (pVar3 != null && (partnerRewardUrl = pVar3.getPartnerRewardUrl()) != null) {
                                    string3 = d53.w.i0(partnerRewardUrl).toString();
                                }
                                if (string3 != null && (!d53.w.J(string3))) {
                                    if (pVar3 == null || (badgePromotionCode = pVar3.getBadgePromotionCode()) == null || (string2 = d53.w.i0(badgePromotionCode).toString()) == null) {
                                        string2 = "";
                                    }
                                    String strConcat = string3.concat(string2);
                                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                    String strM = am.j.m("GET REWARD open URL[", strConcat, "]");
                                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "BadgeChallengeDetailsFragment", strM);
                                    try {
                                        sVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strConcat)));
                                    } catch (ActivityNotFoundException e4) {
                                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                        com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.CHALLENGES, "BadgeChallengeDetailsFragment", "GET REWARD open URL[" + strConcat + "] ERROR -> " + e4);
                                    }
                                }
                            } else {
                                if (i110 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                g22.e.c(sVar);
                                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                String strF = org.apache.commons.lang3.e.f("badgeChallengeRedeem(", ") failed", t7);
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "BadgeChallengeDetailsFragment", strF);
                            }
                            break;
                        } else {
                            g22.e.l(sVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[((com.garmin.android.apps.connectmobile.g3) obj).f35300a.ordinal()];
                        if (i111 == 1) {
                            g22.e.l(sVar);
                        } else if (i111 == 2) {
                            g22.e.f(sVar);
                            sVar.requireActivity().setResult(-1, sVar.E6().f140764k);
                            sVar.requireActivity().finish();
                        } else {
                            if (i111 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(sVar);
                            g22.e.c(sVar);
                            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                            com.garmin.android.apps.connectmobile.g3 g3Var4 = (com.garmin.android.apps.connectmobile.g3) sVar.E6().f140757d.d();
                            String str = "performLeaveOperation(" + (g3Var4 != null ? (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var4.f35301b : null) + ") failed";
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "BadgeChallengeDetailsFragment", str);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 3;
        E6().f140763j.f(getViewLifecycleOwner(), new e(new e23.l(this) { // from class: mt0.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120780b;

            {
                this.f120780b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String string2;
                String badgePromotionCode;
                String partnerRewardUrl;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120780b;
                String string3 = null;
                string3 = null;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[g3Var.f35300a.ordinal()];
                        if (i19 == 1) {
                            g22.e.l(sVar);
                        } else if (i19 == 2) {
                            g22.e.f(sVar);
                            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b;
                            if (pVar != null) {
                                ge1.b.T(g22.f.b(sVar), null, null, new r1(sVar, pVar, null), 3);
                            }
                        } else {
                            if (i19 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(sVar);
                            g22.e.c(sVar);
                            sVar.requireActivity().finish();
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.CHALLENGES, "BadgeChallengeDetailsFragment", "getBadgeChallengeDetails(" + g3Var + ") failed");
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) ((com.garmin.android.apps.connectmobile.y) obj).a();
                        if (g3Var2 != null) {
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[g3Var2.f35300a.ordinal()];
                            if (i110 == 1) {
                                g22.e.l(sVar);
                            } else if (i110 == 2) {
                                g22.e.f(sVar);
                            } else {
                                if (i110 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                g22.e.c(sVar);
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "BadgeChallengeDetailsFragment", "performJoinOperation failed");
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.g3 g3Var3 = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        fw.p pVar2 = g3Var3.f35300a;
                        T t7 = g3Var3.f35301b;
                        int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[pVar2.ordinal()];
                        if (i111 != 1) {
                            if (i111 == 2) {
                                g22.e.f(sVar);
                                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = (com.garmin.android.apps.connectmobile.leaderboard.model.p) t7;
                                if (pVar3 != null && (partnerRewardUrl = pVar3.getPartnerRewardUrl()) != null) {
                                    string3 = d53.w.i0(partnerRewardUrl).toString();
                                }
                                if (string3 != null && (!d53.w.J(string3))) {
                                    if (pVar3 == null || (badgePromotionCode = pVar3.getBadgePromotionCode()) == null || (string2 = d53.w.i0(badgePromotionCode).toString()) == null) {
                                        string2 = "";
                                    }
                                    String strConcat = string3.concat(string2);
                                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                    String strM = am.j.m("GET REWARD open URL[", strConcat, "]");
                                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "BadgeChallengeDetailsFragment", strM);
                                    try {
                                        sVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strConcat)));
                                    } catch (ActivityNotFoundException e4) {
                                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                        com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.CHALLENGES, "BadgeChallengeDetailsFragment", "GET REWARD open URL[" + strConcat + "] ERROR -> " + e4);
                                    }
                                }
                            } else {
                                if (i111 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                g22.e.c(sVar);
                                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                                String strF = org.apache.commons.lang3.e.f("badgeChallengeRedeem(", ") failed", t7);
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "BadgeChallengeDetailsFragment", strF);
                            }
                            break;
                        } else {
                            g22.e.l(sVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.b.f37866a[((com.garmin.android.apps.connectmobile.g3) obj).f35300a.ordinal()];
                        if (i112 == 1) {
                            g22.e.l(sVar);
                        } else if (i112 == 2) {
                            g22.e.f(sVar);
                            sVar.requireActivity().setResult(-1, sVar.E6().f140764k);
                            sVar.requireActivity().finish();
                        } else {
                            if (i112 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(sVar);
                            g22.e.c(sVar);
                            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                            com.garmin.android.apps.connectmobile.g3 g3Var4 = (com.garmin.android.apps.connectmobile.g3) sVar.E6().f140757d.d();
                            String str = "performLeaveOperation(" + (g3Var4 != null ? (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var4.f35301b : null) + ") failed";
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "BadgeChallengeDetailsFragment", str);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("EXTRA_BADGE_CHALLENGE_UUID")) == null) {
            return;
        }
        pt0.p pVarE6 = E6();
        pVarE6.getClass();
        xy2.b.L(pVarE6, pVarE6.f140756c, new pt0.t(pVarE6, string, null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/s$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
