package com.garmin.android.gfdi;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import oa2.b;
import oa2.d;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/gfdi/DefaultAuthStateCallback;", "Lcom/garmin/android/gfdi/AuthRegistry$Callback;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onPasskeyRequired", "", "macAddress", "", "timeout", "", "onDeviceAuthenticated", "ediv", "", "rand", "ltk", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultAuthStateCallback implements AuthRegistry.Callback {
    private final Context context;

    public DefaultAuthStateCallback(Context context) {
        context.getClass();
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public void onDeviceAuthenticated(String macAddress, byte[] ediv, byte[] rand, byte[] ltk) {
        macAddress.getClass();
        ediv.getClass();
        rand.getClass();
        ltk.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", macAddress);
        bundle.putByteArray("com.garmin.android.gdi.EXTRA_LONG_TERM_KEY", ltk);
        bundle.putByteArray("com.garmin.android.gdi.EXTRA_ENCRYPTED_DIVERSIFIER", ediv);
        bundle.putByteArray("com.garmin.android.gdi.EXTRA_RANDOM_NUMBER", rand);
        b.a(this.context, "com.garmin.android.gdi.ACTION_DEVICE_AUTHENTICATED", d.b("GDI#", "DefaultAuthStateCallback", macAddress, -1L, this), bundle);
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public void onPasskeyRequired(String macAddress, int timeout) {
        macAddress.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("com.garmin.android.gdi.EXTRA_PAIRING_PASSKEY_TIMEOUT", timeout);
        bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", macAddress);
        b.a(this.context, "com.garmin.android.gdi.ACTION_PAIRING_PASSKEY_REQUIRED", d.b("GDI#", "DefaultAuthStateCallback", macAddress, -1L, this), bundle);
    }
}
