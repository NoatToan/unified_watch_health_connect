package com.google.maps.android.data.kml;

import am.j;
import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class KmlStyle extends Style {
    private static final int HSV_VALUES = 3;
    private static final int HUE_VALUE = 0;
    private static final int INITIAL_SCALE = 1;
    private String mIconUrl;
    private boolean mFill = true;
    private boolean mOutline = true;
    private String mStyleId = null;
    private final HashMap<String, String> mBalloonOptions = new HashMap<>();
    private final HashSet<String> mStylesSet = new HashSet<>();
    private double mScale = 1.0d;
    float mMarkerColor = 0.0f;
    private boolean mIconRandomColorMode = false;
    private boolean mLineRandomColorMode = false;
    private boolean mPolyRandomColorMode = false;

    public static int computeRandomColor(int i14) {
        Random random = new Random();
        int iRed = Color.red(i14);
        int iGreen = Color.green(i14);
        int iBlue = Color.blue(i14);
        if (iRed != 0) {
            iRed = random.nextInt(iRed);
        }
        if (iBlue != 0) {
            iBlue = random.nextInt(iBlue);
        }
        if (iGreen != 0) {
            iGreen = random.nextInt(iGreen);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    private static String convertColor(String str) {
        String strTrim = str.trim();
        if (strTrim.length() <= 6) {
            return strTrim.substring(4, 6) + strTrim.substring(2, 4) + strTrim.substring(0, 2);
        }
        return strTrim.substring(0, 2) + strTrim.substring(6, 8) + strTrim.substring(4, 6) + strTrim.substring(2, 4);
    }

    private static MarkerOptions createMarkerOptions(MarkerOptions markerOptions, boolean z14, float f14) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.rotation(markerOptions.getRotation());
        markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        if (z14) {
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(getHueValue(computeRandomColor((int) f14))));
        }
        markerOptions2.icon(markerOptions.getIcon());
        return markerOptions2;
    }

    private static PolygonOptions createPolygonOptions(PolygonOptions polygonOptions, boolean z14, boolean z15) {
        float strokeWidth;
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z14) {
            polygonOptions2.fillColor(polygonOptions.getFillColor());
        }
        if (z15) {
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            strokeWidth = polygonOptions.getStrokeWidth();
        } else {
            strokeWidth = 0.0f;
        }
        polygonOptions2.strokeWidth(strokeWidth);
        polygonOptions2.clickable(polygonOptions.isClickable());
        return polygonOptions2;
    }

    private static PolylineOptions createPolylineOptions(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.color(polylineOptions.getColor());
        polylineOptions2.width(polylineOptions.getWidth());
        polylineOptions2.clickable(polylineOptions.isClickable());
        return polylineOptions2;
    }

    private static float getHueValue(int i14) {
        float[] fArr = new float[3];
        Color.colorToHSV(i14, fArr);
        return fArr[0];
    }

    public HashMap<String, String> getBalloonOptions() {
        return this.mBalloonOptions;
    }

    public double getIconScale() {
        return this.mScale;
    }

    public String getIconUrl() {
        return this.mIconUrl;
    }

    public MarkerOptions getMarkerOptions() {
        return createMarkerOptions(this.mMarkerOptions, isIconRandomColorMode(), this.mMarkerColor);
    }

    public PolygonOptions getPolygonOptions() {
        return createPolygonOptions(this.mPolygonOptions, this.mFill, this.mOutline);
    }

    public PolylineOptions getPolylineOptions() {
        return createPolylineOptions(this.mPolylineOptions);
    }

    public String getStyleId() {
        return this.mStyleId;
    }

    public boolean hasBalloonStyle() {
        return this.mBalloonOptions.size() > 0;
    }

    public boolean hasFill() {
        return this.mFill;
    }

    public boolean hasOutline() {
        return this.mOutline;
    }

    public boolean isIconRandomColorMode() {
        return this.mIconRandomColorMode;
    }

    public boolean isLineRandomColorMode() {
        return this.mLineRandomColorMode;
    }

    public boolean isPolyRandomColorMode() {
        return this.mPolyRandomColorMode;
    }

    public boolean isStyleSet(String str) {
        return this.mStylesSet.contains(str);
    }

    public void setFill(boolean z14) {
        this.mFill = z14;
    }

    public void setFillColor(String str) {
        setPolygonFillColor(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("fillColor");
    }

    public void setHeading(float f14) {
        setMarkerRotation(f14);
        this.mStylesSet.add("heading");
    }

    public void setHotSpot(float f14, float f15, String str, String str2) {
        setMarkerHotSpot(f14, f15, str, str2);
        this.mStylesSet.add("hotSpot");
    }

    public void setIconColorMode(String str) {
        this.mIconRandomColorMode = str.equals("random");
        this.mStylesSet.add("iconColorMode");
    }

    public void setIconScale(double d14) {
        this.mScale = d14;
        this.mStylesSet.add("iconScale");
    }

    public void setIconUrl(String str) {
        this.mIconUrl = str;
        this.mStylesSet.add("iconUrl");
    }

    public void setInfoWindowText(String str) {
        this.mBalloonOptions.put("text", str);
    }

    public void setLineColorMode(String str) {
        this.mLineRandomColorMode = str.equals("random");
        this.mStylesSet.add("lineColorMode");
    }

    public void setMarkerColor(String str) {
        float hueValue = getHueValue(Color.parseColor("#" + convertColor(str)));
        this.mMarkerColor = hueValue;
        this.mMarkerOptions.icon(BitmapDescriptorFactory.defaultMarker(hueValue));
        this.mStylesSet.add("markerColor");
    }

    public void setOutline(boolean z14) {
        this.mOutline = z14;
        this.mStylesSet.add("outline");
    }

    public void setOutlineColor(String str) {
        this.mPolylineOptions.color(Color.parseColor("#" + convertColor(str)));
        this.mPolygonOptions.strokeColor(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("outlineColor");
    }

    public void setPolyColorMode(String str) {
        this.mPolyRandomColorMode = str.equals("random");
        this.mStylesSet.add("polyColorMode");
    }

    public void setStyleId(String str) {
        this.mStyleId = str;
    }

    public void setWidth(Float f14) {
        setLineStringWidth(f14.floatValue());
        setPolygonStrokeWidth(f14.floatValue());
        this.mStylesSet.add("width");
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Style{\n balloon options=");
        sb3.append(this.mBalloonOptions);
        sb3.append(",\n fill=");
        sb3.append(this.mFill);
        sb3.append(",\n outline=");
        sb3.append(this.mOutline);
        sb3.append(",\n icon url=");
        sb3.append(this.mIconUrl);
        sb3.append(",\n scale=");
        sb3.append(this.mScale);
        sb3.append(",\n style id=");
        return j.o(this.mStyleId, "\n}\n", sb3);
    }
}
