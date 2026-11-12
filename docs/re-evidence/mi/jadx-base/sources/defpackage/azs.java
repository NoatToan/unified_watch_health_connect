package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.Cif;
import com.xiaomi.push.i;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class azs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3624a = false;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f3625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public rzs f3626b;

        public a(Context context, rzs rzsVar) {
            this.f3626b = rzsVar;
            this.f3625a = context;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            azs.f(this.f3625a, this.f3626b);
        }
    }

    public static void a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void b(Context context, rzs rzsVar) {
        k5s.a(context).g(new a(context, rzsVar));
    }

    public static void c(Context context, rzs rzsVar, File file, byte[] bArr) throws Throwable {
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream = null;
                loop0: while (true) {
                    int i = 0;
                    int length = 0;
                    while (true) {
                        try {
                            int i2 = bufferedInputStream2.read(bArr2);
                            if (i2 == -1) {
                                break loop0;
                            }
                            if (i2 != 4) {
                                x9s.D("TinyData read from cache file failed cause lengthBuffer error. size:" + i2);
                                break loop0;
                            }
                            int iA = j4s.a(bArr2);
                            if (iA < 1 || iA > 30720) {
                                x9s.D("TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + iA);
                                break loop0;
                            }
                            byte[] bArr3 = new byte[iA];
                            int i3 = bufferedInputStream2.read(bArr3);
                            if (i3 != iA) {
                                x9s.D("TinyData read from cache file failed cause buffer size not equal length. size:" + i3 + "__length:" + iA);
                                break loop0;
                            }
                            byte[] bArrB = hxs.b(bArr, bArr3);
                            if (bArrB == null || bArrB.length == 0) {
                                x9s.D("TinyData read from cache file failed cause decrypt fail");
                            } else {
                                Cif cif = new Cif();
                                i.d(cif, bArrB);
                                cif.a("item_size", String.valueOf(bArrB.length));
                                arrayList.add(cif);
                                i++;
                                length += bArrB.length;
                                if (i >= 8 || length >= 30720) {
                                    bzs.d(context, rzsVar, arrayList);
                                    arrayList.clear();
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedInputStream = bufferedInputStream2;
                            x9s.s(e);
                            mgt.b(bufferedInputStream);
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream = bufferedInputStream2;
                            mgt.b(bufferedInputStream);
                            throw th;
                        }
                    }
                }
                bzs.d(context, rzsVar, arrayList);
                if (file != null && file.exists() && !file.delete()) {
                    x9s.o("TinyData delete reading temp file failed");
                }
                mgt.b(bufferedInputStream2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void d(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 4).edit();
        editorEdit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    public static void f(Context context, rzs rzsVar) throws Throwable {
        RandomAccessFile randomAccessFile;
        File file;
        if (f3624a) {
            x9s.o("TinyData extractTinyData is running");
            return;
        }
        f3624a = true;
        File file2 = new File(context.getFilesDir(), "tiny_data.data");
        if (!file2.exists()) {
            x9s.o("TinyData no ready file to get data.");
            return;
        }
        a(context);
        byte[] bArrB = nfs.b(context);
        FileLock fileLockLock = null;
        try {
            File file3 = new File(context.getFilesDir(), "tiny_data.lock");
            mgt.f(file3);
            randomAccessFile = new RandomAccessFile(file3, "rw");
            try {
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    file2.renameTo(new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data"));
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e) {
                            e = e;
                            x9s.s(e);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    x9s.s(e);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e3) {
                            e = e3;
                            x9s.s(e);
                        }
                    }
                    mgt.b(randomAccessFile);
                    file = new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data");
                    if (!file.exists()) {
                        x9s.o("TinyData no ready file to get data.");
                        return;
                    }
                    c(context, rzsVar, file, bArrB);
                    zys.c(false);
                    d(context);
                    f3624a = false;
                }
            } catch (Throwable th) {
                th = th;
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e4) {
                        x9s.s(e4);
                    }
                }
                mgt.b(randomAccessFile);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            if (fileLockLock != null) {
                fileLockLock.release();
            }
            mgt.b(randomAccessFile);
            throw th;
        }
        mgt.b(randomAccessFile);
        file = new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data");
        if (!file.exists()) {
            x9s.o("TinyData no ready file to get data.");
            return;
        }
        c(context, rzsVar, file, bArrB);
        zys.c(false);
        d(context);
        f3624a = false;
    }
}
