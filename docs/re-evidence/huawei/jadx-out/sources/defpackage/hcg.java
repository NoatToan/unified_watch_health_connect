package defpackage;

import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.SuggestionBaseCallback;
import com.huawei.health.suggestion.util.HeartRateGetterUtil;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class hcg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f36410a;
    private static volatile hcg e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IReportDataCallback f36411b = null;
    private List<Integer> d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiSubscribeListener f36412c = new HiSubscribeListener() { // from class: hcg.3
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.b(list)) {
                ReleaseLogUtil.d("Suggestion_PluginSuggestionHelper", "registerReportDataListener success");
                if (hcg.this.d == null) {
                    hcg.this.d = new ArrayList();
                }
                if (list != null) {
                    hcg.this.d.addAll(list);
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (hiHealthData == null) {
                ReleaseLogUtil.e("Suggestion_PluginSuggestionHelper", "onChange reportData HiHealthData is null!");
                return;
            }
            String metaData = hiHealthData.getMetaData();
            LogUtil.d("Suggestion_PluginSuggestionHelper", "onChange:", metaData);
            njw njwVar = (njw) new Gson().fromJson(CommonUtil.ac(metaData), njw.class);
            if (njwVar != null) {
                long jA = LogUtil.a(10000, hcg.f36410a);
                if (jA != -1) {
                    ReleaseLogUtil.d("Suggestion_PluginSuggestionHelper", "report link data:", "hr:", Integer.valueOf(njwVar.j()), "cal:", Integer.valueOf(njwVar.h()), "acal:", Integer.valueOf(njwVar.c()));
                    long unused = hcg.f36410a = jA;
                }
                nsp nspVar = new nsp();
                nspVar.h(njwVar.j());
                nspVar.e(njwVar.h());
                nspVar.c(njwVar.c());
                nspVar.o(njwVar.b());
                nspVar.l(njwVar.o());
                nspVar.m(njwVar.n());
                nspVar.d(njwVar.k());
                nspVar.a(njwVar.a());
                nspVar.b(njwVar.d());
                nspVar.f((int) njwVar.f());
                nspVar.i(njwVar.i());
                nspVar.t((int) njwVar.g());
                nspVar.a(njwVar.l());
                if (hcg.this.f36411b != null) {
                    hcg.this.f36411b.onChange(nspVar);
                    return;
                }
                return;
            }
            ReleaseLogUtil.a("Suggestion_PluginSuggestionHelper", "report link data == null");
        }
    };

    private hcg() {
    }

    public static hcg e() {
        if (e == null) {
            synchronized (PluginSuggestion.class) {
                if (e == null) {
                    e = new hcg();
                }
            }
        }
        return e;
    }

    public boolean d() {
        if (btx.c() == null) {
            LogUtil.e("Suggestion_PluginSuggestionHelper", "isInitComplete error, please call the init function first.");
            return false;
        }
        if (LoginInit.getInstance(btx.c()).isBrowseMode()) {
            LogUtil.j("Suggestion_PluginSuggestionHelper", "browseMode");
            return true;
        }
        if (LoginInit.getInstance(btx.c()).getAccountInfo(1011) != null) {
            return true;
        }
        LogUtil.e("Suggestion_PluginSuggestionHelper", "isInitComplete error, pluginSuggestionAdapter get userid returns null.");
        return false;
    }

    public void c(String str, String str2, final UiCallback<FitWorkout> uiCallback) {
        if (uiCallback == null) {
            LogUtil.j("Suggestion_PluginSuggestionHelper", "callback is null");
            return;
        }
        if (!e().d()) {
            uiCallback.onFailure(-6, ResultUtil.c(-6));
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_PluginSuggestionHelper", "getFitnessDetail : courseApi is null.");
        } else {
            courseApi.getCourseById(str, str2, null, new UiCallback<Workout>() { // from class: hcg.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str3) {
                    uiCallback.onFailure(i, str3);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Workout workout) {
                    uiCallback.onSuccess(pea.d(workout));
                }
            });
        }
    }

    private int e(int i) {
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return -1;
        }
        LogUtil.j("Suggestion_PluginSuggestionHelper", "getPlanTypeByPageType : pageType illegal.");
        return -2;
    }

    public void a(int i, final UiCallback<Map> uiCallback) {
        if (uiCallback == null) {
            LogUtil.j("Suggestion_PluginSuggestionHelper", "callback is null");
            return;
        }
        final int iE = e(i);
        if (iE == -2) {
            LogUtil.e("Suggestion_PluginSuggestionHelper", "getPlanStatistics : planType illegal");
        } else {
            btt.d().c(new Runnable() { // from class: hcg.2
                @Override // java.lang.Runnable
                public void run() {
                    PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                    if (planApi == null) {
                        LogUtil.e("Suggestion_PluginSuggestionHelper", "getPlanStatistics : planApi is null.");
                    } else {
                        planApi.setPlanType(iE);
                        planApi.getPlanStatistics(new UiCallback<PlanStatistics>() { // from class: hcg.2.4
                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            public void onFailure(int i2, String str) {
                                LogUtil.a("Suggestion_PluginSuggestionHelper", "onFailure errorCode = ", Integer.valueOf(i2));
                            }

                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(PlanStatistics planStatistics) {
                                LogUtil.a("Suggestion_PluginSuggestionHelper", "onSuccess");
                                if (planStatistics == null) {
                                    LogUtil.e("Suggestion_PluginSuggestionHelper", "planStatistics null.");
                                    return;
                                }
                                HashMap map = new HashMap();
                                map.put("calorie", Long.valueOf(planStatistics.acquireCalorie()));
                                map.put("duration", Long.valueOf(planStatistics.acquireDuration()));
                                map.put("totalPlan", Integer.valueOf(planStatistics.acquireTotalPlan()));
                                map.put(BleConstants.TOTAL_DISTANCE, Double.valueOf(planStatistics.getTotalDistance()));
                                uiCallback.onSuccess(map);
                            }
                        });
                    }
                }
            });
        }
    }

    public void a(IReportDataCallback iReportDataCallback) {
        b(iReportDataCallback);
    }

    public void c() {
        b();
    }

    public boolean b(IReportDataCallback iReportDataCallback) {
        HiHealthManager.d(BaseApplication.b()).subscribeHiHealthData(17, this.f36412c);
        this.f36411b = iReportDataCallback;
        return true;
    }

    public void b() {
        if (njy.b(this.d)) {
            LogUtil.a("Suggestion_PluginSuggestionHelper", "unRegisterReportDataListener");
            HiHealthManager.d(BaseApplication.b()).unSubscribeHiHealthData(this.d, new HiUnSubscribeListener() { // from class: hch
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    this.d.e(z);
                }
            });
        } else {
            LogUtil.j("Suggestion_PluginSuggestionHelper", "report data listener has unregister.");
        }
    }

    /* synthetic */ void e(boolean z) {
        LogUtil.a("Suggestion_PluginSuggestionHelper", "unregReportDataListener isSuccess = ", Boolean.valueOf(z));
        this.f36411b = null;
    }

    public void d(SuggestionBaseCallback suggestionBaseCallback, boolean z) {
        HeartRateGetterUtil heartRateGetterUtilD = HeartRateGetterUtil.d();
        heartRateGetterUtilD.e(suggestionBaseCallback);
        heartRateGetterUtilD.d(0, z);
    }

    public void a(SuggestionBaseCallback suggestionBaseCallback, boolean z) {
        HeartRateGetterUtil heartRateGetterUtilD = HeartRateGetterUtil.d();
        heartRateGetterUtilD.d(1, z);
        heartRateGetterUtilD.b(suggestionBaseCallback);
    }
}
