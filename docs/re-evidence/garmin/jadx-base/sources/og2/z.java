package og2;

import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Log2/z;", "Ljava/util/TimerTask;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f132146a;

    public z(v vVar) {
        this.f132146a = vVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        v vVar = this.f132146a;
        pg2.a aVar = vVar.f132113h;
        if (aVar instanceof pg2.a.d) {
            vVar.v(15.0f, System.currentTimeMillis(), 61);
            return;
        }
        if (aVar instanceof pg2.a.c) {
            vVar.v(60.0f, System.currentTimeMillis(), MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE);
            return;
        }
        if (!(aVar instanceof pg2.a.C2605a)) {
            lc.u0.r();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        i53.c<j> cVarE = vVar.f132116k;
        i53.c<j> cVarE2 = vVar.f132117l;
        ArrayList arrayList = new ArrayList();
        p2 p2Var = vVar.f132111f;
        i53.c<g> cVarI = ((l) p2Var.getValue()).f132058f;
        long j8 = jCurrentTimeMillis - vVar.f132119n;
        long j14 = j8 / ((long) 1000);
        float f14 = (j8 / 1000.0f) - j14;
        if (j14 > vVar.f132120o) {
            vVar.f132120o = j14;
            i53.c cVarE3 = i53.a.e(cVarE2);
            if (cVarE3.size() >= 361) {
                j jVar = (j) p13.h0.n0(cVarE3);
                if (jVar == null) {
                    zg2.c.f204692a.getClass();
                    zg2.c.b("LiveActivityAnimatedChartDataProvider", "This shouldn't happen.");
                    return;
                }
                List<h0> listK = vVar.k(null);
                ArrayList arrayList2 = new ArrayList(p13.y.r(listK, 10));
                for (h0 h0Var : listK) {
                    arrayList2.add(new j(h0Var.f132039a, h0Var.f132040b));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((j) obj).f132046a <= jVar.f132046a) {
                        arrayList3.add(obj);
                    }
                }
                o.a aVar2 = o.f132067a;
                i53.c cVarE4 = i53.a.e(arrayList3);
                aVar2.getClass();
                cVarE3 = o.a.b(cVarE4);
            }
            j jVar2 = (j) p13.h0.n0(cVarE3);
            if (jVar2 == null) {
                vVar.q();
                return;
            }
            j jVarM = vVar.m(jVar2);
            ArrayList arrayList4 = new ArrayList(cVarE3);
            arrayList4.add(jVarM);
            cVarE2 = i53.a.e(arrayList4);
            ArrayList arrayListD1 = p13.h0.d1(cVarE2);
            arrayListD1.set(arrayListD1.size() - 1, jVar2);
            cVarE = i53.a.e(arrayListD1);
            cVarI = vVar.i(vVar.f132114i);
            vVar.f132114i = vVar.f132115j;
            vVar.f132115j = vVar.p(cVarE2);
        }
        i53.c<g> cVar = cVarI;
        int size = cVarE2.size();
        if (size != 0) {
            if (size != 1) {
                Iterator<j> it = cVarE2.iterator();
                while (it.hasNext()) {
                    arrayList.add(j.a(it.next()));
                }
                j jVar3 = cVarE.get(p13.x.j(cVarE));
                j jVar4 = cVarE2.get(cVarE2.size() - 1);
                float f15 = jVar3.f132046a;
                float fA = j20.x.a(jVar4.f132046a, f15, f14, f15);
                float fA2 = jVar4.f132047b;
                if (fA2 != -1.0f) {
                    float f16 = jVar3.f132047b;
                    if (f16 != -1.0f) {
                        fA2 = j20.x.a(fA2, f16, f14, f16);
                    }
                }
                arrayList.set(arrayList.size() - 1, new j(fA, fA2));
            } else {
                arrayList.add(j.a((j) p13.h0.b0(cVarE2)));
            }
            float f17 = ((j) p13.h0.m0(arrayList)).f132046a;
            b bVar = f17 >= 60.0f ? new b(0.0f, f17) : new b(f17 - 60.0f, f17);
            b bVar2 = vVar.f132114i;
            float f18 = bVar2.f132007a;
            b bVar3 = vVar.f132115j;
            float f19 = bVar3.f132007a;
            float fA3 = j20.x.a(f19, f19, f14, f18);
            float f22 = bVar2.f132008b;
            b bVar4 = new b(fA3, j20.x.a(bVar3.f132008b, f22, f14, f22));
            p2Var.k(null, new l(v.h(arrayList), v.g(arrayList, bVar), bVar, bVar4, v.o(bVar4, vVar.f132115j), cVar, vVar.f(bVar), vVar.f132106a.c().f144672b));
            vVar.f132117l = cVarE2;
            vVar.f132116k = cVarE;
        }
    }
}
