package com.huami.mifit.sportlib.core;

import android.util.SparseArray;
import com.hm.sport.algorithm.AlignData;
import com.hm.sport.algorithm.GpsData;
import com.hm.sport.algorithm.StatisticsData;
import com.huami.firstbeat.ete.EteRealTimeInput;
import com.huami.mifit.sportlib.callback.IServiceDataCallback;
import com.huami.mifit.sportlib.callback.IServiceSportCallback;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.core.model.GPSActiveBar;
import com.huami.mifit.sportlib.core.model.GPSActiveDistance;
import com.huami.mifit.sportlib.core.model.GPSActiveHr;
import com.huami.mifit.sportlib.core.model.GPSActiveMiPlusStep;
import com.huami.mifit.sportlib.core.model.GPSActiveStatistic;
import com.huami.mifit.sportlib.core.model.GPSActiveStep;
import com.huami.mifit.sportlib.core.model.GPSActiveTrack;
import com.huami.mifit.sportlib.core.model.GPSIndexPace;
import com.huami.mifit.sportlib.core.model.GPSIndexPaceInfos;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportRawDataTransformer;
import com.huami.mifit.sportlib.devicekit.SportDeviceKit;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.model.SportRecord;
import com.huami.mifit.sportlib.tts.DistanceVoiceInfo;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import com.huami.mifit.sportlib.utils.ConfigUtils;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.mifit.sportlib.utils.RunUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class b {
    private static final String H = "GPSDataHandler";
    private static final boolean I = true;
    private static final int J = 100;
    private List<GPSPoint> D;
    private boolean E;
    private int F;
    private GPSActiveStatistic c;
    private long d;
    private GPSActiveHr k;
    public boolean r;
    private IServiceDataCallback w;
    private IServiceSportCallback x;
    private GPSActiveStatistic a = new GPSActiveStatistic(-1);
    private GPSActiveStatistic b = new GPSActiveStatistic(-1);
    private volatile long e = 0;
    private float f = Float.MIN_VALUE;
    private float g = Float.MAX_VALUE;
    private GPSIndexPaceInfos h = new GPSIndexPaceInfos();
    private int i = 0;
    private GPSActiveTrack j = null;
    private GPSActiveDistance l = null;
    private GPSActiveStep m = null;
    private GPSActiveMiPlusStep n = null;
    private float o = -20000.0f;
    private float p = -1.0f;
    private float q = -1.0f;
    private LinkedHashMap<Long, GPSPoint> s = new k();
    private ExecutorService t = Executors.newSingleThreadExecutor();
    private ExecutorService u = Executors.newSingleThreadExecutor();
    private ExecutorService v = Executors.newSingleThreadExecutor();
    private int y = 0;
    private int z = 0;
    private GPSPoint A = null;
    private GPSPoint B = null;
    private boolean C = true;
    private SparseArray<GPSActiveTrack> G = new SparseArray<>();

    public class a implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.x != null) {
                try {
                    b.this.x.onDeviceStatusChanged(this.a, this.b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.mifit.sportlib.core.b$b, reason: collision with other inner class name */
    public class RunnableC0479b implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public RunnableC0479b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.x != null) {
                try {
                    b.this.w.onHrChanged(this.a, this.b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.C = false;
            b.this.V();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.C = false;
            b.this.P();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.Q();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.C = true;
            b.this.R();
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ float[] a;
        public final /* synthetic */ int[] b;

        public g(float[] fArr, int[] iArr) {
            this.a = fArr;
            this.b = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.O(this.a, this.b);
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ ArrayList a;

        public h(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.size() > 0) {
                b.this.o0(this.a);
            }
        }
    }

    public class i implements Comparator<GPSPoint> {
        public i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(GPSPoint gPSPoint, GPSPoint gPSPoint2) {
            if (gPSPoint.getTime() == gPSPoint2.getTime()) {
                return 0;
            }
            return gPSPoint.getTime() > gPSPoint2.getTime() ? 1 : -1;
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.m0(false);
            if (b.this.D.size() == 0) {
                b.this.D = null;
                return;
            }
            b bVar = b.this;
            bVar.A = ((GPSPoint) bVar.D.get(b.this.D.size() - 1)).m3384clone();
            b bVar2 = b.this;
            bVar2.B = bVar2.A.m3384clone();
            if (b.this.w == null) {
                b.this.D.clear();
                b.this.D = null;
                return;
            }
            if (b.this.A.isActive()) {
                try {
                    b.this.w.onLocationChanged(b.this.A);
                    b.this.w.onGPSLineInfoChanged(b.this.D, new RouteLineInfo(true, true));
                } catch (Exception e) {
                    LogKit.w2f(b.H, "restoreGpsLine:" + e.toString());
                }
            } else if (b.this.A.isPause()) {
                b bVar3 = b.this;
                bVar3.o0(bVar3.D);
            }
            b.this.D.clear();
            b.this.D = null;
        }
    }

    public class k extends LinkedHashMap<Long, GPSPoint> {
        public k() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Long, GPSPoint> entry) {
            return size() > 100;
        }
    }

    public class l implements Runnable {
        public final /* synthetic */ SportRecord a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public l(SportRecord sportRecord, long j, long j2) {
            this.a = sportRecord;
            this.b = j;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b.set(this.a);
            b bVar = b.this;
            bVar.f = bVar.b.getMaxRtPace();
            b bVar2 = b.this;
            bVar2.g = bVar2.b.getMinRtPace();
            b.this.h.fromJson(b.this.b.getStatistic());
            b.this.i = GPSDataRecover.b(this.b);
            b.this.e = this.c;
            long endTime = b.this.b.getEndTime();
            LogKit.w2f(b.H, "recoverRun breakTime:" + endTime);
            com.huami.mifit.sportlib.core.c.t(endTime);
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.m0(true);
            b bVar = b.this;
            bVar.y = bVar.D.size();
            b bVar2 = b.this;
            bVar2.z = bVar2.D.size();
        }
    }

    public class n implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public n(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.w.onSportControl(this.a, this.b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class o implements Runnable {
        public final /* synthetic */ long a;

        public o(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.C) {
                b.this.W(this.a);
            }
        }
    }

    public class p implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        public p(long j, int i) {
            this.a = j;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.C) {
                b.this.N(this.a, this.b);
            }
        }
    }

    public class q implements Runnable {
        public final /* synthetic */ GpsData[] a;
        public final /* synthetic */ int b;

        public q(GpsData[] gpsDataArr, int i) {
            this.a = gpsDataArr;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            GpsData[] gpsDataArr = this.a;
            LogKit.w2f(b.H, "handleReviseData act: " + b.this.C + ", timestamp:" + (gpsDataArr.length > 0 ? gpsDataArr[gpsDataArr.length - 1].getTime() : 0L));
            if (b.this.C) {
                b.this.S(this.b, this.a);
            }
        }
    }

    public class r implements Runnable {
        public final /* synthetic */ AlignData a;

        public r(AlignData alignData) {
            this.a = alignData;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.C) {
                b.this.L(this.a);
            }
        }
    }

    public class s implements Runnable {
        public final /* synthetic */ StatisticsData a;

        public s(StatisticsData statisticsData) {
            this.a = statisticsData;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.C) {
                b.this.T(this.a);
            }
        }
    }

    public class t implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public t(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.C) {
                b.this.U(this.a, this.b, this.c);
            }
        }
    }

    public class u implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public u(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.C) {
                if (b.this.n != null && b.this.n.getStep() == this.a && b.this.n.getLeftRight() == this.b) {
                    return;
                }
                b bVar = b.this;
                bVar.n = new GPSActiveMiPlusStep(bVar.d, this.a, this.c, this.d, this.b);
                com.huami.mifit.sportlib.core.c.o(b.this.n);
            }
        }
    }

    public b(long j2, int i2, IServiceDataCallback iServiceDataCallback, IServiceSportCallback iServiceSportCallback) {
        this.c = null;
        this.d = -1L;
        this.k = null;
        this.r = false;
        this.w = null;
        this.x = null;
        this.E = true;
        this.F = -1;
        this.d = j2;
        this.c = new GPSActiveStatistic(j2, new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()), i2);
        this.w = iServiceDataCallback;
        this.x = iServiceSportCallback;
        this.k = new GPSActiveHr(this.d);
        this.E = RunnerData.getRunner().isMetric();
        this.F = RunnerData.getRunner().getLocationProviderType();
        this.r = SportDeviceKit.getInstance().hasBaroMeter();
    }

    private void H(long j2, float f2, float f3, float f4) {
        long j3 = (j2 / 1000) * 1000;
        GPSActiveTrack gPSActiveTrackL = com.huami.mifit.sportlib.core.c.L(this.d, f2, f3, f4);
        if (gPSActiveTrackL == null) {
            LogKit.w2f(H, "alignToGps not match to :" + j3);
            return;
        }
        long timestamp = gPSActiveTrackL.getTimestamp();
        LogKit.w2f(H, "alignToGps gpsTime=" + timestamp + ",timestamp=" + j3 + ",pace=" + f2 + ",speed=" + f4);
        if (this.G.size() > 200) {
            this.G.removeAt(0);
        }
        this.G.put((int) (timestamp / 1000), gPSActiveTrackL);
    }

    private void I(GPSActiveStatistic gPSActiveStatistic, GPSActiveTrack gPSActiveTrack) {
        J(gPSActiveStatistic, gPSActiveTrack, true);
        J(gPSActiveStatistic, gPSActiveTrack, false);
    }

    private void J(GPSActiveStatistic gPSActiveStatistic, GPSActiveTrack gPSActiveTrack, boolean z) {
        float totalDis;
        int totalCost;
        float distance = gPSActiveStatistic.getDistance();
        int costTime = gPSActiveStatistic.getCostTime();
        int i2 = (int) (((double) distance) / (z ? 1000.0d : 1609.344d));
        if (i2 > 0 && this.h.get(i2, z) == null) {
            int i3 = i2 - 1;
            GPSIndexPace gPSIndexPace = this.h.get(i3, z);
            if (gPSIndexPace == null && i3 > 0) {
                while (i3 > 0 && this.h.get(i3, z) == null) {
                    i3--;
                }
                long totalCost2 = 0;
                float totalDis2 = 0.0f;
                if (i3 > 0) {
                    GPSIndexPace gPSIndexPace2 = this.h.get(i3, z);
                    totalCost2 = gPSIndexPace2.getTotalCost();
                    totalDis2 = gPSIndexPace2.getTotalDis();
                }
                int i4 = i2 - i3;
                totalCost = ((int) (((long) costTime) - totalCost2)) / i4;
                totalDis = (distance - totalDis2) / i4;
                long jCurrentTimeMillis = ((System.currentTimeMillis() / 1000) - this.d) / ((long) i4);
                int i5 = i3 + 1;
                int i6 = 0;
                while (i5 < i2) {
                    i6++;
                    GPSIndexPace gPSIndexPace3 = new GPSIndexPace(i5, totalCost, totalCost / totalDis);
                    gPSIndexPace3.setGpsIndex(-1);
                    gPSIndexPace3.setGeoHash("");
                    gPSIndexPace3.saveTotal((i6 * totalDis) + totalDis2, ((long) (i6 * totalCost)) + totalCost2);
                    gPSIndexPace3.setTrackInterpolation(((long) i6) * jCurrentTimeMillis);
                    gPSIndexPace3.setAveHr(gPSActiveStatistic.getAveHr());
                    this.h.add(i5, gPSIndexPace3, z);
                    i5++;
                    totalDis2 = totalDis2;
                    totalCost = totalCost;
                    totalDis = totalDis;
                }
            } else if (gPSIndexPace != null) {
                totalCost = (int) (((long) costTime) - gPSIndexPace.getTotalCost());
                totalDis = distance - gPSIndexPace.getTotalDis();
            } else {
                totalDis = distance;
                totalCost = costTime;
            }
            GPSIndexPace gPSIndexPace4 = new GPSIndexPace(i2, totalCost, totalCost / totalDis);
            gPSIndexPace4.saveTotal(distance, costTime);
            gPSIndexPace4.setGpsIndex(gPSActiveStatistic.getSize() - 1);
            gPSIndexPace4.setGeoHash(Geohash.encode(gPSActiveTrack.getLatitude(), gPSActiveTrack.getLongitude()));
            gPSIndexPace4.setTrackInterpolation((System.currentTimeMillis() / 1000) - this.d);
            gPSIndexPace4.setAveHr(gPSActiveStatistic.getAveHr());
            this.h.add(i2, gPSIndexPace4, z);
            LogKit.w2f(H, "current pace info:" + gPSIndexPace4);
            if (this.E == z) {
                r0(gPSIndexPace4, z);
                u0(totalCost, distance);
            }
        }
    }

    private GPSActiveTrack K(GpsData gpsData) {
        GPSActiveTrack gPSActiveTrack = new GPSActiveTrack(this.d);
        gPSActiveTrack.setTimestamp(gpsData.getTime());
        gPSActiveTrack.setState(1);
        gPSActiveTrack.setAccuracy(gpsData.getAccuracy());
        gPSActiveTrack.setLongitude((float) gpsData.getLongitude());
        gPSActiveTrack.setLatitude((float) gpsData.getLatitude());
        GPSActiveTrack gPSActiveTrack2 = this.G.get((int) (gpsData.getTime() / 1000));
        gPSActiveTrack.setPace(gPSActiveTrack2 == null ? 0.0f : gPSActiveTrack2.getPace());
        gPSActiveTrack.setSpeed(gPSActiveTrack2 != null ? gPSActiveTrack2.getSpeed() : 0.0f);
        gPSActiveTrack.setAltitude(gPSActiveTrack2 == null ? -20000.0f : gPSActiveTrack2.getAltitude());
        return gPSActiveTrack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(AlignData alignData) {
        GPSActiveTrack gPSActiveTrack = new GPSActiveTrack(this.d);
        this.j = gPSActiveTrack;
        gPSActiveTrack.setAccuracy(alignData.getAccuracy());
        this.j.setLatitude((float) alignData.getLatitude());
        this.j.setLongitude((float) alignData.getLongitude());
        this.j.setTimestamp(alignData.getTime());
        this.j.setHr(alignData.getHr());
        this.j.setBarometerAltitude(alignData.getBar());
        M(alignData.getTime(), alignData.getBar());
    }

    private void M(long j2, float f2) {
        if (f2 == -1.0f) {
            return;
        }
        com.huami.mifit.sportlib.core.c.l(new GPSActiveBar(this.d, j2, f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(long j2, int i2) {
        if (HeartRateConstant.isHRValueValid(i2)) {
            this.k.newHr(j2, i2);
            this.c.setAveHr(this.k.aveHr());
            com.huami.mifit.sportlib.core.c.n(this.k);
            this.c.setDevice(SportDeviceKit.getInstance().formatDeviceToString());
            try {
                this.w.onHrChanged(43, i2);
            } catch (Exception e2) {
                LogKit.w2f(H, "doHandleHr:" + e2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(float[] fArr, int[] iArr) {
        LogKit.w2f(H, "indoor:floats" + Arrays.toString(fArr) + " ints:" + Arrays.toString(iArr));
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != fArr.length - 1) {
                sb.append(String.valueOf(fArr[i2]));
                sb.append(",");
            } else {
                sb.append(String.valueOf(fArr[i2]));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != iArr.length - 1) {
                sb2.append(String.valueOf(iArr[i3]));
                sb2.append(",");
            } else {
                sb2.append(String.valueOf(iArr[i3]));
            }
        }
        ConfigUtils.setIndoorRunLearningResult(sb2.toString(), sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        GPSActiveTrack gPSActiveTrack = this.j;
        if (gPSActiveTrack != null) {
            this.i = gPSActiveTrack.getSteps();
            this.j.setState(2);
        }
        com.huami.mifit.sportlib.core.c.K(this.d, 2);
        if (this.b.getDistance() > this.c.getDistance()) {
            this.b.setType(this.c.getType());
            this.c.copy(this.b);
            LogKit.w2f(H, "data need init");
        } else {
            this.a.copy(this.b);
            v0(this.c);
        }
        GPSActiveStatistic gPSActiveStatistic = this.c;
        int i2 = this.y + 1;
        this.y = i2;
        gPSActiveStatistic.setSize(i2);
        com.huami.mifit.sportlib.core.c.u(this.c);
        if (RunningPlayer.getInstance() != null) {
            RunningPlayer.getInstance().playPause(this.c.getType());
        }
        try {
            LogKit.w2f(H, "doHandlePause HR:-1");
            this.w.onHrChanged(44, -1);
        } catch (Exception e2) {
            LogKit.w2f(H, "doHandlePause HR:" + e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        GPSPoint gPSPoint = this.A;
        if (gPSPoint == null) {
            return;
        }
        GPSPoint gPSPointM3384clone = gPSPoint.m3384clone();
        gPSPointM3384clone.setAttr(2);
        int i2 = this.z;
        this.z = i2 + 1;
        gPSPointM3384clone.setIndex(i2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(gPSPointM3384clone);
        o0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (com.huami.mifit.sportlib.core.c.e()) {
            LogKit.w2f(H, "doHandleResume pause by auto last distance =:" + this.a.getDistance());
            v0(this.a);
            this.i = 0;
        }
        com.huami.mifit.sportlib.core.c.v();
        RunningPlayer.getInstance().playResume(this.c.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i2, GpsData[] gpsDataArr) {
        GpsData[] gpsDataArr2 = gpsDataArr;
        String str = H;
        if (gpsDataArr2 == null || gpsDataArr2.length == 0) {
            LogKit.w2f(H, "handleReviseData GpsData size is 0!!!");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = gpsDataArr2.length;
        int i3 = 0;
        while (i3 < length) {
            GpsData gpsData = gpsDataArr2[i3];
            arrayList2.add(K(gpsData));
            String str2 = str;
            GPSPoint gPSPoint = new GPSPoint(gpsData.getTime(), gpsData.getLatitude(), gpsData.getLongitude(), gpsData.getAltitude(), gpsData.getAccuracy());
            gPSPoint.setProviderType(this.F);
            gPSPoint.setAttr(1);
            GPSPoint gPSPointRemove = this.s.remove(Long.valueOf(gpsData.getTime()));
            if (gPSPointRemove != null) {
                gPSPoint.setIndex(gPSPointRemove.getIndex());
            } else {
                int i4 = this.z;
                this.z = i4 + 1;
                gPSPoint.setIndex(i4);
                if (!gPSPoint.isMaskPoint()) {
                    arrayList.add(gPSPoint);
                }
                i3++;
                str = str2;
                gpsDataArr2 = gpsDataArr;
            }
            this.s.put(Long.valueOf(gpsData.getTime()), gPSPoint);
            i3++;
            str = str2;
            gpsDataArr2 = gpsDataArr;
        }
        String str3 = str;
        if (arrayList2.size() > 0) {
            int length2 = gpsDataArr.length;
            StringBuilder sb = new StringBuilder();
            sb.append("saveToGps time:");
            int i5 = length2 - 1;
            sb.append(gpsDataArr[i5].getTime());
            sb.append(",pace:");
            sb.append(((GPSActiveTrack) arrayList2.get(i5)).getPace());
            sb.append(",size:");
            sb.append(length2);
            LogKit.w2f(str3, sb.toString());
            com.huami.mifit.sportlib.core.c.r(arrayList2);
        }
        this.v.execute(new h(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(StatisticsData statisticsData) {
        float distance = statisticsData.getDistance() + this.b.getDistance();
        this.c.setDistance(distance);
        this.c.setCostCal(statisticsData.getKcal() + this.b.getCostCal());
        int costTime = this.c.getCostTime();
        this.c.setClimbDisAscend(statisticsData.getRidingInfo().getDistance3DAscend() + this.b.getClimbDisAscend());
        this.c.setClimbDisDescend(statisticsData.getRidingInfo().getDistance3DDescend() + this.b.getClimbDisDescend());
        this.c.setClimbDisAscendTime((statisticsData.getRidingInfo().getTimeAscend() / 1000) + this.b.getClimbDisAscendTime());
        this.c.setClimbDisDescendTime((statisticsData.getRidingInfo().getTimeDescend() / 1000) + this.b.getClimbDisDescendTime());
        this.c.setAvePace(distance > 0.0f ? costTime / distance : 0.0f);
        float rtSpeed = statisticsData.getRtSpeed() > 0.0f ? 1.0f / statisticsData.getRtSpeed() : 0.0f;
        float f2 = this.f;
        if (rtSpeed > f2) {
            f2 = rtSpeed;
        }
        this.f = f2;
        float f3 = this.g;
        if (rtSpeed < f3 && rtSpeed != 0.0f) {
            f3 = rtSpeed;
        }
        this.g = f3;
        this.c.setMaxRtPace(f2);
        this.c.setMinRtPace(this.g);
        this.c.setEndTime(System.currentTimeMillis() / 1000);
        GPSActiveStatistic gPSActiveStatistic = this.c;
        int i2 = this.y + 1;
        this.y = i2;
        gPSActiveStatistic.setSize(i2);
        int step = statisticsData.getStep() + this.i;
        this.c.setStepCount(step);
        this.c.setAveStepLength((int) (statisticsData.getSteplength() * 100.0f));
        this.j.setSteps(step);
        this.j.setDistance(distance);
        this.j.setStepl(statisticsData.getSteplength());
        this.j.setPace(rtSpeed);
        this.j.setSpeed(statisticsData.getRtSpeed());
        this.j.setAltitude(statisticsData.getAltitude());
        GPSActiveDistance gPSActiveDistance = this.l;
        if (gPSActiveDistance == null || gPSActiveDistance.getDistance() != distance) {
            GPSActiveDistance gPSActiveDistance2 = new GPSActiveDistance(this.d, statisticsData.getTime(), distance);
            this.l = gPSActiveDistance2;
            com.huami.mifit.sportlib.core.c.m(gPSActiveDistance2);
        }
        GPSActiveStep gPSActiveStep = this.m;
        if (gPSActiveStep == null || gPSActiveStep.getStep() != step || this.m.getStepLength() != statisticsData.getSteplength()) {
            GPSActiveStep gPSActiveStep2 = new GPSActiveStep(this.d, statisticsData.getTime(), step, statisticsData.getSteplength(), statisticsData.getRtStepFreq());
            this.m = gPSActiveStep2;
            com.huami.mifit.sportlib.core.c.p(gPSActiveStep2);
        }
        float f4 = rtSpeed;
        H(statisticsData.getTime(), rtSpeed, statisticsData.getAltitude(), statisticsData.getRtSpeed());
        I(this.c, this.j);
        this.c.setStatistic(this.h.toString());
        com.huami.mifit.sportlib.core.c.C(this.c);
        if (this.r) {
            if (this.p == -1.0f) {
                this.p = this.b.getAltitudeAscend();
            }
            if (this.q == -1.0f) {
                this.q = this.b.getAltitudeDescend();
            }
            int altitude = (int) statisticsData.getAltitude();
            if (RunUtils.isAltiMeterValid((int) this.o) && RunUtils.isAltiMeterValid(altitude)) {
                float f5 = altitude;
                if (Math.abs(this.o - f5) > 1.0f) {
                    float f6 = this.o;
                    if (f5 > f6) {
                        this.p += f5 - f6;
                    } else {
                        this.q += f6 - f5;
                    }
                    this.o = f5;
                    this.c.setAltitudeAscend((int) this.p);
                    this.c.setAltitudeDescend((int) this.q);
                }
            }
            if (RunUtils.isAltiMeterValid(altitude) && !RunUtils.isAltiMeterValid((int) this.o)) {
                this.o = altitude;
            }
        }
        try {
            this.w.onPaceChanged(f4);
            this.w.onDistanceChanged(distance);
            this.w.onStepFreqChanged(statisticsData.getRtStepFreq());
            this.w.onAltitudeChanged(statisticsData.getAltitude());
            this.w.onStepChanged(step);
            this.w.onAvgPaceChanged(this.c.getAvePace());
            this.w.onCalorieChanged(this.c.getCostCal());
            this.w.onClimbAscendChanged(this.r ? this.p : 0.0f);
        } catch (Exception e2) {
            LogKit.w2f(H, "doHandleStatisticData error:" + e2.toString());
        }
        t0(step, f4, distance, statisticsData.getRtStepFreq());
        EteRealTimeInput.getInstance().setRealTimeInput(statisticsData.getRtSpeed(), statisticsData.getAltitude(), (int) statisticsData.getRtStepFreq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(int i2, int i3, int i4) {
        if (i2 == 44) {
            this.c.setPercentOffrontStep((int) ((i3 > 0 ? i4 / i3 : 0.0f) * 100.0f));
        }
        this.c.setDevice(SportDeviceKit.getInstance().formatDeviceToString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (com.huami.mifit.sportlib.core.c.w(this.c)) {
            SportRawDataTransformer.INSTANCE.getInstance().parseDetailBulkData(this.d, this.c.getSource(), this.c.getType());
        }
        try {
            this.w.onFinish();
        } catch (Exception e2) {
            LogKit.w2f(H, "doHandleStop:" + e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(long j2) {
        this.e = j2;
        this.c.setCostTime((int) (this.e / 1000));
        try {
            this.w.onSportTimeChanged(this.e);
        } catch (Exception e2) {
            LogKit.w2f(H, "doHandleTicker:" + e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(boolean z) {
        if (this.D != null) {
            return;
        }
        this.D = new ArrayList();
        List<GPSActiveTrack> listA = GPSDataRecover.a(this.d);
        for (GPSActiveTrack gPSActiveTrack : listA) {
            GPSPoint gPSPoint = new GPSPoint(gPSActiveTrack.getTimestamp(), gPSActiveTrack.getLatitude(), gPSActiveTrack.getLongitude(), gPSActiveTrack.getAltitude(), gPSActiveTrack.getAccuracy());
            gPSPoint.setProviderType(this.F);
            if (!gPSPoint.isMaskPoint()) {
                gPSPoint.setAttr(gPSActiveTrack.getState());
                gPSPoint.setIndex(this.D.size());
                this.D.add(gPSPoint);
            }
        }
        if (!z || this.D.size() <= 0) {
            return;
        }
        List<GPSPoint> list = this.D;
        if (list.get(list.size() - 1).isActive()) {
            List<GPSPoint> list2 = this.D;
            GPSPoint gPSPointM3384clone = list2.get(list2.size() - 1).m3384clone();
            gPSPointM3384clone.setIndex(this.D.size());
            gPSPointM3384clone.setAttr(2);
            this.D.add(gPSPointM3384clone);
            GPSActiveTrack gPSActiveTrack2 = listA.get(listA.size() - 1);
            gPSActiveTrack2.setState(2);
            com.huami.mifit.sportlib.core.c.J(gPSActiveTrack2);
        }
    }

    public static boolean n0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(List<GPSPoint> list) {
        p0(list);
        Collections.sort(list, new i());
        GPSPoint gPSPoint = list.get(list.size() - 1);
        this.A = gPSPoint;
        IServiceDataCallback iServiceDataCallback = this.w;
        if (iServiceDataCallback != null) {
            try {
                iServiceDataCallback.onLocationChanged(gPSPoint);
                this.w.onGPSLineInfoChanged(list, new RouteLineInfo(true));
            } catch (Exception e2) {
                LogKit.w2f(H, "notifyPointChanged:" + e2.toString());
            }
        }
    }

    private void p0(List<GPSPoint> list) {
        GPSPoint gPSPoint = this.B;
        if (gPSPoint != null) {
            if (gPSPoint.isActive()) {
                list.add(this.B.m3384clone());
            }
            this.B = null;
        }
    }

    private void r0(GPSIndexPace gPSIndexPace, boolean z) {
        GPSActiveHr gPSActiveHr = this.k;
        int hr = (gPSActiveHr == null || !gPSActiveHr.checkTimely()) ? -1 : this.k.getHr();
        GPSActiveStatistic gPSActiveStatistic = this.c;
        DistanceVoiceInfo distanceVoiceInfo = new DistanceVoiceInfo(gPSIndexPace.getTotalDis(), gPSIndexPace.getTotalCost(), gPSIndexPace.getCt(), hr, gPSActiveStatistic != null ? gPSActiveStatistic.getType() : 1, z, true);
        if (RunningPlayer.getInstance() != null) {
            RunningPlayer.getInstance().playDistance(distanceVoiceInfo);
        }
    }

    private void t0(int i2, float f2, float f3, float f4) {
        GPSActiveHr gPSActiveHr = this.k;
        int hr = (gPSActiveHr == null || !gPSActiveHr.checkImmediately()) ? 255 : this.k.getHr();
        int type = this.c.getType();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.DATA_KEY_AVG_PACE, this.c.getAvePace());
            jSONObject.put("pace", f2);
            jSONObject.put("step", i2);
            jSONObject.put("distance", f3);
            jSONObject.put(Constants.DATA_KEY_STEP_FREQ, f4);
            jSONObject.put(Constants.DATA_KEY_STEP_LEN, this.c.getAveStepLength());
            jSONObject.put(Constants.DATA_KEY_HR, hr);
            jSONObject.put("cal", (int) this.c.getCostCal());
            jSONObject.put("sportType", type);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        SportDeviceKit.getInstance().sendDataToDevice(jSONObject.toString());
    }

    private void u0(int i2, float f2) {
        SportDeviceKit.getInstance().sendPaceToDevice(i2, f2);
    }

    private void v0(GPSActiveStatistic gPSActiveStatistic) {
        this.b.setDistance(gPSActiveStatistic.getDistance());
        this.b.setCostCal(gPSActiveStatistic.getCostCal());
        this.b.setClimbDisAscend(gPSActiveStatistic.getClimbDisAscend());
        this.b.setClimbDisDescend(gPSActiveStatistic.getClimbDisDescend());
        this.b.setClimbDisAscendTime(gPSActiveStatistic.getClimbDisAscendTime());
        this.b.setClimbDisDescendTime(gPSActiveStatistic.getClimbDisDescendTime());
    }

    public final long X() {
        return this.e;
    }

    public final void Y(AlignData alignData) {
        this.t.execute(new r(alignData));
    }

    public final void Z(boolean z, boolean z2) {
        this.t.execute(new a(z, z2));
    }

    public final void a0(long j2, int i2) {
        this.t.execute(new p(j2, i2));
        EteRealTimeInput.getInstance().setRealTimeHRWhenPause(i2);
    }

    public final void b0(int i2, int i3) {
        this.t.execute(new RunnableC0479b(i2, i3));
    }

    public final void c0(float[] fArr, int[] iArr) {
        this.t.execute(new g(fArr, iArr));
    }

    public final void d0(int i2, int i3, int i4, int i5) {
        this.t.execute(new u(i2, i5, i3, i4));
    }

    public void e0(boolean z) {
        com.huami.mifit.sportlib.core.c.H(z);
        this.t.execute(new d());
        this.u.execute(new e());
        EteRealTimeInput.getInstance().setPause(true);
    }

    public final void f0() {
        this.t.execute(new f());
        EteRealTimeInput.getInstance().setPause(false);
    }

    public final void g0(int i2, GpsData[] gpsDataArr) {
        this.u.execute(new q(gpsDataArr, i2));
    }

    public final void h0(int i2, int i3) {
        this.t.execute(new n(i2, i3));
    }

    public final void i0(StatisticsData statisticsData) {
        this.t.execute(new s(statisticsData));
    }

    public void j0(int i2, int i3, int i4) {
        this.t.execute(new t(i2, i3, i4));
    }

    public final void k0() {
        this.t.execute(new c());
    }

    public final void l0(long j2) {
        this.t.execute(new o(j2));
    }

    public long q0(long j2) {
        SportRecord sportRecordC = GPSDataRecover.c(j2);
        long jIntValue = 0;
        if (sportRecordC != null && sportRecordC.getCosttime() != null) {
            jIntValue = sportRecordC.getCosttime().intValue() * 1000;
        }
        long j3 = jIntValue;
        this.t.execute(new l(sportRecordC, j2, j3));
        this.u.execute(new m());
        return j3;
    }

    public void s0() {
        this.u.execute(new j());
    }
}
