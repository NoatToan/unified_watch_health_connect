package ek1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import hk1.y;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lek1/c;", "", "Lnk1/g;", "repo", "Lek1/i;", "getThirdPartyAppDataUseCase", "Lek1/x;", "verifyOauthDataUseCase", "<init>", "(Lnk1/g;Lek1/i;Lek1/x;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk1.g f64428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f64429b;

    public c(nk1.g gVar, i iVar, x xVar) {
        gVar.getClass();
        iVar.getClass();
        xVar.getClass();
        this.f64428a = gVar;
        this.f64429b = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(hk1.w wVar, boolean z14, v2 v2Var, e23.l lVar, v13.c cVar) {
        a aVar;
        hk1.r rVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f64421d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f64421d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objC = aVar.f64419b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f64421d;
        if (i15 == 0) {
            o13.r.b(objC);
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                u0.r();
                return null;
            }
            if (wVar instanceof hk1.w.a) {
                T t7 = ((v2.b) v2Var).f47386a;
                t7.getClass();
                rVar = (d20.d) t7;
            } else {
                if (!(wVar instanceof hk1.w.b)) {
                    u0.r();
                    return null;
                }
                T t14 = ((v2.b) v2Var).f47386a;
                t14.getClass();
                rVar = (hk1.b) t14;
            }
            aVar.f64418a = (v2.b) v2Var;
            aVar.f64421d = 1;
            objC = this.f64429b.c(rVar, z14, lVar, aVar);
            if (objC == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = aVar.f64418a;
            o13.r.b(objC);
        }
        v2 v2Var2 = (v2) objC;
        if (v2Var2 instanceof v2.b) {
            return new v2.b(new y.b((hk1.s) ((v2.b) v2Var2).f47386a), ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        if (v2Var2 instanceof v2.a) {
            return v2Var2;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0131, code lost:
    
        if (r4 == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0151, code lost:
    
        if (r4 == r6) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hk1.w wVar, boolean z14, jk1.g gVar, v13.c cVar) {
        b bVar;
        v2 aVar;
        v2 aVar2;
        String str;
        v2 aVar3;
        Object objA;
        hk1.w wVar2 = wVar;
        boolean z15 = z14;
        jk1.g gVar2 = gVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f64427f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f64427f = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objJ = bVar.f64425d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f64427f;
        if (i15 == 0) {
            o13.r.b(objJ);
            wVar2.getClass();
            boolean z16 = wVar2 instanceof hk1.w.a;
            if (z16) {
                String str2 = ((hk1.w.a) wVar2).f84207a;
                if (str2 == null) {
                    str2 = "";
                }
                aVar2 = new v2.b(str2, 200, null, null, 12, null);
            } else {
                if (!(wVar2 instanceof hk1.w.b)) {
                    u0.r();
                    return null;
                }
                hk1.w.b bVar2 = (hk1.w.b) wVar2;
                String str3 = bVar2.f84209a;
                if (str3 == null || d53.w.J(str3)) {
                    aVar = new v2.a(new Exception("Invalid third party data - clientId is null or blank"), null, hk1.l.UNAUTHORIZED_CLIENT.f84172a, 2, null);
                } else {
                    String str4 = bVar2.f84211c;
                    if (str4 == null || d53.w.J(str4) || (str = bVar2.f84212d) == null || d53.w.J(str)) {
                        aVar2 = new v2.a(new Exception("Invalid third party data - one of the following is null or blank: codeChallenge, codeChallengeMethod, scope"), null, hk1.l.INVALID_REQUEST.f84172a, 2, null);
                    } else if (p005kotlin.jvm.internal.s.g(bVar2.f84214f, "code")) {
                        aVar2 = new v2.b(str3, 200, null, null, 12, null);
                    } else {
                        aVar = new v2.a(new Exception("Invalid third party data - responseType is not code"), null, hk1.l.UNSUPPORTED_RESPONSE_TYPE.f84172a, 2, null);
                    }
                }
                aVar2 = aVar;
            }
            if (aVar2 instanceof v2.b) {
                String str5 = (String) ((v2.b) aVar2).f47386a;
                nk1.g gVar3 = this.f64428a;
                if (z16) {
                    bVar.f64422a = wVar2;
                    bVar.f64423b = gVar2;
                    bVar.f64424c = z15;
                    bVar.f64427f = 1;
                    objJ = f0.J(gVar3, new nk1.l(gVar3, str5, null), bVar);
                } else {
                    if (!(wVar2 instanceof hk1.w.b)) {
                        u0.r();
                        return null;
                    }
                    bVar.f64422a = wVar2;
                    bVar.f64423b = gVar2;
                    bVar.f64424c = z15;
                    bVar.f64427f = 2;
                    objJ = f0.J(gVar3, new nk1.h(gVar3, str5, null), bVar);
                }
            } else {
                if (!(aVar2 instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar4 = (v2.a) aVar2;
                aVar3 = new v2.a(aVar4.f47383a, aVar4.f47384b, aVar4.f47385c);
                v2 v2Var = aVar3;
                e23.l lVar = gVar2;
                bVar.f64422a = null;
                bVar.f64423b = null;
                bVar.f64424c = z15;
                bVar.f64427f = 3;
                objA = a(wVar2, z15, v2Var, lVar, bVar);
                if (objA != obj) {
                    return objA;
                }
            }
        } else if (i15 == 1) {
            boolean z17 = bVar.f64424c;
            jk1.g gVar4 = bVar.f64423b;
            hk1.w wVar3 = bVar.f64422a;
            o13.r.b(objJ);
            z15 = z17;
            wVar2 = wVar3;
            gVar2 = gVar4;
            aVar3 = (v2) objJ;
            v2 v2Var2 = aVar3;
            e23.l lVar2 = gVar2;
            bVar.f64422a = null;
            bVar.f64423b = null;
            bVar.f64424c = z15;
            bVar.f64427f = 3;
            objA = a(wVar2, z15, v2Var2, lVar2, bVar);
            if (objA != obj) {
                return objA;
            }
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    o13.r.b(objJ);
                    return objJ;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z18 = bVar.f64424c;
            jk1.g gVar5 = bVar.f64423b;
            hk1.w wVar4 = bVar.f64422a;
            o13.r.b(objJ);
            z15 = z18;
            wVar2 = wVar4;
            gVar2 = gVar5;
            aVar3 = (v2) objJ;
            v2 v2Var3 = aVar3;
            e23.l lVar3 = gVar2;
            bVar.f64422a = null;
            bVar.f64423b = null;
            bVar.f64424c = z15;
            bVar.f64427f = 3;
            objA = a(wVar2, z15, v2Var3, lVar3, bVar);
            if (objA != obj) {
                return objA;
            }
        }
        return obj;
    }
}
