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
import qc2.s;
import qc2.t;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$xChangeTicketGC$1", f = "AbstractMFAFlowActivity.kt", l = {449, 452, 461, 471, 474}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f204293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f204294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f204295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f204296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h f204297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.garmin.android.library.mobileauth.ui.mfa.a aVar, sc2.h hVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f204296d = aVar;
        this.f204297e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f204296d, this.f204297e, dVar);
        hVar.f204295c = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00dd A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0039, B:50:0x010c, B:52:0x0110, B:54:0x0116, B:56:0x0119, B:20:0x0049, B:34:0x00d7, B:36:0x00dd, B:38:0x00e0, B:40:0x00e4, B:43:0x00ea, B:45:0x00f0, B:47:0x00f4, B:23:0x0052, B:31:0x00b1, B:26:0x0060, B:28:0x0078, B:59:0x0127, B:60:0x0140), top: B:66:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0039, B:50:0x010c, B:52:0x0110, B:54:0x0116, B:56:0x0119, B:20:0x0049, B:34:0x00d7, B:36:0x00dd, B:38:0x00e0, B:40:0x00e4, B:43:0x00ea, B:45:0x00f0, B:47:0x00f4, B:23:0x0052, B:31:0x00b1, B:26:0x0060, B:28:0x0078, B:59:0x0127, B:60:0x0140), top: B:66:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0039, B:50:0x010c, B:52:0x0110, B:54:0x0116, B:56:0x0119, B:20:0x0049, B:34:0x00d7, B:36:0x00dd, B:38:0x00e0, B:40:0x00e4, B:43:0x00ea, B:45:0x00f0, B:47:0x00f4, B:23:0x0052, B:31:0x00b1, B:26:0x0060, B:28:0x0078, B:59:0x0127, B:60:0x0140), top: B:66:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0119 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0039, B:50:0x010c, B:52:0x0110, B:54:0x0116, B:56:0x0119, B:20:0x0049, B:34:0x00d7, B:36:0x00dd, B:38:0x00e0, B:40:0x00e4, B:43:0x00ea, B:45:0x00f0, B:47:0x00f4, B:23:0x0052, B:31:0x00b1, B:26:0x0060, B:28:0x0078, B:59:0x0127, B:60:0x0140), top: B:66:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
    
        if (r11.ga("xChangeTicketGC", r3, r0, r20) == r2) goto L63;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var;
        Object objE0;
        sc2.k kVar;
        ve2.k kVar2;
        String str;
        URI uri;
        URI uri2;
        Object objY9;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204294b;
        com.garmin.android.library.mobileauth.ui.mfa.a aVar2 = this.f204296d;
        try {
            if (i14 == 0) {
                r.b(obj);
                b0Var = (b0) this.f204295c;
                aVar2.f50497q.debug("xChangeTicketGC");
                re2.b.f152215a.getClass();
                dd2.b bVarA = re2.b.m().a(aVar2.ba());
                if (bVarA == null) {
                    throw new Exception("no GC1 consumer configured for environment " + aVar2.ba().name());
                }
                Context applicationContext = aVar2.getApplicationContext();
                applicationContext.getClass();
                t tVar = new t(applicationContext, aVar2.ba(), this.f204297e, bVarA.f59210a, bVarA.f59211b, re2.b.m().f177765f);
                this.f204295c = b0Var;
                this.f204294b = 1;
                x53.c cVar = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new s(tVar, null), this);
                if (objE0 == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                b0 b0Var2 = (b0) this.f204295c;
                r.b(obj);
                b0Var = b0Var2;
                objE0 = obj;
            } else {
                if (i14 == 2) {
                    kVar = (sc2.k) this.f204293a;
                    b0Var = (b0) this.f204295c;
                    r.b(obj);
                    if (!c0.g(b0Var)) {
                        return Unit.INSTANCE;
                    }
                    kVar2 = kVar.f158522a;
                    if (kVar2 != null || (str = kVar2.f177753a) == null) {
                        str = "";
                    }
                    if (!w.J(str) || (uri2 = aVar2.f50498r) == null) {
                        uri = null;
                        if (!c0.g(b0Var)) {
                            return Unit.INSTANCE;
                        }
                        this.f204295c = null;
                        this.f204293a = null;
                        this.f204294b = 4;
                        if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar2, str, uri, this) == aVar) {
                        }
                    } else {
                        o13.p pVar = new o13.p(sc2.a.f158476b, kVar.f158523b.f158514a);
                        this.f204295c = b0Var;
                        this.f204293a = str;
                        this.f204294b = 3;
                        objY9 = aVar2.Y9(uri2, str, pVar, this);
                        if (objY9 != aVar) {
                            uri = (URI) objY9;
                            if (!c0.g(b0Var)) {
                                return Unit.INSTANCE;
                            }
                            this.f204295c = null;
                            this.f204293a = null;
                            this.f204294b = 4;
                            if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar2, str, uri, this) == aVar) {
                            }
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    String str2 = (String) this.f204293a;
                    b0Var = (b0) this.f204295c;
                    r.b(obj);
                    str = str2;
                    objY9 = obj;
                    uri = (URI) objY9;
                    if (!c0.g(b0Var)) {
                        return Unit.INSTANCE;
                    }
                    this.f204295c = null;
                    this.f204293a = null;
                    this.f204294b = 4;
                    if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar2, str, uri, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 4 && i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            }
            return Unit.INSTANCE;
            kVar = (sc2.k) wc2.b.a((wc2.a) objE0);
            aVar2.f50497q.debug("updating sys acct...");
            j2 j2Var = j2.f164115a;
            Context applicationContext2 = aVar2.getApplicationContext();
            applicationContext2.getClass();
            this.f204295c = b0Var;
            this.f204293a = kVar;
            this.f204294b = 2;
            if (j2Var.x(applicationContext2, kVar, true, this) != aVar) {
                if (!c0.g(b0Var)) {
                    return Unit.INSTANCE;
                }
                kVar2 = kVar.f158522a;
                if (kVar2 != null) {
                    str = "";
                } else {
                    str = "";
                }
                if (w.J(str)) {
                }
                uri = null;
                if (!c0.g(b0Var)) {
                    return Unit.INSTANCE;
                }
                this.f204295c = null;
                this.f204293a = null;
                this.f204294b = 4;
                if (com.garmin.android.library.mobileauth.ui.mfa.a.W9(aVar2, str, uri, this) == aVar) {
                }
                return Unit.INSTANCE;
            }
        } catch (Exception e4) {
            aVar2.f50497q.error("xChangeTicketGC", (Throwable) e4);
            l lVar = l.EXCEPTION;
            String message = e4.getMessage();
            this.f204295c = null;
            this.f204293a = null;
            this.f204294b = 5;
        }
        return aVar;
    }
}
