package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTextRangeSelector;
import com.airbnb.lottie.model.animatable.AnimatableTextStyle;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import p1.z;

/* JADX INFO: loaded from: classes7.dex */
public class TextLayer extends BaseLayer {
    private final StringBuilder charStringBuilder;
    private final List<String> charStrings;
    private final z<String> codePointCache;
    private BaseKeyframeAnimation<Integer, Integer> colorAnimation;
    private BaseKeyframeAnimation<Integer, Integer> colorCallbackAnimation;
    private final LottieComposition composition;
    private final Map<FontCharacter, List<ContentGroup>> contentsForCharacter;
    private final Paint fillPaint;
    private final LottieDrawable lottieDrawable;
    private final Matrix matrix;
    private BaseKeyframeAnimation<Integer, Integer> opacityAnimation;
    private final RectF rectF;
    private final StringBuilder reorderingStringBuilder;
    private final StringBuilder reversingStringBuilder;
    private final StringBuilder stringBuilder;
    private BaseKeyframeAnimation<Integer, Integer> strokeColorAnimation;
    private BaseKeyframeAnimation<Integer, Integer> strokeColorCallbackAnimation;
    private final Paint strokePaint;
    private BaseKeyframeAnimation<Float, Float> strokeWidthAnimation;
    private BaseKeyframeAnimation<Float, Float> strokeWidthCallbackAnimation;
    private final TextKeyframeAnimation textAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeEndAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeOffsetAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeStartAnimation;
    private TextRangeUnits textRangeUnits;
    private BaseKeyframeAnimation<Float, Float> textSizeCallbackAnimation;
    private final List<TextSubLine> textSubLines;
    private BaseKeyframeAnimation<Float, Float> trackingAnimation;
    private BaseKeyframeAnimation<Float, Float> trackingCallbackAnimation;
    private BaseKeyframeAnimation<Typeface, Typeface> typefaceCallbackAnimation;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.TextLayer$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class TextSubLine {
        private String text;
        private float width;

        private TextSubLine() {
            this.text = "";
            this.width = 0.0f;
        }

        public void set(String str, float f14) {
            this.text = str;
            this.width = f14;
        }
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        AnimatableTextRangeSelector animatableTextRangeSelector;
        AnimatableTextRangeSelector animatableTextRangeSelector2;
        AnimatableIntegerValue animatableIntegerValue;
        AnimatableTextRangeSelector animatableTextRangeSelector3;
        AnimatableIntegerValue animatableIntegerValue2;
        AnimatableTextRangeSelector animatableTextRangeSelector4;
        AnimatableIntegerValue animatableIntegerValue3;
        AnimatableTextStyle animatableTextStyle;
        AnimatableIntegerValue animatableIntegerValue4;
        AnimatableTextStyle animatableTextStyle2;
        AnimatableFloatValue animatableFloatValue;
        AnimatableTextStyle animatableTextStyle3;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableTextStyle animatableTextStyle4;
        AnimatableColorValue animatableColorValue;
        AnimatableTextStyle animatableTextStyle5;
        AnimatableColorValue animatableColorValue2;
        super(lottieDrawable, layer);
        this.stringBuilder = new StringBuilder(2);
        this.charStringBuilder = new StringBuilder(0);
        this.reorderingStringBuilder = new StringBuilder(0);
        this.reversingStringBuilder = new StringBuilder(0);
        this.rectF = new RectF();
        this.matrix = new Matrix();
        int i14 = 1;
        this.fillPaint = new Paint(i14) { // from class: com.airbnb.lottie.model.layer.TextLayer.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.strokePaint = new Paint(i14) { // from class: com.airbnb.lottie.model.layer.TextLayer.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.contentsForCharacter = new HashMap();
        this.codePointCache = new z<>();
        this.charStrings = new ArrayList();
        this.textSubLines = new ArrayList();
        this.textRangeUnits = TextRangeUnits.INDEX;
        this.lottieDrawable = lottieDrawable;
        this.composition = layer.getComposition();
        TextKeyframeAnimation textKeyframeAnimationCreateAnimation = layer.getText().createAnimation();
        this.textAnimation = textKeyframeAnimationCreateAnimation;
        textKeyframeAnimationCreateAnimation.addUpdateListener(this);
        addAnimation(textKeyframeAnimationCreateAnimation);
        AnimatableTextProperties textProperties = layer.getTextProperties();
        if (textProperties != null && (animatableTextStyle5 = textProperties.textStyle) != null && (animatableColorValue2 = animatableTextStyle5.color) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = animatableColorValue2.createAnimation();
            this.colorAnimation = baseKeyframeAnimationCreateAnimation;
            baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
            addAnimation(this.colorAnimation);
        }
        if (textProperties != null && (animatableTextStyle4 = textProperties.textStyle) != null && (animatableColorValue = animatableTextStyle4.stroke) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = animatableColorValue.createAnimation();
            this.strokeColorAnimation = baseKeyframeAnimationCreateAnimation2;
            baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
            addAnimation(this.strokeColorAnimation);
        }
        if (textProperties != null && (animatableTextStyle3 = textProperties.textStyle) != null && (animatableFloatValue2 = animatableTextStyle3.strokeWidth) != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = animatableFloatValue2.createAnimation();
            this.strokeWidthAnimation = floatKeyframeAnimationCreateAnimation;
            floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
            addAnimation(this.strokeWidthAnimation);
        }
        if (textProperties != null && (animatableTextStyle2 = textProperties.textStyle) != null && (animatableFloatValue = animatableTextStyle2.tracking) != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = animatableFloatValue.createAnimation();
            this.trackingAnimation = floatKeyframeAnimationCreateAnimation2;
            floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
            addAnimation(this.trackingAnimation);
        }
        if (textProperties != null && (animatableTextStyle = textProperties.textStyle) != null && (animatableIntegerValue4 = animatableTextStyle.opacity) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation3 = animatableIntegerValue4.createAnimation();
            this.opacityAnimation = baseKeyframeAnimationCreateAnimation3;
            baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
            addAnimation(this.opacityAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector4 = textProperties.rangeSelector) != null && (animatableIntegerValue3 = animatableTextRangeSelector4.start) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation4 = animatableIntegerValue3.createAnimation();
            this.textRangeStartAnimation = baseKeyframeAnimationCreateAnimation4;
            baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
            addAnimation(this.textRangeStartAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector3 = textProperties.rangeSelector) != null && (animatableIntegerValue2 = animatableTextRangeSelector3.end) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation5 = animatableIntegerValue2.createAnimation();
            this.textRangeEndAnimation = baseKeyframeAnimationCreateAnimation5;
            baseKeyframeAnimationCreateAnimation5.addUpdateListener(this);
            addAnimation(this.textRangeEndAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector2 = textProperties.rangeSelector) != null && (animatableIntegerValue = animatableTextRangeSelector2.offset) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation6 = animatableIntegerValue.createAnimation();
            this.textRangeOffsetAnimation = baseKeyframeAnimationCreateAnimation6;
            baseKeyframeAnimationCreateAnimation6.addUpdateListener(this);
            addAnimation(this.textRangeOffsetAnimation);
        }
        if (textProperties == null || (animatableTextRangeSelector = textProperties.rangeSelector) == null) {
            return;
        }
        this.textRangeUnits = animatableTextRangeSelector.units;
    }

    private String codePointToString(String str, int i14) {
        int iCodePointAt = str.codePointAt(i14);
        int iCharCount = Character.charCount(iCodePointAt) + i14;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!isModifier(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j8 = iCodePointAt;
        if (this.codePointCache.c(j8) >= 0) {
            return this.codePointCache.b(j8);
        }
        this.stringBuilder.setLength(0);
        while (i14 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i14);
            this.stringBuilder.appendCodePoint(iCodePointAt3);
            i14 += Character.charCount(iCodePointAt3);
        }
        String string = this.stringBuilder.toString();
        this.codePointCache.f(j8, string);
        return string;
    }

    private void configurePaint(DocumentData documentData, int i14, int i15) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
        if (baseKeyframeAnimation != null) {
            this.fillPaint.setColor(baseKeyframeAnimation.getValue().intValue());
        } else if (this.colorAnimation == null || !isIndexInRangeSelection(i15)) {
            this.fillPaint.setColor(documentData.color);
        } else {
            this.fillPaint.setColor(this.colorAnimation.getValue().intValue());
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
        if (baseKeyframeAnimation2 != null) {
            this.strokePaint.setColor(baseKeyframeAnimation2.getValue().intValue());
        } else if (this.strokeColorAnimation == null || !isIndexInRangeSelection(i15)) {
            this.strokePaint.setColor(documentData.strokeColor);
        } else {
            this.strokePaint.setColor(this.strokeColorAnimation.getValue().intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue();
        if (this.opacityAnimation != null && isIndexInRangeSelection(i15)) {
            iIntValue = this.opacityAnimation.getValue().intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i14) / 255.0f);
        this.fillPaint.setAlpha(iRound);
        this.strokePaint.setAlpha(iRound);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
        if (baseKeyframeAnimation3 != null) {
            this.strokePaint.setStrokeWidth(baseKeyframeAnimation3.getValue().floatValue());
        } else if (this.strokeWidthAnimation == null || !isIndexInRangeSelection(i15)) {
            this.strokePaint.setStrokeWidth(Utils.dpScale() * documentData.strokeWidth);
        } else {
            this.strokePaint.setStrokeWidth(this.strokeWidthAnimation.getValue().floatValue());
        }
    }

    private void drawCharacter(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void drawCharacterAsGlyph(FontCharacter fontCharacter, float f14, DocumentData documentData, Canvas canvas, int i14, int i15) {
        configurePaint(documentData, i15, i14);
        List<ContentGroup> contentsForCharacter = getContentsForCharacter(fontCharacter);
        for (int i16 = 0; i16 < contentsForCharacter.size(); i16++) {
            Path path = contentsForCharacter.get(i16).getPath();
            path.computeBounds(this.rectF, false);
            this.matrix.reset();
            this.matrix.preTranslate(0.0f, Utils.dpScale() * (-documentData.baselineShift));
            this.matrix.preScale(f14, f14);
            path.transform(this.matrix);
            if (documentData.strokeOverFill) {
                drawGlyph(path, this.fillPaint, canvas);
                drawGlyph(path, this.strokePaint, canvas);
            } else {
                drawGlyph(path, this.strokePaint, canvas);
                drawGlyph(path, this.fillPaint, canvas);
            }
        }
    }

    private void drawCharacterFromFont(String str, DocumentData documentData, Canvas canvas, int i14, int i15) {
        configurePaint(documentData, i15, i14);
        if (documentData.strokeOverFill) {
            drawCharacter(str, this.fillPaint, canvas);
            drawCharacter(str, this.strokePaint, canvas);
        } else {
            drawCharacter(str, this.strokePaint, canvas);
            drawCharacter(str, this.fillPaint, canvas);
        }
    }

    private void drawFontTextLine(String str, DocumentData documentData, Canvas canvas, float f14, int i14, int i15) {
        this.charStrings.clear();
        int length = 0;
        while (length < str.length()) {
            String strCodePointToString = codePointToString(str, length);
            this.charStrings.add(strCodePointToString);
            length += strCodePointToString.length();
        }
        int i16 = 0;
        while (i16 < this.charStrings.size()) {
            this.charStringBuilder.setLength(0);
            this.charStringBuilder.append(this.charStrings.get(i16));
            int i17 = i16 + 1;
            while (i17 < this.charStrings.size()) {
                String str2 = this.charStrings.get(i17);
                if (!isJoiningRightToLeft(str2)) {
                    break;
                }
                this.charStringBuilder.insert(0, str2);
                i17++;
            }
            String string = this.charStringBuilder.toString();
            DocumentData documentData2 = documentData;
            drawCharacterFromFont(string, documentData2, canvas, i14 + i16, i15);
            canvas.translate(this.fillPaint.measureText(string) + f14, 0.0f);
            i16 = i17;
            documentData = documentData2;
        }
    }

    private void drawGlyph(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void drawGlyphTextLine(String str, DocumentData documentData, Font font, Canvas canvas, float f14, float f15, float f16, int i14) {
        DocumentData documentData2;
        Canvas canvas2;
        float f17;
        int i15;
        int i16 = 0;
        while (i16 < str.length()) {
            FontCharacter fontCharacterC = this.composition.getCharacters().c(FontCharacter.hashFor(str.charAt(i16), font.getFamily(), font.getStyle()));
            if (fontCharacterC == null) {
                documentData2 = documentData;
                canvas2 = canvas;
                f17 = f15;
                i15 = i14;
            } else {
                documentData2 = documentData;
                canvas2 = canvas;
                f17 = f15;
                i15 = i14;
                drawCharacterAsGlyph(fontCharacterC, f17, documentData2, canvas2, i16, i15);
                canvas2.translate((Utils.dpScale() * ((float) fontCharacterC.getWidth()) * f17) + f16, 0.0f);
            }
            i16++;
            f15 = f17;
            documentData = documentData2;
            canvas = canvas2;
            i14 = i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    private void drawTextWithFont(DocumentData documentData, Font font, Canvas canvas, int i14) {
        float fFloatValue;
        float fDpScale;
        List<String> textLines;
        int size;
        int i15;
        int i16;
        int length;
        PointF pointF;
        float f14;
        float f15;
        List<TextSubLine> listSplitGlyphTextIntoLines;
        int i17;
        TextSubLine textSubLine;
        float fMeasureText;
        float f16;
        int i18;
        String strReorderLineVisually;
        TextLayer textLayer = this;
        DocumentData documentData2 = documentData;
        Font font2 = font;
        Typeface typeface = textLayer.getTypeface(font2);
        if (typeface == null) {
            return;
        }
        String textInternal = documentData2.text;
        TextDelegate textDelegate = textLayer.lottieDrawable.getTextDelegate();
        if (textDelegate != null) {
            textInternal = textDelegate.getTextInternal(textLayer.getName(), textInternal);
        }
        textLayer.fillPaint.setTypeface(typeface);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = textLayer.textSizeCallbackAnimation;
        float fFloatValue2 = baseKeyframeAnimation != null ? baseKeyframeAnimation.getValue().floatValue() : documentData2.size;
        textLayer.fillPaint.setTextSize(Utils.dpScale() * fFloatValue2);
        textLayer.strokePaint.setTypeface(textLayer.fillPaint.getTypeface());
        textLayer.strokePaint.setTextSize(textLayer.fillPaint.getTextSize());
        float f17 = documentData2.tracking / 10.0f;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = textLayer.trackingCallbackAnimation;
        if (baseKeyframeAnimation2 == null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = textLayer.trackingAnimation;
            if (baseKeyframeAnimation3 != null) {
                fFloatValue = baseKeyframeAnimation3.getValue().floatValue();
            }
            fDpScale = ((Utils.dpScale() * f17) * fFloatValue2) / 100.0f;
            textLines = textLayer.getTextLines(textInternal);
            size = textLines.size();
            i15 = -1;
            i16 = 0;
            length = 0;
            while (i16 < size) {
                String str = textLines.get(i16);
                pointF = documentData2.boxSize;
                if (pointF == null) {
                    f14 = 0.0f;
                } else {
                    f14 = pointF.x;
                }
                f15 = fDpScale;
                listSplitGlyphTextIntoLines = textLayer.splitGlyphTextIntoLines(str, f14, font2, 0.0f, f15, false);
                i17 = 0;
                while (i17 < listSplitGlyphTextIntoLines.size()) {
                    textSubLine = listSplitGlyphTextIntoLines.get(i17);
                    i15++;
                    canvas.save();
                    if (textLayer.textAnimation != null && textLayer.textSizeCallbackAnimation == null && textLayer.trackingCallbackAnimation == null) {
                        fMeasureText = textSubLine.width;
                    } else {
                        fMeasureText = textLayer.fillPaint.measureText(textSubLine.text);
                    }
                    if (textLayer.offsetCanvas(canvas, documentData2, i15, fMeasureText)) {
                        strReorderLineVisually = textSubLine.text;
                        if (Bidi.requiresBidi(strReorderLineVisually.toCharArray(), 0, strReorderLineVisually.length())) {
                            strReorderLineVisually = textLayer.reorderLineVisually(strReorderLineVisually);
                        }
                        f16 = f15;
                        i18 = length;
                        textLayer.drawFontTextLine(strReorderLineVisually, documentData2, canvas, f16, i18, i14);
                    } else {
                        f16 = f15;
                        i18 = length;
                    }
                    length = textSubLine.text.length() + i18;
                    canvas.restore();
                    i17++;
                    textLayer = this;
                    documentData2 = documentData;
                    f15 = f16;
                }
                fDpScale = f15;
                i16++;
                textLayer = this;
                documentData2 = documentData;
                font2 = font;
            }
        }
        fFloatValue = baseKeyframeAnimation2.getValue().floatValue();
        f17 += fFloatValue;
        fDpScale = ((Utils.dpScale() * f17) * fFloatValue2) / 100.0f;
        textLines = textLayer.getTextLines(textInternal);
        size = textLines.size();
        i15 = -1;
        i16 = 0;
        length = 0;
        while (i16 < size) {
            String str2 = textLines.get(i16);
            pointF = documentData2.boxSize;
            if (pointF == null) {
                f14 = 0.0f;
            } else {
                f14 = pointF.x;
            }
            f15 = fDpScale;
            listSplitGlyphTextIntoLines = textLayer.splitGlyphTextIntoLines(str2, f14, font2, 0.0f, f15, false);
            i17 = 0;
            while (i17 < listSplitGlyphTextIntoLines.size()) {
                textSubLine = listSplitGlyphTextIntoLines.get(i17);
                i15++;
                canvas.save();
                if (textLayer.textAnimation != null) {
                    fMeasureText = textLayer.fillPaint.measureText(textSubLine.text);
                } else {
                    fMeasureText = textLayer.fillPaint.measureText(textSubLine.text);
                }
                if (textLayer.offsetCanvas(canvas, documentData2, i15, fMeasureText)) {
                    strReorderLineVisually = textSubLine.text;
                    if (Bidi.requiresBidi(strReorderLineVisually.toCharArray(), 0, strReorderLineVisually.length())) {
                        strReorderLineVisually = textLayer.reorderLineVisually(strReorderLineVisually);
                    }
                    f16 = f15;
                    i18 = length;
                    textLayer.drawFontTextLine(strReorderLineVisually, documentData2, canvas, f16, i18, i14);
                } else {
                    f16 = f15;
                    i18 = length;
                }
                length = textSubLine.text.length() + i18;
                canvas.restore();
                i17++;
                textLayer = this;
                documentData2 = documentData;
                f15 = f16;
            }
            fDpScale = f15;
            i16++;
            textLayer = this;
            documentData2 = documentData;
            font2 = font;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    private void drawTextWithGlyphs(DocumentData documentData, Matrix matrix, Font font, Canvas canvas, int i14) {
        float fFloatValue;
        float f14;
        int i15;
        int i16;
        PointF pointF;
        float f15;
        List<TextSubLine> listSplitGlyphTextIntoLines;
        int i17;
        TextSubLine textSubLine;
        float f16;
        float f17;
        TextLayer textLayer = this;
        DocumentData documentData2 = documentData;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = textLayer.textSizeCallbackAnimation;
        float fFloatValue2 = (baseKeyframeAnimation != null ? baseKeyframeAnimation.getValue().floatValue() : documentData2.size) / 100.0f;
        float scale = Utils.getScale(matrix);
        List<String> textLines = textLayer.getTextLines(documentData2.text);
        int size = textLines.size();
        float f18 = documentData2.tracking / 10.0f;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = textLayer.trackingCallbackAnimation;
        if (baseKeyframeAnimation2 == null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = textLayer.trackingAnimation;
            if (baseKeyframeAnimation3 != null) {
                fFloatValue = baseKeyframeAnimation3.getValue().floatValue();
            }
            f14 = f18;
            i15 = -1;
            i16 = 0;
            while (i16 < size) {
                String str = textLines.get(i16);
                pointF = documentData2.boxSize;
                if (pointF == null) {
                    f15 = 0.0f;
                } else {
                    f15 = pointF.x;
                }
                listSplitGlyphTextIntoLines = textLayer.splitGlyphTextIntoLines(str, f15, font, fFloatValue2, f14, true);
                i17 = 0;
                while (i17 < listSplitGlyphTextIntoLines.size()) {
                    textSubLine = listSplitGlyphTextIntoLines.get(i17);
                    i15++;
                    canvas.save();
                    if (textLayer.offsetCanvas(canvas, documentData2, i15, textSubLine.width)) {
                        float f19 = fFloatValue2;
                        DocumentData documentData3 = documentData2;
                        f16 = f14;
                        f17 = scale;
                        textLayer.drawGlyphTextLine(textSubLine.text, documentData3, font, canvas, f17, f19, f16, i14);
                        fFloatValue2 = f19;
                    } else {
                        f16 = f14;
                        f17 = scale;
                    }
                    canvas.restore();
                    i17++;
                    textLayer = this;
                    scale = f17;
                    f14 = f16;
                    documentData2 = documentData;
                }
                i16++;
                textLayer = this;
                f14 = f14;
                documentData2 = documentData;
            }
        }
        fFloatValue = baseKeyframeAnimation2.getValue().floatValue();
        f18 += fFloatValue;
        f14 = f18;
        i15 = -1;
        i16 = 0;
        while (i16 < size) {
            String str2 = textLines.get(i16);
            pointF = documentData2.boxSize;
            if (pointF == null) {
                f15 = 0.0f;
            } else {
                f15 = pointF.x;
            }
            listSplitGlyphTextIntoLines = textLayer.splitGlyphTextIntoLines(str2, f15, font, fFloatValue2, f14, true);
            i17 = 0;
            while (i17 < listSplitGlyphTextIntoLines.size()) {
                textSubLine = listSplitGlyphTextIntoLines.get(i17);
                i15++;
                canvas.save();
                if (textLayer.offsetCanvas(canvas, documentData2, i15, textSubLine.width)) {
                    float f110 = fFloatValue2;
                    DocumentData documentData4 = documentData2;
                    f16 = f14;
                    f17 = scale;
                    textLayer.drawGlyphTextLine(textSubLine.text, documentData4, font, canvas, f17, f110, f16, i14);
                    fFloatValue2 = f110;
                } else {
                    f16 = f14;
                    f17 = scale;
                }
                canvas.restore();
                i17++;
                textLayer = this;
                scale = f17;
                f14 = f16;
                documentData2 = documentData;
            }
            i16++;
            textLayer = this;
            f14 = f14;
            documentData2 = documentData;
        }
    }

    private TextSubLine ensureEnoughSubLines(int i14) {
        int size = this.textSubLines.size();
        while (true) {
            List<TextSubLine> list = this.textSubLines;
            if (size >= i14) {
                return list.get(i14 - 1);
            }
            list.add(new TextSubLine());
            size++;
        }
    }

    private List<ContentGroup> getContentsForCharacter(FontCharacter fontCharacter) {
        if (this.contentsForCharacter.containsKey(fontCharacter)) {
            return this.contentsForCharacter.get(fontCharacter);
        }
        List<ShapeGroup> shapes = fontCharacter.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new ContentGroup(this.lottieDrawable, this, shapes.get(i14), this.composition));
        }
        this.contentsForCharacter.put(fontCharacter, arrayList);
        return arrayList;
    }

    private List<String> getTextLines(String str) {
        return Arrays.asList(str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, StringUtils.CR).replaceAll("\u0003", StringUtils.CR).replaceAll("\n", StringUtils.CR).split(StringUtils.CR));
    }

    private Typeface getTypeface(Font font) {
        Typeface value;
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation = this.typefaceCallbackAnimation;
        if (baseKeyframeAnimation != null && (value = baseKeyframeAnimation.getValue()) != null) {
            return value;
        }
        Typeface typeface = this.lottieDrawable.getTypeface(font);
        return typeface != null ? typeface : font.getTypeface();
    }

    private boolean isIndexInRangeSelection(int i14) {
        int length = this.textAnimation.getValue().text.length();
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.textRangeStartAnimation;
        if (baseKeyframeAnimation == null || this.textRangeEndAnimation == null) {
            return true;
        }
        int iMin = Math.min(baseKeyframeAnimation.getValue().intValue(), this.textRangeEndAnimation.getValue().intValue());
        int iMax = Math.max(this.textRangeStartAnimation.getValue().intValue(), this.textRangeEndAnimation.getValue().intValue());
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.textRangeOffsetAnimation;
        if (baseKeyframeAnimation2 != null) {
            int iIntValue = baseKeyframeAnimation2.getValue().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.textRangeUnits == TextRangeUnits.INDEX) {
            return i14 >= iMin && i14 < iMax;
        }
        float f14 = (i14 / length) * 100.0f;
        return f14 >= ((float) iMin) && f14 < ((float) iMax);
    }

    private boolean isJoiningRightToLeft(String str) {
        for (int i14 = 0; i14 < str.length(); i14++) {
            if (Character.getDirectionality(str.codePointAt(i14)) == 2) {
                return true;
            }
        }
        return false;
    }

    private boolean isModifier(int i14) {
        return Character.getType(i14) == 16 || Character.getType(i14) == 27 || Character.getType(i14) == 6 || Character.getType(i14) == 28 || Character.getType(i14) == 8 || Character.getType(i14) == 19;
    }

    private boolean offsetCanvas(Canvas canvas, DocumentData documentData, int i14, float f14) {
        PointF pointF = documentData.boxPosition;
        PointF pointF2 = documentData.boxSize;
        float fDpScale = Utils.dpScale();
        float f15 = (i14 * documentData.lineHeight * fDpScale) + (pointF == null ? 0.0f : (documentData.lineHeight * fDpScale) + pointF.y);
        if (this.lottieDrawable.getClipTextToBoundingBox() && pointF2 != null && pointF != null && f15 >= pointF.y + pointF2.y + documentData.size) {
            return false;
        }
        float f16 = pointF == null ? 0.0f : pointF.x;
        float f17 = pointF2 != null ? pointF2.x : 0.0f;
        int i15 = AnonymousClass3.$SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[documentData.justification.ordinal()];
        if (i15 == 1) {
            canvas.translate(f16, f15);
        } else if (i15 == 2) {
            canvas.translate((f16 + f17) - f14, f15);
        } else if (i15 == 3) {
            canvas.translate(((f17 / 2.0f) + f16) - (f14 / 2.0f), f15);
        }
        return true;
    }

    private String reorderLineVisually(String str) {
        Bidi bidi = new Bidi(str, -2);
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            bArr[i14] = (byte) bidi.getRunLevel(i14);
            numArr[i14] = Integer.valueOf(i14);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        this.reorderingStringBuilder.setLength(0);
        for (int i15 = 0; i15 < runCount; i15++) {
            int iIntValue = numArr[i15].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            int runLevel = bidi.getRunLevel(iIntValue);
            String strSubstring = str.substring(runStart, runLimit);
            if ((runLevel & 1) == 0) {
                this.reorderingStringBuilder.append(strSubstring);
            } else {
                this.reversingStringBuilder.setLength(0);
                int length = 0;
                while (length < strSubstring.length()) {
                    String strCodePointToString = codePointToString(strSubstring, length);
                    this.reversingStringBuilder.insert(0, strCodePointToString);
                    length += strCodePointToString.length();
                }
                this.reorderingStringBuilder.append((CharSequence) this.reversingStringBuilder);
            }
        }
        return this.reorderingStringBuilder.toString();
    }

    private List<TextSubLine> splitGlyphTextIntoLines(String str, float f14, Font font, float f15, float f16, boolean z14) {
        float fMeasureText;
        int i14 = 0;
        int i15 = 0;
        boolean z15 = false;
        int i16 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i17 = 0; i17 < str.length(); i17++) {
            char cCharAt = str.charAt(i17);
            if (z14) {
                FontCharacter fontCharacterC = this.composition.getCharacters().c(FontCharacter.hashFor(cCharAt, font.getFamily(), font.getStyle()));
                if (fontCharacterC != null) {
                    fMeasureText = (Utils.dpScale() * ((float) fontCharacterC.getWidth()) * f15) + f16;
                }
            } else {
                fMeasureText = this.fillPaint.measureText(str.substring(i17, i17 + 1)) + f16;
            }
            if (cCharAt == ' ') {
                z15 = true;
                f19 = fMeasureText;
            } else if (z15) {
                z15 = false;
                i16 = i17;
                f18 = fMeasureText;
            } else {
                f18 += fMeasureText;
            }
            f17 += fMeasureText;
            if (f14 > 0.0f && f17 >= f14 && cCharAt != ' ') {
                i14++;
                TextSubLine textSubLineEnsureEnoughSubLines = ensureEnoughSubLines(i14);
                if (i16 == i15) {
                    String strSubstring = str.substring(i15, i17);
                    String strTrim = strSubstring.trim();
                    textSubLineEnsureEnoughSubLines.set(strTrim, (f17 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f19));
                    i15 = i17;
                    i16 = i15;
                    f17 = fMeasureText;
                    f18 = f17;
                } else {
                    String strSubstring2 = str.substring(i15, i16 - 1);
                    String strTrim2 = strSubstring2.trim();
                    textSubLineEnsureEnoughSubLines.set(strTrim2, ((f17 - f18) - ((strSubstring2.length() - strTrim2.length()) * f19)) - f19);
                    f17 = f18;
                    i15 = i16;
                }
            }
        }
        if (f17 > 0.0f) {
            i14++;
            ensureEnoughSubLines(i14).set(str.substring(i15), f17);
        }
        return this.textSubLines.subList(0, i14);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t7, LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t7, lottieValueCallback);
        if (t7 == LottieProperty.COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
            if (baseKeyframeAnimation != null) {
                removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorCallbackAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.colorCallbackAnimation);
            return;
        }
        if (t7 == LottieProperty.STROKE_COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.strokeColorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeColorCallbackAnimation = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            addAnimation(this.strokeColorCallbackAnimation);
            return;
        }
        if (t7 == LottieProperty.STROKE_WIDTH) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.strokeWidthCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeWidthCallbackAnimation = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            addAnimation(this.strokeWidthCallbackAnimation);
            return;
        }
        if (t7 == LottieProperty.TEXT_TRACKING) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.trackingCallbackAnimation;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.trackingCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.trackingCallbackAnimation = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            addAnimation(this.trackingCallbackAnimation);
            return;
        }
        if (t7 == LottieProperty.TEXT_SIZE) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.textSizeCallbackAnimation;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.textSizeCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.textSizeCallbackAnimation = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            addAnimation(this.textSizeCallbackAnimation);
            return;
        }
        if (t7 != LottieProperty.TYPEFACE) {
            if (t7 == LottieProperty.TEXT) {
                this.textAnimation.setStringValueCallback(lottieValueCallback);
                return;
            }
            return;
        }
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation6 = this.typefaceCallbackAnimation;
        if (baseKeyframeAnimation6 != null) {
            removeAnimation(baseKeyframeAnimation6);
        }
        if (lottieValueCallback == null) {
            this.typefaceCallbackAnimation = null;
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
        this.typefaceCallbackAnimation = valueCallbackKeyframeAnimation6;
        valueCallbackKeyframeAnimation6.addUpdateListener(this);
        addAnimation(this.typefaceCallbackAnimation);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i14, DropShadow dropShadow) {
        Canvas canvas2;
        DocumentData value = this.textAnimation.getValue();
        Font font = this.composition.getFonts().get(value.fontName);
        if (font == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        configurePaint(value, i14, 0);
        if (this.lottieDrawable.useTextGlyphs()) {
            canvas2 = canvas;
            drawTextWithGlyphs(value, matrix, font, canvas2, i14);
        } else {
            canvas2 = canvas;
            drawTextWithFont(value, font, canvas2, i14);
        }
        canvas2.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z14) {
        super.getBounds(rectF, matrix, z14);
        rectF.set(0.0f, 0.0f, this.composition.getBounds().width(), this.composition.getBounds().height());
    }
}
