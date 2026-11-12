package vf;

import ch.qos.logback.core.CoreConstants;
import e23.p;
import java.io.Closeable;
import o13.r;
import o53.k;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sf.h;
import sf.i;
import sf.j;
import sf.n;

/* JADX INFO: loaded from: classes7.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lvf/b;", "Lsf/h;", "callFactory", "Lokhttp3/Call$Factory;", "coil-network-okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f177856a;

    private /* synthetic */ b(Call.Factory factory) {
        this.f177856a = factory;
    }

    public static final /* synthetic */ b b(OkHttpClient okHttpClient) {
        return new b(okHttpClient);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(Call.Factory factory, n nVar, j jVar, v13.c cVar) throws Throwable {
        a aVar;
        p pVar;
        p pVar2;
        Closeable closeable;
        Throwable th3;
        Closeable closeable2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f177855d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f177855d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar);
            }
        } else {
            aVar = new a(cVar);
        }
        Object objB = aVar.f177854c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f177855d;
        if (i15 == 0) {
            r.b(objB);
            aVar.f177852a = jVar;
            aVar.f177853b = factory;
            aVar.f177855d = 1;
            objB = g.b(nVar, aVar);
            if (objB != aVar2) {
            }
            pVar = jVar;
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) aVar.f177853b;
                try {
                    r.b(objB);
                    jg.b.l(closeable2, null);
                    return objB;
                } catch (Throwable th4) {
                    th3 = th4;
                    try {
                        throw th3;
                    } catch (Throwable th5) {
                        jg.b.l(closeable2, th3);
                        throw th5;
                    }
                }
            }
            p pVar3 = aVar.f177852a;
            r.b(objB);
            pVar2 = pVar3;
            closeable = (Closeable) objB;
            try {
                sf.p pVarA = g.a((Response) closeable);
                aVar.f177852a = null;
                aVar.f177853b = closeable;
                aVar.f177855d = 3;
                objB = pVar2.invoke(pVarA, aVar);
                if (objB != aVar2) {
                    closeable2 = closeable;
                    jg.b.l(closeable2, null);
                    return objB;
                }
                pVar = jVar;
                return aVar2;
            } catch (Throwable th6) {
                th3 = th6;
                closeable2 = closeable;
                throw th3;
            }
        }
        factory = (Call.Factory) aVar.f177853b;
        p pVar4 = aVar.f177852a;
        r.b(objB);
        pVar = pVar4;
        pVar = jVar;
        Call callNewCall = factory.newCall((Request) objB);
        aVar.f177852a = pVar;
        aVar.f177853b = null;
        aVar.f177855d = 2;
        k kVar = new k(u13.f.b(aVar), 1);
        kVar.q();
        c cVar2 = new c(callNewCall, kVar);
        callNewCall.enqueue(cVar2);
        kVar.r(cVar2);
        objB = kVar.p();
        if (objB != aVar2) {
            pVar2 = pVar;
            closeable = (Closeable) objB;
            sf.p pVarA2 = g.a((Response) closeable);
            aVar.f177852a = null;
            aVar.f177853b = closeable;
            aVar.f177855d = 3;
            objB = pVar2.invoke(pVarA2, aVar);
            if (objB != aVar2) {
                closeable2 = closeable;
                jg.b.l(closeable2, null);
                return objB;
            }
        }
        pVar = jVar;
        return aVar2;
    }

    @Override // sf.h
    public final Object a(n nVar, j jVar, i.b bVar) {
        return c(this.f177856a, nVar, jVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return s.g(this.f177856a, ((b) obj).f177856a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f177856a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f177856a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
