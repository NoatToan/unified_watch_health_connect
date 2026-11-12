package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import defpackage.gxq;
import health.compact.a.UnitUtil;
import java.text.NumberFormat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SleepReportText02Provider extends MinorProvider<gxq> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26844c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        boolean z = gxqVar != null && (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL || gxqVar.t() || gxqVar.d() != SleepViewConstants.ViewTypeEnum.DAY || !gxqVar.r());
        LogUtil.a("SleepReportText02Provider", "Is active: " + z);
        if (z) {
            sectionBean.c(gxqVar);
        } else {
            sectionBean.c((Object) null);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepReportText02Provider", "parseParams");
        if (gxqVar == null) {
            return;
        }
        LogUtil.a("SleepReportText02Provider", "getTimePeriodType: ", gxqVar.d());
        if (gxqVar.m().containsKey("OPEN_STATUS") && (gxqVar.m().get("OPEN_STATUS") instanceof Boolean)) {
            this.f26844c = ((Boolean) gxqVar.m().get("OPEN_STATUS")).booleanValue();
        }
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
            b(context, gxqVar, map);
        } else if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK) {
            c(context, gxqVar, map);
        } else if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH) {
            a(context, gxqVar, map);
        }
    }

    private void a(Context context, gxq gxqVar, HashMap<String, Object> map) {
        String strA;
        if (!gxqVar.q()) {
            strA = "";
        } else {
            strA = a(context, gxqVar);
        }
        map.put("REPORT_TEXT", strA);
    }

    private void c(Context context, gxq gxqVar, HashMap<String, Object> map) {
        String strA;
        if (!gxqVar.q()) {
            strA = "";
        } else {
            strA = a(context, gxqVar);
        }
        map.put("REPORT_TEXT", strA);
    }

    private String a(Context context, gxq gxqVar) {
        String str = NumberFormat.getInstance().format(3L);
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL || gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            return context.getResources().getString(R.string.IDS_manual_sleep_less_than_three, Integer.valueOf(str));
        }
        return context.getResources().getString(R.string.IDS_fitness_core_sleep_less_than_three, Integer.valueOf(str));
    }

    private void b(Context context, gxq gxqVar, HashMap<String, Object> map) {
        String string;
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            LogUtil.a("SleepReportText02Provider", "isManualSleep");
            if (gxqVar.h().t()) {
                String strE = UnitUtil.e(3.0d, 1, 0);
                if (VersionControlUtil.isSupportSleepManagement() && !this.f26844c) {
                    string = context.getResources().getString(R.string.IDS_manual_sleep_less_than_three, Integer.valueOf(strE));
                } else {
                    string = "";
                }
            } else if (gxqVar.h().q()) {
                string = context.getResources().getString(R.string.IDS_manual_sleep_only_bed);
            } else {
                LogUtil.a("SleepReportText02Provider", "isManualSleep no notice");
                string = "";
            }
        } else if (d(gxqVar)) {
            LogUtil.a("SleepReportText02Provider", "isMergePhoneSleep");
            string = context.getResources().getString(R.string.IDS_sleep_phone_records_reminders);
        } else if (!gxqVar.r() && VersionControlUtil.isSupportSleepManagement() && this.f26844c) {
            LogUtil.a("SleepReportText02Provider", "no data today");
            string = context.getResources().getString(R.string.IDS_intel_sleep_advice_1);
        } else {
            LogUtil.a("SleepReportText02Provider", "report text02 not visible");
            string = "";
        }
        map.put("REPORT_TEXT", string);
    }

    private boolean d(gxq gxqVar) {
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE && gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
            return true;
        }
        Object obj = gxqVar.m().get("IS_PHONE_AND_CORE_NOON");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue() && (gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK || gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH)) {
            return true;
        }
        if (gxqVar.g().n()) {
            return gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK || gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH;
        }
        return false;
    }
}
