package com.xiaomi.fitness.devicesettings.base.unlock.laptop;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.UnlockLaptop;
import defpackage.lwo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\u001aR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/unlock/laptop/AuthorizeUnlockViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "unlockSwitch", "Landroidx/lifecycle/MutableLiveData;", "", "getUnlockSwitch", "()Landroidx/lifecycle/MutableLiveData;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getAuthorizeUnlock", "setAuthorizeUnlock", "deviceType", "", "enable", "getHuamiSwitch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setHuamiSwitch", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBleSwitch", "setBleSwitch", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthorizeUnlockViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "AuthorizeUnlockViewModel";

    @Nullable
    private WearableDeviceModel deviceModel;

    @NotNull
    private final MutableLiveData<Boolean> unlockSwitch = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$getAuthorizeUnlock$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$getAuthorizeUnlock$1", f = "AuthorizeUnlockViewModel.kt", i = {}, l = {51, 53}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthorizeUnlockViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel wearableDeviceModel = AuthorizeUnlockViewModel.this.deviceModel;
                if (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    AuthorizeUnlockViewModel authorizeUnlockViewModel = AuthorizeUnlockViewModel.this;
                    this.label = 2;
                    if (authorizeUnlockViewModel.getBleSwitch(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    AuthorizeUnlockViewModel authorizeUnlockViewModel2 = AuthorizeUnlockViewModel.this;
                    this.label = 1;
                    if (authorizeUnlockViewModel2.getHuamiSwitch(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$getBleSwitch$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$getBleSwitch$2", f = "AuthorizeUnlockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthorizeUnlockViewModel.this.new AnonymousClass2(continuation);
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
            s7rVar.f = 19;
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final AuthorizeUnlockViewModel authorizeUnlockViewModel = AuthorizeUnlockViewModel.this;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel.getBleSwitch.2.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.e(AuthorizeUnlockViewModel.TAG, "getBleSwitch error:" + did + " " + type + " " + code);
                    ToastUtil.showShortToast(wzi.p5);
                    authorizeUnlockViewModel.getUnlockSwitch().postValue(null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    txo txoVarE;
                    lwo.a aVarQ;
                    lwo[] lwoVarArr;
                    Boolean boolValueOf = null;
                    if (result != null && SyncResultExitKt.isSuccess(result)) {
                        s7r packet = result.getPacket();
                        if (packet != null && (txoVarE = packet.E()) != null && (aVarQ = txoVarE.q()) != null && (lwoVarArr = aVarQ.c) != null) {
                            for (lwo lwoVar : lwoVarArr) {
                                if (lwoVar.c == 1) {
                                    boolValueOf = Boolean.valueOf(lwoVar.d);
                                }
                            }
                        }
                        if (boolValueOf == null) {
                            ToastUtil.showShortToast(wzi.p5);
                        }
                    } else if (result == null || !SyncResultExitKt.isNotSupport(result)) {
                        ToastUtil.showShortToast(wzi.p5);
                    } else {
                        ToastUtil.showShortToast(wzi.y4);
                    }
                    authorizeUnlockViewModel.getUnlockSwitch().postValue(boolValueOf);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$getHuamiSwitch$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$getHuamiSwitch$2", f = "AuthorizeUnlockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20152 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20152(Continuation<? super C20152> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthorizeUnlockViewModel.this.new C20152(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            WearableDeviceModel wearableDeviceModel = AuthorizeUnlockViewModel.this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            Object objValueToObject = companion.readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KEY_UNLOCK_LAPTOP).valueToObject(UnlockLaptop.class);
            UnlockLaptop unlockLaptop = objValueToObject instanceof UnlockLaptop ? (UnlockLaptop) objValueToObject : null;
            if (unlockLaptop != null) {
                AuthorizeUnlockViewModel.this.getUnlockSwitch().postValue(Boxing.boxBoolean(unlockLaptop.isEnable()));
            } else {
                AuthorizeUnlockViewModel.this.getUnlockSwitch().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$setAuthorizeUnlock$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$setAuthorizeUnlock$1", f = "AuthorizeUnlockViewModel.kt", i = {}, l = {61, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $deviceType;
        final /* synthetic */ boolean $enable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20161(boolean z, int i, Continuation<? super C20161> continuation) {
            super(2, continuation);
            this.$enable = z;
            this.$deviceType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthorizeUnlockViewModel.this.new C20161(this.$enable, this.$deviceType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel wearableDeviceModel = AuthorizeUnlockViewModel.this.deviceModel;
                if (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    AuthorizeUnlockViewModel authorizeUnlockViewModel = AuthorizeUnlockViewModel.this;
                    int i2 = this.$deviceType;
                    boolean z = this.$enable;
                    this.label = 2;
                    if (authorizeUnlockViewModel.setBleSwitch(i2, z, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    AuthorizeUnlockViewModel authorizeUnlockViewModel2 = AuthorizeUnlockViewModel.this;
                    boolean z2 = this.$enable;
                    this.label = 1;
                    if (authorizeUnlockViewModel2.setHuamiSwitch(z2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$setBleSwitch$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$setBleSwitch$2", f = "AuthorizeUnlockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20172 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $deviceType;
        final /* synthetic */ boolean $enable;
        int label;
        final /* synthetic */ AuthorizeUnlockViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20172(int i, boolean z, AuthorizeUnlockViewModel authorizeUnlockViewModel, Continuation<? super C20172> continuation) {
            super(2, continuation);
            this.$deviceType = i;
            this.$enable = z;
            this.this$0 = authorizeUnlockViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20172(this.$deviceType, this.$enable, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            int i = this.$deviceType;
            boolean z = this.$enable;
            s7rVar.e = 2;
            s7rVar.f = 20;
            lwo lwoVar = new lwo();
            lwoVar.c = i;
            lwoVar.d = z;
            txo txoVar = new txo();
            txoVar.W(lwoVar);
            s7rVar.c0(txoVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final AuthorizeUnlockViewModel authorizeUnlockViewModel = this.this$0;
            final boolean z2 = this.$enable;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel.setBleSwitch.2.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.e(AuthorizeUnlockViewModel.TAG, "setBleSwitch error:" + did + " " + type + " " + code);
                    ToastUtil.showShortToast(wzi.p5);
                    authorizeUnlockViewModel.getUnlockSwitch().postValue(null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.e(AuthorizeUnlockViewModel.TAG, "setBleSwitch onSuccess:" + did + " " + type + " " + (result != null ? Integer.valueOf(result.getCode()) : null));
                    if (result != null) {
                        AuthorizeUnlockViewModel authorizeUnlockViewModel2 = authorizeUnlockViewModel;
                        boolean z3 = z2;
                        if (!SyncResultExitKt.isNotSupport(result)) {
                            authorizeUnlockViewModel2.getUnlockSwitch().postValue(Boolean.valueOf(z3));
                        } else {
                            ToastUtil.showShortToast(wzi.y4);
                            authorizeUnlockViewModel2.getUnlockSwitch().postValue(Boolean.valueOf(!z3));
                        }
                    }
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$setHuamiSwitch$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockViewModel$setHuamiSwitch$2", f = "AuthorizeUnlockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20182 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20182(boolean z, Continuation<? super C20182> continuation) {
            super(2, continuation);
            this.$enable = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthorizeUnlockViewModel.this.new C20182(this.$enable, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            WearableDeviceModel wearableDeviceModel = AuthorizeUnlockViewModel.this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
            boolean zEnableMultiLink = huaMiApiCaller != null ? huaMiApiCaller.enableMultiLink(this.$enable) : false;
            Logger.d(AuthorizeUnlockViewModel.TAG, "setHuamiSwitch " + this.$enable + " result:" + zEnableMultiLink);
            if (zEnableMultiLink) {
                UnlockLaptop unlockLaptop = new UnlockLaptop();
                unlockLaptop.setEnable(this.$enable);
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel wearableDeviceModel2 = AuthorizeUnlockViewModel.this.deviceModel;
                Intrinsics.checkNotNull(wearableDeviceModel2);
                companion.sendSettingItem(wearableDeviceModel2.getDid(), DeviceSettingConfigKey.KEY_UNLOCK_LAPTOP, unlockLaptop);
                AuthorizeUnlockViewModel.this.getUnlockSwitch().postValue(Boxing.boxBoolean(this.$enable));
            } else {
                AuthorizeUnlockViewModel.this.getUnlockSwitch().postValue(Boxing.boxBoolean(!this.$enable));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getBleSwitch(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getHuamiSwitch(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C20152(null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setBleSwitch(int i, boolean z, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C20172(i, z, this, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setHuamiSwitch(boolean z, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C20182(z, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void getAuthorizeUnlock() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getUnlockSwitch() {
        return this.unlockSwitch;
    }

    public final void setAuthorizeUnlock(int deviceType, boolean enable) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20161(enable, deviceType, null), 3, null);
    }
}
