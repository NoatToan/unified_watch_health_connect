package com.garmin.android.connectiq;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import vt2.n;
import vt2.p;

/* JADX INFO: loaded from: classes9.dex */
class IQMessageReceiver extends BroadcastReceiver {
    private final HashMap<Long, IQDeviceListenerContainer> mDeviceListenerContainers = new HashMap<>();

    public void addDeviceListenerContainer(long j8, IQDeviceListenerContainer iQDeviceListenerContainer) {
        this.mDeviceListenerContainers.put(Long.valueOf(j8), iQDeviceListenerContainer);
    }

    public void clearApiCallbackListeners() {
        for (IQDeviceListenerContainer iQDeviceListenerContainer : this.mDeviceListenerContainers.values()) {
            iQDeviceListenerContainer.clearApplicationInfoListeners();
            iQDeviceListenerContainer.clearOpenApplicationListeners();
            iQDeviceListenerContainer.clearSendMessageListeners();
        }
    }

    public void clearAppListeners() {
        Iterator<IQDeviceListenerContainer> it = this.mDeviceListenerContainers.values().iterator();
        while (it.hasNext()) {
            it.next().clearAppListeners();
        }
    }

    public void clearDeviceAndAppListeners() {
        for (IQDeviceListenerContainer iQDeviceListenerContainer : this.mDeviceListenerContainers.values()) {
            iQDeviceListenerContainer.clearDeviceListener();
            iQDeviceListenerContainer.clearAppListeners();
        }
    }

    public IQDeviceListenerContainer getDeviceListenerContainer(long j8) {
        return this.mDeviceListenerContainers.get(Long.valueOf(j8));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IQDevice iQDevice = intent.getAction().equals(ConnectIQ.OPEN_APPLICATION) ? (IQDevice) intent.getParcelableExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_DEVICE) : (IQDevice) intent.getParcelableExtra(ConnectIQ.EXTRA_REMOTE_DEVICE);
        if (iQDevice == null) {
            return;
        }
        IQDeviceListenerContainer iQDeviceListenerContainer = this.mDeviceListenerContainers.get(Long.valueOf(iQDevice.getDeviceIdentifier()));
        ConnectIQ.IQDeviceEventListener deviceListener = null;
        applicationInfoListener = null;
        ConnectIQ.IQApplicationInfoListener applicationInfoListener = null;
        openApplicationListener = null;
        ConnectIQ.IQOpenApplicationListener openApplicationListener = null;
        if (intent.getAction().equals(ConnectIQ.INCOMING_MESSAGE)) {
            IQApp iQApp = (IQApp) intent.getParcelableExtra(ConnectIQ.EXTRA_REMOTE_APPLICATION);
            byte[] byteArrayExtra = intent.getByteArrayExtra(ConnectIQ.EXTRA_PAYLOAD);
            ConnectIQ.IQApplicationEventListener appListener = iQDeviceListenerContainer != null ? iQDeviceListenerContainer.getAppListener(iQApp.getApplicationId()) : null;
            if (byteArrayExtra == null && appListener != null) {
                appListener.onMessageReceived(iQDevice, iQApp, null, ConnectIQ.IQMessageStatus.FAILURE_UNKNOWN);
            }
            try {
                vt2.a aVarA = p.a(byteArrayExtra);
                ArrayList arrayList = new ArrayList();
                Iterator<n<?>> it = aVarA.iterator();
                while (it.hasNext()) {
                    arrayList.add(IQMessageHelper.INSTANCE.convertToJava(it.next()));
                }
                if (appListener != null) {
                    appListener.onMessageReceived(iQDevice, iQApp, arrayList, ConnectIQ.IQMessageStatus.SUCCESS);
                    return;
                }
                return;
            } catch (UnsupportedEncodingException | BufferUnderflowException unused) {
                if (appListener != null) {
                    appListener.onMessageReceived(iQDevice, iQApp, null, ConnectIQ.IQMessageStatus.FAILURE_INVALID_FORMAT);
                    return;
                }
                return;
            }
        }
        if (intent.getAction().equals(ConnectIQ.DEVICE_STATUS)) {
            IQDevice.IQDeviceStatus iQDeviceStatus = IQDevice.IQDeviceStatus.UNKNOWN;
            try {
                iQDeviceStatus = IQDevice.IQDeviceStatus.values()[intent.getIntExtra(ConnectIQ.EXTRA_STATUS, iQDeviceStatus.ordinal())];
            } catch (IndexOutOfBoundsException unused2) {
            }
            if (iQDeviceListenerContainer != null) {
                deviceListener = iQDeviceListenerContainer.getDeviceListener();
                if (iQDeviceStatus != IQDevice.IQDeviceStatus.CONNECTED) {
                    iQDeviceListenerContainer.clearApplicationInfoListeners();
                    iQDeviceListenerContainer.clearOpenApplicationListeners();
                    iQDeviceListenerContainer.clearSendMessageListeners();
                }
            }
            if (deviceListener != null) {
                deviceListener.onDeviceStatusChanged(iQDevice, iQDeviceStatus);
                return;
            }
            return;
        }
        if (intent.getAction().equals(ConnectIQ.APPLICATION_INFO)) {
            String stringExtra = intent.getStringExtra(ConnectIQ.EXTRA_APPLICATION_ID);
            int intExtra = intent.getIntExtra(ConnectIQ.EXTRA_APPLICATION_VERSION, 65535);
            if (iQDeviceListenerContainer != null && stringExtra != null) {
                applicationInfoListener = iQDeviceListenerContainer.getApplicationInfoListener(stringExtra);
            }
            if (applicationInfoListener != null) {
                if (intExtra < 0 || 65535 == intExtra) {
                    applicationInfoListener.onApplicationNotInstalled(stringExtra);
                    return;
                } else {
                    applicationInfoListener.onApplicationInfoReceived(new IQApp(stringExtra, intExtra));
                    return;
                }
            }
            return;
        }
        if (!intent.getAction().equals(ConnectIQ.OPEN_APPLICATION)) {
            if (intent.getAction().equals(ConnectIQ.SEND_MESSAGE_STATUS)) {
                int intExtra2 = intent.getIntExtra(ConnectIQ.EXTRA_STATUS, 0);
                String stringExtra2 = intent.getStringExtra(ConnectIQ.EXTRA_APPLICATION_ID);
                ConnectIQ.IQSendMessageListener sendMessageListener = iQDeviceListenerContainer != null ? iQDeviceListenerContainer.getSendMessageListener(stringExtra2) : null;
                if (sendMessageListener != null) {
                    sendMessageListener.onMessageStatus(iQDevice, new IQApp(stringExtra2), intExtra2 == 0 ? ConnectIQ.IQMessageStatus.SUCCESS : ConnectIQ.IQMessageStatus.FAILURE_DURING_TRANSFER);
                    return;
                }
                return;
            }
            return;
        }
        String stringExtra3 = intent.getStringExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_ID);
        int intExtra3 = intent.getIntExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_RESULT_CODE, -1);
        if (iQDeviceListenerContainer != null && stringExtra3 != null) {
            openApplicationListener = iQDeviceListenerContainer.getOpenApplicationListener(stringExtra3);
        }
        if (openApplicationListener == null || intExtra3 < 0) {
            return;
        }
        openApplicationListener.onOpenApplicationResponse(iQDevice, new IQApp(stringExtra3), ConnectIQ.IQOpenApplicationStatus.fromInt(intExtra3));
    }
}
