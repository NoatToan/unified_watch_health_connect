package com.huami.device.core.sync;

import android.annotation.SuppressLint;
import android.content.Context;
import com.huami.device.core.sync.api.CancelSyncDevice;
import com.huami.device.core.sync.api.Cancelable;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.api.WorkerExecutor;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.exception.NotSupportException;
import com.huami.device.core.sync.api.worker.AfterSyncWorkerApi;
import com.huami.device.core.sync.impl.sync.ConstKt;
import com.huami.device.core.sync.impl.sync.headset.HMHeadSetSyncImpl;
import com.huami.device.core.sync.impl.sync.hub.HmSensorHubDevice;
import com.huami.device.core.sync.impl.sync.hub.SensorHubSyncImpl;
import com.huami.device.core.sync.impl.sync.mili.MiliSyncDelegate;
import com.huami.device.core.sync.impl.sync.shose.HMShoesSyncCenterImpl;
import com.huami.device.core.sync.impl.sync.smart.HMSmartWatchSyncImpl;
import com.huami.device.core.sync.impl.sync.weight.WeightDeviceSyncCenterImpl;
import com.huami.device.core.sync.impl.woker.AfterSyncWorkerApiImpl;
import com.huami.device.core.sync.impl.woker.WorkerExecutorImpl;
import com.huami.device.core.sync.report.DevMode;
import com.huami.device.core.sync.report.speed.TransferRateService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001_B\t\b\u0002¢\u0006\u0004\b]\u0010^J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\fH\u0003J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010 \u001a\u00020\nJ\u0006\u0010!\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"J\u0010\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%R\u0016\u0010(\u001a\u00020\u00058\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010)\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010D\u001a\u0004\b\u0019\u0010E\"\u0004\bF\u0010GR+\u0010N\u001a\u00020H2\u0006\u0010>\u001a\u00020H8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/huami/device/core/sync/SyncCenterFactory;", "Lcom/huami/device/core/sync/api/Cancelable;", "Lcom/huami/device/core/sync/api/CancelSyncDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "getDeviceIndex", "api", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", g.g, "Lcom/huami/device/core/sync/api/SyncApi;", "createByDeviceType", "target", "updateDynamicVars", "Lcom/huami/device/core/sync/report/DevMode;", "mode", "updateDevMode", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "init$sync_center_release", "(Landroid/content/Context;)V", PointCategory.INIT, "", "isBackground", "getOrCreate", "deviceId", "serialNumber", "getCancelable", "Lcom/huami/device/core/sync/api/WorkerExecutor;", "createWorkerExecutor", "set2ReportMode", "set2ReleaseMode", "Ljava/io/File;", "file", "setReportFilePath", "Lcom/huami/device/core/sync/report/speed/TransferRateService;", "service", "setTransferRateService", "debugTag", "Ljava/lang/String;", "devMode", "Lcom/huami/device/core/sync/report/DevMode;", "getDevMode$sync_center_release", "()Lcom/huami/device/core/sync/report/DevMode;", "setDevMode$sync_center_release", "(Lcom/huami/device/core/sync/report/DevMode;)V", "reportFilePath", "getReportFilePath$sync_center_release", "()Ljava/lang/String;", "setReportFilePath$sync_center_release", "(Ljava/lang/String;)V", "transferRateService", "Lcom/huami/device/core/sync/report/speed/TransferRateService;", "getTransferRateService$sync_center_release", "()Lcom/huami/device/core/sync/report/speed/TransferRateService;", "setTransferRateService$sync_center_release", "(Lcom/huami/device/core/sync/report/speed/TransferRateService;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "cacheMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<set-?>", "context$delegate", "Lkotlin/properties/ReadWriteProperty;", "getContext$sync_center_release", "()Landroid/content/Context;", "setContext$sync_center_release", "Z", "()Z", "setBackground", "(Z)V", "Lcom/huami/device/core/sync/api/SyncStrategy;", "syncStrategy$delegate", "getSyncStrategy", "()Lcom/huami/device/core/sync/api/SyncStrategy;", "setSyncStrategy", "(Lcom/huami/device/core/sync/api/SyncStrategy;)V", "syncStrategy", "Lcom/huami/device/core/sync/SyncCenterFactory$SyncApiBuilderDelegate;", "syncApiDelegateDelegate", "Lcom/huami/device/core/sync/SyncCenterFactory$SyncApiBuilderDelegate;", "getSyncApiDelegateDelegate", "()Lcom/huami/device/core/sync/SyncCenterFactory$SyncApiBuilderDelegate;", "setSyncApiDelegateDelegate", "(Lcom/huami/device/core/sync/SyncCenterFactory$SyncApiBuilderDelegate;)V", "Lcom/huami/device/core/sync/api/worker/AfterSyncWorkerApi;", "afterSyncWorkerApi", "Lcom/huami/device/core/sync/api/worker/AfterSyncWorkerApi;", "getAfterSyncWorkerApi", "()Lcom/huami/device/core/sync/api/worker/AfterSyncWorkerApi;", "setAfterSyncWorkerApi", "(Lcom/huami/device/core/sync/api/worker/AfterSyncWorkerApi;)V", "<init>", "()V", "SyncApiBuilderDelegate", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"StaticFieldLeak"})
public final class SyncCenterFactory implements Cancelable, CancelSyncDevice {

    @Nullable
    private static AfterSyncWorkerApi afterSyncWorkerApi = null;

    /* JADX INFO: renamed from: context$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty context;

    @NotNull
    public static final String debugTag = "SyncCenter";
    private static boolean isBackground;

    @Nullable
    private static SyncApiBuilderDelegate syncApiDelegateDelegate;

    /* JADX INFO: renamed from: syncStrategy$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty syncStrategy;

    @Nullable
    private static TransferRateService transferRateService;
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SyncCenterFactory.class, DbUtils.Const.Table.CONTEXT, "getContext$sync_center_release()Landroid/content/Context;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SyncCenterFactory.class, "syncStrategy", "getSyncStrategy()Lcom/huami/device/core/sync/api/SyncStrategy;", 0))};

    @NotNull
    public static final SyncCenterFactory INSTANCE = new SyncCenterFactory();

    @NotNull
    private static DevMode devMode = DevMode.RELEASE;

    @NotNull
    private static String reportFilePath = "report/sync_report.csv";

    @NotNull
    private static final ConcurrentHashMap<String, SyncApi> cacheMap = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/device/core/sync/SyncCenterFactory$SyncApiBuilderDelegate;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "intercept", "Lcom/huami/device/core/sync/api/SyncApi;", "createByDeviceType", "sync-center_release"}, k = 1, mv = {1, 5, 1})
    public interface SyncApiBuilderDelegate {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class DefaultImpls {
            public static boolean intercept(@NotNull SyncApiBuilderDelegate syncApiBuilderDelegate, @NotNull HMBaseDevice hMBaseDevice) {
                return false;
            }
        }

        @Nullable
        SyncApi createByDeviceType(@NotNull HMBaseDevice device);

        boolean intercept(@NotNull HMBaseDevice device);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.MILI.ordinal()] = 1;
            iArr[HMDeviceType.SENSORHUB.ordinal()] = 2;
            iArr[HMDeviceType.SHOES.ordinal()] = 3;
            iArr[HMDeviceType.WEIGHT.ordinal()] = 4;
            iArr[HMDeviceType.WATCH.ordinal()] = 5;
            iArr[HMDeviceType.HEADSET.ordinal()] = 6;
            iArr[HMDeviceType.OTHER.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Delegates delegates = Delegates.INSTANCE;
        context = delegates.notNull();
        isBackground = true;
        syncStrategy = delegates.notNull();
        afterSyncWorkerApi = new AfterSyncWorkerApiImpl();
    }

    private SyncCenterFactory() {
    }

    @ExperimentalCoroutinesApi
    private final SyncApi createByDeviceType(HMBaseDevice device) throws NotSupportException {
        SyncApi syncApiCreateByDeviceType;
        SyncApiBuilderDelegate syncApiBuilderDelegate = syncApiDelegateDelegate;
        boolean z = false;
        if (syncApiBuilderDelegate != null && syncApiBuilderDelegate.intercept(device)) {
            z = true;
        }
        if (z && (syncApiCreateByDeviceType = syncApiDelegateDelegate.createByDeviceType(device)) != null) {
            return syncApiCreateByDeviceType;
        }
        HMDeviceType deviceType = device.getDeviceType();
        switch (deviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()]) {
            case 1:
                return new MiliSyncDelegate();
            case 2:
                return new SensorHubSyncImpl(new HmSensorHubDevice(getContext$sync_center_release()));
            case 3:
                return new HMShoesSyncCenterImpl();
            case 4:
                return new WeightDeviceSyncCenterImpl();
            case 5:
                return new HMSmartWatchSyncImpl();
            case 6:
                return new HMHeadSetSyncImpl();
            case 7:
                throw new NotSupportException(null, null, 3, null);
            default:
                throw new NotSupportException(null, null, 3, null);
        }
    }

    private final String getDeviceIndex(HMBaseDevice device) {
        if (device.getDeviceType() == HMDeviceType.SENSORHUB || device.getDeviceType() == HMDeviceType.VDevice) {
            return String.valueOf(device.hashCode());
        }
        StringBuilder sb = new StringBuilder();
        DeviceInfo deviceInfo = device.getDeviceInfo();
        sb.append((Object) (deviceInfo == null ? null : deviceInfo.getDeviceID()));
        sb.append('-');
        DeviceInfo deviceInfo2 = device.getDeviceInfo();
        sb.append((Object) (deviceInfo2 != null ? deviceInfo2.getSerialNumber() : null));
        return sb.toString();
    }

    public static /* synthetic */ SyncApi getOrCreate$default(SyncCenterFactory syncCenterFactory, HMBaseDevice hMBaseDevice, boolean z, int i, Object obj) throws NotSupportException {
        if ((i & 2) != 0) {
            z = true;
        }
        return syncCenterFactory.getOrCreate(hMBaseDevice, z);
    }

    private final void updateDevMode(DevMode mode) {
        devMode = mode;
    }

    @ExperimentalCoroutinesApi
    private final void updateDynamicVars(HMBaseDevice device, SyncApi target) {
        ConstKt.injectDevice(target, device);
        ConstKt.injectJobStrategy(target);
    }

    @Override // com.huami.device.core.sync.api.Cancelable
    public void cancel() {
        Iterator it2 = CollectionsKt__IteratorsJVMKt.iterator(cacheMap.elements());
        while (it2.hasNext()) {
            SyncApi syncApi = (SyncApi) it2.next();
            if (syncApi instanceof Cancelable) {
                try {
                    ((Cancelable) syncApi).cancel();
                } catch (Throwable th) {
                    HMLog.e("SyncCenter", "cancel error", th);
                }
            }
        }
        cacheMap.clear();
    }

    @Nullable
    public final WorkerExecutor createWorkerExecutor() {
        if (afterSyncWorkerApi != null) {
            return new WorkerExecutorImpl(afterSyncWorkerApi);
        }
        return null;
    }

    @Nullable
    public final AfterSyncWorkerApi getAfterSyncWorkerApi() {
        return afterSyncWorkerApi;
    }

    @Override // com.huami.device.core.sync.api.CancelSyncDevice
    @ExperimentalCoroutinesApi
    @Nullable
    public Cancelable getCancelable(@NotNull HMBaseDevice device) throws NotSupportException {
        SyncApi orCreate$default = getOrCreate$default(this, device, false, 2, null);
        if (orCreate$default instanceof Cancelable) {
            return (Cancelable) orCreate$default;
        }
        return null;
    }

    @NotNull
    public final Context getContext$sync_center_release() {
        return (Context) context.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final DevMode getDevMode$sync_center_release() {
        return devMode;
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public final synchronized SyncApi getOrCreate(@NotNull HMBaseDevice device, boolean isBackground2) throws NotSupportException {
        isBackground = isBackground2;
        try {
            String deviceIndex = getDeviceIndex(device);
            HMLog.i("SyncCenter", Intrinsics.stringPlus("cache key : ", deviceIndex), new Object[0]);
            ConcurrentHashMap<String, SyncApi> concurrentHashMap = cacheMap;
            if (concurrentHashMap.get(deviceIndex) != null) {
                SyncApi syncApi = concurrentHashMap.get(deviceIndex);
                updateDynamicVars(device, syncApi);
                return syncApi;
            }
            SyncApi syncApiCreateByDeviceType = createByDeviceType(device);
            concurrentHashMap.put(deviceIndex, syncApiCreateByDeviceType);
            updateDynamicVars(device, syncApiCreateByDeviceType);
            return syncApiCreateByDeviceType;
        } catch (Exception e) {
            throw new ConfigException("error", e);
        }
    }

    @NotNull
    public final String getReportFilePath$sync_center_release() {
        return reportFilePath;
    }

    @Nullable
    public final SyncApiBuilderDelegate getSyncApiDelegateDelegate() {
        return syncApiDelegateDelegate;
    }

    @NotNull
    public final SyncStrategy getSyncStrategy() {
        return (SyncStrategy) syncStrategy.getValue(this, $$delegatedProperties[1]);
    }

    @Nullable
    public final TransferRateService getTransferRateService$sync_center_release() {
        return transferRateService;
    }

    public final void init$sync_center_release(@NotNull Context context2) {
        setContext$sync_center_release(context2);
    }

    public final boolean isBackground() {
        return isBackground;
    }

    public final void set2ReleaseMode() {
        updateDevMode(DevMode.RELEASE);
    }

    public final void set2ReportMode() {
        updateDevMode(DevMode.REPORT);
    }

    public final void setAfterSyncWorkerApi(@Nullable AfterSyncWorkerApi afterSyncWorkerApi2) {
        afterSyncWorkerApi = afterSyncWorkerApi2;
    }

    public final void setBackground(boolean z) {
        isBackground = z;
    }

    public final void setContext$sync_center_release(@NotNull Context context2) {
        context.setValue(this, $$delegatedProperties[0], context2);
    }

    public final void setDevMode$sync_center_release(@NotNull DevMode devMode2) {
        devMode = devMode2;
    }

    public final void setReportFilePath(@NotNull File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("make sure file exits.");
        }
        reportFilePath = file.getAbsolutePath();
    }

    public final void setReportFilePath$sync_center_release(@NotNull String str) {
        reportFilePath = str;
    }

    public final void setSyncApiDelegateDelegate(@Nullable SyncApiBuilderDelegate syncApiBuilderDelegate) {
        syncApiDelegateDelegate = syncApiBuilderDelegate;
    }

    public final void setSyncStrategy(@NotNull SyncStrategy syncStrategy2) {
        syncStrategy.setValue(this, $$delegatedProperties[1], syncStrategy2);
    }

    public final void setTransferRateService(@Nullable TransferRateService service) {
        transferRateService = service;
    }

    public final void setTransferRateService$sync_center_release(@Nullable TransferRateService transferRateService2) {
        transferRateService = transferRateService2;
    }

    public final void cancel(@Nullable final String deviceId, @Nullable final String serialNumber) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) deviceId);
        sb.append('-');
        sb.append((Object) serialNumber);
        SyncApi syncApi = cacheMap.get(sb.toString());
        if (syncApi == null) {
            return;
        }
        if (syncApi instanceof Cancelable) {
            cancel((Cancelable) syncApi, HMDeviceType.MILI);
        } else {
            HMLog.warn$default("SyncCenter", null, new Function0<String>() { // from class: com.huami.device.core.sync.SyncCenterFactory.cancel.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "call cancel error, device [" + ((Object) deviceId) + " - " + ((Object) serialNumber) + "] not implement cancelable.";
                }
            }, 2, null);
        }
    }

    @ExperimentalCoroutinesApi
    public final void cancel(@NotNull HMBaseDevice device) {
        cancel(getCancelable(device), device.getDeviceType());
    }

    private final void cancel(Cancelable api, final HMDeviceType type) {
        String str = null;
        try {
            if (api == null) {
                HMLog.warn$default("SyncCenter", null, new Function0<String>() { // from class: com.huami.device.core.sync.SyncCenterFactory.cancel.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "call cancel error, device [" + type + "] not implement cancelable.";
                    }
                }, 2, null);
                return;
            }
            api.cancel();
            Iterator it2 = CollectionsKt__IteratorsJVMKt.iterator(cacheMap.keys());
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (Intrinsics.areEqual(cacheMap.get(str2), api)) {
                    str = str2;
                    break;
                }
            }
            if (str == null) {
                return;
            }
            cacheMap.remove(str);
        } catch (Throwable th) {
            HMLog.error$default("SyncCenter", null, th, new Function0<String>() { // from class: com.huami.device.core.sync.SyncCenterFactory.cancel.4
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "cancel device sync error .";
                }
            }, 2, null);
        }
    }
}
