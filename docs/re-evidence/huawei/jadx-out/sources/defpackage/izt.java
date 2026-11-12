package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.core.app.ActivityCompat;
import androidx.media3.extractor.ts.TsExtractor;
import com.amap.api.location.AMapLocation;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.common.util.VersionUtil;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.model.CoordinateLatLng;
import com.huawei.hms.maps.model.CoordinateType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MarkPoint;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class izt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38263c;
    private static final int e;
    private static final double[] f;
    private static final jpg h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f38261a = new SparseIntArray();
    private static final SparseIntArray j = new SparseIntArray();
    private static final SparseIntArray g = new SparseIntArray();
    private static final SparseIntArray d = new SparseIntArray(361);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f38262b = new SparseIntArray(361);

    public static boolean b(double d2) {
        return d2 < -90.0d || d2 > 90.0d;
    }

    public static boolean d(double d2) {
        return d2 < -180.0d || d2 > 180.0d;
    }

    static {
        double[] dArr = {90.0d, -80.0d, 0.0d};
        f = dArr;
        h = new jpg(dArr[0], dArr[1]);
        int i = 0;
        for (int i2 = 0; i2 <= 185; i2++) {
            int i3 = i2 + 70;
            float f2 = i2 / 185.0f;
            int iRound = Math.round((26.0f * f2) + 199.0f);
            int iRound2 = Math.round(109.0f - (f2 * 39.0f));
            d.put(Color.rgb(i3, iRound, iRound2), i);
            f38262b.put(i, Color.rgb(i3, iRound, iRound2));
            i++;
        }
        for (int i4 = 1; i4 <= 175; i4++) {
            float f3 = i4 / 175.0f;
            int iRound3 = Math.round(255.0f - (17.0f * f3));
            int i5 = 225 - i4;
            int iRound4 = Math.round(70.0f - (f3 * 20.0f));
            d.put(Color.rgb(iRound3, i5, iRound4), i);
            f38262b.put(i, Color.rgb(iRound3, i5, iRound4));
            i++;
        }
        if (BaseApplication.getContext() != null) {
            f38263c = qrs.d(BaseApplication.getContext(), 23.0f);
            e = qrs.d(BaseApplication.getContext(), 26.0f);
        } else {
            f38263c = 90;
            e = 105;
        }
        SparseIntArray sparseIntArray = f38261a;
        sparseIntArray.put(282, R.drawable.hw_show_map_tracking_start_hiking_img);
        sparseIntArray.put(258, R.drawable.hw_show_map_tracking_start_run_img);
        sparseIntArray.put(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, R.drawable.hw_show_map_tracking_start_cross_race_img);
        sparseIntArray.put(260, R.drawable.hw_show_map_tracking_start_climb_hill_img);
        sparseIntArray.put(259, R.drawable.hw_show_map_tracking_start_bike_img);
        sparseIntArray.put(257, R.drawable.hw_show_map_tracking_start_walk_img);
        sparseIntArray.put(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM, R.drawable.hw_show_map_tracking_start_swim_img);
        sparseIntArray.put(229, R.drawable.hw_show_map_tracking_start_alpine_skiing_img);
        sparseIntArray.put(230, R.drawable.hw_show_map_tracking_start_snowboarding_img);
        sparseIntArray.put(233, R.drawable.hw_show_map_tracking_start_ski_mountaineering_img);
        sparseIntArray.put(217, R.drawable.hw_show_map_tracking_start_ski_img);
        sparseIntArray.put(218, R.drawable.hw_show_map_tracking_start_ski_boarding_img);
        sparseIntArray.put(219, R.drawable.hw_show_map_tracking_start_ski_cross_country_img);
        sparseIntArray.put(222, R.drawable.hw_show_map_tracking_start_exp_img);
        sparseIntArray.put(226, R.drawable.hw_show_map_tracking_start_wheel_chair_img);
        a();
        j();
        e();
    }

    private static void e() {
        SparseIntArray sparseIntArray = g;
        sparseIntArray.put(MarkPoint.PointColor.ORANGE.color(), R.color.track_marker_orange);
        sparseIntArray.put(MarkPoint.PointColor.RED.color(), R.color.track_marker_red);
        sparseIntArray.put(MarkPoint.PointColor.BLUE.color(), R.color.track_marker_blue);
        sparseIntArray.put(MarkPoint.PointColor.YELLOW.color(), R.color.track_marker_yellow);
        sparseIntArray.put(MarkPoint.PointColor.GRAY.color(), R.color.track_marker_gray);
        sparseIntArray.put(MarkPoint.PointColor.GREEN.color(), R.color.track_marker_green);
        sparseIntArray.put(MarkPoint.PointColor.AUTO.color(), R.color.track_marker_orange);
    }

    private static void j() {
        SparseIntArray sparseIntArray = j;
        sparseIntArray.put(MarkPoint.MarkType.COMMON.type(), R.drawable.track_marker_general);
        sparseIntArray.put(MarkPoint.MarkType.START.type(), R.drawable.track_marker_start_end);
        sparseIntArray.put(MarkPoint.MarkType.CAMPSITE.type(), R.drawable.track_marker_camp);
        sparseIntArray.put(MarkPoint.MarkType.LEFT.type(), R.drawable.track_marker_left);
        sparseIntArray.put(MarkPoint.MarkType.RIGHT.type(), R.drawable.track_marker_right);
        sparseIntArray.put(MarkPoint.MarkType.STRAIGHT.type(), R.drawable.track_marker_straight);
        sparseIntArray.put(MarkPoint.MarkType.DANGER.type(), R.drawable.track_marker_danger);
        sparseIntArray.put(MarkPoint.MarkType.BEAST.type(), R.drawable.track_marker_beast);
        sparseIntArray.put(MarkPoint.MarkType.HEALTHCARE.type(), R.drawable.track_marker_medical);
        sparseIntArray.put(MarkPoint.MarkType.WATER.type(), R.drawable.track_marker_river);
        sparseIntArray.put(MarkPoint.MarkType.PROVIDE.type(), R.drawable.track_marker_supply);
        sparseIntArray.put(MarkPoint.MarkType.BRIDGE.type(), R.drawable.track_marker_bridge);
        sparseIntArray.put(MarkPoint.MarkType.RISK_AVERSION.type(), R.drawable.track_marker_risk);
        sparseIntArray.put(MarkPoint.MarkType.TOP_MOUNTAIN.type(), R.drawable.track_marker_mountain);
        sparseIntArray.put(MarkPoint.MarkType.HOUSE.type(), R.drawable.track_marker_house);
        sparseIntArray.put(MarkPoint.MarkType.END.type(), R.drawable.track_marker_start_end);
        sparseIntArray.put(MarkPoint.MarkType.AUTO_MARK.type(), -1);
    }

    private static void a() {
        SparseIntArray sparseIntArray = f38261a;
        sparseIntArray.put(MachineControlPointResponse.OP_CODE_EXTENSION_SET_STEP_COUNT, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(169, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(TsExtractor.TS_STREAM_TYPE_AC4, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(261, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(178, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(270, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(194, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(197, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(198, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(199, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(200, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(201, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(202, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(195, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(a.z, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(a.A, R.drawable.hw_show_map_tracking_start_go_img);
        sparseIntArray.put(a.M, R.drawable.hw_show_map_tracking_start_go_img);
    }

    public static Marker a(AMap aMap, jpg jpgVar, int i) {
        if (aMap == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "addMarker gaodeMap is null.");
            return null;
        }
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "addMarker latLng is null.");
            return null;
        }
        MarkerOptions markerOptionsZIndex = new MarkerOptions().position(b(jpgVar)).draggable(false).anchor(0.5f, 0.9f).zIndex(10.0f);
        d(i, markerOptionsZIndex);
        return aMap.addMarker(markerOptionsZIndex);
    }

    private static void d(int i, MarkerOptions markerOptions) {
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), f38261a.get(i, R.drawable.hw_show_map_tracking_start_run_img))));
    }

    public static com.huawei.hms.maps.model.Marker a(HuaweiMap huaweiMap, jpg jpgVar, int i) {
        if (huaweiMap == null || jpgVar == null) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "addGoogleStartMarker googleMap or hiHealthLatLng is null.");
            return null;
        }
        com.huawei.hms.maps.model.Marker markerAddMarker = huaweiMap.addMarker(new com.huawei.hms.maps.model.MarkerOptions().position(c(jpgVar)).draggable(false));
        if (BaseApplication.getContext() != null) {
            markerAddMarker.setIcon(com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), f38261a.get(i, R.drawable.hw_show_map_tracking_start_run_img))));
            markerAddMarker.setMarkerAnchor(0.5f, 0.9f);
        }
        return markerAddMarker;
    }

    public static Marker a(AMap aMap, jpg jpgVar, String str) {
        BitmapDescriptor bitmapDescriptorFromPath;
        if (aMap == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "addMarker gaodeMap is null.");
            return null;
        }
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "addMarker latLng is null.");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            bitmapDescriptorFromPath = BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_end_img);
        } else {
            bitmapDescriptorFromPath = BitmapDescriptorFactory.fromPath(str);
        }
        return aMap.addMarker(new MarkerOptions().position(b(jpgVar)).draggable(false).anchor(0.5f, 0.5f).zIndex(10.0f).icon(bitmapDescriptorFromPath));
    }

    public static com.huawei.hms.maps.model.Marker c(HuaweiMap huaweiMap, jpg jpgVar, String str) {
        if (huaweiMap == null) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "addHmsEndMarker huaweiMap is null.");
            return null;
        }
        if (jpgVar == null) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "addHmsEndMarker hiHealthLatLng is null.");
            return null;
        }
        com.huawei.hms.maps.model.Marker markerAddMarker = huaweiMap.addMarker(new com.huawei.hms.maps.model.MarkerOptions().position(c(jpgVar)).draggable(false).anchor(0.5f, 0.5f));
        if (BaseApplication.getContext() != null) {
            markerAddMarker.setIcon(c(str));
        }
        return markerAddMarker;
    }

    public static com.huawei.hms.maps.model.BitmapDescriptor c(String str) {
        if (TextUtils.isEmpty(str)) {
            return i();
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        com.huawei.hms.maps.model.BitmapDescriptor bitmapDescriptorFromBitmap = bitmapDecodeFile != null ? com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(bitmapDecodeFile) : null;
        return bitmapDescriptorFromBitmap == null ? i() : bitmapDescriptorFromBitmap;
    }

    private static com.huawei.hms.maps.model.BitmapDescriptor i() {
        return com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), R.drawable.hw_show_map_tracking_end_img));
    }

    public static Marker d(AMap aMap, jpg jpgVar, String str) {
        BitmapDescriptor bitmapDescriptorFromPath;
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "addMarker latLng is null.");
            return null;
        }
        if (aMap == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "addMarker gaodeMap is null.");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            bitmapDescriptorFromPath = BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_end_bg);
        } else {
            bitmapDescriptorFromPath = BitmapDescriptorFactory.fromPath(str);
        }
        return aMap.addMarker(new MarkerOptions().position(b(jpgVar)).draggable(false).anchor(0.5f, 0.5f).zIndex(10.0f).icon(bitmapDescriptorFromPath));
    }

    public static com.huawei.hms.maps.model.Marker a(HuaweiMap huaweiMap, jpg jpgVar, String str) {
        if (huaweiMap == null) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "addMarker addHmsEndMarkerBg is null.");
            return null;
        }
        if (jpgVar == null) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "addMarker addHmsEndMarkerBg is null.");
            return null;
        }
        com.huawei.hms.maps.model.Marker markerAddMarker = huaweiMap.addMarker(new com.huawei.hms.maps.model.MarkerOptions().position(c(jpgVar)).draggable(false).anchor(0.5f, 0.5f));
        if (BaseApplication.getContext() != null) {
            markerAddMarker.setIcon(a(str));
        }
        return markerAddMarker;
    }

    private static com.huawei.hms.maps.model.BitmapDescriptor a(String str) {
        if (TextUtils.isEmpty(str)) {
            return g();
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        com.huawei.hms.maps.model.BitmapDescriptor bitmapDescriptorFromBitmap = bitmapDecodeFile != null ? com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(bitmapDecodeFile) : null;
        return bitmapDescriptorFromBitmap == null ? g() : bitmapDescriptorFromBitmap;
    }

    private static com.huawei.hms.maps.model.BitmapDescriptor g() {
        return com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), R.drawable.hw_show_map_tracking_end_bg));
    }

    public static MarkerOptions b(Resources resources, LatLng latLng, String str) {
        if (latLng == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "addMarker latLng is null.");
            return null;
        }
        MarkerOptions markerOptionsZIndex = new MarkerOptions().position(latLng).draggable(false).anchor(0.5f, 1.0f).zIndex(14.0f);
        TextPaint textPaintC = c(resources, str.length());
        textPaintC.getTextBounds(str, 0, str.length(), new Rect());
        Bitmap bitmapE = e(resources);
        new Canvas(bitmapE).drawText(str, bitmapE.getWidth() / 2.0f, (((bitmapE.getHeight() - textPaintC.getFontMetrics().top) - textPaintC.getFontMetrics().bottom) / 2.0f) - e(resources, 2.0f), textPaintC);
        markerOptionsZIndex.icon(BitmapDescriptorFactory.fromBitmap(bitmapE));
        return markerOptionsZIndex;
    }

    public static com.huawei.hms.maps.model.Marker a(Resources resources, com.huawei.hms.maps.model.LatLng latLng, String str, HuaweiMap huaweiMap) {
        if (latLng == null || str == null || huaweiMap == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "addKmMarker latLng is null.");
            return null;
        }
        com.huawei.hms.maps.model.MarkerOptions markerOptionsZIndex = new com.huawei.hms.maps.model.MarkerOptions().position(latLng).draggable(false).zIndex(14.0f);
        TextPaint textPaintC = c(resources, str.length());
        textPaintC.getTextBounds(str, 0, str.length(), new Rect());
        Bitmap bitmapE = e(resources);
        new Canvas(bitmapE).drawText(str, bitmapE.getWidth() / 2.0f, (((bitmapE.getHeight() - textPaintC.getFontMetrics().top) - textPaintC.getFontMetrics().bottom) / 2.0f) - e(resources, 2.0f), textPaintC);
        markerOptionsZIndex.icon(com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(bitmapE));
        com.huawei.hms.maps.model.Marker markerAddMarker = huaweiMap.addMarker(markerOptionsZIndex);
        markerAddMarker.setIcon(com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(bitmapE));
        markerAddMarker.setMarkerAnchor(0.5f, 0.9f);
        return markerAddMarker;
    }

    public static TextPaint c(Resources resources, int i) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        if (resources != null) {
            textPaint.setColor(resources.getColor(R.color.common_color_white));
            if (i == 1) {
                textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.hw_show_font_size_10));
                return textPaint;
            }
            if (i == 2) {
                textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.hw_show_font_size_10));
                return textPaint;
            }
            textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.hw_show_font_size_8));
        }
        return textPaint;
    }

    public static Bitmap e(Resources resources) {
        if (resources != null) {
            Drawable drawable = resources.getDrawable(R.drawable.hw_show_map_tracking_km_img);
            int i = f38263c;
            int i2 = e;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (drawable != null) {
                drawable.setBounds(0, 0, i, i2);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.draw(canvas);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
            }
            return bitmapCreateBitmap;
        }
        return Bitmap.createBitmap(f38263c, e, Bitmap.Config.ARGB_8888);
    }

    public static ArrayList<jpk> d(List<MarkPoint> list, boolean z) {
        jpk jpkVar;
        ArrayList<jpk> arrayList = new ArrayList<>();
        if (njy.e(list)) {
            LogUtil.j("Track_DrawMapUtils", "no markerPoints");
            return arrayList;
        }
        Context context = BaseApplication.getContext();
        for (int i = 0; i < list.size(); i++) {
            MarkPoint markPoint = list.get(i);
            if (markPoint == null) {
                ReleaseLogUtil.a("Track_DrawMapUtils", "markPoint is null");
            } else {
                jpg jpgVar = new jpg(markPoint.e(), markPoint.b());
                float f2 = 0.9f;
                if (i == 0) {
                    jpkVar = new jpk(jpgVar, R.drawable.hw_show_map_tracking_start_exp_img, -1);
                } else if (markPoint.c() == 1) {
                    jpkVar = new jpk(jpgVar, R.drawable.track_marker_bg_common, R.drawable.track_marker_bg_circle, j.get(markPoint.f(), R.drawable.track_marker_general), context.getColor(g.get(markPoint.a(), R.color.common_colorAccent)));
                } else if (markPoint.c() == 0 && i == list.size() - 1) {
                    jpkVar = new jpk(jpgVar, z ? R.drawable.retrack_show_map_ending : R.drawable.hw_show_map_ending, -1);
                } else {
                    jpkVar = new jpk(jpgVar, R.drawable.track_marker_auto, context.getColor(g.get(MarkPoint.PointColor.AUTO.color(), R.color.common_colorAccent)));
                    f2 = 0.5f;
                }
                jpkVar.e(0.5f);
                jpkVar.a(f2);
                arrayList.add(jpkVar);
            }
        }
        return arrayList;
    }

    public static Drawable e(String str, int i, float f2) {
        Paint paint = new Paint(1);
        Bitmap bitmapE = qqf.e(R.drawable.track_detail_cp, BaseApplication.getContext());
        if (bitmapE == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapE.getWidth(), bitmapE.getHeight(), bitmapE.getConfig());
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmapE, 0.0f, 0.0f, paint);
            paint.setColor(i);
            paint.setTextSize(f2);
            paint.setTextAlign(Paint.Align.LEFT);
            float fMeasureText = paint.measureText(str);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f3 = fontMetrics.descent;
            float f4 = fontMetrics.ascent;
            canvas.drawText(str, (bitmapE.getWidth() / 2.0f) - (fMeasureText / 2.0f), (bitmapE.getHeight() / 2.0f) + 4.0f, paint);
            return new BitmapDrawable(BaseApplication.getContext().getResources(), bitmapCreateBitmap);
        } catch (IllegalArgumentException | OutOfMemoryError e2) {
            LogUtil.e("Track_DrawMapUtils", "textToDrawable() ", ExceptionUtils.c(e2));
            return null;
        }
    }

    public static ArrayList<MarkerOptions> c(List<jpk> list) {
        ArrayList<MarkerOptions> arrayList = new ArrayList<>();
        if (!njy.e(list)) {
            for (jpk jpkVar : list) {
                if (jpkVar == null || jpkVar.b() == null) {
                    ReleaseLogUtil.a("Track_DrawMapUtils", "hiHealthMarker or drawable is null in buildGaodeMarker");
                } else {
                    Bitmap bitmapA = qqf.a(jpkVar.b());
                    arrayList.add(new MarkerOptions().position(d(jpkVar.e())).draggable(false).anchor(jpkVar.c(), jpkVar.a()).zIndex(10.0f).icon(BitmapDescriptorFactory.fromBitmap(bitmapA)));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<com.huawei.hms.maps.model.MarkerOptions> d(List<jpk> list) {
        ArrayList<com.huawei.hms.maps.model.MarkerOptions> arrayList = new ArrayList<>();
        if (!njy.e(list)) {
            for (jpk jpkVar : list) {
                if (jpkVar == null || jpkVar.b() == null) {
                    ReleaseLogUtil.a("Track_DrawMapUtils", "hiHealthMarker or drawable is null in buildHmsMarker");
                } else {
                    arrayList.add(new com.huawei.hms.maps.model.MarkerOptions().position(g(jpkVar.e())).draggable(false).anchorMarker(jpkVar.c(), jpkVar.a()).zIndex(10.0f).icon(com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(qqf.a(jpkVar.b()))));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<com.google.android.gms.maps.model.MarkerOptions> e(List<jpk> list) {
        ArrayList<com.google.android.gms.maps.model.MarkerOptions> arrayList = new ArrayList<>();
        if (!njy.e(list)) {
            for (jpk jpkVar : list) {
                if (jpkVar == null || jpkVar.b() == null) {
                    ReleaseLogUtil.a("Track_DrawMapUtils", "hiHealthMarker or drawable is null in buildGoogleMarker");
                } else {
                    arrayList.add(new com.google.android.gms.maps.model.MarkerOptions().position(e(jpkVar.e())).draggable(false).anchor(jpkVar.c(), jpkVar.a()).zIndex(10.0f).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(qqf.a(jpkVar.b()))));
                }
            }
        }
        return arrayList;
    }

    public static Bitmap b(List<jpk> list) {
        if (njy.e(list)) {
            LogUtil.a("Track_DrawMapUtils", "hiHealthMarkerList is empty in getLastManualMarker");
            return null;
        }
        return qqf.a(list.get(list.size() - 1).b());
    }

    public static LatLng d(jpg jpgVar) {
        if (jpgVar == null) {
            return new LatLng(90.0d, 180.0d);
        }
        return new LatLng(jpgVar.d, jpgVar.f38787a);
    }

    public static com.huawei.hms.maps.model.LatLng g(jpg jpgVar) {
        if (jpgVar == null) {
            return new com.huawei.hms.maps.model.LatLng(90.0d, 180.0d);
        }
        return new com.huawei.hms.maps.model.LatLng(jpgVar.d, jpgVar.f38787a);
    }

    public static com.google.android.gms.maps.model.LatLng e(jpg jpgVar) {
        if (jpgVar == null) {
            return new com.google.android.gms.maps.model.LatLng(90.0d, 180.0d);
        }
        return new com.google.android.gms.maps.model.LatLng(jpgVar.d, jpgVar.f38787a);
    }

    private static float e(Resources resources, float f2) {
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }

    public static boolean a(jpg jpgVar) {
        return c(h, jpgVar);
    }

    public static boolean d(double d2, double d3) {
        return a(new jpg(d2, d3));
    }

    public static boolean c(jpg jpgVar, jpg jpgVar2) {
        return jpgVar != null && jpgVar2 != null && Math.abs(jpgVar.d - jpgVar2.d) < 1.0E-6d && Math.abs(jpgVar.f38787a - jpgVar2.f38787a) < 1.0E-6d;
    }

    public static List<Integer> a(float[] fArr, Integer[] numArr) {
        int iD;
        int iD2;
        float f2;
        if (fArr == null || numArr == null) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "index pace or color type is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                int i2 = i - 1;
                f2 = fArr[i] - fArr[i2];
                iD = d(numArr[i2].intValue());
                iD2 = d(numArr[i].intValue());
            } else {
                iD = 0;
                iD2 = 0;
                f2 = 0.0f;
            }
            int i3 = 0;
            for (float f3 = ((float) i) != 0.0f ? fArr[i - 1] : 0.0f; f3 < fArr[i]; f3 += 1.0f) {
                if (iD == iD2 || Math.abs(f2) <= 1.0E-6d) {
                    arrayList.add(numArr[i]);
                } else {
                    SparseIntArray sparseIntArray = f38262b;
                    arrayList.add(Integer.valueOf(sparseIntArray.get(((int) (((iD2 - iD) / f2) * i3)) + iD, sparseIntArray.get(0))));
                    i3++;
                }
            }
        }
        return arrayList;
    }

    private static int d(int i) {
        return d.get(i, 0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    public static int c(float f2, int i) {
        int i2;
        int i3;
        if (f2 <= 1.0E-6d) {
            return izw.s;
        }
        float f3 = 1000.0f / f2;
        if (i == 257 || i == 282) {
            i2 = 4;
            i3 = 7;
        } else if (i == 258 || i == 280 || i == 226 || i == 227) {
            i3 = 12;
            i2 = 6;
        } else if (i == 260) {
            i2 = 4;
            i3 = 7;
        } else {
            i3 = 30;
            i2 = 10;
        }
        return e(i3, i2, f3 * 3.6f);
    }

    public static int e(float f2, float f3, float f4) {
        if (f4 >= f2) {
            return izw.s;
        }
        if (f4 <= f3) {
            return izw.t;
        }
        return f38262b.get((int) (((f4 - f3) / (f2 - f3)) * 360.0f));
    }

    public static List<Integer> a(float f2, float f3, int i) {
        int iC = c(f3, i);
        int iC2 = c(f2, i);
        SparseIntArray sparseIntArray = d;
        int i2 = sparseIntArray.get(iC);
        int i3 = sparseIntArray.get(iC2);
        if (i2 >= i3) {
            ArrayList arrayList = new ArrayList((i2 - i3) + 1);
            while (i3 <= i2) {
                arrayList.add(Integer.valueOf(f38262b.get(i3)));
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((i3 - i2) + 1);
        while (i3 >= i2) {
            arrayList2.add(Integer.valueOf(f38262b.get(i3)));
            i3--;
        }
        return arrayList2;
    }

    public static double[] b(Context context, Location location) {
        if (context == null || location == null) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "convertLocation context or location is null, please check");
            return new double[]{0.0d, 0.0d};
        }
        CoordinateConverter coordinateConverter = new CoordinateConverter(context);
        coordinateConverter.from(CoordinateConverter.CoordType.GPS);
        coordinateConverter.coord(b(new jpg(location.getLatitude(), location.getLongitude())));
        LatLng latLngConvert = coordinateConverter.convert();
        double[] dArr = new double[2];
        if (latLngConvert != null) {
            dArr[0] = latLngConvert.latitude;
            dArr[1] = latLngConvert.longitude;
            return dArr;
        }
        dArr[0] = location.getLatitude();
        dArr[1] = location.getLongitude();
        return dArr;
    }

    public static double[] a(Context context, double[] dArr) {
        if (context == null || dArr == null || dArr.length != 2) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "convertLocation context or location is null, please check");
            return new double[]{0.0d, 0.0d};
        }
        CoordinateConverter coordinateConverter = new CoordinateConverter(context);
        coordinateConverter.from(CoordinateConverter.CoordType.GPS);
        coordinateConverter.coord(b(new jpg(dArr[0], dArr[1])));
        LatLng latLngConvert = coordinateConverter.convert();
        double[] dArr2 = new double[2];
        if (latLngConvert != null) {
            dArr2[0] = latLngConvert.latitude;
            dArr2[1] = latLngConvert.longitude;
            return dArr2;
        }
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[1];
        return dArr2;
    }

    public static LatLng b(jpg jpgVar) {
        if (jpgVar == null) {
            return null;
        }
        return new LatLng(jpgVar.d, jpgVar.f38787a);
    }

    public static jpg a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new jpg(latLng.latitude, latLng.longitude);
    }

    public static com.huawei.hms.maps.model.LatLng c(jpg jpgVar) {
        if (jpgVar == null) {
            return null;
        }
        return new com.huawei.hms.maps.model.LatLng(jpgVar.d, jpgVar.f38787a);
    }

    public static jpg a(com.huawei.hms.maps.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new jpg(latLng.latitude, latLng.longitude);
    }

    public static Location e(Context context) {
        Location lastKnownLocation = null;
        if (context == null || !a(context)) {
            return null;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false);
        criteria.setCostAllowed(false);
        criteria.setPowerRequirement(1);
        String bestProvider = locationManager.getBestProvider(criteria, true);
        List<String> allProviders = locationManager.getAllProviders();
        if (allProviders == null) {
            return null;
        }
        if (allProviders.contains(bestProvider)) {
            try {
                lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
            } catch (IllegalArgumentException | NullPointerException e2) {
                ReleaseLogUtil.a("Track_DrawMapUtils", "getLastKnowLocation error ", LogAnonymous.b(e2));
            }
        }
        if (lastKnownLocation != null || !allProviders.contains("network")) {
            return lastKnownLocation;
        }
        try {
            return locationManager.getLastKnownLocation("network");
        } catch (IllegalArgumentException | NullPointerException e3) {
            ReleaseLogUtil.a("Track_DrawMapUtils", "getLastKnowLocation by network error ", LogAnonymous.b(e3));
            return lastKnownLocation;
        }
    }

    private static boolean a(Context context) {
        if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        ReleaseLogUtil.d("Track_DrawMapUtils", "checkSelfPermission is false");
        return false;
    }

    public static float a(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null) {
            return 0.0f;
        }
        return AMapUtils.calculateLineDistance(b(jpgVar), b(jpgVar2));
    }

    public static boolean d(Context context) {
        if (context == null) {
            ReleaseLogUtil.e("Track_DrawMapUtils", "supportHms context is null");
            return false;
        }
        if (!CommonUtil.bg()) {
            ReleaseLogUtil.d("Track_DrawMapUtils", "Is not Emui");
            return false;
        }
        int iIsHmsMapAvailable = VersionUtil.isHmsMapAvailable(context);
        if (iIsHmsMapAvailable == 2) {
            ReleaseLogUtil.d("Track_DrawMapUtils", "Rom version is not support hms");
            return false;
        }
        if (iIsHmsMapAvailable == 1 && jaa.i() && Utils.o()) {
            ReleaseLogUtil.d("Track_DrawMapUtils", "ForbiddenCountry with Hms below 3.0 version");
            return false;
        }
        if (iIsHmsMapAvailable != 0 && !CommonUtil.b(context)) {
            HmsUtil.setRepeatFlag(false);
        }
        return true;
    }

    public static void c() {
        HmsUtil.setRepeatFlag(true);
    }

    public static boolean c(Context context) {
        if (context != null) {
            return VersionUtil.isHmsMapAvailable(context) == 0;
        }
        ReleaseLogUtil.e("Track_DrawMapUtils", "isHmsAvailable context is null");
        return false;
    }

    public static boolean d() {
        LogUtil.a("Track_DrawMapUtils", "isDrawDotted GaoDe ", Integer.valueOf(b()));
        return b() == 0;
    }

    public static int b() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "pause_trackline_type");
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e2) {
            LogUtil.e("Track_DrawMapUtils", "acquirePauseTracklineType NumberFormatException", LogAnonymous.b(e2));
            return 0;
        }
    }

    public static jpg b(GpsPoint gpsPoint) {
        if (gpsPoint == null) {
            return new jpg(90.0d, 180.0d);
        }
        return new jpg(gpsPoint.getLatitude(), gpsPoint.getLongitude());
    }

    public static List<jpg> b(jpg jpgVar, int i) {
        ArrayList arrayList = new ArrayList(2);
        if (jpgVar == null) {
            LogUtil.e("Track_DrawMapUtils", "center is null in getOverlayLatLng");
            return arrayList;
        }
        LatLngBounds bounds = new GroundOverlayOptions().position(b(jpgVar), i).getBounds();
        if (bounds != null) {
            arrayList.add(a(bounds.southwest));
            arrayList.add(a(bounds.northeast));
        }
        return arrayList;
    }

    private static List<jpg> b(List<jpg> list, String str) {
        if (njy.e(list)) {
            LogUtil.j("Track_DrawMapUtils", "hiLatLngs is empty");
            return list;
        }
        CoordinateType coordinateTypeE = e(str);
        if (coordinateTypeE == null) {
            LogUtil.j("Track_DrawMapUtils", "coordinate is invalid");
            return list;
        }
        int size = list.size();
        CoordinateLatLng[] coordinateLatLngArr = new CoordinateLatLng[size];
        for (int i = 0; i < size; i++) {
            coordinateLatLngArr[i] = new CoordinateLatLng(coordinateTypeE, c(list.get(i)));
        }
        CoordinateLatLng[] coordinateLatLngArrRectifyCoordinate = com.huawei.hms.maps.common.util.CoordinateConverter.rectifyCoordinate(coordinateLatLngArr);
        if (coordinateLatLngArrRectifyCoordinate == null || coordinateLatLngArrRectifyCoordinate.length == 0) {
            LogUtil.j("Track_DrawMapUtils", "latLngArray is empty");
            return list;
        }
        ArrayList arrayList = new ArrayList(coordinateLatLngArrRectifyCoordinate.length);
        for (CoordinateLatLng coordinateLatLng : coordinateLatLngArrRectifyCoordinate) {
            arrayList.add(a(coordinateLatLng.getLocation()));
        }
        return arrayList;
    }

    private static jpg d(jpg jpgVar, String str) {
        if (jpgVar == null) {
            LogUtil.j("Track_DrawMapUtils", "hiLatLngs is null");
            return jpgVar;
        }
        CoordinateType coordinateTypeE = e(str);
        if (coordinateTypeE == null) {
            LogUtil.j("Track_DrawMapUtils", "coordinate is invalid");
            return jpgVar;
        }
        CoordinateLatLng[] coordinateLatLngArrRectifyCoordinate = com.huawei.hms.maps.common.util.CoordinateConverter.rectifyCoordinate(new CoordinateLatLng[]{new CoordinateLatLng(coordinateTypeE, c(jpgVar))});
        if (coordinateLatLngArrRectifyCoordinate == null || coordinateLatLngArrRectifyCoordinate.length == 0) {
            LogUtil.j("Track_DrawMapUtils", "latLngArray is empty");
            return jpgVar;
        }
        return a(coordinateLatLngArrRectifyCoordinate[0].getLocation());
    }

    private static CoordinateType e(String str) {
        if (TextUtils.equals(str, AMapLocation.COORD_TYPE_WGS84)) {
            return new CoordinateType(CoordinateType.CoordinateTypeEnum.WGS84);
        }
        if (TextUtils.equals(str, AMapLocation.COORD_TYPE_GCJ02)) {
            return new CoordinateType(CoordinateType.CoordinateTypeEnum.GCJ02);
        }
        return null;
    }

    public static jpg a(jpg jpgVar, String str, int i) {
        if (TextUtils.equals(str, AMapLocation.COORD_TYPE_WGS84)) {
            return a(jpgVar, i);
        }
        return TextUtils.equals(str, AMapLocation.COORD_TYPE_GCJ02) ? e(jpgVar, i) : jpgVar;
    }

    public static List<jpg> d(List<jpg> list, String str, int i) {
        if (TextUtils.equals(str, AMapLocation.COORD_TYPE_WGS84)) {
            return e(list, i);
        }
        return TextUtils.equals(str, AMapLocation.COORD_TYPE_GCJ02) ? c(list, i) : list;
    }

    private static jpg a(jpg jpgVar, int i) {
        if (jpgVar == null) {
            return jpgVar;
        }
        int iC = npl.c(jpgVar.d, jpgVar.f38787a);
        if (iC == 1 || (iC == 3 && i == 1)) {
            return izy.e(jpgVar);
        }
        return (iC == 3 && i == 3) ? d(jpgVar, AMapLocation.COORD_TYPE_WGS84) : jpgVar;
    }

    private static List<jpg> e(List<jpg> list, int i) {
        if (njy.e(list)) {
            return list;
        }
        jpg jpgVar = list.get(0);
        int iC = npl.c(jpgVar.d, jpgVar.f38787a);
        if (iC == 1 || (iC == 3 && i == 1)) {
            return izy.e(list);
        }
        return (iC == 3 && i == 3) ? b(list, AMapLocation.COORD_TYPE_WGS84) : list;
    }

    private static jpg e(jpg jpgVar, int i) {
        return (jpgVar != null && npl.c(jpgVar.d, jpgVar.f38787a) == 3 && i == 3) ? d(jpgVar, AMapLocation.COORD_TYPE_GCJ02) : jpgVar;
    }

    private static List<jpg> c(List<jpg> list, int i) {
        if (njy.e(list)) {
            return list;
        }
        jpg jpgVar = list.get(0);
        return (npl.c(jpgVar.d, jpgVar.f38787a) == 3 && i == 3) ? b(list, AMapLocation.COORD_TYPE_GCJ02) : list;
    }

    public static MotionData b(MotionData motionData, int i) {
        if (motionData == null) {
            return motionData;
        }
        Map<Long, double[]> mapE = e(motionData.getLbsDataMap(), i);
        ArrayList<MarkPoint> arrayListE = e(motionData.requestMarkPointList(), i);
        try {
            MotionData motionDataM1299clone = motionData.m1299clone();
            motionDataM1299clone.setLbsDataMap(mapE);
            motionDataM1299clone.saveMarkPointList(arrayListE);
            return motionDataM1299clone;
        } catch (CloneNotSupportedException unused) {
            LogUtil.e("Track_DrawMapUtils", "convertCoordinateByHK error");
            return motionData;
        }
    }

    public static ArrayList<MarkPoint> e(ArrayList<MarkPoint> arrayList, int i) {
        if (njy.e(arrayList)) {
            return arrayList;
        }
        MarkPoint markPoint = arrayList.get(0);
        if (npl.c(markPoint.e(), markPoint.b()) != 3) {
            LogUtil.a("Track_DrawMapUtils", "convertLbsForMap not in hk or mc");
            return arrayList;
        }
        ArrayList<MarkPoint> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator<MarkPoint> it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                MarkPoint markPointClone = it.next().clone();
                jpg jpgVarA = a(new jpg(markPointClone.e(), markPointClone.b()), i);
                markPointClone.c(jpgVarA.d);
                markPointClone.a(jpgVarA.f38787a);
                arrayList2.add(markPointClone);
            } catch (CloneNotSupportedException unused) {
                LogUtil.e("Track_DrawMapUtils", "convertMarkPointForMap");
                return arrayList;
            }
        }
        return arrayList2;
    }

    public static Map<Long, double[]> e(Map<Long, double[]> map, int i) {
        if (map == null) {
            return map;
        }
        double[] dArr = map.get(0L);
        if (dArr == null || dArr.length < 2) {
            LogUtil.e("Track_DrawMapUtils", "convertLbsForMap motionPathPoint is invalid");
            return map;
        }
        if (npl.c(dArr[0], dArr[1]) != 3) {
            LogUtil.a("Track_DrawMapUtils", "convertLbsForMap not in hk or mc");
            return map;
        }
        if (i == 1) {
            return d(map);
        }
        return i == 3 ? a(map) : map;
    }

    private static Map<Long, double[]> a(Map<Long, double[]> map) {
        ArrayList arrayList = new ArrayList(map.size());
        CoordinateType coordinateTypeE = e(AMapLocation.COORD_TYPE_WGS84);
        CoordinateLatLng[] coordinateLatLngArr = new CoordinateLatLng[map.size()];
        int i = 0;
        for (Map.Entry<Long, double[]> entry : map.entrySet()) {
            double[] value = entry.getValue();
            if (value.length < 2) {
                LogUtil.e("Track_DrawMapUtils", "convertLbsForHms pointMap is invalid");
                return map;
            }
            arrayList.add(entry.getKey());
            coordinateLatLngArr[i] = new CoordinateLatLng(coordinateTypeE, new com.huawei.hms.maps.model.LatLng(value[0], value[1]));
            i++;
        }
        CoordinateLatLng[] coordinateLatLngArrRectifyCoordinate = com.huawei.hms.maps.common.util.CoordinateConverter.rectifyCoordinate(coordinateLatLngArr);
        if (coordinateLatLngArrRectifyCoordinate == null || coordinateLatLngArrRectifyCoordinate.length == 0 || arrayList.size() != coordinateLatLngArrRectifyCoordinate.length) {
            LogUtil.j("Track_DrawMapUtils", "latLngArray is error");
            return map;
        }
        TreeMap treeMap = new TreeMap();
        for (int i2 = 0; i2 < coordinateLatLngArrRectifyCoordinate.length; i2++) {
            Long l = (Long) arrayList.get(i2);
            double[] dArr = map.get(l);
            if (dArr != null && dArr.length >= 4) {
                com.huawei.hms.maps.model.LatLng location = coordinateLatLngArrRectifyCoordinate[i2].getLocation();
                double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
                dArrCopyOf[0] = location.latitude;
                dArrCopyOf[1] = location.longitude;
                treeMap.put(l, dArrCopyOf);
            }
        }
        return treeMap;
    }

    private static Map<Long, double[]> d(Map<Long, double[]> map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<Long, double[]> entry : map.entrySet()) {
            double[] value = entry.getValue();
            if (value != null && value.length >= 4) {
                jpg jpgVar = new jpg(value[0], value[1]);
                if (!a(jpgVar)) {
                    jpgVar = izy.e(jpgVar);
                }
                double[] dArrCopyOf = Arrays.copyOf(value, value.length);
                dArrCopyOf[0] = jpgVar.d;
                dArrCopyOf[1] = jpgVar.f38787a;
                treeMap.put(entry.getKey(), dArrCopyOf);
            }
        }
        return treeMap;
    }

    public static List<jpg> a(List<jrp> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            Iterator<jrp> it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().b());
            }
        }
        return arrayList;
    }
}
