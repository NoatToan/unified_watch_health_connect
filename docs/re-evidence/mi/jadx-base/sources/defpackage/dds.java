package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
public final class dds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RandomAccessFile f15420a;

    public dds(String str, long j) throws IOException {
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
                m2t.r(e, "FileAccessI", "create");
                e.printStackTrace();
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        this.f15420a = randomAccessFile;
        randomAccessFile.seek(j);
    }

    public final synchronized int a(byte[] bArr) throws IOException {
        this.f15420a.write(bArr);
        return bArr.length;
    }

    public final void b() {
        RandomAccessFile randomAccessFile = this.f15420a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f15420a = null;
        }
    }
}
