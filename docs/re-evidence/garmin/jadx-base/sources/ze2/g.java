package ze2;

import android.content.Context;
import d53.w;
import e23.p;
import java.net.URI;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$xChangeTicketDI$1", f = "AbstractMFAFlowActivity.kt", l = {496, 500, 501, 510, 520, 523}, m = "invokeSuspend")
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f204285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j2 f204286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.library.mobileauth.ui.mfa.a f204287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2 f204288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f204289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f204290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f204291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.h f204292h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.android.library.mobileauth.ui.mfa.a aVar, sc2.h hVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f204291g = aVar;
        this.f204292h = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f204291g, this.f204292h, dVar);
        gVar.f204290f = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0018, B:12:0x0029, B:55:0x0134, B:57:0x0139, B:59:0x013f, B:61:0x0142, B:15:0x0036, B:38:0x00f9, B:40:0x00ff, B:42:0x0102, B:44:0x0106, B:47:0x010c, B:49:0x0112, B:51:0x0116, B:18:0x0049, B:34:0x00d9, B:21:0x0053, B:30:0x00a8, B:24:0x005f, B:26:0x0079, B:64:0x0152, B:65:0x016b), top: B:71:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0102 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0018, B:12:0x0029, B:55:0x0134, B:57:0x0139, B:59:0x013f, B:61:0x0142, B:15:0x0036, B:38:0x00f9, B:40:0x00ff, B:42:0x0102, B:44:0x0106, B:47:0x010c, B:49:0x0112, B:51:0x0116, B:18:0x0049, B:34:0x00d9, B:21:0x0053, B:30:0x00a8, B:24:0x005f, B:26:0x0079, B:64:0x0152, B:65:0x016b), top: B:71:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0106 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0018, B:12:0x0029, B:55:0x0134, B:57:0x0139, B:59:0x013f, B:61:0x0142, B:15:0x0036, B:38:0x00f9, B:40:0x00ff, B:42:0x0102, B:44:0x0106, B:47:0x010c, B:49:0x0112, B:51:0x0116, B:18:0x0049, B:34:0x00d9, B:21:0x0053, B:30:0x00a8, B:24:0x005f, B:26:0x0079, B:64:0x0152, B:65:0x016b), top: B:71:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0018, B:12:0x0029, B:55:0x0134, B:57:0x0139, B:59:0x013f, B:61:0x0142, B:15:0x0036, B:38:0x00f9, B:40:0x00ff, B:42:0x0102, B:44:0x0106, B:47:0x010c, B:49:0x0112, B:51:0x0116, B:18:0x0049, B:34:0x00d9, B:21:0x0053, B:30:0x00a8, B:24:0x005f, B:26:0x0079, B:64:0x0152, B:65:0x016b), top: B:71:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013f A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0018, B:12:0x0029, B:55:0x0134, B:57:0x0139, B:59:0x013f, B:61:0x0142, B:15:0x0036, B:38:0x00f9, B:40:0x00ff, B:42:0x0102, B:44:0x0106, B:47:0x010c, B:49:0x0112, B:51:0x0116, B:18:0x0049, B:34:0x00d9, B:21:0x0053, B:30:0x00a8, B:24:0x005f, B:26:0x0079, B:64:0x0152, B:65:0x016b), top: B:71:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0142 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0018, B:12:0x0029, B:55:0x0134, B:57:0x0139, B:59:0x013f, B:61:0x0142, B:15:0x0036, B:38:0x00f9, B:40:0x00ff, B:42:0x0102, B:44:0x0106, B:47:0x010c, B:49:0x0112, B:51:0x0116, B:18:0x0049, B:34:0x00d9, B:21:0x0053, B:30:0x00a8, B:24:0x005f, B:26:0x0079, B:64:0x0152, B:65:0x016b), top: B:71:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018a, code lost:
    
        if (r4.ga("xChangeTicketDI", r0, r15, r14) == r1) goto L68;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var;
        sc2.n nVar;
        j2 j2Var;
        Context applicationContext;
        ve2.k kVar;
        j2 j2Var2;
        com.garmin.android.library.mobileauth.ui.mfa.a aVar;
        Context applicationContext2;
        sc2.m mVar;
        sc2.n nVar2;
        b0 b0Var2;
        ve2.k kVar2;
        String str;
        String str2;
        URI uri;
        URI uri2;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204289e;
        com.garmin.android.library.mobileauth.ui.mfa.a aVar3 = this.f204291g;
        try {
            switch (i14) {
                case 0:
                    r.b(obj);
                    b0 b0Var3 = (b0) this.f204290f;
                    aVar3.f50497q.debug("exchangeTicketDI");
                    re2.b.f152215a.getClass();
                    sc2.l lVarB = re2.b.m().b(aVar3.ba());
                    if (lVarB == null) {
                        throw new Exception("no DI2 client configured for environment " + aVar3.ba().name());
                    }
                    Context applicationContext3 = aVar3.getApplicationContext();
                    applicationContext3.getClass();
                    pc2.p pVar = new pc2.p(applicationContext3, aVar3.ba(), this.f204292h, lVarB, re2.b.m().f177765f);
                    this.f204290f = b0Var3;
                    this.f204289e = 1;
                    x53.c cVar = s0.f129406a;
                    Object objE0 = ge1.b.e0(x53.b.f189152a, new pc2.o(pVar, null), this);
                    if (objE0 != aVar2) {
                        b0Var = b0Var3;
                        obj = objE0;
                        nVar = (sc2.n) wc2.b.a((wc2.a) obj);
                        aVar3.f50497q.debug("updating sys acct...");
                        j2Var = j2.f164115a;
                        applicationContext = aVar3.getApplicationContext();
                        applicationContext.getClass();
                        kVar = nVar.f158541a;
                        this.f204290f = b0Var;
                        this.f204285a = nVar;
                        this.f204286b = j2Var;
                        this.f204287c = aVar3;
                        this.f204288d = j2Var;
                        this.f204289e = 2;
                        if (j2Var.z(applicationContext, kVar, true, this) == aVar2) {
                            j2Var2 = j2Var;
                            aVar = aVar3;
                            applicationContext2 = aVar.getApplicationContext();
                            applicationContext2.getClass();
                            mVar = nVar.f158542b;
                            this.f204290f = b0Var;
                            this.f204285a = nVar;
                            this.f204286b = j2Var2;
                            this.f204287c = null;
                            this.f204288d = null;
                            this.f204289e = 3;
                            if (j2Var.w(applicationContext2, mVar, this) != aVar2) {
                                nVar2 = nVar;
                                b0Var2 = b0Var;
                                if (!c0.g(b0Var2)) {
                                    return Unit.INSTANCE;
                                }
                                kVar2 = nVar2.f158541a;
                                if (kVar2 != null || (str = kVar2.f177753a) == null) {
                                    str = "";
                                }
                                if (!w.J(str) || (uri2 = aVar3.f50498r) == null) {
                                    str2 = str;
                                    uri = null;
                                    if (!c0.g(b0Var2)) {
                                        return Unit.INSTANCE;
                                    }
                                    this.f204290f = null;
                                    this.f204285a = null;
                                    this.f204286b = null;
                                    this.f204289e = 5;
                                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str2, uri, this) == aVar2) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                o13.p pVar2 = new o13.p(sc2.a.f158477c, nVar2.f158542b.f158528b);
                                this.f204290f = b0Var2;
                                this.f204285a = str;
                                this.f204286b = null;
                                this.f204289e = 4;
                                Object objY9 = aVar3.Y9(uri2, str, pVar2, this);
                                if (objY9 != aVar2) {
                                    str2 = str;
                                    obj = objY9;
                                    uri = (URI) obj;
                                    if (!c0.g(b0Var2)) {
                                        return Unit.INSTANCE;
                                    }
                                    this.f204290f = null;
                                    this.f204285a = null;
                                    this.f204286b = null;
                                    this.f204289e = 5;
                                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str2, uri, this) == aVar2) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return aVar2;
                case 1:
                    b0 b0Var4 = (b0) this.f204290f;
                    r.b(obj);
                    b0Var = b0Var4;
                    nVar = (sc2.n) wc2.b.a((wc2.a) obj);
                    aVar3.f50497q.debug("updating sys acct...");
                    j2Var = j2.f164115a;
                    applicationContext = aVar3.getApplicationContext();
                    applicationContext.getClass();
                    kVar = nVar.f158541a;
                    this.f204290f = b0Var;
                    this.f204285a = nVar;
                    this.f204286b = j2Var;
                    this.f204287c = aVar3;
                    this.f204288d = j2Var;
                    this.f204289e = 2;
                    if (j2Var.z(applicationContext, kVar, true, this) == aVar2) {
                        j2Var2 = j2Var;
                        aVar = aVar3;
                        applicationContext2 = aVar.getApplicationContext();
                        applicationContext2.getClass();
                        mVar = nVar.f158542b;
                        this.f204290f = b0Var;
                        this.f204285a = nVar;
                        this.f204286b = j2Var2;
                        this.f204287c = null;
                        this.f204288d = null;
                        this.f204289e = 3;
                        if (j2Var.w(applicationContext2, mVar, this) != aVar2) {
                            nVar2 = nVar;
                            b0Var2 = b0Var;
                            if (!c0.g(b0Var2)) {
                                return Unit.INSTANCE;
                            }
                            kVar2 = nVar2.f158541a;
                            if (kVar2 != null) {
                                str = "";
                            } else {
                                str = "";
                            }
                            if (w.J(str)) {
                                break;
                            }
                            str2 = str;
                            uri = null;
                            if (!c0.g(b0Var2)) {
                                return Unit.INSTANCE;
                            }
                            this.f204290f = null;
                            this.f204285a = null;
                            this.f204286b = null;
                            this.f204289e = 5;
                            if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str2, uri, this) == aVar2) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar2;
                case 2:
                    j2Var = this.f204288d;
                    aVar = this.f204287c;
                    j2Var2 = this.f204286b;
                    sc2.n nVar3 = (sc2.n) this.f204285a;
                    b0Var = (b0) this.f204290f;
                    r.b(obj);
                    nVar = nVar3;
                    applicationContext2 = aVar.getApplicationContext();
                    applicationContext2.getClass();
                    mVar = nVar.f158542b;
                    this.f204290f = b0Var;
                    this.f204285a = nVar;
                    this.f204286b = j2Var2;
                    this.f204287c = null;
                    this.f204288d = null;
                    this.f204289e = 3;
                    if (j2Var.w(applicationContext2, mVar, this) != aVar2) {
                        nVar2 = nVar;
                        b0Var2 = b0Var;
                        if (!c0.g(b0Var2)) {
                            return Unit.INSTANCE;
                        }
                        kVar2 = nVar2.f158541a;
                        if (kVar2 != null) {
                            str = "";
                        } else {
                            str = "";
                        }
                        if (w.J(str)) {
                            break;
                        }
                        str2 = str;
                        uri = null;
                        if (!c0.g(b0Var2)) {
                            return Unit.INSTANCE;
                        }
                        this.f204290f = null;
                        this.f204285a = null;
                        this.f204286b = null;
                        this.f204289e = 5;
                        if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str2, uri, this) == aVar2) {
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 3:
                    nVar2 = (sc2.n) this.f204285a;
                    b0Var2 = (b0) this.f204290f;
                    r.b(obj);
                    if (!c0.g(b0Var2)) {
                        return Unit.INSTANCE;
                    }
                    kVar2 = nVar2.f158541a;
                    if (kVar2 != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    if (w.J(str)) {
                        break;
                    }
                    str2 = str;
                    uri = null;
                    if (!c0.g(b0Var2)) {
                        return Unit.INSTANCE;
                    }
                    this.f204290f = null;
                    this.f204285a = null;
                    this.f204286b = null;
                    this.f204289e = 5;
                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str2, uri, this) == aVar2) {
                        return aVar2;
                    }
                    return Unit.INSTANCE;
                case 4:
                    str2 = (String) this.f204285a;
                    b0Var2 = (b0) this.f204290f;
                    r.b(obj);
                    uri = (URI) obj;
                    if (!c0.g(b0Var2)) {
                        return Unit.INSTANCE;
                    }
                    this.f204290f = null;
                    this.f204285a = null;
                    this.f204286b = null;
                    this.f204289e = 5;
                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str2, uri, this) == aVar2) {
                        return aVar2;
                    }
                    return Unit.INSTANCE;
                case 5:
                    r.b(obj);
                    return Unit.INSTANCE;
                case 6:
                    r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e4) {
            aVar3.f50497q.error("xChangeTicketDI", (Throwable) e4);
            l lVar = l.EXCEPTION;
            String message = e4.getMessage();
            this.f204290f = null;
            this.f204285a = null;
            this.f204286b = null;
            this.f204287c = null;
            this.f204288d = null;
            this.f204289e = 6;
        }
    }
}
