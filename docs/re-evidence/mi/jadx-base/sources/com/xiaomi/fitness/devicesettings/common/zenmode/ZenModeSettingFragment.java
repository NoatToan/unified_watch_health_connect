package com.xiaomi.fitness.devicesettings.common.zenmode;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.common.zenmode.ZenModeSettingFragment;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.utils.ZenUtils;
import com.xiaomi.fitness.devicesettings.utils.ZenUtilsKt;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.ak6;
import defpackage.eui;
import defpackage.fli;
import defpackage.wzi;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/zenmode/ZenModeSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/zenmode/ZenModeViewModel;", "Lak6;", "", "onZenModeOpen", "()V", "onZenModeClose", "", "syncWithPhone", "setZenModeSyncWithPhone", "(Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "bindView", "(Lak6;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ZenModeSettingFragment extends BaseLoadableBindingFragment<ZenModeViewModel, ak6> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.zenmode.ZenModeSettingFragment$onZenModeOpen$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.zenmode.ZenModeSettingFragment$onZenModeOpen$1", f = "ZenModeSettingFragment.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ZenUtils zenUtils = ZenUtils.INSTANCE;
                this.label = 1;
                if (zenUtils.postSyncZenMode(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.zenmode.ZenModeSettingFragment$setZenModeSyncWithPhone$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.zenmode.ZenModeSettingFragment$setZenModeSyncWithPhone$1", f = "ZenModeSettingFragment.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $syncWithPhone;
        int label;
        final /* synthetic */ ZenModeSettingFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21521(boolean z, ZenModeSettingFragment zenModeSettingFragment, Continuation<? super C21521> continuation) {
            super(2, continuation);
            this.$syncWithPhone = z;
            this.this$0 = zenModeSettingFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ZenModeSettingFragment zenModeSettingFragment, boolean z, boolean z2) {
            AnyExtKt.main$default(null, new ZenModeSettingFragment$setZenModeSyncWithPhone$1$1$1(zenModeSettingFragment, z2, z, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21521(this.$syncWithPhone, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ZenUtils zenUtils = ZenUtils.INSTANCE;
                final boolean z = this.$syncWithPhone;
                final ZenModeSettingFragment zenModeSettingFragment = this.this$0;
                Function1<? super Boolean, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.devicesettings.common.zenmode.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return ZenModeSettingFragment.C21521.invokeSuspend$lambda$0(zenModeSettingFragment, z, ((Boolean) obj2).booleanValue());
                    }
                };
                this.label = 1;
                if (zenUtils.setZenModeSyncWithPhone(z, function1, this) == coroutine_suspended) {
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
            return ((C21521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ak6 access$getMBinding(ZenModeSettingFragment zenModeSettingFragment) {
        return (ak6) zenModeSettingFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$1(ZenModeSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        WearableDeviceModel mDeviceModel;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getMDeviceModel() == null || !((mDeviceModel = this$0.getMDeviceModel()) == null || mDeviceModel.getIsDeviceConnected())) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
                return;
            }
            return;
        }
        if (!z) {
            if (((ZenModeViewModel) this$0.getMViewModel()).getZenModeSyncWithPhone().getValue() == null) {
                this$0.onZenModeClose();
                return;
            } else {
                this$0.setZenModeSyncWithPhone(false);
                return;
            }
        }
        if (!NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
            this$0.onZenModeClose();
            ZenUtilsKt.showNotificationPolicyAccessSettingRequestDialog(this$0);
        } else if (((ZenModeViewModel) this$0.getMViewModel()).getZenModeSyncWithPhone().getValue() == null) {
            this$0.onZenModeOpen();
        } else {
            this$0.setZenModeSyncWithPhone(true);
        }
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(ZenModeSettingFragment this$0, Boolean bool) {
        boolean zIsZenModeOpen;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool != null) {
            zIsZenModeOpen = bool.booleanValue();
        } else {
            DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
            WearableDeviceModel mDeviceModel = this$0.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            zIsZenModeOpen = deviceSettingsPreference.isZenModeOpen(mDeviceModel.getDid());
        }
        if (zIsZenModeOpen && NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
            this$0.onZenModeOpen();
        } else if (bool == null) {
            this$0.onZenModeClose();
        } else {
            AnyExtKt.io$default(null, new ZenModeSettingFragment$onViewCreated$1$1(this$0, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onZenModeClose() {
        hideLoading();
        DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        deviceSettingsPreference.isZenModeOpen(mDeviceModel.getDid(), false);
        ((ak6) getMBinding()).B.setSwitch(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onZenModeOpen() {
        DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        deviceSettingsPreference.isZenModeOpen(mDeviceModel.getDid(), true);
        ((ak6) getMBinding()).B.setSwitch(true);
        hideLoading();
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    private final void setZenModeSyncWithPhone(boolean syncWithPhone) {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        AnyExtKt.io$default(null, new C21521(syncWithPhone, this, null), 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ak6 ak6Var) {
        Intrinsics.checkNotNullParameter(ak6Var, "<this>");
        setTitle(wzi.Na);
        ak6Var.B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: x0s
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                ZenModeSettingFragment.bindView$lambda$1(this.f38558a, z, iSwitchButton);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.T0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(fli.e);
        ((ak6) getMBinding()).A.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((ZenModeViewModel) getMViewModel()).getZenModeSyncWithPhone(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FragmentActivity mActivity;
        WearableDeviceModel mDeviceModel;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if ((getMDeviceModel() == null || ((mDeviceModel = getMDeviceModel()) != null && !mDeviceModel.getIsDeviceConnected())) && (mActivity = getMActivity()) != null) {
            ToastExtKt.toastShort(mActivity, wzi.u);
        }
        ((ZenModeViewModel) getMViewModel()).getZenModeSyncWithPhone().observe(getViewLifecycleOwner(), new Observer() { // from class: y0s
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ZenModeSettingFragment.onViewCreated$lambda$0(this.f39667a, (Boolean) obj);
            }
        });
    }
}
