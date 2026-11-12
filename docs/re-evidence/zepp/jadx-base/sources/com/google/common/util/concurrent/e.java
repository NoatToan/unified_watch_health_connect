package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class e<V, C> extends c<V, C> {

    public abstract class a extends c<V, C>.a {
        private List<Optional<V>> i;

        public a(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
            super(immutableCollection, z, true);
            this.i = immutableCollection.isEmpty() ? ImmutableList.of() : Lists.newArrayListWithCapacity(immutableCollection.size());
            for (int i = 0; i < immutableCollection.size(); i++) {
                this.i.add(null);
            }
        }

        @Override // com.google.common.util.concurrent.c.a
        public final void l(boolean z, int i, @NullableDecl V v) {
            List<Optional<V>> list = this.i;
            if (list != null) {
                list.set(i, Optional.fromNullable(v));
            } else {
                Preconditions.checkState(z || e.this.isCancelled(), "Future was done before all dependencies completed");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.c.a
        public final void n() {
            List<Optional<V>> list = this.i;
            if (list != null) {
                e.this.set(u(list));
            } else {
                Preconditions.checkState(e.this.isDone());
            }
        }

        @Override // com.google.common.util.concurrent.c.a
        public void t() {
            super.t();
            this.i = null;
        }

        public abstract C u(List<Optional<V>> list);
    }

    public static final class b<V> extends e<V, List<V>> {

        public final class a extends e<V, List<V>>.a {
            public a(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
                super(immutableCollection, z);
            }

            @Override // com.google.common.util.concurrent.e.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public List<V> u(List<Optional<V>> list) {
                ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
                Iterator<Optional<V>> it2 = list.iterator();
                while (it2.hasNext()) {
                    Optional<V> next = it2.next();
                    arrayListNewArrayListWithCapacity.add(next != null ? next.orNull() : null);
                }
                return Collections.unmodifiableList(arrayListNewArrayListWithCapacity);
            }
        }

        public b(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
            A(new a(immutableCollection, z));
        }
    }
}
