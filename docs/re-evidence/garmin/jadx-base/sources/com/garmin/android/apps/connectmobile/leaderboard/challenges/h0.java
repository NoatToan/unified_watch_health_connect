package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.leaderboard.WeeklyLeaderboardActivity;
import java.io.Serializable;
import java.util.List;
import mt0.a3;
import mt0.d3;
import mt0.t1;
import mt0.z2;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/h0;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$k;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends com.garmin.android.apps.connectmobile.m0 implements f0.k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f37562o = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f37563h = o13.m.b(new z2(this, 0));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f37564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f37565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f37566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f37567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.c<Intent> f37568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.c<Intent> f37569n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37570a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37570a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/h0$c", "Landroidx/recyclerview/widget/RecyclerView$u;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayoutManager f37571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f37572b;

        public c(LinearLayoutManager linearLayoutManager, h0 h0Var) {
            this.f37571a = linearLayoutManager;
            this.f37572b = h0Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, i14, i15);
            this.f37572b.F6((recyclerView.getChildCount() == 0 ? 0 : this.f37571a.findFirstCompletelyVisibleItemPosition()) == 0);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37573a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f37573a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37573a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37573a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37574a;

        public e(Fragment fragment) {
            this.f37574a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37574a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<pt0.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37579e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37575a = fragment;
            this.f37576b = qualifier;
            this.f37577c = aVar;
            this.f37578d = aVar2;
            this.f37579e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, pt0.f0] */
        @Override // e23.a
        public final pt0.f0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37577c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37575a;
            e23.a aVar = this.f37578d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.f0.class), viewModelStore, null, defaultViewModelCreationExtras, this.f37576b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37579e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37580a;

        public g(Fragment fragment) {
            this.f37580a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37580a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<i3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37585e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37581a = fragment;
            this.f37582b = qualifier;
            this.f37583c = aVar;
            this.f37584d = aVar2;
            this.f37585e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, z10.i3] */
        @Override // e23.a
        public final i3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37583c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37581a;
            e23.a aVar = this.f37584d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(i3.class), viewModelStore, null, defaultViewModelCreationExtras, this.f37582b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37585e, 4, null);
        }
    }

    public h0() {
        e eVar = new e(this);
        o13.n nVar = o13.n.NONE;
        this.f37564i = o13.m.a(nVar, new f(this, null, eVar, null, null));
        this.f37565j = o13.m.a(nVar, new h(this, null, new g(this), null, null));
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: mt0.b3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 f120545b;

            {
                this.f120545b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Serializable serializableExtra;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var = this.f120545b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", false)) {
                            h0Var.K6();
                            break;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        Intent intent2 = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent2 == null || !intent2.getBooleanExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", false)) {
                                h0Var.I6();
                            } else {
                                h0Var.K6();
                            }
                            if (intent2 != null && intent2.getBooleanExtra("KEY_SHOULD_CHECK_PREMIUM_SUBSCRIPTION_NOTICE", false)) {
                                DateTime dateTime = null;
                                if (intent2 != null) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        serializableExtra = intent2.getSerializableExtra("extra_challenge_end_date", DateTime.class);
                                    } else {
                                        Serializable serializableExtra2 = intent2.getSerializableExtra("extra_challenge_end_date");
                                        serializableExtra = (DateTime) (serializableExtra2 instanceof DateTime ? serializableExtra2 : null);
                                    }
                                    dateTime = (DateTime) serializableExtra;
                                }
                                w5.r.w(h0Var, true, dateTime, new w72.f(25));
                                break;
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            h0Var.K6();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f37567l = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: mt0.b3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 f120545b;

            {
                this.f120545b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Serializable serializableExtra;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var = this.f120545b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", false)) {
                            h0Var.K6();
                            break;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        Intent intent2 = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent2 == null || !intent2.getBooleanExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", false)) {
                                h0Var.I6();
                            } else {
                                h0Var.K6();
                            }
                            if (intent2 != null && intent2.getBooleanExtra("KEY_SHOULD_CHECK_PREMIUM_SUBSCRIPTION_NOTICE", false)) {
                                DateTime dateTime = null;
                                if (intent2 != null) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        serializableExtra = intent2.getSerializableExtra("extra_challenge_end_date", DateTime.class);
                                    } else {
                                        Serializable serializableExtra2 = intent2.getSerializableExtra("extra_challenge_end_date");
                                        serializableExtra = (DateTime) (serializableExtra2 instanceof DateTime ? serializableExtra2 : null);
                                    }
                                    dateTime = (DateTime) serializableExtra;
                                }
                                w5.r.w(h0Var, true, dateTime, new w72.f(25));
                                break;
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            h0Var.K6();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f37568m = cVarRegisterForActivityResult2;
        final int i16 = 2;
        f.c<Intent> cVarRegisterForActivityResult3 = registerForActivityResult(new g.h(), new f.b(this) { // from class: mt0.b3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 f120545b;

            {
                this.f120545b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Serializable serializableExtra;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var = this.f120545b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", false)) {
                            h0Var.K6();
                            break;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        Intent intent2 = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent2 == null || !intent2.getBooleanExtra("KEY_SHOULD_REFRESH_PREMIUM_STATUS", false)) {
                                h0Var.I6();
                            } else {
                                h0Var.K6();
                            }
                            if (intent2 != null && intent2.getBooleanExtra("KEY_SHOULD_CHECK_PREMIUM_SUBSCRIPTION_NOTICE", false)) {
                                DateTime dateTime = null;
                                if (intent2 != null) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        serializableExtra = intent2.getSerializableExtra("extra_challenge_end_date", DateTime.class);
                                    } else {
                                        Serializable serializableExtra2 = intent2.getSerializableExtra("extra_challenge_end_date");
                                        serializableExtra = (DateTime) (serializableExtra2 instanceof DateTime ? serializableExtra2 : null);
                                    }
                                    dateTime = (DateTime) serializableExtra;
                                }
                                w5.r.w(h0Var, true, dateTime, new w72.f(25));
                                break;
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            h0Var.K6();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult3.getClass();
        this.f37569n = cVarRegisterForActivityResult3;
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void A2(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
        if (a0Var.j0()) {
            w5.r.e(this, new a3(this, a0Var, 2), new z2(this, 1));
        } else {
            S6(a0Var);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void D4() {
        WeeklyLeaderboardActivity.a aVar = WeeklyLeaderboardActivity.f37160b;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        androidx.room.a0.r(contextRequireContext, WeeklyLeaderboardActivity.class);
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        I6();
    }

    public final void I6() {
        pt0.f0 f0VarJ6 = J6();
        int i14 = pt0.f0.f140659k;
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        f0VarJ6.getClass();
        bVar.getClass();
        y0<g3<List<ot0.h>>> y0Var = f0VarJ6.f140663d;
        g3<List<ot0.h>> g3VarD = y0Var.d();
        if ((g3VarD != null ? g3VarD.f35300a : null) == fw.p.LOADING) {
            return;
        }
        y0Var.m(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(f0VarJ6), null, null, new pt0.i0(bVar, f0VarJ6, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final pt0.f0 J6() {
        return (pt0.f0) this.f37564i.getValue();
    }

    public final void K6() {
        ge1.b.T(g22.f.b(this), null, null, new d3(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, o13.l] */
    public final void M6(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
        if (a0Var.getBadgeUuid() == null || a0Var.getBadgeId() == null) {
            return;
        }
        J6().f140668i = new a3(this, a0Var, 1);
        ((i3) this.f37565j.getValue()).x4(requireContext(), false, null);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void N3(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
        a0Var.getClass();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        g0.a(mVarRequireActivity, a0Var);
    }

    public final void S6(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
        if (!p005kotlin.jvm.internal.s.g(a0Var.getIsAutoChallengeLink(), Boolean.TRUE)) {
            M6(a0Var);
            return;
        }
        if (J6().f140667h) {
            M6(a0Var);
            return;
        }
        x xVar = x.f37955a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        a3 a3Var = new a3(this, a0Var, 0);
        xVar.getClass();
        x.w(a3Var, contextRequireContext);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void W1() {
        if (s3.b()) {
            x xVar = x.f37955a;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            xVar.getClass();
            new androidx.appcompat.app.e.a(contextRequireContext).setTitle(contextRequireContext.getString(R.string.lbl_feature_not_supported)).setMessage(contextRequireContext.getString(R.string.msg_create_challenge_not_supported)).setPositiveButton(R.string.lbl_ok, new mt0.y(2)).setCancelable(false).create().show();
            return;
        }
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        NewCreateChallengeActivity.a aVar = NewCreateChallengeActivity.f37257f;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        aVar.getClass();
        mVarRequireActivity.startActivityForResult(new Intent(contextRequireContext2, (Class<?>) NewCreateChallengeActivity.class), 7);
        int i14 = t1.f120867a;
        Bundle bundleA = h7.c.a(new o13.p("FROM", "ChallengePage"));
        ht.a.f85464a.getClass();
        ht.a.a(bundleA, "CreateAdhocChallengeButtonClicked");
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void W4(String str) {
        str.getClass();
        BadgeChallengeDetailsActivity.a aVar = BadgeChallengeDetailsActivity.f37204e;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        startActivityForResult(BadgeChallengeDetailsActivity.a.a(contextRequireContext, str), 7);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void Y4() {
        CompletedChallengesActivity.a aVar = CompletedChallengesActivity.f37243g;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        androidx.room.a0.r(contextRequireContext, CompletedChallengesActivity.class);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void Y5() {
        if (s3.b()) {
            x xVar = x.f37955a;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            xVar.getClass();
            new androidx.appcompat.app.e.a(contextRequireContext).setTitle(contextRequireContext.getString(R.string.lbl_feature_not_supported)).setMessage(contextRequireContext.getString(R.string.msg_join_weekly_challenge_not_supported)).setPositiveButton(R.string.lbl_ok, new mt0.y(1)).setCancelable(false).create().show();
            return;
        }
        AutoChallengeActivity.a aVar = AutoChallengeActivity.f37184c;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        aVar.getClass();
        Intent intent = new Intent(mVarRequireActivity, (Class<?>) AutoChallengeActivity.class);
        intent.putExtra("GCM_show_current_challenge", true);
        mVarRequireActivity.startActivityForResult(intent, 7);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void e0() {
        AvailableBadgeChallengesActivity.a aVar = AvailableBadgeChallengesActivity.f37203c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        this.f37567l.a(new Intent(contextRequireContext, (Class<?>) AvailableBadgeChallengesActivity.class), null);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void k5() {
        AvailableAdventuresActivity.a aVar = AvailableAdventuresActivity.f37185l;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        startActivity(new Intent(contextRequireContext, (Class<?>) AvailableAdventuresActivity.class));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void n1() {
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        NonCompletedChallengesActivity.a aVar = NonCompletedChallengesActivity.f37266g;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        mVarRequireActivity.startActivityForResult(new Intent(contextRequireContext, (Class<?>) NonCompletedChallengesActivity.class), 7);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.leaderboard_challenges_fragment_3_0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new o13.p("tab", "challenges"));
        aVar.getClass();
        ht.a.a(bundleA, "PageViewLeaderboard");
        I6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.leaderboard_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnScrollListener(new c(linearLayoutManager, this));
        f0 f0Var = new f0((String) this.f37563h.getValue(), this);
        this.f37566k = f0Var;
        recyclerView.setAdapter(f0Var);
        y0 y0Var = J6().f140664e;
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        final int i14 = 0;
        dh.b.L(y0Var, viewLifecycleOwner, new d(new e23.l(this) { // from class: mt0.c3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 f120560b;

            {
                this.f120560b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x003a  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String string;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var = this.f120560b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        g3Var.getClass();
                        int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.b.f37570a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            List list = (List) g3Var.f35301b;
                            if (list != null) {
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.f0 f0Var2 = h0Var.f37566k;
                                if (f0Var2 == null) {
                                    p005kotlin.jvm.internal.s.m("adapter");
                                    throw null;
                                }
                                f0Var2.t(list);
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.f0 f0Var3 = h0Var.f37566k;
                                if (f0Var3 == null) {
                                    p005kotlin.jvm.internal.s.m("adapter");
                                    throw null;
                                }
                                boolean z14 = h0Var.J6().f140669j;
                                f0Var3.f37471g = z14;
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h hVar = f0Var3.f37469e;
                                if (hVar != null) {
                                    hVar.e(z14);
                                }
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o oVar = f0Var3.f37470f;
                                if (oVar != null) {
                                    oVar.e(z14);
                                }
                            }
                            if (fw.p.SUCCESS == fw.p.ERROR) {
                                Toast.makeText(h0Var.getActivity(), R.string.txt_error_occurred, 0).show();
                            }
                            h0Var.w6();
                        } else if (i16 == 2) {
                            fw.p pVar = fw.p.SUCCESS;
                            Toast.makeText(h0Var.getActivity(), R.string.txt_error_occurred, 0).show();
                            h0Var.w6();
                        } else {
                            if (i16 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            h0Var.G6();
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.y yVar = (com.garmin.android.apps.connectmobile.y) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        yVar.getClass();
                        com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) yVar.a();
                        if ((g3Var2 != null ? g3Var2.f35300a : null) == fw.p.SUCCESS) {
                            pt0.f0.b bVar = (pt0.f0.b) g3Var2.f35301b;
                            if (bVar != null) {
                                com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0VarY4 = h0Var.J6().y4(bVar.f140670a, true);
                                string = a0VarY4 != null ? a0VarY4.j() : null;
                                if (string == null) {
                                    string = h0Var.getString(R.string.challenge_title);
                                    string.getClass();
                                }
                            } else {
                                string = h0Var.getString(R.string.challenge_title);
                                string.getClass();
                            }
                            Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.f140672c) : null;
                            DateTime dateTime = bVar != null ? bVar.f140673d : null;
                            if (boolValueOf != null && dateTime != null) {
                                w5.r.w(h0Var, boolValueOf.booleanValue(), dateTime, new kk1.a(h0Var, 22, string, g3Var2));
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        y0 y0Var2 = J6().f140666g;
        androidx.lifecycle.n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        final int i15 = 1;
        dh.b.L(y0Var2, viewLifecycleOwner2, new d(new e23.l(this) { // from class: mt0.c3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 f120560b;

            {
                this.f120560b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x003a  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String string;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var = this.f120560b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        g3Var.getClass();
                        int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.b.f37570a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            List list = (List) g3Var.f35301b;
                            if (list != null) {
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.f0 f0Var2 = h0Var.f37566k;
                                if (f0Var2 == null) {
                                    p005kotlin.jvm.internal.s.m("adapter");
                                    throw null;
                                }
                                f0Var2.t(list);
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.f0 f0Var3 = h0Var.f37566k;
                                if (f0Var3 == null) {
                                    p005kotlin.jvm.internal.s.m("adapter");
                                    throw null;
                                }
                                boolean z14 = h0Var.J6().f140669j;
                                f0Var3.f37471g = z14;
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h hVar = f0Var3.f37469e;
                                if (hVar != null) {
                                    hVar.e(z14);
                                }
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o oVar = f0Var3.f37470f;
                                if (oVar != null) {
                                    oVar.e(z14);
                                }
                            }
                            if (fw.p.SUCCESS == fw.p.ERROR) {
                                Toast.makeText(h0Var.getActivity(), R.string.txt_error_occurred, 0).show();
                            }
                            h0Var.w6();
                        } else if (i17 == 2) {
                            fw.p pVar = fw.p.SUCCESS;
                            Toast.makeText(h0Var.getActivity(), R.string.txt_error_occurred, 0).show();
                            h0Var.w6();
                        } else {
                            if (i17 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            h0Var.G6();
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.y yVar = (com.garmin.android.apps.connectmobile.y) obj;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                        yVar.getClass();
                        com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) yVar.a();
                        if ((g3Var2 != null ? g3Var2.f35300a : null) == fw.p.SUCCESS) {
                            pt0.f0.b bVar = (pt0.f0.b) g3Var2.f35301b;
                            if (bVar != null) {
                                com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0VarY4 = h0Var.J6().y4(bVar.f140670a, true);
                                string = a0VarY4 != null ? a0VarY4.j() : null;
                                if (string == null) {
                                    string = h0Var.getString(R.string.challenge_title);
                                    string.getClass();
                                }
                            } else {
                                string = h0Var.getString(R.string.challenge_title);
                                string.getClass();
                            }
                            Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.f140672c) : null;
                            DateTime dateTime = bVar != null ? bVar.f140673d : null;
                            if (boolValueOf != null && dateTime != null) {
                                w5.r.w(h0Var, boolValueOf.booleanValue(), dateTime, new kk1.a(h0Var, 22, string, g3Var2));
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.k
    public final void p(String str) {
        str.getClass();
        BadgeChallengeDetailsActivity.a aVar = BadgeChallengeDetailsActivity.f37204e;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        this.f37568m.a(BadgeChallengeDetailsActivity.a.a(contextRequireContext, str), null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/h0$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
