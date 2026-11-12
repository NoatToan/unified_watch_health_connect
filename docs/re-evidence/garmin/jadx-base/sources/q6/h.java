package q6;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.e f143139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f143140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f143141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f143142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f143143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f143144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f143145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f143146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f143147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f143148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f143149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f143150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f143151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f143152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f143153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f143154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f143155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap<String, n6.a> f143156r;

    public h(h hVar) {
        this.f143139a = null;
        this.f143140b = 0;
        this.f143141c = 0;
        this.f143142d = 0;
        this.f143143e = 0;
        this.f143144f = Float.NaN;
        this.f143145g = Float.NaN;
        this.f143146h = Float.NaN;
        this.f143147i = Float.NaN;
        this.f143148j = Float.NaN;
        this.f143149k = Float.NaN;
        this.f143150l = Float.NaN;
        this.f143151m = Float.NaN;
        this.f143152n = Float.NaN;
        this.f143153o = Float.NaN;
        this.f143154p = Float.NaN;
        this.f143155q = 0;
        this.f143156r = new HashMap<>();
        this.f143139a = hVar.f143139a;
        this.f143140b = hVar.f143140b;
        this.f143141c = hVar.f143141c;
        this.f143142d = hVar.f143142d;
        this.f143143e = hVar.f143143e;
        e(hVar);
    }

    public static void a(float f14, String str, StringBuilder sb3) {
        if (Float.isNaN(f14)) {
            return;
        }
        sb3.append(str);
        sb3.append(": ");
        sb3.append(f14);
        sb3.append(",\n");
    }

    public static void b(StringBuilder sb3, int i14, String str) {
        f.q(i14, str, ": ", ",\n", sb3);
    }

    public final void c(StringBuilder sb3) {
        sb3.append("{\n");
        b(sb3, this.f143140b, TtmlNode.LEFT);
        b(sb3, this.f143141c, "top");
        b(sb3, this.f143142d, TtmlNode.RIGHT);
        b(sb3, this.f143143e, "bottom");
        a(this.f143144f, "pivotX", sb3);
        a(this.f143145g, "pivotY", sb3);
        a(this.f143146h, "rotationX", sb3);
        a(this.f143147i, "rotationY", sb3);
        a(this.f143148j, "rotationZ", sb3);
        a(this.f143149k, "translationX", sb3);
        a(this.f143150l, "translationY", sb3);
        a(this.f143151m, "translationZ", sb3);
        a(this.f143152n, "scaleX", sb3);
        a(this.f143153o, "scaleY", sb3);
        a(this.f143154p, "alpha", sb3);
        b(sb3, this.f143155q, "visibility");
        a(Float.NaN, "interpolatedPos", sb3);
        t6.e eVar = this.f143139a;
        if (eVar != null) {
            for (t6.d.a aVar : t6.d.a.values()) {
                t6.d dVarK = eVar.k(aVar);
                if (dVarK != null && dVarK.f162588f != null) {
                    sb3.append("Anchor");
                    sb3.append(aVar.name());
                    sb3.append(": ['");
                    String str = dVarK.f162588f.f162586d.f162624l;
                    if (str == null) {
                        str = "#PARENT";
                    }
                    sb3.append(str);
                    sb3.append("', '");
                    sb3.append(dVarK.f162588f.f162587e.name());
                    sb3.append("', '");
                    sb3.append(dVarK.f162589g);
                    sb3.append("'],\n");
                }
            }
        }
        a(Float.NaN, "phone_orientation", sb3);
        a(Float.NaN, "phone_orientation", sb3);
        HashMap<String, n6.a> map = this.f143156r;
        if (map.size() != 0) {
            sb3.append("custom : {\n");
            for (String str2 : map.keySet()) {
                n6.a aVar2 = map.get(str2);
                sb3.append(str2);
                sb3.append(": ");
                switch (aVar2.f123791b) {
                    case 900:
                        sb3.append(aVar2.f123792c);
                        sb3.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb3.append(aVar2.f123793d);
                        sb3.append(",\n");
                        break;
                    case 902:
                        sb3.append("'");
                        sb3.append(n6.a.a(aVar2.f123792c));
                        sb3.append("',\n");
                        break;
                    case 903:
                        sb3.append("'");
                        sb3.append(aVar2.f123794e);
                        sb3.append("',\n");
                        break;
                    case 904:
                        sb3.append("'");
                        sb3.append(aVar2.f123795f);
                        sb3.append("',\n");
                        break;
                }
            }
            sb3.append("}\n");
        }
        sb3.append("}\n");
    }

    public final void d() {
        t6.e eVar = this.f143139a;
        if (eVar != null) {
            this.f143140b = eVar.t();
            this.f143141c = eVar.u();
            this.f143142d = eVar.t() + eVar.Y;
            this.f143143e = eVar.u() + eVar.Z;
            e(eVar.f162622k);
        }
    }

    public final void e(h hVar) {
        if (hVar == null) {
            return;
        }
        this.f143144f = hVar.f143144f;
        this.f143145g = hVar.f143145g;
        this.f143146h = hVar.f143146h;
        this.f143147i = hVar.f143147i;
        this.f143148j = hVar.f143148j;
        this.f143149k = hVar.f143149k;
        this.f143150l = hVar.f143150l;
        this.f143151m = hVar.f143151m;
        this.f143152n = hVar.f143152n;
        this.f143153o = hVar.f143153o;
        this.f143154p = hVar.f143154p;
        this.f143155q = hVar.f143155q;
        HashMap<String, n6.a> map = this.f143156r;
        map.clear();
        for (n6.a aVar : hVar.f143156r.values()) {
            map.put(aVar.f123790a, new n6.a(aVar));
        }
    }

    public h(t6.e eVar) {
        this.f143139a = null;
        this.f143140b = 0;
        this.f143141c = 0;
        this.f143142d = 0;
        this.f143143e = 0;
        this.f143144f = Float.NaN;
        this.f143145g = Float.NaN;
        this.f143146h = Float.NaN;
        this.f143147i = Float.NaN;
        this.f143148j = Float.NaN;
        this.f143149k = Float.NaN;
        this.f143150l = Float.NaN;
        this.f143151m = Float.NaN;
        this.f143152n = Float.NaN;
        this.f143153o = Float.NaN;
        this.f143154p = Float.NaN;
        this.f143155q = 0;
        this.f143156r = new HashMap<>();
        this.f143139a = eVar;
    }

    public h() {
        this.f143139a = null;
        this.f143140b = 0;
        this.f143141c = 0;
        this.f143142d = 0;
        this.f143143e = 0;
        this.f143144f = Float.NaN;
        this.f143145g = Float.NaN;
        this.f143146h = Float.NaN;
        this.f143147i = Float.NaN;
        this.f143148j = Float.NaN;
        this.f143149k = Float.NaN;
        this.f143150l = Float.NaN;
        this.f143151m = Float.NaN;
        this.f143152n = Float.NaN;
        this.f143153o = Float.NaN;
        this.f143154p = Float.NaN;
        this.f143155q = 0;
        this.f143156r = new HashMap<>();
    }
}
