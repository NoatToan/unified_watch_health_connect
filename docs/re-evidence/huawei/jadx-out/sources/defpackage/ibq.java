package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.request.ActivityIdInfo;
import com.huawei.health.marketing.request.InformationInfo;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.suggestion.R;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes31.dex */
public class ibq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f37450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dynamicDataId")
    @Expose
    private String f37451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ActivityIdInfo f37452c;
    private FitWorkout d;

    @SerializedName("description")
    @Expose
    private String e;

    @SerializedName("themeVisibility")
    @Expose
    private boolean f;

    @SerializedName("descriptionVisibility")
    @Expose
    private boolean g;

    @SerializedName("itemCategory")
    @Expose
    private String h;
    private InformationInfo i;

    @SerializedName("linkValue")
    @Expose
    private String j;

    @SerializedName("theme")
    @Expose
    private String k;

    @SerializedName("priority")
    @Expose
    private int l;
    private int m;

    @SerializedName("picture")
    @Expose
    private String n;
    private View.OnClickListener o;

    public String h() {
        return this.n;
    }

    public String e() {
        return this.f37451b;
    }

    public String a() {
        return this.h;
    }

    public void e(FitWorkout fitWorkout) {
        this.d = fitWorkout;
    }

    public void a(InformationInfo informationInfo) {
        this.i = informationInfo;
    }

    public void d(ActivityIdInfo activityIdInfo) {
        this.f37452c = activityIdInfo;
    }

    public String c() {
        if (!this.g) {
            return null;
        }
        if (this.d != null) {
            float fD = hcu.b().d();
            Context contextB = BaseApplication.b();
            return iec.c(this.d.acquireDifficulty()) + "  " + ifp.d(contextB, R.string.sug_fitness_min, ifp.d(this.d.acquireDuration())) + "  " + ifp.d(contextB, R.string.sug_chart_kcal, ifp.a(ifp.b(this.d.acquireCalorie() * fD)));
        }
        return this.e;
    }

    public String f() {
        if (!this.f) {
            return null;
        }
        FitWorkout fitWorkout = this.d;
        if (fitWorkout != null) {
            return fitWorkout.acquireName();
        }
        return this.k;
    }

    public ftm b() {
        Drawable drawable;
        String string = null;
        if (this.f37452c == null) {
            return null;
        }
        Context contextB = BaseApplication.b();
        String strE = SharedPreferenceManager.e(contextB, Integer.toString(PrebakedEffectId.RT_ICE), "marketingServerCurrentTime" + this.m);
        OperationInteractorsApi operationInteractorsApi = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        if (operationInteractorsApi == null) {
            LogUtil.j("AchieveBannerBean", "operationInteractorsApi = null");
            return null;
        }
        int activityStatus = operationInteractorsApi.getActivityStatus(strE, this.f37452c.getBeginDate(), this.f37452c.getEndDate());
        int i = 0;
        if (activityStatus == 0) {
            string = contextB.getResources().getString(R.string.IDS_activity_social_coming_soon);
            drawable = ContextCompat.getDrawable(contextB, R.drawable.marketing_activity_status);
        } else if (activityStatus == 1) {
            string = contextB.getResources().getString(R.string.IDS_hwh_home_group_underway);
            drawable = ContextCompat.getDrawable(contextB, R.drawable.marketing_activity_status);
        } else if (activityStatus != -1) {
            LogUtil.a("AchieveBannerBean", "setActivityStatusView activity status is empty.");
            i = 8;
            drawable = null;
        } else {
            string = contextB.getResources().getString(R.string.IDS_activity_social_is_over);
            drawable = ContextCompat.getDrawable(contextB, R.drawable.marketing_activity_status_gray);
        }
        return new ftm(string, drawable, i);
    }

    public String i() {
        int numberOfPeople;
        InformationInfo informationInfo = this.i;
        boolean z = informationInfo != null;
        ActivityIdInfo activityIdInfo = this.f37452c;
        boolean z2 = activityIdInfo != null;
        if (z) {
            numberOfPeople = informationInfo.getReadCount();
        } else {
            numberOfPeople = z2 ? activityIdInfo.getNumberOfPeople() : -1;
        }
        if (numberOfPeople < 0) {
            return null;
        }
        Context contextB = BaseApplication.b();
        if (z) {
            return com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_activity_social_people_read, numberOfPeople, Integer.valueOf(numberOfPeople)).replace(String.valueOf(numberOfPeople), UnitUtil.e(numberOfPeople, 1, 0));
        }
        if (z2) {
            return contextB.getResources().getString(R.string.IDS_activity_social_people_attended, UnitUtil.e(numberOfPeople, 1, 0));
        }
        LogUtil.e("AchieveBannerBean", "getPeopleNumberText failed, cause unknown dynamicId = ", this.f37451b);
        return null;
    }

    public void d(int i) {
        this.m = i;
    }

    public View.OnClickListener j() {
        return this.o;
    }

    public void b(final Context context, final String str) {
        if (TextUtils.equals(this.h, SingleDailyMomentContent.COURSE_TYPE)) {
            this.o = new View.OnClickListener() { // from class: ibq.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ibq.this.d == null) {
                        LogUtil.e("AchieveBannerBean", "fitworkout is null");
                        return;
                    }
                    HashMap map = new HashMap(4);
                    map.put("entrance", str);
                    map.put("position", 0);
                    map.put("type", Integer.valueOf(ibq.this.d.getCategory()));
                    map.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, TextUtils.isEmpty(ibq.this.d.acquireId()) ? "" : ibq.this.d.acquireId());
                    idy.b("1130015", map);
                    pcd pcdVar = new pcd(ibq.this.d.acquireId());
                    pcdVar.a(ibq.this.d.acquireName());
                    pea.a(context, ibq.this.d, pcdVar);
                }
            };
            return;
        }
        Activity activity = com.huawei.hwcommonmodel.application.BaseApplication.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity == null) {
            LogUtil.e("AchieveBannerBean", "prepareOnClickListener failed cause baseActivity is null!");
        } else {
            d(baseActivity);
        }
    }

    public Drawable d() {
        return this.f37450a;
    }

    public void g() {
        this.f37450a = qqf.b(BaseApplication.b(), this.n);
    }

    public String toString() {
        return "AchieveBannerBean{mIsVisible=" + this.g + ", mDynamicDataId='" + this.f37451b + "', mItemCategory='" + this.h + "', mPriority=" + this.l + ", mFitWorkout=" + this.d + '}';
    }

    private void d(BaseActivity baseActivity) {
        OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
        if (operationUtilsApi == null) {
            LogUtil.e("AchieveBannerBean", "prepareOnClickListener failed cause operationUtilsApi is null!");
        } else {
            this.o = qji.b(new View.OnClickListener() { // from class: ibq.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.c(500)) {
                        LogUtil.a("AchieveBannerBean", "onClick isFastClick");
                        return;
                    }
                    MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                    if (marketRouterApi != null) {
                        marketRouterApi.router(fxl.d(ibq.this.j, null, ibq.this.m, 1));
                    }
                }
            }, baseActivity, operationUtilsApi.isNotSupportBrowseUrl(this.j), "");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ibq ibqVar = (ibq) obj;
        return this.g == ibqVar.g && this.f == ibqVar.f && this.l == ibqVar.l && Objects.equals(this.e, ibqVar.e) && Objects.equals(this.j, ibqVar.j) && Objects.equals(this.k, ibqVar.k) && Objects.equals(this.f37451b, ibqVar.f37451b) && Objects.equals(this.h, ibqVar.h) && Objects.equals(this.n, ibqVar.n);
    }

    public int hashCode() {
        boolean z = this.g;
        String str = this.e;
        boolean z2 = this.f;
        String str2 = this.j;
        String str3 = this.k;
        String str4 = this.f37451b;
        String str5 = this.h;
        int i = this.l;
        return Objects.hash(Boolean.valueOf(z), str, Boolean.valueOf(z2), str2, str3, str4, str5, Integer.valueOf(i), this.n);
    }
}
