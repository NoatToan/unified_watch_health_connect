package x51;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import m92.c0;
import m92.e0;
import m92.h0;
import m92.m;
import o13.p;
import o4.d0;
import o4.u1;
import p13.k0;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f189031a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f189031a = 2;
    }

    public static final i53.g<Float, Float> a(q4.f fVar, i53.d<Float, Float> dVar, float f14, float f15, List<p<Float, d0>> list, Float f16, Float f17, Float f18, Float f19) {
        Float fE = e(dVar, f14);
        Float fE2 = e(dVar, f15);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Float, Float> entry : dVar.entrySet()) {
            float fFloatValue = entry.getKey().floatValue();
            if (f14 <= fFloatValue && fFloatValue <= f15) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        q13.c cVar = new q13.c();
        if (fE != null) {
            cVar.put(Float.valueOf(f14), fE);
        }
        cVar.putAll(linkedHashMap);
        if (fE2 != null) {
            cVar.put(Float.valueOf(f15), fE2);
        }
        TreeMap treeMap = new TreeMap(cVar.b());
        if (treeMap.isEmpty()) {
            return i53.a.c();
        }
        u1.f129010b.getClass();
        m.b bVar = new m.b(list, u1.f129011c, null);
        ArrayList arrayList = new ArrayList(treeMap.size());
        for (Map.Entry entry2 : treeMap.entrySet()) {
            Object key = entry2.getKey();
            key.getClass();
            float fFloatValue2 = ((Number) key).floatValue();
            Object value = entry2.getValue();
            value.getClass();
            arrayList.add(new h0.e.a(fFloatValue2, ((Number) value).floatValue()));
        }
        return c0.e(fVar, f189031a, bVar, false, 0.0f, null, null, arrayList, null, f16, f17, f18, f19, e0.SINE, false, null, 24764);
    }

    public static final i53.d b(Float f14, Float f15, ArrayList arrayList, List list) {
        Integer numValueOf = Integer.valueOf(R.color.heart_rate_line_gradient1);
        if (f14.floatValue() >= f15.floatValue()) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return i53.a.g(k0Var);
        }
        float fFloatValue = f15.floatValue() - f14.floatValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            linkedHashMap.put(Float.valueOf(0.0f), numValueOf);
            linkedHashMap.put(Float.valueOf(1.0f), numValueOf);
            return i53.a.k(linkedHashMap);
        }
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            float fFloatValue2 = i14 == 0 ? 0.0f : (((Number) obj).floatValue() - f14.floatValue()) / fFloatValue;
            if (fFloatValue2 >= 1.0f) {
                fFloatValue2 = 1.0f;
            }
            linkedHashMap.put(Float.valueOf(fFloatValue2), Integer.valueOf(i14 == 0 ? ((Number) arrayList.get(0)).intValue() : i14 < list.size() + (-1) ? ((Number) arrayList.get(i15)).intValue() : ((Number) arrayList.get(i14)).intValue()));
            if (fFloatValue2 == 1.0f) {
                break;
            }
            i14 = i15;
        }
        return i53.a.k(linkedHashMap);
    }

    public static final float c(i53.c<z51.c> cVar) {
        Double dValueOf;
        cVar.getClass();
        Iterator<z51.c> it = cVar.iterator();
        if (it.hasNext()) {
            Double d14 = it.next().f202485b;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            while (it.hasNext()) {
                Double d15 = it.next().f202485b;
                dDoubleValue = Math.max(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d);
            }
            dValueOf = Double.valueOf(dDoubleValue);
        } else {
            dValueOf = null;
        }
        double dDoubleValue2 = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
        if (dDoubleValue2 == 0.0d) {
            return 200.0f;
        }
        return (float) (dDoubleValue2 + 5.0d);
    }

    public static final float d(i53.c<z51.c> cVar) {
        Double dValueOf;
        cVar.getClass();
        Iterator<z51.c> it = cVar.iterator();
        if (it.hasNext()) {
            Double d14 = it.next().f202485b;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            while (it.hasNext()) {
                Double d15 = it.next().f202485b;
                dDoubleValue = Math.min(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d);
            }
            dValueOf = Double.valueOf(dDoubleValue);
        } else {
            dValueOf = null;
        }
        double dDoubleValue2 = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
        if (dDoubleValue2 == 0.0d) {
            return 0.0f;
        }
        return (float) Math.max(20.0d, dDoubleValue2 - Math.max(0.3d * dDoubleValue2, 15.0d));
    }

    public static final Float e(i53.d dVar, float f14) {
        Object next;
        Object next2;
        Iterable iterableEntrySet = dVar.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableEntrySet) {
            if (((Number) ((Map.Entry) obj).getKey()).floatValue() <= f14) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getKey()).floatValue();
                do {
                    Object next3 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next3).getKey()).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                        next = next3;
                        fFloatValue = fFloatValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Iterable iterableEntrySet2 = dVar.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterableEntrySet2) {
            if (((Number) ((Map.Entry) obj2).getKey()).floatValue() >= f14) {
                arrayList2.add(obj2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                float fFloatValue3 = ((Number) ((Map.Entry) next2).getKey()).floatValue();
                do {
                    Object next4 = it3.next();
                    float fFloatValue4 = ((Number) ((Map.Entry) next4).getKey()).floatValue();
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        next2 = next4;
                        fFloatValue3 = fFloatValue4;
                    }
                } while (it3.hasNext());
            }
        } else {
            next2 = null;
        }
        Map.Entry entry2 = (Map.Entry) next2;
        if (entry == null || entry2 == null) {
            return null;
        }
        if (((Number) entry.getKey()).floatValue() == ((Number) entry2.getKey()).floatValue()) {
            return (Float) entry.getValue();
        }
        return Float.valueOf(((((Number) entry2.getValue()).floatValue() - ((Number) entry.getValue()).floatValue()) * ((f14 - ((Number) entry.getKey()).floatValue()) / (((Number) entry2.getKey()).floatValue() - ((Number) entry.getKey()).floatValue()))) + ((Number) entry.getValue()).floatValue());
    }
}
