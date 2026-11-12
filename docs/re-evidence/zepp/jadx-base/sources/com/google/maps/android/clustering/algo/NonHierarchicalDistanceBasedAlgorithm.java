package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> implements Algorithm<T> {
    public static final int MAX_DISTANCE_AT_ZOOM = 100;
    private static final SphericalMercatorProjection c = new SphericalMercatorProjection(1.0d);
    private final Collection<b<T>> a = new ArrayList();
    private final PointQuadTree<b<T>> b = new PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d);

    public static class b<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {
        private final T a;
        private final Point b;
        private final LatLng c;
        private Set<T> d;

        @Override // com.google.maps.android.clustering.Cluster
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<T> getItems() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return ((b) obj).a.equals(this.a);
            }
            return false;
        }

        @Override // com.google.maps.android.quadtree.PointQuadTree.Item
        public Point getPoint() {
            return this.b;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public LatLng getPosition() {
            return this.c;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private b(T t) {
            this.a = t;
            LatLng position = t.getPosition();
            this.c = position;
            this.b = NonHierarchicalDistanceBasedAlgorithm.c.toPoint(position);
            this.d = Collections.singleton(t);
        }
    }

    private Bounds b(Point point, double d) {
        double d2 = d / 2.0d;
        double d3 = point.x;
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        double d6 = point.y;
        return new Bounds(d4, d5, d6 - d2, d6 + d2);
    }

    private double c(Point point, Point point2) {
        double d = point.x;
        double d2 = point2.x;
        double d3 = (d - d2) * (d - d2);
        double d4 = point.y;
        double d5 = point2.y;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItem(T t) {
        b<T> bVar = new b<>(t);
        synchronized (this.b) {
            this.a.add(bVar);
            this.b.add(bVar);
        }
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItems(Collection<T> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            addItem(it2.next());
        }
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.b) {
            this.a.clear();
            this.b.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(double d) {
        double dPow = (100.0d / Math.pow(2.0d, (int) d)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.b) {
            for (b<T> bVar : this.a) {
                if (!hashSet.contains(bVar)) {
                    Collection<T> collectionSearch = this.b.search(b(bVar.getPoint(), dPow));
                    if (collectionSearch.size() == 1) {
                        hashSet2.add(bVar);
                        hashSet.add(bVar);
                        map.put(bVar, Double.valueOf(0.0d));
                    } else {
                        StaticCluster staticCluster = new StaticCluster(((b) bVar).a.getPosition());
                        hashSet2.add(staticCluster);
                        for (T t : collectionSearch) {
                            Double d2 = (Double) map.get(t);
                            double d3 = dPow;
                            double dC = c(t.getPoint(), bVar.getPoint());
                            if (d2 == null) {
                                map.put(t, Double.valueOf(dC));
                                staticCluster.add(t.a);
                                map2.put(t, staticCluster);
                            } else if (d2.doubleValue() >= dC) {
                                ((StaticCluster) map2.get(t)).remove(t.a);
                                map.put(t, Double.valueOf(dC));
                                staticCluster.add(t.a);
                                map2.put(t, staticCluster);
                            }
                            dPow = d3;
                        }
                        hashSet.addAll(collectionSearch);
                        dPow = dPow;
                    }
                }
            }
        }
        return hashSet2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            Iterator<b<T>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                arrayList.add(((b) it2.next()).a);
            }
        }
        return arrayList;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void removeItem(T t) {
        b bVar = new b(t);
        synchronized (this.b) {
            this.a.remove(bVar);
            this.b.remove(bVar);
        }
    }
}
