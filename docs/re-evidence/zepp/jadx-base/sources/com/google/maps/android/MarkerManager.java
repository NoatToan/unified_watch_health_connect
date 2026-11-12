package com.google.maps.android;

import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class MarkerManager implements GoogleMap.OnInfoWindowClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnMarkerDragListener, GoogleMap.InfoWindowAdapter {
    private final GoogleMap a;
    private final Map<String, Collection> b = new HashMap();
    private final Map<Marker, Collection> c = new HashMap();

    public class Collection {
        private final Set<Marker> a = new HashSet();
        private GoogleMap.OnInfoWindowClickListener b;
        private GoogleMap.OnMarkerClickListener c;
        private GoogleMap.OnMarkerDragListener d;
        private GoogleMap.InfoWindowAdapter e;

        public Collection() {
        }

        public Marker addMarker(MarkerOptions markerOptions) {
            Marker markerAddMarker = MarkerManager.this.a.addMarker(markerOptions);
            this.a.add(markerAddMarker);
            MarkerManager.this.c.put(markerAddMarker, this);
            return markerAddMarker;
        }

        public void clear() {
            for (Marker marker : this.a) {
                marker.remove();
                MarkerManager.this.c.remove(marker);
            }
            this.a.clear();
        }

        public java.util.Collection<Marker> getMarkers() {
            return Collections.unmodifiableCollection(this.a);
        }

        public boolean remove(Marker marker) {
            if (!this.a.remove(marker)) {
                return false;
            }
            MarkerManager.this.c.remove(marker);
            marker.remove();
            return true;
        }

        public void setOnInfoWindowAdapter(GoogleMap.InfoWindowAdapter infoWindowAdapter) {
            this.e = infoWindowAdapter;
        }

        public void setOnInfoWindowClickListener(GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
            this.b = onInfoWindowClickListener;
        }

        public void setOnMarkerClickListener(GoogleMap.OnMarkerClickListener onMarkerClickListener) {
            this.c = onMarkerClickListener;
        }

        public void setOnMarkerDragListener(GoogleMap.OnMarkerDragListener onMarkerDragListener) {
            this.d = onMarkerDragListener;
        }
    }

    public MarkerManager(GoogleMap googleMap) {
        this.a = googleMap;
    }

    public Collection getCollection(String str) {
        return this.b.get(str);
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(Marker marker) {
        Collection collection = this.c.get(marker);
        if (collection == null || collection.e == null) {
            return null;
        }
        return collection.e.getInfoContents(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        Collection collection = this.c.get(marker);
        if (collection == null || collection.e == null) {
            return null;
        }
        return collection.e.getInfoWindow(marker);
    }

    public Collection newCollection() {
        return new Collection();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        Collection collection = this.c.get(marker);
        if (collection == null || collection.b == null) {
            return;
        }
        collection.b.onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        Collection collection = this.c.get(marker);
        if (collection == null || collection.c == null) {
            return false;
        }
        return collection.c.onMarkerClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDrag(Marker marker) {
        Collection collection = this.c.get(marker);
        if (collection == null || collection.d == null) {
            return;
        }
        collection.d.onMarkerDrag(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragEnd(Marker marker) {
        Collection collection = this.c.get(marker);
        if (collection == null || collection.d == null) {
            return;
        }
        collection.d.onMarkerDragEnd(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragStart(Marker marker) {
        Collection collection = this.c.get(marker);
        if (collection == null || collection.d == null) {
            return;
        }
        collection.d.onMarkerDragStart(marker);
    }

    public boolean remove(Marker marker) {
        Collection collection = this.c.get(marker);
        return collection != null && collection.remove(marker);
    }

    public Collection newCollection(String str) {
        if (this.b.get(str) == null) {
            Collection collection = new Collection();
            this.b.put(str, collection);
            return collection;
        }
        throw new IllegalArgumentException("collection id is not unique: " + str);
    }
}
