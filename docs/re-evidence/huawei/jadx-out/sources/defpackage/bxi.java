package defpackage;

import android.text.TextUtils;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.devicelink.bean.CloverProgress;
import com.huawei.basichealthmodel.devicelink.bean.NoticesBean;
import com.huawei.basichealthmodel.devicelink.bean.ResponseMsgBody;
import com.huawei.basichealthmodel.devicelink.bean.TaskBean;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthlife.constant.WearTaskEnum;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class bxi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f1277a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f1278c = {1, 100001};
    private static final List<Integer> d = Arrays.asList(83, 90, 57, 78);

    public static void a(int i, String str, int i2, boolean z, ResponseCallback<ResponseMsgBody> responseCallback) {
        e eVarB = b(i, str, i2, responseCallback);
        if (eVarB == null) {
            return;
        }
        c(eVarB.f1281a, (List<String>) eVarB.f1282b, i2, z, responseCallback);
    }

    private static e b(int i, String str, int i2, ResponseCallback<ResponseMsgBody> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_DeviceTaskManager", "requestTasksMessage callback is null");
            return null;
        }
        if (!Utils.l()) {
            LogUtil.j("HL_DeviceTaskManager", "requestTasksMessage is not support HealthModel");
            responseCallback.onResponse(-1, cch.e(2001, 10003, ""));
            return null;
        }
        if (!cbg.ac()) {
            LogUtil.j("HL_DeviceTaskManager", "requestTasksMessage not joined or upgradeTime is 0");
            responseCallback.onResponse(-1, cch.e(2001, 10001, ""));
            return null;
        }
        int iW = cbg.w();
        LogUtil.a("HL_DeviceTaskManager", "requestTasksMessage recordDay ", Integer.valueOf(i), " requestTaskIds ", str, " pageSize ", Integer.valueOf(i2), " upgradeTime ", Integer.valueOf(iW));
        int iA = i <= 0 ? DateFormatUtil.a(System.currentTimeMillis()) : i;
        if (iA < iW || iW <= 0) {
            responseCallback.onResponse(99999, cch.e(2001, 10004, ""));
            return null;
        }
        List arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList = Arrays.asList(str.split(","));
        }
        return new e(iA, arrayList);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f1282b;

        public e(int i, List<String> list) {
            this.f1281a = i;
            this.f1282b = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final int i, final List<String> list, final int i2, final boolean z, final ResponseCallback<ResponseMsgBody> responseCallback) {
        HealthLifeBean healthLifeBean;
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelGetTaskList", new Runnable() { // from class: bxr
                @Override // java.lang.Runnable
                public final void run() {
                    bxi.c(i, (List<String>) list, i2, z, (ResponseCallback<ResponseMsgBody>) responseCallback);
                }
            });
            return;
        }
        if (z) {
            List<HealthLifeBean> listD = cgc.d();
            LogUtil.a("HL_DeviceTaskManager", "getTaskData recordDay ", Integer.valueOf(i), " list ", listD);
            if (njy.b(listD) && (healthLifeBean = listD.get(0)) != null && healthLifeBean.getRecordDay() == i) {
                Collections.sort(listD, new cdb());
                b(i, list, i2, listD, responseCallback);
                return;
            }
        }
        byu.c().b(i, new TaskDayDataListener() { // from class: bxi.3
            @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
            public void onAllDataChange(int i3, List<HealthLifeBean> list2) {
                LogUtil.a("HL_DeviceTaskManager", "getTaskData onAllDataChange result ", Integer.valueOf(i3), " list ", list2);
                if (i3 == -1 || njy.e(list2) || list2.size() < 3) {
                    responseCallback.onResponse(-1, cch.e(2001, -1, ""));
                } else {
                    Collections.sort(list2, new cdb());
                    bxi.b(i, list, i2, list2, responseCallback);
                }
            }

            @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
            public void onDataChange(int i3, HealthLifeBean healthLifeBean2) {
                LogUtil.a("HL_DeviceTaskManager", "getTaskData onDataChange result ", Integer.valueOf(i3), " bean ", healthLifeBean2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, List<String> list, int i2, List<HealthLifeBean> list2, ResponseCallback<ResponseMsgBody> responseCallback) {
        boolean zE = njy.e(list);
        ArrayList arrayList = new ArrayList();
        String strQ = cbg.q();
        StringBuilder sb = new StringBuilder();
        for (int i3 : f1278c) {
            if (zE || list.contains(String.valueOf(i3))) {
                HealthLifeBean healthLifeBeanC = bxc.c(i3, i, strQ);
                LogUtil.a("HL_DeviceTaskManager", "handleResult cloverBean ", healthLifeBeanC);
                if (cbg.h(healthLifeBeanC)) {
                    arrayList.add(healthLifeBeanC);
                    sb.append(i3);
                    sb.append(",");
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int size = list2.size();
        for (int i4 = 0; i4 < size; i4++) {
            HealthLifeBean healthLifeBean = list2.get(i4);
            if (healthLifeBean == null) {
                LogUtil.j("HL_DeviceTaskManager", "handleResult bean is null");
            } else {
                int id = healthLifeBean.getId();
                if (zE || list.contains(String.valueOf(id))) {
                    arrayList.add(healthLifeBean);
                }
                sb.append(id);
                if (i4 != size - 1) {
                    sb.append(",");
                }
                if (healthLifeBean.getComplete() > 0) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(id);
                }
            }
        }
        ResponseMsgBody responseMsgBodyA = a(i, i2, arrayList);
        responseMsgBodyA.setMsgType(2001);
        responseMsgBodyA.setAllTasks(((Object) sb) + ccx.c(arrayList));
        responseMsgBodyA.setCompletedTasks(sb2.toString());
        responseCallback.onResponse(0, responseMsgBodyA);
    }

    private static ResponseMsgBody a(int i, int i2, List<HealthLifeBean> list) {
        ResponseMsgBody responseMsgBody = new ResponseMsgBody();
        responseMsgBody.setRecordDay(i);
        responseMsgBody.setResultCode(0);
        responseMsgBody.setTasks(d(i, i2, list));
        CloverProgress cloverProgress = new CloverProgress();
        cloverProgress.setTop(cbg.d(list, 1, i));
        cloverProgress.setRight(cbg.d(list, 2, i));
        cloverProgress.setLeft(cbg.d(list, 3, i));
        responseMsgBody.setCloverProgress(cloverProgress);
        return responseMsgBody;
    }

    private static List<TaskBean> d(int i, int i2, List<HealthLifeBean> list) {
        int i3;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        if (i2 > 0) {
            size = Math.min(size, i2);
        }
        for (int i4 = 0; i4 < size; i4++) {
            HealthLifeBean healthLifeBean = list.get(i4);
            if (healthLifeBean == null) {
                LogUtil.j("HL_DeviceTaskManager", "getTaskMessageArray lifeBean is null");
            } else {
                TaskBean taskBean = new TaskBean();
                int id = healthLifeBean.getId();
                taskBean.setTaskId(id);
                taskBean.setTaskTarget(healthLifeBean.getTarget());
                taskBean.setTaskValue(healthLifeBean.getResult());
                taskBean.setStatus(healthLifeBean.getComplete());
                taskBean.setRestStatus(healthLifeBean.getRest());
                taskBean.setTaskType(b(id, healthLifeBean.getType()));
                taskBean.setTimestamp(healthLifeBean.getTimestamp());
                if (id == 1) {
                    i3 = R.string.IDS_perfect_clover;
                } else if (id == 100001) {
                    i3 = R.string.IDS_vibrant_clover;
                } else {
                    taskBean.setStatusDes(cbg.d(healthLifeBean));
                    i3 = ffv.i().get(id);
                }
                String strF = qre.f(i3);
                LogUtil.a("HL_DeviceTaskManager", "getTaskNameByTaskId resourceId ", Integer.valueOf(i3), " taskName ", strF, " language ", CommonUtil.u());
                taskBean.setTaskName(strF);
                arrayList.add(taskBean);
                if (id == 2) {
                    taskBean.setProgress(cbg.c(list, 1, i));
                }
            }
        }
        ccx.c(arrayList, ccx.e(list));
        return arrayList;
    }

    private static int b(int i, int i2) {
        ArrayList<Integer> arrayListA = byu.c().a();
        if (njy.e(arrayListA) || !arrayListA.contains(Integer.valueOf(i))) {
            return 0;
        }
        LogUtil.a("HL_DeviceTaskManager", "getTaskType taskId ", Integer.valueOf(i), " type ", Integer.valueOf(i2), " basicTaskIdList ", arrayListA);
        return i2;
    }

    public static void d() {
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelRemind_", new Runnable() { // from class: bxt
                @Override // java.lang.Runnable
                public final void run() {
                    bxi.d();
                }
            });
            return;
        }
        if (!bxp.b().f()) {
            LogUtil.a("HL_DeviceTaskManager", "sendDeviceCelebratingMsg is not supported");
            d("");
            return;
        }
        String[] strArrA = cfu.a();
        LogUtil.a("HL_DeviceTaskManager", "sendDeviceCelebratingMsg celebratingSavedArray ", strArrA);
        ResponseCallback responseCallback = new ResponseCallback() { // from class: bxq
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                bxi.d(i, (ResponseMsgBody) obj);
            }
        };
        if (strArrA == null || strArrA.length < 2) {
            NoticesBean noticesBeanC = c(0);
            LogUtil.a("HL_DeviceTaskManager", "sendDeviceCelebratingMsg noticesBean ", noticesBeanC);
            if (noticesBeanC == null) {
                d("");
                return;
            } else {
                cch.b(noticesBeanC, 2003, 3, (ResponseCallback<ResponseMsgBody>) responseCallback);
                return;
            }
        }
        NoticesBean noticesBeanA = a(strArrA);
        LogUtil.a("HL_DeviceTaskManager", "sendDeviceCelebratingMsg noticesBean ", noticesBeanA);
        if (noticesBeanA == null) {
            d("");
        } else {
            cch.b(noticesBeanA, 2003, 3, (ResponseCallback<ResponseMsgBody>) responseCallback);
        }
    }

    static /* synthetic */ void d(int i, ResponseMsgBody responseMsgBody) {
        LogUtil.a("HL_DeviceTaskManager", "sendDeviceCelebratingMsg resultCode ", Integer.valueOf(i), " jsonString ", responseMsgBody);
        d("");
        if (i == 0) {
            cfu.e(f1277a);
        }
    }

    private static NoticesBean a(String[] strArr) {
        int iJ = CommonUtil.j(strArr[0]);
        int iJ2 = CommonUtil.j(strArr[1]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        int iA2 = DateFormatUtil.a(lsl.u(jCurrentTimeMillis));
        LogUtil.a("HL_DeviceTaskManager", "getNoticesBean savedDate ", Integer.valueOf(iJ), " savedId ", Integer.valueOf(iJ2), " currentDate ", Integer.valueOf(iA), " yesterdayDate ", Integer.valueOf(iA2));
        if (iJ == iA) {
            if (iJ2 != 1) {
                return c(3);
            }
            return null;
        }
        if (iJ == iA2) {
            if (iJ2 == 100001) {
                return c(1);
            }
            return c(2);
        }
        if (iJ >= iA2) {
            LogUtil.j("HL_DeviceTaskManager", "getNoticesBean other branch");
            return null;
        }
        return c(0);
    }

    public static void d(String str) {
        ccy.c("health_model_device_celebrating", str);
    }

    private static NoticesBean c(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        NoticesBean noticesBeanE = e("celebrating_messages_today_perfect", iA, 1);
        LogUtil.a("HL_DeviceTaskManager", "getCelebratingMsg type ", Integer.valueOf(i), " currentDate ", Integer.valueOf(iA), " todayClover ", noticesBeanE);
        if (noticesBeanE != null || i == 3) {
            return noticesBeanE;
        }
        NoticesBean noticesBeanE2 = e("celebrating_messages_today_energy", iA, 100001);
        LogUtil.a("HL_DeviceTaskManager", "getCelebratingMsg todayEnergyClover ", noticesBeanE2);
        if (noticesBeanE2 != null || i == 2) {
            return noticesBeanE2;
        }
        int iA2 = DateFormatUtil.a(lsl.u(jCurrentTimeMillis));
        NoticesBean noticesBeanE3 = e("celebrating_messages_yesterday_perfect", iA2, 1);
        LogUtil.a("HL_DeviceTaskManager", "getCelebratingMsg yesterdayClover ", noticesBeanE3, " yesterdayDate ", Integer.valueOf(iA2));
        return (noticesBeanE3 != null || i == 1) ? noticesBeanE3 : e("celebrating_messages_yesterday_energy", iA2, 100001);
    }

    private static NoticesBean e(String str, int i, int i2) {
        f1277a = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != DateFormatUtil.a(jCurrentTimeMillis) && jCurrentTimeMillis < lsl.a(jCurrentTimeMillis, 9, 0)) {
            return null;
        }
        HealthLifeBean healthLifeBeanC = bxc.c(i2, i, cbg.q());
        LogUtil.a("HL_DeviceTaskManager", "getMessageString scenario ", str, " recordDay ", Integer.valueOf(i), " id ", Integer.valueOf(i2), " bean ", healthLifeBeanC);
        if (!cbg.h(healthLifeBeanC) || healthLifeBeanC.getComplete() <= 0) {
            return null;
        }
        NoticesBean noticesBeanB = cch.b(str, i, i2);
        if (noticesBeanB == null) {
            ReleaseLogUtil.e("HL_DeviceTaskManager", "getMessageString noticesBean is null");
            return null;
        }
        f1277a = i + "_" + i2;
        return noticesBeanB;
    }

    private static boolean b(String str) {
        return !TextUtils.isEmpty(str) && lsl.g(DateFormatUtil.d(CommonUtils.j(str)), System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final int i) {
        if (!cbg.ac()) {
            LogUtil.a("HL_DeviceTaskManager", "sendDeviceReminder not join");
        } else {
            final int iA = DateFormatUtil.a(lsl.e(System.currentTimeMillis(), 1, -1));
            cbg.c(iA, (ResponseCallback<ffc>) new ResponseCallback() { // from class: bxg
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    bxi.d(iA, i, i2, (ffc) obj);
                }
            });
        }
    }

    static /* synthetic */ void d(int i, int i2, int i3, ffc ffcVar) {
        LogUtil.a("HL_DeviceTaskManager", "sendDeviceReminder errorCode ", Integer.valueOf(i3), " object ", ffcVar, " startDateOfWeek ", Integer.valueOf(i));
        if (i3 != 0 || ffcVar == null) {
            return;
        }
        if (i2 == 0) {
            LogUtil.a("HL_DeviceTaskManager", "sendDeviceReminder week report");
            e();
        } else if (ffcVar.a() == 2) {
            e(ffcVar);
        }
    }

    public static void a() {
        if (!bxp.b().f()) {
            LogUtil.j("HL_DeviceTaskManager", "sendDeviceCommentedMsg isSupportHealthModel false");
            return;
        }
        if (jyc.c().f()) {
            ReleaseLogUtil.d("HL_DeviceTaskManager", "sendDeviceCommentedMsg isHealthLife true");
        } else if (b(ccy.c("weekly_doctor_commenting_date"))) {
            LogUtil.a("HL_DeviceTaskManager", "sendDeviceCommentedMsg The review time is the same week");
        } else {
            a(1);
        }
    }

    private static void e(final ffc ffcVar) {
        cch.b(cch.c(), 2002, 3, (ResponseCallback<ResponseMsgBody>) new ResponseCallback() { // from class: bxj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                bxi.e(ffcVar, i, (ResponseMsgBody) obj);
            }
        });
    }

    static /* synthetic */ void e(ffc ffcVar, int i, ResponseMsgBody responseMsgBody) {
        LogUtil.a("HL_DeviceTaskManager", "commentedMsgData resultCode ", Integer.valueOf(i), " jsonString ", responseMsgBody);
        if (i == 0) {
            fep fepVarB = ffcVar.b();
            if (fepVarB == null) {
                LogUtil.j("HL_DeviceTaskManager", "commentedMsgData commentInfo is null");
                return;
            }
            feq feqVar = (feq) HiJsonUtil.d(fepVarB.b(), feq.class);
            if (feqVar == null) {
                LogUtil.j("HL_DeviceTaskManager", "commentedMsgData commentInfoMap is null");
                return;
            }
            long jI = CommonUtils.i(feqVar.e());
            if (jI <= 0) {
                LogUtil.j("HL_DeviceTaskManager", "commentedMsgData commentTime ", Long.valueOf(jI));
                return;
            }
            String strValueOf = String.valueOf(DateFormatUtil.a(jI));
            ccy.d("weekly_doctor_commenting_date", strValueOf);
            LogUtil.a("HL_DeviceTaskManager", "commentedMsgData commentDay ", strValueOf);
        }
    }

    public static void c() {
        if (!bxp.b().f()) {
            LogUtil.a("HL_DeviceTaskManager", "sendWeekReportToDevice is not supported");
            return;
        }
        if (jyc.c().f()) {
            ReleaseLogUtil.d("HL_DeviceTaskManager", "sendWeekReportToDevice isHealthLife true");
            return;
        }
        String strC = ccy.c("week_report_remind_date");
        LogUtil.a("HL_DeviceTaskManager", "sendWeekReportToDevice reminderDate ", strC);
        if (b(strC)) {
            LogUtil.a("HL_DeviceTaskManager", "sendWeekReportToDevice isSameWeek");
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900300021");
        LogUtil.a("HL_DeviceTaskManager", "query week report switch");
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: bxi.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("HL_DeviceTaskManager", "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (njy.b(obj, HiSampleConfig.class)) {
                    List list = (List) obj;
                    if (!njy.e(list)) {
                        HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                        LogUtil.a("HL_DeviceTaskManager", "week report switch is ", hiSampleConfig.getConfigData());
                        if ("1".equals(ffv.a(hiSampleConfig.getConfigData(), "healthLifeWeekReportSwitch"))) {
                            bxi.a(0);
                            return;
                        }
                        return;
                    }
                }
                LogUtil.j("HL_DeviceTaskManager", "isListTypeMatch false or list is empty");
                if (ccy.b("week_report_remind_switch")) {
                    bxi.j();
                } else {
                    LogUtil.j("HL_DeviceTaskManager", "old sp not exist");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        String strC = ccy.c("week_report_remind_switch");
        boolean zE = lua.e();
        LogUtil.a("HL_DeviceTaskManager", "reminderSwitch:", strC, " isPullAllStatus:", Boolean.valueOf(zE));
        if (zE || !Utils.h()) {
            LogUtil.a("HL_DeviceTaskManager", "already sync all data");
            qhq.d(MatterDataContans.TYPE_HEALTH, "900300021", ffv.e("healthLifeWeekReportSwitch", TextUtils.isEmpty(strC) ? "0" : "1"), new HiDataOperateListener() { // from class: bxi.2
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i, Object obj) {
                    LogUtil.a("HL_DeviceTaskManager", "saveSampleConfig errorCode: ", Integer.valueOf(i), ", object: ", obj);
                }
            }, System.currentTimeMillis());
            ccy.e("week_report_remind_switch");
        }
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        a(0);
    }

    private static void e() {
        final int iA = DateFormatUtil.a(System.currentTimeMillis());
        cch.b(cch.c(iA), 2002, 3, (ResponseCallback<ResponseMsgBody>) new ResponseCallback() { // from class: bxl
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                bxi.a(iA, i, (ResponseMsgBody) obj);
            }
        });
    }

    static /* synthetic */ void a(int i, int i2, ResponseMsgBody responseMsgBody) {
        LogUtil.a("HL_DeviceTaskManager", "sendWeekReport resultCode ", Integer.valueOf(i2), " jsonString ", responseMsgBody);
        if (i2 == 0) {
            ccy.d("week_report_remind_date", String.valueOf(i));
        }
    }

    public static void d(final String str, final int i, final ResponseCallback<ResponseMsgBody> responseCallback) {
        ReleaseLogUtil.d("HL_DeviceTaskManager", "requestTasksMessageByTaskPlatform requestTaskIds ", str, " pageSize ", Integer.valueOf(i));
        List arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList = Arrays.asList(str.split(","));
        }
        final e eVar = new e(DateFormatUtil.a(System.currentTimeMillis()), arrayList);
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelGetTaskList", new Runnable() { // from class: bxo
                @Override // java.lang.Runnable
                public final void run() {
                    bxi.d(str, i, (ResponseCallback<ResponseMsgBody>) responseCallback);
                }
            });
        } else {
            jyc.c().e(new ResponseCallback() { // from class: bxk
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    bxi.d(responseCallback, eVar, i, i2, (qfj) obj);
                }
            });
        }
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, e eVar, int i, int i2, qfj qfjVar) {
        ReleaseLogUtil.d("HL_DeviceTaskManager", "querySchedule errorCode ", Integer.valueOf(i2));
        if (qfjVar == null) {
            responseCallback.onResponse(-1, cch.e(2001, -1, ""));
        } else {
            if (njy.e(qfjVar.i())) {
                ReleaseLogUtil.e("HL_DeviceTaskManager", "requestTasksMessageByTaskPlatform schedules null");
                return;
            }
            List<qfz> listB = b(qfjVar);
            listB.sort(new ccw());
            b(eVar.f1281a, eVar.f1282b, i, listB, responseCallback, qfjVar.d());
        }
    }

    private static List<qfz> b(qfj qfjVar) {
        if (!bxp.b().a()) {
            List<qfz> listI = qfjVar.i();
            boolean zB = b(listI, "T100110");
            boolean zB2 = b(listI, "T120310");
            boolean zB3 = b(listI, "T121610");
            boolean zB4 = b(listI, "T100210");
            ReleaseLogUtil.d("HL_DeviceTaskManager", "enter compatibleOtherDevice hasStepTask:", Boolean.valueOf(zB), "hasWakeupTask:", Boolean.valueOf(zB2), "hasRelaxationTask:", Boolean.valueOf(zB3), "hasIntensityTask:", Boolean.valueOf(zB4));
            int i = !zB2 ? 1 : 0;
            if (zB3) {
                qfz qfzVarJ = qfjVar.j("T121610");
                String strG = qfjVar.g("T121610");
                listI.add(d("T121610", "1", strG, CommonUtil.j(strG) >= 1 ? 1 : 0));
                listI.remove(qfzVarJ);
            } else {
                i++;
            }
            if (!zB && !zB4) {
                i++;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(listI);
            CountDownLatch countDownLatch = new CountDownLatch(i);
            if (!zB2) {
                c((List<qfz>) copyOnWriteArrayList, countDownLatch);
            }
            if (!zB3) {
                d((CopyOnWriteArrayList<qfz>) copyOnWriteArrayList, countDownLatch);
            }
            if (!zB && !zB4) {
                c((CopyOnWriteArrayList<qfz>) copyOnWriteArrayList, countDownLatch);
            }
            try {
                ReleaseLogUtil.d("HL_DeviceTaskManager", "compatibleOtherDevice isOnTime:", Boolean.valueOf(countDownLatch.await(ProfileExtendConstants.TIME_OUT, TimeUnit.MILLISECONDS)));
                return copyOnWriteArrayList;
            } catch (InterruptedException unused) {
                ReleaseLogUtil.a("HL_DeviceTaskManager", "compatibleOtherDevice InterruptedException");
                return copyOnWriteArrayList;
            }
        }
        return qfjVar.i();
    }

    private static void d(final CopyOnWriteArrayList<qfz> copyOnWriteArrayList, final CountDownLatch countDownLatch) {
        kad.e((ResponseCallback<Object>) new ResponseCallback() { // from class: bxh
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                bxi.c(copyOnWriteArrayList, countDownLatch, i, obj);
            }
        });
    }

    static /* synthetic */ void c(CopyOnWriteArrayList copyOnWriteArrayList, CountDownLatch countDownLatch, int i, Object obj) {
        int iJ = CommonUtil.j(String.valueOf(obj));
        copyOnWriteArrayList.add(d("T121610", "1", String.valueOf(iJ), iJ < 1 ? 0 : 1));
        countDownLatch.countDown();
    }

    private static void c(final CopyOnWriteArrayList<qfz> copyOnWriteArrayList, final CountDownLatch countDownLatch) {
        kad.a((ResponseCallback<Object>) new ResponseCallback() { // from class: bxf
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                bxi.e(copyOnWriteArrayList, countDownLatch, i, obj);
            }
        });
    }

    static /* synthetic */ void e(CopyOnWriteArrayList copyOnWriteArrayList, CountDownLatch countDownLatch, int i, Object obj) {
        copyOnWriteArrayList.add(d("T100110", "8000", String.valueOf(obj), CommonUtil.j(String.valueOf(obj)) >= CommonUtil.j("8000") ? 1 : 0));
        countDownLatch.countDown();
    }

    private static void c(final List<qfz> list, final CountDownLatch countDownLatch) {
        kad.d((ResponseCallback<Object>) new ResponseCallback() { // from class: bxm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                bxi.b(list, countDownLatch, i, obj);
            }
        });
    }

    static /* synthetic */ void b(List list, CountDownLatch countDownLatch, int i, Object obj) {
        long jI = CommonUtil.i(String.valueOf(obj));
        int i2 = 0;
        if (jI > 0) {
            String[] strArrSplit = "7:00".split(":");
            int iJ = CommonUtils.j(strArrSplit[0]);
            int iJ2 = CommonUtils.j(strArrSplit[1]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jA = lsl.a(jCurrentTimeMillis, iJ, iJ2 - 61, true);
            long jA2 = lsl.a(jCurrentTimeMillis, iJ, iJ2 + 61, true);
            if (jI >= jA && jI <= jA2) {
                i2 = 1;
            }
        }
        list.add(d("T120310", "7:00", String.valueOf(jI), i2));
        countDownLatch.countDown();
    }

    private static boolean b(List<qfz> list, String str) {
        for (qfz qfzVar : list) {
            if (qfzVar != null && str.equals(qfzVar.g())) {
                return true;
            }
        }
        return false;
    }

    private static qfz d(String str, String str2, String str3, int i) {
        qfz qfzVar = new qfz();
        qfzVar.e(str);
        ArrayList arrayList = new ArrayList();
        qfk qfkVar = new qfk();
        qfkVar.h(str);
        qfkVar.c(System.currentTimeMillis());
        qfkVar.h(DateFormatUtil.a(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        qfg qfgVar = new qfg();
        qfgVar.a(str2);
        arrayList2.add(qfgVar);
        qfkVar.b(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        qfh qfhVar = new qfh();
        qfhVar.d(i);
        qfhVar.a(str3);
        arrayList3.add(qfhVar);
        qfl qflVar = new qfl();
        qflVar.d(i);
        qflVar.a(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(qflVar);
        qfkVar.c(arrayList4);
        arrayList.add(qfkVar);
        qfzVar.a(arrayList);
        return qfzVar;
    }

    private static void b(int i, List<String> list, int i2, List<qfz> list2, ResponseCallback<ResponseMsgBody> responseCallback, Map<String, Integer> map) {
        int wearTaskIdByCloudId;
        boolean zE = njy.e(list);
        ArrayList arrayList = new ArrayList();
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HL_DeviceTaskManager");
        boolean zContains = deviceInfo != null ? d.contains(Integer.valueOf(deviceInfo.getProductType())) : false;
        ReleaseLogUtil.d("HL_DeviceTaskManager", "handleTasksMessageResult isNotSupportNewTask ", Boolean.valueOf(zContains));
        StringBuilder sb = new StringBuilder("1,");
        StringBuilder sb2 = new StringBuilder();
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            qfz qfzVar = list2.get(i3);
            if (qfzVar != null && ((!njy.e(qfzVar.j()) || !njy.e(qfzVar.f())) && ((wearTaskIdByCloudId = WearTaskEnum.getWearTaskIdByCloudId(qfzVar.g())) <= 14 || !zContains))) {
                if (zE || list.contains(String.valueOf(wearTaskIdByCloudId))) {
                    arrayList.add(qfzVar);
                }
                sb.append(wearTaskIdByCloudId);
                if (i3 != size - 1) {
                    sb.append(",");
                }
                b(qfzVar, sb2, wearTaskIdByCloudId, i);
            }
        }
        String string = sb.toString();
        if (string.endsWith(",")) {
            string = string.substring(0, string.length() - 1);
        }
        ResponseMsgBody responseMsgBodyA = a(i, i2, arrayList, map);
        responseMsgBodyA.setMsgType(2001);
        responseMsgBodyA.setAllTasks(string);
        responseMsgBodyA.setCompletedTasks(sb2.toString());
        responseCallback.onResponse(0, responseMsgBodyA);
    }

    private static void b(qfz qfzVar, StringBuilder sb, int i, int i2) {
        List<qfk> listJ = qfzVar.j();
        if (njy.b(listJ)) {
            d(sb, i, listJ);
        } else {
            a(qfzVar, sb, i, i2);
        }
    }

    private static void d(StringBuilder sb, int i, List<qfk> list) {
        for (qfk qfkVar : list) {
            if (qfkVar != null) {
                List<qfl> listY = qfkVar.y();
                if (!njy.e(listY)) {
                    for (qfl qflVar : listY) {
                        if (qflVar != null && qflVar.d() > 0) {
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            sb.append(i);
                        }
                    }
                }
            }
        }
    }

    private static void a(qfz qfzVar, StringBuilder sb, int i, int i2) {
        List<qfq> listF = qfzVar.f();
        if (njy.b(listF)) {
            ArrayList<TaskBean> arrayList = new ArrayList();
            c(i2, listF, qfzVar.g(), bxp.b().a(), arrayList);
            for (TaskBean taskBean : arrayList) {
                if (taskBean != null && taskBean.getStatus() > 0) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(i);
                }
            }
        }
    }

    private static ResponseMsgBody a(int i, int i2, List<qfz> list, Map<String, Integer> map) {
        ResponseMsgBody responseMsgBody = new ResponseMsgBody();
        responseMsgBody.setRecordDay(i);
        responseMsgBody.setResultCode(0);
        responseMsgBody.setTasks(c(i, i2, list));
        e(responseMsgBody, list, map);
        return responseMsgBody;
    }

    private static void e(ResponseMsgBody responseMsgBody, List<qfz> list, Map<String, Integer> map) {
        CloverProgress cloverProgress = new CloverProgress();
        if (bxp.b().a()) {
            d(map, cloverProgress);
        } else {
            c(map, cloverProgress, list);
        }
        responseMsgBody.setCloverProgress(cloverProgress);
    }

    private static void d(Map<String, Integer> map, CloverProgress cloverProgress) {
        boolean zContainsKey = map.containsKey("sport");
        boolean zContainsKey2 = map.containsKey("sleep");
        boolean zContainsKey3 = map.containsKey("emotion");
        boolean zContainsKey4 = map.containsKey("diet");
        float fC = qqw.c(map, "sleep", 0) / 100.0f;
        float fC2 = qqw.c(map, "sport", 0) / 100.0f;
        float fC3 = qqw.c(map, "emotion", 0) / 100.0f;
        float fC4 = qqw.c(map, "diet", 0) / 100.0f;
        if (zContainsKey && zContainsKey2 && zContainsKey3 && zContainsKey4) {
            cloverProgress.setLeft(fC);
            cloverProgress.setTop(fC2);
            cloverProgress.setRight(fC3);
            cloverProgress.setBottom(fC4);
            return;
        }
        if (!zContainsKey4) {
            cloverProgress.setLeft(fC);
            cloverProgress.setTop(fC2);
            cloverProgress.setRight(fC3);
        } else if (!zContainsKey3) {
            cloverProgress.setLeft(fC);
            cloverProgress.setTop(fC2);
            cloverProgress.setRight(fC4);
        } else if (!zContainsKey) {
            cloverProgress.setLeft(fC);
            cloverProgress.setTop(fC3);
            cloverProgress.setRight(fC4);
        } else {
            cloverProgress.setLeft(fC2);
            cloverProgress.setTop(fC3);
            cloverProgress.setRight(fC4);
        }
    }

    private static void c(Map<String, Integer> map, CloverProgress cloverProgress, List<qfz> list) {
        float fA;
        qfj qfjVar = new qfj();
        qfjVar.b(list);
        boolean zContainsKey = map.containsKey("sport");
        boolean zContainsKey2 = map.containsKey("sleep");
        boolean zContainsKey3 = map.containsKey("emotion");
        if (qfjVar.j(TaskEnum.STEPS.getTaskId()) != null) {
            fA = a(qfjVar, TaskEnum.STEPS.getTaskId());
        } else {
            fA = qfjVar.j(TaskEnum.EXERCISE_DURATION.getTaskId()) != null ? a(qfjVar, TaskEnum.EXERCISE_DURATION.getTaskId()) : 0.0f;
        }
        float fMin = Math.min(1, qfjVar.c(TaskEnum.WAKEUP_TIME.getTaskId()));
        float fMin2 = Math.min(Math.max(qfjVar.c(TaskEnum.DECOMP_AND_RELAX.getTaskId()), qfjVar.c(TaskEnum.AVG_DAILY_PRESSURE.getTaskId())), 1);
        if (zContainsKey && zContainsKey2 && zContainsKey3) {
            cloverProgress.setLeft(fMin);
            cloverProgress.setTop(fA);
            cloverProgress.setRight(fMin2);
        } else if (!zContainsKey2) {
            cloverProgress.setLeft(0.0f);
            cloverProgress.setTop(fA);
            cloverProgress.setRight(fMin2);
        } else if (!zContainsKey) {
            cloverProgress.setLeft(fMin);
            cloverProgress.setTop(fA);
            cloverProgress.setRight(fMin2);
        } else {
            cloverProgress.setLeft(fMin);
            cloverProgress.setTop(fA);
            cloverProgress.setRight(0.0f);
        }
    }

    private static float a(qfj qfjVar, String str) {
        int iJ = CommonUtil.j(qfjVar.e(str));
        float fJ = CommonUtil.j(qfjVar.g(str));
        if (iJ == 0) {
            return 0.0f;
        }
        return Math.min(1.0f, fJ / iJ);
    }

    private static float c(float f) {
        if (CommonUtil.b(f)) {
            return 0.0f;
        }
        return Math.max(f, 0.1f);
    }

    private static List<TaskBean> c(int i, int i2, List<qfz> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean zB = b(list, "T100110");
        if (i2 > 0) {
            size = Math.min(size, i2);
        }
        for (int i3 = 0; i3 < size; i3++) {
            qfz qfzVar = list.get(i3);
            if (qfzVar == null) {
                LogUtil.j("HL_DeviceTaskManager", "getTaskMessageArray lifeBean is null");
            } else {
                c(i, qfzVar, zB, arrayList);
            }
        }
        d(arrayList);
        return arrayList;
    }

    private static void c(int i, qfz qfzVar, boolean z, List<TaskBean> list) {
        boolean zA = bxp.b().a();
        List<qfk> listJ = qfzVar.j();
        if (njy.b(listJ)) {
            for (qfk qfkVar : listJ) {
                if (qfkVar != null) {
                    TaskBean taskBean = new TaskBean();
                    if (c(qfkVar, taskBean, zA)) {
                        e(qfkVar, taskBean, qfzVar, z, zA);
                        taskBean.setStatusDes(cbg.a(taskBean, i));
                        list.add(taskBean);
                    }
                }
            }
            return;
        }
        c(i, qfzVar.f(), qfzVar.g(), zA, list);
    }

    private static void c(int i, List<qfq> list, String str, boolean z, List<TaskBean> list2) {
        qfk qfkVar;
        if (njy.e(list)) {
            LogUtil.a("HL_DeviceTaskManager", "dealSubTask isEmpty taskId:", str);
            return;
        }
        if ("T120910".equals(str)) {
            d(i, list, str, z, list2);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<qfq> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            qfq next = it.next();
            if (next != null) {
                List<qfk> listG = next.g();
                if (!njy.e(listG) && (qfkVar = listG.get(0)) != null) {
                    jCurrentTimeMillis = qfkVar.f();
                    if (qfkVar.z() == 1) {
                        i2++;
                    }
                }
            }
        }
        TaskBean taskBean = new TaskBean();
        taskBean.setTaskTarget(String.valueOf(list.size()));
        taskBean.setTaskValue(String.valueOf(i2));
        taskBean.setStatus(i2 < list.size() ? 0 : 1);
        taskBean.setRestStatus(0);
        taskBean.setTaskId(WearTaskEnum.getWearTaskIdByCloudId(str));
        taskBean.setTaskType(WearTaskEnum.getTaskTypeByTaskId(str, z));
        taskBean.setTimestamp(jCurrentTimeMillis);
        String taskNameByTaskId = WearTaskEnum.getTaskNameByTaskId(str);
        taskBean.setTaskName(taskNameByTaskId);
        taskBean.setStatusDes(cbg.a(taskBean, i));
        list2.add(taskBean);
        LogUtil.a("HL_DeviceTaskManager", "dealSubTask taskId ", str, " taskName ", taskNameByTaskId, " language ", CommonUtil.u());
    }

    private static void d(int i, List<qfq> list, String str, boolean z, List<TaskBean> list2) {
        HashMap map = new HashMap();
        e(list, map);
        int size = map.size();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = map.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            List list3 = (List) ((Map.Entry) it.next()).getValue();
            long jE = e((List<qfq>) list3);
            if (a((List<qfq>) list3)) {
                i2++;
            }
            jCurrentTimeMillis = jE;
        }
        boolean z2 = size == 0;
        TaskBean taskBean = new TaskBean();
        String strValueOf = "";
        taskBean.setTaskTarget(z2 ? "" : String.valueOf(size));
        if (!z2) {
            strValueOf = String.valueOf(i2);
        }
        taskBean.setTaskValue(strValueOf);
        if (z2) {
            taskBean.setStatus(0);
            taskBean.setRestStatus(1);
        } else {
            taskBean.setRestStatus(0);
            taskBean.setStatus(i2 >= size ? 1 : 0);
        }
        taskBean.setTaskId(WearTaskEnum.getWearTaskIdByCloudId(str));
        taskBean.setTaskType(WearTaskEnum.getTaskTypeByTaskId(str, z));
        taskBean.setTimestamp(jCurrentTimeMillis);
        String taskNameByTaskId = WearTaskEnum.getTaskNameByTaskId(str);
        taskBean.setTaskName(taskNameByTaskId);
        taskBean.setStatusDes(cbg.a(taskBean, i));
        list2.add(taskBean);
        LogUtil.a("HL_DeviceTaskManager", "dealMedicineTask taskId ", str, " taskName ", taskNameByTaskId, " language ", CommonUtil.u());
    }

    private static void e(List<qfq> list, Map<Integer, List<qfq>> map) {
        qfg qfgVarB;
        int iOptInt;
        int iO = lsl.o(System.currentTimeMillis());
        for (qfq qfqVar : list) {
            if (qfqVar != null && (qfgVarB = qfqVar.b()) != null) {
                int iOptInt2 = 0;
                try {
                    JSONObject jSONObject = new JSONObject(qfgVarB.d());
                    iOptInt = jSONObject.optInt("medicinePeriod");
                    try {
                        iOptInt2 = jSONObject.optInt("medicationRuleExpectedTime");
                    } catch (JSONException unused) {
                        ReleaseLogUtil.a("HL_DeviceTaskManager", "JSONException medicinePeriod");
                    }
                } catch (JSONException unused2) {
                    iOptInt = 0;
                }
                if ((iOptInt & (1 << (iO - 1))) != 0) {
                    map.computeIfAbsent(Integer.valueOf(iOptInt2), new Function() { // from class: bxn
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return bxi.d((Integer) obj);
                        }
                    }).add(qfqVar);
                }
            }
        }
    }

    static /* synthetic */ List d(Integer num) {
        return new ArrayList();
    }

    private static boolean a(List<qfq> list) {
        if (njy.e(list)) {
            return false;
        }
        for (qfq qfqVar : list) {
            if (qfqVar != null) {
                for (qfk qfkVar : qfqVar.g()) {
                    if (qfkVar == null || qfkVar.z() != 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static long e(List<qfq> list) {
        if (njy.e(list)) {
            return System.currentTimeMillis();
        }
        for (qfq qfqVar : list) {
            if (qfqVar != null) {
                Iterator<qfk> it = qfqVar.g().iterator();
                if (it.hasNext()) {
                    qfk next = it.next();
                    if (next == null) {
                        return System.currentTimeMillis();
                    }
                    return next.f();
                }
            }
        }
        return System.currentTimeMillis();
    }

    private static void d(List<TaskBean> list) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (njy.b(list)) {
            i = 1;
            for (TaskBean taskBean : list) {
                if (taskBean != null) {
                    sb.append(taskBean.getTaskId());
                    if (taskBean.getStatus() <= 0) {
                        i = 0;
                    }
                }
            }
        } else {
            i = 1;
        }
        TaskBean taskBean2 = new TaskBean();
        taskBean2.setStatus(i);
        taskBean2.setTaskTarget(sb.toString());
        taskBean2.setTaskId(1);
        taskBean2.setTaskType(0);
        taskBean2.setTaskName(qre.f(R.string.IDS_perfect_clover));
        list.add(0, taskBean2);
    }

    private static void e(qfk qfkVar, TaskBean taskBean, qfz qfzVar, boolean z, boolean z2) {
        taskBean.setRestStatus(0);
        String strG = qfzVar.g();
        taskBean.setTaskId(WearTaskEnum.getWearTaskIdByCloudId(strG));
        if (z && !z2 && "T100210".equals(strG)) {
            taskBean.setTaskType(0);
        } else {
            taskBean.setTaskType(WearTaskEnum.getTaskTypeByTaskId(strG, z2));
        }
        taskBean.setTimestamp(qfkVar.f());
        String taskNameByTaskId = WearTaskEnum.getTaskNameByTaskId(strG);
        taskBean.setTaskName(taskNameByTaskId);
        if ("T100110".equals(strG)) {
            taskBean.setProgress(c(taskBean.getTaskValue(), taskBean.getTaskTarget()));
        }
        LogUtil.a("HL_DeviceTaskManager", "buildTaskData taskId ", strG, " taskName ", taskNameByTaskId, " language ", CommonUtil.u());
    }

    private static boolean c(qfk qfkVar, TaskBean taskBean, boolean z) {
        String strAb = qfkVar.ab();
        if ("T121610".equals(strAb) && !z) {
            taskBean.setTaskTarget("1");
        } else {
            String strJ = qfkVar.j();
            if (TextUtils.isEmpty(strJ)) {
                return false;
            }
            taskBean.setTaskTarget(strJ);
        }
        String strAa = qfkVar.aa();
        if (TextUtils.isEmpty(strAa)) {
            return true;
        }
        if (!cbg.i(WearTaskEnum.getWearTaskIdByCloudId(strAb))) {
            taskBean.setTaskValue(strAa);
        } else {
            if (CommonUtils.i(strAa) <= 0) {
                return true;
            }
            Calendar calendar = Calendar.getInstance();
            long jA = CommonUtils.a(strAa, System.currentTimeMillis());
            calendar.setTimeInMillis(jA);
            String strValueOf = String.valueOf(calendar.get(11));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.length() < 2) {
                strValueOf = "0" + strValueOf;
            }
            String strValueOf2 = String.valueOf(calendar.get(12));
            if (!TextUtils.isEmpty(strValueOf2) && strValueOf2.length() < 2) {
                strValueOf2 = "0" + strValueOf2;
            }
            taskBean.setTaskValue(DateFormatUtil.a(jA) + " " + strValueOf + ":" + strValueOf2);
        }
        taskBean.setStatus(qfkVar.z());
        return true;
    }

    private static float c(String str, String str2) {
        float f = CommonUtils.f(str);
        float f2 = CommonUtils.f(str2);
        if (CommonUtil.b(f2)) {
            return 0.0f;
        }
        return c(f / f2);
    }
}
