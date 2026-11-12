package com.xiaomi.fitness.feedback;

import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LockFileUtil;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/feedback/FeedComponent;", "", "<init>", "()V", "initDeviceLog", "", "init", "addDataSyncListener", "backupHuamiLogIfNecessary", "getHuamiLogPath", "", "getHuamiLogBackupPath", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = AIApiConstants.Feedback.NAME)
public final class FeedComponent {

    @NotNull
    private static final String TAG = "FeedComponent";

    private final void addDataSyncListener() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addSyncStateListener(new SyncStateListener() { // from class: com.xiaomi.fitness.feedback.FeedComponent.addDataSyncListener.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    FeedComponent.this.backupHuamiLogIfNecessary();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
            }
        });
    }

    public final void backupHuamiLogIfNecessary() {
        File file = new File(getHuamiLogPath());
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                LockFileUtil lockFileUtil = LockFileUtil.INSTANCE;
                FileChannel channel = fileInputStream.getChannel();
                Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
                FileLock fileLockWaitFileLock = lockFileUtil.waitFileLock(channel, 1000L);
                try {
                    if (file.exists() && file.length() > 5242880) {
                        File file2 = new File(getHuamiLogBackupPath());
                        if (file2.exists()) {
                            file2.delete();
                        }
                        if (fileLockWaitFileLock != null) {
                            file.renameTo(file2);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(fileLockWaitFileLock, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AutoCloseableKt.closeFinally(fileLockWaitFileLock, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(fileInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            Logger.d(TAG, "checkLog: " + e.getMessage());
        }
    }

    @NotNull
    public final String getHuamiLogBackupPath() {
        return Logger.INSTANCE.getLogFilePath() + File.separator + "hmble_log2.log";
    }

    @NotNull
    public final String getHuamiLogPath() {
        return Logger.INSTANCE.getLogFilePath() + File.separator + "hmble_log.log";
    }

    @ComponentTask(multiProcess = false, notEarlierThan = 7, onMainThread = false)
    public final void init() {
        addDataSyncListener();
    }

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void initDeviceLog() {
        HuamiDevice.initLog(ApplicationExtKt.getApplication(), getHuamiLogBackupPath());
    }
}
