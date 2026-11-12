package com.ingenic.iwds.smartsense;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteSensorService extends Service implements DataTransactor.DataTransactorCallback {
    private ServiceHandler m_handler;
    private RemoteSensorServiceStub m_service = new RemoteSensorServiceStub();
    private DataTransactor m_transactor;

    public class RemoteSensorServiceStub extends IRemoteSensorService.Stub {
        private ArrayList<Sensor> m_sensorList;
        private Object m_sensorListLock = new Object();
        private RemoteSensorCallback m_remoteSensorCallback = new RemoteSensorCallback();
        private ArrayList<RemoteSensorEventCallback> m_callbacks = new ArrayList<>();

        public class RemoteSensorCallback implements IBinder.DeathRecipient {
            private HashMap<String, IRemoteSensorCallback> m_listeners = new HashMap<>();

            public RemoteSensorCallback() {
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
                }
            }

            public void onSensorAvailable(ArrayList<Sensor> arrayList) {
                synchronized (this.m_listeners) {
                    Iterator<IRemoteSensorCallback> it2 = this.m_listeners.values().iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().onSensorAvailable(arrayList);
                        } catch (RemoteException e) {
                            IwdsLog.e(this, "Exception in onSensorAvailable: " + e.toString());
                        }
                    }
                }
            }

            public boolean registerRemoteSensorListener(String str, IRemoteSensorCallback iRemoteSensorCallback) {
                synchronized (this.m_listeners) {
                    try {
                        try {
                            iRemoteSensorCallback.asBinder().linkToDeath(this, 0);
                            this.m_listeners.put(str, iRemoteSensorCallback);
                        } catch (RemoteException e) {
                            IwdsLog.e(this, "Exception in registerRemoteSensorListener: " + e.toString());
                            return false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }

            public void unregisterRemoteSensorListener(String str) {
                synchronized (this.m_listeners) {
                    IRemoteSensorCallback iRemoteSensorCallbackRemove = this.m_listeners.remove(str);
                    if (iRemoteSensorCallbackRemove == null) {
                        return;
                    }
                    iRemoteSensorCallbackRemove.asBinder().unlinkToDeath(this, 0);
                }
            }
        }

        public class RemoteSensorEventCallback implements IBinder.DeathRecipient {
            private HashMap<String, IRemoteSensorEventCallback> m_listeners = new HashMap<>();
            public Sensor sensor;

            public RemoteSensorEventCallback(Sensor sensor) {
                this.sensor = sensor;
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
                        RemoteSensorService.this.m_handler.requestUnregisterListener(this.sensor);
                    }
                }
            }

            public void onAccuracyChanged(Sensor sensor, int i) {
                synchronized (this.m_listeners) {
                    Iterator<IRemoteSensorEventCallback> it2 = this.m_listeners.values().iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().onAccuracyChanged(sensor, i);
                        } catch (RemoteException e) {
                            IwdsLog.e(this, "Exception in onAccuracyChanged: " + e.toString());
                        }
                    }
                }
            }

            public void onSensorEvent(SensorEvent sensorEvent) {
                synchronized (this.m_listeners) {
                    Iterator<IRemoteSensorEventCallback> it2 = this.m_listeners.values().iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().onSensorChanged(sensorEvent);
                        } catch (RemoteException e) {
                            IwdsLog.e(this, "Exception in onSensorEvent: " + e.toString());
                        }
                    }
                }
            }

            public boolean registerListener(String str, IRemoteSensorEventCallback iRemoteSensorEventCallback, int i) {
                synchronized (this.m_listeners) {
                    try {
                        try {
                            iRemoteSensorEventCallback.asBinder().linkToDeath(this, 0);
                            this.m_listeners.put(str, iRemoteSensorEventCallback);
                            if (this.m_listeners.size() == 1) {
                                RemoteSensorService.this.m_handler.requestRegisterListener(this.sensor, i);
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
                    IRemoteSensorEventCallback iRemoteSensorEventCallbackRemove = this.m_listeners.remove(str);
                    if (iRemoteSensorEventCallbackRemove == null) {
                        return;
                    }
                    iRemoteSensorEventCallbackRemove.asBinder().unlinkToDeath(this, 0);
                    if (this.m_listeners.size() != 0) {
                        return;
                    }
                    RemoteSensorService.this.m_handler.requestUnregisterListener(this.sensor);
                }
            }
        }

        public RemoteSensorServiceStub() {
        }

        @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
        public Sensor getDefaultSensor(int i) throws RemoteException {
            synchronized (this.m_sensorListLock) {
                ArrayList<Sensor> arrayList = this.m_sensorList;
                if (arrayList == null) {
                    return null;
                }
                for (Sensor sensor : arrayList) {
                    if (sensor.getType() == i) {
                        return sensor;
                    }
                }
                return null;
            }
        }

        @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
        public List<Sensor> getSensorList() throws RemoteException {
            ArrayList<Sensor> arrayList;
            synchronized (this.m_sensorListLock) {
                arrayList = this.m_sensorList;
            }
            return arrayList;
        }

        public void onRemoteSensorAccuracyChanged(Sensor sensor, int i) {
            synchronized (this.m_callbacks) {
                for (RemoteSensorEventCallback remoteSensorEventCallback : this.m_callbacks) {
                    if (remoteSensorEventCallback.sensor.getType() == sensor.getType()) {
                        remoteSensorEventCallback.onAccuracyChanged(sensor, i);
                    }
                }
            }
        }

        public void onRemoteSensorEvent(SensorEvent sensorEvent) {
            synchronized (this.m_callbacks) {
                for (RemoteSensorEventCallback remoteSensorEventCallback : this.m_callbacks) {
                    if (remoteSensorEventCallback.sensor.getType() == sensorEvent.sensorType) {
                        remoteSensorEventCallback.onSensorEvent(sensorEvent);
                    }
                }
            }
        }

        public void onSensorAvailable(ArrayList<Sensor> arrayList) {
            synchronized (this.m_sensorListLock) {
                if (this.m_sensorList == null && arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        this.m_callbacks.add(new RemoteSensorEventCallback(arrayList.get(i)));
                    }
                } else if (arrayList == null && !this.m_callbacks.isEmpty()) {
                    this.m_callbacks.clear();
                }
                this.m_sensorList = arrayList;
                this.m_remoteSensorCallback.onSensorAvailable(arrayList);
            }
        }

        @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
        public boolean registerListener(String str, IRemoteSensorEventCallback iRemoteSensorEventCallback, Sensor sensor, int i) throws RemoteException {
            synchronized (this.m_callbacks) {
                for (RemoteSensorEventCallback remoteSensorEventCallback : this.m_callbacks) {
                    if (remoteSensorEventCallback.sensor.getType() == sensor.getType()) {
                        remoteSensorEventCallback.registerListener(str, iRemoteSensorEventCallback, i);
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
        public boolean registerRemoteSensorListener(String str, IRemoteSensorCallback iRemoteSensorCallback) throws RemoteException {
            boolean zRegisterRemoteSensorListener;
            synchronized (this.m_remoteSensorCallback) {
                zRegisterRemoteSensorListener = this.m_remoteSensorCallback.registerRemoteSensorListener(str, iRemoteSensorCallback);
            }
            RemoteSensorService.this.m_handler.requestSensorList();
            return zRegisterRemoteSensorListener;
        }

        @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
        public void unregisterListener(String str) throws RemoteException {
            synchronized (this.m_callbacks) {
                Iterator<RemoteSensorEventCallback> it2 = this.m_callbacks.iterator();
                while (it2.hasNext()) {
                    it2.next().unregisterListener(str);
                }
            }
        }

        @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
        public void unregisterRemoteSensorListener(String str) throws RemoteException {
            synchronized (this.m_remoteSensorCallback) {
                this.m_remoteSensorCallback.unregisterRemoteSensorListener(str);
            }
        }
    }

    public class ServiceHandler extends Handler {
        private static final int MSG_REQUEST_REGISTER_LISTENER = 5;
        private static final int MSG_REQUEST_SENSOR_LIST = 4;
        private static final int MSG_REQUEST_UNREGISTER_LISTENER = 6;
        private static final int MSG_RESPONSE_SENSOR_ACCURACY_CHANGED = 3;
        private static final int MSG_RESPONSE_SENSOR_CHANGED = 2;
        private static final int MSG_RESPONSE_SENSOR_LIST = 0;
        private static final int MSG_RESPONSE_SENSOR_SERVICE_CONNECTED = 1;
        private boolean m_isRequestingSensorList;
        private boolean m_remoteServiceConnected;

        private ServiceHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            RemoteSensorRequest remoteSensorRequestObtain = RemoteSensorRequest.obtain(RemoteSensorService.this.m_transactor);
            switch (message.what) {
                case 0:
                    this.m_isRequestingSensorList = false;
                    RemoteSensorService.this.m_service.onSensorAvailable((ArrayList) message.obj);
                    break;
                case 1:
                    if (!(message.arg1 == 1)) {
                        IwdsLog.i(this, "Sensor service on remote device disconnected");
                        this.m_remoteServiceConnected = false;
                    } else {
                        IwdsLog.i(this, "Sensor service on remote device connected");
                        this.m_remoteServiceConnected = true;
                        requestSensorList();
                    }
                    break;
                case 2:
                    RemoteSensorService.this.m_service.onRemoteSensorEvent((SensorEvent) message.obj);
                    break;
                case 3:
                    RemoteSensorService.this.m_service.onRemoteSensorAccuracyChanged((Sensor) message.obj, message.arg1);
                    break;
                case 4:
                    boolean z = this.m_remoteServiceConnected;
                    if (!z) {
                        IwdsLog.w(this, "Sensor service on remote device not connected yet");
                        setSensorList(null);
                    } else if (z && this.m_isRequestingSensorList) {
                        IwdsLog.w(this, "Already requesting remote sensor list, waiting...");
                    } else {
                        this.m_isRequestingSensorList = true;
                        IwdsLog.i(this, "Try to request remote device sensor list");
                        remoteSensorRequestObtain.type = 0;
                        remoteSensorRequestObtain.sendToRemote();
                    }
                    break;
                case 5:
                    int i = message.arg1;
                    Sensor sensor = (Sensor) message.obj;
                    IwdsLog.i(this, "Try to request register remote senor listener: " + sensor.toString());
                    remoteSensorRequestObtain.type = 1;
                    remoteSensorRequestObtain.sensor = sensor;
                    remoteSensorRequestObtain.sensorRate = i;
                    remoteSensorRequestObtain.sendToRemote();
                    break;
                case 6:
                    Sensor sensor2 = (Sensor) message.obj;
                    IwdsLog.i(this, "Try to request unregister remote senor listener: " + sensor2.toString());
                    remoteSensorRequestObtain.type = 2;
                    remoteSensorRequestObtain.sensor = sensor2;
                    remoteSensorRequestObtain.sendToRemote();
                    break;
            }
        }

        public void handleResponse(RemoteSensorResponse remoteSensorResponse) {
            Message messageObtain = Message.obtain(this);
            int i = remoteSensorResponse.type;
            if (i == 0) {
                messageObtain.what = 0;
                messageObtain.obj = remoteSensorResponse.sensorList;
            } else if (i == 1) {
                messageObtain.what = 1;
                messageObtain.arg1 = remoteSensorResponse.result;
            } else if (i == 2) {
                messageObtain.what = 2;
                messageObtain.obj = remoteSensorResponse.sensorEvent;
            } else if (i != 3) {
                IwdsAssert.dieIf((Object) this, true, "Unsupported remote response");
                return;
            } else {
                messageObtain.what = 3;
                messageObtain.arg1 = remoteSensorResponse.accuracy;
                messageObtain.obj = remoteSensorResponse.sensor;
            }
            messageObtain.sendToTarget();
        }

        public void requestRegisterListener(Sensor sensor, int i) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 5;
            messageObtain.arg1 = i;
            messageObtain.obj = sensor;
            messageObtain.sendToTarget();
        }

        public void requestSensorList() {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 4;
            messageObtain.sendToTarget();
        }

        public void requestUnregisterListener(Sensor sensor) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 6;
            messageObtain.obj = sensor;
            messageObtain.sendToTarget();
        }

        public void setRemoteServiceState(boolean z) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 1;
            messageObtain.arg1 = !z ? 0 : 1;
            messageObtain.sendToTarget();
        }

        public void setSensorList(ArrayList<Sensor> arrayList) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 0;
            messageObtain.obj = arrayList;
            messageObtain.sendToTarget();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IwdsLog.d(this, "onBind");
        this.m_transactor.start();
        return this.m_service;
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onChannelAvailable(boolean z) {
        if (z || this.m_service == null) {
            return;
        }
        this.m_handler.setSensorList(null);
        this.m_handler.setRemoteServiceState(false);
    }

    @Override // android.app.Service
    public void onCreate() {
        IwdsLog.d(this, "onCreate");
        super.onCreate();
        this.m_transactor = new DataTransactor(this, this, "c1dc19e2-17a4-0797-0000-68a0dd4bfb68");
        this.m_handler = new ServiceHandler();
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onDataArrived(Object obj) {
        if (obj instanceof RemoteSensorResponse) {
            this.m_handler.handleResponse((RemoteSensorResponse) obj);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IwdsLog.d(this, "onDestroy");
        super.onDestroy();
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onRecvFileProgress(int i) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendFileProgress(int i) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IwdsLog.d(this, "onUnbind");
        this.m_transactor.stop();
        return super.onUnbind(intent);
    }
}
