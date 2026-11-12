package com.xiaomi.hm.health.device.setting.appsort.migrator;

import android.util.SparseArray;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.setting.appsort.AppItemMigrator;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H$R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u00020\u00028\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/migrator/BaseAppMigrator;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "data", "migrate", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "new", "", "items", "", "addNew", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "b", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "getDefault", "()Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "default", "", "getTag", "()Ljava/lang/String;", "tag", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class BaseAppMigrator implements AppItemMigrator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SortableAppItems default;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SortableAppItems b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SortableAppItems sortableAppItems) {
            super(0);
            this.b = sortableAppItems;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data(" + BaseAppMigrator.this.source + "): " + this.b.getSparseArrayApps();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Skip migration!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<AppItem> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SparseArray<AppItem> sparseArray) {
            super(0);
            this.b = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "result(" + BaseAppMigrator.this.source + "): " + this.b;
        }
    }

    public BaseAppMigrator(@NotNull HMDeviceSource hMDeviceSource, @NotNull SortableAppItems sortableAppItems) {
        this.source = hMDeviceSource;
        this.default = sortableAppItems;
    }

    public abstract void addNew(@NotNull AppItem appItem, @NotNull List<AppItem> items);

    @NotNull
    public final SortableAppItems getDefault() {
        return this.default;
    }

    @NotNull
    public abstract String getTag();

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppItemMigrator
    @NotNull
    public SortableAppItems migrate(@NotNull SortableAppItems data) {
        boolean z;
        int appCount = data.getAppCount();
        HMLog.info(getTag(), new a(data));
        List<AppItem> arrayList = new ArrayList<>();
        int i = 0;
        if (appCount > 0) {
            int i2 = 0;
            z = false;
            while (true) {
                int i3 = i2 + 1;
                AppItem appItem = data.getAppItem(i2);
                if (this.default.getAppItemByType(appItem.getType()) != null) {
                    arrayList.add(appItem);
                } else {
                    z = true;
                }
                if (i3 >= appCount) {
                    break;
                }
                i2 = i3;
            }
        } else {
            z = false;
        }
        int appCount2 = this.default.getAppCount();
        ArrayList arrayList2 = new ArrayList();
        if (appCount2 > 0) {
            while (true) {
                int i4 = i + 1;
                AppItem appItem2 = this.default.getAppItem(i);
                if (data.getAppItemByType(appItem2.getType()) == null) {
                    arrayList2.add(appItem2);
                    z = true;
                }
                if (i4 >= appCount2) {
                    break;
                }
                i = i4;
            }
        }
        if (!z) {
            HMLog.info(getTag(), b.a);
            return data;
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.device.setting.appsort.migrator.BaseAppMigrator$migrate$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((AppItem) t).getIndex()), Integer.valueOf(((AppItem) t2).getIndex()));
                }
            });
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            addNew((AppItem) it2.next(), arrayList);
        }
        SparseArray sparseArray = new SparseArray();
        for (AppItem appItem3 : arrayList) {
            appItem3.setIndex(arrayList.indexOf(appItem3));
            sparseArray.put(appItem3.getType(), appItem3);
        }
        HMLog.info(getTag(), new c(sparseArray));
        return new SortAppSetting(this.source, sparseArray);
    }
}
