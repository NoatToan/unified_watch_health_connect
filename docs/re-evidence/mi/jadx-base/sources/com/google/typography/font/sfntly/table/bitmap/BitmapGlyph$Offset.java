package com.google.typography.font.sfntly.table.bitmap;

import com.google.typography.font.sfntly.data.FontData;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'glyphFormat1_imageData' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class BitmapGlyph$Offset {
    private static final /* synthetic */ BitmapGlyph$Offset[] $VALUES;
    public static final BitmapGlyph$Offset bigGlyphMetricsLength;
    public static final BitmapGlyph$Offset ebdtComponentLength;
    public static final BitmapGlyph$Offset ebdtComponent_glyphCode;
    public static final BitmapGlyph$Offset ebdtComponent_xOffset;
    public static final BitmapGlyph$Offset ebdtComponent_yOffset;
    public static final BitmapGlyph$Offset glyphFormat1_imageData;
    public static final BitmapGlyph$Offset glyphFormat2_imageData;
    public static final BitmapGlyph$Offset glyphFormat5_imageData;
    public static final BitmapGlyph$Offset glyphFormat6_imageData;
    public static final BitmapGlyph$Offset glyphFormat7_imageData;
    public static final BitmapGlyph$Offset glyphFormat8_componentArray;
    public static final BitmapGlyph$Offset glyphFormat8_numComponents;
    public static final BitmapGlyph$Offset glyphFormat9_componentArray;
    public static final BitmapGlyph$Offset glyphFormat9_numComponents;
    public static final BitmapGlyph$Offset smallGlyphMetricsLength;
    public static final BitmapGlyph$Offset version = new BitmapGlyph$Offset("version", 0, 0);
    protected final int offset;

    private static /* synthetic */ BitmapGlyph$Offset[] $values() {
        return new BitmapGlyph$Offset[]{version, smallGlyphMetricsLength, bigGlyphMetricsLength, glyphFormat1_imageData, glyphFormat2_imageData, glyphFormat5_imageData, glyphFormat6_imageData, glyphFormat7_imageData, glyphFormat8_numComponents, glyphFormat8_componentArray, glyphFormat9_numComponents, glyphFormat9_componentArray, ebdtComponentLength, ebdtComponent_glyphCode, ebdtComponent_xOffset, ebdtComponent_yOffset};
    }

    static {
        BitmapGlyph$Offset bitmapGlyph$Offset = new BitmapGlyph$Offset("smallGlyphMetricsLength", 1, 5);
        smallGlyphMetricsLength = bitmapGlyph$Offset;
        BitmapGlyph$Offset bitmapGlyph$Offset2 = new BitmapGlyph$Offset("bigGlyphMetricsLength", 2, 8);
        bigGlyphMetricsLength = bitmapGlyph$Offset2;
        glyphFormat1_imageData = new BitmapGlyph$Offset("glyphFormat1_imageData", 3, bitmapGlyph$Offset.offset);
        glyphFormat2_imageData = new BitmapGlyph$Offset("glyphFormat2_imageData", 4, bitmapGlyph$Offset.offset);
        glyphFormat5_imageData = new BitmapGlyph$Offset("glyphFormat5_imageData", 5, 0);
        glyphFormat6_imageData = new BitmapGlyph$Offset("glyphFormat6_imageData", 6, bitmapGlyph$Offset2.offset);
        glyphFormat7_imageData = new BitmapGlyph$Offset("glyphFormat7_imageData", 7, bitmapGlyph$Offset2.offset);
        BitmapGlyph$Offset bitmapGlyph$Offset3 = new BitmapGlyph$Offset("glyphFormat8_numComponents", 8, bitmapGlyph$Offset.offset + 1);
        glyphFormat8_numComponents = bitmapGlyph$Offset3;
        int i = bitmapGlyph$Offset3.offset;
        FontData.DataSize dataSize = FontData.DataSize.USHORT;
        glyphFormat8_componentArray = new BitmapGlyph$Offset("glyphFormat8_componentArray", 9, i + dataSize.size());
        BitmapGlyph$Offset bitmapGlyph$Offset4 = new BitmapGlyph$Offset("glyphFormat9_numComponents", 10, bitmapGlyph$Offset2.offset);
        glyphFormat9_numComponents = bitmapGlyph$Offset4;
        glyphFormat9_componentArray = new BitmapGlyph$Offset("glyphFormat9_componentArray", 11, bitmapGlyph$Offset4.offset + dataSize.size());
        ebdtComponentLength = new BitmapGlyph$Offset("ebdtComponentLength", 12, dataSize.size() + (FontData.DataSize.CHAR.size() * 2));
        ebdtComponent_glyphCode = new BitmapGlyph$Offset("ebdtComponent_glyphCode", 13, 0);
        ebdtComponent_xOffset = new BitmapGlyph$Offset("ebdtComponent_xOffset", 14, 2);
        ebdtComponent_yOffset = new BitmapGlyph$Offset("ebdtComponent_yOffset", 15, 3);
        $VALUES = $values();
    }

    private BitmapGlyph$Offset(String str, int i, int i2) {
        super(str, i);
        this.offset = i2;
    }

    public static BitmapGlyph$Offset valueOf(String str) {
        return (BitmapGlyph$Offset) Enum.valueOf(BitmapGlyph$Offset.class, str);
    }

    public static BitmapGlyph$Offset[] values() {
        return (BitmapGlyph$Offset[]) $VALUES.clone();
    }
}
