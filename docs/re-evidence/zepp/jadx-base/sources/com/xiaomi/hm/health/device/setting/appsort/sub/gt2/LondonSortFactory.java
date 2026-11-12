package com.xiaomi.hm.health.device.setting.appsort.sub.gt2;

import android.util.SparseArray;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/sub/gt2/LondonSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "Lorg/json/JSONObject;", "propertyJson", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "createDisplaySettingFromJson", "createDisplayDefault", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class LondonSortFactory extends AppSortMapFactory {
    public LondonSortFactory() {
        super(HMDeviceSource.MILI_LONDON);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public SortableAppItems createDisplayDefault() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(3, new AppItem(255, 3, 0, true));
        sparseArray.put(33, new AppItem(255, 33, 1, true));
        sparseArray.put(2, new AppItem(255, 2, 2, true));
        sparseArray.put(36, new AppItem(255, 36, 3, true));
        sparseArray.put(28, new AppItem(255, 28, 4, true));
        sparseArray.put(4, new AppItem(255, 4, 5, true));
        sparseArray.put(21, new AppItem(255, 21, 6, true));
        sparseArray.put(16, new AppItem(255, 16, 7, true));
        sparseArray.put(9, new AppItem(255, 9, 8, true));
        sparseArray.put(19, new AppItem(255, 19, 9, true));
        sparseArray.put(7, new AppItem(255, 7, 10, true));
        return new SortAppSetting(getSource(), sparseArray);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public SortableAppItems createDisplaySettingFromJson(@NotNull JSONObject propertyJson) {
        return GlobalConfig.get().isBuildInner() ? createDisplayDefault() : super.createDisplaySettingFromJson(propertyJson);
    }
}
