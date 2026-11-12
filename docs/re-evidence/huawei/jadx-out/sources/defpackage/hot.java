package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseDetailsActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessTopicActivity;
import com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.WebViewHelp;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private pci f36991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f36993c;
    private Uri d;
    private String e;
    private String i;

    private static boolean a(int i) {
        return i >= 4062 && i <= 4120;
    }

    public hot(Context context, Uri uri, Bundle bundle) {
        this.d = null;
        this.f36992b = context;
        this.f36993c = bundle;
        if (bundle != null) {
            LogUtil.a("Suggestion_FitnessJumpManager", "extra:", bundle.toString());
        }
        if (uri == null || uri.getQuery() == null) {
            return;
        }
        LogUtil.a("Suggestion_FitnessJumpManager", "fitness scheme query = ", uri.getQuery());
        this.d = uri;
        this.i = uri.getQueryParameter("skip_type");
        this.f36991a = e(uri);
        c(uri);
        b(uri);
        d(uri);
    }

    private void b(Uri uri) {
        if ("/router/resourceAggregationPage".equals(uri.getPath()) && "12".equals(this.f36991a.o())) {
            this.i = "all_health";
        }
    }

    private void c(Uri uri) {
        if ("/router/fitnessCourse".equals(uri.getPath()) && "3".equals(this.f36991a.o())) {
            this.i = "all_fitness_run";
            this.f36991a.c(uri.getQueryParameter("categoryId"));
        }
    }

    private void f() {
        if (this.f36992b == null) {
            return;
        }
        Intent intent = new Intent();
        intent.addFlags(335544320);
        if (!TextUtils.isEmpty(this.f36991a.j())) {
            intent.putExtra("fitness", this.f36991a.j());
        }
        intent.setClass(this.f36992b, FitnessResultActivity.class);
        iov.d(this.f36992b, intent);
    }

    public void a() {
        if (this.f36992b == null) {
            return;
        }
        int iD = hcb.a().d();
        if (iD == 2) {
            AppRouter.c("/PluginFitnessAdvice/CoachActivity").b(this.f36992b);
            return;
        }
        if (iD == 5) {
            iov.d(this.f36992b, new Intent(this.f36992b, (Class<?>) LongCoachActivity.class));
            return;
        }
        if (this.f36991a == null) {
            this.f36991a = new pci.c().o("0").g("0").e();
            a("FITNESS_COURSE");
        } else {
            i();
        }
        this.f36992b = null;
    }

    private boolean h() {
        Uri uri;
        Bundle bundle = this.f36993c;
        if (bundle == null) {
            return false;
        }
        if (bundle.get("android.intent.extra.REFERRER") != null && (this.f36993c.get("android.intent.extra.REFERRER") instanceof Uri) && (uri = (Uri) this.f36993c.get("android.intent.extra.REFERRER")) != null) {
            LogUtil.a("Suggestion_FitnessJumpManager", "referrer:", uri.toString());
            return uri.toString().contains("com.huawei.ohos.health.device");
        }
        return this.f36993c.toString().contains("com.huawei.ohos.health.device");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void i() {
        byte b2 = 0;
        if (TextUtils.isEmpty(this.i)) {
            e(false);
            return;
        }
        String str = this.i;
        str.hashCode();
        switch (str.hashCode()) {
            case -797062634:
                if (!str.equals("all_fitness_run")) {
                    b2 = -1;
                }
                break;
            case -251149995:
                if (!str.equals("main_page")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1080327289:
                if (!str.equals("all_course")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1213636282:
                if (!str.equals("all_health")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1484532308:
                if (!str.equals("fitness_result")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 1620088138:
                if (!str.equals("all_fitness")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            a("RUNNING_COURSE");
            return;
        }
        if (b2 == 1) {
            s();
            return;
        }
        if (b2 == 2) {
            a("");
            return;
        }
        if (b2 == 3) {
            b();
            return;
        }
        if (b2 == 4) {
            f();
            return;
        }
        if (b2 != 5) {
            m();
        } else if (SportSupportUtil.b()) {
            a("FITNESS_COURSE");
        } else {
            ReleaseLogUtil.d("Suggestion_FitnessJumpManager", "gotoTargetFitnessPage not fitness open");
            a("RUNNING_COURSE");
        }
    }

    private void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", CommonUtil.e(this.f36991a.l(), 0));
        bundle.putString("SKIP_ALL_COURSE_KEY", str);
        bundle.putString("KEY_SECOND_CATEGORY_INDEX", this.f36991a.f());
        bundle.putString("COURSE_PAGE_TYPE", this.f36991a.o());
        bundle.putBoolean("moveTaskToBack", h());
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(this.f36992b);
        iei.e(idy.b(str), (TextUtils.isEmpty(this.e) || !"fa".equals(this.e)) ? 7 : 9);
    }

    private void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("index", CommonUtil.e(this.f36991a.l(), 0));
        bundle.putString("SKIP_ALL_COURSE_KEY", "HEALTH_COURSE");
        bundle.putString("COURSE_PAGE_TYPE", this.f36991a.o());
        bundle.putString(WebViewHelp.BI_KEY_PULL_FROM, this.f36991a.r());
        bundle.putString("resourceId", this.f36991a.v());
        bundle.putString("resourceName", this.f36991a.w());
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).b(this.f36992b);
    }

    private void e(boolean z) {
        if (this.f36991a.l() == null || this.f36991a.y() == null) {
            LogUtil.j("Suggestion_FitnessJumpManager", "id == null || version == null");
            return;
        }
        String strE = e();
        pcd pcdVar = new pcd(this.f36991a.l());
        pcdVar.e(true);
        pcdVar.q(this.f36991a.y());
        pcdVar.b(this.f36991a.i());
        pcdVar.a(strE);
        pcdVar.t(this.f36991a.x());
        pcdVar.i(this.f36991a.t());
        pcdVar.g(this.f36991a.p());
        pcdVar.e(this.f36991a.q());
        pcdVar.h(this.f36991a.r());
        pcdVar.o(this.f36991a.v());
        pcdVar.m(this.f36991a.w());
        pcdVar.k(this.f36991a.s());
        pcdVar.e(this.f36991a.e());
        pcdVar.f(this.f36991a.w());
        pcdVar.c(this.f36991a.m());
        pcdVar.d(this.f36991a.b());
        pcdVar.g(h());
        if (z) {
            pcdVar.i(1);
            pcdVar.i(true);
        }
        pea.a(BaseApplication.getContext(), pcdVar);
    }

    private void c() {
        boolean zB = iem.b();
        boolean zD = hve.d();
        boolean zB2 = ifz.b();
        LogUtil.a("Suggestion_FitnessJumpManager", "gotoCustomCourse isBlueToothEnable:", Boolean.valueOf(zB), " isConnectWearDevice:", Boolean.valueOf(zD), " isSupportCustomCourse:", Boolean.valueOf(zB2));
        if (zB && zD && zB2) {
            e(true);
        } else {
            JumpUtil.c(this.f36992b, 3);
        }
    }

    private String e() {
        if ("operationPushMsg".equals(this.f36991a.n())) {
            return "11";
        }
        if (a(CommonUtil.j(this.f36991a.r()))) {
            return "6";
        }
        String strI = this.f36991a.i();
        return "1".equals(strI) ? "7" : strI;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    private void s() {
        Intent intent = new Intent();
        intent.setClassName(this.f36992b, "com.huawei.health.MainActivity");
        if (qrs.ah(BaseApplication.getContext())) {
            Context context = this.f36992b;
            if ((context instanceof Activity) && ((Activity) context).getWindowManager().getDefaultDisplay().getRotation() == 1) {
                intent.setFlags(131072);
            } else {
                intent.setFlags(67108864);
            }
        } else {
            intent.setFlags(67108864);
        }
        intent.putExtra(BleConstants.SPORT_TYPE, CommonUtil.b(this.f36992b, this.f36991a.g(), 10001));
        intent.putExtra("isToSportTab", true);
        intent.putExtra("mLaunchSource", 6);
        iov.d(this.f36992b, intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    private void m() {
        String str = this.i;
        str.hashCode();
        switch (str) {
            case "serise_course":
                Intent intent = new Intent(this.f36992b, (Class<?>) FitnessSeriesCourseActivity.class);
                intent.setFlags(268435456);
                iov.d(this.f36992b, intent);
                break;
            case "course":
                l();
                break;
            case "course_details":
                o();
                break;
            case "train_details":
                e(false);
                break;
            case "action_details":
            case "ai_action":
                j();
                break;
            case "coach_sporting":
                ewx.e(this.f36992b, this.f36991a.l(), this.f36991a.u());
                break;
            case "custom_course":
                c();
                break;
            case "short_video":
                ewx.c(this.f36992b, this.d);
                break;
            default:
                n();
                break;
        }
    }

    private void j() {
        Bundle bundle = new Bundle();
        bundle.putString("action_id", this.f36991a.l());
        bundle.putString("action_version", this.f36991a.y());
        bundle.putString(WebViewHelp.BI_KEY_PULL_FROM, this.f36991a.r());
        bundle.putString("resourceId", this.f36991a.v());
        bundle.putString("resourceName", this.f36991a.w());
        bundle.putString("pullOrder", this.f36991a.s());
        bundle.putString("courseAttr", this.f36991a.a());
        AppRouter.c("/PluginFitnessAdvice/FitnessActionDetailActivity").d(bundle).b(this.f36992b);
    }

    private void l() {
        int iE = CommonUtil.e(this.f36991a.l(), 4);
        Intent intent = new Intent(this.f36992b, (Class<?>) FitnessTopicActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("intent_key_topicid", iE);
        iov.d(this.f36992b, intent);
    }

    private void o() {
        if (this.f36991a.l() == null) {
            LogUtil.j("Suggestion_FitnessJumpManager", "id == null");
            return;
        }
        Intent intent = new Intent(this.f36992b, (Class<?>) FitnessSeriesCourseDetailsActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("intent_key_topicid", CommonUtil.j(this.f36991a.l()));
        intent.putExtra("intent_key_topicname", this.f36991a.d());
        intent.putExtra("intent_key_description", this.f36991a.c());
        iov.d(this.f36992b, intent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    private void n() {
        byte b2;
        t();
        String str = this.i;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 1642698313) {
            if (iHashCode != 1798153991) {
                if (iHashCode == 1834428549 && str.equals("goto_plan")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("all_plan")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("introduce_plan")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            g();
            return;
        }
        if (b2 == 1) {
            k();
        } else if (b2 == 2) {
            d();
        } else {
            p();
        }
    }

    private void k() {
        HashMap map = new HashMap();
        map.put("target", Integer.toString(IntPlan.PlanType.NA_PLAN.getType()));
        JumpUtil.a(this.f36992b, map);
    }

    private void g() {
        if (this.f36991a.l() == null) {
            LogUtil.j("Suggestion_FitnessJumpManager", "id == null");
        } else {
            final int iE = CommonUtil.e(this.f36991a.l(), -1);
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: hor
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f36990c.c(iE, i, obj);
                }
            }, "");
        }
    }

    /* synthetic */ void c(int i, int i2, Object obj) {
        if (i2 == 0) {
            JumpUtil.e(i, this.f36991a.t(), this.f36991a.r(), this.f36992b);
        } else {
            LogUtil.a("Suggestion_FitnessJumpManager", "need to login.", Integer.valueOf(i2));
        }
    }

    private void d() {
        if (this.f36991a.l() == null) {
            LogUtil.j("Suggestion_FitnessJumpManager", "id == null");
            return;
        }
        final int iJ = CommonUtil.j(this.f36991a.l());
        if (this.d != null && iJ == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
            ddv.b().putBiEventFromH5Deeplink(this.d.toString(), "com.huawei.health.h5.ai-weight");
        }
        final int iB = CommonUtil.b(this.f36992b, this.f36991a.h(), 0);
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: hpa
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.d(iJ, iB, i, obj);
            }
        }, "");
    }

    /* synthetic */ void d(int i, int i2, int i3, Object obj) {
        if (i3 == 0) {
            JumpUtil.d(i, this.f36991a.t(), i2, this.f36991a.r(), this.f36991a.k(), this.f36992b);
        } else {
            LogUtil.a("Suggestion_FitnessJumpManager", "need to login.", Integer.valueOf(i3));
        }
    }

    private void p() {
        if (this.i.equals("history_plan_report")) {
            b(2);
        } else if (this.i.equals("week_report")) {
            b(1);
        } else {
            LogUtil.e("Suggestion_FitnessJumpManager", "skip type error:", this.i);
        }
    }

    private void b(final int i) {
        if (this.f36991a.l() == null) {
            LogUtil.j("Suggestion_FitnessJumpManager", "id == null");
            return;
        }
        final int iE = CommonUtil.e(this.f36991a.c(), -1);
        final int iE2 = CommonUtil.e(this.f36991a.h(), IntPlan.PlanType.FIT_PLAN.getType());
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: hou
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.e.d(i, iE, iE2, i2, obj);
            }
        }, "");
    }

    /* synthetic */ void d(int i, int i2, int i3, int i4, Object obj) {
        if (i4 == 0) {
            JumpUtil.a(i, this.f36992b, i2, this.f36991a.l(), i3);
        } else {
            LogUtil.a("Suggestion_FitnessJumpManager", "need to login.", Integer.valueOf(i4));
        }
    }

    private pci e(Uri uri) {
        String str;
        String str2 = "Suggestion_FitnessJumpManager";
        try {
            String queryParameter = uri.getQueryParameter("id");
            String queryParameter2 = uri.getQueryParameter("version");
            String queryParameter3 = uri.getQueryParameter("acquire_name");
            String queryParameter4 = uri.getQueryParameter("description");
            String queryParameter5 = uri.getQueryParameter("fitness_type");
            String queryParameter6 = uri.getQueryParameter("planTempId");
            String queryParameter7 = uri.getQueryParameter("planId");
            String queryParameter8 = uri.getQueryParameter("planExecuteTime");
            String queryParameter9 = uri.getQueryParameter("equipments");
            String queryParameter10 = uri.getQueryParameter("train_detail_entrance_type");
            String queryParameter11 = uri.getQueryParameter("workoutPackageId");
            String queryParameter12 = uri.getQueryParameter("resourceType");
            String queryParameter13 = uri.getQueryParameter("displayStyle");
            String queryParameter14 = uri.getQueryParameter("fitnessresult");
            str = "Suggestion_FitnessJumpManager";
            try {
                String queryParameter15 = uri.getQueryParameter("fromPageTitle");
                String queryParameter16 = uri.getQueryParameter("from");
                String queryParameter17 = uri.getQueryParameter("pageTypeId");
                String queryParameter18 = uri.getQueryParameter("courseAttr");
                boolean z = Boolean.parseBoolean(uri.getQueryParameter("isNeedExecuteDown"));
                Map<String, String> mapA = a(uri);
                return new pci.c().o(queryParameter).y(queryParameter2).d(queryParameter3).e(queryParameter4).j(queryParameter5).t(queryParameter6).s(queryParameter7).d(CommonUtils.i(queryParameter8)).g(queryParameter9).h(queryParameter10).w(queryParameter11).v(queryParameter12).f(queryParameter13).i(queryParameter14).r(mapA.get(WebViewHelp.BI_KEY_PULL_FROM)).n(queryParameter15).q(mapA.get("resourceId")).x(mapA.get("resourceName")).p(mapA.get("pullOrder")).c(mapA.get("algId")).m(queryParameter16).k(queryParameter17).l(mapA.get("itemId")).b(mapA.get(x2.AB_INFO)).a(queryParameter18).a(z).e();
            } catch (IllegalArgumentException unused) {
                str2 = str;
                LogUtil.e(str2, "parseFitnessJumpParams IllegalArgumentException");
                return new pci.c().e();
            } catch (UnsupportedOperationException unused2) {
                LogUtil.e(str, "parseFitnessJumpParams UnsupportedOperationException");
                return new pci.c().e();
            }
        } catch (IllegalArgumentException unused3) {
        } catch (UnsupportedOperationException unused4) {
            str = "Suggestion_FitnessJumpManager";
        }
    }

    private void t() {
        hbz.c().e(this.f36991a.r());
        hbz.c().b(this.f36991a.v());
        hbz.c().d(this.f36991a.s());
        hbz.c().c(this.f36991a.w());
    }

    private void d(final Uri uri) {
        Context context = BaseApplication.getContext();
        String queryParameter = uri.getQueryParameter("from");
        this.e = queryParameter;
        LogUtil.a("Suggestion_FitnessJumpManager", "setIntentBi:", queryParameter);
        if (AuthorizationUtils.c(context) && "fa".equals(this.e)) {
            lmf.d().c(LoginInit.getInstance(context).getAccountInfo(1011));
            lmf.d().a(LoginInit.getInstance(context).getAccountInfo(1010));
            OpAnalyticsUtil.getInstance().init(context, new IBaseResponseCallback() { // from class: how
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.a(uri, i, obj);
                }
            });
        }
    }

    /* synthetic */ void a(Uri uri, int i, Object obj) {
        d(uri.getQueryParameter("FAPackageName"));
    }

    private void d(final String str) {
        LogUtil.a("Suggestion_FitnessJumpManager", "doBiFromFaStartApp");
        ThreadPoolManager.c().execute(new Runnable() { // from class: hos
            @Override // java.lang.Runnable
            public final void run() {
                hot.b(str);
            }
        });
    }

    static /* synthetic */ void b(String str) {
        HashMap map = new HashMap(16);
        map.put("from", 1);
        map.put("click", 1);
        if (str != null) {
            map.put("FAPackageName", str);
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
    }

    private Map<String, String> a(Uri uri) {
        Map<String, String> globalParams = Analyzer.getGlobalParams();
        LogUtil.a("Suggestion_FitnessJumpManager", "globalParams:", globalParams.toString());
        HashMap map = new HashMap(7);
        String queryParameter = uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = globalParams.get(WebViewHelp.BI_KEY_PULL_FROM);
        }
        String queryParameter2 = uri.getQueryParameter("pullOrder");
        if (TextUtils.isEmpty(queryParameter2)) {
            queryParameter2 = globalParams.get("pullOrder");
        }
        String queryParameter3 = uri.getQueryParameter("resourceId");
        if (TextUtils.isEmpty(queryParameter3)) {
            queryParameter3 = globalParams.get("resourceId");
        }
        String queryParameter4 = uri.getQueryParameter("resourceName");
        if (TextUtils.isEmpty(queryParameter4)) {
            queryParameter4 = globalParams.get("resourceName");
        }
        String queryParameter5 = uri.getQueryParameter("algId");
        if (TextUtils.isEmpty(queryParameter5)) {
            queryParameter5 = globalParams.get("algId");
        }
        String queryParameter6 = uri.getQueryParameter("itemId");
        if (TextUtils.isEmpty(queryParameter6)) {
            queryParameter6 = globalParams.get("itemId");
        }
        String queryParameter7 = uri.getQueryParameter(x2.AB_INFO);
        if (TextUtils.isEmpty(queryParameter7)) {
            queryParameter7 = globalParams.get(x2.AB_INFO);
        }
        map.put(WebViewHelp.BI_KEY_PULL_FROM, queryParameter);
        map.put("pullOrder", queryParameter2);
        map.put("resourceId", queryParameter3);
        map.put("resourceName", queryParameter4);
        map.put("algId", queryParameter5);
        map.put("itemId", queryParameter6);
        map.put(x2.AB_INFO, queryParameter7);
        return map;
    }

    public static int c(String str) {
        return "weight".equals(str) ? 1 : 0;
    }
}
