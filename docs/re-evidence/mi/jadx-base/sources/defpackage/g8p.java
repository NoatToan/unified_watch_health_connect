package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g8p extends com.airbnb.lottie.model.layer.a {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final Paint G;
    public final Paint H;
    public final Map<vz9, List<kh4>> I;
    public final LongSparseArray<String> J;
    public final List<d> K;
    public final f8p L;
    public final jte M;
    public final lse N;
    public o82<Integer, Integer> O;
    public o82<Integer, Integer> P;
    public o82<Integer, Integer> Q;
    public o82<Integer, Integer> R;
    public o82<Float, Float> S;
    public o82<Float, Float> T;
    public o82<Float, Float> U;
    public o82<Float, Float> V;
    public o82<Float, Float> W;
    public o82<Typeface, Typeface> X;

    public class a extends Paint {
        public a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18734a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f18734a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18734a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18734a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g8p(jte jteVar, Layer layer) {
        eb1 eb1Var;
        eb1 eb1Var2;
        db1 db1Var;
        db1 db1Var2;
        super(jteVar, layer);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        this.G = new a(1);
        this.H = new b(1);
        this.I = new HashMap();
        this.J = new LongSparseArray<>();
        this.K = new ArrayList();
        this.M = jteVar;
        this.N = layer.b();
        f8p f8pVarA = layer.s().a();
        this.L = f8pVarA;
        f8pVarA.a(this);
        i(f8pVarA);
        ob1 ob1VarT = layer.t();
        if (ob1VarT != null && (db1Var2 = ob1VarT.f28948a) != null) {
            o82<Integer, Integer> o82VarA = db1Var2.a();
            this.O = o82VarA;
            o82VarA.a(this);
            i(this.O);
        }
        if (ob1VarT != null && (db1Var = ob1VarT.f28949b) != null) {
            o82<Integer, Integer> o82VarA2 = db1Var.a();
            this.Q = o82VarA2;
            o82VarA2.a(this);
            i(this.Q);
        }
        if (ob1VarT != null && (eb1Var2 = ob1VarT.c) != null) {
            o82<Float, Float> o82VarA3 = eb1Var2.a();
            this.S = o82VarA3;
            o82VarA3.a(this);
            i(this.S);
        }
        if (ob1VarT == null || (eb1Var = ob1VarT.d) == null) {
            return;
        }
        o82<Float, Float> o82VarA4 = eb1Var.a();
        this.U = o82VarA4;
        o82VarA4.a(this);
        i(this.U);
    }

    public final String O(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!c0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.J.containsKey(j)) {
            return this.J.get(j);
        }
        this.D.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.D.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.D.toString();
        this.J.put(j, string);
        return string;
    }

    public final void P(DocumentData documentData, Matrix matrix) {
        o82<Integer, Integer> o82Var = this.P;
        if (o82Var != null) {
            this.G.setColor(o82Var.h().intValue());
        } else {
            o82<Integer, Integer> o82Var2 = this.O;
            if (o82Var2 != null) {
                this.G.setColor(o82Var2.h().intValue());
            } else {
                this.G.setColor(documentData.h);
            }
        }
        o82<Integer, Integer> o82Var3 = this.R;
        if (o82Var3 != null) {
            this.H.setColor(o82Var3.h().intValue());
        } else {
            o82<Integer, Integer> o82Var4 = this.Q;
            if (o82Var4 != null) {
                this.H.setColor(o82Var4.h().intValue());
            } else {
                this.H.setColor(documentData.i);
            }
        }
        int iIntValue = ((this.x.h() == null ? 100 : this.x.h().h().intValue()) * 255) / 100;
        this.G.setAlpha(iIntValue);
        this.H.setAlpha(iIntValue);
        o82<Float, Float> o82Var5 = this.T;
        if (o82Var5 != null) {
            this.H.setStrokeWidth(o82Var5.h().floatValue());
            return;
        }
        o82<Float, Float> o82Var6 = this.S;
        if (o82Var6 != null) {
            this.H.setStrokeWidth(o82Var6.h().floatValue());
        } else {
            this.H.setStrokeWidth(documentData.j * emq.e());
        }
    }

    public final void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void R(vz9 vz9Var, float f, DocumentData documentData, Canvas canvas) {
        List<kh4> listZ = Z(vz9Var);
        for (int i = 0; i < listZ.size(); i++) {
            Path path = listZ.get(i).getPath();
            path.computeBounds(this.E, false);
            this.F.reset();
            this.F.preTranslate(0.0f, (-documentData.g) * emq.e());
            this.F.preScale(f, f);
            path.transform(this.F);
            if (documentData.f5675k) {
                U(path, this.G, canvas);
                U(path, this.H, canvas);
            } else {
                U(path, this.H, canvas);
                U(path, this.G, canvas);
            }
        }
    }

    public final void S(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f5675k) {
            Q(str, this.G, canvas);
            Q(str, this.H, canvas);
        } else {
            Q(str, this.H, canvas);
            Q(str, this.G, canvas);
        }
    }

    public final void T(String str, DocumentData documentData, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strO = O(str, length);
            length += strO.length();
            S(strO, documentData, canvas);
            canvas.translate(this.G.measureText(strO) + f, 0.0f);
        }
    }

    public final void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void V(String str, DocumentData documentData, sz9 sz9Var, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            vz9 vz9Var = this.N.c().get(vz9.c(str.charAt(i), sz9Var.a(), sz9Var.c()));
            if (vz9Var != null) {
                R(vz9Var, f2, documentData, canvas);
                canvas.translate((((float) vz9Var.b()) * f2 * emq.e()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1 A[LOOP:1: B:24:0x00ab->B:26:0x00b1, LOOP_END] */
    public final void W(DocumentData documentData, sz9 sz9Var, Canvas canvas) {
        float fFloatValue;
        float fE;
        List<String> listA0;
        int size;
        int i;
        int i2;
        PointF pointF;
        float f;
        List<d> listE0;
        int i3;
        Typeface typefaceB0 = b0(sz9Var);
        if (typefaceB0 == null) {
            return;
        }
        String str = documentData.f5673a;
        this.M.W();
        this.G.setTypeface(typefaceB0);
        o82<Float, Float> o82Var = this.W;
        float fFloatValue2 = o82Var != null ? o82Var.h().floatValue() : documentData.c;
        this.G.setTextSize(emq.e() * fFloatValue2);
        this.H.setTypeface(this.G.getTypeface());
        this.H.setTextSize(this.G.getTextSize());
        float f2 = documentData.e / 10.0f;
        o82<Float, Float> o82Var2 = this.V;
        if (o82Var2 == null) {
            o82<Float, Float> o82Var3 = this.U;
            if (o82Var3 != null) {
                fFloatValue = o82Var3.h().floatValue();
            }
            fE = ((f2 * emq.e()) * fFloatValue2) / 100.0f;
            listA0 = a0(str);
            size = listA0.size();
            i = -1;
            i2 = 0;
            while (i2 < size) {
                String str2 = listA0.get(i2);
                pointF = documentData.m;
                if (pointF == null) {
                    f = 0.0f;
                } else {
                    f = pointF.x;
                }
                int i4 = i2;
                listE0 = e0(str2, f, sz9Var, 0.0f, fE, false);
                for (i3 = 0; i3 < listE0.size(); i3++) {
                    d dVar = listE0.get(i3);
                    i++;
                    canvas.save();
                    d0(canvas, documentData, i, dVar.f18736b);
                    T(dVar.f18735a, documentData, canvas, fE);
                    canvas.restore();
                }
                i2 = i4 + 1;
            }
        }
        fFloatValue = o82Var2.h().floatValue();
        f2 += fFloatValue;
        fE = ((f2 * emq.e()) * fFloatValue2) / 100.0f;
        listA0 = a0(str);
        size = listA0.size();
        i = -1;
        i2 = 0;
        while (i2 < size) {
            String str3 = listA0.get(i2);
            pointF = documentData.m;
            if (pointF == null) {
                f = 0.0f;
            } else {
                f = pointF.x;
            }
            int i5 = i2;
            listE0 = e0(str3, f, sz9Var, 0.0f, fE, false);
            while (i3 < listE0.size()) {
                d dVar2 = listE0.get(i3);
                i++;
                canvas.save();
                d0(canvas, documentData, i, dVar2.f18736b);
                T(dVar2.f18735a, documentData, canvas, fE);
                canvas.restore();
            }
            i2 = i5 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[LOOP:1: B:22:0x0075->B:24:0x007b, LOOP_END] */
    public final void X(DocumentData documentData, Matrix matrix, sz9 sz9Var, Canvas canvas) {
        float fFloatValue;
        float f;
        int i;
        int i2;
        PointF pointF;
        float f2;
        List<d> listE0;
        int i3;
        o82<Float, Float> o82Var = this.W;
        float fFloatValue2 = (o82Var != null ? o82Var.h().floatValue() : documentData.c) / 100.0f;
        float fG = emq.g(matrix);
        List<String> listA0 = a0(documentData.f5673a);
        int size = listA0.size();
        float f3 = documentData.e / 10.0f;
        o82<Float, Float> o82Var2 = this.V;
        if (o82Var2 == null) {
            o82<Float, Float> o82Var3 = this.U;
            if (o82Var3 != null) {
                fFloatValue = o82Var3.h().floatValue();
            }
            f = f3;
            i = -1;
            i2 = 0;
            while (i2 < size) {
                String str = listA0.get(i2);
                pointF = documentData.m;
                if (pointF == null) {
                    f2 = 0.0f;
                } else {
                    f2 = pointF.x;
                }
                int i4 = i2;
                listE0 = e0(str, f2, sz9Var, fFloatValue2, f, true);
                i3 = 0;
                while (i3 < listE0.size()) {
                    d dVar = listE0.get(i3);
                    int i5 = i + 1;
                    canvas.save();
                    d0(canvas, documentData, i5, dVar.f18736b);
                    V(dVar.f18735a, documentData, sz9Var, canvas, fG, fFloatValue2, f);
                    canvas.restore();
                    i3++;
                    listE0 = listE0;
                    i = i5;
                }
                i2 = i4 + 1;
            }
        }
        fFloatValue = o82Var2.h().floatValue();
        f3 += fFloatValue;
        f = f3;
        i = -1;
        i2 = 0;
        while (i2 < size) {
            String str2 = listA0.get(i2);
            pointF = documentData.m;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
            }
            int i6 = i2;
            listE0 = e0(str2, f2, sz9Var, fFloatValue2, f, true);
            i3 = 0;
            while (i3 < listE0.size()) {
                d dVar2 = listE0.get(i3);
                int i7 = i + 1;
                canvas.save();
                d0(canvas, documentData, i7, dVar2.f18736b);
                V(dVar2.f18735a, documentData, sz9Var, canvas, fG, fFloatValue2, f);
                canvas.restore();
                i3++;
                listE0 = listE0;
                i = i7;
            }
            i2 = i6 + 1;
        }
    }

    public final d Y(int i) {
        for (int size = this.K.size(); size < i; size++) {
            this.K.add(new d(null));
        }
        return this.K.get(i - 1);
    }

    public final List<kh4> Z(vz9 vz9Var) {
        if (this.I.containsKey(vz9Var)) {
            return this.I.get(vz9Var);
        }
        List<y2m> listA = vz9Var.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new kh4(this.M, this, listA.get(i), this.N));
        }
        this.I.put(vz9Var, arrayList);
        return arrayList;
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.N.b().width(), this.N.b().height());
    }

    public final List<String> a0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public final Typeface b0(sz9 sz9Var) {
        Typeface typefaceH;
        o82<Typeface, Typeface> o82Var = this.X;
        if (o82Var != null && (typefaceH = o82Var.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceX = this.M.X(sz9Var);
        return typefaceX != null ? typefaceX : sz9Var.d();
    }

    public final boolean c0(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    public final void d0(Canvas canvas, DocumentData documentData, int i, float f) {
        PointF pointF = documentData.l;
        PointF pointF2 = documentData.m;
        float fE = emq.e();
        float f2 = (i * documentData.f * fE) + (pointF == null ? 0.0f : (documentData.f * fE) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = c.f18734a[documentData.d.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
    }

    public final List<d> e0(String str, float f, sz9 sz9Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                vz9 vz9Var = this.N.c().get(vz9.c(cCharAt, sz9Var.a(), sz9Var.c()));
                if (vz9Var != null) {
                    fMeasureText = ((float) vz9Var.b()) * f2 * emq.e();
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                d dVarY = Y(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    dVarY.c(strTrim, (f4 - f7) - ((strTrim.length() - strSubstring.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarY.c(strTrim2, ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            Y(i).c(str.substring(i2), f4);
        }
        return this.K.subList(0, i);
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        super.h(t, yteVar);
        if (t == ste.f33968a) {
            o82<Integer, Integer> o82Var = this.P;
            if (o82Var != null) {
                G(o82Var);
            }
            if (yteVar == null) {
                this.P = null;
                return;
            }
            inq inqVar = new inq(yteVar);
            this.P = inqVar;
            inqVar.a(this);
            i(this.P);
            return;
        }
        if (t == ste.f33969b) {
            o82<Integer, Integer> o82Var2 = this.R;
            if (o82Var2 != null) {
                G(o82Var2);
            }
            if (yteVar == null) {
                this.R = null;
                return;
            }
            inq inqVar2 = new inq(yteVar);
            this.R = inqVar2;
            inqVar2.a(this);
            i(this.R);
            return;
        }
        if (t == ste.s) {
            o82<Float, Float> o82Var3 = this.T;
            if (o82Var3 != null) {
                G(o82Var3);
            }
            if (yteVar == null) {
                this.T = null;
                return;
            }
            inq inqVar3 = new inq(yteVar);
            this.T = inqVar3;
            inqVar3.a(this);
            i(this.T);
            return;
        }
        if (t == ste.t) {
            o82<Float, Float> o82Var4 = this.V;
            if (o82Var4 != null) {
                G(o82Var4);
            }
            if (yteVar == null) {
                this.V = null;
                return;
            }
            inq inqVar4 = new inq(yteVar);
            this.V = inqVar4;
            inqVar4.a(this);
            i(this.V);
            return;
        }
        if (t == ste.F) {
            o82<Float, Float> o82Var5 = this.W;
            if (o82Var5 != null) {
                G(o82Var5);
            }
            if (yteVar == null) {
                this.W = null;
                return;
            }
            inq inqVar5 = new inq(yteVar);
            this.W = inqVar5;
            inqVar5.a(this);
            i(this.W);
            return;
        }
        if (t != ste.M) {
            if (t == ste.O) {
                this.L.q(yteVar);
                return;
            }
            return;
        }
        o82<Typeface, Typeface> o82Var6 = this.X;
        if (o82Var6 != null) {
            G(o82Var6);
        }
        if (yteVar == null) {
            this.X = null;
            return;
        }
        inq inqVar6 = new inq(yteVar);
        this.X = inqVar6;
        inqVar6.a(this);
        i(this.X);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        DocumentData documentDataH = this.L.h();
        sz9 sz9Var = this.N.g().get(documentDataH.f5674b);
        if (sz9Var == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        P(documentDataH, matrix);
        if (this.M.b1()) {
            X(documentDataH, matrix, sz9Var, canvas);
        } else {
            W(documentDataH, sz9Var, canvas);
        }
        canvas.restore();
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f18736b;

        public d() {
            this.f18735a = "";
            this.f18736b = 0.0f;
        }

        public void c(String str, float f) {
            this.f18735a = str;
            this.f18736b = f;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
