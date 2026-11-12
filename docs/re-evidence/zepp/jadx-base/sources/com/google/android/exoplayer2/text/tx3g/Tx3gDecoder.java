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
import com.google.common.base.Charsets;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Tx3gDecoder extends SimpleSubtitleDecoder {
    private static final String A = "Serif";
    private static final int B = 8;
    private static final int C = 2;
    private static final int D = 2;
    private static final int E = 12;
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 16711680;
    private static final int J = 0;
    private static final int K = 0;
    private static final int L = -1;
    private static final String M = "sans-serif";
    private static final float N = 0.85f;
    private static final String v = "Tx3gDecoder";
    private static final char w = 65279;
    private static final char x = 65534;
    private static final int y = 1937013100;
    private static final int z = 1952608120;
    private final ParsableByteArray o;
    private final boolean p;
    private final int q;
    private final int r;
    private final String s;
    private final float t;
    private final int u;

    public Tx3gDecoder(List<byte[]> initializationData) {
        super(v);
        this.o = new ParsableByteArray();
        if (initializationData.size() != 1 || (initializationData.get(0).length != 48 && initializationData.get(0).length != 53)) {
            this.q = 0;
            this.r = -1;
            this.s = "sans-serif";
            this.p = false;
            this.t = N;
            this.u = -1;
            return;
        }
        byte[] bArr = initializationData.get(0);
        this.q = bArr[24];
        this.r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.s = A.equals(Util.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : "sans-serif";
        int i = bArr[25] * 20;
        this.u = i;
        boolean z2 = (bArr[0] & 32) != 0;
        this.p = z2;
        if (z2) {
            this.t = Util.constrainValue(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.t = N;
        }
    }

    private void j(ParsableByteArray parsableByteArray, SpannableStringBuilder cueText) throws SubtitleDecoderException {
        int length;
        k(parsableByteArray.bytesLeft() >= 12);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int i = parsableByteArray.readInt();
        if (unsignedShort2 > cueText.length()) {
            int length2 = cueText.length();
            StringBuilder sb = new StringBuilder(68);
            sb.append("Truncating styl end (");
            sb.append(unsignedShort2);
            sb.append(") to cueText.length() (");
            sb.append(length2);
            sb.append(").");
            Log.w(v, sb.toString());
            length = cueText.length();
        } else {
            length = unsignedShort2;
        }
        if (unsignedShort < length) {
            int i2 = length;
            m(cueText, unsignedByte, this.q, unsignedShort, i2, 0);
            l(cueText, i, this.r, unsignedShort, i2, 0);
            return;
        }
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("Ignoring styl with start (");
        sb2.append(unsignedShort);
        sb2.append(") >= end (");
        sb2.append(length);
        sb2.append(").");
        Log.w(v, sb2.toString());
    }

    private static void k(boolean checkValue) throws SubtitleDecoderException {
        if (!checkValue) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void l(SpannableStringBuilder cueText, int colorRgba, int defaultColorRgba, int start, int end, int spanPriority) {
        if (colorRgba != defaultColorRgba) {
            cueText.setSpan(new ForegroundColorSpan((colorRgba >>> 8) | ((colorRgba & 255) << 24)), start, end, spanPriority | 33);
        }
    }

    private static void m(SpannableStringBuilder cueText, int fontFace, int defaultFontFace, int start, int end, int spanPriority) {
        if (fontFace != defaultFontFace) {
            int i = spanPriority | 33;
            boolean z2 = (fontFace & 1) != 0;
            boolean z3 = (fontFace & 2) != 0;
            if (z2) {
                if (z3) {
                    cueText.setSpan(new StyleSpan(3), start, end, i);
                } else {
                    cueText.setSpan(new StyleSpan(1), start, end, i);
                }
            } else if (z3) {
                cueText.setSpan(new StyleSpan(2), start, end, i);
            }
            boolean z4 = (fontFace & 4) != 0;
            if (z4) {
                cueText.setSpan(new UnderlineSpan(), start, end, i);
            }
            if (z4 || z2 || z3) {
                return;
            }
            cueText.setSpan(new StyleSpan(0), start, end, i);
        }
    }

    private static void n(SpannableStringBuilder cueText, String fontFamily, int start, int end) {
        if (fontFamily != "sans-serif") {
            cueText.setSpan(new TypefaceSpan(fontFamily), start, end, 16711713);
        }
    }

    private static String o(ParsableByteArray parsableByteArray) throws SubtitleDecoderException {
        char cPeekChar;
        k(parsableByteArray.bytesLeft() >= 2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        if (unsignedShort == 0) {
            return "";
        }
        return (parsableByteArray.bytesLeft() < 2 || !((cPeekChar = parsableByteArray.peekChar()) == 65279 || cPeekChar == 65534)) ? parsableByteArray.readString(unsignedShort, Charsets.UTF_8) : parsableByteArray.readString(unsignedShort, Charsets.UTF_16);
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bytes, int length, boolean reset) throws SubtitleDecoderException {
        this.o.reset(bytes, length);
        String strO = o(this.o);
        if (strO.isEmpty()) {
            return a.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strO);
        m(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        l(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        n(spannableStringBuilder, this.s, 0, spannableStringBuilder.length());
        float fConstrainValue = this.t;
        while (this.o.bytesLeft() >= 8) {
            int position = this.o.getPosition();
            int i = this.o.readInt();
            int i2 = this.o.readInt();
            if (i2 == y) {
                k(this.o.bytesLeft() >= 2);
                int unsignedShort = this.o.readUnsignedShort();
                for (int i3 = 0; i3 < unsignedShort; i3++) {
                    j(this.o, spannableStringBuilder);
                }
            } else if (i2 == z && this.p) {
                k(this.o.bytesLeft() >= 2);
                fConstrainValue = Util.constrainValue(this.o.readUnsignedShort() / this.u, 0.0f, 0.95f);
            }
            this.o.setPosition(position + i);
        }
        return new a(new Cue.Builder().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build());
    }
}
