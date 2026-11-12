package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Constants;
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

/* JADX INFO: loaded from: classes22.dex */
public class ar implements LoggerInterface {
    private static volatile ar h;
    private String b;
    private Context c;
    private String d = "";
    private Handler e;
    private static final SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");
    public static String a = "/MiPushLog";
    private static List<Pair<String, Throwable>> g = Collections.synchronizedList(new ArrayList());

    private ar(Context context) {
        this.c = context;
        if (context.getApplicationContext() != null) {
            this.c = context.getApplicationContext();
        }
        this.b = this.c.getPackageName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }

    public static ar a(Context context) {
        if (h == null) {
            synchronized (ar.class) {
                if (h == null) {
                    h = new ar(context);
                }
            }
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        File externalFilesDir;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                if (TextUtils.isEmpty(this.d) && (externalFilesDir = this.c.getExternalFilesDir(null)) != null) {
                    this.d = externalFilesDir.getAbsolutePath() + "";
                }
                File file = new File(this.d + a);
                if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
                    Log.w(this.b, "Create mipushlog directory fail.");
                    return;
                }
                File file2 = new File(file, "log.lock");
                if (!file2.exists() || file2.isDirectory()) {
                    file2.createNewFile();
                }
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                            while (!g.isEmpty()) {
                                try {
                                    Pair<String, Throwable> pairRemove = g.remove(0);
                                    String str = (String) pairRemove.first;
                                    if (pairRemove.second != null) {
                                        str = (str + "\n") + Log.getStackTraceString((Throwable) pairRemove.second);
                                    }
                                    bufferedWriter2.write(str + "\n");
                                } catch (Exception e) {
                                    e = e;
                                    bufferedWriter = bufferedWriter2;
                                    Log.e(this.b, "", e);
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e2) {
                                            Log.e(this.b, "", e2);
                                        }
                                    }
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e3) {
                                            Log.e(this.b, "", e3);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        return;
                                    } else {
                                        randomAccessFile.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedWriter = bufferedWriter2;
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e4) {
                                            Log.e(this.b, "", e4);
                                        }
                                    }
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e5) {
                                            Log.e(this.b, "", e5);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        throw th;
                                    }
                                    try {
                                        randomAccessFile.close();
                                        throw th;
                                    } catch (IOException e6) {
                                        Log.e(this.b, "", e6);
                                        throw th;
                                    }
                                }
                            }
                            bufferedWriter2.flush();
                            bufferedWriter2.close();
                            File file3 = new File(file, "log1.txt");
                            if (file3.length() >= 1048576) {
                                File file4 = new File(file, "log0.txt");
                                if (file4.exists() && file4.isFile()) {
                                    file4.delete();
                                }
                                file3.renameTo(file4);
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e7) {
                                    Log.e(this.b, "", e7);
                                }
                            }
                            randomAccessFile.close();
                        } catch (Exception e8) {
                            e = e8;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e9) {
                    e = e9;
                    fileLockLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLockLock = null;
                }
            } catch (IOException e10) {
                Log.e(this.b, "", e10);
            }
        } catch (Exception e11) {
            e = e11;
            fileLockLock = null;
            randomAccessFile = null;
        } catch (Throwable th4) {
            th = th4;
            fileLockLock = null;
            randomAccessFile = null;
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str) {
        log(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str, Throwable th) {
        this.e.post(new a0(this, str, th));
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void setTag(String str) {
        this.b = str;
    }
}
