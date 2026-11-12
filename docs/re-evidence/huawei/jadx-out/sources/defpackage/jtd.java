package defpackage;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.motiontrack.api.ViewHolderBase;
import com.huawei.health.sport.view.SugChart;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.sharegroup.SpeedPercentView;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.anchor.Layout;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jtd implements ViewHolderBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f39003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39005c;
    private Context d;
    private int e;
    private int f;
    private HwHealthBaseCombinedChart g;
    private a h = new a(this);
    private float i;
    private View j;
    private SugChart k;
    private int n;

    public jtd(Context context, int i, int i2) {
        this.d = context;
        this.e = i;
        this.n = i2;
    }

    static class a extends BaseHandler<jtd> {
        a(jtd jtdVar) {
            super(jtdVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jtd jtdVar, Message message) {
            if (message == null) {
                LogUtil.a("Track_ChartViewHolder", "message is null");
            } else if (message.what != 106) {
                LogUtil.j("Track_ChartViewHolder", "ChartViewHolderHandler is wrong");
            } else if (message.obj instanceof int[]) {
                jtdVar.c((int[]) message.obj);
            }
        }
    }

    @Override // com.huawei.health.motiontrack.api.ViewHolderBase
    public View buildView(int i, int i2) {
        View viewA;
        this.f = i;
        this.f39005c = i2;
        int i3 = this.e;
        if (i3 == 1) {
            viewA = a();
        } else if (i3 == 2) {
            viewA = g();
        } else if (i3 == 3) {
            viewA = i();
        } else if (i3 == 4) {
            viewA = f();
        } else {
            LogUtil.a("Track_ChartViewHolder", "buildView unknow charttype");
            viewA = new View(this.d);
        }
        this.j = viewA;
        return viewA;
    }

    private View a() {
        int i = this.n;
        if (i == 100) {
            return e();
        }
        if (i == 101) {
            return b();
        }
        LogUtil.a("Track_ChartViewHolder", "initHeartRateChart unknown style type");
        return new View(this.d);
    }

    private View e() {
        View viewInflate = View.inflate(this.d, R.layout.track_share_viewholder_heart, null);
        this.g = (HwHealthBaseCombinedChart) viewInflate.findViewById(R.id.share_detail_heart_chart);
        c((HealthTextView) viewInflate.findViewById(R.id.track_share_heart_unit), izw.f);
        d((HealthTextView) viewInflate.findViewById(R.id.track_share_heart_unit), String.format(this.d.getString(R.string.IDS_motiontrack_show_chart_unit_string), this.d.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string)));
        c((HealthTextView) viewInflate.findViewById(R.id.track_share_device_heart_avg_title), izw.e);
        c((HealthTextView) viewInflate.findViewById(R.id.track_share_device_heart_avg_num), izw.f);
        c((HealthTextView) viewInflate.findViewById(R.id.track_share_device_heart_avg_unit), izw.f);
        c((HealthTextView) viewInflate.findViewById(R.id.text_track_detail_right_unit), izw.f);
        c((HealthTextView) viewInflate.findViewById(R.id.track_share_device_heart_max_num), izw.f);
        c((HealthTextView) viewInflate.findViewById(R.id.text_track_detail_right_title), izw.e);
        Layout layoutAcquireLayout = this.g.acquireLayout();
        if (layoutAcquireLayout != null) {
            layoutAcquireLayout.b(0.0f, 0.0f);
            layoutAcquireLayout.a(0.0f);
        }
        return viewInflate;
    }

    private View b() {
        View viewInflate = View.inflate(this.d, R.layout.track_share_viewholder_heart, null);
        this.g = (HwHealthBaseCombinedChart) viewInflate.findViewById(R.id.share_detail_heart_chart);
        if (viewInflate.findViewById(R.id.track_share_heart_title) instanceof HealthTextView) {
            c((HealthTextView) viewInflate.findViewById(R.id.track_share_heart_title), izw.f38267a);
            c((HealthTextView) viewInflate.findViewById(R.id.track_share_heart_unit), izw.f38267a);
        }
        d((HealthTextView) viewInflate.findViewById(R.id.track_share_heart_unit), String.format(this.d.getString(R.string.IDS_motiontrack_show_chart_unit_string), this.d.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string)));
        Layout layoutAcquireLayout = this.g.acquireLayout();
        if (layoutAcquireLayout != null) {
            layoutAcquireLayout.b(0.0f, 0.0f);
            layoutAcquireLayout.a(0.0f);
        }
        return viewInflate;
    }

    private View g() {
        int i = this.n;
        if (i == 100) {
            return d();
        }
        if (i == 101) {
            return c();
        }
        LogUtil.a("Track_ChartViewHolder", "initStepRateChart unknow styletype");
        return new View(this.d);
    }

    private View d() {
        View viewInflate = View.inflate(this.d, R.layout.track_share_viewholder_steprate, null);
        this.k = (SugChart) viewInflate.findViewById(R.id.sug_sc_j_bupin);
        h();
        return viewInflate;
    }

    private View c() {
        View viewInflate = View.inflate(this.d, R.layout.track_share_viewholder_steprate, null);
        c((HealthTextView) viewInflate.findViewById(R.id.step_rate_info), izw.f38267a);
        c((HealthTextView) viewInflate.findViewById(R.id.step_avg), izw.f38267a);
        c((HealthTextView) viewInflate.findViewById(R.id.sug_tv_tb_bupinrate), izw.r);
        c((HealthTextView) viewInflate.findViewById(R.id.step_max), izw.f38267a);
        c((HealthTextView) viewInflate.findViewById(R.id.sug_tv_tb_bupinbig), izw.r);
        this.k = (SugChart) viewInflate.findViewById(R.id.sug_sc_j_bupin);
        c((HealthTextView) viewInflate.findViewById(R.id.sug_tv_tb_bupinbig_unit), izw.r);
        c((HealthTextView) viewInflate.findViewById(R.id.sug_tv_tb_bupinrate_unit), izw.r);
        c((HealthTextView) viewInflate.findViewById(R.id.step_rate_y_unit), izw.f38267a);
        c((HealthTextView) viewInflate.findViewById(R.id.step_rate_x_unit), izw.f38267a);
        h();
        return viewInflate;
    }

    private void h() {
        this.k.setType(1);
        this.k.c(2);
        SugChart sugChart = this.k;
        sugChart.setLineWidth(sugChart.a(3.0f));
        SugChart sugChart2 = this.k;
        sugChart2.d(sugChart2.a(10.0f));
        this.k.b(2.0f);
        if (this.n == 101) {
            this.k.e(izw.f38267a, izw.d);
            this.k.setLineColor(izw.m);
        } else {
            this.k.e(izw.e, izw.f38269c);
            this.k.setLineColor(izw.n);
        }
    }

    private View i() {
        View viewInflate = View.inflate(this.d, R.layout.track_share_viewholder_speed_percent, null);
        if (UnitUtil.f()) {
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.move_speed);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.move_speed_unit);
            healthTextView.setText(this.d.getString(R.string.IDS_aw_version2_moving_speed));
            healthTextView2.setText(String.format(this.d.getString(R.string.IDS_motiontrack_show_chart_unit_string), this.d.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed)));
        }
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.track_share_basketball_speed_avg_title);
        if (LanguageUtil.o(this.d) || LanguageUtil.bs(this.d) || LanguageUtil.bo(this.d)) {
            healthTextView3.setText(this.d.getResources().getString(R.string.IDS_aw_version2_average_moving_speed));
            return viewInflate;
        }
        healthTextView3.setText(this.d.getResources().getString(R.string.IDS_aw_version2_average_jump_time));
        return viewInflate;
    }

    private View f() {
        View viewInflate = View.inflate(this.d, R.layout.track_share_viewholder_speed_percent, null);
        ((HealthTextView) viewInflate.findViewById(R.id.move_speed_unit)).setVisibility(8);
        ((HealthTextView) viewInflate.findViewById(R.id.move_speed)).setText(R.string.IDS_indoor_equip_resistance);
        ((LinearLayout) viewInflate.findViewById(R.id.speed_average_layout)).setVisibility(8);
        return viewInflate;
    }

    private void c(HealthTextView healthTextView, int i) {
        healthTextView.setTextColor(i);
    }

    private void d(HealthTextView healthTextView, String str) {
        healthTextView.setText(str);
    }

    public void b(jqp jqpVar, float f, float f2) {
        if (this.j == null) {
            return;
        }
        this.i = f;
        this.f39003a = f2;
        int i = this.e;
        if (i == 1) {
            a(jqpVar);
            return;
        }
        if (i == 2) {
            b(jqpVar);
            return;
        }
        if (i == 3) {
            c(jqpVar);
        } else if (i == 4) {
            e(jqpVar);
        } else {
            LogUtil.a("Track_ChartViewHolder", "addData unknow charttype");
        }
    }

    private void e(jqp jqpVar) {
        SpeedPercentView speedPercentView = (SpeedPercentView) this.j.findViewById(R.id.speed_percent_view);
        if (jqpVar != null) {
            speedPercentView.setVisibility(0);
            speedPercentView.setData(jqpVar);
        } else {
            speedPercentView.setVisibility(8);
        }
    }

    private void a(jqp jqpVar) {
        int i = (int) this.f39003a;
        int i2 = (int) this.i;
        d((HealthTextView) this.j.findViewById(R.id.track_share_device_heart_avg_num), UnitUtil.e(i, 1, 0));
        d((HealthTextView) this.j.findViewById(R.id.track_share_device_heart_max_num), UnitUtil.e(i2, 1, 0));
        d(jqpVar);
    }

    private void d(final jqp jqpVar) {
        if (jqpVar == null) {
            this.j.findViewById(R.id.heart_rate_chart_show_layout).setVisibility(8);
            return;
        }
        HealthRingChart healthRingChart = (HealthRingChart) this.j.findViewById(com.huawei.health.servicesui.R.id.sug_sc_j_heart_pie);
        if (healthRingChart != null) {
            healthRingChart.setVisibility(8);
        }
        lsy.a(new Runnable() { // from class: jtd.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<HeartRateData> heartRateList = jqpVar.g().getHeartRateList();
                String extendDataString = jqpVar.d().getExtendDataString("isTrustHeartRate");
                UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
                int[] iArrE = gzz.e(heartRateList, jqpVar.d().requestHeartRateZoneType(), jqpVar.d().requestTotalTime(), extendDataString, userProfileMgrApi.getLocalUserInfo(), jtd.this.f);
                HeartZoneConf heartZoneConfE = gzz.e(jtd.this.f, jtd.this.f39005c, userProfileMgrApi.getLocalUserInfo());
                jtd.this.f39004b = heartZoneConfE.getClassifyMethod();
                Message messageObtainMessage = jtd.this.h.obtainMessage();
                messageObtainMessage.what = 106;
                messageObtainMessage.obj = iArrE;
                jtd.this.h.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int[] iArr) {
        int i = iArr[3];
        int i2 = iArr[4];
        int i3 = iArr[2];
        int i4 = iArr[1];
        int i5 = iArr[0];
        View view = this.j;
        if (view == null) {
            return;
        }
        if (i5 + i4 + i3 + i + i2 == 0) {
            View viewFindViewById = view.findViewById(R.id.heart_rate_chart_show_layout);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(Integer.valueOf(i4));
        arrayList.add(Integer.valueOf(i5));
        List<qjp> listB = b(arrayList);
        HealthRingChart healthRingChart = (HealthRingChart) this.j.findViewById(com.huawei.health.servicesui.R.id.sug_sc_j_heart_pie);
        if (healthRingChart == null) {
            return;
        }
        healthRingChart.setVisibility(0);
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.d, new qjm().b(false).c(true), listB);
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: jtg
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return this.d.d(qjpVar);
            }
        });
        healthRingChart.setAdapter(healthRingChartAdapter);
        if (LanguageUtil.o(this.d)) {
            healthRingChart.setDesc(this.d.getResources().getString(R.string.IDS_main_watch_heart_rate_string), this.d.getResources().getString(R.string.IDS_hwh_motiontrack_heart_rate_zone));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d(qjp qjpVar) {
        return b((int) qjpVar.f());
    }

    private List<qjp> b(List<Integer> list) {
        ArrayList arrayList = new ArrayList(5);
        int i = this.f39004b;
        if (i == 3) {
            arrayList.add(this.d.getString(R.string.IDS_lactate_subHeader_top7));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold));
            arrayList.add(this.d.getString(R.string.IDS_lactate_subHeader_top8));
        } else if (i == 1) {
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold));
        } else {
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_maximum_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_anaerobic_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_aerobic_threshold));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_fatburn_threshold_string));
            arrayList.add(this.d.getString(R.string.IDS_rate_zone_warmup_threshold));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_extreme_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_anaerobic_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_aerobic_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_fatburn_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_warmup_color_end)));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_extreme_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_anaerobic_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_aerobic_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_fatburn_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_warmup_color_begin)));
        int size = arrayList.size();
        ArrayList arrayList4 = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            arrayList4.add(new qjp(i2 < arrayList.size() ? (String) arrayList.get(i2) : "", list.get(i2).intValue(), i2 < arrayList2.size() ? ((Integer) arrayList2.get(i2)).intValue() : 0, i2 < arrayList3.size() ? ((Integer) arrayList3.get(i2)).intValue() : 0));
            i2++;
        }
        return arrayList4;
    }

    private String b(int i) {
        Context context = this.d;
        if (context == null) {
            return null;
        }
        if (i > 0 && i < 60) {
            return context.getString(R.string.IDS_motiontrack_show_chart_less_than_one_minute, 1);
        }
        return qrs.a((int) TimeUnit.SECONDS.toMinutes(i), this.d);
    }

    private void b(jqp jqpVar) {
        int i = (int) this.i;
        d((HealthTextView) this.j.findViewById(R.id.sug_tv_tb_bupinbig), UnitUtil.e(i, 1, 0));
        d((HealthTextView) this.j.findViewById(R.id.sug_tv_tb_bupinrate), UnitUtil.e(this.f39003a, 1, 0));
        this.k.setYAxisValues(0, gzz.d(i), 2);
        this.k.e(jqpVar.d().requestTotalTime());
        gzz.a(gzz.c(jqpVar.b().requestStepRateList(), jqpVar.d().requestTrackType(), 10000), jqpVar.d().requestTrackType(), this.k);
    }

    private void c(jqp jqpVar) {
        float f = this.f39003a;
        float f2 = this.i;
        HealthTextView healthTextView = (HealthTextView) this.j.findViewById(R.id.track_share_basketball_speed_avg_num);
        HealthTextView healthTextView2 = (HealthTextView) this.j.findViewById(R.id.track_share_basketball_speed_max_num);
        HealthTextView healthTextView3 = (HealthTextView) this.j.findViewById(R.id.move_speed);
        HealthTextView healthTextView4 = (HealthTextView) this.j.findViewById(R.id.move_speed_unit);
        d(healthTextView, UnitUtil.e(f, 1, 1));
        d(healthTextView2, UnitUtil.e(f2, 1, 1));
        Context context = this.d;
        if (context != null) {
            d(healthTextView3, context.getString(R.string.IDS_aw_version2_moving_speed));
        }
        SpeedPercentView speedPercentView = (SpeedPercentView) this.j.findViewById(R.id.speed_percent_view);
        if (this.d != null) {
            if (UnitUtil.f()) {
                d(healthTextView4, String.format(this.d.getString(R.string.IDS_motiontrack_show_chart_unit_string), this.d.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp)));
            } else {
                d(healthTextView4, String.format(this.d.getString(R.string.IDS_motiontrack_show_chart_unit_string), this.d.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed)));
            }
        }
        if (jqpVar != null) {
            speedPercentView.setVisibility(0);
            speedPercentView.setData(jqpVar);
        } else {
            speedPercentView.setVisibility(8);
        }
    }

    @Override // com.huawei.health.motiontrack.api.ViewHolderBase
    public HwHealthBaseCombinedChart acquireHeartRateChart() {
        return this.g;
    }
}
