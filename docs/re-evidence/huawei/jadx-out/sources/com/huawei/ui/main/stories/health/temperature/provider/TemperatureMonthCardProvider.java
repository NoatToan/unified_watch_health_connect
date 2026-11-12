package com.huawei.ui.main.stories.health.temperature.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.temperature.activity.TemperatureWarningActivity;
import defpackage.idy;
import defpackage.qre;
import defpackage.qrs;
import defpackage.uzw;
import defpackage.vbg;
import defpackage.vbl;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class TemperatureMonthCardProvider extends MinorProvider<vbg> {
    private static final String d = "KnitHealthData_CardSelected_" + DataInfos.TemperatureMonthDetail;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28126b;
    private boolean e = Utils.o();

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        sectionBean.c(c(BaseApplication.getContext()));
    }

    private HashMap<String, Object> c(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        LogUtil.a("TemperatureMonthCardProvider", "generateDefaultViewMap");
        map.put("REMIND_SHOW_MODEL", false);
        map.put("REMIND_TEXT", context.getString(R.string.IDS_temperature_warning));
        map.put("REMIND_HISTORY_TEXT", context.getString(R.string.IDS_temperature_history_warning));
        return map;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, vbg vbgVar) {
        LogUtil.a("TemperatureMonthCardProvider", "parseParams");
        this.f28126b = context;
        Map<String, SpannableStringBuilder> mapB = vbgVar.b();
        uzw uzwVar = new uzw();
        if (!mapB.isEmpty()) {
            LogUtil.a("TemperatureMonthCardProvider", "putTemperature");
            mapB.put("TEMPERATURE_MIN_MAX", mapB.get("TEMPERATURE_MIN_MAX"));
            mapB.put("SKIN_TEMPERATURE_MIN_MAX", mapB.get("SKIN_TEMPERATURE_MIN_MAX"));
        }
        map.put("TEMPERATURE_CARD_DATA", uzwVar.e(mapB, qre.f(R.string.IDS_settings_health_temperature), qre.f(R.string.IDS_health_skin_temperature)));
        a(map, vbgVar);
        b(map);
    }

    private void a(HashMap<String, Object> map, vbg vbgVar) {
        if (this.e) {
            map.put("IS_REMIND_SHOW", false);
        } else if (vbl.a()) {
            map.put("IS_REMIND_SHOW", true);
        } else {
            map.put("IS_REMIND_SHOW", false);
        }
    }

    private void b(Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureMonthCardProvider.1
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("TEMPERATURE_SELECT".equals(str)) {
                    LogUtil.a("TemperatureMonthCardProvider", "begin to sendBroadcast");
                    ObserverManagerUtil.e(TemperatureMonthCardProvider.d, "TEMPERATURE_MIN_MAX");
                    return;
                }
                if ("SKIN_TEMPERATURE_SELECT".equals(str)) {
                    ObserverManagerUtil.e(TemperatureMonthCardProvider.d, "SKIN_TEMPERATURE_MIN_MAX");
                    return;
                }
                if ("REMIND_HISTORY_VIEW".equals(str)) {
                    if (qrs.r()) {
                        LogUtil.e("TemperatureMonthCardProvider", "remind histroy text isFastClick");
                        return;
                    }
                    idy.c(AnalyticsValue.TEMPERATURE_REMIND_2060078.value());
                    try {
                        TemperatureMonthCardProvider.this.f28126b.startActivity(new Intent(TemperatureMonthCardProvider.this.f28126b, (Class<?>) TemperatureWarningActivity.class));
                        return;
                    } catch (ActivityNotFoundException e) {
                        LogUtil.e("TemperatureMonthCardProvider", " jump to TemperatureWarningActivity", e.getMessage());
                        return;
                    }
                }
                LogUtil.a("TemperatureMonthCardProvider", "useless click");
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "TemperatureMonthCardProvider";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, vbg vbgVar) {
        LogUtil.a("TemperatureMonthCardProvider", "onSetSectionBeanData");
        if (vbgVar.b().isEmpty() || this.e) {
            sectionBean.c((Object) null);
        } else {
            sectionBean.c(vbgVar);
        }
    }
}
