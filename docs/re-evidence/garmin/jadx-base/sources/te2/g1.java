package te2;

import android.content.Context;
import java.net.URI;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/net/URI;", "<anonymous>", "(Lo53/b0;)Ljava/net/URI;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITAutoLoginURIGenerator$cas$2", f = "ITAutoLoginURIGenerator.kt", l = {76, 78, 79, 81}, m = "invokeSuspend")
public final class g1 extends v13.i implements e23.p<o53.b0, t13.d<? super URI>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1 f164036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f164037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f164038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f164039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f164040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f164041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f164042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1 f164043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ve2.h f164044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f164045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ URI f164046k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(f1 f1Var, ve2.h hVar, Context context, URI uri, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f164043h = f1Var;
        this.f164044i = hVar;
        this.f164045j = context;
        this.f164046k = uri;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g1 g1Var = new g1(this.f164043h, this.f164044i, this.f164045j, this.f164046k, dVar);
        g1Var.f164042g = obj;
        return g1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super URI> dVar) {
        return ((g1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd A[RETURN] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        o53.b0 b0Var;
        sc2.o oVar;
        URI uri;
        o53.b0 b0Var2;
        Context context;
        ve2.h hVar;
        f1 f1Var;
        ve2.d dVar;
        Object objA;
        ve2.d dVar2;
        sc2.o oVar2;
        o53.b0 b0Var3;
        f1 f1Var2;
        Exception exc;
        f1 f1Var3;
        URI uri2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164041f;
        f1 f1Var4 = this.f164043h;
        if (i14 == 0) {
            o13.r.b(obj);
            b0Var = (o53.b0) this.f164042g;
            re2.b bVar = re2.b.f152215a;
            this.f164042g = b0Var;
            this.f164041f = 1;
            obj = re2.b.p(bVar, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                oVar = (sc2.o) this.f164040e;
                uri = (URI) this.f164039d;
                context = (Context) this.f164038c;
                ve2.h hVar2 = (ve2.h) this.f164037b;
                f1 f1Var5 = this.f164036a;
                b0Var2 = (o53.b0) this.f164042g;
                o13.r.b(obj);
                hVar = hVar2;
                f1Var = f1Var5;
                obj.getClass();
                dVar = (ve2.d) obj;
                this.f164042g = b0Var2;
                this.f164036a = f1Var;
                this.f164037b = context;
                this.f164038c = uri;
                this.f164039d = oVar;
                this.f164040e = dVar;
                this.f164041f = 3;
                objA = f1.a(f1Var, hVar, dVar, this);
                if (objA != aVar) {
                    sc2.o oVar3 = oVar;
                    dVar2 = dVar;
                    obj = objA;
                    oVar2 = oVar3;
                    b0Var3 = b0Var2;
                    URI uri3 = uri;
                    f1Var2 = f1Var;
                    String str = (String) obj;
                    String str2 = dVar2.f177691b;
                    o53.b0 b0Var4 = b0Var3;
                    o13.p pVar = new o13.p(sc2.a.f158478d, oVar2.f158544a);
                    ve2.e eVar = dVar2.f177690a;
                    this.f164042g = b0Var4;
                    this.f164036a = f1Var2;
                    this.f164037b = null;
                    this.f164038c = null;
                    this.f164039d = null;
                    this.f164040e = null;
                    this.f164041f = 4;
                    obj = f1Var2.b(context, str2, pVar, eVar, uri3, str, this);
                    if (obj != aVar) {
                        f1Var3 = f1Var2;
                        uri2 = (URI) obj;
                        if (uri2 != null) {
                            return uri2;
                        }
                        f1Var4.f164026a.error("cas: no IT2 credential available");
                        r1.q2.u("cas: no IT2 credential available");
                        return null;
                    }
                }
                return aVar;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f1Var3 = this.f164036a;
                try {
                    o13.r.b(obj);
                    uri2 = (URI) obj;
                    if (uri2 != null) {
                        return uri2;
                    }
                    f1Var4.f164026a.error("cas: no IT2 credential available");
                    r1.q2.u("cas: no IT2 credential available");
                    return null;
                } catch (Exception e4) {
                    exc = e4;
                    f1Var3.f164026a.error("cas", (Throwable) exc);
                    throw exc;
                }
            }
            dVar2 = (ve2.d) this.f164040e;
            oVar2 = (sc2.o) this.f164039d;
            uri = (URI) this.f164038c;
            context = (Context) this.f164037b;
            f1Var = this.f164036a;
            b0Var3 = (o53.b0) this.f164042g;
            o13.r.b(obj);
            URI uri4 = uri;
            f1Var2 = f1Var;
            String str3 = (String) obj;
            try {
                String str4 = dVar2.f177691b;
                o53.b0 b0Var5 = b0Var3;
                o13.p pVar2 = new o13.p(sc2.a.f158478d, oVar2.f158544a);
                ve2.e eVar2 = dVar2.f177690a;
                this.f164042g = b0Var5;
                this.f164036a = f1Var2;
                this.f164037b = null;
                this.f164038c = null;
                this.f164039d = null;
                this.f164040e = null;
                this.f164041f = 4;
                obj = f1Var2.b(context, str4, pVar2, eVar2, uri4, str3, this);
                if (obj != aVar) {
                    f1Var3 = f1Var2;
                    uri2 = (URI) obj;
                    if (uri2 != null) {
                        return uri2;
                    }
                    f1Var4.f164026a.error("cas: no IT2 credential available");
                    r1.q2.u("cas: no IT2 credential available");
                    return null;
                }
                return aVar;
            } catch (Exception e14) {
                exc = e14;
                f1Var3 = f1Var2;
                f1Var3.f164026a.error("cas", (Throwable) exc);
                throw exc;
            }
        }
        b0Var = (o53.b0) this.f164042g;
        o13.r.b(obj);
        sc2.o oVar4 = (sc2.o) obj;
        if (oVar4 != null) {
            re2.b bVar2 = re2.b.f152215a;
            this.f164042g = b0Var;
            this.f164036a = f1Var4;
            ve2.h hVar3 = this.f164044i;
            this.f164037b = hVar3;
            Context context2 = this.f164045j;
            this.f164038c = context2;
            URI uri5 = this.f164046k;
            this.f164039d = uri5;
            this.f164040e = oVar4;
            this.f164041f = 2;
            bVar2.getClass();
            Object objJ = re2.b.j(this);
            if (objJ != aVar) {
                o53.b0 b0Var6 = b0Var;
                oVar = oVar4;
                obj = objJ;
                uri = uri5;
                b0Var2 = b0Var6;
                context = context2;
                hVar = hVar3;
                f1Var = f1Var4;
                obj.getClass();
                dVar = (ve2.d) obj;
                this.f164042g = b0Var2;
                this.f164036a = f1Var;
                this.f164037b = context;
                this.f164038c = uri;
                this.f164039d = oVar;
                this.f164040e = dVar;
                this.f164041f = 3;
                objA = f1.a(f1Var, hVar, dVar, this);
                if (objA != aVar) {
                    sc2.o oVar5 = oVar;
                    dVar2 = dVar;
                    obj = objA;
                    oVar2 = oVar5;
                    b0Var3 = b0Var2;
                    URI uri6 = uri;
                    f1Var2 = f1Var;
                    String str5 = (String) obj;
                    String str6 = dVar2.f177691b;
                    o53.b0 b0Var7 = b0Var3;
                    o13.p pVar3 = new o13.p(sc2.a.f158478d, oVar2.f158544a);
                    ve2.e eVar3 = dVar2.f177690a;
                    this.f164042g = b0Var7;
                    this.f164036a = f1Var2;
                    this.f164037b = null;
                    this.f164038c = null;
                    this.f164039d = null;
                    this.f164040e = null;
                    this.f164041f = 4;
                    obj = f1Var2.b(context, str6, pVar3, eVar3, uri6, str5, this);
                    if (obj != aVar) {
                        f1Var3 = f1Var2;
                        uri2 = (URI) obj;
                        if (uri2 != null) {
                            return uri2;
                        }
                    }
                }
            }
            return aVar;
        }
        f1Var4.f164026a.error("cas: no IT2 credential available");
        r1.q2.u("cas: no IT2 credential available");
        return null;
    }
}
