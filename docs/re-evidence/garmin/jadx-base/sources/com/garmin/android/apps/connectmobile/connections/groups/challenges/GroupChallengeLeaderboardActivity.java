package com.garmin.android.apps.connectmobile.connections.groups.challenges;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import f12.b;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class GroupChallengeLeaderboardActivity extends c {
    public static void ca(Context context, String str, boolean z14) {
        Intent intent = new Intent(context, (Class<?>) GroupChallengeLeaderboardActivity.class);
        intent.putExtra("GCM_challenge_uuid", str);
        if (z14) {
            intent.addFlags(268468224);
        }
        context.startActivity(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connection_groups);
        String stringExtra = getIntent().getStringExtra("GCM_challenge_uuid");
        super.initActionBar(true, getString(R.string.lbl_challenge_results));
        String userDisplayName = ((b) KoinJavaComponent.get(b.class)).getUserDisplayName();
        i10.c.A.getClass();
        userDisplayName.getClass();
        i10.c cVar = new i10.c();
        Bundle bundle2 = new Bundle();
        bundle2.putString("GCM_challenge_uuid", stringExtra);
        bundle2.putString("GCM_userDisplayName", userDisplayName);
        cVar.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.l(R.id.fragment_group_placeholder, cVar, "challengeFragmentTag");
        aVar.e();
    }
}
