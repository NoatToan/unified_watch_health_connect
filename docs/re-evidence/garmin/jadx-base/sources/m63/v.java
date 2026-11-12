package m63;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lm63/v;", "T", "Lm63/i1;", "Lkotlin/Function2;", "Lk23/d;", "", "", "Lk23/p;", "Li63/c;", "compute", "<init>", "(Le23/p;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v<T> implements i1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<k23.d<Object>, List<? extends k23.p>, i63.c<T>> f117025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, h1<T>> f117026b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(e23.p<? super k23.d<Object>, ? super List<? extends k23.p>, ? extends i63.c<T>> pVar) {
        pVar.getClass();
        this.f117025a = pVar;
        this.f117026b = new ConcurrentHashMap<>();
    }

    @Override // m63.i1
    public final Object a(k23.d dVar, ArrayList arrayList) {
        Object bVar;
        h1<T> h1VarPutIfAbsent;
        Class<?> clsU = dh.b.u(dVar);
        ConcurrentHashMap<Class<?>, h1<T>> concurrentHashMap = this.f117026b;
        h1<T> h1Var = concurrentHashMap.get(clsU);
        if (h1Var == null && (h1VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsU, (h1Var = new h1<>()))) != null) {
            h1Var = h1VarPutIfAbsent;
        }
        h1<T> h1Var2 = h1Var;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new n0((k23.p) it.next()));
        }
        ConcurrentHashMap<List<n0>, o13.q<i63.c<T>>> concurrentHashMap2 = h1Var2.f116956a;
        o13.q<i63.c<T>> qVar = concurrentHashMap2.get(arrayList2);
        if (qVar == null) {
            try {
                int i14 = o13.q.f128596b;
                bVar = (i63.c) this.f117025a.invoke(dVar, arrayList);
            } catch (Throwable th3) {
                int i15 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            o13.q<i63.c<T>> qVarA = o13.q.a(bVar);
            o13.q<i63.c<T>> qVarPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList2, qVarA);
            qVar = qVarPutIfAbsent == null ? qVarA : qVarPutIfAbsent;
        }
        return qVar.f128597a;
    }
}
