package com.huawei.ui.commonui.linechart.utils;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qmh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class CustomChartTitleBar extends RelativeLayout {
    private static List<ChartLayerType> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f23719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f23720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<ChartLayerType, b> f23721c;
    private Context d;
    private HealthTextView h;

    public enum ChartLayerType {
        HEART_RATE,
        STEP_FRE,
        ALTITUDE,
        SPEED_RATE,
        REALTIME_PACE,
        PULL_FREQ,
        SWOLF,
        GROUND_CONTACT_TIME,
        HANG_TIME,
        GROUND_HANG_TIME_RATE,
        GROUND_IMPACT_ACCELERATION,
        SPO2,
        JUMP_TIME,
        JUMP_HEIGHT
    }

    /* JADX INFO: loaded from: classes43.dex */
    public interface OnLineStatusChangedListener {
        void onLineStatusChanged(ChartLayerType chartLayerType, boolean z);
    }

    static {
        ArrayList arrayList = new ArrayList(10);
        e = arrayList;
        arrayList.add(ChartLayerType.HEART_RATE);
        e.add(ChartLayerType.STEP_FRE);
        e.add(ChartLayerType.ALTITUDE);
        e.add(ChartLayerType.SPEED_RATE);
        e.add(ChartLayerType.REALTIME_PACE);
        e.add(ChartLayerType.PULL_FREQ);
        e.add(ChartLayerType.SWOLF);
        e.add(ChartLayerType.GROUND_CONTACT_TIME);
        e.add(ChartLayerType.GROUND_IMPACT_ACCELERATION);
        e.add(ChartLayerType.SPO2);
    }

    public CustomChartTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        HashMap map = new HashMap(10);
        this.f23721c = map;
        map.put(ChartLayerType.HEART_RATE, new b(R.drawable.ic_exerciserecords_heartrate_frequency, R.drawable.ic_exerciserecords_heartrate_crush, R.drawable.ic_exerciserecords_heartrate_crush));
        map.put(ChartLayerType.STEP_FRE, new b(R.drawable.ic_health_exerciserecords_stride_frequency, R.drawable.ic_health_exerciserecords_stride_crush, R.drawable.ic_health_exerciserecords_stride_crush));
        map.put(ChartLayerType.ALTITUDE, new b(R.drawable.ic_exerciserecords_altitudw_frequency, R.drawable.ic_exerciserecords_altitudw_crush, R.drawable.ic_exerciserecords_altitudw_crush));
        map.put(ChartLayerType.SPEED_RATE, new b(R.drawable.ic_health_track_speed_rate, R.drawable.ic_health_track_speed_rate_unsel, R.drawable.ic_health_track_speed_rate_unsel));
        map.put(ChartLayerType.REALTIME_PACE, new b(R.drawable.ic_health_track_speed_pace, R.drawable.ic_health_track_speed_pace_unsel, R.drawable.ic_health_track_speed_pace_unsel));
        map.put(ChartLayerType.PULL_FREQ, new b(R.drawable.ic_health_track_swimming, R.drawable.ic_health_track_swimming_unsel, R.drawable.ic_health_track_swimming_unsel));
        map.put(ChartLayerType.SWOLF, new b(R.drawable.ic_health_track_swolf, R.drawable.ic_health_track_swolf_unsel, R.drawable.ic_health_track_swolf_unsel));
        map.put(ChartLayerType.GROUND_CONTACT_TIME, new b(R.drawable.ic_health_touch_the_ground_time, R.drawable.ic_health_touch_the_ground_time_did_not_click, R.drawable.ic_health_touch_the_ground_time_did_not_click));
        map.put(ChartLayerType.HANG_TIME, new b(R.drawable.ic_landscape_flytime_select, R.drawable.ic_landscape_flytime, R.drawable.ic_landscape_flytime));
        map.put(ChartLayerType.GROUND_HANG_TIME_RATE, new b(R.drawable.ic_landscape_flypercentage_select, R.drawable.ic_landscape_flypercentage, R.drawable.ic_landscape_flypercentage));
        map.put(ChartLayerType.GROUND_IMPACT_ACCELERATION, new b(R.drawable.ic_health_on_the_impact, R.drawable.ic_health_on_the_impact_did_not_click, R.drawable.ic_health_on_the_impact_did_not_click));
        map.put(ChartLayerType.SPO2, new b(R.drawable.ic_blood_oxygen_2_sel_new, R.drawable.ic_blood_oxygen_2_nor, R.drawable.ic_blood_oxygen_2_nor));
        this.d = context;
        b();
    }

    private void b() {
        Object systemService = this.d.getSystemService("layout_inflater");
        if (systemService instanceof LayoutInflater) {
            ((LayoutInflater) systemService).inflate(R.layout.commonui_custom_titlebar_linechart, this);
            this.f23719a = (ImageView) findViewById(R.id.btn_left);
            if (qmh.e(this.d)) {
                LogUtil.a("HealthChat_CustomChartTitleBar", "loadBackBtn() language rtl");
                this.f23719a.setImageDrawable(this.d.getResources().getDrawable(R.drawable.health_navbar_rtl_back_selector));
            } else {
                LogUtil.a("HealthChat_CustomChartTitleBar", "loadBackBtn() language ltr");
                this.f23719a.setImageDrawable(this.d.getResources().getDrawable(R.drawable.health_navbar_back_selector));
            }
            this.h = (HealthTextView) findViewById(R.id.detail_title_text);
            findViewById(R.id.titlebar_divider_line_height).setBackgroundColor(Color.argb(25, 0, 0, 0));
            this.f23720b = (LinearLayout) findViewById(R.id.view_right);
            View viewFindViewById = findViewById(R.id.status_bar_place_holder);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = c(this.d);
            viewFindViewById.setLayoutParams(layoutParams);
            a();
        }
    }

    private void a() {
        float fApplyDimension;
        LinearLayout linearLayout = this.f23720b;
        if (linearLayout == null) {
            LogUtil.j("HealthChat_CustomChartTitleBar", "refresh mResImageLayout == null");
            return;
        }
        linearLayout.removeAllViews();
        Iterator<ChartLayerType> it = e.iterator();
        while (it.hasNext()) {
            final ChartLayerType next = it.next();
            b bVar = this.f23721c.get(next);
            if (bVar != null && !bVar.e() && bVar.a()) {
                ImageView imageView = new ImageView(this.d);
                DisplayMetrics displayMetrics = this.d.getResources().getDisplayMetrics();
                int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, displayMetrics);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iApplyDimension, iApplyDimension);
                if (it.hasNext()) {
                    fApplyDimension = TypedValue.applyDimension(1, 16.0f, displayMetrics);
                } else {
                    fApplyDimension = TypedValue.applyDimension(1, 20.0f, displayMetrics);
                }
                layoutParams.setMarginEnd((int) fApplyDimension);
                imageView.setLayoutParams(layoutParams);
                if (!bVar.d || !bVar.e) {
                    if (bVar.d) {
                        imageView.setImageResource(bVar.f23724b);
                    }
                } else {
                    imageView.setImageResource(bVar.f23725c);
                }
                if (bVar.d) {
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.linechart.utils.CustomChartTitleBar.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            CustomChartTitleBar.this.a(next);
                        }
                    });
                }
                this.f23720b.addView(imageView);
            }
        }
        c();
    }

    public void setTitle(String str) {
        this.h.setText(str);
    }

    private void c() {
        if (this.f23720b.getChildCount() > 0) {
            LinearLayout linearLayout = this.f23720b;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt == null || childAt.getVisibility() == 8) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd((int) this.d.getResources().getDimension(R.dimen.maxPaddingEnd));
            }
        }
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23725c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23723a = false;
        private boolean e = false;
        private boolean d = false;

        b(int i, int i2, int i3) {
            this.f23725c = i;
            this.f23724b = i2;
        }

        boolean e() {
            return this.f23723a;
        }

        public boolean b() {
            return this.e;
        }

        public boolean a() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ChartLayerType chartLayerType) {
        b bVar = this.f23721c.get(chartLayerType);
        boolean zB = bVar.b();
        if (zB || d() < 3) {
            bVar.e = !zB;
            a();
        } else {
            e();
        }
    }

    private void e() {
        String quantityString = this.d.getResources().getQuantityString(R.plurals.IDS_pluginmotiontrack_show_three_chart, 3, 3);
        Toast toastMakeText = Toast.makeText(BaseApplication.getContext(), quantityString, 0);
        toastMakeText.setText(quantityString);
        toastMakeText.show();
    }

    private int d() {
        int i = 1;
        for (ChartLayerType chartLayerType : ChartLayerType.values()) {
            b bVar = this.f23721c.get(chartLayerType);
            if (bVar != null && bVar.e) {
                i++;
            }
        }
        return i;
    }

    public static int c(Context context) {
        if (context == null) {
            LogUtil.j("HealthChat_CustomChartTitleBar", "getStatusBarHeight context == null");
            return 0;
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NumberFormatException e2) {
            LogUtil.j("HealthChat_CustomChartTitleBar", "getStatusBarHeight:", ExceptionUtils.c(e2));
            return 0;
        }
    }
}
