package com.mapbox.common.module.cronet;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Buffer;
import com.mapbox.common.ReadStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p005kotlin.Metadata;
import vb.h;
import w63.e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/common/ReadStream;", "Lw63/e;", "toOkioBuffer", "(Lcom/mapbox/common/ReadStream;)Lw63/e;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "callbackExecutor", "Ljava/util/concurrent/ExecutorService;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CronetClientDetailKt {
    private static final ExecutorService callbackExecutor = Executors.newSingleThreadExecutor();

    /* JADX INFO: Access modifiers changed from: private */
    public static final e toOkioBuffer(ReadStream readStream) throws IOException {
        e eVar = new e();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4096);
        Buffer buffer = new Buffer(new DataRef(byteBufferAllocateDirect));
        while (!readStream.getExhausted()) {
            byteBufferAllocateDirect.clear();
            Expected<String, Long> expected = readStream.read(buffer);
            expected.getClass();
            if (!expected.isValue()) {
                String error = expected.getError();
                error.getClass();
                h.C(error);
                return null;
            }
            Long value = expected.getValue();
            value.getClass();
            byteBufferAllocateDirect.limit((int) value.longValue());
            eVar.write(byteBufferAllocateDirect);
        }
        return eVar;
    }
}
