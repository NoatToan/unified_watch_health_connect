package com.garmin.android.apps.connectmobile.settings.thirdparty.google;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import f12.b;
import lc2.a;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/google/GoogleHealthConnectPrivacyPolicyActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GoogleHealthConnectPrivacyPolicyActivity extends c {
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, this, 0, a.GARMIN_CONNECT_PRIVACY_POLICY, ((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).f(), false, null, false, null, PsExtractor.VIDEO_STREAM_MASK);
        finish();
    }
}
