package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nxz extends IndoorTvBaseDisplay {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f43933c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f43934a;
    private int aa;
    private HealthTextView ab;
    private int ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private SupportDataRange af;
    private HealthTextView ag;
    private HealthTextView ah;
    private HealthTextView ai;
    private nze aj;
    private HealthTextView ak;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f43935b;
    private LinearLayout d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private LinearLayout h;
    private HealthTextView i;
    private LinearLayout j;
    private LinearLayout k;
    private Handler l;
    private HealthTextView m;
    private LinearLayout n;
    private View o;
    private boolean p;
    private HealthTextView q;
    private boolean r;
    private HealthImageView s;
    private HealthProgressBar t;
    private HealthTextView u;
    private HealthTextView v;
    private LinearLayout w;
    private HealthTextView x;
    private HealthTextView y;
    private LinearLayout z;

    public nxz(Context context, Display display, boolean z, IndoorEquipViewModel indoorEquipViewModel) {
        super(context, display);
        this.ac = 0;
        this.r = false;
        this.p = false;
        this.l = new Handler() { // from class: nxz.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.e("IDEQ_HeartRateControlSportTvDisplay", "msg == null");
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                if (i == 2020) {
                    LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "accept update ui msg");
                    if (message.obj instanceof HashMap) {
                        HashMap map = (HashMap) message.obj;
                        if (nxz.this.aj != null) {
                            nxz.this.aj.d(map);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 10010) {
                    nxz.this.mRunway.setBackgroundResource(R.drawable.runway2_2);
                    nxz.this.e(10020);
                } else {
                    if (i != 10020) {
                        return;
                    }
                    nxz.this.mRunway.setBackgroundResource(R.drawable.runway2_3);
                    nxz.this.e(10010);
                }
            }
        };
        this.mHasWear = z;
        this.mContext = context;
        this.mViewModel = indoorEquipViewModel;
        if (this.mViewModel != null) {
            this.aa = this.mViewModel.getSportType();
            this.ac = this.mViewModel.getSportStatus();
            SupportDataRange supportDataRangeA = this.mViewModel.a();
            this.af = supportDataRangeA;
            if (supportDataRangeA == null) {
                LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "mSupportDataRange == null");
                return;
            }
            LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "mSupportDataRange", supportDataRangeA, ":", Integer.valueOf(supportDataRangeA.getMinLevel()), Constants.LINK, Integer.valueOf(this.af.getMaxLevel()));
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ie_data_show_heart_rate_control_sport_tv);
        initWindowConfig();
        a(this.ac);
        h();
        this.p = true;
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void updateUi(Map<Integer, Object> map) {
        if (map == null || !this.p) {
            LogUtil.e("IDEQ_HeartRateControlSportTvDisplay", "updateUi, indoorEquipDataStructForShow = null");
            return;
        }
        LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "start update tv ui :", map.toString());
        Message messageObtainMessage = this.l.obtainMessage(2020);
        messageObtainMessage.obj = map;
        this.l.sendMessage(messageObtainMessage);
    }

    public void c(Map<String, Object> map) {
        nze nzeVar = this.aj;
        if (nzeVar != null) {
            nzeVar.b(map);
        }
    }

    public void b(int i) {
        LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "update control status: ", Integer.valueOf(i));
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void updateProgress(int i) {
        if (this.mTargetModeWithProgressViewHolder != null) {
            this.mTargetModeWithProgressViewHolder.d(i);
        }
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void initNormalView() {
        this.mRunwayBackground = (ImageView) findViewById(R.id.runwaybackground);
        this.mRunway = (ImageView) findViewById(R.id.runway);
        this.t = (HealthProgressBar) findViewById(R.id.hw_recycler_loading_hpb);
        this.mBtIcon = (ImageView) findViewById(R.id.ie_bt_icon);
        this.mBtIcon.setImageDrawable(nzc.b(this.mContext, nyh.a(this.aa, true)));
        this.mLogoLayout = (LinearLayout) findViewById(R.id.logoLayout);
        this.mBtBoltConnectIcon = (ImageView) findViewById(R.id.ie_wear_icon);
        this.mLogoImage = (ImageView) findViewById(R.id.logoImage);
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void setBtConnectState(String str) {
        if (AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED.equals(str) || AbstractFitnessClient.ACTION_SERVICE_REDISCOVERIED.equals(str)) {
            this.t.setVisibility(8);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, nyh.a(this.aa, true)));
        } else if (AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTING.equals(str)) {
            this.t.setVisibility(0);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, nyh.a(this.aa)));
        } else {
            this.t.setVisibility(8);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, nyh.a(this.aa, false)));
        }
    }

    @Override // android.app.Presentation
    public void onDisplayRemoved() {
        LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "tv display destroy.");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        this.ac = 2;
        LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "tv sport state: ", 2);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        this.ac = 1;
        a(1);
        LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "tv sport state: ", Integer.valueOf(this.ac));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.ac = 1;
        a(1);
        LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "tv sport state: ", Integer.valueOf(this.ac));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.ac = 3;
        LogUtil.a("IDEQ_HeartRateControlSportTvDisplay", "tv sport state: ", 3);
    }

    private void a(int i) {
        Handler handler;
        this.ac = i;
        if (this.r || i != 1 || (handler = this.l) == null) {
            return;
        }
        this.r = true;
        handler.sendEmptyMessage(10010);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        Handler handler = this.l;
        if (handler != null && this.ac == 1) {
            handler.sendEmptyMessageDelayed(i, nzc.b(f43933c));
            return;
        }
        if (handler != null) {
            handler.removeMessages(10010);
            this.l.removeMessages(10020);
        }
        this.r = false;
    }

    private void h() {
        initNormalView();
        this.q = (HealthTextView) findViewById(R.id.logoText);
        this.n = (LinearLayout) findViewById(R.id.deviceLayout);
        this.g = (HealthTextView) findViewById(R.id.tv_current_hr_value);
        this.f = (HealthTextView) findViewById(R.id.tv_current_hr_unit);
        this.s = (HealthImageView) findViewById(R.id.iv_heart);
        this.k = (LinearLayout) findViewById(R.id.current_stage_layout);
        this.m = (HealthTextView) findViewById(R.id.tv_current_stage);
        this.ae = (HealthTextView) findViewById(R.id.tv_stage_divider);
        this.ah = (HealthTextView) findViewById(R.id.tv_total_stage);
        this.ad = (HealthTextView) findViewById(R.id.tv_stage_name);
        this.ab = (HealthTextView) findViewById(R.id.tv_stage_duration);
        this.w = (LinearLayout) findViewById(R.id.recommend_layout);
        this.y = (HealthTextView) findViewById(R.id.tv_recommend_hr_interval);
        this.x = (HealthTextView) findViewById(R.id.tv_recommend_hr_unit);
        this.u = (HealthTextView) findViewById(R.id.tv_recommend_hr_title);
        this.ai = (HealthTextView) findViewById(R.id.tv_recommend_cadence_title);
        this.ag = (HealthTextView) findViewById(R.id.tv_recommend_cadence_interval);
        this.v = (HealthTextView) findViewById(R.id.tv_recommend_cadence_unit);
        this.z = (LinearLayout) findViewById(R.id.ll_sport_data_layout);
        this.e = (HealthTextView) findViewById(R.id.tv_chart_legend);
        this.h = (LinearLayout) findViewById(R.id.current_hr_layout);
        this.j = (LinearLayout) findViewById(R.id.current_cadence_layout);
        this.f43934a = (LinearLayout) findViewById(R.id.chart_legend_layout);
        this.ak = (HealthTextView) findViewById(R.id.tv_current_cadence_value);
        this.i = (HealthTextView) findViewById(R.id.tv_current_cadence_unit);
        this.f43935b = (HealthImageView) findViewById(R.id.iv_cadence);
        this.d = (LinearLayout) findViewById(R.id.recommend_cadence_layout);
        this.o = findViewById(R.id.center_divider);
        f();
        a();
        d();
        c();
        g();
        nze nzeVar = new nze(this.mContext, getWindow().getDecorView().getRootView(), this.mViewModel, true);
        this.aj = nzeVar;
        nzeVar.d(this.mScale, this.mCurrentDisplayDensity, this.mCurrentDisplayWidth, this.af);
    }

    private void f() {
        this.q.setTextSize(0, this.mScale * dp2px(14.0f));
        this.g.setTextSize(0, this.mScale * dp2px(24.0f));
        this.f.setTextSize(0, this.mScale * dp2px(14.0f));
        this.m.setTextSize(0, this.mScale * dp2px(16.0f));
        this.ae.setTextSize(0, this.mScale * dp2px(14.0f));
        this.ah.setTextSize(0, this.mScale * dp2px(14.0f));
        this.ad.setTextSize(0, this.mScale * dp2px(10.0f));
        this.ab.setTextSize(0, this.mScale * dp2px(10.0f));
        this.y.setTextSize(0, this.mScale * dp2px(16.0f));
        this.x.setTextSize(0, this.mScale * dp2px(14.0f));
        this.v.setTextSize(0, this.mScale * dp2px(14.0f));
        this.u.setTextSize(0, this.mScale * dp2px(12.0f));
        this.e.setTextSize(0, this.mScale * dp2px(10.0f));
        this.ai.setTextSize(0, this.mScale * dp2px(14.0f));
        this.ag.setTextSize(0, this.mScale * dp2px(16.0f));
        this.ak.setTextSize(0, this.mScale * dp2px(24.0f));
        this.i.setTextSize(0, this.mScale * dp2px(14.0f));
    }

    private void a() {
        LinearLayout linearLayout = this.h;
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.height = (int) (this.mScale * dp2px(32.0f));
            layoutParams.setMargins(0, (int) (this.mScale * dp2px(4.0f)), 0, 0);
            this.h.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout2 = this.j;
        if (linearLayout2 != null && (linearLayout2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.j.getLayoutParams();
            layoutParams2.height = (int) (this.mScale * dp2px(32.0f));
            layoutParams2.setMargins(0, (int) (this.mScale * dp2px(4.0f)), 0, 0);
            this.j.setLayoutParams(layoutParams2);
        }
        LinearLayout linearLayout3 = this.k;
        if (linearLayout3 != null && (linearLayout3.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
            layoutParams3.height = (int) (this.mScale * dp2px(32.0f));
            layoutParams3.setMargins(0, (int) (this.mScale * dp2px(4.0f)), 0, 0);
            this.k.setLayoutParams(layoutParams3);
        }
        LinearLayout linearLayout4 = this.z;
        if (linearLayout4 == null || !(linearLayout4.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.z.getLayoutParams();
        layoutParams4.height = (int) (this.mScale * dp2px(80.0f));
        layoutParams4.setMargins((int) (this.mScale * dp2px(12.0f)), 0, (int) (this.mScale * dp2px(12.0f)), 0);
        this.z.setLayoutParams(layoutParams4);
    }

    private void d() {
        changeRunwaySize();
        changeLogoSize();
        if (this.mBtIcon != null && (this.mBtIcon.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mBtIcon.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(40.0f));
            layoutParams.height = (int) (this.mScale * dp2px(40.0f));
            this.mBtIcon.setLayoutParams(layoutParams);
        }
        if (this.mBtBoltConnectIcon != null && (this.mBtBoltConnectIcon.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mBtBoltConnectIcon.getLayoutParams();
            layoutParams2.width = (int) (this.mScale * dp2px(40.0f));
            layoutParams2.height = (int) (this.mScale * dp2px(40.0f));
            layoutParams2.setMarginStart(((int) this.mScale) * dp2px(4.0f));
            this.mBtBoltConnectIcon.setLayoutParams(layoutParams2);
        }
        HealthImageView healthImageView = this.s;
        if (healthImageView != null && (healthImageView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.s.getLayoutParams();
            layoutParams3.width = (int) (this.mScale * dp2px(16.0f));
            layoutParams3.height = (int) (this.mScale * dp2px(16.0f));
            layoutParams3.setMargins(0, 0, 0, (int) (this.mScale * dp2px(4.0f)));
            layoutParams3.setMarginEnd(((int) this.mScale) * dp2px(6.0f));
            this.s.setLayoutParams(layoutParams3);
        }
        HealthImageView healthImageView2 = this.f43935b;
        if (healthImageView2 != null && (healthImageView2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f43935b.getLayoutParams();
            layoutParams4.width = (int) (this.mScale * dp2px(16.0f));
            layoutParams4.height = (int) (this.mScale * dp2px(16.0f));
            layoutParams4.setMargins(0, 0, 0, (int) (this.mScale * dp2px(4.0f)));
            layoutParams4.setMarginEnd(((int) this.mScale) * dp2px(6.0f));
            this.f43935b.setLayoutParams(layoutParams4);
        }
        View view = this.o;
        if (view == null || !(view.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
        layoutParams5.width = (int) (this.mScale * dp2px(0.5f));
        layoutParams5.height = (int) (this.mScale * dp2px(40.0f));
        this.o.setLayoutParams(layoutParams5);
    }

    private void c() {
        changeLogoMargin();
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
            layoutParams.setMargins(0, (int) (this.mScale * dp2px(20.0f)), 0, 0);
            layoutParams.setMarginStart((int) (this.mScale * dp2px(24.0f)));
            this.n.setLayoutParams(layoutParams);
        }
        HealthProgressBar healthProgressBar = this.t;
        if (healthProgressBar != null && (healthProgressBar.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.t.getLayoutParams();
            layoutParams2.setMargins(0, (int) (this.mScale * dp2px(20.0f)), 0, 0);
            layoutParams2.setMarginStart((int) (this.mScale * dp2px(24.0f)));
            this.t.setLayoutParams(layoutParams2);
        }
        HealthTextView healthTextView = this.q;
        if (healthTextView != null && (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.q.getLayoutParams();
            layoutParams3.setMarginStart((int) (this.mScale * dp2px(8.0f)));
            this.q.setLayoutParams(layoutParams3);
        }
        j();
        b();
        e();
    }

    private void j() {
        HealthTextView healthTextView = this.f;
        if (healthTextView != null && (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, (int) (this.mScale * dp2px(2.0f)));
            layoutParams.setMarginStart((int) (this.mScale * dp2px(4.0f)));
            this.f.setLayoutParams(layoutParams);
        }
        HealthTextView healthTextView2 = this.i;
        if (healthTextView2 != null && (healthTextView2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams2.setMargins(0, 0, 0, (int) (this.mScale * dp2px(2.0f)));
            layoutParams2.setMarginStart((int) (this.mScale * dp2px(4.0f)));
            this.i.setLayoutParams(layoutParams2);
        }
        LinearLayout linearLayout = this.k;
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
            layoutParams3.setMargins(0, 0, 0, (int) (this.mScale * dp2px(2.0f)));
            layoutParams3.setMarginStart((int) (this.mScale * dp2px(24.0f)));
            this.k.setLayoutParams(layoutParams3);
        }
        HealthTextView healthTextView3 = this.ad;
        if (healthTextView3 != null && (healthTextView3.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.ad.getLayoutParams();
            layoutParams4.setMarginStart((int) (this.mScale * dp2px(8.0f)));
            this.ad.setLayoutParams(layoutParams4);
        }
        HealthTextView healthTextView4 = this.ab;
        if (healthTextView4 == null || !(healthTextView4.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.ab.getLayoutParams();
        layoutParams5.setMarginStart((int) (this.mScale * dp2px(8.0f)));
        this.ab.setLayoutParams(layoutParams5);
    }

    private void b() {
        LinearLayout linearLayout = this.w;
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.w.getLayoutParams();
            layoutParams.setMargins(0, (int) (this.mScale * dp2px(2.0f)), 0, 0);
            this.w.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout2 = this.d;
        if (linearLayout2 != null && (linearLayout2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams2.setMargins(0, (int) (this.mScale * dp2px(2.0f)), 0, 0);
            this.d.setLayoutParams(layoutParams2);
        }
        HealthTextView healthTextView = this.x;
        if (healthTextView != null && (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.x.getLayoutParams();
            layoutParams3.setMarginStart((int) (this.mScale * dp2px(4.0f)));
            this.x.setLayoutParams(layoutParams3);
        }
        HealthTextView healthTextView2 = this.v;
        if (healthTextView2 != null && (healthTextView2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.v.getLayoutParams();
            layoutParams4.setMarginStart((int) (this.mScale * dp2px(4.0f)));
            this.v.setLayoutParams(layoutParams4);
        }
        HealthTextView healthTextView3 = this.u;
        if (healthTextView3 == null || !(healthTextView3.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.u.getLayoutParams();
        layoutParams5.setMarginEnd((int) (this.mScale * dp2px(4.0f)));
        this.u.setLayoutParams(layoutParams5);
    }

    private void e() {
        LinearLayout linearLayout = this.f43934a;
        if (linearLayout == null || !(linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f43934a.getLayoutParams();
        layoutParams.setMarginStart((int) (this.mScale * dp2px(24.0f)));
        this.f43934a.setLayoutParams(layoutParams);
    }

    private void g() {
        this.q.setText(this.mContext.getString(R.string.IDS_app_name_health));
        this.f.setText(this.mContext.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.x.setText(this.mContext.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.u.setText(this.mContext.getString(R.string.IDS_recommended_heart_rate));
        this.e.setText(this.mContext.getString(R.string.IDS_main_watch_heart_rate_string));
    }
}
