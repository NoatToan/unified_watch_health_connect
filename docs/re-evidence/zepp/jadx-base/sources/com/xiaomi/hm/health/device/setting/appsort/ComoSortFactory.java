package com.xiaomi.hm.health.device.setting.appsort;

import com.amap.api.mapcore.util.hl;
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
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001%B%\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J(\u0010\b\u001a\u00020\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00038T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/ComoSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "", "default", "Lcom/xiaomi/hm/health/device/setting/appsort/merge/AppGroup;", "groups", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge$Rule;", "b", "", "g", "Z", "isAbroad", "h", "isPro", "", "i", "Ljava/lang/Integer;", "getDefaultVersion", "()Ljava/lang/Integer;", "defaultVersion", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", z.j, "Lkotlin/Lazy;", "getMigrator", "()Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", "migrator", "Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", hl.k, "getDefaultItems", "()Ljava/util/List;", "defaultItems", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;ZZ)V", "l", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class ComoSortFactory extends AppSortMapFactory {

    @Deprecated
    public static final int VERSION = 1;

    @NotNull
    private static final a l = new a(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isAbroad;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isPro;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final Integer defaultVersion;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy migrator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultItems;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/setting/appsort/ComoSortFactory$a", "", "", "VERSION", LogUtil.I, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<PageItem>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<PageItem> invoke() {
            ArrayList arrayList = new ArrayList();
            ComoSortFactory comoSortFactory = ComoSortFactory.this;
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
            if (!comoSortFactory.isAbroad) {
                arrayList.add(new PageItem(255, 17, false, null, null, null, 60, null));
                arrayList.add(new PageItem(255, 49, false, null, null, null, 60, null));
            }
            arrayList.add(new PageItem(255, 19, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 7, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 4, false, null, null, null, 60, null));
            if (comoSortFactory.isPro && !comoSortFactory.isAbroad) {
                arrayList.add(new PageItem(7, 63, false, null, null, null, 60, null));
            } else if (comoSortFactory.isPro && comoSortFactory.isAbroad) {
                arrayList.add(new PageItem(7, 57, false, null, null, null, 60, null));
            }
            if (!comoSortFactory.isAbroad) {
                arrayList.add(new PageItem(7, 16, false, null, null, null, 60, null));
            }
            arrayList.add(new PageItem(7, 11, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 13, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 12, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 56, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 26, false, null, null, null, 60, null));
            if (comoSortFactory.isPro) {
                arrayList.add(new PageItem(7, 22, false, null, null, null, 60, null));
            }
            arrayList.add(new PageItem(7, 10, false, Integer.valueOf(R.string.app_sort_camera_control), null, null, 52, null));
            arrayList.add(new PageItem(7, 14, false, null, null, null, 60, null));
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Constants.JSON_FEATURE, "Lkotlin/Function0;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Integer, Function0<? extends Boolean>> {
        public final /* synthetic */ List<com.xiaomi.hm.health.bt.model.appsort.AppItem> a;
        public final /* synthetic */ com.xiaomi.hm.health.bt.model.appsort.AppItem b;
        public final /* synthetic */ ComoSortFactory c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends com.xiaomi.hm.health.bt.model.appsort.AppItem> list, com.xiaomi.hm.health.bt.model.appsort.AppItem appItem, ComoSortFactory comoSortFactory) {
            super(1);
            this.a = list;
            this.b = appItem;
            this.c = comoSortFactory;
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
            List<PageItem> defaultItems = ComoSortFactory.this.getDefaultItems();
            ComoSortFactory comoSortFactory = ComoSortFactory.this;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(defaultItems, 10));
            for (PageItem pageItem : defaultItems) {
                arrayList.add(new com.xiaomi.hm.health.bt.model.appsort.AppItem(pageItem.getParent(), pageItem.getType(), comoSortFactory.getDefaultItems().indexOf(pageItem), pageItem.getEnable()));
            }
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup[]{new com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup(255, 16), new com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup(7, 16)});
            ComoSortFactory comoSortFactory2 = ComoSortFactory.this;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(comoSortFactory2.b((com.xiaomi.hm.health.bt.model.appsort.AppItem) it2.next(), arrayList, listListOf));
            }
            return new AppMergeMigrator(this.b, arrayList2);
        }
    }

    public ComoSortFactory() {
        this(null, false, false, 7, null);
    }

    public /* synthetic */ ComoSortFactory(HMDeviceSource hMDeviceSource, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HMDeviceSource.MILI_COMO : hMDeviceSource, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppItemMerge.Rule b(com.xiaomi.hm.health.bt.model.appsort.AppItem appItem, List<? extends com.xiaomi.hm.health.bt.model.appsort.AppItem> list, List<com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup> list2) {
        AppItemMerge.Rule rule;
        c cVar = new c(list, appItem, this);
        int type = appItem.getType();
        if (type != 49) {
            if (type == 57) {
                rule = new AppItemMerge.Rule(appItem, cVar.invoke(16), new AppMergeKt.AnonymousClass1(AppMergeKt.getAppendItem(appItem, list2)));
            } else {
                if (type != 62) {
                    return new AppItemMerge.Rule(appItem, AppValidKt.defaultValid(list, appItem), new AppMergeKt.AnonymousClass1(AppMergeKt.getAppendItem(appItem, list2)));
                }
                rule = new AppItemMerge.Rule(appItem, cVar.invoke(39), new AppMergeKt.AnonymousClass1(AppMergeKt.getAppendItem(appItem, list2)));
            }
            return rule;
        }
        Function0<? extends Boolean> function0Invoke = cVar.invoke(45);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (com.xiaomi.hm.health.device.setting.appsort.merge.AppGroup appGroup : list2) {
            arrayList.add(TuplesKt.to(Integer.valueOf(appGroup.getGroup()), Integer.valueOf(appGroup.getMax())));
        }
        return new AppItemMerge.Rule(appItem, function0Invoke, AppMergeKt.mergeWxPay$default(r.toMap(arrayList), 0, 0, 6, null));
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

    public ComoSortFactory(@NotNull HMDeviceSource hMDeviceSource, boolean z, boolean z2) {
        int defaultVersion;
        super(hMDeviceSource);
        this.isAbroad = z;
        this.isPro = z2;
        int i = WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            defaultVersion = super.getDefaultVersion();
        } else {
            defaultVersion = 1;
        }
        this.defaultVersion = defaultVersion;
        this.migrator = LazyKt__LazyJVMKt.lazy(new d(hMDeviceSource));
        this.defaultItems = LazyKt__LazyJVMKt.lazy(new b());
    }
}
