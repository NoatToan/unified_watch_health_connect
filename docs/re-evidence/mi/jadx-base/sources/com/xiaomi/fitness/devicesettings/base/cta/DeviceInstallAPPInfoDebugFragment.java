package com.xiaomi.fitness.devicesettings.base.cta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.eui;
import defpackage.ie6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoDebugFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoDebugViewModel;", "Lie6;", "", "bindView", "(Lie6;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoAdapter;", "mDeviceInstallAPPInfoAdapter", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoAdapter;", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceInstallAPPInfoDebugFragment extends Hilt_DeviceInstallAPPInfoDebugFragment<DeviceInstallAPPInfoDebugViewModel, ie6> {

    @NotNull
    public static final String TAG = "CTA_APP";
    private DeviceInstallAPPInfoAdapter mDeviceInstallAPPInfoAdapter;

    public DeviceInstallAPPInfoDebugFragment() {
        super(eui.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(DeviceInstallAPPInfoDebugFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list2);
        DeviceInstallAPPInfoAdapter deviceInstallAPPInfoAdapter = this$0.mDeviceInstallAPPInfoAdapter;
        if (deviceInstallAPPInfoAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInstallAPPInfoAdapter");
            deviceInstallAPPInfoAdapter = null;
        }
        deviceInstallAPPInfoAdapter.submitList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$1(DeviceInstallAPPInfoDebugFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, true, 3, null);
        ((DeviceInstallAPPInfoDebugViewModel) this$0.getMViewModel()).getCTAAppList();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ie6 ie6Var) {
        Intrinsics.checkNotNullParameter(ie6Var, "<this>");
        setTitle("应用列表");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.mDeviceInstallAPPInfoAdapter = new DeviceInstallAPPInfoAdapter();
        RecyclerView recyclerView = ((ie6) getMBinding()).A;
        DeviceInstallAPPInfoAdapter deviceInstallAPPInfoAdapter = this.mDeviceInstallAPPInfoAdapter;
        if (deviceInstallAPPInfoAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInstallAPPInfoAdapter");
            deviceInstallAPPInfoAdapter = null;
        }
        recyclerView.setAdapter(deviceInstallAPPInfoAdapter);
        ((DeviceInstallAPPInfoDebugViewModel) getMViewModel()).getDeviceCTAAppList().observe(getViewLifecycleOwner(), new Observer() { // from class: w66
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceInstallAPPInfoDebugFragment.onViewCreated$lambda$0(this.f37652a, (List) obj);
            }
        });
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((DeviceInstallAPPInfoDebugViewModel) getMViewModel()).getCTAAppList();
        ViewExtKt.clickWithTrigger$default(((ie6) getMBinding()).B, 0L, new Function1() { // from class: x66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceInstallAPPInfoDebugFragment.onViewCreated$lambda$1(this.f38743a, (Button) obj);
            }
        }, 1, null);
    }
}
