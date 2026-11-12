package w6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k extends d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f182867w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f182849e = 0.1f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f182850f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f182851g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f182852h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f182853i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f182854j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap<String, Method> f182855k = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f182856l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f182857m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f182858n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f182859o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f182860p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f182861q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f182862r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f182863s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f182864t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f182865u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f182866v = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f182868x = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f182869a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f182869a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }

        private a() {
        }
    }

    public k() {
        this.f182781d = new HashMap<>();
    }

    public static void h(RectF rectF, View view2, boolean z14) {
        rectF.top = view2.getTop();
        rectF.bottom = view2.getBottom();
        rectF.left = view2.getLeft();
        rectF.right = view2.getRight();
        if (z14) {
            view2.getMatrix().mapRect(rectF);
        }
    }

    @Override // w6.d
    /* JADX INFO: renamed from: a */
    public final d clone() {
        k kVar = new k();
        super.b(this);
        kVar.f182856l = this.f182856l;
        kVar.f182857m = this.f182857m;
        kVar.f182858n = this.f182858n;
        kVar.f182859o = this.f182859o;
        kVar.f182860p = this.f182860p;
        kVar.f182861q = this.f182861q;
        kVar.f182862r = this.f182862r;
        kVar.f182849e = this.f182849e;
        kVar.f182863s = this.f182863s;
        kVar.f182864t = this.f182864t;
        kVar.f182865u = this.f182865u;
        kVar.f182866v = this.f182866v;
        kVar.f182867w = this.f182867w;
        kVar.f182868x = this.f182868x;
        kVar.f182853i = this.f182853i;
        kVar.f182854j = this.f182854j;
        kVar.f182855k = this.f182855k;
        return kVar;
    }

    @Override // w6.d
    public final void c(HashSet<String> hashSet) {
    }

    @Override // w6.d
    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f6319k);
        SparseIntArray sparseIntArray = a.f182869a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            SparseIntArray sparseIntArray2 = a.f182869a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f182858n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f182859o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f182856l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f182849e = typedArrayObtainStyledAttributes.getFloat(index, this.f182849e);
                    break;
                case 6:
                    this.f182860p = typedArrayObtainStyledAttributes.getResourceId(index, this.f182860p);
                    break;
                case 7:
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
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f182778a);
                    this.f182778a = integer;
                    this.f182866v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f182861q = typedArrayObtainStyledAttributes.getResourceId(index, this.f182861q);
                    break;
                case 10:
                    this.f182868x = typedArrayObtainStyledAttributes.getBoolean(index, this.f182868x);
                    break;
                case 11:
                    this.f182857m = typedArrayObtainStyledAttributes.getResourceId(index, this.f182857m);
                    break;
                case 12:
                    this.f182852h = typedArrayObtainStyledAttributes.getResourceId(index, this.f182852h);
                    break;
                case 13:
                    this.f182850f = typedArrayObtainStyledAttributes.getResourceId(index, this.f182850f);
                    break;
                case 14:
                    this.f182851g = typedArrayObtainStyledAttributes.getResourceId(index, this.f182851g);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    public final void f(float f14, View view2) {
        boolean z14;
        boolean z15;
        float f15;
        boolean z16;
        boolean z17;
        float f16;
        float f17;
        float f18;
        boolean z18;
        boolean z19;
        boolean z24 = true;
        boolean z25 = false;
        if (this.f182861q != -1) {
            if (this.f182862r == null) {
                this.f182862r = ((ViewGroup) view2.getParent()).findViewById(this.f182861q);
            }
            h(this.f182853i, this.f182862r, this.f182868x);
            h(this.f182854j, view2, this.f182868x);
            boolean zIntersect = this.f182853i.intersect(this.f182854j);
            boolean z26 = this.f182863s;
            if (zIntersect) {
                if (z26) {
                    this.f182863s = false;
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.f182865u) {
                    this.f182865u = false;
                    z19 = true;
                } else {
                    z19 = false;
                }
                this.f182864t = true;
            } else {
                if (z26) {
                    z14 = false;
                } else {
                    this.f182863s = true;
                    z14 = true;
                }
                if (this.f182864t) {
                    this.f182864t = false;
                    z18 = true;
                } else {
                    z18 = false;
                }
                this.f182865u = true;
                boolean z27 = z18;
                z19 = false;
                z25 = z27;
            }
            z24 = z19;
        } else {
            boolean z28 = this.f182863s;
            float f19 = this.f182866v;
            if (z28) {
                if ((this.f182867w - f19) * (f14 - f19) < 0.0f) {
                    this.f182863s = false;
                    z14 = true;
                }
                z15 = this.f182864t;
                f15 = this.f182866v;
                if (z15) {
                    f18 = f14 - f15;
                    if ((this.f182867w - f15) * f18 >= 0.0f && f18 < 0.0f) {
                        this.f182864t = false;
                        z16 = true;
                    }
                    z17 = this.f182865u;
                    f16 = this.f182866v;
                    if (z17) {
                        f17 = f14 - f16;
                        if ((this.f182867w - f16) * f17 >= 0.0f && f17 > 0.0f) {
                            this.f182865u = false;
                        }
                        z25 = z16;
                    } else if (Math.abs(f14 - f16) > this.f182849e) {
                        this.f182865u = true;
                    }
                    z24 = false;
                    z25 = z16;
                } else if (Math.abs(f14 - f15) > this.f182849e) {
                    this.f182864t = true;
                }
                z16 = false;
                z17 = this.f182865u;
                f16 = this.f182866v;
                if (z17) {
                    f17 = f14 - f16;
                    if ((this.f182867w - f16) * f17 >= 0.0f) {
                    }
                    z25 = z16;
                } else if (Math.abs(f14 - f16) > this.f182849e) {
                    this.f182865u = true;
                }
                z24 = false;
                z25 = z16;
            } else if (Math.abs(f14 - f19) > this.f182849e) {
                this.f182863s = true;
            }
            z14 = false;
            z15 = this.f182864t;
            f15 = this.f182866v;
            if (z15) {
                f18 = f14 - f15;
                if ((this.f182867w - f15) * f18 >= 0.0f) {
                }
                z17 = this.f182865u;
                f16 = this.f182866v;
                if (z17) {
                    f17 = f14 - f16;
                    if ((this.f182867w - f16) * f17 >= 0.0f) {
                    }
                    z25 = z16;
                } else if (Math.abs(f14 - f16) > this.f182849e) {
                    this.f182865u = true;
                }
                z24 = false;
                z25 = z16;
            } else if (Math.abs(f14 - f15) > this.f182849e) {
                this.f182864t = true;
            }
            z16 = false;
            z17 = this.f182865u;
            f16 = this.f182866v;
            if (z17) {
                f17 = f14 - f16;
                if ((this.f182867w - f16) * f17 >= 0.0f) {
                }
                z25 = z16;
            } else if (Math.abs(f14 - f16) > this.f182849e) {
                this.f182865u = true;
            }
            z24 = false;
            z25 = z16;
        }
        this.f182867w = f14;
        if (z25 || z14 || z24) {
            q qVar = (q) view2.getParent();
            q.i iVar = qVar.f182949v;
            CopyOnWriteArrayList<q.i> copyOnWriteArrayList = qVar.J0;
            if (copyOnWriteArrayList != null) {
                Iterator<q.i> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
        }
        View viewFindViewById = this.f182857m == -1 ? view2 : ((q) view2.getParent()).findViewById(this.f182857m);
        if (z25) {
            String str = this.f182858n;
            if (str != null) {
                g(viewFindViewById, str);
            }
            if (this.f182850f != -1) {
                ((q) view2.getParent()).D(this.f182850f, viewFindViewById);
            }
        }
        if (z24) {
            String str2 = this.f182859o;
            if (str2 != null) {
                g(viewFindViewById, str2);
            }
            if (this.f182851g != -1) {
                ((q) view2.getParent()).D(this.f182851g, viewFindViewById);
            }
        }
        if (z14) {
            String str3 = this.f182856l;
            if (str3 != null) {
                g(viewFindViewById, str3);
            }
            if (this.f182852h != -1) {
                ((q) view2.getParent()).D(this.f182852h, viewFindViewById);
            }
        }
    }

    public final void g(View view2, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f182855k.containsKey(str)) {
                method = this.f182855k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view2.getClass().getMethod(str, null);
                    this.f182855k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f182855k.put(str, null);
                    view2.getClass();
                    w6.a.c(view2);
                    return;
                }
            }
            try {
                method.invoke(view2, null);
                return;
            } catch (Exception unused2) {
                view2.getClass();
                w6.a.c(view2);
                return;
            }
        }
        boolean z14 = str.length() == 1;
        if (!z14) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f182781d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z14 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.f182781d.get(str2);
                if (aVar != null) {
                    Class<?> cls = view2.getClass();
                    String strN = aVar.f6150b;
                    if (!aVar.f6149a) {
                        strN = fb1.c.n("set", strN);
                    }
                    try {
                        int iOrdinal = aVar.f6151c.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strN, cls2).invoke(view2, Integer.valueOf(aVar.f6152d));
                                break;
                            case 1:
                                cls.getMethod(strN, cls3).invoke(view2, Float.valueOf(aVar.f6153e));
                                break;
                            case 2:
                                cls.getMethod(strN, cls2).invoke(view2, Integer.valueOf(aVar.f6156h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strN, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(aVar.f6156h);
                                method2.invoke(view2, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strN, CharSequence.class).invoke(view2, aVar.f6154f);
                                break;
                            case 5:
                                cls.getMethod(strN, Boolean.TYPE).invoke(view2, Boolean.valueOf(aVar.f6155g));
                                break;
                            case 6:
                                cls.getMethod(strN, cls3).invoke(view2, Float.valueOf(aVar.f6153e));
                                break;
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                    }
                }
            }
        }
    }
}
