package te2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ltc2/c;", "<anonymous>", "(Lo53/b0;)Ltc2/c;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.CustomerAgeManager$fetchAgeStatus$2", f = "CustomerAgeManager.kt", l = {97, 98, 106, 113, 114}, m = "invokeSuspend")
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super tc2.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f164158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f164159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f164161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f164161d = k0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f164161d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super tc2.c> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a6 A[PHI: r2
      0x00a6: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v22 java.lang.Object) binds: [B:24:0x00a3, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:48:0x00fc, B:50:0x0105, B:52:0x0118, B:56:0x0124, B:57:0x0129), top: B:67:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0118 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:48:0x00fc, B:50:0x0105, B:52:0x0118, B:56:0x0124, B:57:0x0129), top: B:67:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0124 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:48:0x00fc, B:50:0x0105, B:52:0x0118, B:56:0x0124, B:57:0x0129), top: B:67:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:64:0x013a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:65:0x013b  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r2 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objA;
        String str;
        Object objJ;
        Object objE0;
        wc2.a aVar;
        Exception exc;
        Integer num;
        Object objA2;
        tc2.c cVar;
        Object objC;
        String str2;
        Context contextB;
        SharedPreferences sharedPreferences;
        Account accountK;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164160c;
        k0 k0Var = this.f164161d;
        if (i14 == 0) {
            o13.r.b(obj);
            re2.b.f152215a.I("CustomerAgeMgr.fetchAgeStatus");
            this.f164160c = 1;
            objA = k0.a(k0Var, this);
            if (objA != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA = obj;
        } else {
            if (i14 == 2) {
                str = (String) this.f164158a;
                o13.r.b(obj);
                objJ = obj;
                String str3 = str;
                objJ.getClass();
                ve2.d dVar = (ve2.d) objJ;
                rc2.r rVar = new rc2.r(re2.b.f152215a.b(), dVar.f177690a, dVar.f177691b, str3, re2.b.m().d());
                this.f164158a = null;
                this.f164160c = 3;
                x53.c cVar2 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new rc2.s(rVar, null), this);
                if (objE0 != aVar2) {
                    aVar = (wc2.a) objE0;
                    if (!(aVar instanceof wc2.a.b)) {
                        if (!(aVar instanceof wc2.a.C3415a)) {
                            lc.u0.r();
                            return null;
                        }
                        wc2.a.C3415a c3415a = (wc2.a.C3415a) aVar;
                        exc = c3415a.f184312a;
                        num = c3415a.f184313b;
                        if (num != null) {
                            throw exc;
                        }
                        throw exc;
                    }
                    cVar = (tc2.c) ((wc2.a.b) aVar).f184316a;
                    str2 = cVar.f163844a;
                    if (str2 != null) {
                        j2 j2Var = j2.f164115a;
                        contextB = re2.b.f152215a.b();
                        j2Var.getClass();
                        g2.f164047a.getClass();
                        sharedPreferences = g2.f164049c;
                        if (sharedPreferences == null) {
                            p005kotlin.jvm.internal.s.m("prefs");
                            throw null;
                        }
                        sharedPreferences.edit().putString("user.age.status.response", str2).commit();
                        accountK = j2.k(contextB);
                        if (accountK != null) {
                            AccountManager.get(contextB).setUserData(accountK, "CUST_AGE_STATUS_RESPONSE", str2);
                            return cVar;
                        }
                    }
                    return cVar;
                }
                return aVar2;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                objE0 = obj;
                aVar = (wc2.a) objE0;
                if (!(aVar instanceof wc2.a.b)) {
                    if (!(aVar instanceof wc2.a.C3415a)) {
                        lc.u0.r();
                        return null;
                    }
                    wc2.a.C3415a c3415a2 = (wc2.a.C3415a) aVar;
                    exc = c3415a2.f184312a;
                    num = c3415a2.f184313b;
                    if (num != null || num.intValue() != 401) {
                        throw exc;
                    }
                    re2.b bVar = re2.b.f152215a;
                    this.f164158a = aVar;
                    this.f164159b = k0Var;
                    this.f164160c = 4;
                    objA2 = re2.b.A(bVar, this);
                    if (objA2 != aVar2) {
                        if (((sc2.o) objA2) != null) {
                            this.f164158a = aVar;
                            this.f164159b = null;
                            this.f164160c = 5;
                            objC = k0Var.c(this);
                        }
                        r1.q2.u("refresh IT2 credentials");
                        return null;
                    }
                    return aVar2;
                }
                cVar = (tc2.c) ((wc2.a.b) aVar).f184316a;
                str2 = cVar.f163844a;
                if (str2 != null) {
                    j2 j2Var2 = j2.f164115a;
                    contextB = re2.b.f152215a.b();
                    j2Var2.getClass();
                    try {
                        g2.f164047a.getClass();
                        sharedPreferences = g2.f164049c;
                        if (sharedPreferences == null) {
                            p005kotlin.jvm.internal.s.m("prefs");
                            throw null;
                        }
                        sharedPreferences.edit().putString("user.age.status.response", str2).commit();
                        accountK = j2.k(contextB);
                        if (accountK != null) {
                            AccountManager.get(contextB).setUserData(accountK, "CUST_AGE_STATUS_RESPONSE", str2);
                            return cVar;
                        }
                    } catch (Throwable th3) {
                        j2.f164116b.error("saveAgeStatusResponse", th3);
                        throw th3;
                    }
                }
                return cVar;
            }
            if (i14 == 4) {
                k0Var = this.f164159b;
                aVar = (wc2.a) this.f164158a;
                o13.r.b(obj);
                objA2 = obj;
                if (((sc2.o) objA2) != null) {
                    this.f164158a = aVar;
                    this.f164159b = null;
                    this.f164160c = 5;
                    objC = k0Var.c(this);
                }
                r1.q2.u("refresh IT2 credentials");
                return null;
            }
            if (i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objC = obj;
        }
        cVar = (tc2.c) objC;
        str = (String) objA;
        re2.b bVar2 = re2.b.f152215a;
        this.f164158a = str;
        this.f164160c = 2;
        bVar2.getClass();
        objJ = re2.b.j(this);
        if (objJ != aVar2) {
            String str4 = str;
            objJ.getClass();
            ve2.d dVar2 = (ve2.d) objJ;
            rc2.r rVar2 = new rc2.r(re2.b.f152215a.b(), dVar2.f177690a, dVar2.f177691b, str4, re2.b.m().d());
            this.f164158a = null;
            this.f164160c = 3;
            x53.c cVar3 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new rc2.s(rVar2, null), this);
            if (objE0 != aVar2) {
                aVar = (wc2.a) objE0;
                if (!(aVar instanceof wc2.a.b)) {
                    if (!(aVar instanceof wc2.a.C3415a)) {
                        lc.u0.r();
                        return null;
                    }
                    wc2.a.C3415a c3415a3 = (wc2.a.C3415a) aVar;
                    exc = c3415a3.f184312a;
                    num = c3415a3.f184313b;
                    if (num != null) {
                        throw exc;
                    }
                    throw exc;
                }
                cVar = (tc2.c) ((wc2.a.b) aVar).f184316a;
                str2 = cVar.f163844a;
                if (str2 != null) {
                    j2 j2Var3 = j2.f164115a;
                    contextB = re2.b.f152215a.b();
                    j2Var3.getClass();
                    g2.f164047a.getClass();
                    sharedPreferences = g2.f164049c;
                    if (sharedPreferences == null) {
                        p005kotlin.jvm.internal.s.m("prefs");
                        throw null;
                    }
                    sharedPreferences.edit().putString("user.age.status.response", str2).commit();
                    accountK = j2.k(contextB);
                    if (accountK != null) {
                        AccountManager.get(contextB).setUserData(accountK, "CUST_AGE_STATUS_RESPONSE", str2);
                        return cVar;
                    }
                }
                return cVar;
            }
        }
        return aVar2;
    }
}
