package com.garmin.android.apps.connectmobile.notifications.requestpage;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import g.h;
import p005kotlin.Metadata;
import sz0.j;
import tr2.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/requestpage/InboxRequestFullListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lsz0/j;", "<init>", "()V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InboxRequestFullListActivity extends c implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39559b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.c<Intent> f39560a = registerForActivityResult(new h(), new y(this, 15));

    static {
        new a(null);
    }

    @Override // sz0.j
    public final void a1(Bundle bundle) {
    }

    @Override // sz0.j
    public final void n4(Bundle bundle) {
        IndexNotificationDetailsActivity.f39574a.getClass();
        Intent intent = new Intent(this, (Class<?>) IndexNotificationDetailsActivity.class);
        intent.putExtra("extra_bundle", bundle);
        this.f39560a.a(intent, null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inbox_request_list_activity);
        initActionBar(true, getString(R.string.lbl_connections_requests));
    }

    @Override // sz0.j
    public final void x8(Bundle bundle) {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/requestpage/InboxRequestFullListActivity$a;", "", "<init>", "()V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
