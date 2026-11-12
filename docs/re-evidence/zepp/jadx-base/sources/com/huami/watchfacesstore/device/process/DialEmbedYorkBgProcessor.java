package com.huami.watchfacesstore.device.process;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialEmbedYorkBgProcessor;", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "", "originPath", "process", "a", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "processor", "b", "Ljava/lang/String;", "bgPath", "c", "previewBmpPath", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getBG_TYPE_DEFAULT", "()I", "BG_TYPE_DEFAULT", "e", "getBG_TYPE_BMP_565", "BG_TYPE_BMP_565", "f", "getBG_TYPE_BMP_888", "BG_TYPE_BMP_888", "<init>", "(Lcom/huami/watchfacesstore/device/process/IDialProcessor;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DialEmbedYorkBgProcessor implements IDialProcessor {
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
    @NotNull
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String bgPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String previewBmpPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int BG_TYPE_DEFAULT;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int BG_TYPE_BMP_565 = 1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int BG_TYPE_BMP_888 = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, long j, long j2) {
            super(0);
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int i = this.a;
            long j = this.b;
            return "bgoffset: " + i + " bgsizes: " + j + " previewSizes: " + this.c + " previewOffset: " + (((long) i) + j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "process time: " + (this.a - this.b) + "ms";
        }
    }

    public DialEmbedYorkBgProcessor(@NotNull IDialProcessor iDialProcessor, @NotNull String str, @NotNull String str2) {
        this.processor = iDialProcessor;
        this.bgPath = str;
        this.previewBmpPath = str2;
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    public final int getBG_TYPE_BMP_565() {
        return this.BG_TYPE_BMP_565;
    }

    public final int getBG_TYPE_BMP_888() {
        return this.BG_TYPE_BMP_888;
    }

    public final int getBG_TYPE_DEFAULT() {
        return this.BG_TYPE_DEFAULT;
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
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strProcess = this.processor.process(originPath);
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
        byte[] bArrLongToBytes2 = GattUtils.longToBytes(length2);
        long j = iBytesToInt;
        byte[] bArrLongToBytes3 = GattUtils.longToBytes(length + j);
        HMLog.info("IDialProcessor", new a(iBytesToInt, length, length2));
        long j2 = 0;
        while (j2 <= 53) {
            if (49 <= j2 && j2 <= 52) {
                fileInputStream2.read();
                fileOutputStream.write(bArrLongToBytes[(int) (j2 - 49)]);
            } else if (j2 == 53) {
                fileInputStream2.read();
                j2++;
                fileOutputStream.write(this.BG_TYPE_BMP_565);
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
            j2++;
        }
        int i = (int) (j - j2);
        byte[] bArr2 = new byte[i];
        fileInputStream2.read(bArr2, 0, i);
        fileOutputStream.write(bArr2, 0, i);
        byte[] bArr3 = new byte[4096];
        while (true) {
            int i2 = fileInputStream3.read(bArr3);
            if (i2 == -1) {
                break;
            }
            fileOutputStream.write(bArr3, 0, i2);
        }
        while (true) {
            int i3 = fileInputStream4.read(bArr3);
            if (i3 == -1) {
                fileOutputStream.close();
                fileInputStream2.close();
                fileInputStream3.close();
                fileInputStream4.close();
                HMLog.debug("York", new b(System.currentTimeMillis(), jCurrentTimeMillis));
                return file2.getAbsolutePath();
            }
            fileOutputStream.write(bArr3, 0, i3);
        }
    }
}
