package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class StaticCluster<T extends ClusterItem> implements Cluster<T> {
    private final LatLng a;
    private final List<T> b = new ArrayList();

    public StaticCluster(LatLng latLng) {
        this.a = latLng;
    }

    public boolean add(T t) {
        return this.b.add(t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StaticCluster)) {
            return false;
        }
        StaticCluster staticCluster = (StaticCluster) obj;
        return staticCluster.a.equals(this.a) && staticCluster.b.equals(this.b);
    }

    @Override // com.google.maps.android.clustering.Cluster
    public Collection<T> getItems() {
        return this.b;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public LatLng getPosition() {
        return this.a;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public int getSize() {
        return this.b.size();
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    public boolean remove(T t) {
        return this.b.remove(t);
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.a + ", mItems.size=" + this.b.size() + '}';
    }
}
