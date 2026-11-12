package com.xiaomi.xms.wearable.ui.appshop.market;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.x1j;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/market/ThirdAppMarketListFragment;", "Lcom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseFragment;", "Lcom/xiaomi/xms/wearable/ui/appshop/market/ThirdAppMarketListViewModel;", "<init>", "()V", "isSupportLoadMore", "", "mThirdAppMarketListFragmentVisibleTime", "", "onVisible", "", "onInvisible", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdAppMarketListFragment extends Hilt_ThirdAppMarketListFragment<ThirdAppMarketListViewModel> {
    private long mThirdAppMarketListFragmentVisibleTime;

    @Override // com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseFragment
    public boolean isSupportLoadMore() {
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mThirdAppMarketListFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "application_market_detail_page", "title", getString(x1j.n), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mThirdAppMarketListFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mThirdAppMarketListFragmentVisibleTime = System.currentTimeMillis();
    }
}
