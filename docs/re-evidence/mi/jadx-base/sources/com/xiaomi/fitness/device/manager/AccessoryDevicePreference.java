package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007RC\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/device/manager/AccessoryDevicePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "ACCESSORY_DEVICE", "getACCESSORY_DEVICE", "()Ljava/util/concurrent/ConcurrentHashMap;", "setACCESSORY_DEVICE", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "ACCESSORY_DEVICE$delegate", "Lkotlin/properties/ReadWriteProperty;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessoryDevicePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessoryDevicePreference.kt\ncom/xiaomi/fitness/device/manager/AccessoryDevicePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,12:1\n135#2,6:13\n*S KotlinDebug\n*F\n+ 1 AccessoryDevicePreference.kt\ncom/xiaomi/fitness/device/manager/AccessoryDevicePreference\n*L\n11#1:13,6\n*E\n"})
public final class AccessoryDevicePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccessoryDevicePreference.class, "ACCESSORY_DEVICE", "getACCESSORY_DEVICE()Ljava/util/concurrent/ConcurrentHashMap;", 0))};

    /* JADX INFO: renamed from: ACCESSORY_DEVICE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ACCESSORY_DEVICE;

    @NotNull
    public static final AccessoryDevicePreference INSTANCE;

    static {
        AccessoryDevicePreference accessoryDevicePreference = new AccessoryDevicePreference();
        INSTANCE = accessoryDevicePreference;
        ACCESSORY_DEVICE = accessoryDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class), new TypeToken<ConcurrentHashMap<String, Integer>>() { // from class: com.xiaomi.fitness.device.manager.AccessoryDevicePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), new ConcurrentHashMap(), null, false);
    }

    private AccessoryDevicePreference() {
    }

    @NotNull
    public final ConcurrentHashMap<String, Integer> getACCESSORY_DEVICE() {
        return (ConcurrentHashMap) ACCESSORY_DEVICE.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "accessory_device_manager";
    }

    public final void setACCESSORY_DEVICE(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "<set-?>");
        ACCESSORY_DEVICE.setValue(this, $$delegatedProperties[0], concurrentHashMap);
    }
}
