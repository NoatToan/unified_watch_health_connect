package com.xiaomi.fitness.devicesettings.huami.limitbind;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.settingitem.settingitem.LimitBind;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/limitbind/LimitBindViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "limitBindConfig", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/settingitem/settingitem/LimitBind;", "getLimitBindConfig", "()Landroidx/lifecycle/MutableLiveData;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getLimitBindSetting", "setLimitBind", "limit", "", "syncLimitBindConfig", "isLimit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LimitBindViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    private final MutableLiveData<LimitBind> limitBindConfig = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.limitbind.LimitBindViewModel$setLimitBind$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.limitbind.LimitBindViewModel$setLimitBind$1", f = "LimitBindViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$limit = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LimitBindViewModel.this.new AnonymousClass1(this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LimitBindViewModel limitBindViewModel = LimitBindViewModel.this;
                boolean z = this.$limit;
                this.label = 1;
                obj = limitBindViewModel.syncLimitBindConfig(z, this);
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
            Logger.d(LimitBindViewModelKt.TAG, "setLimitBind " + this.$limit + " success:" + zBooleanValue);
            LimitBindViewModel.this.postDataLoaded();
            if (zBooleanValue) {
                WearableDeviceModel mDeviceModel = LimitBindViewModel.this.getMDeviceModel();
                if (mDeviceModel != null) {
                    DeviceSettingsPreference.INSTANCE.setLimitBindStatus(mDeviceModel.getDid(), this.$limit);
                }
                MutableLiveData<LimitBind> limitBindConfig = LimitBindViewModel.this.getLimitBindConfig();
                LimitBind limitBind = new LimitBind();
                limitBind.setEnable(this.$limit);
                limitBindConfig.postValue(limitBind);
            } else {
                LimitBindViewModel.this.postLoadStatus(3);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.limitbind.LimitBindViewModel$syncLimitBindConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.limitbind.LimitBindViewModel", f = "LimitBindViewModel.kt", i = {}, l = {62}, m = "syncLimitBindConfig", n = {}, s = {})
    public static final class C21821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21821(Continuation<? super C21821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LimitBindViewModel.this.syncLimitBindConfig(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncLimitBindConfig(boolean z, Continuation<? super Boolean> continuation) {
        C21821 c21821;
        boolean zBooleanValue;
        if (continuation instanceof C21821) {
            c21821 = (C21821) continuation;
            int i = c21821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21821.label = i - Integer.MIN_VALUE;
            } else {
                c21821 = new C21821(continuation);
            }
        } else {
            c21821 = new C21821(continuation);
        }
        Object objWithContext = c21821.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                LimitBindViewModel$syncLimitBindConfig$2$1 limitBindViewModel$syncLimitBindConfig$2$1 = new LimitBindViewModel$syncLimitBindConfig$2$1(mDeviceModel, z, null);
                c21821.label = 1;
                objWithContext = BuildersKt.withContext(io2, limitBindViewModel$syncLimitBindConfig$2$1, c21821);
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

    @NotNull
    public final MutableLiveData<LimitBind> getLimitBindConfig() {
        return this.limitBindConfig;
    }

    public final void getLimitBindSetting() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        boolean limitBindStatus = mDeviceModel != null ? DeviceSettingsPreference.INSTANCE.getLimitBindStatus(mDeviceModel.getDid()) : false;
        MutableLiveData<LimitBind> mutableLiveData = this.limitBindConfig;
        LimitBind limitBind = new LimitBind();
        limitBind.setEnable(limitBindStatus);
        mutableLiveData.setValue(limitBind);
    }

    public final void setLimitBind(boolean limit) {
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(limit, null), 3, null);
    }
}
