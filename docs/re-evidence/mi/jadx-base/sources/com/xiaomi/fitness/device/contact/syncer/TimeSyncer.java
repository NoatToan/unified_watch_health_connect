package com.xiaomi.fitness.device.contact.syncer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.format.DateFormat;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.syncer.TimeSyncer;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.n64;
import defpackage.s7r;
import defpackage.t64;
import defpackage.txo;
import defpackage.v64;
import defpackage.wxo;
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
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/device/contact/syncer/TimeSyncer;", "Lcom/xiaomi/fitness/device/contact/syncer/DeviceSyncerInternal;", "<init>", "()V", "mTimeBroadcastReceiver", "com/xiaomi/fitness/device/contact/syncer/TimeSyncer$mTimeBroadcastReceiver$1", "Lcom/xiaomi/fitness/device/contact/syncer/TimeSyncer$mTimeBroadcastReceiver$1;", "type", "", "getType", "()I", "syncData", "", "did", "", "callBack", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "Companion", "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class TimeSyncer implements DeviceSyncerInternal {

    @NotNull
    private static final String TAG = "TimeSyncer";

    @NotNull
    private final TimeSyncer$mTimeBroadcastReceiver$1 mTimeBroadcastReceiver;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<TimeSyncer> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: xep
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TimeSyncer.instance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/contact/syncer/TimeSyncer$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/device/contact/syncer/TimeSyncer;", "getInstance", "()Lcom/xiaomi/fitness/device/contact/syncer/TimeSyncer;", "instance$delegate", "Lkotlin/Lazy;", "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.BroadcastReceiver, com.xiaomi.fitness.device.contact.syncer.TimeSyncer$mTimeBroadcastReceiver$1] */
    public TimeSyncer() {
        ?? r0 = new BroadcastReceiver() { // from class: com.xiaomi.fitness.device.contact.syncer.TimeSyncer$mTimeBroadcastReceiver$1
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
        ApplicationExtKt.getApplication().registerReceiver(r0, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeSyncer instance_delegate$lambda$0() {
        return new TimeSyncer();
    }

    @Override // com.xiaomi.fitness.device.contact.syncer.DeviceSyncerInternal
    public int getType() {
        return 4;
    }

    @Override // com.xiaomi.fitness.device.contact.syncer.DeviceSyncerInternal
    public void syncData(@NotNull String did, int type, @Nullable DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncer
    public void syncData(@NotNull String did, @Nullable final DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 3;
        txo txoVar = new txo();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2) + 1;
        n64 n64Var = new n64();
        n64Var.c = calendar.get(1);
        n64Var.d = i;
        n64Var.e = calendar.get(5);
        t64 t64Var = new t64();
        t64Var.c = calendar.get(11);
        t64Var.d = calendar.get(12);
        t64Var.e = calendar.get(13);
        t64Var.f = calendar.get(14);
        v64 v64Var = new v64();
        v64Var.c = ((calendar.get(15) / 1000) / 60) / 15;
        v64Var.d = ((calendar.get(16) / 1000) / 60) / 15;
        v64Var.e = TimeZone.getDefault().getID();
        wxo wxoVar = new wxo();
        wxoVar.c = n64Var;
        wxoVar.d = t64Var;
        wxoVar.e = v64Var;
        wxoVar.f = !DateFormat.is24HourFormat(ApplicationExtKt.getApplication());
        txoVar.o0(wxoVar);
        s7rVar.c0(txoVar);
        n64 n64Var2 = wxoVar.c;
        int i2 = n64Var2.c;
        int i3 = n64Var2.d;
        int i4 = n64Var2.e;
        t64 t64Var2 = wxoVar.d;
        Logger.i(TAG, "syncTime SET_SYSTEM_TIME:" + i2 + "-" + i3 + "-" + i4 + "," + t64Var2.c + ":" + t64Var2.d + ":" + t64Var2.e + " tz:" + wxoVar.e);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.contact.syncer.TimeSyncer.syncData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                DeviceSyncCallback deviceSyncCallback = callBack;
                if (deviceSyncCallback != null) {
                    Intrinsics.checkNotNull(did2);
                    deviceSyncCallback.onSyncError(did2, this.getType(), String.valueOf(code));
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                DeviceSyncCallback deviceSyncCallback = callBack;
                if (deviceSyncCallback != null) {
                    Intrinsics.checkNotNull(did2);
                    deviceSyncCallback.onSyncSuccess(did2, this.getType(), result);
                }
            }
        }, 3000);
    }
}
