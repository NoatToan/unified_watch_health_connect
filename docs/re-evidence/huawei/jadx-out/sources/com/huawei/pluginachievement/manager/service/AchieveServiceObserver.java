package com.huawei.pluginachievement.manager.service;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.pluginachievement.manager.model.RecentMonthRecord;
import com.huawei.pluginachievement.manager.model.RecentWeekRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import defpackage.oru;
import defpackage.osa;
import defpackage.otl;
import defpackage.ott;
import defpackage.otv;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveServiceObserver implements AchieveObserver {
    private static AchieveMedalDialogScenario d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22033c = 0;

    public AchieveServiceObserver(Context context) {
        this.f22032b = context;
    }

    public static void c(int i) {
        d = AchieveMedalDialogScenario.getMedalDialogScenario(i);
    }

    private boolean e(String str) {
        return !"0".equals(str);
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        c(i, userAchieveWrapper, otl.b(BaseApplication.getContext()));
    }

    private void c(int i, UserAchieveWrapper userAchieveWrapper, otl otlVar) {
        if (otlVar == null || userAchieveWrapper == null) {
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        if (contentType == 2 || contentType == 3 || contentType == 4 || contentType == 7) {
            LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "dealDataChanged need process result");
            if (i == -1) {
                if (contentType == 4) {
                    c();
                    return;
                }
                return;
            }
            LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "AchieveServiceObserver|onDataChanged contentType = ", Integer.valueOf(contentType));
            if (contentType == 2) {
                a(userAchieveWrapper, otlVar);
                return;
            }
            if (contentType == 3) {
                e(userAchieveWrapper, otlVar);
                return;
            }
            if (contentType == 4) {
                otlVar.e(userAchieveWrapper);
                ott.e(this.f22032b).d(userAchieveWrapper);
                c();
                return;
            } else {
                if (contentType == 7) {
                    d(userAchieveWrapper);
                    return;
                }
                return;
            }
        }
        LogUtil.j("PLGACHIEVE_AchieveServiceObserver", "dealDataChanged do not need process result");
    }

    private void c() {
        AchieveMedalDialogScenario achieveMedalDialogScenario = d;
        if (achieveMedalDialogScenario != null) {
            otv.b(achieveMedalDialogScenario);
            d = null;
        }
    }

    private void d(UserAchieveWrapper userAchieveWrapper) {
        String resultCode = userAchieveWrapper.getResultCode();
        LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "processTakeMedal resultCode=", resultCode);
        if ("0".equals(resultCode)) {
            osa.a(this.f22032b, "_uploadMedal");
        }
    }

    private void e(UserAchieveWrapper userAchieveWrapper, otl otlVar) {
        RecentMonthRecord recentMonthRecordAcquireRecentMonthRecord;
        if (otlVar == null || (recentMonthRecordAcquireRecentMonthRecord = userAchieveWrapper.acquireRecentMonthRecord()) == null) {
            return;
        }
        try {
            this.f22033c = Integer.parseInt(osa.e(this.f22032b, "_monthReportNo"));
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveServiceObserver", "processMonthly NumberFormatException");
        }
        if (e(recentMonthRecordAcquireRecentMonthRecord.getEndUtcDate(), 3)) {
            LogUtil.j("PLGACHIEVE_AchieveServiceObserver", "processMonthly error month report");
            return;
        }
        int iAcquireReportNo = recentMonthRecordAcquireRecentMonthRecord.acquireReportNo();
        int iAcquireMinReportNo = recentMonthRecordAcquireRecentMonthRecord.acquireMinReportNo();
        LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "processMonthly reportNo=", Integer.valueOf(iAcquireReportNo));
        LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "processMonthly minReportNo=", Integer.valueOf(iAcquireMinReportNo));
        LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "processMonthly localMonthReportNo=", Integer.valueOf(this.f22033c));
        LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "processMonthly wrapper.getResultCode()=", userAchieveWrapper.getResultCode());
        a(String.valueOf(iAcquireReportNo), String.valueOf(iAcquireMinReportNo));
        int i = this.f22033c;
        if (-1 == i || iAcquireReportNo <= i || e(userAchieveWrapper.getResultCode())) {
            return;
        }
        this.f22033c = iAcquireReportNo;
        MessageObject messageObjectD = otlVar.d(iAcquireMinReportNo, iAcquireReportNo, recentMonthRecordAcquireRecentMonthRecord.acquireFirstDate());
        messageObjectD.setModule("16");
        messageObjectD.setType("monthReportMessage");
        messageObjectD.setImgUri("assets://localMessageIcon/messagecenter_achieve_ic_report.png");
        messageObjectD.setMsgPosition(11);
        messageObjectD.setMetaData(messageObjectD.getMsgTitle());
        messageObjectD.setExpireTime(0L);
        a(messageObjectD, 3);
        String strE = e();
        osa.b(this.f22032b, "_month_report_no_genera_flag", strE);
        LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "reportPop processMonthly monthReport general! currentMonth ", strE);
    }

    private String e() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) + Constants.LINK + (calendar.get(2) + 1);
    }

    private boolean e(long j, int i) {
        if (j <= 0) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        int i5 = calendar2.get(1);
        int i6 = calendar2.get(2);
        int i7 = calendar2.get(5);
        if (i == 3) {
            if (i2 > i5) {
                return true;
            }
            return i2 == i5 && i3 > i6;
        }
        if (i2 > i5) {
            return true;
        }
        if (i2 != i5 || i3 <= i6) {
            return i2 == i5 && i3 == i6 && i4 > i7;
        }
        return true;
    }

    private void a(UserAchieveWrapper userAchieveWrapper, otl otlVar) {
        int i;
        if (otlVar == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "AchieveServiceObserver, enter processWeekly");
        RecentWeekRecord recentWeekRecordAcquireRecentWeekRecord = userAchieveWrapper.acquireRecentWeekRecord();
        if (recentWeekRecordAcquireRecentWeekRecord == null) {
            LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "weekRecord is null");
            return;
        }
        if (e(recentWeekRecordAcquireRecentWeekRecord.getEndUtcDate(), 2)) {
            LogUtil.j("PLGACHIEVE_AchieveServiceObserver", "processWeekly error weekly report");
            HashMap map = new HashMap(8);
            map.put(DBSessionCommon.COLUMN_TIME_ZONE, CommonUtil.ak());
            otlVar.a(3, map);
            return;
        }
        int iAcquireReportNo = recentWeekRecordAcquireRecentWeekRecord.acquireReportNo();
        int iAcquireMinReportNo = recentWeekRecordAcquireRecentWeekRecord.acquireMinReportNo();
        String strE = osa.e(this.f22032b, "_weekReportNo");
        b(String.valueOf(iAcquireReportNo), String.valueOf(iAcquireMinReportNo));
        if (oru.b()) {
            int iAcquireMinReportNo2 = recentWeekRecordAcquireRecentWeekRecord.acquireMinReportNo();
            int iAcquireReportNo2 = recentWeekRecordAcquireRecentWeekRecord.acquireReportNo();
            try {
                i = Integer.parseInt(strE);
            } catch (NumberFormatException unused) {
                LogUtil.e("PLGACHIEVE_AchieveServiceObserver", "processWeekly NumberFormatException");
                i = 0;
            }
            int i2 = Calendar.getInstance().get(7);
            if (i != -1 && i2 - 1 == 0 && iAcquireReportNo2 > i && !e(userAchieveWrapper.getResultCode())) {
                MessageObject messageObjectB = otlVar.b(iAcquireMinReportNo2, iAcquireReportNo2);
                messageObjectB.setModule("16");
                messageObjectB.setType(com.huawei.health.messagecenter.model.CommonUtil.WEEK_REPORT_MESSAGE);
                messageObjectB.setImgUri("assets://localMessageIcon/messagecenter_achieve_ic_report.png");
                messageObjectB.setMetaData(messageObjectB.getMsgTitle());
                messageObjectB.setMsgPosition(11);
                a(messageObjectB, 2);
            }
        }
        HashMap map2 = new HashMap(8);
        map2.put(DBSessionCommon.COLUMN_TIME_ZONE, CommonUtil.ak());
        otlVar.a(3, map2);
    }

    private void a(MessageObject messageObject, int i) {
        String strE;
        if (messageObject == null) {
            LogUtil.j("PLGACHIEVE_AchieveServiceObserver", "generateMessage messageObject is null");
            return;
        }
        if (i == 2) {
            strE = osa.e(this.f22032b, "_achieve_msg_id_week");
        } else {
            if (i != 3) {
                LogUtil.j("PLGACHIEVE_AchieveServiceObserver", "generateMessage error contentType = ", Integer.valueOf(i));
                return;
            }
            strE = osa.e(this.f22032b, "_achieve_msg_id_month");
        }
        LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "generateMessage msgId=", strE, " contentType=", Integer.valueOf(i));
        if (oru.a(this.f22032b).getAdapter() != null) {
            if (!TextUtils.isEmpty(strE)) {
                messageObject.setMsgId(strE);
            }
            if (i == 3) {
                oru.a(this.f22032b).e();
            }
            String strGenerateMessage = oru.a(this.f22032b).getAdapter().generateMessage(messageObject);
            if (i == 3) {
                if (TextUtils.isEmpty(strE)) {
                    strE = strGenerateMessage;
                }
                osa.b(this.f22032b, "_achieve_msg_id_month", strE);
                SharedPreferenceManager.a(String.valueOf(20003), "new_report", true);
                LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "processMonthly msgId.=", strE);
                return;
            }
            if (!TextUtils.isEmpty(strGenerateMessage)) {
                osa.b(this.f22032b, "_achieve_msg_id_week", strGenerateMessage);
                LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "processWeekly msgIdRes.=", strGenerateMessage);
            } else {
                osa.b(this.f22032b, "_achieve_msg_id_week", strE);
                LogUtil.a("PLGACHIEVE_AchieveServiceObserver", "processWeekly msgId.=", strE);
            }
        }
    }

    private void b(String str, String str2) {
        HashMap map = new HashMap(2);
        map.put("_weekReportNo", str);
        map.put("_weekMinReportNo", str2);
        osa.b(this.f22032b, map);
    }

    private void a(String str, String str2) {
        HashMap map = new HashMap(2);
        map.put("_monthReportNo", str);
        map.put("_monthMinReportNo", str2);
        osa.b(this.f22032b, map);
    }
}
