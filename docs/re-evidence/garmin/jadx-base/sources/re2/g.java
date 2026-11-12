package re2;

import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.android.library.mobileauth.exception.CredentialExchangesExhaustedException;
import java.net.UnknownHostException;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.c1;
import te2.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/j;", "<anonymous>", "(Lo53/b0;)Lsc2/j;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getOAuth1GCCredentials$2", f = "AuthenticationHelper.kt", l = {1501}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.j>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152289a;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsc2/j;", "<anonymous>", "()Lsc2/j;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getOAuth1GCCredentials$2$1", f = "AuthenticationHelper.kt", l = {1505, 1512, 1525}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super sc2.j>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CredentialExchangesExhaustedException f152290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f152291b;

        public a(t13.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super sc2.j> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        
            if (r11 == r1) goto L51;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            u0 u0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152291b;
            try {
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            o13.r.b(obj);
                        } else {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                CredentialExchangesExhaustedException credentialExchangesExhaustedException = this.f152290a;
                                o13.r.b(obj);
                                throw credentialExchangesExhaustedException;
                            }
                            o13.r.b(obj);
                        }
                        return (sc2.j) obj;
                    }
                    o13.r.b(obj);
                    b bVar = b.f152215a;
                    sc2.a aVar2 = sc2.a.f158476b;
                    bVar.getClass();
                    b.J("getOAuth1GCCredentials", aVar2);
                    b.J("getOAuth1GCCredentials", sc2.a.f158477c);
                    bVar.I("getOAuth1GCCredentials");
                    this.f152291b = 1;
                    obj = b.j(this);
                    if (obj != aVar) {
                    }
                    return aVar;
                    obj = ge1.b.e0(new o53.a0("GetOAuth1GCCredentials").plus(s0.f129406a), new c1(u0Var, null), this);
                } catch (Exception e4) {
                    e = e4;
                    if (e instanceof RateLimitException) {
                        Logger logger = b.f152216b;
                        String message = e.getMessage();
                        logger.warn("getOAuth1ConnectCredentials: {}", message != null ? message : "");
                        throw e;
                    }
                    if (e instanceof UnknownHostException) {
                        Logger logger2 = b.f152216b;
                        String message2 = e.getMessage();
                        logger2.warn("getOAuth1ConnectCredentials: {}", message2 != null ? message2 : "");
                        throw new NoNetworkException();
                    }
                    if (!(e instanceof CredentialExchangesExhaustedException)) {
                        throw e;
                    }
                    Logger logger3 = b.f152216b;
                    String message3 = e.getMessage();
                    logger3.warn("getOAuth1ConnectCredentials: {}", message3 != null ? message3 : "");
                    b bVar2 = b.f152215a;
                    this.f152290a = (CredentialExchangesExhaustedException) e;
                    this.f152291b = 3;
                    bVar2.getClass();
                    if (b.r(this) != aVar) {
                        throw e;
                    }
                }
                obj.getClass();
                u0Var = new u0(b.f152215a.b(), (ve2.d) obj, b.m(), b.f152226l, null);
                this.f152291b = 2;
            } catch (Exception e14) {
                e = e14;
            }
        }
    }

    public g(t13.d<? super g> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.j> dVar) {
        return new g(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152289a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b.f152215a.getClass();
        cz2.c cVar = (cz2.c) b.f152230p.getValue();
        a aVar2 = new a(null);
        this.f152289a = 1;
        Object objA = cVar.a(aVar2, this);
        return objA == aVar ? aVar : objA;
    }
}
