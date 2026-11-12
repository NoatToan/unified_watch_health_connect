package com.xiaomi.fitness.devicesettings.huami.appsort;

import com.xiaomi.fitness.settingitem.settingitem.AppSortItem;
import java.util.Comparator;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/AppSortItemComparator;", "Ljava/util/Comparator;", "Lcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;", "<init>", "()V", "compare", "", "o1", "o2", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AppSortItemComparator implements Comparator<AppSortItem> {
    @Override // java.util.Comparator
    public int compare(@Nullable AppSortItem o1, @Nullable AppSortItem o2) {
        int parentType;
        int parentType2;
        if (o1 == null || o2 == null) {
            return 0;
        }
        if (!o1.getEnable() && o2.getEnable()) {
            return 1;
        }
        if (o1.getEnable() && !o2.getEnable()) {
            return -1;
        }
        if (!o1.getEnable() && !o2.getEnable()) {
            parentType = o1.getIndex();
            parentType2 = o2.getIndex();
        } else {
            if (o1.getParentType() == -1 && o2.getParentType() == -1) {
                return 0;
            }
            parentType = o1.getParentType();
            parentType2 = o2.getParentType();
        }
        return parentType - parentType2;
    }
}
