package com.mapbox.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.geojson.Point;
import com.mapbox.maps.attribution.AttributionLayout;
import com.mapbox.maps.attribution.AttributionMeasure;
import com.mapbox.maps.attribution.AttributionParser;
import com.mapbox.maps.module.MapTelemetry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 t2\u00020\u0001:\u0002tuB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB-\b\u0012\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 H\u0002J7\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\u001eJ\u000e\u00102\u001a\u0002032\u0006\u0010\u0004\u001a\u00020'J\u0018\u00104\u001a\u0002052\u0006\u0010!\u001a\u00020\"2\u0006\u00106\u001a\u000207H\u0002J\u0018\u00108\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0002J(\u0010:\u001a\u00020;2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u00106\u001a\u0002072\u0006\u0010<\u001a\u00020\u0013H\u0002J\u0006\u0010=\u001a\u00020\u001eJ\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J \u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J \u0010?\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010B\u001a\u00020C2\u0006\u0010F\u001a\u00020GH\u0002J(\u0010H\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020 2\u0006\u0010@\u001a\u00020A2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020GH\u0002J \u0010L\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010I\u001a\u00020JH\u0002J(\u0010M\u001a\u00020C2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010I\u001a\u00020JH\u0002J\u0006\u0010N\u001a\u00020OJ\u0006\u0010P\u001a\u00020QJ\u0006\u0010R\u001a\u000205J\u0006\u0010S\u001a\u000205J\b\u0010T\u001a\u00020\u000bH\u0002J\u000e\u0010U\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020'J\u000e\u0010W\u001a\u00020\u001e2\u0006\u0010X\u001a\u00020QJ\u000e\u0010Y\u001a\u00020\u001e2\u0006\u0010Z\u001a\u000205J\u000e\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020\u0016J\u000e\u0010]\u001a\u00020\u001e2\u0006\u0010^\u001a\u000205J\u001a\u0010_\u001a\u00020\u001e2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010b\u001a\u00020cJ\u0010\u0010d\u001a\u00020\u000f2\u0006\u0010e\u001a\u00020fH\u0002J\u0010\u0010g\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020iH\u0002J\u0010\u0010j\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020lH\u0002J\u0010\u0010m\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020oH\u0002J \u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u000e2\u0006\u0010r\u001a\u00020s2\b\u0010V\u001a\u0004\u0018\u00010'H\u0007R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/mapbox/maps/Snapshotter;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "options", "Lcom/mapbox/maps/MapSnapshotOptions;", "overlayOptions", "Lcom/mapbox/maps/SnapshotOverlayOptions;", "(Landroid/content/Context;Lcom/mapbox/maps/MapSnapshotOptions;Lcom/mapbox/maps/SnapshotOverlayOptions;)V", "Ljava/lang/ref/WeakReference;", "coreSnapshotter", "Lcom/mapbox/maps/MapSnapshotter;", "(Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/MapSnapshotOptions;Lcom/mapbox/maps/SnapshotOverlayOptions;Lcom/mapbox/maps/MapSnapshotter;)V", "cancelableEvents", "", "Lcom/mapbox/common/Cancelable;", "loadingErrorCancelable", "mapSnapshotOptions", "pixelRatio", "", "snapshotOverlayOptions", "<set-?>", "Lcom/mapbox/maps/SnapshotStyleListener;", "snapshotStyleCallback", "getSnapshotStyleCallback$maps_sdk_release", "()Lcom/mapbox/maps/SnapshotStyleListener;", "setSnapshotStyleCallback$maps_sdk_release", "(Lcom/mapbox/maps/SnapshotStyleListener;)V", "styleLoadedCancelable", "addOverlay", "", "snapshotBitmap", "Landroid/graphics/Bitmap;", "overlay", "Lcom/mapbox/maps/SnapshotOverlay;", "calculateLogoScale", "snapshot", "logo", "cameraForCoordinates", "Lcom/mapbox/maps/CameraOptions;", "coordinates", "", "Lcom/mapbox/geojson/Point;", "padding", "Lcom/mapbox/maps/EdgeInsets;", "bearing", "", "pitch", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "cancel", "coordinateBoundsForCamera", "Lcom/mapbox/maps/CoordinateBounds;", "createAttributionString", "", "shortText", "", "createScaledLogo", "Lcom/mapbox/maps/Snapshotter$Logo;", "createTextView", "Landroid/widget/TextView;", "scale", "destroy", "dispatchTelemetryTurnstileEvent", "drawAttribution", "canvas", "Landroid/graphics/Canvas;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "anchorPoint", "Landroid/graphics/PointF;", TtmlNode.TAG_LAYOUT, "Lcom/mapbox/maps/attribution/AttributionLayout;", "drawLogo", "margin", "", "placement", "drawOverlay", "getAttributionMeasure", "getCameraState", "Lcom/mapbox/maps/CameraState;", "getSize", "Lcom/mapbox/maps/Size;", "getStyleJson", "getStyleUri", "requireCoreSnapshotter", "setCamera", "cameraOptions", "setSize", "size", "setStyleJson", "styleJson", "setStyleListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setStyleUri", "styleUri", TtmlNode.START, "overlayCallback", "Lcom/mapbox/maps/SnapshotOverlayCallback;", "resultCallback", "Lcom/mapbox/maps/SnapshotResultCallback;", "subscribeMapLoadingError", "mapLoadingErrorCallback", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "subscribeStyleDataLoaded", "styleDataLoadedCallback", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "subscribeStyleImageMissing", "styleImageMissingCallback", "Lcom/mapbox/maps/StyleImageMissingCallback;", "subscribeStyleLoaded", "styleLoadedCallback", "Lcom/mapbox/maps/StyleLoadedCallback;", "tileCover", "Lcom/mapbox/maps/CanonicalTileID;", "tileCoverOptions", "Lcom/mapbox/maps/TileCoverOptions;", "Companion", "Logo", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class Snapshotter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "Snapshotter";
    private List<Cancelable> cancelableEvents;
    private final WeakReference<Context> context;
    private MapSnapshotter coreSnapshotter;
    private Cancelable loadingErrorCancelable;
    private final MapSnapshotOptions mapSnapshotOptions;
    private final float pixelRatio;
    private final SnapshotOverlayOptions snapshotOverlayOptions;
    private SnapshotStyleListener snapshotStyleCallback;
    private Cancelable styleLoadedCancelable;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/Snapshotter$Logo;", "", "large", "Landroid/graphics/Bitmap;", "small", "scale", "", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;F)V", "getLarge", "()Landroid/graphics/Bitmap;", "getScale", "()F", "getSmall", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Logo {
        private final Bitmap large;
        private final float scale;
        private final Bitmap small;

        public Logo(Bitmap bitmap, Bitmap bitmap2, float f14) {
            bitmap.getClass();
            bitmap2.getClass();
            this.large = bitmap;
            this.small = bitmap2;
            this.scale = f14;
        }

        public static /* synthetic */ Logo copy$default(Logo logo, Bitmap bitmap, Bitmap bitmap2, float f14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                bitmap = logo.large;
            }
            if ((i14 & 2) != 0) {
                bitmap2 = logo.small;
            }
            if ((i14 & 4) != 0) {
                f14 = logo.scale;
            }
            return logo.copy(bitmap, bitmap2, f14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getLarge() {
            return this.large;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Bitmap getSmall() {
            return this.small;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getScale() {
            return this.scale;
        }

        public final Logo copy(Bitmap large, Bitmap small, float scale) {
            large.getClass();
            small.getClass();
            return new Logo(large, small, scale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) other;
            return s.g(this.large, logo.large) && s.g(this.small, logo.small) && Float.compare(this.scale, logo.scale) == 0;
        }

        public final Bitmap getLarge() {
            return this.large;
        }

        public final float getScale() {
            return this.scale;
        }

        public final Bitmap getSmall() {
            return this.small;
        }

        public int hashCode() {
            return Float.hashCode(this.scale) + ((this.small.hashCode() + (this.large.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("Logo(large=");
            sb3.append(this.large);
            sb3.append(", small=");
            sb3.append(this.small);
            sb3.append(", scale=");
            return q6.f.p(sb3, this.scale, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.Snapshotter$dispatchTelemetryTurnstileEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "it", "Lcom/mapbox/annotation/module/MapboxModuleType;", "invoke", "(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.l<MapboxModuleType, ModuleProviderArgument[]> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // e23.l
        public final ModuleProviderArgument[] invoke(MapboxModuleType mapboxModuleType) {
            mapboxModuleType.getClass();
            return new ModuleProviderArgument[]{new ModuleProviderArgument(Context.class, this.$context.getApplicationContext())};
        }
    }

    public Snapshotter(Context context, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions) {
        context.getClass();
        mapSnapshotOptions.getClass();
        snapshotOverlayOptions.getClass();
        this.cancelableEvents = new ArrayList();
        if (d53.w.J(MapboxOptions.getAccessToken())) {
            throw new MapboxConfigurationException();
        }
        this.context = new WeakReference<>(context);
        this.mapSnapshotOptions = mapSnapshotOptions;
        this.snapshotOverlayOptions = snapshotOverlayOptions;
        this.pixelRatio = context.getResources().getDisplayMetrics().density;
        this.coreSnapshotter = new MapSnapshotter(mapSnapshotOptions);
        dispatchTelemetryTurnstileEvent(context);
        WeakReference weakReference = new WeakReference(this);
        this.loadingErrorCancelable = subscribeMapLoadingError(new n(weakReference, 1));
        this.cancelableEvents.add(subscribeStyleDataLoaded(new o(weakReference)));
        this.styleLoadedCancelable = subscribeStyleLoaded(new o(weakReference));
        this.cancelableEvents.add(subscribeStyleImageMissing(new o(weakReference)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(WeakReference weakReference, MapLoadingError mapLoadingError) {
        weakReference.getClass();
        mapLoadingError.getClass();
        Snapshotter snapshotter = (Snapshotter) weakReference.get();
        if (snapshotter != null) {
            Cancelable cancelable = snapshotter.loadingErrorCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
            SnapshotStyleListener snapshotStyleListener = snapshotter.snapshotStyleCallback;
            if (snapshotStyleListener != null) {
                String message = mapLoadingError.getMessage();
                message.getClass();
                snapshotStyleListener.onDidFailLoadingStyle(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$11(WeakReference weakReference, StyleImageMissing styleImageMissing) {
        SnapshotStyleListener snapshotStyleListener;
        weakReference.getClass();
        styleImageMissing.getClass();
        Snapshotter snapshotter = (Snapshotter) weakReference.get();
        if (snapshotter == null || (snapshotStyleListener = snapshotter.snapshotStyleCallback) == null) {
            return;
        }
        String imageId = styleImageMissing.getImageId();
        imageId.getClass();
        snapshotStyleListener.onStyleImageMissing(imageId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(WeakReference weakReference, StyleDataLoaded styleDataLoaded) {
        Snapshotter snapshotter;
        MapSnapshotter mapSnapshotter;
        SnapshotStyleListener snapshotStyleListener;
        weakReference.getClass();
        styleDataLoaded.getClass();
        if (styleDataLoaded.getType() != StyleDataLoadedType.STYLE || (snapshotter = (Snapshotter) weakReference.get()) == null || (mapSnapshotter = snapshotter.coreSnapshotter) == null || (snapshotStyleListener = snapshotter.snapshotStyleCallback) == null) {
            return;
        }
        snapshotStyleListener.onDidFinishLoadingStyle(new Style(mapSnapshotter, snapshotter.pixelRatio, new com.google.protobuf.a(28)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(WeakReference weakReference, StyleLoaded styleLoaded) {
        SnapshotStyleListener snapshotStyleListener;
        weakReference.getClass();
        styleLoaded.getClass();
        Snapshotter snapshotter = (Snapshotter) weakReference.get();
        if (snapshotter != null) {
            MapSnapshotter mapSnapshotter = snapshotter.coreSnapshotter;
            if (mapSnapshotter != null && (snapshotStyleListener = snapshotter.snapshotStyleCallback) != null) {
                snapshotStyleListener.onDidFullyLoadStyle(new Style(mapSnapshotter, snapshotter.pixelRatio, new com.google.protobuf.a(29)));
            }
            Cancelable cancelable = snapshotter.styleLoadedCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
    }

    private final void addOverlay(Bitmap snapshotBitmap, SnapshotOverlay overlay) {
        Context context = this.context.get();
        if (context != null) {
            drawOverlay(snapshotBitmap, overlay, ((int) context.getResources().getDisplayMetrics().density) * 4);
        }
    }

    private final float calculateLogoScale(Context context, Bitmap snapshot, Bitmap logo) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        float fMin = Math.min((logo.getWidth() / (displayMetrics.widthPixels / snapshot.getWidth())) / logo.getWidth(), (logo.getHeight() / (displayMetrics.heightPixels / snapshot.getHeight())) / logo.getHeight()) * 2;
        if (fMin > 1.0f) {
            return 1.0f;
        }
        if (fMin < 0.6f) {
            return 0.6f;
        }
        return fMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions cameraForCoordinates$lambda$20(String str) {
        str.getClass();
        MapboxLogger.logE(TAG, "Error occurred in synchronous cameraForCoordinates: " + str + ", empty cameraState will be returned");
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    public static final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
        INSTANCE.clearData(asyncOperationResultCallback);
    }

    private final String createAttributionString(SnapshotOverlay overlay, boolean shortText) {
        Context context = this.context.get();
        if (context == null) {
            return "";
        }
        AttributionParser.Options options = new AttributionParser.Options(context);
        Object[] array = overlay.getAttributions().toArray(new String[0]);
        array.getClass();
        String[] strArr = (String[]) array;
        return options.withAttributionData((String[]) Arrays.copyOf(strArr, strArr.length)).withCopyrightSign(false).withImproveMap(false).withMapboxPrivacyPolicy(false).withTelemetryAttribution(false).withMapboxGeofencingConsent(false).build().createAttributionString(shortText);
    }

    private final Logo createScaledLogo(Context context, Bitmap snapshotBitmap) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.mapbox_logo_icon, null);
        bitmapDecodeResource.getClass();
        float fCalculateLogoScale = calculateLogoScale(context, snapshotBitmap, bitmapDecodeResource);
        Matrix matrix = new Matrix();
        matrix.postScale(fCalculateLogoScale, fCalculateLogoScale);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.mapbox_logo_helmet, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, true);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeResource2, 0, 0, bitmapDecodeResource2.getWidth(), bitmapDecodeResource2.getHeight(), matrix, true);
        bitmapCreateBitmap.getClass();
        bitmapCreateBitmap2.getClass();
        return new Logo(bitmapCreateBitmap, bitmapCreateBitmap2, fCalculateLogoScale);
    }

    private final TextView createTextView(Context context, SnapshotOverlay overlay, boolean shortText, float scale) {
        Resources resources = context.getResources();
        int i14 = R.color.mapbox_gray_dark;
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        int color = resources.getColor(i14, theme);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        String strCreateAttributionString = createAttributionString(overlay, shortText);
        if (strCreateAttributionString.length() > 0) {
            textView.setSingleLine(true);
            textView.setTextSize(10 * scale);
            textView.setTextColor(color);
            textView.setBackgroundResource(R.drawable.mapbox_rounded_corner);
            textView.setText(Html.fromHtml(strCreateAttributionString));
            textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        }
        return textView;
    }

    private final void dispatchTelemetryTurnstileEvent(Context context) {
        ((MapTelemetry) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.MapTelemetry, new AnonymousClass1(context))).onAppUserTurnstileEvent();
    }

    private final void drawAttribution(SnapshotOverlay overlay, AttributionMeasure measure, AttributionLayout layout) {
        PointF anchorPoint = layout.getAnchorPoint();
        if (anchorPoint != null) {
            drawAttribution(overlay.getCanvas(), measure, anchorPoint);
            return;
        }
        MapboxLogger.logE(TAG, "Could not generate attribution for snapshot size: " + overlay.getCanvas().getWidth() + 'x' + overlay.getCanvas().getHeight() + ". You are required to provide your own attribution for the used sources: " + overlay.getAttributions());
    }

    private final void drawLogo(Bitmap snapshot, Canvas canvas, int margin, AttributionLayout placement) {
        Bitmap logo = placement.getLogo();
        if (logo != null) {
            canvas.drawBitmap(logo, margin, (snapshot.getHeight() - logo.getHeight()) - margin, (Paint) null);
        }
    }

    private final void drawOverlay(Bitmap snapshotBitmap, SnapshotOverlay overlay, int margin) {
        AttributionMeasure attributionMeasure;
        AttributionLayout attributionLayoutMeasure;
        Context context = this.context.get();
        if (context == null || (attributionLayoutMeasure = (attributionMeasure = getAttributionMeasure(context, overlay, snapshotBitmap, margin)).measure()) == null) {
            return;
        }
        if (this.snapshotOverlayOptions.getShowLogo()) {
            drawLogo(snapshotBitmap, overlay.getCanvas(), margin, attributionLayoutMeasure);
        }
        if (this.snapshotOverlayOptions.getShowAttributes()) {
            drawAttribution(overlay, attributionMeasure, attributionLayoutMeasure);
        }
    }

    private final AttributionMeasure getAttributionMeasure(Context context, SnapshotOverlay overlay, Bitmap snapshotBitmap, int margin) {
        Logo logoCreateScaledLogo = createScaledLogo(context, snapshotBitmap);
        return new AttributionMeasure(snapshotBitmap, logoCreateScaledLogo.getLarge(), logoCreateScaledLogo.getSmall(), createTextView(context, overlay, false, logoCreateScaledLogo.getScale()), createTextView(context, overlay, true, logoCreateScaledLogo.getScale()), margin);
    }

    private final MapSnapshotter requireCoreSnapshotter() {
        MapSnapshotter mapSnapshotter = this.coreSnapshotter;
        if (mapSnapshotter != null) {
            return mapSnapshotter;
        }
        throw new SnapshotterDestroyedException();
    }

    public static /* synthetic */ void start$default(Snapshotter snapshotter, SnapshotOverlayCallback snapshotOverlayCallback, SnapshotResultCallback snapshotResultCallback, int i14, Object obj) {
        if (obj != null) {
            org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: start");
            return;
        }
        if ((i14 & 1) != 0) {
            snapshotOverlayCallback = null;
        }
        snapshotter.start(snapshotOverlayCallback, snapshotResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$17(Snapshotter snapshotter, SnapshotResultCallback snapshotResultCallback, SnapshotOverlayCallback snapshotOverlayCallback, Expected expected) {
        Unit unit;
        Bitmap bitmapCreateBitmap;
        snapshotter.getClass();
        snapshotResultCallback.getClass();
        expected.getClass();
        if (!expected.isValue()) {
            String str = (String) expected.getError();
            if (str == null) {
                str = "Undefined error happened.";
            }
            snapshotResultCallback.onSnapshotResult(null, str);
            return;
        }
        final MapSnapshot mapSnapshot = (MapSnapshot) expected.getValue();
        if (mapSnapshot != null) {
            Image imageMoveImage = mapSnapshot.moveImage();
            if (imageMoveImage != null) {
                bitmapCreateBitmap = Bitmap.createBitmap(imageMoveImage.getWidth(), imageMoveImage.getHeight(), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(imageMoveImage.getData().getBuffer());
            } else {
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap == null) {
                snapshotResultCallback.onSnapshotResult(null, "Moving image data failed!");
            } else {
                final Canvas canvas = new Canvas(bitmapCreateBitmap);
                SnapshotOverlay snapshotOverlay = new SnapshotOverlay(canvas, mapSnapshot) { // from class: com.mapbox.maps.Snapshotter$start$1$1$snapshotOverlay$1
                    final /* synthetic */ MapSnapshot $coreMapSnapshot;
                    private final List<String> attributions;
                    private final Canvas canvas;

                    {
                        this.$coreMapSnapshot = mapSnapshot;
                        this.canvas = canvas;
                        List<String> listAttributions = mapSnapshot.attributions();
                        listAttributions.getClass();
                        this.attributions = listAttributions;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public Point coordinate(ScreenCoordinate screenCoordinate) {
                        screenCoordinate.getClass();
                        Point pointCoordinate = this.$coreMapSnapshot.coordinate(screenCoordinate);
                        pointCoordinate.getClass();
                        return pointCoordinate;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public List<String> getAttributions() {
                        return this.attributions;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public Canvas getCanvas() {
                        return this.canvas;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public ScreenCoordinate screenCoordinate(Point coordinate) {
                        coordinate.getClass();
                        ScreenCoordinate screenCoordinate = this.$coreMapSnapshot.screenCoordinate(coordinate);
                        screenCoordinate.getClass();
                        return screenCoordinate;
                    }
                };
                if (snapshotOverlayCallback != null) {
                    snapshotOverlayCallback.onSnapshotOverlay(snapshotOverlay);
                }
                snapshotter.addOverlay(bitmapCreateBitmap, snapshotOverlay);
                snapshotResultCallback.onSnapshotResult(bitmapCreateBitmap, null);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            snapshotResultCallback.onSnapshotResult(null, "Snapshot was empty.");
        }
    }

    private final Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(mapLoadingErrorCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleDataLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleImageMissingCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final CameraOptions cameraForCoordinates(List<Point> coordinates, EdgeInsets padding, Double bearing, Double pitch) {
        coordinates.getClass();
        MapSnapshotter mapSnapshotterRequireCoreSnapshotter = requireCoreSnapshotter();
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.bearing(bearing);
        builder.pitch(pitch);
        Unit unit = Unit.INSTANCE;
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        CameraOptions valueOrElse = mapSnapshotterRequireCoreSnapshotter.cameraForCoordinates(coordinates, cameraOptionsBuild, padding, null, null).getValueOrElse(new p(0));
        valueOrElse.getClass();
        return valueOrElse;
    }

    public final void cancel() {
        requireCoreSnapshotter().cancel();
    }

    public final CoordinateBounds coordinateBoundsForCamera(CameraOptions options) {
        options.getClass();
        CoordinateBounds coordinateBoundsCoordinateBoundsForCamera = requireCoreSnapshotter().coordinateBoundsForCamera(options);
        coordinateBoundsCoordinateBoundsForCamera.getClass();
        return coordinateBoundsCoordinateBoundsForCamera;
    }

    public final void destroy() {
        cancel();
        Iterator<T> it = this.cancelableEvents.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableEvents.clear();
        Cancelable cancelable = this.loadingErrorCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        Cancelable cancelable2 = this.styleLoadedCancelable;
        if (cancelable2 != null) {
            cancelable2.cancel();
        }
        this.snapshotStyleCallback = null;
        this.coreSnapshotter = null;
    }

    public final CameraState getCameraState() {
        CameraState cameraState = requireCoreSnapshotter().getCameraState();
        cameraState.getClass();
        return cameraState;
    }

    public final Size getSize() {
        Size size = requireCoreSnapshotter().getSize();
        size.getClass();
        return size;
    }

    /* JADX INFO: renamed from: getSnapshotStyleCallback$maps_sdk_release, reason: from getter */
    public final /* synthetic */ SnapshotStyleListener getSnapshotStyleCallback() {
        return this.snapshotStyleCallback;
    }

    public final String getStyleJson() {
        String styleJSON = requireCoreSnapshotter().getStyleJSON();
        styleJSON.getClass();
        return styleJSON;
    }

    public final String getStyleUri() {
        String styleURI = requireCoreSnapshotter().getStyleURI();
        styleURI.getClass();
        return styleURI;
    }

    public final void setCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        requireCoreSnapshotter().setCamera(cameraOptions);
    }

    public final void setSize(Size size) {
        size.getClass();
        requireCoreSnapshotter().setSize(size);
    }

    public final /* synthetic */ void setSnapshotStyleCallback$maps_sdk_release(SnapshotStyleListener snapshotStyleListener) {
        this.snapshotStyleCallback = snapshotStyleListener;
    }

    public final void setStyleJson(String styleJson) {
        styleJson.getClass();
        requireCoreSnapshotter().setStyleJSON(styleJson);
    }

    public final void setStyleListener(SnapshotStyleListener listener) {
        listener.getClass();
        this.snapshotStyleCallback = listener;
    }

    public final void setStyleUri(String styleUri) {
        styleUri.getClass();
        requireCoreSnapshotter().setStyleURI(styleUri);
    }

    public final void start(SnapshotOverlayCallback overlayCallback, SnapshotResultCallback resultCallback) {
        resultCallback.getClass();
        if (getStyleJson().length() == 0 && getStyleUri().length() == 0) {
            vb.h.z("It's required to call setUri or setJson to provide a style definition before calling start.");
        } else {
            requireCoreSnapshotter().start(new a73.f(this, 13, resultCallback, overlayCallback));
        }
    }

    @MapboxExperimental
    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        tileCoverOptions.getClass();
        List<CanonicalTileID> listTileCover = requireCoreSnapshotter().tileCover(tileCoverOptions, cameraOptions);
        listTileCover.getClass();
        return listTileCover;
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J4\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0081\u0002¢\u0006\u0002\b\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/Snapshotter$Companion;", "", "()V", "TAG", "", "clearData", "", "callback", "Lcom/mapbox/maps/AsyncOperationResultCallback;", "invoke", "Lcom/mapbox/maps/Snapshotter;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "options", "Lcom/mapbox/maps/MapSnapshotOptions;", "overlayOptions", "Lcom/mapbox/maps/SnapshotOverlayOptions;", "coreSnapshotter", "Lcom/mapbox/maps/MapSnapshotter;", "invoke$maps_sdk_release", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final void clearData(AsyncOperationResultCallback callback) {
            callback.getClass();
            MapsResourceOptions.clearData(callback);
        }

        public final /* synthetic */ Snapshotter invoke$maps_sdk_release(WeakReference context, MapSnapshotOptions options, SnapshotOverlayOptions overlayOptions, MapSnapshotter coreSnapshotter) {
            context.getClass();
            options.getClass();
            overlayOptions.getClass();
            coreSnapshotter.getClass();
            return new Snapshotter(context, options, overlayOptions, coreSnapshotter, (p005kotlin.jvm.internal.j) null);
        }

        private Companion() {
        }
    }

    private final void drawAttribution(Canvas canvas, AttributionMeasure measure, PointF anchorPoint) {
        canvas.save();
        canvas.translate(anchorPoint.x, anchorPoint.y);
        measure.getTextView().draw(canvas);
        canvas.restore();
    }

    public /* synthetic */ Snapshotter(WeakReference weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter, p005kotlin.jvm.internal.j jVar) {
        this(weakReference, mapSnapshotOptions, snapshotOverlayOptions, mapSnapshotter);
    }

    public /* synthetic */ Snapshotter(Context context, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            boolean z14 = false;
            snapshotOverlayOptions = new SnapshotOverlayOptions(z14, z14, 3, null);
        }
        this(context, mapSnapshotOptions, snapshotOverlayOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Snapshotter(Context context, MapSnapshotOptions mapSnapshotOptions) {
        this(context, mapSnapshotOptions, (SnapshotOverlayOptions) null, 4, (p005kotlin.jvm.internal.j) null);
        context.getClass();
        mapSnapshotOptions.getClass();
    }

    private Snapshotter(WeakReference<Context> weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter) {
        this.cancelableEvents = new ArrayList();
        this.context = weakReference;
        this.mapSnapshotOptions = mapSnapshotOptions;
        this.snapshotOverlayOptions = snapshotOverlayOptions;
        this.coreSnapshotter = mapSnapshotter;
        this.pixelRatio = 1.0f;
    }
}
