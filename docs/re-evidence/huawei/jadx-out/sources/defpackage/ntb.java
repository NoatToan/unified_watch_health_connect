package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.ContentVideo;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.hwsmartinteractmgr.smarter.BaseSmarter;
import com.huawei.hwsmartinteractmgr.smarter.BloodPressureSmarter;
import com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper;
import com.huawei.hwsmartinteractmgr.userlabel.LabelObserver;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ntb extends BaseSmarter implements LabelObserver {
    private static final Object d = new Object();
    private static volatile ntb e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nsv f43640b;
    private WeightSmarterHelper f;
    private int i;

    private ntb(Context context) {
        super(context);
        this.f43639a = 0;
        this.i = 5;
        this.f17713c = context.getApplicationContext();
        this.f43640b = nsv.e(this.f17713c);
        this.f = new WeightSmarterHelper(this.f17713c);
    }

    public static ntb a(Context context) {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    if (context == null) {
                        e = new ntb(BaseApplication.getContext());
                    } else {
                        e = new ntb(context);
                    }
                }
            }
        }
        return e;
    }

    @Override // com.huawei.hwsmartinteractmgr.smarter.BaseSmarter
    public void b() {
        LogUtil.a("SMART_WeightSmarter", "startTimerCheck");
        super.b();
        d();
        a();
        b(false);
        e();
    }

    public void a() {
        boolean zA = ntl.a(30001, "ai-weight-005");
        LogUtil.a("SMART_WeightSmarter", "setOrDeleteMeasureMsg isRuleOpen = ", Boolean.valueOf(zA));
        String strE = SharedPreferenceManager.e(this.f17713c, Integer.toString(10021), "ask_user_measure_weight");
        if (zA && !"1".equals(strE)) {
            if (WeightSmarterHelper.c(this.f17713c)) {
                String strC = ntl.c(30001, "ai-weight-005", "recently_num_days_no_data");
                String strC2 = ntl.c(30001, "ai-weight-005", "recommended_time");
                String strA = BloodPressureSmarter.a(strC2);
                LogUtil.a("SMART_WeightSmarter", "setOrDeleteMeasureMsg showTime = ", strA, "dayStr = ", strC, "recommendTime = ", strC2);
                try {
                    this.i = Integer.parseInt(strC);
                } catch (NumberFormatException e2) {
                    LogUtil.e("SMART_WeightSmarter", "setOrDeleteMeasureMsg NumberFormatException exception = ", e2.getMessage());
                }
                e(strA);
                return;
            }
            ntl.d(this.f17713c, 20005, 3);
            return;
        }
        ntl.d(this.f17713c, 20005, 3);
    }

    private void e(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        d(this.f17713c, new IBaseResponseCallback() { // from class: ntb.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    LogUtil.a("SMART_WeightSmarter", " setOrDeleteMeasureMsg,size = ", Integer.valueOf(list.size()));
                    long startTime = ((HiHealthData) list.get(0)).getStartTime();
                    ntb.this.f43639a = (int) ((jCurrentTimeMillis - startTime) / 86400000);
                    LogUtil.a("SMART_WeightSmarter", " setOrDeleteMeasureMsg,intervalDay = ", Integer.valueOf(ntb.this.f43639a));
                    if (ntb.this.i <= ntb.this.f43639a) {
                        ntb ntbVar = ntb.this;
                        ntbVar.e(ntbVar.f43639a, str, ntb.this.i);
                    } else {
                        LogUtil.a("SMART_WeightSmarter", " setOrDeleteMeasureMsg, MSG_STATUS_EXPIRED ");
                        ntl.d(ntb.this.f17713c, 20005, 3);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, int i2) {
        LogUtil.a("SMART_WeightSmarter", "setMeasureMsg ");
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(20005);
        smartMsgDbObject.setMsgSrc(2);
        a(smartMsgDbObject, str, i, SmartMsgConstant.SHOW_METHOD_SMART_CARD_HI_BOARD);
        smartMsgDbObject.setMessagePriority(ntl.d(30001, "ai-weight-005"));
        SmartMsgDbObject smartMsgDbObjectA = this.f43640b.a(20005);
        if (smartMsgDbObjectA == null) {
            this.f43640b.e(smartMsgDbObject);
            return;
        }
        long updateTime = smartMsgDbObjectA.getUpdateTime();
        LogUtil.a("SMART_WeightSmarter", "setMeasureMsg createTime = ", new Date(updateTime));
        if (System.currentTimeMillis() - updateTime > ((long) i2) * 86400000) {
            LogUtil.a("SMART_WeightSmarter", "setMeasureMsg update");
            this.f43640b.d(20005);
            this.f43640b.e(smartMsgDbObject);
        }
    }

    public void d(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        nkf.a().e(context, 0L, System.currentTimeMillis(), 2, new IBaseResponseCallback() { // from class: ntb.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    return;
                }
                if (!(obj instanceof List)) {
                    iBaseResponseCallback2.a(-1, obj);
                    return;
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(2);
                if (list.isEmpty()) {
                    iBaseResponseCallback.a(-1, arrayList);
                    return;
                }
                arrayList.add((HiHealthData) list.get(0));
                if (list.size() > 1) {
                    arrayList.add((HiHealthData) list.get(1));
                }
                iBaseResponseCallback.a(0, arrayList);
            }
        });
    }

    public void e(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        nkf.a().e(context, 0L, System.currentTimeMillis(), 99999, new IBaseResponseCallback() { // from class: ntb.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (iBaseResponseCallback == null) {
                    LogUtil.a("SMART_WeightSmarter", "getLatestMultiUserWeightData callback = null");
                    return;
                }
                ArrayList arrayList = new ArrayList(2);
                if (!(obj instanceof List)) {
                    iBaseResponseCallback.a(-1, arrayList);
                    return;
                }
                List list = (List) obj;
                if (!list.isEmpty()) {
                    arrayList.add((HiHealthData) list.get(0));
                }
                iBaseResponseCallback.a(0, arrayList);
            }
        });
    }

    private void a(final CommonUiBaseResponse commonUiBaseResponse) {
        boolean zA = ntl.a(30001, "ai-weight-001");
        String strE = SharedPreferenceManager.e(this.f17713c, Integer.toString(10021), "ask_user_set_weight_target");
        LogUtil.a("SMART_WeightSmarter", "isNeedSetWeightGoal isRuleOpen = ", Boolean.valueOf(zA));
        if (zA && !"1".equals(strE)) {
            nkb.d().e(this.f17713c, new IBaseResponseCallback() { // from class: ntb.6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("SMART_WeightSmarter", "isNeedSetWeightGoal getWeightGoal errCode = ", Integer.valueOf(i));
                    if (i == 100001) {
                        ntb.this.f.c("ai-weight-001", commonUiBaseResponse);
                        return;
                    }
                    CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                    if (commonUiBaseResponse2 != null) {
                        commonUiBaseResponse2.onResponse(100001, null);
                    }
                }
            });
            return;
        }
        LogUtil.a("SMART_WeightSmarter", "isNeedSetWeightGoal rule close");
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(100001, null);
        }
    }

    public void d() {
        a(new CommonUiBaseResponse() { // from class: ntb.7
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("SMART_WeightSmarter", "setOrDeleteSetWeightGoalMsg errCode = ", Integer.valueOf(i));
                if (i == 100001) {
                    ntl.d(ntb.this.f17713c, 20000, 3);
                } else if (i == 0 && ntb.this.f43640b.a(20000) == null) {
                    ntb.this.c();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(20000);
        smartMsgDbObject.setMsgSrc(2);
        smartMsgDbObject.setMsgContentType(2);
        smartMsgDbObject.setMsgContent(new JSONObject().toString());
        smartMsgDbObject.setShowTime(SmartMsgConstant.DEFAULT_SHOW_TIME);
        smartMsgDbObject.setShowMethod(SmartMsgConstant.SHOW_METHOD_SMART_CARD_HI_BOARD);
        smartMsgDbObject.setStatus(1);
        smartMsgDbObject.setMessagePriority(ntl.d(30001, "ai-weight-001"));
        this.f43640b.d(20000);
        LogUtil.a("SMART_WeightSmarter", "setWeightGoalMsg isInserted = ", Boolean.valueOf(this.f43640b.e(smartMsgDbObject)));
    }

    public void e() {
        LogUtil.a("SMART_WeightSmarter", "setOrDeleteSuggestVideo ");
        this.f.a(new CommonUiBaseResponse() { // from class: ntb.8
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("SMART_WeightSmarter", "setOrDeleteSuggestVideo errCode = ", Integer.valueOf(i));
                if (i == 0) {
                    ntb.this.a(new IBaseResponseCallback() { // from class: ntb.8.1
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj2) {
                            if (i2 == 0 && (obj2 instanceof FitWorkout)) {
                                ntb.this.d((FitWorkout) obj2);
                            }
                        }
                    });
                } else if (i == 100001) {
                    ntl.d(ntb.this.f17713c, 20006, 3);
                } else {
                    LogUtil.a("SMART_WeightSmarter", "setOrDeleteSuggestVideo other errCode ");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SMART_WeightSmarter", "judgeFitVideoUpdate");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("SMART_WeightSmarter", "judgeFitVideoUpdate : courseApi is null.");
        } else {
            d(iBaseResponseCallback, courseApi, new WorkoutListBean(0, 1, -1, new Integer[]{1}, (Integer[]) null, (Integer[]) null, (Integer[]) null, 0));
        }
    }

    private void d(final IBaseResponseCallback iBaseResponseCallback, CourseApi courseApi, WorkoutListBean workoutListBean) {
        courseApi.getRecommendCourses("FITNESS_COURSE", workoutListBean, new UiCallback<List<Workout>>() { // from class: ntb.9
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.a("SMART_WeightSmarter", "suggestWeightVideo errorCode = ", Integer.valueOf(i), "errorInfo = ", str);
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(100001, null);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<Workout> list) {
                if (iBaseResponseCallback == null) {
                    return;
                }
                if (!njy.e(list)) {
                    List<FitWorkout> listB = pea.b(list);
                    if (njy.e(listB, 0)) {
                        LogUtil.e("SMART_WeightSmarter", "fitWorkouts out of bound, return");
                        return;
                    }
                    FitWorkout fitWorkout = listB.get(0);
                    String strAcquireId = fitWorkout.acquireId();
                    LogUtil.a("SMART_WeightSmarter", "judgeSuggestWeightVideo id = ", strAcquireId);
                    SmartMsgDbObject smartMsgDbObjectA = ntb.this.f43640b.a(20006);
                    LogUtil.a("SMART_WeightSmarter", "isUpdate getName= ", fitWorkout.acquireName());
                    if (smartMsgDbObjectA == null) {
                        iBaseResponseCallback.a(0, fitWorkout);
                        return;
                    }
                    FitWorkout fitWorkout2 = ((ContentVideo) HiJsonUtil.d(smartMsgDbObjectA.getMsgContent(), ContentVideo.class)).getFitWorkout();
                    if (fitWorkout2 == null) {
                        nsv.e(ntb.this.f17713c).d(20006);
                        iBaseResponseCallback.a(100001, null);
                        return;
                    } else if (strAcquireId != null && strAcquireId.equals(fitWorkout2.acquireId())) {
                        iBaseResponseCallback.a(100001, null);
                        return;
                    } else {
                        iBaseResponseCallback.a(0, fitWorkout);
                        return;
                    }
                }
                iBaseResponseCallback.a(100001, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FitWorkout fitWorkout) {
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(20006);
        smartMsgDbObject.setMsgSrc(2);
        smartMsgDbObject.setMsgContentType(2);
        smartMsgDbObject.setMsgContent(HiJsonUtil.e(new ContentVideo(fitWorkout), ContentVideo.class));
        smartMsgDbObject.setShowTime(SmartMsgConstant.DEFAULT_SHOW_TIME);
        smartMsgDbObject.setShowMethod(SmartMsgConstant.SHOW_METHOD_SMART_CARD_HI_BOARD);
        smartMsgDbObject.setStatus(1);
        smartMsgDbObject.setMessagePriority(ntl.d(30001, "ai-weight-006"));
        this.f43640b.d(20006);
        LogUtil.a("SMART_WeightSmarter", "setSuggestVideoMsg isInserted = ", Boolean.valueOf(this.f43640b.e(smartMsgDbObject)));
    }

    private void c(final CommonUiBaseResponse commonUiBaseResponse) {
        boolean zA = ntl.a(30001, "ai-weight-007");
        LogUtil.a("SMART_WeightSmarter", "judgeSuggestWeightWeekly isRuleOpen = ", Boolean.valueOf(zA));
        if (zA) {
            long[] jArrS = HiDateUtil.s(System.currentTimeMillis() - 604800000);
            nkf.a().e(this.f17713c, jArrS[0], jArrS[1], 0, new IBaseResponseCallback() { // from class: ntb.11
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!(obj instanceof List)) {
                        commonUiBaseResponse.onResponse(100001, null);
                        return;
                    }
                    final List list = (List) obj;
                    if (!list.isEmpty()) {
                        ntb.this.f.c("ai-weight-007", new CommonUiBaseResponse() { // from class: ntb.11.5
                            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                            public void onResponse(int i2, Object obj2) {
                                if (i2 == 0) {
                                    if (njy.e(list, 0)) {
                                        LogUtil.e("SMART_WeightSmarter", "dataList out of bound, return");
                                        return;
                                    } else {
                                        commonUiBaseResponse.onResponse(0, list.get(0));
                                        return;
                                    }
                                }
                                commonUiBaseResponse.onResponse(100001, null);
                            }
                        });
                    } else {
                        LogUtil.a("SMART_WeightSmarter", "judgeSuggestWeightWeekly,getWeightData = null ");
                        commonUiBaseResponse.onResponse(100001, null);
                    }
                }
            });
        } else {
            commonUiBaseResponse.onResponse(100001, null);
        }
    }

    public void b(final boolean z) {
        LogUtil.a("SMART_WeightSmarter", "setOrDeleteWeightWeekly isParamChanged = ", Boolean.valueOf(z));
        c(new CommonUiBaseResponse() { // from class: ntb.12
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("SMART_WeightSmarter", "setOrDeleteWeightWeekly errCode = ", Integer.valueOf(i));
                if (!(obj instanceof HiHealthData)) {
                    LogUtil.a("SMART_WeightSmarter", "setOrDeleteWeightWeekly objData is null");
                    return;
                }
                if (i == 0) {
                    ntb.this.a((HiHealthData) obj);
                } else if (z) {
                    ntl.d(ntb.this.f17713c, 20007, 3);
                    SharedPreferenceManager.e(ntb.this.f17713c, Integer.toString(10006), "health_weight_weekly_start_time_key", "", new StorageParams());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HiHealthData hiHealthData) {
        final long[] jArrS = HiDateUtil.s(hiHealthData.getStartTime());
        LogUtil.a("SMART_WeightSmarter", "setOrDeleteWeightWeekly,timePeriod = ", Arrays.toString(jArrS));
        this.f.c(jArrS, new CommonUiBaseResponse() { // from class: ntb.1
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                if (obj == null) {
                    return;
                }
                final double[] dArr = (double[]) obj;
                if (dArr.length == 2) {
                    nkb.d().e(ntb.this.f17713c, new IBaseResponseCallback() { // from class: ntb.1.5
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj2) {
                            if (!(obj2 instanceof Double)) {
                                LogUtil.j("SMART_WeightSmarter", "objData is not Double");
                            } else {
                                ntb.this.f.a(jArrS, dArr, ((Double) obj2).doubleValue());
                            }
                        }
                    });
                } else {
                    LogUtil.a("SMART_WeightSmarter", "setOrDeleteWeightWeekly,this week has no data");
                }
            }
        });
    }

    public void a(final double d2, final long j, boolean z) {
        double d3;
        String strValueOf;
        if (z || Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ntb.3
                @Override // java.lang.Runnable
                public void run() {
                    ntb.this.a(d2, j, false);
                }
            });
            return;
        }
        LogUtil.a("SMART_WeightSmarter", "saveAndUpToCloud");
        String strE = SharedPreferenceManager.e(this.f17713c, Integer.toString(10006), "health_last_weight");
        LogUtil.d("SMART_WeightSmarter", "saveAndUpToCloud laststr=", strE);
        if (TextUtils.isEmpty(strE)) {
            this.f.c(d2);
            this.f.d(d2, j);
        } else {
            try {
                d3 = Double.parseDouble(strE);
            } catch (NumberFormatException e2) {
                LogUtil.e("SMART_WeightSmarter", "NumberFormatException = ", e2.getMessage());
                d3 = 0.0d;
            }
            if (Math.abs(d2 - d3) > 0.05d) {
                this.f.d(d2, j);
                this.f.c(d2);
            }
        }
        if (d2 <= 0.0d) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(d2);
        }
        LogUtil.a("SMART_WeightSmarter", "saveAndUpToCloud result = ", Integer.valueOf(SharedPreferenceManager.e(this.f17713c, Integer.toString(10006), "health_last_weight", strValueOf, new StorageParams(1))));
    }

    public void d(Context context, final double d2) {
        if (context == null) {
            LogUtil.a("SMART_WeightSmarter", "setWeightFlag context == null");
        } else {
            nkf.a().e(context.getApplicationContext(), 0L, System.currentTimeMillis(), 1, new IBaseResponseCallback() { // from class: ntb.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (list.isEmpty()) {
                            return;
                        }
                        if (d2 > ((HiHealthData) list.get(0)).getDouble("bodyWeight")) {
                            SharedPreferenceManager.e(ntb.this.f17713c, Integer.toString(10006), "health_weight_flag", "weight_gain", new StorageParams());
                        } else {
                            SharedPreferenceManager.e(ntb.this.f17713c, Integer.toString(10006), "health_weight_flag", "weight_loss", new StorageParams());
                        }
                    }
                }
            });
        }
    }

    @Override // com.huawei.hwsmartinteractmgr.userlabel.LabelObserver
    public void onChange(Map<Integer, List<String>> map) {
        if (map == null) {
            return;
        }
        List<String> list = map.get(1);
        List<String> list2 = map.get(2);
        LogUtil.a("SMART_WeightSmarter", "onChange");
        boolean[] zArrC = WeightSmarterHelper.c(list, list2);
        int length = zArrC.length;
        if (length > 0 && zArrC[0]) {
            d();
            e();
            b(true);
        }
        if (length <= 1 || !zArrC[1]) {
            return;
        }
        e();
    }
}
