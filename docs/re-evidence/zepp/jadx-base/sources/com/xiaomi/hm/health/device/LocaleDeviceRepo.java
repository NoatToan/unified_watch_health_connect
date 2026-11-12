package com.xiaomi.hm.health.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b$\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002J\f\u0010\n\u001a\u00020\u0004*\u00020\u0002H\u0002J\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR/\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020!0 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001c\u0010\"¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/LocaleDeviceRepo;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "a", "", "e", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "f", GoogleApiAvailabilityLight.a, "migrateDeviceInfoToDb", "Landroid/bluetooth/BluetoothDevice;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "isBound", "type", "getBoundDevice", "removeDevice", "updateDevice", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sp", "Lcom/google/gson/Gson;", "b", "Lcom/google/gson/Gson;", "gson", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceMigrationApi;", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceMigrationApi;", "deviceMigrationApi", "", "", "()Ljava/util/Map;", "devicesMap", "<init>", "(Landroid/content/SharedPreferences;Lcom/google/gson/Gson;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "uid", "(Landroid/content/Context;J)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LocaleDeviceRepo implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferences sp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Gson gson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceMigrationApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy devicesMap;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Device;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Device, Boolean> {
        public final /* synthetic */ Device a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Device device) {
            super(1);
            this.a = device;
        }

        public final boolean a(@NotNull Device device) {
            return Intrinsics.areEqual(device.getDevice_address(), this.a.getDevice_address());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Device device) {
            return Boolean.valueOf(a(device));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LocaleDeviceRepo(SharedPreferences sharedPreferences, Gson gson) {
        this.sp = sharedPreferences;
        this.gson = gson;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceMigrationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceMigrationApi>() { // from class: com.xiaomi.hm.health.device.LocaleDeviceRepo$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceMigrationApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceMigrationApi.class), qualifier, objArr);
            }
        });
        this.devicesMap = LazyKt__LazyJVMKt.lazy(new Function0<Map<HMDeviceType, List<Device>>>() { // from class: com.xiaomi.hm.health.device.LocaleDeviceRepo$devicesMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<HMDeviceType, List<Device>> invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LocaleDeviceRepo localeDeviceRepo = this.a;
                Iterator<T> it2 = localeDeviceRepo.sp.getAll().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(Integer.parseInt((String) entry.getKey()));
                    if (hMDeviceTypeFromValue != HMDeviceType.VDevice) {
                        try {
                            Gson gson2 = localeDeviceRepo.gson;
                            Object value = entry.getValue();
                            if (value == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            List list = (List) gson2.fromJson((String) value, new TypeToken<List<Device>>() { // from class: com.xiaomi.hm.health.device.LocaleDeviceRepo$devicesMap$2$1$1$1
                            }.getType());
                            if (list != null && (!list.isEmpty())) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list) {
                                    if (localeDeviceRepo.d((Device) obj)) {
                                        arrayList.add(obj);
                                    }
                                }
                                linkedHashMap.put(hMDeviceTypeFromValue, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
                            }
                        } catch (JsonSyntaxException unused) {
                        }
                    }
                }
                return linkedHashMap;
            }
        });
    }

    private final boolean a(Device device) {
        if (!d(device)) {
            return false;
        }
        HMDeviceType hMDeviceTypeF = f(device);
        if (!c().containsKey(hMDeviceTypeF)) {
            c().put(hMDeviceTypeF, new ArrayList());
        }
        List<Device> list = c().get(hMDeviceTypeF);
        boolean zAdd = list != null ? list.add(device) : false;
        if (zAdd) {
            e();
        }
        return zAdd;
    }

    private final DeviceMigrationApi b() {
        return (DeviceMigrationApi) this.deviceMigrationApi.getValue();
    }

    private final Map<HMDeviceType, List<Device>> c() {
        return (Map) this.devicesMap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(Device device) {
        return f(device) != HMDeviceType.VDevice;
    }

    private final void e() {
        SharedPreferences.Editor editorEdit = this.sp.edit();
        editorEdit.clear();
        for (Map.Entry<HMDeviceType, List<Device>> entry : c().entrySet()) {
            if (!entry.getValue().isEmpty()) {
                editorEdit.putString(String.valueOf(entry.getKey().getValue()), this.gson.toJson(entry.getValue()));
            }
        }
        editorEdit.apply();
    }

    private final HMDeviceType f(Device device) {
        return HMDeviceType.fromValue(device.getDevice_type().intValue());
    }

    @Nullable
    public final Device getBoundDevice(@NotNull BluetoothDevice device, @NotNull HMDeviceType type) {
        List<Device> list = c().get(type);
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((Device) obj2).getDevice_address(), device.getAddress())) {
                obj = obj2;
                break;
            }
        }
        return (Device) obj;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isBound(@NotNull BluetoothDevice device, @NotNull HMDeviceSource source) {
        List<Device> list = c().get(source.getType());
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(((Device) it2.next()).getDevice_address(), device.getAddress())) {
                return true;
            }
        }
        return false;
    }

    public final void migrateDeviceInfoToDb() {
        b().migrateDeviceInfoToDb(c());
    }

    public final boolean removeDevice(@NotNull Device device) {
        if (!d(device)) {
            return false;
        }
        List<Device> list = c().get(f(device));
        boolean zRemoveAll = list == null ? true : kotlin.collections.h.removeAll((List) list, (Function1) new a(device));
        if (zRemoveAll) {
            e();
        }
        return zRemoveAll;
    }

    public final boolean updateDevice(@NotNull Device device) {
        removeDevice(device);
        return a(device);
    }

    public LocaleDeviceRepo(@NotNull Context context, long j) {
        this(context.getSharedPreferences("locale_device_" + j, 0), new Gson());
    }
}
