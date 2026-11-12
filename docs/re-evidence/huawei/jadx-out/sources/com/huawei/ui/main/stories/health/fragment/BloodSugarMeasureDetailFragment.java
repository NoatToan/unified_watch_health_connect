package com.huawei.ui.main.stories.health.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.view.dashboard.BloodSugarDashboardView;
import com.huawei.ui.commonui.linechart.view.dashboard.DashboardRingView;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriod;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriodView;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarDeviceMeasureActivity;
import defpackage.uvz;
import defpackage.uwh;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarMeasureDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BloodSugarDeviceMeasureActivity f27869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Calendar f27870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f27871c;
    private HealthTextView d;
    private BloodSugarDashboardView e;
    private HealthTextView f;
    private long g;
    private BloodSugarTimePeriodView h;
    private HealthTextView i;
    private int j;
    private float n;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof BloodSugarDeviceMeasureActivity) {
            this.f27869a = (BloodSugarDeviceMeasureActivity) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_blood_sugar_measure_detail, (ViewGroup) null, false);
        c(viewInflate);
        if ("jump_from_blood_sugar_history".equals(this.f27869a.b()) || "jump_from_blood_sugar_feedback".equals(this.f27869a.b()) || "jump_from_blood_sugar_home".equals(this.f27869a.b())) {
            c(viewInflate, 0);
            e(viewInflate, 8);
            return viewInflate;
        }
        c(viewInflate, 8);
        e(viewInflate, 0);
        return viewInflate;
    }

    private void c(View view) {
        this.e = (BloodSugarDashboardView) view.findViewById(R.id.hw_show_blood_sugar_measure_detail_dashboard_view);
        BloodSugarTimePeriodView bloodSugarTimePeriodView = (BloodSugarTimePeriodView) view.findViewById(R.id.hw_show_blood_sugar_measure_detail_time_period);
        this.h = bloodSugarTimePeriodView;
        bloodSugarTimePeriodView.setOnTimePeriodItemChangedListener(new BloodSugarTimePeriodView.OnTimePeriodItemChangedListener() { // from class: uun
            @Override // com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriodView.OnTimePeriodItemChangedListener
            public final void onTimePeriodItemChanged(int i, BloodSugarTimePeriod bloodSugarTimePeriod) {
                this.f50587b.d(i, bloodSugarTimePeriod);
            }
        });
        this.f27870b = Calendar.getInstance();
    }

    public /* synthetic */ void d(int i, BloodSugarTimePeriod bloodSugarTimePeriod) {
        this.j = bloodSugarTimePeriod.getCode();
        b();
        b(true);
        BloodSugarDeviceMeasureActivity bloodSugarDeviceMeasureActivity = this.f27869a;
        if (bloodSugarDeviceMeasureActivity == null || bloodSugarDeviceMeasureActivity.d() == null || this.j == BigDecimal.valueOf(this.f27869a.d().m()).intValue()) {
            return;
        }
        e();
    }

    private void e(View view, int i) {
        this.i = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_measure_detail_top_date);
        this.f27871c = (HealthButton) view.findViewById(R.id.hw_show_blood_sugar_measure_detail_bt_done);
        this.i.setVisibility(i);
        this.f27871c.setVisibility(i);
        if (i == 0) {
            this.f27871c.setOnClickListener(new View.OnClickListener() { // from class: uuo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f50588c.a(view2);
                }
            });
        }
    }

    public /* synthetic */ void a(View view) {
        this.f27869a.d(this.j, this.f27870b.getTimeInMillis());
    }

    private void c(View view, int i) {
        view.findViewById(R.id.hw_show_blood_sugar_measure_detail_date_layout).setVisibility(i);
        if (i != 0) {
            return;
        }
        view.findViewById(R.id.hw_show_blood_sugar_measure_detail_date_ll).setOnClickListener(new View.OnClickListener() { // from class: uum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.b(view2);
            }
        });
        this.d = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_measure_detail_date);
        view.findViewById(R.id.hw_show_blood_sugar_measure_detail_time_ll).setOnClickListener(new View.OnClickListener() { // from class: uul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f50586b.e(view2);
            }
        });
        this.f = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_measure_detail_time);
        this.f27869a.g().setRightButtonOnClickListener(new View.OnClickListener() { // from class: uuk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f50585c.d(view2);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        a();
        b(9);
    }

    public /* synthetic */ void e(View view) {
        d();
        b(10);
    }

    public /* synthetic */ void d(View view) {
        this.f27869a.d(this.j, this.f27870b.getTimeInMillis());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    private void e() {
        byte b2;
        HashMap map;
        String strB = this.f27869a.b();
        strB.hashCode();
        int iHashCode = strB.hashCode();
        if (iHashCode != -824305694) {
            if (iHashCode != -758500271) {
                if (iHashCode == 1397670459 && strB.equals("jump_from_blood_sugar_notify")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strB.equals("jump_from_blood_sugar_home")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strB.equals("jump_from_blood_sugar_history")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            map = new HashMap();
            map.put("type", 3);
        } else if (b2 != 1) {
            if (b2 == 2 && this.f27869a.h()) {
                map = new HashMap();
                map.put("type", 1);
            } else {
                map = null;
            }
        } else {
            map = new HashMap();
            map.put("type", 2);
        }
        if (map != null) {
            String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_CONFIRMED_2030071.value();
            map.put("click", "1");
            map.put(FunctionSetBeanReader.BI_ELEMENT, 1);
            this.f27869a.c(strValue, map);
        }
    }

    private void b(int i) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, Integer.valueOf(i));
        this.f27869a.c(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value(), map);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        f();
    }

    private void f() {
        uwh uwhVarD = this.f27869a.d();
        if (uwhVarD == null) {
            return;
        }
        this.j = BigDecimal.valueOf(uwhVarD.m()).intValue();
        this.n = BigDecimal.valueOf(uwhVarD.o()).floatValue();
        long jG = uwhVarD.g();
        this.g = jG;
        this.f27870b.setTimeInMillis(jG);
        if ("jump_from_blood_sugar_history".equals(this.f27869a.b()) || "jump_from_blood_sugar_feedback".equals(this.f27869a.b()) || "jump_from_blood_sugar_home".equals(this.f27869a.b())) {
            b();
            c();
            c(this.g);
            this.h.b(this.g, this.j);
            b(true);
            return;
        }
        if ("jump_from_blood_sugar_notify".equals(this.f27869a.b()) && this.f27869a.h()) {
            j();
            b();
            c();
            this.h.b(this.g, this.j);
            b(true);
            return;
        }
        j();
        c();
        this.h.c(this.g);
        b(false);
    }

    private void j() {
        this.i.setText(new SimpleDateFormat("yyyy/M/d HH:mm").format(Long.valueOf(this.g)));
    }

    private void c() {
        this.e.setCurrentValue(this.n);
        this.e.b();
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        List<Float> listB = uvz.b(this.j);
        int i = 0;
        int i2 = 0;
        while (i2 < listB.size() && this.n > listB.get(i2).floatValue()) {
            i2++;
        }
        int[] iArrC = uvz.c(getContext());
        int length = (iArrC.length / 2) + i2;
        float f = 0.0f;
        while (i < listB.size()) {
            float fFloatValue = listB.get(i).floatValue();
            int i3 = i == i2 ? length : i;
            if (i3 < iArrC.length) {
                arrayList.add(new DashboardRingView.a(f, fFloatValue, iArrC[i3]));
                f = fFloatValue;
            }
            i++;
        }
        this.e.setRingAreas(1.0f, 33.0f, arrayList);
        String strValueOf = String.valueOf(uvz.d(getContext(), this.j, this.n).get("HEALTH_BLOOD_SUGAR_LEVEL_DESC"));
        if (length < iArrC.length) {
            this.e.setStatusText(strValueOf, iArrC[length]);
            this.e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        String[] strArrSplit = new SimpleDateFormat("yyyy/M/d HH:mm").format(Long.valueOf(j)).split(" ");
        this.d.setText(strArrSplit[0]);
        this.f.setText(strArrSplit[1]);
        this.h.c(j);
    }

    private void a() {
        new HealthDatePickerDialog(this.f27869a, new HealthDatePickerDialog.DateSelectedListener() { // from class: com.huawei.ui.main.stories.health.fragment.BloodSugarMeasureDetailFragment.4
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public void onDateSelected(int i, int i2, int i3) {
                BloodSugarMeasureDetailFragment.this.f27870b.set(i, i2, i3);
                long timeInMillis = BloodSugarMeasureDetailFragment.this.f27870b.getTimeInMillis();
                BloodSugarMeasureDetailFragment.this.c(timeInMillis);
                BloodSugarMeasureDetailFragment.this.h.c(timeInMillis);
                BloodSugarMeasureDetailFragment.this.b(false);
            }
        }, new GregorianCalendar(this.f27870b.get(1), this.f27870b.get(2), this.f27870b.get(5), this.f27870b.get(11), this.f27870b.get(12))).show();
    }

    private void d() {
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog(this.f27869a, new HealthTimePickerDialog.TimeSelectedListener() { // from class: com.huawei.ui.main.stories.health.fragment.BloodSugarMeasureDetailFragment.2
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i, int i2) {
                BloodSugarMeasureDetailFragment.this.f27870b.set(11, i);
                BloodSugarMeasureDetailFragment.this.f27870b.set(12, i2);
                long timeInMillis = BloodSugarMeasureDetailFragment.this.f27870b.getTimeInMillis();
                BloodSugarMeasureDetailFragment.this.c(timeInMillis);
                BloodSugarMeasureDetailFragment.this.h.c(timeInMillis);
                BloodSugarMeasureDetailFragment.this.b(false);
            }
        });
        healthTimePickerDialog.e(getString(R.string.IDS_hw_health_show_healthdata_measure_time));
        healthTimePickerDialog.a().a(this.f27870b.get(1), this.f27870b.get(2), this.f27870b.get(5), this.f27870b.get(11), this.f27870b.get(12));
        healthTimePickerDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        HealthButton healthButton = this.f27871c;
        if (healthButton == null) {
            this.f27869a.g().setRightButtonClickable(z);
        } else if (z) {
            healthButton.setClickable(true);
            this.f27871c.setBackgroundResource(R.drawable.button_background_emphasize);
        } else {
            healthButton.setClickable(false);
            this.f27871c.setBackgroundResource(R.drawable.button_background_emphasize_disable);
        }
    }
}
