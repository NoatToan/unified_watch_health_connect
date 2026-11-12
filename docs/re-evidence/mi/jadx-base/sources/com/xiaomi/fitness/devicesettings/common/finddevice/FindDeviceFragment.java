package com.xiaomi.fitness.devicesettings.common.finddevice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.eui;
import defpackage.wzi;
import defpackage.z6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u000fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/finddevice/FindDeviceFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/finddevice/FindDeviceViewModel;", "Lz6a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", LifecycleConstantKt.ON_DESTROY, "()V", "com/xiaomi/fitness/devicesettings/common/finddevice/FindDeviceFragment$mDeviceStatusListener$1", "mDeviceStatusListener", "Lcom/xiaomi/fitness/devicesettings/common/finddevice/FindDeviceFragment$mDeviceStatusListener$1;", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FindDeviceFragment extends BaseLoadableBindingFragment<FindDeviceViewModel, z6a> {

    @NotNull
    private final FindDeviceFragment$mDeviceStatusListener$1 mDeviceStatusListener = new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceFragment$mDeviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            FindDeviceFragment.access$getMBinding(this.this$0).C.setEnabled(true);
            FindDeviceFragment.access$getMBinding(this.this$0).E.setEnabled(false);
            FindDeviceFragment.access$getMBinding(this.this$0).D.setText(this.this$0.getString(wzi.v4));
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            FindDeviceFragment.access$getMBinding(this.this$0).D.setText(this.this$0.getString(wzi.s4));
            FindDeviceFragment.access$getMBinding(this.this$0).C.setEnabled(false);
            FindDeviceFragment.access$getMBinding(this.this$0).E.setEnabled(false);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ z6a access$getMBinding(FindDeviceFragment findDeviceFragment) {
        return (z6a) findDeviceFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(FindDeviceFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((FindDeviceViewModel) this$0.getMViewModel()).stopTimer();
        WearableDeviceModel mDeviceModel = ((FindDeviceViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || !mDeviceModel.getIsDeviceConnected()) {
            ((z6a) this$0.getMBinding()).D.setText(this$0.getString(wzi.s4));
            ((z6a) this$0.getMBinding()).C.setEnabled(true);
            ((z6a) this$0.getMBinding()).E.setEnabled(false);
        } else {
            ((FindDeviceViewModel) this$0.getMViewModel()).startTimer();
            ((FindDeviceViewModel) this$0.getMViewModel()).findDevice();
            ((z6a) this$0.getMBinding()).C.setEnabled(false);
            ((z6a) this$0.getMBinding()).E.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$1(FindDeviceFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            ((z6a) this$0.getMBinding()).C.setEnabled(false);
            ((z6a) this$0.getMBinding()).E.setEnabled(true);
            ((z6a) this$0.getMBinding()).D.setText(this$0.getString(wzi.u4));
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.w4);
            }
            ((z6a) this$0.getMBinding()).D.setText(this$0.getString(wzi.v4));
            ((z6a) this$0.getMBinding()).C.setEnabled(true);
            ((z6a) this$0.getMBinding()).E.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(FindDeviceFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((FindDeviceViewModel) this$0.getMViewModel()).stopTimer();
        WearableDeviceModel mDeviceModel = ((FindDeviceViewModel) this$0.getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || !mDeviceModel.getIsDeviceConnected()) {
            ((z6a) this$0.getMBinding()).D.setText(this$0.getString(wzi.s4));
            ((z6a) this$0.getMBinding()).C.setEnabled(true);
            ((z6a) this$0.getMBinding()).E.setEnabled(false);
        } else {
            ((FindDeviceViewModel) this$0.getMViewModel()).stopFindDevice();
            ((z6a) this$0.getMBinding()).C.setEnabled(false);
            ((z6a) this$0.getMBinding()).E.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$3(FindDeviceFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            ((z6a) this$0.getMBinding()).C.setEnabled(true);
            ((z6a) this$0.getMBinding()).E.setEnabled(false);
            ((z6a) this$0.getMBinding()).D.setText(this$0.getString(wzi.v4));
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.t4);
            }
            ((z6a) this$0.getMBinding()).C.setEnabled(false);
            ((z6a) this$0.getMBinding()).E.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$4(FindDeviceFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((FindDeviceViewModel) this$0.getMViewModel()).stopTimer();
        if (num == null || num.intValue() != 1) {
            ((FindDeviceViewModel) this$0.getMViewModel()).startTimer();
            return;
        }
        ((z6a) this$0.getMBinding()).C.setEnabled(true);
        ((z6a) this$0.getMBinding()).E.setEnabled(false);
        ((z6a) this$0.getMBinding()).D.setText(this$0.getString(wzi.v4));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        ((FindDeviceViewModel) getMViewModel()).stopFindDevice();
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        ((FindDeviceViewModel) getMViewModel()).stopTimer();
        ((FindDeviceViewModel) getMViewModel()).unregisterReceiver(getMActivity());
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.mDeviceStatusListener);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.r4);
        WearableDeviceModel mDeviceModel = ((FindDeviceViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || !mDeviceModel.getIsDeviceConnected()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
            }
            ((z6a) getMBinding()).D.setText(getString(wzi.s4));
            ((z6a) getMBinding()).C.setEnabled(false);
            ((z6a) getMBinding()).E.setEnabled(false);
        } else {
            ((z6a) getMBinding()).C.setEnabled(true);
            ((z6a) getMBinding()).E.setEnabled(false);
            ((z6a) getMBinding()).D.setText(getString(wzi.v4));
        }
        ((z6a) getMBinding()).A.show(((FindDeviceViewModel) getMViewModel()).getMDeviceModel());
        ViewExtKt.clickWithTrigger$default(((z6a) getMBinding()).C, 0L, new Function1() { // from class: fn9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FindDeviceFragment.onViewCreated$lambda$0(this.f17950a, (Button) obj);
            }
        }, 1, null);
        ((FindDeviceViewModel) getMViewModel()).getFindResult().observe(getViewLifecycleOwner(), new Observer() { // from class: gn9
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FindDeviceFragment.onViewCreated$lambda$1(this.f19153a, (Boolean) obj);
            }
        });
        ViewExtKt.clickWithTrigger$default(((z6a) getMBinding()).E, 0L, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FindDeviceFragment.onViewCreated$lambda$2(this.f20255a, (Button) obj);
            }
        }, 1, null);
        ((FindDeviceViewModel) getMViewModel()).getStopFindResult().observe(getViewLifecycleOwner(), new Observer() { // from class: in9
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FindDeviceFragment.onViewCreated$lambda$3(this.f21316a, (Boolean) obj);
            }
        });
        ((FindDeviceViewModel) getMViewModel()).getFindMode().observe(getViewLifecycleOwner(), new Observer() { // from class: jn9
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FindDeviceFragment.onViewCreated$lambda$4(this.f22941a, (Integer) obj);
            }
        });
        ((FindDeviceViewModel) getMViewModel()).registerReceiver(getMActivity());
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.mDeviceStatusListener);
    }
}
