package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p1.c0;

/* JADX INFO: loaded from: classes2.dex */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private final Algorithm<T> mAlgorithm;
    private final c0<Integer, Set<? extends Cluster<T>>> mCache = new c0<>(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();
    private final Executor mExecutor = Executors.newCachedThreadPool();

    public class PrecacheRunnable implements Runnable {
        private final int mZoom;

        public PrecacheRunnable(int i14) {
            this.mZoom = i14;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            PreCachingAlgorithmDecorator.this.getClustersInternal(this.mZoom);
        }
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    private void clearCache() {
        this.mCache.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> getClustersInternal(int i14) {
        this.mCacheLock.readLock().lock();
        Set<? extends Cluster<T>> clusters = this.mCache.get(Integer.valueOf(i14));
        this.mCacheLock.readLock().unlock();
        if (clusters == null) {
            this.mCacheLock.writeLock().lock();
            clusters = this.mCache.get(Integer.valueOf(i14));
            if (clusters == null) {
                clusters = this.mAlgorithm.getClusters(i14);
                this.mCache.put(Integer.valueOf(i14), clusters);
            }
            this.mCacheLock.writeLock().unlock();
        }
        return clusters;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t7) {
        boolean zAddItem = this.mAlgorithm.addItem(t7);
        if (zAddItem) {
            clearCache();
        }
        return zAddItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        boolean zAddItems = this.mAlgorithm.addItems(collection);
        if (zAddItems) {
            clearCache();
        }
        return zAddItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mAlgorithm.clearItems();
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f14) {
        int i14 = (int) f14;
        Set<? extends Cluster<T>> clustersInternal = getClustersInternal(i14);
        int i15 = i14 + 1;
        if (this.mCache.get(Integer.valueOf(i15)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i15));
        }
        int i16 = i14 - 1;
        if (this.mCache.get(Integer.valueOf(i16)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i16));
        }
        return clustersInternal;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t7) {
        boolean zRemoveItem = this.mAlgorithm.removeItem(t7);
        if (zRemoveItem) {
            clearCache();
        }
        return zRemoveItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean zRemoveItems = this.mAlgorithm.removeItems(collection);
        if (zRemoveItems) {
            clearCache();
        }
        return zRemoveItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i14) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i14);
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t7) {
        boolean zUpdateItem = this.mAlgorithm.updateItem(t7);
        if (zUpdateItem) {
            clearCache();
        }
        return zUpdateItem;
    }
}
