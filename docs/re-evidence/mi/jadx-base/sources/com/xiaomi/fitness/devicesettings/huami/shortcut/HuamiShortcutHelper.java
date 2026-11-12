package com.xiaomi.fitness.devicesettings.huami.shortcut;

import com.google.gson.Gson;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.mi.fitness.alexa.export.AlexaExportUtilKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.huami.extensions.DeviceExtKt;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreen;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreenItem;
import com.xiaomi.hm.health.bt.sdk.data.ShortcutItem;
import com.xiaomi.onetrack.c.q;
import defpackage.h4b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u00015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\bJ\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010#\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010$\u001a\u00020 H\u0002J\u0017\u0010%\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+J\u001e\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+H\u0002J \u0010.\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+H\u0002J \u00100\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u0001012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+H\u0002J \u00102\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u0001012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+H\u0002J \u00103\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u0001012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+H\u0002J\u001e\u00104\u001a\u00020 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+2\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuamiShortcutHelper;", "", "<init>", "()V", "TAG", "", "sSortIndexMap", "", "", "sShortcutComparator", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuamiShortcutHelper$SecondaryScreenItemComparator;", "getDefaultSecondaryScreen", "Lcom/xiaomi/fitness/settingitem/settingitem/SecondaryScreen;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getL66ShortcutFromDevice", "", "Lcom/xiaomi/fitness/settingitem/settingitem/SecondaryScreenItem;", "getShortcutType", "getHideShortcutType", "getSecondaryScreen", "value", "convertSecondaryScreenItemToShortcutItem", "Lcom/xiaomi/hm/health/bt/sdk/data/ShortcutItem;", "secondaryScreenItems", "convertSecondaryScreenItemToDisplayBean", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "convertTypeToAppId", "type", "convertAppIdToType", q.f13858b, "isMiliMainLand", "", "getPanguDefaultSecondaryScreen", "getL66DefaultSecondaryScreen", "createItem", "enable", "getPanguItemIndex", "(Ljava/lang/Integer;)I", "initSortIndex", "", "addPatch", "list", "", "addMasterCardPatch", "device", "addVoicePatch", "huaMiDeviceModel", "addSleepPatch", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "addWetchatPayPatch", "addFlashLightPatch", "contains", "SecondaryScreenItemComparator", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuamiShortcutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiShortcutHelper.kt\ncom/xiaomi/fitness/devicesettings/huami/shortcut/HuamiShortcutHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,613:1\n774#2:614\n865#2,2:615\n*S KotlinDebug\n*F\n+ 1 HuamiShortcutHelper.kt\ncom/xiaomi/fitness/devicesettings/huami/shortcut/HuamiShortcutHelper\n*L\n174#1:614\n174#1:615,2\n*E\n"})
public final class HuamiShortcutHelper {

    @NotNull
    private static final String TAG = "HuamiShortcutHelper";

    @NotNull
    public static final HuamiShortcutHelper INSTANCE = new HuamiShortcutHelper();

    @NotNull
    private static final Map<Integer, Integer> sSortIndexMap = new HashMap();

    @NotNull
    private static final SecondaryScreenItemComparator sShortcutComparator = new SecondaryScreenItemComparator();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuamiShortcutHelper$SecondaryScreenItemComparator;", "Ljava/util/Comparator;", "Lcom/xiaomi/fitness/settingitem/settingitem/SecondaryScreenItem;", "<init>", "()V", "compare", "", "o1", "o2", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SecondaryScreenItemComparator implements Comparator<SecondaryScreenItem> {
        @Override // java.util.Comparator
        public int compare(@Nullable SecondaryScreenItem o1, @Nullable SecondaryScreenItem o2) {
            if (o1 != null && o2 != null) {
                if (!o1.isEnable() && o2.isEnable()) {
                    return 1;
                }
                if (o1.isEnable() && !o2.isEnable()) {
                    return -1;
                }
                if (!o1.isEnable() && !o2.isEnable()) {
                    return o1.getIndex() - o2.getIndex();
                }
            }
            return 0;
        }
    }

    private HuamiShortcutHelper() {
    }

    private final boolean addFlashLightPatch(HuamiApiCaller device, List<SecondaryScreenItem> list) {
        if (device != null) {
            Logger.i(TAG, "addFlashLightPatch support:" + device.hasSoftwareFeature(48));
        }
        if (device == null || !device.hasSoftwareFeature(48) || contains(list, 67)) {
            return false;
        }
        list.add(createItem(67, false));
        for (SecondaryScreenItem secondaryScreenItem : list) {
            secondaryScreenItem.setIndex(getPanguItemIndex(Integer.valueOf(secondaryScreenItem.getType())));
        }
        Collections.sort(list, sShortcutComparator);
        Logger.i(TAG, "addFlashLightPatch result:" + h4b.c(list));
        return true;
    }

    private final boolean addMasterCardPatch(WearableDeviceModel device, List<SecondaryScreenItem> list) {
        if (contains(list, 16) || !DeviceExtKt.isShowCards(device)) {
            return false;
        }
        list.add(createItem(16, true));
        for (SecondaryScreenItem secondaryScreenItem : list) {
            secondaryScreenItem.setIndex(getPanguItemIndex(Integer.valueOf(secondaryScreenItem.getType())));
        }
        Collections.sort(list, new SecondaryScreenItemComparator());
        return true;
    }

    private final boolean addSleepPatch(HuamiApiCaller device, List<SecondaryScreenItem> list) {
        if (device != null) {
            Logger.i(TAG, "addSleepPatch support:" + device.hasSoftwareFeature(47));
        }
        if (device == null || !device.hasSoftwareFeature(47) || contains(list, 35)) {
            return false;
        }
        list.add(createItem(35, false));
        for (SecondaryScreenItem secondaryScreenItem : list) {
            secondaryScreenItem.setIndex(getPanguItemIndex(Integer.valueOf(secondaryScreenItem.getType())));
        }
        Collections.sort(list, sShortcutComparator);
        Logger.i(TAG, "addSleepPatch result:" + h4b.c(list));
        return true;
    }

    private final boolean addVoicePatch(WearableDeviceModel huaMiDeviceModel, List<SecondaryScreenItem> list) {
        boolean z = huaMiDeviceModel != null && (DeviceModelExtKt.isSupportFeature(huaMiDeviceModel, "xiaoai") || DeviceModelExtKt.isSupportFeature(huaMiDeviceModel, "alexa"));
        Logger.i(TAG, "addVoicePatch support:" + z);
        if (!z || contains(list, 31)) {
            return false;
        }
        int i = 0;
        for (SecondaryScreenItem secondaryScreenItem : list) {
            secondaryScreenItem.setIndex(getPanguItemIndex(Integer.valueOf(secondaryScreenItem.getType())));
            if (secondaryScreenItem.isEnable()) {
                i++;
            }
        }
        list.add(createItem(31, i <= 7));
        Collections.sort(list, new SecondaryScreenItemComparator());
        Logger.i(TAG, "addVoicePatch result:" + h4b.c(list));
        return true;
    }

    private final boolean addWetchatPayPatch(HuamiApiCaller device, List<SecondaryScreenItem> list) {
        if (device != null) {
            Logger.i(TAG, "addWetchatPayPatch support:" + device.hasSoftwareFeature(45));
        }
        if (device == null || !device.hasSoftwareFeature(45) || contains(list, 49)) {
            return false;
        }
        int size = list.size();
        int i = -1;
        int i2 = 0;
        int size2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            SecondaryScreenItem secondaryScreenItem = list.get(i3);
            secondaryScreenItem.setIndex(getPanguItemIndex(Integer.valueOf(secondaryScreenItem.getType())));
            if (secondaryScreenItem.isEnable() && secondaryScreenItem.getType() != 18) {
                i2++;
            }
            if (secondaryScreenItem.getType() == 17 && secondaryScreenItem.isEnable()) {
                i = i3;
            }
            if (secondaryScreenItem.getType() == 18 && secondaryScreenItem.isEnable()) {
                size2 = i3;
            }
        }
        if (i2 >= 7) {
            Logger.d(TAG, "addWetchatPayPatch: enabled item count has out of limit");
            list.add(createItem(49, false));
            Collections.sort(list, sShortcutComparator);
        } else if (i >= 0) {
            list.add(i + 1, createItem(49, true));
        } else {
            if (list.size() == 1) {
                size2 = 0;
            } else {
                for (int i4 = 0; i4 < 2; i4++) {
                    size2--;
                    if (size2 < 0) {
                        size2 = list.size() - 1;
                    }
                }
            }
            Logger.d("addWetchatPayPatch position:" + size2, new Object[0]);
            list.add(size2, createItem(49, true));
        }
        Logger.i(TAG, "addWetchatPayPatch result:" + h4b.c(list));
        return true;
    }

    private final boolean contains(List<SecondaryScreenItem> list, int type) {
        Iterator<SecondaryScreenItem> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == type) {
                return true;
            }
        }
        return false;
    }

    private final int convertAppIdToType(String appId) {
        int length = appId.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = 7;
                break;
            }
            if (appId.charAt(i) != '0') {
                break;
            }
            i++;
        }
        String strSubstring = appId.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int i2 = Integer.parseInt(strSubstring, 16);
        switch (i2) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 25;
            case 4:
                return 11;
            case 5:
                return 35;
            case 6:
                return 17;
            case 7:
            case 13:
            case 14:
            case 16:
            case 20:
            case 21:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 34:
            case 36:
            default:
                return i2;
            case 8:
                return 49;
            case 9:
                return 16;
            case 10:
                return 3;
            case 11:
                return 20;
            case 12:
                return 30;
            case 15:
                return 28;
            case 17:
                return 29;
            case 18:
                return 51;
            case 19:
                return 36;
            case 22:
                return 9;
            case 23:
                return 32;
            case 24:
                return 38;
            case 32:
                return 1;
            case 33:
                return 21;
            case 35:
                return 31;
            case 37:
                return 57;
        }
    }

    private final SecondaryScreenItem createItem(int type, boolean enable) {
        SecondaryScreenItem secondaryScreenItem = new SecondaryScreenItem();
        secondaryScreenItem.setType(type);
        secondaryScreenItem.setEnable(enable);
        secondaryScreenItem.setIndex(getPanguItemIndex(Integer.valueOf(type)));
        return secondaryScreenItem;
    }

    private final List<Integer> getHideShortcutType(WearableDeviceModel deviceModel) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(25);
        arrayList.add(2);
        arrayList.add(28);
        arrayList.add(51);
        arrayList.add(29);
        arrayList.add(21);
        arrayList.add(3);
        if (DeviceExtKt.isShowCards(deviceModel)) {
            arrayList.add(16);
        }
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(15);
        if (RegionUtil.INSTANCE.isSupportAliPaySmartSet()) {
            arrayList.add(17);
        }
        arrayList.add(26);
        String lowerCase = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt__StringsJVMKt.startsWith$default(lowerCase, "zh", false, 2, null)) {
            arrayList.add(32);
        }
        return arrayList;
    }

    private final int getPanguItemIndex(Integer type) {
        Map<Integer, Integer> map = sSortIndexMap;
        if (map.isEmpty()) {
            initSortIndex();
        }
        Integer num = map.get(type);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final List<Integer> getShortcutType(WearableDeviceModel deviceModel) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(6);
        if (DeviceModelExtKt.isSupportFeature(deviceModel, "xiaoai")) {
            arrayList.add(31);
        }
        arrayList.add(18);
        arrayList.add(4);
        arrayList.add(11);
        return arrayList;
    }

    private final void initSortIndex() {
        Map<Integer, Integer> map = sSortIndexMap;
        map.clear();
        map.put(11, 0);
        map.put(49, 1);
        map.put(17, 2);
        map.put(31, 3);
        map.put(18, 4);
        map.put(16, 5);
        map.put(4, 6);
        map.put(1, 7);
        map.put(25, 8);
        map.put(2, 9);
        map.put(36, 10);
        map.put(35, 11);
        map.put(6, 12);
        map.put(3, 13);
        map.put(28, 14);
        map.put(51, 15);
        map.put(29, 16);
        map.put(21, 17);
        map.put(8, 18);
        map.put(9, 19);
        map.put(67, 20);
        map.put(56, 21);
        map.put(10, 22);
        map.put(12, 23);
        map.put(13, 24);
        map.put(14, 25);
        map.put(15, 26);
        map.put(26, 27);
        map.put(32, 28);
        Logger.i(TAG, "initSortIndex total:29");
    }

    private final boolean isMiliMainLand() {
        String mac;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller != null) {
            return huaMiApiCaller.isMiliMainLand();
        }
        return false;
    }

    public final void addPatch(@NotNull List<SecondaryScreenItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isPanGu(wearableDeviceModel.getProduct())) {
            return;
        }
        HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(wearableDeviceModel);
        Logger.d(TAG, "addPatch origin list:" + h4b.c(list));
        boolean zAddFlashLightPatch = addFlashLightPatch(huamiDevice, list) | addSleepPatch(huamiDevice, list) | addWetchatPayPatch(huamiDevice, list) | addMasterCardPatch(wearableDeviceModel, list) | addVoicePatch(wearableDeviceModel, list);
        Logger.i(TAG, "addPatch listChanged:" + zAddFlashLightPatch);
        if (zAddFlashLightPatch) {
            SecondaryScreen secondaryScreen = new SecondaryScreen();
            secondaryScreen.setSecondaryscreen(list);
            DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(wearableDeviceModel.getDid(), "secondaryscreen", secondaryScreen);
        }
    }

    @NotNull
    public final List<DisplayBean> convertSecondaryScreenItemToDisplayBean(@NotNull List<? extends SecondaryScreenItem> secondaryScreenItems) {
        Intrinsics.checkNotNullParameter(secondaryScreenItems, "secondaryScreenItems");
        ArrayList arrayList = new ArrayList();
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) secondaryScreenItems);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mutableList) {
            if (((SecondaryScreenItem) obj).getType() != 18) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < size) {
            SecondaryScreenItem secondaryScreenItem = (SecondaryScreenItem) arrayList2.get(i);
            char c2 = secondaryScreenItem.isEnable() ? (char) 1 : (char) 2;
            i2 = c2 == c ? i2 + 1 : 0;
            DisplayBean displayBean = new DisplayBean(secondaryScreenItem.isEnable() ? 1 : 2, secondaryScreenItem.getType() == 18 ? (byte) 1 : (byte) 0, i2, convertTypeToAppId(secondaryScreenItem.getType()), null, null, 48, null);
            arrayList.add(displayBean);
            Logger.i("convertSecondaryScreenItemToDisplayBean sync " + displayBean, new Object[0]);
            i++;
            c = c2;
        }
        return arrayList;
    }

    @Nullable
    public final List<ShortcutItem> convertSecondaryScreenItemToShortcutItem(@NotNull List<? extends SecondaryScreenItem> secondaryScreenItems) {
        Intrinsics.checkNotNullParameter(secondaryScreenItems, "secondaryScreenItems");
        ArrayList arrayList = new ArrayList();
        int size = secondaryScreenItems.size();
        for (int i = 0; i < size; i++) {
            SecondaryScreenItem secondaryScreenItem = secondaryScreenItems.get(i);
            ShortcutItem shortcutItem = new ShortcutItem();
            shortcutItem.setType(secondaryScreenItem.getType());
            shortcutItem.setHide(!secondaryScreenItem.isEnable());
            shortcutItem.setIndex(i);
            arrayList.add(shortcutItem);
        }
        return arrayList;
    }

    @NotNull
    public final String convertTypeToAppId(int type) {
        if (type == 1) {
            type = 32;
        } else if (type == 2) {
            type = 1;
        } else if (type == 3) {
            type = 10;
        } else if (type == 4) {
            type = 2;
        } else if (type == 9) {
            type = 22;
        } else if (type == 11) {
            type = 4;
        } else if (type == 25) {
            type = 3;
        } else if (type == 38) {
            type = 24;
        } else if (type == 49) {
            type = 8;
        } else if (type == 51) {
            type = 18;
        } else if (type == 57) {
            type = 37;
        } else if (type == 16) {
            type = 9;
        } else if (type == 17) {
            type = 6;
        } else if (type == 20) {
            type = 11;
        } else if (type == 21) {
            type = 33;
        } else if (type == 35) {
            type = 5;
        } else if (type != 36) {
            switch (type) {
                case 28:
                    type = 15;
                    break;
                case 29:
                    type = 17;
                    break;
                case 30:
                    type = 12;
                    break;
                case 31:
                    type = 35;
                    break;
                case 32:
                    type = 23;
                    break;
            }
        } else {
            type = 19;
        }
        String hexString = Integer.toHexString(type);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        String upperCase = hexString.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return ArraysKt___ArraysKt.joinToString$default(new int[8 - upperCase.length()], (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + upperCase;
    }

    @NotNull
    public final SecondaryScreen getDefaultSecondaryScreen(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isPanGu(deviceModel.getProduct())) {
            return getPanguDefaultSecondaryScreen(deviceModel);
        }
        if (DeviceModelExtKt.isL66(deviceModel)) {
            SecondaryScreen secondaryScreen = new SecondaryScreen();
            secondaryScreen.setSecondaryscreen(getL66ShortcutFromDevice(deviceModel));
            return secondaryScreen;
        }
        SecondaryScreen secondaryScreen2 = new SecondaryScreen();
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = getShortcutType(deviceModel).iterator();
        int i = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            SecondaryScreenItem secondaryScreenItem = new SecondaryScreenItem();
            secondaryScreenItem.setType(iIntValue);
            secondaryScreenItem.setEnable(true);
            secondaryScreenItem.setIndex(i);
            arrayList.add(secondaryScreenItem);
            i++;
        }
        Iterator<Integer> it2 = getHideShortcutType(deviceModel).iterator();
        while (it2.hasNext()) {
            int iIntValue2 = it2.next().intValue();
            SecondaryScreenItem secondaryScreenItem2 = new SecondaryScreenItem();
            secondaryScreenItem2.setType(iIntValue2);
            secondaryScreenItem2.setEnable(false);
            secondaryScreenItem2.setIndex(i);
            arrayList.add(secondaryScreenItem2);
            i++;
        }
        secondaryScreen2.setSecondaryscreen(arrayList);
        return secondaryScreen2;
    }

    @NotNull
    public final SecondaryScreen getL66DefaultSecondaryScreen(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        ArrayList arrayList = new ArrayList();
        HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel);
        arrayList.add(createItem(18, true));
        if (huamiDevice != null && huamiDevice.hasSoftwareFeature(45) && RegionUtil.INSTANCE.isSupportWechatPay() && isMiliMainLand()) {
            arrayList.add(createItem(49, true));
        }
        if (RegionUtil.INSTANCE.isSupportAliPaySmartSet() && isMiliMainLand()) {
            arrayList.add(createItem(17, true));
        }
        if (DeviceModelExtKt.isSupportFeature(deviceModel, "xiaoai") || DeviceModelExtKt.isSupportFeature(deviceModel, "alexa")) {
            arrayList.add(createItem(31, true));
        }
        arrayList.add(createItem(4, true));
        if (NfcManagerExtKt.getInstance(NfcManager.INSTANCE).isShowCard(deviceModel)) {
            arrayList.add(createItem(16, true));
        }
        if (DeviceModelExtKt.isSupportFeature(deviceModel, Feature.TRAINING_LOAD)) {
            arrayList.add(createItem(30, true));
        }
        arrayList.add(createItem(11, false));
        arrayList.add(createItem(1, false));
        arrayList.add(createItem(25, false));
        arrayList.add(createItem(2, false));
        arrayList.add(createItem(36, false));
        if (huamiDevice != null && huamiDevice.hasSoftwareFeature(47)) {
            arrayList.add(createItem(35, false));
        }
        arrayList.add(createItem(6, false));
        arrayList.add(createItem(3, false));
        arrayList.add(createItem(20, false));
        arrayList.add(createItem(28, false));
        arrayList.add(createItem(51, false));
        arrayList.add(createItem(29, false));
        arrayList.add(createItem(21, false));
        arrayList.add(createItem(8, false));
        arrayList.add(createItem(9, false));
        if (huamiDevice != null && huamiDevice.hasSoftwareFeature(43)) {
            arrayList.add(createItem(56, false));
        }
        arrayList.add(createItem(10, false));
        arrayList.add(createItem(12, false));
        arrayList.add(createItem(13, false));
        arrayList.add(createItem(14, false));
        if (huamiDevice != null && huamiDevice.hasSoftwareFeature(20)) {
            arrayList.add(createItem(15, false));
        }
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = currentLocale$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt__StringsJVMKt.startsWith$default(lowerCase, "zh", false, 2, null)) {
            arrayList.add(createItem(32, false));
        }
        if (RomUtils.isXiaomi() && DeviceModelExtKt.isSupportFeature(deviceModel, "calendar")) {
            arrayList.add(createItem(38, false));
        }
        Logger.d("getL66DefaultSecondaryScreen: total %d items", 0);
        SecondaryScreen secondaryScreen = new SecondaryScreen();
        secondaryScreen.setSecondaryscreen(arrayList);
        return secondaryScreen;
    }

    @Nullable
    public final List<SecondaryScreenItem> getL66ShortcutFromDevice(@NotNull WearableDeviceModel deviceModel) {
        List<DisplayBean> listQueryDisplayListSync;
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel);
        if (huamiDevice == null || (listQueryDisplayListSync = huamiDevice.queryDisplayListSync(2)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listQueryDisplayListSync.size();
        int i = -1;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            DisplayBean displayBean = listQueryDisplayListSync.get(i2);
            int iConvertAppIdToType = convertAppIdToType(displayBean.getAppId());
            if (iConvertAppIdToType == 38) {
                i = i2;
            }
            boolean z2 = true;
            if (iConvertAppIdToType == 57) {
                z = true;
            }
            int iConvertAppIdToType2 = convertAppIdToType(displayBean.getAppId());
            if (displayBean.getPageIndex() != 1) {
                z2 = false;
            }
            arrayList.add(createItem(iConvertAppIdToType2, z2));
        }
        Logger.i(TAG, "getL66ShortcutFromDevice isXiaomi: " + RomUtils.isXiaomi() + " schedulePosition: " + i + " hasAlexa: " + z);
        if (RomUtils.isXiaomi() && i == -1) {
            arrayList.add(createItem(38, false));
        } else if (!RomUtils.isXiaomi() && i != -1) {
            arrayList.remove(i);
        }
        if (!z && AlexaExportUtilKt.isSupportAlexa(deviceModel)) {
            arrayList.add(createItem(57, false));
        } else if (z && !AlexaExportUtilKt.isSupportAlexa(deviceModel)) {
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (((SecondaryScreenItem) arrayList.get(i3)).getType() == 57) {
                    ListExtKt.remove(arrayList, i3);
                    break;
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final SecondaryScreen getPanguDefaultSecondaryScreen(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        ArrayList arrayList = new ArrayList();
        arrayList.add(createItem(11, true));
        HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel);
        if (huamiDevice != null && huamiDevice.hasSoftwareFeature(45) && RegionUtil.INSTANCE.isSupportWechatPay() && isMiliMainLand()) {
            arrayList.add(createItem(49, true));
        }
        if (RegionUtil.INSTANCE.isSupportAliPaySmartSet() && isMiliMainLand()) {
            arrayList.add(createItem(17, true));
        }
        if (DeviceModelExtKt.isSupportFeature(deviceModel, "xiaoai") || DeviceModelExtKt.isSupportFeature(deviceModel, "alexa")) {
            arrayList.add(createItem(31, true));
        }
        arrayList.add(createItem(18, true));
        if (NfcManagerExtKt.getInstance(NfcManager.INSTANCE).isShowCard(deviceModel)) {
            arrayList.add(createItem(16, true));
        }
        arrayList.add(createItem(4, true));
        arrayList.add(createItem(1, false));
        arrayList.add(createItem(25, false));
        arrayList.add(createItem(2, false));
        arrayList.add(createItem(36, false));
        HuamiApiCaller huamiDevice2 = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel);
        if (huamiDevice2 != null && huamiDevice2.hasSoftwareFeature(47)) {
            arrayList.add(createItem(35, false));
        }
        arrayList.add(createItem(6, false));
        arrayList.add(createItem(3, false));
        arrayList.add(createItem(20, false));
        if (DeviceModelExtKt.isSupportFeature(deviceModel, Feature.TRAINING_LOAD)) {
            arrayList.add(createItem(30, false));
        }
        arrayList.add(createItem(28, false));
        arrayList.add(createItem(51, false));
        arrayList.add(createItem(29, false));
        arrayList.add(createItem(21, false));
        arrayList.add(createItem(8, false));
        arrayList.add(createItem(9, false));
        arrayList.add(createItem(56, false));
        arrayList.add(createItem(10, false));
        arrayList.add(createItem(12, false));
        arrayList.add(createItem(13, false));
        arrayList.add(createItem(14, false));
        arrayList.add(createItem(15, false));
        arrayList.add(createItem(26, false));
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = currentLocale$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt__StringsJVMKt.startsWith$default(lowerCase, "zh", false, 2, null)) {
            arrayList.add(createItem(32, false));
        }
        Logger.d("getPanguDefaultSecondaryScreen:total %d items", 0);
        SecondaryScreen secondaryScreen = new SecondaryScreen();
        secondaryScreen.setSecondaryscreen(arrayList);
        return secondaryScreen;
    }

    @NotNull
    public final SecondaryScreen getSecondaryScreen(@Nullable String value) {
        Object objFromJson = new Gson().fromJson(value, (Class<Object>) SecondaryScreen.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (SecondaryScreen) objFromJson;
    }
}
