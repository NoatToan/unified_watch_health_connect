package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import mt0.x3;
import mt0.y3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/TeamChallengePlayersActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TeamChallengePlayersActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37285a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var;
        com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var;
        List<com.garmin.android.apps.connectmobile.leaderboard.model.j0> listQ;
        Object next;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        Intent intent = getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_team_challenge", com.garmin.android.apps.connectmobile.leaderboard.model.h0.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("GCM_team_challenge");
                if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.leaderboard.model.h0)) {
                    parcelableExtra = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) parcelableExtra;
            }
            h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) parcelable;
        } else {
            h0Var = null;
        }
        Intent intent2 = getIntent();
        String stringExtra = intent2 != null ? intent2.getStringExtra("GCM_team_uuid") : null;
        Intent intent3 = getIntent();
        int intExtra = intent3 != null ? intent3.getIntExtra("GCM_challenge_players_view_mode", 0) : 0;
        if (h0Var == null || (listQ = h0Var.q()) == null) {
            j0Var = null;
        } else {
            Iterator<T> it = listQ.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(stringExtra, ((com.garmin.android.apps.connectmobile.leaderboard.model.j0) next).getTeamUuid()));
            j0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.j0) next;
        }
        if (h0Var == null || j0Var == null) {
            displayFailedMessage();
            finish();
            return;
        }
        initActionBar(true, ((x3) new x1(this, new y3(h0Var, j0Var, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk())).b(p005kotlin.jvm.internal.s0.f105811a.b(x3.class))).f120924b.getTeamName());
        if (intExtra == 0) {
            t0.f37889l.getClass();
            t0 t0Var = new t0();
            androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.l(R.id.content_frame_layout, t0Var, null);
            aVar.e();
            return;
        }
        if (intExtra != 1) {
            return;
        }
        v0.f37924m.getClass();
        v0 v0Var = new v0();
        androidx.fragment.app.v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
        aVar2.l(R.id.content_frame_layout, v0Var, null);
        aVar2.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/TeamChallengePlayersActivity$a;", "", "<init>", "()V", "", "INVITED_PLAYERS", "I", "LEADERBOARD", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var, String str, int i14) {
            Intent intent = new Intent(context, (Class<?>) TeamChallengePlayersActivity.class);
            intent.putExtra("GCM_team_challenge", h0Var);
            intent.putExtra("GCM_team_uuid", str);
            intent.putExtra("GCM_challenge_players_view_mode", i14);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
