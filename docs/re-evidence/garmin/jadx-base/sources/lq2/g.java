package lq2;

import hq2.r;
import hq2.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.n;
import ps2.w;
import v13.i;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llq2/g;", "Lyq2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements yq2.b {
    @Override // yq2.b
    public final q a(fs2.a aVar) {
        String strA;
        as2.b<Short> bVarA;
        hq2.q qVar = (hq2.q) fs2.a.f(aVar, hq2.q.class);
        String str = aVar.f73429d;
        is2.b bVar = aVar.f73427b;
        Short shA = null;
        if (bVar != null) {
            s.f85278a.getClass();
            strA = s.a(bVar);
        } else {
            strA = null;
        }
        String purseId = qVar != null ? qVar.getPurseId() : null;
        qs2.a aVar2 = aVar.f73428c;
        aVar2.getClass();
        as2.a aVarA = yr2.e.a(aVar2);
        if (qVar != null && (bVarA = qVar.a()) != null) {
            shA = bVarA.a();
        }
        return new q(str, strA, purseId, aVarA.b(shA), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // yq2.b
    public final Object b(fs2.a aVar, i iVar) {
        ms2.d dVarG;
        w wVar = w.f140538a;
        long j8 = aVar.f73431f;
        is2.b bVar = aVar.f73427b;
        bVar.getClass();
        wVar.getClass();
        n nVarI = w.i(j8);
        if (nVarI != null) {
            dVarG = nVarI.g(bVar);
            if (!(dVarG instanceof r)) {
                dVarG = null;
            }
        } else {
            dVarG = null;
        }
        r rVar = (r) dVarG;
        if (rVar != null) {
            as2.f<Short> fVar = rVar.f85275e;
            if (fVar == null) {
                p005kotlin.jvm.internal.s.m("balanceSynchronizer");
                throw null;
            }
            fVar.b(aVar.f73426a);
        }
        return Unit.INSTANCE;
    }

    @Override // yq2.b
    public final yq2.b.a d(fs2.a aVar) {
        throw new IllegalStateException("Never reach");
    }
}
