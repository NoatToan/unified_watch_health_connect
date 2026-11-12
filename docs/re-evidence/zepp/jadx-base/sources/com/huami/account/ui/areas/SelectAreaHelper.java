package com.huami.account.ui.areas;

import com.huami.account.AccountExternalsKt;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.model.Area;
import java.util.List;
import kotlin.Deprecated;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "使用 SelectAreaManager 中对应的方法")
public class SelectAreaHelper {
    public static final String BY = "BY";
    public static final String CN = "CN";
    public static final String EU = "EU";
    public static final String HK = "HK";
    public static final String IN = "IN";
    public static final String KR = "KR";
    public static final String MO = "MO";
    public static final String RU = "RU";
    public static final String SG = "SG";
    public static final String TW = "TW";
    public static final String UA = "UA";
    public static final String US = "US";

    public static synchronized List<Area> getAll() {
        return SelectAreaManager.INSTANCE.getAll();
    }

    public static Area getArea() {
        return SelectAreaManager.INSTANCE.getArea();
    }

    public static Area getAreaByCountryCode(String str) {
        return SelectAreaManager.INSTANCE.getAreaByCountryCode(str);
    }

    public static Area getAreaBySave() {
        return SelectAreaManager.INSTANCE.getAreaBySave();
    }

    public static Area getDefaultArea() {
        return SelectAreaManager.getDefaultArea();
    }

    public static Area getUnknownArea() {
        return SelectAreaManager.INSTANCE.getUnknownArea();
    }

    public static boolean isBY(Area area) {
        return SelectAreaManager.INSTANCE.isBY(area);
    }

    public static boolean isCN(Area area) {
        return SelectAreaManager.INSTANCE.isCN(area);
    }

    public static boolean isEU(Area area) {
        return SelectAreaManager.INSTANCE.isEU(area);
    }

    public static boolean isHK(Area area) {
        return SelectAreaManager.INSTANCE.isHK(area);
    }

    public static boolean isIN(Area area) {
        return SelectAreaManager.INSTANCE.isIN(area);
    }

    public static boolean isKR(Area area) {
        return SelectAreaManager.INSTANCE.isKR(area);
    }

    public static boolean isMO(Area area) {
        return SelectAreaManager.INSTANCE.isMO(area);
    }

    public static boolean isRU(Area area) {
        return SelectAreaManager.INSTANCE.isRU(area);
    }

    public static boolean isSG(Area area) {
        return SelectAreaManager.INSTANCE.isSG(area);
    }

    public static boolean isShowUxAgreement(Area area) {
        return AccountExternalsKt.getConfigDelegate().isShowUxAgreement(area.getValue());
    }

    public static boolean isTW(Area area) {
        return SelectAreaManager.INSTANCE.isTW(area);
    }

    public static boolean isUA(Area area) {
        return SelectAreaManager.INSTANCE.isUA(area);
    }

    public static boolean isUS(Area area) {
        return SelectAreaManager.INSTANCE.isUS(area);
    }

    public static boolean isUnknown(Area area) {
        return SelectAreaManager.INSTANCE.isUnknown(area);
    }

    public static boolean isUsCalifornia(String str, String str2) {
        return SelectAreaManager.INSTANCE.isUsCalifornia(str, str2);
    }

    public static void saveArea(Area area) {
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        hMAccountKeeper.setLastSelectArea(area.getKey());
        hMAccountKeeper.setLastSelectAreaCode(area.getValue());
    }
}
