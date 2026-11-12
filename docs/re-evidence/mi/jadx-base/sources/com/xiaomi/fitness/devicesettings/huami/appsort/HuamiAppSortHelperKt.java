package com.xiaomi.fitness.devicesettings.huami.appsort;

import com.google.gson.Gson;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.mi.fitness.alexa.export.AlexaExportUtilKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.huami.appsort.HuamiAppSortHelperKt;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.AppSort;
import com.xiaomi.fitness.settingitem.settingitem.AppSortItem;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.onetrack.c.q;
import defpackage.h4b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u001a\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003*\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001\u001a\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n\u001a\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\t\u001a\u00020\n\u001a\b\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\b\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n\u001a$\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u0019H\u0002\u001a$\u0010 \u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u0019H\u0002\u001a\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\"H\u0002\u001a\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\"H\u0002\u001a\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\b\u0012\u0004\u0012\u00020\u00060\b\u001a\u001c\u0010/\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u00100\u001a\u0004\u0018\u000101H\u0002\u001a\u001c\u00102\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u00100\u001a\u0004\u0018\u000101H\u0002\u001a\u001c\u00103\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u00100\u001a\u0004\u0018\u000101H\u0002\u001a\u001c\u00104\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u00100\u001a\u0004\u0018\u000101H\u0002\u001a\u001c\u00105\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u00100\u001a\u0004\u0018\u00010\nH\u0002\u001a\u001a\u00106\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0012\u00107\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0002\u001a\u0012\u00108\u001a\u000209*\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$\"'\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b(\u0010$¨\u0006:"}, d2 = {"TAG", "", "convertAppSortItemToAppItem", "", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "list", "Lcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;", "convert2AppItemUnderPangu", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "convertAppItem2DisplayBean", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "convertTypeToAppId", "type", "", "convertAppIdToType", q.f13858b, "getAppSortFromValue", "Lcom/xiaomi/fitness/settingitem/settingitem/AppSort;", "value", "getL66AppSortFromDevice", "getDefaultAppSort", "getAppSortTypes", "isShowCards", "", "isMiliMainLand", "getPanguDefaultAppSort", "getL66DefaultAppSort", "createItem", "parentType", "enable", "createL66Item", "sSortIndexMap", "", "getSSortIndexMap", "()Ljava/util/Map;", "sSortIndexMap$delegate", "Lkotlin/Lazy;", "sL66SortIndexMap", "getSL66SortIndexMap", "sL66SortIndexMap$delegate", "initSortIndex", "initL66SortIndex", "getPanguItemIndex", "getL66ItemIndex", "addPatch", "addSleepPatch", "device", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "addWechatPayPatch", "addMasterCardPatch", "addFlashLightPatch", "addVoicePatch", "contains", "findFirstMoreItem", "updateIndex", "", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuamiAppSortHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiAppSortHelper.kt\ncom/xiaomi/fitness/devicesettings/huami/appsort/HuamiAppSortHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,641:1\n1872#2,3:642\n360#2,7:645\n1863#2,2:652\n774#2:654\n865#2,2:655\n774#2:657\n865#2,2:658\n774#2:660\n865#2,2:661\n1872#2,3:663\n1863#2,2:666\n1872#2,3:668\n1863#2,2:671\n*S KotlinDebug\n*F\n+ 1 HuamiAppSortHelper.kt\ncom/xiaomi/fitness/devicesettings/huami/appsort/HuamiAppSortHelperKt\n*L\n43#1:642,3\n58#1:645,7\n66#1:652,2\n73#1:654\n73#1:655,2\n211#1:657\n211#1:658,2\n214#1:660\n214#1:661,2\n549#1:663,3\n618#1:666,2\n623#1:668,3\n628#1:671,2\n*E\n"})
public final class HuamiAppSortHelperKt {

    @NotNull
    private static final String TAG = "HuamiAppSortHelper";

    @NotNull
    private static final Lazy sSortIndexMap$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sjc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiAppSortHelperKt.initSortIndex();
        }
    });

    @NotNull
    private static final Lazy sL66SortIndexMap$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tjc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiAppSortHelperKt.initL66SortIndex();
        }
    });

    private static final boolean addFlashLightPatch(List<AppSortItem> list, HuamiApiCaller huamiApiCaller) {
        if (huamiApiCaller != null) {
            Logger.d(TAG, "addFlashLightPatch support:" + huamiApiCaller.hasSoftwareFeature(48));
            if (huamiApiCaller.hasSoftwareFeature(48) & (!contains(list, 67))) {
                int iFindFirstMoreItem = findFirstMoreItem(list);
                AppSortItem appSortItemCreateItem$default = createItem$default(67, iFindFirstMoreItem > 0 ? 7 : -1, false, 4, null);
                if (iFindFirstMoreItem > 0) {
                    list.add(iFindFirstMoreItem, appSortItemCreateItem$default);
                } else {
                    list.add(appSortItemCreateItem$default);
                }
                updateIndex(list);
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new AppSortItemComparator());
                Logger.i(TAG, "addFlashLightPatch result:" + h4b.c(list));
                return true;
            }
        }
        return false;
    }

    private static final boolean addMasterCardPatch(List<AppSortItem> list, HuamiApiCaller huamiApiCaller) {
        if (huamiApiCaller == null) {
            return false;
        }
        list.add(createItem$default(16, 7, false, 4, null));
        updateIndex(list);
        CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new AppSortItemComparator());
        return true;
    }

    @NotNull
    public static final List<AppSortItem> addPatch(@NotNull List<? extends AppSortItem> list) {
        Product product;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<AppSortItem> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null && (product = wearableDeviceModel.getProduct()) != null && DeviceModelExtKt.isPanGu(product)) {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            Logger.d(TAG, "addPatch origin list:" + h4b.c(list));
            boolean zAddSleepPatch = addSleepPatch(mutableList, huaMiApiCaller) | addWechatPayPatch(mutableList, huaMiApiCaller) | addFlashLightPatch(mutableList, huaMiApiCaller) | addVoicePatch(mutableList, wearableDeviceModel);
            if (!contains(mutableList, 16) && isShowCards()) {
                zAddSleepPatch |= addMasterCardPatch(mutableList, huaMiApiCaller);
            }
            Logger.i(TAG, "addPatch listChanged:" + zAddSleepPatch);
            if (zAddSleepPatch) {
                AppSort appSort = new AppSort();
                appSort.setAppsort(mutableList);
                DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KEY_APPSORT, appSort);
            }
        }
        return mutableList;
    }

    private static final boolean addSleepPatch(List<AppSortItem> list, HuamiApiCaller huamiApiCaller) {
        if (huamiApiCaller != null) {
            Logger.d(TAG, "addSleepPatch support:" + huamiApiCaller.hasSoftwareFeature(47));
            if (huamiApiCaller.hasSoftwareFeature(47) & (!contains(list, 35))) {
                list.add(createItem$default(35, 0, false, 6, null));
                updateIndex(list);
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new AppSortItemComparator());
                Logger.i(TAG, "addSleepPatch result:" + h4b.c(list));
                return true;
            }
        }
        return false;
    }

    private static final boolean addVoicePatch(List<AppSortItem> list, WearableDeviceModel wearableDeviceModel) {
        if (wearableDeviceModel != null) {
            boolean z = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "xiaoai") || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "alexa");
            Logger.d(TAG, "addVoicePatch support:" + z);
            if (z && !contains(list, 31)) {
                list.add(createItem$default(31, 7, false, 4, null));
                updateIndex(list);
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new AppSortItemComparator());
                Logger.i(TAG, "addVoicePatch result:" + h4b.c(list));
                return true;
            }
        }
        return false;
    }

    private static final boolean addWechatPayPatch(List<AppSortItem> list, HuamiApiCaller huamiApiCaller) {
        if (huamiApiCaller != null) {
            Logger.d(TAG, " addWechatPayPatch support:" + huamiApiCaller.hasSoftwareFeature(45));
            if (RegionUtil.isInnerCN() && huamiApiCaller.isMiliMainLand() && huamiApiCaller.hasSoftwareFeature(45) && !contains(list, 49)) {
                int i = -1;
                int i2 = 0;
                int i3 = -1;
                for (Object obj : list) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    AppSortItem appSortItem = (AppSortItem) obj;
                    appSortItem.setIndex(getPanguItemIndex(appSortItem.getType()));
                    if (appSortItem.getType() == 17 && appSortItem.getEnable()) {
                        i = i2;
                    }
                    if (appSortItem.getType() == 19 && appSortItem.getEnable()) {
                        i3 = i2;
                    }
                    i2 = i4;
                }
                if (i >= 0) {
                    list.add(i + 1, createItem$default(49, list.get(i).getParentType(), false, 4, null));
                } else if (i3 >= 0) {
                    list.add(i3, createItem$default(49, list.get(i3).getParentType(), false, 4, null));
                } else {
                    Logger.w(TAG, "addWechatPayPatch error " + i + " " + i3);
                }
                Logger.i(TAG, "addWechatPayPatch result:" + h4b.c(list));
                return true;
            }
        }
        return false;
    }

    private static final boolean contains(List<AppSortItem> list, int i) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((AppSortItem) it.next()).getType() == i) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<AppItem> convert2AppItemUnderPangu(@NotNull List<? extends AppSortItem> list, @NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        List<AppSortItem> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        ArrayList arrayList = new ArrayList();
        Iterator it = mutableList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            AppSortItem appSortItem = (AppSortItem) it.next();
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            String mac = deviceModel.getDeviceInfo().getMac();
            if (mac == null) {
                mac = "";
            }
            HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
            boolean zHasSoftwareFeature = huaMiApiCaller != null ? huaMiApiCaller.hasSoftwareFeature(43) : false;
            if (appSortItem.getParentType() == 7 && (zHasSoftwareFeature || appSortItem.getType() != 56)) {
                break;
            }
            i2++;
        }
        if (i2 > 0) {
            mutableList.add(i2, createItem$default(7, 0, false, 6, null));
        }
        for (AppSortItem appSortItem2 : mutableList) {
            arrayList.add(new AppItem(appSortItem2.getParentType(), appSortItem2.getType(), i, appSortItem2.getEnable()));
            i++;
        }
        return arrayList;
    }

    private static final int convertAppIdToType(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = 7;
                break;
            }
            if (str.charAt(i) != '0') {
                break;
            }
            i++;
        }
        String strSubstring = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int i2 = Integer.parseInt(strSubstring, 16);
        if (i2 == 57) {
            return 57;
        }
        if (i2 == 63) {
            return 31;
        }
        if (i2 != 258) {
            return i2;
        }
        return 67;
    }

    @NotNull
    public static final List<DisplayBean> convertAppItem2DisplayBean(@NotNull List<? extends AppSortItem> list, @NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AppSortItem) obj).getType() != 7) {
                arrayList.add(obj);
            }
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = mutableList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < size) {
            AppSortItem appSortItem = (AppSortItem) mutableList.get(i);
            int i4 = (!appSortItem.getEnable() || appSortItem.getParentType() == 7) ? (appSortItem.getEnable() && appSortItem.getParentType() == 7) ? 2 : 3 : 1;
            i3 = i4 == i2 ? i3 + 1 : 0;
            DisplayBean displayBean = new DisplayBean(i4, appSortItem.isAlwaysShown(appSortItem.getType()) ? (byte) 1 : (byte) 0, i3, convertTypeToAppId(appSortItem.getType()), null, null, 48, null);
            arrayList2.add(displayBean);
            Logger.i("convertAppItem2DisplayBean " + displayBean, new Object[0]);
            i++;
            i2 = i4;
        }
        return arrayList2;
    }

    @NotNull
    public static final List<AppItem> convertAppSortItemToAppItem(@NotNull List<AppSortItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AppSortItem appSortItem = (AppSortItem) obj;
            arrayList.add(new AppItem(appSortItem.getType(), i, appSortItem.getEnable()));
            i = i2;
        }
        return arrayList;
    }

    private static final String convertTypeToAppId(int i) {
        if (i == 31) {
            i = 63;
        } else if (i == 57) {
            i = 57;
        } else if (i == 67) {
            i = SportSummary.VERSION_102;
        }
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        String upperCase = hexString.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return ArraysKt___ArraysKt.joinToString$default(new int[8 - upperCase.length()], (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + upperCase;
    }

    private static final AppSortItem createItem(int i, int i2, boolean z) {
        AppSortItem appSortItem = new AppSortItem();
        appSortItem.setEnable(z);
        appSortItem.setIndex(getPanguItemIndex(i));
        appSortItem.setType(i);
        appSortItem.setParentType(i2);
        return appSortItem;
    }

    public static /* synthetic */ AppSortItem createItem$default(int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        return createItem(i, i2, z);
    }

    private static final AppSortItem createL66Item(int i, int i2, boolean z) {
        AppSortItem appSortItem = new AppSortItem();
        appSortItem.setEnable(z);
        appSortItem.setIndex(getL66ItemIndex(i));
        appSortItem.setType(i);
        appSortItem.setParentType(i2);
        return appSortItem;
    }

    public static /* synthetic */ AppSortItem createL66Item$default(int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        return createL66Item(i, i2, z);
    }

    private static final int findFirstMoreItem(List<AppSortItem> list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((AppSortItem) obj).getParentType() == 7) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @NotNull
    public static final AppSort getAppSortFromValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object objFromJson = new Gson().fromJson(value, (Class<Object>) AppSort.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (AppSort) objFromJson;
    }

    @NotNull
    public static final List<Integer> getAppSortTypes(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        ArrayList arrayList = new ArrayList();
        arrayList.add(18);
        arrayList.add(1);
        arrayList.add(25);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(28);
        arrayList.add(51);
        arrayList.add(29);
        arrayList.add(21);
        arrayList.add(4);
        arrayList.add(3);
        if (isShowCards()) {
            arrayList.add(16);
        }
        arrayList.add(7);
        return arrayList;
    }

    @NotNull
    public static final AppSort getDefaultAppSort(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (DeviceModelExtKt.isPanGu(deviceModel.getProduct())) {
            return getPanguDefaultAppSort(deviceModel);
        }
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isL66(deviceModel)) {
            AppSort appSort = new AppSort();
            appSort.setAppsort(getL66AppSortFromDevice(deviceModel));
            return appSort;
        }
        AppSort appSort2 = new AppSort();
        List<Integer> appSortTypes = getAppSortTypes(deviceModel);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = appSortTypes.iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            int i2 = i + 1;
            int iIntValue = ((Number) it.next()).intValue();
            AppSortItem appSortItem = new AppSortItem();
            if (iIntValue == 29 && Intrinsics.areEqual("male", UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex())) {
                z = false;
            }
            UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
            appSortItem.setEnable(z);
            appSortItem.setIndex(i);
            appSortItem.setType(iIntValue);
            arrayList.add(appSortItem);
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AppSortItem) obj).getEnable()) {
                arrayList3.add(obj);
            }
        }
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((AppSortItem) obj2).getEnable()) {
                arrayList4.add(obj2);
            }
        }
        arrayList2.addAll(arrayList4);
        appSort2.setAppsort(arrayList2);
        return appSort2;
    }

    @Nullable
    public static final List<AppSortItem> getL66AppSortFromDevice(@NotNull WearableDeviceModel deviceModel) {
        List<DisplayBean> listQueryDisplayListSync;
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel);
        if (huamiDevice == null || (listQueryDisplayListSync = huamiDevice.queryDisplayListSync(1)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listQueryDisplayListSync.size();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            int iConvertAppIdToType = convertAppIdToType(listQueryDisplayListSync.get(i).getAppId());
            if (iConvertAppIdToType == 38) {
                z = true;
            }
            if (iConvertAppIdToType == 10) {
                z2 = true;
            }
            if (iConvertAppIdToType == 57) {
                z3 = true;
            }
            int pageIndex = listQueryDisplayListSync.get(i).getPageIndex();
            if (pageIndex == 1) {
                arrayList.add(createL66Item$default(iConvertAppIdToType, 0, false, 6, null));
            } else if (pageIndex == 2) {
                arrayList.add(createL66Item$default(iConvertAppIdToType, 7, false, 4, null));
            } else if (pageIndex == 3) {
                arrayList2.add(createL66Item$default(iConvertAppIdToType, 0, false, 2, null));
            }
        }
        arrayList.addAll(arrayList2);
        Logger.i("getL66AppSortFromDevice isXiaomi: " + RomUtils.isXiaomi() + " hasSchedule: " + z + " hasPhoto: " + z2 + " supportPhoto: " + com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(deviceModel, Feature.TAKE_PHOTO), new Object[0]);
        if (RomUtils.isXiaomi() && !z) {
            arrayList.add(createL66Item$default(38, 7, false, 4, null));
        } else if (!RomUtils.isXiaomi() && z) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((AppSortItem) arrayList.get(i2)).getType() == 38) {
                    ListExtKt.remove(arrayList, i2);
                    break;
                }
            }
        }
        if (z2) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                if (((AppSortItem) arrayList.get(i3)).getType() == 10) {
                    ListExtKt.remove(arrayList, i3);
                    break;
                }
            }
        }
        if (AlexaExportUtilKt.isSupportAlexa(deviceModel) && !z3) {
            Logger.i(TAG, "add alexa to app sort list");
            arrayList.add(createItem$default(57, 7, false, 4, null));
        } else if (z3 && !AlexaExportUtilKt.isSupportAlexa(deviceModel)) {
            int size4 = arrayList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                if (((AppSortItem) arrayList.get(i4)).getType() == 57) {
                    ListExtKt.remove(arrayList, i4);
                    break;
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static final AppSort getL66DefaultAppSort(@NotNull WearableDeviceModel deviceModel) {
        String mac;
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (mac = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        AppSort appSort = new AppSort();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(createItem$default(18, 0, false, 6, null));
        arrayList.add(createItem$default(1, 0, false, 6, null));
        arrayList.add(createItem$default(2, 0, false, 6, null));
        arrayList.add(createItem$default(25, 0, false, 6, null));
        arrayList.add(createItem$default(36, 0, false, 6, null));
        arrayList.add(createItem$default(3, 0, false, 6, null));
        arrayList.add(createItem$default(20, 0, false, 6, null));
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(deviceModel, Feature.TRAINING_LOAD)) {
            arrayList.add(createItem$default(30, 0, false, 6, null));
        }
        arrayList.add(createItem$default(28, 0, false, 6, null));
        if (huaMiApiCaller != null && huaMiApiCaller.hasSoftwareFeature(47)) {
            arrayList.add(createItem$default(35, 0, false, 6, null));
        }
        if (RegionUtil.isInnerCN() && isMiliMainLand()) {
            arrayList.add(createItem$default(17, 0, false, 6, null));
        }
        if (huaMiApiCaller != null && huaMiApiCaller.hasSoftwareFeature(45) && RegionUtil.isInnerCN() && isMiliMainLand()) {
            arrayList.add(createItem$default(49, 0, false, 6, null));
        }
        arrayList.add(createItem$default(4, 0, false, 6, null));
        arrayList.add(createItem$default(11, 0, false, 6, null));
        arrayList.add(createItem$default(9, 0, false, 6, null));
        if (RomUtils.isXiaomi() && com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(deviceModel, "calendar")) {
            arrayList.add(createItem$default(38, 0, false, 6, null));
        }
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = currentLocale$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt__StringsJVMKt.startsWith$default(lowerCase, "zh", false, 2, null)) {
            arrayList.add(createItem$default(32, 0, false, 6, null));
        }
        if (isShowCards()) {
            arrayList.add(createItem$default(16, 0, false, 6, null));
        }
        arrayList.add(createItem$default(19, 0, false, 6, null));
        arrayList.add(createItem$default(67, 7, false, 4, null));
        if (Intrinsics.areEqual("male", UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex())) {
            arrayList2.add(createItem$default(29, 0, false, 2, null));
        } else {
            arrayList.add(createItem$default(29, 7, false, 4, null));
        }
        arrayList.add(createItem$default(51, 7, false, 4, null));
        arrayList.add(createItem$default(12, 7, false, 4, null));
        arrayList.add(createItem$default(13, 7, false, 4, null));
        arrayList.add(createItem$default(14, 7, false, 4, null));
        if (huaMiApiCaller != null && huaMiApiCaller.hasSoftwareFeature(20)) {
            arrayList.add(createItem$default(15, 7, false, 4, null));
        }
        arrayList.add(createItem$default(21, 7, false, 4, null));
        if (huaMiApiCaller != null && huaMiApiCaller.hasSoftwareFeature(43)) {
            arrayList.add(createItem$default(56, 7, false, 4, null));
        }
        arrayList.add(createItem$default(10, 7, false, 4, null));
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(deviceModel, "xiaoai") || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(deviceModel, "alexa")) {
            arrayList.add((huaMiApiCaller == null || !huaMiApiCaller.hasSoftwareFeature(16)) ? createItem$default(31, 7, false, 4, null) : createItem$default(57, 7, false, 4, null));
        }
        arrayList.addAll(arrayList2);
        appSort.setAppsort(arrayList);
        return appSort;
    }

    private static final int getL66ItemIndex(int i) {
        Integer num = getSL66SortIndexMap().get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @NotNull
    public static final AppSort getPanguDefaultAppSort(@NotNull WearableDeviceModel deviceModel) {
        String mac;
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (mac = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        AppSort appSort = new AppSort();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(createItem$default(18, 0, false, 6, null));
        arrayList.add(createItem$default(1, 0, false, 6, null));
        arrayList.add(createItem$default(25, 0, false, 6, null));
        arrayList.add(createItem$default(2, 0, false, 6, null));
        arrayList.add(createItem$default(36, 0, false, 6, null));
        if (huaMiApiCaller != null && huaMiApiCaller.hasSoftwareFeature(47)) {
            arrayList.add(createItem$default(35, 0, false, 6, null));
        }
        arrayList.add(createItem$default(6, 0, false, 6, null));
        arrayList.add(createItem$default(3, 0, false, 6, null));
        arrayList.add(createItem$default(20, 0, false, 6, null));
        arrayList.add(createItem$default(28, 0, false, 6, null));
        arrayList.add(createItem$default(51, 0, false, 6, null));
        if (Intrinsics.areEqual("male", UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex())) {
            arrayList2.add(createItem$default(29, 0, false, 2, null));
        } else {
            arrayList.add(createItem$default(29, 0, false, 6, null));
        }
        arrayList.add(createItem$default(21, 0, false, 6, null));
        arrayList.add(createItem$default(9, 0, false, 6, null));
        arrayList.add(createItem$default(4, 0, false, 6, null));
        if (RegionUtil.isInnerCN() && isMiliMainLand()) {
            arrayList.add(createItem$default(17, 0, false, 6, null));
        }
        if (huaMiApiCaller != null && huaMiApiCaller.hasSoftwareFeature(45) && RegionUtil.isInnerCN() && isMiliMainLand()) {
            arrayList.add(createItem$default(49, 0, false, 6, null));
        }
        arrayList.add(createItem$default(11, 0, false, 6, null));
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = currentLocale$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt__StringsJVMKt.startsWith$default(lowerCase, "zh", false, 2, null)) {
            arrayList.add(createItem$default(32, 0, false, 6, null));
        }
        arrayList.add(createItem$default(26, 0, false, 6, null));
        arrayList.add(createItem$default(19, 0, false, 6, null));
        arrayList.add(createItem$default(56, 7, false, 4, null));
        arrayList.add(createItem$default(10, 7, false, 4, null));
        arrayList.add(createItem$default(12, 7, false, 4, null));
        arrayList.add(createItem$default(13, 7, false, 4, null));
        arrayList.add(createItem$default(14, 7, false, 4, null));
        arrayList.add(createItem$default(15, 7, false, 4, null));
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(deviceModel, "xiaoai") || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(deviceModel, "alexa")) {
            arrayList.add(createItem$default(31, 7, false, 4, null));
        }
        if (isShowCards()) {
            arrayList.add(createItem$default(16, 7, false, 4, null));
        }
        arrayList.addAll(arrayList2);
        appSort.setAppsort(arrayList);
        return appSort;
    }

    private static final int getPanguItemIndex(int i) {
        Integer num = getSSortIndexMap().get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private static final Map<Integer, Integer> getSL66SortIndexMap() {
        return (Map) sL66SortIndexMap$delegate.getValue();
    }

    private static final Map<Integer, Integer> getSSortIndexMap() {
        return (Map) sSortIndexMap$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, Integer> initL66SortIndex() {
        HashMap map = new HashMap();
        map.put(18, 0);
        map.put(1, 1);
        map.put(2, 2);
        map.put(25, 3);
        map.put(36, 4);
        map.put(3, 5);
        map.put(20, 6);
        map.put(30, 7);
        map.put(28, 8);
        map.put(35, 9);
        map.put(17, 10);
        map.put(49, 11);
        map.put(4, 12);
        map.put(11, 13);
        map.put(9, 14);
        map.put(38, 15);
        map.put(32, 16);
        map.put(16, 17);
        map.put(19, 18);
        map.put(67, 19);
        map.put(29, 20);
        map.put(51, 21);
        map.put(12, 22);
        map.put(13, 23);
        map.put(14, 24);
        map.put(15, 25);
        map.put(26, 26);
        map.put(21, 27);
        map.put(56, 28);
        map.put(10, 29);
        map.put(31, 30);
        Logger.d(TAG, "initSortIndex total:31 ");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, Integer> initSortIndex() {
        HashMap map = new HashMap();
        map.put(18, 0);
        map.put(1, 1);
        map.put(25, 2);
        map.put(2, 3);
        map.put(36, 4);
        map.put(35, 5);
        map.put(6, 6);
        map.put(3, 7);
        map.put(20, 8);
        map.put(28, 9);
        map.put(51, 10);
        map.put(29, 11);
        map.put(21, 12);
        map.put(9, 13);
        map.put(4, 14);
        map.put(49, 15);
        map.put(17, 16);
        map.put(11, 17);
        map.put(32, 18);
        map.put(26, 19);
        map.put(19, 20);
        map.put(67, 21);
        map.put(56, 22);
        map.put(10, 23);
        map.put(12, 24);
        map.put(13, 25);
        map.put(14, 26);
        map.put(15, 27);
        map.put(31, 28);
        map.put(16, 29);
        map.put(57, 30);
        Logger.d(TAG, "initSortIndex total:31 ");
        return map;
    }

    private static final boolean isMiliMainLand() {
        String mac;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (mac = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller != null) {
            return huaMiApiCaller.isMiliMainLand();
        }
        return false;
    }

    private static final boolean isShowCards() {
        WearableDeviceModel wearableDeviceModel;
        if (RegionUtil.isInnerCN()) {
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel2 != null) {
                return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel2, "nfc");
            }
            return false;
        }
        if (isMiliMainLand() || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null) {
            return false;
        }
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MASTERCARD);
    }

    private static final void updateIndex(List<AppSortItem> list) {
        for (AppSortItem appSortItem : list) {
            appSortItem.setIndex(getPanguItemIndex(appSortItem.getType()));
        }
    }
}
