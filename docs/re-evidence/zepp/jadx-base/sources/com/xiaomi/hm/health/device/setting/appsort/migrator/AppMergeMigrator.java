package com.xiaomi.hm.health.device.setting.appsort.migrator;

import android.util.SparseArray;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.setting.appsort.AppItemMerge;
import com.xiaomi.hm.health.device.setting.appsort.AppItemMigrator;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\r\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/migrator/AppMergeMigrator;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "data", "migrate", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge;", "b", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge;", "merge", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge;)V", "", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge$Rule;", "rules", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppMergeMigrator implements AppItemMigrator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AppItemMerge merge;

    public AppMergeMigrator(@NotNull HMDeviceSource hMDeviceSource, @NotNull AppItemMerge appItemMerge) {
        this.source = hMDeviceSource;
        this.merge = appItemMerge;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppItemMigrator
    @NotNull
    public SortableAppItems migrate(@NotNull SortableAppItems data) {
        ArrayList<AppItem> arrayList = new ArrayList();
        int appCount = data.getAppCount();
        for (int i = 0; i < appCount; i++) {
            arrayList.add(data.getAppItem(i));
        }
        this.merge.mergeTo(arrayList);
        SparseArray sparseArray = new SparseArray();
        for (AppItem appItem : arrayList) {
            sparseArray.put(appItem.getType(), appItem);
        }
        return new SortAppSetting(this.source, sparseArray);
    }

    public AppMergeMigrator(@NotNull HMDeviceSource hMDeviceSource, @NotNull List<AppItemMerge.Rule> list) {
        this(hMDeviceSource, new AppItemMerge(list));
    }
}
