package vj2;

import android.content.Context;
import androidx.room.a0;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.garmin.proto.generated.GDIDataTypes;
import com.google.common.net.HttpHeaders;
import com.google.protobuf.ByteString;
import d53.w;
import dt2.k;
import i3.e5;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o13.m;
import o13.t;
import o53.c0;
import o53.s0;
import org.apache.commons.text.StringSubstitutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.l0;
import p13.u;
import p13.y;
import ty1.g2;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lvj2/g;", "", "Landroid/content/Context;", "appContext", "Lzj2/e;", "dataTransfer", "Lcom/garmin/proto/generated/GDIConnectIQHTTPProto$RawResourceRequest;", "request", "Ldt2/k;", "responder", "Lrs2/c;", "device", "", "libName", "<init>", "(Landroid/content/Context;Lzj2/e;Lcom/garmin/proto/generated/GDIConnectIQHTTPProto$RawResourceRequest;Ldt2/k;Lrs2/c;Ljava/lang/String;)V", "a", "ciq-http-raw-resource-request_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f178515l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set<String> f178516m = u.m0(new String[]{"appsLibraryExternalServices", "appsLibraryProcessServices", "appsLibraryBusinessServices"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f178517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zj2.e f178518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GDIConnectIQHTTPProto.RawResourceRequest f178519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f178520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rs2.c f178521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f178522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public URL f178523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f178524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f178525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f178526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f178527k;

    public g(Context context, zj2.e eVar, GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest, k kVar, rs2.c cVar, String str) {
        context.getClass();
        eVar.getClass();
        rawResourceRequest.getClass();
        kVar.getClass();
        cVar.getClass();
        str.getClass();
        this.f178517a = context;
        this.f178518b = eVar;
        this.f178519c = rawResourceRequest;
        this.f178520d = kVar;
        this.f178521e = cVar;
        this.f178522f = str;
        this.f178525i = a0.f(cVar.getF92746j(), "CIQReq#RawResourceRequestProcessor(", StringSubstitutor.DEFAULT_VAR_END);
        final int i14 = 0;
        this.f178526j = m.b(new e23.a(this) { // from class: vj2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f178514b;

            {
                this.f178514b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                g gVar = this.f178514b;
                switch (i15) {
                    case 0:
                        return LoggerFactory.getLogger(gVar.f178525i);
                    default:
                        g.a aVar = g.f178515l;
                        o53.a0 a0Var = new o53.a0(gVar.f178525i);
                        x53.c cVar2 = s0.f129406a;
                        return c0.a(a0Var.plus(x53.b.f189152a).plus(ge1.b.h()));
                }
            }
        });
        final int i15 = 1;
        this.f178527k = m.b(new e23.a(this) { // from class: vj2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f178514b;

            {
                this.f178514b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                g gVar = this.f178514b;
                switch (i16) {
                    case 0:
                        return LoggerFactory.getLogger(gVar.f178525i);
                    default:
                        g.a aVar = g.f178515l;
                        o53.a0 a0Var = new o53.a0(gVar.f178525i);
                        x53.c cVar2 = s0.f129406a;
                        return c0.a(a0Var.plus(x53.b.f189152a).plus(ge1.b.h()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, p13.l0] */
    /* JADX WARN: Type inference failed for: r5v16, types: [T, java.util.ArrayList] */
    public static final void a(g gVar, HttpURLConnection httpURLConnection) {
        String value;
        List<GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeader> headersList = gVar.f178519c.getHeadersList();
        headersList.getClass();
        Context context = gVar.f178517a;
        String str = gVar.f178522f;
        rs2.c cVar = gVar.f178521e;
        f178515l.getClass();
        context.getClass();
        str.getClass();
        r0 r0Var = new r0();
        r0Var.f105810a = l0.f134950a;
        if (cVar != null && httpURLConnection.getURL() != null) {
            URL url = httpURLConnection.getURL();
            url.getClass();
            if (nd2.e.e(url)) {
                HashMap mapA = nd2.a.a(Long.valueOf(cVar.getF92746j()), String.valueOf(cVar.getF92745i()), "006-B" + cVar.getF92744h() + "-00");
                Set setKeySet = mapA.keySet();
                ?? arrayList = new ArrayList(y.r(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    arrayList.add(upperCase);
                }
                r0Var.f105810a = arrayList;
                for (Map.Entry entry : mapA.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        for (GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeader hTTPHeader : headersList) {
            if (d53.u.q(hTTPHeader.getKey(), "Browser-Agent", true) && ((value = hTTPHeader.getValue()) == null || w.J(value))) {
                String property = System.getProperty("http.agent");
                String strF = property != null ? new d53.k("[^\\p{ASCII}]").f(property, "") : null;
                httpURLConnection.addRequestProperty("Browser-Agent", strF != null ? strF : "");
            } else {
                Collection collection = (Collection) r0Var.f105810a;
                String key = hTTPHeader.getKey();
                key.getClass();
                String upperCase2 = key.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                if (collection.contains(upperCase2)) {
                    String value2 = hTTPHeader.getValue();
                    if (value2 != null && value2.length() != 0) {
                        httpURLConnection.setRequestProperty(hTTPHeader.getKey(), hTTPHeader.getValue());
                    }
                } else {
                    httpURLConnection.setRequestProperty(hTTPHeader.getKey(), hTTPHeader.getValue());
                }
            }
        }
        if (headersList.isEmpty()) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, wc2.c.a(context));
            break;
        }
        Iterator<T> it3 = headersList.iterator();
        do {
            if (!it3.hasNext()) {
                httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, wc2.c.a(context));
                break;
            }
        } while (!s.g(((GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeader) it3.next()).getKey(), HttpHeaders.USER_AGENT));
        try {
            httpURLConnection.setRequestProperty("x-garmin-user-agent", wc2.c.b(context, str, "5.5.0"));
        } catch (Throwable unused) {
        }
    }

    public final Logger b() {
        Object value = this.f178526j.getValue();
        value.getClass();
        return (Logger) value;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    public final GDIConnectIQHTTPProto.RawResourceResponse.Builder c(byte[] bArr, int i14, Map map, i.a aVar) {
        String str;
        GDIConnectIQHTTPProto.RawResourceResponse.Builder httpStatusCode = GDIConnectIQHTTPProto.RawResourceResponse.newBuilder().setHttpStatusCode(i14);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                List<String> list = (List) entry.getValue();
                if (str2 != null && str2.length() != 0 && list != null) {
                    for (String str3 : list) {
                        if (str3 != null && str3.length() != 0) {
                            httpStatusCode.addHeaders(GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeader.newBuilder().setKey(str2).setValue(str3));
                        }
                    }
                }
            }
        }
        if (bArr == null || bArr.length == 0) {
            z.i("server response ", i14, b());
            httpStatusCode.setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.UNKNOWN);
            return httpStatusCode;
        }
        GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest = this.f178519c;
        if (rawResourceRequest.hasMaxSize() && rawResourceRequest.getMaxSize() < bArr.length) {
            Logger loggerB = b();
            int length = bArr.length;
            int maxSize = rawResourceRequest.getMaxSize();
            StringBuilder sbJ = e5.j(i14, length, "server response ", ", but body ", " bytes > max allowed ");
            sbJ.append(maxSize);
            loggerB.warn(sbJ.toString());
            httpStatusCode.setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.FILE_TOO_LARGE);
            return httpStatusCode;
        }
        z.i("server response ", i14, b());
        httpStatusCode.setStatus(GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.OK);
        if (!rawResourceRequest.hasUseDataXfer() || !rawResourceRequest.getUseDataXfer()) {
            httpStatusCode.setResourceData(ByteString.copyFrom(bArr));
            return httpStatusCode;
        }
        g2 g2Var = new g2(16, aVar, this);
        URL url = this.f178523g;
        if (url == null) {
            s.m("url");
            throw null;
        }
        f178515l.getClass();
        if (nd2.e.e(url)) {
            String path = url.getPath();
            path.getClass();
            if (w.z(path, "/ephemeris", false)) {
                str = "EPHEMERIS";
            } else {
                String path2 = url.getPath();
                path2.getClass();
                if (w.z(path2, "/weather", false)) {
                    str = "WEATHER";
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
        }
        int i15 = zj2.e.f204964l;
        int iD = this.f178518b.d(bArr, g2Var, null, str);
        httpStatusCode.setResourceData(ByteString.EMPTY);
        httpStatusCode.setXferData(GDIDataTypes.DataTransferItem.newBuilder().setSize(bArr.length).setId(iD));
        httpStatusCode.getXferData();
        return httpStatusCode;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lvj2/g$a;", "", "<init>", "()V", "", "RAW_RESOURCE_LIB_ABBREVIATION", "Ljava/lang/String;", "", "DEFAULT_CONNECT_TIMEOUT_MILLIS", "I", "DEFAULT_READ_TIMEOUT_MILLIS", "", "HIDDEN_URLS", "Ljava/util/Set;", "FEATURE_GCS_EPHEMERIS", "FEATURE_GCS_WEATHER", "ciq-http-raw-resource-request_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static String a(URL url) {
            url.getClass();
            Set<String> set = g.f178516m;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    String path = url.getPath();
                    path.getClass();
                    if (w.z(path, str, false)) {
                        return tn.k.g(url.getHost(), "/****");
                    }
                }
            }
            return String.valueOf(url);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, zj2.e eVar, GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest, k kVar, rs2.c cVar) {
        this(context, eVar, rawResourceRequest, kVar, cVar, null, 32, null);
        context.getClass();
        eVar.getClass();
        rawResourceRequest.getClass();
        kVar.getClass();
        cVar.getClass();
    }

    public /* synthetic */ g(Context context, zj2.e eVar, GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest, k kVar, rs2.c cVar, String str, int i14, j jVar) {
        this(context, eVar, rawResourceRequest, kVar, cVar, (i14 & 32) != 0 ? "ciq-raw" : str);
    }
}
