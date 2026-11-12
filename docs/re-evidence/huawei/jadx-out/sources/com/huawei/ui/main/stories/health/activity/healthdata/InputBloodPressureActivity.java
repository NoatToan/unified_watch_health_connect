package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiBloodPressureMetaData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.ScrollScaleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InputBloodPressureActivity;
import com.huawei.ui.main.stories.health.adapter.CustomActionDialogAdapter;
import com.huawei.ui.main.stories.health.bloodpressure.BloodPressureMeasureActionManager;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDetailActivity;
import defpackage.ino;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqj;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.uwf;
import defpackage.uwu;
import defpackage.vdd;
import defpackage.vzm;
import health.compact.a.LanguageUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class InputBloodPressureActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f27495a = {"KnitHealthData_Edit_" + DataInfos.BloodPressureDayDetail, "KnitHealthData_Edit_" + DataInfos.BloodPressureWeekDetail, "KnitHealthData_Edit_" + DataInfos.BloodPressureMonthDetail};
    private static final List<String> e = Collections.unmodifiableList(Arrays.asList(qre.f(R.string.IDS_blood_measure_no_action), qre.f(R.string.IDS_blood_pressure_get_up), qre.f(R.string.IDS_blood_pressure_before_bedtime)));
    private HealthTextView aa;
    private long ac;
    private ImageView ad;
    private List<String> ah;
    private long aj;
    private HealthTextView ak;
    private int al;
    private HealthTextView am;
    private ScrollScaleView an;
    private View ao;
    private long ar;
    private ScrollScaleView au;
    private HealthTextView av;
    private HealthButton aw;
    private HealthTextView ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f27496b;
    private CustomTitleBar bb;
    private LinearLayout bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27497c;
    private List<String> d;
    private Context f;
    private int g;
    private BloodPressureMeasureActionManager h;
    private HealthTextView i;
    private HealthTextView j;
    private View k;
    private String l;
    private LinearLayout m;
    private long n;
    private HealthFlowLayout o;
    private boolean p;
    private HiHealthData r;
    private HealthSubHeader s;
    private HealthTextView u;
    private ImageView v;
    private HealthTextView w;
    private HealthTextView x;
    private ScrollScaleView y;
    private final Handler t = new i(this);
    private double as = 0.0d;
    private double ap = 0.0d;
    private double aq = 0.0d;
    private double q = 0.0d;
    private double af = 0.0d;
    private double at = 75.0d;
    private boolean ag = false;
    private boolean ai = false;
    private boolean z = true;
    private boolean ae = false;
    private boolean ab = false;

    public static /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.health_data_inputbloodpressure);
        this.f = this;
        o();
        i();
        h();
        g();
    }

    private void e(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topToTop = i2;
            view.setLayoutParams(layoutParams2);
        }
    }

    private void b(View view, View view2, View view3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        if ((layoutParams instanceof ConstraintLayout.LayoutParams) && (layoutParams2 instanceof ConstraintLayout.LayoutParams) && (layoutParams3 instanceof ConstraintLayout.LayoutParams)) {
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams4.setMarginStart(0);
            layoutParams4.startToEnd = -1;
            layoutParams4.endToEnd = 0;
            layoutParams4.startToStart = 0;
            view.setLayoutParams(layoutParams4);
            ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams5.setMarginStart(2);
            layoutParams5.startToEnd = view.getId();
            layoutParams5.startToStart = -1;
            layoutParams5.endToEnd = -1;
            view2.setLayoutParams(layoutParams5);
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams6.bottomMargin = 0;
            layoutParams6.bottomToBottom = view.getId();
            layoutParams6.endToStart = view.getId();
            view3.setLayoutParams(layoutParams6);
        }
    }

    private void g() {
        String strD = vzm.a.d(this.al);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        findViewById(R.id.measure_exception_card).setVisibility(0);
        ((HealthTextView) findViewById(R.id.measure_exception_desc)).setText(strD);
        ImageView imageView = (ImageView) findViewById(R.id.measure_exception_icon);
        int i2 = this.al;
        if (i2 == 2) {
            imageView.setImageResource(R.drawable.ic_bp_wrong_posture);
            return;
        }
        if (i2 == 3) {
            imageView.setImageResource(R.drawable.ic_bp_moving);
            return;
        }
        if (i2 == 4) {
            imageView.setImageResource(R.drawable.ic_bp_after_exercise);
            return;
        }
        if (i2 == 5) {
            imageView.setImageResource(R.drawable.ic_bp_wear_wrongly);
            return;
        }
        switch (i2) {
            case 9:
                imageView.setImageResource(R.drawable.ic_bp_abnomal_heart_rate);
                break;
            case 10:
            case 11:
                imageView.setImageResource(R.drawable.ic_bp_wear_loose);
                break;
        }
    }

    private void o() {
        b();
        if (LanguageUtil.c(this.f)) {
            e(this.u, R.id.input_blood_pressure_high);
            e(this.ak, R.id.input_blood_pressure_low);
            e(this.av, R.id.input_blood_pressure_bmp_number);
        }
        if (LanguageUtil.br(this.f)) {
            b(this.u, this.x, this.w);
            b(this.ak, this.aa, this.am);
        }
        this.y.setData(c(40, 300), 10, 40);
        this.y.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: upq
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public final void onSelected(List list, int i2) {
                this.e.c(list, i2);
            }
        });
        this.an.setData(c(30, 200), 10, 40);
        this.an.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: upr
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public final void onSelected(List list, int i2) {
                this.f50452c.d(list, i2);
            }
        });
        this.au.setData(c(30, 180), 10, 40);
        this.au.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: upp
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public final void onSelected(List list, int i2) {
                this.f50451b.b(list, i2);
            }
        });
        this.s.setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        BloodPressureMeasureActionManager bloodPressureMeasureActionManager = new BloodPressureMeasureActionManager(this);
        this.h = bloodPressureMeasureActionManager;
        bloodPressureMeasureActionManager.e(new BloodPressureMeasureActionManager.CustomActionChangeListener() { // from class: uph
            @Override // com.huawei.ui.main.stories.health.bloodpressure.BloodPressureMeasureActionManager.CustomActionChangeListener
            public final void onAddAction(String str) {
                this.f50443b.a(str);
            }
        });
        this.h.d(this.o);
        a((HiHealthData) null);
        k();
        f();
    }

    public /* synthetic */ void c(List list, int i2) {
        double d2 = i2 + 40;
        this.q = d2;
        this.x.setText(BloodPressureUtil.a(d2));
    }

    public /* synthetic */ void d(List list, int i2) {
        double d2 = i2 + 30;
        this.af = d2;
        this.aa.setText(BloodPressureUtil.a(d2));
    }

    public /* synthetic */ void b(List list, int i2) {
        double d2 = i2 + 30;
        this.at = d2;
        this.ax.setText(BloodPressureUtil.a(d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.d.add(str);
        this.ah.add(str);
        this.p = !this.d.isEmpty();
        a(true);
        BloodPressureUtil.d(this.f, this.ah);
    }

    private void b(List<String> list) {
        this.d.removeAll(list);
        this.ah.removeAll(list);
        List<uwu> listA = BloodPressureUtil.a();
        List<String> arrayList = new ArrayList<>();
        d(this.r, listA, arrayList);
        for (String str : this.d) {
            uwu uwuVar = new uwu(str);
            uwuVar.d(true);
            if (arrayList.contains(str)) {
                uwuVar.b(true);
            }
            for (uwu uwuVar2 : this.h.d()) {
                if (uwuVar2.g() && uwuVar2.b().equals(str)) {
                    uwuVar.a(true);
                }
            }
            listA.add(uwuVar);
        }
        BloodPressureUtil.e(listA);
        this.p = !this.d.isEmpty();
        this.h.d(listA);
        a(true);
        BloodPressureUtil.d(this.f, this.ah);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HiHealthData hiHealthData) {
        this.r = hiHealthData;
        List<uwu> listA = BloodPressureUtil.a();
        List<String> arrayList = new ArrayList<>();
        d(hiHealthData, listA, arrayList);
        this.d = new ArrayList();
        List<String> listD = BloodPressureUtil.d(this.f);
        this.ah = new ArrayList(listD);
        a(listA, arrayList, listD);
        for (String str : arrayList) {
            if (!listD.contains(str)) {
                uwu uwuVar = new uwu(str);
                this.d.add(str);
                uwuVar.d(true);
                uwuVar.b(true);
                uwuVar.a(true);
                listA.add(uwuVar);
            }
        }
        for (String str2 : listD) {
            uwu uwuVar2 = new uwu(str2);
            uwuVar2.d(true);
            if (arrayList.contains(str2)) {
                uwuVar2.a(true);
            }
            listA.add(uwuVar2);
            this.d.add(str2);
        }
        BloodPressureUtil.e(listA);
        this.p = !this.d.isEmpty();
        this.h.d(listA);
    }

    private void a(List<uwu> list, List<String> list2, List<String> list3) {
        for (uwu uwuVar : list) {
            String strB = uwuVar.b();
            if (!TextUtils.isEmpty(strB) && (!e.contains(strB) || uwuVar.f())) {
                list2.remove(strB);
                list3.remove(strB);
            }
        }
    }

    private void d(HiHealthData hiHealthData, List<uwu> list, List<String> list2) {
        if (hiHealthData == null) {
            return;
        }
        BloodPressureUtil.d(BloodPressureUtil.a(hiHealthData.getInt("point_value")), list);
        if (TextUtils.isEmpty(hiHealthData.getMetaData())) {
            return;
        }
        HiBloodPressureMetaData hiBloodPressureMetaData = (HiBloodPressureMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiBloodPressureMetaData.class);
        List<String> activityActions = hiBloodPressureMetaData.getActivityActions();
        if (hiBloodPressureMetaData == null || njy.e(activityActions)) {
            return;
        }
        list2.addAll(activityActions);
    }

    private List<String> c(int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        while (i2 <= i3) {
            arrayList.add(BloodPressureUtil.a(i2));
            i2 += 10;
        }
        return arrayList;
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.input_blood_press_title);
        this.bb = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(0);
        this.m = (LinearLayout) findViewById(R.id.input_blood_pressure_date_layout);
        this.bc = (LinearLayout) findViewById(R.id.input_blood_pressure_time_layout);
        ((HealthTextView) findViewById(R.id.input_blood_pressure_text)).setText(getString(R.string.IDS_hw_show_main_home_page_bloodpressure));
        ((HealthTextView) findViewById(R.id.input_blood_pressure_bmp)).setText(getString(R.string.IDS_hw_health_show_pulse_heart_bmp));
        this.i = (HealthTextView) findViewById(R.id.input_blood_pressure_date);
        this.j = (HealthTextView) findViewById(R.id.input_blood_pressure_time);
        this.aw = (HealthButton) findViewById(R.id.input_blood_pressure_confirm);
        this.x = (HealthTextView) findViewById(R.id.input_blood_pressure_high);
        this.aa = (HealthTextView) findViewById(R.id.input_blood_pressure_low);
        this.w = (HealthTextView) findViewById(R.id.text_blood_pressure_high);
        this.am = (HealthTextView) findViewById(R.id.text_blood_pressure_low);
        this.ax = (HealthTextView) findViewById(R.id.input_blood_pressure_bmp_number);
        this.f27496b = (ImageView) findViewById(R.id.input_blood_pressure_bmp_add);
        this.ao = findViewById(R.id.input_blood_pressure_bmp_layout);
        ScrollScaleView scrollScaleView = (ScrollScaleView) findViewById(R.id.input_blood_pressure_high_scale);
        this.y = scrollScaleView;
        scrollScaleView.setCustomStartColor(getColor(R.color.blood_pressure_subtab_item_text));
        ScrollScaleView scrollScaleView2 = (ScrollScaleView) findViewById(R.id.input_blood_pressure_low_scale);
        this.an = scrollScaleView2;
        scrollScaleView2.setCustomStartColor(getColor(R.color.blood_pressure_subtab_item_text));
        ScrollScaleView scrollScaleView3 = (ScrollScaleView) findViewById(R.id.input_blood_pressure_bmp_scale);
        this.au = scrollScaleView3;
        scrollScaleView3.setCustomStartColor(getColor(R.color.blood_pressure_subtab_item_text));
        this.v = (ImageView) findViewById(R.id.input_blood_pressure_date_arrow);
        this.ad = (ImageView) findViewById(R.id.input_blood_pressure_time_arrow);
        if (LanguageUtil.ba(this.f)) {
            this.v.setImageResource(R.drawable.common_ui_arrow_left);
            this.ad.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.v.setImageResource(R.drawable.common_ui_arrow_right);
            this.ad.setImageResource(R.drawable.common_ui_arrow_right);
        }
        this.u = (HealthTextView) findViewById(R.id.input_blood_pressure_high_unit);
        this.ak = (HealthTextView) findViewById(R.id.input_blood_pressure_low_unit);
        this.av = (HealthTextView) findViewById(R.id.input_blood_pressure_bpm_unit);
        this.o = (HealthFlowLayout) findViewById(R.id.measure_action_flow_layout);
        this.s = (HealthSubHeader) findViewById(R.id.blood_measure_hwSubHeader);
        this.av.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hw_pulse_unit, 1).replace(TimeModel.NUMBER_FORMAT, ""));
        s();
    }

    private void s() {
        View viewFindViewById = findViewById(R.id.measure_activity_custom);
        this.k = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: upf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50441b.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        if (qrs.c(1000)) {
            return;
        }
        HealthRecycleView healthRecycleView = new HealthRecycleView(this.f);
        healthRecycleView.setScrollBarStyle(R.style.health_scrollbar);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.f));
        final CustomActionDialogAdapter customActionDialogAdapter = new CustomActionDialogAdapter(this.f);
        customActionDialogAdapter.e(this.d);
        healthRecycleView.setAdapter(customActionDialogAdapter);
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this.f).a(healthRecycleView).d(R.string.IDS_custom_delete_tag).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: upj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f50445c.c(customActionDialogAdapter, dialogInterface, i2);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: upi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InputBloodPressureActivity.b(dialogInterface, i2);
            }
        });
        builderA.c().setTextColor(this.f.getColor(R.color.blood_pressure_dialog_negative));
        builderA.c().setText(this.f.getString(R.string.IDS_hw_show_healthdata_bloodsugar_delete));
        builderA.a().setTextColor(this.f.getColor(R.color.blood_pressure_subtab_item_text));
        CustomAlertDialog customAlertDialogB = builderA.b();
        customAlertDialogB.setCanceledOnTouchOutside(false);
        if (this.d.size() > 5) {
            WindowManager.LayoutParams attributes = customAlertDialogB.getWindow().getAttributes();
            attributes.height = qrs.d(this.f, 340.0f);
            customAlertDialogB.getWindow().setAttributes(attributes);
        }
        customAlertDialogB.show();
    }

    public /* synthetic */ void c(CustomActionDialogAdapter customActionDialogAdapter, DialogInterface dialogInterface, int i2) {
        b(customActionDialogAdapter.a());
    }

    private void f() {
        this.m.setOnClickListener(this);
        this.bc.setOnClickListener(this);
        this.f27496b.setOnClickListener(this);
        this.aw.setOnClickListener(this);
        this.bb.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: upk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50446a.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("InputBloodPressureActivity", "initClickEvent onClick mIsShowInputting = ", Boolean.valueOf(this.ae));
        if (!this.ae) {
            setResult(-1);
            finish();
            return;
        }
        a(false);
        this.ae = false;
        if (this.z) {
            this.bb.setRightSoftkeyVisibility(8);
            this.bb.setRightButtonVisibility(8);
        } else {
            this.bb.setRightSoftkeyBackground(qqz.c(this.f, R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
            this.bb.setRightSoftkeyVisibility(0);
            this.bb.setRightButtonDrawable(ContextCompat.getDrawable(this.f, R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
            this.bb.setRightButtonVisibility(0);
        }
        a(false, 8);
        a();
    }

    private void j() {
        if (LanguageUtil.ba(this.f)) {
            this.bb.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_rtl_back_selector), qre.f(R.string.accessibility_go_back));
        } else {
            this.bb.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
        }
    }

    private void k() {
        Intent intent = getIntent();
        if (intent != null) {
            this.z = intent.getBooleanExtra("isShowInput", false);
            this.ab = intent.getBooleanExtra("isInputData", true);
        }
        if (this.z) {
            a(true);
            a(true, 0);
            this.bb.setRightSoftkeyVisibility(8);
            this.bb.setRightButtonVisibility(8);
            this.bb.setTitleText(this.f.getString(R.string.IDS_hw_health_show_healthdata_input));
            this.aw.setVisibility(0);
            this.f27496b.setVisibility(0);
            return;
        }
        a(false);
        a(false, 8);
        this.bb.setRightButtonVisibility(0);
        this.bb.setRightButtonDrawable(ContextCompat.getDrawable(this.f, R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.bb.setRightSoftkeyVisibility(0);
        this.bb.setRightSoftkeyBackground(qqz.c(this.f, R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
        this.bb.setTitleText(this.f.getString(R.string.IDS_blood_pressure_detail));
        this.aw.setVisibility(8);
        this.bb.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: upg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50442b.a(view);
            }
        });
        this.bb.setRightButtonOnClickListener(new View.OnClickListener() { // from class: upn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50449b.c(view);
            }
        });
        this.f27496b.setVisibility(8);
    }

    public /* synthetic */ void a(View view) {
        this.ae = true;
        this.bb.setRightSoftkeyVisibility(8);
        this.bb.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
        if (this.ab) {
            this.f27496b.setVisibility(0);
            a(true, 0);
        }
        this.bb.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_public_cancel_1), qre.f(R.string.accessibility_close));
        a(true);
    }

    public /* synthetic */ void c(View view) {
        e();
    }

    private void a(boolean z) {
        this.k.setVisibility((this.p && z) ? 0 : 8);
        this.h.a(z);
    }

    private void a(boolean z, int i2) {
        c(z, i2);
    }

    private void c(boolean z, int i2) {
        this.y.setNoScroll(z);
        this.an.setNoScroll(z);
        this.au.setNoScroll(z);
        this.m.setEnabled(z);
        this.bc.setEnabled(z);
        this.v.setVisibility(i2);
        this.ad.setVisibility(i2);
        j();
    }

    private void e() {
        LogUtil.a("InputBloodPressureActivity", "showNotInput onClick mIsShowInputting = ", Boolean.valueOf(this.ae));
        if (!this.ae) {
            t();
            return;
        }
        if (this.ab && l()) {
            return;
        }
        this.ae = false;
        j();
        this.y.setNoScroll(false);
        this.an.setNoScroll(false);
        this.au.setNoScroll(false);
        d();
        if (this.z) {
            this.bb.setRightSoftkeyVisibility(8);
            this.bb.setRightButtonVisibility(8);
            this.f27496b.setVisibility(0);
        } else {
            this.bb.setRightSoftkeyBackground(ContextCompat.getDrawable(this.f, R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
            this.bb.setRightSoftkeyVisibility(0);
            this.bb.setRightButtonDrawable(ContextCompat.getDrawable(this.f, R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
            this.bb.setRightButtonVisibility(0);
            this.f27496b.setVisibility(8);
            c(false, 8);
        }
    }

    private void t() {
        final PrivacyDataModel privacyDataModel = new PrivacyDataModel();
        privacyDataModel.setStartTime(this.n);
        privacyDataModel.setEndTime(this.n);
        privacyDataModel.setModifyTime(this.n);
        privacyDataModel.setClientId(this.g);
        String string = getResources().getString(R.string.IDS_hw_health_show_healthdata_mmhg_str);
        privacyDataModel.setDataTitle(BloodPressureUtil.a(this.q) + "/" + BloodPressureUtil.a(this.q) + " " + string);
        privacyDataModel.putInt(BleConstants.BLOODPRESSURE_DIASTOLIC, (int) this.af);
        privacyDataModel.putInt(BleConstants.BLOODPRESSURE_SYSTOLIC, (int) this.q);
        int i2 = (int) this.at;
        if (i2 == 0) {
            privacyDataModel.putInt(BleConstants.BLOODPRESSURE_SPHYGMUS, Integer.MIN_VALUE);
        } else {
            privacyDataModel.putInt(BleConstants.BLOODPRESSURE_SPHYGMUS, i2);
        }
        privacyDataModel.putInt("measureAbnormal", this.al);
        final PopViewList popViewList = new PopViewList(this.f, this.bb, new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_privacy_data_detail))));
        popViewList.b(new PopViewList.PopViewClickListener() { // from class: upm
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i3) {
                this.e.d(popViewList, privacyDataModel, i3);
            }
        });
    }

    public /* synthetic */ void d(PopViewList popViewList, PrivacyDataModel privacyDataModel, int i2) {
        popViewList.d();
        PageModelArgs pageModelArgs = new PageModelArgs();
        pageModelArgs.setDataSource(3);
        pageModelArgs.setPageType(107);
        Intent intent = new Intent();
        intent.putExtra("extra_privacy_data_model", privacyDataModel);
        intent.putExtra("extra_page_model_args", pageModelArgs);
        intent.setClass(this.f, PrivacyDetailActivity.class);
        startActivity(intent);
    }

    private void d() {
        if (this.ab) {
            m();
            long j2 = this.aj;
            long j3 = this.ac;
            if (j2 == j3) {
                new e(this, j3, new double[]{this.q, this.af, this.at}, this.h.d()).a("-1");
                LogUtil.a("InputBloodPressureActivity", "insert data: ", Long.toString(this.aj), Long.toString(this.ac));
                return;
            } else {
                uwf.d().d(this.aj, new d(new e(this, this.ac, new double[]{this.q, this.af, this.at}, this.h.d())));
                LogUtil.a("InputBloodPressureActivity", "delete data: ", Long.toString(this.aj));
                return;
            }
        }
        n();
    }

    private void n() {
        HiHealthNativeApi.a(this.f).fetchDataSource(HiDataSourceFetchOption.builder().c(1).b(new int[]{this.g}).a(), new b(new e(this, this.ac, new double[]{this.q, this.af, this.at}, this.h.d())));
    }

    private void i() {
        Intent intent = getIntent();
        if (intent != null) {
            this.q = intent.getDoubleExtra("high", 128.0d);
            this.af = intent.getDoubleExtra("low", 88.0d);
            this.n = intent.getLongExtra("deletetime", -1L);
            this.at = intent.getDoubleExtra("bmp", 0.0d);
            this.al = intent.getIntExtra("measureAbnormal", 1);
            this.g = intent.getIntExtra("clientId", 0);
            this.f27497c = intent.getIntExtra("BI_Tag", 0);
            this.ag = intent.getBooleanExtra("isStartNewActivity", false);
            this.l = intent.getStringExtra("from");
            this.as = this.q;
            this.ap = this.af;
            this.aj = this.n;
            a(this.at);
            if (this.n != -1) {
                if (Double.compare(this.at, 0.0d) == 0) {
                    uwf uwfVarD = uwf.d();
                    Context applicationContext = getApplicationContext();
                    long j2 = this.n;
                    uwfVarD.b(applicationContext, j2, j2, new a(this));
                }
                HiDataReadOption hiDataReadOption = new HiDataReadOption();
                hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()});
                hiDataReadOption.setStartTime(this.n);
                hiDataReadOption.setEndTime(this.n);
                HiHealthNativeApi.a(this.f).readHiHealthData(hiDataReadOption, new f(this));
            }
            if (this.z) {
                this.ac = System.currentTimeMillis();
            } else {
                this.ac = this.n;
            }
            this.aq = this.at;
            this.ar = this.ac;
        }
    }

    private void h() {
        int i2 = (int) (this.q - 40.0d);
        int i3 = (int) (this.af - 30.0d);
        this.y.setSelectedPosition(i2);
        this.an.setSelectedPosition(i3);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.ac);
        this.i.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd")).format(calendar.getTime()));
        this.j.setText(qrk.a(this.f, this.ac, 1));
        this.x.setText(BloodPressureUtil.a(this.q));
        this.aa.setText(BloodPressureUtil.a(this.af));
    }

    private void a() {
        this.q = this.as;
        this.af = this.ap;
        double d2 = this.aq;
        this.at = d2;
        this.n = this.aj;
        this.ac = this.ar;
        a(d2);
        h();
    }

    private boolean l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.ac;
        if (jCurrentTimeMillis < j2) {
            qpx.b(this.f, R.string.IDS_hw_health_show_healthdata_timeerror);
            return true;
        }
        if (this.af > this.q) {
            qpx.b(this.f, R.string.IDS_hw_health_show_healthdata_bloodpresserror);
            return true;
        }
        LogUtil.a("InputBloodPressureActivity", "isDataError mInsertTime = ", Long.valueOf(j2));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(double d2) {
        if (((int) d2) != 0) {
            this.ao.setVisibility(0);
            this.au.setSelectedPosition((int) (d2 - 30.0d));
            this.f27496b.setBackgroundResource(R.drawable.ic_public_cancel_2);
            this.ax.setText(BloodPressureUtil.a(d2));
            this.ai = true;
        } else {
            this.ao.setVisibility(8);
            this.f27496b.setBackgroundResource(R.drawable.ic_public_add);
            if (!this.z && !this.ae) {
                this.f27496b.setVisibility(8);
            }
            this.ai = false;
        }
        this.aq = d2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.m) {
            if (this.z) {
                q();
                return;
            } else {
                if (this.ae) {
                    q();
                    return;
                }
                return;
            }
        }
        if (view == this.bc) {
            if (this.z) {
                p();
                return;
            } else {
                if (this.ae) {
                    p();
                    return;
                }
                return;
            }
        }
        if (view == this.f27496b) {
            if (this.ai) {
                a(0.0d);
                this.at = 0.0d;
                return;
            } else {
                a(75.0d);
                this.at = 75.0d;
                return;
            }
        }
        if (view != this.aw || l()) {
            return;
        }
        this.aw.setEnabled(false);
        this.aw.setAlpha(0.6f);
        Context context = this.f;
        long j2 = this.ac;
        ino.c(context, new j(this, j2, new e(this, j2, new double[]{this.q, this.af, this.at}, this.h.d())));
    }

    private void q() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.ac);
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(this, new HealthDatePickerDialog.DateSelectedListener() { // from class: upo
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public final void onDateSelected(int i2, int i3, int i4) {
                this.f50450a.d(calendar, i2, i3, i4);
            }
        }, new GregorianCalendar(calendar.get(1), calendar.get(2), calendar.get(5)));
        Calendar calendar2 = Calendar.getInstance();
        healthDatePickerDialog.a(new GregorianCalendar(2014, 0, 1), new GregorianCalendar(calendar2.get(1), calendar2.get(2), calendar2.get(5)));
        healthDatePickerDialog.b(true);
        healthDatePickerDialog.d(getColor(R.color.blood_pressure_subtab_item_text));
        healthDatePickerDialog.show();
    }

    public /* synthetic */ void d(Calendar calendar, int i2, int i3, int i4) {
        calendar.set(i2, i3, i4);
        this.ac = calendar.getTimeInMillis();
        this.i.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd")).format(Long.valueOf(this.ac)));
    }

    private void p() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.ac);
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog(this, new HealthTimePickerDialog.TimeSelectedListener() { // from class: upl
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public final void onTimeSelected(int i2, int i3) {
                this.f50447c.d(calendar, i2, i3);
            }
        });
        healthTimePickerDialog.b(0, 0, 0, calendar.get(11), calendar.get(12));
        healthTimePickerDialog.e(getString(R.string.IDS_hw_health_show_healthdata_measure_time));
        healthTimePickerDialog.c(getColor(R.color.blood_pressure_subtab_item_text));
        healthTimePickerDialog.e(getColor(R.color.blood_pressure_subtab_item_text));
        healthTimePickerDialog.show();
    }

    public /* synthetic */ void d(Calendar calendar, int i2, int i3) {
        calendar.set(11, i2);
        calendar.set(12, i3);
        long timeInMillis = calendar.getTimeInMillis();
        this.ac = timeInMillis;
        this.j.setText(qrk.a(this.f, timeInMillis, 1));
        calendar.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (TextUtils.isEmpty(this.l)) {
            map.put("from", 1);
        } else {
            String str = this.l;
            str.hashCode();
            if (str.equals("/todoTask/TodoListActivity")) {
                map.put("from", 3);
            } else if (str.equals("/PluginHealthModel/HealthModelActivity")) {
                map.put("from", 2);
            } else {
                map.put("from", 1);
            }
        }
        if (this.f27497c == 1) {
            map.put("type", "1");
        } else {
            map.put("type", "2");
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_INPUT_2030027.value(), map, 0);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements HiDataClientListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f27499a;

        b(e eVar) {
            this.f27499a = eVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(List<HiHealthClient> list) {
            String deviceUuid;
            if (njy.b(list)) {
                deviceUuid = list.get(0).getDeviceUuid();
            } else {
                LogUtil.j("InputBloodPressureActivity", "Failed to read deviceUuid");
                deviceUuid = "-1";
            }
            this.f27499a.a(deviceUuid);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<InputBloodPressureActivity> f27498c;

        a(InputBloodPressureActivity inputBloodPressureActivity) {
            this.f27498c = new WeakReference<>(inputBloodPressureActivity);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            InputBloodPressureActivity inputBloodPressureActivity = this.f27498c.get();
            if (inputBloodPressureActivity != null) {
                Message.obtain(inputBloodPressureActivity.t, 2, obj).sendToTarget();
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class i extends BaseHandler<InputBloodPressureActivity> {
        i(InputBloodPressureActivity inputBloodPressureActivity) {
            super(inputBloodPressureActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(InputBloodPressureActivity inputBloodPressureActivity, Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    inputBloodPressureActivity.a(((Double) message.obj).doubleValue());
                    return;
                }
                if (i == 3) {
                    if (!(message.obj instanceof List)) {
                        LogUtil.j("InputBloodPressureActivity", "msg.obj is not List");
                        return;
                    }
                    List list = (List) message.obj;
                    if (!njy.e(list)) {
                        inputBloodPressureActivity.a((HiHealthData) list.get(0));
                        return;
                    } else {
                        LogUtil.a("InputBloodPressureActivity", "refreshBloodPressure no data");
                        inputBloodPressureActivity.aw.setEnabled(false);
                        return;
                    }
                }
                LogUtil.j("InputBloodPressureActivity", "handleMessage what undefined");
                return;
            }
            qqj.a(inputBloodPressureActivity.getApplicationContext(), 8);
            if (inputBloodPressureActivity.ag) {
                Intent intent = new Intent(inputBloodPressureActivity, (Class<?>) KnitBloodPressureActivity.class);
                intent.putExtra("edit", true);
                intent.putExtra("time", inputBloodPressureActivity.ac);
                inputBloodPressureActivity.setResult(-1, intent);
                inputBloodPressureActivity.finish();
                inputBloodPressureActivity.startActivity(intent);
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("edit", true);
                intent2.putExtra("time", inputBloodPressureActivity.ac);
                inputBloodPressureActivity.setResult(-1, intent2);
                inputBloodPressureActivity.finish();
            }
            for (String str : InputBloodPressureActivity.f27495a) {
                LogUtil.a("InputBloodPressureActivity", "InsertTime: " + new Date(inputBloodPressureActivity.ac));
                ObserverManagerUtil.e(str, Long.valueOf(inputBloodPressureActivity.ac));
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class j implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f27503c;
        private final WeakReference<InputBloodPressureActivity> d;
        private final long e;

        j(InputBloodPressureActivity inputBloodPressureActivity, long j, e eVar) {
            this.d = new WeakReference<>(inputBloodPressureActivity);
            this.f27503c = eVar;
            this.e = j;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            InputBloodPressureActivity inputBloodPressureActivity = this.d.get();
            if (inputBloodPressureActivity != null) {
                LogUtil.j("InputBloodPressureActivity", "activity is notNull");
                inputBloodPressureActivity.m();
            }
            uwf.d().d(this.e, new d(this.f27503c));
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<InputBloodPressureActivity> f27500b;

        c(InputBloodPressureActivity inputBloodPressureActivity) {
            this.f27500b = new WeakReference<>(inputBloodPressureActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0) {
                LogUtil.a("InputBloodPressureActivity", "onResponse: start sync cloud");
                vdd.d(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value());
            }
            InputBloodPressureActivity inputBloodPressureActivity = this.f27500b.get();
            if (inputBloodPressureActivity == null) {
                LogUtil.j("InputBloodPressureActivity", "activity is null");
            } else {
                LogUtil.a("InputBloodPressureActivity", "onResponse, errorCode = ", Integer.valueOf(i), ", data = ", obj);
                Message.obtain(inputBloodPressureActivity.t, 1).sendToTarget();
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements IBaseResponseCallback {
        private final e d;

        d(e eVar) {
            this.d = eVar;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("InputBloodPressureActivity", "DeleteDataCallback onResponse Success");
            if (i == 0) {
                LogUtil.a("InputBloodPressureActivity", "DeleteDataResponseCallback onResponse delete successful");
            } else {
                LogUtil.a("InputBloodPressureActivity", "DeleteDataResponseCallback onResponse delete failed");
            }
            this.d.a("-1");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<uwu> f27501a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<InputBloodPressureActivity> f27502c;
        private final long d;
        private final double[] e;

        e(InputBloodPressureActivity inputBloodPressureActivity, long j, double[] dArr, List<uwu> list) {
            this.f27502c = new WeakReference<>(inputBloodPressureActivity);
            this.d = j;
            this.e = dArr;
            this.f27501a = list;
        }

        protected void a(String str) {
            double[] dArrCopyOf = Arrays.copyOf(this.e, 4);
            dArrCopyOf[3] = BloodPressureUtil.d(this.f27501a);
            uwf.d().a(this.d, dArrCopyOf, BloodPressureUtil.a(this.f27501a), str, new c(this.f27502c.get()));
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class f implements HiDataReadResultListener {
        WeakReference<InputBloodPressureActivity> e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        f(InputBloodPressureActivity inputBloodPressureActivity) {
            this.e = new WeakReference<>(inputBloodPressureActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("InputBloodPressureActivity", "ReadComplete onResponse Success");
            InputBloodPressureActivity inputBloodPressureActivity = this.e.get();
            if (inputBloodPressureActivity == null || inputBloodPressureActivity.isFinishing()) {
                LogUtil.j("InputBloodPressureActivity", "activity is not exist");
                return;
            }
            Object obj2 = obj instanceof SparseArray ? ((SparseArray) obj).get(DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()) : null;
            Message messageObtainMessage = inputBloodPressureActivity.t.obtainMessage();
            messageObtainMessage.what = 3;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = obj2;
            inputBloodPressureActivity.t.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
