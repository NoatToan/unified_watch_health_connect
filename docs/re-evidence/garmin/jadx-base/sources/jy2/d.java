package jy2;

import android.content.Context;
import android.os.Build;
import c83.b0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import o13.r;
import o53.a0;
import o53.c0;
import o53.s;
import o53.s0;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ljy2/d;", "", "Lmy2/a$b;", "serviceFactory", "", "omtClientName", "omtClientVersion", "", "logDebug", "<init>", "(Lmy2/a$b;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f101869e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f101870f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my2.a.b f101871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f101874d;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101875a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi2.a.CHINA_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101875a = iArr;
        }
    }

    static {
        Logger logger = LoggerFactory.getLogger("OmtFirmwareRequest");
        logger.getClass();
        f101870f = logger;
    }

    public d(my2.a.b bVar, String str, String str2, boolean z14) {
        bVar.getClass();
        str.getClass();
        this.f101871a = bVar;
        this.f101872b = str;
        this.f101873c = str2;
        this.f101874d = z14;
        x53.c cVar = s0.f129406a;
        c0.a(x53.b.f189152a.plus(ge1.b.h()).plus(new a0("OmtFirmwareRequest")));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, okhttp3.OkHttpClient] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, okhttp3.OkHttpClient] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final Object a(String str, v13.c cVar) {
        e eVar;
        ?? Build;
        String str2;
        d dVar;
        r0 r0Var;
        Context context;
        vc2.c cVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f101881f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f101881f = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f101879d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f101881f;
        if (i15 == 0) {
            r0 r0VarS = wr.g.s(obj);
            my2.a.b bVar = this.f101871a;
            OkHttpClient okHttpClientC = bVar.c();
            if (okHttpClientC == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                Context context2 = bVar.getContext();
                if (context2 != null) {
                    vc2.c.f177088e.getClass();
                    vc2.c cVar3 = vc2.c.f177089f;
                    if (cVar3 == null) {
                        Build = okHttpClientC;
                        cVar3 = new vc2.c(context2, "https://garmin.com/", false, null, 12, null);
                        vc2.c.f177089f = cVar3;
                    }
                    Build = okHttpClientC;
                    builder.addInterceptor(new id2.g(cVar3, null, 2, null)).build();
                }
                Build = okHttpClientC;
                Build = builder.build();
            }
            Build = okHttpClientC;
            r0VarS.f105810a = Build;
            eVar.f101876a = this;
            str2 = str;
            eVar.f101877b = str2;
            eVar.f101878c = r0VarS;
            eVar.f101881f = 1;
            if (gg.b.T(Build, eVar) == aVar) {
                return aVar;
            }
            dVar = this;
            r0Var = r0VarS;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = eVar.f101878c;
            str2 = eVar.f101877b;
            dVar = eVar.f101876a;
            r.b(obj);
        }
        List<Interceptor> listInterceptors = ((OkHttpClient) r0Var.f105810a).interceptors();
        if (listInterceptors == null || !listInterceptors.isEmpty()) {
            Iterator<T> it = listInterceptors.iterator();
            while (it.hasNext()) {
                if (((Interceptor) it.next()) instanceof id2.g) {
                }
            }
            context = dVar.f101871a.getContext();
            if (context != null) {
                OkHttpClient.Builder builderNewBuilder = ((OkHttpClient) r0Var.f105810a).newBuilder();
                vc2.c.f177088e.getClass();
                cVar2 = vc2.c.f177089f;
                if (cVar2 == null) {
                    vc2.c cVar4 = new vc2.c(context, "https://garmin.com/", false, null, 12, null);
                    vc2.c.f177089f = cVar4;
                    cVar2 = cVar4;
                }
                r0Var.f105810a = builderNewBuilder.addInterceptor(new id2.g(cVar2, null, 2, null)).build();
            }
        } else {
            context = dVar.f101871a.getContext();
            if (context != null) {
                OkHttpClient.Builder builderNewBuilder2 = ((OkHttpClient) r0Var.f105810a).newBuilder();
                vc2.c.f177088e.getClass();
                cVar2 = vc2.c.f177089f;
                if (cVar2 == null) {
                    vc2.c cVar5 = new vc2.c(context, "https://garmin.com/", false, null, 12, null);
                    vc2.c.f177089f = cVar5;
                    cVar2 = cVar5;
                }
                r0Var.f105810a = builderNewBuilder2.addInterceptor(new id2.g(cVar2, null, 2, null)).build();
            }
        }
        b0.b bVar2 = new b0.b();
        bVar2.b(str2);
        bVar2.d((OkHttpClient) r0Var.f105810a);
        return bVar2.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(c cVar, v13.c cVar2) throws JSONException {
        f fVar;
        String str;
        RequestBody requestBodyCreate;
        s sVarB;
        String str2;
        d dVar;
        String str3 = "";
        if (cVar2 instanceof f) {
            fVar = (f) cVar2;
            int i14 = fVar.f101888g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f101888g = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar2);
            }
        } else {
            fVar = new f(this, cVar2);
        }
        Object objA = fVar.f101886e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f101888g;
        if (i15 == 0) {
            r.b(objA);
            my2.a.b bVar = this.f101871a;
            str = this.f101873c;
            if (str == null) {
                try {
                    Context context = bVar.getContext();
                    String str4 = context != null ? context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName : null;
                    if (str4 != null) {
                        str3 = str4;
                    }
                } catch (Exception unused) {
                }
                str = str3;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("garminDeviceXml", new String(cVar.f101867a, d53.c.f57666b));
            jSONObject.put("enableDeltas", cVar.f101868b);
            RequestBody.Companion companion = RequestBody.INSTANCE;
            String string = jSONObject.toString();
            string.getClass();
            requestBodyCreate = companion.create(string, MediaType.INSTANCE.parse("application/json-patch+json"));
            sVarB = gl.b.b();
            zi2.a aVarA = bVar.a();
            int i16 = aVarA == null ? -1 : b.f101875a[aVarA.ordinal()];
            if (i16 != 1) {
                str2 = (i16 == 2 || i16 == 3) ? "omt.garmin.cn" : "omttest.garmin.com";
            } else {
                str2 = "omt.garmin.com";
            }
            String strConcat = "https://".concat(str2).concat("/api/device-software/");
            fVar.f101882a = this;
            fVar.f101883b = str;
            fVar.f101884c = requestBodyCreate;
            fVar.f101885d = sVarB;
            fVar.f101888g = 1;
            objA = a(strConcat, fVar);
            if (objA != aVar) {
                dVar = this;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objA);
                return objA;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sVarB = fVar.f101885d;
        requestBodyCreate = fVar.f101884c;
        str = fVar.f101883b;
        dVar = fVar.f101882a;
        r.b(objA);
        c83.d<ResponseBody> dVarA = ((ky2.a) ((b0) objA).b(ky2.a.class)).a("application/json", dVar.f101872b, str, "Android", String.valueOf(Build.VERSION.SDK_INT), Build.VERSION.INCREMENTAL, requestBodyCreate);
        sVarB.J(new g(sVarB, dVarA));
        dVarA.q0(new h(sVarB));
        fVar.f101882a = null;
        fVar.f101883b = null;
        fVar.f101884c = null;
        fVar.f101885d = null;
        fVar.f101888g = 2;
        Object objAwait = sVarB.await(fVar);
        return objAwait == aVar ? aVar : objAwait;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    public final ArrayList c(JSONArray jSONArray, byte[] bArr) throws JSONException {
        jy2.b bVar;
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i14);
            String strOptString = jSONObject.optString("partNumber", "");
            Logger logger = f101870f;
            boolean z14 = this.f101874d;
            jy2.a aVar = null;
            if (bArr != null) {
                try {
                    SAXParser sAXParserNewSAXParser = SAXParserFactory.newInstance().newSAXParser();
                    ly2.a aVar2 = new ly2.a(strOptString);
                    try {
                        sAXParserNewSAXParser.parse(new ByteArrayInputStream(bArr), aVar2);
                    } catch (ly2.b unused) {
                    }
                    ArrayList arrayList2 = aVar2.f115389b;
                    if (arrayList2.size() > 0) {
                        bVar = (jy2.b) arrayList2.get(0);
                    } else {
                        bVar = null;
                    }
                } catch (Exception e4) {
                    if (z14) {
                        logger.warn("Failed to parse definition from XML for " + strOptString + ": " + e4.getMessage());
                    }
                }
            } else {
                bVar = null;
            }
            try {
                aVar = new jy2.a(jSONObject, bVar);
            } catch (Exception e14) {
                if (z14) {
                    logger.error("Failed to parse FirmwareUpdate", (Throwable) e14);
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(c cVar, v13.c cVar2) throws JSONException {
        i iVar;
        d dVar;
        if (cVar2 instanceof i) {
            iVar = (i) cVar2;
            int i14 = iVar.f101895d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f101895d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar2);
            }
        } else {
            iVar = new i(this, cVar2);
        }
        Object objB = iVar.f101893b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f101895d;
        if (i15 == 0) {
            r.b(objB);
            iVar.f101892a = this;
            iVar.f101895d = 1;
            objB = b(cVar, iVar);
            if (objB == aVar) {
                return aVar;
            }
            dVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = iVar.f101892a;
            r.b(objB);
        }
        JSONObject jSONObject = (JSONObject) objB;
        if (dVar.f101874d) {
            f101870f.debug(jSONObject.toString());
        }
        if (!jSONObject.has("updates")) {
            return new JSONArray(new Integer(0));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("updates");
        jSONArray.getClass();
        return jSONArray;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ljy2/d$a;", "", "<init>", "()V", "", "OMT_DEVICE_SW_URL", "Ljava/lang/String;", "UPDATES_KEY", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(my2.a.b bVar, String str, String str2, boolean z14, int i14, j jVar) {
        this(bVar, str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? false : z14);
    }
}
