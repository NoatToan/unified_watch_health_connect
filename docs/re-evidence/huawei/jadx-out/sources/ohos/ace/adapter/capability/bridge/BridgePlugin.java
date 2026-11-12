package ohos.ace.adapter.capability.bridge;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BridgePlugin {
    private static final long DEFAULT_MAIN_THREAD_TIMEOUT_MS = 500;
    private static final String LOG_TAG = "BridgePlugin";
    private BridgeManager bridgeManagerInstance;
    private final String bridgeName_;
    private BridgeType bridgeType_;
    private IMessageListener iMessageListener_;
    private IMethodResult iMethodResult_;
    private boolean isAvailable_;
    private Lock methodMapLock_;
    private HashMap<String, Method> methodsMap_;

    public enum BridgeType {
        JSON_TYPE,
        BINARY_TYPE
    }

    public void onPeerReady() {
    }

    public BridgePlugin(Context context, String str, int i) {
        this.isAvailable_ = false;
        this.methodMapLock_ = new ReentrantLock();
        this.bridgeType_ = BridgeType.JSON_TYPE;
        this.bridgeName_ = str;
        this.bridgeManagerInstance = BridgeManager.getInstance();
        if (checkBridgeInner()) {
            this.bridgeManagerInstance.registerBridgePlugin(str, this);
            this.methodsMap_ = new HashMap<>();
        }
    }

    public BridgePlugin(Context context, String str, int i, BridgeType bridgeType) {
        this.isAvailable_ = false;
        this.methodMapLock_ = new ReentrantLock();
        BridgeType bridgeType2 = BridgeType.JSON_TYPE;
        this.bridgeName_ = str;
        this.bridgeType_ = bridgeType;
        this.bridgeManagerInstance = BridgeManager.getInstance();
        if (checkBridgeInner()) {
            this.bridgeManagerInstance.registerBridgePlugin(str, this);
            this.methodsMap_ = new HashMap<>();
        }
    }

    public BridgePlugin(Context context, String str, BridgeManager bridgeManager) {
        this.isAvailable_ = false;
        this.methodMapLock_ = new ReentrantLock();
        this.bridgeType_ = BridgeType.JSON_TYPE;
        this.bridgeName_ = str;
        this.bridgeManagerInstance = BridgeManager.getInstance();
        if (checkBridgeInner()) {
            this.bridgeManagerInstance.registerBridgePlugin(str, this);
            this.methodsMap_ = new HashMap<>();
        }
    }

    public BridgePlugin(Context context, String str, BridgeManager bridgeManager, BridgeType bridgeType) {
        this.isAvailable_ = false;
        this.methodMapLock_ = new ReentrantLock();
        BridgeType bridgeType2 = BridgeType.JSON_TYPE;
        this.bridgeName_ = str;
        this.bridgeType_ = bridgeType;
        this.bridgeManagerInstance = BridgeManager.getInstance();
        if (checkBridgeInner()) {
            this.bridgeManagerInstance.registerBridgePlugin(str, this);
            this.methodsMap_ = new HashMap<>();
        }
    }

    public BridgePlugin(Context context, String str, BridgeManager bridgeManager, BridgeType bridgeType, TaskOption taskOption) {
        this.isAvailable_ = false;
        this.methodMapLock_ = new ReentrantLock();
        BridgeType bridgeType2 = BridgeType.JSON_TYPE;
        this.bridgeName_ = str;
        this.bridgeType_ = bridgeType;
        this.bridgeManagerInstance = BridgeManager.getInstance();
        if (checkBridgeInner()) {
            this.bridgeManagerInstance.registerBridgePlugin(str, this);
            this.methodsMap_ = new HashMap<>();
        }
    }

    public BridgePlugin(String str, BridgeType bridgeType) {
        this.isAvailable_ = false;
        this.methodMapLock_ = new ReentrantLock();
        BridgeType bridgeType2 = BridgeType.JSON_TYPE;
        this.bridgeName_ = str;
        this.bridgeType_ = bridgeType;
        this.bridgeManagerInstance = BridgeManager.getInstance();
        if (checkBridgeInner()) {
            this.bridgeManagerInstance.registerBridgePlugin(str, this);
            this.methodsMap_ = new HashMap<>();
        }
    }

    private boolean checkBridgeInner() {
        return (this.bridgeName_ == null || this.bridgeManagerInstance == null) ? false : true;
    }

    private void registerMethod(String str, Method method) {
        this.methodMapLock_.lock();
        try {
            HashMap<String, Method> map = this.methodsMap_;
            if (map != null) {
                map.put(str, method);
            } else {
                ALog.e(LOG_TAG, "The methodsMap failed");
            }
        } finally {
            this.methodMapLock_.unlock();
        }
    }

    private Method findMethod(String str) {
        this.methodMapLock_.lock();
        try {
            HashMap<String, Method> map = this.methodsMap_;
            if (map != null) {
                return map.get(str);
            }
            return null;
        } finally {
            this.methodMapLock_.unlock();
        }
    }

    protected String getBridgeName() {
        return this.bridgeName_;
    }

    public BridgeType getBridgeType() {
        return this.bridgeType_;
    }

    public boolean isBridgeAvailable() {
        return this.isAvailable_;
    }

    protected void onRegisterResult(boolean z) {
        this.isAvailable_ = z;
        if (z) {
            onPeerReady();
        }
    }

    public boolean unRegister(String str) {
        return this.bridgeManagerInstance.unRegisterBridgePlugin(str);
    }

    public void setMessageListener(IMessageListener iMessageListener) {
        this.iMessageListener_ = iMessageListener;
    }

    public void setMethodResultListener(IMethodResult iMethodResult) {
        this.iMethodResult_ = iMethodResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: callMethodInner, reason: merged with bridge method [inline-methods] */
    public void m1975xfe4a17a7(MethodData methodData) {
        BridgeErrorCode bridgeErrorCodePlatformCallMethod;
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        if (this.bridgeType_ == BridgeType.BINARY_TYPE) {
            bridgeErrorCodePlatformCallMethod = this.bridgeManagerInstance.platformCallMethodBinary(this.bridgeName_, methodData);
        } else {
            bridgeErrorCodePlatformCallMethod = this.bridgeManagerInstance.platformCallMethod(this.bridgeName_, methodData);
        }
        if (this.iMethodResult_ == null || bridgeErrorCodePlatformCallMethod.getId() == 0) {
            return;
        }
        this.iMethodResult_.onError(methodData.getMethodName(), bridgeErrorCodePlatformCallMethod.getId(), bridgeErrorCodePlatformCallMethod.getErrorMessage());
    }

    public void callMethod(final MethodData methodData) {
        ALog.d(LOG_TAG, "callMethod enter, bridgeName is " + this.bridgeName_ + ", methodName is " + methodData.getMethodName());
        if (!this.isAvailable_) {
            ALog.e(LOG_TAG, "The bridge is not available.");
        } else {
            BridgeThreadExecutor.getInstance().execute(new Runnable() { // from class: ohos.ace.adapter.capability.bridge.BridgePlugin$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1975xfe4a17a7(methodData);
                }
            });
        }
    }

    public void callMethod(String str, Object... objArr) {
        callMethod(new MethodData(str, objArr));
    }

    public Object callMethodSync(String str, Object... objArr) {
        if (!this.isAvailable_) {
            ALog.e(LOG_TAG, "The bridge is not available.");
            throw new IllegalStateException("Bridge '" + this.bridgeName_ + "' is not available, errorCode =" + BridgeErrorCode.BRIDGE_INVALID.getId());
        }
        return callMethodToMainThread(new MethodData(str, objArr));
    }

    private Object callMethodToMainThread(final MethodData methodData) {
        final Object[] objArr = new Object[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        BridgeThreadExecutor.getInstance().postToMainThreadSync(new Runnable() { // from class: ohos.ace.adapter.capability.bridge.BridgePlugin$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1976xc9f8f646(objArr, methodData, countDownLatch);
            }
        });
        try {
            if (!countDownLatch.await(500L, TimeUnit.MILLISECONDS)) {
                ALog.e(LOG_TAG, "callMethodSync timeout.");
                throw new IllegalStateException("callMethodSync timeout after 500 ms, method=" + methodData.getMethodName() + ", errorCode =" + BridgeErrorCode.BRIDGE_CALL_METHOD_SYNC_TIMEOUT.getId());
            }
            return objArr[0];
        } catch (InterruptedException e) {
            ALog.e(LOG_TAG, "callMethodSync interrupted while waiting main thread.");
            throw new RuntimeException("callMethodSync interrupted, method=" + methodData.getMethodName() + ", errorCode =" + BridgeErrorCode.BRIDGE_ERROR_NO.getId(), e);
        }
    }

    /* JADX INFO: renamed from: lambda$callMethodToMainThread$1$ohos-ace-adapter-capability-bridge-BridgePlugin, reason: not valid java name */
    /* synthetic */ void m1976xc9f8f646(Object[] objArr, MethodData methodData, CountDownLatch countDownLatch) {
        try {
            objArr[0] = callMethodSyncInner(methodData);
        } finally {
            countDownLatch.countDown();
        }
    }

    private Object callMethodSyncInner(MethodData methodData) {
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_INVALID;
        if (this.bridgeType_ == BridgeType.BINARY_TYPE) {
            return this.bridgeManagerInstance.platformCallMethodSyncBinary(this.bridgeName_, methodData);
        }
        return this.bridgeManagerInstance.platformCallMethodSync(this.bridgeName_, methodData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessageInner, reason: merged with bridge method [inline-methods] */
    public void m1977xb5a4a24f(Object obj) {
        if (this.bridgeType_ == BridgeType.BINARY_TYPE) {
            this.bridgeManagerInstance.platformSendMessageBinary(this.bridgeName_, obj);
        } else {
            this.bridgeManagerInstance.platformSendMessage(this.bridgeName_, obj);
        }
    }

    public void sendMessage(final Object obj) {
        if (!this.isAvailable_) {
            ALog.e(LOG_TAG, "The bridge is not available.");
        } else {
            BridgeThreadExecutor.getInstance().execute(new Runnable() { // from class: ohos.ace.adapter.capability.bridge.BridgePlugin$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1977xb5a4a24f(obj);
                }
            });
        }
    }

    public void release() {
        this.isAvailable_ = false;
        this.bridgeManagerInstance = null;
    }

    public Object jsCallMethod(Object obj, MethodData methodData) {
        if (obj != null && methodData != null) {
            ALog.d(LOG_TAG, "jsCallMethod enter, bridgeName is " + this.bridgeName_ + ", methodName is " + methodData.getMethodName());
            return bridgeInvokeMethod(obj, initMethod(obj.getClass(), methodData), methodData.getMethodParameter());
        }
        return BridgeErrorCode.BRIDGE_METHOD_UNIMPL;
    }

    private Object bridgeInvokeMethod(Object obj, Method method, Object[] objArr) {
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_METHOD_UNIMPL;
        if (obj == null || method == null || objArr == null) {
            return bridgeErrorCode;
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    return method.invoke(obj, objArr);
                }
            } catch (IllegalAccessException unused) {
                ALog.e(LOG_TAG, "jsCallMethod failed, IllegalAccessException.");
                return bridgeErrorCode;
            } catch (IllegalArgumentException unused2) {
                ALog.e(LOG_TAG, "jsCallMethod failed, IllegalArgumentException.");
                return BridgeErrorCode.BRIDGE_METHOD_PARAM_ERROR;
            } catch (InvocationTargetException unused3) {
                ALog.e(LOG_TAG, "jsCallMethod failed, InvocationTargetException.");
                return bridgeErrorCode;
            }
        }
        return method.invoke(obj, new Object[0]);
    }

    private Method initMethod(Class<?> cls, MethodData methodData) {
        if (cls == null || methodData == null) {
            return null;
        }
        Method methodFindMethod = findMethod(methodData.getMethodName());
        if (methodFindMethod != null) {
            return methodFindMethod;
        }
        try {
            Class<?>[] parameterTypes = null;
            for (Method method : cls.getMethods()) {
                if (method.getName().equals(methodData.getMethodName())) {
                    parameterTypes = method.getParameterTypes();
                }
            }
            Method method2 = cls.getMethod(methodData.getMethodName(), parameterTypes);
            registerMethod(methodData.getMethodName(), method2);
            return method2;
        } catch (NoSuchMethodException unused) {
            ALog.e(LOG_TAG, "jsCallMethod failed, NoSuchMethodException.");
            return null;
        }
    }

    protected void jsSendMessage(Object obj) {
        IMessageListener iMessageListener = this.iMessageListener_;
        if (iMessageListener != null) {
            this.bridgeManagerInstance.platformSendMessageResponse(this.bridgeName_, iMessageListener.onMessage(obj));
        }
    }

    protected void jsSendMethodResult(Object obj, String str, int i, String str2) {
        IMethodResult iMethodResult = this.iMethodResult_;
        if (iMethodResult == null) {
            return;
        }
        if (i == 0) {
            iMethodResult.onSuccess(obj);
        } else {
            iMethodResult.onError(str, i, str2);
        }
    }

    protected void jsSendMessageResponse(Object obj) {
        IMessageListener iMessageListener = this.iMessageListener_;
        if (iMessageListener != null) {
            iMessageListener.onMessageResponse(obj);
        }
    }

    protected void jsCancelMethod(String str) {
        IMethodResult iMethodResult = this.iMethodResult_;
        if (iMethodResult != null) {
            iMethodResult.onMethodCancel(str);
        }
    }
}
