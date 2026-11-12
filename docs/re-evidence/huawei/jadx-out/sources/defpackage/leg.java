package defpackage;

import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealth.DataReportModel;
import com.huawei.hihealth.IRegisterRealTimeCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class leg {
    private static Bundle j = new Bundle();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Bundle f39970b = new Bundle();
    private static Bundle h = new Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, List<IRegisterRealTimeCallback>> f39971c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Long> f39969a = new HashMap();
    private static Map<String, Long> e = new HashMap();
    private static Map<String, Integer> d = new HashMap();

    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    public static void c(DataReportModel dataReportModel, int i, RemoteCallbackList<IRegisterRealTimeCallback> remoteCallbackList) {
        int reportType = dataReportModel.getReportType();
        int reportValue = dataReportModel.getReportValue();
        int maxReportValue = dataReportModel.getMaxReportValue();
        String string = dataReportModel.toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        boolean z = false;
        if (reportType == CharacteristicConstant.ReportType.TARGET.getReportTypeValue()) {
            if (f39971c.get(string) != null && !f39971c.get(string).isEmpty()) {
                z = true;
            }
            if (i < reportValue || i > maxReportValue) {
                if (z) {
                    ReleaseLogUtil.d("AutoReportHandler", "hasCheckCallback clear key = ", string, " realValue = ", Integer.valueOf(i));
                    f39971c.get(string).clear();
                    return;
                }
                return;
            }
            Long l = f39969a.get(string);
            if (l != null) {
                long jLongValue = l.longValue();
                lValueOf.getClass();
                if (lee.a(jLongValue, jCurrentTimeMillis) && !z) {
                    ReleaseLogUtil.d("HiH_AutoReportHandler", "not need report data: key = ", string, " realValue = ", Integer.valueOf(i), "time = ", l);
                    return;
                }
            }
            f39969a.put(string, lValueOf);
            e(dataReportModel, reportValue, remoteCallbackList, z);
            return;
        }
        if (reportType == CharacteristicConstant.ReportType.VALUE_INTERVAL.getReportTypeValue()) {
            Long l2 = e.get(string);
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                lValueOf.getClass();
                if (!lee.a(jLongValue2, jCurrentTimeMillis)) {
                    LogUtil.a("AutoReportHandler", "isSameDay = false");
                    e.put(string, lValueOf);
                    d.put(string, 0);
                }
            } else {
                LogUtil.a("AutoReportHandler", "isSameDay = false");
                e.put(string, lValueOf);
                d.put(string, 0);
            }
            if (i - d.get(string).intValue() >= reportValue) {
                e.put(string, lValueOf);
                d.put(string, Integer.valueOf((i / reportValue) * reportValue));
                e(dataReportModel, i, remoteCallbackList, false);
                return;
            }
            return;
        }
        ReleaseLogUtil.e("HiH_AutoReportHandler", "unsupported report type");
    }

    private static void e(DataReportModel dataReportModel, int i, RemoteCallbackList<IRegisterRealTimeCallback> remoteCallbackList, boolean z) {
        if (dataReportModel.getDataType() == CharacteristicConstant.ReportDataType.DATA_POINT_STEP_SUM.getDataType()) {
            if (j == null) {
                j = new Bundle();
            }
            j.putInt("step", i);
            b(dataReportModel, j, remoteCallbackList, z);
            return;
        }
        if (dataReportModel.getDataType() == CharacteristicConstant.ReportDataType.DATA_POINT_CALORIES_SUM.getDataType()) {
            if (f39970b == null) {
                f39970b = new Bundle();
            }
            f39970b.putInt("calorie", i);
            b(dataReportModel, f39970b, remoteCallbackList, z);
            return;
        }
        if (dataReportModel.getDataType() == CharacteristicConstant.ReportDataType.DATA_POINT_DISTANCE_SUM.getDataType()) {
            if (h == null) {
                h = new Bundle();
            }
            h.putInt("distance", i);
            b(dataReportModel, h, remoteCallbackList, z);
            return;
        }
        ReleaseLogUtil.e("HiH_AutoReportHandler", "invalid data type");
    }

    private static void b(DataReportModel dataReportModel, Bundle bundle, RemoteCallbackList<IRegisterRealTimeCallback> remoteCallbackList, boolean z) {
        if (z) {
            LogUtil.j("AutoReportHandler", "hasCheckCallback size = ", Integer.valueOf(f39971c.get(dataReportModel.toString()).size()));
            Iterator<IRegisterRealTimeCallback> it = f39971c.get(dataReportModel.toString()).iterator();
            while (it.hasNext()) {
                try {
                    try {
                        it.next().onDataChanged(bundle);
                    } catch (RemoteException e2) {
                        ReleaseLogUtil.a("HiH_AutoReportHandler", "hasCheckCallback RemoteException: ", e2.getMessage());
                    }
                    it.remove();
                } catch (Throwable th) {
                    it.remove();
                    throw th;
                }
            }
            return;
        }
        synchronized (remoteCallbackList) {
            try {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                LogUtil.a("AutoReportHandler", "calling remote callback, the length is ", Integer.valueOf(iBeginBroadcast));
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IRegisterRealTimeCallback) remoteCallbackList.getBroadcastItem(i)).onDataChanged(bundle);
                    } catch (RemoteException e3) {
                        ReleaseLogUtil.a("HiH_AutoReportHandler", "report RemoteException: ", e3.getMessage());
                    }
                }
                remoteCallbackList.finishBroadcast();
            } catch (IllegalStateException e4) {
                ReleaseLogUtil.a("HiH_AutoReportHandler", "report IllegalStateException", LogAnonymous.b(e4));
                if (dataReportModel.getReportType() == CharacteristicConstant.ReportType.TARGET.getReportTypeValue()) {
                    f39969a.remove(dataReportModel.toString());
                }
            }
        }
    }

    public static void c(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) {
        String string = dataReportModel.toString();
        Long l = f39969a.get(string);
        if (l == null || !lee.a(l.longValue(), System.currentTimeMillis())) {
            return;
        }
        if (f39971c.get(string) == null) {
            f39971c.put(string, Collections.synchronizedList(new ArrayList()));
        }
        f39971c.get(string).add(iRegisterRealTimeCallback);
    }

    public static void b(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) {
        String string = dataReportModel.toString();
        if (f39971c.get(string) != null) {
            f39971c.get(string).remove(iRegisterRealTimeCallback);
        }
    }
}
