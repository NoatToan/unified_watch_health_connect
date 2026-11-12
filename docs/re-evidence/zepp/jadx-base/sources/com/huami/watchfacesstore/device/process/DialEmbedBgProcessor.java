package com.huami.watchfacesstore.device.process;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B?\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialEmbedBgProcessor;", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "", "originPath", "process", "a", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "processor", "b", "Ljava/lang/String;", "bgPath", "", "c", "J", "bgOffset", "", GoogleApiAvailabilityLight.a, LogUtil.I, "bgSizeOffset", "e", "bgType", "f", "bgTypeOffset", "<init>", "(Lcom/huami/watchfacesstore/device/process/IDialProcessor;Ljava/lang/String;JIIJ)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DialEmbedBgProcessor implements IDialProcessor {
    public static final long BG_OFFSET = 30;
    public static final int BG_SIZE_OFFSET = 34;
    public static final int BG_TYPE_BMP_565 = 1;
    public static final int BG_TYPE_BMP_888 = 2;
    public static final int BG_TYPE_DEFAULT = 0;
    public static final int BG_TYPE_DTA_565 = 3;
    public static final int CACHE_SIZE = 4096;
    public static final int SIZE_LEN = 4;
    public static final long TYPE_OFFSET = 38;
    public static final long UIH_BG_OFFSET = 13;
    public static final int UIH_BG_SIZE_OFFSET = 14;
    public static final long UIH_TYPE_OFFSET = 21;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String bgPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long bgOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int bgSizeOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int bgType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long bgTypeOffset;

    public DialEmbedBgProcessor(@NotNull IDialProcessor iDialProcessor, @NotNull String str, long j, int i, int i2, long j2) {
        this.processor = iDialProcessor;
        this.bgPath = str;
        this.bgOffset = j;
        this.bgSizeOffset = i;
        this.bgType = i2;
        this.bgTypeOffset = j2;
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) throws IOException {
        File parentFile;
        String strProcess = this.processor.process(originPath);
        File file = new File(this.bgPath);
        long length = file.length();
        FileInputStream fileInputStream = new FileInputStream(new File(strProcess));
        fileInputStream.skip(this.bgOffset);
        byte[] bArr = new byte[4];
        fileInputStream.read(bArr, 0, 4);
        int iBytesToInt = GattUtils.bytesToInt(bArr, 0, 4);
        fileInputStream.close();
        FileInputStream fileInputStream2 = new FileInputStream(new File(strProcess));
        FileInputStream fileInputStream3 = new FileInputStream(file);
        File appFileDir = FileUtils.getAppFileDir(KoinExtKt.getAppContext());
        String str = File.separator;
        File file2 = new File(appFileDir + str + WatchSkinManager.WATCH_SKIN_DIAL_PARENT_FILE_NAME + str + WatchSkinManager.WATCH_SKIN_DIAL_BIN_NAME);
        if (file2.exists()) {
            file2.delete();
        }
        File parentFile2 = file2.getParentFile();
        if (((parentFile2 == null || parentFile2.exists()) ? false : true) && (parentFile = file2.getParentFile()) != null) {
            parentFile.mkdir();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArrLongToBytes = GattUtils.longToBytes(length);
        long j = 0;
        while (true) {
            long j2 = this.bgTypeOffset;
            if (j == j2) {
                break;
            }
            int i = this.bgSizeOffset;
            if (j <= i + 4 && j >= i) {
                fileInputStream2.read();
                fileOutputStream.write(bArrLongToBytes[(int) (j - ((long) this.bgSizeOffset))]);
            } else if (j == j2) {
                fileInputStream2.read();
                j++;
                fileOutputStream.write(this.bgType);
            } else {
                fileOutputStream.write(fileInputStream2.read());
            }
            j++;
        }
        int i2 = (int) (((long) iBytesToInt) - j);
        byte[] bArr2 = new byte[i2];
        fileInputStream2.read(bArr2, 0, i2);
        fileOutputStream.write(bArr2, 0, i2);
        byte[] bArr3 = new byte[4096];
        while (true) {
            int i3 = fileInputStream3.read(bArr3);
            if (i3 == -1) {
                fileOutputStream.close();
                fileInputStream2.close();
                fileInputStream3.close();
                return file2.getAbsolutePath();
            }
            fileOutputStream.write(bArr3, 0, i3);
        }
    }

    public /* synthetic */ DialEmbedBgProcessor(IDialProcessor iDialProcessor, String str, long j, int i, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(iDialProcessor, str, (i3 & 4) != 0 ? 30L : j, (i3 & 8) != 0 ? 34 : i, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? 38L : j2);
    }
}
