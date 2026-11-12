package te2;

import android.content.Context;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Ljava/net/URI;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Ljava/net/URI;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITAutoLoginURIGenerator$cas$4", f = "ITAutoLoginURIGenerator.kt", l = {141}, m = "invokeSuspend")
public final class i1 extends v13.i implements e23.p<o53.b0, t13.d<? super URI>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f164089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ URI f164090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f164091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve2.e f164092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f164093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o13.p<sc2.a, String> f164094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f164095h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1(f1 f1Var, URI uri, Context context, ve2.e eVar, String str, o13.p<? extends sc2.a, String> pVar, String str2, t13.d<? super i1> dVar) {
        super(2, dVar);
        this.f164089b = f1Var;
        this.f164090c = uri;
        this.f164091d = context;
        this.f164092e = eVar;
        this.f164093f = str;
        this.f164094g = pVar;
        this.f164095h = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i1(this.f164089b, this.f164090c, this.f164091d, this.f164092e, this.f164093f, this.f164094g, this.f164095h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super URI> dVar) {
        return ((i1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164088a;
        if (i14 == 0) {
            o13.r.b(obj);
            Logger logger = this.f164089b.f164026a;
            URI uri = this.f164090c;
            logger.debug("cas: service={}", uri);
            Context applicationContext = this.f164091d.getApplicationContext();
            applicationContext.getClass();
            sc2.g gVar = sc2.g.CAS;
            String string = uri.toString();
            string.getClass();
            re2.b.f152215a.getClass();
            rc2.b0 b0Var = new rc2.b0(applicationContext, this.f164092e, this.f164093f, gVar, this.f164094g, string, this.f164095h, "none_for_cas", re2.b.m().d());
            this.f164088a = 1;
            x53.c cVar = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new rc2.c0(b0Var, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        sc2.f fVar = (sc2.f) wc2.b.a((wc2.a) objE0);
        return new URL(j20.x.d(this.f164092e.f177719a, "/sso/login?logintoken=", fVar.f158498a, "&service=", URLEncoder.encode(fVar.f158499b, "UTF-8"))).toURI();
    }
}
