package com.xiaomi.hm.health.device;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\fR?\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u00028F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/DeviceNameConfig;", "", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "a", "Lkotlin/Lazy;", "getDEVICE_REGEX_MAP", "()Ljava/util/Map;", "getDEVICE_REGEX_MAP$annotations", "()V", "DEVICE_REGEX_MAP", "<init>", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceNameConfig {

    @NotNull
    public static final DeviceNameConfig INSTANCE = new DeviceNameConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy DEVICE_REGEX_MAP = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Map<HMDeviceSource, ? extends ArrayList<String>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<HMDeviceSource, ? extends ArrayList<String>> invoke() {
            List<HMDeviceSource> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.OTHER_MOZART, HMDeviceSource.OTHER_HAYDN, HMDeviceSource.OTHER_LULLABY});
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
            for (HMDeviceSource hMDeviceSource : listListOf) {
                arrayList.add(TuplesKt.to(hMDeviceSource, ConfigHelperKt.getDeviceConfig(hMDeviceSource).getBtNames()));
            }
            return kotlin.collections.r.toMap(arrayList);
        }
    }

    private DeviceNameConfig() {
    }

    @NotNull
    public static final Map<HMDeviceSource, ArrayList<String>> getDEVICE_REGEX_MAP() {
        return (Map) DEVICE_REGEX_MAP.getValue();
    }

    @JvmStatic
    public static /* synthetic */ void getDEVICE_REGEX_MAP$annotations() {
    }
}
