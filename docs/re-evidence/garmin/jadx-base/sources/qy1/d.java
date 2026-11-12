package qy1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p13.h0;
import sa1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqy1/d;", "", "Lsa1/m;", "powerGuideRepo", "Lqy1/i;", "eventWeatherDataUseCase", "Lqy1/b;", "eventNutritionAndHydrationUseCase", "<init>", "(Lsa1/m;Lqy1/i;Lqy1/b;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa1.m f148562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f148563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f148564c;

    static {
        d60.b.a aVar = d60.b.f57806c;
        sa1.m.a aVar2 = sa1.m.f158284b;
    }

    public d(sa1.m mVar, i iVar, b bVar) {
        mVar.getClass();
        iVar.getClass();
        bVar.getClass();
        this.f148562a = mVar;
        this.f148563b = iVar;
        this.f148564c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fg0.k kVar, v13.c cVar) {
        c cVar2;
        long jLongValue;
        v2 v2Var;
        ab1.g gVar;
        long j8;
        v2 v2Var2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f148561g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f148561g = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f148559e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f148561g;
        if (i15 == 0) {
            r.b(objJ);
            Long courseId = kVar.getCourseId();
            jLongValue = courseId != null ? courseId.longValue() : 0L;
            cVar2.f148555a = kVar;
            cVar2.f148558d = jLongValue;
            cVar2.f148561g = 1;
            sa1.m mVar = this.f148562a;
            objJ = f0.J(mVar, new u(mVar, jLongValue, null), cVar2);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            jLongValue = cVar2.f148558d;
            kVar = cVar2.f148555a;
            r.b(objJ);
        } else {
            if (i15 == 2) {
                j8 = cVar2.f148558d;
                gVar = cVar2.f148557c;
                v2Var = cVar2.f148556b;
                r.b(objJ);
                cVar2.f148555a = null;
                cVar2.f148556b = v2Var;
                cVar2.f148557c = gVar;
                cVar2.f148558d = j8;
                cVar2.f148561g = 3;
                objJ = this.f148564c.a(gVar, (my1.c) objJ, cVar2);
                if (objJ != aVar) {
                    v2Var2 = v2Var;
                }
                return aVar;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = cVar2.f148557c;
            v2Var2 = cVar2.f148556b;
            r.b(objJ);
        }
        v2.b bVar = (v2.b) v2Var2;
        return new v2.b(new my1.a(gVar, (w01.c) objJ), bVar.f47387b, bVar.f47388c, bVar.f47389d);
        v2 v2Var3 = (v2) objJ;
        if (!(v2Var3 instanceof v2.b)) {
            if (v2Var3 instanceof v2.a) {
                return v2Var3;
            }
            u0.r();
            return null;
        }
        v2.b bVar2 = (v2.b) v2Var3;
        ab1.g gVar2 = (ab1.g) h0.d0((List) bVar2.f47386a);
        if (gVar2 == null) {
            return new v2.b(new my1.a(null, null, 2, null), bVar2.f47387b, bVar2.f47388c, bVar2.f47389d);
        }
        cVar2.f148555a = null;
        cVar2.f148556b = v2Var3;
        cVar2.f148557c = gVar2;
        cVar2.f148558d = jLongValue;
        cVar2.f148561g = 2;
        Object objD = this.f148563b.d(kVar, cVar2);
        if (objD != aVar) {
            v2Var = v2Var3;
            objJ = objD;
            gVar = gVar2;
            j8 = jLongValue;
            cVar2.f148555a = null;
            cVar2.f148556b = v2Var;
            cVar2.f148557c = gVar;
            cVar2.f148558d = j8;
            cVar2.f148561g = 3;
            objJ = this.f148564c.a(gVar, (my1.c) objJ, cVar2);
            if (objJ != aVar) {
                v2Var2 = v2Var;
                v2.b bVar3 = (v2.b) v2Var2;
                return new v2.b(new my1.a(gVar, (w01.c) objJ), bVar3.f47387b, bVar3.f47388c, bVar3.f47389d);
            }
        }
        return aVar;
    }
}
