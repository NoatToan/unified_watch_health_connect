package com.xiaomi.fitness.devicesettings.bluttooth.aod;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import defpackage.s7r;
import defpackage.t64;
import defpackage.txo;
import defpackage.yxo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/aod/AODSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "", "getAODSetting", "()V", "", "state", "Lt64;", "startTimeCal", "endTimeCal", "updateAODSetting", "(ILt64;Lt64;)V", "Landroidx/lifecycle/MutableLiveData;", "Lyxo;", "mTimingSetting", "Landroidx/lifecycle/MutableLiveData;", "getMTimingSetting", "()Landroidx/lifecycle/MutableLiveData;", "", "updateResult", "getUpdateResult", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AODSettingViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    private final MutableLiveData<yxo> mTimingSetting = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> updateResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel$getAODSetting$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel$getAODSetting$1", f = "AODSettingViewModel.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel$getAODSetting$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel$getAODSetting$1$1", f = "AODSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AODSettingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04541(AODSettingViewModel aODSettingViewModel, Continuation<? super C04541> continuation) {
                super(2, continuation);
                this.this$0 = aODSettingViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04541(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 65;
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final AODSettingViewModel aODSettingViewModel = this.this$0;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel.getAODSetting.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(AODSettingFragmentKt.AOD_TAG, "getAODSetting fail, code: " + code);
                        aODSettingViewModel.getMTimingSetting().postValue(null);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        s7r packet;
                        txo txoVarE;
                        s7r packet2;
                        txo txoVarE2;
                        yxo yxoVarJ = null;
                        Logger.i(AODSettingFragmentKt.AOD_TAG, "getAODSetting onSuccess, timingSetting: " + ((result == null || (packet2 = result.getPacket()) == null || (txoVarE2 = packet2.E()) == null) ? null : txoVarE2.J()));
                        MutableLiveData<yxo> mTimingSetting = aODSettingViewModel.getMTimingSetting();
                        if (result != null && (packet = result.getPacket()) != null && (txoVarE = packet.E()) != null) {
                            yxoVarJ = txoVarE.J();
                        }
                        mTimingSetting.postValue(yxoVarJ);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AODSettingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04541 c04541 = new C04541(AODSettingViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04541, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel$updateAODSetting$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel$updateAODSetting$1", f = "AODSettingViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ t64 $endTimeCal;
        final /* synthetic */ t64 $startTimeCal;
        final /* synthetic */ int $state;
        int label;
        final /* synthetic */ AODSettingViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel$updateAODSetting$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel$updateAODSetting$1$1", f = "AODSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ t64 $endTimeCal;
            final /* synthetic */ t64 $startTimeCal;
            final /* synthetic */ int $state;
            int label;
            final /* synthetic */ AODSettingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04561(int i, t64 t64Var, t64 t64Var2, AODSettingViewModel aODSettingViewModel, Continuation<? super C04561> continuation) {
                super(2, continuation);
                this.$state = i;
                this.$startTimeCal = t64Var;
                this.$endTimeCal = t64Var2;
                this.this$0 = aODSettingViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04561(this.$state, this.$startTimeCal, this.$endTimeCal, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                yxo yxoVar = new yxo();
                yxoVar.c = this.$state;
                yxoVar.d = this.$startTimeCal;
                yxoVar.e = this.$endTimeCal;
                txo txoVar = new txo();
                txoVar.p0(yxoVar);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 66;
                s7rVar.c0(txoVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final AODSettingViewModel aODSettingViewModel = this.this$0;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingViewModel.updateAODSetting.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(AODSettingFragmentKt.AOD_TAG, "updateAODSetting onError" + code);
                        aODSettingViewModel.getUpdateResult().postValue(Boolean.FALSE);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        Logger.i(AODSettingFragmentKt.AOD_TAG, "updateAODSetting onSuccess");
                        aODSettingViewModel.getUpdateResult().postValue(result != null ? Boolean.valueOf(SyncResultExitKt.isSuccess(result)) : null);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20251(int i, t64 t64Var, t64 t64Var2, AODSettingViewModel aODSettingViewModel, Continuation<? super C20251> continuation) {
            super(2, continuation);
            this.$state = i;
            this.$startTimeCal = t64Var;
            this.$endTimeCal = t64Var2;
            this.this$0 = aODSettingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20251(this.$state, this.$startTimeCal, this.$endTimeCal, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04561 c04561 = new C04561(this.$state, this.$startTimeCal, this.$endTimeCal, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04561, this) == coroutine_suspended) {
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
            return ((C20251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void getAODSetting() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<yxo> getMTimingSetting() {
        return this.mTimingSetting;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUpdateResult() {
        return this.updateResult;
    }

    public final void updateAODSetting(int state, @NotNull t64 startTimeCal, @NotNull t64 endTimeCal) {
        Intrinsics.checkNotNullParameter(startTimeCal, "startTimeCal");
        Intrinsics.checkNotNullParameter(endTimeCal, "endTimeCal");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20251(state, startTimeCal, endTimeCal, this, null), 3, null);
    }
}
