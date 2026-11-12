package com.xiaomi.hm.health.device.deviceproperty;

import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceproperty/HMDevicePropertyCache;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "a", "", "c", "b", "", GoogleApiAvailabilityLight.a, "", "f", "e", "getMiliFeature", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "getFeature", Constants.JSON_FEATURE, "putFeature", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/hm/health/device/deviceproperty/HMDeviceProperty;", "Ljava/util/concurrent/ConcurrentHashMap;", "propertyHash", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMDevicePropertyCache {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile HMDevicePropertyCache b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<HMDeviceSource, HMDeviceProperty> propertyHash = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceproperty/HMDevicePropertyCache$Companion;", "", "Lcom/xiaomi/hm/health/device/deviceproperty/HMDevicePropertyCache;", "getInstance", "", "clear", DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/device/deviceproperty/HMDevicePropertyCache;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void clear() {
            HMDevicePropertyCache.b = null;
        }

        @JvmStatic
        @NotNull
        public final HMDevicePropertyCache getInstance() {
            if (HMDevicePropertyCache.b == null) {
                synchronized (HMDevicePropertyCache.class) {
                    if (HMDevicePropertyCache.b == null) {
                        Companion companion = HMDevicePropertyCache.INSTANCE;
                        HMDevicePropertyCache.b = new HMDevicePropertyCache();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return HMDevicePropertyCache.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSource hMDeviceSource, String str) {
            super(0);
            this.a = hMDeviceSource;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init, source: " + this.a + ", propertyStr: " + this.b;
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
            return "getFeature deviceProperty null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "postToServer deviceProperty null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "putFeature deviceProperty null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMDeviceSource hMDeviceSource, String str) {
            super(0);
            this.a = hMDeviceSource;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "refresh, source: " + this.a + ", propertyStr: " + this.b;
        }
    }

    public HMDevicePropertyCache() {
        HMDeviceType[] hMDeviceTypeArrValues = HMDeviceType.values();
        ArrayList arrayList = new ArrayList();
        int length = hMDeviceTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            HMDeviceType hMDeviceType = hMDeviceTypeArrValues[i];
            if (hMDeviceType != HMDeviceType.VDevice) {
                arrayList.add(hMDeviceType);
            }
            i++;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource((HMDeviceType) it2.next()));
        }
        ArrayList<HMDeviceSource> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            HMDeviceSource hMDeviceSource = (HMDeviceSource) obj;
            if (hMDeviceSource != HMDeviceSource.VDEVICE && f(hMDeviceSource)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        for (HMDeviceSource hMDeviceSource2 : arrayList3) {
            String strB = b(hMDeviceSource2);
            HMLog.info("HMDevicePropertyCache", new a(hMDeviceSource2, strB));
            this.propertyHash.put(hMDeviceSource2, HMDeviceProperty.INSTANCE.fromJsonString(strB));
            arrayList4.add(Unit.INSTANCE);
        }
    }

    private final Feature a(HMDeviceSource source) {
        DeviceInfo deviceInfo;
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(source.getType());
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return null;
        }
        return deviceInfo.getDeviceFeature();
    }

    private final String b(HMDeviceSource source) {
        String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(c(source), "");
        return property == null ? "" : property;
    }

    private final String c(HMDeviceSource source) {
        return "huami.mifit.user.settings.device." + source.getValue();
    }

    @JvmStatic
    public static final void clear() {
        INSTANCE.clear();
    }

    private final void d(HMDeviceSource source) {
        HMDeviceProperty hMDeviceProperty = this.propertyHash.get(source);
        if (hMDeviceProperty == null) {
            HMLog.info("HMDevicePropertyCache", c.a);
        } else {
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(c(source), hMDeviceProperty.toJsonString());
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        }
    }

    private final void e(HMDeviceSource source) {
        if (this.propertyHash.get(source) == null && f(source)) {
            String strB = b(source);
            HMLog.info("HMDevicePropertyCache", new e(source, strB));
            this.propertyHash.put(source, HMDeviceProperty.INSTANCE.fromJsonString(strB));
        }
    }

    private final boolean f(HMDeviceSource hMDeviceSource) {
        return ArraysKt___ArraysKt.contains(HMDevicePropertyCacheKt.l, Integer.valueOf(hMDeviceSource.getValue()));
    }

    @JvmStatic
    @NotNull
    public static final HMDevicePropertyCache getInstance() {
        return INSTANCE.getInstance();
    }

    @NotNull
    public final Feature getFeature(@NotNull HMDeviceType type) {
        return getFeature(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(type));
    }

    @NotNull
    public final Feature getMiliFeature() {
        return getFeature(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI));
    }

    public final void putFeature(@NotNull Feature feature, @NotNull HMDeviceSource source) {
        if (f(source)) {
            e(source);
            HMDeviceProperty hMDeviceProperty = this.propertyHash.get(source);
            if (hMDeviceProperty == null) {
                HMLog.info("HMDevicePropertyCache", d.a);
                return;
            }
            Feature feature2 = hMDeviceProperty.getFeature();
            if (TextUtils.equals(feature2 == null ? null : HMDevicePropertyKt.toPropertyString(feature2), HMDevicePropertyKt.toPropertyString(feature))) {
                return;
            }
            hMDeviceProperty.setFeature(feature);
            d(source);
        }
    }

    @NotNull
    public final Feature getFeature(@NotNull HMDeviceSource source) {
        Feature featureA = a(source);
        if (featureA != null) {
            return featureA;
        }
        if (!f(source)) {
            return new Feature();
        }
        e(source);
        HMDeviceProperty hMDeviceProperty = this.propertyHash.get(source);
        if (hMDeviceProperty != null) {
            Feature feature = hMDeviceProperty.getFeature();
            return feature == null ? new Feature() : feature;
        }
        HMLog.info("HMDevicePropertyCache", b.a);
        return new Feature();
    }
}
