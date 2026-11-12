package com.huami.bluetooth.feature.file_transfer;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferPacket;
import com.xiaomi.hm.health.bt.debug.Debug;
import defpackage.b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.zip.CRC32;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 62\u00020\u0001:\u00016B1\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001b\u0012\u0006\u0010%\u001a\u00020\u0010\u0012\b\b\u0002\u0010'\u001a\u00020\u0010¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0016R\u0019\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001f\u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\"\u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0017R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010$¨\u00067"}, d2 = {"Lcom/huami/bluetooth/feature/file_transfer/FileReceiveTask;", "", "", "byteArray", "", "b", HTTP.CONTENT_RANGE_BYTES, "Ljava/io/File;", "file", "", "a", "", "currentChunk", "isPacketLost", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferPacket;", "packet", "", "fileCRC32", "appendPacket", "getProgress", "other", "equals", "hashCode", LogUtil.I, "getSessionID", "()I", SDKConstants.PARAM_SESSION_ID, "", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "c", "getFilePath", "filePath", GoogleApiAvailabilityLight.a, "J", "totalFileSize", "e", "targetFileCRC32", "f", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "g", "chunkIndex", "Ljava/util/zip/CRC32;", "h", "Ljava/util/zip/CRC32;", "crc32", "i", "currentSize", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileReceiveTask {
    public static final int BUFFER_SIZE = 4096;

    @NotNull
    public static final String TAG = "FileTransferTask";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int sessionID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String filePath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long totalFileSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long targetFileCRC32;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final File file;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int chunkIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final CRC32 crc32;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long currentSize;

    public FileReceiveTask(int i, @NotNull String str, @NotNull String str2, long j, long j2) {
        this.sessionID = i;
        this.url = str;
        this.filePath = str2;
        this.totalFileSize = j;
        this.targetFileCRC32 = j2;
        File file = new File(str2);
        this.file = file;
        this.chunkIndex = -1;
        this.crc32 = new CRC32();
        this.currentSize = file.exists() ? file.length() : 0L;
        if (file.exists()) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] bArr = new byte[4096];
            while (bufferedInputStream.read(bArr, 0, 4096) >= 1) {
                this.crc32.update(bArr);
            }
        }
    }

    private final void a(byte[] bytes, File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.write(bytes);
        randomAccessFile.close();
    }

    public static /* synthetic */ int appendPacket$default(FileReceiveTask fileReceiveTask, FileTransferPacket fileTransferPacket, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return fileReceiveTask.appendPacket(fileTransferPacket, j);
    }

    private final boolean b(byte[] byteArray) {
        try {
            a(byteArray, this.file);
            this.crc32.update(byteArray);
            return true;
        } catch (IOException e) {
            Debug.fi(TAG, e.toString());
            return false;
        }
    }

    public final int appendPacket(@NotNull FileTransferPacket packet, long fileCRC32) {
        if (!b(packet.getData())) {
            return 7;
        }
        this.currentSize += (long) packet.getData().length;
        if (!packet.getIsLast()) {
            return -1;
        }
        Debug.fi(TAG, "local crc:" + this.crc32.getValue() + ",remote crc32:" + this.targetFileCRC32 + ',' + fileCRC32);
        return this.crc32.getValue() != (fileCRC32 | this.targetFileCRC32) ? 11 : 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(FileReceiveTask.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.bluetooth.feature.file_transfer.FileReceiveTask");
        FileReceiveTask fileReceiveTask = (FileReceiveTask) other;
        return this.sessionID == fileReceiveTask.sessionID && Intrinsics.areEqual(this.filePath, fileReceiveTask.filePath) && this.targetFileCRC32 == fileReceiveTask.targetFileCRC32 && Intrinsics.areEqual(this.file, fileReceiveTask.file) && this.chunkIndex == fileReceiveTask.chunkIndex && Intrinsics.areEqual(this.crc32, fileReceiveTask.crc32);
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final int getProgress() {
        return (int) (this.currentSize / this.totalFileSize);
    }

    public final int getSessionID() {
        return this.sessionID;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((this.sessionID * 31) + this.filePath.hashCode()) * 31) + b.a(this.targetFileCRC32)) * 31) + this.file.hashCode()) * 31) + this.chunkIndex) * 31) + this.crc32.hashCode();
    }

    public final boolean isPacketLost(int currentChunk) {
        int i = (this.chunkIndex + 1) % 256;
        this.chunkIndex = i;
        return i != currentChunk;
    }

    public /* synthetic */ FileReceiveTask(int i, String str, String str2, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, (i2 & 16) != 0 ? 0L : j2);
    }
}
