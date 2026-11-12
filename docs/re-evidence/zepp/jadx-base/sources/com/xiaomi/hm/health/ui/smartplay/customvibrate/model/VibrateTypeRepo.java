package com.xiaomi.hm.health.ui.smartplay.customvibrate.model;

import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/model/VibrateTypeRepo;", "", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/model/VibrateType;", "Lkotlin/collections/ArrayList;", "a", "getVibrateConfig", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class VibrateTypeRepo {
    private final ArrayList<VibrateType> a() {
        ArrayList<VibrateType> arrayList = new ArrayList<>();
        if (ConfigHelperKt.hasFeature(Feature.GT3_SOURCE)) {
            arrayList.add(VibrateType.SCHEDULE);
        } else {
            if (!ConfigHelperKt.hasFeature(Feature.DISABLE_SCHEDULE)) {
                arrayList.add(VibrateType.EVENT_REMIND);
            }
            if (ConfigHelperKt.hasFeature(Feature.SUPPORT_SCHEDULE_VIBRATE_MODE)) {
                arrayList.add(VibrateType.SCHEDULE);
            }
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<VibrateType> getVibrateConfig() {
        ArrayList<VibrateType> arrayList = new ArrayList<>();
        arrayList.add(VibrateType.INCOMING_CALL);
        arrayList.addAll(a());
        arrayList.add(VibrateType.ALARM);
        arrayList.add(VibrateType.APP_NOTIFY);
        arrayList.add(VibrateType.LONG_SIT);
        arrayList.add(VibrateType.SMS);
        arrayList.add(VibrateType.SPORT_REACH_GOAL);
        if (ConfigHelperKt.hasFeature(Feature.SUPPORT_FIND_BAND_VIBRATE_TYPE)) {
            arrayList.add(VibrateType.FIND_BAND);
        }
        if (HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(30)) {
            arrayList.add(VibrateType.TODO);
        }
        return arrayList;
    }
}
