package w6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public class h extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f182820f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f182821g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f182822h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f182823i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f182824j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f182825k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f182826l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f182827m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f182828n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f182829o = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f182830a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f182830a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }

        private a() {
        }
    }

    @Override // w6.d
    /* JADX INFO: renamed from: a */
    public final d clone() {
        h hVar = new h();
        super.b(this);
        hVar.f182820f = this.f182820f;
        hVar.f182821g = this.f182821g;
        hVar.f182822h = this.f182822h;
        hVar.f182823i = this.f182823i;
        hVar.f182824j = Float.NaN;
        hVar.f182825k = this.f182825k;
        hVar.f182826l = this.f182826l;
        hVar.f182827m = this.f182827m;
        hVar.f182828n = this.f182828n;
        return hVar;
    }

    @Override // w6.d
    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f6317i);
        SparseIntArray sparseIntArray = a.f182830a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            SparseIntArray sparseIntArray2 = a.f182830a;
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
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f182820f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f182820f = o6.c.f129461c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f182831e = typedArrayObtainStyledAttributes.getInteger(index, this.f182831e);
                    break;
                case 5:
                    this.f182822h = typedArrayObtainStyledAttributes.getInt(index, this.f182822h);
                    break;
                case 6:
                    this.f182825k = typedArrayObtainStyledAttributes.getFloat(index, this.f182825k);
                    break;
                case 7:
                    this.f182826l = typedArrayObtainStyledAttributes.getFloat(index, this.f182826l);
                    break;
                case 8:
                    float f14 = typedArrayObtainStyledAttributes.getFloat(index, this.f182824j);
                    this.f182823i = f14;
                    this.f182824j = f14;
                    break;
                case 9:
                    this.f182829o = typedArrayObtainStyledAttributes.getInt(index, this.f182829o);
                    break;
                case 10:
                    this.f182821g = typedArrayObtainStyledAttributes.getInt(index, this.f182821g);
                    break;
                case 11:
                    this.f182823i = typedArrayObtainStyledAttributes.getFloat(index, this.f182823i);
                    break;
                case 12:
                    this.f182824j = typedArrayObtainStyledAttributes.getFloat(index, this.f182824j);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }
}
