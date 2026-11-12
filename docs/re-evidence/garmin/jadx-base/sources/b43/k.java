package b43;

import java.util.Comparator;
import t23.c1;
import t23.r0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements Comparator<t23.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f15730a = new k();

    private k() {
    }

    public static int a(t23.l lVar) {
        if (lVar == null) {
            i.a(36);
            throw null;
        }
        int i14 = i.f15728a;
        if (i.l(lVar, t23.f.ENUM_ENTRY)) {
            return 8;
        }
        if (lVar instanceof t23.k) {
            return 7;
        }
        if (lVar instanceof r0) {
            return ((r0) lVar).I() == null ? 6 : 5;
        }
        if (lVar instanceof t23.v) {
            return ((t23.v) lVar).I() == null ? 4 : 3;
        }
        if (lVar instanceof t23.e) {
            return 2;
        }
        return lVar instanceof c1 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(t23.l lVar, t23.l lVar2) {
        Integer numValueOf;
        t23.l lVar3 = lVar;
        t23.l lVar4 = lVar2;
        int iA = a(lVar4) - a(lVar3);
        if (iA != 0) {
            numValueOf = Integer.valueOf(iA);
        } else {
            t23.f fVar = t23.f.ENUM_ENTRY;
            if (i.l(lVar3, fVar) && i.l(lVar4, fVar)) {
                numValueOf = 0;
            } else {
                int iCompareTo = lVar3.getName().f188605a.compareTo(lVar4.getName().f188605a);
                numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
