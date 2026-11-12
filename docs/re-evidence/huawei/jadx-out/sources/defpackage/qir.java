package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes43.dex */
public class qir {
    public static FloatBuffer c(float[] fArr) {
        if (fArr == null) {
            qid.e("ArrayToBufferHelper", "floatArrayToBuffer arrays should not be null.");
            throw new RuntimeException("ArrayToBufferHelper floatArrayToBuffer arrays should not be null");
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }
}
