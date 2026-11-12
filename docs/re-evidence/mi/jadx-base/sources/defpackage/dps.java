package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class dps implements dqe {
    public static final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");
    public static String e = "/MiPushLog";
    public static List<Pair<String, Throwable>> f = Collections.synchronizedList(new ArrayList());
    public static volatile dps g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f15797b;
    public Handler c;

    public dps(Context context) {
        this.f15797b = context;
        if (context.getApplicationContext() != null) {
            this.f15797b = context.getApplicationContext();
        }
        this.f15796a = this.f15797b.getPackageName() + "-" + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    public static dps a(Context context) {
        if (g == null) {
            synchronized (dps.class) {
                try {
                    if (g == null) {
                        g = new dps(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public final void e() throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(this.f15797b.getFilesDir(), e);
            if (!egt.b(file)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot wirte internal file: ");
                sb.append(file);
                return;
            }
            if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
                File file2 = new File(file, "log.lock");
                if (!file2.exists() || file2.isDirectory()) {
                    file2.createNewFile();
                }
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                        while (!f.isEmpty()) {
                            try {
                                Pair<String, Throwable> pairRemove = f.remove(0);
                                String str = (String) pairRemove.first;
                                if (pairRemove.second != null) {
                                    str = (str + "\n") + Log.getStackTraceString((Throwable) pairRemove.second);
                                }
                                bufferedWriter2.write(str + "\n");
                            } catch (Exception unused) {
                                bufferedWriter = bufferedWriter2;
                                if (bufferedWriter != null) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                if (fileLockLock != null && fileLockLock.isValid()) {
                                    try {
                                        fileLockLock.release();
                                    } catch (IOException unused3) {
                                    }
                                }
                                if (randomAccessFile == null) {
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter = bufferedWriter2;
                                if (bufferedWriter != null) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                if (fileLockLock != null && fileLockLock.isValid()) {
                                    try {
                                        fileLockLock.release();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (randomAccessFile == null) {
                                    throw th;
                                }
                                try {
                                    randomAccessFile.close();
                                    throw th;
                                } catch (IOException unused6) {
                                    throw th;
                                }
                            }
                        }
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                        File file3 = new File(file, "log1.txt");
                        if (file3.length() >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                            File file4 = new File(file, "log0.txt");
                            if (file4.exists() && file4.isFile()) {
                                file4.delete();
                            }
                            file3.renameTo(file4);
                        }
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException unused7) {
                            }
                        }
                    } catch (Exception unused8) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused9) {
                    fileLockLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLockLock = null;
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused10) {
                }
            }
        } catch (Exception unused11) {
            fileLockLock = null;
            randomAccessFile = null;
        } catch (Throwable th4) {
            th = th4;
            fileLockLock = null;
            randomAccessFile = null;
        }
    }

    @Override // defpackage.dqe
    public final void log(String str) {
        log(str, null);
    }

    @Override // defpackage.dqe
    public final void log(String str, Throwable th) {
        this.c.post(new fps(this, str, th));
    }
}
