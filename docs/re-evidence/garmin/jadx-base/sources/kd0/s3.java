package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionManagerActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkd0/s3;", "Lg/a;", "", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s3 extends g.a<Long, Boolean> {
    @Override // g.a
    public final Intent a(Context context, Long l14) {
        long jLongValue = l14.longValue();
        context.getClass();
        return LTESubscriptionManagerActivity.a.a(LTESubscriptionManagerActivity.f43457e, context, jLongValue, true, 8);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // g.a
    public final Boolean c(int i14, Intent intent) {
        boolean z14;
        Bundle extras;
        if (i14 == -1 && intent != null && (extras = intent.getExtras()) != null) {
            z14 = extras.getBoolean("LTE_DEVICE_ACTIVATED");
        }
        return Boolean.valueOf(z14);
    }
}
