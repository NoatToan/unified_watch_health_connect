package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.hdj;
import defpackage.iej;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class TSpanView extends TextView {
    private static final String FONTS = "fonts/";
    private static final String OTF = ".otf";
    private static final String TTF = ".ttf";
    private static final double radToDeg = 57.29577951308232d;
    private static final double tau = 6.283185307179586d;
    private final ArrayList<String> emoji;
    private final ArrayList<Matrix> emojiTransforms;
    private Path mCachedPath;
    String mContent;
    private TextPathView textPath;

    /* JADX INFO: renamed from: com.horcrux.svg.TSpanView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust;

        static {
            int[] iArr = new int[TextProperties.TextAnchor.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = iArr;
            try {
                iArr[TextProperties.TextAnchor.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TextProperties.AlignmentBaseline.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline = iArr2;
            try {
                iArr2[TextProperties.AlignmentBaseline.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr3 = new int[TextProperties.TextLengthAdjust.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust = iArr3;
            try {
                iArr3[TextProperties.TextLengthAdjust.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[TextProperties.TextLengthAdjust.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public TSpanView(ReactContext reactContext) {
        super(reactContext);
        this.emoji = new ArrayList<>();
        this.emojiTransforms = new ArrayList<>();
    }

    private void applyTextPropertiesToPaint(Paint paint, FontData fontData) {
        Typeface typefaceD;
        AssetManager assets = this.mContext.getResources().getAssets();
        double d = fontData.fontSize * ((double) this.mScale);
        int i = 0;
        boolean z = fontData.fontWeight == TextProperties.FontWeight.Bold;
        boolean z2 = fontData.fontStyle == TextProperties.FontStyle.italic;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        String str = fontData.fontFamily;
        try {
            try {
                try {
                    typefaceD = Typeface.createFromAsset(assets, FONTS + str + OTF);
                } catch (Exception unused) {
                    typefaceD = null;
                }
            } catch (Exception unused2) {
                typefaceD = Typeface.createFromAsset(assets, FONTS + str + TTF);
            }
        } catch (Exception unused3) {
            typefaceD = hdj.b().d(str, i, assets);
        }
        paint.setTypeface(typefaceD);
        paint.setTextSize((float) d);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setLetterSpacing(0.0f);
    }

    private double getAbsoluteStartOffset(SVGLength sVGLength, double d, double d2) {
        return PropHelper.fromRelative(sVGLength, d, 0.0d, this.mScale, d2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x0381  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v68 */
    private Path getLinePath(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        boolean z;
        double d;
        double d2;
        double d3;
        int i;
        boolean z2;
        double d4;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        String str2;
        TSpanView tSpanView;
        Paint paint2;
        Path path;
        float[] fArr;
        float[] fArr2;
        double d5;
        GlyphPathBag glyphPathBag;
        int i3;
        String str3;
        boolean z6;
        Path orCreateAndCache;
        int i4;
        double d6;
        int i5;
        ?? r2;
        double d7;
        TSpanView tSpanView2 = this;
        Paint paint3 = paint;
        int length = str.length();
        Path path2 = new Path();
        tSpanView2.emoji.clear();
        tSpanView2.emojiTransforms.clear();
        if (length == 0) {
            return path2;
        }
        boolean z7 = tSpanView2.textPath != null;
        if (z7) {
            PathMeasure pathMeasure2 = new PathMeasure(tSpanView2.textPath.getTextPath(canvas, paint3), false);
            double length2 = pathMeasure2.getLength();
            boolean zIsClosed = pathMeasure2.isClosed();
            if (length2 == 0.0d) {
                return path2;
            }
            pathMeasure = pathMeasure2;
            d = length2;
            z = zIsClosed;
        } else {
            pathMeasure = null;
            z = false;
            d = 0.0d;
        }
        GlyphContext textRootGlyphContext = getTextRootGlyphContext();
        FontData font = textRootGlyphContext.getFont();
        tSpanView2.applyTextPropertiesToPaint(paint3, font);
        GlyphPathBag glyphPathBag2 = new GlyphPathBag(paint3);
        boolean[] zArr = new boolean[length];
        char[] charArray = str.toCharArray();
        Path path3 = path2;
        double d8 = font.kerning;
        double d9 = font.wordSpacing;
        double d10 = font.letterSpacing;
        boolean z8 = !font.manualKerning;
        String str4 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', ";
        if (d10 == 0.0d && font.fontVariantLigatures == TextProperties.FontVariantLigatures.normal) {
            paint3.setFontFeatureSettings(str4 + "'hlig', 'cala', " + font.fontFeatureSettings);
        } else {
            paint3.setFontFeatureSettings(str4 + "'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + font.fontFeatureSettings);
        }
        ReadableMap readableMap = font.fontData;
        float[] fArr3 = new float[length];
        paint3.getTextWidths(str, fArr3);
        TextProperties.TextAnchor textAnchor = font.textAnchor;
        PathMeasure pathMeasure3 = pathMeasure;
        double d11 = d10;
        double subtreeTextChunksTotalAdvance = getTextAnchorRoot().getSubtreeTextChunksTotalAdvance(paint3);
        double textAnchorOffset = tSpanView2.getTextAnchorOffset(textAnchor, subtreeTextChunksTotalAdvance);
        tSpanView2.applyTextPropertiesToPaint(paint3, font);
        double fontSize = textRootGlyphContext.getFontSize();
        if (z7) {
            boolean z9 = tSpanView2.textPath.getMidLine() == TextProperties.TextPathMidLine.sharp;
            int i6 = tSpanView2.textPath.getSide() == TextProperties.TextPathSide.right ? -1 : 1;
            double absoluteStartOffset = getAbsoluteStartOffset(tSpanView2.textPath.getStartOffset(), d, fontSize);
            textAnchorOffset += absoluteStartOffset;
            if (z) {
                d3 = absoluteStartOffset + (textAnchor == TextProperties.TextAnchor.middle ? -(d / 2.0d) : 0.0d);
                d2 = d3 + d;
            } else {
                d2 = d;
                d3 = 0.0d;
            }
            z2 = z9;
            i = i6;
        } else {
            d2 = d;
            d3 = 0.0d;
            i = 1;
            z2 = false;
        }
        SVGLength sVGLength = tSpanView2.mTextLength;
        double d12 = d;
        double d13 = 1.0d;
        if (sVGLength != null) {
            z3 = z2;
            d4 = d3;
            double dFromRelative = PropHelper.fromRelative(sVGLength, canvas.getWidth(), 0.0d, tSpanView2.mScale, fontSize);
            if (dFromRelative < 0.0d) {
                throw new IllegalArgumentException("Negative textLength value");
            }
            if (AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[tSpanView2.mLengthAdjust.ordinal()] != 2) {
                d11 += (dFromRelative - subtreeTextChunksTotalAdvance) / ((double) (length - 1));
            } else {
                d13 = dFromRelative / subtreeTextChunksTotalAdvance;
            }
        } else {
            d4 = d3;
            z3 = z2;
        }
        double d14 = i;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        double d15 = fontMetrics.descent;
        float f = fontMetrics.leading;
        double d16 = d13 * d14;
        double dFromRelative2 = ((double) f) + d15;
        int i7 = i;
        double d17 = d2;
        double d18 = (-fontMetrics.ascent) + f;
        double d19 = -fontMetrics.top;
        double d20 = d19 + dFromRelative2;
        String baselineShift = getBaselineShift();
        TextProperties.AlignmentBaseline alignmentBaseline = getAlignmentBaseline();
        if (alignmentBaseline != null) {
            switch (AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[alignmentBaseline.ordinal()]) {
                case 2:
                case 3:
                case 4:
                case 6:
                    z4 = false;
                    dFromRelative2 = -d15;
                    break;
                case 5:
                    z4 = false;
                    dFromRelative2 = 0.0d;
                    break;
                case 7:
                    Rect rect = new Rect();
                    z4 = false;
                    paint3.getTextBounds("x", 0, 1, rect);
                    dFromRelative2 = ((double) rect.height()) / 2.0d;
                    break;
                case 8:
                    dFromRelative2 = (d18 - d15) / 2.0d;
                    z4 = false;
                    break;
                case 9:
                    d7 = 0.5d;
                    dFromRelative2 = d18 * d7;
                    z4 = false;
                    break;
                case 10:
                    d7 = 0.8d;
                    dFromRelative2 = d18 * d7;
                    z4 = false;
                    break;
                case 11:
                case 12:
                case 13:
                    dFromRelative2 = d18;
                    z4 = false;
                    break;
                case 14:
                    z4 = false;
                    break;
                case 15:
                    dFromRelative2 = d20 / 2.0d;
                    z4 = false;
                    break;
                case 16:
                    dFromRelative2 = d19;
                    z4 = false;
                    break;
                default:
                    dFromRelative2 = 0.0d;
                    z4 = false;
                    break;
            }
        } else {
            z4 = false;
            dFromRelative2 = 0.0d;
        }
        if (baselineShift != null && !baselineShift.isEmpty() && (i5 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[alignmentBaseline.ordinal()]) != 14 && i5 != 16) {
            switch (baselineShift.hashCode()) {
                case -1720785339:
                    if (!baselineShift.equals("baseline")) {
                        r2 = -1;
                    } else {
                        r2 = z4;
                    }
                    break;
                case 114240:
                    if (!baselineShift.equals("sub")) {
                        r2 = -1;
                    } else {
                        r2 = 1;
                    }
                    break;
                case 109801339:
                    if (!baselineShift.equals("super")) {
                        r2 = -1;
                    } else {
                        r2 = 2;
                    }
                    break;
                default:
                    r2 = -1;
                    break;
            }
            switch (r2) {
                case 0:
                    break;
                case 1:
                    if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                        int i8 = readableMap.getInt("unitsPerEm");
                        ReadableMap map = readableMap.getMap("tables");
                        if (map.hasKey("os2")) {
                            ReadableMap map2 = map.getMap("os2");
                            if (map2.hasKey("ySubscriptYOffset")) {
                                dFromRelative2 += ((((double) tSpanView2.mScale) * fontSize) * map2.getDouble("ySubscriptYOffset")) / ((double) i8);
                            }
                        }
                    }
                    break;
                case 2:
                    if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                        int i9 = readableMap.getInt("unitsPerEm");
                        ReadableMap map3 = readableMap.getMap("tables");
                        if (map3.hasKey("os2")) {
                            ReadableMap map4 = map3.getMap("os2");
                            if (map4.hasKey("ySuperscriptYOffset")) {
                                dFromRelative2 -= ((((double) tSpanView2.mScale) * fontSize) * map4.getDouble("ySuperscriptYOffset")) / ((double) i9);
                            }
                        }
                    }
                    break;
                default:
                    float f2 = tSpanView2.mScale;
                    dFromRelative2 -= PropHelper.fromRelative(baselineShift, ((double) f2) * fontSize, f2, fontSize);
                    break;
            }
        }
        double d21 = dFromRelative2;
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();
        float[] fArr4 = new float[9];
        float[] fArr5 = new float[9];
        int i10 = 0;
        while (i10 < length) {
            char c = charArray[i10];
            String strValueOf = String.valueOf(c);
            boolean z10 = zArr[i10];
            if (z10) {
                str2 = "";
                i2 = length;
                z5 = false;
            } else {
                String str5 = strValueOf;
                int i11 = i10;
                z5 = false;
                while (true) {
                    int i12 = i11 + 1;
                    if (i12 < length && fArr3[i12] <= 0.0f) {
                        str5 = str5 + charArray[i12];
                        zArr[i12] = true;
                        length = length;
                        z5 = true;
                        i11 = i12;
                    }
                }
                i2 = length;
                str2 = str5;
            }
            double dMeasureText = ((double) paint3.measureText(str2)) * d13;
            String str6 = str2;
            if (z8) {
                d8 = (((double) fArr3[i10]) * d13) - dMeasureText;
            }
            boolean z11 = c == ' ';
            double d22 = (z11 ? d9 : 0.0d) + d11 + dMeasureText;
            double dNextX = textRootGlyphContext.nextX(z10 ? 0.0d : d8 + d22);
            float[] fArr6 = fArr5;
            float[] fArr7 = fArr4;
            double dNextY = textRootGlyphContext.nextY();
            double dNextDeltaX = textRootGlyphContext.nextDeltaX();
            double dNextDeltaY = textRootGlyphContext.nextDeltaY();
            double dNextRotation = textRootGlyphContext.nextRotation();
            if (z10 || z11) {
                tSpanView = this;
                paint2 = paint;
                path = path3;
                i2 = i2;
                fArr = fArr7;
                fArr2 = fArr6;
                d5 = d16;
                glyphPathBag = glyphPathBag2;
                d12 = d12;
                i3 = i7;
                matrix3 = matrix3;
            } else {
                double d23 = dMeasureText * d14;
                double d24 = (textAnchorOffset + ((dNextX + dNextDeltaX) * d14)) - (d22 * d14);
                if (z7) {
                    double d25 = d24 + d23;
                    double d26 = d23 / 2.0d;
                    double d27 = d24 + d26;
                    if (d27 <= d17 && d27 >= d4) {
                        if (z3) {
                            pathMeasure3.getMatrix((float) d27, matrix2, 3);
                            fArr = fArr7;
                        } else {
                            PathMeasure pathMeasure4 = pathMeasure3;
                            if (d24 < 0.0d) {
                                pathMeasure4.getMatrix(0.0f, matrix, 3);
                                matrix.preTranslate((float) d24, 0.0f);
                                i4 = 1;
                            } else {
                                i4 = 1;
                                pathMeasure4.getMatrix((float) d24, matrix, 1);
                            }
                            pathMeasure4.getMatrix((float) d27, matrix2, i4);
                            if (d25 > d12) {
                                d6 = d12;
                                pathMeasure4.getMatrix((float) d6, matrix3, 3);
                                matrix3.preTranslate((float) (d25 - d6), 0.0f);
                            } else {
                                d6 = d12;
                                pathMeasure4.getMatrix((float) d25, matrix3, i4);
                            }
                            fArr = fArr7;
                            matrix.getValues(fArr);
                            matrix3.getValues(fArr6);
                            d12 = d6;
                            pathMeasure3 = pathMeasure4;
                            matrix2.preRotate((float) (Math.atan2(((double) fArr6[5]) - ((double) fArr[5]), ((double) fArr6[2]) - ((double) fArr[2])) * radToDeg * d14));
                        }
                        matrix2.preTranslate((float) (-d26), (float) (dNextDeltaY + d21));
                        d5 = d16;
                        i3 = i7;
                        matrix2.preScale((float) d5, i3);
                        matrix2.postTranslate(0.0f, (float) dNextY);
                    } else {
                        tSpanView = this;
                        paint2 = paint;
                        path = path3;
                        i2 = i2;
                        fArr = fArr7;
                        fArr2 = fArr6;
                        d5 = d16;
                        glyphPathBag = glyphPathBag2;
                        d12 = d12;
                        i3 = i7;
                        matrix3 = matrix3;
                    }
                } else {
                    dNextRotation = dNextRotation;
                    fArr = fArr7;
                    d5 = d16;
                    i3 = i7;
                    matrix2.setTranslate((float) d24, (float) (dNextY + dNextDeltaY + d21));
                }
                matrix2.preRotate((float) dNextRotation);
                if (z5) {
                    Path path4 = new Path();
                    fArr2 = fArr6;
                    z6 = true;
                    path = path3;
                    paint.getTextPath(str6, 0, str6.length(), 0.0f, 0.0f, path4);
                    orCreateAndCache = path4;
                    str3 = str6;
                    glyphPathBag = glyphPathBag2;
                } else {
                    path = path3;
                    str3 = str6;
                    fArr2 = fArr6;
                    glyphPathBag = glyphPathBag2;
                    z6 = true;
                    orCreateAndCache = glyphPathBag.getOrCreateAndCache(c, str3);
                }
                RectF rectF = new RectF();
                orCreateAndCache.computeBounds(rectF, z6);
                if (rectF.width() == 0.0f) {
                    canvas.save();
                    canvas.concat(matrix2);
                    tSpanView = this;
                    tSpanView.emoji.add(str3);
                    tSpanView.emojiTransforms.add(new Matrix(matrix2));
                    paint2 = paint;
                    canvas.drawText(str3, 0.0f, 0.0f, paint2);
                    canvas.restore();
                } else {
                    tSpanView = this;
                    paint2 = paint;
                    orCreateAndCache.transform(matrix2);
                    path.addPath(orCreateAndCache);
                }
            }
            glyphPathBag2 = glyphPathBag;
            i7 = i3;
            tSpanView2 = tSpanView;
            textRootGlyphContext = textRootGlyphContext;
            length = i2;
            matrix3 = matrix3;
            fArr5 = fArr2;
            d12 = d12;
            d16 = d5;
            path3 = path;
            i10++;
            paint3 = paint2;
            fArr4 = fArr;
            d21 = d21;
        }
        return path3;
    }

    private double getTextAnchorOffset(TextProperties.TextAnchor textAnchor, double d) {
        int i = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor.ordinal()];
        if (i == 2) {
            return (-d) / 2.0d;
        }
        if (i != 3) {
            return 0.0d;
        }
        return -d;
    }

    private void setupTextPath() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == TextPathView.class) {
                this.textPath = (TextPathView) parent;
                return;
            } else {
                if (!(parent instanceof TextView)) {
                    return;
                }
            }
        }
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView
    public void clearCache() {
        this.mCachedPath = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        if (this.mContent == null) {
            clip(canvas, paint);
            drawGroup(canvas, paint, f);
            return;
        }
        int size = this.emoji.size();
        if (size > 0) {
            applyTextPropertiesToPaint(paint, getTextRootGlyphContext().getFont());
            for (int i = 0; i < size; i++) {
                String str = this.emoji.get(i);
                Matrix matrix = this.emojiTransforms.get(i);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        drawPath(canvas, paint, f);
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mCachedPath;
        if (path != null) {
            return path;
        }
        if (this.mContent == null) {
            Path groupPath = getGroupPath(canvas, paint);
            this.mCachedPath = groupPath;
            return groupPath;
        }
        setupTextPath();
        pushGlyphContext();
        this.mCachedPath = getLinePath(this.mContent, paint, canvas);
        popGlyphContext();
        return this.mCachedPath;
    }

    @Override // com.horcrux.svg.TextView
    public double getSubtreeTextChunksTotalAdvance(Paint paint) {
        if (!Double.isNaN(this.cachedAdvance)) {
            return this.cachedAdvance;
        }
        String str = this.mContent;
        int i = 0;
        double subtreeTextChunksTotalAdvance = 0.0d;
        if (str == null) {
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (childAt instanceof TextView) {
                    subtreeTextChunksTotalAdvance += ((TextView) childAt).getSubtreeTextChunksTotalAdvance(paint);
                }
                i++;
            }
            this.cachedAdvance = subtreeTextChunksTotalAdvance;
            return subtreeTextChunksTotalAdvance;
        }
        if (str.length() == 0) {
            this.cachedAdvance = 0.0d;
            return 0.0d;
        }
        FontData font = getTextRootGlyphContext().getFont();
        applyTextPropertiesToPaint(paint, font);
        double d = font.letterSpacing;
        if (d == 0.0d && font.fontVariantLigatures == TextProperties.FontVariantLigatures.normal) {
            i = 1;
        }
        String str2 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', ";
        if (i != 0) {
            paint.setFontFeatureSettings(str2 + "'hlig', 'cala', " + font.fontFeatureSettings);
        } else {
            paint.setFontFeatureSettings(str2 + "'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + font.fontFeatureSettings);
        }
        paint.setLetterSpacing((float) (d / (font.fontSize * ((double) this.mScale))));
        double dMeasureText = paint.measureText(str);
        this.cachedAdvance = dMeasureText;
        return dMeasureText;
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Path path;
        Path path2;
        Path path3;
        if (this.mContent == null) {
            return super.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            if (this.mRegion == null && (path3 = this.mFillPath) != null) {
                this.mRegion = getRegion(path3);
            }
            if (this.mRegion == null && (path2 = ((VirtualView) this).mPath) != null) {
                this.mRegion = getRegion(path2);
            }
            if (this.mStrokeRegion == null && (path = this.mStrokePath) != null) {
                this.mStrokeRegion = getRegion(path);
            }
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                Path clipPath = getClipPath();
                if (clipPath != null) {
                    if (this.mClipRegionPath != clipPath) {
                        this.mClipRegionPath = clipPath;
                        this.mClipRegion = getRegion(clipPath);
                    }
                    if (!this.mClipRegion.contains(iRound, iRound2)) {
                        return -1;
                    }
                }
                return getId();
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.mCachedPath = null;
        super.invalidate();
    }

    @iej(name = MiuiCursorConstants.CONTENT)
    public void setContent(String str) {
        this.mContent = str;
        invalidate();
    }
}
