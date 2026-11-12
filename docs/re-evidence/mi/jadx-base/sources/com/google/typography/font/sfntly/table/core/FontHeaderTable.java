package com.google.typography.font.sfntly.table.core;

import defpackage.apr;
import defpackage.dzo;
import defpackage.fzo;
import defpackage.jgj;
import defpackage.ylb;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class FontHeaderTable extends dzo {
    public static final int[] c = {0, c.checkSumAdjustment.f9810a, c.magicNumber.f9810a};

    public enum Flags {
        BaselineAtY0,
        LeftSidebearingAtX0,
        InstructionsDependOnPointSize,
        ForcePPEMToInteger,
        InstructionsAlterAdvanceWidth,
        Apple_Vertical,
        Apple_Zero,
        Apple_RequiresLayout,
        Apple_GXMetamorphosis,
        Apple_StrongRTL,
        Apple_IndicRearrangement,
        FontDataLossless,
        FontConverted,
        OptimizedForClearType,
        Reserved14,
        Reserved15;

        public static EnumSet<Flags> asSet(int i) {
            EnumSet<Flags> enumSetNoneOf = EnumSet.noneOf(Flags.class);
            for (Flags flags : values()) {
                if ((flags.mask() & i) == flags.mask()) {
                    enumSetNoneOf.add(flags);
                }
            }
            return enumSetNoneOf;
        }

        public static int cleanValue(EnumSet<Flags> enumSet) {
            EnumSet enumSetCopyOf = EnumSet.copyOf((EnumSet) enumSet);
            enumSetCopyOf.remove(Reserved14);
            enumSetCopyOf.remove(Reserved15);
            return value(enumSetCopyOf);
        }

        public static int value(EnumSet<Flags> enumSet) {
            Iterator<Flags> it = enumSet.iterator();
            int iMask = 0;
            while (it.hasNext()) {
                iMask |= it.next().mask();
            }
            return iMask;
        }

        public int mask() {
            return 1 << ordinal();
        }
    }

    public enum FontDirectionHint {
        FullyMixed(0),
        OnlyStrongLTR(1),
        StrongLTRAndNeutral(2),
        OnlyStrongRTL(-1),
        StrongRTLAndNeutral(-2);

        private final int value;

        FontDirectionHint(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static FontDirectionHint valueOf(int i) {
            for (FontDirectionHint fontDirectionHint : values()) {
                if (fontDirectionHint.equals(i)) {
                    return fontDirectionHint;
                }
            }
            return null;
        }
    }

    public enum IndexToLocFormat {
        shortOffset(0),
        longOffset(1);

        private final int value;

        IndexToLocFormat(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static IndexToLocFormat valueOf(int i) {
            for (IndexToLocFormat indexToLocFormat : values()) {
                if (indexToLocFormat.equals(i)) {
                    return indexToLocFormat;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 com.google.typography.font.sfntly.table.core.FontHeaderTable$MacStyle, still in use, count: 1, list:
      (r0v7 com.google.typography.font.sfntly.table.core.FontHeaderTable$MacStyle) from 0x00ae: INVOKE 
      (r0v7 com.google.typography.font.sfntly.table.core.FontHeaderTable$MacStyle)
      (r1v15 com.google.typography.font.sfntly.table.core.FontHeaderTable$MacStyle)
     STATIC call: java.util.EnumSet.range(java.lang.Enum, java.lang.Enum):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>, E extends java.lang.Enum<E>):java.util.EnumSet<E extends java.lang.Enum<E>> (c), WRAPPED]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class MacStyle {
        Bold,
        Italic,
        Underline,
        Outline,
        Shadow,
        Condensed,
        Extended,
        Reserved7,
        Reserved8,
        Reserved9,
        Reserved10,
        Reserved11,
        Reserved12,
        Reserved13,
        Reserved14,
        Reserved15;

        private static final EnumSet<MacStyle> reserved = EnumSet.range(new MacStyle(), new MacStyle());

        static {
        }

        private MacStyle() {
            super(str, i);
        }

        public static EnumSet<MacStyle> asSet(int i) {
            EnumSet<MacStyle> enumSetNoneOf = EnumSet.noneOf(MacStyle.class);
            for (MacStyle macStyle : values()) {
                if ((macStyle.mask() & i) == macStyle.mask()) {
                    enumSetNoneOf.add(macStyle);
                }
            }
            return enumSetNoneOf;
        }

        public static int cleanValue(EnumSet<MacStyle> enumSet) {
            EnumSet enumSetCopyOf = EnumSet.copyOf((EnumSet) enumSet);
            enumSetCopyOf.removeAll(reserved);
            return value(enumSetCopyOf);
        }

        public static int value(EnumSet<MacStyle> enumSet) {
            Iterator<MacStyle> it = enumSet.iterator();
            int iMask = 0;
            while (it.hasNext()) {
                iMask |= it.next().mask();
            }
            return iMask;
        }

        public static MacStyle valueOf(String str) {
            return (MacStyle) Enum.valueOf(MacStyle.class, str);
        }

        public static MacStyle[] values() {
            return (MacStyle[]) $VALUES.clone();
        }

        public int mask() {
            return 1 << ordinal();
        }
    }

    public static class b extends fzo<FontHeaderTable> {
        public boolean h;
        public long i;

        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
            this.h = false;
            this.i = 0L;
            aprVar.y(0, c.checkSumAdjustment.f9810a, c.magicNumber.f9810a);
        }

        public static b y(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        public void A(long j) {
            i().O(c.checkSumAdjustment.f9810a, j);
        }

        public void B(long j) {
            if (this.h) {
                return;
            }
            this.h = true;
            this.i = j;
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public FontHeaderTable o(jgj jgjVar) {
            return new FontHeaderTable(u(), jgjVar);
        }

        @Override // defpackage.fzo, xz9.a
        public boolean r() {
            if (f()) {
                g().y(FontHeaderTable.c);
            }
            if (this.h) {
                jgj jgjVarG = g();
                jgjVarG.y(FontHeaderTable.c);
                A(2981146554L - (this.i + jgjVarG.g()));
            }
            return super.r();
        }

        public IndexToLocFormat z() {
            return x().q();
        }
    }

    public enum c {
        tableVersion(0),
        fontRevision(4),
        checkSumAdjustment(8),
        magicNumber(12),
        flags(16),
        unitsPerEm(18),
        created(20),
        modified(28),
        xMin(36),
        yMin(38),
        xMax(40),
        yMax(42),
        macStyle(44),
        lowestRecPPEM(46),
        fontDirectionHint(48),
        indexToLocFormat(50),
        glyphDataFormat(52);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9810a;

        c(int i) {
            this.f9810a = i;
        }
    }

    public long m() {
        return this.f39611a.t(c.checkSumAdjustment.f9810a);
    }

    public int o() {
        return this.f39611a.p(c.fontRevision.f9810a);
    }

    public IndexToLocFormat q() {
        return IndexToLocFormat.valueOf(r());
    }

    public int r() {
        return this.f39611a.r(c.indexToLocFormat.f9810a);
    }

    public int t() {
        return this.f39611a.v(c.unitsPerEm.f9810a);
    }

    public FontHeaderTable(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
        jgjVar.y(0, c.checkSumAdjustment.f9810a, c.magicNumber.f9810a);
    }
}
