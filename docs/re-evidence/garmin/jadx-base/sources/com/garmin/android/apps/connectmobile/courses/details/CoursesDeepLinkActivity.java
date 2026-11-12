package com.garmin.android.apps.connectmobile.courses.details;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.c;
import f12.b;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import t20.h;
import x20.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/details/CoursesDeepLinkActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CoursesDeepLinkActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32766a = -1;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        showProgressOverlay();
        Uri data = getIntent().getData();
        if (data != null) {
            if (!((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).c()) {
                Intent intent = new Intent(this, (Class<?>) GCMActivityStartup.class);
                intent.setFlags(268468224);
                startActivity(intent);
                finish();
                return;
            }
            setContentView();
            showProgressOverlay();
            String lastPathSegment = data.getLastPathSegment();
            if (lastPathSegment != null) {
                h.f161777b.getClass();
                h.a.a().c(lastPathSegment, new a(this));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        long j8 = this.f32766a;
        if (j8 != -1) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
        }
    }
}
