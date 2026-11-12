package mn2;

import c83.a0;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o13.t f119825a = o13.m.b(new mh1.q(9));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d53.k f119826b = new d53.k("(\\d+)x(\\d+)", d53.l.IGNORE_CASE);

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(k kVar, long j8, v13.c cVar) {
        l lVar;
        String strString;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f119824b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f119824b = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(cVar);
            }
        } else {
            lVar = new l(cVar);
        }
        Object objG = lVar.f119823a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f119824b;
        if (i15 == 0) {
            o13.r.b(objG);
            lVar.f119824b = 1;
            objG = kVar.g(j8, lVar);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        a0 a0Var = (a0) objG;
        boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
        o13.t tVar = f119825a;
        if (!zIsSuccessful) {
            return (a.c) tVar.getValue();
        }
        ResponseBody responseBody = (ResponseBody) a0Var.f25746b;
        if (responseBody == null || (strString = responseBody.string()) == null) {
            return (a.c) tVar.getValue();
        }
        try {
            if (strString.equals("NO_IMAGE_SUPPORT")) {
                return a.b.f119777a;
            }
            if (strString.equals("0x0")) {
                return a.C2276a.f119776a;
            }
            d53.j jVarC = f119826b.c(strString);
            if (jVarC == null) {
                throw new ns2.d("Null match for ".concat(strString));
            }
            d53.j.b bVar = jVarC.f57693c;
            d53.h hVarB = bVar.b(1);
            if (hVarB == null) {
                throw new ns2.d("Null group[1] from " + jVarC + " for " + strString);
            }
            int i16 = Integer.parseInt(hVarB.f57688a);
            d53.h hVarB2 = bVar.b(2);
            if (hVarB2 != null) {
                return new a.c(i16, Integer.parseInt(hVarB2.f57688a));
            }
            throw new ns2.d("Null group[2] from " + jVarC + " for " + strString);
        } catch (Throwable unused) {
            return (a.c) tVar.getValue();
        }
    }
}
