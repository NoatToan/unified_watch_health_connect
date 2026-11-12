package com.huami.mifit.sportlib.core;

import com.huami.mifit.sportlib.callback.IServiceDataCallback;
import com.huami.mifit.sportlib.callback.IServiceSportCallback;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.devicekit.SportDeviceKit;
import com.huami.mifit.sportlib.locate.GPSLocationHelper;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.utils.ConfigUtils;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;

/* JADX INFO: loaded from: classes11.dex */
public class GPSDataController {
    private static final String i = "GPSDataController";
    private static GPSDataController j;
    private long a = -1;
    private GPSDataAnalysis b = null;
    private b c = null;
    private a d = null;
    private boolean e = false;
    private int f = -1;
    private int g = -1;
    private boolean h = false;

    private GPSDataController() {
    }

    private boolean a() {
        return this.a != -1 && this.e;
    }

    public static synchronized GPSDataController getInstance() {
        if (j == null) {
            j = new GPSDataController();
        }
        return j;
    }

    public int getSportType() {
        return this.f;
    }

    public int getState() {
        return this.g;
    }

    public int getTickerTime() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return (int) (bVar.X() / 1000);
    }

    public long getTrackId() {
        return this.a;
    }

    public boolean isIndoorRun() {
        return DataTypeSource.isIndoorRun(this.f);
    }

    public boolean isNeedGpsListener() {
        return DataTypeSource.isNeedGpsListener(this.f);
    }

    public synchronized boolean isRealStarting() {
        return a();
    }

    public synchronized boolean isRunning() {
        return this.a != -1 || this.h;
    }

    public synchronized void pause(int i2) {
        LogKit.w2f(i, "pause emitter:" + i2 + ",trackId" + this.a);
        this.g = 2;
        SportDeviceKit.getInstance().deviceServicePause(i2);
        if (i2 != 19) {
            this.e = false;
            SportDeviceKit.getInstance().sportPause(i2);
            this.b.stop();
            setAutoPauseEnabled(false);
        }
        b bVar = this.c;
        if (bVar != null) {
            bVar.e0(i2 == 19);
        }
    }

    public long recoverRun(int i2, long j2, IServiceDataCallback iServiceDataCallback, IServiceSportCallback iServiceSportCallback) {
        LogKit.w2f(i, "initRecoverRun:" + j2);
        this.b = new GPSDataAnalysis();
        this.a = j2;
        this.f = i2;
        b bVar = new b(j2, i2, iServiceDataCallback, iServiceSportCallback);
        this.c = bVar;
        long jQ0 = bVar.q0(j2);
        this.b.init(j2, i2);
        if (isIndoorRun()) {
            this.b.in(ConfigUtils.getStepLArray());
        }
        this.b.start(this.c);
        SportDeviceKit.getInstance().sportStart(18);
        this.e = true;
        return jQ0;
    }

    public void restoreGpsLine() {
        this.c.s0();
    }

    public synchronized void resume(int i2) {
        LogKit.w2f(i, "resume emitter:" + i2 + ",trackId" + this.a);
        if (this.g != 2) {
            LogKit.w2f(i, "invalid sport state:" + this.g + " for resume sport");
            return;
        }
        this.c.f0();
        if (i2 != 19 && !this.b.isAlgoRunning()) {
            this.b.start(this.c);
            SportDeviceKit.getInstance().sportResume(i2);
        }
        SportDeviceKit.getInstance().deviceServiceResume(i2);
        if (isIndoorRun()) {
            setAutoPauseEnabled(false);
        } else {
            setAutoPauseEnabled(ConfigUtils.getConfig(getSportType()).getAutoPauseEnable().booleanValue());
        }
        this.e = true;
        this.g = 3;
    }

    public void sendAccData(float f, float f2, float f3) {
        if (a()) {
            if (this.d == null) {
                this.d = new a();
            }
            this.d.a(f, f2, f3);
            if (this.d.f()) {
                this.b.in(this.d.b(), this.d.c(), this.d.d(), this.d.e());
                this.d = null;
            }
        }
    }

    public void sendDeviceConnect(boolean z, boolean z2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.Z(z, z2);
        }
    }

    public void sendGpsData(long j2, double d, double d2, float f, int i2, float f2) {
        if (FunctionSwitcher.isSupportRecordKeyData) {
            LogKit.w2f(i, "sendGpsData:" + j2 + "," + d + "," + d2 + "," + f + "," + i2 + "," + f2);
        }
        if (a() && isNeedGpsListener()) {
            if (GPSLocationHelper.getInstance().getLocationTimeStampOffset() == 0) {
                GPSLocationHelper.getInstance().setLocationTimeStampOffset(j2 - System.currentTimeMillis());
            }
            this.b.in(j2, d, d2, f, i2, f2);
        }
    }

    public void sendHrData(int i2) {
        if (a()) {
            this.b.in(System.currentTimeMillis(), i2);
        }
    }

    public void sendHrState(int i2, int i3) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.b0(i2, i3);
        }
    }

    public void sendPressureData(float f) {
        if (a()) {
            this.b.in(f);
        }
    }

    public void sendStepData(int i2, int i3, int i4, int i5, int i6, int i7) {
        b bVar;
        if (a()) {
            this.b.in(i2, i3, i4);
            if (i5 <= 0 || i6 <= 0 || (bVar = this.c) == null) {
                return;
            }
            bVar.d0(i3, i5, i6, i7);
        }
    }

    public void sendTickerData(long j2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.l0(j2);
        }
    }

    public void setAutoPauseEnabled(boolean z) {
        GPSDataAnalysis gPSDataAnalysis = this.b;
        if (gPSDataAnalysis != null) {
            gPSDataAnalysis.b(z);
        }
    }

    public void setCountingDown(boolean z) {
        this.h = z;
    }

    public void setSportControlByDevice(int i2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.h0(i2, 20);
        }
    }

    public synchronized void start(int i2, long j2, IServiceDataCallback iServiceDataCallback, IServiceSportCallback iServiceSportCallback) {
        LogKit.w2f(i, "start:" + j2 + ",sportType=" + i2);
        this.b = new GPSDataAnalysis();
        this.a = j2;
        this.f = i2;
        this.c = new b(j2, i2, iServiceDataCallback, iServiceSportCallback);
        this.b.init(j2, i2);
        if (isIndoorRun()) {
            this.b.in(ConfigUtils.getStepLArray());
        }
        this.b.start(this.c);
        SportDeviceKit.getInstance().sportStart(18);
        this.e = true;
        this.g = 1;
        setCountingDown(false);
    }

    public synchronized void stop(int i2) {
        LogKit.w2f(i, "stop sport:" + this.a + ", emitter=" + i2);
        this.e = false;
        this.g = 4;
        SportDeviceKit.getInstance().deviceServiceStop(i2);
        SportDeviceKit.getInstance().sportStop(i2);
        this.b.deInit();
        this.a = -1L;
        this.c.k0();
        this.c = null;
        GPSLocationHelper.getInstance().setLocationTimeStampOffset(0L);
    }

    public synchronized void verify(long[] jArr, short[] sArr, int i2) {
        LogKit.w2f(i, "indoor-run: verify:" + this.a);
        this.b.in(jArr, sArr, ConfigUtils.getIndoorModelArray(), i2);
    }
}
