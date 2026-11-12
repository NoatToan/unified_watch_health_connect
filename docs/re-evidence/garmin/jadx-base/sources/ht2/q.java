package ht2;

import o53.c0;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lht2/q;", "T", "", "<init>", "()V", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h53.b<i0<T>> f85682a;

    public q() {
        h53.c.a aVar = h53.c.a.f82142a;
        aVar.getClass();
        this.f85682a = new h53.b<>(null, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (g8.i.r(r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.garmin.inappupdate.a.C1116a c1116a, v13.c cVar) {
        o oVar;
        q<T> qVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f85675e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f85675e = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f85673c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f85675e;
        if (i15 == 0) {
            o13.r.b(obj);
            i0<T> i0VarB = this.f85682a.b();
            if (i0VarB != null) {
                oVar.f85671a = this;
                oVar.f85672b = c1116a;
                oVar.f85675e = 1;
            }
            qVar = this;
        } else {
            if (i15 != 1) {
                if (i15 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1116a = oVar.f85672b;
            qVar = oVar.f85671a;
            o13.r.b(obj);
        }
        p pVar = new p(qVar, c1116a, null);
        oVar.f85671a = null;
        oVar.f85672b = null;
        oVar.f85675e = 2;
        Object objE = c0.e(pVar, oVar);
        return objE == aVar ? aVar : objE;
    }
}
