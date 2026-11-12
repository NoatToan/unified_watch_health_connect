package com.xiaomi.fitness.devicesettings.common.vitality;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.common.vitality.VitalitySettingFragment;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.ar9;
import defpackage.eui;
import defpackage.ij6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/vitality/VitalitySettingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/vitality/VitalityViewModel;", "Lij6;", "", "bindView", "(Lij6;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VitalitySettingFragment extends BaseLoadableBindingFragment<VitalityViewModel, ij6> {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ij6 access$getMBinding(VitalitySettingFragment vitalitySettingFragment) {
        return (ij6) vitalitySettingFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ VitalityViewModel access$getMViewModel(VitalitySettingFragment vitalitySettingFragment) {
        return (VitalityViewModel) vitalitySettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$1(final VitalitySettingFragment this$0, final ij6 this_bindView, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        WearableDeviceModel mDeviceModel = ((VitalityViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel != null && mDeviceModel.getIsDeviceConnected()) {
            PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 5, null);
            ((VitalityViewModel) this$0.getMViewModel()).setActivityReminder(z, z, new Function1() { // from class: b2r
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return VitalitySettingFragment.bindView$lambda$1$lambda$0(this.f3721a, this_bindView, z, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
            }
            this_bindView.A.setSwitch(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1$lambda$0(VitalitySettingFragment this$0, ij6 this_bindView, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        AnyExtKt.main$default(null, new VitalitySettingFragment$bindView$1$1$1(this$0, z2, this_bindView, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$3(final VitalitySettingFragment this$0, final ij6 this_bindView, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        WearableDeviceModel mDeviceModel = ((VitalityViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel != null && mDeviceModel.getIsDeviceConnected()) {
            PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 5, null);
            ((VitalityViewModel) this$0.getMViewModel()).setActivityReminder(z, this_bindView.B.getSwitch(), new Function1() { // from class: g2r
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return VitalitySettingFragment.bindView$lambda$3$lambda$2(this.f18516a, this_bindView, z, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
            }
            this_bindView.C.setSwitch(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$2(VitalitySettingFragment this$0, ij6 this_bindView, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        AnyExtKt.main$default(null, new VitalitySettingFragment$bindView$2$1$1(this$0, z2, this_bindView, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$5(final VitalitySettingFragment this$0, final ij6 this_bindView, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        WearableDeviceModel mDeviceModel = ((VitalityViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel != null && mDeviceModel.getIsDeviceConnected()) {
            PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 5, null);
            ((VitalityViewModel) this$0.getMViewModel()).setActivityReminder(this_bindView.C.getSwitch(), z, new Function1() { // from class: h2r
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return VitalitySettingFragment.bindView$lambda$5$lambda$4(this.f19632a, this_bindView, z, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
            }
            this_bindView.B.setSwitch(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4(VitalitySettingFragment this$0, ij6 this_bindView, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        AnyExtKt.main$default(null, new VitalitySettingFragment$bindView$3$1$1(this$0, z2, this_bindView, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(VitalitySettingFragment this$0, ar9 ar9Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new VitalitySettingFragment$onViewCreated$1$1(this$0, ar9Var, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final ij6 ij6Var) {
        Intrinsics.checkNotNullParameter(ij6Var, "<this>");
        ij6Var.A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: c2r
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                VitalitySettingFragment.bindView$lambda$1(this.f4868a, ij6Var, z, iSwitchButton);
            }
        });
        ij6Var.C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: d2r
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                VitalitySettingFragment.bindView$lambda$3(this.f15015a, ij6Var, z, iSwitchButton);
            }
        });
        ij6Var.B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: e2r
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                VitalitySettingFragment.bindView$lambda$5(this.f16202a, ij6Var, z, iSwitchButton);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.K0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.h9);
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((VitalityViewModel) getMViewModel()).getActivityReminderByDevice(new Function1() { // from class: f2r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VitalitySettingFragment.onViewCreated$lambda$6(this.f17345a, (ar9) obj);
            }
        });
    }
}
