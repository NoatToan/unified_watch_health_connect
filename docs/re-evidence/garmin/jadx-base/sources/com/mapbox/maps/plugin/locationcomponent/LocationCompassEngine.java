package com.mapbox.maps.plugin.locationcomponent;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxLogger;
import j20.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 K2\u00020\u0001:\u0002KLB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b%\u0010#J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J!\u0010/\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020 0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020'0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010DR\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010D¨\u0006M"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "updateOrientation", "()V", "", ModelSourceWrapper.ORIENTATION, "", "worldAxisForDeviceAxisX", "worldAxisForDeviceAxisY", "Lo13/p;", "adjustWorldAxis", "([FII)Lo13/p;", "getWorldAxisFromRotation", "()Lo13/p;", "", "heading", "notifyCompassChangeListeners", "(F)V", "registerSensorListeners", "unregisterSensorListeners", "", "isCompassSensorAvailable", "()Z", "newValues", "smoothedValues", "lowPassFilter", "([F[F)[F", "Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine$CompassListener;", "compassListener", "addCompassListener$plugin_locationcomponent_release", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine$CompassListener;)V", "addCompassListener", "removeCompassListener$plugin_locationcomponent_release", "removeCompassListener", "Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassCalibrationListener;", "compassCalibrationListener", "addCalibrationListener", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassCalibrationListener;)V", "removeCalibrationListener", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "", "compassListeners", "Ljava/util/Set;", "calibrationListeners", "compassSensor", "Landroid/hardware/Sensor;", "gravitySensor", "magneticFieldSensor", "rotationMatrix", "[F", "rotationVectorValue", "", "compassUpdateNextTimestamp", "J", "gravityValues", "magneticValues", "Companion", "CompassListener", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationCompassEngine implements SensorEventListener {

    @Deprecated
    private static final float ALPHA = 0.45f;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int SENSOR_DELAY_MICROS = 100000;

    @Deprecated
    private static final String TAG = "LocationCompassProvider";
    private final Set<LocationCompassCalibrationListener> calibrationListeners;
    private final Set<CompassListener> compassListeners;
    private Sensor compassSensor;
    private long compassUpdateNextTimestamp;
    private Sensor gravitySensor;
    private float[] gravityValues;
    private Sensor magneticFieldSensor;
    private float[] magneticValues;
    private final float[] orientation;
    private final float[] rotationMatrix;
    private float[] rotationVectorValue;
    private final SensorManager sensorManager;
    private final WindowManager windowManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine$CompassListener;", "", "onCompassChanged", "", "userHeading", "", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface CompassListener {
        void onCompassChanged(float userHeading);
    }

    public LocationCompassEngine(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("window");
        systemService.getClass();
        this.windowManager = (WindowManager) systemService;
        Object systemService2 = context.getApplicationContext().getSystemService("sensor");
        systemService2.getClass();
        SensorManager sensorManager = (SensorManager) systemService2;
        this.sensorManager = sensorManager;
        this.compassListeners = new LinkedHashSet();
        this.calibrationListeners = new LinkedHashSet();
        this.rotationMatrix = new float[9];
        this.gravityValues = new float[3];
        this.magneticValues = new float[3];
        this.orientation = new float[3];
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        this.compassSensor = defaultSensor;
        if (defaultSensor == null) {
            MapboxLogger.logW(TAG, "Rotation vector sensor not supported on device, falling back to accelerometer and magnetic field.");
            this.gravitySensor = sensorManager.getDefaultSensor(1);
            this.magneticFieldSensor = sensorManager.getDefaultSensor(2);
        }
    }

    private final p<Integer, Integer> adjustWorldAxis(float[] orientation, int worldAxisForDeviceAxisX, int worldAxisForDeviceAxisY) {
        float f14 = orientation[1];
        if (f14 < -0.7853981633974483d) {
            int rotation = this.windowManager.getDefaultDisplay().getRotation();
            if (rotation == 1) {
                worldAxisForDeviceAxisY = 129;
                worldAxisForDeviceAxisX = 3;
            } else if (rotation == 2) {
                worldAxisForDeviceAxisY = 131;
                worldAxisForDeviceAxisX = 129;
            } else if (rotation != 3) {
                worldAxisForDeviceAxisX = 1;
                worldAxisForDeviceAxisY = 3;
            } else {
                worldAxisForDeviceAxisY = 1;
                worldAxisForDeviceAxisX = 131;
            }
        } else if (f14 > 0.7853981633974483d) {
            int rotation2 = this.windowManager.getDefaultDisplay().getRotation();
            if (rotation2 == 1) {
                worldAxisForDeviceAxisX = 131;
                worldAxisForDeviceAxisY = 129;
            } else if (rotation2 == 2) {
                worldAxisForDeviceAxisX = 129;
                worldAxisForDeviceAxisY = 3;
            } else if (rotation2 != 3) {
                worldAxisForDeviceAxisX = 1;
                worldAxisForDeviceAxisY = 131;
            } else {
                worldAxisForDeviceAxisY = 1;
                worldAxisForDeviceAxisX = 3;
            }
        } else if (Math.abs(orientation[2]) > 1.5707963267948966d) {
            int rotation3 = this.windowManager.getDefaultDisplay().getRotation();
            worldAxisForDeviceAxisX = 130;
            if (rotation3 == 1) {
                worldAxisForDeviceAxisY = 129;
            } else if (rotation3 == 2) {
                worldAxisForDeviceAxisX = 129;
                worldAxisForDeviceAxisY = 2;
            } else if (rotation3 != 3) {
                worldAxisForDeviceAxisY = 130;
                worldAxisForDeviceAxisX = 1;
            } else {
                worldAxisForDeviceAxisY = 1;
                worldAxisForDeviceAxisX = 2;
            }
        }
        return new p<>(Integer.valueOf(worldAxisForDeviceAxisX), Integer.valueOf(worldAxisForDeviceAxisY));
    }

    private final p<Integer, Integer> getWorldAxisFromRotation() {
        int rotation = this.windowManager.getDefaultDisplay().getRotation();
        int i14 = 129;
        int i15 = 2;
        if (rotation == 1) {
            i15 = 129;
            i14 = 2;
        } else if (rotation == 2) {
            i15 = 130;
        } else if (rotation != 3) {
            i14 = 1;
        } else {
            i15 = 1;
            i14 = 130;
        }
        return new p<>(Integer.valueOf(i14), Integer.valueOf(i15));
    }

    private final boolean isCompassSensorAvailable() {
        return this.compassSensor != null;
    }

    private final float[] lowPassFilter(float[] newValues, float[] smoothedValues) {
        if (smoothedValues == null) {
            return newValues;
        }
        int length = newValues.length;
        for (int i14 = 0; i14 < length; i14++) {
            float f14 = smoothedValues[i14];
            smoothedValues[i14] = x.a(newValues[i14], f14, ALPHA, f14);
        }
        return smoothedValues;
    }

    private final void notifyCompassChangeListeners(float heading) {
        Iterator<CompassListener> it = this.compassListeners.iterator();
        while (it.hasNext()) {
            it.next().onCompassChanged(heading);
        }
    }

    private final void registerSensorListeners() {
        boolean zIsCompassSensorAvailable = isCompassSensorAvailable();
        SensorManager sensorManager = this.sensorManager;
        if (zIsCompassSensorAvailable) {
            sensorManager.registerListener(this, this.compassSensor, 100000);
        } else {
            sensorManager.registerListener(this, this.gravitySensor, 100000);
            this.sensorManager.registerListener(this, this.magneticFieldSensor, 100000);
        }
    }

    private final void unregisterSensorListeners() {
        boolean zIsCompassSensorAvailable = isCompassSensorAvailable();
        SensorManager sensorManager = this.sensorManager;
        if (zIsCompassSensorAvailable) {
            sensorManager.unregisterListener(this, this.compassSensor);
        } else {
            sensorManager.unregisterListener(this, this.gravitySensor);
            this.sensorManager.unregisterListener(this, this.magneticFieldSensor);
        }
    }

    private final void updateOrientation() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < this.compassUpdateNextTimestamp) {
            return;
        }
        float[] fArr = this.rotationVectorValue;
        float[] fArr2 = this.rotationMatrix;
        if (fArr != null) {
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        } else {
            SensorManager.getRotationMatrix(fArr2, null, this.gravityValues, this.magneticValues);
        }
        p<Integer, Integer> worldAxisFromRotation = getWorldAxisFromRotation();
        int iIntValue = worldAxisFromRotation.f128594a.intValue();
        int iIntValue2 = worldAxisFromRotation.f128595b.intValue();
        float[] fArr3 = new float[9];
        SensorManager.remapCoordinateSystem(this.rotationMatrix, iIntValue, iIntValue2, fArr3);
        SensorManager.getOrientation(fArr3, this.orientation);
        p<Integer, Integer> pVarAdjustWorldAxis = adjustWorldAxis(this.orientation, iIntValue, iIntValue2);
        SensorManager.remapCoordinateSystem(this.rotationMatrix, pVarAdjustWorldAxis.f128594a.intValue(), pVarAdjustWorldAxis.f128595b.intValue(), fArr3);
        SensorManager.getOrientation(fArr3, this.orientation);
        notifyCompassChangeListeners((float) Math.toDegrees(this.orientation[0]));
        this.compassUpdateNextTimestamp = jElapsedRealtime + 500;
    }

    public final void addCalibrationListener(LocationCompassCalibrationListener compassCalibrationListener) {
        compassCalibrationListener.getClass();
        this.calibrationListeners.add(compassCalibrationListener);
    }

    public final void addCompassListener$plugin_locationcomponent_release(CompassListener compassListener) {
        compassListener.getClass();
        if (this.compassListeners.isEmpty()) {
            registerSensorListeners();
        }
        this.compassListeners.add(compassListener);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        if (accuracy == 0) {
            MapboxLogger.logW(TAG, "Compass sensor is unreliable, device calibration is needed.");
            Iterator<LocationCompassCalibrationListener> it = this.calibrationListeners.iterator();
            while (it.hasNext()) {
                it.next().onCompassCalibrationNeeded();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        event.getClass();
        int type = event.sensor.getType();
        if (type == 1) {
            float[] fArr = event.values;
            fArr.getClass();
            this.gravityValues = lowPassFilter(fArr, this.gravityValues);
        } else if (type == 2) {
            float[] fArr2 = event.values;
            fArr2.getClass();
            this.magneticValues = lowPassFilter(fArr2, this.magneticValues);
        } else if (type == 11) {
            this.rotationVectorValue = event.values;
        }
        updateOrientation();
    }

    public final void removeCalibrationListener(LocationCompassCalibrationListener compassCalibrationListener) {
        compassCalibrationListener.getClass();
        this.calibrationListeners.remove(compassCalibrationListener);
    }

    public final void removeCompassListener$plugin_locationcomponent_release(CompassListener compassListener) {
        compassListener.getClass();
        if (this.compassListeners.remove(compassListener) && this.compassListeners.isEmpty()) {
            unregisterSensorListeners();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine$Companion;", "", "()V", "ALPHA", "", "SENSOR_DELAY_MICROS", "", "TAG", "", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
