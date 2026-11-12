package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiConfigDataType;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class ljz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<String> f40359a = new ArrayList(10);

    public static List<HiHealthData> b(Context context, List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        f40359a.clear();
        c(context, arrayList, list);
        return arrayList;
    }

    private static void c(Context context, List<HiHealthData> list, List<HiHealthData> list2) {
        for (HiHealthData hiHealthData : list2) {
            int type = hiHealthData.getType();
            int userId = hiHealthData.getUserId();
            switch (AnonymousClass3.e[HiHealthDataType.d(type).ordinal()]) {
                case 1:
                    e(list, hiHealthData, HiHealthDataType.c(type), c(hiHealthData), userId);
                    break;
                case 2:
                    if (type == DicDataTypeUtil.DataType.SLEEP_DETAILS.value()) {
                        long jR = HiDateUtil.r(hiHealthData.getEndTime());
                        hiHealthData.setStartTime(hiHealthData.getEndTime());
                        e(list, hiHealthData, 22100, jR, userId);
                    } else if (HiHealthDictManager.a(context).a(type) != null && HiHealthDictManager.a(context).n(type)) {
                        e(list, hiHealthData, type, c(hiHealthData), userId);
                    } else if (type <= 30999) {
                        e(list, hiHealthData, 30001, c(hiHealthData), userId);
                    } else {
                        LogUtil.a("HiH_HiStatUtil", "SEQUENCE is not supported, type is ", Integer.valueOf(hiHealthData.getType()));
                    }
                    break;
                case 3:
                    if (HiHealthDictManager.a(context).a(type) != null) {
                        a(context, list, hiHealthData, c(hiHealthData));
                    }
                    break;
                case 4:
                    e(list, type, userId, hiHealthData);
                    break;
                case 5:
                    if (40054 == type) {
                        e(list, hiHealthData, type, c(hiHealthData), userId);
                    }
                    break;
                case 6:
                    int[] iArrD = HiConfigDataType.d(type);
                    if (iArrD != null) {
                        for (int i : iArrD) {
                            e(list, hiHealthData, i, c(hiHealthData), userId);
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ljz$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            e = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[HiHealthDataType.Category.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[HiHealthDataType.Category.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[HiHealthDataType.Category.SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[HiHealthDataType.Category.STAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[HiHealthDataType.Category.CONFIG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static long c(HiHealthData hiHealthData) {
        return HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
    }

    private static void e(List<HiHealthData> list, int i, int i2, HiHealthData hiHealthData) {
        if (i <= 21000) {
            e(list, hiHealthData, 20001, c(hiHealthData), i2);
            return;
        }
        if (i <= 22099) {
            e(list, hiHealthData, 22000, HiDateUtil.r(hiHealthData.getStartTime()), i2);
        } else if (i <= 22199) {
            e(list, hiHealthData, 22100, HiDateUtil.r(hiHealthData.getStartTime()), i2);
        } else {
            LogUtil.a("HiH_HiStatUtil", "getStatList in else branch");
        }
    }

    private static void e(List<HiHealthData> list, HiHealthData hiHealthData, int i, long j, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        String str = Integer.toString(i) + "_" + j + "_" + i2;
        if (f40359a.contains(str)) {
            return;
        }
        hiHealthData.setType(i);
        hiHealthData.setSequenceData(null);
        hiHealthData.setMetaData(null);
        list.add(hiHealthData);
        f40359a.add(str);
    }

    private static void a(Context context, List<HiHealthData> list, HiHealthData hiHealthData, long j) {
        try {
            HashMap map = (HashMap) new Gson().fromJson(hiHealthData.getFieldsValue(), new TypeToken<HashMap<Integer, Double>>() { // from class: com.huawei.hihealthservice.util.HiStatUtil$1
            }.getType());
            if (map == null) {
                LogUtil.a("HiH_HiStatUtil", "FieldsValue is null, do not need stat");
            } else {
                e(context, list, hiHealthData, j, new ArrayList(map.keySet()));
            }
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.e("HiH_HiStatUtil", "FromJson JsonSyntaxException ", e.getMessage());
        }
    }

    private static void e(Context context, List<HiHealthData> list, HiHealthData hiHealthData, long j, List<Integer> list2) {
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(context).c(iIntValue);
            if (hiHealthDictFieldC != null && hiHealthDictFieldC.j() != null) {
                HiHealthData hiHealthData2 = new HiHealthData();
                hiHealthData2.setStartTime(hiHealthData.getStartTime());
                hiHealthData2.setEndTime(hiHealthData.getEndTime());
                hiHealthData2.setSyncStatus(hiHealthData.getSyncStatus());
                hiHealthData2.setUserId(hiHealthData.getUserId());
                e(list, hiHealthData2, iIntValue, j, hiHealthData.getUserId());
            }
        }
    }

    public static void c(Context context, int i, int i2, boolean z) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sync_record", 0);
        if (i2 == 30023) {
            sharedPreferences.edit().putBoolean("statBasketballDataCompleteFlag" + i, z).apply();
            return;
        }
        sharedPreferences.edit().putBoolean("statCommonDataCompleteFlag" + i, z).apply();
    }

    public static boolean e(Context context, int i, int i2) {
        if (context == null) {
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sync_record", 0);
        if (i2 == 30023) {
            return sharedPreferences.getBoolean("statBasketballDataCompleteFlag" + i, false);
        }
        return sharedPreferences.getBoolean("statCommonDataCompleteFlag" + i, false);
    }

    public static boolean d(int i, int i2, int i3, int[] iArr) {
        if (HiCommonUtil.e(iArr)) {
            ReleaseLogUtil.e("HiH_HiStatUtil", "statTypes is null empty!");
            return false;
        }
        kww kwwVarD = ljq.d(BaseApplication.getContext(), iArr[0]);
        List<kuk> listC = kwwVarD.c(i, i2, i3, iArr);
        if (HiCommonUtil.b(listC)) {
            ReleaseLogUtil.e("HiH_HiStatUtil", "cleanAllStatDatas statLastDatas are null and oldStatTables are null");
            return false;
        }
        Iterator<kuk> it = listC.iterator();
        while (it.hasNext()) {
            kwwVarD.c(it.next().a(), 2);
        }
        ReleaseLogUtil.d("HiH_HiStatUtil", "Clean all stat data, one statType is ", Integer.valueOf(iArr[0]));
        return true;
    }

    public static boolean c(kuk kukVar, int[] iArr) {
        if (kukVar == null) {
            ReleaseLogUtil.e("HiH_HiStatUtil", "statTable is null!");
            return false;
        }
        if (iArr.length == 0) {
            ReleaseLogUtil.e("HiH_HiStatUtil", "statTypes is empty!");
            return false;
        }
        List<kuk> listA = kww.c(BaseApplication.getContext()).a(kukVar.e(), kukVar.c(), iArr);
        if (HiCommonUtil.b(listA)) {
            ReleaseLogUtil.e("HiH_HiStatUtil", "cleanAllStatDatas statLastDatas are null and oldStatTables are null");
            return false;
        }
        Iterator<kuk> it = listA.iterator();
        while (it.hasNext()) {
            kww.c(BaseApplication.getContext()).c(it.next().a(), 2);
        }
        ReleaseLogUtil.d("HiH_HiStatUtil", "Clean all stat data,  one statType is ", Integer.valueOf(iArr[0]), " day =", Integer.valueOf(kukVar.e()));
        return true;
    }
}
