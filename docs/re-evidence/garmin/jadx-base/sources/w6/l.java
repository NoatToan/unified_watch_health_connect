package w6;

import android.graphics.Rect;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class l implements Comparable<l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f182872c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f182870a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182871b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap<String, androidx.constraintlayout.widget.a> f182873d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f182874e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f182875f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f182876g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f182877h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f182878i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f182879j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f182880k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f182881l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f182882m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f182883n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f182884o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f182885p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f182886q = Float.NaN;

    public static boolean c(float f14, float f15) {
        if (Float.isNaN(f14) || Float.isNaN(f15)) {
            return Float.isNaN(f14) != Float.isNaN(f15);
        }
        return Math.abs(f14 - f15) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(int i14, HashMap map) {
        for (String str : map.keySet()) {
            v6.d dVar = (v6.d) map.get(str);
            if (dVar != null) {
                str.getClass();
                byte b14 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b14 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b14 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b14 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b14 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b14 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b14 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b14 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b14 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b14 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b14 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b14 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b14 = Ascii.VT;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b14 = Ascii.FF;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b14 = Ascii.CR;
                        }
                        break;
                }
                switch (b14) {
                    case 0:
                        dVar.b(Float.isNaN(this.f182877h) ? 0.0f : this.f182877h, i14);
                        break;
                    case 1:
                        dVar.b(Float.isNaN(this.f182870a) ? 0.0f : this.f182870a, i14);
                        break;
                    case 2:
                        dVar.b(Float.isNaN(this.f182882m) ? 0.0f : this.f182882m, i14);
                        break;
                    case 3:
                        dVar.b(Float.isNaN(this.f182883n) ? 0.0f : this.f182883n, i14);
                        break;
                    case 4:
                        dVar.b(Float.isNaN(this.f182884o) ? 0.0f : this.f182884o, i14);
                        break;
                    case 5:
                        dVar.b(Float.isNaN(this.f182886q) ? 0.0f : this.f182886q, i14);
                        break;
                    case 6:
                        dVar.b(Float.isNaN(this.f182878i) ? 1.0f : this.f182878i, i14);
                        break;
                    case 7:
                        dVar.b(Float.isNaN(this.f182879j) ? 1.0f : this.f182879j, i14);
                        break;
                    case 8:
                        dVar.b(Float.isNaN(this.f182880k) ? 0.0f : this.f182880k, i14);
                        break;
                    case 9:
                        dVar.b(Float.isNaN(this.f182881l) ? 0.0f : this.f182881l, i14);
                        break;
                    case 10:
                        dVar.b(Float.isNaN(this.f182876g) ? 0.0f : this.f182876g, i14);
                        break;
                    case 11:
                        dVar.b(Float.isNaN(this.f182875f) ? 0.0f : this.f182875f, i14);
                        break;
                    case 12:
                        dVar.b(Float.isNaN(this.f182885p) ? 0.0f : this.f182885p, i14);
                        break;
                    case 13:
                        dVar.b(Float.isNaN(this.f182874e) ? 1.0f : this.f182874e, i14);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap<String, androidx.constraintlayout.widget.a> linkedHashMap = this.f182873d;
                            if (linkedHashMap.containsKey(str2)) {
                                androidx.constraintlayout.widget.a aVar = linkedHashMap.get(str2);
                                if (dVar instanceof v6.d.b) {
                                    ((v6.d.b) dVar).f175784f.append(i14, aVar);
                                } else {
                                    aVar.a();
                                    dVar.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public final void b(View view2) {
        this.f182872c = view2.getVisibility();
        this.f182874e = view2.getVisibility() != 0 ? 0.0f : view2.getAlpha();
        this.f182875f = view2.getElevation();
        this.f182876g = view2.getRotation();
        this.f182877h = view2.getRotationX();
        this.f182870a = view2.getRotationY();
        this.f182878i = view2.getScaleX();
        this.f182879j = view2.getScaleY();
        this.f182880k = view2.getPivotX();
        this.f182881l = view2.getPivotY();
        this.f182882m = view2.getTranslationX();
        this.f182883n = view2.getTranslationY();
        this.f182884o = view2.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        lVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, androidx.constraintlayout.widget.d dVar, int i14, int i15) {
        rect.width();
        rect.height();
        androidx.constraintlayout.widget.d.a aVarK = dVar.k(i15);
        androidx.constraintlayout.widget.d.C0085d c0085d = aVarK.f6201c;
        androidx.constraintlayout.widget.d.c cVar = aVarK.f6202d;
        int i16 = c0085d.f6278c;
        this.f182871b = i16;
        int i17 = c0085d.f6277b;
        this.f182872c = i17;
        this.f182874e = (i17 == 0 || i16 != 0) ? c0085d.f6279d : 0.0f;
        androidx.constraintlayout.widget.d.e eVar = aVarK.f6204f;
        boolean z14 = eVar.f6294m;
        this.f182875f = eVar.f6295n;
        this.f182876g = eVar.f6283b;
        this.f182877h = eVar.f6284c;
        this.f182870a = eVar.f6285d;
        this.f182878i = eVar.f6286e;
        this.f182879j = eVar.f6287f;
        this.f182880k = eVar.f6288g;
        this.f182881l = eVar.f6289h;
        this.f182882m = eVar.f6291j;
        this.f182883n = eVar.f6292k;
        this.f182884o = eVar.f6293l;
        o6.c.c(cVar.f6266d);
        this.f182885p = cVar.f6270h;
        this.f182886q = aVarK.f6201c.f6280e;
        for (String str : aVarK.f6205g.keySet()) {
            androidx.constraintlayout.widget.a aVar = aVarK.f6205g.get(str);
            int iOrdinal = aVar.f6151c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f182873d.put(str, aVar);
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 != 4) {
                        return;
                    }
                }
            }
            float f14 = this.f182876g + 90.0f;
            this.f182876g = f14;
            if (f14 > 180.0f) {
                this.f182876g = f14 - 360.0f;
                return;
            }
            return;
        }
        this.f182876g -= 90.0f;
    }
}
