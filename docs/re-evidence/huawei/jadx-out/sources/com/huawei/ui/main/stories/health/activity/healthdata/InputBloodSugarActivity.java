package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriod;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriodView;
import com.huawei.ui.commonui.scrollview.ScrollScaleView;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.etn;
import defpackage.ino;
import defpackage.lmf;
import defpackage.nkb;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.uvz;
import defpackage.uwf;
import defpackage.vci;
import defpackage.vdd;
import defpackage.wuc;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes19.dex */
public class InputBloodSugarActivity extends BaseActivity implements View.OnClickListener, BloodSugarTimePeriodView.OnTimePeriodItemChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27504a;
    private int aa;
    private int ad;
    private HealthButton ae;
    private LinearLayout af;
    private int ag;
    private int aj;
    private CustomTitleBar al;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27505b;
    private HealthTextView d;
    private HealthButton e;
    private ScrollScaleView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private Date k;
    private int l;
    private long m;
    private Context n;
    private LinearLayout o;
    private int p;
    private e q;
    private a r;
    private b s;
    private uwf u;
    private HiHealthData v;
    private int w;
    private BloodSugarTimePeriodView x;
    private long y;
    private boolean z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f27506c = 0.0d;
    private int ai = -1;
    private long ah = -1;
    private Handler t = new d(this);
    private boolean ac = false;
    private boolean ab = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.health_data_inputbloodsugar);
        clearBackgroundDrawable();
        this.n = this;
        this.u = uwf.d();
        this.q = new e(this);
        this.s = new b(this);
        this.r = new a(this);
        j();
        h();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (LanguageUtil.c(this.n)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 8, 0);
            this.g.setLayoutParams(layoutParams);
        }
    }

    private void h() {
        this.y = System.currentTimeMillis();
        d();
        BigDecimal bigDecimal = new BigDecimal(Double.toString(this.f27506c));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(1));
        this.f.setSelectedPosition(bigDecimal.subtract(bigDecimal2).multiply(new BigDecimal(String.valueOf(10))).intValue());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.y);
        this.aj = calendar.get(1);
        this.ad = calendar.get(2) + 1;
        this.l = calendar.get(5);
        this.w = calendar.get(11);
        this.aa = calendar.get(12);
        this.u.b();
        this.k = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd"));
        this.d.setText(simpleDateFormat.format(this.k));
        this.f27505b.setText(simpleDateFormat.format(this.k));
        this.i.setText(qrk.a(this.n, calendar.getTimeInMillis(), 1));
        this.j.setText(qrk.a(this.n, calendar.getTimeInMillis(), 1));
        this.h.setText(UnitUtil.e(this.f27506c, 1, 1));
        if (this.ac) {
            this.x.b(this.y, this.ag);
            e(this.f27506c);
        } else {
            this.x.c(this.y);
        }
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value();
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", "5");
        lmf.d().c(this.n, strValue, map, 0);
    }

    private void c() {
        this.p = 1;
        this.ac = false;
        double dE = uvz.e(this.ag);
        this.f27506c = dE;
        LogUtil.d("InputBloodSugarActivity", "handleInputDefault mTimePeriod is ", Integer.valueOf(this.ag), " mBloodSugar ", Double.valueOf(dE));
        this.al.setTitleText(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_input));
    }

    private void d() {
        try {
            Intent intent = getIntent();
            if (intent == null) {
                c();
                return;
            }
            String stringExtra = intent.getStringExtra("titleName");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.ac = true;
                this.p = intent.getIntExtra("pageFrom", 0);
                this.al.setTitleText(stringExtra);
                this.al.setLeftButtonDrawable(getResources().getDrawable(R.drawable.ic_appbar_cancle), qre.f(R.string.accessibility_close));
                this.al.setRightButtonVisibility(0);
                this.al.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_appbar_confirm), qre.f(R.string.IDS_contact_confirm));
                this.ag = intent.getIntExtra("bloodTimePeriod", 0);
                this.y = intent.getLongExtra("time", System.currentTimeMillis());
                this.f27506c = intent.getDoubleExtra("bloodNum", 0.0d);
                long longExtra = intent.getLongExtra("showDefaultTime", 0L);
                this.m = longExtra;
                if (longExtra > 0) {
                    this.z = true;
                } else {
                    this.z = false;
                }
                this.ae.setVisibility(8);
                this.e.setVisibility(8);
                LogUtil.d("InputBloodSugarActivity", "mTimePeriod: ", Integer.valueOf(this.ag), " mInsertTime: ", Long.valueOf(this.y));
                this.ai = this.ag;
                this.ah = this.y;
                if (this.z) {
                    this.y = this.m;
                    return;
                }
                return;
            }
            c();
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("InputBloodSugarActivity", "initData Exception");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.o) {
            f();
            return;
        }
        if (view == this.af) {
            o();
            return;
        }
        if (view == this.e) {
            k();
            return;
        }
        HealthButton healthButton = this.ae;
        if (view == healthButton) {
            healthButton.setClickable(false);
            this.ae.setBackgroundResource(R.drawable.button_background_emphasize_disable);
            b();
            return;
        }
        LogUtil.a("InputBloodSugarActivity", "onClick view is not exist");
    }

    private void f() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.y);
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(this, new HealthDatePickerDialog.DateSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputBloodSugarActivity.3
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public void onDateSelected(int i, int i2, int i3) {
                InputBloodSugarActivity.this.aj = i;
                InputBloodSugarActivity.this.ad = i2 + 1;
                InputBloodSugarActivity.this.l = i3;
                calendar.set(InputBloodSugarActivity.this.aj, InputBloodSugarActivity.this.ad - 1, InputBloodSugarActivity.this.l);
                calendar.set(11, InputBloodSugarActivity.this.w);
                calendar.set(12, InputBloodSugarActivity.this.aa);
                InputBloodSugarActivity.this.y = calendar.getTimeInMillis();
                InputBloodSugarActivity.this.k = calendar.getTime();
                InputBloodSugarActivity.this.d.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd")).format(InputBloodSugarActivity.this.k));
                InputBloodSugarActivity.this.a(calendar);
                calendar.clear();
            }
        }, new GregorianCalendar(this.aj, this.ad - 1, this.l));
        Calendar calendar2 = Calendar.getInstance();
        healthDatePickerDialog.a(new GregorianCalendar(2014, 0, 1), new GregorianCalendar(calendar2.get(1), calendar2.get(2), calendar2.get(5)));
        healthDatePickerDialog.b(true);
        healthDatePickerDialog.show();
    }

    private void o() {
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog(this, new HealthTimePickerDialog.TimeSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputBloodSugarActivity.4
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i, int i2) {
                InputBloodSugarActivity.this.w = i;
                InputBloodSugarActivity.this.aa = i2;
                Calendar calendar = Calendar.getInstance();
                calendar.set(InputBloodSugarActivity.this.aj, InputBloodSugarActivity.this.ad - 1, InputBloodSugarActivity.this.l);
                calendar.set(11, InputBloodSugarActivity.this.w);
                calendar.set(12, InputBloodSugarActivity.this.aa);
                InputBloodSugarActivity.this.y = calendar.getTimeInMillis();
                InputBloodSugarActivity.this.k = calendar.getTime();
                InputBloodSugarActivity.this.i.setText(qrk.a(InputBloodSugarActivity.this.n, InputBloodSugarActivity.this.y, 1));
                InputBloodSugarActivity.this.j.setText(qrk.a(InputBloodSugarActivity.this.n, InputBloodSugarActivity.this.y, 1));
                InputBloodSugarActivity.this.a(calendar);
                calendar.clear();
            }
        });
        healthTimePickerDialog.b(0, 0, 0, this.w, this.aa);
        healthTimePickerDialog.e(getString(R.string.IDS_hw_health_show_healthdata_measure_time));
        healthTimePickerDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_INPUT_2030034.value();
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(this.n, strValue, map, 0);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.y);
        calendar.set(11, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.y);
        calendar2.set(11, 24);
        nkb.d().b(this.n.getApplicationContext(), calendar.getTimeInMillis(), calendar2.getTimeInMillis(), 0, this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj) {
        this.ae.setClickable(true);
        this.ae.setBackgroundResource(R.drawable.button_background_emphasize);
        ino.c(this.n, new c(this, obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.n);
        builder.d(R.string.IDS_service_area_notice_title).c(R.string.IDS_hw_show_healthdata_bloodsugar_prompt_dialog_content).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputBloodSugarActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (InputBloodSugarActivity.this.ac) {
                    InputBloodSugarActivity.this.c(false);
                } else {
                    InputBloodSugarActivity.this.a();
                }
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputBloodSugarActivity.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.b().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Calendar calendar) {
        this.x.c(calendar.getTimeInMillis());
        this.ae.setBackgroundResource(R.drawable.button_background_emphasize_disable);
        this.ae.setClickable(false);
        this.al.setRightButtonClickable(false);
        this.ag = 0;
        e(0.0d);
    }

    private boolean b(int i, long j, long j2) {
        if (this.ag != i) {
            return false;
        }
        long j3 = this.y;
        return j3 == j && j3 == j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j, long j2) {
        uwf uwfVar = this.u;
        Context applicationContext = this.n.getApplicationContext();
        int i = this.ag;
        uwfVar.c(applicationContext, new long[]{j, j2}, i, this.f27506c, new g(this, this.p, this.ac, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        long startTime;
        long endTime;
        HiHealthData hiHealthData = this.v;
        if (hiHealthData != null) {
            startTime = hiHealthData.getStartTime();
            endTime = this.v.getEndTime();
        } else {
            startTime = 0;
            endTime = 0;
        }
        if (b(this.ag, startTime, endTime)) {
            d(endTime, endTime);
            return;
        }
        vci.d().a();
        this.u.e(this.n.getApplicationContext(), this.ag, startTime, endTime, this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        int i;
        this.ab = z;
        long j = this.ah;
        if (j == -1 || (i = this.ai) == -1) {
            return;
        }
        if (!z && b(i, j, j)) {
            d(j, j);
        } else {
            vci.d().a();
            this.u.e(this.n.getApplicationContext(), this.ai, j, j, this.s);
        }
    }

    private void j() {
        this.al = (CustomTitleBar) findViewById(R.id.health_healthdata_inputbloodsugar_title_layout);
        this.o = (LinearLayout) findViewById(R.id.hw_show_health_data_inputbloodsugar_top_datelayout);
        if (qrs.i() >= 3.2f && (this.o.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.o.getLayoutParams();
            layoutParams.height = -2;
            this.o.setLayoutParams(layoutParams);
        }
        this.af = (LinearLayout) findViewById(R.id.hw_show_health_data_inputbloodsugar_top_timelayout);
        if (qrs.i() >= 3.2f && (this.af.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.af.getLayoutParams();
            layoutParams2.height = -2;
            this.af.setLayoutParams(layoutParams2);
        }
        this.d = (HealthTextView) findViewById(R.id.hw_show_health_data_inputbloodsugar_top_date);
        this.f27505b = (HealthTextView) findViewById(R.id.hw_show_health_data_inputbloodsugar_data);
        this.i = (HealthTextView) findViewById(R.id.hw_show_health_data_inputbloodsugar_top_time);
        this.j = (HealthTextView) findViewById(R.id.hw_show_health_data_inputbloodsugar_time);
        if (qrs.i() >= 3.2f) {
            this.d.setVisibility(8);
            this.f27505b.setVisibility(0);
            this.i.setVisibility(8);
            this.j.setVisibility(0);
        } else {
            this.d.setVisibility(0);
            this.f27505b.setVisibility(8);
            this.i.setVisibility(0);
            this.j.setVisibility(8);
        }
        i();
    }

    private void i() {
        this.f = (ScrollScaleView) findViewById(R.id.health_healthdata_inputbloodsugar_bloodsugar_scale);
        this.h = (HealthTextView) findViewById(R.id.hw_show_health_data_inputbloodsugar_mid_bloodsugar);
        this.e = (HealthButton) findViewById(R.id.hw_show_health_data_inputbloodsugar_bind_device);
        if (EnvironmentInfo.m()) {
            this.e.setVisibility(4);
        }
        this.g = (HealthTextView) findViewById(R.id.hw_inputbloodsugare_unit);
        this.f27504a = (HealthTextView) findViewById(R.id.hw_inputbloodsugar_conclusion);
        this.ae = (HealthButton) findViewById(R.id.hw_show_health_data_inputbloodsugar_confirm);
        BloodSugarTimePeriodView bloodSugarTimePeriodView = (BloodSugarTimePeriodView) findViewById(R.id.hw_health_input_bloodsugar_time_period);
        this.x = bloodSugarTimePeriodView;
        BaseActivity.cancelLayoutById(bloodSugarTimePeriodView);
        ImageView imageView = (ImageView) findViewById(R.id.hw_health_input_bloodsugar_date);
        ImageView imageView2 = (ImageView) findViewById(R.id.hw_health_input_bloodsugar_time);
        if (LanguageUtil.ba(this.n)) {
            imageView.setImageResource(R.drawable.common_ui_arrow_left);
            imageView2.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            imageView.setImageResource(R.drawable.common_ui_arrow_right);
            imageView2.setImageResource(R.drawable.common_ui_arrow_right);
        }
        this.g.setText(getResources().getString(R.string.IDS_hw_health_show_healthdata_bloodsugar_mmol));
        this.al.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.home_view_background));
        ArrayList arrayList = new ArrayList(10);
        for (int i = 1; i < 34; i++) {
            arrayList.add(UnitUtil.e(i, 1, 0));
        }
        this.f.setData(arrayList, 10, 40);
        this.f.setNoScroll(true);
        e();
    }

    private void e() {
        this.f.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputBloodSugarActivity.2
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public void onSelected(List<String> list, int i) {
                double d2 = (((double) i) * 0.1d) + 1.0d;
                DecimalFormat decimalFormat = new DecimalFormat("##0.0");
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                InputBloodSugarActivity.this.f27506c = new BigDecimal(decimalFormat.format(d2)).doubleValue();
                InputBloodSugarActivity.this.h.setText(UnitUtil.e(d2, 1, 1));
                if (InputBloodSugarActivity.this.ag != 0) {
                    InputBloodSugarActivity.this.e(d2);
                }
            }
        });
        this.o.setOnClickListener(this);
        this.af.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.ae.setOnClickListener(this);
        this.ae.setClickable(false);
        this.al.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputBloodSugarActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InputBloodSugarActivity.this.finish();
            }
        });
        this.al.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputBloodSugarActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InputBloodSugarActivity.this.b();
            }
        });
        this.x.setOnTimePeriodItemChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(double d2) {
        if (d2 <= 0.0d) {
            this.f27504a.setText("");
            return;
        }
        Map<String, String> mapD = uvz.d(this.n, this.ag, (float) d2);
        String str = mapD.get("HEALTH_BLOOD_SUGAR_LEVEL_KEY");
        if (String.valueOf(1001).equals(str) || String.valueOf(1002).equals(str)) {
            this.f27504a.setTextColor(ContextCompat.getColor(this.n, R.color.color_blood_low));
        } else if (String.valueOf(1003).equals(str)) {
            this.f27504a.setTextColor(ContextCompat.getColor(this.n, R.color.color_blood_normal));
        } else if (String.valueOf(1004).equals(str) || String.valueOf(1005).equals(str) || String.valueOf(1006).equals(str)) {
            this.f27504a.setTextColor(ContextCompat.getColor(this.n, R.color.color_blood_high));
        } else {
            this.f27504a.setTextColor(ContextCompat.getColor(this.n, R.color.color_blood_normal));
        }
        String str2 = mapD.get("HEALTH_BLOOD_SUGAR_LEVEL_DESC");
        this.f27504a.setText(TextUtils.isEmpty(str2) ? "" : str2);
    }

    private void k() {
        etn.a(this.n, "HDK_BLOOD_SUGAR");
    }

    @Override // com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriodView.OnTimePeriodItemChangedListener
    public void onTimePeriodItemChanged(int i, BloodSugarTimePeriod bloodSugarTimePeriod) {
        this.ag = bloodSugarTimePeriod.getCode();
        this.ae.setBackgroundResource(R.drawable.button_background_emphasize);
        this.ae.setClickable(true);
        this.al.setRightButtonClickable(true);
        e(this.f27506c);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.r != null) {
            LogUtil.a("InputBloodSugarActivity", "mGetBloodSugarTodayResponseCallback is not null");
            this.r = null;
        }
    }

    static class e implements IBaseResponseCallback {
        private WeakReference<InputBloodSugarActivity> e;

        e(InputBloodSugarActivity inputBloodSugarActivity) {
            this.e = new WeakReference<>(inputBloodSugarActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("InputBloodSugarActivity", "DeleteDataResponseCallback onResponse data = ", obj);
            InputBloodSugarActivity inputBloodSugarActivity = this.e.get();
            if (inputBloodSugarActivity == null) {
                return;
            }
            inputBloodSugarActivity.v = null;
            Message messageObtainMessage = inputBloodSugarActivity.t.obtainMessage();
            messageObtainMessage.what = 2;
            inputBloodSugarActivity.t.sendMessage(messageObtainMessage);
            if (i == 0) {
                LogUtil.a("InputBloodSugarActivity", "DeleteDataResponseCallback delete successful");
            } else {
                LogUtil.a("InputBloodSugarActivity", "DeleteDataResponseCallback delete failed");
            }
        }
    }

    static class b implements IBaseResponseCallback {
        private WeakReference<InputBloodSugarActivity> e;

        b(InputBloodSugarActivity inputBloodSugarActivity) {
            this.e = new WeakReference<>(inputBloodSugarActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("InputBloodSugarActivity", "DeleteDataResponseCallback onResponse data = ", obj);
            InputBloodSugarActivity inputBloodSugarActivity = this.e.get();
            if (inputBloodSugarActivity == null) {
                return;
            }
            if (inputBloodSugarActivity.ab) {
                inputBloodSugarActivity.d(inputBloodSugarActivity.y, inputBloodSugarActivity.y);
            } else {
                inputBloodSugarActivity.a();
            }
            if (i == 0) {
                LogUtil.j("InputBloodSugarActivity", "DeletePreviousDataResponseCallback delete successful");
            } else {
                LogUtil.j("InputBloodSugarActivity", "DeletePreviousDataResponseCallback delete failed");
            }
        }
    }

    static class d extends BaseHandler<InputBloodSugarActivity> {
        d(InputBloodSugarActivity inputBloodSugarActivity) {
            super(inputBloodSugarActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(InputBloodSugarActivity inputBloodSugarActivity, Message message) {
            if (inputBloodSugarActivity == null) {
                LogUtil.j("InputBloodSugarActivity", "InputBloodSugarActivityHandler activity is null");
                return;
            }
            if (message == null) {
                LogUtil.j("InputBloodSugarActivity", "handleMessageWhenReferenceNotNull message is null");
                return;
            }
            int i = message.what;
            if (i == 2) {
                inputBloodSugarActivity.d(inputBloodSugarActivity.y, inputBloodSugarActivity.y);
                return;
            }
            if (i != 3) {
                if (i != 5) {
                    return;
                }
                inputBloodSugarActivity.d(message.obj);
                return;
            }
            if (message.arg1 == 0) {
                if (inputBloodSugarActivity.ac) {
                    inputBloodSugarActivity.setResult(200);
                } else {
                    Intent intent = new Intent(inputBloodSugarActivity, (Class<?>) BloodSugarFeedbackActivity.class);
                    intent.putExtra("titleName", inputBloodSugarActivity.getResources().getString(R.string.IDS_hw_health_show_healthdata_input));
                    intent.putExtra("time", inputBloodSugarActivity.y);
                    intent.putExtra("bloodNum", inputBloodSugarActivity.f27506c);
                    intent.putExtra("bloodTimePeriod", inputBloodSugarActivity.ag);
                    LogUtil.a("InputBloodSugarActivity", "InputBloodSugarActivity BloodSugarData time = ", Long.valueOf(inputBloodSugarActivity.y), ", bloodNum = ", Double.valueOf(inputBloodSugarActivity.f27506c), ", bloodTimePeriod = ", Integer.valueOf(inputBloodSugarActivity.ag));
                    inputBloodSugarActivity.startActivity(intent);
                }
                inputBloodSugarActivity.finish();
            }
        }
    }

    static class g implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27515a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<InputBloodSugarActivity> f27516c;
        private boolean d;
        private int e;

        g(InputBloodSugarActivity inputBloodSugarActivity, int i, boolean z, int i2) {
            this.f27516c = new WeakReference<>(inputBloodSugarActivity);
            this.e = i;
            this.d = z;
            this.f27515a = i2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0) {
                LogUtil.a("InputBloodSugarActivity", "InsertBloodSugarResponseCallback: start sync cloud");
                b();
                vdd.d(4);
            }
            InputBloodSugarActivity inputBloodSugarActivity = this.f27516c.get();
            if (inputBloodSugarActivity == null) {
                return;
            }
            LogUtil.d("InputBloodSugarActivity", "InsertBloodSugarResponseCallback, callBackCode = ", Integer.valueOf(i), ", data = ", obj);
            if (i == 0) {
                LogUtil.a("InputBloodSugarActivity", "InsertBloodSugarResponseCallback, insert successful");
                inputBloodSugarActivity.t.sendMessage(inputBloodSugarActivity.t.obtainMessage(3, 0, 0));
            } else {
                LogUtil.a("InputBloodSugarActivity", "InsertBloodSugarResponseCallback, insert fail");
                inputBloodSugarActivity.t.sendMessage(inputBloodSugarActivity.t.obtainMessage(3, 1, 0));
            }
        }

        private void b() {
            int iC = wuc.c(this.f27515a);
            if (this.e == 0 || iC == 0) {
                return;
            }
            String strValue = AnalyticsValue.HEALTH_HOME_BLOOD_SUGAR_INPUT_VIEW_2030034.value();
            HashMap map = new HashMap();
            map.put("click", "1");
            map.put("recordType", Integer.valueOf(this.d ? 1 : 2));
            map.put("dataType", Integer.valueOf(iC));
            map.put("from", Integer.valueOf(this.e));
            lmf.d().c(BaseApplication.b(), strValue, map, 0);
        }
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<InputBloodSugarActivity> f27514a;
        private Object d;

        c(InputBloodSugarActivity inputBloodSugarActivity, Object obj) {
            this.f27514a = new WeakReference<>(inputBloodSugarActivity);
            this.d = obj;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            InputBloodSugarActivity inputBloodSugarActivity = this.f27514a.get();
            if (inputBloodSugarActivity == null) {
                return;
            }
            if (System.currentTimeMillis() < inputBloodSugarActivity.y) {
                qpx.e(inputBloodSugarActivity.n, inputBloodSugarActivity.n.getResources().getString(R.string.IDS_hw_health_show_healthdata_timeerror));
                return;
            }
            Object obj2 = this.d;
            if (obj2 instanceof List) {
                for (HiHealthData hiHealthData : (List) obj2) {
                    int type = hiHealthData.getType();
                    if (type == inputBloodSugarActivity.ag && type != 2106 && !wuc.d(hiHealthData.getInt("trackdata_deviceType"))) {
                        inputBloodSugarActivity.v = hiHealthData;
                        inputBloodSugarActivity.g();
                        return;
                    }
                }
            }
            if (inputBloodSugarActivity.ac) {
                inputBloodSugarActivity.c(true);
            } else {
                inputBloodSugarActivity.d(inputBloodSugarActivity.y, inputBloodSugarActivity.y);
            }
        }
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<InputBloodSugarActivity> f27513a;

        a(InputBloodSugarActivity inputBloodSugarActivity) {
            this.f27513a = new WeakReference<>(inputBloodSugarActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            InputBloodSugarActivity inputBloodSugarActivity = this.f27513a.get();
            if (inputBloodSugarActivity != null) {
                Message messageObtainMessage = inputBloodSugarActivity.t.obtainMessage();
                messageObtainMessage.what = 5;
                messageObtainMessage.obj = obj;
                inputBloodSugarActivity.t.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("InputBloodSugarActivity", "GetBloodSugarTodayResponseCallback inputBloodSugarActivity is null");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
