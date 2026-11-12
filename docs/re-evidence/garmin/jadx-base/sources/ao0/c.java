package ao0;

import b63.o;
import j23.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m92.h0;
import o13.p;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final p a(float f14, float f15, i53.c cVar) {
        Float fValueOf;
        cVar.getClass();
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((h0.d.b) it.next()).f117344b));
        }
        ArrayList arrayList2 = new ArrayList(y.r(cVar, 10));
        Iterator<E> it3 = cVar.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Float.valueOf(((h0.d.b) it3.next()).f117345c));
        }
        j00.a aVar = j00.a.f95964a;
        Iterator it4 = arrayList.iterator();
        Float fValueOf2 = null;
        if (it4.hasNext()) {
            float fFloor = (float) Math.floor(((Number) it4.next()).floatValue());
            while (it4.hasNext()) {
                fFloor = Math.min(fFloor, (float) Math.floor(((Number) it4.next()).floatValue()));
            }
            fValueOf = Float.valueOf(fFloor);
        } else {
            fValueOf = null;
        }
        float fC = j00.a.c(aVar, fValueOf, 2.0f, f14);
        j00.a aVar2 = j00.a.f95964a;
        Iterator it5 = arrayList2.iterator();
        if (it5.hasNext()) {
            float fCeil = (float) Math.ceil(((Number) it5.next()).floatValue());
            while (it5.hasNext()) {
                fCeil = Math.max(fCeil, (float) Math.ceil(((Number) it5.next()).floatValue()));
            }
            fValueOf2 = Float.valueOf(fCeil);
        }
        aVar2.getClass();
        p pVarA = j00.a.a(aVar, fC, j00.a.b(fValueOf2, 2.0f, f15), 4);
        return new p(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p b(float f14, float f15, i53.c cVar) {
        Float fValueOf;
        cVar.getClass();
        j00.a aVar = j00.a.f95964a;
        Iterator<E> it = cVar.iterator();
        Float fValueOf2 = null;
        if (it.hasNext()) {
            float fFloor = (float) Math.floor(((h0.e.a) it.next()).f117347b);
            while (it.hasNext()) {
                fFloor = Math.min(fFloor, (float) Math.floor(((h0.e.a) it.next()).f117347b));
            }
            fValueOf = Float.valueOf(fFloor);
        } else {
            fValueOf = null;
        }
        float fC = j00.a.c(aVar, fValueOf, 2.0f, f14);
        j00.a aVar2 = j00.a.f95964a;
        Iterator<E> it3 = cVar.iterator();
        if (it3.hasNext()) {
            float fCeil = (float) Math.ceil(((h0.e.a) it3.next()).f117347b);
            while (it3.hasNext()) {
                fCeil = Math.max(fCeil, (float) Math.ceil(((h0.e.a) it3.next()).f117347b));
            }
            fValueOf2 = Float.valueOf(fCeil);
        }
        aVar2.getClass();
        p pVarA = j00.a.a(aVar, fC, j00.a.b(fValueOf2, 2.0f, f15), 4);
        return new p(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    public static final List c(i53.d dVar, o oVar) {
        oVar.getClass();
        ArrayList arrayList = new ArrayList(dVar.size());
        Iterator it = dVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            double d14 = 10;
            arrayList.add(new h0.e.a(b63.p.a(oVar, (o) entry.getKey()), (float) (Math.floor(((Number) entry.getValue()).doubleValue() * d14) / d14)));
        }
        return p13.h0.N0(arrayList, new a());
    }

    public static final List d(i53.d dVar, o oVar) {
        oVar.getClass();
        ArrayList arrayList = new ArrayList(dVar.size());
        Iterator it = dVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            double d14 = 10;
            arrayList.add(new h0.d.b(b63.p.a(oVar, (o) entry.getKey()), (float) (Math.floor(((Number) ((g) entry.getValue()).getStart()).doubleValue() * d14) / d14), (float) (Math.floor(((Number) ((g) entry.getValue()).b()).doubleValue() * d14) / d14)));
        }
        return p13.h0.N0(arrayList, new b());
    }
}
