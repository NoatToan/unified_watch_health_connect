package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class TextProperties {

    public enum AlignmentBaseline {
        baseline("baseline"),
        textBottom("text-bottom"),
        alphabetic("alphabetic"),
        ideographic("ideographic"),
        middle("middle"),
        central("central"),
        mathematical("mathematical"),
        textTop("text-top"),
        bottom("bottom"),
        center("center"),
        top("top"),
        textBeforeEdge("text-before-edge"),
        textAfterEdge("text-after-edge"),
        beforeEdge("before-edge"),
        afterEdge("after-edge"),
        hanging("hanging");

        private static final Map<String, AlignmentBaseline> alignmentToEnum = new HashMap();
        private final String alignment;

        static {
            for (AlignmentBaseline alignmentBaseline : values()) {
                alignmentToEnum.put(alignmentBaseline.alignment, alignmentBaseline);
            }
        }

        AlignmentBaseline(String str) {
            this.alignment = str;
        }

        public static AlignmentBaseline getEnum(String str) {
            Map<String, AlignmentBaseline> map = alignmentToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException("Unknown String Value: " + str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.alignment;
        }
    }

    public enum Direction {
        ltr,
        rtl
    }

    public enum FontStyle {
        normal,
        italic,
        oblique
    }

    public enum FontVariantLigatures {
        normal,
        none
    }

    public enum FontWeight {
        Normal("normal"),
        Bold("bold"),
        Bolder("bolder"),
        Lighter("lighter"),
        w100("100"),
        w200("200"),
        w300("300"),
        w400("400"),
        w500("500"),
        w600("600"),
        w700("700"),
        w800("800"),
        w900("900");

        private static final Map<String, FontWeight> weightToEnum = new HashMap();
        private final String weight;

        static {
            for (FontWeight fontWeight : values()) {
                weightToEnum.put(fontWeight.weight, fontWeight);
            }
        }

        FontWeight(String str) {
            this.weight = str;
        }

        public static FontWeight getEnum(String str) {
            Map<String, FontWeight> map = weightToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException("Unknown String Value: " + str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.weight;
        }
    }

    public enum TextAnchor {
        start,
        middle,
        end
    }

    public enum TextDecoration {
        None("none"),
        Underline("underline"),
        Overline("overline"),
        LineThrough("line-through"),
        Blink("blink");

        private static final Map<String, TextDecoration> decorationToEnum = new HashMap();
        private final String decoration;

        static {
            for (TextDecoration textDecoration : values()) {
                decorationToEnum.put(textDecoration.decoration, textDecoration);
            }
        }

        TextDecoration(String str) {
            this.decoration = str;
        }

        public static TextDecoration getEnum(String str) {
            Map<String, TextDecoration> map = decorationToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException("Unknown String Value: " + str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.decoration;
        }
    }

    public enum TextLengthAdjust {
        spacing,
        spacingAndGlyphs
    }

    public enum TextPathMethod {
        align,
        stretch
    }

    public enum TextPathMidLine {
        sharp,
        smooth
    }

    public enum TextPathSide {
        left,
        right
    }

    public enum TextPathSpacing {
        auto,
        exact
    }
}
