package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.TeamChallengeActivity;
import mt0.h4;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/TeamChallengeActivity;", "Lz10/p3;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TeamChallengeActivity extends p3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f37278g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f37279h = gt2.c.b(a2.CHALLENGES.f28756a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h4 f37280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37283f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37284a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f37284a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37284a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37284a.invoke(obj);
        }
    }

    @Override // z10.p3
    public final Fragment ca() {
        p0.a aVar = p0.f37754d;
        String str = this.f37281d;
        if (str == null) {
            p005kotlin.jvm.internal.s.m("challengeId");
            throw null;
        }
        String str2 = this.f37282e;
        if (str2 == null) {
            p005kotlin.jvm.internal.s.m("invitationId");
            throw null;
        }
        boolean z14 = this.f37283f;
        aVar.getClass();
        p0 p0Var = new p0();
        Bundle bundleD = tn.k.d("GCM_challenge_uuid", str, "GCM_challenge_invitation_id", str2);
        bundleD.putBoolean("GCM_challenge_focus_on_comments", z14);
        p0Var.setArguments(bundleD);
        return p0Var;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.social_vvf_jr_challenge);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final void ga() {
        String stringExtra;
        String stringExtra2;
        Intent intent = getIntent();
        String str = "";
        if (intent == null || (stringExtra = intent.getStringExtra("GCM_challenge_uuid")) == null) {
            stringExtra = "";
        }
        this.f37281d = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 != null && (stringExtra2 = intent2.getStringExtra("GCM_challenge_invitation_id")) != null) {
            str = stringExtra2;
        }
        this.f37282e = str;
        Intent intent3 = getIntent();
        this.f37283f = intent3 != null ? intent3.getBooleanExtra("GCM_challenge_focus_on_comments", false) : false;
        String str2 = this.f37281d;
        if (str2 == null) {
            p005kotlin.jvm.internal.s.m("challengeId");
            throw null;
        }
        if (str2.length() == 0) {
            f37279h.error("Failed to start activity: empty challenge ID.");
            displayFailedMessage();
            LeaderboardActivity.f37145i.getClass();
            Intent intentA = LeaderboardActivity.a.a(this);
            intentA.putExtra("EXTRA_VIEW_DETAIL_RESULT", 701);
            intentA.setFlags(67108864);
            startActivity(intentA);
            finish();
            return;
        }
        String str3 = this.f37281d;
        if (str3 == null) {
            p005kotlin.jvm.internal.s.m("challengeId");
            throw null;
        }
        String str4 = this.f37282e;
        if (str4 == null) {
            p005kotlin.jvm.internal.s.m("invitationId");
            throw null;
        }
        boolean z14 = this.f37283f;
        h4 h4Var = (h4) GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(h4.class), getViewModelStore(), null, getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(this), new gi0.c(str3, str4, 1), 4, null);
        this.f37280c = h4Var;
        if (h4Var == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        h4Var.f120647m = z14;
        final int i14 = 0;
        h4Var.f120610j.f(this, new b(new e23.l(this) { // from class: mt0.s3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeamChallengeActivity f120857b;

            {
                this.f120857b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
                switch (i14) {
                    case 0:
                        TeamChallengeActivity.f37279h.debug("acceptInvitation: " + v2Var);
                        boolean z15 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity = this.f120857b;
                        if (z15) {
                            h4 h4Var2 = teamChallengeActivity.f37280c;
                            if (h4Var2 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            h4Var2.x4();
                            teamChallengeActivity.setResult(-1);
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity.displayFailedMessage();
                            teamChallengeActivity.hideProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        TeamChallengeActivity.f37279h.debug("declineInvitation: " + v2Var);
                        boolean z16 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity2 = this.f120857b;
                        if (z16) {
                            teamChallengeActivity2.setResult(-1);
                            teamChallengeActivity2.finish();
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity2.displayFailedMessage();
                            teamChallengeActivity2.finish();
                        }
                        return Unit.INSTANCE;
                    default:
                        TeamChallengeActivity.f37279h.debug("leaveChallenge: " + v2Var);
                        boolean z17 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity3 = this.f120857b;
                        if (z17) {
                            teamChallengeActivity3.setResult(-1);
                            teamChallengeActivity3.finish();
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity3.displayFailedMessage();
                            teamChallengeActivity3.hideProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        h4 h4Var2 = this.f37280c;
        if (h4Var2 == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        final int i15 = 1;
        h4Var2.f120611k.f(this, new b(new e23.l(this) { // from class: mt0.s3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeamChallengeActivity f120857b;

            {
                this.f120857b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
                switch (i15) {
                    case 0:
                        TeamChallengeActivity.f37279h.debug("acceptInvitation: " + v2Var);
                        boolean z15 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity = this.f120857b;
                        if (z15) {
                            h4 h4Var3 = teamChallengeActivity.f37280c;
                            if (h4Var3 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            h4Var3.x4();
                            teamChallengeActivity.setResult(-1);
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity.displayFailedMessage();
                            teamChallengeActivity.hideProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        TeamChallengeActivity.f37279h.debug("declineInvitation: " + v2Var);
                        boolean z16 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity2 = this.f120857b;
                        if (z16) {
                            teamChallengeActivity2.setResult(-1);
                            teamChallengeActivity2.finish();
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity2.displayFailedMessage();
                            teamChallengeActivity2.finish();
                        }
                        return Unit.INSTANCE;
                    default:
                        TeamChallengeActivity.f37279h.debug("leaveChallenge: " + v2Var);
                        boolean z17 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity3 = this.f120857b;
                        if (z17) {
                            teamChallengeActivity3.setResult(-1);
                            teamChallengeActivity3.finish();
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity3.displayFailedMessage();
                            teamChallengeActivity3.hideProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        h4 h4Var3 = this.f37280c;
        if (h4Var3 == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        final int i16 = 2;
        h4Var3.f120612l.f(this, new b(new e23.l(this) { // from class: mt0.s3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeamChallengeActivity f120857b;

            {
                this.f120857b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
                switch (i16) {
                    case 0:
                        TeamChallengeActivity.f37279h.debug("acceptInvitation: " + v2Var);
                        boolean z15 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity = this.f120857b;
                        if (z15) {
                            h4 h4Var4 = teamChallengeActivity.f37280c;
                            if (h4Var4 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            h4Var4.x4();
                            teamChallengeActivity.setResult(-1);
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity.displayFailedMessage();
                            teamChallengeActivity.hideProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        TeamChallengeActivity.f37279h.debug("declineInvitation: " + v2Var);
                        boolean z16 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity2 = this.f120857b;
                        if (z16) {
                            teamChallengeActivity2.setResult(-1);
                            teamChallengeActivity2.finish();
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity2.displayFailedMessage();
                            teamChallengeActivity2.finish();
                        }
                        return Unit.INSTANCE;
                    default:
                        TeamChallengeActivity.f37279h.debug("leaveChallenge: " + v2Var);
                        boolean z17 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
                        TeamChallengeActivity teamChallengeActivity3 = this.f120857b;
                        if (z17) {
                            teamChallengeActivity3.setResult(-1);
                            teamChallengeActivity3.finish();
                        } else {
                            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            teamChallengeActivity3.displayFailedMessage();
                            teamChallengeActivity3.hideProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // z10.p3
    public final boolean ja() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/TeamChallengeActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "REQ_CODE_VIEW_DETAIL", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, String str, String str2, boolean z14) {
            context.getClass();
            str.getClass();
            str2.getClass();
            Intent intent = new Intent(context, (Class<?>) TeamChallengeActivity.class);
            intent.putExtra("GCM_challenge_uuid", str);
            intent.putExtra("GCM_challenge_invitation_id", str2);
            intent.putExtra("GCM_challenge_focus_on_comments", z14);
            return intent;
        }

        public static void b(Activity activity, String str, String str2) {
            Intent intent = new Intent(activity, (Class<?>) TeamChallengeActivity.class);
            intent.putExtra("GCM_challenge_uuid", str);
            intent.putExtra("GCM_challenge_invitation_id", str2);
            activity.startActivityForResult(intent, 7);
        }

        public static void c(Activity activity, String str, String str2, boolean z14, boolean z15) {
            if (!z14 || !x.u(activity)) {
                b(activity, str, str2);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(z15 ? "vivokid://teamChallengePending" : "vivokid://teamChallenge"));
            intent.putExtra("challengeId", str);
            try {
                activity.startActivityForResult(intent, 7);
            } catch (ActivityNotFoundException unused) {
                TeamChallengeActivity.f37279h.warn("Vivofit Jr. app installed but doesn't support GCM challenges");
                b(activity, str, str2);
            }
        }

        private a() {
        }
    }
}
