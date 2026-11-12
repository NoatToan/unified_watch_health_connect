package com.miui.tsmclient.common.net;

/* JADX INFO: loaded from: classes4.dex */
public class HttpLifecycleManager implements IHttpLifecycleListener {
    private static volatile HttpLifecycleManager sInstance;
    private IHttpLifecycleListener mHttpLifecycleListener;

    private HttpLifecycleManager() {
    }

    public static HttpLifecycleManager getInstance() {
        if (sInstance == null) {
            synchronized (HttpLifecycleManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new HttpLifecycleManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // com.miui.tsmclient.common.net.IHttpLifecycleListener
    public void onStart(String str) {
        IHttpLifecycleListener iHttpLifecycleListener = this.mHttpLifecycleListener;
        if (iHttpLifecycleListener != null) {
            iHttpLifecycleListener.onStart(str);
        }
    }

    @Override // com.miui.tsmclient.common.net.IHttpLifecycleListener
    public void onStop(String str, int i) {
        IHttpLifecycleListener iHttpLifecycleListener = this.mHttpLifecycleListener;
        if (iHttpLifecycleListener != null) {
            iHttpLifecycleListener.onStop(str, i);
        }
    }

    public void setHttpLifecycleListener(IHttpLifecycleListener iHttpLifecycleListener) {
        this.mHttpLifecycleListener = iHttpLifecycleListener;
    }
}
