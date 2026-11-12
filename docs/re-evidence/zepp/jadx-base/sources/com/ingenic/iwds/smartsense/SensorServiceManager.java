package com.ingenic.iwds.smartsense;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class SensorServiceManager extends ServiceManagerContext {
    public static final int SENSOR_DELAY_FASTEST = 0;
    public static final int SENSOR_DELAY_GAME = 1;
    public static final int SENSOR_DELAY_NORMAL = 3;
    public static final int SENSOR_DELAY_UI = 2;
    private HashMap<SensorEventListener, ArrayList<EventCallback>> m_listeners;
    private ISensorService m_service;

    public class EventCallback extends ISensorEventCallback.Stub {
        private static final int MSG_ON_ACCURACY = 87;
        private static final int MSG_ON_EVENT = 19;
        private SensorEventListener m_listener;
        public Sensor sensor;
        private Handler m_handler = new Handler() { // from class: com.ingenic.iwds.smartsense.SensorServiceManager.EventCallback.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 19) {
                    EventCallback.this.m_listener.onSensorChanged((SensorEvent) message.obj);
                } else if (i != 87) {
                    IwdsAssert.dieIf((Object) this, true, "Implement me.");
                } else {
                    EventCallback.this.m_listener.onAccuracyChanged((Sensor) message.obj, message.arg1);
                }
            }
        };
        public String uuid = UUID.randomUUID().toString();

        public EventCallback(SensorEventListener sensorEventListener, Sensor sensor) {
            this.m_listener = sensorEventListener;
            this.sensor = sensor;
        }

        @Override // com.ingenic.iwds.smartsense.ISensorEventCallback
        public void onAccuracyChanged(Sensor sensor, int i) throws RemoteException {
            Message.obtain(this.m_handler, 87, i, 0, sensor).sendToTarget();
        }

        @Override // com.ingenic.iwds.smartsense.ISensorEventCallback
        public void onSensorChanged(SensorEvent sensorEvent) throws RemoteException {
            Message.obtain(this.m_handler, 19, sensorEvent).sendToTarget();
        }
    }

    public SensorServiceManager(Context context) {
        super(context);
        this.m_listeners = new HashMap<>();
        this.m_serviceClientProxy = new ServiceManagerContext.ServiceClientProxy() { // from class: com.ingenic.iwds.smartsense.SensorServiceManager.1
            @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
            public IBinder getBinder() {
                return SensorServiceManager.this.m_service.asBinder();
            }

            @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
            public void onServiceConnected(IBinder iBinder) {
                SensorServiceManager.this.m_service = ISensorService.Stub.asInterface(iBinder);
            }

            @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
            public void onServiceDisconnected(boolean z) {
                SensorServiceManager.this.unregisterAllListeners();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterAllListeners() {
        Iterator<SensorEventListener> it2 = this.m_listeners.keySet().iterator();
        while (it2.hasNext()) {
            try {
                Iterator<EventCallback> it3 = this.m_listeners.get(it2.next()).iterator();
                while (it3.hasNext()) {
                    this.m_service.unregisterListener(it3.next().uuid);
                }
            } catch (RemoteException e) {
                IwdsLog.e(this, "Exception in unregisterListener: " + e.toString());
            }
        }
        this.m_listeners.clear();
    }

    public Sensor getDefaultSensor(int i) {
        try {
            return this.m_service.getDefaultSensor(i);
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in getDefaultSensor: " + e.toString());
            return null;
        }
    }

    public List<Sensor> getSensorList() {
        try {
            return this.m_service.getSensorList();
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in getSensorList: " + e.toString());
            return null;
        }
    }

    public boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        IwdsAssert.dieIf(this, sensorEventListener == null, "Listener is null.");
        IwdsAssert.dieIf(this, sensor == null, "Sensor is null.");
        ArrayList<EventCallback> arrayList = this.m_listeners.get(sensorEventListener);
        if (arrayList != null) {
            Iterator<EventCallback> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().sensor.getType() == sensor.getType()) {
                    return false;
                }
            }
        }
        EventCallback eventCallback = new EventCallback(sensorEventListener, sensor);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.m_listeners.put(sensorEventListener, arrayList);
        }
        arrayList.add(eventCallback);
        try {
            return this.m_service.registerListener(eventCallback.uuid, eventCallback, sensor, i);
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in registerListener: " + e.toString());
            return false;
        }
    }

    public void unregisterListener(SensorEventListener sensorEventListener, Sensor sensor) {
        IwdsAssert.dieIf(this, sensorEventListener == null, "Listener is null.");
        IwdsAssert.dieIf(this, sensor == null, "Sensor is null.");
        ArrayList<EventCallback> arrayList = this.m_listeners.get(sensorEventListener);
        if (arrayList == null) {
            return;
        }
        try {
            Iterator<EventCallback> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                EventCallback next = it2.next();
                if (next.sensor.getType() == sensor.getType()) {
                    this.m_service.unregisterListener(next.uuid);
                    it2.remove();
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                this.m_listeners.remove(sensorEventListener);
            }
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in unregisterListener: " + e.toString());
        }
    }
}
