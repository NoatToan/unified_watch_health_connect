package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/BadgeChallengeDetailsActivity;", "Lz10/p3;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgeChallengeDetailsActivity extends p3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f37204e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f37205c = o13.m.a(o13.n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37206d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37207a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.o.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_HIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_CLIMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37207a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37208a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f37208a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37208a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37208a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<pt0.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f37209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37212d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f37209a = gVar;
            this.f37210b = qualifier;
            this.f37211c = aVar;
            this.f37212d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, pt0.p] */
        @Override // e23.a
        public final pt0.p invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f37209a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f37211c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.p.class), f189591b, null, defaultViewModelCreationExtras, this.f37210b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f37212d, 4, null);
        }
    }

    @Override // z10.p3
    public final Fragment ca() {
        s.a aVar = s.F;
        String str = this.f37206d;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_BADGE_CHALLENGE_UUID", str);
        s sVar = new s();
        sVar.setArguments(bundle);
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // z10.p3
    public final String da() {
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
        g3 g3Var = (g3) ((pt0.p) this.f37205c.getValue()).f140757d.d();
        com.garmin.android.apps.connectmobile.leaderboard.model.o oVarC = (g3Var == null || (pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b) == null) ? null : pVar.C();
        int i14 = oVarC == null ? -1 : b.f37207a[oVarC.ordinal()];
        if (i14 == -1) {
            return "";
        }
        if (i14 == 1 || i14 == 2) {
            return "Adventure";
        }
        String string = getString(R.string.challenge_title);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final void ga() {
        Bundle extras;
        Intent intent = getIntent();
        String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("EXTRA_BADGE_CHALLENGE_UUID");
        this.f37206d = string;
        if (string == null || string.length() == 0) {
            displayFailedMessage();
            finish();
        }
    }

    @Override // z10.p3
    public final boolean ja() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, o13.l] */
    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ?? r14 = this.f37205c;
        final int i14 = 0;
        ((pt0.p) r14.getValue()).f140759f.f(this, new c(new e23.l(this) { // from class: mt0.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BadgeChallengeDetailsActivity f120682b;

            {
                this.f120682b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
                int i15 = i14;
                BadgeChallengeDetailsActivity badgeChallengeDetailsActivity = this.f120682b;
                switch (i15) {
                    case 0:
                        BadgeChallengeDetailsActivity.a aVar = BadgeChallengeDetailsActivity.f37204e;
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) ((com.garmin.android.apps.connectmobile.y) obj).a();
                        if ((g3Var != null ? g3Var.f35300a : null) == fw.p.SUCCESS) {
                            badgeChallengeDetailsActivity.hideActionBar();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.v.f37909g.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.v vVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.v();
                            androidx.fragment.app.v supportFragmentManager = badgeChallengeDetailsActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar2.l(R.id.content_frame, vVar, "FEATURE_FRAGMENT");
                            aVar2.e();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) obj;
                        BadgeChallengeDetailsActivity.a aVar3 = BadgeChallengeDetailsActivity.f37204e;
                        if (g3Var2.f35300a == fw.p.SUCCESS && (pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var2.f35301b) != null) {
                            badgeChallengeDetailsActivity.setTitle(pVar.L0() ? badgeChallengeDetailsActivity.getString(R.string.lbl_expedition) : badgeChallengeDetailsActivity.getString(R.string.challenge_title));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        ((pt0.p) r14.getValue()).f140757d.f(this, new c(new e23.l(this) { // from class: mt0.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BadgeChallengeDetailsActivity f120682b;

            {
                this.f120682b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
                int i16 = i15;
                BadgeChallengeDetailsActivity badgeChallengeDetailsActivity = this.f120682b;
                switch (i16) {
                    case 0:
                        BadgeChallengeDetailsActivity.a aVar = BadgeChallengeDetailsActivity.f37204e;
                        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) ((com.garmin.android.apps.connectmobile.y) obj).a();
                        if ((g3Var != null ? g3Var.f35300a : null) == fw.p.SUCCESS) {
                            badgeChallengeDetailsActivity.hideActionBar();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.v.f37909g.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.v vVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.v();
                            androidx.fragment.app.v supportFragmentManager = badgeChallengeDetailsActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar2.l(R.id.content_frame, vVar, "FEATURE_FRAGMENT");
                            aVar2.e();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) obj;
                        BadgeChallengeDetailsActivity.a aVar3 = BadgeChallengeDetailsActivity.f37204e;
                        if (g3Var2.f35300a == fw.p.SUCCESS && (pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var2.f35301b) != null) {
                            badgeChallengeDetailsActivity.setTitle(pVar.L0() ? badgeChallengeDetailsActivity.getString(R.string.lbl_expedition) : badgeChallengeDetailsActivity.getString(R.string.challenge_title));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/BadgeChallengeDetailsActivity$a;", "", "<init>", "()V", "", "EXTRA_BADGE_CHALLENGE_UUID", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, String str) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) BadgeChallengeDetailsActivity.class);
            intent.putExtra("EXTRA_BADGE_CHALLENGE_UUID", str);
            return intent;
        }

        public static void b(Activity activity, String str) {
            if (str == null || str.length() == 0) {
                LeaderboardActivity.f37145i.getClass();
                activity.startActivity(LeaderboardActivity.a.a(activity));
                return;
            }
            LeaderboardActivity.f37145i.getClass();
            Intent intentA = LeaderboardActivity.a.a(activity);
            intentA.addFlags(268468224);
            Intent intent = new Intent(activity, (Class<?>) BadgeChallengeDetailsActivity.class);
            intent.putExtra("EXTRA_BADGE_CHALLENGE_UUID", str);
            TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(activity);
            taskStackBuilderCreate.addNextIntent(intentA);
            taskStackBuilderCreate.addNextIntent(intent);
            taskStackBuilderCreate.startActivities();
        }

        private a() {
        }
    }
}
