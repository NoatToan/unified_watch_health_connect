package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengePlayersActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdHocChallengePlayersActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37175a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengePlayersActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        ALL_PARTICIPANTS,
        ALL_WAITING_FOR_RESPONSE,
        FULL_LEADERBOARD
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37180a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ALL_PARTICIPANTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.ALL_WAITING_FOR_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.FULL_LEADERBOARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37180a = iArr;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        Intent intent = getIntent();
        l2.f37135b.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (intent == null || bundleA == null) {
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = bundleA.getSerializable("GCM_challenge_players_view_mode", b.class);
        } else {
            Object serializable2 = bundleA.getSerializable("GCM_challenge_players_view_mode");
            if (!(serializable2 instanceof b)) {
                serializable2 = null;
            }
            serializable = (b) serializable2;
        }
        b bVar = (b) serializable;
        if (bVar == null) {
            bVar = b.FULL_LEADERBOARD;
        }
        int i14 = c.f37180a[bVar.ordinal()];
        if (i14 == 1) {
            initActionBar(true, R.string.social_all_participants);
            n.I.getClass();
            n nVar = new n();
            l2.a.c(nVar, bundleA);
            androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.l(R.id.content_frame_layout, nVar, null);
            aVar.e();
            return;
        }
        if (i14 == 2) {
            initActionBar(true, R.string.social_waiting_for_response);
            o.I.getClass();
            o oVar = new o();
            l2.a.c(oVar, bundleA);
            androidx.fragment.app.v supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
            aVar2.l(R.id.content_frame_layout, oVar, null);
            aVar2.e();
            return;
        }
        if (i14 != 3) {
            lc.u0.r();
            return;
        }
        initActionBar(true, R.string.leaderboard_card_full_leaderboard);
        e0.I.getClass();
        e0 e0Var = new e0();
        l2.a.c(e0Var, bundleA);
        androidx.fragment.app.v supportFragmentManager3 = getSupportFragmentManager();
        supportFragmentManager3.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager3);
        aVar3.l(R.id.content_frame_layout, e0Var, null);
        aVar3.e();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengePlayersActivity$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, AdHocChallengeDTO adHocChallengeDTO, b bVar) {
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) AdHocChallengePlayersActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_ad_hoc_challenge", adHocChallengeDTO);
            bundle.putSerializable("GCM_challenge_players_view_mode", bVar);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            return intent;
        }

        private a() {
        }
    }
}
