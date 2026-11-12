package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.util.SparseArray;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.utils.HarmonyOsTypefaceSpan;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import defpackage.coq;
import defpackage.ftg;
import defpackage.fth;
import defpackage.gwc;
import defpackage.gxd;
import defpackage.gxq;
import defpackage.lsl;
import defpackage.pjo;
import defpackage.qnh;
import defpackage.qqw;
import defpackage.ubq;
import defpackage.ucv;
import defpackage.ucx;
import defpackage.uik;
import defpackage.wum;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SleepScoringProvider extends MinorProvider<gxq> {
    private String g;
    private String k;
    private uik l;
    private String o;
    private gxq p;
    private SectionBean r;
    private String t;
    private String u;
    private String w;
    private Typeface y;
    private static final int[] e = {44102, 44103, 44105, 44106, 44201, 44202, 44107, 44109, 44218, 44217, 44104, 44110, 44235, 44112, 44113};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f26846a = {DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_FALL_ASLEEP_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value()};
    private static final String[] d = {"data_session_manual_sleep_go_to_bed_time_key", "data_session_manual_sleep_sleep_time_key", "data_session_manual_sleep_get_up_time_key"};
    private static final int[] h = {DicDataTypeUtil.DataType.BED_TIME.value()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f26847b = {"bedTime"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f26848c = {"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_total_sleep_time_key", "core_sleep_deep_sleep_part_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_wake_count_key", "data_session_manual_sleep_bed_time_key", "core_sleep_latency_key", "core_sleep_bed_time_key", "core_sleep_wake_key", "sleep_device_category_key", "sleep_version", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"};
    private boolean m = true;
    private boolean f = false;
    private boolean s = false;
    private String v = null;
    private String j = null;
    private String i = null;
    private int n = -1;
    private int x = -1;
    private int q = -1;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        a(context, (HashMap<String, Object>) map, (gxq) obj);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.m;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("SleepScoringProvider", "loadData");
        this.r = sectionBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        this.j = null;
        this.i = null;
        this.f = false;
        this.s = false;
        LogUtil.a("SleepScoringProvider", "onSetSectionBeanData, data: " + gxqVar.toString());
        if (sectionBean != null) {
            this.r = sectionBean;
        }
        boolean z = gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY && (gwc.e(gxqVar) || gwc.c(gxqVar));
        boolean z2 = gxqVar.d() != SleepViewConstants.ViewTypeEnum.DAY && (gwc.e(gxqVar) || gwc.c(gxqVar));
        boolean zJ = j(gxqVar);
        LogUtil.a("SleepScoringProvider", "isDayNoonSleep: ", Boolean.valueOf(z), ", isWeekMonthNoonSleep: ", Boolean.valueOf(z2), ", isValidScoringData: ", Boolean.valueOf(zJ));
        if (z || z2 || !zJ) {
            LogUtil.a("SleepScoringProvider", "data is invalid");
            this.m = false;
            this.r.d(this, gxqVar);
            return;
        }
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL && (gxqVar.h().q() || gxqVar.h().t())) {
            LogUtil.a("SleepScoringProvider", "isManualOnlyBedTime");
            this.m = false;
            this.r.d(this, gxqVar);
            return;
        }
        this.m = true;
        this.p = gxqVar;
        this.l = (uik) gxqVar.m().get("FITNESSCORE_SLEEP_DETAIL_INTERACTOR");
        Map<String, Object> mapM = gxqVar.m();
        Object obj = mapM.get("IS_PHONE_AND_CORE_NOON");
        LogUtil.a("SleepScoringProvider", "isPhoneAndCoreNoon: ", Boolean.valueOf(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false));
        if (mapM.containsKey("MGMT_DAILY_SLEEP_PROCESS") && (mapM.get("MGMT_DAILY_SLEEP_PROCESS") instanceof gxd)) {
            a(gxqVar, mapM, lsl.r(gxqVar.f()));
        } else {
            e(gxqVar, mapM);
        }
    }

    private boolean j(gxq gxqVar) {
        return (gxqVar.k().aq() > 0 || gxqVar.k().i() > 0) || (gxqVar.h().o() > 0 || gxqVar.h().s() != -1) || (gxqVar.g().i() > 0 || gxqVar.g().ac() != -1) || (gxqVar.b().i() > 0);
    }

    private void a(gxq gxqVar, Map map, long j) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j - 518400000);
        hiAggregateOption.setEndTime(86399999 + j);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(f26848c);
        hiAggregateOption.setType(e);
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new e(this, j, gxqVar, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<gxq> a(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3, long j) {
        return gwc.d(3, lsl.c(j, -6), new int[]{7, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL}, gwc.b(list, list2, list3));
    }

    public static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SleepScoringProvider> f26855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f26856b;
        private long d;
        private gxq e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        public e(SleepScoringProvider sleepScoringProvider, long j, gxq gxqVar, Map map) {
            this.f26855a = new WeakReference<>(sleepScoringProvider);
            this.d = j;
            this.e = gxqVar;
            this.f26856b = map;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(final List<HiHealthData> list, int i, int i2) {
            LogUtil.a("SleepScoringProvider", "ChartSumSleepResponseCallback response!");
            final SleepScoringProvider sleepScoringProvider = this.f26855a.get();
            if (sleepScoringProvider == null) {
                return;
            }
            if (coq.d(list)) {
                LogUtil.a("SleepScoringProvider", "ChartSumSleepResponseCallback sumList is empty!");
                sleepScoringProvider.e(this.e, this.f26856b);
                return;
            }
            LogUtil.a("SleepScoringProvider", "ChartSumSleepResponseCallback sumList is", list.toString());
            int iJ = ((gxd) this.f26856b.get("MGMT_DAILY_SLEEP_PROCESS")).j();
            final ftg ftgVar = new ftg();
            boolean z = iJ == 4 || iJ == 3 || iJ == 1 || iJ == 13 || iJ == 12 || iJ == 14;
            if (d(list) && z) {
                LogUtil.a("SleepScoringProvider", "have new and old sleep, change daily problem");
                iJ = 0;
            }
            switch (iJ) {
                case 0:
                case 5:
                case 8:
                case 15:
                    j(ftgVar, list, this.d);
                    ftgVar.d(6);
                    break;
                case 1:
                case 3:
                case 12:
                case 13:
                    c(ftgVar, list, this.d);
                    ftgVar.d(1);
                    break;
                case 2:
                    g(ftgVar, list, this.d);
                    ftgVar.d(5);
                    break;
                case 4:
                case 14:
                    b(ftgVar, list, this.d);
                    ftgVar.d(2);
                    break;
                case 6:
                    d(ftgVar, list, this.d);
                    ftgVar.d(3);
                    break;
                case 7:
                    e(ftgVar, list, this.d);
                    ftgVar.d(7);
                    break;
                case 9:
                    a(ftgVar, list, this.d);
                    ftgVar.d(4);
                    break;
                case 10:
                    a(ftgVar, list, this.d, sleepScoringProvider);
                    ftgVar.d(8);
                    break;
                case 11:
                    ftgVar.d(9);
                    ThreadPoolManager.getInstance().execute(new Runnable() { // from class: ubf
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.e.a(ftgVar, list, sleepScoringProvider);
                        }
                    });
                    return;
            }
            this.e.m().put("SMART_SLEEP_CHART_DATA", ftgVar);
            this.e.m().put("CORE_SLEEP_VERSION", Integer.valueOf(this.e.k().ax()));
            sleepScoringProvider.e(this.e, this.f26856b);
        }

        public /* synthetic */ void a(ftg ftgVar, List list, SleepScoringProvider sleepScoringProvider) {
            e(ftgVar, list, this.d, sleepScoringProvider);
        }

        private void e(ftg ftgVar, List<HiHealthData> list, long j, SleepScoringProvider sleepScoringProvider) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            int iA = DateFormatUtil.a(lsl.d(j, -6));
            hiAggregateOption.setTimeInterval(String.valueOf(iA), String.valueOf(DateFormatUtil.a(lsl.d(j, 2))), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
            hiAggregateOption.setType(SleepScoringProvider.f26846a);
            hiAggregateOption.setConstantsKey(SleepScoringProvider.d);
            hiAggregateOption.setAggregateType(1);
            hiAggregateOption.setGroupUnitType(0);
            HiDataFilter.DataFilterExpression dataFilterExpression = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_go_to_bed_time_key", HiDataFilter.DataFilterExpression.BIGGER_EQUAL, lsl.a(lsl.d(j, -7), 20, 0));
            HiDataFilter.DataFilterExpression dataFilterExpression2 = new HiDataFilter.DataFilterExpression("data_session_manual_sleep_go_to_bed_time_key", HiDataFilter.DataFilterExpression.LESS_EQUAL, lsl.a(j, 20, 0) - 1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(dataFilterExpression);
            arrayList.add(dataFilterExpression2);
            HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).b(HiJsonUtil.d(new HiDataFilter(arrayList, Collections.singletonList(0)))).e((String) null).e();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(hiDataAggregateProOptionE);
            arrayList2.add(c(iA, DateFormatUtil.a(j)));
            this.f26856b.put("SUM_LIST", list);
            HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthDataProEx(arrayList2, new a(sleepScoringProvider, ftgVar, j, this.e, this.f26856b));
        }

        private HiDataAggregateProOption c(int i, int i2) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
            hiAggregateOption.setType(SleepScoringProvider.h);
            hiAggregateOption.setConstantsKey(SleepScoringProvider.f26847b);
            hiAggregateOption.setAggregateType(1);
            hiAggregateOption.setGroupUnitType(0);
            return new HiDataAggregateProOption.Builder().c(hiAggregateOption).e((String) null).e();
        }

        private void a(ftg ftgVar, List<HiHealthData> list, long j, SleepScoringProvider sleepScoringProvider) {
            int iG;
            long j2;
            fth[] fthVarArr = new fth[7];
            for (gxq gxqVar : sleepScoringProvider.a(list, new ArrayList(), new ArrayList(), j)) {
                int i = AnonymousClass2.e[gxqVar.n().ordinal()];
                if (i == 1) {
                    iG = gxqVar.g().g();
                    j2 = gxqVar.g().j();
                } else if (i == 2) {
                    iG = gxqVar.h().g();
                    j2 = gxqVar.h().j();
                } else {
                    LogUtil.j("SleepScoringProvider", "no sleep efficiency");
                    j2 = 0;
                    iG = -1;
                }
                if (iG == -1) {
                    LogUtil.j("SleepScoringProvider", "no sleep efficiency");
                } else {
                    int iA = lsl.a(j2, j);
                    LogUtil.a("SleepScoringProvider", " sleep efficiency is ", Integer.valueOf(iG));
                    fthVarArr[7 - iA] = new fth(j2, iG);
                }
            }
            ftgVar.b(fthVarArr);
        }

        private void e(ftg ftgVar, List<HiHealthData> list, long j) {
            fth[] fthVarArr = new fth[7];
            for (int i = 0; i < 7; i++) {
                long jC = lsl.c(j, i - 6);
                for (HiHealthData hiHealthData : list) {
                    if (lsl.c(hiHealthData.getStartTime(), jC)) {
                        fthVarArr[i] = new fth(jC, hiHealthData.getInt("core_sleep_deep_sleep_part_key"));
                        break;
                    }
                }
            }
            ftgVar.b(fthVarArr);
        }

        private void j(ftg ftgVar, List<HiHealthData> list, long j) {
            fth[] fthVarArr = new fth[7];
            for (int i = 0; i < 7; i++) {
                long jC = lsl.c(j, i - 6);
                for (HiHealthData hiHealthData : list) {
                    if (lsl.c(hiHealthData.getStartTime(), jC)) {
                        fthVarArr[i] = new fth(jC, hiHealthData.getInt("core_sleep_total_sleep_time_key"));
                        break;
                    }
                }
            }
            ftgVar.b(fthVarArr);
        }

        private void g(ftg ftgVar, List<HiHealthData> list, long j) {
            fth[] fthVarArr = new fth[7];
            for (int i = 0; i < 7; i++) {
                long jC = lsl.c(j, i - 6);
                for (HiHealthData hiHealthData : list) {
                    if (lsl.c(hiHealthData.getStartTime(), jC)) {
                        fthVarArr[i] = new fth(jC, hiHealthData.getInt("core_sleep_wake_count_key"));
                        break;
                    }
                }
            }
            ftgVar.b(fthVarArr);
        }

        private boolean d(List<HiHealthData> list) {
            boolean z = false;
            boolean z2 = false;
            for (HiHealthData hiHealthData : list) {
                if (!gwc.i(hiHealthData.getInt("sleep_device_category_key"))) {
                    LogUtil.j("SleepScoringProvider", "not core science sleep");
                } else if (hiHealthData.getInt("sleep_version") == 5) {
                    z = true;
                } else {
                    z2 = true;
                }
            }
            return z && z2;
        }

        private void a(ftg ftgVar, List<HiHealthData> list, long j) {
            fth[] fthVarArr = new fth[7];
            for (int i = 0; i < 7; i++) {
                long jC = lsl.c(j, i - 6);
                for (HiHealthData hiHealthData : list) {
                    if (lsl.c(hiHealthData.getStartTime(), jC)) {
                        long j2 = hiHealthData.getLong("core_sleep_wake_up_key");
                        if (j2 == 0) {
                            break;
                        }
                        fthVarArr[i] = new fth(jC, j2);
                        break;
                    }
                }
            }
            ftgVar.b(fthVarArr);
        }

        private void d(ftg ftgVar, List<HiHealthData> list, long j) {
            fth[] fthVarArr = new fth[7];
            for (int i = 0; i < 7; i++) {
                long jC = lsl.c(j, i - 6);
                for (HiHealthData hiHealthData : list) {
                    if (lsl.c(hiHealthData.getStartTime(), jC)) {
                        long j2 = hiHealthData.getLong("core_sleep_fall_key");
                        if (j2 == 0) {
                            break;
                        }
                        fthVarArr[i] = new fth(jC, j2);
                        break;
                    }
                }
            }
            ftgVar.b(fthVarArr);
        }

        private void b(ftg ftgVar, List<HiHealthData> list, long j) {
            fth[] fthVarArr = new fth[7];
            for (int i = 0; i < 7; i++) {
                long jC = lsl.c(j, i - 6);
                for (HiHealthData hiHealthData : list) {
                    if (lsl.c(hiHealthData.getStartTime(), jC)) {
                        fthVarArr[i] = new fth(jC, c(hiHealthData));
                        break;
                    }
                }
            }
            ftgVar.b(fthVarArr);
        }

        private void c(ftg ftgVar, List<HiHealthData> list, long j) {
            fth[] fthVarArr = new fth[7];
            for (int i = 0; i < 7; i++) {
                long jC = lsl.c(j, i - 6);
                for (HiHealthData hiHealthData : list) {
                    if (lsl.c(hiHealthData.getStartTime(), jC)) {
                        fthVarArr[i] = new fth(jC, a(hiHealthData));
                        break;
                    }
                }
            }
            ftgVar.b(fthVarArr);
        }

        private int c(HiHealthData hiHealthData) {
            boolean z = hiHealthData.getInt("sleep_version") == 5;
            int i = hiHealthData.getInt("core_sleep_deep_key");
            int i2 = hiHealthData.getInt("core_sleep_shallow_key");
            int i3 = hiHealthData.getInt("core_sleep_total_sleep_time_key");
            if (z) {
                i = hiHealthData.getInt("core_sleep_deep_key_aasm");
                i2 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
            }
            if (i3 == 0) {
                return -1;
            }
            float f = i3;
            int iRound = Math.round((i / f) * 100.0f);
            return Math.round((((float) i2) / f) * 100.0f) + iRound > 100 ? iRound - 1 : iRound;
        }

        private int a(HiHealthData hiHealthData) {
            boolean z = hiHealthData.getInt("sleep_version") == 5;
            int i = hiHealthData.getInt("core_sleep_deep_key");
            int i2 = hiHealthData.getInt("core_sleep_shallow_key");
            int i3 = hiHealthData.getInt("core_sleep_total_sleep_time_key");
            if (z) {
                i = hiHealthData.getInt("core_sleep_deep_key_aasm");
                i2 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
            }
            SleepViewConstants.SleepTypeEnum sleepTypeEnumE = gwc.e(hiHealthData, new ArrayList());
            if (i3 == 0 || sleepTypeEnumE != SleepViewConstants.SleepTypeEnum.SCIENCE) {
                return -1;
            }
            float f = i3;
            int iRound = (100 - Math.round((i2 / f) * 100.0f)) - Math.round((i / f) * 100.0f);
            if (iRound <= 0) {
                return 0;
            }
            return iRound;
        }
    }

    static class a implements HiAggregateListenerEx {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f26850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f26851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private gxq f26852c;
        private WeakReference<SleepScoringProvider> d;
        private ftg e;

        public a(SleepScoringProvider sleepScoringProvider, ftg ftgVar, long j, gxq gxqVar, Map map) {
            this.d = new WeakReference<>(sleepScoringProvider);
            this.e = ftgVar;
            this.f26850a = j;
            this.f26852c = gxqVar;
            this.f26851b = map;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            SleepScoringProvider sleepScoringProvider = this.d.get();
            if (sleepScoringProvider == null) {
                LogUtil.e("SleepScoringProvider", "SleepLatencyCallBack provider is null.");
                return;
            }
            LogUtil.a("SleepScoringProvider", "requestSleepLatency back datas is null", Boolean.valueOf(sparseArray == null));
            d(this.e, qqw.a(this.f26851b, "SUM_LIST", HiHealthData.class, (List) new ArrayList()), sparseArray, this.f26850a);
            this.f26852c.m().put("SMART_SLEEP_CHART_DATA", this.e);
            sleepScoringProvider.e(this.f26852c, this.f26851b);
        }

        private void d(ftg ftgVar, List<HiHealthData> list, SparseArray<List<HiHealthData>> sparseArray, long j) {
            int iH;
            long j2;
            fth[] fthVarArr = new fth[7];
            if (coq.d(list)) {
                LogUtil.e("SleepScoringProvider", "sumList is null");
                ftgVar.b(fthVarArr);
                return;
            }
            SleepScoringProvider sleepScoringProvider = this.d.get();
            if (sleepScoringProvider == null) {
                LogUtil.e("SleepScoringProvider", "SleepLatencyCallBack provider is null.");
                return;
            }
            for (gxq gxqVar : sleepScoringProvider.a(list, (sparseArray == null || sparseArray.get(0) == null) ? new ArrayList<>() : sparseArray.get(0), (sparseArray == null || sparseArray.get(1) == null) ? new ArrayList<>() : sparseArray.get(1), j)) {
                int i = AnonymousClass2.e[gxqVar.n().ordinal()];
                if (i == 1) {
                    iH = gxqVar.g().h();
                    j2 = gxqVar.g().j();
                } else if (i == 2) {
                    iH = gxqVar.h().h();
                    j2 = gxqVar.h().j();
                } else {
                    LogUtil.j("SleepScoringProvider", "no sleep efficiency");
                    j2 = 0;
                    iH = -1;
                }
                if (iH == -1) {
                    LogUtil.j("SleepScoringProvider", "no sleep efficiency");
                } else {
                    int iA = lsl.a(j2, j);
                    LogUtil.a("SleepScoringProvider", " latency is ", Integer.valueOf(iH));
                    fthVarArr[7 - iA] = new fth(j2, iH);
                }
            }
            ftgVar.b(fthVarArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(gxq gxqVar, Map map) {
        if (d(map)) {
            LogUtil.a("SleepScoringProvider", "isInCompleteData");
            this.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_incomplete_sleep_data);
            this.t = "";
            this.r.d(this, this.p);
            return;
        }
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
                LogUtil.a("SleepScoringProvider", "day manual sleep");
                e(gxqVar);
                return;
            }
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
                LogUtil.a("SleepScoringProvider", "day phone sleep");
                b(gxqVar);
                return;
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                LogUtil.a("SleepScoringProvider", "day core sleep");
                g(gxqVar);
                return;
            } else {
                if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
                    LogUtil.a("SleepScoringProvider", "is Common sleep");
                    this.f = true;
                    this.r.d(this, this.p);
                    return;
                }
                return;
            }
        }
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK) {
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                LogUtil.a("SleepScoringProvider", "week isHasWearCoreData sleep");
                g(gxqVar);
                return;
            }
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
                LogUtil.a("SleepScoringProvider", "week isHasPhoneData sleep");
                h(gxqVar);
                return;
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
                LogUtil.a("SleepScoringProvider", "week isHasPhoneData sleep");
                i(gxqVar);
                return;
            } else {
                if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
                    LogUtil.a("SleepScoringProvider", "is Common sleep");
                    this.f = true;
                    this.r.d(this, this.p);
                    return;
                }
                return;
            }
        }
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH) {
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                LogUtil.a("SleepScoringProvider", "month isHasWearCoreData sleep");
                g(gxqVar);
                return;
            }
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
                LogUtil.a("SleepScoringProvider", "month isHasPhoneData sleep");
                a(gxqVar);
                return;
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
                LogUtil.a("SleepScoringProvider", "month isHasPhoneData sleep");
                c(gxqVar);
                return;
            } else {
                if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
                    LogUtil.a("SleepScoringProvider", "is Common sleep");
                    this.f = true;
                    this.r.d(this, this.p);
                    return;
                }
                return;
            }
        }
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.YEAR) {
            LogUtil.a("SleepScoringProvider", "year view, Common sleep");
            this.f = true;
            this.r.d(this, this.p);
        }
    }

    private void e(gxq gxqVar) {
        String strC;
        String strB;
        int i = gxqVar.h().i();
        LogUtil.a("SleepScoringProvider", "mNightTotalSleepTime: ", Integer.valueOf(i));
        boolean z = i > 600;
        int iA = ucv.a(gxqVar);
        this.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_two_parts, ucv.e(gxqVar.h().r()), ucv.b(gxqVar, iA, z, i));
        if (this.n == iA) {
            strC = this.o;
            strB = this.g;
        } else {
            strC = ucv.c(iA);
            strB = ucv.b(iA);
            this.n = iA;
            this.o = strC;
            this.g = strB;
        }
        this.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_two_parts, strC, strB);
        this.f = false;
        this.r.d(this, this.p);
    }

    private boolean d(Map map) {
        Object obj = map.get("IS_INCOMPLETE_DATA");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    private void b(gxq gxqVar) {
        ucv.e(new Date(gxqVar.f()), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(gxq gxqVar) {
        ucv.c(new Date(gxqVar.f()), new IBaseResponseCallback() { // from class: ubc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.e(i, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, Object obj) {
        LogUtil.a("SleepScoringProvider", "getSleepEndReason errorCode: ", Integer.valueOf(i), ", data: ", obj);
        if (i == 0) {
            Map map = (Map) obj;
            if (map.containsKey("detect_abnormal")) {
                this.j = (String) map.get("detect_abnormal");
            }
            if (map.containsKey("detect_abnormal_jump")) {
                this.i = (String) map.get("detect_abnormal_jump");
            }
        }
        this.f = false;
        this.r.d(this, this.p);
    }

    private void h(final gxq gxqVar) {
        Date date = new Date(gxqVar.f());
        ucv.a(date, new Date((qnh.b() + date.getTime()) - 1), new IBaseResponseCallback() { // from class: uaz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49878c.c(gxqVar, i, obj);
            }
        });
        ucv.e(d(new Date(gxqVar.f())), c(new Date(gxqVar.f())), new IBaseResponseCallback() { // from class: ubd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.a(gxqVar, i, obj);
            }
        });
    }

    public /* synthetic */ void c(gxq gxqVar, int i, Object obj) {
        LogUtil.a("SleepScoringProvider", "getWeekSleepSuggestion errorCode: ", Integer.valueOf(i), ", data: ", obj);
        if (i == 0) {
            Integer num = (Integer) obj;
            this.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_three_parts, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_week_average_sleep_duration, ucv.d(gxqVar.g().i()), ucv.a(gxqVar.g().i())), ucv.d(gxqVar.g().x(), num.intValue(), true), ucv.b(num.intValue()));
            this.r.d(this, gxqVar);
            return;
        }
        this.m = false;
        this.r.d(this, gxqVar);
    }

    public /* synthetic */ void a(gxq gxqVar, int i, Object obj) {
        String str;
        LogUtil.a("SleepScoringProvider", "getDailySleepRegularity for week errorCode: ", Integer.valueOf(i), ", data: ", obj);
        if (i != 0) {
            str = "";
        } else {
            str = (String) obj;
        }
        this.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_two_parts, str, gxqVar.m().get("DATA_DIFFERENCE"));
        this.r.d(this, gxqVar);
    }

    private void i(gxq gxqVar) {
        String str;
        int iA = ucv.a(gxqVar);
        String string = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_week_average_sleep_duration, ucv.d(gxqVar.h().i()), ucv.a(gxqVar.h().i()));
        String strD = ucv.d(gxqVar.h().r(), iA, true);
        if (this.x == iA) {
            str = this.w;
        } else {
            String strB = ucv.b(iA);
            this.x = iA;
            this.w = strB;
            str = strB;
        }
        this.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_three_parts, string, strD, str);
        this.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_two_parts, ucv.e(gxqVar), gxqVar.m().get("DATA_DIFFERENCE"));
        this.r.d(this, gxqVar);
    }

    private void a(final gxq gxqVar) {
        ucv.a(new Date(lsl.p(gxqVar.f())), new Date(lsl.b(gxqVar.f())), new IBaseResponseCallback() { // from class: ubb
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49879b.e(gxqVar, i, obj);
            }
        });
        ucv.e(new Date(lsl.p(gxqVar.f())), new Date(lsl.b(gxqVar.f())), new IBaseResponseCallback() { // from class: ubh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.b(gxqVar, i, obj);
            }
        });
    }

    public /* synthetic */ void e(gxq gxqVar, int i, Object obj) {
        LogUtil.a("SleepScoringProvider", "getMonthSleepSuggestion errorCode: ", Integer.valueOf(i), ", data: ", obj);
        if (i == 0) {
            Integer num = (Integer) obj;
            this.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_three_parts, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_month_average_sleep_duration, ucv.d(gxqVar.g().i()), ucv.a(gxqVar.g().i())), ucv.d(gxqVar.g().x(), num.intValue(), false), ucv.b(num.intValue()));
            this.r.d(this, gxqVar);
            return;
        }
        this.m = false;
        this.r.d(this, gxqVar);
    }

    public /* synthetic */ void b(gxq gxqVar, int i, Object obj) {
        String str;
        LogUtil.a("SleepScoringProvider", "getDailySleepRegularity for month errorCode: ", Integer.valueOf(i), ", data: ", obj);
        if (i != 0) {
            str = "";
        } else {
            str = (String) obj;
        }
        this.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_two_parts, str, gxqVar.m().get("DATA_DIFFERENCE"));
        this.r.d(this, gxqVar);
    }

    private void c(gxq gxqVar) {
        String str;
        int iA = ucv.a(gxqVar);
        String string = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_month_average_sleep_duration, ucv.d(gxqVar.h().i()), ucv.a(gxqVar.h().i()));
        String strD = ucv.d(gxqVar.h().r(), iA, false);
        if (this.q == iA) {
            str = this.k;
        } else {
            String strB = ucv.b(iA);
            this.q = iA;
            this.k = strB;
            str = strB;
        }
        this.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_three_parts, string, strD, str);
        this.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_two_parts, ucv.e(gxqVar), gxqVar.m().get("DATA_DIFFERENCE"));
        this.r.d(this, gxqVar);
    }

    public void a(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepScoringProvider", "parseParams");
        map.clear();
        map.put("SHOW_VALUE", gxqVar.m().get("SMART_SLEEP_CHART_DATA"));
        map.put("CORE_SLEEP_VERSION", gxqVar.m().get("CORE_SLEEP_VERSION"));
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.YEAR) {
            map.put("COMMON_TITLE_TEXT", context.getString(R.string.IDS_manual_sleep_annual_average_data));
            int iA = gwc.a(gxqVar);
            map.put("IS_CORE_SLEEP", false);
            d(context, map, iA, gxqVar.d());
            return;
        }
        if (this.f) {
            c(context, map, gxqVar);
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            map.put("IS_PHONE_SLEEP", Boolean.valueOf(gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL));
            b(context, map, gxqVar);
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            map.put("IS_PHONE_SLEEP", Boolean.valueOf(gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE));
            e(context, map, gxqVar);
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            map.put("IS_CORE_SLEEP", Boolean.valueOf(gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE));
            d(context, map, gxqVar);
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            c(context, map, gxqVar);
        }
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
            map.put("IS_DATA_TYPE_DAY", true);
        }
    }

    private void b(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepScoringProvider", "setManualSleepData");
        int iR = gxqVar.h().r();
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
            map.put("LEVEL_TITLE", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_sleep_quality));
        } else {
            map.put("LEVEL_TITLE", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_avg_night_sleep));
        }
        if (d(gxqVar.m())) {
            map.put("LEVEL_VALUE", "--");
        } else {
            map.put("LEVEL_VALUE", ucv.j(iR));
            map.put("LEVEL_VALUE_COLOR", Integer.valueOf(ucv.f(iR)));
        }
        map.put("SUGGEST_TITLE", this.u);
        map.put("SUGGEST_CONTENT", this.t);
        LogUtil.a("SleepScoringProvider", map);
    }

    private void e(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepScoringProvider", "setPhoneSleepData");
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
            map.put("LEVEL_TITLE", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_sleep_quality));
        } else {
            map.put("LEVEL_TITLE", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_avg_night_sleep));
        }
        int iX = gxqVar.g().x();
        map.put("LEVEL_VALUE", ucv.j(iX));
        map.put("LEVEL_VALUE_COLOR", Integer.valueOf(ucv.f(iX)));
        map.put("SUGGEST_TITLE", this.u);
        map.put("SUGGEST_CONTENT", this.t);
        String str = this.j;
        if (str != null) {
            map.put("DETECT_ABNORMAL", str);
        }
        String str2 = this.i;
        if (str2 != null) {
            map.put("DETECT_ABNORMAL_JUMP", str2);
            b(map);
        }
        LogUtil.a("SleepScoringProvider", map);
    }

    private void b(Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepScoringProvider.3
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
                if ("COMMON_CLICK_EVENT".equals(str)) {
                    pjo.b().a(com.huawei.hwcommonmodel.application.BaseApplication.getActivity(), "#/SleepSetting");
                }
            }
        });
    }

    private void d(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepScoringProvider", "setCoreSleepData");
        int iAq = gxqVar.k().aq();
        if (iAq == 0) {
            map.put("SCORING_VALUE", "--");
            map.put("SCORING_UNIT", null);
            map.put("SCORING_RATING", 0);
            map.put("SCORING_DESC", null);
        } else {
            map.put("SCORING_VALUE", UnitUtil.e(iAq, 1, 0));
            map.put("SCORING_UNIT", context.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, iAq));
            map.put("SCORING_RATING", Integer.valueOf((iAq + 9) / 10));
            map.put("SCORING_DESC", this.v);
        }
        map.put("HARVARD_LOGO_TEXT", null);
        map.put("HARVARD_IMAGE", null);
        if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
            if (VersionControlUtil.isSupportSleepManagement()) {
                map.put("SCORING_TITLE", null);
            } else {
                map.put("SCORING_TITLE", context.getString(R.string.IDS_hw_show_main_home_page_sleep_score));
            }
        } else {
            map.put("SCORING_TITLE", context.getString(R.string.IDS_fitness_core_sleep_avg_night_sleep));
        }
        map.remove("DETECT_ABNORMAL");
        map.remove("DETECT_ABNORMAL_JUMP");
        map.put("SUGGEST_TITLE", this.u);
        map.put("SUGGEST_CONTENT", this.t);
        LogUtil.e("SleepScoringProvider", map);
    }

    private void c(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepScoringProvider", "setCommonSleepData");
        map.put("IS_PHONE_SLEEP", false);
        map.put("IS_CORE_SLEEP", false);
        SleepViewConstants.ViewTypeEnum viewTypeEnumD = gxqVar.d();
        if (viewTypeEnumD == SleepViewConstants.ViewTypeEnum.MONTH || viewTypeEnumD == SleepViewConstants.ViewTypeEnum.WEEK) {
            map.put("COMMON_TITLE_TEXT", context.getString(R.string.IDS_fitness_average_sleep_data_title));
            d(context, map, gxqVar.b().i(), viewTypeEnumD);
        } else {
            d(context, map, this.s ? gxqVar.g().i() : gxqVar.b().i(), viewTypeEnumD);
        }
    }

    private void d(Context context, HashMap<String, Object> map, int i, SleepViewConstants.ViewTypeEnum viewTypeEnum) {
        String string;
        SpannableString spannableString;
        LogUtil.a("SleepScoringProvider", "setSleepDataToCommonSleep");
        this.y = Typeface.createFromAsset(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        int i2 = i / 60;
        if (viewTypeEnum == SleepViewConstants.ViewTypeEnum.DAY && i2 >= 15) {
            wum.a(context, new SimpleDateFormat("yyyy-MM-dd").format(new Date(this.p.f())), "EXCE_NORMALSLEEP__TIME_ERROR");
        }
        int i3 = i % 60;
        String strE = UnitUtil.e(i2, 1, 0);
        String strE2 = UnitUtil.e(i3, 1, 0);
        String strB = b(com.huawei.ui.commonui.R.plurals.IDS_min_unit, i3);
        if (i2 == 0) {
            spannableString = new SpannableString(strB);
            int iIndexOf = i3 != 0 ? strB.indexOf(strE2) : strB.indexOf("--");
            int length = i3 != 0 ? strE2.length() : 2;
            if (iIndexOf >= 0) {
                b(spannableString, iIndexOf, length);
                spannableString.setSpan(new AbsoluteSizeSpan(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_30sp)), iIndexOf, length + iIndexOf, 17);
            }
        } else {
            String strB2 = b(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, i2);
            if (LanguageUtil.x(context)) {
                string = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_three_parts, strB2, "و ", strB);
            } else {
                string = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_two_parts, strB2, strB);
            }
            int iLastIndexOf = string.lastIndexOf(strE2);
            int iIndexOf2 = string.indexOf(strE);
            SpannableString spannableString2 = new SpannableString(string);
            b(iLastIndexOf, iIndexOf2, spannableString2, strE2, strE);
            spannableString = spannableString2;
        }
        map.put("COMMON_SLEEP_TEXT", spannableString);
        LogUtil.a("SleepScoringProvider", map);
    }

    private String b(int i, int i2) {
        try {
            return com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(i, i2, UnitUtil.e(i2, 1, 0));
        } catch (IllegalFormatConversionException e2) {
            LogUtil.j("SleepScoringProvider", "getQuantityValue() resId = ", Integer.valueOf(i), " IllegalFormatConversionException = ", e2);
            return "";
        }
    }

    private void b(SpannableString spannableString, int i, int i2) {
        if (this.y == null) {
            LogUtil.d("SleepScoringProvider", "custom typeface is null.,return");
        } else if (Build.VERSION.SDK_INT >= 28) {
            spannableString.setSpan(new HarmonyOsTypefaceSpan(this.y), i, i2 + i, 17);
        } else {
            spannableString.setSpan(new TypefaceSpan(Constants.FONT), i, i2 + i, 17);
        }
    }

    private void b(int i, int i2, SpannableString spannableString, String str, String str2) {
        if (i >= 0) {
            b(spannableString, i, str.length());
            spannableString.setSpan(new AbsoluteSizeSpan(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_30sp)), i, str.length() + i, 17);
        }
        if (i2 >= 0) {
            b(spannableString, i2, str2.length());
            spannableString.setSpan(new AbsoluteSizeSpan(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_30sp)), i2, str2.length() + i2, 17);
        }
    }

    private void g(gxq gxqVar) {
        LogUtil.a("SleepScoringProvider", "requestSleepData");
        e();
        f(gxqVar);
    }

    private void f(gxq gxqVar) {
        if (this.l == null) {
            LogUtil.e("SleepScoringProvider", "requestSuggestData, but mInteractor is null");
            return;
        }
        int i = AnonymousClass2.d[gxqVar.d().ordinal()];
        if (i == 1) {
            this.r.d(this, gxqVar);
            return;
        }
        if (i == 2) {
            this.l.b(a(new Date(gxqVar.f())), 13, gxqVar.k().ax(), new b());
        } else {
            if (i != 3) {
                return;
            }
            this.l.c(new Date(lsl.p(gxqVar.f())), new Date(lsl.b(gxqVar.f())), gxqVar.k().ax(), new b());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepScoringProvider$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[SleepViewConstants.ViewTypeEnum.values().length];
            d = iArr;
            try {
                iArr[SleepViewConstants.ViewTypeEnum.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[SleepViewConstants.ViewTypeEnum.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[SleepViewConstants.ViewTypeEnum.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SleepViewConstants.SleepTypeEnum.values().length];
            e = iArr2;
            try {
                iArr2[SleepViewConstants.SleepTypeEnum.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[SleepViewConstants.SleepTypeEnum.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private Date a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, 6);
        return calendar.getTime();
    }

    public Date d(Date date) {
        return e(date).getTime();
    }

    public Date c(Date date) {
        Calendar calendarE = e(date);
        calendarE.add(7, 6);
        return calendarE.getTime();
    }

    private Calendar e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(7, calendar.get(7) == 1 ? -6 : 2 - calendar.get(7));
        return calendar;
    }

    private void e() {
        if (Utils.k()) {
            return;
        }
        ucx.c(new CommonUiBaseResponse() { // from class: uba
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public final void onResponse(int i, Object obj) {
                this.e.d(i, obj);
            }
        });
    }

    public /* synthetic */ void d(int i, Object obj) {
        if (obj instanceof ubq) {
            e(i, this.p.k().aq(), (ubq) obj);
        }
    }

    private void e(int i, int i2, ubq ubqVar) {
        if (i == -1) {
            this.v = null;
            return;
        }
        Map<String, Integer> mapC = ubqVar.c();
        if (mapC == null) {
            this.v = null;
        } else {
            this.v = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_core_sleep_user_rate, UnitUtil.e(mapC.get(String.valueOf(i2)).intValue(), 2, 0));
        }
        this.r.d(this, this.p);
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SleepScoringProvider> f26854a;

        private c(SleepScoringProvider sleepScoringProvider) {
            this.f26854a = new WeakReference<>(sleepScoringProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("SleepScoringProvider", "PhoneSuggestDataResponse errorCode: ", Integer.valueOf(i), ", data: ", obj);
            SleepScoringProvider sleepScoringProvider = this.f26854a.get();
            if (sleepScoringProvider == null) {
                return;
            }
            gxq gxqVar = sleepScoringProvider.p;
            if (i != 0) {
                sleepScoringProvider.f = true;
                sleepScoringProvider.s = true;
                sleepScoringProvider.r.d(sleepScoringProvider, gxqVar);
                return;
            }
            HashMap map = (HashMap) obj;
            int iIntValue = ((Integer) map.get("sleep_tag")).intValue();
            int iIntValue2 = ((Integer) map.get("sdk_type")).intValue();
            LogUtil.a("SleepScoringProvider", "sleepTagMap: ", map.toString());
            if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
                String strE = ucv.e(gxqVar.g().x());
                int i2 = gxqVar.g().i();
                LogUtil.a("SleepScoringProvider", "mNightTotalSleepTime: ", Integer.valueOf(i2));
                String strB = ucv.b(iIntValue, iIntValue2, i2 > 600, i2);
                String strC = ucv.c(iIntValue);
                String strB2 = ucv.b(iIntValue);
                sleepScoringProvider.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_two_parts, strE, strB);
                sleepScoringProvider.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_two_parts, strC, strB2);
                sleepScoringProvider.d(gxqVar);
            }
        }
    }

    static class b implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SleepScoringProvider> f26853c;

        private b(SleepScoringProvider sleepScoringProvider) {
            this.f26853c = new WeakReference<>(sleepScoringProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            SleepScoringProvider sleepScoringProvider = this.f26853c.get();
            if (sleepScoringProvider == null || i == -1 || !(obj instanceof Map)) {
                return;
            }
            gxq gxqVar = sleepScoringProvider.p;
            Map map = (Map) obj;
            if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.WEEK || gxqVar.d() == SleepViewConstants.ViewTypeEnum.MONTH) {
                if (TextUtils.isEmpty((CharSequence) map.get("SUGGEST_TITLE")) || TextUtils.isEmpty((CharSequence) map.get("SUGGEST_CONTENT"))) {
                    sleepScoringProvider.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_core_sleep_suggesttion_nullstatus_tital);
                    if (gxqVar.k().i() > 180) {
                        sleepScoringProvider.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_core_sleep_suggesttion_nullstatus_content3);
                    } else {
                        sleepScoringProvider.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_core_sleep_suggesttion_nullstatus_content, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_nap_hour_string, 3, 3));
                    }
                } else {
                    sleepScoringProvider.u = (String) map.get("SUGGEST_TITLE");
                    sleepScoringProvider.t = (String) map.get("SUGGEST_CONTENT");
                    sleepScoringProvider.r.d(sleepScoringProvider, gxqVar);
                    return;
                }
            } else if (gxqVar.d() == SleepViewConstants.ViewTypeEnum.DAY) {
                if (gxqVar.k().aq() == 0) {
                    sleepScoringProvider.u = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_core_sleep_suggesttion_nullstatus_tital);
                    sleepScoringProvider.t = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_core_sleep_suggesttion_novalidData_content);
                } else {
                    sleepScoringProvider.u = (String) map.get("SUGGEST_TITLE");
                    sleepScoringProvider.t = (String) map.get("SUGGEST_CONTENT");
                }
            }
            sleepScoringProvider.r.d(sleepScoringProvider, gxqVar);
        }
    }
}
