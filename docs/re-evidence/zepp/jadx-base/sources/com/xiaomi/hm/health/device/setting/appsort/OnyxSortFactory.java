package com.xiaomi.hm.health.device.setting.appsort;

import android.util.SparseArray;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/OnyxSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "createDisplayDefault", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OnyxSortFactory extends AppSortMapFactory {
    public static final int APP_COUNT = 14;

    public OnyxSortFactory() {
        super(HMDeviceSource.MILI_ONYX);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public SortableAppItems createDisplayDefault() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(25, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 25, 0, true));
        sparseArray.put(2, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 2, 1, true));
        sparseArray.put(36, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 36, 2, true));
        sparseArray.put(3, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 3, 3, true));
        sparseArray.put(20, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 20, 4, true));
        sparseArray.put(28, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 28, 5, true));
        sparseArray.put(33, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 33, 6, true));
        sparseArray.put(4, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 4, 7, true));
        sparseArray.put(11, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 11, 8, true));
        sparseArray.put(9, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 9, 9, true));
        sparseArray.put(38, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 38, 10, true));
        sparseArray.put(16, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 16, 11, true));
        sparseArray.put(40, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 40, 12, true));
        sparseArray.put(19, new com.xiaomi.hm.health.bt.model.appsort.AppItem(255, 19, 13, true));
        return new SortAppSetting(getSource(), sparseArray);
    }
}
