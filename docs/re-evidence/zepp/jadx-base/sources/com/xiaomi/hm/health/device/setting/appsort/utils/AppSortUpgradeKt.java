package com.xiaomi.hm.health.device.setting.appsort.utils;

import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u001a&\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u0004\u001a\u00020\u0001\u001a<\u0010\r\u001a\u00020\f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u000b\u001a\u00020\n\u001aJ\u0010\u0010\u001a\u00020\f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\"\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\")\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\")\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\")\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\")\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018¨\u0006#"}, d2 = {"Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lkotlin/collections/ArrayList;", "sources", "source", "", "sourceMatch", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", SportAnalytics.ParamValue.MapButtonType.MAP, "", "pageType", "", "remove", "Lkotlin/Function0;", "support", "upgrade", "", "a", "Ljava/lang/String;", "TAG", "b", "Ljava/util/ArrayList;", "getOcSources", "()Ljava/util/ArrayList;", "ocSources", "c", "getLnSources", "lnSources", GoogleApiAvailabilityLight.a, "getBlancSources", "blancSources", "e", "getBlancWSources", "blancWSources", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AppSortUpgradeKt {

    @NotNull
    private static final String a = "AppSortUpgrade";

    @NotNull
    private static final ArrayList<HMDeviceSource> b;

    @NotNull
    private static final ArrayList<HMDeviceSource> c;

    @NotNull
    private static final ArrayList<HMDeviceSource> d;

    @NotNull
    private static final ArrayList<HMDeviceSource> e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ ArrayList<HMDeviceSource> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, ArrayList<HMDeviceSource> arrayList) {
            super(0);
            this.a = i;
            this.b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "remove " + this.a + ", sources: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMDeviceSource hMDeviceSource, int i, boolean z, boolean z2) {
            super(0);
            this.a = hMDeviceSource;
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "source: " + this.a + ", pageType: " + this.b + ", contains: " + this.c + ", support: " + this.d;
        }
    }

    static {
        ArrayList<HMDeviceSource> arrayList = new ArrayList<>();
        arrayList.add(HMDeviceSource.MILI_ONYX);
        arrayList.add(HMDeviceSource.MILI_ONYX_W);
        arrayList.add(HMDeviceSource.MILI_CORSICA);
        arrayList.add(HMDeviceSource.MILI_CORSICA_W);
        b = arrayList;
        ArrayList<HMDeviceSource> arrayList2 = new ArrayList<>();
        arrayList2.add(HMDeviceSource.MILI_LISBON);
        arrayList2.add(HMDeviceSource.MILI_LISBON_W);
        arrayList2.add(HMDeviceSource.MILI_NEWTON);
        arrayList2.add(HMDeviceSource.MILI_NEWTON_W);
        arrayList2.add(HMDeviceSource.MILI_LISBON_WL);
        arrayList2.add(HMDeviceSource.MILI_NEWTON_WL);
        c = arrayList2;
        ArrayList<HMDeviceSource> arrayList3 = new ArrayList<>();
        arrayList3.add(HMDeviceSource.MILI_BLANC);
        d = arrayList3;
        ArrayList<HMDeviceSource> arrayList4 = new ArrayList<>();
        arrayList4.add(HMDeviceSource.MILI_BLANC_W);
        e = arrayList4;
    }

    @NotNull
    public static final ArrayList<HMDeviceSource> getBlancSources() {
        return d;
    }

    @NotNull
    public static final ArrayList<HMDeviceSource> getBlancWSources() {
        return e;
    }

    @NotNull
    public static final ArrayList<HMDeviceSource> getLnSources() {
        return c;
    }

    @NotNull
    public static final ArrayList<HMDeviceSource> getOcSources() {
        return b;
    }

    public static final void remove(@Nullable HashMap<HMDeviceSource, SortableAppItems> map, @NotNull ArrayList<HMDeviceSource> arrayList, int i) {
        SortableAppItems sortableAppItems;
        if (map == null) {
            return;
        }
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        if (sourceMatch(arrayList, boundDeviceSource) && (sortableAppItems = map.get(boundDeviceSource)) != null) {
            int i2 = 0;
            if (sortableAppItems.getSparseArrayApps().indexOfKey(i) > 0) {
                HMLog.info(a, new a(i, arrayList));
                SparseArray<AppItem> sparseArrayApps = sortableAppItems.getSparseArrayApps();
                AppItem appItem = sparseArrayApps.get(i);
                if (appItem != null) {
                    int size = sparseArrayApps.size();
                    if (size > 0) {
                        while (true) {
                            int i3 = i2 + 1;
                            AppItem appItemValueAt = sparseArrayApps.valueAt(i2);
                            if (appItemValueAt.getIndex() > appItem.getIndex()) {
                                appItemValueAt.setIndex(appItemValueAt.getIndex() - 1);
                            }
                            if (i3 >= size) {
                                break;
                            } else {
                                i2 = i3;
                            }
                        }
                    }
                    sparseArrayApps.remove(i);
                }
                ((AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null)).syncAppSortDataToDevice(sortableAppItems, boundDeviceSource);
            }
        }
    }

    public static final boolean sourceMatch(@NotNull ArrayList<HMDeviceSource> arrayList, @NotNull HMDeviceSource hMDeviceSource) {
        return arrayList.contains(hMDeviceSource);
    }

    public static final void upgrade(@Nullable HashMap<HMDeviceSource, SortableAppItems> map, @NotNull ArrayList<HMDeviceSource> arrayList, int i, @NotNull Function0<Boolean> function0) {
        SortableAppItems sortableAppItems;
        if (map == null) {
            return;
        }
        boolean zBooleanValue = function0.invoke().booleanValue();
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        if (sourceMatch(arrayList, boundDeviceSource) && (sortableAppItems = map.get(boundDeviceSource)) != null) {
            int i2 = 0;
            boolean z = sortableAppItems.getSparseArrayApps().indexOfKey(i) > 0;
            HMLog.info(a, new b(boundDeviceSource, i, z, zBooleanValue));
            AppSortHelperApi appSortHelperApi = (AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null);
            if (!z || zBooleanValue) {
                if (z || !zBooleanValue) {
                    return;
                }
                int size = sortableAppItems.getSparseArrayApps().size();
                if (size > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        AppItem appItemValueAt = sortableAppItems.getSparseArrayApps().valueAt(i3);
                        appItemValueAt.setIndex(appItemValueAt.getIndex() + 1);
                        if (i4 >= size) {
                            break;
                        } else {
                            i3 = i4;
                        }
                    }
                }
                sortableAppItems.getSparseArrayApps().put(i, new AppItem(255, i, 0, true));
                appSortHelperApi.syncAppSortDataToDevice(sortableAppItems, boundDeviceSource);
                return;
            }
            SparseArray<AppItem> sparseArrayApps = sortableAppItems.getSparseArrayApps();
            AppItem appItem = sparseArrayApps.get(i);
            if (appItem != null) {
                int size2 = sparseArrayApps.size();
                if (size2 > 0) {
                    while (true) {
                        int i5 = i2 + 1;
                        AppItem appItemValueAt2 = sparseArrayApps.valueAt(i2);
                        if (appItemValueAt2.getIndex() > appItem.getIndex()) {
                            appItemValueAt2.setIndex(appItemValueAt2.getIndex() - 1);
                        }
                        if (i5 >= size2) {
                            break;
                        } else {
                            i2 = i5;
                        }
                    }
                }
                sparseArrayApps.remove(i);
            }
            appSortHelperApi.syncAppSortDataToDevice(sortableAppItems, boundDeviceSource);
        }
    }
}
