package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nxy extends IndoorTvBaseDisplay implements SportLifecycle {
    private static float d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f43928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<SportDetailChartDataType, BaseRealTimeDynamicChartViewModel> f43929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f43930c;
    private HealthTextView e;
    private nzk f;
    private boolean g;
    private RelativeLayout h;
    private boolean i;
    private ImageView j;
    private String k;
    private String l;
    private HealthTextView m;
    private HealthProgressBar n;
    private boolean o;
    private SupportDataRange p;
    private int q;
    private ViewStub r;
    private int t;

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        this.q = 2;
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "tv sport state: ", 2);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        this.q = 1;
        e(1);
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "tv sport state: ", Integer.valueOf(this.q));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.q = 1;
        e(1);
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "tv sport state: ", Integer.valueOf(this.q));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.q = 3;
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "tv sport state: ", 3);
    }

    public nxy(Context context, Display display, boolean z, IndoorEquipViewModel indoorEquipViewModel) {
        super(context, display);
        this.g = false;
        this.f43929b = new HashMap();
        this.i = false;
        this.o = false;
        this.q = 0;
        this.k = b(Locale.getDefault());
        this.f43928a = new Handler() { // from class: nxy.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.e("IDEQ_IndoorEquipTvDisplay", "msg == null");
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                if (i == 1014) {
                    LogUtil.a("IDEQ_IndoorEquipTvDisplay", "accept update ui msg");
                    if (message.obj instanceof HashMap) {
                        nxy.this.e((HashMap) message.obj);
                        return;
                    }
                    return;
                }
                if (i == 10010) {
                    nxy.this.mRunway.setBackgroundResource(R.drawable.runway2_2);
                    nxy.this.c(10020);
                    return;
                }
                if (i != 10011) {
                    switch (i) {
                        case 10020:
                            nxy.this.mRunway.setBackgroundResource(R.drawable.runway2_3);
                            nxy.this.c(10010);
                            break;
                        case 10021:
                            nxy.this.mRunway.setBackgroundResource(R.drawable.ripple2_0);
                            nxy.this.c(10011);
                            break;
                        case 10022:
                            nxy.this.mRunway.setBackgroundResource(R.drawable.ripple2_2);
                            nxy.this.c(10023);
                            break;
                        case 10023:
                            nxy.this.mRunway.setBackgroundResource(R.drawable.ripple2_3);
                            nxy.this.c(10024);
                            break;
                        case 10024:
                            nxy.this.mRunway.setBackgroundResource(R.drawable.ripple2_4);
                            nxy.this.c(10021);
                            break;
                    }
                    return;
                }
                nxy.this.mRunway.setBackgroundResource(R.drawable.ripple2_1);
                nxy.this.c(10022);
            }
        };
        this.mHasWear = z;
        this.mViewModel = indoorEquipViewModel;
        if (this.mViewModel != null) {
            this.t = this.mViewModel.getSportType();
            this.q = this.mViewModel.getSportStatus();
            this.p = this.mViewModel.a();
            this.l = this.mViewModel.s();
            this.mHasRunPostureDevice = this.mViewModel.r();
            SupportDataRange supportDataRange = this.p;
            if (supportDataRange == null) {
                LogUtil.a("IDEQ_IndoorEquipTvDisplay", "mSupportDataRange == null");
                return;
            } else {
                LogUtil.a("IDEQ_IndoorEquipTvDisplay", "mSupportDataRange", supportDataRange, Integer.valueOf(supportDataRange.getMinLevel()), Integer.valueOf(this.p.getMaxLevel()));
            }
        }
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "Constructor, hasRunPostureDevice = ", Boolean.valueOf(this.mHasRunPostureDevice), ",ishasWear = ", Boolean.valueOf(z), ",sportType=", Integer.valueOf(this.t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Handler handler = this.f43928a;
        if (handler != null && this.q == 1) {
            handler.sendEmptyMessageDelayed(i, nzc.b(d));
            return;
        }
        if (handler != null) {
            if (this.t == 274) {
                handler.removeMessages(10021);
                this.f43928a.removeMessages(10011);
                this.f43928a.removeMessages(10022);
                this.f43928a.removeMessages(10023);
                this.f43928a.removeMessages(10024);
            } else {
                handler.removeMessages(10010);
                this.f43928a.removeMessages(10020);
            }
        }
        this.i = false;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ie_data_show_landscape_aw70_tv);
        initWindowConfig();
        e(this.q);
        n();
        this.o = true;
    }

    @Override // android.app.Presentation
    public void onDisplayRemoved() {
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "Tv display destroy.", Integer.valueOf(this.t));
    }

    private void n() {
        initNormalView();
        this.mLogoLayout = (LinearLayout) findViewById(R.id.logoLayout);
        this.mRunway = (ImageView) findViewById(R.id.runway);
        this.mRunwayBackground = (ImageView) findViewById(R.id.runwaybackground);
        if (this.t == 274) {
            LogUtil.a("IDEQ_IndoorEquipTvDisplay", "set Ripple.");
            this.mRunwayBackground.setBackgroundResource(R.drawable.ripple2);
            this.mRunway.setBackgroundResource(R.drawable.ripple2_0);
        }
        this.n = (HealthProgressBar) findViewById(R.id.hw_recycler_loading_hpb);
        this.mBtIcon = (ImageView) findViewById(R.id.ie_bt_icon);
        this.mBtIcon.setImageDrawable(nzc.b(this.mContext, nyh.a(this.t, true)));
        this.mBtBoltConnectIcon = (ImageView) findViewById(R.id.ie_bolt_icon);
        if (this.mViewModel != null && this.mViewModel.p()) {
            this.mBtBoltConnectIcon.setVisibility(0);
            this.mBtBoltConnectIcon.setImageResource(nzc.a(this.mViewModel.o()));
            changeBtBoltIconSize();
        }
        this.mLogoImage = (ImageView) findViewById(R.id.logoImage);
        this.m = (HealthTextView) findViewById(R.id.logoText);
        this.f = new nzk(getWindow().getDecorView().getRootView(), this.mHasWear, this.mViewModel, this.mContext);
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "mSupportDataRange get", Integer.valueOf(this.p.getMaxLevel()), "min", Integer.valueOf(this.p.getMinLevel()));
        this.f.b(this.mScale, this.mCurrentDisplayDensity, this.p);
        j();
        a();
        d();
        e();
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void initNormalView() {
        this.r = (ViewStub) findViewById(R.id.view_stub_heartrate_distance);
        if (isTargetType()) {
            initTargetLayout();
        } else {
            this.r.setVisibility(0);
        }
        this.e = (HealthTextView) findViewById(R.id.distance_value);
        this.f43930c = (HealthTextView) findViewById(R.id.distance_unit);
        this.h = (RelativeLayout) findViewById(R.id.heartrate_layout);
        this.mHeartRateImage = (ImageView) findViewById(R.id.heartrate_image);
        this.j = (ImageView) findViewById(R.id.heartrate_device);
        this.mBackground = (ImageView) findViewById(R.id.background_layout_tv);
        if (this.mHasWear) {
            this.mHeartRateType = (HealthTextView) findViewById(R.id.heartrate_type);
            this.mHeartRate = (HealthTextView) findViewById(R.id.heartrate_value);
            this.mHeartRateUnit = (HealthTextView) findViewById(R.id.heartrate_unit);
        }
    }

    private void a() {
        if (isTargetType()) {
            this.mBackground.setVisibility(0);
            changeBackgroundSize();
        } else {
            i();
        }
        o();
        k();
        h();
    }

    private void i() {
        if (this.mHasWear) {
            this.h.setVisibility(0);
            if (this.mHeartRateType.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mHeartRateType.getLayoutParams();
                layoutParams.width = (int) (this.mScale * dp2px(85.0f));
                this.mHeartRateType.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.r.getLayoutParams();
                layoutParams2.width = -2;
                this.r.setLayoutParams(layoutParams2);
            }
            this.mHeartRateUnit.setText(nzc.a(0, this.mContext));
            ThreadPoolManager.c().execute(new Runnable() { // from class: nya
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43939c.b();
                }
            });
            return;
        }
        this.h.setVisibility(8);
        this.mBackground.setVisibility(0);
        changeBackgroundSize();
        this.e.setTextSize(0, dp2px(80.0f) * this.mScale);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, 0, 0, qrs.d(this.mContext, this.mScale * 3.0f));
        layoutParams3.addRule(14);
        this.e.setLayoutParams(layoutParams3);
        this.f43930c.setTextSize(0, dp2px(13.0f) * this.mScale);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, R.id.distance_value);
        layoutParams4.addRule(14);
        this.f43930c.setLayoutParams(layoutParams4);
    }

    /* synthetic */ void b() {
        initHeartRateZone(this.t);
    }

    private void o() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.land_left_data_layout);
        if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            if (this.t == 265) {
                layoutParams.setMarginStart((int) (this.mScale * dp2px(4.0f)));
            } else {
                layoutParams.setMarginStart((int) (this.mScale * dp2px(10.0f)));
            }
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    private void k() {
        if (this.t == 281) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.land_right_data_layout);
            if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.setMarginStart((int) (this.mScale * dp2px(4.0f)));
                layoutParams.setMargins(0, (int) (this.mScale * dp2px(35.0f)), 0, (int) (this.mScale * dp2px(85.0f)));
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.land_layout_chart);
        if (linearLayout2.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) linearLayout2.getLayoutParams();
            layoutParams2.width = (int) (this.mScale * dp2px(180.0f));
            layoutParams2.setMargins(0, (int) (this.mScale * dp2px(5.0f)), 0, (int) (this.mScale * dp2px(51.8f)));
            layoutParams2.setMarginEnd((int) (this.mScale * dp2px(20.0f)));
            linearLayout2.setLayoutParams(layoutParams2);
        }
    }

    private void j() {
        if (!isTargetType()) {
            if (this.mHasWear) {
                this.mHeartRateType.setTextSize(0, this.mScale * this.mHeartRateType.getTextSize());
                this.mHeartRate.setTextSize(0, this.mScale * this.mHeartRate.getTextSize());
                this.mHeartRateUnit.setTextSize(0, this.mScale * this.mHeartRateUnit.getTextSize());
                this.mHeartRateUnit.setMaxWidth((int) (this.mScale * this.mHeartRateUnit.getMaxWidth()));
            }
            this.e.setTextSize(0, this.mScale * this.e.getTextSize());
            this.f43930c.setTextSize(0, this.mScale * this.f43930c.getTextSize());
            f();
        }
        this.m.setTextSize(0, this.mScale * this.m.getTextSize());
    }

    private void f() {
        if ((LanguageUtil.aa(this.mContext) || LanguageUtil.bd(this.mContext) || LanguageUtil.az(this.mContext) || LanguageUtil.am(this.mContext) || LanguageUtil.bb(this.mContext) || LanguageUtil.t(this.mContext) || LanguageUtil.ai(this.mContext) || LanguageUtil.q(this.mContext)) && this.mHeartRateUnit != null) {
            this.mHeartRateUnit.setTextSize(0, this.mHeartRateUnit.getTextSize() * 0.7f);
        }
    }

    private void d() {
        changeBtIconSize();
        changeRunwaySize();
        changeLogoSize();
        if (this.mHasWear) {
            c();
        }
    }

    private void c() {
        if (this.mHeartRateImage == null || this.j == null) {
            return;
        }
        if (this.mHeartRateImage.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mHeartRateImage.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(196.0f));
            layoutParams.height = (int) (this.mScale * dp2px(163.0f));
            this.mHeartRateImage.setLayoutParams(layoutParams);
        }
        if (this.j.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
            layoutParams2.width = (int) (this.mScale * dp2px(12.0f));
            layoutParams2.height = (int) (this.mScale * dp2px(12.0f));
            this.j.setLayoutParams(layoutParams2);
        }
    }

    private void e() {
        changeLogoMargin();
        if (isTargetType()) {
            return;
        }
        if (this.mHasWear) {
            if (this.j.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
                layoutParams.setMargins(0, (int) (this.mScale * dp2px(2.0f)), 0, 0);
                this.j.setLayoutParams(layoutParams);
            }
            if (this.mHeartRateType.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mHeartRateType.getLayoutParams();
                layoutParams2.setMargins(0, (int) (this.mScale * dp2px(43.5f)), 0, 0);
                this.mHeartRateType.setLayoutParams(layoutParams2);
            }
        }
        if (this.f43930c.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) this.f43930c.getLayoutParams()).setMarginStart((int) (this.mScale * dp2px(24.0f)));
        }
    }

    private void h() {
        SportDetailChartDataType[] sportDetailChartDataTypeArrE;
        if (this.mViewModel == null || (sportDetailChartDataTypeArrE = nyh.e(this.t, this.mViewModel.p(), this.mViewModel.q(), this.mViewModel.s())) == null || sportDetailChartDataTypeArrE.length == 0) {
            return;
        }
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "sport chart:", Arrays.toString(sportDetailChartDataTypeArrE));
        for (SportDetailChartDataType sportDetailChartDataType : sportDetailChartDataTypeArrE) {
            c(sportDetailChartDataType, d(sportDetailChartDataType));
        }
    }

    private BaseRealTimeDynamicChartViewModel d(SportDetailChartDataType sportDetailChartDataType) {
        BaseRealTimeDynamicChartViewModel nzwVar;
        BaseRealTimeDynamicChartViewModel nziVar;
        switch (AnonymousClass1.f43931b[sportDetailChartDataType.ordinal()]) {
            case 1:
                nzwVar = new nzw(b(R.id.divide_step_rate_chart, R.id.step_rate_chart));
                break;
            case 2:
                nziVar = new nzi(b(R.id.divide_ground_impact_magnet, R.id.ground_impact_magnet));
                nzwVar = nziVar;
                break;
            case 3:
                nziVar = new nzn(b(R.id.divide_ground_shock_peak, R.id.ground_shock_peak));
                nzwVar = nziVar;
                break;
            case 4:
                nziVar = new nzh(b(R.id.divide_touchdown_magnet, R.id.touchdown_magnet));
                this.g = true;
                nzwVar = nziVar;
                break;
            case 5:
                nzwVar = new nzu(b(R.id.divide_rt_pace_chart, R.id.rt_pace_chart));
                break;
            case 6:
                nziVar = new nzq(b(R.id.divide_paddle_freq_magnet, R.id.paddle_freq_magnet), this.l);
                nzwVar = nziVar;
                break;
            case 7:
                nzwVar = new nzj(b(R.id.divide_cadence_chart, R.id.cadence_chart));
                break;
            case 8:
                nzwVar = new nzx(b(R.id.divide_power_chart, R.id.power_chart));
                break;
            case 9:
                nzwVar = new nzv(b(R.id.divide_speed_rate_chart, R.id.speed_rate_chart));
                break;
            default:
                nzwVar = null;
                break;
        }
        d(sportDetailChartDataType, nzwVar);
        return nzwVar;
    }

    private void d(SportDetailChartDataType sportDetailChartDataType, BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel) {
        if (baseRealTimeDynamicChartViewModel != null) {
            if (sportDetailChartDataType == SportDetailChartDataType.CADENCE && this.t == 273) {
                baseRealTimeDynamicChartViewModel.setOrdinateY(0, 120);
            } else {
                baseRealTimeDynamicChartViewModel.setDefaultOrdinateY();
            }
        }
    }

    private RealTimeDynamicChartView b(int i, int i2) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
            viewFindViewById.getLayoutParams().height = (int) (this.mScale * dp2px(16.0f));
        }
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(i2);
        if (realTimeDynamicChartView != null) {
            realTimeDynamicChartView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = realTimeDynamicChartView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = ((int) this.mScale) * dp2px(88.0f);
                realTimeDynamicChartView.setLayoutParams(layoutParams);
            }
        }
        return realTimeDynamicChartView;
    }

    private void c(SportDetailChartDataType sportDetailChartDataType, BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel) {
        if (baseRealTimeDynamicChartViewModel != null) {
            baseRealTimeDynamicChartViewModel.setScale(this.mScale);
            if (baseRealTimeDynamicChartViewModel.getTitleTextLength() > 4) {
                baseRealTimeDynamicChartViewModel.setSmallTextSize();
            } else {
                baseRealTimeDynamicChartViewModel.setNormalTextSize();
            }
            baseRealTimeDynamicChartViewModel.updateConfiguration(this.mContext);
            this.f43929b.put(sportDetailChartDataType, baseRealTimeDynamicChartViewModel);
        }
    }

    private void c(Map<Integer, Object> map) {
        for (Map.Entry<SportDetailChartDataType, BaseRealTimeDynamicChartViewModel> entry : this.f43929b.entrySet()) {
            SportDetailChartDataType key = entry.getKey();
            BaseRealTimeDynamicChartViewModel value = entry.getValue();
            if (value != null) {
                int i = AnonymousClass1.f43931b[key.ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3 || i == 4) {
                        e(map, key, value);
                    } else {
                        e(key, map, value);
                    }
                } else if (map.get(4) != null) {
                    value.pushNewData(((Integer) map.get(4)).intValue(), d);
                }
            }
        }
    }

    private void e(SportDetailChartDataType sportDetailChartDataType, Map<Integer, Object> map, BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel) {
        switch (sportDetailChartDataType) {
            case REALTIME_PACE:
                if (map.get(14) != null) {
                    baseRealTimeDynamicChartViewModel.pushNewData(((Integer) map.get(14)).intValue());
                }
                break;
            case PADDLE_FREQUENCY:
                if (map.get(26) != null) {
                    baseRealTimeDynamicChartViewModel.pushNewData(map.get(26) instanceof Float ? ((Float) map.get(26)).floatValue() : 0.0f);
                    break;
                }
                break;
            case CADENCE:
                if (map.get(31) != null) {
                    baseRealTimeDynamicChartViewModel.pushNewData(((Integer) map.get(31)).intValue());
                }
                break;
            case POWER:
                if (map.get(7) != null) {
                    baseRealTimeDynamicChartViewModel.pushNewData(((Integer) map.get(7)).intValue());
                }
                break;
            case SPEED_RATE:
                if (map.get(3) != null) {
                    baseRealTimeDynamicChartViewModel.pushNewData(((Integer) map.get(3)).intValue() / 100.0f);
                }
                break;
        }
    }

    private void e(Map<Integer, Object> map, SportDetailChartDataType sportDetailChartDataType, BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel) {
        if (map.get(20002) != null) {
            gzv gzvVar = (gzv) map.get(20002);
            if (gzvVar != null && this.mHasRunPostureDevice && this.g) {
                c(gzvVar, sportDetailChartDataType);
            } else if (gzvVar == null && this.g) {
                baseRealTimeDynamicChartViewModel.pushNewData(0, 0.0f);
            } else {
                LogUtil.e("IDEQ_IndoorEquipTvDisplay", "updateUi, hasRunPostureDevice = ", Boolean.valueOf(this.mHasRunPostureDevice));
            }
        }
    }

    void e(int i) {
        Handler handler;
        this.q = i;
        if (this.i || i != 1 || (handler = this.f43928a) == null) {
            return;
        }
        this.i = true;
        if (this.t == 274) {
            handler.sendEmptyMessage(10011);
        } else {
            handler.sendEmptyMessage(10010);
        }
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void setBtConnectState(String str) {
        if (AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED.equals(str) || AbstractFitnessClient.ACTION_SERVICE_REDISCOVERIED.equals(str)) {
            this.n.setVisibility(8);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, nyh.a(this.t, true)));
        } else if (AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTING.equals(str)) {
            this.n.setVisibility(0);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, nyh.a(this.t)));
        } else {
            this.n.setVisibility(8);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, nyh.a(this.t, false)));
        }
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void updateUi(Map<Integer, Object> map) {
        if (map == null || !this.o) {
            LogUtil.a("IDEQ_IndoorEquipTvDisplay", "updateUi, indoorEquipDataStructForShow = null");
            return;
        }
        Message messageObtainMessage = this.f43928a.obtainMessage(1014);
        messageObtainMessage.obj = map;
        this.f43928a.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void updateProgress(int i) {
        if (this.mTargetModeWithProgressViewHolder != null) {
            this.mTargetModeWithProgressViewHolder.d(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Map<Integer, Object> map) {
        String string;
        if (l()) {
            g();
            this.f.b(this.mScale, this.mCurrentDisplayDensity, this.p);
        }
        if (this.mHasWear && this.mHeartRate != null) {
            updateHeartRate(((Integer) map.get(20004)).intValue());
        }
        if (this.mHasRunPostureDevice || this.t != 264) {
            c(map);
        }
        nzk nzkVar = this.f;
        if (nzkVar != null) {
            nzkVar.c(map);
        }
        if (this.mTargetModeWithProgressViewHolder != null) {
            this.mTargetModeWithProgressViewHolder.e(map);
        }
        if (this.t == 274) {
            Object obj = map.get(26);
            if (obj instanceof Float) {
                d = ((Float) obj).floatValue();
            }
        } else {
            Object obj2 = map.get(3);
            if (obj2 instanceof Integer) {
                d = ((Integer) obj2).intValue() / 100.0f;
            }
        }
        Object obj3 = map.get(1);
        int iIntValue = obj3 instanceof Integer ? ((Integer) obj3).intValue() : 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        float f = UnitUtil.f() ? (iIntValue / 1000.0f) * 0.621371f : iIntValue / 1000.0f;
        HealthTextView healthTextView = this.e;
        if (healthTextView == null || this.f43930c == null) {
            return;
        }
        healthTextView.setText(decimalFormat.format(f));
        HealthTextView healthTextView2 = this.f43930c;
        if (UnitUtil.f()) {
            string = this.mContext.getResources().getQuantityString(R.plurals.ie_motiontrack_show_sport_unit_mile, iIntValue, "");
        } else {
            string = this.mContext.getString(R.string.ie_motiontrack_show_sport_unit_km);
        }
        healthTextView2.setText(string);
    }

    private void g() {
        LogUtil.a("IDEQ_IndoorEquipTvDisplay", "changeTextLanguage");
        HealthTextView healthTextView = this.m;
        if (healthTextView != null) {
            healthTextView.setText(this.mContext.getString(R.string.IDS_app_name_health));
        }
        if (this.mHeartRateUnit == null || this.mHeartRateType == null) {
            return;
        }
        this.mHeartRateUnit.setText(nzc.a(0, this.mContext));
    }

    private void c(gzv gzvVar, SportDetailChartDataType sportDetailChartDataType) {
        int iA = gzvVar.a();
        if (sportDetailChartDataType.equals(SportDetailChartDataType.GROUND_CONTACT_TIME)) {
            this.f43929b.get(sportDetailChartDataType).pushNewData(iA, d);
        }
        int iD = gzvVar.d();
        if (sportDetailChartDataType.equals(SportDetailChartDataType.GROUND_IMPACT_ACCELERATION)) {
            this.f43929b.get(sportDetailChartDataType).pushNewData(iD, d);
        }
        float fO = gzvVar.o();
        if (sportDetailChartDataType.equals(SportDetailChartDataType.ACTIVE_PEAK)) {
            this.f43929b.get(sportDetailChartDataType).pushNewData(fO, d);
        }
    }

    private String b(Locale locale) {
        if (locale == null) {
            return "";
        }
        return locale.getLanguage() + Constants.LINK + locale.getCountry();
    }

    private boolean l() {
        String strB = b(Locale.getDefault());
        if (strB.equals(this.k)) {
            return false;
        }
        this.k = strB;
        return true;
    }
}
