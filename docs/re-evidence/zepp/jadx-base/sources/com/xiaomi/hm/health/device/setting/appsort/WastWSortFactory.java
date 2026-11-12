package com.xiaomi.hm.health.device.setting.appsort;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/WastWSortFactory;", "Lcom/xiaomi/hm/health/device/setting/appsort/ComoSortFactory;", "", "m", "Ljava/lang/Integer;", "getDefaultVersion", "()Ljava/lang/Integer;", "defaultVersion", "", "Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", GoogleApiAvailabilityLight.b, "Lkotlin/Lazy;", "getDefaultItems", "()Ljava/util/List;", "defaultItems", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WastWSortFactory extends ComoSortFactory {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final Integer defaultVersion;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultItems;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<PageItem>> {
        public static final a a = new a();

        public a() {
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
            arrayList.add(new PageItem(255, 29, false, Integer.valueOf(R.string.setting_app_women_health), null, null, 52, null));
            arrayList.add(new PageItem(255, 62, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 9, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 13, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 57, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 14, false, null, null, null, 60, null));
            arrayList.add(new PageItem(255, 19, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 4, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 51, false, Integer.valueOf(R.string.app_sort_breath_train), null, null, 52, null));
            arrayList.add(new PageItem(7, 11, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 10, false, Integer.valueOf(R.string.app_sort_camera_control), null, null, 52, null));
            arrayList.add(new PageItem(7, 12, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 56, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 26, false, null, null, null, 60, null));
            arrayList.add(new PageItem(7, 22, false, null, null, null, 60, null));
            return arrayList;
        }
    }

    public WastWSortFactory() {
        super(HMDeviceSource.MILI_WAST_W, false, false, 6, null);
        this.defaultItems = LazyKt__LazyJVMKt.lazy(a.a);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.ComoSortFactory, com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @NotNull
    public List<PageItem> getDefaultItems() {
        return (List) this.defaultItems.getValue();
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.ComoSortFactory, com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory
    @Nullable
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }
}
