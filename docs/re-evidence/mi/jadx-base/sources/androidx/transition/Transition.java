package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import defpackage.a0q;
import defpackage.amo;
import defpackage.byq;
import defpackage.d0q;
import defpackage.ed1;
import defpackage.f0q;
import defpackage.gv5;
import defpackage.p5q;
import defpackage.vkr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public static final int[] G = {2, 1, 3, 4};
    public static final PathMotion H = new a();
    public static ThreadLocal<ArrayMap<Animator, d>> I = new ThreadLocal<>();
    public a0q C;
    public e D;
    public ArrayMap<String, String> E;
    public ArrayList<d0q> t;
    public ArrayList<d0q> u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3052a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3053b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public ArrayList<Integer> e = new ArrayList<>();
    public ArrayList<View> f = new ArrayList<>();
    public ArrayList<String> g = null;
    public ArrayList<Class<?>> h = null;
    public ArrayList<Integer> i = null;
    public ArrayList<View> j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<Class<?>> f3054k = null;
    public ArrayList<String> l = null;
    public ArrayList<Integer> m = null;
    public ArrayList<View> n = null;
    public ArrayList<Class<?>> o = null;
    public f0q p = new f0q();
    public f0q q = new f0q();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TransitionSet f3055r = null;
    public int[] s = G;
    public boolean v = false;
    public ArrayList<Animator> w = new ArrayList<>();
    public int x = 0;
    public boolean y = false;
    public boolean z = false;
    public ArrayList<f> A = null;
    public ArrayList<Animator> B = new ArrayList<>();
    public PathMotion F = H;

    public class a extends PathMotion {
        @Override // androidx.transition.PathMotion
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayMap f3056a;

        public b(ArrayMap arrayMap) {
            this.f3056a = arrayMap;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3056a.remove(animator);
            Transition.this.w.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.w.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.r();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f3059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3060b;
        public d0q c;
        public vkr d;
        public Transition e;

        public d(View view, String str, Transition transition, vkr vkrVar, d0q d0qVar) {
            this.f3059a = view;
            this.f3060b = str;
            this.c = d0qVar;
            this.d = vkrVar;
            this.e = transition;
        }
    }

    public static abstract class e {
        public abstract Rect a(Transition transition);
    }

    public interface f {
        void a(Transition transition);

        void b(Transition transition);

        void c(Transition transition);

        void d(Transition transition);

        void e(Transition transition);
    }

    public Transition() {
    }

    public static ArrayMap<Animator, d> A() {
        ArrayMap<Animator, d> arrayMap = I.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, d> arrayMap2 = new ArrayMap<>();
        I.set(arrayMap2);
        return arrayMap2;
    }

    public static boolean K(int i) {
        return i >= 1 && i <= 4;
    }

    public static boolean M(d0q d0qVar, d0q d0qVar2, String str) {
        Object obj = d0qVar.f14937a.get(str);
        Object obj2 = d0qVar2.f14937a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static int[] T(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    public static void d(f0q f0qVar, View view, d0q d0qVar) {
        f0qVar.f17272a.put(view, d0qVar);
        int id = view.getId();
        if (id >= 0) {
            if (f0qVar.f17273b.indexOfKey(id) >= 0) {
                f0qVar.f17273b.put(id, null);
            } else {
                f0qVar.f17273b.put(id, view);
            }
        }
        String strJ = androidx.core.view.c.J(view);
        if (strJ != null) {
            if (f0qVar.d.containsKey(strJ)) {
                f0qVar.d.put(strJ, null);
            } else {
                f0qVar.d.put(strJ, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (f0qVar.c.indexOfKey(itemIdAtPosition) < 0) {
                    androidx.core.view.c.B0(view, true);
                    f0qVar.c.put(itemIdAtPosition, view);
                    return;
                }
                View view2 = f0qVar.c.get(itemIdAtPosition);
                if (view2 != null) {
                    androidx.core.view.c.B0(view2, false);
                    f0qVar.c.put(itemIdAtPosition, null);
                }
            }
        }
    }

    public static boolean e(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public long B() {
        return this.f3053b;
    }

    public List<Integer> C() {
        return this.e;
    }

    public List<String> D() {
        return this.g;
    }

    public List<Class<?>> F() {
        return this.h;
    }

    public List<View> G() {
        return this.f;
    }

    public String[] H() {
        return null;
    }

    public d0q I(View view, boolean z) {
        TransitionSet transitionSet = this.f3055r;
        if (transitionSet != null) {
            return transitionSet.I(view, z);
        }
        return (z ? this.p : this.q).f17272a.get(view);
    }

    public boolean J(d0q d0qVar, d0q d0qVar2) {
        if (d0qVar == null || d0qVar2 == null) {
            return false;
        }
        String[] strArrH = H();
        if (strArrH == null) {
            Iterator<String> it = d0qVar.f14937a.keySet().iterator();
            while (it.hasNext()) {
                if (M(d0qVar, d0qVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrH) {
            if (!M(d0qVar, d0qVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean L(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f3054k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f3054k.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.l != null && androidx.core.view.c.J(view) != null && this.l.contains(androidx.core.view.c.J(view))) {
            return false;
        }
        if ((this.e.size() == 0 && this.f.size() == 0 && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.g) == null || arrayList2.isEmpty()))) || this.e.contains(Integer.valueOf(id)) || this.f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.g;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.c.J(view))) {
            return true;
        }
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (this.h.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void N(ArrayMap<View, d0q> arrayMap, ArrayMap<View, d0q> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && L(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && L(view)) {
                d0q d0qVar = arrayMap.get(viewValueAt);
                d0q d0qVar2 = arrayMap2.get(view);
                if (d0qVar != null && d0qVar2 != null) {
                    this.t.add(d0qVar);
                    this.u.add(d0qVar2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    public final void O(ArrayMap<View, d0q> arrayMap, ArrayMap<View, d0q> arrayMap2) {
        d0q d0qVarRemove;
        for (int size = arrayMap.getSize() - 1; size >= 0; size--) {
            View viewKeyAt = arrayMap.keyAt(size);
            if (viewKeyAt != null && L(viewKeyAt) && (d0qVarRemove = arrayMap2.remove(viewKeyAt)) != null && L(d0qVarRemove.f14938b)) {
                this.t.add(arrayMap.removeAt(size));
                this.u.add(d0qVarRemove);
            }
        }
    }

    public final void Q(ArrayMap<View, d0q> arrayMap, ArrayMap<View, d0q> arrayMap2, LongSparseArray<View> longSparseArray, LongSparseArray<View> longSparseArray2) {
        View view;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = longSparseArray.valueAt(i);
            if (viewValueAt != null && L(viewValueAt) && (view = longSparseArray2.get(longSparseArray.keyAt(i))) != null && L(view)) {
                d0q d0qVar = arrayMap.get(viewValueAt);
                d0q d0qVar2 = arrayMap2.get(view);
                if (d0qVar != null && d0qVar2 != null) {
                    this.t.add(d0qVar);
                    this.u.add(d0qVar2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    public final void R(ArrayMap<View, d0q> arrayMap, ArrayMap<View, d0q> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
        View view;
        int size = arrayMap3.getSize();
        for (int i = 0; i < size; i++) {
            View viewValueAt = arrayMap3.valueAt(i);
            if (viewValueAt != null && L(viewValueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i))) != null && L(view)) {
                d0q d0qVar = arrayMap.get(viewValueAt);
                d0q d0qVar2 = arrayMap2.get(view);
                if (d0qVar != null && d0qVar2 != null) {
                    this.t.add(d0qVar);
                    this.u.add(d0qVar2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    public final void S(f0q f0qVar, f0q f0qVar2) {
        ArrayMap<View, d0q> arrayMap = new ArrayMap<>(f0qVar.f17272a);
        ArrayMap<View, d0q> arrayMap2 = new ArrayMap<>(f0qVar2.f17272a);
        int i = 0;
        while (true) {
            int[] iArr = this.s;
            if (i >= iArr.length) {
                c(arrayMap, arrayMap2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                O(arrayMap, arrayMap2);
            } else if (i2 == 2) {
                R(arrayMap, arrayMap2, f0qVar.d, f0qVar2.d);
            } else if (i2 == 3) {
                N(arrayMap, arrayMap2, f0qVar.f17273b, f0qVar2.f17273b);
            } else if (i2 == 4) {
                Q(arrayMap, arrayMap2, f0qVar.c, f0qVar2.c);
            }
            i++;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void U(View view) {
        if (this.z) {
            return;
        }
        for (int size = this.w.size() - 1; size >= 0; size--) {
            ed1.b(this.w.get(size));
        }
        ArrayList<f> arrayList = this.A;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.A.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((f) arrayList2.get(i)).c(this);
            }
        }
        this.y = true;
    }

    public void V(ViewGroup viewGroup) {
        d dVar;
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        S(this.p, this.q);
        ArrayMap<Animator, d> arrayMapA = A();
        int size = arrayMapA.getSize();
        vkr vkrVarD = byq.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animatorKeyAt = arrayMapA.keyAt(i);
            if (animatorKeyAt != null && (dVar = arrayMapA.get(animatorKeyAt)) != null && dVar.f3059a != null && vkrVarD.equals(dVar.d)) {
                d0q d0qVar = dVar.c;
                View view = dVar.f3059a;
                d0q d0qVarI = I(view, true);
                d0q d0qVarW = w(view, true);
                if (d0qVarI == null && d0qVarW == null) {
                    d0qVarW = this.q.f17272a.get(view);
                }
                if ((d0qVarI != null || d0qVarW != null) && dVar.e.J(d0qVar, d0qVarW)) {
                    if (animatorKeyAt.isRunning() || animatorKeyAt.isStarted()) {
                        animatorKeyAt.cancel();
                    } else {
                        arrayMapA.remove(animatorKeyAt);
                    }
                }
            }
        }
        q(viewGroup, this.p, this.q, this.t, this.u);
        a0();
    }

    public Transition W(f fVar) {
        ArrayList<f> arrayList = this.A;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.A.size() == 0) {
            this.A = null;
        }
        return this;
    }

    public Transition X(View view) {
        this.f.remove(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void Y(View view) {
        if (this.y) {
            if (!this.z) {
                for (int size = this.w.size() - 1; size >= 0; size--) {
                    ed1.c(this.w.get(size));
                }
                ArrayList<f> arrayList = this.A;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.A.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((f) arrayList2.get(i)).a(this);
                    }
                }
            }
            this.y = false;
        }
    }

    public final void Z(Animator animator, ArrayMap<Animator, d> arrayMap) {
        if (animator != null) {
            animator.addListener(new b(arrayMap));
            f(animator);
        }
    }

    public Transition a(f fVar) {
        if (this.A == null) {
            this.A = new ArrayList<>();
        }
        this.A.add(fVar);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void a0() {
        i0();
        ArrayMap<Animator, d> arrayMapA = A();
        for (Animator animator : this.B) {
            if (arrayMapA.containsKey(animator)) {
                i0();
                Z(animator, arrayMapA);
            }
        }
        this.B.clear();
        r();
    }

    public Transition b(View view) {
        this.f.add(view);
        return this;
    }

    public Transition b0(long j) {
        this.c = j;
        return this;
    }

    public final void c(ArrayMap<View, d0q> arrayMap, ArrayMap<View, d0q> arrayMap2) {
        for (int i = 0; i < arrayMap.getSize(); i++) {
            d0q d0qVarValueAt = arrayMap.valueAt(i);
            if (L(d0qVarValueAt.f14938b)) {
                this.t.add(d0qVarValueAt);
                this.u.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.getSize(); i2++) {
            d0q d0qVarValueAt2 = arrayMap2.valueAt(i2);
            if (L(d0qVarValueAt2.f14938b)) {
                this.u.add(d0qVarValueAt2);
                this.t.add(null);
            }
        }
    }

    public void c0(e eVar) {
        this.D = eVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            this.w.get(size).cancel();
        }
        ArrayList<f> arrayList = this.A;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.A.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).e(this);
        }
    }

    public Transition d0(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    public void e0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.s = G;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!K(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (e(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.s = (int[]) iArr.clone();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void f(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (B() >= 0) {
            animator.setStartDelay(B() + animator.getStartDelay());
        }
        if (v() != null) {
            animator.setInterpolator(v());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void f0(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.F = H;
        } else {
            this.F = pathMotion;
        }
    }

    public abstract void g(d0q d0qVar);

    public void g0(a0q a0qVar) {
        this.C = a0qVar;
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f3054k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f3054k.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    d0q d0qVar = new d0q(view);
                    if (z) {
                        j(d0qVar);
                    } else {
                        g(d0qVar);
                    }
                    d0qVar.c.add(this);
                    i(d0qVar);
                    if (z) {
                        d(this.p, view, d0qVar);
                    } else {
                        d(this.q, view, d0qVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.o.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                h(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public Transition h0(long j) {
        this.f3053b = j;
        return this;
    }

    public void i(d0q d0qVar) {
        String[] strArrB;
        if (this.C == null || d0qVar.f14937a.isEmpty() || (strArrB = this.C.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!d0qVar.f14937a.containsKey(str)) {
                this.C.a(d0qVar);
                return;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void i0() {
        if (this.x == 0) {
            ArrayList<f> arrayList = this.A;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.A.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).b(this);
                }
            }
            this.z = false;
        }
        this.x++;
    }

    public abstract void j(d0q d0qVar);

    public String j0(String str) {
        String str2 = str + getClass().getSimpleName() + gv5.CONNECT_VALUE_STR + Integer.toHexString(hashCode()) + ": ";
        if (this.c != -1) {
            str2 = str2 + "dur(" + this.c + ") ";
        }
        if (this.f3053b != -1) {
            str2 = str2 + "dly(" + this.f3053b + ") ";
        }
        if (this.d != null) {
            str2 = str2 + "interp(" + this.d + ") ";
        }
        if (this.e.size() <= 0 && this.f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.e.size() > 0) {
            for (int i = 0; i < this.e.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.e.get(i);
            }
        }
        if (this.f.size() > 0) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f.get(i2);
            }
        }
        return str3 + ")";
    }

    public void k(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        ArrayMap<String, String> arrayMap;
        l(z);
        if ((this.e.size() > 0 || this.f.size() > 0) && (((arrayList = this.g) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.e.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.e.get(i).intValue());
                if (viewFindViewById != null) {
                    d0q d0qVar = new d0q(viewFindViewById);
                    if (z) {
                        j(d0qVar);
                    } else {
                        g(d0qVar);
                    }
                    d0qVar.c.add(this);
                    i(d0qVar);
                    if (z) {
                        d(this.p, viewFindViewById, d0qVar);
                    } else {
                        d(this.q, viewFindViewById, d0qVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                View view = this.f.get(i2);
                d0q d0qVar2 = new d0q(view);
                if (z) {
                    j(d0qVar2);
                } else {
                    g(d0qVar2);
                }
                d0qVar2.c.add(this);
                i(d0qVar2);
                if (z) {
                    d(this.p, view, d0qVar2);
                } else {
                    d(this.q, view, d0qVar2);
                }
            }
        } else {
            h(viewGroup, z);
        }
        if (z || (arrayMap = this.E) == null) {
            return;
        }
        int size = arrayMap.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.p.d.remove(this.E.keyAt(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.p.d.put(this.E.valueAt(i4), view2);
            }
        }
    }

    public void l(boolean z) {
        if (z) {
            this.p.f17272a.clear();
            this.p.f17273b.clear();
            this.p.c.clear();
        } else {
            this.q.f17272a.clear();
            this.q.f17273b.clear();
            this.q.c.clear();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.B = new ArrayList<>();
            transition.p = new f0q();
            transition.q = new f0q();
            transition.t = null;
            transition.u = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, d0q d0qVar, d0q d0qVar2) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void q(ViewGroup viewGroup, f0q f0qVar, f0q f0qVar2, ArrayList<d0q> arrayList, ArrayList<d0q> arrayList2) {
        Animator animatorP;
        int i;
        View view;
        Animator animator;
        d0q d0qVar;
        Animator animator2;
        d0q d0qVar2;
        ArrayMap<Animator, d> arrayMapA = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            d0q d0qVar3 = arrayList.get(i2);
            d0q d0qVar4 = arrayList2.get(i2);
            if (d0qVar3 != null && !d0qVar3.c.contains(this)) {
                d0qVar3 = null;
            }
            if (d0qVar4 != null && !d0qVar4.c.contains(this)) {
                d0qVar4 = null;
            }
            if (!(d0qVar3 == null && d0qVar4 == null) && ((d0qVar3 == null || d0qVar4 == null || J(d0qVar3, d0qVar4)) && (animatorP = p(viewGroup, d0qVar3, d0qVar4)) != null)) {
                if (d0qVar4 != null) {
                    view = d0qVar4.f14938b;
                    String[] strArrH = H();
                    if (strArrH != null && strArrH.length > 0) {
                        d0qVar2 = new d0q(view);
                        i = size;
                        d0q d0qVar5 = f0qVar2.f17272a.get(view);
                        if (d0qVar5 != null) {
                            int i3 = 0;
                            while (i3 < strArrH.length) {
                                Map<String, Object> map = d0qVar2.f14937a;
                                String str = strArrH[i3];
                                map.put(str, d0qVar5.f14937a.get(str));
                                i3++;
                                strArrH = strArrH;
                            }
                        }
                        int size2 = arrayMapA.getSize();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                animator2 = animatorP;
                                break;
                            }
                            d dVar = arrayMapA.get(arrayMapA.keyAt(i4));
                            if (dVar.c != null && dVar.f3059a == view && dVar.f3060b.equals(x()) && dVar.c.equals(d0qVar2)) {
                                animator2 = null;
                                break;
                            }
                            i4++;
                        }
                    } else {
                        i = size;
                        animator2 = animatorP;
                        d0qVar2 = null;
                    }
                    animator = animator2;
                    d0qVar = d0qVar2;
                } else {
                    i = size;
                    view = d0qVar3.f14938b;
                    animator = animatorP;
                    d0qVar = null;
                }
                if (animator != null) {
                    a0q a0qVar = this.C;
                    if (a0qVar != null) {
                        long jC = a0qVar.c(viewGroup, this, d0qVar3, d0qVar4);
                        sparseIntArray.put(this.B.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    arrayMapA.put(animator, new d(view, x(), this, byq.d(viewGroup), d0qVar));
                    this.B.add(animator);
                    jMin = jMin;
                }
            } else {
                i = size;
            }
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator3 = this.B.get(sparseIntArray.keyAt(i5));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i5)) - jMin) + animator3.getStartDelay());
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void r() {
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.A;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.A.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).d(this);
                }
            }
            for (int i3 = 0; i3 < this.p.c.size(); i3++) {
                View viewValueAt = this.p.c.valueAt(i3);
                if (viewValueAt != null) {
                    androidx.core.view.c.B0(viewValueAt, false);
                }
            }
            for (int i4 = 0; i4 < this.q.c.size(); i4++) {
                View viewValueAt2 = this.q.c.valueAt(i4);
                if (viewValueAt2 != null) {
                    androidx.core.view.c.B0(viewValueAt2, false);
                }
            }
            this.z = true;
        }
    }

    public long s() {
        return this.c;
    }

    public Rect t() {
        e eVar = this.D;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public String toString() {
        return j0("");
    }

    public e u() {
        return this.D;
    }

    public TimeInterpolator v() {
        return this.d;
    }

    public d0q w(View view, boolean z) {
        TransitionSet transitionSet = this.f3055r;
        if (transitionSet != null) {
            return transitionSet.w(view, z);
        }
        ArrayList<d0q> arrayList = z ? this.t : this.u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            d0q d0qVar = arrayList.get(i);
            if (d0qVar == null) {
                return null;
            }
            if (d0qVar.f14938b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.u : this.t).get(i);
        }
        return null;
    }

    public String x() {
        return this.f3052a;
    }

    public PathMotion y() {
        return this.F;
    }

    public a0q z() {
        return this.C;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jK = p5q.k(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jK >= 0) {
            b0(jK);
        }
        long jK2 = p5q.k(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jK2 > 0) {
            h0(jK2);
        }
        int iL = p5q.l(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iL > 0) {
            d0(AnimationUtils.loadInterpolator(context, iL));
        }
        String strM = p5q.m(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM != null) {
            e0(T(strM));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
