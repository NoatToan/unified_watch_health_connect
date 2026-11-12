package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Splitter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
final class e {
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 2192;
    private static final int i = 2816;
    private static final int j = 2817;
    private static final int k = 2819;
    private static final int l = 2820;
    private static final String m = "SefReader";
    private static final int n = 1397048916;
    private static final int o = 12;
    private static final int p = 8;
    private static final int q = 12;
    private static final Splitter r = Splitter.on(JsonLexerKt.COLON);
    private static final Splitter s = Splitter.on('*');
    private final List<a> a = new ArrayList();
    private int b = 0;
    private int c;

    public static final class a {
        public final int a;
        public final long b;
        public final int c;

        public a(int dataType, long startOffset, int size) {
            this.a = dataType;
            this.b = startOffset;
            this.c = size;
        }
    }

    private void a(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        input.readFully(parsableByteArray.getData(), 0, 8);
        this.c = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != n) {
            seekPosition.position = 0L;
        } else {
            seekPosition.position = input.getPosition() - ((long) (this.c - 12));
            this.b = 2;
        }
    }

    private static int b(String name) throws ParserException {
        name.hashCode();
        switch (name) {
            case "SlowMotion_Data":
                return h;
            case "Super_SlowMotion_Edit_Data":
                return k;
            case "Super_SlowMotion_Data":
                return i;
            case "Super_SlowMotion_Deflickering_On":
                return l;
            case "Super_SlowMotion_BGM":
                return j;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    private void d(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        long length = input.getLength();
        int i2 = (this.c - 12) - 8;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i2);
        input.readFully(parsableByteArray.getData(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            parsableByteArray.skipBytes(2);
            short littleEndianShort = parsableByteArray.readLittleEndianShort();
            if (littleEndianShort == h || littleEndianShort == i || littleEndianShort == j || littleEndianShort == k || littleEndianShort == l) {
                this.a.add(new a(littleEndianShort, (length - ((long) this.c)) - ((long) parsableByteArray.readLittleEndianInt()), parsableByteArray.readLittleEndianInt()));
            } else {
                parsableByteArray.skipBytes(8);
            }
        }
        if (this.a.isEmpty()) {
            seekPosition.position = 0L;
        } else {
            this.b = 3;
            seekPosition.position = this.a.get(0).b;
        }
    }

    private void e(ExtractorInput input, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
        long position = input.getPosition();
        int length = (int) ((input.getLength() - input.getPosition()) - ((long) this.c));
        ParsableByteArray parsableByteArray = new ParsableByteArray(length);
        input.readFully(parsableByteArray.getData(), 0, length);
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            a aVar = this.a.get(i2);
            parsableByteArray.setPosition((int) (aVar.b - position));
            parsableByteArray.skipBytes(4);
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int iB = b(parsableByteArray.readString(littleEndianInt));
            int i3 = aVar.c - (littleEndianInt + 8);
            if (iB == h) {
                slowMotionMetadataEntries.add(f(parsableByteArray, i3));
            } else if (iB != i && iB != j && iB != k && iB != l) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData f(ParsableByteArray data, int dataLength) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = s.splitToList(data.readString(dataLength));
        for (int i2 = 0; i2 < listSplitToList.size(); i2++) {
            List<String> listSplitToList2 = r.splitToList(listSplitToList.get(i2));
            if (listSplitToList2.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (NumberFormatException e2) {
                throw ParserException.createForMalformedContainer(null, e2);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int c(ExtractorInput input, PositionHolder seekPosition, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
        int i2 = this.b;
        long j2 = 0;
        if (i2 == 0) {
            long length = input.getLength();
            if (length != -1 && length >= 8) {
                j2 = length - 8;
            }
            seekPosition.position = j2;
            this.b = 1;
        } else if (i2 == 1) {
            a(input, seekPosition);
        } else if (i2 == 2) {
            d(input, seekPosition);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException();
            }
            e(input, slowMotionMetadataEntries);
            seekPosition.position = 0L;
        }
        return 1;
    }

    public void g() {
        this.a.clear();
        this.b = 0;
    }
}
