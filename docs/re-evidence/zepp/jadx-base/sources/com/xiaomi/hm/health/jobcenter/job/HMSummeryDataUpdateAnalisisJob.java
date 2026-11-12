package com.xiaomi.hm.health.jobcenter.job;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes21.dex */
public class HMSummeryDataUpdateAnalisisJob extends ThreadJobObject {
    private static final String i = "HMSummeryDataUpdateAnalisisJob";
    private static final int j = 6;
    private CopyOnWriteArrayList<HMSummery> c;
    private CopyOnWriteArrayList<HMWeekSummery> d;
    private CopyOnWriteArrayList<HMMonthSummery> e;
    private ArrayList<DaySportData> f;
    private DateDataDao g;
    private SportDay h;

    public HMSummeryDataUpdateAnalisisJob(CopyOnWriteArrayList<HMSummery> summeryArrayList, CopyOnWriteArrayList<HMWeekSummery> weekSummeryArrayList, CopyOnWriteArrayList<HMMonthSummery> monthSummeryArrayList, List<DaySportData> dsdList) {
        super(4);
        this.c = summeryArrayList;
        this.d = weekSummeryArrayList;
        this.e = monthSummeryArrayList;
        this.f = (ArrayList) dsdList;
        this.g = HMDaoManager.getInstance().getDateDataDao();
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void cancel() {
        super.cancel();
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        String str;
        super.run();
        try {
            if (this.h != null) {
                ArrayList<DaySportData> arrayList = new ArrayList<>();
                this.f = arrayList;
                arrayList.add(new DaySportData(this.h));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            SportDay sportDay = null;
            ArrayList<DaySportData> arrayList2 = this.f;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                Iterator<DaySportData> it2 = this.f.iterator();
                while (true) {
                    int i2 = 1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    DaySportData next = it2.next();
                    String key = next.getKey();
                    if (sportDay == null || sportDay.offsetDay(next.getSportDay()) < 0) {
                        sportDay = next.getSportDay();
                    }
                    DateData dateDataLoad = this.g.load(key);
                    if (dateDataLoad != null) {
                        boolean z = false;
                        for (HMSummery hMSummery : this.c) {
                            if (key.equals(hMSummery.date)) {
                                QueryBuilder<ManualData> queryBuilder = HMDaoManager.getInstance().getManualDataDao().queryBuilder();
                                WhereCondition whereConditionEq = ManualDataDao.Properties.Date.eq(key);
                                WhereCondition[] whereConditionArr = new WhereCondition[i2];
                                whereConditionArr[0] = ManualDataDao.Properties.Type.eq("sleep");
                                ManualData manualDataUnique = queryBuilder.where(whereConditionEq, whereConditionArr).unique();
                                if (manualDataUnique == null || TextUtils.isEmpty(manualDataUnique.getSummary()) || !Utils.isManualDataSlpValid(manualDataUnique.getSummary(), dateDataLoad.getSummary())) {
                                    HMSummery.parseDBSummery(hMSummery, dateDataLoad.getSummary());
                                } else {
                                    HMSummery.parseUsrSummery(hMSummery, dateDataLoad.getSummary(), manualDataUnique.getSummary());
                                }
                                HMLog.i(i, "更新day数据： " + hMSummery.toString(), new Object[0]);
                                z = true;
                            }
                            i2 = 1;
                        }
                        if (!z) {
                            HMSummery hMSummery2 = new HMSummery();
                            hMSummery2.date = dateDataLoad.getDate();
                            ManualData manualDataUnique2 = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(hMSummery2.date), ManualDataDao.Properties.Type.eq("sleep")).unique();
                            if (manualDataUnique2 == null || TextUtils.isEmpty(manualDataUnique2.getSummary()) || !Utils.isManualDataSlpValid(manualDataUnique2.getSummary(), dateDataLoad.getSummary())) {
                                this.c.add(HMSummery.parseDBSummery(hMSummery2, dateDataLoad.getSummary()));
                            } else {
                                this.c.add(HMSummery.parseUsrSummery(hMSummery2, dateDataLoad.getSummary(), manualDataUnique2.getSummary()));
                            }
                            HMLog.i(i, "新增day数据：" + hMSummery2.toString(), new Object[0]);
                        }
                    }
                }
                HMDataCacheCenter.getInstance().calculateReachGoalDays();
                CopyOnWriteArrayList<HMWeekSummery> copyOnWriteArrayList = this.d;
                HMWeekSummery hMWeekSummery = copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1);
                StringBuilder sb = new StringBuilder();
                sb.append("maxDay = ");
                sb.append(sportDay == null ? "null " : sportDay.getKey());
                HMLog.d(i, sb.toString(), new Object[0]);
                if (hMWeekSummery != null && (str = hMWeekSummery.weekEndDate) != null) {
                    if (sportDay == null) {
                        HMLog.i(i, "maxDay is null,error in update", new Object[0]);
                        return;
                    }
                    if (sportDay.offsetWeek(SportDay.fromString(str)) == 0) {
                        HMLog.d(i, "同步的最大日期，仍在最后一周数据范围内，更新该周的数据即可\nold data" + hMWeekSummery.toString(), new Object[0]);
                        hMWeekSummery.weekEndDate = SportDay.getToday().getKey();
                        HMWeekSummery.fillWeekSummary(hMWeekSummery);
                        HMLog.d(i, "更新该周数据结束\nnew data" + hMWeekSummery.toString(), new Object[0]);
                    } else {
                        this.d.clear();
                        String dateSimple = HMDateUtil.formatDateSimple(HMDateUtil.getCreateTime().longValue());
                        int iOffsetWeek = SportDay.getToday().offsetWeek(SportDay.fromString(dateSimple));
                        HMLog.d(i, "offsetWeekTotal : " + iOffsetWeek, new Object[0]);
                        for (int i3 = iOffsetWeek; i3 >= 0; i3--) {
                            HMWeekSummery hMWeekSummery2 = new HMWeekSummery();
                            int i4 = -i3;
                            String weekStartDate = HMDateUtil.getWeekStartDate(i4);
                            String weekEndDate = HMDateUtil.getWeekEndDate(i4);
                            hMWeekSummery2.weekStartDate = weekStartDate;
                            hMWeekSummery2.weekEndDate = weekEndDate;
                            if (i3 == 0) {
                                hMWeekSummery2.weekEndDate = SportDay.getToday().getKey();
                            }
                            if (i3 == iOffsetWeek) {
                                hMWeekSummery2.weekStartDate = dateSimple;
                            }
                            if (i3 == 0 && SportDay.getToday().getWeek() == 6) {
                                HMLog.d(i, "remove first sunday", new Object[0]);
                            } else {
                                this.d.add(hMWeekSummery2);
                                HMWeekSummery.fillWeekSummary(hMWeekSummery2);
                            }
                        }
                    }
                    CopyOnWriteArrayList<HMMonthSummery> copyOnWriteArrayList2 = this.e;
                    HMMonthSummery hMMonthSummery = copyOnWriteArrayList2.get(copyOnWriteArrayList2.size() - 1);
                    HMLog.d(i, "该月老数据：" + hMMonthSummery.toString(), new Object[0]);
                    if (sportDay.offsetMonth(SportDay.fromString(hMMonthSummery.monthEndDate)) == 0) {
                        HMLog.d(i, "同步的最大日期，仍在最后当前月数据范围内，更新该月的数据即可", new Object[0]);
                        hMMonthSummery.monthEndDate = SportDay.getToday().getKey();
                        HMMonthSummery.fillMonth(hMMonthSummery);
                        HMLog.d(i, "本月最新活动数据如下：" + hMMonthSummery.toString(), new Object[0]);
                    } else {
                        HMLog.d(i, "同步的最大日期，不在最后一月数据范围内，更新该月的数据，添加下个月的数据", new Object[0]);
                        hMMonthSummery.monthEndDate = HMDateUtil.getMonthEnd(-1);
                        HMMonthSummery.fillMonth(hMMonthSummery);
                        HMLog.d(i, "本月最新活动数据如下：" + hMMonthSummery.toString(), new Object[0]);
                        HMMonthSummery hMMonthSummery2 = new HMMonthSummery();
                        hMMonthSummery2.monthStartDate = HMDateUtil.getMonthStart(0);
                        hMMonthSummery2.monthEndDate = SportDay.getToday().getKey();
                        this.e.add(HMMonthSummery.fillMonth(hMMonthSummery2));
                        HMLog.d(i, "新增月活动数据如下：" + hMMonthSummery.toString(), new Object[0]);
                    }
                    HMLog.d(i, "分析活动结束，summery组装完成********************************* time used : " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                    EventBus.getDefault().post(new EventSummeryAnalysisJobFinished());
                    return;
                }
                HMLog.d(i, "update error recentWeek is null,list is empty ", new Object[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.i(i, "error in update summary " + e.toString(), new Object[0]);
        }
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void start() {
        super.start();
    }

    public HMSummeryDataUpdateAnalisisJob(CopyOnWriteArrayList<HMSummery> summeryArrayList, CopyOnWriteArrayList<HMWeekSummery> weekSummeryArrayList, CopyOnWriteArrayList<HMMonthSummery> monthSummeryArrayList, SportDay day) {
        super(4);
        this.c = summeryArrayList;
        this.d = weekSummeryArrayList;
        this.e = monthSummeryArrayList;
        this.g = HMDaoManager.getInstance().getDateDataDao();
        this.h = day;
    }
}
