package vq;

import androidx.lifecycle.y0;
import c83.a0;
import o13.m;
import o13.r;
import o13.t;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.y1;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvq/d;", "Lvq/e;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f179426a = m.b(new vd1.c(15));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<fw.m<y1>> f179427b = new y0<>();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vq.e
    public final Object a(long j8, uq.m mVar, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f179425c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f179425c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objAwait = cVar2.f179423a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f179425c;
        if (i15 == 0) {
            r.b(objAwait);
            i0<a0<Unit>> i0VarB = ((a) this.f179426a.getValue()).b(j8, mVar);
            cVar2.f179425c = 1;
            objAwait = i0VarB.await(cVar2);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objAwait);
        }
        return Boolean.valueOf(((a0) objAwait).f25745a.isSuccessful());
    }
}
