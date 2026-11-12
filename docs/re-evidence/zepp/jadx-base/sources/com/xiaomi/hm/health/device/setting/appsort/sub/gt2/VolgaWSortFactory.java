package com.xiaomi.hm.health.device.setting.appsort.sub.gt2;

import android.util.SparseArray;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/sub/gt2/VolgaWSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/sub/gt2/VolgaSortFactory;", "Landroid/util/SparseArray;", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "data", "", "b", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "createDisplayDefault", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class VolgaWSortFactory extends VolgaSortFactory {
    public VolgaWSortFactory() {
        super(HMDeviceSource.MILI_VOLGA_W);
    }

    private final void b(SparseArray<AppItem> data) {
        Iterator it2 = CollectionsKt__CollectionsKt.arrayListOf(35, 29, 39, 16, 41).iterator();
        while (it2.hasNext()) {
            data.remove(((Number) it2.next()).intValue());
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.sub.gt2.VolgaSortFactory, com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public SortableAppItems createDisplayDefault() {
        SparseArray<AppItem> sparseArrayApps = super.createDisplayDefault().getSparseArrayApps();
        b(sparseArrayApps);
        return new SortAppSetting(getSource(), sparseArrayApps);
    }
}
