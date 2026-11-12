package to2;

import aq2.j;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import e23.p;
import fo2.u;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import o13.r;
import o53.b0;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q03.m;
import tn2.n0;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sse.UserStreamEvent$getSSE$1$1", f = "UserStreamEvent.kt", l = {106}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f165908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f165909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<h> f165910d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"to2/g$a", "Llz2/d$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements lz2.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f165911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<h> f165912b;

        public a(u uVar, m<h> mVar, Request request) {
            this.f165911a = uVar;
            this.f165912b = mVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lz2.d.a
        public final void a(lz2.d dVar, String str) {
            dVar.getClass();
            Logger logger = f.f165901f;
            logger.debug(dVar + " - onMessage: " + str);
            jo2.g gVar = jo2.g.f99843a;
            jo2.b bVar = jo2.b.KEY_API;
            gVar.getClass();
            String strA = jo2.g.a(bVar, str);
            if (strA == null) {
                logger.error("getSSE: onMessage -> payload is null");
                return;
            }
            try {
                j.f12491a.getClass();
                h hVar = (h) j.d().fromJson(strA, h.class);
                logger.trace("getSSE: parse " + strA + "\ninto\n" + hVar);
                if (hVar == null) {
                    logger.debug("getSSE: payload can't be converted into UserStreamEvent");
                    return;
                }
                d13.c.a aVar = (d13.c.a) this.f165912b;
                if (aVar.b()) {
                    return;
                }
                aVar.f57127a.c(hVar);
            } catch (Throwable th3) {
                f.f165901f.error("getSSE: onMessage -> parse fails", th3);
            }
        }

        @Override // lz2.d.a
        public final void b(lz2.c cVar) {
            cVar.getClass();
            f.f165901f.debug("getSSE: " + cVar + " - sse event closed for user " + this.f165911a.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
        }

        @Override // lz2.d.a
        public final void c(lz2.c cVar, Throwable th3, Response response) {
            cVar.getClass();
            f.f165901f.debug("getSSE: " + cVar + " - onRetryError with server response: " + response, th3);
            ((d13.c.a) this.f165912b).a(new ClosedChannelException());
        }

        @Override // lz2.d.a
        public final void d(lz2.d dVar) {
            dVar.getClass();
            f.f165901f.debug("getSSE: " + dVar + " - connected to event stream for user " + this.f165911a.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
        }

        @Override // lz2.d.a
        public final void e(lz2.d dVar, long j8) {
            dVar.getClass();
            f.f165901f.debug("getSSE: " + dVar + " - sse retry time in millis " + j8);
        }

        @Override // lz2.d.a
        public final void f(lz2.d dVar, String str) {
            dVar.getClass();
            f.f165901f.debug("getSSE: " + dVar + " - onComment -> " + str);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"to2/g$b", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements HttpLoggingInterceptor.Logger {
        @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
        public final void log(String str) {
            str.getClass();
            f.f165901f.trace(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, m<h> mVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f165909c = fVar;
        this.f165910d = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f165909c, this.f165910d, dVar);
        gVar.f165908b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String link;
        b0 b0Var = (b0) this.f165908b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165907a;
        try {
            if (i14 == 0) {
                r.b(obj);
                f.f165901f.debug("getSSE: launch");
                this.f165909c.a();
                g1 g1Var = this.f165909c.f165902a;
                this.f165908b = b0Var;
                this.f165907a = 1;
                obj = g1Var.Q(true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            u uVar = (u) obj;
            try {
                link = uVar.getLinks().getEventStream().getLink();
            } catch (Exception e4) {
                f.f165901f.error("getSSE: eventStreamUrl exception: " + e4);
                link = null;
            }
            if (link == null || link.length() == 0) {
                ((d13.c.a) this.f165910d).a(new NewFitPayException("getSSE: eventStreamUrl is null or empty, can not open sse", null, null, 6, null));
                return Unit.INSTANCE;
            }
            Request requestBuild = new Request.Builder().url(link).build();
            f fVar = this.f165909c;
            m<h> mVar = this.f165910d;
            synchronized (b0Var) {
                if (fVar.f165905d != null && fVar.f165906e != null) {
                    ((d13.c.a) mVar).a(new NewFitPayException("getSSE: currentActiveSSE and currentActiveHttpClient should be null here", null, null, 6, null));
                    return Unit.INSTANCE;
                }
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new b());
                httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.HEADERS);
                OkHttpClient okHttpClientBuild = builder.addInterceptor(httpLoggingInterceptor).readTimeout(0L, TimeUnit.SECONDS).dns(new ln2.a(null, 1, null)).eventListenerFactory(new ln2.g(true, new n0(9))).build();
                lz2.a aVar2 = new lz2.a(okHttpClientBuild);
                lz2.c cVar = new lz2.c(requestBuild, new a(uVar, mVar, requestBuild));
                cVar.f115413c = aVar2.f115409a;
                cVar.b(cVar.f115412b);
                cVar.f115414d.enqueue(new lz2.b(cVar));
                f.f165901f.debug("creating " + cVar);
                fVar.f165905d = cVar;
                fVar.f165906e = okHttpClientBuild;
                return Unit.INSTANCE;
            }
        } catch (Exception e14) {
            ((d13.c.a) this.f165910d).a(e14);
            return Unit.INSTANCE;
        }
    }
}
