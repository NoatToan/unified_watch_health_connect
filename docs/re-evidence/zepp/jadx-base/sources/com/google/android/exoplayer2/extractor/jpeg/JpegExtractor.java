package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class JpegExtractor implements Extractor {
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 4;
    private static final int o = 5;
    private static final int p = 6;
    private static final int q = 6;
    private static final long r = 1165519206;
    private static final int s = 65496;
    private static final int t = 65498;
    private static final int u = 65504;
    private static final int v = 65505;
    private static final String w = "http://ns.adobe.com/xap/1.0/";
    private static final int x = 1024;
    private ExtractorOutput b;
    private int c;
    private int d;
    private int e;

    @Nullable
    private MotionPhotoMetadata g;
    private ExtractorInput h;
    private a i;

    @Nullable
    private Mp4Extractor j;
    private final ParsableByteArray a = new ParsableByteArray(6);
    private long f = -1;

    private void a(ExtractorInput input) throws IOException {
        this.a.reset(2);
        input.peekFully(this.a.getData(), 0, 2);
        input.advancePeekPosition(this.a.readUnsignedShort() - 2);
    }

    private void b() {
        d(new Metadata.Entry[0]);
        ((ExtractorOutput) Assertions.checkNotNull(this.b)).endTracks();
        this.b.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.c = 6;
    }

    @Nullable
    private static MotionPhotoMetadata c(String xmpString, long inputLength) throws IOException {
        MotionPhotoDescription motionPhotoDescriptionA;
        if (inputLength == -1 || (motionPhotoDescriptionA = b.a(xmpString)) == null) {
            return null;
        }
        return motionPhotoDescriptionA.a(inputLength);
    }

    private void d(Metadata.Entry... metadataEntries) {
        ((ExtractorOutput) Assertions.checkNotNull(this.b)).track(1024, 4).format(new Format.Builder().setContainerMimeType(MimeTypes.IMAGE_JPEG).setMetadata(new Metadata(metadataEntries)).build());
    }

    private int e(ExtractorInput input) throws IOException {
        this.a.reset(2);
        input.peekFully(this.a.getData(), 0, 2);
        return this.a.readUnsignedShort();
    }

    private void f(ExtractorInput input) throws IOException {
        this.a.reset(2);
        input.readFully(this.a.getData(), 0, 2);
        int unsignedShort = this.a.readUnsignedShort();
        this.d = unsignedShort;
        if (unsignedShort == t) {
            if (this.f != -1) {
                this.c = 4;
                return;
            } else {
                b();
                return;
            }
        }
        if ((unsignedShort < 65488 || unsignedShort > 65497) && unsignedShort != 65281) {
            this.c = 1;
        }
    }

    private void g(ExtractorInput input) throws IOException {
        String nullTerminatedString;
        if (this.d == v) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(this.e);
            input.readFully(parsableByteArray.getData(), 0, this.e);
            if (this.g == null && w.equals(parsableByteArray.readNullTerminatedString()) && (nullTerminatedString = parsableByteArray.readNullTerminatedString()) != null) {
                MotionPhotoMetadata motionPhotoMetadataC = c(nullTerminatedString, input.getLength());
                this.g = motionPhotoMetadataC;
                if (motionPhotoMetadataC != null) {
                    this.f = motionPhotoMetadataC.videoStartPosition;
                }
            }
        } else {
            input.skipFully(this.e);
        }
        this.c = 0;
    }

    private void h(ExtractorInput input) throws IOException {
        this.a.reset(2);
        input.readFully(this.a.getData(), 0, 2);
        this.e = this.a.readUnsignedShort() - 2;
        this.c = 2;
    }

    private void i(ExtractorInput input) throws IOException {
        if (!input.peekFully(this.a.getData(), 0, 1, true)) {
            b();
            return;
        }
        input.resetPeekPosition();
        if (this.j == null) {
            this.j = new Mp4Extractor();
        }
        a aVar = new a(input, this.f);
        this.i = aVar;
        if (!this.j.sniff(aVar)) {
            b();
        } else {
            this.j.init(new StartOffsetExtractorOutput(this.f, (ExtractorOutput) Assertions.checkNotNull(this.b)));
            j();
        }
    }

    private void j() {
        d((Metadata.Entry) Assertions.checkNotNull(this.g));
        this.c = 5;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.b = output;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        int i = this.c;
        if (i == 0) {
            f(input);
            return 0;
        }
        if (i == 1) {
            h(input);
            return 0;
        }
        if (i == 2) {
            g(input);
            return 0;
        }
        if (i == 4) {
            long position = input.getPosition();
            long j = this.f;
            if (position != j) {
                seekPosition.position = j;
                return 1;
            }
            i(input);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.i == null || input != this.h) {
            this.h = input;
            this.i = new a(input, this.f);
        }
        int i2 = ((Mp4Extractor) Assertions.checkNotNull(this.j)).read(this.i, seekPosition);
        if (i2 == 1) {
            seekPosition.position += this.f;
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
        Mp4Extractor mp4Extractor = this.j;
        if (mp4Extractor != null) {
            mp4Extractor.release();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        if (position == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ((Mp4Extractor) Assertions.checkNotNull(this.j)).seek(position, timeUs);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        if (e(input) != 65496) {
            return false;
        }
        int iE = e(input);
        this.d = iE;
        if (iE == u) {
            a(input);
            this.d = e(input);
        }
        if (this.d != v) {
            return false;
        }
        input.advancePeekPosition(2);
        this.a.reset(6);
        input.peekFully(this.a.getData(), 0, 6);
        return this.a.readUnsignedInt() == r && this.a.readUnsignedShort() == 0;
    }
}
