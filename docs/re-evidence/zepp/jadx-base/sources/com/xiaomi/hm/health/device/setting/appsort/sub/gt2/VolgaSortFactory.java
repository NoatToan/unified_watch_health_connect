package com.xiaomi.hm.health.device.setting.appsort.sub.gt2;

import android.util.SparseArray;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/sub/gt2/VolgaSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "Lorg/json/JSONObject;", "propertyJson", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "createDisplaySettingFromJson", "createDisplayDefault", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mSource", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class VolgaSortFactory extends AppSortMapFactory {
    /* JADX WARN: Multi-variable type inference failed */
    public VolgaSortFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public VolgaSortFactory(@NotNull HMDeviceSource hMDeviceSource) {
        super(hMDeviceSource);
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
        sparseArray.put(60, new AppItem(255, 60, 8, true));
        sparseArray.put(11, new AppItem(255, 11, 9, true));
        sparseArray.put(41, new AppItem(255, 41, 10, true));
        sparseArray.put(4, new AppItem(255, 4, 11, true));
        sparseArray.put(9, new AppItem(255, 9, 12, true));
        sparseArray.put(38, new AppItem(255, 38, 13, true));
        sparseArray.put(16, new AppItem(255, 16, 14, true));
        sparseArray.put(40, new AppItem(255, 40, 15, true));
        sparseArray.put(19, new AppItem(255, 19, 16, true));
        return new SortAppSetting(getSource(), sparseArray);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public SortableAppItems createDisplaySettingFromJson(@NotNull JSONObject propertyJson) {
        return GlobalConfig.get().isBuildInner() ? createDisplayDefault() : super.createDisplaySettingFromJson(propertyJson);
    }

    public /* synthetic */ VolgaSortFactory(HMDeviceSource hMDeviceSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HMDeviceSource.MILI_VOLGA : hMDeviceSource);
    }
}
