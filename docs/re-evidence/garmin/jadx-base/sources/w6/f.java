package w6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f182798e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f182799f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f182800g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f182801h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f182802i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f182803j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f182804k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f182805l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f182806m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f182807n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f182808o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f182809p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f182810q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f182811r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f182812s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f182813t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f182814u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f182815v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f182816w = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f182817a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f182817a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }

        private a() {
        }
    }

    public f() {
        this.f182781d = new HashMap<>();
    }

    @Override // w6.d
    /* JADX INFO: renamed from: a */
    public final d clone() {
        f fVar = new f();
        super.b(this);
        fVar.f182798e = this.f182798e;
        fVar.f182799f = this.f182799f;
        fVar.f182800g = this.f182800g;
        fVar.f182801h = this.f182801h;
        fVar.f182802i = this.f182802i;
        fVar.f182803j = this.f182803j;
        fVar.f182804k = this.f182804k;
        fVar.f182805l = this.f182805l;
        fVar.f182806m = this.f182806m;
        fVar.f182807n = this.f182807n;
        fVar.f182808o = this.f182808o;
        fVar.f182809p = this.f182809p;
        fVar.f182810q = this.f182810q;
        fVar.f182811r = this.f182811r;
        fVar.f182812s = this.f182812s;
        fVar.f182813t = this.f182813t;
        fVar.f182814u = this.f182814u;
        fVar.f182815v = this.f182815v;
        fVar.f182816w = this.f182816w;
        return fVar;
    }

    @Override // w6.d
    public final void c(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f182806m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f182807n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f182808o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f182810q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f182811r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f182812s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f182813t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f182809p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f182814u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f182815v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f182816w)) {
            hashSet.add("translationZ");
        }
        if (this.f182781d.size() > 0) {
            Iterator<String> it = this.f182781d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // w6.d
    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f6316h);
        SparseIntArray sparseIntArray = a.f182817a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            SparseIntArray sparseIntArray2 = a.f182817a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (q.f182918k1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f182779b);
                        this.f182779b = resourceId;
                        if (resourceId == -1) {
                            this.f182780c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f182780c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f182779b = typedArrayObtainStyledAttributes.getResourceId(index, this.f182779b);
                    }
                    break;
                case 2:
                    this.f182778a = typedArrayObtainStyledAttributes.getInt(index, this.f182778a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f182798e = typedArrayObtainStyledAttributes.getInteger(index, this.f182798e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f182800g = typedArrayObtainStyledAttributes.getString(index);
                        this.f182799f = 7;
                    } else {
                        this.f182799f = typedArrayObtainStyledAttributes.getInt(index, this.f182799f);
                    }
                    break;
                case 6:
                    this.f182801h = typedArrayObtainStyledAttributes.getFloat(index, this.f182801h);
                    break;
                case 7:
                    int i15 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f14 = this.f182802i;
                    if (i15 == 5) {
                        this.f182802i = typedArrayObtainStyledAttributes.getDimension(index, f14);
                    } else {
                        this.f182802i = typedArrayObtainStyledAttributes.getFloat(index, f14);
                    }
                    break;
                case 8:
                    this.f182805l = typedArrayObtainStyledAttributes.getInt(index, this.f182805l);
                    break;
                case 9:
                    this.f182806m = typedArrayObtainStyledAttributes.getFloat(index, this.f182806m);
                    break;
                case 10:
                    this.f182807n = typedArrayObtainStyledAttributes.getDimension(index, this.f182807n);
                    break;
                case 11:
                    this.f182808o = typedArrayObtainStyledAttributes.getFloat(index, this.f182808o);
                    break;
                case 12:
                    this.f182810q = typedArrayObtainStyledAttributes.getFloat(index, this.f182810q);
                    break;
                case 13:
                    this.f182811r = typedArrayObtainStyledAttributes.getFloat(index, this.f182811r);
                    break;
                case 14:
                    this.f182809p = typedArrayObtainStyledAttributes.getFloat(index, this.f182809p);
                    break;
                case 15:
                    this.f182812s = typedArrayObtainStyledAttributes.getFloat(index, this.f182812s);
                    break;
                case 16:
                    this.f182813t = typedArrayObtainStyledAttributes.getFloat(index, this.f182813t);
                    break;
                case 17:
                    this.f182814u = typedArrayObtainStyledAttributes.getDimension(index, this.f182814u);
                    break;
                case 18:
                    this.f182815v = typedArrayObtainStyledAttributes.getDimension(index, this.f182815v);
                    break;
                case 19:
                    this.f182816w = typedArrayObtainStyledAttributes.getDimension(index, this.f182816w);
                    break;
                case 20:
                    this.f182804k = typedArrayObtainStyledAttributes.getFloat(index, this.f182804k);
                    break;
                case 21:
                    this.f182803j = typedArrayObtainStyledAttributes.getFloat(index, this.f182803j) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }
}
