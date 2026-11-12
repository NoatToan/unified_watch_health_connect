package com.xiaomi.hm.health.device.setting.appsort.utils;

import android.util.SparseArray;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001c\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\"\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00000\rj\b\u0012\u0004\u0012\u00020\u0000`\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "sourceInclude", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", SportAnalytics.ParamValue.MapButtonType.MAP, "", "upgradeWorldClock", "", "a", "Ljava/lang/String;", "TAG", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "includeSources", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class WorldClockUpgrageKt {

    @NotNull
    private static final String a = "WorldClockUpgrade";

    @NotNull
    private static final ArrayList<HMDeviceSource> b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSource hMDeviceSource, boolean z, boolean z2) {
            super(0);
            this.a = hMDeviceSource;
            this.b = z;
            this.c = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "world clock  source: " + this.a + ", contains: " + this.b + ", supportWorldClock: " + this.c;
        }
    }

    static {
        ArrayList<HMDeviceSource> arrayList = new ArrayList<>();
        arrayList.add(HMDeviceSource.MILI_TOKYO);
        b = arrayList;
    }

    public static final boolean sourceInclude(@NotNull HMDeviceSource hMDeviceSource) {
        return b.contains(hMDeviceSource);
    }

    public static final void upgradeWorldClock(@Nullable HashMap<HMDeviceSource, SortableAppItems> map) {
        SortableAppItems sortableAppItems;
        if (map == null) {
            return;
        }
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        if (sourceInclude(boundDeviceSource) && (sortableAppItems = map.get(boundDeviceSource)) != null) {
            boolean zHasSw = HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(1);
            int i = 0;
            boolean z = sortableAppItems.getSparseArrayApps().indexOfKey(26) > 0;
            HMLog.info(a, new a(boundDeviceSource, z, zHasSw));
            AppSortHelperApi appSortHelperApi = (AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null);
            if (z && !zHasSw) {
                SparseArray<AppItem> sparseArrayApps = sortableAppItems.getSparseArrayApps();
                AppItem appItem = sparseArrayApps.get(26);
                if (appItem != null) {
                    int size = sparseArrayApps.size();
                    if (size > 0) {
                        while (true) {
                            int i2 = i + 1;
                            AppItem appItemValueAt = sparseArrayApps.valueAt(i);
                            if (appItemValueAt.getIndex() > appItem.getIndex()) {
                                appItemValueAt.setIndex(appItemValueAt.getIndex() - 1);
                            }
                            if (i2 >= size) {
                                break;
                            } else {
                                i = i2;
                            }
                        }
                    }
                    sparseArrayApps.remove(26);
                }
                appSortHelperApi.syncAppSortDataToDevice(sortableAppItems, boundDeviceSource);
                return;
            }
            if (z || !zHasSw) {
                return;
            }
            int size2 = sortableAppItems.getSparseArrayApps().size();
            if (size2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    AppItem appItemValueAt2 = sortableAppItems.getSparseArrayApps().valueAt(i3);
                    if (appItemValueAt2.getIndex() >= 0) {
                        appItemValueAt2.setIndex(appItemValueAt2.getIndex() + 1);
                    }
                    if (i4 >= size2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            sortableAppItems.getSparseArrayApps().put(26, new AppItem(255, 26, 0, true));
            appSortHelperApi.syncAppSortDataToDevice(sortableAppItems, boundDeviceSource);
        }
    }
}
