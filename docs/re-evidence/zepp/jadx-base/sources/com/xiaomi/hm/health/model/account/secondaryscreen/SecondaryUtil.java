package com.xiaomi.hm.health.model.account.secondaryscreen;

import androidx.annotation.VisibleForTesting;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
class SecondaryUtil {
    private static final int DTH_SECONDARY_SIZE = 7;
    private static SecondaryUtil INSTANCE = null;
    private static final String TAG = "SecondaryUtil";
    private static final int TONLESAP_SECONDARY_SIZE = 5;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource = iArr;
            try {
                iArr[HMDeviceSource.MILI_TEMPO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_BEATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_BEATS_W.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_BEATS_P.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_CINCO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_CINCO_L.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_DTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[HMDeviceSource.MILI_DTH_W.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private SecondaryUtil() {
    }

    public static void adjustSecondary(Map<HMDeviceSource, List<SecondaryModel>> map) {
        upgradeDth(map);
        upgradeTonlesapo(map);
        upgradeTonlesapol(map);
    }

    public static SecondaryUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SecondaryUtil();
        }
        return INSTANCE;
    }

    public static List<SecondaryModel> initDthDefaultConfig() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 0, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, true, 1, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 16, true, 2, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, true, 3, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, true, 4, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, true, 5, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, 6, true));
        return arrayList;
    }

    public static List<SecondaryModel> initTonlesapDefaultConfigNew() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 0, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, true, 1, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, true, 2, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, true, 3, true));
        arrayList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, 4, true));
        return arrayList;
    }

    private boolean isSupportCalendar() {
        return Country.isChina() || Country.isHK() || Country.isTW();
    }

    private static void upgradeDth(Map<HMDeviceSource, List<SecondaryModel>> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_DTH;
        List<SecondaryModel> list = map.get(hMDeviceSource);
        if (list != null && list.size() == 7) {
            HMLog.i(TAG, "upgradeDth no need", new Object[0]);
        } else {
            HMLog.i(TAG, "upgradeDth", new Object[0]);
            map.put(hMDeviceSource, initDthDefaultConfig());
        }
    }

    private static void upgradeTonlesapo(Map<HMDeviceSource, List<SecondaryModel>> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TONLESAP_O;
        List<SecondaryModel> list = map.get(hMDeviceSource);
        if (list != null && list.size() == 5) {
            HMLog.i(TAG, "upgradeTonlesapo no need", new Object[0]);
        } else {
            HMLog.i(TAG, "upgradeTonlesapo", new Object[0]);
            map.put(hMDeviceSource, initTonlesapDefaultConfigNew());
        }
    }

    private static void upgradeTonlesapol(Map<HMDeviceSource, List<SecondaryModel>> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TONLESAP_OL;
        List<SecondaryModel> list = map.get(hMDeviceSource);
        if (list != null && list.size() == 5) {
            HMLog.i(TAG, "upgradeTonlesapol no need", new Object[0]);
        } else {
            HMLog.i(TAG, "upgradeTonlesapol", new Object[0]);
            map.put(hMDeviceSource, initTonlesapDefaultConfigNew());
        }
    }

    public void adjustMusic(Map<HMDeviceSource, List<SecondaryModel>> map) {
        for (Map.Entry<HMDeviceSource, List<SecondaryModel>> entry : map.entrySet()) {
            adjustMusic(entry.getValue(), entry.getKey());
        }
    }

    public void initBeatsDTHDefaultConfig(List<SecondaryModel> list, boolean z) {
        boolean z2 = HMAppSortDataManager.shouldShowAlipay() && !z;
        list.add(new SecondaryModel(4, true, 0));
        if (z2) {
            list.add(new SecondaryModel(1, true, 1));
            list.add(new SecondaryModel(2, false, 2));
        } else if (z) {
            list.add(new SecondaryModel(2, true, 1));
            list.add(new SecondaryModel(1, false, 2));
        } else {
            list.add(new SecondaryModel(1, false, 1));
            list.add(new SecondaryModel(2, false, 2));
        }
    }

    public void initBeatsDefaultConfig(List<SecondaryModel> list, boolean z) {
        boolean z2 = HMAppSortDataManager.shouldShowAlipay() && !z;
        list.add(new SecondaryModel(4, true, 0));
        if (z2) {
            list.add(new SecondaryModel(1, true, 1));
            list.add(new SecondaryModel(2, false, 2));
        } else if (z) {
            list.add(new SecondaryModel(2, true, 1));
            list.add(new SecondaryModel(1, false, 2));
        } else {
            list.add(new SecondaryModel(1, false, 1));
            list.add(new SecondaryModel(2, false, 2));
        }
    }

    public void initBeatsPDefaultConfig(List<SecondaryModel> list) {
        if (HMAppSortDataManager.shouldShowAlipay()) {
            list.add(new SecondaryModel(3, true, 0));
            list.add(new SecondaryModel(1, true, 1));
            list.add(new SecondaryModel(4, false, 2));
            list.add(new SecondaryModel(2, false, 3));
            return;
        }
        list.add(new SecondaryModel(3, true, 0));
        list.add(new SecondaryModel(1, false, 1));
        list.add(new SecondaryModel(4, false, 2));
        list.add(new SecondaryModel(2, false, 3));
    }

    public void initCincoDefaultConfig(List<SecondaryModel> list) {
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 16, true, 0, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, true, 1, true));
    }

    public void initKongmingDefaultConfig(List<SecondaryModel> list) {
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 6, true, 0, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 31, true, 1, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 18, true, 2, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, 3, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 4, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, false, 5, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, false, 6, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, false, 7, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 28, false, 8, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 51, false, 9, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 29, false, 10, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 21, false, 11, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 3, false, 12, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 16, false, 13, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 8, false, 14, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 9, false, 15, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 10, false, 16, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 12, false, 17, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 13, false, 18, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 14, false, 19, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 15, false, 20, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, false, 21, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 26, false, 22, true));
        if (isSupportCalendar()) {
            list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 32, false, 23, true));
        }
    }

    public void initKongmingLDefaultConfig(List<SecondaryModel> list) {
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 6, true, 0, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 18, true, 1, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, 2, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 3, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, false, 4, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, false, 5, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, false, 6, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 28, false, 7, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 51, false, 8, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 29, false, 9, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 21, false, 10, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 3, false, 11, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 8, false, 12, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 9, false, 13, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 10, false, 14, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 12, false, 15, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 13, false, 16, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 14, false, 17, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 15, false, 18, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, false, 19, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 26, false, 20, true));
        if (isSupportCalendar()) {
            list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 32, false, 21, true));
        }
    }

    public void initKongmingProDefaultConfig(List<SecondaryModel> list) {
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 0, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 31, true, 1, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 18, true, 2, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 16, true, 3, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, 4, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, false, 5, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, false, 6, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, false, 7, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 36, false, 8, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 6, false, 9, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 3, false, 10, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 30, false, 11, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 28, false, 12, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 51, false, 13, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 29, false, 14, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 21, false, 15, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 8, false, 16, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 9, false, 17, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 10, false, 18, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 12, false, 19, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 13, false, 20, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 14, false, 21, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 15, false, 22, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, false, 23, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 26, false, 24, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 32, false, 25, true));
    }

    public void initKongmingProLDefaultConfig(List<SecondaryModel> list) {
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 0, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 31, true, 1, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 18, true, 2, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, 3, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, false, 4, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, false, 5, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, false, 6, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 36, false, 7, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 6, false, 8, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 3, false, 9, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 30, false, 10, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 28, false, 11, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 51, false, 12, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 29, false, 13, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 21, false, 14, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 8, false, 15, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 9, false, 16, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 10, false, 17, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 12, false, 18, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 13, false, 19, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 14, false, 20, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 15, false, 21, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, false, 22, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 26, false, 23, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 32, false, 24, true));
    }

    public void initL66DefaultConfig(List<SecondaryModel> list, boolean z) {
        int i;
        int i2;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 0, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 49, true, 1, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, true, 2, true));
        if (z) {
            list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 31, true, 3, true));
            i = 4;
        } else {
            i = 3;
        }
        int i3 = i + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 18, true, i, true));
        if (z) {
            list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 16, true, i3, true));
            i2 = i3 + 1;
        } else {
            i2 = i3;
        }
        int i4 = i2 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, i2, true));
        int i5 = i4 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, false, i4, true));
        int i6 = i5 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, false, i5, true));
        int i7 = i6 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, false, i6, true));
        int i8 = i7 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 36, false, i7, true));
        int i9 = i8 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 35, false, i8, true));
        int i10 = i9 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 6, false, i9, true));
        int i11 = i10 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 3, false, i10, true));
        int i12 = i11 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 30, false, i11, true));
        int i13 = i12 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 28, false, i12, true));
        int i14 = i13 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 51, false, i13, true));
        int i15 = i14 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 29, false, i14, true));
        int i16 = i15 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 21, false, i15, true));
        int i17 = i16 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 8, false, i16, true));
        int i18 = i17 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 9, false, i17, true));
        int i19 = i18 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 67, false, i18, true));
        int i20 = i19 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 10, false, i19, true));
        int i21 = i20 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 12, false, i20, true));
        int i22 = i21 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 13, false, i21, true));
        int i23 = i22 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 56, false, i22, true));
        int i24 = i23 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 14, false, i23, true));
        int i25 = i24 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 15, false, i24, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 26, false, i25, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 32, false, i25 + 1, true));
    }

    public void initPanguDefaultConfig(List<SecondaryModel> list, boolean z) {
        int i;
        int i2;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 0, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 49, true, 1, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, true, 2, true));
        if (z) {
            list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 31, true, 3, true));
            i = 4;
        } else {
            i = 3;
        }
        int i3 = i + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 18, true, i, true));
        if (z) {
            list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 16, true, i3, true));
            i2 = i3 + 1;
        } else {
            i2 = i3;
        }
        int i4 = i2 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, i2, true));
        int i5 = i4 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, false, i4, true));
        int i6 = i5 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, false, i5, true));
        int i7 = i6 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, false, i6, true));
        int i8 = i7 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 36, false, i7, true));
        int i9 = i8 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 35, false, i8, true));
        int i10 = i9 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 6, false, i9, true));
        int i11 = i10 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 3, false, i10, true));
        int i12 = i11 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 30, false, i11, true));
        int i13 = i12 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 28, false, i12, true));
        int i14 = i13 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 51, false, i13, true));
        int i15 = i14 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 29, false, i14, true));
        int i16 = i15 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 21, false, i15, true));
        int i17 = i16 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 8, false, i16, true));
        int i18 = i17 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 9, false, i17, true));
        int i19 = i18 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 67, false, i18, true));
        int i20 = i19 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 10, false, i19, true));
        int i21 = i20 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 12, false, i20, true));
        int i22 = i21 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 13, false, i21, true));
        int i23 = i22 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 56, false, i22, true));
        int i24 = i23 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 14, false, i23, true));
        int i25 = i24 + 1;
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 15, false, i24, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 26, false, i25, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 32, false, i25 + 1, true));
    }

    public void initTonlesapDefaultConfig(List<SecondaryModel> list, boolean z) {
        boolean z2 = HMAppSortDataManager.shouldShowAlipay() && !z;
        list.add(new SecondaryModel(4, true, 0));
        if (z2) {
            list.add(new SecondaryModel(1, true, 1));
            list.add(new SecondaryModel(2, false, 2));
        } else if (z) {
            list.add(new SecondaryModel(2, true, 1));
            list.add(new SecondaryModel(1, false, 2));
        } else {
            list.add(new SecondaryModel(1, false, 1));
            list.add(new SecondaryModel(2, false, 2));
        }
    }

    public void initYorkDefaultConfig(List<SecondaryModel> list) {
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 6, true, 0, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 57, true, 1, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 18, true, 2, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 4, true, 3, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 11, true, 4, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 1, false, 5, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 25, false, 6, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 2, false, 7, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 36, false, 8, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 28, false, 9, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 29, false, 10, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 21, false, 11, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 3, false, 12, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 8, false, 13, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 9, false, 14, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 10, false, 15, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 12, false, 16, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 13, false, 17, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 14, false, 18, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 15, false, 19, true));
        list.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 26, false, 20, true));
    }

    @VisibleForTesting
    public void removeFunc(List<SecondaryModel> list, int i) {
        list.remove(new SecondaryModel(i, false, -1));
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.get(i2).setIndex(i2);
        }
    }

    @VisibleForTesting
    public void upgradeMusic(List<SecondaryModel> list) {
        Iterator<SecondaryModel> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().isEnable()) {
                i++;
            }
        }
        if (i == 0) {
            for (SecondaryModel secondaryModel : list) {
                secondaryModel.setIndex(secondaryModel.getIndex() + 1);
            }
            list.add(new SecondaryModel(4, true, 0));
            return;
        }
        if (i != 1) {
            list.add(new SecondaryModel(4, false, list.size()));
            return;
        }
        for (SecondaryModel secondaryModel2 : list) {
            if (!secondaryModel2.isEnable()) {
                secondaryModel2.setIndex(secondaryModel2.getIndex() + 1);
            }
        }
        list.add(new SecondaryModel(4, true, 1));
    }

    public void upgradeTempoToMusic(List<SecondaryModel> list) {
        if (list.size() == 0) {
            list.add(new SecondaryModel(4, true, 0));
            SecondaryModel secondaryModel = new SecondaryModel(1, false, 1);
            secondaryModel.setEnable(HMAppSortDataManager.shouldShowAlipay());
            secondaryModel.setUpdated(true);
            list.add(secondaryModel);
            list.add(new SecondaryModel(2, false, 2));
            return;
        }
        Iterator<SecondaryModel> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().isEnable()) {
                i++;
            }
        }
        if (i == 2) {
            list.add(new SecondaryModel(4, false, 2));
            return;
        }
        if (i != 1) {
            for (SecondaryModel secondaryModel2 : list) {
                secondaryModel2.setIndex(secondaryModel2.getIndex() + 1);
            }
            list.add(new SecondaryModel(4, true, 0));
            return;
        }
        SecondaryModel secondaryModel3 = null;
        for (SecondaryModel secondaryModel4 : list) {
            if (secondaryModel4.getType() == 1) {
                secondaryModel3 = secondaryModel4;
                break;
            }
        }
        Objects.requireNonNull(secondaryModel3);
        if (secondaryModel3.isEnable()) {
            list.clear();
            list.add(new SecondaryModel(1, true, 0));
            list.add(new SecondaryModel(4, true, 1));
            list.add(new SecondaryModel(2, false, 2));
            return;
        }
        list.clear();
        list.add(new SecondaryModel(2, true, 0));
        list.add(new SecondaryModel(4, true, 1));
        list.add(new SecondaryModel(1, false, 2));
    }

    public List<SecondaryModel> adjustMusic(List<SecondaryModel> list, HMDeviceSource hMDeviceSource) {
        switch (AnonymousClass1.$SwitchMap$com$xiaomi$hm$health$bt$device$HMDeviceSource[hMDeviceSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return adjustMusic(list, true);
            case 5:
            case 6:
                return list;
            default:
                return adjustMusic(list, true);
        }
    }

    private List<SecondaryModel> adjustMusic(List<SecondaryModel> list, boolean z) {
        boolean zContains = list.contains(new SecondaryModel(4, false, -1));
        if (z && !zContains) {
            upgradeMusic(list);
        } else if (!z && zContains) {
            removeFunc(list, 4);
        }
        return list;
    }
}
