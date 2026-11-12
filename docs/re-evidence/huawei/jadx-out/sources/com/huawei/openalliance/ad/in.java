package com.huawei.openalliance.ad;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes12.dex */
class in {
    static void b(File file) {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length < 1) {
            length = 0;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile.seek(j);
                byte b2 = randomAccessFile.readByte();
                randomAccessFile.seek(j);
                randomAccessFile.write(b2);
                com.huawei.openalliance.ad.utils.ai.a(randomAccessFile);
            } catch (Throwable unused) {
                try {
                    hw.c("DiskFiles", "Failed to mofiy file");
                } finally {
                    com.huawei.openalliance.ad.utils.ai.a(randomAccessFile);
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    static void a(File file) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLastModified = file.lastModified();
        if (jLastModified == jCurrentTimeMillis) {
            jCurrentTimeMillis++;
        }
        if (file.setLastModified(jCurrentTimeMillis)) {
            return;
        }
        try {
            b(file);
        } catch (IOException e) {
            hw.d("DiskFiles", "Failed to manually update lastModifyTime to file %s with error %s", file.getName(), e.getClass().getSimpleName());
        }
        if (jLastModified < jCurrentTimeMillis) {
            hw.c("DiskFiles", "Failed to manually update lastModifyTime to file %s", file.getName());
        }
    }
}
