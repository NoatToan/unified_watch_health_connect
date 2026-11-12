package com.mapbox.maps.viewannotation;

import android.view.View;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", "", "onViewAnnotationAnchorCoordinateUpdated", "", "view", "Landroid/view/View;", "anchorCoordinate", "Lcom/mapbox/geojson/Point;", "onViewAnnotationAnchorUpdated", "anchor", "Lcom/mapbox/maps/ViewAnnotationAnchorConfig;", "onViewAnnotationPositionUpdated", "leftTopCoordinate", "Lcom/mapbox/maps/ScreenCoordinate;", "width", "", "height", "onViewAnnotationVisibilityUpdated", "visible", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface OnViewAnnotationUpdatedListener {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onViewAnnotationAnchorCoordinateUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view2, Point point) {
            view2.getClass();
            point.getClass();
        }

        public static void onViewAnnotationAnchorUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view2, ViewAnnotationAnchorConfig viewAnnotationAnchorConfig) {
            view2.getClass();
            viewAnnotationAnchorConfig.getClass();
        }

        public static void onViewAnnotationPositionUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view2, ScreenCoordinate screenCoordinate, double d14, double d15) {
            view2.getClass();
            screenCoordinate.getClass();
        }

        public static void onViewAnnotationVisibilityUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view2, boolean z14) {
            view2.getClass();
        }
    }

    void onViewAnnotationAnchorCoordinateUpdated(View view2, Point anchorCoordinate);

    void onViewAnnotationAnchorUpdated(View view2, ViewAnnotationAnchorConfig anchor);

    void onViewAnnotationPositionUpdated(View view2, ScreenCoordinate leftTopCoordinate, double width, double height);

    void onViewAnnotationVisibilityUpdated(View view2, boolean visible);
}
