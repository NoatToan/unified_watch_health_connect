package ln2;

import bz0.o;
import c83.b0;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import java.util.ArrayList;
import o13.p;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lln2/e;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zi2.a f113688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static OkHttpClient f113689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static OkHttpClient f113690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static OkHttpClient f113691e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f113693g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f113687a = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f113692f = u0.e(new p(HttpHeaders.ACCEPT, "application/prs.hal-forms+json"), new p(HttpHeaders.CONTENT_TYPE, "application/json"), new p(HttpHeaders.CACHE_CONTROL, "no-transform, no-cache"));

    static {
        int i14 = gt2.c.f79010a;
        f113693g = gt2.b.f79005a.h("PAY#NetworkServiceFactory");
    }

    private e() {
    }

    public static b0 a() {
        o.f22274a.getClass();
        OkHttpClient okHttpClientB = o.b();
        zi2.a aVar = f113688b;
        aVar.getClass();
        return e(okHttpClientB, "https://" + aVar.f204881b, null);
    }

    public static b0 b(Gson gson) {
        o.f22274a.getClass();
        OkHttpClient okHttpClientB = o.b();
        zi2.a aVar = f113688b;
        aVar.getClass();
        return e(okHttpClientB, "https://" + aVar.f204881b, gson);
    }

    public static b0 c() {
        o.f22274a.getClass();
        OkHttpClient okHttpClientE = o.e();
        zi2.a aVar = f113688b;
        aVar.getClass();
        return e(okHttpClientE, "https://" + yr2.g.a(aVar).f77351q, null);
    }

    public static OkHttpClient d(e eVar, c cVar, int i14) {
        c cVar2 = (i14 & 1) != 0 ? null : cVar;
        eVar.getClass();
        o oVar = o.f22274a;
        c cVar3 = cVar2;
        ed2.c cVar4 = new ed2.c(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), 0, null, null, 0L, 0L, 0L, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 33554430, null);
        ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).getClass();
        cVar4.f63884a = 11657;
        cVar4.f63893j = null;
        cVar4.f63896m = new d(f113693g);
        if (cVar3 != null) {
            cVar4.f63909z.add(cVar3);
        }
        oVar.getClass();
        OkHttpClient okHttpClientA = cVar4.a();
        kg1.a.f104701a.getClass();
        if (kg1.a.C2003a.a().m()) {
            jd2.b.b(okHttpClientA, jd2.a.HTTP_EVENTS);
            return okHttpClientA;
        }
        jd2.b.a(okHttpClientA, jd2.a.HTTP_EVENTS);
        return okHttpClientA;
    }

    public static b0 e(OkHttpClient okHttpClient, String str, Gson gson) {
        b0.b bVar = new b0.b();
        bVar.b(str);
        bVar.d(okHttpClient);
        d83.g gVarB = d83.g.b();
        ArrayList arrayList = bVar.f25769d;
        arrayList.add(gVarB);
        mz2.c.f122004a.getClass();
        arrayList.add(mz2.c.b.a());
        if (gson == null) {
            GsonUtil.f47252a.getClass();
            gson = GsonUtil.f47253b;
        }
        bVar.a(e83.a.d(gson));
        return bVar.c();
    }
}
