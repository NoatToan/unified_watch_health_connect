package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.ScrollScaleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.HealthDataStyleA02Adapter;
import com.huawei.ui.main.stories.health.util.BaseHealthClickListener;
import com.huawei.ui.main.stories.health.views.healthdata.MarketingView;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDetailActivity;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.dso;
import defpackage.enw;
import defpackage.eny;
import defpackage.etn;
import defpackage.exz;
import defpackage.ino;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.oru;
import defpackage.qop;
import defpackage.qqj;
import defpackage.qra;
import defpackage.qre;
import defpackage.qrk;
import defpackage.uwf;
import defpackage.vei;
import defpackage.vlt;
import defpackage.vng;
import defpackage.wud;
import health.compact.a.CommonUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class InputWeightActivity extends BaseActivity implements View.OnClickListener, BaseHealthClickListener {
    private ImageView aa;
    private long ad;
    private boolean ae;
    private long af;
    private MarketingView ag;
    private boolean ah;
    private ImageView ai;
    private HealthTextView aj;
    private HealthTextView ak;
    private View al;
    private LinearLayoutManager am;
    private View an;
    private int ao;
    private int aq;
    private HealthTextView ar;
    private HealthButton as;
    private c at;
    private HealthTextView au;
    private LinearLayout av;
    private HealthTextView aw;
    private CustomTitleBar ax;
    private HealthSubHeader ay;
    private ScrollScaleView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27527b;
    private int ba;
    private String bc;
    private LinearLayout f;
    private ScrollScaleView h;
    private ImageView i;
    private HealthButton j;
    private String k;
    private HealthTextView l;
    private LinearLayout m;
    private int n;
    private Context o;
    private HealthDataStyleA02Adapter p;
    private a r;
    private int t;
    private HealthSubHeader v;
    private enw w;
    private uwf x;
    private String y;
    private int z;
    private int ap = 0;
    private double bb = 0.0d;
    private double g = 1.0d;
    private double ab = 0.0d;
    private double ac = 1.0d;
    private long q = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27528c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27526a = true;
    private boolean d = false;
    private boolean e = false;
    private Handler u = new e(this);
    private long s = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements WeightInsertStatusCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<e> f27541b;
        e d;

        d(e eVar) {
            WeakReference<e> weakReference = new WeakReference<>(eVar);
            this.f27541b = weakReference;
            this.d = weakReference.get();
        }

        @Override // com.huawei.health.device.callback.WeightInsertStatusCallback
        public void isSuccess(boolean z) {
            if (this.d != null) {
                LogUtil.a("UIHLH_InputWeightActivity", "InsertWeightResponseCallback,insert successful ");
                this.d.sendMessage(this.d.obtainMessage(3, 0, 0));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.health_data_inputweight);
        this.o = this;
        this.r = new a(this);
        this.at = new c(this);
        this.w = new enw(10006);
        h();
        g();
        b(UnitUtil.b(this.ab, 1), false);
        e(this.ac, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(double d2, boolean z) {
        int i;
        int iE = UnitUtil.e();
        if (iE == 1) {
            i = R.plurals.IDS_health_catty;
        } else if (iE == 3) {
            i = R.plurals.IDS_lb_string;
        } else {
            i = R.plurals.IDS_kg_string;
        }
        String strE = qre.e(i, UnitUtil.b(d2, Locale.getDefault()), UnitUtil.e(d2, 1, 1));
        lrd.d(this.an, strE, false);
        lrd.d(this.az, qre.a(R.string.accessibility_input_weight, strE), false);
        if (z) {
            lrd.c(this.az, strE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(double d2, boolean z) {
        String strE = UnitUtil.e(d2, 2, 1);
        lrd.d(this.al, strE, false);
        lrd.d(this.h, qre.a(R.string.accessibility_input_weight, strE), false);
        if (z) {
            lrd.c(this.h, strE);
        }
    }

    private void g() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("UIHLH_InputWeightActivity", "intent is null");
            return;
        }
        this.bb = CommonUtils.a(intent.getStringExtra("weight"));
        this.g = CommonUtils.a(intent.getStringExtra("bodyFat"));
        this.q = intent.getLongExtra("deleteTime", -1L);
        this.s = intent.getLongExtra("deleteEndTime", -1L);
        this.n = intent.getIntExtra("clientId", 0);
        this.y = intent.getStringExtra("from");
        double d2 = this.bb;
        if (d2 > 0.0d && d2 < 10.0d) {
            this.bb = 10.0d;
        }
        this.ab = this.bb;
        this.ac = this.g;
        this.f27528c = intent.getBooleanExtra("isShowBodyFat", false);
        this.f27526a = intent.getBooleanExtra("isShowInput", false);
        this.ae = intent.getBooleanExtra("isFromPlan", false);
        this.bc = intent.getStringExtra(JsbMapKeyNames.H5_USER_ID);
        this.ah = intent.getIntExtra("source", 0) == 7;
        j();
        if (this.f27528c) {
            this.f.setVisibility(0);
            this.i.setBackgroundResource(R.drawable.ic_list_delete);
        } else {
            if (!this.f27526a) {
                this.v.setVisibility(4);
            }
            this.f.setVisibility(8);
            this.i.setBackgroundResource(R.drawable.ic_list_added);
        }
        double d3 = this.bb;
        if (d3 <= 0.0d) {
            ReleaseLogUtil.d("UIHLH_InputWeightActivity", "initData mWeight ", Double.valueOf(d3));
            this.bb = 65.0d;
        }
        if (Math.abs(this.g) < 0.5d) {
            ReleaseLogUtil.d("UIHLH_InputWeightActivity", "initData mBodyFat ", Double.valueOf(this.g));
            this.g = 20.0d;
        }
        f();
        i();
    }

    private void f() {
        int iDoubleValue = (int) ((new BigDecimal(Double.toString(this.g)).setScale(1, RoundingMode.HALF_UP).doubleValue() - 1.0d) * 10.0d);
        LogUtil.d("UIHLH_InputWeightActivity", "bodyfatposition == ", Integer.valueOf(iDoubleValue));
        this.az.setSelectedPosition(vng.e(this.bb));
        this.h.setSelectedPosition(iDoubleValue);
    }

    private void i() {
        long j = this.q;
        if (j != -1) {
            this.af = j;
        } else {
            this.af = System.currentTimeMillis();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.af);
        this.ba = calendar.get(1);
        this.aq = calendar.get(2);
        this.t = calendar.get(5);
        this.z = calendar.get(11);
        this.ao = calendar.get(12);
        uwf uwfVarD = uwf.d();
        this.x = uwfVarD;
        uwfVarD.b();
        long j2 = this.af;
        this.ad = j2;
        this.aw.setText(DateFormatUtil.a(j2, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD));
        this.au.setText(qrk.a(this.o, this.af, 1));
        this.ak.setText(UnitUtil.e(UnitUtil.b(this.bb, 1), 1, 1));
        c(this.ar, UnitUtil.c(this.bb));
        double d2 = this.g;
        if (d2 > 0.0d) {
            String strE = UnitUtil.e(d2, 1, 1);
            this.k = strE;
            this.aj.setText(strE);
        }
        this.p = new HealthDataStyleA02Adapter(0, this.f27528c);
        this.v.setLayoutManager(this.am);
        this.p.d(this);
        this.v.setAdapter(this.p);
        this.v.setSubHeaderBackgroundColor(getColor(R.color.colorSubBackground));
        this.ay.setSubHeaderBackgroundColor(getColor(R.color.colorSubBackground));
        this.ay.setHeadTitleTextColor(getColor(R.color.textColorPrimary));
    }

    private void j() {
        if (this.f27526a) {
            this.az.setNoScroll(true);
            this.h.setNoScroll(true);
            this.ax.setRightButtonVisibility(0);
            if (LanguageUtil.ba(this.o)) {
                this.ax.setLeftButtonDrawable(getResources().getDrawable(R.mipmap.ic_health_rtl_back_black), qre.f(R.string.accessibility_go_back));
            } else {
                this.ax.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
            }
            this.ax.setRightSoftkeyVisibility(8);
            this.ax.setRightButtonVisibility(8);
            this.ax.setTitleText(this.o.getString(R.string.IDS_hw_health_show_healthdata_input));
            this.as.setVisibility(0);
            this.aa.setVisibility(0);
            this.ai.setVisibility(0);
            this.j.setVisibility(0);
            if (EnvironmentInfo.m()) {
                this.j.setVisibility(8);
                return;
            }
            return;
        }
        this.az.setNoScroll(false);
        this.h.setNoScroll(false);
        if (LanguageUtil.ba(this.o)) {
            this.ax.setLeftButtonDrawable(getResources().getDrawable(R.mipmap.ic_health_rtl_back_black), qre.f(R.string.accessibility_go_back));
        } else {
            this.ax.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
        }
        this.ax.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
        this.ax.setRightSoftkeyVisibility(0);
        this.ax.setRightButtonVisibility(0);
        this.ax.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.ax.setTitleText(this.o.getString(R.string.IDS_hw_base_health_data_history_record));
        this.as.setVisibility(8);
        this.aa.setVisibility(8);
        this.ai.setVisibility(8);
        this.j.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthTextView healthTextView, double d2) {
        healthTextView.setText(vei.e(d2, false));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.m) {
            if (this.f27526a) {
                t();
                return;
            } else {
                if (this.d) {
                    t();
                    return;
                }
                return;
            }
        }
        if (view == this.av) {
            if (this.f27526a) {
                w();
                return;
            } else {
                if (this.d) {
                    w();
                    return;
                }
                return;
            }
        }
        ImageView imageView = this.i;
        if (view == imageView) {
            if (this.f27528c) {
                imageView.setBackgroundResource(R.drawable.ic_list_added);
                this.i.setContentDescription(this.o.getString(R.string.IDS_hw_health_talkback_add_bodyfat_rate));
                this.f.setVisibility(8);
                this.f27528c = false;
                return;
            }
            imageView.setContentDescription(this.o.getString(R.string.IDS_hw_health_talkback_cancel_add_bodyfat_rate));
            this.i.setBackgroundResource(R.drawable.ic_list_delete);
            this.f.setVisibility(0);
            this.f27528c = true;
            return;
        }
        HealthButton healthButton = this.as;
        if (view == healthButton) {
            this.ap = 1;
            healthButton.setClickable(false);
            this.as.setBackgroundResource(R.drawable.weight_button_background_disable);
            k();
            return;
        }
        if (view == this.j) {
            vlt.b();
            etn.a(this.o, "HDK_WEIGHT");
        }
    }

    private void k() {
        if (this.x != null) {
            if (!this.f27528c) {
                this.g = 0.0d;
            }
            if (System.currentTimeMillis() < this.af) {
                Toast.makeText(this.o, getString(R.string.IDS_hw_health_show_healthdata_timeerror), 0).show();
                if (this.ap == 0) {
                    y();
                }
                r();
                return;
            }
            n();
            eny.a().h();
            if (this.q != -1) {
                ArrayList arrayList = new ArrayList();
                dnb dnbVar = new dnb();
                dnbVar.e(this.q);
                dnbVar.d(this.s);
                arrayList.add(dnbVar);
                WeightDataManager.INSTANCE.removeMapData(MultiUsersManager.INSTANCE.getCurrentUser().i(), arrayList);
                this.x.a(this.o.getApplicationContext(), this.q, this.s, this.r);
                LogUtil.a("UIHLH_InputWeightActivity", "delete data: ", Long.toString(this.q));
                return;
            }
            o();
        }
    }

    private void n() {
        HashMap map = new HashMap();
        map.put("click", 1);
        Intent intent = getIntent();
        int intExtra = intent == null ? 0 : intent.getIntExtra("BITag", 0);
        if (intExtra == 1) {
            map.put("type", "1");
        } else {
            map.put("type", "2");
        }
        if ("/PluginHealthModel/HealthModelActivity".equals(this.y)) {
            map.put("from", 2);
        } else if ("/todoTask/TodoListActivity".equals(this.y)) {
            map.put("from", 3);
        } else if ("/PluginHealthModel/IntelligentPlanView".equals(this.y)) {
            map.put("from", 5);
        } else if (this.ah) {
            map.put("from", 7);
        } else {
            map.put("from", 1);
        }
        if (this.g == 0.0d) {
            map.put("dataType", new String[]{"weight"});
        } else {
            map.put("dataType", new String[]{"weight", "fatRate"});
        }
        HashMap map2 = new HashMap();
        if (intExtra == 1) {
            map2.put("type", "1");
        } else {
            map2.put("type", "2");
        }
        oru.a(this.o).c(this.o.getApplicationContext(), String.valueOf(KakaConstants.TASK_ENTER_TODAY_WEIGHT), map2);
        lmf.d().c(this.o.getApplicationContext(), AnalyticsValue.HEALTH_HEALTH_WEIGHT_INPUT_2030017.value(), map, 0);
        if (this.ae) {
            HashMap map3 = new HashMap(2);
            map3.put("click", 1);
            map3.put("type", 2);
            lmf.d().c(this.o, AnalyticsValue.INT_PLAN_1120034.value(), map3, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f27527b = false;
        final dso dsoVar = new dso();
        dsoVar.setBodyFatRat((float) this.g);
        dsoVar.setWeight((float) this.bb);
        dsoVar.setStartTime(this.af);
        dsoVar.d(true);
        dsoVar.setEndTime(this.af);
        this.w.e(new d((e) this.u));
        if ("/PluginHealthModel/HealthModelActivity".equals(this.y) || "/todoTask/TodoListActivity".equals(this.y) || "/HWUserProfileMgr/UserInfoActivity".equals(this.y)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: upt
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(dsoVar);
                }
            });
        } else {
            MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback<dnj>() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.3
                @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i, dnj dnjVar) {
                    if (dnjVar != null && i == 0) {
                        InputWeightActivity.this.w.b(dnjVar);
                        InputWeightActivity.this.w.onDataChanged(vng.a(), dsoVar);
                    } else {
                        LogUtil.j("UIHLH_InputWeightActivity", "setUserInfo : currentUser is null return");
                        InputWeightActivity.this.d();
                        InputWeightActivity.this.r();
                    }
                }
            });
        }
    }

    public /* synthetic */ void d(dso dsoVar) {
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser == null) {
            LogUtil.j("UIHLH_InputWeightActivity", "insert mainUser is null");
            d();
            r();
        } else {
            this.w.b(mainUser);
            this.w.onDataChanged(vng.a(), dsoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        runOnUiThread(new Runnable() { // from class: ups
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    public /* synthetic */ void c() {
        qra.c(this.o, false, null, getColor(R.color.light_fasting_body_state_bg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.as.setClickable(true);
        this.as.setBackgroundResource(R.drawable.weight_button_background);
    }

    private void t() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.af);
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(this, new HealthDatePickerDialog.DateSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.2
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public void onDateSelected(int i, int i2, int i3) {
                InputWeightActivity.this.ba = i;
                InputWeightActivity.this.aq = i2;
                InputWeightActivity.this.t = i3;
                calendar.set(InputWeightActivity.this.ba, InputWeightActivity.this.aq, InputWeightActivity.this.t);
                calendar.set(11, InputWeightActivity.this.z);
                calendar.set(12, InputWeightActivity.this.ao);
                InputWeightActivity.this.af = calendar.getTimeInMillis();
                InputWeightActivity.this.aw.setText(DateFormatUtil.a(InputWeightActivity.this.af, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD));
                calendar.clear();
            }
        }, new GregorianCalendar(this.ba, this.aq, this.t));
        Calendar calendar2 = Calendar.getInstance();
        healthDatePickerDialog.a(new GregorianCalendar(2014, 0, 1), new GregorianCalendar(calendar2.get(1), calendar2.get(2), calendar2.get(5)));
        healthDatePickerDialog.b(true);
        healthDatePickerDialog.d(ContextCompat.getColor(this, R.color.weight_primary_color));
        healthDatePickerDialog.show();
    }

    private void w() {
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog(this, new HealthTimePickerDialog.TimeSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.4
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i, int i2) {
                LogUtil.d("UIHLH_InputWeightActivity", "hour=", Integer.valueOf(i), ", minute=", Integer.valueOf(i2));
                InputWeightActivity.this.z = i;
                InputWeightActivity.this.ao = i2;
                Calendar calendar = Calendar.getInstance();
                calendar.set(1, InputWeightActivity.this.ba);
                calendar.set(2, InputWeightActivity.this.aq);
                calendar.set(5, InputWeightActivity.this.t);
                calendar.set(11, InputWeightActivity.this.z);
                calendar.set(12, InputWeightActivity.this.ao);
                InputWeightActivity.this.af = calendar.getTimeInMillis();
                InputWeightActivity.this.au.setText(qrk.a(InputWeightActivity.this.o, InputWeightActivity.this.af, 1));
                calendar.clear();
            }
        });
        healthTimePickerDialog.e(getString(R.string.IDS_hw_health_show_healthdata_set_time));
        healthTimePickerDialog.a().setSpinnersSelectorPaintColor(ContextCompat.getColor(this, R.color.weight_primary_color));
        healthTimePickerDialog.e(ContextCompat.getColor(this, R.color.weight_primary_color));
        healthTimePickerDialog.show();
    }

    private void h() {
        this.v = (HealthSubHeader) findViewById(R.id.fat_hwSubHeader);
        this.ay = (HealthSubHeader) findViewById(R.id.weight_hwSubHeader);
        this.am = new LinearLayoutManager(this.o);
        this.ax = (CustomTitleBar) findViewById(R.id.health_healthdata_inputweight_title_layout);
        this.m = (LinearLayout) findViewById(R.id.hw_show_health_data_inputweight_top_datelayout);
        this.av = (LinearLayout) findViewById(R.id.hw_show_health_data_inputweight_top_timelayout);
        this.f = (LinearLayout) findViewById(R.id.hw_show_health_data_inputweight_mid_bodyfatlayout_desc);
        this.i = (ImageView) findViewById(R.id.hw_show_health_data_inputweight_mid_add_bodyfat_tv);
        this.aa = (ImageView) findViewById(R.id.hw_health_input_weight_date);
        this.ai = (ImageView) findViewById(R.id.hw_health_input_weight_time);
        this.ag = (MarketingView) findViewById(R.id.input_weight_marketing);
        if (LanguageUtil.ba(this.o)) {
            this.aa.setImageResource(R.drawable.common_ui_arrow_left);
            this.ai.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.aa.setImageResource(R.drawable.common_ui_arrow_right);
            this.ai.setImageResource(R.drawable.common_ui_arrow_right);
        }
        this.aw = (HealthTextView) findViewById(R.id.hw_show_health_data_inputweight_top_date);
        this.au = (HealthTextView) findViewById(R.id.hw_show_health_data_inputweight_top_time);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.hw_show_health_data_inputweight_bady_fat_rata_text);
        this.l = healthTextView;
        healthTextView.setText(getString(R.string.IDS_hw_health_show_healthdata_bodyfat_rate).toUpperCase(Locale.ENGLISH));
        this.an = findViewById(R.id.input_weight_mid_weight_layout);
        this.ak = (HealthTextView) findViewById(R.id.hw_show_health_data_inputweight_mid_weight);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.hw_show_health_data_inputweight_mid_weight_unit);
        this.ar = healthTextView2;
        wud.e(healthTextView2);
        this.al = findViewById(R.id.input_weight_mid_body_fat_layout);
        this.aj = (HealthTextView) findViewById(R.id.hw_show_health_data_inputweight_mid_bodyfat);
        this.j = (HealthButton) findViewById(R.id.hw_show_health_data_inputweight_bind_device);
        HealthButton healthButton = (HealthButton) findViewById(R.id.hw_show_health_data_inputweight_confirm);
        this.as = healthButton;
        healthButton.setText(getString(R.string.IDS_hw_health_show_healthdata_confirm).toUpperCase(Locale.ENGLISH));
        l();
        b();
        this.m.setOnClickListener(this);
        this.av.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.as.setOnClickListener(this);
        this.j.setOnClickListener(this);
        q();
        MarketingView marketingView = this.ag;
        if (marketingView != null) {
            marketingView.b(4151);
        }
        View viewFindViewById = findViewById(R.id.hw_show_health_data_input_weight_rl);
        cancelAdaptRingRegion();
        setViewSafeRegion(false, viewFindViewById);
    }

    private void q() {
        this.ax.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InputWeightActivity.this.a();
            }
        });
        this.ax.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InputWeightActivity.this.ap = 0;
                InputWeightActivity.this.y();
            }
        });
        this.ax.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InputWeightActivity.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.ap = 0;
        if (this.d) {
            if (LanguageUtil.ba(this.o)) {
                this.ax.setLeftButtonDrawable(getResources().getDrawable(R.mipmap.ic_health_rtl_back_black), qre.f(R.string.accessibility_go_back));
            } else {
                this.ax.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
            }
            this.az.setNoScroll(false);
            this.h.setNoScroll(false);
            this.aa.setVisibility(8);
            this.ai.setVisibility(8);
            this.j.setVisibility(4);
            if (this.f27526a) {
                this.ax.setRightSoftkeyVisibility(8);
                this.ax.setRightButtonVisibility(8);
            } else {
                this.ax.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
                this.ax.setRightSoftkeyVisibility(0);
                this.ax.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
                this.ax.setRightButtonVisibility(0);
            }
            if (this.f27528c) {
                this.v.setVisibility(0);
            } else {
                this.v.setVisibility(4);
            }
            this.d = false;
            k();
            return;
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.d) {
            x();
            this.aa.setVisibility(8);
            this.ai.setVisibility(8);
            this.j.setVisibility(4);
            this.az.setNoScroll(false);
            this.h.setNoScroll(false);
            if (this.f27528c) {
                this.v.setVisibility(0);
            } else {
                this.v.setVisibility(4);
            }
            this.d = false;
            v();
            u();
            this.aw.setText(DateFormatUtil.a(this.ad, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD));
            this.au.setText(qrk.a(this.o, this.ad, 1));
            return;
        }
        this.d = true;
        setResult(0);
        if (this.ah) {
            vei.d((Activity) this, false);
        }
        finish();
    }

    private void v() {
        double dC = UnitUtil.c(this.ab);
        this.ak.setText(UnitUtil.e(dC, 1, 1));
        c(this.ar, UnitUtil.c(this.ab));
        double d2 = this.ac;
        if (d2 > 0.0d) {
            this.aj.setText(UnitUtil.e(d2, 2, 1));
            e(this.ac, false);
        } else {
            this.f27528c = false;
            LogUtil.d("UIHLH_InputWeightActivity", "mBodyFatLayout.getVisibility() : ", Integer.valueOf(this.f.getVisibility()));
            if (this.f.getVisibility() == 0) {
                this.e = true;
            }
            this.f.setVisibility(8);
            if (!this.f27526a) {
                this.v.setVisibility(4);
            }
        }
        b(dC, false);
    }

    private void u() {
        if (Math.abs(this.ab) < 0.5d) {
            this.ab = 20.0d;
        }
        this.az.setSelectedPosition(vng.e(this.ab));
        this.h.setSelectedPosition((int) ((new BigDecimal(Double.toString(this.ac)).setScale(1, RoundingMode.HALF_UP).doubleValue() - 1.0d) * 10.0d));
    }

    private void x() {
        if (LanguageUtil.ba(this.o)) {
            this.ax.setLeftButtonDrawable(getResources().getDrawable(R.mipmap.ic_health_rtl_back_black), qre.f(R.string.accessibility_go_back));
        } else {
            this.ax.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
        }
        if (this.f27526a) {
            this.ax.setRightSoftkeyVisibility(8);
            this.ax.setRightButtonVisibility(8);
        } else {
            this.ax.setRightSoftkeyVisibility(0);
            this.ax.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
            this.ax.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        }
    }

    private void b() {
        int iD = (int) UnitUtil.d(exz.h()[1], 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= iD; i++) {
            arrayList.add(UnitUtil.e(i, 1, 0));
        }
        ScrollScaleView scrollScaleView = (ScrollScaleView) findViewById(R.id.health_healthdata_imputweight_bodyfat_scale);
        this.h = scrollScaleView;
        scrollScaleView.setData(arrayList, 10, 40);
        this.h.setCustomStartColor(getColor(R.color.weight_primary_color));
        this.h.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.6
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public void onSelected(List<String> list, int i2) {
                BigDecimal scale = new BigDecimal((((double) i2) * 0.1d) + 1.0d).setScale(1, 4);
                InputWeightActivity.this.g = scale.doubleValue();
                if (InputWeightActivity.this.g > 0.0d) {
                    InputWeightActivity inputWeightActivity = InputWeightActivity.this;
                    inputWeightActivity.k = UnitUtil.e(inputWeightActivity.g, 1, 1);
                    InputWeightActivity.this.aj.setText(InputWeightActivity.this.k);
                    InputWeightActivity inputWeightActivity2 = InputWeightActivity.this;
                    inputWeightActivity2.e(inputWeightActivity2.g, true);
                }
            }
        });
    }

    private void l() {
        ArrayList<String> arrayListC = vng.c();
        ScrollScaleView scrollScaleView = (ScrollScaleView) findViewById(R.id.health_healthdata_imputweight_weight_scale);
        this.az = scrollScaleView;
        scrollScaleView.setData(arrayListC, 10, 40);
        this.az.setCustomStartColor(getColor(R.color.weight_primary_color));
        this.az.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.8
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public void onSelected(List<String> list, int i) {
                double dC = vng.c(i);
                int iE = UnitUtil.e();
                if (iE == 1) {
                    InputWeightActivity.this.ak.setText(UnitUtil.e(dC, 1, 1));
                    InputWeightActivity inputWeightActivity = InputWeightActivity.this;
                    inputWeightActivity.c(inputWeightActivity.ar, dC);
                    InputWeightActivity.this.bb = UnitUtil.b(dC);
                } else if (iE == 3) {
                    InputWeightActivity.this.ak.setText(UnitUtil.e(dC, 1, 1));
                    InputWeightActivity inputWeightActivity2 = InputWeightActivity.this;
                    inputWeightActivity2.c(inputWeightActivity2.ar, dC);
                    InputWeightActivity.this.bb = UnitUtil.i(dC);
                } else {
                    InputWeightActivity.this.bb = dC;
                    InputWeightActivity.this.ak.setText(UnitUtil.e(InputWeightActivity.this.bb, 1, 1));
                    InputWeightActivity inputWeightActivity3 = InputWeightActivity.this;
                    inputWeightActivity3.c(inputWeightActivity3.ar, InputWeightActivity.this.bb);
                }
                InputWeightActivity.this.b(dC, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.v.setVisibility(0);
        this.aa.setVisibility(0);
        this.ai.setVisibility(0);
        this.az.setNoScroll(true);
        this.h.setNoScroll(true);
        this.ax.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_public_cancel_1), qre.f(R.string.accessibility_close));
        this.ax.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
        this.ax.setRightSoftkeyVisibility(8);
        this.d = true;
        if (this.e) {
            this.f.setVisibility(0);
            this.f27528c = true;
            this.e = false;
        }
    }

    private void p() {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.common_toolbar_popupwindow, (ViewGroup) null);
        final qop qopVar = new qop(this, viewInflate);
        qopVar.e(this.ax, 17);
        ((HealthTextView) viewInflate.findViewById(R.id.all_data_declare_text)).setText(R.string.IDS_privacy_data_detail);
        viewInflate.findViewById(R.id.popup_declare_ll).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qopVar.e();
                PageModelArgs pageModelArgs = new PageModelArgs();
                pageModelArgs.setDataSource(3);
                pageModelArgs.setPageType(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
                PrivacyDataModel privacyDataModel = new PrivacyDataModel();
                privacyDataModel.setClientId(InputWeightActivity.this.n);
                privacyDataModel.setStartTime(InputWeightActivity.this.q);
                privacyDataModel.setEndTime(InputWeightActivity.this.q);
                privacyDataModel.setModifyTime(InputWeightActivity.this.q);
                double dC = UnitUtil.c(InputWeightActivity.this.bb);
                privacyDataModel.setDataTitle(UnitUtil.e(dC, 1, 1) + " " + vei.e(dC, false));
                privacyDataModel.setDoubleValue(dC);
                Intent intent = new Intent();
                intent.putExtra("extra_privacy_data_model", privacyDataModel);
                intent.putExtra("extra_page_model_args", pageModelArgs);
                intent.setClass(InputWeightActivity.this.o, PrivacyDetailActivity.class);
                InputWeightActivity.this.startActivity(intent);
            }
        });
    }

    @Override // com.huawei.ui.main.stories.health.util.BaseHealthClickListener
    public void setClickAdd() {
        if (this.f27528c) {
            this.f.setVisibility(8);
            this.f27528c = false;
        } else {
            this.f.setVisibility(0);
            this.f27528c = true;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class e extends BaseHandler<InputWeightActivity> {
        public e(InputWeightActivity inputWeightActivity) {
            super(inputWeightActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(InputWeightActivity inputWeightActivity, Message message) {
            int i = message.what;
            if (i == 1) {
                inputWeightActivity.m();
                return;
            }
            if (i != 3) {
                if (i == 4 && !inputWeightActivity.f27527b) {
                    inputWeightActivity.s();
                    return;
                }
                return;
            }
            inputWeightActivity.u.removeMessages(4);
            inputWeightActivity.r();
            if (message.arg1 == 0) {
                qqj.a(inputWeightActivity.getApplicationContext(), 6);
                ino.c(inputWeightActivity.o, inputWeightActivity.at);
            } else {
                Toast.makeText(inputWeightActivity.o, inputWeightActivity.o.getResources().getString(R.string.IDS_music_management_operation_failed), 0).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        vei.c(this.o);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<InputWeightActivity> f27539b;

        a(InputWeightActivity inputWeightActivity) {
            this.f27539b = new WeakReference<>(inputWeightActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            InputWeightActivity inputWeightActivity = this.f27539b.get();
            if (inputWeightActivity != null) {
                if (i == 0) {
                    LogUtil.a("UIHLH_InputWeightActivity", "delete successful");
                    inputWeightActivity.o();
                } else {
                    LogUtil.j("UIHLH_InputWeightActivity", "delete failed");
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<InputWeightActivity> f27540c;

        c(InputWeightActivity inputWeightActivity) {
            this.f27540c = new WeakReference<>(inputWeightActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("UIHLH_InputWeightActivity", "enter showHealthDataSyncDialogResponseCallback");
            InputWeightActivity inputWeightActivity = this.f27540c.get();
            if (inputWeightActivity != null && inputWeightActivity.ap == 1) {
                if ("/PluginHealthModel/HealthModelActivity".equals(inputWeightActivity.y) || "/todoTask/TodoListActivity".equals(inputWeightActivity.y)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("from", "6");
                    vng.c("6", bundle);
                }
                Intent intent = new Intent();
                intent.putExtra("weight_data", inputWeightActivity.bb);
                inputWeightActivity.setResult(1214, intent);
                LogUtil.a("UIHLH_InputWeightActivity", "inputWeightActivity Weight: ", Double.valueOf(inputWeightActivity.bb));
                if (inputWeightActivity.ah) {
                    vei.d((Activity) inputWeightActivity, true);
                }
                inputWeightActivity.finish();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.ah) {
            vei.d((Activity) this, false);
        }
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
