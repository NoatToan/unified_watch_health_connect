package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import java.util.List;
import p005kotlin.Metadata;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengeInviteFollowersActivity;", "Lz10/p3;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdHocChallengeInviteFollowersActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37174c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        List<Long> list;
        String str;
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVar;
        boolean z14;
        int i14;
        boolean z15;
        Object serializable;
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            long[] longArray = bundleA.getLongArray("EXTRA_SELECTED_FOLLOWER_USER_IDS");
            List<Long> listH0 = longArray != null ? p13.u.h0(longArray) : null;
            String string = bundleA.getString("GCM_challenge_invite_menu_item_text");
            boolean z16 = bundleA.getBoolean("EXTRA_SELECTED_FOLLOWERS_READ_ONLY");
            int i15 = bundleA.getInt("GCM_challenge_player_count");
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundleA.getSerializable("GCM_challenge_activity_type", com.garmin.android.apps.connectmobile.leaderboard.model.s.class);
            } else {
                Object serializable2 = bundleA.getSerializable("GCM_challenge_activity_type");
                if (!(serializable2 instanceof com.garmin.android.apps.connectmobile.leaderboard.model.s)) {
                    serializable2 = null;
                }
                serializable = (com.garmin.android.apps.connectmobile.leaderboard.model.s) serializable2;
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.s sVar2 = serializable instanceof com.garmin.android.apps.connectmobile.leaderboard.model.s ? (com.garmin.android.apps.connectmobile.leaderboard.model.s) serializable : null;
            z15 = bundleA.getBoolean("GCM_challenge_is_within_multiple_steps");
            sVar = sVar2;
            str = string;
            z14 = z16;
            i14 = i15;
            list = listH0;
        } else {
            list = null;
            str = null;
            sVar = null;
            z14 = false;
            i14 = 0;
            z15 = false;
        }
        g.f37528r.getClass();
        return g.a.a(list, z14, str, i14, sVar, false, z15);
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.social_invite_people);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final String ea() {
        return da();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengeInviteFollowersActivity$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_FOLLOWER_USER_IDS", "Ljava/lang/String;", "EXTRA_SELECTED_FOLLOWERS_READ_ONLY", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
