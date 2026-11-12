package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w6.q;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f6189h = {0, 4, 8};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f6190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f6191j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6193b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f6194c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6195d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, androidx.constraintlayout.widget.a> f6196e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6197f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<Integer, a> f6198g = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0085d f6201c = new C0085d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f6202d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f6203e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f6204f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f6205g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0084a f6206h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        public static class C0084a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f6207a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int[] f6208b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f6209c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f6210d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f6211e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f6212f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f6213g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f6214h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f6215i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int[] f6216j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f6217k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f6218l = 0;

            public final void a(float f14, int i14) {
                int i15 = this.f6212f;
                int[] iArr = this.f6210d;
                if (i15 >= iArr.length) {
                    this.f6210d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f6211e;
                    this.f6211e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f6210d;
                int i16 = this.f6212f;
                iArr2[i16] = i14;
                float[] fArr2 = this.f6211e;
                this.f6212f = i16 + 1;
                fArr2[i16] = f14;
            }

            public final void b(int i14, int i15) {
                int i16 = this.f6209c;
                int[] iArr = this.f6207a;
                if (i16 >= iArr.length) {
                    this.f6207a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f6208b;
                    this.f6208b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f6207a;
                int i17 = this.f6209c;
                iArr3[i17] = i14;
                int[] iArr4 = this.f6208b;
                this.f6209c = i17 + 1;
                iArr4[i17] = i15;
            }

            public final void c(int i14, String str) {
                int i15 = this.f6215i;
                int[] iArr = this.f6213g;
                if (i15 >= iArr.length) {
                    this.f6213g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f6214h;
                    this.f6214h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f6213g;
                int i16 = this.f6215i;
                iArr2[i16] = i14;
                String[] strArr2 = this.f6214h;
                this.f6215i = i16 + 1;
                strArr2[i16] = str;
            }

            public final void d(int i14, boolean z14) {
                int i15 = this.f6218l;
                int[] iArr = this.f6216j;
                if (i15 >= iArr.length) {
                    this.f6216j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f6217k;
                    this.f6217k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f6216j;
                int i16 = this.f6218l;
                iArr2[i16] = i14;
                boolean[] zArr2 = this.f6217k;
                this.f6218l = i16 + 1;
                zArr2[i16] = z14;
            }

            public final void e(a aVar) {
                for (int i14 = 0; i14 < this.f6209c; i14++) {
                    int i15 = this.f6207a[i14];
                    int i16 = this.f6208b[i14];
                    int[] iArr = d.f6189h;
                    if (i15 == 6) {
                        aVar.f6203e.D = i16;
                    } else if (i15 == 7) {
                        aVar.f6203e.E = i16;
                    } else if (i15 == 8) {
                        aVar.f6203e.K = i16;
                    } else if (i15 == 27) {
                        aVar.f6203e.F = i16;
                    } else if (i15 == 28) {
                        aVar.f6203e.H = i16;
                    } else if (i15 == 41) {
                        aVar.f6203e.W = i16;
                    } else if (i15 == 42) {
                        aVar.f6203e.X = i16;
                    } else if (i15 == 61) {
                        aVar.f6203e.A = i16;
                    } else if (i15 == 62) {
                        aVar.f6203e.B = i16;
                    } else if (i15 == 72) {
                        aVar.f6203e.f6233g0 = i16;
                    } else if (i15 == 73) {
                        aVar.f6203e.f6235h0 = i16;
                    } else if (i15 == 88) {
                        aVar.f6202d.f6274l = i16;
                    } else if (i15 == 89) {
                        aVar.f6202d.f6275m = i16;
                    } else if (i15 == 2) {
                        aVar.f6203e.J = i16;
                    } else if (i15 == 31) {
                        aVar.f6203e.L = i16;
                    } else if (i15 == 34) {
                        aVar.f6203e.I = i16;
                    } else if (i15 == 38) {
                        aVar.f6199a = i16;
                    } else if (i15 == 64) {
                        aVar.f6202d.f6264b = i16;
                    } else if (i15 == 66) {
                        aVar.f6202d.f6268f = i16;
                    } else if (i15 == 76) {
                        aVar.f6202d.f6267e = i16;
                    } else if (i15 == 78) {
                        aVar.f6201c.f6278c = i16;
                    } else if (i15 == 97) {
                        aVar.f6203e.f6251p0 = i16;
                    } else if (i15 == 93) {
                        aVar.f6203e.M = i16;
                    } else if (i15 != 94) {
                        switch (i15) {
                            case 11:
                                aVar.f6203e.Q = i16;
                                break;
                            case 12:
                                aVar.f6203e.R = i16;
                                break;
                            case 13:
                                aVar.f6203e.N = i16;
                                break;
                            case 14:
                                aVar.f6203e.P = i16;
                                break;
                            case 15:
                                aVar.f6203e.S = i16;
                                break;
                            case 16:
                                aVar.f6203e.O = i16;
                                break;
                            case 17:
                                aVar.f6203e.f6228e = i16;
                                break;
                            case 18:
                                aVar.f6203e.f6230f = i16;
                                break;
                            default:
                                switch (i15) {
                                    case 21:
                                        aVar.f6203e.f6226d = i16;
                                        break;
                                    case 22:
                                        aVar.f6201c.f6277b = i16;
                                        break;
                                    case 23:
                                        aVar.f6203e.f6224c = i16;
                                        break;
                                    case 24:
                                        aVar.f6203e.G = i16;
                                        break;
                                    default:
                                        switch (i15) {
                                            case 54:
                                                aVar.f6203e.Y = i16;
                                                break;
                                            case 55:
                                                aVar.f6203e.Z = i16;
                                                break;
                                            case 56:
                                                aVar.f6203e.f6221a0 = i16;
                                                break;
                                            case 57:
                                                aVar.f6203e.f6223b0 = i16;
                                                break;
                                            case 58:
                                                aVar.f6203e.f6225c0 = i16;
                                                break;
                                            case 59:
                                                aVar.f6203e.f6227d0 = i16;
                                                break;
                                            default:
                                                switch (i15) {
                                                    case 82:
                                                        aVar.f6202d.f6265c = i16;
                                                        break;
                                                    case 83:
                                                        aVar.f6204f.f6290i = i16;
                                                        break;
                                                    case 84:
                                                        aVar.f6202d.f6272j = i16;
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        aVar.f6203e.T = i16;
                    }
                }
                for (int i17 = 0; i17 < this.f6212f; i17++) {
                    int i18 = this.f6210d[i17];
                    float f14 = this.f6211e[i17];
                    int[] iArr2 = d.f6189h;
                    if (i18 == 19) {
                        aVar.f6203e.f6232g = f14;
                    } else if (i18 == 20) {
                        aVar.f6203e.f6259x = f14;
                    } else if (i18 == 37) {
                        aVar.f6203e.f6260y = f14;
                    } else if (i18 == 60) {
                        aVar.f6204f.f6283b = f14;
                    } else if (i18 == 63) {
                        aVar.f6203e.C = f14;
                    } else if (i18 == 79) {
                        aVar.f6202d.f6269g = f14;
                    } else if (i18 == 85) {
                        aVar.f6202d.f6271i = f14;
                    } else if (i18 == 39) {
                        aVar.f6203e.V = f14;
                    } else if (i18 != 40) {
                        switch (i18) {
                            case 43:
                                aVar.f6201c.f6279d = f14;
                                break;
                            case 44:
                                e eVar = aVar.f6204f;
                                eVar.f6295n = f14;
                                eVar.f6294m = true;
                                break;
                            case 45:
                                aVar.f6204f.f6284c = f14;
                                break;
                            case 46:
                                aVar.f6204f.f6285d = f14;
                                break;
                            case 47:
                                aVar.f6204f.f6286e = f14;
                                break;
                            case 48:
                                aVar.f6204f.f6287f = f14;
                                break;
                            case 49:
                                aVar.f6204f.f6288g = f14;
                                break;
                            case 50:
                                aVar.f6204f.f6289h = f14;
                                break;
                            case 51:
                                aVar.f6204f.f6291j = f14;
                                break;
                            case 52:
                                aVar.f6204f.f6292k = f14;
                                break;
                            case 53:
                                aVar.f6204f.f6293l = f14;
                                break;
                            default:
                                switch (i18) {
                                    case 67:
                                        aVar.f6202d.f6270h = f14;
                                        break;
                                    case 68:
                                        aVar.f6201c.f6280e = f14;
                                        break;
                                    case 69:
                                        aVar.f6203e.f6229e0 = f14;
                                        break;
                                    case 70:
                                        aVar.f6203e.f6231f0 = f14;
                                        break;
                                }
                                break;
                        }
                    } else {
                        aVar.f6203e.U = f14;
                    }
                }
                for (int i19 = 0; i19 < this.f6215i; i19++) {
                    int i24 = this.f6213g[i19];
                    String str = this.f6214h[i19];
                    int[] iArr3 = d.f6189h;
                    if (i24 == 5) {
                        aVar.f6203e.f6261z = str;
                    } else if (i24 == 65) {
                        aVar.f6202d.f6266d = str;
                    } else if (i24 == 74) {
                        b bVar = aVar.f6203e;
                        bVar.f6241k0 = str;
                        bVar.f6239j0 = null;
                    } else if (i24 == 77) {
                        aVar.f6203e.f6243l0 = str;
                    } else if (i24 == 90) {
                        aVar.f6202d.f6273k = str;
                    }
                }
                for (int i25 = 0; i25 < this.f6218l; i25++) {
                    int i26 = this.f6216j[i25];
                    boolean z14 = this.f6217k[i25];
                    int[] iArr4 = d.f6189h;
                    if (i26 == 44) {
                        aVar.f6204f.f6294m = z14;
                    } else if (i26 == 75) {
                        aVar.f6203e.f6249o0 = z14;
                    } else if (i26 == 80) {
                        aVar.f6203e.f6245m0 = z14;
                    } else if (i26 == 81) {
                        aVar.f6203e.f6247n0 = z14;
                    }
                }
            }
        }

        public final void a(ConstraintLayout.b bVar) {
            b bVar2 = this.f6203e;
            bVar.f6104e = bVar2.f6236i;
            bVar.f6106f = bVar2.f6238j;
            bVar.f6108g = bVar2.f6240k;
            bVar.f6110h = bVar2.f6242l;
            bVar.f6112i = bVar2.f6244m;
            bVar.f6114j = bVar2.f6246n;
            bVar.f6116k = bVar2.f6248o;
            bVar.f6118l = bVar2.f6250p;
            bVar.f6120m = bVar2.f6252q;
            bVar.f6122n = bVar2.f6253r;
            bVar.f6124o = bVar2.f6254s;
            bVar.f6131s = bVar2.f6255t;
            bVar.f6132t = bVar2.f6256u;
            bVar.f6133u = bVar2.f6257v;
            bVar.f6134v = bVar2.f6258w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.A = bVar2.S;
            bVar.B = bVar2.R;
            bVar.f6136x = bVar2.O;
            bVar.f6138z = bVar2.Q;
            bVar.E = bVar2.f6259x;
            bVar.F = bVar2.f6260y;
            bVar.f6126p = bVar2.A;
            bVar.f6128q = bVar2.B;
            bVar.f6130r = bVar2.C;
            bVar.G = bVar2.f6261z;
            bVar.T = bVar2.D;
            bVar.U = bVar2.E;
            bVar.I = bVar2.U;
            bVar.H = bVar2.V;
            bVar.K = bVar2.X;
            bVar.J = bVar2.W;
            bVar.W = bVar2.f6245m0;
            bVar.X = bVar2.f6247n0;
            bVar.L = bVar2.Y;
            bVar.M = bVar2.Z;
            bVar.P = bVar2.f6221a0;
            bVar.Q = bVar2.f6223b0;
            bVar.N = bVar2.f6225c0;
            bVar.O = bVar2.f6227d0;
            bVar.R = bVar2.f6229e0;
            bVar.S = bVar2.f6231f0;
            bVar.V = bVar2.F;
            bVar.f6100c = bVar2.f6232g;
            bVar.f6096a = bVar2.f6228e;
            bVar.f6098b = bVar2.f6230f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f6224c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f6226d;
            String str = bVar2.f6243l0;
            if (str != null) {
                bVar.Y = str;
            }
            bVar.Z = bVar2.f6251p0;
            bVar.setMarginStart(bVar2.L);
            bVar.setMarginEnd(bVar2.K);
            bVar.a();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.f6203e.a(this.f6203e);
            aVar.f6202d.a(this.f6202d);
            C0085d c0085d = aVar.f6201c;
            c0085d.getClass();
            C0085d c0085d2 = this.f6201c;
            c0085d.f6276a = c0085d2.f6276a;
            c0085d.f6277b = c0085d2.f6277b;
            c0085d.f6279d = c0085d2.f6279d;
            c0085d.f6280e = c0085d2.f6280e;
            c0085d.f6278c = c0085d2.f6278c;
            aVar.f6204f.a(this.f6204f);
            aVar.f6199a = this.f6199a;
            aVar.f6206h = this.f6206h;
            return aVar;
        }

        public final void c(int i14, ConstraintLayout.b bVar) {
            this.f6199a = i14;
            int i15 = bVar.f6104e;
            b bVar2 = this.f6203e;
            bVar2.f6236i = i15;
            bVar2.f6238j = bVar.f6106f;
            bVar2.f6240k = bVar.f6108g;
            bVar2.f6242l = bVar.f6110h;
            bVar2.f6244m = bVar.f6112i;
            bVar2.f6246n = bVar.f6114j;
            bVar2.f6248o = bVar.f6116k;
            bVar2.f6250p = bVar.f6118l;
            bVar2.f6252q = bVar.f6120m;
            bVar2.f6253r = bVar.f6122n;
            bVar2.f6254s = bVar.f6124o;
            bVar2.f6255t = bVar.f6131s;
            bVar2.f6256u = bVar.f6132t;
            bVar2.f6257v = bVar.f6133u;
            bVar2.f6258w = bVar.f6134v;
            bVar2.f6259x = bVar.E;
            bVar2.f6260y = bVar.F;
            bVar2.f6261z = bVar.G;
            bVar2.A = bVar.f6126p;
            bVar2.B = bVar.f6128q;
            bVar2.C = bVar.f6130r;
            bVar2.D = bVar.T;
            bVar2.E = bVar.U;
            bVar2.F = bVar.V;
            bVar2.f6232g = bVar.f6100c;
            bVar2.f6228e = bVar.f6096a;
            bVar2.f6230f = bVar.f6098b;
            bVar2.f6224c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f6226d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.D;
            bVar2.U = bVar.I;
            bVar2.V = bVar.H;
            bVar2.X = bVar.K;
            bVar2.W = bVar.J;
            bVar2.f6245m0 = bVar.W;
            bVar2.f6247n0 = bVar.X;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.M;
            bVar2.f6221a0 = bVar.P;
            bVar2.f6223b0 = bVar.Q;
            bVar2.f6225c0 = bVar.N;
            bVar2.f6227d0 = bVar.O;
            bVar2.f6229e0 = bVar.R;
            bVar2.f6231f0 = bVar.S;
            bVar2.f6243l0 = bVar.Y;
            bVar2.O = bVar.f6136x;
            bVar2.Q = bVar.f6138z;
            bVar2.N = bVar.f6135w;
            bVar2.P = bVar.f6137y;
            bVar2.S = bVar.A;
            bVar2.R = bVar.B;
            bVar2.T = bVar.C;
            bVar2.f6251p0 = bVar.Z;
            bVar2.K = bVar.getMarginEnd();
            bVar2.L = bVar.getMarginStart();
        }

        public final void d(int i14, androidx.constraintlayout.widget.e.a aVar) {
            c(i14, aVar);
            this.f6201c.f6279d = aVar.f6297r0;
            float f14 = aVar.f6300u0;
            e eVar = this.f6204f;
            eVar.f6283b = f14;
            eVar.f6284c = aVar.f6301v0;
            eVar.f6285d = aVar.f6302w0;
            eVar.f6286e = aVar.f6303x0;
            eVar.f6287f = aVar.f6304y0;
            eVar.f6288g = aVar.f6305z0;
            eVar.f6289h = aVar.A0;
            eVar.f6291j = aVar.B0;
            eVar.f6292k = aVar.C0;
            eVar.f6293l = aVar.D0;
            eVar.f6295n = aVar.f6299t0;
            eVar.f6294m = aVar.f6298s0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final SparseIntArray f6219q0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6226d;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int[] f6239j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public String f6241k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f6243l0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6220a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6222b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6228e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6230f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f6232g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f6234h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6236i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6238j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6240k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6242l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6244m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6246n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f6248o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f6250p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6252q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f6253r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6254s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f6255t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f6256u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6257v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f6258w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f6259x = 0.5f;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f6260y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f6261z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f6221a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f6223b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f6225c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f6227d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public float f6229e0 = 1.0f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f6231f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f6233g0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f6235h0 = 0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f6237i0 = -1;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public boolean f6245m0 = false;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f6247n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f6249o0 = true;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f6251p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6219q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void a(b bVar) {
            this.f6220a = bVar.f6220a;
            this.f6224c = bVar.f6224c;
            this.f6222b = bVar.f6222b;
            this.f6226d = bVar.f6226d;
            this.f6228e = bVar.f6228e;
            this.f6230f = bVar.f6230f;
            this.f6232g = bVar.f6232g;
            this.f6234h = bVar.f6234h;
            this.f6236i = bVar.f6236i;
            this.f6238j = bVar.f6238j;
            this.f6240k = bVar.f6240k;
            this.f6242l = bVar.f6242l;
            this.f6244m = bVar.f6244m;
            this.f6246n = bVar.f6246n;
            this.f6248o = bVar.f6248o;
            this.f6250p = bVar.f6250p;
            this.f6252q = bVar.f6252q;
            this.f6253r = bVar.f6253r;
            this.f6254s = bVar.f6254s;
            this.f6255t = bVar.f6255t;
            this.f6256u = bVar.f6256u;
            this.f6257v = bVar.f6257v;
            this.f6258w = bVar.f6258w;
            this.f6259x = bVar.f6259x;
            this.f6260y = bVar.f6260y;
            this.f6261z = bVar.f6261z;
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
            this.f6221a0 = bVar.f6221a0;
            this.f6223b0 = bVar.f6223b0;
            this.f6225c0 = bVar.f6225c0;
            this.f6227d0 = bVar.f6227d0;
            this.f6229e0 = bVar.f6229e0;
            this.f6231f0 = bVar.f6231f0;
            this.f6233g0 = bVar.f6233g0;
            this.f6235h0 = bVar.f6235h0;
            this.f6237i0 = bVar.f6237i0;
            this.f6243l0 = bVar.f6243l0;
            int[] iArr = bVar.f6239j0;
            if (iArr == null || bVar.f6241k0 != null) {
                this.f6239j0 = null;
            } else {
                this.f6239j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f6241k0 = bVar.f6241k0;
            this.f6245m0 = bVar.f6245m0;
            this.f6247n0 = bVar.f6247n0;
            this.f6249o0 = bVar.f6249o0;
            this.f6251p0 = bVar.f6251p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6320l);
            this.f6222b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                SparseIntArray sparseIntArray = f6219q0;
                int i15 = sparseIntArray.get(index);
                switch (i15) {
                    case 1:
                        this.f6252q = d.o(typedArrayObtainStyledAttributes, index, this.f6252q);
                        break;
                    case 2:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.f6250p = d.o(typedArrayObtainStyledAttributes, index, this.f6250p);
                        break;
                    case 4:
                        this.f6248o = d.o(typedArrayObtainStyledAttributes, index, this.f6248o);
                        break;
                    case 5:
                        this.f6261z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.f6258w = d.o(typedArrayObtainStyledAttributes, index, this.f6258w);
                        break;
                    case 10:
                        this.f6257v = d.o(typedArrayObtainStyledAttributes, index, this.f6257v);
                        break;
                    case 11:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f6228e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6228e);
                        break;
                    case 18:
                        this.f6230f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6230f);
                        break;
                    case 19:
                        this.f6232g = typedArrayObtainStyledAttributes.getFloat(index, this.f6232g);
                        break;
                    case 20:
                        this.f6259x = typedArrayObtainStyledAttributes.getFloat(index, this.f6259x);
                        break;
                    case 21:
                        this.f6226d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f6226d);
                        break;
                    case 22:
                        this.f6224c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f6224c);
                        break;
                    case 23:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.f6236i = d.o(typedArrayObtainStyledAttributes, index, this.f6236i);
                        break;
                    case 25:
                        this.f6238j = d.o(typedArrayObtainStyledAttributes, index, this.f6238j);
                        break;
                    case 26:
                        this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.f6240k = d.o(typedArrayObtainStyledAttributes, index, this.f6240k);
                        break;
                    case 29:
                        this.f6242l = d.o(typedArrayObtainStyledAttributes, index, this.f6242l);
                        break;
                    case 30:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.f6255t = d.o(typedArrayObtainStyledAttributes, index, this.f6255t);
                        break;
                    case 32:
                        this.f6256u = d.o(typedArrayObtainStyledAttributes, index, this.f6256u);
                        break;
                    case 33:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.f6246n = d.o(typedArrayObtainStyledAttributes, index, this.f6246n);
                        break;
                    case 35:
                        this.f6244m = d.o(typedArrayObtainStyledAttributes, index, this.f6244m);
                        break;
                    case 36:
                        this.f6260y = typedArrayObtainStyledAttributes.getFloat(index, this.f6260y);
                        break;
                    case 37:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        d.p(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.p(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i15) {
                            case 61:
                                this.A = d.o(typedArrayObtainStyledAttributes, index, this.A);
                                break;
                            case 62:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i15) {
                                    case 69:
                                        this.f6229e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f6231f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f6233g0 = typedArrayObtainStyledAttributes.getInt(index, this.f6233g0);
                                        break;
                                    case 73:
                                        this.f6235h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6235h0);
                                        break;
                                    case 74:
                                        this.f6241k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f6249o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f6249o0);
                                        break;
                                    case 76:
                                        this.f6251p0 = typedArrayObtainStyledAttributes.getInt(index, this.f6251p0);
                                        break;
                                    case 77:
                                        this.f6253r = d.o(typedArrayObtainStyledAttributes, index, this.f6253r);
                                        break;
                                    case 78:
                                        this.f6254s = d.o(typedArrayObtainStyledAttributes, index, this.f6254s);
                                        break;
                                    case 79:
                                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.f6223b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6223b0);
                                        break;
                                    case 84:
                                        this.f6221a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6221a0);
                                        break;
                                    case 85:
                                        this.f6227d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6227d0);
                                        break;
                                    case 86:
                                        this.f6225c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6225c0);
                                        break;
                                    case 87:
                                        this.f6245m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f6245m0);
                                        break;
                                    case 88:
                                        this.f6247n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f6247n0);
                                        break;
                                    case 89:
                                        this.f6243l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f6234h = typedArrayObtainStyledAttributes.getBoolean(index, this.f6234h);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
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

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f6262n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6263a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6264b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6265c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f6266d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6267e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6268f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f6269g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f6270h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f6271i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6272j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f6273k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6274l = -3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6275m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6262n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(c cVar) {
            this.f6263a = cVar.f6263a;
            this.f6264b = cVar.f6264b;
            this.f6266d = cVar.f6266d;
            this.f6267e = cVar.f6267e;
            this.f6268f = cVar.f6268f;
            this.f6270h = cVar.f6270h;
            this.f6269g = cVar.f6269g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6321m);
            this.f6263a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                switch (f6262n.get(index)) {
                    case 1:
                        this.f6270h = typedArrayObtainStyledAttributes.getFloat(index, this.f6270h);
                        break;
                    case 2:
                        this.f6267e = typedArrayObtainStyledAttributes.getInt(index, this.f6267e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f6266d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f6266d = o6.c.f129461c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f6268f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f6264b = d.o(typedArrayObtainStyledAttributes, index, this.f6264b);
                        break;
                    case 6:
                        this.f6265c = typedArrayObtainStyledAttributes.getInteger(index, this.f6265c);
                        break;
                    case 7:
                        this.f6269g = typedArrayObtainStyledAttributes.getFloat(index, this.f6269g);
                        break;
                    case 8:
                        this.f6272j = typedArrayObtainStyledAttributes.getInteger(index, this.f6272j);
                        break;
                    case 9:
                        this.f6271i = typedArrayObtainStyledAttributes.getFloat(index, this.f6271i);
                        break;
                    case 10:
                        int i15 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i15 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f6275m = resourceId;
                            if (resourceId != -1) {
                                this.f6274l = -2;
                            }
                        } else if (i15 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f6273k = string;
                            if (string.indexOf("/") > 0) {
                                this.f6275m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f6274l = -2;
                            } else {
                                this.f6274l = -1;
                            }
                        } else {
                            this.f6274l = typedArrayObtainStyledAttributes.getInteger(index, this.f6275m);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0085d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6276a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6277b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6278c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f6279d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f6280e = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6327s);
            this.f6276a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 1) {
                    this.f6279d = typedArrayObtainStyledAttributes.getFloat(index, this.f6279d);
                } else if (index == 0) {
                    int i15 = typedArrayObtainStyledAttributes.getInt(index, this.f6277b);
                    this.f6277b = i15;
                    this.f6277b = d.f6189h[i15];
                } else if (index == 4) {
                    this.f6278c = typedArrayObtainStyledAttributes.getInt(index, this.f6278c);
                } else if (index == 3) {
                    this.f6280e = typedArrayObtainStyledAttributes.getFloat(index, this.f6280e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final SparseIntArray f6281o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6282a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f6283b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6284c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f6285d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f6286e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f6287f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f6288g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f6289h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6290i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f6291j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f6292k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f6293l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f6294m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f6295n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6281o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.f6282a = eVar.f6282a;
            this.f6283b = eVar.f6283b;
            this.f6284c = eVar.f6284c;
            this.f6285d = eVar.f6285d;
            this.f6286e = eVar.f6286e;
            this.f6287f = eVar.f6287f;
            this.f6288g = eVar.f6288g;
            this.f6289h = eVar.f6289h;
            this.f6290i = eVar.f6290i;
            this.f6291j = eVar.f6291j;
            this.f6292k = eVar.f6292k;
            this.f6293l = eVar.f6293l;
            this.f6294m = eVar.f6294m;
            this.f6295n = eVar.f6295n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6330v);
            this.f6282a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                switch (f6281o.get(index)) {
                    case 1:
                        this.f6283b = typedArrayObtainStyledAttributes.getFloat(index, this.f6283b);
                        break;
                    case 2:
                        this.f6284c = typedArrayObtainStyledAttributes.getFloat(index, this.f6284c);
                        break;
                    case 3:
                        this.f6285d = typedArrayObtainStyledAttributes.getFloat(index, this.f6285d);
                        break;
                    case 4:
                        this.f6286e = typedArrayObtainStyledAttributes.getFloat(index, this.f6286e);
                        break;
                    case 5:
                        this.f6287f = typedArrayObtainStyledAttributes.getFloat(index, this.f6287f);
                        break;
                    case 6:
                        this.f6288g = typedArrayObtainStyledAttributes.getDimension(index, this.f6288g);
                        break;
                    case 7:
                        this.f6289h = typedArrayObtainStyledAttributes.getDimension(index, this.f6289h);
                        break;
                    case 8:
                        this.f6291j = typedArrayObtainStyledAttributes.getDimension(index, this.f6291j);
                        break;
                    case 9:
                        this.f6292k = typedArrayObtainStyledAttributes.getDimension(index, this.f6292k);
                        break;
                    case 10:
                        this.f6293l = typedArrayObtainStyledAttributes.getDimension(index, this.f6293l);
                        break;
                    case 11:
                        this.f6294m = true;
                        this.f6295n = typedArrayObtainStyledAttributes.getDimension(index, this.f6295n);
                        break;
                    case 12:
                        this.f6290i = d.o(typedArrayObtainStyledAttributes, index, this.f6290i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6190i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f6191j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static a d(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, i.f6312d);
        r(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] i(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i14 = 0;
        int i15 = 0;
        while (i14 < strArrSplit.length) {
            String strTrim = strArrSplit[i14].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, TtmlNode.ATTR_ID, context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i15] = iIntValue;
            i14++;
            i15++;
        }
        return i15 != strArrSplit.length ? Arrays.copyOf(iArr, i15) : iArr;
    }

    public static a j(Context context, AttributeSet attributeSet, boolean z14) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z14 ? i.f6312d : i.f6309a);
        if (z14) {
            r(aVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i14 = 0;
            while (true) {
                b bVar = aVar.f6203e;
                if (i14 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i14);
                    C0085d c0085d = aVar.f6201c;
                    e eVar = aVar.f6204f;
                    c cVar = aVar.f6202d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.f6263a = true;
                        bVar.f6222b = true;
                        c0085d.f6276a = true;
                        eVar.f6282a = true;
                    }
                    SparseIntArray sparseIntArray = f6190i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.f6252q = o(typedArrayObtainStyledAttributes, index, bVar.f6252q);
                            break;
                        case 2:
                            bVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.J);
                            break;
                        case 3:
                            bVar.f6250p = o(typedArrayObtainStyledAttributes, index, bVar.f6250p);
                            break;
                        case 4:
                            bVar.f6248o = o(typedArrayObtainStyledAttributes, index, bVar.f6248o);
                            break;
                        case 5:
                            bVar.f6261z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            bVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.D);
                            break;
                        case 7:
                            bVar.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.E);
                            break;
                        case 8:
                            bVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.K);
                            break;
                        case 9:
                            bVar.f6258w = o(typedArrayObtainStyledAttributes, index, bVar.f6258w);
                            break;
                        case 10:
                            bVar.f6257v = o(typedArrayObtainStyledAttributes, index, bVar.f6257v);
                            break;
                        case 11:
                            bVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Q);
                            break;
                        case 12:
                            bVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.R);
                            break;
                        case 13:
                            bVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.N);
                            break;
                        case 14:
                            bVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.P);
                            break;
                        case 15:
                            bVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.S);
                            break;
                        case 16:
                            bVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.O);
                            break;
                        case 17:
                            bVar.f6228e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f6228e);
                            break;
                        case 18:
                            bVar.f6230f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f6230f);
                            break;
                        case 19:
                            bVar.f6232g = typedArrayObtainStyledAttributes.getFloat(index, bVar.f6232g);
                            break;
                        case 20:
                            bVar.f6259x = typedArrayObtainStyledAttributes.getFloat(index, bVar.f6259x);
                            break;
                        case 21:
                            bVar.f6226d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f6226d);
                            break;
                        case 22:
                            int i15 = typedArrayObtainStyledAttributes.getInt(index, c0085d.f6277b);
                            c0085d.f6277b = i15;
                            c0085d.f6277b = f6189h[i15];
                            break;
                        case 23:
                            bVar.f6224c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f6224c);
                            break;
                        case 24:
                            bVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.G);
                            break;
                        case 25:
                            bVar.f6236i = o(typedArrayObtainStyledAttributes, index, bVar.f6236i);
                            break;
                        case 26:
                            bVar.f6238j = o(typedArrayObtainStyledAttributes, index, bVar.f6238j);
                            break;
                        case 27:
                            bVar.F = typedArrayObtainStyledAttributes.getInt(index, bVar.F);
                            break;
                        case 28:
                            bVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.H);
                            break;
                        case 29:
                            bVar.f6240k = o(typedArrayObtainStyledAttributes, index, bVar.f6240k);
                            break;
                        case 30:
                            bVar.f6242l = o(typedArrayObtainStyledAttributes, index, bVar.f6242l);
                            break;
                        case 31:
                            bVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.L);
                            break;
                        case 32:
                            bVar.f6255t = o(typedArrayObtainStyledAttributes, index, bVar.f6255t);
                            break;
                        case 33:
                            bVar.f6256u = o(typedArrayObtainStyledAttributes, index, bVar.f6256u);
                            break;
                        case 34:
                            bVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.I);
                            break;
                        case 35:
                            bVar.f6246n = o(typedArrayObtainStyledAttributes, index, bVar.f6246n);
                            break;
                        case 36:
                            bVar.f6244m = o(typedArrayObtainStyledAttributes, index, bVar.f6244m);
                            break;
                        case 37:
                            bVar.f6260y = typedArrayObtainStyledAttributes.getFloat(index, bVar.f6260y);
                            break;
                        case 38:
                            aVar.f6199a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f6199a);
                            break;
                        case 39:
                            bVar.V = typedArrayObtainStyledAttributes.getFloat(index, bVar.V);
                            break;
                        case 40:
                            bVar.U = typedArrayObtainStyledAttributes.getFloat(index, bVar.U);
                            break;
                        case 41:
                            bVar.W = typedArrayObtainStyledAttributes.getInt(index, bVar.W);
                            break;
                        case 42:
                            bVar.X = typedArrayObtainStyledAttributes.getInt(index, bVar.X);
                            break;
                        case 43:
                            c0085d.f6279d = typedArrayObtainStyledAttributes.getFloat(index, c0085d.f6279d);
                            break;
                        case 44:
                            eVar.f6294m = true;
                            eVar.f6295n = typedArrayObtainStyledAttributes.getDimension(index, eVar.f6295n);
                            break;
                        case 45:
                            eVar.f6284c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f6284c);
                            break;
                        case 46:
                            eVar.f6285d = typedArrayObtainStyledAttributes.getFloat(index, eVar.f6285d);
                            break;
                        case 47:
                            eVar.f6286e = typedArrayObtainStyledAttributes.getFloat(index, eVar.f6286e);
                            break;
                        case 48:
                            eVar.f6287f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f6287f);
                            break;
                        case 49:
                            eVar.f6288g = typedArrayObtainStyledAttributes.getDimension(index, eVar.f6288g);
                            break;
                        case 50:
                            eVar.f6289h = typedArrayObtainStyledAttributes.getDimension(index, eVar.f6289h);
                            break;
                        case 51:
                            eVar.f6291j = typedArrayObtainStyledAttributes.getDimension(index, eVar.f6291j);
                            break;
                        case 52:
                            eVar.f6292k = typedArrayObtainStyledAttributes.getDimension(index, eVar.f6292k);
                            break;
                        case 53:
                            eVar.f6293l = typedArrayObtainStyledAttributes.getDimension(index, eVar.f6293l);
                            break;
                        case 54:
                            bVar.Y = typedArrayObtainStyledAttributes.getInt(index, bVar.Y);
                            break;
                        case 55:
                            bVar.Z = typedArrayObtainStyledAttributes.getInt(index, bVar.Z);
                            break;
                        case 56:
                            bVar.f6221a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f6221a0);
                            break;
                        case 57:
                            bVar.f6223b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f6223b0);
                            break;
                        case 58:
                            bVar.f6225c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f6225c0);
                            break;
                        case 59:
                            bVar.f6227d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f6227d0);
                            break;
                        case 60:
                            eVar.f6283b = typedArrayObtainStyledAttributes.getFloat(index, eVar.f6283b);
                            break;
                        case 61:
                            bVar.A = o(typedArrayObtainStyledAttributes, index, bVar.A);
                            break;
                        case 62:
                            bVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.B);
                            break;
                        case 63:
                            bVar.C = typedArrayObtainStyledAttributes.getFloat(index, bVar.C);
                            break;
                        case 64:
                            cVar.f6264b = o(typedArrayObtainStyledAttributes, index, cVar.f6264b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.f6266d = o6.c.f129461c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                cVar.f6266d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            cVar.f6268f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            cVar.f6270h = typedArrayObtainStyledAttributes.getFloat(index, cVar.f6270h);
                            break;
                        case 68:
                            c0085d.f6280e = typedArrayObtainStyledAttributes.getFloat(index, c0085d.f6280e);
                            break;
                        case 69:
                            bVar.f6229e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            bVar.f6231f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            break;
                        case 72:
                            bVar.f6233g0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f6233g0);
                            break;
                        case 73:
                            bVar.f6235h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f6235h0);
                            break;
                        case 74:
                            bVar.f6241k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            bVar.f6249o0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f6249o0);
                            break;
                        case 76:
                            cVar.f6267e = typedArrayObtainStyledAttributes.getInt(index, cVar.f6267e);
                            break;
                        case 77:
                            bVar.f6243l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            c0085d.f6278c = typedArrayObtainStyledAttributes.getInt(index, c0085d.f6278c);
                            break;
                        case 79:
                            cVar.f6269g = typedArrayObtainStyledAttributes.getFloat(index, cVar.f6269g);
                            break;
                        case 80:
                            bVar.f6245m0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f6245m0);
                            break;
                        case 81:
                            bVar.f6247n0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f6247n0);
                            break;
                        case 82:
                            cVar.f6265c = typedArrayObtainStyledAttributes.getInteger(index, cVar.f6265c);
                            break;
                        case 83:
                            eVar.f6290i = o(typedArrayObtainStyledAttributes, index, eVar.f6290i);
                            break;
                        case 84:
                            cVar.f6272j = typedArrayObtainStyledAttributes.getInteger(index, cVar.f6272j);
                            break;
                        case 85:
                            cVar.f6271i = typedArrayObtainStyledAttributes.getFloat(index, cVar.f6271i);
                            break;
                        case 86:
                            int i16 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i16 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                cVar.f6275m = resourceId;
                                if (resourceId != -1) {
                                    cVar.f6274l = -2;
                                }
                            } else if (i16 != 3) {
                                cVar.f6274l = typedArrayObtainStyledAttributes.getInteger(index, cVar.f6275m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                cVar.f6273k = string;
                                if (string.indexOf("/") <= 0) {
                                    cVar.f6274l = -1;
                                } else {
                                    cVar.f6275m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    cVar.f6274l = -2;
                                }
                            }
                            break;
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            bVar.f6253r = o(typedArrayObtainStyledAttributes, index, bVar.f6253r);
                            break;
                        case 92:
                            bVar.f6254s = o(typedArrayObtainStyledAttributes, index, bVar.f6254s);
                            break;
                        case 93:
                            bVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.M);
                            break;
                        case 94:
                            bVar.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.T);
                            break;
                        case 95:
                            p(bVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            p(bVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            bVar.f6251p0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f6251p0);
                            break;
                    }
                    i14++;
                } else if (bVar.f6241k0 != null) {
                    bVar.f6239j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int o(TypedArray typedArray, int i14, int i15) {
        int resourceId = typedArray.getResourceId(i14, i15);
        return resourceId == -1 ? typedArray.getInt(i14, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void p(Object obj, TypedArray typedArray, int i14, int i15) {
        int dimensionPixelSize;
        a.C0084a c0084a;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i16 = typedArray.peekValue(i14).type;
        boolean z14 = true;
        int i17 = 0;
        if (i16 != 3) {
            if (i16 != 5) {
                dimensionPixelSize = typedArray.getInt(i14, 0);
                if (dimensionPixelSize == -4) {
                    i17 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z14 = false;
                }
                if (obj instanceof ConstraintLayout.b) {
                    bVar2 = (ConstraintLayout.b) obj;
                    if (i15 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar2).width = i17;
                        bVar2.W = z14;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar2).height = i17;
                        bVar2.X = z14;
                        return;
                    }
                }
                if (obj instanceof b) {
                    bVar = (b) obj;
                    if (i15 == 0) {
                        bVar.f6224c = i17;
                        bVar.f6245m0 = z14;
                        return;
                    } else {
                        bVar.f6226d = i17;
                        bVar.f6247n0 = z14;
                        return;
                    }
                }
                if (obj instanceof a.C0084a) {
                    c0084a = (a.C0084a) obj;
                    if (i15 == 0) {
                        c0084a.b(23, i17);
                        c0084a.d(80, z14);
                        return;
                    } else {
                        c0084a.b(21, i17);
                        c0084a.d(81, z14);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i14, 0);
            z14 = false;
            i17 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i15 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i17;
                    bVar2.W = z14;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i17;
                    bVar2.X = z14;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i15 == 0) {
                    bVar.f6224c = i17;
                    bVar.f6245m0 = z14;
                    return;
                } else {
                    bVar.f6226d = i17;
                    bVar.f6247n0 = z14;
                    return;
                }
            }
            if (obj instanceof a.C0084a) {
                c0084a = (a.C0084a) obj;
                if (i15 == 0) {
                    c0084a.b(23, i17);
                    c0084a.d(80, z14);
                    return;
                } else {
                    c0084a.b(21, i17);
                    c0084a.d(81, z14);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i14);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar3 = (ConstraintLayout.b) obj;
                    if (i15 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar3).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar3).height = 0;
                    }
                    q(bVar3, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f6261z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0084a) {
                        ((a.C0084a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f14 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i15 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.H = f14;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.I = f14;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i15 == 0) {
                            bVar5.f6224c = 0;
                            bVar5.V = f14;
                            return;
                        } else {
                            bVar5.f6226d = 0;
                            bVar5.U = f14;
                            return;
                        }
                    }
                    if (obj instanceof a.C0084a) {
                        a.C0084a c0084a2 = (a.C0084a) obj;
                        if (i15 == 0) {
                            c0084a2.b(23, 0);
                            c0084a2.a(f14, 39);
                            return;
                        } else {
                            c0084a2.b(21, 0);
                            c0084a2.a(f14, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar6 = (ConstraintLayout.b) obj;
                        if (i15 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar6).width = 0;
                            bVar6.R = fMax;
                            bVar6.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar6).height = 0;
                            bVar6.S = fMax;
                            bVar6.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar7 = (b) obj;
                        if (i15 == 0) {
                            bVar7.f6224c = 0;
                            bVar7.f6229e0 = fMax;
                            bVar7.Y = 2;
                            return;
                        } else {
                            bVar7.f6226d = 0;
                            bVar7.f6231f0 = fMax;
                            bVar7.Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0084a) {
                        a.C0084a c0084a3 = (a.C0084a) obj;
                        if (i15 == 0) {
                            c0084a3.b(23, 0);
                            c0084a3.b(54, 2);
                        } else {
                            c0084a3.b(21, 0);
                            c0084a3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void q(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i14 = 0;
            int i15 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i14 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i15 = i14;
                i14 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i14);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i14, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f14 = Float.parseFloat(strSubstring3);
                        float f15 = Float.parseFloat(strSubstring4);
                        if (f14 > 0.0f && f15 > 0.0f) {
                            if (i15 == 1) {
                                Math.abs(f15 / f14);
                            } else {
                                Math.abs(f14 / f15);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void r(a aVar, TypedArray typedArray) {
        int i14;
        int indexCount = typedArray.getIndexCount();
        a.C0084a c0084a = new a.C0084a();
        aVar.f6206h = c0084a;
        c cVar = aVar.f6202d;
        int i15 = 0;
        cVar.f6263a = false;
        b bVar = aVar.f6203e;
        bVar.f6222b = false;
        C0085d c0085d = aVar.f6201c;
        c0085d.f6276a = false;
        e eVar = aVar.f6204f;
        eVar.f6282a = false;
        int i16 = 0;
        while (i16 < indexCount) {
            int index = typedArray.getIndex(i16);
            int i17 = f6191j.get(index);
            SparseIntArray sparseIntArray = f6190i;
            switch (i17) {
                case 2:
                    i14 = i15;
                    c0084a.b(2, typedArray.getDimensionPixelSize(index, bVar.J));
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
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i14 = i15;
                    break;
                case 5:
                    i14 = i15;
                    c0084a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    i14 = i15;
                    c0084a.b(6, typedArray.getDimensionPixelOffset(index, bVar.D));
                    break;
                case 7:
                    i14 = i15;
                    c0084a.b(7, typedArray.getDimensionPixelOffset(index, bVar.E));
                    break;
                case 8:
                    i14 = i15;
                    c0084a.b(8, typedArray.getDimensionPixelSize(index, bVar.K));
                    break;
                case 11:
                    i14 = i15;
                    c0084a.b(11, typedArray.getDimensionPixelSize(index, bVar.Q));
                    break;
                case 12:
                    i14 = i15;
                    c0084a.b(12, typedArray.getDimensionPixelSize(index, bVar.R));
                    break;
                case 13:
                    i14 = i15;
                    c0084a.b(13, typedArray.getDimensionPixelSize(index, bVar.N));
                    break;
                case 14:
                    i14 = i15;
                    c0084a.b(14, typedArray.getDimensionPixelSize(index, bVar.P));
                    break;
                case 15:
                    i14 = i15;
                    c0084a.b(15, typedArray.getDimensionPixelSize(index, bVar.S));
                    break;
                case 16:
                    i14 = i15;
                    c0084a.b(16, typedArray.getDimensionPixelSize(index, bVar.O));
                    break;
                case 17:
                    i14 = i15;
                    c0084a.b(17, typedArray.getDimensionPixelOffset(index, bVar.f6228e));
                    break;
                case 18:
                    i14 = i15;
                    c0084a.b(18, typedArray.getDimensionPixelOffset(index, bVar.f6230f));
                    break;
                case 19:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, bVar.f6232g), 19);
                    break;
                case 20:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, bVar.f6259x), 20);
                    break;
                case 21:
                    i14 = i15;
                    c0084a.b(21, typedArray.getLayoutDimension(index, bVar.f6226d));
                    break;
                case 22:
                    i14 = i15;
                    c0084a.b(22, f6189h[typedArray.getInt(index, c0085d.f6277b)]);
                    break;
                case 23:
                    i14 = i15;
                    c0084a.b(23, typedArray.getLayoutDimension(index, bVar.f6224c));
                    break;
                case 24:
                    i14 = i15;
                    c0084a.b(24, typedArray.getDimensionPixelSize(index, bVar.G));
                    break;
                case 27:
                    i14 = i15;
                    c0084a.b(27, typedArray.getInt(index, bVar.F));
                    break;
                case 28:
                    i14 = i15;
                    c0084a.b(28, typedArray.getDimensionPixelSize(index, bVar.H));
                    break;
                case 31:
                    i14 = i15;
                    c0084a.b(31, typedArray.getDimensionPixelSize(index, bVar.L));
                    break;
                case 34:
                    i14 = i15;
                    c0084a.b(34, typedArray.getDimensionPixelSize(index, bVar.I));
                    break;
                case 37:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, bVar.f6260y), 37);
                    break;
                case 38:
                    i14 = i15;
                    int resourceId = typedArray.getResourceId(index, aVar.f6199a);
                    aVar.f6199a = resourceId;
                    c0084a.b(38, resourceId);
                    break;
                case 39:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, bVar.V), 39);
                    break;
                case 40:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, bVar.U), 40);
                    break;
                case 41:
                    i14 = i15;
                    c0084a.b(41, typedArray.getInt(index, bVar.W));
                    break;
                case 42:
                    i14 = i15;
                    c0084a.b(42, typedArray.getInt(index, bVar.X));
                    break;
                case 43:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, c0085d.f6279d), 43);
                    break;
                case 44:
                    i14 = i15;
                    c0084a.d(44, true);
                    c0084a.a(typedArray.getDimension(index, eVar.f6295n), 44);
                    break;
                case 45:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, eVar.f6284c), 45);
                    break;
                case 46:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, eVar.f6285d), 46);
                    break;
                case 47:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, eVar.f6286e), 47);
                    break;
                case 48:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, eVar.f6287f), 48);
                    break;
                case 49:
                    i14 = i15;
                    c0084a.a(typedArray.getDimension(index, eVar.f6288g), 49);
                    break;
                case 50:
                    i14 = i15;
                    c0084a.a(typedArray.getDimension(index, eVar.f6289h), 50);
                    break;
                case 51:
                    i14 = i15;
                    c0084a.a(typedArray.getDimension(index, eVar.f6291j), 51);
                    break;
                case 52:
                    i14 = i15;
                    c0084a.a(typedArray.getDimension(index, eVar.f6292k), 52);
                    break;
                case 53:
                    i14 = i15;
                    c0084a.a(typedArray.getDimension(index, eVar.f6293l), 53);
                    break;
                case 54:
                    i14 = i15;
                    c0084a.b(54, typedArray.getInt(index, bVar.Y));
                    break;
                case 55:
                    i14 = i15;
                    c0084a.b(55, typedArray.getInt(index, bVar.Z));
                    break;
                case 56:
                    i14 = i15;
                    c0084a.b(56, typedArray.getDimensionPixelSize(index, bVar.f6221a0));
                    break;
                case 57:
                    i14 = i15;
                    c0084a.b(57, typedArray.getDimensionPixelSize(index, bVar.f6223b0));
                    break;
                case 58:
                    i14 = i15;
                    c0084a.b(58, typedArray.getDimensionPixelSize(index, bVar.f6225c0));
                    break;
                case 59:
                    i14 = i15;
                    c0084a.b(59, typedArray.getDimensionPixelSize(index, bVar.f6227d0));
                    break;
                case 60:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, eVar.f6283b), 60);
                    break;
                case 62:
                    i14 = i15;
                    c0084a.b(62, typedArray.getDimensionPixelSize(index, bVar.B));
                    break;
                case 63:
                    i14 = i15;
                    c0084a.a(typedArray.getFloat(index, bVar.C), 63);
                    break;
                case 64:
                    i14 = i15;
                    c0084a.b(64, o(typedArray, index, cVar.f6264b));
                    break;
                case 65:
                    i14 = i15;
                    if (typedArray.peekValue(index).type != 3) {
                        c0084a.c(65, o6.c.f129461c[typedArray.getInteger(index, i14)]);
                    } else {
                        c0084a.c(65, typedArray.getString(index));
                    }
                    break;
                case 66:
                    i14 = 0;
                    c0084a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0084a.a(typedArray.getFloat(index, cVar.f6270h), 67);
                    i14 = 0;
                    break;
                case 68:
                    c0084a.a(typedArray.getFloat(index, c0085d.f6280e), 68);
                    i14 = 0;
                    break;
                case 69:
                    c0084a.a(typedArray.getFloat(index, 1.0f), 69);
                    i14 = 0;
                    break;
                case 70:
                    c0084a.a(typedArray.getFloat(index, 1.0f), 70);
                    i14 = 0;
                    break;
                case 71:
                    i14 = i15;
                    break;
                case 72:
                    c0084a.b(72, typedArray.getInt(index, bVar.f6233g0));
                    i14 = 0;
                    break;
                case 73:
                    c0084a.b(73, typedArray.getDimensionPixelSize(index, bVar.f6235h0));
                    i14 = 0;
                    break;
                case 74:
                    c0084a.c(74, typedArray.getString(index));
                    i14 = 0;
                    break;
                case 75:
                    c0084a.d(75, typedArray.getBoolean(index, bVar.f6249o0));
                    i14 = 0;
                    break;
                case 76:
                    c0084a.b(76, typedArray.getInt(index, cVar.f6267e));
                    i14 = 0;
                    break;
                case 77:
                    c0084a.c(77, typedArray.getString(index));
                    i14 = 0;
                    break;
                case 78:
                    c0084a.b(78, typedArray.getInt(index, c0085d.f6278c));
                    i14 = 0;
                    break;
                case 79:
                    c0084a.a(typedArray.getFloat(index, cVar.f6269g), 79);
                    i14 = 0;
                    break;
                case 80:
                    c0084a.d(80, typedArray.getBoolean(index, bVar.f6245m0));
                    i14 = 0;
                    break;
                case 81:
                    c0084a.d(81, typedArray.getBoolean(index, bVar.f6247n0));
                    i14 = 0;
                    break;
                case 82:
                    c0084a.b(82, typedArray.getInteger(index, cVar.f6265c));
                    i14 = 0;
                    break;
                case 83:
                    c0084a.b(83, o(typedArray, index, eVar.f6290i));
                    i14 = 0;
                    break;
                case 84:
                    c0084a.b(84, typedArray.getInteger(index, cVar.f6272j));
                    i14 = 0;
                    break;
                case 85:
                    c0084a.a(typedArray.getFloat(index, cVar.f6271i), 85);
                    i14 = 0;
                    break;
                case 86:
                    int i18 = typedArray.peekValue(index).type;
                    if (i18 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.f6275m = resourceId2;
                        c0084a.b(89, resourceId2);
                        if (cVar.f6275m != -1) {
                            cVar.f6274l = -2;
                            c0084a.b(88, -2);
                        }
                    } else if (i18 == 3) {
                        String string = typedArray.getString(index);
                        cVar.f6273k = string;
                        c0084a.c(90, string);
                        if (cVar.f6273k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.f6275m = resourceId3;
                            c0084a.b(89, resourceId3);
                            cVar.f6274l = -2;
                            c0084a.b(88, -2);
                        } else {
                            cVar.f6274l = -1;
                            c0084a.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.f6275m);
                        cVar.f6274l = integer;
                        c0084a.b(88, integer);
                    }
                    i14 = 0;
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i14 = i15;
                    break;
                case 93:
                    c0084a.b(93, typedArray.getDimensionPixelSize(index, bVar.M));
                    i14 = i15;
                    break;
                case 94:
                    c0084a.b(94, typedArray.getDimensionPixelSize(index, bVar.T));
                    i14 = i15;
                    break;
                case 95:
                    p(c0084a, typedArray, index, i15);
                    i14 = i15;
                    break;
                case 96:
                    p(c0084a, typedArray, index, 1);
                    i14 = i15;
                    break;
                case 97:
                    c0084a.b(97, typedArray.getInt(index, bVar.f6251p0));
                    i14 = i15;
                    break;
                case 98:
                    if (q.f182918k1) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.f6199a);
                        aVar.f6199a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.f6200b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f6200b = typedArray.getString(index);
                    } else {
                        aVar.f6199a = typedArray.getResourceId(index, aVar.f6199a);
                    }
                    i14 = i15;
                    break;
                case 99:
                    c0084a.d(99, typedArray.getBoolean(index, bVar.f6234h));
                    i14 = i15;
                    break;
            }
            i16++;
            i15 = i14;
        }
    }

    public static String t(int i14) {
        switch (i14) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return TtmlNode.START;
            case 7:
                return TtmlNode.END;
            default:
                return "undefined";
        }
    }

    public final void a(q qVar) {
        a aVar;
        int childCount = qVar.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = qVar.getChildAt(i14);
            int id3 = childAt.getId();
            Integer numValueOf = Integer.valueOf(id3);
            HashMap<Integer, a> map = this.f6198g;
            if (!map.containsKey(numValueOf)) {
                w6.a.c(childAt);
            } else if (this.f6197f && id3 == -1) {
                kg.f.n("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (map.containsKey(Integer.valueOf(id3)) && (aVar = map.get(Integer.valueOf(id3))) != null) {
                androidx.constraintlayout.widget.a.e(childAt, aVar.f6205g);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = this.f6198g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = constraintLayout.getChildAt(i14);
            int id3 = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id3))) {
                w6.a.c(childAt);
            } else {
                if (this.f6197f && id3 == -1) {
                    kg.f.n("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id3 != -1 && map.containsKey(Integer.valueOf(id3))) {
                    hashSet.remove(Integer.valueOf(id3));
                    a aVar = map.get(Integer.valueOf(id3));
                    if (aVar != null) {
                        C0085d c0085d = aVar.f6201c;
                        b bVar = aVar.f6203e;
                        e eVar = aVar.f6204f;
                        if (childAt instanceof Barrier) {
                            bVar.f6237i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id3);
                            barrier.setType(bVar.f6233g0);
                            barrier.setMargin(bVar.f6235h0);
                            barrier.setAllowsGoneWidget(bVar.f6249o0);
                            int[] iArr = bVar.f6239j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f6241k0;
                                if (str != null) {
                                    int[] iArrI = i(barrier, str);
                                    bVar.f6239j0 = iArrI;
                                    barrier.setReferencedIds(iArrI);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.a(bVar2);
                        androidx.constraintlayout.widget.a.e(childAt, aVar.f6205g);
                        childAt.setLayoutParams(bVar2);
                        if (c0085d.f6278c == 0) {
                            childAt.setVisibility(c0085d.f6277b);
                        }
                        childAt.setAlpha(c0085d.f6279d);
                        childAt.setRotation(eVar.f6283b);
                        childAt.setRotationX(eVar.f6284c);
                        childAt.setRotationY(eVar.f6285d);
                        childAt.setScaleX(eVar.f6286e);
                        childAt.setScaleY(eVar.f6287f);
                        if (eVar.f6290i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(eVar.f6290i);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f6288g)) {
                                childAt.setPivotX(eVar.f6288g);
                            }
                            if (!Float.isNaN(eVar.f6289h)) {
                                childAt.setPivotY(eVar.f6289h);
                            }
                        }
                        childAt.setTranslationX(eVar.f6291j);
                        childAt.setTranslationY(eVar.f6292k);
                        childAt.setTranslationZ(eVar.f6293l);
                        if (eVar.f6294m) {
                            childAt.setElevation(eVar.f6295n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = map.get(num);
            if (aVar2 != null) {
                b bVar3 = aVar2.f6203e;
                if (bVar3.f6237i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar3.f6239j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f6241k0;
                        if (str2 != null) {
                            int[] iArrI2 = i(barrier2, str2);
                            bVar3.f6239j0 = iArrI2;
                            barrier2.setReferencedIds(iArrI2);
                        }
                    }
                    barrier2.setType(bVar3.f6233g0);
                    barrier2.setMargin(bVar3.f6235h0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m();
                    aVar2.a(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (bVar3.f6220a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.a(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = constraintLayout.getChildAt(i15);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).f(constraintLayout);
            }
        }
    }

    public final void e(int i14, int i15) {
        a aVar;
        Integer numValueOf = Integer.valueOf(i14);
        HashMap<Integer, a> map = this.f6198g;
        if (!map.containsKey(numValueOf) || (aVar = map.get(Integer.valueOf(i14))) == null) {
            return;
        }
        b bVar = aVar.f6203e;
        switch (i15) {
            case 1:
                bVar.f6238j = -1;
                bVar.f6236i = -1;
                bVar.G = -1;
                bVar.N = Integer.MIN_VALUE;
                break;
            case 2:
                bVar.f6242l = -1;
                bVar.f6240k = -1;
                bVar.H = -1;
                bVar.P = Integer.MIN_VALUE;
                break;
            case 3:
                bVar.f6246n = -1;
                bVar.f6244m = -1;
                bVar.I = 0;
                bVar.O = Integer.MIN_VALUE;
                break;
            case 4:
                bVar.f6248o = -1;
                bVar.f6250p = -1;
                bVar.J = 0;
                bVar.Q = Integer.MIN_VALUE;
                break;
            case 5:
                bVar.f6252q = -1;
                bVar.f6253r = -1;
                bVar.f6254s = -1;
                bVar.M = 0;
                bVar.T = Integer.MIN_VALUE;
                break;
            case 6:
                bVar.f6255t = -1;
                bVar.f6256u = -1;
                bVar.L = 0;
                bVar.S = Integer.MIN_VALUE;
                break;
            case 7:
                bVar.f6257v = -1;
                bVar.f6258w = -1;
                bVar.K = 0;
                bVar.R = Integer.MIN_VALUE;
                break;
            case 8:
                bVar.C = -1.0f;
                bVar.B = -1;
                bVar.A = -1;
                break;
            default:
                vb.h.s("unknown constraint");
                break;
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int i14;
        HashMap<Integer, a> map;
        int i15;
        int i16;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map2 = dVar.f6198g;
        map2.clear();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = constraintLayout.getChildAt(i17);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id3 = childAt.getId();
            if (dVar.f6197f && id3 == -1) {
                kg.f.n("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id3))) {
                map2.put(Integer.valueOf(id3), new a());
            }
            a aVar = map2.get(Integer.valueOf(id3));
            if (aVar == null) {
                i14 = childCount;
                map = map2;
                i15 = i17;
            } else {
                C0085d c0085d = aVar.f6201c;
                b bVar2 = aVar.f6203e;
                e eVar = aVar.f6204f;
                HashMap<String, androidx.constraintlayout.widget.a> map3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                HashMap<String, androidx.constraintlayout.widget.a> map4 = dVar.f6196e;
                for (String str : map4.keySet()) {
                    int i18 = childCount;
                    androidx.constraintlayout.widget.a aVar2 = map4.get(str);
                    HashMap<Integer, a> map5 = map2;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i16 = i17;
                            try {
                                map3.put(str, new androidx.constraintlayout.widget.a(aVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        } else {
                            i16 = i17;
                            map3.put(str, new androidx.constraintlayout.widget.a(aVar2, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                        i16 = i17;
                    }
                    map2 = map5;
                    childCount = i18;
                    i17 = i16;
                }
                i14 = childCount;
                map = map2;
                i15 = i17;
                aVar.f6205g = map3;
                aVar.c(id3, bVar);
                c0085d.f6277b = childAt.getVisibility();
                c0085d.f6279d = childAt.getAlpha();
                eVar.f6283b = childAt.getRotation();
                eVar.f6284c = childAt.getRotationX();
                eVar.f6285d = childAt.getRotationY();
                eVar.f6286e = childAt.getScaleX();
                eVar.f6287f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f6288g = pivotX;
                    eVar.f6289h = pivotY;
                }
                eVar.f6291j = childAt.getTranslationX();
                eVar.f6292k = childAt.getTranslationY();
                eVar.f6293l = childAt.getTranslationZ();
                if (eVar.f6294m) {
                    eVar.f6295n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    bVar2.f6249o0 = barrier.getAllowsGoneWidget();
                    bVar2.f6239j0 = barrier.getReferencedIds();
                    bVar2.f6233g0 = barrier.getType();
                    bVar2.f6235h0 = barrier.getMargin();
                }
            }
            i17 = i15 + 1;
            dVar = this;
            map2 = map;
            childCount = i14;
        }
    }

    public final void g(int i14, int i15, int i16, int i17) {
        Integer numValueOf = Integer.valueOf(i14);
        HashMap<Integer, a> map = this.f6198g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i14), new a());
        }
        a aVar = map.get(Integer.valueOf(i14));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f6203e;
        switch (i15) {
            case 1:
                if (i17 == 1) {
                    bVar.f6236i = i16;
                    bVar.f6238j = -1;
                } else if (i17 != 2) {
                    org.apache.commons.lang3.e.r("Left to ", t(i17), " undefined");
                    return;
                } else {
                    bVar.f6238j = i16;
                    bVar.f6236i = -1;
                }
                bVar.G = 0;
                return;
            case 2:
                if (i17 == 1) {
                    bVar.f6240k = i16;
                    bVar.f6242l = -1;
                } else if (i17 != 2) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                } else {
                    bVar.f6242l = i16;
                    bVar.f6240k = -1;
                }
                bVar.H = 0;
                return;
            case 3:
                if (i17 == 3) {
                    bVar.f6244m = i16;
                    bVar.f6246n = -1;
                    bVar.f6252q = -1;
                    bVar.f6253r = -1;
                    bVar.f6254s = -1;
                } else {
                    if (i17 != 4) {
                        org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                        return;
                    }
                    bVar.f6246n = i16;
                    bVar.f6244m = -1;
                    bVar.f6252q = -1;
                    bVar.f6253r = -1;
                    bVar.f6254s = -1;
                }
                bVar.I = 0;
                return;
            case 4:
                if (i17 == 4) {
                    bVar.f6250p = i16;
                    bVar.f6248o = -1;
                    bVar.f6252q = -1;
                    bVar.f6253r = -1;
                    bVar.f6254s = -1;
                } else {
                    if (i17 != 3) {
                        org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                        return;
                    }
                    bVar.f6248o = i16;
                    bVar.f6250p = -1;
                    bVar.f6252q = -1;
                    bVar.f6253r = -1;
                    bVar.f6254s = -1;
                }
                bVar.J = 0;
                return;
            case 5:
                if (i17 == 5) {
                    bVar.f6252q = i16;
                    bVar.f6250p = -1;
                    bVar.f6248o = -1;
                    bVar.f6244m = -1;
                    bVar.f6246n = -1;
                    return;
                }
                if (i17 == 3) {
                    bVar.f6253r = i16;
                    bVar.f6250p = -1;
                    bVar.f6248o = -1;
                    bVar.f6244m = -1;
                    bVar.f6246n = -1;
                    return;
                }
                if (i17 != 4) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                }
                bVar.f6254s = i16;
                bVar.f6250p = -1;
                bVar.f6248o = -1;
                bVar.f6244m = -1;
                bVar.f6246n = -1;
                return;
            case 6:
                if (i17 == 6) {
                    bVar.f6256u = i16;
                    bVar.f6255t = -1;
                } else if (i17 != 7) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                } else {
                    bVar.f6255t = i16;
                    bVar.f6256u = -1;
                }
                bVar.L = 0;
                return;
            case 7:
                if (i17 == 7) {
                    bVar.f6258w = i16;
                    bVar.f6257v = -1;
                } else if (i17 != 6) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                } else {
                    bVar.f6257v = i16;
                    bVar.f6258w = -1;
                }
                bVar.K = 0;
                return;
            default:
                throw new IllegalArgumentException(t(i15) + " to " + t(i17) + " unknown");
        }
    }

    public final void h(int i14, int i15, int i16, int i17) {
        Integer numValueOf = Integer.valueOf(i14);
        HashMap<Integer, a> map = this.f6198g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i14), new a());
        }
        a aVar = map.get(Integer.valueOf(i14));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f6203e;
        switch (i15) {
            case 1:
                if (i17 == 1) {
                    bVar.f6236i = i16;
                    bVar.f6238j = -1;
                    return;
                } else if (i17 != 2) {
                    org.apache.commons.lang3.e.r("left to ", t(i17), " undefined");
                    return;
                } else {
                    bVar.f6238j = i16;
                    bVar.f6236i = -1;
                    return;
                }
            case 2:
                if (i17 == 1) {
                    bVar.f6240k = i16;
                    bVar.f6242l = -1;
                    return;
                } else if (i17 != 2) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                } else {
                    bVar.f6242l = i16;
                    bVar.f6240k = -1;
                    return;
                }
            case 3:
                if (i17 == 3) {
                    bVar.f6244m = i16;
                    bVar.f6246n = -1;
                    bVar.f6252q = -1;
                    bVar.f6253r = -1;
                    bVar.f6254s = -1;
                    return;
                }
                if (i17 != 4) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                }
                bVar.f6246n = i16;
                bVar.f6244m = -1;
                bVar.f6252q = -1;
                bVar.f6253r = -1;
                bVar.f6254s = -1;
                return;
            case 4:
                if (i17 == 4) {
                    bVar.f6250p = i16;
                    bVar.f6248o = -1;
                    bVar.f6252q = -1;
                    bVar.f6253r = -1;
                    bVar.f6254s = -1;
                    return;
                }
                if (i17 != 3) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                }
                bVar.f6248o = i16;
                bVar.f6250p = -1;
                bVar.f6252q = -1;
                bVar.f6253r = -1;
                bVar.f6254s = -1;
                return;
            case 5:
                if (i17 == 5) {
                    bVar.f6252q = i16;
                    bVar.f6250p = -1;
                    bVar.f6248o = -1;
                    bVar.f6244m = -1;
                    bVar.f6246n = -1;
                    return;
                }
                if (i17 == 3) {
                    bVar.f6253r = i16;
                    bVar.f6250p = -1;
                    bVar.f6248o = -1;
                    bVar.f6244m = -1;
                    bVar.f6246n = -1;
                    return;
                }
                if (i17 != 4) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                }
                bVar.f6254s = i16;
                bVar.f6250p = -1;
                bVar.f6248o = -1;
                bVar.f6244m = -1;
                bVar.f6246n = -1;
                return;
            case 6:
                if (i17 == 6) {
                    bVar.f6256u = i16;
                    bVar.f6255t = -1;
                    return;
                } else if (i17 != 7) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                } else {
                    bVar.f6255t = i16;
                    bVar.f6256u = -1;
                    return;
                }
            case 7:
                if (i17 == 7) {
                    bVar.f6258w = i16;
                    bVar.f6257v = -1;
                    return;
                } else if (i17 != 6) {
                    org.apache.commons.lang3.e.r("right to ", t(i17), " undefined");
                    return;
                } else {
                    bVar.f6257v = i16;
                    bVar.f6258w = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(t(i15) + " to " + t(i17) + " unknown");
        }
    }

    public final a k(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        HashMap<Integer, a> map = this.f6198g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i14), new a());
        }
        return map.get(Integer.valueOf(i14));
    }

    public final a l(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        HashMap<Integer, a> map = this.f6198g;
        if (map.containsKey(numValueOf)) {
            return map.get(Integer.valueOf(i14));
        }
        return null;
    }

    public final void m(int i14, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i14);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarJ = j(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarJ.f6203e.f6220a = true;
                    }
                    this.f6198g.put(Integer.valueOf(aVarJ.f6199a), aVarJ);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVarJ = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVarJ.f6203e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVarJ.f6202d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarJ = j(context, Xml.asAttributeSet(xmlResourceParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVarJ.f6201c.a(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVarJ.f6204f.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarJ = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                                b bVar = aVarJ.f6203e;
                                bVar.f6220a = true;
                                bVar.f6222b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarJ = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                                aVarJ.f6203e.f6237i0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarJ = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarJ == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.a.d(context, xmlResourceParser, aVarJ.f6205g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f6198g.put(Integer.valueOf(aVarJ.f6199a), aVarJ);
                    aVarJ = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void s(int i14, int i15, int i16) {
        a aVarK = k(i14);
        switch (i15) {
            case 1:
                aVarK.f6203e.G = i16;
                break;
            case 2:
                aVarK.f6203e.H = i16;
                break;
            case 3:
                aVarK.f6203e.I = i16;
                break;
            case 4:
                aVarK.f6203e.J = i16;
                break;
            case 5:
                aVarK.f6203e.M = i16;
                break;
            case 6:
                aVarK.f6203e.L = i16;
                break;
            case 7:
                aVarK.f6203e.K = i16;
                break;
            default:
                vb.h.s("unknown constraint");
                break;
        }
    }
}
