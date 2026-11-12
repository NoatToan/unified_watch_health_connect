package com.google.maps.android.kml;

import android.graphics.Color;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.huami.watch.ota.UpdateUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
class e {
    private static final int o = 3;
    private static final int p = 0;
    private static final int q = 1;
    private String h;
    private boolean f = true;
    private boolean g = true;
    private String j = null;
    private final MarkerOptions a = new MarkerOptions();
    private final PolylineOptions b = new PolylineOptions();
    private final PolygonOptions c = new PolygonOptions();
    private final HashMap<String, String> d = new HashMap<>();
    private final HashSet<String> e = new HashSet<>();
    private double i = 1.0d;
    private float n = 0.0f;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;

    public static int a(int i) {
        Random random = new Random();
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
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

    private static String b(String str) {
        String str2;
        if (str.length() > 6) {
            str2 = str.substring(0, 2) + str.substring(6, 8) + str.substring(4, 6) + str.substring(2, 4);
        } else {
            str2 = str.substring(4, 6) + str.substring(2, 4) + str.substring(0, 2);
        }
        if (!str2.substring(0, 1).equals(" ")) {
            return str2;
        }
        return "0" + str2.substring(1, str2.length());
    }

    private static MarkerOptions c(MarkerOptions markerOptions, boolean z, float f) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.rotation(markerOptions.getRotation());
        markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        if (z) {
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(g(a((int) f))));
        }
        markerOptions2.icon(markerOptions.getIcon());
        return markerOptions2;
    }

    private static PolygonOptions d(PolygonOptions polygonOptions, boolean z, boolean z2) {
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z) {
            polygonOptions2.fillColor(polygonOptions.getFillColor());
        }
        if (z2) {
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            polygonOptions2.strokeWidth(polygonOptions.getStrokeWidth());
        }
        return polygonOptions2;
    }

    private static PolylineOptions e(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.color(polylineOptions.getColor());
        polylineOptions2.width(polylineOptions.getWidth());
        return polylineOptions2;
    }

    private static float g(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return fArr[0];
    }

    public void A(String str) {
        this.h = str;
        this.e.add("iconUrl");
    }

    public void B(String str) {
        this.d.put("text", str);
    }

    public void C(String str) {
        this.l = str.equals("random");
        this.e.add("lineColorMode");
    }

    public void D(String str) {
        float fG = g(Color.parseColor(UpdateUtils.CMD_FILTER + b(str)));
        this.n = fG;
        this.a.icon(BitmapDescriptorFactory.defaultMarker(fG));
        this.e.add("markerColor");
    }

    public void E(boolean z) {
        this.g = z;
        this.e.add("outline");
    }

    public void F(String str) {
        this.b.color(Color.parseColor(UpdateUtils.CMD_FILTER + b(str)));
        this.c.strokeColor(Color.parseColor(UpdateUtils.CMD_FILTER + str));
        this.e.add("outlineColor");
    }

    public void G(String str) {
        this.m = str.equals("random");
        this.e.add("polyColorMode");
    }

    public void H(String str) {
        this.j = str;
    }

    public void I(Float f) {
        this.b.width(f.floatValue());
        this.c.strokeWidth(f.floatValue());
        this.e.add(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
    }

    public HashMap<String, String> f() {
        return this.d;
    }

    public double h() {
        return this.i;
    }

    public String i() {
        return this.h;
    }

    public MarkerOptions j() {
        return c(this.a, q(), this.n);
    }

    public PolygonOptions k() {
        return d(this.c, this.f, this.g);
    }

    public PolylineOptions l() {
        return e(this.b);
    }

    public String m() {
        return this.j;
    }

    public boolean n() {
        return this.d.size() > 0;
    }

    public boolean o() {
        return this.f;
    }

    public boolean p() {
        return this.g;
    }

    public boolean q() {
        return this.k;
    }

    public boolean r() {
        return this.l;
    }

    public boolean s() {
        return this.m;
    }

    public boolean t(String str) {
        return this.e.contains(str);
    }

    public String toString() {
        return "Style{\n balloon options=" + this.d + ",\n fill=" + this.f + ",\n outline=" + this.g + ",\n icon url=" + this.h + ",\n scale=" + this.i + ",\n style id=" + this.j + "\n}\n";
    }

    public void u(boolean z) {
        this.f = z;
    }

    public void v(String str) {
        this.c.fillColor(Color.parseColor(UpdateUtils.CMD_FILTER + b(str)));
        this.e.add("fillColor");
    }

    public void w(float f) {
        this.a.rotation(f);
        this.e.add("heading");
    }

    public void x(float f, float f2, String str, String str2) {
        if (!str.equals("fraction")) {
            f = 0.5f;
        }
        if (!str2.equals("fraction")) {
            f2 = 1.0f;
        }
        this.a.anchor(f, f2);
        this.e.add("hotSpot");
    }

    public void y(String str) {
        this.k = str.equals("random");
        this.e.add("iconColorMode");
    }

    public void z(double d) {
        this.i = d;
        this.e.add("iconScale");
    }
}
