package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r2;
import p005kotlin.Metadata;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AutoChallengeActivity;", "Lz10/p3;", "Lcom/garmin/android/apps/connectmobile/r2;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AutoChallengeActivity extends p3 implements r2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37184c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        boolean booleanExtra = getIntent().getBooleanExtra("GCM_show_current_challenge", true);
        p.H0.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("GCM_challenge_list", null);
        bundle.putParcelable("GCM_conversation", null);
        bundle.putBoolean("GCM_show_current_challenge", booleanExtra);
        p pVar = new p();
        pVar.setArguments(bundle);
        return pVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.challenge_title);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ja() {
        return false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AutoChallengeActivity$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
