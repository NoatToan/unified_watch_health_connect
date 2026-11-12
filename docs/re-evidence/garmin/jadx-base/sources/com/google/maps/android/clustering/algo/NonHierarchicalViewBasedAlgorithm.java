package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class NonHierarchicalViewBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> implements ScreenBasedAlgorithm<T> {
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private LatLng mMapCenter;
    private int mViewHeight;
    private int mViewWidth;

    public NonHierarchicalViewBasedAlgorithm(int i14, int i15) {
        this.mViewWidth = i14;
        this.mViewHeight = i15;
    }

    private Bounds getVisibleBounds(float f14) {
        LatLng latLng = this.mMapCenter;
        if (latLng == null) {
            return new Bounds(0.0d, 0.0d, 0.0d, 0.0d);
        }
        Point point = PROJECTION.toPoint(latLng);
        double d14 = f14;
        double dPow = ((((double) this.mViewWidth) / Math.pow(2.0d, d14)) / 256.0d) / 2.0d;
        double dPow2 = ((((double) this.mViewHeight) / Math.pow(2.0d, d14)) / 256.0d) / 2.0d;
        double d15 = point.f54320x;
        double d16 = point.f54321y;
        return new Bounds(d15 - dPow, d15 + dPow, d16 - dPow2, d16 + dPow2);
    }

    @Override // com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    public Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> getClusteringItems(PointQuadTree<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> pointQuadTree, float f14) {
        Bounds visibleBounds = getVisibleBounds(f14);
        ArrayList arrayList = new ArrayList();
        double d14 = visibleBounds.minX;
        if (d14 < 0.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(d14 + 1.0d, 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(0.0d, visibleBounds.maxX, visibleBounds.minY, visibleBounds.maxY);
        }
        double d15 = visibleBounds.maxX;
        if (d15 > 1.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(0.0d, d15 - 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(visibleBounds.minX, 1.0d, visibleBounds.minY, visibleBounds.maxY);
        }
        arrayList.addAll(pointQuadTree.search(visibleBounds));
        return arrayList;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(CameraPosition cameraPosition) {
        this.mMapCenter = cameraPosition.target;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public boolean shouldReclusterOnMapMovement() {
        return true;
    }

    public void updateViewSize(int i14, int i15) {
        this.mViewWidth = i14;
        this.mViewHeight = i15;
    }
}
