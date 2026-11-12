package com.mi.fitness.alexa.export;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"FEATURE_ALEXA", "", "isSupportAlexa", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "isAlexaSupportedCountry", "sAlexaSupportCountries", "", "alexa-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AlexaExportUtilKt {

    @NotNull
    public static final String FEATURE_ALEXA = "alexa";

    @NotNull
    private static final List<String> sAlexaSupportCountries = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{ServerConstants.GB_COUNTRY_CODE, ServerConstants.NEW_DE_COUNTRY_CODE, ServerConstants.IT_COUNTRY_CODE, ServerConstants.FR_COUNTRY_CODE, ServerConstants.ES_COUNTRY_CODE, "AT", "MX", Country.BR, "IE", "AU", "JP", "NZ", "IN", "SA", "AE"});

    public static final boolean isAlexaSupportedCountry() {
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        if (TextUtils.isEmpty(localCountry)) {
            return false;
        }
        Logger.d("Alexa", "isAlexaSupportedCountry localCountry:" + localCountry);
        return sAlexaSupportCountries.contains(localCountry);
    }

    public static final boolean isSupportAlexa(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "alexa");
        boolean zIsPlayChannel = AppUtil.INSTANCE.isPlayChannel();
        boolean zIsAlexaSupportedCountry = isAlexaSupportedCountry();
        Logger.i("Alexa4Watch", "isSupportAlexa " + zIsSupportFeature + ", " + zIsPlayChannel + ", " + zIsAlexaSupportedCountry);
        boolean z = zIsSupportFeature && zIsPlayChannel && zIsAlexaSupportedCountry;
        if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return z;
        }
        if (!wearableDeviceModel.getIsDeviceConnected()) {
            Logger.i("isSupportAlexa " + zIsSupportFeature + ",  huamiDevice is null", new Object[0]);
            return z;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        boolean zHasSoftwareFeature = huaMiApiCaller != null ? huaMiApiCaller.hasSoftwareFeature(16) : false;
        Logger.i("isSupportAlexa " + zIsSupportFeature + ",  " + zHasSoftwareFeature, new Object[0]);
        return z & zHasSoftwareFeature;
    }
}
