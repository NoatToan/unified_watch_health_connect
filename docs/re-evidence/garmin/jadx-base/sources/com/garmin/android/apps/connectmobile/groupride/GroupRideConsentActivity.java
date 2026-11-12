package com.garmin.android.apps.connectmobile.groupride;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import q92.x;
import z10.y0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/groupride/GroupRideConsentActivity;", "Lz10/y0;", "<init>", "()V", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupRideConsentActivity extends y0 {
    @Override // z10.y0
    public final x[] Aa() {
        return new x[]{x.DI_CONNECT_LIVETRACK};
    }

    @Override // z10.y0
    public final void Ba() {
        setResult(-1);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void xa() {
        setTitle(R.string.lbl_data_privacy);
    }
}
