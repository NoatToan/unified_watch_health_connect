package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetBindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSyncVersionsReq;
import com.huawei.hwcloudmodel.model.unite.GetSyncVersionsRsp;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwcloudmodel.model.userprofile.DeviceInfo;
import com.huawei.hwcloudmodel.model.userprofile.GetBindDeviceRsp;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lio {
    static List<SyncKey> c(Context context, int i, int i2) {
        if (context == null) {
            return null;
        }
        SyncKey syncKey = new SyncKey();
        syncKey.setDataType(Integer.valueOf(i));
        syncKey.setType(Integer.valueOf(i2));
        syncKey.setVersion(Long.valueOf(System.currentTimeMillis()));
        syncKey.setDeviceCode(0L);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(syncKey);
        return arrayList;
    }

    static HiDeviceInfo a(Context context, long j) throws lif {
        if (context == null || j == 0) {
            return null;
        }
        GetBindDeviceReq getBindDeviceReq = new GetBindDeviceReq();
        getBindDeviceReq.setDeviceCode(Long.valueOf(j));
        GetBindDeviceRsp getBindDeviceRspC = lqo.b(context).c(getBindDeviceReq);
        if (!lih.e(getBindDeviceRspC, true)) {
            LogUtil.e("HiH_HiSyncUtil", "getOneBindDevice error,no device get from cloud");
            return liv.d().c(j);
        }
        List<DeviceInfo> deviceInfos = getBindDeviceRspC.getDeviceInfos();
        if (deviceInfos == null || deviceInfos.isEmpty()) {
            LogUtil.e("HiH_HiSyncUtil", "getOneBindDevice error,deviceInfos is null or empty");
            return liv.d().c(j);
        }
        DeviceInfo deviceInfo = deviceInfos.get(0);
        if (deviceInfo == null) {
            LogUtil.e("HiH_HiSyncUtil", "getOneBindDevice error,deviceInfo is null");
            return liv.d().c(j);
        }
        return liv.d().a(deviceInfo);
    }

    static DeviceInfo c(Context context, long j) throws lif {
        if (context != null && j != 0) {
            GetBindDeviceReq getBindDeviceReq = new GetBindDeviceReq();
            getBindDeviceReq.setDeviceCode(Long.valueOf(j));
            GetBindDeviceRsp getBindDeviceRspC = lqo.b(context).c(getBindDeviceReq);
            if (!lih.e(getBindDeviceRspC, true)) {
                LogUtil.e("HiH_HiSyncUtil", "getCloudBindDevice error,no device get from cloud");
                return null;
            }
            List<DeviceInfo> deviceInfos = getBindDeviceRspC.getDeviceInfos();
            if (deviceInfos == null || deviceInfos.isEmpty()) {
                LogUtil.e("HiH_HiSyncUtil", "getCloudBindDevice error,deviceInfos is null or empty");
            } else {
                return deviceInfos.get(0);
            }
        }
        return null;
    }

    static SparseArray<Integer> b(long j, long j2, int i) {
        if (j > j2 || j < 1388509200000L || i < 1) {
            LogUtil.j("HiH_HiSyncUtil", "divideDate error input startTime is ", Long.valueOf(j), " , endTime is ", Long.valueOf(j2), " , range is ", Integer.valueOf(i));
            return null;
        }
        if (HiDateUtil.d(j) < 20140101) {
            j = HiDateUtil.a(20140101);
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar2.setTimeInMillis(j2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        SparseArray<Integer> sparseArray = new SparseArray<>();
        while (true) {
            try {
                int i2 = Integer.parseInt(simpleDateFormat.format(calendar.getTime()));
                Integer numValueOf = Integer.valueOf(i2);
                calendar.add(5, i);
                if (!calendar.before(calendar2)) {
                    calendar.add(5, -i);
                    int i3 = Integer.parseInt(simpleDateFormat.format(calendar2.getTime()));
                    numValueOf.getClass();
                    sparseArray.put(i2, Integer.valueOf(i3));
                    return sparseArray;
                }
                int i4 = Integer.parseInt(simpleDateFormat.format(calendar.getTime()));
                calendar.add(5, 1);
                numValueOf.getClass();
                sparseArray.put(i2, Integer.valueOf(i4));
            } catch (Exception e) {
                ReleaseLogUtil.a("HiH_HiSyncUtil", "divideDate date change Exception", LogAnonymous.b(e));
                return null;
            }
        }
    }

    static List<SyncKey> b(Context context, int i, List<Integer> list, boolean z) throws lif {
        if (context == null || njy.e(list)) {
            return null;
        }
        List<SyncKey> listE = e(i, list, z);
        GetSyncVersionsReq getSyncVersionsReq = new GetSyncVersionsReq();
        getSyncVersionsReq.setSyncKeys(listE);
        GetSyncVersionsRsp getSyncVersionsRspA = lqo.b(context).a(getSyncVersionsReq);
        LogUtil.a("HiH_HiSyncUtil", "getVersionByType Rsp is ", getSyncVersionsRspA);
        lih.e(getSyncVersionsRspA, true);
        return getSyncVersionsRspA.getVersions();
    }

    public static List<SyncKey> d(Context context, int i, List<Integer> list, List<Integer> list2) throws lif {
        if (context == null) {
            return new ArrayList();
        }
        if (!Utils.h()) {
            LogUtil.a("HiH_HiSyncUtil", "getALLVersion fail, no cloud version");
            throw new lif("no cloud version");
        }
        List<SyncKey> listE = e(i, list, false);
        listE.addAll(e(i, list2, true));
        GetSyncVersionsReq getSyncVersionsReq = new GetSyncVersionsReq();
        getSyncVersionsReq.setSyncKeys(listE);
        GetSyncVersionsRsp getSyncVersionsRspA = lqo.b(context).a(getSyncVersionsReq);
        LogUtil.a("HiH_HiSyncUtil", "getVersionByType Rsp is ", getSyncVersionsRspA);
        lih.e(getSyncVersionsRspA, true);
        return getSyncVersionsRspA.getVersions();
    }

    private static List<SyncKey> e(int i, List<Integer> list, boolean z) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Integer num : list) {
            SyncKey syncKey = new SyncKey();
            syncKey.setDataType(Integer.valueOf(i));
            syncKey.setType(num);
            arrayList.add(syncKey);
            if (z) {
                syncKey.setCategory("SampleStatistic");
            }
        }
        return arrayList;
    }

    static Map<Integer, Long> d(Context context, List<Integer> list) {
        if (context != null && list != null && !list.isEmpty()) {
            lhw lhwVar = new lhw();
            lhwVar.a(list);
            lhv lhvVar = (lhv) oet.d().e(lhwVar.getUrl(), lqo.b(context).b().getHeaders(), ofe.c(lqo.b(context).b().getBody(lhwVar)), lhv.class);
            LogUtil.a("HiH_HiSyncUtil", "getBusinessDataVersion Rsp is ", lhvVar);
            try {
                lih.e(lhvVar, true);
                if (lhvVar == null) {
                    return null;
                }
                return lhvVar.a();
            } catch (lif e) {
                ReleaseLogUtil.d("HiH_HiSyncUtil", "getBusinessDataVersion syncException ", e.getMessage());
            }
        }
        return null;
    }
}
