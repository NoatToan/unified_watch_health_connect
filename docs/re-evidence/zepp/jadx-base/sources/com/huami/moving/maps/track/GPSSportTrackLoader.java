package com.huami.moving.maps.track;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.KilometreOrMileMarked;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.model.PointTrackLocation;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.maps.GPSSolutionFactory;
import com.huami.moving.maps.IGPSSolution;
import com.huami.moving.maps.IMapLoadedCallback;
import com.huami.moving.maps.track.GPSSportTrackLoader;
import com.huami.moving.model.HeatmapData;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class GPSSportTrackLoader implements IMapLoadedCallback {
    private static final String n = "GPSSportContourTrackLoader";
    private GPSContourTrack.LoadData d;
    private IGPSSolution f;
    private ExecutorService g;
    private TrackLoadCallback k;
    private Context m;
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private a e = null;
    private int h = 0;
    private int i = 0;
    private ITrackMapDataListener j = null;
    private boolean l = false;

    public interface TrackLoadCallback {
        Context getAttechActivity();

        void whenContourTrackCreated(String str);

        void whenMapLoaded();

        void whenTrackDataLoaded();
    }

    public interface TrackPlayCallback {
        void onPlayFinish();

        void onPlayProgress(float f);

        void onPlayStart();
    }

    public final class b implements ITrackMapDataListener {
        private b() {
        }

        @Override // com.huami.moving.maps.track.ITrackMapDataListener
        public void onContourTrackCreated(long j, int i, String str) {
            HMLog.i(GPSSportTrackLoader.n, "onContourTrackCreated|trackId:" + j + ",path:" + str, new Object[0]);
            Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(j, i);
            if (trackRecordById != null) {
                trackRecordById.setContoururi(str);
                TrackRecordManager.getInstance().updateTrackRecord(trackRecordById);
            } else {
                HMLog.i(GPSSportTrackLoader.n, "onContourTrackCreated can't get trackRecord", new Object[0]);
            }
            if (str != null) {
                GPSSportTrackLoader.this.k.whenContourTrackCreated(str);
            }
        }

        @Override // com.huami.moving.maps.track.ITrackMapDataListener
        public void onTrackDataLoaded(long j, int i) {
            HMLog.i(GPSSportTrackLoader.n, "onTrackDataLoaded|trackId:" + j + ",message:" + i, new Object[0]);
            GPSSportTrackLoader.this.k.whenTrackDataLoaded();
        }

        @Override // com.huami.moving.maps.track.ITrackMapDataListener
        public void onTrackDataReceived(long j, GPSContourTrack.LoadData loadData) {
            synchronized (this) {
                GPSSportTrackLoader.this.b = true;
                GPSSportTrackLoader.this.d = loadData;
                HMLog.i(GPSSportTrackLoader.n, "onTrackDataReceived sync", new Object[0]);
                if (GPSSportTrackLoader.this.a) {
                    GPSSportTrackLoader.this.z(loadData.a, loadData.b);
                    GPSSportTrackLoader.this.s(loadData.track);
                    GPSSportTrackLoader.this.t(loadData.marked);
                }
            }
        }
    }

    public final class c implements ITrackMapDataListener {
        private c() {
        }

        @Override // com.huami.moving.maps.track.ITrackMapDataListener
        public void onContourTrackCreated(long j, int i, String str) {
        }

        @Override // com.huami.moving.maps.track.ITrackMapDataListener
        public void onTrackDataLoaded(long j, int i) {
        }

        @Override // com.huami.moving.maps.track.ITrackMapDataListener
        public void onTrackDataReceived(long j, GPSContourTrack.LoadData loadData) {
            synchronized (this) {
                HMLog.i(GPSSportTrackLoader.n, "isComplex :::" + loadData.d, new Object[0]);
                GPSSportTrackLoader.this.d = loadData;
                GPSSportTrackLoader.this.u(loadData);
                GPSSportTrackLoader.this.k.whenTrackDataLoaded();
            }
        }
    }

    public GPSSportTrackLoader(TrackLoadCallback trackLoadCallback, FragmentManager fragmentManager, Bundle bundle, boolean z) {
        this.f = null;
        this.g = null;
        this.k = trackLoadCallback;
        this.m = trackLoadCallback.getAttechActivity();
        this.f = GPSSolutionFactory.createSolution(trackLoadCallback.getAttechActivity(), fragmentManager, bundle, z, this);
        this.g = Executors.newFixedThreadPool(1);
        y(new b());
    }

    private void A(boolean z) {
        this.f.setRouteTrackVisibility(z);
    }

    private void r(SparseArray<List<GPSPoint>> sparseArray) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(List<GPSPoint> list) {
        this.e.c(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(List<GPSPoint> list) {
        this.e.b(list);
        setMarked(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(GPSContourTrack.LoadData loadData) {
        this.f.drawGPSTrackLine(loadData.track, RouteLineInfo.createMarkSEInfo(false, true, true));
        this.f.setCarmeraLatLngBounds(loadData.track);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(String str) {
        return TextUtils.isEmpty(str) || !new File(str).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w(int i, int i2) {
        return "Complex - srcWidth: " + i + ", srcHeight: " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x(int i, int i2) {
        return "Single - srcWidth: " + i + ", srcHeight: " + i2;
    }

    private void y(ITrackMapDataListener iTrackMapDataListener) {
        this.j = iTrackMapDataListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(GPSPoint gPSPoint, GPSPoint gPSPoint2) {
        double d = gPSPoint.mLatitude;
        double d2 = gPSPoint2.mLatitude;
        if (d >= d2) {
            gPSPoint.mLatitude = d2 - 1.0E-5d;
        }
        this.f.setTrackRectangle(gPSPoint, gPSPoint2);
    }

    public void addMaskOverlay(boolean z) {
        this.f.addMaskOverlay(z);
    }

    @Override // com.huami.moving.maps.IMapLoadedCallback
    public void afterMapLoaded() {
        A(true);
        this.k.whenMapLoaded();
        synchronized (this) {
            this.a = true;
            if (this.b && this.d != null) {
                HMLog.i(n, "onMapLoaded try draw pathline and marked", new Object[0]);
                GPSContourTrack.LoadData loadData = this.d;
                z(loadData.a, loadData.b);
                List<GPSPoint> list = this.d.track;
                if (list != null) {
                    s(list);
                }
                List<GPSPoint> list2 = this.d.marked;
                if (list2 != null) {
                    t(list2);
                }
            }
        }
    }

    public void clearTrackVodePaly() {
        this.f.clearTrackVideoPaly();
    }

    public void destroy() {
        this.f.destroy();
        unregisterListener();
        a aVar = this.e;
        if (aVar != null) {
            aVar.k();
        }
        this.g.shutdown();
        this.d = null;
    }

    public void destroyMap() {
        this.f.destroyMap();
    }

    public IGPSSolution getGPSSolution() {
        return this.f;
    }

    public GPSContourTrack.LoadData getmData() {
        return this.d;
    }

    public boolean isShutdown() {
        return this.g.isShutdown();
    }

    public void mapScreenShot(IGPSSolution.IOnMapScreenShotListener iOnMapScreenShotListener) {
        this.f.mapScreenShot(iOnMapScreenShotListener);
    }

    public void pauseMap() {
        this.f.pauseMap();
    }

    public void resetLoaction() {
        List<GPSPoint> list;
        GPSContourTrack.LoadData loadData = this.d;
        if (loadData == null || (list = loadData.track) == null) {
            return;
        }
        this.f.zoomToShowEntireTrack(list);
    }

    public void resumeMap() {
        this.f.resumeMap();
    }

    public void saveInstanceStateMap(Bundle bundle) {
        IGPSSolution iGPSSolution = this.f;
        if (iGPSSolution != null) {
            iGPSSolution.saveInstanceStateMap(bundle);
        }
    }

    public void scrollBy(int i, int i2) {
        this.f.scrollBy(i, i2);
    }

    public void setCenter(GPSPoint gPSPoint) {
        if (gPSPoint != null) {
            this.f.setCenter(gPSPoint);
        } else {
            HMLog.i("IllegalArgumentException", "GPSSportTrackLoader setCenter", new Object[0]);
            throw new IllegalArgumentException();
        }
    }

    public void setHeatmapType(int i) {
        this.f.setHeatmapVisible(i);
    }

    public void setIsMarked(boolean z) {
        this.c = z;
    }

    public void setLocation(GPSPoint gPSPoint) {
        this.f.setLocation(gPSPoint);
    }

    public void setMapHeight(int i) {
        this.i = i;
    }

    public void setMapViewMode(int i) {
        this.f.setMapViewMode(i);
    }

    public void setMapWidth(int i) {
        this.h = i;
    }

    public void setMarked(boolean z) {
        this.f.setMarked(z);
    }

    public void setOnChangeListener(OnChangeListener onChangeListener) {
        Log.i("Trackloader", "setOnChangeListener    GPS");
        this.f.setOnChangeListener(onChangeListener);
    }

    public void startComplexTrackInMap(long j, int i, int i2, final int i3, final int i4, long[][] jArr) {
        if (j <= 0) {
            return;
        }
        this.h = i3;
        this.i = i4;
        HMLog.info(n, new Function0() { // from class: od2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GPSSportTrackLoader.w(i3, i4);
            }
        });
        a aVar = new a(this, j, i, i2, jArr);
        this.e = aVar;
        ITrackMapDataListener iTrackMapDataListener = this.j;
        if (iTrackMapDataListener != null) {
            aVar.j(iTrackMapDataListener);
        }
        this.e.executeOnExecutor(this.g, new Long[0]);
    }

    public void startComplexTrackVideoInMap(long j, int i, int i2, long[][] jArr) {
        if (j <= 0) {
            return;
        }
        a aVar = new a(this, j, i, i2, jArr);
        this.e = aVar;
        ITrackMapDataListener iTrackMapDataListener = this.j;
        if (iTrackMapDataListener != null) {
            aVar.j(iTrackMapDataListener);
        }
        this.e.executeOnExecutor(this.g, new Long[0]);
    }

    public void startSingleTrackInMap(long j, int i, int i2, final int i3, final int i4) {
        if (j <= 0) {
            return;
        }
        this.h = i3;
        this.i = i4;
        HMLog.info(n, new Function0() { // from class: pd2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GPSSportTrackLoader.x(i3, i4);
            }
        });
        this.l = i2 == 18 || i2 == 82 || i2 == 90 || i2 == 121;
        a aVar = new a(j, i, i2);
        this.e = aVar;
        ITrackMapDataListener iTrackMapDataListener = this.j;
        if (iTrackMapDataListener != null) {
            aVar.j(iTrackMapDataListener);
        }
        this.e.executeOnExecutor(this.g, new Long[0]);
    }

    public void startSingleTrackVideoInMap(long j, int i, int i2) {
        if (j <= 0) {
            return;
        }
        this.l = i2 == 18;
        a aVar = new a(j, i, i2);
        this.e = aVar;
        ITrackMapDataListener iTrackMapDataListener = this.j;
        if (iTrackMapDataListener != null) {
            aVar.j(iTrackMapDataListener);
        }
        this.e.executeOnExecutor(this.g, new Long[0]);
    }

    public void startTrackPaly(int i, float f, int i2, TrackPlayCallback trackPlayCallback) {
        IGPSSolution iGPSSolution = this.f;
        Boolean boolValueOf = Boolean.valueOf(this.d.d);
        GPSContourTrack.LoadData loadData = this.d;
        iGPSSolution.startCPSTrackPlay(boolValueOf, loadData.complexTracks, loadData.track, loadData.marked, RouteLineInfo.createMarkSEInfo(false, true, true), trackPlayCallback, i2, f, i);
    }

    public void unregisterListener() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.l();
        }
        this.j = null;
    }

    @SuppressLint({"NewApi"})
    public class a extends AsyncTask<Long, Void, GPSContourTrack.LoadData> {
        private boolean a;
        private long b;
        private int c;
        private int d;
        private int e;
        private long[][] f;
        private ContourTrackController g;
        private final int h;
        private int i;

        public a(long j, int i, int i2) {
            this.a = false;
            this.b = 0L;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.g = null;
            this.h = 1000;
            this.i = -1;
            this.b = j;
            this.c = i;
            this.d = i2;
            this.g = new ContourTrackController();
        }

        private GPSContourTrack.LoadData d(long j, int i, int i2, int i3) {
            ParsedSportDetailData trackData;
            int i4;
            double d;
            double d2;
            double d3;
            double d4;
            GPSContourTrack.LoadData loadData = new GPSContourTrack.LoadData();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                trackData = TrackDataManager.getInstance().getTrackData(j, i, i2);
            } catch (Exception e) {
                HMLog.i(GPSSportTrackLoader.n, "genSingleTrack null:" + e.getMessage(), new Object[0]);
                trackData = null;
            }
            if (trackData == null) {
                loadData.a = new GPSPoint(-90.0d, -180.0d);
                loadData.b = new GPSPoint(90.0d, 180.0d);
                loadData.a.setProviderType(0);
                loadData.b.setProviderType(0);
                loadData.track = arrayList;
                loadData.marked = arrayList2;
                return loadData;
            }
            int detailVersion = trackData.getDetailVersion();
            this.e = trackData.getProvider();
            boolean zIsMetric = RunnerData.getRunner().isMetric();
            List<KilometreOrMileMarked> kmMarkedList = zIsMetric ? trackData.getKmMarkedList() : trackData.getMileMarkedList();
            int iE = e(trackData.getTotalDistance(), i2, zIsMetric);
            for (KilometreOrMileMarked kilometreOrMileMarked : kmMarkedList) {
                GPSPoint gPSPoint = new GPSPoint();
                gPSPoint.mLongitude = kilometreOrMileMarked.getMarkedLongt();
                gPSPoint.mLatitude = kilometreOrMileMarked.getMarkedLat();
                gPSPoint.setProviderType(this.e);
                gPSPoint.setIndex(kilometreOrMileMarked.getDisIndex() - 1);
                gPSPoint.setVersion(detailVersion);
                if (kilometreOrMileMarked.getDisIndex() % iE == 0) {
                    arrayList2.add(gPSPoint);
                }
            }
            List<PointTrackLocation> pointLocationList = trackData.getPointLocationList();
            List<Long> timeList = trackData.getTimeList();
            ArrayList arrayList3 = new ArrayList();
            Iterator<CommonTimeValuePoint> it2 = trackData.getAltiList().iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf((int) it2.next().getValue()));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<CommonTimeValuePoint> it3 = trackData.getPaceAlignPointList().iterator();
            while (it3.hasNext()) {
                arrayList4.add(Float.valueOf(it3.next().getValue()));
            }
            List<Integer> flagList = trackData.getFlagList();
            if (GPSSportTrackLoader.this.l) {
                this.i = trackData.getHalfStartTime();
            }
            int size = pointLocationList.size();
            int i5 = (size / 1000) + 1;
            float maxValue = trackData.pacePeak.getMaxValue();
            float minValue = trackData.pacePeak.getMinValue();
            int i6 = 2;
            if (RunUtils.isMaxMinPaceValid(maxValue, minValue)) {
                if (!zIsMetric) {
                    maxValue = (float) (((double) maxValue) * 1.609344d);
                    minValue = (float) (((double) minValue) * 1.609344d);
                    i6 = 2;
                }
                float[] fArr = new float[i6];
                float f = 1.0f / maxValue;
                i4 = 0;
                fArr[0] = f;
                fArr[1] = 1.0f / minValue;
                TrackColorGradient.setSpeedScope(fArr);
            } else {
                TrackColorGradient.setSpeedScope(new float[]{0.0f, 0.0f});
                i4 = 0;
            }
            int i7 = -1;
            ArrayList arrayList5 = arrayList;
            double d5 = 180.0d;
            double d6 = -90.0d;
            GPSPoint gPSPoint2 = null;
            double d7 = -180.0d;
            double d8 = 90.0d;
            while (i4 < size) {
                PointTrackLocation pointTrackLocation = pointLocationList.get(i4);
                int i8 = i7;
                double dDoubleValue = i4 < arrayList3.size() ? ((Integer) arrayList3.get(i4)).doubleValue() : 0.0d;
                int iIntValue = i4 < flagList.size() ? flagList.get(i4).intValue() : 1;
                double pointLatitude = pointTrackLocation.getPointLatitude();
                double pointLongitude = pointTrackLocation.getPointLongitude();
                List<PointTrackLocation> list = pointLocationList;
                float fFloatValue = arrayList4.size() > i4 ? ((Float) arrayList4.get(i4)).floatValue() : 0.0f;
                float f2 = fFloatValue > 0.0f ? 1.0f / fFloatValue : 0.0f;
                GPSPoint gPSPoint3 = new GPSPoint(pointLatitude, pointLongitude, dDoubleValue);
                ArrayList arrayList6 = arrayList4;
                List<Integer> list2 = flagList;
                gPSPoint3.setTime(timeList.size() == size ? timeList.get(i4).longValue() : 0L);
                gPSPoint3.setProviderType(this.e);
                gPSPoint3.setIndex(i4 + i3);
                gPSPoint3.setVersion(detailVersion);
                gPSPoint3.setAttr(iIntValue);
                gPSPoint3.setSpeed(f2);
                if (gPSPoint3.isMaskPoint()) {
                    i7 = i8;
                    gPSPoint3 = gPSPoint2;
                } else {
                    int i9 = iIntValue != 1 ? i4 : i8;
                    if (f(gPSPoint2, gPSPoint3)) {
                        gPSPoint3.setAttr(4);
                    } else {
                        if (g(i5, i4, iIntValue) && i4 - 1 != i9) {
                            i7 = i9;
                        }
                        i4++;
                        d5 = d4;
                        arrayList5 = arrayList5;
                        gPSPoint2 = gPSPoint3;
                        d6 = d6;
                        pointLocationList = list;
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList6;
                        flagList = list2;
                    }
                    if (pointLatitude > d6) {
                        d6 = pointLatitude;
                    }
                    if (pointLatitude < d8) {
                        d8 = pointLatitude;
                    }
                    if (pointLongitude > d7) {
                        d7 = pointLongitude;
                    }
                    double d9 = d5;
                    double d10 = d6;
                    d4 = pointLongitude < d9 ? pointLongitude : d9;
                    arrayList5.add(gPSPoint3);
                    i7 = i9;
                    d6 = d10;
                    i4++;
                    d5 = d4;
                    arrayList5 = arrayList5;
                    gPSPoint2 = gPSPoint3;
                    d6 = d6;
                    pointLocationList = list;
                    arrayList3 = arrayList3;
                    arrayList4 = arrayList6;
                    flagList = list2;
                }
                d4 = d5;
                i4++;
                d5 = d4;
                arrayList5 = arrayList5;
                gPSPoint2 = gPSPoint3;
                d6 = d6;
                pointLocationList = list;
                arrayList3 = arrayList3;
                arrayList4 = arrayList6;
                flagList = list2;
            }
            double d11 = d6;
            ArrayList arrayList7 = arrayList5;
            double d12 = d5;
            if (arrayList7.size() == 0) {
                d3 = -d7;
                d2 = -d8;
                d11 = -d11;
                d = -d12;
            } else {
                d = d12;
                d2 = d8;
                d3 = d7;
            }
            loadData.a = new GPSPoint(d2, d);
            loadData.b = new GPSPoint(d11, d3);
            loadData.a.setProviderType(this.e);
            loadData.b.setProviderType(this.e);
            loadData.track = arrayList7;
            loadData.marked = arrayList2;
            return loadData;
        }

        private int e(int i, int i2, boolean z) {
            if (i2 == 9 || i2 == 47 || i2 == 132 || i2 == 136 || i2 == 137 || i2 == 190) {
                int iConvertMeterToKmOrMile = (int) RunDataConversion.convertMeterToKmOrMile(i, z);
                if (iConvertMeterToKmOrMile > 10 && iConvertMeterToKmOrMile <= 20) {
                    return 2;
                }
                if (iConvertMeterToKmOrMile > 20 && iConvertMeterToKmOrMile <= 75) {
                    return 5;
                }
                if (iConvertMeterToKmOrMile > 75 && iConvertMeterToKmOrMile <= 150) {
                    return 10;
                }
                if (iConvertMeterToKmOrMile > 150 && iConvertMeterToKmOrMile <= 750) {
                    return 50;
                }
                if (iConvertMeterToKmOrMile > 750 && iConvertMeterToKmOrMile <= 1500) {
                    return 100;
                }
                if (iConvertMeterToKmOrMile > 1500 && iConvertMeterToKmOrMile <= 3000) {
                    return 200;
                }
                if (iConvertMeterToKmOrMile > 3000) {
                    return 500;
                }
            }
            return 1;
        }

        private boolean f(GPSPoint gPSPoint, GPSPoint gPSPoint2) {
            if (gPSPoint == null || gPSPoint2 == null) {
                return false;
            }
            float[] fArr = new float[1];
            Location.distanceBetween(gPSPoint2.mLatitude, gPSPoint2.mLongitude, gPSPoint.mLatitude, gPSPoint.mLongitude, fArr);
            return (gPSPoint.getAttr() == 1 || gPSPoint.getAttr() == 4) && gPSPoint2.getAttr() == 1 && fArr[0] > 200.0f;
        }

        private boolean g(int i, int i2, int i3) {
            return (i == 0 || i2 % i == 0 || i3 != 1) ? false : true;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GPSContourTrack.LoadData doInBackground(Long... lArr) {
            long[][] jArr;
            float f;
            float f2;
            float f3;
            if (!SportTypeIdentifier.isComplexSport(this.d) || this.f == null) {
                return d(this.b, this.c, this.d, 0);
            }
            char c = 0;
            HMLog.i(GPSSportTrackLoader.n, " mSubSports：：：：" + new Gson().toJson(this.f), new Object[0]);
            GPSContourTrack.LoadData loadData = new GPSContourTrack.LoadData();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            loadData.d = true;
            loadData.c = new SparseArray<>();
            loadData.complexTracks = new SparseArray<>();
            loadData.complexMyTrackData = new LinkedHashMap<>();
            loadData.complexTrackRecord = new LinkedHashMap<>();
            long[][] jArr2 = this.f;
            long[] jArr3 = jArr2[0];
            long[] jArr4 = jArr2[1];
            int i = 0;
            float f4 = 180.0f;
            float f5 = -90.0f;
            float f6 = 90.0f;
            float f7 = -180.0f;
            while (true) {
                jArr = this.f;
                if (i >= jArr[c].length) {
                    break;
                }
                int size = i == 0 ? 0 : loadData.complexTracks.get((int) jArr4[i - 1]).size();
                GPSContourTrack.LoadData loadData2 = loadData;
                int i2 = i;
                float f8 = f4;
                GPSContourTrack.LoadData loadDataD = d(jArr3[i], this.c, (int) jArr4[i], size);
                float f9 = f6;
                float f10 = f7;
                ParsedSportDetailData trackData = TrackDataManager.getInstance().getTrackData(jArr3[i2], this.c, (int) jArr4[i2]);
                Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(jArr3[i2], this.c);
                if (trackData != null) {
                    loadData2.complexMyTrackData.put(Integer.valueOf((int) jArr4[i2]), trackData);
                    loadData2.complexTrackRecord.put(Integer.valueOf((int) jArr4[i2]), trackRecordById);
                }
                loadData2.c.put((int) jArr4[i2], loadDataD.marked);
                loadData2.complexTracks.put((int) jArr4[i2], loadDataD.track);
                arrayList.addAll(loadDataD.track);
                arrayList2.addAll(loadDataD.marked);
                GPSPoint gPSPoint = loadDataD.b;
                double d = gPSPoint.mLatitude;
                long[] jArr5 = jArr3;
                long[] jArr6 = jArr4;
                if (d > f5) {
                    f5 = (float) d;
                }
                GPSPoint gPSPoint2 = loadDataD.a;
                double d2 = gPSPoint2.mLatitude;
                if (d2 < f9) {
                    f9 = (float) d2;
                }
                f6 = f9;
                double d3 = gPSPoint.mLongitude;
                float f11 = f10;
                if (d3 > f11) {
                    f11 = (float) d3;
                }
                double d4 = gPSPoint2.mLongitude;
                f4 = d4 < ((double) f8) ? (float) d4 : f8;
                i = i2 + 1;
                jArr3 = jArr5;
                loadData = loadData2;
                jArr4 = jArr6;
                c = 0;
                f7 = f11;
            }
            GPSContourTrack.LoadData loadData3 = loadData;
            float f12 = f7;
            float f13 = f4;
            float f14 = f6;
            if (jArr.length == 0) {
                f5 = -f5;
                f2 = -f14;
                f = -f12;
                f3 = -f13;
            } else {
                f = f12;
                f2 = f14;
                f3 = f13;
            }
            loadData3.a = new GPSPoint(f2, f3);
            loadData3.b = new GPSPoint(f5, f);
            loadData3.a.setProviderType(this.e);
            loadData3.b.setProviderType(this.e);
            loadData3.track = arrayList;
            loadData3.marked = arrayList2;
            return loadData3;
        }

        public void b(List<GPSPoint> list) {
            GPSSportTrackLoader.this.f.addMarked(list);
        }

        public void c(List<GPSPoint> list) {
            HMLog.i(GPSSportTrackLoader.n, "drawResultOnMap draw pathline", new Object[0]);
            int i = -1;
            if (list == null || list.size() <= 0) {
                if (GPSSportTrackLoader.this.j != null) {
                    GPSSportTrackLoader.this.j.onTrackDataLoaded(this.b, -1);
                    return;
                }
                return;
            }
            if (GPSSportTrackLoader.this.l) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (list.get(i2).getTime() - this.b >= this.i) {
                        i = i2;
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new HeatmapData(100, list));
                if (i > 0) {
                    arrayList.add(new HeatmapData(101, list.subList(0, i)));
                    arrayList.add(new HeatmapData(102, list.subList(i, list.size())));
                }
                GPSSportTrackLoader.this.f.drawHeatmap(arrayList);
                if (GPSSportTrackLoader.this.m != null) {
                    GPSSportTrackLoader.this.f.setHeatmapVisible(SportUIKeeper.getMapMileStoneFlag(GPSSportTrackLoader.this.m));
                }
            } else {
                GPSSportTrackLoader.this.f.drawGPSLine(list, RouteLineInfo.createMarkSEInfo(false, true, true));
            }
            GPSSportTrackLoader.this.f.zoomToShowEntireTrack(list);
            if (GPSSportTrackLoader.v(TrackRecordManager.getInstance().getTrackRecordById(this.b, this.c).getContoururi())) {
                ContourTrackController.TrackMapInfo trackMapInfo = new ContourTrackController.TrackMapInfo();
                trackMapInfo.mSportType = this.d;
                trackMapInfo.mTrackId = this.b;
                trackMapInfo.mDeviceSource = this.c;
                trackMapInfo.mSrcWidth = GPSSportTrackLoader.this.h;
                trackMapInfo.mSrcHeight = GPSSportTrackLoader.this.i;
                this.g.h(GPSSportTrackLoader.this.m, list, trackMapInfo);
            }
            if (GPSSportTrackLoader.this.j != null) {
                GPSSportTrackLoader.this.j.onTrackDataLoaded(this.b, 0);
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onCancelled(GPSContourTrack.LoadData loadData) {
            if (GPSSportTrackLoader.this.j != null) {
                GPSSportTrackLoader.this.j.onTrackDataLoaded(this.b, -1);
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(GPSContourTrack.LoadData loadData) {
            if (GPSSportTrackLoader.this.j != null) {
                GPSSportTrackLoader.this.j.onTrackDataReceived(this.b, loadData);
            }
        }

        public void j(ITrackMapDataListener iTrackMapDataListener) {
            this.g.o(iTrackMapDataListener);
        }

        public void k() {
            this.a = true;
            super.cancel(true);
        }

        public void l() {
            this.g.q();
        }

        public a(GPSSportTrackLoader gPSSportTrackLoader, long j, int i, int i2, long[][] jArr) {
            this(j, i, i2);
            this.f = jArr;
        }
    }

    public GPSSportTrackLoader(TrackLoadCallback trackLoadCallback, FragmentManager fragmentManager, Bundle bundle, boolean z, boolean z2) {
        this.f = null;
        this.g = null;
        this.k = trackLoadCallback;
        this.m = trackLoadCallback.getAttechActivity();
        this.f = GPSSolutionFactory.createSolution(trackLoadCallback.getAttechActivity(), fragmentManager, bundle, z, z2, this);
        this.g = Executors.newFixedThreadPool(1);
        y(new c());
    }
}
