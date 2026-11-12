package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.google.common.net.HttpHeaders;
import com.huami.watch.companion.esim.AbsEsimOperation;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

/* JADX INFO: loaded from: classes2.dex */
public class BasicNetwork implements Network {
    public static final boolean DEBUG = VolleyLog.DEBUG;
    private static int a = 3000;
    private static int b = 4096;
    public final HttpStack mHttpStack;
    public final ByteArrayPool mPool;

    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(b));
    }

    private void a(Map<String, String> map, Cache.Entry entry) {
        if (entry == null) {
            return;
        }
        String str = entry.etag;
        if (str != null) {
            map.put(HttpHeaders.IF_NONE_MATCH, str);
        }
        if (entry.lastModified > 0) {
            map.put("If-Modified-Since", DateUtils.formatDate(new Date(entry.lastModified)));
        }
    }

    private static void b(String str, Request<?> request, VolleyError volleyError) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(volleyError);
            request.addMarker(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    private byte[] c(HttpEntity httpEntity) throws ServerError, IOException {
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(this.mPool, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new ServerError();
            }
            byte[] buf = this.mPool.getBuf(1024);
            while (true) {
                int i = content.read(buf);
                if (i == -1) {
                    break;
                }
                poolingByteArrayOutputStream.write(buf, 0, i);
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException unused) {
                VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
            }
            this.mPool.returnBuf(buf);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException unused2) {
                VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
            }
            this.mPool.returnBuf(null);
            poolingByteArrayOutputStream.close();
            throw th;
        }
    }

    public static Map<String, String> convertHeaders(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private void d(long j, Request<?> request, byte[] bArr, StatusLine statusLine) {
        if (DEBUG || j > a) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
            VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    public void logError(String str, String str2, long j) {
        VolleyLog.v("HTTP ERROR(%s) %d ms to fetch %s", str, Long.valueOf(SystemClock.elapsedRealtime() - j), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.android.volley.toolbox.BasicNetwork] */
    @Override // com.android.volley.Network
    public NetworkResponse performRequest(Request<?> request) throws VolleyError {
        ?? r17;
        HttpResponse httpResponsePerformRequest;
        byte[] bArr;
        byte[] bArrC;
        ?? r1;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Map<String, String> mapEmptyMap = Collections.emptyMap();
            try {
                try {
                    HashMap map = new HashMap();
                    a(map, request.getCacheEntry());
                    httpResponsePerformRequest = this.mHttpStack.performRequest(request, map);
                    try {
                        StatusLine statusLine = httpResponsePerformRequest.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        Map<String, String> mapConvertHeaders = convertHeaders(httpResponsePerformRequest.getAllHeaders());
                        if (statusCode == 304) {
                            Cache.Entry cacheEntry = request.getCacheEntry();
                            if (cacheEntry == null) {
                                return new NetworkResponse(304, null, mapConvertHeaders, true, SystemClock.elapsedRealtime() - jElapsedRealtime);
                            }
                            cacheEntry.responseHeaders.putAll(mapConvertHeaders);
                            return new NetworkResponse(304, cacheEntry.data, cacheEntry.responseHeaders, true, SystemClock.elapsedRealtime() - jElapsedRealtime);
                        }
                        try {
                            if (httpResponsePerformRequest.getEntity() != null) {
                                try {
                                    bArrC = c(httpResponsePerformRequest.getEntity());
                                } catch (IOException e) {
                                    e = e;
                                    bArr = null;
                                    r17 = mapConvertHeaders;
                                }
                            } else {
                                bArrC = new byte[0];
                            }
                            byte[] bArr2 = bArrC;
                            try {
                                r1 = this;
                                r1.d(SystemClock.elapsedRealtime() - jElapsedRealtime, request, bArr2, statusLine);
                                try {
                                    if (statusCode < 200 || statusCode > 299) {
                                        throw new IOException();
                                    }
                                    return new NetworkResponse(statusCode, bArr2, mapConvertHeaders, false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                r1 = mapConvertHeaders;
                            }
                            r17 = r1;
                            bArr = bArr2;
                        } catch (IOException e4) {
                            e = e4;
                            mapEmptyMap = mapConvertHeaders;
                            r17 = mapEmptyMap;
                            bArr = null;
                        }
                        if (httpResponsePerformRequest == null) {
                            throw new NoConnectionError(e);
                        }
                        int statusCode2 = httpResponsePerformRequest.getStatusLine().getStatusCode();
                        VolleyLog.e("Unexpected response code %d for %s", Integer.valueOf(statusCode2), request.getUrl());
                        if (bArr == null) {
                            throw new NetworkError((NetworkResponse) null);
                        }
                        NetworkResponse networkResponse = new NetworkResponse(statusCode2, bArr, r17, false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                        if (statusCode2 != 401 && statusCode2 != 403) {
                            throw new ServerError(networkResponse);
                        }
                        b("auth", request, new AuthFailureError(networkResponse));
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (IOException e6) {
                    e = e6;
                    r17 = mapEmptyMap;
                    httpResponsePerformRequest = null;
                    bArr = null;
                }
            } catch (MalformedURLException e7) {
                throw new RuntimeException("Bad URL " + request.getUrl(), e7);
            } catch (SocketTimeoutException unused) {
                b("socket", request, new TimeoutError());
            } catch (ConnectTimeoutException unused2) {
                b(AbsEsimOperation.HEADER_CONNECTION, request, new TimeoutError());
            }
        }
    }

    public BasicNetwork(HttpStack httpStack, ByteArrayPool byteArrayPool) {
        this.mHttpStack = httpStack;
        this.mPool = byteArrayPool;
    }
}
