package oi;

import com.apollographql.apollo3.exception.ApolloNetworkException;
import j23.l;
import j23.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o13.q;
import o13.r;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p13.p0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Loi/c;", "Loi/e;", "Lokhttp3/Call$Factory;", "httpCallFactory", "<init>", "(Lokhttp3/Call$Factory;)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "", "timeoutMillis", "(J)V", "connectTimeout", "readTimeout", "(JJ)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f132188a;

    public c(long j8, long j14) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this(builder.connectTimeout(j8, timeUnit).readTimeout(j14, timeUnit).build());
    }

    @Override // oi.e
    public final Object a(wh.g gVar, i iVar) throws Throwable {
        IOException iOException;
        Response responseExecute;
        o53.k kVar = new o53.k(u13.f.b(iVar), 1);
        kVar.q();
        Request.Builder builderHeaders = new Request.Builder().url(gVar.f185227b).headers(ni.b.a(gVar.f185228c));
        if (gVar.f185226a == wh.f.Get) {
            builderHeaders.get();
        } else {
            wh.d dVar = gVar.f185229d;
            if (dVar == null) {
                vb.h.z("HTTP POST requires a request body");
                return null;
            }
            builderHeaders.post(new b(dVar));
        }
        Call callNewCall = this.f132188a.newCall(builderHeaders.build());
        kVar.r(new a(callNewCall));
        try {
            responseExecute = callNewCall.execute();
            iOException = null;
        } catch (IOException e4) {
            iOException = e4;
            responseExecute = null;
        }
        if (iOException != null) {
            int i14 = q.f128596b;
            kVar.resumeWith(new q.b(new ApolloNetworkException("Failed to execute GraphQL http network request", iOException)));
        } else {
            int i15 = q.f128596b;
            responseExecute.getClass();
            wh.i.a aVar = new wh.i.a(responseExecute.code());
            ResponseBody responseBodyBody = responseExecute.body();
            responseBodyBody.getClass();
            w63.g bodySource = responseBodyBody.getBodySource();
            bodySource.getClass();
            if (aVar.f185239b != null) {
                vb.h.z("body() can only be called once");
                return null;
            }
            aVar.f185239b = bodySource;
            Headers headers = responseExecute.headers();
            l lVarO = t.o(0, headers.size());
            ArrayList arrayList = new ArrayList(y.r(lVarO, 10));
            Iterator<Integer> it = lVarO.iterator();
            while (((j23.k) it).f96801c) {
                int iNextInt = ((p0) it).nextInt();
                arrayList.add(new wh.e(headers.name(iNextInt), headers.value(iNextInt)));
            }
            ArrayList arrayList2 = aVar.f185240c;
            arrayList2.addAll(arrayList);
            wh.i iVar2 = new wh.i(aVar.f185238a, arrayList2, aVar.f185239b, null, null);
            r.b(iVar2);
            int i16 = q.f128596b;
            kVar.resumeWith(iVar2);
        }
        Object objP = kVar.p();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(OkHttpClient okHttpClient) {
        this((Call.Factory) okHttpClient);
        okHttpClient.getClass();
    }

    public c(long j8) {
        this(j8, j8);
    }

    public /* synthetic */ c(long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 60000L : j8);
    }

    public c(Call.Factory factory) {
        factory.getClass();
        this.f132188a = factory;
    }
}
