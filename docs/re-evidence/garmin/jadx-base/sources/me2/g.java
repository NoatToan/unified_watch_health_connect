package me2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.ui.IconGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lme2/g;", "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;", "Lme2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/maps/android/clustering/ClusterManager;", "clusterManager", "Lkotlin/Function1;", "", "zIndexMapper", "<init>", "(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/clustering/ClusterManager;Le23/l;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends DefaultClusterRenderer<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Float, Float> f118170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconGenerator f118171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f118172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f118173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j40.c f118174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, GoogleMap googleMap, ClusterManager<f> clusterManager, e23.l<? super Float, Float> lVar) {
        super(context, googleMap, clusterManager);
        context.getClass();
        googleMap.getClass();
        clusterManager.getClass();
        lVar.getClass();
        this.f118170a = lVar;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.f118171b = iconGenerator;
        iconGenerator.setBackground(null);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.cluster_marker, (ViewGroup) null);
        viewInflate.getClass();
        iconGenerator.setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.number);
        viewFindViewById.getClass();
        this.f118172c = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.image);
        viewFindViewById2.getClass();
        this.f118173d = (ImageView) viewFindViewById2;
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public final void onBeforeClusterItemRendered(ClusterItem clusterItem, MarkerOptions markerOptions) {
        List<com.garmin.android.library.mapsdkadapter.l> listS;
        long[] longArray;
        f fVar = (f) clusterItem;
        fVar.getClass();
        markerOptions.getClass();
        markerOptions.icon(z.g(fVar.f118168a, true, this.f118170a).getIcon());
        j40.c cVar = this.f118174e;
        if (cVar != null) {
            Object tag = fVar.getTag();
            List<Long> listH0 = null;
            Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
            if (bundle != null && (longArray = bundle.getLongArray("extra_primary_climb_ids")) != null) {
                listH0 = p13.u.h0(longArray);
            }
            if (listH0 == null) {
                listH0 = j0.f134944a;
            }
            Iterator<T> it = listH0.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                qe2.h hVar = cVar.f148294e;
                if (hVar != null && (listS = hVar.f144584a.s()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listS) {
                        Object tag2 = ((com.garmin.android.library.mapsdkadapter.l) obj).getTag();
                        if (tag2 == null) {
                            tag2 = -1L;
                        }
                        if (tag2.equals(Long.valueOf(jLongValue))) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((com.garmin.android.library.mapsdkadapter.l) it3.next()).setVisible(true);
                    }
                }
            }
        }
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public final void onBeforeClusterRendered(Cluster<f> cluster, MarkerOptions markerOptions) {
        List<com.garmin.android.library.mapsdkadapter.l> listS;
        long[] longArray;
        cluster.getClass();
        markerOptions.getClass();
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(w(cluster)));
        j40.c cVar = this.f118174e;
        if (cVar != null) {
            Iterable items = cluster.getItems();
            items.getClass();
            List listB1 = h0.b1(items);
            listB1.getClass();
            Iterator it = listB1.iterator();
            while (it.hasNext()) {
                Object tag = ((qe2.a) it.next()).getTag();
                List<Long> listH0 = null;
                Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
                if (bundle != null && (longArray = bundle.getLongArray("extra_primary_climb_ids")) != null) {
                    listH0 = p13.u.h0(longArray);
                }
                if (listH0 == null) {
                    listH0 = j0.f134944a;
                }
                Iterator<T> it3 = listH0.iterator();
                while (it3.hasNext()) {
                    long jLongValue = ((Number) it3.next()).longValue();
                    qe2.h hVar = cVar.f148294e;
                    if (hVar != null && (listS = hVar.f144584a.s()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listS) {
                            Object tag2 = ((com.garmin.android.library.mapsdkadapter.l) obj).getTag();
                            if (tag2 == null) {
                                tag2 = -1L;
                            }
                            if (tag2.equals(Long.valueOf(jLongValue))) {
                                arrayList.add(obj);
                            }
                        }
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            ((com.garmin.android.library.mapsdkadapter.l) it4.next()).setVisible(false);
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public final void onClusterItemUpdated(ClusterItem clusterItem, Marker marker) {
        f fVar = (f) clusterItem;
        fVar.getClass();
        marker.getClass();
        marker.setIcon(z.g(fVar.f118168a, true, this.f118170a).getIcon());
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public final void onClusterUpdated(Cluster<f> cluster, Marker marker) {
        cluster.getClass();
        marker.getClass();
        marker.setIcon(BitmapDescriptorFactory.fromBitmap(w(cluster)));
    }

    public final Bitmap w(Cluster<f> cluster) {
        int iIntValue;
        Integer num;
        Integer num2;
        if (cluster.getSize() < 100) {
            Iterable items = cluster.getItems();
            items.getClass();
            f fVar = (f) h0.c0(items);
            iIntValue = (fVar == null || (num2 = fVar.f118168a.f50327a.f50320l) == null) ? R.drawable.cluster_icon : num2.intValue();
        } else {
            Iterable items2 = cluster.getItems();
            items2.getClass();
            f fVar2 = (f) h0.c0(items2);
            iIntValue = (fVar2 == null || (num = fVar2.f118168a.f50327a.f50321m) == null) ? R.drawable.wide_cluster_iocn : num.intValue();
        }
        this.f118173d.setImageResource(iIntValue);
        this.f118172c.setText(String.valueOf(cluster.getSize()));
        Bitmap bitmapMakeIcon = this.f118171b.makeIcon();
        bitmapMakeIcon.getClass();
        return bitmapMakeIcon;
    }
}
