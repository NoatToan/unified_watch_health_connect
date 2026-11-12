package v0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.l0;
import j0.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f174145h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f174146i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f174147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rational f174148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f174149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<b3<?>> f174150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.k f174151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f174152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f174153g;

    public static class a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rational f174154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f174155b;

        public a(Rational rational, boolean z14) {
            this.f174154a = rational;
            this.f174155b = z14;
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational2;
            int i14 = b.f174146i;
            float fFloatValue = rational.floatValue();
            Rational rational4 = this.f174154a;
            float fFloatValue2 = rational4.floatValue();
            float f14 = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
            float fFloatValue3 = rational3.floatValue();
            float fFloatValue4 = rational4.floatValue();
            float f15 = fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4;
            return this.f174155b ? Float.compare(f15, f14) : Float.compare(f14, f15);
        }
    }

    public b(Size size, k0 k0Var, Set<b3<?>> set, m0.k kVar) {
        this.f174153g = new HashMap();
        this.f174147a = size;
        Rational rational = ((double) size.getWidth()) / ((double) size.getHeight()) > f174145h ? j0.a.f95904c : j0.a.f95902a;
        size.toString();
        Objects.toString(rational);
        this.f174148b = rational;
        Rational rational2 = j0.a.f95902a;
        if (rational.equals(rational2)) {
            rational2 = j0.a.f95904c;
        } else if (!rational.equals(j0.a.f95904c)) {
            com.google.firebase.messaging.l.j(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.f174149c = rational2;
        this.f174152f = k0Var;
        this.f174150d = set;
        this.f174151e = kVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalH = h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalH2 = h(size);
        if (rationalH.floatValue() == rationalH2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalH.floatValue() > rationalH2.floatValue()) {
                float f14 = width;
                float fFloatValue = f14 / rationalH.floatValue();
                float f15 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f15, f14, fFloatValue + f15);
            } else {
                float f16 = height;
                float fFloatValue2 = rationalH.floatValue() * f16;
                float f17 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f17, 0.0f, fFloatValue2 + f17, f16);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean d(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final v0.a b(b3<?> b3Var, Rect rect, int i14, boolean z14) {
        boolean z15;
        Size next;
        Size size;
        Pair pairCreate;
        if (v.d(i14)) {
            z15 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z15 = false;
        }
        if (z14) {
            Size sizeG = v.g(rect);
            Iterator<Size> it = c(b3Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeG, sizeG);
                    break;
                }
                Size next2 = it.next();
                Size sizeG2 = v.g(a(next2, sizeG));
                if (!d(sizeG2, sizeG)) {
                    pairCreate = Pair.create(next2, sizeG2);
                    break;
                }
            }
            next = (Size) pairCreate.first;
            size = (Size) pairCreate.second;
        } else {
            Size sizeG3 = v.g(rect);
            List<Size> listC = c(b3Var);
            Iterator<Size> it3 = listC.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    Iterator<Size> it4 = listC.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = sizeG3;
                            break;
                        }
                        next = it4.next();
                    } while (d(next, sizeG3));
                } else {
                    Size next3 = it3.next();
                    Rational rationalH = j0.a.f95902a;
                    Size size2 = q0.c.f141973c;
                    if (!j0.a.a(sizeG3, rationalH, size2)) {
                        rationalH = j0.a.f95904c;
                        if (!j0.a.a(sizeG3, rationalH, size2)) {
                            rationalH = h(sizeG3);
                        }
                    }
                    if (!e(rationalH, next3) && !d(next3, sizeG3)) {
                        next = next3;
                        break;
                    }
                }
            }
            rect = a(sizeG3, next);
            size = next;
        }
        v0.a aVar = new v0.a(rect, size, next);
        if (!z15) {
            return aVar;
        }
        Rect rect2 = aVar.f174142a;
        Rect rect3 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
        Size size3 = aVar.f174143b;
        return new v0.a(rect3, new Size(size3.getHeight(), size3.getWidth()), aVar.f174144c);
    }

    public final List<Size> c(b3<?> b3Var) {
        Rational rationalH;
        if (!this.f174150d.contains(b3Var)) {
            com.google.firebase.messaging.l.j(b3Var, "Invalid child config: ");
            return null;
        }
        HashMap map = this.f174153g;
        if (map.containsKey(b3Var)) {
            List<Size> list = (List) map.get(b3Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listB = this.f174151e.b(b3Var);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : (ArrayList) listB) {
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalH = null;
                    break;
                }
                rationalH = (Rational) it.next();
                Rational rational = j0.a.f95902a;
            } while (!j0.a.a(size, rationalH, q0.c.f141973c));
            if (rationalH != null) {
                Size size2 = (Size) map2.get(rationalH);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalH = h(size);
            }
            arrayList.add(size);
            map2.put(rationalH, size);
        }
        map.put(b3Var, arrayList);
        return arrayList;
    }

    public final boolean e(Rational rational, Size size) {
        Rational rational2 = this.f174148b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = j0.a.f95902a;
        Size size2 = q0.c.f141973c;
        if (j0.a.a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalH = j0.a.f95902a;
        if (!j0.a.a(size, rationalH, size2)) {
            rationalH = j0.a.f95904c;
            if (!j0.a.a(size, rationalH, size2)) {
                rationalH = h(size);
            }
        }
        float fFloatValue3 = rationalH.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 < fFloatValue3;
        }
        return fFloatValue2 > fFloatValue3;
    }

    public final ArrayList f(List list, boolean z14) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = j0.a.f95902a;
        map.put(rational, new ArrayList());
        Rational rational2 = j0.a.f95904c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it3.next();
                    if (j0.a.a(size, rational3, q0.c.f141973c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalH = h(size);
                    arrayList2.add(rationalH);
                    map.put(rationalH, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new a(h(this.f174147a), true));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(j0.a.f95904c) && !rational4.equals(j0.a.f95902a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(g(rational4, list2, z14));
            }
        }
        return arrayList4;
    }

    public final ArrayList g(Rational rational, List list, boolean z14) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = j0.a.f95902a;
            if (j0.a.a(size, rational, q0.c.f141973c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new j0.e(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator<b3<?>> it3 = this.f174150d.iterator();
        while (it3.hasNext()) {
            List<Size> listC = c(it3.next());
            if (!z14) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listC) {
                    if (!e(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listC = arrayList3;
            }
            if (listC.isEmpty()) {
                return new ArrayList();
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator<Size> it4 = listC.iterator();
                    while (it4.hasNext()) {
                        if (!d(it4.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator<Size> it5 = listC.iterator();
                    do {
                        if (!it5.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                    } while (!d(it5.next(), size4));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }

    private b(Size size, k0 k0Var, Set<b3<?>> set) {
        this(size, k0Var, set, new m0.k(k0Var, size));
    }

    public b(l0 l0Var, Set<b3<?>> set) {
        this(v.g(l0Var.c().t()), l0Var.c(), set);
    }
}
