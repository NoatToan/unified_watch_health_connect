package defpackage;

import android.content.Context;
import androidx.core.util.Pair;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jqp implements Serializable {
    private static final long serialVersionUID = -4003181319353707660L;
    private gyk d;
    private boolean e;
    private Pair<float[], float[]> l;
    private MotionPathSimplify h = null;
    private MotionPath i = null;
    private MotionData j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38832a = false;
    private String g = null;
    private List<jbt> k = new ArrayList(16);
    private List<jqp> o = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f38833b = {false, false, false, false, false, false, false};
    private boolean f = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient HashMap<SportDetailChartDataType, jph> f38834c = new HashMap<>(20);
    private List<gyk> n = new ArrayList(16);

    public void d(List<SportDetailItem.a> list) {
        if (njy.e(list)) {
            LogUtil.j("Track_TrackDetailDataManager", "setDataList is empty");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (SportDetailItem.a aVar : list) {
            gyk gykVar = new gyk();
            gykVar.a(aVar.c());
            gykVar.e(aVar.j());
            gykVar.b(aVar.h());
            gykVar.d(aVar.b());
            gykVar.c(aVar.e());
            haj.a aVarC = haj.c(aVar.e());
            if ("CALORIES".equals(aVar.e())) {
                gykVar.a(qre.f(R.string.IDS_track_total_calorie));
            }
            if (aVarC != null) {
                gykVar.a(aVarC.e());
                gykVar.a(aVarC.a());
            } else {
                LogUtil.j("Track_TrackDetailDataManager", "setDataList sportShareIcon is null. item name :", aVar.c());
            }
            arrayList.add(gykVar);
        }
        this.n = arrayList;
    }

    public void c(SportDetailItem.a aVar) {
        if (aVar == null) {
            LogUtil.j("Track_TrackDetailDataManager", "setChiefData chiefData is null");
            return;
        }
        gyk gykVar = new gyk();
        gykVar.a(aVar.c());
        gykVar.e(aVar.j());
        gykVar.b(aVar.h());
        gykVar.d(aVar.b());
        gykVar.c(aVar.e());
        haj.a aVarC = haj.c(aVar.e());
        if (aVar.e().equals("CALORIES")) {
            gykVar.a(qre.f(R.string.IDS_track_total_calorie));
        }
        if (aVarC != null) {
            gykVar.a(aVarC.e());
            gykVar.a(aVarC.a());
        }
        this.d = gykVar;
    }

    public List<gyk> o() {
        return this.n;
    }

    public gyk i() {
        return this.d;
    }

    public void a(MotionPathSimplify motionPathSimplify) {
        this.h = motionPathSimplify;
    }

    public void a(MotionPath motionPath) {
        this.i = motionPath;
    }

    public void e(List<jbt> list) {
        this.k.clear();
        this.o.clear();
        if (njy.b(list)) {
            for (jbt jbtVar : list) {
                if (jbtVar != null) {
                    jqp jqpVar = new jqp();
                    jqpVar.a(jbtVar.c());
                    jqpVar.a(jbtVar.b());
                    jqpVar.r();
                    this.k.add(jbtVar);
                    this.o.add(jqpVar);
                }
            }
        }
    }

    public MotionPath b() {
        return this.i;
    }

    public MotionPathSimplify d() {
        return this.h;
    }

    public int b(Context context) {
        jaa.d(context);
        int iA = jaa.a();
        if (iA == 0) {
            if (q() || ay()) {
                for (jqp jqpVar : this.o) {
                    if (jqpVar != null && jqpVar.b() != null) {
                        double[] dArr = new double[2];
                        if (d(dArr, jqpVar.b().requestLbsDataMap()) == 0) {
                            return jaa.a(context, dArr[0], dArr[1]);
                        }
                        iA = -1;
                    }
                }
                return iA;
            }
            MotionPath motionPath = this.i;
            if (motionPath != null) {
                double[] dArr2 = new double[2];
                if (d(dArr2, motionPath.requestLbsDataMap()) == 0) {
                    return jaa.a(context, dArr2[0], dArr2[1]);
                }
                return -1;
            }
        }
        return iA;
    }

    private int d(double[] dArr, Map<Long, double[]> map) {
        if (map == null) {
            LogUtil.e("Track_TrackDetailDataManager", "lbsDataMap is null");
            return -1;
        }
        for (Map.Entry<Long, double[]> entry : map.entrySet()) {
            if (entry != null && entry.getValue() != null && entry.getValue().length >= 2) {
                dArr[0] = entry.getValue()[0];
                dArr[1] = entry.getValue()[1];
                if (!izt.a(new jpg(dArr[0], dArr[1]))) {
                    return 0;
                }
                LogUtil.a("Track_TrackDetailDataManager", "isPausePoint");
            }
        }
        return -1;
    }

    public MotionData g() {
        return this.j;
    }

    public Map<SportDetailChartDataType, jph> j() {
        return this.f38834c;
    }

    public List<jbt> m() {
        return this.k;
    }

    public List<jqp> n() {
        return this.o;
    }

    public List<MotionData> l() {
        if (njy.b(this.o)) {
            ArrayList arrayList = new ArrayList(this.o.size());
            for (jqp jqpVar : this.o) {
                MotionData motionDataG = jqpVar.g();
                if (motionDataG != null && !jqpVar.by()) {
                    arrayList.add(motionDataG);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public List<MotionData> a() {
        ArrayList arrayList = new ArrayList(this.o.size() + 1);
        if (this.j != null && !by()) {
            arrayList.add(this.j);
        }
        arrayList.addAll(l());
        return arrayList;
    }

    public boolean k() {
        return njy.b(this.k);
    }

    public List<njj> b(int i) {
        if (c(i)) {
            return this.h.localePaceList();
        }
        MotionPath motionPath = this.i;
        if (motionPath != null) {
            return motionPath.localePaceList();
        }
        return null;
    }

    private boolean c(int i) {
        MotionPathSimplify motionPathSimplify;
        if (i != 264 || (motionPathSimplify = this.h) == null) {
            return false;
        }
        return njy.b(motionPathSimplify.localePaceList());
    }

    public boolean a(int i) {
        switch (i) {
            case 0:
                return this.f38833b[0];
            case 1:
                return this.f38833b[1];
            case 2:
                return this.f38833b[2];
            case 3:
                return this.f38833b[3];
            case 4:
                return this.f38833b[4];
            case 5:
                return this.f38833b[5];
            case 6:
                return this.f38833b[6];
            default:
                return false;
        }
    }

    public boolean q() {
        MotionPathSimplify motionPathSimplify = this.h;
        return motionPathSimplify != null && motionPathSimplify.requestSportType() == 512;
    }

    public void r() {
        if (q() || ay()) {
            bm();
        } else {
            bl();
        }
    }

    private void bl() {
        MotionPathSimplify motionPathSimplify;
        this.f38833b[4] = true;
        if (by()) {
            this.f38833b[0] = true;
        }
        if (bq() && au()) {
            this.f38833b[1] = true;
        }
        MotionPath motionPath = this.i;
        if (motionPath != null) {
            this.f = motionPath.isValidSpeedList();
        } else {
            this.f = false;
        }
        bi();
        boolean z = this.f38834c.get(SportDetailChartDataType.GROUND_CONTACT_TIME).j() && this.f38834c.get(SportDetailChartDataType.GROUND_IMPACT_ACCELERATION).j() && this.f38834c.get(SportDetailChartDataType.HANG_TIME).j() && this.f38834c.get(SportDetailChartDataType.GROUND_HANG_TIME_RATE).j();
        boolean zJ = this.f38834c.get(SportDetailChartDataType.ALTITUDE).j();
        boolean z2 = cb() || bx() || this.f38834c.get(SportDetailChartDataType.HEART_RATE).j();
        boolean zJ2 = this.f38834c.get(SportDetailChartDataType.SPEED_RATE).j();
        boolean zJ3 = this.f38834c.get(SportDetailChartDataType.PULL_FREQ).j();
        boolean zJ4 = this.f38834c.get(SportDetailChartDataType.SWOLF).j();
        boolean zJ5 = this.f38834c.get(SportDetailChartDataType.STEP_RATE).j();
        boolean zJ6 = this.f38834c.get(SportDetailChartDataType.REALTIME_PACE).j();
        boolean zJ7 = this.f38834c.get(SportDetailChartDataType.CADENCE).j();
        boolean zJ8 = this.f38834c.get(SportDetailChartDataType.PADDLE_FREQUENCY).j();
        boolean zJ9 = this.f38834c.get(SportDetailChartDataType.POWER).j();
        boolean zV = v();
        boolean zJ10 = this.f38834c.get(SportDetailChartDataType.PEAK_WEIGHT).j();
        boolean z3 = cb() || bx() || this.f38834c.get(SportDetailChartDataType.HEART_RATE_RECOVERY).j();
        if (zJ && z2 && zJ2 && zJ3 && zJ4 && zJ5 && zJ6 && z && u() && zJ7 && zJ8 && zJ9 && z3 && zJ10 && zV) {
            this.f38833b[2] = true;
        }
        this.f38833b[5] = !ca();
        this.f38833b[6] = !bb();
        LogUtil.a("Track_TrackDetailDataManager", "hideRadioView() hideRadioList is ", Arrays.toString(this.f38833b));
        MotionPath motionPath2 = this.i;
        if (motionPath2 == null || (motionPathSimplify = this.h) == null) {
            return;
        }
        this.j = izl.c(motionPath2, motionPathSimplify);
    }

    public void bd() {
        MotionPath motionPath = this.i;
        if (motionPath != null) {
            this.j.setLbsDataMap(motionPath.requestLbsDataMap());
        }
    }

    private void bm() {
        if (by()) {
            this.f38833b[0] = true;
        }
        boolean[] zArr = this.f38833b;
        zArr[1] = true;
        zArr[2] = true;
        zArr[3] = true;
        zArr[5] = true;
        if (k()) {
            this.f38833b[4] = false;
        }
        this.f38833b[6] = true;
        bj();
    }

    private void bi() {
        for (SportDetailChartDataType sportDetailChartDataType : SportDetailChartDataType.values()) {
            jph jphVar = new jph();
            switch (AnonymousClass2.f38835b[sportDetailChartDataType.ordinal()]) {
                case 1:
                    jphVar.d(bp());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 2:
                    jphVar.d(bs());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 3:
                    jphVar.d(ar());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 4:
                    jphVar.d(w());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 5:
                    jphVar.d(br());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 6:
                    jphVar.d(bw());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 7:
                    jphVar.d(bv());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 8:
                    jphVar.d(bu());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 9:
                    jphVar.d(bz());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 10:
                    jphVar.d(as());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 11:
                    jphVar.d(ac());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 12:
                    jphVar.d(ae());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                case 13:
                    jphVar.d(aa());
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
                default:
                    if (!c(sportDetailChartDataType, jphVar)) {
                        this.f38834c.put(sportDetailChartDataType, jphVar);
                    }
                    break;
            }
        }
    }

    private boolean c(SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        switch (sportDetailChartDataType) {
            case GROUND_IMPACT_ACCELERATION:
                jphVar.d(z());
                return false;
            case VERTICAL_RATIO:
                jphVar.d(av());
                return false;
            case GC_TIME_BALANCE:
                jphVar.d(ad());
                return false;
            case VERTICAL_OSCILLATION:
                jphVar.d(ax());
                return false;
            case ACTIVE_PEAK:
                jphVar.d(ai());
                return false;
            case JUMP_HEIGHT:
                jphVar.d(u());
                return false;
            case JUMP_TIME:
                jphVar.d(u());
                return false;
            case POWER:
                jphVar.d(bt());
                return false;
            case ANALOG_POWER:
                jphVar.d(bo());
                return false;
            case ANALOG_CADENCE:
                jphVar.d(bn());
                return false;
            case HEART_RATE_RECOVERY:
                jphVar.d(an());
                return false;
            case PEAK_WEIGHT:
                jphVar.d(am());
                return false;
            default:
                return true;
        }
    }

    private boolean bx() {
        MotionPathSimplify motionPathSimplify = this.h;
        return motionPathSimplify != null && motionPathSimplify.requestSportType() == 290;
    }

    private boolean cb() {
        MotionPathSimplify motionPathSimplify = this.h;
        return motionPathSimplify != null && motionPathSimplify.requestSportType() == 283;
    }

    private void bj() {
        for (SportDetailChartDataType sportDetailChartDataType : SportDetailChartDataType.values()) {
            jph jphVar = new jph();
            switch (AnonymousClass2.f38835b[sportDetailChartDataType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 7:
                case 8:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                    jphVar.d(false);
                    this.f38834c.put(sportDetailChartDataType, jphVar);
                    break;
            }
        }
    }

    public int f() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f38833b;
            if (i >= zArr.length) {
                return 0;
            }
            if (!zArr[i]) {
                return i;
            }
            i++;
        }
    }

    private boolean by() {
        int iRequestSportType;
        if (njy.b(this.o)) {
            Iterator<jqp> it = this.o.iterator();
            while (it.hasNext()) {
                if (!it.next().by()) {
                    return false;
                }
            }
        }
        if (!bk() && (iRequestSportType = this.h.requestSportType()) != 231 && iRequestSportType != 232) {
            if (this.h.requestSportType() == 222) {
                return njy.e(this.i.requestMarkPointList()) || this.i.requestMarkPointList().size() < 2;
            }
            if (this.h.hasTrackPoint() && this.i.requestLbsDataMap().size() >= 3) {
                return false;
            }
        }
        return true;
    }

    private boolean ca() {
        if (bk() || this.h.requestSportType() == 264) {
            return false;
        }
        return njy.b(this.i.requestSegmentList());
    }

    public boolean bb() {
        MotionPathSimplify motionPathSimplify = this.h;
        return (motionPathSimplify == null || motionPathSimplify.requestSportType() != 283 || this.h.getExtendDataFloat("enduranceAbilityRank") == -1.0f) ? false : true;
    }

    private boolean bu() {
        if (bk()) {
            return true;
        }
        return !this.i.isValidPullFreqList();
    }

    private boolean bz() {
        if (bk()) {
            return true;
        }
        return !this.i.isValidSwolfList();
    }

    private boolean bv() {
        return bk() || this.h.requestSportType() == 265 || this.h.requestSportType() == 279 || this.h.requestSportType() == 271 || !this.f || be();
    }

    private boolean bq() {
        if (bk()) {
            return true;
        }
        return njy.e(njv.d(b(d().requestSportType())));
    }

    private boolean bs() {
        if (bk()) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoStepRateDetail,isInvalidMotionPathSimplifyAndMotionPath");
            return true;
        }
        int iRequestSportType = this.h.requestSportType();
        if (iRequestSportType == 260 || iRequestSportType == 274) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoStepRateDetail,SportType:", Integer.valueOf(iRequestSportType));
            return true;
        }
        if (jpq.c(iRequestSportType, this.h)) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoStepRateDetail sportType and is old  ", Integer.valueOf(iRequestSportType));
            return true;
        }
        if (!this.i.isValidStepRateList()) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoStepRateDetail,isValidStepRateList");
            return true;
        }
        if (this.i.requestStepRateList().size() > 0) {
            int iA = gzz.a((StepRateData) Collections.max(this.i.requestStepRateList(), new Comparator<StepRateData>(this) { // from class: jqp.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public int compare(StepRateData stepRateData, StepRateData stepRateData2) {
                    return gzz.a(stepRateData) - gzz.a(stepRateData2);
                }
            }));
            int iRequestAvgStepRate = this.h.requestAvgStepRate();
            if (iA == 0 || iA > 300) {
                LogUtil.a("Track_TrackDetailDataManager", "stepRatemax is zero or too SportsRecordingCardReaderbig");
            } else {
                LogUtil.a("Track_TrackDetailDataManager", "stepRate avg is bigger than max ");
                return iRequestAvgStepRate == 0 || iRequestAvgStepRate > iA;
            }
        }
        return true;
    }

    private boolean bw() {
        if (bk()) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoPaddleFreqDetail,isInvalidMotionPathSimplifyAndMotionPath");
            return true;
        }
        if (this.h.requestSportType() != 274) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoPaddleFreqDetail,SportType:", Integer.valueOf(this.h.requestSportType()));
            return true;
        }
        int iA = jpq.a(this.h);
        if (iA <= 0) {
            LogUtil.e("Track_TrackDetailDataManager", "isNoPaddleFreqDetail,paddle times is 0:", Integer.valueOf(iA));
            return true;
        }
        if (this.i.isValidPaddleData()) {
            return false;
        }
        LogUtil.a("Track_TrackDetailDataManager", "isNoPaddleFreqDetail,isValidPaddleFreqList");
        return true;
    }

    private boolean br() {
        int iC;
        if (bk()) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoCadenceRateDetail,isInvalidMotionPathSimplifyAndMotionPath");
            return true;
        }
        if (this.h.requestSportType() != 273 && this.h.requestSportType() != 265 && this.h.requestSportType() != 259) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoCadenceRateDetail,SportType:", Integer.valueOf(this.h.requestSportType()));
            return true;
        }
        if (!this.i.isValidCadenceData()) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoCadenceRateDetail,isValidCadenceRateList");
            return true;
        }
        List<gzr> listRequestRidePostureDataList = this.i.requestRidePostureDataList();
        if (njy.b(listRequestRidePostureDataList)) {
            iC = ((gzr) Collections.max(listRequestRidePostureDataList, new Comparator() { // from class: jqn
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return jqp.e((gzr) obj, (gzr) obj2);
                }
            })).c();
        } else {
            LogUtil.e("Track_TrackDetailDataManager", "maxCadenceRate  is  zero");
            iC = 0;
        }
        int iC2 = jpq.c(this.h, this.i);
        if (iC2 > 0 && iC2 <= iC) {
            return false;
        }
        LogUtil.e("Track_TrackDetailDataManager", "isNoPaddleFreqDetail,paddle times is 0: or candaceRate avg is bigger than max", Integer.valueOf(iC2), "max =", Integer.valueOf(iC));
        return true;
    }

    static /* synthetic */ int e(gzr gzrVar, gzr gzrVar2) {
        return gzrVar.c() - gzrVar2.c();
    }

    private boolean bt() {
        if (bk()) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoPowerDetail,isInvalidMotionPathSimplifyAndMotionPath");
            return true;
        }
        if (this.h.requestSportType() != 273 && this.h.requestSportType() != 274 && this.h.requestSportType() != 265 && this.h.requestSportType() != 259 && !jpq.j(this.h.requestSportType())) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoPowerDetail,SportType() == ", Integer.valueOf(this.h.requestSportType()));
            return true;
        }
        if (!this.i.isValidPowerData()) {
            LogUtil.a("Track_TrackDetailDataManager", "isNoPowerDetail,isValidPowerData");
            return true;
        }
        LogUtil.a("Track_TrackDetailDataManager", "isNoPowerDetail return false");
        return false;
    }

    private boolean bo() {
        if (bk()) {
            ReleaseLogUtil.d("Track_TrackDetailDataManager", "isNoAnalogPowerDetail,isInvalidMotionPathSimplifyAndMotionPath");
            return true;
        }
        if (this.h.requestSportType() != 259) {
            ReleaseLogUtil.d("Track_TrackDetailDataManager", "isNoAnalogPowerDetail,SportType() == ", Integer.valueOf(this.h.requestSportType()));
            return true;
        }
        if (!this.i.isValidAnalogPowerData()) {
            ReleaseLogUtil.d("Track_TrackDetailDataManager", "isNoAnalogPowerDetail,isValidAnalogPowerData");
            return true;
        }
        ReleaseLogUtil.d("Track_TrackDetailDataManager", "isNoAnalogPowerDetail return false");
        return false;
    }

    private boolean bn() {
        if (bk()) {
            ReleaseLogUtil.d("Track_TrackDetailDataManager", "isNoAnalogCadenceDetail,isInvalidMotionPathSimplifyAndMotionPath");
            return true;
        }
        if (this.h.requestSportType() != 259) {
            ReleaseLogUtil.d("Track_TrackDetailDataManager", "isNoAnalogCadenceDetail,SportType() == ", Integer.valueOf(this.h.requestSportType()));
            return true;
        }
        if (!this.i.isValidAnalogCadenceData()) {
            ReleaseLogUtil.d("Track_TrackDetailDataManager", "isNoAnalogCadenceDetail,isValidAnalogCadenceData");
            return true;
        }
        ReleaseLogUtil.d("Track_TrackDetailDataManager", "isValidAnalogCadenceData return false");
        return false;
    }

    private boolean bp() {
        if (bk()) {
            LogUtil.a("Track_TrackDetailDataManager", "motionPath is null");
            return true;
        }
        if (!this.i.isValidHeartRateList()) {
            LogUtil.a("Track_TrackDetailDataManager", "motionPath is null");
            return true;
        }
        if (this.i.requestHeartRateList().size() > 1) {
            int iD = gzz.d(this.i.requestHeartRateList());
            int iRequestAvgHeartRate = this.h.requestAvgHeartRate();
            LogUtil.a("Track_TrackDetailDataManager", "heartRateMax ", Integer.valueOf(iD), " avgHeartRate ", Integer.valueOf(iRequestAvgHeartRate));
            if (iD != 0 && iRequestAvgHeartRate != 0 && iRequestAvgHeartRate <= iD) {
                return false;
            }
        }
        return true;
    }

    public boolean as() {
        return (!bk() && this.i.isValidSpo2List() && cc()) ? false : true;
    }

    private boolean cc() {
        int iRequestMinSpo2 = this.h.requestMinSpo2();
        int iRequestMaxSpo2 = this.h.requestMaxSpo2();
        return iRequestMinSpo2 > 0 && iRequestMinSpo2 <= 100 && iRequestMaxSpo2 > 0 && iRequestMaxSpo2 <= 100;
    }

    public boolean w() {
        return bk() || !this.i.isValidAltitudeList();
    }

    public boolean ar() {
        if (!this.f || !be()) {
            return true;
        }
        if (this.h.requestSportType() == 273 && !jpq.f(this.h.requestSportDataSource())) {
            LogUtil.a("Track_TrackDetailDataManager", "isHideSpeedView,SportType:", Integer.valueOf(this.h.requestSportType()));
            return true;
        }
        if (Math.abs((float) jpq.c(this.h.requestAvgPace())) < 1.0E-4f) {
            LogUtil.a("Track_TrackDetailDataManager", "avgSpeed is zero");
            return true;
        }
        LogUtil.a("Track_TrackDetailDataManager", "isHideSpeedView return false");
        return false;
    }

    public boolean ae() {
        if (bk()) {
            return true;
        }
        return !hah.h(this.i.requestRunningPostureList());
    }

    public boolean ad() {
        if (bk()) {
            return true;
        }
        return !hah.c(this.i.requestRunningPostureList());
    }

    public boolean ax() {
        if (bk()) {
            return true;
        }
        return !hah.f(this.i.requestRunningPostureList());
    }

    public boolean ai() {
        if (bk()) {
            return true;
        }
        return !hah.a(this.i.requestRunningPostureList());
    }

    public boolean z() {
        if (bk() || aq()) {
            return true;
        }
        return !hah.e(this.i.requestRunningPostureList());
    }

    public boolean av() {
        if (!bk() && this.h.getExtendDataInt("avg_v_s_r") > 0) {
            return !hah.i(this.i.requestRunningPostureList());
        }
        return true;
    }

    public boolean aq() {
        if (bk()) {
            return true;
        }
        return !hah.j(this.i.requestRunningPostureList());
    }

    public boolean ac() {
        if (bk()) {
            return true;
        }
        return !hah.b(this.i.requestRunningPostureList());
    }

    public boolean aa() {
        if (bk() || aq() || this.h.requestGroundHangTimeRate() <= 0.0f) {
            return true;
        }
        ArrayList<gzv> arrayListRequestRunningPostureList = this.i.requestRunningPostureList();
        Iterator<gzv> it = arrayListRequestRunningPostureList.iterator();
        while (it.hasNext()) {
            if (it.next().k() > 0) {
                return false;
            }
        }
        Iterator<gzv> it2 = arrayListRequestRunningPostureList.iterator();
        while (it2.hasNext()) {
            if (it2.next().l() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean bk() {
        return this.h == null || this.i == null;
    }

    public List<njj> bg() {
        return njv.d(b(d().requestSportType()));
    }

    public Float[] a(List<njj> list) {
        if (list == null || list.size() <= 1) {
            return null;
        }
        return njv.b(list);
    }

    public boolean bf() {
        return (bk() || this.h.requestAbnormalTrack() == 0) ? false : true;
    }

    public boolean p() {
        return !bk() && this.h.hasTrackPoint() && this.h.requestSportDataSource() == 6;
    }

    public boolean s() {
        return !bk() && this.h.requestDuplicated() == 1;
    }

    public boolean ag() {
        return this.f38834c.get(SportDetailChartDataType.HEART_RATE).j();
    }

    public boolean aw() {
        return this.f38834c.get(SportDetailChartDataType.STEP_RATE).j();
    }

    public boolean x() {
        return this.f38834c.get(SportDetailChartDataType.ALTITUDE).j();
    }

    public boolean ao() {
        return this.f38834c.get(SportDetailChartDataType.SPEED_RATE).j();
    }

    public boolean ab() {
        return this.f38834c.get(SportDetailChartDataType.CADENCE).j();
    }

    public boolean ah() {
        return this.f38834c.get(SportDetailChartDataType.PADDLE_FREQUENCY).j();
    }

    public boolean af() {
        return this.f38834c.get(SportDetailChartDataType.POWER).j();
    }

    public boolean v() {
        if (!af()) {
            ReleaseLogUtil.d("Track_TrackDetailDataManager", "The power chart has been displayed.");
            return true;
        }
        return this.f38834c.get(SportDetailChartDataType.ANALOG_POWER).j();
    }

    public boolean y() {
        if (!ab()) {
            ReleaseLogUtil.d("Track_TrackDetailDataManager", "The cadence chart has been displayed.");
            return true;
        }
        return this.f38834c.get(SportDetailChartDataType.ANALOG_CADENCE).j();
    }

    public boolean be() {
        MotionPathSimplify motionPathSimplify = this.h;
        return motionPathSimplify != null && jpq.i(motionPathSimplify.requestSportType());
    }

    public boolean au() {
        if (bk()) {
            return true;
        }
        if (UnitUtil.f()) {
            return this.h.requestBritishSwimSegments() == null || this.h.requestBritishSwimSegments().size() <= 0;
        }
        return this.h.requestSwimSegments() == null || this.h.requestSwimSegments().size() <= 0;
    }

    public boolean u() {
        return bk() || this.i.requestJumpDataList() == null || this.i.requestJumpDataList().size() <= 0;
    }

    public boolean at() {
        return this.f38834c.get(SportDetailChartDataType.SWOLF).j();
    }

    public boolean ak() {
        return this.f38834c.get(SportDetailChartDataType.PULL_FREQ).j();
    }

    public boolean al() {
        return this.f38834c.get(SportDetailChartDataType.REALTIME_PACE).j();
    }

    public boolean ap() {
        return bk() || this.i.requestSkippingSpeedList() == null || this.i.requestSkippingSpeedList().size() <= 1 || !c(this.i.requestSkippingSpeedList());
    }

    private boolean c(List<njg> list) {
        for (njg njgVar : list) {
            if (njgVar != null && njgVar.c() > 0) {
                return true;
            }
        }
        return false;
    }

    public Pair<float[], float[]> e() {
        MotionPathSimplify motionPathSimplify = this.h;
        if (motionPathSimplify == null) {
            LogUtil.a("Track_TrackDetailDataManager", "acquireSkipPerformanceScore, mMotionPathSimplify is null");
            return null;
        }
        float extendDataFloat = motionPathSimplify.getExtendDataFloat("maxSkipSpeed");
        float extendDataFloat2 = this.h.getExtendDataFloat("maxSkipSpeedRank");
        float extendDataFloat3 = this.h.getExtendDataFloat("enduranceTimeAbility") / 60.0f;
        float extendDataFloat4 = this.h.getExtendDataFloat("enduranceTimeAbilityRank");
        float extendDataFloat5 = this.h.getExtendDataFloat("maxSkippingTimes");
        float extendDataFloat6 = this.h.getExtendDataFloat("maxSkippingTimesAbilityRank");
        return new Pair<>(new float[]{extendDataFloat, extendDataFloat3, extendDataFloat5, this.h.getExtendDataFloat("skipNum"), this.h.getExtendDataFloat("enduranceAbility")}, new float[]{extendDataFloat2, extendDataFloat4, extendDataFloat6, this.h.getExtendDataFloat("skipNumAbilityRank"), this.h.getExtendDataFloat("enduranceAbilityRank")});
    }

    public void b(Pair<float[], float[]> pair) {
        this.l = pair;
    }

    public Pair<float[], float[]> c() {
        return this.l;
    }

    public boolean am() {
        return bk() || this.i.requestWeightList() == null || this.i.requestWeightList().size() <= 1;
    }

    public boolean an() {
        return bk() || this.i.requestHeartRecoveryRateList() == null || this.i.requestHeartRecoveryRateList().size() <= 1;
    }

    public boolean aj() {
        return this.f38834c.get(SportDetailChartDataType.GROUND_CONTACT_TIME).j() && this.f38834c.get(SportDetailChartDataType.GROUND_IMPACT_ACCELERATION).j() && this.f38834c.get(SportDetailChartDataType.HANG_TIME).j() && this.f38834c.get(SportDetailChartDataType.GROUND_HANG_TIME_RATE).j() && this.f38834c.get(SportDetailChartDataType.GC_TIME_BALANCE).j() && this.f38834c.get(SportDetailChartDataType.VERTICAL_OSCILLATION).j() && this.f38834c.get(SportDetailChartDataType.VERTICAL_RATIO).j() && this.f38834c.get(SportDetailChartDataType.ACTIVE_PEAK).j();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f38834c = new HashMap<>(20);
    }

    public boolean t() {
        MotionPath motionPath = this.i;
        if (motionPath != null && motionPath.requestRealTimePaceList() != null && this.i.requestRunningPostureList() != null && this.i.requestRunningPostureList().size() >= 3) {
            return false;
        }
        LogUtil.j("Track_TrackDetailDataManager", "motionPath is invalid for posture");
        return true;
    }

    public boolean az() {
        return this.e;
    }

    public void e(boolean z) {
        this.e = z;
    }

    public boolean ba() {
        return this.f38832a;
    }

    public void a(boolean z) {
        this.f38832a = z;
    }

    public String h() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public boolean c(Context context) {
        if (this.h == null) {
            return false;
        }
        int iB = b(context);
        return ce() && (iB == 1 || iB == 3);
    }

    private boolean ce() {
        int iRequestSportType;
        MotionPathSimplify motionPathSimplify = this.h;
        return (motionPathSimplify == null || (iRequestSportType = motionPathSimplify.requestSportType()) == 266 || iRequestSportType == 262 || iRequestSportType == 222) ? false : true;
    }

    public boolean ay() {
        MotionPathSimplify motionPathSimplify = this.h;
        if (motionPathSimplify != null) {
            return motionPathSimplify.requestTrackType() == 8;
        }
        LogUtil.a("Track_TrackDetailDataManager", "isMergeTrackSportType mMotionPathSimplify is null");
        return false;
    }

    public boolean bh() {
        MotionPathSimplify motionPathSimplify = this.h;
        if (motionPathSimplify == null) {
            LogUtil.a("Track_TrackDetailDataManager", "isShowSkiTimePercentage mMotionPathSimplify is null");
            return false;
        }
        if (!nub.a(motionPathSimplify.requestSportType())) {
            LogUtil.a("Track_TrackDetailDataManager", "isShowSkiTimePercentage sportType not supported");
            return false;
        }
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.h.requestTotalTime());
        int extendDataInt = this.h.getExtendDataInt("skiCableTime", -1);
        if (seconds > 0 && extendDataInt > 0) {
            return true;
        }
        ReleaseLogUtil.d("Track_TrackDetailDataManager", "isShowSkiTimePercentage skiTime or skiCableTime invalid");
        return false;
    }

    public boolean bc() {
        MotionPathSimplify motionPathSimplify = this.h;
        if (motionPathSimplify == null) {
            LogUtil.a("Track_TrackDetailDataManager", "isShowSkiPistePercentage mMotionPathSimplify is null");
            return false;
        }
        if (!nub.b(motionPathSimplify.requestSportType())) {
            LogUtil.a("Track_TrackDetailDataManager", "isShowSkiPistePercentage sportType not supported");
            return false;
        }
        int extendDataInt = this.h.getExtendDataInt("skiPisteRegion", -1);
        if (extendDataInt == 1 || extendDataInt == 2 || extendDataInt == 3) {
            return true;
        }
        ReleaseLogUtil.e("Track_TrackDetailDataManager", "skiPisteRegion invalid ", Integer.valueOf(extendDataInt));
        return false;
    }
}
