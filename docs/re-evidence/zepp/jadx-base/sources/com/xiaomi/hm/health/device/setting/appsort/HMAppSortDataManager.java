package com.xiaomi.hm.health.device.setting.appsort;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.appsort.utils.AppSortUpgradeKt;
import com.xiaomi.hm.health.device.setting.appsort.utils.AppSortUtilKt;
import com.xiaomi.hm.health.device.setting.appsort.utils.WorldClockUpgrageKt;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class HMAppSortDataManager {
    private static final String e = "HMAppSortDataManager";
    private static final String f = "version_";
    private static final int g = 0;
    private static final String h = "wuhan_version";
    private static volatile HMAppSortDataManager i;
    private HashMap<HMDeviceSource, SortableAppItems> a;
    private HashMap<HMDeviceSource, SortableAppItems> b;
    private AppSortCenter c = AppSortCenter.INSTANCE;
    private final Lazy<AppSortHelperApi> d = KoinJavaComponent.inject(AppSortHelperApi.class);

    private HMAppSortDataManager() {
        w();
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean A() {
        return Boolean.valueOf(HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(45));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B(int i2, Integer num) {
        return "Check version: " + i2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C() {
        return "Check version no valid version info!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D(Exception exc) {
        return "Check version error:" + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean E() {
        return Boolean.valueOf(HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(36));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean F() {
        return Boolean.valueOf(HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G(Exception exc) {
        return "initDisplayDataFromJson: " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean H() {
        return Boolean.valueOf(HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean I() {
        return Boolean.valueOf(HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(36));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean J() {
        return Boolean.valueOf(HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(45));
    }

    private static void K(boolean z, HMDisplaySetting hMDisplaySetting) {
        int index = hMDisplaySetting.getAppItemByType(HMDisplaySetting.AppTypeTempo.SETTING.getValue()).getIndex();
        if (z) {
            hMDisplaySetting.getAppItemByType(HMDisplaySetting.AppTypeTempo.ALIPAY.getValue()).setIndex(index);
            hMDisplaySetting.getAppItemByType(HMDisplaySetting.AppTypeTempo.MUSIC.getValue()).setIndex(index + 1);
        } else {
            hMDisplaySetting.getAppItemByType(HMDisplaySetting.AppTypeTempo.MUSIC.getValue()).setIndex(index);
        }
        for (int i2 = 0; i2 < HMDisplaySetting.AppTypeTempo.values().length; i2++) {
            com.xiaomi.hm.health.bt.model.appsort.AppItem appItemByType = hMDisplaySetting.getAppItemByType(i2);
            if (z) {
                if (appItemByType.getIndex() >= index && appItemByType.getType() != HMDisplaySetting.AppTypeTempo.ALIPAY.getValue() && appItemByType.getType() != HMDisplaySetting.AppTypeTempo.MUSIC.getValue()) {
                    appItemByType.setIndex(appItemByType.getIndex() + 2);
                }
            } else if (appItemByType.getIndex() >= index && appItemByType.getType() != HMDisplaySetting.AppTypeTempo.MUSIC.getValue()) {
                appItemByType.setIndex(appItemByType.getIndex() + 1);
            }
        }
    }

    private static boolean L(HMDeviceSource hMDeviceSource) {
        return Arrays.asList(HMDeviceSource.VDEVICE, HMDeviceSource.MILI_WAST, HMDeviceSource.MILI_WAST_W, HMDeviceSource.MILI_LINCS, HMDeviceSource.MILI_LINCS_W, HMDeviceSource.MILI_PRAGUE, HMDeviceSource.MILI_PRAGUE_W).contains(hMDeviceSource);
    }

    public static void clear() {
        i = null;
    }

    public static HMDisplaySetting fromJsonArray(int i2, JSONArray jSONArray) {
        return fromJsonArray(i2, jSONArray, HMDeviceSource.VDEVICE);
    }

    public static HMDisplaySetting getChaohuDefaultSetting() {
        if (shouldShowAlipay()) {
            return new HMDisplaySetting(true);
        }
        HMDisplaySetting hMDisplaySetting = new HMDisplaySetting();
        hMDisplaySetting.setType(1);
        SparseArray<com.xiaomi.hm.health.bt.model.appsort.AppItem> sparseArrayApps = hMDisplaySetting.getSparseArrayApps();
        sparseArrayApps.clear();
        HMDisplaySetting.AppType appType = HMDisplaySetting.AppType.DIAL;
        sparseArrayApps.put(appType.getValue(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType.getValue(), 0, true));
        HMDisplaySetting.AppType appType2 = HMDisplaySetting.AppType.STATUS;
        sparseArrayApps.put(appType2.getValue(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType2.getValue(), 1, true));
        HMDisplaySetting.AppType appType3 = HMDisplaySetting.AppType.SPORT;
        sparseArrayApps.put(appType3.getValue(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType3.getValue(), 2, true));
        HMDisplaySetting.AppType appType4 = HMDisplaySetting.AppType.WEATHER;
        sparseArrayApps.put(appType4.getValue(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType4.getValue(), 3, true));
        HMDisplaySetting.AppType appType5 = HMDisplaySetting.AppType.ALARM;
        sparseArrayApps.put(appType5.getValue(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType5.getValue(), 4, true));
        HMDisplaySetting.AppType appType6 = HMDisplaySetting.AppType.TIMER;
        sparseArrayApps.put(appType6.getValue(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType6.getValue(), 5, true));
        HMDisplaySetting.AppType appType7 = HMDisplaySetting.AppType.COMPASS;
        sparseArrayApps.put(appType7.getValue(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType7.getValue(), 6, true));
        HMDisplaySetting.AppType appType8 = HMDisplaySetting.AppType.SETTING;
        sparseArrayApps.put(appType8.getValue(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType8.getValue(), 7, true));
        HMDisplaySetting.AppType appType9 = HMDisplaySetting.AppType.ALIPAY;
        com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = new com.xiaomi.hm.health.bt.model.appsort.AppItem(appType9.getValue(), 8, false);
        appItem.setUpdated(true);
        sparseArrayApps.put(appType9.getValue(), appItem);
        return hMDisplaySetting;
    }

    public static HMAppSortDataManager getInstance() {
        if (i == null) {
            synchronized (HMAppSortDataManager.class) {
                if (i == null) {
                    i = new HMAppSortDataManager();
                }
            }
        }
        return i;
    }

    public static SortableAppItems getMiliProDisplaySetting(SortableAppItems sortableAppItems, int i2) {
        HMLog.d(e, "proDisplay: " + i2, new Object[0]);
        com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = new com.xiaomi.hm.health.bt.model.appsort.AppItem(0, -1, false);
        appItem.setEnable(true);
        sortableAppItems.addAppItem(appItem);
        for (int i3 = 1; i3 < HMDisplaySetting.AppTypeMiliPro.values().length; i3++) {
            com.xiaomi.hm.health.bt.model.appsort.AppItem appItem2 = new com.xiaomi.hm.health.bt.model.appsort.AppItem(i3, -1, false);
            appItem2.setEnable(((1 << (i3 + (-1))) & i2) != 0);
            sortableAppItems.addAppItem(appItem2);
        }
        return sortableAppItems;
    }

    private static void l(SortableAppItems sortableAppItems) {
        int appCount;
        HMDisplaySetting.AppTypeWuhan appTypeWuhan = HMDisplaySetting.AppTypeWuhan.NOTIFICATION;
        com.xiaomi.hm.health.bt.model.appsort.AppItem appItemByType = sortableAppItems.getAppItemByType(appTypeWuhan.getValue());
        HMDisplaySetting.AppTypeWuhan appTypeWuhan2 = HMDisplaySetting.AppTypeWuhan.SETTING;
        com.xiaomi.hm.health.bt.model.appsort.AppItem appItemByType2 = sortableAppItems.getAppItemByType(appTypeWuhan2.getValue());
        int index = appItemByType.getIndex();
        int index2 = appItemByType2.getIndex();
        if (appItemByType.isEnable()) {
            if (index < index2) {
                m(sortableAppItems, appTypeWuhan.getValue());
                return;
            } else {
                m(sortableAppItems, appTypeWuhan2.getValue());
                return;
            }
        }
        if (appItemByType2.isEnable()) {
            m(sortableAppItems, appTypeWuhan2.getValue());
            return;
        }
        if (appItemByType2.isEnable()) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= sortableAppItems.getAppCount()) {
                appCount = -1;
                break;
            }
            com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = sortableAppItems.getAppItem(i2);
            if (!appItem.isEnable()) {
                appCount = appItem.getType();
                break;
            }
            i2++;
        }
        if (appCount == -1) {
            appCount = sortableAppItems.getAppCount();
        }
        m(sortableAppItems, appCount);
    }

    private static void m(SortableAppItems sortableAppItems, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < sortableAppItems.getAppCount(); i3++) {
            arrayList.add(sortableAppItems.getAppItem(i3));
        }
        Collections.sort(arrayList, new Comparator() { // from class: sj2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HMAppSortDataManager.z((AppItem) obj, (AppItem) obj2);
            }
        });
        int i4 = 0;
        int index = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = (com.xiaomi.hm.health.bt.model.appsort.AppItem) arrayList.get(i5);
            if (appItem.getType() != HMDisplaySetting.AppTypeWuhan.SPORT.getValue()) {
                appItem.setIndex(i4);
                i4++;
            }
            if (appItem.getType() == i2) {
                index = appItem.getIndex();
            }
        }
        for (int i6 = 0; i6 < sortableAppItems.getAppCount(); i6++) {
            com.xiaomi.hm.health.bt.model.appsort.AppItem appItem2 = sortableAppItems.getAppItem(i6);
            if (appItem2.getIndex() >= index) {
                appItem2.setIndex(appItem2.getIndex() + 1);
            }
        }
        com.xiaomi.hm.health.bt.model.appsort.AppItem appItemByType = sortableAppItems.getAppItemByType(HMDisplaySetting.AppTypeWuhan.SPORT.getValue());
        appItemByType.setEnable(true);
        appItemByType.setIndex(index);
    }

    private boolean n(@NonNull AppSortMapFactory appSortMapFactory, @NonNull HMDeviceSource hMDeviceSource) {
        final Integer defaultVersion = appSortMapFactory.getDefaultVersion();
        if (defaultVersion == null) {
            return false;
        }
        try {
            try {
                final int i2 = new JSONObject(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_APP_SORT_CONFIG, null)).getInt(r(hMDeviceSource));
                HMLog.info(e, new Function0() { // from class: uj2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMAppSortDataManager.B(i2, defaultVersion);
                    }
                });
                return i2 < defaultVersion.intValue();
            } catch (Exception unused) {
                HMLog.info(e, new Function0() { // from class: bk2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMAppSortDataManager.C();
                    }
                });
                return true;
            }
        } catch (Exception e2) {
            HMLog.info(e, new Function0() { // from class: vj2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMAppSortDataManager.D(e2);
                }
            });
            return false;
        }
    }

    private static HMDisplaySetting o(int i2, JSONArray jSONArray) {
        int length;
        HMDisplaySetting hMDisplaySetting = new HMDisplaySetting(i2, false);
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                int i4 = jSONObject.getInt("type");
                if (y(i2, i4)) {
                    int i5 = jSONObject.getInt("index");
                    boolean z = jSONObject.getBoolean("enable");
                    boolean zOptBoolean = jSONObject.optBoolean(SecondaryScreen.KEY_UPDATED, false);
                    com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = new com.xiaomi.hm.health.bt.model.appsort.AppItem(i4, i5, z);
                    appItem.setUpdated(zOptBoolean);
                    hMDisplaySetting.addAppItem(appItem);
                }
            } catch (Exception e2) {
                HMLog.d(e, "fromDisplaySettingArray Exception:" + e2.getMessage(), new Object[0]);
            }
        }
        if (i2 == 2) {
            int length2 = HMDisplaySetting.AppTypeTempo.values().length;
            int length3 = length2 - jSONArray.length();
            if (length3 == 2) {
                com.xiaomi.hm.health.bt.model.appsort.AppItem appItem2 = new com.xiaomi.hm.health.bt.model.appsort.AppItem(HMDisplaySetting.AppTypeTempo.ALIPAY.getValue(), length2 - 2, shouldShowAlipay());
                appItem2.setUpdated(true);
                hMDisplaySetting.addAppItem(appItem2);
                hMDisplaySetting.addAppItem(new com.xiaomi.hm.health.bt.model.appsort.AppItem(HMDisplaySetting.AppTypeTempo.MUSIC.getValue(), length2 - 1, true));
                K(shouldShowAlipay(), hMDisplaySetting);
            } else if (length3 == 1) {
                hMDisplaySetting.addAppItem(new com.xiaomi.hm.health.bt.model.appsort.AppItem(HMDisplaySetting.AppTypeTempo.MUSIC.getValue(), length2 - 1, true));
                K(false, hMDisplaySetting);
            }
        }
        if (i2 == 1 && jSONArray.length() < (length = HMDisplaySetting.AppType.values().length)) {
            hMDisplaySetting.addAppItem(new com.xiaomi.hm.health.bt.model.appsort.AppItem(HMDisplaySetting.AppType.ALIPAY.getValue(), length - 1, shouldShowAlipay()));
        }
        return hMDisplaySetting;
    }

    private static HashMap<HMDeviceSource, HMDisplaySetting> p(String str) {
        HMDisplaySetting hMDisplaySetting;
        HMLog.d(e, "fromDisplaySettingString:" + str, new Object[0]);
        HashMap<HMDeviceSource, HMDisplaySetting> map = new HashMap<>();
        if (TextUtils.isEmpty(str)) {
            HMDisplaySetting chaohuDefaultSetting = getChaohuDefaultSetting();
            HMDisplaySetting hMDisplaySetting2 = new HMDisplaySetting(2, true);
            HMDisplaySetting.AppType appType = HMDisplaySetting.AppType.ALIPAY;
            hMDisplaySetting2.getAppItemByType(appType.getValue()).setUpdated(true);
            hMDisplaySetting2.enableAppItemByType(appType.getValue(), shouldShowAlipay());
            HMDisplaySetting hMDisplaySetting3 = new HMDisplaySetting(3, true);
            map.put(HMDeviceSource.MILI_PEYTO, chaohuDefaultSetting);
            map.put(HMDeviceSource.MILI_TEMPO, hMDisplaySetting2);
            map.put(HMDeviceSource.MILI_WUHAN, hMDisplaySetting3);
            return map;
        }
        try {
            Object objNextValue = new JSONTokener(str).nextValue();
            if (objNextValue instanceof JSONArray) {
                HMDisplaySetting hMDisplaySettingO = o(1, new JSONArray(str));
                HMDisplaySetting.AppType appType2 = HMDisplaySetting.AppType.ALIPAY;
                hMDisplaySettingO.enableAppItemByType(appType2.getValue(), shouldShowAlipay());
                hMDisplaySettingO.getAppItemByType(appType2.getValue()).setUpdated(true);
                map.put(HMDeviceSource.MILI_PEYTO, hMDisplaySettingO);
                HMDisplaySetting hMDisplaySetting4 = new HMDisplaySetting(2, true);
                hMDisplaySetting4.enableAppItemByType(appType2.getValue(), shouldShowAlipay());
                hMDisplaySetting4.getAppItemByType(appType2.getValue()).setUpdated(true);
                map.put(HMDeviceSource.MILI_TEMPO, hMDisplaySetting4);
                map.put(HMDeviceSource.MILI_WUHAN, new HMDisplaySetting(3, true));
            } else if (objNextValue instanceof JSONObject) {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.xiaomi.hm.health.device.firmware.a.d);
                HMDisplaySetting hMDisplaySetting5 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) ? new HMDisplaySetting(true) : o(1, jSONArrayOptJSONArray);
                HMDisplaySetting.AppType appType3 = HMDisplaySetting.AppType.ALIPAY;
                if (hMDisplaySetting5.getAppItemByType(appType3.getValue()).isUpdated()) {
                    HMLog.d(e, "已经升级上来了", new Object[0]);
                } else {
                    HMLog.d(e, "老用户升级到新版本", new Object[0]);
                    hMDisplaySetting5.enableAppItemByType(appType3.getValue(), shouldShowAlipay());
                    hMDisplaySetting5.getAppItemByType(appType3.getValue()).setUpdated(true);
                }
                map.put(HMDeviceSource.MILI_PEYTO, hMDisplaySetting5);
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(com.xiaomi.hm.health.device.firmware.a.f);
                HMDisplaySetting hMDisplaySetting6 = (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) ? new HMDisplaySetting(2, true) : o(2, jSONArrayOptJSONArray2);
                if (hMDisplaySetting6.getAppItemByType(appType3.getValue()).isUpdated()) {
                    HMLog.d(e, "已经升级上来了", new Object[0]);
                } else {
                    HMLog.d(e, "tempo 老用户升级到新版本", new Object[0]);
                    hMDisplaySetting6.enableAppItemByType(appType3.getValue(), shouldShowAlipay());
                    hMDisplaySetting6.getAppItemByType(appType3.getValue()).setUpdated(true);
                }
                map.put(HMDeviceSource.MILI_TEMPO, hMDisplaySetting6);
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(com.xiaomi.hm.health.device.firmware.a.b);
                if (jSONObject.optInt(h, -1) < 0) {
                    HMLog.d(e, "wuhan sort info need update", new Object[0]);
                    map.put(HMDeviceSource.MILI_WUHAN, new HMDisplaySetting(3, true));
                } else {
                    if (jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() <= 0) {
                        hMDisplaySetting = new HMDisplaySetting(3, true);
                    } else {
                        hMDisplaySetting = o(3, jSONArrayOptJSONArray3);
                        HMDisplaySetting.AppTypeWuhan appTypeWuhan = HMDisplaySetting.AppTypeWuhan.SPORT;
                        if (hMDisplaySetting.getAppItemByType(appTypeWuhan.getValue()) == null) {
                            com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = new com.xiaomi.hm.health.bt.model.appsort.AppItem(appTypeWuhan.getValue(), HMDisplaySetting.AppTypeWuhan.values().length - 1, false);
                            appItem.setUpdated(true);
                            hMDisplaySetting.addAppItem(appItem);
                        }
                        l(hMDisplaySetting);
                    }
                    map.put(HMDeviceSource.MILI_WUHAN, hMDisplaySetting);
                }
            }
        } catch (Exception e2) {
            HMLog.d(e, "fromDisplaySettingString Exception:" + e2.getMessage(), new Object[0]);
        }
        return map;
    }

    private HMDisplaySetting q(int i2) {
        SparseArray<com.xiaomi.hm.health.bt.model.appsort.AppItem> sparseArrayApps;
        com.xiaomi.hm.health.bt.model.appsort.AppItem appItem;
        HMDisplaySetting hMDisplaySetting = new HMDisplaySetting(i2, true);
        if (HMPersonInfo.getInstance().getUserInfo().getGender() == 0 || (appItem = (sparseArrayApps = hMDisplaySetting.getSparseArrayApps()).get(29)) == null) {
            return hMDisplaySetting;
        }
        int index = appItem.getIndex();
        appItem.setEnable(false);
        appItem.setIndex(sparseArrayApps.size() - 1);
        sparseArrayApps.remove(29);
        for (int i3 = 0; i3 < sparseArrayApps.size(); i3++) {
            com.xiaomi.hm.health.bt.model.appsort.AppItem appItemValueAt = sparseArrayApps.valueAt(i3);
            if (appItemValueAt.getIndex() > index) {
                appItemValueAt.setIndex(appItemValueAt.getIndex() - 1);
            }
        }
        sparseArrayApps.put(29, appItem);
        return hMDisplaySetting;
    }

    private static String r(@NonNull HMDeviceSource hMDeviceSource) {
        return f + hMDeviceSource.getValue();
    }

    private HMDisplaySetting s(int i2) {
        return q(i2);
    }

    public static boolean shouldShowAlipay() {
        return !DeviceXFunctionsKt.getAppStateApi().isHK() && Language.isChineseOrEng();
    }

    private void t(HashMap<HMDeviceSource, SortableAppItems> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TOKYO;
        if (map.get(hMDeviceSource) == null) {
            map.put(hMDeviceSource, new HMDisplaySetting(53, true));
        }
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_DTH;
        if (map.get(hMDeviceSource2) == null) {
            map.put(hMDeviceSource2, new HMDisplaySetting(4, true));
        }
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_BEATS;
        if (map.get(hMDeviceSource3) == null) {
            HMDisplaySetting hMDisplaySetting = new HMDisplaySetting(5, true);
            HMDisplaySetting.AppTypeBeats appTypeBeats = HMDisplaySetting.AppTypeBeats.ALIPAY;
            hMDisplaySetting.enableAppItemByType(appTypeBeats.getValue(), shouldShowAlipay());
            hMDisplaySetting.getAppItemByType(appTypeBeats.getValue()).setUpdated(true);
            map.put(hMDeviceSource3, hMDisplaySetting);
        }
        HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_BEATS_W;
        if (map.get(hMDeviceSource4) == null) {
            HMDisplaySetting hMDisplaySetting2 = new HMDisplaySetting(22, true);
            HMDisplaySetting.AppTypeBeatsW appTypeBeatsW = HMDisplaySetting.AppTypeBeatsW.ALIPAY;
            hMDisplaySetting2.enableAppItemByType(appTypeBeatsW.getValue(), shouldShowAlipay());
            hMDisplaySetting2.getAppItemByType(appTypeBeatsW.getValue()).setUpdated(true);
            map.put(hMDeviceSource4, hMDisplaySetting2);
        }
        HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_BEATS_P;
        if (map.get(hMDeviceSource5) == null) {
            HMDisplaySetting hMDisplaySetting3 = new HMDisplaySetting(6, true);
            HMDisplaySetting.AppTypeBeatsP appTypeBeatsP = HMDisplaySetting.AppTypeBeatsP.ALIPAY;
            hMDisplaySetting3.enableAppItemByType(appTypeBeatsP.getValue(), shouldShowAlipay());
            hMDisplaySetting3.getAppItemByType(appTypeBeatsP.getValue()).setUpdated(true);
            map.put(hMDeviceSource5, hMDisplaySetting3);
        }
        HMDeviceSource hMDeviceSource6 = HMDeviceSource.MILI_CHONGQING;
        if (map.get(hMDeviceSource6) == null) {
            map.put(hMDeviceSource6, new HMDisplaySetting(7, true));
        }
        if (map.get(HMDeviceSource.MILI_WUHAN) == null || map.get(HMDeviceSource.MILI_PEYTO) == null || map.get(HMDeviceSource.MILI_TEMPO) == null) {
            map.putAll(p(HMPersonInfo.getInstance().getMiliConfig().getWatchApps()));
        }
        HMDeviceSource hMDeviceSource7 = HMDeviceSource.MILI_PRO;
        if (map.get(hMDeviceSource7) == null) {
            map.put(hMDeviceSource7, getMiliProDisplaySetting(new HMDisplaySetting(8, false), HMPersonInfo.getInstance().getMiliConfig().getProDisplay()));
        }
        HMDeviceSource hMDeviceSource8 = HMDeviceSource.MILI_CINCO;
        if (map.get(hMDeviceSource8) == null) {
            map.put(hMDeviceSource8, new HMDisplaySetting(9, true));
        }
        HMDeviceSource hMDeviceSource9 = HMDeviceSource.MILI_CINCO_L;
        if (map.get(hMDeviceSource9) == null) {
            map.put(hMDeviceSource9, new HMDisplaySetting(10, true));
        }
        HMDeviceSource hMDeviceSource10 = HMDeviceSource.MILI_TONLESAP;
        if (map.get(hMDeviceSource10) == null) {
            map.put(hMDeviceSource10, new HMDisplaySetting(11, true));
        }
        HMDeviceSource hMDeviceSource11 = HMDeviceSource.MILI_TONLESAP_O;
        if (map.get(hMDeviceSource11) == null) {
            map.put(hMDeviceSource11, new HMDisplaySetting(13, true));
        }
        HMDeviceSource hMDeviceSource12 = HMDeviceSource.MILI_TONLESAP_L;
        if (map.get(hMDeviceSource12) == null) {
            map.put(hMDeviceSource12, new HMDisplaySetting(12, true));
        }
        HMDeviceSource hMDeviceSource13 = HMDeviceSource.MILI_TONLESAP_OL;
        if (map.get(hMDeviceSource13) == null) {
            map.put(hMDeviceSource13, new HMDisplaySetting(14, true));
        }
        HMDeviceSource hMDeviceSource14 = HMDeviceSource.MILI_RIO;
        if (map.get(hMDeviceSource14) == null) {
            map.put(hMDeviceSource14, new HMDisplaySetting(15, true));
        }
        HMDeviceSource hMDeviceSource15 = HMDeviceSource.MILI_PEYTO_L;
        if (map.get(hMDeviceSource15) == null) {
            map.put(hMDeviceSource15, new HMDisplaySetting(16, true));
        }
        HMDeviceSource hMDeviceSource16 = HMDeviceSource.MILI_PEYTO_WL;
        if (map.get(hMDeviceSource16) == null) {
            map.put(hMDeviceSource16, new HMDisplaySetting(21, true));
        }
        HMDeviceSource hMDeviceSource17 = HMDeviceSource.MILI_PYH;
        if (map.get(hMDeviceSource17) == null) {
            map.put(hMDeviceSource17, new HMDisplaySetting(17, true));
        }
        HMDeviceSource hMDeviceSource18 = HMDeviceSource.MILI_PYH_W;
        if (map.get(hMDeviceSource18) == null) {
            map.put(hMDeviceSource18, new HMDisplaySetting(18, true));
        }
        HMDeviceSource hMDeviceSource19 = HMDeviceSource.MILI_FALCON;
        if (map.get(hMDeviceSource19) == null) {
            map.put(hMDeviceSource19, new HMDisplaySetting(19, true));
        }
        HMDeviceSource hMDeviceSource20 = HMDeviceSource.MILI_FALCON_W;
        if (map.get(hMDeviceSource20) == null) {
            map.put(hMDeviceSource20, new HMDisplaySetting(20, true));
        }
        HMDeviceSource hMDeviceSource21 = HMDeviceSource.MILI_FALCON_DISNEY;
        if (map.get(hMDeviceSource21) == null) {
            map.put(hMDeviceSource21, new HMDisplaySetting(36, true));
        }
        HMDeviceSource hMDeviceSource22 = HMDeviceSource.MILI_FALCON_L;
        if (map.get(hMDeviceSource22) == null) {
            map.put(hMDeviceSource22, new HMDisplaySetting(27, true));
        }
        HMDeviceSource hMDeviceSource23 = HMDeviceSource.MILI_FALCON_WL;
        if (map.get(hMDeviceSource23) == null) {
            map.put(hMDeviceSource23, new HMDisplaySetting(28, true));
        }
        HMDeviceSource hMDeviceSource24 = HMDeviceSource.MILI_HAWK;
        if (map.get(hMDeviceSource24) == null) {
            map.put(hMDeviceSource24, new HMDisplaySetting(23, true));
        }
        HMDeviceSource hMDeviceSource25 = HMDeviceSource.MILI_HAWK_W;
        if (map.get(hMDeviceSource25) == null) {
            map.put(hMDeviceSource25, new HMDisplaySetting(25, true));
        }
        HMDeviceSource hMDeviceSource26 = HMDeviceSource.MILI_HAWK_L;
        if (map.get(hMDeviceSource26) == null) {
            map.put(hMDeviceSource26, new HMDisplaySetting(24, true));
        }
        HMDeviceSource hMDeviceSource27 = HMDeviceSource.MILI_HAWK_WL;
        if (map.get(hMDeviceSource27) == null) {
            map.put(hMDeviceSource27, new HMDisplaySetting(26, true));
        }
        HMDeviceSource hMDeviceSource28 = HMDeviceSource.MILI_HAWK_SWK;
        if (map.get(hMDeviceSource28) == null) {
            map.put(hMDeviceSource28, new HMDisplaySetting(34, true));
        }
        HMDeviceSource hMDeviceSource29 = HMDeviceSource.MILI_HAWK_SWK_W;
        if (map.get(hMDeviceSource29) == null) {
            map.put(hMDeviceSource29, new HMDisplaySetting(35, true));
        }
        HMDeviceSource hMDeviceSource30 = HMDeviceSource.MILI_KESTREL;
        if (map.get(hMDeviceSource30) == null) {
            map.put(hMDeviceSource30, new HMDisplaySetting(29, true));
        }
        HMDeviceSource hMDeviceSource31 = HMDeviceSource.MILI_KESTREL_W;
        if (map.get(hMDeviceSource31) == null) {
            map.put(hMDeviceSource31, new HMDisplaySetting(30, true));
        }
        HMDeviceSource hMDeviceSource32 = HMDeviceSource.MILI_KESTREL_L;
        if (map.get(hMDeviceSource32) == null) {
            map.put(hMDeviceSource32, new HMDisplaySetting(31, true));
        }
        HMDeviceSource hMDeviceSource33 = HMDeviceSource.MILI_KESTREL_WL;
        if (map.get(hMDeviceSource33) == null) {
            map.put(hMDeviceSource33, new HMDisplaySetting(32, true));
        }
        HMDeviceSource hMDeviceSource34 = HMDeviceSource.MILI_ATHENS;
        if (map.get(hMDeviceSource34) == null) {
            map.put(hMDeviceSource34, new HMDisplaySetting(33, true));
        }
        HMDeviceSource hMDeviceSource35 = HMDeviceSource.MILI_VULTURE;
        if (map.get(hMDeviceSource35) == null) {
            map.put(hMDeviceSource35, new HMDisplaySetting(37, true));
        }
        HMDeviceSource hMDeviceSource36 = HMDeviceSource.MILI_VENICE;
        if (map.get(hMDeviceSource36) == null) {
            map.put(hMDeviceSource36, new HMDisplaySetting(51, true));
        }
        HMDeviceSource hMDeviceSource37 = HMDeviceSource.MILI_VENICE_W;
        if (map.get(hMDeviceSource37) == null) {
            map.put(hMDeviceSource37, new HMDisplaySetting(52, true));
        }
        HMDeviceSource hMDeviceSource38 = HMDeviceSource.MILI_ANETO;
        if (map.get(hMDeviceSource38) == null) {
            map.put(hMDeviceSource38, new HMDisplaySetting(41, true));
        }
        HMDeviceSource hMDeviceSource39 = HMDeviceSource.MILI_KONGMING;
        if (map.get(hMDeviceSource39) == null) {
            map.put(hMDeviceSource39, q(42));
        }
        HMDeviceSource hMDeviceSource40 = HMDeviceSource.MILI_KONGMING_L;
        if (map.get(hMDeviceSource40) == null) {
            map.put(hMDeviceSource40, q(43));
        }
        HMDeviceSource hMDeviceSource41 = HMDeviceSource.MILI_KONGMING_PRO;
        if (map.get(hMDeviceSource41) == null) {
            map.put(hMDeviceSource41, q(44));
        }
        HMDeviceSource hMDeviceSource42 = HMDeviceSource.MILI_YORK;
        if (map.get(hMDeviceSource42) == null) {
            map.put(hMDeviceSource42, s(45));
        }
    }

    public static String toDisplaySettingJsonString(HashMap<HMDeviceSource, SortableAppItems> map) {
        JSONObject jSONObject = null;
        if (map == null || map.size() == 0) {
            return null;
        }
        try {
            jSONObject = new JSONObject(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_APP_SORT_CONFIG, null));
        } catch (Exception unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        for (SortableAppItems sortableAppItems : map.values()) {
            if (sortableAppItems.getAppCount() != 0) {
                try {
                    HMDeviceSource source = sortableAppItems.getSource();
                    if (source == HMDeviceSource.VDEVICE) {
                        int type = sortableAppItems.getType();
                        if (type == 41) {
                            source = HMDeviceSource.MILI_ANETO;
                        } else if (type == 45) {
                            source = HMDeviceSource.MILI_YORK;
                        } else if (type == 51) {
                            source = HMDeviceSource.MILI_VENICE;
                        } else if (type != 53) {
                            switch (type) {
                                case 1:
                                    source = HMDeviceSource.MILI_PEYTO;
                                    break;
                                case 2:
                                    source = HMDeviceSource.MILI_TEMPO;
                                    break;
                                case 3:
                                    source = HMDeviceSource.MILI_WUHAN;
                                    break;
                                case 4:
                                    source = HMDeviceSource.MILI_DTH;
                                    break;
                                case 5:
                                    source = HMDeviceSource.MILI_BEATS;
                                    break;
                                case 6:
                                    source = HMDeviceSource.MILI_BEATS_P;
                                    break;
                                case 7:
                                    source = HMDeviceSource.MILI_CHONGQING;
                                    break;
                                case 8:
                                    source = HMDeviceSource.MILI_PRO;
                                    break;
                                case 9:
                                    source = HMDeviceSource.MILI_CINCO;
                                    break;
                                case 10:
                                    source = HMDeviceSource.MILI_CINCO_L;
                                    break;
                                case 11:
                                    source = HMDeviceSource.MILI_TONLESAP;
                                    break;
                                case 12:
                                    source = HMDeviceSource.MILI_TONLESAP_L;
                                    break;
                                case 13:
                                    source = HMDeviceSource.MILI_TONLESAP_O;
                                    break;
                                case 14:
                                    source = HMDeviceSource.MILI_TONLESAP_OL;
                                    break;
                                case 15:
                                    source = HMDeviceSource.MILI_RIO;
                                    break;
                                case 16:
                                    source = HMDeviceSource.MILI_PEYTO_L;
                                    break;
                                case 17:
                                    source = HMDeviceSource.MILI_PYH;
                                    break;
                                case 18:
                                    source = HMDeviceSource.MILI_PYH_W;
                                    break;
                                case 19:
                                    source = HMDeviceSource.MILI_FALCON;
                                    break;
                                case 20:
                                    source = HMDeviceSource.MILI_FALCON_W;
                                    break;
                                case 21:
                                    source = HMDeviceSource.MILI_PEYTO_WL;
                                    break;
                                case 22:
                                    source = HMDeviceSource.MILI_BEATS_W;
                                    break;
                                case 23:
                                    source = HMDeviceSource.MILI_HAWK;
                                    break;
                                case 24:
                                    source = HMDeviceSource.MILI_HAWK_L;
                                    break;
                                case 25:
                                    source = HMDeviceSource.MILI_HAWK_W;
                                    break;
                                case 26:
                                    source = HMDeviceSource.MILI_HAWK_WL;
                                    break;
                                case 27:
                                    source = HMDeviceSource.MILI_FALCON_L;
                                    break;
                                case 28:
                                    source = HMDeviceSource.MILI_FALCON_WL;
                                    break;
                                case 29:
                                    source = HMDeviceSource.MILI_KESTREL;
                                    break;
                                case 30:
                                    source = HMDeviceSource.MILI_KESTREL_W;
                                    break;
                                case 31:
                                    source = HMDeviceSource.MILI_KESTREL_L;
                                    break;
                                case 32:
                                    source = HMDeviceSource.MILI_KESTREL_WL;
                                    break;
                                case 33:
                                    source = HMDeviceSource.MILI_ATHENS;
                                    break;
                                case 34:
                                    source = HMDeviceSource.MILI_HAWK_SWK;
                                    break;
                                case 35:
                                    source = HMDeviceSource.MILI_HAWK_SWK_W;
                                    break;
                                case 36:
                                    source = HMDeviceSource.MILI_FALCON_DISNEY;
                                    break;
                                case 37:
                                    source = HMDeviceSource.MILI_VULTURE;
                                    break;
                            }
                        } else {
                            source = HMDeviceSource.MILI_TOKYO;
                        }
                    }
                    if (!L(source)) {
                        String strValueOf = source == HMDeviceSource.MILI_PRO ? "proDisplay" : String.valueOf(source.getValue());
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < sortableAppItems.getAppCount(); i2++) {
                            com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = sortableAppItems.getAppItem(i2);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", appItem.getType());
                            jSONObject3.put("index", appItem.getIndex());
                            jSONObject3.put("enable", appItem.isEnable());
                            jSONObject3.put(SecondaryScreen.KEY_UPDATED, appItem.isUpdated());
                            jSONObject3.put(SecondaryScreen.KEY_PARENT, appItem.getParentType());
                            jSONArray.put(jSONObject3);
                        }
                        String strR = r(source);
                        if (jSONObject != null && jSONObject.has(strR)) {
                            jSONObject2.put(strR, jSONObject.get(strR));
                        }
                        jSONObject2.put(strValueOf, jSONArray);
                    }
                } catch (Exception e2) {
                    HMLog.d(e, e2.toString(), new Object[0]);
                }
            }
        }
        HMLog.d(e, "toDisplaySettingJsonString:" + jSONObject2.toString(), new Object[0]);
        return jSONObject2.toString();
    }

    public static byte toProDisplay(SortableAppItems sortableAppItems) {
        byte b = 0;
        for (int i2 = 1; i2 < HMDisplaySetting.AppTypeMiliPro.values().length; i2++) {
            b = (byte) (b | (sortableAppItems.getAppItemByType(i2).isEnable() ? 1 << (i2 - 1) : 0));
        }
        HMLog.d(e, "proDisplay: " + ((int) b), new Object[0]);
        return b;
    }

    private void u() {
        if (this.b != null) {
            return;
        }
        HashMap<HMDeviceSource, SortableAppItems> map = new HashMap<>();
        this.b = map;
        try {
            t(map);
            for (AppSortMapFactory appSortMapFactory : this.c.loadSortFactories()) {
                this.b.put(appSortMapFactory.getSource(), appSortMapFactory.createDisplayDefault());
            }
        } catch (Exception e2) {
            HMLog.i(e, "initDefaultDisplaySetting: " + e2.toString(), new Object[0]);
        }
    }

    private void v(HashMap<HMDeviceSource, SortableAppItems> map) {
        String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_APP_SORT_CONFIG, null);
        HMLog.i(e, "AppSetting: " + property, new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject(property);
            HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TOKYO;
            map.put(hMDeviceSource, fromJsonArray(53, jSONObject.optJSONArray(String.valueOf(hMDeviceSource.getValue()))));
            HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_DTH;
            map.put(hMDeviceSource2, fromJsonArray(4, jSONObject.optJSONArray(String.valueOf(hMDeviceSource2.getValue()))));
            HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_BEATS;
            map.put(hMDeviceSource3, fromJsonArray(5, jSONObject.optJSONArray(String.valueOf(hMDeviceSource3.getValue()))));
            HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_BEATS_W;
            map.put(hMDeviceSource4, fromJsonArray(22, jSONObject.optJSONArray(String.valueOf(hMDeviceSource4.getValue()))));
            HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_BEATS_P;
            map.put(hMDeviceSource5, fromJsonArray(6, jSONObject.optJSONArray(String.valueOf(hMDeviceSource5.getValue()))));
            HMDeviceSource hMDeviceSource6 = HMDeviceSource.MILI_CHONGQING;
            map.put(hMDeviceSource6, fromJsonArray(7, jSONObject.optJSONArray(String.valueOf(hMDeviceSource6.getValue()))));
            HMDeviceSource hMDeviceSource7 = HMDeviceSource.MILI_WUHAN;
            map.put(hMDeviceSource7, fromJsonArray(3, jSONObject.optJSONArray(String.valueOf(hMDeviceSource7.getValue()))));
            HMDeviceSource hMDeviceSource8 = HMDeviceSource.MILI_TEMPO;
            map.put(hMDeviceSource8, fromJsonArray(2, jSONObject.optJSONArray(String.valueOf(hMDeviceSource8.getValue()))));
            HMDeviceSource hMDeviceSource9 = HMDeviceSource.MILI_PEYTO;
            map.put(hMDeviceSource9, fromJsonArray(1, jSONObject.optJSONArray(String.valueOf(hMDeviceSource9.getValue()))));
            HMDeviceSource hMDeviceSource10 = HMDeviceSource.MILI_PEYTO_L;
            map.put(hMDeviceSource10, fromJsonArray(16, jSONObject.optJSONArray(String.valueOf(hMDeviceSource10.getValue()))));
            HMDeviceSource hMDeviceSource11 = HMDeviceSource.MILI_PEYTO_WL;
            map.put(hMDeviceSource11, fromJsonArray(21, jSONObject.optJSONArray(String.valueOf(hMDeviceSource11.getValue()))));
            map.put(HMDeviceSource.MILI_PRO, fromJsonArray(8, jSONObject.optJSONArray("proDisplay")));
            HMDeviceSource hMDeviceSource12 = HMDeviceSource.MILI_CINCO;
            map.put(hMDeviceSource12, fromJsonArray(9, jSONObject.optJSONArray(String.valueOf(hMDeviceSource12.getValue()))));
            HMDeviceSource hMDeviceSource13 = HMDeviceSource.MILI_CINCO_L;
            map.put(hMDeviceSource13, fromJsonArray(10, jSONObject.optJSONArray(String.valueOf(hMDeviceSource13.getValue()))));
            HMDeviceSource hMDeviceSource14 = HMDeviceSource.MILI_TONLESAP_OL;
            map.put(hMDeviceSource14, fromJsonArray(14, jSONObject.optJSONArray(String.valueOf(hMDeviceSource14.getValue()))));
            HMDeviceSource hMDeviceSource15 = HMDeviceSource.MILI_TONLESAP;
            map.put(hMDeviceSource15, fromJsonArray(11, jSONObject.optJSONArray(String.valueOf(hMDeviceSource15.getValue()))));
            HMDeviceSource hMDeviceSource16 = HMDeviceSource.MILI_TONLESAP_L;
            map.put(hMDeviceSource16, fromJsonArray(12, jSONObject.optJSONArray(String.valueOf(hMDeviceSource16.getValue()))));
            HMDeviceSource hMDeviceSource17 = HMDeviceSource.MILI_TONLESAP_O;
            map.put(hMDeviceSource17, fromJsonArray(13, jSONObject.optJSONArray(String.valueOf(hMDeviceSource17.getValue()))));
            HMDeviceSource hMDeviceSource18 = HMDeviceSource.MILI_RIO;
            map.put(hMDeviceSource18, fromJsonArray(15, jSONObject.optJSONArray(String.valueOf(hMDeviceSource18.getValue()))));
            HMDeviceSource hMDeviceSource19 = HMDeviceSource.MILI_PYH;
            map.put(hMDeviceSource19, fromJsonArray(17, jSONObject.optJSONArray(String.valueOf(hMDeviceSource19.getValue()))));
            HMDeviceSource hMDeviceSource20 = HMDeviceSource.MILI_PYH_W;
            map.put(hMDeviceSource20, fromJsonArray(18, jSONObject.optJSONArray(String.valueOf(hMDeviceSource20.getValue()))));
            HMDeviceSource hMDeviceSource21 = HMDeviceSource.MILI_FALCON;
            map.put(hMDeviceSource21, fromJsonArray(19, jSONObject.optJSONArray(String.valueOf(hMDeviceSource21.getValue()))));
            HMDeviceSource hMDeviceSource22 = HMDeviceSource.MILI_FALCON_DISNEY;
            map.put(hMDeviceSource22, fromJsonArray(36, jSONObject.optJSONArray(String.valueOf(hMDeviceSource22.getValue()))));
            HMDeviceSource hMDeviceSource23 = HMDeviceSource.MILI_FALCON_W;
            map.put(hMDeviceSource23, fromJsonArray(20, jSONObject.optJSONArray(String.valueOf(hMDeviceSource23.getValue()))));
            HMDeviceSource hMDeviceSource24 = HMDeviceSource.MILI_FALCON_L;
            map.put(hMDeviceSource24, fromJsonArray(27, jSONObject.optJSONArray(String.valueOf(hMDeviceSource24.getValue()))));
            HMDeviceSource hMDeviceSource25 = HMDeviceSource.MILI_FALCON_WL;
            map.put(hMDeviceSource25, fromJsonArray(28, jSONObject.optJSONArray(String.valueOf(hMDeviceSource25.getValue()))));
            HMDeviceSource hMDeviceSource26 = HMDeviceSource.MILI_HAWK;
            map.put(hMDeviceSource26, fromJsonArray(23, jSONObject.optJSONArray(String.valueOf(hMDeviceSource26.getValue()))));
            HMDeviceSource hMDeviceSource27 = HMDeviceSource.MILI_HAWK_L;
            map.put(hMDeviceSource27, fromJsonArray(24, jSONObject.optJSONArray(String.valueOf(hMDeviceSource27.getValue()))));
            HMDeviceSource hMDeviceSource28 = HMDeviceSource.MILI_HAWK_W;
            map.put(hMDeviceSource28, fromJsonArray(25, jSONObject.optJSONArray(String.valueOf(hMDeviceSource28.getValue()))));
            HMDeviceSource hMDeviceSource29 = HMDeviceSource.MILI_HAWK_WL;
            map.put(hMDeviceSource29, fromJsonArray(26, jSONObject.optJSONArray(String.valueOf(hMDeviceSource29.getValue()))));
            HMDeviceSource hMDeviceSource30 = HMDeviceSource.MILI_HAWK_SWK;
            map.put(hMDeviceSource30, fromJsonArray(34, jSONObject.optJSONArray(String.valueOf(hMDeviceSource30.getValue()))));
            HMDeviceSource hMDeviceSource31 = HMDeviceSource.MILI_HAWK_SWK_W;
            map.put(hMDeviceSource31, fromJsonArray(35, jSONObject.optJSONArray(String.valueOf(hMDeviceSource31.getValue()))));
            HMDeviceSource hMDeviceSource32 = HMDeviceSource.MILI_KESTREL;
            map.put(hMDeviceSource32, fromJsonArray(29, jSONObject.optJSONArray(String.valueOf(hMDeviceSource32.getValue()))));
            HMDeviceSource hMDeviceSource33 = HMDeviceSource.MILI_KESTREL_L;
            map.put(hMDeviceSource33, fromJsonArray(31, jSONObject.optJSONArray(String.valueOf(hMDeviceSource33.getValue()))));
            HMDeviceSource hMDeviceSource34 = HMDeviceSource.MILI_KESTREL_W;
            map.put(hMDeviceSource34, fromJsonArray(30, jSONObject.optJSONArray(String.valueOf(hMDeviceSource34.getValue()))));
            HMDeviceSource hMDeviceSource35 = HMDeviceSource.MILI_KESTREL_WL;
            map.put(hMDeviceSource35, fromJsonArray(32, jSONObject.optJSONArray(String.valueOf(hMDeviceSource35.getValue()))));
            HMDeviceSource hMDeviceSource36 = HMDeviceSource.MILI_ATHENS;
            map.put(hMDeviceSource36, fromJsonArray(33, jSONObject.optJSONArray(String.valueOf(hMDeviceSource36.getValue()))));
            HMDeviceSource hMDeviceSource37 = HMDeviceSource.MILI_VULTURE;
            map.put(hMDeviceSource37, fromJsonArray(37, jSONObject.optJSONArray(String.valueOf(hMDeviceSource37.getValue()))));
            HMDeviceSource hMDeviceSource38 = HMDeviceSource.MILI_VENICE;
            map.put(hMDeviceSource38, fromJsonArray(51, jSONObject.optJSONArray(String.valueOf(hMDeviceSource38.getValue()))));
            HMDeviceSource hMDeviceSource39 = HMDeviceSource.MILI_VENICE_W;
            map.put(hMDeviceSource39, fromJsonArray(52, jSONObject.optJSONArray(String.valueOf(hMDeviceSource39.getValue()))));
            HMDeviceSource hMDeviceSource40 = HMDeviceSource.MILI_ANETO;
            map.put(hMDeviceSource40, fromJsonArray(41, jSONObject.optJSONArray(String.valueOf(hMDeviceSource40.getValue()))));
            HMDeviceSource hMDeviceSource41 = HMDeviceSource.MILI_YORK;
            map.put(hMDeviceSource41, fromJsonArray(45, jSONObject.optJSONArray(String.valueOf(hMDeviceSource41.getValue()))));
        } catch (Exception e2) {
            HMLog.info(e, new Function0() { // from class: wj2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMAppSortDataManager.G(e2);
                }
            });
        }
    }

    private void w() {
        if (this.a != null) {
            return;
        }
        HashMap<HMDeviceSource, SortableAppItems> map = new HashMap<>();
        this.a = map;
        v(map);
        t(this.a);
        x(this.a);
        AppSortUtilKt.upgradeTokyo(this.a);
        AppSortUtilKt.upgradeDth(this.a);
        AppSortUtilKt.upgradeTonlesapo(this.a);
        AppSortUtilKt.upgradeTonlesapol(this.a);
        AppSortHelperApi value = this.d.getValue();
        value.upgradeCincoNFC(this.a);
        value.upgradePAI(this.a);
        value.upgradePAIBeatsW(this.a);
        value.upgradeWuhanTimer(this.a);
        value.upgradeChongqingTimer(this.a);
        value.upgradePyh(this.a);
        value.upgradeFalcon(this.a);
        value.fixChaohuAppSort(this.a);
        value.fixCincoAppSort(this.a);
        value.fixCincoPAI(this.a);
        AppSortUtilKt.checkPAI(this.a);
        AppSortUtilKt.upgradeVulture(this.a);
        AppSortUpgradeKt.upgrade(this.a, AppSortUpgradeKt.getOcSources(), 28, new Function0() { // from class: ak2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMAppSortDataManager.H();
            }
        });
        AppSortUpgradeKt.upgrade(this.a, AppSortUpgradeKt.getLnSources(), 37, new Function0() { // from class: xj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMAppSortDataManager.I();
            }
        });
        AppSortUpgradeKt.upgrade(this.a, AppSortUpgradeKt.getBlancSources(), 49, new Function0() { // from class: tj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMAppSortDataManager.J();
            }
        });
        AppSortUpgradeKt.remove(this.a, AppSortUpgradeKt.getBlancWSources(), 49);
        value.fixLisbonW(this.a);
        value.fixYork(this.a);
        saveToDBAndServer();
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        HMLog.i(e, "source: " + boundDeviceSource + ", displaySetting: " + this.a.get(boundDeviceSource), new Object[0]);
    }

    private void x(HashMap<HMDeviceSource, SortableAppItems> map) {
        try {
            String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_APP_SORT_CONFIG, null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new JSONObject(property);
            } catch (Exception e2) {
                HMLog.w(e, e2, "initJsonObject", new Object[0]);
            }
            for (AppSortMapFactory appSortMapFactory : this.c.loadSortFactories()) {
                map.put(appSortMapFactory.getSource(), appSortMapFactory.createDisplaySettingFromJson(jSONObject));
            }
        } catch (Exception e3) {
            HMLog.i(e, "initNewDisplayData: " + e3.toString(), new Object[0]);
        }
    }

    private static boolean y(int i2, int i3) {
        if (i2 == 2) {
            return i3 <= HMDisplaySetting.AppTypeTempo.values().length - 1;
        }
        if (i2 == 1) {
            return i3 <= HMDisplaySetting.AppType.values().length - 1;
        }
        return i2 != 3 || i3 <= HMDisplaySetting.AppTypeWuhan.values().length - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int z(com.xiaomi.hm.health.bt.model.appsort.AppItem appItem, com.xiaomi.hm.health.bt.model.appsort.AppItem appItem2) {
        return appItem.getIndex() - appItem2.getIndex();
    }

    public void checkBlanc() {
        AppSortUpgradeKt.upgrade(this.a, AppSortUpgradeKt.getBlancSources(), 49, new Function0() { // from class: zj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMAppSortDataManager.A();
            }
        });
        AppSortUpgradeKt.remove(this.a, AppSortUpgradeKt.getBlancWSources(), 49);
        saveToDBAndServer();
    }

    public void checkGt() {
        AppSortUtilKt.checkPAI(this.a);
        saveToDBAndServer();
    }

    public void checkLN() {
        AppSortUpgradeKt.upgrade(this.a, AppSortUpgradeKt.getLnSources(), 37, new Function0() { // from class: ck2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMAppSortDataManager.E();
            }
        });
        saveToDBAndServer();
    }

    public void checkOc() {
        AppSortUpgradeKt.upgrade(this.a, AppSortUpgradeKt.getOcSources(), 28, new Function0() { // from class: yj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMAppSortDataManager.F();
            }
        });
        saveToDBAndServer();
    }

    public void checkResetDisplaySetting(@Nullable HMDeviceSource hMDeviceSource) {
        if (hMDeviceSource == null) {
            return;
        }
        AppSortMapFactory sortFactory = this.c.getSortFactory(hMDeviceSource);
        if ((ManagerFunctionsKt.getDeviceManagerApi().hasBoundAnyDevice(hMDeviceSource) || sortFactory == null || !n(sortFactory, hMDeviceSource)) ? false : true) {
            this.a.put(hMDeviceSource, sortFactory.createDisplayDefault());
            try {
                JSONObject jSONObject = new JSONObject(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_APP_SORT_CONFIG, null));
                jSONObject.put(r(hMDeviceSource), sortFactory.getDefaultVersion());
                DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_APP_SORT_CONFIG, jSONObject.toString());
            } catch (Exception unused) {
            }
            saveToDBAndServer();
        }
    }

    public void checkWorldClock() {
        WorldClockUpgrageKt.upgradeWorldClock(this.a);
        saveToDBAndServer();
    }

    public HashMap<HMDeviceSource, SortableAppItems> getDefaultDisplaySetting() {
        return this.b;
    }

    public HashMap<HMDeviceSource, SortableAppItems> getDisplaySetting() {
        return this.a;
    }

    @Nullable
    public SortableAppItems getMergedDisplaySetting(@NonNull HMDeviceSource hMDeviceSource) {
        SortableAppItems sortableAppItems = this.a.get(hMDeviceSource);
        AppSortMapFactory sortFactory = this.c.getSortFactory(hMDeviceSource);
        return (sortFactory == null || sortFactory.getMigrator() == null || sortableAppItems == null) ? sortableAppItems : sortFactory.getMigrator().migrate(sortableAppItems);
    }

    public void save(@NonNull HMDeviceSource hMDeviceSource, @NonNull SortableAppItems sortableAppItems) {
        this.a.put(hMDeviceSource, sortableAppItems);
        saveToDBAndServer();
    }

    public void saveToDBAndServer() {
        DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_APP_SORT_CONFIG, toDisplaySettingJsonString(this.a));
        DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
    }

    public boolean supportWomenHealth() {
        com.xiaomi.hm.health.bt.model.appsort.AppItem appItemByType;
        SortableAppItems sortableAppItems = this.a.get(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI));
        if (sortableAppItems == null || (appItemByType = sortableAppItems.getAppItemByType(29)) == null) {
            return false;
        }
        return appItemByType.isEnable();
    }

    public void upgradeDisplaySetting() {
        AppSortUtilKt.upgradeTokyo(this.a);
    }

    public static HMDisplaySetting fromJsonArray(int i2, JSONArray jSONArray, HMDeviceSource hMDeviceSource) {
        if (jSONArray == null) {
            return null;
        }
        HMDisplaySetting hMDisplaySetting = new HMDisplaySetting(i2, false);
        hMDisplaySetting.setSource(hMDeviceSource);
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt("index");
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("type");
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enable");
                    boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean(SecondaryScreen.KEY_UPDATED);
                    com.xiaomi.hm.health.bt.model.appsort.AppItem appItem = new com.xiaomi.hm.health.bt.model.appsort.AppItem(jSONObjectOptJSONObject.optInt(SecondaryScreen.KEY_PARENT, -1), iOptInt2, iOptInt, zOptBoolean);
                    appItem.setUpdated(zOptBoolean2);
                    hMDisplaySetting.addAppItem(appItem);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return hMDisplaySetting;
    }
}
