package com.xiaomi.fitness.health.sleep.rhythm;

import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorRepository;
import defpackage.s7r;
import defpackage.t64;
import defpackage.ur9;
import defpackage.ut9;
import defpackage.vt9;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorRepository;", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "isDeviceSleepRhythmSupport", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "enable", "", "", "remindList", "Lut9;", "buildSleepRhythm", "(ZLjava/util/List;)Lut9;", "times", "Lcom/xiaomi/fitness/health/sleep/rhythm/ISleepRhythmCallback;", "resultCallback", "", "setSleepRhythmRemind", "(ZLjava/util/List;Lcom/xiaomi/fitness/health/sleep/rhythm/ISleepRhythmCallback;)V", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "sleepRhythmReport", "setSleepRhythmMonitor", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;Lcom/xiaomi/fitness/health/sleep/rhythm/ISleepRhythmCallback;)V", "callback", "getSleepRhythmRemindFromDevice", "(Lcom/xiaomi/fitness/health/sleep/rhythm/ISleepRhythmCallback;)V", "getSleepRhythmMonitorFromDevice", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "sleepDataRepo$delegate", "Lkotlin/Lazy;", "getSleepDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "sleepDataRepo", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepDisorderMonitorRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDisorderMonitorRepo.kt\ncom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,277:1\n1863#2,2:278\n37#3:280\n36#3,3:281\n*S KotlinDebug\n*F\n+ 1 SleepDisorderMonitorRepo.kt\ncom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorRepository\n*L\n165#1:278,2\n173#1:280\n173#1:281,3\n*E\n"})
public final class SleepRhythmMonitorRepository {

    @NotNull
    public static final String TAG = "SleepRhythmMonitorRepository";

    /* JADX INFO: renamed from: sleepDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dum
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmMonitorRepository.sleepDataRepo_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SleepRhythmMonitorRepository instance = new SleepRhythmMonitorRepository();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorRepository$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorRepository;", "getInstance", "()Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorRepository;", "TAG", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepRhythmMonitorRepository getInstance() {
            return SleepRhythmMonitorRepository.instance;
        }
    }

    private SleepRhythmMonitorRepository() {
    }

    private final ut9 buildSleepRhythm(boolean enable, List<Integer> remindList) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = remindList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            t64 t64Var = new t64();
            t64Var.c = iIntValue / 60;
            t64Var.d = iIntValue % 60;
            arrayList.add(t64Var);
        }
        ut9 ut9Var = new ut9();
        ut9Var.c = enable;
        ut9Var.d = (t64[]) arrayList.toArray(new t64[0]);
        return ut9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISleepRepository getSleepDataRepo() {
        return (ISleepRepository) this.sleepDataRepo.getValue();
    }

    private final boolean isDeviceSleepRhythmSupport(WearableDeviceModel deviceModel) {
        return deviceModel != null && DeviceModelExtKt.isSupportFeature(deviceModel, Feature.SLEEP_RHYTHM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISleepRepository sleepDataRepo_delegate$lambda$0() {
        return (ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class);
    }

    public final void getSleepRhythmMonitorFromDevice(@NotNull ISleepRhythmCallback callback) {
        Integer num;
        Intrinsics.checkNotNullParameter(callback, "callback");
        final SoftReference softReference = new SoftReference(callback);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            num = 100;
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            num = !isDeviceSleepRhythmSupport(wearableDeviceModel) ? 300 : null;
        } else {
            num = 200;
        }
        if (num == null) {
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 61;
            Logger.i(TAG, "getMonitorFromDevice packet:" + s7rVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorRepository.getSleepRhythmMonitorFromDevice.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    ISleepRhythmCallback iSleepRhythmCallback = softReference.get();
                    if (iSleepRhythmCallback != null) {
                        iSleepRhythmCallback.onSleepRhythmMonitorResult(code, null);
                    }
                    Logger.i(SleepRhythmMonitorRepository.TAG, "getMonitorFromDevice onError code " + code + ";" + iSleepRhythmCallback);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    ur9 ur9VarU;
                    vt9 vt9VarQ = (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null) ? null : ur9VarU.Q();
                    ISleepRhythmCallback iSleepRhythmCallback = softReference.get();
                    if (iSleepRhythmCallback != null) {
                        iSleepRhythmCallback.onSleepRhythmMonitorResult(0, vt9VarQ);
                    }
                    Logger.i(SleepRhythmMonitorRepository.TAG, "getMonitorFromDevice:" + vt9VarQ + ";" + iSleepRhythmCallback);
                }
            }, 0, 8, null);
            return;
        }
        ISleepRhythmCallback iSleepRhythmCallback = (ISleepRhythmCallback) softReference.get();
        if (iSleepRhythmCallback != null) {
            iSleepRhythmCallback.onSleepRhythmMonitorResult(num.intValue(), null);
        }
        Logger.i(TAG, "getMonitorFromDevice fail, code " + num + ";" + iSleepRhythmCallback);
    }

    public final void getSleepRhythmRemindFromDevice(@NotNull ISleepRhythmCallback callback) {
        Integer num;
        Intrinsics.checkNotNullParameter(callback, "callback");
        final SoftReference softReference = new SoftReference(callback);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            num = 100;
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            num = !isDeviceSleepRhythmSupport(wearableDeviceModel) ? 300 : null;
        } else {
            num = 200;
        }
        if (num == null) {
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 63;
            Logger.i(TAG, "getRhythmRemindFromDevice packet:" + s7rVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorRepository.getSleepRhythmRemindFromDevice.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    ISleepRhythmCallback iSleepRhythmCallback = softReference.get();
                    if (iSleepRhythmCallback != null) {
                        iSleepRhythmCallback.onSleepRhythmRemindResult(code, null);
                    }
                    Logger.i(SleepRhythmMonitorRepository.TAG, "getRhythmRemindFromDevice onError code " + code + ";" + iSleepRhythmCallback);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    ur9 ur9VarU;
                    ut9 ut9VarO = (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null) ? null : ur9VarU.O();
                    ISleepRhythmCallback iSleepRhythmCallback = softReference.get();
                    if (iSleepRhythmCallback != null) {
                        iSleepRhythmCallback.onSleepRhythmRemindResult(0, ut9VarO);
                    }
                    Logger.i(SleepRhythmMonitorRepository.TAG, "getRhythmRemindFromDevice " + ut9VarO + ";" + iSleepRhythmCallback);
                }
            }, 0, 8, null);
            return;
        }
        ISleepRhythmCallback iSleepRhythmCallback = (ISleepRhythmCallback) softReference.get();
        ISleepRhythmCallback iSleepRhythmCallback2 = (ISleepRhythmCallback) softReference.get();
        if (iSleepRhythmCallback2 != null) {
            iSleepRhythmCallback2.onSleepRhythmRemindResult(num.intValue(), null);
        }
        Logger.i(TAG, "getRhythmRemindFromDevice fail, code " + num + " " + iSleepRhythmCallback);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    public final void setSleepRhythmMonitor(@NotNull final SleepRhythmReport sleepRhythmReport, @NotNull ISleepRhythmCallback resultCallback) {
        Integer num;
        int i;
        ISleepRhythmCallback iSleepRhythmCallback;
        Intrinsics.checkNotNullParameter(sleepRhythmReport, "sleepRhythmReport");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        int type = sleepRhythmReport.getType();
        final int cycleDay = sleepRhythmReport.getCycleDay();
        final SoftReference softReference = new SoftReference(resultCallback);
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            if (wearableDeviceModel.getIsDeviceConnected()) {
                num = !isDeviceSleepRhythmSupport(wearableDeviceModel) ? 300 : null;
            } else {
                i = 200;
            }
            if (num != null) {
                iSleepRhythmCallback = (ISleepRhythmCallback) softReference.get();
                if (iSleepRhythmCallback != null) {
                    iSleepRhythmCallback.updateSleepRhythmMonitorResult(num.intValue(), 0);
                }
                Logger.i(TAG, "setRhythmMonitor fail, code " + num + ";" + iSleepRhythmCallback);
                return;
            }
            ur9 ur9Var = new ur9();
            vt9 vt9Var = new vt9();
            vt9Var.c = type == 0;
            vt9Var.d = cycleDay;
            ur9Var.I0(vt9Var);
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 62;
            s7rVar.S(ur9Var);
            Logger.i(TAG, "setRhythmMonitor packet:" + s7rVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorRepository.setSleepRhythmMonitor.2
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type2, int code) {
                    ISleepRhythmCallback iSleepRhythmCallback2 = softReference.get();
                    if (iSleepRhythmCallback2 != null) {
                        iSleepRhythmCallback2.updateSleepRhythmMonitorResult(code, cycleDay);
                    }
                    Logger.i(SleepRhythmMonitorRepository.TAG, "setRhythmMonitor onError code " + code + " ;" + iSleepRhythmCallback2);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type2, SyncResult result) {
                    AnyExtKt.io$default(null, new SleepRhythmMonitorRepository$setSleepRhythmMonitor$2$onSuccess$1(SleepRhythmMonitorRepository.this, wearableDeviceModel, sleepRhythmReport, softReference, cycleDay, null), 1, null);
                }
            }, 0, 8, null);
        }
        i = 100;
        num = i;
        if (num != null) {
            iSleepRhythmCallback = (ISleepRhythmCallback) softReference.get();
            if (iSleepRhythmCallback != null) {
                iSleepRhythmCallback.updateSleepRhythmMonitorResult(num.intValue(), 0);
            }
            Logger.i(TAG, "setRhythmMonitor fail, code " + num + ";" + iSleepRhythmCallback);
            return;
        }
        ur9 ur9Var2 = new ur9();
        vt9 vt9Var2 = new vt9();
        vt9Var2.c = type == 0;
        vt9Var2.d = cycleDay;
        ur9Var2.I0(vt9Var2);
        s7r s7rVar2 = new s7r();
        s7rVar2.e = 8;
        s7rVar2.f = 62;
        s7rVar2.S(ur9Var2);
        Logger.i(TAG, "setRhythmMonitor packet:" + s7rVar2);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar2, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorRepository.setSleepRhythmMonitor.2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type2, int code) {
                ISleepRhythmCallback iSleepRhythmCallback2 = softReference.get();
                if (iSleepRhythmCallback2 != null) {
                    iSleepRhythmCallback2.updateSleepRhythmMonitorResult(code, cycleDay);
                }
                Logger.i(SleepRhythmMonitorRepository.TAG, "setRhythmMonitor onError code " + code + " ;" + iSleepRhythmCallback2);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type2, SyncResult result) {
                AnyExtKt.io$default(null, new SleepRhythmMonitorRepository$setSleepRhythmMonitor$2$onSuccess$1(SleepRhythmMonitorRepository.this, wearableDeviceModel, sleepRhythmReport, softReference, cycleDay, null), 1, null);
            }
        }, 0, 8, null);
    }

    public final void setSleepRhythmRemind(boolean enable, @NotNull List<Integer> times, @NotNull ISleepRhythmCallback resultCallback) {
        Integer num;
        t64[] t64VarArr;
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        final SoftReference softReference = new SoftReference(resultCallback);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Integer numValueOf = null;
        if (wearableDeviceModel == null) {
            num = 100;
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            num = !isDeviceSleepRhythmSupport(wearableDeviceModel) ? 300 : null;
        } else {
            num = 200;
        }
        if (num != null) {
            ISleepRhythmCallback iSleepRhythmCallback = (ISleepRhythmCallback) softReference.get();
            ISleepRhythmCallback iSleepRhythmCallback2 = (ISleepRhythmCallback) softReference.get();
            if (iSleepRhythmCallback2 != null) {
                iSleepRhythmCallback2.updateRhythmRemindResult(num.intValue(), false);
            }
            Logger.i(TAG, "setSleepRhythmRemind fail, code " + num + " " + iSleepRhythmCallback);
            return;
        }
        ur9 ur9Var = new ur9();
        ur9Var.G0(buildSleepRhythm(enable, times));
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 69;
        s7rVar.S(ur9Var);
        ut9 ut9VarO = s7rVar.u().O();
        Boolean boolValueOf = ut9VarO != null ? Boolean.valueOf(ut9VarO.c) : null;
        ut9 ut9VarO2 = s7rVar.u().O();
        if (ut9VarO2 != null && (t64VarArr = ut9VarO2.d) != null) {
            numValueOf = Integer.valueOf(t64VarArr.length);
        }
        Logger.i(TAG, "setSleepRhythmRemind packet:" + s7rVar + ";detail enable:" + boolValueOf + ",size:" + numValueOf);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorRepository.setSleepRhythmRemind.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                ISleepRhythmCallback iSleepRhythmCallback3 = softReference.get();
                if (iSleepRhythmCallback3 != null) {
                    iSleepRhythmCallback3.updateRhythmRemindResult(code, false);
                }
                Logger.i(SleepRhythmMonitorRepository.TAG, "setSleepRhythmRemind onError code " + code + " " + iSleepRhythmCallback3);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ISleepRhythmCallback iSleepRhythmCallback3 = softReference.get();
                if (iSleepRhythmCallback3 != null) {
                    iSleepRhythmCallback3.updateRhythmRemindResult(0, true);
                }
                Logger.i(SleepRhythmMonitorRepository.TAG, "setSleepRhythmRemind success " + iSleepRhythmCallback3);
            }
        }, 0, 8, null);
    }
}
