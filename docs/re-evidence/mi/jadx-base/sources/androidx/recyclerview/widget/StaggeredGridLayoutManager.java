package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c[] f2835b;
    public s c;
    public s d;
    public int e;
    public int f;
    public final m g;
    public BitSet j;
    public boolean o;
    public boolean p;
    public SavedState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2837r;
    public int[] w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2834a = -1;
    public boolean h = false;
    public boolean i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2836k = -1;
    public int l = Integer.MIN_VALUE;
    public LazySpanLookup m = new LazySpanLookup();
    public int n = 2;
    public final Rect s = new Rect();
    public final b t = new b();
    public boolean u = false;
    public boolean v = true;
    public final Runnable x = new a();

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public c e;
        public boolean f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int g() {
            c cVar = this.e;
            if (cVar == null) {
                return -1;
            }
            return cVar.e;
        }

        public boolean h() {
            return this.f;
        }

        public void i(boolean z) {
            this.f = z;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2843b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public List<LazySpanLookup.FullSpanItem> g;
        public boolean h;
        public boolean i;
        public boolean j;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public void a() {
            this.d = null;
            this.c = 0;
            this.f2842a = -1;
            this.f2843b = -1;
        }

        public void c() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2842a);
            parcel.writeInt(this.f2843b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        public SavedState(Parcel parcel) {
            this.f2842a = parcel.readInt();
            this.f2843b = parcel.readInt();
            int i = parcel.readInt();
            this.c = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.e = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.f2842a = savedState.f2842a;
            this.f2843b = savedState.f2843b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2846b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            this.f2846b = this.c ? StaggeredGridLayoutManager.this.c.i() : StaggeredGridLayoutManager.this.c.m();
        }

        public void b(int i) {
            if (this.c) {
                this.f2846b = StaggeredGridLayoutManager.this.c.i() - i;
            } else {
                this.f2846b = StaggeredGridLayoutManager.this.c.m() + i;
            }
        }

        public void c() {
            this.f2845a = -1;
            this.f2846b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.f2835b.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = cVarArr[i].r(Integer.MIN_VALUE);
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<View> f2847a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2848b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public c(int i) {
            this.e = i;
        }

        public void a(View view) {
            LayoutParams layoutParamsP = p(view);
            layoutParamsP.e = this;
            this.f2847a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.f2847a.size() == 1) {
                this.f2848b = Integer.MIN_VALUE;
            }
            if (layoutParamsP.e() || layoutParamsP.d()) {
                this.d += StaggeredGridLayoutManager.this.c.e(view);
            }
        }

        public void b(boolean z, int i) {
            int iN = z ? n(Integer.MIN_VALUE) : r(Integer.MIN_VALUE);
            e();
            if (iN == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iN >= StaggeredGridLayoutManager.this.c.i()) {
                if (z || iN <= StaggeredGridLayoutManager.this.c.m()) {
                    if (i != Integer.MIN_VALUE) {
                        iN += i;
                    }
                    this.c = iN;
                    this.f2848b = iN;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            ArrayList<View> arrayList = this.f2847a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParamsP = p(view);
            this.c = StaggeredGridLayoutManager.this.c.d(view);
            if (layoutParamsP.f && (fullSpanItemF = StaggeredGridLayoutManager.this.m.f(layoutParamsP.c())) != null && fullSpanItemF.f2841b == 1) {
                this.c += fullSpanItemF.a(this.e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = this.f2847a.get(0);
            LayoutParams layoutParamsP = p(view);
            this.f2848b = StaggeredGridLayoutManager.this.c.g(view);
            if (layoutParamsP.f && (fullSpanItemF = StaggeredGridLayoutManager.this.m.f(layoutParamsP.c())) != null && fullSpanItemF.f2841b == -1) {
                this.f2848b -= fullSpanItemF.a(this.e);
            }
        }

        public void e() {
            this.f2847a.clear();
            s();
            this.d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.h ? j(this.f2847a.size() - 1, -1, true) : j(0, this.f2847a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.h ? k(0, this.f2847a.size(), true) : k(this.f2847a.size() - 1, -1, true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.h ? j(0, this.f2847a.size(), true) : j(this.f2847a.size() - 1, -1, true);
        }

        public int i(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iM = StaggeredGridLayoutManager.this.c.m();
            int i3 = StaggeredGridLayoutManager.this.c.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2847a.get(i);
                int iG = StaggeredGridLayoutManager.this.c.g(view);
                int iD = StaggeredGridLayoutManager.this.c.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iG >= i3 : iG > i3;
                if (!z3 ? iD > iM : iD >= iM) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iG >= iM && iD <= i3) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iG < iM || iD > i3) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i4;
            }
            return -1;
        }

        public int j(int i, int i2, boolean z) {
            return i(i, i2, false, false, z);
        }

        public int k(int i, int i2, boolean z) {
            return i(i, i2, z, true, false);
        }

        public int l() {
            return this.d;
        }

        public int m() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        public int n(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2847a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View o(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2847a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2847a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.h && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2847a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2847a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.h && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.h && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public LayoutParams p(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        public int q() {
            int i = this.f2848b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.f2848b;
        }

        public int r(int i) {
            int i2 = this.f2848b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2847a.size() == 0) {
                return i;
            }
            d();
            return this.f2848b;
        }

        public void s() {
            this.f2848b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        public void t(int i) {
            int i2 = this.f2848b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2848b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        public void u() {
            int size = this.f2847a.size();
            View viewRemove = this.f2847a.remove(size - 1);
            LayoutParams layoutParamsP = p(viewRemove);
            layoutParamsP.e = null;
            if (layoutParamsP.e() || layoutParamsP.d()) {
                this.d -= StaggeredGridLayoutManager.this.c.e(viewRemove);
            }
            if (size == 1) {
                this.f2848b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void v() {
            View viewRemove = this.f2847a.remove(0);
            LayoutParams layoutParamsP = p(viewRemove);
            layoutParamsP.e = null;
            if (this.f2847a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (layoutParamsP.e() || layoutParamsP.d()) {
                this.d -= StaggeredGridLayoutManager.this.c.e(viewRemove);
            }
            this.f2848b = Integer.MIN_VALUE;
        }

        public void w(View view) {
            LayoutParams layoutParamsP = p(view);
            layoutParamsP.e = this;
            this.f2847a.add(0, view);
            this.f2848b = Integer.MIN_VALUE;
            if (this.f2847a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (layoutParamsP.e() || layoutParamsP.d()) {
                this.d += StaggeredGridLayoutManager.this.c.e(view);
            }
        }

        public void x(int i) {
            this.f2848b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2814a);
        a0(properties.f2815b);
        setReverseLayout(properties.c);
        this.g = new m();
        u();
    }

    private void P(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.s);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.s;
        int iI0 = i0(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.s;
        int iI1 = i0(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z ? shouldReMeasureChild(view, iI0, iI1, layoutParams) : shouldMeasureChild(view, iI0, iI1, layoutParams)) {
            view.measure(iI0, iI1);
        }
    }

    private int computeScrollExtent(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return v.a(zVar, this.c, y(!this.v), x(!this.v), this, this.v);
    }

    private int computeScrollOffset(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return v.b(zVar, this.c, y(!this.v), x(!this.v), this, this.v, this.i);
    }

    private int computeScrollRange(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return v.c(zVar, this.c, y(!this.v), x(!this.v), this, this.v);
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.e != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.e != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            return this.e == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.e == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.e == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.e == 0 ? 1 : Integer.MIN_VALUE;
    }

    public int[] A(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f2834a];
        } else if (iArr.length < this.f2834a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f2834a + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f2834a; i++) {
            iArr[i] = this.f2835b[i].g();
        }
        return iArr;
    }

    public final int B(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    public final void C(RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int i;
        int iG = G(Integer.MIN_VALUE);
        if (iG != Integer.MIN_VALUE && (i = this.c.i() - iG) > 0) {
            int i2 = i - (-scrollBy(-i, uVar, zVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.c.r(i2);
        }
    }

    public final void D(RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iM;
        int iJ = J(Integer.MAX_VALUE);
        if (iJ != Integer.MAX_VALUE && (iM = iJ - this.c.m()) > 0) {
            int iScrollBy = iM - scrollBy(iM, uVar, zVar);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.c.r(-iScrollBy);
        }
    }

    public int E() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int F() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int G(int i) {
        int iN = this.f2835b[0].n(i);
        for (int i2 = 1; i2 < this.f2834a; i2++) {
            int iN2 = this.f2835b[i2].n(i);
            if (iN2 > iN) {
                iN = iN2;
            }
        }
        return iN;
    }

    public final int H(int i) {
        int iR = this.f2835b[0].r(i);
        for (int i2 = 1; i2 < this.f2834a; i2++) {
            int iR2 = this.f2835b[i2].r(i);
            if (iR2 > iR) {
                iR = iR2;
            }
        }
        return iR;
    }

    public final int I(int i) {
        int iN = this.f2835b[0].n(i);
        for (int i2 = 1; i2 < this.f2834a; i2++) {
            int iN2 = this.f2835b[i2].n(i);
            if (iN2 < iN) {
                iN = iN2;
            }
        }
        return iN;
    }

    public final int J(int i) {
        int iR = this.f2835b[0].r(i);
        for (int i2 = 1; i2 < this.f2834a; i2++) {
            int iR2 = this.f2835b[i2].r(i);
            if (iR2 < iR) {
                iR = iR2;
            }
        }
        return iR;
    }

    public final c K(m mVar) {
        int i;
        int i2;
        int i3;
        if (S(mVar.e)) {
            i2 = this.f2834a - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.f2834a;
            i2 = 0;
            i3 = 1;
        }
        c cVar = null;
        if (mVar.e == 1) {
            int iM = this.c.m();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                c cVar2 = this.f2835b[i2];
                int iN = cVar2.n(iM);
                if (iN < i4) {
                    cVar = cVar2;
                    i4 = iN;
                }
                i2 += i3;
            }
            return cVar;
        }
        int i5 = this.c.i();
        int i6 = Integer.MIN_VALUE;
        while (i2 != i) {
            c cVar3 = this.f2835b[i2];
            int iR = cVar3.r(i5);
            if (iR > i6) {
                cVar = cVar3;
                i6 = iR;
            }
            i2 += i3;
        }
        return cVar;
    }

    public int L() {
        return this.f2834a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void M(int i, int i2, int i3) {
        int i4;
        int i5;
        int iF;
        int iF2 = this.i ? F() : E();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            this.m.h(i5);
            if (i3 != 1) {
                this.m.j(i, i2);
            } else if (i3 != 2) {
                this.m.k(i, i2);
            } else if (i3 == 8) {
                this.m.k(i, 1);
                this.m.j(i2, 1);
            }
            if (i4 <= iF2) {
                return;
            }
            if (this.i) {
                iF = E();
            } else {
                iF = F();
            }
            if (i5 <= iF) {
                requestLayout();
            }
        }
        i4 = i + i2;
        i5 = i;
        this.m.h(i5);
        if (i3 != 1) {
            this.m.j(i, i2);
        } else if (i3 != 2) {
            this.m.k(i, i2);
        } else if (i3 == 8) {
            this.m.k(i, 1);
            this.m.j(i2, 1);
        }
        if (i4 <= iF2) {
            return;
        }
        if (this.i) {
            iF = E();
        } else {
            iF = F();
        }
        if (i5 <= iF) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    public View N() {
        int i;
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i2 = childCount - 1;
        BitSet bitSet = new BitSet(this.f2834a);
        bitSet.set(0, this.f2834a, true);
        byte b2 = (this.e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.i) {
            childCount = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < childCount ? 1 : -1;
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (bitSet.get(layoutParams.e.e)) {
                if (r(layoutParams.e)) {
                    return childAt;
                }
                bitSet.clear(layoutParams.e.e);
            }
            if (!layoutParams.f && (i = i2 + i3) != childCount) {
                View childAt2 = getChildAt(i);
                if (this.i) {
                    int iD = this.c.d(childAt);
                    int iD2 = this.c.d(childAt2);
                    if (iD < iD2) {
                        return childAt;
                    }
                    if (iD == iD2) {
                        if (layoutParams.e.e - ((LayoutParams) childAt2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b2 < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iG = this.c.g(childAt);
                    int iG2 = this.c.g(childAt2);
                    if (iG > iG2) {
                        return childAt;
                    }
                    if (iG == iG2) {
                        if (layoutParams.e.e - ((LayoutParams) childAt2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b2 < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i2 += i3;
        }
        return null;
    }

    public void O() {
        this.m.b();
        requestLayout();
    }

    public final void Q(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f) {
            if (this.e == 1) {
                P(view, this.f2837r, RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
                return;
            } else {
                P(view, RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f2837r, z);
                return;
            }
        }
        if (this.e == 1) {
            P(view, RecyclerView.o.getChildMeasureSpec(this.f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
        } else {
            P(view, RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.o.getChildMeasureSpec(this.f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    public final void R(RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        boolean z2;
        SavedState savedState;
        b bVar = this.t;
        if (!(this.q == null && this.f2836k == -1) && zVar.c() == 0) {
            removeAndRecycleAllViews(uVar);
            bVar.c();
            return;
        }
        boolean z3 = (bVar.e && this.f2836k == -1 && this.q == null) ? false : true;
        if (z3) {
            bVar.c();
            if (this.q != null) {
                l(bVar);
            } else {
                resolveShouldLayoutReverse();
                bVar.c = this.i;
            }
            e0(zVar, bVar);
            bVar.e = true;
        }
        if (this.q == null && this.f2836k == -1 && (bVar.c != this.o || isLayoutRTL() != this.p)) {
            this.m.b();
            bVar.d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.q) == null || savedState.c < 1)) {
            if (bVar.d) {
                for (int i = 0; i < this.f2834a; i++) {
                    this.f2835b[i].e();
                    int i2 = bVar.f2846b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.f2835b[i].x(i2);
                    }
                }
            } else if (z3 || this.t.f == null) {
                for (int i3 = 0; i3 < this.f2834a; i3++) {
                    this.f2835b[i3].b(this.i, bVar.f2846b);
                }
                this.t.d(this.f2835b);
            } else {
                for (int i4 = 0; i4 < this.f2834a; i4++) {
                    c cVar = this.f2835b[i4];
                    cVar.e();
                    cVar.x(this.t.f[i4]);
                }
            }
        }
        detachAndScrapAttachedViews(uVar);
        this.g.f2951a = false;
        this.u = false;
        g0(this.d.n());
        f0(bVar.f2845a, zVar);
        if (bVar.c) {
            Z(-1);
            v(uVar, this.g, zVar);
            Z(1);
            m mVar = this.g;
            mVar.c = bVar.f2845a + mVar.d;
            v(uVar, mVar, zVar);
        } else {
            Z(1);
            v(uVar, this.g, zVar);
            Z(-1);
            m mVar2 = this.g;
            mVar2.c = bVar.f2845a + mVar2.d;
            v(uVar, mVar2, zVar);
        }
        Y();
        if (getChildCount() > 0) {
            if (this.i) {
                C(uVar, zVar, true);
                D(uVar, zVar, false);
            } else {
                D(uVar, zVar, true);
                C(uVar, zVar, false);
            }
        }
        if (z && !zVar.f() && this.n != 0 && getChildCount() > 0 && (this.u || N() != null)) {
            removeCallbacks(this.x);
            z2 = q();
        }
        if (zVar.f()) {
            this.t.c();
        }
        this.o = bVar.c;
        this.p = isLayoutRTL();
        if (z2) {
            this.t.c();
            R(uVar, zVar, false);
        }
    }

    public final boolean S(int i) {
        if (this.e == 0) {
            return (i == -1) != this.i;
        }
        return ((i == -1) == this.i) == isLayoutRTL();
    }

    public void T(int i, RecyclerView.z zVar) {
        int iE;
        int i2;
        if (i > 0) {
            iE = F();
            i2 = 1;
        } else {
            iE = E();
            i2 = -1;
        }
        this.g.f2951a = true;
        f0(iE, zVar);
        Z(i2);
        m mVar = this.g;
        mVar.c = iE + mVar.d;
        mVar.f2952b = Math.abs(i);
    }

    public final void U(View view) {
        for (int i = this.f2834a - 1; i >= 0; i--) {
            this.f2835b[i].w(view);
        }
    }

    public final void V(RecyclerView.u uVar, m mVar) {
        int iMin;
        if (!mVar.f2951a || mVar.i) {
            return;
        }
        if (mVar.f2952b == 0) {
            if (mVar.e == -1) {
                W(uVar, mVar.g);
                return;
            } else {
                X(uVar, mVar.f);
                return;
            }
        }
        if (mVar.e == -1) {
            int i = mVar.f;
            int iH = i - H(i);
            W(uVar, iH < 0 ? mVar.g : mVar.g - Math.min(iH, mVar.f2952b));
        } else {
            int I = I(mVar.g) - mVar.g;
            if (I < 0) {
                iMin = mVar.f;
            } else {
                iMin = Math.min(I, mVar.f2952b) + mVar.f;
            }
            X(uVar, iMin);
        }
    }

    public final void W(RecyclerView.u uVar, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.c.g(childAt) < i || this.c.q(childAt) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f) {
                for (int i2 = 0; i2 < this.f2834a; i2++) {
                    if (this.f2835b[i2].f2847a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2834a; i3++) {
                    this.f2835b[i3].u();
                }
            } else if (layoutParams.e.f2847a.size() == 1) {
                return;
            } else {
                layoutParams.e.u();
            }
            removeAndRecycleView(childAt, uVar);
        }
    }

    public final void X(RecyclerView.u uVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.c.d(childAt) > i || this.c.p(childAt) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f) {
                for (int i2 = 0; i2 < this.f2834a; i2++) {
                    if (this.f2835b[i2].f2847a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2834a; i3++) {
                    this.f2835b[i3].v();
                }
            } else if (layoutParams.e.f2847a.size() == 1) {
                return;
            } else {
                layoutParams.e.v();
            }
            removeAndRecycleView(childAt, uVar);
        }
    }

    public final void Y() {
        if (this.d.k() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float fE = this.d.e(childAt);
            if (fE >= fMax) {
                if (((LayoutParams) childAt.getLayoutParams()).h()) {
                    fE = (fE * 1.0f) / this.f2834a;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i2 = this.f;
        int iRound = Math.round(fMax * this.f2834a);
        if (this.d.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.d.n());
        }
        g0(iRound);
        if (this.f == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.f) {
                if (isLayoutRTL() && this.e == 1) {
                    int i4 = this.f2834a;
                    int i5 = layoutParams.e.e;
                    childAt2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = layoutParams.e.e;
                    int i7 = this.f * i6;
                    int i8 = i6 * i2;
                    if (this.e == 1) {
                        childAt2.offsetLeftAndRight(i7 - i8);
                    } else {
                        childAt2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    public final void Z(int i) {
        m mVar = this.g;
        mVar.e = i;
        mVar.d = this.i != (i == -1) ? -1 : 1;
    }

    public void a0(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f2834a) {
            O();
            this.f2834a = i;
            this.j = new BitSet(this.f2834a);
            this.f2835b = new c[this.f2834a];
            for (int i2 = 0; i2 < this.f2834a; i2++) {
                this.f2835b[i2] = new c(i2);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public final void b0(int i, int i2) {
        for (int i3 = 0; i3 < this.f2834a; i3++) {
            if (!this.f2835b[i3].f2847a.isEmpty()) {
                h0(this.f2835b[i3], i, i2);
            }
        }
    }

    public final boolean c0(RecyclerView.z zVar, b bVar) {
        bVar.f2845a = this.o ? B(zVar.c()) : w(zVar.c());
        bVar.f2846b = Integer.MIN_VALUE;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int iN;
        int iR;
        if (this.e != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        T(i, zVar);
        int[] iArr = this.w;
        if (iArr == null || iArr.length < this.f2834a) {
            this.w = new int[this.f2834a];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2834a; i4++) {
            m mVar = this.g;
            if (mVar.d == -1) {
                iN = mVar.f;
                iR = this.f2835b[i4].r(iN);
            } else {
                iN = this.f2835b[i4].n(mVar.g);
                iR = this.g.g;
            }
            int i5 = iN - iR;
            if (i5 >= 0) {
                this.w[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.w, 0, i3);
        for (int i6 = 0; i6 < i3 && this.g.a(zVar); i6++) {
            cVar.a(this.g.c, this.w[i6]);
            m mVar2 = this.g;
            mVar2.c += mVar2.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF computeScrollVectorForPosition(int i) {
        int iP = p(i);
        PointF pointF = new PointF();
        if (iP == 0) {
            return null;
        }
        if (this.e == 0) {
            pointF.x = iP;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iP;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    public boolean d0(RecyclerView.z zVar, b bVar) {
        int i;
        if (!zVar.f() && (i = this.f2836k) != -1) {
            if (i >= 0 && i < zVar.c()) {
                SavedState savedState = this.q;
                if (savedState == null || savedState.f2842a == -1 || savedState.c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f2836k);
                    if (viewFindViewByPosition != null) {
                        bVar.f2845a = this.i ? F() : E();
                        if (this.l != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.f2846b = (this.c.i() - this.l) - this.c.d(viewFindViewByPosition);
                            } else {
                                bVar.f2846b = (this.c.m() + this.l) - this.c.g(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.c.e(viewFindViewByPosition) > this.c.n()) {
                            bVar.f2846b = bVar.c ? this.c.i() : this.c.m();
                            return true;
                        }
                        int iG = this.c.g(viewFindViewByPosition) - this.c.m();
                        if (iG < 0) {
                            bVar.f2846b = -iG;
                            return true;
                        }
                        int i2 = this.c.i() - this.c.d(viewFindViewByPosition);
                        if (i2 < 0) {
                            bVar.f2846b = i2;
                            return true;
                        }
                        bVar.f2846b = Integer.MIN_VALUE;
                    } else {
                        int i3 = this.f2836k;
                        bVar.f2845a = i3;
                        int i4 = this.l;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = p(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.f2846b = Integer.MIN_VALUE;
                    bVar.f2845a = this.f2836k;
                }
                return true;
            }
            this.f2836k = -1;
            this.l = Integer.MIN_VALUE;
        }
        return false;
    }

    public void e0(RecyclerView.z zVar, b bVar) {
        if (d0(zVar, bVar) || c0(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.f2845a = 0;
    }

    public final void f0(int i, RecyclerView.z zVar) {
        int iN;
        int iN2;
        int iD;
        m mVar = this.g;
        boolean z = false;
        mVar.f2952b = 0;
        mVar.c = i;
        if (!isSmoothScrolling() || (iD = zVar.d()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.i == (iD < i)) {
                iN = this.c.n();
                iN2 = 0;
            } else {
                iN2 = this.c.n();
                iN = 0;
            }
        }
        if (getClipToPadding()) {
            this.g.f = this.c.m() - iN2;
            this.g.g = this.c.i() + iN;
        } else {
            this.g.g = this.c.h() + iN;
            this.g.f = -iN2;
        }
        m mVar2 = this.g;
        mVar2.h = false;
        mVar2.f2951a = true;
        if (this.c.k() == 0 && this.c.h() == 0) {
            z = true;
        }
        mVar2.i = z;
    }

    public void g0(int i) {
        this.f = i / this.f2834a;
        this.f2837r = View.MeasureSpec.makeMeasureSpec(i, this.d.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.e == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final void h0(c cVar, int i, int i2) {
        int iL = cVar.l();
        if (i == -1) {
            if (cVar.q() + iL <= i2) {
                this.j.set(cVar.e, false);
            }
        } else if (cVar.m() - iL >= i2) {
            this.j.set(cVar.e, false);
        }
    }

    public final int i0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return this.n != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final void k(View view) {
        for (int i = this.f2834a - 1; i >= 0; i--) {
            this.f2835b[i].a(view);
        }
    }

    public final void l(b bVar) {
        SavedState savedState = this.q;
        int i = savedState.c;
        if (i > 0) {
            if (i == this.f2834a) {
                for (int i2 = 0; i2 < this.f2834a; i2++) {
                    this.f2835b[i2].e();
                    SavedState savedState2 = this.q;
                    int i3 = savedState2.d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.i ? this.c.i() : this.c.m();
                    }
                    this.f2835b[i2].x(i3);
                }
            } else {
                savedState.c();
                SavedState savedState3 = this.q;
                savedState3.f2842a = savedState3.f2843b;
            }
        }
        SavedState savedState4 = this.q;
        this.p = savedState4.j;
        setReverseLayout(savedState4.h);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.q;
        int i4 = savedState5.f2842a;
        if (i4 != -1) {
            this.f2836k = i4;
            bVar.c = savedState5.i;
        } else {
            bVar.c = this.i;
        }
        if (savedState5.e > 1) {
            LazySpanLookup lazySpanLookup = this.m;
            lazySpanLookup.f2838a = savedState5.f;
            lazySpanLookup.f2839b = savedState5.g;
        }
    }

    public boolean m() {
        int iN = this.f2835b[0].n(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2834a; i++) {
            if (this.f2835b[i].n(Integer.MIN_VALUE) != iN) {
                return false;
            }
        }
        return true;
    }

    public boolean n() {
        int iR = this.f2835b[0].r(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2834a; i++) {
            if (this.f2835b[i].r(Integer.MIN_VALUE) != iR) {
                return false;
            }
        }
        return true;
    }

    public final void o(View view, LayoutParams layoutParams, m mVar) {
        if (mVar.e == 1) {
            if (layoutParams.f) {
                k(view);
                return;
            } else {
                layoutParams.e.a(view);
                return;
            }
        }
        if (layoutParams.f) {
            U(view);
        } else {
            layoutParams.e.w(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f2834a; i2++) {
            this.f2835b[i2].t(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f2834a; i2++) {
            this.f2835b[i2].t(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.m.b();
        for (int i = 0; i < this.f2834a; i++) {
            this.f2835b[i].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        removeCallbacks(this.x);
        for (int i = 0; i < this.f2834a; i++) {
            this.f2835b[i].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View onFocusSearchFailed(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        View viewFindContainingItemView;
        View viewO;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        boolean z = layoutParams.f;
        c cVar = layoutParams.e;
        int iF = iConvertFocusDirectionToLayoutDirection == 1 ? F() : E();
        f0(iF, zVar);
        Z(iConvertFocusDirectionToLayoutDirection);
        m mVar = this.g;
        mVar.c = mVar.d + iF;
        mVar.f2952b = (int) (this.c.n() * 0.33333334f);
        m mVar2 = this.g;
        mVar2.h = true;
        mVar2.f2951a = false;
        v(uVar, mVar2, zVar);
        this.o = this.i;
        if (!z && (viewO = cVar.o(iF, iConvertFocusDirectionToLayoutDirection)) != null && viewO != viewFindContainingItemView) {
            return viewO;
        }
        if (S(iConvertFocusDirectionToLayoutDirection)) {
            for (int i2 = this.f2834a - 1; i2 >= 0; i2--) {
                View viewO2 = this.f2835b[i2].o(iF, iConvertFocusDirectionToLayoutDirection);
                if (viewO2 != null && viewO2 != viewFindContainingItemView) {
                    return viewO2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f2834a; i3++) {
                View viewO3 = this.f2835b[i3].o(iF, iConvertFocusDirectionToLayoutDirection);
                if (viewO3 != null && viewO3 != viewFindContainingItemView) {
                    return viewO3;
                }
            }
        }
        boolean z2 = (this.h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z) {
            View viewFindViewByPosition = findViewByPosition(z2 ? cVar.f() : cVar.h());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (S(iConvertFocusDirectionToLayoutDirection)) {
            for (int i4 = this.f2834a - 1; i4 >= 0; i4--) {
                if (i4 != cVar.e) {
                    View viewFindViewByPosition2 = findViewByPosition(z2 ? this.f2835b[i4].f() : this.f2835b[i4].h());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f2834a; i5++) {
                View viewFindViewByPosition3 = findViewByPosition(z2 ? this.f2835b[i5].f() : this.f2835b[i5].h());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewY = y(false);
            View viewX = x(false);
            if (viewY == null || viewX == null) {
                return;
            }
            int position = getPosition(viewY);
            int position2 = getPosition(viewX);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        M(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.m.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        M(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        M(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        M(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.z zVar) {
        R(uVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        this.f2836k = -1;
        this.l = Integer.MIN_VALUE;
        this.q = null;
        this.t.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.f2836k != -1) {
                savedState.a();
                this.q.c();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        int iR;
        int iM;
        int[] iArr;
        if (this.q != null) {
            return new SavedState(this.q);
        }
        SavedState savedState = new SavedState();
        savedState.h = this.h;
        savedState.i = this.o;
        savedState.j = this.p;
        LazySpanLookup lazySpanLookup = this.m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f2838a) == null) {
            savedState.e = 0;
        } else {
            savedState.f = iArr;
            savedState.e = iArr.length;
            savedState.g = lazySpanLookup.f2839b;
        }
        if (getChildCount() > 0) {
            savedState.f2842a = this.o ? F() : E();
            savedState.f2843b = z();
            int i = this.f2834a;
            savedState.c = i;
            savedState.d = new int[i];
            for (int i2 = 0; i2 < this.f2834a; i2++) {
                if (this.o) {
                    iR = this.f2835b[i2].n(Integer.MIN_VALUE);
                    if (iR != Integer.MIN_VALUE) {
                        iM = this.c.i();
                        iR -= iM;
                    }
                } else {
                    iR = this.f2835b[i2].r(Integer.MIN_VALUE);
                    if (iR != Integer.MIN_VALUE) {
                        iM = this.c.m();
                        iR -= iM;
                    }
                }
                savedState.d[i2] = iR;
            }
        } else {
            savedState.f2842a = -1;
            savedState.f2843b = -1;
            savedState.c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            q();
        }
    }

    public final int p(int i) {
        if (getChildCount() == 0) {
            return this.i ? 1 : -1;
        }
        return (i < E()) != this.i ? -1 : 1;
    }

    public boolean q() {
        int iE;
        int iF;
        if (getChildCount() == 0 || this.n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.i) {
            iE = F();
            iF = E();
        } else {
            iE = E();
            iF = F();
        }
        if (iE == 0 && N() != null) {
            this.m.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.u) {
            return false;
        }
        int i = this.i ? -1 : 1;
        int i2 = iF + 1;
        LazySpanLookup.FullSpanItem fullSpanItemE = this.m.e(iE, i2, i, true);
        if (fullSpanItemE == null) {
            this.u = false;
            this.m.d(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = this.m.e(iE, fullSpanItemE.f2840a, i * (-1), true);
        if (fullSpanItemE2 == null) {
            this.m.d(fullSpanItemE.f2840a);
        } else {
            this.m.d(fullSpanItemE2.f2840a + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final boolean r(c cVar) {
        if (this.i) {
            if (cVar.m() < this.c.i()) {
                ArrayList<View> arrayList = cVar.f2847a;
                return !cVar.p(arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (cVar.q() > this.c.m()) {
            return !cVar.p(cVar.f2847a.get(0)).f;
        }
        return false;
    }

    public final void resolveShouldLayoutReverse() {
        if (this.e == 1 || !isLayoutRTL()) {
            this.i = this.h;
        } else {
            this.i = !this.h;
        }
    }

    public final LazySpanLookup.FullSpanItem s(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.c = new int[this.f2834a];
        for (int i2 = 0; i2 < this.f2834a; i2++) {
            fullSpanItem.c[i2] = i - this.f2835b[i2].n(i);
        }
        return fullSpanItem;
    }

    public int scrollBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        T(i, zVar);
        int iV = v(uVar, this.g, zVar);
        if (this.g.f2952b >= iV) {
            i = i < 0 ? -iV : iV;
        }
        this.c.r(-i);
        this.o = this.i;
        m mVar = this.g;
        mVar.f2952b = 0;
        V(uVar, mVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        return scrollBy(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i) {
        SavedState savedState = this.q;
        if (savedState != null && savedState.f2842a != i) {
            savedState.a();
        }
        this.f2836k = i;
        this.l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        return scrollBy(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.e == 1) {
            iChooseSize2 = RecyclerView.o.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.o.chooseSize(i, (this.f * this.f2834a) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.o.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.o.chooseSize(i2, (this.f * this.f2834a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.e) {
            return;
        }
        this.e = i;
        s sVar = this.c;
        this.c = this.d;
        this.d = sVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.q;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.h = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        n nVar = new n(recyclerView.getContext());
        nVar.setTargetPosition(i);
        startSmoothScroll(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.q == null;
    }

    public final LazySpanLookup.FullSpanItem t(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.c = new int[this.f2834a];
        for (int i2 = 0; i2 < this.f2834a; i2++) {
            fullSpanItem.c[i2] = this.f2835b[i2].r(i) - i;
        }
        return fullSpanItem;
    }

    public final void u() {
        this.c = s.b(this, this.e);
        this.d = s.b(this, 1 - this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int v(RecyclerView.u uVar, m mVar, RecyclerView.z zVar) {
        int i;
        int iG;
        c cVarK;
        int iE;
        int i2;
        int iE2;
        int iE3;
        boolean z;
        ?? r9 = 0;
        this.j.set(0, this.f2834a, true);
        if (this.g.i) {
            i = mVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = mVar.e == 1 ? mVar.g + mVar.f2952b : mVar.f - mVar.f2952b;
        }
        int i3 = i;
        b0(mVar.e, i3);
        int i4 = this.i ? this.c.i() : this.c.m();
        ?? r0 = false;
        while (mVar.a(zVar) && (this.g.i || !this.j.isEmpty())) {
            View viewB = mVar.b(uVar);
            LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
            int iC = layoutParams.c();
            int iG2 = this.m.g(iC);
            ?? r3 = iG2 == -1 ? 1 : r9;
            if (r3 != 0) {
                cVarK = layoutParams.f ? this.f2835b[r9] : K(mVar);
                this.m.n(iC, cVarK);
            } else {
                cVarK = this.f2835b[iG2];
            }
            c cVar = cVarK;
            layoutParams.e = cVar;
            if (mVar.e == 1) {
                addView(viewB);
            } else {
                addView(viewB, r9);
            }
            Q(viewB, layoutParams, r9);
            if (mVar.e == 1) {
                int iG3 = layoutParams.f ? G(i4) : cVar.n(i4);
                int iE4 = this.c.e(viewB) + iG3;
                if (r3 != 0 && layoutParams.f) {
                    LazySpanLookup.FullSpanItem fullSpanItemS = s(iG3);
                    fullSpanItemS.f2841b = -1;
                    fullSpanItemS.f2840a = iC;
                    this.m.a(fullSpanItemS);
                }
                i2 = iE4;
                iE = iG3;
            } else {
                int iJ = layoutParams.f ? J(i4) : cVar.r(i4);
                iE = iJ - this.c.e(viewB);
                if (r3 != 0 && layoutParams.f) {
                    LazySpanLookup.FullSpanItem fullSpanItemT = t(iJ);
                    fullSpanItemT.f2841b = 1;
                    fullSpanItemT.f2840a = iC;
                    this.m.a(fullSpanItemT);
                }
                i2 = iJ;
            }
            if (layoutParams.f && mVar.d == -1) {
                if (r3 != 0) {
                    this.u = true;
                } else {
                    if (!(mVar.e == 1 ? m() : n())) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = this.m.f(iC);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.d = true;
                        }
                        this.u = true;
                    }
                }
            }
            o(viewB, layoutParams, mVar);
            if (isLayoutRTL() && this.e == 1) {
                int i5 = layoutParams.f ? this.d.i() : this.d.i() - (((this.f2834a - 1) - cVar.e) * this.f);
                iE3 = i5;
                iE2 = i5 - this.d.e(viewB);
            } else {
                int iM = layoutParams.f ? this.d.m() : (cVar.e * this.f) + this.d.m();
                iE2 = iM;
                iE3 = this.d.e(viewB) + iM;
            }
            if (this.e == 1) {
                layoutDecoratedWithMargins(viewB, iE2, iE, iE3, i2);
            } else {
                layoutDecoratedWithMargins(viewB, iE, iE2, i2, iE3);
            }
            if (layoutParams.f) {
                b0(this.g.e, i3);
            } else {
                h0(cVar, this.g.e, i3);
            }
            V(uVar, this.g);
            if (!this.g.h || !viewB.hasFocusable()) {
                z = false;
            } else if (layoutParams.f) {
                this.j.clear();
                z = false;
            } else {
                z = false;
                this.j.set(cVar.e, false);
            }
            r9 = z;
            r0 = true;
        }
        ?? r4 = r9;
        if (r0 == false) {
            V(uVar, this.g);
        }
        if (this.g.e == -1) {
            iG = this.c.m() - J(this.c.m());
        } else {
            iG = G(this.c.i()) - this.c.i();
        }
        return iG > 0 ? Math.min(mVar.f2952b, iG) : r4 == true ? 1 : 0;
    }

    public final int w(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    public View x(boolean z) {
        int iM = this.c.m();
        int i = this.c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iG = this.c.g(childAt);
            int iD = this.c.d(childAt);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View y(boolean z) {
        int iM = this.c.m();
        int i = this.c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int iG = this.c.g(childAt);
            if (this.c.d(childAt) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int z() {
        View viewX = this.i ? x(true) : y(true);
        if (viewX == null) {
            return -1;
        }
        return getPosition(viewX);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f2838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<FullSpanItem> f2839b;

        public void a(FullSpanItem fullSpanItem) {
            if (this.f2839b == null) {
                this.f2839b = new ArrayList();
            }
            int size = this.f2839b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f2839b.get(i);
                if (fullSpanItem2.f2840a == fullSpanItem.f2840a) {
                    this.f2839b.remove(i);
                }
                if (fullSpanItem2.f2840a >= fullSpanItem.f2840a) {
                    this.f2839b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f2839b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.f2838a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2839b = null;
        }

        public void c(int i) {
            int[] iArr = this.f2838a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f2838a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.f2838a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2838a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List<FullSpanItem> list = this.f2839b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2839b.get(size).f2840a >= i) {
                        this.f2839b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public FullSpanItem e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f2839b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f2839b.get(i4);
                int i5 = fullSpanItem.f2840a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f2841b == i3 || (z && fullSpanItem.d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i) {
            List<FullSpanItem> list = this.f2839b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2839b.get(size);
                if (fullSpanItem.f2840a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.f2838a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int h(int i) {
            int[] iArr = this.f2838a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f2838a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2838a.length;
            }
            int iMin = Math.min(i2 + 1, this.f2838a.length);
            Arrays.fill(this.f2838a, i, iMin, -1);
            return iMin;
        }

        public final int i(int i) {
            if (this.f2839b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemF = f(i);
            if (fullSpanItemF != null) {
                this.f2839b.remove(fullSpanItemF);
            }
            int size = this.f2839b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.f2839b.get(i2).f2840a >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f2839b.get(i2);
            this.f2839b.remove(i2);
            return fullSpanItem.f2840a;
        }

        public void j(int i, int i2) {
            int[] iArr = this.f2838a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.f2838a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f2838a, i, i3, -1);
            l(i, i2);
        }

        public void k(int i, int i2) {
            int[] iArr = this.f2838a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.f2838a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f2838a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        public final void l(int i, int i2) {
            List<FullSpanItem> list = this.f2839b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2839b.get(size);
                int i3 = fullSpanItem.f2840a;
                if (i3 >= i) {
                    fullSpanItem.f2840a = i3 + i2;
                }
            }
        }

        public final void m(int i, int i2) {
            List<FullSpanItem> list = this.f2839b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2839b.get(size);
                int i4 = fullSpanItem.f2840a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f2839b.remove(size);
                    } else {
                        fullSpanItem.f2840a = i4 - i2;
                    }
                }
            }
        }

        public void n(int i, c cVar) {
            c(i);
            this.f2838a[i] = cVar.e;
        }

        public int o(int i) {
            int length = this.f2838a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2840a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2841b;
            public int[] c;
            public boolean d;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f2840a = parcel.readInt();
                this.f2841b = parcel.readInt();
                this.d = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i) {
                int[] iArr = this.c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2840a + ", mGapDir=" + this.f2841b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + AbstractJsonLexerKt.END_OBJ;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2840a);
                parcel.writeInt(this.f2841b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.c);
                }
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.e = i2;
        a0(i);
        this.g = new m();
        u();
    }
}
