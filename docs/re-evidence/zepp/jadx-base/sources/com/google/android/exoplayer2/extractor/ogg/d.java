package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class d {
    public static final int l = 27;
    public static final int m = 255;
    public static final int n = 65025;
    public static final int o = 65307;
    private static final int p = 1332176723;
    private static final int q = 4;
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    private final ParsableByteArray k = new ParsableByteArray(255);

    public boolean a(ExtractorInput input, boolean quiet) throws IOException {
        b();
        this.k.reset(27);
        if (!ExtractorUtil.peekFullyQuietly(input, this.k.getData(), 0, 27, quiet) || this.k.readUnsignedInt() != 1332176723) {
            return false;
        }
        int unsignedByte = this.k.readUnsignedByte();
        this.a = unsignedByte;
        if (unsignedByte != 0) {
            if (quiet) {
                return false;
            }
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.b = this.k.readUnsignedByte();
        this.c = this.k.readLittleEndianLong();
        this.d = this.k.readLittleEndianUnsignedInt();
        this.e = this.k.readLittleEndianUnsignedInt();
        this.f = this.k.readLittleEndianUnsignedInt();
        int unsignedByte2 = this.k.readUnsignedByte();
        this.g = unsignedByte2;
        this.h = unsignedByte2 + 27;
        this.k.reset(unsignedByte2);
        if (!ExtractorUtil.peekFullyQuietly(input, this.k.getData(), 0, this.g, quiet)) {
            return false;
        }
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.k.readUnsignedByte();
            this.i += this.j[i];
        }
        return true;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean c(ExtractorInput input) throws IOException {
        return d(input, -1L);
    }

    public boolean d(ExtractorInput input, long limit) throws IOException {
        Assertions.checkArgument(input.getPosition() == input.getPeekPosition());
        this.k.reset(4);
        while (true) {
            if ((limit != -1 && input.getPosition() + 4 >= limit) || !ExtractorUtil.peekFullyQuietly(input, this.k.getData(), 0, 4, true)) {
                break;
            }
            this.k.setPosition(0);
            if (this.k.readUnsignedInt() == 1332176723) {
                input.resetPeekPosition();
                return true;
            }
            input.skipFully(1);
        }
        do {
            if (limit != -1 && input.getPosition() >= limit) {
                break;
            }
        } while (input.skip(1) != -1);
        return false;
    }
}
