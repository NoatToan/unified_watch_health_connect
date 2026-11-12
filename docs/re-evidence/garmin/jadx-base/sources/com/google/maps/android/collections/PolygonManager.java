package com.google.maps.android.collections;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class PolygonManager extends MapObjectManager<Polygon, Collection> implements GoogleMap.OnPolygonClickListener {
    public PolygonManager(GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(Polygon polygon) {
        Collection collection = (Collection) this.mAllObjects.get(polygon);
        if (collection == null || collection.mPolygonClickListener == null) {
            return;
        }
        collection.mPolygonClickListener.onPolygonClick(polygon);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(Polygon polygon) {
        return super.remove(polygon);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void setListenersOnUiThread() {
        GoogleMap googleMap = this.mMap;
        if (googleMap != null) {
            googleMap.setOnPolygonClickListener(this);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(Polygon polygon) {
        polygon.remove();
    }

    public class Collection extends MapObjectManager.Collection {
        private GoogleMap.OnPolygonClickListener mPolygonClickListener;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<PolygonOptions> collection, boolean z14) {
            Iterator<PolygonOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next()).setVisible(z14);
            }
        }

        public Polygon addPolygon(PolygonOptions polygonOptions) {
            Polygon polygonAddPolygon = PolygonManager.this.mMap.addPolygon(polygonOptions);
            super.add(polygonAddPolygon);
            return polygonAddPolygon;
        }

        public java.util.Collection<Polygon> getPolygons() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<Polygon> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().setVisible(false);
            }
        }

        public boolean remove(Polygon polygon) {
            return super.remove(polygon);
        }

        public void setOnPolygonClickListener(GoogleMap.OnPolygonClickListener onPolygonClickListener) {
            this.mPolygonClickListener = onPolygonClickListener;
        }

        public void showAll() {
            Iterator<Polygon> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().setVisible(true);
            }
        }

        public void addAll(java.util.Collection<PolygonOptions> collection) {
            Iterator<PolygonOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next());
            }
        }
    }
}
