package com.xiaomi.fitness.devicesettings.huami.blbroadcast;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel;
import com.xiaomi.fitness.settingitem.settingitem.BluetoothBroadcast;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0010J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u001bR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/blbroadcast/BLTBroadCastViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "isBlueToothEnable", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "setBlueToothEnable", "(Landroidx/lifecycle/MutableLiveData;)V", "getConnectedAdvStatus", "getSetting", "Lcom/xiaomi/fitness/settingitem/settingitem/BluetoothBroadcast;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleBluetoothBroadcastChecked", "isEnabled", "syncConfig", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BLTBroadCastViewModel extends BaseLoadableBindingViewModel {

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ru1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BLTBroadCastViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private MutableLiveData<Boolean> isBlueToothEnable = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel$getConnectedAdvStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel$getConnectedAdvStatus$1", f = "BLTBroadCastViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BLTBroadCastViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BLTBroadCastViewModel bLTBroadCastViewModel = BLTBroadCastViewModel.this;
                this.label = 1;
                obj = bLTBroadCastViewModel.getSetting(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BLTBroadCastViewModel.this.isBlueToothEnable().postValue(Boxing.boxBoolean(((BluetoothBroadcast) obj).isEnable()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel$getSetting$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel", f = "BLTBroadCastViewModel.kt", i = {}, l = {43}, m = "getSetting", n = {}, s = {})
    public static final class C21561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21561(Continuation<? super C21561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BLTBroadCastViewModel.this.getSetting(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel$handleBluetoothBroadcastChecked$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel$handleBluetoothBroadcastChecked$1", f = "BLTBroadCastViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21571(boolean z, Continuation<? super C21571> continuation) {
            super(2, continuation);
            this.$isEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BLTBroadCastViewModel.this.new C21571(this.$isEnabled, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BLTBroadCastViewModel bLTBroadCastViewModel = BLTBroadCastViewModel.this;
                boolean z = this.$isEnabled;
                this.label = 1;
                obj = bLTBroadCastViewModel.syncConfig(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.d(BLTBroadCastViewModelKt.TAG, "BluetoothBroadcastChecked " + this.$isEnabled + " success:" + zBooleanValue);
            if (zBooleanValue) {
                BLTBroadCastViewModel.this.isBlueToothEnable().postValue(Boxing.boxBoolean(this.$isEnabled));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel$syncConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastViewModel", f = "BLTBroadCastViewModel.kt", i = {}, l = {65}, m = "syncConfig", n = {}, s = {})
    public static final class C21581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21581(Continuation<? super C21581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BLTBroadCastViewModel.this.syncConfig(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getSetting(Continuation<? super BluetoothBroadcast> continuation) {
        C21561 c21561;
        if (continuation instanceof C21561) {
            c21561 = (C21561) continuation;
            int i = c21561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21561.label = i - Integer.MIN_VALUE;
            } else {
                c21561 = new C21561(continuation);
            }
        } else {
            c21561 = new C21561(continuation);
        }
        Object objWithContext = c21561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                BLTBroadCastViewModel$getSetting$2$1 bLTBroadCastViewModel$getSetting$2$1 = new BLTBroadCastViewModel$getSetting$2$1(mDeviceModel, null);
                c21561.label = 1;
                objWithContext = BuildersKt.withContext(io2, bLTBroadCastViewModel$getSetting$2$1, c21561);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new BluetoothBroadcast();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objWithContext);
        BluetoothBroadcast bluetoothBroadcast = (BluetoothBroadcast) objWithContext;
        if (bluetoothBroadcast != null) {
            return bluetoothBroadcast;
        }
        return new BluetoothBroadcast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncConfig(boolean z, Continuation<? super Boolean> continuation) {
        C21581 c21581;
        boolean zBooleanValue;
        if (continuation instanceof C21581) {
            c21581 = (C21581) continuation;
            int i = c21581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21581.label = i - Integer.MIN_VALUE;
            } else {
                c21581 = new C21581(continuation);
            }
        } else {
            c21581 = new C21581(continuation);
        }
        Object objWithContext = c21581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                BLTBroadCastViewModel$syncConfig$2$1 bLTBroadCastViewModel$syncConfig$2$1 = new BLTBroadCastViewModel$syncConfig$2$1(mDeviceModel, z, this, null);
                c21581.label = 1;
                objWithContext = BuildersKt.withContext(io2, bLTBroadCastViewModel$syncConfig$2$1, c21581);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objWithContext);
        zBooleanValue = ((Boolean) objWithContext).booleanValue();
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    public final void getConnectedAdvStatus() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void handleBluetoothBroadcastChecked(boolean isEnabled) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21571(isEnabled, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> isBlueToothEnable() {
        return this.isBlueToothEnable;
    }

    public final void setBlueToothEnable(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isBlueToothEnable = mutableLiveData;
    }
}
