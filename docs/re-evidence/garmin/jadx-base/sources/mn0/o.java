package mn0;

import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmn0/o;", "", "Ljn0/a;", "preferences", "Lmn0/p;", "delegate", "<init>", "(Ljn0/a;Lmn0/p;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jn0.a f119753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f119754b;

    public o(jn0.a aVar, p pVar) {
        aVar.getClass();
        pVar.getClass();
        this.f119753a = aVar;
        this.f119754b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f119752c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f119752c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objC = nVar.f119750a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f119752c;
        if (i15 == 0) {
            r.b(objC);
            if (this.f119753a.d()) {
                return Boolean.TRUE;
            }
            nVar.f119752c = 1;
            objC = this.f119754b.c(nVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
        }
        Boolean bool = (Boolean) objC;
        bool.booleanValue();
        return bool;
    }
}
