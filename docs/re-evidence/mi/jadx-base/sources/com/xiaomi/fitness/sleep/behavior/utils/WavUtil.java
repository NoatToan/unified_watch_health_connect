package com.xiaomi.fitness.sleep.behavior.utils;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import defpackage.bvc;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/utils/WavUtil;", "", "<init>", "()V", "TAG", "", "convertToWav", "", "filePath", "sampleRate", "", Constants.KEY_RECHARGE_CHANNELS, "sampleBits", "writeHeader", "file", "Ljava/io/File;", "header", "", "WaveHeader", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WavUtil {

    @NotNull
    public static final WavUtil INSTANCE = new WavUtil();

    @NotNull
    private static final String TAG = "WavUtil";

    private WavUtil() {
    }

    public final void convertToWav(@NotNull String filePath, int sampleRate, int channels, int sampleBits) throws Throwable {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        writeHeader(new File(filePath), new WaveHeader(filePath, sampleRate, (short) channels, (short) sampleBits).getHeader());
        Logger.i(TAG, "convertToWav: finished");
    }

    public final void writeHeader(@NotNull File file, @Nullable byte[] header) throws Throwable {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists() || !file.isFile()) {
            Logger.e(TAG, "writeHeader: pcmFile is not a file or not exist");
            return;
        }
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile2.seek(0L);
                    randomAccessFile2.write(header);
                    bvc.a(randomAccessFile2);
                } catch (Exception e) {
                    e = e;
                    randomAccessFile = randomAccessFile2;
                    Logger.e(TAG, "write wav file Header error: " + e.getMessage(), e);
                    bvc.a(randomAccessFile);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    bvc.a(randomAccessFile);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fR\u000e\u0010\r\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/utils/WavUtil$WaveHeader;", "", "filePath", "", "sampleRate", "", Constants.KEY_RECHARGE_CHANNELS, "", "sampleBits", "<init>", "(Ljava/lang/String;ISS)V", "totalAudioLen", "(IISS)V", "riffChunkId", "riffChunkSize", "riffType", "formatChunkId", "formatChunkSize", "audioFormat", "byteRate", "blockAlign", "dataChunkId", "dataChunkSize", "header", "", "getHeader", "()[B", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWavUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WavUtil.kt\ncom/xiaomi/fitness/sleep/behavior/utils/WavUtil$WaveHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    public static final class WaveHeader {

        @NotNull
        private static final String TAG = "WaveHeader";
        private final short audioFormat;
        private short blockAlign;
        private int byteRate;
        private short channels;

        @NotNull
        private final String dataChunkId;
        private int dataChunkSize;

        @NotNull
        private final String formatChunkId;
        private final int formatChunkSize;

        @NotNull
        private final String riffChunkId;
        private int riffChunkSize;

        @NotNull
        private final String riffType;
        private short sampleBits;
        private int sampleRate;

        public WaveHeader(@NotNull String filePath, int i, short s, short s2) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            this.riffChunkId = "RIFF";
            this.riffType = "WAVE";
            this.formatChunkId = "fmt ";
            this.formatChunkSize = 16;
            this.audioFormat = (short) 1;
            this.dataChunkId = "data";
            if (filePath.length() <= 0) {
                throw new IllegalArgumentException("filepath is null or empty".toString());
            }
            File file = new File(filePath);
            if (!file.exists()) {
                Logger.e(TAG, "WaveHeader: pcm file is not exists");
                return;
            }
            int length = (int) file.length();
            this.riffChunkSize = length;
            this.channels = s;
            this.sampleRate = i;
            this.byteRate = ((i * s2) / 8) * s;
            this.blockAlign = (short) ((s * s2) / 8);
            this.sampleBits = s2;
            this.dataChunkSize = length - 44;
        }

        @NotNull
        public final byte[] getHeader() {
            ByteUtil byteUtil = ByteUtil.INSTANCE;
            String str = this.riffChunkId;
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrMerger = byteUtil.merger(bytes, ByteUtil.fromInt(this.riffChunkSize));
            byte[] bytes2 = this.riffType.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            byte[] bArrMerger2 = byteUtil.merger(bArrMerger, bytes2);
            byte[] bytes3 = this.formatChunkId.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
            byte[] bArrMerger3 = byteUtil.merger(byteUtil.merger(byteUtil.merger(byteUtil.merger(byteUtil.merger(byteUtil.merger(byteUtil.merger(byteUtil.merger(bArrMerger2, bytes3), ByteUtil.fromInt(this.formatChunkSize)), ByteUtil.fromShort(this.audioFormat)), ByteUtil.fromShort(this.channels)), ByteUtil.fromInt(this.sampleRate)), ByteUtil.fromInt(this.byteRate)), ByteUtil.fromShort(this.blockAlign)), ByteUtil.fromShort(this.sampleBits));
            byte[] bytes4 = this.dataChunkId.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes4, "getBytes(...)");
            return byteUtil.merger(byteUtil.merger(bArrMerger3, bytes4), ByteUtil.fromInt(this.dataChunkSize));
        }

        public WaveHeader(int i, int i2, short s, short s2) {
            this.riffChunkId = "RIFF";
            this.riffType = "WAVE";
            this.formatChunkId = "fmt ";
            this.formatChunkSize = 16;
            this.audioFormat = (short) 1;
            this.dataChunkId = "data";
            this.riffChunkSize = i;
            this.channels = s;
            this.sampleRate = i2;
            this.byteRate = ((i2 * s2) / 8) * s;
            this.blockAlign = (short) ((s * s2) / 8);
            this.sampleBits = s2;
            this.dataChunkSize = i - 44;
        }
    }
}
