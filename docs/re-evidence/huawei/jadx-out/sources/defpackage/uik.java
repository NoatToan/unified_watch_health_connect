package defpackage;

import android.content.Context;
import android.os.BadParcelableException;
import android.text.TextUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.health.sport.utils.FitnessDataQueryDefine;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.ResultUtils;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepTotalData;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class uik {
    private static final Object d = new Object();
    private boolean m;
    private gxq r;
    private Map<String, SleepViewConstants.SleepTypeEnum> e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f50139c = new ConcurrentHashMap();
    private Map<String, String> q = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f50138b = new ConcurrentHashMap();
    private CopyOnWriteArrayList<uig> g = new CopyOnWriteArrayList<>();
    private gxq v = new gxq(SleepViewConstants.ViewTypeEnum.UNKNOWN);
    private volatile int j = 0;
    private volatile String f = "";
    private Set<String> i = new HashSet();
    private String n = "";
    private String aa = "";
    private boolean s = false;
    private volatile boolean t = false;
    private volatile boolean k = false;
    private volatile boolean o = false;
    private List<String> u = new ArrayList(16);
    private List<uig> h = new ArrayList(16);
    private List<uig> x = new ArrayList(16);
    private List<uig> z = new ArrayList(16);
    private List<uig> y = new ArrayList(16);
    private List<uig> p = new ArrayList(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f50137a = BaseApplication.getContext();
    private uje l = new uje();
    private ujb w = ujb.b(this.f50137a);

    public List<String> f() {
        return (List) ResultUtils.c(this.u);
    }

    public void b(Date[] dateArr, String str, int i, boolean z, CommonUiBaseResponse commonUiBaseResponse) {
        if (dateArr == null || dateArr.length != 2) {
            LogUtil.j("FitnessCoreSleepDetailInteractor", "time range is invalid");
            return;
        }
        Date date = dateArr[0];
        Date date2 = dateArr[1];
        ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "requestCoreSleepDetailUiData paraUiDataType = ", Integer.valueOf(i), " startTime is ", date, " endTime is ", date2, " isUseCache ", Boolean.valueOf(z));
        this.k = false;
        this.t = false;
        this.o = false;
        if (i == 1) {
            e(date, z, commonUiBaseResponse);
            return;
        }
        if (i == 2) {
            d(date, date2, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_HISTOGRAM, commonUiBaseResponse);
            c(date, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_WEEK_HISTOGRAM, new a(str));
        } else if (i == 3) {
            d(date, date2, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_HISTOGRAM, commonUiBaseResponse);
            c(date, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_MONTH_HISTOGRAM, new a(str));
        } else {
            if (i != 4) {
                return;
            }
            d(date, date2, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_HISTOGRAM, commonUiBaseResponse);
            c(date, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_YEAR_HISTOGRAM, new a(str));
        }
    }

    class a implements CommonUiBaseResponse {
        private String d;

        public a(String str) {
            this.d = str;
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "SleepDeviceResponse ", obj);
            if (obj instanceof Map) {
                Map map = (Map) obj;
                ObserverManagerUtil.e("SLEEP_DEVICE_LIST" + this.d, uzo.c((List<HiHealthClient>) map.get("core"), (List<HiHealthClient>) map.get("normal")));
            }
        }
    }

    public void d(Date date, Date date2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", "requestCoreSleepDetail startTime = ", date);
        gwa.c().e(date, date2, new int[]{3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 3}, iBaseResponseCallback);
    }

    private void e(final Date date, final boolean z, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", "handleDayType enter, start time = ", date);
        final ujd ujdVar = new ujd();
        e(date, ujdVar, commonUiBaseResponse);
        c(date, ujdVar, z, commonUiBaseResponse);
        final List<uif> listB = gwb.b(date);
        c(z, listB, commonUiBaseResponse, ujdVar);
        c(date, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DAY_HISTOGRAM, new CommonUiBaseResponse() { // from class: uik.5
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                uik.this.o = true;
                CopyOnWriteArrayList<uif> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    List list = (List) map.get("core");
                    uzo.b((List<HiHealthClient>) list);
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>(uzo.c((List<HiHealthClient>) list, (List<HiHealthClient>) map.get("normal")));
                }
                if (copyOnWriteArrayList.size() == 1) {
                    copyOnWriteArrayList.clear();
                    LogUtil.a("FitnessCoreSleepDetailInteractor", "only one device not show icon");
                }
                LogUtil.a("FitnessCoreSleepDetailInteractor", "day device got ", copyOnWriteArrayList);
                if (z && gwb.c(listB, copyOnWriteArrayList)) {
                    gwb.b(date, copyOnWriteArrayList);
                    ujdVar.c(copyOnWriteArrayList);
                    uik.this.e(commonUiBaseResponse, 100, ujdVar);
                } else {
                    if (z) {
                        return;
                    }
                    ujdVar.c(copyOnWriteArrayList);
                    uik.this.e(commonUiBaseResponse, 100, ujdVar);
                }
            }
        });
    }

    private void c(boolean z, List<uif> list, CommonUiBaseResponse commonUiBaseResponse, ujd ujdVar) {
        if (njy.b(list) && z) {
            this.o = true;
            CopyOnWriteArrayList<uif> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.addAll(list);
            LogUtil.a("FitnessCoreSleepDetailInteractor", "day device got cache ", copyOnWriteArrayList);
            ujdVar.c(copyOnWriteArrayList);
            e(commonUiBaseResponse, 100, ujdVar);
        }
    }

    private void e(Date date, final ujd ujdVar, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", "go req detail");
        e(date, date, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_HISTOGRAM, new CommonUiBaseResponse() { // from class: uik.2
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("FitnessCoreSleepDetailInteractor", "requestCoreSleepHistogramData back,errorCode = ", Integer.valueOf(i));
                uik.this.k = true;
                LogUtil.a("FitnessCoreSleepDetailInteractor", "isDetailBack ", Boolean.valueOf(uik.this.k), "isStatBack ", Boolean.valueOf(uik.this.t));
                CopyOnWriteArrayList<uig> copyOnWriteArrayList = (CopyOnWriteArrayList) obj;
                if (!njy.b(copyOnWriteArrayList)) {
                    ujdVar.b(new CopyOnWriteArrayList<>());
                    LogUtil.e("FitnessCoreSleepDetailInteractor", "sleepViewDataList is null");
                } else {
                    ujdVar.b(copyOnWriteArrayList);
                }
                uik.this.e(commonUiBaseResponse, i, ujdVar);
            }
        });
    }

    private void c(Date date, final ujd ujdVar, boolean z, final CommonUiBaseResponse commonUiBaseResponse) {
        d(date, z, new CommonUiBaseResponse() { // from class: uik.4
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("FitnessCoreSleepDetailInteractor", "requestCoreSleepDayTotalData back, errorCode = ", Integer.valueOf(i));
                uik.this.t = true;
                LogUtil.a("FitnessCoreSleepDetailInteractor", "isDetailBack ", Boolean.valueOf(uik.this.k), "isStatBack ", Boolean.valueOf(uik.this.t));
                List list = (List) obj;
                if (!njy.b(list)) {
                    ujdVar.e(new gxq(SleepViewConstants.ViewTypeEnum.DAY));
                    LogUtil.e("FitnessCoreSleepDetailInteractor", "sleepViewDataList is null");
                } else {
                    try {
                        ujdVar.e(((gxq) list.get(0)).clone());
                    } catch (ClassCastException unused) {
                        LogUtil.e("FitnessCoreSleepDetailInteractor", "after reconstruct, type is changed");
                    }
                }
                uik.this.e(commonUiBaseResponse, i, ujdVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CommonUiBaseResponse commonUiBaseResponse, int i, ujd ujdVar) {
        if (this.o && i == 100) {
            this.o = false;
            e(ujdVar);
            commonUiBaseResponse.onResponse(i, ujdVar);
        } else if (this.k && this.t && commonUiBaseResponse != null) {
            e(ujdVar);
            commonUiBaseResponse.onResponse(i, ujdVar);
        }
    }

    private void e(ujd ujdVar) {
        ujdVar.e(this.f);
        ujdVar.c(this.i);
        ujdVar.e(this.j);
        ujdVar.c(f());
        ujdVar.b(this.s);
    }

    private void d(Date date, Date date2, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", "handleWeekMonthYearType enter, start time = ", date);
        e(date, date2, fitnessQueryId, new CommonUiBaseResponse() { // from class: uik.3
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "handleWeekMonthYearType histogram back, errorCode = ", Integer.valueOf(i));
                CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                if (commonUiBaseResponse2 != null) {
                    commonUiBaseResponse2.onResponse(i, obj);
                }
            }
        });
    }

    private void c(List<gxq> list) {
        if (list != null) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "Enter processSleepHistogramData paramListData.size: ", Integer.valueOf(list.size()));
            for (int i = 0; i < list.size(); i++) {
                gxq gxqVar = list.get(i);
                a(i, gxqVar);
                LogUtil.a("FitnessCoreSleepDetailInteractor", "sleepTotalData.getType():", gxqVar.n());
            }
            return;
        }
        LogUtil.a("FitnessCoreSleepDetailInteractor", "paramListData is null! ");
    }

    private void a(int i, gxq gxqVar) {
        gxi gxiVarB;
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            gxiVarB = gxqVar.g();
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            gxiVarB = gxqVar.h();
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            gxiVarB = gxqVar.k();
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            gxiVarB = gxqVar.b();
        } else {
            LogUtil.e("FitnessCoreSleepDetailInteractor", "wrong type: ", gxqVar.n());
            return;
        }
        uig uigVar = new uig();
        uigVar.b(i);
        int i2 = i + 1;
        uigVar.e(i2);
        uigVar.c(gxiVarB.j());
        uigVar.b(gxiVarB.b());
        uigVar.d(gxiVarB.l());
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
        int[] iArr = new int[5];
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iArr[0] = gxqVar.g().q();
            iArr[1] = gxqVar.g().y();
            iArr[2] = gxqVar.g().u();
            iArr[4] = gxqVar.g().aa();
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            iArr[0] = gxqVar.k().u();
            iArr[1] = gxqVar.k().aw();
            iArr[2] = gxqVar.k().ar();
            iArr[3] = gxqVar.k().ap();
            iArr[4] = gxqVar.k().ba();
        } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            iArr[0] = gxqVar.k().u();
            iArr[1] = gxqVar.k().aw();
            iArr[4] = gxqVar.k().ba();
        }
        uigVar.a(iArr[0]);
        this.h.add(uigVar);
        uigVar3.a(iArr[1]);
        this.x.add(uigVar3);
        uigVar2.a(iArr[2]);
        this.p.add(uigVar2);
        uigVar4.a(iArr[3]);
        this.y.add(uigVar4);
        uigVar5.a(iArr[4]);
        this.z.add(uigVar5);
    }

    private void c(List<gxq> list, boolean z, CommonUiBaseResponse commonUiBaseResponse) {
        if (z && a(list) && commonUiBaseResponse != null) {
            r();
            d(list);
            commonUiBaseResponse.onResponse(0, list);
            LogUtil.a("FitnessCoreSleepDetailInteractor", "querySummaryData use cache, sleepViewData is ", this.v.toString());
        }
    }

    public void d(Date date, final boolean z, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.d("FitnessCoreSleepDetailInteractor", "requestCoreSleepDayTotalData, start time = ", date);
        final String strValueOf = String.valueOf(DateFormatUtil.a(date.getTime()));
        final List<gxq> listB = gwb.b(strValueOf);
        c(listB, z, commonUiBaseResponse);
        a(date, date, FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC, FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_UNSPECIFIC_SLEEP_TIME, new CommonUiBaseResponse() { // from class: uik.9
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "requestGetCoreSleepDetailData errorCode = ", Integer.valueOf(i));
                if (commonUiBaseResponse != null) {
                    uik.this.r();
                    if (i == 0 && obj != null) {
                        List list = (List) obj;
                        if (njy.b(list)) {
                            uik.this.d((List<gxq>) list);
                        }
                        LogUtil.a("FitnessCoreSleepDetailInteractor", "request summary data back,", uik.this.v.toString());
                        if (z) {
                            try {
                                if (!gwb.c(listB, list)) {
                                    if (uik.this.a((List<gxq>) listB)) {
                                        uik.this.d((List<gxq>) listB);
                                        LogUtil.a("FitnessCoreSleepDetailInteractor", "summary data is the same with sleepDetailData");
                                        return;
                                    }
                                }
                            } catch (BadParcelableException unused) {
                                LogUtil.e("FitnessCoreSleepDetailInteractor", "BadParcelableException ex");
                            }
                            LogUtil.a("FitnessCoreSleepDetailInteractor", "summary data is different from sleepDetailData");
                            gwb.e(strValueOf, (List<gxq>) list);
                            commonUiBaseResponse.onResponse(i, obj);
                            return;
                        }
                    } else {
                        LogUtil.a("FitnessCoreSleepDetailInteractor", "requestGetCoreSleepDetailData else.");
                    }
                    LogUtil.d("FitnessCoreSleepDetailInteractor", "updateResponse.onResponse !");
                    commonUiBaseResponse.onResponse(i, obj);
                    return;
                }
                LogUtil.d("FitnessCoreSleepDetailInteractor", "updateResponse is null");
            }
        });
        LogUtil.a("FitnessCoreSleepDetailInteractor", "Leave requestSleepDetailTotalData.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<gxq> list) {
        return njy.b(list) && list.get(0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<gxq> list) {
        try {
            this.v = list.get(0);
        } catch (ClassCastException unused) {
            LogUtil.e("FitnessCoreSleepDetailInteractor", "after reconstruct, type is changed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.v = new gxq(SleepViewConstants.ViewTypeEnum.UNKNOWN);
        LogUtil.a("FitnessCoreSleepDetailInteractor", "resetSleepTotalData");
    }

    public Map<String, SleepViewConstants.SleepTypeEnum> b() {
        return this.e;
    }

    public Map<String, Integer> e() {
        return this.f50139c;
    }

    public Map<String, String> h() {
        return this.q;
    }

    public Map<String, Boolean> a() {
        return this.f50138b;
    }

    public List<uig> d() {
        return (List) ResultUtils.c(this.h);
    }

    public List<uig> i() {
        return (List) ResultUtils.c(this.x);
    }

    public List<uig> k() {
        return (List) ResultUtils.c(this.z);
    }

    public List<uig> o() {
        return (List) ResultUtils.c(this.y);
    }

    public List<uig> j() {
        return (List) ResultUtils.c(this.p);
    }

    public void b(Date date, int i, int i2, final CommonUiBaseResponse commonUiBaseResponse) {
        if (this.w != null) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "enter requestSleepSuggestString()");
            this.w.c(date, i, i2, new CommonUiBaseResponse() { // from class: uii
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public final void onResponse(int i3, Object obj) {
                    this.f50135c.e(commonUiBaseResponse, i3, obj);
                }
            });
        }
        LogUtil.d("FitnessCoreSleepDetailInteractor", "leave getSleepSuggestString()");
    }

    /* synthetic */ void e(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", "getSleepAdvice day or week");
        e(i, obj, commonUiBaseResponse);
    }

    public void c(Date date, Date date2, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        if (this.w != null) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "enter requestSleepMonthSuggestString()");
            this.w.e(date, date2, i, new CommonUiBaseResponse() { // from class: uij
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public final void onResponse(int i2, Object obj) {
                    this.f50136a.b(commonUiBaseResponse, i2, obj);
                }
            });
        }
        LogUtil.d("FitnessCoreSleepDetailInteractor", "leave getSleepSuggestString()");
    }

    /* synthetic */ void b(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", "getSleepAdvice month");
        e(i, obj, commonUiBaseResponse);
    }

    private void e(int i, Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        HashMap map = new HashMap();
        if (i == 0 && (obj instanceof CoreSleepTotalData)) {
            CoreSleepTotalData coreSleepTotalData = (CoreSleepTotalData) obj;
            map.put("SUGGEST_TITLE", d(coreSleepTotalData.getAdNum0(), coreSleepTotalData));
            map.put("SUGGEST_CONTENT", this.l.h(coreSleepTotalData.getAdNum1()));
        } else {
            map.put("SUGGEST_TITLE", "");
            map.put("SUGGEST_CONTENT", "");
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(i, map);
        }
    }

    private String d(int i, CoreSleepTotalData coreSleepTotalData) {
        if (i < 12000) {
            return d(i);
        }
        return e(i, coreSleepTotalData);
    }

    private String e(int i, CoreSleepTotalData coreSleepTotalData) {
        if (coreSleepTotalData == null) {
            return "";
        }
        switch ((i % 1000) / 100) {
            case 0:
                return this.f50137a.getResources().getString(uix.b(i), this.l.b(2));
            case 1:
                return this.l.d(i, coreSleepTotalData);
            case 2:
                return this.l.j(i, coreSleepTotalData);
            case 3:
                return this.l.h(i, coreSleepTotalData);
            case 4:
                return this.l.c(i, coreSleepTotalData);
            case 5:
                return this.l.b(i, coreSleepTotalData);
            case 6:
                return this.l.i(i, coreSleepTotalData);
            case 7:
                return this.l.a(i, coreSleepTotalData);
            case 8:
                return this.l.c(i, coreSleepTotalData, this.v.k().i(), this.v.k().aq());
            case 9:
                return this.l.e(i, coreSleepTotalData);
            default:
                return this.f50137a.getResources().getString(uix.b(i));
        }
    }

    private String d(int i) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", " combineDayString index = ", Integer.valueOf(i));
        String string = this.f50137a.getResources().getString(uix.b(i));
        if (a(i, uix.i())) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", " ContainIndex totalSleepIndex");
            return String.format(string, wud.c(gwc.b(this.v).i()));
        }
        if (a(i, uix.b())) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", " ContainIndex dreamRateIndex");
            return String.format(string, UnitUtil.e(this.v.k().ao(), 2, 0));
        }
        if (a(i, uix.a())) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", " ContainIndex fallAsleepIndex");
            return String.format(string, this.n);
        }
        if (a(i, uix.f())) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", " ContainIndex wakeIndex");
            if (this.m) {
                LogUtil.a("FitnessCoreSleepDetailInteractor", "late with 8:00");
                return "";
            }
            return String.format(string, this.aa);
        }
        if (a(i, uix.j())) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", " ContainIndex wakeUpTimesIndex");
            String quantityString = this.f50137a.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, n(), UnitUtil.e(n(), 1, 0));
            LogUtil.a("FitnessCoreSleepDetailInteractor", "wakeUpTimes: ", quantityString);
            return String.format(string, quantityString);
        }
        if (a(i, uix.c())) {
            if (LanguageUtil.br(this.f50137a) || LanguageUtil.x(this.f50137a)) {
                StringBuffer stringBuffer = new StringBuffer(UnitUtil.e(l(), 1, 0));
                stringBuffer.insert(0, "%");
                return String.format(string, stringBuffer);
            }
            return String.format(string, UnitUtil.e(l(), 2, 0));
        }
        if (a(i, uix.d())) {
            return String.format(string, UnitUtil.e(0.0d, 1, 0));
        }
        if (!a(i, uix.e())) {
            return string;
        }
        return String.format(string, UnitUtil.e(this.v.k().x(), 1, 0) + " " + this.f50137a.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, this.v.k().x()));
    }

    private int l() {
        if (this.v.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            return this.v.g().s();
        }
        if (this.v.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            return this.v.b().s();
        }
        if (this.v.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            return this.v.k().w();
        }
        return 0;
    }

    private int n() {
        if (this.v.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            return this.v.g().z();
        }
        if (this.v.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            return this.v.k().bb();
        }
        if (this.v.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            return this.v.b().p();
        }
        return 0;
    }

    private boolean a(int i, int[] iArr) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", " isContainIndex()  targetIndex = ", Integer.valueOf(i));
        for (int i2 : iArr) {
            if (i == i2) {
                LogUtil.a("FitnessCoreSleepDetailInteractor", " isContainIndex()  return true ");
                return true;
            }
        }
        LogUtil.a("FitnessCoreSleepDetailInteractor", " isContainIndex()  return false ");
        return false;
    }

    private void e(List<uig> list) {
        this.n = "";
        this.aa = "";
        if (list == null || list.size() == 0) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "sleepHistogramData size = 0");
            return;
        }
        Map<String, Integer> mapE = uje.e(list);
        if (mapE == null) {
            LogUtil.j("FitnessCoreSleepDetailInteractor", "timeMap is null!");
            return;
        }
        int iIntValue = mapE.get("core_sleep_start_time_key").intValue();
        int i = iIntValue / 60;
        int i2 = i + 20;
        if (i2 >= 24) {
            i2 = i - 4;
        }
        String strA = wud.a(wud.r(i2) + ":" + wud.r(iIntValue % 60));
        this.n = strA;
        LogUtil.d("FitnessCoreSleepDetailInteractor", "advice mFallAsleepTime = ", strA);
        int iIntValue2 = mapE.get("core_sleep_end_time_key").intValue();
        int i3 = iIntValue2 / 60;
        int i4 = i3 + 20;
        if (i4 >= 24) {
            i4 = i3 - 4;
        }
        String strA2 = wud.a(wud.r(i4) + ":" + wud.r(iIntValue2 % 60));
        this.aa = strA2;
        this.m = i4 >= 7;
        LogUtil.d("FitnessCoreSleepDetailInteractor", "advice mWakeTime = ", strA2);
    }

    private void e(Date date, final Date date2, final FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, final CommonUiBaseResponse commonUiBaseResponse) {
        Date date3;
        if (fitnessQueryId == FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_HISTOGRAM) {
            date3 = new Date(lsl.d(date.getTime(), -7));
        } else {
            if (fitnessQueryId == FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_HISTOGRAM) {
                if (lsl.c(date.getTime(), lsl.p(date.getTime()))) {
                    date3 = new Date(lsl.x(date.getTime()));
                } else {
                    date3 = new Date(lsl.d(date.getTime(), -30));
                }
            }
            Date date4 = date;
            ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "getData queryId = ", fitnessQueryId, "getData paraStartTime = ", date4);
            a(date4, date2, fitnessQueryId, FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_UNSPECIFIC_SLEEP_TIME, new CommonUiBaseResponse() { // from class: uik.7
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i, Object obj) {
                    LogUtil.a("FitnessCoreSleepDetailInteractor", "getData response back.");
                    int i2 = AnonymousClass1.d[fitnessQueryId.ordinal()];
                    if (i2 == 1) {
                        uik.this.b(i, obj, commonUiBaseResponse);
                        return;
                    }
                    if (i2 == 2 || i2 == 3) {
                        uik.this.c(i, obj, date2.getTime(), commonUiBaseResponse);
                        return;
                    }
                    if (i2 == 4) {
                        uik.this.e(i, obj, fitnessQueryId, commonUiBaseResponse);
                        return;
                    }
                    CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                    if (commonUiBaseResponse2 != null) {
                        commonUiBaseResponse2.onResponse(i, obj);
                    }
                }
            });
        }
        date = date3;
        Date date5 = date;
        ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "getData queryId = ", fitnessQueryId, "getData paraStartTime = ", date5);
        a(date5, date2, fitnessQueryId, FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_UNSPECIFIC_SLEEP_TIME, new CommonUiBaseResponse() { // from class: uik.7
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("FitnessCoreSleepDetailInteractor", "getData response back.");
                int i2 = AnonymousClass1.d[fitnessQueryId.ordinal()];
                if (i2 == 1) {
                    uik.this.b(i, obj, commonUiBaseResponse);
                    return;
                }
                if (i2 == 2 || i2 == 3) {
                    uik.this.c(i, obj, date2.getTime(), commonUiBaseResponse);
                    return;
                }
                if (i2 == 4) {
                    uik.this.e(i, obj, fitnessQueryId, commonUiBaseResponse);
                    return;
                }
                CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                if (commonUiBaseResponse2 != null) {
                    commonUiBaseResponse2.onResponse(i, obj);
                }
            }
        });
    }

    public void a(Date date, Date date2, final FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, final FitnessDataQueryDefine.FitnessSleepTotalDataId fitnessSleepTotalDataId, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("FitnessCoreSleepDetailInteractor", "Enter requestGetCoreSleepDetailData");
        if (date == null || date2 == null) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "startTime or endtime is null");
            return;
        }
        synchronized (d) {
            int iA = FitnessDataQueryDefine.a(fitnessQueryId);
            int iE = FitnessDataQueryDefine.e(date.getTime(), fitnessQueryId);
            int iC = FitnessDataQueryDefine.c(fitnessQueryId);
            LogUtil.a("FitnessCoreSleepDetailInteractor", "requestGetCoreSleepDetailData queryID = " + fitnessQueryId + "unitSize = " + iE + "  unitCount = " + iC + "  unitType = " + iA);
            if (fitnessQueryId == FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_HISTOGRAM || fitnessQueryId == FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_HISTOGRAM) {
                iC = lsl.a(date.getTime(), date2.getTime());
                iE = ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
            }
            gwa.c().e(date, date2, new int[]{iA, iE, iC}, new IBaseResponseCallback() { // from class: uik.6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    uik.this.c(i, obj, fitnessQueryId, fitnessSleepTotalDataId, commonUiBaseResponse);
                }
            });
        }
        LogUtil.a("FitnessCoreSleepDetailInteractor", "Leave requestGetCoreSleepDetailData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, Object obj, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, FitnessDataQueryDefine.FitnessSleepTotalDataId fitnessSleepTotalDataId, CommonUiBaseResponse commonUiBaseResponse) {
        if (obj != null) {
            ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "requestResult onResponse objData != null");
        } else {
            ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "requestResult onResponse errCode = ", Integer.valueOf(i));
        }
        switch (AnonymousClass1.d[fitnessQueryId.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 13:
                if (commonUiBaseResponse != null) {
                    commonUiBaseResponse.onResponse(i, obj);
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                if (i == 0) {
                    LogUtil.a("FitnessCoreSleepDetailInteractor", "requestResult process getCoreSleepDetail");
                    if (obj != null) {
                        e(fitnessSleepTotalDataId, commonUiBaseResponse, obj);
                    }
                } else if (commonUiBaseResponse != null) {
                    LogUtil.a("FitnessCoreSleepDetailInteractor", "requestResult callback");
                    commonUiBaseResponse.onResponse(i, obj);
                }
                break;
            default:
                LogUtil.j("FitnessCoreSleepDetailInteractor", "requestResult process getCoreSleepDetail");
                break;
        }
    }

    private void e(FitnessDataQueryDefine.FitnessSleepTotalDataId fitnessSleepTotalDataId, CommonUiBaseResponse commonUiBaseResponse, Object obj) {
        int totalSleepTime;
        ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "Enter processFitnessSleepStatisticData");
        List list = (List) obj;
        int i = AnonymousClass1.f50140c[fitnessSleepTotalDataId.ordinal()];
        if (i == 1) {
            Iterator it = list.iterator();
            totalSleepTime = 0;
            while (it.hasNext()) {
                totalSleepTime += ((SleepTotalData) it.next()).getTotalSleepTime();
            }
            LogUtil.a("FitnessCoreSleepDetailInteractor", "FITNESS_TOTAL_SLEEP_TIME totalSleepTime = " + totalSleepTime);
        } else if (i != 2 && i != 3 && i != 4) {
            if (commonUiBaseResponse != null) {
                commonUiBaseResponse.onResponse(0, obj);
                return;
            }
            return;
        } else {
            Iterator it2 = list.iterator();
            totalSleepTime = 0;
            while (it2.hasNext()) {
                totalSleepTime += ((SleepTotalData) it2.next()).getTotalSleepTime();
            }
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(0, Integer.valueOf(totalSleepTime));
        }
        ReleaseLogUtil.d("R_Sleep_FitnessCoreSleepDetailInteractorFitnessCoreSleepDetailInteractor", "Leave processFitnessSleepStatisticData");
    }

    /* JADX INFO: renamed from: uik$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f50140c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[FitnessDataQueryDefine.FitnessSleepTotalDataId.values().length];
            f50140c = iArr;
            try {
                iArr[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_TOTAL_SLEEP_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50140c[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_DEEP_SLEEP_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50140c[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_SHALLOW_SLEEP_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50140c[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_WAKEUP_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50140c[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_UNSPECIFIC_SLEEP_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[FitnessDataQueryDefine.FitnessQueryId.values().length];
            d = iArr2;
            try {
                iArr2[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_HISTOGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_HISTOGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_HISTOGRAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_HISTOGRAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_STATISTIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_STATISTIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_STATISTIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC_DETAIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_STATISTIC_DETAIL.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_STATISTIC_DETAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_STATISTIC_DETAIL.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                d[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_UP_SLEEP_DETAIL.ordinal()] = 13;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private void q() {
        this.h.clear();
        this.x.clear();
        this.z.clear();
        this.y.clear();
        this.p.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, Object obj, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, CommonUiBaseResponse commonUiBaseResponse) {
        gxq gxqVar;
        DataInfos dataInfos;
        q();
        r();
        this.e.clear();
        if (i == 0 && (obj instanceof List)) {
            List<gxq> list = (List) obj;
            LogUtil.a("FitnessCoreSleepDetailInteractor", " handleWeekAndMonthData retListData.size = ", Integer.valueOf(list.size()));
            c(list);
            if (list.size() < 32) {
                gxqVar = new gxq(SleepViewConstants.ViewTypeEnum.MONTH);
                dataInfos = DataInfos.CoreSleepMonthDetail;
            } else {
                gxqVar = new gxq(SleepViewConstants.ViewTypeEnum.YEAR);
                dataInfos = DataInfos.CoreSleepYearDetail;
            }
            gxqVar.e(list);
            gxqVar.c();
            this.v = gxqVar;
            this.f50139c.clear();
            this.q.clear();
            this.f50138b.clear();
            this.e = gwc.c(list, this.f50139c, this.q, this.f50138b);
            ObserverManagerUtil.e("SLEEP_WEEK_MONTH_YEAR_AVERAGE_DAILY", Integer.valueOf(gwc.a(this.v)), dataInfos);
        }
        if (commonUiBaseResponse != null) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "mDeepSleepHistogramData.size: ", Integer.valueOf(this.h.size()));
            commonUiBaseResponse.onResponse(i, this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, Object obj, long j, CommonUiBaseResponse commonUiBaseResponse) {
        gxq gxqVar;
        gxq gxqVar2;
        DataInfos dataInfos;
        q();
        r();
        this.e.clear();
        this.f50139c.clear();
        this.q.clear();
        this.f50138b.clear();
        if (i == 0 && (obj instanceof List)) {
            List list = (List) obj;
            int size = list.size() / 2;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size2 = 7;
            if (size == 7) {
                gxqVar = new gxq(SleepViewConstants.ViewTypeEnum.WEEK);
                gxqVar2 = new gxq(SleepViewConstants.ViewTypeEnum.WEEK);
                dataInfos = DataInfos.CoreSleepWeekDetail;
            } else {
                size2 = list.size() - lsl.k(j);
                gxqVar = new gxq(SleepViewConstants.ViewTypeEnum.MONTH);
                gxqVar2 = new gxq(SleepViewConstants.ViewTypeEnum.MONTH);
                dataInfos = DataInfos.CoreSleepMonthDetail;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 < size2) {
                    arrayList.add((gxq) list.get(i2));
                } else {
                    arrayList2.add((gxq) list.get(i2));
                }
            }
            LogUtil.a("FitnessCoreSleepDetailInteractor", " handleWeekAndMonthLastData retListData.size = ", Integer.valueOf(arrayList2.size()), " alldata.size= ", Integer.valueOf(list.size()));
            gxqVar.e(arrayList2);
            gxqVar2.e(arrayList);
            c(arrayList2);
            this.e = gwc.c(arrayList2, this.f50139c, this.q, this.f50138b);
            gxqVar.c();
            gxqVar2.c();
            this.v = gxqVar;
            this.r = gxqVar2;
            ObserverManagerUtil.e("SLEEP_WEEK_MONTH_YEAR_AVERAGE_DAILY", Integer.valueOf(gwc.a(gxqVar)), dataInfos);
        }
        if (commonUiBaseResponse != null) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "mDeepSleepHistogramData.size: ", Integer.valueOf(this.h.size()));
            commonUiBaseResponse.onResponse(i, this.h);
        }
    }

    public gxq g() {
        return this.v;
    }

    public gxq c() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    public void b(int i, Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        m();
        ArrayList arrayList = new ArrayList(16);
        uig uigVar = new uig();
        this.i.clear();
        if (i == 0 && (obj instanceof List)) {
            List<HiHealthData> list = (List) obj;
            LogUtil.a("FitnessCoreSleepDetailInteractor", " handleDayData retListData.size = ", Integer.valueOf(list.size()));
            if (list.isEmpty()) {
                if (commonUiBaseResponse != null) {
                    commonUiBaseResponse.onResponse(i, new CopyOnWriteArrayList());
                    return;
                }
                return;
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            uig uigVarC = uigVar;
            boolean z3 = true;
            int i5 = 0;
            boolean z4 = false;
            int i6 = 0;
            while (i6 < list.size()) {
                HiHealthData hiHealthData = list.get(i6);
                this.s = hiHealthData.getBoolean("IS_SUSPICIOUS");
                if (hiHealthData.getInt("BED_TIME") == 1) {
                    i2 = 67;
                    i3 = i2;
                    i4 = i6;
                    z = true;
                    z2 = false;
                } else if (hiHealthData.getInt("SLEEP_TIME") != 1) {
                    if (hiHealthData.getInt("DEEP_SLEEP_TIME") == 1) {
                        i2 = 65;
                    } else if (hiHealthData.getInt("SHALLOW_SLEEP_TIME") == 1) {
                        i2 = 66;
                    } else if (hiHealthData.getInt("WAKE_UP_DURATION") == 1) {
                        i2 = 67;
                    } else if (hiHealthData.getInt("SLUMBER_SLEEP_TIME") == 1) {
                        i2 = 68;
                    } else if (hiHealthData.getInt("NOON_SLEEP_TIME") == 1) {
                        z2 = z3;
                        i3 = 69;
                        i4 = i6;
                        z = true;
                    } else {
                        z2 = z3;
                        i4 = i5;
                        z = z4;
                        i3 = 0;
                    }
                    i3 = i2;
                    i4 = i6;
                    z = true;
                    z2 = false;
                } else {
                    i2 = 66;
                    i3 = i2;
                    i4 = i6;
                    z = true;
                    z2 = false;
                }
                int i7 = i6;
                ArrayList arrayList2 = arrayList;
                int i8 = i4;
                uigVarC = c(list, i6, hiHealthData, arrayList, uigVarC, i3);
                if (i7 == 0) {
                    c(hiHealthData);
                }
                if (njy.c(list, i8)) {
                    String string = list.get(i8).getString("DEVICE_ID");
                    if (!TextUtils.isEmpty(string)) {
                        if (list.get(i8).getInt("NOON_SLEEP_TIME") == 1) {
                            hashSet.add(string);
                        } else {
                            hashSet2.add(string);
                        }
                    }
                }
                i6 = i7 + 1;
                i5 = i8;
                z3 = z2;
                z4 = z;
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = arrayList;
            if (!z3) {
                this.i.addAll(hashSet2);
            } else {
                this.i.addAll(hashSet);
            }
            if (njy.c(list, i5)) {
                this.j = list.get(i5).getInt("DEVICE_TYPE");
                this.f = list.get(i5).getString("DEVICE_ID");
                LogUtil.a("FitnessCoreSleepDetailInteractor", "mDeviceType: ", Integer.valueOf(this.j), " mDeviceId:", this.f, " position: ", Integer.valueOf(i5), "retListData.get(position):", list.get(i5));
            } else {
                LogUtil.e("FitnessCoreSleepDetailInteractor", "position is out bounds");
            }
            e(i, z4, arrayList3, commonUiBaseResponse);
        }
    }

    private void m() {
        this.j = 0;
        this.u.clear();
    }

    private uig c(List<HiHealthData> list, int i, HiHealthData hiHealthData, List<uig> list2, uig uigVar, int i2) {
        if (uigVar.e() != -1 && uigVar.b() != -1) {
            if (i2 != uigVar.e()) {
                uigVar.e(i);
                if (i > 0) {
                    uigVar.a(list.get(i - 1).getEndTime());
                }
                list2.add(uigVar);
                uigVar = new uig();
                if (this.j == 0) {
                    this.j = hiHealthData.getInt("DEVICE_TYPE");
                }
            }
            if (i == list.size() - 1 && uigVar.e() != -1) {
                uigVar.e(ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL);
                uigVar.a(hiHealthData.getEndTime());
                if (this.j == 0) {
                    this.j = hiHealthData.getInt("DEVICE_TYPE");
                }
                list2.add(uigVar);
            }
        }
        if (uigVar.b() == -1 && i2 != 0) {
            uigVar.b(i);
            uigVar.e(hiHealthData.getStartTime());
            uigVar.a(i2);
        }
        return uigVar;
    }

    private void c(HiHealthData hiHealthData) {
        String str;
        String string = hiHealthData.getString("NOON_START_TIME");
        String string2 = hiHealthData.getString("NOON_END_TIME");
        String strB = wud.b(this.f50137a);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return;
        }
        String[] strArrSplit = string2.split(",");
        String[] strArrSplit2 = string.split(",");
        if (strArrSplit.length == 1) {
            long jI = CommonUtil.i(strArrSplit2[0]);
            long jI2 = CommonUtil.i(strArrSplit[0]);
            long j = (jI2 - jI) / 60000;
            long j2 = j / 60;
            int i = (int) (j % 60);
            String strE = qre.e(com.huawei.ui.commonui.R.plurals.IDS_min_unit, i, UnitUtil.e(i, 1, 0));
            if (j2 == 0) {
                str = wud.b(jI) + strB + wud.b(jI2) + "   " + strE;
            } else {
                int i2 = (int) j2;
                str = wud.b(jI) + strB + wud.b(jI2) + "   " + this.f50137a.getString(com.huawei.ui.commonui.R.string.IDS_two_parts, qre.e(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, i2, UnitUtil.e(i2, 1, 0)), strE);
            }
            this.u.add(str);
            return;
        }
        a(strArrSplit, strArrSplit2);
    }

    private void a(String[] strArr, String[] strArr2) {
        String str;
        String[] strArr3 = strArr;
        String strB = wud.b(this.f50137a);
        gwc.c(strArr2, strArr3);
        int i = 0;
        while (i < strArr3.length) {
            long jI = CommonUtil.i(strArr2[i]);
            long jI2 = CommonUtil.i(strArr3[i]);
            long j = (jI2 - jI) / 60000;
            long j2 = j % 60;
            long j3 = j / 60;
            String strE = UnitUtil.e(j3, 1, 0);
            String strE2 = UnitUtil.e(j2, 1, 0);
            if (j3 == 0) {
                int i2 = (int) j2;
                str = wud.b(jI) + strB + wud.b(jI2) + "   " + this.f50137a.getResources().getQuantityString(R.plurals.IDS_hw_map_time_unit_value_minutes, i2, Integer.valueOf(i2));
            } else {
                str = wud.b(jI) + strB + wud.b(jI2) + "   " + this.f50137a.getString(R.string.IDS_h_min_unit, strE, strE2);
            }
            this.u.add(str);
            i++;
            strArr3 = strArr;
        }
    }

    private void e(int i, boolean z, List<uig> list, CommonUiBaseResponse commonUiBaseResponse) {
        CopyOnWriteArrayList<uig> copyOnWriteArrayList;
        if (list == null || list.size() <= 0) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);
        }
        if (z) {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "dealIfHaveSleepData daySleepHistogramData.size =", Integer.valueOf(copyOnWriteArrayList.size()));
            e(copyOnWriteArrayList);
            this.g = copyOnWriteArrayList;
        } else {
            LogUtil.a("FitnessCoreSleepDetailInteractor", "dealIfHaveSleepData clea daysleephistogramdata");
            copyOnWriteArrayList.clear();
            this.g = copyOnWriteArrayList;
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(i, copyOnWriteArrayList);
        }
    }

    private void c(Date date, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, CommonUiBaseResponse commonUiBaseResponse) {
        long time = date.getTime();
        if (fitnessQueryId == FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DAY_HISTOGRAM) {
            time = lsl.a(lsl.u(time), 20, 0);
        }
        long j = time / 1000;
        uzo.d(j, fitnessQueryId, new AnonymousClass10(j, fitnessQueryId, commonUiBaseResponse));
    }

    /* JADX INFO: renamed from: uik$10, reason: invalid class name */
    class AnonymousClass10 implements HiDataClientListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CommonUiBaseResponse f50142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f50143c;
        final /* synthetic */ FitnessDataQueryDefine.FitnessQueryId e;

        AnonymousClass10(long j, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, CommonUiBaseResponse commonUiBaseResponse) {
            this.f50143c = j;
            this.e = fitnessQueryId;
            this.f50142b = commonUiBaseResponse;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(final List<HiHealthClient> list) {
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final long j = this.f50143c;
            final FitnessDataQueryDefine.FitnessQueryId fitnessQueryId = this.e;
            final CommonUiBaseResponse commonUiBaseResponse = this.f50142b;
            threadPoolManagerC.execute(new Runnable() { // from class: uil
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(j, fitnessQueryId, list, commonUiBaseResponse);
                }
            });
        }

        /* synthetic */ void c(long j, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, List list, CommonUiBaseResponse commonUiBaseResponse) {
            uik.this.b(j, fitnessQueryId, (List<HiHealthClient>) list, commonUiBaseResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, final List<HiHealthClient> list, final CommonUiBaseResponse commonUiBaseResponse) {
        long jE;
        if (fitnessQueryId == FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DAY_HISTOGRAM) {
            jE = lsl.d(j * 1000, 1);
        } else {
            jE = ((((long) (FitnessDataQueryDefine.e(j, fitnessQueryId) * FitnessDataQueryDefine.b(fitnessQueryId))) * 60) + j) * 1000;
        }
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).fetchDataSourceByType(22000, new HiTimeInterval(j * 1000, jE - 1), new HiDataClientListener() { // from class: uik.8
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public void onResult(List<HiHealthClient> list2) {
                HashMap map = new HashMap();
                map.put("core", list);
                map.put("normal", list2);
                LogUtil.a("FitnessCoreSleepDetailInteractor", "devices is ", map);
                commonUiBaseResponse.onResponse(0, map);
            }
        });
    }
}
