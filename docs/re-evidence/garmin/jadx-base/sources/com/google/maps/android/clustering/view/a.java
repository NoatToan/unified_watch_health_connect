package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener, GoogleMap.OnInfoWindowLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClusterRendererMultipleItems f53857b;

    public /* synthetic */ a(ClusterRendererMultipleItems clusterRendererMultipleItems, int i14) {
        this.f53856a = i14;
        this.f53857b = clusterRendererMultipleItems;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        switch (this.f53856a) {
            case 1:
                this.f53857b.lambda$onAdd$1(marker);
                break;
            default:
                this.f53857b.lambda$onAdd$4(marker);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        switch (this.f53856a) {
            case 2:
                this.f53857b.lambda$onAdd$2(marker);
                break;
            default:
                this.f53857b.lambda$onAdd$5(marker);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        switch (this.f53856a) {
            case 0:
                return this.f53857b.lambda$onAdd$0(marker);
            default:
                return this.f53857b.lambda$onAdd$3(marker);
        }
    }
}
