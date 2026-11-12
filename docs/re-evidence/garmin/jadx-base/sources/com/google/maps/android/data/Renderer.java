package com.google.maps.android.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.R;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.geojson.BiMultiMap;
import com.google.maps.android.data.geojson.GeoJsonFeature;
import com.google.maps.android.data.geojson.GeoJsonGeometryCollection;
import com.google.maps.android.data.geojson.GeoJsonLineString;
import com.google.maps.android.data.geojson.GeoJsonLineStringStyle;
import com.google.maps.android.data.geojson.GeoJsonMultiLineString;
import com.google.maps.android.data.geojson.GeoJsonMultiPoint;
import com.google.maps.android.data.geojson.GeoJsonMultiPolygon;
import com.google.maps.android.data.geojson.GeoJsonPoint;
import com.google.maps.android.data.geojson.GeoJsonPointStyle;
import com.google.maps.android.data.geojson.GeoJsonPolygon;
import com.google.maps.android.data.geojson.GeoJsonPolygonStyle;
import com.google.maps.android.data.kml.KmlContainer;
import com.google.maps.android.data.kml.KmlGroundOverlay;
import com.google.maps.android.data.kml.KmlMultiGeometry;
import com.google.maps.android.data.kml.KmlPlacemark;
import com.google.maps.android.data.kml.KmlPoint;
import com.google.maps.android.data.kml.KmlPolygon;
import com.google.maps.android.data.kml.KmlStyle;
import com.google.maps.android.data.kml.KmlUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class Renderer {
    private static final Object FEATURE_NOT_ON_MAP = null;
    private static final int MARKER_ICON_SIZE = 32;
    private static final DecimalFormat sScaleFormat = new DecimalFormat("#.####");
    private final BiMultiMap<Feature> mContainerFeatures;
    private ArrayList<KmlContainer> mContainers;
    private Context mContext;
    private final GeoJsonLineStringStyle mDefaultLineStringStyle;
    private final GeoJsonPointStyle mDefaultPointStyle;
    private final GeoJsonPolygonStyle mDefaultPolygonStyle;
    private final BiMultiMap<Feature> mFeatures;
    private HashMap<KmlGroundOverlay, GroundOverlay> mGroundOverlayMap;
    private final GroundOverlayManager.Collection mGroundOverlays;
    private ImagesCache mImagesCache;
    private boolean mLayerOnMap;
    private GoogleMap mMap;
    private final Set<String> mMarkerIconUrls;
    private final MarkerManager.Collection mMarkers;
    private int mNumActiveDownloads;
    private final PolygonManager.Collection mPolygons;
    private final PolylineManager.Collection mPolylines;
    private HashMap<String, String> mStyleMaps;
    private HashMap<String, KmlStyle> mStyles;
    private HashMap<String, KmlStyle> mStylesRenderer;

    public static final class ImagesCache {
        final Map<String, Map<String, BitmapDescriptor>> markerImagesCache = new HashMap();
        final Map<String, BitmapDescriptor> groundOverlayImagesCache = new HashMap();
        final Map<String, Bitmap> bitmapCache = new HashMap();
    }

    private Renderer(GoogleMap googleMap, Set<String> set, GeoJsonPointStyle geoJsonPointStyle, GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonPolygonStyle geoJsonPolygonStyle, BiMultiMap<Feature> biMultiMap, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this.mFeatures = new BiMultiMap<>();
        this.mNumActiveDownloads = 0;
        this.mMap = googleMap;
        this.mLayerOnMap = false;
        this.mMarkerIconUrls = set;
        this.mDefaultPointStyle = geoJsonPointStyle;
        this.mDefaultLineStringStyle = geoJsonLineStringStyle;
        this.mDefaultPolygonStyle = geoJsonPolygonStyle;
        this.mContainerFeatures = biMultiMap;
        if (googleMap != null) {
            this.mMarkers = (markerManager == null ? new MarkerManager(googleMap) : markerManager).newCollection();
            this.mPolygons = (polygonManager == null ? new PolygonManager(googleMap) : polygonManager).newCollection();
            this.mPolylines = (polylineManager == null ? new PolylineManager(googleMap) : polylineManager).newCollection();
            this.mGroundOverlays = (groundOverlayManager == null ? new GroundOverlayManager(googleMap) : groundOverlayManager).newCollection();
            return;
        }
        this.mMarkers = null;
        this.mPolygons = null;
        this.mPolylines = null;
        this.mGroundOverlays = null;
    }

    private ArrayList<Object> addGeometryCollectionToMap(GeoJsonFeature geoJsonFeature, List<Geometry> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<Geometry> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(addGeoJsonFeatureToMap(geoJsonFeature, it.next()));
        }
        return arrayList;
    }

    private Polyline addLineStringToMap(PolylineOptions polylineOptions, LineString lineString) {
        polylineOptions.addAll(lineString.getGeometryObject());
        Polyline polylineAddPolyline = this.mPolylines.addPolyline(polylineOptions);
        polylineAddPolyline.setClickable(polylineOptions.isClickable());
        return polylineAddPolyline;
    }

    private void addMarkerIcons(String str, double d14, MarkerOptions markerOptions) {
        BitmapDescriptor cachedMarkerImage = getCachedMarkerImage(str, d14);
        if (cachedMarkerImage != null) {
            markerOptions.icon(cachedMarkerImage);
        } else {
            this.mMarkerIconUrls.add(str);
        }
    }

    private ArrayList<Object> addMultiGeometryToMap(KmlPlacemark kmlPlacemark, KmlMultiGeometry kmlMultiGeometry, KmlStyle kmlStyle, KmlStyle kmlStyle2, boolean z14) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<Geometry> it = kmlMultiGeometry.getGeometryObject().iterator();
        while (it.hasNext()) {
            KmlPlacemark kmlPlacemark2 = kmlPlacemark;
            arrayList.add(addKmlPlacemarkToMap(kmlPlacemark2, it.next(), kmlStyle, kmlStyle2, z14));
            kmlPlacemark = kmlPlacemark2;
        }
        return arrayList;
    }

    private ArrayList<Polyline> addMultiLineStringToMap(GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonMultiLineString geoJsonMultiLineString) {
        ArrayList<Polyline> arrayList = new ArrayList<>();
        Iterator<GeoJsonLineString> it = geoJsonMultiLineString.getLineStrings().iterator();
        while (it.hasNext()) {
            arrayList.add(addLineStringToMap(geoJsonLineStringStyle.toPolylineOptions(), it.next()));
        }
        return arrayList;
    }

    private ArrayList<Marker> addMultiPointToMap(GeoJsonPointStyle geoJsonPointStyle, GeoJsonMultiPoint geoJsonMultiPoint) {
        ArrayList<Marker> arrayList = new ArrayList<>();
        Iterator<GeoJsonPoint> it = geoJsonMultiPoint.getPoints().iterator();
        while (it.hasNext()) {
            arrayList.add(addPointToMap(geoJsonPointStyle.toMarkerOptions(), it.next()));
        }
        return arrayList;
    }

    private ArrayList<Polygon> addMultiPolygonToMap(GeoJsonPolygonStyle geoJsonPolygonStyle, GeoJsonMultiPolygon geoJsonMultiPolygon) {
        ArrayList<Polygon> arrayList = new ArrayList<>();
        Iterator<GeoJsonPolygon> it = geoJsonMultiPolygon.getPolygons().iterator();
        while (it.hasNext()) {
            arrayList.add(addPolygonToMap(geoJsonPolygonStyle.toPolygonOptions(), it.next()));
        }
        return arrayList;
    }

    private Marker addPointToMap(MarkerOptions markerOptions, Point point) {
        markerOptions.position(point.getGeometryObject());
        return this.mMarkers.addMarker(markerOptions);
    }

    private Polygon addPolygonToMap(PolygonOptions polygonOptions, DataPolygon dataPolygon) {
        polygonOptions.addAll(dataPolygon.getOuterBoundaryCoordinates());
        Iterator<List<LatLng>> it = dataPolygon.getInnerBoundaryCoordinates().iterator();
        while (it.hasNext()) {
            polygonOptions.addHole(it.next());
        }
        Polygon polygonAddPolygon = this.mPolygons.addPolygon(polygonOptions);
        polygonAddPolygon.setClickable(polygonOptions.isClickable());
        return polygonAddPolygon;
    }

    private void createInfoWindow() {
        this.mMarkers.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() { // from class: com.google.maps.android.data.Renderer.1
            @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
            public View getInfoContents(Marker marker) {
                View viewInflate = LayoutInflater.from(Renderer.this.mContext).inflate(R.layout.amu_info_window, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.window);
                if (marker.getSnippet() == null) {
                    textView.setText(Html.fromHtml(marker.getTitle()));
                    return viewInflate;
                }
                textView.setText(Html.fromHtml(marker.getTitle() + "<br>" + marker.getSnippet()));
                return viewInflate;
            }

            @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
            public View getInfoWindow(Marker marker) {
                return null;
            }
        });
    }

    public static boolean getPlacemarkVisibility(Feature feature) {
        return (feature.hasProperty("visibility") && Integer.parseInt(feature.getProperty("visibility")) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFeatureClickListener$0(Layer.OnFeatureClickListener onFeatureClickListener, Polygon polygon) {
        if (getFeature(polygon) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(polygon));
        } else if (getContainerFeature(polygon) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(polygon));
        } else {
            onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(polygon)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setOnFeatureClickListener$1(Layer.OnFeatureClickListener onFeatureClickListener, Marker marker) {
        if (getFeature(marker) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(marker));
            return false;
        }
        if (getContainerFeature(marker) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(marker));
            return false;
        }
        onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(marker)));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFeatureClickListener$2(Layer.OnFeatureClickListener onFeatureClickListener, Polyline polyline) {
        if (getFeature(polyline) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(polyline));
        } else if (getContainerFeature(polyline) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(polyline));
        } else {
            onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(polyline)));
        }
    }

    private ArrayList<?> multiObjectHandler(Object obj) {
        for (Object obj2 : getValues()) {
            if (obj2.getClass().getSimpleName().equals("ArrayList")) {
                ArrayList<?> arrayList = (ArrayList) obj2;
                if (arrayList.contains(obj)) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    private void putMarkerImagesCache(String str, String str2, BitmapDescriptor bitmapDescriptor) {
        Map<String, BitmapDescriptor> map = this.mImagesCache.markerImagesCache.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.mImagesCache.markerImagesCache.put(str, map);
        }
        map.put(str2, bitmapDescriptor);
    }

    private void removeFeatures(Collection collection) {
        for (Object obj : collection) {
            if (obj instanceof Collection) {
                removeFeatures((Collection) obj);
            } else if (obj instanceof Marker) {
                this.mMarkers.remove((Marker) obj);
            } else if (obj instanceof Polyline) {
                this.mPolylines.remove((Polyline) obj);
            } else if (obj instanceof Polygon) {
                this.mPolygons.remove((Polygon) obj);
            }
        }
    }

    private BitmapDescriptor scaleIcon(Bitmap bitmap, double d14) {
        int i14;
        int i15 = (int) (((double) (this.mContext.getResources().getDisplayMetrics().density * 32.0f)) * d14);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i14 = (int) ((height * i15) / width);
        } else if (width > height) {
            int i16 = (int) ((width * i15) / height);
            i14 = i15;
            i15 = i16;
        } else {
            i14 = i15;
        }
        return BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, i15, i14, false));
    }

    private void setFeatureDefaultStyles(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature.getPointStyle() == null) {
            geoJsonFeature.setPointStyle(this.mDefaultPointStyle);
        }
        if (geoJsonFeature.getLineStringStyle() == null) {
            geoJsonFeature.setLineStringStyle(this.mDefaultLineStringStyle);
        }
        if (geoJsonFeature.getPolygonStyle() == null) {
            geoJsonFeature.setPolygonStyle(this.mDefaultPolygonStyle);
        }
    }

    private void setInlineLineStringStyle(PolylineOptions polylineOptions, KmlStyle kmlStyle) {
        PolylineOptions polylineOptions2 = kmlStyle.getPolylineOptions();
        if (kmlStyle.isStyleSet("outlineColor")) {
            polylineOptions.color(polylineOptions2.getColor());
        }
        if (kmlStyle.isStyleSet("width")) {
            polylineOptions.width(polylineOptions2.getWidth());
        }
        if (kmlStyle.isLineRandomColorMode()) {
            polylineOptions.color(KmlStyle.computeRandomColor(polylineOptions2.getColor()));
        }
    }

    private void setInlinePointStyle(MarkerOptions markerOptions, KmlStyle kmlStyle, KmlStyle kmlStyle2) {
        double iconScale;
        MarkerOptions markerOptions2 = kmlStyle.getMarkerOptions();
        if (kmlStyle.isStyleSet("heading")) {
            markerOptions.rotation(markerOptions2.getRotation());
        }
        if (kmlStyle.isStyleSet("hotSpot")) {
            markerOptions.anchor(markerOptions2.getAnchorU(), markerOptions2.getAnchorV());
        }
        if (kmlStyle.isStyleSet("markerColor")) {
            markerOptions.icon(markerOptions2.getIcon());
        }
        if (kmlStyle.isStyleSet("iconScale")) {
            iconScale = kmlStyle.getIconScale();
        } else {
            iconScale = kmlStyle2.isStyleSet("iconScale") ? kmlStyle2.getIconScale() : 1.0d;
        }
        if (kmlStyle.isStyleSet("iconUrl")) {
            addMarkerIcons(kmlStyle.getIconUrl(), iconScale, markerOptions);
        } else if (kmlStyle2.getIconUrl() != null) {
            addMarkerIcons(kmlStyle2.getIconUrl(), iconScale, markerOptions);
        }
    }

    private void setInlinePolygonStyle(PolygonOptions polygonOptions, KmlStyle kmlStyle) {
        PolygonOptions polygonOptions2 = kmlStyle.getPolygonOptions();
        if (kmlStyle.hasFill() && kmlStyle.isStyleSet("fillColor")) {
            polygonOptions.fillColor(polygonOptions2.getFillColor());
        }
        if (kmlStyle.hasOutline()) {
            if (kmlStyle.isStyleSet("outlineColor")) {
                polygonOptions.strokeColor(polygonOptions2.getStrokeColor());
            }
            if (kmlStyle.isStyleSet("width")) {
                polygonOptions.strokeWidth(polygonOptions2.getStrokeWidth());
            }
        }
        if (kmlStyle.isPolyRandomColorMode()) {
            polygonOptions.fillColor(KmlStyle.computeRandomColor(polygonOptions2.getFillColor()));
        }
    }

    private void setMarkerInfoWindow(KmlStyle kmlStyle, Marker marker, KmlPlacemark kmlPlacemark) {
        boolean zHasProperty = kmlPlacemark.hasProperty("name");
        boolean zHasProperty2 = kmlPlacemark.hasProperty("description");
        boolean zHasBalloonStyle = kmlStyle.hasBalloonStyle();
        boolean zContainsKey = kmlStyle.getBalloonOptions().containsKey("text");
        if (zHasBalloonStyle && zContainsKey) {
            marker.setTitle(KmlUtil.substituteProperties(kmlStyle.getBalloonOptions().get("text"), kmlPlacemark));
            createInfoWindow();
            return;
        }
        if (zHasBalloonStyle && zHasProperty) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            createInfoWindow();
            return;
        }
        if (zHasProperty && zHasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            marker.setSnippet(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (zHasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (zHasProperty) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            createInfoWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    public void addFeature(Feature feature) {
        Renderer renderer;
        Object objAddGeoJsonFeatureToMap = FEATURE_NOT_ON_MAP;
        if (feature instanceof GeoJsonFeature) {
            setFeatureDefaultStyles((GeoJsonFeature) feature);
        }
        if (this.mLayerOnMap) {
            if (this.mFeatures.containsKey(feature)) {
                removeFromMap(this.mFeatures.get(feature));
            }
            if (!feature.hasGeometry()) {
                renderer = this;
            } else if (feature instanceof KmlPlacemark) {
                KmlPlacemark kmlPlacemark = (KmlPlacemark) feature;
                renderer = this;
                objAddGeoJsonFeatureToMap = renderer.addKmlPlacemarkToMap(kmlPlacemark, feature.getGeometry(), getPlacemarkStyle(feature.getId()), kmlPlacemark.getInlineStyle(), getPlacemarkVisibility(feature));
            } else {
                renderer = this;
                objAddGeoJsonFeatureToMap = addGeoJsonFeatureToMap(feature, feature.getGeometry());
            }
        } else {
            renderer = this;
        }
        renderer.mFeatures.put(feature, objAddGeoJsonFeatureToMap);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Object addGeoJsonFeatureToMap(Feature feature, Geometry geometry) {
        String geometryType = geometry.getGeometryType();
        geometryType.getClass();
        byte b14 = -1;
        switch (geometryType.hashCode()) {
            case -2116761119:
                if (geometryType.equals("MultiPolygon")) {
                    b14 = 0;
                }
                break;
            case -1065891849:
                if (geometryType.equals("MultiPoint")) {
                    b14 = 1;
                }
                break;
            case -627102946:
                if (geometryType.equals("MultiLineString")) {
                    b14 = 2;
                }
                break;
            case 77292912:
                if (geometryType.equals("Point")) {
                    b14 = 3;
                }
                break;
            case 1267133722:
                if (geometryType.equals(KmlPolygon.GEOMETRY_TYPE)) {
                    b14 = 4;
                }
                break;
            case 1806700869:
                if (geometryType.equals("LineString")) {
                    b14 = 5;
                }
                break;
            case 1950410960:
                if (geometryType.equals("GeometryCollection")) {
                    b14 = 6;
                }
                break;
        }
        MarkerOptions markerOptions = null;
        PolylineOptions polylineOptions = null;
        PolygonOptions polygonOptions = null;
        switch (b14) {
            case 0:
                return addMultiPolygonToMap(((GeoJsonFeature) feature).getPolygonStyle(), (GeoJsonMultiPolygon) geometry);
            case 1:
                return addMultiPointToMap(((GeoJsonFeature) feature).getPointStyle(), (GeoJsonMultiPoint) geometry);
            case 2:
                return addMultiLineStringToMap(((GeoJsonFeature) feature).getLineStringStyle(), (GeoJsonMultiLineString) geometry);
            case 3:
                if (feature instanceof GeoJsonFeature) {
                    markerOptions = ((GeoJsonFeature) feature).getMarkerOptions();
                } else if (feature instanceof KmlPlacemark) {
                    markerOptions = ((KmlPlacemark) feature).getMarkerOptions();
                }
                return addPointToMap(markerOptions, (GeoJsonPoint) geometry);
            case 4:
                if (feature instanceof GeoJsonFeature) {
                    polygonOptions = ((GeoJsonFeature) feature).getPolygonOptions();
                } else if (feature instanceof KmlPlacemark) {
                    polygonOptions = ((KmlPlacemark) feature).getPolygonOptions();
                }
                return addPolygonToMap(polygonOptions, (DataPolygon) geometry);
            case 5:
                if (feature instanceof GeoJsonFeature) {
                    polylineOptions = ((GeoJsonFeature) feature).getPolylineOptions();
                } else if (feature instanceof KmlPlacemark) {
                    polylineOptions = ((KmlPlacemark) feature).getPolylineOptions();
                }
                return addLineStringToMap(polylineOptions, (GeoJsonLineString) geometry);
            case 6:
                return addGeometryCollectionToMap((GeoJsonFeature) feature, ((GeoJsonGeometryCollection) geometry).getGeometries());
            default:
                return null;
        }
    }

    public Object addKmlPlacemarkToMap(KmlPlacemark kmlPlacemark, Geometry geometry, KmlStyle kmlStyle, KmlStyle kmlStyle2, boolean z14) {
        String geometryType = geometry.getGeometryType();
        boolean zHasProperty = kmlPlacemark.hasProperty("drawOrder");
        byte b14 = 0;
        float f14 = 0.0f;
        if (zHasProperty) {
            try {
                f14 = Float.parseFloat(kmlPlacemark.getProperty("drawOrder"));
            } catch (NumberFormatException unused) {
                zHasProperty = false;
            }
        }
        geometryType.getClass();
        switch (geometryType.hashCode()) {
            case 77292912:
                if (!geometryType.equals("Point")) {
                    b14 = -1;
                }
                break;
            case 89139371:
                b14 = !geometryType.equals("MultiGeometry") ? (byte) -1 : (byte) 1;
                break;
            case 1267133722:
                b14 = !geometryType.equals(KmlPolygon.GEOMETRY_TYPE) ? (byte) -1 : (byte) 2;
                break;
            case 1806700869:
                b14 = !geometryType.equals("LineString") ? (byte) -1 : (byte) 3;
                break;
            default:
                b14 = -1;
                break;
        }
        switch (b14) {
            case 0:
                MarkerOptions markerOptions = kmlStyle.getMarkerOptions();
                if (kmlStyle2 != null) {
                    setInlinePointStyle(markerOptions, kmlStyle2, kmlStyle);
                } else if (kmlStyle.getIconUrl() != null) {
                    addMarkerIcons(kmlStyle.getIconUrl(), kmlStyle.getIconScale(), markerOptions);
                }
                Marker markerAddPointToMap = addPointToMap(markerOptions, (KmlPoint) geometry);
                markerAddPointToMap.setVisible(z14);
                setMarkerInfoWindow(kmlStyle, markerAddPointToMap, kmlPlacemark);
                if (zHasProperty) {
                    markerAddPointToMap.setZIndex(f14);
                }
                return markerAddPointToMap;
            case 1:
                return addMultiGeometryToMap(kmlPlacemark, (KmlMultiGeometry) geometry, kmlStyle, kmlStyle2, z14);
            case 2:
                PolygonOptions polygonOptions = kmlStyle.getPolygonOptions();
                if (kmlStyle2 != null) {
                    setInlinePolygonStyle(polygonOptions, kmlStyle2);
                } else if (kmlStyle.isPolyRandomColorMode()) {
                    polygonOptions.fillColor(KmlStyle.computeRandomColor(polygonOptions.getFillColor()));
                }
                Polygon polygonAddPolygonToMap = addPolygonToMap(polygonOptions, (DataPolygon) geometry);
                polygonAddPolygonToMap.setVisible(z14);
                if (zHasProperty) {
                    polygonAddPolygonToMap.setZIndex(f14);
                }
                return polygonAddPolygonToMap;
            case 3:
                PolylineOptions polylineOptions = kmlStyle.getPolylineOptions();
                if (kmlStyle2 != null) {
                    setInlineLineStringStyle(polylineOptions, kmlStyle2);
                } else if (kmlStyle.isLineRandomColorMode()) {
                    polylineOptions.color(KmlStyle.computeRandomColor(polylineOptions.getColor()));
                }
                Polyline polylineAddLineStringToMap = addLineStringToMap(polylineOptions, (LineString) geometry);
                polylineAddLineStringToMap.setVisible(z14);
                if (zHasProperty) {
                    polylineAddLineStringToMap.setZIndex(f14);
                }
                return polylineAddLineStringToMap;
            default:
                return null;
        }
    }

    public void assignStyleMap(HashMap<String, String> map, HashMap<String, KmlStyle> map2) {
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (map2.containsKey(str2)) {
                map2.put(str, map2.get(str2));
            }
        }
    }

    public GroundOverlay attachGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        return this.mGroundOverlays.addGroundOverlay(groundOverlayOptions);
    }

    public void cacheBitmap(String str, Bitmap bitmap) {
        this.mImagesCache.bitmapCache.put(str, bitmap);
    }

    public void checkClearBitmapCache() {
        ImagesCache imagesCache;
        if (this.mNumActiveDownloads != 0 || (imagesCache = this.mImagesCache) == null || imagesCache.bitmapCache.isEmpty()) {
            return;
        }
        this.mImagesCache.bitmapCache.clear();
    }

    public void clearStylesRenderer() {
        this.mStylesRenderer.clear();
    }

    public void downloadFinished() {
        this.mNumActiveDownloads--;
        checkClearBitmapCache();
    }

    public void downloadStarted() {
        this.mNumActiveDownloads++;
    }

    public HashMap<? extends Feature, Object> getAllFeatures() {
        return this.mFeatures;
    }

    public BitmapDescriptor getCachedGroundOverlayImage(String str) {
        Bitmap bitmap;
        BitmapDescriptor bitmapDescriptor = this.mImagesCache.groundOverlayImagesCache.get(str);
        if (bitmapDescriptor != null || (bitmap = this.mImagesCache.bitmapCache.get(str)) == null) {
            return bitmapDescriptor;
        }
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
        this.mImagesCache.groundOverlayImagesCache.put(str, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    public BitmapDescriptor getCachedMarkerImage(String str, double d14) {
        Bitmap bitmap;
        String str2 = sScaleFormat.format(d14);
        Map<String, BitmapDescriptor> map = this.mImagesCache.markerImagesCache.get(str);
        BitmapDescriptor bitmapDescriptor = map != null ? map.get(str2) : null;
        if (bitmapDescriptor != null || (bitmap = this.mImagesCache.bitmapCache.get(str)) == null) {
            return bitmapDescriptor;
        }
        BitmapDescriptor bitmapDescriptorScaleIcon = scaleIcon(bitmap, d14);
        putMarkerImagesCache(str, str2, bitmapDescriptorScaleIcon);
        return bitmapDescriptorScaleIcon;
    }

    public Feature getContainerFeature(Object obj) {
        BiMultiMap<Feature> biMultiMap = this.mContainerFeatures;
        if (biMultiMap != null) {
            return biMultiMap.getKey(obj);
        }
        return null;
    }

    public ArrayList<KmlContainer> getContainerList() {
        return this.mContainers;
    }

    public GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.mDefaultLineStringStyle;
    }

    public GeoJsonPointStyle getDefaultPointStyle() {
        return this.mDefaultPointStyle;
    }

    public GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.mDefaultPolygonStyle;
    }

    public Feature getFeature(Object obj) {
        return this.mFeatures.getKey(obj);
    }

    public Set<Feature> getFeatures() {
        return this.mFeatures.keySet();
    }

    public HashMap<KmlGroundOverlay, GroundOverlay> getGroundOverlayMap() {
        return this.mGroundOverlayMap;
    }

    public GoogleMap getMap() {
        return this.mMap;
    }

    public Set<String> getMarkerIconUrls() {
        return this.mMarkerIconUrls;
    }

    public KmlStyle getPlacemarkStyle(String str) {
        return this.mStylesRenderer.get(str) != null ? this.mStylesRenderer.get(str) : this.mStylesRenderer.get(null);
    }

    public HashMap<String, String> getStyleMaps() {
        return this.mStyleMaps;
    }

    public HashMap<String, KmlStyle> getStylesRenderer() {
        return this.mStylesRenderer;
    }

    public Collection<Object> getValues() {
        return this.mFeatures.values();
    }

    public boolean hasFeatures() {
        return this.mFeatures.size() > 0;
    }

    public boolean isLayerOnMap() {
        return this.mLayerOnMap;
    }

    public void putContainerFeature(Object obj, Feature feature) {
        this.mContainerFeatures.put(feature, obj);
    }

    public void putFeatures(Feature feature, Object obj) {
        this.mFeatures.put(feature, obj);
    }

    public void putStyles() {
        this.mStylesRenderer.putAll(this.mStyles);
    }

    public void removeFeature(Feature feature) {
        if (this.mFeatures.containsKey(feature)) {
            removeFromMap(this.mFeatures.remove(feature));
        }
    }

    public void removeFromMap(Object obj) {
        if (obj instanceof Marker) {
            this.mMarkers.remove((Marker) obj);
            return;
        }
        if (obj instanceof Polyline) {
            this.mPolylines.remove((Polyline) obj);
            return;
        }
        if (obj instanceof Polygon) {
            this.mPolygons.remove((Polygon) obj);
            return;
        }
        if (obj instanceof GroundOverlay) {
            this.mGroundOverlays.remove((GroundOverlay) obj);
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                removeFromMap(it.next());
            }
        }
    }

    public void removeGroundOverlays(HashMap<KmlGroundOverlay, GroundOverlay> map) {
        for (GroundOverlay groundOverlay : map.values()) {
            if (groundOverlay != null) {
                this.mGroundOverlays.remove(groundOverlay);
            }
        }
    }

    public void setLayerVisibility(boolean z14) {
        this.mLayerOnMap = z14;
    }

    public void setMap(GoogleMap googleMap) {
        this.mMap = googleMap;
    }

    public void setOnFeatureClickListener(Layer.OnFeatureClickListener onFeatureClickListener) {
        this.mPolygons.setOnPolygonClickListener(new a(this, onFeatureClickListener));
        this.mMarkers.setOnMarkerClickListener(new a(this, onFeatureClickListener));
        this.mPolylines.setOnPolylineClickListener(new a(this, onFeatureClickListener));
    }

    public void storeData(HashMap<String, KmlStyle> map, HashMap<String, String> map2, HashMap<KmlPlacemark, Object> map3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> map4) {
        this.mStyles = map;
        this.mStyleMaps = map2;
        this.mFeatures.putAll(map3);
        this.mContainers = arrayList;
        this.mGroundOverlayMap = map4;
    }

    public void putStyles(HashMap<String, KmlStyle> map) {
        this.mStylesRenderer.putAll(map);
    }

    public void removeFeatures(HashMap<? extends Feature, Object> map) {
        removeFeatures(map.values());
    }

    public Renderer(GoogleMap googleMap, HashMap<? extends Feature, Object> map, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this(googleMap, null, new GeoJsonPointStyle(), new GeoJsonLineStringStyle(), new GeoJsonPolygonStyle(), null, markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.mFeatures.putAll(map);
        this.mImagesCache = null;
    }

    public Renderer(GoogleMap googleMap, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, ImagesCache imagesCache) {
        this(googleMap, new HashSet(), null, null, null, new BiMultiMap(), markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.mContext = context;
        this.mStylesRenderer = new HashMap<>();
        this.mImagesCache = imagesCache == null ? new ImagesCache() : imagesCache;
    }
}
