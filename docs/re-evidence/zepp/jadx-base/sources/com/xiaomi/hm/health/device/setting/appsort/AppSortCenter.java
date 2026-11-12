package com.xiaomi.hm.health.device.setting.appsort;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.appsort.sub.blanc.AndesSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.blanc.AndesWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.blanc.BlancSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.blanc.BlancWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.blanc.ViennaWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.BonnSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.BonnWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.HamburgSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.HamburgWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.LincsSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.LincsWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.LisbonSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.LisbonWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.LondonSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.LondonWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.NewtonSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.NewtonWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.OspreySortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.OspreyWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.PragueSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.PragueWSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.VolgaSortFactory;
import com.xiaomi.hm.health.device.setting.appsort.sub.gt2.VolgaWSortFactory;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007R2\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000bj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortCenter;", "", "", "a", "", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "loadSortFactories", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "getSortFactory", "mapByDeviceSource", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sortFactories", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppSortCenter {

    @NotNull
    public static final AppSortCenter INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<HMDeviceSource, AppSortMapFactory> sortFactories;

    static {
        AppSortCenter appSortCenter = new AppSortCenter();
        INSTANCE = appSortCenter;
        sortFactories = new HashMap<>();
        appSortCenter.a();
    }

    private AppSortCenter() {
    }

    private final void a() {
        HashMap<HMDeviceSource, AppSortMapFactory> map = sortFactories;
        map.put(HMDeviceSource.MILI_ONYX, new OnyxSortFactory());
        map.put(HMDeviceSource.MILI_ONYX_W, new OnyxWSortFactory());
        map.put(HMDeviceSource.MILI_CORSICA, new CorsicaSortFactory());
        map.put(HMDeviceSource.MILI_CORSICA_W, new CorsicaWSortFactory());
        map.put(HMDeviceSource.MILI_LISBON, new LisbonSortFactory());
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_LISBON_W;
        map.put(hMDeviceSource, new LisbonWSortFactory(hMDeviceSource));
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_LISBON_WL;
        map.put(hMDeviceSource2, new LisbonWSortFactory(hMDeviceSource2));
        map.put(HMDeviceSource.MILI_OSPREY, new OspreySortFactory());
        map.put(HMDeviceSource.MILI_OSPREY_C, new OspreySortFactory());
        map.put(HMDeviceSource.MILI_OSPREY_W, new OspreyWSortFactory());
        map.put(HMDeviceSource.MILI_LINCS, new LincsSortFactory());
        map.put(HMDeviceSource.MILI_LINCS_W, new LincsWSortFactory());
        map.put(HMDeviceSource.MILI_NEWTON, new NewtonSortFactory());
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_NEWTON_W;
        map.put(hMDeviceSource3, new NewtonWSortFactory(hMDeviceSource3));
        HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_NEWTON_WL;
        map.put(hMDeviceSource4, new NewtonWSortFactory(hMDeviceSource4));
        map.put(HMDeviceSource.MILI_PRAGUE, new PragueSortFactory());
        map.put(HMDeviceSource.MILI_PRAGUE_W, new PragueWSortFactory());
        map.put(HMDeviceSource.MILI_VOLGA, new VolgaSortFactory(null, 1, null));
        map.put(HMDeviceSource.MILI_VOLGA_W, new VolgaWSortFactory());
        map.put(HMDeviceSource.MILI_BLANC, new BlancSortFactory(null, 1, null));
        map.put(HMDeviceSource.MILI_BLANC_W, new BlancWSortFactory(null, 1, null));
        map.put(HMDeviceSource.MILI_HAMBURG, new HamburgSortFactory());
        map.put(HMDeviceSource.MILI_BONN, new BonnSortFactory());
        map.put(HMDeviceSource.MILI_HAMBURG_W, new HamburgWSortFactory());
        map.put(HMDeviceSource.MILI_BONN_W, new BonnWSortFactory());
        boolean z = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        map.put(HMDeviceSource.MILI_COMO, new ComoSortFactory(null, false, z, 7, defaultConstructorMarker));
        HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_COMO_L;
        boolean z2 = false;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        map.put(hMDeviceSource5, new ComoSortFactory(hMDeviceSource5, false, z2, 2, defaultConstructorMarker2));
        HMDeviceSource hMDeviceSource6 = HMDeviceSource.MILI_COMO_W;
        map.put(hMDeviceSource6, new ComoSortFactory(hMDeviceSource6, true, z, 4, defaultConstructorMarker));
        HMDeviceSource hMDeviceSource7 = HMDeviceSource.MILI_COMO_WL;
        map.put(hMDeviceSource7, new ComoSortFactory(hMDeviceSource7, true, false));
        map.put(HMDeviceSource.MILI_WAST, new WastSortFactory());
        map.put(HMDeviceSource.MILI_WAST_W, new WastWSortFactory());
        HMDeviceSource hMDeviceSource8 = HMDeviceSource.MILI_CRATER_W;
        map.put(hMDeviceSource8, new CraterSortFactory(hMDeviceSource8));
        HMDeviceSource hMDeviceSource9 = HMDeviceSource.MILI_CRATER_WL;
        map.put(hMDeviceSource9, new CraterSortFactory(hMDeviceSource9));
        HMDeviceSource hMDeviceSource10 = HMDeviceSource.MILI_NESS;
        map.put(hMDeviceSource10, new ComoSortFactory(hMDeviceSource10, false, z, 6, defaultConstructorMarker));
        HMDeviceSource hMDeviceSource11 = HMDeviceSource.MILI_NESS_W;
        map.put(hMDeviceSource11, new ComoSortFactory(hMDeviceSource11, true, z2, 4, defaultConstructorMarker2));
        HMDeviceSource hMDeviceSource12 = HMDeviceSource.MILI_DAX;
        map.put(hMDeviceSource12, new ComoSortFactory(hMDeviceSource12, true, z, 4, defaultConstructorMarker));
        map.put(HMDeviceSource.MILI_LONDON, new LondonSortFactory());
        map.put(HMDeviceSource.MILI_LONDON_W, new LondonWSortFactory());
        map.put(HMDeviceSource.MILI_VIENNA, new ViennaSortFactory(null, 1, null));
        map.put(HMDeviceSource.MILI_VIENNA_W, new ViennaWSortFactory());
        map.put(HMDeviceSource.MILI_ANDES, new AndesSortFactory(null, 1, null));
        map.put(HMDeviceSource.MILI_ANDES_W, new AndesWSortFactory());
        map.put(HMDeviceSource.MILI_MADRID, new LisbonSortFactory());
        map.put(HMDeviceSource.MILI_MADRID_W, new LisbonSortFactory());
        map.put(HMDeviceSource.MILI_TEIDE, new LisbonSortFactory());
        map.put(HMDeviceSource.MILI_TEIDE_W, new LisbonSortFactory());
    }

    @Nullable
    public final AppSortMapFactory getSortFactory(@NotNull HMDeviceSource source) {
        return sortFactories.get(source);
    }

    @NotNull
    public final List<AppSortMapFactory> loadSortFactories() {
        return CollectionsKt___CollectionsKt.toList(sortFactories.values());
    }

    @Nullable
    public final AppSortMapFactory mapByDeviceSource(@NotNull HMDeviceSource source) {
        return sortFactories.get(source);
    }
}
