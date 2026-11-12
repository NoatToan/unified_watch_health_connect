package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class ModelCache<A, B> {
    private static final int b = 250;
    private final LruCache<b<A>, B> a;

    public class a extends LruCache<b<A>, B> {
        public a(long j) {
            super(j);
        }

        @Override // com.bumptech.glide.util.LruCache
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onItemEvicted(@NonNull b<A> bVar, @Nullable B b) {
            bVar.c();
        }
    }

    @VisibleForTesting
    public static final class b<A> {
        private static final Queue<b<?>> d = Util.createQueue(0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        public static <A> b<A> a(A a, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a, i, i2);
            return bVar;
        }

        private void b(A a, int i, int i2) {
            this.c = a;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c);
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public ModelCache() {
        this(250L);
    }

    public void clear() {
        this.a.clearMemory();
    }

    @Nullable
    public B get(A a2, int i, int i2) {
        b<A> bVarA = b.a(a2, i, i2);
        B b2 = this.a.get(bVarA);
        bVarA.c();
        return b2;
    }

    public void put(A a2, int i, int i2, B b2) {
        this.a.put(b.a(a2, i, i2), b2);
    }

    public ModelCache(long j) {
        this.a = new a(j);
    }
}
