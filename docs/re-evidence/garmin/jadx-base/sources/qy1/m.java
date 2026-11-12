package qy1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p13.h0;
import sa1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqy1/m;", "", "<init>", "()V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:50:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r1 == r4) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Long l14, Long l15, v13.c cVar) {
        l lVar;
        Long l16;
        v2 v2Var;
        Long l17;
        Long l18;
        Object objA;
        Long l19;
        v2 v2Var2;
        Long l24;
        boolean z14;
        Long l25 = l14;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f148591f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f148591f = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objJ = lVar.f148589d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f148591f;
        v2 v2Var3 = null;
        if (i15 != 0) {
            if (i15 == 1) {
                Long l26 = lVar.f148587b;
                Long l27 = lVar.f148586a;
                r.b(objJ);
                l16 = l26;
                l25 = l27;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var2 = lVar.f148588c;
                l24 = lVar.f148587b;
                l19 = lVar.f148586a;
                r.b(objJ);
            }
            v2Var3 = (v2) objJ;
            v2Var = v2Var2;
            l17 = l19;
            l18 = l24;
            z14 = v2Var instanceof v2.b;
            if (!z14 && (v2Var3 instanceof v2.b)) {
                v2.b bVar = (v2.b) v2Var;
                ab1.g gVar = (ab1.g) h0.d0((List) bVar.f47386a);
                my1.f fVar = (my1.f) ((v2.b) v2Var3).f47386a;
                return new v2.b(new my1.h(l17, gVar, l18, fVar.f121508a, fVar.f121509b), bVar.f47387b, bVar.f47388c, bVar.f47389d);
            }
            if (!z14 && v2Var3 == null) {
                v2.b bVar2 = (v2.b) v2Var;
                return new v2.b(new my1.h(l17, (ab1.g) h0.d0((List) bVar2.f47386a), null, null, null), bVar2.f47387b, bVar2.f47388c, bVar2.f47389d);
            }
            if (v2Var != null && (v2Var3 instanceof v2.b)) {
                v2.b bVar3 = (v2.b) v2Var3;
                my1.f fVar2 = (my1.f) bVar3.f47386a;
                return new v2.b(new my1.h(null, null, l18, fVar2.f121508a, fVar2.f121509b), bVar3.f47387b, bVar3.f47388c, bVar3.f47389d);
            }
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            if (v2Var3 instanceof v2.a) {
                return v2Var3;
            }
            return new v2.a(new Exception("Error fetching triathlon event strategy data."), null, null, 6, null);
        }
        r.b(objJ);
        if (l25 == null) {
            l16 = l15;
            v2Var = null;
            if (l16 != null) {
                long jLongValue = l16.longValue();
                k kVar = new k();
                lVar.f148586a = l25;
                lVar.f148587b = l16;
                lVar.f148588c = v2Var;
                lVar.f148591f = 2;
                objA = kVar.a(jLongValue, lVar);
                if (objA != aVar) {
                    l19 = l25;
                    v2Var2 = v2Var;
                    objJ = objA;
                    l24 = l16;
                    v2Var3 = (v2) objJ;
                    v2Var = v2Var2;
                    l17 = l19;
                    l18 = l24;
                }
            } else {
                l17 = l25;
                l18 = l16;
            }
            z14 = v2Var instanceof v2.b;
            if (!z14) {
            }
            if (!z14) {
            }
            if (v2Var != null) {
            }
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            if (v2Var3 instanceof v2.a) {
                return v2Var3;
            }
            return new v2.a(new Exception("Error fetching triathlon event strategy data."), null, null, 6, null);
        }
        long jLongValue2 = l25.longValue();
        sa1.m mVarA = sa1.m.a.a(sa1.m.f158284b);
        lVar.f148586a = l25;
        l16 = l15;
        lVar.f148587b = l16;
        lVar.f148591f = 1;
        objJ = f0.J(mVarA, new u(mVarA, jLongValue2, null), lVar);
        return aVar;
        v2Var = (v2) objJ;
        if (l16 != null) {
            long jLongValue3 = l16.longValue();
            k kVar2 = new k();
            lVar.f148586a = l25;
            lVar.f148587b = l16;
            lVar.f148588c = v2Var;
            lVar.f148591f = 2;
            objA = kVar2.a(jLongValue3, lVar);
            if (objA != aVar) {
                l19 = l25;
                v2Var2 = v2Var;
                objJ = objA;
                l24 = l16;
                v2Var3 = (v2) objJ;
                v2Var = v2Var2;
                l17 = l19;
                l18 = l24;
            }
            return aVar;
        }
        l17 = l25;
        l18 = l16;
        z14 = v2Var instanceof v2.b;
        if (!z14) {
        }
        if (!z14) {
        }
        if (v2Var != null) {
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        if (v2Var3 instanceof v2.a) {
            return v2Var3;
        }
        return new v2.a(new Exception("Error fetching triathlon event strategy data."), null, null, 6, null);
    }
}
