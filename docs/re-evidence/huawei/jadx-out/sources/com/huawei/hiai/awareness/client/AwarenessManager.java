package com.huawei.hiai.awareness.client;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.common.Constant;
import com.huawei.hiai.awareness.service.IAwarenessService;
import com.huawei.hiai.awareness.util.LogUtil;
import com.huawei.hiai.awareness.util.PackageUtil;
import com.huawei.hiai.awareness.util.SystemPropertiesUtil;
import com.huawei.hiai.awareness.util.SystemUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes33.dex */
public class AwarenessManager {
    private static final int EMUI_VERSION_CODE_NINE = 9;
    private static final String HIAI_PACKAGE_NAME = "com.huawei.hiai";
    private static final String METHOD_GET_CA_VERSION = "getServerVersionCode";
    private static final String METHOD_GET_RUNTIME_LOGS = "getRuntimeLogs";
    private static final String TAG = "AwarenessManager";
    private static final String URI_EXPORT_PROVIDER = "content://com.huawei.hiai.awareness.export";
    private IAwarenessService awarenessService;
    private AwarenessServiceConnection connection;
    private Context context;
    private final ReentrantLock lock = new ReentrantLock();
    private volatile boolean isConnected = false;
    private final ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.huawei.hiai.awareness.client.AwarenessManager.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.i(AwarenessManager.TAG, Constant.SERVICE_CONNECT_MESSAGE);
            AwarenessManager.this.lock.lock();
            try {
                AwarenessManager.this.awarenessService = IAwarenessService.Stub.asInterface(iBinder);
                AwarenessManager.this.isConnected = true;
                AwarenessManager.this.lock.unlock();
                if (AwarenessManager.this.connection != null) {
                    AwarenessManager.this.connection.onConnected();
                }
            } catch (Throwable th) {
                AwarenessManager.this.lock.unlock();
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.i(AwarenessManager.TAG, "onServiceDisconnected");
            AwarenessManager.this.lock.lock();
            try {
                AwarenessManager.this.awarenessService = null;
                AwarenessManager.this.isConnected = false;
                AwarenessManager.this.lock.unlock();
                if (AwarenessManager.this.connection != null) {
                    AwarenessManager.this.connection.onDisconnected();
                }
            } catch (Throwable th) {
                AwarenessManager.this.lock.unlock();
                throw th;
            }
        }
    };

    public AwarenessManager(Context context) {
        LogUtil.i(TAG, "AwarenessManager constructor");
        this.context = context;
    }

    public boolean isConnected() {
        return this.isConnected;
    }

    public boolean connectService(AwarenessServiceConnection awarenessServiceConnection) {
        LogUtil.i(TAG, "connectService");
        if (awarenessServiceConnection == null) {
            LogUtil.e(TAG, "AwarenessServiceConnection could not be null");
            return false;
        }
        if (this.context == null) {
            LogUtil.e(TAG, "Initialization context could not be null");
            return false;
        }
        if (SystemPropertiesUtil.getSystemVersionCode() > 9) {
            if (!SystemUtil.isAwarenessPluginInstalled(this.context)) {
                LogUtil.e(TAG, "HiAiEngine CA plugin is not installed");
                return false;
            }
        } else if (!SystemUtil.isHiAiEngineApkInstalled(this.context)) {
            LogUtil.e(TAG, "HiAiEngine apk is not installed");
            return false;
        }
        this.lock.lock();
        try {
            if (this.isConnected) {
                LogUtil.e(TAG, "Service is already connected.");
                this.lock.unlock();
                return true;
            }
            this.connection = awarenessServiceConnection;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.huawei.hiai", "com.huawei.hiai.awareness.service.AwarenessService"));
            intent.setAction("com.huawei.hiai.awareness.IAwarenessService");
            intent.putExtra("LAUNCH_AWARENESS_PACKAGE_NAME", this.context.getPackageName());
            try {
                boolean zBindService = this.context.bindService(intent, this.serviceConnection, 1);
                this.lock.unlock();
                return zBindService;
            } catch (SecurityException unused) {
                LogUtil.e(TAG, "Exception in binding the service");
                this.lock.unlock();
                return false;
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public boolean disconnectService() {
        LogUtil.i(TAG, "disconnectService");
        if (this.context == null) {
            LogUtil.e(TAG, "Context is null, could not disconnect");
            return false;
        }
        this.lock.lock();
        try {
            try {
                if (!this.isConnected) {
                    LogUtil.e(TAG, "Service not connected yet, could not disconnect");
                } else {
                    this.context.unbindService(this.serviceConnection);
                    this.awarenessService = null;
                    this.isConnected = false;
                    AwarenessServiceConnection awarenessServiceConnection = this.connection;
                    if (awarenessServiceConnection != null) {
                        awarenessServiceConnection.onDisconnected();
                    }
                }
            } catch (IllegalArgumentException | NoSuchElementException unused) {
                LogUtil.e(TAG, "unbindService exception");
            }
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean dispatch(AwarenessRequest awarenessRequest) {
        LogUtil.i(TAG, "dispatch");
        boolean zAccept = false;
        if (awarenessRequest == null) {
            LogUtil.e(TAG, "Not allowed nullable AwarenessRequest!");
            return false;
        }
        this.lock.lock();
        try {
            try {
                if (!this.isConnected) {
                    LogUtil.e(TAG, "AwarenessService is not connected!");
                    this.lock.unlock();
                    return false;
                }
                String packageName = this.context.getPackageName();
                awarenessRequest.setPackageName(packageName);
                String canonicalName = this.context.getClass().getCanonicalName();
                awarenessRequest.setServiceName(canonicalName);
                LogUtil.i(TAG, "dispatch request, messageType=" + awarenessRequest.getMessageType() + ", packageName=" + packageName + ", serviceName=" + canonicalName);
                zAccept = this.awarenessService.accept(awarenessRequest.toEnvelope());
                this.lock.unlock();
                LogUtil.i(TAG, "dispatch request, return=" + zAccept);
                return zAccept;
            } catch (RemoteException unused) {
                LogUtil.e(TAG, "RemoteException in dispatch");
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public boolean dispatchBatch(List<AwarenessRequest> list, OnResultListener onResultListener) {
        boolean zAcceptBatch = false;
        if (list == null) {
            LogUtil.e(TAG, "Not allowed nullable AwarenessRequest!");
            return false;
        }
        this.lock.lock();
        try {
            try {
                if (!this.isConnected) {
                    LogUtil.e(TAG, "AwarenessService is not connected!");
                    this.lock.unlock();
                    return false;
                }
                String packageName = this.context.getPackageName();
                String canonicalName = this.context.getClass().getCanonicalName();
                ArrayList arrayList = new ArrayList(list.size());
                StringBuilder sb = new StringBuilder();
                for (AwarenessRequest awarenessRequest : list) {
                    awarenessRequest.setPackageName(packageName);
                    awarenessRequest.setServiceName(canonicalName);
                    arrayList.add(awarenessRequest.toEnvelope());
                    sb.append("{messageType=");
                    sb.append(awarenessRequest.getMessageType());
                    sb.append(", packageName=");
                    sb.append(packageName);
                    sb.append(", serviceName=");
                    sb.append(canonicalName);
                    sb.append("},");
                }
                LogUtil.i(TAG, "dispatchBatch " + arrayList.size() + " request, [" + sb.toString() + "]");
                zAcceptBatch = this.awarenessService.acceptBatch(arrayList, onResultListener);
                this.lock.unlock();
                LogUtil.i(TAG, "dispatchBatch request, return = " + zAcceptBatch);
                return zAcceptBatch;
            } catch (RemoteException unused) {
                LogUtil.e(TAG, "RemoteException in dispatch");
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int getServerVersionCode() {
        LogUtil.i(TAG, "getServerVersion called");
        Bundle dataFromProvider = getDataFromProvider(METHOD_GET_CA_VERSION, null);
        if (dataFromProvider == null) {
            LogUtil.e(TAG, "getServerVersionCode bundle is null");
            return 0;
        }
        return dataFromProvider.getInt("version");
    }

    public String[] getRuntimeLogs(Bundle bundle) {
        Context context = this.context;
        if (context == null) {
            LogUtil.e(TAG, "context is null when get log uris");
            return new String[0];
        }
        String packageName = context.getPackageName();
        LogUtil.i(TAG, packageName + " called the getLogUris");
        bundle.putString("package", packageName);
        Bundle dataFromProvider = getDataFromProvider(METHOD_GET_RUNTIME_LOGS, bundle);
        if (dataFromProvider == null) {
            LogUtil.e(TAG, "bundle is null when getLogUris");
            return new String[0];
        }
        return dataFromProvider.getStringArray("logUris");
    }

    private Bundle getDataFromProvider(String str, Bundle bundle) {
        if (this.context == null) {
            LogUtil.e(TAG, "context is null when get data form provider");
            return null;
        }
        Uri uri = Uri.parse(URI_EXPORT_PROVIDER);
        if (!PackageUtil.isSystemAppOrHasSameSignatureByUri(this.context, uri)) {
            LogUtil.e(TAG, "invalid uri");
            return null;
        }
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.context.getContentResolver().acquireUnstableContentProviderClient((String) Objects.requireNonNull(uri.getAuthority()));
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    LogUtil.e(TAG, "contentProviderClient is null");
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return null;
                }
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(str, null, bundle);
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                return bundleCall;
            } catch (Throwable th) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            LogUtil.e(TAG, "call provider exception");
            return null;
        }
    }
}
