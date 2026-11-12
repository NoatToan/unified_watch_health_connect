package com.garmin.android.apps.connectmobile.ecg.presentation.stats;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/a;", "Lg/a;", "Lgf0/a;", "", "<init>", "()V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends g.a<gf0.a, String> {
    @Override // g.a
    public final Intent a(Context context, gf0.a aVar) {
        gf0.a aVar2 = aVar;
        context.getClass();
        aVar2.getClass();
        EcgDetailActivity.f34869p.getClass();
        Intent intent = new Intent(context, (Class<?>) EcgDetailActivity.class);
        intent.putExtra("ACTIVITY_EXTRA", aVar2);
        intent.putExtra("ACTIVITY_ID_EXTRA", aVar2.getDetailId());
        return intent;
    }

    @Override // g.a
    public final String c(int i14, Intent intent) {
        Bundle extras;
        if (i14 != -1 || intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return extras.getString("ACTIVITY_ID_EXTRA");
    }
}
