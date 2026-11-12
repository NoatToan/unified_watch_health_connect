package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p1.z;

/* JADX INFO: loaded from: classes2.dex */
public class GridBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_GRID_SIZE = 100;
    private int mGridSize = 100;
    private final Set<T> mItems = Collections.synchronizedSet(new HashSet());

    private static long getCoord(long j8, double d14, double d15) {
        return (long) (Math.floor(d15) + (Math.floor(d14) * j8));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t7) {
        return this.mItems.add(t7);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        return this.mItems.addAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mItems.clear();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f14) {
        long jCeil = (long) Math.ceil((Math.pow(2.0d, f14) * 256.0d) / ((double) this.mGridSize));
        SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection(jCeil);
        HashSet hashSet = new HashSet();
        z zVar = new z();
        synchronized (this.mItems) {
            try {
                for (T t7 : this.mItems) {
                    Point point = sphericalMercatorProjection.toPoint(t7.mo335getPosition());
                    long coord = getCoord(jCeil, point.f54320x, point.f54321y);
                    StaticCluster staticCluster = (StaticCluster) zVar.b(coord);
                    if (staticCluster == null) {
                        staticCluster = new StaticCluster(sphericalMercatorProjection.toLatLng(new com.google.maps.android.geometry.Point(Math.floor(point.f54320x) + 0.5d, Math.floor(point.f54321y) + 0.5d)));
                        zVar.f(coord, staticCluster);
                        hashSet.add(staticCluster);
                    }
                    staticCluster.add(t7);
                    jCeil = jCeil;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return hashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mGridSize;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t7) {
        return this.mItems.remove(t7);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        return this.mItems.removeAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i14) {
        this.mGridSize = i14;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t7) {
        boolean zRemoveItem;
        synchronized (this.mItems) {
            try {
                zRemoveItem = removeItem(t7);
                if (zRemoveItem) {
                    zRemoveItem = addItem(t7);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zRemoveItem;
    }
}
