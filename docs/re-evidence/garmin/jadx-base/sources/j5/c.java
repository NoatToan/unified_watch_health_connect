package j5;

import java.util.ArrayList;
import java.util.List;
import p13.h0;
import p13.j0;
import p5.d0;
import p5.q;
import p5.r;
import p5.y;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final boolean a(ArrayList arrayList) {
        List list;
        long j8;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = j0.f134944a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i14 = 0;
                while (i14 < size) {
                    i14++;
                    Object obj2 = arrayList.get(i14);
                    y yVar = (y) obj2;
                    y yVar2 = (y) obj;
                    arrayList2.add(n4.c.a((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (yVar2.g().f() >> 32)) - Float.intBitsToFloat((int) (yVar.g().f() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (yVar2.g().f() & 4294967295L)) - Float.intBitsToFloat((int) (yVar.g().f() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j8 = ((n4.c) h0.b0(list)).f123544a;
            } else {
                if (list.isEmpty()) {
                    i6.b.d("Empty collection can't be reduced.");
                }
                Object objB0 = h0.b0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i15 = 1;
                    while (true) {
                        objB0 = n4.c.a(n4.c.j(((n4.c) objB0).f123544a, ((n4.c) list.get(i15)).f123544a));
                        if (i15 == size2) {
                            break;
                        }
                        i15++;
                    }
                }
                j8 = ((n4.c) objB0).f123544a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j8)) >= Float.intBitsToFloat((int) (j8 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(y yVar) {
        q qVarK = yVar.k();
        d0.f135959a.getClass();
        return (r.a(qVarK, d0.f135965g) == null && r.a(yVar.k(), d0.f135964f) == null) ? false : true;
    }
}
