package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes34.dex */
public class e2 extends RequestFinishedInfo.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14715a = "CronetEventListener";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f14716b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14717c = "unknown";

    public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        String str;
        Logger.v(f14715a, "onRequestFinished");
        if (requestFinishedInfo == null) {
            str = "requestInfo == null at onRequestFinished";
        } else {
            try {
                j2 j2VarA = a(requestFinishedInfo);
                if (j2VarA == null) {
                    Logger.e(f14715a, "fail to get CronetRequestTask from getAnnotations");
                    return;
                }
                i2 i2Var = (i2) j2VarA.getRequestFinishedInfo();
                if (i2Var == null) {
                    Logger.w(f14715a, "requestFinishedInfo == null at onRequestFinished");
                    return;
                } else {
                    a(requestFinishedInfo, i2Var, j2VarA.getResponseInfo());
                    j2VarA.a();
                    return;
                }
            } catch (Throwable th) {
                str = "onRequestFinished occur exception, exception name:" + th.getClass().getSimpleName();
            }
        }
        Logger.e(f14715a, str);
    }

    private void a(RequestFinishedInfo requestFinishedInfo, i2 i2Var, UrlResponseInfo urlResponseInfo) {
        if (requestFinishedInfo == null || i2Var == null || urlResponseInfo == null) {
            Logger.e(f14715a, "invalid parameters");
            return;
        }
        i2Var.setUrl(requestFinishedInfo.getUrl());
        i2Var.setException(requestFinishedInfo.getException());
        a(requestFinishedInfo.getMetrics(), i2Var.getMetricsTime());
        a(requestFinishedInfo.getMetrics(), requestFinishedInfo, i2Var.getMetrics());
    }

    private void a(RequestFinishedInfo.Metrics metrics, RequestFinishedInfo requestFinishedInfo, u2 u2Var) {
        if (metrics == null || requestFinishedInfo == null || u2Var == null) {
            Logger.e(f14715a, "invalid parameters");
            return;
        }
        u2Var.setRequestByteCount(metrics.getSentByteCount() == null ? 0L : metrics.getSentByteCount().longValue());
        u2Var.setResponseByteCount(metrics.getReceivedByteCount() != null ? metrics.getReceivedByteCount().longValue() : 0L);
        u2Var.setProtocol(requestFinishedInfo.getResponseInfo() == null ? "unknown" : requestFinishedInfo.getResponseInfo().getNegotiatedProtocol());
    }

    private void a(RequestFinishedInfo.Metrics metrics, v2 v2Var) {
        if (metrics == null || v2Var == null) {
            Logger.e(f14715a, "invalid parameters");
            return;
        }
        v2Var.setCallStartTime(metrics.getRequestStart() == null ? 0L : metrics.getRequestStart().getTime());
        v2Var.setCallEndTime(metrics.getRequestEnd() == null ? 0L : metrics.getRequestEnd().getTime());
        v2Var.setDnsStartTime(metrics.getDnsStart() == null ? 0L : metrics.getDnsStart().getTime());
        v2Var.setDnsEndTime(metrics.getDnsEnd() == null ? 0L : metrics.getDnsEnd().getTime());
        v2Var.setConnectStartTime(metrics.getConnectStart() == null ? 0L : metrics.getConnectStart().getTime());
        v2Var.setConnectEndTime(metrics.getConnectEnd() == null ? 0L : metrics.getConnectEnd().getTime());
        v2Var.setSecureConnectStartTime(metrics.getSslStart() == null ? 0L : metrics.getSslStart().getTime());
        v2Var.setSecureConnectEndTime(metrics.getSslEnd() == null ? 0L : metrics.getSslEnd().getTime());
        v2Var.setRequestHeadersStartTime(metrics.getSendingStart() == null ? 0L : metrics.getSendingStart().getTime());
        v2Var.setRequestHeadersEndTime(metrics.getSendingEnd() == null ? 0L : metrics.getSendingEnd().getTime());
        v2Var.setResponseHeadersStartTime(metrics.getResponseStart() == null ? 0L : metrics.getResponseStart().getTime());
        v2Var.setResponseBodyEndTime(metrics.getRequestEnd() == null ? 0L : metrics.getRequestEnd().getTime());
        if (v2Var instanceof i2.a) {
            i2.a aVar = (i2.a) v2Var;
            aVar.setTtfb(metrics.getTtfbMs() == null ? 0L : metrics.getTtfbMs().longValue());
            aVar.setTotalTime(metrics.getTotalTimeMs() != null ? metrics.getTotalTimeMs().longValue() : 0L);
        }
    }

    private j2 a(RequestFinishedInfo requestFinishedInfo) {
        Collection annotations = requestFinishedInfo.getAnnotations();
        Object obj = (annotations == null || annotations.isEmpty()) ? null : annotations.toArray()[0];
        if (!(obj instanceof j2)) {
            return null;
        }
        Logger.v(f14715a, "call getAnnotations return CronetRequestTask instance");
        return (j2) obj;
    }

    public e2(Executor executor) {
        super(executor);
    }
}
