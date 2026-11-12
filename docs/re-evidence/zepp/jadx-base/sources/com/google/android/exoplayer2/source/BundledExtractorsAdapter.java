package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {
    private final ExtractorsFactory a;

    @Nullable
    private Extractor b;

    @Nullable
    private ExtractorInput c;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.a = extractorsFactory;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.b;
        if (extractor instanceof Mp3Extractor) {
            ((Mp3Extractor) extractor).disableSeeking();
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.c;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> responseHeaders, long position, long length, ExtractorOutput output) throws IOException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataReader, position, length);
        this.c = defaultExtractorInput;
        if (this.b != null) {
            return;
        }
        Extractor[] extractorArrCreateExtractors = this.a.createExtractors(uri, responseHeaders);
        if (extractorArrCreateExtractors.length == 1) {
            this.b = extractorArrCreateExtractors[0];
        } else {
            for (Extractor extractor : extractorArrCreateExtractors) {
                try {
                    if (extractor.sniff(defaultExtractorInput)) {
                        this.b = extractor;
                        Assertions.checkState(true);
                        defaultExtractorInput.resetPeekPosition();
                        break;
                    } else {
                        boolean z = this.b != null || defaultExtractorInput.getPosition() == position;
                        Assertions.checkState(z);
                        defaultExtractorInput.resetPeekPosition();
                    }
                } catch (EOFException unused) {
                    if (this.b != null || defaultExtractorInput.getPosition() == position) {
                    }
                } catch (Throwable th) {
                    Assertions.checkState(this.b != null || defaultExtractorInput.getPosition() == position);
                    defaultExtractorInput.resetPeekPosition();
                    throw th;
                }
                Assertions.checkState(z);
                defaultExtractorInput.resetPeekPosition();
            }
            if (this.b == null) {
                String commaDelimitedSimpleClassNames = Util.getCommaDelimitedSimpleClassNames(extractorArrCreateExtractors);
                StringBuilder sb = new StringBuilder(String.valueOf(commaDelimitedSimpleClassNames).length() + 58);
                sb.append("None of the available extractors (");
                sb.append(commaDelimitedSimpleClassNames);
                sb.append(") could read the stream.");
                throw new UnrecognizedInputFormatException(sb.toString(), (Uri) Assertions.checkNotNull(uri));
            }
        }
        this.b.init(output);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        return ((Extractor) Assertions.checkNotNull(this.b)).read((ExtractorInput) Assertions.checkNotNull(this.c), positionHolder);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.b;
        if (extractor != null) {
            extractor.release();
            this.b = null;
        }
        this.c = null;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void seek(long position, long seekTimeUs) {
        ((Extractor) Assertions.checkNotNull(this.b)).seek(position, seekTimeUs);
    }
}
