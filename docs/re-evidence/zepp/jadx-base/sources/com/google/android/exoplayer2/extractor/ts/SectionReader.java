package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class SectionReader implements TsPayloadReader {
    private static final int g = 3;
    private static final int h = 32;
    private static final int i = 4098;
    private final SectionPayloadReader a;
    private final ParsableByteArray b = new ParsableByteArray(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public SectionReader(SectionPayloadReader reader) {
        this.a = reader;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public void consume(ParsableByteArray data, int flags) {
        int position;
        boolean z = (flags & 1) != 0;
        if (z) {
            position = data.getPosition() + data.readUnsignedByte();
        } else {
            position = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            data.setPosition(position);
            this.d = 0;
        }
        while (data.bytesLeft() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int unsignedByte = data.readUnsignedByte();
                    data.setPosition(data.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(data.bytesLeft(), 3 - this.d);
                data.readBytes(this.b.getData(), this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    this.b.setPosition(0);
                    this.b.setLimit(3);
                    this.b.skipBytes(1);
                    int unsignedByte2 = this.b.readUnsignedByte();
                    int unsignedByte3 = this.b.readUnsignedByte();
                    this.e = (unsignedByte2 & 128) != 0;
                    this.c = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = this.b.capacity();
                    int i4 = this.c;
                    if (iCapacity < i4) {
                        this.b.ensureCapacity(Math.min(4098, Math.max(i4, this.b.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(data.bytesLeft(), this.c - this.d);
                data.readBytes(this.b.getData(), this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.setLimit(i6);
                    } else {
                        if (Util.crc32(this.b.getData(), 0, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.setLimit(this.c - 4);
                    }
                    this.b.setPosition(0);
                    this.a.consume(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        this.a.init(timestampAdjuster, extractorOutput, idGenerator);
        this.f = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public void seek() {
        this.f = true;
    }
}
