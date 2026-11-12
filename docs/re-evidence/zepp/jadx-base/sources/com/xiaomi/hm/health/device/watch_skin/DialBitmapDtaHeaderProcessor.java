package com.xiaomi.hm.health.device.watch_skin;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.device.watchskinnew.AndroidBmpUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialBitmapDtaHeaderProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "originPath", "process", "a", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "processor", "", "b", LogUtil.I, "headerSize", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialBitmapDtaHeaderProcessor implements IDialProcessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = 24;
    private static final int d = 54;
    private static final int e = 66;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int headerSize;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialBitmapDtaHeaderProcessor$Companion;", "", "", "DTA_HEAD_SIZE", LogUtil.I, "getDTA_HEAD_SIZE", "()I", "BMP_HEAD_SIZE", "getBMP_HEAD_SIZE", "BMP_565_HEAD_SIZE", "getBMP_565_HEAD_SIZE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getBMP_565_HEAD_SIZE() {
            return DialBitmapDtaHeaderProcessor.e;
        }

        public final int getBMP_HEAD_SIZE() {
            return DialBitmapDtaHeaderProcessor.d;
        }

        public final int getDTA_HEAD_SIZE() {
            return DialBitmapDtaHeaderProcessor.c;
        }
    }

    public DialBitmapDtaHeaderProcessor(@NotNull IDialProcessor iDialProcessor, int i) {
        this.processor = iDialProcessor;
        this.headerSize = i;
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) throws IOException {
        String strProcess = this.processor.process(originPath);
        FileInputStream fileInputStream = new FileInputStream(strProcess);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((fileInputStream.available() - this.headerSize) + c);
        byte[] bArr = new byte[this.headerSize];
        fileInputStream.read(bArr);
        byteBufferAllocate.put(bArr[0]);
        byteBufferAllocate.put(bArr[1]);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(18, 25)));
        byteBufferAllocate.put(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(28, 29)));
        byteBufferAllocate.put(AndroidBmpUtil.writeShort((short) 0));
        byteBufferAllocate.put(AndroidBmpUtil.writeInt(24));
        byteBufferAllocate.put(AndroidBmpUtil.writeInt(1));
        byte[] bArr2 = new byte[4096];
        while (true) {
            int i = fileInputStream.read(bArr2);
            if (i == -1) {
                String str = strProcess + ".dta";
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                fileOutputStream.write(byteBufferAllocate.array());
                fileInputStream.close();
                fileOutputStream.close();
                new File(strProcess).delete();
                return str;
            }
            byteBufferAllocate.put(bArr2, 0, i);
        }
    }

    public /* synthetic */ DialBitmapDtaHeaderProcessor(IDialProcessor iDialProcessor, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iDialProcessor, (i2 & 2) != 0 ? d : i);
    }
}
