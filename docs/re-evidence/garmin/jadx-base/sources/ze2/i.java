package ze2;

import android.content.Context;
import com.google.android.gms.wallet.WalletConstants;
import d53.w;
import e23.p;
import java.net.URI;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rc2.f0;
import rc2.g0;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$xChangeTicketIT$1", f = "AbstractMFAFlowActivity.kt", l = {399, 403, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, WalletConstants.ERROR_CODE_UNKNOWN, 423, 426}, m = "invokeSuspend")
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f204298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j2 f204299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.library.mobileauth.ui.mfa.a f204300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2 f204301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f204302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f204303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f204304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.h f204305h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.android.library.mobileauth.ui.mfa.a aVar, sc2.h hVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f204304g = aVar;
        this.f204305h = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f204304g, this.f204305h, dVar);
        iVar.f204303f = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x002b, B:57:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0148, B:15:0x0038, B:40:0x00ff, B:42:0x0105, B:44:0x0108, B:46:0x010c, B:49:0x0112, B:51:0x0118, B:53:0x011c, B:18:0x004b, B:36:0x00df, B:21:0x0055, B:32:0x00ae, B:24:0x0061, B:26:0x0079, B:28:0x007d, B:66:0x0158, B:67:0x0171), top: B:73:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0108 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x002b, B:57:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0148, B:15:0x0038, B:40:0x00ff, B:42:0x0105, B:44:0x0108, B:46:0x010c, B:49:0x0112, B:51:0x0118, B:53:0x011c, B:18:0x004b, B:36:0x00df, B:21:0x0055, B:32:0x00ae, B:24:0x0061, B:26:0x0079, B:28:0x007d, B:66:0x0158, B:67:0x0171), top: B:73:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x010c A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x002b, B:57:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0148, B:15:0x0038, B:40:0x00ff, B:42:0x0105, B:44:0x0108, B:46:0x010c, B:49:0x0112, B:51:0x0118, B:53:0x011c, B:18:0x004b, B:36:0x00df, B:21:0x0055, B:32:0x00ae, B:24:0x0061, B:26:0x0079, B:28:0x007d, B:66:0x0158, B:67:0x0171), top: B:73:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x0118 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x002b, B:57:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0148, B:15:0x0038, B:40:0x00ff, B:42:0x0105, B:44:0x0108, B:46:0x010c, B:49:0x0112, B:51:0x0118, B:53:0x011c, B:18:0x004b, B:36:0x00df, B:21:0x0055, B:32:0x00ae, B:24:0x0061, B:26:0x0079, B:28:0x007d, B:66:0x0158, B:67:0x0171), top: B:73:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0145 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x002b, B:57:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0148, B:15:0x0038, B:40:0x00ff, B:42:0x0105, B:44:0x0108, B:46:0x010c, B:49:0x0112, B:51:0x0118, B:53:0x011c, B:18:0x004b, B:36:0x00df, B:21:0x0055, B:32:0x00ae, B:24:0x0061, B:26:0x0079, B:28:0x007d, B:66:0x0158, B:67:0x0171), top: B:73:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0148 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x002b, B:57:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0148, B:15:0x0038, B:40:0x00ff, B:42:0x0105, B:44:0x0108, B:46:0x010c, B:49:0x0112, B:51:0x0118, B:53:0x011c, B:18:0x004b, B:36:0x00df, B:21:0x0055, B:32:0x00ae, B:24:0x0061, B:26:0x0079, B:28:0x007d, B:66:0x0158, B:67:0x0171), top: B:73:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        if (r6.ga("xChangeTicketIT", r0, r15, r14) == r1) goto L70;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        b0 b0Var;
        sc2.c cVar;
        j2 j2Var;
        Context applicationContext;
        ve2.k kVar;
        j2 j2Var2;
        com.garmin.android.library.mobileauth.ui.mfa.a aVar;
        Context applicationContext2;
        sc2.o oVar;
        sc2.c cVar2;
        b0 b0Var2;
        ve2.k kVar2;
        String str2;
        String str3;
        URI uri;
        URI uri2;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204302e;
        com.garmin.android.library.mobileauth.ui.mfa.a aVar3 = this.f204304g;
        try {
            switch (i14) {
                case 0:
                    r.b(obj);
                    b0 b0Var3 = (b0) this.f204303f;
                    aVar3.f50497q.debug("xChangeTicketIT");
                    re2.b.f152215a.getClass();
                    sc2.l lVarC = re2.b.m().c(aVar3.ba());
                    if (lVarC == null || (str = lVarC.f158524a) == null) {
                        throw new Exception("no IT2 client configured for environment " + aVar3.ba().name());
                    }
                    Context applicationContext3 = aVar3.getApplicationContext();
                    applicationContext3.getClass();
                    f0 f0Var = new f0(applicationContext3, aVar3.ba(), this.f204305h, str, aVar3.R9().d());
                    this.f204303f = b0Var3;
                    this.f204302e = 1;
                    x53.c cVar3 = s0.f129406a;
                    Object objE0 = ge1.b.e0(x53.b.f189152a, new g0(f0Var, null), this);
                    if (objE0 != aVar2) {
                        b0Var = b0Var3;
                        obj = objE0;
                        cVar = (sc2.c) wc2.b.a((wc2.a) obj);
                        aVar3.f50497q.debug("updating sys acct...");
                        j2Var = j2.f164115a;
                        applicationContext = aVar3.getApplicationContext();
                        applicationContext.getClass();
                        kVar = cVar.f158489b;
                        this.f204303f = b0Var;
                        this.f204298a = cVar;
                        this.f204299b = j2Var;
                        this.f204300c = aVar3;
                        this.f204301d = j2Var;
                        this.f204302e = 2;
                        if (j2Var.z(applicationContext, kVar, true, this) == aVar2) {
                            j2Var2 = j2Var;
                            aVar = aVar3;
                            applicationContext2 = aVar.getApplicationContext();
                            applicationContext2.getClass();
                            oVar = cVar.f158488a;
                            this.f204303f = b0Var;
                            this.f204298a = cVar;
                            this.f204299b = j2Var2;
                            this.f204300c = null;
                            this.f204301d = null;
                            this.f204302e = 3;
                            if (j2Var.y(applicationContext2, oVar, this) != aVar2) {
                                cVar2 = cVar;
                                b0Var2 = b0Var;
                                if (!c0.g(b0Var2)) {
                                    return Unit.INSTANCE;
                                }
                                kVar2 = cVar2.f158489b;
                                if (kVar2 != null || (str2 = kVar2.f177753a) == null) {
                                    str2 = "";
                                }
                                if (!w.J(str2) || (uri2 = aVar3.f50498r) == null) {
                                    str3 = str2;
                                    uri = null;
                                    if (!c0.g(b0Var2)) {
                                        return Unit.INSTANCE;
                                    }
                                    this.f204303f = null;
                                    this.f204298a = null;
                                    this.f204299b = null;
                                    this.f204302e = 5;
                                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str3, uri, this) == aVar2) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                o13.p pVar = new o13.p(sc2.a.f158478d, cVar2.f158488a.f158544a);
                                this.f204303f = b0Var2;
                                this.f204298a = str2;
                                this.f204299b = null;
                                this.f204302e = 4;
                                Object objY9 = aVar3.Y9(uri2, str2, pVar, this);
                                if (objY9 != aVar2) {
                                    str3 = str2;
                                    obj = objY9;
                                    uri = (URI) obj;
                                    if (!c0.g(b0Var2)) {
                                        return Unit.INSTANCE;
                                    }
                                    this.f204303f = null;
                                    this.f204298a = null;
                                    this.f204299b = null;
                                    this.f204302e = 5;
                                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str3, uri, this) == aVar2) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return aVar2;
                case 1:
                    b0 b0Var4 = (b0) this.f204303f;
                    r.b(obj);
                    b0Var = b0Var4;
                    cVar = (sc2.c) wc2.b.a((wc2.a) obj);
                    aVar3.f50497q.debug("updating sys acct...");
                    j2Var = j2.f164115a;
                    applicationContext = aVar3.getApplicationContext();
                    applicationContext.getClass();
                    kVar = cVar.f158489b;
                    this.f204303f = b0Var;
                    this.f204298a = cVar;
                    this.f204299b = j2Var;
                    this.f204300c = aVar3;
                    this.f204301d = j2Var;
                    this.f204302e = 2;
                    if (j2Var.z(applicationContext, kVar, true, this) == aVar2) {
                        j2Var2 = j2Var;
                        aVar = aVar3;
                        applicationContext2 = aVar.getApplicationContext();
                        applicationContext2.getClass();
                        oVar = cVar.f158488a;
                        this.f204303f = b0Var;
                        this.f204298a = cVar;
                        this.f204299b = j2Var2;
                        this.f204300c = null;
                        this.f204301d = null;
                        this.f204302e = 3;
                        if (j2Var.y(applicationContext2, oVar, this) != aVar2) {
                            cVar2 = cVar;
                            b0Var2 = b0Var;
                            if (!c0.g(b0Var2)) {
                                return Unit.INSTANCE;
                            }
                            kVar2 = cVar2.f158489b;
                            if (kVar2 != null) {
                                str2 = "";
                            } else {
                                str2 = "";
                            }
                            if (w.J(str2)) {
                                break;
                            }
                            str3 = str2;
                            uri = null;
                            if (!c0.g(b0Var2)) {
                                return Unit.INSTANCE;
                            }
                            this.f204303f = null;
                            this.f204298a = null;
                            this.f204299b = null;
                            this.f204302e = 5;
                            if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str3, uri, this) == aVar2) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar2;
                case 2:
                    j2Var = this.f204301d;
                    aVar = this.f204300c;
                    j2Var2 = this.f204299b;
                    sc2.c cVar4 = (sc2.c) this.f204298a;
                    b0Var = (b0) this.f204303f;
                    r.b(obj);
                    cVar = cVar4;
                    applicationContext2 = aVar.getApplicationContext();
                    applicationContext2.getClass();
                    oVar = cVar.f158488a;
                    this.f204303f = b0Var;
                    this.f204298a = cVar;
                    this.f204299b = j2Var2;
                    this.f204300c = null;
                    this.f204301d = null;
                    this.f204302e = 3;
                    if (j2Var.y(applicationContext2, oVar, this) != aVar2) {
                        cVar2 = cVar;
                        b0Var2 = b0Var;
                        if (!c0.g(b0Var2)) {
                            return Unit.INSTANCE;
                        }
                        kVar2 = cVar2.f158489b;
                        if (kVar2 != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        if (w.J(str2)) {
                            break;
                        }
                        str3 = str2;
                        uri = null;
                        if (!c0.g(b0Var2)) {
                            return Unit.INSTANCE;
                        }
                        this.f204303f = null;
                        this.f204298a = null;
                        this.f204299b = null;
                        this.f204302e = 5;
                        if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str3, uri, this) == aVar2) {
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 3:
                    cVar2 = (sc2.c) this.f204298a;
                    b0Var2 = (b0) this.f204303f;
                    r.b(obj);
                    if (!c0.g(b0Var2)) {
                        return Unit.INSTANCE;
                    }
                    kVar2 = cVar2.f158489b;
                    if (kVar2 != null) {
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                    if (w.J(str2)) {
                        break;
                    }
                    str3 = str2;
                    uri = null;
                    if (!c0.g(b0Var2)) {
                        return Unit.INSTANCE;
                    }
                    this.f204303f = null;
                    this.f204298a = null;
                    this.f204299b = null;
                    this.f204302e = 5;
                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str3, uri, this) == aVar2) {
                        return aVar2;
                    }
                    return Unit.INSTANCE;
                case 4:
                    str3 = (String) this.f204298a;
                    b0Var2 = (b0) this.f204303f;
                    r.b(obj);
                    uri = (URI) obj;
                    if (!c0.g(b0Var2)) {
                        return Unit.INSTANCE;
                    }
                    this.f204303f = null;
                    this.f204298a = null;
                    this.f204299b = null;
                    this.f204302e = 5;
                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar3, str3, uri, this) == aVar2) {
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
            aVar3.f50497q.error("xChangeTicketIT", (Throwable) e4);
            l lVar = l.EXCEPTION;
            String message = e4.getMessage();
            this.f204303f = null;
            this.f204298a = null;
            this.f204299b = null;
            this.f204300c = null;
            this.f204301d = null;
            this.f204302e = 6;
        }
    }
}
