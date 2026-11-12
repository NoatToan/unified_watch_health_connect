package com.xiaomi.fitness.sport_manager.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ServiceManager;
import androidx.annotation.RequiresApi;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.sport_manager.utils.UserInfo;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo;
import defpackage.dzc;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class SportSensorManager {
    public static final int GYM_SENSOR_TYPE = 33171041;
    public static final int SAMPLING_PERIOD_US_25HZ = 40000;
    public static final int SENSOR_DELAY_NORMAL = 3;
    private static final long SENSOR_UPDATE_TIME_INTERVAL = 1;
    private static final String TAG = "SportSensorManager";
    public static int pauseStep;
    private int gymTotalStep;
    private Sensor mAccSendor;
    Binder mBinder;
    private Sensor mGymSensor;
    private dzc mListener;
    private IFitnessSportAlgo mSportAlgo;
    private Sensor mStebSensor;
    private int preStep;
    private long preTime;
    private int totalStep;
    private int curAccSamplingPeriodUs = 3;
    private boolean isPause = false;
    private SensorEventListener mSensorEventListener = new a();
    private final String mServiceName = "miui_step_counter_service";
    private SportSensorResult sportSensorResult = new SportSensorResult();
    private SensorManager mSensorManager = (SensorManager) AppUtil.getApp().getSystemService("sensor");

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 18) {
                if (!SportSensorManager.this.isPause && sensorEvent.values[0] == 1.0f) {
                    SportSensorManager.this.totalStep++;
                    FitnessLogUtils.d(SportSensorManager.TAG, "TYPE_STEP_DETECTOR , TOTAL:" + SportSensorManager.this.totalStep + ", preStep:" + SportSensorManager.this.preStep + ", pauseStep:" + SportSensorManager.pauseStep);
                }
            } else if (sensorEvent.sensor.getType() == 19) {
                int i = (int) sensorEvent.values[0];
                if (SportSensorManager.this.preStep == 0 || SportSensorManager.this.isPause) {
                    SportSensorManager.this.preStep = i;
                }
                if (!SportSensorManager.this.isPause) {
                    SportSensorManager sportSensorManager = SportSensorManager.this;
                    sportSensorManager.totalStep = (i - sportSensorManager.preStep) + SportSensorManager.pauseStep;
                    FitnessLogUtils.d(SportSensorManager.TAG, "TYPE_STEP_COUNTER , TOTAL:" + SportSensorManager.this.totalStep + ", curStep:" + i + ", preStep:" + SportSensorManager.this.preStep + ", pauseStep:" + SportSensorManager.pauseStep);
                }
            }
            if (sensorEvent.sensor.getType() == 1) {
                SportSensorManager.this.sportSensorResult.f13201b = sensorEvent.values[0];
                SportSensorManager.this.sportSensorResult.c = sensorEvent.values[1];
                SportSensorManager.this.sportSensorResult.d = sensorEvent.values[2];
                SportSensorManager.this.mSportAlgo.autoPauseHandle(SportSensorManager.this.sportSensorResult.f13201b, SportSensorManager.this.sportSensorResult.c, SportSensorManager.this.sportSensorResult.d);
            }
            if (sensorEvent.sensor.getType() == 33171041) {
                SportSensorManager.this.gymTotalStep += (int) sensorEvent.values[0];
            }
            if (SportSensorManager.this.totalStep > SportSensorManager.this.gymTotalStep) {
                SportSensorManager.this.sportSensorResult.f13200a = SportSensorManager.this.totalStep;
            } else {
                SportSensorManager.this.sportSensorResult.f13200a = SportSensorManager.this.gymTotalStep;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (timeUnit.toSeconds(System.currentTimeMillis()) - SportSensorManager.this.preTime >= 1) {
                FitnessLogUtils.d(SportSensorManager.TAG, "phone step : " + SportSensorManager.this.totalStep + ", gymTotalStep : " + SportSensorManager.this.gymTotalStep + ", totalStep : " + SportSensorManager.this.sportSensorResult.f13200a + ",paseStep : " + SportSensorManager.pauseStep);
                SportSensorManager.this.mListener.b(SportSensorManager.this.sportSensorResult);
                SportSensorManager.this.preTime = timeUnit.toSeconds(System.currentTimeMillis());
            }
        }
    }

    public SportSensorManager(dzc dzcVar) {
        this.mListener = dzcVar;
        if (!RomUtils.isXiaomi() || Build.VERSION.SDK_INT < 34) {
            this.mStebSensor = this.mSensorManager.getDefaultSensor(19);
        } else {
            this.mStebSensor = this.mSensorManager.getDefaultSensor(18);
        }
        this.mAccSendor = this.mSensorManager.getDefaultSensor(1);
        this.mGymSensor = this.mSensorManager.getDefaultSensor(33171041);
        this.mSportAlgo = FitnessSportAlgo.getInstance(UserInfo.INSTANCE.getUserProfile());
    }

    @RequiresApi(api = 29)
    private void setMiuiStepSensorService(boolean z) {
        IBinder service = ServiceManager.getService("miui_step_counter_service");
        if (service == null) {
            return;
        }
        FitnessLogUtils.i(TAG, "get system service : " + service);
        if (this.mBinder == null) {
            this.mBinder = new Binder();
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        parcelObtain.writeInterfaceToken("miui_step_counter_service");
        parcelObtain.writeBoolean(z);
        parcelObtain.writeStrongBinder(this.mBinder);
        try {
            service.transact(0, parcelObtain, parcelObtain2, 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void pauseOrStopSensor(int i) {
        FitnessLogUtils.i(TAG, "pauseOrStopSensor ， sportState : " + i);
        if (i == 2) {
            pauseStep = this.totalStep;
            this.isPause = true;
        }
        if (this.mSensorManager != null) {
            if (i == 4) {
                FitnessLogUtils.i(TAG, "ACC unregisterListener , sportstate is finish");
                this.mSensorManager.unregisterListener(this.mSensorEventListener, this.mAccSendor);
                this.mSensorManager.unregisterListener(this.mSensorEventListener, this.mStebSensor);
            }
            if (i == 2 && this.curAccSamplingPeriodUs == 3) {
                FitnessLogUtils.i(TAG, "ACC unregisterListener , sportstate is pause");
                this.mSensorManager.unregisterListener(this.mSensorEventListener, this.mAccSendor);
            }
            this.mSensorManager.unregisterListener(this.mSensorEventListener, this.mGymSensor);
            if (Build.VERSION.SDK_INT >= 29 && RomUtils.isXiaomi()) {
                setMiuiStepSensorService(false);
            }
        }
        this.preStep = 0;
        this.gymTotalStep = 0;
        SportSensorResult sportSensorResult = this.sportSensorResult;
        if (sportSensorResult != null) {
            sportSensorResult.f13200a = 0;
        }
    }

    public void restartAccSensor() {
        FitnessLogUtils.i(TAG, "restartAccSensor()");
        this.isPause = false;
        this.mSensorManager.unregisterListener(this.mSensorEventListener, this.mAccSendor);
        this.mSensorManager.registerListener(this.mSensorEventListener, this.mAccSendor, this.curAccSamplingPeriodUs);
    }

    public void startAccSensor(int i) {
        FitnessLogUtils.i(TAG, "startAccSensor : " + i);
        this.curAccSamplingPeriodUs = i;
        this.mSensorManager.unregisterListener(this.mSensorEventListener, this.mAccSendor);
        this.mSensorManager.registerListener(this.mSensorEventListener, this.mAccSendor, i);
    }

    public void startGymSensor() {
        FitnessLogUtils.i(TAG, "startGymSensor()");
        if (Build.VERSION.SDK_INT >= 29 && RomUtils.isXiaomi()) {
            setMiuiStepSensorService(true);
        }
        this.mSensorManager.registerListener(this.mSensorEventListener, this.mGymSensor, 3);
    }

    public void startStepSensor() {
        FitnessLogUtils.i(TAG, "startStepSensor()");
        this.mSensorManager.registerListener(this.mSensorEventListener, this.mStebSensor, 3);
    }
}
