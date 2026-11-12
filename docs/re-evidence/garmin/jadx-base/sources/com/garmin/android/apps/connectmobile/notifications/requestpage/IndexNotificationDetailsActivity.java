package com.garmin.android.apps.connectmobile.notifications.requestpage;

import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import sz0.i;
import sz0.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/requestpage/IndexNotificationDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lsz0/j;", "<init>", "()V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexNotificationDetailsActivity extends c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39574a = new a(null);

    @Override // sz0.j
    public final void a1(Bundle bundle) {
        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).r(this, bundle);
        setResult(-1);
    }

    @Override // sz0.j
    public final void n4(Bundle bundle) {
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.index_notification_detail_activity);
        initActionBar(true, getString(R.string.lbl_request));
        Bundle bundleExtra = getIntent().getBundleExtra("extra_bundle");
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.m(R.id.index_notification_detail_fragment_container_view, i.class, bundleExtra);
        aVar.f7250r = true;
        aVar.e();
    }

    @Override // sz0.j
    public final void x8(Bundle bundle) {
        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).i(this, bundle);
        setResult(-1);
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/requestpage/IndexNotificationDetailsActivity$a;", "", "<init>", "()V", "", "EXTRA_BUNDLE", "Ljava/lang/String;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
