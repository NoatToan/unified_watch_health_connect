package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.sport.utils.FitnessDataQueryDefine;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.ResultUtils;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepTotalData;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ujk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50232a;
    private boolean ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50234c;
    private int d;
    private int e;
    private int p;
    private List<uig> u;
    private uig x;
    private List<uig> w = new ArrayList(16);
    private int ak = 0;
    private int au = 0;
    private int ad = 0;
    private int ao = 0;
    private int v = 0;
    private int az = 0;
    private int ay = 0;
    private int ap = 0;
    private int ac = 0;
    private int aa = 0;
    private int av = 0;
    private int al = 0;
    private int z = 0;
    private int bc = 0;
    private List<String> aj = new ArrayList(16);
    private List<uig> y = new ArrayList(16);
    private List<uig> an = new ArrayList(16);
    private List<uig> ba = new ArrayList(16);
    private List<uig> as = new ArrayList(16);
    private List<uig> af = new ArrayList(16);
    private int t = 0;
    private int ar = 0;
    private boolean ae = false;
    private double at = 0.0d;
    private String ab = "";
    private String bb = "";
    private String ax = "";
    private String aw = "";
    private int i = 0;
    private int o = 0;
    private int k = 0;
    private int l = 0;
    private int q = 0;
    private int n = 0;
    private int j = 0;
    private int s = 0;
    private int h = 0;
    private int r = 0;
    private int g = 0;
    private int m = 0;
    private int am = 0;
    private Context f = BaseApplication.getContext();
    private uje ag = new uje();
    private ujp ah = ujp.b();
    private ujb aq = ujb.b(this.f);

    static /* synthetic */ int d(ujk ujkVar) {
        int i = ujkVar.am + 1;
        ujkVar.am = i;
        return i;
    }

    public void c(String str) {
        this.ab = str;
    }

    public void a(String str) {
        this.bb = str;
    }

    public List<String> i() {
        return (List) ResultUtils.c(this.aj);
    }

    public int a() {
        int i = this.av;
        int i2 = i < 10 ? 100 - (i * 2) : 90 - i;
        if (i2 < 0) {
            i2 = 0;
        }
        return ((Integer) ResultUtils.c(Integer.valueOf((i == 0 && this.ap == 0) ? 0 : i2))).intValue();
    }

    public double m() {
        return ((Double) ResultUtils.c(Double.valueOf(this.at))).doubleValue();
    }

    public int j() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.z))).intValue();
    }

    public int k() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.bc))).intValue();
    }

    /* JADX INFO: renamed from: ujk$5, reason: invalid class name */
    class AnonymousClass5 implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CommonUiBaseResponse f50240c;

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "getMonthBaseTime back, errorCode = ", Integer.valueOf(i));
            CommonUiBaseResponse commonUiBaseResponse = this.f50240c;
            if (commonUiBaseResponse != null) {
                commonUiBaseResponse.onResponse(i, obj);
            }
        }
    }

    public void b(long j, int i, CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "requestCoreSleepDetailUiData paraUiDataType = ", Integer.valueOf(i));
        this.am = 0;
        s();
        if (i == 1) {
            a(j, commonUiBaseResponse);
        } else if (i == 2) {
            b(j, commonUiBaseResponse);
        } else {
            if (i != 4) {
                return;
            }
            e(j, commonUiBaseResponse);
        }
    }

    private void a(long j, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "handleDayType enter, start time = ", Long.valueOf(j));
        d(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_HISTOGRAM, new CommonUiBaseResponse() { // from class: ujk.1
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                CommonUiBaseResponse commonUiBaseResponse2;
                LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "requestCoreSleepHistogramData back,errorCode = ", Integer.valueOf(i));
                ujk.d(ujk.this);
                LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "mRequestReportCount = ", Integer.valueOf(ujk.this.am));
                if (ujk.this.am != 2 || (commonUiBaseResponse2 = commonUiBaseResponse) == null) {
                    return;
                }
                commonUiBaseResponse2.onResponse(i, obj);
            }
        });
        d(j, new CommonUiBaseResponse() { // from class: ujk.3
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                CommonUiBaseResponse commonUiBaseResponse2;
                LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "requestCoreSleepDayTotalData back, errorCode = ", Integer.valueOf(i));
                ujk.d(ujk.this);
                LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "mRequestReportCount = ", Integer.valueOf(ujk.this.am));
                if (ujk.this.am != 2 || (commonUiBaseResponse2 = commonUiBaseResponse) == null) {
                    return;
                }
                commonUiBaseResponse2.onResponse(i, obj);
            }
        });
    }

    private void b(long j, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "handleWeekType enter, start time = ", Long.valueOf(j));
        d(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_HISTOGRAM, new CommonUiBaseResponse() { // from class: ujk.2
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "request week histogram back, errorCode = ", Integer.valueOf(i));
                CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                if (commonUiBaseResponse2 != null) {
                    commonUiBaseResponse2.onResponse(i, obj);
                }
            }
        });
    }

    private void e(long j, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "handleYearType enter, start time = ", Long.valueOf(j));
        d(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_HISTOGRAM, new CommonUiBaseResponse() { // from class: ujk.4
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "request year histogram back, errorCode = ", Integer.valueOf(i));
                CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                if (commonUiBaseResponse2 != null) {
                    commonUiBaseResponse2.onResponse(i, obj);
                }
            }
        });
    }

    private void d(long j, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "requestCoreSleepHistogramData enter, start time = ", Long.valueOf(j));
        if (fitnessQueryId == FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_HISTOGRAM) {
            e(j, fitnessQueryId, commonUiBaseResponse);
        } else {
            a(j, fitnessQueryId, commonUiBaseResponse);
        }
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "Leave requestCoreSleepHistogramData");
    }

    private void c(List<SleepTotalData> list) {
        if (list != null) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "Enter processSleepHistogramData paramListData.size: ", Integer.valueOf(list.size()));
            for (int i = 0; i < list.size(); i++) {
                SleepTotalData sleepTotalData = list.get(i);
                d(i, sleepTotalData);
                LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "sleepTotalData.getType():", Integer.valueOf(sleepTotalData.getType()));
                if (sleepTotalData.getType() == 31) {
                    this.ae = true;
                }
            }
            return;
        }
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "paramListData is null! ");
    }

    private void d(int i, SleepTotalData sleepTotalData) {
        uig uigVar = new uig();
        uigVar.b(i);
        int i2 = i + 1;
        uigVar.e(i2);
        uigVar.c(sleepTotalData.getSleepDayTime());
        uigVar.b(sleepTotalData.getCoreSleepFallTime());
        uigVar.d(sleepTotalData.getCoreSleepWakeupTime());
        uig uigVar2 = new uig();
        uigVar2.b(i);
        uigVar2.e(i2);
        uig uigVar3 = new uig();
        uigVar3.b(i);
        uigVar3.e(i2);
        uig uigVar4 = new uig();
        uigVar4.b(i);
        uigVar4.e(i2);
        uig uigVar5 = new uig();
        uigVar5.b(i);
        uigVar5.e(i2);
        uigVar.a(sleepTotalData.getDeepSleepTime());
        this.y.add(uigVar);
        uigVar3.a(sleepTotalData.getShallowSleepTime());
        this.an.add(uigVar3);
        uigVar2.a(sleepTotalData.getNoonSleepTime());
        this.af.add(uigVar2);
        uigVar4.a(sleepTotalData.getSlumberSleepTime());
        this.as.add(uigVar4);
        uigVar5.a(sleepTotalData.getWakeupDuration());
        this.ba.add(uigVar5);
    }

    public void d(long j, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "requestCoreSleepDayTotalData, start time = ", Long.valueOf(j));
        ujp ujpVar = this.ah;
        if (ujpVar != null) {
            ujpVar.e(j, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC, FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_UNSPECIFIC_SLEEP_TIME, new CommonUiBaseResponse() { // from class: ujk.8
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i, Object obj) {
                    LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "requestGetCoreSleepDetailData errorCode = ", Integer.valueOf(i));
                    ujk.this.t();
                    if (i == 0 && obj != null) {
                        List list = (List) obj;
                        if (list.size() != 0) {
                            ujk.this.b((List<SleepTotalData>) list);
                        }
                        LogUtil.a("FitnessOldCoreSleepDetailInteractor", "requestSleepDetailTotalData requestGetSleepDetailData : TT = ", Integer.valueOf(ujk.this.au), " DT = ", Integer.valueOf(ujk.this.ad), " ST = ", Integer.valueOf(ujk.this.ao), " WD = ", Integer.valueOf(ujk.this.az), " ST = ", Integer.valueOf(ujk.this.ap), " WT = ", Integer.valueOf(ujk.this.ay), " DP = ", Integer.valueOf(ujk.this.aa), ", SF = ", Integer.valueOf(ujk.this.av), " S = ", Integer.valueOf(ujk.this.al), " FT = ", Integer.valueOf(ujk.this.z), " WT = ", Integer.valueOf(ujk.this.bc), " DT = ", Integer.valueOf(ujk.this.v), " ST = ", Integer.valueOf(ujk.this.ar), " VD = ", Double.valueOf(ujk.this.at));
                    } else {
                        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "requestGetCoreSleepDetailData else.");
                    }
                    if (commonUiBaseResponse != null) {
                        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "updateResponse.onResponse !");
                        commonUiBaseResponse.onResponse(i, obj);
                    }
                }
            });
        }
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "Leave requestSleepDetailTotalData.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<SleepTotalData> list) {
        SleepTotalData sleepTotalData = list.get(0);
        this.au = sleepTotalData.getTotalSleepTime();
        this.ad = sleepTotalData.getDeepSleepTime();
        this.ao = sleepTotalData.getShallowSleepTime();
        this.az = sleepTotalData.getWakeupDuration();
        this.ap = sleepTotalData.getSlumberSleepTime();
        this.v = sleepTotalData.getNoonSleepTime();
        this.ay = sleepTotalData.getWakeupTimes();
        this.aa = sleepTotalData.getDeepSleepPart();
        this.av = sleepTotalData.getSnoreFreq();
        this.al = sleepTotalData.getScore();
        this.ar = sleepTotalData.getType();
        this.at = sleepTotalData.getValidData();
        int fallTime = sleepTotalData.getFallTime();
        int i = fallTime + 1200;
        this.z = i;
        if (i > 1440) {
            this.z = fallTime - 240;
        }
        int wakeUpTime = sleepTotalData.getWakeUpTime();
        int i2 = wakeUpTime + 1200;
        this.bc = i2;
        if (i2 > 1440) {
            this.bc = wakeUpTime - 240;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.au = 0;
        this.ad = 0;
        this.ao = 0;
        this.az = 0;
        this.ap = 0;
        this.v = 0;
        this.ay = 0;
        this.aa = 0;
        this.av = 0;
        this.al = 0;
        this.z = 0;
        this.bc = 0;
        this.ar = 0;
        this.at = 0.0d;
    }

    private void r() {
        this.au = 0;
        this.ak = 0;
        this.ad = 0;
        this.ao = 0;
        this.v = 0;
        this.az = 0;
        this.ay = 0;
        this.ap = 0;
        this.aa = 0;
        this.av = 0;
        this.al = 0;
        this.z = 0;
        this.bc = 0;
        this.ar = 0;
        this.ae = false;
        this.t = 0;
        this.i = 0;
        this.o = 0;
        this.l = 0;
        this.q = 0;
        this.k = 0;
        this.n = 0;
        this.j = 0;
        this.s = 0;
        this.h = 0;
        this.r = 0;
        this.g = 0;
        this.m = 0;
        this.f50233b = 0;
        this.e = 0;
        this.d = 0;
    }

    private void s() {
        e("");
        this.aw = "";
    }

    public int e() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.ap))).intValue();
    }

    public int h() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.au))).intValue();
    }

    public int d() {
        int i = this.au;
        return ((Integer) ResultUtils.c(Integer.valueOf(i == 0 ? 0 : Math.round((this.ad / i) * 100.0f)))).intValue();
    }

    public int g() {
        int i = this.au;
        return ((Integer) ResultUtils.c(Integer.valueOf(i == 0 ? 0 : Math.round((this.ao / i) * 100.0f)))).intValue();
    }

    public int b() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.au == 0 ? 0 : (100 - g()) - d()))).intValue();
    }

    public int l() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.ay))).intValue();
    }

    private void a(List<uig> list) {
        this.w = list;
    }

    public int c() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.n))).intValue();
    }

    public String f() {
        return (String) ResultUtils.c(this.ax);
    }

    private void e(String str) {
        this.ax = str;
    }

    public boolean n() {
        return ((Boolean) ResultUtils.c(Boolean.valueOf(this.ae))).booleanValue();
    }

    public void e(Date date, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        if (this.aq != null) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "enter requestSleepSuggestString()");
            s();
            this.aq.c(date, i, 0, new CommonUiBaseResponse() { // from class: ujg
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public final void onResponse(int i2, Object obj) {
                    this.e.a(commonUiBaseResponse, i2, obj);
                }
            });
        }
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "leave getSleepSuggestString()");
    }

    /* synthetic */ void a(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "getSleepAdvice day or week");
        d(i, obj, commonUiBaseResponse);
    }

    private void d(int i, Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        if (i == 0 && (obj instanceof CoreSleepTotalData)) {
            CoreSleepTotalData coreSleepTotalData = (CoreSleepTotalData) obj;
            e(d(coreSleepTotalData.getAdNum0(), coreSleepTotalData));
            this.aw = this.ag.h(coreSleepTotalData.getAdNum1());
        } else {
            e("");
            this.aw = "";
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(i, obj);
        }
    }

    private String d(int i, CoreSleepTotalData coreSleepTotalData) {
        if (i < 12000) {
            return a(i);
        }
        return b(i, coreSleepTotalData);
    }

    private String b(int i, CoreSleepTotalData coreSleepTotalData) {
        if (coreSleepTotalData == null) {
            return "";
        }
        switch ((i % 1000) / 100) {
            case 0:
                return this.f.getResources().getString(uix.b(i), this.ag.b(2));
            case 1:
                return this.ag.d(i, coreSleepTotalData);
            case 2:
                return this.ag.j(i, coreSleepTotalData);
            case 3:
                return this.ag.h(i, coreSleepTotalData);
            case 4:
                return this.ag.c(i, coreSleepTotalData);
            case 5:
                return this.ag.b(i, coreSleepTotalData);
            case 6:
                return this.ag.i(i, coreSleepTotalData);
            case 7:
                return this.ag.a(i, coreSleepTotalData);
            case 8:
                int i2 = this.f50233b;
                int i3 = this.e;
                return this.ag.c(i, coreSleepTotalData, i2 + i3 + this.d, c());
            default:
                return this.f.getResources().getString(uix.b(i));
        }
    }

    private String a(int i) {
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " combineDayString index = ", Integer.valueOf(i));
        String string = this.f.getResources().getString(uix.b(i));
        if (e(i, uix.i())) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " ContainIndex totalSleepIndex");
            return String.format(Locale.ENGLISH, string, wud.c(h()));
        }
        if (e(i, uix.b())) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " ContainIndex dreamRateIndex");
            return String.format(Locale.ENGLISH, string, UnitUtil.e(b(), 2, 0));
        }
        if (e(i, uix.a())) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " ContainIndex fallAsleepIndex");
            return String.format(Locale.ENGLISH, string, this.ab);
        }
        if (e(i, uix.f())) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " ContainIndex wakeIndex");
            return String.format(Locale.ENGLISH, string, this.bb);
        }
        if (e(i, uix.j())) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " ContainIndex wakeUpTimesIndex");
            String quantityString = this.f.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, l(), UnitUtil.e(l(), 1, 0));
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "wakeUpTimes: ", quantityString);
            return String.format(Locale.ENGLISH, string, quantityString);
        }
        if (e(i, uix.c())) {
            return String.format(Locale.ENGLISH, string, UnitUtil.e(d(), 2, 0));
        }
        if (e(i, uix.d())) {
            return String.format(Locale.ENGLISH, string, UnitUtil.e(0.0d, 1, 0));
        }
        if (!e(i, uix.e())) {
            return string;
        }
        return String.format(Locale.ENGLISH, string, UnitUtil.e(a(), 1, 0) + " " + this.f.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, a()));
    }

    private boolean e(int i, int[] iArr) {
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " isContainIndex()  targetIndex = ", Integer.valueOf(i));
        for (int i2 : iArr) {
            if (i == i2) {
                LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " isContainIndex()  return true ");
                return true;
            }
        }
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " isContainIndex()  return false ");
        return false;
    }

    private void e(List<uig> list) {
        this.ab = "";
        this.bb = "";
        if (list == null || list.size() == 0) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "sleepHistogramData size = 0");
            return;
        }
        Map<String, Integer> mapE = uje.e(list);
        if (mapE == null) {
            LogUtil.j("UIHLH_FitnessOldCoreSleepDetailInteractor", "timeMap is null!");
            return;
        }
        int iIntValue = mapE.get("core_sleep_end_time_key").intValue();
        int i = iIntValue / 60;
        int i2 = i + 20;
        if (i2 >= 24) {
            i2 = i - 4;
        }
        String strA = wud.a(wud.r(i2) + ":" + wud.r(iIntValue % 60));
        this.ab = strA;
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "advice mFallAsleepTime = ", strA);
        int iIntValue2 = mapE.get("core_sleep_end_time_key").intValue();
        int i3 = iIntValue2 / 60;
        int i4 = i3 + 20;
        if (i4 >= 24) {
            i4 = i3 - 4;
        }
        String strA2 = wud.a(wud.r(i4) + ":" + wud.r(iIntValue2 % 60));
        this.bb = strA2;
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "advice mWakeTime = ", strA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        int i3 = this.f50234c;
        if (i != 0) {
            int i4 = i3 / i;
            int i5 = i4 + 1200;
            if (i5 > 1440) {
                i5 = i4 - 240;
            }
            this.f50234c = i5;
        }
        int i6 = this.f50232a;
        if (i2 != 0) {
            int i7 = i6 / i2;
            int i8 = i7 + 1200;
            if (i8 > 1440) {
                i8 = i7 - 240;
            }
            this.f50232a = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.f50234c = 0;
        this.f50232a = 0;
    }

    private void e(long j, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "Enter getWeekBaseTime().");
        q();
        HiHealthManager.d(this.f).aggregateHiHealthData(this.ag.e(j, 7), new e(this, fitnessQueryId, j, commonUiBaseResponse, null));
    }

    /* JADX INFO: renamed from: ujk$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50236a;

        static {
            int[] iArr = new int[FitnessDataQueryDefine.FitnessQueryId.values().length];
            f50236a = iArr;
            try {
                iArr[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_HISTOGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50236a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_HISTOGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50236a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_HISTOGRAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50236a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_HISTOGRAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, final FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, final CommonUiBaseResponse commonUiBaseResponse) {
        if (fitnessQueryId == FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_HISTOGRAM) {
            j = ltb.e(new Date(j * 1000));
        }
        long j2 = j;
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "getData queryId = ", fitnessQueryId);
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "getData paraStartTime = ", Long.valueOf(j2), " para StartDate = ", new Date(1000 * j2));
        ujp ujpVar = this.ah;
        if (ujpVar != null) {
            ujpVar.e(j2, fitnessQueryId, FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_UNSPECIFIC_SLEEP_TIME, new CommonUiBaseResponse() { // from class: ujk.6
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i, Object obj) {
                    LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "getData response back.");
                    int i2 = AnonymousClass10.f50236a[fitnessQueryId.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ujk.this.c(i, obj, commonUiBaseResponse);
                            return;
                        }
                        if (i2 != 3) {
                            if (i2 == 4) {
                                ujk.this.a(i, obj, commonUiBaseResponse);
                                return;
                            }
                            CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                            if (commonUiBaseResponse2 != null) {
                                commonUiBaseResponse2.onResponse(i, obj);
                                return;
                            }
                            return;
                        }
                    }
                    ujk.this.b(i, obj, commonUiBaseResponse);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        p();
        r();
        LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "handleYearData errorCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof List)) {
            List<SleepTotalData> list = (List) obj;
            c(list);
            int i2 = 0;
            int i3 = 0;
            int deepSleepTime = 0;
            int shallowSleepTime = 0;
            int i4 = 0;
            int slumberSleepTime = 0;
            int wakeupTimes = 0;
            int i5 = 0;
            int i6 = 0;
            int noonSleepTime = 0;
            for (SleepTotalData sleepTotalData : list) {
                if (sleepTotalData.getDeepSleepTime() > 0) {
                    deepSleepTime += sleepTotalData.getDeepSleepTime();
                    i2++;
                }
                if (sleepTotalData.getShallowSleepTime() > 0) {
                    shallowSleepTime += sleepTotalData.getShallowSleepTime();
                    i3++;
                }
                if (sleepTotalData.getNoonSleepTime() > 0) {
                    noonSleepTime += sleepTotalData.getNoonSleepTime();
                    i6++;
                }
                if (sleepTotalData.getWakeupTimes() > 0) {
                    wakeupTimes += sleepTotalData.getWakeupTimes();
                    i4++;
                }
                if (sleepTotalData.getSlumberSleepTime() > 0) {
                    slumberSleepTime += sleepTotalData.getSlumberSleepTime();
                    i5++;
                }
            }
            a(i2, i3, deepSleepTime, shallowSleepTime);
            b(i4, slumberSleepTime, wakeupTimes, i5);
            b(i6, noonSleepTime);
            LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "Deep = ", Integer.valueOf(this.i), " Shallow = ", Integer.valueOf(this.o), " WakeTimes = ", Integer.valueOf(this.q), " NoonSleepTime = ", Integer.valueOf(this.m));
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(i, this.y);
        }
    }

    private void b(int i, int i2) {
        this.m = i2;
        if (i > 0) {
            this.m = Math.round(i2 / i);
        }
    }

    private void b(int i, int i2, int i3, int i4) {
        this.q = i3;
        if (i > 0) {
            this.q = Math.round(i3 / i);
        }
        this.k = i2;
        if (i4 > 0) {
            this.k = Math.round(i2 / i4);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        this.i = i3;
        if (i > 0) {
            this.i = Math.round(i3 / i);
        }
        this.o = i4;
        if (i2 > 0) {
            this.o = Math.round(i4 / i2);
        }
    }

    private void p() {
        this.y.clear();
        this.an.clear();
        this.ba.clear();
        this.as.clear();
        this.af.clear();
    }

    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50244a;
        private int aa;
        private int ab;
        private int ac;
        private int ad;
        private int ae;
        private int ag;
        private int ah;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50246c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;
        private int w;
        private int x;
        private int y;
        private int z;

        private d() {
            this.f50246c = 0;
            this.i = 0;
            this.j = 0;
            this.x = 0;
            this.f = 0;
            this.p = 0;
            this.s = 0;
            this.aa = 0;
            this.y = 0;
            this.q = 0;
            this.f50244a = 0;
            this.n = 0;
            this.k = 0;
            this.ab = 0;
            this.d = 0;
            this.ah = 0;
            this.ag = 0;
            this.ae = 0;
            this.u = 0;
            this.t = 0;
            this.v = 0;
            this.g = 0;
            this.ac = 0;
            this.ad = 0;
            this.h = 0;
            this.l = 0;
            this.m = 0;
            this.z = 0;
            this.w = 0;
            this.o = 0;
            this.r = 0;
            this.e = 0;
        }

        /* synthetic */ d(ujk ujkVar, AnonymousClass5 anonymousClass5) {
            this();
        }

        static /* synthetic */ int a(d dVar, int i) {
            int i2 = dVar.ae + i;
            dVar.ae = i2;
            return i2;
        }

        static /* synthetic */ int af(d dVar) {
            int i = dVar.s;
            dVar.s = i + 1;
            return i;
        }

        static /* synthetic */ int ah(d dVar) {
            int i = dVar.aa;
            dVar.aa = i + 1;
            return i;
        }

        static /* synthetic */ int ai(d dVar) {
            int i = dVar.f50244a;
            dVar.f50244a = i + 1;
            return i;
        }

        static /* synthetic */ int am(d dVar) {
            int i = dVar.n;
            dVar.n = i + 1;
            return i;
        }

        static /* synthetic */ int an(d dVar) {
            int i = dVar.k;
            dVar.k = i + 1;
            return i;
        }

        static /* synthetic */ int ar(d dVar) {
            int i = dVar.ab;
            dVar.ab = i + 1;
            return i;
        }

        static /* synthetic */ int b(d dVar, int i) {
            int i2 = dVar.ag + i;
            dVar.ag = i2;
            return i2;
        }

        static /* synthetic */ int c(d dVar, int i) {
            int i2 = dVar.u + i;
            dVar.u = i2;
            return i2;
        }

        static /* synthetic */ int d(d dVar, int i) {
            int i2 = dVar.t + i;
            dVar.t = i2;
            return i2;
        }

        static /* synthetic */ int e(d dVar, int i) {
            int i2 = dVar.ah + i;
            dVar.ah = i2;
            return i2;
        }

        static /* synthetic */ int f(d dVar, int i) {
            int i2 = dVar.o + i;
            dVar.o = i2;
            return i2;
        }

        static /* synthetic */ int g(d dVar, int i) {
            int i2 = dVar.ac + i;
            dVar.ac = i2;
            return i2;
        }

        static /* synthetic */ int h(d dVar) {
            int i = dVar.y;
            dVar.y = i + 1;
            return i;
        }

        static /* synthetic */ int h(d dVar, int i) {
            int i2 = dVar.r + i;
            dVar.r = i2;
            return i2;
        }

        static /* synthetic */ int i(d dVar) {
            int i = dVar.j;
            dVar.j = i + 1;
            return i;
        }

        static /* synthetic */ int i(d dVar, int i) {
            int i2 = dVar.v + i;
            dVar.v = i2;
            return i2;
        }

        static /* synthetic */ int j(d dVar, int i) {
            int i2 = dVar.g + i;
            dVar.g = i2;
            return i2;
        }

        static /* synthetic */ int k(d dVar) {
            int i = dVar.q;
            dVar.q = i + 1;
            return i;
        }

        static /* synthetic */ int k(d dVar, int i) {
            int i2 = dVar.m + i;
            dVar.m = i2;
            return i2;
        }

        static /* synthetic */ int l(d dVar, int i) {
            int i2 = dVar.e + i;
            dVar.e = i2;
            return i2;
        }

        static /* synthetic */ int m(d dVar, int i) {
            int i2 = dVar.h + i;
            dVar.h = i2;
            return i2;
        }

        static /* synthetic */ int n(d dVar, int i) {
            int i2 = dVar.ad + i;
            dVar.ad = i2;
            return i2;
        }

        static /* synthetic */ int o(d dVar) {
            int i = dVar.p;
            dVar.p = i + 1;
            return i;
        }

        static /* synthetic */ int o(d dVar, int i) {
            int i2 = dVar.l + i;
            dVar.l = i2;
            return i2;
        }

        static /* synthetic */ int q(d dVar, int i) {
            int i2 = dVar.z + i;
            dVar.z = i2;
            return i2;
        }

        static /* synthetic */ int r(d dVar) {
            int i = dVar.i;
            dVar.i = i + 1;
            return i;
        }

        static /* synthetic */ int s(d dVar) {
            int i = dVar.f;
            dVar.f = i + 1;
            return i;
        }

        static /* synthetic */ int t(d dVar, int i) {
            int i2 = dVar.w + i;
            dVar.w = i2;
            return i2;
        }

        static /* synthetic */ int v(d dVar) {
            int i = dVar.f50246c;
            dVar.f50246c = i + 1;
            return i;
        }

        static /* synthetic */ int z(d dVar) {
            int i = dVar.x;
            dVar.x = i + 1;
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        p();
        r();
        if (i == 0 && (obj instanceof List)) {
            List<SleepTotalData> list = (List) obj;
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", " handleWeekAndMonthData retListData.size = ", Integer.valueOf(list.size()));
            c(list);
            d dVar = new d(this, null);
            Iterator<SleepTotalData> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), dVar);
            }
            c(dVar);
            b(dVar);
        }
        if (commonUiBaseResponse != null) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "mDeepSleepHistogramData.size: ", Integer.valueOf(this.y.size()));
            commonUiBaseResponse.onResponse(i, this.y);
        }
    }

    private void b(SleepTotalData sleepTotalData, d dVar) {
        if (n()) {
            if (sleepTotalData.getType() == 31) {
                LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "is a Science Sleep data");
                e(sleepTotalData, dVar);
                if (sleepTotalData.getDeepSleepTime() > 0) {
                    d.e(dVar, sleepTotalData.getDeepSleepTime());
                    a(sleepTotalData, dVar);
                }
                if (sleepTotalData.getShallowSleepTime() > 0) {
                    d.b(dVar, sleepTotalData.getShallowSleepTime());
                    i(sleepTotalData, dVar);
                }
                if (sleepTotalData.getSlumberSleepTime() > 0) {
                    d.a(dVar, sleepTotalData.getSlumberSleepTime());
                    d.c(dVar, sleepTotalData.getSlumberSleepTime());
                    d.h(dVar);
                    d.i(dVar);
                }
                if (sleepTotalData.getScore() > 0) {
                    d.d(dVar, sleepTotalData.getScore());
                    d.k(dVar);
                }
                c(sleepTotalData, dVar);
                return;
            }
            return;
        }
        d(sleepTotalData, dVar);
    }

    private void i(SleepTotalData sleepTotalData, d dVar) {
        d.h(dVar, sleepTotalData.getShallowSleepTime());
        d.o(dVar);
        d.r(dVar);
    }

    private void a(SleepTotalData sleepTotalData, d dVar) {
        d.f(dVar, sleepTotalData.getDeepSleepTime());
        d.s(dVar);
        d.v(dVar);
    }

    private void b(d dVar) {
        float f = dVar.ah;
        float f2 = dVar.ag;
        float f3 = dVar.ae;
        if (dVar.f50246c > 0) {
            this.f50233b = Math.round(f / dVar.f50246c);
        }
        if (dVar.i > 0) {
            this.d = Math.round(f2 / dVar.i);
        }
        if (dVar.j > 0) {
            this.e = Math.round(f3 / dVar.j);
        }
        LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", "handleWeekAndMonthData:mTotalSleepTime = ", Integer.valueOf(dVar.v), " mDeepSleepTime = ", Integer.valueOf(dVar.o), " mShallowSleepTime = ", Integer.valueOf(dVar.r), " mDeepSleepPart = ", Integer.valueOf(dVar.g), " mWakeupDuration = ", Integer.valueOf(dVar.ac), " mWakeupTimes = ", Integer.valueOf(dVar.ad), " mScore = ", Integer.valueOf(dVar.t), " mBreathQualityData = ", Integer.valueOf(dVar.e), " mDaySleepTime = ", Integer.valueOf(dVar.h), " mDailyTotalSleepTime = ", Integer.valueOf(this.t), " mDailyDeepSleepTime = ", Integer.valueOf(this.i), " mDailyShallowSleepTime = ", Integer.valueOf(this.o), " mDailySleepPart = ", Integer.valueOf(this.l), " mDailyWakeupTimes = ", Integer.valueOf(this.q), " mDailyScore = ", Integer.valueOf(this.n), " mDailyBreathQuality = ", Integer.valueOf(this.g), " mDailyNoonSleepTime = ", Integer.valueOf(this.m), " mDailyFallTime = ", Integer.valueOf(this.j), " mDailyWakeUpTime = ", Integer.valueOf(this.s), " mDailyFallScore = ", Integer.valueOf(this.h), " mDailyWakeUpScore = ", Integer.valueOf(this.r));
    }

    private void c(d dVar) {
        this.t = dVar.v;
        if (dVar.x > 0) {
            this.t = Math.round(dVar.v / dVar.x);
        }
        this.i = dVar.o;
        if (dVar.f > 0) {
            this.i = Math.round(dVar.o / dVar.f);
        }
        this.o = dVar.r;
        if (dVar.p > 0) {
            this.o = Math.round(dVar.r / dVar.p);
        }
        this.l = dVar.g;
        if (dVar.s > 0) {
            this.l = Math.round(dVar.g / dVar.s);
        }
        this.q = dVar.aa > 0 ? Math.round(dVar.ad / dVar.aa) : dVar.ad;
        this.k = dVar.y > 0 ? Math.round(dVar.u / dVar.y) : dVar.u;
        this.n = dVar.q > 0 ? Math.round(dVar.t / dVar.q) : dVar.t;
        this.g = dVar.e;
        if (dVar.f50244a > 0) {
            this.g = Math.round(dVar.e / dVar.f50244a);
        }
        this.m = dVar.h;
        if (dVar.n > 0) {
            this.m = Math.round(dVar.h / dVar.n);
        }
        this.j = dVar.l;
        if (dVar.k > 0) {
            int iRound = Math.round(dVar.l / dVar.k);
            int i = iRound + 1200;
            this.j = i;
            if (i > 1440) {
                this.j = iRound - 240;
            }
            this.h = Math.round(dVar.m / dVar.k);
        }
        this.s = dVar.z;
        if (dVar.ab > 0) {
            int iRound2 = Math.round(dVar.z / dVar.ab);
            int i2 = iRound2 + 1200;
            this.s = i2;
            if (i2 > 1440) {
                this.s = iRound2 - 240;
            }
            this.r = Math.round(dVar.w / dVar.ab);
        }
    }

    private void d(SleepTotalData sleepTotalData, d dVar) {
        if (sleepTotalData.getTotalSleepTime() > 0) {
            d.i(dVar, sleepTotalData.getTotalSleepTime());
            d.z(dVar);
        }
        if (sleepTotalData.getDeepSleepTime() > 0) {
            d.f(dVar, sleepTotalData.getDeepSleepTime());
            d.s(dVar);
        }
        if (sleepTotalData.getShallowSleepTime() > 0) {
            d.h(dVar, sleepTotalData.getShallowSleepTime());
            d.o(dVar);
        }
        if (sleepTotalData.getWakeupDuration() >= 0) {
            d.g(dVar, sleepTotalData.getWakeupDuration());
            this.az = dVar.ac;
        }
        if (sleepTotalData.getWakeupTimes() > 0) {
            d.n(dVar, sleepTotalData.getWakeupTimes());
            d.ah(dVar);
        }
    }

    private void c(SleepTotalData sleepTotalData, d dVar) {
        int snoreFreq = sleepTotalData.getSnoreFreq();
        if (snoreFreq < 10) {
            dVar.d = 100 - (snoreFreq * 2);
        } else {
            dVar.d = 90 - snoreFreq;
        }
        if (dVar.d < 0 || (snoreFreq == 0 && sleepTotalData.getSlumberSleepTime() == 0)) {
            dVar.d = 0;
        }
        if (dVar.d > 0) {
            d.l(dVar, dVar.d);
            d.ai(dVar);
        }
    }

    private void e(SleepTotalData sleepTotalData, d dVar) {
        if (sleepTotalData.getTotalSleepTime() > 0) {
            d.i(dVar, sleepTotalData.getTotalSleepTime());
            d.z(dVar);
        }
        if (sleepTotalData.getDeepSleepPart() >= 20) {
            d.j(dVar, sleepTotalData.getDeepSleepPart());
            d.af(dVar);
        }
        if (sleepTotalData.getWakeupDuration() >= 0 && sleepTotalData.getTotalSleepTime() > 0) {
            d.g(dVar, sleepTotalData.getWakeupDuration());
            this.az = dVar.ac;
        }
        if (sleepTotalData.getWakeupTimes() > 0 && sleepTotalData.getTotalSleepTime() > 0) {
            d.n(dVar, sleepTotalData.getWakeupTimes());
            d.ah(dVar);
        }
        if (sleepTotalData.getNoonSleepTime() > 0) {
            d.m(dVar, sleepTotalData.getNoonSleepTime());
            d.am(dVar);
        }
        if (sleepTotalData.getFallTime() > 0) {
            int fallTime = sleepTotalData.getFallTime();
            int i = fallTime + 1200;
            if (i > 1440) {
                i = fallTime - 240;
            }
            d.o(dVar, sleepTotalData.getFallTime());
            int i2 = i - this.f50234c;
            d.k(dVar, i2 * i2);
            d.an(dVar);
        }
        if (sleepTotalData.getWakeUpTime() > 0) {
            int wakeUpTime = sleepTotalData.getWakeUpTime();
            int i3 = wakeUpTime + 1200;
            if (i3 > 1440) {
                i3 = wakeUpTime - 240;
            }
            d.q(dVar, sleepTotalData.getWakeUpTime());
            int i4 = i3 - this.f50232a;
            d.t(dVar, i4 * i4);
            d.ar(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082 A[SYNTHETIC] */
    public void c(int i, Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        o();
        if (i == 0 && (obj instanceof List)) {
            List<SleepTotalData> list = (List) obj;
            LogUtil.d("UIHLH_FitnessOldCoreSleepDetailInteractor", " handleDayData retListData.size = ", Integer.valueOf(list.size()));
            if (list.isEmpty()) {
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                SleepTotalData sleepTotalData = list.get(i3);
                if (sleepTotalData.getDeepSleepTime() == 1) {
                    this.p = 65;
                    this.ai = true;
                } else if (sleepTotalData.getShallowSleepTime() == 1) {
                    this.p = 66;
                    this.ai = true;
                } else if (sleepTotalData.getWakeupDuration() == 1) {
                    this.p = 67;
                    this.ai = true;
                } else if (sleepTotalData.getSlumberSleepTime() == 1) {
                    this.p = 68;
                    this.ai = true;
                } else {
                    if (sleepTotalData.getNoonSleepTime() == 1) {
                        this.p = 69;
                        this.ai = true;
                    } else {
                        this.p = 0;
                    }
                    d(list, i3, sleepTotalData);
                    if (i3 == 0) {
                        b(sleepTotalData);
                    }
                }
                i2 = i3;
                d(list, i3, sleepTotalData);
                if (i3 == 0) {
                    b(sleepTotalData);
                }
            }
            if (njy.c(list, i2)) {
                this.ac = list.get(i2).getDeviceType();
            }
            d(i, this.ai, this.u, commonUiBaseResponse);
        }
    }

    private void o() {
        this.ac = 0;
        this.aj.clear();
        this.ak = 0;
        this.x = new uig();
        this.p = 0;
        this.ai = false;
        this.u = new ArrayList(16);
    }

    private void d(List<SleepTotalData> list, int i, SleepTotalData sleepTotalData) {
        if (this.x.e() != -1 && this.x.b() != -1) {
            if (this.p != this.x.e()) {
                this.x.e(i);
                this.u.add(this.x);
                this.x = new uig();
                if (this.ac == 0) {
                    this.ac = sleepTotalData.getDeviceType();
                }
            }
            if (i == list.size() - 1 && this.x.e() != -1) {
                this.x.e(ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL);
                if (this.ac == 0) {
                    this.ac = sleepTotalData.getDeviceType();
                }
                this.u.add(this.x);
            }
        }
        if (this.x.b() != -1 || this.p == 0) {
            return;
        }
        this.x.b(i);
        this.x.a(this.p);
    }

    private void b(SleepTotalData sleepTotalData) {
        long j;
        long j2;
        String str;
        String noonStartTime = sleepTotalData.getNoonStartTime();
        String noonEndTime = sleepTotalData.getNoonEndTime();
        String strB = wud.b(this.f);
        if (TextUtils.isEmpty(noonStartTime) || TextUtils.isEmpty(noonEndTime)) {
            return;
        }
        String[] strArrSplit = noonEndTime.split(",");
        String[] strArrSplit2 = noonStartTime.split(",");
        if (strArrSplit.length == 1) {
            try {
                j = Long.parseLong(strArrSplit2[0]);
                try {
                    j2 = Long.parseLong(strArrSplit[0]);
                } catch (NumberFormatException e2) {
                    e = e2;
                    LogUtil.e("UIHLH_FitnessOldCoreSleepDetailInteractor", "NumberFormatException", e.getMessage());
                    j2 = 0;
                }
            } catch (NumberFormatException e3) {
                e = e3;
                j = 0;
            }
            long j3 = (j2 - j) / 60000;
            long j4 = j3 / 60;
            long j5 = j2;
            String strE = UnitUtil.e(j4, 1, 0);
            String strE2 = UnitUtil.e(j3 % 60, 1, 0);
            if (j4 == 0) {
                str = wud.e(j) + strB + wud.e(j5) + "   " + this.f.getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, strE2);
            } else {
                str = wud.e(j) + strB + wud.e(j5) + "   " + this.f.getString(R.string.IDS_h_min_unit, strE, strE2);
            }
            this.aj.add(str);
            this.ak = (int) j3;
            return;
        }
        d(strArrSplit, strArrSplit2);
    }

    private void d(String[] strArr, String[] strArr2) {
        long j;
        long j2;
        String strB = wud.b(this.f);
        for (int i = 0; i < strArr.length; i++) {
            try {
                j = Long.parseLong(strArr2[i]);
                try {
                    j2 = Long.parseLong(strArr[i]);
                } catch (NumberFormatException e2) {
                    e = e2;
                    LogUtil.e("UIHLH_FitnessOldCoreSleepDetailInteractor", "NumberFormatException", e.getMessage());
                    j2 = 0;
                }
            } catch (NumberFormatException e3) {
                e = e3;
                j = 0;
            }
            long j3 = (j2 - j) / 60000;
            long j4 = j3 / 60;
            String strE = UnitUtil.e(j4, 1, 0);
            String strE2 = UnitUtil.e(j3 % 60, 1, 0);
            this.aj.add(j4 == 0 ? wud.e(j) + strB + wud.e(j2) + "   " + this.f.getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, strE2) : wud.e(j) + strB + wud.e(j2) + "   " + this.f.getString(R.string.IDS_h_min_unit, strE, strE2));
            this.ak += (int) j3;
        }
    }

    private void d(int i, boolean z, List<uig> list, CommonUiBaseResponse commonUiBaseResponse) {
        ArrayList arrayList;
        if (list == null || list.size() <= 0) {
            arrayList = new ArrayList(16);
        } else {
            arrayList = new ArrayList(list);
        }
        if (z) {
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "dealIfHaveSleepData daySleepHistogramData.size =", Integer.valueOf(arrayList.size()));
            e(arrayList);
            a(arrayList);
        } else {
            arrayList.clear();
            a(arrayList);
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(i, arrayList);
        }
    }

    static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f50247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<ujk> f50248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FitnessDataQueryDefine.FitnessQueryId f50249c;
        private final CommonUiBaseResponse d;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        /* synthetic */ e(ujk ujkVar, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, long j, CommonUiBaseResponse commonUiBaseResponse, AnonymousClass5 anonymousClass5) {
            this(ujkVar, fitnessQueryId, j, commonUiBaseResponse);
        }

        private e(ujk ujkVar, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, long j, CommonUiBaseResponse commonUiBaseResponse) {
            this.f50248b = new WeakReference<>(ujkVar);
            this.f50249c = fitnessQueryId;
            this.f50247a = j;
            this.d = commonUiBaseResponse;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            if (this.f50248b.get() == null) {
                return;
            }
            ujk ujkVar = this.f50248b.get();
            if (njy.e(list)) {
                LogUtil.j("UIHLH_FitnessOldCoreSleepDetailInteractor", "getWeekBaseTime datas is empty");
                ujkVar.q();
                ujkVar.a(this.f50247a, this.f50249c, this.d);
                return;
            }
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "getWeekBaseTime sumDataList = ", Integer.valueOf(list.size()));
            int iB = 0;
            int iB2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (HiHealthData hiHealthData : list) {
                double d = hiHealthData.getDouble("core_sleep_fall_key");
                if (d != 0.0d) {
                    i3++;
                    iB += qqk.b(d, hiHealthData.getTimeZone(), 1);
                }
                double d2 = hiHealthData.getDouble("core_sleep_wake_up_key");
                if (d2 != 0.0d) {
                    i4++;
                    iB2 += qqk.b(d2, hiHealthData.getTimeZone(), 1);
                }
            }
            ujkVar.f50234c = iB;
            ujkVar.f50232a = iB2;
            ujkVar.d(i3, i4);
            LogUtil.a("UIHLH_FitnessOldCoreSleepDetailInteractor", "mBaseTimeWakeUp = ", Integer.valueOf(ujkVar.f50232a), " mBaseTimeFall = ", Integer.valueOf(ujkVar.f50234c));
            ujkVar.a(this.f50247a, this.f50249c, this.d);
        }
    }
}
