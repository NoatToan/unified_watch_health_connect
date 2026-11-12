package xs;

import java.util.ArrayList;
import java.util.List;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxs/k;", "Lxs/i;", "Lcl1/a;", "preferences", "Lws/a;", "delegate", "<init>", "(Lcl1/a;Lws/a;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl1.a f192062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ws.a f192063b;

    public k(cl1.a aVar, ws.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f192062a = aVar;
        this.f192063b = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r13 == r0) goto L34;
     */
    @Override // xs.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(long j8, List list, h hVar, v13.c cVar) {
        j jVar;
        Object objJ;
        Object objB;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f192061e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f192061e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        j jVar2 = jVar;
        Object obj = jVar2.f192059c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar2.f192061e;
        ws.a aVar2 = this.f192063b;
        if (i15 == 0) {
            r.b(obj);
            if (hVar != h.DEVICE) {
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI = rd2.j.i(j8, null);
                if (fVarI == null) {
                    return h.API;
                }
                String applicationKey = fVarI.getApplicationKey();
                applicationKey.getClass();
                jVar2.f192058b = list;
                jVar2.f192057a = j8;
                jVar2.f192061e = 1;
                objJ = aVar2.j(applicationKey, j8, list, jVar2);
                if (objJ != aVar) {
                    j8 = j8;
                    list = list;
                }
            } else {
                jVar2.f192058b = list;
                jVar2.f192057a = j8;
                jVar2.f192061e = 2;
                objB = aVar2.b(j8, list, jVar2);
            }
            return aVar;
        }
        if (i15 == 1) {
            j8 = jVar2.f192057a;
            list = jVar2.f192058b;
            r.b(obj);
            objJ = ((q) obj).f128597a;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = jVar2.f192057a;
            list = jVar2.f192058b;
            r.b(obj);
            objB = ((q) obj).f128597a;
        }
        int i16 = q.f128596b;
        if (objB instanceof q.b) {
            return h.DEVICE;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (zf2.d dVar : list) {
            cl1.b.a aVar3 = cl1.b.f27937b;
            int i17 = dVar.f204633e;
            int i18 = dVar.f204634f;
            aVar3.getClass();
            arrayList.add(cl1.b.a.a(i17, i18));
        }
        cl1.a aVar4 = this.f192062a;
        aVar4.e(j8, arrayList);
        aVar4.h(j8);
        return null;
        int i19 = q.f128596b;
        if (objJ instanceof q.b) {
            return h.API;
        }
        jVar2.f192058b = list;
        jVar2.f192057a = j8;
        jVar2.f192061e = 2;
        objB = aVar2.b(j8, list, jVar2);
    }
}
