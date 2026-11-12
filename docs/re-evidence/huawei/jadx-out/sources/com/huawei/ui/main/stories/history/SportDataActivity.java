package com.huawei.ui.main.stories.history;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.healthcloud.plugintrack.ui.view.DetailItemContainer;
import com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem;
import com.huawei.hms.common.data.DataHolder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.linechart.common.ClassType;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DataLayerType;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthNativeViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.common.IChartLayerHolderProvider;
import com.huawei.ui.main.stories.fitness.util.chart.TrackModuleBarChartHolder;
import com.huawei.ui.main.stories.fitness.views.base.chart.AllClassfiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedButtonList;
import com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList;
import com.huawei.ui.main.stories.fitness.views.base.chart.MonthBarClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.WeekBarClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.YearBarClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.UserEvent;
import com.huawei.ui.main.stories.history.SportDataActivity;
import com.huawei.ui.main.stories.history.view.SportArrayAdapter;
import com.huawei.up.model.UserInfomation;
import defpackage.gxt;
import defpackage.irz;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.lsv;
import defpackage.qnj;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import defpackage.vpp;
import defpackage.vrg;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SportDataActivity extends BaseActivity implements IChartLayerHolderProvider<TrackModuleBarChartHolder> {
    private static lmf d = lmf.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f28239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TrackModuleBarChartHolder f28240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClassifiedButtonList f28241c;
    private HealthCalendar e;
    private Context f;
    private ClassifiedViewList g;
    private ObserveredClassifiedView h;
    private CustomTitleBar i;
    private int j;
    private List<ClassifiedViewList.ClassifiedView> l;
    private View p;
    private Resources q;
    private HealthTextView s;
    private ArrayList<Integer> t;
    private int u;
    private HealthNativeViewPager v;
    private String y;
    private SportDataInteractor m = new SportDataInteractor(this);
    private boolean o = false;
    private int r = 4;
    private int k = 4;
    private boolean n = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("Track_SportDataActivity", "onCreate");
        super.onCreate(bundle);
        clearBackgroundDrawable();
        setContentView(R.layout.layout_sport_data);
        this.f = this;
        SportDetailItem.d(true);
        if (UnitUtil.f()) {
            this.y = getString(R.string.IDS_band_data_sport_distance_unit_en);
        } else {
            this.y = getString(R.string.IDS_band_data_sport_distance_unit);
        }
        int i = i();
        this.u = i;
        this.m.b(i);
        this.m.c((Activity) this);
        m();
        TrackModuleBarChartHolder trackModuleBarChartHolder = new TrackModuleBarChartHolder(getApplicationContext());
        this.f28240b = trackModuleBarChartHolder;
        d(trackModuleBarChartHolder);
        l();
        g();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        if (this.m != null) {
            int i = i();
            this.u = i;
            this.m.b(i);
            this.m.c((Activity) this);
        }
        b();
    }

    private void b() {
        if (qrs.t()) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f).inflate(R.layout.layout_sport_data, (ViewGroup) null).findViewById(R.id.track_sport_data);
            qrs.a(getBaseContext(), true, true, (LinearLayout) linearLayout.findViewById(R.id.track_detail_show_distance), (DetailItemContainer) linearLayout.findViewById(R.id.sport_data_container));
        }
    }

    private void d(TrackModuleBarChartHolder trackModuleBarChartHolder) {
        c(trackModuleBarChartHolder);
        a(trackModuleBarChartHolder);
    }

    public static /* synthetic */ boolean a(DataInfos dataInfos) {
        return dataInfos != null && dataInfos.isChiefDistance();
    }

    private void c(TrackModuleBarChartHolder trackModuleBarChartHolder) {
        trackModuleBarChartHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: vpa
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public final boolean isAccept(DataInfos dataInfos) {
                return SportDataActivity.a(dataInfos);
            }
        }, this.y);
        trackModuleBarChartHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: vpc
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public final boolean isAccept(DataInfos dataInfos) {
                return SportDataActivity.c(dataInfos);
            }
        }, BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, 1));
        trackModuleBarChartHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: vpb
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public final boolean isAccept(DataInfos dataInfos) {
                return SportDataActivity.b(dataInfos);
            }
        }, getString(R.string.IDS_motiontrack_detail_fm_heart_min));
    }

    public static /* synthetic */ boolean c(DataInfos dataInfos) {
        return dataInfos != null && dataInfos.isChiefCount();
    }

    public static /* synthetic */ boolean b(DataInfos dataInfos) {
        return (dataInfos == null || dataInfos.isChiefDistance() || dataInfos.isChiefCount()) ? false : true;
    }

    private void a(TrackModuleBarChartHolder trackModuleBarChartHolder) {
        trackModuleBarChartHolder.c(DataLayerType.DURATION, BaseApplication.getContext().getColor(R.color.chart_duration_color), BaseApplication.getContext().getColor(R.color.track_duration_color), getString(R.string.IDS_motiontrack_detail_fm_heart_min));
        trackModuleBarChartHolder.c(DataLayerType.TIMES, BaseApplication.getContext().getColor(R.color.chart_times_color), BaseApplication.getContext().getColor(R.color.track_times_color), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, 2, ""));
        trackModuleBarChartHolder.c(DataLayerType.CALORIES, BaseApplication.getContext().getColor(R.color.chart_calories_color), BaseApplication.getContext().getColor(R.color.track_calories_color), getString(R.string.IDS_motiontrack_show_kcal));
    }

    private int i() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra(DataHolder.TYPE_INT, 0);
        }
        return 0;
    }

    private void m() {
        LogUtil.a("Track_SportDataActivity", "requestWeekData");
        this.m.a(lsl.e(System.currentTimeMillis(), 2, 0), lsl.b(System.currentTimeMillis(), 2, 0), 4);
    }

    private void l() {
        f();
        LogUtil.a("Track_SportDataActivity", "initView");
        this.f28241c = (ClassifiedButtonList) findViewById(R.id.classified_button_list);
        HealthNativeViewPager healthNativeViewPager = (HealthNativeViewPager) findViewById(R.id.classified_view_place);
        this.v = healthNativeViewPager;
        cancelLayoutById(healthNativeViewPager);
        this.g = new ClassifiedViewList(this, this.f28241c, this.v);
        c(this.u);
        this.p = findViewById(R.id.sport_data_ll);
        this.f28239a = (ImageView) findViewById(R.id.sport_data_detail_viewpager);
        this.s = (HealthTextView) findViewById(R.id.track_detail_map_sport_formal_time);
        this.q = getResources();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.u == 0) {
            findViewById(R.id.sport_stat_view).setBackgroundColor(ContextCompat.getColor(this.f, R.color.colorSubBackground));
            findViewById(R.id.all_sport_data).setVisibility(0);
            findViewById(R.id.track_sport_data).setVisibility(8);
        } else {
            findViewById(R.id.sport_stat_view).setBackgroundColor(ContextCompat.getColor(this.f, R.color.colorBackground));
            findViewById(R.id.all_sport_data).setVisibility(8);
            findViewById(R.id.track_sport_data).setVisibility(0);
        }
    }

    private void g() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.track_share_detail_title_usrname);
        String picPath = userInfo != null ? userInfo.getPicPath() : null;
        String shareNickName = ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).getShareNickName();
        healthTextView.setText(shareNickName);
        ImageView imageView = (ImageView) findViewById(R.id.track_share_short_image);
        if (!TextUtils.isEmpty(picPath)) {
            Bitmap bitmapA = qqf.a(this, picPath);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            } else {
                LogUtil.j("Track_SportDataActivity", "handleWhenGetUserInfoSuccess()bmp != null ");
            }
        } else {
            LogUtil.j("Track_SportDataActivity", "handleWhenGetUserInfoSuccess()! headImgPath is null! ");
        }
        if (Utils.o() && TextUtils.isEmpty(shareNickName)) {
            imageView.setVisibility(8);
        }
        o();
        r();
    }

    private void r() {
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).updateShareUserView("Track_SportDataActivity", 8, (ImageView) findViewById(R.id.track_share_short_image), (LinearLayout) findViewById(R.id.track_user_info));
    }

    private void o() {
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.a("Track_SportDataActivity", "vipApi is null");
        } else {
            vipApi.getVipInfo(new AnonymousClass1());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.history.SportDataActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements VipCallback {
        AnonymousClass1() {
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onSuccess(Object obj) {
            if (obj == null) {
                LogUtil.a("Track_SportDataActivity", "getVipMemberInfo onSuccess result is null");
                return;
            }
            if (!(obj instanceof UserMemberInfo)) {
                LogUtil.e("Track_SportDataActivity", "result is not UserMemberInfo");
                return;
            }
            UserMemberInfo userMemberInfo = (UserMemberInfo) obj;
            if (userMemberInfo.getMemberFlag() != 1) {
                LogUtil.j("Track_SportDataActivity", "TradeViewApi memberInfo == null or != VipConstants.MEMBER_FLAG_VIP");
            } else {
                if (irz.d(userMemberInfo)) {
                    return;
                }
                HandlerExecutor.b(new Runnable() { // from class: voz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.e();
                    }
                });
            }
        }

        public /* synthetic */ void e() {
            HealthImageView healthImageView = (HealthImageView) SportDataActivity.this.findViewById(R.id.member_card_vip_icon);
            if (healthImageView != null) {
                healthImageView.setVisibility(0);
            }
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Track_SportDataActivity", "getVipMemberInfo onFailure.");
        }
    }

    private void j() {
        String[] strArrB = vrg.b(this.t, this);
        HealthSpinner titleSpinner = this.i.getTitleSpinner();
        SportArrayAdapter sportArrayAdapter = new SportArrayAdapter(this, R.layout.sport_spinner, strArrB, this.t);
        if (titleSpinner != null) {
            titleSpinner.setAdapter((SpinnerAdapter) sportArrayAdapter);
            titleSpinner.setSelection(this.j, true);
            titleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.ui.main.stories.history.SportDataActivity.4
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    HashMap map = new HashMap(16);
                    map.put("click", 1);
                    SportDataActivity.this.j = i;
                    SportDataActivity.this.b(i, map);
                    SportDataActivity.this.d();
                    if (SportDataActivity.this.m != null) {
                        SportDataActivity sportDataActivity = SportDataActivity.this;
                        sportDataActivity.u = vrg.d(i, sportDataActivity.t);
                        SportDataActivity.this.m.b(SportDataActivity.this.u);
                        SportDataActivity.this.m.c((Activity) SportDataActivity.this);
                    }
                    lmf.d().c(SportDataActivity.this, AnalyticsValue.BI_TRACK_STAT_CHANGE_SPORT_TYPE_1040036.value(), map, 0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Map<String, Object> map) {
        LogUtil.a("Track_SportDataActivity", "initPopWindowView");
        d.b(a(this.u, this.k), new LinkedHashMap<>(16));
        int iD = vrg.d(i, this.t);
        this.u = iD;
        LogUtil.a("Track_SportDataActivity", "spinner choose type: ", Integer.valueOf(iD));
        c(this.u);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.u));
        d.e(a(this.u, this.k), new LinkedHashMap<>(16));
    }

    private void f() {
        LogUtil.a("Track_SportDataActivity", "initTitleBar,mType:", Integer.valueOf(this.u));
        this.i = (CustomTitleBar) findViewById(R.id.sport_data_titlebar);
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("Track_SportDataActivity", "intent == null");
            return;
        }
        try {
            this.t = intent.getIntegerArrayListExtra("type_list");
        } catch (ArrayIndexOutOfBoundsException e) {
            LogUtil.e("Track_SportDataActivity", "initTitleBar", LogAnonymous.b(e));
        }
        ArrayList<Integer> arrayList = this.t;
        if (arrayList != null) {
            this.j = vrg.a(this.u, arrayList);
        }
        j();
        this.i.setRightButtonVisibility(0);
        if (LanguageUtil.ba(this)) {
            this.i.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_health_nav_share_black_rt), qre.f(R.string.accessibility_share));
        } else {
            this.i.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        this.i.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.SportDataActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SportDataActivity.this.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.m == null || this.o) {
            return;
        }
        r();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.share_user_heard);
        if (relativeLayout == null) {
            LogUtil.j("Track_SportDataActivity", "shareData shareUserViewLayout == null");
            n();
        } else {
            relativeLayout.post(new Runnable() { // from class: vpd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51428a.n();
                }
            });
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("tabType", Integer.valueOf(this.r));
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.u));
        lmf.d().c(this.f, AnalyticsValue.BI_TRACK_SHOW_STAT_SHARE_1040038.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Bitmap bitmapC = this.g.c();
        if (bitmapC != null) {
            LogUtil.a("Track_SportDataActivity", "shareBitmap is not null");
            this.f28239a.setBackground(new BitmapDrawable(this.q, bitmapC));
        }
        c();
    }

    private void c() {
        LogUtil.a("Track_SportDataActivity", "doShare()");
        Bitmap bitmapE = lsv.e(this.p);
        if (bitmapE == null) {
            LogUtil.j("Track_SportDataActivity", "screenCut is null");
            qpx.b(this, R.string.IDS_motiontrack_share_fail_tip);
            return;
        }
        try {
            gxt gxtVarA = vpp.a(bitmapE);
            gxtVarA.e(false);
            ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVarA, getApplicationContext());
            HashMap map = new HashMap(3);
            map.put("click", 1);
            map.put("tabType", Integer.valueOf(this.r));
            map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.u));
            lmf.d().c(this, AnalyticsValue.BI_TRACK_SHARE_HISTORY_STAT_1040039.value(), map, 0);
        } catch (OutOfMemoryError unused) {
            qpx.b(this, R.string.IDS_motiontrack_share_fail_tip);
            LogUtil.j("Track_SportDataActivity", "shareTrackData outOfMemoryError");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("Track_SportDataActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
        d.e(a(this.u, this.r), new LinkedHashMap<>(16));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.a("Track_SportDataActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        super.onPause();
        d.b(a(this.u, this.r), new LinkedHashMap<>(16));
    }

    @Override // com.huawei.ui.main.stories.fitness.common.IChartLayerHolderProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TrackModuleBarChartHolder acquireChartLayerHolder() {
        return this.f28240b;
    }

    private void c(int i) {
        LogUtil.a("Track_SportDataActivity", "initClassifiedViewList");
        this.f28240b.b();
        ArrayList arrayList = new ArrayList(4);
        this.l = arrayList;
        arrayList.add(f(i));
        this.l.add(e(i));
        this.l.add(i(i));
        this.l.add(d(i));
        ClassifiedViewList classifiedViewList = this.g;
        List<ClassifiedViewList.ClassifiedView> list = this.l;
        classifiedViewList.b(list, this.f28240b, list.get(0));
        int i2 = this.u;
        if (i2 == 0) {
            a(this.m.e());
        } else if (i2 == 287) {
            a(0);
        }
        this.g.setOnClassifiedViewChangeListener(new ClassifiedViewList.OnClassifiedViewChangeListener() { // from class: com.huawei.ui.main.stories.history.SportDataActivity.2
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.OnClassifiedViewChangeListener
            public void onClassifiedViewSelected(View view, int i3) {
                if (view instanceof ObserveredClassifiedView) {
                    SportDataActivity.this.h = (ObserveredClassifiedView) view;
                }
            }
        });
        this.m.b(i);
        h();
    }

    public void a(int i) {
        DataLayerType dataLayerType;
        if (i == 0) {
            dataLayerType = DataLayerType.DURATION;
        } else if (i == 1) {
            dataLayerType = DataLayerType.TIMES;
        } else {
            dataLayerType = DataLayerType.CALORIES;
        }
        this.f28240b.onChange(dataLayerType);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) instanceof ObserveredClassifiedView) {
                ((ObserveredClassifiedView) this.l.get(i2)).setDataLayerType(dataLayerType);
                ((ObserveredClassifiedView) this.l.get(i2)).getChart().animateBorderYAuto();
                ((ObserveredClassifiedView) this.l.get(i2)).getChart().refresh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    public String d(float f) {
        int i;
        int i2 = (int) f;
        int iE = this.m.e();
        if (qnj.a(f, 0.0f)) {
            return this.f.getString(R.string.IDS_motiontrack_show_invalid_data);
        }
        if (f - i2 >= 0.005d) {
            i = iE == 2 ? 0 : 2;
        }
        return UnitUtil.e(new BigDecimal(Float.toString(f)).doubleValue(), 1, i);
    }

    private ObserveredClassifiedView f(int i) {
        WeekBarClassifiedView weekBarClassifiedView = new WeekBarClassifiedView(this) { // from class: com.huawei.ui.main.stories.history.SportDataActivity.5
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView
            public String convertFloat2TextShow(float f) {
                return SportDataActivity.this.d(f);
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.WeekClassifiedView, com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView, com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
            public void onSelected() {
                super.onSelected();
                if (!SportDataActivity.this.n) {
                    lmf lmfVar = SportDataActivity.d;
                    SportDataActivity sportDataActivity = SportDataActivity.this;
                    lmfVar.b(sportDataActivity.a(sportDataActivity.u, SportDataActivity.this.k), new LinkedHashMap<>(16));
                    SportDataActivity.this.k = 4;
                    lmf lmfVar2 = SportDataActivity.d;
                    SportDataActivity sportDataActivity2 = SportDataActivity.this;
                    lmfVar2.e(sportDataActivity2.a(sportDataActivity2.u, SportDataActivity.this.k), new LinkedHashMap<>(16));
                    return;
                }
                SportDataActivity.this.k = 4;
                SportDataActivity.this.n = false;
            }
        };
        weekBarClassifiedView.setStepDatatype(DataInfos.query(b(i), DateType.DATE_WEEK, i));
        weekBarClassifiedView.initCalendarView(this, this.e);
        this.h = weekBarClassifiedView;
        return weekBarClassifiedView;
    }

    private ObserveredClassifiedView e(int i) {
        MonthBarClassifiedView monthBarClassifiedView = new MonthBarClassifiedView(this) { // from class: com.huawei.ui.main.stories.history.SportDataActivity.6
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView
            public String convertFloat2TextShow(float f) {
                return SportDataActivity.this.d(f);
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.MonthClassifiedView, com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView, com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
            public void onSelected() {
                super.onSelected();
                if (!SportDataActivity.this.n) {
                    lmf lmfVar = SportDataActivity.d;
                    SportDataActivity sportDataActivity = SportDataActivity.this;
                    lmfVar.b(sportDataActivity.a(sportDataActivity.u, SportDataActivity.this.k), new LinkedHashMap<>(16));
                    SportDataActivity.this.k = 5;
                    lmf lmfVar2 = SportDataActivity.d;
                    SportDataActivity sportDataActivity2 = SportDataActivity.this;
                    lmfVar2.e(sportDataActivity2.a(sportDataActivity2.u, SportDataActivity.this.k), new LinkedHashMap<>(16));
                    return;
                }
                SportDataActivity.this.k = 5;
                SportDataActivity.this.n = false;
            }
        };
        monthBarClassifiedView.setStepDatatype(DataInfos.query(b(i), DateType.DATE_MONTH, i));
        monthBarClassifiedView.initCalendarView(this, this.e);
        return monthBarClassifiedView;
    }

    private ObserveredClassifiedView i(int i) {
        YearBarClassifiedView yearBarClassifiedView = new YearBarClassifiedView(this) { // from class: com.huawei.ui.main.stories.history.SportDataActivity.7
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView
            public String convertFloat2TextShow(float f) {
                return SportDataActivity.this.d(f);
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.YearClassifiedView, com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView, com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
            public void onSelected() {
                super.onSelected();
                if (!SportDataActivity.this.n) {
                    lmf lmfVar = SportDataActivity.d;
                    SportDataActivity sportDataActivity = SportDataActivity.this;
                    lmfVar.b(sportDataActivity.a(sportDataActivity.u, SportDataActivity.this.k), new LinkedHashMap<>(16));
                    SportDataActivity.this.k = 6;
                    lmf lmfVar2 = SportDataActivity.d;
                    SportDataActivity sportDataActivity2 = SportDataActivity.this;
                    lmfVar2.e(sportDataActivity2.a(sportDataActivity2.u, SportDataActivity.this.k), new LinkedHashMap<>(16));
                    return;
                }
                SportDataActivity.this.k = 6;
                SportDataActivity.this.n = false;
            }
        };
        yearBarClassifiedView.setStepDatatype(DataInfos.query(b(i), DateType.DATE_YEAR, i));
        yearBarClassifiedView.initCalendarView(this, this.e);
        return yearBarClassifiedView;
    }

    private ObserveredClassifiedView d(int i) {
        AllClassfiedView allClassfiedView = new AllClassfiedView(this) { // from class: com.huawei.ui.main.stories.history.SportDataActivity.8
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView
            public String convertFloat2TextShow(float f) {
                return SportDataActivity.this.d(f);
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.AllClassfiedView, com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView, com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
            public void onSelected() {
                super.onSelected();
                if (!SportDataActivity.this.n) {
                    lmf lmfVar = SportDataActivity.d;
                    SportDataActivity sportDataActivity = SportDataActivity.this;
                    lmfVar.b(sportDataActivity.a(sportDataActivity.u, SportDataActivity.this.k), new LinkedHashMap<>(16));
                    SportDataActivity.this.k = 7;
                    lmf lmfVar2 = SportDataActivity.d;
                    SportDataActivity sportDataActivity2 = SportDataActivity.this;
                    lmfVar2.e(sportDataActivity2.a(sportDataActivity2.u, SportDataActivity.this.k), new LinkedHashMap<>(16));
                    return;
                }
                SportDataActivity.this.k = 7;
                SportDataActivity.this.n = false;
            }
        };
        allClassfiedView.setStepDatatype(DataInfos.query(b(i), DateType.DATE_ALL, i));
        return allClassfiedView;
    }

    private ClassType b(int i) {
        if (i == 259) {
            return ClassType.TYPE_BIKE;
        }
        if (i == 257) {
            return ClassType.TYPE_WALK;
        }
        if (i == 10001) {
            return ClassType.TYPE_FITNESS;
        }
        if (i == 262) {
            return ClassType.TYPE_SWIM;
        }
        if (i == 271) {
            return ClassType.TYPE_BASKETBALL;
        }
        if (i == 220 || i == 286) {
            return ClassType.TYPE_GOLF;
        }
        if (i == 258) {
            return ClassType.TYPE_RUN;
        }
        if (i == 287 || i == 288 || i == 289 || i == 291) {
            return ClassType.TYPE_DIVING;
        }
        if (i == 0) {
            return ClassType.TYPE_ALL_SPORT;
        }
        return ClassType.TYPE_CHANGEABLE;
    }

    private void h() {
        this.g.e(new IOnDataShowListener() { // from class: com.huawei.ui.main.stories.history.SportDataActivity.10
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onUserEvent(UserEvent userEvent) {
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onDataShowChanged(DataInfos dataInfos, int i, int i2, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
                SportDataActivity.this.o = true;
                long j = ((long) i) * 60000;
                long j2 = i2;
                if (dataInfos.isMonthData()) {
                    SportDataActivity.this.r = 5;
                } else if (dataInfos.isYearData()) {
                    SportDataActivity.this.r = 6;
                } else if (dataInfos.isAllData()) {
                    SportDataActivity.this.r = 7;
                } else if (lsl.r(j) == j) {
                    SportDataActivity.this.r = 4;
                } else {
                    LogUtil.j("Track_SportDataActivity", "not is start time: ", DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MILS));
                    return;
                }
                SportDataActivity.this.m.a(j, j2 * 60000, 7);
                SportDataActivity.this.o = false;
                SportDataActivity.this.d(AnalyticsValue.SPORT_RECORD_CHANGE_CHART_PAGE_TYPE_2040189.value());
                SportDataActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.main.stories.history.SportDataActivity.10.4
                    @Override // java.lang.Runnable
                    public void run() {
                        SportDataActivity.this.s.setText(SportDataActivity.this.getString(R.string.IDS_hwh_motiontrack_sport_data_share_date, new Object[]{SportDataActivity.this.g.e(), vrg.b(SportDataActivity.this.u, SportDataActivity.this)}));
                        SportDataActivity.this.m.b(SportDataActivity.this.getString(R.string.IDS_hwh_motiontrack_sport_data_share_date, new Object[]{SportDataActivity.this.g.e(), ""}));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", Integer.valueOf(this.r));
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i, int i2) {
        String str;
        String str2;
        if (i == 257) {
            str = "WALK_";
        } else if (i == 259) {
            str = "BIKE_";
        } else if (i == 262) {
            str = "SWIM_";
        } else if (i == 271) {
            str = "BASKETBALL_";
        } else if (i == 10001) {
            str = "FITNESS_";
        } else {
            str = "RUN_";
        }
        if (i2 == 5) {
            str2 = "MONTH";
        } else if (i2 == 6) {
            str2 = "YEAR";
        } else if (i2 == 7) {
            str2 = "ALL";
        } else {
            str2 = "WEEK";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ObserveredClassifiedView observeredClassifiedView;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
        if (!(serializableExtra instanceof HealthCalendar) || (observeredClassifiedView = this.h) == null) {
            return;
        }
        HealthCalendar healthCalendar = (HealthCalendar) serializableExtra;
        this.e = healthCalendar;
        observeredClassifiedView.processCalendarSelect(healthCalendar);
    }
}
