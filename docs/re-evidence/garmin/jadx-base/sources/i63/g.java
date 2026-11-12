package i63;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p13.t0;
import p13.u;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li63/g;", "", "T", "Lm63/b;", "", "serialName", "Lk23/d;", "baseClass", "", "subclasses", "Li63/c;", "subclassSerializers", "<init>", "(Ljava/lang/String;Lk23/d;[Lk23/d;[Li63/c;)V", "", "classAnnotations", "(Ljava/lang/String;Lk23/d;[Lk23/d;[Li63/c;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T> extends m63.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<T> f91889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends Annotation> f91890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f91891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<k23.d<? extends T>, c<? extends T>> f91892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f91893e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"i63/g$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f91894a;

        public a(Iterable iterable) {
            this.f91894a = iterable;
        }
    }

    public g(String str, k23.d<T> dVar, k23.d<? extends T>[] dVarArr, c<? extends T>[] cVarArr) {
        str.getClass();
        dVar.getClass();
        dVarArr.getClass();
        cVarArr.getClass();
        this.f91889a = dVar;
        this.f91890b = j0.f134944a;
        this.f91891c = o13.m.a(n.PUBLICATION, new gp.f(29, str, this));
        if (dVarArr.length != cVarArr.length) {
            org.apache.commons.lang3.e.r("All subclasses of sealed class ", dVar.D(), " should be marked @Serializable");
            throw null;
        }
        Map<k23.d<? extends T>, c<? extends T>> mapL = u0.l(u.n0(dVarArr, cVarArr));
        this.f91892d = mapL;
        a aVar = new a(mapL.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.f91894a) {
            String f117019b = ((c) entry.getValue()).getF158591b().getF103257a();
            Object obj = linkedHashMap.get(f117019b);
            if (obj == null) {
                linkedHashMap.containsKey(f117019b);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb3 = new StringBuilder("Multiple sealed subclasses of '");
                sb3.append(this.f91889a);
                sb3.append("' have the same serial name '");
                sb3.append(f117019b);
                sb3.append("': '");
                sb3.append(entry2.getKey());
                Object key = entry.getKey();
                sb3.append("', '");
                sb3.append(key);
                sb3.append(CoreConstants.SINGLE_QUOTE_CHAR);
                throw new IllegalStateException(sb3.toString().toString());
            }
            linkedHashMap.put(f117019b, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (c) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f91893e = linkedHashMap2;
    }

    @Override // m63.b
    public final b<T> a(l63.c cVar, String str) {
        c cVar2 = (c) this.f91893e.get(str);
        return cVar2 != null ? cVar2 : cVar.getF129870c().d(str, c());
    }

    @Override // m63.b
    public final i<T> b(l63.f fVar, T t7) {
        t7.getClass();
        c<? extends T> cVar = this.f91892d.get(s0.f105811a.b(t7.getClass()));
        c<? extends T> cVarB = cVar != null ? cVar : super.b(fVar, t7);
        if (cVarB != null) {
            return cVarB;
        }
        return null;
    }

    @Override // m63.b
    public final k23.d<T> c() {
        return this.f91889a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return (k63.e) this.f91891c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String str, k23.d<T> dVar, k23.d<? extends T>[] dVarArr, c<? extends T>[] cVarArr, Annotation[] annotationArr) {
        this(str, dVar, dVarArr, cVarArr);
        str.getClass();
        dVar.getClass();
        dVarArr.getClass();
        cVarArr.getClass();
        annotationArr.getClass();
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f91890b = listAsList;
    }
}
