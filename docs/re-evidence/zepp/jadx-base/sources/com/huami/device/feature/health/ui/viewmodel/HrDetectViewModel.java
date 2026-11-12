package com.huami.device.feature.health.ui.viewmodel;

import android.app.Application;
import androidx.p008lifecycle.LiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.HealthUi;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.settings.HighHrAlertSetting;
import com.huami.device.feature.health.settings.HrIntervalSetting;
import com.huami.device.feature.health.settings.HrModeSetting;
import com.huami.device.feature.health.settings.OsaSetting;
import com.huami.device.feature.health.settings.PressureSetting;
import com.huami.device.feature.health.settings.SportHrSetting;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.hr.HrIntervalSettingItem;
import com.huami.device.feature.health.ui.item.hr.HrModeSettingItem;
import com.huami.device.feature.health.ui.item.hr.HrWarningEnableSettingItem;
import com.huami.device.feature.health.ui.item.hr.HrWarningValueSettingItem;
import com.huami.device.feature.health.ui.item.hr.OsaSettingItem;
import com.huami.device.feature.health.ui.item.hr.PressureSettingItem;
import com.huami.device.feature.health.ui.item.hr.SportHrSettingItem;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.device.feature.health.util.LiveDataExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R \u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/device/feature/health/ui/viewmodel/HrDetectViewModel;", "Lcom/huami/device/feature/health/ui/viewmodel/BaseHealthViewModel;", "", "isDeviceEnable", "", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "c", "Lcom/huami/device/feature/health/device/HealthFunc;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "hrDetectSupportItems", "Landroidx/lifecycle/LiveData;", "e", "Landroidx/lifecycle/LiveData;", "getItems", "()Landroidx/lifecycle/LiveData;", "items", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HrDetectViewModel extends BaseHealthViewModel {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<HealthFunc<?>> hrDetectSupportItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<SettingItem>> items;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull Pair<Boolean, Boolean> pair) {
            return pair.getFirst();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/huami/device/feature/health/user/HealthConfig;", "pair", "", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Pair<? extends Boolean, ? extends HealthConfig>, List<? extends SettingItem>> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SettingItem> invoke(@NotNull Pair<Boolean, HealthConfig> pair) {
            return HrDetectViewModel.this.c(pair.getFirst().booleanValue());
        }
    }

    public HrDetectViewModel(@NotNull Application application) {
        super(application);
        ArrayList arrayList = new ArrayList();
        arrayList.add(HealthFunc.HR_MODE.INSTANCE);
        arrayList.add(HealthFunc.HR_INTERVAL.INSTANCE);
        arrayList.add(HealthFunc.SPORT_HR.INSTANCE);
        arrayList.add(HealthFunc.HIGH_HR_ALERT.INSTANCE);
        arrayList.add(HealthFunc.PRESSURE.INSTANCE);
        arrayList.add(HealthFunc.OSA.INSTANCE);
        Unit unit = Unit.INSTANCE;
        this.hrDetectSupportItems = arrayList;
        this.items = LiveDataExtKt.syncMap(LiveDataExtKt.combineLatest(LiveDataExtKt.map(LiveDataExtKt.combineLatest(HealthUi.INSTANCE.getDeviceEnableLiveData(), getInvalideLiveData$health_ui_release()), a.a), HealthDetect.INSTANCE.observeHealthConfig()), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SettingItem> c(boolean isDeviceEnable) {
        OsaSetting service;
        ArrayList arrayList = new ArrayList();
        HealthDevice healthDevice = (HealthDevice) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HealthDevice.class), null, null);
        Iterator<T> it2 = this.hrDetectSupportItems.iterator();
        while (it2.hasNext()) {
            HealthFunc healthFunc = (HealthFunc) it2.next();
            HealthFunc.HR_MODE hr_mode = HealthFunc.HR_MODE.INSTANCE;
            if (Intrinsics.areEqual(healthFunc, hr_mode)) {
                HrModeSetting service2 = hr_mode.getService();
                if (service2 != null) {
                    arrayList.add(new HrModeSettingItem(service2, healthDevice, isDeviceEnable));
                }
            } else {
                HealthFunc.HR_INTERVAL hr_interval = HealthFunc.HR_INTERVAL.INSTANCE;
                if (Intrinsics.areEqual(healthFunc, hr_interval)) {
                    HrIntervalSetting service3 = hr_interval.getService();
                    if (service3 != null) {
                        arrayList.add(new HrIntervalSettingItem(service3, healthDevice, isDeviceEnable));
                    }
                } else {
                    HealthFunc.SPORT_HR sport_hr = HealthFunc.SPORT_HR.INSTANCE;
                    if (Intrinsics.areEqual(healthFunc, sport_hr)) {
                        SportHrSetting service4 = sport_hr.getService();
                        if (service4 != null) {
                            arrayList.add(new SportHrSettingItem(service4, healthDevice, isDeviceEnable));
                        }
                    } else {
                        HealthFunc.HIGH_HR_ALERT high_hr_alert = HealthFunc.HIGH_HR_ALERT.INSTANCE;
                        if (Intrinsics.areEqual(healthFunc, high_hr_alert)) {
                            HighHrAlertSetting service5 = high_hr_alert.getService();
                            if (service5 != null) {
                                arrayList.add(new HrWarningEnableSettingItem(service5, healthDevice, isDeviceEnable));
                                arrayList.add(new HrWarningValueSettingItem(service5, healthDevice, isDeviceEnable));
                            }
                        } else {
                            HealthFunc.PRESSURE pressure = HealthFunc.PRESSURE.INSTANCE;
                            if (Intrinsics.areEqual(healthFunc, pressure)) {
                                PressureSetting service6 = pressure.getService();
                                if (service6 != null) {
                                    arrayList.add(new PressureSettingItem(service6, isDeviceEnable));
                                }
                            } else {
                                HealthFunc.OSA osa = HealthFunc.OSA.INSTANCE;
                                if (Intrinsics.areEqual(healthFunc, osa) && (service = osa.getService()) != null) {
                                    arrayList.add(new OsaSettingItem(service, isDeviceEnable));
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final LiveData<List<SettingItem>> getItems() {
        return this.items;
    }
}
