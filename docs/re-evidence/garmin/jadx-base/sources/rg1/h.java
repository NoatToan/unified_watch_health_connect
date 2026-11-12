package rg1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import p005kotlin.Metadata;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrg1/h;", "Lrg1/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lqg1/a;", "backupsApi", "<init>", "(Lqg1/a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg1.a f152668a;

    public h(qg1.a aVar) {
        aVar.getClass();
        this.f152668a = aVar;
    }

    @Override // rg1.a
    public final Object a(long j8, ug1.d dVar) {
        return f0.J(this, new c(this, j8, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // rg1.a
    public final Object b(v13.c cVar) {
        f fVar;
        Integer num;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f152665c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f152665c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f152663a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f152665c;
        if (i15 == 0) {
            r.b(objJ);
            g gVar = new g(this, null);
            fVar.f152665c = 1;
            objJ = f0.J(this, gVar, fVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(Boolean.valueOf(((qg1.c) bVar.f47386a).getUserHasBackup()), bVar.f47387b, null, null, 12, null);
        }
        Boolean bool = Boolean.FALSE;
        v2.a aVar2 = v2Var instanceof v2.a ? (v2.a) v2Var : null;
        return new v2.b(bool, (aVar2 == null || (num = aVar2.f47384b) == null) ? -1 : num.intValue(), null, null, 12, null);
    }

    @Override // rg1.a
    public final Object c(long j8, long j14, i iVar) {
        return f0.J(this, new b(this, j8, j14, null), iVar);
    }

    @Override // rg1.a
    public final Object d(ug1.e eVar) {
        return f0.J(this, new d(this, null), eVar);
    }

    @Override // rg1.a
    public final Object f(long j8, i iVar) {
        return f0.J(this, new e(this, j8, null), iVar);
    }
}
