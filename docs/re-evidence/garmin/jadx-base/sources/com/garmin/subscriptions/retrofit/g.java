package com.garmin.subscriptions.retrofit;

import c83.a0;
import c83.b0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import i83.s;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import n63.o;
import n63.p;
import o13.m;
import o13.r;
import o13.t;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/subscriptions/retrofit/g;", "Lmd2/a;", "Lby2/a;", "networkDelegate", "Lve2/e;", "singleUserEnvironment", "<init>", "(Lby2/a;Lve2/e;)V", "a", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements md2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by2.a f52697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve2.e f52698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f52699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f52700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f52701e;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bb\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJN\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/subscriptions/retrofit/g$a;", "", "", "customerGuid", "", "includeExpired", "bypassCache", "Lc83/a0;", "Lyx2/g;", "b", "(Ljava/lang/String;ZZLt13/d;)Ljava/lang/Object;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "localeCode", "unitId", "Lyx2/k;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lt13/d;)Ljava/lang/Object;", "groupCode", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lt13/d;)Ljava/lang/Object;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        @i83.f("customers/{customerID}/purchasablesubscriptions")
        Object a(@s("customerID") String str, @i83.t(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) String str2, @i83.t("localeCode") String str3, @i83.t("bypassCache") boolean z14, @i83.t("unitId") String str4, t13.d<? super a0<yx2.k>> dVar);

        @i83.f("customers/{customerID}/subscriptions")
        Object b(@s("customerID") String str, @i83.t("includeExpired") boolean z14, @i83.t("bypassCache") boolean z15, t13.d<? super a0<yx2.g>> dVar);

        @i83.f("customers/{customerID}/subscriptions/{groupCode}/purchasable")
        Object c(@s("customerID") String str, @s("groupCode") String str2, @i83.t(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) String str3, @i83.t("localeCode") String str4, @i83.t("bypassCache") boolean z14, @i83.t("unitId") String str5, t13.d<? super a0<yx2.k>> dVar);
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.subscriptions.retrofit.SubscriptionGatewayRetrofitManager$createService$2$1", f = "SubscriptionGatewayRetrofitManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements l<t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f52702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(1, dVar);
            this.f52702a = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new b(this.f52702a, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super String> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return this.f52702a;
        }
    }

    public g(by2.a aVar, ve2.e eVar) {
        aVar.getClass();
        this.f52697a = aVar;
        this.f52698b = eVar;
        Logger logger = LoggerFactory.getLogger("SUB#SubscriptionGatewayRetrofitManager");
        logger.getClass();
        this.f52699c = logger;
        this.f52700d = p.a(new ch1.f(17));
        this.f52701e = m.b(new e23.a() { // from class: com.garmin.subscriptions.retrofit.f
            @Override // e23.a
            public final Object invoke() {
                g gVar = this.f52696a;
                ve2.e eVar2 = gVar.f52698b;
                if (eVar2 == null) {
                    return null;
                }
                return (g.a) gVar.b(ad2.e.a(eVar2).f2788a + "/api/subscription/", null).b(g.a.class);
            }
        });
    }

    @Override // md2.a
    public final Object a(String str, md2.c cVar, md2.b bVar) {
        return md2.a.C2243a.b(this, str, cVar, bVar);
    }

    public final b0 b(String str, String str2) {
        Interceptor interceptor;
        by2.a aVar = this.f52697a;
        OkHttpClient okHttpClientC = aVar.c();
        if (okHttpClientC == null) {
            vb.h.s("cannot make subscription gateway call when not signed in");
            return null;
        }
        OkHttpClient.Builder builderNewBuilder = okHttpClientC.newBuilder();
        if (str2 == null) {
            List<Interceptor> listInterceptors = okHttpClientC.interceptors();
            if (listInterceptors == null || !listInterceptors.isEmpty()) {
                Iterator<T> it = listInterceptors.iterator();
                do {
                    if (it.hasNext()) {
                        interceptor = (Interceptor) it.next();
                        if (interceptor instanceof id2.h) {
                            break;
                        }
                    }
                } while (!(interceptor instanceof id2.i));
            }
            vb.h.s("Okhttp client must supply oauth credentials interceptor for single user client app");
            return null;
        }
        if (str2 != null) {
            id2.i.a aVar2 = id2.i.f93051e;
            b bVar = new b(str2, null);
            i31.e eVar = new i31.e(21);
            aVar2.getClass();
            builderNewBuilder.addInterceptor(new id2.i(eVar, bVar, null));
        }
        builderNewBuilder.addInterceptor(new id2.o(aVar.getContext(), "com.garmin.subscriptions", "3.6.1"));
        builderNewBuilder.addInterceptor(new id2.d(aVar.getContext()));
        OkHttpClient okHttpClientBuild = builderNewBuilder.build();
        b0.b bVar2 = new b0.b();
        bVar2.a(f83.c.a(this.f52700d, MediaType.INSTANCE.get("application/json; charset=UTF-8")));
        bVar2.b(str);
        bVar2.d(okHttpClientBuild);
        return bVar2.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(String str, ve2.e eVar, String str2, String str3, String str4, String str5, boolean z14, String str6, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f52705c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f52705c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objA = hVar.f52703a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f52705c;
        Logger logger = this.f52699c;
        if (i15 == 0) {
            r.b(objA);
            logger.debug("get purchasable subscription details for account: " + str);
            try {
                a aVar2 = (a) this.f52701e.getValue();
                if (aVar2 == null) {
                    Object objB = b(ad2.e.a(eVar).f2788a + "/api/subscription/", str2).b(a.class);
                    objB.getClass();
                    aVar2 = (a) objB;
                }
                i iVar = new i(str3, aVar2, str, str4, str5, z14, str6, null);
                hVar.f52705c = 1;
                objA = md2.a.C2243a.a(this, iVar, hVar);
                if (objA == aVar) {
                    return aVar;
                }
            } catch (Exception e4) {
                logger.error("Failed to create API for getPurchasableSubscriptions", (Throwable) e4);
                return new wc2.a.C3415a(e4, null, null, null, 14, null);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        wc2.a aVar3 = (wc2.a) objA;
        if (aVar3 instanceof wc2.a.b) {
            logger.debug("getPurchasableSubscriptions successful; response = {}", aVar3);
            return aVar3;
        }
        if (!(aVar3 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        logger.error("getPurchasableSubscriptions error! response = " + aVar3);
        return aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(String str, ve2.e eVar, String str2, boolean z14, v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f52716c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f52716c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objA = jVar.f52714a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f52716c;
        Logger logger = this.f52699c;
        if (i15 == 0) {
            r.b(objA);
            logger.debug("get subscription details for account: " + str);
            try {
                a aVar2 = (a) this.f52701e.getValue();
                if (aVar2 == null) {
                    Object objB = b(ad2.e.a(eVar).f2788a + "/api/subscription/", str2).b(a.class);
                    objB.getClass();
                    aVar2 = (a) objB;
                }
                k kVar = new k(aVar2, str, false, z14, null);
                jVar.f52716c = 1;
                objA = md2.a.C2243a.a(this, kVar, jVar);
                if (objA == aVar) {
                    return aVar;
                }
            } catch (Exception e4) {
                logger.error("Failed to create API for getSubscriptions", (Throwable) e4);
                return new wc2.a.C3415a(e4, null, null, null, 14, null);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        wc2.a aVar3 = (wc2.a) objA;
        if (aVar3 instanceof wc2.a.b) {
            logger.debug("getSubscriptions successful; response = {}", aVar3);
            wc2.a.b bVar = (wc2.a.b) aVar3;
            int i16 = bVar.f184317b;
            T t7 = bVar.f184316a;
            return t7 instanceof yx2.g ? new wc2.a.b(((yx2.g) t7).f200082a, i16) : new wc2.a.b(j0.f134944a, i16);
        }
        if (!(aVar3 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        logger.error("getSubscriptions error! response = " + aVar3);
        return aVar3;
    }

    @Override // md2.a
    public final String getTag() {
        return "SUB#SubscriptionGatewayRetrofitManager";
    }
}
