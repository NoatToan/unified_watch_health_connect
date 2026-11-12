package vf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import sf.m;
import sf.n;
import sf.o;
import sf.p;
import sf.r;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static final p a(Response response) {
        w63.g bodySource;
        int iCode = response.code();
        long jSentRequestAtMillis = response.sentRequestAtMillis();
        long jReceivedResponseAtMillis = response.receivedResponseAtMillis();
        Headers headers = response.headers();
        m.a aVar = new m.a();
        for (o13.p<? extends String, ? extends String> pVar : headers) {
            aVar.a((String) pVar.f128594a, (String) pVar.f128595b);
        }
        m mVarB = aVar.b();
        ResponseBody responseBodyBody = response.body();
        return new p(iCode, jSentRequestAtMillis, jReceivedResponseAtMillis, mVarB, (responseBodyBody == null || (bodySource = responseBodyBody.getBodySource()) == null) ? null : r.a(bodySource), response);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac A[LOOP:1: B:30:0x00a6->B:32:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(n nVar, v13.c cVar) {
        f fVar;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        Request.Builder builder3;
        n nVar2;
        String str2;
        Headers.Builder builder4;
        String key;
        Iterator<String> it;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f177867f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f177867f = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(cVar);
            }
        } else {
            fVar = new f(cVar);
        }
        Object obj = fVar.f177866e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f177867f;
        RequestBody requestBodyCreate$default = null;
        if (i15 == 0) {
            o13.r.b(obj);
            builder = new Request.Builder();
            builder.url(nVar.f158809a);
            String str3 = nVar.f158810b;
            o oVar = nVar.f158812d;
            if (oVar != null) {
                fVar.f177862a = nVar;
                fVar.f177863b = builder;
                fVar.f177864c = builder;
                fVar.f177865d = str3;
                fVar.f177867f = 1;
                Object objC = c(oVar, fVar);
                if (objC == aVar) {
                    return aVar;
                }
                builder3 = builder;
                obj = objC;
                nVar2 = nVar;
                str2 = str3;
                builder2 = builder3;
            } else {
                str = str3;
                builder2 = builder;
            }
            String str4 = str;
            nVar2 = nVar;
            str2 = str4;
            builder3 = builder;
            builder3.method(str2, requestBodyCreate$default);
            m mVar = nVar2.f158811c;
            builder4 = new Headers.Builder();
            for (Map.Entry<String, List<String>> entry : mVar.f158807a.entrySet()) {
                key = entry.getKey();
                it = entry.getValue().iterator();
                while (it.hasNext()) {
                    builder4.addUnsafeNonAscii(key, it.next());
                }
            }
            builder2.headers(builder4.build());
            return builder2.build();
        }
        if (i15 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = fVar.f177865d;
        builder3 = fVar.f177864c;
        builder2 = fVar.f177863b;
        nVar2 = fVar.f177862a;
        o13.r.b(obj);
        w63.h hVar = (w63.h) obj;
        if (hVar != null) {
            requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, hVar, (MediaType) null, 1, (Object) null);
        } else {
            n nVar3 = nVar2;
            str = str2;
            nVar = nVar3;
            builder = builder3;
            String str5 = str;
            nVar2 = nVar;
            str2 = str5;
            builder3 = builder;
        }
        builder3.method(str2, requestBodyCreate$default);
        m mVar2 = nVar2.f158811c;
        builder4 = new Headers.Builder();
        while (r6.hasNext()) {
            key = entry.getKey();
            it = entry.getValue().iterator();
            while (it.hasNext()) {
                builder4.addUnsafeNonAscii(key, it.next());
            }
        }
        builder2.headers(builder4.build());
        return builder2.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(o oVar, v13.c cVar) {
        e eVar;
        w63.e eVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f177861c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f177861c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar);
            }
        } else {
            eVar = new e(cVar);
        }
        Object obj = eVar.f177860b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f177861c;
        if (i15 == 0) {
            o13.r.b(obj);
            w63.e eVar3 = new w63.e();
            eVar.f177859a = eVar3;
            eVar.f177861c = 1;
            if (oVar.a() == aVar) {
                return aVar;
            }
            eVar2 = eVar3;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar2 = eVar.f177859a;
            o13.r.b(obj);
        }
        return eVar2.h0(eVar2.f183349b);
    }
}
