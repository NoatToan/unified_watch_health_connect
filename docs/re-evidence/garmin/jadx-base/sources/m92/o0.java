package m92;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 {
    public static l53.c a(q4.f fVar, List list, Float f14, float f15, Float f16, Float f17, int i14) {
        float f18;
        float fFloatValue;
        q4.f fVar2 = fVar;
        Float f19 = (i14 & 2) != 0 ? null : f14;
        fVar2.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return i53.a.c();
        }
        if (f19 != null) {
            f18 = 0.0f;
        } else {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            float fB = i0.b((h0.e.C2226e) it.next());
            while (it.hasNext()) {
                fB = Math.min(fB, i0.b((h0.e.C2226e) it.next()));
            }
            f18 = fB;
        }
        if (f19 != null) {
            fFloatValue = f19.floatValue() - 1;
        } else {
            Iterator it3 = list.iterator();
            if (!it3.hasNext()) {
                c22.t.g();
                return null;
            }
            float fB2 = i0.b((h0.e.C2226e) it3.next());
            while (it3.hasNext()) {
                fB2 = Math.max(fB2, i0.b((h0.e.C2226e) it3.next()));
            }
            fFloatValue = fB2;
        }
        float fFloatValue2 = f16.floatValue();
        float fFloatValue3 = f17.floatValue();
        ArrayList<h0.e.C2226e> arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            h0.e.C2226e c2226e = (h0.e.C2226e) it4.next();
            h0.e.a aVarA = q0.a(c2226e.f117356a, f18, fFloatValue, fFloatValue2, fFloatValue3, Float.intBitsToFloat((int) (fVar2.b() >> 32)), Float.intBitsToFloat((int) (fVar2.b() & 4294967295L)));
            o92.b bVar = c2226e.f117357b;
            t4.d dVar = c2226e.f117358c;
            long j8 = c2226e.f117359d;
            float f22 = c2226e.f117360e;
            bVar.getClass();
            dVar.getClass();
            arrayList.add(new h0.e.C2226e(aVarA, bVar, dVar, j8, f22, null));
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (h0.e.C2226e c2226e2 : arrayList) {
            float fS0 = fVar2.s0(f15);
            o92.d.b(fVar2, i0.b(c2226e2), i0.e(c2226e2), c2226e2.f117357b, fS0, fS0);
            float fS1 = fVar2.s0(c2226e2.f117360e);
            float f24 = fS1 / 2;
            float fB3 = i0.b(c2226e2) - f24;
            float fE = i0.e(c2226e2) - f24;
            fVar2.getF142543b().f142550a.h(fB3, fE);
            try {
                t4.d dVar2 = c2226e2.f117358c;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fS1)) << 32) | (((long) Float.floatToRawIntBits(fS1)) & 4294967295L);
                n4.g.a aVar = n4.g.f123559b;
                t4.d.m500drawx_KDEd0$default(dVar2, fVar2, jFloatToRawIntBits, 0.0f, o4.e0.a.a(o4.e0.f128843b, c2226e2.f117359d), 2, null);
                fVar.getF142543b().f142550a.h(-fB3, -fE);
                arrayList2.add(Unit.INSTANCE);
                fVar2 = fVar;
            } catch (Throwable th3) {
                fVar.getF142543b().f142550a.h(-fB3, -fE);
                throw th3;
            }
        }
        return i53.a.c();
    }
}
