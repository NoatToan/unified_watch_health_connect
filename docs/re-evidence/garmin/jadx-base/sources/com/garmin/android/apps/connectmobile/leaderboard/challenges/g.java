package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c22.l2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v62.l9;
import v62.o7;
import yc.g3;
import yc.v2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends Fragment {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f37528r = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Long> f37531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37534f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AppCompatButton f37538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuItem f37539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SwipeRefreshLayout f37540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ComposeView f37541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f37542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mt0.u f37543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c2 f37544p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt0.a f37529a = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f37530b = new w1(p005kotlin.jvm.internal.s0.f105811a.b(zt0.a.class), new f(this), new h(this), new C0672g(null, this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.s f37535g = com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f37545q = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37546a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.s.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37546a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/g$c", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            g gVar = g.this;
            if (!gVar.f37537i && gVar.w6()) {
                new androidx.appcompat.app.e.a(gVar.requireContext()).setTitle(R.string.lbl_invite_changed_title).setMessage(R.string.social_challenge_exit_without_sending_alert_message).setPositiveButton(R.string.lbl_exit, new kx0.f(gVar, 9)).setNegativeButton(R.string.lbl_cancel, new mt0.y(0)).create().show();
                return;
            }
            if (!gVar.f37536h) {
                AdHocChallengeDTO adHocChallengeDTO = gVar.v6().f206931b;
                p13.j0 j0Var = p13.j0.f134944a;
                adHocChallengeDTO.getClass();
                j0Var.getClass();
                adHocChallengeDTO.f38001o = j0Var;
            }
            gVar.f37545q.f(false);
            gVar.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/g$d", "Landroidx/core/view/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements androidx.core.view.s {
        public d() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.invite_challenge_players, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.invite_followers);
            g gVar = g.this;
            if (gVar.f37536h) {
                menuItemFindItem.setTitle(R.string.lbl_common_save);
            } else {
                menuItemFindItem.setTitle(R.string.smart_scale_label_invite);
            }
            menuItemFindItem.setVisible(!gVar.f37537i);
            menuItemFindItem.setEnabled(false);
            gVar.f37539k = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.invite_followers) {
                return false;
            }
            g gVar = g.this;
            if (gVar.f37536h) {
                zt0.a aVarV6 = gVar.v6();
                aVarV6.y4(gVar.u6());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.a(a2Var, "isFromConfirmPage");
                l2<Unit> l2Var = aVarV6.f206941l;
                l2Var.getClass();
                l2Var.m(Unit.INSTANCE);
                return false;
            }
            mt0.u uVar = gVar.f37543o;
            if (uVar == null) {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
            if (uVar.A().isEmpty()) {
                return false;
            }
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            ArrayList arrayListU6 = gVar.u6();
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListU6, 10));
            Iterator it = arrayListU6.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((mt0.t) it.next()).f120858a));
            }
            bundle.putLongArray("GCM_challenge_selected_player_user_ids", p13.h0.c1(arrayList));
            com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
            com.garmin.android.apps.connectmobile.l2.a.b().a(intent, bundle);
            gVar.requireActivity().setResult(-1, intent);
            gVar.requireActivity().finish();
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeManagePlayersFragment$refreshConnections$1", f = "AdHocChallengeManagePlayersFragment.kt", l = {335}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37549a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f37551a;

            public a(g gVar) {
                this.f37551a = gVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                v2<T> v2Var = (v2) obj;
                mt0.u uVar = this.f37551a.f37543o;
                if (uVar != null) {
                    Object objX = uVar.x(v2Var, dVar);
                    return objX == u13.a.COROUTINE_SUSPENDED ? objX : Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
        }

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.leaderboard.challenges.g$e for r19v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                u13.a r1 = u13.a.COROUTINE_SUSPENDED
                int r2 = r0.f37549a
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L16
                if (r2 != r4) goto L10
                o13.r.b(r20)
                goto L68
            L10:
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r1)
                return r3
            L16:
                o13.r.b(r20)
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g$a r2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g r2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.this
                zt0.a r6 = r2.v6()
                com.garmin.android.apps.connectmobile.leaderboard.model.s r9 = r2.f37535g
                java.util.List<java.lang.Long> r7 = r2.f37531c
                if (r7 == 0) goto L6b
                boolean r8 = r2.f37532d
                r9.getClass()
                yc.t2 r3 = new yc.t2
                yc.u2 r10 = new yc.u2
                int r11 = r6.f206944o
                r17 = 54
                r18 = 0
                r12 = 0
                r13 = 0
                r15 = 0
                r16 = 0
                r14 = r11
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                r11 = r10
                an0.d r5 = new an0.d
                r10 = 7
                r5.<init>(r6, r7, r8, r9, r10)
                r14 = 2
                r15 = 0
                r12 = 0
                r10 = r3
                r13 = r5
                r10.<init>(r11, r12, r13, r14, r15)
                r53.i<yc.v2<Value>> r3 = r10.f196485a
                w9.a r5 = androidx.lifecycle.v1.a(r6)
                r53.a2 r3 = yc.o.a(r3, r5)
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g$e$a r5 = new com.garmin.android.apps.connectmobile.leaderboard.challenges.g$e$a
                r5.<init>(r2)
                r0.f37549a = r4
                r53.d2<T> r2 = r3.f150526a
                java.lang.Object r2 = r2.collect(r5, r0)
                if (r2 != r1) goto L68
                return r1
            L68:
                kotlin.Unit r1 = p005kotlin.Unit.INSTANCE
                return r1
            L6b:
                java.lang.String r1 = "preSelectedFollowerUserIds"
                p005kotlin.jvm.internal.s.m(r1)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.leaderboard.challenges.g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37552a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f37552a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37552a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.challenges.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0672g extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37554b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0672g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37553a = aVar;
            this.f37554b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37553a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37554b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37555a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f37555a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37555a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public final boolean A6() {
        mt0.u uVar = this.f37543o;
        if (uVar == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        if (uVar.A().isEmpty()) {
            return false;
        }
        return this.f37537i || w6();
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 1 && isAdded()) {
            SwipeRefreshLayout swipeRefreshLayout = this.f37540l;
            if (swipeRefreshLayout == null) {
                p005kotlin.jvm.internal.s.m("refreshView");
                throw null;
            }
            swipeRefreshLayout.post(new k32.n(this, 16));
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<Long> listH0;
        Object serializable;
        super.onCreate(bundle);
        com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
        Bundle bundleC = com.garmin.android.apps.connectmobile.l2.a.b().c(this);
        if (bundleC != null) {
            long[] longArray = bundleC.getLongArray("ARGS_SELECTED_FOLLOWER_USER_IDS");
            if (longArray == null || (listH0 = p13.u.h0(longArray)) == null) {
                listH0 = p13.j0.f134944a;
            }
            this.f37531c = listH0;
            this.f37532d = bundleC.getBoolean("ARGS_SELECTED_FOLLOWERS_READ_ONLY");
            this.f37533e = bundleC.getString("ARGS_INVITE_TEXT");
            this.f37534f = bundleC.getInt("ARGS_PLAYER_COUNT", 0);
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundleC.getSerializable("ARGS_CHALLENGE_ACTIVITY_TYPE", com.garmin.android.apps.connectmobile.leaderboard.model.s.class);
            } else {
                Object serializable2 = bundleC.getSerializable("ARGS_CHALLENGE_ACTIVITY_TYPE");
                if (!(serializable2 instanceof com.garmin.android.apps.connectmobile.leaderboard.model.s)) {
                    serializable2 = null;
                }
                serializable = (com.garmin.android.apps.connectmobile.leaderboard.model.s) serializable2;
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.s sVar = (com.garmin.android.apps.connectmobile.leaderboard.model.s) serializable;
            if (sVar == null) {
                sVar = com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d;
            }
            this.f37535g = sVar;
            this.f37536h = bundleC.getBoolean("ARGS_IS_FROM_CONFIRM_PAGE");
            this.f37537i = bundleC.getBoolean("ARGS_IS_WITHIN_MULTIPLE_STEPS");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.challenge_manage_players_list_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() throws Exception {
        super.onDestroyView();
        this.f37545q.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        u4.d dVarA;
        view2.getClass();
        g22.e.k(this, new d(), androidx.lifecycle.b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.swipe_refresh_layout);
        ((SwipeRefreshLayout) viewFindViewById).setOnRefreshListener(new mn2.e(this, 26));
        viewFindViewById.getClass();
        this.f37540l = (SwipeRefreshLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.recycler_view);
        viewFindViewById2.getClass();
        this.f37542n = (RecyclerView) viewFindViewById2;
        mt0.u uVar = new mt0.u(this.f37535g, new mt0.x(this));
        this.f37543o = uVar;
        uVar.r(new mh1.x(this, 7));
        RecyclerView recyclerView = this.f37542n;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        mt0.u uVar2 = this.f37543o;
        if (uVar2 == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVar = uVar2.f120872d;
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g;
        recyclerView.setAdapter((sVar == sVar2 || sVar == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k || sVar == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d || sVar == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l) ? new androidx.recyclerview.widget.g((RecyclerView.h<? extends RecyclerView.f0>[]) new RecyclerView.h[]{new mt0.u.b(), uVar2.z(new mt0.u.a())}) : new androidx.recyclerview.widget.g((RecyclerView.h<? extends RecyclerView.f0>[]) new RecyclerView.h[]{new mt0.u.b(), uVar2}));
        View viewFindViewById3 = view2.findViewById(R.id.challenge_invite_empty_view);
        viewFindViewById3.getClass();
        this.f37541m = (ComposeView) viewFindViewById3;
        mt0.u uVar3 = this.f37543o;
        if (uVar3 == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVar3 = uVar3.f120872d;
        boolean z14 = sVar3 == sVar2 || sVar3 == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k || sVar3 == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d || sVar3 == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l;
        int i14 = z14 ? R.string.msg_no_friends : R.string.lbl_no_friends_invite;
        int i15 = b.f37546a[this.f37535g.ordinal()];
        String string = (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) ? requireContext().getString(R.string.msg_no_avaliable_friends) : requireContext().getString(R.string.msg_review_suggestions);
        string.getClass();
        if (z14) {
            s62.a.f157643a.getClass();
            dVarA = o7.a(t62.b.f162798a);
        } else {
            s62.a.f157643a.getClass();
            dVarA = l9.a(t62.b.f162798a);
        }
        String string2 = !z14 ? getString(R.string.lbl_review_suggestions) : null;
        mh1.i iVar = !z14 ? new mh1.i(this, 7) : null;
        ComposeView composeView = this.f37541m;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("emptyView");
            throw null;
        }
        composeView.setContent(new z3.e(1967539528, true, new mt0.w(dVarA, this, i14, string, string2, iVar, 0)));
        ComposeView composeView2 = this.f37541m;
        if (composeView2 == null) {
            p005kotlin.jvm.internal.s.m("emptyView");
            throw null;
        }
        composeView2.setVisibility(8);
        View viewFindViewById4 = view2.findViewById(R.id.invite_button);
        AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById4;
        if (g22.n.d(this.f37533e)) {
            appCompatButton.setText(this.f37533e);
        }
        appCompatButton.setOnClickListener(new js0.d(this, 27));
        viewFindViewById4.getClass();
        this.f37538j = (AppCompatButton) viewFindViewById4;
        if (this.f37532d && !u6().isEmpty()) {
            z6(false);
        }
        if (isAdded()) {
            SwipeRefreshLayout swipeRefreshLayout = this.f37540l;
            if (swipeRefreshLayout == null) {
                p005kotlin.jvm.internal.s.m("refreshView");
                throw null;
            }
            swipeRefreshLayout.post(new k32.n(this, 16));
        }
        String string3 = getString(R.string.social_invite_people);
        string3.getClass();
        g22.e.g(this, string3);
    }

    public final ArrayList u6() {
        mt0.u uVar = this.f37543o;
        if (uVar != null) {
            return uVar.A();
        }
        p005kotlin.jvm.internal.s.m("adapter");
        throw null;
    }

    public final zt0.a v6() {
        return (zt0.a) this.f37530b.getValue();
    }

    public final boolean w6() {
        if (v6().x4().isEmpty()) {
            mt0.u uVar = this.f37543o;
            if (uVar != null) {
                return !uVar.A().isEmpty();
            }
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        ArrayList arrayListX4 = v6().x4();
        ArrayList arrayListU6 = u6();
        if (arrayListX4.size() == arrayListU6.size()) {
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListU6, 10));
            Iterator it = arrayListU6.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((mt0.t) it.next()).f120858a));
            }
            Iterator it3 = arrayListX4.iterator();
            while (it3.hasNext()) {
                if (!arrayList.contains(Long.valueOf(((Number) it3.next()).longValue()))) {
                }
            }
            return false;
        }
        return true;
    }

    public final void y6() {
        mt0.v vVar = v6().f206943n;
        vVar.f120889a.clear();
        vVar.f120890b = false;
        vVar.f120891c = null;
        c2 c2Var = this.f37544p;
        if (c2Var != null) {
            c2Var.c(null);
        }
        mt0.u uVar = this.f37543o;
        if (uVar == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        yc.f.e eVar = uVar.f196614b.f195910h;
        eVar.getClass();
        g3.f195987a.getClass();
        g3.a(3);
        eVar.f195738c.a();
        androidx.lifecycle.i0 i0VarW = o53.f0.w(this);
        x53.c cVar = o53.s0.f129406a;
        this.f37544p = ge1.b.T(i0VarW, x53.b.f189152a, null, new e(null), 2);
    }

    public final void z6(boolean z14) {
        AppCompatButton appCompatButton = this.f37538j;
        if (appCompatButton != null) {
            appCompatButton.setVisibility((this.f37537i && z14) ? 0 : 8);
        } else {
            p005kotlin.jvm.internal.s.m("inviteButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_PARTICIPANTS_COUNT", "I", "ARGS_SELECTED_FOLLOWER_USER_IDS", "ARGS_SELECTED_FOLLOWERS_READ_ONLY", "ARGS_PLAYER_COUNT", "ARGS_INVITE_TEXT", "ARGS_CHALLENGE_ACTIVITY_TYPE", "ARGS_IS_WITHIN_MULTIPLE_STEPS", "REQ_CODE_SEARCH_FOR_CONNECTIONS", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g a(List list, boolean z14, String str, int i14, com.garmin.android.apps.connectmobile.leaderboard.model.s sVar, boolean z15, boolean z16) {
            g gVar = new g();
            Bundle bundle = new Bundle();
            if (list != null) {
                bundle.putLongArray("ARGS_SELECTED_FOLLOWER_USER_IDS", p13.h0.c1(list));
            }
            bundle.putBoolean("ARGS_SELECTED_FOLLOWERS_READ_ONLY", z14);
            bundle.putString("ARGS_INVITE_TEXT", str);
            bundle.putInt("ARGS_PLAYER_COUNT", i14);
            bundle.putSerializable("ARGS_CHALLENGE_ACTIVITY_TYPE", sVar);
            bundle.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", z15);
            bundle.putBoolean("ARGS_IS_WITHIN_MULTIPLE_STEPS", z16);
            com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
            com.garmin.android.apps.connectmobile.l2.a.c(gVar, bundle);
            return gVar;
        }

        private a() {
        }
    }
}
