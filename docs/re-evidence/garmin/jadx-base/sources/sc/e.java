package sc;

import e23.l;
import e23.q;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsc/e;", "", "T", "Lkotlin/Function1;", "Lsc/h;", "fallback", "<init>", "(Le23/l;)V", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, h<T>> f158445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f158446b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f158447c = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super T, h<T>> lVar) {
        this.f158445a = lVar;
    }

    public final <K extends T> void a(k23.d<? extends K> dVar, l<K, ? extends Object> lVar, Map<String, ? extends Object> map, q<? super K, ? super m, ? super Integer, Unit> qVar) {
        LinkedHashMap linkedHashMap = this.f158446b;
        if (linkedHashMap.containsKey(dVar)) {
            o2.c.h(46, "An `entry` with the same `clazz` has already been added: ", dVar.D());
        } else {
            linkedHashMap.put(dVar, new c(dVar, lVar, map, qVar));
        }
    }
}
