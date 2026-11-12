package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lokhttp3/OkHttpClient;", "<anonymous>", "(Lo53/b0;)Lokhttp3/OkHttpClient;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$createRepository$gcsDataSource$1", f = "LivetrackService.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super OkHttpClient>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184522a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(LivetrackService livetrackService, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f184522a = livetrackService;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f184522a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super OkHttpClient> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        OkHttpClient okHttpClient;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        he2.a aVar2 = he2.a.f83529a;
        l lVar = this.f184522a.f50164d;
        if (lVar == null) {
            p005kotlin.jvm.internal.s.m("applicationDelegate");
            throw null;
        }
        kd0.e2 e2VarE = lVar.getF104145b();
        l lVar2 = this.f184522a.f50164d;
        if (lVar2 == null) {
            p005kotlin.jvm.internal.s.m("applicationDelegate");
            throw null;
        }
        kd0.e1 e1VarF = lVar2.getF104144a();
        synchronized (aVar2) {
            try {
                e2VarE.getClass();
                e1VarF.getClass();
                if (he2.a.f83531c == null) {
                    he2.a.f83531c = i2.a("HttpClientManager");
                }
                if (he2.a.f83530b == null) {
                    Logger logger = he2.a.f83531c;
                    if (logger != null) {
                        logger.debug("Creating gcsHttpClient");
                    }
                    he2.a.f83530b = he2.a.a(e2VarE, e1VarF.f(), new b("5.30.1", 11657));
                }
                okHttpClient = he2.a.f83530b;
                okHttpClient.getClass();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return okHttpClient;
    }
}
