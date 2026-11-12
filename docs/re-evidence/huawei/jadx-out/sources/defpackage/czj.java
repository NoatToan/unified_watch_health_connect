package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.featureuserprofile.todo.activity.TodoActivtiesResCallBack;
import com.huawei.featureuserprofile.todo.datatype.HistoriesDetailsBean;
import com.huawei.featureuserprofile.todo.datatype.HistoryBean;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class czj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<dlp> f31525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OperationUtilsApi f31526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f31527c;
    private final OperationInteractorsApi d;

    static class d {
        public static czj d = new czj();
    }

    private czj() {
        this.f31525a = new CopyOnWriteArrayList<>();
        this.f31527c = BaseApplication.getContext();
        this.d = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
    }

    public static czj a() {
        return d.d;
    }

    public void a(final int i, boolean z, final TodoActivtiesResCallBack<List<dlp>> todoActivtiesResCallBack) {
        LogUtil.a("TodoCardInteractors", "getActivityFromCloud()");
        if (z) {
            d(i, todoActivtiesResCallBack);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        d(new IBaseResponseCallback() { // from class: czj.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.a("TodoCardInteractors", "getActivityFromCloud resCode = " + i2);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                czj.this.a(obj, i, (TodoActivtiesResCallBack<List<dlp>>) todoActivtiesResCallBack);
                czj.this.a(i2, jCurrentTimeMillis, jCurrentTimeMillis2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, long j, long j2) {
        String str;
        if (i == 200) {
            str = "0";
        } else {
            str = "1";
        }
        long j3 = j2 - j;
        if (!"0".equals(str) || j3 >= 5000) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("module", "3");
            linkedHashMap.put("status", str);
            linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(j3));
            linkedHashMap.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(i));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_REQUEST_MODULE_85030001.value(), linkedHashMap);
        }
    }

    public void d(String str, final TodoActivtiesResCallBack<HistoryBean> todoActivtiesResCallBack) {
        c(str, new IBaseResponseCallback() { // from class: czj.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("TodoCardInteractors", "getHistoryFromCloud resCode = ", Integer.valueOf(i));
                if (obj instanceof HistoryBean) {
                    HistoryBean historyBean = (HistoryBean) obj;
                    LogUtil.d("TodoCardInteractors", "getHistoryFromCloud historyBean = ", historyBean.toString());
                    todoActivtiesResCallBack.onFinished(historyBean);
                    return;
                }
                todoActivtiesResCallBack.onFinished(null);
            }
        });
    }

    private void c(String str, final IBaseResponseCallback iBaseResponseCallback) {
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        final Map<String, String> headers = activityInfoListFactory.getHeaders();
        if (headers.get("x-huid") == null) {
            LogUtil.j("TodoCardInteractors", "getHistory fail, x-huid is null");
            return;
        }
        final Map<String, Object> body = activityInfoListFactory.getBody(null);
        body.put("activityId", str);
        GRSManager.c(this.f31527c).d("activityUrl", new GrsQueryCallback() { // from class: czj.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str2) {
                LogUtil.d("TodoCardInteractors", "GRSManager onCallBackSuccess ACTIVITY_KEY url = ", str2);
                LogUtil.d("TodoCardInteractors", "HttpPost request url:", str2, "/activity/getHistory", " params:", body.toString(), ",headers:", headers.toString());
                oet.d().c(str2 + "/activity/getHistory", headers, ofe.c((Object) body), HistoryBean.class, new ResultCallback<HistoryBean>() { // from class: czj.4.1
                    @Override // com.huawei.networkclient.ResultCallback
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(HistoryBean historyBean) {
                        LogUtil.a("TodoCardInteractors", "getHistory success. data: ", historyBean.getResultCode());
                        iBaseResponseCallback.a(historyBean.getResultCode().intValue(), historyBean);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        LogUtil.j("TodoCardInteractors", "getHistory onFailure. throwable: ", th.toString());
                        iBaseResponseCallback.a(-1, null);
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("TodoCardInteractors", "GRSManager onCallBackFail ACTIVITY_KEY code = ", Integer.valueOf(i));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    public void d(int i, TodoActivtiesResCallBack<List<dlp>> todoActivtiesResCallBack) {
        String strE;
        String str;
        if (i == 0) {
            strE = SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), "HOME_TODO_ACTIVITY_SAVE_TIME");
            str = "HOME_TODO_ACTIVITY_SAVE";
        } else if (i != 1) {
            LogUtil.j("TodoCardInteractors", "no branch!");
            strE = "";
            str = "";
        } else {
            strE = SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), "HOME_PREVIEW_ACTIVITY_SAVE_TIME");
            str = "HOME_PREVIEW_ACTIVITY_SAVE";
        }
        if (d(strE) && !TextUtils.isEmpty(str)) {
            try {
                e(new JSONArray(SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), str)), i, true, todoActivtiesResCallBack);
                return;
            } catch (JSONException e) {
                LogUtil.e("TodoCardInteractors", "数据解析出错：", e.getMessage());
            }
        }
        todoActivtiesResCallBack.onFinished(null);
    }

    private boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (lsl.c(Long.parseLong(str), System.currentTimeMillis())) {
                return true;
            }
            c();
            return false;
        } catch (NumberFormatException e) {
            LogUtil.e("TodoCardInteractors", "缓存记录时间数字格式转换异常", e.getMessage());
            return true;
        }
    }

    private void c() {
        StorageParams storageParams = new StorageParams();
        SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), "HOME_PREVIEW_ACTIVITY_SAVE", "", storageParams);
        SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), "HOME_PREVIEW_USED_DATA_SAVE", "", storageParams);
        SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), "HOME_TODO_ACTIVITY_SAVE", "", storageParams);
    }

    private void e(int i, JSONArray jSONArray) {
        if (jSONArray == null) {
            LogUtil.j("TodoCardInteractors", "saveCache saveOperationActivitys is null, return");
            return;
        }
        LogUtil.d("TodoCardInteractors", "saveOperationActivitys = + ", jSONArray);
        StorageParams storageParams = new StorageParams();
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTime();
        String str = "";
        if (i == 0) {
            SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), "HOME_TODO_ACTIVITY_SAVE_TIME", time.getTime() + "", storageParams);
            str = "HOME_TODO_ACTIVITY_SAVE";
        } else if (i != 1) {
            LogUtil.j("TodoCardInteractors", "no branch!");
        } else {
            SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), "HOME_PREVIEW_ACTIVITY_SAVE_TIME", time.getTime() + "", storageParams);
            str = "HOME_PREVIEW_ACTIVITY_SAVE";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferenceManager.e(this.f31527c, Integer.toString(10026), str, jSONArray.toString(), storageParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, int i, TodoActivtiesResCallBack<List<dlp>> todoActivtiesResCallBack) {
        if (!njy.b(obj, dlp.class)) {
            todoActivtiesResCallBack.onFinished(null);
            LogUtil.j("TodoCardInteractors", "processActivties result type is error");
            return;
        }
        List<dlp> list = (List) obj;
        if (njy.e(list)) {
            LogUtil.a("TodoCardInteractors", "processActivties: operationObjects is empty");
            todoActivtiesResCallBack.onFinished(new ArrayList());
            e(i, new JSONArray());
        } else {
            LogUtil.d("TodoCardInteractors", "processActivties result = " + obj.toString());
            e(list, todoActivtiesResCallBack);
        }
    }

    private void e(JSONArray jSONArray, int i, boolean z, TodoActivtiesResCallBack<List<dlp>> todoActivtiesResCallBack) throws JSONException {
        LogUtil.a("TodoCardInteractors", "getActivitiseResSucc：type=" + i);
        if (i != 0) {
            if (i == 1) {
                c(jSONArray, z, todoActivtiesResCallBack);
                return;
            } else {
                LogUtil.j("TodoCardInteractors", "no branch!");
                todoActivtiesResCallBack.onFinished(null);
                return;
            }
        }
        this.f31525a.clear();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            dlp dlpVarExpoundOperationActivity = this.d.expoundOperationActivity(jSONArray.getJSONObject(i2));
            if (dlpVarExpoundOperationActivity != null && !e(dlpVarExpoundOperationActivity) && dlpVarExpoundOperationActivity.i() == 0) {
                this.f31525a.add(dlpVarExpoundOperationActivity);
            }
        }
        todoActivtiesResCallBack.onFinished(new ArrayList(this.f31525a));
    }

    private void c(JSONArray jSONArray, boolean z, TodoActivtiesResCallBack<List<dlp>> todoActivtiesResCallBack) throws JSONException {
        int iC;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            dlp dlpVarExpoundOperationActivity = this.d.expoundOperationActivity(jSONObject);
            if (dlpVarExpoundOperationActivity != null && !TextUtils.isEmpty(dlpVarExpoundOperationActivity.r()) && (iC = c(dlpVarExpoundOperationActivity.r(), dlpVarExpoundOperationActivity.v())) <= 3 && iC >= 1 && dlpVarExpoundOperationActivity.j() == 3) {
                jSONArray2.put(jSONObject);
                arrayList.add(dlpVarExpoundOperationActivity);
            }
        }
        if (!z) {
            e(1, jSONArray2);
        }
        Collections.sort(arrayList, new czl());
        todoActivtiesResCallBack.onFinished(arrayList);
    }

    private void e(List<dlp> list, final TodoActivtiesResCallBack<List<dlp>> todoActivtiesResCallBack) {
        LogUtil.a("TodoCardInteractors", "todoActivitiseResSucc");
        JSONArray jSONArray = new JSONArray();
        this.f31525a.clear();
        for (dlp dlpVar : list) {
            if (dlpVar != null && !e(dlpVar) && dlpVar.i() == 0) {
                jSONArray.put(qqt.b(dlpVar));
                this.f31525a.add(dlpVar);
            }
        }
        b(new HttpResCallback() { // from class: czj.5
            @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
            public void onFinished(int i, String str) {
                if (i != 200) {
                    LogUtil.a("TodoCardInteractors", "handleUserActivity, resCode = ", Integer.valueOf(i));
                }
                czj.this.b(todoActivtiesResCallBack, 0);
            }
        });
        e(0, jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final TodoActivtiesResCallBack<List<dlp>> todoActivtiesResCallBack, final int i) {
        LogUtil.a("TodoCardInteractors", "getHistoryFromCloudCircle:mTodoActivityList:", Integer.valueOf(this.f31525a.size()), ",index: ", Integer.valueOf(i));
        if (this.f31525a.size() <= i) {
            todoActivtiesResCallBack.onFinished(null);
            return;
        }
        final dlp dlpVar = this.f31525a.get(i);
        if (dlpVar != null && !TextUtils.isEmpty(dlpVar.d())) {
            d(dlpVar.d(), new TodoActivtiesResCallBack<HistoryBean>() { // from class: czj.2
                @Override // com.huawei.featureuserprofile.todo.activity.TodoActivtiesResCallBack
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onFinished(HistoryBean historyBean) {
                    czj.this.d(historyBean, i, dlpVar, (TodoActivtiesResCallBack<List<dlp>>) todoActivtiesResCallBack);
                }
            });
        } else {
            todoActivtiesResCallBack.onFinished(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HistoryBean historyBean, int i, dlp dlpVar, TodoActivtiesResCallBack<List<dlp>> todoActivtiesResCallBack) {
        if (historyBean != null) {
            LogUtil.a("TodoCardInteractors", "dealHistoryActivity: historyBean = ", historyBean.toString());
            List<HistoriesDetailsBean> histories = historyBean.getHistories();
            if (histories != null) {
                d(histories);
            }
            historyBean.setHistories(histories);
            if (c(historyBean)) {
                LogUtil.a("TodoCardInteractors", "成绩达标，删除数据：", Integer.valueOf(i));
                if (this.f31525a.size() > i) {
                    this.f31525a.remove(i);
                }
                if (this.f31525a.size() > i) {
                    b(todoActivtiesResCallBack, i);
                    return;
                }
            } else {
                dlpVar.g(2);
                dlpVar.a(historyBean.getActivityTarget());
                dlpVar.j(historyBean.getContinuity());
                dlpVar.f(historyBean.getTargetDays());
                dlpVar.e(0);
                int i2 = i + 1;
                if (this.f31525a.size() > i2) {
                    b(todoActivtiesResCallBack, i2);
                    return;
                }
            }
        } else {
            dlpVar.g(1);
            int i3 = i + 1;
            if (this.f31525a.size() > i3) {
                b(todoActivtiesResCallBack, i3);
                return;
            }
        }
        LogUtil.a("TodoCardInteractors", "历史数据获取完毕，回调结果");
        b(this.f31525a);
        LogUtil.a("TodoCardInteractors", "dealHistoryActivity，mTodoActivityList.size = ", Integer.valueOf(this.f31525a.size()));
        todoActivtiesResCallBack.onFinished(new ArrayList(this.f31525a));
    }

    private void b(HttpResCallback httpResCallback) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(this.f31525a)) {
            LogUtil.j("TodoCardInteractors", "handleUserActivity, mTodoActivityList is null");
            httpResCallback.onFinished(-1, null);
            return;
        }
        for (int i = 0; i < this.f31525a.size(); i++) {
            dlp dlpVar = this.f31525a.get(i);
            if (dlpVar != null && !TextUtils.isEmpty(dlpVar.d())) {
                arrayList.add(dlpVar.d());
            }
        }
        if (arrayList.size() == 0) {
            httpResCallback.onFinished(-1, null);
        } else {
            d(1, arrayList.get(0), arrayList, httpResCallback);
        }
    }

    private void d(int i, String str, List<String> list, final HttpResCallback httpResCallback) {
        OperationInteractorsApi operationInteractorsApi = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        if (operationInteractorsApi == null) {
            LogUtil.e("TodoCardInteractors", "getActivityInfo, operationApi is null");
            httpResCallback.onFinished(-1, null);
        } else {
            operationInteractorsApi.getUserActivityInfo(i, str, list, new IBaseResponseCallback() { // from class: czj.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (!(obj instanceof List)) {
                        LogUtil.j("TodoCardInteractors", "objData isn't instanceof List");
                        httpResCallback.onFinished(-1, null);
                        return;
                    }
                    List<wog> list2 = (List) obj;
                    if (!njy.e(list2)) {
                        for (dlp dlpVar : czj.this.f31525a) {
                            if (dlpVar != null && czj.this.a(dlpVar.h())) {
                                for (wog wogVar : list2) {
                                    if (dlpVar.d().equals(wogVar.b())) {
                                        if (wogVar.d() != 0) {
                                            czj.this.f31525a.remove(dlpVar);
                                        } else {
                                            dlpVar.e(0);
                                        }
                                    }
                                }
                            }
                        }
                        httpResCallback.onFinished(200, null);
                        return;
                    }
                    LogUtil.a("TodoCardInteractors", "getActivityInfo, infoList is null");
                    httpResCallback.onFinished(-1, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        if (this.f31526b == null) {
            this.f31526b = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
        }
        OperationUtilsApi operationUtilsApi = this.f31526b;
        if (operationUtilsApi != null) {
            return operationUtilsApi.isChallengeActivity(i);
        }
        return false;
    }

    private void d(List<HistoriesDetailsBean> list) {
        if (njy.e(list)) {
            LogUtil.j("TodoCardInteractors", "filterAbnormalData historiesDetailsBeanList is empty");
            return;
        }
        Iterator<HistoriesDetailsBean> it = list.iterator();
        LogUtil.a("TodoCardInteractors", "filterAbnormalData start: histories size = ", Integer.valueOf(list.size()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        while (it.hasNext()) {
            HistoriesDetailsBean next = it.next();
            if (next == null) {
                LogUtil.j("TodoCardInteractors", "filterAbnormalData HistoriesDetailsBean is null");
                it.remove();
            } else if (TextUtils.isEmpty(next.getActivityDate())) {
                LogUtil.a("TodoCardInteractors", "filterAbnormalData histories activityDate is empty");
                it.remove();
            } else {
                try {
                    Date date = simpleDateFormat.parse(next.getActivityDate());
                    Date date2 = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
                    if (date != null && date.compareTo(date2) > 0) {
                        it.remove();
                    }
                } catch (ParseException e) {
                    LogUtil.e("TodoCardInteractors", "filterAbnormalData exception ", e.getMessage());
                }
            }
        }
        LogUtil.a("TodoCardInteractors", "filterAbnormalData end : histories size = ", Integer.valueOf(list.size()));
    }

    private void b(List<dlp> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectActivityBeanToJSONObject = this.d.activityBeanToJSONObject((dlp) it.next());
            if (jSONObjectActivityBeanToJSONObject != null) {
                jSONArray.put(jSONObjectActivityBeanToJSONObject);
            }
        }
        e(0, jSONArray);
    }

    private boolean c(HistoryBean historyBean) {
        boolean z = false;
        if (historyBean != null) {
            if (historyBean.getStatus() > 0) {
                return true;
            }
            List<HistoriesDetailsBean> histories = historyBean.getHistories();
            if (njy.e(histories)) {
                LogUtil.j("TodoCardInteractors", "isComplete detailsList is empty ");
                return false;
            }
            HistoriesDetailsBean historiesDetailsBean = histories.get(0);
            if (historiesDetailsBean != null) {
                String activityDate = historiesDetailsBean.getActivityDate();
                if (!TextUtils.isEmpty(activityDate)) {
                    try {
                        if (lsl.c(DateFormatUtil.d(activityDate, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD).getTime(), System.currentTimeMillis()) && historiesDetailsBean.getCompleteFlag() == 1) {
                            z = true;
                        }
                    } catch (ParseException unused) {
                        LogUtil.e("TodoCardInteractors", "Covert Time Format Exception");
                    }
                }
                LogUtil.a("TodoCardInteractors", "isComplete = ", Boolean.valueOf(z));
                return z;
            }
        }
        return false;
    }

    private boolean e(dlp dlpVar) {
        boolean z = c(dlpVar.s(), dlpVar.v()) > 0 || c(dlpVar.o(), dlpVar.v()) < 0 || dlpVar.h() == 400;
        if (TextUtils.isEmpty(dlpVar.r()) || dlpVar.j() != 3 || c(dlpVar.r(), dlpVar.v()) <= 0) {
            return z;
        }
        return true;
    }

    private void d(final IBaseResponseCallback iBaseResponseCallback) {
        if (CommonUtil.ca() || !VersionControlUtil.isSupportOperationAccount()) {
            LogUtil.a("TodoCardInteractors", "isStoreDemoVersion or kidAcccount getOperationList return.");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        final Map<String, String> headers = activityInfoListFactory.getHeaders();
        if (headers.get("x-huid") == null) {
            LogUtil.e("TodoCardInteractors", "getActivityInfo fail, x-huid is null");
        } else {
            final Map<String, Object> mapD = d(activityInfoListFactory.getBody(null));
            ThreadPoolManager.c().execute(new Runnable() { // from class: czj.10
                @Override // java.lang.Runnable
                public void run() {
                    oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("activityUrl") + "/activity/getActivities", headers, ofe.c((Object) mapD), cze.class, new ResultCallback<cze>() { // from class: czj.10.4
                        @Override // com.huawei.networkclient.ResultCallback
                        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(cze czeVar) {
                            LogUtil.a("TodoCardInteractors", "getOperationList success. data: ", czeVar.getResultCode());
                            iBaseResponseCallback.a(czeVar.getResultCode().intValue(), czeVar.b());
                        }

                        @Override // com.huawei.networkclient.ResultCallback
                        public void onFailure(Throwable th) {
                            LogUtil.j("TodoCardInteractors", "getOperationList onFailure. throwable: ", th.toString());
                            iBaseResponseCallback.a(-1, null);
                        }
                    });
                }
            });
        }
    }

    private Map<String, Object> d(Map<String, Object> map) {
        map.put("pageNo", "0");
        map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, "1000");
        map.put("joinStatus", "1");
        map.put("finishFlag", "1");
        if (!CommonUtil.ap() && !CommonUtil.cl()) {
            return map;
        }
        map.put("isBeta", "1");
        return map;
    }

    private int c(String str, String str2) {
        try {
            int iC = lsl.c(System.currentTimeMillis(), lsl.a(str2), DateFormatUtil.b(str, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT, lsl.d()).getTime(), lsl.a(str2));
            return iC > 0 ? iC - 1 : iC + 1;
        } catch (ParseException e) {
            LogUtil.e("TodoCardInteractors", "格式日期出错:" + e.getMessage());
            return 0;
        }
    }
}
