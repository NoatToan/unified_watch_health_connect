package w6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f182782e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f182783f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f182784g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f182785h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f182786i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f182787j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f182788k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f182789l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f182790m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f182791n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f182792o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f182793p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f182794q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f182795r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f182796s = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f182797a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f182797a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }

        private a() {
        }
    }

    public e() {
        this.f182781d = new HashMap<>();
    }

    @Override // w6.d
    /* JADX INFO: renamed from: a */
    public final d clone() {
        e eVar = new e();
        super.b(this);
        eVar.f182782e = this.f182782e;
        eVar.f182783f = this.f182783f;
        eVar.f182784g = this.f182784g;
        eVar.f182785h = this.f182785h;
        eVar.f182786i = this.f182786i;
        eVar.f182787j = this.f182787j;
        eVar.f182788k = this.f182788k;
        eVar.f182789l = this.f182789l;
        eVar.f182790m = this.f182790m;
        eVar.f182791n = this.f182791n;
        eVar.f182792o = this.f182792o;
        eVar.f182793p = this.f182793p;
        eVar.f182794q = this.f182794q;
        eVar.f182795r = this.f182795r;
        eVar.f182796s = this.f182796s;
        return eVar;
    }

    @Override // w6.d
    public final void c(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f182783f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f182784g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f182785h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f182786i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f182787j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f182788k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f182789l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f182793p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f182794q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f182795r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f182790m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f182791n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f182792o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f182796s)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f6315g);
        SparseIntArray sparseIntArray = a.f182797a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            SparseIntArray sparseIntArray2 = a.f182797a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f182783f = typedArrayObtainStyledAttributes.getFloat(index, this.f182783f);
                    break;
                case 2:
                    this.f182784g = typedArrayObtainStyledAttributes.getDimension(index, this.f182784g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f182785h = typedArrayObtainStyledAttributes.getFloat(index, this.f182785h);
                    break;
                case 5:
                    this.f182786i = typedArrayObtainStyledAttributes.getFloat(index, this.f182786i);
                    break;
                case 6:
                    this.f182787j = typedArrayObtainStyledAttributes.getFloat(index, this.f182787j);
                    break;
                case 7:
                    this.f182791n = typedArrayObtainStyledAttributes.getFloat(index, this.f182791n);
                    break;
                case 8:
                    this.f182790m = typedArrayObtainStyledAttributes.getFloat(index, this.f182790m);
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
                    this.f182782e = typedArrayObtainStyledAttributes.getInteger(index, this.f182782e);
                    break;
                case 14:
                    this.f182792o = typedArrayObtainStyledAttributes.getFloat(index, this.f182792o);
                    break;
                case 15:
                    this.f182793p = typedArrayObtainStyledAttributes.getDimension(index, this.f182793p);
                    break;
                case 16:
                    this.f182794q = typedArrayObtainStyledAttributes.getDimension(index, this.f182794q);
                    break;
                case 17:
                    this.f182795r = typedArrayObtainStyledAttributes.getDimension(index, this.f182795r);
                    break;
                case 18:
                    this.f182796s = typedArrayObtainStyledAttributes.getFloat(index, this.f182796s);
                    break;
                case 19:
                    this.f182788k = typedArrayObtainStyledAttributes.getDimension(index, this.f182788k);
                    break;
                case 20:
                    this.f182789l = typedArrayObtainStyledAttributes.getDimension(index, this.f182789l);
                    break;
            }
        }
    }

    @Override // w6.d
    public final void e(HashMap<String, Integer> map) {
        if (this.f182782e == -1) {
            return;
        }
        if (!Float.isNaN(this.f182783f)) {
            map.put("alpha", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182784g)) {
            map.put("elevation", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182785h)) {
            map.put("rotation", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182786i)) {
            map.put("rotationX", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182787j)) {
            map.put("rotationY", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182788k)) {
            map.put("transformPivotX", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182789l)) {
            map.put("transformPivotY", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182793p)) {
            map.put("translationX", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182794q)) {
            map.put("translationY", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182795r)) {
            map.put("translationZ", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182790m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182791n)) {
            map.put("scaleX", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182792o)) {
            map.put("scaleY", Integer.valueOf(this.f182782e));
        }
        if (!Float.isNaN(this.f182796s)) {
            map.put("progress", Integer.valueOf(this.f182782e));
        }
        if (this.f182781d.size() > 0) {
            Iterator<String> it = this.f182781d.keySet().iterator();
            while (it.hasNext()) {
                map.put(fb1.c.n("CUSTOM,", it.next()), Integer.valueOf(this.f182782e));
            }
        }
    }
}
