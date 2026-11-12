package r92;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import okhttp3.Interceptor;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.o;
import p92.y;
import z10.g0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lr92/d;", "Lokhttp3/Interceptor;", "Lkotlin/Function0;", "", "oauth2Enabled", "<init>", "(Le23/a;)V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Boolean> f151439a;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.consent.data.api.GcOAuthInterceptor$intercept$1", f = "GcOAuthInterceptor.kt", l = {23}, m = "invokeSuspend")
    public static final class b extends v13.i implements l<t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151440a;

        public b(t13.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super String> dVar) {
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151440a;
            if (i14 == 0) {
                r.b(obj);
                o.f136619a.getClass();
                p92.a aVarL = o.l();
                this.f151440a = 1;
                obj = ((g0) aVarL).e();
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
            return ((p92.b) obj).f136576e;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lp92/b;", "<anonymous>", "(Lo53/b0;)Lp92/b;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.api.GcOAuthInterceptor$intercept$gcAuthData$1", f = "GcOAuthInterceptor.kt", l = {26}, m = "invokeSuspend")
    public static final class c extends v13.i implements p<b0, t13.d<? super p92.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151441a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super p92.b> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151441a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            o.f136619a.getClass();
            p92.a aVarL = o.l();
            this.f151441a = 1;
            p92.b bVarE = ((g0) aVarL).e();
            return bVarE == aVar ? aVar : bVarE;
        }
    }

    static {
        new a(null);
    }

    public d(e23.a<Boolean> aVar) {
        aVar.getClass();
        this.f151439a = aVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        boolean zBooleanValue = this.f151439a.invoke().booleanValue();
        String strG = com.airbnb.lottie.animation.keyframe.a.g("intercept -> isOAuth2Enabled[", "]", zBooleanValue);
        y.f136664a.getClass();
        y.a.a("GcOAuthInterceptor", strG);
        if (!zBooleanValue) {
            p92.b bVar = (p92.b) ge1.b.W(t13.h.f161748a, new c(null));
            return new id2.h(bVar.f136574c, bVar.f136575d, bVar.f136572a, bVar.f136573b).intercept(chain);
        }
        id2.i.a aVar = id2.i.f93051e;
        b bVar2 = new b(null);
        i31.e eVar = new i31.e(21);
        aVar.getClass();
        return new id2.i(eVar, bVar2, null).intercept(chain);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr92/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
