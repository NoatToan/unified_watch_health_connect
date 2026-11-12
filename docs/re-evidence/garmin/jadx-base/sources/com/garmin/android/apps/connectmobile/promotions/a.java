package com.garmin.android.apps.connectmobile.promotions;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import gt2.b;
import gt2.c;
import n00.d;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/promotions/a;", "Ln00/d;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f41053a;

    public a() {
        int i14 = c.f79010a;
        this.f41053a = b.f79005a.h("CampaignPushNotificationHandler");
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        this.f41053a.debug("Received push notification with data: " + bundle);
        CampaignService.f41048f.getClass();
        CampaignService.a.a(garminConnectMobileApp);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.CAMPAIGN_AVAILABLE};
    }
}
