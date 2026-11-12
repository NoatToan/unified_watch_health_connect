package com.amap.api.col.p0003sl;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
final class bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RandomAccessFile f2286a;

    public bs() throws IOException {
        this("", 0L);
    }

    public bs(String str, long j) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                jv.c(e, "FileAccessI", "create");
                e.printStackTrace();
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        this.f2286a = randomAccessFile;
        randomAccessFile.seek(j);
    }

    public final int a(byte[] bArr) throws IOException {
        int length;
        synchronized (this) {
            this.f2286a.write(bArr);
            length = bArr.length;
        }
        return length;
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f2286a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f2286a = null;
        }
    }
}
