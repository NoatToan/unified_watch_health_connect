package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.format.DateFormat;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.view.dashboard.BloodSugarDashboardView;
import com.huawei.ui.commonui.linechart.view.dashboard.DashboardRingView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodMeasureResultActivity;
import com.huawei.ui.main.stories.health.adapter.CustomActionDialogAdapter;
import com.huawei.ui.main.stories.health.bloodpressure.BloodPressureMeasureActionManager;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import defpackage.ftw;
import defpackage.njy;
import defpackage.nkb;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.uwf;
import defpackage.uwu;
import defpackage.vdo;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BloodMeasureResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BloodSugarDashboardView f27400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BloodPressureMeasureActionManager f27401c;
    private Context d;
    private HealthTextView e;
    private View f;
    private Handler g;
    private HealthFlowLayout h;
    private boolean i;
    private int j;
    private List<String> k;
    private long l;
    private HealthButton m;
    private HiHealthData n;
    private HealthTextView o;

    public static /* synthetic */ void e(DialogInterface dialogInterface, int i) {
    }

    static class b extends BaseHandler<BloodMeasureResultActivity> {
        b(BloodMeasureResultActivity bloodMeasureResultActivity) {
            super(bloodMeasureResultActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BloodMeasureResultActivity bloodMeasureResultActivity, Message message) {
            int i = message.what;
            if (i == 0) {
                if (!(message.obj instanceof List)) {
                    LogUtil.a("BloodMeasureResultActivity", "no data");
                    return;
                }
                List list = (List) message.obj;
                if (!njy.e(list)) {
                    bloodMeasureResultActivity.n = (HiHealthData) list.get(0);
                    bloodMeasureResultActivity.h();
                    return;
                } else {
                    LogUtil.a("BloodMeasureResultActivity", "refreshBloodPressure no data");
                    return;
                }
            }
            if (i != 1) {
                return;
            }
            if (bloodMeasureResultActivity.j == 11) {
                LogUtil.a("BloodMeasureResultActivity", "from health_model", " lastDataTime is : ", Long.valueOf(bloodMeasureResultActivity.l));
                Intent intent = new Intent(bloodMeasureResultActivity, (Class<?>) KnitBloodPressureActivity.class);
                intent.putExtra("key_bundle_health_last_data_time", bloodMeasureResultActivity.l);
                bloodMeasureResultActivity.startActivity(intent);
                bloodMeasureResultActivity.finish();
            } else {
                bloodMeasureResultActivity.finish();
            }
            LogUtil.a("BloodMeasureResultActivity", "insertResult=", Integer.valueOf(message.arg1));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blood_measure_result);
        this.d = this;
        if (getIntent() != null) {
            this.j = getIntent().getIntExtra(ArkUIXConstants.FROM_TYPE, 0);
        }
        LogUtil.a("BloodMeasureResultActivity", "fromtype: ", Integer.valueOf(this.j));
        b();
        a();
    }

    private void b() {
        ((HealthSubHeader) findViewById(R.id.blood_measure_hwSubHeader)).setSubHeaderBackgroundColor(getColor(R.color.common_transparent));
        this.o = (HealthTextView) findViewById(R.id.hw_health_pulse_heart);
        this.e = (HealthTextView) findViewById(R.id.input_blood_pressure_date);
        this.f27399a = (HealthTextView) findViewById(R.id.input_blood_pressure_time);
        this.f27400b = (BloodSugarDashboardView) findViewById(R.id.blood_sugar_dashboard_view);
        HealthButton healthButton = (HealthButton) findViewById(R.id.hw_measure_result_button);
        this.m = healthButton;
        healthButton.setAlpha(R.dimen.dividerLineAlpha);
        this.m.setClickable(false);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: unp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        d();
        this.g = new b(this);
        c();
    }

    public /* synthetic */ void e(View view) {
        this.m.setEnabled(false);
        e();
    }

    private void c() {
        this.h = (HealthFlowLayout) findViewById(R.id.measure_action_flow_layout);
        BloodPressureMeasureActionManager bloodPressureMeasureActionManager = new BloodPressureMeasureActionManager(this);
        this.f27401c = bloodPressureMeasureActionManager;
        bloodPressureMeasureActionManager.d(this.h);
        this.f27401c.e(new BloodPressureMeasureActionManager.CustomActionChangeListener() { // from class: unm
            @Override // com.huawei.ui.main.stories.health.bloodpressure.BloodPressureMeasureActionManager.CustomActionChangeListener
            public final void onAddAction(String str) {
                this.f50406a.b(str);
            }
        });
        this.f27401c.a(true);
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.k.add(str);
        this.i = true;
        this.f.setVisibility(0);
        BloodPressureUtil.d(this.d, this.k);
    }

    private void d() {
        View viewFindViewById = findViewById(R.id.measure_activity_custom);
        this.f = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: uno
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50409b.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        if (qrs.c(1000)) {
            return;
        }
        HealthRecycleView healthRecycleView = new HealthRecycleView(this.d);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.d));
        final CustomActionDialogAdapter customActionDialogAdapter = new CustomActionDialogAdapter(this.d);
        customActionDialogAdapter.e(this.k);
        healthRecycleView.setAdapter(customActionDialogAdapter);
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this.d).a(healthRecycleView).d(R.string.IDS_custom_delete_tag).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: unn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f50407a.e(customActionDialogAdapter, dialogInterface, i);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: uns
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodMeasureResultActivity.e(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builderA.b();
        builderA.c().setTextColor(this.d.getColor(R.color.blood_pressure_dialog_negative));
        builderA.c().setText(this.d.getString(R.string.IDS_hw_show_healthdata_bloodsugar_delete));
        builderA.a().setTextColor(this.d.getColor(R.color.blood_pressure_subtab_item_text));
        customAlertDialogB.setCanceledOnTouchOutside(false);
        List<String> list = this.k;
        if (list != null && list.size() > 5) {
            WindowManager.LayoutParams attributes = customAlertDialogB.getWindow().getAttributes();
            attributes.height = qrs.d(this.d, 340.0f);
            customAlertDialogB.getWindow().setAttributes(attributes);
        }
        customAlertDialogB.show();
    }

    public /* synthetic */ void e(CustomActionDialogAdapter customActionDialogAdapter, DialogInterface dialogInterface, int i) {
        b(customActionDialogAdapter.a());
    }

    private void a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("BloodMeasureResultActivity", "intent is null");
            return;
        }
        long longExtra = intent.getLongExtra("dataTime", 0L);
        LogUtil.a("BloodMeasureResultActivity", "dataTime=", Long.valueOf(longExtra));
        nkb.d().d(longExtra, longExtra, 1, new c(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.n == null) {
            LogUtil.j("BloodMeasureResultActivity", "updateView, mHiHealthData is null");
            return;
        }
        this.m.setAlpha(R.dimen.emui_divider_alpha);
        this.m.setEnabled(true);
        this.e.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd")).format(Long.valueOf(this.n.getEndTime())));
        this.f27399a.setText(qrk.a((Context) this, this.n.getEndTime(), 1));
        int i = this.n.getInt("BLOOD_PRESSURE_SYSTOLIC");
        int i2 = this.n.getInt("BLOOD_PRESSURE_DIASTOLIC");
        double d = this.n.getDouble(BleConstants.BLOODPRESSURE_SPHYGMUS);
        this.o.setText(getResources().getQuantityString(R.plurals.IDS_hw_pulse_unit, vdo.b(d), Integer.valueOf((int) d)));
        c(i, i2);
        f();
    }

    private void b(List<String> list) {
        this.k.removeAll(list);
        List<uwu> listA = BloodPressureUtil.a();
        for (String str : this.k) {
            uwu uwuVar = new uwu(str);
            uwuVar.d(true);
            for (uwu uwuVar2 : this.f27401c.d()) {
                if (uwuVar2.g() && uwuVar2.b().equals(str)) {
                    uwuVar.a(true);
                }
            }
            listA.add(uwuVar);
        }
        BloodPressureUtil.e(listA);
        this.i = !this.k.isEmpty();
        this.f27401c.d(listA);
        this.f.setVisibility(this.i ? 0 : 8);
        BloodPressureUtil.d(this.d, this.k);
    }

    private void f() {
        int i;
        List<uwu> listA = BloodPressureUtil.a();
        HiHealthData hiHealthData = this.n;
        if (hiHealthData != null && (i = hiHealthData.getInt("beforeMeasureActivity")) > 0) {
            BloodPressureUtil.d(i, listA);
        }
        List<String> listD = BloodPressureUtil.d(this.d);
        this.k = listD;
        boolean zIsEmpty = listD.isEmpty();
        this.i = !zIsEmpty;
        this.f.setVisibility(!zIsEmpty ? 0 : 8);
        Iterator<String> it = listD.iterator();
        while (it.hasNext()) {
            uwu uwuVar = new uwu(it.next());
            uwuVar.d(true);
            listA.add(uwuVar);
        }
        BloodPressureUtil.e(listA);
        this.f27401c.d(listA);
    }

    private void c(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int[] iArrA = BloodPressureUtil.a(this);
        arrayList.add(new DashboardRingView.a(0.0f, 1.0f, getColor(R.color.blood_pressure_low_end)));
        int i3 = 0;
        while (i3 < iArrA.length) {
            int i4 = i3 + 1;
            arrayList.add(new DashboardRingView.a(i4, i3 + 2, iArrA[i3]));
            i3 = i4;
        }
        this.f27400b.setRingAreas(0.0f, arrayList.size(), arrayList);
        int iB = ftw.b(i, i2);
        this.f27400b.setStatusText(ftw.e(i, i2), ftw.e(iB));
        this.f27400b.setCurrentValue(iB + 0.5f);
        this.f27400b.setCurrentValueText(UnitUtil.e(i, 1, 0) + "/" + UnitUtil.e(i2, 1, 0));
        this.f27400b.setCurrentValueTextUnit(getString(R.string.IDS_device_measure_pressure_value_unit));
        this.f27400b.b();
    }

    private void e() {
        String str;
        HiHealthData hiHealthData = this.n;
        if (hiHealthData == null) {
            LogUtil.j("BloodMeasureResultActivity", "save, mHiHealthData is null");
            return;
        }
        int i = hiHealthData.getInt("BLOOD_PRESSURE_SYSTOLIC");
        int i2 = this.n.getInt("BLOOD_PRESSURE_DIASTOLIC");
        double d = this.n.getDouble(BleConstants.BLOODPRESSURE_SPHYGMUS);
        List<String> listA = BloodPressureUtil.a(this.f27401c.d());
        double[] dArr = {i, i2, d, BloodPressureUtil.d(this.f27401c.d())};
        Object obj = this.n.get("device_uniquecode");
        if (!(obj instanceof String)) {
            str = "-1";
        } else {
            str = (String) obj;
        }
        this.l = this.n.getEndTime();
        uwf.d().a(this.l, dArr, listA, str, new c(this, 1));
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<BloodMeasureResultActivity> f27402b;
        private final int e;

        c(BloodMeasureResultActivity bloodMeasureResultActivity, int i) {
            this.f27402b = new WeakReference<>(bloodMeasureResultActivity);
            this.e = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("BloodMeasureResultActivity", "ReadComplete onResponse Success");
            BloodMeasureResultActivity bloodMeasureResultActivity = this.f27402b.get();
            if (bloodMeasureResultActivity == null) {
                return;
            }
            Message messageObtainMessage = bloodMeasureResultActivity.g.obtainMessage();
            messageObtainMessage.what = this.e;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = obj;
            bloodMeasureResultActivity.g.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
