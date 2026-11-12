package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DvbDecoder extends SimpleSubtitleDecoder {
    private final a o;

    public DvbDecoder(List<byte[]> initializationData) {
        super("DvbDecoder");
        ParsableByteArray parsableByteArray = new ParsableByteArray(initializationData.get(0));
        this.o = new a(parsableByteArray.readUnsignedShort(), parsableByteArray.readUnsignedShort());
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] data, int length, boolean reset) {
        if (reset) {
            this.o.r();
        }
        return new b(this.o.b(data, length));
    }
}
