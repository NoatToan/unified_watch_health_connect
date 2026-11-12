package androidx.media3.muxer;

import androidx.media3.common.util.Assertions;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public interface AnnexBToAvccConverter {
    public static final AnnexBToAvccConverter DEFAULT = new AnnexBToAvccConverter() { // from class: androidx.media3.muxer.AnnexBToAvccConverter$$ExternalSyntheticLambda0
        @Override // androidx.media3.muxer.AnnexBToAvccConverter
        public final ByteBuffer process(ByteBuffer byteBuffer) {
            return AnnexBToAvccConverter.lambda$static$0(byteBuffer);
        }
    };

    ByteBuffer process(ByteBuffer byteBuffer);

    static /* synthetic */ ByteBuffer lambda$static$0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        Assertions.checkArgument(byteBuffer.position() == 0, "The input buffer should have position set to 0.");
        ImmutableList<ByteBuffer> immutableListFindNalUnits = AnnexBUtils.findNalUnits(byteBuffer);
        int iRemaining = 0;
        for (int i = 0; i < immutableListFindNalUnits.size(); i++) {
            iRemaining += immutableListFindNalUnits.get(i).remaining() + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        for (int i2 = 0; i2 < immutableListFindNalUnits.size(); i2++) {
            ByteBuffer byteBuffer2 = immutableListFindNalUnits.get(i2);
            byteBufferAllocate.putInt(byteBuffer2.remaining());
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }
}
