package com.autonavi.base.amap.mapcore.maploader;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import com.amap.api.mapcore.util.dq;
import com.amap.api.mapcore.util.ep;
import com.amap.api.mapcore.util.er;
import com.amap.api.mapcore.util.ew;
import com.amap.api.mapcore.util.ex;
import com.amap.api.mapcore.util.gj;
import com.amap.api.mapcore.util.gm;
import com.amap.api.mapcore.util.gn;
import com.amap.api.mapcore.util.gt;
import com.amap.api.mapcore.util.hn;
import com.amap.api.mapcore.util.im;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.ae.gmap.GLMapEngine;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class AMapLoader implements im.a {
    private static final int GET_METHOD = 0;
    private static final String NETWORK_RESPONSE_CODE_STRING = "网络异常状态码：";
    private static String mDiu;
    private im downloadManager;
    public ADataRequestParam mDataRequestParam;
    private int mEngineID;
    public GLMapEngine mGLMapEngine;
    private boolean mRequestCancel;
    private volatile boolean isCanceled = false;
    private long requestMapDataTimestamp = 0;
    private long requestMapDataPackageSize = 0;

    public static class ADataRequestParam {
        public byte[] enCodeString;
        public long handler;
        public int nCompress;
        public int nRequestType;
        public String requestBaseUrl;
        public String requestUrl;
    }

    public static class AMapGridDownloadRequest extends dq {
        private final Context mContext;
        private byte[] postEntityBytes;
        private String sUrl;
        private String userAgent;

        public AMapGridDownloadRequest(Context context, String str, String str2) {
            this.mContext = context;
            this.sUrl = str;
            this.userAgent = str2;
        }

        @Override // com.amap.api.mapcore.util.ir
        public byte[] getEntityBytes() {
            return this.postEntityBytes;
        }

        @Override // com.amap.api.mapcore.util.ir
        public String getIPV6URL() {
            return er.a(getURL());
        }

        @Override // com.amap.api.mapcore.util.dq, com.amap.api.mapcore.util.ir
        public Map<String, String> getParams() {
            return null;
        }

        @Override // com.amap.api.mapcore.util.ir
        public Map<String, String> getRequestHead() {
            gt gtVarF = er.f();
            String strB = gtVarF != null ? gtVarF.b() : null;
            String strF = gj.f(this.mContext);
            try {
                strF = URLEncoder.encode(strF, "UTF-8");
            } catch (Throwable unused) {
            }
            Hashtable hashtable = new Hashtable(16);
            hashtable.put("User-Agent", this.userAgent);
            hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strB, "3dmap"));
            hashtable.put("x-INFO", gm.a(this.mContext));
            hashtable.put("key", strF);
            hashtable.put("logversion", "2.1");
            return hashtable;
        }

        @Override // com.amap.api.mapcore.util.ir
        public String getURL() {
            return this.sUrl;
        }

        @Override // com.amap.api.mapcore.util.ir
        public boolean isSupportIPV6() {
            return true;
        }

        public void setPostEntityBytes(byte[] bArr) {
            this.postEntityBytes = bArr;
        }
    }

    public AMapLoader(int i, GLMapEngine gLMapEngine, ADataRequestParam aDataRequestParam) {
        this.mEngineID = 0;
        this.mRequestCancel = false;
        this.mDataRequestParam = aDataRequestParam;
        this.mEngineID = i;
        this.mGLMapEngine = gLMapEngine;
        this.mRequestCancel = false;
    }

    private String generateQueryString(Context context, String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        String strF = gj.f(this.mGLMapEngine.getContext());
        try {
            strF = URLEncoder.encode(strF, "UTF-8");
        } catch (Throwable unused) {
        }
        stringBuffer.append("&key=");
        stringBuffer.append(strF);
        String strSortReEncoderParams = sortReEncoderParams(stringBuffer.toString());
        String strA = gm.a();
        stringBuffer.append("&ts=".concat(String.valueOf(strA)));
        stringBuffer.append("&scode=" + gm.a(context, strA, strSortReEncoderParams));
        stringBuffer.append("&dip=16300");
        return stringBuffer.toString();
    }

    private String getEncodeRequestParams(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getNetworkFailedReason(String str) {
        return !this.mGLMapEngine.isNetworkConnected() ? "无网络" : str;
    }

    private String sortReEncoderParams(String str) {
        String[] strArrSplit = str.split(a.l);
        Arrays.sort(strArrSplit);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(strReEncoder(str2));
            stringBuffer.append(a.l);
        }
        String string = stringBuffer.toString();
        return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
    }

    private void staticNetworkPerformance() {
        GLMapEngine gLMapEngine = this.mGLMapEngine;
        if (gLMapEngine != null) {
            ep.a(gLMapEngine.getContext(), this.mGLMapEngine.hashCode(), System.currentTimeMillis() - this.requestMapDataTimestamp, this.requestMapDataPackageSize);
        }
    }

    private String strReEncoder(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            hn.c(e, "AbstractProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e2) {
            hn.c(e2, "AbstractProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    public void doCancel() {
        this.mRequestCancel = true;
        if (this.downloadManager == null || this.isCanceled) {
            return;
        }
        synchronized (this.downloadManager) {
            try {
                this.isCanceled = true;
                this.downloadManager.a();
                this.mGLMapEngine.setMapLoaderToTask(this.mEngineID, this.mDataRequestParam.handler, null);
            } catch (Throwable th) {
                hn.c(th, "AMapLoader", "doCancel");
            }
        }
    }

    public void doRequest() {
        if (this.mRequestCancel) {
            return;
        }
        ADataRequestParam aDataRequestParam = this.mDataRequestParam;
        String str = aDataRequestParam.requestBaseUrl;
        String str2 = aDataRequestParam.requestUrl;
        if (!str.endsWith("?")) {
            str = str + "?";
        }
        String requestParams = getRequestParams(str2.replaceAll(";", getEncodeRequestParams(";").toString()), str != null && str.contains("http://m5.amap.com/"), this.mDataRequestParam.nRequestType);
        StringBuffer stringBuffer = new StringBuffer();
        if (this.mDataRequestParam.nRequestType == 0) {
            stringBuffer.append(requestParams);
            stringBuffer.append("&csid=" + UUID.randomUUID().toString());
        } else {
            stringBuffer.append("csid=" + UUID.randomUUID().toString());
        }
        try {
            AMapGridDownloadRequest aMapGridDownloadRequest = new AMapGridDownloadRequest(this.mGLMapEngine.getContext(), str + generateQueryString(this.mGLMapEngine.getContext(), stringBuffer.toString()), this.mGLMapEngine.getUserAgent());
            aMapGridDownloadRequest.setConnectionTimeout(30000);
            aMapGridDownloadRequest.setSoTimeout(30000);
            if (this.mDataRequestParam.nRequestType != 0) {
                aMapGridDownloadRequest.setPostEntityBytes(requestParams.getBytes("UTF-8"));
            }
            this.requestMapDataTimestamp = System.currentTimeMillis();
            this.requestMapDataPackageSize = aMapGridDownloadRequest.getEntityBytes() == null ? 0L : aMapGridDownloadRequest.getEntityBytes().length;
            im imVar = new im(aMapGridDownloadRequest, 0L, -1L, MapsInitializer.getProtocol() == 2);
            this.downloadManager = imVar;
            imVar.a(this);
            doCancel();
        } catch (Throwable th) {
            try {
                onException(th);
            } finally {
                doCancel();
            }
        }
    }

    public String getDeviceId(Context context) {
        if (context != null) {
            return gn.u(context);
        }
        return null;
    }

    public String getRequestParams(String str, boolean z, int i) {
        if (mDiu == null) {
            mDiu = getDeviceId(this.mGLMapEngine.getContext());
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        if (z) {
            stringBuffer.append("&channel=amap7&div=GNaviMap");
            stringBuffer.append("&diu=");
            stringBuffer.append(mDiu);
        } else {
            stringBuffer.append("&channel=amapapi");
            stringBuffer.append("&div=GNaviMap");
            stringBuffer.append("&diu=");
            stringBuffer.append(mDiu);
        }
        return stringBuffer.toString();
    }

    @Override // com.amap.api.mapcore.util.im.a
    public void onDownload(byte[] bArr, long j) {
        GLMapEngine gLMapEngine;
        ADataRequestParam aDataRequestParam;
        if (bArr == null || (gLMapEngine = this.mGLMapEngine) == null || (aDataRequestParam = this.mDataRequestParam) == null) {
            return;
        }
        gLMapEngine.receiveNetData(this.mEngineID, aDataRequestParam.handler, bArr, bArr.length);
    }

    @Override // com.amap.api.mapcore.util.im.a
    public void onException(Throwable th) {
        GLMapEngine gLMapEngine;
        ADataRequestParam aDataRequestParam;
        ADataRequestParam aDataRequestParam2;
        int iIndexOf;
        try {
            String str = new String(th.getMessage().getBytes("UTF-8"), "UTF-8");
            int i = (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(NETWORK_RESPONSE_CODE_STRING)) == -1) ? -1 : Integer.parseInt(str.substring(iIndexOf + 8));
            GLMapEngine gLMapEngine2 = this.mGLMapEngine;
            if (gLMapEngine2 != null && (aDataRequestParam2 = this.mDataRequestParam) != null) {
                gLMapEngine2.netError(this.mEngineID, aDataRequestParam2.handler, -1, i);
            }
            gLMapEngine = this.mGLMapEngine;
            if (gLMapEngine != null) {
                ep.a(gLMapEngine.getContext(), this.mGLMapEngine.hashCode(), !this.mGLMapEngine.isNetworkConnected() ? 1 : 0, getNetworkFailedReason(th.getMessage()));
            }
        } catch (Throwable unused) {
            GLMapEngine gLMapEngine3 = this.mGLMapEngine;
            if (gLMapEngine3 != null && (aDataRequestParam = this.mDataRequestParam) != null) {
                gLMapEngine3.netError(this.mEngineID, aDataRequestParam.handler, -1, -1);
            }
            gLMapEngine = this.mGLMapEngine;
            if (gLMapEngine != null) {
            }
        }
        hn.c(th, "AMapLoader", "download onException");
        ex.b(ew.e, "map loader exception " + th.getMessage());
    }

    @Override // com.amap.api.mapcore.util.im.a
    public void onFinish() {
        ADataRequestParam aDataRequestParam;
        GLMapEngine gLMapEngine = this.mGLMapEngine;
        if (gLMapEngine != null && (aDataRequestParam = this.mDataRequestParam) != null) {
            gLMapEngine.finishDownLoad(this.mEngineID, aDataRequestParam.handler);
        }
        staticNetworkPerformance();
    }

    @Override // com.amap.api.mapcore.util.im.a
    public void onStop() {
        ADataRequestParam aDataRequestParam;
        GLMapEngine gLMapEngine = this.mGLMapEngine;
        if (gLMapEngine != null && (aDataRequestParam = this.mDataRequestParam) != null) {
            gLMapEngine.netStop(this.mEngineID, aDataRequestParam.handler, -1);
        }
        staticNetworkPerformance();
    }
}
