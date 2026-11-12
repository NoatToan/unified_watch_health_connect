package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.RecentMonthRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;

/* JADX INFO: loaded from: classes13.dex */
public class pau {
    public static boolean e(UserAchieveWrapper userAchieveWrapper) {
        RecentMonthRecord recentMonthRecordAcquireRecentMonthRecord;
        if (userAchieveWrapper != null) {
            return userAchieveWrapper.getContentType() == 3 && (recentMonthRecordAcquireRecentMonthRecord = userAchieveWrapper.acquireRecentMonthRecord()) != null && recentMonthRecordAcquireRecentMonthRecord.acquireMinReportNo() == 0;
        }
        LogUtil.j("PLGACHIEVE_LevelUtil", "isHistoryMonthReport: wrapper is null");
        return false;
    }
}
