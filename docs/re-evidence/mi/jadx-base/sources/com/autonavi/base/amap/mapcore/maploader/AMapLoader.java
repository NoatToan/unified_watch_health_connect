package com.autonavi.base.amap.mapcore.maploader;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.c1;
import com.amap.api.col.p0003sl.iu;
import com.amap.api.col.p0003sl.l;
import com.amap.api.col.p0003sl.la;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.ae.gmap.NetworkProxyManager;
import defpackage.cos;
import defpackage.e0t;
import defpackage.g0t;
import defpackage.gos;
import defpackage.gv5;
import defpackage.h0t;
import defpackage.j0t;
import defpackage.jos;
import defpackage.m0t;
import defpackage.m2t;
import defpackage.o0t;
import defpackage.p0t;
import defpackage.zns;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class AMapLoader implements c1.a {
    private static final int GET_METHOD = 0;
    private static final String NETWORK_RESPONSE_CODE_STRING = "网络异常状态码：";
    private Context context;
    private c1 downloadManager;
    private volatile boolean isCanceled;
    private ADataRequestParam mDataRequestParam;
    private NetworkProxyManager networkProxyManager;
    private long requestMapDataTimestamp = 0;
    private long requestMapDataPackageSize = 0;

    public static class ADataRequestParam {
        public int bodyType;
        public byte[] enCodeString;
        public long handler;
        public int nCompress;
        public int nRequestType;
        public String requestBaseUrl;
        public byte[] requestUrl;
        public Map<String, String> headers = new HashMap();
        public Map<String, String> queries = new HashMap();
        public List<String> signs = new ArrayList();

        public String toString() {
            return "ADataRequestParam{requestBaseUrl='" + this.requestBaseUrl + "', requestUrl='" + this.requestUrl + "', headers=" + this.headers + ", queries=" + this.queries + ", signs=" + this.signs + ", handler=" + this.handler + ", nRequestType=" + this.nRequestType + ", enCodeString=" + Arrays.toString(this.enCodeString) + ", nCompress=" + this.nCompress + ", bodyType=" + this.bodyType + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static abstract class AMapDownloadRequest extends l {
        protected final Context context;
        protected ADataRequestParam dataRequestParam;
        protected String userAgent;
        protected String url = buildUrl();
        protected byte[] postEntityBytes = buildParams();

        public AMapDownloadRequest(Context context, String str, ADataRequestParam aDataRequestParam) {
            this.context = context;
            this.userAgent = str;
            this.dataRequestParam = aDataRequestParam;
            this.isPostFlag = aDataRequestParam.nRequestType == RequestType.POST.ordinal();
        }

        public abstract byte[] buildParams();

        public abstract String buildUrl();

        @Override // com.amap.api.col.p0003sl.la
        public byte[] getEntityBytes() {
            return this.postEntityBytes;
        }

        @Override // com.amap.api.col.p0003sl.la
        public String getIPV6URL() {
            return zns.y(getURL());
        }

        @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
        public Map<String, String> getParams() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public Map<String, String> getRequestHead() {
            o0t o0tVarT = zns.t();
            String strE = o0tVarT != null ? o0tVarT.e() : null;
            String strK = e0t.k(this.context);
            try {
                strK = URLEncoder.encode(strK, "UTF-8");
            } catch (Throwable unused) {
            }
            Hashtable hashtable = new Hashtable(16);
            hashtable.put("User-Agent", this.userAgent);
            hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strE, "3dmap"));
            hashtable.put("x-INFO", g0t.b(this.context));
            hashtable.put("key", strK);
            hashtable.put("logversion", "2.1");
            hashtable.putAll(this.dataRequestParam.headers);
            return hashtable;
        }

        @Override // com.amap.api.col.p0003sl.la
        public String getURL() {
            return this.url;
        }

        @Override // com.amap.api.col.p0003sl.la
        public boolean isSupportIPV6() {
            return true;
        }
    }

    public static class AMapM5DownloadRequest extends AMapDownloadRequest {
        public AMapM5DownloadRequest(Context context, String str, ADataRequestParam aDataRequestParam) {
            super(context, str, aDataRequestParam);
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest
        public byte[] buildParams() {
            String strReplaceAll = new String(this.dataRequestParam.requestUrl).replaceAll(";", AMapLoader.getEncodeRequestParams(";"));
            StringBuilder sb = new StringBuilder(strReplaceAll);
            sb.append("&channel=amap7&div=GNaviMap");
            sb.append("&diu=");
            sb.append(h0t.n(this.context));
            if (!strReplaceAll.contains("&sign=")) {
                String strGenerateAosSign = AMapLoader.generateAosSign(this.dataRequestParam.signs, sb.toString());
                if (!TextUtils.isEmpty(strGenerateAosSign)) {
                    sb.append("&sign=");
                    sb.append(strGenerateAosSign.toUpperCase());
                }
            }
            return sb.toString().getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest
        public String buildUrl() {
            String str = this.dataRequestParam.requestBaseUrl;
            if (!str.endsWith("?")) {
                str = str + "?";
            }
            StringBuilder sb = new StringBuilder();
            if (this.dataRequestParam.nRequestType == RequestType.POST.ordinal()) {
                sb.append("csid=");
                sb.append(UUID.randomUUID().toString());
            }
            return str + AMapLoader.generateQueryString(this.context, sb.toString());
        }
    }

    public static class AMapMpsDownloadRequest extends AMapDownloadRequest {
        public AMapMpsDownloadRequest(Context context, String str, ADataRequestParam aDataRequestParam) {
            super(context, str, aDataRequestParam);
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest
        public byte[] buildParams() {
            StringBuilder sb = new StringBuilder(new String(this.dataRequestParam.requestUrl).replaceAll(";", AMapLoader.getEncodeRequestParams(";")));
            sb.append("&div=GNaviMap");
            sb.append("&channel=amapapi");
            sb.append("&diu=");
            sb.append(h0t.n(this.context));
            String strGenerateAosSign = AMapLoader.generateAosSign(this.dataRequestParam.signs, sb.toString());
            if (!TextUtils.isEmpty(strGenerateAosSign)) {
                sb.append("&sign=");
                sb.append(strGenerateAosSign.toUpperCase());
            }
            return sb.toString().getBytes();
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest
        public String buildUrl() {
            String str = this.dataRequestParam.requestBaseUrl;
            if (!str.endsWith("?")) {
                str = str + "?";
            }
            StringBuilder sb = new StringBuilder();
            if (this.dataRequestParam.nRequestType == RequestType.POST.ordinal()) {
                sb.append("csid=");
                sb.append(UUID.randomUUID().toString());
            }
            return str + AMapLoader.generateQueryString(this.context, sb.toString());
        }
    }

    public static class AMapRenderDownloadRequest extends AMapDownloadRequest {
        public AMapRenderDownloadRequest(Context context, String str, ADataRequestParam aDataRequestParam) {
            super(context, str, aDataRequestParam);
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest
        public byte[] buildParams() {
            if (this.dataRequestParam.bodyType == RequestBodyType.CUSTOM.ordinal()) {
                byte[] bArrA = cos.a(new String(this.dataRequestParam.requestUrl).getBytes(), p0t.t("KTFhsdldhb3NNY0pDSndWbg==").getBytes());
                if (bArrA != null) {
                    return j0t.f(bArrA).getBytes(StandardCharsets.UTF_8);
                }
            } else {
                RequestBodyType.FORM.ordinal();
            }
            return new byte[0];
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest
        public String buildUrl() {
            String strEncode;
            String str = this.dataRequestParam.requestBaseUrl;
            if (!str.endsWith("?")) {
                str = str + "?";
            }
            StringBuilder sb = new StringBuilder();
            if (this.dataRequestParam.nRequestType == RequestType.POST.ordinal()) {
                sb.append("csid=");
                sb.append(UUID.randomUUID().toString());
            }
            if (this.dataRequestParam.bodyType != RequestBodyType.CUSTOM.ordinal()) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("channel=amap7&div=GNaviMap");
            sb2.append("&diu=");
            sb2.append(h0t.n(this.context));
            String strGenerateAosSign = AMapLoader.generateAosSign(this.dataRequestParam.signs, sb2.toString());
            if (!TextUtils.isEmpty(strGenerateAosSign)) {
                sb2.append("&sign=");
                sb2.append(strGenerateAosSign.toUpperCase());
            }
            try {
                strEncode = URLEncoder.encode(j0t.f(cos.a(sb2.toString().getBytes(), p0t.t("KTFhsdldhb3NNY0pDSndWbg==").getBytes())), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                strEncode = null;
            }
            if (strEncode != null) {
                sb.append("&in=");
                sb.append(strEncode);
            }
            sb.append("&ent=2");
            return str + AMapLoader.generateQueryString(this.context, sb.toString());
        }
    }

    public static class AMapRestRequest extends AMapDownloadRequest {
        public AMapRestRequest(Context context, String str, ADataRequestParam aDataRequestParam) {
            super(context, str, aDataRequestParam);
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest
        public byte[] buildParams() {
            return this.dataRequestParam.requestUrl;
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest
        public String buildUrl() {
            String str;
            String str2;
            String[] strArrSplit = this.dataRequestParam.requestBaseUrl.split("\\?");
            if (strArrSplit.length > 1) {
                str = strArrSplit[0];
                str2 = strArrSplit[1];
            } else {
                str = strArrSplit[0];
                str2 = "";
            }
            return str + "?" + AMapLoader.generateQueryString(this.context, (str2 + "&adiu=" + h0t.n(this.context)) + "&div=GNaviMap");
        }

        @Override // com.autonavi.base.amap.mapcore.maploader.AMapLoader.AMapDownloadRequest, com.amap.api.col.p0003sl.la
        public Map<String, String> getRequestHead() {
            return super.getRequestHead();
        }
    }

    public enum RequestBodyType {
        CUSTOM,
        FORM
    }

    public enum RequestType {
        GET,
        POST
    }

    public AMapLoader(Context context, ADataRequestParam aDataRequestParam, NetworkProxyManager networkProxyManager) {
        this.isCanceled = false;
        this.context = context.getApplicationContext();
        this.mDataRequestParam = aDataRequestParam;
        this.networkProxyManager = networkProxyManager;
        this.isCanceled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateAosSign(List<String> list, String str) {
        String strT = p0t.t("QMTA3MWEyYTRlM2d0ZTJVYzMyY1kzYTk4VGYzM0gxYzRHYzIzZg==");
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapB = zns.B(str, "=");
        for (String str2 : list) {
            if (mapB.containsKey(str2)) {
                arrayList.add(mapB.get(str2));
            }
        }
        return generateAosSignInternal(arrayList, strT);
    }

    private static String generateAosSignInternal(List<String> list, String str) {
        StringBuilder sb = new StringBuilder("");
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(str);
            return m0t.e(sb.toString());
        } catch (Throwable th) {
            m2t.r(th, "AbstractProtocalHandler", "generateAosSignInternal");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateQueryString(Context context, String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        String strK = e0t.k(context);
        try {
            strK = URLEncoder.encode(strK, "UTF-8");
        } catch (Throwable unused) {
        }
        stringBuffer.append("&key=");
        stringBuffer.append(strK);
        stringBuffer.append("&dip=16300");
        String strSortReEncoderParams = sortReEncoderParams(stringBuffer.toString());
        String strA = g0t.a();
        stringBuffer.append("&ts=".concat(String.valueOf(strA)));
        stringBuffer.append("&scode=" + g0t.c(context, strA, strSortReEncoderParams));
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getEncodeRequestParams(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getNetworkFailedReason(String str) {
        return !this.networkProxyManager.isNetworkConnected() ? "无网络" : str;
    }

    private void onCancel() {
        ADataRequestParam aDataRequestParam = this.mDataRequestParam;
        if (aDataRequestParam != null) {
            this.networkProxyManager.netCancel(aDataRequestParam.handler, -1);
        }
    }

    private static String sortReEncoderParams(String str) {
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        Arrays.sort(strArrSplit);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(strReEncoder(str2));
            stringBuffer.append(gv5.CONNECT_STR);
        }
        String string = stringBuffer.toString();
        return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
    }

    private void staticNetworkPerformance() {
    }

    private static String strReEncoder(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            m2t.r(e, "AbstractProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e2) {
            m2t.r(e2, "AbstractProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    public void doCancel() {
        if (this.downloadManager == null || this.isCanceled) {
            return;
        }
        synchronized (this.downloadManager) {
            try {
                this.isCanceled = true;
                this.downloadManager.a();
            } catch (Throwable th) {
                m2t.r(th, "AMapLoader", "doCancel");
            }
        }
    }

    public void doCancelAndNotify() {
        onCancel();
        doCancel();
    }

    public void doRequest() {
        la aMapRestRequest;
        if (iu.a(this.context, zns.t()).f6352a != iu.c.SuccessCode) {
            ADataRequestParam aDataRequestParam = this.mDataRequestParam;
            if (aDataRequestParam != null) {
                this.networkProxyManager.netError(aDataRequestParam.handler, -1, -1);
                return;
            }
            return;
        }
        if (this.isCanceled) {
            ADataRequestParam aDataRequestParam2 = this.mDataRequestParam;
            if (aDataRequestParam2 != null) {
                this.networkProxyManager.netError(aDataRequestParam2.handler, -1, -1);
                return;
            }
            return;
        }
        if (MapsInitializer.isLoadWorldVectorMap() && this.networkProxyManager.isLocationOversea() && !this.networkProxyManager.isOverseaAuthed()) {
            ADataRequestParam aDataRequestParam3 = this.mDataRequestParam;
            if (aDataRequestParam3 != null) {
                this.networkProxyManager.netError(aDataRequestParam3.handler, -1, -1);
                return;
            }
            return;
        }
        String str = this.mDataRequestParam.requestBaseUrl;
        if (str.contains("http://mpsapi.amap.com/")) {
            aMapRestRequest = new AMapMpsDownloadRequest(this.context, this.networkProxyManager.getUserAgent(), this.mDataRequestParam);
        } else if (str.contains("http://m5.amap.com")) {
            aMapRestRequest = new AMapM5DownloadRequest(this.context, this.networkProxyManager.getUserAgent(), this.mDataRequestParam);
        } else if (str.contains("http://render.amap.com/")) {
            aMapRestRequest = new AMapRenderDownloadRequest(this.context, this.networkProxyManager.getUserAgent(), this.mDataRequestParam);
        } else {
            aMapRestRequest = str.contains("http://restsdk.amap.com/") ? new AMapRestRequest(this.context, this.networkProxyManager.getUserAgent(), this.mDataRequestParam) : null;
        }
        la laVar = aMapRestRequest;
        if (laVar == null) {
            ADataRequestParam aDataRequestParam4 = this.mDataRequestParam;
            if (aDataRequestParam4 != null) {
                this.networkProxyManager.netError(aDataRequestParam4.handler, -1, -1);
                return;
            }
            return;
        }
        try {
            laVar.setConnectionTimeout(30000);
            laVar.setSoTimeout(30000);
            this.requestMapDataTimestamp = System.currentTimeMillis();
            this.requestMapDataPackageSize = laVar.getEntityBytes() == null ? 0L : laVar.getEntityBytes().length;
            c1 c1Var = new c1(laVar, 0L, -1L, MapsInitializer.getProtocol() == 2);
            this.downloadManager = c1Var;
            c1Var.b(this);
            doCancel();
        } catch (Throwable th) {
            try {
                onException(th);
            } finally {
                doCancel();
            }
        }
    }

    @Override // com.amap.api.col.3sl.c1.a
    public void onDownload(byte[] bArr, long j) {
        ADataRequestParam aDataRequestParam;
        if (bArr == null || (aDataRequestParam = this.mDataRequestParam) == null) {
            return;
        }
        this.networkProxyManager.receiveNetData(aDataRequestParam.handler, bArr, bArr.length);
    }

    @Override // com.amap.api.col.3sl.c1.a
    public void onException(Throwable th) {
        int iIndexOf;
        try {
            String str = new String(th.getMessage().getBytes("UTF-8"), "UTF-8");
            int i = (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(NETWORK_RESPONSE_CODE_STRING)) == -1) ? -1 : Integer.parseInt(str.substring(iIndexOf + 8));
            ADataRequestParam aDataRequestParam = this.mDataRequestParam;
            if (aDataRequestParam != null) {
                this.networkProxyManager.netError(aDataRequestParam.handler, -1, i);
            }
        } catch (Throwable unused) {
            ADataRequestParam aDataRequestParam2 = this.mDataRequestParam;
            if (aDataRequestParam2 != null) {
                this.networkProxyManager.netError(aDataRequestParam2.handler, -1, -1);
            }
        }
        m2t.r(th, "AMapLoader", "download onException");
        jos.l(gos.e, "map loader exception " + th.getMessage());
    }

    @Override // com.amap.api.col.3sl.c1.a
    public void onFinish() {
        ADataRequestParam aDataRequestParam = this.mDataRequestParam;
        if (aDataRequestParam != null) {
            this.networkProxyManager.finishDownLoad(aDataRequestParam.handler);
        }
        staticNetworkPerformance();
    }

    @Override // com.amap.api.col.3sl.c1.a
    public void onStop() {
        ADataRequestParam aDataRequestParam = this.mDataRequestParam;
        if (aDataRequestParam != null) {
            this.networkProxyManager.netStop(aDataRequestParam.handler, -1);
        }
        staticNetworkPerformance();
    }
}
