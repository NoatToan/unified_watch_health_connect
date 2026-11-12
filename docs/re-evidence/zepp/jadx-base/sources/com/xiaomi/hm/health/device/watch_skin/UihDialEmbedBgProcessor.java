package com.xiaomi.hm.health.device.watch_skin;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.device.firmware.FwFileUtilsKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/UihDialEmbedBgProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "originPath", "process", "a", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "processor", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class UihDialEmbedBgProcessor implements IDialProcessor {
    private static final int b = 40;
    private static final int c = 11;
    private static final int d = 4;
    private static final int e = 22;
    private static final int f = 4;
    private static final int g = 32;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    public UihDialEmbedBgProcessor(@NotNull IDialProcessor iDialProcessor) {
        this.processor = iDialProcessor;
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
        File file = new File(originPath);
        String str = originPath + ".dial";
        File file2 = new File(str);
        if (file2.exists()) {
            file2.delete();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[40];
        if (fileInputStream.read(bArr) < 40) {
            throw new IOException("No enough uih header");
        }
        byte[] bArr2 = new byte[4096];
        while (true) {
            int i = fileInputStream.read(bArr2);
            if (i == -1) {
                break;
            }
            fileOutputStream.write(bArr2, 0, i);
        }
        fileOutputStream.close();
        fileInputStream.close();
        String strProcess = this.processor.process(str);
        String str2 = strProcess + ".uih";
        File file3 = new File(str2);
        if (file3.exists()) {
            file3.delete();
        }
        FileInputStream fileInputStream2 = new FileInputStream(new File(strProcess));
        long originSize = this.processor.getOriginSize();
        int iAvailable = fileInputStream2.available();
        long crc32 = FwFileUtilsKt.getCrc32(strProcess);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
        fileOutputStream2.write(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 11)));
        fileOutputStream2.write(GattUtils.intToBytes((int) crc32));
        fileOutputStream2.write(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(16, 21)));
        fileOutputStream2.write(GattUtils.intToBytes(iAvailable));
        fileOutputStream2.write(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(26, 31)));
        fileOutputStream2.write(GattUtils.intToBytes((int) originSize));
        fileOutputStream2.write(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(36, 39)));
        while (true) {
            int i2 = fileInputStream2.read(bArr2);
            if (i2 == -1) {
                fileOutputStream2.close();
                fileInputStream2.close();
                return str2;
            }
            fileOutputStream2.write(bArr2, 0, i2);
        }
    }
}
