package com.xiaomi.fitness.net.utils;

import com.xiaomi.fitness.common.extensions.IOExtKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/net/utils/DownloadFileUtil;", "", "<init>", "()V", "recreate", "", "file", "Ljava/io/File;", "length", "", "setLength", "getChannel", "Ljava/nio/channels/FileChannel;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadFileUtil {

    @NotNull
    public static final DownloadFileUtil INSTANCE = new DownloadFileUtil();

    private DownloadFileUtil() {
    }

    public static /* synthetic */ void recreate$default(DownloadFileUtil downloadFileUtil, File file, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        downloadFileUtil.recreate(file, j);
    }

    private final void setLength(File file, long length) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rws");
            randomAccessFile.setLength(length);
            IOExtKt.closeSilently(this, randomAccessFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public final FileChannel getChannel(@Nullable File file) {
        if (file == null) {
            return null;
        }
        try {
            return new RandomAccessFile(file, "rws").getChannel();
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final void recreate(@Nullable File file, long length) {
        if (file == null) {
            return;
        }
        file.delete();
        try {
            if (file.createNewFile()) {
                setLength(file, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
