package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.pluginachievement.manager.model.RecentWeekRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class paz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f45104c;

    private paz() {
    }

    public static boolean b(UserAchieveWrapper userAchieveWrapper) {
        RecentWeekRecord recentWeekRecordAcquireRecentWeekRecord;
        return userAchieveWrapper != null && userAchieveWrapper.getContentType() == 2 && (recentWeekRecordAcquireRecentWeekRecord = userAchieveWrapper.acquireRecentWeekRecord()) != null && recentWeekRecordAcquireRecentWeekRecord.acquireMinReportNo() == 0;
    }

    public static void b(Context context) {
        if (context == null || Utils.o()) {
            LogUtil.j("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "notificationWeekReport isOversea!");
            return;
        }
        if (a()) {
            LogUtil.j("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "notificationWeekReport isDuplicateClick!");
            return;
        }
        if (Calendar.getInstance().get(7) - 1 != 1) {
            LogUtil.j("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "notificationWeekReport is not Monday！");
            return;
        }
        String strE = osa.e(context, "_alarmStartFlag");
        String strC = c();
        if (strC.equals(strE)) {
            LogUtil.j("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "notificationWeekReport is duplicate！ date = ", strC);
        } else {
            a(context);
        }
    }

    private static void a(final Context context) {
        final String strE = osa.e(context, "_weekReportNo");
        final String strE2 = osa.e(context, "_weekMinReportNo");
        ThreadPoolManager.c().execute(new Runnable() { // from class: paz.5
            @Override // java.lang.Runnable
            public void run() {
                paz.e(context, strE2, strE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, String str, String str2) {
        int i;
        HashMap map = new HashMap(16);
        map.put("reportNo", "0");
        osf osfVarB = otl.b(context).b(3, map);
        if (!(osfVarB instanceof RecentWeekRecord)) {
            LogUtil.j("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "notificationWeekReport no weekRecord！");
            return;
        }
        RecentWeekRecord recentWeekRecord = (RecentWeekRecord) osfVarB;
        int iAcquireReportNo = recentWeekRecord.acquireReportNo();
        int iAcquireMinReportNo = recentWeekRecord.acquireMinReportNo();
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "ReportNo=", Integer.valueOf(iAcquireReportNo), "minReportNo=", Integer.valueOf(iAcquireMinReportNo));
        int i2 = 0;
        if (TextUtils.isEmpty(str2)) {
            i = iAcquireReportNo;
        } else {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                LogUtil.e("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "acquireReportNo error");
                i = 0;
            }
        }
        if (TextUtils.isEmpty(str)) {
            i2 = iAcquireMinReportNo;
        } else {
            try {
                i2 = Integer.parseInt(str);
            } catch (NumberFormatException unused2) {
                LogUtil.e("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "acquireReportNo error");
            }
        }
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "MaxNo=", Integer.valueOf(i), "minNo=", Integer.valueOf(i2));
        int iMax = Math.max(i2, iAcquireMinReportNo);
        int iMax2 = Math.max(i, iAcquireReportNo);
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "handler mMinReportNo=", Integer.valueOf(iMax), "mMaxReportNo", Integer.valueOf(iMax2));
        d(context, iMax, iMax2);
    }

    private static void d(Context context, int i, int i2) {
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgTitle(context.getString(R.string.IDS_plugin_achievement_week_push_msg_title));
        messageObject.setMsgContent(context.getString(R.string.IDS_plugin_achievement_week_push_msg_content));
        messageObject.setFlag(0);
        messageObject.setMsgType(2);
        messageObject.setWeight(0);
        messageObject.setReadFlag(0);
        messageObject.setCreateTime(System.currentTimeMillis());
        messageObject.setDetailUri("messagecenter://sportReport?report_stype=1&min_report_no=" + i + "&max_report_no=" + i2);
        messageObject.setPosition(2);
        messageObject.setMsgPosition(0);
        String strC = c(context);
        LogUtil.d("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "getReportMsg mUserProfile.getHuid()=", strC);
        messageObject.setHuid(strC);
        String strE = osa.e(context, "_achieve_msg_id_week");
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "processWeekly msgId=", strE);
        if (TextUtils.isEmpty(strE)) {
            strE = "136";
        }
        messageObject.setMsgId(strE);
        e(context, messageObject);
    }

    private static void e(Context context, MessageObject messageObject) {
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "ready to show message");
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(7) - 1 == 1) {
            int i = calendar.get(11);
            if (i > 9 && i < 21) {
                LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "message type is ", messageObject.getType(), " isNotified: ", Integer.valueOf(messageObject.getNotified()));
                e(context);
                String strC = c();
                LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "date is ", strC);
                osa.b(context, "_alarmStartFlag", strC);
                osa.b(context, "_week_report_no_genera_flag", strC);
                LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "reportPop showNotificationMsg weekReport general! date ", strC);
                SharedPreferenceManager.a(String.valueOf(20003), "new_report", true);
                b(context, messageObject);
                return;
            }
            LogUtil.j("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "notificationWeekReport hour is not in (9, 21)！");
            return;
        }
        LogUtil.j("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "notificationWeekReport Today isn't Monday!!");
    }

    private static void b(Context context, MessageObject messageObject) {
        messageObject.setMsgPosition(11);
        messageObject.setModule("16");
        messageObject.setMsgTitle(messageObject.getMsgTitle());
        messageObject.setPosition(1);
        oru.a(context).getAdapter().generateMessage(messageObject);
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "notificationWeekReport is success!");
    }

    private static void e(final Context context) {
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_WeekReportStrBuilder", "refreshWeeklyReport!");
        ThreadPoolManager.c().execute(new Runnable() { // from class: paz.1
            @Override // java.lang.Runnable
            public void run() {
                oru.a(context).g();
            }
        });
    }

    private static String c(Context context) {
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            return accountInfo;
        }
        LogUtil.a("getHuid", "getSharedPreference huid null");
        return "";
    }

    private static String c() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2);
        return (i + 1) + Constants.LINK + calendar.get(5);
    }

    public static boolean a() {
        boolean z;
        synchronized (paz.class) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - f45104c >= 3500) {
                f45104c = jElapsedRealtime;
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }
}
