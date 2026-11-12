package com.xiaomi.fitness.devicesettings.common.lock;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
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
import com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingViewModel;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.UnwearSetting;
import defpackage.axo;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u000bJ(\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bJ\"\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u0019J$\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u0019H\u0002J\u0006\u0010 \u001a\u00020\u0017J\u0012\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/lock/UnWearSettingViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "isRequired", "", "()Z", "setRequired", "(Z)V", "wearSetting", "Lcom/xiaomi/fitness/settingitem/settingitem/UnwearSetting;", "getWearSetting", "()Lcom/xiaomi/fitness/settingitem/settingitem/UnwearSetting;", "setWearSetting", "(Lcom/xiaomi/fitness/settingitem/settingitem/UnwearSetting;)V", "isCanDeletePwd", "getUnWearSettings", "", "success", "Lkotlin/Function1;", "fail", "Lkotlin/Function0;", "setUnWearEnable", "enable", "callBack", "setUnWearEnableHuami", "setUnWearSetting", "attach", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnWearSettingViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "LanguageSettingViewModel";
    private boolean isRequired;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e9q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnWearSettingViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private UnwearSetting wearSetting = new UnwearSetting();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingViewModel$setUnWearEnableHuami$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingViewModel$setUnWearEnableHuami$1", f = "UnWearSettingViewModel.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callBack;
        final /* synthetic */ boolean $enable;
        int label;
        final /* synthetic */ UnWearSettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21451(Function1<? super Boolean, Unit> function1, UnWearSettingViewModel unWearSettingViewModel, boolean z, Continuation<? super C21451> continuation) {
            super(2, continuation);
            this.$callBack = function1;
            this.this$0 = unWearSettingViewModel;
            this.$enable = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21451(this.$callBack, this.this$0, this.$enable, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                UnWearSettingViewModel$setUnWearEnableHuami$1$success$1 unWearSettingViewModel$setUnWearEnableHuami$1$success$1 = new UnWearSettingViewModel$setUnWearEnableHuami$1$success$1(this.this$0, this.$enable, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, unWearSettingViewModel$setUnWearEnableHuami$1$success$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Boolean bool = (Boolean) obj;
            this.$callBack.invoke2(Boxing.boxBoolean(bool != null ? bool.booleanValue() : false));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final void setUnWearEnableHuami(boolean enable, Function1<? super Boolean, Unit> callBack) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21451(callBack, this, enable, null), 3, null);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getUnWearSettings(@NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null) {
            if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnWearSettingViewModel$getUnWearSettings$1$1(success, fail, this, null), 3, null);
                return;
            }
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 9;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingViewModel$getUnWearSettings$1$2
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.e("getUnWearSettings ble onError code:" + code, new Object[0]);
                    AnyExtKt.main$default(null, new UnWearSettingViewModel$getUnWearSettings$1$2$onError$1(fail, null), 1, null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    txo txoVarE;
                    axo axoVarV = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.v();
                    if (axoVarV != null) {
                        AnyExtKt.main$default(null, new UnWearSettingViewModel$getUnWearSettings$1$2$onSuccess$1(axoVarV, success, this, null), 1, null);
                    } else {
                        Logger.e("getUnWearSettings onSuccess but lockScreen is null", new Object[0]);
                        AnyExtKt.main$default(null, new UnWearSettingViewModel$getUnWearSettings$1$2$onSuccess$2(fail, null), 1, null);
                    }
                }
            }, 0, 8, null);
        }
    }

    @NotNull
    public final UnwearSetting getWearSetting() {
        return this.wearSetting;
    }

    public final boolean isCanDeletePwd() {
        if (getMDeviceModel() == null) {
            return false;
        }
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            return NfcManagerExtKt.getInstance(NfcManager.INSTANCE).getMasterSize() == 0;
        }
        return !this.isRequired;
    }

    /* JADX INFO: renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final void setRequired(boolean z) {
        this.isRequired = z;
    }

    public final void setUnWearEnable(boolean enable, @NotNull final Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            setUnWearEnableHuami(enable, callBack);
            return;
        }
        s7r s7rVar = new s7r();
        int i = 2;
        s7rVar.e = 2;
        s7rVar.f = 21;
        axo axoVar = new axo();
        if (!enable) {
            i = 1;
        } else if (this.isRequired) {
            i = 3;
        }
        axoVar.c = i;
        txo txoVar = new txo();
        txoVar.b0(axoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingViewModel.setUnWearEnable.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("setUnWearEnable ble onError code:" + code, new Object[0]);
                AnyExtKt.main$default(null, new UnWearSettingViewModel$setUnWearEnable$1$onError$1(callBack, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result != null) {
                    Function1<Boolean, Unit> function1 = callBack;
                    Logger.i("setUnWearEnable ble onSuccess", new Object[0]);
                    AnyExtKt.main$default(null, new UnWearSettingViewModel$setUnWearEnable$1$onSuccess$1$1(function1, result, null), 1, null);
                }
            }
        }, 0, 8, null);
    }

    public final void setUnWearSetting() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null) {
            DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_UNWAER_SETTING, new UnwearSetting());
        }
    }

    public final void setWearSetting(@NotNull UnwearSetting unwearSetting) {
        Intrinsics.checkNotNullParameter(unwearSetting, "<set-?>");
        this.wearSetting = unwearSetting;
    }
}
