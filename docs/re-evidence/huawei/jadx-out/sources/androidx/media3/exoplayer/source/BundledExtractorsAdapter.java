package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import defpackage.aml;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {
    private Extractor extractor;
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput) throws IOException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataReader, j, j2);
        this.extractorInput = defaultExtractorInput;
        if (this.extractor != null) {
            return;
        }
        Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors(uri, map);
        ImmutableList.c cVarBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(extractorArrCreateExtractors.length);
        boolean z = true;
        if (extractorArrCreateExtractors.length == 1) {
            this.extractor = extractorArrCreateExtractors[0];
        } else {
            for (Extractor extractor : extractorArrCreateExtractors) {
                try {
                    if (extractor.sniff(defaultExtractorInput)) {
                        this.extractor = extractor;
                        if (extractor == null && defaultExtractorInput.getPosition() != j) {
                            z = false;
                        }
                        Assertions.checkState(z);
                        defaultExtractorInput.resetPeekPosition();
                        break;
                    }
                    cVarBuilderWithExpectedSize.addAll(extractor.getSniffFailureDetails());
                    boolean z2 = this.extractor != null || defaultExtractorInput.getPosition() == j;
                    Assertions.checkState(z2);
                    defaultExtractorInput.resetPeekPosition();
                } catch (EOFException unused) {
                    if (this.extractor != null || defaultExtractorInput.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    if (this.extractor == null && defaultExtractorInput.getPosition() != j) {
                        z = false;
                    }
                    Assertions.checkState(z);
                    defaultExtractorInput.resetPeekPosition();
                    throw th;
                }
                Assertions.checkState(z2);
                defaultExtractorInput.resetPeekPosition();
            }
            if (this.extractor == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + Joiner.on(", ").join(aml.a((List) ImmutableList.copyOf(extractorArrCreateExtractors), new Function() { // from class: androidx.media3.exoplayer.source.BundledExtractorsAdapter$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return ((Extractor) obj).getUnderlyingImplementation().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) Assertions.checkNotNull(uri), cVarBuilderWithExpectedSize.build());
            }
        }
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof Mp3Extractor) {
            ((Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        ((Extractor) Assertions.checkNotNull(this.extractor)).seek(j, j2);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        return ((Extractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), positionHolder);
    }
}
