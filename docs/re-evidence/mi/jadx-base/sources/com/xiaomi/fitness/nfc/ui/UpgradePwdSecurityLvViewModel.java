package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.service.mi.entity.BaseResponse;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.ui.UpgradePwdSecurityLvViewModel;
import com.xiaomi.hm.health.bt.profile.nfc.PasswordInteractionResponse;
import defpackage.rvf;
import defpackage.vqg;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/UpgradePwdSecurityLvViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "resultCode", "Landroidx/lifecycle/MutableLiveData;", "", "getResultCode", "()Landroidx/lifecycle/MutableLiveData;", "setResultCode", "(Landroidx/lifecycle/MutableLiveData;)V", "upgradePwdSecurityLevel", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpgradePwdSecurityLvViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "SetUnWearPwdViewModel";
    public static final int sResultFail = 1;
    public static final int sResultIssue = 2;
    public static final int sResultSuccess = 0;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qcq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UpgradePwdSecurityLvViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private MutableLiveData<Integer> resultCode = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.UpgradePwdSecurityLvViewModel$upgradePwdSecurityLevel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.UpgradePwdSecurityLvViewModel$upgradePwdSecurityLevel$1", f = "UpgradePwdSecurityLvViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.UpgradePwdSecurityLvViewModel$upgradePwdSecurityLevel$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.UpgradePwdSecurityLvViewModel$upgradePwdSecurityLevel$1$1", f = "UpgradePwdSecurityLvViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HuamiApiCaller $huamiApiCaller;
            int label;
            final /* synthetic */ UpgradePwdSecurityLvViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06871(HuamiApiCaller huamiApiCaller, UpgradePwdSecurityLvViewModel upgradePwdSecurityLvViewModel, Continuation<? super C06871> continuation) {
                super(2, continuation);
                this.$huamiApiCaller = huamiApiCaller;
                this.this$0 = upgradePwdSecurityLvViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06871(this.$huamiApiCaller, this.this$0, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:32:0x0127  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean passwordInteraction;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
                PasswordInteractionResponse passwordInteractionResponsePasswordInteraction = huamiApiCaller != null ? huamiApiCaller.passwordInteraction() : null;
                if (passwordInteractionResponsePasswordInteraction != null) {
                    Logger.i("SetUnWearPwdViewModel", "passwordInteraction isPasswordHaveSetUpSe:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveSetUpSe() + " isPasswordHaveSetUpFlash:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveSetUpFlash() + "  isPasswordIsSetUp:" + passwordInteractionResponsePasswordInteraction.isPasswordIsSetUp() + " isPasswordHaveNotSetUpSe:" + passwordInteractionResponsePasswordInteraction.isPasswordHaveNotSetUpSe() + " component1:" + passwordInteractionResponsePasswordInteraction.getType());
                } else {
                    WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                    Logger.i("SetUnWearPwdViewModel", "passwordInteraction response is null isConnected:" + (mDeviceModel != null ? Boxing.boxBoolean(mDeviceModel.getIsDeviceConnected()) : null));
                }
                if (passwordInteractionResponsePasswordInteraction != null) {
                    int type = passwordInteractionResponsePasswordInteraction.getType() & 15;
                    if (type == 0) {
                        this.this$0.getResultCode().postValue(Boxing.boxInt(2));
                    } else if (type != 3) {
                        this.this$0.getResultCode().postValue(Boxing.boxInt(1));
                    } else {
                        if (this.$huamiApiCaller.getCRSCode()) {
                            BaseResponse baseResponseI = rvf.i();
                            vqg.d("MiPayService.prepare() end code:" + baseResponseI.getResultCode() + "  msg:" + baseResponseI.getMsg());
                            passwordInteraction = baseResponseI.isStatusOK();
                            if (passwordInteraction) {
                                if (this.$huamiApiCaller.getCRSCode()) {
                                    this.this$0.getResultCode().postValue(Boxing.boxInt(1));
                                } else {
                                    passwordInteraction = this.$huamiApiCaller.setPasswordInteraction();
                                    vqg.d("getCRSCode->flushPwd2Se isSuccess:" + passwordInteraction);
                                }
                            }
                        } else {
                            passwordInteraction = this.$huamiApiCaller.setPasswordInteraction();
                            vqg.d("getCRSCode:false flushPwd2Se isSuccess:" + passwordInteraction);
                        }
                        if (passwordInteraction) {
                            this.this$0.getResultCode().postValue(Boxing.boxInt(0));
                        } else {
                            this.this$0.getResultCode().postValue(Boxing.boxInt(1));
                        }
                    }
                } else {
                    this.this$0.getResultCode().postValue(Boxing.boxInt(1));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpgradePwdSecurityLvViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                WearableDeviceModel mDeviceModel = UpgradePwdSecurityLvViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                String mac = mDeviceModel.getDeviceInfo().getMac();
                Intrinsics.checkNotNull(mac);
                HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06871 c06871 = new C06871(huaMiApiCaller, UpgradePwdSecurityLvViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06871, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<Integer> getResultCode() {
        return this.resultCode;
    }

    public final void setResultCode(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultCode = mutableLiveData;
    }

    public final void upgradePwdSecurityLevel() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        }
    }
}
