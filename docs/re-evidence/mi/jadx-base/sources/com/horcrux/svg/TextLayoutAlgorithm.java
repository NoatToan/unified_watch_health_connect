package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class TextLayoutAlgorithm {

    /* JADX INFO: renamed from: com.horcrux.svg.TextLayoutAlgorithm$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;

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
        }
    }

    public class CharacterInformation {
        double advance;
        char character;
        TextView element;
        int index;
        double x = 0.0d;
        double y = 0.0d;
        double rotate = 0.0d;
        boolean hidden = false;
        boolean middle = false;
        boolean resolved = false;
        boolean xSpecified = false;
        boolean ySpecified = false;
        boolean addressable = true;
        boolean anchoredChunk = false;
        boolean rotateSpecified = false;
        boolean firstCharacterInResolvedDescendant = false;

        public CharacterInformation(int i, char c) {
            this.index = i;
            this.character = c;
        }
    }

    public class LayoutInput {
        boolean horizontal;
        TextView text;

        public LayoutInput() {
        }
    }

    private void getSubTreeTypographicCharacterPositions(ArrayList<TextPathView> arrayList, ArrayList<TextView> arrayList2, StringBuilder sb, View view, TextPathView textPathView) {
        int i = 0;
        if (!(view instanceof TSpanView)) {
            if (view instanceof TextPathView) {
                textPathView = (TextPathView) view;
            }
            while (i < textPathView.getChildCount()) {
                getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, textPathView.getChildAt(i), textPathView);
                i++;
            }
            return;
        }
        TSpanView tSpanView = (TSpanView) view;
        String str = tSpanView.mContent;
        if (str == null) {
            while (i < tSpanView.getChildCount()) {
                getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, tSpanView.getChildAt(i), textPathView);
                i++;
            }
        } else {
            while (i < str.length()) {
                arrayList2.add(tSpanView);
                arrayList.add(textPathView);
                i++;
            }
            sb.append(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0173  */
    /* JADX WARN: Code duplicated, block: B:66:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8 A[LOOP:6: B:80:0x01a6->B:81:0x01a8, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.horcrux.svg.TextPathView] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.horcrux.svg.TextLayoutAlgorithm] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.Canvas, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public CharacterInformation[] layoutText(LayoutInput layoutInput) {
        boolean z;
        ArrayList arrayList;
        int i;
        CharacterInformation[] characterInformationArr;
        ?? r26;
        Object obj;
        Path path;
        ?? r27;
        double d;
        int i2;
        double d2;
        int i3;
        int i4;
        TextView textView = layoutInput.text;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getSubTreeTypographicCharacterPositions(arrayList3, arrayList2, sb, textView, null);
        char[] charArray = sb.toString().toCharArray();
        int length = charArray.length;
        final CharacterInformation[] characterInformationArr2 = new CharacterInformation[length];
        for (int i5 = 0; i5 < length; i5++) {
            characterInformationArr2[i5] = new CharacterInformation(i5, charArray[i5]);
        }
        if (length == 0) {
            return characterInformationArr2;
        }
        PointF[] pointFArr = new PointF[length];
        for (int i6 = 0; i6 < length; i6++) {
            pointFArr[i6] = new PointF(0.0f, 0.0f);
        }
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            if (i7 >= length) {
                break;
            }
            CharacterInformation characterInformation = characterInformationArr2[i7];
            characterInformation.addressable = true;
            characterInformation.middle = false;
            if (i7 != 0) {
                z2 = false;
            }
            characterInformation.anchoredChunk = z2;
            pointFArr[i7].set(0.0f, 0.0f);
            i7++;
        }
        String[] strArr = new String[length];
        String[] strArr2 = new String[length];
        new Object(characterInformationArr2, strArr, strArr2, new String[length], new String[length]) { // from class: com.horcrux.svg.TextLayoutAlgorithm.1CharacterPositioningResolver
            private int global = 0;
            private boolean horizontal = true;
            private boolean in_text_path = false;
            private String[] resolve_dx;
            private String[] resolve_dy;
            private String[] resolve_x;
            private String[] resolve_y;
            private CharacterInformation[] result;

            {
                this.result = characterInformationArr2;
                this.resolve_x = strArr;
                this.resolve_y = strArr2;
                this.resolve_dx = strArr;
                this.resolve_dy = strArr;
            }

            private void resolveCharacterPositioning(TextView textView2) {
                boolean z3 = false;
                if (textView2.getClass() != TextView.class && textView2.getClass() != TSpanView.class) {
                    if (textView2.getClass() == TextPathView.class) {
                        this.result[this.global].anchoredChunk = true;
                        this.in_text_path = true;
                        for (int i8 = 0; i8 < textView2.getChildCount(); i8++) {
                            resolveCharacterPositioning((TextView) textView2.getChildAt(i8));
                        }
                        if (textView2 instanceof TextPathView) {
                            this.in_text_path = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i9 = this.global;
                String[] strArr3 = new String[0];
                String[] strArr4 = new String[0];
                String[] strArr5 = new String[0];
                String[] strArr6 = new String[0];
                double[] dArr = new double[0];
                int iMax = !this.in_text_path ? Math.max(0, 0) : 0;
                String str = ((TSpanView) textView2).mContent;
                int length2 = str == null ? 0 : str.length();
                int i10 = 0;
                int i11 = 0;
                while (i10 < length2) {
                    CharacterInformation[] characterInformationArr3 = this.result;
                    int i12 = i9 + i10;
                    CharacterInformation characterInformation2 = characterInformationArr3[i12];
                    if (characterInformation2.addressable) {
                        characterInformation2.anchoredChunk = i11 < iMax ? true : z3;
                        if (i11 < 0) {
                            this.resolve_x[i12] = strArr3[i11];
                        }
                        boolean z4 = this.in_text_path;
                        if (z4 && !this.horizontal) {
                            this.resolve_x[i9] = "";
                        }
                        if (i11 < 0) {
                            this.resolve_y[i12] = strArr4[i11];
                        }
                        if (z4 && this.horizontal) {
                            this.resolve_y[i9] = "";
                        }
                        if (i11 < 0) {
                            this.resolve_dx[i12] = strArr5[i11];
                        }
                        if (i11 < 0) {
                            this.resolve_dy[i12] = strArr6[i11];
                        }
                        if (i11 < 0) {
                            characterInformationArr3[i12].rotate = dArr[i11];
                        }
                    }
                    i11++;
                    i10++;
                    z3 = false;
                }
            }
        };
        PointF pointF = new PointF(0.0f, 0.0f);
        for (int i8 = 0; i8 < length; i8++) {
            if (strArr[i8].equals("")) {
                strArr[i8] = "0";
            }
            if (strArr2[i8].equals("")) {
                strArr2[i8] = "0";
            }
            pointF.x += Float.parseFloat(strArr[i8]);
            float f = pointF.y + Float.parseFloat(strArr2[i8]);
            pointF.y = f;
            CharacterInformation characterInformation2 = characterInformationArr2[i8];
            PointF pointF2 = pointFArr[i8];
            characterInformation2.x = pointF2.x + pointF.x;
            characterInformation2.y = pointF2.y + f;
        }
        new Object() { // from class: com.horcrux.svg.TextLayoutAlgorithm.1TextLengthResolver
            int global;

            /* JADX INFO: Access modifiers changed from: private */
            public void resolveTextLength(TextView textView2) {
                Class<?> cls = textView2.getClass();
                boolean z3 = textView2.mTextLength != null;
                if (cls == TSpanView.class && z3) {
                    TSpanView tSpanView = (TSpanView) textView2;
                    String str = tSpanView.mContent;
                    int i9 = this.global;
                    int length2 = (str == null ? 0 : str.length()) + i9;
                    double dMax = Double.NEGATIVE_INFINITY;
                    int i10 = i9;
                    double dMin = Double.POSITIVE_INFINITY;
                    while (i10 <= length2) {
                        CharacterInformation[] characterInformationArr3 = characterInformationArr2;
                        CharacterInformation characterInformation3 = characterInformationArr3[i9];
                        if (characterInformation3.addressable) {
                            char c = characterInformation3.character;
                            if (c == '\n' || c == '\r') {
                                return;
                            }
                            CharacterInformation characterInformation4 = characterInformationArr3[i10];
                            double d3 = characterInformation4.x;
                            double d4 = characterInformation4.advance + d3;
                            dMin = Math.min(dMin, Math.min(d3, d4));
                            dMax = Math.max(dMax, Math.max(d3, d4));
                        }
                        i10++;
                        i9 = i9;
                    }
                    int i11 = i9;
                    if (dMin != Double.POSITIVE_INFINITY) {
                        double d5 = textView2.mTextLength.value - (dMax - dMin);
                        int length3 = 0;
                        int i12 = 0;
                        for (int i13 = 0; i13 < textView2.getChildCount(); i13++) {
                            if (((TextPathView) textView2.getChildAt(i13)).mTextLength == null) {
                                String str2 = tSpanView.mContent;
                                length3 += str2 == null ? 0 : str2.length();
                            } else {
                                characterInformationArr2[length3].firstCharacterInResolvedDescendant = true;
                                i12++;
                            }
                        }
                        double d6 = d5 / ((double) (length3 + (i12 - 1)));
                        double d7 = 0.0d;
                        for (int i14 = i11; i14 <= length2; i14++) {
                            CharacterInformation characterInformation5 = characterInformationArr2[i14];
                            characterInformation5.x += d7;
                            if (!characterInformation5.middle && (!characterInformation5.resolved || characterInformation5.firstCharacterInResolvedDescendant)) {
                                d7 += d6;
                            }
                        }
                    }
                }
            }
        }.resolveTextLength(textView);
        pointF.set(0.0f, 0.0f);
        int i9 = 1;
        while (i9 < length) {
            String str = strArr[i9];
            if (str != null) {
                pointF.x = (float) (Double.parseDouble(str) - characterInformationArr2[i9].x);
            }
            String str2 = strArr2[i9];
            if (str2 != null) {
                pointF.y = (float) (Double.parseDouble(str2) - characterInformationArr2[i9].y);
            }
            CharacterInformation characterInformation3 = characterInformationArr2[i9];
            characterInformation3.x += (double) pointF.x;
            characterInformation3.y += (double) pointF.y;
            if (characterInformation3.middle && characterInformation3.anchoredChunk) {
                characterInformation3.anchoredChunk = false;
            }
            i9++;
            if (i9 < length) {
                characterInformationArr2[i9].anchoredChunk = true;
            }
        }
        int i10 = 0;
        double dMin = Double.POSITIVE_INFINITY;
        double d3 = Double.NEGATIVE_INFINITY;
        double d4 = Double.POSITIVE_INFINITY;
        double d5 = Double.NEGATIVE_INFINITY;
        for (int i11 = 0; i11 < length; i11++) {
            CharacterInformation characterInformation4 = characterInformationArr2[i11];
            if (characterInformation4.addressable) {
                if (characterInformation4.anchoredChunk) {
                    d4 = dMin;
                    d5 = d3;
                    dMin = Double.POSITIVE_INFINITY;
                    d = Double.NEGATIVE_INFINITY;
                } else {
                    d = d3;
                }
                double d6 = characterInformation4.x;
                double d7 = characterInformation4.advance + d6;
                dMin = Math.min(dMin, Math.min(d6, d7));
                double dMax = Math.max(d, Math.max(d6, d7));
                if (i11 > 0 && characterInformationArr2[i11].anchoredChunk) {
                    if (d4 != Double.POSITIVE_INFINITY) {
                        TextProperties.TextAnchor textAnchor = TextProperties.TextAnchor.start;
                        TextProperties.Direction direction = TextProperties.Direction.ltr;
                        i2 = length - 1;
                        if (i11 == i2) {
                            d5 = dMax;
                            d4 = dMin;
                        }
                        d2 = characterInformationArr2[i10].x;
                        i3 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor.ordinal()];
                        if (i3 != 1) {
                            d2 -= d4;
                        } else if (i3 != 2) {
                            d2 -= (d4 + d5) / 2.0d;
                        } else if (i3 == 3) {
                            d2 -= d5;
                        }
                        if (i11 == i2) {
                            i4 = i11;
                        } else {
                            i4 = i11 - 1;
                        }
                        while (i10 <= i4) {
                            characterInformationArr2[i10].x += d2;
                            i10++;
                            dMax = dMax;
                        }
                        d3 = dMax;
                        i10 = i11;
                    }
                }
                if (i11 == length - 1) {
                    TextProperties.TextAnchor textAnchor2 = TextProperties.TextAnchor.start;
                    TextProperties.Direction direction2 = TextProperties.Direction.ltr;
                    i2 = length - 1;
                    if (i11 == i2) {
                        d5 = dMax;
                        d4 = dMin;
                    }
                    d2 = characterInformationArr2[i10].x;
                    i3 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor2.ordinal()];
                    if (i3 != 1) {
                        d2 -= d4;
                    } else if (i3 != 2) {
                        d2 -= (d4 + d5) / 2.0d;
                    } else if (i3 == 3) {
                        d2 -= d5;
                    }
                    if (i11 == i2) {
                        i4 = i11;
                    } else {
                        i4 = i11 - 1;
                    }
                    while (i10 <= i4) {
                        characterInformationArr2[i10].x += d2;
                        i10++;
                        dMax = dMax;
                    }
                    d3 = dMax;
                    i10 = i11;
                } else {
                    d3 = dMax;
                }
            }
        }
        PointF pointF3 = new PointF(0.0f, 0.0f);
        PathMeasure pathMeasure = new PathMeasure();
        ?? r2 = 0;
        Path path2 = null;
        int i12 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i12 < length) {
            ?? r12 = (TextPathView) arrayList3.get(i12);
            if (r12 == 0 || !characterInformationArr2[i12].addressable) {
                z = z4;
                arrayList = arrayList3;
                i = length;
                characterInformationArr = characterInformationArr2;
                r26 = r12;
            } else {
                Path textPath = r12.getTextPath(r2, r2);
                CharacterInformation characterInformation5 = characterInformationArr2[i12];
                if (characterInformation5.middle) {
                    path = textPath;
                    z = z4;
                    arrayList = arrayList3;
                    i = length;
                    characterInformationArr = characterInformationArr2;
                    r27 = r12;
                    CharacterInformation characterInformation6 = characterInformationArr[i12 - 1];
                    characterInformation5.x = characterInformation6.x;
                    characterInformation5.y = characterInformation6.y;
                    characterInformation5.rotate = characterInformation6.rotate;
                } else {
                    r12.getSide();
                    TextProperties.TextPathSide textPathSide = TextProperties.TextPathSide.left;
                    pathMeasure.setPath(textPath, false);
                    double length2 = pathMeasure.getLength();
                    path = textPath;
                    double d8 = r12.getStartOffset().value;
                    CharacterInformation characterInformation7 = characterInformationArr2[i12];
                    z = z4;
                    double d9 = characterInformation7.advance;
                    arrayList = arrayList3;
                    i = length;
                    double d10 = characterInformation7.x;
                    characterInformationArr = characterInformationArr2;
                    ?? r28 = r12;
                    double d11 = characterInformation7.y;
                    double d12 = characterInformation7.rotate;
                    double d13 = d10 + (d9 / 2.0d) + d8;
                    if (!pathMeasure.isClosed() && (d13 < 0.0d || d13 > length2)) {
                        characterInformationArr[i12].hidden = true;
                    }
                    if (pathMeasure.isClosed()) {
                        TextProperties.TextAnchor textAnchor3 = TextProperties.TextAnchor.start;
                        TextProperties.Direction direction3 = TextProperties.Direction.ltr;
                        double d14 = characterInformationArr[i10].x;
                        int i13 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor3.ordinal()];
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 == 3 && (d13 < (-length2) || d13 > 0.0d)) {
                                    characterInformationArr[i12].hidden = true;
                                }
                            } else if (d13 < (-length2) / 2.0d || d13 > length2 / 2.0d) {
                                characterInformationArr[i12].hidden = true;
                            }
                        } else if (d13 < 0.0d || d13 > length2) {
                            characterInformationArr[i12].hidden = true;
                        }
                    }
                    double d15 = d13 % length2;
                    r27 = r28;
                    if (!characterInformationArr[i12].hidden) {
                        float[] fArr = new float[2];
                        pathMeasure.getPosTan((float) d15, new float[2], fArr);
                        double dAtan2 = Math.atan2(fArr[1], fArr[0]) * 57.29577951308232d;
                        double d16 = 90.0d + dAtan2;
                        Math.cos(d16);
                        Math.sin(d16);
                        characterInformationArr[i12].rotate += dAtan2;
                        r27 = r28;
                    }
                }
                z3 = true;
                path2 = path;
                r26 = r27;
            }
            if (r26 == 0 && characterInformationArr[i12].addressable) {
                if (z3) {
                    pathMeasure.setPath(path2, false);
                    float[] fArr2 = new float[2];
                    obj = null;
                    pathMeasure.getPosTan(pathMeasure.getLength(), fArr2, null);
                    pointF3.set(fArr2[0], fArr2[1]);
                    z3 = false;
                    z = true;
                } else {
                    obj = null;
                }
                if (z) {
                    CharacterInformation characterInformation8 = characterInformationArr[i12];
                    if (characterInformation8.anchoredChunk) {
                        z = false;
                    } else {
                        characterInformation8.x += (double) pointF3.x;
                        characterInformation8.y += (double) pointF3.y;
                    }
                }
            } else {
                obj = null;
            }
            i12++;
            r2 = obj;
            z4 = z;
            arrayList3 = arrayList;
            length = i;
            characterInformationArr2 = characterInformationArr;
        }
        return characterInformationArr2;
    }
}
