package te2;

import android.content.Context;
import java.net.URI;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/net/URI;", "<anonymous>", "(Lo53/b0;)Ljava/net/URI;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITAutoLoginURIGenerator$portal$2", f = "ITAutoLoginURIGenerator.kt", l = {212, 214, 215, 217}, m = "invokeSuspend")
public final class k1 extends v13.i implements e23.p<o53.b0, t13.d<? super URI>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1 f164139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f164140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f164141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f164142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f164143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f164144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1 f164146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ve2.h f164147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f164148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ URI f164149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f164150l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(f1 f1Var, ve2.h hVar, Context context, URI uri, String str, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f164146h = f1Var;
        this.f164147i = hVar;
        this.f164148j = context;
        this.f164149k = uri;
        this.f164150l = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k1(this.f164146h, this.f164147i, this.f164148j, this.f164149k, this.f164150l, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super URI> dVar) {
        return ((k1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        if (r2 == r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objP;
        sc2.o oVar;
        Context context;
        String str;
        Object objJ;
        URI uri;
        ve2.h hVar;
        f1 f1Var;
        ve2.d dVar;
        Object objA;
        sc2.o oVar2;
        ve2.d dVar2;
        URI uri2;
        Context context2;
        f1 f1Var2;
        String str2;
        Object objC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        f1 f1Var3 = this.f164145g;
        f1 f1Var4 = this.f164146h;
        try {
            if (f1Var3 == 0) {
                o13.r.b(obj);
                re2.b bVar = re2.b.f152215a;
                this.f164145g = 1;
                objP = re2.b.p(bVar, this);
                if (objP != aVar) {
                }
                return aVar;
            }
            if (f1Var3 == 1) {
                o13.r.b(obj);
                objP = obj;
            } else {
                if (f1Var3 == 2) {
                    oVar = (sc2.o) this.f164144f;
                    String str3 = (String) this.f164143e;
                    uri = (URI) this.f164142d;
                    context = (Context) this.f164141c;
                    ve2.h hVar2 = (ve2.h) this.f164140b;
                    f1 f1Var5 = this.f164139a;
                    o13.r.b(obj);
                    hVar = hVar2;
                    f1Var = f1Var5;
                    str = str3;
                    objJ = obj;
                    objJ.getClass();
                    dVar = (ve2.d) objJ;
                    this.f164139a = f1Var;
                    this.f164140b = context;
                    this.f164141c = uri;
                    this.f164142d = str;
                    this.f164143e = oVar;
                    this.f164144f = dVar;
                    this.f164145g = 3;
                    objA = f1.a(f1Var, hVar, dVar, this);
                    if (objA != aVar) {
                        oVar2 = oVar;
                        dVar2 = dVar;
                        Context context3 = context;
                        uri2 = uri;
                        context2 = context3;
                        f1Var2 = f1Var;
                        str2 = str;
                        String str4 = (String) objA;
                        String str5 = dVar2.f177691b;
                        o13.p pVar = new o13.p(sc2.a.f158478d, oVar2.f158544a);
                        ve2.e eVar = dVar2.f177690a;
                        this.f164139a = f1Var2;
                        this.f164140b = null;
                        this.f164141c = null;
                        this.f164142d = null;
                        this.f164143e = null;
                        this.f164144f = null;
                        this.f164145g = 4;
                        f1 f1Var6 = f1Var2;
                        objC = f1Var6.c(context2, str5, pVar, eVar, uri2, str2, str4, this);
                        f1Var3 = f1Var6;
                    }
                    return aVar;
                }
                if (f1Var3 == 3) {
                    dVar2 = (ve2.d) this.f164144f;
                    sc2.o oVar3 = (sc2.o) this.f164143e;
                    String str6 = (String) this.f164142d;
                    URI uri3 = (URI) this.f164141c;
                    Context context4 = (Context) this.f164140b;
                    f1 f1Var7 = this.f164139a;
                    o13.r.b(obj);
                    uri2 = uri3;
                    context2 = context4;
                    f1Var2 = f1Var7;
                    str2 = str6;
                    oVar2 = oVar3;
                    objA = obj;
                    String str7 = (String) objA;
                    try {
                        String str8 = dVar2.f177691b;
                        o13.p pVar2 = new o13.p(sc2.a.f158478d, oVar2.f158544a);
                        ve2.e eVar2 = dVar2.f177690a;
                        this.f164139a = f1Var2;
                        this.f164140b = null;
                        this.f164141c = null;
                        this.f164142d = null;
                        this.f164143e = null;
                        this.f164144f = null;
                        this.f164145g = 4;
                        f1 f1Var8 = f1Var2;
                        objC = f1Var8.c(context2, str8, pVar2, eVar2, uri2, str2, str7, this);
                        f1Var3 = f1Var8;
                    } catch (Exception e4) {
                        e = e4;
                        f1Var3 = f1Var2;
                        f1Var3.f164026a.error("portal", (Throwable) e);
                        throw e;
                    }
                } else {
                    if (f1Var3 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f1 f1Var9 = this.f164139a;
                    o13.r.b(obj);
                    objC = obj;
                    f1Var3 = f1Var9;
                }
            }
            URI uri4 = (URI) objC;
            if (uri4 != null) {
                return uri4;
            }
            f1Var4.f164026a.error("portal: no IT2 credential available");
            r1.q2.u("portal: no IT2 credential available");
            return null;
            oVar = (sc2.o) objP;
            if (oVar != null) {
                re2.b bVar2 = re2.b.f152215a;
                this.f164139a = f1Var4;
                ve2.h hVar3 = this.f164147i;
                this.f164140b = hVar3;
                context = this.f164148j;
                this.f164141c = context;
                URI uri5 = this.f164149k;
                this.f164142d = uri5;
                str = this.f164150l;
                this.f164143e = str;
                this.f164144f = oVar;
                this.f164145g = 2;
                bVar2.getClass();
                objJ = re2.b.j(this);
                if (objJ != aVar) {
                    uri = uri5;
                    hVar = hVar3;
                    f1Var = f1Var4;
                    objJ.getClass();
                    dVar = (ve2.d) objJ;
                    this.f164139a = f1Var;
                    this.f164140b = context;
                    this.f164141c = uri;
                    this.f164142d = str;
                    this.f164143e = oVar;
                    this.f164144f = dVar;
                    this.f164145g = 3;
                    objA = f1.a(f1Var, hVar, dVar, this);
                    if (objA != aVar) {
                        oVar2 = oVar;
                        dVar2 = dVar;
                        Context context5 = context;
                        uri2 = uri;
                        context2 = context5;
                        f1Var2 = f1Var;
                        str2 = str;
                        String str9 = (String) objA;
                        String str10 = dVar2.f177691b;
                        o13.p pVar3 = new o13.p(sc2.a.f158478d, oVar2.f158544a);
                        ve2.e eVar3 = dVar2.f177690a;
                        this.f164139a = f1Var2;
                        this.f164140b = null;
                        this.f164141c = null;
                        this.f164142d = null;
                        this.f164143e = null;
                        this.f164144f = null;
                        this.f164145g = 4;
                        f1 f1Var10 = f1Var2;
                        objC = f1Var10.c(context2, str10, pVar3, eVar3, uri2, str2, str9, this);
                        f1Var3 = f1Var10;
                    }
                }
                return aVar;
            }
            f1Var4.f164026a.error("portal: no IT2 credential available");
            r1.q2.u("portal: no IT2 credential available");
            return null;
        } catch (Exception e14) {
            e = e14;
        }
    }
}
