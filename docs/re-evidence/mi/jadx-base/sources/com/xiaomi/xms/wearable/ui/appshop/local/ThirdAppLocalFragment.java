package com.xiaomi.xms.wearable.ui.appshop.local;

import android.os.Bundle;
import android.view.View;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.xms.wearable.ui.appshop.base.AppListAdapter;
import com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalFragment;
import com.xiaomi.xms.wearable.ui.appshop.model.AppListItem;
import defpackage.x1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalFragment;", "Lcom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseFragment;", "Lcom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalViewModel;", "<init>", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "isSupportLoadMore", "", "mThirdAppLocalFragmentVisibleTime", "", "onVisible", "onInvisible", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdAppLocalFragment extends Hilt_ThirdAppLocalFragment<ThirdAppLocalViewModel> {
    private long mThirdAppLocalFragmentVisibleTime;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(ThirdAppLocalFragment this$0, AppListItem appListItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppListAdapter mAdapter = this$0.getMAdapter();
        if (mAdapter != null) {
            Intrinsics.checkNotNull(appListItem);
            mAdapter.notifyItemInstall(appListItem);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ThirdAppLocalFragment this$0, AppListItem appListItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppListAdapter mAdapter = this$0.getMAdapter();
        if (mAdapter != null) {
            Intrinsics.checkNotNull(appListItem);
            mAdapter.notifyItemUninstall(appListItem);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseFragment
    public boolean isSupportLoadMore() {
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mThirdAppLocalFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "my_application_detail_page", "title", getString(x1j.m), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mThirdAppLocalFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((ThirdAppLocalViewModel) getMViewModel()).getInstallSuccessLiveData().observe(getViewLifecycleOwner(), new ThirdAppLocalFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rap
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdAppLocalFragment.onViewCreated$lambda$0(this.f32360a, (AppListItem) obj);
            }
        }));
        ((ThirdAppLocalViewModel) getMViewModel()).getUninstallSuccessLiveData().observe(getViewLifecycleOwner(), new ThirdAppLocalFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sap
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdAppLocalFragment.onViewCreated$lambda$1(this.f33466a, (AppListItem) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mThirdAppLocalFragmentVisibleTime = System.currentTimeMillis();
    }
}
