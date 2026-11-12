package com.garmin.android.apps.connectmobile.notifications;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import sz0.h0;
import sz0.i;
import sz0.j;
import sz0.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/NotificationsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lsz0/j;", "<init>", "()V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationsActivity extends c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39547a = new a(null);

    @Override // sz0.j
    public final void a1(Bundle bundle) {
        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).r(this, bundle);
    }

    @Override // sz0.j
    public final void n4(Bundle bundle) {
        Fragment fragmentF = getSupportFragmentManager().F(R.id.notifications_fragment_container_view);
        if (fragmentF instanceof u) {
            ((u) fragmentF).E6();
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.m(R.id.notifications_fragment_container_view, i.class, bundle);
        aVar.f7250r = true;
        aVar.d("NotificationDetailFragment");
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().M() > 1) {
            getSupportFragmentManager().Z();
        } else {
            super.onNavigateUp();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.notifications_activity);
        super.initActionBar(true, R.string.concept_notifications_abbr);
        if (bundle == null) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
            aVarB.f7250r = true;
            aVarB.j(R.id.notifications_fragment_container_view, aVarB.g(null, u.class), null, 1);
            aVarB.d("NotificationsFragment");
            aVarB.e();
        }
        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).b();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        h0 h0VarM = ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m();
        h0VarM.d(false);
        h0VarM.b(false);
    }

    @Override // sz0.j
    public final void x8(Bundle bundle) {
        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).i(this, bundle);
        getSupportFragmentManager().b0();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/NotificationsActivity$a;", "", "<init>", "()V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
