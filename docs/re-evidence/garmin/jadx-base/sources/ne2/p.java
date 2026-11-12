package ne2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.LatLng;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class p {
    public static final Bitmap a(int i14, Context context) {
        context.getClass();
        Drawable drawableA = j.a.a(context, i14);
        if (drawableA == null) {
            return null;
        }
        if (drawableA instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableA).getBitmap();
        }
        Drawable.ConstantState constantState = drawableA.getConstantState();
        if (constantState == null) {
            return null;
        }
        Drawable drawableMutate = constantState.newDrawable().mutate();
        drawableMutate.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableMutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableMutate.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final String b(com.garmin.android.library.mapsdkadapter.i.e eVar, int i14) {
        eVar.getClass();
        if (i14 == 1) {
            return Style.STANDARD;
        }
        if (i14 != 3) {
            return i14 != 4 ? Style.STANDARD : Style.STANDARD_SATELLITE;
        }
        return Style.OUTDOORS;
    }

    public static final ie2.j c(ArrayList<w> arrayList, Annotation<?> annotation) {
        w next;
        arrayList.getClass();
        Iterator<w> it = arrayList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (next.equals(annotation)) {
                return next;
            }
        }
        next = null;
        return next;
    }

    public static final com.garmin.android.library.mapsdkadapter.e d(MapboxMap mapboxMap) {
        CoordinateBounds coordinateBoundsCoordinateBoundsForCamera = mapboxMap.coordinateBoundsForCamera(ExtensionUtils.toCameraOptions$default(mapboxMap.getCameraState(), null, 1, null));
        Point southwest = coordinateBoundsCoordinateBoundsForCamera.getSouthwest();
        southwest.getClass();
        com.garmin.android.library.mapsdkadapter.f fVarE = e(southwest);
        Point northeast = coordinateBoundsCoordinateBoundsForCamera.getNortheast();
        northeast.getClass();
        com.garmin.android.library.mapsdkadapter.f fVarE2 = e(northeast);
        com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
        aVar.b(fVarE);
        aVar.b(fVarE2);
        com.garmin.android.library.mapsdkadapter.e eVarA = aVar.a();
        if (eVarA != null) {
            return eVarA;
        }
        com.garmin.android.library.mapsdkadapter.e.f50271c.getClass();
        return com.garmin.android.library.mapsdkadapter.e.f50272d;
    }

    public static final com.garmin.android.library.mapsdkadapter.f e(Point point) {
        return new com.garmin.android.library.mapsdkadapter.f(point.latitude(), point.longitude(), com.garmin.android.library.mapsdkadapter.i.d.MAPBOX);
    }

    public static final ke2.b f(Point point) {
        point.getClass();
        return new ke2.b(point.latitude(), point.longitude(), null, 4, null);
    }

    public static final List<Point> g(com.garmin.android.library.mapsdkadapter.e eVar) {
        eVar.getClass();
        return p13.x.k(h(eVar.f50273a), h(eVar.f50274b));
    }

    public static final Point h(com.garmin.android.library.mapsdkadapter.f fVar) {
        fVar.getClass();
        LatLng latLng = fVar.f50283a;
        Point pointFromLngLat = Point.fromLngLat(latLng.longitude, latLng.latitude);
        pointFromLngLat.getClass();
        return pointFromLngLat;
    }

    public static final Point i(ke2.b bVar) {
        bVar.getClass();
        Point pointFromLngLat = Point.fromLngLat(bVar.f104552b, bVar.f104551a);
        pointFromLngLat.getClass();
        return pointFromLngLat;
    }

    public static final ArrayList j(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LatLng latLng = ((com.garmin.android.library.mapsdkadapter.f) it.next()).f50283a;
            Point pointFromLngLat = Point.fromLngLat(latLng.longitude, latLng.latitude);
            pointFromLngLat.getClass();
            arrayListL.add(pointFromLngLat);
        }
        return arrayListL;
    }
}
