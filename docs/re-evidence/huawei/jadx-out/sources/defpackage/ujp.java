package defpackage;

import com.huawei.health.sport.utils.FitnessDataQueryDefine;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ujp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ujp f50267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f50268c = new Object();
    private ujm e;

    private ujp() {
        this.e = null;
        this.e = ujm.e();
    }

    public static ujp b() {
        ujp ujpVar;
        synchronized (ujp.class) {
            if (f50267b == null) {
                f50267b = new ujp();
            }
            ujpVar = f50267b;
        }
        return ujpVar;
    }

    public void e(long j, final FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, final FitnessDataQueryDefine.FitnessSleepTotalDataId fitnessSleepTotalDataId, final CommonUiBaseResponse commonUiBaseResponse) {
        int iA;
        LogUtil.a("SCUI_FitnessOldMgrInteractors", "Enter requestGetCoreSleepDetailData");
        synchronized (f50268c) {
            int iA2 = FitnessDataQueryDefine.a(fitnessQueryId);
            int iE = FitnessDataQueryDefine.e(j, fitnessQueryId);
            int iC = FitnessDataQueryDefine.c(fitnessQueryId);
            LogUtil.a("SCUI_FitnessOldMgrInteractors", "requestGetCoreSleepDetailData queryID = " + fitnessQueryId + "unitSize = " + iE + "  unitCount = " + iC + "  unitType = " + iA2);
            if (iA2 == 5 && 12 == iC) {
                Date date = new Date(1000 * j);
                iA = 0;
                for (int i = 0; i < 12; i++) {
                    iA += FitnessDataQueryDefine.a(ltb.m(ltb.b(date, i))) * ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
                }
            } else {
                iA = iE;
            }
            ujm ujmVar = this.e;
            if (ujmVar != null) {
                ujmVar.b(j, iA2, iA, iC, new IBaseResponseCallback() { // from class: ujp.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        if (obj != null) {
                            LogUtil.a("SCUI_FitnessOldMgrInteractors", "getCoreSleepDetail onResponse objData != null");
                        } else {
                            LogUtil.a("SCUI_FitnessOldMgrInteractors", "getCoreSleepDetail onResponse errCode = " + i2);
                        }
                        switch (AnonymousClass3.f50271a[fitnessQueryId.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                if (i2 == 0) {
                                    LogUtil.a("SCUI_FitnessOldMgrInteractors", "process getCoreSleepDetail");
                                    if (obj != null) {
                                        ujp.this.d(fitnessSleepTotalDataId, commonUiBaseResponse, obj);
                                    }
                                } else if (commonUiBaseResponse != null) {
                                    LogUtil.a("SCUI_FitnessOldMgrInteractors", "requestGetCoreSleepDetailData callback.");
                                    commonUiBaseResponse.onResponse(i2, obj);
                                }
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                                if (commonUiBaseResponse2 != null) {
                                    commonUiBaseResponse2.onResponse(i2, obj);
                                }
                                break;
                        }
                    }
                });
            }
        }
        LogUtil.a("SCUI_FitnessOldMgrInteractors", "Leave requestGetCoreSleepDetailData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FitnessDataQueryDefine.FitnessSleepTotalDataId fitnessSleepTotalDataId, CommonUiBaseResponse commonUiBaseResponse, Object obj) {
        int totalSleepTime;
        LogUtil.a("SCUI_FitnessOldMgrInteractors", "Enter processFitnessSleepStatisticData");
        List list = (List) obj;
        int i = AnonymousClass3.e[fitnessSleepTotalDataId.ordinal()];
        if (i == 1) {
            Iterator it = list.iterator();
            totalSleepTime = 0;
            while (it.hasNext()) {
                totalSleepTime += ((SleepTotalData) it.next()).getTotalSleepTime();
            }
            LogUtil.a("SCUI_FitnessOldMgrInteractors", "FITNESS_TOTAL_SLEEP_TIME totalSleepTime = " + totalSleepTime);
        } else if (i == 2) {
            Iterator it2 = list.iterator();
            totalSleepTime = 0;
            while (it2.hasNext()) {
                totalSleepTime += ((SleepTotalData) it2.next()).getTotalSleepTime();
            }
        } else if (i == 3) {
            Iterator it3 = list.iterator();
            totalSleepTime = 0;
            while (it3.hasNext()) {
                totalSleepTime += ((SleepTotalData) it3.next()).getTotalSleepTime();
            }
        } else if (i != 4) {
            if (commonUiBaseResponse != null) {
                commonUiBaseResponse.onResponse(0, obj);
                return;
            }
            return;
        } else {
            Iterator it4 = list.iterator();
            totalSleepTime = 0;
            while (it4.hasNext()) {
                totalSleepTime += ((SleepTotalData) it4.next()).getTotalSleepTime();
            }
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(0, Integer.valueOf(totalSleepTime));
        }
        LogUtil.a("SCUI_FitnessOldMgrInteractors", "Leave processFitnessSleepStatisticData");
    }

    /* JADX INFO: renamed from: ujp$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50271a;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[FitnessDataQueryDefine.FitnessSleepTotalDataId.values().length];
            e = iArr;
            try {
                iArr[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_TOTAL_SLEEP_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_DEEP_SLEEP_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_SHALLOW_SLEEP_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_WAKEUP_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[FitnessDataQueryDefine.FitnessSleepTotalDataId.FITNESS_UNSPECIFIC_SLEEP_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[FitnessDataQueryDefine.FitnessQueryId.values().length];
            f50271a = iArr2;
            try {
                iArr2[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_STATISTIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_STATISTIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_STATISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_STATISTIC_DETAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_STATISTIC_DETAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_STATISTIC_DETAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_STATISTIC_DETAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_UP_SLEEP_DETAIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_DAY_HISTOGRAM.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_WEEK_HISTOGRAM.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_MONTH_HISTOGRAM.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_SLEEP_YEAR_HISTOGRAM.ordinal()] = 13;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DAY_HISTOGRAM.ordinal()] = 14;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_WEEK_HISTOGRAM.ordinal()] = 15;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_MONTH_HISTOGRAM.ordinal()] = 16;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f50271a[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_YEAR_HISTOGRAM.ordinal()] = 17;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }
}
