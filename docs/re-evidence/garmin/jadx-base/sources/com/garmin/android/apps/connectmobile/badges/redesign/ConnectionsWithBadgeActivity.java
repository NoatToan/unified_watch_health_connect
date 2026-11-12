package com.garmin.android.apps.connectmobile.badges.redesign;

import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/ConnectionsWithBadgeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConnectionsWithBadgeActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30372a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_content_frame);
        initActionBar(true, R.string.lbl_badge);
        int intExtra = getIntent().getIntExtra("GCM_extra_badge_id", -1);
        int intExtra2 = getIntent().getIntExtra("GCM_extra_badge_connection_count", 0);
        if (intExtra == -1) {
            displayFailedMessage();
            finish();
            return;
        }
        h.f30486r.getClass();
        h hVar = new h();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("GCM_extra_badge_id", intExtra);
        bundle2.putInt("GCM_extra_badge_connection_count", intExtra2);
        hVar.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, hVar, null);
        aVar.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/ConnectionsWithBadgeActivity$a;", "", "<init>", "()V", "", "INVALID_BADGE_ID", "I", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
