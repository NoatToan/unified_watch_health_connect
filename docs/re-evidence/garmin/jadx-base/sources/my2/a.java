package my2;

import android.content.Context;
import c83.b0;
import com.garmin.sync.gc.server.CheckDeviceFirmwareUpdateException;
import com.garmin.sync.retrofit.NotSignedInException;
import com.google.android.gms.wallet.WalletConstants;
import com.google.mlkit.common.MlKitException;
import d53.u;
import ds.e0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lmy2/a;", "Lhy2/d;", "", "loggingPrefix", "Lmy2/a$c;", "networkServiceFactory", "", "bufferSize", "<init>", "(Ljava/lang/String;Lmy2/a$c;I)V", "a", "b", "c", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements hy2.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2303a f121522d = new C2303a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final MediaType f121523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final MediaType f121524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f121525g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f121526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f121528c;

    public interface b {
        zi2.a a();

        OkHttpClient c();

        Context getContext();
    }

    public interface c extends b {
        b0 b(String str);

        String d();
    }

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        f121523e = companion.parse("application/octet-stream");
        f121524f = companion.parse("text/plain");
        f121525g = new int[]{200, 201, 202, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 400, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, WalletConstants.ERROR_CODE_UNKNOWN, 415, 419};
    }

    public a(String str, c cVar, int i14) {
        str.getClass();
        cVar.getClass();
        this.f121526a = cVar;
        this.f121527b = i14;
        Logger logger = LoggerFactory.getLogger(str.concat("RetrofitDelegate"));
        logger.getClass();
        this.f121528c = logger;
    }

    @Override // hy2.d
    public final zi2.a a() {
        return this.f121526a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hy2.d
    public final Object b(long j8, String str, String str2, v13.c cVar) throws NotSignedInException {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f121587f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f121587f = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objI = nVar.f121585d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f121587f;
        if (i15 == 0) {
            o13.r.b(objI);
            nVar.f121582a = str;
            nVar.f121583b = str2;
            nVar.f121587f = 1;
            objI = i(j8, nVar);
            if (objI != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objI);
                return objI;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = nVar.f121583b;
        str = nVar.f121582a;
        o13.r.b(objI);
        r rVar = (r) objI;
        nVar.f121582a = str;
        nVar.f121583b = str2;
        nVar.f121584c = rVar;
        nVar.f121587f = 2;
        t13.i iVar = new t13.i(u13.f.b(nVar));
        rVar.e(str, str2).q0(new o(iVar));
        Object objA = iVar.a();
        return objA == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hy2.d
    public final Object c(long j8, long j14, String str, String str2, v13.c cVar) throws NotSignedInException {
        my2.b bVar;
        String str3;
        if (cVar instanceof my2.b) {
            bVar = (my2.b) cVar;
            int i14 = bVar.f121535g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f121535g = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new my2.b(this, cVar);
            }
        } else {
            bVar = new my2.b(this, cVar);
        }
        Object objI = bVar.f121533e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f121535g;
        if (i15 == 0) {
            o13.r.b(objI);
            StringBuilder sbK = e0.k(j8, "ackDeviceMessage for device: ", " messageId: ");
            sbK.append(j14);
            sbK.append("  status: ");
            sbK.append(str);
            this.f121528c.debug(sbK.toString());
            if (str.length() == 0) {
                str = "received";
            }
            bVar.f121530b = str2;
            bVar.f121531c = str;
            bVar.f121529a = j14;
            bVar.f121535g = 1;
            objI = i(j8, bVar);
            if (objI != obj) {
                str3 = str;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objI);
                return objI;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j14 = bVar.f121529a;
        str3 = bVar.f121531c;
        str2 = bVar.f121530b;
        o13.r.b(objI);
        r rVar = (r) objI;
        bVar.f121530b = str2;
        bVar.f121531c = str3;
        bVar.f121532d = rVar;
        bVar.f121529a = j14;
        bVar.f121535g = 2;
        t13.i iVar = new t13.i(u13.f.b(bVar));
        rVar.g(j14, str3, str2).q0(new my2.c(iVar));
        Object objA = iVar.a();
        return objA == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // hy2.d
    public final Object d(long j8, byte[] bArr, boolean z14, boolean z15, String str, v13.c cVar) throws CheckDeviceFirmwareUpdateException, NotSignedInException {
        d dVar;
        RequestBody requestBodyCreate$default;
        String str2;
        boolean z16;
        boolean z17;
        Object objI;
        a aVar;
        long j14 = j8;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f121546j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f121546j = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f121544h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f121546j;
        if (i15 == 0) {
            o13.r.b(obj);
            if (bArr.length == 0) {
                throw new CheckDeviceFirmwareUpdateException(new IllegalArgumentException("deviceXmlBytes required"), null, 2, null);
            }
            requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, MediaType.INSTANCE.parse("application/xml; charset=utf-8"), 0, 0, 6, (Object) null);
            dVar.f121537a = this;
            str2 = str;
            dVar.f121538b = str2;
            dVar.f121539c = requestBodyCreate$default;
            dVar.f121541e = j14;
            z16 = z14;
            dVar.f121542f = z16;
            z17 = z15;
            dVar.f121543g = z17;
            dVar.f121546j = 1;
            objI = i(j14, dVar);
            if (objI != aVar2) {
                aVar = this;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z18 = dVar.f121543g;
        boolean z19 = dVar.f121542f;
        long j15 = dVar.f121541e;
        requestBodyCreate$default = dVar.f121539c;
        String str3 = dVar.f121538b;
        aVar = dVar.f121537a;
        o13.r.b(obj);
        z17 = z18;
        z16 = z19;
        objI = obj;
        j14 = j15;
        str2 = str3;
        r rVar = (r) objI;
        dVar.f121537a = aVar;
        dVar.f121538b = str2;
        dVar.f121539c = requestBodyCreate$default;
        dVar.f121540d = rVar;
        dVar.f121541e = j14;
        dVar.f121542f = z16;
        dVar.f121543g = z17;
        dVar.f121546j = 2;
        t13.i iVar = new t13.i(u13.f.b(dVar));
        rVar.f(requestBodyCreate$default, String.valueOf(z16), String.valueOf(z17), str2).q0(new e(aVar, j14, iVar));
        Object objA = iVar.a();
        return objA == aVar2 ? aVar2 : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // hy2.d
    public final Object e(long j8, String str, String str2, Map map, v13.c cVar) throws NotSignedInException {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f121580f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f121580f = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objI = lVar.f121578d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f121580f;
        if (i15 == 0) {
            o13.r.b(objI);
            id2.f.f93041c.getClass();
            this.f121528c.debug(v.h.u(j8, "getFitDeviceMessage for device: ", " URL: ", id2.f.a.a(str)));
            lVar.f121575a = str;
            lVar.f121576b = str2;
            lVar.f121577c = map;
            lVar.f121580f = 1;
            objI = i(j8, lVar);
            if (objI != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
            return objI;
        }
        map = (Map) lVar.f121577c;
        str2 = (String) lVar.f121576b;
        str = lVar.f121575a;
        o13.r.b(objI);
        r rVar = (r) objI;
        StringBuilder sb3 = new StringBuilder();
        if (!u.y(str, "/", false)) {
            sb3.append("/");
        }
        int length = str.length() - 1;
        int i16 = 0;
        boolean z14 = false;
        while (i16 <= length) {
            boolean z15 = p005kotlin.jvm.internal.s.h(str.charAt(!z14 ? i16 : length), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length--;
            } else if (z15) {
                i16++;
            } else {
                z14 = true;
            }
        }
        sb3.append(str.subSequence(i16, length + 1).toString());
        lVar.f121575a = str2;
        lVar.f121576b = map;
        lVar.f121577c = rVar;
        lVar.f121580f = 2;
        t13.i iVar = new t13.i(u13.f.b(lVar));
        rVar.b(sb3.toString(), str2, map).q0(new m(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // hy2.d
    public final Object f(long j8, String str, String str2, Map map, v13.c cVar) throws NotSignedInException {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f121565g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f121565g = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objI = hVar.f121563e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f121565g;
        if (i15 == 0) {
            o13.r.b(objI);
            id2.f.f93041c.getClass();
            this.f121528c.debug(v.h.u(j8, "getBinaryFile for device: ", " URL: ", id2.f.a.a(str)));
            hVar.f121559a = str;
            hVar.f121560b = str2;
            hVar.f121561c = map;
            hVar.f121565g = 1;
            objI = i(j8, hVar);
            if (objI != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objI);
                return objI;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        map = hVar.f121561c;
        str2 = hVar.f121560b;
        str = hVar.f121559a;
        o13.r.b(objI);
        r rVar = (r) objI;
        hVar.f121559a = str;
        hVar.f121560b = str2;
        hVar.f121561c = map;
        hVar.f121562d = rVar;
        hVar.f121565g = 2;
        t13.i iVar = new t13.i(u13.f.b(hVar));
        rVar.d(str, str2, map).q0(new i(iVar));
        Object objA = iVar.a();
        return objA == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // hy2.d
    public final Object g(long j8, String str, dz2.b bVar, String str2, List list, boolean z14, String str3, v13.c cVar) throws NotSignedInException {
        p pVar;
        String str4;
        List<o13.p> list2;
        String str5;
        String str6;
        dz2.b bVar2;
        boolean z15;
        a aVar;
        c83.d<ResponseBody> dVarH;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f121598j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f121598j = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f121596h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f121598j;
        if (i15 == 0) {
            o13.r.b(obj);
            pVar.f121589a = this;
            pVar.f121590b = str;
            pVar.f121591c = bVar;
            str4 = str2;
            pVar.f121592d = str4;
            list2 = list;
            pVar.f121593e = list2;
            pVar.f121594f = str3;
            pVar.f121595g = z14;
            pVar.f121598j = 1;
            Object objI = i(j8, pVar);
            if (objI != aVar2) {
                str5 = str;
                obj = objI;
                str6 = str3;
                bVar2 = bVar;
                z15 = z14;
                aVar = this;
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            return obj;
        }
        z15 = pVar.f121595g;
        str6 = pVar.f121594f;
        List list3 = pVar.f121593e;
        String str7 = pVar.f121592d;
        bVar2 = pVar.f121591c;
        str5 = pVar.f121590b;
        aVar = (a) pVar.f121589a;
        o13.r.b(obj);
        list2 = list3;
        str4 = str7;
        r rVar = (r) obj;
        HashMap map = new HashMap();
        if (list2 != null) {
            for (o13.p pVar2 : list2) {
                map.put(pVar2.f128594a, pVar2.f128595b);
            }
        }
        if (str6 != null) {
            map.put("LibraryVersion", str6);
        }
        if (z15) {
            dVarH = rVar.c(str4, RequestBody.Companion.create$default(RequestBody.INSTANCE, bVar2.e((int) bVar2.getF61810d()), f121524f, 0, 0, 6, (Object) null), map);
        } else {
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            aVar.getClass();
            dVarH = rVar.h(str4, companion.createFormData("userfile", str5, new g(f121523e, bVar2, aVar)), map);
        }
        pVar.f121589a = dVarH;
        pVar.f121590b = null;
        pVar.f121591c = null;
        pVar.f121592d = null;
        pVar.f121593e = null;
        pVar.f121594f = null;
        pVar.f121598j = 2;
        t13.i iVar = new t13.i(u13.f.b(pVar));
        dVarH.q0(new q(iVar));
        Object objA = iVar.a();
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        return objA == aVar2 ? aVar2 : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // hy2.d
    public final Object h(long j8, String str, Map map, v13.c cVar) throws NotSignedInException {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f121573g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f121573g = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objI = jVar.f121571e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f121573g;
        if (i15 == 0) {
            o13.r.b(objI);
            wr.g.w("getDeviceMessages for device: ", j8, this.f121528c);
            jVar.f121568b = str;
            jVar.f121569c = map;
            jVar.f121567a = j8;
            jVar.f121573g = 1;
            objI = i(j8, jVar);
            if (objI != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objI);
                return objI;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = jVar.f121567a;
        map = jVar.f121569c;
        str = jVar.f121568b;
        o13.r.b(objI);
        r rVar = (r) objI;
        jVar.f121568b = str;
        jVar.f121569c = map;
        jVar.f121570d = rVar;
        jVar.f121567a = j8;
        jVar.f121573g = 2;
        t13.i iVar = new t13.i(u13.f.b(jVar));
        rVar.a(j8, str, map).q0(new k(iVar));
        Object objA = iVar.a();
        return objA == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j8, v13.c cVar) throws NotSignedInException {
        f fVar;
        String str;
        a aVar;
        String str2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f121555f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f121555f = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objT = fVar.f121553d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f121555f;
        if (i15 == 0) {
            o13.r.b(objT);
            c cVar2 = this.f121526a;
            if (cVar2.a() == null) {
                new Long(j8);
                cVar2.c();
            }
            zi2.a aVarA = cVar2.a();
            str = aVarA != null ? aVarA.f204881b : null;
            if (str == null) {
                throw new NotSignedInException();
            }
            new Long(j8);
            OkHttpClient okHttpClientC = cVar2.c();
            if (okHttpClientC != null) {
                fVar.f121550a = this;
                fVar.f121551b = str;
                fVar.f121552c = j8;
                fVar.f121555f = 1;
                objT = gg.b.T(okHttpClientC, fVar);
                if (objT == aVar2) {
                    return aVar2;
                }
                aVar = this;
                str2 = str;
            } else {
                aVar = this;
            }
            c cVar3 = aVar.f121526a;
            new Long(j8);
            Object objB = cVar3.b(str).b(r.class);
            objB.getClass();
            return objB;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = fVar.f121552c;
        str2 = fVar.f121551b;
        aVar = fVar.f121550a;
        o13.r.b(objT);
        str = str2;
        c cVar4 = aVar.f121526a;
        new Long(j8);
        Object objB2 = cVar4.b(str).b(r.class);
        objB2.getClass();
        return objB2;
    }

    /* JADX INFO: renamed from: my2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lmy2/a$a;", "", "<init>", "()V", "", "ACK_DEVICE_MESSAGE_STATUS", "Ljava/lang/String;", "DEFAULT_MULTIPART_NAME", "", "DELTA_SOFTWARE_UPDATE_FILES_CAPABILITY", "I", "Lokhttp3/MediaType;", "OCTET_STREAM", "Lokhttp3/MediaType;", "PLAIN_TEXT", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C2303a {
        public /* synthetic */ C2303a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2303a() {
        }
    }

    public /* synthetic */ a(String str, c cVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, cVar, (i15 & 4) != 0 ? 96000 : i14);
    }
}
