package com.huawei.openalliance.ad;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes12.dex */
public final class hv extends hu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f18929b;

    @Override // com.huawei.openalliance.ad.ib
    public void a(id idVar, int i, String str) throws Throwable {
        if (idVar == null) {
            return;
        }
        a(idVar.a() + idVar.b());
        if (this.f18928a != null) {
            this.f18928a.a(idVar, i, str);
        }
    }

    @Override // com.huawei.openalliance.ad.ib
    public ib a(String str, String str2) {
        String str3;
        if (str2 == null || str2.isEmpty()) {
            Log.e("FileLogNode", "Failed to initialize the file logger, parameter error.");
            return this;
        }
        if (this.f18929b == null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    File canonicalFile = new File(str, "Log").getCanonicalFile();
                    if (canonicalFile.isDirectory() || com.huawei.openalliance.ad.utils.ai.g(canonicalFile)) {
                        File file = new File(canonicalFile, str2 + ".log");
                        this.f18929b = file;
                        file.setReadable(true);
                        this.f18929b.setWritable(true);
                        this.f18929b.setExecutable(false, false);
                        return this;
                    }
                }
            } catch (IOException unused) {
                str3 = "file path error. ioex";
                Log.e("FileLogNode", str3);
            } catch (Throwable th) {
                str3 = "file path error. " + th.getClass().getSimpleName();
                Log.e("FileLogNode", str3);
            }
        }
        Log.w("FileLogNode", "the file logger has been created already.");
        return this;
    }

    private void c(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        OutputStreamWriter outputStreamWriter = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(this.f18929b, true);
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    try {
                        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(bufferedOutputStream, "UTF-8");
                        try {
                            outputStreamWriter2.write(str);
                            outputStreamWriter2.flush();
                            a(outputStreamWriter2);
                        } catch (FileNotFoundException | IOException unused) {
                            outputStreamWriter = outputStreamWriter2;
                            Log.w("FileLogNode", "Exception when writing the log file.");
                            a(outputStreamWriter);
                        } catch (Throwable th) {
                            th = th;
                            outputStreamWriter = outputStreamWriter2;
                            a(outputStreamWriter);
                            a(bufferedOutputStream);
                            a(fileOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException | IOException unused2) {
                    }
                } catch (FileNotFoundException | IOException unused3) {
                    bufferedOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream;
                outputStreamWriter = outputStreamWriter;
            }
        } catch (FileNotFoundException | IOException unused4) {
            fileOutputStream = null;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            bufferedOutputStream = null;
        }
        a(bufferedOutputStream);
        a(fileOutputStream);
    }

    private boolean b(String str) {
        String str2;
        if (this.f18929b.length() + ((long) str.length()) <= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED) {
            return true;
        }
        File file = new File(this.f18929b.getPath() + ".bak");
        if (file.exists() && !file.delete()) {
            str2 = "Cannot rename log file to bak.";
        } else {
            if (this.f18929b.renameTo(file)) {
                return true;
            }
            str2 = "Failed to backup the log file.";
        }
        Log.w("FileLogNode", str2);
        return false;
    }

    private void a(String str) throws Throwable {
        if (str == null || this.f18929b == null) {
            return;
        }
        String str2 = str + '\n';
        if (b(str2)) {
            c(str2);
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.w("FileLogNode", "Exception when closing the closeable.");
            }
        }
    }

    public static ib a() {
        return new hz(new hv());
    }

    private hv() {
    }
}
