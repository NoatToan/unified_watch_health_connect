package com.huawei.health.sportservice.datasource;

import android.location.Location;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.linkage.sportlinkage.DataListener;
import com.huawei.linkage.sportlinkage.LinkagePlatformApi;
import defpackage.izt;
import defpackage.oax;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.MIRROR_LINK_SOURCE)
public class MirrorLinkDataSource extends BaseSource<oax> implements SportLifecycle {
    private static final String TAG = "SportService_MirrorLinkDataSource";
    private DataListener mDataListener;
    private LinkagePlatformApi mLinkagePlatformApi;

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return null;
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "onPreSport");
        this.mLinkagePlatformApi = (LinkagePlatformApi) Services.d("LinkagePlatform", LinkagePlatformApi.class);
        registerRealDataListener();
    }

    private void initDataListener() {
        if (this.mDataListener == null) {
            this.mDataListener = new DataListener() { // from class: com.huawei.health.sportservice.datasource.MirrorLinkDataSource$$ExternalSyntheticLambda0
                @Override // com.huawei.linkage.sportlinkage.DataListener
                public final void onResponse(oax oaxVar) {
                    this.f$0.m1174x1080417e(oaxVar);
                }
            };
        }
    }

    /* JADX INFO: renamed from: lambda$initDataListener$0$com-huawei-health-sportservice-datasource-MirrorLinkDataSource, reason: not valid java name */
    /* synthetic */ void m1174x1080417e(oax oaxVar) {
        if (oaxVar == null) {
            LogUtil.a(TAG, "registerRealDataListener data is null");
        } else {
            LogUtil.a(TAG, "receiver linkage data:", oaxVar.toString());
            generateData(oaxVar);
        }
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void destroy() {
        ReleaseLogUtil.c(TAG, "destroy()");
        super.destroy();
        unregisterRealDataListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(oax oaxVar) {
        long jS = ((long) oaxVar.s()) * 1000;
        int iU = oaxVar.u();
        int iRound = (int) Math.round((((double) oaxVar.l()) * 1.0d) / 10.0d);
        int iRound2 = (int) Math.round((((double) oaxVar.k()) * 1.0d) / 1000.0d);
        int iC = oaxVar.c();
        int iAr = oaxVar.ar();
        int iAv = oaxVar.av();
        int iAf = oaxVar.af();
        int iG = oaxVar.g();
        int iAq = oaxVar.aq();
        int iAa = oaxVar.aa();
        int iAk = oaxVar.ak();
        int i = oaxVar.i();
        int iZ = oaxVar.z();
        int iM = oaxVar.m();
        int iAe = oaxVar.ae();
        int iH = oaxVar.h();
        int iY = oaxVar.y();
        long jQ = oaxVar.q() * 1000;
        double dAc = oaxVar.ac();
        double dAd = oaxVar.ad();
        int iAs = oaxVar.as();
        int iAo = oaxVar.ao();
        int iF = oaxVar.f();
        int iJ = oaxVar.j();
        int iN = oaxVar.n();
        int iAm = oaxVar.am();
        int iAh = oaxVar.ah();
        int iAn = oaxVar.an();
        int iO = oaxVar.o();
        double dR = oaxVar.r();
        double dX = oaxVar.x();
        double dP = oaxVar.p();
        double dAl = oaxVar.al();
        double dV = oaxVar.v();
        double dT = oaxVar.t();
        double dAu = oaxVar.au();
        double dAw = oaxVar.aw();
        double dAt = oaxVar.at();
        double dB = oaxVar.b();
        double dAx = oaxVar.ax();
        LogUtil.a(TAG, " sportDuration ", Long.valueOf(jS), " heartrate ", Integer.valueOf(iU), " distance ", Integer.valueOf(iRound), " calorie ", Integer.valueOf(iRound2), " descentWave ", Integer.valueOf(iAr), " creepWave ", Integer.valueOf(iAv), " curPace ", Integer.valueOf(iAf), " avgPace ", Integer.valueOf(iG), " height ", Integer.valueOf(iAq), " speed ", Integer.valueOf(iAk), " avgSpeed ", Integer.valueOf(i), " cadence ", Integer.valueOf(iM), " power ", Integer.valueOf(iAe), " analogPower ", Integer.valueOf(iH), " inclination ", Integer.valueOf(iY), " gpsTimeStamp ", Long.valueOf(jQ), " longitude ", Double.valueOf(dAc), " latitude ", Double.valueOf(dAd), " activeCalorie ", Integer.valueOf(iC), " threeSecPower ", Integer.valueOf(iAs), " threeSecAnalogPower ", Integer.valueOf(iAo), " analogCadence ", Integer.valueOf(iF), " avgAnalogCadence ", Integer.valueOf(iJ), " avgCadence ", Integer.valueOf(iN), " avgPower ", Integer.valueOf(iAm), " avgAnalogPower ", Integer.valueOf(iAh), " step ", Integer.valueOf(iAn), " cadence ", Integer.valueOf(iO), " contactTime ", Double.valueOf(dR), " impactAcceleration ", Double.valueOf(dX), " eversionExcursion ", Double.valueOf(dP), " swingAngle ", Double.valueOf(dAl), " hangTime ", Double.valueOf(dV), " groundHangTime ", Double.valueOf(dT), " gctimeBalance ", Double.valueOf(dAu), " verticalOscillation ", Double.valueOf(dAw), " verticalRatio ", Double.valueOf(dAt), " activePeak ", Double.valueOf(dB), " verticalLoadingRate ", Double.valueOf(dAx));
        BaseSportManager.getInstance().stagingAndNotification("DISTANCE_DATA", Integer.valueOf(iRound));
        BaseSportManager.getInstance().stagingAndNotification("CALORIES_DATA", Integer.valueOf(iRound2));
        BaseSportManager.getInstance().stagingAndNotification("HEART_RATE_DATA", Integer.valueOf(iU));
        BaseSportManager.getInstance().stagingAndNotification("ACTIVE_CALORIES_DATA", Integer.valueOf(iC));
        BaseSportManager.getInstance().stagingAndNotification("DESCENT_DATA", Integer.valueOf(iAr));
        BaseSportManager.getInstance().stagingAndNotification("CREEP_DATA", Integer.valueOf(iAv));
        BaseSportManager.getInstance().stagingAndNotification("PACE_DATA", Integer.valueOf(iAf));
        BaseSportManager.getInstance().stagingAndNotification("AVG_PACE_DATA", Integer.valueOf(iG));
        BaseSportManager.getInstance().stagingAndNotification("ALTITUDE_DATA", Integer.valueOf(iAq));
        BaseSportManager.getInstance().stagingAndNotification("MAX_ALTITUDE_DATA", Integer.valueOf(iAa));
        BaseSportManager.getInstance().stagingAndNotification("SPEED_DATA", Integer.valueOf(iAk));
        BaseSportManager.getInstance().stagingAndNotification("AVG_SPEED_DATA", Integer.valueOf(i));
        BaseSportManager.getInstance().stagingAndNotification("MAX_SPEED_DATA", Integer.valueOf(iZ));
        BaseSportManager.getInstance().stagingAndNotification("POWER_DATA", Integer.valueOf(iAe));
        BaseSportManager.getInstance().stagingAndNotification("CADENCE_DATA", Integer.valueOf(iM));
        BaseSportManager.getInstance().stagingAndNotification("INCLINATION_DATA", Integer.valueOf(iY));
        BaseSportManager.getInstance().stagingAndNotification("ANALOG_POWER_DATA", Integer.valueOf(iH));
        BaseSportManager.getInstance().stagingAndNotification("THREE_SEC_POWER_DATA", Integer.valueOf(iAs));
        BaseSportManager.getInstance().stagingAndNotification("THREE_SEC_ANALOG_POWER_DATA", Integer.valueOf(iAo));
        BaseSportManager.getInstance().stagingAndNotification("ANALOG_CADENCE_DATA", Integer.valueOf(iF));
        BaseSportManager.getInstance().stagingAndNotification("AVG_CADENCE_DATA", Integer.valueOf(iN));
        BaseSportManager.getInstance().stagingAndNotification("AVG_ANALOG_CADENCE_DATA", Integer.valueOf(iJ));
        BaseSportManager.getInstance().stagingAndNotification("AVG_POWER_DATA", Integer.valueOf(iAm));
        BaseSportManager.getInstance().stagingAndNotification("AVG_ANALOG_POWER_DATA", Integer.valueOf(iAh));
        BaseSportManager.getInstance().stagingAndNotification("STEP_DATA", Integer.valueOf(iAn));
        BaseSportManager.getInstance().stagingAndNotification("STEP_RATE_DATA", Integer.valueOf(iO));
        BaseSportManager.getInstance().stagingAndNotification("CONTACT_TIME_DATA", Double.valueOf(dR));
        BaseSportManager.getInstance().stagingAndNotification("GROUND_IMPACT_ACCELERATION_DATA", Double.valueOf(dX));
        BaseSportManager.getInstance().stagingAndNotification("EVERSION_EXCURSION_DATA", Double.valueOf(dP));
        BaseSportManager.getInstance().stagingAndNotification("SWING_ANGLE_DATA", Double.valueOf(dAl));
        BaseSportManager.getInstance().stagingAndNotification("HANG_TIME_DATA", Double.valueOf(dV));
        BaseSportManager.getInstance().stagingAndNotification("GROUND_HANG_TIME_DATA", Double.valueOf(dT));
        BaseSportManager.getInstance().stagingAndNotification("GCTIME_BALANCE_DATA", Double.valueOf(dAu));
        BaseSportManager.getInstance().stagingAndNotification("VERTICAL_OSCILLATION_DATA", Double.valueOf(dAw));
        BaseSportManager.getInstance().stagingAndNotification("VERTICAL_RATIO_DATA", Double.valueOf(dAt));
        BaseSportManager.getInstance().stagingAndNotification("ACTIVE_PEAK_DATA", Double.valueOf(dB));
        BaseSportManager.getInstance().stagingAndNotification("VERTICAL_LOADING_RATE_DATA", Double.valueOf(dAx));
        if (!isInvalidLocation(dAd, dAc)) {
            BaseSportManager.getInstance().stagingAndNotification("GPS_DATA", buildLocation(jQ, dAd, dAc));
        }
        BaseSportManager.getInstance().stagingAndNotification("TIME_ONE_SECOND_DURATION", Long.valueOf(jS));
    }

    boolean isInvalidLocation(double d, double d2) {
        return izt.d(d2) || izt.b(d);
    }

    Location buildLocation(long j, double d, double d2) {
        Location location = new Location(GeocodeSearch.GPS);
        location.setTime(j);
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }

    private void registerRealDataListener() {
        if (this.mLinkagePlatformApi == null || this.mDataListener != null) {
            return;
        }
        initDataListener();
        this.mLinkagePlatformApi.registerRealDataListener(this.mDataListener);
        ReleaseLogUtil.c(TAG, "registerRealDataListener");
    }

    private void unregisterRealDataListener() {
        DataListener dataListener;
        LinkagePlatformApi linkagePlatformApi = this.mLinkagePlatformApi;
        if (linkagePlatformApi == null || (dataListener = this.mDataListener) == null) {
            return;
        }
        linkagePlatformApi.unRegisterRealDataListener(dataListener);
        ReleaseLogUtil.c(TAG, "unRegisterRealDataListener");
    }
}
