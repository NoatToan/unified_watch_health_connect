package com.xiaomi.fitness.devicesettings.huami.photo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetFragment;
import defpackage.dm6;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0019\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel;", "Ldm6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "()V", "setListener", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyView", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PhotoSetFragment extends BaseLoadableBindingFragment<PhotoSetViewModel, dm6> {
    public static final int REQUEST_CODE_BLUETOOTH_HID_SETTINGS = 999;
    public static final int REQUEST_CODE_BLUETOOTH_SETTINGS = 1006;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$0(PhotoSetFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((dm6) this$0.getMBinding()).C.setVisibility(8);
        ((dm6) this$0.getMBinding()).E.setVisibility(0);
        if (bool.booleanValue()) {
            ((dm6) this$0.getMBinding()).D.setText(wzi.y1);
            ((dm6) this$0.getMBinding()).E.setText(wzi.k6);
        } else {
            ((dm6) this$0.getMBinding()).D.setText(wzi.d6);
            ((dm6) this$0.getMBinding()).E.setText(wzi.i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$1(PhotoSetFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((dm6) this$0.getMBinding()).C.setVisibility(0);
        ((dm6) this$0.getMBinding()).E.setVisibility(4);
        if (bool.booleanValue()) {
            ((dm6) this$0.getMBinding()).D.setText(wzi.y1);
            ((dm6) this$0.getMBinding()).E.setText(wzi.k6);
        } else {
            ((dm6) this$0.getMBinding()).D.setText(wzi.a6);
            ((dm6) this$0.getMBinding()).E.setText(wzi.i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(PhotoSetFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 0) {
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        Intrinsics.checkNotNull(num);
        ToastExtKt.toastShort(mActivity, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(PhotoSetFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(PhotoSetFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1006);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(PhotoSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((PhotoSetViewModel) this$0.getMViewModel()).connectDevice();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.M1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        ((PhotoSetViewModel) getMViewModel()).initHidState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1006) {
            ((PhotoSetViewModel) getMViewModel()).onActivityResult(resultCode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        PhotoSetViewModel photoSetViewModel = (PhotoSetViewModel) getMViewModel();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        photoSetViewModel.unregisterReceiver(mActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.j6);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(wzi.u);
            finish();
            return;
        }
        ((dm6) getMBinding()).A.show(wearableDeviceModel);
        ((PhotoSetViewModel) getMViewModel()).isPair().observe(getViewLifecycleOwner(), new Observer() { // from class: guh
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                PhotoSetFragment.onViewCreated$lambda$0(this.f19340a, (Boolean) obj);
            }
        });
        ((PhotoSetViewModel) getMViewModel()).isConnect().observe(getViewLifecycleOwner(), new Observer() { // from class: huh
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                PhotoSetFragment.onViewCreated$lambda$1(this.f20474a, (Boolean) obj);
            }
        });
        ((PhotoSetViewModel) getMViewModel()).getToast().observe(getViewLifecycleOwner(), new Observer() { // from class: iuh
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                PhotoSetFragment.onViewCreated$lambda$2(this.f22102a, (Integer) obj);
            }
        });
        ((PhotoSetViewModel) getMViewModel()).isBack().observe(getViewLifecycleOwner(), new Observer() { // from class: juh
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                PhotoSetFragment.onViewCreated$lambda$3(this.f23145a, (Boolean) obj);
            }
        });
        ((PhotoSetViewModel) getMViewModel()).isGoBluetoothEnablePage().observe(getViewLifecycleOwner(), new Observer() { // from class: kuh
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                PhotoSetFragment.onViewCreated$lambda$4(this.f24306a, (Boolean) obj);
            }
        });
        ((PhotoSetViewModel) getMViewModel()).initPresenter();
        PhotoSetViewModel photoSetViewModel = (PhotoSetViewModel) getMViewModel();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        photoSetViewModel.registerReceiver(mActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((dm6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: luh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoSetFragment.setListener$lambda$5(this.f25442a, view);
            }
        });
    }
}
