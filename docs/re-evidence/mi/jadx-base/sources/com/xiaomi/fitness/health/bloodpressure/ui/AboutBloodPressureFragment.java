package com.xiaomi.fitness.health.bloodpressure.ui;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.homepage.HealthViewModel;
import defpackage.c0j;
import defpackage.jui;
import defpackage.k0c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/ui/AboutBloodPressureFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/homepage/HealthViewModel;", "Lk0c;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AboutBloodPressureFragment extends BaseBindingFragment<HealthViewModel, k0c> {

    @NotNull
    public static final String N60E_MODEL = "mijia.watch.n60e";

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.W4;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Product product;
        Product product2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.ja);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Product.AboutModule bloodPressureModule = null;
        if (((wearableDeviceModel == null || (product2 = wearableDeviceModel.getProduct()) == null) ? null : product2.getBloodPressureModule()) != null) {
            Product.AboutModule bloodPressureModule2 = wearableDeviceModel.getProduct().getBloodPressureModule();
            getMBinding().L.setRemindText(bloodPressureModule2 != null ? bloodPressureModule2.getModel() : null);
            getMBinding().G.setRemindText(bloodPressureModule2 != null ? bloodPressureModule2.getCertificateNumber() : null);
            getMBinding().I.setRemindText(bloodPressureModule2 != null ? bloodPressureModule2.getTechnicalNumber() : null);
            getMBinding().J.setRemindText(bloodPressureModule2 != null ? bloodPressureModule2.getFullVersion() : null);
        }
        if (Intrinsics.areEqual(wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null, N60E_MODEL)) {
            getMBinding().K.setRemindText(c0j.Oa);
        } else {
            getMBinding().K.setRemindText(c0j.Ka);
        }
        String model = wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null;
        if (wearableDeviceModel != null && (product = wearableDeviceModel.getProduct()) != null) {
            bloodPressureModule = product.getBloodPressureModule();
        }
        Logger.i("AboutBloodPressureFragment", "deviceModel.model " + model + "  aboutModule " + bloodPressureModule);
    }
}
