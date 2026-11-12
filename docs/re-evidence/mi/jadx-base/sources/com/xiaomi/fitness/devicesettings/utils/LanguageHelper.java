package com.xiaomi.fitness.devicesettings.utils;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.common.language.LanguagesModel;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.LanguageSetting;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.onetrack.b.m;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/LanguageHelper;", "", "<init>", "()V", "HMLanguageFollowSystem", "", "sHuamiCN", "sHuamiTW", "sHuamiEN", "convertHM2Modle", "", "Lcom/xiaomi/fitness/devicesettings/common/language/LanguagesModel;", "list", "", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "default", "getHuaMiLanguageStrByTag", "", "language", "getHuaMiLanguagesName", "getHuaMiLanguageStrByLocale", "getHuaMiLanguageTypeByLocale", "getHuaMiDefaultLanguage", "isCurrentLanguageInChina", "", "did", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLanguageHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageHelper.kt\ncom/xiaomi/fitness/devicesettings/utils/LanguageHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1863#2,2:218\n*S KotlinDebug\n*F\n+ 1 LanguageHelper.kt\ncom/xiaomi/fitness/devicesettings/utils/LanguageHelper\n*L\n27#1:218,2\n*E\n"})
public final class LanguageHelper {
    public static final int HMLanguageFollowSystem = -1;

    @NotNull
    public static final LanguageHelper INSTANCE = new LanguageHelper();
    public static final int sHuamiCN = 0;
    public static final int sHuamiEN = 2;
    public static final int sHuamiTW = 1;

    private LanguageHelper() {
    }

    @JvmStatic
    public static final int getHuaMiLanguageTypeByLocale() {
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        Logger.d("getHuaMiLanguageTypeByLocale:" + currentLocale$default, new Object[0]);
        int iHashCode = currentLocale$default.hashCode();
        if (iHashCode != 115862300) {
            return iHashCode != 115862452 ? 1 : 1;
        }
        if (currentLocale$default.equals("zh_cn")) {
            return 0;
        }
        return RegionUtil.isInnerCN() ? 0 : 2;
    }

    private final String getHuaMiLanguagesName(int language) {
        switch (language) {
            case 0:
                return ResourceExtKt.getString(wzi.me);
            case 1:
                return ResourceExtKt.getString(wzi.Ke);
            case 2:
                return ResourceExtKt.getString(wzi.re);
            case 3:
                return ResourceExtKt.getString(wzi.se);
            case 4:
                return ResourceExtKt.getString(wzi.Ge);
            case 5:
                return ResourceExtKt.getString(wzi.ze);
            case 6:
                return ResourceExtKt.getString(wzi.ue);
            case 7:
                return ResourceExtKt.getString(wzi.pe);
            case 8:
                return ResourceExtKt.getString(wzi.we);
            case 9:
                return ResourceExtKt.getString(wzi.Ce);
            case 10:
                return ResourceExtKt.getString(wzi.xe);
            case 11:
                return ResourceExtKt.getString(wzi.ye);
            case 12:
                return ResourceExtKt.getString(wzi.Ie);
            case 13:
                return ResourceExtKt.getString(wzi.le);
            case 14:
                return ResourceExtKt.getString(wzi.Me);
            case 15:
                return ResourceExtKt.getString(wzi.De);
            case 16:
                return ResourceExtKt.getString(wzi.Ae);
            case 17:
                return ResourceExtKt.getString(wzi.Je);
            case 18:
                return ResourceExtKt.getString(wzi.Le);
            case 19:
                return ResourceExtKt.getString(wzi.ve);
            case 20:
                return ResourceExtKt.getString(wzi.Ee);
            case 21:
                return ResourceExtKt.getString(wzi.Fe);
            case 22:
                return ResourceExtKt.getString(wzi.ne);
            case 23:
                return ResourceExtKt.getString(wzi.qe);
            case 24:
            case 25:
            default:
                return null;
            case 26:
                return ResourceExtKt.getString(wzi.te);
            case 27:
                return ResourceExtKt.getString(wzi.Be);
            case 28:
                return ResourceExtKt.getString(wzi.oe);
            case 29:
                return ResourceExtKt.getString(wzi.He);
        }
    }

    @NotNull
    public final List<LanguagesModel> convertHM2Modle(@NotNull List<? extends HMLanguage> list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        for (HMLanguage hMLanguage : list) {
            LanguagesModel languagesModel = new LanguagesModel(hMLanguage);
            LanguageHelper languageHelper = INSTANCE;
            Intrinsics.checkNotNull(hMLanguage);
            languagesModel.setName(languageHelper.getHuaMiLanguagesName(hMLanguage.getLanguage()));
            languagesModel.setSelected(hMLanguage.getLanguage() == i);
            arrayList.add(languagesModel);
        }
        return arrayList;
    }

    @NotNull
    public final HMLanguage getHuaMiDefaultLanguage() {
        String language;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return RegionUtil.isInnerCN() ? new HMLanguage(0) : new HMLanguage(2);
        }
        if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), "zh")) {
            language = "zh_tw";
            if (!Intrinsics.areEqual(LocaleUtil.getCurrentLocale(), "zh_hk") && !Intrinsics.areEqual(LocaleUtil.getCurrentLocale(), "zh_tw")) {
                language = LocaleUtil.getCurrentLocale();
            }
        } else {
            language = Locale.getDefault().getLanguage();
        }
        HuamiApiCaller huamiDevice = DeviceModelExtKt.getHuamiDevice(wearableDeviceModel);
        List<HMLanguage> languages = huamiDevice != null ? huamiDevice.getLanguages() : null;
        Logger.i(DeviceSettingsSyncer.TAG, "getHuaMiLanguageTypeByLocale locale = " + language);
        if (languages != null && (!languages.isEmpty())) {
            for (HMLanguage hMLanguage : languages) {
                if (hMLanguage != null && Intrinsics.areEqual(INSTANCE.getHuaMiLanguageStrByTag(hMLanguage.getLanguage()), language)) {
                    return hMLanguage;
                }
            }
        }
        return RegionUtil.isInnerCN() ? new HMLanguage(0) : new HMLanguage(2);
    }

    @NotNull
    public final String getHuaMiLanguageStrByLocale() {
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        if (ArraysKt___ArraysKt.contains(new String[]{"zh_cn", "zh_tw", "zh_hk"}, currentLocale$default)) {
            return currentLocale$default;
        }
        return RegionUtil.isInnerCN() ? "zh_cn" : "en";
    }

    @NotNull
    public final String getHuaMiLanguageStrByTag(int language) {
        switch (language) {
            case 0:
                return "zh_cn";
            case 1:
                return "zh_tw";
            case 2:
            case 24:
            case 25:
            default:
                return "en";
            case 3:
                return "es";
            case 4:
                return "ru";
            case 5:
                return "ko";
            case 6:
                return "fr";
            case 7:
                return "de";
            case 8:
                return "in";
            case 9:
                return "pl";
            case 10:
                return "it";
            case 11:
                return "ja";
            case 12:
                return "th";
            case 13:
                return "ar";
            case 14:
                return "vi";
            case 15:
                return "pt";
            case 16:
                return "nl";
            case 17:
                return "tr";
            case 18:
                return "uk";
            case 19:
                return "he";
            case 20:
                return "br";
            case 21:
                return Language.RO;
            case 22:
                return Language.CS;
            case 23:
                return Language.EL;
            case 26:
                return "fi";
            case 27:
                return "no";
            case 28:
                return "da";
            case 29:
                return m.e;
        }
    }

    public final boolean isCurrentLanguageInChina(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        SettingItemEntity settingItemValue = DeviceSettingManager.INSTANCE.getInstance().readSettingItemValue(did, "language");
        if ((settingItemValue != null ? settingItemValue.getJsonValue() : null) == null) {
            Logger.e("isCurrentLanguageInChina: not find language settings", new Object[0]);
            return true;
        }
        Object objValueToObject = settingItemValue.valueToObject(LanguageSetting.class);
        Intrinsics.checkNotNull(objValueToObject, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.LanguageSetting");
        int deviceLanguage = ((LanguageSetting) objValueToObject).getDeviceLanguage();
        return deviceLanguage == 0 || deviceLanguage == 1;
    }
}
