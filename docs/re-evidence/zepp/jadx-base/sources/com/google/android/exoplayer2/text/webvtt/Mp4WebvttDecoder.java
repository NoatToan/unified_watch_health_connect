package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class Mp4WebvttDecoder extends SimpleSubtitleDecoder {
    private static final int p = 8;
    private static final int q = 1885436268;
    private static final int r = 1937011815;
    private static final int s = 1987343459;
    private final ParsableByteArray o;

    public Mp4WebvttDecoder() {
        super("Mp4WebvttDecoder");
        this.o = new ParsableByteArray();
    }

    private static Cue j(ParsableByteArray sampleData, int remainingCueBoxBytes) throws SubtitleDecoderException {
        CharSequence charSequenceP = null;
        Cue.Builder builderN = null;
        while (remainingCueBoxBytes > 0) {
            if (remainingCueBoxBytes < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int i = sampleData.readInt();
            int i2 = sampleData.readInt();
            int i3 = i - 8;
            String strFromUtf8Bytes = Util.fromUtf8Bytes(sampleData.getData(), sampleData.getPosition(), i3);
            sampleData.skipBytes(i3);
            remainingCueBoxBytes = (remainingCueBoxBytes - 8) - i3;
            if (i2 == r) {
                builderN = WebvttCueParser.n(strFromUtf8Bytes);
            } else if (i2 == q) {
                charSequenceP = WebvttCueParser.p(null, strFromUtf8Bytes.trim(), Collections.emptyList());
            }
        }
        if (charSequenceP == null) {
            charSequenceP = "";
        }
        return builderN != null ? builderN.setText(charSequenceP).build() : WebvttCueParser.l(charSequenceP);
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bytes, int length, boolean reset) throws SubtitleDecoderException {
        this.o.reset(bytes, length);
        ArrayList arrayList = new ArrayList();
        while (this.o.bytesLeft() > 0) {
            if (this.o.bytesLeft() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int i = this.o.readInt();
            if (this.o.readInt() == s) {
                arrayList.add(j(this.o, i - 8));
            } else {
                this.o.skipBytes(i - 8);
            }
        }
        return new a(arrayList);
    }
}
