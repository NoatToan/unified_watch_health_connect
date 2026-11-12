package defpackage;

import android.content.Context;
import android.util.Log;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.MagnesSource;

/* JADX INFO: loaded from: classes21.dex */
class ud {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final znq f49957c;

    ud() {
        this(znq.d());
    }

    ud(znq znqVar) {
        this.f49957c = znqVar;
    }

    String e(Context context, tf tfVar, ue ueVar) {
        if (context == null) {
            return "";
        }
        try {
            this.f49957c.b(new MagnesSettings.Builder(context.getApplicationContext()).e(MagnesSource.BRAINTREE).d(ueVar.a()).b(tfVar.getK().equalsIgnoreCase("sandbox") ? Environment.SANDBOX : Environment.LIVE).e(ueVar.d()).c(ueVar.b()).e());
            return this.f49957c.a(context.getApplicationContext(), ueVar.e(), ueVar.c()).e();
        } catch (znh e) {
            Log.e("Exception", "Error fetching client metadata ID. Contact Braintree Support for assistance.", e);
            return "";
        }
    }
}
