package com.google.maps.android.clustering.algo;

import androidx.collection.LruCache;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> implements Algorithm<T> {
    private final Algorithm<T> a;
    private final LruCache<Integer, Set<? extends Cluster<T>>> b = new LruCache<>(5);
    private final ReadWriteLock c = new ReentrantReadWriteLock();

    public class a implements Runnable {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            PreCachingAlgorithmDecorator.this.c(this.a);
        }
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.a = algorithm;
    }

    private void b() {
        this.b.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> c(int i) {
        this.c.readLock().lock();
        Set<? extends Cluster<T>> clusters = this.b.get(Integer.valueOf(i));
        this.c.readLock().unlock();
        if (clusters == null) {
            this.c.writeLock().lock();
            clusters = this.b.get(Integer.valueOf(i));
            if (clusters == null) {
                clusters = this.a.getClusters(i);
                this.b.put(Integer.valueOf(i), clusters);
            }
            this.c.writeLock().unlock();
        }
        return clusters;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItem(T t) {
        this.a.addItem(t);
        b();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItems(Collection<T> collection) {
        this.a.addItems(collection);
        b();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.a.clearItems();
        b();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(double d) {
        int i = (int) d;
        Set<? extends Cluster<T>> setC = c(i);
        int i2 = i + 1;
        if (this.b.get(Integer.valueOf(i2)) == null) {
            new Thread(new a(i2)).start();
        }
        int i3 = i - 1;
        if (this.b.get(Integer.valueOf(i3)) == null) {
            new Thread(new a(i3)).start();
        }
        return setC;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.a.getItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void removeItem(T t) {
        this.a.removeItem(t);
        b();
    }
}
