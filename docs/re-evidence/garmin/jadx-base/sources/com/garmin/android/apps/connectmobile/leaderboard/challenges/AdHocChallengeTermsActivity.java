package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import mt0.v1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengeTermsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lmt0/v1;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdHocChallengeTermsActivity extends com.garmin.android.apps.connectmobile.c implements v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37181c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37183b;

    public final void ca() {
        initActionBar(true, R.string.social_vvf_jr_challenge);
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        m.f37669c.getClass();
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putBoolean("GCM_challenge_is_vivokid", true);
        mVar.setArguments(bundle);
        aVar.l(R.id.content_frame_layout, mVar, null);
        aVar.e();
    }

    @Override // mt0.v1
    public final void k1() {
        if (!this.f37183b) {
            f12.l.f68084a.getClass();
            f12.l.a.a().j4();
            setResult(-1);
            finish();
            return;
        }
        if (this.f37182a) {
            f12.l.f68084a.getClass();
            f12.l.a.a().J0();
            setResult(-1);
            finish();
            return;
        }
        this.f37182a = true;
        f12.l.f68084a.getClass();
        f12.l.a.a().j4();
        ca();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        this.f37183b = getIntent().getBooleanExtra("GCM_challenge_is_vivokid", false);
        f12.l.f68084a.getClass();
        boolean zK1 = f12.l.a.a().k1();
        this.f37182a = zK1;
        if (this.f37183b && zK1) {
            ca();
            return;
        }
        initActionBar(true, R.string.social_challenge_terms);
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        m.f37669c.getClass();
        m mVar = new m();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("GCM_challenge_is_vivokid", false);
        mVar.setArguments(bundle2);
        aVar.l(R.id.content_frame_layout, mVar, null);
        aVar.e();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengeTermsActivity$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
