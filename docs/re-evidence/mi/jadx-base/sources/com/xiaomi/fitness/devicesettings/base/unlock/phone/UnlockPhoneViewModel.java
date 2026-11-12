package com.xiaomi.fitness.devicesettings.base.unlock.phone;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import defpackage.lwo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.wzi;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\u000fJ\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/unlock/phone/UnlockPhoneViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "unlockDistanceRightValue", "Landroidx/lifecycle/MutableLiveData;", "", "getUnlockDistanceRightValue", "()Landroidx/lifecycle/MutableLiveData;", "unlockEnable", "", "getUnlockEnable", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "hasScreenLockPwd", "context", "Landroid/content/Context;", "getAuthorizeUnlock", "handleResult", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "setAuthorizeUnlock", "deviceType", "enable", "getUnlockScreenType", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUnlockPhoneViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlockPhoneViewModel.kt\ncom/xiaomi/fitness/devicesettings/base/unlock/phone/UnlockPhoneViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,142:1\n13402#2,2:143\n*S KotlinDebug\n*F\n+ 1 UnlockPhoneViewModel.kt\ncom/xiaomi/fitness/devicesettings/base/unlock/phone/UnlockPhoneViewModel\n*L\n78#1:143,2\n*E\n"})
public final class UnlockPhoneViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String TAG = "UnlockPhoneViewModel";

    @Nullable
    private WearableDeviceModel mDeviceModel;

    @NotNull
    private final MutableLiveData<Integer> unlockDistanceRightValue = new MutableLiveData<>(1);

    @NotNull
    private final MutableLiveData<Boolean> unlockEnable = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$getAuthorizeUnlock$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$getAuthorizeUnlock$1", f = "UnlockPhoneViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$getAuthorizeUnlock$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$getAuthorizeUnlock$1$1", f = "UnlockPhoneViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UnlockPhoneViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04441(UnlockPhoneViewModel unlockPhoneViewModel, Continuation<? super C04441> continuation) {
                super(2, continuation);
                this.this$0 = unlockPhoneViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04441(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel wearableDeviceModel = this.this$0.mDeviceModel;
                if (wearableDeviceModel != null) {
                    final UnlockPhoneViewModel unlockPhoneViewModel = this.this$0;
                    DeviceModelExtKt.getAuthorizeUnlock(wearableDeviceModel, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel.getAuthorizeUnlock.1.1.1
                        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                        public void onError(String did, int type, int code) {
                            Logger.e(UnlockPhoneViewModel.TAG, "getAuthorizeUnlock error " + code);
                            ToastUtil.showShortToast(wzi.p5);
                        }

                        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                        public void onSuccess(String did, int type, SyncResult result) {
                            unlockPhoneViewModel.handleResult(result);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UnlockPhoneViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04441 c04441 = new C04441(UnlockPhoneViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04441, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$setAuthorizeUnlock$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$setAuthorizeUnlock$1", f = "UnlockPhoneViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $deviceType;
        final /* synthetic */ boolean $enable;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$setAuthorizeUnlock$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$setAuthorizeUnlock$1$1", f = "UnlockPhoneViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $deviceType;
            final /* synthetic */ boolean $enable;
            int label;
            final /* synthetic */ UnlockPhoneViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04461(UnlockPhoneViewModel unlockPhoneViewModel, int i, boolean z, Continuation<? super C04461> continuation) {
                super(2, continuation);
                this.this$0 = unlockPhoneViewModel;
                this.$deviceType = i;
                this.$enable = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04461(this.this$0, this.$deviceType, this.$enable, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel wearableDeviceModel = this.this$0.mDeviceModel;
                if (wearableDeviceModel != null) {
                    int i = this.$deviceType;
                    final boolean z = this.$enable;
                    final UnlockPhoneViewModel unlockPhoneViewModel = this.this$0;
                    DeviceModelExtKt.setAuthorizeUnlock(wearableDeviceModel, i, z, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel.setAuthorizeUnlock.1.1.1
                        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                        public void onError(String did, int type, int code) {
                            Logger.e(UnlockPhoneViewModel.TAG, "setAuthorizeUnlock " + z + " error:" + code);
                            ToastUtil.showShortToast(wzi.common_set_error);
                            unlockPhoneViewModel.getUnlockEnable().postValue(Boolean.valueOf(z ^ true));
                        }

                        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                        public void onSuccess(String did, int type, SyncResult result) {
                            boolean z2 = z;
                            boolean z3 = false;
                            if (result != null && !SyncResultExitKt.isNotSupport(result)) {
                                z3 = true;
                            }
                            Logger.i(UnlockPhoneViewModel.TAG, "setAuthorizeUnlock " + z2 + " success: " + z3);
                            if (result == null || SyncResultExitKt.isNotSupport(result)) {
                                unlockPhoneViewModel.getUnlockEnable().postValue(Boolean.valueOf(!z));
                            } else {
                                unlockPhoneViewModel.getUnlockEnable().postValue(Boolean.valueOf(z));
                            }
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20191(int i, boolean z, Continuation<? super C20191> continuation) {
            super(2, continuation);
            this.$deviceType = i;
            this.$enable = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UnlockPhoneViewModel.this.new C20191(this.$deviceType, this.$enable, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04461 c04461 = new C04461(UnlockPhoneViewModel.this, this.$deviceType, this.$enable, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04461, this) == coroutine_suspended) {
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
            return ((C20191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(SyncResult result) {
        txo txoVarE;
        lwo.a aVarQ;
        lwo[] lwoVarArr;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (result != null && SyncResultExitKt.isSuccess(result)) {
            s7r packet = result.getPacket();
            if (packet != null && (txoVarE = packet.E()) != null && (aVarQ = txoVarE.q()) != null && (lwoVarArr = aVarQ.c) != null) {
                boolean z2 = false;
                for (lwo lwoVar : lwoVarArr) {
                    if (lwoVar.c == 2) {
                        z2 = lwoVar.d;
                    }
                }
                z = z2;
            }
        } else if (result == null || !SyncResultExitKt.isNotSupport(result)) {
            ToastUtil.showShortToast(wzi.p5);
        } else {
            ToastUtil.showShortToast(wzi.Ra);
        }
        Logger.d(TAG, "handleAuthorizeUnlockResult " + z);
        this.unlockEnable.postValue(Boolean.valueOf(z));
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.mDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void getAuthorizeUnlock() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Integer> getUnlockDistanceRightValue() {
        return this.unlockDistanceRightValue;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUnlockEnable() {
        return this.unlockEnable;
    }

    public final void getUnlockScreenType() {
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockPhoneViewModel$getUnlockScreenType$1$1(this, wearableDeviceModel, null), 3, null);
        }
    }

    public final boolean hasScreenLockPwd(@Nullable Context context) {
        Object systemService = context != null ? context.getSystemService("keyguard") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((KeyguardManager) systemService).isKeyguardSecure();
    }

    public final void setAuthorizeUnlock(int deviceType, boolean enable) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20191(deviceType, enable, null), 3, null);
    }
}
