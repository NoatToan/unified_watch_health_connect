package bz0;

import android.content.Context;
import bt1.s;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.HashSet;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;
import org.koin.dsl.ScopeDSL;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbz0/o;", "", "<init>", "()V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f22274a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f22275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l f22276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bv0.b f22277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bv0.b f22278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Module f22279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o13.l f22280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static e23.l<? super String, Unit> f22281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f22282i;

    static {
        int i14 = gt2.c.f79010a;
        f22275b = gt2.b.f79005a.h("NetworkDI");
        f22276c = KoinJavaComponent.inject$default(zy0.l.class, null, null, 6, null);
        f22277d = new bv0.b(13);
        f22278e = new bv0.b(14);
        f22279f = ModuleDSLKt.module$default(false, new s(12), 1, null);
        f22280g = KoinJavaComponent.inject$default(OkHttpClient.class, QualifierKt.named("staticHttpClient"), null, 4, null);
    }

    private o() {
    }

    public static OkHttpClient a(o oVar, Context context, e23.l lVar, e23.a aVar, int i14) {
        boolean z14 = (i14 & 2) == 0;
        e23.l lVar2 = (i14 & 4) != 0 ? null : lVar;
        oVar.getClass();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "NetworkDI", "createUserGCHttpClient forceOAuth1[" + z14 + "]");
        ed2.c cVar = new ed2.c(context, 0, null, null, 0L, 0L, 0L, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 33554430, null);
        h().getClass();
        cVar.f63884a = 11657;
        cVar.f63893j = null;
        cVar.f63894k = az0.b.f13670a.c();
        cVar.f63895l = true;
        HashSet<Interceptor> hashSet = cVar.f63909z;
        if (z14) {
            dd2.b bVarB = h().b();
            sc2.j jVarD = h().d();
            hashSet.add(new id2.h(jVarD.f158514a, jVarD.f158515b, bVarB.f59210a, bVarB.f59211b));
        } else if (((Boolean) aVar.invoke()).booleanValue()) {
            ed2.c.b(cVar, new b(null), null, new c(null), 2);
        }
        cVar.f63896m = new a12.a(lVar2, 13);
        hashSet.add(new dz0.f((dz0.e) KoinJavaComponent.get$default(dz0.e.class, null, null, 6, null)));
        hashSet.add(new dz0.c());
        cVar.A.add(new dz0.d());
        OkHttpClient okHttpClientA = cVar.a();
        if (f22282i) {
            jd2.b.b(okHttpClientA, jd2.a.HTTP_EVENTS);
            return okHttpClientA;
        }
        jd2.b.a(okHttpClientA, jd2.a.HTTP_EVENTS);
        return okHttpClientA;
    }

    public static OkHttpClient b() {
        return (OkHttpClient) i().get((k23.d<?>) s0.f105811a.b(OkHttpClient.class), QualifierKt.named("gcHttpClient"), (e23.a<? extends ParametersHolder>) null);
    }

    public static OkHttpClient c() {
        return (OkHttpClient) i().get((k23.d<?>) s0.f105811a.b(OkHttpClient.class), QualifierKt.named("gcOAuth1HttpClient"), (e23.a<? extends ParametersHolder>) null);
    }

    public static OkHttpClient d() {
        return (OkHttpClient) i().get((k23.d<?>) s0.f105811a.b(OkHttpClient.class), QualifierKt.named("gcSyncHttpClient"), (e23.a<? extends ParametersHolder>) null);
    }

    public static OkHttpClient e() {
        return (OkHttpClient) i().get((k23.d<?>) s0.f105811a.b(OkHttpClient.class), QualifierKt.named("gcsApiUserHttpClient"), (e23.a<? extends ParametersHolder>) null);
    }

    public static OkHttpClient f() {
        return (OkHttpClient) i().get((k23.d<?>) s0.f105811a.b(OkHttpClient.class), QualifierKt.named("healthHttpClient"), (e23.a<? extends ParametersHolder>) null);
    }

    public static OkHttpClient g() {
        return (OkHttpClient) i().get((k23.d<?>) s0.f105811a.b(OkHttpClient.class), QualifierKt.named("inReachHttpClient"), (e23.a<? extends ParametersHolder>) null);
    }

    public static zy0.l h() {
        return (zy0.l) f22276c.getValue();
    }

    public static Scope i() {
        try {
            return Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), "networkScopeId", QualifierKt.named("network"), null, 4, null);
        } catch (ScopeAlreadyCreatedException e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.GENERAL, "NetworkDI", "ScopeAlreadyCreatedException getting network scope " + e4);
            return KoinJavaComponent.getKoin().getScope("networkScopeId");
        }
    }

    public static OkHttpClient j() {
        return (OkHttpClient) f22280g.getValue();
    }

    public static void m(ScopeDSL scopeDSL, StringQualifier stringQualifier, e23.l lVar) {
        b71.n nVar = new b71.n(lVar, 1, (byte) 0);
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), s0.f105811a.b(OkHttpClient.class), stringQualifier, nVar, Kind.Scoped, j0.f134944a));
        scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
        new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory);
    }

    public final synchronized void k() {
        boolean zC = h().c();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "NetworkDI", "initNetworkModule userSignedIn[" + zC + "]");
        if (zC) {
            e();
            f();
            b();
            c();
            d();
            g();
        }
    }

    public final synchronized void l() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "NetworkDI", "resetNetworkModule");
        i().close();
    }
}
