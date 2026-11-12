package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.alipay.sdk.m.s.e;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.HelpCustomerOperate;
import com.huawei.operation.utils.OnlineImUtil;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.UriConstants;
import com.huawei.threecircle.ActiveTipStringUtils;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.exhibitioninfo.activity.ExhibitionInfoActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity;
import com.huawei.ui.main.stories.ihealthlabs.IHealthLabsAcitivity;
import com.huawei.ui.main.stories.me.activity.AppSettingActivity;
import com.huawei.ui.main.stories.me.activity.HealthAboutActivity;
import com.huawei.ui.main.stories.me.activity.PrivacyCenterActivity;
import com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment;
import com.huawei.ui.main.stories.userprofile.activity.PersonalCenterRecyclerViewAdapter;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import com.huawei.up.utils.Constants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.StorageResult;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
public class wst {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f52426c = {"com.tencent.qqpimsecure", "com.qihoo360.mobilesafe", "com.mpoyit.zawcgm", "com.zxly.assist", "com.anguanjia.safe", "com.fractalist.SystemOptimizer", "com.tencent.qlauncher.lite", "com.baoruan.launcher2", "com.hola.launcher", "com.dianxinos.dxhome", "com.nd.android.pandahome2", "com.mili.launcher", "com.tencent.launcher", "com.Dean.launcher", "com.gau.go.launcherex", "com.cleanmaster.mguard_cn", "com.isyezon.kbatterydoctor", "com.mdhlkj.batterysaver", "com.ijinshan.kbatterydoctor"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wre f52427a;
    private wre aa;
    private wre ab;
    private List<wre> ac;
    private wre ad;
    private wre ae;
    private wre af;
    private PersonalCenterUiApi ag;
    private wre ah;
    private PersonalCenterRecyclerViewAdapter ai;
    private wre aj;
    private wre ak;
    private String al;
    private wre am;
    private Activity d;
    private wre e;
    private wre g;
    private wre h;
    private wre k;
    private wre l;
    private wre m;
    private Context n;
    private Handler o;
    private boolean p;
    private wre q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private wre v;
    private wre w;
    private wre x;
    private boolean y;
    private wre z;
    private List<wre> j = new ArrayList(10);
    private String an = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f52428b = "";
    private int i = 0;
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: wst.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                LogUtil.a("PersonalCenterListManager", "onReceive: action = ", action);
                if ("action_app_check_new_version_state".equals(action)) {
                    wst.this.a(intent);
                }
            }
        }
    };
    private VersionMgrApi as = (VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class);

    public wst(PersonalCenterFragment personalCenterFragment, Handler handler) {
        this.n = personalCenterFragment.getContext();
        this.d = personalCenterFragment.getActivity();
        this.ag = personalCenterFragment;
        this.o = handler;
    }

    public void d(PersonalCenterRecyclerViewAdapter personalCenterRecyclerViewAdapter) {
        this.ai = personalCenterRecyclerViewAdapter;
    }

    public wre k() {
        return this.ah;
    }

    public wre c() {
        return this.h;
    }

    public wre f() {
        return this.ab;
    }

    public wre o() {
        return this.aj;
    }

    public wre h() {
        return this.ae;
    }

    public wre j() {
        return this.af;
    }

    public wre i() {
        return this.w;
    }

    public wre a() {
        return this.x;
    }

    public wre n() {
        return this.ak;
    }

    public wre e() {
        return this.q;
    }

    public wre m() {
        return this.am;
    }

    public wre d() {
        return this.k;
    }

    public wre b() {
        return this.e;
    }

    public wre g() {
        return this.ad;
    }

    private void ap() {
        List<wre> list = this.ac;
        if (list == null) {
            this.ac = new ArrayList(16);
        } else {
            list.clear();
        }
        this.s = Utils.o();
        this.r = Utils.h();
        this.t = LoginInit.getInstance(this.n).isBrowseMode();
        this.p = !VersionControlUtil.isSupportOperationAccount();
        this.y = CommonUtil.ca();
    }

    public List<wre> l() {
        LogUtil.a("PersonalCenterListManager", "initOverseaRecyclerList");
        ap();
        this.ac.add(d(0));
        if (this.u && !LoginInit.getInstance(this.n).isBrowseMode()) {
            this.ac.add(d(true));
        }
        this.ac.add(g(true));
        this.ac.add(i(true));
        this.ac.add(j(true));
        this.ac.add(af());
        this.ac.add(b(false));
        return this.ac;
    }

    public List<wre> t() {
        LogUtil.a("PersonalCenterListManager", "initRecyclerList");
        ap();
        this.j.clear();
        boolean zA = lua.a(Integer.toString(10006), "is_me_plan_tab_show", false);
        if (this.r) {
            this.ac.add(ak());
            if (SportSupportUtil.f()) {
                this.ac.add(f(zA));
            }
        }
        if (!this.p && this.r) {
            this.ac.add(aa());
            this.ac.add(ai());
        }
        if (this.r) {
            this.ac.add(d(R.string.IDS_user_divider_data));
            this.ac.add(z());
            this.ac.add(an());
            if (!this.p) {
                this.ac.add(a(!zA));
            }
            if (!this.y && !this.p && (!this.s || OperationUtils.isOperation(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010)))) {
                this.ac.add(ah());
            }
        }
        this.ac.add(am());
        if (CommonUtil.ca() && !EnvironmentInfo.m() && !this.t && !this.s && CommonUtil.bh() && LanguageUtil.l(BaseApplication.getContext())) {
            this.ac.add(ag());
        }
        this.ac.add(g(false));
        this.ac.add(d(R.string.IDS_hw_messagecenter_other));
        al();
        return this.ac;
    }

    private void al() {
        if (!this.p && !this.y && ((!Utils.k() || !CommonUtil.z(this.n)) && irz.j())) {
            this.ac.add(h(true));
        }
        if (aq()) {
            this.ac.add(e(false));
        } else {
            List<wre> list = this.ac;
            wre wreVar = list.get(list.size() - 1);
            if (wreVar.j() == 4) {
                wreVar.d(false);
            }
        }
        if (this.u && !LoginInit.getInstance(this.n).isBrowseMode()) {
            this.ac.add(d(0));
            this.ac.add(d(false));
        }
        this.ac.add(d(0));
        this.ac.add(i(true));
        this.ac.add(j(true));
        if (!this.y && this.r) {
            if (CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) != 1 || LanguageUtil.o(this.n) || LanguageUtil.q(this.n)) {
                this.ac.add(c(true));
            } else {
                this.ac.add(aj());
            }
        }
        if (CommonUtil.ap() && (ar() || !wsp.b())) {
            LogUtil.a("PersonalCenterListManager", "initRecyclerData initBetaSuggestItem");
            this.ac.add(ae());
        }
        this.ac.add(af());
        this.ac.add(b(false));
        this.ac.add(d(0));
        this.ac.add(d(0));
    }

    private boolean ar() {
        if (!CommonUtil.v(this.n) || this.s) {
            return false;
        }
        return LanguageUtil.l(this.n) || LanguageUtil.q(this.n);
    }

    private boolean aq() {
        if (this.p) {
            return false;
        }
        if (this.s) {
            return this.r && (OperationUtils.isOperation(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010)) || ActiveTipStringUtils.c());
        }
        return true;
    }

    private wre ak() {
        wre wreVar = this.ah;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.ah = wreVar2;
        wreVar2.a(2);
        this.ah.d(R.string.IDS_user_profile_achieve_my_reward);
        this.ah.a(qji.b(new View.OnClickListener() { // from class: wst.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    if (wst.this.ah != null && wst.this.ah.n()) {
                        wst.this.ah.c(false);
                        wst.this.ag.cancelBottomRedDotVisible(16);
                        osa.b(wst.this.n, "my_medal_red_point", "no");
                    }
                    wsg.a(wst.this.n, 2);
                    return;
                }
                LogUtil.a("PersonalCenterListManager", "click too fast");
            }
        }, (BaseActivity) this.n, true, AnalyticsValue.HEALTH_MINE_MY_MEDAL_2040012.value()));
        return this.ah;
    }

    private wre d(int i) {
        wre wreVar = new wre();
        wreVar.a(1);
        wreVar.d(i);
        return wreVar;
    }

    private wre aa() {
        wre wreVar = this.h;
        if (wreVar == null) {
            wre wreVar2 = new wre();
            this.h = wreVar2;
            wreVar2.a(6);
            this.h.d(6);
            this.h.a(false);
        } else if (this.p || !this.r) {
            wreVar.a(false);
        }
        return this.h;
    }

    private wre ai() {
        wre wreVar = this.l;
        if (wreVar == null) {
            wre wreVar2 = new wre();
            this.l = wreVar2;
            wreVar2.a(7);
            this.l.d(7);
            this.l.a(true);
        } else if (this.p || !this.r) {
            wreVar.a(false);
        }
        return this.l;
    }

    private wre z() {
        wre wreVar = this.f52427a;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.f52427a = wreVar2;
        wreVar2.a(4);
        this.f52427a.b(R.mipmap.ic_me_school_report);
        this.f52427a.d(R.string.IDS_hwh_me_achieve_report);
        this.f52427a.a(qji.b(new View.OnClickListener() { // from class: wst.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    wsg.a(wst.this.n, 4);
                } else {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                }
            }
        }, (BaseActivity) this.n, true, AnalyticsValue.HEALTH_MINE_MY_REPORT_2040010.value()));
        return this.f52427a;
    }

    private wre an() {
        wre wreVar = this.aa;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.aa = wreVar2;
        wreVar2.a(4);
        this.aa.b(R.mipmap.ic_me_data);
        this.aa.d(R.string.IDS_user_profile_health_show_my_data);
        this.aa.a(qji.b(new View.OnClickListener() { // from class: wst.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                    return;
                }
                wst.this.e(AnalyticsValue.HEALTH_HEALTH_HEALTHSERVICE_HEALTHDATA_2030045.value());
                Intent intent = new Intent();
                intent.setClass(wst.this.n, HealthDatasActivity.class);
                wst.this.n.startActivity(intent);
            }
        }, (BaseActivity) this.n, true, AnalyticsValue.HEALTH_HEALTH_HEALTHSERVICE_HEALTHDATA_2030045.value()));
        return this.aa;
    }

    private wre g(boolean z) {
        wre wreVar = this.aj;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.aj = wreVar2;
        wreVar2.a(4);
        this.aj.b(R.mipmap.ic_me_profile);
        this.aj.d(z);
        this.aj.d(R.string.IDS_startup_set_user_info);
        this.aj.a(qji.b(new View.OnClickListener() { // from class: wst.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                    return;
                }
                HashMap map = new HashMap();
                map.put("click", 1);
                map.put("from", 0);
                lmf.d().c(wst.this.n, AnalyticsValue.REMIND_MY_USER_INFO_EVENT.value(), map, 0);
                if (wst.this.n != null) {
                    AppRouter.c("/HWUserProfileMgr/UserInfoActivity").b(wst.this.n);
                }
            }
        }, (BaseActivity) this.n, true, AnalyticsValue.HEALTH_MINE_MY_INFO_2040007.value()));
        return this.aj;
    }

    private wre am() {
        wre wreVar = this.ab;
        if (wreVar != null) {
            wreVar.a(true ^ this.t);
            return this.ab;
        }
        wre wreVar2 = new wre();
        this.ab = wreVar2;
        wreVar2.a(4);
        this.ab.b(R.drawable.ic_line);
        this.ab.d(true);
        this.ab.d(R.string.IDS_hwh_my_route);
        this.ab.a(new View.OnClickListener() { // from class: wsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        return this.ab;
    }

    /* synthetic */ void b(View view) {
        if (qrs.e(view)) {
            LogUtil.a("PersonalCenterListManager", "click too fast");
            return;
        }
        e(AnalyticsValue.REMIND_MY_ROUTE_EVENT.value());
        Context context = this.n;
        if (context != null) {
            RunningRouteUtils.e(context, "save");
        }
    }

    private wre ag() {
        wre wreVar = this.m;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.m = wreVar2;
        wreVar2.a(4);
        this.m.b(R.drawable.ic_exhibition_report);
        this.m.d(true);
        this.m.d(R.string.IDS_exhibition_info);
        this.m.a(qji.b(new View.OnClickListener() { // from class: wst.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    if (wst.this.n != null) {
                        Intent intent = new Intent();
                        intent.setClass(wst.this.n, ExhibitionInfoActivity.class);
                        wst.this.n.startActivity(intent);
                        return;
                    }
                    return;
                }
                LogUtil.a("PersonalCenterListManager", "click too fast");
            }
        }, (BaseActivity) this.n, true, ""));
        return this.m;
    }

    private wre j(boolean z) {
        wre wreVar = this.ae;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.ae = wreVar2;
        wreVar2.a(4);
        this.ae.b(R.mipmap.ic_me_privacy);
        this.ae.d(z);
        this.ae.d(R.string.IDS_hwh_privacy_center);
        this.ae.a(qji.b(new View.OnClickListener() { // from class: wst.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    if (wst.this.n != null) {
                        Intent intent = new Intent();
                        intent.setClass(wst.this.n, PrivacyCenterActivity.class);
                        wst.this.n.startActivity(intent);
                        return;
                    }
                    return;
                }
                LogUtil.a("PersonalCenterListManager", "click too fast");
            }
        }, (BaseActivity) this.n, true, ""));
        return this.ae;
    }

    private wre ah() {
        wre wreVar = this.v;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.v = wreVar2;
        wreVar2.a(4);
        this.v.b(R.mipmap.ic_me_workout_plans);
        this.v.d(R.string.IDS_activity_social_my_activities);
        this.v.a(qji.b(new View.OnClickListener() { // from class: wst.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    wqz.d(wst.this.n);
                } else {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                }
            }
        }, (BaseActivity) this.n, true, ""));
        return this.v;
    }

    private wre f(boolean z) {
        wre wreVar = this.af;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.af = wreVar2;
        wreVar2.a(8);
        this.af.b(R.mipmap.img_me_plan);
        this.af.d(R.string.sug_home_my_own_plans);
        this.af.a(z);
        this.af.a(qji.b(new View.OnClickListener() { // from class: wst.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    wst.this.ac();
                } else {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                }
            }
        }, (BaseActivity) this.n, true, ""));
        return this.af;
    }

    private wre a(boolean z) {
        wre wreVar = this.ad;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.ad = wreVar2;
        wreVar2.a(4);
        this.ad.b(R.drawable.ic_my_course);
        this.ad.d(true);
        this.ad.c(false);
        if (this.s) {
            this.ad.d(R.string.sug_home_my_own_plans);
        } else {
            this.ad.d(R.string.IDS_title_course_plan);
        }
        this.ad.a(z);
        this.ad.a(qji.b(new View.OnClickListener() { // from class: wst.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FitnessAdviceApi fitnessAdviceApi;
                if (!qrs.e(view)) {
                    if (!wst.this.s) {
                        wst.this.ac();
                        return;
                    }
                    idy.c("1120020");
                    if (wst.this.n == null || (fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class)) == null) {
                        return;
                    }
                    fitnessAdviceApi.launchMyPlanH5();
                    return;
                }
                LogUtil.a("PersonalCenterListManager", "click too fast");
            }
        }, (BaseActivity) this.n, true, ""));
        return this.ad;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        e(AnalyticsValue.HEALTH_MINE_TAB_MY_COURSE_1130052.value());
        if (this.d != null) {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.main.stories.me.activity.MyCourseActivity");
            intent.putExtra("titleName", this.n.getResources().getString(R.string.IDS_FitnessAdvice_previous_course));
            intent.putExtra("courseCategoryKey", 4);
            intent.setFlags(268435456);
            this.d.startActivity(intent);
        }
    }

    private wre h(boolean z) {
        wre wreVar = this.z;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.z = wreVar2;
        wreVar2.a(4);
        this.z.b(R.mipmap.ic_me_orders);
        this.z.d(z);
        this.z.d(R.string.IDS_hwh_home_healthshop_featured_order_management);
        this.z.a(qji.b(new View.OnClickListener() { // from class: wst.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    if (wst.this.s) {
                        LogUtil.a("PersonalCenterListManager", "start orderListActivity oversea.");
                        AppRouter.c("/TradeService/TradeOrderListActivity").a("PAGE_TYPE", 2).b(BaseApplication.getContext());
                    } else if (fua.n()) {
                        Intent intent = new Intent();
                        intent.setClassName(wst.this.n.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
                        String string = IntentParams.builder().addPageId(ArkUIXConstants.ORDER).addPageType("22").addBuildConfigInfo(CommonUtil.a()).build().toString();
                        LogUtil.a("PersonalCenterListManager", "gotoOrderList params: " + string);
                        intent.putExtra(e.n, string);
                        intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 4);
                        iov.c(wst.this.n, intent);
                    } else {
                        Intent intent2 = new Intent();
                        intent2.setClass(wst.this.n, WebViewActivity.class);
                        intent2.putExtra("url", wst.this.w());
                        intent2.putExtra("EXTRA_BI_ID", "");
                        intent2.putExtra("EXTRA_BI_NAME", "");
                        intent2.putExtra("EXTRA_BI_SOURCE", "ShopManager");
                        intent2.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
                        intent2.putExtra("title", wst.this.n.getString(R.string.IDS_hwh_home_healthshop_featured_order_management));
                        wst.this.n.startActivity(intent2);
                    }
                    wst.this.e(AnalyticsValue.HEALTH_SHOP_ENTER_SHOP_MANAGER_2120009.value());
                    return;
                }
                LogUtil.a("PersonalCenterListManager", "click too fast");
            }
        }, (BaseActivity) this.n, true, AnalyticsValue.HEALTH_SHOP_ENTER_SHOP_MANAGER_2120009.value()));
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String w() {
        if (!TextUtils.isEmpty(this.an)) {
            return this.an;
        }
        String string = "";
        try {
            string = OperationUtils.getVmallRules().getString("orderList");
            LogUtil.d("PersonalCenterListManager", "orderUrl: ", string);
        } catch (JSONException unused) {
            LogUtil.j("PersonalCenterListManager", "getShopCenterUrl JSONException.");
        }
        if (TextUtils.isEmpty(string)) {
            string = UriConstants.VMALL_URL_STRING;
        }
        String url = GRSManager.c(this.n).getUrl("healthRecommendUrl");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j("PersonalCenterListManager", "getShopCenterUrl recommendHost is empty");
            url = "https:/";
        }
        LogUtil.d("PersonalCenterListManager", "getShopCenterUrl recommendHost = ", url);
        String str = url + string;
        this.an = str;
        return str;
    }

    private wre e(boolean z) {
        int i;
        wre wreVar = new wre();
        this.w = wreVar;
        wreVar.a(4);
        this.w.b(R.mipmap.ic_me_award);
        this.w.d(z);
        if (CommonUtil.ca()) {
            i = R.string.IDS_my_award_my_award;
        } else {
            i = R.string.IDS_my_assets;
        }
        this.w.d(i);
        this.w.a(qji.b(new View.OnClickListener() { // from class: wst.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    wst.this.ag.openMyAssetPage();
                } else {
                    LogUtil.a("PersonalCenterListManager", "click too fast", "in click my award item");
                }
            }
        }, (BaseActivity) this.n, true, AnalyticsValue.HEALTH_MY_AWARD_ENTER_2190004.value()));
        return this.w;
    }

    private wre d(boolean z) {
        wre wreVar = this.x;
        if (wreVar != null) {
            wreVar.a(true);
            return this.x;
        }
        wre wreVar2 = new wre();
        this.x = wreVar2;
        wreVar2.a(4);
        this.x.b(R.drawable.ic_laboratory);
        this.x.d(z);
        this.x.d(R.string.IDS_ihealth_labs);
        this.x.a(new View.OnClickListener() { // from class: wst.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                    return;
                }
                wst.this.e(AnalyticsValue.HEALTH_MINE_LAB_2040072.value());
                Intent intent = new Intent();
                intent.setClass(wst.this.n, IHealthLabsAcitivity.class);
                wst.this.n.startActivity(intent);
            }
        });
        return this.x;
    }

    private wre i(boolean z) {
        wre wreVar = this.ak;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.ak = wreVar2;
        wreVar2.a(4);
        this.ak.b(R.mipmap.ic_me_setting);
        this.ak.d(z);
        this.ak.d(R.string.IDS_main_btn_state_settings);
        this.ak.a(new View.OnClickListener() { // from class: wst.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                    return;
                }
                wst.this.e(AnalyticsValue.HEALTH_MINE_SETTINGS_2040013.value());
                if (wst.this.n != null) {
                    wst.this.n.startActivity(new Intent(wst.this.n, (Class<?>) AppSettingActivity.class));
                }
            }
        });
        return this.ak;
    }

    private wre c(boolean z) {
        int i;
        wre wreVar = this.q;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.q = wreVar2;
        wreVar2.a(4);
        this.q.b(R.mipmap.ic_me_help);
        this.q.d(z);
        if (OnlineImUtil.isShowOnlineEntry()) {
            i = R.string.IDS_hw_personal_cetenr_help_customer_service;
        } else {
            i = R.string.IDS_hwh_health_vo2max_help;
        }
        this.q.d(i);
        this.q.a(new View.OnClickListener() { // from class: wst.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                    return;
                }
                LogUtil.a("PersonalCenterListManager", "initHelpItem onClick help");
                wst.this.e(AnalyticsValue.HEALTH_MINE_SETTINGS_HELP_2040049.value());
                if (!lli.e().b() && !lli.e().f()) {
                    lli.e().b(false, null);
                }
                if (wst.this.n != null) {
                    wst.this.ao();
                } else {
                    LogUtil.a("PersonalCenterListManager", "initHelpItem onClick context is null!");
                }
            }
        });
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        GRSManager.c(this.n).d("helpCustomerUrl", new GrsQueryCallback() { // from class: wst.6
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    if (wst.this.o != null) {
                        wst.this.al = str;
                        wst.this.o.post(new Runnable() { // from class: wst.6.4
                            @Override // java.lang.Runnable
                            public void run() {
                                wst.this.at();
                            }
                        });
                        return;
                    } else {
                        LogUtil.j("PersonalCenterListManager", "mHandler is null");
                        return;
                    }
                }
                LogUtil.j("PersonalCenterListManager", "obtainTipsUrlDomain urlDomain is empty");
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("PersonalCenterListManager", "obtainTipsUrlDomain onCallBackFail");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        String str;
        LogUtil.a("PersonalCenterListManager", "startWebViewActivity()");
        boolean zIsShowOnlineEntry = OnlineImUtil.isShowOnlineEntry();
        Intent intent = new Intent(this.n, (Class<?>) WebViewActivity.class);
        String helpCustomerUrl = HelpCustomerOperate.getHelpCustomerUrl(this.al, "#/help?cid=11069");
        if (LoginInit.getInstance(this.n).getIsLogined() && lws.c(this.n).d()) {
            str = helpCustomerUrl + "&isDevice=3";
        } else {
            str = helpCustomerUrl + "&isDevice=2";
        }
        intent.putExtra("url", str);
        intent.putExtra("title", this.n.getString(zIsShowOnlineEntry ? R.string.IDS_hw_personal_cetenr_help_customer_service : R.string.IDS_hwh_health_vo2max_help));
        this.n.startActivity(intent);
        b(this.q, false);
        this.ag.cancelBottomRedDotVisible(32);
        osa.b(this.n, "my_help_red_point", "no");
    }

    private wre aj() {
        wre wreVar = this.am;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.am = wreVar2;
        wreVar2.a(4);
        this.am.a(false);
        this.am.b(R.drawable.ic_me_suggest);
        this.am.d(R.string.IDS_user_profile_questions_suggestions);
        this.am.a(qji.b(new View.OnClickListener() { // from class: wst.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view)) {
                    wst.this.av();
                } else {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                }
            }
        }, (BaseActivity) this.n, true, AnalyticsValue.HEALTH_MINE_QA_2040026.value()));
        return this.am;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        lra.d().a();
        LogUtil.a("PersonalCenterListManager", "transfer enter");
        e(AnalyticsValue.HEALTH_MINE_QA_2040026.value());
        if (!Utils.f() || CommonUtil.bq()) {
            LogUtil.j("PersonalCenterListManager", "not support suggest");
            return;
        }
        c(this.n.getApplicationContext());
        int iA = lli.e().a(this.d, true);
        if (iA == 0) {
            LogUtil.a("PersonalCenterListManager", "Questions and Suggestions enter successful");
        } else {
            LogUtil.a("PersonalCenterListManager", "Questions and Suggestions errorCode : ", Integer.valueOf(iA));
        }
    }

    private wre ae() {
        wre wreVar = this.g;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.g = wreVar2;
        wreVar2.a(4);
        this.g.b(R.mipmap.ic_me_suggest_beta);
        this.g.d(R.string.IDS_user_profile_questions_suggestions_bata);
        if (this.n instanceof BaseActivity) {
            this.g.a(qji.b(new View.OnClickListener() { // from class: wst.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (!qrs.e(view)) {
                        wst.this.y();
                        LogUtil.a("PersonalCenterListManager", "beta suggestions");
                        wst.this.e(AnalyticsValue.HEALTH_MINE_QA_2040026.value());
                        wst.this.p();
                        return;
                    }
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                }
            }, (BaseActivity) this.n, true, AnalyticsValue.HEALTH_MINE_QA_2040026.value()));
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wst.12
            @Override // java.lang.Runnable
            public void run() {
                ktn.c().d(wst.this.n, -1, "");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        c(this.n.getApplicationContext());
        aw();
        ab();
    }

    public void c(Context context) {
        LogUtil.a("PersonalCenterListManager", "getThreeAppInfos");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.j("PersonalCenterListManager", "PackageManager is null");
            return;
        }
        int i = 0;
        while (true) {
            String[] strArr = f52426c;
            if (i >= strArr.length) {
                return;
            }
            try {
                packageManager.getApplicationInfo(strArr[i], 0);
                lra.d().e("third_app", strArr[i]);
                LogUtil.a("PersonalCenterListManager", "package : ", strArr[i]);
            } catch (PackageManager.NameNotFoundException e) {
                LogUtil.e("PersonalCenterListManager", "writeThirdAppInfos fail ", e.getMessage());
            }
            i++;
        }
    }

    private void aw() {
        ltr.b().setProductType(10);
    }

    private void ab() {
        String str;
        LogUtil.a("PersonalCenterListManager", "enter goBetaFeedBack");
        HealthFeedbackParams healthFeedbackParams = new HealthFeedbackParams();
        d(healthFeedbackParams);
        healthFeedbackParams.setProductName(qre.b(this.n).getString(R.string.IDS_hw_app_name));
        LogUtil.a("PersonalCenterListManager", "goBetaFeedBack productName = ", healthFeedbackParams.getProductName());
        try {
            str = this.n.getPackageManager().getPackageInfo(this.n.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e("PersonalCenterListManager", "goBetaFeedBack exception:", e.getMessage());
            str = "1.0.0";
        }
        healthFeedbackParams.setProductVersion(str);
        healthFeedbackParams.setProductType(10);
        e(this.n, healthFeedbackParams, new wrf(this.o));
        LogUtil.a("PersonalCenterListManager", "goBetaFeedBack ok.");
    }

    private void e(Context context, HealthFeedbackParams healthFeedbackParams, wrf wrfVar) {
        int i;
        ltp ltpVar = new ltp();
        ltpVar.d(context.getPackageName());
        ltpVar.e(String.valueOf(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)));
        ltpVar.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        ltpVar.j("at");
        String strK = CommonUtil.k(BaseApplication.getContext());
        if (TextUtils.isEmpty(strK)) {
            strK = "000000000000000";
        }
        ltpVar.a(strK);
        try {
            String deviceType = SharedPreferenceUtil.getInstance(context).getDeviceType();
            i = deviceType != null ? Integer.parseInt(deviceType) : 0;
        } catch (NumberFormatException e) {
            LogUtil.e("PersonalCenterListManager", "exception:", LogAnonymous.b(e));
        }
        ltpVar.e(Integer.valueOf(i));
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1000);
        if (TextUtils.isEmpty(accountInfo)) {
            accountInfo = b(context);
        }
        ltpVar.h(accountInfo);
        ltpVar.c(Agent.OS_NAME);
        ltpVar.b(Integer.valueOf(Constants.HEALTH_APP_LOGIN_CHANNEL));
        ltr ltrVarB = ltr.b();
        if (ltrVarB != null) {
            ltrVarB.gotoFeedback(context, ltpVar, healthFeedbackParams, wrfVar);
        }
    }

    private String b(Context context) {
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        LoginInit.getInstance(context).getAccountInfo(1001, new StorageDataCallback() { // from class: wst.13
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public void onProcessed(StorageResult storageResult) {
                if (storageResult.b() == 0) {
                    arrayList.add(String.valueOf(storageResult.c()));
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PersonalCenterListManager", "getAccountName InterruptedException");
        }
        if (arrayList.isEmpty()) {
            LogUtil.j("PersonalCenterListManager", "getAccountName is null");
            return "";
        }
        return (String) arrayList.get(0);
    }

    private String b(String str, boolean z) {
        if (str == null) {
            return str;
        }
        if (z) {
            String strE = SecurityUtils.e(str);
            return strE.length() >= 24 ? strE.replace(Marker.ANY_NON_NULL_MARKER, "A").replace("/", "A").replace("=", "A").substring(0, 24) : strE;
        }
        if (str.contains(":") || str.length() <= 24) {
            return str.replace(":", "");
        }
        String strE2 = SecurityUtils.e(str);
        return strE2.length() >= 24 ? strE2.replace(Marker.ANY_NON_NULL_MARKER, "A").replace("/", "A").replace("=", "A").substring(0, 24) : strE2;
    }

    private void d(HealthFeedbackParams healthFeedbackParams) {
        if (dxx.d().h().size() <= 0 || !CommonUtil.ck()) {
            String strD = CommonUtil.d(BaseApplication.getContext(), false);
            healthFeedbackParams.setDeviceId(TextUtils.isEmpty(strD) ? "000000000000000" : strD);
            healthFeedbackParams.setDeviceSn("NA");
            healthFeedbackParams.setDeviceModel("Wear");
            return;
        }
        LogUtil.a("PersonalCenterListManager", "has wear device");
        DeviceInfo deviceInfoU = u();
        if (deviceInfoU == null) {
            healthFeedbackParams.setDeviceId("000000000000000");
            healthFeedbackParams.setDeviceSn("NA");
            healthFeedbackParams.setDeviceModel("Wear");
            return;
        }
        String deviceIdentify = deviceInfoU.getDeviceIdentify();
        String deviceModel = deviceInfoU.getDeviceModel();
        String udidFromDevice = deviceInfoU.getUdidFromDevice();
        String securityUuid = deviceInfoU.getSecurityUuid();
        LogUtil.d("PersonalCenterListManager", "identify: ", BTDeviceMgrUtil.c().e(securityUuid));
        String strReplace = securityUuid != null ? securityUuid.replace(":", "") : "NA";
        if (TextUtils.isEmpty(udidFromDevice)) {
            if (deviceInfoU.getProductType() >= 34) {
                if (!deviceIdentify.equals(strReplace)) {
                    udidFromDevice = nio.c(strReplace + deviceIdentify);
                } else {
                    udidFromDevice = nio.c(strReplace);
                }
            } else {
                udidFromDevice = b(securityUuid, false);
            }
        }
        healthFeedbackParams.setDeviceId(TextUtils.isEmpty(udidFromDevice) ? "000000000000000" : udidFromDevice);
        healthFeedbackParams.setDeviceSn(strReplace);
        healthFeedbackParams.setDeviceModel(deviceModel);
    }

    private DeviceInfo u() {
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "PersonalCenterListManager")) {
            if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
                LogUtil.a("PersonalCenterListManager", "getActiveConnectedDevice main deviceName = ", deviceInfo.getDeviceName(), ", connectState = ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                return deviceInfo;
            }
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, "PersonalCenterListManager");
        Collections.sort(deviceList, new Comparator<DeviceInfo>() { // from class: wst.15
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(DeviceInfo deviceInfo2, DeviceInfo deviceInfo3) {
                return deviceInfo2.getLastConnectedTime() >= deviceInfo3.getLastConnectedTime() ? 1 : -1;
            }
        });
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (deviceInfo2 != null && deviceInfo2.getDeviceConnectState() == 2) {
                LogUtil.a("PersonalCenterListManager", "getActiveConnectedDevice followed deviceName = ", deviceInfo2.getDeviceName(), ", connectState = ", Integer.valueOf(deviceInfo2.getDeviceConnectState()));
                return deviceInfo2;
            }
        }
        return null;
    }

    private wre af() {
        wre wreVar = this.k;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.k = wreVar2;
        wreVar2.a(4);
        this.k.b(R.mipmap.ic_refresh);
        this.k.d(R.string.IDS_hw_show_setting_detection_updates);
        if (this.y || !nvb.a()) {
            LogUtil.a("PersonalCenterListManager", "is GP or Store version or update switch is close");
            this.k.a(false);
        } else {
            this.k.a(true);
        }
        this.k.a(new View.OnClickListener() { // from class: wst.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                wst.this.e(AnalyticsValue.HEALTH_MINE_SETTINGS_CHECK_UPDATE_2040020.value());
                LogUtil.d("PersonalCenterListManager", "onItemClick(): id = LIST_ITEM_APP_UPDATE");
                if (wst.this.k != null) {
                    wst.this.k.b(true);
                    wst.this.ai.d(wst.this.k);
                }
                wst.this.v();
            }
        });
        return this.k;
    }

    private wre b(boolean z) {
        wre wreVar = this.e;
        if (wreVar != null) {
            return wreVar;
        }
        wre wreVar2 = new wre();
        this.e = wreVar2;
        wreVar2.a(4);
        this.e.b(R.mipmap.ic_me_about);
        this.e.d(z);
        this.e.d(R.string.IDS_settings_about);
        this.e.a(new View.OnClickListener() { // from class: wst.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("PersonalCenterListManager", "click too fast");
                    return;
                }
                wst.this.e(AnalyticsValue.HEALTH_MINE_ABOUT_2040023.value());
                if (wst.this.n != null) {
                    wst.this.n.startActivity(new Intent(wst.this.n, (Class<?>) HealthAboutActivity.class));
                }
            }
        });
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        s();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f, intentFilter, LocalBroadcast.f36595c, null);
        LogUtil.d("PersonalCenterListManager", " enterUpdateActivity():");
    }

    private void s() {
        LogUtil.a("PersonalCenterListManager", "doCheckAppNewVersion");
        if (!CommonUtil.ap()) {
            this.as.doManualCheckAppNewVersion();
            return;
        }
        if (LoginInit.getInstance(this.n).isBrowseMode()) {
            ad();
            LoginInit.getInstance(this.n).browsingToLogin(new IBaseResponseCallback() { // from class: wst.20
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.j("PersonalCenterListManager", "LoginInit.browsingToLogin is logging");
                }
            }, "");
        } else {
            if (Utils.o()) {
                ad();
                Context context = this.n;
                qpx.e(context, context.getString(R.string.wallet_unenable_country));
                return;
            }
            this.as.doManualCheckAppNewVersion();
        }
    }

    private void ad() {
        wre wreVar = this.k;
        if (wreVar != null) {
            wreVar.b(false);
            this.ai.d(this.k);
        }
    }

    public void e(String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(this.n, str, map, 0);
    }

    private void ax() {
        LogUtil.a("PersonalCenterListManager", "unregisterCheckNewAppBroadcast enter");
        try {
            if (this.f != null) {
                BaseApplication.getContext().unregisterReceiver(this.f);
            }
        } catch (IllegalArgumentException e) {
            LogUtil.e("PersonalCenterListManager", "unregister Exception ", LogAnonymous.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        if (CommonUtil.ap()) {
            c(intent);
        }
        int intExtra = intent.getIntExtra("state", -1);
        int intExtra2 = intent.getIntExtra("result", -1);
        String strE = e(intent);
        boolean booleanExtra = intent.getBooleanExtra("isForced", false);
        LogUtil.a("PersonalCenterListManager", "updateAppState: state = ", Integer.valueOf(intExtra), ", result = ", Integer.valueOf(intExtra2));
        switch (intExtra) {
            case 10:
                LogUtil.a("PersonalCenterListManager", "STATE_CHECK_NEW_VERSION_START");
                break;
            case 11:
                b(intExtra2);
                break;
            case 12:
                if (this.n == null) {
                    LogUtil.a("PersonalCenterListManager", "mContext is null, return.");
                } else {
                    a(intExtra2, strE);
                }
                break;
            case 13:
                LogUtil.a("PersonalCenterListManager", "updateAppState,STATE_MANUAL_BEFORE_AUTO");
                wre wreVar = this.k;
                if (wreVar != null && wreVar.k()) {
                    this.k.b(false);
                    this.ai.d(this.k);
                    break;
                }
                break;
            default:
                switch (intExtra) {
                    case 30:
                        LogUtil.a("PersonalCenterListManager", "STATE_FETCH_CHANGELOG_START");
                        break;
                    case 31:
                        x();
                        break;
                    case 32:
                        b(booleanExtra, strE);
                        break;
                }
                break;
        }
    }

    private void a(int i, String str) {
        this.f52428b = str;
        this.i = i;
        LogUtil.a("PersonalCenterListManager", "mAppNewVersion is:" + this.f52428b);
        LogUtil.a("PersonalCenterListManager", "appNewVersionNumSize is:", Integer.valueOf(this.i));
        LogUtil.a("PersonalCenterListManager", " is:" + CommonUtil.e(this.n));
    }

    private String e(Intent intent) {
        String stringExtra = intent.getStringExtra("content");
        return stringExtra == null ? "" : stringExtra;
    }

    private void c(Intent intent) {
        wre wreVar = this.k;
        if (wreVar != null) {
            if (!wreVar.k()) {
                return;
            }
            this.k.b(false);
            this.ai.d(this.k);
        } else {
            LogUtil.j("PersonalCenterListManager", "updateAppState mCheckUpdateListBean == null");
        }
        if (!com.huawei.haf.application.BaseApplication.h()) {
            LogUtil.j("PersonalCenterListManager", "STATE_FETCH_CHANGELOG_SUCCESS: CommonUtil.isRunningForeground is false");
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("hasNewBetaVersion", false);
        int intExtra = intent.getIntExtra("responseCode", 0);
        if (booleanExtra) {
            Intent intent2 = new Intent();
            intent2.putExtra("hasNewBetaVersion", true);
            intent2.putExtra("isManual", intent.getBooleanExtra("isManual", false));
            this.as.showNewVersionDialog(this.n, intent2);
            return;
        }
        if (intExtra == -5) {
            Context context = this.n;
            qpx.e(context, context.getString(R.string.IDS_member_center_not_exit));
            return;
        }
        if (intExtra == -4) {
            Context context2 = this.n;
            qpx.e(context2, context2.getString(R.string.IDS_member_center_version_incorrect));
            return;
        }
        if (intExtra == 200) {
            Context context3 = this.n;
            qpx.e(context3, context3.getString(R.string.IDS_hwh_me_settings_app_update));
            as();
        } else if (intExtra == 300 || intExtra == 400) {
            Context context4 = this.n;
            qpx.e(context4, context4.getString(R.string.IDS_update_network_error));
        } else {
            Context context5 = this.n;
            qpx.e(context5, context5.getString(R.string.IDS_update_unknown_error));
        }
    }

    private void b(int i) {
        String string;
        LogUtil.a("PersonalCenterListManager", "STATE_CHECK_NEW_VERSION_FAILED");
        if (this.n == null) {
            LogUtil.e("PersonalCenterListManager", "mContext is null");
            return;
        }
        wre wreVar = this.k;
        if (wreVar != null) {
            if (!wreVar.k()) {
                return;
            }
            this.k.b(false);
            this.ai.d(this.k);
        } else {
            LogUtil.a("PersonalCenterListManager", "updateAppState mCheckUpdateListBean==null");
        }
        ax();
        if (i == 0) {
            LogUtil.a("PersonalCenterListManager", "No New Version");
            Context context = this.n;
            qpx.e(context, context.getString(R.string.IDS_hwh_me_settings_app_update));
            as();
            return;
        }
        if (i == 1 || i == 3) {
            qpx.e(this.n, this.n.getResources().getString(R.string.IDS_update_network_error));
        } else {
            if (i == 2) {
                string = this.n.getResources().getString(R.string.IDS_update_server_error);
            } else {
                string = this.n.getResources().getString(R.string.IDS_update_unknown_error);
            }
            qpx.e(this.n, string);
        }
    }

    private void b(boolean z, String str) {
        LogUtil.a("PersonalCenterListManager", "STATE_FETCH_CHANGELOG_SUCCESS:");
        wre wreVar = this.k;
        if (wreVar != null) {
            wreVar.b(false);
            this.ai.d(this.k);
        }
        if (!com.huawei.haf.application.BaseApplication.h()) {
            LogUtil.j("PersonalCenterListManager", "STATE_FETCH_CHANGELOG_SUCCESS: CommonUtil.isRunningForeground is false");
            return;
        }
        if (CommonUtil.af(this.n) && this.f52428b.contains("Beta")) {
            LogUtil.a("PersonalCenterListManager", "The current version is release and new version is beta");
            Context context = this.n;
            qpx.e(context, context.getString(R.string.IDS_hwh_me_settings_app_update));
            return;
        }
        if (CommonUtil.ap() && !this.f52428b.contains("Beta")) {
            LogUtil.a("PersonalCenterListManager", "The current version is beta and new version is release");
            Context context2 = this.n;
            qpx.e(context2, context2.getString(R.string.IDS_hwh_me_settings_app_update));
            as();
            return;
        }
        if (!CommonUtil.bg() || nvd.j()) {
            Intent intent = new Intent();
            intent.putExtra("UpdateMode", 2);
            intent.putExtra("appNewVersionNumSize", this.i);
            intent.putExtra("mAppNewVersion", this.f52428b);
            intent.putExtra("isForced", z);
            intent.putExtra("mAppNewFeatureContent", str);
            this.as.showNewVersionDialog(this.n, intent);
        }
        ax();
    }

    private void x() {
        LogUtil.a("PersonalCenterListManager", "STATE_FETCH_CHANGELOG_FAILED");
        wre wreVar = this.k;
        if (wreVar != null) {
            wreVar.b(false);
            this.ai.d(this.k);
        }
        Intent intent = new Intent();
        intent.putExtra("mChangeLog", ParamConstants.CallbackMethod.ON_FAIL);
        ax();
        this.as.showNewVersionDialog(this.n, intent);
    }

    private void as() {
        nvd.g(String.valueOf(CommonUtil.e(this.n)), this.n);
        if (CommonUtil.ap()) {
            nvd.i("", this.n);
        }
        au();
    }

    private void au() {
        boolean z;
        if (this.k != null) {
            boolean zHaveNewAppVersion = this.as.haveNewAppVersion(this.n);
            LogUtil.a("PersonalCenterListManager", "showAppUpdateNew: haveNewAppVersion = ", Boolean.valueOf(zHaveNewAppVersion));
            if (zHaveNewAppVersion) {
                this.ag.setBottomRedDotVisibility(512);
                z = true;
            } else {
                this.ag.cancelBottomRedDotVisible(512);
                z = false;
            }
            b(this.k, z);
        }
    }

    public void b(wre wreVar, boolean z) {
        if (wreVar == null || wreVar.n() == z) {
            return;
        }
        wreVar.c(z);
        this.ai.d(wreVar);
    }

    public void e(wre wreVar, Object obj) {
        if (wreVar != null) {
            wreVar.a(obj);
            this.ai.d(wreVar);
        }
    }

    public void r() {
        if (njy.e(this.ac)) {
            LogUtil.j("PersonalCenterListManager", "setRecyclerViewItemBackground mPersonalCenterListBeans is empty");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (wre wreVar : this.ac) {
            if (wreVar.i()) {
                arrayList.add(wreVar);
            }
        }
        int i = 0;
        while (i < arrayList.size()) {
            wre wreVar2 = (wre) arrayList.get(i);
            wre wreVar3 = null;
            wre wreVar4 = i > 0 ? (wre) arrayList.get(i - 1) : null;
            if (i < arrayList.size() - 1) {
                wreVar3 = (wre) arrayList.get(i + 1);
            }
            e(wreVar2, wreVar4, wreVar3);
            i++;
        }
    }

    private void e(wre wreVar, wre wreVar2, wre wreVar3) {
        if ((wreVar2 == null && wreVar3 == null) || ((wreVar2 == null && wreVar3.j() == 1) || (wreVar3 == null && wreVar2.j() == 1))) {
            wreVar.e(R.drawable.list_item_background_single_normal);
            return;
        }
        if (wreVar2 == null) {
            wreVar.e(R.drawable.list_item_background_top_normal);
            return;
        }
        if (wreVar3 == null) {
            wreVar.e(R.drawable.list_item_background_bottom_normal);
            return;
        }
        if (wreVar2.j() == 1 && wreVar3.j() == 1) {
            wreVar.e(R.drawable.list_item_background_single_normal);
            return;
        }
        if (wreVar2.j() == 1 && wreVar3.j() != 1) {
            wreVar.e(R.drawable.list_item_background_top_normal);
        } else if (wreVar2.j() != 1 && wreVar3.j() == 1) {
            wreVar.e(R.drawable.list_item_background_bottom_normal);
        } else {
            wreVar.e(R.color.emui_card_panel_bg);
        }
    }

    public void q() {
        ax();
    }
}
