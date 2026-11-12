package com.xiaomi.hm.health.device.watch_skin;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B)\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialEmbedKongmingBgProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "originPath", "process", "a", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "processor", "b", "Ljava/lang/String;", "bgPath", "c", "previewBmpPath", "", GoogleApiAvailabilityLight.a, LogUtil.I, "bmpType", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialEmbedKongmingBgProcessor implements IDialProcessor {
    public static final int CACHE_SIZE = 4096;
    public static final long INDEX_BG_KONGMING_SET = 45;
    public static final long INDEX_BG_KONGMING_SIZE_END = 52;
    public static final long INDEX_BG_KONGMING_SIZE_START = 49;
    public static final long INDEX_BG_KONGMING_SIZE_TYPE = 53;
    public static final long INDEX_KONGMING_PREVIEW_OFFSET_END = 40;
    public static final long INDEX_KONGMING_PREVIEW_OFFSET_START = 37;
    public static final long INDEX_KONGMING_PREVIEW_SIZE_END = 44;
    public static final long INDEX_KONGMING_PREVIEW_SIZE_START = 41;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String bgPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String previewBmpPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int bmpType;

    public DialEmbedKongmingBgProcessor(@Nullable IDialProcessor iDialProcessor, @NotNull String str, @NotNull String str2, int i) {
        this.processor = iDialProcessor;
        this.bgPath = str;
        this.previewBmpPath = str2;
        this.bmpType = i;
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
        FileOutputStream fileOutputStream;
        File parentFile;
        IDialProcessor iDialProcessor = this.processor;
        String strProcess = iDialProcessor == null ? null : iDialProcessor.process(originPath);
        File file = new File(this.bgPath);
        long length = file.length();
        long length2 = new File(this.previewBmpPath).length();
        FileInputStream fileInputStream = new FileInputStream(new File(strProcess));
        fileInputStream.skip(45L);
        byte[] bArr = new byte[4];
        fileInputStream.read(bArr, 0, 4);
        int iBytesToInt = GattUtils.bytesToInt(bArr, 0, 4);
        fileInputStream.close();
        FileInputStream fileInputStream2 = new FileInputStream(new File(strProcess));
        FileInputStream fileInputStream3 = new FileInputStream(file);
        FileInputStream fileInputStream4 = new FileInputStream(this.previewBmpPath);
        FileUtils.getAppFileDir(DeviceXFunctionsKt.getContext());
        File file2 = new File(WatchSkinManager.getDialBinPath(DeviceXFunctionsKt.getContext()));
        if (file2.exists()) {
            file2.delete();
        }
        File parentFile2 = file2.getParentFile();
        if (((parentFile2 == null || parentFile2.exists()) ? false : true) && (parentFile = file2.getParentFile()) != null) {
            parentFile.mkdir();
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
        byte[] bArrLongToBytes = GattUtils.longToBytes(length);
        byte[] bArrLongToBytes2 = GattUtils.longToBytes(length2);
        long j = iBytesToInt;
        byte[] bArrLongToBytes3 = GattUtils.longToBytes(length + j);
        long j2 = 0;
        while (j2 != j) {
            if (49 <= j2 && j2 <= 52) {
                fileInputStream2.read();
                fileOutputStream = fileOutputStream2;
                fileOutputStream.write(bArrLongToBytes[(int) (j2 - 49)]);
            } else {
                fileOutputStream = fileOutputStream2;
                if (j2 == 53) {
                    fileInputStream2.read();
                    j2++;
                    fileOutputStream.write(this.bmpType);
                } else {
                    if (37 <= j2 && j2 <= 40) {
                        fileInputStream2.read();
                        fileOutputStream.write(bArrLongToBytes3[(int) (j2 - 37)]);
                    } else {
                        if (41 <= j2 && j2 <= 44) {
                            fileInputStream2.read();
                            fileOutputStream.write(bArrLongToBytes2[(int) (j2 - 41)]);
                        } else {
                            fileOutputStream.write(fileInputStream2.read());
                        }
                    }
                }
                fileOutputStream2 = fileOutputStream;
            }
            j2++;
            fileOutputStream2 = fileOutputStream;
        }
        FileOutputStream fileOutputStream3 = fileOutputStream2;
        byte[] bArr2 = new byte[4096];
        while (true) {
            int i = fileInputStream3.read(bArr2);
            if (i == -1) {
                break;
            }
            fileOutputStream3.write(bArr2, 0, i);
        }
        while (true) {
            int i2 = fileInputStream4.read(bArr2);
            if (i2 == -1) {
                fileOutputStream3.close();
                fileInputStream2.close();
                fileInputStream3.close();
                fileInputStream4.close();
                return file2.getAbsolutePath();
            }
            fileOutputStream3.write(bArr2, 0, i2);
        }
    }
}
