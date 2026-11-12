package w6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class j extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f182832e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f182833f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f182834g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f182835h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f182836i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f182837j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f182838k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f182839l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f182840m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f182841n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f182842o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f182843p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f182844q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f182845r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f182846s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f182847t = 0.0f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f182848a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f182848a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }

        private a() {
        }
    }

    public j() {
        this.f182781d = new HashMap<>();
    }

    @Override // w6.d
    /* JADX INFO: renamed from: a */
    public final d clone() {
        j jVar = new j();
        super.b(this);
        jVar.f182832e = this.f182832e;
        jVar.f182845r = this.f182845r;
        jVar.f182846s = this.f182846s;
        jVar.f182847t = this.f182847t;
        jVar.f182844q = this.f182844q;
        jVar.f182833f = this.f182833f;
        jVar.f182834g = this.f182834g;
        jVar.f182835h = this.f182835h;
        jVar.f182838k = this.f182838k;
        jVar.f182836i = this.f182836i;
        jVar.f182837j = this.f182837j;
        jVar.f182839l = this.f182839l;
        jVar.f182840m = this.f182840m;
        jVar.f182841n = this.f182841n;
        jVar.f182842o = this.f182842o;
        jVar.f182843p = this.f182843p;
        return jVar;
    }

    @Override // w6.d
    public final void c(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f182833f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f182834g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f182835h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f182836i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f182837j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f182841n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f182842o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f182843p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f182838k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f182839l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f182840m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f182844q)) {
            hashSet.add("progress");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f6318j);
        SparseIntArray sparseIntArray = a.f182848a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            SparseIntArray sparseIntArray2 = a.f182848a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f182833f = typedArrayObtainStyledAttributes.getFloat(index, this.f182833f);
                    break;
                case 2:
                    this.f182834g = typedArrayObtainStyledAttributes.getDimension(index, this.f182834g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f182835h = typedArrayObtainStyledAttributes.getFloat(index, this.f182835h);
                    break;
                case 5:
                    this.f182836i = typedArrayObtainStyledAttributes.getFloat(index, this.f182836i);
                    break;
                case 6:
                    this.f182837j = typedArrayObtainStyledAttributes.getFloat(index, this.f182837j);
                    break;
                case 7:
                    this.f182839l = typedArrayObtainStyledAttributes.getFloat(index, this.f182839l);
                    break;
                case 8:
                    this.f182838k = typedArrayObtainStyledAttributes.getFloat(index, this.f182838k);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f182778a = typedArrayObtainStyledAttributes.getInt(index, this.f182778a);
                    break;
                case 13:
                    this.f182832e = typedArrayObtainStyledAttributes.getInteger(index, this.f182832e);
                    break;
                case 14:
                    this.f182840m = typedArrayObtainStyledAttributes.getFloat(index, this.f182840m);
                    break;
                case 15:
                    this.f182841n = typedArrayObtainStyledAttributes.getDimension(index, this.f182841n);
                    break;
                case 16:
                    this.f182842o = typedArrayObtainStyledAttributes.getDimension(index, this.f182842o);
                    break;
                case 17:
                    this.f182843p = typedArrayObtainStyledAttributes.getDimension(index, this.f182843p);
                    break;
                case 18:
                    this.f182844q = typedArrayObtainStyledAttributes.getFloat(index, this.f182844q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f182845r = 7;
                    } else {
                        this.f182845r = typedArrayObtainStyledAttributes.getInt(index, this.f182845r);
                    }
                    break;
                case 20:
                    this.f182846s = typedArrayObtainStyledAttributes.getFloat(index, this.f182846s);
                    break;
                case 21:
                    int i15 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f14 = this.f182847t;
                    if (i15 == 5) {
                        this.f182847t = typedArrayObtainStyledAttributes.getDimension(index, f14);
                    } else {
                        this.f182847t = typedArrayObtainStyledAttributes.getFloat(index, f14);
                    }
                    break;
            }
        }
    }

    @Override // w6.d
    public final void e(HashMap<String, Integer> map) {
        if (this.f182832e == -1) {
            return;
        }
        if (!Float.isNaN(this.f182833f)) {
            map.put("alpha", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182834g)) {
            map.put("elevation", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182835h)) {
            map.put("rotation", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182836i)) {
            map.put("rotationX", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182837j)) {
            map.put("rotationY", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182841n)) {
            map.put("translationX", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182842o)) {
            map.put("translationY", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182843p)) {
            map.put("translationZ", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182838k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182839l)) {
            map.put("scaleX", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182839l)) {
            map.put("scaleY", Integer.valueOf(this.f182832e));
        }
        if (!Float.isNaN(this.f182844q)) {
            map.put("progress", Integer.valueOf(this.f182832e));
        }
        if (this.f182781d.size() > 0) {
            Iterator<String> it = this.f182781d.keySet().iterator();
            while (it.hasNext()) {
                map.put(fb1.c.n("CUSTOM,", it.next()), Integer.valueOf(this.f182832e));
            }
        }
    }
}
