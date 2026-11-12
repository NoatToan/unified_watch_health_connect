package pc2;

import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "Lwc2/a;", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.diapi.DI2AbstractAuthService$doRun$2", f = "DI2AbstractAuthService.kt", l = {72, 73}, m = "invokeSuspend")
public final class a extends v13.i implements e23.p<b0, t13.d<? super wc2.a<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f137310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HttpURLConnection f137311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f137312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f137313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f137314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f137315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f137316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, boolean z14, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f137315f = bVar;
        this.f137316g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f137315f, this.f137316g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super wc2.a<Object>> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[Catch: all -> 0x001d, Exception -> 0x0021, RateLimitException -> 0x0026, Merged into TryCatch #3 {all -> 0x001d, RateLimitException -> 0x0026, Exception -> 0x0021, blocks: (B:7:0x0018, B:31:0x009e, B:33:0x00a2, B:35:0x00a6, B:41:0x00be, B:43:0x00d1, B:46:0x00eb, B:48:0x0103, B:49:0x0117, B:50:0x0124, B:51:0x0129, B:58:0x013e, B:59:0x0141, B:36:0x00ac, B:38:0x00b0, B:60:0x0142, B:63:0x014a, B:65:0x0173, B:18:0x0038, B:25:0x0082, B:27:0x0088, B:21:0x003f), top: B:74:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6 A[Catch: all -> 0x001d, Exception -> 0x0021, RateLimitException -> 0x0026, Merged into TryCatch #3 {all -> 0x001d, RateLimitException -> 0x0026, Exception -> 0x0021, blocks: (B:7:0x0018, B:31:0x009e, B:33:0x00a2, B:35:0x00a6, B:41:0x00be, B:43:0x00d1, B:46:0x00eb, B:48:0x0103, B:49:0x0117, B:50:0x0124, B:51:0x0129, B:58:0x013e, B:59:0x0141, B:36:0x00ac, B:38:0x00b0, B:60:0x0142, B:63:0x014a, B:65:0x0173, B:18:0x0038, B:25:0x0082, B:27:0x0088, B:21:0x003f), top: B:74:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: all -> 0x001d, Exception -> 0x0021, RateLimitException -> 0x0026, Merged into TryCatch #3 {all -> 0x001d, RateLimitException -> 0x0026, Exception -> 0x0021, blocks: (B:7:0x0018, B:31:0x009e, B:33:0x00a2, B:35:0x00a6, B:41:0x00be, B:43:0x00d1, B:46:0x00eb, B:48:0x0103, B:49:0x0117, B:50:0x0124, B:51:0x0129, B:58:0x013e, B:59:0x0141, B:36:0x00ac, B:38:0x00b0, B:60:0x0142, B:63:0x014a, B:65:0x0173, B:18:0x0038, B:25:0x0082, B:27:0x0088, B:21:0x003f), top: B:74:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[Catch: all -> 0x001d, Exception -> 0x0021, RateLimitException -> 0x0026, Merged into TryCatch #3 {all -> 0x001d, RateLimitException -> 0x0026, Exception -> 0x0021, blocks: (B:7:0x0018, B:31:0x009e, B:33:0x00a2, B:35:0x00a6, B:41:0x00be, B:43:0x00d1, B:46:0x00eb, B:48:0x0103, B:49:0x0117, B:50:0x0124, B:51:0x0129, B:58:0x013e, B:59:0x0141, B:36:0x00ac, B:38:0x00b0, B:60:0x0142, B:63:0x014a, B:65:0x0173, B:18:0x0038, B:25:0x0082, B:27:0x0088, B:21:0x003f), top: B:74:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb A[Catch: all -> 0x001d, Exception -> 0x0021, RateLimitException -> 0x0026, Merged into TryCatch #3 {all -> 0x001d, RateLimitException -> 0x0026, Exception -> 0x0021, blocks: (B:7:0x0018, B:31:0x009e, B:33:0x00a2, B:35:0x00a6, B:41:0x00be, B:43:0x00d1, B:46:0x00eb, B:48:0x0103, B:49:0x0117, B:50:0x0124, B:51:0x0129, B:58:0x013e, B:59:0x0141, B:36:0x00ac, B:38:0x00b0, B:60:0x0142, B:63:0x014a, B:65:0x0173, B:18:0x0038, B:25:0x0082, B:27:0x0088, B:21:0x003f), top: B:74:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0103 A[Catch: all -> 0x001d, Exception -> 0x0021, RateLimitException -> 0x0026, Merged into TryCatch #3 {all -> 0x001d, RateLimitException -> 0x0026, Exception -> 0x0021, blocks: (B:7:0x0018, B:31:0x009e, B:33:0x00a2, B:35:0x00a6, B:41:0x00be, B:43:0x00d1, B:46:0x00eb, B:48:0x0103, B:49:0x0117, B:50:0x0124, B:51:0x0129, B:58:0x013e, B:59:0x0141, B:36:0x00ac, B:38:0x00b0, B:60:0x0142, B:63:0x014a, B:65:0x0173, B:18:0x0038, B:25:0x0082, B:27:0x0088, B:21:0x003f), top: B:74:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0124 A[Catch: all -> 0x001d, Exception -> 0x0021, RateLimitException -> 0x0026, Merged into TryCatch #3 {all -> 0x001d, RateLimitException -> 0x0026, Exception -> 0x0021, blocks: (B:7:0x0018, B:31:0x009e, B:33:0x00a2, B:35:0x00a6, B:41:0x00be, B:43:0x00d1, B:46:0x00eb, B:48:0x0103, B:49:0x0117, B:50:0x0124, B:51:0x0129, B:58:0x013e, B:59:0x0141, B:36:0x00ac, B:38:0x00b0, B:60:0x0142, B:63:0x014a, B:65:0x0173, B:18:0x0038, B:25:0x0082, B:27:0x0088, B:21:0x003f), top: B:74:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0129 A[Catch: all -> 0x001d, Exception -> 0x0021, RateLimitException -> 0x0026, Merged into TryCatch #3 {all -> 0x001d, RateLimitException -> 0x0026, Exception -> 0x0021, blocks: (B:7:0x0018, B:31:0x009e, B:33:0x00a2, B:35:0x00a6, B:41:0x00be, B:43:0x00d1, B:46:0x00eb, B:48:0x0103, B:49:0x0117, B:50:0x0124, B:51:0x0129, B:58:0x013e, B:59:0x0141, B:36:0x00ac, B:38:0x00b0, B:60:0x0142, B:63:0x014a, B:65:0x0173, B:18:0x0038, B:25:0x0082, B:27:0x0088, B:21:0x003f), top: B:74:0x000a }, TRY_LEAVE] */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00eb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0103, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        wc2.a.C3415a c3415a;
        boolean z14;
        HttpURLConnection httpURLConnection;
        b bVar;
        byte[] bArr;
        boolean z15;
        byte[] bArr2;
        HttpURLConnection httpURLConnection2;
        b bVar2;
        OutputStream outputStream;
        Integer num;
        Logger logger;
        Object objA;
        String strH;
        String str;
        nc2.e eVar;
        String str2;
        String str3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137314e;
        b bVar3 = this.f137315f;
        try {
            try {
                if (i14 == 0) {
                    r.b(obj);
                    bVar3.b(bVar3.f137318g, new URL(ve2.f.d(bVar3.f137317f) + bVar3.f137319h), FirebasePerformance.HttpMethod.POST, oc.b.M(bVar3.f137320i));
                    HttpURLConnection httpURLConnection3 = bVar3.f196741b;
                    httpURLConnection3.getClass();
                    z14 = this.f137316g;
                    this.f137310a = bVar3;
                    this.f137311b = httpURLConnection3;
                    this.f137313d = z14;
                    this.f137314e = 1;
                    Object objD = bVar3.d();
                    if (objD != aVar) {
                        httpURLConnection = httpURLConnection3;
                        obj = objD;
                        bVar = bVar3;
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    z14 = this.f137313d;
                    httpURLConnection = this.f137311b;
                    bVar = this.f137310a;
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z15 = this.f137313d;
                    bArr2 = this.f137312c;
                    httpURLConnection2 = this.f137311b;
                    bVar2 = this.f137310a;
                    r.b(obj);
                }
                eVar = (nc2.e) obj;
                if (eVar != null) {
                    str2 = eVar.f125378a;
                    if (str2 != null) {
                        httpURLConnection2.setRequestProperty("app-validation", str2);
                    } else {
                        str3 = eVar.f125379b;
                        if (str3 != null) {
                            httpURLConnection2.setRequestProperty("app-validation-error", str3);
                        }
                    }
                } else {
                    bArr = bArr2;
                    bVar = bVar2;
                    z14 = z15;
                    httpURLConnection = httpURLConnection2;
                    z15 = z14;
                    httpURLConnection2 = httpURLConnection;
                    bVar2 = bVar;
                    bArr2 = bArr;
                }
                httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr2.length));
                outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bArr2);
                Unit unit = Unit.INSTANCE;
                outputStream.close();
                num = new Integer(oc.b.g(httpURLConnection2));
                bVar2.f196742c = num;
                logger = bVar2.f137318g;
                if (200 == num.intValue()) {
                    URL url = httpURLConnection2.getURL();
                    url.getClass();
                    objA = nd2.c.a(logger, url, httpURLConnection2, bVar2.f196742c);
                } else if (z15) {
                    strH = nd2.c.h(httpURLConnection2);
                    str = "200 POST " + httpURLConnection2.getURL();
                    if (nd2.c.f125412a) {
                        str = str + "\n" + strH;
                    }
                    logger.debug(str);
                    objA = new wc2.a.b(sc2.r.a(strH), 200);
                } else {
                    objA = b.c(bVar2);
                }
                bVar3.a();
                return objA;
                outputStream.write(bArr2);
                Unit unit2 = Unit.INSTANCE;
                outputStream.close();
                num = new Integer(oc.b.g(httpURLConnection2));
                bVar2.f196742c = num;
                logger = bVar2.f137318g;
                if (200 == num.intValue()) {
                    URL url2 = httpURLConnection2.getURL();
                    url2.getClass();
                    objA = nd2.c.a(logger, url2, httpURLConnection2, bVar2.f196742c);
                } else if (z15) {
                    strH = nd2.c.h(httpURLConnection2);
                    str = "200 POST " + httpURLConnection2.getURL();
                    if (nd2.c.f125412a) {
                        str = str + "\n" + strH;
                    }
                    logger.debug(str);
                    objA = new wc2.a.b(sc2.r.a(strH), 200);
                } else {
                    objA = b.c(bVar2);
                }
                bVar3.a();
                return objA;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(outputStream, th3);
                    throw th4;
                }
            }
            bArr = (byte[]) obj;
            nc2.d dVar = bVar.f137321j;
            if (dVar != null) {
                this.f137310a = bVar;
                this.f137311b = httpURLConnection;
                this.f137312c = bArr;
                this.f137313d = z14;
                this.f137314e = 2;
                Object objA2 = dVar.a(bArr, this);
                if (objA2 != aVar) {
                    z15 = z14;
                    bArr2 = bArr;
                    obj = objA2;
                    httpURLConnection2 = httpURLConnection;
                    bVar2 = bVar;
                    eVar = (nc2.e) obj;
                    if (eVar != null) {
                        str2 = eVar.f125378a;
                        if (str2 != null) {
                            httpURLConnection2.setRequestProperty("app-validation", str2);
                        } else {
                            str3 = eVar.f125379b;
                            if (str3 != null) {
                                httpURLConnection2.setRequestProperty("app-validation-error", str3);
                            }
                        }
                    } else {
                        bArr = bArr2;
                        bVar = bVar2;
                        z14 = z15;
                        httpURLConnection = httpURLConnection2;
                        z15 = z14;
                        httpURLConnection2 = httpURLConnection;
                        bVar2 = bVar;
                        bArr2 = bArr;
                    }
                }
                return aVar;
            }
            z15 = z14;
            httpURLConnection2 = httpURLConnection;
            bVar2 = bVar;
            bArr2 = bArr;
            httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr2.length));
            outputStream = httpURLConnection2.getOutputStream();
        } catch (RateLimitException e4) {
            c3415a = new wc2.a.C3415a(e4, new Integer(e4.getServerResponseCode()), e4.getError(), null, 8, null);
            return c3415a;
        } catch (Exception e14) {
            Logger logger2 = bVar3.f137318g;
            Object obj2 = bVar3.f196742c;
            if (obj2 == null) {
                obj2 = "";
            }
            logger2.error(obj2 + StringUtils.SPACE + bVar3.f196740a, (Throwable) e14);
            c3415a = new wc2.a.C3415a(e14, bVar3.f196742c, null, null, 12, null);
            return c3415a;
        } finally {
            bVar3.a();
        }
    }
}
