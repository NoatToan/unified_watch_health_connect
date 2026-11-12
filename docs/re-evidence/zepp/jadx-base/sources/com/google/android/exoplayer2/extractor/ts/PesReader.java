package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PesReader implements TsPayloadReader {
    private static final String m = "PesReader";
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    private static final int r = 9;
    private static final int s = 10;
    private static final int t = 10;
    private final ElementaryStreamReader a;
    private final ParsableBitArray b = new ParsableBitArray(new byte[10]);
    private int c = 0;
    private int d;
    private TimestampAdjuster e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public PesReader(ElementaryStreamReader reader) {
        this.a = reader;
    }

    private boolean a(ParsableByteArray source, @Nullable byte[] target, int targetLength) {
        int iMin = Math.min(source.bytesLeft(), targetLength - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (target == null) {
            source.skipBytes(iMin);
        } else {
            source.readBytes(target, this.d, iMin);
        }
        int i = this.d + iMin;
        this.d = i;
        return i == targetLength;
    }

    private boolean b() {
        this.b.setPosition(0);
        int bits = this.b.readBits(24);
        if (bits != 1) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unexpected start code prefix: ");
            sb.append(bits);
            Log.w(m, sb.toString());
            this.j = -1;
            return false;
        }
        this.b.skipBits(8);
        int bits2 = this.b.readBits(16);
        this.b.skipBits(5);
        this.k = this.b.readBit();
        this.b.skipBits(2);
        this.f = this.b.readBit();
        this.g = this.b.readBit();
        this.b.skipBits(6);
        int bits3 = this.b.readBits(8);
        this.i = bits3;
        if (bits2 == 0) {
            this.j = -1;
        } else {
            int i = ((bits2 + 6) - 9) - bits3;
            this.j = i;
            if (i < 0) {
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("Found negative packet payload size: ");
                sb2.append(i);
                Log.w(m, sb2.toString());
                this.j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void c() {
        this.b.setPosition(0);
        this.l = C.TIME_UNSET;
        if (this.f) {
            this.b.skipBits(4);
            long bits = ((long) this.b.readBits(3)) << 30;
            this.b.skipBits(1);
            long bits2 = bits | ((long) (this.b.readBits(15) << 15));
            this.b.skipBits(1);
            long bits3 = bits2 | ((long) this.b.readBits(15));
            this.b.skipBits(1);
            if (!this.h && this.g) {
                this.b.skipBits(4);
                long bits4 = ((long) this.b.readBits(3)) << 30;
                this.b.skipBits(1);
                long bits5 = bits4 | ((long) (this.b.readBits(15) << 15));
                this.b.skipBits(1);
                long bits6 = bits5 | ((long) this.b.readBits(15));
                this.b.skipBits(1);
                this.e.adjustTsTimestamp(bits6);
                this.h = true;
            }
            this.l = this.e.adjustTsTimestamp(bits3);
        }
    }

    private void d(int state) {
        this.c = state;
        this.d = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void consume(ParsableByteArray data, int flags) throws ParserException {
        Assertions.checkStateNotNull(this.e);
        if ((flags & 1) != 0) {
            int i = this.c;
            if (i != 0 && i != 1) {
                if (i == 2) {
                    Log.w(m, "Unexpected start indicator reading extended header");
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int i2 = this.j;
                    if (i2 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i2);
                        sb.append(" more bytes");
                        Log.w(m, sb.toString());
                    }
                    this.a.packetFinished();
                }
            }
            d(1);
        }
        while (data.bytesLeft() > 0) {
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (a(data, this.b.data, Math.min(10, this.i)) && a(data, null, this.i)) {
                            c();
                            flags |= this.k ? 4 : 0;
                            this.a.packetStarted(this.l, flags);
                            d(3);
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException();
                        }
                        int iBytesLeft = data.bytesLeft();
                        int i4 = this.j;
                        int i5 = i4 != -1 ? iBytesLeft - i4 : 0;
                        if (i5 > 0) {
                            iBytesLeft -= i5;
                            data.setLimit(data.getPosition() + iBytesLeft);
                        }
                        this.a.consume(data);
                        int i6 = this.j;
                        if (i6 != -1) {
                            int i7 = i6 - iBytesLeft;
                            this.j = i7;
                            if (i7 == 0) {
                                this.a.packetFinished();
                                d(1);
                            }
                        }
                    }
                } else if (a(data, this.b.data, 9)) {
                    d(b() ? 2 : 0);
                }
            } else {
                data.skipBytes(data.bytesLeft());
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        this.e = timestampAdjuster;
        this.a.createTracks(extractorOutput, idGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void seek() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.seek();
    }
}
