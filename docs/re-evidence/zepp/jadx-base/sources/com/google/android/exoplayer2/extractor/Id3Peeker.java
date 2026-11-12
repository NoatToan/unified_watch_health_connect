package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class Id3Peeker {
    private final ParsableByteArray a = new ParsableByteArray(10);

    @Nullable
    public Metadata peekId3Data(ExtractorInput input, @Nullable Id3Decoder.FramePredicate id3FramePredicate) throws IOException {
        Metadata metadataDecode = null;
        int i = 0;
        while (true) {
            try {
                input.peekFully(this.a.getData(), 0, 10);
                this.a.setPosition(0);
                if (this.a.readUnsignedInt24() != 4801587) {
                    break;
                }
                this.a.skipBytes(3);
                int synchSafeInt = this.a.readSynchSafeInt();
                int i2 = synchSafeInt + 10;
                if (metadataDecode == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.getData(), 0, bArr, 0, 10);
                    input.peekFully(bArr, 10, synchSafeInt);
                    metadataDecode = new Id3Decoder(id3FramePredicate).decode(bArr, i2);
                } else {
                    input.advancePeekPosition(synchSafeInt);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        input.resetPeekPosition();
        input.advancePeekPosition(i);
        return metadataDecode;
    }
}
