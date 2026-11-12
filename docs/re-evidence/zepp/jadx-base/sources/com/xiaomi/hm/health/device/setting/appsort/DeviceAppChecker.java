package com.xiaomi.hm.health.device.setting.appsort;

import android.util.SparseArray;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.g;
import kotlin.collections.r;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/DeviceAppChecker;", "", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "origin", "checkFeature", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceAppChecker {

    @NotNull
    public static final DeviceAppChecker INSTANCE = new DeviceAppChecker();

    private DeviceAppChecker() {
    }

    @JvmStatic
    @NotNull
    public static final SortableAppItems checkFeature(@NotNull Feature feature, @NotNull SortableAppItems origin) {
        boolean z = false;
        Map mapMapOf = r.mapOf(TuplesKt.to(62, 39), TuplesKt.to(57, 16));
        ArrayList<com.xiaomi.hm.health.bt.model.appsort.AppItem> arrayList = new ArrayList();
        int appCount = origin.getAppCount();
        if (appCount > 0) {
            int i = 0;
            boolean z2 = false;
            while (true) {
                int i2 = i + 1;
                com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = origin.getAppItem(i);
                Integer num = (Integer) mapMapOf.get(Integer.valueOf(appItem.getType()));
                if ((num == null || feature.hasSw(num.intValue())) ? false : true) {
                    z2 = true;
                } else {
                    arrayList.add(appItem);
                }
                if (i2 >= appCount) {
                    break;
                }
                i = i2;
            }
            z = z2;
        }
        if (!z) {
            return origin;
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.device.setting.appsort.DeviceAppChecker$checkFeature$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((com.xiaomi.hm.health.bt.model.appsort.AppItem) t).getIndex()), Integer.valueOf(((com.xiaomi.hm.health.bt.model.appsort.AppItem) t2).getIndex()));
                }
            });
        }
        SparseArray sparseArray = new SparseArray();
        for (com.xiaomi.hm.health.bt.model.appsort.AppItem appItem2 : arrayList) {
            appItem2.setIndex(arrayList.indexOf(appItem2));
            sparseArray.put(appItem2.getType(), appItem2);
        }
        return new SortAppSetting(origin.getSource(), sparseArray);
    }
}
