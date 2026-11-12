package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ana<K, V> extends ImmutableBiMap<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ana<Object, Object> f576c = new ana<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private final transient Object f578b;
    private final transient ana<V, K> d;
    final transient Object[] e;
    private final transient int i;

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ana() {
        this.f578b = null;
        this.e = new Object[0];
        this.f577a = 0;
        this.i = 0;
        this.d = this;
    }

    public ana(Object[] objArr, int i) {
        this.e = objArr;
        this.i = i;
        this.f577a = 0;
        int iChooseTableSize = i >= 2 ? ImmutableSet.chooseTableSize(i) : 0;
        this.f578b = anb.a(objArr, i, iChooseTableSize, 0);
        this.d = new ana<>(anb.a(objArr, i, iChooseTableSize, 1), objArr, i, this);
    }

    private ana(@CheckForNull Object obj, Object[] objArr, int i, ana<V, K> anaVar) {
        this.f578b = obj;
        this.e = objArr;
        this.f577a = 1;
        this.i = i;
        this.d = anaVar;
    }

    @Override // java.util.Map
    public int size() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public ImmutableBiMap<V, K> inverse() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v = (V) anb.a(this.f578b, this.e, this.i, this.f577a, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new anb.e(this, this.e, this.f577a, this.i);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new anb.d(this, new anb.a(this.e, this.f577a, this.i));
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }
}
