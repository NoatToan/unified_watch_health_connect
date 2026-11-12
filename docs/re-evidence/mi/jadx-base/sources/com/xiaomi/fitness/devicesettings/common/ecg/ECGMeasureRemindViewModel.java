package com.xiaomi.fitness.devicesettings.common.ecg;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import defpackage.ns9;
import defpackage.s7r;
import defpackage.ur9;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\f\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eJ\u0006\u0010\u0015\u001a\u00020\tJ*\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u000eH\u0082@¢\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0082@¢\u0006\u0002\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getRemindValue", "ecgMeasureRemindData", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindData;", "syncResult", "Landroidx/lifecycle/MutableLiveData;", "", "getSyncResult", "()Landroidx/lifecycle/MutableLiveData;", "updateRemindDataToDevice", "ecgRemind", "(Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemindDataFromDevice", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ECGMeasureRemindViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    private final MutableLiveData<Boolean> syncResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$getRemindDataFromDevice$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$getRemindDataFromDevice$2", f = "ECGMeasureRemindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ECGMeasureRemindData, Unit> $ecgRemind;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super ECGMeasureRemindData, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$ecgRemind = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$ecgRemind, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 18;
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final Function1<ECGMeasureRemindData, Unit> function1 = this.$ecgRemind;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel.getRemindDataFromDevice.2.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(ECGMeasureRemindViewModelKt.TAG, "getRemindDataFromDevice onError= " + code);
                    function1.invoke2(new ECGMeasureRemindData(false, 1, 1, CollectionsKt__CollectionsKt.mutableListOf(480)));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    ECGMeasureRemindData eCGMeasureRemindData;
                    ur9 ur9VarU;
                    s7r packet;
                    ur9 ur9VarU2;
                    ns9 ns9VarC = null;
                    if (((result == null || (packet = result.getPacket()) == null || (ur9VarU2 = packet.u()) == null) ? null : ur9VarU2.C()) != null) {
                        s7r packet2 = result.getPacket();
                        if (packet2 != null && (ur9VarU = packet2.u()) != null) {
                            ns9VarC = ur9VarU.C();
                        }
                        ECGMeasureRemindSyncHelper eCGMeasureRemindSyncHelper = ECGMeasureRemindSyncHelper.INSTANCE;
                        Intrinsics.checkNotNull(ns9VarC);
                        eCGMeasureRemindData = eCGMeasureRemindSyncHelper.convertECGMeasureRemindData(ns9VarC);
                    } else {
                        eCGMeasureRemindData = new ECGMeasureRemindData(false, 127, 1, CollectionsKt__CollectionsKt.mutableListOf(480));
                    }
                    Logger.i(ECGMeasureRemindViewModelKt.TAG, "getRemindDataFromDevice onSuccess = " + eCGMeasureRemindData);
                    function1.invoke2(eCGMeasureRemindData);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$getRemindValue$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$getRemindValue$1", f = "ECGMeasureRemindViewModel.kt", i = {0}, l = {42, 47}, m = "invokeSuspend", n = {"remind"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nECGMeasureRemindViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ECGMeasureRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindViewModel$getRemindValue$1\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,148:1\n29#2:149\n*S KotlinDebug\n*F\n+ 1 ECGMeasureRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindViewModel$getRemindValue$1\n*L\n41#1:149\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ECGMeasureRemindData, Unit> $ecgMeasureRemindData;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super ECGMeasureRemindData, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ecgMeasureRemindData = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(Function1 function1, ECGMeasureRemindData eCGMeasureRemindData) {
            DeviceSettingsPreference.INSTANCE.setDEVICE_SETTINGS_ECG_MEASURE_REMIND(new Gson().toJson(eCGMeasureRemindData));
            function1.invoke2(eCGMeasureRemindData);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ECGMeasureRemindViewModel.this.new AnonymousClass1(this.$ecgMeasureRemindData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ECGMeasureRemindData eCGMeasureRemindData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
                if (deviceSettingsPreference.getDEVICE_SETTINGS_ECG_MEASURE_REMIND().length() > 0) {
                    ECGMeasureRemindData eCGMeasureRemindData2 = (ECGMeasureRemindData) new Gson().fromJson(deviceSettingsPreference.getDEVICE_SETTINGS_ECG_MEASURE_REMIND(), new TypeToken<ECGMeasureRemindData>() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$getRemindValue$1$invokeSuspend$$inlined$fromJson$1
                    }.getType());
                    ECGMeasureRemindViewModel eCGMeasureRemindViewModel = ECGMeasureRemindViewModel.this;
                    Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.a
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj2) {
                            return ECGMeasureRemindViewModel.AnonymousClass1.invokeSuspend$lambda$0(((Boolean) obj2).booleanValue());
                        }
                    };
                    this.L$0 = eCGMeasureRemindData2;
                    this.label = 1;
                    if (eCGMeasureRemindViewModel.updateRemindDataToDevice(eCGMeasureRemindData2, function1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eCGMeasureRemindData = eCGMeasureRemindData2;
                    this.$ecgMeasureRemindData.invoke2(eCGMeasureRemindData);
                } else {
                    ECGMeasureRemindViewModel eCGMeasureRemindViewModel2 = ECGMeasureRemindViewModel.this;
                    final Function1<ECGMeasureRemindData, Unit> function2 = this.$ecgMeasureRemindData;
                    Function1 function3 = new Function1() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.b
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj2) {
                            return ECGMeasureRemindViewModel.AnonymousClass1.invokeSuspend$lambda$1(function2, (ECGMeasureRemindData) obj2);
                        }
                    };
                    this.label = 2;
                    if (eCGMeasureRemindViewModel2.getRemindDataFromDevice(function3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                eCGMeasureRemindData = (ECGMeasureRemindData) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.$ecgMeasureRemindData.invoke2(eCGMeasureRemindData);
            } else {
                if (i != 2) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$updateRemindDataToDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$updateRemindDataToDevice$1", f = "ECGMeasureRemindViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nECGMeasureRemindViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ECGMeasureRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindViewModel$updateRemindDataToDevice$1\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,148:1\n29#2:149\n*S KotlinDebug\n*F\n+ 1 ECGMeasureRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindViewModel$updateRemindDataToDevice$1\n*L\n62#1:149\n*E\n"})
    public static final class C21251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C21251(Continuation<? super C21251> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ECGMeasureRemindViewModel eCGMeasureRemindViewModel, boolean z) {
            eCGMeasureRemindViewModel.getSyncResult().postValue(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ECGMeasureRemindViewModel.this.new C21251(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ECGMeasureRemindData eCGMeasureRemindData = (ECGMeasureRemindData) new Gson().fromJson(DeviceSettingsPreference.INSTANCE.getDEVICE_SETTINGS_ECG_MEASURE_REMIND(), new TypeToken<ECGMeasureRemindData>() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$updateRemindDataToDevice$1$invokeSuspend$$inlined$fromJson$1
                }.getType());
                final ECGMeasureRemindViewModel eCGMeasureRemindViewModel = ECGMeasureRemindViewModel.this;
                Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.c
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return ECGMeasureRemindViewModel.C21251.invokeSuspend$lambda$0(eCGMeasureRemindViewModel, ((Boolean) obj2).booleanValue());
                    }
                };
                this.label = 1;
                if (eCGMeasureRemindViewModel.updateRemindDataToDevice(eCGMeasureRemindData, function1, this) == coroutine_suspended) {
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
            return ((C21251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$updateRemindDataToDevice$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel$updateRemindDataToDevice$3", f = "ECGMeasureRemindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ECGMeasureRemindData $ecgRemind;
        final /* synthetic */ Function1<Boolean, Unit> $syncResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ECGMeasureRemindData eCGMeasureRemindData, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$ecgRemind = eCGMeasureRemindData;
            this.$syncResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$ecgRemind, this.$syncResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ns9 ns9VarConvertMeasureReminder = ECGMeasureRemindSyncHelper.INSTANCE.convertMeasureReminder(this.$ecgRemind);
            Logger.i(ECGMeasureRemindViewModelKt.TAG, "updateRemindDataToDevice = " + ns9VarConvertMeasureReminder);
            ur9 ur9Var = new ur9();
            ur9Var.r0(ns9VarConvertMeasureReminder);
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 19;
            s7rVar.S(ur9Var);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final Function1<Boolean, Unit> function1 = this.$syncResult;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindViewModel.updateRemindDataToDevice.3.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(ECGMeasureRemindViewModelKt.TAG, "updateRemindDataToDevice onError= " + code);
                    function1.invoke2(Boolean.FALSE);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult onSuccess) {
                    Logger.i(ECGMeasureRemindViewModelKt.TAG, "updateRemindDataToDevice onSuccess = " + (onSuccess != null ? Integer.valueOf(onSuccess.getCode()) : null));
                    function1.invoke2(Boolean.TRUE);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRemindDataFromDevice(Function1<? super ECGMeasureRemindData, Unit> function1, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(function1, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    public final void getRemindValue(@NotNull Function1<? super ECGMeasureRemindData, Unit> ecgMeasureRemindData) {
        Intrinsics.checkNotNullParameter(ecgMeasureRemindData, "ecgMeasureRemindData");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(ecgMeasureRemindData, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getSyncResult() {
        return this.syncResult;
    }

    public final void updateRemindDataToDevice() {
        if (DeviceSettingsPreference.INSTANCE.getDEVICE_SETTINGS_ECG_MEASURE_REMIND().length() == 0) {
            this.syncResult.postValue(Boolean.FALSE);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21251(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateRemindDataToDevice(ECGMeasureRemindData eCGMeasureRemindData, Function1<? super Boolean, Unit> function1, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(eCGMeasureRemindData, function1, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
