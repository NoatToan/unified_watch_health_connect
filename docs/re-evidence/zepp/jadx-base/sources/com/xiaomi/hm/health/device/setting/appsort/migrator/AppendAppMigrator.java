package com.xiaomi.hm.health.device.setting.appsort.migrator;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/migrator/AppendAppMigrator;", "Lcom/xiaomi/hm/health/device/setting/appsort/migrator/BaseAppMigrator;", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "new", "", "items", "", "addNew", "", "c", LogUtil.I, "defaultParent", "", "getTag", "()Ljava/lang/String;", "tag", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "default", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppendAppMigrator extends BaseAppMigrator {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int defaultParent;

    public /* synthetic */ AppendAppMigrator(HMDeviceSource hMDeviceSource, SortableAppItems sortableAppItems, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMDeviceSource, sortableAppItems, (i2 & 4) != 0 ? 255 : i);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.migrator.BaseAppMigrator
    public void addNew(@NotNull AppItem appItem, @NotNull List<AppItem> items) {
        if (!appItem.isEnable()) {
            items.add(appItem);
            return;
        }
        int i = 0;
        if (!(items instanceof Collection) || !items.isEmpty()) {
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                if (((AppItem) it2.next()).isEnable() && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        items.add(i, new AppItem(i == 0 ? this.defaultParent : items.get(i - 1).getParentType(), appItem.getType(), appItem.getIndex(), appItem.isEnable()));
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.migrator.BaseAppMigrator
    @NotNull
    public String getTag() {
        return "AppendAppMigrator";
    }

    public AppendAppMigrator(@NotNull HMDeviceSource hMDeviceSource, @NotNull SortableAppItems sortableAppItems, int i) {
        super(hMDeviceSource, sortableAppItems);
        this.defaultParent = i;
    }
}
