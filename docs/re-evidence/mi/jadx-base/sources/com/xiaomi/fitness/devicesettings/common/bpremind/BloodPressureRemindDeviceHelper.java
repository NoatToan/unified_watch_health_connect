package com.xiaomi.fitness.devicesettings.common.bpremind;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.model.DeviceBPRemind;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.ns9;
import defpackage.s7r;
import defpackage.t64;
import defpackage.ur9;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/bpremind/BloodPressureRemindDeviceHelper;", "", "Lcom/xiaomi/fitness/devicesettings/export/model/DeviceBPRemind;", "bloodPressureMeasureRemindData", "Lns9;", "convertMeasureReminder", "(Lcom/xiaomi/fitness/devicesettings/export/model/DeviceBPRemind;)Lns9;", "measureReminder", "convertBPMeasureRemindData", "(Lns9;)Lcom/xiaomi/fitness/devicesettings/export/model/DeviceBPRemind;", "bloodPressureRemind", "", "updateBloodPressureMeasureRemindDataToDevice", "(Lcom/xiaomi/fitness/devicesettings/export/model/DeviceBPRemind;)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBloodPressureRemindDeviceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureRemindDeviceHelper.kt\ncom/xiaomi/fitness/devicesettings/common/bpremind/BloodPressureRemindDeviceHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,106:1\n1863#2,2:107\n37#3:109\n36#3,3:110\n29#4:113\n*S KotlinDebug\n*F\n+ 1 BloodPressureRemindDeviceHelper.kt\ncom/xiaomi/fitness/devicesettings/common/bpremind/BloodPressureRemindDeviceHelper\n*L\n33#1:107,2\n44#1:109\n44#1:110,3\n71#1:113\n*E\n"})
public final class BloodPressureRemindDeviceHelper {

    @NotNull
    public static final BloodPressureRemindDeviceHelper INSTANCE = new BloodPressureRemindDeviceHelper();

    @NotNull
    public static final String TAG = "BloodPressureRemindDeviceHelper";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.bpremind.BloodPressureRemindDeviceHelper$updateBloodPressureMeasureRemindDataToDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.bpremind.BloodPressureRemindDeviceHelper$updateBloodPressureMeasureRemindDataToDevice$1", f = "BloodPressureRemindDeviceHelper.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ns9 $measureRemindData;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.bpremind.BloodPressureRemindDeviceHelper$updateBloodPressureMeasureRemindDataToDevice$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.bpremind.BloodPressureRemindDeviceHelper$updateBloodPressureMeasureRemindDataToDevice$1$1", f = "BloodPressureRemindDeviceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ns9 $measureRemindData;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04751(ns9 ns9Var, Continuation<? super C04751> continuation) {
                super(2, continuation);
                this.$measureRemindData = ns9Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04751(this.$measureRemindData, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ur9 ur9Var = new ur9();
                ur9Var.r0(this.$measureRemindData);
                s7r s7rVar = new s7r();
                s7rVar.e = 8;
                s7rVar.f = 17;
                s7rVar.S(ur9Var);
                DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.bpremind.BloodPressureRemindDeviceHelper.updateBloodPressureMeasureRemindDataToDevice.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(BloodPressureRemindDeviceHelper.TAG, "updateBloodPressureMeasureRemindDataToDevice onError= " + code);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        Logger.i(BloodPressureRemindDeviceHelper.TAG, "updateBloodPressureMeasureRemindDataToDevice onSuccess = " + (result != null ? Integer.valueOf(result.getCode()) : null));
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ns9 ns9Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$measureRemindData = ns9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$measureRemindData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04751 c04751 = new C04751(this.$measureRemindData, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04751, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private BloodPressureRemindDeviceHelper() {
    }

    private final ns9 convertMeasureReminder(DeviceBPRemind bloodPressureMeasureRemindData) {
        ns9 ns9Var = new ns9();
        int category = bloodPressureMeasureRemindData.getCategory();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = bloodPressureMeasureRemindData.getRemindTimes().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            t64 t64Var = new t64();
            t64Var.c = iIntValue / 60;
            t64Var.d = iIntValue % 60;
            arrayList.add(t64Var);
        }
        ns9Var.c = bloodPressureMeasureRemindData.isEnable();
        ns9Var.d = category;
        ns9Var.e = 5;
        ns9Var.f = bloodPressureMeasureRemindData.getRepeat();
        ns9Var.g = (t64[]) arrayList.toArray(new t64[0]);
        return ns9Var;
    }

    @NotNull
    public final DeviceBPRemind convertBPMeasureRemindData(@NotNull ns9 measureReminder) {
        Intrinsics.checkNotNullParameter(measureReminder, "measureReminder");
        return new DeviceBPRemind(false, 0, 0, 0, new ArrayList());
    }

    public final void updateBloodPressureMeasureRemindDataToDevice(@Nullable DeviceBPRemind bloodPressureRemind) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "blood_pressure")) {
            String json = bloodPressureRemind != null ? new Gson().toJson(bloodPressureRemind) : DeviceSettingsPreference.INSTANCE.getDEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND();
            if (json == null || json.length() == 0) {
                return;
            }
            DeviceSettingsPreference.INSTANCE.setDEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND(json);
            DeviceBPRemind deviceBPRemind = (DeviceBPRemind) new Gson().fromJson(json, new TypeToken<DeviceBPRemind>() { // from class: com.xiaomi.fitness.devicesettings.common.bpremind.BloodPressureRemindDeviceHelper$updateBloodPressureMeasureRemindDataToDevice$$inlined$fromJson$1
            }.getType());
            ns9 ns9VarConvertMeasureReminder = convertMeasureReminder(deviceBPRemind);
            Logger.i(TAG, "updateBloodPressureMeasureRemindDataToDevice = " + deviceBPRemind + ", measureRemindData = " + ns9VarConvertMeasureReminder);
            ScopeExtKt.scope$default(null, new AnonymousClass1(ns9VarConvertMeasureReminder, null), 1, null);
        }
    }
}
