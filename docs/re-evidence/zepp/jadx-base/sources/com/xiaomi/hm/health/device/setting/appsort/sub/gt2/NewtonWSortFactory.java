package com.xiaomi.hm.health.device.setting.appsort.sub.gt2;

import android.content.Context;
import android.util.SparseArray;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/sub/gt2/NewtonWSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "createColors", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "createDisplayDefault", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class NewtonWSortFactory extends AppSortMapFactory {
    public NewtonWSortFactory(@NotNull HMDeviceSource hMDeviceSource) {
        super(hMDeviceSource);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public Map<Integer, Integer> createColors(@NotNull Context context) {
        return r.emptyMap();
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public SortableAppItems createDisplayDefault() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(25, new AppItem(255, 25, 0, true));
        sparseArray.put(2, new AppItem(255, 2, 1, true));
        sparseArray.put(36, new AppItem(255, 36, 2, true));
        sparseArray.put(3, new AppItem(255, 3, 3, true));
        sparseArray.put(20, new AppItem(255, 20, 4, true));
        sparseArray.put(28, new AppItem(255, 28, 5, true));
        sparseArray.put(33, new AppItem(255, 33, 6, true));
        sparseArray.put(37, new AppItem(255, 37, 7, true));
        sparseArray.put(11, new AppItem(255, 11, 8, true));
        sparseArray.put(4, new AppItem(255, 4, 9, true));
        sparseArray.put(9, new AppItem(255, 9, 10, true));
        sparseArray.put(38, new AppItem(255, 38, 11, true));
        sparseArray.put(40, new AppItem(255, 40, 12, true));
        sparseArray.put(19, new AppItem(255, 19, 13, true));
        return new SortAppSetting(getSource(), sparseArray);
    }
}
