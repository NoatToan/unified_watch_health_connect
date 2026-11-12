package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.primitives.UnsignedBytes;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class Tx3gDecoder extends SimpleSubtitleDecoder {
    private static final char BOM_UTF16_BE = 65279;
    private static final char BOM_UTF16_LE = 65534;
    private static final int DEFAULT_COLOR = -1;
    private static final int DEFAULT_FONT_FACE = 0;
    private static final String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final float DEFAULT_VERTICAL_PLACEMENT = 0.85f;
    private static final int FONT_FACE_BOLD = 1;
    private static final int FONT_FACE_ITALIC = 2;
    private static final int FONT_FACE_UNDERLINE = 4;
    private static final int SIZE_ATOM_HEADER = 8;
    private static final int SIZE_BOM_UTF16 = 2;
    private static final int SIZE_SHORT = 2;
    private static final int SIZE_STYLE_RECORD = 12;
    private static final int SPAN_PRIORITY_HIGH = 0;
    private static final int SPAN_PRIORITY_LOW = 16711680;
    private static final String TAG = "Tx3gDecoder";
    private static final String TX3G_SERIF = "Serif";
    private static final int TYPE_STYL = 1937013100;
    private static final int TYPE_TBOX = 1952608120;
    private final int calculatedVideoTrackHeight;
    private final boolean customVerticalPlacement;
    private final int defaultColorRgba;
    private final int defaultFontFace;
    private final String defaultFontFamily;
    private final float defaultVerticalPlacement;
    private final ParsableByteArray parsableByteArray;

    public Tx3gDecoder(List<byte[]> list) {
        super(TAG);
        this.parsableByteArray = new ParsableByteArray();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.defaultFontFace = 0;
            this.defaultColorRgba = -1;
            this.defaultFontFamily = "sans-serif";
            this.customVerticalPlacement = false;
            this.defaultVerticalPlacement = DEFAULT_VERTICAL_PLACEMENT;
            this.calculatedVideoTrackHeight = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.defaultFontFace = bArr[24];
        this.defaultColorRgba = ((bArr[26] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[27] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[28] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[29] & UnsignedBytes.MAX_VALUE);
        this.defaultFontFamily = TX3G_SERIF.equals(Util.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : "sans-serif";
        int i14 = bArr[25] * Ascii.DC4;
        this.calculatedVideoTrackHeight = i14;
        boolean z14 = (bArr[0] & 32) != 0;
        this.customVerticalPlacement = z14;
        if (z14) {
            this.defaultVerticalPlacement = Util.constrainValue(((bArr[11] & UnsignedBytes.MAX_VALUE) | ((bArr[10] & UnsignedBytes.MAX_VALUE) << 8)) / i14, 0.0f, 0.95f);
        } else {
            this.defaultVerticalPlacement = DEFAULT_VERTICAL_PLACEMENT;
        }
    }

    private void applyStyleRecord(ParsableByteArray parsableByteArray, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        assertTrue(parsableByteArray.bytesLeft() >= 12);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int i14 = parsableByteArray.readInt();
        if (unsignedShort2 > spannableStringBuilder.length()) {
            int length = spannableStringBuilder.length();
            StringBuilder sb3 = new StringBuilder(68);
            sb3.append("Truncating styl end (");
            sb3.append(unsignedShort2);
            sb3.append(") to cueText.length() (");
            sb3.append(length);
            sb3.append(").");
            Log.w(TAG, sb3.toString());
            unsignedShort2 = spannableStringBuilder.length();
        }
        int i15 = unsignedShort2;
        if (unsignedShort < i15) {
            attachFontFace(spannableStringBuilder, unsignedByte, this.defaultFontFace, unsignedShort, i15, 0);
            attachColor(spannableStringBuilder, i14, this.defaultColorRgba, unsignedShort, i15, 0);
            return;
        }
        StringBuilder sb4 = new StringBuilder(60);
        sb4.append("Ignoring styl with start (");
        sb4.append(unsignedShort);
        sb4.append(") >= end (");
        sb4.append(i15);
        sb4.append(").");
        Log.w(TAG, sb4.toString());
    }

    private static void assertTrue(boolean z14) throws SubtitleDecoderException {
        if (!z14) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void attachColor(SpannableStringBuilder spannableStringBuilder, int i14, int i15, int i16, int i17, int i18) {
        if (i14 != i15) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i14 >>> 8) | ((i14 & 255) << 24)), i16, i17, i18 | 33);
        }
    }

    private static void attachFontFace(SpannableStringBuilder spannableStringBuilder, int i14, int i15, int i16, int i17, int i18) {
        if (i14 != i15) {
            int i19 = i18 | 33;
            boolean z14 = (i14 & 1) != 0;
            boolean z15 = (i14 & 2) != 0;
            if (z14) {
                if (z15) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i16, i17, i19);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i16, i17, i19);
                }
            } else if (z15) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i16, i17, i19);
            }
            boolean z16 = (i14 & 4) != 0;
            if (z16) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i16, i17, i19);
            }
            if (z16 || z14 || z15) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i16, i17, i19);
        }
    }

    private static void attachFontFamily(SpannableStringBuilder spannableStringBuilder, String str, int i14, int i15) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i14, i15, 16711713);
        }
    }

    private static String readSubtitleText(ParsableByteArray parsableByteArray) throws SubtitleDecoderException {
        char cPeekChar;
        assertTrue(parsableByteArray.bytesLeft() >= 2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        if (unsignedShort == 0) {
            return "";
        }
        return (parsableByteArray.bytesLeft() < 2 || !((cPeekChar = parsableByteArray.peekChar()) == 65279 || cPeekChar == 65534)) ? parsableByteArray.readString(unsignedShort, Charsets.UTF_8) : parsableByteArray.readString(unsignedShort, Charsets.UTF_16);
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i14, boolean z14) throws SubtitleDecoderException {
        this.parsableByteArray.reset(bArr, i14);
        String subtitleText = readSubtitleText(this.parsableByteArray);
        if (subtitleText.isEmpty()) {
            return Tx3gSubtitle.EMPTY;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subtitleText);
        attachFontFace(spannableStringBuilder, this.defaultFontFace, 0, 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        attachColor(spannableStringBuilder, this.defaultColorRgba, -1, 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        attachFontFamily(spannableStringBuilder, this.defaultFontFamily, 0, spannableStringBuilder.length());
        float fConstrainValue = this.defaultVerticalPlacement;
        while (this.parsableByteArray.bytesLeft() >= 8) {
            int position = this.parsableByteArray.getPosition();
            int i15 = this.parsableByteArray.readInt();
            int i16 = this.parsableByteArray.readInt();
            if (i16 == TYPE_STYL) {
                assertTrue(this.parsableByteArray.bytesLeft() >= 2);
                int unsignedShort = this.parsableByteArray.readUnsignedShort();
                for (int i17 = 0; i17 < unsignedShort; i17++) {
                    applyStyleRecord(this.parsableByteArray, spannableStringBuilder);
                }
            } else if (i16 == TYPE_TBOX && this.customVerticalPlacement) {
                assertTrue(this.parsableByteArray.bytesLeft() >= 2);
                fConstrainValue = Util.constrainValue(this.parsableByteArray.readUnsignedShort() / this.calculatedVideoTrackHeight, 0.0f, 0.95f);
            }
            this.parsableByteArray.setPosition(position + i15);
        }
        return new Tx3gSubtitle(new Cue.Builder().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build());
    }
}
