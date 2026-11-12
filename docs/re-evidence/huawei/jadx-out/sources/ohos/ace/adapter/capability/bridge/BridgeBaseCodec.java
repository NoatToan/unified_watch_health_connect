package ohos.ace.adapter.capability.bridge;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public interface BridgeBaseCodec<T> {
    T decodeData(ByteBuffer byteBuffer);

    ByteBuffer encodeData(T t);
}
