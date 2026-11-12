package com.huami.network.base.framework.asynchttp;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.ednetwork.HttpClientCryptoProxy;
import com.huami.network.base.framework.HMHttpFramework;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.SyncHttpClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncHttpFramework extends HMHttpFramework<SyncHttpClient, RequestParams, HttpEntity, Header[]> {
    private final String b = AsyncHttpFramework.class.getCanonicalName();

    public class a extends FileAsyncHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, HMHttpResponseData hMHttpResponseData) {
            super(file);
            this.a = hMHttpResponseData;
        }

        @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
        public void onFailure(int i, Header[] headerArr, Throwable th, File file) {
            AsyncHttpFramework.this.m(this.a, i, headerArr, null, false, th);
            AsyncHttpFramework.this.i(th);
        }

        @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
        public void onSuccess(int i, Header[] headerArr, File file) {
            AsyncHttpFramework.this.m(this.a, i, headerArr, null, true, null);
        }
    }

    public class b extends AsyncHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        public b(HMHttpResponseData hMHttpResponseData) {
            this.a = hMHttpResponseData;
        }

        @Override // com.loopj.android.http.AsyncHttpResponseHandler
        public void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th) {
            AsyncHttpFramework.this.m(this.a, i, headerArr, bArr, false, th);
            AsyncHttpFramework.this.i(th);
        }

        @Override // com.loopj.android.http.AsyncHttpResponseHandler
        public void onSuccess(int i, Header[] headerArr, byte[] bArr) {
            AsyncHttpFramework.this.m(this.a, i, headerArr, bArr, true, null);
        }
    }

    private AsyncHttpResponseHandler c(HMHttpResponseData hMHttpResponseData) {
        return new b(hMHttpResponseData);
    }

    private FileAsyncHttpResponseHandler d(HMHttpResponseData hMHttpResponseData, File file) {
        return new a(file, hMHttpResponseData);
    }

    private HttpEntity e(Object obj) {
        if (obj instanceof byte[]) {
            return new ByteArrayEntity((byte[]) obj);
        }
        if (obj instanceof File) {
            return new FileEntity((File) obj, null);
        }
        if (obj instanceof String) {
            try {
                return new StringEntity((String) obj, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    private HttpEntity f(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return null;
        }
        String str = (String) obj;
        try {
            if (HMHttpUtils.isContentType(str) && !HMHttpUtils.isContentType((String) obj2)) {
                StringEntity stringEntity = new StringEntity((String) obj2, "UTF-8");
                stringEntity.setContentType((String) obj);
                return stringEntity;
            }
            if (!HMHttpUtils.isContentType((String) obj2) || HMHttpUtils.isContentType(str)) {
                return null;
            }
            StringEntity stringEntity2 = new StringEntity((String) obj, "UTF-8");
            stringEntity2.setContentType((String) obj2);
            return stringEntity2;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private HMHttpResponseData g(HMHttpRequestData hMHttpRequestData) {
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        hMHttpResponseData.setUrl(hMHttpRequestData.getUrl());
        hMHttpResponseData.setTag(hMHttpRequestData.getTag());
        return hMHttpResponseData;
    }

    private Throwable h(Throwable th) {
        if (th == null) {
            return null;
        }
        return (!(th instanceof UnknownHostException) && (th instanceof IOException) && !TextUtils.isEmpty(th.toString()) && th.toString().contains(UnknownHostException.class.getSimpleName())) ? new UnknownHostException(th.toString()) : th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Throwable th) {
        if (th != null) {
            HMLog.e(this.b, th.toString(), new Object[0]);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                HMLog.e(this.b, stackTraceElement.toString(), new Object[0]);
            }
        }
    }

    private HMHttpResponseData j(SyncHttpClient syncHttpClient, HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map) {
        HMHttpResponseData hMHttpResponseDataG = g(hMHttpRequestData);
        FileAsyncHttpResponseHandler fileAsyncHttpResponseHandlerD = d(hMHttpResponseDataG, hMHttpRequestData.getDownloadFile());
        Header[] headerArrMap2Header = map2Header(map);
        if (Support.RequestSupport.POST == requestSupport) {
            syncHttpClient.post((Context) null, hMHttpRequestData.getUrl(), headerArrMap2Header, (RequestParams) null, (String) null, fileAsyncHttpResponseHandlerD);
        } else if (Support.RequestSupport.PUT == requestSupport) {
            syncHttpClient.put(null, hMHttpResponseDataG.getUrl(), headerArrMap2Header, null, null, fileAsyncHttpResponseHandlerD);
        } else if (Support.RequestSupport.DELETE == requestSupport) {
            syncHttpClient.delete(null, AsyncHttpClient.getUrlWithQueryString(true, hMHttpRequestData.getUrl(), null), headerArrMap2Header, fileAsyncHttpResponseHandlerD);
        } else if (Support.RequestSupport.GET == requestSupport) {
            syncHttpClient.get(null, hMHttpRequestData.getUrl(), headerArrMap2Header, null, fileAsyncHttpResponseHandlerD);
        } else {
            if (Support.RequestSupport.HEAD != requestSupport) {
                HMLog.e(this.b, "request failed:support error", new Object[0]);
                throw new IllegalArgumentException();
            }
            syncHttpClient.head(null, hMHttpRequestData.getUrl(), headerArrMap2Header, null, fileAsyncHttpResponseHandlerD);
        }
        return hMHttpResponseDataG;
    }

    private HMHttpResponseData k(SyncHttpClient syncHttpClient, HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map) {
        HMHttpResponseData hMHttpResponseDataG = g(hMHttpRequestData);
        AsyncHttpResponseHandler asyncHttpResponseHandlerC = c(hMHttpResponseDataG);
        HttpEntity httpEntity = set2Entity(hMHttpRequestData.getEntity());
        Header[] headerArrMap2Header = map2Header(map);
        if (Support.RequestSupport.POST == requestSupport) {
            syncHttpClient.post((Context) null, hMHttpRequestData.getUrl(), headerArrMap2Header, httpEntity, (String) null, asyncHttpResponseHandlerC);
        } else {
            if (Support.RequestSupport.PUT != requestSupport) {
                throw new IllegalStateException();
            }
            syncHttpClient.put(null, hMHttpRequestData.getUrl(), headerArrMap2Header, httpEntity, null, asyncHttpResponseHandlerC);
        }
        return hMHttpResponseDataG;
    }

    private Map<String, String> l(Header[] headerArr) {
        if (headerArr == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Header header : headerArr) {
            map.put(header.getName(), header.getValue());
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(HMHttpResponseData hMHttpResponseData, int i, Header[] headerArr, byte[] bArr, boolean z, Throwable th) {
        if (!HttpClientCryptoProxy.isPathInHmCrypto(URI.create(hMHttpResponseData.getUrl()).getPath()) || bArr == null || bArr.length == 0) {
            hMHttpResponseData.setResponseBody(bArr);
        } else {
            hMHttpResponseData.setResponseBody(HttpClientCryptoProxy.decrypt(z, bArr));
        }
        hMHttpResponseData.setStatusCode(i);
        hMHttpResponseData.setSuccess(z);
        hMHttpResponseData.setHeader(l(headerArr));
        hMHttpResponseData.setError(h(th));
    }

    private HMHttpResponseData n(SyncHttpClient syncHttpClient, HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map) {
        HMHttpResponseData hMHttpResponseDataG = g(hMHttpRequestData);
        AsyncHttpResponseHandler asyncHttpResponseHandlerC = c(hMHttpResponseDataG);
        asyncHttpResponseHandlerC.setRequestURI(URI.create(hMHttpRequestData.getUrl()));
        RequestParams requestParamsMap2Params = map2Params(hMHttpRequestData.getParams());
        Header[] headerArrMap2Header = map2Header(map);
        if (Support.RequestSupport.POST == requestSupport) {
            syncHttpClient.post((Context) null, hMHttpRequestData.getUrl(), headerArrMap2Header, requestParamsMap2Params, (String) null, asyncHttpResponseHandlerC);
        } else if (Support.RequestSupport.PUT == requestSupport) {
            syncHttpClient.put(null, hMHttpResponseDataG.getUrl(), headerArrMap2Header, syncHttpClient.paramsToEntity(requestParamsMap2Params, asyncHttpResponseHandlerC), null, asyncHttpResponseHandlerC);
        } else if (Support.RequestSupport.DELETE == requestSupport) {
            syncHttpClient.delete(null, AsyncHttpClient.getUrlWithQueryString(true, hMHttpRequestData.getUrl(), requestParamsMap2Params), headerArrMap2Header, asyncHttpResponseHandlerC);
        } else if (Support.RequestSupport.GET == requestSupport) {
            syncHttpClient.get(null, hMHttpRequestData.getUrl(), headerArrMap2Header, requestParamsMap2Params, asyncHttpResponseHandlerC);
        } else {
            if (Support.RequestSupport.HEAD != requestSupport) {
                HMLog.e(this.b, "request failed:support error", new Object[0]);
                throw new IllegalArgumentException();
            }
            syncHttpClient.head(null, hMHttpRequestData.getUrl(), headerArrMap2Header, requestParamsMap2Params, asyncHttpResponseHandlerC);
        }
        return hMHttpResponseDataG;
    }

    @Override // com.huami.network.base.http.IHMHttpClient
    public boolean cancel(String str) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.network.base.http.IHMHttpClient
    public void cancelAll() {
        ((SyncHttpClient) this.mRequest).cancelAllRequests(true);
    }

    @Override // com.huami.network.base.http.IHMHttpClient
    public /* bridge */ /* synthetic */ Object map2Header(Map map) {
        return map2Header((Map<String, String>) map);
    }

    @Override // com.huami.network.base.http.IHMHttpClient
    public /* bridge */ /* synthetic */ Object map2Params(Map map) {
        return map2Params((Map<String, Object>) map);
    }

    @Override // com.huami.network.base.framework.HMHttpFramework
    public /* bridge */ /* synthetic */ HMHttpResponseData response(SyncHttpClient syncHttpClient, HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map map) {
        return response2(syncHttpClient, hMHttpRequestData, requestSupport, (Map<String, String>) map);
    }

    @Override // com.huami.network.base.http.IHMHttpClient
    public /* bridge */ /* synthetic */ Object set2Entity(Set set) {
        return set2Entity((Set<Object>) set);
    }

    @Override // com.huami.network.base.http.AbsHMHttpInit
    public void supportGzip(SyncHttpClient syncHttpClient, boolean z) {
    }

    @Override // com.huami.network.base.http.AbsHMHttpInit
    public void supportHttps(SyncHttpClient syncHttpClient, boolean z) {
    }

    @Override // com.huami.network.base.http.AbsHMHttpInit
    public SyncHttpClient create() {
        return new SyncHttpClient();
    }

    @Override // com.huami.network.base.http.IHMHttpClient
    public Header[] map2Header(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        Header[] headerArr = new Header[map.size()];
        int i = 0;
        for (String str : map.keySet()) {
            headerArr[i] = new BasicHeader(str, map.get(str));
            i++;
        }
        return headerArr;
    }

    @Override // com.huami.network.base.http.IHMHttpClient
    public RequestParams map2Params(Map<String, Object> map) {
        RequestParams requestParams = new RequestParams();
        if (map == null) {
            return requestParams;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                requestParams.add(str, String.valueOf(obj));
            } else if (obj instanceof File) {
                try {
                    requestParams.put(str, (File) obj);
                } catch (FileNotFoundException unused) {
                    HMLog.e(this.b, str + ":" + ((File) obj).getAbsolutePath() + " FileNotFoundException!!!!!!", new Object[0]);
                }
            } else if (obj instanceof InputStream) {
                requestParams.put(str, (InputStream) obj);
            } else if (obj instanceof Integer) {
                requestParams.put(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                requestParams.put(str, ((Long) obj).longValue());
            } else {
                requestParams.put(str, obj);
            }
        }
        return requestParams;
    }

    /* JADX INFO: renamed from: response, reason: avoid collision after fix types in other method */
    public HMHttpResponseData response2(SyncHttpClient syncHttpClient, HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map) {
        if (HttpClientCryptoProxy.isPathInHmCrypto(URI.create(hMHttpRequestData.getUrl()).getPath())) {
            Map<String, String> headers = HttpClientCryptoProxy.getHeaders();
            for (String str : headers.keySet()) {
                map.put(str, headers.get(str));
            }
        }
        if (hMHttpRequestData.isUseParams()) {
            return n(syncHttpClient, hMHttpRequestData, requestSupport, map);
        }
        if (hMHttpRequestData.isUseEntity()) {
            return k(syncHttpClient, hMHttpRequestData, requestSupport, map);
        }
        if (hMHttpRequestData.isUseDownload()) {
            return j(syncHttpClient, hMHttpRequestData, requestSupport, map);
        }
        HMHttpResponseData hMHttpResponseDataG = g(hMHttpRequestData);
        hMHttpResponseDataG.setError(new Exception("Not support type."));
        return hMHttpResponseDataG;
    }

    @Override // com.huami.network.base.http.IHMHttpClient
    public HttpEntity set2Entity(Set<Object> set) {
        if (set != null && !set.isEmpty()) {
            Iterator<Object> it2 = set.iterator();
            if (set.size() == 1) {
                return e(it2.next());
            }
            if (set.size() == 2) {
                return f(it2.next(), it2.next());
            }
        }
        return null;
    }

    @Override // com.huami.network.base.http.AbsHMHttpInit
    public void setRetries(SyncHttpClient syncHttpClient, int i) {
        if (i < 0) {
            i = 1;
        }
        syncHttpClient.setMaxRetriesAndTimeout(i, 0);
    }

    @Override // com.huami.network.base.http.AbsHMHttpInit
    public void setTimeout(SyncHttpClient syncHttpClient, int i) {
        if (i <= 0) {
            i = 20000;
        }
        syncHttpClient.setTimeout(i);
    }
}
