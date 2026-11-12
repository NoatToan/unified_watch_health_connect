package com.xiaomi.hm.health.device.setting.appsort.sub.blanc;

import android.util.SparseArray;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/sub/blanc/AndesSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "createDisplayDefault", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class AndesSortFactory extends AppSortMapFactory {
    /* JADX WARN: Multi-variable type inference failed */
    public AndesSortFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AndesSortFactory(@NotNull HMDeviceSource hMDeviceSource) {
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
        sparseArray.put(30, new AppItem(255, 30, 5, true));
        sparseArray.put(28, new AppItem(255, 28, 6, true));
        sparseArray.put(33, new AppItem(255, 33, 7, true));
        sparseArray.put(4, new AppItem(255, 4, 8, true));
        sparseArray.put(9, new AppItem(255, 9, 9, true));
        sparseArray.put(16, new AppItem(255, 16, 10, true));
        sparseArray.put(17, new AppItem(255, 17, 11, true));
        sparseArray.put(22, new AppItem(255, 22, 12, true));
        sparseArray.put(65, new AppItem(255, 65, 13, true));
        sparseArray.put(12, new AppItem(255, 12, 14, true));
        sparseArray.put(13, new AppItem(255, 13, 15, true));
        sparseArray.put(38, new AppItem(255, 38, 16, true));
        sparseArray.put(11, new AppItem(255, 11, 17, true));
        sparseArray.put(14, new AppItem(255, 14, 18, true));
        sparseArray.put(6, new AppItem(255, 6, 19, true));
        sparseArray.put(19, new AppItem(255, 19, 20, true));
        return new SortAppSetting(getSource(), sparseArray);
    }

    public /* synthetic */ AndesSortFactory(HMDeviceSource hMDeviceSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HMDeviceSource.MILI_ANDES : hMDeviceSource);
    }
}
