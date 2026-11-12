package b03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb03/d;", "Lb03/c;", "Ld03/d;", "driver", "<init>", "(Ld03/d;)V", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d03.d f14181b;

    public d(d03.d dVar) {
        dVar.getClass();
        this.f14181b = dVar;
    }

    @Override // b03.c
    public final Object f(gi.b bVar) throws Throwable {
        c03.d.b bVarX1 = this.f14181b.x1();
        c.a aVar = bVarX1.f22423g;
        ArrayList arrayList = bVarX1.f14177c;
        ArrayList arrayList2 = bVarX1.f14176b;
        LinkedHashMap linkedHashMap = bVarX1.f14178d;
        boolean z14 = false;
        try {
            Object objInvoke = bVar.invoke(new f(bVarX1));
            bVarX1.f14179e = true;
            bVarX1.b();
            boolean z15 = bVarX1.f14179e;
            if (aVar != null) {
                if (z15 && bVarX1.f14180f) {
                    z14 = true;
                }
                aVar.f14180f = z14;
                aVar.f14176b.addAll(arrayList2);
                aVar.f14177c.addAll(arrayList);
                aVar.f14178d.putAll(linkedHashMap);
                return objInvoke;
            }
            if (!z15 || !bVarX1.f14180f) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((e23.a) it.next()).invoke();
                }
                arrayList.clear();
                return objInvoke;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                d0.v(arrayList3, (List) ((e23.a) ((Map.Entry) it3.next()).getValue()).invoke());
            }
            Iterator it4 = h0.b1(h0.f1(arrayList3)).iterator();
            while (it4.hasNext()) {
                ((a) it4.next()).c();
            }
            linkedHashMap.clear();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                ((e23.a) it5.next()).invoke();
            }
            arrayList2.clear();
            return objInvoke;
        } catch (Throwable th3) {
            bVarX1.b();
            boolean z16 = bVarX1.f14179e;
            if (aVar != null) {
                if (z16 && bVarX1.f14180f) {
                    z14 = true;
                }
                aVar.f14180f = z14;
                aVar.f14176b.addAll(arrayList2);
                aVar.f14177c.addAll(arrayList);
                aVar.f14178d.putAll(linkedHashMap);
            } else if (z16 && bVarX1.f14180f) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = linkedHashMap.entrySet().iterator();
                while (it6.hasNext()) {
                    d0.v(arrayList4, (List) ((e23.a) ((Map.Entry) it6.next()).getValue()).invoke());
                }
                Iterator it7 = h0.b1(h0.f1(arrayList4)).iterator();
                while (it7.hasNext()) {
                    ((a) it7.next()).c();
                }
                linkedHashMap.clear();
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    ((e23.a) it8.next()).invoke();
                }
                arrayList2.clear();
            } else {
                try {
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        ((e23.a) it9.next()).invoke();
                    }
                    arrayList.clear();
                } catch (Throwable th4) {
                    StringBuilder sb3 = new StringBuilder("Exception while rolling back from an exception.\nOriginal exception: ");
                    sb3.append(th3);
                    Throwable cause = th3.getCause();
                    sb3.append("\nwith cause ");
                    sb3.append(cause);
                    sb3.append("\n\nRollback exception: ");
                    sb3.append(th4);
                    throw new Throwable(sb3.toString(), th4);
                }
            }
            if (aVar == null && (th3 instanceof b)) {
                return th3.f14174a;
            }
            throw th3;
        }
    }

    public final void g(int i14, e23.a<? extends List<? extends a<?>>> aVar) {
        c.a aVarP0 = this.f14181b.p0();
        if (aVarP0 == null) {
            Iterator<T> it = aVar.invoke().iterator();
            while (it.hasNext()) {
                ((a) it.next()).c();
            }
        } else {
            LinkedHashMap linkedHashMap = aVarP0.f14178d;
            if (linkedHashMap.containsKey(Integer.valueOf(i14))) {
                return;
            }
            linkedHashMap.put(Integer.valueOf(i14), aVar);
        }
    }
}
