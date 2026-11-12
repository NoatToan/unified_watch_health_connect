package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CommonUtils;
import health.compact.a.DbManager;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes13.dex */
public class otd extends HwBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile otd f44691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f44692c;

    public static int c(int i, int i2) {
        return i2 == 0 ? i : i2;
    }

    private otd(Context context) {
        super(context);
        LogUtil.d("AchieveDBManager", "AchieveDBManager instructor");
        r();
    }

    public static otd c(Context context) {
        if (context != null) {
            f44692c = context.getApplicationContext();
        } else {
            f44692c = BaseApplication.getContext();
        }
        if (f44691b == null) {
            synchronized (otd.class) {
                if (f44691b == null) {
                    f44691b = new otd(f44692c);
                }
            }
        }
        return f44691b;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 20003;
    }

    private void t() {
        p();
        o();
        i();
        l();
        b();
        d();
        k();
        n();
        h();
        m();
        f();
        j();
        g();
        s();
        e();
        a();
    }

    private void i() {
        d("medal_basic_record", 1, "id integer primary key autoincrement, huid text not null,medalID text not null,medalName text not null,timeStamp Long not null,veinUrl text not null", "table_version_medal_basic_record");
    }

    private void e() {
        d("insight_rank", 1, "id integer primary key autoincrement, rankType text not null,rankVersion Long,gender text not null,ageSegment text not null,insightRankItemList text", "table_version_insight_rank");
    }

    private void a() {
        d("annual_info", 1, "id integer primary key autoincrement, huid text not null,type text not null,value text not null,key integer not null,year integer not null,reservedField text", "table_version_annual_info");
    }

    private void b() {
        d("achieve_info", 1, "id integer primary key autoincrement, huid text not null,reach_days integer not null,points integer not null,medal_id text,userReachStandardDays text,syncTimestamp text not null", "table_version_achieve_info");
    }

    private void d() {
        d("kaka_line", 1, "id integer primary key autoincrement, huid text not null,date_timestamp Long not null,description integer not null,kaka_num integer not null,occurDate timestamp unique", "table_version_kaka_line");
    }

    private void f() {
        d("level_event_record", 1, "id integer primary key autoincrement, huid text not null,taskId text not null,rewardExperience integer not null,taskCount integer not null,lastModifyTime Long not null,taskSumCount integer not null,SyncTime Long not null,reservedField text", "table_version_level_event_record");
    }

    private void s() {
        d("week_and_month_record", 1, "id integer primary key autoincrement, huid text not null,value text not null,britishValue text,recentType integer not null,startTimestamp Long not null,endTimeStamp Long not null,dataSource integer not null,maxReportNo integer not null,minReportNo integer not null,reportNo integer not null,reservedField text", "table_version_week_and_month_record");
    }

    private void h() {
        d("medal_event_record", 1, "id integer primary key autoincrement, huid text not null,medalID text not null,medalName text not null,eventType integer not null,value text not null,timeZone text not null,key text not null,keyType text not null,startTime text not null,endTime text not null,eventStatus text not null,timestamp Long not null", "table_version_medal_event_record");
    }

    private void k() {
        d("medal_location_record", 1, "id integer primary key autoincrement, huid text not null,medalName text not null,medalID text not null,firstTabPriority integer not null,firstTabDesc text not null,secondTabPriority integer not null,secondTabDesc text not null,medalWeight integer not null,medalGainedTime text not null,gainedCount integer not null,timestamp Long not null", "table_version_medal_location_record");
    }

    private void l() {
        d("recent", 1, "id integer primary key autoincrement, huid text not null,recentType integer not null,firstDate text not null,endDate text not null,dataType integer not null,value text not null,reportNo integer not null,kakaNum integer not null,price integer not null,medal_id text,comments1_id text not null,commentS2_id text not null,stepsRanking text,distanceRanking text,minReportNo integer", "table_version_recent");
    }

    private void m() {
        d("kaka_task_record", 2, "id integer primary key autoincrement, huid text not null,taskId text not null,taskStatus text not null,taskName text not null,taskDes text not null,taskSpecification text not null,taskDetailUrl text not null,taskFrequency integer not null,taskRewardKaKa integer not null,taskRewardExperience integer not null,taskTypes integer not null,taskConditions text,eventTimeStamp Long not null,taskSyncTimeStamp Long not null,lastTimeStamp Long not null,taskStartTime Long not null,taskEndTime Long not null,taskPriority integer not null,taskIcon text not null,taskIsShow integer not null,taskSyncStatus integer not null,preButton NVARCHAR(100),postButton NVARCHAR(100),category integer not null,taskRule integer not null,level integer not null,bonusType integer not null,updateTime Long not null,timeZoneOffset Long not null,scenario integer not null,isMember integer not null,pictureUrl text,buttonColor text,labelMatch integer,reservedField text", "table_version_kaka_task_record");
    }

    private void n() {
        d("medal_config_info_record", 1, "id integer primary key autoincrement, huid text not null,medalName text not null,medalID text not null,medalType text not null,activityId integer not null,message text not null,grayDescription text not null,lightDescription text not null,grayDetailStyle text not null,lightDetailStyle text not null,grayPromotionName text not null,lightPromotionName text not null,grayPromotionUrl text not null,lightPromotionUrl text not null,grayListStyle text not null,lightListStyle text not null,shareImageUrl text not null,location text not null,actionType integer not null,goal integer not null,startTime text not null,endTime text not null,takeEffectTime text not null,clientTypes text not null,phoneTypes text not null,isNewConfig integer not null,repeatable integer not null,medalLevel integer not null,medalLabel integer not null,medalUnit integer not null,timestamp Long not null,reachStatus integer not null,eventStatus integer not null", "table_version_medal_config_info_record");
    }

    private void r() {
        t();
    }

    private void g() {
        d("level_info_record", 1, "id integer primary key autoincrement, huid text not null,userLevel integer not null,userExperience integer not null,userReachDays text not null,syncTimestamp Long not null,reservedField text", "table_version_level_info_record");
    }

    private void j() {
        d("level_number_record", 1, "id integer primary key autoincrement, huid text not null,level integer not null,levelUserNumber integer not null,timeStamp Long not null,reservedField text", "table_version_level_number_record");
    }

    private void p() {
        d("total_record", 1, "id integer primary key autoincrement, huid text not null,startDate text not null,endDate text not null,dataType integer not null,value text not null,stepsRanking text", "table_version_total_record");
    }

    private void o() {
        d("single_day_record", 1, "id integer primary key autoincrement, huid text not null,dataType integer not null,value text not null,date text not null", "table_version_single_day_record");
    }

    private void d(String str, int i, String str2, String str3) {
        int iJ = CommonUtils.j(osa.e(f44692c, str3));
        boolean zE = e(str);
        LogUtil.a("PLGACHIEVE_AchieveDBManager", "createTable ", str, " oldV ", Integer.valueOf(iJ), " newV ", Integer.valueOf(i), " spKey ", str3, "isExistTable ", Boolean.valueOf(zE));
        if (!zE || iJ < i) {
            if (b(str) != 0) {
                LogUtil.j("PLGACHIEVE_AchieveDBManager", "createTable deleteTable fail!");
                return;
            }
            int iCreateStorageDataTable = createStorageDataTable(str, 1, str2);
            if (iCreateStorageDataTable != 0) {
                LogUtil.j("PLGACHIEVE_AchieveDBManager", "createTable database is bad errorCode ", Integer.valueOf(iCreateStorageDataTable));
                if (!deleteDatabase()) {
                    osa.b(f44692c, str3, "");
                    LogUtil.j("PLGACHIEVE_AchieveDBManager", "createTable deleteDatabase fail!");
                    return;
                }
                iCreateStorageDataTable = createStorageDataTable(str, 1, str2);
            }
            if (iCreateStorageDataTable != 0) {
                LogUtil.j("PLGACHIEVE_AchieveDBManager", "createTable errorCode ", Integer.valueOf(iCreateStorageDataTable));
            } else {
                osa.b(f44692c, str3, String.valueOf(i));
                LogUtil.a("PLGACHIEVE_AchieveDBManager", "createTable result success! tableId = ", str);
            }
        }
    }

    private boolean e(String str) {
        boolean zA;
        Cursor cursorQueryStorageData = queryStorageData(str, 1, null);
        if (cursorQueryStorageData != null) {
            zA = a(str);
            cursorQueryStorageData.close();
        } else {
            zA = false;
        }
        LogUtil.a("PLGACHIEVE_AchieveDBManager", "isExistTable tableId ", str, " isExist ", Boolean.valueOf(zA));
        return zA;
    }

    private boolean a(String str) {
        if ("kaka_task_record".equals(str)) {
            return q();
        }
        return true;
    }

    private boolean q() {
        boolean zD = DbManager.d(String.valueOf(getModuleId()), getTableFullName("kaka_task_record"), ParsedFieldTag.KAKA_TASK_VIP_MATCH);
        LogUtil.a("PLGACHIEVE_AchieveDBManager", "checkColumn isMember isExist = ", Boolean.valueOf(zD));
        return zD;
    }

    private int b(String str) {
        int iB;
        LogUtil.a("PLGACHIEVE_AchieveDBManager", "Enter deleteTable tableId ", str);
        Cursor cursorQueryStorageData = queryStorageData(str, 1, null);
        if (cursorQueryStorageData != null) {
            iB = DbManager.b(f44692c, String.valueOf(getModuleId()), str, 1);
            cursorQueryStorageData.close();
        } else {
            iB = 0;
        }
        LogUtil.a("PLGACHIEVE_AchieveDBManager", "Leave deleteTable isDelete ", Integer.valueOf(iB));
        return iB;
    }

    public static String c(Cursor cursor, String str) {
        if (cursor == null || TextUtils.isEmpty(str)) {
            return "1";
        }
        int columnIndex = cursor.getColumnIndex(str);
        if (-1 != columnIndex) {
            return cursor.getString(columnIndex);
        }
        LogUtil.e("PLGACHIEVE_AchieveDBManager", "getStringColumn wrong columnName = ", str);
        return "1";
    }

    public static long b(Cursor cursor, String str) {
        if (cursor == null || TextUtils.isEmpty(str)) {
            return 0L;
        }
        int columnIndex = cursor.getColumnIndex(str);
        if (-1 != columnIndex) {
            return cursor.getLong(columnIndex);
        }
        LogUtil.e("PLGACHIEVE_AchieveDBManager", "getStringColumn wrong columnName = ", str);
        return 0L;
    }

    public static int d(Cursor cursor, String str) {
        if (cursor == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        int columnIndex = cursor.getColumnIndex(str);
        if (-1 != columnIndex) {
            return cursor.getInt(columnIndex);
        }
        LogUtil.a("PLGACHIEVE_AchieveDBManager", "getStringColumn wrong columnName = ", str);
        return 0;
    }

    public static String d(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    public void c() {
        String[] strArr = {"total_record", "single_day_record", "medal_basic_record", "medal_event_record", "medal_location_record", "medal_config_info_record", "recent", "kaka_line", "kaka_task_record", "achieve_info", "level_event_record", "annual_info", "week_and_month_record", "level_info_record", "level_number_record"};
        String accountInfo = !Utils.h() ? "1" : LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("clearAllAchieveData: huid is empty", new Object[0]);
            return;
        }
        String[] strArr2 = {accountInfo};
        for (int i = 0; i < 15; i++) {
            String str = strArr[i];
            LogUtil.d("PLGACHIEVE_AchieveDBManager", "clearAllTablesData: tableId -> " + str + ", isClear -> ", Integer.valueOf(c(f44692c).deleteStorageData(str, 1, "huid = ?", strArr2)));
        }
        LogUtil.d("PLGACHIEVE_AchieveDBManager", "clearAllTablesData: tableId -> insight_rank, isClear -> ", Integer.valueOf(DbManager.e(f44692c, String.valueOf(getModuleId()), "insight_rank", 1)));
        osa.e();
    }
}
