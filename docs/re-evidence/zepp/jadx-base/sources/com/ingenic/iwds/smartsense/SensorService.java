package com.ingenic.iwds.smartsense;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.ingenic.iwds.utils.IwdsLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class SensorService extends Service {
    private SensorServiceStub m_service = new SensorServiceStub();

    public static class SensorServiceStub extends ISensorService.Stub {
        private ArrayList<SensorEventCallback> m_callbacks = new ArrayList<>();
        private ArrayList<Sensor> m_sensorList = new ArrayList<>();

        public class SensorEventCallback implements IBinder.DeathRecipient {
            private HashMap<String, ISensorEventCallback> m_listeners = new HashMap<>();
            public Sensor sensor;

            public SensorEventCallback(Sensor sensor) {
                this.sensor = sensor;
            }

            private void onSensorEvent(SensorEvent sensorEvent) {
                synchronized (this.m_listeners) {
                    for (ISensorEventCallback iSensorEventCallback : this.m_listeners.values()) {
                        try {
                            if (sensorEvent.sensorType == 21) {
                                int i = (int) sensorEvent.values[1];
                                sensorEvent.accuracy = i;
                                if (i > 0) {
                                    iSensorEventCallback.onAccuracyChanged(this.sensor, i);
                                }
                            }
                            iSensorEventCallback.onSensorChanged(sensorEvent);
                        } catch (RemoteException e) {
                            IwdsLog.e(this, "Exception in onSensorEvent: " + e.toString());
                        }
                    }
                }
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                synchronized (this.m_listeners) {
                    Iterator<String> it2 = this.m_listeners.keySet().iterator();
                    while (it2.hasNext()) {
                        if (!this.m_listeners.get(it2.next()).asBinder().isBinderAlive()) {
                            it2.remove();
                        }
                    }
                    if (this.m_listeners.size() == 0) {
                        SensorServiceStub.setActive(this.sensor.getType(), false);
                    }
                }
            }

            public boolean registerListener(String str, ISensorEventCallback iSensorEventCallback) {
                synchronized (this.m_listeners) {
                    try {
                        try {
                            iSensorEventCallback.asBinder().linkToDeath(this, 0);
                            this.m_listeners.put(str, iSensorEventCallback);
                            if (this.m_listeners.size() == 1) {
                                SensorServiceStub.setActive(this.sensor.getType(), true);
                            }
                        } catch (RemoteException e) {
                            IwdsLog.e(this, "Exception in registerListener: " + e.toString());
                            return false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }

            public void unregisterListener(String str) {
                synchronized (this.m_listeners) {
                    ISensorEventCallback iSensorEventCallbackRemove = this.m_listeners.remove(str);
                    if (iSensorEventCallbackRemove == null) {
                        return;
                    }
                    iSensorEventCallbackRemove.asBinder().unlinkToDeath(this, 0);
                    if (this.m_listeners.size() != 0) {
                        return;
                    }
                    SensorServiceStub.setActive(this.sensor.getType(), false);
                }
            }
        }

        public SensorServiceStub() {
            int sensorCount = getSensorCount();
            for (int i = 0; i < sensorCount; i++) {
                Sensor sensor = new Sensor();
                forEachSensor(sensor, i);
                SensorEventCallback sensorEventCallback = new SensorEventCallback(sensor);
                installSensorEventCallback(sensorEventCallback.sensor.getType(), sensorEventCallback);
                this.m_callbacks.add(sensorEventCallback);
                this.m_sensorList.add(sensor);
            }
        }

        private static final native void forEachSensor(Sensor sensor, int i);

        private static final native int getSensorCount();

        private static final native void installSensorEventCallback(int i, SensorEventCallback sensorEventCallback);

        private static final native boolean isActive(int i);

        /* JADX INFO: Access modifiers changed from: private */
        public static final native boolean setActive(int i, boolean z);

        /* JADX INFO: Access modifiers changed from: private */
        public static final native boolean setWearOnRightHand(boolean z);

        @Override // com.ingenic.iwds.smartsense.ISensorService
        public Sensor getDefaultSensor(int i) throws RemoteException {
            synchronized (this.m_callbacks) {
                for (SensorEventCallback sensorEventCallback : this.m_callbacks) {
                    if (sensorEventCallback.sensor.getType() == i) {
                        return sensorEventCallback.sensor;
                    }
                }
                return null;
            }
        }

        @Override // com.ingenic.iwds.smartsense.ISensorService
        public boolean registerListener(String str, ISensorEventCallback iSensorEventCallback, Sensor sensor, int i) throws RemoteException {
            synchronized (this.m_callbacks) {
                for (SensorEventCallback sensorEventCallback : this.m_callbacks) {
                    if (sensorEventCallback.sensor.getType() == sensor.getType()) {
                        sensorEventCallback.registerListener(str, iSensorEventCallback);
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // com.ingenic.iwds.smartsense.ISensorService
        public void unregisterListener(String str) throws RemoteException {
            synchronized (this.m_callbacks) {
                Iterator<SensorEventCallback> it2 = this.m_callbacks.iterator();
                while (it2.hasNext()) {
                    it2.next().unregisterListener(str);
                }
            }
        }

        @Override // com.ingenic.iwds.smartsense.ISensorService
        public ArrayList<Sensor> getSensorList() throws RemoteException {
            return this.m_sensorList;
        }
    }

    public static boolean setWearOnRightHand(boolean z) {
        return SensorServiceStub.setWearOnRightHand(z);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IwdsLog.d(this, "onBind()");
        return this.m_service;
    }
}
