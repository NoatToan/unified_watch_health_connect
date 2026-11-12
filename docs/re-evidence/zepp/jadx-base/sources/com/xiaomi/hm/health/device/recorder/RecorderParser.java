package com.xiaomi.hm.health.device.recorder;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.hm.opuslib.OpusTool;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u001e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eJ\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bJ\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/RecorderParser;", "", "Ljava/io/File;", "file", "", "a", "rawFile", "waveFile", "", BehaviorTaggingWebApi.g.s, "channel", "c", PointCategory.INIT, "deInit", "", "opusFilePath", "", "deleteOriginFile", "deleteMidFile", "parse", "f", "", "fullyReadFileToBytes", "Ljava/io/OutputStream;", "output", "data", "writeToOutput", "", "Ljava/io/InputStream;", "source", "", "copy", "bufferSize", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasInit", "Lcom/hm/opuslib/OpusTool;", "b", "Lkotlin/Lazy;", "()Lcom/hm/opuslib/OpusTool;", "opusTool", LogUtil.I, "TRANSFER_BUFFER_SIZE", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RecorderParser {

    @NotNull
    private static final String d = ".opus";

    @NotNull
    private static final String e = ".pcm";

    @NotNull
    private static final String f = ".wav";
    private static final int g = 16000;
    private static final int h = 1;

    @NotNull
    private static final String i = "RecorderParser";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean hasInit = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy opusTool = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int TRANSFER_BUFFER_SIZE = 10240;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete file failed. " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/hm/opuslib/OpusTool;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<OpusTool> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OpusTool invoke() {
            return new OpusTool();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "opus File:" + this.a.getAbsolutePath() + " exist: " + this.a.exists();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parsed recorder failed.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start to parse wav file";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pcmRawToWave failed. " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parsed file length is 0";
        }
    }

    private final void a(File file) {
        try {
            file.delete();
        } catch (Exception e2) {
            HMLog.info(i, new a(e2));
        }
    }

    private final OpusTool b() {
        return (OpusTool) this.opusTool.getValue();
    }

    private final void c(File rawFile, File waveFile, int sampleRate, int channel) throws Throwable {
        int length = (int) rawFile.length();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(waveFile);
            try {
                writeToOutput(fileOutputStream2, "RIFF");
                writeToOutput(fileOutputStream2, length + 36);
                writeToOutput(fileOutputStream2, "WAVE");
                writeToOutput(fileOutputStream2, "fmt ");
                writeToOutput(fileOutputStream2, 16);
                writeToOutput((OutputStream) fileOutputStream2, (short) 1);
                writeToOutput((OutputStream) fileOutputStream2, (short) channel);
                writeToOutput(fileOutputStream2, sampleRate);
                writeToOutput(fileOutputStream2, sampleRate * 2);
                writeToOutput((OutputStream) fileOutputStream2, (short) 2);
                writeToOutput((OutputStream) fileOutputStream2, (short) 16);
                writeToOutput(fileOutputStream2, "data");
                writeToOutput(fileOutputStream2, length);
                copy(new FileInputStream(rawFile), fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long copy(@NotNull InputStream source, @NotNull OutputStream output) throws IOException {
        return copy(source, output, this.TRANSFER_BUFFER_SIZE);
    }

    public final void deInit() {
        if (this.hasInit.compareAndSet(true, false)) {
            b().deinit();
        }
    }

    @NotNull
    public final byte[] fullyReadFileToBytes(@NotNull File f2) throws IOException {
        int length = (int) f2.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(f2);
        try {
            try {
                int i2 = fileInputStream.read(bArr, 0, length);
                if (i2 < length) {
                    int i3 = length - i2;
                    while (i3 > 0) {
                        int i4 = fileInputStream.read(bArr2, 0, i3);
                        System.arraycopy(bArr2, 0, bArr, length - i3, i4);
                        i3 -= i4;
                    }
                }
                fileInputStream.close();
                return bArr;
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public final void init() {
        if (this.hasInit.compareAndSet(false, true)) {
            b().init();
        }
    }

    @NotNull
    public final String parse(@NotNull String opusFilePath, boolean deleteOriginFile, boolean deleteMidFile) throws Throwable {
        File file = new File(opusFilePath);
        HMLog.info(i, new c(file));
        String strReplace$default = m.replace$default(opusFilePath, d, e, false, 4, (Object) null);
        b().decodeOriginOpus(opusFilePath, strReplace$default, 16000, 1);
        File file2 = new File(strReplace$default);
        if (!file2.exists()) {
            HMLog.info(i, d.a);
            return "";
        }
        String strReplace$default2 = m.replace$default(opusFilePath, d, f, false, 4, (Object) null);
        File file3 = new File(strReplace$default2);
        if (!file3.exists()) {
            file3.createNewFile();
        }
        HMLog.info(i, e.a);
        try {
            c(file2, file3, 16000, 1);
            if (deleteMidFile) {
                a(file2);
            }
            if (file3.length() == 0) {
                HMLog.info(i, g.a);
                a(file3);
                return "";
            }
            if (deleteOriginFile) {
                a(file);
            }
            return strReplace$default2;
        } catch (Exception e2) {
            HMLog.info(i, new f(e2));
            if (deleteMidFile) {
                a(file2);
            }
            a(file3);
            return "";
        }
    }

    public final void writeToOutput(@NotNull OutputStream output, @NotNull String data) throws IOException {
        int length = data.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = data.charAt(i2);
            i2++;
            output.write(cCharAt);
        }
    }

    public final long copy(@NotNull InputStream source, @NotNull OutputStream output, int bufferSize) throws IOException {
        byte[] bArr = new byte[bufferSize];
        long j = 0;
        while (true) {
            int i2 = source.read(bArr);
            if (i2 == -1) {
                return j;
            }
            output.write(bArr, 0, i2);
            j += (long) i2;
        }
    }

    public final void writeToOutput(@NotNull OutputStream output, int data) throws IOException {
        output.write(data >> 0);
        output.write(data >> 8);
        output.write(data >> 16);
        output.write(data >> 24);
    }

    public final void writeToOutput(@NotNull OutputStream output, short data) throws IOException {
        output.write(data >> 0);
        output.write(data >> 8);
    }
}
