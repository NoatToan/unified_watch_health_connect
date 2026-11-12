package defpackage;

import android.content.Context;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ljc {
    static int b(int i) {
        return (i == 1 || i == 2 || i == 3 || i == 4) ? 0 : 1;
    }

    static boolean e(Context context, int i, List<Integer> list) {
        if (PowerKitManager.a().b() || !CommonUtil.ab(context)) {
            LogUtil.j("HiH_HiSyncUtilStatic", "User is sleeping or network is break, can not check data status");
            return false;
        }
        try {
            List<SyncKey> listE = liq.e(context, 2, list, false);
            if (HiCommonUtil.b(listE)) {
                LogUtil.j("HiH_HiSyncUtilStatic", "checkDataStatus ansSyncKeys == null or ansSyncKeys.isEmpty()");
                return false;
            }
            for (SyncKey syncKey : listE) {
                Integer type = syncKey.getType();
                int iIntValue = type.intValue();
                Long version = syncKey.getVersion();
                long jLongValue = version.longValue();
                kul kulVarA = kxk.c().a(i, 0L, iIntValue);
                if (kulVarA == null) {
                    LogUtil.a("HiH_HiSyncUtilStatic", "checkDataStatus no such data in db ,type is ", type);
                    if (jLongValue > 0) {
                        LogUtil.d("HiH_HiSyncUtilStatic", "checkDataStatus syncAnchorTable = null and version > 0 ");
                        return true;
                    }
                } else {
                    long jH = kulVarA.h();
                    if (jH < jLongValue) {
                        LogUtil.d("HiH_HiSyncUtilStatic", "checkDataStatus local version is ", Long.valueOf(jH), " cloud version is ", version, " type is ", type);
                        return true;
                    }
                }
            }
            return false;
        } catch (lif e) {
            ReleaseLogUtil.a("HiH_HiSyncUtilStatic", "checkDataStatus error ,e is ", e.getMessage());
            return false;
        }
    }

    static HiHealthData a(Context context, int i) {
        List<Integer> listC = kyj.c().c(i);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("HiH_HiSyncUtilStatic", "getTodayNoSyncTotalValue clients = null");
            return null;
        }
        HiAggregateOption hiAggregateOptionB = liu.b();
        List<HiHealthData> listE = ljq.e(context, hiAggregateOptionB.getType()[0]).e(listC, hiAggregateOptionB);
        if (HiCommonUtil.b(listE)) {
            LogUtil.j("HiH_HiSyncUtilStatic", "getTodayNoSyncTotalValue datas is null or empty");
            return null;
        }
        return listE.get(0);
    }

    static List<HiHealthData> c(Context context, int i, int[] iArr, String[] strArr, int[] iArr2) {
        int[] iArrA = ljq.a(context, iArr);
        int[] iArrE = ljq.e(context, iArr);
        ArrayList arrayList = new ArrayList(10);
        List<HiHealthData> listA = a(context, i, iArrA, strArr, iArr2);
        List<HiHealthData> listA2 = a(context, i, iArrE, strArr, iArr2);
        if (listA != null) {
            arrayList.addAll(listA);
        }
        if (listA2 != null) {
            arrayList.addAll(listA2);
        }
        return arrayList;
    }

    private static List<HiHealthData> a(Context context, int i, int[] iArr, String[] strArr, int[] iArr2) {
        boolean z;
        if (iArr == null || iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        List<Integer> listC = ljq.d(context, i2).c(i, iArr);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("HiH_HiSyncUtilStatic", "getUploadStat no syncDays get !", " types is ", Arrays.toString(iArr));
            return null;
        }
        if (i2 == 44101) {
            List<Integer> listA = ljq.d(context, i2).a(i, iArr);
            if (!HiCommonUtil.b(listA)) {
                listC.removeAll(listA);
            }
            if (HiCommonUtil.b(listC)) {
                LogUtil.j("HiH_HiSyncUtilStatic", "getUploadStat no syncDays get !", " types is ", Arrays.toString(iArr));
                return null;
            }
            z = true;
        } else {
            z = false;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setCount(iArr2[0]);
        hiAggregateOption.setSortOrder(iArr2[1]);
        List<HiHealthData> listD = ljq.e(context, i2).d(i, listC, hiAggregateOption, z);
        if (HiCommonUtil.b(listD)) {
            LogUtil.j("HiH_HiSyncUtilStatic", "getUploadStat no stat get !", " types is ", Arrays.toString(iArr));
            return null;
        }
        LogUtil.a("HiH_HiSyncUtilStatic", "getUploadStat syncDays size is ", Integer.valueOf(listC.size()), " types is ", Arrays.toString(iArr));
        return listD;
    }

    static List<Integer> e(Context context, int i) {
        return kww.c(context).c(i);
    }
}
