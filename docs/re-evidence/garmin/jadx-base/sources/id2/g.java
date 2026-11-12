package id2;

import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import e23.p;
import lc.u0;
import o13.r;
import o53.c0;
import o53.s0;
import o53.z;
import okhttp3.Interceptor;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.l1;
import r53.m1;
import r53.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid2/g;", "Lokhttp3/Interceptor;", "Lvc2/c;", "networkConnectivityMonitor", "Lo53/z;", "dispatcher", "<init>", "(Lvc2/c;Lo53/z;)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile vc2.b f93047a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvc2/b;", "it", "", "<anonymous>", "(Lvc2/b;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.lib.networking.okhttp.interceptor.NoNetworkInterceptor$1", f = "NoNetworkInterceptor.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<vc2.b, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f93048a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = g.this.new a(dVar);
            aVar.f93048a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(vc2.b bVar, t13.d<? super Unit> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            g.this.f93047a = (vc2.b) this.f93048a;
            return Unit.INSTANCE;
        }
    }

    public g(vc2.c cVar, z zVar) {
        cVar.getClass();
        zVar.getClass();
        u53.d dVarA = c0.a(t13.g.a.C3052a.d(zVar, ge1.b.h()));
        this.f93047a = vc2.b.e.f177087b;
        s.C(new m1(s.s(new l1(cVar.f177091b)), new a(null)), dVarA);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws NoNetworkException {
        chain.getClass();
        vc2.b bVar = this.f93047a;
        if ((bVar instanceof vc2.b.e) || (bVar instanceof vc2.b.d) || (bVar instanceof vc2.b.C3312b)) {
            return chain.proceed(chain.request());
        }
        if ((bVar instanceof vc2.b.c) || (bVar instanceof vc2.b.a)) {
            throw new NoNetworkException();
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(vc2.c cVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(cVar, zVar);
    }
}
