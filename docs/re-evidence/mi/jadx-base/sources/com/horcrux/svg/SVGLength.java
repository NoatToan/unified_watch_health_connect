package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class SVGLength {
    final SVGLengthUnitType unit;
    final double value;

    /* JADX INFO: renamed from: com.horcrux.svg.SVGLength$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.value = 0.0d;
        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_UNKNOWN;
    }

    public static ArrayList<SVGLength> arrayFrom(Dynamic dynamic) {
        int i = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i == 1) {
            ArrayList<SVGLength> arrayList = new ArrayList<>(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        if (i == 2) {
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(1);
            arrayList2.add(new SVGLength(dynamic.asString()));
            return arrayList2;
        }
        if (i != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList3.add(from(readableArrayAsArray.getDynamic(i2)));
        }
        return arrayList3;
    }

    public static SVGLength from(Dynamic dynamic) {
        int i = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i != 1) {
            return i != 2 ? new SVGLength() : new SVGLength(dynamic.asString());
        }
        return new SVGLength(dynamic.asDouble());
    }

    public static String toString(Dynamic dynamic) {
        int i = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public SVGLength(double d) {
        this.value = d;
        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER;
    }

    private SVGLength(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i = length - 1;
        if (length != 0 && !strTrim.equals("normal")) {
            if (strTrim.codePointAt(i) == 37) {
                this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_PERCENTAGE;
                this.value = Double.valueOf(strTrim.substring(0, i)).doubleValue();
                return;
            }
            int i2 = length - 2;
            if (i2 > 0) {
                String strSubstring = strTrim.substring(i2);
                strSubstring.hashCode();
                switch (strSubstring) {
                    case "cm":
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_CM;
                        length = i2;
                        break;
                    case "em":
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_EMS;
                        length = i2;
                        break;
                    case "ex":
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_EXS;
                        length = i2;
                        break;
                    case "in":
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_IN;
                        length = i2;
                        break;
                    case "mm":
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_MM;
                        length = i2;
                        break;
                    case "pc":
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_PC;
                        length = i2;
                        break;
                    case "pt":
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_PT;
                        length = i2;
                        break;
                    case "px":
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER;
                        length = i2;
                        break;
                    default:
                        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER;
                        break;
                }
                this.value = Double.valueOf(strTrim.substring(0, length)).doubleValue();
                return;
            }
            this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER;
            this.value = Double.valueOf(strTrim).doubleValue();
            return;
        }
        this.unit = SVGLengthUnitType.SVG_LENGTHTYPE_UNKNOWN;
        this.value = 0.0d;
    }
}
