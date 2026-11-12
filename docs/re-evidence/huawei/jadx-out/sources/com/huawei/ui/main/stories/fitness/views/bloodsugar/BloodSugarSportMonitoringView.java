package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarSportMonitoringView;
import defpackage.emq;
import defpackage.idy;
import defpackage.ieg;
import defpackage.iov;
import defpackage.ntv;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.ula;
import defpackage.umg;
import defpackage.uwf;
import defpackage.vrg;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarSportMonitoringView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f27227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f27228c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27229a;
    private final Handler d;
    private LayoutInflater e;
    private long f;
    private final BloodSugarSportMonitoringView g;
    private LinearLayout h;
    private int i;
    private int j;

    static /* synthetic */ int d(BloodSugarSportMonitoringView bloodSugarSportMonitoringView) {
        int i = bloodSugarSportMonitoringView.j;
        bloodSugarSportMonitoringView.j = i + 1;
        return i;
    }

    public BloodSugarSportMonitoringView(Context context) {
        this(context, null);
    }

    public BloodSugarSportMonitoringView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BloodSugarSportMonitoringView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 0L;
        this.j = 0;
        this.i = 0;
        this.f27229a = context;
        this.g = this;
        this.d = new e(this);
        b(context);
        a();
    }

    private void a() {
        float[] fArrD = emq.d();
        if (fArrD.length < 2) {
            LogUtil.d("BloodSugarSportMonitoringView", "get thresholds error");
            return;
        }
        float f = fArrD[1];
        f27228c = f;
        float f2 = fArrD[0];
        f27227b = f2;
        LogUtil.a("BloodSugarSportMonitoringView", "get thresholds mThresholdMin:", Float.valueOf(f), ",mThresholdMax:", Float.valueOf(f2));
    }

    public void e() {
        this.f = 0L;
        this.j = 0;
    }

    private void b(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.e = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.layout_blood_sugar_sport_container_view, this);
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.sport_blood_sugar_title);
        this.h = (LinearLayout) findViewById(R.id.layout_sport_view);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        healthSubHeader.setHeadTitleText(this.f27229a.getString(R.string.IDS_hw_show_healthdata_monitoring));
        healthSubHeader.setPaddingStartEnd(0.0f, 0.0f);
        this.g.setVisibility(8);
    }

    public void setDate(long j) {
        long j2 = j * 60000;
        long jB = TimeUtil.b(j2);
        if (this.f == jB) {
            return;
        }
        this.f = jB;
        this.g.setVisibility(8);
        this.h.removeAllViews();
        long jA = TimeUtil.a(j2);
        LogUtil.a("BloodSugarSportMonitoringView", "getSportRecords startTime = ", ieg.d(new Date(jB), "yyyy-MM-dd HH:mm:ss"), ",endTime = ", ieg.d(new Date(jA), "yyyy-MM-dd HH:mm:ss"));
        ula.c().e(jB, jA, new int[]{2108}, new c(this, jB, jA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(umg umgVar, Map<Long, Float> map) {
        long startTime = umgVar.getStartTime();
        long endTime = umgVar.getEndTime();
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        for (Map.Entry<Long, Float> entry : map.entrySet()) {
            if (entry.getKey().longValue() >= startTime && entry.getKey().longValue() <= endTime) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.size() == 0) {
            return;
        }
        umgVar.a(b((Map<Long, Float>) linkedHashMap));
        Message messageObtain = Message.obtain();
        messageObtain.obj = umgVar;
        messageObtain.what = 1;
        this.d.sendMessage(messageObtain);
    }

    private String b(Map<Long, Float> map) {
        if (map == null || map.size() == 0) {
            return String.valueOf(0);
        }
        Iterator<Map.Entry<Long, Float>> it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            float fFloatValue = it.next().getValue().floatValue();
            if (fFloatValue > f27228c && fFloatValue <= f27227b) {
                i++;
            }
        }
        String strE = UnitUtil.e(new BigDecimal(i).divide(new BigDecimal(map.size()), 2, 4).multiply(BigDecimal.valueOf(100L)).doubleValue(), 2, 0);
        LogUtil.a("BloodSugarSportMonitoringView", "proportion : ", strE);
        return strE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(View view, umg umgVar) {
        ((HealthTextView) view.findViewById(R.id.percentage_text)).setText(umgVar.c());
        c((HealthTextView) view.findViewById(R.id.sport_motion_distance_text), (HealthTextView) view.findViewById(R.id.sport_motion_distance_unit_text), umgVar);
        ((HealthTextView) view.findViewById(R.id.sport_start_time_text)).setText(UnitUtil.d("HH:mm", umgVar.getStartTime()));
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.heart_rate_text);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.heart_rate_unit_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.heart_rate_image);
        if (umgVar.getAvgHeartRate() == 0 && umgVar.getTotalCalories() == 0) {
            b(healthTextView, healthTextView2, imageView, 8);
        } else if (umgVar.getAvgHeartRate() > 0) {
            b(healthTextView, healthTextView2, imageView, 0);
            healthTextView.setText(String.valueOf(UnitUtil.e(umgVar.getAvgHeartRate(), 1, 0)));
            healthTextView2.setText(R.string.IDS_main_watch_heart_rate_unit_string);
            if (d()) {
                imageView.setBackground(qqz.e(BaseApplication.b(), R.mipmap.ic_bloodsugar_heart));
            } else {
                imageView.setBackgroundResource(R.mipmap.ic_bloodsugar_heart);
            }
        } else {
            b(healthTextView, healthTextView2, imageView, 0);
            healthTextView.setText(UnitUtil.e(((double) umgVar.getTotalCalories()) / 1000.0d, 1, 0));
            healthTextView2.setText(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_unit);
            if (d()) {
                imageView.setBackground(qqz.e(BaseApplication.b(), R.mipmap.ic_bloodsugar_heat));
            } else {
                imageView.setBackgroundResource(R.mipmap.ic_bloodsugar_heat);
            }
        }
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.sport_duration_text);
        healthTextView3.setText(UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(umgVar.getTotalTime())));
        a(healthTextView, healthTextView3, healthTextView2);
        c(view, umgVar);
    }

    private static void b(HealthTextView healthTextView, HealthTextView healthTextView2, ImageView imageView, int i) {
        healthTextView.setVisibility(i);
        healthTextView2.setVisibility(i);
        imageView.setVisibility(i);
    }

    private static void c(View view, final umg umgVar) {
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.sport_type_image_bg);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.sport_type_image);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.sport_duration_image);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.right_arrow_image);
        Drawable drawableB = vrg.b(context, umgVar.getSportType());
        imageView.setBackground(qqf.c(context.getDrawable(R.drawable.icon_bg), vrg.c(context, umgVar.getSportType())));
        if (d()) {
            imageView2.setBackground(qqz.e(context, drawableB));
            imageView3.setImageDrawable(qqz.e(context, R.mipmap.ic_excercise_time));
            imageView4.setBackground(qqz.e(context, R.mipmap.common_arrow_right_click_true));
        } else {
            imageView2.setBackground(drawableB);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: ulv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodSugarSportMonitoringView.d(umgVar);
            }
        });
        HashMap map = new HashMap(16);
        map.put("type", 1);
        map.put(ParsedFieldTag.NPES_SPORT_TIME, Long.valueOf(umgVar.getStartTime()));
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_ANALYSIS_SPORT_2040139.value();
        map.put("click", "1");
        idy.b(strValue, map);
    }

    private static void a(final HealthTextView healthTextView, final HealthTextView healthTextView2, final HealthTextView healthTextView3) {
        healthTextView3.post(new Runnable() { // from class: ult
            @Override // java.lang.Runnable
            public final void run() {
                BloodSugarSportMonitoringView.c(healthTextView3, healthTextView, healthTextView2);
            }
        });
    }

    public static /* synthetic */ void c(HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3) {
        if (healthTextView == null) {
            LogUtil.d("BloodSugarSportMonitoringView", "setAutoWidthTextView textView is null");
            return;
        }
        Layout layout = healthTextView.getLayout();
        if (layout == null) {
            LogUtil.d("BloodSugarSportMonitoringView", "setAutoWidthTextView layout is null");
            a(healthTextView2, healthTextView3, healthTextView);
            return;
        }
        int lineCount = layout.getLineCount();
        if (lineCount <= 0 || lineCount <= healthTextView2.getMaxLines()) {
            return;
        }
        float textSize = healthTextView.getTextSize();
        float fA = qqp.a(BaseApplication.b(), 1.0f);
        float fA2 = qqp.a(BaseApplication.b(), 9.0f);
        float f = textSize - fA;
        LogUtil.a("BloodSugarSportMonitoringView", "setAutoWidthTextView nowTextSize is: ", Float.valueOf(f));
        if (f >= fA2) {
            healthTextView2.setTextSize(0, f);
            healthTextView3.setTextSize(0, f);
            healthTextView.setTextSize(0, f);
            a(healthTextView2, healthTextView3, healthTextView);
        }
    }

    private static void c(HealthTextView healthTextView, HealthTextView healthTextView2, umg umgVar) {
        int sportType = umgVar.getSportType();
        if (sportType != 262) {
            if (sportType == 265) {
                healthTextView.setText(UnitUtil.e(((double) umgVar.getTotalCalories()) / 1000.0d, 1, 0));
                healthTextView2.setText(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_unit);
                return;
            } else if (sportType != 266) {
                String distanceUnit = getDistanceUnit();
                healthTextView.setText(UnitUtil.e(new BigDecimal(umgVar.getTotalDistance()).divide(new BigDecimal(1000), 2, 4).doubleValue(), 1, 2));
                healthTextView2.setText(distanceUnit);
                return;
            }
        }
        String strE = e(umgVar.getTotalDistance());
        healthTextView.setText(UnitUtil.e(umgVar.getTotalDistance(), 1, 2));
        healthTextView2.setText(strE);
    }

    private static String getDistanceUnit() {
        if (UnitUtil.f()) {
            return BaseApplication.b().getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
        }
        return BaseApplication.b().getResources().getString(R.string.IDS_band_data_sport_distance_unit);
    }

    private static String e(int i) {
        if (UnitUtil.f()) {
            return BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, i);
        }
        return BaseApplication.b().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(umg umgVar) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(umgVar.getStartTime(), umgVar.getEndTime());
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarSportMonitoringView.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj instanceof SparseArray) {
                    BloodSugarSportMonitoringView.a(obj);
                } else {
                    LogUtil.d("BloodSugarSportMonitoringView", "goToSportDetail object not SparseArray");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            LogUtil.d("BloodSugarSportMonitoringView", "goToSportDetail map none");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.addAll(d((SparseArray<Object>) sparseArray));
        if (arrayList.isEmpty()) {
            LogUtil.d("BloodSugarSportMonitoringView", "goToSportDetail healthDataList isEmpty");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) arrayList.get(0);
        if (hiHealthData == null) {
            LogUtil.d("BloodSugarSportMonitoringView", "goToSportDetail hiHealthData is null");
            return;
        }
        MotionPathSimplify motionPathSimplifyD = ntv.d(hiHealthData);
        if (motionPathSimplifyD == null) {
            LogUtil.d("BloodSugarSportMonitoringView", "goToSportDetail simplifyData is null");
            return;
        }
        String strB = ntv.b(hiHealthData, motionPathSimplifyD);
        if (strB == null) {
            LogUtil.d("BloodSugarSportMonitoringView", "goToSportDetail fileUrl is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("simplifyDatakey", motionPathSimplifyD);
        bundle.putString("contentpath", strB);
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) TrackDetailActivity.class);
        intent.putExtras(bundle);
        intent.addFlags(268435456);
        HashMap map = new HashMap(16);
        map.put("type", 0);
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_SPORT_MONITORING_2040133.value();
        map.put("click", "1");
        idy.b(strValue, map);
        iov.d(BaseApplication.b(), intent);
    }

    private static List<HiHealthData> d(SparseArray<Object> sparseArray) {
        Object obj = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        if (obj instanceof List) {
            try {
                return (List) obj;
            } catch (ClassCastException unused) {
                LogUtil.c("BloodSugarSportMonitoringView", "filterHiHealthDataList, is not List<HiHealthData>");
                return Collections.EMPTY_LIST;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean d() {
        return LanguageUtil.ba(BaseApplication.b());
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class e extends BaseHandler<BloodSugarSportMonitoringView> {
        e(BloodSugarSportMonitoringView bloodSugarSportMonitoringView) {
            super(bloodSugarSportMonitoringView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BloodSugarSportMonitoringView bloodSugarSportMonitoringView, Message message) {
            if (message.what == 1 && (message.obj instanceof umg)) {
                umg umgVar = (umg) message.obj;
                if (umgVar.d() != bloodSugarSportMonitoringView.f) {
                    return;
                }
                View viewInflate = qrs.ac() ? bloodSugarSportMonitoringView.e.inflate(R.layout.item_sport_bloodsugar_large, (ViewGroup) null) : bloodSugarSportMonitoringView.e.inflate(R.layout.item_sport_bloodsugar, (ViewGroup) null);
                BloodSugarSportMonitoringView.d(bloodSugarSportMonitoringView);
                if (bloodSugarSportMonitoringView.j == bloodSugarSportMonitoringView.i) {
                    viewInflate.setPadding(0, 0, 0, 0);
                }
                BloodSugarSportMonitoringView.a(viewInflate, umgVar);
                bloodSugarSportMonitoringView.h.addView(viewInflate);
                bloodSugarSportMonitoringView.setVisibility(0);
            }
            if (message.what == 2) {
                bloodSugarSportMonitoringView.setVisibility(8);
            }
        }
    }

    public static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f27230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BloodSugarSportMonitoringView> f27232c;

        c(BloodSugarSportMonitoringView bloodSugarSportMonitoringView, long j, long j2) {
            this.f27232c = new WeakReference<>(bloodSugarSportMonitoringView);
            this.f27230a = j;
            this.f27231b = j2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, final Object obj) {
            if (this.f27232c.get() == null || !(obj instanceof List) || ((List) obj).isEmpty()) {
                return;
            }
            uwf.d().b(this.f27230a, this.f27231b, new IBaseResponseCallback() { // from class: umc
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj2) {
                    this.f50348b.b(obj, i2, obj2);
                }
            });
        }

        public /* synthetic */ void b(Object obj, int i, Object obj2) {
            BloodSugarSportMonitoringView bloodSugarSportMonitoringView = this.f27232c.get();
            if (bloodSugarSportMonitoringView != null && (obj2 instanceof List)) {
                List list = (List) obj2;
                bloodSugarSportMonitoringView.i = list.size();
                if (list.isEmpty()) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (HiHealthData hiHealthData : (List) obj) {
                    if (hiHealthData != null) {
                        linkedHashMap.put(Long.valueOf(hiHealthData.getStartTime()), Float.valueOf(hiHealthData.getFloatValue()));
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bloodSugarSportMonitoringView.c((umg) it.next(), linkedHashMap);
                }
            }
        }
    }
}
