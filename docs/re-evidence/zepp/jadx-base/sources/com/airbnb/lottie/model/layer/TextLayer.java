package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public class TextLayer extends BaseLayer {
    private final StringBuilder F;
    private final RectF G;
    private final Matrix H;
    private final Paint I;
    private final Paint J;
    private final Map<FontCharacter, List<ContentGroup>> K;
    private final LongSparseArray<String> L;
    private final TextKeyframeAnimation M;
    private final LottieDrawable N;
    private final LottieComposition O;

    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> P;

    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> Q;

    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> R;

    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> S;

    @Nullable
    private BaseKeyframeAnimation<Float, Float> T;

    @Nullable
    private BaseKeyframeAnimation<Float, Float> U;

    @Nullable
    private BaseKeyframeAnimation<Float, Float> V;

    @Nullable
    private BaseKeyframeAnimation<Float, Float> W;

    @Nullable
    private BaseKeyframeAnimation<Float, Float> X;

    @Nullable
    private BaseKeyframeAnimation<Float, Float> Y;

    @Nullable
    private BaseKeyframeAnimation<Typeface, Typeface> Z;

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
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableColorValue animatableColorValue;
        AnimatableColorValue animatableColorValue2;
        super(lottieDrawable, layer);
        this.F = new StringBuilder(2);
        this.G = new RectF();
        this.H = new Matrix();
        this.I = new a(1);
        this.J = new b(1);
        this.K = new HashMap();
        this.L = new LongSparseArray<>();
        this.N = lottieDrawable;
        this.O = layer.a();
        TextKeyframeAnimation textKeyframeAnimationCreateAnimation = layer.o().createAnimation();
        this.M = textKeyframeAnimationCreateAnimation;
        textKeyframeAnimationCreateAnimation.addUpdateListener(this);
        addAnimation(textKeyframeAnimationCreateAnimation);
        AnimatableTextProperties animatableTextPropertiesP = layer.p();
        if (animatableTextPropertiesP != null && (animatableColorValue2 = animatableTextPropertiesP.color) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = animatableColorValue2.createAnimation();
            this.P = baseKeyframeAnimationCreateAnimation;
            baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
            addAnimation(this.P);
        }
        if (animatableTextPropertiesP != null && (animatableColorValue = animatableTextPropertiesP.stroke) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = animatableColorValue.createAnimation();
            this.R = baseKeyframeAnimationCreateAnimation2;
            baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
            addAnimation(this.R);
        }
        if (animatableTextPropertiesP != null && (animatableFloatValue2 = animatableTextPropertiesP.strokeWidth) != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = animatableFloatValue2.createAnimation();
            this.T = baseKeyframeAnimationCreateAnimation3;
            baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
            addAnimation(this.T);
        }
        if (animatableTextPropertiesP == null || (animatableFloatValue = animatableTextPropertiesP.tracking) == null) {
            return;
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation4 = animatableFloatValue.createAnimation();
        this.V = baseKeyframeAnimationCreateAnimation4;
        baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        addAnimation(this.V);
    }

    private void A(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void B(FontCharacter fontCharacter, Matrix matrix, float f, DocumentData documentData, Canvas canvas) {
        List<ContentGroup> listI = I(fontCharacter);
        for (int i = 0; i < listI.size(); i++) {
            Path path = listI.get(i).getPath();
            path.computeBounds(this.G, false);
            this.H.set(matrix);
            this.H.preTranslate(0.0f, (-documentData.baselineShift) * Utils.dpScale());
            this.H.preScale(f, f);
            path.transform(this.H);
            if (documentData.strokeOverFill) {
                E(path, this.I, canvas);
                E(path, this.J, canvas);
            } else {
                E(path, this.J, canvas);
                E(path, this.I, canvas);
            }
        }
    }

    private void C(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.strokeOverFill) {
            A(str, this.I, canvas);
            A(str, this.J, canvas);
        } else {
            A(str, this.J, canvas);
            A(str, this.I, canvas);
        }
    }

    private void D(String str, DocumentData documentData, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strZ = z(str, length);
            length += strZ.length();
            C(strZ, documentData, canvas);
            canvas.translate(this.I.measureText(strZ) + f, 0.0f);
        }
    }

    private void E(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void F(String str, DocumentData documentData, Matrix matrix, Font font, Canvas canvas, float f, float f2) {
        float fFloatValue;
        for (int i = 0; i < str.length(); i++) {
            FontCharacter fontCharacter = this.O.getCharacters().get(FontCharacter.hashFor(str.charAt(i), font.getFamily(), font.getStyle()));
            if (fontCharacter != null) {
                B(fontCharacter, matrix, f2, documentData, canvas);
                float width = ((float) fontCharacter.getWidth()) * f2 * Utils.dpScale() * f;
                float f3 = documentData.tracking / 10.0f;
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.W;
                if (baseKeyframeAnimation != null) {
                    fFloatValue = baseKeyframeAnimation.getValue().floatValue();
                } else {
                    BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.V;
                    if (baseKeyframeAnimation2 != null) {
                        fFloatValue = baseKeyframeAnimation2.getValue().floatValue();
                    }
                    canvas.translate(width + (f3 * f), 0.0f);
                }
                f3 += fFloatValue;
                canvas.translate(width + (f3 * f), 0.0f);
            }
        }
    }

    private void G(DocumentData documentData, Matrix matrix, Font font, Canvas canvas) {
        float fFloatValue;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.Y;
        if (baseKeyframeAnimation != null) {
            fFloatValue = baseKeyframeAnimation.getValue().floatValue();
        } else {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.X;
            fFloatValue = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() : documentData.size;
        }
        float f = fFloatValue / 100.0f;
        float scale = Utils.getScale(matrix);
        String str = documentData.text;
        float fDpScale = documentData.lineHeight * Utils.dpScale();
        List<String> listK = K(str);
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            String str2 = listK.get(i);
            float fJ = J(str2, font, f, scale);
            canvas.save();
            y(documentData.justification, canvas, fJ);
            canvas.translate(0.0f, (i * fDpScale) - (((size - 1) * fDpScale) / 2.0f));
            F(str2, documentData, matrix, font, canvas, scale, f);
            canvas.restore();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009e A[LOOP:0: B:23:0x009c->B:24:0x009e, LOOP_END] */
    private void H(DocumentData documentData, Font font, Matrix matrix, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fDpScale;
        List<String> listK;
        int size;
        int i;
        Typeface typefaceL = L(font);
        if (typefaceL == null) {
            return;
        }
        String textInternal = documentData.text;
        TextDelegate textDelegate = this.N.getTextDelegate();
        if (textDelegate != null) {
            textInternal = textDelegate.getTextInternal(textInternal);
        }
        this.I.setTypeface(typefaceL);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.Y;
        if (baseKeyframeAnimation != null) {
            fFloatValue = baseKeyframeAnimation.getValue().floatValue();
        } else {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.X;
            fFloatValue = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() : documentData.size;
        }
        this.I.setTextSize(Utils.dpScale() * fFloatValue);
        this.J.setTypeface(this.I.getTypeface());
        this.J.setTextSize(this.I.getTextSize());
        float fDpScale2 = documentData.lineHeight * Utils.dpScale();
        float f = documentData.tracking / 10.0f;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.W;
        if (baseKeyframeAnimation3 == null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.V;
            if (baseKeyframeAnimation4 != null) {
                fFloatValue2 = baseKeyframeAnimation4.getValue().floatValue();
            }
            fDpScale = ((f * Utils.dpScale()) * fFloatValue) / 100.0f;
            listK = K(textInternal);
            size = listK.size();
            for (i = 0; i < size; i++) {
                String str = listK.get(i);
                float fMeasureText = this.J.measureText(str) + ((str.length() - 1) * fDpScale);
                canvas.save();
                y(documentData.justification, canvas, fMeasureText);
                canvas.translate(0.0f, (i * fDpScale2) - (((size - 1) * fDpScale2) / 2.0f));
                D(str, documentData, canvas, fDpScale);
                canvas.restore();
            }
        }
        fFloatValue2 = baseKeyframeAnimation3.getValue().floatValue();
        f += fFloatValue2;
        fDpScale = ((f * Utils.dpScale()) * fFloatValue) / 100.0f;
        listK = K(textInternal);
        size = listK.size();
        while (i < size) {
            String str2 = listK.get(i);
            float fMeasureText2 = this.J.measureText(str2) + ((str2.length() - 1) * fDpScale);
            canvas.save();
            y(documentData.justification, canvas, fMeasureText2);
            canvas.translate(0.0f, (i * fDpScale2) - (((size - 1) * fDpScale2) / 2.0f));
            D(str2, documentData, canvas, fDpScale);
            canvas.restore();
        }
    }

    private List<ContentGroup> I(FontCharacter fontCharacter) {
        if (this.K.containsKey(fontCharacter)) {
            return this.K.get(fontCharacter);
        }
        List<ShapeGroup> shapes = fontCharacter.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new ContentGroup(this.N, this, shapes.get(i)));
        }
        this.K.put(fontCharacter, arrayList);
        return arrayList;
    }

    private float J(String str, Font font, float f, float f2) {
        float width = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            FontCharacter fontCharacter = this.O.getCharacters().get(FontCharacter.hashFor(str.charAt(i), font.getFamily(), font.getStyle()));
            if (fontCharacter != null) {
                width = (float) (((double) width) + (fontCharacter.getWidth() * ((double) f) * ((double) Utils.dpScale()) * ((double) f2)));
            }
        }
        return width;
    }

    private List<String> K(String str) {
        return Arrays.asList(str.replaceAll("\r\n", StringUtils.CR).replaceAll("\n", StringUtils.CR).split(StringUtils.CR));
    }

    @Nullable
    private Typeface L(Font font) {
        Typeface value;
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation = this.Z;
        if (baseKeyframeAnimation != null && (value = baseKeyframeAnimation.getValue()) != null) {
            return value;
        }
        Typeface typeface = this.N.getTypeface(font.getFamily(), font.getStyle());
        return typeface != null ? typeface : font.getTypeface();
    }

    private boolean M(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    private void y(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = c.a[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else {
            if (i != 3) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private String z(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!M(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.L.containsKey(j)) {
            return this.L.get(j);
        }
        this.F.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.F.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.F.toString();
        this.L.put(j, string);
        return string;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.Q;
            if (baseKeyframeAnimation != null) {
                removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.Q = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.Q = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.Q);
            return;
        }
        if (t == LottieProperty.STROKE_COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.S;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.S = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.S = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            addAnimation(this.S);
            return;
        }
        if (t == LottieProperty.STROKE_WIDTH) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.U;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.U = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.U = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            addAnimation(this.U);
            return;
        }
        if (t == LottieProperty.TEXT_TRACKING) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.W;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.W = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.W = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            addAnimation(this.W);
            return;
        }
        if (t == LottieProperty.TEXT_SIZE) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.Y;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.Y = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.Y = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            addAnimation(this.Y);
            return;
        }
        if (t == LottieProperty.TYPEFACE) {
            BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation6 = this.Z;
            if (baseKeyframeAnimation6 != null) {
                removeAnimation(baseKeyframeAnimation6);
            }
            if (lottieValueCallback == null) {
                this.Z = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.Z = valueCallbackKeyframeAnimation6;
            valueCallbackKeyframeAnimation6.addUpdateListener(this);
            addAnimation(this.Z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.N.useTextGlyphs()) {
            canvas.concat(matrix);
        }
        DocumentData value = this.M.getValue();
        Font font = this.O.getFonts().get(value.fontName);
        if (font == null) {
            canvas.restore();
            return;
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.Q;
        if (baseKeyframeAnimation != null) {
            this.I.setColor(baseKeyframeAnimation.getValue().intValue());
        } else {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.P;
            if (baseKeyframeAnimation2 != null) {
                this.I.setColor(baseKeyframeAnimation2.getValue().intValue());
            } else {
                this.I.setColor(value.color);
            }
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation3 = this.S;
        if (baseKeyframeAnimation3 != null) {
            this.J.setColor(baseKeyframeAnimation3.getValue().intValue());
        } else {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation4 = this.R;
            if (baseKeyframeAnimation4 != null) {
                this.J.setColor(baseKeyframeAnimation4.getValue().intValue());
            } else {
                this.J.setColor(value.strokeColor);
            }
        }
        int iIntValue = ((this.v.getOpacity() == null ? 100 : this.v.getOpacity().getValue().intValue()) * 255) / 100;
        this.I.setAlpha(iIntValue);
        this.J.setAlpha(iIntValue);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.U;
        if (baseKeyframeAnimation5 != null) {
            this.J.setStrokeWidth(baseKeyframeAnimation5.getValue().floatValue());
        } else {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.T;
            if (baseKeyframeAnimation6 != null) {
                this.J.setStrokeWidth(baseKeyframeAnimation6.getValue().floatValue());
            } else {
                this.J.setStrokeWidth(value.strokeWidth * Utils.dpScale() * Utils.getScale(matrix));
            }
        }
        if (this.N.useTextGlyphs()) {
            G(value, matrix, font, canvas);
        } else {
            H(value, font, matrix, canvas);
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.O.getBounds().width(), this.O.getBounds().height());
    }
}
