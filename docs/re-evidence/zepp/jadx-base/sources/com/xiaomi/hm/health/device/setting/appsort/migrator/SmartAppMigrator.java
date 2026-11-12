package com.xiaomi.hm.health.device.setting.appsort.migrator;

import android.util.SparseIntArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0014R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/migrator/SmartAppMigrator;", "Lcom/xiaomi/hm/health/device/setting/appsort/migrator/BaseAppMigrator;", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "new", "", "items", "", "a", "addNew", "", "Lcom/xiaomi/hm/health/device/setting/appsort/migrator/SmartAppMigrator$Parent;", "c", "Ljava/util/List;", "parentList", "", "getTag", "()Ljava/lang/String;", "tag", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "default", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;Ljava/util/List;)V", "Parent", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartAppMigrator extends BaseAppMigrator {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Parent> parentList;

    public SmartAppMigrator(@NotNull HMDeviceSource hMDeviceSource, @NotNull SortableAppItems sortableAppItems, @NotNull List<Parent> list) {
        super(hMDeviceSource, sortableAppItems);
        this.parentList = list;
    }

    private final void a(AppItem appItem, List<AppItem> items) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (AppItem appItem2 : items) {
            sparseIntArray.put(appItem2.getParentType(), sparseIntArray.get(appItem2.getParentType(), 0) + 1);
        }
        for (Parent parent : this.parentList) {
            int i = sparseIntArray.get(parent.getType(), 0);
            if (parent.getMaxCount() < 0 || i < parent.getMaxCount()) {
                Iterator<AppItem> it2 = items.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    if (it2.next().getParentType() == parent.getType()) {
                        items.add(i2, new AppItem(parent.getType(), appItem.getType(), appItem.getIndex(), appItem.isEnable()));
                        return;
                    }
                    i2++;
                }
                i2 = -1;
                items.add(i2, new AppItem(parent.getType(), appItem.getType(), appItem.getIndex(), appItem.isEnable()));
                return;
            }
        }
        items.add(new AppItem(appItem.getType(), appItem.getType(), appItem.getIndex(), false));
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.migrator.BaseAppMigrator
    public void addNew(@NotNull AppItem appItem, @NotNull List<AppItem> items) {
        Object next;
        if (!appItem.isEnable()) {
            items.add(appItem);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int appCount = getDefault().getAppCount();
        int index = -1;
        int i = 0;
        if (appCount > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                AppItem appItem2 = getDefault().getAppItem(i2);
                arrayList.add(appItem2);
                if (appItem2.getType() == appItem.getType()) {
                    index = appItem2.getIndex();
                }
                if (i3 >= appCount) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.device.setting.appsort.migrator.SmartAppMigrator$addNew$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((AppItem) t).getIndex()), Integer.valueOf(((AppItem) t2).getIndex()));
                }
            });
        }
        if (index <= 0) {
            a(appItem, items);
            return;
        }
        AppItem appItem3 = (AppItem) arrayList.get(index - 1);
        Iterator<T> it2 = items.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((AppItem) next).getType() == appItem3.getType()));
        AppItem appItem4 = (AppItem) next;
        if (appItem4 == null || !appItem4.isEnable()) {
            a(appItem, items);
            return;
        }
        if (!(items instanceof Collection) || !items.isEmpty()) {
            Iterator<T> it3 = items.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                if ((((AppItem) it3.next()).getParentType() == appItem4.getParentType()) && (i4 = i4 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
            i = i4;
        }
        for (Parent parent : this.parentList) {
            if (parent.getType() == appItem4.getParentType() && (parent.getMaxCount() < 0 || i < parent.getMaxCount())) {
                items.add(items.indexOf(appItem4) + 1, new AppItem(parent.getType(), appItem.getType(), appItem.getIndex(), appItem.isEnable()));
                return;
            }
        }
        a(appItem, items);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.migrator.BaseAppMigrator
    @NotNull
    public String getTag() {
        return "SmartAppMigrator";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/migrator/SmartAppMigrator$Parent;", "", "", "component1", "component2", "type", "maxCount", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "b", "getMaxCount", "<init>", "(II)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Parent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int maxCount;

        public Parent(int i, int i2) {
            this.type = i;
            this.maxCount = i2;
        }

        public static /* synthetic */ Parent copy$default(Parent parent, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = parent.type;
            }
            if ((i3 & 2) != 0) {
                i2 = parent.maxCount;
            }
            return parent.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMaxCount() {
            return this.maxCount;
        }

        @NotNull
        public final Parent copy(int type, int maxCount) {
            return new Parent(type, maxCount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parent)) {
                return false;
            }
            Parent parent = (Parent) other;
            return this.type == parent.type && this.maxCount == parent.maxCount;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type * 31) + this.maxCount;
        }

        @NotNull
        public String toString() {
            return "Parent(type=" + this.type + ", maxCount=" + this.maxCount + ")";
        }

        public /* synthetic */ Parent(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? -1 : i2);
        }
    }
}
