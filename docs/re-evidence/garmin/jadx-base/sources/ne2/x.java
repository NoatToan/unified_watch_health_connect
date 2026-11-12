package ne2;

import android.content.Context;
import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions;

/* JADX INFO: loaded from: classes11.dex */
public final class x {
    public static final PointAnnotationOptions a(com.garmin.android.library.mapsdkadapter.p pVar, Context context) {
        context.getClass();
        PointAnnotationOptions pointAnnotationOptions = new PointAnnotationOptions();
        com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
        PointAnnotationOptions pointAnnotationOptionsWithIconOpacity = pointAnnotationOptions.withIconOpacity(!oVar.f50314f ? 0.0d : oVar.f50317i);
        LatLng latLng = oVar.f50309a.f50283a;
        Point pointFromLngLat = Point.fromLngLat(latLng.longitude, latLng.latitude);
        pointFromLngLat.getClass();
        PointAnnotationOptions pointAnnotationOptionsWithIconRotate = pointAnnotationOptionsWithIconOpacity.withPoint(pointFromLngLat).withDraggable(oVar.f50315g).withIconRotate(oVar.f50310b);
        Bitmap bitmap = oVar.f50318j;
        if (bitmap != null) {
            pointAnnotationOptionsWithIconRotate.withIconImage(bitmap);
            return pointAnnotationOptionsWithIconRotate;
        }
        Integer num = oVar.f50319k;
        if (num == null) {
            Bitmap bitmapA = p.a(R.drawable.red_marker, context);
            if (bitmapA != null) {
                pointAnnotationOptionsWithIconRotate.withIconImage(bitmapA);
            }
            return pointAnnotationOptionsWithIconRotate;
        }
        Bitmap bitmapA2 = p.a(num.intValue(), context);
        if (bitmapA2 != null) {
            pointAnnotationOptionsWithIconRotate.withIconImage(bitmapA2);
        }
        pointAnnotationOptionsWithIconRotate.setIconAnchor(IconAnchor.BOTTOM);
        return pointAnnotationOptionsWithIconRotate;
    }
}
