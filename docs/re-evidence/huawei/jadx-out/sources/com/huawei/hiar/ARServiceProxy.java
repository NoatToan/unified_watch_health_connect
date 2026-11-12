package com.huawei.hiar;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import com.huawei.arengine.service.IAREngine;
import com.huawei.common.Constant;
import com.huawei.hiar.exceptions.ARCameraNotAvailableException;
import com.huawei.hiar.exceptions.ARCameraPermissionDeniedException;
import com.huawei.hiar.exceptions.ARDeadlineExceededException;
import com.huawei.hiar.exceptions.ARFatalException;
import com.huawei.hiar.exceptions.ARMissingGlContextException;
import com.huawei.hiar.exceptions.ARNotTrackingException;
import com.huawei.hiar.exceptions.ARNotYetAvailableException;
import com.huawei.hiar.exceptions.ARResourceExhaustedException;
import com.huawei.hiar.exceptions.ARSessionNotPausedException;
import com.huawei.hiar.exceptions.ARSessionPausedException;
import com.huawei.hiar.exceptions.ARTextureNotSetException;
import com.huawei.hiar.exceptions.ARUnSupportedConfigurationException;
import com.huawei.hiar.exceptions.ARUnavailableClientSdkTooOldException;
import com.huawei.hiar.exceptions.ARUnavailableConnectServerTimeOutException;
import com.huawei.hiar.exceptions.ARUnavailableDeviceNotCompatibleException;
import com.huawei.hiar.exceptions.ARUnavailableEmuiNotCompatibleException;
import com.huawei.hiar.exceptions.ARUnavailableServiceApkTooOldException;
import com.huawei.hiar.exceptions.ARUnavailableServiceNotInstalledException;
import com.huawei.hiar.exceptions.ARUnavailableUserDeclinedInstallationException;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes33.dex */
class ARServiceProxy implements SurfaceTexture.OnFrameAvailableListener {
    private static final int DEFAULT_PREVIEW_SIZE_HEIGHT = 960;
    private static final int DEFAULT_PREVIEW_SIZE_WIDTH = 1280;
    private static final float FLOAT_2F = 2.0f;
    static final int HWAR_ERROR_CAMERA_NOT_AVAILABLE = -13;
    static final int HWAR_ERROR_CAMERA_PERMISSION_NOT_GRANTED = -9;
    static final int HWAR_ERROR_DEADLINE_EXCEEDED = -10;
    static final int HWAR_ERROR_FATAL = -2;
    static final int HWAR_ERROR_INVALID_ARGUMENT = -1;
    static final int HWAR_ERROR_MISSING_GL_CONTEXT = -7;
    static final int HWAR_ERROR_NOT_TRACKING = -5;
    static final int HWAR_ERROR_NOT_YET_AVAILABLE = -12;
    static final int HWAR_ERROR_RESOURCE_EXHAUSTED = -11;
    static final int HWAR_ERROR_SESSION_NOT_PAUSED = -4;
    static final int HWAR_ERROR_SESSION_PAUSED = -3;
    static final int HWAR_ERROR_TEXTURE_NOT_SET = -6;
    static final int HWAR_ERROR_UNSUPPORTED_CONFIGURATION = -8;
    static final int HWAR_SUCCESS = 0;
    static final int HWAR_UNAVAILABLE_APK_TOO_OLD = -103;
    static final int HWAR_UNAVAILABLE_ARSERVICE_NOT_INSTALLED = -100;
    static final int HWAR_UNAVAILABLE_CONNECT_SERVER_TIME_OUT = -1001;
    static final int HWAR_UNAVAILABLE_DEVICE_NOT_COMPATIBLE = -101;
    static final int HWAR_UNAVAILABLE_EMUI_NOT_COMPATIBLE = -1000;
    static final int HWAR_UNAVAILABLE_SDK_TOO_OLD = -104;
    static final int HWAR_UNAVAILABLE_USER_DECLINED_INSTALLATION = -105;
    private static final int INT_16 = 16;
    private static final boolean IS_USE_64_BIT_LIB = false;
    private static final String NAME_ARENGINE_REMOTE_SERVICE = "com.huawei.arengine.service.AREngineServer";
    private static final long NANOSECONDS_IN_MILLISECOND = 1000000;
    private static final String PACKAGE_ARENGINE_REMOTE_SERVICE = "com.huawei.arengine.service";
    private static final String TAG = "ARServiceProxy";
    private static int previewSizeWidth;
    private static int previewWidthHeight;
    private Context context;
    private IAREngine hiArService;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private int[] metaDatas;
    private long sessionHandle;
    private AtomicBoolean textureAvailable = new AtomicBoolean(false);
    private SurfaceTexture surfaceTexture = null;
    private Surface surface = null;
    private final Object syncObject = new Object();
    private boolean isSetMetaData = false;
    private ServiceConnection connection = new b();

    private native void nativeSetMetaData(long j, int[] iArr, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStart(long j);

    void update(long j, long j2) {
        if (this.hiArService == null) {
            Log.w(TAG, "AR service is not ready.");
        } else {
            if (this.isSetMetaData) {
                return;
            }
            int[] iArr = this.metaDatas;
            nativeSetMetaData(j, iArr, iArr.length);
            this.isSetMetaData = true;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.textureAvailable) {
            this.textureAvailable.set(true);
            this.textureAvailable.notifyAll();
        }
    }

    protected void finalize() throws Throwable {
        this.mHandlerThread.quit();
        super.finalize();
    }

    private long updatePreview() {
        this.surfaceTexture.updateTexImage();
        return this.surfaceTexture.getTimestamp();
    }

    static void throwExceptionFromArStatus(int i, boolean z) throws Exception {
        if (i == 0) {
            return;
        }
        if (!z && i == -8) {
            throw new ARUnSupportedConfigurationException(ARConfigBase.AR_TYPE_UNSUPPORTED_MESSAGE);
        }
        Map<Integer, Exception> mapLoadExceptionMap = loadExceptionMap();
        if (mapLoadExceptionMap.containsKey(Integer.valueOf(i))) {
            throw mapLoadExceptionMap.get(Integer.valueOf(i));
        }
        throw new ARFatalException("Unexpected error code: " + i);
    }

    private void stop() {
        arUnbindService(this.context);
    }

    static void setPreviewSize(int i, int i2) {
        previewSizeWidth = i;
        previewWidthHeight = i2;
    }

    public static float[] projectionMatrixFromCameraIntrinsics(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float[] fArr = new float[32];
        Matrix.setIdentityM(fArr, 0);
        fArr[0] = 1.0f / f3;
        fArr[5] = 1.0f / f4;
        Matrix.frustumM(fArr, 16, (((-f7) * f5) / 2.0f) - f9, ((f5 * f7) / 2.0f) - f9, (((-f8) * f6) / 2.0f) - f10, ((f6 * f8) / 2.0f) - f10, f, f2);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, i, fArr, 0, fArr, 16);
        return fArr2;
    }

    private boolean newFrameAvaliableByWait(long j) {
        long j2;
        synchronized (this.textureAvailable) {
            if (this.textureAvailable.getAndSet(false)) {
                return true;
            }
            for (long jNanoTime = j * 1000000; jNanoTime > 0; jNanoTime -= System.nanoTime() - j2) {
                long jNanoTime2 = System.nanoTime();
                try {
                    j2 = jNanoTime2;
                    try {
                        this.textureAvailable.wait(jNanoTime / 1000000, (int) (jNanoTime % 1000000));
                    } catch (InterruptedException unused) {
                        Log.d(TAG, "Interrupted: localInterrupted");
                    }
                } catch (InterruptedException unused2) {
                    j2 = jNanoTime2;
                }
                if (this.textureAvailable.getAndSet(false)) {
                    Log.d(TAG, "newFrameAvailableByWait: notifyed by onFrameAvailable");
                    return true;
                }
            }
            Log.d(TAG, "texture unavailable for " + j + " ms");
            return false;
        }
    }

    private static Map<Integer, Exception> loadExceptionMap() {
        HashMap map = new HashMap();
        map.put(-1, new IllegalArgumentException());
        map.put(-2, new ARFatalException());
        map.put(-3, new ARSessionPausedException());
        map.put(-4, new ARSessionNotPausedException());
        map.put(-5, new ARNotTrackingException());
        map.put(-6, new ARTextureNotSetException());
        map.put(-7, new ARMissingGlContextException());
        map.put(-8, new ARUnSupportedConfigurationException());
        map.put(-9, new ARCameraPermissionDeniedException());
        map.put(-10, new ARDeadlineExceededException());
        map.put(-11, new ARResourceExhaustedException());
        map.put(-12, new ARNotYetAvailableException());
        map.put(-13, new ARCameraNotAvailableException());
        map.put(-100, new ARUnavailableServiceNotInstalledException());
        map.put(-101, new ARUnavailableDeviceNotCompatibleException());
        map.put(-1000, new ARUnavailableEmuiNotCompatibleException());
        map.put(-1001, new ARUnavailableConnectServerTimeOutException());
        map.put(-103, new ARUnavailableServiceApkTooOldException());
        map.put(-104, new ARUnavailableClientSdkTooOldException());
        map.put(-105, new ARUnavailableUserDeclinedInstallationException());
        return map;
    }

    private FileDescriptor getSharedFile(String str) {
        ParcelFileDescriptor sharedFile;
        IAREngine iAREngine = this.hiArService;
        if (iAREngine == null) {
            Log.w(TAG, "AR service is not ready.");
            return null;
        }
        try {
            sharedFile = iAREngine.getSharedFile(str);
        } catch (RemoteException unused) {
            Log.w(TAG, "Failed to bind remote.");
            sharedFile = null;
        }
        if (sharedFile != null) {
            return sharedFile.getFileDescriptor();
        }
        Log.i(TAG, "Failed to get file descriptor.");
        return null;
    }

    @Deprecated
    private Surface getPreviewSurfaceWithTexture(int i) {
        if (i < 0) {
            Log.e(TAG, "invalid textureId yet");
            return null;
        }
        if (this.surfaceTexture == null) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(i);
            this.surfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.mHandler);
            this.surfaceTexture.setDefaultBufferSize(previewSizeWidth, previewWidthHeight);
            this.surface = new Surface(this.surfaceTexture);
        }
        if (this.surface == null) {
            Log.e(TAG, "GetSurfaceWithTexture failed, lost surface");
        }
        return this.surface;
    }

    private static String getAbsoluteRemoteLibName(Object obj, String str) {
        String str2 = TAG;
        Log.d(str2, "into getAbsoluteRemoteLibName");
        try {
            if (obj instanceof Context) {
                return getAbsolutePath(((Context) obj).createPackageContext(str, 3));
            }
            Log.w(str2, "context transform failed");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "create context failed");
            return null;
        }
    }

    private static String getAbsolutePath(Context context) {
        StringBuilder sb;
        String str;
        String packageResourcePath = context.getPackageResourcePath();
        int length = packageResourcePath.length() - 1;
        while (length >= 0 && packageResourcePath.charAt(length) != '/') {
            length--;
        }
        if (length < 0) {
            return null;
        }
        String strSubstring = packageResourcePath.substring(0, length);
        if (Process.is64Bit()) {
            Log.d(TAG, "current process is 64bit, use arm64");
            sb = new StringBuilder();
            sb.append(strSubstring);
            str = "/lib/arm64/";
        } else {
            Log.d(TAG, "current process is 32bit, use arm");
            sb = new StringBuilder();
            sb.append(strSubstring);
            str = "/lib/arm/";
        }
        sb.append(str);
        return sb.toString();
    }

    private Intent createExplicitStartIntent(Intent intent) {
        ComponentName componentName = new ComponentName("com.huawei.arengine.service", NAME_ARENGINE_REMOTE_SERVICE);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        return intent2;
    }

    private void arUnbindService(Context context) {
        String str = TAG;
        Log.d(str, "arUnbindService");
        if (context == null) {
            Log.e(str, "context is null");
        } else {
            context.unbindService(this.connection);
        }
    }

    private void arBindService(Context context) {
        Log.d(TAG, "arBindService");
        Intent intent = new Intent();
        intent.setClassName(context, NAME_ARENGINE_REMOTE_SERVICE);
        context.bindService(new Intent(createExplicitStartIntent(intent)), this.connection, 1);
    }

    class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(ARServiceProxy.TAG, "onServiceDisconnected called since the service is lost or stop!");
            ARServiceProxy.this.hiArService = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (ARServiceProxy.this.syncObject) {
                Log.d(ARServiceProxy.TAG, Constant.SERVICE_CONNECT_MESSAGE);
                ARServiceProxy.this.hiArService = IAREngine.a.a(iBinder);
                if (ARServiceProxy.this.hiArService != null) {
                    try {
                        ARServiceProxy aRServiceProxy = ARServiceProxy.this;
                        aRServiceProxy.metaDatas = aRServiceProxy.hiArService.getMetaData();
                    } catch (RemoteException unused) {
                        Log.e(ARServiceProxy.TAG, "getMetaData failed!");
                    }
                    ARServiceProxy aRServiceProxy2 = ARServiceProxy.this;
                    aRServiceProxy2.nativeStart(aRServiceProxy2.sessionHandle);
                    return;
                }
                Log.w(ARServiceProxy.TAG, "onServiceConnected hiArService is null.");
            }
        }

        b() {
        }
    }

    @Deprecated
    ARServiceProxy(Object obj, long j) {
        if (!(obj instanceof Context)) {
            Log.e(TAG, "ARServiceProxy context invalid.");
            return;
        }
        this.context = (Context) obj;
        this.sessionHandle = j;
        previewSizeWidth = 1280;
        previewWidthHeight = DEFAULT_PREVIEW_SIZE_HEIGHT;
        HandlerThread handlerThread = new HandlerThread("OnFrameAvailableThread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        if (this.mHandlerThread.getLooper() != null) {
            this.mHandler = new Handler(this.mHandlerThread.getLooper());
        } else {
            Log.e(TAG, "ARServiceProxy create mHandler failed!");
        }
        arBindService(this.context);
    }
}
