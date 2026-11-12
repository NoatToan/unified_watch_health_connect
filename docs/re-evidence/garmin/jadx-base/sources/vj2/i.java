package vj2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.garmin.device.datatransfer.DataTransferException;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.common.net.HttpHeaders;
import ds.e0;
import e23.l;
import e23.p;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.ciq.http.rawresourcerequest.RawResourceRequestProcessor$run$2", f = "RawResourceRequestProcessor.kt", l = {246}, m = "invokeSuspend")
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HttpURLConnection f178533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f178534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f178535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f178536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f178537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f178538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f178539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vj2.a f178540h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends q implements l<o13.q<? extends Unit>, Unit> {
        public a(Object obj) {
            super(1, obj, vj2.a.class, "onSendComplete", "onSendComplete(Ljava/lang/Object;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(o13.q<? extends Unit> qVar) {
            Object obj = qVar.f128597a;
            ((vj2.a) this.receiver).b();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, vj2.a aVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f178539g = gVar;
        this.f178540h = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f178539g, this.f178540h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x026e A[Catch: all -> 0x0020, SocketTimeoutException -> 0x0028, DataTransferException -> 0x0030, TryCatch #16 {DataTransferException -> 0x0030, SocketTimeoutException -> 0x0028, all -> 0x0020, blocks: (B:6:0x001b, B:96:0x021d, B:107:0x026a, B:109:0x026e, B:113:0x027c, B:115:0x02be, B:117:0x02d5, B:119:0x02dd, B:121:0x02e8, B:141:0x030b, B:127:0x02f0, B:128:0x02f3, B:129:0x02f4, B:132:0x02fe, B:138:0x0306, B:139:0x0309, B:116:0x02d2, B:155:0x0344, B:156:0x0349), top: B:200:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x027a  */
    /* JADX WARN: Code duplicated, block: B:112:0x027b  */
    /* JADX WARN: Code duplicated, block: B:115:0x02be A[Catch: all -> 0x0020, SocketTimeoutException -> 0x0028, DataTransferException -> 0x0030, TryCatch #16 {DataTransferException -> 0x0030, SocketTimeoutException -> 0x0028, all -> 0x0020, blocks: (B:6:0x001b, B:96:0x021d, B:107:0x026a, B:109:0x026e, B:113:0x027c, B:115:0x02be, B:117:0x02d5, B:119:0x02dd, B:121:0x02e8, B:141:0x030b, B:127:0x02f0, B:128:0x02f3, B:129:0x02f4, B:132:0x02fe, B:138:0x0306, B:139:0x0309, B:116:0x02d2, B:155:0x0344, B:156:0x0349), top: B:200:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02d2 A[Catch: all -> 0x0020, SocketTimeoutException -> 0x0028, DataTransferException -> 0x0030, TryCatch #16 {DataTransferException -> 0x0030, SocketTimeoutException -> 0x0028, all -> 0x0020, blocks: (B:6:0x001b, B:96:0x021d, B:107:0x026a, B:109:0x026e, B:113:0x027c, B:115:0x02be, B:117:0x02d5, B:119:0x02dd, B:121:0x02e8, B:141:0x030b, B:127:0x02f0, B:128:0x02f3, B:129:0x02f4, B:132:0x02fe, B:138:0x0306, B:139:0x0309, B:116:0x02d2, B:155:0x0344, B:156:0x0349), top: B:200:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02dd A[Catch: all -> 0x0020, SocketTimeoutException -> 0x0028, DataTransferException -> 0x0030, TRY_LEAVE, TryCatch #16 {DataTransferException -> 0x0030, SocketTimeoutException -> 0x0028, all -> 0x0020, blocks: (B:6:0x001b, B:96:0x021d, B:107:0x026a, B:109:0x026e, B:113:0x027c, B:115:0x02be, B:117:0x02d5, B:119:0x02dd, B:121:0x02e8, B:141:0x030b, B:127:0x02f0, B:128:0x02f3, B:129:0x02f4, B:132:0x02fe, B:138:0x0306, B:139:0x0309, B:116:0x02d2, B:155:0x0344, B:156:0x0349), top: B:200:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02f4 A[Catch: all -> 0x0020, SocketTimeoutException -> 0x0028, DataTransferException -> 0x0030, TRY_LEAVE, TryCatch #16 {DataTransferException -> 0x0030, SocketTimeoutException -> 0x0028, all -> 0x0020, blocks: (B:6:0x001b, B:96:0x021d, B:107:0x026a, B:109:0x026e, B:113:0x027c, B:115:0x02be, B:117:0x02d5, B:119:0x02dd, B:121:0x02e8, B:141:0x030b, B:127:0x02f0, B:128:0x02f3, B:129:0x02f4, B:132:0x02fe, B:138:0x0306, B:139:0x0309, B:116:0x02d2, B:155:0x0344, B:156:0x0349), top: B:200:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:140:0x030a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0331  */
    /* JADX WARN: Code duplicated, block: B:148:0x0336 A[PHI: r1 r14
      0x0336: PHI (r1v26 ??) = (r1v22 ??), (r1v23 ??), (r1v24 ??), (r1v27 ??) binds: [B:163:0x037e, B:171:0x03b3, B:177:0x03e8, B:147:0x0334] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r14v41 ??) = (r14v32 ??), (r14v35 ??), (r14v38 ??), (r14v44 ??) binds: [B:163:0x037e, B:171:0x03b3, B:177:0x03e8, B:147:0x0334] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x0344 A[Catch: all -> 0x0020, SocketTimeoutException -> 0x0028, DataTransferException -> 0x0030, TRY_ENTER, TryCatch #16 {DataTransferException -> 0x0030, SocketTimeoutException -> 0x0028, all -> 0x0020, blocks: (B:6:0x001b, B:96:0x021d, B:107:0x026a, B:109:0x026e, B:113:0x027c, B:115:0x02be, B:117:0x02d5, B:119:0x02dd, B:121:0x02e8, B:141:0x030b, B:127:0x02f0, B:128:0x02f3, B:129:0x02f4, B:132:0x02fe, B:138:0x0306, B:139:0x0309, B:116:0x02d2, B:155:0x0344, B:156:0x0349), top: B:200:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:162:0x037b  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:190:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0334, code lost:
    
        if (r1 != 0) goto L148;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v38, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v44, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u13.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus responseStatus;
        Logger loggerB;
        g.a aVar;
        URL url;
        r0 r0Var;
        Throwable th3;
        a aVar2;
        SocketTimeoutException socketTimeoutException;
        DataTransferException dataTransferException;
        GDIConnectIQHTTPProto.RawResourceResponse.Builder builder;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        HttpURLConnection httpURLConnection4;
        byte[] byteArray;
        r0 r0Var2;
        byte[] bArr;
        HttpURLConnection httpURLConnection5;
        g gVar;
        c cVar;
        ?? r14;
        HttpURLConnection httpURLConnection6;
        g gVar2;
        String str;
        int responseCode;
        InputStream errorStream;
        byte[] bArrM;
        InputStream inputStream;
        ?? r15 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178538f;
        boolean z14 = true;
        g gVar3 = this.f178539g;
        try {
            if (i14 == 0) {
                r.b(obj);
                GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest = gVar3.f178519c;
                GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest2 = gVar3.f178519c;
                if (rawResourceRequest.hasMethod()) {
                    gVar3.f178524h = rawResourceRequest.getMethod().name();
                    if (rawResourceRequest.hasUrl()) {
                        try {
                            gVar3.f178523g = new URL(rawResourceRequest.getUrl());
                            Object systemService = gVar3.f178517a.getSystemService("connectivity");
                            systemService.getClass();
                            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                            if (connectivityManager.getActiveNetworkInfo() != null) {
                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                activeNetworkInfo.getClass();
                                if (activeNetworkInfo.isConnected()) {
                                    responseStatus = null;
                                } else {
                                    loggerB = gVar3.b();
                                    aVar = g.f178515l;
                                    url = gVar3.f178523g;
                                    if (url != null) {
                                        s.m("url");
                                        throw null;
                                    }
                                    aVar.getClass();
                                    loggerB.warn("no network connection ".concat(g.a.a(url)));
                                    responseStatus = GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.NETWORK_REQUEST_TIMED_OUT;
                                }
                            } else {
                                loggerB = gVar3.b();
                                aVar = g.f178515l;
                                url = gVar3.f178523g;
                                if (url != null) {
                                    s.m("url");
                                    throw null;
                                }
                                aVar.getClass();
                                loggerB.warn("no network connection ".concat(g.a.a(url)));
                                responseStatus = GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.NETWORK_REQUEST_TIMED_OUT;
                            }
                        } catch (MalformedURLException unused) {
                            e0.v("proto msg invalid url ", rawResourceRequest.getUrl(), gVar3.b());
                            responseStatus = GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.UNKNOWN;
                        }
                    } else {
                        gVar3.b().error("proto msg url not set");
                        responseStatus = GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.UNKNOWN;
                    }
                } else {
                    gVar3.b().error("proto msg HTTP method not set");
                    responseStatus = GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.UNKNOWN;
                }
                if (responseStatus != null) {
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder status = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(responseStatus);
                    status.getClass();
                    ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status, null, null, null), 3);
                    return Unit.INSTANCE;
                }
                r0Var = new r0();
                vj2.a aVar3 = this.f178540h;
                if (aVar3 != null) {
                    try {
                        if (aVar3.c()) {
                            HashMap map = new HashMap();
                            Map<String, String> responseHeaders = aVar3.getResponseHeaders();
                            if (responseHeaders != null) {
                                for (Map.Entry<String, String> entry : responseHeaders.entrySet()) {
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    if (map.get(key) == null) {
                                        map.put(key, x.m(value));
                                    } else {
                                        List list = (List) map.get(key);
                                        if (list != null) {
                                            list.add(value);
                                        }
                                    }
                                }
                            }
                            a aVar4 = new a(aVar3);
                            try {
                                GDIConnectIQHTTPProto.RawResourceResponse.Builder builderC = gVar3.c(aVar3.a(), aVar3.getStatusCode(), map, aVar4);
                                gVar3.b().debug("Response has useDataXfer:" + builderC.hasXferData());
                                builder = builderC;
                                if (builderC.hasXferData()) {
                                    r15 = 0;
                                    aVar2 = null;
                                } else {
                                    aVar2 = aVar4;
                                    r15 = 0;
                                }
                                g.a aVar5 = g.f178515l;
                                ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, builder, aVar2, null, null), 3);
                                obj = (OutputStream) r0Var.f105810a;
                                if (obj != 0) {
                                    obj.close();
                                }
                            } catch (DataTransferException e4) {
                                dataTransferException = e4;
                                aVar2 = aVar4;
                                r15 = 0;
                                g.a aVar6 = g.f178515l;
                                gVar3.b().error("data transfer failed", (Throwable) dataTransferException);
                                GDIConnectIQHTTPProto.RawResourceResponse.Builder status2 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.DATA_TRANSFER_ITEM_FAILURE);
                                status2.getClass();
                                ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status2, aVar2, dataTransferException, null), 3);
                                obj = (OutputStream) r0Var.f105810a;
                                if (obj != 0) {
                                    obj.close();
                                }
                                if (r15 != 0) {
                                    r15.disconnect();
                                }
                                return Unit.INSTANCE;
                            } catch (SocketTimeoutException e14) {
                                socketTimeoutException = e14;
                                aVar2 = aVar4;
                                r15 = 0;
                                g.a aVar7 = g.f178515l;
                                gVar3.b().error("", (Throwable) socketTimeoutException);
                                GDIConnectIQHTTPProto.RawResourceResponse.Builder status3 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.NETWORK_REQUEST_TIMED_OUT);
                                status3.getClass();
                                ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status3, aVar2, socketTimeoutException, null), 3);
                                obj = (OutputStream) r0Var.f105810a;
                                if (obj != 0) {
                                    obj.close();
                                }
                                if (r15 != 0) {
                                    r15.disconnect();
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th3 = th4;
                                aVar2 = aVar4;
                                r15 = 0;
                                g.a aVar8 = g.f178515l;
                                gVar3.b().error("", th3);
                                GDIConnectIQHTTPProto.RawResourceResponse.Builder status4 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.UNKNOWN);
                                status4.getClass();
                                ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status4, aVar2, th3, null), 3);
                                obj = (OutputStream) r0Var.f105810a;
                                if (obj != 0) {
                                    obj.close();
                                }
                                if (r15 != 0) {
                                    r15.disconnect();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    } catch (DataTransferException e15) {
                        dataTransferException = e15;
                        r15 = 0;
                        aVar2 = null;
                    } catch (SocketTimeoutException e16) {
                        socketTimeoutException = e16;
                        r15 = 0;
                        aVar2 = null;
                    } catch (Throwable th5) {
                        th3 = th5;
                        r15 = 0;
                        aVar2 = null;
                    }
                }
                URL url2 = gVar3.f178523g;
                if (url2 == null) {
                    s.m("url");
                    throw null;
                }
                URLConnection uRLConnectionOpenConnection = url2.openConnection();
                uRLConnectionOpenConnection.getClass();
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    boolean zHasConnectionTimeoutSeconds = rawResourceRequest2.hasConnectionTimeoutSeconds();
                    int readTimeoutSeconds = DateTimeConstants.MILLIS_PER_MINUTE;
                    httpURLConnection.setConnectTimeout(zHasConnectionTimeoutSeconds ? rawResourceRequest2.getConnectionTimeoutSeconds() * 1000 : 60000);
                    if (rawResourceRequest2.hasReadTimeoutSeconds()) {
                        readTimeoutSeconds = rawResourceRequest2.getReadTimeoutSeconds() * 1000;
                    }
                    httpURLConnection.setReadTimeout(readTimeoutSeconds);
                    g.a(gVar3, httpURLConnection);
                    if (rawResourceRequest2.getFormsCount() > 0) {
                        c cVar2 = new c(rawResourceRequest2, gVar3.f178518b, gVar3.f178521e.getF92746j());
                        this.f178533a = httpURLConnection;
                        this.f178534b = r0Var;
                        this.f178535c = gVar3;
                        this.f178536d = httpURLConnection;
                        this.f178537e = cVar2;
                        this.f178538f = 1;
                        Serializable serializableB = cVar2.b(this);
                        if (serializableB == r15) {
                            return r15;
                        }
                        httpURLConnection5 = httpURLConnection;
                        cVar = cVar2;
                        r0Var2 = r0Var;
                        r14 = serializableB;
                        httpURLConnection6 = httpURLConnection5;
                        gVar2 = gVar3;
                        bArr = (byte[]) r14;
                        httpURLConnection6.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=" + cVar.f178489d);
                        httpURLConnection6.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
                        gVar = gVar2;
                        httpURLConnection = httpURLConnection6;
                    } else {
                        if (rawResourceRequest2.hasBody()) {
                            String body = rawResourceRequest2.getBody();
                            body.getClass();
                            byteArray = body.getBytes(d53.c.f57666b);
                            byteArray.getClass();
                        } else {
                            byteArray = rawResourceRequest2.hasRawBody() ? rawResourceRequest2.getRawBody().toByteArray() : null;
                        }
                        r0Var2 = r0Var;
                        bArr = byteArray;
                        httpURLConnection5 = httpURLConnection;
                        gVar = gVar3;
                    }
                    str = gVar.f178524h;
                    if (str != null) {
                        s.m("httpMethod");
                        throw null;
                    }
                    httpURLConnection.setRequestMethod(str);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setDoInput(true);
                    if (bArr != null) {
                        z14 = false;
                    }
                    httpURLConnection.setDoOutput(z14);
                    Logger loggerB2 = gVar.b();
                    String requestMethod = httpURLConnection.getRequestMethod();
                    g.a aVar9 = g.f178515l;
                    URL url3 = httpURLConnection.getURL();
                    url3.getClass();
                    aVar9.getClass();
                    loggerB2.debug(requestMethod + ": " + g.a.a(url3) + " useDataXfer:" + gVar.f178519c.getUseDataXfer());
                    if (bArr != null) {
                        ?? bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        r0Var2.f105810a = bufferedOutputStream;
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.close();
                        r0Var2.f105810a = null;
                    } else {
                        httpURLConnection.connect();
                    }
                    responseCode = httpURLConnection5.getResponseCode();
                    if (responseCode < 400) {
                        inputStream = httpURLConnection5.getInputStream();
                        inputStream.getClass();
                        bArrM = dh.b.M(inputStream);
                        inputStream.close();
                    } else {
                        errorStream = httpURLConnection5.getErrorStream();
                        if (errorStream != null) {
                            bArrM = dh.b.M(errorStream);
                            errorStream.close();
                        } else {
                            bArrM = null;
                        }
                    }
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder builderC2 = gVar3.c(bArrM, responseCode, httpURLConnection5.getHeaderFields(), null);
                    r0Var = r0Var2;
                    r15 = httpURLConnection5;
                    aVar2 = null;
                    builder = builderC2;
                    g.a aVar10 = g.f178515l;
                    ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, builder, aVar2, null, null), 3);
                    obj = (OutputStream) r0Var.f105810a;
                    if (obj != 0) {
                        obj.close();
                    }
                } catch (DataTransferException e17) {
                    dataTransferException = e17;
                    httpURLConnection4 = httpURLConnection;
                    aVar2 = null;
                    r15 = httpURLConnection4;
                    g.a aVar11 = g.f178515l;
                    gVar3.b().error("data transfer failed", (Throwable) dataTransferException);
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder status5 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.DATA_TRANSFER_ITEM_FAILURE);
                    status5.getClass();
                    ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status5, aVar2, dataTransferException, null), 3);
                    obj = (OutputStream) r0Var.f105810a;
                    if (obj != 0) {
                        obj.close();
                    }
                    if (r15 != 0) {
                        r15.disconnect();
                    }
                    return Unit.INSTANCE;
                } catch (SocketTimeoutException e18) {
                    socketTimeoutException = e18;
                    httpURLConnection3 = httpURLConnection;
                    aVar2 = null;
                    r15 = httpURLConnection3;
                    g.a aVar12 = g.f178515l;
                    gVar3.b().error("", (Throwable) socketTimeoutException);
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder status6 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.NETWORK_REQUEST_TIMED_OUT);
                    status6.getClass();
                    ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status6, aVar2, socketTimeoutException, null), 3);
                    obj = (OutputStream) r0Var.f105810a;
                    if (obj != 0) {
                        obj.close();
                    }
                    if (r15 != 0) {
                        r15.disconnect();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th6) {
                    th3 = th6;
                    httpURLConnection2 = httpURLConnection;
                    aVar2 = null;
                    r15 = httpURLConnection2;
                    g.a aVar13 = g.f178515l;
                    gVar3.b().error("", th3);
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder status7 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.UNKNOWN);
                    status7.getClass();
                    ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status7, aVar2, th3, null), 3);
                    obj = (OutputStream) r0Var.f105810a;
                    if (obj != 0) {
                        obj.close();
                    }
                    if (r15 != 0) {
                        r15.disconnect();
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = this.f178537e;
                httpURLConnection6 = this.f178536d;
                gVar2 = this.f178535c;
                r0Var2 = this.f178534b;
                httpURLConnection5 = this.f178533a;
                try {
                    r.b(obj);
                    r14 = obj;
                    bArr = (byte[]) r14;
                    httpURLConnection6.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=" + cVar.f178489d);
                    httpURLConnection6.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
                    gVar = gVar2;
                    httpURLConnection = httpURLConnection6;
                    str = gVar.f178524h;
                    if (str != null) {
                        s.m("httpMethod");
                        throw null;
                    }
                    httpURLConnection.setRequestMethod(str);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setDoInput(true);
                    if (bArr != null) {
                        z14 = false;
                    }
                    httpURLConnection.setDoOutput(z14);
                    Logger loggerB3 = gVar.b();
                    String requestMethod2 = httpURLConnection.getRequestMethod();
                    g.a aVar14 = g.f178515l;
                    URL url4 = httpURLConnection.getURL();
                    url4.getClass();
                    aVar14.getClass();
                    loggerB3.debug(requestMethod2 + ": " + g.a.a(url4) + " useDataXfer:" + gVar.f178519c.getUseDataXfer());
                    if (bArr != null) {
                        ?? bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        r0Var2.f105810a = bufferedOutputStream2;
                        bufferedOutputStream2.write(bArr);
                        bufferedOutputStream2.close();
                        r0Var2.f105810a = null;
                    } else {
                        httpURLConnection.connect();
                    }
                    responseCode = httpURLConnection5.getResponseCode();
                    if (responseCode < 400) {
                        inputStream = httpURLConnection5.getInputStream();
                        try {
                            inputStream.getClass();
                            bArrM = dh.b.M(inputStream);
                            inputStream.close();
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                jg.b.l(inputStream, th7);
                                throw th8;
                            }
                        }
                    } else {
                        errorStream = httpURLConnection5.getErrorStream();
                        if (errorStream != null) {
                            try {
                                bArrM = dh.b.M(errorStream);
                                errorStream.close();
                            } catch (Throwable th9) {
                                try {
                                    throw th9;
                                } catch (Throwable th10) {
                                    jg.b.l(errorStream, th9);
                                    throw th10;
                                }
                            }
                        } else {
                            bArrM = null;
                        }
                    }
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder builderC3 = gVar3.c(bArrM, responseCode, httpURLConnection5.getHeaderFields(), null);
                    r0Var = r0Var2;
                    r15 = httpURLConnection5;
                    aVar2 = null;
                    builder = builderC3;
                    try {
                        g.a aVar15 = g.f178515l;
                        ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, builder, aVar2, null, null), 3);
                        obj = (OutputStream) r0Var.f105810a;
                        if (obj != 0) {
                            obj.close();
                        }
                    } catch (DataTransferException e19) {
                        dataTransferException = e19;
                        r15 = r15;
                        g.a aVar16 = g.f178515l;
                        gVar3.b().error("data transfer failed", (Throwable) dataTransferException);
                        GDIConnectIQHTTPProto.RawResourceResponse.Builder status8 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.DATA_TRANSFER_ITEM_FAILURE);
                        status8.getClass();
                        ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status8, aVar2, dataTransferException, null), 3);
                        obj = (OutputStream) r0Var.f105810a;
                        if (obj != 0) {
                            obj.close();
                        }
                        if (r15 != 0) {
                            r15.disconnect();
                        }
                        return Unit.INSTANCE;
                    } catch (SocketTimeoutException e24) {
                        socketTimeoutException = e24;
                        r15 = r15;
                        g.a aVar17 = g.f178515l;
                        gVar3.b().error("", (Throwable) socketTimeoutException);
                        GDIConnectIQHTTPProto.RawResourceResponse.Builder status9 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.NETWORK_REQUEST_TIMED_OUT);
                        status9.getClass();
                        ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status9, aVar2, socketTimeoutException, null), 3);
                        obj = (OutputStream) r0Var.f105810a;
                        if (obj != 0) {
                            obj.close();
                        }
                        if (r15 != 0) {
                            r15.disconnect();
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th11) {
                        th3 = th11;
                        r15 = r15;
                        g.a aVar18 = g.f178515l;
                        gVar3.b().error("", th3);
                        GDIConnectIQHTTPProto.RawResourceResponse.Builder status10 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.UNKNOWN);
                        status10.getClass();
                        ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status10, aVar2, th3, null), 3);
                        obj = (OutputStream) r0Var.f105810a;
                        if (obj != 0) {
                            obj.close();
                        }
                        if (r15 != 0) {
                            r15.disconnect();
                        }
                        return Unit.INSTANCE;
                    }
                } catch (DataTransferException e25) {
                    dataTransferException = e25;
                    r0Var = r0Var2;
                    httpURLConnection4 = httpURLConnection5;
                    aVar2 = null;
                    r15 = httpURLConnection4;
                    g.a aVar19 = g.f178515l;
                    gVar3.b().error("data transfer failed", (Throwable) dataTransferException);
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder status11 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.DATA_TRANSFER_ITEM_FAILURE);
                    status11.getClass();
                    ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status11, aVar2, dataTransferException, null), 3);
                    obj = (OutputStream) r0Var.f105810a;
                    if (obj != 0) {
                        obj.close();
                    }
                    if (r15 != 0) {
                        r15.disconnect();
                    }
                    return Unit.INSTANCE;
                } catch (SocketTimeoutException e26) {
                    socketTimeoutException = e26;
                    r0Var = r0Var2;
                    httpURLConnection3 = httpURLConnection5;
                    aVar2 = null;
                    r15 = httpURLConnection3;
                    g.a aVar110 = g.f178515l;
                    gVar3.b().error("", (Throwable) socketTimeoutException);
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder status12 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.NETWORK_REQUEST_TIMED_OUT);
                    status12.getClass();
                    ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status12, aVar2, socketTimeoutException, null), 3);
                    obj = (OutputStream) r0Var.f105810a;
                    if (obj != 0) {
                        obj.close();
                    }
                    if (r15 != 0) {
                        r15.disconnect();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th12) {
                    th3 = th12;
                    r0Var = r0Var2;
                    httpURLConnection2 = httpURLConnection5;
                    aVar2 = null;
                    r15 = httpURLConnection2;
                    g.a aVar111 = g.f178515l;
                    gVar3.b().error("", th3);
                    GDIConnectIQHTTPProto.RawResourceResponse.Builder status13 = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.UNKNOWN);
                    status13.getClass();
                    ge1.b.T((b0) gVar3.f178527k.getValue(), null, null, new h(gVar3, status13, aVar2, th3, null), 3);
                    obj = (OutputStream) r0Var.f105810a;
                    if (obj != 0) {
                        obj.close();
                    }
                    if (r15 != 0) {
                        r15.disconnect();
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable th13) {
            OutputStream outputStream = (OutputStream) obj.f105810a;
            if (outputStream != null) {
                outputStream.close();
            }
            if (r15 != 0) {
                r15.disconnect();
            }
            throw th13;
        }
    }
}
