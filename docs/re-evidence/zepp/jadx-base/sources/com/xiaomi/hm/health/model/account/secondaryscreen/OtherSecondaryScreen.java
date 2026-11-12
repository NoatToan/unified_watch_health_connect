package com.xiaomi.hm.health.model.account.secondaryscreen;

import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.ai.speech.simplify.inject.AccessCheck;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.model.account.secondaryscreen.OtherSecondaryScreen;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class OtherSecondaryScreen extends SecondaryScreen {
    private static final String TAG = "OtherSecondaryScreen";
    private static volatile OtherSecondaryScreen sInstance;
    private Map<HMDeviceSource, List<SecondaryModel>> mDeviceSourceListHashMap = new HashMap();
    private static final Lazy<DeviceManagerApi> deviceManagerApiLazy = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<PropertyStoreApi> propertyStoreApiLazy = KoinJavaComponent.inject(PropertyStoreApi.class);
    private static final Lazy<AccessCheck> accessCheck = KoinJavaComponent.inject(AccessCheck.class);
    private static HMDeviceSource[] sSources = {HMDeviceSource.MILI_PEYTO, HMDeviceSource.MILI_PEYTO_L, HMDeviceSource.MILI_PEYTO_WL, HMDeviceSource.MILI_TEMPO, HMDeviceSource.MILI_BEATS, HMDeviceSource.MILI_BEATS_W, HMDeviceSource.MILI_BEATS_P, HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_DTH_W, HMDeviceSource.MILI_CINCO, HMDeviceSource.MILI_TONLESAP, HMDeviceSource.MILI_TONLESAP_L, HMDeviceSource.MILI_TONLESAP_O, HMDeviceSource.MILI_TONLESAP_OL, HMDeviceSource.MILI_YORK, HMDeviceSource.MILI_KONGMING, HMDeviceSource.MILI_KONGMING_L, HMDeviceSource.MILI_KONGMING_PRO, HMDeviceSource.MILI_KONGMING_PRO_L, HMDeviceSource.MILI_PANGU_L, HMDeviceSource.MILI_PANGU, HMDeviceSource.MILI_L66, HMDeviceSource.MILI_L66_AP, HMDeviceSource.MILI_L66_I, HMDeviceSource.MILI_L66_IN, HMDeviceSource.MILI_L66_NFC, HMDeviceSource.MILI_L66_NFC_I, HMDeviceSource.MILI_L66_WE};

    /* JADX INFO: renamed from: com.xiaomi.hm.health.model.account.secondaryscreen.OtherSecondaryScreen$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource = iArr;
            try {
                iArr[HMDeviceSource.MILI_PEYTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_TEMPO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_BEATS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_DTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_BEATS_W.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_DTH_W.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_BEATS_P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_CINCO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_TONLESAP_O.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_TONLESAP_OL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_TONLESAP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_KONGMING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_KONGMING_LITE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_YORK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_KONGMING_PRO_L.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_PANGU.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_PANGU_L.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_L66.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_L66_AP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_L66_I.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_L66_IN.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_L66_WE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_L66_NFC.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_L66_NFC_I.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    private OtherSecondaryScreen() {
        HMDeviceSource[] hMDeviceSourceArr;
        String property = propertyStoreApiLazy.getValue().getProperty(Property.PROPERTY_SECONDARY_SCREEN, null);
        HMLog.i(TAG, "config: " + property, new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject(property);
            HMDeviceSource[] hMDeviceSourceArr2 = sSources;
            int length = hMDeviceSourceArr2.length;
            int i = 0;
            while (i < length) {
                HMDeviceSource hMDeviceSource = hMDeviceSourceArr2[i];
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(String.valueOf(hMDeviceSource.getValue()));
                if (jSONArrayOptJSONArray == null) {
                    hMDeviceSourceArr = hMDeviceSourceArr2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                        if (HMDeviceConfig.isSupportNewProtocal(hMDeviceSource)) {
                            arrayList.add(new SecondaryModel(fixParentType(hMDeviceSource, jSONObject2.optInt(SecondaryScreen.KEY_PARENT)), jSONObject2.optInt("type"), jSONObject2.optBoolean("enable"), jSONObject2.getInt("index"), true));
                        } else {
                            arrayList.add(new SecondaryModel(jSONObject2.optInt("type", 0), jSONObject2.optBoolean("enable", false), jSONObject2.optInt("index", 0), jSONObject2.optBoolean(SecondaryScreen.KEY_UPDATED, false)));
                        }
                        i2++;
                        hMDeviceSourceArr2 = hMDeviceSourceArr2;
                    }
                    hMDeviceSourceArr = hMDeviceSourceArr2;
                    this.mDeviceSourceListHashMap.put(hMDeviceSource, arrayList);
                }
                i++;
                hMDeviceSourceArr2 = hMDeviceSourceArr;
            }
        } catch (Exception e) {
            HMLog.i(TAG, e.getMessage(), new Object[0]);
        }
        HMDeviceSource boundDeviceSource = deviceManagerApiLazy.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        if (HMDeviceConfig.hasFeatureSecondaryScreen(boundDeviceSource)) {
            if (this.mDeviceSourceListHashMap.get(boundDeviceSource) == null) {
                this.mDeviceSourceListHashMap.put(boundDeviceSource, initDefaultConfig(boundDeviceSource));
            }
            SecondaryUtil.getInstance().adjustMusic(this.mDeviceSourceListHashMap);
            SecondaryUtil.adjustSecondary(this.mDeviceSourceListHashMap);
            save(true);
        }
    }

    private boolean adjustAlexa(HMDeviceSource hMDeviceSource, @NotNull List<SecondaryModel> list) {
        HMBaseDevice device = deviceManagerApiLazy.getValue().getDevice(hMDeviceSource.getType());
        if (device == null || !DeviceSpeechSupportFuncKt.featureSupportAlexa(device) || accessCheck.getValue().isLoginCountrySupportAlexa()) {
            return false;
        }
        SecondaryModel secondaryModel = new SecondaryModel(PageType.PAGE_SHORTCUT, 31, false, list.size() - 1, true);
        int iIndexOf = list.indexOf(secondaryModel);
        if (iIndexOf < 0) {
            secondaryModel.setIndex(list.size());
            list.add(secondaryModel);
            saveAdjustResult(hMDeviceSource, list);
            return true;
        }
        SecondaryModel secondaryModel2 = list.get(iIndexOf);
        if (!secondaryModel2.isEnable()) {
            return false;
        }
        int index = secondaryModel2.getIndex();
        list.remove(secondaryModel2);
        for (int i = 0; i < list.size(); i++) {
            SecondaryModel secondaryModel3 = list.get(i);
            if (secondaryModel3.getIndex() > index) {
                secondaryModel3.setIndex(secondaryModel3.getIndex() - 1);
            }
        }
        list.add(secondaryModel);
        return true;
    }

    private List<SecondaryModel> adjustDefaultSecondModels(HMDeviceSource hMDeviceSource, @NotNull List<SecondaryModel> list) {
        List<SecondaryModel> listInitDefaultConfig = initDefaultConfig(hMDeviceSource);
        if (listInitDefaultConfig == null) {
            return list;
        }
        if (listInitDefaultConfig.size() == list.size() && list.containsAll(listInitDefaultConfig)) {
            return list;
        }
        saveAdjustResult(hMDeviceSource, listInitDefaultConfig);
        return listInitDefaultConfig;
    }

    private boolean adjustFlashlight(HMDeviceSource hMDeviceSource, @NotNull List<SecondaryModel> list) {
        if (!HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(48)) {
            return false;
        }
        SecondaryModel secondaryModel = new SecondaryModel(PageType.PAGE_SHORTCUT, 67, false, list.size(), true);
        if (list.contains(secondaryModel)) {
            return false;
        }
        int iMax = -1;
        for (int i = 0; i < list.size(); i++) {
            SecondaryModel secondaryModel2 = list.get(i);
            if (secondaryModel2.isEnable()) {
                iMax = Math.max(iMax, secondaryModel2.getIndex());
            }
        }
        List<SecondaryModel> defaultSecondaryModelList = getDefaultSecondaryModelList(hMDeviceSource);
        list.add(secondaryModel);
        sort(list, defaultSecondaryModelList, iMax);
        return true;
    }

    private List<SecondaryModel> adjustKongmingPro(HMDeviceSource hMDeviceSource, @NotNull List<SecondaryModel> list) {
        List<SecondaryModel> listInitDefaultConfig = initDefaultConfig(hMDeviceSource);
        if (listInitDefaultConfig == null) {
            return list;
        }
        if (listInitDefaultConfig.size() == list.size() && list.containsAll(listInitDefaultConfig)) {
            return list;
        }
        saveAdjustResult(hMDeviceSource, listInitDefaultConfig);
        return listInitDefaultConfig;
    }

    private boolean adjustPanguSportStatus(HMDeviceSource hMDeviceSource, @NotNull List<SecondaryModel> list) {
        if (!HMDeviceConfig.isPanguSeries() || deviceManagerApiLazy.getValue().getDevice(hMDeviceSource.getType()) == null) {
            return false;
        }
        SecondaryModel secondaryModel = null;
        for (int i = 0; i < list.size(); i++) {
            SecondaryModel secondaryModel2 = list.get(i);
            if (secondaryModel2.getType() == 30) {
                secondaryModel = secondaryModel2;
                break;
            }
        }
        if (secondaryModel == null) {
            return false;
        }
        int index = secondaryModel.getIndex();
        list.remove(secondaryModel);
        for (int i2 = 0; i2 < list.size(); i2++) {
            SecondaryModel secondaryModel3 = list.get(i2);
            if (secondaryModel3.getIndex() > index) {
                secondaryModel3.setIndex(secondaryModel3.getIndex() - 1);
            }
        }
        return true;
    }

    private boolean adjustSleep(HMDeviceSource hMDeviceSource, @NotNull List<SecondaryModel> list) {
        if (!HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(47)) {
            return false;
        }
        SecondaryModel secondaryModel = new SecondaryModel(PageType.PAGE_SHORTCUT, 35, false, list.size(), true);
        if (list.contains(secondaryModel)) {
            return false;
        }
        int iMax = -1;
        for (int i = 0; i < list.size(); i++) {
            SecondaryModel secondaryModel2 = list.get(i);
            if (secondaryModel2.isEnable()) {
                iMax = Math.max(iMax, secondaryModel2.getIndex());
            }
        }
        List<SecondaryModel> defaultSecondaryModelList = getDefaultSecondaryModelList(hMDeviceSource);
        list.add(secondaryModel);
        sort(list, defaultSecondaryModelList, iMax);
        return true;
    }

    private boolean adjustWechatPay(HMDeviceSource hMDeviceSource, @NotNull List<SecondaryModel> list) {
        if (!HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(45) || list.contains(new SecondaryModel(PageType.PAGE_SHORTCUT, 49, true, -1, true))) {
            return false;
        }
        SecondaryModel secondaryModel = new SecondaryModel(PageType.PAGE_SHORTCUT, 17, true, -1, true);
        SecondaryModel secondaryModel2 = new SecondaryModel(PageType.PAGE_SHORTCUT, 18, true, -1, true);
        int iIndexOf = list.indexOf(secondaryModel);
        int iIndexOf2 = list.indexOf(secondaryModel2);
        SecondaryModel secondaryModel3 = iIndexOf >= 0 ? list.get(iIndexOf) : null;
        SecondaryModel secondaryModel4 = iIndexOf2 >= 0 ? list.get(iIndexOf2) : null;
        int iMax = -1;
        int iMax2 = -1;
        for (int i = 0; i < list.size(); i++) {
            SecondaryModel secondaryModel5 = list.get(i);
            if (secondaryModel5.isEnable()) {
                iMax2 = Math.max(iMax2, secondaryModel5.getIndex());
            }
        }
        boolean z = iMax2 >= 6;
        if (secondaryModel3 != null && secondaryModel3.isEnable() && !z) {
            iMax = secondaryModel3.getIndex();
        } else if (secondaryModel4 != null && !z) {
            iMax = Math.max(0, secondaryModel4.getIndex() - 1);
        }
        if (iMax < 0 || iMax >= list.size()) {
            List<SecondaryModel> defaultSecondaryModelList = getDefaultSecondaryModelList(hMDeviceSource);
            list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 49, false, list.size(), true));
            sort(list, defaultSecondaryModelList, iMax2);
            return true;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            SecondaryModel secondaryModel6 = list.get(i2);
            if (secondaryModel6.getIndex() >= iMax) {
                secondaryModel6.setIndex(secondaryModel6.getIndex() + 1);
            }
        }
        list.add(iMax, new SecondaryModel(PageType.PAGE_SHORTCUT, 49, true, iMax, true));
        return true;
    }

    private int fixParentType(HMDeviceSource hMDeviceSource, int i) {
        return (hMDeviceSource == HMDeviceSource.MILI_DTH || hMDeviceSource == HMDeviceSource.MILI_TONLESAP_O || hMDeviceSource == HMDeviceSource.MILI_TONLESAP_OL) ? PageType.PAGE_SHORTCUT : i;
    }

    public static OtherSecondaryScreen getInstance() {
        if (sInstance == null) {
            synchronized (OtherSecondaryScreen.class) {
                if (sInstance == null) {
                    sInstance = new OtherSecondaryScreen();
                }
            }
        }
        SecondaryScreen.sInstances.add(sInstance);
        return sInstance;
    }

    private List<SecondaryModel> initDefaultConfig(HMDeviceSource hMDeviceSource) {
        SecondaryUtil secondaryUtil = SecondaryUtil.getInstance();
        switch (AnonymousClass2.$SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[hMDeviceSource.ordinal()]) {
            case 1:
                return PeytoSecondaryScreen.get().mSecondaryModelList;
            case 2:
            case 3:
                return PeytoLSecondaryScreen.get().mSecondaryModelList;
            case 4:
                List<SecondaryModel> list = TempoSecondaryScreen.get().mSecondaryModelList;
                secondaryUtil.upgradeTempoToMusic(list);
                return list;
            case 5:
                ArrayList arrayList = new ArrayList();
                secondaryUtil.initBeatsDefaultConfig(arrayList, false);
                return arrayList;
            case 6:
                if (GlobalConfig.get().isBuildMidong()) {
                    return SecondaryUtil.initDthDefaultConfig();
                }
                ArrayList arrayList2 = new ArrayList();
                secondaryUtil.initBeatsDTHDefaultConfig(arrayList2, false);
                return arrayList2;
            case 7:
            case 8:
                ArrayList arrayList3 = new ArrayList();
                if (GlobalConfig.get().isBuildMidong()) {
                    secondaryUtil.initBeatsDefaultConfig(arrayList3, true);
                } else {
                    secondaryUtil.initBeatsDTHDefaultConfig(arrayList3, true);
                }
                return arrayList3;
            case 9:
                ArrayList arrayList4 = new ArrayList();
                secondaryUtil.initBeatsPDefaultConfig(arrayList4);
                return arrayList4;
            case 10:
                ArrayList arrayList5 = new ArrayList();
                secondaryUtil.initCincoDefaultConfig(arrayList5);
                return arrayList5;
            case 11:
            case 12:
                if (GlobalConfig.get().isBuildMidong()) {
                    return SecondaryUtil.initTonlesapDefaultConfigNew();
                }
                ArrayList arrayList6 = new ArrayList();
                secondaryUtil.initTonlesapDefaultConfig(arrayList6, true);
                return arrayList6;
            case 13:
            case 14:
                ArrayList arrayList7 = new ArrayList();
                secondaryUtil.initTonlesapDefaultConfig(arrayList7, false);
                return arrayList7;
            case 15:
            case 16:
            case 17:
                ArrayList arrayList8 = new ArrayList();
                secondaryUtil.initKongmingLDefaultConfig(arrayList8);
                return arrayList8;
            case 18:
                ArrayList arrayList9 = new ArrayList();
                secondaryUtil.initYorkDefaultConfig(arrayList9);
                return arrayList9;
            case 19:
                ArrayList arrayList10 = new ArrayList();
                secondaryUtil.initKongmingProDefaultConfig(arrayList10);
                return arrayList10;
            case 20:
                ArrayList arrayList11 = new ArrayList();
                secondaryUtil.initKongmingProLDefaultConfig(arrayList11);
                return arrayList11;
            case 21:
                ArrayList arrayList12 = new ArrayList();
                secondaryUtil.initPanguDefaultConfig(arrayList12, true);
                return arrayList12;
            case 22:
                ArrayList arrayList13 = new ArrayList();
                secondaryUtil.initPanguDefaultConfig(arrayList13, false);
                return arrayList13;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                ArrayList arrayList14 = new ArrayList();
                secondaryUtil.initL66DefaultConfig(arrayList14, false);
                return arrayList14;
            case 28:
            case 29:
                ArrayList arrayList15 = new ArrayList();
                secondaryUtil.initL66DefaultConfig(arrayList15, true);
                return arrayList15;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sort$0(List list, int i, List list2, SecondaryModel secondaryModel, SecondaryModel secondaryModel2) {
        int iIndexOf = list.indexOf(secondaryModel);
        int iIndexOf2 = list.indexOf(secondaryModel2);
        if (iIndexOf <= i || iIndexOf2 <= i) {
            return 0;
        }
        return list2.indexOf(secondaryModel) - list2.indexOf(secondaryModel2);
    }

    private void saveAdjustResult(HMDeviceSource hMDeviceSource, List<SecondaryModel> list) {
        this.mDeviceSourceListHashMap.put(hMDeviceSource, list);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SecondaryModel secondaryModel = list.get(i);
            secondaryModel.setIndex(i);
            arrayList.add(new PageItem(secondaryModel.getIndex(), secondaryModel.getType(), secondaryModel.getParentType(), !secondaryModel.isEnable()));
        }
        this.mDeviceSourceListHashMap.put(hMDeviceSource, list);
        ((HMMiLiProDevice) deviceManagerApiLazy.getValue().getDevice(HMDeviceType.MILI)).setPages(arrayList, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.model.account.secondaryscreen.OtherSecondaryScreen.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                HMLog.i(OtherSecondaryScreen.TAG, "onFinish " + z, new Object[0]);
            }
        });
        save(true);
    }

    private void sort(final List<SecondaryModel> list, final List<SecondaryModel> list2, final int i) {
        Collections.sort(list, new Comparator() { // from class: mn5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return OtherSecondaryScreen.lambda$sort$0(list, i, list2, (SecondaryModel) obj, (SecondaryModel) obj2);
            }
        });
    }

    private String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (HMDeviceSource hMDeviceSource : sSources) {
                List<SecondaryModel> list = this.mDeviceSourceListHashMap.get(hMDeviceSource);
                if (list != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (SecondaryModel secondaryModel : list) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", secondaryModel.getType());
                        jSONObject2.put("enable", secondaryModel.isEnable());
                        jSONObject2.put("index", secondaryModel.getIndex());
                        jSONObject2.put(SecondaryScreen.KEY_UPDATED, secondaryModel.isUpdated());
                        if (HMDeviceConfig.isSupportNewProtocal(hMDeviceSource)) {
                            jSONObject2.put(SecondaryScreen.KEY_PARENT, secondaryModel.getParentType());
                        }
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put(String.valueOf(hMDeviceSource.getValue()), jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen
    public void clear() {
        sInstance = null;
    }

    public List<SecondaryModel> getDefaultConfig(HMDeviceSource hMDeviceSource) {
        return initDefaultConfig(hMDeviceSource);
    }

    @Override // com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen
    public List<SecondaryModel> getSecondaryModelList() {
        HMDeviceSource boundDeviceSource = deviceManagerApiLazy.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        List<SecondaryModel> listAdjustMusic = this.mDeviceSourceListHashMap.get(boundDeviceSource);
        if (listAdjustMusic == null) {
            List<SecondaryModel> listInitDefaultConfig = initDefaultConfig(boundDeviceSource);
            if (listInitDefaultConfig == null) {
                return null;
            }
            listAdjustMusic = SecondaryUtil.getInstance().adjustMusic(listInitDefaultConfig, boundDeviceSource);
            this.mDeviceSourceListHashMap.put(boundDeviceSource, listAdjustMusic);
        } else {
            if (boundDeviceSource == HMDeviceSource.MILI_YORK) {
                return adjustDefaultSecondModels(boundDeviceSource, listAdjustMusic);
            }
            if (boundDeviceSource == HMDeviceSource.MILI_KONGMING_PRO || boundDeviceSource == HMDeviceSource.MILI_KONGMING_PRO_L) {
                return adjustKongmingPro(boundDeviceSource, listAdjustMusic);
            }
        }
        if (adjustAlexa(boundDeviceSource, listAdjustMusic) | adjustPanguSportStatus(boundDeviceSource, listAdjustMusic) | adjustWechatPay(boundDeviceSource, listAdjustMusic) | adjustSleep(boundDeviceSource, listAdjustMusic) | adjustFlashlight(boundDeviceSource, listAdjustMusic)) {
            saveAdjustResult(boundDeviceSource, listAdjustMusic);
        }
        return listAdjustMusic;
    }

    @Override // com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen
    public void save(boolean z) {
        String json = toJson();
        HMLog.i(TAG, "other saved: " + json, new Object[0]);
        Lazy<PropertyStoreApi> lazy = propertyStoreApiLazy;
        lazy.getValue().setProperty(Property.PROPERTY_SECONDARY_SCREEN, json);
        lazy.getValue().postPropertiesToServer(true);
    }
}
