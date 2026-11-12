package com.garmin.android.gfdi;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import oa2.a;
import p005kotlin.Metadata;
import ss2.b;
import ss2.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001c\u0010\u0003\u001a\n #*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$¨\u0006%"}, d2 = {"Lcom/garmin/android/gfdi/DefaultAuthDelegate;", "Lss2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "macAddress", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "connectionId", "", "getLongTermKey", "(Ljava/lang/String;)[B", "getEncryptedDiversifier", "getRandomNumber", "", "isGarminAuthAllowed", "(Ljava/lang/String;)Z", "ltk", "ediv", "randomNumber", "", "saveAuthenticationInfo", "(Ljava/lang/String;[B[B[B)V", "passkey", "saveOutOfBandPasskey", "(Ljava/lang/String;[B)V", "", "pairingPasskeyTimeout", "Lss2/w;", "passkeyHandler", "onDevicePairingPasskeyRequired", "(Ljava/lang/String;ILss2/w;)V", "onOutOfBandPasskeyRequired", "(Ljava/lang/String;Lss2/w;)V", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultAuthDelegate implements b {
    private final Context context;
    private final String macAddress;

    public DefaultAuthDelegate(Context context, String str) {
        context.getClass();
        str.getClass();
        this.macAddress = str;
        this.context = context.getApplicationContext();
    }

    @Override // ss2.b
    public byte[] getEncryptedDiversifier(String connectionId) {
        connectionId.getClass();
        return AuthRegistry.getInstance().getEncryptedDiversifier(connectionId);
    }

    @Override // ss2.b
    public byte[] getLongTermKey(String connectionId) {
        connectionId.getClass();
        return AuthRegistry.getInstance().getLongTermKey(connectionId);
    }

    @Override // ss2.b
    public byte[] getRandomNumber(String connectionId) {
        connectionId.getClass();
        return AuthRegistry.getInstance().getRandomNumber(connectionId);
    }

    @Override // ss2.b
    public boolean isGarminAuthAllowed(String connectionId) {
        String upperCase;
        connectionId.getClass();
        BluetoothDevice remoteDevice = a.a(this.context).getRemoteDevice(connectionId);
        String str = Build.MANUFACTURER;
        if (str != null) {
            Locale locale = Locale.ROOT;
            locale.getClass();
            upperCase = str.toUpperCase(locale);
            upperCase.getClass();
        } else {
            upperCase = "";
        }
        return "VIVO".equals(upperCase) || remoteDevice.getBondState() != 12;
    }

    @Override // ss2.b
    public void onDevicePairingPasskeyRequired(String connectionId, int pairingPasskeyTimeout, w passkeyHandler) {
        connectionId.getClass();
        passkeyHandler.getClass();
        AuthRegistry.getInstance().awaitPasskey(connectionId, passkeyHandler, Integer.valueOf(pairingPasskeyTimeout));
    }

    @Override // ss2.b
    public void onOutOfBandPasskeyRequired(String connectionId, w passkeyHandler) {
        connectionId.getClass();
        passkeyHandler.getClass();
        AuthRegistry.getInstance().awaitPasskey(connectionId, passkeyHandler, null);
    }

    @Override // ss2.b
    public void saveAuthenticationInfo(String connectionId, byte[] ltk, byte[] ediv, byte[] randomNumber) {
        connectionId.getClass();
        ltk.getClass();
        ediv.getClass();
        randomNumber.getClass();
        AuthRegistry.getInstance().registerAuthInfo(connectionId, ltk, ediv, randomNumber);
    }

    @Override // ss2.b
    public void saveOutOfBandPasskey(String connectionId, byte[] passkey) {
        connectionId.getClass();
        passkey.getClass();
        AuthRegistry.getInstance().setOutOfBandPasskey(connectionId, passkey);
    }
}
