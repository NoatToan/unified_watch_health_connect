package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.openplatform.abl.log.a;
import com.huawei.openplatform.abl.log.i;
import com.huawei.openplatform.abl.log.util.c;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes12.dex */
public final class ohj extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f44321c;

    @Override // com.huawei.openplatform.abl.log.i
    public void a(ohn ohnVar, int i, String str) throws Throwable {
        if (ohnVar == null) {
            return;
        }
        c(ohnVar.d() + ohnVar.c());
        i iVar = this.f21530a;
        if (iVar != null) {
            iVar.a(ohnVar, i, str);
        }
    }

    @Override // com.huawei.openplatform.abl.log.i
    public i a(String str, String str2) {
        String str3;
        if (str2 == null || str2.isEmpty()) {
            Log.e("FileLogNode", "Failed to initialize the file logger, parameter error.");
            return this;
        }
        if (this.f44321c == null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    File canonicalFile = new File(str, "Log").getCanonicalFile();
                    if (canonicalFile.isDirectory() || c.d(canonicalFile)) {
                        File file = new File(canonicalFile, str2 + ".log");
                        this.f44321c = file;
                        file.setReadable(true);
                        this.f44321c.setWritable(true);
                        this.f44321c.setExecutable(false, false);
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

    private void b(String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        OutputStreamWriter outputStreamWriter3;
        FileOutputStream fileOutputStream2 = null;
        outputStreamWriter = null;
        outputStreamWriter = null;
        OutputStreamWriter outputStreamWriter4 = null;
        OutputStreamWriter outputStreamWriter5 = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        try {
            fileOutputStream = new FileOutputStream(this.f44321c, true);
            try {
                bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                try {
                    outputStreamWriter3 = new OutputStreamWriter(bufferedOutputStream2, "UTF-8");
                    try {
                        outputStreamWriter3.write(str);
                        outputStreamWriter3.flush();
                    } catch (FileNotFoundException | IOException unused) {
                        outputStreamWriter4 = outputStreamWriter3;
                        outputStreamWriter2 = outputStreamWriter4;
                        bufferedOutputStream3 = bufferedOutputStream2;
                        try {
                            Log.w("FileLogNode", "Exception when writing the log file.");
                            outputStreamWriter3 = outputStreamWriter2;
                            bufferedOutputStream2 = bufferedOutputStream3;
                        } catch (Throwable th) {
                            outputStreamWriter = outputStreamWriter2;
                            th = th;
                            FileOutputStream fileOutputStream3 = fileOutputStream;
                            bufferedOutputStream = bufferedOutputStream3;
                            fileOutputStream2 = fileOutputStream3;
                            BufferedOutputStream bufferedOutputStream4 = bufferedOutputStream;
                            fileOutputStream = fileOutputStream2;
                            outputStreamWriter5 = outputStreamWriter;
                            bufferedOutputStream2 = bufferedOutputStream4;
                            c(outputStreamWriter5);
                            c(bufferedOutputStream2);
                            c(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStreamWriter5 = outputStreamWriter3;
                        c(outputStreamWriter5);
                        c(bufferedOutputStream2);
                        c(fileOutputStream);
                        throw th;
                    }
                } catch (FileNotFoundException | IOException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException | IOException unused3) {
                bufferedOutputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream2 = null;
            }
        } catch (FileNotFoundException | IOException unused4) {
            outputStreamWriter2 = null;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            outputStreamWriter = null;
            BufferedOutputStream bufferedOutputStream5 = bufferedOutputStream;
            fileOutputStream = fileOutputStream2;
            outputStreamWriter5 = outputStreamWriter;
            bufferedOutputStream2 = bufferedOutputStream5;
            c(outputStreamWriter5);
            c(bufferedOutputStream2);
            c(fileOutputStream);
            throw th;
        }
        c(outputStreamWriter3);
        c(bufferedOutputStream2);
        c(fileOutputStream);
    }

    private void c(String str) throws Throwable {
        if (str == null || this.f44321c == null) {
            return;
        }
        String str2 = str + '\n';
        if (e(str2)) {
            b(str2);
        }
    }

    private boolean e(String str) {
        String str2;
        if (this.f44321c.length() + ((long) str.length()) <= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED) {
            return true;
        }
        File file = new File(this.f44321c.getPath() + ".bak");
        if (file.exists() && !file.delete()) {
            str2 = "Cannot rename log file to bak.";
        } else {
            if (this.f44321c.renameTo(file)) {
                return true;
            }
            str2 = "Failed to backup the log file.";
        }
        Log.w("FileLogNode", str2);
        return false;
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.w("FileLogNode", "Exception when closing the closeable.");
            }
        }
    }

    public static i e() {
        return new ohq(new ohj());
    }

    private ohj() {
    }
}
