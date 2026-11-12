package com.xiaomi.fitness.devicesettings.common.lock;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.axo;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$setUnWearEnable$1$1", f = "SetUnWearPwdViewModel.kt", i = {}, l = {123, 130}, m = "invokeSuspend", n = {}, s = {})
public final class SetUnWearPwdViewModel$setUnWearEnable$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $enable;
    final /* synthetic */ WearableDeviceModel $it;
    final /* synthetic */ String $password;
    int label;
    final /* synthetic */ SetUnWearPwdViewModel this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$setUnWearEnable$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel$setUnWearEnable$1$1$1", f = "SetUnWearPwdViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enable;
        final /* synthetic */ String $password;
        int label;
        final /* synthetic */ SetUnWearPwdViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, SetUnWearPwdViewModel setUnWearPwdViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$password = str;
            this.$enable = z;
            this.this$0 = setUnWearPwdViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$password, this.$enable, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            int i = 2;
            s7rVar.e = 2;
            s7rVar.f = 21;
            axo axoVar = new axo();
            String str = this.$password;
            if (str != null) {
                axoVar.d = str;
            }
            if (!this.$enable) {
                i = 1;
            } else if (this.this$0.isRequired) {
                i = 3;
            }
            axoVar.c = i;
            txo txoVar = new txo();
            txoVar.b0(axoVar);
            s7rVar.c0(txoVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final SetUnWearPwdViewModel setUnWearPwdViewModel = this.this$0;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.lock.SetUnWearPwdViewModel.setUnWearEnable.1.1.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i("setUnWearEnable ble onError code:" + code, new Object[0]);
                    setUnWearPwdViewModel.getSetUnWearResult().postValue(Boolean.FALSE);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i("setUnWearEnable ble onSuccess", new Object[0]);
                    if (result != null) {
                        setUnWearPwdViewModel.getSetUnWearResult().postValue(Boolean.valueOf(result.isSuccess()));
                    } else {
                        onError(did, type, -100);
                    }
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUnWearPwdViewModel$setUnWearEnable$1$1(WearableDeviceModel wearableDeviceModel, SetUnWearPwdViewModel setUnWearPwdViewModel, boolean z, String str, Continuation<? super SetUnWearPwdViewModel$setUnWearEnable$1$1> continuation) {
        super(2, continuation);
        this.$it = wearableDeviceModel;
        this.this$0 = setUnWearPwdViewModel;
        this.$enable = z;
        this.$password = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SetUnWearPwdViewModel$setUnWearEnable$1$1(this.$it, this.this$0, this.$enable, this.$password, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (DeviceModelExtKt.isHuaMi(this.$it)) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                SetUnWearPwdViewModel$setUnWearEnable$1$1$ret$1 setUnWearPwdViewModel$setUnWearEnable$1$1$ret$1 = new SetUnWearPwdViewModel$setUnWearEnable$1$1$ret$1(this.$it, this.$enable, this.$password, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, setUnWearPwdViewModel$setUnWearEnable$1$1$ret$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.this$0.getSetUnWearResult().postValue(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
            } else {
                CoroutineDispatcher io3 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$password, this.$enable, this.this$0, null);
                this.label = 2;
                if (BuildersKt.withContext(io3, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getSetUnWearResult().postValue(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
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
        return ((SetUnWearPwdViewModel$setUnWearEnable$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
