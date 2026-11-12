package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class CustomTrackChartTitleBar extends RelativeLayout {
    private static List<SportDetailChartDataType> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<SportDetailChartDataType> f11246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f11247c;
    private SportChartItemAdapter d;
    private final Map<SportDetailChartDataType, d> f;
    private int g;
    private HealthRecycleView h;
    private OnLineStatusChangedListener i;
    private LinearLayout j;
    private HealthTextView m;
    private List<d> o;

    public interface OnLineStatusChangedListener {
        void onLineStatusChanged(SportDetailChartDataType sportDetailChartDataType, boolean z);
    }

    static {
        ArrayList arrayList = new ArrayList(SportDetailChartDataType.values().length);
        e = arrayList;
        arrayList.clear();
        for (SportDetailChartDataType sportDetailChartDataType : SportDetailChartDataType.values()) {
            e.add(sportDetailChartDataType);
        }
    }

    public CustomTrackChartTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        HashMap map = new HashMap(SportDetailChartDataType.values().length);
        this.f = map;
        this.o = new ArrayList();
        this.f11246b = new ArrayList();
        this.g = 0;
        map.put(SportDetailChartDataType.HEART_RATE, new d(R.drawable.ic_exerciserecords_heartrate_frequency, R.drawable.ic_exerciserecords_heartrate_crush, R.string.IDS_main_watch_heart_rate_string));
        map.put(SportDetailChartDataType.STEP_RATE, new d(R.drawable.ic_health_exerciserecords_stride_frequency, R.drawable.ic_health_exerciserecords_stride_crush, R.string.IDS_motiontrack_detail_fm_heart_bupin));
        map.put(SportDetailChartDataType.CADENCE, new d(R.drawable.ic_health_cadence, R.drawable.ic_health_cadence_press, R.string.IDS_indoor_equip_cadence));
        map.put(SportDetailChartDataType.PADDLE_FREQUENCY, new d(R.drawable.ic_paddles_sel, R.drawable.ic_paddles_nor, R.string.IDS_indoor_equip_paddle_frequency));
        map.put(SportDetailChartDataType.POWER, new d(R.drawable.ic_powers_sel, R.drawable.ic_powers_nor, R.string.IDS_indoor_equip_power));
        map.put(SportDetailChartDataType.ANALOG_POWER, new d(R.drawable.ic_powers_sel, R.drawable.ic_powers_nor, R.string.IDS_track_analog_power));
        map.put(SportDetailChartDataType.ANALOG_CADENCE, new d(R.drawable.ic_health_cadence, R.drawable.ic_health_cadence_press, R.string.IDS_track_analog_cadence));
        map.put(SportDetailChartDataType.ALTITUDE, new d(R.drawable.ic_exerciserecords_altitudw_frequency, R.drawable.ic_exerciserecords_altitudw_crush, R.string.IDS_hwh_motiontrack_alti));
        map.put(SportDetailChartDataType.SPEED_RATE, new d(R.drawable.ic_health_track_speed_rate, R.drawable.ic_health_track_speed_rate_unsel, R.string.IDS_motiontrack_show_sport_tip_icon_text_pace));
        map.put(SportDetailChartDataType.REALTIME_PACE, new d(R.drawable.ic_health_track_speed_pace, R.drawable.ic_health_track_speed_pace_unsel, R.string.IDS_motiontrack_show_map_sport_peisu_1));
        e();
        this.f11245a = context;
        d();
    }

    private void e() {
        this.f.put(SportDetailChartDataType.PULL_FREQ, new d(R.drawable.ic_health_track_swimming, R.drawable.ic_health_track_swimming_unsel, R.string.IDS_hwh_motiontrack_pull_frequence));
        this.f.put(SportDetailChartDataType.SWOLF, new d(R.drawable.ic_health_track_swolf, R.drawable.ic_health_track_swolf_unsel, R.string.IDS_hwh_motiontrack_swim_SWOLF));
        this.f.put(SportDetailChartDataType.GROUND_CONTACT_TIME, new d(R.drawable.ic_health_touch_the_ground_time, R.drawable.ic_health_touch_the_ground_time_did_not_click, R.string.IDS_bolt_touchdown_time));
        this.f.put(SportDetailChartDataType.HANG_TIME, new d(R.drawable.ic_landscape_flytime_select, R.drawable.ic_landscape_flytime, R.string.IDS_aw_version2_duration_of_passage));
        this.f.put(SportDetailChartDataType.GROUND_HANG_TIME_RATE, new d(R.drawable.ic_landscape_flypercentage_select, R.drawable.ic_landscape_flypercentage, R.string.IDS_motiontrack_ground_to_air_ratio));
        this.f.put(SportDetailChartDataType.GROUND_IMPACT_ACCELERATION, new d(R.drawable.ic_health_on_the_impact, R.drawable.ic_health_on_the_impact_did_not_click, R.string.IDS_running_posture_ground_impact_acceleration));
        this.f.put(SportDetailChartDataType.SPO2, new d(R.drawable.ic_blood_oxygen_2_sel_new, R.drawable.ic_blood_oxygen_2_nor, R.string.IDS_hw_health_blood_oxygen));
        this.f.put(SportDetailChartDataType.SKIPPING_SPEED, new d(R.drawable.ic_health_track_speed_rate, R.drawable.ic_health_track_speed_rate_unsel, R.string.IDS_indoor_skipper_rope_sport_type));
        this.f.put(SportDetailChartDataType.ACTIVE_PEAK, new d(R.drawable.ic_health_on_the_impact, R.drawable.ic_health_on_the_impact_did_not_click, R.string.IDS_bolt_shock_peak));
        this.f.put(SportDetailChartDataType.VERTICAL_OSCILLATION, new d(R.drawable.ic_health_on_the_impact, R.drawable.ic_health_on_the_impact_did_not_click, R.string.IDS_bolt_vertical_amplitude));
        this.f.put(SportDetailChartDataType.VERTICAL_RATIO, new d(R.drawable.ic_health_on_the_impact, R.drawable.ic_health_on_the_impact_did_not_click, R.string.IDS_bolt_vertical_stride_rate));
        this.f.put(SportDetailChartDataType.GC_TIME_BALANCE, new d(R.drawable.ic_health_on_the_impact, R.drawable.ic_health_on_the_impact_did_not_click, R.string.IDS_bolt_balance_left_right_touches));
        this.f.put(SportDetailChartDataType.PEAK_WEIGHT, new d(R.drawable.ic_health_peak_weight, R.drawable.ic_health_peak_weight_not_click, R.string.IDS_rowing_machine_peak_weight));
    }

    private void d() {
        ((LayoutInflater) this.f11245a.getSystemService("layout_inflater")).inflate(R.layout.commonui_custom_titlebar_linechart, this);
        this.f11247c = (ImageView) findViewById(R.id.btn_left);
        if (LanguageUtil.ba(this.f11245a)) {
            LogUtil.a("Track_CustomChartTitleBar", "loadBackBtn() language rtl");
            this.f11247c.setImageDrawable(this.f11245a.getResources().getDrawable(R.drawable.health_navbar_rtl_back_selector));
        } else {
            LogUtil.a("Track_CustomChartTitleBar", "loadBackBtn() language ltr");
            this.f11247c.setImageDrawable(this.f11245a.getResources().getDrawable(R.drawable.health_navbar_back_selector));
        }
        this.m = (HealthTextView) findViewById(R.id.detail_title_text);
        this.j = (LinearLayout) findViewById(R.id.view_right);
        View viewFindViewById = findViewById(R.id.status_bar_place_holder);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
        layoutParams.height = qrs.s(this.f11245a);
        viewFindViewById.setLayoutParams(layoutParams);
        b();
    }

    private void b() {
        LinearLayout linearLayout = this.j;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        if (this.g == 1) {
            this.m.setVisibility(8);
            c();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SportDetailChartDataType sportDetailChartDataType : e) {
            d dVar = this.f.get(sportDetailChartDataType);
            if (dVar != null && !dVar.e && dVar.f11249a && this.g == 0) {
                arrayList.add(sportDetailChartDataType);
            }
        }
        int i = 0;
        while (i < arrayList.size()) {
            e(i == arrayList.size() - 1, (SportDetailChartDataType) arrayList.get(i), this.f.get((SportDetailChartDataType) arrayList.get(i)));
            i++;
        }
    }

    private void c() {
        this.h = new HealthRecycleView(this.f11245a);
        this.h.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.h.setLayoutManager(new LinearLayoutManager(this.f11245a, 0, false));
        this.h.setNestedScrollingEnabled(false);
        this.h.setHasFixedSize(true);
        this.h.b(false);
        this.h.e(false);
        SportChartItemAdapter sportChartItemAdapter = new SportChartItemAdapter(this.f11245a);
        this.d = sportChartItemAdapter;
        sportChartItemAdapter.d(this.o, new IBaseResponseCallback() { // from class: jsc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.a(i, obj);
            }
        });
        this.h.setAdapter(this.d);
        this.h.setItemViewCacheSize(5);
        this.j.addView(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, Object obj) {
        if (njy.e(this.f11246b, i)) {
            LogUtil.j("Track_CustomChartTitleBar", "configButtonRecycleView position is out of mChartList.", Integer.valueOf(i));
        } else {
            a(this.f11246b.get(i));
            this.d.notifyItemChanged(i);
        }
    }

    private void e(boolean z, final SportDetailChartDataType sportDetailChartDataType, d dVar) {
        float dimension;
        ImageView imageView = new ImageView(this.f11245a);
        int iD = qrs.d(this.f11245a, 24.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iD, iD);
        if (z) {
            dimension = this.f11245a.getResources().getDimension(R.dimen.maxPaddingEnd);
        } else {
            dimension = this.f11245a.getResources().getDimension(R.dimen.elementsMarginHorizontalL);
        }
        layoutParams.setMarginEnd((int) dimension);
        imageView.setLayoutParams(layoutParams);
        if (dVar.f11249a && dVar.f11251c) {
            imageView.setImageResource(dVar.f11250b);
        } else if (dVar.f11249a) {
            imageView.setImageResource(dVar.h);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.view.CustomTrackChartTitleBar.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomTrackChartTitleBar.this.a(sportDetailChartDataType);
            }
        });
        this.j.addView(imageView);
    }

    public void setTitle(String str) {
        this.m.setText(str);
    }

    public void setOnLineStatusChangedListener(OnLineStatusChangedListener onLineStatusChangedListener) {
        this.i = onLineStatusChangedListener;
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11250b;
        int d;
        int h;
        boolean e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f11251c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f11249a = false;

        d(int i, int i2, int i3) {
            this.f11250b = i;
            this.h = i2;
            this.d = i3;
        }
    }

    public void setBaseLine(SportDetailChartDataType sportDetailChartDataType) {
        Iterator<SportDetailChartDataType> it = e.iterator();
        while (it.hasNext()) {
            d dVar = this.f.get(it.next());
            if (dVar != null) {
                dVar.e = false;
            }
        }
        d dVar2 = this.f.get(sportDetailChartDataType);
        if (dVar2 != null) {
            dVar2.e = true;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SportDetailChartDataType sportDetailChartDataType) {
        d dVar = this.f.get(sportDetailChartDataType);
        boolean z = dVar.f11251c;
        if (!z && a() >= 3) {
            g();
            return;
        }
        dVar.f11251c = !z;
        OnLineStatusChangedListener onLineStatusChangedListener = this.i;
        if (onLineStatusChangedListener != null) {
            onLineStatusChangedListener.onLineStatusChanged(sportDetailChartDataType, dVar.f11251c);
        }
        if (this.g == 0) {
            b();
        }
    }

    private void g() {
        String quantityString = this.f11245a.getResources().getQuantityString(R.plurals.IDS_pluginmotiontrack_show_three_chart, 3, 3);
        Toast toastMakeText = Toast.makeText(BaseApplication.getContext(), quantityString, 0);
        toastMakeText.setText(quantityString);
        toastMakeText.show();
    }

    private int a() {
        int i = 1;
        for (SportDetailChartDataType sportDetailChartDataType : SportDetailChartDataType.values()) {
            d dVar = this.f.get(sportDetailChartDataType);
            if (dVar != null && dVar.f11251c) {
                i++;
            }
        }
        return i;
    }

    public void setOnBackListener(View.OnClickListener onClickListener) {
        this.f11247c.setOnClickListener(onClickListener);
    }

    public void setIconClickable(List<SportDetailChartDataType> list) {
        if (list == null) {
            LogUtil.e("Track_CustomChartTitleBar", "setIconClickable() chartLayerTypes is null");
            return;
        }
        for (SportDetailChartDataType sportDetailChartDataType : list) {
            d dVar = this.f.get(sportDetailChartDataType);
            dVar.f11249a = true;
            this.o.add(dVar);
            this.f11246b.add(sportDetailChartDataType);
        }
        b();
    }

    public void setShowMode(int i) {
        this.g = i;
    }
}
