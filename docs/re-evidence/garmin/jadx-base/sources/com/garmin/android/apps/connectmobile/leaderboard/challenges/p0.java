package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.q1;
import mt0.b2;
import mt0.h4;
import mt0.u3;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/p0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f37754d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f37755e = gt2.c.b(a2.CHALLENGES.f28756a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h4 f37756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f37757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Menu f37758c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37760b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.v.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.v.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.v.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.v.LOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f37759a = iArr;
            int[] iArr2 = new int[fw.p.values().length];
            try {
                iArr2[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f37760b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/p0$c", "Landroidx/core/view/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menuInflater.inflate(R.menu.challenge_details, menu);
            menu.findItem(R.id.challenge_invite_people).setVisible(false);
            menu.findItem(R.id.challenge_rules).setVisible(true);
            menu.findItem(R.id.challenge_rename).setVisible(false);
            menu.findItem(R.id.challenge_remove_people).setVisible(false);
            menu.findItem(R.id.challenge_leave).setVisible(false);
            menu.findItem(R.id.challenge_delete).setVisible(false);
            p0.this.f37758c = menu;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            p0 p0Var = p0.this;
            if (itemId != R.id.challenge_rules) {
                if (itemId != R.id.challenge_leave) {
                    return false;
                }
                a aVar = p0.f37754d;
                p0Var.getClass();
                q1.b bVar = q1.f41066b;
                String string = p0Var.getString(R.string.social_leave_challenge_msg);
                string.getClass();
                b2 b2Var = new b2(p0Var, 2);
                bVar.getClass();
                q1 q1VarA = q1.b.a(R.string.social_leave_challenge, string, R.string.lbl_leave, R.string.lbl_cancel, b2Var);
                androidx.fragment.app.v childFragmentManager = p0Var.getChildFragmentManager();
                childFragmentManager.getClass();
                q1VarA.v6(childFragmentManager, null);
                return true;
            }
            h4 h4Var = p0Var.f37756a;
            if (h4Var == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var.f120607g.d();
            if (h0Var != null) {
                ChallengeRulesActivity.a aVar2 = ChallengeRulesActivity.f37225j;
                androidx.fragment.app.m mVarRequireActivity = p0Var.requireActivity();
                aVar2.getClass();
                if (mVarRequireActivity != null) {
                    Intent intent = new Intent(mVarRequireActivity, (Class<?>) ChallengeRulesActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("ad_hoc_challenge_start_date", h0Var.getStartDate());
                    bundle.putSerializable("ad_hoc_challenge_end_date", h0Var.getEndDate());
                    Integer challengeActivityTypeId = h0Var.getChallengeActivityTypeId();
                    challengeActivityTypeId.getClass();
                    bundle.putInt("ad_hoc_challenge_activity_type_id", challengeActivityTypeId.intValue());
                    bundle.putBoolean("GCM_challenge_is_vivokid", false);
                    bundle.putBoolean("GCM_challenge_is_team", true);
                    intent.putExtras(bundle);
                    mVarRequireActivity.startActivity(intent);
                }
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37762a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f37762a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37762a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37762a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.challenge_details_3_0, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        h4 h4Var = this.f37756a;
        if (h4Var == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0> g3VarD = h4Var.f120606f.d();
        if ((g3VarD != null ? g3VarD.f35300a : null) != fw.p.SUCCESS) {
            h4 h4Var2 = this.f37756a;
            if (h4Var2 != null) {
                h4Var2.x4();
            } else {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        String string2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("GCM_challenge_uuid")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("GCM_challenge_invitation_id")) != null) {
            str = string2;
        }
        Bundle arguments3 = getArguments();
        boolean z14 = arguments3 != null ? arguments3.getBoolean("GCM_challenge_focus_on_comments", false) : false;
        g22.e.k(this, new c(), androidx.lifecycle.b0.b.CREATED);
        gi0.c cVar = new gi0.c(string, str, 2);
        androidx.fragment.app.m mVarRequireActivity = new u3(this).f120888a.requireActivity();
        h4 h4Var = (h4) GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(h4.class), mVarRequireActivity.getF189591b(), null, mVarRequireActivity.getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(this), cVar, 4, null);
        this.f37756a = h4Var;
        if (h4Var == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        h4Var.f120647m = z14;
        final int i14 = 0;
        h4Var.f120606f.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: mt0.t3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 f120871b;

            {
                this.f120871b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x004a  */
            /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z15;
                Menu menu;
                MenuItem menuItemFindItem;
                MenuItem menuItemFindItem2;
                MenuItem menuItemFindItem3;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 p0Var = this.f120871b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                        fw.p pVar = g3Var.f35300a;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37755e.debug("Team challenge model status: " + pVar);
                        int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.b.f37760b[pVar.ordinal()];
                        if (i16 == 1) {
                            g22.e.l(p0Var);
                        } else if (i16 == 2) {
                            g22.e.f(p0Var);
                        } else {
                            if (i16 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.c(p0Var);
                            g22.e.f(p0Var);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar = (com.garmin.android.apps.connectmobile.leaderboard.model.v) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                        vVar.getClass();
                        h4 h4Var2 = p0Var.f37756a;
                        if (h4Var2 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Boolean bool = (Boolean) h4Var2.f120650p.d();
                        p0Var.u6(vVar, bool != null ? bool.booleanValue() : false);
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        h4 h4Var3 = p0Var.f37756a;
                        if (h4Var3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.v) h4Var3.f120609i.d();
                        if (vVar2 != null) {
                            bool2.getClass();
                            p0Var.u6(vVar2, bool2.booleanValue());
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.i0) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37755e.debug("currentPlayer: " + i0Var);
                        h4 h4Var4 = p0Var.f37756a;
                        if (h4Var4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var4.f120607g.d();
                        if (h0Var == null) {
                            z15 = false;
                        } else {
                            long userProfileId = i0Var != null ? i0Var.getUserProfileId() : -1L;
                            Long ownerUserProfileId = h0Var.getOwnerUserProfileId();
                            if (ownerUserProfileId != null && userProfileId == ownerUserProfileId.longValue()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.g0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.f38162b;
                        Integer playerType = i0Var != null ? i0Var.getPlayerType() : null;
                        aVar3.getClass();
                        boolean z16 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.a.a(playerType) != com.garmin.android.apps.connectmobile.leaderboard.model.g0.KID;
                        if (z15 || !z16) {
                            menu = p0Var.f37758c;
                            if (menu != null && (menuItemFindItem = menu.findItem(R.id.challenge_leave)) != null) {
                                menuItemFindItem.setVisible(false);
                            }
                        } else {
                            if (i0Var != null ? p005kotlin.jvm.internal.s.g(i0Var.getIsAcceptedChallenge(), Boolean.TRUE) : false) {
                                h4 h4Var5 = p0Var.f37756a;
                                if (h4Var5 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                h4Var5.f120603c = "";
                                com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var5.f120607g.d();
                                com.garmin.android.apps.connectmobile.leaderboard.model.v vVarF = h0Var2 != null ? h0Var2.f() : null;
                                int i17 = vVarF == null ? -1 : com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.b.f37759a[vVarF.ordinal()];
                                if (i17 == 1 || i17 == 2) {
                                    Menu menu2 = p0Var.f37758c;
                                    if (menu2 != null && (menuItemFindItem2 = menu2.findItem(R.id.challenge_leave)) != null) {
                                        menuItemFindItem2.setVisible(true);
                                    }
                                } else {
                                    Menu menu3 = p0Var.f37758c;
                                    if (menu3 != null && (menuItemFindItem3 = menu3.findItem(R.id.challenge_leave)) != null) {
                                        menuItemFindItem3.setVisible(false);
                                    }
                                }
                            } else {
                                menu = p0Var.f37758c;
                                if (menu != null) {
                                    menuItemFindItem.setVisible(false);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        h4 h4Var2 = this.f37756a;
        if (h4Var2 == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        final int i15 = 1;
        h4Var2.f120609i.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: mt0.t3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 f120871b;

            {
                this.f120871b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x004a  */
            /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z15;
                Menu menu;
                MenuItem menuItemFindItem;
                MenuItem menuItemFindItem2;
                MenuItem menuItemFindItem3;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 p0Var = this.f120871b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                        fw.p pVar = g3Var.f35300a;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37755e.debug("Team challenge model status: " + pVar);
                        int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.b.f37760b[pVar.ordinal()];
                        if (i17 == 1) {
                            g22.e.l(p0Var);
                        } else if (i17 == 2) {
                            g22.e.f(p0Var);
                        } else {
                            if (i17 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.c(p0Var);
                            g22.e.f(p0Var);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar = (com.garmin.android.apps.connectmobile.leaderboard.model.v) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                        vVar.getClass();
                        h4 h4Var3 = p0Var.f37756a;
                        if (h4Var3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Boolean bool = (Boolean) h4Var3.f120650p.d();
                        p0Var.u6(vVar, bool != null ? bool.booleanValue() : false);
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        h4 h4Var4 = p0Var.f37756a;
                        if (h4Var4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.v) h4Var4.f120609i.d();
                        if (vVar2 != null) {
                            bool2.getClass();
                            p0Var.u6(vVar2, bool2.booleanValue());
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.i0) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37755e.debug("currentPlayer: " + i0Var);
                        h4 h4Var5 = p0Var.f37756a;
                        if (h4Var5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var5.f120607g.d();
                        if (h0Var == null) {
                            z15 = false;
                        } else {
                            long userProfileId = i0Var != null ? i0Var.getUserProfileId() : -1L;
                            Long ownerUserProfileId = h0Var.getOwnerUserProfileId();
                            if (ownerUserProfileId != null && userProfileId == ownerUserProfileId.longValue()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.g0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.f38162b;
                        Integer playerType = i0Var != null ? i0Var.getPlayerType() : null;
                        aVar3.getClass();
                        boolean z16 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.a.a(playerType) != com.garmin.android.apps.connectmobile.leaderboard.model.g0.KID;
                        if (z15 || !z16) {
                            menu = p0Var.f37758c;
                            if (menu != null && (menuItemFindItem = menu.findItem(R.id.challenge_leave)) != null) {
                                menuItemFindItem.setVisible(false);
                            }
                        } else {
                            if (i0Var != null ? p005kotlin.jvm.internal.s.g(i0Var.getIsAcceptedChallenge(), Boolean.TRUE) : false) {
                                h4 h4Var6 = p0Var.f37756a;
                                if (h4Var6 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                h4Var6.f120603c = "";
                                com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var6.f120607g.d();
                                com.garmin.android.apps.connectmobile.leaderboard.model.v vVarF = h0Var2 != null ? h0Var2.f() : null;
                                int i18 = vVarF == null ? -1 : com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.b.f37759a[vVarF.ordinal()];
                                if (i18 == 1 || i18 == 2) {
                                    Menu menu2 = p0Var.f37758c;
                                    if (menu2 != null && (menuItemFindItem2 = menu2.findItem(R.id.challenge_leave)) != null) {
                                        menuItemFindItem2.setVisible(true);
                                    }
                                } else {
                                    Menu menu3 = p0Var.f37758c;
                                    if (menu3 != null && (menuItemFindItem3 = menu3.findItem(R.id.challenge_leave)) != null) {
                                        menuItemFindItem3.setVisible(false);
                                    }
                                }
                            } else {
                                menu = p0Var.f37758c;
                                if (menu != null) {
                                    menuItemFindItem.setVisible(false);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        h4 h4Var3 = this.f37756a;
        if (h4Var3 == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        final int i16 = 2;
        h4Var3.f120650p.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: mt0.t3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 f120871b;

            {
                this.f120871b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x004a  */
            /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z15;
                Menu menu;
                MenuItem menuItemFindItem;
                MenuItem menuItemFindItem2;
                MenuItem menuItemFindItem3;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 p0Var = this.f120871b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                        fw.p pVar = g3Var.f35300a;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37755e.debug("Team challenge model status: " + pVar);
                        int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.b.f37760b[pVar.ordinal()];
                        if (i18 == 1) {
                            g22.e.l(p0Var);
                        } else if (i18 == 2) {
                            g22.e.f(p0Var);
                        } else {
                            if (i18 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.c(p0Var);
                            g22.e.f(p0Var);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar = (com.garmin.android.apps.connectmobile.leaderboard.model.v) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                        vVar.getClass();
                        h4 h4Var4 = p0Var.f37756a;
                        if (h4Var4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Boolean bool = (Boolean) h4Var4.f120650p.d();
                        p0Var.u6(vVar, bool != null ? bool.booleanValue() : false);
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        h4 h4Var5 = p0Var.f37756a;
                        if (h4Var5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.v) h4Var5.f120609i.d();
                        if (vVar2 != null) {
                            bool2.getClass();
                            p0Var.u6(vVar2, bool2.booleanValue());
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.i0) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37755e.debug("currentPlayer: " + i0Var);
                        h4 h4Var6 = p0Var.f37756a;
                        if (h4Var6 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var6.f120607g.d();
                        if (h0Var == null) {
                            z15 = false;
                        } else {
                            long userProfileId = i0Var != null ? i0Var.getUserProfileId() : -1L;
                            Long ownerUserProfileId = h0Var.getOwnerUserProfileId();
                            if (ownerUserProfileId != null && userProfileId == ownerUserProfileId.longValue()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.g0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.f38162b;
                        Integer playerType = i0Var != null ? i0Var.getPlayerType() : null;
                        aVar3.getClass();
                        boolean z16 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.a.a(playerType) != com.garmin.android.apps.connectmobile.leaderboard.model.g0.KID;
                        if (z15 || !z16) {
                            menu = p0Var.f37758c;
                            if (menu != null && (menuItemFindItem = menu.findItem(R.id.challenge_leave)) != null) {
                                menuItemFindItem.setVisible(false);
                            }
                        } else {
                            if (i0Var != null ? p005kotlin.jvm.internal.s.g(i0Var.getIsAcceptedChallenge(), Boolean.TRUE) : false) {
                                h4 h4Var7 = p0Var.f37756a;
                                if (h4Var7 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                h4Var7.f120603c = "";
                                com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var7.f120607g.d();
                                com.garmin.android.apps.connectmobile.leaderboard.model.v vVarF = h0Var2 != null ? h0Var2.f() : null;
                                int i19 = vVarF == null ? -1 : com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.b.f37759a[vVarF.ordinal()];
                                if (i19 == 1 || i19 == 2) {
                                    Menu menu2 = p0Var.f37758c;
                                    if (menu2 != null && (menuItemFindItem2 = menu2.findItem(R.id.challenge_leave)) != null) {
                                        menuItemFindItem2.setVisible(true);
                                    }
                                } else {
                                    Menu menu3 = p0Var.f37758c;
                                    if (menu3 != null && (menuItemFindItem3 = menu3.findItem(R.id.challenge_leave)) != null) {
                                        menuItemFindItem3.setVisible(false);
                                    }
                                }
                            } else {
                                menu = p0Var.f37758c;
                                if (menu != null) {
                                    menuItemFindItem.setVisible(false);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        h4 h4Var4 = this.f37756a;
        if (h4Var4 == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        final int i17 = 3;
        h4Var4.f120608h.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: mt0.t3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 f120871b;

            {
                this.f120871b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x004a  */
            /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z15;
                Menu menu;
                MenuItem menuItemFindItem;
                MenuItem menuItemFindItem2;
                MenuItem menuItemFindItem3;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 p0Var = this.f120871b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                        fw.p pVar = g3Var.f35300a;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37755e.debug("Team challenge model status: " + pVar);
                        int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.b.f37760b[pVar.ordinal()];
                        if (i19 == 1) {
                            g22.e.l(p0Var);
                        } else if (i19 == 2) {
                            g22.e.f(p0Var);
                        } else {
                            if (i19 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.c(p0Var);
                            g22.e.f(p0Var);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar = (com.garmin.android.apps.connectmobile.leaderboard.model.v) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                        vVar.getClass();
                        h4 h4Var5 = p0Var.f37756a;
                        if (h4Var5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Boolean bool = (Boolean) h4Var5.f120650p.d();
                        p0Var.u6(vVar, bool != null ? bool.booleanValue() : false);
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        h4 h4Var6 = p0Var.f37756a;
                        if (h4Var6 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.v vVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.v) h4Var6.f120609i.d();
                        if (vVar2 != null) {
                            bool2.getClass();
                            p0Var.u6(vVar2, bool2.booleanValue());
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.i0) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37755e.debug("currentPlayer: " + i0Var);
                        h4 h4Var7 = p0Var.f37756a;
                        if (h4Var7 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var7.f120607g.d();
                        if (h0Var == null) {
                            z15 = false;
                        } else {
                            long userProfileId = i0Var != null ? i0Var.getUserProfileId() : -1L;
                            Long ownerUserProfileId = h0Var.getOwnerUserProfileId();
                            if (ownerUserProfileId != null && userProfileId == ownerUserProfileId.longValue()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        com.garmin.android.apps.connectmobile.leaderboard.model.g0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.f38162b;
                        Integer playerType = i0Var != null ? i0Var.getPlayerType() : null;
                        aVar3.getClass();
                        boolean z16 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.a.a(playerType) != com.garmin.android.apps.connectmobile.leaderboard.model.g0.KID;
                        if (z15 || !z16) {
                            menu = p0Var.f37758c;
                            if (menu != null && (menuItemFindItem = menu.findItem(R.id.challenge_leave)) != null) {
                                menuItemFindItem.setVisible(false);
                            }
                        } else {
                            if (i0Var != null ? p005kotlin.jvm.internal.s.g(i0Var.getIsAcceptedChallenge(), Boolean.TRUE) : false) {
                                h4 h4Var8 = p0Var.f37756a;
                                if (h4Var8 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                h4Var8.f120603c = "";
                                com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var8.f120607g.d();
                                com.garmin.android.apps.connectmobile.leaderboard.model.v vVarF = h0Var2 != null ? h0Var2.f() : null;
                                int i110 = vVarF == null ? -1 : com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.b.f37759a[vVarF.ordinal()];
                                if (i110 == 1 || i110 == 2) {
                                    Menu menu2 = p0Var.f37758c;
                                    if (menu2 != null && (menuItemFindItem2 = menu2.findItem(R.id.challenge_leave)) != null) {
                                        menuItemFindItem2.setVisible(true);
                                    }
                                } else {
                                    Menu menu3 = p0Var.f37758c;
                                    if (menu3 != null && (menuItemFindItem3 = menu3.findItem(R.id.challenge_leave)) != null) {
                                        menuItemFindItem3.setVisible(false);
                                    }
                                }
                            } else {
                                menu = p0Var.f37758c;
                                if (menu != null) {
                                    menuItemFindItem.setVisible(false);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final void u6(com.garmin.android.apps.connectmobile.leaderboard.model.v vVar, boolean z14) {
        o0 w0Var;
        int i14 = b.f37759a[vVar.ordinal()];
        if (i14 == 1) {
            w0.M0.getClass();
            w0Var = new w0();
        } else if (i14 == 2 || i14 == 3 || i14 == 4) {
            if (z14) {
                r0.K0.getClass();
                w0Var = new r0();
            } else {
                w0.M0.getClass();
                w0Var = new w0();
            }
        } else if (i14 != 5) {
            w0.M0.getClass();
            w0Var = new w0();
        } else {
            r0.K0.getClass();
            w0Var = new r0();
        }
        o0 o0Var = this.f37757b;
        if (o0Var == null || o0Var.getClass() != w0Var.getClass()) {
            f37755e.debug("Replace fragment: " + w0Var);
            this.f37757b = w0Var;
            androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
            aVar.l(R.id.challenge_details_fragment, w0Var, null);
            aVar.e();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/p0$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
