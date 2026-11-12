package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodPressureDescriptionActivity;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import defpackage.ftw;
import defpackage.njy;
import defpackage.qjp;
import defpackage.qre;
import defpackage.qrs;
import defpackage.utl;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressurePieChartProvider extends MinorProvider<utl> {
    private DataInfos d = DataInfos.NoDataPlaceHolder;

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        sectionBean.c(b(BaseApplication.getContext()));
    }

    private List<qjp> a(utl utlVar) {
        ArrayList arrayList = new ArrayList(16);
        c(utlVar.a(5), arrayList);
        a(utlVar.a(4), arrayList);
        e(utlVar.a(3), arrayList);
        f(utlVar.a(2), arrayList);
        b(utlVar.a(1), arrayList);
        d(utlVar.a(0), arrayList);
        return arrayList;
    }

    private Map<String, List<qjp>> d(utl utlVar) {
        HashMap map = new HashMap(16);
        for (Map.Entry entry : new HashMap(utlVar.l()).entrySet()) {
            ArrayList arrayList = new ArrayList(16);
            c(utlVar.a((Map<Integer, Integer>) entry.getValue(), 5), arrayList);
            a(utlVar.a((Map<Integer, Integer>) entry.getValue(), 4), arrayList);
            e(utlVar.a((Map<Integer, Integer>) entry.getValue(), 3), arrayList);
            f(utlVar.a((Map<Integer, Integer>) entry.getValue(), 2), arrayList);
            b(utlVar.a((Map<Integer, Integer>) entry.getValue(), 1), arrayList);
            d(utlVar.a((Map<Integer, Integer>) entry.getValue(), 0), arrayList);
            map.put((String) entry.getKey(), arrayList);
        }
        return map;
    }

    private void c(int i, List<qjp> list) {
        if (i != 0) {
            LogUtil.a("BloodPressurePieChartProvider", "highCount != 0");
            list.add(new qjp(ftw.d(5), i, ftw.e(5), e(5)));
        }
    }

    private void a(int i, List<qjp> list) {
        if (i != 0) {
            LogUtil.a("BloodPressurePieChartProvider", "moderateCount != 0");
            list.add(new qjp(ftw.d(4), i, ftw.e(4), e(4)));
        }
    }

    private void e(int i, List<qjp> list) {
        if (i != 0) {
            LogUtil.a("BloodPressurePieChartProvider", "mildCount != 0");
            list.add(new qjp(ftw.d(3), i, ftw.e(3), e(3)));
        }
    }

    private void f(int i, List<qjp> list) {
        if (i != 0) {
            LogUtil.a("BloodPressurePieChartProvider", "normalCount != 0");
            list.add(new qjp(ftw.d(2), i, ftw.e(2), e(2)));
        }
    }

    private void b(int i, List<qjp> list) {
        if (i != 0) {
            LogUtil.a("BloodPressurePieChartProvider", "idealCount != 0");
            list.add(new qjp(ftw.d(1), i, ftw.e(1), e(1)));
        }
    }

    private void d(int i, List<qjp> list) {
        if (i != 0) {
            LogUtil.a("BloodPressurePieChartProvider", "lowCount != 0");
            list.add(new qjp(ftw.d(0), i, ftw.e(0), e(0)));
        }
    }

    private int e(int i) {
        int iA = ftw.a();
        Context context = BaseApplication.getContext();
        if (i == 0) {
            return ContextCompat.getColor(context, R.color.blood_pressure_low_start);
        }
        if (i == 1) {
            return ContextCompat.getColor(context, R.color.blood_pressure_ideal_start);
        }
        if (i == 2) {
            return ContextCompat.getColor(context, R.color.blood_pressure_normal_start);
        }
        if (i == 3) {
            if (iA == 6) {
                return ContextCompat.getColor(context, R.color.blood_pressure_mild_start);
            }
            if (iA == 5) {
                return ContextCompat.getColor(context, R.color.blood_pressure_moderate_start);
            }
            return ContextCompat.getColor(context, R.color.blood_pressure_high_start);
        }
        if (i != 4) {
            if (i == 5) {
                return ContextCompat.getColor(context, R.color.blood_pressure_high_start);
            }
            return ContextCompat.getColor(context, R.color.emui_accent);
        }
        if (iA == 6) {
            return ContextCompat.getColor(context, R.color.blood_pressure_moderate_start);
        }
        return ContextCompat.getColor(context, R.color.blood_pressure_high_start);
    }

    private void c(Context context, HashMap<String, Object> map, utl utlVar) {
        String string;
        int i;
        String string2;
        String string3;
        map.put("AVE_BLOOD_PRESSURE_TYPE", utlVar.c());
        map.put("BASIC_DATA", utlVar.g());
        map.put("TIME_SHARING_BASIC_DATA", utlVar.n());
        if (this.d == DataInfos.BloodPressureWeekDetail) {
            string = context.getString(R.string.IDS_blood_pressure_week_basic_situation);
            string2 = context.getString(R.string.IDS_blood_pressure_this_week);
            string3 = context.getString(R.string.IDS_blood_pressure_last_week);
            i = 2;
        } else if (this.d == DataInfos.BloodPressureMonthDetail) {
            string = context.getString(R.string.IDS_blood_pressure_month_basic_situation);
            string2 = context.getString(R.string.IDS_blood_pressure_this_month);
            string3 = context.getString(R.string.IDS_blood_pressure_last_month);
            i = 3;
        } else {
            LogUtil.g("BloodPressurePieChartProvider", "no header found for ", this.d);
            string = null;
            i = 1;
            string2 = null;
            string3 = null;
        }
        map.put("BASIC_HEADER_TITLE", string);
        map.put("TREND_DATA", utlVar.m());
        map.put("TREND_HEADER_TITLE", context.getString(R.string.IDS_blood_pressure_measure_data_trend));
        map.put("TIME_SHARING_TITLE", context.getString(R.string.IDS_blood_pressure_time_sharing_fluctuation));
        map.put("TREND_INDICATOR_TITLE", context.getString(R.string.IDS_weight_index));
        map.put("TREND_TITLE_PRIMARY", string2);
        map.put("TREND_TITLE_SECONDARY", string3);
        map.put("DATA_INFO_INDEX", Integer.valueOf(i));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(final Context context, HashMap<String, Object> map, utl utlVar) {
        map.put("SECOND_LAYER_RING_CHART", a(utlVar));
        map.put("TIME_SHARING_RING_CHART", d(utlVar));
        c(context, map, utlVar);
        double dB = utlVar.b();
        String strE = dB <= 0.0d ? "--" : UnitUtil.e((int) dB, 1, 0);
        map.put("FIRST_LAYER_RIGHT_RIGHT", BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hw_pulse_unit, (int) dB).replace(TimeModel.NUMBER_FORMAT, ""));
        double dE = utlVar.e();
        double d = utlVar.d();
        map.put("FIRST_LAYER_LEFT_LEFT", qre.e(R.plurals.IDS_blood_pressure_result_unit, UnitUtil.b(d, Locale.getDefault()), UnitUtil.e(dE, 1, 0), UnitUtil.e(d, 1, 0)));
        map.put("FIRST_LAYER_RIGHT_LEFT", strE);
        map.put("SECOND_LAYER_RING_CHART_LEGEND_COLOR", Integer.valueOf(ContextCompat.getColor(context, R.color.textColorSecondary)));
        map.put("CLICK_EVENT_LISTENER", new BaseKnitDataProvider.c() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressurePieChartProvider.2
            @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (!qrs.c(500) && str.equals("THIRD_LAYER_CLICK_TEXT")) {
                    try {
                        context.startActivity(new Intent(context, (Class<?>) BloodPressureDescriptionActivity.class));
                    } catch (ActivityNotFoundException e) {
                        LogUtil.e("BloodPressurePieChartProvider", "ActivityNotFoundException", e.getMessage());
                    }
                }
            }
        });
    }

    private HashMap<String, Object> b(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("FIRST_LAYER_LEFT_TOP", context.getString(R.string.IDS_hw_mean_blood_pressure));
        Bundle extra = getExtra();
        if (extra != null) {
            map.put(KnitHealthDetailActivity.KEY_SUB_PAGE_INDEX, Integer.valueOf(extra.getInt(KnitHealthDetailActivity.KEY_SUB_PAGE_INDEX, 0)));
        }
        map.put("FIRST_LAYER_RIGHT_TOP", context.getString(R.string.IDS_hw_ave_pulse_value));
        map.put("SECOND_LAYER_RING_CHART_VALUE_UNIT_RES_ID", Integer.valueOf(R.plurals.IDS_details_sleep_latency_times));
        SpannableString spannableString = new SpannableString(context.getString(R.string.IDS_hw_pressure_learn_more));
        map.put("THIRD_LAYER_TEXT", BloodPressureUtil.c(0));
        map.put("THIRD_LAYER_CLICK_TEXT", spannableString);
        map.put("THIRD_LAYER_CLICK_TEXT_COLOR", Integer.valueOf(context.getColor(R.color.blood_pressure_subtab_item_text)));
        Bundle extra2 = getExtra();
        Serializable serializable = extra2 != null ? extra2.getSerializable("key_bundle_health_line_chart_data_infos") : null;
        DataInfos dataInfos = serializable instanceof DataInfos ? (DataInfos) serializable : DataInfos.NoDataPlaceHolder;
        this.d = dataInfos;
        map.put("DATA_INFO", dataInfos);
        return map;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "BloodPressurePieChartProvider";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, utl utlVar) {
        if (njy.e(utlVar.f())) {
            sectionBean.c((Object) null);
        } else {
            sectionBean.c(utlVar);
        }
    }
}
