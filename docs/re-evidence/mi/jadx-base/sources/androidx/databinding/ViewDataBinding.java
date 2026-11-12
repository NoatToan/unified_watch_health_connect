package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import defpackage.bsq;
import defpackage.fsi;
import defpackage.h45;
import defpackage.k5h;
import defpackage.m9h;
import defpackage.nfe;
import defpackage.r6r;
import defpackage.rk5;
import defpackage.sk5;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewDataBinding extends androidx.databinding.a implements bsq {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f2135r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f2136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2137b;
    public boolean c;
    public r6r[] d;
    public final View e;
    public androidx.databinding.c<m9h, ViewDataBinding, Void> f;
    public boolean g;
    public Choreographer h;
    public final Choreographer.FrameCallback i;
    public Handler j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final rk5 f2138k;
    public ViewDataBinding l;
    public LifecycleOwner m;
    public OnStartListener n;
    public boolean o;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean p;
    public static int q = Build.VERSION.SDK_INT;
    public static final boolean s = true;
    public static final h45 t = new a();
    public static final h45 u = new b();
    public static final h45 v = new c();
    public static final h45 w = new d();
    public static final androidx.databinding.c.a<m9h, ViewDataBinding, Void> x = new e();
    public static final ReferenceQueue<ViewDataBinding> y = new ReferenceQueue<>();
    public static final View.OnAttachStateChangeListener z = new f();

    public static class OnStartListener implements nfe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<ViewDataBinding> f2139a;

        public /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this(viewDataBinding);
        }

        @androidx.lifecycle.c(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f2139a.get();
            if (viewDataBinding != null) {
                viewDataBinding.t();
            }
        }

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.f2139a = new WeakReference<>(viewDataBinding);
        }
    }

    public class a implements h45 {
        @Override // defpackage.h45
        public r6r a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new m(viewDataBinding, i, referenceQueue).c();
        }
    }

    public class b implements h45 {
        @Override // defpackage.h45
        public r6r a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new k(viewDataBinding, i, referenceQueue).b();
        }
    }

    public class c implements h45 {
        @Override // defpackage.h45
        public r6r a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new l(viewDataBinding, i, referenceQueue).b();
        }
    }

    public class d implements h45 {
        @Override // defpackage.h45
        public r6r a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new j(viewDataBinding, i, referenceQueue).c();
        }
    }

    public class e extends androidx.databinding.c.a<m9h, ViewDataBinding, Void> {
        @Override // androidx.databinding.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m9h m9hVar, ViewDataBinding viewDataBinding, int i, Void r4) {
            if (i == 1) {
                if (m9hVar.onPreBind(viewDataBinding)) {
                    return;
                }
                viewDataBinding.c = true;
            } else if (i == 2) {
                m9hVar.onCanceled(viewDataBinding);
            } else {
                if (i != 3) {
                    return;
                }
                m9hVar.onBound(viewDataBinding);
            }
        }
    }

    public class f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.x(view).f2136a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f2137b = false;
            }
            ViewDataBinding.Y();
            if (ViewDataBinding.this.e.isAttachedToWindow()) {
                ViewDataBinding.this.t();
            } else {
                ViewDataBinding.this.e.removeOnAttachStateChangeListener(ViewDataBinding.z);
                ViewDataBinding.this.e.addOnAttachStateChangeListener(ViewDataBinding.z);
            }
        }
    }

    public class h implements Choreographer.FrameCallback {
        public h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            ViewDataBinding.this.f2136a.run();
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[][] f2142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[][] f2143b;
        public final int[][] c;

        public i(int i) {
            this.f2142a = new String[i][];
            this.f2143b = new int[i][];
            this.c = new int[i][];
        }

        public void a(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.f2142a[i] = strArr;
            this.f2143b[i] = iArr;
            this.c[i] = iArr2;
        }
    }

    public static class j implements Observer, k5h<LiveData<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r6r<LiveData<?>> f2144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<LifecycleOwner> f2145b = null;

        public j(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f2144a = new r6r<>(viewDataBinding, i, this, referenceQueue);
        }

        private LifecycleOwner b() {
            WeakReference<LifecycleOwner> weakReference = this.f2145b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // defpackage.k5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void addListener(LiveData<?> liveData) {
            LifecycleOwner lifecycleOwnerB = b();
            if (lifecycleOwnerB != null) {
                liveData.observe(lifecycleOwnerB, this);
            }
        }

        public r6r<LiveData<?>> c() {
            return this.f2144a;
        }

        @Override // defpackage.k5h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void removeListener(LiveData<?> liveData) {
            liveData.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            ViewDataBinding viewDataBindingA = this.f2144a.a();
            if (viewDataBindingA != null) {
                r6r<LiveData<?>> r6rVar = this.f2144a;
                viewDataBindingA.E(r6rVar.f32267b, r6rVar.b(), 0);
            }
        }

        @Override // defpackage.k5h
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            LifecycleOwner lifecycleOwnerB = b();
            LiveData<?> liveDataB = this.f2144a.b();
            if (liveDataB != null) {
                if (lifecycleOwnerB != null) {
                    liveDataB.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    liveDataB.observe(lifecycleOwner, this);
                }
            }
            if (lifecycleOwner != null) {
                this.f2145b = new WeakReference<>(lifecycleOwner);
            }
        }
    }

    public static class k extends androidx.databinding.f.a implements k5h<androidx.databinding.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r6r<androidx.databinding.f> f2146a;

        public k(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f2146a = new r6r<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // defpackage.k5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void addListener(androidx.databinding.f fVar) {
            fVar.addOnListChangedCallback(this);
        }

        public r6r<androidx.databinding.f> b() {
            return this.f2146a;
        }

        @Override // defpackage.k5h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void removeListener(androidx.databinding.f fVar) {
            fVar.removeOnListChangedCallback(this);
        }

        @Override // androidx.databinding.f.a
        public void onChanged(androidx.databinding.f fVar) {
            androidx.databinding.f fVarB;
            ViewDataBinding viewDataBindingA = this.f2146a.a();
            if (viewDataBindingA != null && (fVarB = this.f2146a.b()) == fVar) {
                viewDataBindingA.E(this.f2146a.f32267b, fVarB, 0);
            }
        }

        @Override // androidx.databinding.f.a
        public void onItemRangeChanged(androidx.databinding.f fVar, int i, int i2) {
            onChanged(fVar);
        }

        @Override // androidx.databinding.f.a
        public void onItemRangeInserted(androidx.databinding.f fVar, int i, int i2) {
            onChanged(fVar);
        }

        @Override // androidx.databinding.f.a
        public void onItemRangeMoved(androidx.databinding.f fVar, int i, int i2, int i3) {
            onChanged(fVar);
        }

        @Override // androidx.databinding.f.a
        public void onItemRangeRemoved(androidx.databinding.f fVar, int i, int i2) {
            onChanged(fVar);
        }

        @Override // defpackage.k5h
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    public static class l extends androidx.databinding.g.a implements k5h<androidx.databinding.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r6r<androidx.databinding.g> f2147a;

        public l(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f2147a = new r6r<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // defpackage.k5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void addListener(androidx.databinding.g gVar) {
            gVar.i(this);
        }

        public r6r<androidx.databinding.g> b() {
            return this.f2147a;
        }

        @Override // defpackage.k5h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void removeListener(androidx.databinding.g gVar) {
            gVar.u(this);
        }

        @Override // defpackage.k5h
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    public static class m extends androidx.databinding.e.a implements k5h<androidx.databinding.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r6r<androidx.databinding.e> f2148a;

        public m(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f2148a = new r6r<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.e.a
        public void a(androidx.databinding.e eVar, int i) {
            ViewDataBinding viewDataBindingA = this.f2148a.a();
            if (viewDataBindingA != null && this.f2148a.b() == eVar) {
                viewDataBindingA.E(this.f2148a.f32267b, eVar, i);
            }
        }

        @Override // defpackage.k5h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void addListener(androidx.databinding.e eVar) {
            eVar.addOnPropertyChangedCallback(this);
        }

        public r6r<androidx.databinding.e> c() {
            return this.f2148a;
        }

        @Override // defpackage.k5h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void removeListener(androidx.databinding.e eVar) {
            eVar.removeOnPropertyChangedCallback(this);
        }

        @Override // defpackage.k5h
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    public ViewDataBinding(rk5 rk5Var, View view, int i2) {
        this.f2136a = new g();
        this.f2137b = false;
        this.c = false;
        this.f2138k = rk5Var;
        this.d = new r6r[i2];
        this.e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (s) {
            this.h = Choreographer.getInstance();
            this.i = new h();
        } else {
            this.i = null;
            this.j = new Handler(Looper.myLooper());
        }
    }

    public static int A(View view, int i2) {
        return view.getContext().getColor(i2);
    }

    public static <T> T B(List<T> list, int i2) {
        if (list == null || i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <T extends ViewDataBinding> T G(LayoutInflater layoutInflater, int i2, ViewGroup viewGroup, boolean z2, Object obj) {
        return (T) sk5.k(layoutInflater, i2, viewGroup, z2, m(obj));
    }

    public static boolean I(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return false;
        }
        while (i2 < length) {
            if (!Character.isDigit(str.charAt(i2))) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    public static void L(rk5 rk5Var, View view, Object[] objArr, i iVar, SparseIntArray sparseIntArray, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        int iU;
        int id;
        int i5;
        int iX;
        if (x(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        boolean z5 = true;
        if (z2 && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i6 = iLastIndexOf + 1;
                if (I(str, i6)) {
                    iX = X(str, i6);
                    if (objArr[iX] == null) {
                        objArr[iX] = view;
                    }
                    if (iVar == null) {
                        iX = -1;
                    }
                    z3 = true;
                } else {
                    iX = -1;
                    z3 = false;
                }
            } else {
                iX = -1;
                z3 = false;
            }
            i2 = iX;
        } else if (str == null || !str.startsWith("binding_")) {
            i2 = -1;
            z3 = false;
        } else {
            int iX2 = X(str, f2135r);
            if (objArr[iX2] == null) {
                objArr[iX2] = view;
            }
            if (iVar == null) {
                iX2 = -1;
            }
            i2 = iX2;
            z3 = true;
        }
        if (!z3 && (id = view.getId()) > 0 && sparseIntArray != null && (i5 = sparseIntArray.get(id, -1)) >= 0 && objArr[i5] == null) {
            objArr[i5] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i7 = 0;
            int i8 = 0;
            while (i7 < childCount) {
                View childAt = viewGroup.getChildAt(i7);
                if (i2 < 0 || !(childAt.getTag() instanceof String)) {
                    i3 = i7;
                    i4 = i8;
                    z4 = false;
                } else {
                    String str2 = (String) childAt.getTag();
                    if (!str2.endsWith("_0") || !str2.startsWith("layout") || str2.indexOf(47) <= 0 || (iU = u(str2, i8, iVar, i2)) < 0) {
                        i3 = i7;
                        i4 = i8;
                        z4 = false;
                    } else {
                        int i9 = iU + 1;
                        int i10 = iVar.f2143b[i2][iU];
                        int i11 = iVar.c[i2][iU];
                        int iV = v(viewGroup, i7);
                        if (iV == i7) {
                            objArr[i10] = sk5.a(rk5Var, childAt, i11);
                            i3 = i7;
                            z4 = z5;
                            i4 = i9;
                        } else {
                            int i12 = iV - i7;
                            int i13 = i12 + 1;
                            View[] viewArr = new View[i13];
                            int i14 = 0;
                            while (i14 < i13) {
                                viewArr[i14] = viewGroup.getChildAt(i7 + i14);
                                i14++;
                                i9 = i9;
                            }
                            objArr[i10] = sk5.b(rk5Var, viewArr, i11);
                            i4 = i9;
                            i3 = i7 + i12;
                            z4 = true;
                        }
                    }
                }
                if (!z4) {
                    L(rk5Var, childAt, objArr, iVar, sparseIntArray, false);
                }
                int i15 = i4;
                z5 = true;
                i7 = i3 + 1;
                i8 = i15;
            }
        }
    }

    public static Object[] P(rk5 rk5Var, View view, int i2, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i2];
        L(rk5Var, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    public static Object[] V(rk5 rk5Var, View[] viewArr, int i2, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i2];
        for (View view : viewArr) {
            L(rk5Var, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    public static int X(String str, int i2) {
        int length = str.length();
        int iCharAt = 0;
        while (i2 < length) {
            iCharAt = (iCharAt * 10) + (str.charAt(i2) - '0');
            i2++;
        }
        return iCharAt;
    }

    public static void Y() {
        while (true) {
            Reference<? extends ViewDataBinding> referencePoll = y.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof r6r) {
                ((r6r) referencePoll).e();
            }
        }
    }

    public static int h0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean j0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static ViewDataBinding k(Object obj, View view, int i2) {
        return sk5.a(m(obj), view, i2);
    }

    public static rk5 m(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof rk5) {
            return (rk5) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static void r(ViewDataBinding viewDataBinding) {
        viewDataBinding.q();
    }

    public static int u(String str, int i2, i iVar, int i3) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f2142a[i3];
        int length = strArr.length;
        while (i2 < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int v(ViewGroup viewGroup, int i2) {
        String str = (String) viewGroup.getChildAt(i2).getTag();
        String strSubstring = str.substring(0, str.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i3 = i2 + 1; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strSubstring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i2;
                }
                if (I(str2, length)) {
                    i2 = i3;
                }
            }
        }
        return i2;
    }

    public static ViewDataBinding x(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(fsi.f18161a);
        }
        return null;
    }

    public static int z() {
        return q;
    }

    public LifecycleOwner C() {
        return this.m;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void E(int i2, Object obj, int i3) {
        if (this.o || this.p || !W(i2, obj, i3)) {
            return;
        }
        e0();
    }

    public abstract boolean F();

    public abstract void H();

    public abstract boolean W(int i2, Object obj, int i3);

    public void a0(int i2, Object obj, h45 h45Var) {
        if (obj == null) {
            return;
        }
        r6r r6rVarA = this.d[i2];
        if (r6rVarA == null) {
            r6rVarA = h45Var.a(this, i2, y);
            this.d[i2] = r6rVarA;
            LifecycleOwner lifecycleOwner = this.m;
            if (lifecycleOwner != null) {
                r6rVarA.c(lifecycleOwner);
            }
        }
        r6rVarA.d(obj);
    }

    public void e0() {
        ViewDataBinding viewDataBinding = this.l;
        if (viewDataBinding != null) {
            viewDataBinding.e0();
            return;
        }
        LifecycleOwner lifecycleOwner = this.m;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f2137b) {
                        return;
                    }
                    this.f2137b = true;
                    if (s) {
                        this.h.postFrameCallback(this.i);
                    } else {
                        this.j.post(this.f2136a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.bsq
    public View getRoot() {
        return this.e;
    }

    public void j(m9h m9hVar) {
        if (this.f == null) {
            this.f = new androidx.databinding.c<>(x);
        }
        this.f.a(m9hVar);
    }

    public void k0(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.l = this;
        }
    }

    public void l0(LifecycleOwner lifecycleOwner) {
        boolean z2 = lifecycleOwner instanceof Fragment;
        LifecycleOwner lifecycleOwner2 = this.m;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.n);
        }
        this.m = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.n == null) {
                this.n = new OnStartListener(this, null);
            }
            lifecycleOwner.getLifecycle().addObserver(this.n);
        }
        for (r6r r6rVar : this.d) {
            if (r6rVar != null) {
                r6rVar.c(lifecycleOwner);
            }
        }
    }

    public abstract void o();

    public void o0(View view) {
        view.setTag(fsi.f18161a, this);
    }

    public void p0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(fsi.f18161a, this);
        }
    }

    public final void q() {
        if (this.g) {
            e0();
            return;
        }
        if (F()) {
            this.g = true;
            this.c = false;
            androidx.databinding.c<m9h, ViewDataBinding, Void> cVar = this.f;
            if (cVar != null) {
                cVar.d(this, 1, null);
                if (this.c) {
                    this.f.d(this, 2, null);
                }
            }
            if (!this.c) {
                o();
                androidx.databinding.c<m9h, ViewDataBinding, Void> cVar2 = this.f;
                if (cVar2 != null) {
                    cVar2.d(this, 3, null);
                }
            }
            this.g = false;
        }
    }

    public abstract boolean q0(int i2, Object obj);

    public void t() {
        ViewDataBinding viewDataBinding = this.l;
        if (viewDataBinding == null) {
            q();
        } else {
            viewDataBinding.t();
        }
    }

    public void u0() {
        for (r6r r6rVar : this.d) {
            if (r6rVar != null) {
                r6rVar.e();
            }
        }
    }

    public boolean v0(int i2) {
        r6r r6rVar = this.d[i2];
        if (r6rVar != null) {
            return r6rVar.e();
        }
        return false;
    }

    public void w() {
        o();
    }

    public boolean w0(int i2, LiveData<?> liveData) {
        this.o = true;
        try {
            return z0(i2, liveData, w);
        } finally {
            this.o = false;
        }
    }

    public boolean x0(int i2, androidx.databinding.e eVar) {
        return z0(i2, eVar, t);
    }

    public boolean y0(int i2, androidx.databinding.f fVar) {
        return z0(i2, fVar, u);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean z0(int i2, Object obj, h45 h45Var) {
        if (obj == null) {
            return v0(i2);
        }
        r6r r6rVar = this.d[i2];
        if (r6rVar == null) {
            a0(i2, obj, h45Var);
            return true;
        }
        if (r6rVar.b() == obj) {
            return false;
        }
        v0(i2);
        a0(i2, obj, h45Var);
        return true;
    }

    public ViewDataBinding(Object obj, View view, int i2) {
        this(m(obj), view, i2);
    }
}
