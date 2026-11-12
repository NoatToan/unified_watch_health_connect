package com.xiaomi.xms.wearable.ui.appshop.manager;

import android.os.Handler;
import android.os.Looper;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.xms.wearable.extensions.DeviceModelExtKt;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppInstallManager;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import defpackage.eu6;
import defpackage.lg1;
import defpackage.x1j;
import java.io.File;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager;", "", "<init>", "()V", "mActive", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppTask;", "mTaskQueue", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager$TaskQueue;", "mHandler", "Landroid/os/Handler;", PluginPackageConstant.RN_INSTALL_DIR_KEY, "", "packageName", "", CommonConstants.KEY_VERSION_CODE, "", "unInstall", "fingerPrint", "", "offerTask", "task", "scheduleNext", "TaskQueue", "InstallTask", "UnInstallTask", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppInstallManager {
    private static final long DEFAULT_TIMEOUT_MILLS = 120000;
    private static final int MAX_CAPACITY = 10;

    @Nullable
    private AppTask mActive;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AppInstallManager> INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: mg1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppInstallManager.INSTANCE_delegate$lambda$0();
        }
    });

    @NotNull
    private final TaskQueue mTaskQueue = new TaskQueue(10);

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager$Companion;", "", "<init>", "()V", "MAX_CAPACITY", "", "DEFAULT_TIMEOUT_MILLS", "", "INSTANCE", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager;", "getINSTANCE", "()Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppInstallManager getINSTANCE() {
            return (AppInstallManager) AppInstallManager.INSTANCE$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0014\u0010\u001f\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006!"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager$InstallTask;", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppTask;", Constants.KEY_PACKAGE_NAME, "", CommonConstants.KEY_VERSION_CODE, "", "filePath", "<init>", "(Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager;Ljava/lang/String;ILjava/lang/String;)V", "getVersionCode", "()I", "getFilePath", "()Ljava/lang/String;", "mTimeoutCallback", "Ljava/lang/Runnable;", "mStatusListener", "com/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager$InstallTask$mStatusListener$1", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager$InstallTask$mStatusListener$1;", StatConstants.PARAM_START, "", "onTaskFinished", "success", "", "prepareInstall", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "packageName", "file", "Ljava/io/File;", "sendRpkFile", "segmentLength", "onTransmitFailed", Constants.EXTRA_ERROR_MESSAGE, "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class InstallTask extends AppTask {

        @NotNull
        private final String filePath;

        @NotNull
        private final AppInstallManager$InstallTask$mStatusListener$1 mStatusListener;

        @NotNull
        private final Runnable mTimeoutCallback;
        final /* synthetic */ AppInstallManager this$0;
        private final int versionCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.xiaomi.xms.wearable.ui.appshop.manager.AppInstallManager$InstallTask$mStatusListener$1] */
        public InstallTask(@NotNull final AppInstallManager appInstallManager, String pkgName, @NotNull int i, String filePath) {
            super(pkgName);
            Intrinsics.checkNotNullParameter(pkgName, "pkgName");
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            this.this$0 = appInstallManager;
            this.versionCode = i;
            this.filePath = filePath;
            this.mTimeoutCallback = new Runnable() { // from class: ng1
                @Override // java.lang.Runnable
                public final void run() {
                    AppInstallManager.InstallTask.mTimeoutCallback$lambda$0(this.f27897a);
                }
            };
            this.mStatusListener = new Function1<AppStatusInfo, Unit>() { // from class: com.xiaomi.xms.wearable.ui.appshop.manager.AppInstallManager$InstallTask$mStatusListener$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(AppStatusInfo appStatusInfo) {
                    invoke2(appStatusInfo);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public void invoke2(AppStatusInfo statusInfo) {
                    Integer numValueOf = statusInfo != null ? Integer.valueOf(statusInfo.getStatus()) : null;
                    if ((numValueOf != null && numValueOf.intValue() == 11) || (numValueOf != null && numValueOf.intValue() == 12)) {
                        lg1.d(this.this$0.getMName() + " install result:" + statusInfo.getStatus());
                        appInstallManager.mHandler.removeCallbacks(this.this$0.mTimeoutCallback);
                        AppStatusManager.INSTANCE.getINSTANCE().removeStatusListener(this.this$0.getPackageName(), this);
                        appInstallManager.scheduleNext();
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void mTimeoutCallback$lambda$0(InstallTask this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            lg1.b(this$0.getMName() + " install timeout!");
            AppTask.updateStatus$default(this$0, 12, 0, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onTransmitFailed(String errorMsg) {
            lg1.b(getMName() + " onTransmitFailed: " + errorMsg);
            this.this$0.mHandler.removeCallbacks(this.mTimeoutCallback);
            AppStatusManager.INSTANCE.getINSTANCE().removeStatusListener(getPackageName(), this.mStatusListener);
            updateStatus(9, 0, errorMsg);
            onTaskFinished(false);
        }

        public static /* synthetic */ void onTransmitFailed$default(InstallTask installTask, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            installTask.onTransmitFailed(str);
        }

        private final void prepareInstall(final WearableDeviceModel deviceModel, String packageName, int versionCode, final File file) {
            int length = (int) file.length();
            lg1.d("packageName " + getMName() + " prepareInstallApp " + length);
            DeviceModelExtKt.prepareInstallApp(deviceModel, packageName, versionCode, length, new eu6<Integer>() { // from class: com.xiaomi.xms.wearable.ui.appshop.manager.AppInstallManager$InstallTask$prepareInstall$1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    if (errorCode == 3) {
                        this.this$0.onTransmitFailed(ApplicationExtKt.getApplication().getString(x1j.F));
                    } else {
                        AppInstallManager.InstallTask.onTransmitFailed$default(this.this$0, null, 1, null);
                    }
                }

                @Override // defpackage.eu6
                public void onResult(Integer segmentLength) {
                    if (segmentLength == null) {
                        AppInstallManager.InstallTask.onTransmitFailed$default(this.this$0, null, 1, null);
                        return;
                    }
                    AppInstallManager.InstallTask installTask = this.this$0;
                    WearableDeviceModel wearableDeviceModel = deviceModel;
                    File file2 = file;
                    lg1.d(installTask.getMName() + " prepareInstallApp DeviceTaskCallBack");
                    installTask.sendRpkFile(wearableDeviceModel, file2, segmentLength.intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void sendRpkFile(WearableDeviceModel deviceModel, File file, int segmentLength) {
            lg1.d("sendRpkFile start " + file.getAbsolutePath());
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(deviceModel.getDid(), 4, 0, file.getAbsolutePath(), segmentLength, new SyncStateListener() { // from class: com.xiaomi.xms.wearable.ui.appshop.manager.AppInstallManager$InstallTask$sendRpkFile$1
                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onFinish(String did, int code) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    if (code == 0) {
                        lg1.d(this.this$0.getMName() + " sendRpkFile onComplete");
                        AppTask.updateStatus$default(this.this$0, 10, 0, null, 6, null);
                        return;
                    }
                    lg1.d(this.this$0.getMName() + " sendRpkFile onFinish code" + code);
                    AppInstallManager.InstallTask.onTransmitFailed$default(this.this$0, null, 1, null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onStart(String did) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    lg1.d(this.this$0.getMName() + " sendRpkFile onStart");
                }

                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onSyncing(String did, int progress) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    lg1.a(this.this$0.getMName() + " sendRpkFile onProgress " + progress);
                    AppTask.updateStatus$default(this.this$0, 8, progress, null, 4, null);
                }
            });
        }

        @NotNull
        public final String getFilePath() {
            return this.filePath;
        }

        public final int getVersionCode() {
            return this.versionCode;
        }

        @Override // com.xiaomi.xms.wearable.ui.appshop.manager.AppTask
        public void onTaskFinished(boolean success) {
            lg1.d(getMName() + " finish:" + success);
            this.this$0.scheduleNext();
        }

        @Override // com.xiaomi.xms.wearable.ui.appshop.manager.AppTask
        public void start() {
            lg1.d(getMName() + " start");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null) {
                onTransmitFailed(ApplicationExtKt.getApplication().getString(x1j.c));
                return;
            }
            AppInstallManager appInstallManager = this.this$0;
            AppStatusManager.Companion companion = AppStatusManager.INSTANCE;
            AppStatusManager.Companion.updateStatus$default(companion, getPackageName(), 8, 0, null, 12, null);
            companion.getINSTANCE().addStatusListener(getPackageName(), this.mStatusListener);
            prepareInstall(wearableDeviceModel, getPackageName(), this.versionCode, new File(this.filePath));
            appInstallManager.mHandler.postDelayed(this.mTimeoutCallback, 120000L);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager$TaskQueue;", "Ljava/util/LinkedList;", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppTask;", "capacity", "", "<init>", "(I)V", "getCapacity", "()I", "offer", "", "task", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TaskQueue extends LinkedList<AppTask> {
        private final int capacity;

        public TaskQueue(int i) {
            this.capacity = i;
        }

        public /* bridge */ boolean contains(AppTask appTask) {
            return super.contains((Object) appTask);
        }

        public final int getCapacity() {
            return this.capacity;
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ int indexOf(AppTask appTask) {
            return super.indexOf((Object) appTask);
        }

        public /* bridge */ int lastIndexOf(AppTask appTask) {
            return super.lastIndexOf((Object) appTask);
        }

        @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final /* bridge */ AppTask remove(int i) {
            return removeAt(i);
        }

        public /* bridge */ AppTask removeAt(int i) {
            return (AppTask) super.remove(i);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof AppTask) {
                return contains((AppTask) obj);
            }
            return false;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof AppTask) {
                return indexOf((AppTask) obj);
            }
            return -1;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof AppTask) {
                return lastIndexOf((AppTask) obj);
            }
            return -1;
        }

        @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
        public boolean offer(@Nullable AppTask task) {
            boolean zOffer = super.offer(task);
            lg1.d("offerTask " + zOffer + ": " + task + " " + size() + " " + this.capacity);
            if (task instanceof InstallTask) {
                AppStatusManager.Companion.updateStatus$default(AppStatusManager.INSTANCE, ((InstallTask) task).getPackageName(), zOffer ? 7 : 9, 0, null, 12, null);
            } else if (task instanceof UnInstallTask) {
                AppStatusManager.Companion.updateStatus$default(AppStatusManager.INSTANCE, ((UnInstallTask) task).getPackageName(), zOffer ? 13 : 16, 0, null, 12, null);
            }
            return zOffer;
        }

        public /* bridge */ boolean remove(AppTask appTask) {
            return super.remove((Object) appTask);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof AppTask) {
                return remove((AppTask) obj);
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager$UnInstallTask;", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppTask;", Constants.KEY_PACKAGE_NAME, "", "fingerPrint", "", "<init>", "(Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppInstallManager;Ljava/lang/String;[B)V", "getFingerPrint", "()[B", StatConstants.PARAM_START, "", "onTaskFinished", "success", "", "doUninstall", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class UnInstallTask extends AppTask {

        @NotNull
        private final byte[] fingerPrint;
        final /* synthetic */ AppInstallManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnInstallTask(@NotNull AppInstallManager appInstallManager, @NotNull String pkgName, byte[] fingerPrint) {
            super(pkgName);
            Intrinsics.checkNotNullParameter(pkgName, "pkgName");
            Intrinsics.checkNotNullParameter(fingerPrint, "fingerPrint");
            this.this$0 = appInstallManager;
            this.fingerPrint = fingerPrint;
        }

        private final void doUninstall(WearableDeviceModel deviceModel) {
            DeviceModelExtKt.uninstallApp(deviceModel, getPackageName(), this.fingerPrint, new eu6<Unit>() { // from class: com.xiaomi.xms.wearable.ui.appshop.manager.AppInstallManager$UnInstallTask$doUninstall$1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    lg1.b("doUninstall " + this.this$0.getMName() + " failed:" + errorCode);
                    AppTask.updateStatus$default(this.this$0, 16, 0, null, 6, null);
                    this.this$0.onTaskFinished(false);
                }

                @Override // defpackage.eu6
                public void onResult(Unit result) {
                    lg1.d("doUninstall " + this.this$0.getMName() + " success");
                    AppTask.updateStatus$default(this.this$0, 15, 0, null, 6, null);
                    AppTask.updateStatus$default(this.this$0, 0, 0, null, 6, null);
                    this.this$0.onTaskFinished(true);
                }
            });
        }

        @NotNull
        public final byte[] getFingerPrint() {
            return this.fingerPrint;
        }

        @Override // com.xiaomi.xms.wearable.ui.appshop.manager.AppTask
        public void onTaskFinished(boolean success) {
            lg1.d(getMName() + " finish:" + success);
            this.this$0.scheduleNext();
        }

        @Override // com.xiaomi.xms.wearable.ui.appshop.manager.AppTask
        public void start() {
            AppTask.updateStatus$default(this, 14, 0, null, 6, null);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null) {
                AppTask.updateStatus$default(this, 16, 0, null, 6, null);
                return;
            }
            lg1.d(getMName() + " start");
            doUninstall(wearableDeviceModel);
        }
    }

    private AppInstallManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppInstallManager INSTANCE_delegate$lambda$0() {
        return new AppInstallManager();
    }

    private final synchronized void offerTask(AppTask task) {
        this.mTaskQueue.offer(task);
        if (this.mActive == null) {
            scheduleNext();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void scheduleNext() {
        AppTask appTaskPoll = this.mTaskQueue.poll();
        this.mActive = appTaskPoll;
        if (appTaskPoll != null) {
            appTaskPoll.start();
        }
    }

    public final void install(@NotNull String packageName, int versionCode) {
        InstallTask installTask;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        File file = new File(AppDownloadManager.INSTANCE.getINSTANCE().getAppFilePath(packageName));
        if (file.exists()) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            installTask = new InstallTask(this, packageName, versionCode, absolutePath);
        } else {
            lg1.b("install " + packageName + " failed: file nor exists");
            installTask = null;
        }
        offerTask(installTask);
    }

    public final void unInstall(@NotNull String packageName, @NotNull byte[] fingerPrint) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(fingerPrint, "fingerPrint");
        offerTask(new UnInstallTask(this, packageName, fingerPrint));
    }
}
