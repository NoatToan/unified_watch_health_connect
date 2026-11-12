package s00;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls00/v;", "Ln00/d;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements n00.d {
    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        oi2.a.C2513a.a(oi2.a.f132270a, new jj0.c(bundle));
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.NFC_PAYMENT_FITPAY, n00.c.CIQ_PURCHASE_CONFIRMATION_CHALLENGE, n00.c.CIQ_PURCHASE_CONFIRMED};
    }
}
