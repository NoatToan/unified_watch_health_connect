package defpackage;

import com.google.common.collect.AbstractMapEntry;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class alx<K, V> extends AbstractMapEntry<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ParametricNullness
    final K f520a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ParametricNullness
    final V f521c;

    public alx(@ParametricNullness K k, @ParametricNullness V v) {
        this.f520a = k;
        this.f521c = v;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.f520a;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        return this.f521c;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v) {
        throw new UnsupportedOperationException();
    }
}
