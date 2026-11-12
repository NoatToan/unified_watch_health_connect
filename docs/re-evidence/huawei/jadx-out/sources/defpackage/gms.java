package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.FitnessDayPlan;
import com.huawei.basefitnessadvice.model.FitnessPlanCourse;
import com.huawei.basefitnessadvice.model.FitnessWeekPlan;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class gms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f35740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Double> f35741b;
    private ArrayList<FitnessPackageInfo> d;

    static class a {
        static gms e = new gms();
    }

    private gms() {
        this.f35740a = new Handler(Looper.getMainLooper());
        this.f35741b = new ConcurrentHashMap<>(10);
    }

    public static gms a() {
        return a.e;
    }

    public FitnessPackageInfo b(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("PlanInfoManager", "getFitnessPkgInfoById invalid planTempId");
            return null;
        }
        ArrayList<FitnessPackageInfo> arrayList = this.d;
        if (arrayList == null) {
            ReleaseLogUtil.a("PlanInfoManager", "getFitnessPkgInfoById mAllFitnessPackageInfo == null");
            return null;
        }
        for (FitnessPackageInfo fitnessPackageInfo : arrayList) {
            if (fitnessPackageInfo != null && str.equals(fitnessPackageInfo.acquirePlanTempId())) {
                return fitnessPackageInfo;
            }
        }
        return null;
    }

    public List<FitnessPackageInfo> b(int i) {
        if (this.d == null) {
            ReleaseLogUtil.a("PlanInfoManager", "getFitnessPkgInfoById mAllFitnessPackageInfo == null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FitnessPackageInfo fitnessPackageInfo : this.d) {
            if (fitnessPackageInfo != null && fitnessPackageInfo.getPlanType() == i) {
                arrayList.add(fitnessPackageInfo);
            }
        }
        return arrayList;
    }

    public void a(final int i, int i2, final UiCallback<List<FitnessPackageInfo>> uiCallback) {
        LogUtil.a("PlanInfoManager", "get filter FitnessPkg");
        if (uiCallback == null) {
            ReleaseLogUtil.e("PlanInfoManager", "getAllFitnessPkg invalid parameters, callback is null");
            return;
        }
        ArrayList<FitnessPackageInfo> arrayList = this.d;
        if (arrayList == null) {
            if (!TextUtils.isEmpty(buh.e("allFitnessPkgs"))) {
                buh.c("allFitnessPkgs");
            }
            ghw.b().getFitnessPkgInfo(0, 50, i2, new DataCallback() { // from class: gms.2
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i3, String str) throws Throwable {
                    gms.this.b(i3, str, i, uiCallback);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v1 */
                /* JADX WARN: Type inference failed for: r0v8, types: [com.huawei.basefitnessadvice.callback.UiCallback] */
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v5, types: [android.os.Handler] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) throws Throwable {
                    FileInputStream fileInputStream;
                    Object obj = "fis IOException";
                    String str = "PlanInfoManager";
                    if (jSONObject == null) {
                        LogUtil.e("PlanInfoManager", "getFitnessPackageInfo onSuccess data is null.");
                        return;
                    }
                    LogUtil.a("PlanInfoManager", "getFitnessPkgInfo onSuccess");
                    gms gmsVar = null;
                    FileInputStream fileInputStream2 = null;
                    try {
                        try {
                            fileInputStream = new FileInputStream(jSONObject.toString());
                            try {
                                FileUtils.d(fileInputStream, new File(gms.this.d()));
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                    LogUtil.e("PlanInfoManager", "fis IOException");
                                }
                            } catch (IOException unused2) {
                                fileInputStream2 = fileInputStream;
                                LogUtil.e("PlanInfoManager", "getAllFitnessPkg() onSuccess IOException");
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused3) {
                                        LogUtil.e("PlanInfoManager", "fis IOException");
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream != 0) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused4) {
                                        LogUtil.e(str, obj);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = gmsVar;
                        }
                    } catch (IOException unused5) {
                    }
                    ArrayList arrayListA = gms.this.a(jSONObject);
                    gms.this.d = arrayListA;
                    gms gmsVar2 = gms.this;
                    gmsVar2.c((ArrayList<FitnessPackageInfo>) gmsVar2.d);
                    obj = uiCallback;
                    str = gms.this.f35740a;
                    gmsVar = gms.this;
                    obj.onSuccess(str, gmsVar.b(i, (ArrayList<FitnessPackageInfo>) arrayListA));
                }
            });
            return;
        }
        uiCallback.onSuccess(this.f35740a, b(i, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() throws IOException {
        return BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "fitness" + File.separator + "tempCache" + File.separator + "allFitnessPkgs.json";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str, int i2, UiCallback<List<FitnessPackageInfo>> uiCallback) throws Throwable {
        String strQ;
        ReleaseLogUtil.e("PlanInfoManager", "getFitnessPkgInfos errorCode = ", Integer.valueOf(i));
        try {
            strQ = CommonUtil.q(d());
        } catch (IOException unused) {
            ReleaseLogUtil.a("PlanInfoManager", "getAllFitnessPkg local IOException");
            strQ = "";
        }
        ArrayList<FitnessPackageInfo> arrayListA = null;
        if (TextUtils.isEmpty(strQ)) {
            ReleaseLogUtil.a("PlanInfoManager", "getAllFitnessPkg local has no data");
            this.d = null;
            uiCallback.onFailure(this.f35740a, i, str);
        } else {
            try {
                arrayListA = a(new JSONObject(strQ));
                this.d = arrayListA;
                c(arrayListA);
            } catch (JSONException e) {
                LogUtil.e("PlanInfoManager", "getFitnessPkgInfos JSONException = ", LogAnonymous.b(e));
            }
            uiCallback.onSuccess(this.f35740a, b(i2, arrayListA));
        }
    }

    public void c() {
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ArrayList<FitnessPackageInfo> arrayList) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                FitnessPackageInfo fitnessPackageInfo = arrayList.get(i);
                for (int i2 = 0; i2 < fitnessPackageInfo.acquireFitnessWeekPlanList().size(); i2++) {
                    c(fitnessPackageInfo, i2);
                }
            }
        }
    }

    private void c(FitnessPackageInfo fitnessPackageInfo, int i) {
        if (fitnessPackageInfo == null || njy.e(fitnessPackageInfo.acquireFitnessWeekPlanList(), i)) {
            LogUtil.j("PlanInfoManager", "invalid parameters");
            return;
        }
        FitnessWeekPlan fitnessWeekPlan = fitnessPackageInfo.acquireFitnessWeekPlanList().get(i);
        if (fitnessWeekPlan == null || njy.e(fitnessWeekPlan.acquireWeekList())) {
            LogUtil.j("PlanInfoManager", "buildWeekPlan, weekPlan == null");
            return;
        }
        for (FitnessDayPlan fitnessDayPlan : fitnessWeekPlan.acquireWeekList()) {
            if (fitnessDayPlan != null && !njy.e(fitnessDayPlan.acquireDayPlanCourses())) {
                for (FitnessPlanCourse fitnessPlanCourse : fitnessDayPlan.acquireDayPlanCourses()) {
                    if (fitnessPlanCourse != null) {
                        this.f35741b.put(fitnessPlanCourse.acquireCourseId(), Double.valueOf(((fitnessPlanCourse.acquireGender() == 2 && ied.e() == 0) || fitnessPlanCourse.acquireGender() == 0) ? fitnessPlanCourse.acquireWorkoutRealCalMan() : fitnessPlanCourse.acquireWorkoutRealCal()));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<FitnessPackageInfo> b(int i, ArrayList<FitnessPackageInfo> arrayList) {
        UserProfileMgrApi userProfileMgrApi;
        UserInfomation userInfo;
        if (i == -1 && (userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class)) != null && (userInfo = userProfileMgrApi.getUserInfo()) != null) {
            i = userInfo.getGenderOrDefaultValue();
        }
        ArrayList<FitnessPackageInfo> arrayList2 = new ArrayList<>(10);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (FitnessPackageInfo fitnessPackageInfo : arrayList) {
                if (a(i, fitnessPackageInfo)) {
                    arrayList2.add(fitnessPackageInfo);
                }
            }
        }
        return arrayList2;
    }

    private boolean a(int i, FitnessPackageInfo fitnessPackageInfo) {
        if (fitnessPackageInfo == null || fitnessPackageInfo.acquirePlanTempId() == null) {
            ReleaseLogUtil.e("PlanInfoManager", "isFilterPackage fitness plan or plan id is null");
            return false;
        }
        String strTrim = fitnessPackageInfo.acquirePlanTempId().trim();
        if (strTrim.length() < 5) {
            LogUtil.j("PlanInfoManager", "fitness plan id length error ", strTrim);
            return false;
        }
        return gnu.c(strTrim, i);
    }

    public double c(String str) {
        Double d;
        ConcurrentHashMap<String, Double> concurrentHashMap = this.f35741b;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str) || (d = this.f35741b.get(str)) == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public void c(final int i, int i2, final UiCallback<List<PlanInfo>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.j("PlanInfoManager", "callback == null");
        } else if (!gnv.d(BaseApplication.getContext())) {
            LogUtil.a("PlanInfoManager", "recommendation not allowed");
            uiCallback.onSuccess(this.f35740a, new ArrayList(0));
        } else {
            a(i2, -1, new UiCallback<List<FitnessPackageInfo>>() { // from class: gms.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i3, String str) {
                    ReleaseLogUtil.e("PlanInfoManager", "getRecommendedPlans, errorCode = ", Integer.valueOf(i3));
                    uiCallback.onFailure(i3, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitnessPackageInfo> list) {
                    gms.this.e(i, list, uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i, final List<FitnessPackageInfo> list, final UiCallback<List<PlanInfo>> uiCallback) {
        btt.d().c(new Runnable() { // from class: gmp
            @Override // java.lang.Runnable
            public final void run() {
                this.f35735a.a(list, i, uiCallback);
            }
        });
    }

    /* synthetic */ void a(List list, int i, UiCallback uiCallback) {
        List<PlanInfo> arrayList = new ArrayList<>(10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FitnessPackageInfo fitnessPackageInfo = (FitnessPackageInfo) it.next();
            if (i == -1 || c(i, fitnessPackageInfo)) {
                arrayList.add(fitnessPackageInfo);
            }
        }
        LogUtil.a("PlanInfoManager", "doRecommend in size:", Integer.valueOf(arrayList.size()));
        List<String> allLabels = ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).getAllLabels(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        ArrayList arrayList2 = new ArrayList(10);
        if (njy.b((Object) allLabels, String.class)) {
            c(arrayList2, allLabels, arrayList);
        }
        for (PlanInfo planInfo : arrayList) {
            if (!arrayList2.contains(planInfo)) {
                arrayList2.add(planInfo);
            }
        }
        LogUtil.a("PlanInfoManager", "doRecommend out size:", Integer.valueOf(arrayList2.size()));
        uiCallback.onSuccess(this.f35740a, arrayList2);
    }

    private boolean c(int i, FitnessPackageInfo fitnessPackageInfo) {
        int i2 = (fitnessPackageInfo.getPlanType() == IntPlan.PlanType.FIT_PLAN.getType() || fitnessPackageInfo.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) ? 3 : -1;
        if (fitnessPackageInfo.getPlanType() == IntPlan.PlanType.RUN_PLAN.getType() || fitnessPackageInfo.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
            i2 = 0;
        }
        return i2 == i;
    }

    private void c(List<PlanInfo> list, List<String> list2, List<PlanInfo> list3) {
        if (njy.e(list2) || njy.e(list3)) {
            LogUtil.j("PlanInfoManager", "userLabels or plans are empty");
            return;
        }
        for (PlanInfo planInfo : list3) {
            if (planInfo != null) {
                int i = 0;
                for (String str : list2) {
                    List<String> labels = planInfo.getLabels();
                    if (!njy.e(labels) && labels.contains(str)) {
                        i++;
                    }
                }
                if (i > 0) {
                    list.add(planInfo);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<FitnessPackageInfo> a(JSONObject jSONObject) {
        if (jSONObject == null) {
            ReleaseLogUtil.e("PlanInfoManager", "convertFitnessPackageInfo, data == null");
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("fitnessPackageInfoList");
        if (jSONArrayOptJSONArray == null) {
            ReleaseLogUtil.e("PlanInfoManager", "convertFitnessPackageInfo has no key fitnessPackageInfoList");
            return null;
        }
        ArrayList<FitnessPackageInfo> arrayList = new ArrayList<>(10);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            FitnessPackageInfo fitnessPackageInfoC = c(jSONArrayOptJSONArray.optJSONObject(i));
            if (fitnessPackageInfoC != null && !b(fitnessPackageInfoC)) {
                arrayList.add(fitnessPackageInfoC);
            }
        }
        return arrayList;
    }

    private boolean b(FitnessPackageInfo fitnessPackageInfo) {
        return fitnessPackageInfo.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN.getType() && CommonUtil.az();
    }

    private FitnessPackageInfo c(JSONObject jSONObject) {
        return (FitnessPackageInfo) new Gson().fromJson(jSONObject.toString(), FitnessPackageInfo.class);
    }
}
