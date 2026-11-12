package defpackage;

import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.model.TrackLineChartHolderImpl;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jqp f38836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TrackLineChartHolderImpl f38837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38838c;

    public jqs(TrackLineChartHolderImpl trackLineChartHolderImpl, jqp jqpVar) {
        this.f38837b = trackLineChartHolderImpl;
        this.f38836a = jqpVar;
    }

    public void d(SportDetailChartDataType sportDetailChartDataType, MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        LogUtil.a("Track_TrackLineChartHolderFiller", "initData dataType:", sportDetailChartDataType);
        if (this.f38837b == null || this.f38836a == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "initData mTrackLineChartHolder or mTrackDetailDataManager is null,return");
            return;
        }
        if (sportDetailChartDataType == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "initData dataType null,return");
            return;
        }
        if (motionPath == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "initData motionPath null,return");
        } else if (motionPathSimplify == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "initData motionPathSimplify null,return");
        } else {
            e(sportDetailChartDataType, motionPath, motionPathSimplify.requestStartTime(), motionPathSimplify.requestTotalTime(), motionPathSimplify);
        }
    }

    private void e(SportDetailChartDataType sportDetailChartDataType, MotionPath motionPath, long j, long j2, MotionPathSimplify motionPathSimplify) {
        switch (AnonymousClass3.f38839c[sportDetailChartDataType.ordinal()]) {
            case 1:
                e(motionPath, j);
                break;
            case 2:
                g(motionPath, j, j2);
                break;
            case 3:
                a(motionPath, j);
                break;
            case 4:
                b(motionPath, j);
                break;
            case 5:
                c(motionPath);
                break;
            case 6:
                d(motionPath, motionPathSimplify);
                break;
            case 7:
                d(motionPath);
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                b(motionPath, motionPathSimplify);
                break;
            case 16:
            case 17:
                b(motionPath);
                break;
            default:
                b(sportDetailChartDataType, motionPath, j, j2, motionPathSimplify);
                break;
        }
    }

    private void b(SportDetailChartDataType sportDetailChartDataType, MotionPath motionPath, long j, long j2, MotionPathSimplify motionPathSimplify) {
        switch (sportDetailChartDataType) {
            case SPO2:
                a(motionPath, motionPathSimplify);
                break;
            case CADENCE:
                c(motionPath, j, j2, motionPathSimplify);
                break;
            case PADDLE_FREQUENCY:
                b(motionPath, j, j2);
                break;
            case POWER:
                e(motionPath, j, j2);
                break;
            case SKIPPING_SPEED:
                c(motionPath, j, j2);
                break;
            case HEART_RATE_RECOVERY:
                e(motionPath);
                break;
            case PEAK_WEIGHT:
                j(motionPath, j, j2);
                break;
            case ANALOG_POWER:
                d(motionPath, j, j2);
                break;
            case ANALOG_CADENCE:
                a(motionPath, j, j2);
                break;
            default:
                LogUtil.j("Track_TrackLineChartHolderFiller", "fillData unknown dataType:", sportDetailChartDataType);
                break;
        }
    }

    private void e(MotionPath motionPath) {
        if (motionPath == null) {
            LogUtil.e("Track_TrackLineChartHolderFiller", "in initRecoveryHeartRateData motionPath is null");
            return;
        }
        if (motionPath.requestHeartRecoveryRateList() == null) {
            LogUtil.e("Track_TrackLineChartHolderFiller", "requestTrackList null,return");
            return;
        }
        List<HeartRateData> listRequestHeartRecoveryRateList = motionPath.requestHeartRecoveryRateList();
        if (listRequestHeartRecoveryRateList.size() > 0) {
            float fAcquireTime = (listRequestHeartRecoveryRateList.get(listRequestHeartRecoveryRateList.size() - 1).acquireTime() - listRequestHeartRecoveryRateList.get(0).acquireTime()) / 1000.0f;
            ArrayList<HeartRateData> arrayList = new ArrayList<>(16);
            arrayList.addAll(motionPath.requestHeartRecoveryRateList());
            this.f38837b.j(arrayList);
            this.f38837b.a(5);
            this.f38837b.b(fAcquireTime);
        }
    }

    private void b(MotionPath motionPath) {
        if (motionPath.requestJumpDataList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "requestTrackList null,return");
            return;
        }
        if (!this.f38836a.u() || this.f38836a.d().requestSportType() == 271) {
            ArrayList<lmb> arrayList = new ArrayList<>(16);
            arrayList.addAll(motionPath.requestJumpDataList());
            this.f38837b.a(arrayList);
            this.f38837b.c(5);
            this.f38837b.i(((int) this.f38836a.d().requestTotalTime()) / 1000);
        }
    }

    private void e(MotionPath motionPath, long j) {
        if (motionPath.requestHeartRateList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillHeartRateData motionPath requestHeartRateList null,return");
            return;
        }
        if (!this.f38836a.ag() || this.f38836a.d().requestSportType() == 512) {
            ArrayList<HeartRateData> arrayList = new ArrayList<>(16);
            List<nje> heartRateAreaList = motionPath.getHeartRateAreaList();
            if (njy.b(heartRateAreaList)) {
                this.f38837b.n(heartRateAreaList);
            }
            this.f38837b.d(arrayList);
            ArrayList<HeartRateData> arrayListRequestHeartRateList = motionPath.requestHeartRateList();
            this.f38837b.e(motionPath.requestInvalidHeartRateList());
            int iE = xjm.e(arrayListRequestHeartRateList, j);
            this.f38837b.a(iE);
            String extendDataString = this.f38836a.d().getExtendDataString("isTrustHeartRate");
            LogUtil.a("Track_TrackLineChartHolderFiller", "initHeartRateData hasTrustHeartRate", extendDataString);
            ArrayList<HeartRateData> arrayListRequestInvalidHeartRateList = motionPath.requestInvalidHeartRateList();
            if (jpr.b(arrayListRequestHeartRateList, arrayListRequestInvalidHeartRateList)) {
                jpr.a(arrayListRequestHeartRateList, extendDataString, iE, arrayList);
                if (arrayListRequestHeartRateList.size() - 1 > 0) {
                    b(iE, arrayListRequestHeartRateList, extendDataString);
                    return;
                } else {
                    this.f38837b.c();
                    return;
                }
            }
            this.f38837b.c(jpr.b(arrayListRequestHeartRateList, arrayListRequestInvalidHeartRateList, arrayList, iE, extendDataString));
            if ((arrayListRequestHeartRateList.size() + arrayListRequestInvalidHeartRateList.size()) - 1 > 0) {
                e(iE, arrayListRequestHeartRateList, arrayListRequestInvalidHeartRateList, extendDataString);
            } else {
                this.f38837b.c();
            }
        }
    }

    private void e(int i, List<HeartRateData> list, List<HeartRateData> list2, String str) {
        if (str == null) {
            this.f38837b.d(i * ((list.size() + list2.size()) - 1));
            return;
        }
        if ("1".equals(str)) {
            long jAcquireTime = list.get(0).acquireTime();
            long jAcquireTime2 = list.get(list.size() - 1).acquireTime();
            long jAcquireTime3 = list2.get(0).acquireTime();
            this.f38837b.d((Math.max(jAcquireTime2, list2.get(list2.size() - 1).acquireTime()) - Math.min(jAcquireTime, jAcquireTime3)) / 1000);
        }
    }

    private void b(int i, List<HeartRateData> list, String str) {
        if (str == null) {
            this.f38837b.d(i * (list.size() - 1));
        } else if ("1".equals(str)) {
            this.f38837b.d((list.get(list.size() - 1).acquireTime() - list.get(0).acquireTime()) / 1000.0f);
        }
    }

    private void c(MotionPath motionPath, long j, long j2, MotionPathSimplify motionPathSimplify) {
        if (motionPath.requestRidePostureDataList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillCadenceRateData motionPath requestRidePostureDataList null,return");
            return;
        }
        if (this.f38836a.ab()) {
            return;
        }
        ArrayList<gzr> arrayList = new ArrayList<>(16);
        this.f38837b.d(arrayList);
        if (a(motionPath)) {
            LogUtil.a("Track_TrackLineChartHolderFiller", "Ride Accessories or Cross Trainer handleCadenceRateData start");
            c(motionPath, j, j2, arrayList, motionPathSimplify);
        } else {
            LogUtil.a("Track_TrackLineChartHolderFiller", "AW70 handleCadenceRateDataToBike start");
            c(motionPath, arrayList);
        }
        this.f38837b.c(TimeUnit.MILLISECONDS.toSeconds(j2));
    }

    private boolean a(MotionPath motionPath) {
        List<gzr> listRequestRidePostureDataList = motionPath.requestRidePostureDataList();
        if (listRequestRidePostureDataList == null || listRequestRidePostureDataList.size() < 2 || listRequestRidePostureDataList.get(0) == null || listRequestRidePostureDataList.get(1) == null || listRequestRidePostureDataList.get(0).acquireTime() <= 1080000000 || listRequestRidePostureDataList.get(1).acquireTime() <= 1080000000) {
            LogUtil.a("Track_TrackLineChartHolderFiller", "isAbsoluteTimestamp is false");
            return false;
        }
        LogUtil.a("Track_TrackLineChartHolderFiller", "isAbsoluteTimestamp is true");
        return true;
    }

    private void b(MotionPath motionPath, long j, long j2) {
        if (motionPath.requestPaddleFrequencyList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillPaddleFrequencyData motionPath requestPaddleFrequencyList null,return");
        } else if (!this.f38836a.ah() || this.f38836a.d().requestSportType() == 274) {
            ArrayList arrayList = new ArrayList(16);
            this.f38837b.e((List<nji>) arrayList);
            a(motionPath, j, j2, arrayList);
        }
    }

    private void j(MotionPath motionPath, long j, long j2) {
        if (motionPath.requestWeightList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "initWeightData motionPath requestPowerList null,return");
            return;
        }
        int iRequestSportType = this.f38836a.d().requestSportType();
        if (!this.f38836a.am() || iRequestSportType == 274) {
            ArrayList<njs> arrayList = new ArrayList<>(16);
            this.f38837b.m(arrayList);
            e(motionPath, j, j2, arrayList);
        }
    }

    private void e(MotionPath motionPath, long j, long j2, ArrayList<njs> arrayList) {
        List<njs> listRequestWeightList = motionPath.requestWeightList();
        if (!motionPath.isValidWeightData()) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handleWeightData weightListTemp is null");
            return;
        }
        if (UnitUtil.f()) {
            for (njs njsVar : listRequestWeightList) {
                njsVar.a((int) Math.round(UnitUtil.h(njsVar.e())));
            }
        }
        int iE = xjm.e(listRequestWeightList, j);
        this.f38837b.r(iE);
        njs njsVar2 = listRequestWeightList.get(0);
        if (njsVar2 == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handleWeightData data is null");
        } else {
            arrayList.add(new njs(0L, njsVar2.e()));
            c(j2, arrayList, iE, listRequestWeightList);
        }
    }

    private void c(long j, ArrayList<njs> arrayList, int i, List<njs> list) {
        Iterator<njs> it = list.iterator();
        int i2 = 0;
        long j2 = 0;
        while (it.hasNext()) {
            njs next = it.next();
            long j3 = i;
            i2++;
            long j4 = ((long) i2) * j3;
            if (it.hasNext()) {
                arrayList.add(new njs(j4, next.e()));
            } else {
                long seconds = ((long) ((int) TimeUnit.MILLISECONDS.toSeconds(j))) - j2;
                if (seconds < 0) {
                    arrayList.add(new njs(j4, next.e()));
                } else {
                    long j5 = seconds - (seconds % 5);
                    if (j5 == 0) {
                        j2 += 5;
                        arrayList.add(new njs(j2, next.e()));
                    } else if (j5 > j3) {
                        arrayList.add(new njs(j4, next.e()));
                    } else {
                        j2 += j5;
                        arrayList.add(new njs(j2, next.e()));
                    }
                }
            }
            j2 = j4;
        }
    }

    private void e(MotionPath motionPath, long j, long j2) {
        if (motionPath.requestPowerList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillPowerData motionPath requestPowerList null,return");
            return;
        }
        int iRequestSportType = this.f38836a.d().requestSportType();
        if (!this.f38836a.af() || iRequestSportType == 274 || iRequestSportType == 273 || iRequestSportType == 265) {
            ArrayList arrayList = new ArrayList(16);
            this.f38837b.a((List<njh>) arrayList);
            e(motionPath, j, j2, (List<njh>) arrayList);
        }
    }

    private void d(MotionPath motionPath, long j, long j2) {
        if (motionPath.requestAnalogPowerList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "requestAnalogPowerList is null");
        } else {
            if (this.f38836a.v()) {
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            this.f38837b.b((List<njb>) arrayList);
            c(motionPath, j, j2, arrayList);
        }
    }

    private void a(MotionPath motionPath, long j, long j2) {
        if (motionPath.requestAnalogCadenceList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "requestAnalogPowerList is null");
            return;
        }
        if (this.f38836a.y()) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        this.f38837b.c((List<njc>) arrayList);
        d(motionPath, j, j2, arrayList);
        this.f38837b.e(TimeUnit.MILLISECONDS.toSeconds(j2));
    }

    private void c(MotionPath motionPath, long j, long j2) {
        if (motionPath.requestSkippingSpeedList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillPowerData motionPath requestPowerList null,return");
            return;
        }
        int iRequestSportType = this.f38836a.d().requestSportType();
        if (!this.f38836a.ap() || iRequestSportType == 283) {
            ArrayList arrayList = new ArrayList(16);
            b(motionPath, j, j2, arrayList);
            this.f38837b.g(arrayList);
        }
    }

    private void g(MotionPath motionPath, long j, long j2) {
        if (motionPath.requestStepRateList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillStepRateData motionPath requestStepRateList null,return");
            return;
        }
        if (!this.f38836a.aw() || this.f38836a.d().requestSportType() == 512) {
            LogUtil.a("Track_TrackLineChartHolderFiller", "initStepRateData");
            ArrayList<StepRateData> arrayList = new ArrayList<>(16);
            this.f38837b.b(arrayList);
            this.f38837b.m(xjm.e(motionPath.requestStepRateList(), j));
            jpr.c(motionPath.requestStepRateList(), j, j2, arrayList);
            this.f38837b.j(TimeUnit.MILLISECONDS.toSeconds(j2));
        }
    }

    private void b(MotionPath motionPath, long j, long j2, List<njg> list) {
        List<njg> listRequestSkippingSpeedList = motionPath.requestSkippingSpeedList();
        if (!motionPath.isValidSkippingData()) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handlePowerData listTemp is null");
            return;
        }
        int iE = xjm.e(listRequestSkippingSpeedList, j);
        this.f38837b.k(iE);
        int i = 0;
        njg njgVar = listRequestSkippingSpeedList.get(0);
        if (njgVar == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handlePowerData data is null");
            return;
        }
        list.add(new njg(0L, njgVar.c()));
        Iterator<njg> it = listRequestSkippingSpeedList.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            njg next = it.next();
            long j4 = iE;
            i++;
            long j5 = ((long) i) * j4;
            if (it.hasNext()) {
                list.add(new njg(j5, next.c()));
                j3 = j5;
            } else {
                Iterator<njg> it2 = it;
                int i2 = iE;
                long seconds = ((long) ((int) TimeUnit.MILLISECONDS.toSeconds(j2))) - j3;
                if (seconds < 0) {
                    list.add(new njg(j5, next.c()));
                } else {
                    long j6 = seconds - (seconds % 5);
                    if (j6 == 0) {
                        j3 += 5;
                        list.add(new njg(j3, next.c()));
                    } else if (j6 > j4) {
                        list.add(new njg(j5, next.c()));
                    } else {
                        j3 += j6;
                        list.add(new njg(j3, next.c()));
                    }
                    iE = i2;
                    it = it2;
                }
                j3 = j5;
                iE = i2;
                it = it2;
            }
        }
    }

    private void e(MotionPath motionPath, long j, long j2, List<njh> list) {
        List<njh> listRequestPowerList = motionPath.requestPowerList();
        if (!motionPath.isValidPowerData()) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handlePowerData powerDataListTemp is null");
            return;
        }
        int iE = xjm.e(listRequestPowerList, j);
        this.f38837b.g(iE);
        int i = 0;
        njh njhVar = listRequestPowerList.get(0);
        if (njhVar == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handlePowerData data is null");
            return;
        }
        list.add(new njh(0L, njhVar.e()));
        Iterator<njh> it = listRequestPowerList.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            njh next = it.next();
            long j4 = iE;
            i++;
            long j5 = ((long) i) * j4;
            if (it.hasNext()) {
                list.add(new njh(j5, next.e()));
                j3 = j5;
            } else {
                Iterator<njh> it2 = it;
                int i2 = iE;
                long seconds = ((long) ((int) TimeUnit.MILLISECONDS.toSeconds(j2))) - j3;
                if (seconds < 0) {
                    list.add(new njh(j5, next.e()));
                } else {
                    long j6 = seconds - (seconds % 5);
                    if (j6 == 0) {
                        j3 += 5;
                        list.add(new njh(j3, next.e()));
                    } else if (j6 > j4) {
                        list.add(new njh(j5, next.e()));
                    } else {
                        j3 += j6;
                        list.add(new njh(j3, next.e()));
                    }
                    iE = i2;
                    it = it2;
                }
                j3 = j5;
                iE = i2;
                it = it2;
            }
        }
    }

    private void c(MotionPath motionPath, long j, long j2, List<njb> list) {
        int i;
        long j3;
        if (!motionPath.isValidAnalogPowerData()) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handleAnalogPowerData analogPowerData is invalid");
            return;
        }
        List<njb> listRequestAnalogPowerList = motionPath.requestAnalogPowerList();
        int iE = xjm.e(listRequestAnalogPowerList, j);
        this.f38837b.b(iE);
        int i2 = 0;
        njb njbVar = listRequestAnalogPowerList.get(0);
        if (njbVar == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handleAnalogPowerData data is null");
            return;
        }
        long j4 = 0;
        list.add(new njb(0L, njbVar.a()));
        Iterator<njb> it = listRequestAnalogPowerList.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            njb next = it.next();
            long j6 = iE;
            i2++;
            long j7 = ((long) i2) * j6;
            if (it.hasNext()) {
                list.add(new njb(j7, next.a()));
                i = iE;
                j3 = j4;
            } else {
                i = iE;
                long seconds = ((long) ((int) TimeUnit.MILLISECONDS.toSeconds(j2))) - j5;
                j3 = 0;
                if (seconds < 0) {
                    list.add(new njb(j7, next.a()));
                } else {
                    long j8 = seconds - (seconds % 5);
                    if (j8 == 0) {
                        j5 += 5;
                        list.add(new njb(j5, next.a()));
                    } else if (j8 > j6) {
                        list.add(new njb(j7, next.a()));
                    } else {
                        j5 += j8;
                        list.add(new njb(j5, next.a()));
                    }
                    iE = i;
                    j4 = j3;
                }
            }
            iE = i;
            j5 = j7;
            j4 = j3;
        }
    }

    private void d(MotionPath motionPath, long j, long j2, List<njc> list) {
        int i;
        long j3;
        if (!motionPath.isValidAnalogCadenceData()) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handleAnalogPowerData analogPowerData is invalid");
            return;
        }
        List<njc> listRequestAnalogCadenceList = motionPath.requestAnalogCadenceList();
        int iE = xjm.e(listRequestAnalogCadenceList, j);
        this.f38837b.e(iE);
        int i2 = 0;
        njc njcVar = listRequestAnalogCadenceList.get(0);
        if (njcVar == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handleAnalogPowerData data is null");
            return;
        }
        long j4 = 0;
        list.add(new njc(0L, njcVar.a()));
        Iterator<njc> it = listRequestAnalogCadenceList.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            njc next = it.next();
            long j6 = iE;
            i2++;
            long j7 = ((long) i2) * j6;
            if (it.hasNext()) {
                list.add(new njc(j7, next.a()));
                i = iE;
                j3 = j4;
            } else {
                i = iE;
                long seconds = ((long) ((int) TimeUnit.MILLISECONDS.toSeconds(j2))) - j5;
                j3 = 0;
                if (seconds < 0) {
                    list.add(new njc(j7, next.a()));
                } else {
                    long j8 = seconds - (seconds % 5);
                    if (j8 == 0) {
                        j5 += 5;
                        list.add(new njc(j5, next.a()));
                    } else if (j8 > j6) {
                        list.add(new njc(j7, next.a()));
                    } else {
                        j5 += j8;
                        list.add(new njc(j5, next.a()));
                    }
                    iE = i;
                    j4 = j3;
                }
            }
            iE = i;
            j5 = j7;
            j4 = j3;
        }
    }

    private void a(MotionPath motionPath, long j, long j2, List<nji> list) {
        List<nji> listRequestPaddleFrequencyList = motionPath.requestPaddleFrequencyList();
        if (!motionPath.isValidPaddleData()) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handlePaddleFreqData paddleListTemp is null");
            return;
        }
        int iE = xjm.e(listRequestPaddleFrequencyList, j);
        this.f38837b.f(iE);
        int i = 0;
        nji njiVar = listRequestPaddleFrequencyList.get(0);
        if (njiVar == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handlePaddleFreqData data is null");
            return;
        }
        list.add(new nji(0L, njiVar.c()));
        Iterator<nji> it = listRequestPaddleFrequencyList.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            nji next = it.next();
            long j4 = iE;
            i++;
            long j5 = ((long) i) * j4;
            if (it.hasNext()) {
                list.add(new nji(j5, next.c()));
                j3 = j5;
            } else {
                Iterator<nji> it2 = it;
                int i2 = iE;
                long seconds = ((long) ((int) TimeUnit.MILLISECONDS.toSeconds(j2))) - j3;
                if (seconds < 0) {
                    list.add(new nji(j5, next.c()));
                } else {
                    long j6 = seconds - (seconds % 5);
                    if (j6 == 0) {
                        j3 += 5;
                        list.add(new nji(j3, next.c()));
                    } else if (j6 > j4) {
                        list.add(new nji(j5, next.c()));
                    } else {
                        j3 += j6;
                        list.add(new nji(j3, next.c()));
                    }
                    iE = i2;
                    it = it2;
                }
                j3 = j5;
                iE = i2;
                it = it2;
            }
        }
    }

    private void c(MotionPath motionPath, long j, long j2, List<gzr> list, MotionPathSimplify motionPathSimplify) {
        long j3;
        List<gzr> listRequestRidePostureDataList = motionPath.requestRidePostureDataList();
        if (!motionPath.isValidCadenceData()) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handleCadenceRateData cadenceListTemp is null");
            return;
        }
        int iE = xjm.e(listRequestRidePostureDataList, j);
        this.f38837b.d(iE);
        if (jpq.c(motionPathSimplify.requestSportType(), motionPathSimplify)) {
            b(listRequestRidePostureDataList, motionPathSimplify);
        }
        int i = 0;
        gzr gzrVar = listRequestRidePostureDataList.get(0);
        if (gzrVar == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "handleCadenceRateData data is null");
            return;
        }
        long j4 = 0;
        list.add(new gzr(0L, gzrVar.c()));
        Iterator<gzr> it = listRequestRidePostureDataList.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            gzr next = it.next();
            long j6 = iE;
            i++;
            long j7 = ((long) i) * j6;
            if (it.hasNext()) {
                list.add(new gzr(j7, next.c()));
                j3 = j4;
            } else {
                long seconds = ((long) ((int) TimeUnit.MILLISECONDS.toSeconds(j2))) - j5;
                j3 = 0;
                if (seconds < 0) {
                    list.add(new gzr(j7, next.c()));
                } else {
                    long j8 = seconds - (seconds % 5);
                    if (j8 == 0) {
                        j5 += 5;
                        list.add(new gzr(j5, next.c()));
                    } else if (j8 > j6) {
                        list.add(new gzr(j7, next.c()));
                    } else {
                        j5 += j8;
                        list.add(new gzr(j5, next.c()));
                    }
                    j4 = j3;
                }
            }
            j5 = j7;
            j4 = j3;
        }
    }

    private void b(List<gzr> list, MotionPathSimplify motionPathSimplify) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list) || motionPathSimplify == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "motionPathSimplify is null");
            return;
        }
        if (motionPathSimplify.requestSportType() == 273) {
            for (gzr gzrVar : list) {
                if (gzrVar != null) {
                    gzr gzrVar2 = new gzr();
                    gzrVar2.c(gzrVar.acquireTime());
                    gzrVar2.e(gzrVar.c() / 2);
                    arrayList.add(gzrVar2);
                }
            }
            if (njy.b(arrayList)) {
                list.clear();
                list.addAll(arrayList);
            }
        }
    }

    private void c(MotionPath motionPath, ArrayList<gzr> arrayList) {
        List<gzr> listRequestRidePostureDataList = motionPath.requestRidePostureDataList();
        boolean zB = b(listRequestRidePostureDataList);
        long j = -1;
        for (int i = 0; i < listRequestRidePostureDataList.size(); i++) {
            gzr gzrVar = listRequestRidePostureDataList.get(i);
            if (gzrVar != null) {
                long jAcquireTime = gzrVar.acquireTime();
                if (jAcquireTime > this.f38836a.d().requestTotalTime()) {
                    return;
                }
                long jE = e(c(zB, jAcquireTime));
                this.f38838c = jE;
                long j2 = jE - j;
                if (j != -1 && j2 > 5 && j2 < 20) {
                    b(arrayList, gzrVar, j2, j);
                }
                c(this.f38838c, arrayList, gzrVar);
                j = this.f38838c;
            }
        }
    }

    private void b(ArrayList<gzr> arrayList, gzr gzrVar, long j, long j2) {
        int i = ((int) j) / 5;
        for (int i2 = 1; i2 <= i; i2++) {
            long j3 = ((long) (i2 * 5)) + j2;
            if (j3 >= this.f38838c) {
                return;
            }
            c(j3, arrayList, gzrVar);
        }
    }

    private void c(long j, ArrayList<gzr> arrayList, gzr gzrVar) {
        arrayList.add(new gzr(j, gzrVar.c()));
    }

    private void a(MotionPath motionPath, long j) {
        if (motionPath.requestAltitudeList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillAltitudeData motionPath requestAltitudeList null,return");
            return;
        }
        if (!this.f38836a.x() || this.f38836a.d().requestSportType() == 512) {
            ArrayList<njm> arrayList = new ArrayList<>(16);
            this.f38837b.f(arrayList);
            ArrayList<njm> arrayListRequestAltitudeList = motionPath.requestAltitudeList();
            int iE = xjm.e(arrayListRequestAltitudeList, j);
            this.f38837b.l(iE);
            this.f38837b.o(1);
            this.f38837b.i(motionPath.requestSlopeInfoList());
            for (int i = 0; i < arrayListRequestAltitudeList.size(); i++) {
                arrayList.add(new njm(((long) iE) * ((long) i), arrayListRequestAltitudeList.get(i).a()));
            }
        }
    }

    private void b(MotionPath motionPath, long j) {
        if (njy.e(motionPath.requestRealTimeSpeedList())) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillAltitudeData motionPath requestAltitudeList null,return");
            return;
        }
        if (!this.f38836a.ao() || this.f38836a.d().requestSportType() == 512) {
            ArrayList<njr> arrayList = new ArrayList<>(16);
            this.f38837b.h(arrayList);
            List<njr> listRequestRealTimeSpeedList = motionPath.requestRealTimeSpeedList();
            int iE = xjm.e(listRequestRealTimeSpeedList, j);
            this.f38837b.q(iE);
            Iterator<njr> it = listRequestRealTimeSpeedList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            if (jpq.d(this.f38836a.d().requestSportType(), this.f38836a.d().requestSportDataSource())) {
                arrayList.clear();
                for (int i = 0; i < listRequestRealTimeSpeedList.size(); i++) {
                    arrayList.add(new njr(((long) i) * ((long) iE), listRequestRealTimeSpeedList.get(i).c()));
                }
            }
        }
    }

    private void c(MotionPath motionPath) {
        if (motionPath.requestSwolfList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "requestSwolfList motionPath requestSwolfList null,return");
            return;
        }
        if (!this.f38836a.at() || this.f38836a.d().requestSportType() == 512) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.addAll(motionPath.requestSwolfList());
            this.f38837b.l(arrayList);
            this.f38837b.n(5);
        }
    }

    private void d(MotionPath motionPath) {
        if (motionPath.requestPullFreqList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "initPullFreqData null,return");
            return;
        }
        if (!this.f38836a.ak() || this.f38836a.d().requestSportType() == 512) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.addAll(motionPath.requestPullFreqList());
            this.f38837b.j((List<njp>) arrayList);
            this.f38837b.j(5);
        }
    }

    private void d(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (motionPath.requestRealTimePaceList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "requestSwolfList motionPath requestSwolfList null,return");
            return;
        }
        if (!this.f38836a.al() || this.f38836a.d().requestSportType() == 512) {
            ArrayList<njl> arrayList = new ArrayList<>(16);
            this.f38837b.f(arrayList);
            List<njl> listRequestRealTimePaceList = motionPath.requestRealTimePaceList();
            this.f38837b.j(5);
            int iRequestSportType = motionPathSimplify.requestSportType();
            if (UnitUtil.f() && !jpq.g(iRequestSportType)) {
                e(arrayList, listRequestRealTimePaceList, iRequestSportType);
            } else {
                a(arrayList, listRequestRealTimePaceList, iRequestSportType);
            }
            this.f38837b.a((listRequestRealTimePaceList.size() - 1) * 5);
        }
    }

    private void a(ArrayList<njl> arrayList, List<njl> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).e() != 0) {
                if (i == 266 || i == 262) {
                    arrayList.add(new njl(list.get(i2).acquireTime(), list.get(i2).e() / 10));
                } else if (i == 274 || jpq.g(i)) {
                    arrayList.add(new njl(i2 * 5, (int) Math.round(((double) list.get(i2).e()) / 2.0d)));
                } else {
                    arrayList.add(new njl(list.get(i2).acquireTime(), list.get(i2).e()));
                }
            }
        }
    }

    private void e(ArrayList<njl> arrayList, List<njl> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).e() != 0) {
                if (i == 266 || i == 262) {
                    arrayList.add(new njl(list.get(i2).acquireTime(), (int) UnitUtil.c(((double) list.get(i2).e()) / 10.0d, 2)));
                } else if (jpq.d(i, this.f38836a.d().requestSportDataSource())) {
                    arrayList.add(new njl(i2 * 5, (int) UnitUtil.c(((double) list.get(i2).e()) / 10.0d, 2)));
                } else {
                    arrayList.add(new njl(list.get(i2).acquireTime(), (int) UnitUtil.c(list.get(i2).e(), 3)));
                }
            }
        }
    }

    private void b(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (motionPath == null || motionPath.requestRunningPostureList() == null) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "fillRunningPostureList motionPath requestRunningPostureList null,return");
            return;
        }
        if (!this.f38836a.aj() || this.f38836a.d().requestSportType() == 512) {
            ArrayList arrayList = new ArrayList(16);
            this.f38837b.i((List<gzv>) arrayList);
            ArrayList<gzv> arrayListRequestRunningPostureList = motionPath.requestRunningPostureList();
            this.f38837b.h(5);
            jpr.c(arrayList, arrayListRequestRunningPostureList);
            LogUtil.a("Track_TrackLineChartHolderFiller", "initRunningPostureData");
            this.f38837b.f(TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime()));
        }
    }

    private long c(boolean z, long j) {
        return z ? TimeUnit.MILLISECONDS.toSeconds(j) : j;
    }

    private void a(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        long jRequestTotalTime;
        if (njy.e(motionPath.requestSpo2List())) {
            LogUtil.j("Track_TrackLineChartHolderFiller", "motionPath spo2 null or empty, return");
            return;
        }
        int iRequestSportType = motionPathSimplify.requestSportType();
        if (this.f38836a.as()) {
            return;
        }
        this.f38837b.h(motionPath.requestSpo2List());
        if (nub.e(iRequestSportType)) {
            jRequestTotalTime = (long) (this.f38836a.d().getExtendDataFloat("skiTotalTime") / 1000.0f);
        } else {
            jRequestTotalTime = this.f38836a.d().requestTotalTime() / 1000;
        }
        this.f38837b.i(jRequestTotalTime);
    }

    private long e(long j) {
        long j2 = j / 5;
        return j % 5 > 2 ? (j2 + 1) * 5 : j2 * 5;
    }

    private boolean b(List<gzr> list) {
        List<Long> listD = d(list);
        if (listD.size() < 3) {
            return list.size() > 0 && list.get(0).acquireTime() > 1000;
        }
        long jLongValue = listD.get(0).longValue();
        long jLongValue2 = listD.get(1).longValue();
        return jLongValue2 - jLongValue > 500 && listD.get(2).longValue() - jLongValue2 > 500;
    }

    private List<Long> d(List<gzr> list) {
        ArrayList<Long> arrayList = new ArrayList(list.size());
        if (njy.e(list)) {
            return arrayList;
        }
        for (gzr gzrVar : list) {
            if (gzrVar != null) {
                arrayList.add(Long.valueOf(gzrVar.acquireTime()));
            }
        }
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Long l : arrayList) {
            if (hashSet.add(l)) {
                arrayList2.add(l);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
