package defpackage;

import com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindViewModel;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;

/* JADX INFO: loaded from: classes8.dex */
public final class hk2<VM extends BindViewModel> {
    public static <VM extends BindViewModel> void a(BindDeviceActivity<VM> bindDeviceActivity, ProductManagerInternal productManagerInternal) {
        bindDeviceActivity.mProductManager = productManagerInternal;
    }
}
