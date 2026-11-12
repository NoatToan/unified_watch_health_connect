package u10;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import e23.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import o13.r;
import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthRepo$getJsonResult$2", f = "ConnectIQOAuthRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f167742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f167743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConnectIQOAuthRequest f167744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap<String, String> f167745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, p0 p0Var, ConnectIQOAuthRequest connectIQOAuthRequest, HashMap<String, String> map, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f167742b = str;
        this.f167743c = p0Var;
        this.f167744d = connectIQOAuthRequest;
        this.f167745e = map;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f167742b, this.f167743c, this.f167744d, this.f167745e, dVar);
        fVar.f167741a = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0111 A[Catch: Exception -> 0x0117, TryCatch #8 {Exception -> 0x0117, blocks: (B:67:0x010d, B:69:0x0111, B:73:0x011b, B:75:0x0120, B:77:0x0125), top: B:85:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x011b A[Catch: Exception -> 0x0117, TryCatch #8 {Exception -> 0x0117, blocks: (B:67:0x010d, B:69:0x0111, B:73:0x011b, B:75:0x0120, B:77:0x0125), top: B:85:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0120 A[Catch: Exception -> 0x0117, TryCatch #8 {Exception -> 0x0117, blocks: (B:67:0x010d, B:69:0x0111, B:73:0x011b, B:75:0x0120, B:77:0x0125), top: B:85:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0125 A[Catch: Exception -> 0x0117, TRY_LEAVE, TryCatch #8 {Exception -> 0x0117, blocks: (B:67:0x010d, B:69:0x0111, B:73:0x011b, B:75:0x0120, B:77:0x0125), top: B:85:0x010d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.BufferedReader] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        URLConnection uRLConnectionOpenConnection;
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Exception e4;
        InputStream inputStream2;
        InputStream inputStream3;
        Object obj2;
        Throwable th3;
        ?? r14;
        ?? r15;
        p0 p0Var = this.f167743c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            try {
                uRLConnectionOpenConnection = new URL(this.f167742b).openConnection();
                uRLConnectionOpenConnection.getClass();
                try {
                    uRLConnectionOpenConnection.connect();
                    inputStream = uRLConnectionOpenConnection.getInputStream();
                    try {
                        inputStreamReader = new InputStreamReader(inputStream);
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                            try {
                                try {
                                    StringBuilder sb3 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb3.append(line);
                                    }
                                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                                        p0Var.f105807a = ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode();
                                    }
                                    JSONObject jSONObject = new JSONObject(sb3.toString());
                                    for (Map.Entry<String, String> entry : this.f167744d.getResultKeys().entrySet()) {
                                        String key = entry.getKey();
                                        String value = entry.getValue();
                                        Object objOpt = jSONObject.opt(key);
                                        if (objOpt != null) {
                                            this.f167745e.put(value, objOpt.toString());
                                        }
                                    }
                                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    inputStreamReader.close();
                                } catch (Exception e14) {
                                    e4 = e14;
                                    inputStreamReader = inputStreamReader;
                                    bufferedReader = bufferedReader;
                                    String string = e4.toString();
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.f(a2Var, "ConnectIQOAuthRepo", string);
                                    p0Var.f105807a = GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.WEB_REQUEST_ERROR.getNumber();
                                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (inputStreamReader != null) {
                                        inputStreamReader.close();
                                    }
                                    if (bufferedReader != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                r15 = inputStreamReader;
                                r14 = bufferedReader;
                                try {
                                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (r15 != 0) {
                                        r15.close();
                                    }
                                    if (r14 != 0) {
                                        r14.close();
                                    }
                                } catch (Exception e15) {
                                    String string2 = e15.toString();
                                    i2.a aVar3 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar3.getClass();
                                    i2.a.f(a2Var2, "ConnectIQOAuthRepo", string2);
                                }
                                throw th3;
                            }
                        } catch (Exception e16) {
                            bufferedReader = null;
                            e4 = e16;
                            inputStreamReader = inputStreamReader;
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream3 = null;
                            obj2 = inputStreamReader;
                            th3 = th;
                            r15 = obj2;
                            r14 = inputStream3;
                            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                                ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (r15 != 0) {
                                r15.close();
                            }
                            if (r14 != 0) {
                                r14.close();
                            }
                            throw th3;
                        }
                    } catch (Exception e17) {
                        bufferedReader = null;
                        e4 = e17;
                        inputStreamReader = null;
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream2 = null;
                        inputStream3 = inputStream2;
                        obj2 = inputStream2;
                        th3 = th;
                        r15 = obj2;
                        r14 = inputStream3;
                        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                            ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (r15 != 0) {
                            r15.close();
                        }
                        if (r14 != 0) {
                            r14.close();
                        }
                        throw th3;
                    }
                } catch (Exception e18) {
                    inputStreamReader = null;
                    bufferedReader = null;
                    e4 = e18;
                    inputStream = null;
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = null;
                    inputStream2 = inputStream;
                    inputStream3 = inputStream2;
                    obj2 = inputStream2;
                    th3 = th;
                    r15 = obj2;
                    r14 = inputStream3;
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (r15 != 0) {
                        r15.close();
                    }
                    if (r14 != 0) {
                        r14.close();
                    }
                    throw th3;
                }
            } catch (Exception e19) {
                String string3 = e19.toString();
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var3, "ConnectIQOAuthRepo", string3);
            }
        } catch (Exception e24) {
            inputStream = null;
            inputStreamReader = null;
            bufferedReader = null;
            e4 = e24;
            uRLConnectionOpenConnection = null;
        } catch (Throwable th8) {
            th = th8;
            uRLConnectionOpenConnection = null;
            inputStream = null;
        }
        bufferedReader.close();
        return Unit.INSTANCE;
    }
}
