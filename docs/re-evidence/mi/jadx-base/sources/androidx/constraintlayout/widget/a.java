package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.ba7;
import defpackage.f7c;
import defpackage.ir5;
import defpackage.nqi;
import defpackage.u4j;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final int[] h = {0, 4, 8};
    public static SparseIntArray i = new SparseIntArray();
    public static SparseIntArray j = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2017b;
    public String c = "";
    public int d = 0;
    public HashMap<String, ConstraintAttribute> e = new HashMap<>();
    public boolean f = true;
    public HashMap<Integer, C0020a> g = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public static class C0020a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2019b;
        public final d c = new d();
        public final c d = new c();
        public final b e = new b();
        public final e f = new e();
        public HashMap<String, ConstraintAttribute> g = new HashMap<>();
        public C0021a h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a$a, reason: collision with other inner class name */
        public static class C0021a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f2020a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int[] f2021b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f2022k = new boolean[4];
            public int l = 0;

            public void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.f2020a;
                if (i3 >= iArr.length) {
                    this.f2020a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2021b;
                    this.f2021b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2020a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.f2021b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2022k;
                    this.f2022k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f2022k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            public void e(C0020a c0020a) {
                for (int i = 0; i < this.c; i++) {
                    a.W(c0020a, this.f2020a[i], this.f2021b[i]);
                }
                for (int i2 = 0; i2 < this.f; i2++) {
                    a.V(c0020a, this.d[i2], this.e[i2]);
                }
                for (int i3 = 0; i3 < this.i; i3++) {
                    a.X(c0020a, this.g[i3], this.h[i3]);
                }
                for (int i4 = 0; i4 < this.l; i4++) {
                    a.Y(c0020a, this.j[i4], this.f2022k[i4]);
                }
            }
        }

        public void d(C0020a c0020a) {
            C0021a c0021a = this.h;
            if (c0021a != null) {
                c0021a.e(c0020a);
            }
        }

        public void e(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.e;
            layoutParams.e = bVar.j;
            layoutParams.f = bVar.f2025k;
            layoutParams.g = bVar.l;
            layoutParams.h = bVar.m;
            layoutParams.i = bVar.n;
            layoutParams.j = bVar.o;
            layoutParams.f2003k = bVar.p;
            layoutParams.l = bVar.q;
            layoutParams.m = bVar.f2026r;
            layoutParams.n = bVar.s;
            layoutParams.o = bVar.t;
            layoutParams.s = bVar.u;
            layoutParams.t = bVar.v;
            layoutParams.u = bVar.w;
            layoutParams.v = bVar.x;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.J;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.K;
            layoutParams.A = bVar.T;
            layoutParams.B = bVar.S;
            layoutParams.x = bVar.P;
            layoutParams.z = bVar.R;
            layoutParams.G = bVar.y;
            layoutParams.H = bVar.z;
            layoutParams.p = bVar.B;
            layoutParams.q = bVar.C;
            layoutParams.f2004r = bVar.D;
            layoutParams.I = bVar.A;
            layoutParams.X = bVar.E;
            layoutParams.Y = bVar.F;
            layoutParams.M = bVar.V;
            layoutParams.L = bVar.W;
            layoutParams.O = bVar.Y;
            layoutParams.N = bVar.X;
            layoutParams.a0 = bVar.n0;
            layoutParams.b0 = bVar.o0;
            layoutParams.P = bVar.Z;
            layoutParams.Q = bVar.a0;
            layoutParams.T = bVar.b0;
            layoutParams.U = bVar.c0;
            layoutParams.R = bVar.d0;
            layoutParams.S = bVar.e0;
            layoutParams.V = bVar.f0;
            layoutParams.W = bVar.g0;
            layoutParams.Z = bVar.G;
            layoutParams.c = bVar.h;
            layoutParams.f2001a = bVar.f;
            layoutParams.f2002b = bVar.g;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.d;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.e;
            String str = bVar.m0;
            if (str != null) {
                layoutParams.c0 = str;
            }
            layoutParams.d0 = bVar.q0;
            layoutParams.setMarginStart(bVar.M);
            layoutParams.setMarginEnd(this.e.L);
            layoutParams.c();
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0020a clone() {
            C0020a c0020a = new C0020a();
            c0020a.e.a(this.e);
            c0020a.d.a(this.d);
            c0020a.c.a(this.c);
            c0020a.f.a(this.f);
            c0020a.f2018a = this.f2018a;
            c0020a.h = this.h;
            return c0020a;
        }

        public final void g(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2018a = i;
            b bVar = this.e;
            bVar.j = layoutParams.e;
            bVar.f2025k = layoutParams.f;
            bVar.l = layoutParams.g;
            bVar.m = layoutParams.h;
            bVar.n = layoutParams.i;
            bVar.o = layoutParams.j;
            bVar.p = layoutParams.f2003k;
            bVar.q = layoutParams.l;
            bVar.f2026r = layoutParams.m;
            bVar.s = layoutParams.n;
            bVar.t = layoutParams.o;
            bVar.u = layoutParams.s;
            bVar.v = layoutParams.t;
            bVar.w = layoutParams.u;
            bVar.x = layoutParams.v;
            bVar.y = layoutParams.G;
            bVar.z = layoutParams.H;
            bVar.A = layoutParams.I;
            bVar.B = layoutParams.p;
            bVar.C = layoutParams.q;
            bVar.D = layoutParams.f2004r;
            bVar.E = layoutParams.X;
            bVar.F = layoutParams.Y;
            bVar.G = layoutParams.Z;
            bVar.h = layoutParams.c;
            bVar.f = layoutParams.f2001a;
            bVar.g = layoutParams.f2002b;
            bVar.d = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.e = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.H = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.J = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.K = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.N = layoutParams.D;
            bVar.V = layoutParams.M;
            bVar.W = layoutParams.L;
            bVar.Y = layoutParams.O;
            bVar.X = layoutParams.N;
            bVar.n0 = layoutParams.a0;
            bVar.o0 = layoutParams.b0;
            bVar.Z = layoutParams.P;
            bVar.a0 = layoutParams.Q;
            bVar.b0 = layoutParams.T;
            bVar.c0 = layoutParams.U;
            bVar.d0 = layoutParams.R;
            bVar.e0 = layoutParams.S;
            bVar.f0 = layoutParams.V;
            bVar.g0 = layoutParams.W;
            bVar.m0 = layoutParams.c0;
            bVar.P = layoutParams.x;
            bVar.R = layoutParams.z;
            bVar.O = layoutParams.w;
            bVar.Q = layoutParams.y;
            bVar.T = layoutParams.A;
            bVar.S = layoutParams.B;
            bVar.U = layoutParams.C;
            bVar.q0 = layoutParams.d0;
            bVar.L = layoutParams.getMarginEnd();
            this.e.M = layoutParams.getMarginStart();
        }

        public final void h(int i, Constraints.LayoutParams layoutParams) {
            g(i, layoutParams);
            this.c.d = layoutParams.x0;
            e eVar = this.f;
            eVar.f2033b = layoutParams.A0;
            eVar.c = layoutParams.B0;
            eVar.d = layoutParams.C0;
            eVar.e = layoutParams.D0;
            eVar.f = layoutParams.E0;
            eVar.g = layoutParams.F0;
            eVar.h = layoutParams.G0;
            eVar.j = layoutParams.H0;
            eVar.f2034k = layoutParams.I0;
            eVar.l = layoutParams.J0;
            eVar.n = layoutParams.z0;
            eVar.m = layoutParams.y0;
        }

        public final void i(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            h(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.e;
                bVar.j0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.h0 = barrier.getType();
                this.e.k0 = barrier.getReferencedIds();
                this.e.i0 = barrier.getMargin();
            }
        }
    }

    public static class b {
        public static SparseIntArray r0;
        public int d;
        public int e;
        public int[] k0;
        public String l0;
        public String m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2023a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2024b = false;
        public boolean c = false;
        public int f = -1;
        public int g = -1;
        public float h = -1.0f;
        public boolean i = true;
        public int j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2025k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2026r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            r0 = sparseIntArray;
            sparseIntArray.append(u4j.w8, 24);
            r0.append(u4j.x8, 25);
            r0.append(u4j.z8, 28);
            r0.append(u4j.A8, 29);
            r0.append(u4j.F8, 35);
            r0.append(u4j.E8, 34);
            r0.append(u4j.g8, 4);
            r0.append(u4j.f8, 3);
            r0.append(u4j.d8, 1);
            r0.append(u4j.L8, 6);
            r0.append(u4j.M8, 7);
            r0.append(u4j.n8, 17);
            r0.append(u4j.o8, 18);
            r0.append(u4j.p8, 19);
            r0.append(u4j.Z7, 90);
            r0.append(u4j.L7, 26);
            r0.append(u4j.B8, 31);
            r0.append(u4j.C8, 32);
            r0.append(u4j.m8, 10);
            r0.append(u4j.l8, 9);
            r0.append(u4j.P8, 13);
            r0.append(u4j.S8, 16);
            r0.append(u4j.Q8, 14);
            r0.append(u4j.N8, 11);
            r0.append(u4j.R8, 15);
            r0.append(u4j.O8, 12);
            r0.append(u4j.I8, 38);
            r0.append(u4j.u8, 37);
            r0.append(u4j.t8, 39);
            r0.append(u4j.H8, 40);
            r0.append(u4j.s8, 20);
            r0.append(u4j.G8, 36);
            r0.append(u4j.k8, 5);
            r0.append(u4j.v8, 91);
            r0.append(u4j.D8, 91);
            r0.append(u4j.y8, 91);
            r0.append(u4j.e8, 91);
            r0.append(u4j.c8, 91);
            r0.append(u4j.O7, 23);
            r0.append(u4j.Q7, 27);
            r0.append(u4j.S7, 30);
            r0.append(u4j.T7, 8);
            r0.append(u4j.P7, 33);
            r0.append(u4j.R7, 2);
            r0.append(u4j.M7, 22);
            r0.append(u4j.N7, 21);
            r0.append(u4j.J8, 41);
            r0.append(u4j.q8, 42);
            r0.append(u4j.b8, 41);
            r0.append(u4j.a8, 42);
            r0.append(u4j.T8, 76);
            r0.append(u4j.h8, 61);
            r0.append(u4j.j8, 62);
            r0.append(u4j.i8, 63);
            r0.append(u4j.K8, 69);
            r0.append(u4j.r8, 70);
            r0.append(u4j.X7, 71);
            r0.append(u4j.V7, 72);
            r0.append(u4j.W7, 73);
            r0.append(u4j.Y7, 74);
            r0.append(u4j.U7, 75);
        }

        public void a(b bVar) {
            this.f2023a = bVar.f2023a;
            this.d = bVar.d;
            this.f2024b = bVar.f2024b;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.f2025k = bVar.f2025k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.f2026r = bVar.f2026r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.m0 = bVar.m0;
            int[] iArr = bVar.k0;
            if (iArr == null || bVar.l0 != null) {
                this.k0 = null;
            } else {
                this.k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.l0 = bVar.l0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.K7);
            this.f2024b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = r0.get(index);
                switch (i2) {
                    case 1:
                        this.f2026r = a.N(typedArrayObtainStyledAttributes, index, this.f2026r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.q = a.N(typedArrayObtainStyledAttributes, index, this.q);
                        break;
                    case 4:
                        this.p = a.N(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.x = a.N(typedArrayObtainStyledAttributes, index, this.x);
                        break;
                    case 10:
                        this.w = a.N(typedArrayObtainStyledAttributes, index, this.w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 18:
                        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                        break;
                    case 19:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 20:
                        this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 21:
                        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.e);
                        break;
                    case 22:
                        this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.j = a.N(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 25:
                        this.f2025k = a.N(typedArrayObtainStyledAttributes, index, this.f2025k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.l = a.N(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 29:
                        this.m = a.N(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.u = a.N(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case 32:
                        this.v = a.N(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.o = a.N(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 35:
                        this.n = a.N(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 36:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        a.O(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        a.O(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.B = a.N(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.h0 = typedArrayObtainStyledAttributes.getInt(index, this.h0);
                                        break;
                                    case 73:
                                        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        break;
                                    case 74:
                                        this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.p0);
                                        break;
                                    case 76:
                                        this.q0 = typedArrayObtainStyledAttributes.getInt(index, this.q0);
                                        break;
                                    case 77:
                                        this.s = a.N(typedArrayObtainStyledAttributes, index, this.s);
                                        break;
                                    case 78:
                                        this.t = a.N(typedArrayObtainStyledAttributes, index, this.t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.a0 = typedArrayObtainStyledAttributes.getInt(index, this.a0);
                                        break;
                                    case 83:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 84:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 85:
                                        this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        break;
                                    case 86:
                                        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 87:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 88:
                                        this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 89:
                                        this.m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.i = typedArrayObtainStyledAttributes.getBoolean(index, this.i);
                                        break;
                                    case 91:
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(r0.get(index));
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Unknown attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static SparseIntArray o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2027a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2028b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2029k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(u4j.l9, 1);
            o.append(u4j.n9, 2);
            o.append(u4j.r9, 3);
            o.append(u4j.k9, 4);
            o.append(u4j.j9, 5);
            o.append(u4j.i9, 6);
            o.append(u4j.m9, 7);
            o.append(u4j.q9, 8);
            o.append(u4j.p9, 9);
            o.append(u4j.o9, 10);
        }

        public void a(c cVar) {
            this.f2027a = cVar.f2027a;
            this.f2028b = cVar.f2028b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.i = cVar.i;
            this.g = cVar.g;
            this.h = cVar.h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.h9);
            this.f2027a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.d = ba7.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2028b = a.N(typedArrayObtainStyledAttributes, index, this.f2028b);
                        break;
                    case 6:
                        this.c = typedArrayObtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.f2029k = typedArrayObtainStyledAttributes.getInteger(index, this.f2029k);
                        break;
                    case 9:
                        this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                            } else {
                                this.m = -1;
                            }
                        } else {
                            this.m = typedArrayObtainStyledAttributes.getInteger(index, this.n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2030a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2031b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.f2030a = dVar.f2030a;
            this.f2031b = dVar.f2031b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.Pa);
            this.f2030a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.Ra) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == u4j.Qa) {
                    this.f2031b = typedArrayObtainStyledAttributes.getInt(index, this.f2031b);
                    this.f2031b = a.h[this.f2031b];
                } else if (index == u4j.Ta) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                } else if (index == u4j.Sa) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {
        public static SparseIntArray o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2032a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2033b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f2034k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(u4j.pb, 1);
            o.append(u4j.qb, 2);
            o.append(u4j.rb, 3);
            o.append(u4j.nb, 4);
            o.append(u4j.ob, 5);
            o.append(u4j.jb, 6);
            o.append(u4j.kb, 7);
            o.append(u4j.lb, 8);
            o.append(u4j.mb, 9);
            o.append(u4j.sb, 10);
            o.append(u4j.tb, 11);
            o.append(u4j.ub, 12);
        }

        public void a(e eVar) {
            this.f2032a = eVar.f2032a;
            this.f2033b = eVar.f2033b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.f2034k = eVar.f2034k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.ib);
            this.f2032a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.f2033b = typedArrayObtainStyledAttributes.getFloat(index, this.f2033b);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.f2034k = typedArrayObtainStyledAttributes.getDimension(index, this.f2034k);
                        break;
                    case 10:
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = a.N(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        i.append(u4j.K0, 25);
        i.append(u4j.L0, 26);
        i.append(u4j.N0, 29);
        i.append(u4j.O0, 30);
        i.append(u4j.U0, 36);
        i.append(u4j.T0, 35);
        i.append(u4j.r0, 4);
        i.append(u4j.q0, 3);
        i.append(u4j.m0, 1);
        i.append(u4j.o0, 91);
        i.append(u4j.n0, 92);
        i.append(u4j.d1, 6);
        i.append(u4j.e1, 7);
        i.append(u4j.y0, 17);
        i.append(u4j.z0, 18);
        i.append(u4j.A0, 19);
        i.append(u4j.i0, 99);
        i.append(u4j.E, 27);
        i.append(u4j.P0, 32);
        i.append(u4j.Q0, 33);
        i.append(u4j.x0, 10);
        i.append(u4j.w0, 9);
        i.append(u4j.h1, 13);
        i.append(u4j.k1, 16);
        i.append(u4j.i1, 14);
        i.append(u4j.f1, 11);
        i.append(u4j.j1, 15);
        i.append(u4j.g1, 12);
        i.append(u4j.X0, 40);
        i.append(u4j.I0, 39);
        i.append(u4j.H0, 41);
        i.append(u4j.W0, 42);
        i.append(u4j.G0, 20);
        i.append(u4j.V0, 37);
        i.append(u4j.v0, 5);
        i.append(u4j.J0, 87);
        i.append(u4j.S0, 87);
        i.append(u4j.M0, 87);
        i.append(u4j.p0, 87);
        i.append(u4j.l0, 87);
        i.append(u4j.J, 24);
        i.append(u4j.L, 28);
        i.append(u4j.X, 31);
        i.append(u4j.Y, 8);
        i.append(u4j.K, 34);
        i.append(u4j.M, 2);
        i.append(u4j.H, 23);
        i.append(u4j.I, 21);
        i.append(u4j.Y0, 95);
        i.append(u4j.B0, 96);
        i.append(u4j.G, 22);
        i.append(u4j.N, 43);
        i.append(u4j.a0, 44);
        i.append(u4j.V, 45);
        i.append(u4j.W, 46);
        i.append(u4j.U, 60);
        i.append(u4j.S, 47);
        i.append(u4j.T, 48);
        i.append(u4j.O, 49);
        i.append(u4j.P, 50);
        i.append(u4j.Q, 51);
        i.append(u4j.R, 52);
        i.append(u4j.Z, 53);
        i.append(u4j.Z0, 54);
        i.append(u4j.C0, 55);
        i.append(u4j.a1, 56);
        i.append(u4j.D0, 57);
        i.append(u4j.b1, 58);
        i.append(u4j.E0, 59);
        i.append(u4j.s0, 61);
        i.append(u4j.u0, 62);
        i.append(u4j.t0, 63);
        i.append(u4j.b0, 64);
        i.append(u4j.u1, 65);
        i.append(u4j.h0, 66);
        i.append(u4j.v1, 67);
        i.append(u4j.n1, 79);
        i.append(u4j.F, 38);
        i.append(u4j.m1, 68);
        i.append(u4j.c1, 69);
        i.append(u4j.F0, 70);
        i.append(u4j.l1, 97);
        i.append(u4j.f0, 71);
        i.append(u4j.d0, 72);
        i.append(u4j.e0, 73);
        i.append(u4j.g0, 74);
        i.append(u4j.c0, 75);
        i.append(u4j.o1, 76);
        i.append(u4j.R0, 77);
        i.append(u4j.w1, 78);
        i.append(u4j.k0, 80);
        i.append(u4j.j0, 81);
        i.append(u4j.p1, 82);
        i.append(u4j.t1, 83);
        i.append(u4j.s1, 84);
        i.append(u4j.r1, 85);
        i.append(u4j.q1, 86);
        j.append(u4j.L4, 6);
        j.append(u4j.L4, 7);
        j.append(u4j.G3, 27);
        j.append(u4j.O4, 13);
        j.append(u4j.R4, 16);
        j.append(u4j.P4, 14);
        j.append(u4j.M4, 11);
        j.append(u4j.Q4, 15);
        j.append(u4j.N4, 12);
        j.append(u4j.F4, 40);
        j.append(u4j.y4, 39);
        j.append(u4j.x4, 41);
        j.append(u4j.E4, 42);
        j.append(u4j.w4, 20);
        j.append(u4j.D4, 37);
        j.append(u4j.q4, 5);
        j.append(u4j.z4, 87);
        j.append(u4j.C4, 87);
        j.append(u4j.A4, 87);
        j.append(u4j.n4, 87);
        j.append(u4j.m4, 87);
        j.append(u4j.L3, 24);
        j.append(u4j.N3, 28);
        j.append(u4j.Z3, 31);
        j.append(u4j.a4, 8);
        j.append(u4j.M3, 34);
        j.append(u4j.O3, 2);
        j.append(u4j.J3, 23);
        j.append(u4j.K3, 21);
        j.append(u4j.G4, 95);
        j.append(u4j.r4, 96);
        j.append(u4j.I3, 22);
        j.append(u4j.P3, 43);
        j.append(u4j.c4, 44);
        j.append(u4j.X3, 45);
        j.append(u4j.Y3, 46);
        j.append(u4j.W3, 60);
        j.append(u4j.U3, 47);
        j.append(u4j.V3, 48);
        j.append(u4j.Q3, 49);
        j.append(u4j.R3, 50);
        j.append(u4j.S3, 51);
        j.append(u4j.T3, 52);
        j.append(u4j.b4, 53);
        j.append(u4j.H4, 54);
        j.append(u4j.s4, 55);
        j.append(u4j.I4, 56);
        j.append(u4j.t4, 57);
        j.append(u4j.J4, 58);
        j.append(u4j.u4, 59);
        j.append(u4j.p4, 62);
        j.append(u4j.o4, 63);
        j.append(u4j.d4, 64);
        j.append(u4j.c5, 65);
        j.append(u4j.j4, 66);
        j.append(u4j.d5, 67);
        j.append(u4j.U4, 79);
        j.append(u4j.H3, 38);
        j.append(u4j.V4, 98);
        j.append(u4j.T4, 68);
        j.append(u4j.K4, 69);
        j.append(u4j.v4, 70);
        j.append(u4j.h4, 71);
        j.append(u4j.f4, 72);
        j.append(u4j.g4, 73);
        j.append(u4j.i4, 74);
        j.append(u4j.e4, 75);
        j.append(u4j.W4, 76);
        j.append(u4j.B4, 77);
        j.append(u4j.e5, 78);
        j.append(u4j.l4, 80);
        j.append(u4j.k4, 81);
        j.append(u4j.X4, 82);
        j.append(u4j.b5, 83);
        j.append(u4j.a5, 84);
        j.append(u4j.Z4, 85);
        j.append(u4j.Y4, 86);
        j.append(u4j.S4, 97);
    }

    public static int N(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static void O(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        boolean z;
        C0020a.C0021a c0021a;
        b bVar;
        ConstraintLayout.LayoutParams layoutParams;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i2).type;
        if (i4 == 3) {
            P(obj, typedArray.getString(i2), i3);
            return;
        }
        int i5 = 0;
        if (i4 != 5) {
            dimensionPixelSize = typedArray.getInt(i2, 0);
            if (dimensionPixelSize == -4) {
                z = true;
                i5 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i5;
                    layoutParams.a0 = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i5;
                    layoutParams.b0 = z;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i3 == 0) {
                    bVar.d = i5;
                    bVar.n0 = z;
                    return;
                } else {
                    bVar.e = i5;
                    bVar.o0 = z;
                    return;
                }
            }
            if (obj instanceof C0020a.C0021a) {
                c0021a = (C0020a.C0021a) obj;
                if (i3 == 0) {
                    c0021a.b(23, i5);
                    c0021a.d(80, z);
                } else {
                    c0021a.b(21, i5);
                    c0021a.d(81, z);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
        i5 = dimensionPixelSize;
        z = false;
        if (obj instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) obj;
            if (i3 == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = i5;
                layoutParams.a0 = z;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = i5;
                layoutParams.b0 = z;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i3 == 0) {
                bVar.d = i5;
                bVar.n0 = z;
                return;
            } else {
                bVar.e = i5;
                bVar.o0 = z;
                return;
            }
        }
        if (obj instanceof C0020a.C0021a) {
            c0021a = (C0020a.C0021a) obj;
            if (i3 == 0) {
                c0021a.b(23, i5);
                c0021a.d(80, z);
            } else {
                c0021a.b(21, i5);
                c0021a.d(81, z);
            }
        }
    }

    public static void P(Object obj, String str, int i2) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    Q(layoutParams, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof C0020a.C0021a) {
                        ((C0020a.C0021a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.L = f;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.M = f;
                        }
                    } else if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (i2 == 0) {
                            bVar.d = 0;
                            bVar.W = f;
                        } else {
                            bVar.e = 0;
                            bVar.V = f;
                        }
                    } else if (obj instanceof C0020a.C0021a) {
                        C0020a.C0021a c0021a = (C0020a.C0021a) obj;
                        if (i2 == 0) {
                            c0021a.b(23, 0);
                            c0021a.a(39, f);
                        } else {
                            c0021a.b(21, 0);
                            c0021a.a(40, f);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.V = fMax;
                            layoutParams3.P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.W = fMax;
                            layoutParams3.Q = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i2 == 0) {
                            bVar2.d = 0;
                            bVar2.f0 = fMax;
                            bVar2.Z = 2;
                        } else {
                            bVar2.e = 0;
                            bVar2.g0 = fMax;
                            bVar2.a0 = 2;
                        }
                    } else if (obj instanceof C0020a.C0021a) {
                        C0020a.C0021a c0021a2 = (C0020a.C0021a) obj;
                        if (i2 == 0) {
                            c0021a2.b(23, 0);
                            c0021a2.b(54, 2);
                        } else {
                            c0021a2.b(21, 0);
                            c0021a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void Q(ConstraintLayout.LayoutParams layoutParams, String str) {
        float fAbs = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i3 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (strSubstring.equalsIgnoreCase(com.xiaomi.onetrack.api.c.f13756b)) {
                    i2 = 1;
                }
                i3 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i3);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i3, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            fAbs = i2 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.I = str;
        layoutParams.J = fAbs;
        layoutParams.K = i2;
    }

    public static void S(Context context, C0020a c0020a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C0020a.C0021a c0021a = new C0020a.C0021a();
        c0020a.h = c0021a;
        c0020a.d.f2027a = false;
        c0020a.e.f2024b = false;
        c0020a.c.f2030a = false;
        c0020a.f.f2032a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            switch (j.get(index)) {
                case 2:
                    c0021a.b(2, typedArray.getDimensionPixelSize(index, c0020a.e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(i.get(index));
                    break;
                case 5:
                    c0021a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0021a.b(6, typedArray.getDimensionPixelOffset(index, c0020a.e.E));
                    break;
                case 7:
                    c0021a.b(7, typedArray.getDimensionPixelOffset(index, c0020a.e.F));
                    break;
                case 8:
                    c0021a.b(8, typedArray.getDimensionPixelSize(index, c0020a.e.L));
                    break;
                case 11:
                    c0021a.b(11, typedArray.getDimensionPixelSize(index, c0020a.e.R));
                    break;
                case 12:
                    c0021a.b(12, typedArray.getDimensionPixelSize(index, c0020a.e.S));
                    break;
                case 13:
                    c0021a.b(13, typedArray.getDimensionPixelSize(index, c0020a.e.O));
                    break;
                case 14:
                    c0021a.b(14, typedArray.getDimensionPixelSize(index, c0020a.e.Q));
                    break;
                case 15:
                    c0021a.b(15, typedArray.getDimensionPixelSize(index, c0020a.e.T));
                    break;
                case 16:
                    c0021a.b(16, typedArray.getDimensionPixelSize(index, c0020a.e.P));
                    break;
                case 17:
                    c0021a.b(17, typedArray.getDimensionPixelOffset(index, c0020a.e.f));
                    break;
                case 18:
                    c0021a.b(18, typedArray.getDimensionPixelOffset(index, c0020a.e.g));
                    break;
                case 19:
                    c0021a.a(19, typedArray.getFloat(index, c0020a.e.h));
                    break;
                case 20:
                    c0021a.a(20, typedArray.getFloat(index, c0020a.e.y));
                    break;
                case 21:
                    c0021a.b(21, typedArray.getLayoutDimension(index, c0020a.e.e));
                    break;
                case 22:
                    c0021a.b(22, h[typedArray.getInt(index, c0020a.c.f2031b)]);
                    break;
                case 23:
                    c0021a.b(23, typedArray.getLayoutDimension(index, c0020a.e.d));
                    break;
                case 24:
                    c0021a.b(24, typedArray.getDimensionPixelSize(index, c0020a.e.H));
                    break;
                case 27:
                    c0021a.b(27, typedArray.getInt(index, c0020a.e.G));
                    break;
                case 28:
                    c0021a.b(28, typedArray.getDimensionPixelSize(index, c0020a.e.I));
                    break;
                case 31:
                    c0021a.b(31, typedArray.getDimensionPixelSize(index, c0020a.e.M));
                    break;
                case 34:
                    c0021a.b(34, typedArray.getDimensionPixelSize(index, c0020a.e.J));
                    break;
                case 37:
                    c0021a.a(37, typedArray.getFloat(index, c0020a.e.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, c0020a.f2018a);
                    c0020a.f2018a = resourceId;
                    c0021a.b(38, resourceId);
                    break;
                case 39:
                    c0021a.a(39, typedArray.getFloat(index, c0020a.e.W));
                    break;
                case 40:
                    c0021a.a(40, typedArray.getFloat(index, c0020a.e.V));
                    break;
                case 41:
                    c0021a.b(41, typedArray.getInt(index, c0020a.e.X));
                    break;
                case 42:
                    c0021a.b(42, typedArray.getInt(index, c0020a.e.Y));
                    break;
                case 43:
                    c0021a.a(43, typedArray.getFloat(index, c0020a.c.d));
                    break;
                case 44:
                    c0021a.d(44, true);
                    c0021a.a(44, typedArray.getDimension(index, c0020a.f.n));
                    break;
                case 45:
                    c0021a.a(45, typedArray.getFloat(index, c0020a.f.c));
                    break;
                case 46:
                    c0021a.a(46, typedArray.getFloat(index, c0020a.f.d));
                    break;
                case 47:
                    c0021a.a(47, typedArray.getFloat(index, c0020a.f.e));
                    break;
                case 48:
                    c0021a.a(48, typedArray.getFloat(index, c0020a.f.f));
                    break;
                case 49:
                    c0021a.a(49, typedArray.getDimension(index, c0020a.f.g));
                    break;
                case 50:
                    c0021a.a(50, typedArray.getDimension(index, c0020a.f.h));
                    break;
                case 51:
                    c0021a.a(51, typedArray.getDimension(index, c0020a.f.j));
                    break;
                case 52:
                    c0021a.a(52, typedArray.getDimension(index, c0020a.f.f2034k));
                    break;
                case 53:
                    c0021a.a(53, typedArray.getDimension(index, c0020a.f.l));
                    break;
                case 54:
                    c0021a.b(54, typedArray.getInt(index, c0020a.e.Z));
                    break;
                case 55:
                    c0021a.b(55, typedArray.getInt(index, c0020a.e.a0));
                    break;
                case 56:
                    c0021a.b(56, typedArray.getDimensionPixelSize(index, c0020a.e.b0));
                    break;
                case 57:
                    c0021a.b(57, typedArray.getDimensionPixelSize(index, c0020a.e.c0));
                    break;
                case 58:
                    c0021a.b(58, typedArray.getDimensionPixelSize(index, c0020a.e.d0));
                    break;
                case 59:
                    c0021a.b(59, typedArray.getDimensionPixelSize(index, c0020a.e.e0));
                    break;
                case 60:
                    c0021a.a(60, typedArray.getFloat(index, c0020a.f.f2033b));
                    break;
                case 62:
                    c0021a.b(62, typedArray.getDimensionPixelSize(index, c0020a.e.C));
                    break;
                case 63:
                    c0021a.a(63, typedArray.getFloat(index, c0020a.e.D));
                    break;
                case 64:
                    c0021a.b(64, N(typedArray, index, c0020a.d.f2028b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0021a.c(65, typedArray.getString(index));
                    } else {
                        c0021a.c(65, ba7.c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0021a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0021a.a(67, typedArray.getFloat(index, c0020a.d.i));
                    break;
                case 68:
                    c0021a.a(68, typedArray.getFloat(index, c0020a.c.e));
                    break;
                case 69:
                    c0021a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0021a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    c0021a.b(72, typedArray.getInt(index, c0020a.e.h0));
                    break;
                case 73:
                    c0021a.b(73, typedArray.getDimensionPixelSize(index, c0020a.e.i0));
                    break;
                case 74:
                    c0021a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0021a.d(75, typedArray.getBoolean(index, c0020a.e.p0));
                    break;
                case 76:
                    c0021a.b(76, typedArray.getInt(index, c0020a.d.e));
                    break;
                case 77:
                    c0021a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0021a.b(78, typedArray.getInt(index, c0020a.c.c));
                    break;
                case 79:
                    c0021a.a(79, typedArray.getFloat(index, c0020a.d.g));
                    break;
                case 80:
                    c0021a.d(80, typedArray.getBoolean(index, c0020a.e.n0));
                    break;
                case 81:
                    c0021a.d(81, typedArray.getBoolean(index, c0020a.e.o0));
                    break;
                case 82:
                    c0021a.b(82, typedArray.getInteger(index, c0020a.d.c));
                    break;
                case 83:
                    c0021a.b(83, N(typedArray, index, c0020a.f.i));
                    break;
                case 84:
                    c0021a.b(84, typedArray.getInteger(index, c0020a.d.f2029k));
                    break;
                case 85:
                    c0021a.a(85, typedArray.getFloat(index, c0020a.d.j));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        c0020a.d.n = typedArray.getResourceId(index, -1);
                        c0021a.b(89, c0020a.d.n);
                        c cVar = c0020a.d;
                        if (cVar.n != -1) {
                            cVar.m = -2;
                            c0021a.b(88, -2);
                        }
                    } else if (i3 == 3) {
                        c0020a.d.l = typedArray.getString(index);
                        c0021a.c(90, c0020a.d.l);
                        if (c0020a.d.l.indexOf("/") > 0) {
                            c0020a.d.n = typedArray.getResourceId(index, -1);
                            c0021a.b(89, c0020a.d.n);
                            c0020a.d.m = -2;
                            c0021a.b(88, -2);
                        } else {
                            c0020a.d.m = -1;
                            c0021a.b(88, -1);
                        }
                    } else {
                        c cVar2 = c0020a.d;
                        cVar2.m = typedArray.getInteger(index, cVar2.n);
                        c0021a.b(88, c0020a.d.m);
                    }
                    break;
                case 87:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unused attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(i.get(index));
                    break;
                case 93:
                    c0021a.b(93, typedArray.getDimensionPixelSize(index, c0020a.e.N));
                    break;
                case 94:
                    c0021a.b(94, typedArray.getDimensionPixelSize(index, c0020a.e.U));
                    break;
                case 95:
                    O(c0021a, typedArray, index, 0);
                    break;
                case 96:
                    O(c0021a, typedArray, index, 1);
                    break;
                case 97:
                    c0021a.b(97, typedArray.getInt(index, c0020a.e.q0));
                    break;
                case 98:
                    if (MotionLayout.E0) {
                        int resourceId2 = typedArray.getResourceId(index, c0020a.f2018a);
                        c0020a.f2018a = resourceId2;
                        if (resourceId2 == -1) {
                            c0020a.f2019b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c0020a.f2019b = typedArray.getString(index);
                    } else {
                        c0020a.f2018a = typedArray.getResourceId(index, c0020a.f2018a);
                    }
                    break;
                case 99:
                    c0021a.d(99, typedArray.getBoolean(index, c0020a.e.i));
                    break;
            }
        }
    }

    public static void V(C0020a c0020a, int i2, float f) {
        if (i2 == 19) {
            c0020a.e.h = f;
        }
        if (i2 == 20) {
            c0020a.e.y = f;
            return;
        }
        if (i2 == 37) {
            c0020a.e.z = f;
            return;
        }
        if (i2 == 60) {
            c0020a.f.f2033b = f;
            return;
        }
        if (i2 == 63) {
            c0020a.e.D = f;
            return;
        }
        if (i2 == 79) {
            c0020a.d.g = f;
            return;
        }
        if (i2 == 85) {
            c0020a.d.j = f;
            return;
        }
        if (i2 == 39) {
            c0020a.e.W = f;
            return;
        }
        if (i2 == 40) {
            c0020a.e.V = f;
            return;
        }
        switch (i2) {
            case 43:
                c0020a.c.d = f;
                break;
            case 44:
                e eVar = c0020a.f;
                eVar.n = f;
                eVar.m = true;
                break;
            case 45:
                c0020a.f.c = f;
                break;
            case 46:
                c0020a.f.d = f;
                break;
            case 47:
                c0020a.f.e = f;
                break;
            case 48:
                c0020a.f.f = f;
                break;
            case 49:
                c0020a.f.g = f;
                break;
            case 50:
                c0020a.f.h = f;
                break;
            case 51:
                c0020a.f.j = f;
                break;
            case 52:
                c0020a.f.f2034k = f;
                break;
            case 53:
                c0020a.f.l = f;
                break;
            default:
                switch (i2) {
                    case 67:
                        c0020a.d.i = f;
                        break;
                    case 68:
                        c0020a.c.e = f;
                        break;
                    case 69:
                        c0020a.e.f0 = f;
                        break;
                    case 70:
                        c0020a.e.g0 = f;
                        break;
                }
                break;
        }
    }

    public static void W(C0020a c0020a, int i2, int i3) {
        if (i2 == 6) {
            c0020a.e.E = i3;
        }
        if (i2 == 7) {
            c0020a.e.F = i3;
            return;
        }
        if (i2 == 8) {
            c0020a.e.L = i3;
            return;
        }
        if (i2 == 27) {
            c0020a.e.G = i3;
            return;
        }
        if (i2 == 28) {
            c0020a.e.I = i3;
            return;
        }
        if (i2 == 41) {
            c0020a.e.X = i3;
            return;
        }
        if (i2 == 42) {
            c0020a.e.Y = i3;
            return;
        }
        if (i2 == 61) {
            c0020a.e.B = i3;
            return;
        }
        if (i2 == 62) {
            c0020a.e.C = i3;
            return;
        }
        if (i2 == 72) {
            c0020a.e.h0 = i3;
            return;
        }
        if (i2 == 73) {
            c0020a.e.i0 = i3;
            return;
        }
        if (i2 == 88) {
            c0020a.d.m = i3;
            return;
        }
        if (i2 == 89) {
            c0020a.d.n = i3;
            return;
        }
        switch (i2) {
            case 2:
                c0020a.e.K = i3;
                break;
            case 11:
                c0020a.e.R = i3;
                break;
            case 12:
                c0020a.e.S = i3;
                break;
            case 13:
                c0020a.e.O = i3;
                break;
            case 14:
                c0020a.e.Q = i3;
                break;
            case 15:
                c0020a.e.T = i3;
                break;
            case 16:
                c0020a.e.P = i3;
                break;
            case 17:
                c0020a.e.f = i3;
                break;
            case 18:
                c0020a.e.g = i3;
                break;
            case 31:
                c0020a.e.M = i3;
                break;
            case 34:
                c0020a.e.J = i3;
                break;
            case 38:
                c0020a.f2018a = i3;
                break;
            case 64:
                c0020a.d.f2028b = i3;
                break;
            case 66:
                c0020a.d.f = i3;
                break;
            case 76:
                c0020a.d.e = i3;
                break;
            case 78:
                c0020a.c.c = i3;
                break;
            case 93:
                c0020a.e.N = i3;
                break;
            case 94:
                c0020a.e.U = i3;
                break;
            case 97:
                c0020a.e.q0 = i3;
                break;
            default:
                switch (i2) {
                    case 21:
                        c0020a.e.e = i3;
                        break;
                    case 22:
                        c0020a.c.f2031b = i3;
                        break;
                    case 23:
                        c0020a.e.d = i3;
                        break;
                    case 24:
                        c0020a.e.H = i3;
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                c0020a.e.Z = i3;
                                break;
                            case 55:
                                c0020a.e.a0 = i3;
                                break;
                            case 56:
                                c0020a.e.b0 = i3;
                                break;
                            case 57:
                                c0020a.e.c0 = i3;
                                break;
                            case 58:
                                c0020a.e.d0 = i3;
                                break;
                            case 59:
                                c0020a.e.e0 = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 82:
                                        c0020a.d.c = i3;
                                        break;
                                    case 83:
                                        c0020a.f.i = i3;
                                        break;
                                    case 84:
                                        c0020a.d.f2029k = i3;
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public static void X(C0020a c0020a, int i2, String str) {
        if (i2 == 5) {
            c0020a.e.A = str;
            return;
        }
        if (i2 == 65) {
            c0020a.d.d = str;
            return;
        }
        if (i2 == 74) {
            b bVar = c0020a.e;
            bVar.l0 = str;
            bVar.k0 = null;
        } else if (i2 == 77) {
            c0020a.e.m0 = str;
        } else {
            if (i2 != 90) {
                return;
            }
            c0020a.d.l = str;
        }
    }

    public static void Y(C0020a c0020a, int i2, boolean z) {
        if (i2 == 44) {
            c0020a.f.m = z;
            return;
        }
        if (i2 == 75) {
            c0020a.e.p0 = z;
        } else if (i2 == 80) {
            c0020a.e.n0 = z;
        } else {
            if (i2 != 81) {
                return;
            }
            c0020a.e.o0 = z;
        }
    }

    public static C0020a m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C0020a c0020a = new C0020a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, u4j.F3);
        S(context, c0020a, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return c0020a;
    }

    public void A(int i2, int i3) {
        D(i2).e.d = i3;
    }

    public final int[] B(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = nqi.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public final C0020a C(Context context, AttributeSet attributeSet, boolean z) {
        C0020a c0020a = new C0020a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? u4j.F3 : u4j.D);
        R(context, c0020a, typedArrayObtainStyledAttributes, z);
        typedArrayObtainStyledAttributes.recycle();
        return c0020a;
    }

    public final C0020a D(int i2) {
        if (!this.g.containsKey(Integer.valueOf(i2))) {
            this.g.put(Integer.valueOf(i2), new C0020a());
        }
        return this.g.get(Integer.valueOf(i2));
    }

    public C0020a E(int i2) {
        if (this.g.containsKey(Integer.valueOf(i2))) {
            return this.g.get(Integer.valueOf(i2));
        }
        return null;
    }

    public int F(int i2) {
        return D(i2).e.e;
    }

    public int[] G() {
        Integer[] numArr = (Integer[]) this.g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public C0020a H(int i2) {
        return D(i2);
    }

    public int I(int i2) {
        return D(i2).c.f2031b;
    }

    public int J(int i2) {
        return D(i2).c.c;
    }

    public int K(int i2) {
        return D(i2).e.d;
    }

    public void L(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0020a c0020aC = C(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0020aC.e.f2023a = true;
                    }
                    this.g.put(Integer.valueOf(c0020aC.f2018a), c0020aC);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void M(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            C0020a c0020aC = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            c0020aC = C(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            c0020aC = C(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            c0020aC = C(context, Xml.asAttributeSet(xmlPullParser), false);
                            b bVar = c0020aC.e;
                            bVar.f2023a = true;
                            bVar.f2024b = true;
                            break;
                        case "Barrier":
                            c0020aC = C(context, Xml.asAttributeSet(xmlPullParser), false);
                            c0020aC.e.j0 = 1;
                            break;
                        case "PropertySet":
                            if (c0020aC == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0020aC.c.b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Transform":
                            if (c0020aC == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0020aC.f.b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Layout":
                            if (c0020aC == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0020aC.e.b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Motion":
                            if (c0020aC == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0020aC.d.b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (c0020aC == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            ConstraintAttribute.i(context, xmlPullParser, c0020aC.g);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.g.put(Integer.valueOf(c0020aC.f2018a), c0020aC);
                        c0020aC = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final void R(Context context, C0020a c0020a, TypedArray typedArray, boolean z) {
        if (z) {
            S(context, c0020a, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != u4j.F && u4j.X != index && u4j.Y != index) {
                c0020a.d.f2027a = true;
                c0020a.e.f2024b = true;
                c0020a.c.f2030a = true;
                c0020a.f.f2032a = true;
            }
            switch (i.get(index)) {
                case 1:
                    b bVar = c0020a.e;
                    bVar.f2026r = N(typedArray, index, bVar.f2026r);
                    break;
                case 2:
                    b bVar2 = c0020a.e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = c0020a.e;
                    bVar3.q = N(typedArray, index, bVar3.q);
                    break;
                case 4:
                    b bVar4 = c0020a.e;
                    bVar4.p = N(typedArray, index, bVar4.p);
                    break;
                case 5:
                    c0020a.e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = c0020a.e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = c0020a.e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = c0020a.e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = c0020a.e;
                    bVar8.x = N(typedArray, index, bVar8.x);
                    break;
                case 10:
                    b bVar9 = c0020a.e;
                    bVar9.w = N(typedArray, index, bVar9.w);
                    break;
                case 11:
                    b bVar10 = c0020a.e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = c0020a.e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = c0020a.e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = c0020a.e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = c0020a.e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = c0020a.e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = c0020a.e;
                    bVar16.f = typedArray.getDimensionPixelOffset(index, bVar16.f);
                    break;
                case 18:
                    b bVar17 = c0020a.e;
                    bVar17.g = typedArray.getDimensionPixelOffset(index, bVar17.g);
                    break;
                case 19:
                    b bVar18 = c0020a.e;
                    bVar18.h = typedArray.getFloat(index, bVar18.h);
                    break;
                case 20:
                    b bVar19 = c0020a.e;
                    bVar19.y = typedArray.getFloat(index, bVar19.y);
                    break;
                case 21:
                    b bVar20 = c0020a.e;
                    bVar20.e = typedArray.getLayoutDimension(index, bVar20.e);
                    break;
                case 22:
                    d dVar = c0020a.c;
                    dVar.f2031b = typedArray.getInt(index, dVar.f2031b);
                    d dVar2 = c0020a.c;
                    dVar2.f2031b = h[dVar2.f2031b];
                    break;
                case 23:
                    b bVar21 = c0020a.e;
                    bVar21.d = typedArray.getLayoutDimension(index, bVar21.d);
                    break;
                case 24:
                    b bVar22 = c0020a.e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = c0020a.e;
                    bVar23.j = N(typedArray, index, bVar23.j);
                    break;
                case 26:
                    b bVar24 = c0020a.e;
                    bVar24.f2025k = N(typedArray, index, bVar24.f2025k);
                    break;
                case 27:
                    b bVar25 = c0020a.e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = c0020a.e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = c0020a.e;
                    bVar27.l = N(typedArray, index, bVar27.l);
                    break;
                case 30:
                    b bVar28 = c0020a.e;
                    bVar28.m = N(typedArray, index, bVar28.m);
                    break;
                case 31:
                    b bVar29 = c0020a.e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = c0020a.e;
                    bVar30.u = N(typedArray, index, bVar30.u);
                    break;
                case 33:
                    b bVar31 = c0020a.e;
                    bVar31.v = N(typedArray, index, bVar31.v);
                    break;
                case 34:
                    b bVar32 = c0020a.e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = c0020a.e;
                    bVar33.o = N(typedArray, index, bVar33.o);
                    break;
                case 36:
                    b bVar34 = c0020a.e;
                    bVar34.n = N(typedArray, index, bVar34.n);
                    break;
                case 37:
                    b bVar35 = c0020a.e;
                    bVar35.z = typedArray.getFloat(index, bVar35.z);
                    break;
                case 38:
                    c0020a.f2018a = typedArray.getResourceId(index, c0020a.f2018a);
                    break;
                case 39:
                    b bVar36 = c0020a.e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = c0020a.e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = c0020a.e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = c0020a.e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = c0020a.c;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    break;
                case 44:
                    e eVar = c0020a.f;
                    eVar.m = true;
                    eVar.n = typedArray.getDimension(index, eVar.n);
                    break;
                case 45:
                    e eVar2 = c0020a.f;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    break;
                case 46:
                    e eVar3 = c0020a.f;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    break;
                case 47:
                    e eVar4 = c0020a.f;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    break;
                case 48:
                    e eVar5 = c0020a.f;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    break;
                case 49:
                    e eVar6 = c0020a.f;
                    eVar6.g = typedArray.getDimension(index, eVar6.g);
                    break;
                case 50:
                    e eVar7 = c0020a.f;
                    eVar7.h = typedArray.getDimension(index, eVar7.h);
                    break;
                case 51:
                    e eVar8 = c0020a.f;
                    eVar8.j = typedArray.getDimension(index, eVar8.j);
                    break;
                case 52:
                    e eVar9 = c0020a.f;
                    eVar9.f2034k = typedArray.getDimension(index, eVar9.f2034k);
                    break;
                case 53:
                    e eVar10 = c0020a.f;
                    eVar10.l = typedArray.getDimension(index, eVar10.l);
                    break;
                case 54:
                    b bVar40 = c0020a.e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = c0020a.e;
                    bVar41.a0 = typedArray.getInt(index, bVar41.a0);
                    break;
                case 56:
                    b bVar42 = c0020a.e;
                    bVar42.b0 = typedArray.getDimensionPixelSize(index, bVar42.b0);
                    break;
                case 57:
                    b bVar43 = c0020a.e;
                    bVar43.c0 = typedArray.getDimensionPixelSize(index, bVar43.c0);
                    break;
                case 58:
                    b bVar44 = c0020a.e;
                    bVar44.d0 = typedArray.getDimensionPixelSize(index, bVar44.d0);
                    break;
                case 59:
                    b bVar45 = c0020a.e;
                    bVar45.e0 = typedArray.getDimensionPixelSize(index, bVar45.e0);
                    break;
                case 60:
                    e eVar11 = c0020a.f;
                    eVar11.f2033b = typedArray.getFloat(index, eVar11.f2033b);
                    break;
                case 61:
                    b bVar46 = c0020a.e;
                    bVar46.B = N(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = c0020a.e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = c0020a.e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = c0020a.d;
                    cVar.f2028b = N(typedArray, index, cVar.f2028b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0020a.d.d = typedArray.getString(index);
                    } else {
                        c0020a.d.d = ba7.c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c0020a.d.f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = c0020a.d;
                    cVar2.i = typedArray.getFloat(index, cVar2.i);
                    break;
                case 68:
                    d dVar4 = c0020a.c;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    break;
                case 69:
                    c0020a.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0020a.e.g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = c0020a.e;
                    bVar49.h0 = typedArray.getInt(index, bVar49.h0);
                    break;
                case 73:
                    b bVar50 = c0020a.e;
                    bVar50.i0 = typedArray.getDimensionPixelSize(index, bVar50.i0);
                    break;
                case 74:
                    c0020a.e.l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = c0020a.e;
                    bVar51.p0 = typedArray.getBoolean(index, bVar51.p0);
                    break;
                case 76:
                    c cVar3 = c0020a.d;
                    cVar3.e = typedArray.getInt(index, cVar3.e);
                    break;
                case 77:
                    c0020a.e.m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = c0020a.c;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    break;
                case 79:
                    c cVar4 = c0020a.d;
                    cVar4.g = typedArray.getFloat(index, cVar4.g);
                    break;
                case 80:
                    b bVar52 = c0020a.e;
                    bVar52.n0 = typedArray.getBoolean(index, bVar52.n0);
                    break;
                case 81:
                    b bVar53 = c0020a.e;
                    bVar53.o0 = typedArray.getBoolean(index, bVar53.o0);
                    break;
                case 82:
                    c cVar5 = c0020a.d;
                    cVar5.c = typedArray.getInteger(index, cVar5.c);
                    break;
                case 83:
                    e eVar12 = c0020a.f;
                    eVar12.i = N(typedArray, index, eVar12.i);
                    break;
                case 84:
                    c cVar6 = c0020a.d;
                    cVar6.f2029k = typedArray.getInteger(index, cVar6.f2029k);
                    break;
                case 85:
                    c cVar7 = c0020a.d;
                    cVar7.j = typedArray.getFloat(index, cVar7.j);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        c0020a.d.n = typedArray.getResourceId(index, -1);
                        c cVar8 = c0020a.d;
                        if (cVar8.n != -1) {
                            cVar8.m = -2;
                        }
                    } else if (i3 == 3) {
                        c0020a.d.l = typedArray.getString(index);
                        if (c0020a.d.l.indexOf("/") > 0) {
                            c0020a.d.n = typedArray.getResourceId(index, -1);
                            c0020a.d.m = -2;
                        } else {
                            c0020a.d.m = -1;
                        }
                    } else {
                        c cVar9 = c0020a.d;
                        cVar9.m = typedArray.getInteger(index, cVar9.n);
                    }
                    break;
                case 87:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(i.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(i.get(index));
                    break;
                case 91:
                    b bVar54 = c0020a.e;
                    bVar54.s = N(typedArray, index, bVar54.s);
                    break;
                case 92:
                    b bVar55 = c0020a.e;
                    bVar55.t = N(typedArray, index, bVar55.t);
                    break;
                case 93:
                    b bVar56 = c0020a.e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = c0020a.e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    O(c0020a.e, typedArray, index, 0);
                    break;
                case 96:
                    O(c0020a.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = c0020a.e;
                    bVar58.q0 = typedArray.getInt(index, bVar58.q0);
                    break;
            }
        }
        b bVar59 = c0020a.e;
        if (bVar59.l0 != null) {
            bVar59.k0 = null;
        }
    }

    public void T(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(Integer.valueOf(id))) {
                this.g.put(Integer.valueOf(id), new C0020a());
            }
            C0020a c0020a = this.g.get(Integer.valueOf(id));
            if (c0020a != null) {
                if (!c0020a.e.f2024b) {
                    c0020a.g(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        c0020a.e.k0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            c0020a.e.p0 = barrier.getAllowsGoneWidget();
                            c0020a.e.h0 = barrier.getType();
                            c0020a.e.i0 = barrier.getMargin();
                        }
                    }
                    c0020a.e.f2024b = true;
                }
                d dVar = c0020a.c;
                if (!dVar.f2030a) {
                    dVar.f2031b = childAt.getVisibility();
                    c0020a.c.d = childAt.getAlpha();
                    c0020a.c.f2030a = true;
                }
                e eVar = c0020a.f;
                if (!eVar.f2032a) {
                    eVar.f2032a = true;
                    eVar.f2033b = childAt.getRotation();
                    c0020a.f.c = childAt.getRotationX();
                    c0020a.f.d = childAt.getRotationY();
                    c0020a.f.e = childAt.getScaleX();
                    c0020a.f.f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = c0020a.f;
                        eVar2.g = pivotX;
                        eVar2.h = pivotY;
                    }
                    c0020a.f.j = childAt.getTranslationX();
                    c0020a.f.f2034k = childAt.getTranslationY();
                    c0020a.f.l = childAt.getTranslationZ();
                    e eVar3 = c0020a.f;
                    if (eVar3.m) {
                        eVar3.n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void U(a aVar) {
        for (Integer num : aVar.g.keySet()) {
            num.intValue();
            C0020a c0020a = aVar.g.get(num);
            if (!this.g.containsKey(num)) {
                this.g.put(num, new C0020a());
            }
            C0020a c0020a2 = this.g.get(num);
            if (c0020a2 != null) {
                b bVar = c0020a2.e;
                if (!bVar.f2024b) {
                    bVar.a(c0020a.e);
                }
                d dVar = c0020a2.c;
                if (!dVar.f2030a) {
                    dVar.a(c0020a.c);
                }
                e eVar = c0020a2.f;
                if (!eVar.f2032a) {
                    eVar.a(c0020a.f);
                }
                c cVar = c0020a2.d;
                if (!cVar.f2027a) {
                    cVar.a(c0020a.d);
                }
                for (String str : c0020a.g.keySet()) {
                    if (!c0020a2.g.containsKey(str)) {
                        c0020a2.g.put(str, c0020a.g.get(str));
                    }
                }
            }
        }
    }

    public void Z(int i2, String str) {
        D(i2).e.A = str;
    }

    public void a0(boolean z) {
        this.f = z;
    }

    public void b0(int i2, float f) {
        D(i2).e.h = f;
        D(i2).e.g = -1;
        D(i2).e.f = -1;
    }

    public void c0(int i2, float f) {
        D(i2).e.W = f;
    }

    public void d0(boolean z) {
        this.f2016a = z;
    }

    public final String e0(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return TSMAuthContants.PARAM_KEY_RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return StatConstants.PARAM_START;
            case 7:
                return StatConstants.PARAM_END;
            default:
                return "undefined";
        }
    }

    public void g(ConstraintLayout constraintLayout) {
        C0020a c0020a;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.g.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(ir5.d(childAt));
            } else {
                if (this.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.g.containsKey(Integer.valueOf(id)) && (c0020a = this.g.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.j(childAt, c0020a.g);
                }
            }
        }
    }

    public void h(a aVar) {
        for (C0020a c0020a : aVar.g.values()) {
            if (c0020a.h != null) {
                if (c0020a.f2019b != null) {
                    Iterator<Integer> it = this.g.keySet().iterator();
                    while (it.hasNext()) {
                        C0020a c0020aE = E(it.next().intValue());
                        String str = c0020aE.e.m0;
                        if (str != null && c0020a.f2019b.matches(str)) {
                            c0020a.h.e(c0020aE);
                            c0020aE.g.putAll((HashMap) c0020a.g.clone());
                        }
                    }
                } else {
                    c0020a.h.e(E(c0020a.f2018a));
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void j(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        C0020a c0020a;
        int id = constraintHelper.getId();
        if (this.g.containsKey(Integer.valueOf(id)) && (c0020a = this.g.get(Integer.valueOf(id))) != null && (constraintWidget instanceof f7c)) {
            constraintHelper.p(c0020a, (f7c) constraintWidget, layoutParams, sparseArray);
        }
    }

    public void k(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.g.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.g.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(ir5.d(childAt));
            } else {
                if (this.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.g.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0020a c0020a = this.g.get(Integer.valueOf(id));
                        if (c0020a != null) {
                            if (childAt instanceof Barrier) {
                                c0020a.e.j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0020a.e.h0);
                                barrier.setMargin(c0020a.e.i0);
                                barrier.setAllowsGoneWidget(c0020a.e.p0);
                                b bVar = c0020a.e;
                                int[] iArr = bVar.k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.l0;
                                    if (str != null) {
                                        bVar.k0 = B(barrier, str);
                                        barrier.setReferencedIds(c0020a.e.k0);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.c();
                            c0020a.e(layoutParams);
                            if (z) {
                                ConstraintAttribute.j(childAt, c0020a.g);
                            }
                            childAt.setLayoutParams(layoutParams);
                            d dVar = c0020a.c;
                            if (dVar.c == 0) {
                                childAt.setVisibility(dVar.f2031b);
                            }
                            childAt.setAlpha(c0020a.c.d);
                            childAt.setRotation(c0020a.f.f2033b);
                            childAt.setRotationX(c0020a.f.c);
                            childAt.setRotationY(c0020a.f.d);
                            childAt.setScaleX(c0020a.f.e);
                            childAt.setScaleY(c0020a.f.f);
                            e eVar = c0020a.f;
                            if (eVar.i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(c0020a.f.i);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotX(c0020a.f.g);
                                }
                                if (!Float.isNaN(c0020a.f.h)) {
                                    childAt.setPivotY(c0020a.f.h);
                                }
                            }
                            childAt.setTranslationX(c0020a.f.j);
                            childAt.setTranslationY(c0020a.f.f2034k);
                            childAt.setTranslationZ(c0020a.f.l);
                            e eVar2 = c0020a.f;
                            if (eVar2.m) {
                                childAt.setElevation(eVar2.n);
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("WARNING NO CONSTRAINTS for view ");
                        sb2.append(id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C0020a c0020a2 = this.g.get(num);
            if (c0020a2 != null) {
                if (c0020a2.e.j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = c0020a2.e;
                    int[] iArr2 = bVar2.k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.l0;
                        if (str2 != null) {
                            bVar2.k0 = B(barrier2, str2);
                            barrier2.setReferencedIds(c0020a2.e.k0);
                        }
                    }
                    barrier2.setType(c0020a2.e.h0);
                    barrier2.setMargin(c0020a2.e.i0);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.w();
                    c0020a2.e(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (c0020a2.e.f2023a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    c0020a2.e(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).j(constraintLayout);
            }
        }
    }

    public void l(int i2, ConstraintLayout.LayoutParams layoutParams) {
        C0020a c0020a;
        if (!this.g.containsKey(Integer.valueOf(i2)) || (c0020a = this.g.get(Integer.valueOf(i2))) == null) {
            return;
        }
        c0020a.e(layoutParams);
    }

    public void n(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f) {
        if (i5 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i4 == 1 || i4 == 2) {
            w(i2, 1, i3, i4, i5);
            w(i2, 2, i6, i7, i8);
            C0020a c0020a = this.g.get(Integer.valueOf(i2));
            if (c0020a != null) {
                c0020a.e.y = f;
                return;
            }
            return;
        }
        if (i4 == 6 || i4 == 7) {
            w(i2, 6, i3, i4, i5);
            w(i2, 7, i6, i7, i8);
            C0020a c0020a2 = this.g.get(Integer.valueOf(i2));
            if (c0020a2 != null) {
                c0020a2.e.y = f;
                return;
            }
            return;
        }
        w(i2, 3, i3, i4, i5);
        w(i2, 4, i6, i7, i8);
        C0020a c0020a3 = this.g.get(Integer.valueOf(i2));
        if (c0020a3 != null) {
            c0020a3.e.z = f;
        }
    }

    public void o(int i2, int i3) {
        if (i3 == 0) {
            n(i2, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            n(i2, i3, 2, 0, i3, 1, 0, 0.5f);
        }
    }

    public void p(int i2, int i3) {
        if (i3 == 0) {
            n(i2, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            n(i2, i3, 4, 0, i3, 3, 0, 0.5f);
        }
    }

    public void q(int i2, int i3) {
        C0020a c0020a;
        if (!this.g.containsKey(Integer.valueOf(i2)) || (c0020a = this.g.get(Integer.valueOf(i2))) == null) {
            return;
        }
        switch (i3) {
            case 1:
                b bVar = c0020a.e;
                bVar.f2025k = -1;
                bVar.j = -1;
                bVar.H = -1;
                bVar.O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = c0020a.e;
                bVar2.m = -1;
                bVar2.l = -1;
                bVar2.I = -1;
                bVar2.Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = c0020a.e;
                bVar3.o = -1;
                bVar3.n = -1;
                bVar3.J = 0;
                bVar3.P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = c0020a.e;
                bVar4.p = -1;
                bVar4.q = -1;
                bVar4.K = 0;
                bVar4.R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = c0020a.e;
                bVar5.f2026r = -1;
                bVar5.s = -1;
                bVar5.t = -1;
                bVar5.N = 0;
                bVar5.U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = c0020a.e;
                bVar6.u = -1;
                bVar6.v = -1;
                bVar6.M = 0;
                bVar6.T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = c0020a.e;
                bVar7.w = -1;
                bVar7.x = -1;
                bVar7.L = 0;
                bVar7.S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = c0020a.e;
                bVar8.D = -1.0f;
                bVar8.C = -1;
                bVar8.B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void r(Context context, int i2) {
        s((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void s(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.g.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(Integer.valueOf(id))) {
                this.g.put(Integer.valueOf(id), new C0020a());
            }
            C0020a c0020a = this.g.get(Integer.valueOf(id));
            if (c0020a != null) {
                c0020a.g = ConstraintAttribute.b(this.e, childAt);
                c0020a.g(id, layoutParams);
                c0020a.c.f2031b = childAt.getVisibility();
                c0020a.c.d = childAt.getAlpha();
                c0020a.f.f2033b = childAt.getRotation();
                c0020a.f.c = childAt.getRotationX();
                c0020a.f.d = childAt.getRotationY();
                c0020a.f.e = childAt.getScaleX();
                c0020a.f.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = c0020a.f;
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                c0020a.f.j = childAt.getTranslationX();
                c0020a.f.f2034k = childAt.getTranslationY();
                c0020a.f.l = childAt.getTranslationZ();
                e eVar2 = c0020a.f;
                if (eVar2.m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0020a.e.p0 = barrier.getAllowsGoneWidget();
                    c0020a.e.k0 = barrier.getReferencedIds();
                    c0020a.e.h0 = barrier.getType();
                    c0020a.e.i0 = barrier.getMargin();
                }
            }
        }
    }

    public void t(a aVar) {
        this.g.clear();
        for (Integer num : aVar.g.keySet()) {
            C0020a c0020a = aVar.g.get(num);
            if (c0020a != null) {
                this.g.put(num, c0020a.clone());
            }
        }
    }

    public void u(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.g.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraints.getChildAt(i2);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(Integer.valueOf(id))) {
                this.g.put(Integer.valueOf(id), new C0020a());
            }
            C0020a c0020a = this.g.get(Integer.valueOf(id));
            if (c0020a != null) {
                if (childAt instanceof ConstraintHelper) {
                    c0020a.i((ConstraintHelper) childAt, id, layoutParams);
                }
                c0020a.h(id, layoutParams);
            }
        }
    }

    public void v(int i2, int i3, int i4, int i5) {
        if (!this.g.containsKey(Integer.valueOf(i2))) {
            this.g.put(Integer.valueOf(i2), new C0020a());
        }
        C0020a c0020a = this.g.get(Integer.valueOf(i2));
        if (c0020a == null) {
            return;
        }
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b bVar = c0020a.e;
                    bVar.j = i4;
                    bVar.f2025k = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar2 = c0020a.e;
                    bVar2.f2025k = i4;
                    bVar2.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + e0(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    b bVar3 = c0020a.e;
                    bVar3.l = i4;
                    bVar3.m = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar4 = c0020a.e;
                    bVar4.m = i4;
                    bVar4.l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    b bVar5 = c0020a.e;
                    bVar5.n = i4;
                    bVar5.o = -1;
                    bVar5.f2026r = -1;
                    bVar5.s = -1;
                    bVar5.t = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                }
                b bVar6 = c0020a.e;
                bVar6.o = i4;
                bVar6.n = -1;
                bVar6.f2026r = -1;
                bVar6.s = -1;
                bVar6.t = -1;
                return;
            case 4:
                if (i5 == 4) {
                    b bVar7 = c0020a.e;
                    bVar7.q = i4;
                    bVar7.p = -1;
                    bVar7.f2026r = -1;
                    bVar7.s = -1;
                    bVar7.t = -1;
                    return;
                }
                if (i5 != 3) {
                    throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                }
                b bVar8 = c0020a.e;
                bVar8.p = i4;
                bVar8.q = -1;
                bVar8.f2026r = -1;
                bVar8.s = -1;
                bVar8.t = -1;
                return;
            case 5:
                if (i5 == 5) {
                    b bVar9 = c0020a.e;
                    bVar9.f2026r = i4;
                    bVar9.q = -1;
                    bVar9.p = -1;
                    bVar9.n = -1;
                    bVar9.o = -1;
                    return;
                }
                if (i5 == 3) {
                    b bVar10 = c0020a.e;
                    bVar10.s = i4;
                    bVar10.q = -1;
                    bVar10.p = -1;
                    bVar10.n = -1;
                    bVar10.o = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                }
                b bVar11 = c0020a.e;
                bVar11.t = i4;
                bVar11.q = -1;
                bVar11.p = -1;
                bVar11.n = -1;
                bVar11.o = -1;
                return;
            case 6:
                if (i5 == 6) {
                    b bVar12 = c0020a.e;
                    bVar12.v = i4;
                    bVar12.u = -1;
                    return;
                } else if (i5 == 7) {
                    b bVar13 = c0020a.e;
                    bVar13.u = i4;
                    bVar13.v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    b bVar14 = c0020a.e;
                    bVar14.x = i4;
                    bVar14.w = -1;
                    return;
                } else if (i5 == 6) {
                    b bVar15 = c0020a.e;
                    bVar15.w = i4;
                    bVar15.x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(e0(i3) + " to " + e0(i5) + " unknown");
        }
    }

    public void w(int i2, int i3, int i4, int i5, int i6) {
        if (!this.g.containsKey(Integer.valueOf(i2))) {
            this.g.put(Integer.valueOf(i2), new C0020a());
        }
        C0020a c0020a = this.g.get(Integer.valueOf(i2));
        if (c0020a == null) {
            return;
        }
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b bVar = c0020a.e;
                    bVar.j = i4;
                    bVar.f2025k = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Left to " + e0(i5) + " undefined");
                    }
                    b bVar2 = c0020a.e;
                    bVar2.f2025k = i4;
                    bVar2.j = -1;
                }
                c0020a.e.H = i6;
                return;
            case 2:
                if (i5 == 1) {
                    b bVar3 = c0020a.e;
                    bVar3.l = i4;
                    bVar3.m = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                    }
                    b bVar4 = c0020a.e;
                    bVar4.m = i4;
                    bVar4.l = -1;
                }
                c0020a.e.I = i6;
                return;
            case 3:
                if (i5 == 3) {
                    b bVar5 = c0020a.e;
                    bVar5.n = i4;
                    bVar5.o = -1;
                    bVar5.f2026r = -1;
                    bVar5.s = -1;
                    bVar5.t = -1;
                } else {
                    if (i5 != 4) {
                        throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                    }
                    b bVar6 = c0020a.e;
                    bVar6.o = i4;
                    bVar6.n = -1;
                    bVar6.f2026r = -1;
                    bVar6.s = -1;
                    bVar6.t = -1;
                }
                c0020a.e.J = i6;
                return;
            case 4:
                if (i5 == 4) {
                    b bVar7 = c0020a.e;
                    bVar7.q = i4;
                    bVar7.p = -1;
                    bVar7.f2026r = -1;
                    bVar7.s = -1;
                    bVar7.t = -1;
                } else {
                    if (i5 != 3) {
                        throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                    }
                    b bVar8 = c0020a.e;
                    bVar8.p = i4;
                    bVar8.q = -1;
                    bVar8.f2026r = -1;
                    bVar8.s = -1;
                    bVar8.t = -1;
                }
                c0020a.e.K = i6;
                return;
            case 5:
                if (i5 == 5) {
                    b bVar9 = c0020a.e;
                    bVar9.f2026r = i4;
                    bVar9.q = -1;
                    bVar9.p = -1;
                    bVar9.n = -1;
                    bVar9.o = -1;
                    return;
                }
                if (i5 == 3) {
                    b bVar10 = c0020a.e;
                    bVar10.s = i4;
                    bVar10.q = -1;
                    bVar10.p = -1;
                    bVar10.n = -1;
                    bVar10.o = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                }
                b bVar11 = c0020a.e;
                bVar11.t = i4;
                bVar11.q = -1;
                bVar11.p = -1;
                bVar11.n = -1;
                bVar11.o = -1;
                return;
            case 6:
                if (i5 == 6) {
                    b bVar12 = c0020a.e;
                    bVar12.v = i4;
                    bVar12.u = -1;
                } else {
                    if (i5 != 7) {
                        throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                    }
                    b bVar13 = c0020a.e;
                    bVar13.u = i4;
                    bVar13.v = -1;
                }
                c0020a.e.M = i6;
                return;
            case 7:
                if (i5 == 7) {
                    b bVar14 = c0020a.e;
                    bVar14.x = i4;
                    bVar14.w = -1;
                } else {
                    if (i5 != 6) {
                        throw new IllegalArgumentException("right to " + e0(i5) + " undefined");
                    }
                    b bVar15 = c0020a.e;
                    bVar15.w = i4;
                    bVar15.x = -1;
                }
                c0020a.e.L = i6;
                return;
            default:
                throw new IllegalArgumentException(e0(i3) + " to " + e0(i5) + " unknown");
        }
    }

    public void x(int i2, int i3, int i4, float f) {
        b bVar = D(i2).e;
        bVar.B = i3;
        bVar.C = i4;
        bVar.D = f;
    }

    public void y(int i2, int i3) {
        D(i2).e.e = i3;
    }

    public void z(int i2, float f) {
        D(i2).e.f0 = f;
    }
}
