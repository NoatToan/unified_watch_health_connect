package com.mapbox.maps.plugin.locationcomponent;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.locationcomponent.utils.BitmapUtils;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010(\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010*\u001a\u00020\rH\u0016J\u0012\u0010+\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0016J\u0010\u00100\u001a\u00020\r2\u0006\u00101\u001a\u000202H\u0016J)\u00103\u001a\u00020\r2\b\b\u0001\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020\u001f2\b\u00106\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationIndicatorLayerRenderer;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "puckOptions", "Lcom/mapbox/maps/plugin/LocationPuck2D;", "weakContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "layer", "Lcom/mapbox/maps/plugin/locationcomponent/LocationIndicatorLayerWrapper;", "(Lcom/mapbox/maps/plugin/LocationPuck2D;Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/plugin/locationcomponent/LocationIndicatorLayerWrapper;)V", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxStyleManager;", "addImageToStyle", "", "iconId", "", "imageHolder", "Lcom/mapbox/maps/ImageHolder;", "addLayers", "positionManager", "Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPositionManager;", "adjustPulsingCircleLayerVisibility", "visible", "", "clearBitmaps", "hide", "initializeComponents", "isRendererInitialised", "removeLayers", "setAccuracyRadius", "accuracy", "", "setBearing", "bearing", "", "setLatLng", "latLng", "Lcom/mapbox/geojson/Point;", "setLayerBearing", "setLayerLocation", "setLayerVisibility", "setupBitmaps", "show", "slot", "styleAccuracy", "accuracyColor", "", "accuracyBorderColor", "styleScaling", "scaleExpression", "Lcom/mapbox/bindgen/Value;", "updatePulsingUi", "pulsingColorInt", "radius", "opacity", "(IFLjava/lang/Float;)V", "updateStyle", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationIndicatorLayerRenderer implements LocationLayerRenderer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "LocationPuck2D";
    private final LocationIndicatorLayerWrapper layer;
    private final LocationPuck2D puckOptions;
    private MapboxStyleManager style;
    private final WeakReference<Context> weakContext;

    public LocationIndicatorLayerRenderer(LocationPuck2D locationPuck2D, WeakReference<Context> weakReference, LocationIndicatorLayerWrapper locationIndicatorLayerWrapper) {
        locationPuck2D.getClass();
        weakReference.getClass();
        locationIndicatorLayerWrapper.getClass();
        this.puckOptions = locationPuck2D;
        this.weakContext = weakReference;
        this.layer = locationIndicatorLayerWrapper;
    }

    private final void addImageToStyle(MapboxStyleManager style, String iconId, ImageHolder imageHolder) {
        Integer drawableId;
        Bitmap bitmap;
        if (imageHolder != null && (bitmap = imageHolder.getBitmap()) != null) {
            style.addImage(iconId, bitmap);
            return;
        }
        Context context = this.weakContext.get();
        if (context == null) {
            MapboxLogger.logE(TAG, "Could not set 2D puck image as drawable for " + iconId + " because there is no Android Context!");
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (imageHolder != null && (drawableId = imageHolder.getDrawableId()) != null) {
            Bitmap bitmapFromDrawableRes = BitmapUtils.INSTANCE.getBitmapFromDrawableRes(context, drawableId.intValue());
            if ((bitmapFromDrawableRes != null ? style.addImage(iconId, bitmapFromDrawableRes) : null) != null) {
                return;
            }
        }
        MapboxLogger.logE(TAG, "No image holder data for " + iconId + '!');
        Unit unit2 = Unit.INSTANCE;
    }

    private final void setLayerBearing(double bearing) {
        this.layer.bearing(bearing);
    }

    private final void setLayerLocation(Point latLng) {
        this.layer.location(x.k(Double.valueOf(latLng.latitude()), Double.valueOf(latLng.longitude()), Double.valueOf(0.0d)));
    }

    private final void setLayerVisibility(boolean visible) {
        this.layer.visibility(visible);
    }

    private final void setupBitmaps(MapboxStyleManager style) {
        addImageToStyle(style, LocationComponentConstants.TOP_ICON, this.puckOptions.getTopImage());
        addImageToStyle(style, LocationComponentConstants.BEARING_ICON, this.puckOptions.getBearingImage());
        addImageToStyle(style, LocationComponentConstants.SHADOW_ICON, this.puckOptions.getShadowImage());
        this.layer.topImage(LocationComponentConstants.TOP_ICON);
        this.layer.bearingImage(LocationComponentConstants.BEARING_ICON);
        this.layer.shadowImage(LocationComponentConstants.SHADOW_ICON);
        this.layer.opacity(this.puckOptions.getOpacity());
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void addLayers(LocationComponentPositionManager positionManager) {
        positionManager.getClass();
        positionManager.addLayerToMap(this.layer);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void adjustPulsingCircleLayerVisibility(boolean visible) {
        if (visible) {
            return;
        }
        this.layer.emphasisCircleRadius(0.0d);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void clearBitmaps() {
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleImage(LocationComponentConstants.TOP_ICON);
        }
        MapboxStyleManager mapboxStyleManager2 = this.style;
        if (mapboxStyleManager2 != null) {
            mapboxStyleManager2.removeStyleImage(LocationComponentConstants.BEARING_ICON);
        }
        MapboxStyleManager mapboxStyleManager3 = this.style;
        if (mapboxStyleManager3 != null) {
            mapboxStyleManager3.removeStyleImage(LocationComponentConstants.SHADOW_ICON);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void hide() {
        setLayerVisibility(false);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void initializeComponents(MapboxStyleManager style) {
        style.getClass();
        this.style = style;
        setupBitmaps(style);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public boolean isRendererInitialised() {
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager != null) {
            return mapboxStyleManager.styleLayerExists(LocationComponentConstants.LOCATION_INDICATOR_LAYER);
        }
        return false;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void removeLayers() {
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleLayer(this.layer.getLayerId());
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setAccuracyRadius(float accuracy) {
        this.layer.accuracyRadius(accuracy);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setBearing(double bearing) {
        setLayerBearing(bearing);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setLatLng(Point latLng) {
        latLng.getClass();
        setLayerLocation(latLng);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void show() {
        setLayerVisibility(true);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void slot(String slot) {
        this.layer.slot(slot);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void styleAccuracy(int accuracyColor, int accuracyBorderColor) {
        Companion companion = INSTANCE;
        float[] fArrColorToRgbaArray = companion.colorToRgbaArray(accuracyColor);
        float[] fArrColorToRgbaArray2 = companion.colorToRgbaArray(accuracyBorderColor);
        List<Value> listBuildRGBAExpression = companion.buildRGBAExpression(fArrColorToRgbaArray);
        List<Value> listBuildRGBAExpression2 = companion.buildRGBAExpression(fArrColorToRgbaArray2);
        this.layer.accuracyRadiusColor(listBuildRGBAExpression);
        this.layer.accuracyRadiusBorderColor(listBuildRGBAExpression2);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void styleScaling(Value scaleExpression) {
        scaleExpression.getClass();
        this.layer.shadowImageSize(scaleExpression);
        this.layer.bearingImageSize(scaleExpression);
        this.layer.topImageSize(scaleExpression);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void updatePulsingUi(int pulsingColorInt, float radius, Float opacity) {
        Companion companion = INSTANCE;
        float[] fArrColorToRgbaArray = companion.colorToRgbaArray(pulsingColorInt);
        fArrColorToRgbaArray[3] = opacity != null ? opacity.floatValue() : 1.0f;
        this.layer.emphasisCircleRadius(radius);
        this.layer.emphasisCircleColor(companion.buildRGBAExpression(fArrColorToRgbaArray));
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void updateStyle(MapboxStyleManager style) {
        style.getClass();
        this.style = style;
        this.layer.updateStyle(style);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationIndicatorLayerRenderer$Companion;", "", "()V", "TAG", "", "buildRGBAExpression", "", "Lcom/mapbox/bindgen/Value;", "colorArray", "", "colorIntToRgbaExpression", TtmlNode.ATTR_TTS_COLOR, "", "colorToRgbaArray", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final List<Value> buildRGBAExpression(float[] colorArray) {
            colorArray.getClass();
            return x.d(new Value("rgba"), new Value(colorArray[0]), new Value(colorArray[1]), new Value(colorArray[2]), new Value(colorArray[3]));
        }

        public final List<Value> colorIntToRgbaExpression(int color) {
            NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
            numberInstance.getClass();
            DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
            decimalFormat.applyPattern("#.###");
            String str = decimalFormat.format(((double) ((color >> 24) & 255)) / 255.0d);
            Value value = new Value("rgba");
            Value value2 = new Value((color >> 16) & 255);
            Value value3 = new Value((color >> 8) & 255);
            Value value4 = new Value(color & 255);
            str.getClass();
            return x.d(value, value2, value3, value4, new Value(Double.parseDouble(str)));
        }

        public final float[] colorToRgbaArray(int color) {
            return new float[]{(color >> 16) & 255, (color >> 8) & 255, color & 255, ((color >> 24) & 255) / 255.0f};
        }

        private Companion() {
        }
    }

    public /* synthetic */ LocationIndicatorLayerRenderer(LocationPuck2D locationPuck2D, WeakReference weakReference, LocationIndicatorLayerWrapper locationIndicatorLayerWrapper, int i14, j jVar) {
        this(locationPuck2D, weakReference, (i14 & 4) != 0 ? LayerSourceProvider.INSTANCE.getLocationIndicatorLayer() : locationIndicatorLayerWrapper);
    }
}
