package com.ingenic.iwds.common.api;

import android.content.Context;
import android.os.IBinder;
import com.ingenic.iwds.utils.IwdsAssert;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ServiceManagerContext {
    public static final String ACTION_NOTIFICATION_CLICKED = "com.ingenic.iwds.notification.clicked";
    public static final String SERVICE_CLOUD = "service_cloud";
    public static final String SERVICE_CONNECTION = "service_connection";
    public static final String SERVICE_DEVICE_MANAGER = "service_device_manager";
    public static final String SERVICE_NOTIFICATION_PROXY = "service_notification_proxy";
    public static final String SERVICE_REMOTE_BROADCAST = "service_remote_broadcast";
    public static final String SERVICE_REMOTE_DEVICE = "service_remote_device";
    public static final String SERVICE_REMOTE_LOCATION = "service_remote_location";
    public static final String SERVICE_REMOTE_SEARCH = "service_remote_search";
    public static final String SERVICE_REMOTE_SENSOR = "service_remote_sensor";
    public static final String SERVICE_REMOTE_SPEECH = "service_remote_speech";
    public static final String SERVICE_REMOTE_WAKELOCK = "service_remote_wakelock";
    public static final String SERVICE_SENSOR = "service_sensor";
    public static final String SERVICE_SLPT_WATCH_FACE = "service_slpt_watchface";
    public static final String SERVICE_VIBRATE = "service_vibrate";
    private Context mContext;
    public ServiceClientProxy m_serviceClientProxy;

    public static abstract class ServiceClientProxy {
        public abstract IBinder getBinder();

        public abstract void onServiceConnected(IBinder iBinder);

        public abstract void onServiceDisconnected(boolean z);
    }

    public ServiceManagerContext(Context context) {
        IwdsAssert.dieIf(this, context == null, "Context can not be null.");
        this.mContext = context;
    }

    public IBinder getBinder() {
        return this.m_serviceClientProxy.getBinder();
    }

    public Context getContext() {
        return this.mContext;
    }

    public void onServiceConnected(IBinder iBinder) {
        this.m_serviceClientProxy.onServiceConnected(iBinder);
    }

    public void onServiceDisconnected(boolean z) {
        this.m_serviceClientProxy.onServiceDisconnected(z);
    }
}
