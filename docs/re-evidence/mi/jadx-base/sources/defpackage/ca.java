package defpackage;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0005B1\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0002J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0005\u0010\u001c¨\u0006\""}, d2 = {"Lca;", "", "", "currentChunk", "", PluginDeviceInfo.FMODEL, "Lma;", "packet", "", "fileCRC32", PluginDeviceInfo.FDESC, "other", "equals", "hashCode", "", "byteArray", "bytes", "Ljava/io/File;", "file", "", Constants.EXTRA_SESSION_ID, "I", PluginDeviceInfo.FICONON, "()I", "", "url", "Ljava/lang/String;", PluginDeviceInfo.FICONOFF, "()Ljava/lang/String;", "filePath", "totalFileSize", "targetFileCRC32", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ca {

    @NotNull
    public static final a j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f5099b;

    @NotNull
    public final String c;
    public final long d;
    public final long e;

    @NotNull
    public final File f;
    public int g;

    @NotNull
    public final CRC32 h;
    public long i;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lca$a;", "", "", "BUFFER_SIZE", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ca(int i, @NotNull String url, @NotNull String filePath, long j2, long j3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f5098a = i;
        this.f5099b = url;
        this.c = filePath;
        this.d = j2;
        this.e = j3;
        File file = new File(filePath);
        this.f = file;
        this.g = -1;
        this.h = new CRC32();
        this.i = file.exists() ? file.length() : 0L;
        if (file.exists()) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] bArr = new byte[4096];
            while (bufferedInputStream.read(bArr, 0, 4096) >= 1) {
                this.h.update(bArr);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final int b() {
        return (int) (this.i / this.d);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF5098a() {
        return this.f5098a;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF5099b() {
        return this.f5099b;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ca.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.huami.bluetooth.feature.file_transfer.FileReceiveTask");
        ca caVar = (ca) other;
        return this.f5098a == caVar.f5098a && Intrinsics.areEqual(this.c, caVar.c) && this.e == caVar.e && Intrinsics.areEqual(this.f, caVar.f) && this.g == caVar.g && Intrinsics.areEqual(this.h, caVar.h);
    }

    public int hashCode() {
        return (((((((((this.f5098a * 31) + this.c.hashCode()) * 31) + Long.hashCode(this.e)) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h.hashCode();
    }

    public final boolean a(int currentChunk) {
        int i = (this.g + 1) % 256;
        this.g = i;
        return i != currentChunk;
    }

    public static /* synthetic */ int a(ca caVar, FileTransferPacket fileTransferPacket, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        return caVar.a(fileTransferPacket, j2);
    }

    public final int a(@NotNull FileTransferPacket packet, long fileCRC32) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        if (!a(packet.getC())) {
            return 7;
        }
        this.i += (long) packet.getC().length;
        if (!packet.getIsLast()) {
            return -1;
        }
        t5t.d("FileTransferTask", "local crc:" + this.h.getValue() + ",remote crc32:" + this.e + ',' + fileCRC32);
        return this.h.getValue() != (fileCRC32 | this.e) ? 11 : 0;
    }

    public final boolean a(byte[] byteArray) {
        try {
            a(byteArray, this.f);
            this.h.update(byteArray);
            return true;
        } catch (IOException e) {
            t5t.d("FileTransferTask", e.toString());
            return false;
        }
    }

    public final void a(byte[] bytes, File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.write(bytes);
        randomAccessFile.close();
    }
}
