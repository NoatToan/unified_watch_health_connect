package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.webvtt.WebvttParserUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttExtractor implements Extractor {
    private static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    private static final int i = 6;
    private static final int j = 9;

    @Nullable
    private final String a;
    private final TimestampAdjuster b;
    private ExtractorOutput d;
    private int f;
    private final ParsableByteArray c = new ParsableByteArray();
    private byte[] e = new byte[1024];

    public WebvttExtractor(@Nullable String language, TimestampAdjuster timestampAdjuster) {
        this.a = language;
        this.b = timestampAdjuster;
    }

    @RequiresNonNull({"output"})
    private TrackOutput a(long subsampleOffsetUs) {
        TrackOutput trackOutputTrack = this.d.track(0, 3);
        trackOutputTrack.format(new Format.Builder().setSampleMimeType(MimeTypes.TEXT_VTT).setLanguage(this.a).setSubsampleOffsetUs(subsampleOffsetUs).build());
        this.d.endTracks();
        return trackOutputTrack;
    }

    @RequiresNonNull({"output"})
    private void b() throws ParserException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.e);
        WebvttParserUtil.validateWebvttHeaderLine(parsableByteArray);
        long jPtsToUs = 0;
        long timestampUs = 0;
        for (String line = parsableByteArray.readLine(); !TextUtils.isEmpty(line); line = parsableByteArray.readLine()) {
            if (line.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = g.matcher(line);
                if (!matcher.find()) {
                    throw ParserException.createForMalformedContainer(line.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(line) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "), null);
                }
                Matcher matcher2 = h.matcher(line);
                if (!matcher2.find()) {
                    throw ParserException.createForMalformedContainer(line.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(line) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "), null);
                }
                timestampUs = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(1)));
                jPtsToUs = TimestampAdjuster.ptsToUs(Long.parseLong((String) Assertions.checkNotNull(matcher2.group(1))));
            }
        }
        Matcher matcherFindNextCueHeader = WebvttParserUtil.findNextCueHeader(parsableByteArray);
        if (matcherFindNextCueHeader == null) {
            a(0L);
            return;
        }
        long timestampUs2 = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcherFindNextCueHeader.group(1)));
        long jAdjustTsTimestamp = this.b.adjustTsTimestamp(TimestampAdjuster.usToWrappedPts((jPtsToUs + timestampUs2) - timestampUs));
        TrackOutput trackOutputA = a(jAdjustTsTimestamp - timestampUs2);
        this.c.reset(this.e, this.f);
        trackOutputA.sampleData(this.c, this.f);
        trackOutputA.sampleMetadata(jAdjustTsTimestamp, 1, this.f, 0, null);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.d = output;
        output.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        Assertions.checkNotNull(this.d);
        int length = (int) input.getLength();
        int i2 = this.f;
        byte[] bArr = this.e;
        if (i2 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i3 = this.f;
        int i4 = input.read(bArr2, i3, bArr2.length - i3);
        if (i4 != -1) {
            int i5 = this.f + i4;
            this.f = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        b();
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        input.peekFully(this.e, 0, 6, false);
        this.c.reset(this.e, 6);
        if (WebvttParserUtil.isWebvttHeaderLine(this.c)) {
            return true;
        }
        input.peekFully(this.e, 6, 3, false);
        this.c.reset(this.e, 9);
        return WebvttParserUtil.isWebvttHeaderLine(this.c);
    }
}
