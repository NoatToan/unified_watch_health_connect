package com.garmin.android.apps.connectmobile.golf.courses.presentation;

import a7.b;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import jl0.a;
import p005kotlin.Metadata;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/courses/presentation/DownloadedGolfCoursesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadedGolfCoursesActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35747b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jl0.c f35748a = new jl0.c();

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(1441078353, true, new a(this, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        unregisterReceiver(this.f35748a);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        b.registerReceiver(this, this.f35748a, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
    }
}
