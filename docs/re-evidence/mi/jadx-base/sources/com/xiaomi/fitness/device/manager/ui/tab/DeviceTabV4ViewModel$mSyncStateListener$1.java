package com.xiaomi.fitness.device.manager.ui.tab;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.extensions.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$mSyncStateListener$1;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$mSyncStateListener$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceTabV4ViewModel$mSyncStateListener$1 implements SyncStateListener {
    final /* synthetic */ DeviceTabV4ViewModel this$0;

    public DeviceTabV4ViewModel$mSyncStateListener$1(DeviceTabV4ViewModel deviceTabV4ViewModel) {
        this.this$0 = deviceTabV4ViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$0(DeviceTabV4ViewModel this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        this$0.loadBattery(did);
    }

    @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
    public void onFinish(String did, int code) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(this.this$0.getTAG(), "mSyncStateListener.mSyncStateListener.onFinish  did:" + did + "  code:" + code);
        if (DeviceManagerExtKt.isSyncing(this.this$0.mDeviceManager, did)) {
            if (code == 0) {
                this.this$0.updateDialStatus(did, 7);
            } else {
                this.this$0.updateDialStatus(did, 5);
            }
        }
    }

    @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
    public void onStart(final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(this.this$0.getTAG(), "mSyncStateListener.onStart  " + did);
        if (DeviceManagerExtKt.isSyncing(this.this$0.mDeviceManager, did)) {
            this.this$0.updateDialStatus(did, 6);
        }
        final DeviceTabV4ViewModel deviceTabV4ViewModel = this.this$0;
        ExecutorHelper.postInMain(new Runnable() { // from class: yt6
            @Override // java.lang.Runnable
            public final void run() {
                DeviceTabV4ViewModel$mSyncStateListener$1.onStart$lambda$0(deviceTabV4ViewModel, did);
            }
        }, 100L);
    }

    @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
    public void onSyncing(String did, int progress) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(this.this$0.getTAG(), "mSyncStateListener.onSyncing  " + did);
    }
}
