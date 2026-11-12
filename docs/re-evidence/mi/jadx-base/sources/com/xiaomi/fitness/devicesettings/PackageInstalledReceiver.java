package com.xiaomi.fitness.devicesettings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mi.fitness.capability.export.CapabilityManager;
import com.mi.fitness.capability.export.CapabilityManagerExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bigdata.ExistRecordSyncer;
import defpackage.bc0;
import defpackage.p90;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/PackageInstalledReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PackageInstalledReceiver extends BroadcastReceiver {

    @NotNull
    private static final String TAG = "PackageInstalledReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(TAG, "onReceive action: " + intent.getAction());
        String schemeSpecificPart = "";
        if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.PACKAGE_ADDED")) {
            String dataString = intent.getDataString();
            if (dataString != null) {
                schemeSpecificPart = dataString;
            }
        } else if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.PACKAGE_REPLACED")) {
            Uri data = intent.getData();
            Intrinsics.checkNotNull(data);
            schemeSpecificPart = data.getSchemeSpecificPart();
        } else if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.PACKAGE_REMOVED")) {
            Uri data2 = intent.getData();
            Intrinsics.checkNotNull(data2);
            schemeSpecificPart = data2.getSchemeSpecificPart();
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) schemeSpecificPart, (CharSequence) "com.android.soundrecorder", false, 2, (Object) null)) {
            Logger.i(TAG, "update capability");
            s7r s7rVar = new s7r();
            s7rVar.e = 1;
            s7rVar.f = 31;
            p90 p90Var = new p90();
            bc0 bc0Var = new bc0();
            bc0Var.c = CapabilityManagerExtKt.getInstance(CapabilityManager.INSTANCE).getCapabilitiesInt();
            p90Var.I(bc0Var);
            s7rVar.M(p90Var);
            Logger.i(TAG, "packet " + s7rVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                ExistRecordSyncer.INSTANCE.sync(wearableDeviceModel.getDid());
            }
        }
    }
}
