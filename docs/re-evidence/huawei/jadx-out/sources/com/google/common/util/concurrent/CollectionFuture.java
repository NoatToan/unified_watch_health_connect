package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import defpackage.aml;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    @CheckForNull
    private List<a<V>> values;

    abstract C combine(List<a<V>> list);

    CollectionFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
        List<a<V>> listB;
        super(immutableCollection, z, true);
        if (immutableCollection.isEmpty()) {
            listB = Collections.EMPTY_LIST;
        } else {
            listB = aml.b(immutableCollection.size());
        }
        for (int i = 0; i < immutableCollection.size(); i++) {
            listB.add(null);
        }
        this.values = listB;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void collectOneValue(int i, @ParametricNullness V v) {
        List<a<V>> list = this.values;
        if (list != null) {
            list.set(i, new a<>(v));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void handleAllCompleted() {
        List<a<V>> list = this.values;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void releaseResources(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.releaseResources(releaseResourcesReason);
        this.values = null;
    }

    static final class a<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ParametricNullness
        final V f4694b;

        a(@ParametricNullness V v) {
            this.f4694b = v;
        }
    }
}
