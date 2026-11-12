package com.google.maps.android.compose.clustering;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import e23.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ClusterManager.OnClusterClickListener, ClusterManager.OnClusterItemClickListener, ClusterManager.OnClusterItemInfoWindowClickListener, ClusterManager.OnClusterItemInfoWindowLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f53940b;

    public /* synthetic */ b(l lVar, int i14) {
        this.f53939a = i14;
        this.f53940b = lVar;
    }

    @Override // com.google.maps.android.clustering.ClusterManager.OnClusterClickListener
    public boolean onClusterClick(Cluster cluster) {
        switch (this.f53939a) {
            case 0:
                return ClusteringKt.Clustering$lambda$14$lambda$13$lambda$9(this.f53940b, cluster);
            default:
                return ClusteringKt.Clustering$lambda$38$lambda$37$lambda$33(this.f53940b, cluster);
        }
    }

    @Override // com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener
    public boolean onClusterItemClick(ClusterItem clusterItem) {
        switch (this.f53939a) {
            case 1:
                return ClusteringKt.Clustering$lambda$14$lambda$13$lambda$10(this.f53940b, clusterItem);
            default:
                return ClusteringKt.Clustering$lambda$38$lambda$37$lambda$34(this.f53940b, clusterItem);
        }
    }

    @Override // com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowClickListener
    public void onClusterItemInfoWindowClick(ClusterItem clusterItem) {
        switch (this.f53939a) {
            case 2:
                this.f53940b.invoke(clusterItem);
                break;
            default:
                this.f53940b.invoke(clusterItem);
                break;
        }
    }

    @Override // com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowLongClickListener
    public void onClusterItemInfoWindowLongClick(ClusterItem clusterItem) {
        switch (this.f53939a) {
            case 3:
                this.f53940b.invoke(clusterItem);
                break;
            default:
                this.f53940b.invoke(clusterItem);
                break;
        }
    }
}
