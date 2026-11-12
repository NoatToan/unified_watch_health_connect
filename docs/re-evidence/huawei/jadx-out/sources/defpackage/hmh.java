package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.collection.ArrayMap;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.callback.JudgeCallback;
import com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract;
import com.huawei.health.suggestion.util.ResourceJudgeUtil;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.BelongInfo;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.RecommendationWorkout;
import com.huawei.trade.PayApi;
import com.huawei.trade.TradeViewApi;
import com.huawei.trade.datatype.ProductSummary;
import com.huawei.trade.datatype.TradeViewInfo;
import com.huawei.ui.commonui.webview.WebViewActivity;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hmh implements TrainDetailContract.Ipresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BelongInfo f36906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36908c;
    private int d;
    private CourseApi e;
    private FitWorkout f;
    private ProductSummary g;
    private String h;
    private ProductSummary i;
    private boolean j = false;
    private View k;
    private long l;
    private hmf m;
    private TradeViewApi n;
    private TrainDetailContract.Iview o;
    private VipApi p;

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public boolean isCoursePaid(int i) {
        return i == 1;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public boolean isFreeCourses(int i) {
        return i == 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public boolean isPayCourses(int i) {
        return i == 1;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public boolean isVipCourses(int i) {
        return i == 2;
    }

    public hmh(TrainDetailContract.Iview iview, hmf hmfVar) {
        this.o = iview;
        this.m = hmfVar;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public void initTradeView(FitWorkout fitWorkout) {
        this.f = fitWorkout;
        this.l = System.currentTimeMillis();
        this.f36908c = fitWorkout.acquireAuthResult();
        int iC = c(fitWorkout);
        this.f36907b = iC;
        this.f36906a = fitWorkout.getCourseBelongInfoByType(iC);
        this.d = hkt.b(this.f);
        if (njy.b(fitWorkout.getBelongInfoList())) {
            this.h = fitWorkout.getBelongInfoList().get(0).getName();
        } else {
            this.h = fitWorkout.acquireName();
        }
        ReleaseLogUtil.d("Suggestion_TrainDetailPresenter", "initTradeView priceType= ", Integer.valueOf(this.d), " authResult=", Integer.valueOf(this.f36908c), " belongType=", Integer.valueOf(this.f36907b));
        if (isFreeCourses(this.d)) {
            this.j = false;
            TrainDetailContract.Iview iview = this.o;
            if (iview != null) {
                iview.showDownloadView();
                return;
            }
            return;
        }
        TrainDetailContract.Iview iview2 = this.o;
        if (iview2 != null) {
            iview2.hideDownloadView();
        }
        if (isPayCourses(this.d)) {
            if (isCoursePaid(this.f36908c)) {
                d(true);
                o();
                return;
            } else {
                d(false);
                d();
                e();
                return;
            }
        }
        if (isVipCourses(this.d)) {
            m();
        }
    }

    private void d(boolean z) {
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "changBuyState mView == null");
        } else {
            iview.changBuyState(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "changVipState mView == null");
        } else {
            iview.changeVipState(z);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public void onResume() {
        LogUtil.a("Suggestion_TrainDetailPresenter", "presenter 》onResume 》mIsNeedRefreshTradeState", Boolean.valueOf(this.j));
        if (this.j) {
            judgeVipState();
            m();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public void judgeVipState() {
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "refreshVipStateData VipApi is null");
        } else {
            vipApi.getVipInfo(new VipCallback() { // from class: hmh.1
                @Override // com.huawei.health.vip.api.VipCallback
                public void onSuccess(Object obj) {
                    ReleaseLogUtil.d("Suggestion_TrainDetailPresenter", "getVipInfo success.");
                    if (obj == null) {
                        LogUtil.a("Suggestion_TrainDetailPresenter", "getVipInfo onSuccess result is null");
                        return;
                    }
                    UserMemberInfo userMemberInfo = obj instanceof UserMemberInfo ? (UserMemberInfo) obj : null;
                    if (userMemberInfo != null && userMemberInfo.getMemberFlag() == 1 && !irz.d(userMemberInfo)) {
                        hmh.this.a(true);
                    } else {
                        ReleaseLogUtil.e("Suggestion_TrainDetailPresenter", "TradeViewApi memberInfo == null or != VipConstants.MEMBER_FLAG_VIP");
                        hmh.this.a(false);
                    }
                }

                @Override // com.huawei.health.vip.api.VipCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_TrainDetailPresenter", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public void onDestroy() {
        if (isVipCourses(this.d)) {
            l();
        } else if (isPayCourses(this.d)) {
            o();
        }
        TrainDetailContract.Iview iview = this.o;
        if (iview != null) {
            iview.hideDownloadView();
        }
        this.o = null;
        if (this.e != null) {
            this.e = null;
        }
        if (this.p != null) {
            this.p = null;
        }
        k();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public void initNoticeContent(String str, String str2) {
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "mView == null");
            return;
        }
        WeakReference<Activity> weakReferenceAcquireActivity = iview.acquireActivity();
        if (weakReferenceAcquireActivity == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "initNoticeContent>activity==null");
        } else {
            b(weakReferenceAcquireActivity.get(), str, str2);
        }
    }

    private void b(final Activity activity, final String str, final String str2) {
        if (activity == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "initSpannableString input params is invalid.");
            return;
        }
        String string = activity.getResources().getString(R.string.IDS_fitness_detail_notice, str);
        int length = string.length();
        int iIndexOf = string.indexOf(str);
        if (iIndexOf < 0 || iIndexOf > length) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "noticeTitleStartIndex = ", Integer.valueOf(iIndexOf), "..lenght=", Integer.valueOf(length), "notice = ", string);
            return;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(activity.getResources().getColor(R.color.sug_event_press)), iIndexOf, length, 33);
        spannableString.setSpan(new ClickableSpan() { // from class: hmh.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                hmh.this.d(activity, str2, str);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(activity.getResources().getColor(R.color.sug_event_press));
                textPaint.setUnderlineText(false);
            }
        }, iIndexOf, length, 33);
        this.o.setNoticeContent(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity, String str, String str2) {
        if (activity == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "activity == null");
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str);
        intent.putExtra("WebViewActivity.TITLE", str2);
        iov.d(BaseApplication.getContext(), intent);
        if (this.o == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "mView == null");
            return;
        }
        HashMap map = new HashMap(10);
        map.put("resource_name", this.o.acquireWorkoutName());
        map.put("resource_id", i());
        idy.b(AnalyticsValue.TRADE_DETAIL_VIEW_NOTICE.value(), map);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public void getRecommendationList(List<RecommendationWorkout> list) {
        if (this.e == null) {
            this.e = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        }
        if (this.e == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "CourseApi is null");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "recommendationList is empty");
            return;
        }
        final ArrayMap arrayMap = new ArrayMap(16);
        ArrayList arrayList = new ArrayList(list.size());
        for (RecommendationWorkout recommendationWorkout : list) {
            if (recommendationWorkout != null && !TextUtils.isEmpty(recommendationWorkout.getWorkoutId())) {
                arrayList.add(new gzl.a(recommendationWorkout.getWorkoutId()).c());
                arrayMap.put(recommendationWorkout.getWorkoutId(), recommendationWorkout.getTopicListName());
            }
        }
        this.e.getCourseByIds(arrayList, false, new UiCallback<List<FitWorkout>>() { // from class: hmh.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Suggestion_TrainDetailPresenter", "getCourseByIds onFailure ", str, "errorCode is ", Integer.valueOf(i));
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitWorkout> list2) {
                LogUtil.a("Suggestion_TrainDetailPresenter", "getCourseByIds onSuccess ");
                if (hmh.this.o != null) {
                    hmh.this.o.bindRecommendationData(list2, arrayMap);
                }
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public void onActivityResult(int i, int i2, Intent intent) {
        ReleaseLogUtil.d("Suggestion_TrainDetailPresenter", "requestCode:", Integer.valueOf(i), "resultCode:", Integer.valueOf(i2));
        VipApi vipApi = this.p;
        if (vipApi != null) {
            vipApi.notifyActivityResult(this.k, i, i2, intent);
        }
        TrainDetailContract.Iview iview = this.o;
        if (iview != null) {
            iview.notifyActivityResult(i, i2, intent);
        }
    }

    private void e() {
        this.j = true;
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "addTradeView>mView==null");
            return;
        }
        WeakReference<Activity> weakReferenceAcquireActivity = iview.acquireActivity();
        if (weakReferenceAcquireActivity == null || weakReferenceAcquireActivity.get() == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "addTradeView>activity==null");
            return;
        }
        TradeViewApi tradeViewApi = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
        this.n = tradeViewApi;
        if (tradeViewApi == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "TradeViewApi is null");
            return;
        }
        if (this.k != null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "addTradeView>mTradeView != null");
            this.n.refreshView(this.k);
            return;
        }
        TradeViewInfo tradeViewInfoJ = j();
        View tradeView = this.n.getTradeView(weakReferenceAcquireActivity.get(), tradeViewInfoJ);
        this.k = tradeView;
        if (tradeView != null) {
            ReleaseLogUtil.d("Suggestion_TrainDetailPresenter", "addTradeView.");
            this.o.addTradeView(this.k);
        } else {
            ReleaseLogUtil.e("Suggestion_TrainDetailPresenter", "addTradeView>mTradeView>is_null,mWorkId=", i());
        }
    }

    private TradeViewInfo j() {
        TradeViewInfo tradeViewInfo = new TradeViewInfo(i(), g());
        int i = this.f36907b;
        if (i == 1) {
            tradeViewInfo.setButtonName(BaseApplication.getContext().getString(R.string.IDS_sug_buy_use_plan));
        } else if (i == 0) {
            tradeViewInfo.setButtonName(BaseApplication.getContext().getString(R.string.IDS_sug_series_course_purchase));
        } else {
            LogUtil.a("Suggestion_TrainDetailPresenter", "is single course.");
        }
        if (!TextUtils.isEmpty(this.h)) {
            tradeViewInfo.setTrigResName(this.h);
        }
        if (this.m != null) {
            tradeViewInfo.setBiParams(f());
        }
        return tradeViewInfo;
    }

    private Map<String, String> f() {
        HashMap map = new HashMap(16);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, this.m.l());
        map.put("resourceId", this.m.t());
        map.put("resourceName", this.m.r());
        map.put("pullOrder", this.m.k());
        map.put("buyStage", "2");
        map.put("payResourceType", c());
        return map;
    }

    private String c() {
        if ("1".equals(this.m.j())) {
            return "8";
        }
        return "2";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: hmg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36905b.o();
                }
            });
            return;
        }
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            return;
        }
        View view = this.k;
        if (view == null) {
            iview.showDownloadView();
            return;
        }
        iview.recycleTradeView(view);
        TradeViewApi tradeViewApi = this.n;
        if (tradeViewApi != null) {
            tradeViewApi.cancelView(this.k);
        }
        this.k = null;
        this.j = false;
    }

    private void b() {
        this.j = true;
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", " addVipView mView == null");
            return;
        }
        if (this.k != null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", " addVipView mTradeView != null");
            return;
        }
        WeakReference<Activity> weakReferenceAcquireActivity = iview.acquireActivity();
        if (weakReferenceAcquireActivity == null || weakReferenceAcquireActivity.get() == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "TradeViewApi>addVipView>activity == null");
            return;
        }
        final Activity activity = weakReferenceAcquireActivity.get();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: hmn
            @Override // java.lang.Runnable
            public final void run() {
                this.f36917c.c(activity);
            }
        });
    }

    /* synthetic */ void c(Activity activity) {
        String strAcquireWorkoutName;
        if (this.p == null) {
            this.p = (VipApi) Services.d("vip", VipApi.class);
        }
        if (this.p == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "addVipView >VipApi is null");
            return;
        }
        if (this.o != null) {
            String strC = c();
            if ("1".equals(this.m.j())) {
                strAcquireWorkoutName = this.h;
            } else {
                strAcquireWorkoutName = this.o.acquireWorkoutName();
            }
            this.o.bindProductCourseSummary(this.i, this.g, j());
            View vipPayView = this.p.getVipPayView(activity, "", "#/PayPopup?benefitName=" + strAcquireWorkoutName + "&payResourceType=" + strC, h());
            this.k = vipPayView;
            if (vipPayView != null) {
                ReleaseLogUtil.e("Suggestion_TrainDetailPresenter", "addVipView >  mView.addTradeView");
                this.o.addTradeView(this.k);
            }
        }
    }

    private Map<String, Object> h() {
        HashMap map = new HashMap(5);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, this.m.l());
        map.put("resourceId", this.m.t());
        map.put("resourceName", this.m.r());
        map.put("pullOrder", this.m.k());
        map.put("workout_id", this.m.y());
        map.put("algId", this.m.b());
        return map;
    }

    private void l() {
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            return;
        }
        WeakReference<Activity> weakReferenceAcquireActivity = iview.acquireActivity();
        if (weakReferenceAcquireActivity == null || weakReferenceAcquireActivity.get() == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "TradeViewApi>recycleVipView>activity == null");
            return;
        }
        Activity activity = weakReferenceAcquireActivity.get();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: hml
            @Override // java.lang.Runnable
            public final void run() {
                this.f36915c.a();
            }
        });
    }

    /* synthetic */ void a() {
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "recycleVipView>mView==null");
            return;
        }
        View view = this.k;
        if (view == null) {
            iview.showDownloadView();
            return;
        }
        iview.recycleTradeView(view);
        VipApi vipApi = this.p;
        if (vipApi != null) {
            vipApi.destoryVipPayView(this.k);
        }
        this.j = false;
        this.k = null;
    }

    private void m() {
        if (this.o == null) {
            return;
        }
        ResourceJudgeUtil.c(g(), i(), isVipCourses(this.d) ? 3 : 2, (JudgeCallback<Integer>) new JudgeCallback() { // from class: hmj
            @Override // com.huawei.health.suggestion.callback.JudgeCallback
            public final void onJudgeCallback(Object obj) {
                this.d.b((Integer) obj);
            }
        });
    }

    /* synthetic */ void b(Integer num) {
        if (num.intValue() == 1 && isPayCourses(this.d)) {
            d(true);
        }
        if (num.intValue() == 3) {
            b();
            a(false);
            return;
        }
        if (num.intValue() == 2) {
            if (isVipCourses(this.d)) {
                b();
                a(false);
                return;
            } else {
                e();
                return;
            }
        }
        if (num.intValue() == 1 && isVipCourses(this.d)) {
            a(true);
        }
        n();
    }

    private void n() {
        if (isVipCourses(this.d)) {
            l();
        } else {
            o();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Ipresenter
    public void refreshCourseData() {
        if (this.j && this.o != null) {
            if (this.e == null) {
                this.e = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            }
            CourseApi courseApi = this.e;
            if (courseApi == null) {
                LogUtil.j("Suggestion_TrainDetailPresenter", "TradeViewApi is null");
            } else {
                this.j = false;
                courseApi.getCourseById(new gzl.a(this.m.y()).d(this.m.u()).c(), new hil(this));
            }
        }
    }

    private void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap(10);
        map.put("enter_time", Long.valueOf(this.l));
        map.put("leave_time", Long.valueOf(jCurrentTimeMillis));
        map.put("stay_time", Long.valueOf(jCurrentTimeMillis - this.l));
        map.put("payType", Integer.valueOf(this.d));
        map.put("resourceType", Integer.valueOf(g()));
        FitWorkout fitWorkout = this.f;
        if (fitWorkout != null) {
            map.put("resourceName", fitWorkout.acquireName());
        }
        idy.b(AnalyticsValue.TRADE_DETAIL_DESTROY.value(), map);
    }

    private String i() {
        if (this.o != null) {
            int i = this.f36907b;
            if (i == 1) {
                return this.m.o();
            }
            if (i == 0) {
                if (TextUtils.isEmpty(this.m.aa())) {
                    return this.f36906a.getId();
                }
                return this.m.aa();
            }
            return this.m.y();
        }
        return "";
    }

    private int g() {
        int i = this.f36907b;
        if (i == 1) {
            return CommonUtil.e(this.m.s(), 2);
        }
        return i == 0 ? 10 : 1;
    }

    private int c(FitWorkout fitWorkout) {
        if (TextUtils.isEmpty(this.m.o())) {
            return (TextUtils.isEmpty(this.m.aa()) && fitWorkout.getCourseBelongInfoByType(0) == null) ? -1 : 0;
        }
        return 1;
    }

    private void d() {
        ((PayApi) Services.b("TradeService", PayApi.class)).getProductSummaryInfo(i(), g(), new IBaseResponseCallback() { // from class: hmm
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.b(i, obj);
            }
        });
    }

    /* synthetic */ void b(int i, Object obj) {
        if (i != 0 || !(obj instanceof List)) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "getProductSummaryInfo fail errorCode = ", Integer.valueOf(i));
        } else {
            LogUtil.a("Suggestion_TrainDetailPresenter", "getProductSummaryInfo success");
            e((List) obj);
        }
    }

    private void e(List<ProductSummary> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "productSummaries is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ProductSummary productSummary : list) {
            if (productSummary.isMemberFlag()) {
                arrayList.add(productSummary);
            } else {
                arrayList2.add(productSummary);
            }
        }
        if (njy.e(arrayList2)) {
            LogUtil.j("Suggestion_TrainDetailPresenter", "normalProductSummaries is empty");
            return;
        }
        d(arrayList2);
        ProductSummary productSummary2 = arrayList2.get(0);
        this.i = productSummary2;
        TrainDetailContract.Iview iview = this.o;
        if (iview == null) {
            ReleaseLogUtil.e("Suggestion_TrainDetailPresenter", "dealProductSummaries mView == null");
            return;
        }
        iview.bindProductCourseSummary(productSummary2, this.g, j());
        if (njy.e(arrayList)) {
            LogUtil.a("Suggestion_TrainDetailPresenter", "not have memberPrice");
            return;
        }
        d(arrayList);
        ProductSummary productSummary3 = arrayList.get(0);
        this.g = productSummary3;
        this.o.bindProductCourseSummary(this.i, productSummary3, j());
    }

    private void d(List<ProductSummary> list) {
        Collections.sort(list, new Comparator() { // from class: hmk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((ProductSummary) obj2).getPriority(), ((ProductSummary) obj).getPriority());
            }
        });
    }
}
