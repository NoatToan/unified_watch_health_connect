package g23;

import ch.qos.logback.core.CoreConstants;
import k23.l;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lg23/c;", "V", "Lg23/e;", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Lk23/l;", "property", "oldValue", "newValue", "", "beforeChange", "(Lk23/l;Ljava/lang/Object;Ljava/lang/Object;)Z", "", "afterChange", "(Lk23/l;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "getValue", "(Ljava/lang/Object;Lk23/l;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lk23/l;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c<V> implements e<Object, V> {
    private V value;

    public c(V v14) {
        this.value = v14;
    }

    public void afterChange(l<?> property, V oldValue, V newValue) {
        property.getClass();
    }

    public boolean beforeChange(l<?> property, V oldValue, V newValue) {
        property.getClass();
        return true;
    }

    @Override // g23.d
    public V getValue(Object thisRef, l<?> property) {
        property.getClass();
        return this.value;
    }

    @Override // g23.e
    public void setValue(Object thisRef, l<?> property, V value) {
        property.getClass();
        V v14 = this.value;
        if (beforeChange(property, v14, value)) {
            this.value = value;
            afterChange(property, v14, value);
        }
    }

    public String toString() {
        return g.p(new StringBuilder("ObservableProperty(value="), this.value, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
