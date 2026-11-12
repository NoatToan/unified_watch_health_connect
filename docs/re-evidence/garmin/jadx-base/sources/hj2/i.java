package hj2;

import c83.b0;
import ch.qos.logback.classic.Logger;
import com.google.gson.Gson;
import java.util.ArrayList;
import o53.e2;
import o53.s0;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhj2/i;", "", "<init>", "()V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f84029a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f84030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u53.d f84031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static OkHttpClient f84032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ij2.a f84033e;

    static {
        int i14 = gt2.c.f79010a;
        f84030b = gt2.b.f79005a.i("CM#NetworkServiceFactory");
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        f84031c = zl.a.e("NetworkServiceFactory", t13.g.a.C3052a.d(x53.b.f189152a, e2VarH));
        f84033e = (ij2.a) KoinJavaComponent.get$default(ij2.a.class, null, null, 6, null);
    }

    private i() {
    }

    public static final b0 a(i iVar, OkHttpClient okHttpClient, String str) {
        iVar.getClass();
        b0.b bVar = new b0.b();
        bVar.b(str);
        bVar.d(okHttpClient);
        d83.g gVarB = d83.g.b();
        ArrayList arrayList = bVar.f25769d;
        arrayList.add(gVarB);
        mz2.c.f122004a.getClass();
        arrayList.add(mz2.c.b.a());
        mj2.b.f119089a.getClass();
        Gson gson = mj2.b.f119090b;
        gson.getClass();
        bVar.a(e83.a.d(gson));
        return bVar.c();
    }

    public static OkHttpClient b(i iVar, c cVar) {
        iVar.getClass();
        ed2.c cVar2 = new ed2.c(f84033e.b(), 0, null, null, 0L, 0L, 0L, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 33554430, null);
        cVar2.f63893j = null;
        cVar2.f63909z.add(cVar);
        return cVar2.a();
    }
}
