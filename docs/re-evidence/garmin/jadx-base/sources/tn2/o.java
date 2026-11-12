package tn2;

import com.garmin.feature.garminpay.providers.felica.exception.server.FNValidateException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f165608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f165609e;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f165605a = i14;
        this.f165606b = obj;
        this.f165607c = obj2;
        this.f165608d = obj3;
        this.f165609e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws FNValidateException {
        int i14 = this.f165605a;
        Object obj = this.f165609e;
        Object obj2 = this.f165608d;
        Object obj3 = this.f165607c;
        Object obj4 = this.f165606b;
        switch (i14) {
            case 0:
                Iterator it = (Iterator) obj4;
                List list = (List) obj3;
                ul2.c cVar = (ul2.c) obj2;
                w wVar = (w) obj;
                Logger logger = w.f165679d;
                if (!it.hasNext()) {
                    return q03.r.f(new w.c(d.SUCCESS, list));
                }
                b bVar = (b) it.next();
                e13.p pVarH = w13.b.h(cVar, bVar.f165526a);
                n nVar = new n(new jv0.c(wVar, list, bVar, cVar, it, 28), 13);
                int i15 = w03.b.f181178a;
                return new e13.q(new e13.j(pVarH, nVar), null, new w.c(d.RESPONSE_NULL, list));
            default:
                c83.a0 a0Var = (c83.a0) obj4;
                r0.c cVar2 = (r0.c) obj3;
                r0 r0Var = (r0) obj2;
                String str = (String) obj;
                T t7 = a0Var.f25746b;
                t7.getClass();
                pn2.p pVar = (pn2.p) t7;
                i iVar = new i(a0Var);
                if (iVar.d()) {
                    rn2.q qVar = (rn2.q) pVar.d();
                    if (qVar != null) {
                        return r0.d.a(qVar);
                    }
                    throw new FNValidateException("Payload is null");
                }
                if (!iVar.e()) {
                    throw iVar.c();
                }
                if (pVar.getHeader().getNextAccessToken() == null) {
                    throw new FNValidateException("NextAccessToken is null");
                }
                if (((rn2.q) pVar.d()) == null) {
                    throw new FNValidateException("Payload is null");
                }
                if (((rn2.q) pVar.d()).getResultConfirmId() == null) {
                    throw new FNValidateException("ResultConfirmId is null");
                }
                e13.j jVarT = r0Var.f165632a.t(new w.d(false, false, false, false, true, false, false, false, false, false, 1007, null));
                p0 p0Var = new p0(new s0(cVar2, 0, pVar, str), 4);
                int i16 = w03.b.f181178a;
                return new e13.j(jVarT, p0Var);
        }
    }
}
