package com.autonavi.base.ae.gmap;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;
import com.autonavi.base.amap.mapcore.maploader.AMapLoader;
import com.autonavi.base.amap.mapcore.maploader.NetworkState;
import com.autonavi.base.amap.mapcore.tools.GLConvertUtil;
import defpackage.f7t;
import defpackage.m2t;
import defpackage.pms;
import defpackage.zns;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public class NetworkProxyManager {
    private static NetworkProxyManager sInstance;
    private Context context;
    private IAMapDelegate mapDelegate;
    private NetworkProxy networkProxy;
    private NetworkState networkState;
    private String userAgent;
    private boolean isNetworkConnected = false;
    private Map<Long, AMapLoader> aMapLoaderHashtable = new ConcurrentHashMap();
    private Map<Long, GLMapEngine> engines = new ConcurrentHashMap();
    private boolean isOversea = false;
    private NetworkState.NetworkChangeListener networkChangeListener = new NetworkState.NetworkChangeListener() { // from class: com.autonavi.base.ae.gmap.NetworkProxyManager.1
        @Override // com.autonavi.base.amap.mapcore.maploader.NetworkState.NetworkChangeListener
        public void networkStateChanged(Context context) {
            NetworkProxyManager.this.isNetworkConnected = NetworkState.isNetworkConnected(context);
            Iterator it = NetworkProxyManager.this.engines.entrySet().iterator();
            while (it.hasNext()) {
                ((GLMapEngine) ((Map.Entry) it.next()).getValue()).setNetStatus(NetworkProxyManager.this.isNetworkConnected);
            }
        }
    };

    private synchronized void cancelAllAMapDownload() {
        try {
            Iterator it = new ConcurrentHashMap(this.aMapLoaderHashtable).entrySet().iterator();
            while (it.hasNext()) {
                ((AMapLoader) ((Map.Entry) it.next()).getValue()).doCancelAndNotify();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initNetworkState() {
        this.userAgent = System.getProperty("http.agent") + " amap/" + GlMapUtil.getAppVersionName(this.context);
        NetworkState networkState = new NetworkState();
        this.networkState = networkState;
        networkState.setNetworkListener(this.networkChangeListener);
        this.networkState.registerNetChangeReceiver(this.context.getApplicationContext(), true);
        this.isNetworkConnected = NetworkState.isNetworkConnected(this.context.getApplicationContext());
    }

    private static native void nativeCancelDownLoad(long j);

    private static native long nativeCreateNetworkProxy(Object obj);

    private static native void nativeDestroyNetworkProxy(long j);

    private static native void nativeFailedDownLoad(long j, int i);

    private static native void nativeFinishDownLoad(long j);

    private static native void nativeInitNetworkProxy(long j);

    private static native void nativeReceiveNetData(byte[] bArr, long j, int i);

    private static native void nativeSetOverseaEnable(long j, boolean z);

    private void releaseNetworkState() {
        NetworkState networkState = this.networkState;
        if (networkState != null) {
            networkState.registerNetChangeReceiver(this.context.getApplicationContext(), false);
            this.networkState.setNetworkListener(null);
            this.networkState = null;
        }
    }

    public NetworkProxy createNetworkProxy() {
        return new NetworkProxy(nativeCreateNetworkProxy(this));
    }

    public void destroy() {
        NetworkProxy networkProxy = this.networkProxy;
        if (networkProxy != null) {
            destroyNetworkProxy(networkProxy);
            this.networkProxy = null;
        }
        releaseNetworkState();
        this.context = null;
    }

    public void destroyNetworkProxy(NetworkProxy networkProxy) {
        nativeDestroyNetworkProxy(networkProxy.networkProxyInstance);
    }

    public synchronized void finishDownLoad(long j) {
        if (this.aMapLoaderHashtable.containsKey(Long.valueOf(j))) {
            nativeFinishDownLoad(j);
            this.aMapLoaderHashtable.remove(Long.valueOf(j));
        }
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public void init() {
        NetworkProxy networkProxyCreateNetworkProxy = createNetworkProxy();
        this.networkProxy = networkProxyCreateNetworkProxy;
        initNetworkProxy(networkProxyCreateNetworkProxy);
        initNetworkState();
    }

    public void initContext(Context context) {
        if (context == null) {
            return;
        }
        this.context = context.getApplicationContext();
    }

    public void initNetworkProxy(NetworkProxy networkProxy) {
        nativeInitNetworkProxy(networkProxy.networkProxyInstance);
    }

    public boolean isLocationOversea() {
        return this.isOversea;
    }

    public boolean isNetworkConnected() {
        return this.isNetworkConnected;
    }

    public boolean isOverseaAuthed() {
        IAMapDelegate iAMapDelegate = this.mapDelegate;
        return iAMapDelegate != null && iAMapDelegate.isOverseaAuthed();
    }

    public boolean isReady() {
        return (this.context == null || this.networkProxy == null || this.networkState == null) ? false : true;
    }

    public synchronized void netCancel(long j, int i) {
        if (this.aMapLoaderHashtable.containsKey(Long.valueOf(j))) {
            nativeFailedDownLoad(j, -1);
            this.aMapLoaderHashtable.remove(Long.valueOf(j));
        }
    }

    public synchronized void netError(long j, int i, int i2) {
        if (this.aMapLoaderHashtable.containsKey(Long.valueOf(j))) {
            nativeFailedDownLoad(j, i2);
            this.aMapLoaderHashtable.remove(Long.valueOf(j));
            try {
                if (MapsInitializer.getExceptionLogger() != null) {
                    MapsInitializer.getExceptionLogger().onDownloaderException(i, i2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void netStop(long j, int i) {
        if (this.aMapLoaderHashtable.containsKey(Long.valueOf(j))) {
            nativeFailedDownLoad(j, -1);
            this.aMapLoaderHashtable.remove(Long.valueOf(j));
        }
    }

    public void notifyMapEngineCreated(long j, GLMapEngine gLMapEngine, IAMapDelegate iAMapDelegate) {
        this.mapDelegate = iAMapDelegate;
        this.engines.put(Long.valueOf(j), gLMapEngine);
    }

    public void notifyMapEngineDestroyed(long j) {
        this.engines.remove(Long.valueOf(j));
        cancelAllAMapDownload();
    }

    public synchronized void receiveNetData(long j, byte[] bArr, int i) {
        if (this.aMapLoaderHashtable.containsKey(Long.valueOf(j))) {
            nativeReceiveNetData(bArr, j, i);
        }
    }

    public synchronized int requireMapDataAsyn(int i, byte[] bArr) {
        if (bArr != null) {
            AMapLoader.ADataRequestParam aDataRequestParam = new AMapLoader.ADataRequestParam();
            int i2 = GLConvertUtil.getInt(bArr, 0);
            aDataRequestParam.requestBaseUrl = GLConvertUtil.getString(bArr, 4, i2);
            int i3 = GLConvertUtil.getInt(bArr, i2 + 4);
            int i4 = i2 + 8;
            aDataRequestParam.requestUrl = GLConvertUtil.getSubBytes(bArr, i4, i3);
            int i5 = i4 + i3;
            int i6 = GLConvertUtil.getInt(bArr, i5);
            int i7 = i5 + 4;
            aDataRequestParam.headers = zns.B(GLConvertUtil.getString(bArr, i7, i6), "=>");
            int i8 = i7 + i6;
            int i9 = GLConvertUtil.getInt(bArr, i8);
            int i10 = i8 + 4;
            aDataRequestParam.queries = zns.B(GLConvertUtil.getString(bArr, i10, i9), "=>");
            int i11 = i10 + i9;
            int i12 = GLConvertUtil.getInt(bArr, i11);
            int i13 = i11 + 4;
            aDataRequestParam.signs = zns.a0(GLConvertUtil.getString(bArr, i13, i12));
            int i14 = i13 + i12;
            aDataRequestParam.handler = GLConvertUtil.getLong(bArr, i14);
            int i15 = GLConvertUtil.getInt(bArr, i14 + 8);
            int i16 = i14 + 12;
            aDataRequestParam.enCodeString = GLConvertUtil.getSubBytes(bArr, i16, i15);
            int i17 = i16 + i15;
            aDataRequestParam.nRequestType = GLConvertUtil.getInt(bArr, i17);
            aDataRequestParam.nCompress = GLConvertUtil.getInt(bArr, i17 + 4);
            aDataRequestParam.bodyType = GLConvertUtil.getInt(bArr, i17 + 8);
            final AMapLoader aMapLoader = new AMapLoader(this.context, aDataRequestParam, this);
            this.aMapLoaderHashtable.put(Long.valueOf(aDataRequestParam.handler), aMapLoader);
            try {
                pms.a().b(new f7t() { // from class: com.autonavi.base.ae.gmap.NetworkProxyManager.2
                    @Override // defpackage.f7t
                    public void runTask() {
                        try {
                            aMapLoader.doRequest();
                        } catch (Throwable th) {
                            m2t.r(th, "download Thread", "AMapLoader doRequest");
                            zns.E(th);
                        }
                    }
                });
            } catch (Throwable th) {
                m2t.r(th, "download Thread", "requireMapData");
                zns.E(th);
            }
        }
        return 0;
    }

    public void setLocationOversea(boolean z) {
        this.isOversea = z;
    }

    public void setOverseaEnable(boolean z) {
        NetworkProxy networkProxy = this.networkProxy;
        if (networkProxy != null) {
            long j = networkProxy.networkProxyInstance;
            if (j == 0) {
                return;
            }
            nativeSetOverseaEnable(j, z);
        }
    }
}
