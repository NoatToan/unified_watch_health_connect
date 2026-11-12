package com.xiaomi.hm.health.jobcenter.job;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import com.xiaomi.hm.health.eventbus.EventBandSummaryAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.Pai;
import com.xiaomi.hm.health.model.summery.Sleep;
import com.xiaomi.hm.health.model.summery.Steps;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class HMSummeryDataInitAnalisisJob extends ThreadJobObject {
    private static final String e = "HMSummeryDataInitAnalisisJob";
    private static final int f = 6;
    private final CopyOnWriteArrayList<HMSummery> c;
    private int d;

    public HMSummeryDataInitAnalisisJob(CopyOnWriteArrayList<HMSummery> summeryArrayList, int type, int workType) {
        super(workType);
        this.d = 0;
        this.c = summeryArrayList;
        summeryArrayList.clear();
        this.d = type;
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() throws Throwable {
        EventBandSummaryAnalysisJobFinished eventBandSummaryAnalysisJobFinished;
        EventBus eventBus;
        String str;
        HMSummery hMSummery;
        HMSummeryDataInitAnalisisJob hMSummeryDataInitAnalisisJob = this;
        String str2 = e;
        super.run();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String dateSimple = HMDateUtil.formatDateSimple(HMDateUtil.getCreateTime().longValue());
                DateDataDao dateDataDao = HMDaoManager.getInstance().getDateDataDao();
                int iOffsetDay = SportDay.getToday().offsetDay(SportDay.fromString(dateSimple));
                SportDay sportDayFromString = SportDay.fromString(dateSimple);
                HMLog.i(e, "offsetDay == " + iOffsetDay + ";startDay = " + sportDayFromString.getKey() + ";" + dateSimple, new Object[0]);
                for (int i = 0; i <= iOffsetDay; i++) {
                    HMSummery hMSummery2 = new HMSummery();
                    hMSummery2.date = sportDayFromString.getKey();
                    sportDayFromString = sportDayFromString.getNextDay();
                    hMSummeryDataInitAnalisisJob.c.add(hMSummery2);
                }
                List<DateData> list = dateDataDao.queryBuilder().orderDesc(DateDataDao.Properties.Date).list();
                if (list != null && !list.isEmpty()) {
                    HMLog.i(e, "DateDataDao data节点,总共有数据：" + list.size() + ";registerDate = " + dateSimple, new Object[0]);
                    if (TextUtils.isEmpty(dateSimple)) {
                        dateSimple = list.get(0).getDate();
                        HMLog.i(e, "网络端起止日期为空，取本地日期", new Object[0]);
                    }
                    HMLog.i(e, "运动起止日期为\u3000" + dateSimple, new Object[0]);
                    List<ManualData> listLoadAll = HMDaoManager.getInstance().getManualDataDao().loadAll();
                    boolean z = (listLoadAll == null || listLoadAll.isEmpty()) ? false : true;
                    HMLog.d(e, "hasManualData\u3000" + z, new Object[0]);
                    int i2 = 0;
                    while (i2 < hMSummeryDataInitAnalisisJob.c.size()) {
                        try {
                            try {
                                HMSummery hMSummery3 = hMSummeryDataInitAnalisisJob.c.get(i2);
                                HMSummery hMSummery4 = new HMSummery();
                                hMSummery4.date = hMSummery3.date;
                                DateData dateData = null;
                                for (int i3 = 0; i3 < list.size(); i3++) {
                                    if (hMSummery3.date.equals(list.get(i3).getDate())) {
                                        dateData = list.get(i3);
                                    }
                                }
                                ManualData manualData = null;
                                if (z) {
                                    for (int i4 = 0; i4 < listLoadAll.size(); i4++) {
                                        if (hMSummery3.date.equals(listLoadAll.get(i4).getDate())) {
                                            manualData = listLoadAll.get(i4);
                                        }
                                    }
                                }
                                if (dateData == null || manualData == null || TextUtils.isEmpty(manualData.getSummary())) {
                                    if (dateData == null || manualData != null) {
                                        if (dateData == null && manualData != null && Utils.isManualDataSlpValid(manualData.getSummary(), null)) {
                                            HMSummery.parseUsrSummery(hMSummery4, null, manualData.getSummary());
                                        } else {
                                            listLoadAll = listLoadAll;
                                            str = str2;
                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                            list = list;
                                            z = z;
                                            i2 = i2;
                                        }
                                        i2++;
                                        hMSummeryDataInitAnalisisJob = this;
                                        str2 = str;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                        listLoadAll = listLoadAll;
                                        list = list;
                                        z = z;
                                    } else {
                                        HMSummery.parseDBSummery(hMSummery4, dateData.getSummary());
                                    }
                                } else if (Utils.isManualDataSlpValid(manualData.getSummary(), dateData.getSummary())) {
                                    HMSummery.parseUsrSummery(hMSummery4, dateData.getSummary(), manualData.getSummary());
                                } else {
                                    HMSummery.parseDBSummery(hMSummery4, dateData.getSummary());
                                }
                                hMSummery3.goal = hMSummery4.goal;
                                hMSummery3.mStatus = 1;
                                Steps steps = hMSummery4.steps;
                                if (steps != null) {
                                    hMSummery3.steps = new Steps(steps.rn, steps.cal, steps.runDist, steps.wk, steps.ttl, steps.runCal, steps.dis, hMSummery4.active);
                                }
                                Sleep sleep = hMSummery4.sleep;
                                if (sleep != null) {
                                    int i5 = sleep.lt;
                                    long j = sleep.st;
                                    int i6 = sleep.wk;
                                    int i7 = sleep.dp;
                                    long j2 = sleep.ed;
                                    str = str2;
                                    try {
                                        int i8 = sleep.rhr;
                                        if (i8 <= 0) {
                                            i8 = hMSummery4.rhrDeprecated;
                                        }
                                        hMSummery3.sleep = new Sleep(i5, j, i6, i7, j2, i8, sleep.is, sleep.lb, sleep.dt, sleep.score, sleep.wc);
                                    } catch (Exception e2) {
                                        e = e2;
                                        hMSummeryDataInitAnalisisJob = this;
                                        str2 = str;
                                        e.printStackTrace();
                                        HMLog.i(str2, "分析活动结束，summery组装完成********************************* error :" + e.getMessage(), new Object[0]);
                                        eventBus = EventBus.getDefault();
                                        eventBandSummaryAnalysisJobFinished = new EventBandSummaryAnalysisJobFinished(hMSummeryDataInitAnalisisJob.d);
                                        eventBus.post(eventBandSummaryAnalysisJobFinished);
                                        return;
                                    }
                                } else {
                                    str = str2;
                                }
                                Pai pai = hMSummery4.pai;
                                if (pai != null) {
                                    hMSummery3 = hMSummery3;
                                    hMSummery3.pai = new Pai(pai.lp, pai.mp, pai.hp, pai.lm, pai.mm, pai.hm, pai.dp, pai.tp, pai.as, pai.nas, pai.maxHr, pai.rhr, pai.gender, pai.hrLowLimit, pai.hrMediumLimit, pai.hrHighLimit);
                                    hMSummery = hMSummery4;
                                } else {
                                    hMSummery = hMSummery4;
                                }
                                Sleep sleep2 = hMSummery.nap;
                                if (sleep2 != null) {
                                    hMSummery3.nap = new Sleep(sleep2.lt, sleep2.st, sleep2.wk, sleep2.dp, sleep2.ed, sleep2.rhr, sleep2.is, sleep2.lb, sleep2.dt, sleep2.score, sleep2.wc);
                                }
                                i2++;
                                hMSummeryDataInitAnalisisJob = this;
                                str2 = str;
                                jCurrentTimeMillis = jCurrentTimeMillis;
                                listLoadAll = listLoadAll;
                                list = list;
                                z = z;
                            } catch (Exception e3) {
                                e = e3;
                                hMSummeryDataInitAnalisisJob = this;
                                e.printStackTrace();
                                HMLog.i(str2, "分析活动结束，summery组装完成********************************* error :" + e.getMessage(), new Object[0]);
                                eventBus = EventBus.getDefault();
                                eventBandSummaryAnalysisJobFinished = new EventBandSummaryAnalysisJobFinished(hMSummeryDataInitAnalisisJob.d);
                                eventBus.post(eventBandSummaryAnalysisJobFinished);
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            hMSummeryDataInitAnalisisJob = this;
                            EventBus.getDefault().post(new EventBandSummaryAnalysisJobFinished(hMSummeryDataInitAnalisisJob.d));
                            throw th;
                        }
                    }
                    str = str2;
                    HMDataCacheCenter.getInstance().calculateReachGoalDays();
                    StringBuilder sb = new StringBuilder();
                    sb.append("分析活动结束，summery组装完成********************************* used :");
                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb.append(";size day = ");
                    hMSummeryDataInitAnalisisJob = this;
                    try {
                        sb.append(hMSummeryDataInitAnalisisJob.c.size());
                        HMLog.i(str, sb.toString(), new Object[0]);
                        eventBus = EventBus.getDefault();
                        eventBandSummaryAnalysisJobFinished = new EventBandSummaryAnalysisJobFinished(hMSummeryDataInitAnalisisJob.d);
                    } catch (Exception e4) {
                        e = e4;
                        str2 = str;
                        e.printStackTrace();
                        HMLog.i(str2, "分析活动结束，summery组装完成********************************* error :" + e.getMessage(), new Object[0]);
                        eventBus = EventBus.getDefault();
                        eventBandSummaryAnalysisJobFinished = new EventBandSummaryAnalysisJobFinished(hMSummeryDataInitAnalisisJob.d);
                    }
                    eventBus.post(eventBandSummaryAnalysisJobFinished);
                    return;
                }
                HMLog.i(e, "没有summery数据，直接返回 : registerDate " + dateSimple, new Object[0]);
                EventBus.getDefault().post(new EventBandSummaryAnalysisJobFinished(hMSummeryDataInitAnalisisJob.d));
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
