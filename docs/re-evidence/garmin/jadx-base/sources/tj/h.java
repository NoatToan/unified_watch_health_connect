package tj;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import com.google.android.exoplayer2.C;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import org.apache.commons.lang3.StringUtils;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static HashSet<String> f164960h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Canvas f164961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f164962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tj.g f164963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3095h f164964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Stack<C3095h> f164965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Stack<tj.g.j0> f164966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Stack<Matrix> f164967g;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f164969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f164970c;

        static {
            int[] iArr = new int[tj.g.e0.d.values().length];
            f164970c = iArr;
            try {
                iArr[tj.g.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f164970c[tj.g.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f164970c[tj.g.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[tj.g.e0.c.values().length];
            f164969b = iArr2;
            try {
                iArr2[tj.g.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f164969b[tj.g.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f164969b[tj.g.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[tj.e.a.values().length];
            f164968a = iArr3;
            try {
                iArr3[tj.e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f164968a[tj.e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f164968a[tj.e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f164968a[tj.e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f164968a[tj.e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f164968a[tj.e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f164968a[tj.e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f164968a[tj.e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public class b implements tj.g.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f164971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f164972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f164973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f164974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f164975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f164976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f164977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f164978h;

        public b(tj.g.w wVar) {
            ArrayList arrayList = new ArrayList();
            this.f164971a = arrayList;
            this.f164974d = null;
            this.f164975e = false;
            this.f164976f = true;
            this.f164977g = -1;
            if (wVar == null) {
                return;
            }
            wVar.h(this);
            if (this.f164978h) {
                this.f164974d.b((c) arrayList.get(this.f164977g));
                arrayList.set(this.f164977g, this.f164974d);
                this.f164978h = false;
            }
            c cVar = this.f164974d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }

        @Override // tj.g.x
        public final void a(float f14, float f15) {
            boolean z14 = this.f164978h;
            ArrayList arrayList = this.f164971a;
            if (z14) {
                this.f164974d.b((c) arrayList.get(this.f164977g));
                arrayList.set(this.f164977g, this.f164974d);
                this.f164978h = false;
            }
            c cVar = this.f164974d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
            this.f164972b = f14;
            this.f164973c = f15;
            this.f164974d = new c(h.this, f14, f15, 0.0f, 0.0f);
            this.f164977g = arrayList.size();
        }

        @Override // tj.g.x
        public final void b(float f14, float f15, float f16, float f17, float f18, float f19) {
            if (this.f164976f || this.f164975e) {
                this.f164974d.a(f14, f15);
                this.f164971a.add(this.f164974d);
                this.f164975e = false;
            }
            this.f164974d = new c(h.this, f18, f19, f18 - f16, f19 - f17);
            this.f164978h = false;
        }

        @Override // tj.g.x
        public final void c(float f14, float f15) {
            this.f164974d.a(f14, f15);
            this.f164971a.add(this.f164974d);
            c cVar = this.f164974d;
            this.f164974d = new c(h.this, f14, f15, f14 - cVar.f164980a, f15 - cVar.f164981b);
            this.f164978h = false;
        }

        @Override // tj.g.x
        public final void close() {
            this.f164971a.add(this.f164974d);
            c(this.f164972b, this.f164973c);
            this.f164978h = true;
        }

        @Override // tj.g.x
        public final void d(float f14, float f15, float f16, boolean z14, boolean z15, float f17, float f18) {
            this.f164975e = true;
            this.f164976f = false;
            c cVar = this.f164974d;
            h.a(cVar.f164980a, cVar.f164981b, f14, f15, f16, z14, z15, f17, f18, this);
            this.f164976f = true;
            this.f164978h = false;
        }

        @Override // tj.g.x
        public final void e(float f14, float f15, float f16, float f17) {
            this.f164974d.a(f14, f15);
            this.f164971a.add(this.f164974d);
            this.f164974d = new c(h.this, f16, f17, f16 - f14, f17 - f15);
            this.f164978h = false;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f164980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f164981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f164982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f164983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f164984e = false;

        public c(h hVar, float f14, float f15, float f16, float f17) {
            this.f164982c = 0.0f;
            this.f164983d = 0.0f;
            this.f164980a = f14;
            this.f164981b = f15;
            double dSqrt = Math.sqrt((f17 * f17) + (f16 * f16));
            if (dSqrt != 0.0d) {
                this.f164982c = (float) (((double) f16) / dSqrt);
                this.f164983d = (float) (((double) f17) / dSqrt);
            }
        }

        public final void a(float f14, float f15) {
            float f16 = f14 - this.f164980a;
            float f17 = f15 - this.f164981b;
            double dSqrt = Math.sqrt((f17 * f17) + (f16 * f16));
            if (dSqrt != 0.0d) {
                f16 = (float) (((double) f16) / dSqrt);
                f17 = (float) (((double) f17) / dSqrt);
            }
            float f18 = this.f164982c;
            if (f16 != (-f18) || f17 != (-this.f164983d)) {
                this.f164982c = f18 + f16;
                this.f164983d += f17;
            } else {
                this.f164984e = true;
                this.f164982c = -f17;
                this.f164983d = f16;
            }
        }

        public final void b(c cVar) {
            float f14 = cVar.f164982c;
            float f15 = this.f164982c;
            if (f14 == (-f15)) {
                float f16 = cVar.f164983d;
                if (f16 == (-this.f164983d)) {
                    this.f164984e = true;
                    this.f164982c = -f16;
                    this.f164983d = cVar.f164982c;
                    return;
                }
            }
            this.f164982c = f15 + f14;
            this.f164983d += cVar.f164983d;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("(");
            sb3.append(this.f164980a);
            sb3.append(",");
            sb3.append(this.f164981b);
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f164982c);
            sb3.append(",");
            return e0.e(this.f164983d, ")", sb3);
        }
    }

    public class d implements tj.g.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f164985a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f164986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f164987c;

        public d(h hVar, tj.g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
        }

        @Override // tj.g.x
        public final void a(float f14, float f15) {
            this.f164985a.moveTo(f14, f15);
            this.f164986b = f14;
            this.f164987c = f15;
        }

        @Override // tj.g.x
        public final void b(float f14, float f15, float f16, float f17, float f18, float f19) {
            this.f164985a.cubicTo(f14, f15, f16, f17, f18, f19);
            this.f164986b = f18;
            this.f164987c = f19;
        }

        @Override // tj.g.x
        public final void c(float f14, float f15) {
            this.f164985a.lineTo(f14, f15);
            this.f164986b = f14;
            this.f164987c = f15;
        }

        @Override // tj.g.x
        public final void close() {
            this.f164985a.close();
        }

        @Override // tj.g.x
        public final void d(float f14, float f15, float f16, boolean z14, boolean z15, float f17, float f18) {
            h.a(this.f164986b, this.f164987c, f14, f15, f16, z14, z15, f17, f18, this);
            this.f164986b = f17;
            this.f164987c = f18;
        }

        @Override // tj.g.x
        public final void e(float f14, float f15, float f16, float f17) {
            this.f164985a.quadTo(f14, f15, f16, f17);
            this.f164986b = f16;
            this.f164987c = f17;
        }
    }

    public class e extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Path f164988d;

        public e(Path path, float f14, float f15) {
            super(f14, f15);
            this.f164988d = path;
        }

        @Override // tj.h.f, tj.h.j
        public final void b(String str) {
            h hVar = h.this;
            if (hVar.T()) {
                C3095h c3095h = hVar.f164964d;
                if (c3095h.f164998b) {
                    hVar.f164961a.drawTextOnPath(str, this.f164988d, this.f164990a, this.f164991b, c3095h.f165000d);
                }
                C3095h c3095h2 = hVar.f164964d;
                if (c3095h2.f164999c) {
                    hVar.f164961a.drawTextOnPath(str, this.f164988d, this.f164990a, this.f164991b, c3095h2.f165001e);
                }
            }
            this.f164990a = hVar.f164964d.f165000d.measureText(str) + this.f164990a;
        }
    }

    public class f extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f164990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f164991b;

        public f(float f14, float f15) {
            super(h.this, null);
            this.f164990a = f14;
            this.f164991b = f15;
        }

        @Override // tj.h.j
        public void b(String str) {
            h hVar = h.this;
            if (hVar.T()) {
                C3095h c3095h = hVar.f164964d;
                if (c3095h.f164998b) {
                    hVar.f164961a.drawText(str, this.f164990a, this.f164991b, c3095h.f165000d);
                }
                C3095h c3095h2 = hVar.f164964d;
                if (c3095h2.f164999c) {
                    hVar.f164961a.drawText(str, this.f164990a, this.f164991b, c3095h2.f165001e);
                }
            }
            this.f164990a = hVar.f164964d.f165000d.measureText(str) + this.f164990a;
        }
    }

    public class g extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f164993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f164994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Path f164995c;

        public g(float f14, float f15, Path path) {
            super(h.this, null);
            this.f164993a = f14;
            this.f164994b = f15;
            this.f164995c = path;
        }

        @Override // tj.h.j
        public final boolean a(tj.g.y0 y0Var) {
            return !(y0Var instanceof tj.g.z0);
        }

        @Override // tj.h.j
        public final void b(String str) {
            String str2;
            h hVar = h.this;
            if (hVar.T()) {
                Path path = new Path();
                str2 = str;
                hVar.f164964d.f165000d.getTextPath(str2, 0, str.length(), this.f164993a, this.f164994b, path);
                this.f164995c.addPath(path);
            } else {
                str2 = str;
            }
            this.f164993a = hVar.f164964d.f165000d.measureText(str2) + this.f164993a;
        }
    }

    public class i extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f165005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f165006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f165007c;

        public i(float f14, float f15) {
            super(h.this, null);
            this.f165007c = new RectF();
            this.f165005a = f14;
            this.f165006b = f15;
        }

        @Override // tj.h.j
        public final boolean a(tj.g.y0 y0Var) {
            if (!(y0Var instanceof tj.g.z0)) {
                return true;
            }
            tj.g.l0 l0VarC = y0Var.f164906a.c(((tj.g.z0) y0Var).f164957n);
            if (l0VarC == null) {
                return false;
            }
            tj.g.v vVar = (tj.g.v) l0VarC;
            d dVar = new d(h.this, vVar.f164941o);
            Matrix matrix = vVar.f164895n;
            Path path = dVar.f164985a;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.f165007c.union(rectF);
            return false;
        }

        @Override // tj.h.j
        public final void b(String str) {
            h hVar = h.this;
            if (hVar.T()) {
                Rect rect = new Rect();
                hVar.f164964d.f165000d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f165005a, this.f165006b);
                this.f165007c.union(rectF);
            }
            this.f165005a = hVar.f164964d.f165000d.measureText(str) + this.f165005a;
        }
    }

    public h(Canvas canvas, float f14) {
        this.f164961a = canvas;
        this.f164962b = f14;
    }

    public static void L(C3095h c3095h, boolean z14, tj.g.o0 o0Var) {
        int i14;
        tj.g.e0 e0Var = c3095h.f164997a;
        float fFloatValue = (z14 ? e0Var.f164802d : e0Var.f164804f).floatValue();
        if (o0Var instanceof tj.g.f) {
            i14 = ((tj.g.f) o0Var).f164866a;
        } else if (!(o0Var instanceof tj.g.C3094g)) {
            return;
        } else {
            i14 = c3095h.f164997a.f164813n.f164866a;
        }
        int i15 = i(fFloatValue, i14);
        if (z14) {
            c3095h.f165000d.setColor(i15);
        } else {
            c3095h.f165001e.setColor(i15);
        }
    }

    public static void a(float f14, float f15, float f16, float f17, float f18, boolean z14, boolean z15, float f19, float f22, tj.g.x xVar) {
        if (f14 == f19 && f15 == f22) {
            return;
        }
        if (f16 == 0.0f || f17 == 0.0f) {
            xVar.c(f19, f22);
            return;
        }
        float fAbs = Math.abs(f16);
        float fAbs2 = Math.abs(f17);
        double radians = Math.toRadians(((double) f18) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d14 = ((double) (f14 - f19)) / 2.0d;
        double d15 = ((double) (f15 - f22)) / 2.0d;
        double d16 = (dSin * d15) + (dCos * d14);
        double d17 = (dCos * d15) + ((-dSin) * d14);
        double d18 = fAbs * fAbs;
        double d19 = fAbs2 * fAbs2;
        double d24 = d16 * d16;
        double d25 = d17 * d17;
        double d26 = (d25 / d19) + (d24 / d18);
        if (d26 > 0.99999d) {
            double dSqrt = Math.sqrt(d26) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d18 = fAbs * fAbs;
            d19 = fAbs2 * fAbs2;
        }
        double d27 = z14 == z15 ? -1.0d : 1.0d;
        double d28 = d18 * d19;
        double d29 = d18 * d25;
        double d34 = d19 * d24;
        double d35 = ((d28 - d29) - d34) / (d29 + d34);
        if (d35 < 0.0d) {
            d35 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d35) * d27;
        double d36 = fAbs;
        double d37 = fAbs2;
        double d38 = ((d36 * d17) / d37) * dSqrt2;
        double d39 = dSqrt2 * (-((d37 * d16) / d36));
        double d44 = ((dCos * d38) - (dSin * d39)) + (((double) (f14 + f19)) / 2.0d);
        double d45 = (dCos * d39) + (dSin * d38) + (((double) (f15 + f22)) / 2.0d);
        double d46 = (d16 - d38) / d36;
        double d47 = (d17 - d39) / d37;
        double d48 = ((-d16) - d38) / d36;
        double d49 = ((-d17) - d39) / d37;
        double d54 = (d47 * d47) + (d46 * d46);
        double dAcos = Math.acos(d46 / Math.sqrt(d54)) * (d47 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d49 * d49) + (d48 * d48)) * d54);
        double d55 = (d47 * d49) + (d46 * d48);
        double d56 = d55 / dSqrt3;
        double dAcos2 = ((d46 * d49) - (d47 * d48) < 0.0d ? -1.0d : 1.0d) * (d56 < -1.0d ? 3.141592653589793d : d56 > 1.0d ? 0.0d : Math.acos(d56));
        if (!z15 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z15 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d57 = dAcos2 % 6.283185307179586d;
        double d58 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d57) * 2.0d) / 3.141592653589793d);
        double d59 = d57 / ((double) iCeil);
        double d64 = d59 / 2.0d;
        double dSin2 = (Math.sin(d64) * 1.3333333333333333d) / (Math.cos(d64) + 1.0d);
        int i14 = iCeil * 6;
        float[] fArr = new float[i14];
        int i15 = 0;
        int i16 = 0;
        while (i15 < iCeil) {
            double d65 = d58;
            double d66 = (((double) i15) * d59) + d65;
            double dCos2 = Math.cos(d66);
            double dSin3 = Math.sin(d66);
            int i17 = i15;
            int i18 = i16;
            fArr[i18] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i16 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d67 = d66 + d59;
            double dCos3 = Math.cos(d67);
            double dSin4 = Math.sin(d67);
            fArr[i18 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i18 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i18 + 4] = (float) dCos3;
            i16 = i18 + 6;
            fArr[i18 + 5] = (float) dSin4;
            i15 = i17 + 1;
            d58 = d65;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f18);
        matrix.postTranslate((float) d44, (float) d45);
        matrix.mapPoints(fArr);
        fArr[i14 - 2] = f19;
        fArr[i14 - 1] = f22;
        for (int i19 = 0; i19 < i14; i19 += 6) {
            xVar.b(fArr[i19], fArr[i19 + 1], fArr[i19 + 2], fArr[i19 + 3], fArr[i19 + 4], fArr[i19 + 5]);
        }
    }

    public static tj.g.b c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new tj.g.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r1 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix e(tj.g.b bVar, tj.g.b bVar2, tj.e eVar) {
        tj.e.a aVar;
        int i14;
        float f14;
        float f15;
        Matrix matrix = new Matrix();
        if (eVar != null && (aVar = eVar.f164743a) != null) {
            float f16 = bVar.f164771c / bVar2.f164771c;
            float f17 = bVar.f164772d / bVar2.f164772d;
            float f18 = -bVar2.f164769a;
            float f19 = -bVar2.f164770b;
            if (eVar.equals(tj.e.f164741c)) {
                matrix.preTranslate(bVar.f164769a, bVar.f164770b);
                matrix.preScale(f16, f17);
                matrix.preTranslate(f18, f19);
                return matrix;
            }
            float fMax = eVar.f164744b == tj.e.b.slice ? Math.max(f16, f17) : Math.min(f16, f17);
            float f22 = bVar.f164771c / fMax;
            float f24 = bVar.f164772d / fMax;
            int[] iArr = a.f164968a;
            switch (iArr[aVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f15 = (bVar2.f164771c - f22) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f15 = bVar2.f164771c - f22;
                    break;
                default:
                    i14 = iArr[aVar.ordinal()];
                    if (i14 == 2) {
                        f14 = (bVar2.f164772d - f24) / 2.0f;
                        f19 -= f14;
                    } else {
                        if (i14 != 3) {
                            if (i14 != 5) {
                                if (i14 != 6) {
                                    if (i14 != 7) {
                                    }
                                }
                            }
                            f14 = (bVar2.f164772d - f24) / 2.0f;
                            f19 -= f14;
                        }
                        f14 = bVar2.f164772d - f24;
                        f19 -= f14;
                    }
                    matrix.preTranslate(bVar.f164769a, bVar.f164770b);
                    matrix.preScale(fMax, fMax);
                    matrix.preTranslate(f18, f19);
                    break;
            }
            f18 -= f15;
            i14 = iArr[aVar.ordinal()];
            if (i14 == 2) {
                f14 = (bVar2.f164772d - f24) / 2.0f;
                f19 -= f14;
            } else {
                if (i14 != 3) {
                    if (i14 != 5) {
                        if (i14 != 6) {
                            if (i14 != 7) {
                            }
                        }
                    }
                    f14 = (bVar2.f164772d - f24) / 2.0f;
                    f19 -= f14;
                }
                f14 = bVar2.f164772d - f24;
                f19 -= f14;
            }
            matrix.preTranslate(bVar.f164769a, bVar.f164770b);
            matrix.preScale(fMax, fMax);
            matrix.preTranslate(f18, f19);
        }
        return matrix;
    }

    public static Typeface h(String str, Integer num, tj.g.e0.b bVar) {
        int i14;
        boolean z14 = bVar == tj.g.e0.b.Italic;
        if (num.intValue() > 500) {
            i14 = z14 ? 3 : 1;
        } else {
            i14 = z14 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i14);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i14);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i14);
            case "serif":
                return Typeface.create(Typeface.SERIF, i14);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i14);
            default:
                return null;
        }
    }

    public static int i(float f14, int i14) {
        int i15 = 255;
        int iRound = Math.round(((i14 >> 24) & 255) * f14);
        if (iRound < 0) {
            i15 = 0;
        } else if (iRound <= 255) {
            i15 = iRound;
        }
        return (i15 << 24) | (i14 & FlexItem.MAX_SIZE);
    }

    public static void p(tj.g.j jVar, String str) {
        tj.g.l0 l0VarC = jVar.f164906a.c(str);
        if (l0VarC == null || !(l0VarC instanceof tj.g.j) || l0VarC == jVar) {
            return;
        }
        tj.g.j jVar2 = (tj.g.j) l0VarC;
        if (jVar.f164887i == null) {
            jVar.f164887i = jVar2.f164887i;
        }
        if (jVar.f164888j == null) {
            jVar.f164888j = jVar2.f164888j;
        }
        if (jVar.f164889k == null) {
            jVar.f164889k = jVar2.f164889k;
        }
        if (jVar.f164886h.isEmpty()) {
            jVar.f164886h = jVar2.f164886h;
        }
        try {
            if (jVar instanceof tj.g.m0) {
                tj.g.m0 m0Var = (tj.g.m0) jVar;
                tj.g.m0 m0Var2 = (tj.g.m0) l0VarC;
                if (m0Var.f164902m == null) {
                    m0Var.f164902m = m0Var2.f164902m;
                }
                if (m0Var.f164903n == null) {
                    m0Var.f164903n = m0Var2.f164903n;
                }
                if (m0Var.f164904o == null) {
                    m0Var.f164904o = m0Var2.f164904o;
                }
                if (m0Var.f164905p == null) {
                    m0Var.f164905p = m0Var2.f164905p;
                }
            } else {
                q((tj.g.q0) jVar, (tj.g.q0) l0VarC);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f164890l;
        if (str2 != null) {
            p(jVar, str2);
        }
    }

    public static void q(tj.g.q0 q0Var, tj.g.q0 q0Var2) {
        if (q0Var.f164921m == null) {
            q0Var.f164921m = q0Var2.f164921m;
        }
        if (q0Var.f164922n == null) {
            q0Var.f164922n = q0Var2.f164922n;
        }
        if (q0Var.f164923o == null) {
            q0Var.f164923o = q0Var2.f164923o;
        }
        if (q0Var.f164924p == null) {
            q0Var.f164924p = q0Var2.f164924p;
        }
        if (q0Var.f164925q == null) {
            q0Var.f164925q = q0Var2.f164925q;
        }
    }

    public static void r(tj.g.y yVar, String str) {
        tj.g.l0 l0VarC = yVar.f164906a.c(str);
        if (l0VarC == null || !(l0VarC instanceof tj.g.y) || l0VarC == yVar) {
            return;
        }
        tj.g.y yVar2 = (tj.g.y) l0VarC;
        if (yVar.f164948p == null) {
            yVar.f164948p = yVar2.f164948p;
        }
        if (yVar.f164949q == null) {
            yVar.f164949q = yVar2.f164949q;
        }
        if (yVar.f164950r == null) {
            yVar.f164950r = yVar2.f164950r;
        }
        if (yVar.f164951s == null) {
            yVar.f164951s = yVar2.f164951s;
        }
        if (yVar.f164952t == null) {
            yVar.f164952t = yVar2.f164952t;
        }
        if (yVar.f164953u == null) {
            yVar.f164953u = yVar2.f164953u;
        }
        if (yVar.f164954v == null) {
            yVar.f164954v = yVar2.f164954v;
        }
        if (yVar.f164872i.isEmpty()) {
            yVar.f164872i = yVar2.f164872i;
        }
        if (yVar.f164932o == null) {
            yVar.f164932o = yVar2.f164932o;
        }
        if (yVar.f164916n == null) {
            yVar.f164916n = yVar2.f164916n;
        }
        String str2 = yVar2.f164955w;
        if (str2 != null) {
            r(yVar, str2);
        }
    }

    public static boolean v(tj.g.e0 e0Var, long j8) {
        return (e0Var.f164799a & j8) != 0;
    }

    public static Path y(tj.g.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f164956o;
        path.moveTo(fArr[0], fArr[1]);
        int i14 = 2;
        while (true) {
            float[] fArr2 = zVar.f164956o;
            if (i14 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i14], fArr2[i14 + 1]);
            i14 += 2;
        }
        if (zVar instanceof tj.g.a0) {
            path.close();
        }
        if (zVar.f164894h == null) {
            zVar.f164894h = c(path);
        }
        return path;
    }

    public final tj.g.b A(tj.g.p pVar, tj.g.p pVar2, tj.g.p pVar3, tj.g.p pVar4) {
        float fD = pVar != null ? pVar.d(this) : 0.0f;
        float fE = pVar2 != null ? pVar2.e(this) : 0.0f;
        C3095h c3095h = this.f164964d;
        tj.g.b bVar = c3095h.f165003g;
        if (bVar == null) {
            bVar = c3095h.f165002f;
        }
        return new tj.g.b(fD, fE, pVar3 != null ? pVar3.d(this) : bVar.f164771c, pVar4 != null ? pVar4.e(this) : bVar.f164772d);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01c5  */
    @TargetApi(19)
    public final Path B(tj.g.k0 k0Var) {
        Path path;
        Path pathB;
        this.f164965e.push(this.f164964d);
        C3095h c3095h = new C3095h(this, this.f164964d);
        this.f164964d = c3095h;
        R(c3095h, k0Var);
        if (!k() || !T()) {
            this.f164964d = this.f164965e.pop();
            return null;
        }
        if (k0Var instanceof tj.g.e1) {
            tj.g.e1 e1Var = (tj.g.e1) k0Var;
            tj.g.l0 l0VarC = k0Var.f164906a.c(e1Var.f164859o);
            if (l0VarC == null) {
                this.f164964d = this.f164965e.pop();
                return null;
            }
            if (!(l0VarC instanceof tj.g.k0)) {
                this.f164964d = this.f164965e.pop();
                return null;
            }
            path = B((tj.g.k0) l0VarC);
            if (path != null) {
                if (e1Var.f164894h == null) {
                    e1Var.f164894h = c(path);
                }
                Matrix matrix = e1Var.f164901n;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (this.f164964d.f164997a.I != null && (pathB = b(k0Var, k0Var.f164894h)) != null) {
                    path.op(pathB, Path.Op.INTERSECT);
                }
                this.f164964d = this.f164965e.pop();
                return path;
            }
            return null;
        }
        if (k0Var instanceof tj.g.l) {
            tj.g.l lVar = (tj.g.l) k0Var;
            if (k0Var instanceof tj.g.v) {
                d dVar = new d(this, ((tj.g.v) k0Var).f164941o);
                tj.g.b bVar = k0Var.f164894h;
                Path path2 = dVar.f164985a;
                if (bVar == null) {
                    k0Var.f164894h = c(path2);
                }
                path = path2;
            } else if (k0Var instanceof tj.g.b0) {
                path = z((tj.g.b0) k0Var);
            } else if (k0Var instanceof tj.g.d) {
                path = w((tj.g.d) k0Var);
            } else if (k0Var instanceof tj.g.i) {
                path = x((tj.g.i) k0Var);
            } else {
                path = k0Var instanceof tj.g.z ? y((tj.g.z) k0Var) : null;
            }
            if (path != null) {
                if (lVar.f164894h == null) {
                    lVar.f164894h = c(path);
                }
                Matrix matrix2 = lVar.f164895n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                tj.g.e0.a aVar = this.f164964d.f164997a.P;
                path.setFillType((aVar == null || aVar != tj.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                if (this.f164964d.f164997a.I != null) {
                    path.op(pathB, Path.Op.INTERSECT);
                }
                this.f164964d = this.f164965e.pop();
                return path;
            }
            return null;
        }
        if (k0Var instanceof tj.g.w0) {
            tj.g.w0 w0Var = (tj.g.w0) k0Var;
            ArrayList arrayList = w0Var.f164765n;
            float fE = 0.0f;
            float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((tj.g.p) w0Var.f164765n.get(0)).d(this);
            ArrayList arrayList2 = w0Var.f164766o;
            float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((tj.g.p) w0Var.f164766o.get(0)).e(this);
            ArrayList arrayList3 = w0Var.f164767p;
            float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((tj.g.p) w0Var.f164767p.get(0)).d(this);
            ArrayList arrayList4 = w0Var.f164768q;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fE = ((tj.g.p) w0Var.f164768q.get(0)).e(this);
            }
            if (this.f164964d.f164997a.f164820w != tj.g.e0.f.Start) {
                float fD3 = d(w0Var);
                if (this.f164964d.f164997a.f164820w == tj.g.e0.f.Middle) {
                    fD3 /= 2.0f;
                }
                fD -= fD3;
            }
            if (w0Var.f164894h == null) {
                i iVar = new i(fD, fE2);
                n(w0Var, iVar);
                RectF rectF = iVar.f165007c;
                w0Var.f164894h = new tj.g.b(rectF.left, rectF.top, rectF.width(), iVar.f165007c.height());
            }
            path = new Path();
            n(w0Var, new g(fD + fD2, fE2 + fE, path));
            Matrix matrix3 = w0Var.f164947r;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            tj.g.e0.a aVar2 = this.f164964d.f164997a.P;
            path.setFillType((aVar2 == null || aVar2 != tj.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            if (this.f164964d.f164997a.I != null) {
                path.op(pathB, Path.Op.INTERSECT);
            }
            this.f164964d = this.f164965e.pop();
            return path;
        }
        return null;
    }

    public final void C(tj.g.b bVar) {
        if (this.f164964d.f164997a.T != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f164961a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            tj.g.s sVar = (tj.g.s) this.f164963c.c(this.f164964d.f164997a.T);
            J(sVar, bVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            J(sVar, bVar);
            canvas.restore();
            canvas.restore();
        }
        M();
    }

    public final boolean D() {
        tj.g.l0 l0VarC;
        int i14 = 0;
        if (this.f164964d.f164997a.f164812m.floatValue() >= 1.0f && this.f164964d.f164997a.T == null) {
            return false;
        }
        int iFloatValue = (int) (this.f164964d.f164997a.f164812m.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i14 = 255;
            if (iFloatValue <= 255) {
                i14 = iFloatValue;
            }
        }
        this.f164961a.saveLayerAlpha(null, i14, 31);
        this.f164965e.push(this.f164964d);
        C3095h c3095h = new C3095h(this, this.f164964d);
        this.f164964d = c3095h;
        String str = c3095h.f164997a.T;
        if (str != null && ((l0VarC = this.f164963c.c(str)) == null || !(l0VarC instanceof tj.g.s))) {
            tj.g.e0 e0Var = this.f164964d.f164997a;
            String str2 = e0Var.T;
            e0Var.T = null;
        }
        return true;
    }

    public final void E(tj.g.f0 f0Var, tj.g.b bVar, tj.g.b bVar2, tj.e eVar) {
        if (bVar.f164771c == 0.0f || bVar.f164772d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f0Var.f164916n) == null) {
            eVar = tj.e.f164742d;
        }
        R(this.f164964d, f0Var);
        if (k()) {
            C3095h c3095h = this.f164964d;
            c3095h.f165002f = bVar;
            if (!c3095h.f164997a.f164821x.booleanValue()) {
                tj.g.b bVar3 = this.f164964d.f165002f;
                K(bVar3.f164769a, bVar3.f164770b, bVar3.f164771c, bVar3.f164772d);
            }
            f(f0Var, this.f164964d.f165002f);
            C3095h c3095h2 = this.f164964d;
            Canvas canvas = this.f164961a;
            if (bVar2 != null) {
                canvas.concat(e(c3095h2.f165002f, bVar2, eVar));
                this.f164964d.f165003g = f0Var.f164932o;
            } else {
                tj.g.b bVar4 = c3095h2.f165002f;
                canvas.translate(bVar4.f164769a, bVar4.f164770b);
            }
            boolean zD = D();
            S();
            G(f0Var, true);
            if (zD) {
                C(f0Var.f164894h);
            }
            P(f0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(tj.g.n0 n0Var) {
        tj.g.p pVar;
        String str;
        int iIndexOf;
        Set<String> setI;
        tj.g.p pVar2;
        tj.g.n0 n0VarC;
        Boolean bool;
        if (n0Var instanceof tj.g.t) {
            return;
        }
        N();
        if ((n0Var instanceof tj.g.l0) && (bool = ((tj.g.l0) n0Var).f164897d) != null) {
            this.f164964d.f165004h = bool.booleanValue();
        }
        if (n0Var instanceof tj.g.f0) {
            tj.g.f0 f0Var = (tj.g.f0) n0Var;
            E(f0Var, A(f0Var.f164867p, f0Var.f164868q, f0Var.f164869r, f0Var.f164870s), f0Var.f164932o, f0Var.f164916n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (n0Var instanceof tj.g.e1) {
                tj.g.e1 e1Var = (tj.g.e1) n0Var;
                Canvas canvas = this.f164961a;
                tj.g.p pVar3 = e1Var.f164862r;
                if ((pVar3 == null || !pVar3.g()) && ((pVar2 = e1Var.f164863s) == null || !pVar2.g())) {
                    R(this.f164964d, e1Var);
                    if (k() && (n0VarC = e1Var.f164906a.c(e1Var.f164859o)) != null) {
                        Matrix matrix = e1Var.f164901n;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        tj.g.p pVar4 = e1Var.f164860p;
                        float fD = pVar4 != null ? pVar4.d(this) : 0.0f;
                        tj.g.p pVar5 = e1Var.f164861q;
                        canvas.translate(fD, pVar5 != null ? pVar5.e(this) : 0.0f);
                        f(e1Var, e1Var.f164894h);
                        boolean zD = D();
                        this.f164966f.push(e1Var);
                        this.f164967g.push(this.f164961a.getMatrix());
                        if (n0VarC instanceof tj.g.f0) {
                            tj.g.f0 f0Var2 = (tj.g.f0) n0VarC;
                            tj.g.b bVarA = A(null, null, e1Var.f164862r, e1Var.f164863s);
                            N();
                            E(f0Var2, bVarA, f0Var2.f164932o, f0Var2.f164916n);
                            M();
                        } else if (n0VarC instanceof tj.g.t0) {
                            tj.g.p pVar6 = e1Var.f164862r;
                            if (pVar6 == null) {
                                pVar6 = new tj.g.p(100.0f, tj.g.d1.percent);
                            }
                            tj.g.p pVar7 = e1Var.f164863s;
                            if (pVar7 == null) {
                                pVar7 = new tj.g.p(100.0f, tj.g.d1.percent);
                            }
                            tj.g.b bVarA2 = A(null, null, pVar6, pVar7);
                            N();
                            tj.g.t0 t0Var = (tj.g.t0) n0VarC;
                            if (bVarA2.f164771c != 0.0f && bVarA2.f164772d != 0.0f) {
                                tj.e eVar = t0Var.f164916n;
                                if (eVar == null) {
                                    eVar = tj.e.f164742d;
                                }
                                R(this.f164964d, t0Var);
                                C3095h c3095h = this.f164964d;
                                c3095h.f165002f = bVarA2;
                                if (!c3095h.f164997a.f164821x.booleanValue()) {
                                    tj.g.b bVar = this.f164964d.f165002f;
                                    K(bVar.f164769a, bVar.f164770b, bVar.f164771c, bVar.f164772d);
                                }
                                tj.g.b bVar2 = t0Var.f164932o;
                                C3095h c3095h2 = this.f164964d;
                                if (bVar2 != null) {
                                    canvas.concat(e(c3095h2.f165002f, bVar2, eVar));
                                    this.f164964d.f165003g = t0Var.f164932o;
                                } else {
                                    tj.g.b bVar3 = c3095h2.f165002f;
                                    canvas.translate(bVar3.f164769a, bVar3.f164770b);
                                }
                                boolean zD2 = D();
                                G(t0Var, true);
                                if (zD2) {
                                    C(t0Var.f164894h);
                                }
                                P(t0Var);
                            }
                            M();
                        } else {
                            F(n0VarC);
                        }
                        this.f164966f.pop();
                        this.f164967g.pop();
                        if (zD) {
                            C(e1Var.f164894h);
                        }
                        P(e1Var);
                    }
                }
            } else if (n0Var instanceof tj.g.s0) {
                tj.g.s0 s0Var = (tj.g.s0) n0Var;
                R(this.f164964d, s0Var);
                if (k()) {
                    Matrix matrix2 = s0Var.f164901n;
                    if (matrix2 != null) {
                        this.f164961a.concat(matrix2);
                    }
                    f(s0Var, s0Var.f164894h);
                    boolean zD3 = D();
                    String language = Locale.getDefault().getLanguage();
                    for (tj.g.n0 n0Var2 : s0Var.f164872i) {
                        if (n0Var2 instanceof tj.g.g0) {
                            tj.g.g0 g0Var = (tj.g.g0) n0Var2;
                            if (g0Var.f() == null && ((setI = g0Var.i()) == null || (!setI.isEmpty() && setI.contains(language)))) {
                                Set<String> requiredFeatures = g0Var.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (f164960h == null) {
                                        synchronized (h.class) {
                                            HashSet<String> hashSet = new HashSet<>();
                                            f164960h = hashSet;
                                            hashSet.add("Structure");
                                            f164960h.add("BasicStructure");
                                            f164960h.add("ConditionalProcessing");
                                            f164960h.add("Image");
                                            f164960h.add("Style");
                                            f164960h.add("ViewportAttribute");
                                            f164960h.add("Shape");
                                            f164960h.add("BasicText");
                                            f164960h.add("PaintAttribute");
                                            f164960h.add("BasicPaintAttribute");
                                            f164960h.add("OpacityAttribute");
                                            f164960h.add("BasicGraphicsAttribute");
                                            f164960h.add("Marker");
                                            f164960h.add("Gradient");
                                            f164960h.add("Pattern");
                                            f164960h.add("Clip");
                                            f164960h.add("BasicClip");
                                            f164960h.add("Mask");
                                            f164960h.add("View");
                                        }
                                    }
                                    if (requiredFeatures.isEmpty() || !f164960h.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set<String> setG = g0Var.g();
                                if (setG == null) {
                                    Set<String> setM = g0Var.m();
                                    if (setM == null) {
                                        F(n0Var2);
                                        break;
                                    }
                                    setM.isEmpty();
                                } else {
                                    setG.isEmpty();
                                }
                            }
                        }
                    }
                    if (zD3) {
                        C(s0Var.f164894h);
                    }
                    P(s0Var);
                }
            } else if (n0Var instanceof tj.g.m) {
                tj.g.m mVar = (tj.g.m) n0Var;
                R(this.f164964d, mVar);
                if (k()) {
                    Matrix matrix3 = mVar.f164901n;
                    if (matrix3 != null) {
                        this.f164961a.concat(matrix3);
                    }
                    f(mVar, mVar.f164894h);
                    boolean zD4 = D();
                    G(mVar, true);
                    if (zD4) {
                        C(mVar.f164894h);
                    }
                    P(mVar);
                }
            } else if (n0Var instanceof tj.g.o) {
                tj.g.o oVar = (tj.g.o) n0Var;
                Canvas canvas2 = this.f164961a;
                tj.g.p pVar8 = oVar.f164911r;
                if (pVar8 != null && !pVar8.g() && (pVar = oVar.f164912s) != null && !pVar.g() && (str = oVar.f164908o) != null) {
                    tj.e eVar2 = oVar.f164916n;
                    if (eVar2 == null) {
                        eVar2 = tj.e.f164742d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception unused) {
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        tj.g.b bVar4 = new tj.g.b(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        R(this.f164964d, oVar);
                        if (k() && T()) {
                            Matrix matrix4 = oVar.f164913t;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            tj.g.p pVar9 = oVar.f164909p;
                            float fD2 = pVar9 != null ? pVar9.d(this) : 0.0f;
                            tj.g.p pVar10 = oVar.f164910q;
                            this.f164964d.f165002f = new tj.g.b(fD2, pVar10 != null ? pVar10.e(this) : 0.0f, oVar.f164911r.d(this), oVar.f164912s.d(this));
                            if (!this.f164964d.f164997a.f164821x.booleanValue()) {
                                tj.g.b bVar5 = this.f164964d.f165002f;
                                K(bVar5.f164769a, bVar5.f164770b, bVar5.f164771c, bVar5.f164772d);
                            }
                            oVar.f164894h = this.f164964d.f165002f;
                            P(oVar);
                            f(oVar, oVar.f164894h);
                            boolean zD5 = D();
                            S();
                            canvas2.save();
                            canvas2.concat(e(this.f164964d.f165002f, bVar4, eVar2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(this.f164964d.f164997a.I0 != tj.g.e0.e.optimizeSpeed ? 2 : 0));
                            canvas2.restore();
                            if (zD5) {
                                C(oVar.f164894h);
                            }
                        }
                    }
                }
            } else if (n0Var instanceof tj.g.v) {
                tj.g.v vVar = (tj.g.v) n0Var;
                if (vVar.f164941o != null) {
                    R(this.f164964d, vVar);
                    if (k() && T()) {
                        C3095h c3095h3 = this.f164964d;
                        if (c3095h3.f164999c || c3095h3.f164998b) {
                            Matrix matrix5 = vVar.f164895n;
                            if (matrix5 != null) {
                                this.f164961a.concat(matrix5);
                            }
                            Path path = new d(this, vVar.f164941o).f164985a;
                            if (vVar.f164894h == null) {
                                vVar.f164894h = c(path);
                            }
                            P(vVar);
                            g(vVar);
                            f(vVar, vVar.f164894h);
                            boolean zD6 = D();
                            C3095h c3095h4 = this.f164964d;
                            if (c3095h4.f164998b) {
                                tj.g.e0.a aVar = c3095h4.f164997a.f164801c;
                                path.setFillType((aVar == null || aVar != tj.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                l(vVar, path);
                            }
                            if (this.f164964d.f164999c) {
                                m(path);
                            }
                            I(vVar);
                            if (zD6) {
                                C(vVar.f164894h);
                            }
                        }
                    }
                }
            } else if (n0Var instanceof tj.g.b0) {
                tj.g.b0 b0Var = (tj.g.b0) n0Var;
                tj.g.p pVar11 = b0Var.f164775q;
                if (pVar11 != null && b0Var.f164776r != null && !pVar11.g() && !b0Var.f164776r.g()) {
                    R(this.f164964d, b0Var);
                    if (k() && T()) {
                        Matrix matrix6 = b0Var.f164895n;
                        if (matrix6 != null) {
                            this.f164961a.concat(matrix6);
                        }
                        Path pathZ = z(b0Var);
                        P(b0Var);
                        g(b0Var);
                        f(b0Var, b0Var.f164894h);
                        boolean zD7 = D();
                        if (this.f164964d.f164998b) {
                            l(b0Var, pathZ);
                        }
                        if (this.f164964d.f164999c) {
                            m(pathZ);
                        }
                        if (zD7) {
                            C(b0Var.f164894h);
                        }
                    }
                }
            } else if (n0Var instanceof tj.g.d) {
                tj.g.d dVar = (tj.g.d) n0Var;
                tj.g.p pVar12 = dVar.f164786q;
                if (pVar12 != null && !pVar12.g()) {
                    R(this.f164964d, dVar);
                    if (k() && T()) {
                        Matrix matrix7 = dVar.f164895n;
                        if (matrix7 != null) {
                            this.f164961a.concat(matrix7);
                        }
                        Path pathW = w(dVar);
                        P(dVar);
                        g(dVar);
                        f(dVar, dVar.f164894h);
                        boolean zD8 = D();
                        if (this.f164964d.f164998b) {
                            l(dVar, pathW);
                        }
                        if (this.f164964d.f164999c) {
                            m(pathW);
                        }
                        if (zD8) {
                            C(dVar.f164894h);
                        }
                    }
                }
            } else if (n0Var instanceof tj.g.i) {
                tj.g.i iVar = (tj.g.i) n0Var;
                tj.g.p pVar13 = iVar.f164879q;
                if (pVar13 != null && iVar.f164880r != null && !pVar13.g() && !iVar.f164880r.g()) {
                    R(this.f164964d, iVar);
                    if (k() && T()) {
                        Matrix matrix8 = iVar.f164895n;
                        if (matrix8 != null) {
                            this.f164961a.concat(matrix8);
                        }
                        Path pathX = x(iVar);
                        P(iVar);
                        g(iVar);
                        f(iVar, iVar.f164894h);
                        boolean zD9 = D();
                        if (this.f164964d.f164998b) {
                            l(iVar, pathX);
                        }
                        if (this.f164964d.f164999c) {
                            m(pathX);
                        }
                        if (zD9) {
                            C(iVar.f164894h);
                        }
                    }
                }
            } else if (n0Var instanceof tj.g.q) {
                tj.g.q qVar = (tj.g.q) n0Var;
                R(this.f164964d, qVar);
                if (k() && T() && this.f164964d.f164999c) {
                    Matrix matrix9 = qVar.f164895n;
                    if (matrix9 != null) {
                        this.f164961a.concat(matrix9);
                    }
                    tj.g.p pVar14 = qVar.f164917o;
                    float fD3 = pVar14 == null ? 0.0f : pVar14.d(this);
                    tj.g.p pVar15 = qVar.f164918p;
                    float fE2 = pVar15 == null ? 0.0f : pVar15.e(this);
                    tj.g.p pVar16 = qVar.f164919q;
                    float fD4 = pVar16 == null ? 0.0f : pVar16.d(this);
                    tj.g.p pVar17 = qVar.f164920r;
                    fE = pVar17 != null ? pVar17.e(this) : 0.0f;
                    if (qVar.f164894h == null) {
                        qVar.f164894h = new tj.g.b(Math.min(fD3, fD4), Math.min(fE2, fE), Math.abs(fD4 - fD3), Math.abs(fE - fE2));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD3, fE2);
                    path2.lineTo(fD4, fE);
                    P(qVar);
                    g(qVar);
                    f(qVar, qVar.f164894h);
                    boolean zD10 = D();
                    m(path2);
                    I(qVar);
                    if (zD10) {
                        C(qVar.f164894h);
                    }
                }
            } else if (n0Var instanceof tj.g.a0) {
                tj.g.a0 a0Var = (tj.g.a0) n0Var;
                R(this.f164964d, a0Var);
                if (k() && T()) {
                    C3095h c3095h5 = this.f164964d;
                    if (c3095h5.f164999c || c3095h5.f164998b) {
                        Matrix matrix10 = a0Var.f164895n;
                        if (matrix10 != null) {
                            this.f164961a.concat(matrix10);
                        }
                        if (a0Var.f164956o.length >= 2) {
                            Path pathY = y(a0Var);
                            P(a0Var);
                            g(a0Var);
                            f(a0Var, a0Var.f164894h);
                            boolean zD11 = D();
                            if (this.f164964d.f164998b) {
                                l(a0Var, pathY);
                            }
                            if (this.f164964d.f164999c) {
                                m(pathY);
                            }
                            I(a0Var);
                            if (zD11) {
                                C(a0Var.f164894h);
                            }
                        }
                    }
                }
            } else if (n0Var instanceof tj.g.z) {
                tj.g.z zVar = (tj.g.z) n0Var;
                R(this.f164964d, zVar);
                if (k() && T()) {
                    C3095h c3095h6 = this.f164964d;
                    if (c3095h6.f164999c || c3095h6.f164998b) {
                        Matrix matrix11 = zVar.f164895n;
                        if (matrix11 != null) {
                            this.f164961a.concat(matrix11);
                        }
                        if (zVar.f164956o.length >= 2) {
                            Path pathY2 = y(zVar);
                            P(zVar);
                            tj.g.e0.a aVar2 = this.f164964d.f164997a.f164801c;
                            pathY2.setFillType((aVar2 == null || aVar2 != tj.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            g(zVar);
                            f(zVar, zVar.f164894h);
                            boolean zD12 = D();
                            if (this.f164964d.f164998b) {
                                l(zVar, pathY2);
                            }
                            if (this.f164964d.f164999c) {
                                m(pathY2);
                            }
                            I(zVar);
                            if (zD12) {
                                C(zVar.f164894h);
                            }
                        }
                    }
                }
            } else if (n0Var instanceof tj.g.w0) {
                tj.g.w0 w0Var = (tj.g.w0) n0Var;
                R(this.f164964d, w0Var);
                if (k()) {
                    Matrix matrix12 = w0Var.f164947r;
                    if (matrix12 != null) {
                        this.f164961a.concat(matrix12);
                    }
                    ArrayList arrayList = w0Var.f164765n;
                    float fD5 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((tj.g.p) w0Var.f164765n.get(0)).d(this);
                    ArrayList arrayList2 = w0Var.f164766o;
                    float fE3 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((tj.g.p) w0Var.f164766o.get(0)).e(this);
                    ArrayList arrayList3 = w0Var.f164767p;
                    float fD6 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((tj.g.p) w0Var.f164767p.get(0)).d(this);
                    ArrayList arrayList4 = w0Var.f164768q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((tj.g.p) w0Var.f164768q.get(0)).e(this);
                    }
                    tj.g.e0.f fVarU = u();
                    if (fVarU != tj.g.e0.f.Start) {
                        float fD7 = d(w0Var);
                        if (fVarU == tj.g.e0.f.Middle) {
                            fD7 /= 2.0f;
                        }
                        fD5 -= fD7;
                    }
                    if (w0Var.f164894h == null) {
                        i iVar2 = new i(fD5, fE3);
                        n(w0Var, iVar2);
                        RectF rectF = iVar2.f165007c;
                        w0Var.f164894h = new tj.g.b(rectF.left, rectF.top, rectF.width(), iVar2.f165007c.height());
                    }
                    P(w0Var);
                    g(w0Var);
                    f(w0Var, w0Var.f164894h);
                    boolean zD13 = D();
                    n(w0Var, new f(fD5 + fD6, fE3 + fE));
                    if (zD13) {
                        C(w0Var.f164894h);
                    }
                }
            }
        }
        M();
    }

    public final void G(tj.g.h0 h0Var, boolean z14) {
        if (z14) {
            this.f164966f.push(h0Var);
            this.f164967g.push(this.f164961a.getMatrix());
        }
        Iterator<tj.g.n0> it = h0Var.f164872i.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        if (z14) {
            this.f164966f.pop();
            this.f164967g.pop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
    
        if (r8 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(tj.g.r rVar, c cVar) {
        float fFloatValue;
        float f14;
        float f15;
        float f16;
        N();
        Float f17 = rVar.f164931u;
        float f18 = 0.0f;
        if (f17 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f17.floatValue())) {
            float f19 = cVar.f164982c;
            if (f19 == 0.0f && cVar.f164983d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(cVar.f164983d, f19));
            }
        } else {
            fFloatValue = rVar.f164931u.floatValue();
        }
        float fA = rVar.f164926p ? 1.0f : this.f164964d.f164997a.f164805g.a(this.f164962b);
        this.f164964d = s(rVar);
        Matrix matrix = new Matrix();
        matrix.preTranslate(cVar.f164980a, cVar.f164981b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fA, fA);
        tj.g.p pVar = rVar.f164927q;
        float fD = pVar != null ? pVar.d(this) : 0.0f;
        tj.g.p pVar2 = rVar.f164928r;
        float fE = pVar2 != null ? pVar2.e(this) : 0.0f;
        tj.g.p pVar3 = rVar.f164929s;
        float fD2 = pVar3 != null ? pVar3.d(this) : 3.0f;
        tj.g.p pVar4 = rVar.f164930t;
        float fE2 = pVar4 != null ? pVar4.e(this) : 3.0f;
        tj.g.b bVar = rVar.f164932o;
        Canvas canvas = this.f164961a;
        if (bVar != null) {
            float fMax = fD2 / bVar.f164771c;
            float f22 = fE2 / bVar.f164772d;
            tj.e eVar = rVar.f164916n;
            if (eVar == null) {
                eVar = tj.e.f164742d;
            }
            boolean zEquals = eVar.equals(tj.e.f164741c);
            tj.e.a aVar = eVar.f164743a;
            if (!zEquals) {
                fMax = eVar.f164744b == tj.e.b.slice ? Math.max(fMax, f22) : Math.min(fMax, f22);
                f22 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f22);
            canvas.concat(matrix);
            tj.g.b bVar2 = rVar.f164932o;
            float f24 = bVar2.f164771c * fMax;
            float f25 = bVar2.f164772d * f22;
            int[] iArr = a.f164968a;
            switch (iArr[aVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f14 = (fD2 - f24) / 2.0f;
                    f15 = 0.0f - f14;
                    break;
                case 4:
                case 5:
                case 6:
                    f14 = fD2 - f24;
                    f15 = 0.0f - f14;
                    break;
                default:
                    f15 = 0.0f;
                    break;
            }
            int i14 = iArr[aVar.ordinal()];
            if (i14 == 2) {
                f16 = (fE2 - f25) / 2.0f;
                f18 = 0.0f - f16;
            } else {
                if (i14 != 3) {
                    if (i14 != 5) {
                        if (i14 != 6) {
                            if (i14 != 7) {
                            }
                        }
                    }
                    f16 = (fE2 - f25) / 2.0f;
                    f18 = 0.0f - f16;
                }
                f16 = fE2 - f25;
                f18 = 0.0f - f16;
            }
            if (!this.f164964d.f164997a.f164821x.booleanValue()) {
                K(f15, f18, fD2, fE2);
            }
            matrix.reset();
            matrix.preScale(fMax, f22);
            canvas.concat(matrix);
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!this.f164964d.f164997a.f164821x.booleanValue()) {
                K(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zD = D();
        G(rVar, false);
        if (zD) {
            C(rVar.f164894h);
        }
        M();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    public final void I(tj.g.l lVar) {
        tj.g.r rVar;
        tj.g.r rVar2;
        tj.g.r rVar3;
        float f14;
        float f15;
        float f16;
        ArrayList arrayList;
        int size;
        h hVar = this;
        tj.g.e0 e0Var = hVar.f164964d.f164997a;
        String str = e0Var.f164823z;
        if (str == null && e0Var.A == null && e0Var.B == null) {
            return;
        }
        if (str == null) {
            rVar = null;
        } else {
            tj.g.l0 l0VarC = lVar.f164906a.c(str);
            if (l0VarC != null) {
                rVar = (tj.g.r) l0VarC;
            } else {
                String str2 = hVar.f164964d.f164997a.f164823z;
                rVar = null;
            }
        }
        String str3 = hVar.f164964d.f164997a.A;
        if (str3 == null) {
            rVar2 = null;
        } else {
            tj.g.l0 l0VarC2 = lVar.f164906a.c(str3);
            if (l0VarC2 != null) {
                rVar2 = (tj.g.r) l0VarC2;
            } else {
                String str4 = hVar.f164964d.f164997a.A;
                rVar2 = null;
            }
        }
        String str5 = hVar.f164964d.f164997a.B;
        if (str5 == null) {
            rVar3 = null;
        } else {
            tj.g.l0 l0VarC3 = lVar.f164906a.c(str5);
            if (l0VarC3 != null) {
                rVar3 = (tj.g.r) l0VarC3;
            } else {
                String str6 = hVar.f164964d.f164997a.B;
                rVar3 = null;
            }
        }
        if (lVar instanceof tj.g.v) {
            arrayList = hVar.new b(((tj.g.v) lVar).f164941o).f164971a;
            f14 = 0.0f;
        } else if (lVar instanceof tj.g.q) {
            tj.g.q qVar = (tj.g.q) lVar;
            tj.g.p pVar = qVar.f164917o;
            float fD = pVar != null ? pVar.d(hVar) : 0.0f;
            tj.g.p pVar2 = qVar.f164918p;
            float fE = pVar2 != null ? pVar2.e(hVar) : 0.0f;
            tj.g.p pVar3 = qVar.f164919q;
            float fD2 = pVar3 != null ? pVar3.d(hVar) : 0.0f;
            tj.g.p pVar4 = qVar.f164920r;
            float fE2 = pVar4 != null ? pVar4.e(hVar) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f17 = fD2 - fD;
            float f18 = fE2 - fE;
            f14 = 0.0f;
            arrayList2.add(new c(hVar, fD, fE, f17, f18));
            hVar = this;
            arrayList2.add(new c(hVar, fD2, fE2, f17, f18));
            arrayList = arrayList2;
        } else {
            f14 = 0.0f;
            tj.g.z zVar = (tj.g.z) lVar;
            int length = zVar.f164956o.length;
            if (length < 2) {
                hVar = this;
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = zVar.f164956o;
                c cVar = new c(this, fArr[0], fArr[1], 0.0f, 0.0f);
                int i14 = 2;
                float f19 = 0.0f;
                float f22 = 0.0f;
                while (true) {
                    f15 = cVar.f164981b;
                    f16 = cVar.f164980a;
                    if (i14 >= length) {
                        break;
                    }
                    float[] fArr2 = zVar.f164956o;
                    f19 = fArr2[i14];
                    f22 = fArr2[i14 + 1];
                    cVar.a(f19, f22);
                    arrayList3.add(cVar);
                    cVar = new c(this, f19, f22, f19 - f16, f22 - f15);
                    i14 += 2;
                }
                if (zVar instanceof tj.g.a0) {
                    float[] fArr3 = zVar.f164956o;
                    float f24 = f19;
                    float f25 = fArr3[0];
                    if (f24 != f25) {
                        float f26 = fArr3[1];
                        if (f22 != f26) {
                            cVar.a(f25, f26);
                            arrayList3.add(cVar);
                            float f27 = f25 - f16;
                            float f28 = f26 - f15;
                            hVar = this;
                            c cVar2 = new c(hVar, f25, f26, f27, f28);
                            cVar2.b((c) arrayList3.get(0));
                            arrayList3.add(cVar2);
                            arrayList3.set(0, cVar2);
                        } else {
                            hVar = this;
                        }
                    } else {
                        hVar = this;
                    }
                } else {
                    hVar = this;
                    arrayList3.add(cVar);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        tj.g.e0 e0Var2 = hVar.f164964d.f164997a;
        e0Var2.B = null;
        e0Var2.A = null;
        e0Var2.f164823z = null;
        if (rVar != null) {
            hVar.H(rVar, (c) arrayList.get(0));
        }
        if (rVar2 != null && arrayList.size() > 2) {
            c cVar3 = (c) arrayList.get(0);
            c cVar4 = (c) arrayList.get(1);
            int i15 = 1;
            while (i15 < size - 1) {
                i15++;
                c cVar5 = (c) arrayList.get(i15);
                if (cVar4.f164984e) {
                    float f29 = cVar4.f164982c;
                    float f34 = cVar4.f164983d;
                    float f35 = cVar4.f164980a;
                    float f36 = f35 - cVar3.f164980a;
                    float f37 = cVar4.f164981b;
                    float f38 = ((f37 - cVar3.f164981b) * f34) + (f36 * f29);
                    if (f38 == f14) {
                        f38 = ((cVar5.f164980a - f35) * f29) + ((cVar5.f164981b - f37) * f34);
                    }
                    if (f38 <= f14 && (f38 != f14 || (f29 <= f14 && f34 < f14))) {
                        cVar4.f164982c = -f29;
                        cVar4.f164983d = -f34;
                    }
                }
                hVar.H(rVar2, cVar4);
                cVar3 = cVar4;
                cVar4 = cVar5;
            }
        }
        if (rVar3 != null) {
            hVar.H(rVar3, (c) arrayList.get(size - 1));
        }
    }

    public final void J(tj.g.s sVar, tj.g.b bVar) {
        float fD;
        float fE;
        Boolean bool = sVar.f164933n;
        if (bool == null || !bool.booleanValue()) {
            tj.g.p pVar = sVar.f164935p;
            float fC = pVar != null ? pVar.c(this, 1.0f) : 1.2f;
            tj.g.p pVar2 = sVar.f164936q;
            float fC2 = pVar2 != null ? pVar2.c(this, 1.0f) : 1.2f;
            fD = fC * bVar.f164771c;
            fE = fC2 * bVar.f164772d;
        } else {
            tj.g.p pVar3 = sVar.f164935p;
            fD = pVar3 != null ? pVar3.d(this) : bVar.f164771c;
            tj.g.p pVar4 = sVar.f164936q;
            fE = pVar4 != null ? pVar4.e(this) : bVar.f164772d;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        N();
        C3095h c3095hS = s(sVar);
        this.f164964d = c3095hS;
        c3095hS.f164997a.f164812m = Float.valueOf(1.0f);
        boolean zD = D();
        Canvas canvas = this.f164961a;
        canvas.save();
        Boolean bool2 = sVar.f164934o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(bVar.f164769a, bVar.f164770b);
            canvas.scale(bVar.f164771c, bVar.f164772d);
        }
        G(sVar, false);
        canvas.restore();
        if (zD) {
            C(bVar);
        }
        M();
    }

    public final void K(float f14, float f15, float f16, float f17) {
        float fD = f16 + f14;
        float fE = f17 + f15;
        tj.g.c cVar = this.f164964d.f164997a.f164822y;
        if (cVar != null) {
            f14 += cVar.f164782d.d(this);
            f15 += this.f164964d.f164997a.f164822y.f164779a.e(this);
            fD -= this.f164964d.f164997a.f164822y.f164780b.d(this);
            fE -= this.f164964d.f164997a.f164822y.f164781c.e(this);
        }
        this.f164961a.clipRect(f14, f15, fD, fE);
    }

    public final void M() {
        this.f164961a.restore();
        this.f164964d = this.f164965e.pop();
    }

    public final void N() {
        this.f164961a.save();
        this.f164965e.push(this.f164964d);
        this.f164964d = new C3095h(this, this.f164964d);
    }

    public final String O(String str, boolean z14, boolean z15) {
        if (this.f164964d.f165004h) {
            return str.replaceAll("[\\n\\t]", StringUtils.SPACE);
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", StringUtils.SPACE);
        if (z14) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z15) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", StringUtils.SPACE);
    }

    public final void P(tj.g.k0 k0Var) {
        if (k0Var.f164907b == null || k0Var.f164894h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f164967g.peek().invert(matrix)) {
            tj.g.b bVar = k0Var.f164894h;
            float f14 = bVar.f164769a;
            float f15 = bVar.f164770b;
            float fA = bVar.a();
            tj.g.b bVar2 = k0Var.f164894h;
            float f16 = bVar2.f164770b;
            float fA2 = bVar2.a();
            float fB = k0Var.f164894h.b();
            tj.g.b bVar3 = k0Var.f164894h;
            float[] fArr = {f14, f15, fA, f16, fA2, fB, bVar3.f164769a, bVar3.b()};
            matrix.preConcat(this.f164961a.getMatrix());
            matrix.mapPoints(fArr);
            float f17 = fArr[0];
            float f18 = fArr[1];
            RectF rectF = new RectF(f17, f18, f17, f18);
            for (int i14 = 2; i14 <= 6; i14 += 2) {
                float f19 = fArr[i14];
                if (f19 < rectF.left) {
                    rectF.left = f19;
                }
                if (f19 > rectF.right) {
                    rectF.right = f19;
                }
                float f22 = fArr[i14 + 1];
                if (f22 < rectF.top) {
                    rectF.top = f22;
                }
                if (f22 > rectF.bottom) {
                    rectF.bottom = f22;
                }
            }
            tj.g.k0 k0Var2 = (tj.g.k0) this.f164966f.peek();
            tj.g.b bVar4 = k0Var2.f164894h;
            float f24 = rectF.left;
            float f25 = rectF.top;
            if (bVar4 == null) {
                k0Var2.f164894h = new tj.g.b(f24, f25, rectF.right - f24, rectF.bottom - f25);
                return;
            }
            tj.g.b bVar5 = new tj.g.b(f24, f25, rectF.right - f24, rectF.bottom - f25);
            float f26 = bVar5.f164769a;
            if (f26 < bVar4.f164769a) {
                bVar4.f164769a = f26;
            }
            float f27 = bVar5.f164770b;
            if (f27 < bVar4.f164770b) {
                bVar4.f164770b = f27;
            }
            if (bVar5.a() > bVar4.a()) {
                bVar4.f164771c = bVar5.a() - bVar4.f164769a;
            }
            if (bVar5.b() > bVar4.b()) {
                bVar4.f164772d = bVar5.b() - bVar4.f164770b;
            }
        }
    }

    public final void Q(C3095h c3095h, tj.g.e0 e0Var) {
        if (v(e0Var, 4096L)) {
            c3095h.f164997a.f164813n = e0Var.f164813n;
        }
        if (v(e0Var, 2048L)) {
            c3095h.f164997a.f164812m = e0Var.f164812m;
        }
        if (v(e0Var, 1L)) {
            c3095h.f164997a.f164800b = e0Var.f164800b;
            tj.g.o0 o0Var = e0Var.f164800b;
            c3095h.f164998b = (o0Var == null || o0Var == tj.g.f.f164865c) ? false : true;
        }
        if (v(e0Var, 4L)) {
            c3095h.f164997a.f164802d = e0Var.f164802d;
        }
        if (v(e0Var, 6149L)) {
            L(c3095h, true, c3095h.f164997a.f164800b);
        }
        if (v(e0Var, 2L)) {
            c3095h.f164997a.f164801c = e0Var.f164801c;
        }
        if (v(e0Var, 8L)) {
            c3095h.f164997a.f164803e = e0Var.f164803e;
            tj.g.o0 o0Var2 = e0Var.f164803e;
            c3095h.f164999c = (o0Var2 == null || o0Var2 == tj.g.f.f164865c) ? false : true;
        }
        if (v(e0Var, 16L)) {
            c3095h.f164997a.f164804f = e0Var.f164804f;
        }
        if (v(e0Var, 6168L)) {
            L(c3095h, false, c3095h.f164997a.f164803e);
        }
        if (v(e0Var, 34359738368L)) {
            c3095h.f164997a.H0 = e0Var.H0;
        }
        if (v(e0Var, 32L)) {
            tj.g.e0 e0Var2 = c3095h.f164997a;
            tj.g.p pVar = e0Var.f164805g;
            e0Var2.f164805g = pVar;
            c3095h.f165001e.setStrokeWidth(pVar.b(this));
        }
        if (v(e0Var, 64L)) {
            tj.g.e0 e0Var3 = c3095h.f164997a;
            Paint paint = c3095h.f165001e;
            e0Var3.f164806h = e0Var.f164806h;
            int i14 = a.f164969b[e0Var.f164806h.ordinal()];
            if (i14 == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i14 == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i14 == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (v(e0Var, 128L)) {
            tj.g.e0 e0Var4 = c3095h.f164997a;
            Paint paint2 = c3095h.f165001e;
            e0Var4.f164807i = e0Var.f164807i;
            int i15 = a.f164970c[e0Var.f164807i.ordinal()];
            if (i15 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i15 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i15 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (v(e0Var, 256L)) {
            c3095h.f164997a.f164808j = e0Var.f164808j;
            c3095h.f165001e.setStrokeMiter(e0Var.f164808j.floatValue());
        }
        if (v(e0Var, 512L)) {
            c3095h.f164997a.f164809k = e0Var.f164809k;
        }
        if (v(e0Var, 1024L)) {
            c3095h.f164997a.f164811l = e0Var.f164811l;
        }
        Typeface typefaceH = null;
        if (v(e0Var, 1536L)) {
            tj.g.e0 e0Var5 = c3095h.f164997a;
            Paint paint3 = c3095h.f165001e;
            tj.g.p[] pVarArr = e0Var5.f164809k;
            if (pVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i16 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i16];
                float f14 = 0.0f;
                for (int i17 = 0; i17 < i16; i17++) {
                    float fB = e0Var5.f164809k[i17 % length].b(this);
                    fArr[i17] = fB;
                    f14 += fB;
                }
                if (f14 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fB2 = e0Var5.f164811l.b(this);
                    if (fB2 < 0.0f) {
                        fB2 = (fB2 % f14) + f14;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fB2));
                }
            }
        }
        if (v(e0Var, 16384L)) {
            float textSize = this.f164964d.f165000d.getTextSize();
            c3095h.f164997a.f164815p = e0Var.f164815p;
            c3095h.f165000d.setTextSize(e0Var.f164815p.c(this, textSize));
            c3095h.f165001e.setTextSize(e0Var.f164815p.c(this, textSize));
        }
        if (v(e0Var, 8192L)) {
            c3095h.f164997a.f164814o = e0Var.f164814o;
        }
        if (v(e0Var, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (e0Var.f164816q.intValue() == -1 && c3095h.f164997a.f164816q.intValue() > 100) {
                tj.g.e0 e0Var6 = c3095h.f164997a;
                e0Var6.f164816q = b71.i.e(100, e0Var6.f164816q);
            } else if (e0Var.f164816q.intValue() != 1 || c3095h.f164997a.f164816q.intValue() >= 900) {
                c3095h.f164997a.f164816q = e0Var.f164816q;
            } else {
                tj.g.e0 e0Var7 = c3095h.f164997a;
                e0Var7.f164816q = wr.g.m(100, e0Var7.f164816q);
            }
        }
        if (v(e0Var, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            c3095h.f164997a.f164817r = e0Var.f164817r;
        }
        if (v(e0Var, 106496L)) {
            tj.g.e0 e0Var8 = c3095h.f164997a;
            ArrayList arrayList = e0Var8.f164814o;
            if (arrayList != null && this.f164963c != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceH = h((String) it.next(), e0Var8.f164816q, e0Var8.f164817r)) == null) {
                }
            }
            if (typefaceH == null) {
                typefaceH = h(C.SERIF_NAME, e0Var8.f164816q, e0Var8.f164817r);
            }
            c3095h.f165000d.setTypeface(typefaceH);
            c3095h.f165001e.setTypeface(typefaceH);
        }
        if (v(e0Var, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            tj.g.e0 e0Var9 = c3095h.f164997a;
            Paint paint4 = c3095h.f165001e;
            Paint paint5 = c3095h.f165000d;
            e0Var9.f164818t = e0Var.f164818t;
            tj.g.e0.EnumC3093g enumC3093g = e0Var.f164818t;
            tj.g.e0.EnumC3093g enumC3093g2 = tj.g.e0.EnumC3093g.LineThrough;
            paint5.setStrikeThruText(enumC3093g == enumC3093g2);
            tj.g.e0.EnumC3093g enumC3093g3 = e0Var.f164818t;
            tj.g.e0.EnumC3093g enumC3093g4 = tj.g.e0.EnumC3093g.Underline;
            paint5.setUnderlineText(enumC3093g3 == enumC3093g4);
            paint4.setStrikeThruText(e0Var.f164818t == enumC3093g2);
            paint4.setUnderlineText(e0Var.f164818t == enumC3093g4);
        }
        if (v(e0Var, 68719476736L)) {
            c3095h.f164997a.f164819v = e0Var.f164819v;
        }
        if (v(e0Var, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            c3095h.f164997a.f164820w = e0Var.f164820w;
        }
        if (v(e0Var, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            c3095h.f164997a.f164821x = e0Var.f164821x;
        }
        if (v(e0Var, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            c3095h.f164997a.f164823z = e0Var.f164823z;
        }
        if (v(e0Var, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            c3095h.f164997a.A = e0Var.A;
        }
        if (v(e0Var, 8388608L)) {
            c3095h.f164997a.B = e0Var.B;
        }
        if (v(e0Var, 16777216L)) {
            c3095h.f164997a.C = e0Var.C;
        }
        if (v(e0Var, 33554432L)) {
            c3095h.f164997a.D = e0Var.D;
        }
        if (v(e0Var, 1048576L)) {
            c3095h.f164997a.f164822y = e0Var.f164822y;
        }
        if (v(e0Var, 268435456L)) {
            c3095h.f164997a.I = e0Var.I;
        }
        if (v(e0Var, 536870912L)) {
            c3095h.f164997a.P = e0Var.P;
        }
        if (v(e0Var, 1073741824L)) {
            c3095h.f164997a.T = e0Var.T;
        }
        if (v(e0Var, 67108864L)) {
            c3095h.f164997a.E = e0Var.E;
        }
        if (v(e0Var, 134217728L)) {
            c3095h.f164997a.F = e0Var.F;
        }
        if (v(e0Var, 8589934592L)) {
            c3095h.f164997a.Z = e0Var.Z;
        }
        if (v(e0Var, 17179869184L)) {
            c3095h.f164997a.f164810k0 = e0Var.f164810k0;
        }
        if (v(e0Var, 137438953472L)) {
            c3095h.f164997a.I0 = e0Var.I0;
        }
    }

    public final void R(C3095h c3095h, tj.g.l0 l0Var) {
        boolean z14 = l0Var.f164907b == null;
        tj.g.e0 e0Var = c3095h.f164997a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        e0Var.C = bool;
        if (!z14) {
            bool = Boolean.FALSE;
        }
        e0Var.f164821x = bool;
        e0Var.f164822y = null;
        e0Var.I = null;
        e0Var.f164812m = fValueOf;
        e0Var.E = tj.g.f.f164864b;
        e0Var.F = fValueOf;
        e0Var.T = null;
        e0Var.X = null;
        e0Var.Y = fValueOf;
        e0Var.Z = null;
        e0Var.f164810k0 = fValueOf;
        e0Var.H0 = tj.g.e0.i.None;
        tj.g.e0 e0Var2 = l0Var.f164898e;
        if (e0Var2 != null) {
            Q(c3095h, e0Var2);
        }
        ArrayList arrayList = this.f164963c.f164762b.f164726a;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (tj.b.p pVar : this.f164963c.f164762b.f164726a) {
                if (tj.b.g(pVar.f164723a, l0Var)) {
                    Q(c3095h, pVar.f164724b);
                }
            }
        }
        tj.g.e0 e0Var3 = l0Var.f164899f;
        if (e0Var3 != null) {
            Q(c3095h, e0Var3);
        }
    }

    public final void S() {
        int i14;
        tj.g.e0 e0Var = this.f164964d.f164997a;
        tj.g.o0 o0Var = e0Var.Z;
        if (o0Var instanceof tj.g.f) {
            i14 = ((tj.g.f) o0Var).f164866a;
        } else if (!(o0Var instanceof tj.g.C3094g)) {
            return;
        } else {
            i14 = e0Var.f164813n.f164866a;
        }
        Float f14 = e0Var.f164810k0;
        if (f14 != null) {
            i14 = i(f14.floatValue(), i14);
        }
        this.f164961a.drawColor(i14);
    }

    public final boolean T() {
        Boolean bool = this.f164964d.f164997a.D;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @TargetApi(19)
    public final Path b(tj.g.k0 k0Var, tj.g.b bVar) {
        Path pathB;
        tj.g.l0 l0VarC = k0Var.f164906a.c(this.f164964d.f164997a.I);
        if (l0VarC == null) {
            String str = this.f164964d.f164997a.I;
            return null;
        }
        tj.g.e eVar = (tj.g.e) l0VarC;
        this.f164965e.push(this.f164964d);
        this.f164964d = s(eVar);
        Boolean bool = eVar.f164798o;
        boolean z14 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z14) {
            matrix.preTranslate(bVar.f164769a, bVar.f164770b);
            matrix.preScale(bVar.f164771c, bVar.f164772d);
        }
        Matrix matrix2 = eVar.f164901n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (tj.g.n0 n0Var : eVar.f164872i) {
            if ((n0Var instanceof tj.g.k0) && (pathB = B((tj.g.k0) n0Var)) != null) {
                path.op(pathB, Path.Op.UNION);
            }
        }
        if (this.f164964d.f164997a.I != null) {
            if (eVar.f164894h == null) {
                eVar.f164894h = c(path);
            }
            Path pathB2 = b(eVar, eVar.f164894h);
            if (pathB2 != null) {
                path.op(pathB2, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f164964d = this.f164965e.pop();
        return path;
    }

    public final float d(tj.g.y0 y0Var) {
        k kVar = new k(this, null);
        n(y0Var, kVar);
        return kVar.f165009a;
    }

    public final void f(tj.g.k0 k0Var, tj.g.b bVar) {
        Path pathB;
        if (this.f164964d.f164997a.I == null || (pathB = b(k0Var, bVar)) == null) {
            return;
        }
        this.f164961a.clipPath(pathB);
    }

    public final void g(tj.g.k0 k0Var) {
        tj.g.o0 o0Var = this.f164964d.f164997a.f164800b;
        if (o0Var instanceof tj.g.u) {
            j(true, k0Var.f164894h, (tj.g.u) o0Var);
        }
        tj.g.o0 o0Var2 = this.f164964d.f164997a.f164803e;
        if (o0Var2 instanceof tj.g.u) {
            j(false, k0Var.f164894h, (tj.g.u) o0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z14, tj.g.b bVar, tj.g.u uVar) {
        float fC;
        float fC2;
        float f14;
        float fC3;
        float fC4;
        float f15;
        float fC5;
        float f16;
        tj.g.l0 l0VarC = this.f164963c.c(uVar.f164937a);
        int i14 = 0;
        int i15 = 0;
        if (l0VarC == null) {
            tj.g.o0 o0Var = uVar.f164938b;
            C3095h c3095h = this.f164964d;
            if (o0Var != null) {
                L(c3095h, z14, o0Var);
                return;
            } else if (z14) {
                c3095h.f164998b = false;
                return;
            } else {
                c3095h.f164999c = false;
                return;
            }
        }
        float f17 = -1.0f;
        if (l0VarC instanceof tj.g.m0) {
            tj.g.m0 m0Var = (tj.g.m0) l0VarC;
            String str = m0Var.f164890l;
            if (str != null) {
                p(m0Var, str);
            }
            Boolean bool = m0Var.f164887i;
            Object[] objArr = bool != null && bool.booleanValue();
            C3095h c3095h2 = this.f164964d;
            Paint paint = z14 ? c3095h2.f165000d : c3095h2.f165001e;
            if (objArr == true) {
                tj.g.b bVar2 = c3095h2.f165003g;
                if (bVar2 == null) {
                    bVar2 = c3095h2.f165002f;
                }
                tj.g.p pVar = m0Var.f164902m;
                fC3 = pVar != null ? pVar.d(this) : 0.0f;
                tj.g.p pVar2 = m0Var.f164903n;
                fC4 = pVar2 != null ? pVar2.e(this) : 0.0f;
                tj.g.p pVar3 = m0Var.f164904o;
                float fD = pVar3 != null ? pVar3.d(this) : bVar2.f164771c;
                tj.g.p pVar4 = m0Var.f164905p;
                f16 = fD;
                fC5 = pVar4 != null ? pVar4.e(this) : 0.0f;
                f15 = 256.0f;
            } else {
                tj.g.p pVar5 = m0Var.f164902m;
                fC3 = pVar5 != null ? pVar5.c(this, 1.0f) : 0.0f;
                tj.g.p pVar6 = m0Var.f164903n;
                fC4 = pVar6 != null ? pVar6.c(this, 1.0f) : 0.0f;
                tj.g.p pVar7 = m0Var.f164904o;
                float fC6 = pVar7 != null ? pVar7.c(this, 1.0f) : 1.0f;
                f15 = 256.0f;
                tj.g.p pVar8 = m0Var.f164905p;
                fC5 = pVar8 != null ? pVar8.c(this, 1.0f) : 0.0f;
                f16 = fC6;
            }
            float f18 = fC3;
            float f19 = fC4;
            N();
            this.f164964d = s(m0Var);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(bVar.f164769a, bVar.f164770b);
                matrix.preScale(bVar.f164771c, bVar.f164772d);
            }
            Matrix matrix2 = m0Var.f164888j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = m0Var.f164886h.size();
            if (size == 0) {
                M();
                C3095h c3095h3 = this.f164964d;
                if (z14) {
                    c3095h3.f164998b = false;
                    return;
                } else {
                    c3095h3.f164999c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator<tj.g.n0> it = m0Var.f164886h.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                tj.g.d0 d0Var = (tj.g.d0) it.next();
                Float f22 = d0Var.f164787h;
                float fFloatValue = f22 != null ? f22.floatValue() : 0.0f;
                if (i16 == 0 || fFloatValue >= f17) {
                    fArr[i16] = fFloatValue;
                    f17 = fFloatValue;
                } else {
                    fArr[i16] = f17;
                }
                N();
                R(this.f164964d, d0Var);
                tj.g.e0 e0Var = this.f164964d.f164997a;
                tj.g.f fVar = (tj.g.f) e0Var.E;
                if (fVar == null) {
                    fVar = tj.g.f.f164864b;
                }
                iArr[i16] = i(e0Var.F.floatValue(), fVar.f164866a);
                i16++;
                M();
            }
            if ((f18 == f16 && f19 == fC5) || size == 1) {
                M();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            tj.g.k kVar = m0Var.f164889k;
            if (kVar != null) {
                if (kVar == tj.g.k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (kVar == tj.g.k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            M();
            LinearGradient linearGradient = new LinearGradient(f18, f19, f16, fC5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (this.f164964d.f164997a.f164802d.floatValue() * f15);
            if (iFloatValue >= 0) {
                i14 = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i14);
            return;
        }
        if (!(l0VarC instanceof tj.g.q0)) {
            if (l0VarC instanceof tj.g.c0) {
                tj.g.c0 c0Var = (tj.g.c0) l0VarC;
                tj.g.e0 e0Var2 = c0Var.f164898e;
                if (z14) {
                    if (v(e0Var2, 2147483648L)) {
                        C3095h c3095h4 = this.f164964d;
                        tj.g.e0 e0Var3 = c3095h4.f164997a;
                        tj.g.o0 o0Var2 = c0Var.f164898e.X;
                        e0Var3.f164800b = o0Var2;
                        c3095h4.f164998b = o0Var2 != null;
                    }
                    if (v(c0Var.f164898e, 4294967296L)) {
                        this.f164964d.f164997a.f164802d = c0Var.f164898e.Y;
                    }
                    if (v(c0Var.f164898e, 6442450944L)) {
                        C3095h c3095h5 = this.f164964d;
                        L(c3095h5, z14, c3095h5.f164997a.f164800b);
                        return;
                    }
                    return;
                }
                if (v(e0Var2, 2147483648L)) {
                    C3095h c3095h6 = this.f164964d;
                    tj.g.e0 e0Var4 = c3095h6.f164997a;
                    tj.g.o0 o0Var3 = c0Var.f164898e.X;
                    e0Var4.f164803e = o0Var3;
                    c3095h6.f164999c = o0Var3 != null;
                }
                if (v(c0Var.f164898e, 4294967296L)) {
                    this.f164964d.f164997a.f164804f = c0Var.f164898e.Y;
                }
                if (v(c0Var.f164898e, 6442450944L)) {
                    C3095h c3095h7 = this.f164964d;
                    L(c3095h7, z14, c3095h7.f164997a.f164803e);
                    return;
                }
                return;
            }
            return;
        }
        tj.g.q0 q0Var = (tj.g.q0) l0VarC;
        String str2 = q0Var.f164890l;
        if (str2 != null) {
            p(q0Var, str2);
        }
        Boolean bool2 = q0Var.f164887i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        C3095h c3095h8 = this.f164964d;
        Paint paint2 = z14 ? c3095h8.f165000d : c3095h8.f165001e;
        if (objArr2 == true) {
            tj.g.p pVar9 = new tj.g.p(50.0f, tj.g.d1.percent);
            tj.g.p pVar10 = q0Var.f164921m;
            fC = pVar10 != null ? pVar10.d(this) : pVar9.d(this);
            tj.g.p pVar11 = q0Var.f164922n;
            float fE = pVar11 != null ? pVar11.e(this) : pVar9.e(this);
            tj.g.p pVar12 = q0Var.f164923o;
            fC2 = pVar12 != null ? pVar12.b(this) : pVar9.b(this);
            f14 = fE;
        } else {
            tj.g.p pVar13 = q0Var.f164921m;
            fC = pVar13 != null ? pVar13.c(this, 1.0f) : 0.5f;
            tj.g.p pVar14 = q0Var.f164922n;
            float fC7 = pVar14 != null ? pVar14.c(this, 1.0f) : 0.5f;
            tj.g.p pVar15 = q0Var.f164923o;
            fC2 = pVar15 != null ? pVar15.c(this, 1.0f) : 0.5f;
            f14 = fC7;
        }
        float f24 = fC2;
        float f25 = fC;
        N();
        this.f164964d = s(q0Var);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(bVar.f164769a, bVar.f164770b);
            matrix3.preScale(bVar.f164771c, bVar.f164772d);
        }
        Matrix matrix4 = q0Var.f164888j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = q0Var.f164886h.size();
        if (size2 == 0) {
            M();
            C3095h c3095h9 = this.f164964d;
            if (z14) {
                c3095h9.f164998b = false;
                return;
            } else {
                c3095h9.f164999c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator<tj.g.n0> it3 = q0Var.f164886h.iterator();
        int i17 = 0;
        while (it3.hasNext()) {
            tj.g.d0 d0Var2 = (tj.g.d0) it3.next();
            Float f26 = d0Var2.f164787h;
            float fFloatValue2 = f26 != null ? f26.floatValue() : 0.0f;
            if (i17 == 0 || fFloatValue2 >= f17) {
                fArr2[i17] = fFloatValue2;
                f17 = fFloatValue2;
            } else {
                fArr2[i17] = f17;
            }
            N();
            R(this.f164964d, d0Var2);
            tj.g.e0 e0Var5 = this.f164964d.f164997a;
            tj.g.f fVar2 = (tj.g.f) e0Var5.E;
            if (fVar2 == null) {
                fVar2 = tj.g.f.f164864b;
            }
            iArr2[i17] = i(e0Var5.F.floatValue(), fVar2.f164866a);
            i17++;
            M();
        }
        if (f24 == 0.0f || size2 == 1) {
            M();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        tj.g.k kVar2 = q0Var.f164889k;
        if (kVar2 != null) {
            if (kVar2 == tj.g.k.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (kVar2 == tj.g.k.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        M();
        RadialGradient radialGradient = new RadialGradient(f25, f14, f24, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (this.f164964d.f164997a.f164802d.floatValue() * 256.0f);
        if (iFloatValue2 >= 0) {
            i15 = iFloatValue2 > 255 ? 255 : iFloatValue2;
        }
        paint2.setAlpha(i15);
    }

    public final boolean k() {
        Boolean bool = this.f164964d.f164997a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    public final void l(tj.g.k0 k0Var, Path path) {
        float fE;
        float fD;
        float fE2;
        float fD2;
        boolean z14;
        boolean z15;
        tj.g.o0 o0Var = this.f164964d.f164997a.f164800b;
        boolean z16 = o0Var instanceof tj.g.u;
        Canvas canvas = this.f164961a;
        if (z16) {
            tj.g.l0 l0VarC = this.f164963c.c(((tj.g.u) o0Var).f164937a);
            if (l0VarC instanceof tj.g.y) {
                tj.g.y yVar = (tj.g.y) l0VarC;
                Boolean bool = yVar.f164948p;
                boolean z17 = bool != null && bool.booleanValue();
                String str = yVar.f164955w;
                if (str != null) {
                    r(yVar, str);
                }
                tj.g.p pVar = yVar.f164951s;
                if (z17) {
                    fD = pVar != null ? pVar.d(this) : 0.0f;
                    tj.g.p pVar2 = yVar.f164952t;
                    fE2 = pVar2 != null ? pVar2.e(this) : 0.0f;
                    tj.g.p pVar3 = yVar.f164953u;
                    fD2 = pVar3 != null ? pVar3.d(this) : 0.0f;
                    tj.g.p pVar4 = yVar.f164954v;
                    fE = pVar4 != null ? pVar4.e(this) : 0.0f;
                } else {
                    float fC = pVar != null ? pVar.c(this, 1.0f) : 0.0f;
                    tj.g.p pVar5 = yVar.f164952t;
                    float fC2 = pVar5 != null ? pVar5.c(this, 1.0f) : 0.0f;
                    tj.g.p pVar6 = yVar.f164953u;
                    float fC3 = pVar6 != null ? pVar6.c(this, 1.0f) : 0.0f;
                    tj.g.p pVar7 = yVar.f164954v;
                    float fC4 = pVar7 != null ? pVar7.c(this, 1.0f) : 0.0f;
                    tj.g.b bVar = k0Var.f164894h;
                    float f14 = bVar.f164769a;
                    float f15 = bVar.f164771c;
                    float f16 = (fC * f15) + f14;
                    float f17 = bVar.f164770b;
                    float f18 = bVar.f164772d;
                    float f19 = fC3 * f15;
                    fE = fC4 * f18;
                    fD = f16;
                    fE2 = (fC2 * f18) + f17;
                    fD2 = f19;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                tj.e eVar = yVar.f164916n;
                if (eVar == null) {
                    eVar = tj.e.f164742d;
                }
                N();
                canvas.clipPath(path);
                C3095h c3095h = new C3095h(this);
                Q(c3095h, tj.g.e0.a());
                c3095h.f164997a.f164821x = Boolean.FALSE;
                t(yVar, c3095h);
                this.f164964d = c3095h;
                tj.g.b bVar2 = k0Var.f164894h;
                Matrix matrix = yVar.f164950r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (yVar.f164950r.invert(matrix2)) {
                        tj.g.b bVar3 = k0Var.f164894h;
                        float f22 = bVar3.f164769a;
                        float f24 = bVar3.f164770b;
                        float fA = bVar3.a();
                        z14 = true;
                        tj.g.b bVar4 = k0Var.f164894h;
                        z15 = false;
                        float f25 = bVar4.f164770b;
                        float fA2 = bVar4.a();
                        float fB = k0Var.f164894h.b();
                        tj.g.b bVar5 = k0Var.f164894h;
                        float[] fArr = {f22, f24, fA, f25, fA2, fB, bVar5.f164769a, bVar5.b()};
                        matrix2.mapPoints(fArr);
                        float f26 = fArr[0];
                        float f27 = fArr[1];
                        RectF rectF = new RectF(f26, f27, f26, f27);
                        for (int i14 = 2; i14 <= 6; i14 += 2) {
                            float f28 = fArr[i14];
                            if (f28 < rectF.left) {
                                rectF.left = f28;
                            }
                            if (f28 > rectF.right) {
                                rectF.right = f28;
                            }
                            float f29 = fArr[i14 + 1];
                            if (f29 < rectF.top) {
                                rectF.top = f29;
                            }
                            if (f29 > rectF.bottom) {
                                rectF.bottom = f29;
                            }
                        }
                        float f34 = rectF.left;
                        float f35 = rectF.top;
                        bVar2 = new tj.g.b(f34, f35, rectF.right - f34, rectF.bottom - f35);
                    } else {
                        z14 = true;
                        z15 = false;
                    }
                } else {
                    z14 = true;
                    z15 = false;
                }
                float fFloor = (((float) Math.floor((bVar2.f164769a - fD) / fD2)) * fD2) + fD;
                float fA3 = bVar2.a();
                float fB2 = bVar2.b();
                tj.g.b bVar6 = new tj.g.b(0.0f, 0.0f, fD2, fE);
                boolean zD = D();
                for (float fFloor2 = (((float) Math.floor((bVar2.f164770b - fE2) / fE)) * fE) + fE2; fFloor2 < fB2; fFloor2 += fE) {
                    float f36 = fFloor;
                    while (f36 < fA3) {
                        bVar6.f164769a = f36;
                        bVar6.f164770b = fFloor2;
                        N();
                        if (!this.f164964d.f164997a.f164821x.booleanValue()) {
                            K(bVar6.f164769a, bVar6.f164770b, bVar6.f164771c, bVar6.f164772d);
                        }
                        tj.g.b bVar7 = yVar.f164932o;
                        if (bVar7 != null) {
                            canvas.concat(e(bVar6, bVar7, eVar));
                        } else {
                            Boolean bool2 = yVar.f164949q;
                            boolean z18 = (bool2 == null || bool2.booleanValue()) ? z14 : z15;
                            canvas.translate(f36, fFloor2);
                            if (!z18) {
                                tj.g.b bVar8 = k0Var.f164894h;
                                canvas.scale(bVar8.f164771c, bVar8.f164772d);
                            }
                        }
                        Iterator<tj.g.n0> it = yVar.f164872i.iterator();
                        while (it.hasNext()) {
                            F(it.next());
                        }
                        M();
                        f36 += fD2;
                        fB2 = fB2;
                        fFloor = fFloor;
                    }
                }
                if (zD) {
                    C(yVar.f164894h);
                }
                M();
                return;
            }
        }
        canvas.drawPath(path, this.f164964d.f165000d);
    }

    public final void m(Path path) {
        C3095h c3095h = this.f164964d;
        tj.g.e0.i iVar = c3095h.f164997a.H0;
        tj.g.e0.i iVar2 = tj.g.e0.i.NonScalingStroke;
        Canvas canvas = this.f164961a;
        if (iVar != iVar2) {
            canvas.drawPath(path, c3095h.f165001e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.f164964d.f165001e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.f164964d.f165001e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(tj.g.y0 y0Var, j jVar) {
        float f14;
        float fE;
        float fD;
        tj.g.e0.f fVarU;
        tj.g.l0 l0VarC;
        if (k()) {
            Iterator<tj.g.n0> it = y0Var.f164872i.iterator();
            boolean z14 = true;
            while (it.hasNext()) {
                tj.g.n0 next = it.next();
                if (next instanceof tj.g.c1) {
                    jVar.b(O(((tj.g.c1) next).f164783c, z14, !it.hasNext()));
                } else if (jVar.a((tj.g.y0) next)) {
                    float fE2 = 0.0f;
                    if (next instanceof tj.g.z0) {
                        N();
                        tj.g.z0 z0Var = (tj.g.z0) next;
                        R(this.f164964d, z0Var);
                        if (k() && T() && (l0VarC = z0Var.f164906a.c(z0Var.f164957n)) != null) {
                            tj.g.v vVar = (tj.g.v) l0VarC;
                            d dVar = new d(this, vVar.f164941o);
                            Matrix matrix = vVar.f164895n;
                            Path path = dVar.f164985a;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            tj.g.p pVar = z0Var.f164958o;
                            float fC = pVar != null ? pVar.c(this, pathMeasure.getLength()) : 0.0f;
                            tj.g.e0.f fVarU2 = u();
                            if (fVarU2 != tj.g.e0.f.Start) {
                                float fD2 = d(z0Var);
                                if (fVarU2 == tj.g.e0.f.Middle) {
                                    fD2 /= 2.0f;
                                }
                                fC -= fD2;
                            }
                            g((tj.g.k0) z0Var.f164959p);
                            boolean zD = D();
                            n(z0Var, new e(path, fC, 0.0f));
                            if (zD) {
                                C(z0Var.f164894h);
                            }
                        }
                        M();
                    } else if (next instanceof tj.g.v0) {
                        N();
                        tj.g.v0 v0Var = (tj.g.v0) next;
                        R(this.f164964d, v0Var);
                        if (k()) {
                            ArrayList arrayList = v0Var.f164765n;
                            boolean z15 = arrayList != null && arrayList.size() > 0;
                            boolean z16 = jVar instanceof f;
                            if (z16) {
                                float fD3 = !z15 ? ((f) jVar).f164990a : ((tj.g.p) v0Var.f164765n.get(0)).d(this);
                                ArrayList arrayList2 = v0Var.f164766o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((f) jVar).f164991b : ((tj.g.p) v0Var.f164766o.get(0)).e(this);
                                ArrayList arrayList3 = v0Var.f164767p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((tj.g.p) v0Var.f164767p.get(0)).d(this);
                                ArrayList arrayList4 = v0Var.f164768q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((tj.g.p) v0Var.f164768q.get(0)).e(this);
                                }
                                float f15 = fD3;
                                f14 = fE2;
                                fE2 = f15;
                            } else {
                                f14 = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z15 && (fVarU = u()) != tj.g.e0.f.Start) {
                                float fD4 = d(v0Var);
                                if (fVarU == tj.g.e0.f.Middle) {
                                    fD4 /= 2.0f;
                                }
                                fE2 -= fD4;
                            }
                            g((tj.g.k0) v0Var.f164942r);
                            if (z16) {
                                f fVar = (f) jVar;
                                fVar.f164990a = fE2 + fD;
                                fVar.f164991b = fE + f14;
                            }
                            boolean zD2 = D();
                            n(v0Var, jVar);
                            if (zD2) {
                                C(v0Var.f164894h);
                            }
                        }
                        M();
                    } else if (next instanceof tj.g.u0) {
                        N();
                        tj.g.u0 u0Var = (tj.g.u0) next;
                        R(this.f164964d, u0Var);
                        if (k()) {
                            g((tj.g.k0) u0Var.f164940o);
                            tj.g.l0 l0VarC2 = next.f164906a.c(u0Var.f164939n);
                            if (l0VarC2 != null && (l0VarC2 instanceof tj.g.y0)) {
                                StringBuilder sb3 = new StringBuilder();
                                o((tj.g.y0) l0VarC2, sb3);
                                if (sb3.length() > 0) {
                                    jVar.b(sb3.toString());
                                }
                            }
                        }
                        M();
                    }
                }
                z14 = false;
            }
        }
    }

    public final void o(tj.g.y0 y0Var, StringBuilder sb3) {
        Iterator<tj.g.n0> it = y0Var.f164872i.iterator();
        boolean z14 = true;
        while (it.hasNext()) {
            tj.g.n0 next = it.next();
            if (next instanceof tj.g.y0) {
                o((tj.g.y0) next, sb3);
            } else if (next instanceof tj.g.c1) {
                sb3.append(O(((tj.g.c1) next).f164783c, z14, !it.hasNext()));
            }
            z14 = false;
        }
    }

    public final C3095h s(tj.g.l0 l0Var) {
        C3095h c3095h = new C3095h(this);
        Q(c3095h, tj.g.e0.a());
        t(l0Var, c3095h);
        return c3095h;
    }

    public final void t(tj.g.n0 n0Var, C3095h c3095h) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n0Var instanceof tj.g.l0) {
                arrayList.add(0, (tj.g.l0) n0Var);
            }
            Object obj = n0Var.f164907b;
            if (obj == null) {
                break;
            } else {
                n0Var = (tj.g.n0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            R(c3095h, (tj.g.l0) it.next());
        }
        C3095h c3095h2 = this.f164964d;
        c3095h.f165003g = c3095h2.f165003g;
        c3095h.f165002f = c3095h2.f165002f;
    }

    public final tj.g.e0.f u() {
        tj.g.e0.f fVar;
        tj.g.e0 e0Var = this.f164964d.f164997a;
        if (e0Var.f164819v == tj.g.e0.h.LTR || (fVar = e0Var.f164820w) == tj.g.e0.f.Middle) {
            return e0Var.f164820w;
        }
        tj.g.e0.f fVar2 = tj.g.e0.f.Start;
        return fVar == fVar2 ? tj.g.e0.f.End : fVar2;
    }

    public final Path w(tj.g.d dVar) {
        tj.g.p pVar = dVar.f164784o;
        float fD = pVar != null ? pVar.d(this) : 0.0f;
        tj.g.p pVar2 = dVar.f164785p;
        float fE = pVar2 != null ? pVar2.e(this) : 0.0f;
        float fB = dVar.f164786q.b(this);
        float f14 = fD - fB;
        float f15 = fE - fB;
        float f16 = fD + fB;
        float f17 = fE + fB;
        if (dVar.f164894h == null) {
            float f18 = 2.0f * fB;
            dVar.f164894h = new tj.g.b(f14, f15, f18, f18);
        }
        float f19 = fB * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f15);
        float f22 = fD + f19;
        float f24 = fE - f19;
        path.cubicTo(f22, f15, f16, f24, f16, fE);
        float f25 = fE + f19;
        path.cubicTo(f16, f25, f22, f17, fD, f17);
        float f26 = fD - f19;
        path.cubicTo(f26, f17, f14, f25, f14, fE);
        path.cubicTo(f14, f24, f26, f15, fD, f15);
        path.close();
        return path;
    }

    public final Path x(tj.g.i iVar) {
        tj.g.p pVar = iVar.f164877o;
        float fD = pVar != null ? pVar.d(this) : 0.0f;
        tj.g.p pVar2 = iVar.f164878p;
        float fE = pVar2 != null ? pVar2.e(this) : 0.0f;
        float fD2 = iVar.f164879q.d(this);
        float fE2 = iVar.f164880r.e(this);
        float f14 = fD - fD2;
        float f15 = fE - fE2;
        float f16 = fD + fD2;
        float f17 = fE + fE2;
        if (iVar.f164894h == null) {
            iVar.f164894h = new tj.g.b(f14, f15, fD2 * 2.0f, 2.0f * fE2);
        }
        float f18 = fD2 * 0.5522848f;
        float f19 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f15);
        float f22 = fD + f18;
        float f24 = fE - f19;
        path.cubicTo(f22, f15, f16, f24, f16, fE);
        float f25 = fE + f19;
        path.cubicTo(f16, f25, f22, f17, fD, f17);
        float f26 = fD - f18;
        path.cubicTo(f26, f17, f14, f25, f14, fE);
        path.cubicTo(f14, f24, f26, f15, fD, f15);
        path.close();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public final Path z(tj.g.b0 b0Var) {
        float fD;
        float fE;
        float fMin;
        tj.g.p pVar;
        float fD2;
        tj.g.p pVar2;
        float fE2;
        float fD3;
        float fE3;
        float f14;
        float f15;
        Path path;
        tj.g.p pVar3 = b0Var.f164777s;
        if (pVar3 == null && b0Var.f164778t == null) {
            fD = 0.0f;
        } else {
            tj.g.p pVar4 = b0Var.f164778t;
            if (pVar3 != null) {
                if (pVar4 == null) {
                    fD = pVar3.d(this);
                } else {
                    fD = pVar3.d(this);
                    fE = b0Var.f164778t.e(this);
                }
                fMin = Math.min(fD, b0Var.f164775q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, b0Var.f164776r.e(this) / 2.0f);
                pVar = b0Var.f164773o;
                if (pVar != null) {
                    fD2 = pVar.d(this);
                } else {
                    fD2 = 0.0f;
                }
                pVar2 = b0Var.f164774p;
                if (pVar2 != null) {
                    fE2 = pVar2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = b0Var.f164775q.d(this);
                fE3 = b0Var.f164776r.e(this);
                if (b0Var.f164894h == null) {
                    b0Var.f164894h = new tj.g.b(fD2, fE2, fD3, fE3);
                }
                f14 = fD3 + fD2;
                f15 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f14, fE2);
                    path.lineTo(f14, f15);
                    path.lineTo(fD2, f15);
                    path.lineTo(fD2, fE2);
                } else {
                    float f16 = fMin * 0.5522848f;
                    float f17 = 0.5522848f * fMin2;
                    float f18 = fE2 + fMin2;
                    path.moveTo(fD2, f18);
                    float f19 = f18 - f17;
                    float f22 = fD2 + fMin;
                    float f24 = f22 - f16;
                    path.cubicTo(fD2, f19, f24, fE2, f22, fE2);
                    float f25 = f14 - fMin;
                    path.lineTo(f25, fE2);
                    float f26 = f25 + f16;
                    path.cubicTo(f26, fE2, f14, f19, f14, f18);
                    float f27 = f15 - fMin2;
                    path.lineTo(f14, f27);
                    float f28 = f27 + f17;
                    path.cubicTo(f14, f28, f26, f15, f25, f15);
                    path.lineTo(f22, f15);
                    float f29 = fD2;
                    path.cubicTo(f24, f15, f29, f28, fD2, f27);
                    path.lineTo(f29, f18);
                }
                path.close();
                return path;
            }
            fD = pVar4.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, b0Var.f164775q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, b0Var.f164776r.e(this) / 2.0f);
        pVar = b0Var.f164773o;
        if (pVar != null) {
            fD2 = pVar.d(this);
        } else {
            fD2 = 0.0f;
        }
        pVar2 = b0Var.f164774p;
        if (pVar2 != null) {
            fE2 = pVar2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = b0Var.f164775q.d(this);
        fE3 = b0Var.f164776r.e(this);
        if (b0Var.f164894h == null) {
            b0Var.f164894h = new tj.g.b(fD2, fE2, fD3, fE3);
        }
        f14 = fD3 + fD2;
        f15 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f14, fE2);
            path.lineTo(f14, f15);
            path.lineTo(fD2, f15);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f14, fE2);
            path.lineTo(f14, f15);
            path.lineTo(fD2, f15);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    public abstract class j {
        private j(h hVar) {
        }

        public boolean a(tj.g.y0 y0Var) {
            return true;
        }

        public abstract void b(String str);

        public /* synthetic */ j(h hVar, a aVar) {
            this(hVar);
        }
    }

    public class k extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f165009a;

        private k() {
            super(h.this, null);
            this.f165009a = 0.0f;
        }

        @Override // tj.h.j
        public final void b(String str) {
            this.f165009a = h.this.f164964d.f165000d.measureText(str) + this.f165009a;
        }

        public /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: tj.h$h, reason: collision with other inner class name */
    public class C3095h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tj.g.e0 f164997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f164998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f164999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f165000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Paint f165001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public tj.g.b f165002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public tj.g.b f165003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f165004h;

        public C3095h(h hVar, C3095h c3095h) {
            this.f164998b = c3095h.f164998b;
            this.f164999c = c3095h.f164999c;
            this.f165000d = new Paint(c3095h.f165000d);
            this.f165001e = new Paint(c3095h.f165001e);
            tj.g.b bVar = c3095h.f165002f;
            if (bVar != null) {
                this.f165002f = new tj.g.b(bVar);
            }
            tj.g.b bVar2 = c3095h.f165003g;
            if (bVar2 != null) {
                this.f165003g = new tj.g.b(bVar2);
            }
            this.f165004h = c3095h.f165004h;
            try {
                this.f164997a = (tj.g.e0) c3095h.f164997a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f164997a = tj.g.e0.a();
            }
        }

        public C3095h(h hVar) {
            Paint paint = new Paint();
            this.f165000d = paint;
            paint.setFlags(193);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.f165001e = paint2;
            paint2.setFlags(193);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.f164997a = tj.g.e0.a();
        }
    }
}
