package com.xiaomi.hm.health.atrialfibrillation;

import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.health.afppg.model.AFPPGDataFragment;
import com.huami.health.afppg.model.AFPPGDeviceGeneralInfo;
import com.huami.health.afppg.service.ISyncAfPPGDeviceApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import com.xiaomi.hm.health.starsky.api.gdsp.GdspStarSkyApiImpl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/atrialfibrillation/SyncAfPPGDeviceApiImpl;", "Lcom/huami/health/afppg/service/ISyncAfPPGDeviceApi;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/health/afppg/model/AFPPGDeviceGeneralInfo;", "getDeviceInfo", "Ljava/util/Calendar;", "syncTime", "", "Lcom/huami/health/afppg/model/AFPPGDataFragment;", "syncAfAccFromDevice", "syncAfPpgFromDevice", "syncAfResultFromDevice", "syncAfTimeStampFromDevice", "syncHighLowHRFromDevice", "syncHighLowPpgFromDevice", "syncRRPeakFromDevice", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SyncAfPPGDeviceApiImpl implements ISyncAfPPGDeviceApi, KoinComponent {

    @NotNull
    private static final String b = "AtrialSync";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public SyncAfPPGDeviceApiImpl() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.atrialfibrillation.SyncAfPPGDeviceApiImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // com.huami.health.afppg.service.ISyncAfPPGDeviceApi
    @NotNull
    public AFPPGDeviceGeneralInfo getDeviceInfo() {
        HMBaseDevice miliDevice = a().getMiliDevice();
        if (miliDevice == null) {
            return new AFPPGDeviceGeneralInfo(0, null, null, null, 15, null);
        }
        DeviceInfo deviceInfo = miliDevice.getDeviceInfo();
        return deviceInfo == null ? new AFPPGDeviceGeneralInfo(0, null, null, null, 15, null) : new AFPPGDeviceGeneralInfo(deviceInfo.getDeviceSource().getValue(), miliDevice.getDeviceInfo().getFirmwareVersionStr(), miliDevice.getDeviceInfo().getSerialNumber(), miliDevice.getDeviceInfo().getDeviceID());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.health.afppg.service.ISyncAfPPGDeviceApi
    @NotNull
    public List<AFPPGDataFragment> syncAfAccFromDevice(@NotNull Calendar syncTime) throws InterruptedException {
        HMBaseDevice miliDevice = a().getMiliDevice();
        final ArrayList arrayList = null;
        if (miliDevice != null) {
            if (!(miliDevice instanceof HMMiLiProDevice)) {
                miliDevice = null;
            }
            if (miliDevice != null) {
                arrayList = new ArrayList();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                ((HMMiLiProDevice) miliDevice).startSyncRawData(syncTime, 30, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.atrialfibrillation.SyncAfPPGDeviceApiImpl$syncAfAccFromDevice$2$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "sync atrial af result, ret:" + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        super.onFinish(result);
                        HMLog.info("AtrialSync", new a(result));
                        countDownLatch.countDown();
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onData(@Nullable HmGdspRawData t) {
                        super.onData(t);
                        if (t == null) {
                            return;
                        }
                        arrayList.add(new AFPPGDataFragment(t.getCal(), ArraysKt___ArraysKt.toList(t.getRawData()), t.getDataType()));
                    }
                });
                countDownLatch.await();
            }
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // com.huami.health.afppg.service.ISyncAfPPGDeviceApi
    @NotNull
    public List<AFPPGDataFragment> syncAfPpgFromDevice(@NotNull Calendar syncTime) throws InterruptedException {
        HMBaseDevice miliDevice = a().getMiliDevice();
        final ArrayList arrayList = null;
        if (miliDevice != null) {
            if (!(miliDevice instanceof HMMiLiProDevice)) {
                miliDevice = null;
            }
            if (miliDevice != null) {
                arrayList = new ArrayList();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                ((HMMiLiProDevice) miliDevice).startSyncRawData(syncTime, 11, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.atrialfibrillation.SyncAfPPGDeviceApiImpl$syncAfPpgFromDevice$2$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "sync atrial af ppg, ret:" + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        super.onFinish(result);
                        countDownLatch.countDown();
                        HMLog.info("AtrialSync", new a(result));
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onData(@Nullable HmGdspRawData t) {
                        super.onData(t);
                        if (t == null) {
                            return;
                        }
                        arrayList.add(new AFPPGDataFragment(t.getCal(), ArraysKt___ArraysKt.toList(t.getRawData()), t.getDataType()));
                    }
                });
                countDownLatch.await();
            }
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // com.huami.health.afppg.service.ISyncAfPPGDeviceApi
    @NotNull
    public List<AFPPGDataFragment> syncAfResultFromDevice(@NotNull Calendar syncTime) throws InterruptedException {
        HMBaseDevice miliDevice = a().getMiliDevice();
        final ArrayList arrayList = null;
        if (miliDevice != null) {
            if (!(miliDevice instanceof HMMiLiProDevice)) {
                miliDevice = null;
            }
            if (miliDevice != null) {
                arrayList = new ArrayList();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                ((HMMiLiProDevice) miliDevice).startSyncRawData(syncTime, 17, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.atrialfibrillation.SyncAfPPGDeviceApiImpl$syncAfResultFromDevice$2$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "sync atrial af result, ret:" + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        super.onFinish(result);
                        countDownLatch.countDown();
                        HMLog.info("AtrialSync", new a(result));
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onData(@Nullable HmGdspRawData t) {
                        super.onData(t);
                        if (t == null) {
                            return;
                        }
                        arrayList.add(new AFPPGDataFragment(t.getCal(), ArraysKt___ArraysKt.toList(t.getRawData()), t.getDataType()));
                    }
                });
                countDownLatch.await();
            }
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // com.huami.health.afppg.service.ISyncAfPPGDeviceApi
    @NotNull
    public List<AFPPGDataFragment> syncAfTimeStampFromDevice(@NotNull Calendar syncTime) {
        return new ArrayList();
    }

    @Override // com.huami.health.afppg.service.ISyncAfPPGDeviceApi
    @NotNull
    public List<AFPPGDataFragment> syncHighLowHRFromDevice(@NotNull Calendar syncTime) {
        return new ArrayList();
    }

    @Override // com.huami.health.afppg.service.ISyncAfPPGDeviceApi
    @NotNull
    public List<AFPPGDataFragment> syncHighLowPpgFromDevice(@NotNull Calendar syncTime) {
        return new ArrayList();
    }

    @Override // com.huami.health.afppg.service.ISyncAfPPGDeviceApi
    @NotNull
    public List<AFPPGDataFragment> syncRRPeakFromDevice(@NotNull Calendar syncTime) throws InterruptedException {
        HMBaseDevice miliDevice = a().getMiliDevice();
        final ArrayList arrayList = null;
        if (miliDevice != null) {
            if (!(miliDevice instanceof HMMiLiProDevice)) {
                miliDevice = null;
            }
            if (miliDevice != null) {
                arrayList = new ArrayList();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final ArrayList arrayList2 = new ArrayList();
                ((HMMiLiProDevice) miliDevice).startSyncRawData(syncTime, 8, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.atrialfibrillation.SyncAfPPGDeviceApiImpl$syncRRPeakFromDevice$2$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "sync atrial af rrpeak, ret:" + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        super.onFinish(result);
                        countDownLatch.countDown();
                        if (result) {
                            GdspStarSkyApiImpl.INSTANCE.getInstance().onRrData(arrayList2);
                        }
                        HMLog.info("AtrialSync", new a(result));
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onData(@Nullable HmGdspRawData t) {
                        super.onData(t);
                        if (t == null) {
                            return;
                        }
                        List<AFPPGDataFragment> list = arrayList;
                        List<byte[]> list2 = arrayList2;
                        list.add(new AFPPGDataFragment(t.getCal(), ArraysKt___ArraysKt.toList(t.getRawData()), t.getDataType()));
                        list2.add(t.getRawData());
                    }
                });
                countDownLatch.await();
            }
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }
}
