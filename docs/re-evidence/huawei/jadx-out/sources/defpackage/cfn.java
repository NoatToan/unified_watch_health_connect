package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.bean.TaskConfigBean;
import com.huawei.basichealthmodel.cloud.bean.Record;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.service.SyncService;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes23.dex */
public class cfn {
    public static void c(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_SyncUtils", "host is empty");
            return;
        }
        final int iA = DateFormatUtil.a(System.currentTimeMillis());
        final int iJ = CommonUtil.j(ccy.c("flush_data_time"));
        if (iJ == 0) {
            iJ = cbg.r();
        }
        if (iJ == 0) {
            LogUtil.j("HL_SyncUtils", "user is not join");
        } else if (iJ == iA) {
            LogUtil.a("HL_SyncUtils", "data is new");
        } else {
            LogUtil.a("HL_SyncUtils", "start to flush, startDay=", Integer.valueOf(iJ), " endDay=", Integer.valueOf(iA));
            HandlerExecutor.c(new Runnable() { // from class: cfo
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: cfq
                        @Override // java.lang.Runnable
                        public final void run() {
                            cfn.c(str, i, i, str);
                        }
                    });
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final String str, final int i, int i2, final String str2) {
        if (i >= i2) {
            LogUtil.a("HL_SyncUtils", "flush end");
            ccy.d("flush_data_time", String.valueOf(i2));
            ObserverManagerUtil.e("HEALTH_LIFE_CLOUD_SYNC_FINISH", new Object[0]);
            return;
        }
        byu.c().e(str2, i, new TaskDataListener() { // from class: cfn.2
            @Override // com.huawei.basichealthmodel.listener.TaskDataListener
            public void onDataChange(int i3, SparseArray<HealthLifeBean> sparseArray) {
            }

            @Override // com.huawei.basichealthmodel.listener.TaskDataListener
            public void onAllDataChange(int i3, SparseArray<List<HealthLifeBean>> sparseArray) {
                long jD = DateFormatUtil.d(i);
                cfn.d(str, DateFormatUtil.a(lsl.e(jD, 1, 0)), DateFormatUtil.a(lsl.b(jD, 1, 0)), str2);
                if (!cbg.ag()) {
                    LogUtil.j("HL_SyncUtils", "flush isSupportStartService false");
                    return;
                }
                int iA = DateFormatUtil.a(lsl.e(jD, 1, 1));
                ccy.d("flush_data_time", String.valueOf(iA));
                LogUtil.a("HL_SyncUtils", "flush day ", Integer.valueOf(i), " nextStartDate ", Integer.valueOf(iA));
                try {
                    Context contextB = BaseApplication.b();
                    Intent intent = new Intent(contextB, (Class<?>) SyncService.class);
                    intent.putExtra("sync_type", 5);
                    intent.putExtra("sync_user_id", str2);
                    contextB.startService(intent);
                } catch (IllegalStateException | SecurityException e) {
                    LogUtil.e("HL_SyncUtils", "flush exception ", LogAnonymous.b(e));
                }
            }
        });
    }

    public static long c(String str, boolean z, bwu bwuVar, SparseArray<TaskConfigBean> sparseArray) {
        if (bwuVar == null || sparseArray == null) {
            LogUtil.e("HL_SyncUtils", "parseLifeRecordJsonObject result or healthTaskConfigEntity is empty");
            return 0L;
        }
        LogUtil.d("HL_SyncUtils", "parseLifeRecordJsonObject isByVersion = ", Boolean.valueOf(z), ", data =", bwuVar.toString());
        int iB = bwuVar.b();
        if (iB != 0) {
            LogUtil.e("HL_SyncUtils", "getHealthLifeRecordByVersion resultCode != 0,resultCode=", Integer.valueOf(iB));
            return 0L;
        }
        long jA = z ? bwuVar.a() : 0L;
        if (bxc.a(cfu.e(bwuVar.c(), sparseArray), str) == -1) {
            LogUtil.e("HL_SyncUtils", "parseLifeRecordJsonObject insertTaskList fail");
            return 0L;
        }
        if (z) {
            ccy.d("health_life_last_version", String.valueOf(jA));
        }
        return jA;
    }

    public static void d(String str, int i, int i2, String str2) {
        if (!"true".equals(ioi.d().c(7)) || TextUtils.isEmpty(str)) {
            LogUtil.a("HL_SyncUtils", "hasUploadHealthLifeRecord privacyHealthData false or host is empty");
            return;
        }
        List<HealthLifeBean> listA = bxc.a(i, i2, str2);
        LogUtil.d("HL_SyncUtils", "uploadHealthLifeRecord list is ", listA.toString());
        if (njy.e(listA)) {
            LogUtil.j("HL_SyncUtils", "uploadHealthLifeRecord list is empty");
            ccy.b("update_cloud_data_time", System.currentTimeMillis());
            return;
        }
        List<List<HealthLifeBean>> listE = e(listA);
        if (listE.size() == 0) {
            LogUtil.a("HL_SyncUtils", "uploadHealthLifeRecord sGroupRecordList size 0");
            return;
        }
        for (List<HealthLifeBean> list : listE) {
            if (!BaseApplication.h()) {
                break;
            }
            if (!d(bwh.b().a(str, d(list)), list, str2)) {
                return;
            }
        }
        ccy.b("update_cloud_data_time", System.currentTimeMillis());
    }

    private static boolean d(bwi bwiVar, List<HealthLifeBean> list, String str) {
        if (bwiVar == null) {
            LogUtil.j("HL_SyncUtils", "parseUploadRecordResult result is empty");
            return false;
        }
        LogUtil.d("HL_SyncUtils", "parseUploadRecordResult result = ", bwiVar.toString());
        int iB = bwiVar.b();
        if (iB != 0) {
            LogUtil.e("HL_SyncUtils", "addHealthLifeRecord resultCode != 0,resultCode=", Integer.valueOf(iB));
            return false;
        }
        Iterator<HealthLifeBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().setSyncStatus(1);
        }
        bxc.e(list, str);
        return true;
    }

    private static List<List<HealthLifeBean>> e(List<HealthLifeBean> list) {
        ArrayList arrayList = new ArrayList(16);
        while (list.size() > 0) {
            HealthLifeBean healthLifeBean = list.get(0);
            int recordDay = healthLifeBean.getRecordDay();
            TimeZone timeZoneA = lsl.a(healthLifeBean.getTimeZone());
            ArrayList arrayList2 = new ArrayList(16);
            for (HealthLifeBean healthLifeBean2 : list) {
                if (healthLifeBean2 != null) {
                    TimeZone timeZoneA2 = lsl.a(healthLifeBean2.getTimeZone());
                    if (lsl.c(DateFormatUtil.c(recordDay, timeZoneA), timeZoneA, DateFormatUtil.c(healthLifeBean2.getRecordDay(), timeZoneA2), timeZoneA2) >= 10) {
                        break;
                    }
                    arrayList2.add(healthLifeBean2);
                }
            }
            arrayList.add(arrayList2);
            if (arrayList2.size() > 0) {
                list.subList(0, arrayList2.size()).clear();
            }
        }
        return arrayList;
    }

    public static List<Record> d(List<HealthLifeBean> list) {
        ArrayList arrayList = new ArrayList(16);
        if (list == null) {
            LogUtil.e("HL_SyncUtils", "convertTaskRecordDbBean taskRecordDbBeanList is null");
            return arrayList;
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                int complete = healthLifeBean.getComplete();
                String result = healthLifeBean.getResult();
                Record record = new Record();
                a(healthLifeBean, record);
                if (id == 5 && complete > 0 && TextUtils.isEmpty(result)) {
                    result = String.valueOf(0);
                }
                record.setResult(result);
                record.setId(id);
                record.setIsComplete(complete);
                record.setRecordDay(healthLifeBean.getRecordDay());
                record.setIsRest(healthLifeBean.getRest());
                record.setTimestamp(healthLifeBean.getTimestamp());
                record.setTimeZone(healthLifeBean.getTimeZone());
                int challengeId = healthLifeBean.getChallengeId();
                record.setChallengeId(challengeId >= 200001 ? Integer.valueOf(challengeId) : null);
                int taskType = healthLifeBean.getTaskType();
                record.setTaskType(taskType != 0 ? Integer.valueOf(taskType) : null);
                arrayList.add(record);
            }
        }
        return arrayList;
    }

    private static void a(HealthLifeBean healthLifeBean, Record record) {
        String target = healthLifeBean.getTarget();
        if (TextUtils.isEmpty(target)) {
            LogUtil.j("HL_SyncUtils", "filterTarget target ", target);
            record.setTarget("");
            return;
        }
        int id = healthLifeBean.getId();
        if (id != 1 && id != 100001) {
            record.setTarget(target);
            return;
        }
        String[] strArrSplit = target.split(",");
        if (njy.e(strArrSplit, 0)) {
            LogUtil.j("HL_SyncUtils", "filterTarget splitArray ", strArrSplit);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArrSplit) {
            int iJ = CommonUtils.j(str);
            if (iJ > 1 && iJ != 100001) {
                arrayList.add(Integer.valueOf(iJ));
            }
        }
        record.setTarget(arrayList.toString().replace("[", "").replace("]", "").replace(" ", ""));
    }
}
