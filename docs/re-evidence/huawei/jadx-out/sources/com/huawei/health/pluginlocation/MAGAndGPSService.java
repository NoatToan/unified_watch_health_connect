package com.huawei.health.pluginlocation;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.PowerManager;
import androidx.core.app.ActivityCompat;
import com.huawei.health.pluginlocation.logger.Logger;
import defpackage.gqt;
import defpackage.gqw;
import defpackage.grn;
import java.io.File;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes8.dex */
public class MAGAndGPSService implements SensorEventListener {
    private static final int GPS_TRANSMIT_FREQUENCY = 5;
    private static final int MAG_SAMPLING_PERIODUS = 10000;
    private static final int MAG_TIME_INTERVAL = 99;
    private static final int MAX_MAG_QUE_LENGTH = 600;
    private static final String TAG = "AAR,MAGAndGPSService";
    private static Context context;
    private static boolean isLoadSuccess;
    private GpsData mGpsData;
    private MagData mMagData;
    private Sensor magnetometer;
    private SensorManager sensorManager;
    private int stopFlag;
    private static gqt downloadUtil = new gqt();
    private static MAGAndGPSService magInstance = null;
    private long lastUpdate = 0;
    private long currentTime = 0;
    private int gpsNum = 0;
    private LinkedBlockingQueue<GpsData> locationQue = new LinkedBlockingQueue<>();
    private LinkedBlockingQueue<MagData> magDataQue = new LinkedBlockingQueue<>();
    private PowerManager.WakeLock mWakeLock = null;

    public native void alignGpsAndMagData(LinkedBlockingQueue<GpsData> linkedBlockingQueue, int i, LinkedBlockingQueue<MagData> linkedBlockingQueue2, int i2, int i3);

    static {
        try {
            System.loadLibrary("TrackProcessNew");
            isLoadSuccess = true;
        } catch (UnsatisfiedLinkError unused) {
            grn.e(TAG, "no TrackProcessNew lib");
            isLoadSuccess = false;
        }
    }

    public MAGAndGPSService(Context context2) {
        context = context2;
        SensorManager sensorManager = (SensorManager) context2.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.magnetometer = sensorManager.getDefaultSensor(2);
    }

    public static void init(Context context2) {
        if (magInstance == null) {
            magInstance = new MAGAndGPSService(context2);
        }
    }

    public static MAGAndGPSService getInstance(Context context2) {
        init(context2);
        return magInstance;
    }

    public void start(String str, Logger logger) {
        grn.a(logger);
        resume();
        this.gpsNum = 0;
        try {
            Location locationC = downloadUtil.c(context);
            if (locationC == null) {
                grn.c(TAG, "[start], location is null");
                return;
            }
            String strD = gqw.d(context, locationC.getLatitude(), locationC.getLongitude());
            String str2 = ((File) Objects.requireNonNull(((File) Objects.requireNonNull(context.getExternalCacheDir())).getParentFile())).getPath() + "/files/RunwayRoutes/roadData/";
            grn.d(TAG, "[startDownload] download start url = " + str + " savePath = " + str2);
            if (!str.isEmpty() && "CN".equalsIgnoreCase(strD)) {
                downloadUtil.a(context, str, str2);
            }
            grn.d(TAG, "download roaddata successed.");
        } catch (Exception e) {
            grn.c(TAG, "download roaddata failed." + e.getMessage());
        }
    }

    public void resume() {
        if (!isLoadSuccess) {
            grn.c(TAG, "loadLibrary failed, can not start transfer gps and mag data.");
            return;
        }
        acquireWakeLock();
        this.sensorManager.registerListener(this, this.magnetometer, 10000);
        this.stopFlag = 0;
        grn.d(TAG, "start, stopFlag=" + this.stopFlag);
    }

    public void pause() {
        releaseWakeLock();
        this.sensorManager.unregisterListener(this);
        this.stopFlag = 2;
        grn.d(TAG, "pause, stopFlag=" + this.stopFlag);
        Iterator<MagData> it = this.magDataQue.iterator();
        while (it.hasNext()) {
            grn.d(TAG, "$MagData," + it.next().toString());
        }
        LinkedBlockingQueue<GpsData> linkedBlockingQueue = this.locationQue;
        int size = linkedBlockingQueue.size();
        LinkedBlockingQueue<MagData> linkedBlockingQueue2 = this.magDataQue;
        alignGpsAndMagData(linkedBlockingQueue, size, linkedBlockingQueue2, linkedBlockingQueue2.size(), this.stopFlag);
    }

    public void stop() {
        releaseWakeLock();
        this.sensorManager.unregisterListener(this);
        this.stopFlag = 1;
        grn.d(TAG, "stop, stopFlag=" + this.stopFlag);
        Iterator<MagData> it = this.magDataQue.iterator();
        while (it.hasNext()) {
            grn.d(TAG, "$MagData," + it.next().toString());
        }
        LinkedBlockingQueue<GpsData> linkedBlockingQueue = this.locationQue;
        int size = linkedBlockingQueue.size();
        LinkedBlockingQueue<MagData> linkedBlockingQueue2 = this.magDataQue;
        alignGpsAndMagData(linkedBlockingQueue, size, linkedBlockingQueue2, linkedBlockingQueue2.size(), this.stopFlag);
        magInstance = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.currentTime = jCurrentTimeMillis;
            if (jCurrentTimeMillis - this.lastUpdate >= 99) {
                this.lastUpdate = jCurrentTimeMillis;
                this.mMagData = new MagData(this.currentTime, sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                try {
                    if (this.magDataQue.size() >= 600) {
                        this.magDataQue.poll();
                    }
                    this.magDataQue.put(this.mMagData);
                } catch (InterruptedException e) {
                    grn.c(TAG, "magDataQue put exception" + e.getMessage());
                }
            }
        }
    }

    public void setGpsLocation(Location location) {
        try {
            this.mGpsData = new GpsData(location.getTime(), location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getSpeed());
            if (location.getProvider().equals("network") && this.gpsNum == 0) {
                grn.c(TAG, "first location exception," + this.mGpsData.toString());
                return;
            }
            this.gpsNum++;
            this.locationQue.put(this.mGpsData);
            this.stopFlag = 0;
            grn.d(TAG, "$GpsData," + this.mGpsData.toString());
            if (this.locationQue.size() < 5) {
                return;
            }
            Iterator<MagData> it = this.magDataQue.iterator();
            while (it.hasNext()) {
                grn.d(TAG, "$MagData," + it.next().toString());
            }
            LinkedBlockingQueue<GpsData> linkedBlockingQueue = this.locationQue;
            int size = linkedBlockingQueue.size();
            LinkedBlockingQueue<MagData> linkedBlockingQueue2 = this.magDataQue;
            alignGpsAndMagData(linkedBlockingQueue, size, linkedBlockingQueue2, linkedBlockingQueue2.size(), this.stopFlag);
        } catch (Exception e) {
            grn.c(TAG, "setGpsLocation exception" + e.getMessage());
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (sensor.getType() == 2) {
            if (i == 0) {
                grn.d(TAG, "Magnetic sensor is unreliable");
                return;
            }
            if (i == 1) {
                grn.d(TAG, "Magnetic sensor accuracy low");
            } else if (i == 2) {
                grn.d(TAG, "Magnetic sensor accuracy medium");
            } else {
                if (i != 3) {
                    return;
                }
                grn.d(TAG, "Magnetic sensor accuracy High");
            }
        }
    }

    private void acquireWakeLock() {
        if (this.mWakeLock == null) {
            if (ActivityCompat.checkSelfPermission(context, "android.permission.WAKE_LOCK") != 0) {
                grn.e(TAG, "no WAKE_LOCK permission, plz check permission setting.");
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, TAG);
            this.mWakeLock = wakeLockNewWakeLock;
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.acquire();
                grn.d(TAG, "wakelock start");
            }
        }
    }

    private void releaseWakeLock() {
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.mWakeLock.release();
        this.mWakeLock = null;
        grn.d(TAG, "wakelock stop");
    }
}
