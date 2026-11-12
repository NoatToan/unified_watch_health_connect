package com.ingenic.iwds.smartsense;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.common.api.ConnectFailedReason;
import com.ingenic.iwds.common.api.ServiceClient;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class SensorServiceProxy implements ServiceClient.ConnectionCallbacks, DataTransactor.DataTransactorCallback {
    private static SensorServiceProxy sInstance;
    private Context m_context;
    private ServiceProxytHandler m_handler;
    private SensorEventListener m_listener = new SensorEventListener() { // from class: com.ingenic.iwds.smartsense.SensorServiceProxy.1
        @Override // com.ingenic.iwds.smartsense.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            SensorServiceProxy.this.wakeLockAcquire();
            SensorServiceProxy.this.m_handler.notifySensorAccuracyChanged(sensor, i);
        }

        @Override // com.ingenic.iwds.smartsense.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            SensorServiceProxy.this.wakeLockAcquire();
            SensorServiceProxy.this.m_handler.notifySensorChanged(sensorEvent);
        }
    };
    private ServiceClient m_sensorServiceClient;
    private SensorServiceManager m_service;
    private DataTransactor m_transactor;
    private PowerManager.WakeLock m_wakeLock;

    public class ServiceProxytHandler extends Handler {
        private static final int MSG_CHANNEL_STATUS_CHANGED = 6;
        private static final int MSG_REQUEST_REGISTER_LISTENER = 1;
        private static final int MSG_REQUEST_SENSOR_LIST = 0;
        private static final int MSG_REQUEST_UNREGISTER_LISTENER = 2;
        private static final int MSG_SENSOR_ACCURACY_CHANGED = 5;
        private static final int MSG_SENSOR_CHANGED = 4;
        private static final int MSG_SENSOR_SERVICE_CONNECTED = 3;
        private boolean m_channelAvailable;
        private ArrayList<Sensor> m_sensorList;
        private boolean m_serviceConnected;

        private ServiceProxytHandler() {
            this.m_sensorList = new ArrayList<>();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            RemoteSensorResponse remoteSensorResponseObtain = RemoteSensorResponse.obtain(SensorServiceProxy.this.m_transactor);
            switch (message.what) {
                case 0:
                    if (!this.m_channelAvailable) {
                        IwdsLog.e(this, "Transfer channel unavailable");
                    } else {
                        remoteSensorResponseObtain.type = 0;
                        remoteSensorResponseObtain.sensorList = (ArrayList) SensorServiceProxy.this.m_service.getSensorList();
                        IwdsLog.i(this, "Get sensor list: " + remoteSensorResponseObtain.sensorList.toString());
                        remoteSensorResponseObtain.sendToRemote();
                    }
                    break;
                case 1:
                    int i = message.arg1;
                    Sensor sensor = (Sensor) message.obj;
                    IwdsLog.i(this, "Register sensor listener: " + sensor.toString());
                    if (SensorServiceProxy.this.m_service.registerListener(SensorServiceProxy.this.m_listener, sensor, i)) {
                        this.m_sensorList.add(sensor);
                    }
                    break;
                case 2:
                    Sensor sensor2 = (Sensor) message.obj;
                    IwdsLog.i(this, "Unregister sensor listener: " + sensor2.toString());
                    SensorServiceProxy.this.m_service.unregisterListener(SensorServiceProxy.this.m_listener, sensor2);
                    this.m_sensorList.remove(sensor2);
                    break;
                case 3:
                    int i2 = message.arg1;
                    this.m_serviceConnected = i2 == 1;
                    if (!this.m_channelAvailable) {
                        IwdsLog.e(this, "Transfer channel unavailable");
                    } else {
                        remoteSensorResponseObtain.type = 1;
                        remoteSensorResponseObtain.result = i2;
                        remoteSensorResponseObtain.sendToRemote();
                    }
                    break;
                case 4:
                    if (!this.m_serviceConnected) {
                        IwdsLog.i(this, "Notify sensor changed, but sensor service already disconnected.");
                        SensorServiceProxy.this.wakeLockRelease();
                    } else if (!this.m_channelAvailable) {
                        IwdsLog.e(this, "Transfer channel unavailable");
                        SensorServiceProxy.this.wakeLockRelease();
                    } else {
                        SensorEvent sensorEvent = (SensorEvent) message.obj;
                        remoteSensorResponseObtain.type = 2;
                        remoteSensorResponseObtain.sensorEvent = sensorEvent;
                        remoteSensorResponseObtain.sendToRemote();
                    }
                    break;
                case 5:
                    if (!this.m_serviceConnected) {
                        IwdsLog.i(this, "Notify sensor accuracy changed, but sensor service already disconnected.");
                        SensorServiceProxy.this.wakeLockRelease();
                    } else if (!this.m_channelAvailable) {
                        IwdsLog.e(this, "Transfer channel unavailable");
                        SensorServiceProxy.this.wakeLockRelease();
                    } else {
                        Sensor sensor3 = (Sensor) message.obj;
                        int i3 = message.arg1;
                        remoteSensorResponseObtain.type = 3;
                        remoteSensorResponseObtain.sensor = sensor3;
                        remoteSensorResponseObtain.accuracy = i3;
                        remoteSensorResponseObtain.sendToRemote();
                    }
                    break;
                case 6:
                    this.m_channelAvailable = message.arg1 == 1;
                    Iterator<Sensor> it2 = this.m_sensorList.iterator();
                    while (it2.hasNext()) {
                        SensorServiceProxy.this.m_service.unregisterListener(SensorServiceProxy.this.m_listener, it2.next());
                    }
                    break;
            }
        }

        public void handleRequest(RemoteSensorRequest remoteSensorRequest) {
            Message messageObtain = Message.obtain(this);
            int i = remoteSensorRequest.type;
            if (i == 0) {
                messageObtain.what = 0;
            } else if (i == 1) {
                messageObtain.what = 1;
                messageObtain.arg1 = remoteSensorRequest.sensorRate;
                messageObtain.obj = remoteSensorRequest.sensor;
            } else if (i != 2) {
                IwdsAssert.dieIf((Object) this, true, "Unsupported remote request");
                return;
            } else {
                messageObtain.what = 2;
                messageObtain.obj = remoteSensorRequest.sensor;
            }
            messageObtain.sendToTarget();
        }

        public void notifySensorAccuracyChanged(Sensor sensor, int i) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 5;
            messageObtain.arg1 = i;
            messageObtain.obj = sensor;
            messageObtain.sendToTarget();
        }

        public void notifySensorChanged(SensorEvent sensorEvent) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 4;
            messageObtain.obj = sensorEvent;
            messageObtain.sendToTarget();
        }

        public void notifySensorServiceConnected(boolean z) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 3;
            messageObtain.arg1 = z ? 1 : 0;
            messageObtain.sendToTarget();
        }

        public void setChannelState(boolean z) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 6;
            messageObtain.arg1 = z ? 1 : 0;
            messageObtain.sendToTarget();
        }
    }

    private SensorServiceProxy() {
    }

    public static SensorServiceProxy getInstance() {
        if (sInstance == null) {
            sInstance = new SensorServiceProxy();
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wakeLockAcquire() {
        if (this.m_wakeLock.isHeld()) {
            return;
        }
        this.m_wakeLock.acquire();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wakeLockRelease() {
        if (this.m_wakeLock.isHeld()) {
            this.m_wakeLock.release();
        }
    }

    public void initialize(Context context) {
        IwdsLog.d(this, "initialize");
        this.m_context = context;
        this.m_wakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, getClass().getName());
        this.m_transactor = new DataTransactor(this.m_context, this, "c1dc19e2-17a4-0797-0000-68a0dd4bfb68");
        this.m_sensorServiceClient = new ServiceClient(this.m_context, ServiceManagerContext.SERVICE_SENSOR, this);
        this.m_handler = new ServiceProxytHandler();
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onChannelAvailable(boolean z) {
        if (z) {
            this.m_handler.setChannelState(true);
            IwdsLog.i(this, "Try to connect sensor service");
            this.m_sensorServiceClient.connect();
        } else {
            this.m_handler.setChannelState(false);
            this.m_handler.notifySensorServiceConnected(false);
            IwdsLog.i(this, "Try to disconnect sensor service");
            this.m_sensorServiceClient.disconnect();
        }
    }

    @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
    public void onConnectFailed(ServiceClient serviceClient, ConnectFailedReason connectFailedReason) {
        IwdsAssert.dieIf((Object) this, true, "Failed to connect to sensor service: " + connectFailedReason.toString());
    }

    @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
    public void onConnected(ServiceClient serviceClient) {
        IwdsLog.i(this, "Sensor service connected");
        this.m_service = (SensorServiceManager) this.m_sensorServiceClient.getServiceManagerContext();
        this.m_handler.notifySensorServiceConnected(true);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onDataArrived(Object obj) {
        if (obj instanceof RemoteSensorRequest) {
            this.m_handler.handleRequest((RemoteSensorRequest) obj);
        }
    }

    @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
    public void onDisconnected(ServiceClient serviceClient, boolean z) {
        IwdsLog.i(this, "Sensor service disconnected");
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
        int i = ((RemoteSensorResponse) dataTransactResult.getTransferedObject()).type;
        if (i == 2 || i == 3) {
            wakeLockRelease();
        }
    }

    public void start() {
        IwdsLog.i(this, "start");
        this.m_transactor.start();
    }
}
