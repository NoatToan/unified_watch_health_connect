package com.xiaomi.hm.health.device.setting.appsort.repo;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.device.AppSortHelperKt;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.appsort.AppGroup;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.appsort.SortAppSetting;
import com.xiaomi.hm.health.device.setting.appsort.condition.DeviceAppSortConditionProvider;
import com.xiaomi.hm.health.device.setting.appsort.repo.DefaultAppSortRepo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006H\u0016J\u0010\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006H\u0016R\u001c\u0010\u001e\u001a\u00020\u00198\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\u00020\u001f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/DefaultAppSortRepo;", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/ISortRepo;", "", "", "", GoogleApiAvailabilityLight.a, "", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "b", "Lcom/xiaomi/hm/health/bt/profile/page/PageItem;", "items", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "f", "", "e", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "getConditions", "Lcom/xiaomi/hm/health/device/setting/appsort/AppGroup;", "groups", "saveToDeviceAndDb", "getAppGroup", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "getDeviceCenter", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/device/setting/DeviceCenter;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultAppSortRepo implements ISortRepo {

    @NotNull
    private static final String c = "DefaultAppSortRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceCenter deviceCenter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device null";
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
            return "saveToDevice fail";
        }
    }

    public DefaultAppSortRepo(@NotNull Context context, @NotNull DeviceCenter deviceCenter) {
        this.context = context;
        this.deviceCenter = deviceCenter;
    }

    private final List<AppItem> b() {
        SortableAppItems mergedDisplaySetting = HMAppSortDataManager.getInstance().getMergedDisplaySetting(getDeviceCenter().getDeviceSource());
        if (mergedDisplaySetting == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int appCount = mergedDisplaySetting.getAppCount();
        for (int i = 0; i < appCount; i++) {
            AppItem appItem = mergedDisplaySetting.getAppItem(i);
            if (appItem != null) {
                arrayList.add(appItem);
            }
        }
        g.sortWith(arrayList, new Comparator() { // from class: e51
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultAppSortRepo.c((AppItem) obj, (AppItem) obj2);
            }
        });
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(AppItem appItem, AppItem appItem2) {
        return appItem.getIndex() - appItem2.getIndex();
    }

    private final Map<Integer, String> d() {
        HashMap map = new HashMap();
        AppSortHelperKt.createAppSort((Context) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null), getDeviceCenter().getDeviceSource(), map, new HashMap(), new HashMap());
        return map;
    }

    private final void e(List<? extends PageItem> items) {
        Object next;
        HMDeviceSource deviceSource = getDeviceCenter().getDeviceSource();
        SortableAppItems sortableAppItems = HMAppSortDataManager.getInstance().getDisplaySetting().get(deviceSource);
        if (sortableAppItems == null) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        int appCount = sortableAppItems.getAppCount();
        if (appCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                AppItem appItem = sortableAppItems.getAppItem(i);
                Iterator<T> it2 = items.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(appItem.getType() == ((PageItem) next).getCurrentType()));
                PageItem pageItem = (PageItem) next;
                if (pageItem != null) {
                    sparseArray.put(pageItem.getCurrentType(), new AppItem(pageItem.getParentType(), pageItem.getCurrentType(), pageItem.getIndex(), pageItem.getFlag() == 0));
                }
                if (i2 >= appCount) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        HMAppSortDataManager.getInstance().save(deviceSource, new SortAppSetting(deviceSource, sparseArray));
    }

    private final boolean f(List<? extends PageItem> items, HMMiLiProDevice device) {
        return device.setPagesSync(items);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    @Nullable
    public List<AppGroup> getAppGroup() {
        List<AppItem> listB = b();
        if (listB == null || listB.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AppItem> arrayList3 = new ArrayList();
        ArrayList<AppItem> arrayList4 = new ArrayList();
        for (AppItem appItem : listB) {
            if (!appItem.isEnable()) {
                arrayList4.add(appItem);
            } else if (appItem.getParentType() == 7) {
                arrayList3.add(appItem);
            } else if (appItem.getType() != 7) {
                arrayList2.add(appItem);
            }
        }
        Map<Integer, String> mapD = d();
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AppItem appItem2 = (AppItem) it2.next();
            String str = mapD.get(Integer.valueOf(appItem2.getType()));
            arrayList5.add(new com.xiaomi.hm.health.device.setting.appsort.AppItem(str != null ? str : "", appItem2.getType(), appItem2.getParentType(), appItem2.getType() != 19));
        }
        arrayList.add(new AppGroup(255, arrayList5, IntroduceShuffleFactoryKt.getString(R.string.sort_top_label)));
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        for (AppItem appItem3 : arrayList3) {
            String str2 = mapD.get(Integer.valueOf(appItem3.getType()));
            if (str2 == null) {
                str2 = "";
            }
            arrayList6.add(new com.xiaomi.hm.health.device.setting.appsort.AppItem(str2, appItem3.getType(), appItem3.getParentType(), appItem3.getType() != 19));
        }
        String str3 = mapD.get(7);
        if (str3 == null) {
            str3 = "";
        }
        arrayList.add(new AppGroup(7, arrayList6, str3));
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        for (AppItem appItem4 : arrayList4) {
            String str4 = mapD.get(Integer.valueOf(appItem4.getType()));
            if (str4 == null) {
                str4 = "";
            }
            arrayList7.add(new com.xiaomi.hm.health.device.setting.appsort.AppItem(str4, appItem4.getType(), appItem4.getParentType(), appItem4.getType() != 19));
        }
        arrayList.add(new AppGroup(arrayList7, IntroduceShuffleFactoryKt.getString(R.string.invisible_item_app)));
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    @NotNull
    public List<Object> getConditions(@NotNull HMDeviceSource source) {
        return new DeviceAppSortConditionProvider(getContext()).getConditions(source);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    @NotNull
    public Context getContext() {
        return this.context;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    @NotNull
    public DeviceCenter getDeviceCenter() {
        return this.deviceCenter;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    public boolean saveToDeviceAndDb(@NotNull List<AppGroup> groups) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (AppGroup appGroup : groups) {
            if (appGroup.getGroup() == 7) {
                arrayList.add(new PageItem(i2, 7, 255, appGroup.getItems().isEmpty()));
                i2++;
            }
            for (com.xiaomi.hm.health.device.setting.appsort.AppItem appItem : appGroup.getItems()) {
                if (appGroup.isDisableGroup()) {
                    i = i2 + 1;
                    arrayList.add(new PageItem(i2, appItem.getValue(), appItem.getParent(), true));
                } else {
                    i = i2 + 1;
                    arrayList.add(new PageItem(i2, appItem.getValue(), appGroup.getGroup(), false));
                }
                i2 = i;
            }
        }
        HMBaseDevice device = getDeviceCenter().getDevice();
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            HMLog.info(c, a.a);
            return false;
        }
        if (f(arrayList, hMMiLiProDevice)) {
            e(arrayList);
            return true;
        }
        HMLog.info(c, b.a);
        return false;
    }
}
