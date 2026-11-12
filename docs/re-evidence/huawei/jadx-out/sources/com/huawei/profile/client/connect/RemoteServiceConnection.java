package com.huawei.profile.client.connect;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes15.dex */
public class RemoteServiceConnection {
    private static final String PROFILE_SERVICE_ACTION = "com.huawei.profile.service.ProfileService.START";
    private static final String SERVICE_CLASS_NAME = "com.huawei.profile.service.ProfileService";
    private static final String SERVICE_PACKAGE_NAME = "com.huawei.profile";
    private static final String TAG = "RemoteServiceConnection";
    private IBinder binder = null;
    private OnConnectListener connectListener;
    private volatile ServiceConnectionWrapper connection;
    private final Context context;
    private final int userId;

    /* JADX INFO: loaded from: classes42.dex */
    public interface OnConnectListener {
        void onConnect(IBinder iBinder);

        void onDisconnect();
    }

    public RemoteServiceConnection(Context context, int i) {
        this.context = context;
        this.userId = i;
    }

    public boolean open(OnConnectListener onConnectListener) {
        this.connectListener = onConnectListener;
        Intent intent = new Intent(PROFILE_SERVICE_ACTION);
        intent.setComponent(new ComponentName("com.huawei.profile", SERVICE_CLASS_NAME));
        this.connection = new ServiceConnectionWrapper();
        try {
            if (bindService(intent)) {
                Log.i(TAG, "bind the target service success.");
                return true;
            }
            Log.e(TAG, "Failed to bind to the target service.");
            unbind(this.connection);
            this.connection = null;
            return false;
        } catch (SecurityException unused) {
            Log.e(TAG, "Failed to bind service, error: %s.");
            this.connection = null;
            return false;
        }
    }

    private boolean bindService(Intent intent) {
        if (isHeadlessSystemUser()) {
            Log.i(TAG, "is headless user.");
            int i = this.userId;
            if (i == 0) {
                Log.e(TAG, "Bind as user headless true and user 0.");
                return false;
            }
            if (i == -2) {
                return this.context.bindService(intent, this.connection, 1);
            }
            return bindServiceAsUser(this.context, intent, this.connection, 1, getUserHandle(this.userId));
        }
        int i2 = this.userId;
        if (i2 == 0) {
            return bindServiceAsUser(this.context, intent, this.connection, 1, getUserHandle(this.userId));
        }
        if (i2 == -2) {
            Log.i(TAG, "start to bind target service");
            return this.context.bindService(intent, this.connection, 1);
        }
        Log.e(TAG, "Bind as user headless false and not user 0.");
        return false;
    }

    private boolean isHeadlessSystemUser() {
        return getBooleanProp("ro.fw.mu.headless_system_user", false);
    }

    private UserHandle getUserHandle(int i) {
        UserHandle userHandle;
        Log.i(TAG, "enter getUserHandle,userId:" + i);
        try {
            Object objNewInstance = Class.forName("android.os.UserHandle").getDeclaredConstructor(Integer.TYPE).newInstance(Integer.valueOf(i));
            if (objNewInstance instanceof UserHandle) {
                userHandle = (UserHandle) objNewInstance;
            } else {
                Log.w(TAG, "failed to get user service, object is " + objNewInstance);
                userHandle = null;
            }
        } catch (ClassNotFoundException unused) {
            Log.e(TAG, "UserHandle ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            Log.e(TAG, "UserHandle IllegalAccessException");
        } catch (InstantiationException unused3) {
            Log.e(TAG, "UserHandle InstantiationException");
        } catch (NoSuchMethodException unused4) {
            Log.e(TAG, "UserHandle NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            Log.e(TAG, "UserHandle InvocationTargetException");
        }
        if (userHandle == null) {
            Log.w(TAG, "failed to get user handler");
        }
        return userHandle;
    }

    private boolean bindServiceAsUser(Context context, Intent intent, ServiceConnection serviceConnection, int i, UserHandle userHandle) {
        if (userHandle == null) {
            Log.e(TAG, "userHandle is null, failed to bind service as user");
            return false;
        }
        try {
            Method declaredMethod = Context.class.getDeclaredMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, UserHandle.class);
            if (declaredMethod != null) {
                Object objInvoke = declaredMethod.invoke(context, intent, serviceConnection, Integer.valueOf(i), userHandle);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
            }
        } catch (IllegalAccessException unused) {
            Log.e(TAG, "bindServiceAsUser IllegalAccessException");
        } catch (NoSuchMethodException unused2) {
            Log.e(TAG, "bindServiceAsUser NoSuchMethodException");
        } catch (InvocationTargetException unused3) {
            Log.e(TAG, "bindServiceAsUser InvocationTargetException");
        }
        return false;
    }

    private static boolean getBooleanProp(String str, boolean z) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z));
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException unused) {
            Log.e(TAG, "SystemProperties ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            Log.e(TAG, "SystemProperties IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            Log.e(TAG, "SystemProperties NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            Log.e(TAG, "SystemProperties InvocationTargetException");
        }
        return z;
    }

    public boolean close() {
        unbind(this.connection);
        this.connection = null;
        this.binder = null;
        this.connectListener = null;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unbind(ServiceConnectionWrapper serviceConnectionWrapper) {
        if (serviceConnectionWrapper != null) {
            try {
                serviceConnectionWrapper.isClosed = true;
                this.context.unbindService(serviceConnectionWrapper);
            } catch (IllegalArgumentException e) {
                Log.e(TAG, "IllegalArgumentException: " + e.getMessage());
            } catch (RuntimeException unused) {
                Log.e(TAG, "unbindService with Unexpected runtimeException");
            }
        }
    }

    /* JADX INFO: loaded from: classes42.dex */
    class ServiceConnectionWrapper implements ServiceConnection {
        private static final long TIME_DELAY = 1000;
        volatile boolean isClosed;

        private ServiceConnectionWrapper() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (!this.isClosed) {
                RemoteServiceConnection.this.binder = iBinder;
                if (RemoteServiceConnection.this.connectListener != null) {
                    RemoteServiceConnection.this.connectListener.onConnect(RemoteServiceConnection.this.binder);
                    return;
                }
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.huawei.profile.client.connect.RemoteServiceConnection.ServiceConnectionWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    Log.i(RemoteServiceConnection.TAG, "the service is already closed, unbindService");
                    RemoteServiceConnection.this.unbind(ServiceConnectionWrapper.this);
                }
            }, 1000L);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (RemoteServiceConnection.this.binder == null || this.isClosed) {
                return;
            }
            RemoteServiceConnection.this.binder = null;
            if (RemoteServiceConnection.this.connectListener != null) {
                RemoteServiceConnection.this.connectListener.onDisconnect();
            }
            Log.e(RemoteServiceConnection.TAG, "Connection to data service is disconnected unexpectedly.");
        }
    }
}
