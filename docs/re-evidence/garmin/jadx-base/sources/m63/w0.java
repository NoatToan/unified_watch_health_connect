package m63;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\nB#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lm63/w0;", "K", "V", "Lm63/o0;", "", "Li63/c;", "keySerializer", "valueSerializer", "<init>", "(Li63/c;Li63/c;)V", "a", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0<K, V> extends o0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k63.f f117031c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0005\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm63/w0$a;", "K", "V", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a<K, V> implements Map.Entry<K, V>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f117032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f117033b;

        public a(K k14, V v14) {
            this.f117032a = k14;
            this.f117033b = v14;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f117032a, aVar.f117032a) && p005kotlin.jvm.internal.s.g(this.f117033b, aVar.f117033b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f117032a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f117033b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k14 = this.f117032a;
            int iHashCode = (k14 == null ? 0 : k14.hashCode()) * 31;
            V v14 = this.f117033b;
            return iHashCode + (v14 != null ? v14.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v14) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MapEntry(key=");
            sb3.append(this.f117032a);
            sb3.append(", value=");
            return wr.g.p(sb3, this.f117033b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i63.c<K> cVar, i63.c<V> cVar2) {
        super(cVar, cVar2, null);
        cVar.getClass();
        cVar2.getClass();
        this.f117031c = k63.k.e("kotlin.collections.Map.Entry", k63.m.c.f103255a, new k63.e[0], new l3.p1(25, cVar, cVar2));
    }

    @Override // m63.o0
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return entry.getKey();
    }

    @Override // m63.o0
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return entry.getValue();
    }

    @Override // m63.o0
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f117031c;
    }
}
