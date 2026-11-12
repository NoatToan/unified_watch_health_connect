package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarNocturnalHypoglycemiaCardView;
import defpackage.emq;
import defpackage.ieg;
import defpackage.nkb;
import defpackage.nku;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarNocturnalHypoglycemiaCardView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f27218c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27220b;
    private BloodSugarNocturnalHypoglycemiaChartView d;
    private final Handler e;
    private long f;
    private HealthTextView g;
    private HealthTextView h;
    private LinearLayout i;
    private HealthTextView j;

    public BloodSugarNocturnalHypoglycemiaCardView(Context context) {
        this(context, null);
    }

    public BloodSugarNocturnalHypoglycemiaCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 0L;
        this.f27219a = context;
        this.e = new a(this);
        e();
        c();
        setVisibility(8);
    }

    private void e() {
        LayoutInflater.from(this.f27219a).inflate(R.layout.layout_blood_sugar_nocturnal_hypoglycemia_card_view, this);
        this.i = (LinearLayout) findViewById(R.id.chart_layout);
        this.h = (HealthTextView) findViewById(R.id.frequency_text);
        this.g = (HealthTextView) findViewById(R.id.duration_text);
        this.f27220b = (HealthTextView) findViewById(R.id.fall_time_text);
        this.j = (HealthTextView) findViewById(R.id.wakeup_time_text);
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.hw_hsh_detection_distribution_title);
        healthSubHeader.setVisibility(0);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        healthSubHeader.setHeadTitleText(this.f27219a.getString(R.string.IDS_nocturnal_hypoglycemia));
        healthSubHeader.setPaddingStartEnd(0.0f, 0.0f);
    }

    private void c() {
        float[] fArrD = emq.d();
        if (fArrD.length < 2) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaCardView", "get thresholds error");
            return;
        }
        float f = fArrD[1];
        f27218c = f;
        LogUtil.a("BloodSugarNocturnalHypoglycemiaCardView", "get thresholds mThresholdMin:", Float.valueOf(f));
    }

    public void d() {
        this.f = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setStatisticsData(BloodSugarNocturnalHypoglycemiaCardView bloodSugarNocturnalHypoglycemiaCardView) {
        BloodSugarNocturnalHypoglycemiaChartView bloodSugarNocturnalHypoglycemiaChartView = bloodSugarNocturnalHypoglycemiaCardView.d;
        if (bloodSugarNocturnalHypoglycemiaChartView == null) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaCardView", "setStatisticsData mBloodSugarNocturnalHypoglycemiaChartView is null");
            return;
        }
        long startTime = bloodSugarNocturnalHypoglycemiaChartView.getStartTime();
        long endTime = bloodSugarNocturnalHypoglycemiaCardView.d.getEndTime();
        String strD = ieg.d(new Date(startTime), "M/d");
        String strD2 = ieg.d(new Date(endTime), "M/d");
        bloodSugarNocturnalHypoglycemiaCardView.f27220b.setText(strD);
        bloodSugarNocturnalHypoglycemiaCardView.j.setText(strD2);
        if (bloodSugarNocturnalHypoglycemiaCardView.d.getHypoglycemiaNum() == 0) {
            bloodSugarNocturnalHypoglycemiaCardView.setVisibility(8);
        }
        Resources resources = BaseApplication.getContext().getResources();
        String quantityString = resources.getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_times_per_day, bloodSugarNocturnalHypoglycemiaCardView.d.getHypoglycemiaNum(), Integer.valueOf(bloodSugarNocturnalHypoglycemiaCardView.d.getHypoglycemiaNum()));
        String quantityString2 = resources.getQuantityString(R.plurals.IDS_hw_map_time_unit_value_minutes, bloodSugarNocturnalHypoglycemiaCardView.d.getHypoglycemiaAverageDuration(), Integer.valueOf(bloodSugarNocturnalHypoglycemiaCardView.d.getHypoglycemiaAverageDuration()));
        LogUtil.a("BloodSugarNocturnalHypoglycemiaCardView", "setStatisticsData frequency:", quantityString, ",duration:", quantityString2);
        bloodSugarNocturnalHypoglycemiaCardView.h.setText(quantityString);
        bloodSugarNocturnalHypoglycemiaCardView.g.setText(quantityString2);
    }

    private void b(long j) {
        nku.e().a(j / 1000, 3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 1, new e(this));
    }

    public void setDate(long j) {
        long jB = TimeUtil.b(j * 60000);
        if (this.f == jB) {
            return;
        }
        setVisibility(8);
        LogUtil.a("BloodSugarNocturnalHypoglycemiaCardView", "setDate: ", ieg.d(new Date(jB), "yyyy-MM-dd HH:mm:ss"));
        this.f = jB;
        b(jB);
    }

    /* JADX INFO: loaded from: classes43.dex */
    public static class a extends BaseHandler<BloodSugarNocturnalHypoglycemiaCardView> {
        a(BloodSugarNocturnalHypoglycemiaCardView bloodSugarNocturnalHypoglycemiaCardView) {
            super(bloodSugarNocturnalHypoglycemiaCardView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(final BloodSugarNocturnalHypoglycemiaCardView bloodSugarNocturnalHypoglycemiaCardView, Message message) {
            if (message.what == 0) {
                bloodSugarNocturnalHypoglycemiaCardView.i.removeAllViews();
                if (message.obj instanceof b) {
                    bloodSugarNocturnalHypoglycemiaCardView.d = new BloodSugarNocturnalHypoglycemiaChartView(bloodSugarNocturnalHypoglycemiaCardView.f27219a);
                    bloodSugarNocturnalHypoglycemiaCardView.d.setBloodSugarStandardValue(BloodSugarNocturnalHypoglycemiaCardView.f27218c);
                    b bVar = (b) message.obj;
                    bloodSugarNocturnalHypoglycemiaCardView.d.setStartTime(bVar.e().longValue());
                    bloodSugarNocturnalHypoglycemiaCardView.d.setEndTime(bVar.d().longValue());
                    bloodSugarNocturnalHypoglycemiaCardView.d.setData(bVar.b());
                    bloodSugarNocturnalHypoglycemiaCardView.d.setLoadingListener(new BloodSugarNocturnalHypoglycemiaChartView.LoadingListener() { // from class: ulu
                        @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarNocturnalHypoglycemiaChartView.LoadingListener
                        public final void onCompleted() {
                            BloodSugarNocturnalHypoglycemiaCardView.setStatisticsData(bloodSugarNocturnalHypoglycemiaCardView);
                        }
                    });
                    bloodSugarNocturnalHypoglycemiaCardView.i.addView(bloodSugarNocturnalHypoglycemiaCardView.d, new LinearLayout.LayoutParams(-1, -1));
                    bloodSugarNocturnalHypoglycemiaCardView.setVisibility(0);
                } else {
                    LogUtil.d("BloodSugarNocturnalHypoglycemiaCardView", "handleMessageWhenReferenceNotNull HANDLER_GET_CORE_SLEEP NocturnalHypoglycemiaBean is null");
                    return;
                }
            }
            if (message.what == 1) {
                bloodSugarNocturnalHypoglycemiaCardView.setVisibility(8);
            }
            if (message.what == 2) {
                BloodSugarNocturnalHypoglycemiaCardView.setStatisticsData(bloodSugarNocturnalHypoglycemiaCardView);
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<Long, Float> f27221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f27222b;
        private Long e;

        private b() {
        }

        public Long e() {
            return this.f27222b;
        }

        public void b(Long l) {
            this.f27222b = l;
        }

        public Long d() {
            return this.e;
        }

        public void e(Long l) {
            this.e = l;
        }

        public Map<Long, Float> b() {
            return this.f27221a;
        }

        public void a(Map<Long, Float> map) {
            this.f27221a = map;
        }
    }

    public static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BloodSugarNocturnalHypoglycemiaCardView> f27223a;

        e(BloodSugarNocturnalHypoglycemiaCardView bloodSugarNocturnalHypoglycemiaCardView) {
            this.f27223a = new WeakReference<>(bloodSugarNocturnalHypoglycemiaCardView);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0 && obj != null && (obj instanceof List)) {
                List list = (List) obj;
                LogUtil.e("BloodSugarNocturnalHypoglycemiaCardView", "onResponse: ", list.toString());
                final Date date = new Date(((SleepTotalData) list.get(0)).getCoreSleepFallTime());
                final Date date2 = new Date(((SleepTotalData) list.get(0)).getCoreSleepWakeupTime());
                if (date.getTime() == date2.getTime()) {
                    return;
                }
                nkb.b(date.getTime(), date2.getTime(), 0, new IBaseResponseCallback() { // from class: ulw
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj2) {
                        this.e.a(date, date2, i2, obj2);
                    }
                });
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x006b  */
        public /* synthetic */ void a(Date date, Date date2, int i, Object obj) {
            BloodSugarNocturnalHypoglycemiaCardView bloodSugarNocturnalHypoglycemiaCardView = this.f27223a.get();
            if (bloodSugarNocturnalHypoglycemiaCardView == null) {
                return;
            }
            Message messageObtain = Message.obtain();
            if (obj instanceof List) {
                List<HiHealthData> list = (List) obj;
                if (!list.isEmpty()) {
                    b bVar = new b();
                    bVar.b(Long.valueOf(date.getTime()));
                    bVar.e(Long.valueOf(date2.getTime()));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (HiHealthData hiHealthData : list) {
                        if (hiHealthData != null) {
                            linkedHashMap.put(Long.valueOf(hiHealthData.getStartTime()), Float.valueOf(hiHealthData.getFloatValue()));
                        }
                    }
                    bVar.a(linkedHashMap);
                    messageObtain.obj = bVar;
                    messageObtain.what = 0;
                } else {
                    messageObtain.what = 1;
                }
            } else {
                messageObtain.what = 1;
            }
            bloodSugarNocturnalHypoglycemiaCardView.e.sendMessage(messageObtain);
        }
    }
}
