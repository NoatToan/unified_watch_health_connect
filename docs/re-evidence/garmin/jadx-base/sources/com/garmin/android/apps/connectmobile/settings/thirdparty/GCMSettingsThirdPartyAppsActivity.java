package com.garmin.android.apps.connectmobile.settings.thirdparty;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/GCMSettingsThirdPartyAppsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "", "showUnableToConnectAlert", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMSettingsThirdPartyAppsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f43944b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk1.a f43945a = (dk1.a) KoinJavaComponent.get$default(dk1.a.class, null, null, 6, null);

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.PARTNER_APPS;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(-1871420545, true, new ak1.a(this, 0)));
    }
}
