package com.garmin.android.connectiq;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.connectiq.s0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vt2.n;
import vt2.p;

/* JADX INFO: loaded from: classes9.dex */
public class IQGarminBindingService extends Service {
    private final s0.a mBinder = new AnonymousClass1();

    /* JADX INFO: renamed from: com.garmin.android.connectiq.IQGarminBindingService$1, reason: invalid class name */
    public class AnonymousClass1 extends s0.a {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$transferData$0(ConnectIQ.IQApplicationEventListener iQApplicationEventListener, IQDevice iQDevice, IQApp iQApp, List list) {
            iQApplicationEventListener.onMessageReceived(iQDevice, iQApp, list, ConnectIQ.IQMessageStatus.SUCCESS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$transferData$1(ConnectIQ.IQApplicationEventListener iQApplicationEventListener, IQDevice iQDevice, IQApp iQApp) {
            iQApplicationEventListener.onMessageReceived(iQDevice, iQApp, null, ConnectIQ.IQMessageStatus.FAILURE_INVALID_FORMAT);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.garmin.android.apps.connectmobile.connectiq.s0
        public String transferData(String str) {
            IQMessageReceiver messageReceiver = ConnectIQ.getInstance().getMessageReceiver();
            try {
                IQTrustedGarminPackageVerifier.INSTANCE.enforceTrustedPackage(IQGarminBindingService.this.getApplicationContext());
                Handler handler = new Handler(Looper.getMainLooper());
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("action");
                ConnectIQ.IQDeviceEventListener deviceListener = null;
                switch (string.hashCode()) {
                    case -714652129:
                        if (string.equals(ConnectIQ.SEND_MESSAGE_STATUS)) {
                            if (messageReceiver != null) {
                                String string2 = jSONObject.getString(ConnectIQ.EXTRA_APPLICATION_ID);
                                JSONObject jSONObject2 = jSONObject.getJSONObject(ConnectIQ.EXTRA_REMOTE_DEVICE);
                                int iOptInt = jSONObject.optInt(ConnectIQ.EXTRA_STATUS);
                                IQDevice iQDevice = new IQDevice(jSONObject2.getLong("deviceIdentifier"), jSONObject2.getString("friendlyName"));
                                IQDeviceListenerContainer deviceListenerContainer = messageReceiver.getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
                                ConnectIQ.IQSendMessageListener sendMessageListener = deviceListenerContainer != null ? deviceListenerContainer.getSendMessageListener(string2) : null;
                                if (sendMessageListener != null) {
                                    sendMessageListener.onMessageStatus(iQDevice, new IQApp(string2), iOptInt == 0 ? ConnectIQ.IQMessageStatus.SUCCESS : ConnectIQ.IQMessageStatus.FAILURE_DURING_TRANSFER);
                                }
                            }
                            return ConnectIQ.EXTRA_STATUS_SUCCESS;
                        }
                        return "Unknown action: ".concat(string);
                    case 123764816:
                        if (string.equals(ConnectIQ.INCOMING_MESSAGE)) {
                            final ConnectIQ.IQApplicationEventListener applicationEventListener = ConnectIQ.getInstance().getApplicationEventListener();
                            if (applicationEventListener != null) {
                                JSONObject jSONObject3 = jSONObject.getJSONObject(ConnectIQ.EXTRA_REMOTE_APPLICATION);
                                JSONObject jSONObject4 = jSONObject.getJSONObject(ConnectIQ.EXTRA_REMOTE_DEVICE);
                                final IQApp iQApp = new IQApp(jSONObject3.getString("applicationId"));
                                final IQDevice iQDevice2 = new IQDevice(jSONObject4.getLong("deviceIdentifier"), jSONObject4.getString("friendlyName"));
                                JSONArray jSONArray = new JSONArray(jSONObject.getString(ConnectIQ.EXTRA_PAYLOAD));
                                int length = jSONArray.length();
                                byte[] bArr = new byte[length];
                                for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                    bArr[i14] = (byte) jSONArray.getInt(i14);
                                }
                                if (length == 0) {
                                    applicationEventListener.onMessageReceived(iQDevice2, iQApp, null, ConnectIQ.IQMessageStatus.FAILURE_UNKNOWN);
                                }
                                try {
                                    vt2.a aVarA = p.a(bArr);
                                    final ArrayList arrayList = new ArrayList();
                                    Iterator<n<?>> it = aVarA.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(IQMessageHelper.INSTANCE.convertToJava(it.next()));
                                    }
                                    handler.post(new Runnable() { // from class: com.garmin.android.connectiq.a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            IQGarminBindingService.AnonymousClass1.lambda$transferData$0(applicationEventListener, iQDevice2, iQApp, arrayList);
                                        }
                                    });
                                    return ConnectIQ.EXTRA_STATUS_SUCCESS;
                                } catch (UnsupportedEncodingException unused) {
                                    handler.post(new Runnable() { // from class: com.garmin.android.connectiq.b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            IQGarminBindingService.AnonymousClass1.lambda$transferData$1(applicationEventListener, iQDevice2, iQApp);
                                        }
                                    });
                                }
                            }
                            return ConnectIQ.EXTRA_STATUS_SUCCESS;
                        }
                        return "Unknown action: ".concat(string);
                    case 1314382397:
                        if (string.equals(ConnectIQ.OPEN_APPLICATION)) {
                            if (messageReceiver != null) {
                                String string3 = jSONObject.getString(ConnectIQ.EXTRA_OPEN_APPLICATION_ID);
                                JSONObject jSONObject5 = jSONObject.getJSONObject(ConnectIQ.EXTRA_OPEN_APPLICATION_DEVICE);
                                IQDevice iQDevice3 = new IQDevice(jSONObject5.getLong("deviceIdentifier"), jSONObject5.getString("friendlyName"));
                                int iOptInt2 = jSONObject.optInt(ConnectIQ.EXTRA_OPEN_APPLICATION_RESULT_CODE, -1);
                                IQDeviceListenerContainer deviceListenerContainer2 = messageReceiver.getDeviceListenerContainer(iQDevice3.getDeviceIdentifier());
                                ConnectIQ.IQOpenApplicationListener openApplicationListener = deviceListenerContainer2 != null ? deviceListenerContainer2.getOpenApplicationListener(string3) : null;
                                if (openApplicationListener != null && iOptInt2 >= 0) {
                                    openApplicationListener.onOpenApplicationResponse(iQDevice3, new IQApp(string3), ConnectIQ.IQOpenApplicationStatus.fromInt(iOptInt2));
                                    return ConnectIQ.EXTRA_STATUS_SUCCESS;
                                }
                            }
                            return ConnectIQ.EXTRA_STATUS_SUCCESS;
                        }
                        return "Unknown action: ".concat(string);
                    case 1800512991:
                        if (string.equals(ConnectIQ.APPLICATION_INFO)) {
                            if (messageReceiver != null) {
                                String string4 = jSONObject.getString(ConnectIQ.EXTRA_APPLICATION_ID);
                                JSONObject jSONObject6 = jSONObject.getJSONObject(ConnectIQ.EXTRA_REMOTE_DEVICE);
                                IQDevice iQDevice4 = new IQDevice(jSONObject6.getLong("deviceIdentifier"), jSONObject6.getString("friendlyName"));
                                int iOptInt3 = jSONObject.optInt(ConnectIQ.EXTRA_APPLICATION_VERSION, 65535);
                                IQDeviceListenerContainer deviceListenerContainer3 = messageReceiver.getDeviceListenerContainer(iQDevice4.getDeviceIdentifier());
                                ConnectIQ.IQApplicationInfoListener applicationInfoListener = deviceListenerContainer3 != null ? deviceListenerContainer3.getApplicationInfoListener(string4) : null;
                                if (applicationInfoListener != null) {
                                    if (iOptInt3 < 0 || 65535 == iOptInt3) {
                                        applicationInfoListener.onApplicationNotInstalled(string4);
                                        return ConnectIQ.EXTRA_STATUS_SUCCESS;
                                    }
                                    applicationInfoListener.onApplicationInfoReceived(new IQApp(string4, iOptInt3));
                                    return ConnectIQ.EXTRA_STATUS_SUCCESS;
                                }
                            }
                            return ConnectIQ.EXTRA_STATUS_SUCCESS;
                        }
                        return "Unknown action: ".concat(string);
                    case 2109543865:
                        if (string.equals(ConnectIQ.DEVICE_STATUS)) {
                            if (messageReceiver != null) {
                                JSONObject jSONObject7 = jSONObject.getJSONObject(ConnectIQ.EXTRA_REMOTE_DEVICE);
                                IQDevice.IQDeviceStatus iQDeviceStatus = IQDevice.IQDeviceStatus.UNKNOWN;
                                int iOptInt4 = jSONObject.optInt(ConnectIQ.EXTRA_STATUS, iQDeviceStatus.ordinal());
                                IQDevice iQDevice5 = new IQDevice(jSONObject7.getLong("deviceIdentifier"), jSONObject7.getString("friendlyName"));
                                try {
                                    iQDeviceStatus = IQDevice.IQDeviceStatus.values()[iOptInt4];
                                    break;
                                } catch (IndexOutOfBoundsException unused2) {
                                }
                                IQDeviceListenerContainer deviceListenerContainer4 = messageReceiver.getDeviceListenerContainer(iQDevice5.getDeviceIdentifier());
                                if (deviceListenerContainer4 != null) {
                                    deviceListener = deviceListenerContainer4.getDeviceListener();
                                    if (iQDeviceStatus != IQDevice.IQDeviceStatus.CONNECTED) {
                                        deviceListenerContainer4.clearApplicationInfoListeners();
                                        deviceListenerContainer4.clearOpenApplicationListeners();
                                        deviceListenerContainer4.clearSendMessageListeners();
                                    }
                                }
                                if (deviceListener != null) {
                                    deviceListener.onDeviceStatusChanged(iQDevice5, iQDeviceStatus);
                                }
                            }
                            return ConnectIQ.EXTRA_STATUS_SUCCESS;
                        }
                        return "Unknown action: ".concat(string);
                    default:
                        return "Unknown action: ".concat(string);
                }
            } catch (SecurityException e4) {
                e4.getMessage();
                return "Security exception: " + e4.getMessage();
            } catch (JSONException e14) {
                e14.getMessage();
                return "Invalid JSON payload: " + e14.getMessage();
            } catch (Exception e15) {
                e15.getMessage();
                return "Unexpected error: " + e15.getMessage();
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
