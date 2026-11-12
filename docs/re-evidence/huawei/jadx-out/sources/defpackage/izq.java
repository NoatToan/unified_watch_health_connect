package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class izq {
    public static Marker c(GoogleMap googleMap, jpg jpgVar, int i) {
        if (googleMap == null) {
            ReleaseLogUtil.a("Track_GoogleSuportUtils", "addGoogleStartMarker googleMap is null.");
            return null;
        }
        if (jpgVar == null) {
            ReleaseLogUtil.a("Track_GoogleSuportUtils", "addGoogleStartMarker latLng is null.");
            return null;
        }
        MarkerOptions markerOptionsAnchor = new MarkerOptions().position(b(jpgVar)).draggable(false).anchor(0.5f, 0.9f);
        c(i, markerOptionsAnchor);
        return googleMap.addMarker(markerOptionsAnchor);
    }

    private static void c(int i, MarkerOptions markerOptions) {
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), izt.f38261a.get(i, R.drawable.hw_show_map_tracking_start_run_img))));
    }

    public static Marker c(GoogleMap googleMap, jpg jpgVar, String str) {
        BitmapDescriptor bitmapDescriptorFromResource;
        if (googleMap == null) {
            ReleaseLogUtil.a("Track_GoogleSuportUtils", "addGoogleEndMarker googleMap is null.");
            return null;
        }
        if (jpgVar == null) {
            ReleaseLogUtil.a("Track_GoogleSuportUtils", "addGoogleEndMarker latLng is null.");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_end_img);
        } else {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            BitmapDescriptor bitmapDescriptorFromBitmap = bitmapDecodeFile != null ? BitmapDescriptorFactory.fromBitmap(bitmapDecodeFile) : null;
            bitmapDescriptorFromResource = bitmapDescriptorFromBitmap == null ? BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_end_img) : bitmapDescriptorFromBitmap;
        }
        return googleMap.addMarker(new MarkerOptions().position(b(jpgVar)).draggable(false).anchor(0.5f, 0.5f).icon(bitmapDescriptorFromResource));
    }

    public static MarkerOptions d(Resources resources, LatLng latLng, String str) {
        if (latLng == null) {
            ReleaseLogUtil.e("Track_GoogleSuportUtils", "addMarker latLng is null.");
            return null;
        }
        MarkerOptions markerOptionsZIndex = new MarkerOptions().position(latLng).draggable(false).anchor(0.5f, 1.0f).zIndex(14.0f);
        TextPaint textPaintC = izt.c(resources, str.length());
        textPaintC.getTextBounds(str, 0, str.length(), new Rect());
        Bitmap bitmapE = izt.e(resources);
        new Canvas(bitmapE).drawText(str, bitmapE.getWidth() / 2.0f, (((bitmapE.getHeight() - textPaintC.getFontMetrics().top) - textPaintC.getFontMetrics().bottom) / 2.0f) - qrs.d(BaseApplication.getContext(), 2.0f), textPaintC);
        markerOptionsZIndex.icon(BitmapDescriptorFactory.fromBitmap(bitmapE));
        return markerOptionsZIndex;
    }

    public static LatLng b(jpg jpgVar) {
        if (jpgVar == null) {
            return null;
        }
        return new LatLng(jpgVar.d, jpgVar.f38787a);
    }

    public static jpg c(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new jpg(latLng.latitude, latLng.longitude);
    }

    public static Marker b(GoogleMap googleMap, jpg jpgVar, String str) {
        BitmapDescriptor bitmapDescriptorFromResource;
        if (googleMap == null) {
            ReleaseLogUtil.a("Track_GoogleSuportUtils", "addMarker addGoogleEndMarkerBg is null.");
            return null;
        }
        if (jpgVar == null) {
            ReleaseLogUtil.a("Track_GoogleSuportUtils", "addMarker addGoogleEndMarkerBg is null.");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_end_bg);
        } else {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            BitmapDescriptor bitmapDescriptorFromBitmap = bitmapDecodeFile != null ? BitmapDescriptorFactory.fromBitmap(bitmapDecodeFile) : null;
            bitmapDescriptorFromResource = bitmapDescriptorFromBitmap == null ? BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_end_bg) : bitmapDescriptorFromBitmap;
        }
        return googleMap.addMarker(new MarkerOptions().position(b(jpgVar)).draggable(false).anchor(0.5f, 0.5f).icon(bitmapDescriptorFromResource));
    }
}
