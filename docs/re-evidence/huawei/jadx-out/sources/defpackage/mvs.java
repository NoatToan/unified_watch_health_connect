package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mvs {
    public static String e(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return deviceInfo.getSecurityUuid() + "#ANDROID21";
        }
        return "";
    }

    public static long d(String str, int i, int i2, String str2) {
        String str3 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + ckg.b(str) + "_" + i;
        long jD = SharedPreferenceManager.d(String.valueOf(i2), str3, 0L);
        LogUtil.a("SampleSequenceUtil", "getLastTimeFromStorage identify:", cpl.a(str), ",dicId:", Integer.valueOf(i), ",storageKey:", str3, ",lastStorageTime:", Long.valueOf(jD), ",tag:", str2);
        return jD;
    }

    public static void c(String str, int i, long j, int i2, String str2) {
        String str3 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + ckg.b(str) + "_" + i;
        LogUtil.a("SampleSequenceUtil", "saveLastTimeToStorage storageKey:", cpl.a(str), ",dicId:", Integer.valueOf(i), ",storageKey:", str3, ",tag:", str2);
        SharedPreferenceManager.c(String.valueOf(i2), str3, j);
    }

    public static void c(final int i, List<HiHealthData> list) {
        if (list == null || list.size() == 1) {
            return;
        }
        Collections.sort(list, new Comparator<HiHealthData>() { // from class: mvs.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                if (i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()) {
                    return Long.compare(hiHealthData.getStartTime(), hiHealthData2.getStartTime());
                }
                return Long.compare(hiHealthData.getEndTime(), hiHealthData2.getEndTime());
            }
        });
        LogUtil.a("SampleSequenceUtil", "processHiHealthSubtype:", list);
    }

    public static void d(String str, LinkedList<mvh> linkedList) {
        e(str, linkedList, null);
    }

    public static void e(String str, LinkedList<mvh> linkedList, IBaseResponseCallback iBaseResponseCallback) {
        if (linkedList.isEmpty()) {
            LogUtil.j("SampleSequenceUtil", "onDataReceived singleInfosList is Empty");
            return;
        }
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        d(linkedList, linkedList2, linkedList3);
        if (!linkedList2.isEmpty()) {
            mzh mzhVarA = a(str, linkedList2);
            LogUtil.a("SampleSequenceUtil", "startToSync PointData");
            mzj.b().d("DIC_SYNC_TASK", mzhVarA, iBaseResponseCallback);
        }
        if (linkedList3.isEmpty()) {
            return;
        }
        mzh mzhVarA2 = a(str, linkedList3);
        LogUtil.a("SampleSequenceUtil", "startToSync SequenceData");
        mzj.b().d("DIC_SEQUENCE_SYNC_TASK", mzhVarA2, iBaseResponseCallback);
    }

    private static void d(LinkedList<mvh> linkedList, LinkedList<mvh> linkedList2, LinkedList<mvh> linkedList3) {
        for (mvh mvhVar : linkedList) {
            int iD = mvc.d(mvhVar.b());
            int iD2 = mvd.d(mvhVar.b());
            if (iD != -1) {
                linkedList2.add(mvhVar);
            }
            if (iD2 != -1) {
                linkedList3.add(mvhVar);
            }
        }
    }

    public static boolean d(boolean z) {
        int i = Calendar.getInstance().get(12);
        return (i == 0 || i == 1) && !BaseApplication.isRunningForeground() && z;
    }

    public static long c() {
        return new SecureRandom().nextInt(600000);
    }

    private static mzh a(String str, LinkedList<mvh> linkedList) {
        mzh mzhVar = new mzh();
        mzhVar.e(str);
        mzhVar.e(2);
        mzhVar.c(linkedList);
        return mzhVar;
    }
}
