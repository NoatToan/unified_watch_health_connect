package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.view.GravityCompat;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.scrollview.ScrollScaleView;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import com.huawei.uikit.phone.hwbutton.widget.HwButton;
import defpackage.etn;
import defpackage.ino;
import defpackage.lmf;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.vbk;
import defpackage.vbr;
import defpackage.wud;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class InputTemperatureActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f27517c = {"KnitHealthData_Edit_" + DataInfos.TemperatureDayDetail, "KnitHealthData_Edit_" + DataInfos.TemperatureWeekDetail, "KnitHealthData_Edit_" + DataInfos.TemperatureMonthDetail};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f27518a;
    private HealthTextView aa;
    private HealthTextView ac;
    private a ad;
    private CustomTitleBar ae;
    private int af;
    private LinearLayout ag;
    private Dialog ah;
    private HealthTextView ai;
    private ScrollScaleView ak;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27519b;
    private vbk d;
    private HwButton e;
    private long f;
    private HealthTextView g;
    private e h;
    private int i;
    private int j;
    private int k;
    private c m;
    private ImageView n;
    private ImageView o;
    private long p;
    private int r;
    private boolean s;
    private int u;
    private long v;
    private HwButton w;
    private long x;
    private float y = 0.0f;
    private float z = 0.0f;
    private final Handler l = new b(this);
    private boolean t = true;
    private boolean q = false;
    private int ab = 34;

    private boolean e(double d) {
        return d >= 0.0d && d < 100.0d;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.d("Input_TemperatureActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.health_data_input_temperature);
        this.f27519b = this;
        this.s = UnitUtil.a();
        this.m = new c(this);
        this.ad = new a(this);
        this.h = new e();
        this.d = vbk.c();
        b();
        h();
        i();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        wud.e(this.ac);
    }

    private void h() {
        this.ae = (CustomTitleBar) findViewById(R.id.health_data_input_temperature_titlebar);
        this.f27518a = (LinearLayout) findViewById(R.id.health_data_input_temperature_date_layout);
        this.ag = (LinearLayout) findViewById(R.id.health_data_input_temperature_time_layout);
        this.n = (ImageView) findViewById(R.id.health_data_input_temperature_date_arrow);
        this.o = (ImageView) findViewById(R.id.health_data_input_temperature_time_arrow);
        if (LanguageUtil.ba(this.f27519b)) {
            this.n.setImageResource(R.drawable.common_ui_arrow_left);
            this.o.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.n.setImageResource(R.drawable.common_ui_arrow_right);
            this.o.setImageResource(R.drawable.common_ui_arrow_right);
        }
        this.g = (HealthTextView) findViewById(R.id.health_data_input_temperature_date_text);
        this.ai = (HealthTextView) findViewById(R.id.health_data_input_temperature_time_text);
        this.aa = (HealthTextView) findViewById(R.id.health_data_input_temperature_data);
        this.ac = (HealthTextView) findViewById(R.id.health_data_input_temperature_data_unit);
        this.ac.setText(this.s ? getString(R.string.IDS_settings_health_temperature_unit, new Object[]{""}) : getString(R.string.IDS_temp_unit_fahrenheit, new Object[]{""}));
        j();
    }

    private void j() {
        this.w = (HwButton) findViewById(R.id.health_data_input_temperature_confirm);
        this.e = (HwButton) findViewById(R.id.health_data_input_temperature_bind_device);
        if (EnvironmentInfo.m()) {
            this.e.setVisibility(8);
        }
        this.ak = (ScrollScaleView) findViewById(R.id.health_data_input_temperature_data_scale);
        float f = this.z;
        if (f < 34.0f) {
            this.ab = (int) Math.floor(f);
        }
        float f2 = this.z;
        int iCeil = f2 > 42.0f ? (int) Math.ceil(f2) : 42;
        ArrayList arrayList = new ArrayList();
        if (!this.s) {
            this.ab = (int) Math.ceil(vbr.b(this.ab));
            iCeil = (int) vbr.b(iCeil);
        }
        for (int i = this.ab; i <= iCeil; i++) {
            arrayList.add(UnitUtil.e(i, 1, 0));
        }
        this.ak.setData(arrayList, 10, 40);
        this.ak.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputTemperatureActivity.3
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public void onSelected(List<String> list, int i2) {
                float fFloatValue = new BigDecimal(((double) InputTemperatureActivity.this.ab) + (((double) i2) * 0.1d)).setScale(1, 4).floatValue();
                InputTemperatureActivity.this.aa.setText(UnitUtil.e(fFloatValue, 1, 1));
                if (!InputTemperatureActivity.this.s) {
                    fFloatValue = vbr.d(fFloatValue);
                }
                InputTemperatureActivity.this.z = fFloatValue;
            }
        });
        n();
        f();
    }

    private void n() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.t = intent.getBooleanExtra("isShowInput", false);
                this.i = intent.getIntExtra("deviceId", 1);
            } catch (Exception unused) {
                LogUtil.e("Input_TemperatureActivity", "isShowInputView Exception");
            }
        }
        if (this.t) {
            d(true, 0);
            this.ak.setNoScroll(true);
            d();
            this.ae.setRightButtonVisibility(8);
            this.ae.setTitleText(this.f27519b.getString(R.string.IDS_hw_health_show_healthdata_input));
            this.w.setVisibility(0);
            return;
        }
        d(false, 8);
        o();
    }

    private void d(boolean z, int i) {
        this.f27518a.setEnabled(z);
        this.ag.setEnabled(z);
        this.n.setVisibility(i);
        this.o.setVisibility(i);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (LanguageUtil.ba(this.f27519b)) {
            this.ae.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_rtl_back_selector), qre.f(R.string.accessibility_go_back));
        } else {
            this.ae.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
        }
    }

    private void o() {
        this.ak.setNoScroll(false);
        d();
        this.ae.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
        this.ae.setRightButtonVisibility(0);
        if (this.i != 1) {
            this.ae.setRightButtonVisibility(8);
        }
        this.ae.setTitleText(this.f27519b.getString(R.string.IDS_hw_base_health_data_history_record));
        this.w.setVisibility(8);
        this.ae.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputTemperatureActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Input_TemperatureActivity", "showNotInput onClick mIsShowInputting = ", Boolean.valueOf(InputTemperatureActivity.this.q));
                if (InputTemperatureActivity.this.q) {
                    if (InputTemperatureActivity.this.g()) {
                        LogUtil.a("Input_TemperatureActivity", "showNotInput onClick isDataCorrect = true");
                        InputTemperatureActivity.this.q = false;
                        InputTemperatureActivity.this.d();
                        InputTemperatureActivity.this.ak.setNoScroll(false);
                        if (InputTemperatureActivity.this.t) {
                            InputTemperatureActivity.this.ae.setRightButtonVisibility(8);
                        } else {
                            InputTemperatureActivity.this.ae.setRightButtonDrawable(InputTemperatureActivity.this.getResources().getDrawable(R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
                        }
                        InputTemperatureActivity.this.e();
                        return;
                    }
                    return;
                }
                InputTemperatureActivity.this.q = true;
                InputTemperatureActivity.this.ak.setNoScroll(true);
                InputTemperatureActivity.this.ae.setLeftButtonDrawable(InputTemperatureActivity.this.getResources().getDrawable(R.drawable.ic_public_cancel_1), qre.f(R.string.accessibility_close));
                InputTemperatureActivity.this.ae.setRightButtonDrawable(InputTemperatureActivity.this.getResources().getDrawable(R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
            }
        });
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.z = (float) intent.getDoubleExtra(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, 36.5d);
                this.f = intent.getLongExtra("deletetime", -1L);
            } catch (Exception unused) {
                LogUtil.e("Input_TemperatureActivity", "getDataFromIntent Exception");
            }
            if (!e(this.z)) {
                LogUtil.j("Input_TemperatureActivity", "getDataFromIntent mTemperature is invalid: ", Float.valueOf(this.z));
                this.z = 36.5f;
            }
            this.y = this.z;
            long j = this.f;
            this.v = j;
            if (j != -1) {
                this.p = j;
            } else {
                this.p = System.currentTimeMillis();
            }
            this.x = this.p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.d != null) {
            String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_INPUT_2060050.value();
            HashMap map = new HashMap();
            map.put("click", "1");
            lmf.d().c(this.f27519b, strValue, map, 0);
            HiTimeInterval hiTimeInterval = new HiTimeInterval();
            hiTimeInterval.setStartTime(this.v);
            hiTimeInterval.setEndTime(this.v);
            ArrayList arrayList = new ArrayList();
            arrayList.add(hiTimeInterval);
            this.d.b(this.f27519b, arrayList, this.h);
            LogUtil.a("Input_TemperatureActivity", "delete time of data: ", Long.valueOf(this.v));
            vbk vbkVar = this.d;
            long j = this.p;
            vbkVar.e(j, j, this.z, this.m);
        }
    }

    private void i() {
        BigDecimal bigDecimal;
        float fB = this.s ? this.z : vbr.b(this.z);
        try {
            bigDecimal = new BigDecimal(UnitUtil.d(fB, 1));
        } catch (NumberFormatException unused) {
            fB = 36.5f;
            this.z = 36.5f;
            bigDecimal = new BigDecimal(36.5f);
            LogUtil.j("Input_TemperatureActivity", "initData mTemperature is invalid ", Float.valueOf(this.z));
        }
        this.ak.setSelectedPosition(bigDecimal.subtract(BigDecimal.valueOf(this.ab)).multiply(BigDecimal.valueOf(10L)).intValue());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.p);
        this.af = calendar.get(1);
        this.u = calendar.get(2);
        this.j = calendar.get(5);
        this.k = calendar.get(11);
        this.r = calendar.get(12);
        this.g.setText(qrk.h(this.p));
        this.ai.setText(qrk.a(this.f27519b, this.p, 1));
        this.aa.setText(UnitUtil.e(fB, 1, 1));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f27518a) {
            if (this.t) {
                l();
                return;
            } else {
                if (this.q) {
                    l();
                    return;
                }
                return;
            }
        }
        if (view == this.ag) {
            if (this.t) {
                m();
                return;
            } else {
                if (this.q) {
                    m();
                    return;
                }
                return;
            }
        }
        if (view == this.w) {
            if (qrs.c(500)) {
                return;
            }
            this.w.setClickable(false);
            this.w.setBackgroundResource(R.drawable.button_background_emphasize_disable);
            if (g()) {
                ino.c(this.f27519b, this.ad);
                return;
            }
            return;
        }
        if (view == this.e) {
            String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_DETAIL_BIND_2060048.value();
            HashMap map = new HashMap();
            map.put("click", "1");
            lmf.d().c(this.f27519b, strValue, map, 0);
            etn.a(this.f27519b, "HDK_BODY_TEMPERATURE");
            return;
        }
        LogUtil.j("Input_TemperatureActivity", "onClick this view cannot find");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.p;
        if (jCurrentTimeMillis < j) {
            Toast.makeText(this.f27519b, getString(R.string.IDS_hw_health_show_healthdata_timeerror), 0).show();
            k();
            return false;
        }
        LogUtil.a("Input_TemperatureActivity", "isDataCorrect mInsertTime = ", Long.valueOf(j));
        return true;
    }

    private void f() {
        this.f27518a.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.w.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.ae.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputTemperatureActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Input_TemperatureActivity", "initClickEvent onClick mIsShowInputting = ", Boolean.valueOf(InputTemperatureActivity.this.q));
                if (InputTemperatureActivity.this.q) {
                    InputTemperatureActivity.this.q = false;
                    InputTemperatureActivity.this.d();
                    if (InputTemperatureActivity.this.t) {
                        InputTemperatureActivity.this.ae.setRightButtonVisibility(8);
                    } else {
                        InputTemperatureActivity.this.ae.setRightButtonDrawable(InputTemperatureActivity.this.getResources().getDrawable(R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
                    }
                    InputTemperatureActivity.this.ak.setNoScroll(false);
                    InputTemperatureActivity.this.a();
                    return;
                }
                InputTemperatureActivity.this.setResult(-1);
                InputTemperatureActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.z = this.y;
        this.f = this.v;
        this.p = this.x;
        i();
    }

    private void l() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.p);
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(this, new HealthDatePickerDialog.DateSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputTemperatureActivity.2
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public void onDateSelected(int i, int i2, int i3) {
                InputTemperatureActivity.this.af = i;
                InputTemperatureActivity.this.u = i2;
                InputTemperatureActivity.this.j = i3;
                calendar.set(InputTemperatureActivity.this.af, InputTemperatureActivity.this.u, InputTemperatureActivity.this.j);
                calendar.set(11, InputTemperatureActivity.this.k);
                calendar.set(12, InputTemperatureActivity.this.r);
                InputTemperatureActivity.this.p = calendar.getTimeInMillis();
                InputTemperatureActivity.this.g.setText(qrk.h(InputTemperatureActivity.this.p));
                calendar.clear();
            }
        }, new GregorianCalendar(this.af, this.u, this.j));
        Calendar calendar2 = Calendar.getInstance();
        healthDatePickerDialog.a(new GregorianCalendar(2014, 0, 1), new GregorianCalendar(calendar2.get(1), calendar2.get(2), calendar2.get(5)));
        healthDatePickerDialog.b(true);
        Window window = healthDatePickerDialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = (int) getResources().getDimension(R.dimen.emui_card_device_12dp);
        window.setAttributes(attributes);
        healthDatePickerDialog.show();
        c(window);
        HwTextView hwTextView = (HwTextView) healthDatePickerDialog.findViewById(R.id.hwdatepicker_dialog_title);
        if (hwTextView != null) {
            hwTextView.setGravity(GravityCompat.START);
        }
    }

    private void m() {
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog(this, new HealthTimePickerDialog.TimeSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InputTemperatureActivity.1
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i, int i2) {
                LogUtil.d("Input_TemperatureActivity", "hour = ", Integer.valueOf(i), ", minute = ", Integer.valueOf(i2));
                InputTemperatureActivity.this.k = i;
                InputTemperatureActivity.this.r = i2;
                Calendar calendar = Calendar.getInstance();
                calendar.set(InputTemperatureActivity.this.af, InputTemperatureActivity.this.u, InputTemperatureActivity.this.j);
                calendar.set(11, InputTemperatureActivity.this.k);
                calendar.set(12, InputTemperatureActivity.this.r);
                InputTemperatureActivity.this.p = calendar.getTimeInMillis();
                InputTemperatureActivity.this.ai.setText(qrk.a(InputTemperatureActivity.this.f27519b, InputTemperatureActivity.this.p, 1));
                calendar.clear();
                InputTemperatureActivity.this.ah.dismiss();
            }
        });
        healthTimePickerDialog.b(0, 0, 0, this.k, this.r);
        healthTimePickerDialog.e(getString(R.string.IDS_hw_health_show_healthdata_measure_time));
        Window window = healthTimePickerDialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = (int) getResources().getDimension(R.dimen.emui_card_device_12dp);
        window.setAttributes(attributes);
        healthTimePickerDialog.show();
        c(window);
        HwTextView hwTextView = (HwTextView) healthTimePickerDialog.findViewById(R.id.hwtimepicker_title);
        if (hwTextView != null) {
            hwTextView.setGravity(GravityCompat.START);
        }
        this.ah = healthTimePickerDialog;
    }

    private void c(Window window) {
        Context context = this.f27519b;
        if (context == null || window == null) {
            LogUtil.e("Input_TemperatureActivity", "context or window is null");
        } else {
            window.setGravity((qrs.af(context) || 2 == this.f27519b.getResources().getConfiguration().orientation) ? 17 : 80);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.w.setClickable(true);
        this.w.setBackgroundResource(R.drawable.button_background_emphasize);
    }

    static class a implements IBaseResponseCallback {
        WeakReference<InputTemperatureActivity> d;
        InputTemperatureActivity e;

        a(InputTemperatureActivity inputTemperatureActivity) {
            WeakReference<InputTemperatureActivity> weakReference = new WeakReference<>(inputTemperatureActivity);
            this.d = weakReference;
            this.e = weakReference.get();
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            InputTemperatureActivity inputTemperatureActivity = this.e;
            if (inputTemperatureActivity != null) {
                inputTemperatureActivity.k();
                if (this.e.d != null) {
                    String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_INPUT_2060050.value();
                    HashMap map = new HashMap(16);
                    map.put("click", "1");
                    lmf.d().c(this.e.f27519b.getApplicationContext(), strValue, map, 0);
                    if (this.e.f != -1) {
                        HiTimeInterval hiTimeInterval = new HiTimeInterval();
                        hiTimeInterval.setStartTime(this.e.f);
                        hiTimeInterval.setEndTime(this.e.f);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(hiTimeInterval);
                        this.e.d.b(this.e.f27519b.getApplicationContext(), arrayList, this.e.h);
                        LogUtil.a("Input_TemperatureActivity", "delete time of data = ", Long.toString(this.e.f));
                    }
                    this.e.d.e(this.e.p, this.e.p, this.e.z, this.e.m);
                }
            }
        }
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<InputTemperatureActivity> f27524a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        InputTemperatureActivity f27525c;

        c(InputTemperatureActivity inputTemperatureActivity) {
            WeakReference<InputTemperatureActivity> weakReference = new WeakReference<>(inputTemperatureActivity);
            this.f27524a = weakReference;
            this.f27525c = weakReference.get();
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (this.f27525c != null) {
                LogUtil.d("Input_TemperatureActivity", "onResponse, errorCode = ", Integer.valueOf(i));
                if (i == 0) {
                    LogUtil.a("Input_TemperatureActivity", "onResponse, insert SUCCESS");
                    this.f27525c.l.sendMessage(this.f27525c.l.obtainMessage(3, 0, 0));
                } else {
                    LogUtil.j("Input_TemperatureActivity", "onResponse, insert FAIL");
                    this.f27525c.l.sendMessage(this.f27525c.l.obtainMessage(3, 1, 0));
                }
            }
        }
    }

    static class e implements IBaseResponseCallback {
        private e() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0) {
                LogUtil.a("Input_TemperatureActivity", "DeleteDataResponseCallback onResponse delete successful");
            } else {
                LogUtil.j("Input_TemperatureActivity", "DeleteDataResponseCallback onResponse delete failed");
            }
        }
    }

    public static class b extends BaseHandler<InputTemperatureActivity> {
        b(InputTemperatureActivity inputTemperatureActivity) {
            super(inputTemperatureActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(InputTemperatureActivity inputTemperatureActivity, Message message) {
            if (message == null) {
                LogUtil.j("Input_TemperatureActivity", "handleMessageWhenReferenceNotNull msg is null");
                return;
            }
            if (message.what == 3 && message.arg1 == 0) {
                LogUtil.a("Input_TemperatureActivity", "temperature sendBroadcast");
                for (String str : InputTemperatureActivity.f27517c) {
                    ObserverManagerUtil.e(str, Long.valueOf(inputTemperatureActivity.p));
                }
                inputTemperatureActivity.setResult(-1);
                inputTemperatureActivity.finish();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
