package com.xiaomi.fitness.eco.device.contact.syncer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.format.DateFormat;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.contact.syncer.TimeSyncer;
import defpackage.o64;
import defpackage.u64;
import defpackage.u7r;
import defpackage.uxo;
import defpackage.w64;
import defpackage.xxo;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/syncer/TimeSyncer;", "Lcom/xiaomi/fitness/eco/device/contact/syncer/DeviceSyncerInternal;", "<init>", "()V", "mTimeBroadcastReceiver", "com/xiaomi/fitness/eco/device/contact/syncer/TimeSyncer$mTimeBroadcastReceiver$1", "Lcom/xiaomi/fitness/eco/device/contact/syncer/TimeSyncer$mTimeBroadcastReceiver$1;", "type", "", "getType", "()I", "syncData", "", "did", "", "callBack", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "Companion", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class TimeSyncer implements DeviceSyncerInternal {

    @NotNull
    private static final String TAG = "TimeSyncer";

    @NotNull
    private final TimeSyncer$mTimeBroadcastReceiver$1 mTimeBroadcastReceiver;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<TimeSyncer> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: wep
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TimeSyncer.instance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/syncer/TimeSyncer$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/eco/device/contact/syncer/TimeSyncer;", "getInstance", "()Lcom/xiaomi/fitness/eco/device/contact/syncer/TimeSyncer;", "instance$delegate", "Lkotlin/Lazy;", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TimeSyncer getInstance() {
            return (TimeSyncer) TimeSyncer.instance$delegate.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.BroadcastReceiver, com.xiaomi.fitness.eco.device.contact.syncer.TimeSyncer$mTimeBroadcastReceiver$1] */
    public TimeSyncer() {
        ?? r0 = new BroadcastReceiver() { // from class: com.xiaomi.fitness.eco.device.contact.syncer.TimeSyncer$mTimeBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel != null) {
                    this.this$0.syncData(wearableDeviceModel.getDid(), null);
                }
            }
        };
        this.mTimeBroadcastReceiver = r0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(r0, intentFilter, 4);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(r0, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeSyncer instance_delegate$lambda$0() {
        return new TimeSyncer();
    }

    @Override // com.xiaomi.fitness.eco.device.contact.syncer.DeviceSyncerInternal
    public int getType() {
        return 4;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.syncer.DeviceSyncerInternal
    public void syncData(@NotNull String did, int type, @Nullable EcoDeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer
    public void syncData(@NotNull String did, @Nullable final EcoDeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        u7r u7rVar = new u7r();
        u7rVar.e = 2;
        u7rVar.f = 3;
        uxo uxoVar = new uxo();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2) + 1;
        o64 o64Var = new o64();
        o64Var.c = calendar.get(1);
        o64Var.d = i;
        o64Var.e = calendar.get(5);
        u64 u64Var = new u64();
        u64Var.c = calendar.get(11);
        u64Var.d = calendar.get(12);
        u64Var.e = calendar.get(13);
        u64Var.f = calendar.get(14);
        w64 w64Var = new w64();
        w64Var.c = ((calendar.get(15) / 1000) / 60) / 15;
        w64Var.d = ((calendar.get(16) / 1000) / 60) / 15;
        w64Var.e = TimeZone.getDefault().getID();
        xxo xxoVar = new xxo();
        xxoVar.c = o64Var;
        xxoVar.d = u64Var;
        xxoVar.e = w64Var;
        xxoVar.f = !DateFormat.is24HourFormat(ApplicationExtKt.getApplication());
        uxoVar.v(xxoVar);
        u7rVar.E(uxoVar);
        o64 o64Var2 = xxoVar.c;
        int i2 = o64Var2.c;
        int i3 = o64Var2.d;
        int i4 = o64Var2.e;
        u64 u64Var2 = xxoVar.d;
        Logger.i(TAG, "syncTime SET_SYSTEM_TIME:" + i2 + "-" + i3 + "-" + i4 + "," + u64Var2.c + ":" + u64Var2.d + ":" + u64Var2.e);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), did, u7rVar, false, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.eco.device.contact.syncer.TimeSyncer.syncData.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                EcoDeviceSyncCallback ecoDeviceSyncCallback = callBack;
                if (ecoDeviceSyncCallback != null) {
                    Intrinsics.checkNotNull(did2);
                    ecoDeviceSyncCallback.onSyncError(did2, this.getType(), String.valueOf(code));
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                EcoDeviceSyncCallback ecoDeviceSyncCallback = callBack;
                if (ecoDeviceSyncCallback != null) {
                    Intrinsics.checkNotNull(did2);
                    ecoDeviceSyncCallback.onSyncSuccess(did2, this.getType(), result);
                }
            }
        }, 0, 16, null);
    }
}
