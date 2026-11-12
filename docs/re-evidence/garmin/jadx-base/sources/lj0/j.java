package lj0;

import android.text.TextUtils;
import android.util.Pair;
import c22.o;
import com.garmin.android.apps.connectmobile.i2;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import oauth.signpost.exception.OAuthException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f113031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f113032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f113033d;

    public class a extends g22.c<i, e.a> {
        public a() {
        }

        @Override // g22.c
        public final e.a b(i[] iVarArr) {
            h.a aVar;
            i[] iVarArr2 = iVarArr;
            i iVar = iVarArr2[0];
            if (iVar != null && (aVar = iVar.f113026a) != null) {
                Thread.currentThread().setName("GCRequestTask:" + aVar.toString());
            }
            if (this.f75549a.isCancelled()) {
                return null;
            }
            return j.this.f(iVarArr2);
        }

        @Override // g22.c
        public final void d(e.a aVar) {
            j.this.g(aVar);
        }
    }

    public j(k kVar) {
        this.f113030a = false;
        this.f113032c = false;
        this.f113033d = null;
        this.f113031b = kVar;
    }

    public final void a() {
        a aVar = this.f113033d;
        if (aVar != null) {
            aVar.a();
        }
        this.f113032c = true;
    }

    public final void b(i iVar) {
        a aVar = new a();
        this.f113033d = aVar;
        aVar.c(iVar);
    }

    public final void c(i iVar) {
        e.a aVarF = !this.f113032c ? f(iVar) : null;
        if (this.f113032c || aVarF == null) {
            return;
        }
        i2.n("GCRequestTask", "Synchronous HTTP call: " + iVar.f113026a.f113019c);
        g(aVarF);
    }

    public final boolean d() {
        a aVar = this.f113033d;
        return aVar != null && aVar.f75549a.isActive();
    }

    public final boolean e() {
        a aVar = this.f113033d;
        return aVar != null ? aVar.f75549a.isCancelled() : this.f113032c;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e A[Catch: Exception -> 0x00a3, TryCatch #3 {Exception -> 0x00a3, blocks: (B:9:0x0053, B:13:0x0076, B:17:0x0086, B:19:0x008e, B:21:0x0094, B:27:0x009e, B:32:0x00ab, B:34:0x00df, B:37:0x00ee, B:40:0x00f6, B:42:0x00fc, B:43:0x0116, B:46:0x011c, B:48:0x012b, B:52:0x0136, B:54:0x013e, B:56:0x0144, B:82:0x01a6, B:87:0x01af, B:86:0x01ad, B:88:0x01b3, B:91:0x01c6, B:93:0x01cd, B:94:0x01cf, B:96:0x01d3, B:61:0x014e, B:63:0x0157, B:66:0x0173, B:68:0x017d, B:76:0x0198, B:81:0x01a2, B:80:0x01a0, B:70:0x0187, B:75:0x0193, B:74:0x0191, B:51:0x0134, B:12:0x0068), top: B:136:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0157 A[Catch: Exception -> 0x00a3, TryCatch #3 {Exception -> 0x00a3, blocks: (B:9:0x0053, B:13:0x0076, B:17:0x0086, B:19:0x008e, B:21:0x0094, B:27:0x009e, B:32:0x00ab, B:34:0x00df, B:37:0x00ee, B:40:0x00f6, B:42:0x00fc, B:43:0x0116, B:46:0x011c, B:48:0x012b, B:52:0x0136, B:54:0x013e, B:56:0x0144, B:82:0x01a6, B:87:0x01af, B:86:0x01ad, B:88:0x01b3, B:91:0x01c6, B:93:0x01cd, B:94:0x01cf, B:96:0x01d3, B:61:0x014e, B:63:0x0157, B:66:0x0173, B:68:0x017d, B:76:0x0198, B:81:0x01a2, B:80:0x01a0, B:70:0x0187, B:75:0x0193, B:74:0x0191, B:51:0x0134, B:12:0x0068), top: B:136:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191 A[Catch: Exception -> 0x00a3, TryCatch #3 {Exception -> 0x00a3, blocks: (B:9:0x0053, B:13:0x0076, B:17:0x0086, B:19:0x008e, B:21:0x0094, B:27:0x009e, B:32:0x00ab, B:34:0x00df, B:37:0x00ee, B:40:0x00f6, B:42:0x00fc, B:43:0x0116, B:46:0x011c, B:48:0x012b, B:52:0x0136, B:54:0x013e, B:56:0x0144, B:82:0x01a6, B:87:0x01af, B:86:0x01ad, B:88:0x01b3, B:91:0x01c6, B:93:0x01cd, B:94:0x01cf, B:96:0x01d3, B:61:0x014e, B:63:0x0157, B:66:0x0173, B:68:0x017d, B:76:0x0198, B:81:0x01a2, B:80:0x01a0, B:70:0x0187, B:75:0x0193, B:74:0x0191, B:51:0x0134, B:12:0x0068), top: B:136:0x0053 }] */
    public final e.a f(i... iVarArr) {
        String strSubstring;
        MediaType mediaTypeB;
        MediaType mediaType;
        OkHttpClient okHttpClientB;
        e.a aVar;
        if (iVarArr[0].a().length != iVarArr[0].f113026a.f113020d) {
            i2.i("GCRequestTask", "makeCall() -> Wrong number of parameters. Required " + iVarArr[0].f113026a.f113020d + ", given " + iVarArr[0].a().length);
            return null;
        }
        e eVarA = e.a();
        i iVar = iVarArr[0];
        eVarA.getClass();
        if (!((bv.d) KoinJavaComponent.get(bv.d.class)).c()) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.h("GCApiCaller").debug("URI [" + iVar.f113026a.f113019c + "] not called due to user not being signed in.");
            return null;
        }
        Request.Builder builder = new Request.Builder();
        try {
            String strConcat = MessageFormat.format(iVar.f113026a.f113019c, iVar.a());
            if (!strConcat.startsWith("http")) {
                strConcat = ((bv.d) KoinJavaComponent.get(bv.d.class)).J().concat(strConcat);
            }
            List<Pair<String, String>> list = iVar.f113028c;
            h.a aVar2 = iVar.f113026a;
            int iIndexOf = strConcat.indexOf(63);
            if (iIndexOf >= 0) {
                strSubstring = strConcat.substring(iIndexOf + 1);
                if (iVar.f113029d) {
                    d dVar = aVar2.f113017a;
                    if (dVar == d.POST || dVar == d.PUT) {
                        strConcat = strConcat.substring(0, iIndexOf);
                    } else {
                        iIndexOf = -1;
                    }
                } else {
                    iIndexOf = -1;
                }
            } else {
                strSubstring = "";
            }
            builder.url(new URL(strConcat));
            o oVar = (o) KoinJavaComponent.get(o.class);
            Locale locale = Locale.ENGLISH;
            oVar.getClass();
            builder.header(HttpHeaders.USER_AGENT, "Connect Mobile 5.30.1 11657 " + System.getProperty("http.agent"));
            String str = aVar2.f113024h;
            if (str != null) {
                builder.header(HttpHeaders.CONTENT_TYPE, str);
                mediaTypeB = e.b(aVar2.f113024h);
            } else {
                mediaTypeB = null;
            }
            if (list != null && !list.isEmpty()) {
                for (int i15 = 0; i15 < list.size(); i15++) {
                    builder.header((String) list.get(i15).first, (String) list.get(i15).second);
                }
            }
            d dVar2 = aVar2.f113021e;
            if (dVar2 != null) {
                builder.header("x-http-method-override", dVar2.name());
                if (aVar2.f113021e == d.DELETE) {
                    builder.header(HttpHeaders.ACCEPT, "*/*");
                }
            }
            RequestBody requestBodyCreate = RequestBody.create(mediaTypeB != null ? mediaTypeB : gz0.a.f80401a, "");
            if (aVar2.f113022f != null) {
                builder.header(HttpHeaders.ACCEPT, "application/json");
                if (aVar2.f113022f != null) {
                    builder.header(HttpHeaders.CONTENT_LENGTH, String.valueOf(Charset.forName("UTF-8").encode(aVar2.f113022f).limit()));
                }
                String str2 = iIndexOf >= 0 ? strSubstring : "";
                if ((!aVar2.f113024h.equals("application/x-www-form-urlencoded; charset=UTF-8") || aVar2.f113024h.equals("application/x-www-form-urlencoded")) && !TextUtils.isEmpty(str2)) {
                    if (mediaTypeB != null) {
                        mediaType = mediaTypeB;
                    } else {
                        mediaType = gz0.a.f80405e;
                    }
                    requestBodyCreate = RequestBody.create(mediaType, strSubstring);
                } else {
                    String str3 = aVar2.f113022f;
                    if (str3 != null) {
                        requestBodyCreate = RequestBody.create(mediaTypeB != null ? mediaTypeB : gz0.a.f80402b, str3);
                    }
                }
            } else {
                d dVar3 = aVar2.f113017a;
                if ((dVar3 == d.POST || dVar3 == d.PUT) && iIndexOf >= 0) {
                    builder.header(HttpHeaders.ACCEPT, "application/json");
                    if (aVar2.f113022f != null) {
                        builder.header(HttpHeaders.CONTENT_LENGTH, String.valueOf(Charset.forName("UTF-8").encode(aVar2.f113022f).limit()));
                    }
                    if (iIndexOf >= 0) {
                    }
                    if (aVar2.f113024h.equals("application/x-www-form-urlencoded; charset=UTF-8")) {
                        if (mediaTypeB != null) {
                            mediaType = mediaTypeB;
                        } else {
                            mediaType = gz0.a.f80405e;
                        }
                        requestBodyCreate = RequestBody.create(mediaType, strSubstring);
                    } else {
                        if (mediaTypeB != null) {
                            mediaType = mediaTypeB;
                        } else {
                            mediaType = gz0.a.f80405e;
                        }
                        requestBodyCreate = RequestBody.create(mediaType, strSubstring);
                    }
                }
            }
            byte[] bArr = aVar2.f113025i;
            if (bArr != null) {
                if (mediaTypeB == null) {
                    mediaTypeB = gz0.a.f80403c;
                }
                requestBodyCreate = RequestBody.create(mediaTypeB, bArr);
            }
            String strName = aVar2.f113017a.name();
            if (strName.equalsIgnoreCase(d.GET.name())) {
                requestBodyCreate = null;
            }
            builder.method(strName, requestBodyCreate);
            e.b bVar = aVar2.f113023g;
            if (bVar != null) {
                eVarA.f112976a = bVar;
            }
            d dVar4 = aVar2.f113021e;
            if (dVar4 == null) {
                dVar4 = aVar2.f113017a;
            }
            try {
                if (this.f113030a) {
                    bz0.o.f22274a.getClass();
                    okHttpClientB = bz0.o.c();
                } else {
                    bz0.o.f22274a.getClass();
                    okHttpClientB = bz0.o.b();
                }
                Response responseExecute = okHttpClientB.newCall(builder.build()).execute();
                try {
                    int iCode = responseExecute.code();
                    int[] iArr = aVar2.f113018b;
                    Arrays.sort(iArr);
                    if (Arrays.binarySearch(iArr, iCode) < 0) {
                        String strString = responseExecute.body().string();
                        int i16 = gt2.c.f79010a;
                        gt2.b.f79005a.h("GCApiCaller").debug("Unexpected response code: " + iCode + " with body: " + ((Object) strString));
                        aVar = new e.a(iVar, strString, iCode, new Exception("Unexpected server response. Expected " + Arrays.toString(aVar2.f113018b) + ", but received [" + iCode + "] for [" + dVar4.name() + StringUtils.SPACE + strConcat + "]."));
                    } else {
                        e.b bVar2 = eVarA.f112976a;
                        Object objString = bVar2 == e.b.RESPONSE_TYPE_STRING ? responseExecute.body().string() : bVar2 == e.b.RESPONSE_TYPE_BINARY_OUTPUT_STREAM ? responseExecute.body().bytes() : null;
                        aVar = objString != null ? new e.a(iVar, objString, iCode, responseExecute.headers().toMultimap()) : new e.a(iVar, (Object) null, iCode, new Exception("Empty response exception!"));
                    }
                    responseExecute.close();
                    return aVar;
                } catch (Throwable th3) {
                    if (responseExecute == null) {
                        throw th3;
                    }
                    try {
                        responseExecute.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                e.a aVar3 = new e.a(iVar, e.getMessage(), -1, e);
                int i17 = gt2.c.f79010a;
                gt2.b.f79005a.h("GCApiCaller").debug("<-- HTTP FAILED: " + e);
                return aVar3;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    public final void g(e.a aVar) {
        k kVar = this.f113031b;
        if (aVar == null) {
            kVar.a(b.f112956j);
            return;
        }
        Exception exc = aVar.f112979c;
        if (exc == null) {
            kVar.b(aVar);
            return;
        }
        if (exc.getMessage() != null) {
            i2.i("GCRequestTask", exc.getMessage());
        }
        if ((exc instanceof ConnectException) || (exc instanceof UnknownHostException)) {
            kVar.a(b.f112951e);
            return;
        }
        if (exc instanceof OAuthException) {
            kVar.a(b.f112950d);
            return;
        }
        if (exc instanceof SSLException) {
            kVar.a(b.f112953g);
        } else {
            if (exc instanceof IOException) {
                kVar.a(b.f112952f);
                return;
            }
            int i14 = aVar.f112978b;
            Object obj = aVar.f112977a;
            kVar.a(new b(i14, obj != null ? obj.toString() : ""));
        }
    }

    public j(boolean z14, k kVar) {
        this.f113032c = false;
        this.f113033d = null;
        this.f113030a = z14;
        this.f113031b = kVar;
    }
}
