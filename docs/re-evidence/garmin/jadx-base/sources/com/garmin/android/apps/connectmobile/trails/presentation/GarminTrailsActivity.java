package com.garmin.android.apps.connectmobile.trails.presentation;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import b.j;
import c22.g;
import c22.k;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ws1.a;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/trails/presentation/GarminTrailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class GarminTrailsActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f45085a = 0;

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this);
        Uri data = getIntent().getData();
        if (data != null) {
            g.f23056a.getClass();
            g.b(data);
        }
        if (!((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).b()) {
            w9();
            return;
        }
        setContentView(R.layout.activity_composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(871278970, true, new a(this, 0)));
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildGarminTrails");
        }
    }
}
