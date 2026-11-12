package com.huawei.ui.main.stories.health.lactatethreshold.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.utils.CalendarChangeCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.LacticHorizontalActivity;
import com.huawei.ui.main.stories.health.lactatethreshold.chart.LacticChartHolder;
import defpackage.fok;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class LacticLineChartProvider extends BaseKnitDataProvider implements CalendarChangeCallBack {
    private Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataInfos f27990a = DataInfos.NoDataPlaceHolder;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f27991b = 0;
    private String i = "lthrHr";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27992c = true;
    private Observer e = new Observer() { // from class: com.huawei.ui.main.stories.health.lactatethreshold.provider.LacticLineChartProvider.4
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            Object obj;
            if (!LacticLineChartProvider.this.a().equals(str) || objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Integer)) {
                return;
            }
            int iIntValue = ((Integer) obj).intValue();
            LacticLineChartProvider.this.i = iIntValue == 0 ? "lthrHr" : "lthrPace";
        }
    };

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        super.parseParams(context, map, obj);
        map.put("FIRST_TIME_BIND", Boolean.valueOf(this.f27992c));
        this.f27992c = false;
    }

    private HashMap<String, Object> a(Context context) {
        c();
        HashMap<String, Object> map = new HashMap<>();
        map.put("CURSOR_UP_AVERAGE_UNIT", Integer.valueOf(R.string.IDS_main_watch_heart_rate_unit_string));
        map.put("DATA_INFO", this.f27990a);
        map.put("START_TIME", Long.valueOf(this.f27991b));
        map.put("RANGE_SHOW_CALL_BACK", this);
        map.put("HEALTH_CHART_HOLDER", new LacticChartHolder(context));
        map.put("CalendarChangeCallBack", this);
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.lactatethreshold.provider.LacticLineChartProvider.1
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (LacticLineChartProvider.this.d == null) {
                    return;
                }
                Intent intent = new Intent(LacticLineChartProvider.this.d, (Class<?>) LacticHorizontalActivity.class);
                Bundle extra = LacticLineChartProvider.this.getExtra();
                extra.putLong("key_bundle_health_last_data_time", LacticLineChartProvider.this.f27991b);
                extra.putString("key_bundle_health_line_chart_show_data_type", LacticLineChartProvider.this.i);
                intent.putExtras(extra);
                try {
                    LacticLineChartProvider.this.d.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("TAG", " to LacticHorizontalActivity ", e.getMessage());
                }
            }
        });
        return map;
    }

    @Override // com.huawei.health.knit.section.utils.CalendarChangeCallBack
    public void onChange(long j) {
        this.f27991b = j;
    }

    private void c() {
        Bundle extra = getExtra();
        DataInfos dataInfos = DataInfos.NoDataPlaceHolder;
        long jCurrentTimeMillis = 0;
        if (extra != null) {
            long j = extra.getLong("key_bundle_health_last_data_time", 0L);
            jCurrentTimeMillis = j == 0 ? System.currentTimeMillis() : j;
            Serializable serializable = extra.getSerializable("key_bundle_health_line_chart_data_infos");
            if (serializable instanceof DataInfos) {
                dataInfos = (DataInfos) serializable;
            }
        }
        this.f27990a = dataInfos;
        this.f27991b = jCurrentTimeMillis;
        ObserverManagerUtil.d(this.e, a());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        sectionBean.c(a(BaseApplication.getContext()));
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        super.loadData(context, sectionBean);
        this.d = context;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ObserverManagerUtil.a(this.e, a());
    }

    protected String a() {
        return fok.b(this.f27990a);
    }
}
