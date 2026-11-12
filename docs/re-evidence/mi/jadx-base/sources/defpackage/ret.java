package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class ret {
    public static final Set<String> e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f32478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLock f32479b;
    public String c;
    public RandomAccessFile d;

    public ret(Context context) {
        this.f32478a = context;
    }

    public static ret a(Context context, File file) throws IOException {
        x9s.B("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (!e.add(str)) {
            throw new IOException("abtain lock failure");
        }
        ret retVar = new ret(context);
        retVar.c = str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            retVar.d = randomAccessFile;
            retVar.f32479b = randomAccessFile.getChannel().lock();
            x9s.B("Locked: " + str + " :" + retVar.f32479b);
            if (retVar.f32479b == null) {
                RandomAccessFile randomAccessFile2 = retVar.d;
                if (randomAccessFile2 != null) {
                    mgt.b(randomAccessFile2);
                }
            }
            return retVar;
        } finally {
            if (retVar.f32479b == null) {
                RandomAccessFile randomAccessFile3 = retVar.d;
                if (randomAccessFile3 != null) {
                    mgt.b(randomAccessFile3);
                }
                e.remove(retVar.c);
            }
        }
    }

    public void b() {
        x9s.B("unLock: " + this.f32479b);
        FileLock fileLock = this.f32479b;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f32479b.release();
            } catch (IOException unused) {
            }
            this.f32479b = null;
        }
        RandomAccessFile randomAccessFile = this.d;
        if (randomAccessFile != null) {
            mgt.b(randomAccessFile);
        }
        e.remove(this.c);
    }
}
