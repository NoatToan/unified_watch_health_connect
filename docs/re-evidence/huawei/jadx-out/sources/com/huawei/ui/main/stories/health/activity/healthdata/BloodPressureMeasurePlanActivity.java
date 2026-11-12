package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.health.bloodpressure.adapter.BloodPressureTargetAdapter;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.GroupBtnSelectedAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodPressureMeasurePlanActivity;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import com.huawei.uikit.hwtimepicker.widget.HwTimePicker;
import com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog;
import defpackage.dfl;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.uth;
import defpackage.uub;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureMeasurePlanActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27408c;
    private Context e;
    private HealthTextView g;
    private HealthTextView h;
    private LinearLayout i;
    private boolean j;
    private GridLayoutManager k;
    private Set<dfl> l;
    private boolean m;
    private HealthButton o;
    private HealthSwitchButton p;
    private HealthRecycleView r;
    private BloodPressureTargetAdapter s;
    private ConstraintLayout t;
    private HealthRecycleView u;
    private GroupBtnSelectedAdapter v;
    private ImageView w;
    private Dialog x;
    private boolean[] n = new boolean[7];
    private int d = 127;
    private int q = 0;
    private boolean f = false;

    public static /* synthetic */ void c(View view) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("BloodPressureMeasurePlanActivity", "onCreate");
        setContentView(R.layout.health_data_bloodpressure_plan);
        this.e = this;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("BloodPressureMeasurePlanActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        h();
        uub.c(new a(this));
    }

    private void h() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.recycleview_target_layout);
        this.r = healthRecycleView;
        healthRecycleView.setIsScroll(false);
        this.r.setLayoutManager(new LinearLayoutManager(this.e));
        this.f27407b = (HealthTextView) findViewById(R.id.blood_pressure_add_time);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.blood_pressure_customize_tips);
        this.g = healthTextView;
        healthTextView.setText(getString(R.string.IDS_blood_pressure_customize_tips, new Object[]{10}));
        this.f27406a = (HealthTextView) findViewById(R.id.delete_plan);
        this.f27408c = (HealthTextView) findViewById(R.id.delete_cancel);
        this.h = (HealthTextView) findViewById(R.id.delete_confirm);
        this.t = (ConstraintLayout) findViewById(R.id.plan_normal_layout);
        this.i = (LinearLayout) findViewById(R.id.plan_delete_edit_layout);
        HealthRecycleView healthRecycleView2 = (HealthRecycleView) findViewById(R.id.recycleview_week_layout);
        this.u = healthRecycleView2;
        healthRecycleView2.setIsConsumption(true);
        this.u.setIsScroll(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.e, 4) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodPressureMeasurePlanActivity.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        this.k = gridLayoutManager;
        this.u.setLayoutManager(gridLayoutManager);
        this.w = (ImageView) findViewById(R.id.text_remind_tips);
        this.p = (HealthSwitchButton) findViewById(R.id.switch_reminder);
        HealthButton healthButton = (HealthButton) findViewById(R.id.target_settings_confirm);
        this.o = healthButton;
        healthButton.setEnabled(false);
    }

    private void d() {
        LogUtil.a("BloodPressureMeasurePlanActivity", "PlanSet = ", this.l);
        Set<dfl> set = this.l;
        if (set == null || set.size() < 2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new dfl(0, 7, 0, 0));
            arrayList.add(new dfl(9, 22, 0, 9));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((dfl) it.next()).b(this.d);
            }
            this.l = new HashSet(arrayList);
            this.s = new BloodPressureTargetAdapter(this, arrayList);
            this.m = false;
        } else {
            ArrayList<dfl> arrayList2 = new ArrayList(this.l);
            Collections.sort(arrayList2, uth.d());
            this.d = ((dfl) arrayList2.get(0)).a();
            boolean z = false;
            for (dfl dflVar : arrayList2) {
                if (dflVar.g() != dflVar.d()) {
                    dflVar.e(dflVar.d());
                    z = true;
                }
                if (dflVar.a() == 0) {
                    this.d = 127;
                    dflVar.b(127);
                    z = true;
                }
            }
            this.m = ((dfl) arrayList2.get(0)).h();
            this.s = new BloodPressureTargetAdapter(this, arrayList2);
            if (z) {
                LogUtil.a("BloodPressureMeasurePlanActivity", "Correct old plan data.");
                this.s.c(this.d, this.m, 1);
            }
        }
        f();
    }

    private void i() {
        this.s.e(new BloodPressureTargetAdapter.OnItemClickListener() { // from class: uob
            @Override // com.huawei.health.health.bloodpressure.adapter.BloodPressureTargetAdapter.OnItemClickListener
            public final void onItemClick(View view, int i) {
                this.e.d(view, i);
            }
        });
        this.r.setAdapter(this.s);
        this.f27407b.setOnClickListener(new View.OnClickListener() { // from class: uoe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50416a.d(view);
            }
        });
        GroupBtnSelectedAdapter groupBtnSelectedAdapter = new GroupBtnSelectedAdapter(this.e, new String[]{this.e.getString(R.string.IDS_monday), this.e.getString(R.string.IDS_tuesday), this.e.getString(R.string.IDS_wednesday), this.e.getString(R.string.IDS_thursday), this.e.getString(R.string.IDS_friday), this.e.getString(R.string.IDS_saturday), this.e.getString(R.string.IDS_sunday)}, this.n, R.layout.item_measure_plan_select);
        this.v = groupBtnSelectedAdapter;
        groupBtnSelectedAdapter.d(new GroupBtnSelectedAdapter.OnItemClickListener() { // from class: unw
            @Override // com.huawei.ui.commonui.adapter.GroupBtnSelectedAdapter.OnItemClickListener
            public final void onItemClick(View view, HealthButton healthButton, int i) {
                this.d.a(view, healthButton, i);
            }
        });
        g();
    }

    public /* synthetic */ void d(View view, int i) {
        LogUtil.a("BloodPressureMeasurePlanActivity", "position:", Integer.valueOf(i), "mShowMode", Integer.valueOf(this.q));
        List<dfl> listD = this.s.d();
        if (njy.e(listD, i)) {
            LogUtil.j("BloodPressureMeasurePlanActivity", "initEvent position is out of mTargetAdapter.getTargetList().");
        } else {
            if (this.q == 0) {
                if (qrs.r()) {
                    return;
                }
                b(uth.c(listD.get(i)), i);
                return;
            }
            this.s.e(i);
        }
    }

    public /* synthetic */ void d(View view) {
        if (qrs.r()) {
            return;
        }
        LogUtil.a("BloodPressureMeasurePlanActivity", "click addTime");
        b(getString(R.string.IDS_blood_pressure_add_time), -1);
    }

    public /* synthetic */ void a(View view, HealthButton healthButton, int i) {
        boolean[] zArr = this.n;
        zArr[i] = !zArr[i];
        if (!a()) {
            boolean[] zArr2 = this.n;
            zArr2[i] = !zArr2[i];
        }
        this.v.d(view, healthButton, i);
        lrd.c(view, qre.f(this.n[i] ? R.string.accessibility_checked : R.string.accessibility_Unchecked));
    }

    private void g() {
        this.u.setAdapter(this.v);
        if (!this.j) {
            this.j = true;
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(0);
            this.u.addItemDecoration(new RecyclerItemDecoration(0, 0, arrayList));
        }
        this.p.setChecked(this.m);
        this.p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodPressureMeasurePlanActivity$$ExternalSyntheticLambda5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f27409b.c(compoundButton, z);
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: uoa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50413a.j(view);
            }
        });
        this.w.setOnClickListener(new View.OnClickListener() { // from class: uoc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50414b.g(view);
            }
        });
    }

    /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        this.m = z;
    }

    public /* synthetic */ void j(View view) {
        if (qrs.r()) {
            return;
        }
        this.o.setEnabled(false);
        this.s.b(e(), this.m);
    }

    public /* synthetic */ void g(View view) {
        if (qrs.r()) {
            return;
        }
        View viewInflate = View.inflate(this.e, R.layout.dialog_reminder_rule, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.reminder_rule_dialog_title);
        healthTextView.setText(R.string.IDS_blood_pressure_remind_title);
        healthTextView.setZoomSize(com.huawei.ui.commonui.R.dimen.health_common_16dp, 1.5f);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.reminder_rule_dialog_content);
        healthTextView2.setText(R.string.IDS_blood_pressure_remind_tips);
        healthTextView2.setZoomSize(com.huawei.ui.commonui.R.dimen.health_common_14dp, 1.5f);
        new CustomViewDialog.Builder(this.e).b(false).d(viewInflate).d(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: unr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodPressureMeasurePlanActivity.c(view2);
            }
        }).d().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        BloodPressureTargetAdapter bloodPressureTargetAdapter = this.s;
        if (bloodPressureTargetAdapter != null && bloodPressureTargetAdapter.getItemCount() <= 2) {
            this.f27406a.setVisibility(8);
        } else {
            this.f27406a.setVisibility(0);
        }
        LogUtil.d("BloodPressureMeasurePlanActivity", Integer.valueOf(this.s.getItemCount()));
        this.f27406a.setOnClickListener(new View.OnClickListener() { // from class: unx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        this.f27408c.setOnClickListener(new View.OnClickListener() { // from class: unz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: uny
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        j();
        this.t.setVisibility(8);
        this.i.setVisibility(0);
    }

    public /* synthetic */ void a(View view) {
        j();
        this.s.b();
        this.t.setVisibility(0);
        this.i.setVisibility(8);
    }

    public /* synthetic */ void e(View view) {
        j();
        this.s.a();
        c();
        this.t.setVisibility(0);
        this.i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final Object obj) {
        LogUtil.a("BloodPressureMeasurePlanActivity", "initPlan, code = ", Integer.valueOf(i), " ,data = ", obj);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: unt
            @Override // java.lang.Runnable
            public final void run() {
                this.f50411a.d(i, obj);
            }
        });
    }

    public /* synthetic */ void d(int i, Object obj) {
        if (i == 0) {
            if (obj instanceof Set) {
                this.l = (Set) obj;
            }
        } else {
            LogUtil.j("BloodPressureMeasurePlanActivity", "getAlarm failed");
        }
        d();
        i();
        c();
        this.v.notifyDataSetChanged();
        this.s.notifyDataSetChanged();
        this.o.setEnabled(true);
        b();
    }

    private void j() {
        int i = this.q == 0 ? 1 : 0;
        this.q = i;
        if (i == 1) {
            this.f = true;
        } else {
            this.f = false;
        }
        this.s.c(i);
    }

    private int e() {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.n;
            if (i >= zArr.length) {
                return i2;
            }
            int i3 = 1;
            if (!zArr[i]) {
                i3 = 0;
            }
            i2 |= i3 << i;
            i++;
        }
    }

    private void f() {
        String str = String.format(Locale.ROOT, "%07d", Integer.valueOf(Integer.toBinaryString(this.d)));
        LogUtil.a("BloodPressureMeasurePlanActivity", "setSelectedDays, mDayOfWeek = ", Integer.valueOf(this.d));
        int i = 0;
        while (true) {
            boolean[] zArr = this.n;
            if (i >= zArr.length) {
                return;
            }
            int i2 = i + 1;
            zArr[(zArr.length - i) - 1] = "1".equals(str.substring(i, i2));
            i = i2;
        }
    }

    private boolean a() {
        for (boolean z : this.n) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private void b(String str, final int i) {
        d(new HealthTimePickerDialog(this, new HwTimePickerDialog.OnButtonClickCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodPressureMeasurePlanActivity.2
            @Override // com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog.OnButtonClickCallback
            public void onPositiveButtonClick(HwTimePicker hwTimePicker) {
                int hour = hwTimePicker.getHour();
                int minute = hwTimePicker.getMinute();
                LogUtil.a("BloodPressureMeasurePlanActivity", "hour = ", Integer.valueOf(hour), ", minute = ", Integer.valueOf(minute));
                int i2 = i;
                if (i2 != 0 || (hour >= 6 && hour <= 9 && (hour != 9 || minute <= 0))) {
                    if (i2 == BloodPressureMeasurePlanActivity.this.s.getItemCount() - 1 && hour >= 2 && hour < 20) {
                        BloodPressureMeasurePlanActivity bloodPressureMeasurePlanActivity = BloodPressureMeasurePlanActivity.this;
                        qpx.e(bloodPressureMeasurePlanActivity, bloodPressureMeasurePlanActivity.getResources().getString(com.huawei.ui.commonui.R.string.IDS_blood_pressure_sleep_toast, qrk.a(BloodPressureMeasurePlanActivity.this.e, uth.e(20, 0), 1), qrk.a(BloodPressureMeasurePlanActivity.this.e, uth.e(1, 59), 1)));
                        return;
                    }
                    if (i == -1) {
                        BloodPressureMeasurePlanActivity.this.s.c(new dfl(10, hour, minute, 10));
                    } else {
                        BloodPressureTargetAdapter bloodPressureTargetAdapter = BloodPressureMeasurePlanActivity.this.s;
                        int i3 = i;
                        bloodPressureTargetAdapter.b(new dfl(i3, hour, minute, i3), i);
                    }
                    BloodPressureMeasurePlanActivity.this.x.dismiss();
                    BloodPressureMeasurePlanActivity.this.b();
                    LogUtil.d("BloodPressureMeasurePlanActivity", "onPositiveButtonClick," + BloodPressureMeasurePlanActivity.this.s.getItemCount());
                    BloodPressureMeasurePlanActivity.this.c();
                    return;
                }
                BloodPressureMeasurePlanActivity bloodPressureMeasurePlanActivity2 = BloodPressureMeasurePlanActivity.this;
                qpx.e(bloodPressureMeasurePlanActivity2, bloodPressureMeasurePlanActivity2.getResources().getString(com.huawei.ui.commonui.R.string.IDS_blood_pressure_wakeup_toast, qrk.a(BloodPressureMeasurePlanActivity.this.e, uth.e(6, 0), 1), qrk.a(BloodPressureMeasurePlanActivity.this.e, uth.e(9, 0), 1)));
            }

            @Override // com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog.OnButtonClickCallback
            public void onNegativeButtonClick(HwTimePicker hwTimePicker) {
                BloodPressureMeasurePlanActivity.this.x.dismiss();
            }
        }), i, str);
    }

    private void d(HealthTimePickerDialog healthTimePickerDialog, int i, String str) {
        healthTimePickerDialog.c(HealthTimePickerDialog.ButtonId.LEFT, ContextCompat.getColor(this, com.huawei.ui.commonui.R.color.textColorSecondary));
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        calendar.clear();
        if (i == -1) {
            healthTimePickerDialog.b(0, 0, 0, i2, i3);
        } else if (i <= this.s.getItemCount() - 1 && i >= 0) {
            dfl dflVar = this.s.d().get(i);
            healthTimePickerDialog.b(0, 0, 0, dflVar.c(), dflVar.e());
        } else {
            LogUtil.j("BloodPressureMeasurePlanActivity", "position invalid :", Integer.valueOf(i));
            healthTimePickerDialog.b(0, 0, 0, i2, i3);
        }
        healthTimePickerDialog.e(str);
        healthTimePickerDialog.c(getColor(R.color.blood_pressure_subtab_item_text));
        healthTimePickerDialog.c(HealthTimePickerDialog.ButtonId.RIGHT, getColor(R.color.blood_pressure_subtab_item_text));
        healthTimePickerDialog.show();
        d(healthTimePickerDialog, GravityCompat.START);
        this.x = healthTimePickerDialog;
    }

    private void d(Dialog dialog, int i) {
        HwTextView hwTextView = (HwTextView) dialog.findViewById(R.id.hwtimepicker_title);
        if (hwTextView != null) {
            hwTextView.setGravity(i);
        } else {
            LogUtil.j("BloodPressureMeasurePlanActivity", "Dialog title is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.s.d().size() >= 10) {
            this.f27407b.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            this.f27407b.setVisibility(0);
            this.g.setVisibility(8);
        }
    }

    static class a implements ResponseCallback<List<dfl>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BloodPressureMeasurePlanActivity> f27411a;

        a(BloodPressureMeasurePlanActivity bloodPressureMeasurePlanActivity) {
            this.f27411a = new WeakReference<>(bloodPressureMeasurePlanActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<dfl> list) {
            BloodPressureMeasurePlanActivity bloodPressureMeasurePlanActivity = this.f27411a.get();
            if (bloodPressureMeasurePlanActivity != null) {
                bloodPressureMeasurePlanActivity.a(i, new HashSet(list));
                uth.b();
            } else {
                LogUtil.j("BloodPressureMeasurePlanActivity", "BloodPressureSimpleCallback measurePlanActivity is null");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
