package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.sleep.SleepApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepMonthlyProcessResultCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil;
import com.huawei.ui.main.stories.fitness.views.coresleep.RegularWorkAndRestTimeView;
import com.huawei.ui.main.stories.fitness.views.coresleep.RestrictNapsProgressBar;
import com.huawei.ui.main.stories.fitness.views.coresleep.SleepTaskDialog;
import defpackage.gwd;
import defpackage.gwe;
import defpackage.gwl;
import defpackage.gwv;
import defpackage.gwy;
import defpackage.gxb;
import defpackage.gxc;
import defpackage.gxh;
import defpackage.ioi;
import defpackage.njy;
import defpackage.tza;
import defpackage.uag;
import defpackage.uck;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@H5ProService(name = SleepManagementJsUtil.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class SleepManagementJsUtil {
    private static final String BROADCASTTODISMISSBUBBLE = "broadcastToDismissBubble";
    private static final String BUBBLE_DISMISS = "BUBBLE_DISMISS";
    private static final String BUBBLE_ON_WEBVIEW_FOR_ENTRY = "BUBBLE_ON_WEBVIEW_FOR_ENTRY";
    private static final String BUBBLE_ON_WEBVIEW_FOR_MONTH_DATA = "BUBBLE_ON_WEBVIEW_FOR_MONTH_DATA";
    private static final int GENERATE_TYPE = 1;
    private static final String SP_KEY_ALARM_INFO = "SLEEP_RECORD_ALARM_INFO";
    private static final String TAG = "SleepManagementJsUtil";
    private static final String TAG_RELEASE = "R_SleepManagementJsUtil";
    private static final int UNIQUE_ALARM_ID = 1000;

    public static /* synthetic */ void lambda$showPrivateOpenDialog$1(View view) {
    }

    private SleepManagementJsUtil() {
    }

    @H5ProMethod(name = "getQuestionnaire")
    public static void getQuestionnaire(long j, long j2, final SleepManagementCallback<List<String>> sleepManagementCallback) {
        if (sleepManagementCallback == null) {
            LogUtil.j(TAG, "getQuestionnaire callback is null");
            return;
        }
        if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.j(TAG, "not support sleep management");
            sleepManagementCallback.onFailure(-1, "not support sleep management");
            return;
        }
        LogUtil.j(TAG, "getQuestionnaire callback return");
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        if (sleepApi == null) {
            LogUtil.a(TAG, "sleepServiceApi is null");
            sleepManagementCallback.onFailure(-1, "getQuestionnaire sleepServiceApi is null");
        } else {
            sleepApi.requestQuestionnaireProcessResult(j, j2, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!(obj instanceof gxb)) {
                        LogUtil.e(SleepManagementJsUtil.TAG, "obj is error");
                        sleepManagementCallback.onFailure(-1, "obj is error");
                        return;
                    }
                    gxb gxbVar = (gxb) obj;
                    ArrayList arrayList = new ArrayList();
                    if (njy.e(gxbVar.e())) {
                        LogUtil.e(SleepManagementJsUtil.TAG, "QuestionnaireResultBean is null");
                        sleepManagementCallback.onFailure(-1, "QuestionnaireResultBean is null");
                    } else {
                        arrayList.addAll(gxbVar.e());
                        LogUtil.a(SleepManagementJsUtil.TAG, "Questionnaire list： ", arrayList);
                        sleepManagementCallback.onSuccess(arrayList);
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "getQuestionnaireAndResult")
    public static void getQuestionnaireAndResult(long j, long j2, final SleepManagementCallback<gxb> sleepManagementCallback) {
        if (sleepManagementCallback == null) {
            LogUtil.j(TAG, "getQuestionnaire callback is null");
            return;
        }
        if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.j(TAG, "not support sleep management");
            sleepManagementCallback.onFailure(-1, "not support sleep management");
            return;
        }
        LogUtil.j(TAG, "getQuestionnaire callback return");
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        if (sleepApi == null) {
            LogUtil.a(TAG, "sleepServiceApi is null");
            sleepManagementCallback.onFailure(-1, "getQuestionnaire sleepServiceApi is null");
        } else {
            sleepApi.requestQuestionnaireProcessResult(j, j2, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!(obj instanceof gxb)) {
                        LogUtil.e(SleepManagementJsUtil.TAG, "obj is error");
                        sleepManagementCallback.onFailure(-1, "obj is error");
                        return;
                    }
                    gxb gxbVar = (gxb) obj;
                    if (njy.e(gxbVar.e())) {
                        LogUtil.e(SleepManagementJsUtil.TAG, "QuestionnaireResultBean is null");
                        sleepManagementCallback.onFailure(-1, "QuestionnaireResultBean is null");
                    } else {
                        LogUtil.a(SleepManagementJsUtil.TAG, "QuestionnaireResultBean： ", gxbVar.toString());
                        sleepManagementCallback.onSuccess(gxbVar);
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "getDailyProcessResult")
    public static void getDailyProcessResult(long j, SleepManagementCallback<gwl> sleepManagementCallback) {
        if (sleepManagementCallback == null) {
            LogUtil.j(TAG, "getDailyProcessResult callback is null");
        } else if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.j(TAG, "not support sleep management");
            sleepManagementCallback.onFailure(-1, "not support sleep management");
        } else {
            uag.a(j, sleepManagementCallback);
        }
    }

    @H5ProMethod(name = "startJobService")
    public static void startJobService(final SleepManagementCallback<Boolean> sleepManagementCallback) {
        if (VersionControlUtil.isSupportSleepManagement()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.9
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a(SleepManagementJsUtil.TAG, "startJobService");
                    tza.b().c();
                    uag.c(true);
                    sleepManagementCallback.onSuccess(true);
                }
            });
        }
    }

    @H5ProMethod(name = "stopJobService")
    public static void stopJobService(final SleepManagementCallback<Boolean> sleepManagementCallback) {
        if (VersionControlUtil.isSupportSleepManagement()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.7
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a(SleepManagementJsUtil.TAG, "stopJobService");
                    tza.b().e();
                    uag.c(false);
                    sleepManagementCallback.onSuccess(true);
                }
            });
        }
    }

    @H5ProMethod(name = BROADCASTTODISMISSBUBBLE)
    public static void broadcastToDismissBubble(final SleepManagementCallback<Boolean> sleepManagementCallback) {
        if (VersionControlUtil.isSupportSleepManagement()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.14
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a(SleepManagementJsUtil.TAG, SleepManagementJsUtil.BROADCASTTODISMISSBUBBLE);
                    ObserverManagerUtil.e(SleepManagementJsUtil.BUBBLE_DISMISS, SleepManagementJsUtil.BUBBLE_ON_WEBVIEW_FOR_ENTRY);
                    ObserverManagerUtil.e(SleepManagementJsUtil.BUBBLE_DISMISS, SleepManagementJsUtil.BUBBLE_ON_WEBVIEW_FOR_MONTH_DATA);
                    sleepManagementCallback.onSuccess(true);
                }
            });
        }
    }

    @H5ProMethod(name = "checkSleepUserPrivate")
    public static void checkUserPrivateAndIntroduce(SleepManagementCallback<Boolean> sleepManagementCallback) {
        checkAndShownPrivateDialog(sleepManagementCallback);
    }

    @H5ProMethod(name = "startSleepSync")
    public static void startSleepAllDataSync(SleepManagementCallback<Boolean> sleepManagementCallback) {
        ReleaseLogUtil.c(TAG, "startSleepAllDataSync callback:");
        if (VersionControlUtil.isSupportSleepManagement()) {
            ObserverManagerUtil.e("startSleepAllDataSync", sleepManagementCallback);
        } else if (sleepManagementCallback != null) {
            LogUtil.j(TAG, "startSleepAllDataSync callback is not support");
            sleepManagementCallback.onFailure(-1, "not SupportSleepManagement");
        }
    }

    private static void checkAndShownPrivateDialog(SleepManagementCallback<Boolean> sleepManagementCallback) {
        if (!VersionControlUtil.isSupportSleepManagement()) {
            ReleaseLogUtil.d(TAG, "checkAndShownPrivateDialog with not support sleep management.");
            if (sleepManagementCallback != null) {
                sleepManagementCallback.onFailure(-1, "no need check with not support sleepManagement");
                return;
            }
            return;
        }
        List<Integer> needOpenPrivate = getNeedOpenPrivate();
        if (!needOpenPrivate.isEmpty()) {
            showPrivateOpenDialog(needOpenPrivate, sleepManagementCallback);
        } else if (sleepManagementCallback != null) {
            sleepManagementCallback.onSuccess(true);
        }
    }

    public static List<Integer> getNeedOpenPrivate() {
        int[] iArr = {3, 7};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            if (!getPersonalPrivacySettingValue(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    public static void showPrivateOpenDialog(final List<Integer> list, final SleepManagementCallback<Boolean> sleepManagementCallback) {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null || njy.e(list)) {
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activityJ).b(R.string.IDS_sleep_private_introduce_content).c(R.string.IDS_settings_about_huawei_cloud_service_action_turn_on, new View.OnClickListener() { // from class: tzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepManagementJsUtil.lambda$showPrivateOpenDialog$0(list, view);
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: tzq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepManagementJsUtil.lambda$showPrivateOpenDialog$1(view);
            }
        }).c();
        if (sleepManagementCallback != null) {
            noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tzr
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SleepManagementJsUtil.lambda$showPrivateOpenDialog$2(sleepManagementCallback, dialogInterface);
                }
            });
        }
        noTitleCustomAlertDialogC.show();
    }

    public static /* synthetic */ void lambda$showPrivateOpenDialog$0(List list, View view) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            setPersonalPrivacySettingValue(((Integer) it.next()).intValue(), true);
        }
    }

    public static /* synthetic */ void lambda$showPrivateOpenDialog$2(SleepManagementCallback sleepManagementCallback, DialogInterface dialogInterface) {
        if (getNeedOpenPrivate().isEmpty()) {
            sleepManagementCallback.onSuccess(true);
        } else {
            sleepManagementCallback.onSuccess(false);
        }
    }

    public static boolean getPersonalPrivacySettingValue(int i) {
        String strC = ioi.d().c(i);
        LogUtil.a(TAG, "getPersonalPrivacySettingValue... privacyId: ", Integer.valueOf(i), " value: ", strC);
        return Boolean.TRUE.toString().equalsIgnoreCase(strC);
    }

    public static void setPersonalPrivacySettingValue(int i, boolean z) {
        ReleaseLogUtil.c(TAG, "setPersonalPrivacySettingValue... privacyId = ", Integer.valueOf(i), ", isOpen = ", Boolean.valueOf(z));
        ioi.d().e(i, z, TAG, new IBaseResponseCallback() { // from class: tzb
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                SleepManagementJsUtil.lambda$setPersonalPrivacySettingValue$3(i2, obj);
            }
        });
    }

    public static /* synthetic */ void lambda$setPersonalPrivacySettingValue$3(int i, Object obj) {
        if (i == 0) {
            ReleaseLogUtil.c(TAG, "onResponse setUserPrivacy success ");
        } else {
            ReleaseLogUtil.b(TAG, "onResponse setUserPrivacy failure");
        }
    }

    @H5ProMethod(name = "requestMonthProcessResult")
    public static void requestMonthProcessResult(final String str, final long j, final long j2, final SleepManagementCallback<Map<String, Object>> sleepManagementCallback) {
        if (sleepManagementCallback == null) {
            LogUtil.j(TAG, "getMonthProcessResult callback is null");
        } else if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.j(TAG, "not support sleep management");
            sleepManagementCallback.onFailure(-1, "not support sleep management");
        } else {
            LogUtil.a(TAG, "requestMonthProcessResult, questionResult: ", str);
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.15
                @Override // java.lang.Runnable
                public void run() {
                    gwv gwvVar;
                    gxc gxcVarBuildQuestionResult = SleepManagementJsUtil.buildQuestionResult(str);
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject("questionnaireMonthlyResult");
                        gwvVar = new gwv();
                        try {
                            gwvVar.c(jSONObject.optInt("monthly_level"));
                            gwvVar.d(jSONObject.optInt("monthly_rhythm"));
                            gwvVar.b(jSONObject.optInt("monthly_problem_val"));
                            gwvVar.e(jSONObject.optInt("monthly_problem"));
                            LogUtil.a(SleepManagementJsUtil.TAG, "monthlyResult: ", gwvVar);
                        } catch (JSONException unused) {
                            LogUtil.j(SleepManagementJsUtil.TAG, "object null");
                        }
                    } catch (JSONException unused2) {
                        gwvVar = null;
                    }
                    SleepManagementJsUtil.requestMonthResult(gxcVarBuildQuestionResult, gwvVar, j, j2, sleepManagementCallback);
                    LogUtil.a(SleepManagementJsUtil.TAG, "result: ", gxcVarBuildQuestionResult == null ? "" : gxcVarBuildQuestionResult.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static gxc buildQuestionResult(String str) {
        gxc gxcVar = new gxc();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("questionResult");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        gwy gwyVar = new gwy();
                        gwyVar.a(jSONObjectOptJSONObject.optInt("question"));
                        gwyVar.b(jSONObjectOptJSONObject.optInt(JsUtil.SCORE));
                        arrayList.add(gwyVar);
                    }
                }
                gxcVar.a(arrayList);
                return gxcVar;
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "buildQuestionResult JSONException");
        }
        return gxcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestMonthResult(gxc gxcVar, gwv gwvVar, final long j, long j2, final SleepManagementCallback<Map<String, Object>> sleepManagementCallback) {
        LogUtil.a(TAG, "requestMonthResult, questionnaireResult: ", gxcVar);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        if (sleepApi != null) {
            sleepApi.requestMonthlyProcessResult(gxcVar, gwvVar, j, j2, new SleepMonthlyProcessResultCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.11
                @Override // com.huawei.hwbasemgr.SleepMonthlyProcessResultCallback
                public void onResponse(int i, Object obj) {
                    if (!(obj instanceof gxh)) {
                        LogUtil.e(SleepManagementJsUtil.TAG, "objData error");
                        sleepManagementCallback.onFailure(-1, "requestMonthResult objData error");
                        return;
                    }
                    LogUtil.a(SleepManagementJsUtil.TAG, "handle from requestMonthResult");
                    gxh gxhVar = (gxh) obj;
                    try {
                        uag.e(i, obj, j, jCurrentTimeMillis, 1);
                    } catch (NoSuchMethodError e) {
                        ReleaseLogUtil.b(SleepManagementJsUtil.TAG_RELEASE, "requestMonthResult error ", ExceptionUtils.c(e));
                    }
                    sleepManagementCallback.onSuccess(uag.a(gxhVar, jCurrentTimeMillis));
                }
            });
        } else {
            LogUtil.a(TAG, "sleepServiceApi is null");
            sleepManagementCallback.onFailure(-1, "requestMonthResult sleepServiceApi is null");
        }
    }

    @H5ProMethod(name = "queryMonthProcessResultWithRecent")
    public static void queryMonthProcessResultWithRecent(long j, SleepManagementCallback<Map<String, Object>> sleepManagementCallback) {
        LogUtil.a(TAG, "queryMonthProcessResultWithRecent time: ", Long.valueOf(j));
        queryMonthLabel(j, sleepManagementCallback, true);
    }

    @H5ProMethod(name = "queryMonthProcessResult")
    public static void queryMonthProcessResult(long j, SleepManagementCallback<Map<String, Object>> sleepManagementCallback) {
        LogUtil.a(TAG, "queryMonthProcessResult time: ", Long.valueOf(j));
        queryMonthLabel(j, sleepManagementCallback, false);
    }

    private static void queryMonthLabel(final long j, final SleepManagementCallback<Map<String, Object>> sleepManagementCallback, final boolean z) {
        if (sleepManagementCallback == null) {
            LogUtil.j(TAG, "queryMonthProcessResult callback is null");
        } else if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.j(TAG, "not support sleep management");
            sleepManagementCallback.onFailure(-1, "not support sleep management");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.12
                @Override // java.lang.Runnable
                public void run() {
                    uag.c(new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.12.5
                        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                        public void onResult(Object obj, int i, int i2) {
                            LogUtil.a(SleepManagementJsUtil.TAG, "queryMonthResult onResult, data: ", obj);
                            if (i != 0) {
                                LogUtil.j(SleepManagementJsUtil.TAG, "errorCode: ", Integer.valueOf(i));
                                sleepManagementCallback.onFailure(-1, "errorCode: " + i);
                                return;
                            }
                            if (!(obj instanceof SparseArray)) {
                                sleepManagementCallback.onFailure(-1, "data parse error");
                                return;
                            }
                            SparseArray sparseArray = (SparseArray) obj;
                            if (sparseArray.size() <= 0) {
                                LogUtil.j(SleepManagementJsUtil.TAG, "map.size() <= 0");
                                sleepManagementCallback.onFailure(-1, "map.size() <= 0");
                            } else {
                                LogUtil.a(SleepManagementJsUtil.TAG, "queryMonthProcessResult success");
                                sleepManagementCallback.onSuccess(uag.c((SparseArray<Object>) sparseArray, j, z));
                            }
                        }

                        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                        public void onResultIntent(int i, Object obj, int i2, int i3) {
                            LogUtil.a(SleepManagementJsUtil.TAG, "queryMonthProcessResult intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2));
                        }
                    }, j, z);
                }
            });
        }
    }

    @H5ProMethod(name = "setSleepTime")
    public static void setSleepTime(String str, SleepManagementCallback<Boolean> sleepManagementCallback) {
        gwd gwdVar;
        if (sleepManagementCallback == null || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "queryMonthProcessResult callback is null");
            return;
        }
        if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.j(TAG, "not support sleep management");
            sleepManagementCallback.onFailure(-1, "not support sleep management");
            return;
        }
        LogUtil.a(TAG, "setSleepTime enter");
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("sleepMinute");
            int iOptInt2 = jSONObject.optInt("sleepHour");
            int iOptInt3 = jSONObject.optInt("minute");
            int iOptInt4 = jSONObject.optInt("hour");
            gwe gweVar = new gwe();
            Set<gwd> alarms = gweVar.getAlarms();
            LogUtil.a(TAG, "alarmInfos: ", Integer.valueOf(alarms.size()));
            Iterator<gwd> it = alarms.iterator();
            do {
                if (!it.hasNext()) {
                    gwdVar = null;
                    break;
                }
                gwdVar = it.next();
            } while (gwdVar.d() != 1000);
            if (gwdVar == null) {
                LogUtil.e(TAG, "setSleepTime curAlarmInfo is null");
                gwdVar = new gwd(1000, iOptInt4, iOptInt3, null);
                gwdVar.e(iOptInt);
                gwdVar.a(iOptInt2);
                alarms.add(gwdVar);
            } else {
                gwdVar.e(iOptInt);
                gwdVar.a(iOptInt2);
                gwdVar.c(iOptInt3);
                gwdVar.d(iOptInt4);
            }
            boolean zSave = gweVar.save(alarms);
            LogUtil.a(TAG, "isRet: ", Boolean.valueOf(zSave));
            if (zSave) {
                setAlarmInfo(gwdVar);
                sleepManagementCallback.onSuccess(true);
            } else {
                sleepManagementCallback.onFailure(-1, "addRet: false");
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, "parse SleepAlarmInfo error:", e.getMessage());
            sleepManagementCallback.onFailure(-1, "parse SleepAlarmInfo error");
        }
    }

    private static void setAlarmInfo(gwd gwdVar) {
        if (gwdVar == null) {
            LogUtil.j(TAG, "setAlarmInfo is null");
            return;
        }
        String json = new Gson().toJson(gwdVar);
        LogUtil.a(TAG, "setAlarmInfo: ", json);
        setSharedPreference(BaseApplication.b(), SP_KEY_ALARM_INFO, json);
    }

    private static void setSharedPreference(Context context, String str, String str2) {
        SharedPreferenceManager.e(context, Integer.toString(10000), str, str2, null);
    }

    @H5ProMethod(name = "showRegularWakeupInputDialog")
    public static void showRegularWakeupInputDialog(final int i, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        Context contextB = BaseApplication.b();
        new SleepTaskDialog.Builder(activityJ).a(uck.d()).e(contextB.getString(R.string.IDS_health_model_wake_up)).a(contextB.getString(R.string.IDS_sleep_complete_this_month, contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i, Integer.valueOf(i)))).b(contextB.getString(R.string.IDS_getup_regularly_no_data_content)).d(contextB.getString(R.string.IDS_hw_health_show_healthdata_input), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                uck.c(activityJ);
                sleepManagementCallback.onSuccess(0);
            }
        }).a(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).c(new View.OnClickListener() { // from class: uaa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(6, i, uck.b());
            }
        }).b(new View.OnClickListener() { // from class: uac
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.c(6, activityJ);
            }
        }).b().show();
    }

    @H5ProMethod(name = "showRegularWorkAndRestInputDialog")
    public static void showRegularWorkAndRestInputDialog(final int i, long j, long j2, boolean z, boolean z2, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        RegularWorkAndRestTimeView regularWorkAndRestTimeView = new RegularWorkAndRestTimeView(activityJ);
        regularWorkAndRestTimeView.setupSleepWakeupTime(j, j2, z, z2);
        Context contextB = BaseApplication.b();
        new SleepTaskDialog.Builder(activityJ).a(uck.e()).e(contextB.getString(R.string.IDS_regular_work_and_rest)).a(contextB.getString(R.string.IDS_sleep_complete_this_month, contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i, Integer.valueOf(i)))).b(contextB.getString(R.string.IDS_regular_work_and_rest_no_data)).d(contextB.getString(R.string.IDS_hw_health_show_healthdata_input), new View.OnClickListener() { // from class: tzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepManagementJsUtil.lambda$showRegularWorkAndRestInputDialog$6(activityJ, sleepManagementCallback, view);
            }
        }).a(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: tzk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).c(regularWorkAndRestTimeView).c(new View.OnClickListener() { // from class: tzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(101, i, uck.c());
            }
        }).b(new View.OnClickListener() { // from class: tzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.c(101, activityJ);
            }
        }).b().show();
    }

    public static /* synthetic */ void lambda$showRegularWorkAndRestInputDialog$6(Activity activity, SleepManagementCallback sleepManagementCallback, View view) {
        uck.c(activity);
        sleepManagementCallback.onSuccess(0);
    }

    @H5ProMethod(name = "showRegularWorkAndRestSuccessDialog")
    public static void showRegularWorkAndRestSuccessDialog(final int i, long j, long j2, final SleepManagementCallback<Integer> sleepManagementCallback) {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        RegularWorkAndRestTimeView regularWorkAndRestTimeView = new RegularWorkAndRestTimeView(activityJ);
        regularWorkAndRestTimeView.setupSleepWakeupTime(j, j2, true, true);
        Context contextB = BaseApplication.b();
        new SleepTaskDialog.Builder(activityJ).a(uck.e()).e(contextB.getString(R.string.IDS_hw_sport_result_congratulations)).a(contextB.getString(R.string.IDS_sleep_complete_this_month, contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i, Integer.valueOf(i)))).e(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: tzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).c(regularWorkAndRestTimeView).c(new View.OnClickListener() { // from class: tzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(101, i, uck.c());
            }
        }).b().show();
    }

    @H5ProMethod(name = "showRegularWorkAndRestFailDialog")
    public static void showRegularWorkAndRestFailDialog(final int i, long j, long j2, boolean z, boolean z2, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        RegularWorkAndRestTimeView regularWorkAndRestTimeView = new RegularWorkAndRestTimeView(activityJ);
        regularWorkAndRestTimeView.setupSleepWakeupTime(j, j2, z, z2);
        Context contextB = BaseApplication.b();
        new SleepTaskDialog.Builder(activityJ).a(uck.e()).e(contextB.getString(R.string.IDS_fitness_comeon)).a(contextB.getString(R.string.IDS_regular_work_and_rest_fail_task, contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i, Integer.valueOf(i)))).e(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: tzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).c(regularWorkAndRestTimeView).c(new View.OnClickListener() { // from class: tzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(101, i, uck.c());
            }
        }).b(new View.OnClickListener() { // from class: tzy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.c(101, activityJ);
            }
        }).b().show();
    }

    @H5ProMethod(name = "showRegularWakeupSuccessDialog")
    public static void showRegularWakeupSuccessDialog(final int i, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        Context contextB = BaseApplication.b();
        new SleepTaskDialog.Builder(activityJ).a(uck.d()).e(contextB.getString(R.string.IDS_hw_sport_result_congratulations)).a(contextB.getString(R.string.IDS_sleep_complete_this_month, contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i, Integer.valueOf(i)))).e(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).c(new View.OnClickListener() { // from class: tzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(6, i, uck.b());
            }
        }).b(new View.OnClickListener() { // from class: tzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.c(6, activityJ);
            }
        }).b().show();
    }

    @H5ProMethod(name = "showRegularWakeupFailDialog")
    public static void showRegularWakeupFailDialog(final int i, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
        } else {
            Context contextB = BaseApplication.b();
            new SleepTaskDialog.Builder(activityJ).a(uck.d()).e(contextB.getString(R.string.IDS_fitness_comeon)).a(contextB.getString(R.string.IDS_getup_regularly_failed_content)).e(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    sleepManagementCallback.onSuccess(0);
                }
            }).c(new View.OnClickListener() { // from class: uae
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ffv.a(6, i, uck.b());
                }
            }).b(new View.OnClickListener() { // from class: uad
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ffv.c(6, activityJ);
                }
            }).b().show();
        }
    }

    @H5ProMethod(name = "showRestrictNapsSuccessDialog")
    public static void showRestrictNapsSuccessDialog(final int i, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        Context contextB = BaseApplication.b();
        new SleepTaskDialog.Builder(activityJ).a(uck.f()).e(contextB.getString(R.string.IDS_hw_sport_result_congratulations)).a(contextB.getString(R.string.IDS_sleep_complete_this_month, contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i, Integer.valueOf(i)))).e(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).c(new View.OnClickListener() { // from class: tze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(100, i, uck.a());
            }
        }).b(new View.OnClickListener() { // from class: tzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.c(100, activityJ);
            }
        }).b().show();
    }

    @H5ProMethod(name = "showRestrictNapsFailDialog")
    public static void showRestrictNapsFailDialog(final int i, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        Context contextB = BaseApplication.b();
        new SleepTaskDialog.Builder(activityJ).a(uck.f()).e(contextB.getString(R.string.IDS_fitness_comeon)).a(contextB.getString(R.string.IDS_restrict_naps_fail_task, UnitUtil.e(30.0d, 1, 0))).e(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).c(new View.OnClickListener() { // from class: tzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(100, i, uck.a());
            }
        }).b(new View.OnClickListener() { // from class: uab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.c(100, activityJ);
            }
        }).b().show();
    }

    @H5ProMethod(name = "showRestrictNapsHasDataDialog")
    public static void showRestrictNapsHasDataDialog(int i, final int i2, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        Context contextB = BaseApplication.b();
        View viewInflate = LayoutInflater.from(activityJ).inflate(R.layout.restrict_naps_custom_view_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.restrict_naps_description_text);
        String strE = UnitUtil.e(30.0d, 1, 0);
        textView.setText(contextB.getResources().getString(R.string.IDS_sleep_limit, strE));
        RestrictNapsProgressBar restrictNapsProgressBar = (RestrictNapsProgressBar) viewInflate.findViewById(R.id.restrict_naps_progress_bar);
        String quantityString = contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i2, Integer.valueOf(i2));
        restrictNapsProgressBar.setProgress((int) ((((double) i) / 30.0d) * 100.0d));
        restrictNapsProgressBar.setTile(contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_plugin_fitnessadvice_min, i, Integer.valueOf(i)));
        new SleepTaskDialog.Builder(activityJ).e(contextB.getString(R.string.IDS_restrict_naps)).a(contextB.getString(R.string.IDS_sleep_complete_this_month, quantityString)).b(contextB.getString(R.string.IDS_restrict_naps_no_data_new, strE, strE)).a(uck.f()).e(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: tzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).c(new View.OnClickListener() { // from class: tzv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(100, i2, uck.a());
            }
        }).c(viewInflate).b(new View.OnClickListener() { // from class: tyx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.c(100, activityJ);
            }
        }).b().show();
    }

    @H5ProMethod(name = "showRestrictNapsNoDataDialog")
    public static void showRestrictNapsNoDataDialog(final int i, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
            return;
        }
        Context contextB = BaseApplication.b();
        View viewInflate = LayoutInflater.from(activityJ).inflate(R.layout.restrict_30_min_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.restrict_naps_description_text);
        String strE = UnitUtil.e(30.0d, 1, 0);
        textView.setText(contextB.getResources().getString(R.string.IDS_sleep_limit, strE));
        new SleepTaskDialog.Builder(activityJ).e(contextB.getString(R.string.IDS_restrict_naps)).a(contextB.getString(R.string.IDS_sleep_complete_this_month, contextB.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_num_day, i, Integer.valueOf(i)))).b(contextB.getString(R.string.IDS_restrict_naps_no_data_new, strE, strE)).a(uck.f()).d(contextB.getString(R.string.IDS_sleep_within_minutes, strE), new View.OnClickListener() { // from class: tzn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sleepManagementCallback.onSuccess(0);
            }
        }).a(contextB.getString(R.string.IDS_sleep_more_than_minutes, strE), new View.OnClickListener() { // from class: tzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sleepManagementCallback.onSuccess(1);
            }
        }).c(new View.OnClickListener() { // from class: tzm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(100, i, uck.a());
            }
        }).c(viewInflate).b(new View.OnClickListener() { // from class: tzt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.c(100, activityJ);
            }
        }).b().show();
    }

    @H5ProMethod(name = "showRestrictNapsExpiredDialog")
    public static void showRestrictNapsExpiredDialog(final int i, final SleepManagementCallback<Integer> sleepManagementCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "top activity is null");
        } else {
            Context contextB = BaseApplication.b();
            new SleepTaskDialog.Builder(activityJ).a(uck.f()).e(contextB.getString(R.string.IDS_fitness_comeon)).a(contextB.getString(R.string.IDS_health_model_wake_up_late)).e(contextB.getString(R.string.IDS_device_know), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    sleepManagementCallback.onSuccess(0);
                }
            }).b(new View.OnClickListener() { // from class: tyy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ffv.c(100, activityJ);
                }
            }).c(new View.OnClickListener() { // from class: tzd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ffv.a(100, i, uck.b());
                }
            }).b().show();
        }
    }
}
