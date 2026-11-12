package com.twitter.sdk.android.core.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.twitter.sdk.android.core.Twitter;

/* JADX INFO: loaded from: classes18.dex */
class c implements e {
    private static final int b = 0;
    private static final String c = "com.google.android.gms.common.GooglePlayServicesUtil";
    private static final String d = "isGooglePlayServicesAvailable";
    private static final String e = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final String f = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
    private static final String g = "getAdvertisingIdInfo";
    private static final String h = "getId";
    private static final String i = "isLimitAdTrackingEnabled";
    private final Context a;

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    private String b() {
        try {
            return (String) AdvertisingIdClient.Info.class.getMethod(h, new Class[0]).invoke(c(), new Object[0]);
        } catch (Exception unused) {
            Twitter.getLogger().w("Twitter", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    private Object c() {
        try {
            return AdvertisingIdClient.class.getMethod(g, Context.class).invoke(null, this.a);
        } catch (Exception unused) {
            Twitter.getLogger().w("Twitter", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }

    private boolean e() {
        try {
            return ((Boolean) AdvertisingIdClient.Info.class.getMethod(i, new Class[0]).invoke(c(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            Twitter.getLogger().w("Twitter", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    @Override // com.twitter.sdk.android.core.internal.e
    public a a() {
        if (d(this.a)) {
            return new a(b(), e());
        }
        return null;
    }

    public boolean d(Context context) {
        try {
            return ((Integer) Class.forName(c).getMethod(d, Context.class).invoke(null, context)).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
