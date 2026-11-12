package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.gxl;
import defpackage.gxp;
import defpackage.gxq;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SleepTimeProvider extends MinorProvider<gxq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26862a = true;

    protected boolean e() {
        return false;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f26862a;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("SleepTimeProvider", "loadData");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.YEAR) {
            this.f26862a = a(gxqVar);
        } else {
            if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
                this.f26862a = h(gxqVar) && gxqVar.n() != SleepViewConstants.SleepTypeEnum.MANUAL;
            } else if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH || gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK) {
                this.f26862a = gxqVar.n() != SleepViewConstants.SleepTypeEnum.MANUAL && h(gxqVar);
            } else {
                this.f26862a = false;
            }
        }
        sectionBean.d(this, gxqVar);
    }

    private boolean h(gxq gxqVar) {
        return (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE && (gxqVar.k().u() != 0 || gxqVar.k().aw() != 0 || gxqVar.k().ap() != 0)) || (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE && (gxqVar.g().q() != 0 || gxqVar.g().y() != 0)) || (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON && (gxqVar.b().r() != 0 || gxqVar.b().q() != 0));
    }

    protected boolean a(gxq gxqVar) {
        return ((gxp) gxqVar.k()).bt() > 0;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        map.put("CHART_ITEM_BEGIN_COLOR", a(context, gxqVar));
        map.put("CHART_ITEM_EDN_COLOR", b(context, gxqVar));
        map.put("CHART_ITEM_TITLE", d(context, gxqVar));
        map.put("CHART_ITEM_VALUE", e(gxqVar));
        if (LanguageUtil.o(BaseApplication.getContext())) {
            map.put("RING_CHART_DESC", context.getString(R.string.IDS_hw_show_main_home_page_sleep_new));
        } else {
            map.put("RING_CHART_DESC", "");
        }
        map.put("SHOW_VALUE", true);
        if (gxqVar.d() != SleepViewConstants.ViewTypeEnum.YEAR || e()) {
            return;
        }
        map.put("REPORT_TEXT", d(gxqVar));
    }

    private static String b(gxq gxqVar) {
        int iBw;
        if (gxqVar.k().ax() == 5) {
            iBw = ((gxp) gxqVar.k()).bu();
        } else {
            iBw = ((gxp) gxqVar.k()).bw();
        }
        double d = iBw;
        return qre.e(R.plurals.IDS_user_profile_achieve_num_day, iBw, UnitUtil.e(d, 1, 0)).replace("%s", UnitUtil.e(d, 1, 0));
    }

    public String d(gxq gxqVar) {
        if (gxqVar == null || gxqVar.q()) {
            ReleaseLogUtil.e("R_Sleep_SleepTimeProvider", "sleepViewData is null");
            return "";
        }
        return c(gxqVar);
    }

    private String c(gxq gxqVar) {
        gxp gxpVar = (gxp) gxqVar.k();
        boolean z = gxpVar.ax() == 5;
        if (!gxpVar.bx()) {
            return "";
        }
        if (z) {
            return qre.a(R.string.IDS_hw_sleep_week_aasm_count, b(gxqVar));
        }
        return qre.a(R.string.IDS_hw_sleep_week_core_count, b(gxqVar));
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepTimeProvider$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[SleepViewConstants.ViewTypeEnum.values().length];
            e = iArr;
            try {
                iArr[SleepViewConstants.ViewTypeEnum.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private ArrayList<String> d(Context context, gxq gxqVar) {
        String string;
        String string2;
        String string3;
        String strF;
        String strF2;
        String strF3;
        boolean z = gxqVar.k().ax() == 5;
        if (AnonymousClass1.e[gxqVar.d().ordinal()] != 1) {
            if (z && !e()) {
                strF = qre.f(R.string.IDS_hw_aasm_label_sleep_deepsleep_mean);
                strF2 = qre.f(R.string.IDS_hw_aasm_label_sleep_shallowsleep_mean);
                strF3 = qre.f(R.string.IDS_hw_aasm_label_sleep_rem_mean);
            } else {
                string = context.getString(R.string.IDS_details_sleep_avg_deep_sleep);
                string2 = context.getString(R.string.IDS_details_sleep_avg_light_sleep);
                string3 = context.getString(R.string.IDS_fitness_core_sleep_avg_rem_sleep);
                String str = string2;
                strF3 = string3;
                strF = string;
                strF2 = str;
            }
        } else if (z) {
            strF = qre.f(R.string.IDS_hw_aasm_label_sleep_deepsleep);
            strF2 = qre.f(R.string.IDS_hw_aasm_label_sleep_shallowsleep);
            strF3 = qre.f(R.string.IDS_hw_aasm_label_sleep_rem);
        } else {
            string = context.getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep);
            string2 = context.getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep);
            string3 = context.getString(R.string.IDS_fitness_core_sleep_rem_sleep);
            String str2 = string2;
            strF3 = string3;
            strF = string;
            strF2 = str2;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(strF);
        arrayList.add(strF2);
        if (i(gxqVar)) {
            arrayList.add(strF3);
        }
        return arrayList;
    }

    private ArrayList<Double> e(gxq gxqVar) {
        int iU;
        int iAw;
        int iAp = 0;
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.YEAR) {
            if (e() && ((gxl) gxqVar.b()).v() > 0) {
                iU = gxqVar.b().r();
                iAw = gxqVar.b().q();
            } else {
                iU = gxqVar.k().u();
                iAw = gxqVar.k().aw();
                iAp = gxqVar.k().ap();
            }
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iU = gxqVar.g().q();
            iAw = gxqVar.g().y();
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            iU = gxqVar.b().r();
            iAw = gxqVar.b().q();
        } else {
            iU = gxqVar.k().u();
            iAw = gxqVar.k().aw();
            iAp = gxqVar.k().ap();
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(Double.valueOf(iU));
        arrayList.add(Double.valueOf(iAw));
        if (i(gxqVar)) {
            arrayList.add(Double.valueOf(iAp));
        }
        return arrayList;
    }

    private boolean i(gxq gxqVar) {
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
            return gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE;
        }
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK || gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH) {
            return gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE;
        }
        return !e();
    }

    public ArrayList<Integer> a(Context context, gxq gxqVar) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_deep_sleep_color_begin)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_shallow_sleep_color_begin)));
        if (i(gxqVar)) {
            arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_rem_sleep_color_begin)));
        }
        return arrayList;
    }

    public ArrayList<Integer> b(Context context, gxq gxqVar) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_deep_sleep_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_shallow_sleep_color_end)));
        if (i(gxqVar)) {
            arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_rem_sleep_color_end)));
        }
        return arrayList;
    }
}
