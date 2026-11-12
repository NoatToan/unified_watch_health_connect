package com.google.typography.font.sfntly.table.core;

import defpackage.apr;
import defpackage.dzo;
import defpackage.fzo;
import defpackage.jgj;
import defpackage.ylb;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class OS2Table extends dzo {

    public enum CodePageRange {
        Latin1_1252,
        Latin2_1250,
        Cyrillic_1251,
        Greek_1253,
        Turkish_1254,
        Hebrew_1255,
        Arabic_1256,
        WindowsBaltic_1257,
        Vietnamese_1258,
        AlternateANSI9,
        AlternateANSI10,
        AlternateANSI11,
        AlternateANSI12,
        AlternateANSI13,
        AlternateANSI14,
        AlternateANSI15,
        Thai_874,
        JapanJIS_932,
        ChineseSimplified_936,
        KoreanWansung_949,
        ChineseTraditional_950,
        KoreanJohab_1361,
        AlternateANSI22,
        AlternateANSI23,
        AlternateANSI24,
        AlternateANSI25,
        AlternateANSI26,
        AlternateANSI27,
        AlternateANSI28,
        MacintoshCharacterSet,
        OEMCharacterSet,
        SymbolCharacterSet,
        ReservedForOEM32,
        ReservedForOEM33,
        ReservedForOEM34,
        ReservedForOEM35,
        ReservedForOEM36,
        ReservedForOEM37,
        ReservedForOEM38,
        ReservedForOEM39,
        ReservedForOEM40,
        ReservedForOEM41,
        ReservedForOEM42,
        ReservedForOEM43,
        ReservedForOEM44,
        ReservedForOEM45,
        ReservedForOEM46,
        ReservedForOEM47,
        IBMGreek_869,
        MSDOSRussion_866,
        MSDOSNordic_865,
        Arabic_864,
        MSDOSCanadianFrench_863,
        Hebrew_862,
        MSDOSIcelandic_861,
        MSDOSPortugese_860,
        IBMTurkish_857,
        IBMCyrillic_855,
        Latin2_852,
        MSDOSBaltic_775,
        Greek_737,
        Arabic_708,
        Latin1_850,
        US_437;

        public static long[] asArray(EnumSet<CodePageRange> enumSet) {
            long[] jArr = new long[4];
            for (CodePageRange codePageRange : enumSet) {
                int iOrdinal = codePageRange.ordinal() / 32;
                jArr[iOrdinal] = ((long) (1 << (codePageRange.ordinal() % 32))) | jArr[iOrdinal];
            }
            return jArr;
        }

        public static EnumSet<CodePageRange> asSet(long j, long j2) {
            EnumSet<CodePageRange> enumSetNoneOf = EnumSet.noneOf(CodePageRange.class);
            long[] jArr = {j, j2};
            int i = -1;
            int i2 = 0;
            for (CodePageRange codePageRange : values()) {
                if (codePageRange.ordinal() % 32 == 0) {
                    i++;
                    i2 = 0;
                } else {
                    i2++;
                }
                long j3 = 1 << i2;
                if ((jArr[i] & j3) == j3) {
                    enumSetNoneOf.add(codePageRange);
                }
            }
            return enumSetNoneOf;
        }

        public static UnicodeRange range(int i) {
            if (i > UnicodeRange.values().length) {
                return null;
            }
            return UnicodeRange.values()[i];
        }
    }

    public enum EmbeddingFlags {
        Reserved0,
        RestrictedLicenseEmbedding,
        PreviewAndPrintEmbedding,
        EditableEmbedding,
        Reserved4,
        Reserved5,
        Reserved6,
        Reserved7,
        NoSubsetting,
        BitmapEmbeddingOnly,
        Reserved10,
        Reserved11,
        Reserved12,
        Reserved13,
        Reserved14,
        Reserved15;

        public static EnumSet<EmbeddingFlags> asSet(int i) {
            EnumSet<EmbeddingFlags> enumSetNoneOf = EnumSet.noneOf(EmbeddingFlags.class);
            for (EmbeddingFlags embeddingFlags : values()) {
                if ((embeddingFlags.mask() & i) == embeddingFlags.mask()) {
                    enumSetNoneOf.add(embeddingFlags);
                }
            }
            return enumSetNoneOf;
        }

        public static int asUShort(EnumSet<EmbeddingFlags> enumSet) {
            Iterator<EmbeddingFlags> it = enumSet.iterator();
            int iMask = 0;
            while (it.hasNext()) {
                iMask |= it.next().mask();
            }
            return iMask;
        }

        public static boolean isInstallableEditing(int i) {
            return i == 0;
        }

        public int mask() {
            return 1 << ordinal();
        }

        public static boolean isInstallableEditing(EnumSet<EmbeddingFlags> enumSet) {
            return enumSet.isEmpty();
        }
    }

    public enum FsSelection {
        ITALIC,
        UNDERSCORE,
        NEGATIVE,
        OUTLINED,
        STRIKEOUT,
        BOLD,
        REGULAR,
        USE_TYPO_METRICS,
        WWS,
        OBLIQUE;

        public static int asInt(EnumSet<FsSelection> enumSet) {
            Iterator<FsSelection> it = enumSet.iterator();
            int iMask = 0;
            while (it.hasNext()) {
                iMask |= it.next().mask();
            }
            return iMask;
        }

        public static EnumSet<FsSelection> asSet(int i) {
            EnumSet<FsSelection> enumSetNoneOf = EnumSet.noneOf(FsSelection.class);
            for (FsSelection fsSelection : values()) {
                if ((fsSelection.mask() & i) == fsSelection.mask()) {
                    enumSetNoneOf.add(fsSelection);
                }
            }
            return enumSetNoneOf;
        }

        public int mask() {
            return 1 << ordinal();
        }
    }

    public enum UnicodeRange {
        BasicLatin,
        Latin1Supplement,
        LatinExtendedA,
        LatinExtendedB,
        IPAExtensions,
        SpacingModifierLetters,
        CombiningDiacriticalMarks,
        GreekAndCoptic,
        Coptic,
        Cyrillic,
        Armenian,
        Hebrew,
        Vai,
        Arabic,
        NKo,
        Devanagari,
        Bengali,
        Gurmukhi,
        Gujarati,
        Oriya,
        Tamil,
        Telugu,
        Kannada,
        Malayalam,
        Thai,
        Lao,
        Georgian,
        Balinese,
        HangulJamo,
        LatinExtendedAdditional,
        GreekExtended,
        GeneralPunctuation,
        SuperscriptsAndSubscripts,
        CurrencySymbols,
        NumberForms,
        Arrows,
        MathematicalOperators,
        MiscTechnical,
        ControlPictures,
        OCR,
        EnclosedAlphanumerics,
        BoxDrawing,
        BlockElements,
        GeometricShapes,
        MiscSymbols,
        Dingbats,
        CJKSymbolsAndPunctuation,
        Hiragana,
        Katakana,
        Bopomofo,
        HangulCompatibilityJamo,
        Phagspa,
        EnclosedCJKLettersAndMonths,
        CJKCompatibility,
        HangulSyllables,
        NonPlane0,
        Phoenician,
        CJKUnifiedIdeographs,
        PrivateUseAreaPlane0,
        CJKStrokes,
        AlphabeticPresentationForms,
        ArabicPresentationFormsA,
        CombiningHalfMarks,
        VerticalForms,
        SmallFormVariants,
        ArabicPresentationFormsB,
        HalfwidthAndFullwidthForms,
        Specials,
        Tibetan,
        Syriac,
        Thaana,
        Sinhala,
        Myanmar,
        Ethiopic,
        Cherokee,
        UnifiedCanadianAboriginalSyllabics,
        Ogham,
        Runic,
        Khmer,
        Mongolian,
        BraillePatterns,
        YiSyllables,
        Tagalog,
        OldItalic,
        Gothic,
        Deseret,
        MusicalSymbols,
        MathematicalAlphanumericSymbols,
        PrivateUsePlane15And16,
        VariationSelectors,
        Tags,
        Limbu,
        TaiLe,
        NewTaiLue,
        Buginese,
        Glagolitic,
        Tifnagh,
        YijingHexagramSymbols,
        SylotiNagari,
        LinearB,
        AncientGreekNumbers,
        Ugaritic,
        OldPersian,
        Shavian,
        Osmanya,
        CypriotSyllabary,
        Kharoshthi,
        TaiXuanJingSymbols,
        Cuneiform,
        CountingRodNumerals,
        Sudanese,
        Lepcha,
        OlChiki,
        Saurashtra,
        KayahLi,
        Rejang,
        Charm,
        AncientSymbols,
        PhaistosDisc,
        Carian,
        DominoTiles,
        Reserved123,
        Reserved124,
        Reserved125,
        Reserved126,
        Reserved127;

        public static long[] asArray(EnumSet<UnicodeRange> enumSet) {
            long[] jArr = new long[4];
            for (UnicodeRange unicodeRange : enumSet) {
                int iOrdinal = unicodeRange.ordinal() / 32;
                jArr[iOrdinal] = ((long) (1 << (unicodeRange.ordinal() % 32))) | jArr[iOrdinal];
            }
            return jArr;
        }

        public static EnumSet<UnicodeRange> asSet(long j, long j2, long j3, long j4) {
            EnumSet<UnicodeRange> enumSetNoneOf = EnumSet.noneOf(UnicodeRange.class);
            long[] jArr = {j, j2, j3, j4};
            int i = -1;
            int i2 = 0;
            for (UnicodeRange unicodeRange : values()) {
                if (unicodeRange.ordinal() % 32 == 0) {
                    i++;
                    i2 = 0;
                } else {
                    i2++;
                }
                long j5 = 1 << i2;
                if ((jArr[i] & j5) == j5) {
                    enumSetNoneOf.add(unicodeRange);
                }
            }
            return enumSetNoneOf;
        }

        public static UnicodeRange range(int i) {
            if (i > values().length) {
                return null;
            }
            return values()[i];
        }
    }

    public enum WeightClass {
        Thin(100),
        ExtraLight(200),
        UltraLight(200),
        Light(300),
        Normal(400),
        Regular(400),
        Medium(500),
        SemiBold(600),
        DemiBold(600),
        Bold(700),
        ExtraBold(800),
        UltraBold(800),
        Black(900),
        Heavy(900);

        private final int value;

        WeightClass(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static WeightClass valueOf(int i) {
            for (WeightClass weightClass : values()) {
                if (weightClass.equals(i)) {
                    return weightClass;
                }
            }
            return null;
        }
    }

    public enum WidthClass {
        UltraCondensed(1),
        ExtraCondensed(2),
        Condensed(3),
        SemiCondensed(4),
        Medium(5),
        Normal(5),
        SemiExpanded(6),
        Expanded(7),
        ExtraExpanded(8),
        UltraExpanded(9);

        private final int value;

        WidthClass(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static WeightClass valueOf(int i) {
            for (WeightClass weightClass : WeightClass.values()) {
                if (weightClass.equals(i)) {
                    return weightClass;
                }
            }
            return null;
        }
    }

    public static class b extends fzo<OS2Table> {
        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
        }

        public static b y(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public OS2Table o(jgj jgjVar) {
            return new OS2Table(u(), jgjVar);
        }
    }

    public enum c {
        version(0),
        xAvgCharWidth(2),
        usWeightClass(4),
        usWidthClass(6),
        fsType(8),
        ySubscriptXSize(10),
        ySubscriptYSize(12),
        ySubscriptXOffset(14),
        ySubscriptYOffset(16),
        ySuperscriptXSize(18),
        ySuperscriptYSize(20),
        ySuperscriptXOffset(22),
        ySuperscriptYOffset(24),
        yStrikeoutSize(26),
        yStrikeoutPosition(28),
        sFamilyClass(30),
        panose(32),
        panoseLength(10),
        ulUnicodeRange1(42),
        ulUnicodeRange2(46),
        ulUnicodeRange3(50),
        ulUnicodeRange4(54),
        achVendId(58),
        achVendIdLength(4),
        fsSelection(62),
        usFirstCharIndex(64),
        usLastCharIndex(66),
        sTypoAscender(68),
        sTypoDescender(70),
        sTypoLineGap(72),
        usWinAscent(74),
        usWinDescent(76),
        ulCodePageRange1(78),
        ulCodePageRange2(82),
        sxHeight(86),
        sCapHeight(88),
        usDefaultChar(90),
        usBreakChar(92),
        usMaxContext(94);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9822a;

        c(int i) {
            this.f9822a = i;
        }
    }

    public int l() {
        return this.f39611a.v(c.fsSelection.f9822a);
    }

    public int m() {
        return this.f39611a.v(c.fsType.f9822a);
    }

    public byte[] o() {
        byte[] bArr = new byte[10];
        this.f39611a.n(c.panose.f9822a, bArr, 0, 10);
        return bArr;
    }

    public int q() {
        return this.f39611a.v(c.version.f9822a);
    }

    public long r() {
        return this.f39611a.t(c.ulCodePageRange1.f9822a);
    }

    public long t() {
        return this.f39611a.t(c.ulCodePageRange2.f9822a);
    }

    public long u() {
        return this.f39611a.t(c.ulUnicodeRange1.f9822a);
    }

    public long v() {
        return this.f39611a.t(c.ulUnicodeRange2.f9822a);
    }

    public long w() {
        return this.f39611a.t(c.ulUnicodeRange3.f9822a);
    }

    public long x() {
        return this.f39611a.t(c.ulUnicodeRange4.f9822a);
    }

    public int z() {
        return this.f39611a.v(c.usWeightClass.f9822a);
    }

    public OS2Table(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
    }
}
