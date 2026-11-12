package on;

import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p13.j0;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lon/m;", "Lyc/h3;", "", "Lsn/h;", "Lqn/a;", "healthRepository", "pageSize", "<init>", "(Lqn/a;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends h3<Integer, sn.h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qn.a f133040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f133041c;

    public m(qn.a aVar, int i14) {
        aVar.getClass();
        this.f133040b = aVar;
        this.f133041c = i14;
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, sn.h> i3Var) {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        l lVar;
        int iIntValue;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f133039d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f133039d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objA = lVar.f133037b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f133039d;
        int i16 = this.f133041c;
        try {
            if (i15 == 0) {
                r.b(objA);
                Integer num = (Integer) aVar.a();
                iIntValue = num != null ? num.intValue() : 1;
                qn.a aVar3 = this.f133040b;
                lVar.f133036a = iIntValue;
                lVar.f133039d = 1;
                objA = aVar3.a(iIntValue, i16, lVar);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iIntValue = lVar.f133036a;
                r.b(objA);
            }
            List list = (List) objA;
            if (list == null) {
                list = j0.f134944a;
            }
            return new h3.b.c(list, null, !list.isEmpty() ? new Integer(iIntValue + i16) : null);
        } catch (Exception e4) {
            return new h3.b.a(e4);
        }
    }
}
