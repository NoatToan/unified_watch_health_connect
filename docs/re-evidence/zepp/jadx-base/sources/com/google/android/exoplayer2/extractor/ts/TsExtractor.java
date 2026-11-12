package com.google.android.exoplayer2.extractor.ts;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class TsExtractor implements Extractor {
    private static final int A = 5;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: mz7
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return TsExtractor.s();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    public static final int TS_PACKET_SIZE = 188;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private static final int t = 0;
    private static final int u = 8192;
    private static final long v = 1094921523;
    private static final long w = 1161904947;
    private static final long x = 1094921524;
    private static final long y = 1212503619;
    private static final int z = 9400;
    private final int a;
    private final int b;
    private final List<TimestampAdjuster> c;
    private final ParsableByteArray d;
    private final SparseIntArray e;
    private final TsPayloadReader.Factory f;
    private final SparseArray<TsPayloadReader> g;
    private final SparseBooleanArray h;
    private final SparseBooleanArray i;
    private final e j;
    private d k;
    private ExtractorOutput l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private TsPayloadReader q;
    private int r;
    private int s;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class a implements SectionPayloadReader {
        private final ParsableBitArray a = new ParsableBitArray(new byte[4]);

        public a() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray sectionData) {
            if (sectionData.readUnsignedByte() == 0 && (sectionData.readUnsignedByte() & 128) != 0) {
                sectionData.skipBytes(6);
                int iBytesLeft = sectionData.bytesLeft() / 4;
                for (int i = 0; i < iBytesLeft; i++) {
                    sectionData.readBytes(this.a, 4);
                    int bits = this.a.readBits(16);
                    this.a.skipBits(3);
                    if (bits == 0) {
                        this.a.skipBits(13);
                    } else {
                        int bits2 = this.a.readBits(13);
                        if (TsExtractor.this.g.get(bits2) == null) {
                            TsExtractor.this.g.put(bits2, new SectionReader(TsExtractor.this.new b(bits2)));
                            TsExtractor.g(TsExtractor.this);
                        }
                    }
                }
                if (TsExtractor.this.a != 2) {
                    TsExtractor.this.g.remove(0);
                }
            }
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        }
    }

    public class b implements SectionPayloadReader {
        private static final int f = 5;
        private static final int g = 10;
        private static final int h = 106;
        private static final int i = 111;
        private static final int j = 122;
        private static final int k = 123;
        private static final int l = 127;
        private static final int m = 89;
        private static final int n = 21;
        private final ParsableBitArray a = new ParsableBitArray(new byte[5]);
        private final SparseArray<TsPayloadReader> b = new SparseArray<>();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int pid) {
            this.d = pid;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0046  */
        /* JADX WARN: Code duplicated, block: B:24:0x0058  */
        /* JADX WARN: Code duplicated, block: B:27:0x005f  */
        private TsPayloadReader.EsInfo a(ParsableByteArray data, int length) {
            int position = data.getPosition();
            int i2 = length + position;
            String strTrim = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (data.getPosition() < i2) {
                int unsignedByte = data.readUnsignedByte();
                int position2 = data.getPosition() + data.readUnsignedByte();
                if (position2 > i2) {
                    break;
                }
                if (unsignedByte == 5) {
                    long unsignedInt = data.readUnsignedInt();
                    if (unsignedInt == TsExtractor.v) {
                        i3 = 129;
                    } else if (unsignedInt == TsExtractor.w) {
                        i3 = 135;
                    } else if (unsignedInt == TsExtractor.x) {
                        i3 = 172;
                    } else if (unsignedInt == TsExtractor.y) {
                        i3 = 36;
                    }
                } else if (unsignedByte == 106) {
                    i3 = 129;
                } else if (unsignedByte == 122) {
                    i3 = 135;
                } else if (unsignedByte == 127) {
                    if (data.readUnsignedByte() == 21) {
                        i3 = 172;
                    }
                } else if (unsignedByte == 123) {
                    i3 = 138;
                } else if (unsignedByte == 10) {
                    strTrim = data.readString(3).trim();
                } else if (unsignedByte == 89) {
                    arrayList = new ArrayList();
                    while (data.getPosition() < position2) {
                        String strTrim2 = data.readString(3).trim();
                        int unsignedByte2 = data.readUnsignedByte();
                        byte[] bArr = new byte[4];
                        data.readBytes(bArr, 0, 4);
                        arrayList.add(new TsPayloadReader.DvbSubtitleInfo(strTrim2, unsignedByte2, bArr));
                    }
                    i3 = 89;
                } else if (unsignedByte == 111) {
                    i3 = 257;
                }
                data.skipBytes(position2 - data.getPosition());
            }
            data.setPosition(i2);
            return new TsPayloadReader.EsInfo(i3, strTrim, arrayList, Arrays.copyOfRange(data.getData(), position, i2));
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray sectionData) {
            TimestampAdjuster timestampAdjuster;
            if (sectionData.readUnsignedByte() != 2) {
                return;
            }
            if (TsExtractor.this.a == 1 || TsExtractor.this.a == 2 || TsExtractor.this.m == 1) {
                timestampAdjuster = (TimestampAdjuster) TsExtractor.this.c.get(0);
            } else {
                timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.this.c.get(0)).getFirstSampleTimestampUs());
                TsExtractor.this.c.add(timestampAdjuster);
            }
            if ((sectionData.readUnsignedByte() & 128) == 0) {
                return;
            }
            sectionData.skipBytes(1);
            int unsignedShort = sectionData.readUnsignedShort();
            int i2 = 3;
            sectionData.skipBytes(3);
            sectionData.readBytes(this.a, 2);
            this.a.skipBits(3);
            int i3 = 13;
            TsExtractor.this.s = this.a.readBits(13);
            sectionData.readBytes(this.a, 2);
            int i4 = 4;
            this.a.skipBits(4);
            sectionData.skipBytes(this.a.readBits(12));
            if (TsExtractor.this.a == 2 && TsExtractor.this.q == null) {
                TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(21, null, null, Util.EMPTY_BYTE_ARRAY);
                TsExtractor tsExtractor = TsExtractor.this;
                tsExtractor.q = tsExtractor.f.createPayloadReader(21, esInfo);
                TsExtractor.this.q.init(timestampAdjuster, TsExtractor.this.l, new TsPayloadReader.TrackIdGenerator(unsignedShort, 21, 8192));
            }
            this.b.clear();
            this.c.clear();
            int iBytesLeft = sectionData.bytesLeft();
            while (iBytesLeft > 0) {
                sectionData.readBytes(this.a, 5);
                int bits = this.a.readBits(8);
                this.a.skipBits(i2);
                int bits2 = this.a.readBits(i3);
                this.a.skipBits(i4);
                int bits3 = this.a.readBits(12);
                TsPayloadReader.EsInfo esInfoA = a(sectionData, bits3);
                if (bits == 6 || bits == 5) {
                    bits = esInfoA.streamType;
                }
                iBytesLeft -= bits3 + 5;
                int i5 = TsExtractor.this.a == 2 ? bits : bits2;
                if (!TsExtractor.this.h.get(i5)) {
                    TsPayloadReader tsPayloadReaderCreatePayloadReader = (TsExtractor.this.a == 2 && bits == 21) ? TsExtractor.this.q : TsExtractor.this.f.createPayloadReader(bits, esInfoA);
                    if (TsExtractor.this.a != 2 || bits2 < this.c.get(i5, 8192)) {
                        this.c.put(i5, bits2);
                        this.b.put(i5, tsPayloadReaderCreatePayloadReader);
                    }
                }
                i2 = 3;
                i4 = 4;
                i3 = 13;
            }
            int size = this.c.size();
            for (int i6 = 0; i6 < size; i6++) {
                int iKeyAt = this.c.keyAt(i6);
                int iValueAt = this.c.valueAt(i6);
                TsExtractor.this.h.put(iKeyAt, true);
                TsExtractor.this.i.put(iValueAt, true);
                TsPayloadReader tsPayloadReaderValueAt = this.b.valueAt(i6);
                if (tsPayloadReaderValueAt != null) {
                    if (tsPayloadReaderValueAt != TsExtractor.this.q) {
                        tsPayloadReaderValueAt.init(timestampAdjuster, TsExtractor.this.l, new TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                    }
                    TsExtractor.this.g.put(iValueAt, tsPayloadReaderValueAt);
                }
            }
            if (TsExtractor.this.a == 2) {
                if (TsExtractor.this.n) {
                    return;
                }
                TsExtractor.this.l.endTracks();
                TsExtractor.this.m = 0;
                TsExtractor.this.n = true;
                return;
            }
            TsExtractor.this.g.remove(this.d);
            TsExtractor tsExtractor2 = TsExtractor.this;
            tsExtractor2.m = tsExtractor2.a == 1 ? 0 : TsExtractor.this.m - 1;
            if (TsExtractor.this.m == 0) {
                TsExtractor.this.l.endTracks();
                TsExtractor.this.n = true;
            }
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        }
    }

    public TsExtractor() {
        this(0);
    }

    public static /* synthetic */ int g(TsExtractor tsExtractor) {
        int i = tsExtractor.m;
        tsExtractor.m = i + 1;
        return i;
    }

    private boolean q(ExtractorInput input) throws IOException {
        byte[] data = this.d.getData();
        if (9400 - this.d.getPosition() < 188) {
            int iBytesLeft = this.d.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.d.getPosition(), data, 0, iBytesLeft);
            }
            this.d.reset(data, iBytesLeft);
        }
        while (this.d.bytesLeft() < 188) {
            int iLimit = this.d.limit();
            int i = input.read(data, iLimit, 9400 - iLimit);
            if (i == -1) {
                return false;
            }
            this.d.setLimit(iLimit + i);
        }
        return true;
    }

    private int r() throws ParserException {
        int position = this.d.getPosition();
        int iLimit = this.d.limit();
        int iFindSyncBytePosition = TsUtil.findSyncBytePosition(this.d.getData(), position, iLimit);
        this.d.setPosition(iFindSyncBytePosition);
        int i = iFindSyncBytePosition + 188;
        if (i > iLimit) {
            int i2 = this.r + (iFindSyncBytePosition - position);
            this.r = i2;
            if (this.a == 2 && i2 > 376) {
                throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.r = 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] s() {
        return new Extractor[]{new TsExtractor()};
    }

    private void t(long inputLength) {
        if (this.o) {
            return;
        }
        this.o = true;
        if (this.j.b() == C.TIME_UNSET) {
            this.l.seekMap(new SeekMap.Unseekable(this.j.b()));
            return;
        }
        d dVar = new d(this.j.c(), this.j.b(), inputLength, this.s, this.b);
        this.k = dVar;
        this.l.seekMap(dVar.getSeekMap());
    }

    private void u() {
        this.h.clear();
        this.g.clear();
        SparseArray<TsPayloadReader> sparseArrayCreateInitialPayloadReaders = this.f.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.g.put(sparseArrayCreateInitialPayloadReaders.keyAt(i), sparseArrayCreateInitialPayloadReaders.valueAt(i));
        }
        this.g.put(0, new SectionReader(new a()));
        this.q = null;
    }

    private boolean v(int packetPid) {
        return this.a == 2 || this.n || !this.i.get(packetPid, false);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.l = output;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        long length = input.getLength();
        if (this.n) {
            if (((length == -1 || this.a == 2) ? false : true) && !this.j.d()) {
                return this.j.e(input, seekPosition, this.s);
            }
            t(length);
            if (this.p) {
                this.p = false;
                seek(0L, 0L);
                if (input.getPosition() != 0) {
                    seekPosition.position = 0L;
                    return 1;
                }
            }
            d dVar = this.k;
            if (dVar != null && dVar.isSeeking()) {
                return this.k.handlePendingSeek(input, seekPosition);
            }
        }
        if (!q(input)) {
            return -1;
        }
        int iR = r();
        int iLimit = this.d.limit();
        if (iR > iLimit) {
            return 0;
        }
        int i = this.d.readInt();
        if ((8388608 & i) != 0) {
            this.d.setPosition(iR);
            return 0;
        }
        int i2 = ((4194304 & i) != 0 ? 1 : 0) | 0;
        int i3 = (2096896 & i) >> 8;
        boolean z2 = (i & 32) != 0;
        TsPayloadReader tsPayloadReader = (i & 16) != 0 ? this.g.get(i3) : null;
        if (tsPayloadReader == null) {
            this.d.setPosition(iR);
            return 0;
        }
        if (this.a != 2) {
            int i4 = i & 15;
            int i5 = this.e.get(i3, i4 - 1);
            this.e.put(i3, i4);
            if (i5 == i4) {
                this.d.setPosition(iR);
                return 0;
            }
            if (i4 != ((i5 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        }
        if (z2) {
            int unsignedByte = this.d.readUnsignedByte();
            i2 |= (this.d.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.d.skipBytes(unsignedByte - 1);
        }
        boolean z3 = this.n;
        if (v(i3)) {
            this.d.setLimit(iR);
            tsPayloadReader.consume(this.d, i2);
            this.d.setLimit(iLimit);
        }
        if (this.a != 2 && !z3 && this.n && length != -1) {
            this.p = true;
        }
        this.d.setPosition(iR);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        d dVar;
        Assertions.checkState(this.a != 2);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            TimestampAdjuster timestampAdjuster = this.c.get(i);
            boolean z2 = timestampAdjuster.getTimestampOffsetUs() == C.TIME_UNSET;
            if (!z2) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                z2 = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == timeUs) ? false : true;
            }
            if (z2) {
                timestampAdjuster.reset(timeUs);
            }
        }
        if (timeUs != 0 && (dVar = this.k) != null) {
            dVar.setSeekTargetUs(timeUs);
        }
        this.d.reset(0);
        this.e.clear();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.g.valueAt(i2).seek();
        }
        this.r = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        boolean z2;
        byte[] data = this.d.getData();
        input.peekFully(data, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z2 = true;
                    break;
                }
                if (data[(i2 * 188) + i] != 71) {
                    z2 = false;
                    break;
                }
                i2++;
            }
            if (z2) {
                input.skipFully(i);
                return true;
            }
        }
        return false;
    }

    public TsExtractor(int defaultTsPayloadReaderFlags) {
        this(1, defaultTsPayloadReaderFlags, DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public TsExtractor(int mode, int defaultTsPayloadReaderFlags, int timestampSearchBytes) {
        this(mode, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(defaultTsPayloadReaderFlags), timestampSearchBytes);
    }

    public TsExtractor(int mode, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory payloadReaderFactory) {
        this(mode, timestampAdjuster, payloadReaderFactory, DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public TsExtractor(int mode, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory payloadReaderFactory, int timestampSearchBytes) {
        this.f = (TsPayloadReader.Factory) Assertions.checkNotNull(payloadReaderFactory);
        this.b = timestampSearchBytes;
        this.a = mode;
        if (mode != 1 && mode != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.c = Collections.singletonList(timestampAdjuster);
        }
        this.d = new ParsableByteArray(new byte[z], 0);
        this.h = new SparseBooleanArray();
        this.i = new SparseBooleanArray();
        this.g = new SparseArray<>();
        this.e = new SparseIntArray();
        this.j = new e(timestampSearchBytes);
        this.s = -1;
        u();
    }
}
