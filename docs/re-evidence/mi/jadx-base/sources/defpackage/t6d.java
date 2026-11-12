package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class t6d<K, V> extends f10<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f34366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f34367b;

    public t6d(K k2, V v) {
        this.f34366a = k2;
        this.f34367b = v;
    }

    @Override // defpackage.f10, java.util.Map.Entry
    public final K getKey() {
        return this.f34366a;
    }

    @Override // defpackage.f10, java.util.Map.Entry
    public final V getValue() {
        return this.f34367b;
    }

    @Override // defpackage.f10, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
