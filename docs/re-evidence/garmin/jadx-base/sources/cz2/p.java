package cz2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcz2/p;", "", "<init>", "()V", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53.b f56958a = z53.c.a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(e23.l lVar, v13.c cVar) throws Throwable {
        o oVar;
        z53.b bVar;
        Throwable th3;
        z53.a aVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f56957e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f56957e = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f56955c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f56957e;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                oVar.f56953a = lVar;
                bVar = this.f56958a;
                oVar.f56954b = bVar;
                oVar.f56957e = 1;
                if (bVar.c(oVar) != aVar2) {
                }
                return aVar2;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (z53.a) oVar.f56953a;
                try {
                    o13.r.b(obj);
                    aVar.e(null);
                    return obj;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar.e(null);
                    throw th3;
                }
            }
            z53.b bVar2 = oVar.f56954b;
            e23.l lVar2 = (e23.l) oVar.f56953a;
            o13.r.b(obj);
            bVar = bVar2;
            lVar = lVar2;
            oVar.f56953a = bVar;
            oVar.f56954b = null;
            oVar.f56957e = 2;
            Object objInvoke = lVar.invoke(oVar);
            if (objInvoke != aVar2) {
                z53.b bVar3 = bVar;
                obj = objInvoke;
                aVar = bVar3;
                aVar.e(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th5) {
            z53.b bVar4 = bVar;
            th3 = th5;
            aVar = bVar4;
            aVar.e(null);
            throw th3;
        }
    }
}
