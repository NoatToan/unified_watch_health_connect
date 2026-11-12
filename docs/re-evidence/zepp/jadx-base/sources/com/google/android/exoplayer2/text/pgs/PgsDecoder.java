package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {
    private static final int s = 20;
    private static final int t = 21;
    private static final int u = 22;
    private static final int v = 128;
    private static final byte w = 120;
    private final ParsableByteArray o;
    private final ParsableByteArray p;
    private final a q;

    @Nullable
    private Inflater r;

    public static final class a {
        private final ParsableByteArray a = new ParsableByteArray();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(ParsableByteArray buffer, int sectionLength) {
            int unsignedInt24;
            if (sectionLength < 4) {
                return;
            }
            buffer.skipBytes(3);
            int i = sectionLength - 4;
            if ((buffer.readUnsignedByte() & 128) != 0) {
                if (i < 7 || (unsignedInt24 = buffer.readUnsignedInt24()) < 4) {
                    return;
                }
                this.h = buffer.readUnsignedShort();
                this.i = buffer.readUnsignedShort();
                this.a.reset(unsignedInt24 - 4);
                i -= 7;
            }
            int position = this.a.getPosition();
            int iLimit = this.a.limit();
            if (position >= iLimit || i <= 0) {
                return;
            }
            int iMin = Math.min(i, iLimit - position);
            buffer.readBytes(this.a.getData(), position, iMin);
            this.a.setPosition(position + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(ParsableByteArray buffer, int sectionLength) {
            if (sectionLength < 19) {
                return;
            }
            this.d = buffer.readUnsignedShort();
            this.e = buffer.readUnsignedShort();
            buffer.skipBytes(11);
            this.f = buffer.readUnsignedShort();
            this.g = buffer.readUnsignedShort();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(ParsableByteArray buffer, int sectionLength) {
            if (sectionLength % 5 != 2) {
                return;
            }
            buffer.skipBytes(2);
            Arrays.fill(this.b, 0);
            int i = sectionLength / 5;
            int i2 = 0;
            while (i2 < i) {
                int unsignedByte = buffer.readUnsignedByte();
                int unsignedByte2 = buffer.readUnsignedByte();
                int unsignedByte3 = buffer.readUnsignedByte();
                int unsignedByte4 = buffer.readUnsignedByte();
                int unsignedByte5 = buffer.readUnsignedByte();
                double d = unsignedByte2;
                double d2 = unsignedByte3 + com.alipay.sdk.m.n.a.g;
                int i3 = (int) ((1.402d * d2) + d);
                int i4 = i2;
                double d3 = unsignedByte4 + com.alipay.sdk.m.n.a.g;
                this.b[unsignedByte] = Util.constrainValue((int) (d + (d3 * 1.772d)), 0, 255) | (Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (unsignedByte5 << 24) | (Util.constrainValue(i3, 0, 255) << 16);
                i2 = i4 + 1;
            }
            this.c = true;
        }

        @Nullable
        public Cue d() {
            int unsignedByte;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.limit() == 0 || this.a.getPosition() != this.a.limit() || !this.c) {
                return null;
            }
            this.a.setPosition(0);
            int i = this.h * this.i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int unsignedByte2 = this.a.readUnsignedByte();
                if (unsignedByte2 != 0) {
                    unsignedByte = i2 + 1;
                    iArr[i2] = this.b[unsignedByte2];
                } else {
                    int unsignedByte3 = this.a.readUnsignedByte();
                    if (unsignedByte3 != 0) {
                        unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | this.a.readUnsignedByte()) + i2;
                        Arrays.fill(iArr, i2, unsignedByte, (unsignedByte3 & 128) == 0 ? 0 : this.b[this.a.readUnsignedByte()]);
                    }
                }
                i2 = unsignedByte;
            }
            return new Cue.Builder().setBitmap(Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888)).setPosition(this.f / this.d).setPositionAnchor(0).setLine(this.g / this.e, 0).setLineAnchor(0).setSize(this.h / this.d).setBitmapHeight(this.i / this.e).build();
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.reset(0);
            this.c = false;
        }
    }

    public PgsDecoder() {
        super("PgsDecoder");
        this.o = new ParsableByteArray();
        this.p = new ParsableByteArray();
        this.q = new a();
    }

    private void j(ParsableByteArray buffer) {
        if (buffer.bytesLeft() <= 0 || buffer.peekUnsignedByte() != 120) {
            return;
        }
        if (this.r == null) {
            this.r = new Inflater();
        }
        if (Util.inflate(buffer, this.p, this.r)) {
            buffer.reset(this.p.getData(), this.p.limit());
        }
    }

    @Nullable
    private static Cue k(ParsableByteArray buffer, a cueBuilder) {
        int iLimit = buffer.limit();
        int unsignedByte = buffer.readUnsignedByte();
        int unsignedShort = buffer.readUnsignedShort();
        int position = buffer.getPosition() + unsignedShort;
        Cue cueD = null;
        if (position > iLimit) {
            buffer.setPosition(iLimit);
            return null;
        }
        if (unsignedByte != 128) {
            switch (unsignedByte) {
                case 20:
                    cueBuilder.g(buffer, unsignedShort);
                    break;
                case 21:
                    cueBuilder.e(buffer, unsignedShort);
                    break;
                case 22:
                    cueBuilder.f(buffer, unsignedShort);
                    break;
            }
        } else {
            cueD = cueBuilder.d();
            cueBuilder.h();
        }
        buffer.setPosition(position);
        return cueD;
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] data, int size, boolean reset) throws SubtitleDecoderException {
        this.o.reset(data, size);
        j(this.o);
        this.q.h();
        ArrayList arrayList = new ArrayList();
        while (this.o.bytesLeft() >= 3) {
            Cue cueK = k(this.o, this.q);
            if (cueK != null) {
                arrayList.add(cueK);
            }
        }
        return new com.google.android.exoplayer2.text.pgs.a(Collections.unmodifiableList(arrayList));
    }
}
