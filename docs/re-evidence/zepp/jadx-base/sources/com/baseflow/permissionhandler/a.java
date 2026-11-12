package com.baseflow.permissionhandler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: com.baseflow.permissionhandler.a$a, reason: collision with other inner class name */
    @FunctionalInterface
    public interface InterfaceC0116a {
        void onSuccess(boolean z);
    }

    public void a(Context context, InterfaceC0116a interfaceC0116a, b bVar) {
        if (context == null) {
            Log.d(m.a, "Context cannot be null.");
            bVar.onError("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            interfaceC0116a.onSuccess(true);
        } catch (Exception unused) {
            interfaceC0116a.onSuccess(false);
        }
    }
}
