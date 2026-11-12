package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.core.view.w0;
import androidx.legacy.widget.Space;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.ble.BleCommunicationException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import j20.x;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class GridLayout extends ViewGroup {
    public static final f A;
    public static final g B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LogPrinter f7438i = new LogPrinter(3, GridLayout.class.getName());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f7439j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7440k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f7441l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f7442m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f7443n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f7444o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f7445p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f7446q = new b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f7447r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f7448t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f7449v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f7450w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final androidx.gridlayout.widget.a f7451x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final androidx.gridlayout.widget.a f7452y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f7453z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f7454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f7455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Printer f7461h;

    public static class a implements Printer {
        @Override // android.util.Printer
        public final void println(String str) {
        }
    }

    public static class b extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view2, int i14, int i15) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "UNDEFINED";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i14, View view2) {
            return Integer.MIN_VALUE;
        }
    }

    public static class c extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view2, int i14, int i15) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "LEADING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i14, View view2) {
            return 0;
        }
    }

    public static class d extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view2, int i14, int i15) {
            return i14;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "TRAILING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i14, View view2) {
            return i14;
        }
    }

    public static class e extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view2, int i14, int i15) {
            return i14 >> 1;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "CENTER";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i14, View view2) {
            return i14 >> 1;
        }
    }

    public static class f extends h {

        public class a extends l {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f7462d;

            public a(f fVar) {
            }

            @Override // androidx.gridlayout.widget.GridLayout.l
            public final int a(GridLayout gridLayout, View view2, h hVar, int i14, boolean z14) {
                return Math.max(0, super.a(gridLayout, view2, hVar, i14, z14));
            }

            @Override // androidx.gridlayout.widget.GridLayout.l
            public final void b(int i14, int i15) {
                super.b(i14, i15);
                this.f7462d = Math.max(this.f7462d, i14 + i15);
            }

            @Override // androidx.gridlayout.widget.GridLayout.l
            public final void c() {
                super.c();
                this.f7462d = Integer.MIN_VALUE;
            }

            @Override // androidx.gridlayout.widget.GridLayout.l
            public final int d(boolean z14) {
                return Math.max(super.d(z14), this.f7462d);
            }
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view2, int i14, int i15) {
            if (view2.getVisibility() == 8) {
                return 0;
            }
            int baseline = view2.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final l b() {
            return new a(this);
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "BASELINE";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i14, View view2) {
            return 0;
        }
    }

    public static class g extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view2, int i14, int i15) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "FILL";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i14, View view2) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int e(int i14, int i15) {
            return i15;
        }
    }

    public static abstract class h {
        public abstract int a(View view2, int i14, int i15);

        public l b() {
            return new l();
        }

        public abstract String c();

        public abstract int d(int i14, View view2);

        public int e(int i14, int i15) {
            return i14;
        }

        public final String toString() {
            return "Alignment:".concat(c());
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f7463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f7464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7465c = true;

        public i(m mVar, o oVar) {
            this.f7463a = mVar;
            this.f7464b = oVar;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f7463a);
            sb3.append(StringUtils.SPACE);
            sb3.append(!this.f7465c ? "+>" : "->");
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f7464b);
            return sb3.toString();
        }
    }

    public static final class j<K, V> extends ArrayList<Pair<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<K> f7466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<V> f7467b;

        private j(Class<K> cls, Class<V> cls2) {
            this.f7466a = cls;
            this.f7467b = cls2;
        }

        public static <K, V> j<K, V> a(Class<K> cls, Class<V> cls2) {
            return new j<>(cls, cls2);
        }

        public final p<K, V> b() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f7466a, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.f7467b, size);
            for (int i14 = 0; i14 < size; i14++) {
                objArr[i14] = get(i14).first;
                objArr2[i14] = get(i14).second;
            }
            return new p<>(objArr, objArr2);
        }
    }

    public final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7468a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p<q, l> f7471d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p<m, o> f7473f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p<m, o> f7475h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f7477j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f7479l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public i[] f7481n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int[] f7483p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f7485r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int[] f7487t;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7469b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7470c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7472e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f7474g = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f7476i = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f7478k = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f7480m = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f7482o = false;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f7484q = false;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f7486s = false;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f7488u = true;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final o f7489v = new o(0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final o f7490w = new o(-100000);

        public k(boolean z14) {
            this.f7468a = z14;
        }

        public static void k(ArrayList arrayList, m mVar, o oVar, boolean z14) {
            if (mVar.a() == 0) {
                return;
            }
            if (z14) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).f7463a.equals(mVar)) {
                        return;
                    }
                }
            }
            arrayList.add(new i(mVar, oVar));
        }

        public static boolean n(int[] iArr, i iVar) {
            if (!iVar.f7465c) {
                return false;
            }
            m mVar = iVar.f7463a;
            int i14 = mVar.f7495a;
            int i15 = mVar.f7496b;
            int i16 = iArr[i14] + iVar.f7464b.f7512a;
            if (i16 <= iArr[i15]) {
                return false;
            }
            iArr[i15] = i16;
            return true;
        }

        public final String a(ArrayList arrayList) {
            StringBuilder sb3;
            String string;
            String str = this.f7468a ? "x" : JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE;
            StringBuilder sb4 = new StringBuilder();
            Iterator it = arrayList.iterator();
            boolean z14 = true;
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (z14) {
                    z14 = false;
                } else {
                    sb4.append(", ");
                }
                m mVar = iVar.f7463a;
                int i14 = mVar.f7495a;
                int i15 = mVar.f7496b;
                int i16 = iVar.f7464b.f7512a;
                if (i14 < i15) {
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(i15);
                    sb3.append("-");
                    sb3.append(str);
                    sb3.append(i14);
                    string = x.e(sb3, i16, ">=");
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(i14);
                    sb3.append("-");
                    sb3.append(str);
                    sb3.append(i15);
                    sb3.append("<=");
                    sb3.append(-i16);
                    string = sb3.toString();
                }
                sb4.append(string);
            }
            return sb4.toString();
        }

        public final void b(p<m, o> pVar, boolean z14) {
            for (o oVar : pVar.f7515c) {
                oVar.f7512a = Integer.MIN_VALUE;
            }
            l[] lVarArr = g().f7515c;
            for (int i14 = 0; i14 < lVarArr.length; i14++) {
                int iD = lVarArr[i14].d(z14);
                o oVar2 = pVar.f7515c[pVar.f7513a[i14]];
                int i15 = oVar2.f7512a;
                if (!z14) {
                    iD = -iD;
                }
                oVar2.f7512a = Math.max(i15, iD);
            }
        }

        public final void c(boolean z14) {
            int[] iArr = z14 ? this.f7477j : this.f7479l;
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = gridLayout.getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    n nVar = (n) childAt.getLayoutParams();
                    boolean z15 = this.f7468a;
                    m mVar = (z15 ? nVar.f7511b : nVar.f7510a).f7518b;
                    int i15 = z14 ? mVar.f7495a : mVar.f7496b;
                    iArr[i15] = Math.max(iArr[i15], gridLayout.f(childAt, z15, z14));
                }
            }
        }

        public final p<m, o> d(boolean z14) {
            m mVar;
            j jVarA = j.a(m.class, o.class);
            q[] qVarArr = g().f7514b;
            int length = qVarArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (z14) {
                    mVar = qVarArr[i14].f7518b;
                } else {
                    m mVar2 = qVarArr[i14].f7518b;
                    mVar = new m(mVar2.f7496b, mVar2.f7495a);
                }
                jVarA.add(Pair.create(mVar, new o()));
            }
            return jVarA.b();
        }

        public final i[] e() {
            if (this.f7481n == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.f7473f == null) {
                    this.f7473f = d(true);
                }
                if (!this.f7474g) {
                    b(this.f7473f, true);
                    this.f7474g = true;
                }
                p<m, o> pVar = this.f7473f;
                int i14 = 0;
                while (true) {
                    m[] mVarArr = pVar.f7514b;
                    if (i14 >= mVarArr.length) {
                        break;
                    }
                    k(arrayList, mVarArr[i14], pVar.f7515c[i14], false);
                    i14++;
                }
                if (this.f7475h == null) {
                    this.f7475h = d(false);
                }
                if (!this.f7476i) {
                    b(this.f7475h, false);
                    this.f7476i = true;
                }
                p<m, o> pVar2 = this.f7475h;
                int i15 = 0;
                while (true) {
                    m[] mVarArr2 = pVar2.f7514b;
                    if (i15 >= mVarArr2.length) {
                        break;
                    }
                    k(arrayList2, mVarArr2[i15], pVar2.f7515c[i15], false);
                    i15++;
                }
                if (this.f7488u) {
                    int i16 = 0;
                    while (i16 < f()) {
                        int i17 = i16 + 1;
                        k(arrayList, new m(i16, i17), new o(0), true);
                        i16 = i17;
                    }
                }
                int iF = f();
                k(arrayList, new m(0, iF), this.f7489v, false);
                k(arrayList2, new m(iF, 0), this.f7490w, false);
                i[] iVarArrR = r(arrayList);
                i[] iVarArrR2 = r(arrayList2);
                LogPrinter logPrinter = GridLayout.f7438i;
                Object[] objArr = (Object[]) Array.newInstance(i[].class.getComponentType(), iVarArrR.length + iVarArrR2.length);
                System.arraycopy(iVarArrR, 0, objArr, 0, iVarArrR.length);
                System.arraycopy(iVarArrR2, 0, objArr, iVarArrR.length, iVarArrR2.length);
                this.f7481n = (i[]) objArr;
            }
            if (!this.f7482o) {
                if (this.f7473f == null) {
                    this.f7473f = d(true);
                }
                if (!this.f7474g) {
                    b(this.f7473f, true);
                    this.f7474g = true;
                }
                if (this.f7475h == null) {
                    this.f7475h = d(false);
                }
                if (!this.f7476i) {
                    b(this.f7475h, false);
                    this.f7476i = true;
                }
                this.f7482o = true;
            }
            return this.f7481n;
        }

        public final int f() {
            return Math.max(this.f7469b, i());
        }

        public final p<q, l> g() {
            int iE;
            int i14;
            p<q, l> pVar = this.f7471d;
            boolean z14 = this.f7468a;
            GridLayout gridLayout = GridLayout.this;
            if (pVar == null) {
                j jVarA = j.a(q.class, l.class);
                int childCount = gridLayout.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    n nVar = (n) gridLayout.getChildAt(i15).getLayoutParams();
                    q qVar = z14 ? nVar.f7511b : nVar.f7510a;
                    jVarA.add(Pair.create(qVar, qVar.c(z14).b()));
                }
                this.f7471d = jVarA.b();
            }
            if (!this.f7472e) {
                for (l lVar : this.f7471d.f7515c) {
                    lVar.c();
                }
                int childCount2 = gridLayout.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = gridLayout.getChildAt(i16);
                    n nVar2 = (n) childAt.getLayoutParams();
                    q qVar2 = z14 ? nVar2.f7511b : nVar2.f7510a;
                    if (childAt.getVisibility() == 8) {
                        iE = 0;
                    } else {
                        iE = gridLayout.e(childAt, z14, false) + gridLayout.e(childAt, z14, true) + (z14 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                    }
                    if (qVar2.f7520d == 0.0f) {
                        i14 = 0;
                    } else {
                        if (this.f7487t == null) {
                            this.f7487t = new int[gridLayout.getChildCount()];
                        }
                        i14 = this.f7487t[i16];
                    }
                    int i17 = iE + i14;
                    p<q, l> pVar2 = this.f7471d;
                    l lVar2 = pVar2.f7515c[pVar2.f7513a[i16]];
                    lVar2.f7494c = ((qVar2.f7519c == GridLayout.f7446q && qVar2.f7520d == 0.0f) ? 0 : 2) & lVar2.f7494c;
                    h hVarC = qVar2.c(z14);
                    WindowInsets windowInsets = w0.f6584a;
                    int iA = hVarC.a(childAt, i17, gridLayout.getLayoutMode());
                    lVar2.b(iA, i17 - iA);
                }
                this.f7472e = true;
            }
            return this.f7471d;
        }

        public final int[] h() {
            boolean z14;
            if (this.f7483p == null) {
                this.f7483p = new int[f() + 1];
            }
            if (!this.f7484q) {
                int[] iArr = this.f7483p;
                boolean z15 = this.f7486s;
                GridLayout gridLayout = GridLayout.this;
                float f14 = 0.0f;
                boolean z16 = this.f7468a;
                if (!z15) {
                    int childCount = gridLayout.getChildCount();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= childCount) {
                            z14 = false;
                            break;
                        }
                        View childAt = gridLayout.getChildAt(i14);
                        if (childAt.getVisibility() != 8) {
                            n nVar = (n) childAt.getLayoutParams();
                            if ((z16 ? nVar.f7511b : nVar.f7510a).f7520d != 0.0f) {
                                z14 = true;
                                break;
                            }
                        }
                        i14++;
                    }
                    this.f7485r = z14;
                    this.f7486s = true;
                }
                if (this.f7485r) {
                    if (this.f7487t == null) {
                        this.f7487t = new int[gridLayout.getChildCount()];
                    }
                    Arrays.fill(this.f7487t, 0);
                    q(e(), iArr, true);
                    int childCount2 = (gridLayout.getChildCount() * this.f7489v.f7512a) + 1;
                    if (childCount2 >= 2) {
                        int childCount3 = gridLayout.getChildCount();
                        for (int i15 = 0; i15 < childCount3; i15++) {
                            View childAt2 = gridLayout.getChildAt(i15);
                            if (childAt2.getVisibility() != 8) {
                                n nVar2 = (n) childAt2.getLayoutParams();
                                f14 += (z16 ? nVar2.f7511b : nVar2.f7510a).f7520d;
                            }
                        }
                        int i16 = -1;
                        boolean z17 = true;
                        int i17 = 0;
                        while (i17 < childCount2) {
                            int i18 = (int) ((((long) i17) + ((long) childCount2)) / 2);
                            m();
                            p(f14, i18);
                            boolean zQ = q(e(), iArr, false);
                            if (zQ) {
                                i17 = i18 + 1;
                                i16 = i18;
                            } else {
                                childCount2 = i18;
                            }
                            z17 = zQ;
                        }
                        if (i16 > 0 && !z17) {
                            m();
                            p(f14, i16);
                            q(e(), iArr, true);
                        }
                    }
                } else {
                    q(e(), iArr, true);
                }
                if (!this.f7488u) {
                    int i19 = iArr[0];
                    int length = iArr.length;
                    for (int i24 = 0; i24 < length; i24++) {
                        iArr[i24] = iArr[i24] - i19;
                    }
                }
                this.f7484q = true;
            }
            return this.f7483p;
        }

        public final int i() {
            if (this.f7470c == Integer.MIN_VALUE) {
                GridLayout gridLayout = GridLayout.this;
                int childCount = gridLayout.getChildCount();
                int iMax = -1;
                for (int i14 = 0; i14 < childCount; i14++) {
                    n nVar = (n) gridLayout.getChildAt(i14).getLayoutParams();
                    m mVar = (this.f7468a ? nVar.f7511b : nVar.f7510a).f7518b;
                    iMax = Math.max(Math.max(Math.max(iMax, mVar.f7495a), mVar.f7496b), mVar.a());
                }
                this.f7470c = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
            }
            return this.f7470c;
        }

        public final int j(int i14) {
            int mode = View.MeasureSpec.getMode(i14);
            int size = View.MeasureSpec.getSize(i14);
            o oVar = this.f7490w;
            o oVar2 = this.f7489v;
            if (mode == Integer.MIN_VALUE) {
                oVar2.f7512a = 0;
                oVar.f7512a = -size;
                this.f7484q = false;
                return h()[f()];
            }
            if (mode == 0) {
                oVar2.f7512a = 0;
                oVar.f7512a = -100000;
                this.f7484q = false;
                return h()[f()];
            }
            if (mode != 1073741824) {
                return 0;
            }
            oVar2.f7512a = size;
            oVar.f7512a = -size;
            this.f7484q = false;
            return h()[f()];
        }

        public final void l() {
            this.f7470c = Integer.MIN_VALUE;
            this.f7471d = null;
            this.f7473f = null;
            this.f7475h = null;
            this.f7477j = null;
            this.f7479l = null;
            this.f7481n = null;
            this.f7483p = null;
            this.f7487t = null;
            this.f7486s = false;
            m();
        }

        public final void m() {
            this.f7472e = false;
            this.f7474g = false;
            this.f7476i = false;
            this.f7478k = false;
            this.f7480m = false;
            this.f7482o = false;
            this.f7484q = false;
        }

        public final void o(int i14) {
            if (i14 == Integer.MIN_VALUE || i14 >= i()) {
                this.f7469b = i14;
            } else {
                GridLayout.g((this.f7468a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
                throw null;
            }
        }

        public final void p(float f14, int i14) {
            Arrays.fill(this.f7487t, 0);
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = gridLayout.getChildAt(i15);
                if (childAt.getVisibility() != 8) {
                    gridLayout.getClass();
                    n nVar = (n) childAt.getLayoutParams();
                    float f15 = (this.f7468a ? nVar.f7511b : nVar.f7510a).f7520d;
                    if (f15 != 0.0f) {
                        int iRound = Math.round((i14 * f15) / f14);
                        this.f7487t[i15] = iRound;
                        i14 -= iRound;
                        f14 -= f15;
                    }
                }
            }
        }

        public final boolean q(i[] iVarArr, int[] iArr, boolean z14) {
            String str = this.f7468a ? "horizontal" : "vertical";
            int iF = f() + 1;
            boolean[] zArr = null;
            loop0: for (int i14 = 0; i14 < iVarArr.length; i14++) {
                Arrays.fill(iArr, 0);
                for (int i15 = 0; i15 < iF; i15++) {
                    boolean zN = false;
                    for (i iVar : iVarArr) {
                        zN |= n(iArr, iVar);
                    }
                    if (!zN) {
                        if (zArr == null) {
                            break loop0;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i16 = 0; i16 < iVarArr.length; i16++) {
                            i iVar2 = iVarArr[i16];
                            if (zArr[i16]) {
                                arrayList.add(iVar2);
                            }
                            if (!iVar2.f7465c) {
                                arrayList2.add(iVar2);
                            }
                        }
                        Printer printer = GridLayout.this.f7461h;
                        StringBuilder sbI = sn.a.i(str, " constraints: ");
                        sbI.append(a(arrayList));
                        sbI.append(" are inconsistent; permanently removing: ");
                        sbI.append(a(arrayList2));
                        sbI.append(". ");
                        printer.println(sbI.toString());
                        return true;
                    }
                }
                if (!z14) {
                    return false;
                }
                boolean[] zArr2 = new boolean[iVarArr.length];
                for (int i17 = 0; i17 < iF; i17++) {
                    int length = iVarArr.length;
                    for (int i18 = 0; i18 < length; i18++) {
                        zArr2[i18] = zArr2[i18] | n(iArr, iVarArr[i18]);
                    }
                }
                if (i14 == 0) {
                    zArr = zArr2;
                }
                for (int i19 = 0; i19 < iVarArr.length; i19++) {
                    if (zArr2[i19]) {
                        i iVar3 = iVarArr[i19];
                        m mVar = iVar3.f7463a;
                        if (mVar.f7495a >= mVar.f7496b) {
                            iVar3.f7465c = false;
                            break;
                        }
                    }
                }
            }
            return true;
        }

        public final i[] r(ArrayList arrayList) {
            androidx.gridlayout.widget.b bVar = new androidx.gridlayout.widget.b(this, (i[]) arrayList.toArray(new i[arrayList.size()]));
            int length = bVar.f7525c.length;
            for (int i14 = 0; i14 < length; i14++) {
                bVar.a(i14);
            }
            return bVar.f7523a;
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7494c;

        public l() {
            c();
        }

        public int a(GridLayout gridLayout, View view2, h hVar, int i14, boolean z14) {
            int i15 = this.f7492a;
            WindowInsets windowInsets = w0.f6584a;
            return i15 - hVar.a(view2, i14, gridLayout.getLayoutMode());
        }

        public void b(int i14, int i15) {
            this.f7492a = Math.max(this.f7492a, i14);
            this.f7493b = Math.max(this.f7493b, i15);
        }

        public void c() {
            this.f7492a = Integer.MIN_VALUE;
            this.f7493b = Integer.MIN_VALUE;
            this.f7494c = 2;
        }

        public int d(boolean z14) {
            if (!z14) {
                int i14 = this.f7494c;
                LogPrinter logPrinter = GridLayout.f7438i;
                if ((i14 & 2) != 0) {
                    return 100000;
                }
            }
            return this.f7492a + this.f7493b;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Bounds{before=");
            sb3.append(this.f7492a);
            sb3.append(", after=");
            return e0.j(sb3, this.f7493b, CoreConstants.CURLY_RIGHT);
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7496b;

        public m(int i14, int i15) {
            this.f7495a = i14;
            this.f7496b = i15;
        }

        public final int a() {
            return this.f7496b - this.f7495a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            m mVar = (m) obj;
            return this.f7496b == mVar.f7496b && this.f7495a == mVar.f7495a;
        }

        public final int hashCode() {
            return (this.f7495a * 31) + this.f7496b;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(this.f7495a);
            sb3.append(", ");
            return am.j.q(sb3, this.f7496b, "]");
        }
    }

    public static final class p<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f7513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K[] f7514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V[] f7515c;

        public p(K[] kArr, V[] vArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap map = new HashMap();
            for (int i14 = 0; i14 < length; i14++) {
                K k14 = kArr[i14];
                Integer numValueOf = (Integer) map.get(k14);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(map.size());
                    map.put(k14, numValueOf);
                }
                iArr[i14] = numValueOf.intValue();
            }
            this.f7513a = iArr;
            this.f7514b = (K[]) a(kArr, iArr);
            this.f7515c = (V[]) a(vArr, iArr);
        }

        public static <K> K[] a(K[] kArr, int[] iArr) {
            int length = kArr.length;
            Class<?> componentType = kArr.getClass().getComponentType();
            LogPrinter logPrinter = GridLayout.f7438i;
            int iMax = -1;
            for (int i14 : iArr) {
                iMax = Math.max(iMax, i14);
            }
            K[] kArr2 = (K[]) ((Object[]) Array.newInstance(componentType, iMax + 1));
            for (int i15 = 0; i15 < length; i15++) {
                kArr2[iArr[i15]] = kArr[i15];
            }
            return kArr2;
        }
    }

    static {
        c cVar = new c();
        d dVar = new d();
        f7447r = cVar;
        f7448t = dVar;
        f7449v = cVar;
        f7450w = dVar;
        f7451x = new androidx.gridlayout.widget.a(cVar, dVar);
        f7452y = new androidx.gridlayout.widget.a(dVar, cVar);
        f7453z = new e();
        A = new f();
        B = new g();
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f7454a = new k(true);
        this.f7455b = new k(false);
        this.f7456c = 0;
        this.f7457d = false;
        this.f7458e = 1;
        this.f7460g = 0;
        this.f7461h = f7438i;
        this.f7459f = context.getResources().getDimensionPixelOffset(R.dimen.default_gap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i8.a.f92215a);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(f7441l, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(f7442m, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(f7440k, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(f7443n, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(0, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f7444o, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f7445p, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static h d(int i14, boolean z14) {
        int i15 = (i14 & (z14 ? 7 : 112)) >> (z14 ? 0 : 4);
        if (i15 == 1) {
            return f7453z;
        }
        if (i15 == 3) {
            return z14 ? f7451x : f7447r;
        }
        if (i15 == 5) {
            return z14 ? f7452y : f7448t;
        }
        if (i15 == 7) {
            return B;
        }
        if (i15 != 8388611) {
            return i15 != 8388613 ? f7446q : f7450w;
        }
        return f7449v;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(n nVar, int i14, int i15, int i16, int i17) {
        nVar.f7510a = nVar.f7510a.b(new m(i14, i15 + i14));
        nVar.f7511b = nVar.f7511b.b(new m(i16, i17 + i16));
    }

    public static q l(int i14, int i15, h hVar, float f14) {
        return new q(i14 != Integer.MIN_VALUE, i14, i15, hVar, f14);
    }

    public final void a(n nVar, boolean z14) {
        String str = z14 ? "column" : "row";
        m mVar = (z14 ? nVar.f7511b : nVar.f7510a).f7518b;
        int i14 = mVar.f7495a;
        if (i14 != Integer.MIN_VALUE && i14 < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i15 = (z14 ? this.f7454a : this.f7455b).f7469b;
        if (i15 != Integer.MIN_VALUE) {
            if (mVar.f7496b > i15) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (mVar.a() <= i15) {
                return;
            }
            g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                iHashCode = ((n) childAt.getLayoutParams()).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public final void c() {
        int i14 = this.f7460g;
        if (i14 != 0) {
            if (i14 != b()) {
                this.f7461h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                h();
                c();
                return;
            }
            return;
        }
        boolean z14 = this.f7456c == 0;
        int i15 = (z14 ? this.f7454a : this.f7455b).f7469b;
        if (i15 == Integer.MIN_VALUE) {
            i15 = 0;
        }
        int[] iArr = new int[i15];
        int childCount = getChildCount();
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            n nVar = (n) getChildAt(i18).getLayoutParams();
            q qVar = z14 ? nVar.f7510a : nVar.f7511b;
            m mVar = qVar.f7518b;
            boolean z15 = qVar.f7517a;
            int iA = mVar.a();
            if (z15) {
                i16 = mVar.f7495a;
            }
            q qVar2 = z14 ? nVar.f7511b : nVar.f7510a;
            m mVar2 = qVar2.f7518b;
            boolean z16 = qVar2.f7517a;
            int iA2 = mVar2.a();
            int i19 = mVar2.f7495a;
            if (i15 != 0) {
                iA2 = Math.min(iA2, i15 - (z16 ? Math.min(i19, i15) : 0));
            }
            if (z16) {
                i17 = i19;
            }
            if (i15 != 0) {
                if (!z15 || !z16) {
                    while (true) {
                        int i24 = i17 + iA2;
                        if (i24 <= i15) {
                            int i25 = i17;
                            while (true) {
                                if (i25 >= i24) {
                                    break;
                                } else if (iArr[i25] > i16) {
                                    break;
                                } else {
                                    i25++;
                                }
                            }
                        }
                        if (z16) {
                            i16++;
                        } else if (i24 <= i15) {
                            i17++;
                        } else {
                            i16++;
                            i17 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i17, i15), Math.min(i17 + iA2, i15), i16 + iA);
            }
            if (z14) {
                k(nVar, i16, iA, i17, iA2);
            } else {
                k(nVar, i17, iA2, i16, iA);
            }
            i17 += iA2;
        }
        this.f7460g = b();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof n)) {
            return false;
        }
        n nVar = (n) layoutParams;
        a(nVar, true);
        a(nVar, false);
        return true;
    }

    public final int e(View view2, boolean z14, boolean z15) {
        int[] iArr;
        if (this.f7458e == 1) {
            return f(view2, z14, z15);
        }
        k kVar = z14 ? this.f7454a : this.f7455b;
        if (z15) {
            if (kVar.f7477j == null) {
                kVar.f7477j = new int[kVar.f() + 1];
            }
            if (!kVar.f7478k) {
                kVar.c(true);
                kVar.f7478k = true;
            }
            iArr = kVar.f7477j;
        } else {
            if (kVar.f7479l == null) {
                kVar.f7479l = new int[kVar.f() + 1];
            }
            if (!kVar.f7480m) {
                kVar.c(false);
                kVar.f7480m = true;
            }
            iArr = kVar.f7479l;
        }
        n nVar = (n) view2.getLayoutParams();
        m mVar = (z14 ? nVar.f7511b : nVar.f7510a).f7518b;
        return iArr[z15 ? mVar.f7495a : mVar.f7496b];
    }

    public final int f(View view2, boolean z14, boolean z15) {
        int i14;
        n nVar = (n) view2.getLayoutParams();
        if (z14) {
            i14 = z15 ? ((ViewGroup.MarginLayoutParams) nVar).leftMargin : ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
        } else {
            i14 = z15 ? ((ViewGroup.MarginLayoutParams) nVar).topMargin : ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
        }
        if (i14 != Integer.MIN_VALUE) {
            return i14;
        }
        if (this.f7457d) {
            q qVar = z14 ? nVar.f7511b : nVar.f7510a;
            k kVar = z14 ? this.f7454a : this.f7455b;
            m mVar = qVar.f7518b;
            if (z14) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                if (getLayoutDirection() == 1) {
                    z15 = !z15;
                }
            }
            if (z15) {
                int i15 = mVar.f7495a;
            } else {
                int i16 = mVar.f7496b;
                kVar.f();
            }
            if (view2.getClass() != Space.class && view2.getClass() != android.widget.Space.class) {
                return this.f7459f / 2;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new n();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof n) {
            return new n((n) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
    }

    public int getAlignmentMode() {
        return this.f7458e;
    }

    public int getColumnCount() {
        return this.f7454a.f();
    }

    public int getOrientation() {
        return this.f7456c;
    }

    public Printer getPrinter() {
        return this.f7461h;
    }

    public int getRowCount() {
        return this.f7455b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.f7457d;
    }

    public final void h() {
        this.f7460g = 0;
        k kVar = this.f7454a;
        if (kVar != null) {
            kVar.l();
        }
        k kVar2 = this.f7455b;
        if (kVar2 != null) {
            kVar2.l();
        }
        if (kVar == null || kVar2 == null) {
            return;
        }
        kVar.m();
        kVar2.m();
    }

    public final void i(View view2, int i14, int i15, int i16, int i17) {
        view2.measure(ViewGroup.getChildMeasureSpec(i14, e(view2, true, false) + e(view2, true, true), i16), ViewGroup.getChildMeasureSpec(i15, e(view2, false, false) + e(view2, false, true), i17));
    }

    public final void j(int i14, int i15, boolean z14) {
        int i16;
        int i17;
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                i16 = i14;
                i17 = i15;
            } else {
                n nVar = (n) childAt.getLayoutParams();
                if (z14) {
                    i16 = i14;
                    i17 = i15;
                    i(childAt, i16, i17, ((ViewGroup.MarginLayoutParams) nVar).width, ((ViewGroup.MarginLayoutParams) nVar).height);
                } else {
                    i16 = i14;
                    i17 = i15;
                    boolean z15 = this.f7456c == 0;
                    q qVar = z15 ? nVar.f7511b : nVar.f7510a;
                    if (qVar.c(z15) == B) {
                        m mVar = qVar.f7518b;
                        int[] iArrH = (z15 ? this.f7454a : this.f7455b).h();
                        int iE = (iArrH[mVar.f7496b] - iArrH[mVar.f7495a]) - (e(childAt, z15, false) + e(childAt, z15, true));
                        if (z15) {
                            i(childAt, i16, i17, iE, ((ViewGroup.MarginLayoutParams) nVar).height);
                        } else {
                            i(childAt, i16, i17, ((ViewGroup.MarginLayoutParams) nVar).width, iE);
                        }
                    }
                }
            }
            i18++;
            i14 = i16;
            i15 = i17;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z15;
        GridLayout gridLayout = this;
        gridLayout.c();
        int i26 = i16 - i14;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        int i27 = (i26 - paddingLeft) - paddingRight;
        k kVar = gridLayout.f7454a;
        kVar.f7489v.f7512a = i27;
        kVar.f7490w.f7512a = -i27;
        boolean z16 = false;
        kVar.f7484q = false;
        kVar.h();
        int i28 = ((i17 - i15) - paddingTop) - paddingBottom;
        k kVar2 = gridLayout.f7455b;
        kVar2.f7489v.f7512a = i28;
        kVar2.f7490w.f7512a = -i28;
        kVar2.f7484q = false;
        kVar2.h();
        int[] iArrH = kVar.h();
        int[] iArrH2 = kVar2.h();
        int childCount = gridLayout.getChildCount();
        int i29 = 0;
        while (i29 < childCount) {
            View childAt = gridLayout.getChildAt(i29);
            if (childAt.getVisibility() == 8) {
                i19 = i29;
                i18 = i26;
                i24 = paddingLeft;
                i25 = paddingTop;
                z15 = z16;
            } else {
                n nVar = (n) childAt.getLayoutParams();
                q qVar = nVar.f7511b;
                q qVar2 = nVar.f7510a;
                m mVar = qVar.f7518b;
                m mVar2 = qVar2.f7518b;
                int i30 = i29;
                int i34 = iArrH[mVar.f7495a];
                int i35 = iArrH2[mVar2.f7495a];
                int i36 = iArrH[mVar.f7496b];
                int i37 = iArrH2[mVar2.f7496b];
                int i38 = i36 - i34;
                int i39 = i37 - i35;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                h hVarC = qVar.c(true);
                h hVarC2 = qVar2.c(false);
                p<q, l> pVarG = kVar.g();
                l lVar = pVarG.f7515c[pVarG.f7513a[i30]];
                p<q, l> pVarG2 = kVar2.g();
                i18 = i26;
                l lVar2 = pVarG2.f7515c[pVarG2.f7513a[i30]];
                int iD = hVarC.d(i38 - lVar.d(true), childAt);
                int iD2 = hVarC2.d(i39 - lVar2.d(true), childAt);
                int iE = gridLayout.e(childAt, true, true);
                int iE2 = gridLayout.e(childAt, false, true);
                int iE3 = gridLayout.e(childAt, true, false);
                int i44 = iE + iE3;
                int iE4 = iE2 + gridLayout.e(childAt, false, false);
                i19 = i30;
                i24 = paddingLeft;
                i25 = paddingTop;
                z15 = false;
                int iA = lVar.a(gridLayout, childAt, hVarC, measuredWidth + i44, true);
                int iA2 = lVar2.a(this, childAt, hVarC2, measuredHeight + iE4, false);
                int iE5 = hVarC.e(measuredWidth, i38 - i44);
                int iE6 = hVarC2.e(measuredHeight, i39 - iE4);
                int i45 = i34 + iD + iA;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                int i46 = getLayoutDirection() == 1 ? (((i18 - iE5) - paddingRight) - iE3) - i45 : i24 + iE + i45;
                int i47 = i25 + i35 + iD2 + iA2 + iE2;
                if (iE5 != childAt.getMeasuredWidth() || iE6 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iE5, 1073741824), View.MeasureSpec.makeMeasureSpec(iE6, 1073741824));
                }
                childAt.layout(i46, i47, iE5 + i46, iE6 + i47);
            }
            i29 = i19 + 1;
            gridLayout = this;
            paddingLeft = i24;
            paddingTop = i25;
            i26 = i18;
            z16 = z15;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int iJ;
        int iJ2;
        c();
        k kVar = this.f7455b;
        k kVar2 = this.f7454a;
        if (kVar2 != null && kVar != null) {
            kVar2.m();
            kVar.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i14), View.MeasureSpec.getMode(i14));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i15), View.MeasureSpec.getMode(i15));
        j(iMakeMeasureSpec, iMakeMeasureSpec2, true);
        if (this.f7456c == 0) {
            iJ2 = kVar2.j(iMakeMeasureSpec);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ = kVar.j(iMakeMeasureSpec2);
        } else {
            iJ = kVar.j(iMakeMeasureSpec2);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ2 = kVar2.j(iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iJ2 + paddingRight, getSuggestedMinimumWidth()), i14, 0), View.resolveSizeAndState(Math.max(iJ + paddingBottom, getSuggestedMinimumHeight()), i15, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i14) {
        this.f7458e = i14;
        requestLayout();
    }

    public void setColumnCount(int i14) {
        this.f7454a.o(i14);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z14) {
        k kVar = this.f7454a;
        kVar.f7488u = z14;
        kVar.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i14) {
        if (this.f7456c != i14) {
            this.f7456c = i14;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = f7439j;
        }
        this.f7461h = printer;
    }

    public void setRowCount(int i14) {
        this.f7455b.o(i14);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z14) {
        k kVar = this.f7455b;
        kVar.f7488u = z14;
        kVar.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z14) {
        this.f7457d = z14;
        requestLayout();
    }

    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7512a;

        public o() {
            this.f7512a = Integer.MIN_VALUE;
        }

        public final String toString() {
            return Integer.toString(this.f7512a);
        }

        public o(int i14) {
            this.f7512a = i14;
        }
    }

    public static class q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q f7516e = GridLayout.l(Integer.MIN_VALUE, 1, GridLayout.f7446q, 0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f7518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f7519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f7520d;

        private q(boolean z14, m mVar, h hVar, float f14) {
            this.f7517a = z14;
            this.f7518b = mVar;
            this.f7519c = hVar;
            this.f7520d = f14;
        }

        public final q a(h hVar) {
            return new q(this.f7517a, this.f7518b, hVar, this.f7520d);
        }

        public final q b(m mVar) {
            return new q(this.f7517a, mVar, this.f7519c, this.f7520d);
        }

        public final h c(boolean z14) {
            b bVar = GridLayout.f7446q;
            h hVar = this.f7519c;
            if (hVar != bVar) {
                return hVar;
            }
            if (this.f7520d == 0.0f) {
                return z14 ? GridLayout.f7449v : GridLayout.A;
            }
            return GridLayout.B;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            q qVar = (q) obj;
            return this.f7519c.equals(qVar.f7519c) && this.f7518b.equals(qVar.f7518b);
        }

        public final int hashCode() {
            return this.f7519c.hashCode() + (this.f7518b.hashCode() * 31);
        }

        public q(boolean z14, int i14, int i15, h hVar, float f14) {
            this(z14, new m(i14, i15 + i14), hVar, f14);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new n(getContext(), attributeSet);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
    }

    public static class n extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f7497c = new m(Integer.MIN_VALUE, BleCommunicationException.UNSPECIFIED_FAILURE).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f7498d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f7499e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f7500f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f7501g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f7502h = 6;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f7503i = 7;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f7504j = 8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f7505k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f7506l = 11;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f7507m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f7508n = 13;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f7509o = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f7510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q f7511b;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            q qVar = q.f7516e;
            this.f7510a = qVar;
            this.f7511b = qVar;
            int[] iArr = i8.a.f92216b;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(f7498d, Integer.MIN_VALUE);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f7499e, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f7500f, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f7501g, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f7502h, dimensionPixelSize);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                try {
                    int i14 = typedArrayObtainStyledAttributes2.getInt(f7509o, 0);
                    int i15 = typedArrayObtainStyledAttributes2.getInt(f7503i, Integer.MIN_VALUE);
                    int i16 = f7504j;
                    int i17 = f7497c;
                    this.f7511b = GridLayout.l(i15, typedArrayObtainStyledAttributes2.getInt(i16, i17), GridLayout.d(i14, true), typedArrayObtainStyledAttributes2.getFloat(f7505k, 0.0f));
                    this.f7510a = GridLayout.l(typedArrayObtainStyledAttributes2.getInt(f7506l, Integer.MIN_VALUE), typedArrayObtainStyledAttributes2.getInt(f7507m, i17), GridLayout.d(i14, false), typedArrayObtainStyledAttributes2.getFloat(f7508n, 0.0f));
                } finally {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            n nVar = (n) obj;
            return this.f7511b.equals(nVar.f7511b) && this.f7510a.equals(nVar.f7510a);
        }

        public final int hashCode() {
            return this.f7511b.hashCode() + (this.f7510a.hashCode() * 31);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i14, int i15) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i14, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i15, -2);
        }

        public n(q qVar, q qVar2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, qVar, qVar2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public n() {
            q qVar = q.f7516e;
            this(qVar, qVar);
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            q qVar = q.f7516e;
            this.f7510a = qVar;
            this.f7511b = qVar;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            q qVar = q.f7516e;
            this.f7510a = qVar;
            this.f7511b = qVar;
        }

        public n(n nVar) {
            super((ViewGroup.MarginLayoutParams) nVar);
            q qVar = q.f7516e;
            this.f7510a = qVar;
            this.f7511b = qVar;
            this.f7510a = nVar.f7510a;
            this.f7511b = nVar.f7511b;
        }

        private n(int i14, int i15, int i16, int i17, int i18, int i19, q qVar, q qVar2) {
            super(i14, i15);
            q qVar3 = q.f7516e;
            this.f7510a = qVar3;
            this.f7511b = qVar3;
            setMargins(i16, i17, i18, i19);
            this.f7510a = qVar;
            this.f7511b = qVar2;
        }
    }
}
