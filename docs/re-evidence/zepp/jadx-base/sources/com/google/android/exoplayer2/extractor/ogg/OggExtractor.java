package com.google.android.exoplayer2.extractor.ogg;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
public class OggExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: zj5
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return OggExtractor.b();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    private static final int d = 8;
    private ExtractorOutput a;
    private g b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] b() {
        return new Extractor[]{new OggExtractor()};
    }

    private static ParsableByteArray c(ParsableByteArray scratch) {
        scratch.setPosition(0);
        return scratch;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean d(ExtractorInput input) throws IOException {
        d dVar = new d();
        if (dVar.a(input, true) && (dVar.b & 2) == 2) {
            int iMin = Math.min(dVar.i, 8);
            ParsableByteArray parsableByteArray = new ParsableByteArray(iMin);
            input.peekFully(parsableByteArray.getData(), 0, iMin);
            if (b.p(c(parsableByteArray))) {
                this.b = new b();
            } else if (h.r(c(parsableByteArray))) {
                this.b = new h();
            } else if (f.o(c(parsableByteArray))) {
                this.b = new f();
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.a = output;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        Assertions.checkStateNotNull(this.a);
        if (this.b == null) {
            if (!d(input)) {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            input.resetPeekPosition();
        }
        if (!this.c) {
            TrackOutput trackOutputTrack = this.a.track(0, 1);
            this.a.endTracks();
            this.b.d(this.a, trackOutputTrack);
            this.c = true;
        }
        return this.b.g(input, seekPosition);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        g gVar = this.b;
        if (gVar != null) {
            gVar.m(position, timeUs);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        try {
            return d(input);
        } catch (ParserException unused) {
            return false;
        }
    }
}
