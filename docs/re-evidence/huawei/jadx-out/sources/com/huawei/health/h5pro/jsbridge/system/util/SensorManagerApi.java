package com.huawei.health.h5pro.jsbridge.system.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hms.network.embedded.q0;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
final class SensorManagerApi implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SensorDataCallback f6951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SensorTypeEnum f6952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6953c = 0;
    private final float[] d = new float[3];
    private SensorManager e;

    /* JADX INFO: loaded from: classes28.dex */
    public enum SamplingPeriodUs {
        SENSOR_DELAY_FASTEST(0),
        SENSOR_DELAY_GAME(1),
        SENSOR_DELAY_UI(2),
        SENSOR_DELAY_NORMAL(3);

        private final int samplingPeriodUs;

        SamplingPeriodUs(int i) {
            this.samplingPeriodUs = i;
        }
    }

    public interface SensorDataCallback {
        void onComplete();

        void onFailure(int i, String str);

        void onSuccess(JSONObject jSONObject);
    }

    public enum SensorTypeEnum {
        SENSOR_TYPE_GYROSCOPE(4),
        SENSOR_TYPE_ACCELEROMETER(1),
        SENSOR_TYPE_GRAVITY(9),
        SENSOR_TYPE_ROTATION_VECTOR(11),
        SENSOR_TYPE_LINEAR_ACCELERATION(10),
        SENSOR_TYPE_MAGNETIC_FIELD(2),
        SENSOR_TYPE_PROXIMITY(8),
        SENSOR_TYPE_LIGHT(5),
        SENSOR_TYPE_PRESSURE(6),
        SENSOR_TYPE_AMBIENT_TEMPERATURE(13);

        private final int sensorType;

        SensorTypeEnum(int i) {
            this.sensorType = i;
        }
    }

    public SensorManagerApi(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService(SensorManager.class);
        this.e = sensorManager;
        if (sensorManager == null) {
            this.e = (SensorManager) context.getSystemService("sensor");
        }
    }

    private float[] a(SensorEvent sensorEvent) {
        long j = this.f6953c;
        if (j == 0) {
            this.f6953c = sensorEvent.timestamp;
            return new float[]{0.0f, 0.0f, 0.0f};
        }
        float f = (sensorEvent.timestamp - j) * 1.0E-9f;
        float[] fArr = this.d;
        float f2 = fArr[0];
        float[] fArr2 = sensorEvent.values;
        fArr[0] = (fArr2[0] * f) + f2;
        fArr[1] = (fArr2[1] * f) + fArr[1];
        fArr[2] = (fArr2[2] * f) + fArr[2];
        return fArr;
    }

    public void a(String str, String str2, SensorDataCallback sensorDataCallback) {
        d();
        this.f6951a = sensorDataCallback;
        try {
            SensorTypeEnum sensorTypeEnumValueOf = SensorTypeEnum.valueOf(str);
            this.f6952b = sensorTypeEnumValueOf;
            Sensor defaultSensor = this.e.getDefaultSensor(sensorTypeEnumValueOf.sensorType);
            if (defaultSensor != null) {
                this.e.registerListener(this, defaultSensor, TextUtils.isEmpty(str2) ? SamplingPeriodUs.SENSOR_DELAY_UI.samplingPeriodUs : SamplingPeriodUs.valueOf(str2).samplingPeriodUs);
                return;
            }
            SensorDataCallback sensorDataCallback2 = this.f6951a;
            Locale locale = Locale.ENGLISH;
            sensorDataCallback2.onFailure(1002, "Sensor " + str + " not supported");
        } catch (IllegalArgumentException e) {
            this.f6951a.onFailure(-1, e.getMessage());
        }
    }

    public void d() {
        SensorManager sensorManager = this.e;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        SensorDataCallback sensorDataCallback = this.f6951a;
        if (sensorDataCallback == null) {
            return;
        }
        sensorDataCallback.onComplete();
        this.f6951a = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        LogUtil.i("H5PRO_SensorManagerApi", sensor.getType() + " <- sensor - onAccuracyChanged - accuracy -> " + i);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f6951a == null) {
            LogUtil.w("H5PRO_SensorManagerApi", "onSensorChanged: mSensorDataCallback is null");
            return;
        }
        if (sensorEvent == null) {
            LogUtil.w("H5PRO_SensorManagerApi", "onSensorChanged: SensorEvent is null");
            this.f6951a.onFailure(-1, "SensorEvent is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(q0.j, new JSONArray(sensorEvent.values));
            jSONObject.put("accuracy", sensorEvent.accuracy);
            jSONObject.put("timestamp", sensorEvent.timestamp);
            jSONObject.put("sensorType", this.f6952b.name());
            if (this.f6952b.sensorType == 4) {
                jSONObject.put("angle", new JSONArray(a(sensorEvent)));
            }
            this.f6951a.onSuccess(jSONObject);
        } catch (JSONException e) {
            LogUtil.e("H5PRO_SensorManagerApi", b.a(e, new StringBuilder("onSensorChanged: exception -> ")));
            this.f6951a.onFailure(-1, e.getMessage());
        }
    }
}
