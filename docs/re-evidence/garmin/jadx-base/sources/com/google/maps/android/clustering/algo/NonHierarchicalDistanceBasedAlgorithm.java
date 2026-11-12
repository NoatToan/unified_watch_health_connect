package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o2.c;

/* JADX INFO: loaded from: classes2.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_MAX_DISTANCE_AT_ZOOM = 100;
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private int mMaxDistance = 100;
    private final Collection<QuadItem<T>> mItems = new LinkedHashSet();
    private final PointQuadTree<QuadItem<T>> mQuadTree = new PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d);

    private Bounds createBoundsFromSpan(Point point, double d14) {
        double d15 = d14 / 2.0d;
        double d16 = point.f54320x;
        double d17 = point.f54321y;
        return new Bounds(d16 - d15, d16 + d15, d17 - d15, d17 + d15);
    }

    private double distanceSquared(Point point, Point point2) {
        double d14 = point.f54320x;
        double d15 = point2.f54320x;
        double d16 = d14 - d15;
        double d17 = point.f54321y;
        double d18 = point2.f54321y;
        return c.b(d17, d18, d17 - d18, (d14 - d15) * d16);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t7) {
        boolean zAdd;
        QuadItem<T> quadItem = new QuadItem<>(t7, 0);
        synchronized (this.mQuadTree) {
            try {
                zAdd = this.mItems.add(quadItem);
                if (zAdd) {
                    this.mQuadTree.add(quadItem);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zAdd;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            if (addItem(it.next())) {
                z14 = true;
            }
        }
        return z14;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
        }
    }

    public Collection<QuadItem<T>> getClusteringItems(PointQuadTree<QuadItem<T>> pointQuadTree, float f14) {
        return this.mItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f14) {
        double dPow = (((double) this.mMaxDistance) / Math.pow(2.0d, (int) f14)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = getClusteringItems(this.mQuadTree, f14).iterator();
                while (it.hasNext()) {
                    QuadItem<T> next = it.next();
                    if (!hashSet.contains(next)) {
                        Collection<T> collectionSearch = this.mQuadTree.search(createBoundsFromSpan(next.getPoint(), dPow));
                        if (collectionSearch.size() == 1) {
                            hashSet2.add(next);
                            hashSet.add(next);
                            map.put(next, Double.valueOf(0.0d));
                        } else {
                            StaticCluster staticCluster = new StaticCluster(((QuadItem) next).mClusterItem.mo335getPosition());
                            hashSet2.add(staticCluster);
                            for (T t7 : collectionSearch) {
                                Double d14 = (Double) map.get(t7);
                                Iterator<QuadItem<T>> it3 = it;
                                double dDistanceSquared = distanceSquared(t7.getPoint(), next.getPoint());
                                if (d14 == null) {
                                    map.put(t7, Double.valueOf(dDistanceSquared));
                                    staticCluster.add(t7.mClusterItem);
                                    map2.put(t7, staticCluster);
                                } else if (d14.doubleValue() >= dDistanceSquared) {
                                    ((StaticCluster) map2.get(t7)).remove(t7.mClusterItem);
                                    map.put(t7, Double.valueOf(dDistanceSquared));
                                    staticCluster.add(t7.mClusterItem);
                                    map2.put(t7, staticCluster);
                                }
                                it = it3;
                            }
                            hashSet.addAll(collectionSearch);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return hashSet2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = this.mItems.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((QuadItem) it.next()).mClusterItem);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return linkedHashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mMaxDistance;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t7) {
        boolean zRemove;
        QuadItem quadItem = new QuadItem(t7, 0);
        synchronized (this.mQuadTree) {
            try {
                zRemove = this.mItems.remove(quadItem);
                if (zRemove) {
                    this.mQuadTree.remove(quadItem);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zRemove;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean z14;
        synchronized (this.mQuadTree) {
            try {
                Iterator<T> it = collection.iterator();
                int i14 = 0;
                z14 = false;
                while (it.hasNext()) {
                    QuadItem quadItem = new QuadItem(it.next(), i14);
                    if (this.mItems.remove(quadItem)) {
                        this.mQuadTree.remove(quadItem);
                        z14 = true;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i14) {
        this.mMaxDistance = i14;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t7) {
        boolean zRemoveItem;
        synchronized (this.mQuadTree) {
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

    public static class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {
        private final T mClusterItem;
        private final Point mPoint;
        private final LatLng mPosition;
        private Set<T> singletonSet;

        private QuadItem(T t7) {
            this.mClusterItem = t7;
            LatLng latLngMo335getPosition = t7.mo335getPosition();
            this.mPosition = latLngMo335getPosition;
            this.mPoint = NonHierarchicalDistanceBasedAlgorithm.PROJECTION.toPoint(latLngMo335getPosition);
            this.singletonSet = Collections.singleton(t7);
        }

        public boolean equals(Object obj) {
            if (obj instanceof QuadItem) {
                return ((QuadItem) obj).mClusterItem.equals(this.mClusterItem);
            }
            return false;
        }

        @Override // com.google.maps.android.quadtree.PointQuadTree.Item
        public Point getPoint() {
            return this.mPoint;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public LatLng getPosition() {
            return this.mPosition;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.mClusterItem.hashCode();
        }

        @Override // com.google.maps.android.clustering.Cluster
        public Set<T> getItems() {
            return this.singletonSet;
        }

        public /* synthetic */ QuadItem(ClusterItem clusterItem, int i14) {
            this(clusterItem);
        }
    }
}
