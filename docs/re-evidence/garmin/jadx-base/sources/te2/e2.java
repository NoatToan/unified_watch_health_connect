package te2;

import android.content.Context;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lte2/e2;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f164018a = o13.m.b(new ta0.g(9));

    public static final Logger a(e2 e2Var) {
        return (Logger) e2Var.f164018a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r2 == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (r2 == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        if (r2 == r4) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(dd2.a aVar, Context context, ve2.d dVar, ve2.l lVar, v13.c cVar) throws Throwable {
        b2 b2Var;
        if (cVar instanceof b2) {
            b2Var = (b2) cVar;
            int i14 = b2Var.f163978b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b2Var.f163978b = i14 - Integer.MIN_VALUE;
            } else {
                b2Var = new b2(cVar);
            }
        } else {
            b2Var = new b2(cVar);
        }
        Object objE0 = b2Var.f163977a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = b2Var.f163978b;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objE0);
                return wc2.b.a((wc2.a) objE0);
            }
            if (i15 == 2) {
                o13.r.b(objE0);
                return wc2.b.a((wc2.a) objE0);
            }
            if (i15 == 3) {
                o13.r.b(objE0);
                return wc2.b.a((wc2.a) objE0);
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objE0);
        sc2.o oVar = aVar.f59205b;
        if (oVar != null) {
            rc2.x xVar = new rc2.x(context, dVar.f177690a, dVar.f177691b, oVar.f158544a, lVar.d());
            b2Var.f163978b = 1;
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new rc2.y(xVar, null), b2Var);
        } else {
            sc2.m mVar = aVar.f59206c;
            if (mVar != null) {
                qc2.m mVar2 = new qc2.m(context, dVar.f177690a, mVar.f158528b, null, 8, null);
                b2Var.f163978b = 2;
                x53.c cVar3 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new qc2.l(mVar2, null), b2Var);
            } else {
                sc2.j jVar = aVar.f59204a;
                if (jVar == null) {
                    return Boolean.FALSE;
                }
                dd2.b bVarA = lVar.a(dVar.f177690a);
                bVarA.getClass();
                qc2.m mVar3 = new qc2.m(context, dVar.f177690a, null, new dd2.c(jVar.f158514a, jVar.f158515b, bVarA.f59210a, bVarA.f59211b), 4, null);
                b2Var.f163978b = 3;
                x53.c cVar4 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new qc2.l(mVar3, null), b2Var);
            }
        }
        return aVar2;
    }

    public final Object c(Context context, ve2.l lVar, ve2.d dVar, v13.i iVar) throws Throwable {
        String str;
        ve2.k kVar = dVar.f177697h;
        if (kVar == null || (str = kVar.f177753a) == null || d53.w.J(str)) {
            vb.h.s("read the KDoc, 'GarminAccount.mfaTokenData' is null or 'garminAccount.mfaTokenData.tokenVal' is null or blank");
            return null;
        }
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new u1(context, dVar, lVar, this, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }
}
