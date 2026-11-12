package com.xiaomi.fitness.devicesettings.common.ecg;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindSyncHelper;", "", "Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindData;", "ecgRemind", "Lns9;", "convertMeasureReminder", "(Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindData;)Lns9;", "measureReminder", "convertECGMeasureRemindData", "(Lns9;)Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindData;", "", "updateRemindDataToDevice", "()V", "", "TAG", "Ljava/lang/String;", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nECGMeasureRemindSyncHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ECGMeasureRemindSyncHelper.kt\ncom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindSyncHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,103:1\n1863#2,2:104\n37#3:106\n36#3,3:107\n13402#4,2:110\n29#5:112\n*S KotlinDebug\n*F\n+ 1 ECGMeasureRemindSyncHelper.kt\ncom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindSyncHelper\n*L\n30#1:104,2\n40#1:106\n40#1:107,3\n53#1:110,2\n69#1:112\n*E\n"})
public final class ECGMeasureRemindSyncHelper {

    @NotNull
    public static final ECGMeasureRemindSyncHelper INSTANCE = new ECGMeasureRemindSyncHelper();

    @NotNull
    public static final String TAG = "ECGMeasureRemindSyncHelper";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSyncHelper$updateRemindDataToDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSyncHelper$updateRemindDataToDevice$1", f = "ECGMeasureRemindSyncHelper.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ECGMeasureRemindData $ecgRemind;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSyncHelper$updateRemindDataToDevice$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSyncHelper$updateRemindDataToDevice$1$1", f = "ECGMeasureRemindSyncHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ECGMeasureRemindData $ecgRemind;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04771(ECGMeasureRemindData eCGMeasureRemindData, Continuation<? super C04771> continuation) {
                super(2, continuation);
                this.$ecgRemind = eCGMeasureRemindData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04771(this.$ecgRemind, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ns9 ns9VarConvertMeasureReminder = ECGMeasureRemindSyncHelper.INSTANCE.convertMeasureReminder(this.$ecgRemind);
                ur9 ur9Var = new ur9();
                ur9Var.r0(ns9VarConvertMeasureReminder);
                Logger.i(ECGMeasureRemindSyncHelper.TAG, "updateRemindDataToDevice = " + ns9VarConvertMeasureReminder + " , local = " + this.$ecgRemind);
                s7r s7rVar = new s7r();
                s7rVar.e = 8;
                s7rVar.f = 19;
                s7rVar.S(ur9Var);
                DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSyncHelper.updateRemindDataToDevice.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(ECGMeasureRemindSyncHelper.TAG, "updateRemindDataToDevice onError= " + code);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult onSuccess) {
                        Logger.i(ECGMeasureRemindSyncHelper.TAG, "updateRemindDataToDevice onSuccess = " + (onSuccess != null ? Integer.valueOf(onSuccess.getCode()) : null));
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ECGMeasureRemindData eCGMeasureRemindData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ecgRemind = eCGMeasureRemindData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ecgRemind, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04771 c04771 = new C04771(this.$ecgRemind, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04771, this) == coroutine_suspended) {
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

    private ECGMeasureRemindSyncHelper() {
    }

    @NotNull
    public final ECGMeasureRemindData convertECGMeasureRemindData(@NotNull ns9 measureReminder) {
        Intrinsics.checkNotNullParameter(measureReminder, "measureReminder");
        ECGMeasureRemindData eCGMeasureRemindData = new ECGMeasureRemindData(false, 127, 1, CollectionsKt__CollectionsKt.mutableListOf(480));
        eCGMeasureRemindData.setEnable(measureReminder.c);
        int i = measureReminder.f;
        eCGMeasureRemindData.setRepeat(i != 0 ? i : 127);
        ArrayList arrayList = new ArrayList();
        t64[] times = measureReminder.g;
        Intrinsics.checkNotNullExpressionValue(times, "times");
        if (!(times.length == 0)) {
            t64[] times2 = measureReminder.g;
            Intrinsics.checkNotNullExpressionValue(times2, "times");
            for (t64 t64Var : times2) {
                arrayList.add(Integer.valueOf((t64Var.c * 60) + t64Var.d));
            }
        } else {
            arrayList.add(480);
        }
        eCGMeasureRemindData.setRemindTimes(arrayList);
        eCGMeasureRemindData.setDayRemindCount(arrayList.size());
        return eCGMeasureRemindData;
    }

    @NotNull
    public final ns9 convertMeasureReminder(@NotNull ECGMeasureRemindData ecgRemind) {
        Intrinsics.checkNotNullParameter(ecgRemind, "ecgRemind");
        ns9 ns9Var = new ns9();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ecgRemind.getRemindTimes().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            t64 t64Var = new t64();
            t64Var.c = iIntValue / 60;
            t64Var.d = iIntValue % 60;
            arrayList.add(t64Var);
        }
        ns9Var.c = ecgRemind.isEnable();
        ns9Var.d = 3;
        ns9Var.e = 5;
        ns9Var.f = ecgRemind.getRepeat();
        ns9Var.g = (t64[]) arrayList.toArray(new t64[0]);
        return ns9Var;
    }

    public final void updateRemindDataToDevice() {
        DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
        if (deviceSettingsPreference.getDEVICE_SETTINGS_ECG_MEASURE_REMIND().length() == 0) {
            return;
        }
        ECGMeasureRemindData eCGMeasureRemindData = (ECGMeasureRemindData) new Gson().fromJson(deviceSettingsPreference.getDEVICE_SETTINGS_ECG_MEASURE_REMIND(), new TypeToken<ECGMeasureRemindData>() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSyncHelper$updateRemindDataToDevice$$inlined$fromJson$1
        }.getType());
        Logger.i(TAG, "syncECGMeasureRemind :" + eCGMeasureRemindData);
        ScopeExtKt.scope$default(null, new AnonymousClass1(eCGMeasureRemindData, null), 1, null);
    }
}
