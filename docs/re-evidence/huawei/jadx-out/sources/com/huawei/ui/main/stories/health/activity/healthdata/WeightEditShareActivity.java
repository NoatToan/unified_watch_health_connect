package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.XAxis;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.servicesui.R;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.view.ShareSquareLayout;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.stories.health.fragment.WeightEditShareFragment;
import com.huawei.ui.main.stories.health.interactors.healthdata.WeightShareEditListener;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk;
import com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.dxm;
import defpackage.ezh;
import defpackage.gxt;
import defpackage.lmf;
import defpackage.lrp;
import defpackage.njy;
import defpackage.qns;
import defpackage.qnt;
import defpackage.qpn;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qrs;
import defpackage.vdo;
import defpackage.vei;
import defpackage.vhc;
import defpackage.vhi;
import defpackage.vhj;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class WeightEditShareActivity extends BaseActivity implements WeightShareEditListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f27639b = {"A", "B", TypeParams.SEARCH_CODE};
    private static final String[] d = {"weight_share_background_1", "weight_share_background_2", "weight_share_background_3"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubTabWidget f27640a;
    private SocialShareCenterApi aa;
    private CustomTitleBar ab;
    private qpn ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private CustomViewDialog ah;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f27641c;
    private WeightEditShareFragment e;
    private float f;
    private HealthTextView g;
    private Context h;
    private HealthColumnSystem i;
    private HealthTextView j;
    private b k;
    private WeightEditShareFragment m;
    private int n;
    private float o;
    private RelativeLayout q;
    private float r;
    private HwHealthLineChart s;
    private HealthScrollView t;
    private ShareSquareLayout v;
    private HealthTextView w;
    private int x;
    private HealthViewPager z;
    private int l = -1;
    private int u = 0;
    private int p = 0;
    private int y = 0;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(R.anim.left_enter, R.anim.left_exit);
        super.onCreate(bundle);
        setContentView(com.huawei.ui.main.R.layout.activity_weight_edit_share);
        cancelAdaptRingRegion();
        this.h = this;
        this.i = new HealthColumnSystem(this, 1);
        this.k = new b(this);
        this.aa = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        m();
        k();
        f();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        k();
        g();
        refreshWeightShareData(0, false);
        refreshWeightShareData(1, false);
        refreshWeightShareData(2, false);
    }

    private void k() {
        Context context;
        if (this.v == null || (context = this.h) == null) {
            return;
        }
        if (qrs.af(context)) {
            this.r = this.h.getResources().getDimension(com.huawei.ui.main.R.dimen.maxPaddingStart);
            if (qrs.ah(this.h)) {
                this.f = this.i.a(6);
            } else {
                this.f = this.i.a(4);
            }
            this.o = this.r + this.f;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.height = (int) this.f;
            layoutParams.width = (int) this.f;
            layoutParams.addRule(14);
            layoutParams.setMargins(qrs.d(this.h, this.o), qrs.d(this.h, 28.0f), qrs.d(this.h, this.o), qrs.d(this.h, 0.0f));
            this.v.setLayoutParams(layoutParams);
            int iD = qrs.d(this.h, 28.0f);
            int iA = (int) (this.i.a(2) + qqp.b(this.h) + this.r);
            if (qrs.ah(this.h)) {
                iA = (int) (this.i.a(1) + qqp.b(this.h) + this.r);
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, iD + qrs.d(this.h, 8.0f));
            layoutParams2.setMarginStart(iA);
            layoutParams2.setMarginEnd(iA);
            this.q.setLayoutParams(layoutParams2);
            return;
        }
        this.v.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.height = qrs.d(this.h, 48.0f);
        this.q.setLayoutParams(layoutParams3);
    }

    private void f() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uro
            @Override // java.lang.Runnable
            public final void run() {
                this.f50487b.b();
            }
        });
    }

    public /* synthetic */ void b() {
        FastingLiteRepository.getFastingLiteTasks(new FastingLiteCbk<vhj[]>() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightEditShareActivity.1
            @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(vhj[] vhjVarArr) {
                if (WeightEditShareActivity.this.k == null || vhjVarArr == null || vhjVarArr.length <= 0) {
                    return;
                }
                int iD = 0;
                vhj vhjVar = vhjVarArr[0];
                long jC = vhjVar.c() * 1000;
                LogUtil.a("WeightEditShareActivity", "joinTime = ", HiDateUtil.e(jC, "yyyy-MM-dd HH:mm:ss:SSS"));
                int iD2 = HiDateUtil.d(jC);
                int iD3 = HiDateUtil.d(System.currentTimeMillis());
                if (iD2 == iD3) {
                    LogUtil.a("WeightEditShareActivity", "startDay = currentDay");
                    jC = HiDateUtil.p(jC);
                }
                WeightEditShareActivity.this.c(jC);
                try {
                    iD = HiDateUtil.d(iD2, iD3, "yyyyMMdd");
                } catch (ParseException unused) {
                    LogUtil.e("WeightEditShareActivity", "getJoinDays ParseException");
                }
                LogUtil.a("WeightEditShareActivity", "startDay = ", Integer.valueOf(iD2), ", currentDay = ", Integer.valueOf(iD3), ", joinDays = ", Integer.valueOf(iD));
                WeightEditShareActivity.this.d(vhjVar, iD);
            }

            @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
            public void onFailure(int i, String str) {
                LogUtil.j("WeightEditShareActivity", "getFastingLiteTasks onFailure errorCode = ", Integer.valueOf(i), ",msg = ", str);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(vhj vhjVar, int i) {
        int iA;
        int iA2;
        vhc vhcVarA = vhjVar.a();
        if (vhcVarA != null) {
            iA = a(vhcVarA.a(), vhcVarA.d(), true);
            iA2 = a(vhcVarA.a(), vhcVarA.d(), false);
        } else {
            iA = a(0, (vhi) null, true);
            iA2 = a(0, (vhi) null, false);
        }
        Message messageObtainMessage = this.k.obtainMessage();
        messageObtainMessage.what = 0;
        messageObtainMessage.arg1 = iA;
        messageObtainMessage.arg2 = iA2;
        messageObtainMessage.obj = Integer.valueOf(i);
        this.k.sendMessage(messageObtainMessage);
    }

    private int a(int i, vhi vhiVar, boolean z) {
        if (i == 0) {
            return z ? 10 : 14;
        }
        if (i == 1) {
            return z ? 8 : 16;
        }
        if (i == 2) {
            return z ? 6 : 18;
        }
        if (i != 3) {
            return c(vhiVar, z);
        }
        return z ? 4 : 20;
    }

    private int c(vhi vhiVar, boolean z) {
        if (vhiVar == null) {
            LogUtil.j("WeightEditShareActivity", "getCustomFastingOrDietHours setting is null");
            return z ? 10 : 14;
        }
        if (z) {
            return (int) (vhiVar.b() / 3600);
        }
        return (int) ((vhiVar.c() - vhiVar.b()) / 3600);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        LogUtil.d("WeightEditShareActivity", "getLastWeightData startJoinTimeStamp = ", Long.valueOf(j));
        long[] jArrE = vei.e(new Date(), 12);
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(jArrE[1], jArrE[0]);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("NULL");
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        d(j, hiAggregateOption);
    }

    private void d(final long j, HiAggregateOption hiAggregateOption) {
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightEditShareActivity.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                double dE;
                long startTime;
                double d2;
                if (njy.e(list)) {
                    LogUtil.j("WeightEditShareActivity", "getLastWeightData data is empty ");
                    WeightEditShareActivity.this.e(-1, 0.0d, 0.0d, 0.0d);
                    return;
                }
                int i3 = 0;
                while (true) {
                    dE = 0.0d;
                    if (i3 >= list.size()) {
                        startTime = 0;
                        d2 = 0.0d;
                        break;
                    }
                    HiHealthData hiHealthData = list.get(i3);
                    double d3 = hiHealthData.getDouble("bodyWeight");
                    if (d3 > 0.0d) {
                        dE = WeightEditShareActivity.this.e(hiHealthData.getInt("trackdata_deviceType"), d3);
                        double d4 = hiHealthData.getDouble(BleConstants.BODY_FAT_RATE);
                        startTime = hiHealthData.getStartTime();
                        d2 = d4;
                        break;
                    }
                    i3++;
                }
                LogUtil.d("WeightEditShareActivity", "requestHealthData latestWeight = ", Double.valueOf(dE), ", latestBodyFate = ", Double.valueOf(d2), ", lastWeightTime = ", HiDateUtil.e(startTime, "yyyy-MM-dd HH:mm:ss:SSS"));
                if (startTime == 0) {
                    LogUtil.a("WeightEditShareActivity", "requestHealthData can not find weightData");
                    WeightEditShareActivity.this.e(-1, 0.0d, 0.0d, 0.0d);
                    return;
                }
                long j2 = j;
                if (startTime > j2) {
                    WeightEditShareActivity.this.a(j2, dE, d2);
                } else {
                    LogUtil.a("WeightEditShareActivity", "requestHealthData lastWeightTime <= startJoinTimeStamp");
                    WeightEditShareActivity.this.e(-1, dE, d2, 0.0d);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                LogUtil.a("WeightEditShareActivity", "requestHealthData onResultIntent errorCode:", Integer.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, final double d2, final double d3) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("NULL");
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightEditShareActivity.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                double dE;
                if (njy.e(list)) {
                    LogUtil.j("WeightEditShareActivity", "getJoinLatestWeight data is empty ");
                    WeightEditShareActivity.this.e(-1, d2, d3, 0.0d);
                    return;
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        dE = 0.0d;
                        break;
                    }
                    HiHealthData hiHealthData = list.get(size);
                    double d4 = hiHealthData.getDouble("bodyWeight");
                    if (d4 > 0.0d) {
                        dE = WeightEditShareActivity.this.e(hiHealthData.getInt("trackdata_deviceType"), d4);
                        break;
                    }
                }
                LogUtil.d("WeightEditShareActivity", "getWeightDiffData joinLatestWeight = ", Double.valueOf(dE));
                if (dE > 0.0d) {
                    WeightEditShareActivity.this.e(0, d2, d3, dE);
                } else {
                    WeightEditShareActivity.this.e(-1, d2, d3, dE);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, double d2, double d3, double d4) {
        b bVar = this.k;
        if (bVar == null) {
            LogUtil.j("WeightEditShareActivity", "mHandler = null");
            return;
        }
        Message messageObtainMessage = bVar.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.arg1 = i;
        Bundle bundle = new Bundle();
        bundle.putDouble("latest_weight_key", d2);
        bundle.putDouble("latest_body_fate_key", d3);
        bundle.putDouble("join_latest_weight_key", d4);
        messageObtainMessage.setData(bundle);
        this.k.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double e(int i, double d2) {
        int i2 = UnitUtil.e() == 1 ? 2 : 1;
        if (dxm.a(i)) {
            LogUtil.a("WeightEditShareActivity", "isHuaweiOrHonorDataType");
            i2 = Math.round(Math.pow(10.0d, 2.0d) * UnitUtil.c(d2)) % 10 == 0 ? 1 : 2;
        }
        return UnitUtil.d(d2, i2);
    }

    private void m() {
        this.ab = (CustomTitleBar) findViewById(com.huawei.ui.main.R.id.weight_edit_share_titlebar);
        this.t = (HealthScrollView) findViewById(com.huawei.ui.main.R.id.weight_edit_share_scrollview);
        this.q = (RelativeLayout) findViewById(com.huawei.ui.main.R.id.weight_edit_share_log);
        ShareSquareLayout shareSquareLayout = (ShareSquareLayout) findViewById(com.huawei.ui.main.R.id.weight_edit_share_show);
        this.v = shareSquareLayout;
        shareSquareLayout.setBackgroundDrawable(CardConstants.d(this.h, "weight_share_background_1"));
        this.l = 0;
        this.ad = (HealthTextView) findViewById(com.huawei.ui.main.R.id.weight_edit_share_title);
        this.w = (HealthTextView) findViewById(com.huawei.ui.main.R.id.weight_edit_share_describe);
        this.j = (HealthTextView) findViewById(com.huawei.ui.main.R.id.weight_edit_share_current_weight);
        this.g = (HealthTextView) findViewById(com.huawei.ui.main.R.id.weight_edit_share_current_bmi);
        this.af = (HealthTextView) findViewById(com.huawei.ui.main.R.id.weight_edit_share_weight_change);
        this.ae = (HealthTextView) findViewById(com.huawei.ui.main.R.id.weight_edit_share_weight_change_describe);
        setViewSafeRegion(false, (LinearLayout) findViewById(com.huawei.ui.main.R.id.weight_multiple_source_choose));
        HealthScrollView healthScrollView = (HealthScrollView) findViewById(com.huawei.ui.main.R.id.weight_edit_share_scrollview);
        this.t = healthScrollView;
        healthScrollView.setOverScrollable(false);
        d();
        i();
        h();
        j();
    }

    private void d() {
        HwHealthLineChart hwHealthLineChart = (HwHealthLineChart) findViewById(com.huawei.ui.main.R.id.weight_change_line_chart);
        this.s = hwHealthLineChart;
        if (hwHealthLineChart.getRenderer() instanceof qns) {
            ((qns) this.s.getRenderer()).c(1);
        }
        this.s.disableLabelsForce();
        this.s.setTouchEnabled(false);
        this.s.getDescription().setEnabled(false);
    }

    private void e(double d2, double d3) {
        double dC = UnitUtil.c(d2);
        int i = Math.round(Math.pow(10.0d, 2.0d) * dC) % 10 == 0 ? 1 : 2;
        if (dC == 0.0d) {
            c(this.j, String.format(Locale.ENGLISH, getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_c_w), vei.e()));
        } else {
            c(this.j, String.format(Locale.ENGLISH, getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_c_w), vei.b(dC, i)));
        }
        if (ezh.g(d3)) {
            c(this.g, String.format(Locale.ENGLISH, getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_c_bmi), UnitUtil.e(d3, 1, 1)));
        } else {
            c(this.g, String.format(Locale.ENGLISH, getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_c_bmi), "-/-"));
        }
    }

    private void c(TextView textView, String str) {
        if (textView == null || TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(UnitUtil.b(this.h, "[^(\\-|\\+)?\\d+(\\.\\d+)?$]", str, com.huawei.ui.main.R.style.health_weight_edit_share_text, com.huawei.ui.main.R.style.health_weight_edit_share_value));
    }

    private void j() {
        this.f27640a = (HealthSubTabWidget) findViewById(com.huawei.ui.main.R.id.weight_source_choose_tab);
        this.z = (HealthViewPager) findViewById(com.huawei.ui.main.R.id.weight_source_choose_viewpager);
        if (LanguageUtil.ba(this.h)) {
            this.z.setRotationY(180.0f);
        }
        this.z.setOffscreenPageLimit(2);
        g();
    }

    private void g() {
        ArrayList<c> arrayList = new ArrayList(2);
        arrayList.add(new c(this.e, getResources().getString(com.huawei.ui.main.R.string.IDS_hwh_edit_share_background), 0));
        arrayList.add(new c(this.m, getResources().getString(com.huawei.ui.main.R.string.IDS_hwh_edit_share_data_mark), 1));
        this.f27640a.h();
        this.ac = new qpn(this, this.z, this.f27640a);
        this.z.addOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightEditShareActivity.3
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                WeightEditShareActivity.this.x = i;
            }
        });
        for (c cVar : arrayList) {
            WeightEditShareFragment weightEditShareFragmentA = cVar.a();
            String strE = cVar.e();
            int iD = cVar.d();
            if (weightEditShareFragmentA != null) {
                this.ac.b(this.f27640a.b(strE), weightEditShareFragmentA, this.x == iD);
            }
        }
        if (qrs.af(this.h)) {
            int iF = (int) (this.r + this.i.f() + qqp.b(this.h));
            this.z.setPadding(iF, 0, iF, 0);
            return;
        }
        this.z.setPadding(0, 0, 0, 0);
    }

    private void h() {
        if (this.e == null) {
            WeightEditShareFragment weightEditShareFragment = new WeightEditShareFragment();
            this.e = weightEditShareFragment;
            weightEditShareFragment.b(this);
            Bundle bundle = new Bundle();
            bundle.putInt("share_source_type", 0);
            this.e.setArguments(bundle);
        }
        if (this.m == null) {
            WeightEditShareFragment weightEditShareFragment2 = new WeightEditShareFragment();
            this.m = weightEditShareFragment2;
            weightEditShareFragment2.b(this);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("share_source_type", 1);
            this.m.setArguments(bundle2);
        }
    }

    private void i() {
        this.ab.setLeftButtonVisibility(0);
        this.ab.setRightButtonVisibility(0);
        this.ab.setLeftButtonDrawable(ContextCompat.getDrawable(this, com.huawei.ui.main.R.drawable.ic_health_navbar_close_black), qre.f(com.huawei.ui.main.R.string.accessibility_close));
        this.ab.setRightButtonDrawable(ContextCompat.getDrawable(this, com.huawei.ui.main.R.drawable.ic_health_nav_share_black), qre.f(com.huawei.ui.main.R.string.accessibility_share));
        this.ab.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightEditShareActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeightEditShareActivity.this.finish();
                WeightEditShareActivity.this.overridePendingTransition(0, R.anim.right_exit);
            }
        });
        this.ab.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightEditShareActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PermissionUtil.a()) {
                    WeightEditShareActivity.this.c();
                } else {
                    WeightEditShareActivity.this.o();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public void c() {
        String str;
        gxt gxtVar;
        Bitmap bitmapC = qqf.c(this.v);
        if (bitmapC == null) {
            LogUtil.j("WeightEditShareActivity", "handleRightButtonEvents share pic is null ");
            return;
        }
        int i = this.l;
        if (i >= 0) {
            String[] strArr = f27639b;
            if (i < strArr.length) {
                str = strArr[i];
            } else {
                str = "A";
            }
        } else {
            str = "A";
        }
        String str2 = String.valueOf(this.u) + this.p + this.y;
        LogUtil.a("WeightEditShareActivity", "handleRightButtonEvents selectBgModel = ", str, ", selectDataModel = ", str2);
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("shareBgModel", str);
        map.put("shareDataModel", str2);
        lmf.d().c(this.h, AnalyticsValue.WEIGHT_EDIT_SHARE_ICON_CLICKED_2060089.value(), map, 0);
        Bitmap bitmapE = qqf.e(bitmapC, 0, a(), bitmapC.getHeight());
        LogUtil.a("WeightEditShareActivity", "handleRightButtonEvents screenCut: ", bitmapE);
        if (bitmapE == null) {
            LogUtil.j("WeightEditShareActivity", "handleRightButtonEvents screenCut is null!");
            return;
        }
        LogUtil.a("WeightEditShareActivity", "handleRightButtonEvents screenCut.getByteCount(): ", Integer.valueOf(bitmapE.getByteCount()));
        if (bitmapE.getByteCount() > 1048576) {
            gxtVar = new gxt(4);
            String str3 = lrp.g + "EditShareActivity_Share.jpg";
            qqf.b(bitmapE, str3);
            gxtVar.c(str3);
        } else {
            gxtVar = new gxt(1);
            gxtVar.d(bitmapE);
        }
        gxtVar.d("15");
        gxtVar.f(false);
        gxtVar.e(false);
        gxtVar.j(false);
        this.aa.exeShare(gxtVar, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("WeightEditShareActivity", "permission not granted, requesting storage permission");
        PermissionUtil.d(this, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightEditShareActivity.7
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("WeightEditShareActivity", "storage permission onGranted");
                WeightEditShareActivity.this.c();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("WeightEditShareActivity", "storage permission onDenied");
                super.onDenied(str);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("WeightEditShareActivity", "storage permission onForeverDenied");
                qrs.b(WeightEditShareActivity.this, permissionType);
            }
        });
    }

    private Bitmap a() {
        this.q.setVisibility(0);
        LogUtil.a("WeightEditShareActivity", "getWatermarkBitmap mWaterMarkLayout");
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(this.q.getMeasuredWidth(), this.q.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            this.q.draw(canvas);
            canvas.save();
            canvas.restore();
        } catch (IllegalArgumentException | IllegalStateException | OutOfMemoryError unused) {
            LogUtil.e("WeightEditShareActivity", "createBitmap failed!");
        }
        this.q.setVisibility(4);
        return bitmapCreateBitmap;
    }

    @Override // com.huawei.ui.main.stories.health.interactors.healthdata.WeightShareEditListener
    public void refreshWeightShareBackground(int i) {
        LogUtil.a("WeightEditShareActivity", "refreshWeightShareBackground bitmapId = ", Integer.valueOf(i));
        ShareSquareLayout shareSquareLayout = this.v;
        if (shareSquareLayout != null) {
            String[] strArr = d;
            if (i <= strArr.length && i >= 0) {
                if (i != this.l) {
                    this.l = i;
                    shareSquareLayout.setBackgroundDrawable(CardConstants.d(this.h, strArr[i]));
                    return;
                }
                return;
            }
        }
        LogUtil.j("WeightEditShareActivity", "index out of length");
    }

    @Override // com.huawei.ui.main.stories.health.interactors.healthdata.WeightShareEditListener
    public void refreshWeightShareData(int i, boolean z) {
        LogUtil.a("WeightEditShareActivity", "refreshWeightShareData index = ", Integer.valueOf(i), ", needShow = ", Boolean.valueOf(z));
        if (i == 0) {
            this.u = z ? 1 : 0;
            this.j.setVisibility(z ? 0 : 8);
            return;
        }
        if (i == 1) {
            this.p = z ? 1 : 0;
            this.g.setVisibility(z ? 0 : 8);
            return;
        }
        if (i != 2) {
            return;
        }
        this.y = z ? 1 : 0;
        if (this.n == 0) {
            this.af.setVisibility(z ? 0 : 8);
            this.s.setVisibility(z ? 0 : 8);
            this.ae.setVisibility(8);
        } else {
            this.ae.setVisibility(z ? 0 : 8);
            this.af.setVisibility(8);
            this.s.setVisibility(8);
        }
    }

    @Override // com.huawei.ui.main.stories.health.interactors.healthdata.WeightShareEditListener
    public void gotoCamera() {
        LogUtil.a("WeightEditShareActivity", "gotoCamera");
        l();
    }

    private void l() {
        Object systemService = this.h.getSystemService("layout_inflater");
        LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
        if (layoutInflater == null) {
            LogUtil.j("WeightEditShareActivity", "showCameraDialog:inflater is null");
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hw_health_edit_share_camera_dialog, (ViewGroup) null);
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.h).d(viewInflate).d();
        this.ah = customViewDialogD;
        customViewDialogD.show();
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_edit_share_caerma)).setOnClickListener(new View.OnClickListener() { // from class: url
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_edit_share_gallery)).setOnClickListener(new View.OnClickListener() { // from class: urk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        PermissionUtil.d(this.h, PermissionUtil.PermissionType.CAMERA, new CustomPermissionAction(this.h) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightEditShareActivity.9
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                WeightEditShareActivity.this.n();
            }
        });
        CustomViewDialog customViewDialog = this.ah;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    public /* synthetic */ void c(View view) {
        e();
        CustomViewDialog customViewDialog = this.ah;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.aa.takePhoto((Activity) this.h);
    }

    private void e() {
        qrs.c((Activity) this.h, 2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 4 && intent == null) {
            LogUtil.j("WeightEditShareActivity", "data == null and it's not camera callback");
            return;
        }
        if (i2 == -1) {
            if (i == 2) {
                b(intent);
                return;
            }
            if (i == 3) {
                d(intent);
                return;
            }
            if (i != 4) {
                return;
            }
            Context context = this.h;
            if (!(context instanceof Activity)) {
                LogUtil.j("WeightEditShareActivity", "mContext not activity");
            } else {
                this.aa.startCrop((Activity) context);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.k;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
        }
    }

    private void b(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: urr
            @Override // java.lang.Runnable
            public final void run() {
                this.f50492a.c(intent);
            }
        });
    }

    public /* synthetic */ void c(Intent intent) {
        this.aa.startCrop(this, intent);
    }

    private void d(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: urp
            @Override // java.lang.Runnable
            public final void run() {
                this.f50489b.e(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(Intent intent) {
        LogUtil.a("WeightEditShareActivity", "dealCropResult");
        String stringExtra = intent.getStringExtra("bitmap");
        if (stringExtra == null) {
            LogUtil.e("WeightEditShareActivity", "dealCropResult:bitmapPath from intent is null!");
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmapC = qqf.c(stringExtra, options);
        this.f27641c = bitmapC;
        if (bitmapC != null) {
            c(bitmapC);
            d(stringExtra);
        } else {
            LogUtil.j("WeightEditShareActivity", "dealCropResult:bitmap is null");
        }
    }

    private void c(final Bitmap bitmap) {
        LogUtil.a("WeightEditShareActivity", "refreshBackgroundOnUi");
        runOnUiThread(new Runnable() { // from class: urq
            @Override // java.lang.Runnable
            public final void run() {
                this.f50490b.e(bitmap);
            }
        });
    }

    public /* synthetic */ void e(Bitmap bitmap) {
        WeightEditShareFragment weightEditShareFragment = this.e;
        if (weightEditShareFragment != null) {
            weightEditShareFragment.c();
            this.l = -1;
        }
        if (this.v != null) {
            this.v.setBackground(new BitmapDrawable(this.h.getResources(), bitmap));
        }
    }

    private void d(String str) {
        FileUtils.b(new File(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, int i3) {
        Context context = this.h;
        if (context == null || this.ad == null || this.w == null) {
            return;
        }
        Resources resources = context.getResources();
        double d2 = i2;
        String quantityString = resources.getQuantityString(com.huawei.ui.main.R.plurals.IDS_wl_food_hour_fasting, vdo.b(d2), UnitUtil.e(d2, 1, 0));
        double d3 = i;
        this.ad.setText(String.format(Locale.ENGLISH, resources.getString(com.huawei.ui.main.R.string.IDS_wl_food_share_mode), String.format(Locale.ENGLISH, resources.getString(com.huawei.ui.main.R.string.IDS_wl_food_hour_f_or_diet), quantityString, resources.getQuantityString(com.huawei.ui.main.R.plurals.IDS_wl_food_hour_eating, vdo.b(d3), UnitUtil.e(d3, 1, 0)))));
        this.ad.setVisibility(0);
        this.w.setText(resources.getQuantityString(com.huawei.ui.main.R.plurals.IDS_wl_food_share_lasted_days, i3, Integer.valueOf(i3)));
        this.w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, double d2, double d3, double d4) {
        LogUtil.d("WeightEditShareActivity", "setBottomView dataStatus = ", Integer.valueOf(i), ", joinLastedWeight = ", Double.valueOf(d4));
        e(d2, d3);
        this.n = i;
        if (i == -1) {
            int iE = UnitUtil.e();
            if (iE == 1) {
                this.ae.setText(getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_w_catty));
                return;
            } else if (iE == 3) {
                this.ae.setText(getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_w_pounds));
                return;
            } else {
                this.ae.setText(getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_w_c_default));
                return;
            }
        }
        if (d4 > d2) {
            double d5 = d2 - d4;
            if (Math.abs(d5) > 0.1d) {
                b(d2, d4);
                c(this.af, String.format(Locale.ENGLISH, getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_w_c), vei.b(UnitUtil.c(UnitUtil.d(d5, 2)), 1)));
                return;
            }
        }
        LogUtil.a("WeightEditShareActivity", "weight is NOT CHANGE");
        this.n = -2;
        this.ae.setText(getResources().getString(com.huawei.ui.main.R.string.IDS_wl_food_share_tips_keep));
    }

    private void b(double d2, double d3) {
        ArrayList arrayList = new ArrayList();
        float f = ((float) d2) - 5.0f;
        float f2 = ((float) d3) + 5.0f;
        d(f, f2);
        arrayList.add(new HwHealthBaseEntry(-1000.0f, f2));
        arrayList.add(new HwHealthBaseEntry(10.0f, f2));
        arrayList.add(new HwHealthBaseEntry(100.0f, f));
        d(arrayList);
    }

    private void d(List<HwHealthBaseEntry> list) {
        if (this.s == null) {
            LogUtil.j("WeightEditShareActivity", "initLineDataSet mLineChart is null");
            return;
        }
        LogUtil.a("WeightEditShareActivity", "initLineDataSet valueList size is ", Integer.valueOf(list.size()));
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.h, list, "line brief", "line label", "line unit");
        hwHealthLineDataSet.setColor(Color.parseColor("#FFFFFFFF"));
        hwHealthLineDataSet.a(Color.parseColor("#66FFFFFF"), Color.parseColor("#00ffffff"), true);
        hwHealthLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hwHealthLineDataSet);
        this.s.setData(new qnt(arrayList));
        this.s.refresh();
        this.s.setVisibility(8);
    }

    private void d(float f, float f2) {
        HwHealthLineChart hwHealthLineChart = this.s;
        if (hwHealthLineChart == null) {
            LogUtil.j("WeightEditShareActivity", "initAxis mLineChart is null");
            return;
        }
        XAxis xAxis = hwHealthLineChart.getXAxis();
        xAxis.setEnabled(false);
        xAxis.setAxisMinimum(-4.0f);
        xAxis.setAxisMaximum(104.0f);
        HwHealthYAxis axisFirstParty = this.s.getAxisFirstParty();
        axisFirstParty.setDrawLabels(false);
        axisFirstParty.setDrawAxisLine(false);
        axisFirstParty.setDrawGridLines(false);
        axisFirstParty.setAxisMinimum(f - 100.0f);
        axisFirstParty.setAxisMaximum(f2 + 100.0f);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27651a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeightEditShareFragment f27652c;
        private String d;

        c(WeightEditShareFragment weightEditShareFragment, String str, int i) {
            this.f27652c = weightEditShareFragment;
            this.d = str;
            this.f27651a = i;
        }

        public WeightEditShareFragment a() {
            return this.f27652c;
        }

        public String e() {
            return this.d;
        }

        int d() {
            return this.f27651a;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b extends BaseHandler<WeightEditShareActivity> {
        b(WeightEditShareActivity weightEditShareActivity) {
            super(weightEditShareActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeightEditShareActivity weightEditShareActivity, Message message) {
            int iIntValue;
            double d;
            double d2;
            double d3;
            int i = message.what;
            if (i == 0) {
                int i2 = message.arg1;
                int i3 = message.arg2;
                if (message.obj instanceof Integer) {
                    iIntValue = ((Integer) message.obj).intValue();
                } else {
                    LogUtil.j("WeightEditShareActivity", "message.obj is not Integer");
                    iIntValue = 0;
                }
                weightEditShareActivity.a(i2, i3, iIntValue);
                return;
            }
            if (i != 1) {
                return;
            }
            LogUtil.a("WeightEditShareActivity", "handleMessage request weight");
            int i4 = message.arg1;
            Bundle data = message.getData();
            if (data != null) {
                double d4 = data.getDouble("latest_weight_key");
                double d5 = data.getDouble("latest_body_fate_key");
                d3 = data.getDouble("join_latest_weight_key");
                d2 = d5;
                d = d4;
            } else {
                d = 0.0d;
                d2 = 0.0d;
                d3 = 0.0d;
            }
            weightEditShareActivity.d(i4, d, d2, d3);
        }
    }
}
