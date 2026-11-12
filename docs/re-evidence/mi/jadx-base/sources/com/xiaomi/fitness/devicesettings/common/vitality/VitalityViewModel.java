package com.xiaomi.fitness.devicesettings.common.vitality;

import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import defpackage.ar9;
import defpackage.s7r;
import defpackage.ur9;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/vitality/VitalityViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "Lkotlin/Function1;", "Lar9;", "", "activityReminder", "getActivityReminderByDevice", "(Lkotlin/jvm/functions/Function1;)V", "", "sevenDayStage", "dayUpperLimit", "isSetSuc", "setActivityReminder", "(ZZLkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VitalityViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String TAG = "VitalityViewModel";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel$getActivityReminderByDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel$getActivityReminderByDevice$1", f = "VitalityViewModel.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ar9, Unit> $activityReminder;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel$getActivityReminderByDevice$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel$getActivityReminderByDevice$1$1", f = "VitalityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<ar9, Unit> $activityReminder;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04921(Function1<? super ar9, Unit> function1, Continuation<? super C04921> continuation) {
                super(2, continuation);
                this.$activityReminder = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04921(this.$activityReminder, continuation);
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
                s7rVar.f = 35;
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final Function1<ar9, Unit> function1 = this.$activityReminder;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel.getActivityReminderByDevice.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i("VitalityViewModel", "getActivityReminderByDevice onError" + code);
                        function1.invoke2(null);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        s7r packet;
                        ur9 ur9VarU;
                        ar9 ar9VarO = (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null) ? null : ur9VarU.o();
                        Logger.i("VitalityViewModel", "getActivityReminderByDevice onSuccess sevenDayStage = " + (ar9VarO != null ? Boolean.valueOf(ar9VarO.c) : null) + " dayUpperLimit = " + (ar9VarO != null ? Boolean.valueOf(ar9VarO.d) : null));
                        function1.invoke2(ar9VarO);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super ar9, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activityReminder = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activityReminder, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04921 c04921 = new C04921(this.$activityReminder, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04921, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel$setActivityReminder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel$setActivityReminder$1", f = "VitalityViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $dayUpperLimit;
        final /* synthetic */ Function1<Boolean, Unit> $isSetSuc;
        final /* synthetic */ boolean $sevenDayStage;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel$setActivityReminder$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel$setActivityReminder$1$1", f = "VitalityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $dayUpperLimit;
            final /* synthetic */ Function1<Boolean, Unit> $isSetSuc;
            final /* synthetic */ boolean $sevenDayStage;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04941(boolean z, boolean z2, Function1<? super Boolean, Unit> function1, Continuation<? super C04941> continuation) {
                super(2, continuation);
                this.$sevenDayStage = z;
                this.$dayUpperLimit = z2;
                this.$isSetSuc = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04941(this.$sevenDayStage, this.$dayUpperLimit, this.$isSetSuc, continuation);
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
                s7rVar.f = 36;
                ur9 ur9Var = new ur9();
                ar9 ar9Var = new ar9();
                ar9Var.c = this.$sevenDayStage;
                ar9Var.d = this.$dayUpperLimit;
                ur9Var.g0(ar9Var);
                s7rVar.S(ur9Var);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final boolean z = this.$sevenDayStage;
                final boolean z2 = this.$dayUpperLimit;
                final Function1<Boolean, Unit> function1 = this.$isSetSuc;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.vitality.VitalityViewModel.setActivityReminder.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i("VitalityViewModel", "setActivityReminder onError" + code);
                        function1.invoke2(Boolean.FALSE);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        Logger.i("VitalityViewModel", "setActivityReminder onSuccess sevenDayStage = " + z + " dayUpperLimit = " + z2);
                        function1.invoke2(Boolean.TRUE);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21511(boolean z, boolean z2, Function1<? super Boolean, Unit> function1, Continuation<? super C21511> continuation) {
            super(2, continuation);
            this.$sevenDayStage = z;
            this.$dayUpperLimit = z2;
            this.$isSetSuc = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21511(this.$sevenDayStage, this.$dayUpperLimit, this.$isSetSuc, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04941 c04941 = new C04941(this.$sevenDayStage, this.$dayUpperLimit, this.$isSetSuc, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04941, this) == coroutine_suspended) {
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
            return ((C21511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void getActivityReminderByDevice(@NotNull Function1<? super ar9, Unit> activityReminder) {
        Intrinsics.checkNotNullParameter(activityReminder, "activityReminder");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(activityReminder, null), 3, null);
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void setActivityReminder(boolean sevenDayStage, boolean dayUpperLimit, @NotNull Function1<? super Boolean, Unit> isSetSuc) {
        Intrinsics.checkNotNullParameter(isSetSuc, "isSetSuc");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21511(sevenDayStage, dayUpperLimit, isSetSuc, null), 3, null);
    }
}
