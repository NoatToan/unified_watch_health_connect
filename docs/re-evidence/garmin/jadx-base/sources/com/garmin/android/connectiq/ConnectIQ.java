package com.garmin.android.connectiq;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.garmin.android.connectiq.adb.AdbConnection;
import com.garmin.android.connectiq.exception.InvalidStateException;
import com.garmin.android.connectiq.exception.ServiceUnavailableException;
import java.util.List;
import vb.h;
import vt2.p;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ConnectIQ {
    public static final String APPLICATION_INFO = "com.garmin.android.connectiq.APPLICATION_INFO";
    protected static final String COMPANION_APP_BINDER_SERVICE_ACTION = "com.garmin.android.connectiq.GARMIN_BINDING_SERVICE_ACTION";
    public static final String DEVICE_STATUS = "com.garmin.android.connectiq.DEVICE_STATUS";
    public static final String EXTRA_APPLICATION_ID = "com.garmin.android.connectiq.EXTRA_APPLICATION_ID";
    public static final String EXTRA_APPLICATION_VERSION = "com.garmin.android.connectiq.EXTRA_APPLICATION_VERSION";
    public static final String EXTRA_OPEN_APPLICATION_DEVICE = "com.garmin.android.connectiq.EXTRA_OPEN_APPLICATION_DEVICE";
    public static final String EXTRA_OPEN_APPLICATION_ID = "com.garmin.android.connectiq.EXTRA_OPEN_APPLICATION_ID";
    public static final String EXTRA_OPEN_APPLICATION_RESULT_CODE = "com.garmin.android.connectiq.EXTRA_OPEN_APPLICATION_RESULT_CODE";
    public static final String EXTRA_PAYLOAD = "com.garmin.android.connectiq.EXTRA_PAYLOAD";
    public static final String EXTRA_REMOTE_APPLICATION = "com.garmin.android.connectiq.EXTRA_REMOTE_APPLICATION";
    public static final String EXTRA_REMOTE_DEVICE = "com.garmin.android.connectiq.EXTRA_REMOTE_DEVICE";
    public static final String EXTRA_STATUS = "com.garmin.android.connectiq.EXTRA_STATUS";
    public static final String EXTRA_STATUS_SUCCESS = "com.garmin.android.connectiq.EXTRA_STATUS_SUCCESS";
    protected static final String GCM_CONNECTIQ_SERVICE_ACTION = "com.garmin.android.apps.connectmobile.CONNECTIQ_SERVICE_ACTION";
    protected static final String GCM_CONNECTIQ_SERVICE_CLASS = "com.garmin.android.apps.connectmobile.connectiq.ConnectIQService";
    protected static final String GCM_PACKAGE_NAME = "com.garmin.android.apps.connectmobile";
    public static final String INCOMING_MESSAGE = "com.garmin.android.connectiq.INCOMING_MESSAGE";
    protected static final int MIN_GCM_VERSION = 10347;
    public static final String OPEN_APPLICATION = "com.garmin.android.connectiq.OPEN_APPLICATION";
    public static final String SEND_MESSAGE_STATUS = "com.garmin.android.connectiq.SEND_MESSAGE_STATUS";
    protected static IQConnectType sConnectType = IQConnectType.WIRELESS;
    protected static ConnectIQ sInstance;
    protected Context mContext;
    private Handler mHandler;
    protected ConnectIQListener mListener;
    private IQMessageReceiver mMessageReceiver;
    protected boolean mInitialized = false;
    private boolean mUsingBinderService = false;
    private IQApplicationEventListener mBindingServiceApplicationEventListener = null;

    /* JADX INFO: renamed from: com.garmin.android.connectiq.ConnectIQ$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$connectiq$ConnectIQ$IQConnectType;

        static {
            int[] iArr = new int[IQConnectType.values().length];
            $SwitchMap$com$garmin$android$connectiq$ConnectIQ$IQConnectType = iArr;
            try {
                iArr[IQConnectType.TETHERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$connectiq$ConnectIQ$IQConnectType[IQConnectType.WIRELESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface ConnectIQListener {
        void onInitializeError(IQSdkErrorStatus iQSdkErrorStatus);

        void onSdkReady();

        void onSdkShutDown();
    }

    public interface IQApplicationEventListener {
        void onMessageReceived(IQDevice iQDevice, IQApp iQApp, List<Object> list, IQMessageStatus iQMessageStatus);
    }

    public interface IQApplicationInfoListener {
        void onApplicationInfoReceived(IQApp iQApp);

        void onApplicationNotInstalled(String str);
    }

    public enum IQConnectType {
        TETHERED,
        WIRELESS
    }

    public interface IQDeviceEventListener {
        void onDeviceStatusChanged(IQDevice iQDevice, IQDevice.IQDeviceStatus iQDeviceStatus);
    }

    public enum IQMessageStatus {
        SUCCESS,
        FAILURE_UNKNOWN,
        FAILURE_INVALID_FORMAT,
        FAILURE_MESSAGE_TOO_LARGE,
        FAILURE_UNSUPPORTED_TYPE,
        FAILURE_DURING_TRANSFER,
        FAILURE_INVALID_DEVICE,
        FAILURE_DEVICE_NOT_CONNECTED
    }

    public interface IQOpenApplicationListener {
        void onOpenApplicationResponse(IQDevice iQDevice, IQApp iQApp, IQOpenApplicationStatus iQOpenApplicationStatus);
    }

    public enum IQOpenApplicationStatus {
        PROMPT_SHOWN_ON_DEVICE,
        PROMPT_NOT_SHOWN_ON_DEVICE,
        APP_IS_NOT_INSTALLED,
        APP_IS_ALREADY_RUNNING,
        UNKNOWN_FAILURE;

        public static IQOpenApplicationStatus fromInt(int i14) {
            return i14 < values().length + (-1) ? values()[i14] : UNKNOWN_FAILURE;
        }
    }

    public enum IQSdkErrorStatus {
        GCM_NOT_INSTALLED,
        GCM_UPGRADE_NEEDED,
        SERVICE_ERROR
    }

    public interface IQSendImageListener {
        void onImageStatus(IQDevice iQDevice, IQApp iQApp, IQMessageStatus iQMessageStatus);
    }

    public interface IQSendMessageListener {
        void onMessageStatus(IQDevice iQDevice, IQApp iQApp, IQMessageStatus iQMessageStatus);
    }

    public static ConnectIQ getInstance() {
        if (sInstance == null) {
            if (AnonymousClass3.$SwitchMap$com$garmin$android$connectiq$ConnectIQ$IQConnectType[sConnectType.ordinal()] != 1) {
                sInstance = new ConnectIQDeviceStrategy();
            } else {
                sInstance = new ConnectIQAdbStrategy();
            }
        }
        return sInstance;
    }

    public void deviceStatusChanged(final IQDevice iQDevice, final IQDevice.IQDeviceStatus iQDeviceStatus) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.garmin.android.connectiq.ConnectIQ.2
                @Override // java.lang.Runnable
                public void run() {
                    IQDeviceEventListener deviceListener;
                    IQDeviceListenerContainer deviceListenerContainer = ConnectIQ.this.mMessageReceiver.getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
                    if (deviceListenerContainer == null || (deviceListener = deviceListenerContainer.getDeviceListener()) == null) {
                        return;
                    }
                    deviceListener.onDeviceStatusChanged(iQDevice, iQDeviceStatus);
                }
            });
        }
    }

    public void displayGCMDialog(final String str, final String str2, final String str3, final String str4) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.garmin.android.connectiq.ConnectIQ.1
                @Override // java.lang.Runnable
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ConnectIQ.this.mContext);
                    builder.setTitle(str).setMessage(str2).setNegativeButton(str3, (DialogInterface.OnClickListener) null).setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: com.garmin.android.connectiq.ConnectIQ.1.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i14) {
                            try {
                                ConnectIQ.this.mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.garmin.android.apps.connectmobile")));
                            } catch (ActivityNotFoundException unused) {
                                ConnectIQ.this.mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.garmin.android.apps.connectmobile")));
                            }
                        }
                    });
                    builder.create().show();
                }
            });
        }
    }

    public int getAdbPort() {
        return AdbConnection.getInstance().getPort();
    }

    public IQApplicationEventListener getApplicationEventListener() {
        return this.mBindingServiceApplicationEventListener;
    }

    public void getApplicationInfo(String str, IQDevice iQDevice, IQApplicationInfoListener iQApplicationInfoListener) {
        throw new UnsupportedOperationException();
    }

    public abstract List<IQDevice> getConnectedDevices();

    public abstract String getDevicePartNumber(IQDevice iQDevice);

    public abstract IQDevice.IQDeviceStatus getDeviceStatus(IQDevice iQDevice);

    public abstract List<IQDevice> getKnownDevices();

    public abstract List<IQDevice> getLinkedCompanionDevices();

    public final IQMessageReceiver getMessageReceiver() {
        return this.mMessageReceiver;
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public void initialize(Context context, boolean z14, ConnectIQListener connectIQListener) {
        this.mContext = context;
        this.mListener = connectIQListener;
        this.mHandler = new Handler();
        this.mMessageReceiver = new IQMessageReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(APPLICATION_INFO);
        intentFilter.addAction(OPEN_APPLICATION);
        intentFilter.addAction(SEND_MESSAGE_STATUS);
        intentFilter.addAction(DEVICE_STATUS);
        intentFilter.addAction(INCOMING_MESSAGE);
        int i14 = Build.VERSION.SDK_INT;
        IQMessageReceiver iQMessageReceiver = this.mMessageReceiver;
        if (i14 >= 33) {
            context.registerReceiver(iQMessageReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(iQMessageReceiver, intentFilter);
        }
        this.mInitialized = true;
    }

    public void openApplication(IQDevice iQDevice, IQApp iQApp, IQOpenApplicationListener iQOpenApplicationListener) {
        throw new UnsupportedOperationException();
    }

    public boolean openStore(String str) {
        throw new UnsupportedOperationException();
    }

    public void registerAppToUseBinderService(String str) {
        verifyInitialized();
        registerAppWithBindingService(str);
        this.mUsingBinderService = true;
        this.mMessageReceiver.clearAppListeners();
        this.mContext.unregisterReceiver(this.mMessageReceiver);
    }

    public abstract void registerAppWithBindingService(String str);

    public void registerForAppEvents(IQDevice iQDevice, IQApp iQApp, IQApplicationEventListener iQApplicationEventListener) {
        verifyInitialized();
        try {
            registerForRemoteAppEvents(iQApp);
        } catch (InvalidStateException unused) {
        }
        IQDeviceListenerContainer deviceListenerContainer = this.mMessageReceiver.getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        if (deviceListenerContainer == null) {
            IQDeviceListenerContainer iQDeviceListenerContainer = new IQDeviceListenerContainer(iQDevice.getDeviceIdentifier());
            iQDeviceListenerContainer.setAppListener(iQApp.getApplicationId(), iQApplicationEventListener);
            this.mMessageReceiver.addDeviceListenerContainer(iQDevice.getDeviceIdentifier(), iQDeviceListenerContainer);
        } else if (deviceListenerContainer.getAppListener(iQApp.getApplicationId()) != iQApplicationEventListener) {
            deviceListenerContainer.setAppListener(iQApp.getApplicationId(), iQApplicationEventListener);
        }
    }

    public void registerForDeviceEvents(IQDevice iQDevice, IQDeviceEventListener iQDeviceEventListener) {
        verifyInitialized();
        IQDeviceListenerContainer deviceListenerContainer = this.mMessageReceiver.getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        if (deviceListenerContainer != null) {
            if (deviceListenerContainer.getDeviceListener() != iQDeviceEventListener) {
                deviceListenerContainer.setDeviceListener(iQDeviceEventListener);
                return;
            }
            return;
        }
        IQDeviceListenerContainer iQDeviceListenerContainer = new IQDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        iQDeviceListenerContainer.setDeviceListener(iQDeviceEventListener);
        this.mMessageReceiver.addDeviceListenerContainer(iQDevice.getDeviceIdentifier(), iQDeviceListenerContainer);
        if (iQDeviceEventListener != null) {
            IQDevice.IQDeviceStatus deviceStatus = IQDevice.IQDeviceStatus.UNKNOWN;
            try {
                deviceStatus = getDeviceStatus(iQDevice);
            } catch (InvalidStateException unused) {
            } catch (ServiceUnavailableException unused2) {
                deviceStatus = IQDevice.IQDeviceStatus.NOT_CONNECTED;
            }
            iQDeviceEventListener.onDeviceStatusChanged(iQDevice, deviceStatus);
        }
    }

    public void registerForEvents(IQDevice iQDevice, IQDeviceEventListener iQDeviceEventListener, IQApp iQApp, IQApplicationEventListener iQApplicationEventListener) {
        verifyInitialized();
        registerForDeviceEvents(iQDevice, iQDeviceEventListener);
        registerForAppEvents(iQDevice, iQApp, iQApplicationEventListener);
    }

    public abstract void registerForRemoteAppEvents(IQApp iQApp);

    public abstract void sendImageProtocol(IQDevice iQDevice, IQApp iQApp, byte[] bArr, IQSendImageListener iQSendImageListener);

    public void sendMessage(IQDevice iQDevice, IQApp iQApp, Object obj, IQSendMessageListener iQSendMessageListener) {
        byte[] bArrB;
        verifyInitialized();
        try {
            bArrB = p.b(obj);
        } catch (Exception unused) {
            if (iQSendMessageListener != null) {
                iQSendMessageListener.onMessageStatus(iQDevice, iQApp, IQMessageStatus.FAILURE_INVALID_FORMAT);
            }
            bArrB = null;
        }
        byte[] bArr = bArrB;
        if (bArr != null) {
            sendMessage(iQDevice, iQApp, bArr, iQSendMessageListener, false);
        }
    }

    public abstract void sendMessageProtocol(IQDevice iQDevice, IQApp iQApp, byte[] bArr, IQSendMessageListener iQSendMessageListener, boolean z14);

    public void setAdbPort(int i14) {
        if (i14 < 1025 || i14 > 65535) {
            h.s("Invalid port number.  Must be between 1025 - 65535");
        } else {
            AdbConnection.getInstance().setPort(i14);
        }
    }

    public void shutdown(Context context) {
        unregisterAllForEvents();
        this.mMessageReceiver.clearApiCallbackListeners();
        ConnectIQListener connectIQListener = this.mListener;
        if (connectIQListener != null) {
            connectIQListener.onSdkShutDown();
        }
        if (!this.mUsingBinderService) {
            context.unregisterReceiver(this.mMessageReceiver);
        }
        this.mMessageReceiver = null;
        this.mBindingServiceApplicationEventListener = null;
        this.mInitialized = false;
    }

    public void unregisterAllForEvents() {
        verifyInitialized();
        this.mMessageReceiver.clearDeviceAndAppListeners();
    }

    public void unregisterAppFromUsingBinderService(String str, Context context) {
        verifyInitialized();
        unregisterAppWithBindingService(str);
        sInstance.shutdown(context);
    }

    public abstract void unregisterAppWithBindingService(String str);

    public void unregisterForApplicationEvents(IQDevice iQDevice, IQApp iQApp) throws InvalidStateException {
        verifyInitialized();
        if (this.mUsingBinderService) {
            throw new InvalidStateException("Cannot unregister for application events per device when using the binder service. Use unregisterForAppEvents(IQApp) instead.");
        }
        try {
            unregisterForRemoteAppEvents(iQApp);
        } catch (InvalidStateException unused) {
        }
        IQDeviceListenerContainer deviceListenerContainer = this.mMessageReceiver.getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        if (deviceListenerContainer != null) {
            deviceListenerContainer.clearAppListeners();
        }
    }

    public void unregisterForDeviceEvents(IQDevice iQDevice) {
        verifyInitialized();
        IQDeviceListenerContainer deviceListenerContainer = this.mMessageReceiver.getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        if (deviceListenerContainer != null) {
            deviceListenerContainer.clearDeviceListener();
        }
    }

    public void unregisterForEvents(IQDevice iQDevice) {
        verifyInitialized();
        IQDeviceListenerContainer deviceListenerContainer = this.mMessageReceiver.getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        if (deviceListenerContainer != null) {
            deviceListenerContainer.clearDeviceListener();
            deviceListenerContainer.clearAppListeners();
        }
    }

    public abstract void unregisterForRemoteAppEvents(IQApp iQApp);

    public void verifyInitialized() {
        if (!this.mInitialized) {
            throw new InvalidStateException("SDK not initialized");
        }
    }

    public void sendMessage(IQDevice iQDevice, IQApp iQApp, Object obj, IQSendMessageListener iQSendMessageListener, boolean z14) {
        byte[] bArrB;
        verifyInitialized();
        try {
            bArrB = p.b(obj);
        } catch (Exception unused) {
            if (iQSendMessageListener != null) {
                iQSendMessageListener.onMessageStatus(iQDevice, iQApp, IQMessageStatus.FAILURE_INVALID_FORMAT);
            }
            bArrB = null;
        }
        byte[] bArr = bArrB;
        if (bArr != null) {
            sendMessage(iQDevice, iQApp, bArr, iQSendMessageListener, z14);
        }
    }

    private void sendMessage(IQDevice iQDevice, IQApp iQApp, byte[] bArr, IQSendMessageListener iQSendMessageListener, boolean z14) {
        if (bArr.length > 16384 && iQSendMessageListener != null) {
            iQSendMessageListener.onMessageStatus(iQDevice, iQApp, IQMessageStatus.FAILURE_MESSAGE_TOO_LARGE);
        }
        sendMessageProtocol(iQDevice, iQApp, bArr, iQSendMessageListener, z14);
    }

    public void unregisterForApplicationEvents() throws InvalidStateException {
        verifyInitialized();
        if (this.mUsingBinderService) {
            this.mBindingServiceApplicationEventListener = null;
            return;
        }
        throw new InvalidStateException("Cannot unregister for application events when not using the binder service. Use unregisterForApplicationEvents(IQDevice, IQApp) instead.");
    }

    public static ConnectIQ getInstance(Context context, IQConnectType iQConnectType) {
        ConnectIQ connectIQ = sInstance;
        if (connectIQ != null && sConnectType != iQConnectType) {
            try {
                connectIQ.shutdown(context);
            } catch (InvalidStateException unused) {
            }
            sInstance = null;
        }
        sConnectType = iQConnectType;
        return getInstance();
    }

    public void registerForAppEvents(IQApplicationEventListener iQApplicationEventListener) {
        verifyInitialized();
        this.mMessageReceiver.clearAppListeners();
        this.mBindingServiceApplicationEventListener = iQApplicationEventListener;
    }
}
