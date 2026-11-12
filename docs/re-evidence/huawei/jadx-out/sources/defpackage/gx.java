package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class gx extends BaseLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseKeyframeAnimation<Integer, Integer> f36169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<fq, List<em>> f36170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseKeyframeAnimation<Integer, Integer> f36171c;
    private final LongSparseArray<String> d;
    private final cx e;
    private final LottieDrawable f;
    private final Matrix g;
    private final RectF h;
    private final StringBuilder i;
    private final Paint j;
    private BaseKeyframeAnimation<Integer, Integer> k;
    private BaseKeyframeAnimation<Integer, Integer> l;
    private final Paint m;
    private BaseKeyframeAnimation<Float, Float> n;
    private BaseKeyframeAnimation<Float, Float> o;
    private BaseKeyframeAnimation<Float, Float> p;
    private final fn q;
    private final List<d> r;
    private BaseKeyframeAnimation<Float, Float> s;
    private BaseKeyframeAnimation<Float, Float> t;
    private BaseKeyframeAnimation<Typeface, Typeface> x;

    public gx(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.i = new StringBuilder(2);
        this.h = new RectF();
        this.g = new Matrix();
        int i = 1;
        this.j = new Paint(i) { // from class: gx.2
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.m = new Paint(i) { // from class: gx.5
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f36170b = new HashMap();
        this.d = new LongSparseArray<>();
        this.r = new ArrayList();
        this.f = lottieDrawable;
        this.e = layer.b();
        fn fnVarCreateAnimation = layer.t().createAnimation();
        this.q = fnVarCreateAnimation;
        fnVarCreateAnimation.addUpdateListener(this);
        addAnimation(fnVarCreateAnimation);
        gg ggVarW = layer.w();
        if (ggVarW != null && ggVarW.f35048a != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = ggVarW.f35048a.createAnimation();
            this.f36171c = baseKeyframeAnimationCreateAnimation;
            baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
            addAnimation(this.f36171c);
        }
        if (ggVarW != null && ggVarW.d != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = ggVarW.d.createAnimation();
            this.l = baseKeyframeAnimationCreateAnimation2;
            baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
            addAnimation(this.l);
        }
        if (ggVarW != null && ggVarW.f35049b != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = ggVarW.f35049b.createAnimation();
            this.n = baseKeyframeAnimationCreateAnimation3;
            baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
            addAnimation(this.n);
        }
        if (ggVarW == null || ggVarW.e == null) {
            return;
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation4 = ggVarW.e.createAnimation();
        this.p = baseKeyframeAnimationCreateAnimation4;
        baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        addAnimation(this.p);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.e.c().width(), this.e.c().height());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        DocumentData value = this.q.getValue();
        fs fsVar = this.e.i().get(value.f1929a);
        if (fsVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        e(value, i);
        if (this.f.ad()) {
            c(value, matrix, fsVar, canvas);
        } else {
            a(value, fsVar, canvas);
        }
        canvas.restore();
    }

    private void e(DocumentData documentData, int i) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f36169a;
        if (baseKeyframeAnimation != null) {
            this.j.setColor(baseKeyframeAnimation.getValue().intValue());
        } else {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f36171c;
            if (baseKeyframeAnimation2 != null) {
                this.j.setColor(baseKeyframeAnimation2.getValue().intValue());
            } else {
                this.j.setColor(documentData.d);
            }
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation3 = this.k;
        if (baseKeyframeAnimation3 != null) {
            this.m.setColor(baseKeyframeAnimation3.getValue().intValue());
        } else {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation4 = this.l;
            if (baseKeyframeAnimation4 != null) {
                this.m.setColor(baseKeyframeAnimation4.getValue().intValue());
            } else {
                this.m.setColor(documentData.f);
            }
        }
        int iIntValue = ((((this.transform.c() == null ? 100 : this.transform.c().getValue().intValue()) * 255) / 100) * i) / 255;
        this.j.setAlpha(iIntValue);
        this.m.setAlpha(iIntValue);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.o;
        if (baseKeyframeAnimation5 != null) {
            this.m.setStrokeWidth(baseKeyframeAnimation5.getValue().floatValue());
            return;
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.n;
        if (baseKeyframeAnimation6 != null) {
            this.m.setStrokeWidth(baseKeyframeAnimation6.getValue().floatValue());
        } else {
            this.m.setStrokeWidth(documentData.m * je.e());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    private void c(DocumentData documentData, Matrix matrix, fs fsVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float f;
        int i;
        int i2;
        float f2;
        List<d> listD;
        int i3;
        d dVar;
        int i4;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.s;
        if (baseKeyframeAnimation != null) {
            fFloatValue = baseKeyframeAnimation.getValue().floatValue();
        } else {
            fFloatValue = documentData.g;
        }
        float f3 = fFloatValue / 100.0f;
        float fB = je.b(matrix);
        List<String> listC = c(documentData.k);
        int size = listC.size();
        float f4 = documentData.o / 10.0f;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.t;
        if (baseKeyframeAnimation2 != null) {
            fFloatValue2 = baseKeyframeAnimation2.getValue().floatValue();
        } else {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.p;
            if (baseKeyframeAnimation3 != null) {
                fFloatValue2 = baseKeyframeAnimation3.getValue().floatValue();
            }
            f = f4;
            i = -1;
            i2 = 0;
            while (i2 < size) {
                String str = listC.get(i2);
                if (documentData.f1931c == null) {
                    f2 = 0.0f;
                } else {
                    f2 = documentData.f1931c.x;
                }
                int i5 = i2;
                listD = d(str, f2, fsVar, f3, f, true);
                i3 = 0;
                while (i3 < listD.size()) {
                    dVar = listD.get(i3);
                    i4 = i + 1;
                    canvas.save();
                    if (e(canvas, documentData, i4, dVar.d)) {
                        c(dVar.f36174b, documentData, fsVar, canvas, fB, f3, f);
                    }
                    canvas.restore();
                    i3++;
                    listD = listD;
                    i = i4;
                }
                i2 = i5 + 1;
            }
        }
        f4 += fFloatValue2;
        f = f4;
        i = -1;
        i2 = 0;
        while (i2 < size) {
            String str2 = listC.get(i2);
            if (documentData.f1931c == null) {
                f2 = 0.0f;
            } else {
                f2 = documentData.f1931c.x;
            }
            int i6 = i2;
            listD = d(str2, f2, fsVar, f3, f, true);
            i3 = 0;
            while (i3 < listD.size()) {
                dVar = listD.get(i3);
                i4 = i + 1;
                canvas.save();
                if (e(canvas, documentData, i4, dVar.d)) {
                    c(dVar.f36174b, documentData, fsVar, canvas, fB, f3, f);
                }
                canvas.restore();
                i3++;
                listD = listD;
                i = i4;
            }
            i2 = i6 + 1;
        }
    }

    private void c(String str, DocumentData documentData, fs fsVar, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            fq fqVar = this.e.a().get(fq.b(str.charAt(i), fsVar.e(), fsVar.d()));
            if (fqVar != null) {
                e(fqVar, f2, documentData, canvas);
                canvas.translate((((float) fqVar.d()) * f2 * je.e()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9 A[SYNTHETIC] */
    private void a(DocumentData documentData, fs fsVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fE;
        List<String> listC;
        int size;
        int i;
        int i2;
        float f;
        List<d> listD;
        int i3;
        d dVar;
        Typeface typefaceD = d(fsVar);
        if (typefaceD == null) {
            return;
        }
        String strD = documentData.k;
        ei eiVarX = this.f.x();
        if (eiVarX != null) {
            strD = eiVarX.d(getName(), strD);
        }
        this.j.setTypeface(typefaceD);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.s;
        if (baseKeyframeAnimation != null) {
            fFloatValue = baseKeyframeAnimation.getValue().floatValue();
        } else {
            fFloatValue = documentData.g;
        }
        this.j.setTextSize(je.e() * fFloatValue);
        this.m.setTypeface(this.j.getTypeface());
        this.m.setTextSize(this.j.getTextSize());
        float f2 = documentData.o / 10.0f;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.t;
        if (baseKeyframeAnimation2 != null) {
            fFloatValue2 = baseKeyframeAnimation2.getValue().floatValue();
        } else {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.p;
            if (baseKeyframeAnimation3 != null) {
                fFloatValue2 = baseKeyframeAnimation3.getValue().floatValue();
            }
            fE = ((f2 * je.e()) * fFloatValue) / 100.0f;
            listC = c(strD);
            size = listC.size();
            i = -1;
            i2 = 0;
            while (i2 < size) {
                String str = listC.get(i2);
                if (documentData.f1931c == null) {
                    f = 0.0f;
                } else {
                    f = documentData.f1931c.x;
                }
                int i4 = i2;
                listD = d(str, f, fsVar, 0.0f, fE, false);
                for (i3 = 0; i3 < listD.size(); i3++) {
                    dVar = listD.get(i3);
                    i++;
                    canvas.save();
                    if (e(canvas, documentData, i, dVar.d)) {
                        e(dVar.f36174b, documentData, canvas, fE);
                    }
                    canvas.restore();
                }
                i2 = i4 + 1;
            }
        }
        f2 += fFloatValue2;
        fE = ((f2 * je.e()) * fFloatValue) / 100.0f;
        listC = c(strD);
        size = listC.size();
        i = -1;
        i2 = 0;
        while (i2 < size) {
            String str2 = listC.get(i2);
            if (documentData.f1931c == null) {
                f = 0.0f;
            } else {
                f = documentData.f1931c.x;
            }
            int i5 = i2;
            listD = d(str2, f, fsVar, 0.0f, fE, false);
            while (i3 < listD.size()) {
                dVar = listD.get(i3);
                i++;
                canvas.save();
                if (e(canvas, documentData, i, dVar.d)) {
                    e(dVar.f36174b, documentData, canvas, fE);
                }
                canvas.restore();
            }
            i2 = i5 + 1;
        }
    }

    private boolean e(Canvas canvas, DocumentData documentData, int i, float f) {
        PointF pointF = documentData.f1930b;
        PointF pointF2 = documentData.f1931c;
        float fE = je.e();
        float f2 = (i * documentData.i * fE) + (pointF == null ? 0.0f : (documentData.i * fE) + pointF.y);
        if (this.f.g() && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + documentData.g) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = AnonymousClass1.f36172c[documentData.j.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else if (i2 == 3) {
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
        return true;
    }

    /* JADX INFO: renamed from: gx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f36172c;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f36172c = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36172c[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36172c[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Typeface d(fs fsVar) {
        Typeface value;
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation = this.x;
        if (baseKeyframeAnimation != null && (value = baseKeyframeAnimation.getValue()) != null) {
            return value;
        }
        Typeface typefaceB = this.f.b(fsVar);
        return typefaceB != null ? typefaceB : fsVar.c();
    }

    private List<String> c(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void e(String str, DocumentData documentData, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strE = e(str, length);
            length += strE.length();
            b(strE, documentData, canvas);
            canvas.translate(this.j.measureText(strE) + f, 0.0f);
        }
    }

    private List<d> d(String str, float f, fs fsVar, float f2, float f3, boolean z) {
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
                fq fqVar = this.e.a().get(fq.b(cCharAt, fsVar.e(), fsVar.d()));
                if (fqVar != null) {
                    fMeasureText = ((float) fqVar.d()) * f2 * je.e();
                }
            } else {
                fMeasureText = this.j.measureText(str.substring(i4, i4 + 1));
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
                d dVarD = d(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    dVarD.b(strTrim, (f4 - f7) - ((strTrim.length() - strSubstring.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarD.b(strTrim2, ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            d(i).b(str.substring(i2), f4);
        }
        return this.r.subList(0, i);
    }

    private d d(int i) {
        for (int size = this.r.size(); size < i; size++) {
            this.r.add(new d());
        }
        return this.r.get(i - 1);
    }

    private void e(fq fqVar, float f, DocumentData documentData, Canvas canvas) {
        List<em> listD = d(fqVar);
        for (int i = 0; i < listD.size(); i++) {
            Path path = listD.get(i).getPath();
            path.computeBounds(this.h, false);
            this.g.reset();
            this.g.preTranslate(0.0f, (-documentData.e) * je.e());
            this.g.preScale(f, f);
            path.transform(this.g);
            if (documentData.h) {
                b(path, this.j, canvas);
                b(path, this.m, canvas);
            } else {
                b(path, this.m, canvas);
                b(path, this.j, canvas);
            }
        }
    }

    private void b(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void b(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.h) {
            e(str, this.j, canvas);
            e(str, this.m, canvas);
        } else {
            e(str, this.m, canvas);
            e(str, this.j, canvas);
        }
    }

    private void e(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<em> d(fq fqVar) {
        if (this.f36170b.containsKey(fqVar)) {
            return this.f36170b.get(fqVar);
        }
        List<go> listA = fqVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new em(this.f, this, listA.get(i), this.e));
        }
        this.f36170b.put(fqVar, arrayList);
        return arrayList;
    }

    private String e(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!c(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.d.containsKey(j)) {
            return this.d.get(j);
        }
        this.i.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.i.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.i.toString();
        this.d.put(j, string);
        return string;
    }

    private boolean c(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, jf<T> jfVar) {
        super.addValueCallback(t, jfVar);
        if (t == LottieProperty.COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f36169a;
            if (baseKeyframeAnimation != null) {
                removeAnimation(baseKeyframeAnimation);
            }
            if (jfVar == null) {
                this.f36169a = null;
                return;
            }
            fm fmVar = new fm(jfVar);
            this.f36169a = fmVar;
            fmVar.addUpdateListener(this);
            addAnimation(this.f36169a);
            return;
        }
        if (t == LottieProperty.STROKE_COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.k;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (jfVar == null) {
                this.k = null;
                return;
            }
            fm fmVar2 = new fm(jfVar);
            this.k = fmVar2;
            fmVar2.addUpdateListener(this);
            addAnimation(this.k);
            return;
        }
        if (t == LottieProperty.STROKE_WIDTH) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.o;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (jfVar == null) {
                this.o = null;
                return;
            }
            fm fmVar3 = new fm(jfVar);
            this.o = fmVar3;
            fmVar3.addUpdateListener(this);
            addAnimation(this.o);
            return;
        }
        if (t == LottieProperty.TEXT_TRACKING) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.t;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (jfVar == null) {
                this.t = null;
                return;
            }
            fm fmVar4 = new fm(jfVar);
            this.t = fmVar4;
            fmVar4.addUpdateListener(this);
            addAnimation(this.t);
            return;
        }
        if (t == LottieProperty.TEXT_SIZE) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.s;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (jfVar == null) {
                this.s = null;
                return;
            }
            fm fmVar5 = new fm(jfVar);
            this.s = fmVar5;
            fmVar5.addUpdateListener(this);
            addAnimation(this.s);
            return;
        }
        if (t == LottieProperty.TYPEFACE) {
            BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation6 = this.x;
            if (baseKeyframeAnimation6 != null) {
                removeAnimation(baseKeyframeAnimation6);
            }
            if (jfVar == null) {
                this.x = null;
                return;
            }
            fm fmVar6 = new fm(jfVar);
            this.x = fmVar6;
            fmVar6.addUpdateListener(this);
            addAnimation(this.x);
            return;
        }
        if (t == LottieProperty.TEXT) {
            this.q.a(jfVar);
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36174b;
        private float d;

        private d() {
            this.f36174b = "";
            this.d = 0.0f;
        }

        void b(String str, float f) {
            this.f36174b = str;
            this.d = f;
        }
    }
}
