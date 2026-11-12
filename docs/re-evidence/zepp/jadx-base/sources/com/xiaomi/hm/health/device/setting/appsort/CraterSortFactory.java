package com.xiaomi.hm.health.device.setting.appsort;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.appsort.merge.AppMergeKt;
import com.xiaomi.hm.health.device.setting.appsort.merge.AppValidKt;
import com.xiaomi.hm.health.device.setting.appsort.migrator.AppMergeMigrator;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\b\u001a\u00020\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0002R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u00020\u000f8T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00038T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/CraterSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "", "default", "Lcom/xiaomi/hm/health/device/setting/appsort/merge/AppGroup;", "groups", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge$Rule;", "b", "", "g", "Ljava/lang/Integer;", "getDefaultVersion", "()Ljava/lang/Integer;", "defaultVersion", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", "h", "Lkotlin/Lazy;", "getMigrator", "()Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", "migrator", "Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", "i", "getDefaultItems", "()Ljava/util/List;", "defaultItems", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", z.j, "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CraterSortFactory extends AppSortMapFactory {

    @Deprecated
    public static final int VERSION = 1;

    @NotNull
    private static final a j = new a(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final Integer defaultVersion;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy migrator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultItems;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_CRATER_W.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_CRATER_WL.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/setting/appsort/CraterSortFactory$a", "", "", "VERSION", LogUtil.I, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<PageItem>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<PageItem> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new PageItem(255, 33, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 25, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 2, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 35, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 3, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 20, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 36, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 28, false, Integer.valueOf(R.string.app_sort_pressure_for_venice), null, null, 52, null));
            arrayList.add(new PageItem(255, 51, false, Integer.valueOf(R.string.app_sort_breath_train), null, null, 52, null));
            arrayList.add(new PageItem(255, 29, false, Integer.valueOf(R.string.setting_app_women_health), null, null, 52, null));
            arrayList.add(new PageItem(255, 62, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 9, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 19, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 7, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 4, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 11, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 13, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 12, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 26, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 10, false, Integer.valueOf(R.string.app_sort_camera_control), null, null, 52, null));
            arrayList.add(new PageItem(7, 14, false, null, null, null, 60, null));
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Constants.JSON_FEATURE, "Lkotlin/Function0;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Integer, Function0<? extends Boolean>> {
        public final /* synthetic */ List<com.xiaomi.hm.health.bt.model.appsort.AppItem> a;
        public final /* synthetic */ com.xiaomi.hm.health.bt.model.appsort.AppItem b;
        public final /* synthetic */ CraterSortFactory c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends com.xiaomi.hm.health.bt.model.appsort.AppItem> list, com.xiaomi.hm.health.bt.model.appsort.AppItem appItem, CraterSortFactory craterSortFactory) {
            super(1);
            this.a = list;
            this.b = appItem;
            this.c = craterSortFactory;
        }

        @NotNull
        public final Function0<Boolean> a(int i) {
            return AppValidKt.allValid(AppValidKt.defaultValid(this.a, this.b), AppValidKt.deviceFeatureValid$default(i, this.c.getSource(), 0, 4, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Function0<? extends Boolean> invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/migrator/AppMergeMigrator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<AppMergeMigrator> {
        public final /* synthetic */ HMDeviceSource b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMDeviceSource hMDeviceSource) {
            super(0);
            this.b = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppMergeMigrator invoke() {
            List<PageItem> defaultItems = CraterSortFactory.this.getDefaultItems();
            CraterSortFactory craterSortFactory = CraterSortFactory.this;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(defaultItems, 10));
            for (PageItem pageItem : defaultItems) {
                arrayList.add(new com.xiaomi.hm.health.bt.model.appsort.AppItem(pageItem.getParent(), pageItem.getType(), craterSortFactory.getDefaultItems().indexOf(pageItem), pageItem.getEnable()));
            }
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup[]{new com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup(255, 16), new com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup(7, 16)});
            CraterSortFactory craterSortFactory2 = CraterSortFactory.this;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(craterSortFactory2.b((com.xiaomi.hm.health.bt.model.appsort.AppItem) it2.next(), arrayList, listListOf));
            }
            return new AppMergeMigrator(this.b, arrayList2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CraterSortFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CraterSortFactory(HMDeviceSource hMDeviceSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HMDeviceSource.MILI_COMO : hMDeviceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppItemMerge.Rule b(com.xiaomi.hm.health.bt.model.appsort.AppItem appItem, List<? extends com.xiaomi.hm.health.bt.model.appsort.AppItem> list, List<com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup> list2) {
        return appItem.getType() == 62 ? new AppItemMerge.Rule(appItem, new c(list, appItem, this).invoke(39), new AppMergeKt.AnonymousClass1(AppMergeKt.getAppendItem(appItem, list2))) : new AppItemMerge.Rule(appItem, AppValidKt.defaultValid(list, appItem), new AppMergeKt.AnonymousClass1(AppMergeKt.getAppendItem(appItem, list2)));
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public List<PageItem> getDefaultItems() {
        return (List) this.defaultItems.getValue();
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @Nullable
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public AppItemMigrator getMigrator() {
        return (AppItemMigrator) this.migrator.getValue();
    }

    public CraterSortFactory(@NotNull HMDeviceSource hMDeviceSource) {
        int defaultVersion;
        super(hMDeviceSource);
        int i = WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()];
        if (i != 1 && i != 2) {
            defaultVersion = super.getDefaultVersion();
        } else {
            defaultVersion = 1;
        }
        this.defaultVersion = defaultVersion;
        this.migrator = LazyKt__LazyJVMKt.lazy(new d(hMDeviceSource));
        this.defaultItems = LazyKt__LazyJVMKt.lazy(b.a);
    }
}
