package com.huawei.pluginachievement.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.MedalAllShareInfoDesc;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.manager.model.NewMedalTabDataBean;
import com.huawei.pluginachievement.ui.adapter.ShareMedalItemDecoration;
import com.huawei.pluginachievement.ui.adapter.ShareMedalRecyclerAdapter;
import com.huawei.pluginachievement.ui.listenerinterface.MedalFragmentFreshListener;
import com.huawei.pluginachievement.ui.views.MedalHorizontalRecyclerViewAdapter;
import com.huawei.pluginachievement.ui.views.SpeedRecyclerView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.up.model.UserInfomation;
import defpackage.lmf;
import defpackage.njy;
import defpackage.oru;
import defpackage.osb;
import defpackage.otf;
import defpackage.otl;
import defpackage.oun;
import defpackage.ouo;
import defpackage.out;
import defpackage.ozd;
import defpackage.pal;
import defpackage.par;
import defpackage.paw;
import defpackage.pax;
import defpackage.pbh;
import defpackage.pbn;
import defpackage.qpb;
import defpackage.qpn;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveMedalNewActivity extends BaseActivity implements View.OnClickListener, MedalFragmentFreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ShareMedalRecyclerAdapter f22105a;
    private ShareMedalItemDecoration aa;
    private Bitmap ab;
    private SpeedRecyclerView ac;
    private LinearLayout ad;
    private HealthViewPager ae;
    private LinearLayout af;
    private LinearLayout ag;
    private HealthTextView ai;
    private HealthScrollView aj;
    private LinearLayout ak;
    private HealthRecycleView an;
    private Map<String, ArrayList<MedalInfoDesc>> ap;
    private List<String> ar;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f22107c;
    private Map<String, ArrayList<String>> d;
    private pbh g;
    private RelativeLayout h;
    private qpn i;
    private ImageView j;
    private int k;
    private int l;
    private CustomTitleBar m;
    private Context o;
    private HealthTextView q;
    private MedalHorizontalRecyclerViewAdapter r;
    private HiUserInfo t;
    private RelativeLayout u;
    private HealthTextView v;
    private ScrollView w;
    private FrameLayout x;
    private ImageView y;
    private HealthSubTabWidget z;
    private String e = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22106b = "";
    private boolean am = false;
    private Handler n = new e(this);
    private boolean p = false;
    private ArrayList<MedalAllShareInfoDesc> al = new ArrayList<>(5);
    private Map<Integer, Integer> ah = new HashMap(16);
    private List<MedalInfoDesc> s = new ArrayList(5);
    private Boolean f = null;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    static /* synthetic */ int a(AchieveMedalNewActivity achieveMedalNewActivity) {
        int i = achieveMedalNewActivity.l;
        achieveMedalNewActivity.l = i + 1;
        return i;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null && Build.VERSION.SDK_INT == 29 && EnvironmentInfo.f()) {
            bundle.setClassLoader(getClassLoader());
        }
        super.onCreate(bundle);
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "oncreate");
        if (CommonUtil.bg() || SystemInfo.j()) {
            if (isLargerThanEmui910(CommonUtil.p()) || CommonUtil.bc() || SystemInfo.j()) {
                getWindow().getDecorView().setSystemUiVisibility(9216);
                setStatusBarColor();
            }
            getWindow().setNavigationBarColor(getResources().getColor(R.color.hw_achieve_medal_black_background));
        }
        setContentView(R.layout.achieve_medal_new_layout);
        clearBackgroundDrawable();
        cancelAdaptRingRegion();
        this.o = this;
        f();
        b();
        o();
        qpb.d(this.o);
        otf.d();
    }

    private void f() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.medal_titlebar);
        this.m = customTitleBar;
        customTitleBar.setRightButtonVisibility(4);
        this.m.setRightTextButtonVisibility(4);
        this.m.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.sug_ic_share), qre.f(R.string.accessibility_share));
        this.m.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalNewActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ozd.e()) {
                    return;
                }
                AchieveMedalNewActivity.this.x();
            }
        });
        this.m.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalNewActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchieveMedalNewActivity.this.finish();
            }
        });
        this.m.setLeftButtonVisibility(0);
        if (LanguageUtil.ba(this.o)) {
            this.m.setRightButtonDrawable(qqz.e(this.o, R.drawable.sug_ic_share), qre.f(R.string.accessibility_share));
            this.m.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_back_white_reverse), qre.f(R.string.accessibility_go_back));
        } else {
            this.m.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_back_white), qre.f(R.string.accessibility_go_back));
            this.m.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.sug_ic_share), qre.f(R.string.accessibility_share));
        }
        this.m.setTitleTextColor(getResources().getColor(R.color.emui_color_text_primary_dark));
        this.m.setTitleText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_medal_layout));
    }

    private NewMedalFragment e(int i) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        if (i < this.ar.size() && i >= 0) {
            str = this.ar.get(i);
        } else {
            str = "";
        }
        bundle.putString("kind", str);
        NewMedalFragment newMedalFragment = new NewMedalFragment();
        newMedalFragment.setArguments(bundle);
        return newMedalFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (TextUtils.isEmpty(str) || this.ap == null || njy.e(this.ar)) {
            return;
        }
        ArrayList<MedalInfoDesc> arrayList = this.ap.get(this.o.getResources().getString(R.string.IDS_plugin_achievement_tab_have_gained_medals));
        if (arrayList != null && arrayList.size() >= 4) {
            if (Utils.o()) {
                this.m.setRightButtonVisibility(4);
            } else {
                this.m.setRightButtonVisibility(0);
            }
            this.al.clear();
            for (MedalInfoDesc medalInfoDesc : arrayList) {
                this.al.add(new MedalAllShareInfoDesc(medalInfoDesc.acquireMedalId(), medalInfoDesc.acquireText(), medalInfoDesc.acquireMedalTypeLevel()));
            }
            return;
        }
        this.m.setRightButtonVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ArrayList<MedalInfoDesc> arrayList;
        if (this.ap == null || njy.e(this.ar) || (arrayList = this.ap.get(this.o.getResources().getString(R.string.IDS_plugin_achievement_tab_have_gained_medals))) == null || arrayList.size() < 4) {
            return;
        }
        if (!this.am) {
            this.am = true;
            k();
        }
        i();
    }

    public void e(int i, int i2) {
        this.ah.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (i == this.ae.getCurrentItem()) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.height = i2;
            this.ae.setLayoutParams(layoutParams);
        }
    }

    public void d(int i, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.height = i3;
        this.ae.setLayoutParams(layoutParams);
        e(i, i3);
    }

    private void o() {
        this.ar = new ArrayList(5);
        this.d = new HashMap(5);
        this.ap = new HashMap(5);
        h();
    }

    private <T> void e(int i, T t, int i2) {
        if (this.n == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "sendHandlerMessage: handler is null -> " + i);
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.obj = t;
            this.n.sendMessageDelayed(messageObtain, i2);
        }
    }

    private void a(int i) {
        Handler handler = this.n;
        if (handler == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "sendEmptyMessage: handler is null -> " + i);
            return;
        }
        handler.sendEmptyMessage(i);
    }

    private void h() {
        NewMedalTabDataBean newMedalTabDataBeanA = ozd.a();
        if (newMedalTabDataBeanA != null) {
            this.ar = newMedalTabDataBeanA.getTabNewList();
            this.d = newMedalTabDataBeanA.getFirstTabRelationship();
            this.ap = newMedalTabDataBeanA.getSecondTabRelationship();
            this.s = a(newMedalTabDataBeanA.getMedalInfoDesc());
            a(2);
        }
        ozd.b(new AchieveCallback() { // from class: oyc
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public final void onResponse(int i, Object obj) {
                this.f44970a.d(i, obj);
            }
        });
    }

    public /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "getData#getInitData");
        if (obj instanceof NewMedalTabDataBean) {
            NewMedalTabDataBean newMedalTabDataBean = (NewMedalTabDataBean) obj;
            this.ar = newMedalTabDataBean.getTabNewList();
            this.d = newMedalTabDataBean.getFirstTabRelationship();
            this.ap = newMedalTabDataBean.getSecondTabRelationship();
            this.s = a(newMedalTabDataBean.getMedalInfoDesc());
            otl.b(BaseApplication.getContext()).w();
            a(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Map<String, ArrayList<MedalInfoDesc>> map;
        if (njy.e(this.ar) || (map = this.ap) == null || map.size() == 0) {
            this.w.setVisibility(8);
            if (this.l != 1) {
                this.ad.setVisibility(0);
            }
            this.l = 0;
            return;
        }
        this.w.setVisibility(0);
        this.ad.setVisibility(8);
        if (njy.e(this.s)) {
            this.x.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, qrs.d(this.o, 80.0f), 0, 0);
            this.z.setLayoutParams(layoutParams);
        } else {
            this.x.setVisibility(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, qrs.d(this.o, 0.0f), 0, 0);
            this.z.setLayoutParams(layoutParams2);
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "initView ", Integer.valueOf(this.ar.size()));
        e(this.ar.get(0));
        if (this.l == 1) {
            t();
            m();
            int i = 0;
            while (i < this.ar.size()) {
                this.i.b(this.z.b(this.ar.get(i)), e(i), i == 0);
                i++;
            }
        } else {
            this.r.a(this.s, this.ar);
            pbh pbhVar = this.g;
            if (pbhVar != null) {
                pbhVar.c(this.s, this.v, this.q);
            }
            for (int i2 = 0; i2 < this.ar.size(); i2++) {
                Fragment item = this.i.getItem(i2);
                if (item instanceof NewMedalFragment) {
                    ((NewMedalFragment) item).e();
                }
            }
        }
        e(3, Boolean.valueOf(this.l == 1), 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.an == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "shareBitmapPreInit recyclerViewMedalList is null, return!");
        } else {
            l();
            this.an.post(new Runnable() { // from class: oyg
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.j();
                }
            });
        }
    }

    public /* synthetic */ void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: oyk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    public /* synthetic */ void c() {
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "shareBitmapPreInit enter!");
        Bitmap bitmapC = ouo.c(this.ag, this.aj, this.ak, this.k);
        this.ab = bitmapC;
        this.p = true;
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "shareBitmapPreInit finish! mShareBitmap isExists:", Boolean.valueOf(bitmapC != null));
    }

    private void l() {
        LinearLayout linearLayout = this.f22107c;
        if (linearLayout != null) {
            linearLayout.setVisibility((oun.d(1) && osb.d()) ? 0 : 8);
        }
    }

    private List<MedalInfoDesc> a(List<MedalInfoDesc> list) {
        if (list == null) {
            return list;
        }
        int size = list.size();
        this.k = size;
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "getGainMedalLocations mGainMedalNum = ", Integer.valueOf(size));
        return list.size() > 10 ? list.subList(0, 10) : list;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.d("PLGACHIEVE_AchieveMedalNewActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    private void t() {
        this.w.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalNewActivity.1
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                if (i2 <= 0) {
                    AchieveMedalNewActivity.this.m.setBackgroundColor(Color.argb(0, 255, 255, 255));
                } else if (i2 <= 0 || i2 > 100) {
                    AchieveMedalNewActivity.this.m.setBackgroundColor(Color.argb(255, 0, 0, 0));
                } else {
                    AchieveMedalNewActivity.this.m.setBackgroundColor(Color.argb((int) ((i2 / 100.0f) * 255.0f), 0, 0, 0));
                }
            }
        });
        final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.ae.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalNewActivity.4
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (njy.e(AchieveMedalNewActivity.this.ar, i)) {
                    LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "onPageSelected position error:", Integer.valueOf(i));
                    return;
                }
                AchieveMedalNewActivity achieveMedalNewActivity = AchieveMedalNewActivity.this;
                achieveMedalNewActivity.e((String) achieveMedalNewActivity.ar.get(i));
                if (AchieveMedalNewActivity.this.ah.size() > i) {
                    LinearLayout.LayoutParams layoutParams2 = layoutParams;
                    AchieveMedalNewActivity achieveMedalNewActivity2 = AchieveMedalNewActivity.this;
                    layoutParams2.height = achieveMedalNewActivity2.b((Integer) achieveMedalNewActivity2.ah.get(Integer.valueOf(i)));
                } else {
                    layoutParams.height = pbn.g(AchieveMedalNewActivity.this.o);
                    LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "onPageSelected layoutParams.height:", Integer.valueOf(layoutParams.height));
                }
                AchieveMedalNewActivity.this.ae.setLayoutParams(layoutParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public Map<String, ArrayList<String>> d() {
        return this.d;
    }

    public Map<String, ArrayList<MedalInfoDesc>> a() {
        return this.ap;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void a(String str) {
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "changeOneData enter");
        if (TextUtils.isEmpty(str) && this.ap == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "changeOneData medalId =", str);
        for (Map.Entry<String, ArrayList<MedalInfoDesc>> entry : this.ap.entrySet()) {
            String key = entry.getKey();
            ArrayList<MedalInfoDesc> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                MedalInfoDesc medalInfoDesc = value.get(i);
                if (str.equals(medalInfoDesc.acquireMedalId()) && medalInfoDesc.acquireIsNewConfig() > 0) {
                    LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "changeOneData secondTab =", key, " medalId=", str);
                    medalInfoDesc.saveIsNewConfig(0);
                    value.set(i, medalInfoDesc);
                    this.ap.put(key, value);
                    d(key);
                    return;
                }
            }
        }
    }

    private void d(String str) {
        List<String> list;
        for (Map.Entry<String, ArrayList<String>> entry : this.d.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().contains(str) && this.i != null && (list = this.ar) != null) {
                Fragment item = this.i.getItem(list.indexOf(key));
                if (item instanceof NewMedalFragment) {
                    ((NewMedalFragment) item).e();
                }
            }
        }
    }

    @Override // com.huawei.pluginachievement.ui.listenerinterface.MedalFragmentFreshListener
    public void onFragmentFreshListener(String str) {
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "shareAllMedals isSharePreInitFinish :", Boolean.valueOf(this.p));
        if (this.p) {
            if (PermissionUtil.a()) {
                p();
                return;
            } else {
                PermissionUtil.d(this.o, PermissionUtil.PermissionType.STORAGE, new CustomPermissionAction(this.o) { // from class: com.huawei.pluginachievement.ui.AchieveMedalNewActivity.5
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        AchieveMedalNewActivity.this.p();
                    }
                });
                return;
            }
        }
        this.p = true;
    }

    private void i() {
        if (this.an == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "medalAllShareInfoDescs size =", Integer.valueOf(this.al.size()));
        ShareMedalItemDecoration shareMedalItemDecoration = this.aa;
        if (shareMedalItemDecoration != null) {
            this.an.removeItemDecoration(shareMedalItemDecoration);
        }
        ShareMedalItemDecoration shareMedalItemDecoration2 = new ShareMedalItemDecoration(this.o, this.al.size());
        this.aa = shareMedalItemDecoration2;
        int iD = shareMedalItemDecoration2.d();
        this.f22105a = new ShareMedalRecyclerAdapter(this, this.al);
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, iD, 1, false);
        this.an.setIsScroll(false);
        this.an.setLayoutManager(gridLayoutManager);
        this.an.addItemDecoration(this.aa);
        this.an.setHasFixedSize(true);
        this.an.setNestedScrollingEnabled(false);
        this.an.setAdapter(this.f22105a);
    }

    public void b() {
        this.z = (HealthSubTabWidget) findViewById(R.id.achieve_medal_scrollable_tablayout);
        this.ae = (HealthViewPager) findViewById(R.id.my_medeal_viewpager);
        this.i = new qpn(this, this.ae, this.z);
        this.v = (HealthTextView) findViewById(R.id.medal_name);
        if (qrs.ac()) {
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.medal_gain_time_three_fold_fonts);
            this.q = healthTextView;
            healthTextView.setVisibility(0);
        } else {
            this.q = (HealthTextView) findViewById(R.id.medal_gain_time);
        }
        ScrollView scrollView = (ScrollView) findViewById(R.id.medal_new_scrollview);
        this.w = scrollView;
        scrollView.setNestedScrollingEnabled(false);
        this.y = (ImageView) findViewById(R.id.medal_light);
        this.u = (RelativeLayout) findViewById(R.id.medal_show_layout);
        this.af = (LinearLayout) findViewById(R.id.subTabLayout);
        this.ad = (LinearLayout) findViewById(R.id.no_medal_layout);
        this.x = (FrameLayout) findViewById(R.id.medal_show_frame);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pbn.c((Context) this), pbn.d(this));
        layoutParams.gravity = 1;
        this.u.setLayoutParams(layoutParams);
        if (qrs.af(this.o)) {
            q();
        }
        this.f22106b = this.o.getResources().getString(R.string.IDS_plugin_achievement_tab_have_gained_medals);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pbn.c((Context) this), pbn.d(this));
        layoutParams.gravity = 1;
        this.u.setLayoutParams(layoutParams);
        q();
    }

    private void q() {
        LinearLayout linearLayout = this.af;
        if (linearLayout == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "setCenterCardLayout() mViewPager is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        int iC = 0;
        if (qrs.af(this.o)) {
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.o, 0);
            iC = (int) (healthColumnSystem.c() + healthColumnSystem.f() + healthColumnSystem.b());
        }
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = iC;
            layoutParams2.rightMargin = iC;
            this.af.setLayoutParams(layoutParams2);
        }
    }

    private void k() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.all_share_layout);
        if (viewStub == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "initShareLayout ViewStub is loaded fail.");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewStub.inflate();
        this.h = relativeLayout;
        this.j = (ImageView) out.b(relativeLayout, R.id.head_imageview);
        this.ai = (HealthTextView) out.b(this.h, R.id.name_textview);
        this.ag = (LinearLayout) out.b(this.h, R.id.medal_all_ll_one);
        this.aj = (HealthScrollView) out.b(this.h, R.id.medal_all_scrollview);
        this.ak = (LinearLayout) out.b(this.h, R.id.medal_information);
        this.an = (HealthRecycleView) out.b(this.h, R.id.medal_all_rv);
        this.f22107c = (LinearLayout) out.b(this.h, R.id.account_layout);
        if (Utils.o()) {
            this.ak.setVisibility(8);
        }
        ImageView imageView = (ImageView) out.b(this.h, R.id.vip_image);
        if (par.e()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        e();
    }

    private void m() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.speedRecyclerView);
        if (viewStub == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "initRecyclerView ViewStub is loaded fail.");
            return;
        }
        this.ac = (SpeedRecyclerView) viewStub.inflate();
        this.ac.setLayoutManager(new LinearLayoutManager(this, 0, false));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = pbn.h(this);
        layoutParams.addRule(12);
        this.ac.setLayoutParams(layoutParams);
        MedalHorizontalRecyclerViewAdapter medalHorizontalRecyclerViewAdapter = new MedalHorizontalRecyclerViewAdapter(this.o, this.s, this.ar);
        this.r = medalHorizontalRecyclerViewAdapter;
        this.ac.setAdapter(medalHorizontalRecyclerViewAdapter);
        e(this.ac);
        if (this.g == null) {
            this.g = new pbh();
        }
        this.g.a(this.ac, this.y, this.v, this.q, this.s);
    }

    private void e(SpeedRecyclerView speedRecyclerView) {
        if (njy.e(this.s)) {
            return;
        }
        speedRecyclerView.smoothScrollToPosition(0);
        this.v.setText(this.s.get(0).acquireText());
        this.q.setText(pax.r(this.s.get(0).acquireGainTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "enter share");
        if (!osb.c(this.o)) {
            paw.a(this.o);
            return;
        }
        if (oru.a(this).getAdapter() != null) {
            HashMap map = new HashMap(5);
            map.put("name", this.e);
            map.put("className", this.f22106b);
            Bitmap bitmapG = g();
            if (bitmapG != null) {
                int iD = ouo.d(bitmapG);
                LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "initView all medal share bitmap size =", Integer.valueOf(iD));
                if ((iD / 1024) / 1024 >= 1) {
                    osb.e(this.o, ouo.b(this.o, bitmapG, "all_medal_share.jpg"), AnalyticsValue.SUCCESSES_SHARE_1100011.value(), map);
                    LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "shareAll shareImageByPath.");
                } else {
                    osb.c(this.o, bitmapG, AnalyticsValue.SUCCESSES_SHARE_1100011.value(), map);
                }
                this.f = Boolean.valueOf(osb.d());
            } else {
                LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "screenCut is null");
            }
            if (oru.b()) {
                lmf lmfVarD = lmf.d();
                HashMap map2 = new HashMap(5);
                map2.put("type", 11);
                lmfVarD.c(this.o, AnalyticsValue.SUCCESSES_SHARE_1100011.value(), map2, 0);
                return;
            }
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "achieveAdapter is null");
    }

    private Bitmap g() {
        Boolean bool;
        if (this.ab == null || ((bool = this.f) != null && bool.booleanValue() != osb.d())) {
            l();
            LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "cutShareScreen: isShowUserInfo -> " + this.f);
            this.ab = ouo.c(this.ag, this.aj, this.ak, this.k);
        }
        return this.ab;
    }

    public void e() {
        if (Utils.o()) {
            return;
        }
        v();
    }

    private void v() {
        if ("1".equals(SharedPreferenceManager.e(this.o, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN))) {
            LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "accountMigrate: isThirdLogin == 1 and return!");
            w();
        } else {
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new b(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, UserInfomation userInfomation) {
        if (i != 0) {
            a(1);
        } else if (userInfomation == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "get userInfo obtain null objData");
        } else {
            e(0, userInfomation, 0);
        }
    }

    private void w() {
        HiHealthManager.d(this.o).fetchUserData(new a(this));
    }

    static class e extends BaseHandler<AchieveMedalNewActivity> {
        e(AchieveMedalNewActivity achieveMedalNewActivity) {
            super(achieveMedalNewActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchieveMedalNewActivity achieveMedalNewActivity, Message message) {
            int i = message.what;
            if (i == 0) {
                if (message.obj instanceof UserInfomation) {
                    achieveMedalNewActivity.b((UserInfomation) message.obj);
                    return;
                }
                return;
            }
            if (i == 1) {
                LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "MSG_GET_USER_INFO_FAIL");
                return;
            }
            if (i == 2) {
                AchieveMedalNewActivity.a(achieveMedalNewActivity);
                achieveMedalNewActivity.r();
                return;
            }
            if (i == 3) {
                achieveMedalNewActivity.n();
                if (!(message.obj instanceof Boolean) || ((Boolean) message.obj).booleanValue()) {
                    return;
                }
                sendEmptyMessageDelayed(6, 100L);
                return;
            }
            if (i == 4) {
                achieveMedalNewActivity.s();
            } else {
                if (i != 6) {
                    return;
                }
                achieveMedalNewActivity.y();
            }
        }
    }

    static class a implements HiCommonListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<AchieveMedalNewActivity> f22112a;

        a(AchieveMedalNewActivity achieveMedalNewActivity) {
            this.f22112a = new WeakReference<>(achieveMedalNewActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            AchieveMedalNewActivity achieveMedalNewActivity = this.f22112a.get();
            if (achieveMedalNewActivity != null && !achieveMedalNewActivity.isDestroyed()) {
                achieveMedalNewActivity.t = pal.d(obj, achieveMedalNewActivity.t, achieveMedalNewActivity.n, 4);
            } else {
                LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "AchieveMedalNewActivity is destoryed");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "fetchUserData onFailure");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "handleWhenGetUserInfoSuccess()! userInfo is null! ");
            return;
        }
        String name = userInfomation.getName();
        if (TextUtils.isEmpty(name)) {
            this.ai.setText(osb.b());
        } else {
            this.ai.setText(name);
        }
        String picPath = userInfomation.getPicPath();
        if (TextUtils.isEmpty(picPath)) {
            LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "handle WhenGetUserInfoSuccess()! headImgPath is null! ");
            this.j.setImageResource(R.mipmap.ic_personal_head);
            return;
        }
        Bitmap bitmapA = qqf.a(this.o, picPath);
        if (bitmapA != null) {
            this.j.setImageBitmap(bitmapA);
        } else {
            d(userInfomation);
            LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "handleWhenGetUserInfoSuccess() bitmap is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        HiUserInfo hiUserInfo = this.t;
        if (hiUserInfo == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "accountMigrate: setUserNameFromLocal mHiUserInfo == null");
            return;
        }
        this.ai.setText(TextUtils.isEmpty(hiUserInfo.getName()) ? osb.b() : this.t.getName());
        String strC = c(this.t.getHeadImgUrl());
        if (!TextUtils.isEmpty(strC)) {
            Bitmap bitmapA = qqf.a(this.o, strC);
            if (bitmapA != null) {
                this.j.setImageBitmap(bitmapA);
                return;
            }
            return;
        }
        this.j.setImageResource(R.mipmap.ic_personal_head);
        LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "accountMigrate: setUserNameFromLocal() headImgPath is null! ");
    }

    private void d(UserInfomation userInfomation) {
        if (userInfomation.getPortraitUrl() == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "Missing the headImage url!");
        }
    }

    private String c(String str) {
        String str2;
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length > 0) {
            str2 = this.o.getFilesDir() + "/photos/headimage/" + strArrSplit[strArrSplit.length - 1];
        } else {
            str2 = this.o.getFilesDir() + "/photos/headimage/" + str;
        }
        if (new File(str2).exists()) {
            LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "accountMigrate: getHeadImageFromLocal file.exists() yes");
        } else {
            LogUtil.a("PLGACHIEVE_AchieveMedalNewActivity", "accountMigrate: getHeadImageFromLocal file.exists() no");
            File[] fileArrListFiles = new File(this.o.getFilesDir() + "/photos/headimage").listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                try {
                    return fileArrListFiles[fileArrListFiles.length - 1].getCanonicalPath();
                } catch (IOException unused) {
                    LogUtil.e("PLGACHIEVE_AchieveMedalNewActivity", "getHeadImageFromLocal IOException");
                }
            }
        }
        return str2;
    }

    static class b implements BaseResponseCallback<UserInfomation> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<AchieveMedalNewActivity> f22113c;

        b(AchieveMedalNewActivity achieveMedalNewActivity) {
            this.f22113c = new WeakReference<>(achieveMedalNewActivity);
        }

        @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, UserInfomation userInfomation) {
            if (userInfomation == null) {
                LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "refreshUserInfo getUserInfo userInfomation is null");
                return;
            }
            WeakReference<AchieveMedalNewActivity> weakReference = this.f22113c;
            if (weakReference == null) {
                LogUtil.j("PLGACHIEVE_AchieveMedalNewActivity", "refreshUserInfo getUserInfo mReference is null");
                return;
            }
            AchieveMedalNewActivity achieveMedalNewActivity = weakReference.get();
            if (achieveMedalNewActivity != null) {
                achieveMedalNewActivity.d(i, userInfomation);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.n = null;
        }
        Bitmap bitmap = this.ab;
        if (bitmap != null) {
            bitmap.recycle();
            this.ab = null;
        }
        ArrayList<MedalAllShareInfoDesc> arrayList = this.al;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.s = null;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
