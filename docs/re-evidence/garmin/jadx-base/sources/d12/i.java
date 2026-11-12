package d12;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld12/i;", "Ld12/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ld12/a;", "usageIndicatorsAPI", "Ld12/b;", "usageIndicatorsListener", "Lbo1/a;", "snapshotDataManager", "Lo53/z;", "ioDispatcher", "<init>", "(Ld12/a;Ld12/b;Lbo1/a;Lo53/z;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements e, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f57103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f57104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bo1.a f57105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f57106d;

    public i(a aVar, b bVar, bo1.a aVar2, z zVar) {
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        zVar.getClass();
        this.f57103a = aVar;
        this.f57104b = bVar;
        this.f57105c = aVar2;
        this.f57106d = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // d12.e
    public final Object a(v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f57097d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f57097d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f57095b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f57097d;
        if (i15 == 0) {
            r.b(objJ);
            h hVar = new h(this, null);
            fVar.f57097d = 1;
            objJ = f0.J(this, hVar, fVar);
            if (objJ != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = fVar.f57094a;
            r.b(objJ);
            return bVar;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        v2.b bVar2 = (v2.b) v2Var;
        g gVar = new g(this, (e12.e) bVar2.f47386a, null);
        fVar.f57094a = bVar2;
        fVar.f57097d = 2;
        return ge1.b.e0(this.f57106d, gVar, fVar) == aVar ? aVar : v2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(a aVar, b bVar, bo1.a aVar2, z zVar, int i14, j jVar) {
        if ((i14 & 4) != 0) {
            aVar2 = bo1.a.a();
            aVar2.getClass();
        }
        if ((i14 & 8) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(aVar, bVar, aVar2, zVar);
    }
}
