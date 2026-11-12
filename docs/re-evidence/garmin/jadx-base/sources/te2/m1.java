package te2;

import android.content.Context;
import i3.e5;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Ljava/net/URI;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Ljava/net/URI;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITAutoLoginURIGenerator$portal$4", f = "ITAutoLoginURIGenerator.kt", l = {287}, m = "invokeSuspend")
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<? super URI>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f164181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ URI f164182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f164183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve2.e f164184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f164185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o13.p<sc2.a, String> f164186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f164187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f164188i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(f1 f1Var, URI uri, Context context, ve2.e eVar, String str, o13.p<? extends sc2.a, String> pVar, String str2, String str3, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f164181b = f1Var;
        this.f164182c = uri;
        this.f164183d = context;
        this.f164184e = eVar;
        this.f164185f = str;
        this.f164186g = pVar;
        this.f164187h = str2;
        this.f164188i = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m1(this.f164181b, this.f164182c, this.f164183d, this.f164184e, this.f164185f, this.f164186g, this.f164187h, this.f164188i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super URI> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164180a;
        if (i14 == 0) {
            o13.r.b(obj);
            Logger logger = this.f164181b.f164026a;
            URI uri = this.f164182c;
            logger.debug("portal: destination={}", uri);
            Context applicationContext = this.f164183d.getApplicationContext();
            applicationContext.getClass();
            sc2.g gVar = sc2.g.PORTAL;
            String string = uri.toString();
            string.getClass();
            re2.b.f152215a.getClass();
            rc2.b0 b0Var = new rc2.b0(applicationContext, this.f164184e, this.f164185f, gVar, this.f164186g, string, this.f164187h, this.f164188i, re2.b.m().d());
            this.f164180a = 1;
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
        return new URL(am.j.o("&destination=", URLEncoder.encode(fVar.f158499b, "UTF-8"), e5.l(this.f164184e.f177719a, "/mobile/gateway/login?clientId=", this.f164188i, "&loginToken=", fVar.f158498a))).toURI();
    }
}
