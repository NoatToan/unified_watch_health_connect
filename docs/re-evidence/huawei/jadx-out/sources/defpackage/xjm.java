package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xjm {
    private static int b(List<TimeSequence> list, long j) {
        if (njy.e(list)) {
            LogUtil.e("Track_DataIntervalParser", "parseInterval list isEmpty", " return interval 5");
            return 5;
        }
        if (list.size() == 1) {
            return c(list, j);
        }
        int i = 0;
        if (list.size() == 2) {
            int iAcquireTime = (int) ((list.get(1).acquireTime() - list.get(0).acquireTime()) / 1000);
            if (iAcquireTime <= 0) {
                return 5;
            }
            int i2 = Math.abs(iAcquireTime - 5) > Math.abs(60 - iAcquireTime) ? 60 : 5;
            LogUtil.a("Track_DataIntervalParser", "list.size():", Integer.valueOf(list.size()), " return interval ", Integer.valueOf(i2));
            return i2;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i + 1;
            if (i5 >= list.size() || i5 >= 6) {
                break;
            }
            int iAcquireTime2 = (int) ((list.get(i5).acquireTime() - list.get(i).acquireTime()) / 1000);
            if (iAcquireTime2 > 0) {
                if (Math.abs(iAcquireTime2 - 5) <= Math.abs(60 - iAcquireTime2)) {
                    i3++;
                } else {
                    i4++;
                }
            }
            i = i5;
        }
        if (i3 >= i4) {
            LogUtil.a("Track_DataIntervalParser", "list.size():", Integer.valueOf(list.size()), " return interval 5");
            return 5;
        }
        LogUtil.a("Track_DataIntervalParser", "list.size():", Integer.valueOf(list.size()), " return interval 60");
        return 60;
    }

    private static int c(List<TimeSequence> list, long j) {
        if (njy.e(list)) {
            LogUtil.a("Track_DataIntervalParser", "List<TimeSequence> list is null");
            return 5;
        }
        int iAcquireTime = (int) ((list.get(0).acquireTime() - j) / 1000);
        LogUtil.a("Track_DataIntervalParser", "list.size():", Integer.valueOf(list.size()), " interval:", Integer.valueOf(iAcquireTime), " acquireTime:", Long.valueOf(list.get(0).acquireTime()), " startTime:", Long.valueOf(j));
        int i = Math.abs(iAcquireTime + (-5)) > Math.abs(60 - iAcquireTime) ? 60 : 5;
        LogUtil.a("Track_DataIntervalParser", "list.size():", Integer.valueOf(list.size()), " interval:", Integer.valueOf(iAcquireTime), " return interval ", Integer.valueOf(i));
        return i;
    }

    public static int e(List list, long j) {
        return b(list, j);
    }
}
