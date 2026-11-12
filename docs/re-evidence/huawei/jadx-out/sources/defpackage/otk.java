package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.db.AchieveLevelEventDBMgr;
import com.huawei.pluginachievement.manager.db.AchieveUserLevelDBMgr;
import com.huawei.pluginachievement.manager.db.AnnualReportDBMgr;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.manager.db.InsightRankRecordDBMgr;
import com.huawei.pluginachievement.manager.db.KakaLineRecordDBMgr;
import com.huawei.pluginachievement.manager.db.KakaTaskRecordDBMgr;
import com.huawei.pluginachievement.manager.db.LevelNumbersDBMgr;
import com.huawei.pluginachievement.manager.db.MedalBasicDBMgr;
import com.huawei.pluginachievement.manager.db.MedalConfigInfoDBMgr;
import com.huawei.pluginachievement.manager.db.MedalEventDBMgr;
import com.huawei.pluginachievement.manager.db.MedalLocationDBMgr;
import com.huawei.pluginachievement.manager.db.RecentMonthRecordDBMgr;
import com.huawei.pluginachievement.manager.db.RecentWeekRecordDBMgr;
import com.huawei.pluginachievement.manager.db.SingleDayRecordDBMgr;
import com.huawei.pluginachievement.manager.db.TotalRecordDBMgr;
import com.huawei.pluginachievement.manager.db.UserInfoDBMgr;
import com.huawei.pluginachievement.manager.db.WeekOrMonthRecordDBMgr;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class otk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile otk f44696a;
    private Map<Integer, IAchieveDBMgr> e;

    private otk(Context context) {
        e(context);
    }

    public static otk d(Context context) {
        if (f44696a == null) {
            synchronized (otk.class) {
                if (f44696a == null) {
                    f44696a = new otk(context);
                }
            }
        }
        return f44696a;
    }

    private void e(Context context) {
        HashMap map = new HashMap(17);
        this.e = map;
        map.put(1, new TotalRecordDBMgr(context));
        this.e.put(2, new SingleDayRecordDBMgr(context));
        this.e.put(3, new RecentWeekRecordDBMgr(context));
        this.e.put(4, new RecentMonthRecordDBMgr(context));
        this.e.put(5, new UserInfoDBMgr(context));
        this.e.put(6, new KakaLineRecordDBMgr(context));
        this.e.put(7, new MedalBasicDBMgr(context));
        this.e.put(8, new MedalLocationDBMgr(context));
        this.e.put(9, new MedalConfigInfoDBMgr(context));
        this.e.put(10, new MedalEventDBMgr(context));
        this.e.put(12, new KakaTaskRecordDBMgr(context));
        this.e.put(14, new AchieveUserLevelDBMgr(context));
        this.e.put(15, new LevelNumbersDBMgr(context));
        this.e.put(16, new AchieveLevelEventDBMgr(context));
        this.e.put(20, new WeekOrMonthRecordDBMgr(context));
        this.e.put(21, new InsightRankRecordDBMgr(context));
        this.e.put(19, new AnnualReportDBMgr(context));
    }

    public IAchieveDBMgr e(int i) {
        Map<Integer, IAchieveDBMgr> map = this.e;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        LogUtil.e("PLGACHIEVE_AchieveDBFactory", "creator: mDbMgrs is null");
        return null;
    }
}
