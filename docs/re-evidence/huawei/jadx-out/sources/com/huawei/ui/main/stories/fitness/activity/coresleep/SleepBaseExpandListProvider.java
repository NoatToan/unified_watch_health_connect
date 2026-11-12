package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.servicesui.R;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hms.hwid.f$$ExternalSyntheticApiModelOutline0;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.fsn;
import defpackage.fso;
import defpackage.fsr;
import defpackage.fss;
import defpackage.gxd;
import defpackage.gxp;
import defpackage.gxq;
import defpackage.idy;
import defpackage.njy;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.uck;
import defpackage.uyr;
import defpackage.wud;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;

/* JADX INFO: loaded from: classes43.dex */
public abstract class SleepBaseExpandListProvider extends MinorProvider<gxq> {
    protected static final int DEFAULT_SHOW_TYPE = 1;
    private int mAbnormalCode;
    protected int mArrowRes;
    private Observer mBiObserver;
    protected boolean mIsActive;
    protected String mRequestDay;
    protected SectionBean mSectionBean;
    protected WeakReference<KnitSleepDetailActivity> mWeakRef;
    protected fss mExpandReportListBean = new fss();
    protected gxq mSleepViewData = new gxq(SleepViewConstants.ViewTypeEnum.DAY);
    private String mAbnormalData = null;
    protected boolean mIsOpen = false;
    private Map<String, Integer> mOrder = new HashMap();
    private String mReferenceLine = Constants.LINK;

    protected abstract String getTag();

    protected int getType() {
        return 1;
    }

    protected abstract void handleTruSleepData(CharSequence[] charSequenceArr, c cVar);

    protected abstract boolean isEffectiveDate();

    protected abstract void setSectionBeanData(SectionBean sectionBean, gxq gxqVar);

    protected abstract void updateDataUi();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (gxq) obj);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.mIsActive;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return getTag();
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        registerMoreAnalysisObserver();
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        ReleaseLogUtil.d(getTag(), "loadData");
        this.mWeakRef = new WeakReference<>((KnitSleepDetailActivity) context);
        this.mSectionBean = sectionBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        setSectionBeanData(sectionBean, gxqVar);
    }

    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a(getTag(), "parseParams");
        processData(gxqVar, map);
    }

    private void processData(gxq gxqVar, HashMap<String, Object> map) {
        LogUtil.a(getTag(), "processData");
        this.mSleepViewData = gxqVar;
        reset(map);
        if (!init()) {
            LogUtil.j(getTag(), "init fail");
            this.mIsActive = false;
        } else {
            updateDataUi();
            LogUtil.a(getTag(), "bean is ", this.mExpandReportListBean);
            map.put("EXPAND_LIST_BEAN", this.mExpandReportListBean);
        }
    }

    public void sortBeanList() {
        if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.e(getTag(), "cannot showSleepManagement");
            return;
        }
        ArrayList arrayList = new ArrayList();
        initAbnormalStatus(arrayList);
        for (fsn fsnVar : this.mExpandReportListBean.a()) {
            if (fsnVar instanceof fsr) {
                if (arrayList.contains(((fsr) fsnVar).i())) {
                    fsnVar.c(true);
                }
            } else if ((fsnVar instanceof fso) && arrayList.contains(((fso) fsnVar).f())) {
                fsnVar.c(true);
            }
        }
        fsn[] fsnVarArr = (fsn[]) this.mExpandReportListBean.a().toArray(new fsn[0]);
        Arrays.sort(fsnVarArr, new Comparator() { // from class: tyc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((fsn) obj).c(), ((fsn) obj2).c());
            }
        });
        Arrays.sort(fsnVarArr, new Comparator() { // from class: txy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Boolean.compare(((fsn) obj2).d(), ((fsn) obj).d());
            }
        });
        Arrays.sort(fsnVarArr, new Comparator<fsn>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(fsn fsnVar2, fsn fsnVar3) {
                return (fsnVar2.c() == SleepBaseExpandListProvider.this.mExpandReportListBean.g() && fsnVar2.d()) ? -1 : 0;
            }
        });
        this.mExpandReportListBean.a().clear();
        for (fsn fsnVar2 : fsnVarArr) {
            this.mExpandReportListBean.a().add(fsnVar2);
        }
        LogUtil.a(getTag(), "mTopAbnormal is ", Integer.valueOf(this.mExpandReportListBean.g()), "after sort list is ", this.mExpandReportListBean.a().toString());
    }

    private void initAbnormalStatus(List<String> list) {
        list.add(qre.f(R.string.IDS_details_sleep_grade_late));
        list.add(qre.f(R.string.IDS_details_sleep_grade_high));
        list.add(qre.f(R.string.IDS_details_sleep_grade_early));
        list.add(qre.f(R.string.IDS_details_sleep_grade_low));
        list.add(qre.f(R.string.IDS_hwh_runningstyle_longer));
        list.add(qre.f(R.string.IDS_hwh_runningstyle_shorter));
        list.add(qre.f(R.string.IDS_physiological_index_high));
        list.add(qre.f(R.string.IDS_physiological_index_low));
        list.add(qre.f(R.string.IDS_details_sleep_grade_high_2));
        list.add(qre.f(R.string.IDS_details_sleep_grade_low_2));
        list.add(qre.f(R.string.IDS_details_sleep_grade_high_1));
        list.add(qre.f(R.string.IDS_details_sleep_grade_low_1));
    }

    public void setProviderActive(gxq gxqVar) {
        if (gxqVar.d() != SleepViewConstants.ViewTypeEnum.YEAR && gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL && (gxqVar.h().q() || gxqVar.h().t())) {
            LogUtil.a(getTag(), "isManualOnlyBedTime");
            this.mIsActive = false;
        } else {
            this.mIsActive = gxqVar.r();
        }
    }

    private void reset(HashMap<String, Object> map) {
        map.clear();
        this.mExpandReportListBean.e();
    }

    private boolean init() {
        this.mReferenceLine = wud.b(BaseApplication.getContext());
        if (getExtra() != null) {
            if (!isEffectiveDate()) {
                LogUtil.j(getTag(), "sleep day is null");
                return false;
            }
            this.mRequestDay = DateFormatUtil.d(this.mSleepViewData.f(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.mArrowRes = com.huawei.ui.main.R.drawable.common_ui_arrow_left;
        } else {
            this.mArrowRes = com.huawei.ui.main.R.drawable.common_ui_arrow_right;
        }
        setSleepManagementData(this.mSleepViewData);
        return true;
    }

    private void setSleepManagementData(gxq gxqVar) {
        if (gxqVar.m().containsKey("MGMT_DAILY_SLEEP_PROCESS") && (gxqVar.m().get("MGMT_DAILY_SLEEP_PROCESS") instanceof gxd)) {
            LogUtil.a(getTag(), "update abnormal");
            this.mAbnormalCode = ((gxd) gxqVar.m().get("MGMT_DAILY_SLEEP_PROCESS")).j();
            LogUtil.a(getTag(), "abnormalCode:", Integer.valueOf(this.mAbnormalCode));
            if (this.mAbnormalCode == 0) {
                this.mExpandReportListBean.b(-1);
                return;
            } else {
                this.mOrder = uyr.f50749c;
                this.mExpandReportListBean.b(uyr.f50748b.get(Integer.valueOf(this.mAbnormalCode)).intValue());
                LogUtil.a(getTag(), "get abnormal data is ", uyr.f50748b.get(Integer.valueOf(this.mAbnormalCode)));
            }
        }
        if (gxqVar.m().containsKey("OPEN_STATUS") && (gxqVar.m().get("OPEN_STATUS") instanceof Boolean)) {
            this.mIsOpen = ((Boolean) gxqVar.m().get("OPEN_STATUS")).booleanValue();
        }
    }

    private void registerMoreAnalysisObserver() {
        if (this.mBiObserver != null) {
            return;
        }
        LogUtil.a(getTag(), "init observer");
        Observer observer = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if ("SLEEP_MORE_ANALYSIS".equals(str)) {
                    b(objArr);
                } else {
                    LogUtil.j(SleepBaseExpandListProvider.this.getTag(), "other labels");
                }
            }

            private void b(Object[] objArr) {
                Object obj;
                Map map = new HashMap(16);
                ArrayList arrayList = new ArrayList();
                SleepBaseExpandListProvider.this.setBiData(arrayList);
                if (objArr.length == 1 && (objArr[0] instanceof String) && AnalyticsValue.HEALTH_SLEEP_CORE_SLEEP_TIME_2030111.value().equals((String) objArr[0]) && SleepBaseExpandListProvider.this.mExpandReportListBean != null) {
                    map.put("click", 1);
                    if (!TextUtils.isEmpty(SleepBaseExpandListProvider.this.mAbnormalData)) {
                        obj = SleepBaseExpandListProvider.this.mAbnormalData;
                    } else {
                        obj = false;
                    }
                    map.put("alertData", obj);
                    boolean zE = njy.e(arrayList);
                    Object obj2 = arrayList;
                    if (zE) {
                        obj2 = false;
                    }
                    map.put("abnormalData", obj2);
                    LogUtil.a(SleepBaseExpandListProvider.this.getTag(), "HEALTH_SLEEP_CORE_SLEEP_TIME_2030111 bi map: ", map.toString());
                } else if (objArr.length == 2 && (objArr[0] instanceof String) && AnalyticsValue.SLEEP_MONITORING_RESULTS_21300045.value().equals((String) objArr[0])) {
                    Object obj3 = objArr[1];
                    if (obj3 instanceof Map) {
                        map = (Map) obj3;
                        boolean zAdd = TextUtils.isEmpty(SleepBaseExpandListProvider.this.mAbnormalData) ? false : arrayList.add(SleepBaseExpandListProvider.this.mAbnormalData);
                        boolean zE2 = njy.e(arrayList);
                        Object obj4 = arrayList;
                        if (zE2) {
                            obj4 = false;
                        }
                        map.put("abnormalData", obj4);
                        LogUtil.a(SleepBaseExpandListProvider.this.getTag(), "SLEEP_MONITORING_RESULTS_21300045 bi map is:", map.toString(), " hasWarningData :", Boolean.valueOf(zAdd));
                    }
                }
                idy.b((String) objArr[0], map);
            }
        };
        this.mBiObserver = observer;
        ObserverManagerUtil.d(observer, "SLEEP_MORE_ANALYSIS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiData(List<String> list) {
        if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.e(getTag(), "cannot showSleepManagement");
            return;
        }
        this.mAbnormalData = null;
        for (fsn fsnVar : this.mExpandReportListBean.a()) {
            if (fsnVar.d() && fsnVar.c() != this.mExpandReportListBean.g()) {
                list.add(getMappingName(fsnVar.c()));
            } else if (fsnVar.c() == this.mExpandReportListBean.g()) {
                this.mAbnormalData = getMappingName(fsnVar.c());
            }
        }
    }

    private String getMappingName(int i) {
        if (this.mOrder.isEmpty()) {
            this.mOrder = uyr.f50749c;
        }
        for (Map.Entry<String, Integer> entry : this.mOrder.entrySet()) {
            if (entry.getValue().intValue() == i) {
                return entry.getKey();
            }
        }
        return "";
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        this.mExpandReportListBean.e();
        ObserverManagerUtil.a("SLEEP_MORE_ANALYSIS");
        ObserverManagerUtil.a(ObserveLabels.HEART_RATE_SWITCH_STATUS);
        ObserverManagerUtil.a(ObserveLabels.SPO2_MONITOR_SWITCH_STATUS);
    }

    public String handleRtlPercent(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        int iIndexOf = sb.indexOf("%");
        int i2 = i < 100 ? 2 : 3;
        if (iIndexOf == -1 || iIndexOf < i2) {
            return str;
        }
        sb.deleteCharAt(iIndexOf);
        sb.insert(iIndexOf - i2, "%");
        return sb.toString();
    }

    public void setSleepEfficientClickEvent(Context context, int i, int i2) {
        LogUtil.a(getTag(), "setSleepEfficientClickEvent");
        SleepRateActivity.a(context, "TYPE_SLEEP_EFFICIENCY", i, i2);
    }

    public String getItemTitle(int i, String str) {
        return qre.a(com.huawei.ui.main.R.string.IDS_sleep_title_item_two_parts, qre.f(i), str);
    }

    public void setBedTimeClickEvent(int i, int i2, int i3) {
        LogUtil.a(getTag(), "setBedTimeClickEvent");
        setNightSleepTimeClickEvent("TYPE_SLEEP_BED_TIME", i, i2, i3);
    }

    public void setNightSleepTimeClickEvent(String str, int i, int i2, int i3) {
        LogUtil.a(getTag(), "setNightSleepClickEvent");
        WeakReference<KnitSleepDetailActivity> weakReference = this.mWeakRef;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.a(getTag(), "setNightSleepClickEvent, mWeakRef is invalid");
        } else {
            SleepDurationActivity.e(this.mWeakRef.get(), str, i, i2, i3, this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE);
        }
    }

    public String getFormatTime(int i, int i2) {
        try {
            String strE = qre.e(com.huawei.ui.main.R.plurals.IDS_min_unit, i2, UnitUtil.e(i2, 1, 0));
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                sb.append(strE);
            } else {
                sb.append(BaseApplication.getContext().getString(com.huawei.ui.main.R.string.IDS_two_parts, qre.e(com.huawei.ui.main.R.plurals.IDS_hour_unit, i, UnitUtil.e(i, 1, 0)), strE));
            }
            return sb.toString();
        } catch (MissingFormatArgumentException unused) {
            LogUtil.j(getTag(), "getFormatTime, MissingFormatArgumentException");
            return "";
        }
    }

    public void setAvgSleepTimeClickEvent(int i, int i2, int i3) {
        LogUtil.a(getTag(), "setSleepTimeClickEvent");
        setNightSleepTimeClickEvent("TYPE_SLEEP_TIME", i, i2, i3);
    }

    public int getSleepLatency() {
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            return this.mSleepViewData.g().h();
        }
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            return this.mSleepViewData.h().h();
        }
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            return this.mSleepViewData.k().h();
        }
        return -1;
    }

    public fsr getSleepLatencyBean(int i, int i2) {
        if (i < 0) {
            LogUtil.j(getTag(), "not SupportSleepManagement or sleepLatency is error value, not show.");
            return new fsr();
        }
        ReleaseLogUtil.d(getTag(), "getSleepLatencyBean sleepLatency ", Integer.valueOf(i), " source ", this.mSleepViewData.n());
        String strA = qre.a(com.huawei.ui.main.R.string.IDS_sleep_referece_title_smaller_string, BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_min_unit, 30, UnitUtil.e(30.0d, 1, 0)));
        final int iO = wud.o(i);
        final int i3 = i / 60;
        final int i4 = i % 60;
        return new fsr(getItemTitle(i2, getFormatTime(i3, i4)), strA, uck.e(iO, "TYPE_SLEEP_LATENCY_TIME"), uck.e(iO), this.mArrowRes, new View.OnClickListener() { // from class: tyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49801c.m1717x44ba222c(i3, i4, iO, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getSleepLatencyBean$2$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1717x44ba222c(int i, int i2, int i3, View view) {
        if (qrs.r()) {
            return;
        }
        setNightSleepTimeClickEvent("TYPE_SLEEP_LATENCY_TIME", i, i2, i3);
    }

    public fsr getSleepEfficientBean(final Context context, final int i, int i2) {
        if (i <= 0) {
            LogUtil.a(getTag(), "no sleep efficiency data");
            return new fsr();
        }
        String itemTitle = getItemTitle(i2, uck.a(i, 0));
        String strB = uck.b(85, 100, 3);
        final int iN = wud.n(i);
        return new fsr(itemTitle, strB, uck.e(iN, "TYPE_SLEEP_EFFICIENCY"), uck.e(iN), this.mArrowRes, new View.OnClickListener() { // from class: tye
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49777c.m1716x26237190(context, i, iN, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getSleepEfficientBean$3$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1716x26237190(Context context, int i, int i2, View view) {
        if (qrs.r()) {
            return;
        }
        setSleepEfficientClickEvent(context, i, i2);
    }

    public int getSleepEfficientValue() {
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            return this.mSleepViewData.g().g();
        }
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            return this.mSleepViewData.h().g();
        }
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            return this.mSleepViewData.k().g();
        }
        return -1;
    }

    public fsr getBedTimeBean(int i, int i2) {
        if (i <= 0) {
            return new fsr();
        }
        final int i3 = i / 60;
        final int i4 = i % 60;
        String itemTitle = getItemTitle(i2, getFormatTime(i3, i4));
        String strE = qre.e(com.huawei.ui.main.R.plurals.IDS_hour_unit_no_space, 6, uck.b(UnitUtil.e(6.0d, 1, 0), UnitUtil.e(10.5d, 1, 1)));
        final int iE = wud.e(i);
        return new fsr(itemTitle, strE, uck.e(iE, "TYPE_SLEEP_BED_TIME"), uck.e(iE), this.mArrowRes, new View.OnClickListener() { // from class: tyb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49771b.m1708x83b9e0a3(i3, i4, iE, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getBedTimeBean$4$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1708x83b9e0a3(int i, int i2, int i3, View view) {
        if (qrs.r()) {
            return;
        }
        setBedTimeClickEvent(i, i2, i3);
    }

    public fsr getSleepTimeBean(String str, int i) {
        ReleaseLogUtil.d(getTag(), "getSleepTimeBean sleepTime ", Integer.valueOf(i));
        String strB = uck.b(6, 10, 2);
        final int iL = wud.l(i);
        final int i2 = i / 60;
        final int i3 = i % 60;
        return new fsr(str, strB, uck.e(iL, "TYPE_SLEEP_TIME"), uck.e(iL), this.mArrowRes, new View.OnClickListener() { // from class: tyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49786c.m1720x9b55a9fa(i2, i3, iL, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getSleepTimeBean$5$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1720x9b55a9fa(int i, int i2, int i3, View view) {
        if (qrs.r()) {
            return;
        }
        setAvgSleepTimeClickEvent(i, i2, i3);
    }

    public int getBedTime() {
        int iO;
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iO = this.mSleepViewData.g().o();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            iO = this.mSleepViewData.h().o();
        } else {
            iO = this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE ? this.mSleepViewData.k().o() : 0;
        }
        LogUtil.a(getTag(), "getBedTime deviceType ", this.mSleepViewData.n(), " sleepBedTime ", Integer.valueOf(iO));
        return iO;
    }

    public fsr getWakeTimesBean(final Context context, int i) {
        final int iBb;
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iBb = this.mSleepViewData.g().z();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            iBb = this.mSleepViewData.k().bb();
        } else {
            return new fsr();
        }
        LogUtil.a(getTag(), " wakeUpTimes:", Integer.valueOf(iBb));
        String itemTitle = getItemTitle(i, qre.e(com.huawei.ui.main.R.plurals.IDS_details_sleep_latency_times, iBb, UnitUtil.e(iBb, 1, 0)));
        String strB = uck.b(0, 1, 1);
        final int iS = wud.s(iBb);
        return new fsr(itemTitle, strB, uck.e(iS, "TYPE_WAKE_UP_TIMES"), uck.e(iS), this.mArrowRes, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                SleepBaseExpandListProvider.this.setWakeTimesClickEvent(context, iBb, iS);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWakeTimesClickEvent(Context context, int i, int i2) {
        LogUtil.a(getTag(), "setWakeTimesClickEvent");
        SleepScoreTimesActivity.b(context, "TYPE_WAKE_UP_TIMES", i, i2);
    }

    public fsr getPhoneNightSleepBean(int i, int i2) {
        final int i3 = i / 60;
        final int i4 = i % 60;
        BaseApplication.getContext();
        String itemTitle = getItemTitle(i2, getFormatTime(i3, i4));
        final int iH = wud.h(i);
        return new fsr(itemTitle, uck.b(6, 10, 2), uck.e(iH, "TYPE_NIGHT_SLEEP_TIME"), uck.e(iH), this.mArrowRes, new View.OnClickListener() { // from class: tyk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.m1714x3ccf0ee4(i3, i4, iH, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getPhoneNightSleepBean$6$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1714x3ccf0ee4(int i, int i2, int i3, View view) {
        setNightSleepTimeClickEvent("TYPE_NIGHT_SLEEP_TIME", i, i2, i3);
    }

    public fsr getCoreNightSleepBean(Context context, int i) {
        qre.f(com.huawei.ui.main.R.string.IDS_sleep_referece_title_string);
        int i2 = this.mSleepViewData.k().i();
        final int i3 = i2 / 60;
        final int i4 = i2 % 60;
        String itemTitle = getItemTitle(i, getFormatTime(i3, i4));
        String strB = uck.b(6, 10, 2);
        final int iH = wud.h(i2);
        return new fsr(itemTitle, strB, uck.e(iH, "TYPE_NIGHT_SLEEP_TIME"), uck.e(iH), this.mArrowRes, new View.OnClickListener() { // from class: tym
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49796c.m1710xf6b0828(i3, i4, iH, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getCoreNightSleepBean$7$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1710xf6b0828(int i, int i2, int i3, View view) {
        if (qrs.r()) {
            return;
        }
        setNightSleepTimeClickEvent("TYPE_NIGHT_SLEEP_TIME", i, i2, i3);
    }

    protected boolean isAASMVersion() {
        return this.mSleepViewData.k().ax() == 5;
    }

    public fsr getDeepSleepBean(final Context context, int i) {
        final int iW = this.mSleepViewData.k().w();
        String itemTitle = getItemTitle(i, uck.a(iW, 0));
        String strB = uck.b(isAASMVersion() ? 10 : 20, isAASMVersion() ? 30 : 60, 3);
        int iE = wud.e(iW, this.mSleepViewData.k().ax());
        return new fsr(itemTitle, strB, uck.e(iE, "TYPE_DEEP_SLEEP"), uck.e(iE), this.mArrowRes, new View.OnClickListener() { // from class: tyl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49793a.m1711xa21b5d44(context, iW, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getDeepSleepBean$8$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1711xa21b5d44(Context context, int i, View view) {
        if (qrs.r()) {
            return;
        }
        setDeepSleepClickEvent(context, i);
    }

    public fsr getSleepStableRateBean(final Context context, int i) {
        final int iAu = this.mSleepViewData.k().au();
        if (iAu == -2) {
            return new fsr();
        }
        String itemTitle = getItemTitle(i, uck.a(iAu, 0));
        String strA = qre.a(com.huawei.ui.main.R.string.IDS_sleep_referece_title_bigger_equal_string, uck.a(20, 0));
        int iM = wud.m(iAu);
        final String strE = uck.e(iM, "TYPE_STABLE_SLEEP");
        final int iE = uck.e(iM);
        return new fsr(itemTitle, strA, strE, iE, this.mArrowRes, new View.OnClickListener() { // from class: tyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.m1719x1ee4446c(context, iAu, strE, iE, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getSleepStableRateBean$9$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1719x1ee4446c(Context context, int i, String str, int i2, View view) {
        if (qrs.r()) {
            return;
        }
        handleSleepStablePage(context, i, str, i2);
    }

    private void setDeepSleepClickEvent(Context context, int i) {
        LogUtil.a(getTag(), "setDeepSleepClickEvent");
        int iAx = this.mSleepViewData.k().ax();
        SleepRateActivity.d(context, "TYPE_DEEP_SLEEP", i, wud.e(i, iAx), iAx);
    }

    public fsr getLightSleepBean(final Context context, int i) {
        final int iAv = this.mSleepViewData.k().av();
        final int iAx = this.mSleepViewData.k().ax();
        int i2 = iAx == 5 ? 65 : 55;
        String itemTitle = getItemTitle(i, uck.a(iAv, 0));
        String strA = qre.a(com.huawei.ui.main.R.string.IDS_sleep_referece_title_smaller_string, uck.a(i2, 0));
        int iD = wud.d(iAv, iAx);
        return new fsr(itemTitle, strA, uck.e(iD, "TYPE_LIGHT_SLEEP"), uck.e(iD), this.mArrowRes, new View.OnClickListener() { // from class: tyi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.m1713x6dd64847(context, iAv, iAx, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getLightSleepBean$10$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1713x6dd64847(Context context, int i, int i2, View view) {
        if (qrs.r()) {
            return;
        }
        setLightSleepClickEvent(context, i, i2);
    }

    private void setLightSleepClickEvent(Context context, int i, int i2) {
        LogUtil.a(getTag(), "setLightSleepClickEvent");
        SleepRateActivity.d(context, "TYPE_LIGHT_SLEEP", i, wud.d(i, this.mSleepViewData.k().ax()), i2);
    }

    public fsr getRemSleepBean(final Context context, int i) {
        final int iAo = this.mSleepViewData.k().ao();
        String itemTitle = getItemTitle(i, uck.a(iAo, 0));
        String strB = uck.b(10, 30, 3);
        int iJ = wud.j(iAo);
        return new fsr(itemTitle, strB, uck.e(iJ, "TYPE_SLUM_SLEEP_RATE"), uck.e(iJ), this.mArrowRes, new View.OnClickListener() { // from class: tyn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49798c.m1715x1df3ec4c(context, iAo, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getRemSleepBean$11$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1715x1df3ec4c(Context context, int i, View view) {
        if (qrs.r()) {
            return;
        }
        setRemSleepClickEvent(context, i);
    }

    private void setRemSleepClickEvent(Context context, int i) {
        LogUtil.a(getTag(), "setRemSleepClickEvent");
        SleepRateActivity.d(context, "TYPE_SLUM_SLEEP_RATE", i, wud.j(i), this.mSleepViewData.k().ax());
    }

    public fsr getDeepSleepContinuityBean(final Context context, int i) {
        String strE;
        final int iV = this.mSleepViewData.k().v();
        if (iV == -2) {
            return new fsr();
        }
        String strB = uck.b(70, 100, 0);
        final int i2 = wud.i(iV);
        if (i2 == -1) {
            strE = qre.f(com.huawei.ui.main.R.string.IDS_physiological_index_invalid);
        } else {
            strE = UnitUtil.e(iV, 1, 0);
        }
        String itemTitle = getItemTitle(i, qre.e(com.huawei.ui.main.R.plurals.IDS_sleep_referece_title_score_string, iV, strE));
        String strE2 = uck.e(i2, "TYPE_DEEP_SLEEP_CONTINUITY");
        int iE = uck.e(i2);
        if (iE == 0) {
            iE = qre.e(com.huawei.ui.main.R.color.health_secondary_color);
        }
        return new fsr(itemTitle, strB, strE2, iE, this.mArrowRes, new View.OnClickListener() { // from class: tyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49780c.m1712x7fc66ba1(context, iV, i2, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getDeepSleepContinuityBean$12$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1712x7fc66ba1(Context context, int i, int i2, View view) {
        if (qrs.r()) {
            return;
        }
        setDeepSleepContinuityClickEvent(context, i, i2);
    }

    private void setDeepSleepContinuityClickEvent(Context context, int i, int i2) {
        LogUtil.a(getTag(), "setDeepSleepContinuityClickEvent");
        SleepScoreTimesActivity.b(context, "TYPE_DEEP_SLEEP_CONTINUITY", i, i2);
    }

    public fsr getBreathQualityBean(final Context context, int i) {
        final int iX = this.mSleepViewData.k().x();
        if (iX == -1) {
            return new fsr();
        }
        String itemTitle = getItemTitle(i, qre.e(com.huawei.ui.main.R.plurals.IDS_sleep_referece_title_score_string, iX, UnitUtil.e(iX, 1, 0)));
        String strB = uck.b(70, 100, 0);
        int iD = wud.d(iX);
        return new fsr(itemTitle, strB, uck.e(iD, "TYPE_BREATH_QUALITY"), uck.e(iD), this.mArrowRes, new View.OnClickListener() { // from class: tyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49790b.m1709xdbff8c3e(context, iX, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getBreathQualityBean$13$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1709xdbff8c3e(Context context, int i, View view) {
        if (qrs.r()) {
            return;
        }
        setBreathQualityClickEvent(context, i);
    }

    private void setBreathQualityClickEvent(Context context, int i) {
        LogUtil.a(getTag(), "setBreathQualityClickEvent");
        SleepScoreTimesActivity.b(context, "TYPE_BREATH_QUALITY", i, wud.d(i));
    }

    public static class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f26767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int[] f26768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SleepBaseExpandListProvider> f26769c;
        private boolean d = false;
        private String e;
        private String f;
        private int i;
        private int j;

        public d(SleepBaseExpandListProvider sleepBaseExpandListProvider, String str) {
            this.f26769c = new WeakReference<>(sleepBaseExpandListProvider);
            this.e = str;
        }

        public d b(String str, int[] iArr, int i, String str2, int i2) {
            this.f26768b = iArr;
            this.i = i;
            this.f = str2;
            this.j = i2;
            this.f26767a = str;
            this.d = true;
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!this.d) {
                ReleaseLogUtil.d(this.e, "init status is false");
                return;
            }
            SleepBaseExpandListProvider sleepBaseExpandListProvider = this.f26769c.get();
            if (sleepBaseExpandListProvider == null) {
                ReleaseLogUtil.d(this.e, "provider is null");
            } else {
                sleepBaseExpandListProvider.goToTargetPage(this.f26767a, this.f26768b, this.i, this.f, this.j);
            }
        }
    }

    public void goToTargetPage(String str, int[] iArr, int i, CharSequence charSequence, int i2) {
        if (qrs.r()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(getTag(), "error pageCode: ", str);
            return;
        }
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        if (knitSleepDetailActivity == null) {
            ReleaseLogUtil.d(getTag(), "context is null");
        } else {
            handlePageCode(new c(str, iArr, i, charSequence, i2), knitSleepDetailActivity);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    private void handlePageCode(c cVar, Context context) {
        byte b2;
        String str = cVar.f26766c;
        str.hashCode();
        switch (str) {
            case "TRUSLEEP_FIVE_HRV":
                b2 = 0;
                break;
            case "TRUSLEEP_FIVE_HEART_RATE":
                b2 = 1;
                break;
            case "TRUSLEEP_FIVE_SpO2":
                b2 = 2;
                break;
            case "TRUSLEEP_FIVE_BREATH_RATE":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            handleHRVPage(cVar, context);
            return;
        }
        if (b2 == 1) {
            handleHeartRatePage(cVar, context);
            return;
        }
        if (b2 == 2) {
            handleSpO2Page(cVar, context);
        } else if (b2 == 3) {
            handleBreathRatePage(cVar, context);
        } else {
            ReleaseLogUtil.e(getTag(), "error type:", cVar.f26766c);
        }
    }

    private void handleSpO2Page(c cVar, Context context) {
        CharSequence[] charSequenceArr = new CharSequence[4];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        charSequenceArr[0] = qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_42);
        arrayList.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_44, UnitUtil.e(90.0d, 2, 0)));
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_46));
        arrayList3.add("\n");
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_47));
        handleTruSleepData(charSequenceArr, cVar);
        SleepInstructionPageActivity.e(context, charSequenceArr, new CharSequence[]{qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_43), qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_45)}, new CharSequence[][]{(CharSequence[]) arrayList.toArray(new CharSequence[0]), (CharSequence[]) arrayList3.toArray(new CharSequence[0]), (CharSequence[]) arrayList2.toArray(new CharSequence[0])});
    }

    private void handleHRVPage(c cVar, Context context) {
        CharSequence[] charSequenceArr = new CharSequence[4];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        charSequenceArr[0] = qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_35);
        arrayList.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_37_new, UnitUtil.e(19.0d, 1, 0), UnitUtil.e(75.0d, 1, 0)));
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_39));
        arrayList3.add("\n");
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_40));
        arrayList3.add("\n");
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_41));
        handleTruSleepData(charSequenceArr, cVar);
        SleepInstructionPageActivity.e(context, charSequenceArr, new CharSequence[]{qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_36), qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_38)}, new CharSequence[][]{(CharSequence[]) arrayList.toArray(new CharSequence[0]), (CharSequence[]) arrayList3.toArray(new CharSequence[0]), (CharSequence[]) arrayList2.toArray(new CharSequence[0])});
    }

    private void handleBreathRatePage(c cVar, Context context) {
        CharSequence[] charSequenceArr = new CharSequence[4];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        charSequenceArr[0] = qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_48);
        arrayList.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_50_new, UnitUtil.e(12.0d, 1, 0), UnitUtil.e(20.0d, 1, 0)));
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_52));
        arrayList3.add("\n");
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_53));
        arrayList3.add("\n");
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_54));
        handleTruSleepData(charSequenceArr, cVar);
        SleepInstructionPageActivity.e(context, charSequenceArr, new CharSequence[]{qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_49), qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_51)}, new CharSequence[][]{(CharSequence[]) arrayList.toArray(new CharSequence[0]), (CharSequence[]) arrayList3.toArray(new CharSequence[0]), (CharSequence[]) arrayList2.toArray(new CharSequence[0])});
    }

    protected CharSequence getDataPartIndexThree(CharSequence charSequence, int i) {
        SpannableString spannableString = new SpannableString(charSequence);
        if (!(charSequence instanceof String)) {
            ReleaseLogUtil.d(getTag(), "unknow class");
            return "";
        }
        if (!TextUtils.isEmpty(charSequence)) {
            spannableString.setSpan(new ForegroundColorSpan(i), 0, charSequence.length(), 33);
        }
        return spannableString;
    }

    private void handleSleepStablePage(Context context, int i, String str, int i2) {
        CharSequence[] charSequenceArr = new CharSequence[4];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        charSequenceArr[0] = qre.f(com.huawei.ui.main.R.string.IDS_hw_aasm_label_sleep_stable_rate);
        charSequenceArr[1] = qre.a(com.huawei.ui.main.R.string.IDS_sleep_referece_title_bigger_equal_string, UnitUtil.e(20.0d, 2, 0));
        double d2 = i;
        String strE = UnitUtil.e(d2, 2, 0);
        SpannableString spannableString = new SpannableString(strE);
        String strE2 = UnitUtil.e(d2, 1, 0);
        qri.c(spannableString, strE2, qre.b(com.huawei.ui.main.R.dimen.health_common_30sp));
        qri.b(spannableString, strE, com.huawei.ui.main.R.color.ski_other);
        qri.b(spannableString, strE2, com.huawei.ui.main.R.color.textColorPrimary);
        if (Build.VERSION.SDK_INT >= 28) {
            f$$ExternalSyntheticApiModelOutline0.m1373m$1();
            qri.a(spannableString, strE2, f$$ExternalSyntheticApiModelOutline0.m(Typeface.create(null, 700, false)));
        }
        CharSequence dataPartIndexThree = getDataPartIndexThree(str, i2);
        charSequenceArr[2] = spannableString;
        charSequenceArr[3] = dataPartIndexThree;
        arrayList.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_one));
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_two_1));
        arrayList3.add("\n");
        arrayList3.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_two_2, UnitUtil.e(1.0d, 1, 0)));
        arrayList3.add("\n");
        arrayList3.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_two_3, UnitUtil.e(2.0d, 1, 0)));
        arrayList3.add("\n");
        arrayList3.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_two_4, UnitUtil.e(3.0d, 1, 0)));
        arrayList3.add("\n");
        arrayList3.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_two_5, UnitUtil.e(4.0d, 1, 0)));
        arrayList3.add("\n");
        arrayList3.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_two_6, UnitUtil.e(5.0d, 1, 0)));
        arrayList3.add("\n");
        arrayList3.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_two_7, UnitUtil.e(6.0d, 1, 0)));
        arrayList3.add("\n");
        arrayList3.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_content_two_8, UnitUtil.e(7.0d, 1, 0)));
        SleepInstructionPageActivity.e(context, charSequenceArr, new CharSequence[]{qre.f(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_title_one), qre.f(com.huawei.ui.main.R.string.IDS_hw_sleep_stable_title_two)}, new CharSequence[][]{(CharSequence[]) arrayList.toArray(new CharSequence[0]), (CharSequence[]) arrayList3.toArray(new CharSequence[0]), (CharSequence[]) arrayList2.toArray(new CharSequence[0])});
    }

    private void handleHeartRatePage(c cVar, Context context) {
        CharSequence[] charSequenceArr = new CharSequence[4];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        charSequenceArr[0] = qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_28);
        arrayList.add(qre.a(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_30, UnitUtil.e(90.0d, 1, 0)));
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_32));
        arrayList3.add("\n");
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_33));
        arrayList3.add("\n");
        arrayList3.add(qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_34));
        handleTruSleepData(charSequenceArr, cVar);
        SleepInstructionPageActivity.e(context, charSequenceArr, new CharSequence[]{qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_29), qre.f(com.huawei.ui.main.R.string.IDS_hw_health_sleep_dataitem_doc_31)}, new CharSequence[][]{(CharSequence[]) arrayList.toArray(new CharSequence[0]), (CharSequence[]) arrayList3.toArray(new CharSequence[0]), (CharSequence[]) arrayList2.toArray(new CharSequence[0])});
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26766c;
        public final int[] d;
        public final CharSequence e;

        public c(String str, int[] iArr, int i, CharSequence charSequence, int i2) {
            this.f26766c = str;
            this.d = iArr;
            this.f26764a = i;
            this.e = charSequence;
            this.f26765b = i2;
        }
    }

    public fso getSleepPhysiologicalItem(final Context context, String str) {
        String strF;
        String subSleepPhyStr;
        final String str2;
        if ("SLEEP_HEART_RATE".equals(str)) {
            strF = qre.f(com.huawei.ui.main.R.string.IDS_fitness_core_sleep_heartrate);
            subSleepPhyStr = getSubSleepPhyStr(com.huawei.ui.main.R.plurals.IDS_health_zone_heart_rate_unit, this.mSleepViewData.k().aj(), this.mSleepViewData.k().ae(), true);
            str2 = "TYPE_SLEEP_HEART_RATE";
        } else if ("SLEEP_BLOOD_OX".equals(str)) {
            strF = qre.f(com.huawei.ui.main.R.string.IDS_fitness_core_sleep_oxygen_saturation);
            subSleepPhyStr = getSubSleepPhyStr(-1, this.mSleepViewData.k().ak().doubleValue(), this.mSleepViewData.k().af().doubleValue(), false);
            str2 = "TYPE_SLEEP_BLOOD_OX";
        } else if ("SLEEP_BREATH_RATIO".equals(str)) {
            strF = qre.f(com.huawei.ui.main.R.string.IDS_fitness_core_sleep_breathrate);
            subSleepPhyStr = getSubSleepPhyStr(com.huawei.ui.main.R.plurals.IDS_health_zone_breath_rate_unit, this.mSleepViewData.k().ag().doubleValue(), this.mSleepViewData.k().ab(), true);
            str2 = "TYPE_SLEEP_BREATH_RATE";
        } else {
            return new fso();
        }
        if (TextUtils.isEmpty(subSleepPhyStr)) {
            return new fso();
        }
        return new fso(strF, subSleepPhyStr, this.mArrowRes, new View.OnClickListener() { // from class: tyd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49773a.m1718x9bda68f(context, str2, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getSleepPhysiologicalItem$14$com-huawei-ui-main-stories-fitness-activity-coresleep-SleepBaseExpandListProvider, reason: not valid java name */
    public /* synthetic */ void m1718x9bda68f(Context context, String str, View view) {
        SleepDurationActivity.e(context, str, 0, 0, 0, this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE);
    }

    private String getSubSleepPhyStr(int i, double d2, double d3, boolean z) {
        if (this.mSleepViewData.k().g() < 0) {
            return null;
        }
        if (d2 <= -1.0d || d3 <= -1.0d || d2 > d3) {
            return "--";
        }
        if (d2 <= 0.0d || d3 <= 0.0d || d2 > d3) {
            return null;
        }
        if (z) {
            return qre.e(i, UnitUtil.e(d2), Integer.valueOf(UnitUtil.e(d2, 1, 0)), Integer.valueOf(UnitUtil.e(d3, 1, 0)));
        }
        return qre.a(com.huawei.ui.main.R.string.IDS_hw_health_coresleep_standard_range_1, UnitUtil.e(d2, 1, 0), uck.a(d3, 0));
    }

    public SpannableString makeSubTitleSpannable(String str, String str2, String str3, int[] iArr) {
        if (!TextUtils.isEmpty(str)) {
            str2 = qre.a(com.huawei.ui.main.R.string.IDS_bese_line_description, str);
        }
        SpannableString spannableString = new SpannableString(str2);
        Integer[] numArr = uyr.f.get(str3);
        if (this.mSleepViewData.k().b(str3) && (iArr[0] < numArr[0].intValue() || iArr[1] > numArr[1].intValue())) {
            qri.b(spannableString, str, com.huawei.ui.main.R.color.dynamic_blood_pressure_high);
        }
        return spannableString;
    }

    public int getDaySleepStatus(int i) {
        int i2 = i > 40 ? 71 : 73;
        LogUtil.a(getTag(), "getDaySleepStatus:", Integer.valueOf(i2));
        return i2;
    }

    public gxp getSleepStatData() {
        if (!(this.mSleepViewData.k() instanceof gxp)) {
            ReleaseLogUtil.e(getTag(), "scienceSleepData is not ScienceSleepStatData");
            return new gxp();
        }
        return (gxp) this.mSleepViewData.k();
    }
}
