package com.xiaomi.hm.health.device.setting.appsort.sub.gt2;

import android.util.SparseArray;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/sub/gt2/PragueSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "createDisplayDefault", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PragueSortFactory extends AppSortMapFactory {
    public PragueSortFactory() {
        super(HMDeviceSource.MILI_PRAGUE);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public SortableAppItems createDisplayDefault() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(33, new AppItem(255, 33, 0, true));
        sparseArray.put(25, new AppItem(255, 25, 1, true));
        sparseArray.put(2, new AppItem(255, 2, 2, true));
        sparseArray.put(3, new AppItem(255, 3, 3, true));
        sparseArray.put(20, new AppItem(255, 20, 4, true));
        sparseArray.put(35, new AppItem(255, 35, 5, true));
        sparseArray.put(28, new AppItem(255, 28, 6, true));
        sparseArray.put(51, new AppItem(255, 51, 7, true));
        sparseArray.put(36, new AppItem(255, 36, 8, true));
        sparseArray.put(29, new AppItem(255, 29, 9, true));
        sparseArray.put(4, new AppItem(255, 4, 10, true));
        sparseArray.put(11, new AppItem(255, 11, 11, true));
        sparseArray.put(9, new AppItem(255, 9, 12, true));
        sparseArray.put(38, new AppItem(255, 38, 13, true));
        sparseArray.put(39, new AppItem(255, 39, 14, true));
        sparseArray.put(16, new AppItem(255, 16, 15, true));
        sparseArray.put(40, new AppItem(255, 40, 16, true));
        sparseArray.put(19, new AppItem(255, 19, 17, true));
        return new SortAppSetting(getSource(), sparseArray);
    }
}
