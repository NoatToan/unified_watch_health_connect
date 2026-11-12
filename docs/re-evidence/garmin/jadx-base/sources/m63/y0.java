package m63;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lm63/y0;", "Key", "Value", "Collection", "", "Builder", "Lm63/a;", "", "Li63/c;", "keySerializer", "valueSerializer", "<init>", "(Li63/c;Li63/c;)V", "Lm63/g0;", "Lm63/q0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class y0<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<Key> f117046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i63.c<Value> f117047b;

    private y0(i63.c<Key> cVar, i63.c<Value> cVar2) {
        super(null);
        this.f117046a = cVar;
        this.f117047b = cVar2;
    }

    @Override // m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        k63.e f116202c = getF116202c();
        i63.c<Key> cVar2 = this.f117046a;
        int i15 = l63.c.f110557a;
        Object objL = cVar.l(f116202c, i14, cVar2, null);
        int iE = cVar.e(getF116202c());
        if (iE != i14 + 1) {
            vb.h.x(tn.k.e(i14, iE, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objL);
        i63.c<Value> cVar3 = this.f117047b;
        map.put(objL, (!zContainsKey || (cVar3.getF116202c().getF103234b() instanceof k63.d)) ? cVar.l(getF116202c(), iE, cVar3, null) : cVar.l(getF116202c(), iE, cVar3, p13.u0.c(objL, map)));
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Collection collection) {
        d(collection);
        k63.e f116202c = getF116202c();
        l63.d dVarQ = fVar.q(f116202c);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itC = c(collection);
        int i14 = 0;
        while (itC.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itC.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i15 = i14 + 1;
            dVarQ.e(getF116202c(), i14, this.f117046a, key);
            i14 += 2;
            dVarQ.e(getF116202c(), i15, this.f117047b, value);
        }
        dVarQ.b(f116202c);
    }

    public /* synthetic */ y0(i63.c cVar, i63.c cVar2, p005kotlin.jvm.internal.j jVar) {
        this(cVar, cVar2);
    }
}
